// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy;

import bo.app.*;
import com.appboy.enums.Gender;
import com.appboy.enums.Month;
import com.appboy.enums.NotificationSubscriptionType;
import com.appboy.models.outgoing.AttributionData;
import com.appboy.models.outgoing.FacebookUser;
import com.appboy.models.outgoing.TwitterUser;
import com.appboy.support.AppboyLogger;
import com.appboy.support.CustomAttributeValidationUtils;
import com.appboy.support.StringUtils;
import com.appboy.support.ValidationUtils;

public class AppboyUser
{

	AppboyUser(ea ea1, bt bt1, String s, bw bw1, dx dx1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void Object()>
	//    6   12:putfield        #34  <Field Object d>
		f = s;
	//    7   15:aload_0         
	//    8   16:aload_3         
	//    9   17:putfield        #36  <Field String f>
		b = ea1;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #38  <Field ea b>
		e = bw1;
	//   13   25:aload_0         
	//   14   26:aload           4
	//   15   28:putfield        #40  <Field bw e>
		c = dx1;
	//   16   31:aload_0         
	//   17   32:aload           5
	//   18   34:putfield        #42  <Field dx c>
		g = bt1;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:putfield        #44  <Field bt g>
	//   22   42:return          
	}

	void a(String s)
	{
		Object obj = d;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object d>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(f.equals("") || f.equals(((Object) (s))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #36  <Field String f>
	//*   7   11:ldc1            #47  <String "">
	//*   8   13:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*   9   16:ifne            89
	//*  10   19:aload_0         
	//*  11   20:getfield        #36  <Field String f>
	//*  12   23:aload_1         
	//*  13   24:invokevirtual   #53  <Method boolean String.equals(Object)>
	//*  14   27:ifeq            33
			break MISSING_BLOCK_LABEL_89;
	//   15   30:goto            89
		StringBuilder stringbuilder = new StringBuilder();
	//   16   33:new             #55  <Class StringBuilder>
	//   17   36:dup             
	//   18   37:invokespecial   #56  <Method void StringBuilder()>
	//   19   40:astore_3        
		stringbuilder.append("setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [");
	//   20   41:aload_3         
	//   21   42:ldc1            #58  <String "setExternalId can not be used to change the external ID of a UserCache from a non-empty value to a new value. Was: [">
	//   22   44:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		stringbuilder.append(f);
	//   24   48:aload_3         
	//   25   49:aload_0         
	//   26   50:getfield        #36  <Field String f>
	//   27   53:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   28   56:pop             
		stringbuilder.append("], tried to change to: [");
	//   29   57:aload_3         
	//   30   58:ldc1            #64  <String "], tried to change to: [">
	//   31   60:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   32   63:pop             
		stringbuilder.append(s);
	//   33   64:aload_3         
	//   34   65:aload_1         
	//   35   66:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   36   69:pop             
		stringbuilder.append("]");
	//   37   70:aload_3         
	//   38   71:ldc1            #66  <String "]">
	//   39   73:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   40   76:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   41   77:new             #68  <Class IllegalArgumentException>
	//   42   80:dup             
	//   43   81:aload_3         
	//   44   82:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   45   85:invokespecial   #74  <Method void IllegalArgumentException(String)>
	//   46   88:athrow          
		f = s;
	//   47   89:aload_0         
	//   48   90:aload_1         
	//   49   91:putfield        #36  <Field String f>
		b.a(s);
	//   50   94:aload_0         
	//   51   95:getfield        #38  <Field ea b>
	//   52   98:aload_1         
	//   53   99:invokevirtual   #78  <Method void ea.a(String)>
		obj;
	//   54  102:aload_2         
		JVM INSTR monitorexit ;
	//   55  103:monitorexit     
		return;
	//   56  104:return          
		s;
	//   57  105:astore_1        
		obj;
	//   58  106:aload_2         
		JVM INSTR monitorexit ;
	//   59  107:monitorexit     
		throw s;
	//   60  108:aload_1         
	//   61  109:athrow          
	}

	public boolean addAlias(String s, String s1)
	{
		if(StringUtils.isNullOrBlank(s))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #88  <Method boolean StringUtils.isNullOrBlank(String)>
	//*   2    4:ifeq            18
		{
			AppboyLogger.w(a, "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.");
	//    3    7:getstatic       #27  <Field String a>
	//    4   10:ldc1            #90  <String "Invalid alias parameter: alias is required to be non-null and non-empty. Not adding alias.">
	//    5   12:invokestatic    #94  <Method int AppboyLogger.w(String, String)>
	//    6   15:pop             
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		}
		if(StringUtils.isNullOrBlank(s1))
	//*   9   18:aload_2         
	//*  10   19:invokestatic    #88  <Method boolean StringUtils.isNullOrBlank(String)>
	//*  11   22:ifeq            36
		{
			AppboyLogger.w(a, "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.");
	//   12   25:getstatic       #27  <Field String a>
	//   13   28:ldc1            #96  <String "Invalid label parameter: label is required to be non-null and non-empty. Not adding alias.">
	//   14   30:invokestatic    #94  <Method int AppboyLogger.w(String, String)>
	//   15   33:pop             
			return false;
	//   16   34:iconst_0        
	//   17   35:ireturn         
		}
		boolean flag;
		try
		{
			flag = g.a(((bo.app.cc) (ci.a(s, s1))));
	//   18   36:aload_0         
	//   19   37:getfield        #44  <Field bt g>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:invokestatic    #101 <Method ci ci.a(String, String)>
	//   23   45:invokeinterface #106 <Method boolean bt.a(bo.app.cc)>
	//   24   50:istore_3        
		}
	//*  25   51:iload_3         
	//*  26   52:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  27   53:astore_2        
		{
			String s2 = a;
	//   28   54:getstatic       #27  <Field String a>
	//   29   57:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   30   59:new             #55  <Class StringBuilder>
	//   31   62:dup             
	//   32   63:invokespecial   #56  <Method void StringBuilder()>
	//   33   66:astore          5
			stringbuilder.append("Failed to set alias: ");
	//   34   68:aload           5
	//   35   70:ldc1            #108 <String "Failed to set alias: ">
	//   36   72:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
			stringbuilder.append(s);
	//   38   76:aload           5
	//   39   78:aload_1         
	//   40   79:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
			AppboyLogger.e(s2, stringbuilder.toString(), ((Throwable) (s1)));
	//   42   83:aload           4
	//   43   85:aload           5
	//   44   87:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   45   90:aload_2         
	//   46   91:invokestatic    #111 <Method int AppboyLogger.e(String, String, Throwable)>
	//   47   94:pop             
			return false;
	//   48   95:iconst_0        
	//   49   96:ireturn         
		}
		return flag;
	}

	public boolean addToCustomAttributeArray(String s, String s1)
	{
		String s2 = s;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!CustomAttributeValidationUtils.isValidCustomAttributeKey(s, c.i()))
	//*   2    3:aload_1         
	//*   3    4:aload_0         
	//*   4    5:getfield        #42  <Field dx c>
	//*   5    8:invokevirtual   #118 <Method java.util.Set dx.i()>
	//*   6   11:invokestatic    #124 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//*   7   14:ifne            31
		{
			s2 = s;
	//    8   17:aload_1         
	//    9   18:astore          4
			boolean flag;
			try
			{
				AppboyLogger.w(a, "Custom attribute key was invalid. Not adding to attribute array.");
	//   10   20:getstatic       #27  <Field String a>
	//   11   23:ldc1            #126 <String "Custom attribute key was invalid. Not adding to attribute array.">
	//   12   25:invokestatic    #94  <Method int AppboyLogger.w(String, String)>
	//   13   28:pop             
			}
	//*  14   29:iconst_0        
	//*  15   30:ireturn         
	//*  16   31:aload_1         
	//*  17   32:astore          4
	//*  18   34:aload_2         
	//*  19   35:invokestatic    #129 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeValue(String)>
	//*  20   38:ifne            43
	//*  21   41:iconst_0        
	//*  22   42:ireturn         
	//*  23   43:aload_1         
	//*  24   44:astore          4
	//*  25   46:aload_1         
	//*  26   47:invokestatic    #135 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//*  27   50:astore_1        
	//*  28   51:aload_1         
	//*  29   52:astore          4
	//*  30   54:aload_1         
	//*  31   55:aload_2         
	//*  32   56:invokestatic    #135 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//*  33   59:invokestatic    #137 <Method ci ci.e(String, String)>
	//*  34   62:astore_2        
	//*  35   63:aload_1         
	//*  36   64:astore          4
	//*  37   66:aload_0         
	//*  38   67:getfield        #44  <Field bt g>
	//*  39   70:aload_2         
	//*  40   71:invokeinterface #106 <Method boolean bt.a(bo.app.cc)>
	//*  41   76:istore_3        
	//*  42   77:iload_3         
	//*  43   78:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  44   79:astore_1        
			{
				s1 = a;
	//   45   80:getstatic       #27  <Field String a>
	//   46   83:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   47   84:new             #55  <Class StringBuilder>
	//   48   87:dup             
	//   49   88:invokespecial   #56  <Method void StringBuilder()>
	//   50   91:astore          5
				stringbuilder.append("Failed to add custom attribute with key '");
	//   51   93:aload           5
	//   52   95:ldc1            #139 <String "Failed to add custom attribute with key '">
	//   53   97:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   54  100:pop             
				stringbuilder.append(s2);
	//   55  101:aload           5
	//   56  103:aload           4
	//   57  105:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   58  108:pop             
				stringbuilder.append("'.");
	//   59  109:aload           5
	//   60  111:ldc1            #141 <String "'.">
	//   61  113:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   62  116:pop             
				AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (s)));
	//   63  117:aload_2         
	//   64  118:aload           5
	//   65  120:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   66  123:aload_1         
	//   67  124:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   68  127:pop             
				return false;
	//   69  128:iconst_0        
	//   70  129:ireturn         
			}
			return false;
		}
		s2 = s;
		if(!CustomAttributeValidationUtils.isValidCustomAttributeValue(s1))
			return false;
		s2 = s;
		s = ValidationUtils.ensureAppboyFieldLength(s);
		s2 = s;
		s1 = ((String) (ci.e(s, ValidationUtils.ensureAppboyFieldLength(s1))));
		s2 = s;
		flag = g.a(((bo.app.cc) (s1)));
		return flag;
	}

	public String getUserId()
	{
		String s;
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			s = f;
	//    5    7:aload_0         
	//    6    8:getfield        #36  <Field String f>
	//    7   11:astore_2        
		}
	//    8   12:aload_1         
	//    9   13:monitorexit     
		return s;
	//   10   14:aload_2         
	//   11   15:areturn         
		exception;
	//   12   16:astore_2        
		obj;
	//   13   17:aload_1         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_2         
	//   16   20:athrow          
	}

	public boolean incrementCustomUserAttribute(String s)
	{
		return incrementCustomUserAttribute(s, 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #150 <Method boolean incrementCustomUserAttribute(String, int)>
	//    4    6:ireturn         
	}

	public boolean incrementCustomUserAttribute(String s, int i)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!CustomAttributeValidationUtils.isValidCustomAttributeKey(s, c.i()))
	//*   2    3:aload_1         
	//*   3    4:aload_0         
	//*   4    5:getfield        #42  <Field dx c>
	//*   5    8:invokevirtual   #118 <Method java.util.Set dx.i()>
	//*   6   11:invokestatic    #124 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//*   7   14:ifne            19
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
		s1 = s;
	//   10   19:aload_1         
	//   11   20:astore          4
		boolean flag;
		ci ci1;
		try
		{
			s = ValidationUtils.ensureAppboyFieldLength(s);
	//   12   22:aload_1         
	//   13   23:invokestatic    #135 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   14   26:astore_1        
		}
	//*  15   27:aload_1         
	//*  16   28:astore          4
	//*  17   30:aload_1         
	//*  18   31:iload_2         
	//*  19   32:invokestatic    #153 <Method ci ci.a(String, int)>
	//*  20   35:astore          5
	//*  21   37:aload_1         
	//*  22   38:astore          4
	//*  23   40:aload_0         
	//*  24   41:getfield        #44  <Field bt g>
	//*  25   44:aload           5
	//*  26   46:invokeinterface #106 <Method boolean bt.a(bo.app.cc)>
	//*  27   51:istore_3        
	//*  28   52:iload_3         
	//*  29   53:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  30   54:astore_1        
		{
			String s2 = a;
	//   31   55:getstatic       #27  <Field String a>
	//   32   58:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   33   60:new             #55  <Class StringBuilder>
	//   34   63:dup             
	//   35   64:invokespecial   #56  <Method void StringBuilder()>
	//   36   67:astore          6
			stringbuilder.append("Failed to increment custom attribute ");
	//   37   69:aload           6
	//   38   71:ldc1            #155 <String "Failed to increment custom attribute ">
	//   39   73:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   40   76:pop             
			stringbuilder.append(s1);
	//   41   77:aload           6
	//   42   79:aload           4
	//   43   81:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   44   84:pop             
			stringbuilder.append(" by ");
	//   45   85:aload           6
	//   46   87:ldc1            #157 <String " by ">
	//   47   89:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   48   92:pop             
			stringbuilder.append(i);
	//   49   93:aload           6
	//   50   95:iload_2         
	//   51   96:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   52   99:pop             
			stringbuilder.append(".");
	//   53  100:aload           6
	//   54  102:ldc1            #162 <String ".">
	//   55  104:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   56  107:pop             
			AppboyLogger.w(s2, stringbuilder.toString(), ((Throwable) (s)));
	//   57  108:aload           5
	//   58  110:aload           6
	//   59  112:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   60  115:aload_1         
	//   61  116:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   62  119:pop             
			return false;
	//   63  120:iconst_0        
	//   64  121:ireturn         
		}
		s1 = s;
		ci1 = ci.a(s, i);
		s1 = s;
		flag = g.a(((bo.app.cc) (ci1)));
		return flag;
	}

	public boolean removeFromCustomAttributeArray(String s, String s1)
	{
		String s2 = s;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!CustomAttributeValidationUtils.isValidCustomAttributeKey(s, c.i()))
	//*   2    3:aload_1         
	//*   3    4:aload_0         
	//*   4    5:getfield        #42  <Field dx c>
	//*   5    8:invokevirtual   #118 <Method java.util.Set dx.i()>
	//*   6   11:invokestatic    #124 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//*   7   14:ifne            31
		{
			s2 = s;
	//    8   17:aload_1         
	//    9   18:astore          4
			boolean flag;
			try
			{
				AppboyLogger.w(a, "Custom attribute key was invalid. Not removing from attribute array.");
	//   10   20:getstatic       #27  <Field String a>
	//   11   23:ldc1            #165 <String "Custom attribute key was invalid. Not removing from attribute array.">
	//   12   25:invokestatic    #94  <Method int AppboyLogger.w(String, String)>
	//   13   28:pop             
			}
	//*  14   29:iconst_0        
	//*  15   30:ireturn         
	//*  16   31:aload_1         
	//*  17   32:astore          4
	//*  18   34:aload_2         
	//*  19   35:invokestatic    #129 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeValue(String)>
	//*  20   38:ifne            43
	//*  21   41:iconst_0        
	//*  22   42:ireturn         
	//*  23   43:aload_1         
	//*  24   44:astore          4
	//*  25   46:aload_1         
	//*  26   47:invokestatic    #135 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//*  27   50:astore_1        
	//*  28   51:aload_1         
	//*  29   52:astore          4
	//*  30   54:aload_1         
	//*  31   55:aload_2         
	//*  32   56:invokestatic    #135 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//*  33   59:invokestatic    #167 <Method ci ci.f(String, String)>
	//*  34   62:astore_2        
	//*  35   63:aload_1         
	//*  36   64:astore          4
	//*  37   66:aload_0         
	//*  38   67:getfield        #44  <Field bt g>
	//*  39   70:aload_2         
	//*  40   71:invokeinterface #106 <Method boolean bt.a(bo.app.cc)>
	//*  41   76:istore_3        
	//*  42   77:iload_3         
	//*  43   78:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  44   79:astore_1        
			{
				s1 = a;
	//   45   80:getstatic       #27  <Field String a>
	//   46   83:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   47   84:new             #55  <Class StringBuilder>
	//   48   87:dup             
	//   49   88:invokespecial   #56  <Method void StringBuilder()>
	//   50   91:astore          5
				stringbuilder.append("Failed to remove custom attribute with key '");
	//   51   93:aload           5
	//   52   95:ldc1            #169 <String "Failed to remove custom attribute with key '">
	//   53   97:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   54  100:pop             
				stringbuilder.append(s2);
	//   55  101:aload           5
	//   56  103:aload           4
	//   57  105:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   58  108:pop             
				stringbuilder.append("'.");
	//   59  109:aload           5
	//   60  111:ldc1            #141 <String "'.">
	//   61  113:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   62  116:pop             
				AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (s)));
	//   63  117:aload_2         
	//   64  118:aload           5
	//   65  120:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   66  123:aload_1         
	//   67  124:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   68  127:pop             
				return false;
	//   69  128:iconst_0        
	//   70  129:ireturn         
			}
			return false;
		}
		s2 = s;
		if(!CustomAttributeValidationUtils.isValidCustomAttributeValue(s1))
			return false;
		s2 = s;
		s = ValidationUtils.ensureAppboyFieldLength(s);
		s2 = s;
		s1 = ((String) (ci.f(s, ValidationUtils.ensureAppboyFieldLength(s1))));
		s2 = s;
		flag = g.a(((bo.app.cc) (s1)));
		return flag;
	}

	public boolean setAttributionData(AttributionData attributiondata)
	{
		try
		{
			b.a(attributiondata);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #174 <Method void ea.a(AttributionData)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(AttributionData attributiondata)
	//*   6   10:astore_1        
		{
			AppboyLogger.w(a, "Failed to set attribution data.", ((Throwable) (attributiondata)));
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:ldc1            #176 <String "Failed to set attribution data.">
	//    9   16:aload_1         
	//   10   17:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   11   20:pop             
			return false;
	//   12   21:iconst_0        
	//   13   22:ireturn         
		}
		return true;
	}

	public boolean setAvatarImageUrl(String s)
	{
		try
		{
			b.i(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #179 <Method void ea.i(String)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   10:astore_1        
		{
			AppboyLogger.w(a, "Failed to set the avatar image URL.", ((Throwable) (s)));
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:ldc1            #181 <String "Failed to set the avatar image URL.">
	//    9   16:aload_1         
	//   10   17:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   11   20:pop             
			return false;
	//   12   21:iconst_0        
	//   13   22:ireturn         
		}
		return true;
	}

	public boolean setCountry(String s)
	{
		try
		{
			b.e(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #184 <Method void ea.e(String)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			String s1 = a;
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #55  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #56  <Method void StringBuilder()>
	//   12   22:astore          4
			stringbuilder.append("Failed to set country to: ");
	//   13   24:aload           4
	//   14   26:ldc1            #186 <String "Failed to set country to: ">
	//   15   28:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
			stringbuilder.append(s);
	//   17   32:aload           4
	//   18   34:aload_1         
	//   19   35:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   21   39:aload_3         
	//   22   40:aload           4
	//   23   42:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   24   45:aload_2         
	//   25   46:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   26   49:pop             
			return false;
	//   27   50:iconst_0        
	//   28   51:ireturn         
		}
		return true;
	}

	public boolean setCustomAttributeArray(String s, String as[])
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!CustomAttributeValidationUtils.isValidCustomAttributeKey(s, c.i()))
	//*   2    3:aload_1         
	//*   3    4:aload_0         
	//*   4    5:getfield        #42  <Field dx c>
	//*   5    8:invokevirtual   #118 <Method java.util.Set dx.i()>
	//*   6   11:invokestatic    #124 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//*   7   14:ifne            19
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
		s1 = s;
	//   10   19:aload_1         
	//   11   20:astore          4
		boolean flag;
		String s2;
		try
		{
			s2 = ValidationUtils.ensureAppboyFieldLength(s);
	//   12   22:aload_1         
	//   13   23:invokestatic    #135 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//   14   26:astore          5
		}
	//*  15   28:aload_2         
	//*  16   29:astore_1        
	//*  17   30:aload_2         
	//*  18   31:ifnull          43
	//*  19   34:aload           5
	//*  20   36:astore          4
	//*  21   38:aload_2         
	//*  22   39:invokestatic    #192 <Method String[] CustomAttributeValidationUtils.ensureCustomAttributeArrayValues(String[])>
	//*  23   42:astore_1        
	//*  24   43:aload           5
	//*  25   45:astore          4
	//*  26   47:aload           5
	//*  27   49:aload_1         
	//*  28   50:invokestatic    #195 <Method ci ci.a(String, String[])>
	//*  29   53:astore_1        
	//*  30   54:aload           5
	//*  31   56:astore          4
	//*  32   58:aload_0         
	//*  33   59:getfield        #44  <Field bt g>
	//*  34   62:aload_1         
	//*  35   63:invokeinterface #106 <Method boolean bt.a(bo.app.cc)>
	//*  36   68:istore_3        
	//*  37   69:iload_3         
	//*  38   70:ireturn         
	//*  39   71:getstatic       #27  <Field String a>
	//*  40   74:astore_1        
	//*  41   75:new             #55  <Class StringBuilder>
	//*  42   78:dup             
	//*  43   79:invokespecial   #56  <Method void StringBuilder()>
	//*  44   82:astore_2        
	//*  45   83:aload_2         
	//*  46   84:ldc1            #197 <String "Failed to set custom attribute array with key: '">
	//*  47   86:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  48   89:pop             
	//*  49   90:aload_2         
	//*  50   91:aload           4
	//*  51   93:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  52   96:pop             
	//*  53   97:aload_2         
	//*  54   98:ldc1            #141 <String "'.">
	//*  55  100:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  56  103:pop             
	//*  57  104:aload_1         
	//*  58  105:aload_2         
	//*  59  106:invokevirtual   #72  <Method String StringBuilder.toString()>
	//*  60  109:invokestatic    #94  <Method int AppboyLogger.w(String, String)>
	//*  61  112:pop             
	//*  62  113:iconst_0        
	//*  63  114:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			s = a;
			as = ((String []) (new StringBuilder()));
			((StringBuilder) (as)).append("Failed to set custom attribute array with key: '");
			((StringBuilder) (as)).append(s1);
			((StringBuilder) (as)).append("'.");
			AppboyLogger.w(s, ((StringBuilder) (as)).toString());
			return false;
		}
		s = ((String) (as));
		if(as == null)
			break MISSING_BLOCK_LABEL_43;
		s1 = s2;
		s = ((String) (CustomAttributeValidationUtils.ensureCustomAttributeArrayValues(as)));
		s1 = s2;
		s = ((String) (ci.a(s2, ((String []) (s)))));
		s1 = s2;
		flag = g.a(((bo.app.cc) (s)));
		return flag;
	//*  64  115:astore_1        
	//*  65  116:goto            71
	}

	public boolean setCustomUserAttribute(String s, double d1)
	{
		boolean flag;
		try
		{
			flag = b.a(s, ((Object) (Double.valueOf(d1))));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:dload_2         
	//    4    6:invokestatic    #205 <Method Double Double.valueOf(double)>
	//    5    9:invokevirtual   #208 <Method boolean ea.a(String, Object)>
	//    6   12:istore          4
		}
	//*   7   14:iload           4
	//*   8   16:ireturn         
		catch(Exception exception)
	//*   9   17:astore          5
		{
			String s1 = a;
	//   10   19:getstatic       #27  <Field String a>
	//   11   22:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #55  <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #56  <Method void StringBuilder()>
	//   15   31:astore          7
			stringbuilder.append("Failed to set custom double attribute ");
	//   16   33:aload           7
	//   17   35:ldc1            #210 <String "Failed to set custom double attribute ">
	//   18   37:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
			stringbuilder.append(s);
	//   20   41:aload           7
	//   21   43:aload_1         
	//   22   44:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder.append(".");
	//   24   48:aload           7
	//   25   50:ldc1            #162 <String ".">
	//   26   52:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   28   56:aload           6
	//   29   58:aload           7
	//   30   60:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   31   63:aload           5
	//   32   65:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   33   68:pop             
			return false;
	//   34   69:iconst_0        
	//   35   70:ireturn         
		}
		return flag;
	}

	public boolean setCustomUserAttribute(String s, float f1)
	{
		boolean flag;
		try
		{
			flag = b.a(s, ((Object) (Float.valueOf(f1))));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:fload_2         
	//    4    6:invokestatic    #216 <Method Float Float.valueOf(float)>
	//    5    9:invokevirtual   #208 <Method boolean ea.a(String, Object)>
	//    6   12:istore_3        
		}
	//*   7   13:iload_3         
	//*   8   14:ireturn         
		catch(Exception exception)
	//*   9   15:astore          4
		{
			String s1 = a;
	//   10   17:getstatic       #27  <Field String a>
	//   11   20:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   12   22:new             #55  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #56  <Method void StringBuilder()>
	//   15   29:astore          6
			stringbuilder.append("Failed to set custom float attribute ");
	//   16   31:aload           6
	//   17   33:ldc1            #218 <String "Failed to set custom float attribute ">
	//   18   35:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(s);
	//   20   39:aload           6
	//   21   41:aload_1         
	//   22   42:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			stringbuilder.append(".");
	//   24   46:aload           6
	//   25   48:ldc1            #162 <String ".">
	//   26   50:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   28   54:aload           5
	//   29   56:aload           6
	//   30   58:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   31   61:aload           4
	//   32   63:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   33   66:pop             
			return false;
	//   34   67:iconst_0        
	//   35   68:ireturn         
		}
		return flag;
	}

	public boolean setCustomUserAttribute(String s, int i)
	{
		boolean flag;
		try
		{
			flag = b.a(s, ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #223 <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #208 <Method boolean ea.a(String, Object)>
	//    6   12:istore_3        
		}
	//*   7   13:iload_3         
	//*   8   14:ireturn         
		catch(Exception exception)
	//*   9   15:astore          4
		{
			String s1 = a;
	//   10   17:getstatic       #27  <Field String a>
	//   11   20:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   12   22:new             #55  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #56  <Method void StringBuilder()>
	//   15   29:astore          6
			stringbuilder.append("Failed to set custom integer attribute ");
	//   16   31:aload           6
	//   17   33:ldc1            #225 <String "Failed to set custom integer attribute ">
	//   18   35:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(s);
	//   20   39:aload           6
	//   21   41:aload_1         
	//   22   42:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			stringbuilder.append(".");
	//   24   46:aload           6
	//   25   48:ldc1            #162 <String ".">
	//   26   50:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   28   54:aload           5
	//   29   56:aload           6
	//   30   58:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   31   61:aload           4
	//   32   63:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   33   66:pop             
			return false;
	//   34   67:iconst_0        
	//   35   68:ireturn         
		}
		return flag;
	}

	public boolean setCustomUserAttribute(String s, long l)
	{
		boolean flag;
		try
		{
			flag = b.a(s, ((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokestatic    #231 <Method Long Long.valueOf(long)>
	//    5    9:invokevirtual   #208 <Method boolean ea.a(String, Object)>
	//    6   12:istore          4
		}
	//*   7   14:iload           4
	//*   8   16:ireturn         
		catch(Exception exception)
	//*   9   17:astore          5
		{
			String s1 = a;
	//   10   19:getstatic       #27  <Field String a>
	//   11   22:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   12   24:new             #55  <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #56  <Method void StringBuilder()>
	//   15   31:astore          7
			stringbuilder.append("Failed to set custom long attribute ");
	//   16   33:aload           7
	//   17   35:ldc1            #233 <String "Failed to set custom long attribute ">
	//   18   37:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
			stringbuilder.append(s);
	//   20   41:aload           7
	//   21   43:aload_1         
	//   22   44:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder.append(".");
	//   24   48:aload           7
	//   25   50:ldc1            #162 <String ".">
	//   26   52:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   28   56:aload           6
	//   29   58:aload           7
	//   30   60:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   31   63:aload           5
	//   32   65:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   33   68:pop             
			return false;
	//   34   69:iconst_0        
	//   35   70:ireturn         
		}
		return flag;
	}

	public boolean setCustomUserAttribute(String s, String s1)
	{
		boolean flag;
		try
		{
			flag = b.a(s, ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #208 <Method boolean ea.a(String, Object)>
	//    5    9:istore_3        
		}
	//*   6   10:iload_3         
	//*   7   11:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*   8   12:astore_2        
		{
			String s2 = a;
	//    9   13:getstatic       #27  <Field String a>
	//   10   16:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   11   18:new             #55  <Class StringBuilder>
	//   12   21:dup             
	//   13   22:invokespecial   #56  <Method void StringBuilder()>
	//   14   25:astore          5
			stringbuilder.append("Failed to set custom string attribute ");
	//   15   27:aload           5
	//   16   29:ldc1            #235 <String "Failed to set custom string attribute ">
	//   17   31:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			stringbuilder.append(s);
	//   19   35:aload           5
	//   20   37:aload_1         
	//   21   38:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
			stringbuilder.append(".");
	//   23   42:aload           5
	//   24   44:ldc1            #162 <String ".">
	//   25   46:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
			AppboyLogger.w(s2, stringbuilder.toString(), ((Throwable) (s1)));
	//   27   50:aload           4
	//   28   52:aload           5
	//   29   54:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   30   57:aload_2         
	//   31   58:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   32   61:pop             
			return false;
	//   33   62:iconst_0        
	//   34   63:ireturn         
		}
		return flag;
	}

	public boolean setCustomUserAttribute(String s, boolean flag)
	{
		try
		{
			flag = b.a(s, ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #241 <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokevirtual   #208 <Method boolean ea.a(String, Object)>
	//    6   12:istore_2        
		}
	//*   7   13:iload_2         
	//*   8   14:ireturn         
		catch(Exception exception)
	//*   9   15:astore_3        
		{
			String s1 = a;
	//   10   16:getstatic       #27  <Field String a>
	//   11   19:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   12   21:new             #55  <Class StringBuilder>
	//   13   24:dup             
	//   14   25:invokespecial   #56  <Method void StringBuilder()>
	//   15   28:astore          5
			stringbuilder.append("Failed to set custom boolean attribute ");
	//   16   30:aload           5
	//   17   32:ldc1            #243 <String "Failed to set custom boolean attribute ">
	//   18   34:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(s);
	//   20   38:aload           5
	//   21   40:aload_1         
	//   22   41:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			stringbuilder.append(".");
	//   24   45:aload           5
	//   25   47:ldc1            #162 <String ".">
	//   26   49:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   28   53:aload           4
	//   29   55:aload           5
	//   30   57:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   31   60:aload_3         
	//   32   61:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   33   64:pop             
			return false;
	//   34   65:iconst_0        
	//   35   66:ireturn         
		}
		return flag;
	}

	public boolean setCustomUserAttributeToNow(String s)
	{
		boolean flag;
		try
		{
			flag = b.a(s, eb.a());
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokestatic    #249 <Method long eb.a()>
	//    4    8:invokevirtual   #251 <Method boolean ea.a(String, long)>
	//    5   11:istore_2        
		}
	//*   6   12:iload_2         
	//*   7   13:ireturn         
		catch(Exception exception)
	//*   8   14:astore_3        
		{
			String s1 = a;
	//    9   15:getstatic       #27  <Field String a>
	//   10   18:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   11   20:new             #55  <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #56  <Method void StringBuilder()>
	//   14   27:astore          5
			stringbuilder.append("Failed to set custom attribute ");
	//   15   29:aload           5
	//   16   31:ldc1            #253 <String "Failed to set custom attribute ">
	//   17   33:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(s);
	//   19   37:aload           5
	//   20   39:aload_1         
	//   21   40:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			stringbuilder.append(" to now.");
	//   23   44:aload           5
	//   24   46:ldc1            #255 <String " to now.">
	//   25   48:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   27   52:aload           4
	//   28   54:aload           5
	//   29   56:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   30   59:aload_3         
	//   31   60:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   32   63:pop             
			return false;
	//   33   64:iconst_0        
	//   34   65:ireturn         
		}
		return flag;
	}

	public boolean setCustomUserAttributeToSecondsFromEpoch(String s, long l)
	{
		boolean flag;
		try
		{
			flag = b.a(s, l);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #251 <Method boolean ea.a(String, long)>
	//    5    9:istore          4
		}
	//*   6   11:iload           4
	//*   7   13:ireturn         
		catch(Exception exception)
	//*   8   14:astore          5
		{
			String s1 = a;
	//    9   16:getstatic       #27  <Field String a>
	//   10   19:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #55  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #56  <Method void StringBuilder()>
	//   14   28:astore          7
			stringbuilder.append("Failed to set custom attribute ");
	//   15   30:aload           7
	//   16   32:ldc1            #253 <String "Failed to set custom attribute ">
	//   17   34:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			stringbuilder.append(s);
	//   19   38:aload           7
	//   20   40:aload_1         
	//   21   41:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			stringbuilder.append(" to ");
	//   23   45:aload           7
	//   24   47:ldc2            #258 <String " to ">
	//   25   50:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			stringbuilder.append(l);
	//   27   54:aload           7
	//   28   56:lload_2         
	//   29   57:invokevirtual   #261 <Method StringBuilder StringBuilder.append(long)>
	//   30   60:pop             
			stringbuilder.append(" seconds from epoch.");
	//   31   61:aload           7
	//   32   63:ldc2            #263 <String " seconds from epoch.">
	//   33   66:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   34   69:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   35   70:aload           6
	//   36   72:aload           7
	//   37   74:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   38   77:aload           5
	//   39   79:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   40   82:pop             
			return false;
	//   41   83:iconst_0        
	//   42   84:ireturn         
		}
		return flag;
	}

	public boolean setDateOfBirth(int i, Month month, int j)
	{
		boolean flag;
		try
		{
			flag = b.a(i, month, j);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #267 <Method boolean ea.a(int, Month, int)>
	//    6   10:istore          4
		}
	//*   7   12:iload           4
	//*   8   14:ireturn         
		catch(Exception exception)
	//*   9   15:astore          5
		{
			String s = a;
	//   10   17:getstatic       #27  <Field String a>
	//   11   20:astore          6
			StringBuilder stringbuilder = new StringBuilder();
	//   12   22:new             #55  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #56  <Method void StringBuilder()>
	//   15   29:astore          7
			stringbuilder.append("Failed to set date of birth to: ");
	//   16   31:aload           7
	//   17   33:ldc2            #269 <String "Failed to set date of birth to: ">
	//   18   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			stringbuilder.append(i);
	//   20   40:aload           7
	//   21   42:iload_1         
	//   22   43:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   23   46:pop             
			stringbuilder.append("-");
	//   24   47:aload           7
	//   25   49:ldc2            #271 <String "-">
	//   26   52:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			stringbuilder.append(month.getValue());
	//   28   56:aload           7
	//   29   58:aload_2         
	//   30   59:invokevirtual   #277 <Method int Month.getValue()>
	//   31   62:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   32   65:pop             
			stringbuilder.append("-");
	//   33   66:aload           7
	//   34   68:ldc2            #271 <String "-">
	//   35   71:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
			stringbuilder.append(j);
	//   37   75:aload           7
	//   38   77:iload_3         
	//   39   78:invokevirtual   #160 <Method StringBuilder StringBuilder.append(int)>
	//   40   81:pop             
			AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   41   82:aload           6
	//   42   84:aload           7
	//   43   86:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   44   89:aload           5
	//   45   91:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   46   94:pop             
			return false;
	//   47   95:iconst_0        
	//   48   96:ireturn         
		}
		return flag;
	}

	public boolean setEmail(String s)
	{
		boolean flag;
		try
		{
			flag = b.d(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #280 <Method boolean ea.d(String)>
	//    4    8:istore_2        
		}
	//*   5    9:iload_2         
	//*   6   10:ireturn         
		catch(Exception exception)
	//*   7   11:astore_3        
		{
			String s1 = a;
	//    8   12:getstatic       #27  <Field String a>
	//    9   15:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   10   17:new             #55  <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #56  <Method void StringBuilder()>
	//   13   24:astore          5
			stringbuilder.append("Failed to set email to: ");
	//   14   26:aload           5
	//   15   28:ldc2            #282 <String "Failed to set email to: ">
	//   16   31:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			stringbuilder.append(s);
	//   18   35:aload           5
	//   19   37:aload_1         
	//   20   38:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   22   42:aload           4
	//   23   44:aload           5
	//   24   46:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   25   49:aload_3         
	//   26   50:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   27   53:pop             
			return false;
	//   28   54:iconst_0        
	//   29   55:ireturn         
		}
		return flag;
	}

	public boolean setEmailNotificationSubscriptionType(NotificationSubscriptionType notificationsubscriptiontype)
	{
		try
		{
			b.a(notificationsubscriptiontype);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #287 <Method void ea.a(NotificationSubscriptionType)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			String s = a;
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #55  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #56  <Method void StringBuilder()>
	//   12   22:astore          4
			stringbuilder.append("Failed to set email notification subscription to: ");
	//   13   24:aload           4
	//   14   26:ldc2            #289 <String "Failed to set email notification subscription to: ">
	//   15   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(((Object) (notificationsubscriptiontype)));
	//   17   33:aload           4
	//   18   35:aload_1         
	//   19   36:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   20   39:pop             
			AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   21   40:aload_3         
	//   22   41:aload           4
	//   23   43:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   24   46:aload_2         
	//   25   47:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   26   50:pop             
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
		return true;
	}

	public boolean setFacebookData(FacebookUser facebookuser)
	{
		try
		{
			b.a(facebookuser);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #297 <Method void ea.a(FacebookUser)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(FacebookUser facebookuser)
	//*   6   10:astore_1        
		{
			AppboyLogger.w(a, "Failed to set Facebook user data.", ((Throwable) (facebookuser)));
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:ldc2            #299 <String "Failed to set Facebook user data.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   11   21:pop             
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
		return true;
	}

	public boolean setFirstName(String s)
	{
		try
		{
			b.b(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #302 <Method void ea.b(String)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			String s1 = a;
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #55  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #56  <Method void StringBuilder()>
	//   12   22:astore          4
			stringbuilder.append("Failed to set first name to: ");
	//   13   24:aload           4
	//   14   26:ldc2            #304 <String "Failed to set first name to: ">
	//   15   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(s);
	//   17   33:aload           4
	//   18   35:aload_1         
	//   19   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   21   40:aload_3         
	//   22   41:aload           4
	//   23   43:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   24   46:aload_2         
	//   25   47:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   26   50:pop             
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
		return true;
	}

	public boolean setGender(Gender gender)
	{
		try
		{
			b.a(gender);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #309 <Method void ea.a(Gender)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			String s = a;
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #55  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #56  <Method void StringBuilder()>
	//   12   22:astore          4
			stringbuilder.append("Failed to set gender to: ");
	//   13   24:aload           4
	//   14   26:ldc2            #311 <String "Failed to set gender to: ">
	//   15   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(((Object) (gender)));
	//   17   33:aload           4
	//   18   35:aload_1         
	//   19   36:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   20   39:pop             
			AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   21   40:aload_3         
	//   22   41:aload           4
	//   23   43:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   24   46:aload_2         
	//   25   47:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   26   50:pop             
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
		return true;
	}

	public boolean setHomeCity(String s)
	{
		try
		{
			b.f(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #314 <Method void ea.f(String)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			String s1 = a;
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #55  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #56  <Method void StringBuilder()>
	//   12   22:astore          4
			stringbuilder.append("Failed to set home city to: ");
	//   13   24:aload           4
	//   14   26:ldc2            #316 <String "Failed to set home city to: ">
	//   15   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(s);
	//   17   33:aload           4
	//   18   35:aload_1         
	//   19   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   21   40:aload_3         
	//   22   41:aload           4
	//   23   43:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   24   46:aload_2         
	//   25   47:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   26   50:pop             
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
		return true;
	}

	public boolean setLanguage(String s)
	{
		try
		{
			b.g(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #319 <Method void ea.g(String)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			String s1 = a;
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #55  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #56  <Method void StringBuilder()>
	//   12   22:astore          4
			stringbuilder.append("Failed to set language to: ");
	//   13   24:aload           4
	//   14   26:ldc2            #321 <String "Failed to set language to: ">
	//   15   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(s);
	//   17   33:aload           4
	//   18   35:aload_1         
	//   19   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   21   40:aload_3         
	//   22   41:aload           4
	//   23   43:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   24   46:aload_2         
	//   25   47:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   26   50:pop             
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
		return true;
	}

	public void setLastKnownLocation(double d1, double d2, Double double1, Double double2)
	{
		try
		{
			double1 = ((Double) (new cj(d1, d2, double1, double2)));
	//    0    0:new             #325 <Class cj>
	//    1    3:dup             
	//    2    4:dload_1         
	//    3    5:dload_3         
	//    4    6:aload           5
	//    5    8:aload           6
	//    6   10:invokespecial   #327 <Method void cj(double, double, Double, Double)>
	//    7   13:astore          5
			e.a(((bo.app.cd) (double1)));
	//    8   15:aload_0         
	//    9   16:getfield        #40  <Field bw e>
	//   10   19:aload           5
	//   11   21:invokeinterface #332 <Method boolean bw.a(bo.app.cd)>
	//   12   26:pop             
			return;
	//   13   27:return          
		}
		// Misplaced declaration of an exception variable
		catch(Double double1)
	//*  14   28:astore          5
		{
			AppboyLogger.w(a, "Failed to manually set location.", ((Throwable) (double1)));
	//   15   30:getstatic       #27  <Field String a>
	//   16   33:ldc2            #334 <String "Failed to manually set location.">
	//   17   36:aload           5
	//   18   38:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   19   41:pop             
		}
	//   20   42:return          
	}

	public boolean setLastName(String s)
	{
		try
		{
			b.c(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #337 <Method void ea.c(String)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			String s1 = a;
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #55  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #56  <Method void StringBuilder()>
	//   12   22:astore          4
			stringbuilder.append("Failed to set last name to: ");
	//   13   24:aload           4
	//   14   26:ldc2            #339 <String "Failed to set last name to: ">
	//   15   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(s);
	//   17   33:aload           4
	//   18   35:aload_1         
	//   19   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   21   40:aload_3         
	//   22   41:aload           4
	//   23   43:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   24   46:aload_2         
	//   25   47:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   26   50:pop             
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
		return true;
	}

	public void setLocationCustomAttribute(String s, double d1, double d2)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore          6
		Object obj;
		if(!CustomAttributeValidationUtils.isValidCustomAttributeKey(s, c.i()))
	//*   2    3:aload_1         
	//*   3    4:aload_0         
	//*   4    5:getfield        #42  <Field dx c>
	//*   5    8:invokevirtual   #118 <Method java.util.Set dx.i()>
	//*   6   11:invokestatic    #124 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//*   7   14:ifne            31
		{
			s1 = s;
	//    8   17:aload_1         
	//    9   18:astore          6
			StringBuilder stringbuilder;
			try
			{
				AppboyLogger.w(a, "Custom location attribute key was invalid. Not setting attribute.");
	//   10   20:getstatic       #27  <Field String a>
	//   11   23:ldc2            #343 <String "Custom location attribute key was invalid. Not setting attribute.">
	//   12   26:invokestatic    #94  <Method int AppboyLogger.w(String, String)>
	//   13   29:pop             
				return;
	//   14   30:return          
			}
	//*  15   31:aload_1         
	//*  16   32:astore          6
	//*  17   34:dload_2         
	//*  18   35:dload           4
	//*  19   37:invokestatic    #347 <Method boolean ValidationUtils.isValidLocation(double, double)>
	//*  20   40:ifne            135
	//*  21   43:aload_1         
	//*  22   44:astore          6
	//*  23   46:getstatic       #27  <Field String a>
	//*  24   49:astore          7
	//*  25   51:aload_1         
	//*  26   52:astore          6
	//*  27   54:new             #55  <Class StringBuilder>
	//*  28   57:dup             
	//*  29   58:invokespecial   #56  <Method void StringBuilder()>
	//*  30   61:astore          8
	//*  31   63:aload_1         
	//*  32   64:astore          6
	//*  33   66:aload           8
	//*  34   68:ldc2            #349 <String "Cannot set custom location attribute due with invalid latitude '">
	//*  35   71:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  36   74:pop             
	//*  37   75:aload_1         
	//*  38   76:astore          6
	//*  39   78:aload           8
	//*  40   80:dload_2         
	//*  41   81:invokevirtual   #352 <Method StringBuilder StringBuilder.append(double)>
	//*  42   84:pop             
	//*  43   85:aload_1         
	//*  44   86:astore          6
	//*  45   88:aload           8
	//*  46   90:ldc2            #354 <String " and longitude '">
	//*  47   93:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  48   96:pop             
	//*  49   97:aload_1         
	//*  50   98:astore          6
	//*  51  100:aload           8
	//*  52  102:dload           4
	//*  53  104:invokevirtual   #352 <Method StringBuilder StringBuilder.append(double)>
	//*  54  107:pop             
	//*  55  108:aload_1         
	//*  56  109:astore          6
	//*  57  111:aload           8
	//*  58  113:ldc2            #356 <String "'">
	//*  59  116:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  60  119:pop             
	//*  61  120:aload_1         
	//*  62  121:astore          6
	//*  63  123:aload           7
	//*  64  125:aload           8
	//*  65  127:invokevirtual   #72  <Method String StringBuilder.toString()>
	//*  66  130:invokestatic    #94  <Method int AppboyLogger.w(String, String)>
	//*  67  133:pop             
	//*  68  134:return          
	//*  69  135:aload_1         
	//*  70  136:astore          6
	//*  71  138:aload_1         
	//*  72  139:invokestatic    #135 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//*  73  142:astore_1        
	//*  74  143:aload_1         
	//*  75  144:astore          6
	//*  76  146:aload_1         
	//*  77  147:dload_2         
	//*  78  148:dload           4
	//*  79  150:invokestatic    #359 <Method ci ci.a(String, double, double)>
	//*  80  153:astore          7
	//*  81  155:aload_1         
	//*  82  156:astore          6
	//*  83  158:aload_0         
	//*  84  159:getfield        #44  <Field bt g>
	//*  85  162:aload           7
	//*  86  164:invokeinterface #106 <Method boolean bt.a(bo.app.cc)>
	//*  87  169:pop             
	//*  88  170:return          
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  89  171:astore_1        
			{
				obj = ((Object) (a));
	//   90  172:getstatic       #27  <Field String a>
	//   91  175:astore          7
			}
			break MISSING_BLOCK_LABEL_177;
		}
		s1 = s;
		if(ValidationUtils.isValidLocation(d1, d2))
			break MISSING_BLOCK_LABEL_135;
		s1 = s;
		obj = ((Object) (a));
		s1 = s;
		stringbuilder = new StringBuilder();
		s1 = s;
		stringbuilder.append("Cannot set custom location attribute due with invalid latitude '");
		s1 = s;
		stringbuilder.append(d1);
		s1 = s;
		stringbuilder.append(" and longitude '");
		s1 = s;
		stringbuilder.append(d2);
		s1 = s;
		stringbuilder.append("'");
		s1 = s;
		AppboyLogger.w(((String) (obj)), stringbuilder.toString());
		return;
		s1 = s;
		s = ValidationUtils.ensureAppboyFieldLength(s);
		s1 = s;
		obj = ((Object) (ci.a(s, d1, d2)));
		s1 = s;
		g.a(((bo.app.cc) (obj)));
		return;
		StringBuilder stringbuilder1 = new StringBuilder();
	//   92  177:new             #55  <Class StringBuilder>
	//   93  180:dup             
	//   94  181:invokespecial   #56  <Method void StringBuilder()>
	//   95  184:astore          8
		stringbuilder1.append("Failed to set custom location attribute with key '");
	//   96  186:aload           8
	//   97  188:ldc2            #361 <String "Failed to set custom location attribute with key '">
	//   98  191:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   99  194:pop             
		stringbuilder1.append(s1);
	//  100  195:aload           8
	//  101  197:aload           6
	//  102  199:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//  103  202:pop             
		stringbuilder1.append("' and latitude '");
	//  104  203:aload           8
	//  105  205:ldc2            #363 <String "' and latitude '">
	//  106  208:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//  107  211:pop             
		stringbuilder1.append(d1);
	//  108  212:aload           8
	//  109  214:dload_2         
	//  110  215:invokevirtual   #352 <Method StringBuilder StringBuilder.append(double)>
	//  111  218:pop             
		stringbuilder1.append("' and longitude '");
	//  112  219:aload           8
	//  113  221:ldc2            #365 <String "' and longitude '">
	//  114  224:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//  115  227:pop             
		stringbuilder1.append(d2);
	//  116  228:aload           8
	//  117  230:dload           4
	//  118  232:invokevirtual   #352 <Method StringBuilder StringBuilder.append(double)>
	//  119  235:pop             
		stringbuilder1.append("'");
	//  120  236:aload           8
	//  121  238:ldc2            #356 <String "'">
	//  122  241:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//  123  244:pop             
		AppboyLogger.w(((String) (obj)), stringbuilder1.toString(), ((Throwable) (s)));
	//  124  245:aload           7
	//  125  247:aload           8
	//  126  249:invokevirtual   #72  <Method String StringBuilder.toString()>
	//  127  252:aload_1         
	//  128  253:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//  129  256:pop             
		return;
	//  130  257:return          
	}

	public boolean setPhoneNumber(String s)
	{
		boolean flag;
		try
		{
			flag = b.h(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #369 <Method boolean ea.h(String)>
	//    4    8:istore_2        
		}
	//*   5    9:iload_2         
	//*   6   10:ireturn         
		catch(Exception exception)
	//*   7   11:astore_3        
		{
			String s1 = a;
	//    8   12:getstatic       #27  <Field String a>
	//    9   15:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   10   17:new             #55  <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #56  <Method void StringBuilder()>
	//   13   24:astore          5
			stringbuilder.append("Failed to set phone number to: ");
	//   14   26:aload           5
	//   15   28:ldc2            #371 <String "Failed to set phone number to: ">
	//   16   31:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			stringbuilder.append(s);
	//   18   35:aload           5
	//   19   37:aload_1         
	//   20   38:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   22   42:aload           4
	//   23   44:aload           5
	//   24   46:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   25   49:aload_3         
	//   26   50:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   27   53:pop             
			return false;
	//   28   54:iconst_0        
	//   29   55:ireturn         
		}
		return flag;
	}

	public boolean setPushNotificationSubscriptionType(NotificationSubscriptionType notificationsubscriptiontype)
	{
		try
		{
			b.b(notificationsubscriptiontype);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #374 <Method void ea.b(NotificationSubscriptionType)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		catch(Exception exception)
	//*   6   10:astore_2        
		{
			String s = a;
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:astore_3        
			StringBuilder stringbuilder = new StringBuilder();
	//    9   15:new             #55  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:invokespecial   #56  <Method void StringBuilder()>
	//   12   22:astore          4
			stringbuilder.append("Failed to set push notification subscription to: ");
	//   13   24:aload           4
	//   14   26:ldc2            #376 <String "Failed to set push notification subscription to: ">
	//   15   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(((Object) (notificationsubscriptiontype)));
	//   17   33:aload           4
	//   18   35:aload_1         
	//   19   36:invokevirtual   #292 <Method StringBuilder StringBuilder.append(Object)>
	//   20   39:pop             
			AppboyLogger.w(s, stringbuilder.toString(), ((Throwable) (exception)));
	//   21   40:aload_3         
	//   22   41:aload           4
	//   23   43:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   24   46:aload_2         
	//   25   47:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   26   50:pop             
			return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
		}
		return true;
	}

	public boolean setTwitterData(TwitterUser twitteruser)
	{
		try
		{
			b.a(twitteruser);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #381 <Method void ea.a(TwitterUser)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(TwitterUser twitteruser)
	//*   6   10:astore_1        
		{
			AppboyLogger.w(a, "Failed to set Twitter user data.", ((Throwable) (twitteruser)));
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:ldc2            #383 <String "Failed to set Twitter user data.">
	//    9   17:aload_1         
	//   10   18:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   11   21:pop             
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
		return true;
	}

	public boolean unsetCustomUserAttribute(String s)
	{
		boolean flag;
		try
		{
			flag = b.j(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field ea b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #387 <Method boolean ea.j(String)>
	//    4    8:istore_2        
		}
	//*   5    9:iload_2         
	//*   6   10:ireturn         
		catch(Exception exception)
	//*   7   11:astore_3        
		{
			String s1 = a;
	//    8   12:getstatic       #27  <Field String a>
	//    9   15:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   10   17:new             #55  <Class StringBuilder>
	//   11   20:dup             
	//   12   21:invokespecial   #56  <Method void StringBuilder()>
	//   13   24:astore          5
			stringbuilder.append("Failed to unset custom attribute ");
	//   14   26:aload           5
	//   15   28:ldc2            #389 <String "Failed to unset custom attribute ">
	//   16   31:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			stringbuilder.append(s);
	//   18   35:aload           5
	//   19   37:aload_1         
	//   20   38:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			stringbuilder.append(".");
	//   22   42:aload           5
	//   23   44:ldc1            #162 <String ".">
	//   24   46:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   26   50:aload           4
	//   27   52:aload           5
	//   28   54:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   29   57:aload_3         
	//   30   58:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   31   61:pop             
			return false;
	//   32   62:iconst_0        
	//   33   63:ireturn         
		}
		return flag;
	}

	public void unsetLocationCustomAttribute(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		Object obj;
		if(!CustomAttributeValidationUtils.isValidCustomAttributeKey(s, c.i()))
	//*   2    2:aload_1         
	//*   3    3:aload_0         
	//*   4    4:getfield        #42  <Field dx c>
	//*   5    7:invokevirtual   #118 <Method java.util.Set dx.i()>
	//*   6   10:invokestatic    #124 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//*   7   13:ifne            29
		{
			s1 = s;
	//    8   16:aload_1         
	//    9   17:astore_2        
			try
			{
				AppboyLogger.w(a, "Custom location attribute key was invalid. Not setting attribute.");
	//   10   18:getstatic       #27  <Field String a>
	//   11   21:ldc2            #343 <String "Custom location attribute key was invalid. Not setting attribute.">
	//   12   24:invokestatic    #94  <Method int AppboyLogger.w(String, String)>
	//   13   27:pop             
				return;
	//   14   28:return          
			}
	//*  15   29:aload_1         
	//*  16   30:astore_2        
	//*  17   31:aload_1         
	//*  18   32:invokestatic    #135 <Method String ValidationUtils.ensureAppboyFieldLength(String)>
	//*  19   35:astore_1        
	//*  20   36:aload_1         
	//*  21   37:astore_2        
	//*  22   38:aload_1         
	//*  23   39:invokestatic    #394 <Method ci ci.k(String)>
	//*  24   42:astore_3        
	//*  25   43:aload_1         
	//*  26   44:astore_2        
	//*  27   45:aload_0         
	//*  28   46:getfield        #44  <Field bt g>
	//*  29   49:aload_3         
	//*  30   50:invokeinterface #106 <Method boolean bt.a(bo.app.cc)>
	//*  31   55:pop             
	//*  32   56:return          
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  33   57:astore_1        
			{
				obj = ((Object) (a));
	//   34   58:getstatic       #27  <Field String a>
	//   35   61:astore_3        
			}
			break MISSING_BLOCK_LABEL_62;
		}
		s1 = s;
		s = ValidationUtils.ensureAppboyFieldLength(s);
		s1 = s;
		obj = ((Object) (ci.k(s)));
		s1 = s;
		g.a(((bo.app.cc) (obj)));
		return;
		StringBuilder stringbuilder = new StringBuilder();
	//   36   62:new             #55  <Class StringBuilder>
	//   37   65:dup             
	//   38   66:invokespecial   #56  <Method void StringBuilder()>
	//   39   69:astore          4
		stringbuilder.append("Failed to unset custom location attribute with key '");
	//   40   71:aload           4
	//   41   73:ldc2            #396 <String "Failed to unset custom location attribute with key '">
	//   42   76:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   43   79:pop             
		stringbuilder.append(s1);
	//   44   80:aload           4
	//   45   82:aload_2         
	//   46   83:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   47   86:pop             
		stringbuilder.append("'");
	//   48   87:aload           4
	//   49   89:ldc2            #356 <String "'">
	//   50   92:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   51   95:pop             
		AppboyLogger.w(((String) (obj)), stringbuilder.toString(), ((Throwable) (s)));
	//   52   96:aload_3         
	//   53   97:aload           4
	//   54   99:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   55  102:aload_1         
	//   56  103:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   57  106:pop             
		return;
	//   58  107:return          
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/AppboyUser);
	private final ea b;
	private final dx c;
	private final Object d = new Object();
	private final bw e;
	private volatile String f;
	private final bt g;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyUser>
	//    1    2:invokestatic    #25  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #27  <Field String a>
	//*   3    8:return          
	}
}
