int compare(const void* a, const void* b)
{
    int l=*(int*)a;
    int p=*(int*)b;
    return (l-p);
}

bool containsDuplicate(int* nums, int numsSize) {
    qsort(nums,numsSize,sizeof(int),compare);
    
    for(int i=0;i<numsSize-1;i++)
    {
        if(nums[i]==nums[i+1])
        {
            return true;
        }
       // printf("%d==%d\n",nums[i],nums[i+1]);
    }
    return false;
}