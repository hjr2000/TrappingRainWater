package com.company;

import java.util.ArrayList;

public class rightHandPillarFinder {

    public static int getRightHandPillarIndex(int[] columnHeightArray, int leftPillarIndex)
    {
        // This function is only called when we know for certain we're dealing with a potential 'pond'
        // So we have a left 'pillar', i.e. a column to the left that is higher than the adjacent column on the right, meaning that
        // if a right pillar is present, i.e. a column that is at least one unit higher than at least one lower preceding columns, then we have a 'pond'

        // We're already at the end of the array, nothing more to do.
        if (leftPillarIndex == columnHeightArray.length -1)
            return -99;

        int startIndex = leftPillarIndex + 1;
        int indexOfHighestColumn = -99;
        int highestColumnHeight = columnHeightArray[startIndex];

        for (int count = startIndex + 1; count < columnHeightArray.length; count++)
        {
            if (columnHeightArray[count] >= columnHeightArray[leftPillarIndex])
            {
                //We have our right-hand pillar, regardless of the heights of other further pillars to the right
                return count;
            }

            if (highestColumnHeight < columnHeightArray[count])
            {
                highestColumnHeight = columnHeightArray[count];
                indexOfHighestColumn = count;
            }
        }

        // will return -99 if no right-hand pillars are found
        return indexOfHighestColumn;

    }
}
