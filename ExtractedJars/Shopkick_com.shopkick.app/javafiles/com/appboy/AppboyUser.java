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

	AppboyUser(dj dj1, bf bf1, String s, bo bo1, dh dh1)
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
		b = dj1;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #38  <Field dj b>
		e = bo1;
	//   13   25:aload_0         
	//   14   26:aload           4
	//   15   28:putfield        #40  <Field bo e>
		c = dh1;
	//   16   31:aload_0         
	//   17   32:aload           5
	//   18   34:putfield        #42  <Field dh c>
		g = bf1;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:putfield        #44  <Field bf g>
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
	//   51   95:getfield        #38  <Field dj b>
	//   52   98:aload_1         
	//   53   99:invokevirtual   #78  <Method void dj.a(String)>
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
			flag = g.a(((bo.app.bu) (cc.a(s, s1))));
	//   18   36:aload_0         
	//   19   37:getfield        #44  <Field bf g>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:invokestatic    #101 <Method cc cc.a(String, String)>
	//   23   45:invokevirtual   #106 <Method boolean bf.a(bo.app.bu)>
	//   24   48:istore_3        
		}
	//*  25   49:iload_3         
	//*  26   50:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s1)
	//*  27   51:astore_2        
		{
			String s2 = a;
	//   28   52:getstatic       #27  <Field String a>
	//   29   55:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   30   57:new             #55  <Class StringBuilder>
	//   31   60:dup             
	//   32   61:invokespecial   #56  <Method void StringBuilder()>
	//   33   64:astore          5
			stringbuilder.append("Failed to set alias: ");
	//   34   66:aload           5
	//   35   68:ldc1            #108 <String "Failed to set alias: ">
	//   36   70:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   37   73:pop             
			stringbuilder.append(s);
	//   38   74:aload           5
	//   39   76:aload_1         
	//   40   77:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
			AppboyLogger.e(s2, stringbuilder.toString(), ((Throwable) (s1)));
	//   42   81:aload           4
	//   43   83:aload           5
	//   44   85:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   45   88:aload_2         
	//   46   89:invokestatic    #111 <Method int AppboyLogger.e(String, String, Throwable)>
	//   47   92:pop             
			return false;
	//   48   93:iconst_0        
	//   49   94:ireturn         
		}
		return flag;
	}

	public boolean addToCustomAttributeArray(String s, String s1)
	{
		String s2 = s;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!CustomAttributeValidationUtils.isValidCustomAttributeKey(s, c.m()))
	//*   2    3:aload_1         
	//*   3    4:aload_0         
	//*   4    5:getfield        #42  <Field dh c>
	//*   5    8:invokevirtual   #118 <Method java.util.Set dh.m()>
	//*   6   11:invokestatic    #124 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//*   7   14:ifne            31
		{
			s2 = s;
	//    8   17:aload_1         
	//    9   18:astore          4
			boolean flag;
			try
			{
				AppboyLogger.w(a, "Custom attribute key cannot be null.");
	//   10   20:getstatic       #27  <Field String a>
	//   11   23:ldc1            #126 <String "Custom attribute key cannot be null.">
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
	//*  33   59:invokestatic    #137 <Method cc cc.e(String, String)>
	//*  34   62:astore_2        
	//*  35   63:aload_1         
	//*  36   64:astore          4
	//*  37   66:aload_0         
	//*  38   67:getfield        #44  <Field bf g>
	//*  39   70:aload_2         
	//*  40   71:invokevirtual   #106 <Method boolean bf.a(bo.app.bu)>
	//*  41   74:istore_3        
	//*  42   75:iload_3         
	//*  43   76:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  44   77:astore_1        
			{
				s1 = a;
	//   45   78:getstatic       #27  <Field String a>
	//   46   81:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   47   82:new             #55  <Class StringBuilder>
	//   48   85:dup             
	//   49   86:invokespecial   #56  <Method void StringBuilder()>
	//   50   89:astore          5
				stringbuilder.append("Failed to add custom attribute with key '");
	//   51   91:aload           5
	//   52   93:ldc1            #139 <String "Failed to add custom attribute with key '">
	//   53   95:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   54   98:pop             
				stringbuilder.append(s2);
	//   55   99:aload           5
	//   56  101:aload           4
	//   57  103:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   58  106:pop             
				stringbuilder.append("'.");
	//   59  107:aload           5
	//   60  109:ldc1            #141 <String "'.">
	//   61  111:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   62  114:pop             
				AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (s)));
	//   63  115:aload_2         
	//   64  116:aload           5
	//   65  118:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   66  121:aload_1         
	//   67  122:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   68  125:pop             
				return false;
	//   69  126:iconst_0        
	//   70  127:ireturn         
			}
			return false;
		}
		s2 = s;
		if(!CustomAttributeValidationUtils.isValidCustomAttributeValue(s1))
			return false;
		s2 = s;
		s = ValidationUtils.ensureAppboyFieldLength(s);
		s2 = s;
		s1 = ((String) (cc.e(s, ValidationUtils.ensureAppboyFieldLength(s1))));
		s2 = s;
		flag = g.a(((bo.app.bu) (s1)));
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
	//    3    3:invokevirtual   #148 <Method boolean incrementCustomUserAttribute(String, int)>
	//    4    6:ireturn         
	}

	public boolean incrementCustomUserAttribute(String s, int i)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!CustomAttributeValidationUtils.isValidCustomAttributeKey(s, c.m()))
	//*   2    3:aload_1         
	//*   3    4:aload_0         
	//*   4    5:getfield        #42  <Field dh c>
	//*   5    8:invokevirtual   #118 <Method java.util.Set dh.m()>
	//*   6   11:invokestatic    #124 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//*   7   14:ifne            19
			return false;
	//    8   17:iconst_0        
	//    9   18:ireturn         
		s1 = s;
	//   10   19:aload_1         
	//   11   20:astore          4
		boolean flag;
		cc cc1;
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
	//*  19   32:invokestatic    #151 <Method cc cc.a(String, int)>
	//*  20   35:astore          5
	//*  21   37:aload_1         
	//*  22   38:astore          4
	//*  23   40:aload_0         
	//*  24   41:getfield        #44  <Field bf g>
	//*  25   44:aload           5
	//*  26   46:invokevirtual   #106 <Method boolean bf.a(bo.app.bu)>
	//*  27   49:istore_3        
	//*  28   50:iload_3         
	//*  29   51:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  30   52:astore_1        
		{
			String s2 = a;
	//   31   53:getstatic       #27  <Field String a>
	//   32   56:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   33   58:new             #55  <Class StringBuilder>
	//   34   61:dup             
	//   35   62:invokespecial   #56  <Method void StringBuilder()>
	//   36   65:astore          6
			stringbuilder.append("Failed to increment custom attribute ");
	//   37   67:aload           6
	//   38   69:ldc1            #153 <String "Failed to increment custom attribute ">
	//   39   71:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   40   74:pop             
			stringbuilder.append(s1);
	//   41   75:aload           6
	//   42   77:aload           4
	//   43   79:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   44   82:pop             
			stringbuilder.append(" by ");
	//   45   83:aload           6
	//   46   85:ldc1            #155 <String " by ">
	//   47   87:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   48   90:pop             
			stringbuilder.append(i);
	//   49   91:aload           6
	//   50   93:iload_2         
	//   51   94:invokevirtual   #158 <Method StringBuilder StringBuilder.append(int)>
	//   52   97:pop             
			stringbuilder.append(".");
	//   53   98:aload           6
	//   54  100:ldc1            #160 <String ".">
	//   55  102:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   56  105:pop             
			AppboyLogger.w(s2, stringbuilder.toString(), ((Throwable) (s)));
	//   57  106:aload           5
	//   58  108:aload           6
	//   59  110:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   60  113:aload_1         
	//   61  114:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   62  117:pop             
			return false;
	//   63  118:iconst_0        
	//   64  119:ireturn         
		}
		s1 = s;
		cc1 = cc.a(s, i);
		s1 = s;
		flag = g.a(((bo.app.bu) (cc1)));
		return flag;
	}

	public boolean removeFromCustomAttributeArray(String s, String s1)
	{
		String s2 = s;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!CustomAttributeValidationUtils.isValidCustomAttributeKey(s, c.m()))
	//*   2    3:aload_1         
	//*   3    4:aload_0         
	//*   4    5:getfield        #42  <Field dh c>
	//*   5    8:invokevirtual   #118 <Method java.util.Set dh.m()>
	//*   6   11:invokestatic    #124 <Method boolean CustomAttributeValidationUtils.isValidCustomAttributeKey(String, java.util.Set)>
	//*   7   14:ifne            31
		{
			s2 = s;
	//    8   17:aload_1         
	//    9   18:astore          4
			boolean flag;
			try
			{
				AppboyLogger.w(a, "Custom attribute key cannot be null.");
	//   10   20:getstatic       #27  <Field String a>
	//   11   23:ldc1            #126 <String "Custom attribute key cannot be null.">
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
	//*  33   59:invokestatic    #163 <Method cc cc.f(String, String)>
	//*  34   62:astore_2        
	//*  35   63:aload_1         
	//*  36   64:astore          4
	//*  37   66:aload_0         
	//*  38   67:getfield        #44  <Field bf g>
	//*  39   70:aload_2         
	//*  40   71:invokevirtual   #106 <Method boolean bf.a(bo.app.bu)>
	//*  41   74:istore_3        
	//*  42   75:iload_3         
	//*  43   76:ireturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  44   77:astore_1        
			{
				s1 = a;
	//   45   78:getstatic       #27  <Field String a>
	//   46   81:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   47   82:new             #55  <Class StringBuilder>
	//   48   85:dup             
	//   49   86:invokespecial   #56  <Method void StringBuilder()>
	//   50   89:astore          5
				stringbuilder.append("Failed to remove custom attribute with key '");
	//   51   91:aload           5
	//   52   93:ldc1            #165 <String "Failed to remove custom attribute with key '">
	//   53   95:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   54   98:pop             
				stringbuilder.append(s2);
	//   55   99:aload           5
	//   56  101:aload           4
	//   57  103:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   58  106:pop             
				stringbuilder.append("'.");
	//   59  107:aload           5
	//   60  109:ldc1            #141 <String "'.">
	//   61  111:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   62  114:pop             
				AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (s)));
	//   63  115:aload_2         
	//   64  116:aload           5
	//   65  118:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   66  121:aload_1         
	//   67  122:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   68  125:pop             
				return false;
	//   69  126:iconst_0        
	//   70  127:ireturn         
			}
			return false;
		}
		s2 = s;
		if(!CustomAttributeValidationUtils.isValidCustomAttributeValue(s1))
			return false;
		s2 = s;
		s = ValidationUtils.ensureAppboyFieldLength(s);
		s2 = s;
		s1 = ((String) (cc.f(s, ValidationUtils.ensureAppboyFieldLength(s1))));
		s2 = s;
		flag = g.a(((bo.app.bu) (s1)));
		return flag;
	}

	public boolean setAttributionData(AttributionData attributiondata)
	{
		try
		{
			b.a(attributiondata);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #170 <Method void dj.a(AttributionData)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(AttributionData attributiondata)
	//*   6   10:astore_1        
		{
			AppboyLogger.w(a, "Failed to set attribution data.", ((Throwable) (attributiondata)));
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:ldc1            #172 <String "Failed to set attribution data.">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #176 <Method void dj.i(String)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   10:astore_1        
		{
			AppboyLogger.w(a, "Failed to set the avatar image URL.", ((Throwable) (s)));
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:ldc1            #178 <String "Failed to set the avatar image URL.">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #181 <Method void dj.e(String)>
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
	//   14   26:ldc1            #183 <String "Failed to set country to: ">
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
		if(!CustomAttributeValidationUtils.isValidCustomAttributeKey(s, c.m()))
	//*   2    3:aload_1         
	//*   3    4:aload_0         
	//*   4    5:getfield        #42  <Field dh c>
	//*   5    8:invokevirtual   #118 <Method java.util.Set dh.m()>
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
	//*  22   39:invokestatic    #189 <Method String[] CustomAttributeValidationUtils.ensureCustomAttributeArrayValues(String[])>
	//*  23   42:astore_1        
	//*  24   43:aload           5
	//*  25   45:astore          4
	//*  26   47:aload           5
	//*  27   49:aload_1         
	//*  28   50:invokestatic    #192 <Method cc cc.a(String, String[])>
	//*  29   53:astore_1        
	//*  30   54:aload           5
	//*  31   56:astore          4
	//*  32   58:aload_0         
	//*  33   59:getfield        #44  <Field bf g>
	//*  34   62:aload_1         
	//*  35   63:invokevirtual   #106 <Method boolean bf.a(bo.app.bu)>
	//*  36   66:istore_3        
	//*  37   67:iload_3         
	//*  38   68:ireturn         
	//*  39   69:getstatic       #27  <Field String a>
	//*  40   72:astore_1        
	//*  41   73:new             #55  <Class StringBuilder>
	//*  42   76:dup             
	//*  43   77:invokespecial   #56  <Method void StringBuilder()>
	//*  44   80:astore_2        
	//*  45   81:aload_2         
	//*  46   82:ldc1            #194 <String "Failed to set custom attribute array with key: '">
	//*  47   84:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  48   87:pop             
	//*  49   88:aload_2         
	//*  50   89:aload           4
	//*  51   91:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  52   94:pop             
	//*  53   95:aload_2         
	//*  54   96:ldc1            #141 <String "'.">
	//*  55   98:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//*  56  101:pop             
	//*  57  102:aload_1         
	//*  58  103:aload_2         
	//*  59  104:invokevirtual   #72  <Method String StringBuilder.toString()>
	//*  60  107:invokestatic    #94  <Method int AppboyLogger.w(String, String)>
	//*  61  110:pop             
	//*  62  111:iconst_0        
	//*  63  112:ireturn         
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
		s = ((String) (cc.a(s2, ((String []) (s)))));
		s1 = s2;
		flag = g.a(((bo.app.bu) (s)));
		return flag;
	//*  64  113:astore_1        
	//*  65  114:goto            69
	}

	public boolean setCustomUserAttribute(String s, double d1)
	{
		boolean flag;
		try
		{
			flag = b.a(s, ((Object) (Double.valueOf(d1))));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:dload_2         
	//    4    6:invokestatic    #202 <Method Double Double.valueOf(double)>
	//    5    9:invokevirtual   #205 <Method boolean dj.a(String, Object)>
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
	//   17   35:ldc1            #207 <String "Failed to set custom double attribute ">
	//   18   37:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
			stringbuilder.append(s);
	//   20   41:aload           7
	//   21   43:aload_1         
	//   22   44:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder.append(".");
	//   24   48:aload           7
	//   25   50:ldc1            #160 <String ".">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:fload_2         
	//    4    6:invokestatic    #213 <Method Float Float.valueOf(float)>
	//    5    9:invokevirtual   #205 <Method boolean dj.a(String, Object)>
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
	//   17   33:ldc1            #215 <String "Failed to set custom float attribute ">
	//   18   35:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(s);
	//   20   39:aload           6
	//   21   41:aload_1         
	//   22   42:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			stringbuilder.append(".");
	//   24   46:aload           6
	//   25   48:ldc1            #160 <String ".">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #220 <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #205 <Method boolean dj.a(String, Object)>
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
	//   17   33:ldc1            #222 <String "Failed to set custom integer attribute ">
	//   18   35:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			stringbuilder.append(s);
	//   20   39:aload           6
	//   21   41:aload_1         
	//   22   42:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			stringbuilder.append(".");
	//   24   46:aload           6
	//   25   48:ldc1            #160 <String ".">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokestatic    #228 <Method Long Long.valueOf(long)>
	//    5    9:invokevirtual   #205 <Method boolean dj.a(String, Object)>
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
	//   17   35:ldc1            #230 <String "Failed to set custom long attribute ">
	//   18   37:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
			stringbuilder.append(s);
	//   20   41:aload           7
	//   21   43:aload_1         
	//   22   44:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder.append(".");
	//   24   48:aload           7
	//   25   50:ldc1            #160 <String ".">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #205 <Method boolean dj.a(String, Object)>
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
	//   16   29:ldc1            #232 <String "Failed to set custom string attribute ">
	//   17   31:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			stringbuilder.append(s);
	//   19   35:aload           5
	//   20   37:aload_1         
	//   21   38:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
			stringbuilder.append(".");
	//   23   42:aload           5
	//   24   44:ldc1            #160 <String ".">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #238 <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokevirtual   #205 <Method boolean dj.a(String, Object)>
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
	//   17   32:ldc1            #240 <String "Failed to set custom boolean attribute ">
	//   18   34:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(s);
	//   20   38:aload           5
	//   21   40:aload_1         
	//   22   41:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			stringbuilder.append(".");
	//   24   45:aload           5
	//   25   47:ldc1            #160 <String ".">
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
			flag = b.a(s, dl.a());
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokestatic    #246 <Method long dl.a()>
	//    4    8:invokevirtual   #248 <Method boolean dj.a(String, long)>
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
	//   16   31:ldc1            #250 <String "Failed to set custom attribute ">
	//   17   33:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(s);
	//   19   37:aload           5
	//   20   39:aload_1         
	//   21   40:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			stringbuilder.append(" to now.");
	//   23   44:aload           5
	//   24   46:ldc1            #252 <String " to now.">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #248 <Method boolean dj.a(String, long)>
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
	//   16   32:ldc1            #250 <String "Failed to set custom attribute ">
	//   17   34:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			stringbuilder.append(s);
	//   19   38:aload           7
	//   20   40:aload_1         
	//   21   41:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			stringbuilder.append(" to ");
	//   23   45:aload           7
	//   24   47:ldc1            #255 <String " to ">
	//   25   49:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			stringbuilder.append(l);
	//   27   53:aload           7
	//   28   55:lload_2         
	//   29   56:invokevirtual   #258 <Method StringBuilder StringBuilder.append(long)>
	//   30   59:pop             
			stringbuilder.append(" seconds from epoch.");
	//   31   60:aload           7
	//   32   62:ldc2            #260 <String " seconds from epoch.">
	//   33   65:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
			AppboyLogger.w(s1, stringbuilder.toString(), ((Throwable) (exception)));
	//   35   69:aload           6
	//   36   71:aload           7
	//   37   73:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   38   76:aload           5
	//   39   78:invokestatic    #143 <Method int AppboyLogger.w(String, String, Throwable)>
	//   40   81:pop             
			return false;
	//   41   82:iconst_0        
	//   42   83:ireturn         
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #264 <Method boolean dj.a(int, Month, int)>
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
	//   17   33:ldc2            #266 <String "Failed to set date of birth to: ">
	//   18   36:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
			stringbuilder.append(i);
	//   20   40:aload           7
	//   21   42:iload_1         
	//   22   43:invokevirtual   #158 <Method StringBuilder StringBuilder.append(int)>
	//   23   46:pop             
			stringbuilder.append("-");
	//   24   47:aload           7
	//   25   49:ldc2            #268 <String "-">
	//   26   52:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
			stringbuilder.append(month.getValue());
	//   28   56:aload           7
	//   29   58:aload_2         
	//   30   59:invokevirtual   #274 <Method int Month.getValue()>
	//   31   62:invokevirtual   #158 <Method StringBuilder StringBuilder.append(int)>
	//   32   65:pop             
			stringbuilder.append("-");
	//   33   66:aload           7
	//   34   68:ldc2            #268 <String "-">
	//   35   71:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
			stringbuilder.append(j);
	//   37   75:aload           7
	//   38   77:iload_3         
	//   39   78:invokevirtual   #158 <Method StringBuilder StringBuilder.append(int)>
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #277 <Method boolean dj.d(String)>
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
	//   15   28:ldc2            #279 <String "Failed to set email to: ">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #284 <Method void dj.a(NotificationSubscriptionType)>
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
	//   14   26:ldc2            #286 <String "Failed to set email notification subscription to: ">
	//   15   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(((Object) (notificationsubscriptiontype)));
	//   17   33:aload           4
	//   18   35:aload_1         
	//   19   36:invokevirtual   #289 <Method StringBuilder StringBuilder.append(Object)>
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #294 <Method void dj.a(FacebookUser)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(FacebookUser facebookuser)
	//*   6   10:astore_1        
		{
			AppboyLogger.w(a, "Failed to set Facebook user data.", ((Throwable) (facebookuser)));
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:ldc2            #296 <String "Failed to set Facebook user data.">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #299 <Method void dj.b(String)>
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
	//   14   26:ldc2            #301 <String "Failed to set first name to: ">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #306 <Method void dj.a(Gender)>
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
	//   14   26:ldc2            #308 <String "Failed to set gender to: ">
	//   15   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(((Object) (gender)));
	//   17   33:aload           4
	//   18   35:aload_1         
	//   19   36:invokevirtual   #289 <Method StringBuilder StringBuilder.append(Object)>
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #311 <Method void dj.f(String)>
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
	//   14   26:ldc2            #313 <String "Failed to set home city to: ">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #316 <Method void dj.g(String)>
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
	//   14   26:ldc2            #318 <String "Failed to set language to: ">
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
			double1 = ((Double) (new cd(d1, d2, double1, double2)));
	//    0    0:new             #322 <Class cd>
	//    1    3:dup             
	//    2    4:dload_1         
	//    3    5:dload_3         
	//    4    6:aload           5
	//    5    8:aload           6
	//    6   10:invokespecial   #324 <Method void cd(double, double, Double, Double)>
	//    7   13:astore          5
			e.a(((bo.app.bv) (double1)));
	//    8   15:aload_0         
	//    9   16:getfield        #40  <Field bo e>
	//   10   19:aload           5
	//   11   21:invokeinterface #329 <Method boolean bo.a(bo.app.bv)>
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
	//   16   33:ldc2            #331 <String "Failed to manually set location.">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #334 <Method void dj.c(String)>
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
	//   14   26:ldc2            #336 <String "Failed to set last name to: ">
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

	public boolean setPhoneNumber(String s)
	{
		boolean flag;
		try
		{
			flag = b.h(s);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #340 <Method boolean dj.h(String)>
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
	//   15   28:ldc2            #342 <String "Failed to set phone number to: ">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #345 <Method void dj.b(NotificationSubscriptionType)>
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
	//   14   26:ldc2            #347 <String "Failed to set push notification subscription to: ">
	//   15   29:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
			stringbuilder.append(((Object) (notificationsubscriptiontype)));
	//   17   33:aload           4
	//   18   35:aload_1         
	//   19   36:invokevirtual   #289 <Method StringBuilder StringBuilder.append(Object)>
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #352 <Method void dj.a(TwitterUser)>
		}
	//*   4    8:iconst_1        
	//*   5    9:ireturn         
		// Misplaced declaration of an exception variable
		catch(TwitterUser twitteruser)
	//*   6   10:astore_1        
		{
			AppboyLogger.w(a, "Failed to set Twitter user data.", ((Throwable) (twitteruser)));
	//    7   11:getstatic       #27  <Field String a>
	//    8   14:ldc2            #354 <String "Failed to set Twitter user data.">
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
	//    1    1:getfield        #38  <Field dj b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #358 <Method boolean dj.j(String)>
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
	//   15   28:ldc2            #360 <String "Failed to unset custom attribute ">
	//   16   31:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
			stringbuilder.append(s);
	//   18   35:aload           5
	//   19   37:aload_1         
	//   20   38:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			stringbuilder.append(".");
	//   22   42:aload           5
	//   23   44:ldc1            #160 <String ".">
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

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/AppboyUser);
	private final dj b;
	private final dh c;
	private final Object d = new Object();
	private final bo e;
	private volatile String f;
	private final bf g;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyUser>
	//    1    2:invokestatic    #25  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #27  <Field String a>
	//*   3    8:return          
	}
}
