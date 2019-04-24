// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.identifier;


// Referenced classes of package com.google.android.gms.ads.identifier:
//			AdvertisingIdClient

public static final class AdvertisingIdClient$Info
{

	public String getId()
	{
		return zzsl;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String zzsl>
	//    2    4:areturn         
	}

	public boolean isLimitAdTrackingEnabled()
	{
		return zzsm;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field boolean zzsm>
	//    2    4:ireturn         
	}

	public String toString()
	{
		String s = zzsl;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String zzsl>
	//    2    4:astore_2        
		boolean flag = zzsm;
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field boolean zzsm>
	//    5    9:istore_1        
		return (new StringBuilder(String.valueOf(((Object) (s))).length() + 7)).append("{").append(s).append("}").append(flag).toString();
	//    6   10:new             #28  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokestatic    #34  <Method String String.valueOf(Object)>
	//   10   18:invokevirtual   #38  <Method int String.length()>
	//   11   21:bipush          7
	//   12   23:iadd            
	//   13   24:invokespecial   #41  <Method void StringBuilder(int)>
	//   14   27:ldc1            #43  <String "{">
	//   15   29:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:aload_2         
	//   17   33:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:ldc1            #49  <String "}">
	//   19   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:iload_1         
	//   21   42:invokevirtual   #52  <Method StringBuilder StringBuilder.append(boolean)>
	//   22   45:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   23   48:areturn         
	}

	private final String zzsl;
	private final boolean zzsm;

	public AdvertisingIdClient$Info(String s, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zzsl = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String zzsl>
		zzsm = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field boolean zzsm>
	//    8   14:return          
	}
}
