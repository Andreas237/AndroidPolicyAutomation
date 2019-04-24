// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import java.util.Arrays;

class BundleUtil
{

	BundleUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Bundle[] getBundleArrayFromBundle(Bundle bundle, String s)
	{
		Object aobj[] = ((Object []) (bundle.getParcelableArray(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #17  <Method android.os.Parcelable[] Bundle.getParcelableArray(String)>
	//    3    5:astore_2        
		if((aobj instanceof Bundle[]) || aobj == null)
	//*   4    6:aload_2         
	//*   5    7:instanceof      #19  <Class Bundle[]>
	//*   6   10:ifne            17
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       25
		{
			return (Bundle[])(Bundle[])aobj;
	//    9   17:aload_2         
	//   10   18:checkcast       #19  <Class Bundle[]>
	//   11   21:checkcast       #19  <Class Bundle[]>
	//   12   24:areturn         
		} else
		{
			aobj = ((Object []) ((Bundle[])Arrays.copyOf(aobj, aobj.length, [Landroid/os/Bundle;)));
	//   13   25:aload_2         
	//   14   26:aload_2         
	//   15   27:arraylength     
	//   16   28:ldc1            #19  <Class Bundle[]>
	//   17   30:invokestatic    #25  <Method Object[] Arrays.copyOf(Object[], int, Class)>
	//   18   33:checkcast       #19  <Class Bundle[]>
	//   19   36:astore_2        
			bundle.putParcelableArray(s, ((android.os.Parcelable []) (aobj)));
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:aload_2         
	//   23   40:invokevirtual   #29  <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
			return ((Bundle []) (aobj));
	//   24   43:aload_2         
	//   25   44:areturn         
		}
	}
}
