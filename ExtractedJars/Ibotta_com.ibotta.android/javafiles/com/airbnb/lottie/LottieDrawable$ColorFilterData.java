// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.ColorFilter;

// Referenced classes of package com.airbnb.lottie:
//			LottieDrawable

private static class LottieDrawable$ColorFilterData
{

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof LottieDrawable$ColorFilterData))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class LottieDrawable$ColorFilterData>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((LottieDrawable$ColorFilterData)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class LottieDrawable$ColorFilterData>
	//   12   20:astore_1        
		if(hashCode() != ((LottieDrawable$ColorFilterData) (obj)).hashCode())
	//*  13   21:aload_0         
	//*  14   22:invokevirtual   #19  <Method int hashCode()>
	//*  15   25:aload_1         
	//*  16   26:invokevirtual   #19  <Method int hashCode()>
	//*  17   29:icmpeq          34
			return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
		return colorFilter == ((LottieDrawable$ColorFilterData) (obj)).colorFilter;
	//   20   34:aload_0         
	//   21   35:getfield        #21  <Field ColorFilter colorFilter>
	//   22   38:aload_1         
	//   23   39:getfield        #21  <Field ColorFilter colorFilter>
	//   24   42:if_acmpeq       47
	//   25   45:iconst_0        
	//   26   46:ireturn         
	//   27   47:iconst_1        
	//   28   48:ireturn         
	}

	public int hashCode()
	{
		return 527 * layerName.hashCode() * 31 * contentName.hashCode();
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #24  <Field String layerName>
	//    3    7:invokevirtual   #27  <Method int String.hashCode()>
	//    4   10:imul            
	//    5   11:bipush          31
	//    6   13:imul            
	//    7   14:aload_0         
	//    8   15:getfield        #29  <Field String contentName>
	//    9   18:invokevirtual   #27  <Method int String.hashCode()>
	//   10   21:imul            
	//   11   22:ireturn         
	}

	final ColorFilter colorFilter;
	final String contentName;
	final String layerName;
}
