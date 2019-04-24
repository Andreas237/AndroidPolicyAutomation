// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.huawei.hidatamanager.HiDataManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package o:
//			dho, dbf

public class dnn
{

	public dnn()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #94  <Method void Object()>
	//    2    4:return          
	}

	public static void a(Context context, String s)
	{
		dho.b("HiH_PengineUserLabelMgr", new Object[] {
			"saveBindingDeviceToODMF enter"
		});
	//    0    0:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #100 <String "saveBindingDeviceToODMF enter">
	//    6   10:aastore         
	//    7   11:invokestatic    #106 <Method void dho.b(String, Object[])>
		if(dbf.o())
	//*   8   14:invokestatic    #112 <Method boolean dbf.o()>
	//*   9   17:ifeq            43
		{
			dho.b("HiH_PengineUserLabelMgr", new Object[] {
				"CommonUtil.isEMUI_9_0() = true,  Version = ", dbf.a()
			});
	//   10   20:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   11   22:iconst_2        
	//   12   23:anewarray       Object[]
	//   13   26:dup             
	//   14   27:iconst_0        
	//   15   28:ldc1            #114 <String "CommonUtil.isEMUI_9_0() = true,  Version = ">
	//   16   30:aastore         
	//   17   31:dup             
	//   18   32:iconst_1        
	//   19   33:invokestatic    #117 <Method String dbf.a()>
	//   20   36:aastore         
	//   21   37:invokestatic    #106 <Method void dho.b(String, Object[])>
		} else
	//*  22   40:goto            64
		{
			dho.b("HiH_PengineUserLabelMgr", new Object[] {
				"CommonUtil.isEMUI_9_0() = false,   Version = ", dbf.a()
			});
	//   23   43:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   24   45:iconst_2        
	//   25   46:anewarray       Object[]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:ldc1            #119 <String "CommonUtil.isEMUI_9_0() = false,   Version = ">
	//   29   53:aastore         
	//   30   54:dup             
	//   31   55:iconst_1        
	//   32   56:invokestatic    #117 <Method String dbf.a()>
	//   33   59:aastore         
	//   34   60:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   35   63:return          
		}
		if(s == null)
	//*  36   64:aload_1         
	//*  37   65:ifnonnull       83
		{
			dho.b("HiH_PengineUserLabelMgr", new Object[] {
				"saveBindingDeviceToODMF JsonData = null"
			});
	//   38   68:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   39   70:iconst_1        
	//   40   71:anewarray       Object[]
	//   41   74:dup             
	//   42   75:iconst_0        
	//   43   76:ldc1            #121 <String "saveBindingDeviceToODMF JsonData = null">
	//   44   78:aastore         
	//   45   79:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   46   82:return          
		}
		int i = d.inputSourceData(1000L, s);
	//   47   83:getstatic       #90  <Field HiDataManager d>
	//   48   86:ldc2w           #122 <Long 1000L>
	//   49   89:aload_1         
	//   50   90:invokevirtual   #127 <Method int HiDataManager.inputSourceData(long, String)>
	//   51   93:istore_2        
		if(1 == i)
	//*  52   94:iconst_1        
	//*  53   95:iload_2         
	//*  54   96:icmpne          114
		{
			dho.b("HiH_PengineUserLabelMgr", new Object[] {
				"saveBindingDeviceToODMF, success "
			});
	//   55   99:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   56  101:iconst_1        
	//   57  102:anewarray       Object[]
	//   58  105:dup             
	//   59  106:iconst_0        
	//   60  107:ldc1            #129 <String "saveBindingDeviceToODMF, success ">
	//   61  109:aastore         
	//   62  110:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   63  113:return          
		} else
		{
			dho.b("HiH_PengineUserLabelMgr", new Object[] {
				"saveBindingDeviceToODMF, failed, result = ", Integer.valueOf(i)
			});
	//   64  114:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   65  116:iconst_2        
	//   66  117:anewarray       Object[]
	//   67  120:dup             
	//   68  121:iconst_0        
	//   69  122:ldc1            #131 <String "saveBindingDeviceToODMF, failed, result = ">
	//   70  124:aastore         
	//   71  125:dup             
	//   72  126:iconst_1        
	//   73  127:iload_2         
	//   74  128:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   75  131:aastore         
	//   76  132:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   77  135:return          
		}
	}

	public static void b(Context context, String s)
	{
		dho.b("HiH_PengineUserLabelMgr", new Object[] {
			"saveTrackDataToODMF enter"
		});
	//    0    0:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #139 <String "saveTrackDataToODMF enter">
	//    6   10:aastore         
	//    7   11:invokestatic    #106 <Method void dho.b(String, Object[])>
		if(dbf.o())
	//*   8   14:invokestatic    #112 <Method boolean dbf.o()>
	//*   9   17:ifeq            43
		{
			dho.b("HiH_PengineUserLabelMgr", new Object[] {
				"CommonUtil.isEMUI_9_0() = true,  Version = ", dbf.a()
			});
	//   10   20:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   11   22:iconst_2        
	//   12   23:anewarray       Object[]
	//   13   26:dup             
	//   14   27:iconst_0        
	//   15   28:ldc1            #114 <String "CommonUtil.isEMUI_9_0() = true,  Version = ">
	//   16   30:aastore         
	//   17   31:dup             
	//   18   32:iconst_1        
	//   19   33:invokestatic    #117 <Method String dbf.a()>
	//   20   36:aastore         
	//   21   37:invokestatic    #106 <Method void dho.b(String, Object[])>
		} else
	//*  22   40:goto            64
		{
			dho.b("HiH_PengineUserLabelMgr", new Object[] {
				"CommonUtil.isEMUI_9_0() = false,   Version = ", dbf.a()
			});
	//   23   43:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   24   45:iconst_2        
	//   25   46:anewarray       Object[]
	//   26   49:dup             
	//   27   50:iconst_0        
	//   28   51:ldc1            #119 <String "CommonUtil.isEMUI_9_0() = false,   Version = ">
	//   29   53:aastore         
	//   30   54:dup             
	//   31   55:iconst_1        
	//   32   56:invokestatic    #117 <Method String dbf.a()>
	//   33   59:aastore         
	//   34   60:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   35   63:return          
		}
		if(s == null)
	//*  36   64:aload_1         
	//*  37   65:ifnonnull       83
		{
			dho.b("HiH_PengineUserLabelMgr", new Object[] {
				"saveTrackDataToODMF JsonData = null"
			});
	//   38   68:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   39   70:iconst_1        
	//   40   71:anewarray       Object[]
	//   41   74:dup             
	//   42   75:iconst_0        
	//   43   76:ldc1            #141 <String "saveTrackDataToODMF JsonData = null">
	//   44   78:aastore         
	//   45   79:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   46   82:return          
		}
		int i = d.inputSourceData(1001L, s);
	//   47   83:getstatic       #90  <Field HiDataManager d>
	//   48   86:ldc2w           #142 <Long 1001L>
	//   49   89:aload_1         
	//   50   90:invokevirtual   #127 <Method int HiDataManager.inputSourceData(long, String)>
	//   51   93:istore_2        
		if(1 == i)
	//*  52   94:iconst_1        
	//*  53   95:iload_2         
	//*  54   96:icmpne          114
		{
			dho.b("HiH_PengineUserLabelMgr", new Object[] {
				"saveTrackDataToODMF, success "
			});
	//   55   99:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   56  101:iconst_1        
	//   57  102:anewarray       Object[]
	//   58  105:dup             
	//   59  106:iconst_0        
	//   60  107:ldc1            #145 <String "saveTrackDataToODMF, success ">
	//   61  109:aastore         
	//   62  110:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   63  113:return          
		} else
		{
			dho.b("HiH_PengineUserLabelMgr", new Object[] {
				"saveTrackDataToODMF, failed, result = ", Integer.valueOf(i)
			});
	//   64  114:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   65  116:iconst_2        
	//   66  117:anewarray       Object[]
	//   67  120:dup             
	//   68  121:iconst_0        
	//   69  122:ldc1            #147 <String "saveTrackDataToODMF, failed, result = ">
	//   70  124:aastore         
	//   71  125:dup             
	//   72  126:iconst_1        
	//   73  127:iload_2         
	//   74  128:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   75  131:aastore         
	//   76  132:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   77  135:return          
		}
	}

	public static void c(Context context, String s)
	{
		dho.b("HiH_PengineUserLabelMgr", new Object[] {
			"UploadSportEvent enter"
		});
	//    0    0:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #152 <String "UploadSportEvent enter">
	//    6   10:aastore         
	//    7   11:invokestatic    #106 <Method void dho.b(String, Object[])>
		s = ((String) (new JSONArray()));
	//    8   14:new             #154 <Class JSONArray>
	//    9   17:dup             
	//   10   18:invokespecial   #155 <Method void JSONArray()>
	//   11   21:astore_1        
		((JSONArray) (s)).put("121.525");
	//   12   22:aload_1         
	//   13   23:ldc1            #157 <String "121.525">
	//   14   25:invokevirtual   #161 <Method JSONArray JSONArray.put(Object)>
	//   15   28:pop             
		((JSONArray) (s)).put("25.0392");
	//   16   29:aload_1         
	//   17   30:ldc1            #163 <String "25.0392">
	//   18   32:invokevirtual   #161 <Method JSONArray JSONArray.put(Object)>
	//   19   35:pop             
		JSONArray jsonarray = new JSONArray();
	//   20   36:new             #154 <Class JSONArray>
	//   21   39:dup             
	//   22   40:invokespecial   #155 <Method void JSONArray()>
	//   23   43:astore_2        
		jsonarray.put(10);
	//   24   44:aload_2         
	//   25   45:bipush          10
	//   26   47:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   27   50:pop             
		jsonarray.put(20);
	//   28   51:aload_2         
	//   29   52:bipush          20
	//   30   54:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   31   57:pop             
		jsonarray.put(10);
	//   32   58:aload_2         
	//   33   59:bipush          10
	//   34   61:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   35   64:pop             
		jsonarray.put(10);
	//   36   65:aload_2         
	//   37   66:bipush          10
	//   38   68:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   39   71:pop             
		jsonarray.put(20);
	//   40   72:aload_2         
	//   41   73:bipush          20
	//   42   75:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   43   78:pop             
		jsonarray.put(30);
	//   44   79:aload_2         
	//   45   80:bipush          30
	//   46   82:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   47   85:pop             
		JSONArray jsonarray1 = new JSONArray();
	//   48   86:new             #154 <Class JSONArray>
	//   49   89:dup             
	//   50   90:invokespecial   #155 <Method void JSONArray()>
	//   51   93:astore_3        
		jsonarray1.put(3);
	//   52   94:aload_3         
	//   53   95:iconst_3        
	//   54   96:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   55   99:pop             
		jsonarray1.put(4);
	//   56  100:aload_3         
	//   57  101:iconst_4        
	//   58  102:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   59  105:pop             
		jsonarray1.put(3);
	//   60  106:aload_3         
	//   61  107:iconst_3        
	//   62  108:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   63  111:pop             
		jsonarray1.put(4);
	//   64  112:aload_3         
	//   65  113:iconst_4        
	//   66  114:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   67  117:pop             
		jsonarray1.put(5);
	//   68  118:aload_3         
	//   69  119:iconst_5        
	//   70  120:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   71  123:pop             
		jsonarray1.put(6);
	//   72  124:aload_3         
	//   73  125:bipush          6
	//   74  127:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   75  130:pop             
		context = ((Context) (new JSONObject()));
	//   76  131:new             #168 <Class JSONObject>
	//   77  134:dup             
	//   78  135:invokespecial   #169 <Method void JSONObject()>
	//   79  138:astore_0        
		try
		{
			((JSONObject) (context)).put("SportType", 257);
	//   80  139:aload_0         
	//   81  140:ldc1            #171 <String "SportType">
	//   82  142:sipush          257
	//   83  145:invokevirtual   #174 <Method JSONObject JSONObject.put(String, int)>
	//   84  148:pop             
			((JSONObject) (context)).put("SportStartTime", "2018-10-10 10:10:10");
	//   85  149:aload_0         
	//   86  150:ldc1            #176 <String "SportStartTime">
	//   87  152:ldc1            #178 <String "2018-10-10 10:10:10">
	//   88  154:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//   89  157:pop             
			((JSONObject) (context)).put("DeviceID", "xxxxxx");
	//   90  158:aload_0         
	//   91  159:ldc1            #183 <String "DeviceID">
	//   92  161:ldc1            #185 <String "xxxxxx">
	//   93  163:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//   94  166:pop             
			((JSONObject) (context)).put("SportStartGPS", ((Object) (s)));
	//   95  167:aload_0         
	//   96  168:ldc1            #187 <String "SportStartGPS">
	//   97  170:aload_1         
	//   98  171:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//   99  174:pop             
			((JSONObject) (context)).put("SportDuration", 3600);
	//  100  175:aload_0         
	//  101  176:ldc1            #189 <String "SportDuration">
	//  102  178:sipush          3600
	//  103  181:invokevirtual   #174 <Method JSONObject JSONObject.put(String, int)>
	//  104  184:pop             
			((JSONObject) (context)).put("HeartDistribution", ((Object) (jsonarray)));
	//  105  185:aload_0         
	//  106  186:ldc1            #191 <String "HeartDistribution">
	//  107  188:aload_2         
	//  108  189:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  109  192:pop             
			((JSONObject) (context)).put("SportSpeedDistribution", ((Object) (jsonarray1)));
	//  110  193:aload_0         
	//  111  194:ldc1            #193 <String "SportSpeedDistribution">
	//  112  196:aload_3         
	//  113  197:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  114  200:pop             
			((JSONObject) (context)).put("HeatQuantity", 1200);
	//  115  201:aload_0         
	//  116  202:ldc1            #195 <String "HeatQuantity">
	//  117  204:sipush          1200
	//  118  207:invokevirtual   #174 <Method JSONObject JSONObject.put(String, int)>
	//  119  210:pop             
			dho.b("UploadSportEvent, jsonObject_257 = ", new Object[] {
				((JSONObject) (context)).toString()
			});
	//  120  211:ldc1            #197 <String "UploadSportEvent, jsonObject_257 = ">
	//  121  213:iconst_1        
	//  122  214:anewarray       Object[]
	//  123  217:dup             
	//  124  218:iconst_0        
	//  125  219:aload_0         
	//  126  220:invokevirtual   #200 <Method String JSONObject.toString()>
	//  127  223:aastore         
	//  128  224:invokestatic    #106 <Method void dho.b(String, Object[])>
		}
	//* 129  227:goto            235
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 130  230:astore_1        
		{
			((JSONException) (s)).printStackTrace();
	//  131  231:aload_1         
	//  132  232:invokevirtual   #203 <Method void JSONException.printStackTrace()>
		}
		if(1 == d.inputSourceData(1001L, ((JSONObject) (context)).toString()))
	//* 133  235:iconst_1        
	//* 134  236:getstatic       #90  <Field HiDataManager d>
	//* 135  239:ldc2w           #142 <Long 1001L>
	//* 136  242:aload_0         
	//* 137  243:invokevirtual   #200 <Method String JSONObject.toString()>
	//* 138  246:invokevirtual   #127 <Method int HiDataManager.inputSourceData(long, String)>
	//* 139  249:icmpne          264
			dho.b("UploadSportEvent sportType = 257 , success", new Object[0]);
	//  140  252:ldc1            #205 <String "UploadSportEvent sportType = 257 , success">
	//  141  254:iconst_0        
	//  142  255:anewarray       Object[]
	//  143  258:invokestatic    #106 <Method void dho.b(String, Object[])>
		else
	//* 144  261:goto            273
			dho.b("UploadSportEvent sportType = 257 , failed", new Object[0]);
	//  145  264:ldc1            #207 <String "UploadSportEvent sportType = 257 , failed">
	//  146  266:iconst_0        
	//  147  267:anewarray       Object[]
	//  148  270:invokestatic    #106 <Method void dho.b(String, Object[])>
		context = ((Context) (new JSONObject()));
	//  149  273:new             #168 <Class JSONObject>
	//  150  276:dup             
	//  151  277:invokespecial   #169 <Method void JSONObject()>
	//  152  280:astore_0        
		s = ((String) (new JSONArray()));
	//  153  281:new             #154 <Class JSONArray>
	//  154  284:dup             
	//  155  285:invokespecial   #155 <Method void JSONArray()>
	//  156  288:astore_1        
		((JSONArray) (s)).put("21.525");
	//  157  289:aload_1         
	//  158  290:ldc1            #209 <String "21.525">
	//  159  292:invokevirtual   #161 <Method JSONArray JSONArray.put(Object)>
	//  160  295:pop             
		((JSONArray) (s)).put("55.0392");
	//  161  296:aload_1         
	//  162  297:ldc1            #211 <String "55.0392">
	//  163  299:invokevirtual   #161 <Method JSONArray JSONArray.put(Object)>
	//  164  302:pop             
		jsonarray = new JSONArray();
	//  165  303:new             #154 <Class JSONArray>
	//  166  306:dup             
	//  167  307:invokespecial   #155 <Method void JSONArray()>
	//  168  310:astore_2        
		jsonarray.put(20);
	//  169  311:aload_2         
	//  170  312:bipush          20
	//  171  314:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  172  317:pop             
		jsonarray.put(10);
	//  173  318:aload_2         
	//  174  319:bipush          10
	//  175  321:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  176  324:pop             
		jsonarray.put(20);
	//  177  325:aload_2         
	//  178  326:bipush          20
	//  179  328:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  180  331:pop             
		jsonarray.put(10);
	//  181  332:aload_2         
	//  182  333:bipush          10
	//  183  335:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  184  338:pop             
		jsonarray.put(20);
	//  185  339:aload_2         
	//  186  340:bipush          20
	//  187  342:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  188  345:pop             
		jsonarray.put(20);
	//  189  346:aload_2         
	//  190  347:bipush          20
	//  191  349:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  192  352:pop             
		jsonarray1 = new JSONArray();
	//  193  353:new             #154 <Class JSONArray>
	//  194  356:dup             
	//  195  357:invokespecial   #155 <Method void JSONArray()>
	//  196  360:astore_3        
		jsonarray1.put(1);
	//  197  361:aload_3         
	//  198  362:iconst_1        
	//  199  363:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  200  366:pop             
		jsonarray1.put(2);
	//  201  367:aload_3         
	//  202  368:iconst_2        
	//  203  369:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  204  372:pop             
		jsonarray1.put(3);
	//  205  373:aload_3         
	//  206  374:iconst_3        
	//  207  375:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  208  378:pop             
		jsonarray1.put(4);
	//  209  379:aload_3         
	//  210  380:iconst_4        
	//  211  381:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  212  384:pop             
		jsonarray1.put(5);
	//  213  385:aload_3         
	//  214  386:iconst_5        
	//  215  387:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  216  390:pop             
		jsonarray1.put(6);
	//  217  391:aload_3         
	//  218  392:bipush          6
	//  219  394:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  220  397:pop             
		try
		{
			((JSONObject) (context)).put("SportType", 258);
	//  221  398:aload_0         
	//  222  399:ldc1            #171 <String "SportType">
	//  223  401:sipush          258
	//  224  404:invokevirtual   #174 <Method JSONObject JSONObject.put(String, int)>
	//  225  407:pop             
			((JSONObject) (context)).put("SportStartTime", "2018-11-11 11:11:11");
	//  226  408:aload_0         
	//  227  409:ldc1            #176 <String "SportStartTime">
	//  228  411:ldc1            #213 <String "2018-11-11 11:11:11">
	//  229  413:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  230  416:pop             
			((JSONObject) (context)).put("DeviceID", "11111111");
	//  231  417:aload_0         
	//  232  418:ldc1            #183 <String "DeviceID">
	//  233  420:ldc1            #215 <String "11111111">
	//  234  422:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  235  425:pop             
			((JSONObject) (context)).put("SportStartGPS", ((Object) (s)));
	//  236  426:aload_0         
	//  237  427:ldc1            #187 <String "SportStartGPS">
	//  238  429:aload_1         
	//  239  430:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  240  433:pop             
			((JSONObject) (context)).put("SportDuration", 600);
	//  241  434:aload_0         
	//  242  435:ldc1            #189 <String "SportDuration">
	//  243  437:sipush          600
	//  244  440:invokevirtual   #174 <Method JSONObject JSONObject.put(String, int)>
	//  245  443:pop             
			((JSONObject) (context)).put("HeartDistribution", ((Object) (jsonarray)));
	//  246  444:aload_0         
	//  247  445:ldc1            #191 <String "HeartDistribution">
	//  248  447:aload_2         
	//  249  448:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  250  451:pop             
			((JSONObject) (context)).put("SportSpeedDistribution", ((Object) (jsonarray1)));
	//  251  452:aload_0         
	//  252  453:ldc1            #193 <String "SportSpeedDistribution">
	//  253  455:aload_3         
	//  254  456:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  255  459:pop             
			((JSONObject) (context)).put("HeatQuantity", 2300);
	//  256  460:aload_0         
	//  257  461:ldc1            #195 <String "HeatQuantity">
	//  258  463:sipush          2300
	//  259  466:invokevirtual   #174 <Method JSONObject JSONObject.put(String, int)>
	//  260  469:pop             
			dho.b("UploadSportEvent, jsonObject_258 = ", new Object[] {
				((JSONObject) (context)).toString()
			});
	//  261  470:ldc1            #217 <String "UploadSportEvent, jsonObject_258 = ">
	//  262  472:iconst_1        
	//  263  473:anewarray       Object[]
	//  264  476:dup             
	//  265  477:iconst_0        
	//  266  478:aload_0         
	//  267  479:invokevirtual   #200 <Method String JSONObject.toString()>
	//  268  482:aastore         
	//  269  483:invokestatic    #106 <Method void dho.b(String, Object[])>
		}
	//* 270  486:goto            494
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 271  489:astore_1        
		{
			((JSONException) (s)).printStackTrace();
	//  272  490:aload_1         
	//  273  491:invokevirtual   #203 <Method void JSONException.printStackTrace()>
		}
		if(1 == d.inputSourceData(1001L, ((JSONObject) (context)).toString()))
	//* 274  494:iconst_1        
	//* 275  495:getstatic       #90  <Field HiDataManager d>
	//* 276  498:ldc2w           #142 <Long 1001L>
	//* 277  501:aload_0         
	//* 278  502:invokevirtual   #200 <Method String JSONObject.toString()>
	//* 279  505:invokevirtual   #127 <Method int HiDataManager.inputSourceData(long, String)>
	//* 280  508:icmpne          523
			dho.b("UploadSportEvent sportType = 258 , success", new Object[0]);
	//  281  511:ldc1            #219 <String "UploadSportEvent sportType = 258 , success">
	//  282  513:iconst_0        
	//  283  514:anewarray       Object[]
	//  284  517:invokestatic    #106 <Method void dho.b(String, Object[])>
		else
	//* 285  520:goto            532
			dho.b("UploadSportEvent sportType = 258 , failed", new Object[0]);
	//  286  523:ldc1            #221 <String "UploadSportEvent sportType = 258 , failed">
	//  287  525:iconst_0        
	//  288  526:anewarray       Object[]
	//  289  529:invokestatic    #106 <Method void dho.b(String, Object[])>
		context = ((Context) (new JSONObject()));
	//  290  532:new             #168 <Class JSONObject>
	//  291  535:dup             
	//  292  536:invokespecial   #169 <Method void JSONObject()>
	//  293  539:astore_0        
		s = ((String) (new JSONArray()));
	//  294  540:new             #154 <Class JSONArray>
	//  295  543:dup             
	//  296  544:invokespecial   #155 <Method void JSONArray()>
	//  297  547:astore_1        
		((JSONArray) (s)).put("22.123");
	//  298  548:aload_1         
	//  299  549:ldc1            #223 <String "22.123">
	//  300  551:invokevirtual   #161 <Method JSONArray JSONArray.put(Object)>
	//  301  554:pop             
		((JSONArray) (s)).put("82.0312");
	//  302  555:aload_1         
	//  303  556:ldc1            #225 <String "82.0312">
	//  304  558:invokevirtual   #161 <Method JSONArray JSONArray.put(Object)>
	//  305  561:pop             
		jsonarray = new JSONArray();
	//  306  562:new             #154 <Class JSONArray>
	//  307  565:dup             
	//  308  566:invokespecial   #155 <Method void JSONArray()>
	//  309  569:astore_2        
		jsonarray.put(30);
	//  310  570:aload_2         
	//  311  571:bipush          30
	//  312  573:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  313  576:pop             
		jsonarray.put(10);
	//  314  577:aload_2         
	//  315  578:bipush          10
	//  316  580:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  317  583:pop             
		jsonarray.put(20);
	//  318  584:aload_2         
	//  319  585:bipush          20
	//  320  587:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  321  590:pop             
		jsonarray.put(10);
	//  322  591:aload_2         
	//  323  592:bipush          10
	//  324  594:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  325  597:pop             
		jsonarray.put(10);
	//  326  598:aload_2         
	//  327  599:bipush          10
	//  328  601:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  329  604:pop             
		jsonarray.put(20);
	//  330  605:aload_2         
	//  331  606:bipush          20
	//  332  608:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//  333  611:pop             
		try
		{
			((JSONObject) (context)).put("SportType", 1001);
	//  334  612:aload_0         
	//  335  613:ldc1            #171 <String "SportType">
	//  336  615:sipush          1001
	//  337  618:invokevirtual   #174 <Method JSONObject JSONObject.put(String, int)>
	//  338  621:pop             
			((JSONObject) (context)).put("SportStartTime", "2018-12-12 12:12:12");
	//  339  622:aload_0         
	//  340  623:ldc1            #176 <String "SportStartTime">
	//  341  625:ldc1            #227 <String "2018-12-12 12:12:12">
	//  342  627:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  343  630:pop             
			((JSONObject) (context)).put("DeviceID", "22222222");
	//  344  631:aload_0         
	//  345  632:ldc1            #183 <String "DeviceID">
	//  346  634:ldc1            #229 <String "22222222">
	//  347  636:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  348  639:pop             
			((JSONObject) (context)).put("SportStartGPS", ((Object) (s)));
	//  349  640:aload_0         
	//  350  641:ldc1            #187 <String "SportStartGPS">
	//  351  643:aload_1         
	//  352  644:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  353  647:pop             
			((JSONObject) (context)).put("SportDuration", 6000);
	//  354  648:aload_0         
	//  355  649:ldc1            #189 <String "SportDuration">
	//  356  651:sipush          6000
	//  357  654:invokevirtual   #174 <Method JSONObject JSONObject.put(String, int)>
	//  358  657:pop             
			((JSONObject) (context)).put("HeartDistribution", ((Object) (jsonarray)));
	//  359  658:aload_0         
	//  360  659:ldc1            #191 <String "HeartDistribution">
	//  361  661:aload_2         
	//  362  662:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  363  665:pop             
			((JSONObject) (context)).put("SportSpeedDistribution", ((Object) (null)));
	//  364  666:aload_0         
	//  365  667:ldc1            #193 <String "SportSpeedDistribution">
	//  366  669:aconst_null     
	//  367  670:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//  368  673:pop             
			((JSONObject) (context)).put("HeatQuantity", 3300);
	//  369  674:aload_0         
	//  370  675:ldc1            #195 <String "HeatQuantity">
	//  371  677:sipush          3300
	//  372  680:invokevirtual   #174 <Method JSONObject JSONObject.put(String, int)>
	//  373  683:pop             
			dho.b("UploadSportEvent, jsonObject_1001 = ", new Object[] {
				((JSONObject) (context)).toString()
			});
	//  374  684:ldc1            #231 <String "UploadSportEvent, jsonObject_1001 = ">
	//  375  686:iconst_1        
	//  376  687:anewarray       Object[]
	//  377  690:dup             
	//  378  691:iconst_0        
	//  379  692:aload_0         
	//  380  693:invokevirtual   #200 <Method String JSONObject.toString()>
	//  381  696:aastore         
	//  382  697:invokestatic    #106 <Method void dho.b(String, Object[])>
		}
	//* 383  700:goto            708
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 384  703:astore_1        
		{
			((JSONException) (s)).printStackTrace();
	//  385  704:aload_1         
	//  386  705:invokevirtual   #203 <Method void JSONException.printStackTrace()>
		}
		if(1 == d.inputSourceData(1001L, ((JSONObject) (context)).toString()))
	//* 387  708:iconst_1        
	//* 388  709:getstatic       #90  <Field HiDataManager d>
	//* 389  712:ldc2w           #142 <Long 1001L>
	//* 390  715:aload_0         
	//* 391  716:invokevirtual   #200 <Method String JSONObject.toString()>
	//* 392  719:invokevirtual   #127 <Method int HiDataManager.inputSourceData(long, String)>
	//* 393  722:icmpne          735
		{
			dho.b("UploadSportEvent sportType = 1001 , success", new Object[0]);
	//  394  725:ldc1            #233 <String "UploadSportEvent sportType = 1001 , success">
	//  395  727:iconst_0        
	//  396  728:anewarray       Object[]
	//  397  731:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//  398  734:return          
		} else
		{
			dho.b("UploadSportEvent sportType = 1001 , failed", new Object[0]);
	//  399  735:ldc1            #235 <String "UploadSportEvent sportType = 1001 , failed">
	//  400  737:iconst_0        
	//  401  738:anewarray       Object[]
	//  402  741:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//  403  744:return          
		}
	}

	public static void d(Context context, String s)
	{
		dho.b("HiH_PengineUserLabelMgr", new Object[] {
			"UploadSleepData enter"
		});
	//    0    0:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc1            #237 <String "UploadSleepData enter">
	//    6   10:aastore         
	//    7   11:invokestatic    #106 <Method void dho.b(String, Object[])>
		context = ((Context) (new JSONObject()));
	//    8   14:new             #168 <Class JSONObject>
	//    9   17:dup             
	//   10   18:invokespecial   #169 <Method void JSONObject()>
	//   11   21:astore_0        
		s = ((String) (new JSONArray()));
	//   12   22:new             #154 <Class JSONArray>
	//   13   25:dup             
	//   14   26:invokespecial   #155 <Method void JSONArray()>
	//   15   29:astore_1        
		((JSONArray) (s)).put(5);
	//   16   30:aload_1         
	//   17   31:iconst_5        
	//   18   32:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   19   35:pop             
		((JSONArray) (s)).put(45);
	//   20   36:aload_1         
	//   21   37:bipush          45
	//   22   39:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   23   42:pop             
		((JSONArray) (s)).put(50);
	//   24   43:aload_1         
	//   25   44:bipush          50
	//   26   46:invokevirtual   #166 <Method JSONArray JSONArray.put(int)>
	//   27   49:pop             
		try
		{
			((JSONObject) (context)).put("SleepStartTime", "2018-11-19 23:52:18");
	//   28   50:aload_0         
	//   29   51:ldc1            #239 <String "SleepStartTime">
	//   30   53:ldc1            #241 <String "2018-11-19 23:52:18">
	//   31   55:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//   32   58:pop             
			((JSONObject) (context)).put("SleepEndTime", "2018-11-20 08:05:18");
	//   33   59:aload_0         
	//   34   60:ldc1            #243 <String "SleepEndTime">
	//   35   62:ldc1            #245 <String "2018-11-20 08:05:18">
	//   36   64:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//   37   67:pop             
			((JSONObject) (context)).put("SleepQualityDistribution", ((Object) (s)));
	//   38   68:aload_0         
	//   39   69:ldc1            #247 <String "SleepQualityDistribution">
	//   40   71:aload_1         
	//   41   72:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//   42   75:pop             
			dho.b("UploadSleepData, jsonObject = ", new Object[] {
				((JSONObject) (context)).toString()
			});
	//   43   76:ldc1            #249 <String "UploadSleepData, jsonObject = ">
	//   44   78:iconst_1        
	//   45   79:anewarray       Object[]
	//   46   82:dup             
	//   47   83:iconst_0        
	//   48   84:aload_0         
	//   49   85:invokevirtual   #200 <Method String JSONObject.toString()>
	//   50   88:aastore         
	//   51   89:invokestatic    #106 <Method void dho.b(String, Object[])>
		}
	//*  52   92:goto            100
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  53   95:astore_1        
		{
			((JSONException) (s)).printStackTrace();
	//   54   96:aload_1         
	//   55   97:invokevirtual   #203 <Method void JSONException.printStackTrace()>
		}
		if(1 == d.inputSourceData(1002L, ((JSONObject) (context)).toString()))
	//*  56  100:iconst_1        
	//*  57  101:getstatic       #90  <Field HiDataManager d>
	//*  58  104:ldc2w           #250 <Long 1002L>
	//*  59  107:aload_0         
	//*  60  108:invokevirtual   #200 <Method String JSONObject.toString()>
	//*  61  111:invokevirtual   #127 <Method int HiDataManager.inputSourceData(long, String)>
	//*  62  114:icmpne          127
		{
			dho.b("UploadSleepData , success", new Object[0]);
	//   63  117:ldc1            #253 <String "UploadSleepData , success">
	//   64  119:iconst_0        
	//   65  120:anewarray       Object[]
	//   66  123:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   67  126:return          
		} else
		{
			dho.b("UploadSleepData , failed", new Object[0]);
	//   68  127:ldc1            #255 <String "UploadSleepData , failed">
	//   69  129:iconst_0        
	//   70  130:anewarray       Object[]
	//   71  133:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   72  136:return          
		}
	}

	public static void e(Context context)
	{
		dho.b("HiH_PengineUserLabelMgr", new Object[] {
			"getAllLabel enter"
		});
	//    0    0:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #258 <String "getAllLabel enter">
	//    6   11:aastore         
	//    7   12:invokestatic    #106 <Method void dho.b(String, Object[])>
		ContentResolver contentresolver = context.getContentResolver();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #264 <Method ContentResolver Context.getContentResolver()>
	//   10   19:astore_2        
		dho.b("HiH_PengineUserLabelMgr", new Object[] {
			"getAllLabel , uriset.length = ", Integer.valueOf(e.length)
		});
	//   11   20:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   12   22:iconst_2        
	//   13   23:anewarray       Object[]
	//   14   26:dup             
	//   15   27:iconst_0        
	//   16   28:ldc2            #266 <String "getAllLabel , uriset.length = ">
	//   17   31:aastore         
	//   18   32:dup             
	//   19   33:iconst_1        
	//   20   34:getstatic       #82  <Field String[] e>
	//   21   37:arraylength     
	//   22   38:invokestatic    #137 <Method Integer Integer.valueOf(int)>
	//   23   41:aastore         
	//   24   42:invokestatic    #106 <Method void dho.b(String, Object[])>
		context = null;
	//   25   45:aconst_null     
	//   26   46:astore_0        
label0:
		for(int i = 0; i < e.length; i++)
	//*  27   47:iconst_0        
	//*  28   48:istore_1        
	//*  29   49:iload_1         
	//*  30   50:getstatic       #82  <Field String[] e>
	//*  31   53:arraylength     
	//*  32   54:icmpge          196
		{
			Object obj = ((Object) (Uri.parse(e[i])));
	//   33   57:getstatic       #82  <Field String[] e>
	//   34   60:iload_1         
	//   35   61:aaload          
	//   36   62:invokestatic    #272 <Method Uri Uri.parse(String)>
	//   37   65:astore_3        
			context = ((Context) (contentresolver.query(((Uri) (obj)), ((String []) (null)), ((String) (null)), ((String []) (null)), ((String) (null)))));
	//   38   66:aload_2         
	//   39   67:aload_3         
	//   40   68:aconst_null     
	//   41   69:aconst_null     
	//   42   70:aconst_null     
	//   43   71:aconst_null     
	//   44   72:invokevirtual   #278 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//   45   75:astore_0        
			if(context != null)
	//*  46   76:aload_0         
	//*  47   77:ifnull          164
			{
				dho.b("HiH_PengineUserLabelMgr", new Object[] {
					"getAllLabel , cursor = ", context
				});
	//   48   80:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   49   82:iconst_2        
	//   50   83:anewarray       Object[]
	//   51   86:dup             
	//   52   87:iconst_0        
	//   53   88:ldc2            #280 <String "getAllLabel , cursor = ">
	//   54   91:aastore         
	//   55   92:dup             
	//   56   93:iconst_1        
	//   57   94:aload_0         
	//   58   95:aastore         
	//   59   96:invokestatic    #106 <Method void dho.b(String, Object[])>
				do
				{
					do
					{
						if(!((Cursor) (context)).moveToNext())
							continue label0;
	//   60   99:aload_0         
	//   61  100:invokeinterface #285 <Method boolean Cursor.moveToNext()>
	//   62  105:ifeq            189
						obj = ((Object) (((Cursor) (context)).getString(((Cursor) (context)).getColumnIndex("uriValue"))));
	//   63  108:aload_0         
	//   64  109:aload_0         
	//   65  110:ldc2            #287 <String "uriValue">
	//   66  113:invokeinterface #291 <Method int Cursor.getColumnIndex(String)>
	//   67  118:invokeinterface #295 <Method String Cursor.getString(int)>
	//   68  123:astore_3        
					} while(obj == null);
	//   69  124:aload_3         
	//   70  125:ifnull          161
					dho.b("HiH_PengineUserLabelMgr", new Object[] {
						"Uri = ", e[i], "value = ", obj
					});
	//   71  128:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   72  130:iconst_4        
	//   73  131:anewarray       Object[]
	//   74  134:dup             
	//   75  135:iconst_0        
	//   76  136:ldc2            #297 <String "Uri = ">
	//   77  139:aastore         
	//   78  140:dup             
	//   79  141:iconst_1        
	//   80  142:getstatic       #82  <Field String[] e>
	//   81  145:iload_1         
	//   82  146:aaload          
	//   83  147:aastore         
	//   84  148:dup             
	//   85  149:iconst_2        
	//   86  150:ldc2            #299 <String "value = ">
	//   87  153:aastore         
	//   88  154:dup             
	//   89  155:iconst_3        
	//   90  156:aload_3         
	//   91  157:aastore         
	//   92  158:invokestatic    #106 <Method void dho.b(String, Object[])>
				} while(true);
	//   93  161:goto            99
			}
			dho.b("HiH_PengineUserLabelMgr", new Object[] {
				"cursor = null", " uri = ", obj
			});
	//   94  164:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//   95  166:iconst_3        
	//   96  167:anewarray       Object[]
	//   97  170:dup             
	//   98  171:iconst_0        
	//   99  172:ldc2            #301 <String "cursor = null">
	//  100  175:aastore         
	//  101  176:dup             
	//  102  177:iconst_1        
	//  103  178:ldc2            #303 <String " uri = ">
	//  104  181:aastore         
	//  105  182:dup             
	//  106  183:iconst_2        
	//  107  184:aload_3         
	//  108  185:aastore         
	//  109  186:invokestatic    #106 <Method void dho.b(String, Object[])>
		}

	//  110  189:iload_1         
	//  111  190:iconst_1        
	//  112  191:iadd            
	//  113  192:istore_1        
	//* 114  193:goto            49
		if(context != null)
	//* 115  196:aload_0         
	//* 116  197:ifnull          206
			((Cursor) (context)).close();
	//  117  200:aload_0         
	//  118  201:invokeinterface #306 <Method void Cursor.close()>
	//  119  206:return          
	}

	public static void e(Context context, String s)
	{
		dho.b("HiH_PengineUserLabelMgr", new Object[] {
			"UploadBindingDevice enter"
		});
	//    0    0:ldc1            #98  <String "HiH_PengineUserLabelMgr">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #308 <String "UploadBindingDevice enter">
	//    6   11:aastore         
	//    7   12:invokestatic    #106 <Method void dho.b(String, Object[])>
		context = ((Context) (new JSONObject()));
	//    8   15:new             #168 <Class JSONObject>
	//    9   18:dup             
	//   10   19:invokespecial   #169 <Method void JSONObject()>
	//   11   22:astore_0        
		try
		{
			((JSONObject) (context)).put("DeviceName", "Huawei Watch 2");
	//   12   23:aload_0         
	//   13   24:ldc2            #310 <String "DeviceName">
	//   14   27:ldc2            #312 <String "Huawei Watch 2">
	//   15   30:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//   16   33:pop             
			((JSONObject) (context)).put("DeviceID", "xxxxxx");
	//   17   34:aload_0         
	//   18   35:ldc1            #183 <String "DeviceID">
	//   19   37:ldc1            #185 <String "xxxxxx">
	//   20   39:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//   21   42:pop             
			((JSONObject) (context)).put("DeviceType", 0);
	//   22   43:aload_0         
	//   23   44:ldc2            #314 <String "DeviceType">
	//   24   47:iconst_0        
	//   25   48:invokevirtual   #174 <Method JSONObject JSONObject.put(String, int)>
	//   26   51:pop             
			((JSONObject) (context)).put("DeviceActiveTime", "2018-10-19 23:52:18");
	//   27   52:aload_0         
	//   28   53:ldc2            #316 <String "DeviceActiveTime">
	//   29   56:ldc2            #318 <String "2018-10-19 23:52:18">
	//   30   59:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//   31   62:pop             
			((JSONObject) (context)).put("DeviceBrand", "Huawei");
	//   32   63:aload_0         
	//   33   64:ldc2            #320 <String "DeviceBrand">
	//   34   67:ldc2            #322 <String "Huawei">
	//   35   70:invokevirtual   #181 <Method JSONObject JSONObject.put(String, Object)>
	//   36   73:pop             
			dho.b("UploadBindingDevice, jsonObject = ", new Object[] {
				((JSONObject) (context)).toString()
			});
	//   37   74:ldc2            #324 <String "UploadBindingDevice, jsonObject = ">
	//   38   77:iconst_1        
	//   39   78:anewarray       Object[]
	//   40   81:dup             
	//   41   82:iconst_0        
	//   42   83:aload_0         
	//   43   84:invokevirtual   #200 <Method String JSONObject.toString()>
	//   44   87:aastore         
	//   45   88:invokestatic    #106 <Method void dho.b(String, Object[])>
		}
	//*  46   91:goto            99
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  47   94:astore_1        
		{
			((JSONException) (s)).printStackTrace();
	//   48   95:aload_1         
	//   49   96:invokevirtual   #203 <Method void JSONException.printStackTrace()>
		}
		if(1 == d.inputSourceData(1000L, ((JSONObject) (context)).toString()))
	//*  50   99:iconst_1        
	//*  51  100:getstatic       #90  <Field HiDataManager d>
	//*  52  103:ldc2w           #122 <Long 1000L>
	//*  53  106:aload_0         
	//*  54  107:invokevirtual   #200 <Method String JSONObject.toString()>
	//*  55  110:invokevirtual   #127 <Method int HiDataManager.inputSourceData(long, String)>
	//*  56  113:icmpne          127
		{
			dho.b("UploadBindingDevice DeviceName = Huawei Watch 2 , success", new Object[0]);
	//   57  116:ldc2            #326 <String "UploadBindingDevice DeviceName = Huawei Watch 2 , success">
	//   58  119:iconst_0        
	//   59  120:anewarray       Object[]
	//   60  123:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   61  126:return          
		} else
		{
			dho.b("UploadBindingDevice DeviceName = Huawei Watch 2 , failed", new Object[0]);
	//   62  127:ldc2            #328 <String "UploadBindingDevice DeviceName = Huawei Watch 2 , failed">
	//   63  130:iconst_0        
	//   64  131:anewarray       Object[]
	//   65  134:invokestatic    #106 <Method void dho.b(String, Object[])>
			return;
	//   66  137:return          
		}
	}

	public static final HiDataManager d = HiDataManager.getInstance();
	private static String e[] = {
		"content://com.huawei.pengine.UserProfileProvider/SingleRunDuration", "content://com.huawei.pengine.UserProfileProvider/HealthyAppUsage", "content://com.huawei.pengine.UserProfileProvider/RunningPeriod", "content://com.huawei.pengine.UserProfileProvider/RunnerLocation", "content://com.huawei.pengine.UserProfileProvider/OwnWearableEquipment", "content://com.huawei.pengine.UserProfileProvider/SportsTypePreference", "content://com.huawei.pengine.UserProfileProvider/RunningPace", "content://com.huawei.pengine.UserProfileProvider/RidingPace", "content://com.huawei.pengine.UserProfileProvider/IndoorRunningPace", "content://com.huawei.pengine.UserProfileProvider/IndoorRidingPace", 
		"content://com.huawei.pengine.UserProfileProvider/RidingFrequency", "content://com.huawei.pengine.UserProfileProvider/IndoorRunningFrequency", "content://com.huawei.pengine.UserProfileProvider/WalkingFrequency", "content://com.huawei.pengine.UserProfileProvider/IndoorRidingFrequency", "content://com.huawei.pengine.UserProfileProvider/IndoorSwimmingFrequency", "content://com.huawei.pengine.UserProfileProvider/SportsDuration", "content://com.huawei.pengine.UserProfileProvider/RunningDuration", "content://com.huawei.pengine.UserProfileProvider/RidingDuration", "content://com.huawei.pengine.UserProfileProvider/IndoorRunningDuration", "content://com.huawei.pengine.UserProfileProvider/WalkingDuration", 
		"content://com.huawei.pengine.UserProfileProvider/IndoorRidingDuration", "content://com.huawei.pengine.UserProfileProvider/IndoorSwimmingDuration", "content://com.huawei.pengine.UserProfileProvider/SportsHeartRate", "content://com.huawei.pengine.UserProfileProvider/RunningHeartRate", "content://com.huawei.pengine.UserProfileProvider/RidingHeartRate", "content://com.huawei.pengine.UserProfileProvider/IndoorRunningHeartRate", "content://com.huawei.pengine.UserProfileProvider/WalkingHeartRate", "content://com.huawei.pengine.UserProfileProvider/IndoorRidingHeartRate", "content://com.huawei.pengine.UserProfileProvider/IndoorSwimmingHeartRate", "content://com.huawei.pengine.UserProfileProvider/RoamingRadius", 
		"content://com.huawei.pengine.UserProfileProvider/CellphoneDataFlow", "content://com.huawei.pengine.UserProfileProvider/SleepTime", "content://com.huawei.pengine.UserProfileProvider/SportsFrequency", "content://com.huawei.pengine.UserProfileProvider/RunningFrequency"
	};

	static 
	{
	//    0    0:bipush          34
	//    1    2:anewarray       String[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #14  <String "content://com.huawei.pengine.UserProfileProvider/SingleRunDuration">
	//    5    9:aastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #16  <String "content://com.huawei.pengine.UserProfileProvider/HealthyAppUsage">
	//    9   14:aastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #18  <String "content://com.huawei.pengine.UserProfileProvider/RunningPeriod">
	//   13   19:aastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #20  <String "content://com.huawei.pengine.UserProfileProvider/RunnerLocation">
	//   17   24:aastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #22  <String "content://com.huawei.pengine.UserProfileProvider/OwnWearableEquipment">
	//   21   29:aastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #24  <String "content://com.huawei.pengine.UserProfileProvider/SportsTypePreference">
	//   25   34:aastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #26  <String "content://com.huawei.pengine.UserProfileProvider/RunningPace">
	//   29   40:aastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #28  <String "content://com.huawei.pengine.UserProfileProvider/RidingPace">
	//   33   46:aastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #30  <String "content://com.huawei.pengine.UserProfileProvider/IndoorRunningPace">
	//   37   52:aastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #32  <String "content://com.huawei.pengine.UserProfileProvider/IndoorRidingPace">
	//   41   58:aastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #34  <String "content://com.huawei.pengine.UserProfileProvider/RidingFrequency">
	//   45   64:aastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #36  <String "content://com.huawei.pengine.UserProfileProvider/IndoorRunningFrequency">
	//   49   70:aastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #38  <String "content://com.huawei.pengine.UserProfileProvider/WalkingFrequency">
	//   53   76:aastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #40  <String "content://com.huawei.pengine.UserProfileProvider/IndoorRidingFrequency">
	//   57   82:aastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #42  <String "content://com.huawei.pengine.UserProfileProvider/IndoorSwimmingFrequency">
	//   61   88:aastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #44  <String "content://com.huawei.pengine.UserProfileProvider/SportsDuration">
	//   65   94:aastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #46  <String "content://com.huawei.pengine.UserProfileProvider/RunningDuration">
	//   69  100:aastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #48  <String "content://com.huawei.pengine.UserProfileProvider/RidingDuration">
	//   73  106:aastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #50  <String "content://com.huawei.pengine.UserProfileProvider/IndoorRunningDuration">
	//   77  112:aastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #52  <String "content://com.huawei.pengine.UserProfileProvider/WalkingDuration">
	//   81  118:aastore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:ldc1            #54  <String "content://com.huawei.pengine.UserProfileProvider/IndoorRidingDuration">
	//   85  124:aastore         
	//   86  125:dup             
	//   87  126:bipush          21
	//   88  128:ldc1            #56  <String "content://com.huawei.pengine.UserProfileProvider/IndoorSwimmingDuration">
	//   89  130:aastore         
	//   90  131:dup             
	//   91  132:bipush          22
	//   92  134:ldc1            #58  <String "content://com.huawei.pengine.UserProfileProvider/SportsHeartRate">
	//   93  136:aastore         
	//   94  137:dup             
	//   95  138:bipush          23
	//   96  140:ldc1            #60  <String "content://com.huawei.pengine.UserProfileProvider/RunningHeartRate">
	//   97  142:aastore         
	//   98  143:dup             
	//   99  144:bipush          24
	//  100  146:ldc1            #62  <String "content://com.huawei.pengine.UserProfileProvider/RidingHeartRate">
	//  101  148:aastore         
	//  102  149:dup             
	//  103  150:bipush          25
	//  104  152:ldc1            #64  <String "content://com.huawei.pengine.UserProfileProvider/IndoorRunningHeartRate">
	//  105  154:aastore         
	//  106  155:dup             
	//  107  156:bipush          26
	//  108  158:ldc1            #66  <String "content://com.huawei.pengine.UserProfileProvider/WalkingHeartRate">
	//  109  160:aastore         
	//  110  161:dup             
	//  111  162:bipush          27
	//  112  164:ldc1            #68  <String "content://com.huawei.pengine.UserProfileProvider/IndoorRidingHeartRate">
	//  113  166:aastore         
	//  114  167:dup             
	//  115  168:bipush          28
	//  116  170:ldc1            #70  <String "content://com.huawei.pengine.UserProfileProvider/IndoorSwimmingHeartRate">
	//  117  172:aastore         
	//  118  173:dup             
	//  119  174:bipush          29
	//  120  176:ldc1            #72  <String "content://com.huawei.pengine.UserProfileProvider/RoamingRadius">
	//  121  178:aastore         
	//  122  179:dup             
	//  123  180:bipush          30
	//  124  182:ldc1            #74  <String "content://com.huawei.pengine.UserProfileProvider/CellphoneDataFlow">
	//  125  184:aastore         
	//  126  185:dup             
	//  127  186:bipush          31
	//  128  188:ldc1            #76  <String "content://com.huawei.pengine.UserProfileProvider/SleepTime">
	//  129  190:aastore         
	//  130  191:dup             
	//  131  192:bipush          32
	//  132  194:ldc1            #78  <String "content://com.huawei.pengine.UserProfileProvider/SportsFrequency">
	//  133  196:aastore         
	//  134  197:dup             
	//  135  198:bipush          33
	//  136  200:ldc1            #80  <String "content://com.huawei.pengine.UserProfileProvider/RunningFrequency">
	//  137  202:aastore         
	//  138  203:putstatic       #82  <Field String[] e>
	//  139  206:invokestatic    #88  <Method HiDataManager HiDataManager.getInstance()>
	//  140  209:putstatic       #90  <Field HiDataManager d>
	//* 141  212:return          
	}
}
