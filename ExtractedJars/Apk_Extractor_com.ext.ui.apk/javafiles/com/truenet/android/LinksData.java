// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.support.v7.ae;
import android.support.v7.g;
import java.util.List;

public final class LinksData
{

	public LinksData()
	{
		this(0L, 0, false, 0, 0L, g.a());
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:lconst_0        
	//    6    6:invokestatic    #29  <Method List g.a()>
	//    7    9:invokespecial   #32  <Method void LinksData(long, int, boolean, int, long, List)>
	//    8   12:return          
	}

	public LinksData(long l, int i, boolean flag, int j, long l1, 
			List list)
	{
		ae.b(((Object) (list)), "validation");
	//    0    0:aload           8
	//    1    2:ldc1            #34  <String "validation">
	//    2    4:invokestatic    #39  <Method void ae.b(Object, String)>
		super();
	//    3    7:aload_0         
	//    4    8:invokespecial   #41  <Method void Object()>
		sleep = l;
	//    5   11:aload_0         
	//    6   12:lload_1         
	//    7   13:putfield        #43  <Field long sleep>
		validateParallel = i;
	//    8   16:aload_0         
	//    9   17:iload_3         
	//   10   18:putfield        #45  <Field int validateParallel>
		bulkResponse = flag;
	//   11   21:aload_0         
	//   12   22:iload           4
	//   13   24:putfield        #47  <Field boolean bulkResponse>
		numOfRedirect = j;
	//   14   27:aload_0         
	//   15   28:iload           5
	//   16   30:putfield        #49  <Field int numOfRedirect>
		maxRedirectTime = l1;
	//   17   33:aload_0         
	//   18   34:lload           6
	//   19   36:putfield        #51  <Field long maxRedirectTime>
		validation = list;
	//   20   39:aload_0         
	//   21   40:aload           8
	//   22   42:putfield        #53  <Field List validation>
	//   23   45:return          
	}

	public static LinksData copy$default(LinksData linksdata, long l, int i, boolean flag, int j, long l1, 
			List list, int k, Object obj)
	{
		if((k & 1) != 0)
	//*   0    0:iload           9
	//*   1    2:iconst_1        
	//*   2    3:iand            
	//*   3    4:ifeq            109
			l = linksdata.sleep;
	//    4    7:aload_0         
	//    5    8:getfield        #43  <Field long sleep>
	//    6   11:lstore_1        
		if((k & 2) != 0)
	//*   7   12:iload           9
	//*   8   14:iconst_2        
	//*   9   15:iand            
	//*  10   16:ifeq            106
			i = linksdata.validateParallel;
	//   11   19:aload_0         
	//   12   20:getfield        #45  <Field int validateParallel>
	//   13   23:istore_3        
		if((k & 4) != 0)
	//*  14   24:iload           9
	//*  15   26:iconst_4        
	//*  16   27:iand            
	//*  17   28:ifeq            103
			flag = linksdata.bulkResponse;
	//   18   31:aload_0         
	//   19   32:getfield        #47  <Field boolean bulkResponse>
	//   20   35:istore          4
		if((k & 8) != 0)
	//*  21   37:iload           9
	//*  22   39:bipush          8
	//*  23   41:iand            
	//*  24   42:ifeq            100
			j = linksdata.numOfRedirect;
	//   25   45:aload_0         
	//   26   46:getfield        #49  <Field int numOfRedirect>
	//   27   49:istore          5
		if((k & 0x10) != 0)
	//*  28   51:iload           9
	//*  29   53:bipush          16
	//*  30   55:iand            
	//*  31   56:ifeq            97
			l1 = linksdata.maxRedirectTime;
	//   32   59:aload_0         
	//   33   60:getfield        #51  <Field long maxRedirectTime>
	//   34   63:lstore          6
		if((k & 0x20) != 0)
	//*  35   65:iload           9
	//*  36   67:bipush          32
	//*  37   69:iand            
	//*  38   70:ifeq            94
			list = linksdata.validation;
	//   39   73:aload_0         
	//   40   74:getfield        #53  <Field List validation>
	//   41   77:astore          8
		return linksdata.copy(l, i, flag, j, l1, list);
	//   42   79:aload_0         
	//   43   80:lload_1         
	//   44   81:iload_3         
	//   45   82:iload           4
	//   46   84:iload           5
	//   47   86:lload           6
	//   48   88:aload           8
	//   49   90:invokevirtual   #62  <Method LinksData copy(long, int, boolean, int, long, List)>
	//   50   93:areturn         
	//*  51   94:goto            79
	//*  52   97:goto            65
	//*  53  100:goto            51
	//*  54  103:goto            37
	//*  55  106:goto            24
	//*  56  109:goto            12
	}

	public final long component1()
	{
		return sleep;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field long sleep>
	//    2    4:lreturn         
	}

