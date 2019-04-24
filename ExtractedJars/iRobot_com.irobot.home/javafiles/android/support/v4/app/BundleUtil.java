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
		if(!(aobj instanceof Bundle[]) && aobj != null)
	//*   4    6:aload_2         
	//*   5    7:instanceof      #19  <Class Bundle[]>
	//*   6   10:ifne            40
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       20
	//*   9   17:goto            40
		{
			aobj = ((Object []) ((Bundle[])Arrays.copyOf(aobj, aobj.length, [Landroid/os/Bundle;)));
	//   10   20:aload_2         
	//   11   21:aload_2         
	//   12   22:arraylength     
	//   13   23:ldc1            #19  <Class Bundle[]>
	//   14   25:invokestatic    #25  <Method Object[] Arrays.copyOf(Object[], int, Class)>
	//   15   28:checkcast       #19  <Class Bundle[]>
	//   16   31:astore_2        
			bundle.putParcelableArray(s, ((android.os.Parcelable []) (aobj)));
	//   17   32:aload_0         
	//   18   33:aload_1         
	//   19   34:aload_2         
	//   20   35:invokevirtual   #29  <Method void Bundle.putParcelableArray(String, android.os.Parcelable[])>
			return ((Bundle []) (aobj));
	//   21   38:aload_2         
	//   22   39:areturn         
		} else
		{
			return (Bundle[])aobj;
	//   23   40:aload_2         
	//   24   41:checkcast       #19  <Class Bundle[]>
	//   25   44:areturn         
		}
	}
}
