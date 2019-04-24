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
		if(failFast)
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field boolean failFast>
	//*   2    4:ifeq            9
		{
			throw runtimeexception;
	//    3    7:aload_1         
	//    4    8:athrow          
		} else
		{
			Fabric.getLogger().e("Answers", "Invalid user input detected", ((Throwable) (runtimeexception)));
	//    5    9:invokestatic    #29  <Method Logger Fabric.getLogger()>
	//    6   12:ldc1            #31  <String "Answers">
	//    7   14:ldc1            #33  <String "Invalid user input detected">
	//    8   16:aload_1         
	//    9   17:invokeinterface #39  <Method void Logger.e(String, String, Throwable)>
			return;
	//   10   22:return          
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
	//*   1    1:ifnonnull       36
		{
			logOrThrowException(((RuntimeException) (new NullPointerException((new StringBuilder()).append(s).append(" must not be null").toString()))));
	//    2    4:aload_0         
	//    3    5:new             #84  <Class NullPointerException>
	//    4    8:dup             
	//    5    9:new             #86  <Class StringBuilder>
	//    6   12:dup             
	//    7   13:invokespecial   #87  <Method void StringBuilder()>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   10   20:ldc1            #93  <String " must not be null">
	//   11   22:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   12   25:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   13   28:invokespecial   #98  <Method void NullPointerException(String)>
	//   14   31:invokespecial   #78  <Method void logOrThrowException(RuntimeException)>
			return true;
	//   15   34:iconst_1        
	//   16   35:ireturn         
		} else
		{
			return false;
	//   17   36:iconst_0        
	//   18   37:ireturn         
		}
	}

	public String limitStringLength(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(s.length() > maxStringLength)
	//*   2    2:aload_1         
	//*   3    3:invokevirtual   #103 <Method int String.length()>
	//*   4    6:aload_0         
	//*   5    7:getfield        #18  <Field int maxStringLength>
	//*   6   10:icmple          56
		{
			logOrThrowException(((RuntimeException) (new IllegalArgumentException(String.format(Locale.US, "String is too long, truncating to %d characters", new Object[] {
				Integer.valueOf(maxStringLength)
			})))));
	//    7   13:aload_0         
	//    8   14:new             #53  <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:getstatic       #59  <Field Locale Locale.US>
	//   11   21:ldc1            #105 <String "String is too long, truncating to %d characters">
	//   12   23:iconst_1        
	//   13   24:anewarray       Object[]
	//   14   27:dup             
	//   15   28:iconst_0        
	//   16   29:aload_0         
	//   17   30:getfield        #18  <Field int maxStringLength>
	//   18   33:invokestatic    #67  <Method Integer Integer.valueOf(int)>
	//   19   36:aastore         
	//   20   37:invokestatic    #73  <Method String String.format(Locale, String, Object[])>
	//   21   40:invokespecial   #76  <Method void IllegalArgumentException(String)>
	//   22   43:invokespecial   #78  <Method void logOrThrowException(RuntimeException)>
			s1 = s.substring(0, maxStringLength);
	//   23   46:aload_1         
	//   24   47:iconst_0        
	//   25   48:aload_0         
	//   26   49:getfield        #18  <Field int maxStringLength>
	//   27   52:invokevirtual   #109 <Method String String.substring(int, int)>
	//   28   55:astore_2        
		}
		return s1;
	//   29   56:aload_2         
	//   30   57:areturn         
	}

	boolean failFast;
	final int maxNumAttributes;
	final int maxStringLength;
}
