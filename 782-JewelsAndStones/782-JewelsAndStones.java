// Last updated: 8/11/2026, 2:18:43 PM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int num = 0;
		for (int i = 0 ; i < stones.length(); i ++) {
			if(jewels.indexOf(stones.charAt(i)) != -1) {
				num++;
			}
		}
		return num;
    }
}