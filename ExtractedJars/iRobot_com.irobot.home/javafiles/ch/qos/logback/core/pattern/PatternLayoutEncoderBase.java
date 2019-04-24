// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Layout;
import ch.qos.logback.core.encoder.LayoutWrappingEncoder;

public class PatternLayoutEncoderBase extends LayoutWrappingEncoder
{

	public PatternLayoutEncoderBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void LayoutWrappingEncoder()>
		outputPatternAsHeader = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #15  <Field boolean outputPatternAsHeader>
	//    5    9:return          
	}

	public String getPattern()
	{
		return pattern;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String pattern>
	//    2    4:areturn         
	}

	public boolean isOutputPatternAsHeader()
	{
		return outputPatternAsHeader;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field boolean outputPatternAsHeader>
	//    2    4:ireturn         
	}

	public boolean isOutputPatternAsPresentationHeader()
	{
		return outputPatternAsHeader;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field boolean outputPatternAsHeader>
	//    2    4:ireturn         
	}

	public void setLayout(Layout layout)
	{
		layout = ((Layout) (new StringBuilder()));
	//    0    0:new             #27  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (layout)).append("one cannot set the layout of ");
	//    4    8:aload_1         
	//    5    9:ldc1            #30  <String "one cannot set the layout of ">
	//    6   11:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		((StringBuilder) (layout)).append(((Object)this).getClass().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #40  <Method Class Object.getClass()>
	//   11   20:invokevirtual   #45  <Method String Class.getName()>
	//   12   23:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		throw new UnsupportedOperationException(((StringBuilder) (layout)).toString());
	//   14   27:new             #47  <Class UnsupportedOperationException>
	//   15   30:dup             
	//   16   31:aload_1         
	//   17   32:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   18   35:invokespecial   #53  <Method void UnsupportedOperationException(String)>
	//   19   38:athrow          
	}

	public void setOutputPatternAsHeader(boolean flag)
	{
		outputPatternAsHeader = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #15  <Field boolean outputPatternAsHeader>
	//    3    5:return          
	}

	public void setOutputPatternAsPresentationHeader(boolean flag)
	{
		addWarn("[outputPatternAsPresentationHeader] property is deprecated. Please use [outputPatternAsHeader] option instead.");
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "[outputPatternAsPresentationHeader] property is deprecated. Please use [outputPatternAsHeader] option instead.">
	//    2    3:invokevirtual   #63  <Method void addWarn(String)>
		outputPatternAsHeader = flag;
	//    3    6:aload_0         
	//    4    7:iload_1         
	//    5    8:putfield        #15  <Field boolean outputPatternAsHeader>
	//    6   11:return          
	}

	public void setPattern(String s)
	{
		pattern = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field String pattern>
	//    3    5:return          
	}

	protected boolean outputPatternAsHeader;
	String pattern;
}
