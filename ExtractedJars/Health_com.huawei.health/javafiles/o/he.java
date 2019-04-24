// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.text.TextUtils;

public final class he extends Enum
{

	private he(String s, int i, String s1)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #43  <Method void Enum(String, int)>
		c = s1;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #45  <Field String c>
	//    7   11:return          
	}

	public static he a(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #54  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            11
			return a;
	//    3    7:getstatic       #25  <Field he a>
	//    4   10:areturn         
		he he1 = a;
	//    5   11:getstatic       #25  <Field he a>
	//    6   14:astore_3        
		he ahe[] = values();
	//    7   15:invokestatic    #58  <Method he[] values()>
	//    8   18:astore          4
		int j = ahe.length;
	//    9   20:aload           4
	//   10   22:arraylength     
	//   11   23:istore_2        
		for(int i = 0; i < j; i++)
	//*  12   24:iconst_0        
	//*  13   25:istore_1        
	//*  14   26:iload_1         
	//*  15   27:iload_2         
	//*  16   28:icmpge          59
		{
			he he2 = ahe[i];
	//   17   31:aload           4
	//   18   33:iload_1         
	//   19   34:aaload          
	//   20   35:astore          5
			if(s.startsWith(he2.c))
	//*  21   37:aload_0         
	//*  22   38:aload           5
	//*  23   40:getfield        #45  <Field String c>
	//*  24   43:invokevirtual   #64  <Method boolean String.startsWith(String)>
	//*  25   46:ifeq            52
				return he2;
	//   26   49:aload           5
	//   27   51:areturn         
		}

	//   28   52:iload_1         
	//   29   53:iconst_1        
	//   30   54:iadd            
	//   31   55:istore_1        
	//*  32   56:goto            26
		return he1;
	//   33   59:aload_3         
	//   34   60:areturn         
	}

	public static he valueOf(String s)
	{
		return (he)Enum.valueOf(o/he, s);
	//    0    0:ldc1            #2   <Class he>
	//    1    2:aload_0         
	//    2    3:invokestatic    #68  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class he>
	//    4    9:areturn         
	}

	public static he[] values()
	{
		return (he[])((he []) (b)).clone();
	//    0    0:getstatic       #39  <Field he[] b>
	//    1    3:invokevirtual   #73  <Method Object _5B_Lo.he_3B_.clone()>
	//    2    6:checkcast       #69  <Class he[]>
	//    3    9:areturn         
	}

	public static final he a;
	private static final he b[];
	public static final he d;
	public static final he e;
	private String c;

	static 
	{
		a = new he("None", 0, "none");
	//    0    0:new             #2   <Class he>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "None">
	//    3    6:iconst_0        
	//    4    7:ldc1            #19  <String "none">
	//    5    9:invokespecial   #23  <Method void he(String, int, String)>
	//    6   12:putstatic       #25  <Field he a>
		d = new he("WapPay", 1, "js://wappay");
	//    7   15:new             #2   <Class he>
	//    8   18:dup             
	//    9   19:ldc1            #27  <String "WapPay">
	//   10   21:iconst_1        
	//   11   22:ldc1            #29  <String "js://wappay">
	//   12   24:invokespecial   #23  <Method void he(String, int, String)>
	//   13   27:putstatic       #31  <Field he d>
		e = new he("Update", 2, "js://update");
	//   14   30:new             #2   <Class he>
	//   15   33:dup             
	//   16   34:ldc1            #33  <String "Update">
	//   17   36:iconst_2        
	//   18   37:ldc1            #35  <String "js://update">
	//   19   39:invokespecial   #23  <Method void he(String, int, String)>
	//   20   42:putstatic       #37  <Field he e>
		b = (new he[] {
			a, d, e
		});
	//   21   45:iconst_3        
	//   22   46:anewarray       he[]
	//   23   49:dup             
	//   24   50:iconst_0        
	//   25   51:getstatic       #25  <Field he a>
	//   26   54:aastore         
	//   27   55:dup             
	//   28   56:iconst_1        
	//   29   57:getstatic       #31  <Field he d>
	//   30   60:aastore         
	//   31   61:dup             
	//   32   62:iconst_2        
	//   33   63:getstatic       #37  <Field he e>
	//   34   66:aastore         
	//   35   67:putstatic       #39  <Field he[] b>
	//*  36   70:return          
	}
}
