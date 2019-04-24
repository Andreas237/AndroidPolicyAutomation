// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.util;

import java.util.*;

// Referenced classes of package ch.qos.logback.core.util:
//			CharSequenceToRegexMapper, CharSequenceState

public class DatePatternToRegexUtil
{

	public DatePatternToRegexUtil(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class CharSequenceToRegexMapper>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void CharSequenceToRegexMapper()>
	//    6   12:putfield        #20  <Field CharSequenceToRegexMapper regexMapper>
		datePattern = s;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #22  <Field String datePattern>
		datePatternLength = s.length();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #28  <Method int String.length()>
	//   13   25:putfield        #30  <Field int datePatternLength>
	//   14   28:return          
	}

	private List tokenize()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #35  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void ArrayList()>
	//    3    7:astore          4
		CharSequenceState charsequencestate = null;
	//    4    9:aconst_null     
	//    5   10:astore_3        
		for(int i = 0; i < datePatternLength; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_2        
	//*   8   13:iload_2         
	//*   9   14:aload_0         
	//*  10   15:getfield        #30  <Field int datePatternLength>
	//*  11   18:icmpge          77
		{
			char c = datePattern.charAt(i);
	//   12   21:aload_0         
	//   13   22:getfield        #22  <Field String datePattern>
	//   14   25:iload_2         
	//   15   26:invokevirtual   #40  <Method char String.charAt(int)>
	//   16   29:istore_1        
			if(charsequencestate != null && charsequencestate.c == c)
	//*  17   30:aload_3         
	//*  18   31:ifnull          52
	//*  19   34:aload_3         
	//*  20   35:getfield        #46  <Field char CharSequenceState.c>
	//*  21   38:iload_1         
	//*  22   39:icmpeq          45
	//*  23   42:goto            52
			{
				charsequencestate.incrementOccurrences();
	//   24   45:aload_3         
	//   25   46:invokevirtual   #49  <Method void CharSequenceState.incrementOccurrences()>
			} else
	//*  26   49:goto            70
			{
				charsequencestate = new CharSequenceState(c);
	//   27   52:new             #42  <Class CharSequenceState>
	//   28   55:dup             
	//   29   56:iload_1         
	//   30   57:invokespecial   #52  <Method void CharSequenceState(char)>
	//   31   60:astore_3        
				((List) (arraylist)).add(((Object) (charsequencestate)));
	//   32   61:aload           4
	//   33   63:aload_3         
	//   34   64:invokeinterface #58  <Method boolean List.add(Object)>
	//   35   69:pop             
			}
		}

	//   36   70:iload_2         
	//   37   71:iconst_1        
	//   38   72:iadd            
	//   39   73:istore_2        
	//*  40   74:goto            13
		return ((List) (arraylist));
	//   41   77:aload           4
	//   42   79:areturn         
	}

	public String toRegex()
	{
		Object obj = ((Object) (tokenize()));
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method List tokenize()>
	//    2    4:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    5:new             #66  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #67  <Method void StringBuilder()>
	//    6   12:astore_1        
		CharSequenceState charsequencestate;
		for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); stringbuilder.append(regexMapper.toRegex(charsequencestate)))
	//*   7   13:aload_2         
	//*   8   14:invokeinterface #71  <Method Iterator List.iterator()>
	//*   9   19:astore_2        
	//*  10   20:aload_2         
	//*  11   21:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//*  12   26:ifeq            55
			charsequencestate = (CharSequenceState)((Iterator) (obj)).next();
	//   13   29:aload_2         
	//   14   30:invokeinterface #81  <Method Object Iterator.next()>
	//   15   35:checkcast       #42  <Class CharSequenceState>
	//   16   38:astore_3        

	//   17   39:aload_1         
	//   18   40:aload_0         
	//   19   41:getfield        #20  <Field CharSequenceToRegexMapper regexMapper>
	//   20   44:aload_3         
	//   21   45:invokevirtual   #84  <Method String CharSequenceToRegexMapper.toRegex(CharSequenceState)>
	//   22   48:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   23   51:pop             
	//*  24   52:goto            20
		return stringbuilder.toString();
	//   25   55:aload_1         
	//   26   56:invokevirtual   #91  <Method String StringBuilder.toString()>
	//   27   59:areturn         
	}

	final String datePattern;
	final int datePatternLength;
	final CharSequenceToRegexMapper regexMapper = new CharSequenceToRegexMapper();
}
