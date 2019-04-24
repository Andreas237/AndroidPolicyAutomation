// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzp;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zznk, zzkb, zzni, zzjj

final class zztx
{

	zztx(zzjj zzjj, String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		zzna zzna = zznk.zzaza;
	//    2    4:getstatic       #18  <Field zzna zznk.zzaza>
	//    3    7:astore          4
		mParams = zzp.zza((String)zzkb.zzik().zzd(zzna), zzjj, s, i, ((zzjn) (null)));
	//    4    9:aload_0         
	//    5   10:invokestatic    #24  <Method zzni zzkb.zzik()>
	//    6   13:aload           4
	//    7   15:invokevirtual   #30  <Method Object zzni.zzd(zzna)>
	//    8   18:checkcast       #32  <Class String>
	//    9   21:aload_1         
	//   10   22:aload_2         
	//   11   23:iload_3         
	//   12   24:aconst_null     
	//   13   25:invokestatic    #38  <Method Object[] zzp.zza(String, zzjj, String, int, zzjn)>
	//   14   28:putfield        #40  <Field Object[] mParams>
	//   15   31:return          
	}

	public final boolean equals(Object obj)
	{
		if(!(obj instanceof zztx))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class zztx>
	//*   2    4:ifne            9
		{
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		} else
		{
			obj = ((Object) ((zztx)obj));
	//    5    9:aload_1         
	//    6   10:checkcast       #2   <Class zztx>
	//    7   13:astore_1        
			return Arrays.equals(mParams, ((zztx) (obj)).mParams);
	//    8   14:aload_0         
	//    9   15:getfield        #40  <Field Object[] mParams>
	//   10   18:aload_1         
	//   11   19:getfield        #40  <Field Object[] mParams>
	//   12   22:invokestatic    #48  <Method boolean Arrays.equals(Object[], Object[])>
	//   13   25:ireturn         
		}
	}

	public final int hashCode()
	{
		return Arrays.hashCode(mParams);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Object[] mParams>
	//    2    4:invokestatic    #53  <Method int Arrays.hashCode(Object[])>
	//    3    7:ireturn         
	}

	public final String toString()
	{
		String s = Arrays.toString(mParams);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Object[] mParams>
	//    2    4:invokestatic    #58  <Method String Arrays.toString(Object[])>
	//    3    7:astore_1        
		StringBuilder stringbuilder = new StringBuilder(24 + String.valueOf(((Object) (s))).length());
	//    4    8:new             #60  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:bipush          24
	//    7   14:aload_1         
	//    8   15:invokestatic    #64  <Method String String.valueOf(Object)>
	//    9   18:invokevirtual   #67  <Method int String.length()>
	//   10   21:iadd            
	//   11   22:invokespecial   #70  <Method void StringBuilder(int)>
	//   12   25:astore_2        
		stringbuilder.append("[InterstitialAdPoolKey ");
	//   13   26:aload_2         
	//   14   27:ldc1            #72  <String "[InterstitialAdPoolKey ">
	//   15   29:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(s);
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		stringbuilder.append("]");
	//   21   39:aload_2         
	//   22   40:ldc1            #78  <String "]">
	//   23   42:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		return stringbuilder.toString();
	//   25   46:aload_2         
	//   26   47:invokevirtual   #80  <Method String StringBuilder.toString()>
	//   27   50:areturn         
	}

	private final Object mParams[];
}
