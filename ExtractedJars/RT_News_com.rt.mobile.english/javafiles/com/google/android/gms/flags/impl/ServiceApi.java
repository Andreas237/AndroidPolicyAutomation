// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.util.Log;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.SharedPreferencesUtils;
import com.google.android.gms.flags.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.flags.impl:
//			SharedPreferencesFactory, DataUtils

public class ServiceApi
{

	public ServiceApi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void persistGserviceValues(Context context)
	{
		Object obj;
		Iterator iterator;
		try
		{
			obj = ((Object) (SharedPreferencesFactory.getSharedPreferences(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #19  <Method SharedPreferences SharedPreferencesFactory.getSharedPreferences(Context)>
	//    2    4:astore_1        
		}
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #25  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//*   5   11:astore_1        
	//*   6   12:invokestatic    #31  <Method FlagRegistry Singletons.flagRegistry()>
	//*   7   15:invokevirtual   #37  <Method Collection FlagRegistry.registeredFlags()>
	//*   8   18:invokeinterface #43  <Method Iterator Collection.iterator()>
	//*   9   23:astore_2        
	//*  10   24:aload_2         
	//*  11   25:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//*  12   30:ifeq            70
	//*  13   33:aload_2         
	//*  14   34:invokeinterface #53  <Method Object Iterator.next()>
	//*  15   39:checkcast       #55  <Class Flag>
	//*  16   42:astore_3        
	//*  17   43:aload_3         
	//*  18   44:invokevirtual   #59  <Method int Flag.getSource()>
	//*  19   47:ifne            24
	//*  20   50:aload_3         
	//*  21   51:invokestatic    #65  <Method DataUtils DataUtils.forFlag(Flag)>
	//*  22   54:astore_3        
	//*  23   55:aload_3         
	//*  24   56:aload_1         
	//*  25   57:aload_3         
	//*  26   58:invokevirtual   #69  <Method GservicesValue DataUtils.getGservicesValue()>
	//*  27   61:invokevirtual   #74  <Method Object GservicesValue.get()>
	//*  28   64:invokevirtual   #78  <Method void DataUtils.putInSharedPreferences(android.content.SharedPreferences$Editor, Object)>
	//*  29   67:goto            24
	//*  30   70:aload_0         
	//*  31   71:aload_1         
	//*  32   72:ldc1            #80  <String "google_sdk_flags">
	//*  33   74:invokestatic    #86  <Method void SharedPreferencesUtils.publishWorldReadableSharedPreferences(Context, android.content.SharedPreferences$Editor, String)>
	//*  34   77:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  35   78:astore_0        
		{
			context = ((Context) (String.valueOf(((Object) (((Exception) (context)).getMessage())))));
	//   36   79:aload_0         
	//   37   80:invokevirtual   #90  <Method String Exception.getMessage()>
	//   38   83:invokestatic    #96  <Method String String.valueOf(Object)>
	//   39   86:astore_0        
			if(((String) (context)).length() != 0)
	//*  40   87:aload_0         
	//*  41   88:invokevirtual   #99  <Method int String.length()>
	//*  42   91:ifeq            104
				context = ((Context) ("Failed to write shared flags: ".concat(((String) (context)))));
	//   43   94:ldc1            #101 <String "Failed to write shared flags: ">
	//   44   96:aload_0         
	//   45   97:invokevirtual   #105 <Method String String.concat(String)>
	//   46  100:astore_0        
			else
	//*  47  101:goto            114
				context = ((Context) (new String("Failed to write shared flags: ")));
	//   48  104:new             #92  <Class String>
	//   49  107:dup             
	//   50  108:ldc1            #101 <String "Failed to write shared flags: ">
	//   51  110:invokespecial   #108 <Method void String(String)>
	//   52  113:astore_0        
			Log.e("FlagsServiceApi", ((String) (context)));
	//   53  114:ldc1            #110 <String "FlagsServiceApi">
	//   54  116:aload_0         
	//   55  117:invokestatic    #116 <Method int Log.e(String, String)>
	//   56  120:pop             
			return;
	//   57  121:return          
		}
		obj = ((Object) (((SharedPreferences) (obj)).edit()));
		iterator = Singletons.flagRegistry().registeredFlags().iterator();
		do
		{
			if(!iterator.hasNext())
				break;
			Object obj1 = ((Object) ((Flag)iterator.next()));
			if(((Flag) (obj1)).getSource() == 0)
			{
				obj1 = ((Object) (DataUtils.forFlag(((Flag) (obj1)))));
				((DataUtils) (obj1)).putInSharedPreferences(((android.content.SharedPreferences.Editor) (obj)), ((DataUtils) (obj1)).getGservicesValue().get());
			}
		} while(true);
		SharedPreferencesUtils.publishWorldReadableSharedPreferences(context, ((android.content.SharedPreferences.Editor) (obj)), "google_sdk_flags");
	}

	public List getExperimentIdsFromService()
	{
		long l;
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #120 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void ArrayList()>
	//    3    7:astore_3        
		l = Binder.clearCallingIdentity();
	//    4    8:invokestatic    #127 <Method long Binder.clearCallingIdentity()>
	//    5   11:lstore_1        
		Iterator iterator = Singletons.flagRegistry().registeredServiceExperimentIdFlags().iterator();
	//    6   12:invokestatic    #31  <Method FlagRegistry Singletons.flagRegistry()>
	//    7   15:invokevirtual   #130 <Method Collection FlagRegistry.registeredServiceExperimentIdFlags()>
	//    8   18:invokeinterface #43  <Method Iterator Collection.iterator()>
	//    9   23:astore          4
_L2:
		String s;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_80;
	//   10   25:aload           4
	//   11   27:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//   12   32:ifeq            80
			s = (String)((DataUtils) (new DataUtils.StringUtils((com.google.android.gms.flags.Flag.StringFlag)iterator.next()))).getGservicesValue().get();
	//   13   35:new             #132 <Class DataUtils$StringUtils>
	//   14   38:dup             
	//   15   39:aload           4
	//   16   41:invokeinterface #53  <Method Object Iterator.next()>
	//   17   46:checkcast       #134 <Class com.google.android.gms.flags.Flag$StringFlag>
	//   18   49:invokespecial   #137 <Method void DataUtils$StringUtils(com.google.android.gms.flags.Flag$StringFlag)>
	//   19   52:invokevirtual   #69  <Method GservicesValue DataUtils.getGservicesValue()>
	//   20   55:invokevirtual   #74  <Method Object GservicesValue.get()>
	//   21   58:checkcast       #92  <Class String>
	//   22   61:astore          5
		} while(s == null);
	//   23   63:aload           5
	//   24   65:ifnull          25
		((List) (arraylist)).add(((Object) (s)));
	//   25   68:aload_3         
	//   26   69:aload           5
	//   27   71:invokeinterface #143 <Method boolean List.add(Object)>
	//   28   76:pop             
		if(true) goto _L2; else goto _L1
	//   29   77:goto            25
_L1:
		Binder.restoreCallingIdentity(l);
	//   30   80:lload_1         
	//   31   81:invokestatic    #147 <Method void Binder.restoreCallingIdentity(long)>
		return ((List) (arraylist));
	//   32   84:aload_3         
	//   33   85:areturn         
		Exception exception;
		exception;
	//   34   86:astore_3        
		Binder.restoreCallingIdentity(l);
	//   35   87:lload_1         
	//   36   88:invokestatic    #147 <Method void Binder.restoreCallingIdentity(long)>
		throw exception;
	//   37   91:aload_3         
	//   38   92:athrow          
	}
}
