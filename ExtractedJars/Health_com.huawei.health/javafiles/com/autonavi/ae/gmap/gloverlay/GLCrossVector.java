// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.gloverlay;

import android.graphics.Rect;
import com.amap.api.mapcore.util.s;
import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.autonavi.ae.gmap.gloverlay:
//			GLOverlay

public class GLCrossVector extends GLOverlay
{
	public static class AVectorCrossAttr
	{

		public boolean dayMode;
		public int fArrowBorderWidth;
		public int fArrowLineWidth;
		public int stAreaColor;
		public Rect stAreaRect;
		public int stArrowBorderColor;
		public int stArrowLineColor;

		public AVectorCrossAttr()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			dayMode = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #23  <Field boolean dayMode>
		//    5    9:return          
		}
	}


	public GLCrossVector(int i, s s1, int j)
	{
		super(i, s1, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #11  <Method void GLOverlay(int, s, int)>
		if(s1 != null && s1.a() != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          40
	//*   7   11:aload_2         
	//*   8   12:invokeinterface #17  <Method GLMapEngine s.a()>
	//*   9   17:ifnull          40
			mNativeInstance = s1.a().createOverlay(i, GLOverlay.EAMapOverlayTpye.AMAPOVERLAY_VECTOR.ordinal());
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokeinterface #17  <Method GLMapEngine s.a()>
	//   13   27:iload_1         
	//   14   28:getstatic       #23  <Field GLOverlay$EAMapOverlayTpye GLOverlay$EAMapOverlayTpye.AMAPOVERLAY_VECTOR>
	//   15   31:invokevirtual   #27  <Method int GLOverlay$EAMapOverlayTpye.ordinal()>
	//   16   34:invokevirtual   #33  <Method long GLMapEngine.createOverlay(int, int)>
	//   17   37:putfield        #37  <Field long mNativeInstance>
	//   18   40:return          
	}

	private static native void nativeAddVectorCar(long l, int i, int j, int k);

	private static native int nativeAddVectorData(long l, int ai[], byte abyte0[]);

	private static native int nativeGetFBOTextureId(long l);

	private static native void nativeInitFBOTexture(long l, int i, int j);

	private static native void nativeSetArrowResId(long l, boolean flag, int i);

	private static native void nativeSetBackgroundResId(long l, int i);

	private static native void nativeSetCarResId(long l, int i);

	public void addVectorCar(int i, int j, int k)
	{
		nativeAddVectorCar(mNativeInstance, i, j, k);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long mNativeInstance>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokestatic    #55  <Method void nativeAddVectorCar(long, int, int, int)>
	//    6   10:return          
	}

	public int addVectorItem(AVectorCrossAttr avectorcrossattr, byte abyte0[], int i)
	{
		if(avectorcrossattr == null || abyte0 == null || i == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
	//*   2    4:aload_2         
	//*   3    5:ifnull          12
	//*   4    8:iload_3         
	//*   5    9:ifne            14
			return -1;
	//    6   12:iconst_m1       
	//    7   13:ireturn         
		int j = avectorcrossattr.stAreaRect.left;
	//    8   14:aload_1         
	//    9   15:getfield        #61  <Field Rect GLCrossVector$AVectorCrossAttr.stAreaRect>
	//   10   18:getfield        #67  <Field int Rect.left>
	//   11   21:istore          4
		int k = avectorcrossattr.stAreaRect.top;
	//   12   23:aload_1         
	//   13   24:getfield        #61  <Field Rect GLCrossVector$AVectorCrossAttr.stAreaRect>
	//   14   27:getfield        #70  <Field int Rect.top>
	//   15   30:istore          5
		int l = avectorcrossattr.stAreaRect.right;
	//   16   32:aload_1         
	//   17   33:getfield        #61  <Field Rect GLCrossVector$AVectorCrossAttr.stAreaRect>
	//   18   36:getfield        #73  <Field int Rect.right>
	//   19   39:istore          6
		int i1 = avectorcrossattr.stAreaRect.bottom;
	//   20   41:aload_1         
	//   21   42:getfield        #61  <Field Rect GLCrossVector$AVectorCrossAttr.stAreaRect>
	//   22   45:getfield        #76  <Field int Rect.bottom>
	//   23   48:istore          7
		int j1 = avectorcrossattr.stAreaColor;
	//   24   50:aload_1         
	//   25   51:getfield        #79  <Field int GLCrossVector$AVectorCrossAttr.stAreaColor>
	//   26   54:istore          8
		int k1 = avectorcrossattr.fArrowBorderWidth;
	//   27   56:aload_1         
	//   28   57:getfield        #82  <Field int GLCrossVector$AVectorCrossAttr.fArrowBorderWidth>
	//   29   60:istore          9
		int l1 = avectorcrossattr.stArrowBorderColor;
	//   30   62:aload_1         
	//   31   63:getfield        #85  <Field int GLCrossVector$AVectorCrossAttr.stArrowBorderColor>
	//   32   66:istore          10
		int i2 = avectorcrossattr.fArrowLineWidth;
	//   33   68:aload_1         
	//   34   69:getfield        #88  <Field int GLCrossVector$AVectorCrossAttr.fArrowLineWidth>
	//   35   72:istore          11
		int j2 = avectorcrossattr.stArrowLineColor;
	//   36   74:aload_1         
	//   37   75:getfield        #91  <Field int GLCrossVector$AVectorCrossAttr.stArrowLineColor>
	//   38   78:istore          12
		if(avectorcrossattr.dayMode)
	//*  39   80:aload_1         
	//*  40   81:getfield        #95  <Field boolean GLCrossVector$AVectorCrossAttr.dayMode>
	//*  41   84:ifeq            92
			i = 1;
	//   42   87:iconst_1        
	//   43   88:istore_3        
		else
	//*  44   89:goto            94
			i = 0;
	//   45   92:iconst_0        
	//   46   93:istore_3        
		return nativeAddVectorData(mNativeInstance, new int[] {
			j, k, l, i1, j1, k1, l1, i2, j2, i
		}, abyte0);
	//   47   94:aload_0         
	//   48   95:getfield        #37  <Field long mNativeInstance>
	//   49   98:bipush          10
	//   50  100:newarray        int[]
	//   51  102:dup             
	//   52  103:iconst_0        
	//   53  104:iload           4
	//   54  106:iastore         
	//   55  107:dup             
	//   56  108:iconst_1        
	//   57  109:iload           5
	//   58  111:iastore         
	//   59  112:dup             
	//   60  113:iconst_2        
	//   61  114:iload           6
	//   62  116:iastore         
	//   63  117:dup             
	//   64  118:iconst_3        
	//   65  119:iload           7
	//   66  121:iastore         
	//   67  122:dup             
	//   68  123:iconst_4        
	//   69  124:iload           8
	//   70  126:iastore         
	//   71  127:dup             
	//   72  128:iconst_5        
	//   73  129:iload           9
	//   74  131:iastore         
	//   75  132:dup             
	//   76  133:bipush          6
	//   77  135:iload           10
	//   78  137:iastore         
	//   79  138:dup             
	//   80  139:bipush          7
	//   81  141:iload           11
	//   82  143:iastore         
	//   83  144:dup             
	//   84  145:bipush          8
	//   85  147:iload           12
	//   86  149:iastore         
	//   87  150:dup             
	//   88  151:bipush          9
	//   89  153:iload_3         
	//   90  154:iastore         
	//   91  155:aload_2         
	//   92  156:invokestatic    #97  <Method int nativeAddVectorData(long, int[], byte[])>
	//   93  159:ireturn         
	}

	public void addVectorRemainDis(int i)
	{
	//    0    0:return          
	}

	public int getFBOTextureId()
	{
		return nativeGetFBOTextureId(mNativeInstance);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long mNativeInstance>
	//    2    4:invokestatic    #102 <Method int nativeGetFBOTextureId(long)>
	//    3    7:ireturn         
	}

	public void initFBOTexture(int i, int j)
	{
		nativeInitFBOTexture(mNativeInstance, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long mNativeInstance>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #106 <Method void nativeInitFBOTexture(long, int, int)>
	//    5    9:return          
	}

	public void setArrowResId(boolean flag, int i)
	{
		nativeSetArrowResId(mNativeInstance, flag, i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long mNativeInstance>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #110 <Method void nativeSetArrowResId(long, boolean, int)>
	//    5    9:return          
	}

	public void setBackgroundResId(int i)
	{
		nativeSetBackgroundResId(mNativeInstance, i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long mNativeInstance>
	//    2    4:iload_1         
	//    3    5:invokestatic    #113 <Method void nativeSetBackgroundResId(long, int)>
	//    4    8:return          
	}

	public void setCarResId(int i)
	{
		nativeSetCarResId(mNativeInstance, i);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long mNativeInstance>
	//    2    4:iload_1         
	//    3    5:invokestatic    #116 <Method void nativeSetCarResId(long, int)>
	//    4    8:return          
	}

	public void setRoadResId(boolean flag, int i)
	{
	//    0    0:return          
	}

	public void setSkyResId(boolean flag, int i)
	{
	//    0    0:return          
	}
}
