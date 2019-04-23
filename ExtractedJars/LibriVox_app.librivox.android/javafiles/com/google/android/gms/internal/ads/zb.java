// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.Closeable;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ayr, aza, ayu, xz

public class zb extends ayr
	implements Closeable
{

	public zb(ayu ayu1, xz xz)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void ayr()>
		((ayr)this).a(ayu1, ayu1.a(), xz);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokeinterface #28  <Method long ayu.a()>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #31  <Method void ayr.a(ayu, long, xz)>
	//    8   16:return          
	}

	public void close()
	{
		b.close();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ayu b>
	//    2    4:invokeinterface #38  <Method void ayu.close()>
	//    3    9:return          
	}

	public String toString()
	{
		String s = ((Object) (b)).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ayu b>
	//    2    4:invokevirtual   #44  <Method String Object.toString()>
	//    3    7:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 7);
	//    4    8:new             #46  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokestatic    #52  <Method String String.valueOf(Object)>
	//    8   16:invokevirtual   #56  <Method int String.length()>
	//    9   19:bipush          7
	//   10   21:iadd            
	//   11   22:invokespecial   #59  <Method void StringBuilder(int)>
	//   12   25:astore_2        
		stringbuilder.append("model(");
	//   13   26:aload_2         
	//   14   27:ldc1            #61  <String "model(">
	//   15   29:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(s);
	//   17   33:aload_2         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		stringbuilder.append(")");
	//   21   39:aload_2         
	//   22   40:ldc1            #67  <String ")">
	//   23   42:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		return stringbuilder.toString();
	//   25   46:aload_2         
	//   26   47:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   27   50:areturn         
	}

	private static aza f = aza.a(com/google/android/gms/internal/ads/zb);

	static 
	{
	//    0    0:ldc1            #2   <Class zb>
	//    1    2:invokestatic    #16  <Method aza aza.a(Class)>
	//    2    5:putstatic       #18  <Field aza f>
	//*   3    8:return          
	}
}
