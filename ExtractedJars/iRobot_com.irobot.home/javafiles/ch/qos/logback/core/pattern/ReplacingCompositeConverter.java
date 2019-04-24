// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package ch.qos.logback.core.pattern:
//			CompositeConverter

public class ReplacingCompositeConverter extends CompositeConverter
{

	public ReplacingCompositeConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CompositeConverter()>
	//    2    4:return          
	}

	public void start()
	{
		List list = getOptionList();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method List getOptionList()>
	//    2    4:astore_2        
		if(list == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       16
		{
			addError("at least two options are expected whereas you have declared none");
	//    5    9:aload_0         
	//    6   10:ldc1            #22  <String "at least two options are expected whereas you have declared none">
	//    7   12:invokevirtual   #26  <Method void addError(String)>
			return;
	//    8   15:return          
		}
		int i = list.size();
	//    9   16:aload_2         
	//   10   17:invokeinterface #32  <Method int List.size()>
	//   11   22:istore_1        
		if(i < 2)
	//*  12   23:iload_1         
	//*  13   24:iconst_2        
	//*  14   25:icmpge          78
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   28:new             #34  <Class StringBuilder>
	//   16   31:dup             
	//   17   32:invokespecial   #35  <Method void StringBuilder()>
	//   18   35:astore_3        
			stringbuilder.append("at least two options are expected whereas you have declared only ");
	//   19   36:aload_3         
	//   20   37:ldc1            #37  <String "at least two options are expected whereas you have declared only ">
	//   21   39:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			stringbuilder.append(i);
	//   23   43:aload_3         
	//   24   44:iload_1         
	//   25   45:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   26   48:pop             
			stringbuilder.append("as [");
	//   27   49:aload_3         
	//   28   50:ldc1            #46  <String "as [">
	//   29   52:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
			stringbuilder.append(((Object) (list)));
	//   31   56:aload_3         
	//   32   57:aload_2         
	//   33   58:invokevirtual   #49  <Method StringBuilder StringBuilder.append(Object)>
	//   34   61:pop             
			stringbuilder.append("]");
	//   35   62:aload_3         
	//   36   63:ldc1            #51  <String "]">
	//   37   65:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   38   68:pop             
			addError(stringbuilder.toString());
	//   39   69:aload_0         
	//   40   70:aload_3         
	//   41   71:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   42   74:invokevirtual   #26  <Method void addError(String)>
			return;
	//   43   77:return          
		} else
		{
			regex = (String)list.get(0);
	//   44   78:aload_0         
	//   45   79:aload_2         
	//   46   80:iconst_0        
	//   47   81:invokeinterface #59  <Method Object List.get(int)>
	//   48   86:checkcast       #61  <Class String>
	//   49   89:putfield        #63  <Field String regex>
			pattern = Pattern.compile(regex);
	//   50   92:aload_0         
	//   51   93:aload_0         
	//   52   94:getfield        #63  <Field String regex>
	//   53   97:invokestatic    #69  <Method Pattern Pattern.compile(String)>
	//   54  100:putfield        #71  <Field Pattern pattern>
			replacement = (String)list.get(1);
	//   55  103:aload_0         
	//   56  104:aload_2         
	//   57  105:iconst_1        
	//   58  106:invokeinterface #59  <Method Object List.get(int)>
	//   59  111:checkcast       #61  <Class String>
	//   60  114:putfield        #73  <Field String replacement>
			super.start();
	//   61  117:aload_0         
	//   62  118:invokespecial   #75  <Method void CompositeConverter.start()>
			return;
	//   63  121:return          
		}
	}

	protected String transform(Object obj, String s)
	{
		if(!started)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field boolean started>
	//*   2    4:ifne            9
			return s;
	//    3    7:aload_2         
	//    4    8:areturn         
		else
			return pattern.matcher(((CharSequence) (s))).replaceAll(replacement);
	//    5    9:aload_0         
	//    6   10:getfield        #71  <Field Pattern pattern>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #85  <Method Matcher Pattern.matcher(CharSequence)>
	//    9   17:aload_0         
	//   10   18:getfield        #73  <Field String replacement>
	//   11   21:invokevirtual   #91  <Method String Matcher.replaceAll(String)>
	//   12   24:areturn         
	}

	Pattern pattern;
	String regex;
	String replacement;
}
