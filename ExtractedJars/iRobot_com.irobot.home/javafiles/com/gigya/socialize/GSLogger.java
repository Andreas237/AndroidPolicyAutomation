// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize;

import java.io.PrintWriter;
import java.io.StringWriter;

public class GSLogger
{

	public GSLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
		sb = new StringBuilder();
	//    2    4:aload_0         
	//    3    5:new             #12  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #13  <Method void StringBuilder()>
	//    6   12:putfield        #15  <Field StringBuilder sb>
	//    7   15:return          
	}

	public String toString()
	{
		return sb.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field StringBuilder sb>
	//    2    4:invokevirtual   #20  <Method String StringBuilder.toString()>
	//    3    7:areturn         
	}

	public void write(Exception exception)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #24  <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void StringWriter()>
	//    3    7:astore_2        
		exception.printStackTrace(new PrintWriter(((java.io.Writer) (stringwriter))));
	//    4    8:aload_1         
	//    5    9:new             #27  <Class PrintWriter>
	//    6   12:dup             
	//    7   13:aload_2         
	//    8   14:invokespecial   #30  <Method void PrintWriter(java.io.Writer)>
	//    9   17:invokevirtual   #36  <Method void Exception.printStackTrace(PrintWriter)>
		write(((Object) (stringwriter)));
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #39  <Method void write(Object)>
	//   13   25:return          
	}

	public void write(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			write(((String) (null)), ((Object) (obj.toString())));
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:aload_1         
	//    6    8:invokevirtual   #40  <Method String Object.toString()>
	//    7   11:invokevirtual   #43  <Method void write(String, Object)>
			return;
	//    8   14:return          
		}
	}

	public void write(String s, Object obj)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          43
		{
			StringBuilder stringbuilder = sb;
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field StringBuilder sb>
	//    4    8:astore_3        
			StringBuilder stringbuilder2 = new StringBuilder();
	//    5    9:new             #12  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #13  <Method void StringBuilder()>
	//    8   16:astore          4
			stringbuilder2.append(s);
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
			stringbuilder2.append(": ");
	//   13   25:aload           4
	//   14   27:ldc1            #49  <String ": ">
	//   15   29:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(stringbuilder2.toString());
	//   17   33:aload_3         
	//   18   34:aload           4
	//   19   36:invokevirtual   #20  <Method String StringBuilder.toString()>
	//   20   39:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
		}
		if(obj != null)
	//*  22   43:aload_2         
	//*  23   44:ifnull          120
		{
			obj = ((Object) (obj.toString()));
	//   24   47:aload_2         
	//   25   48:invokevirtual   #40  <Method String Object.toString()>
	//   26   51:astore_2        
			s = ((String) (obj));
	//   27   52:aload_2         
	//   28   53:astore_1        
			if(((String) (obj)).length() > 10000)
	//*  29   54:aload_2         
	//*  30   55:invokevirtual   #55  <Method int String.length()>
	//*  31   58:sipush          10000
	//*  32   61:icmple          85
				s = String.format("%s.. (value too long)", new Object[] {
					((String) (obj)).substring(0, 10000)
				});
	//   33   64:ldc1            #57  <String "%s.. (value too long)">
	//   34   66:iconst_1        
	//   35   67:anewarray       Object[]
	//   36   70:dup             
	//   37   71:iconst_0        
	//   38   72:aload_2         
	//   39   73:iconst_0        
	//   40   74:sipush          10000
	//   41   77:invokevirtual   #61  <Method String String.substring(int, int)>
	//   42   80:aastore         
	//   43   81:invokestatic    #65  <Method String String.format(String, Object[])>
	//   44   84:astore_1        
			obj = ((Object) (sb));
	//   45   85:aload_0         
	//   46   86:getfield        #15  <Field StringBuilder sb>
	//   47   89:astore_2        
			StringBuilder stringbuilder1 = new StringBuilder();
	//   48   90:new             #12  <Class StringBuilder>
	//   49   93:dup             
	//   50   94:invokespecial   #13  <Method void StringBuilder()>
	//   51   97:astore_3        
			stringbuilder1.append(s);
	//   52   98:aload_3         
	//   53   99:aload_1         
	//   54  100:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   55  103:pop             
			stringbuilder1.append("\n");
	//   56  104:aload_3         
	//   57  105:ldc1            #67  <String "\n">
	//   58  107:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   59  110:pop             
			((StringBuilder) (obj)).append(stringbuilder1.toString());
	//   60  111:aload_2         
	//   61  112:aload_3         
	//   62  113:invokevirtual   #20  <Method String StringBuilder.toString()>
	//   63  116:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   64  119:pop             
		}
	//   65  120:return          
	}

	public transient void writeFormat(String s, Object aobj[])
	{
		write(((Object) (String.format(s, aobj))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #65  <Method String String.format(String, Object[])>
	//    4    6:invokevirtual   #39  <Method void write(Object)>
	//    5    9:return          
	}

	private StringBuilder sb;
}