	public final int component2()
	{
		return validateParallel;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int validateParallel>
	//    2    4:ireturn         
	}

	public final boolean component3()
	{
		return bulkResponse;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean bulkResponse>
	//    2    4:ireturn         
	}

	public final int component4()
	{
		return numOfRedirect;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int numOfRedirect>
	//    2    4:ireturn         
	}

	public final long component5()
	{
		return maxRedirectTime;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field long maxRedirectTime>
	//    2    4:lreturn         
	}

	public final List component6()
	{
		return validation;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field List validation>
	//    2    4:areturn         
	}

	public final LinksData copy(long l, int i, boolean flag, int j, long l1, 
			List list)
	{
		ae.b(((Object) (list)), "validation");
	//    0    0:aload           8
	//    1    2:ldc1            #34  <String "validation">
	//    2    4:invokestatic    #39  <Method void ae.b(Object, String)>
		return new LinksData(l, i, flag, j, l1, list);
	//    3    7:new             #2   <Class LinksData>
	//    4   10:dup             
	//    5   11:lload_1         
	//    6   12:iload_3         
	//    7   13:iload           4
	//    8   15:iload           5
	//    9   17:lload           6
	//   10   19:aload           8
	//   11   21:invokespecial   #32  <Method void LinksData(long, int, boolean, int, long, List)>
	//   12   24:areturn         
	}

	public boolean equals(Object obj)
	{
label0:
		{
			boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
			if(this != obj)
	//*   2    3:aload_0         
	//*   3    4:aload_1         
	//*   4    5:if_acmpeq       142
			{
				boolean flag1 = flag2;
	//    5    8:iload           4
	//    6   10:istore_3        
				if(!(obj instanceof LinksData))
					break label0;
	//    7   11:aload_1         
	//    8   12:instanceof      #2   <Class LinksData>
	//    9   15:ifeq            144
				obj = ((Object) ((LinksData)obj));
	//   10   18:aload_1         
	//   11   19:checkcast       #2   <Class LinksData>
	//   12   22:astore_1        
				boolean flag;
				if(sleep == ((LinksData) (obj)).sleep)
	//*  13   23:aload_0         
	//*  14   24:getfield        #43  <Field long sleep>
	//*  15   27:aload_1         
	//*  16   28:getfield        #43  <Field long sleep>
	//*  17   31:lcmp            
	//*  18   32:ifne            146
					flag = true;
	//   19   35:iconst_1        
	//   20   36:istore_2        
				else
	//*  21   37:iload           4
	//*  22   39:istore_3        
	//*  23   40:iload_2         
	//*  24   41:ifeq            144
	//*  25   44:aload_0         
	//*  26   45:getfield        #45  <Field int validateParallel>
	//*  27   48:aload_1         
	//*  28   49:getfield        #45  <Field int validateParallel>
	//*  29   52:icmpne          151
	//*  30   55:iconst_1        
	//*  31   56:istore_2        
	//*  32   57:iload           4
	//*  33   59:istore_3        
	//*  34   60:iload_2         
	//*  35   61:ifeq            144
	//*  36   64:aload_0         
	//*  37   65:getfield        #47  <Field boolean bulkResponse>
	//*  38   68:aload_1         
	//*  39   69:getfield        #47  <Field boolean bulkResponse>
	//*  40   72:icmpne          156
	//*  41   75:iconst_1        
	//*  42   76:istore_2        
	//*  43   77:iload           4
	//*  44   79:istore_3        
	//*  45   80:iload_2         
	//*  46   81:ifeq            144
	//*  47   84:aload_0         
	//*  48   85:getfield        #49  <Field int numOfRedirect>
	//*  49   88:aload_1         
	//*  50   89:getfield        #49  <Field int numOfRedirect>
	//*  51   92:icmpne          161
	//*  52   95:iconst_1        
	//*  53   96:istore_2        
	//*  54   97:iload           4
	//*  55   99:istore_3        
	//*  56  100:iload_2         
	//*  57  101:ifeq            144
	//*  58  104:aload_0         
	//*  59  105:getfield        #51  <Field long maxRedirectTime>
	//*  60  108:aload_1         
	//*  61  109:getfield        #51  <Field long maxRedirectTime>
	//*  62  112:lcmp            
	//*  63  113:ifne            166
	//*  64  116:iconst_1        
	//*  65  117:istore_2        
	//*  66  118:iload           4
	//*  67  120:istore_3        
	//*  68  121:iload_2         
	//*  69  122:ifeq            144
	//*  70  125:iload           4
	//*  71  127:istore_3        
	//*  72  128:aload_0         
	//*  73  129:getfield        #53  <Field List validation>
	//*  74  132:aload_1         
	//*  75  133:getfield        #53  <Field List validation>
	//*  76  136:invokestatic    #79  <Method boolean ae.a(Object, Object)>
	//*  77  139:ifeq            144
	//*  78  142:iconst_1        
	//*  79  143:istore_3        
	//*  80  144:iload_3         
	//*  81  145:ireturn         
					flag = false;
	//   82  146:iconst_0        
	//   83  147:istore_2        
				flag1 = flag2;
				if(!flag)
					break label0;
				if(validateParallel == ((LinksData) (obj)).validateParallel)
					flag = true;
				else
	//*  84  148:goto            37
					flag = false;
	//   85  151:iconst_0        
	//   86  152:istore_2        
				flag1 = flag2;
				if(!flag)
					break label0;
				if(bulkResponse == ((LinksData) (obj)).bulkResponse)
					flag = true;
				else
	//*  87  153:goto            57
					flag = false;
	//   88  156:iconst_0        
	//   89  157:istore_2        
				flag1 = flag2;
				if(!flag)
					break label0;
				if(numOfRedirect == ((LinksData) (obj)).numOfRedirect)
					flag = true;
				else
	//*  90  158:goto            77
					flag = false;
	//   91  161:iconst_0        
	//   92  162:istore_2        
				flag1 = flag2;
				if(!flag)
					break label0;
				if(maxRedirectTime == ((LinksData) (obj)).maxRedirectTime)
					flag = true;
				else
	//*  93  163:goto            97
					flag = false;
	//   94  166:iconst_0        
	//   95  167:istore_2        
				flag1 = flag2;
				if(!flag)
					break label0;
				flag1 = flag2;
				if(!ae.a(((Object) (validation)), ((Object) (((LinksData) (obj)).validation))))
					break label0;
			}
			flag1 = true;
		}
		return flag1;
	//*  96  168:goto            118
	}

