// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//			AdvertisingIdClient

public static final class AdvertisingIdClient$Info
{

	public final String getId()
	{
		return zzq;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String zzq>
	//    2    4:areturn         
	}

	public final boolean isLimitAdTrackingEnabled()
	{
		return zzr;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field boolean zzr>
	//    2    4:ireturn         
	}

	public final String toString()
	{
		String s = zzq;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String zzq>
	//    2    4:astore_2        
		boolean flag = zzr;
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field boolean zzr>
	//    5    9:istore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 7);
	//    6   10:new             #29  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokestatic    #35  <Method String String.valueOf(Object)>
	//   10   18:invokevirtual   #39  <Method int String.length()>
	//   11   21:bipush          7
	//   12   23:iadd            
	//   13   24:invokespecial   #42  <Method void StringBuilder(int)>
	//   14   27:astore_3        
		stringbuilder.append("{");
	//   15   28:aload_3         
	//   16   29:ldc1            #44  <String "{">
	//   17   31:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		stringbuilder.append(s);
	//   19   35:aload_3         
	//   20   36:aload_2         
	//   21   37:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
		stringbuilder.append("}");
	//   23   41:aload_3         
	//   24   42:ldc1            #50  <String "}">
	//   25   44:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
		stringbuilder.append(flag);
	//   27   48:aload_3         
	//   28   49:iload_1         
	//   29   50:invokevirtual   #53  <Method StringBuilder StringBuilder.append(boolean)>
	//   30   53:pop             
		return stringbuilder.toString();
	//   31   54:aload_3         
	//   32   55:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   33   58:areturn         
	}

	private final String zzq;
	private final boolean zzr;

	public AdvertisingIdClient$Info(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzq = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String zzq>
		zzr = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field boolean zzr>
	//    8   14:return          
	}
}
