// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.internal.config;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class HostRegexToRegionMapping
{

	public HostRegexToRegionMapping(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		if(s != null && !s.isEmpty())
	//*   2    4:aload_1         
	//*   3    5:ifnull          70
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #20  <Method boolean String.isEmpty()>
	//*   6   12:ifeq            18
	//*   7   15:goto            70
		{
			try
			{
				Pattern.compile(s);
	//    8   18:aload_1         
	//    9   19:invokestatic    #26  <Method Pattern Pattern.compile(String)>
	//   10   22:pop             
			}
	//*  11   23:aload_2         
	//*  12   24:ifnull          48
	//*  13   27:aload_2         
	//*  14   28:invokevirtual   #20  <Method boolean String.isEmpty()>
	//*  15   31:ifeq            37
	//*  16   34:goto            48
	//*  17   37:aload_0         
	//*  18   38:aload_1         
	//*  19   39:putfield        #28  <Field String a>
	//*  20   42:aload_0         
	//*  21   43:aload_2         
	//*  22   44:putfield        #30  <Field String b>
	//*  23   47:return          
	//*  24   48:new             #32  <Class IllegalArgumentException>
	//*  25   51:dup             
	//*  26   52:ldc1            #34  <String "Invalid HostRegexToRegionMapping configuration: regionName must be non-empty">
	//*  27   54:invokespecial   #37  <Method void IllegalArgumentException(String)>
	//*  28   57:athrow          
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  29   58:astore_1        
			{
				throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex is not a valid regex", ((Throwable) (s)));
	//   30   59:new             #32  <Class IllegalArgumentException>
	//   31   62:dup             
	//   32   63:ldc1            #39  <String "Invalid HostRegexToRegionMapping configuration: hostNameRegex is not a valid regex">
	//   33   65:aload_1         
	//   34   66:invokespecial   #42  <Method void IllegalArgumentException(String, Throwable)>
	//   35   69:athrow          
			}
			if(s1 != null && !s1.isEmpty())
			{
				a = s;
				b = s1;
				return;
			} else
			{
				throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: regionName must be non-empty");
			}
		} else
		{
			throw new IllegalArgumentException("Invalid HostRegexToRegionMapping configuration: hostNameRegex must be non-empty");
	//   36   70:new             #32  <Class IllegalArgumentException>
	//   37   73:dup             
	//   38   74:ldc1            #44  <String "Invalid HostRegexToRegionMapping configuration: hostNameRegex must be non-empty">
	//   39   76:invokespecial   #37  <Method void IllegalArgumentException(String)>
	//   40   79:athrow          
		}
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field String b>
	//    2    4:areturn         
	}

	private final String a;
	private final String b;
}
