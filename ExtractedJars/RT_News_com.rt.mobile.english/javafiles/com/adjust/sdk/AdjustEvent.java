// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package com.adjust.sdk:
//			AdjustFactory, ILogger

public class AdjustEvent
{

	public AdjustEvent(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		if(!checkEventToken(s, logger))
	//*   2    4:aload_1         
	//*   3    5:getstatic       #25  <Field ILogger logger>
	//*   4    8:invokestatic    #34  <Method boolean checkEventToken(String, ILogger)>
	//*   5   11:ifne            15
		{
			return;
	//    6   14:return          
		} else
		{
			eventToken = s;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #36  <Field String eventToken>
			return;
	//   10   20:return          
		}
	}

	private static boolean checkEventToken(String s, ILogger ilogger)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       18
		{
			ilogger.error("Missing Event Token", new Object[0]);
	//    2    4:aload_1         
	//    3    5:ldc1            #38  <String "Missing Event Token">
	//    4    7:iconst_0        
	//    5    8:anewarray       Object[]
	//    6   11:invokeinterface #44  <Method void ILogger.error(String, Object[])>
			return false;
	//    7   16:iconst_0        
	//    8   17:ireturn         
		}
		if(s.length() != 6)
	//*   9   18:aload_0         
	//*  10   19:invokevirtual   #50  <Method int String.length()>
	//*  11   22:bipush          6
	//*  12   24:icmpeq          45
		{
			ilogger.error("Malformed Event Token '%s'", new Object[] {
				s
			});
	//   13   27:aload_1         
	//   14   28:ldc1            #52  <String "Malformed Event Token '%s'">
	//   15   30:iconst_1        
	//   16   31:anewarray       Object[]
	//   17   34:dup             
	//   18   35:iconst_0        
	//   19   36:aload_0         
	//   20   37:aastore         
	//   21   38:invokeinterface #44  <Method void ILogger.error(String, Object[])>
			return false;
	//   22   43:iconst_0        
	//   23   44:ireturn         
		} else
		{
			return true;
	//   24   45:iconst_1        
	//   25   46:ireturn         
		}
	}

	private boolean checkRevenue(Double double1, String s)
	{
		if(double1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          78
		{
			if(double1.doubleValue() < 0.0D)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #60  <Method double Double.doubleValue()>
	//*   4    8:dconst_0        
	//*   5    9:dcmpg           
	//*   6   10:ifge            33
			{
				logger.error("Invalid amount %.5f", new Object[] {
					double1
				});
	//    7   13:getstatic       #25  <Field ILogger logger>
	//    8   16:ldc1            #62  <String "Invalid amount %.5f">
	//    9   18:iconst_1        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:aload_1         
	//   14   25:aastore         
	//   15   26:invokeinterface #44  <Method void ILogger.error(String, Object[])>
				return false;
	//   16   31:iconst_0        
	//   17   32:ireturn         
			}
			if(s == null)
	//*  18   33:aload_2         
	//*  19   34:ifnonnull       53
			{
				logger.error("Currency must be set with revenue", new Object[0]);
	//   20   37:getstatic       #25  <Field ILogger logger>
	//   21   40:ldc1            #64  <String "Currency must be set with revenue">
	//   22   42:iconst_0        
	//   23   43:anewarray       Object[]
	//   24   46:invokeinterface #44  <Method void ILogger.error(String, Object[])>
				return false;
	//   25   51:iconst_0        
	//   26   52:ireturn         
			}
			if(s.equals(""))
	//*  27   53:aload_2         
	//*  28   54:ldc1            #66  <String "">
	//*  29   56:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  30   59:ifeq            98
			{
				logger.error("Currency is empty", new Object[0]);
	//   31   62:getstatic       #25  <Field ILogger logger>
	//   32   65:ldc1            #72  <String "Currency is empty">
	//   33   67:iconst_0        
	//   34   68:anewarray       Object[]
	//   35   71:invokeinterface #44  <Method void ILogger.error(String, Object[])>
				return false;
	//   36   76:iconst_0        
	//   37   77:ireturn         
			}
		} else
		if(s != null)
	//*  38   78:aload_2         
	//*  39   79:ifnull          98
		{
			logger.error("Revenue must be set with currency", new Object[0]);
	//   40   82:getstatic       #25  <Field ILogger logger>
	//   41   85:ldc1            #74  <String "Revenue must be set with currency">
	//   42   87:iconst_0        
	//   43   88:anewarray       Object[]
	//   44   91:invokeinterface #44  <Method void ILogger.error(String, Object[])>
			return false;
	//   45   96:iconst_0        
	//   46   97:ireturn         
		}
		return true;
	//   47   98:iconst_1        
	//   48   99:ireturn         
	}

	private boolean isValidParameter(String s, String s1, String s2)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       28
		{
			logger.error("%s parameter %s is missing", new Object[] {
				s2, s1
			});
	//    2    4:getstatic       #25  <Field ILogger logger>
	//    3    7:ldc1            #78  <String "%s parameter %s is missing">
	//    4    9:iconst_2        
	//    5   10:anewarray       Object[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:aload_3         
	//    9   16:aastore         
	//   10   17:dup             
	//   11   18:iconst_1        
	//   12   19:aload_2         
	//   13   20:aastore         
	//   14   21:invokeinterface #44  <Method void ILogger.error(String, Object[])>
			return false;
	//   15   26:iconst_0        
	//   16   27:ireturn         
		}
		if(s.equals(""))
	//*  17   28:aload_1         
	//*  18   29:ldc1            #66  <String "">
	//*  19   31:invokevirtual   #70  <Method boolean String.equals(Object)>
	//*  20   34:ifeq            61
		{
			logger.error("%s parameter %s is empty", new Object[] {
				s2, s1
			});
	//   21   37:getstatic       #25  <Field ILogger logger>
	//   22   40:ldc1            #80  <String "%s parameter %s is empty">
	//   23   42:iconst_2        
	//   24   43:anewarray       Object[]
	//   25   46:dup             
	//   26   47:iconst_0        
	//   27   48:aload_3         
	//   28   49:aastore         
	//   29   50:dup             
	//   30   51:iconst_1        
	//   31   52:aload_2         
	//   32   53:aastore         
	//   33   54:invokeinterface #44  <Method void ILogger.error(String, Object[])>
			return false;
	//   34   59:iconst_0        
	//   35   60:ireturn         
		} else
		{
			return true;
	//   36   61:iconst_1        
	//   37   62:ireturn         
		}
	}

	public void addCallbackParameter(String s, String s1)
	{
		if(!isValidParameter(s, "key", "Callback"))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:ldc1            #84  <String "key">
	//*   3    4:ldc1            #86  <String "Callback">
	//*   4    6:invokespecial   #88  <Method boolean isValidParameter(String, String, String)>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(!isValidParameter(s1, "value", "Callback"))
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:ldc1            #90  <String "value">
	//*  10   17:ldc1            #86  <String "Callback">
	//*  11   19:invokespecial   #88  <Method boolean isValidParameter(String, String, String)>
	//*  12   22:ifne            26
			return;
	//   13   25:return          
		if(callbackParameters == null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #92  <Field Map callbackParameters>
	//*  16   30:ifnonnull       44
			callbackParameters = ((Map) (new LinkedHashMap()));
	//   17   33:aload_0         
	//   18   34:new             #94  <Class LinkedHashMap>
	//   19   37:dup             
	//   20   38:invokespecial   #95  <Method void LinkedHashMap()>
	//   21   41:putfield        #92  <Field Map callbackParameters>
		if((String)callbackParameters.put(((Object) (s)), ((Object) (s1))) != null)
	//*  22   44:aload_0         
	//*  23   45:getfield        #92  <Field Map callbackParameters>
	//*  24   48:aload_1         
	//*  25   49:aload_2         
	//*  26   50:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//*  27   55:checkcast       #46  <Class String>
	//*  28   58:ifnull          79
			logger.warn("key %s was overwritten", new Object[] {
				s
			});
	//   29   61:getstatic       #25  <Field ILogger logger>
	//   30   64:ldc1            #103 <String "key %s was overwritten">
	//   31   66:iconst_1        
	//   32   67:anewarray       Object[]
	//   33   70:dup             
	//   34   71:iconst_0        
	//   35   72:aload_1         
	//   36   73:aastore         
	//   37   74:invokeinterface #106 <Method void ILogger.warn(String, Object[])>
	//   38   79:return          
	}

	public void addPartnerParameter(String s, String s1)
	{
		if(!isValidParameter(s, "key", "Partner"))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:ldc1            #84  <String "key">
	//*   3    4:ldc1            #109 <String "Partner">
	//*   4    6:invokespecial   #88  <Method boolean isValidParameter(String, String, String)>
	//*   5    9:ifne            13
			return;
	//    6   12:return          
		if(!isValidParameter(s1, "value", "Partner"))
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:ldc1            #90  <String "value">
	//*  10   17:ldc1            #109 <String "Partner">
	//*  11   19:invokespecial   #88  <Method boolean isValidParameter(String, String, String)>
	//*  12   22:ifne            26
			return;
	//   13   25:return          
		if(partnerParameters == null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #111 <Field Map partnerParameters>
	//*  16   30:ifnonnull       44
			partnerParameters = ((Map) (new LinkedHashMap()));
	//   17   33:aload_0         
	//   18   34:new             #94  <Class LinkedHashMap>
	//   19   37:dup             
	//   20   38:invokespecial   #95  <Method void LinkedHashMap()>
	//   21   41:putfield        #111 <Field Map partnerParameters>
		if((String)partnerParameters.put(((Object) (s)), ((Object) (s1))) != null)
	//*  22   44:aload_0         
	//*  23   45:getfield        #111 <Field Map partnerParameters>
	//*  24   48:aload_1         
	//*  25   49:aload_2         
	//*  26   50:invokeinterface #101 <Method Object Map.put(Object, Object)>
	//*  27   55:checkcast       #46  <Class String>
	//*  28   58:ifnull          79
			logger.warn("key %s was overwritten", new Object[] {
				s
			});
	//   29   61:getstatic       #25  <Field ILogger logger>
	//   30   64:ldc1            #103 <String "key %s was overwritten">
	//   31   66:iconst_1        
	//   32   67:anewarray       Object[]
	//   33   70:dup             
	//   34   71:iconst_0        
	//   35   72:aload_1         
	//   36   73:aastore         
	//   37   74:invokeinterface #106 <Method void ILogger.warn(String, Object[])>
	//   38   79:return          
	}

	public boolean isValid()
	{
		return eventToken != null;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String eventToken>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void setRevenue(double d, String s)
	{
		if(!checkRevenue(Double.valueOf(d), s))
	//*   0    0:aload_0         
	//*   1    1:dload_1         
	//*   2    2:invokestatic    #119 <Method Double Double.valueOf(double)>
	//*   3    5:aload_3         
	//*   4    6:invokespecial   #121 <Method boolean checkRevenue(Double, String)>
	//*   5    9:ifne            13
		{
			return;
	//    6   12:return          
		} else
		{
			revenue = Double.valueOf(d);
	//    7   13:aload_0         
	//    8   14:dload_1         
	//    9   15:invokestatic    #119 <Method Double Double.valueOf(double)>
	//   10   18:putfield        #123 <Field Double revenue>
			currency = s;
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:putfield        #125 <Field String currency>
			return;
	//   14   26:return          
		}
	}

	private static ILogger logger = AdjustFactory.getLogger();
	Map callbackParameters;
	String currency;
	String eventToken;
	Map partnerParameters;
	Double revenue;

	static 
	{
	//    0    0:invokestatic    #23  <Method ILogger AdjustFactory.getLogger()>
	//    1    3:putstatic       #25  <Field ILogger logger>
	//*   2    6:return          
	}
}
