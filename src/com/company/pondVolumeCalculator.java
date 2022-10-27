package com.company;

public class pondVolumeCalculator
{
    public static int getFinalVolume(int[] columnHeightArray, int leftPillarIndex, int rightPillarIndex)
    {
        int maxPillarHeight = Math.min(columnHeightArray[leftPillarIndex], columnHeightArray[rightPillarIndex]);

        // Calculate volume

        int finalVolume = 0;
        for (int count = leftPillarIndex + 1; count < rightPillarIndex; count++)
        {
            finalVolume = finalVolume + (maxPillarHeight - columnHeightArray[count]);
        }
        return finalVolume;
    }
}
