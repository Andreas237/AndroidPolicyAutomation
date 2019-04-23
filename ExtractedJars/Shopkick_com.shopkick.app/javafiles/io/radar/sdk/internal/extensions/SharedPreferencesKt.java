// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.radar.sdk.internal.extensions;

import android.content.SharedPreferences;
import android.location.Location;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class SharedPreferencesKt
{

	public static final void edit(SharedPreferences sharedpreferences, Function1 function1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (sharedpreferences)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "receiver$0">
	//    2    3:invokestatic    #41  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (function1)), "action");
	//    3    6:aload_1         
	//    4    7:ldc1            #42  <String "action">
	//    5    9:invokestatic    #41  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		sharedpreferences = ((SharedPreferences) (sharedpreferences.edit()));
	//    6   12:aload_0         
	//    7   13:invokeinterface #47  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    8   18:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (sharedpreferences)), "editor");
	//    9   19:aload_0         
	//   10   20:ldc1            #49  <String "editor">
	//   11   22:invokestatic    #52  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		function1.invoke(((Object) (sharedpreferences)));
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokeinterface #58  <Method Object Function1.invoke(Object)>
	//   15   32:pop             
		((android.content.SharedPreferences.Editor) (sharedpreferences)).apply();
	//   16   33:aload_0         
	//   17   34:invokeinterface #64  <Method void android.content.SharedPreferences$Editor.apply()>
	//   18   39:return          
	}

	public static final Location getLocation(SharedPreferences sharedpreferences, String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (sharedpreferences)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "receiver$0">
	//    2    3:invokestatic    #41  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "key");
	//    3    6:aload_1         
	//    4    7:ldc1            #72  <String "key">
	//    5    9:invokestatic    #41  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #74  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #77  <Method void StringBuilder()>
	//    9   19:astore          7
		stringbuilder.append(s);
	//   10   21:aload           7
	//   11   23:aload_1         
	//   12   24:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		stringbuilder.append("-lat");
	//   14   28:aload           7
	//   15   30:ldc1            #83  <String "-lat">
	//   16   32:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		float f = sharedpreferences.getFloat(stringbuilder.toString(), 0.0F);
	//   18   36:aload_0         
	//   19   37:aload           7
	//   20   39:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   21   42:fconst_0        
	//   22   43:invokeinterface #91  <Method float SharedPreferences.getFloat(String, float)>
	//   23   48:fstore_2        
		stringbuilder = new StringBuilder();
	//   24   49:new             #74  <Class StringBuilder>
	//   25   52:dup             
	//   26   53:invokespecial   #77  <Method void StringBuilder()>
	//   27   56:astore          7
		stringbuilder.append(s);
	//   28   58:aload           7
	//   29   60:aload_1         
	//   30   61:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
		stringbuilder.append("-long");
	//   32   65:aload           7
	//   33   67:ldc1            #93  <String "-long">
	//   34   69:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   35   72:pop             
		float f1 = sharedpreferences.getFloat(stringbuilder.toString(), 0.0F);
	//   36   73:aload_0         
	//   37   74:aload           7
	//   38   76:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   39   79:fconst_0        
	//   40   80:invokeinterface #91  <Method float SharedPreferences.getFloat(String, float)>
	//   41   85:fstore_3        
		stringbuilder = new StringBuilder();
	//   42   86:new             #74  <Class StringBuilder>
	//   43   89:dup             
	//   44   90:invokespecial   #77  <Method void StringBuilder()>
	//   45   93:astore          7
		stringbuilder.append(s);
	//   46   95:aload           7
	//   47   97:aload_1         
	//   48   98:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   49  101:pop             
		stringbuilder.append("-accuracy");
	//   50  102:aload           7
	//   51  104:ldc1            #95  <String "-accuracy">
	//   52  106:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   53  109:pop             
		float f2 = sharedpreferences.getFloat(stringbuilder.toString(), 0.0F);
	//   54  110:aload_0         
	//   55  111:aload           7
	//   56  113:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   57  116:fconst_0        
	//   58  117:invokeinterface #91  <Method float SharedPreferences.getFloat(String, float)>
	//   59  122:fstore          4
		stringbuilder = new StringBuilder();
	//   60  124:new             #74  <Class StringBuilder>
	//   61  127:dup             
	//   62  128:invokespecial   #77  <Method void StringBuilder()>
	//   63  131:astore          7
		stringbuilder.append(s);
	//   64  133:aload           7
	//   65  135:aload_1         
	//   66  136:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   67  139:pop             
		stringbuilder.append("-time");
	//   68  140:aload           7
	//   69  142:ldc1            #97  <String "-time">
	//   70  144:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   71  147:pop             
		long l = sharedpreferences.getLong(stringbuilder.toString(), 0L);
	//   72  148:aload_0         
	//   73  149:aload           7
	//   74  151:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   75  154:lconst_0        
	//   76  155:invokeinterface #101 <Method long SharedPreferences.getLong(String, long)>
	//   77  160:lstore          5
		if(f != 0.0F && f1 != 0.0F && l > 0L)
	//*  78  162:fload_2         
	//*  79  163:fconst_0        
	//*  80  164:fcmpg           
	//*  81  165:ifeq            217
	//*  82  168:fload_3         
	//*  83  169:fconst_0        
	//*  84  170:fcmpg           
	//*  85  171:ifeq            217
	//*  86  174:lload           5
	//*  87  176:lconst_0        
	//*  88  177:lcmp            
	//*  89  178:ifle            217
		{
			sharedpreferences = ((SharedPreferences) (new Location("Radar")));
	//   90  181:new             #103 <Class Location>
	//   91  184:dup             
	//   92  185:ldc1            #105 <String "Radar">
	//   93  187:invokespecial   #108 <Method void Location(String)>
	//   94  190:astore_0        
			((Location) (sharedpreferences)).setLatitude(f);
	//   95  191:aload_0         
	//   96  192:fload_2         
	//   97  193:f2d             
	//   98  194:invokevirtual   #112 <Method void Location.setLatitude(double)>
			((Location) (sharedpreferences)).setLongitude(f1);
	//   99  197:aload_0         
	//  100  198:fload_3         
	//  101  199:f2d             
	//  102  200:invokevirtual   #115 <Method void Location.setLongitude(double)>
			((Location) (sharedpreferences)).setTime(l);
	//  103  203:aload_0         
	//  104  204:lload           5
	//  105  206:invokevirtual   #119 <Method void Location.setTime(long)>
			((Location) (sharedpreferences)).setAccuracy(f2);
	//  106  209:aload_0         
	//  107  210:fload           4
	//  108  212:invokevirtual   #123 <Method void Location.setAccuracy(float)>
			return ((Location) (sharedpreferences));
	//  109  215:aload_0         
	//  110  216:areturn         
		} else
		{
			return null;
	//  111  217:aconst_null     
	//  112  218:areturn         
		}
	}

	public static final void putLocation(android.content.SharedPreferences.Editor editor, String s, Location location)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (editor)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #35  <String "receiver$0">
	//    2    3:invokestatic    #41  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "key");
	//    3    6:aload_1         
	//    4    7:ldc1            #72  <String "key">
	//    5    9:invokestatic    #41  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(location == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       113
		{
			location = ((Location) (new StringBuilder()));
	//    8   16:new             #74  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #77  <Method void StringBuilder()>
	//   11   23:astore_2        
			((StringBuilder) (location)).append(s);
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			((StringBuilder) (location)).append("-lat");
	//   16   30:aload_2         
	//   17   31:ldc1            #83  <String "-lat">
	//   18   33:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   19   36:pop             
			editor.remove(((StringBuilder) (location)).toString());
	//   20   37:aload_0         
	//   21   38:aload_2         
	//   22   39:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   23   42:invokeinterface #128 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   24   47:pop             
			location = ((Location) (new StringBuilder()));
	//   25   48:new             #74  <Class StringBuilder>
	//   26   51:dup             
	//   27   52:invokespecial   #77  <Method void StringBuilder()>
	//   28   55:astore_2        
			((StringBuilder) (location)).append(s);
	//   29   56:aload_2         
	//   30   57:aload_1         
	//   31   58:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
			((StringBuilder) (location)).append("-long");
	//   33   62:aload_2         
	//   34   63:ldc1            #93  <String "-long">
	//   35   65:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
			editor.remove(((StringBuilder) (location)).toString());
	//   37   69:aload_0         
	//   38   70:aload_2         
	//   39   71:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   40   74:invokeinterface #128 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   41   79:pop             
			location = ((Location) (new StringBuilder()));
	//   42   80:new             #74  <Class StringBuilder>
	//   43   83:dup             
	//   44   84:invokespecial   #77  <Method void StringBuilder()>
	//   45   87:astore_2        
			((StringBuilder) (location)).append(s);
	//   46   88:aload_2         
	//   47   89:aload_1         
	//   48   90:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   49   93:pop             
			((StringBuilder) (location)).append("-time");
	//   50   94:aload_2         
	//   51   95:ldc1            #97  <String "-time">
	//   52   97:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   53  100:pop             
			editor.remove(((StringBuilder) (location)).toString());
	//   54  101:aload_0         
	//   55  102:aload_2         
	//   56  103:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   57  106:invokeinterface #128 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   58  111:pop             
			return;
	//   59  112:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   60  113:new             #74  <Class StringBuilder>
	//   61  116:dup             
	//   62  117:invokespecial   #77  <Method void StringBuilder()>
	//   63  120:astore_3        
			stringbuilder.append(s);
	//   64  121:aload_3         
	//   65  122:aload_1         
	//   66  123:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   67  126:pop             
			stringbuilder.append("-lat");
	//   68  127:aload_3         
	//   69  128:ldc1            #83  <String "-lat">
	//   70  130:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   71  133:pop             
			editor.putFloat(stringbuilder.toString(), (float)location.getLatitude());
	//   72  134:aload_0         
	//   73  135:aload_3         
	//   74  136:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   75  139:aload_2         
	//   76  140:invokevirtual   #132 <Method double Location.getLatitude()>
	//   77  143:d2f             
	//   78  144:invokeinterface #136 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   79  149:pop             
			stringbuilder = new StringBuilder();
	//   80  150:new             #74  <Class StringBuilder>
	//   81  153:dup             
	//   82  154:invokespecial   #77  <Method void StringBuilder()>
	//   83  157:astore_3        
			stringbuilder.append(s);
	//   84  158:aload_3         
	//   85  159:aload_1         
	//   86  160:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   87  163:pop             
			stringbuilder.append("-long");
	//   88  164:aload_3         
	//   89  165:ldc1            #93  <String "-long">
	//   90  167:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   91  170:pop             
			editor.putFloat(stringbuilder.toString(), (float)location.getLongitude());
	//   92  171:aload_0         
	//   93  172:aload_3         
	//   94  173:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   95  176:aload_2         
	//   96  177:invokevirtual   #139 <Method double Location.getLongitude()>
	//   97  180:d2f             
	//   98  181:invokeinterface #136 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//   99  186:pop             
			stringbuilder = new StringBuilder();
	//  100  187:new             #74  <Class StringBuilder>
	//  101  190:dup             
	//  102  191:invokespecial   #77  <Method void StringBuilder()>
	//  103  194:astore_3        
			stringbuilder.append(s);
	//  104  195:aload_3         
	//  105  196:aload_1         
	//  106  197:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  107  200:pop             
			stringbuilder.append("-accuracy");
	//  108  201:aload_3         
	//  109  202:ldc1            #95  <String "-accuracy">
	//  110  204:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  111  207:pop             
			editor.putFloat(stringbuilder.toString(), location.getAccuracy());
	//  112  208:aload_0         
	//  113  209:aload_3         
	//  114  210:invokevirtual   #87  <Method String StringBuilder.toString()>
	//  115  213:aload_2         
	//  116  214:invokevirtual   #143 <Method float Location.getAccuracy()>
	//  117  217:invokeinterface #136 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putFloat(String, float)>
	//  118  222:pop             
			stringbuilder = new StringBuilder();
	//  119  223:new             #74  <Class StringBuilder>
	//  120  226:dup             
	//  121  227:invokespecial   #77  <Method void StringBuilder()>
	//  122  230:astore_3        
			stringbuilder.append(s);
	//  123  231:aload_3         
	//  124  232:aload_1         
	//  125  233:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  126  236:pop             
			stringbuilder.append("-time");
	//  127  237:aload_3         
	//  128  238:ldc1            #97  <String "-time">
	//  129  240:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//  130  243:pop             
			editor.putLong(stringbuilder.toString(), location.getTime());
	//  131  244:aload_0         
	//  132  245:aload_3         
	//  133  246:invokevirtual   #87  <Method String StringBuilder.toString()>
	//  134  249:aload_2         
	//  135  250:invokevirtual   #147 <Method long Location.getTime()>
	//  136  253:invokeinterface #151 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putLong(String, long)>
	//  137  258:pop             
			return;
	//  138  259:return          
		}
	}
}
