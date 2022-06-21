class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1,area,ov1,ov2;
        area1 = (Math.abs(ax2-ax1)*Math.abs(ay2-ay1)) + (Math.abs(bx2-bx1)*Math.abs(by2-by1));
        if(ax2<=bx1 || bx2<=ax1 || by2<=ay1 || ay2<=by1 )
            return area1;
        ov1 = Math.min(bx2,ax2) - Math.max(bx1,ax1);
        ov2 = Math.min(by2,ay2) - Math.max(by1,ay1);
        area= area1 - (ov1*ov2);
        return area;
    }
}