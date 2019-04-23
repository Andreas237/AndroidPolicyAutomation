// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnv

public final class bld
{

	public bld(String s, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		String s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          6
		if(s == null)
	//*   4    7:aload_1         
	//*   5    8:ifnonnull       15
			s1 = "";
	//    6   11:ldc1            #18  <String "">
	//    7   13:astore          6
		c = s1;
	//    8   15:aload_0         
	//    9   16:aload           6
	//   10   18:putfield        #20  <Field String c>
		a = l;
	//   11   21:aload_0         
	//   12   22:lload_2         
	//   13   23:putfield        #22  <Field long a>
		b = l1;
	//   14   26:aload_0         
	//   15   27:lload           4
	//   16   29:putfield        #24  <Field long b>
	//   17   32:return          
	}

	private final String b(String s)
	{
		return bnv.a(s, c);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field String c>
	//    3    5:invokestatic    #31  <Method String bnv.a(String, String)>
	//    4    8:areturn         
	}

	public final Uri a(String s)
	{
		return Uri.parse(bnv.a(s, c));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field String c>
	//    3    5:invokestatic    #31  <Method String bnv.a(String, String)>
	//    4    8:invokestatic    #37  <Method Uri Uri.parse(String)>
	//    5   11:areturn         
	}

	public final bld a(bld bld1, String s)
	{
		String s1 = b(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #40  <Method String b(String)>
	//    3    5:astore          11
		if(bld1 != null)
	//*   4    7:aload_1         
	//*   5    8:ifnull          174
		{
			if(!s1.equals(((Object) (bld1.b(s)))))
	//*   6   11:aload           11
	//*   7   13:aload_1         
	//*   8   14:aload_2         
	//*   9   15:invokespecial   #40  <Method String b(String)>
	//*  10   18:invokevirtual   #46  <Method boolean String.equals(Object)>
	//*  11   21:ifne            26
				return null;
	//   12   24:aconst_null     
	//   13   25:areturn         
			long l3 = b;
	//   14   26:aload_0         
	//   15   27:getfield        #24  <Field long b>
	//   16   30:lstore          7
			long l = -1L;
	//   17   32:ldc2w           #47  <Long -1L>
	//   18   35:lstore_3        
			if(l3 != -1L)
	//*  19   36:lload           7
	//*  20   38:ldc2w           #47  <Long -1L>
	//*  21   41:lcmp            
	//*  22   42:ifeq            101
			{
				long l1 = a;
	//   23   45:aload_0         
	//   24   46:getfield        #22  <Field long a>
	//   25   49:lstore          5
				if(l1 + l3 == bld1.a)
	//*  26   51:lload           5
	//*  27   53:lload           7
	//*  28   55:ladd            
	//*  29   56:aload_1         
	//*  30   57:getfield        #22  <Field long a>
	//*  31   60:lcmp            
	//*  32   61:ifne            101
				{
					long l4 = bld1.b;
	//   33   64:aload_1         
	//   34   65:getfield        #24  <Field long b>
	//   35   68:lstore          9
					if(l4 != -1L)
	//*  36   70:lload           9
	//*  37   72:ldc2w           #47  <Long -1L>
	//*  38   75:lcmp            
	//*  39   76:ifne            82
	//*  40   79:goto            88
						l = l3 + l4;
	//   41   82:lload           7
	//   42   84:lload           9
	//   43   86:ladd            
	//   44   87:lstore_3        
					return new bld(s1, l1, l);
	//   45   88:new             #2   <Class bld>
	//   46   91:dup             
	//   47   92:aload           11
	//   48   94:lload           5
	//   49   96:lload_3         
	//   50   97:invokespecial   #50  <Method void bld(String, long, long)>
	//   51  100:areturn         
				}
			}
			l3 = bld1.b;
	//   52  101:aload_1         
	//   53  102:getfield        #24  <Field long b>
	//   54  105:lstore          7
			if(l3 != -1L)
	//*  55  107:lload           7
	//*  56  109:ldc2w           #47  <Long -1L>
	//*  57  112:lcmp            
	//*  58  113:ifeq            172
			{
				long l2 = bld1.a;
	//   59  116:aload_1         
	//   60  117:getfield        #22  <Field long a>
	//   61  120:lstore          5
				if(l2 + l3 == a)
	//*  62  122:lload           5
	//*  63  124:lload           7
	//*  64  126:ladd            
	//*  65  127:aload_0         
	//*  66  128:getfield        #22  <Field long a>
	//*  67  131:lcmp            
	//*  68  132:ifne            172
				{
					long l5 = b;
	//   69  135:aload_0         
	//   70  136:getfield        #24  <Field long b>
	//   71  139:lstore          9
					if(l5 != -1L)
	//*  72  141:lload           9
	//*  73  143:ldc2w           #47  <Long -1L>
	//*  74  146:lcmp            
	//*  75  147:ifne            153
	//*  76  150:goto            159
						l = l3 + l5;
	//   77  153:lload           7
	//   78  155:lload           9
	//   79  157:ladd            
	//   80  158:lstore_3        
					return new bld(s1, l2, l);
	//   81  159:new             #2   <Class bld>
	//   82  162:dup             
	//   83  163:aload           11
	//   84  165:lload           5
	//   85  167:lload_3         
	//   86  168:invokespecial   #50  <Method void bld(String, long, long)>
	//   87  171:areturn         
				}
			}
			return null;
	//   88  172:aconst_null     
	//   89  173:areturn         
		} else
		{
			return null;
	//   90  174:aconst_null     
	//   91  175:areturn         
		}
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          71
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #54  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #54  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((bld)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class bld>
	//   16   28:astore_1        
			return a == ((bld) (obj)).a && b == ((bld) (obj)).b && c.equals(((Object) (((bld) (obj)).c)));
	//   17   29:aload_0         
	//   18   30:getfield        #22  <Field long a>
	//   19   33:aload_1         
	//   20   34:getfield        #22  <Field long a>
	//   21   37:lcmp            
	//   22   38:ifne            69
	//   23   41:aload_0         
	//   24   42:getfield        #24  <Field long b>
	//   25   45:aload_1         
	//   26   46:getfield        #24  <Field long b>
	//   27   49:lcmp            
	//   28   50:ifne            69
	//   29   53:aload_0         
	//   30   54:getfield        #20  <Field String c>
	//   31   57:aload_1         
	//   32   58:getfield        #20  <Field String c>
	//   33   61:invokevirtual   #46  <Method boolean String.equals(Object)>
	//   34   64:ifeq            69
	//   35   67:iconst_1        
	//   36   68:ireturn         
	//   37   69:iconst_0        
	//   38   70:ireturn         
		} else
		{
			return false;
	//   39   71:iconst_0        
	//   40   72:ireturn         
		}
	}

	public final int hashCode()
	{
		if(d == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field int d>
	//*   2    4:ifne            40
			d = (((int)a + 527) * 31 + (int)b) * 31 + c.hashCode();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field long a>
	//    6   12:l2i             
	//    7   13:sipush          527
	//    8   16:iadd            
	//    9   17:bipush          31
	//   10   19:imul            
	//   11   20:aload_0         
	//   12   21:getfield        #24  <Field long b>
	//   13   24:l2i             
	//   14   25:iadd            
	//   15   26:bipush          31
	//   16   28:imul            
	//   17   29:aload_0         
	//   18   30:getfield        #20  <Field String c>
	//   19   33:invokevirtual   #60  <Method int String.hashCode()>
	//   20   36:iadd            
	//   21   37:putfield        #58  <Field int d>
		return d;
	//   22   40:aload_0         
	//   23   41:getfield        #58  <Field int d>
	//   24   44:ireturn         
	}

	public final long a;
	public final long b;
	private final String c;
	private int d;
}
