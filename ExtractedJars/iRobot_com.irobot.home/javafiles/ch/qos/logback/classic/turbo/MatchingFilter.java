// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.turbo;

import ch.qos.logback.core.spi.FilterReply;

// Referenced classes of package ch.qos.logback.classic.turbo:
//			TurboFilter

public abstract class MatchingFilter extends TurboFilter
{

	public MatchingFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void TurboFilter()>
		onMatch = FilterReply.NEUTRAL;
	//    2    4:aload_0         
	//    3    5:getstatic       #16  <Field FilterReply FilterReply.NEUTRAL>
	//    4    8:putfield        #18  <Field FilterReply onMatch>
		onMismatch = FilterReply.NEUTRAL;
	//    5   11:aload_0         
	//    6   12:getstatic       #16  <Field FilterReply FilterReply.NEUTRAL>
	//    7   15:putfield        #20  <Field FilterReply onMismatch>
	//    8   18:return          
	}

	public final void setOnMatch(String s)
	{
		if("NEUTRAL".equals(((Object) (s))))
	//*   0    0:ldc1            #24  <String "NEUTRAL">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            19
			s = ((String) (FilterReply.NEUTRAL));
	//    4    9:getstatic       #16  <Field FilterReply FilterReply.NEUTRAL>
	//    5   12:astore_1        
		else
	//*   6   13:aload_0         
	//*   7   14:aload_1         
	//*   8   15:putfield        #18  <Field FilterReply onMatch>
	//*   9   18:return          
		if("ACCEPT".equals(((Object) (s))))
	//*  10   19:ldc1            #32  <String "ACCEPT">
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  13   25:ifeq            35
			s = ((String) (FilterReply.ACCEPT));
	//   14   28:getstatic       #34  <Field FilterReply FilterReply.ACCEPT>
	//   15   31:astore_1        
		else
	//*  16   32:goto            13
		if("DENY".equals(((Object) (s))))
	//*  17   35:ldc1            #36  <String "DENY">
	//*  18   37:aload_1         
	//*  19   38:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  20   41:ifeq            51
			s = ((String) (FilterReply.DENY));
	//   21   44:getstatic       #38  <Field FilterReply FilterReply.DENY>
	//   22   47:astore_1        
		else
	//*  23   48:goto            13
			return;
	//   24   51:return          
		onMatch = ((FilterReply) (s));
	}

	public final void setOnMismatch(String s)
	{
		if("NEUTRAL".equals(((Object) (s))))
	//*   0    0:ldc1            #24  <String "NEUTRAL">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            19
			s = ((String) (FilterReply.NEUTRAL));
	//    4    9:getstatic       #16  <Field FilterReply FilterReply.NEUTRAL>
	//    5   12:astore_1        
		else
	//*   6   13:aload_0         
	//*   7   14:aload_1         
	//*   8   15:putfield        #20  <Field FilterReply onMismatch>
	//*   9   18:return          
		if("ACCEPT".equals(((Object) (s))))
	//*  10   19:ldc1            #32  <String "ACCEPT">
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  13   25:ifeq            35
			s = ((String) (FilterReply.ACCEPT));
	//   14   28:getstatic       #34  <Field FilterReply FilterReply.ACCEPT>
	//   15   31:astore_1        
		else
	//*  16   32:goto            13
		if("DENY".equals(((Object) (s))))
	//*  17   35:ldc1            #36  <String "DENY">
	//*  18   37:aload_1         
	//*  19   38:invokevirtual   #30  <Method boolean String.equals(Object)>
	//*  20   41:ifeq            51
			s = ((String) (FilterReply.DENY));
	//   21   44:getstatic       #38  <Field FilterReply FilterReply.DENY>
	//   22   47:astore_1        
		else
	//*  23   48:goto            13
			return;
	//   24   51:return          
		onMismatch = ((FilterReply) (s));
	}

	protected FilterReply onMatch;
	protected FilterReply onMismatch;
}
