// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aza

public final class ayv extends aza
{

	public ayv(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void aza()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field String a>
	//    5    9:return          
	}

	public final void a(String s)
	{
		String s1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String a>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 1 + String.valueOf(((Object) (s))).length());
	//    3    5:new             #16  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokestatic    #22  <Method String String.valueOf(Object)>
	//    7   13:invokevirtual   #26  <Method int String.length()>
	//    8   16:iconst_1        
	//    9   17:iadd            
	//   10   18:aload_1         
	//   11   19:invokestatic    #22  <Method String String.valueOf(Object)>
	//   12   22:invokevirtual   #26  <Method int String.length()>
	//   13   25:iadd            
	//   14   26:invokespecial   #29  <Method void StringBuilder(int)>
	//   15   29:astore_3        
		stringbuilder.append(s1);
	//   16   30:aload_3         
	//   17   31:aload_2         
	//   18   32:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   19   35:pop             
		stringbuilder.append(":");
	//   20   36:aload_3         
	//   21   37:ldc1            #35  <String ":">
	//   22   39:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   23   42:pop             
		stringbuilder.append(s);
	//   24   43:aload_3         
	//   25   44:aload_1         
	//   26   45:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   27   48:pop             
		Log.d("isoparser", stringbuilder.toString());
	//   28   49:ldc1            #37  <String "isoparser">
	//   29   51:aload_3         
	//   30   52:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   31   55:invokestatic    #47  <Method int Log.d(String, String)>
	//   32   58:pop             
	//   33   59:return          
	}

	private String a;
}
