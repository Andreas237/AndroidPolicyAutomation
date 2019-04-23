// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bxr, de, wx, yz, 
//			ys

final class yw
	implements bxr
{

	yw(ys ys, String s, yz yz1)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field String a>
		b = yz1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field yz b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void a(de de1)
	{
		String s = a;
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field String a>
	//    2    4:astore_2        
		de1 = ((de) (de1.toString()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #27  <Method String de.toString()>
	//    5    9:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 21 + String.valueOf(((Object) (de1))).length());
	//    6   10:new             #29  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:invokestatic    #35  <Method String String.valueOf(Object)>
	//   10   18:invokevirtual   #39  <Method int String.length()>
	//   11   21:bipush          21
	//   12   23:iadd            
	//   13   24:aload_1         
	//   14   25:invokestatic    #35  <Method String String.valueOf(Object)>
	//   15   28:invokevirtual   #39  <Method int String.length()>
	//   16   31:iadd            
	//   17   32:invokespecial   #42  <Method void StringBuilder(int)>
	//   18   35:astore_3        
		stringbuilder.append("Failed to load URL: ");
	//   19   36:aload_3         
	//   20   37:ldc1            #44  <String "Failed to load URL: ">
	//   21   39:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
		stringbuilder.append(s);
	//   23   43:aload_3         
	//   24   44:aload_2         
	//   25   45:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		stringbuilder.append("\n");
	//   27   49:aload_3         
	//   28   50:ldc1            #50  <String "\n">
	//   29   52:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(((String) (de1)));
	//   31   56:aload_3         
	//   32   57:aload_1         
	//   33   58:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
	//   34   61:pop             
		wx.e(stringbuilder.toString());
	//   35   62:aload_3         
	//   36   63:invokevirtual   #51  <Method String StringBuilder.toString()>
	//   37   66:invokestatic    #57  <Method void wx.e(String)>
		b.a(((Object) (null)));
	//   38   69:aload_0         
	//   39   70:getfield        #16  <Field yz b>
	//   40   73:aconst_null     
	//   41   74:invokevirtual   #62  <Method void yz.a(Object)>
	//   42   77:return          
	}

	private final String a;
	private final yz b;
}