	public final boolean getBulkResponse()
	{
		return bulkResponse;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean bulkResponse>
	//    2    4:ireturn         
	}

	public final long getMaxRedirectTime()
	{
		return maxRedirectTime;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field long maxRedirectTime>
	//    2    4:lreturn         
	}

	public final int getNumOfRedirect()
	{
		return numOfRedirect;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int numOfRedirect>
	//    2    4:ireturn         
	}

	public final long getSleep()
	{
		return sleep;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field long sleep>
	//    2    4:lreturn         
	}

	public final int getValidateParallel()
	{
		return validateParallel;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int validateParallel>
	//    2    4:ireturn         
	}

	public final List getValidation()
	{
		return validation;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field List validation>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #88  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #90  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #95  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public String toString()
	{
		return (new StringBuilder()).append("LinksData(sleep=").append(sleep).append(", validateParallel=").append(validateParallel).append(", bulkResponse=").append(bulkResponse).append(", numOfRedirect=").append(numOfRedirect).append(", maxRedirectTime=").append(maxRedirectTime).append(", validation=").append(((Object) (validation))).append(")").toString();
	//    0    0:new             #99  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #100 <Method void StringBuilder()>
	//    3    7:ldc1            #102 <String "LinksData(sleep=">
	//    4    9:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #43  <Field long sleep>
	//    7   16:invokevirtual   #109 <Method StringBuilder StringBuilder.append(long)>
	//    8   19:ldc1            #111 <String ", validateParallel=">
	//    9   21:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #45  <Field int validateParallel>
	//   12   28:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   13   31:ldc1            #116 <String ", bulkResponse=">
	//   14   33:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   15   36:aload_0         
	//   16   37:getfield        #47  <Field boolean bulkResponse>
	//   17   40:invokevirtual   #119 <Method StringBuilder StringBuilder.append(boolean)>
	//   18   43:ldc1            #121 <String ", numOfRedirect=">
	//   19   45:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #49  <Field int numOfRedirect>
	//   22   52:invokevirtual   #114 <Method StringBuilder StringBuilder.append(int)>
	//   23   55:ldc1            #123 <String ", maxRedirectTime=">
	//   24   57:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:aload_0         
	//   26   61:getfield        #51  <Field long maxRedirectTime>
	//   27   64:invokevirtual   #109 <Method StringBuilder StringBuilder.append(long)>
	//   28   67:ldc1            #125 <String ", validation=">
	//   29   69:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   30   72:aload_0         
	//   31   73:getfield        #53  <Field List validation>
	//   32   76:invokevirtual   #128 <Method StringBuilder StringBuilder.append(Object)>
	//   33   79:ldc1            #130 <String ")">
	//   34   81:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   35   84:invokevirtual   #132 <Method String StringBuilder.toString()>
	//   36   87:areturn         
	}

	private final boolean bulkResponse;
	private final long maxRedirectTime;
	private final int numOfRedirect;
	private final long sleep;
	private final int validateParallel;
	private final List validation;
}
