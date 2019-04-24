// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.ae.gmap.gloverlay;


public class GLOverlayTexture
{

	public GLOverlayTexture(int i, int j, float f, float f1, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mResId = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field int mResId>
		mResId = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #21  <Field int mResId>
		mWidth = k;
	//    8   14:aload_0         
	//    9   15:iload           5
	//   10   17:putfield        #23  <Field int mWidth>
		mHeight = l;
	//   11   20:aload_0         
	//   12   21:iload           6
	//   13   23:putfield        #25  <Field int mHeight>
		mResWidth = k;
	//   14   26:aload_0         
	//   15   27:iload           5
	//   16   29:putfield        #27  <Field int mResWidth>
		mResHeight = l;
	//   17   32:aload_0         
	//   18   33:iload           6
	//   19   35:putfield        #29  <Field int mResHeight>
		mAnchor = j;
	//   20   38:aload_0         
	//   21   39:iload_2         
	//   22   40:putfield        #31  <Field int mAnchor>
		mAnchorXRatio = f;
	//   23   43:aload_0         
	//   24   44:fload_3         
	//   25   45:putfield        #33  <Field float mAnchorXRatio>
		mAnchorYRatio = f1;
	//   26   48:aload_0         
	//   27   49:fload           4
	//   28   51:putfield        #35  <Field float mAnchorYRatio>
	//   29   54:return          
	}

	public GLOverlayTexture(int i, int j, int k, int l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		mResId = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #21  <Field int mResId>
		mResId = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #21  <Field int mResId>
		mWidth = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #23  <Field int mWidth>
		mHeight = l;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #25  <Field int mHeight>
		mResWidth = k;
	//   14   25:aload_0         
	//   15   26:iload_3         
	//   16   27:putfield        #27  <Field int mResWidth>
		mResHeight = l;
	//   17   30:aload_0         
	//   18   31:iload           4
	//   19   33:putfield        #29  <Field int mResHeight>
		mAnchor = j;
	//   20   36:aload_0         
	//   21   37:iload_2         
	//   22   38:putfield        #31  <Field int mAnchor>
	//   23   41:return          
	}

	public int mAnchor;
	public float mAnchorXRatio;
	public float mAnchorYRatio;
	public int mHeight;
	public int mResHeight;
	public int mResId;
	public int mResWidth;
	public int mWidth;
}
