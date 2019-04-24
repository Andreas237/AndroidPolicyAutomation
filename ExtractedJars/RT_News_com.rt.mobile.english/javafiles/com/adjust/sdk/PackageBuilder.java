// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.adjust.sdk;

import android.text.TextUtils;
import java.util.*;
import org.json.JSONObject;

// Referenced classes of package com.adjust.sdk:
//			AdjustFactory, ActivityState, Util, ILogger, 
//			DeviceInfo, ActivityPackage, AdjustEvent, AdjustAttribution, 
//			AdjustConfig, ActivityKind

class PackageBuilder
{

	public PackageBuilder(AdjustConfig adjustconfig, DeviceInfo deviceinfo, ActivityState activitystate, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		adjustConfig = adjustconfig;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field AdjustConfig adjustConfig>
		deviceInfo = deviceinfo;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field DeviceInfo deviceInfo>
		if(activitystate == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       23
			adjustconfig = null;
	//   10   18:aconst_null     
	//   11   19:astore_1        
		else
	//*  12   20:goto            28
			adjustconfig = ((AdjustConfig) (activitystate.shallowCopy()));
	//   13   23:aload_3         
	//   14   24:invokevirtual   #47  <Method ActivityState ActivityState.shallowCopy()>
	//   15   27:astore_1        
		activityState = ((ActivityState) (adjustconfig));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:putfield        #49  <Field ActivityState activityState>
		createdAt = l;
	//   19   33:aload_0         
	//   20   34:lload           4
	//   21   36:putfield        #51  <Field long createdAt>
	//   22   39:return          
	}

	private void addBoolean(Map map, String s, Boolean boolean1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #55  <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #57  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:539)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #62  <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private void addDate(Map map, String s, long l)
	{
		if(l < 0L)
	//*   0    0:lload_3         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            7
		{
			return;
	//    4    6:return          
		} else
		{
			addString(map, s, Util.dateFormat(l));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:lload_3         
	//    9   11:invokestatic    #72  <Method String Util.dateFormat(long)>
	//   10   14:invokespecial   #76  <Method void addString(Map, String, String)>
			return;
	//   11   17:return          
		}
	}

	private void addDouble(Map map, String s, Double double1)
	{
		if(double1 == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			addString(map, s, String.format(Locale.US, "%.5f", new Object[] {
				double1
			}));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #85  <Field Locale Locale.US>
	//    7   11:ldc1            #87  <String "%.5f">
	//    8   13:iconst_1        
	//    9   14:anewarray       Object[]
	//   10   17:dup             
	//   11   18:iconst_0        
	//   12   19:aload_3         
	//   13   20:aastore         
	//   14   21:invokestatic    #93  <Method String String.format(Locale, String, Object[])>
	//   15   24:invokespecial   #76  <Method void addString(Map, String, String)>
			return;
	//   16   27:return          
		}
	}

	private void addDuration(Map map, String s, long l)
	{
		if(l < 0L)
	//*   0    0:lload_3         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            7
		{
			return;
	//    4    6:return          
		} else
		{
			addInt(map, s, (l + 500L) / 1000L);
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:lload_3         
	//    9   11:ldc2w           #96  <Long 500L>
	//   10   14:ladd            
	//   11   15:ldc2w           #98  <Long 1000L>
	//   12   18:ldiv            
	//   13   19:invokespecial   #102 <Method void addInt(Map, String, long)>
			return;
	//   14   22:return          
		}
	}

	private void addInt(Map map, String s, long l)
	{
		if(l < 0L)
	//*   0    0:lload_3         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifge            7
		{
			return;
	//    4    6:return          
		} else
		{
			addString(map, s, Long.toString(l));
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:aload_2         
	//    8   10:lload_3         
	//    9   11:invokestatic    #107 <Method String Long.toString(long)>
	//   10   14:invokespecial   #76  <Method void addString(Map, String, String)>
			return;
	//   11   17:return          
		}
	}

	private void addMapJson(Map map, String s, Map map1)
	{
		if(map1 == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(map1.size() == 0)
	//*   3    5:aload_3         
	//*   4    6:invokeinterface #115 <Method int Map.size()>
	//*   5   11:ifne            15
		{
			return;
	//    6   14:return          
		} else
		{
			addString(map, s, (new JSONObject(map1)).toString());
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:new             #117 <Class JSONObject>
	//   11   21:dup             
	//   12   22:aload_3         
	//   13   23:invokespecial   #120 <Method void JSONObject(Map)>
	//   14   26:invokevirtual   #123 <Method String JSONObject.toString()>
	//   15   29:invokespecial   #76  <Method void addString(Map, String, String)>
			return;
	//   16   32:return          
		}
	}

	private void addString(Map map, String s, String s1)
	{
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   0    0:aload_3         
	//*   1    1:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			map.put(((Object) (s)), ((Object) (s1)));
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokeinterface #134 <Method Object Map.put(Object, Object)>
	//    8   16:pop             
			return;
	//    9   17:return          
		}
	}

	private void checkDeviceIds(Map map)
	{
		if(!map.containsKey("mac_sha1") && !map.containsKey("mac_md5") && !map.containsKey("android_id") && !map.containsKey("gps_adid"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #138 <String "mac_sha1">
	//*   2    3:invokeinterface #142 <Method boolean Map.containsKey(Object)>
	//*   3    8:ifne            58
	//*   4   11:aload_1         
	//*   5   12:ldc1            #144 <String "mac_md5">
	//*   6   14:invokeinterface #142 <Method boolean Map.containsKey(Object)>
	//*   7   19:ifne            58
	//*   8   22:aload_1         
	//*   9   23:ldc1            #146 <String "android_id">
	//*  10   25:invokeinterface #142 <Method boolean Map.containsKey(Object)>
	//*  11   30:ifne            58
	//*  12   33:aload_1         
	//*  13   34:ldc1            #148 <String "gps_adid">
	//*  14   36:invokeinterface #142 <Method boolean Map.containsKey(Object)>
	//*  15   41:ifne            58
			logger.error("Missing device id's. Please check if Proguard is correctly set with Adjust SDK", new Object[0]);
	//   16   44:getstatic       #32  <Field ILogger logger>
	//   17   47:ldc1            #150 <String "Missing device id's. Please check if Proguard is correctly set with Adjust SDK">
	//   18   49:iconst_0        
	//   19   50:anewarray       Object[]
	//   20   53:invokeinterface #156 <Method void ILogger.error(String, Object[])>
	//   21   58:return          
	}

	private void fillPluginKeys(Map map)
	{
		if(deviceInfo.pluginKeys == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field DeviceInfo deviceInfo>
	//*   2    4:getfield        #163 <Field Map DeviceInfo.pluginKeys>
	//*   3    7:ifnonnull       11
			return;
	//    4   10:return          
		java.util.Map.Entry entry;
		for(Iterator iterator = deviceInfo.pluginKeys.entrySet().iterator(); iterator.hasNext(); addString(map, (String)entry.getKey(), (String)entry.getValue()))
	//*   5   11:aload_0         
	//*   6   12:getfield        #41  <Field DeviceInfo deviceInfo>
	//*   7   15:getfield        #163 <Field Map DeviceInfo.pluginKeys>
	//*   8   18:invokeinterface #167 <Method Set Map.entrySet()>
	//*   9   23:invokeinterface #173 <Method Iterator Set.iterator()>
	//*  10   28:astore_2        
	//*  11   29:aload_2         
	//*  12   30:invokeinterface #179 <Method boolean Iterator.hasNext()>
	//*  13   35:ifeq            74
			entry = (java.util.Map.Entry)iterator.next();
	//   14   38:aload_2         
	//   15   39:invokeinterface #183 <Method Object Iterator.next()>
	//   16   44:checkcast       #185 <Class java.util.Map$Entry>
	//   17   47:astore_3        

	//   18   48:aload_0         
	//   19   49:aload_1         
	//   20   50:aload_3         
	//   21   51:invokeinterface #188 <Method Object java.util.Map$Entry.getKey()>
	//   22   56:checkcast       #89  <Class String>
	//   23   59:aload_3         
	//   24   60:invokeinterface #191 <Method Object java.util.Map$Entry.getValue()>
	//   25   65:checkcast       #89  <Class String>
	//   26   68:invokespecial   #76  <Method void addString(Map, String, String)>
	//*  27   71:goto            29
	//   28   74:return          
	}

	private ActivityPackage getDefaultActivityPackage(ActivityKind activitykind)
	{
		activitykind = ((ActivityKind) (new ActivityPackage(activitykind)));
	//    0    0:new             #195 <Class ActivityPackage>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #198 <Method void ActivityPackage(ActivityKind)>
	//    4    8:astore_1        
		((ActivityPackage) (activitykind)).setClientSdk(deviceInfo.clientSdk);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #41  <Field DeviceInfo deviceInfo>
	//    8   14:getfield        #201 <Field String DeviceInfo.clientSdk>
	//    9   17:invokevirtual   #204 <Method void ActivityPackage.setClientSdk(String)>
		return ((ActivityPackage) (activitykind));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	private Map getDefaultParameters()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #208 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #209 <Method void HashMap()>
	//    3    7:astore_1        
		injectDeviceInfo(((Map) (hashmap)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #212 <Method void injectDeviceInfo(Map)>
		injectConfig(((Map) (hashmap)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #215 <Method void injectConfig(Map)>
		injectActivityState(((Map) (hashmap)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #218 <Method void injectActivityState(Map)>
		injectCreatedAt(((Map) (hashmap)));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokespecial   #221 <Method void injectCreatedAt(Map)>
		checkDeviceIds(((Map) (hashmap)));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokespecial   #223 <Method void checkDeviceIds(Map)>
		return ((Map) (hashmap));
	//   19   33:aload_1         
	//   20   34:areturn         
	}

	private String getEventSuffix(AdjustEvent adjustevent)
	{
		if(adjustevent.revenue == null)
	//*   0    0:aload_1         
	//*   1    1:getfield        #232 <Field Double AdjustEvent.revenue>
	//*   2    4:ifnonnull       27
			return String.format(Locale.US, "'%s'", new Object[] {
				adjustevent.eventToken
			});
	//    3    7:getstatic       #85  <Field Locale Locale.US>
	//    4   10:ldc1            #234 <String "'%s'">
	//    5   12:iconst_1        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:aload_1         
	//   10   19:getfield        #237 <Field String AdjustEvent.eventToken>
	//   11   22:aastore         
	//   12   23:invokestatic    #93  <Method String String.format(Locale, String, Object[])>
	//   13   26:areturn         
		else
			return String.format(Locale.US, "(%.5f %s, '%s')", new Object[] {
				adjustevent.revenue, adjustevent.currency, adjustevent.eventToken
			});
	//   14   27:getstatic       #85  <Field Locale Locale.US>
	//   15   30:ldc1            #239 <String "(%.5f %s, '%s')">
	//   16   32:iconst_3        
	//   17   33:anewarray       Object[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:aload_1         
	//   21   39:getfield        #232 <Field Double AdjustEvent.revenue>
	//   22   42:aastore         
	//   23   43:dup             
	//   24   44:iconst_1        
	//   25   45:aload_1         
	//   26   46:getfield        #242 <Field String AdjustEvent.currency>
	//   27   49:aastore         
	//   28   50:dup             
	//   29   51:iconst_2        
	//   30   52:aload_1         
	//   31   53:getfield        #237 <Field String AdjustEvent.eventToken>
	//   32   56:aastore         
	//   33   57:invokestatic    #93  <Method String String.format(Locale, String, Object[])>
	//   34   60:areturn         
	}

	private Map getIdsParameters()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #208 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #209 <Method void HashMap()>
	//    3    7:astore_1        
		injectDeviceInfoIds(((Map) (hashmap)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #246 <Method void injectDeviceInfoIds(Map)>
		injectConfig(((Map) (hashmap)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #215 <Method void injectConfig(Map)>
		injectCreatedAt(((Map) (hashmap)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokespecial   #221 <Method void injectCreatedAt(Map)>
		checkDeviceIds(((Map) (hashmap)));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokespecial   #223 <Method void checkDeviceIds(Map)>
		return ((Map) (hashmap));
	//   16   28:aload_1         
	//   17   29:areturn         
	}

	private void injectActivityState(Map map)
	{
		addString(map, "android_uuid", activityState.uuid);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #248 <String "android_uuid">
	//    3    4:aload_0         
	//    4    5:getfield        #49  <Field ActivityState activityState>
	//    5    8:getfield        #251 <Field String ActivityState.uuid>
	//    6   11:invokespecial   #76  <Method void addString(Map, String, String)>
		addInt(map, "session_count", activityState.sessionCount);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #253 <String "session_count">
	//   10   18:aload_0         
	//   11   19:getfield        #49  <Field ActivityState activityState>
	//   12   22:getfield        #257 <Field int ActivityState.sessionCount>
	//   13   25:i2l             
	//   14   26:invokespecial   #102 <Method void addInt(Map, String, long)>
		addInt(map, "subsession_count", activityState.subsessionCount);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:ldc2            #259 <String "subsession_count">
	//   18   34:aload_0         
	//   19   35:getfield        #49  <Field ActivityState activityState>
	//   20   38:getfield        #262 <Field int ActivityState.subsessionCount>
	//   21   41:i2l             
	//   22   42:invokespecial   #102 <Method void addInt(Map, String, long)>
		addDuration(map, "session_length", activityState.sessionLength);
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:ldc2            #264 <String "session_length">
	//   26   50:aload_0         
	//   27   51:getfield        #49  <Field ActivityState activityState>
	//   28   54:getfield        #267 <Field long ActivityState.sessionLength>
	//   29   57:invokespecial   #269 <Method void addDuration(Map, String, long)>
		addDuration(map, "time_spent", activityState.timeSpent);
	//   30   60:aload_0         
	//   31   61:aload_1         
	//   32   62:ldc2            #271 <String "time_spent">
	//   33   65:aload_0         
	//   34   66:getfield        #49  <Field ActivityState activityState>
	//   35   69:getfield        #274 <Field long ActivityState.timeSpent>
	//   36   72:invokespecial   #269 <Method void addDuration(Map, String, long)>
	//   37   75:return          
	}

	private void injectAttribution(Map map)
	{
		if(attribution == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field AdjustAttribution attribution>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			addString(map, "tracker", attribution.trackerName);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:ldc2            #279 <String "tracker">
	//    7   13:aload_0         
	//    8   14:getfield        #277 <Field AdjustAttribution attribution>
	//    9   17:getfield        #284 <Field String AdjustAttribution.trackerName>
	//   10   20:invokespecial   #76  <Method void addString(Map, String, String)>
			addString(map, "campaign", attribution.campaign);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:ldc2            #286 <String "campaign">
	//   14   28:aload_0         
	//   15   29:getfield        #277 <Field AdjustAttribution attribution>
	//   16   32:getfield        #288 <Field String AdjustAttribution.campaign>
	//   17   35:invokespecial   #76  <Method void addString(Map, String, String)>
			addString(map, "adgroup", attribution.adgroup);
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:ldc2            #290 <String "adgroup">
	//   21   43:aload_0         
	//   22   44:getfield        #277 <Field AdjustAttribution attribution>
	//   23   47:getfield        #292 <Field String AdjustAttribution.adgroup>
	//   24   50:invokespecial   #76  <Method void addString(Map, String, String)>
			addString(map, "creative", attribution.creative);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:ldc2            #294 <String "creative">
	//   28   58:aload_0         
	//   29   59:getfield        #277 <Field AdjustAttribution attribution>
	//   30   62:getfield        #296 <Field String AdjustAttribution.creative>
	//   31   65:invokespecial   #76  <Method void addString(Map, String, String)>
			return;
	//   32   68:return          
		}
	}

	private void injectConfig(Map map)
	{
		addString(map, "app_token", adjustConfig.appToken);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #298 <String "app_token">
	//    3    5:aload_0         
	//    4    6:getfield        #39  <Field AdjustConfig adjustConfig>
	//    5    9:getfield        #303 <Field String AdjustConfig.appToken>
	//    6   12:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "environment", adjustConfig.environment);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:ldc2            #305 <String "environment">
	//   10   20:aload_0         
	//   11   21:getfield        #39  <Field AdjustConfig adjustConfig>
	//   12   24:getfield        #307 <Field String AdjustConfig.environment>
	//   13   27:invokespecial   #76  <Method void addString(Map, String, String)>
		addBoolean(map, "device_known", adjustConfig.deviceKnown);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:ldc2            #309 <String "device_known">
	//   17   35:aload_0         
	//   18   36:getfield        #39  <Field AdjustConfig adjustConfig>
	//   19   39:getfield        #313 <Field Boolean AdjustConfig.deviceKnown>
	//   20   42:invokespecial   #315 <Method void addBoolean(Map, String, Boolean)>
		addBoolean(map, "needs_attribution_data", Boolean.valueOf(adjustConfig.hasListener()));
	//   21   45:aload_0         
	//   22   46:aload_1         
	//   23   47:ldc2            #317 <String "needs_attribution_data">
	//   24   50:aload_0         
	//   25   51:getfield        #39  <Field AdjustConfig adjustConfig>
	//   26   54:invokevirtual   #320 <Method boolean AdjustConfig.hasListener()>
	//   27   57:invokestatic    #326 <Method Boolean Boolean.valueOf(boolean)>
	//   28   60:invokespecial   #315 <Method void addBoolean(Map, String, Boolean)>
		addString(map, "gps_adid", Util.getPlayAdId(adjustConfig.context));
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:ldc1            #148 <String "gps_adid">
	//   32   67:aload_0         
	//   33   68:getfield        #39  <Field AdjustConfig adjustConfig>
	//   34   71:getfield        #330 <Field android.content.Context AdjustConfig.context>
	//   35   74:invokestatic    #334 <Method String Util.getPlayAdId(android.content.Context)>
	//   36   77:invokespecial   #76  <Method void addString(Map, String, String)>
		addBoolean(map, "tracking_enabled", Util.isPlayTrackingEnabled(adjustConfig.context));
	//   37   80:aload_0         
	//   38   81:aload_1         
	//   39   82:ldc2            #336 <String "tracking_enabled">
	//   40   85:aload_0         
	//   41   86:getfield        #39  <Field AdjustConfig adjustConfig>
	//   42   89:getfield        #330 <Field android.content.Context AdjustConfig.context>
	//   43   92:invokestatic    #340 <Method Boolean Util.isPlayTrackingEnabled(android.content.Context)>
	//   44   95:invokespecial   #315 <Method void addBoolean(Map, String, Boolean)>
	//   45   98:return          
	}

	private void injectCreatedAt(Map map)
	{
		addDate(map, "created_at", createdAt);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #342 <String "created_at">
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field long createdAt>
	//    5    9:invokespecial   #344 <Method void addDate(Map, String, long)>
	//    6   12:return          
	}

	private void injectDeviceInfo(Map map)
	{
		injectDeviceInfoIds(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #246 <Method void injectDeviceInfoIds(Map)>
		addString(map, "fb_id", deviceInfo.fbAttributionId);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc2            #346 <String "fb_id">
	//    6   10:aload_0         
	//    7   11:getfield        #41  <Field DeviceInfo deviceInfo>
	//    8   14:getfield        #349 <Field String DeviceInfo.fbAttributionId>
	//    9   17:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "package_name", deviceInfo.packageName);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:ldc2            #351 <String "package_name">
	//   13   25:aload_0         
	//   14   26:getfield        #41  <Field DeviceInfo deviceInfo>
	//   15   29:getfield        #354 <Field String DeviceInfo.packageName>
	//   16   32:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "app_version", deviceInfo.appVersion);
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:ldc2            #356 <String "app_version">
	//   20   40:aload_0         
	//   21   41:getfield        #41  <Field DeviceInfo deviceInfo>
	//   22   44:getfield        #359 <Field String DeviceInfo.appVersion>
	//   23   47:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "device_type", deviceInfo.deviceType);
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:ldc2            #361 <String "device_type">
	//   27   55:aload_0         
	//   28   56:getfield        #41  <Field DeviceInfo deviceInfo>
	//   29   59:getfield        #364 <Field String DeviceInfo.deviceType>
	//   30   62:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "device_name", deviceInfo.deviceName);
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:ldc2            #366 <String "device_name">
	//   34   70:aload_0         
	//   35   71:getfield        #41  <Field DeviceInfo deviceInfo>
	//   36   74:getfield        #369 <Field String DeviceInfo.deviceName>
	//   37   77:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "device_manufacturer", deviceInfo.deviceManufacturer);
	//   38   80:aload_0         
	//   39   81:aload_1         
	//   40   82:ldc2            #371 <String "device_manufacturer">
	//   41   85:aload_0         
	//   42   86:getfield        #41  <Field DeviceInfo deviceInfo>
	//   43   89:getfield        #374 <Field String DeviceInfo.deviceManufacturer>
	//   44   92:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "os_name", deviceInfo.osName);
	//   45   95:aload_0         
	//   46   96:aload_1         
	//   47   97:ldc2            #376 <String "os_name">
	//   48  100:aload_0         
	//   49  101:getfield        #41  <Field DeviceInfo deviceInfo>
	//   50  104:getfield        #379 <Field String DeviceInfo.osName>
	//   51  107:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "os_version", deviceInfo.osVersion);
	//   52  110:aload_0         
	//   53  111:aload_1         
	//   54  112:ldc2            #381 <String "os_version">
	//   55  115:aload_0         
	//   56  116:getfield        #41  <Field DeviceInfo deviceInfo>
	//   57  119:getfield        #384 <Field String DeviceInfo.osVersion>
	//   58  122:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "api_level", deviceInfo.apiLevel);
	//   59  125:aload_0         
	//   60  126:aload_1         
	//   61  127:ldc2            #386 <String "api_level">
	//   62  130:aload_0         
	//   63  131:getfield        #41  <Field DeviceInfo deviceInfo>
	//   64  134:getfield        #389 <Field String DeviceInfo.apiLevel>
	//   65  137:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "language", deviceInfo.language);
	//   66  140:aload_0         
	//   67  141:aload_1         
	//   68  142:ldc2            #391 <String "language">
	//   69  145:aload_0         
	//   70  146:getfield        #41  <Field DeviceInfo deviceInfo>
	//   71  149:getfield        #393 <Field String DeviceInfo.language>
	//   72  152:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "country", deviceInfo.country);
	//   73  155:aload_0         
	//   74  156:aload_1         
	//   75  157:ldc2            #395 <String "country">
	//   76  160:aload_0         
	//   77  161:getfield        #41  <Field DeviceInfo deviceInfo>
	//   78  164:getfield        #397 <Field String DeviceInfo.country>
	//   79  167:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "screen_size", deviceInfo.screenSize);
	//   80  170:aload_0         
	//   81  171:aload_1         
	//   82  172:ldc2            #399 <String "screen_size">
	//   83  175:aload_0         
	//   84  176:getfield        #41  <Field DeviceInfo deviceInfo>
	//   85  179:getfield        #402 <Field String DeviceInfo.screenSize>
	//   86  182:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "screen_format", deviceInfo.screenFormat);
	//   87  185:aload_0         
	//   88  186:aload_1         
	//   89  187:ldc2            #404 <String "screen_format">
	//   90  190:aload_0         
	//   91  191:getfield        #41  <Field DeviceInfo deviceInfo>
	//   92  194:getfield        #407 <Field String DeviceInfo.screenFormat>
	//   93  197:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "screen_density", deviceInfo.screenDensity);
	//   94  200:aload_0         
	//   95  201:aload_1         
	//   96  202:ldc2            #409 <String "screen_density">
	//   97  205:aload_0         
	//   98  206:getfield        #41  <Field DeviceInfo deviceInfo>
	//   99  209:getfield        #412 <Field String DeviceInfo.screenDensity>
	//  100  212:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "display_width", deviceInfo.displayWidth);
	//  101  215:aload_0         
	//  102  216:aload_1         
	//  103  217:ldc2            #414 <String "display_width">
	//  104  220:aload_0         
	//  105  221:getfield        #41  <Field DeviceInfo deviceInfo>
	//  106  224:getfield        #417 <Field String DeviceInfo.displayWidth>
	//  107  227:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "display_height", deviceInfo.displayHeight);
	//  108  230:aload_0         
	//  109  231:aload_1         
	//  110  232:ldc2            #419 <String "display_height">
	//  111  235:aload_0         
	//  112  236:getfield        #41  <Field DeviceInfo deviceInfo>
	//  113  239:getfield        #422 <Field String DeviceInfo.displayHeight>
	//  114  242:invokespecial   #76  <Method void addString(Map, String, String)>
		fillPluginKeys(map);
	//  115  245:aload_0         
	//  116  246:aload_1         
	//  117  247:invokespecial   #424 <Method void fillPluginKeys(Map)>
	//  118  250:return          
	}

	private void injectDeviceInfoIds(Map map)
	{
		addString(map, "mac_sha1", deviceInfo.macSha1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #138 <String "mac_sha1">
	//    3    4:aload_0         
	//    4    5:getfield        #41  <Field DeviceInfo deviceInfo>
	//    5    8:getfield        #427 <Field String DeviceInfo.macSha1>
	//    6   11:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "mac_md5", deviceInfo.macShortMd5);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:ldc1            #144 <String "mac_md5">
	//   10   18:aload_0         
	//   11   19:getfield        #41  <Field DeviceInfo deviceInfo>
	//   12   22:getfield        #430 <Field String DeviceInfo.macShortMd5>
	//   13   25:invokespecial   #76  <Method void addString(Map, String, String)>
		addString(map, "android_id", deviceInfo.androidId);
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:ldc1            #146 <String "android_id">
	//   17   32:aload_0         
	//   18   33:getfield        #41  <Field DeviceInfo deviceInfo>
	//   19   36:getfield        #433 <Field String DeviceInfo.androidId>
	//   20   39:invokespecial   #76  <Method void addString(Map, String, String)>
	//   21   42:return          
	}

	public ActivityPackage buildAttributionPackage()
	{
		Map map = getIdsParameters();
	//    0    0:aload_0         
	//    1    1:invokespecial   #437 <Method Map getIdsParameters()>
	//    2    4:astore_1        
		ActivityPackage activitypackage = getDefaultActivityPackage(ActivityKind.ATTRIBUTION);
	//    3    5:aload_0         
	//    4    6:getstatic       #443 <Field ActivityKind ActivityKind.ATTRIBUTION>
	//    5    9:invokespecial   #445 <Method ActivityPackage getDefaultActivityPackage(ActivityKind)>
	//    6   12:astore_2        
		activitypackage.setPath("attribution");
	//    7   13:aload_2         
	//    8   14:ldc2            #446 <String "attribution">
	//    9   17:invokevirtual   #449 <Method void ActivityPackage.setPath(String)>
		activitypackage.setSuffix("");
	//   10   20:aload_2         
	//   11   21:ldc2            #451 <String "">
	//   12   24:invokevirtual   #454 <Method void ActivityPackage.setSuffix(String)>
		activitypackage.setParameters(map);
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #457 <Method void ActivityPackage.setParameters(Map)>
		return activitypackage;
	//   16   32:aload_2         
	//   17   33:areturn         
	}

	public ActivityPackage buildClickPackage(String s, long l)
	{
		Map map = getIdsParameters();
	//    0    0:aload_0         
	//    1    1:invokespecial   #437 <Method Map getIdsParameters()>
	//    2    4:astore          4
		addString(map, "source", s);
	//    3    6:aload_0         
	//    4    7:aload           4
	//    5    9:ldc2            #461 <String "source">
	//    6   12:aload_1         
	//    7   13:invokespecial   #76  <Method void addString(Map, String, String)>
		addDate(map, "click_time", l);
	//    8   16:aload_0         
	//    9   17:aload           4
	//   10   19:ldc2            #463 <String "click_time">
	//   11   22:lload_2         
	//   12   23:invokespecial   #344 <Method void addDate(Map, String, long)>
		addString(map, "reftag", reftag);
	//   13   26:aload_0         
	//   14   27:aload           4
	//   15   29:ldc2            #464 <String "reftag">
	//   16   32:aload_0         
	//   17   33:getfield        #466 <Field String reftag>
	//   18   36:invokespecial   #76  <Method void addString(Map, String, String)>
		addMapJson(map, "params", extraParameters);
	//   19   39:aload_0         
	//   20   40:aload           4
	//   21   42:ldc2            #468 <String "params">
	//   22   45:aload_0         
	//   23   46:getfield        #470 <Field Map extraParameters>
	//   24   49:invokespecial   #472 <Method void addMapJson(Map, String, Map)>
		addString(map, "referrer", referrer);
	//   25   52:aload_0         
	//   26   53:aload           4
	//   27   55:ldc2            #473 <String "referrer">
	//   28   58:aload_0         
	//   29   59:getfield        #475 <Field String referrer>
	//   30   62:invokespecial   #76  <Method void addString(Map, String, String)>
		injectAttribution(map);
	//   31   65:aload_0         
	//   32   66:aload           4
	//   33   68:invokespecial   #477 <Method void injectAttribution(Map)>
		s = ((String) (getDefaultActivityPackage(ActivityKind.CLICK)));
	//   34   71:aload_0         
	//   35   72:getstatic       #480 <Field ActivityKind ActivityKind.CLICK>
	//   36   75:invokespecial   #445 <Method ActivityPackage getDefaultActivityPackage(ActivityKind)>
	//   37   78:astore_1        
		((ActivityPackage) (s)).setPath("/sdk_click");
	//   38   79:aload_1         
	//   39   80:ldc2            #482 <String "/sdk_click">
	//   40   83:invokevirtual   #449 <Method void ActivityPackage.setPath(String)>
		((ActivityPackage) (s)).setSuffix("");
	//   41   86:aload_1         
	//   42   87:ldc2            #451 <String "">
	//   43   90:invokevirtual   #454 <Method void ActivityPackage.setSuffix(String)>
		((ActivityPackage) (s)).setParameters(map);
	//   44   93:aload_1         
	//   45   94:aload           4
	//   46   96:invokevirtual   #457 <Method void ActivityPackage.setParameters(Map)>
		return ((ActivityPackage) (s));
	//   47   99:aload_1         
	//   48  100:areturn         
	}

	public ActivityPackage buildEventPackage(AdjustEvent adjustevent)
	{
		Map map = getDefaultParameters();
	//    0    0:aload_0         
	//    1    1:invokespecial   #486 <Method Map getDefaultParameters()>
	//    2    4:astore_2        
		addInt(map, "event_count", activityState.eventCount);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:ldc2            #488 <String "event_count">
	//    6   10:aload_0         
	//    7   11:getfield        #49  <Field ActivityState activityState>
	//    8   14:getfield        #491 <Field int ActivityState.eventCount>
	//    9   17:i2l             
	//   10   18:invokespecial   #102 <Method void addInt(Map, String, long)>
		addString(map, "event_token", adjustevent.eventToken);
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:ldc2            #493 <String "event_token">
	//   14   26:aload_1         
	//   15   27:getfield        #237 <Field String AdjustEvent.eventToken>
	//   16   30:invokespecial   #76  <Method void addString(Map, String, String)>
		addDouble(map, "revenue", adjustevent.revenue);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:ldc2            #494 <String "revenue">
	//   20   38:aload_1         
	//   21   39:getfield        #232 <Field Double AdjustEvent.revenue>
	//   22   42:invokespecial   #496 <Method void addDouble(Map, String, Double)>
		addString(map, "currency", adjustevent.currency);
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:ldc2            #497 <String "currency">
	//   26   50:aload_1         
	//   27   51:getfield        #242 <Field String AdjustEvent.currency>
	//   28   54:invokespecial   #76  <Method void addString(Map, String, String)>
		addMapJson(map, "callback_params", adjustevent.callbackParameters);
	//   29   57:aload_0         
	//   30   58:aload_2         
	//   31   59:ldc2            #499 <String "callback_params">
	//   32   62:aload_1         
	//   33   63:getfield        #502 <Field Map AdjustEvent.callbackParameters>
	//   34   66:invokespecial   #472 <Method void addMapJson(Map, String, Map)>
		addMapJson(map, "partner_params", adjustevent.partnerParameters);
	//   35   69:aload_0         
	//   36   70:aload_2         
	//   37   71:ldc2            #504 <String "partner_params">
	//   38   74:aload_1         
	//   39   75:getfield        #507 <Field Map AdjustEvent.partnerParameters>
	//   40   78:invokespecial   #472 <Method void addMapJson(Map, String, Map)>
		ActivityPackage activitypackage = getDefaultActivityPackage(ActivityKind.EVENT);
	//   41   81:aload_0         
	//   42   82:getstatic       #510 <Field ActivityKind ActivityKind.EVENT>
	//   43   85:invokespecial   #445 <Method ActivityPackage getDefaultActivityPackage(ActivityKind)>
	//   44   88:astore_3        
		activitypackage.setPath("/event");
	//   45   89:aload_3         
	//   46   90:ldc2            #512 <String "/event">
	//   47   93:invokevirtual   #449 <Method void ActivityPackage.setPath(String)>
		activitypackage.setSuffix(getEventSuffix(adjustevent));
	//   48   96:aload_3         
	//   49   97:aload_0         
	//   50   98:aload_1         
	//   51   99:invokespecial   #514 <Method String getEventSuffix(AdjustEvent)>
	//   52  102:invokevirtual   #454 <Method void ActivityPackage.setSuffix(String)>
		activitypackage.setParameters(map);
	//   53  105:aload_3         
	//   54  106:aload_2         
	//   55  107:invokevirtual   #457 <Method void ActivityPackage.setParameters(Map)>
		return activitypackage;
	//   56  110:aload_3         
	//   57  111:areturn         
	}

	public ActivityPackage buildSessionPackage()
	{
		Map map = getDefaultParameters();
	//    0    0:aload_0         
	//    1    1:invokespecial   #486 <Method Map getDefaultParameters()>
	//    2    4:astore_1        
		addDuration(map, "last_interval", activityState.lastInterval);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:ldc2            #517 <String "last_interval">
	//    6   10:aload_0         
	//    7   11:getfield        #49  <Field ActivityState activityState>
	//    8   14:getfield        #520 <Field long ActivityState.lastInterval>
	//    9   17:invokespecial   #269 <Method void addDuration(Map, String, long)>
		addString(map, "default_tracker", adjustConfig.defaultTracker);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:ldc2            #522 <String "default_tracker">
	//   13   25:aload_0         
	//   14   26:getfield        #39  <Field AdjustConfig adjustConfig>
	//   15   29:getfield        #525 <Field String AdjustConfig.defaultTracker>
	//   16   32:invokespecial   #76  <Method void addString(Map, String, String)>
		ActivityPackage activitypackage = getDefaultActivityPackage(ActivityKind.SESSION);
	//   17   35:aload_0         
	//   18   36:getstatic       #528 <Field ActivityKind ActivityKind.SESSION>
	//   19   39:invokespecial   #445 <Method ActivityPackage getDefaultActivityPackage(ActivityKind)>
	//   20   42:astore_2        
		activitypackage.setPath("/session");
	//   21   43:aload_2         
	//   22   44:ldc2            #530 <String "/session">
	//   23   47:invokevirtual   #449 <Method void ActivityPackage.setPath(String)>
		activitypackage.setSuffix("");
	//   24   50:aload_2         
	//   25   51:ldc2            #451 <String "">
	//   26   54:invokevirtual   #454 <Method void ActivityPackage.setSuffix(String)>
		activitypackage.setParameters(map);
	//   27   57:aload_2         
	//   28   58:aload_1         
	//   29   59:invokevirtual   #457 <Method void ActivityPackage.setParameters(Map)>
		return activitypackage;
	//   30   62:aload_2         
	//   31   63:areturn         
	}

	private static ILogger logger = AdjustFactory.getLogger();
	private ActivityState activityState;
	private AdjustConfig adjustConfig;
	AdjustAttribution attribution;
	private long createdAt;
	private DeviceInfo deviceInfo;
	Map extraParameters;
	String referrer;
	String reftag;

	static 
	{
	//    0    0:invokestatic    #30  <Method ILogger AdjustFactory.getLogger()>
	//    1    3:putstatic       #32  <Field ILogger logger>
	//*   2    6:return          
	}
}
