package com.company;

public class Engine {

    public static int pondVolumeEngine(int[] columnHeightArray)
    {
        System.out.println("-------------------------");
        System.out.println("New test run\n-------------------------");

        boolean potentialPond = false;
        int pondVolume = 0;
        int currentLeftWallHeight = 0;
        int currentWallHeight;
        int leftPillarIndex;

        for (int count = 0; count < columnHeightArray.length; count++)
        {
            currentWallHeight = columnHeightArray[count];

            if (count == 0 && currentWallHeight > 0)
                currentLeftWallHeight = currentWallHeight;

            if (currentWallHeight == currentLeftWallHeight && !potentialPond){
                continue;
            }

            // We have a potential left pillar here
            if (currentWallHeight > currentLeftWallHeight && !potentialPond)
            {
                currentLeftWallHeight = currentWallHeight;
            }

            if (currentWallHeight < currentLeftWallHeight)
            {
                potentialPond = true;

                //Find the highest wall to the right
                leftPillarIndex = count - 1;
                int rightHandPillarIndex = rightHandPillarFinder.getRightHandPillarIndex(columnHeightArray, leftPillarIndex);
                if (rightHandPillarIndex == -99){
                    continue;
                }

                pondVolume = pondVolume + pondVolumeCalculator.getFinalVolume(columnHeightArray, leftPillarIndex, rightHandPillarIndex);

                // Set up for the next iteration if that is in scope
                leftPillarIndex = rightHandPillarIndex;
                currentLeftWallHeight = columnHeightArray[leftPillarIndex];
                count = leftPillarIndex;
                potentialPond = false;
            }
        }
        return pondVolume;
    }
}
