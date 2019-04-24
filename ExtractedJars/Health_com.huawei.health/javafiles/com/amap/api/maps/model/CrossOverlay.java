// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps.model;

import android.graphics.Bitmap;
import com.autonavi.ae.gmap.gloverlay.CrossVectorOverlay;

// Referenced classes of package com.amap.api.maps.model:
//			CrossOverlayOptions

public class CrossOverlay
{
	public static interface GenerateCrossImageListener
	{

		public abstract void onGenerateComplete(Bitmap bitmap, int i);
	}


	public CrossOverlay(CrossOverlayOptions crossoverlayoptions, CrossVectorOverlay crossvectoroverlay)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field CrossVectorOverlay a>
		a = crossvectoroverlay;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #16  <Field CrossVectorOverlay a>
	//    8   14:return          
	}

	public void remove()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field CrossVectorOverlay a>
	//*   2    4:ifnull          20
			try
			{
				a.remove();
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field CrossVectorOverlay a>
	//    5   11:invokevirtual   #24  <Method void CrossVectorOverlay.remove()>
				return;
	//    6   14:return          
			}
			catch(Throwable throwable)
	//*   7   15:astore_1        
			{
				throwable.printStackTrace();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			}
	//   10   20:return          
	}

	public void setAttribute(com.autonavi.ae.gmap.gloverlay.GLCrossVector.AVectorCrossAttr avectorcrossattr)
	{
		try
		{
			a.setAttribute(avectorcrossattr);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field CrossVectorOverlay a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method void CrossVectorOverlay.setAttribute(com.autonavi.ae.gmap.gloverlay.GLCrossVector$AVectorCrossAttr)>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(com.autonavi.ae.gmap.gloverlay.GLCrossVector.AVectorCrossAttr avectorcrossattr)
	//*   5    9:astore_1        
		{
			((Throwable) (avectorcrossattr)).printStackTrace();
	//    6   10:aload_1         
	//    7   11:invokevirtual   #27  <Method void Throwable.printStackTrace()>
		}
	//    8   14:return          
	}

	public int setData(byte abyte0[])
	{
		if(abyte0 == null || a == null)
			break MISSING_BLOCK_LABEL_27;
	//    0    0:aload_1         
	//    1    1:ifnull          27
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field CrossVectorOverlay a>
	//    4    8:ifnull          27
		int i = a.setData(abyte0);
	//    5   11:aload_0         
	//    6   12:getfield        #16  <Field CrossVectorOverlay a>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #35  <Method int CrossVectorOverlay.setData(byte[])>
	//    9   19:istore_2        
		return i;
	//   10   20:iload_2         
	//   11   21:ireturn         
		abyte0;
	//   12   22:astore_1        
		((Throwable) (abyte0)).printStackTrace();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #27  <Method void Throwable.printStackTrace()>
		return -1;
	//   15   27:iconst_m1       
	//   16   28:ireturn         
	}

	public void setGenerateCrossImageListener(GenerateCrossImageListener generatecrossimagelistener)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field CrossVectorOverlay a>
	//*   2    4:ifnull          21
			try
			{
				a.setGenerateCrossImageListener(generatecrossimagelistener);
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field CrossVectorOverlay a>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #39  <Method void CrossVectorOverlay.setGenerateCrossImageListener(CrossOverlay$GenerateCrossImageListener)>
				return;
	//    7   15:return          
			}
			// Misplaced declaration of an exception variable
			catch(GenerateCrossImageListener generatecrossimagelistener)
	//*   8   16:astore_1        
			{
				((Throwable) (generatecrossimagelistener)).printStackTrace();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			}
	//   11   21:return          
	}

	public void setImageMode(boolean flag)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field CrossVectorOverlay a>
	//*   2    4:ifnull          21
			try
			{
				a.setImageMode(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field CrossVectorOverlay a>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #43  <Method void CrossVectorOverlay.setImageMode(boolean)>
				return;
	//    7   15:return          
			}
			catch(Throwable throwable)
	//*   8   16:astore_2        
			{
				throwable.printStackTrace();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			}
	//   11   21:return          
	}

	public void setVisible(boolean flag)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field CrossVectorOverlay a>
	//*   2    4:ifnull          21
			try
			{
				a.setVisible(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #16  <Field CrossVectorOverlay a>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #46  <Method void CrossVectorOverlay.setVisible(boolean)>
				return;
	//    7   15:return          
			}
			catch(Throwable throwable)
	//*   8   16:astore_2        
			{
				throwable.printStackTrace();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #27  <Method void Throwable.printStackTrace()>
			}
	//   11   21:return          
	}

	CrossVectorOverlay a;
}
