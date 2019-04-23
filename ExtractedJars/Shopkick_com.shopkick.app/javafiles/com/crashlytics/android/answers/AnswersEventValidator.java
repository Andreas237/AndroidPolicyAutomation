// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.answers;

import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.Locale;
import java.util.Map;

class AnswersEventValidator
{

	public AnswersEventValidator(int i, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		maxNumAttributes = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int maxNumAttributes>
		maxStringLength = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #18  <Field int maxStringLength>
		failFast = flag;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #20  <Field boolean failFast>
	//   11   19:return          
	}

	private void logOrThrowException(RuntimeException runtimeexception)
	{
		if(!failFast)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean failFast>
	//*   2    4:ifne            21
		{
			Fabric.getLogger().e("Answers", "Invalid user input detected", ((Throwable) (runtimeexception)));
	//    3    7:invokestatic    #29  <Method Logger Fabric.getLogger()>
	//    4   10:ldc1            #31  <String "Answers">
	//    5   12:ldc1            #33  <String "Invalid user input detected">
	//    6   14:aload_1         
	//    7   15:invokeinterface #39  <Method void Logger.e(String, String, Throwable)>
			return;
	//    8   20:return          
		} else
		{
			throw runtimeexception;
	//    9   21:aload_1         
	//   10   22:athrow          
		}
	}

	public boolean isFullMap(Map map, String s)
	{
		if(map.size() >= maxNumAttributes && !map.containsKey(((Object) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #47  <Method int Map.size()>
	//*   2    6:aload_0         
	//*   3    7:getfield        #16  <Field int maxNumAttributes>
	//*   4   10:icmplt          58
	//*   5   13:aload_1         
	//*   6   14:aload_2         
	//*   7   15:invokeinterface #51  <Method boolean Map.containsKey(Object)>
	//*   8   20:ifne            58
		{
			logOrThrowException(((RuntimeException) (new IllegalArgumentException(String.format(Locale.US, "Limit of %d attributes reached, skipping attribute", new Object[] {
				Integer.valueOf(maxNumAttributes)
			})))));
	//    9   23:aload_0         
	//   10   24:new             #53  <Class IllegalArgumentException>
	//   11   27:dup             
	//   12   28:getstatic       #59  <Field Locale Locale.US>
	//   13   31:ldc1            #61  <String "Limit of %d attributes reached, skipping attribute">
	//   14   33:iconst_1        
	//   15   34:anewarray       Object[]
	//   16   37:dup             
	//   17   38:iconst_0        
	//   18   39:aload_0         
	//   19   40:getfield        #16  <Field int maxNumAttributes>
	//   20   43:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   21   46:aastore         
	//   22   47:invokestatic    #73  <Method String String.format(Locale, String, Object[])>
	//   23   50:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   24   53:invokespecial   #78  <Method void logOrThrowException(RuntimeException)>
			return true;
	//   25   56:iconst_1        
	//   26   57:ireturn         
		} else
		{
			return false;
	//   27   58:iconst_0        
	//   28   59:ireturn         
		}
	}

	public boolean isNull(Object obj, String s)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       42
		{
			obj = ((Object) (new StringBuilder()));
	//    2    4:new             #84  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #85  <Method void StringBuilder()>
	//    5   11:astore_1        
			((StringBuilder) (obj)).append(s);
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    9   17:pop             
			((StringBuilder) (obj)).append(" must not be null");
	//   10   18:aload_1         
	//   11   19:ldc1            #91  <String " must not be null">
	//   12   21:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			logOrThrowException(((RuntimeException) (new NullPointerException(((StringBuilder) (obj)).toString()))));
	//   14   25:aload_0         
	//   15   26:new             #93  <Class NullPointerException>
	//   16   29:dup             
	//   17   30:aload_1         
	//   18   31:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   19   34:invokespecial   #98  <Method void NullPointerException(String)>
	//   20   37:invokespecial   #78  <Method void logOrThrowException(RuntimeException)>
			return true;
	//   21   40:iconst_1        
	//   22   41:ireturn         
		} else
		{
			return false;
	//   23   42:iconst_0        
	//   24   43:ireturn         
		}
	}

	public String limitStringLength(String s)
	{
		if(s.length() > maxStringLength)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #103 <Method int String.length()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #18  <Field int maxStringLength>
	//*   4    8:icmple          54
		{
			logOrThrowException(((RuntimeException) (new IllegalArgumentException(String.format(Locale.US, "String is too long, truncating to %d characters", new Object[] {
				Integer.valueOf(maxStringLength)
			})))));
	//    5   11:aload_0         
	//    6   12:new             #53  <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:getstatic       #59  <Field Locale Locale.US>
	//    9   19:ldc1            #105 <String "String is too long, truncating to %d characters">
	//   10   21:iconst_1        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:aload_0         
	//   15   28:getfield        #18  <Field int maxStringLength>
	//   16   31:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   17   34:aastore         
	//   18   35:invokestatic    #73  <Method String String.format(Locale, String, Object[])>
	//   19   38:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   20   41:invokespecial   #78  <Method void logOrThrowException(RuntimeException)>
			return s.substring(0, maxStringLength);
	//   21   44:aload_1         
	//   22   45:iconst_0        
	//   23   46:aload_0         
	//   24   47:getfield        #18  <Field int maxStringLength>
	//   25   50:invokevirtual   #109 <Method String String.substring(int, int)>
	//   26   53:areturn         
		} else
		{
			return s;
	//   27   54:aload_1         
	//   28   55:areturn         
		}
	}

	boolean failFast;
	final int maxNumAttributes;
	final int maxStringLength;
}
