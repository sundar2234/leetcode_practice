class Solution {
public:
    int maxDifference(string s) {
        unordered_map<char, int>Smap;
        // for(int i=0; s[i]!='\0'; i++){
        //     Smap[s[i]]++;
        // }

        for(auto it:s){
            Smap[it]++;
        }
        int odd = INT_MIN, even = INT_MAX ;
        // int ans = INT_MIN;

        for(auto it:Smap){
            if(it.second%2!=0){odd = max(odd, it.second);}
            else {even = min(even, it.second);}
            // int diff = odd - even;
            // cout<<diff<<endl;
            // ans = max(diff, ans);
        }
        return odd-even;
    }
};