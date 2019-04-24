// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.tip;

import android.content.SharedPreferences;
import com.pactforcure.app.core.BackboneApplication;
import java.util.Calendar;
import java.util.Locale;

public class TipOfTheWeekStorage
{

	public TipOfTheWeekStorage()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static void clear()
	{
		BackboneApplication.get().getSharedPreferences("tip_of_the_week", 0).edit().clear().apply();
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #11  <String "tip_of_the_week">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #36  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:invokeinterface #40  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//    6   19:invokeinterface #43  <Method void android.content.SharedPreferences$Editor.apply()>
	//    7   24:return          
	}

	public static int getNumberOfUnseenTips()
	{
		return BackboneApplication.get().getSharedPreferences("tip_of_the_week", 0).getInt("unseen_tips", 0);
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #11  <String "tip_of_the_week">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:ldc1            #14  <String "unseen_tips">
	//    5   11:iconst_0        
	//    6   12:invokeinterface #49  <Method int SharedPreferences.getInt(String, int)>
	//    7   17:ireturn         
	}

	public static int getOffsetSentByServer()
	{
		return BackboneApplication.get().getSharedPreferences("tip_of_the_week", 0).getInt("offset_from_server", 0);
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #11  <String "tip_of_the_week">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:ldc1            #8   <String "offset_from_server">
	//    5   11:iconst_0        
	//    6   12:invokeinterface #49  <Method int SharedPreferences.getInt(String, int)>
	//    7   17:ireturn         
	}

	public static void incrementNumberOfUnseenTips()
	{
		SharedPreferences sharedpreferences = BackboneApplication.get().getSharedPreferences("tip_of_the_week", 0);
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #11  <String "tip_of_the_week">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:astore_1        
		Object obj = ((Object) (Calendar.getInstance()));
	//    5   10:invokestatic    #57  <Method Calendar Calendar.getInstance()>
	//    6   13:astore_2        
		obj = ((Object) (String.format(Locale.US, "%d-%d-%d", new Object[] {
			Integer.valueOf(((Calendar) (obj)).get(1)), Integer.valueOf(((Calendar) (obj)).get(2)), Integer.valueOf(((Calendar) (obj)).get(5))
		})));
	//    7   14:getstatic       #63  <Field Locale Locale.US>
	//    8   17:ldc1            #65  <String "%d-%d-%d">
	//    9   19:iconst_3        
	//   10   20:anewarray       Object[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:aload_2         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #68  <Method int Calendar.get(int)>
	//   16   30:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   17   33:aastore         
	//   18   34:dup             
	//   19   35:iconst_1        
	//   20   36:aload_2         
	//   21   37:iconst_2        
	//   22   38:invokevirtual   #68  <Method int Calendar.get(int)>
	//   23   41:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   24   44:aastore         
	//   25   45:dup             
	//   26   46:iconst_2        
	//   27   47:aload_2         
	//   28   48:iconst_5        
	//   29   49:invokevirtual   #68  <Method int Calendar.get(int)>
	//   30   52:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//   31   55:aastore         
	//   32   56:invokestatic    #80  <Method String String.format(Locale, String, Object[])>
	//   33   59:astore_2        
		if(!sharedpreferences.getBoolean(((String) (obj)), false))
	//*  34   60:aload_1         
	//*  35   61:aload_2         
	//*  36   62:iconst_0        
	//*  37   63:invokeinterface #84  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//*  38   68:ifne            109
		{
			int i = sharedpreferences.getInt("unseen_tips", 0);
	//   39   71:aload_1         
	//   40   72:ldc1            #14  <String "unseen_tips">
	//   41   74:iconst_0        
	//   42   75:invokeinterface #49  <Method int SharedPreferences.getInt(String, int)>
	//   43   80:istore_0        
			sharedpreferences.edit().putInt("unseen_tips", i + 1).putBoolean(((String) (obj)), true).apply();
	//   44   81:aload_1         
	//   45   82:invokeinterface #36  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   46   87:ldc1            #14  <String "unseen_tips">
	//   47   89:iload_0         
	//   48   90:iconst_1        
	//   49   91:iadd            
	//   50   92:invokeinterface #88  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//   51   97:aload_2         
	//   52   98:iconst_1        
	//   53   99:invokeinterface #92  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   54  104:invokeinterface #43  <Method void android.content.SharedPreferences$Editor.apply()>
		}
	//   55  109:return          
	}

	public static void setOffsetSentByServer(Integer integer)
	{
		Integer integer1 = integer;
	//    0    0:aload_0         
	//    1    1:astore_2        
		if(integer == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       11
			integer1 = Integer.valueOf(-1);
	//    4    6:iconst_m1       
	//    5    7:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//    6   10:astore_2        
		int i;
		if(integer1.intValue() == -1)
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #97  <Method int Integer.intValue()>
	//*   9   15:iconst_m1       
	//*  10   16:icmpne          55
			i = 0;
	//   11   19:iconst_0        
	//   12   20:istore_1        
		else
	//*  13   21:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//*  14   24:ldc1            #11  <String "tip_of_the_week">
	//*  15   26:iconst_0        
	//*  16   27:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//*  17   30:invokeinterface #36  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//*  18   35:ldc1            #8   <String "offset_from_server">
	//*  19   37:iload_1         
	//*  20   38:invokestatic    #74  <Method Integer Integer.valueOf(int)>
	//*  21   41:invokevirtual   #97  <Method int Integer.intValue()>
	//*  22   44:invokeinterface #88  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//*  23   49:invokeinterface #43  <Method void android.content.SharedPreferences$Editor.apply()>
	//*  24   54:return          
			i = integer1.intValue();
	//   25   55:aload_2         
	//   26   56:invokevirtual   #97  <Method int Integer.intValue()>
	//   27   59:istore_1        
		BackboneApplication.get().getSharedPreferences("tip_of_the_week", 0).edit().putInt("offset_from_server", Integer.valueOf(i).intValue()).apply();
	//*  28   60:goto            21
	}

	public static void zeroNumberOfUnseenTips()
	{
		BackboneApplication.get().getSharedPreferences("tip_of_the_week", 0).edit().putInt("unseen_tips", 0).apply();
	//    0    0:invokestatic    #26  <Method BackboneApplication BackboneApplication.get()>
	//    1    3:ldc1            #11  <String "tip_of_the_week">
	//    2    5:iconst_0        
	//    3    6:invokevirtual   #30  <Method SharedPreferences BackboneApplication.getSharedPreferences(String, int)>
	//    4    9:invokeinterface #36  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    5   14:ldc1            #14  <String "unseen_tips">
	//    6   16:iconst_0        
	//    7   17:invokeinterface #88  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putInt(String, int)>
	//    8   22:invokeinterface #43  <Method void android.content.SharedPreferences$Editor.apply()>
	//    9   27:return          
	}

	private static final String OFFSET_FROM_SERVER_KEY = "offset_from_server";
	private static final String TIP_OF_THE_WEEK_SHARED_PREFS_FILENAME = "tip_of_the_week";
	private static final String UNSEEN_TIPS_KEY = "unseen_tips";
}
