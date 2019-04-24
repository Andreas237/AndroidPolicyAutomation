// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package com.amap.api.mapcore.util:
//			kh, gt, gz, hk

public class ke extends kh
{

	public ke(Context context, boolean flag, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void kh()>
		b = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Context b>
		c = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #20  <Field boolean c>
		d = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #22  <Field int d>
		e = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #24  <Field int e>
	//   14   25:return          
	}

	public void a(int i)
	{
		if(gt.p(b) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Context b>
	//*   2    4:invokestatic    #33  <Method int gt.p(Context)>
	//*   3    7:iconst_1        
	//*   4    8:icmpne          12
			return;
	//    5   11:return          
		String s = gz.a(System.currentTimeMillis(), "yyyyMMdd");
	//    6   12:invokestatic    #39  <Method long System.currentTimeMillis()>
	//    7   15:ldc1            #41  <String "yyyyMMdd">
	//    8   17:invokestatic    #46  <Method String gz.a(long, String)>
	//    9   20:astore_3        
		String s1 = hk.a(b, "iKey");
	//   10   21:aload_0         
	//   11   22:getfield        #18  <Field Context b>
	//   12   25:ldc1            #48  <String "iKey">
	//   13   27:invokestatic    #53  <Method String hk.a(Context, String)>
	//   14   30:astore          4
		int j;
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*  15   32:aload           4
	//*  16   34:invokestatic    #59  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  17   37:ifeq            45
		{
			j = i;
	//   18   40:iload_1         
	//   19   41:istore_2        
		} else
	//*  20   42:goto            103
		{
			String as[] = s1.split("\\|");
	//   21   45:aload           4
	//   22   47:ldc1            #61  <String "\\|">
	//   23   49:invokevirtual   #67  <Method String[] String.split(String)>
	//   24   52:astore          4
			if(as == null || as.length < 2)
	//*  25   54:aload           4
	//*  26   56:ifnull          66
	//*  27   59:aload           4
	//*  28   61:arraylength     
	//*  29   62:iconst_2        
	//*  30   63:icmpge          80
			{
				hk.b(b, "iKey");
	//   31   66:aload_0         
	//   32   67:getfield        #18  <Field Context b>
	//   33   70:ldc1            #48  <String "iKey">
	//   34   72:invokestatic    #70  <Method void hk.b(Context, String)>
				j = i;
	//   35   75:iload_1         
	//   36   76:istore_2        
			} else
	//*  37   77:goto            103
			{
				j = i;
	//   38   80:iload_1         
	//   39   81:istore_2        
				if(s.equals(((Object) (as[0]))))
	//*  40   82:aload_3         
	//*  41   83:aload           4
	//*  42   85:iconst_0        
	//*  43   86:aaload          
	//*  44   87:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  45   90:ifeq            103
					j = i + Integer.parseInt(as[1]);
	//   46   93:iload_1         
	//   47   94:aload           4
	//   48   96:iconst_1        
	//   49   97:aaload          
	//   50   98:invokestatic    #80  <Method int Integer.parseInt(String)>
	//   51  101:iadd            
	//   52  102:istore_2        
			}
		}
		hk.a(b, "iKey", (new StringBuilder()).append(s).append("|").append(j).toString());
	//   53  103:aload_0         
	//   54  104:getfield        #18  <Field Context b>
	//   55  107:ldc1            #48  <String "iKey">
	//   56  109:new             #82  <Class StringBuilder>
	//   57  112:dup             
	//   58  113:invokespecial   #83  <Method void StringBuilder()>
	//   59  116:aload_3         
	//   60  117:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   61  120:ldc1            #89  <String "|">
	//   62  122:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   63  125:iload_2         
	//   64  126:invokevirtual   #92  <Method StringBuilder StringBuilder.append(int)>
	//   65  129:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   66  132:invokestatic    #99  <Method void hk.a(Context, String, String)>
	//   67  135:return          
	}

	protected boolean a()
	{
		if(gt.p(b) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Context b>
	//*   2    4:invokestatic    #33  <Method int gt.p(Context)>
	//*   3    7:iconst_1        
	//*   4    8:icmpne          13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
		if(!c)
	//*   7   13:aload_0         
	//*   8   14:getfield        #20  <Field boolean c>
	//*   9   17:ifne            22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		String s = hk.a(b, "iKey");
	//   12   22:aload_0         
	//   13   23:getfield        #18  <Field Context b>
	//   14   26:ldc1            #48  <String "iKey">
	//   15   28:invokestatic    #53  <Method String hk.a(Context, String)>
	//   16   31:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  17   32:aload_1         
	//*  18   33:invokestatic    #59  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  19   36:ifeq            41
			return true;
	//   20   39:iconst_1        
	//   21   40:ireturn         
		String as[] = s.split("\\|");
	//   22   41:aload_1         
	//   23   42:ldc1            #61  <String "\\|">
	//   24   44:invokevirtual   #67  <Method String[] String.split(String)>
	//   25   47:astore_1        
		if(as == null || as.length < 2)
	//*  26   48:aload_1         
	//*  27   49:ifnull          58
	//*  28   52:aload_1         
	//*  29   53:arraylength     
	//*  30   54:iconst_2        
	//*  31   55:icmpge          69
		{
			hk.b(b, "iKey");
	//   32   58:aload_0         
	//   33   59:getfield        #18  <Field Context b>
	//   34   62:ldc1            #48  <String "iKey">
	//   35   64:invokestatic    #70  <Method void hk.b(Context, String)>
			return true;
	//   36   67:iconst_1        
	//   37   68:ireturn         
		}
		String s1 = as[0];
	//   38   69:aload_1         
	//   39   70:iconst_0        
	//   40   71:aaload          
	//   41   72:astore_2        
		if(gz.a(System.currentTimeMillis(), "yyyyMMdd").equals(((Object) (s1))))
	//*  42   73:invokestatic    #39  <Method long System.currentTimeMillis()>
	//*  43   76:ldc1            #41  <String "yyyyMMdd">
	//*  44   78:invokestatic    #46  <Method String gz.a(long, String)>
	//*  45   81:aload_2         
	//*  46   82:invokevirtual   #74  <Method boolean String.equals(Object)>
	//*  47   85:ifeq            105
			return Integer.parseInt(as[1]) < e;
	//   48   88:aload_1         
	//   49   89:iconst_1        
	//   50   90:aaload          
	//   51   91:invokestatic    #80  <Method int Integer.parseInt(String)>
	//   52   94:aload_0         
	//   53   95:getfield        #24  <Field int e>
	//   54   98:icmplt          103
	//   55  101:iconst_0        
	//   56  102:ireturn         
	//   57  103:iconst_1        
	//   58  104:ireturn         
		else
			return true;
	//   59  105:iconst_1        
	//   60  106:ireturn         
	}

	public int b()
	{
		int i;
		if(gt.p(b) == 1 || d <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Context b>
	//*   2    4:invokestatic    #33  <Method int gt.p(Context)>
	//*   3    7:iconst_1        
	//*   4    8:icmpeq          18
	//*   5   11:aload_0         
	//*   6   12:getfield        #22  <Field int d>
	//*   7   15:ifgt            24
			i = 0x7fffffff;
	//    8   18:ldc1            #102 <Int 0x7fffffff>
	//    9   20:istore_1        
		else
	//*  10   21:goto            29
			i = d;
	//   11   24:aload_0         
	//   12   25:getfield        #22  <Field int d>
	//   13   28:istore_1        
		if(a != null)
	//*  14   29:aload_0         
	//*  15   30:getfield        #105 <Field kh a>
	//*  16   33:ifnull          48
			return Math.max(i, a.b());
	//   17   36:iload_1         
	//   18   37:aload_0         
	//   19   38:getfield        #105 <Field kh a>
	//   20   41:invokevirtual   #107 <Method int kh.b()>
	//   21   44:invokestatic    #113 <Method int Math.max(int, int)>
	//   22   47:ireturn         
		else
			return i;
	//   23   48:iload_1         
	//   24   49:ireturn         
	}

	private Context b;
	private boolean c;
	private int d;
	private int e;
}
