// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;

// Referenced classes of package ch.qos.logback.classic.pattern:
//			ClassicConverter, Abbreviator, ClassNameOnlyAbbreviator, TargetLengthBasedClassNameAbbreviator

public abstract class NamedConverter extends ClassicConverter
{

	public NamedConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ClassicConverter()>
		abbreviator = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #12  <Field Abbreviator abbreviator>
	//    5    9:return          
	}

	public String convert(ILoggingEvent iloggingevent)
	{
		iloggingevent = ((ILoggingEvent) (getFullyQualifiedName(iloggingevent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #18  <Method String getFullyQualifiedName(ILoggingEvent)>
	//    3    5:astore_1        
		if(abbreviator == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #12  <Field Abbreviator abbreviator>
	//*   6   10:ifnonnull       15
			return ((String) (iloggingevent));
	//    7   13:aload_1         
	//    8   14:areturn         
		else
			return abbreviator.abbreviate(((String) (iloggingevent)));
	//    9   15:aload_0         
	//   10   16:getfield        #12  <Field Abbreviator abbreviator>
	//   11   19:aload_1         
	//   12   20:invokeinterface #24  <Method String Abbreviator.abbreviate(String)>
	//   13   25:areturn         
	}

	public volatile String convert(Object obj)
	{
		return convert((ILoggingEvent)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class ILoggingEvent>
	//    3    5:invokevirtual   #29  <Method String convert(ILoggingEvent)>
	//    4    8:areturn         
	}

	protected abstract String getFullyQualifiedName(ILoggingEvent iloggingevent);

	public void start()
	{
		String s = getFirstOption();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #36  <Method String getFirstOption()>
	//    2    4:astore_2        
		if(s == null)
			break MISSING_BLOCK_LABEL_46;
	//    3    5:aload_2         
	//    4    6:ifnull          46
		int i;
		try
		{
			i = Integer.parseInt(s);
	//    5    9:aload_2         
	//    6   10:invokestatic    #42  <Method int Integer.parseInt(String)>
	//    7   13:istore_1        
		}
	//*   8   14:iload_1         
	//*   9   15:ifne            30
	//*  10   18:aload_0         
	//*  11   19:new             #44  <Class ClassNameOnlyAbbreviator>
	//*  12   22:dup             
	//*  13   23:invokespecial   #45  <Method void ClassNameOnlyAbbreviator()>
	//*  14   26:putfield        #12  <Field Abbreviator abbreviator>
	//*  15   29:return          
	//*  16   30:iload_1         
	//*  17   31:ifle            46
	//*  18   34:aload_0         
	//*  19   35:new             #47  <Class TargetLengthBasedClassNameAbbreviator>
	//*  20   38:dup             
	//*  21   39:iload_1         
	//*  22   40:invokespecial   #50  <Method void TargetLengthBasedClassNameAbbreviator(int)>
	//*  23   43:putfield        #12  <Field Abbreviator abbreviator>
	//*  24   46:return          
		catch(NumberFormatException numberformatexception)
	//*  25   47:astore_2        
		{
			return;
	//   26   48:return          
		}
		if(i != 0)
			break MISSING_BLOCK_LABEL_30;
		abbreviator = ((Abbreviator) (new ClassNameOnlyAbbreviator()));
		return;
		if(i <= 0)
			break MISSING_BLOCK_LABEL_46;
		abbreviator = ((Abbreviator) (new TargetLengthBasedClassNameAbbreviator(i)));
	}

	Abbreviator abbreviator;
}
