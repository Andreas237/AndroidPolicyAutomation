// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;


public class FormatInfo
{

	public FormatInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		min = 0x80000000;
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <Int 0x80000000>
	//    4    7:putfield        #17  <Field int min>
		max = 0x7fffffff;
	//    5   10:aload_0         
	//    6   11:ldc1            #18  <Int 0x7fffffff>
	//    7   13:putfield        #20  <Field int max>
		leftPad = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #22  <Field boolean leftPad>
		leftTruncate = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #24  <Field boolean leftTruncate>
	//   14   26:return          
	}

	public FormatInfo(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		min = 0x80000000;
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <Int 0x80000000>
	//    4    7:putfield        #17  <Field int min>
		max = 0x7fffffff;
	//    5   10:aload_0         
	//    6   11:ldc1            #18  <Int 0x7fffffff>
	//    7   13:putfield        #20  <Field int max>
		leftPad = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #22  <Field boolean leftPad>
		leftTruncate = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #24  <Field boolean leftTruncate>
		min = i;
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:putfield        #17  <Field int min>
		max = j;
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:putfield        #20  <Field int max>
	//   20   36:return          
	}

	public FormatInfo(int i, int j, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		min = 0x80000000;
	//    2    4:aload_0         
	//    3    5:ldc1            #15  <Int 0x80000000>
	//    4    7:putfield        #17  <Field int min>
		max = 0x7fffffff;
	//    5   10:aload_0         
	//    6   11:ldc1            #18  <Int 0x7fffffff>
	//    7   13:putfield        #20  <Field int max>
		leftPad = true;
	//    8   16:aload_0         
	//    9   17:iconst_1        
	//   10   18:putfield        #22  <Field boolean leftPad>
		leftTruncate = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #24  <Field boolean leftTruncate>
		min = i;
	//   14   26:aload_0         
	//   15   27:iload_1         
	//   16   28:putfield        #17  <Field int min>
		max = j;
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:putfield        #20  <Field int max>
		leftPad = flag;
	//   20   36:aload_0         
	//   21   37:iload_3         
	//   22   38:putfield        #22  <Field boolean leftPad>
		leftTruncate = flag1;
	//   23   41:aload_0         
	//   24   42:iload           4
	//   25   44:putfield        #24  <Field boolean leftTruncate>
	//   26   47:return          
	}

	public static FormatInfo valueOf(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new NullPointerException("Argument cannot be null");
	//    2    4:new             #31  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #33  <String "Argument cannot be null">
	//    5   10:invokespecial   #36  <Method void NullPointerException(String)>
	//    6   13:athrow          
		FormatInfo formatinfo = new FormatInfo();
	//    7   14:new             #2   <Class FormatInfo>
	//    8   17:dup             
	//    9   18:invokespecial   #37  <Method void FormatInfo()>
	//   10   21:astore          4
		int i = s.indexOf('.');
	//   11   23:aload_0         
	//   12   24:bipush          46
	//   13   26:invokevirtual   #43  <Method int String.indexOf(int)>
	//   14   29:istore_1        
		String s1 = null;
	//   15   30:aconst_null     
	//   16   31:astore_3        
		Object obj = ((Object) (s));
	//   17   32:aload_0         
	//   18   33:astore_2        
		if(i != -1)
	//*  19   34:iload_1         
	//*  20   35:iconst_m1       
	//*  21   36:icmpeq          104
		{
			obj = ((Object) (s.substring(0, i)));
	//   22   39:aload_0         
	//   23   40:iconst_0        
	//   24   41:iload_1         
	//   25   42:invokevirtual   #47  <Method String String.substring(int, int)>
	//   26   45:astore_2        
			i++;
	//   27   46:iload_1         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:istore_1        
			if(i == s.length())
	//*  31   50:iload_1         
	//*  32   51:aload_0         
	//*  33   52:invokevirtual   #51  <Method int String.length()>
	//*  34   55:icmpne          98
			{
				obj = ((Object) (new StringBuilder()));
	//   35   58:new             #53  <Class StringBuilder>
	//   36   61:dup             
	//   37   62:invokespecial   #54  <Method void StringBuilder()>
	//   38   65:astore_2        
				((StringBuilder) (obj)).append("Formatting string [");
	//   39   66:aload_2         
	//   40   67:ldc1            #56  <String "Formatting string [">
	//   41   69:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   42   72:pop             
				((StringBuilder) (obj)).append(s);
	//   43   73:aload_2         
	//   44   74:aload_0         
	//   45   75:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   46   78:pop             
				((StringBuilder) (obj)).append("] should not end with '.'");
	//   47   79:aload_2         
	//   48   80:ldc1            #62  <String "] should not end with '.'">
	//   49   82:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   50   85:pop             
				throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   51   86:new             #64  <Class IllegalArgumentException>
	//   52   89:dup             
	//   53   90:aload_2         
	//   54   91:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   55   94:invokespecial   #69  <Method void IllegalArgumentException(String)>
	//   56   97:athrow          
			}
			s1 = s.substring(i);
	//   57   98:aload_0         
	//   58   99:iload_1         
	//   59  100:invokevirtual   #72  <Method String String.substring(int)>
	//   60  103:astore_3        
		}
		if(obj != null && ((String) (obj)).length() > 0)
	//*  61  104:aload_2         
	//*  62  105:ifnull          146
	//*  63  108:aload_2         
	//*  64  109:invokevirtual   #51  <Method int String.length()>
	//*  65  112:ifle            146
		{
			int j = Integer.parseInt(((String) (obj)));
	//   66  115:aload_2         
	//   67  116:invokestatic    #78  <Method int Integer.parseInt(String)>
	//   68  119:istore_1        
			if(j >= 0)
	//*  69  120:iload_1         
	//*  70  121:iflt            133
			{
				formatinfo.min = j;
	//   71  124:aload           4
	//   72  126:iload_1         
	//   73  127:putfield        #17  <Field int min>
			} else
	//*  74  130:goto            146
			{
				formatinfo.min = -j;
	//   75  133:aload           4
	//   76  135:iload_1         
	//   77  136:ineg            
	//   78  137:putfield        #17  <Field int min>
				formatinfo.leftPad = false;
	//   79  140:aload           4
	//   80  142:iconst_0        
	//   81  143:putfield        #22  <Field boolean leftPad>
			}
		}
		if(s1 != null && s1.length() > 0)
	//*  82  146:aload_3         
	//*  83  147:ifnull          188
	//*  84  150:aload_3         
	//*  85  151:invokevirtual   #51  <Method int String.length()>
	//*  86  154:ifle            188
		{
			int k = Integer.parseInt(s1);
	//   87  157:aload_3         
	//   88  158:invokestatic    #78  <Method int Integer.parseInt(String)>
	//   89  161:istore_1        
			if(k >= 0)
	//*  90  162:iload_1         
	//*  91  163:iflt            175
			{
				formatinfo.max = k;
	//   92  166:aload           4
	//   93  168:iload_1         
	//   94  169:putfield        #20  <Field int max>
				return formatinfo;
	//   95  172:aload           4
	//   96  174:areturn         
			}
			formatinfo.max = -k;
	//   97  175:aload           4
	//   98  177:iload_1         
	//   99  178:ineg            
	//  100  179:putfield        #20  <Field int max>
			formatinfo.leftTruncate = false;
	//  101  182:aload           4
	//  102  184:iconst_0        
	//  103  185:putfield        #24  <Field boolean leftTruncate>
		}
		return formatinfo;
	//  104  188:aload           4
	//  105  190:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof FormatInfo))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class FormatInfo>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((FormatInfo)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class FormatInfo>
	//   12   20:astore_1        
		return min == ((FormatInfo) (obj)).min && max == ((FormatInfo) (obj)).max && leftPad == ((FormatInfo) (obj)).leftPad && leftTruncate == ((FormatInfo) (obj)).leftTruncate;
	//   13   21:aload_0         
	//   14   22:getfield        #17  <Field int min>
	//   15   25:aload_1         
	//   16   26:getfield        #17  <Field int min>
	//   17   29:icmpne          67
	//   18   32:aload_0         
	//   19   33:getfield        #20  <Field int max>
	//   20   36:aload_1         
	//   21   37:getfield        #20  <Field int max>
	//   22   40:icmpne          67
	//   23   43:aload_0         
	//   24   44:getfield        #22  <Field boolean leftPad>
	//   25   47:aload_1         
	//   26   48:getfield        #22  <Field boolean leftPad>
	//   27   51:icmpne          67
	//   28   54:aload_0         
	//   29   55:getfield        #24  <Field boolean leftTruncate>
	//   30   58:aload_1         
	//   31   59:getfield        #24  <Field boolean leftTruncate>
	//   32   62:icmpne          67
	//   33   65:iconst_1        
	//   34   66:ireturn         
	//   35   67:iconst_0        
	//   36   68:ireturn         
	}

	public int getMax()
	{
		return max;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int max>
	//    2    4:ireturn         
	}

	public int getMin()
	{
		return min;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int min>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #85  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #87  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #90  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public boolean isLeftPad()
	{
		return leftPad;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean leftPad>
	//    2    4:ireturn         
	}

	public boolean isLeftTruncate()
	{
		return leftTruncate;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean leftTruncate>
	//    2    4:ireturn         
	}

	public void setLeftPad(boolean flag)
	{
		leftPad = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field boolean leftPad>
	//    3    5:return          
	}

	public void setLeftTruncate(boolean flag)
	{
		leftTruncate = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean leftTruncate>
	//    3    5:return          
	}

	public void setMax(int i)
	{
		max = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #20  <Field int max>
	//    3    5:return          
	}

	public void setMin(int i)
	{
		min = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field int min>
	//    3    5:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #53  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("FormatInfo(");
	//    4    8:aload_1         
	//    5    9:ldc1            #101 <String "FormatInfo(">
	//    6   11:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(min);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #17  <Field int min>
	//   11   20:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append(", ");
	//   13   24:aload_1         
	//   14   25:ldc1            #106 <String ", ">
	//   15   27:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(max);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #20  <Field int max>
	//   20   36:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
	//   21   39:pop             
		stringbuilder.append(", ");
	//   22   40:aload_1         
	//   23   41:ldc1            #106 <String ", ">
	//   24   43:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(leftPad);
	//   26   47:aload_1         
	//   27   48:aload_0         
	//   28   49:getfield        #22  <Field boolean leftPad>
	//   29   52:invokevirtual   #109 <Method StringBuilder StringBuilder.append(boolean)>
	//   30   55:pop             
		stringbuilder.append(", ");
	//   31   56:aload_1         
	//   32   57:ldc1            #106 <String ", ">
	//   33   59:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   34   62:pop             
		stringbuilder.append(leftTruncate);
	//   35   63:aload_1         
	//   36   64:aload_0         
	//   37   65:getfield        #24  <Field boolean leftTruncate>
	//   38   68:invokevirtual   #109 <Method StringBuilder StringBuilder.append(boolean)>
	//   39   71:pop             
		stringbuilder.append(")");
	//   40   72:aload_1         
	//   41   73:ldc1            #111 <String ")">
	//   42   75:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
		return stringbuilder.toString();
	//   44   79:aload_1         
	//   45   80:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   46   83:areturn         
	}

	private boolean leftPad;
	private boolean leftTruncate;
	private int max;
	private int min;
}
