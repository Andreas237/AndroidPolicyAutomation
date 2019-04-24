// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hidatamanager;

import android.content.ComponentName;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hidatamanager.hwnaturalbase.NBDataSourceManager;
import com.huawei.hidatamanager.hwnaturalbase.NBValidated;
import com.huawei.hidatamanager.util.Const;
import com.huawei.hidatamanager.util.LogUtils;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.huawei.hidatamanager:
//			CaptureLocalService, SwitchManager

public class HiDataManager
{
	static final class SingletonHolder
	{

		public static final HiDataManager INSTANCE = new HiDataManager();

		static 
		{
		//    0    0:new             #6   <Class HiDataManager>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #15  <Method void HiDataManager(HiDataManager$1)>
		//    4    8:putstatic       #17  <Field HiDataManager INSTANCE>
		//*   5   11:return          
		}

		private SingletonHolder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}


	private HiDataManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		isInitialized = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #34  <Field boolean isInitialized>
	//    5    9:return          
	}


	public static final HiDataManager getInstance()
	{
		return SingletonHolder.INSTANCE;
	//    0    0:getstatic       #43  <Field HiDataManager HiDataManager$SingletonHolder.INSTANCE>
	//    1    3:areturn         
	}

	private boolean insertDataToRawTable(long l, String s)
	{
		Object obj;
		LogUtils.w("HiDataManager", "insertDataToRawTable enter!");
	//    0    0:ldc1            #22  <String "HiDataManager">
	//    1    2:ldc1            #49  <String "insertDataToRawTable enter!">
	//    2    4:invokestatic    #55  <Method void LogUtils.w(String, String)>
		Object obj1;
		Method method;
		try
		{
			obj1 = ((Object) (mNBDataSourceManager.getClassLoader().loadClass("com.huawei.nb.model.collectencrypt.RawAppDataOrigin")));
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field NBDataSourceManager mNBDataSourceManager>
	//    5   11:invokevirtual   #63  <Method ClassLoader NBDataSourceManager.getClassLoader()>
	//    6   14:ldc1            #65  <String "com.huawei.nb.model.collectencrypt.RawAppDataOrigin">
	//    7   16:invokevirtual   #71  <Method Class ClassLoader.loadClass(String)>
	//    8   19:astore          5
			obj = ((Class) (obj1)).newInstance();
	//    9   21:aload           5
	//   10   23:invokevirtual   #77  <Method Object Class.newInstance()>
	//   11   26:astore          4
			method = ((Class) (obj1)).getMethod("setDataSerialNumber", new Class[] {
				java/lang/Long
			});
	//   12   28:aload           5
	//   13   30:ldc1            #79  <String "setDataSerialNumber">
	//   14   32:iconst_1        
	//   15   33:anewarray       Class[]
	//   16   36:dup             
	//   17   37:iconst_0        
	//   18   38:ldc1            #81  <Class Long>
	//   19   40:aastore         
	//   20   41:invokevirtual   #85  <Method Method Class.getMethod(String, Class[])>
	//   21   44:astore          6
		}
	//*  22   46:aload           6
	//*  23   48:ifnonnull       60
	//*  24   51:ldc1            #22  <String "HiDataManager">
	//*  25   53:ldc1            #87  <String "setDataSerialNumber is null!">
	//*  26   55:invokestatic    #90  <Method void LogUtils.e(String, String)>
	//*  27   58:iconst_0        
	//*  28   59:ireturn         
	//*  29   60:aload           6
	//*  30   62:aload           4
	//*  31   64:iconst_1        
	//*  32   65:anewarray       Object[]
	//*  33   68:dup             
	//*  34   69:iconst_0        
	//*  35   70:lload_1         
	//*  36   71:invokestatic    #94  <Method Long Long.valueOf(long)>
	//*  37   74:aastore         
	//*  38   75:invokevirtual   #100 <Method Object Method.invoke(Object, Object[])>
	//*  39   78:pop             
	//*  40   79:aload           5
	//*  41   81:ldc1            #102 <String "setTimestamp">
	//*  42   83:iconst_1        
	//*  43   84:anewarray       Class[]
	//*  44   87:dup             
	//*  45   88:iconst_0        
	//*  46   89:ldc1            #81  <Class Long>
	//*  47   91:aastore         
	//*  48   92:invokevirtual   #85  <Method Method Class.getMethod(String, Class[])>
	//*  49   95:astore          6
	//*  50   97:aload           6
	//*  51   99:ifnonnull       111
	//*  52  102:ldc1            #22  <String "HiDataManager">
	//*  53  104:ldc1            #104 <String "setTimestamp is null!">
	//*  54  106:invokestatic    #90  <Method void LogUtils.e(String, String)>
	//*  55  109:iconst_0        
	//*  56  110:ireturn         
	//*  57  111:aload           6
	//*  58  113:aload           4
	//*  59  115:iconst_1        
	//*  60  116:anewarray       Object[]
	//*  61  119:dup             
	//*  62  120:iconst_0        
	//*  63  121:invokestatic    #110 <Method long System.currentTimeMillis()>
	//*  64  124:invokestatic    #94  <Method Long Long.valueOf(long)>
	//*  65  127:aastore         
	//*  66  128:invokevirtual   #100 <Method Object Method.invoke(Object, Object[])>
	//*  67  131:pop             
	//*  68  132:aload           5
	//*  69  134:ldc1            #112 <String "setPackageName">
	//*  70  136:iconst_1        
	//*  71  137:anewarray       Class[]
	//*  72  140:dup             
	//*  73  141:iconst_0        
	//*  74  142:ldc1            #114 <Class String>
	//*  75  144:aastore         
	//*  76  145:invokevirtual   #85  <Method Method Class.getMethod(String, Class[])>
	//*  77  148:astore          6
	//*  78  150:aload           6
	//*  79  152:ifnonnull       164
	//*  80  155:ldc1            #22  <String "HiDataManager">
	//*  81  157:ldc1            #116 <String "setPackageName is null!">
	//*  82  159:invokestatic    #90  <Method void LogUtils.e(String, String)>
	//*  83  162:iconst_0        
	//*  84  163:ireturn         
	//*  85  164:aload           6
	//*  86  166:aload           4
	//*  87  168:iconst_1        
	//*  88  169:anewarray       Object[]
	//*  89  172:dup             
	//*  90  173:iconst_0        
	//*  91  174:ldc1            #118 <String "com.huawei.health">
	//*  92  176:aastore         
	//*  93  177:invokevirtual   #100 <Method Object Method.invoke(Object, Object[])>
	//*  94  180:pop             
	//*  95  181:aload           5
	//*  96  183:ldc1            #120 <String "setJsonData">
	//*  97  185:iconst_1        
	//*  98  186:anewarray       Class[]
	//*  99  189:dup             
	//* 100  190:iconst_0        
	//* 101  191:ldc1            #114 <Class String>
	//* 102  193:aastore         
	//* 103  194:invokevirtual   #85  <Method Method Class.getMethod(String, Class[])>
	//* 104  197:astore          5
	//* 105  199:aload           5
	//* 106  201:ifnonnull       213
	//* 107  204:ldc1            #22  <String "HiDataManager">
	//* 108  206:ldc1            #122 <String "setJsonData is null!">
	//* 109  208:invokestatic    #90  <Method void LogUtils.e(String, String)>
	//* 110  211:iconst_0        
	//* 111  212:ireturn         
	//* 112  213:aload           5
	//* 113  215:aload           4
	//* 114  217:iconst_1        
	//* 115  218:anewarray       Object[]
	//* 116  221:dup             
	//* 117  222:iconst_0        
	//* 118  223:aload_3         
	//* 119  224:aastore         
	//* 120  225:invokevirtual   #100 <Method Object Method.invoke(Object, Object[])>
	//* 121  228:pop             
	//* 122  229:goto            259
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 123  232:astore_3        
		{
			LogUtils.w("HiDataManager", (new StringBuilder()).append("insertDataToRawTable fail!").append(((Object) (s))).toString());
	//  124  233:ldc1            #22  <String "HiDataManager">
	//  125  235:new             #124 <Class StringBuilder>
	//  126  238:dup             
	//  127  239:invokespecial   #125 <Method void StringBuilder()>
	//  128  242:ldc1            #127 <String "insertDataToRawTable fail!">
	//  129  244:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  130  247:aload_3         
	//  131  248:invokevirtual   #134 <Method StringBuilder StringBuilder.append(Object)>
	//  132  251:invokevirtual   #138 <Method String StringBuilder.toString()>
	//  133  254:invokestatic    #55  <Method void LogUtils.w(String, String)>
			return false;
	//  134  257:iconst_0        
	//  135  258:ireturn         
		}
		if(method != null)
			break MISSING_BLOCK_LABEL_60;
		LogUtils.e("HiDataManager", "setDataSerialNumber is null!");
		return false;
		method.invoke(obj, new Object[] {
			Long.valueOf(l)
		});
		method = ((Class) (obj1)).getMethod("setTimestamp", new Class[] {
			java/lang/Long
		});
		if(method != null)
			break MISSING_BLOCK_LABEL_111;
		LogUtils.e("HiDataManager", "setTimestamp is null!");
		return false;
		method.invoke(obj, new Object[] {
			Long.valueOf(System.currentTimeMillis())
		});
		method = ((Class) (obj1)).getMethod("setPackageName", new Class[] {
			java/lang/String
		});
		if(method != null)
			break MISSING_BLOCK_LABEL_164;
		LogUtils.e("HiDataManager", "setPackageName is null!");
		return false;
		method.invoke(obj, new Object[] {
			"com.huawei.health"
		});
		obj1 = ((Object) (((Class) (obj1)).getMethod("setJsonData", new Class[] {
			java/lang/String
		})));
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_213;
		LogUtils.e("HiDataManager", "setJsonData is null!");
		return false;
		((Method) (obj1)).invoke(obj, new Object[] {
			s
		});
		return mNBDataSourceManager.insert("RawAppDataOrigin", obj) != -1L;
	//  136  259:aload_0         
	//  137  260:getfield        #57  <Field NBDataSourceManager mNBDataSourceManager>
	//  138  263:ldc1            #140 <String "RawAppDataOrigin">
	//  139  265:aload           4
	//  140  267:invokevirtual   #144 <Method long NBDataSourceManager.insert(String, Object)>
	//  141  270:ldc2w           #145 <Long -1L>
	//  142  273:lcmp            
	//  143  274:ifeq            279
	//  144  277:iconst_1        
	//  145  278:ireturn         
	//  146  279:iconst_0        
	//  147  280:ireturn         
	}

	private boolean isParamsLegal(long l, String s)
	{
		JSONObject jsonobject;
		try
		{
			jsonobject = new JSONObject(s);
	//    0    0:new             #151 <Class JSONObject>
	//    1    3:dup             
	//    2    4:aload_3         
	//    3    5:invokespecial   #154 <Method void JSONObject(String)>
	//    4    8:astore          5
		}
	//*   5   10:goto            23
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   6   13:astore_3        
		{
			LogUtils.e("HiDataManager", "isParamsLegal: JSONException");
	//    7   14:ldc1            #22  <String "HiDataManager">
	//    8   16:ldc1            #156 <String "isParamsLegal: JSONException">
	//    9   18:invokestatic    #90  <Method void LogUtils.e(String, String)>
			return false;
	//   10   21:iconst_0        
	//   11   22:ireturn         
		}
		s = null;
	//   12   23:aconst_null     
	//   13   24:astore_3        
		if(1000L == l)
	//*  14   25:ldc2w           #157 <Long 1000L>
	//*  15   28:lload_1         
	//*  16   29:lcmp            
	//*  17   30:ifne            40
			s = ((String) (com.huawei.hidatamanager.util.Const.HealthMustParams.PAIRED_DEVICE));
	//   18   33:getstatic       #164 <Field String[] com.huawei.hidatamanager.util.Const$HealthMustParams.PAIRED_DEVICE>
	//   19   36:astore_3        
		else
	//*  20   37:goto            67
		if(1001L == l)
	//*  21   40:ldc2w           #165 <Long 1001L>
	//*  22   43:lload_1         
	//*  23   44:lcmp            
	//*  24   45:ifne            55
			s = ((String) (com.huawei.hidatamanager.util.Const.HealthMustParams.EVENT_RECORD));
	//   25   48:getstatic       #169 <Field String[] com.huawei.hidatamanager.util.Const$HealthMustParams.EVENT_RECORD>
	//   26   51:astore_3        
		else
	//*  27   52:goto            67
		if(1002L == l)
	//*  28   55:ldc2w           #170 <Long 1002L>
	//*  29   58:lload_1         
	//*  30   59:lcmp            
	//*  31   60:ifne            67
			s = ((String) (com.huawei.hidatamanager.util.Const.HealthMustParams.SLEEP_RECORD));
	//   32   63:getstatic       #174 <Field String[] com.huawei.hidatamanager.util.Const$HealthMustParams.SLEEP_RECORD>
	//   33   66:astore_3        
		if(s != null)
	//*  34   67:aload_3         
	//*  35   68:ifnull          110
		{
			for(int i = 0; i < s.length; i++)
	//*  36   71:iconst_0        
	//*  37   72:istore          4
	//*  38   74:iload           4
	//*  39   76:aload_3         
	//*  40   77:arraylength     
	//*  41   78:icmpge          110
				if(jsonobject.optString(((String) (s[i]))).trim().isEmpty())
	//*  42   81:aload           5
	//*  43   83:aload_3         
	//*  44   84:iload           4
	//*  45   86:aaload          
	//*  46   87:invokevirtual   #178 <Method String JSONObject.optString(String)>
	//*  47   90:invokevirtual   #181 <Method String String.trim()>
	//*  48   93:invokevirtual   #185 <Method boolean String.isEmpty()>
	//*  49   96:ifeq            101
					return false;
	//   50   99:iconst_0        
	//   51  100:ireturn         

	//   52  101:iload           4
	//   53  103:iconst_1        
	//   54  104:iadd            
	//   55  105:istore          4
		}
	//*  56  107:goto            74
		return true;
	//   57  110:iconst_1        
	//   58  111:ireturn         
	}

	public void destroy()
	{
		if(mNBDataSourceManager != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field NBDataSourceManager mNBDataSourceManager>
	//*   2    4:ifnull          19
		{
			mNBDataSourceManager.disConnect();
	//    3    7:aload_0         
	//    4    8:getfield        #57  <Field NBDataSourceManager mNBDataSourceManager>
	//    5   11:invokevirtual   #189 <Method void NBDataSourceManager.disConnect()>
			mNBDataSourceManager = null;
	//    6   14:aload_0         
	//    7   15:aconst_null     
	//    8   16:putfield        #57  <Field NBDataSourceManager mNBDataSourceManager>
		}
		if(mContext != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #191 <Field Context mContext>
	//*  11   23:ifnull          36
			CaptureLocalService.getInstance(mContext).unBindService();
	//   12   26:aload_0         
	//   13   27:getfield        #191 <Field Context mContext>
	//   14   30:invokestatic    #196 <Method CaptureLocalService CaptureLocalService.getInstance(Context)>
	//   15   33:invokevirtual   #199 <Method void CaptureLocalService.unBindService()>
		mContext = null;
	//   16   36:aload_0         
	//   17   37:aconst_null     
	//   18   38:putfield        #191 <Field Context mContext>
		isInitialized = false;
	//   19   41:aload_0         
	//   20   42:iconst_0        
	//   21   43:putfield        #34  <Field boolean isInitialized>
	//   22   46:return          
	}

	public void init(Context context)
	{
		mContext = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #191 <Field Context mContext>
		if(!NBValidated.isOdmfInstalled(mContext))
	//*   3    5:aload_0         
	//*   4    6:getfield        #191 <Field Context mContext>
	//*   5    9:invokestatic    #207 <Method boolean NBValidated.isOdmfInstalled(Context)>
	//*   6   12:ifne            23
		{
			LogUtils.e("HiDataManager", "odmf is not installed, init fail!");
	//    7   15:ldc1            #22  <String "HiDataManager">
	//    8   17:ldc1            #209 <String "odmf is not installed, init fail!">
	//    9   19:invokestatic    #90  <Method void LogUtils.e(String, String)>
			return;
	//   10   22:return          
		} else
		{
			mNBDataSourceManager = new NBDataSourceManager(context);
	//   11   23:aload_0         
	//   12   24:new             #59  <Class NBDataSourceManager>
	//   13   27:dup             
	//   14   28:aload_1         
	//   15   29:invokespecial   #211 <Method void NBDataSourceManager(Context)>
	//   16   32:putfield        #57  <Field NBDataSourceManager mNBDataSourceManager>
			mNBDataSourceManager.init();
	//   17   35:aload_0         
	//   18   36:getfield        #57  <Field NBDataSourceManager mNBDataSourceManager>
	//   19   39:invokevirtual   #213 <Method void NBDataSourceManager.init()>
			CaptureLocalService.getInstance(mContext).bindService();
	//   20   42:aload_0         
	//   21   43:getfield        #191 <Field Context mContext>
	//   22   46:invokestatic    #196 <Method CaptureLocalService CaptureLocalService.getInstance(Context)>
	//   23   49:invokevirtual   #216 <Method boolean CaptureLocalService.bindService()>
	//   24   52:pop             
			isInitialized = true;
	//   25   53:aload_0         
	//   26   54:iconst_1        
	//   27   55:putfield        #34  <Field boolean isInitialized>
			return;
	//   28   58:return          
		}
	}

	public int inputSourceData(long l, String s)
	{
		if(!isInitialized)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean isInitialized>
	//*   2    4:ifne            16
		{
			LogUtils.e("HiDataManager", "HiDataManager hasn't been initialized!");
	//    3    7:ldc1            #22  <String "HiDataManager">
	//    4    9:ldc1            #220 <String "HiDataManager hasn't been initialized!">
	//    5   11:invokestatic    #90  <Method void LogUtils.e(String, String)>
			return 0;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		}
		if(!SwitchManager.getModuleSwitchStatus(mContext))
	//*   8   16:aload_0         
	//*   9   17:getfield        #191 <Field Context mContext>
	//*  10   20:invokestatic    #225 <Method boolean SwitchManager.getModuleSwitchStatus(Context)>
	//*  11   23:ifne            35
		{
			LogUtils.w("HiDataManager", "main switch or current module switch is off");
	//   12   26:ldc1            #22  <String "HiDataManager">
	//   13   28:ldc1            #227 <String "main switch or current module switch is off">
	//   14   30:invokestatic    #55  <Method void LogUtils.w(String, String)>
			return 0;
	//   15   33:iconst_0        
	//   16   34:ireturn         
		}
		int i = 0;
	//   17   35:iconst_0        
	//   18   36:istore          4
		if(!Const.RAW_DATATYPE_LIST.contains(((Object) (Long.valueOf(l)))))
	//*  19   38:getstatic       #233 <Field List Const.RAW_DATATYPE_LIST>
	//*  20   41:lload_1         
	//*  21   42:invokestatic    #94  <Method Long Long.valueOf(long)>
	//*  22   45:invokeinterface #239 <Method boolean List.contains(Object)>
	//*  23   50:ifne            79
		{
			LogUtils.w("HiDataManager", (new StringBuilder()).append("illegal sourceDataType: ").append(l).toString());
	//   24   53:ldc1            #22  <String "HiDataManager">
	//   25   55:new             #124 <Class StringBuilder>
	//   26   58:dup             
	//   27   59:invokespecial   #125 <Method void StringBuilder()>
	//   28   62:ldc1            #241 <String "illegal sourceDataType: ">
	//   29   64:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   30   67:lload_1         
	//   31   68:invokevirtual   #244 <Method StringBuilder StringBuilder.append(long)>
	//   32   71:invokevirtual   #138 <Method String StringBuilder.toString()>
	//   33   74:invokestatic    #55  <Method void LogUtils.w(String, String)>
			return 0;
	//   34   77:iconst_0        
	//   35   78:ireturn         
		}
		if(TextUtils.isEmpty(((CharSequence) (s))) || 1024 < s.length())
	//*  36   79:aload_3         
	//*  37   80:invokestatic    #249 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  38   83:ifne            96
	//*  39   86:sipush          1024
	//*  40   89:aload_3         
	//*  41   90:invokevirtual   #253 <Method int String.length()>
	//*  42   93:icmpge          105
		{
			LogUtils.w("HiDataManager", "jsonData is error!");
	//   43   96:ldc1            #22  <String "HiDataManager">
	//   44   98:ldc1            #255 <String "jsonData is error!">
	//   45  100:invokestatic    #55  <Method void LogUtils.w(String, String)>
			return -1;
	//   46  103:iconst_m1       
	//   47  104:ireturn         
		}
		if(!isParamsLegal(l, s))
	//*  48  105:aload_0         
	//*  49  106:lload_1         
	//*  50  107:aload_3         
	//*  51  108:invokespecial   #257 <Method boolean isParamsLegal(long, String)>
	//*  52  111:ifne            124
		{
			LogUtils.w("HiDataManager", "The parameter is illegal!");
	//   53  114:ldc1            #22  <String "HiDataManager">
	//   54  116:ldc2            #259 <String "The parameter is illegal!">
	//   55  119:invokestatic    #55  <Method void LogUtils.w(String, String)>
			return -1;
	//   56  122:iconst_m1       
	//   57  123:ireturn         
		}
		if(insertDataToRawTable(l, s))
	//*  58  124:aload_0         
	//*  59  125:lload_1         
	//*  60  126:aload_3         
	//*  61  127:invokespecial   #261 <Method boolean insertDataToRawTable(long, String)>
	//*  62  130:ifeq            136
			i = 1;
	//   63  133:iconst_1        
	//   64  134:istore          4
		return i;
	//   65  136:iload           4
	//   66  138:ireturn         
	}

	public int subscribeFeatureData(long l, ComponentName componentname, String s)
	{
		if(!isInitialized)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean isInitialized>
	//*   2    4:ifne            16
		{
			LogUtils.e("HiDataManager", "HiDataManager hasn't been initialized!");
	//    3    7:ldc1            #22  <String "HiDataManager">
	//    4    9:ldc1            #220 <String "HiDataManager hasn't been initialized!">
	//    5   11:invokestatic    #90  <Method void LogUtils.e(String, String)>
			return 0;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		} else
		{
			return CaptureLocalService.getInstance(mContext).subscribeFeatureData(l, componentname, s);
	//    8   16:aload_0         
	//    9   17:getfield        #191 <Field Context mContext>
	//   10   20:invokestatic    #196 <Method CaptureLocalService CaptureLocalService.getInstance(Context)>
	//   11   23:lload_1         
	//   12   24:aload_3         
	//   13   25:aload           4
	//   14   27:invokevirtual   #265 <Method int CaptureLocalService.subscribeFeatureData(long, ComponentName, String)>
	//   15   30:ireturn         
		}
	}

	public int unSubscribeFeatureData(long l, ComponentName componentname)
	{
		if(!isInitialized)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean isInitialized>
	//*   2    4:ifne            16
		{
			LogUtils.e("HiDataManager", "HiDataManager hasn't been initialized!");
	//    3    7:ldc1            #22  <String "HiDataManager">
	//    4    9:ldc1            #220 <String "HiDataManager hasn't been initialized!">
	//    5   11:invokestatic    #90  <Method void LogUtils.e(String, String)>
			return 0;
	//    6   14:iconst_0        
	//    7   15:ireturn         
		} else
		{
			return CaptureLocalService.getInstance(mContext).unSubscribeFeatureData(l, componentname);
	//    8   16:aload_0         
	//    9   17:getfield        #191 <Field Context mContext>
	//   10   20:invokestatic    #196 <Method CaptureLocalService CaptureLocalService.getInstance(Context)>
	//   11   23:lload_1         
	//   12   24:aload_3         
	//   13   25:invokevirtual   #269 <Method int CaptureLocalService.unSubscribeFeatureData(long, ComponentName)>
	//   14   28:ireturn         
		}
	}

	private static final int MAX_LENGTH_NUM = 1024;
	private static final int RET_ERR_PARAMS = -1;
	private static final int RET_FAIL = 0;
	private static final int RET_OK = 1;
	private static final String TAG = "HiDataManager";
	boolean isInitialized;
	private Context mContext;
	private NBDataSourceManager mNBDataSourceManager;
}
