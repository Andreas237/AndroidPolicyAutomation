// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.encoder;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.core.pattern.PatternLayoutEncoderBase;

public class PatternLayoutEncoder extends PatternLayoutEncoderBase
{

	public PatternLayoutEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void PatternLayoutEncoderBase()>
	//    2    4:return          
	}

	public void start()
	{
		PatternLayout patternlayout = new PatternLayout();
	//    0    0:new             #13  <Class PatternLayout>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void PatternLayout()>
	//    3    7:astore_1        
		patternlayout.setContext(context);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field ch.qos.logback.core.Context context>
	//    7   13:invokevirtual   #22  <Method void PatternLayout.setContext(ch.qos.logback.core.Context)>
		patternlayout.setPattern(getPattern());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #26  <Method String getPattern()>
	//   11   21:invokevirtual   #30  <Method void PatternLayout.setPattern(String)>
		patternlayout.setOutputPatternAsHeader(outputPatternAsHeader);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #34  <Field boolean outputPatternAsHeader>
	//   15   29:invokevirtual   #38  <Method void PatternLayout.setOutputPatternAsHeader(boolean)>
		patternlayout.start();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #40  <Method void PatternLayout.start()>
		layout = ((ch.qos.logback.core.Layout) (patternlayout));
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #44  <Field ch.qos.logback.core.Layout layout>
		super.start();
	//   21   41:aload_0         
	//   22   42:invokespecial   #45  <Method void PatternLayoutEncoderBase.start()>
	//   23   45:return          
	}
}
