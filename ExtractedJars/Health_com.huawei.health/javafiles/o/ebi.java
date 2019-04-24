// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.text.TextUtils;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package o:
//			dho

public class ebi
{

	public ebi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static boolean b(Context context, String s)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       20
		{
			dho.f("Login_ResourcesUtils", new Object[] {
				"null == context"
			});
	//    2    4:ldc1            #26  <String "Login_ResourcesUtils">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #28  <String "null == context">
	//    8   14:aastore         
	//    9   15:invokestatic    #34  <Method void dho.f(String, Object[])>
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		}
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  12   20:aload_1         
	//*  13   21:invokestatic    #40  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   24:ifeq            43
		{
			dho.f("Login_ResourcesUtils", new Object[] {
				"null == resFile"
			});
	//   15   27:ldc1            #26  <String "Login_ResourcesUtils">
	//   16   29:iconst_1        
	//   17   30:anewarray       Object[]
	//   18   33:dup             
	//   19   34:iconst_0        
	//   20   35:ldc1            #42  <String "null == resFile">
	//   21   37:aastore         
	//   22   38:invokestatic    #34  <Method void dho.f(String, Object[])>
			return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
		} else
		{
			return d(context, new File((new StringBuilder()).append(context.getExternalCacheDir().getAbsolutePath()).append(File.separator).append(s).toString()), false);
	//   25   43:aload_0         
	//   26   44:new             #44  <Class File>
	//   27   47:dup             
	//   28   48:new             #46  <Class StringBuilder>
	//   29   51:dup             
	//   30   52:invokespecial   #47  <Method void StringBuilder()>
	//   31   55:aload_0         
	//   32   56:invokevirtual   #53  <Method File Context.getExternalCacheDir()>
	//   33   59:invokevirtual   #57  <Method String File.getAbsolutePath()>
	//   34   62:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   35   65:getstatic       #65  <Field String File.separator>
	//   36   68:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:aload_1         
	//   38   72:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   39   75:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   40   78:invokespecial   #71  <Method void File(String)>
	//   41   81:iconst_0        
	//   42   82:invokestatic    #75  <Method boolean d(Context, File, boolean)>
	//   43   85:ireturn         
		}
	}

	public static boolean b(List list, String s)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       20
		{
			dho.f("Login_ResourcesUtils", new Object[] {
				"null == contexts"
			});
	//    2    4:ldc1            #26  <String "Login_ResourcesUtils">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #78  <String "null == contexts">
	//    8   14:aastore         
	//    9   15:invokestatic    #34  <Method void dho.f(String, Object[])>
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		}
		if(list.isEmpty())
	//*  12   20:aload_0         
	//*  13   21:invokeinterface #83  <Method boolean List.isEmpty()>
	//*  14   26:ifeq            31
			return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
		ArrayList arraylist = new ArrayList(list.size());
	//   17   31:new             #85  <Class ArrayList>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:invokeinterface #89  <Method int List.size()>
	//   21   41:invokespecial   #92  <Method void ArrayList(int)>
	//   22   44:astore_2        
		list = ((List) (list.iterator()));
	//   23   45:aload_0         
	//   24   46:invokeinterface #96  <Method Iterator List.iterator()>
	//   25   51:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   26   52:aload_0         
	//   27   53:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//   28   58:ifeq            98
			Context context = (Context)((Iterator) (list)).next();
	//   29   61:aload_0         
	//   30   62:invokeinterface #105 <Method Object Iterator.next()>
	//   31   67:checkcast       #49  <Class Context>
	//   32   70:astore_3        
			if(c(((List) (arraylist)), context) && b(context, s))
	//*  33   71:aload_2         
	//*  34   72:aload_3         
	//*  35   73:invokestatic    #108 <Method boolean c(List, Context)>
	//*  36   76:ifeq            95
	//*  37   79:aload_3         
	//*  38   80:aload_1         
	//*  39   81:invokestatic    #110 <Method boolean b(Context, String)>
	//*  40   84:ifeq            95
				((List) (arraylist)).add(((Object) (context)));
	//   41   87:aload_2         
	//   42   88:aload_3         
	//   43   89:invokeinterface #114 <Method boolean List.add(Object)>
	//   44   94:pop             
		} while(true);
	//   45   95:goto            52
		return true;
	//   46   98:iconst_1        
	//   47   99:ireturn         
	}

	private static Object c(Context context, String s)
		throws Exception
	{
		if(e == null)
	//*   0    0:getstatic       #17  <Field ArrayList e>
	//*   1    3:ifnonnull       16
			e = new ArrayList();
	//    2    6:new             #85  <Class ArrayList>
	//    3    9:dup             
	//    4   10:invokespecial   #120 <Method void ArrayList()>
	//    5   13:putstatic       #17  <Field ArrayList e>
		int i = e.indexOf(((Object) (s)));
	//    6   16:getstatic       #17  <Field ArrayList e>
	//    7   19:aload_1         
	//    8   20:invokevirtual   #124 <Method int ArrayList.indexOf(Object)>
	//    9   23:istore_2        
		if(i > 0 || b == null || b.size() != e.size())
	//*  10   24:iload_2         
	//*  11   25:ifgt            49
	//*  12   28:getstatic       #19  <Field ArrayList b>
	//*  13   31:ifnull          49
	//*  14   34:getstatic       #19  <Field ArrayList b>
	//*  15   37:invokevirtual   #125 <Method int ArrayList.size()>
	//*  16   40:getstatic       #17  <Field ArrayList e>
	//*  17   43:invokevirtual   #125 <Method int ArrayList.size()>
	//*  18   46:icmpeq          64
			s = ((String) (e(context.getApplicationInfo().sourceDir, s)));
	//   19   49:aload_0         
	//   20   50:invokevirtual   #129 <Method ApplicationInfo Context.getApplicationInfo()>
	//   21   53:getfield        #134 <Field String ApplicationInfo.sourceDir>
	//   22   56:aload_1         
	//   23   57:invokestatic    #137 <Method Integer e(String, String)>
	//   24   60:astore_1        
		else
	//*  25   61:goto            75
			s = ((String) ((Integer)b.get(i)));
	//   26   64:getstatic       #19  <Field ArrayList b>
	//   27   67:iload_2         
	//   28   68:invokevirtual   #141 <Method Object ArrayList.get(int)>
	//   29   71:checkcast       #143 <Class Integer>
	//   30   74:astore_1        
		context = ((Context) (context.getResources()));
	//   31   75:aload_0         
	//   32   76:invokevirtual   #147 <Method Resources Context.getResources()>
	//   33   79:astore_0        
		if(((Resources) (context)).getAssets() != c)
	//*  34   80:aload_0         
	//*  35   81:invokevirtual   #153 <Method AssetManager Resources.getAssets()>
	//*  36   84:getstatic       #15  <Field AssetManager c>
	//*  37   87:if_acmpeq       123
		{
			Field field = ((Class) (android/content/res/Resources)).getDeclaredField("mAssets");
	//   38   90:ldc1            #149 <Class Resources>
	//   39   92:ldc1            #155 <String "mAssets">
	//   40   94:invokevirtual   #161 <Method Field Class.getDeclaredField(String)>
	//   41   97:astore_3        
			field.setAccessible(true);
	//   42   98:aload_3         
	//   43   99:iconst_1        
	//   44  100:invokevirtual   #167 <Method void Field.setAccessible(boolean)>
			field.set(((Object) (context)), ((Object) (c)));
	//   45  103:aload_3         
	//   46  104:aload_0         
	//   47  105:getstatic       #15  <Field AssetManager c>
	//   48  108:invokevirtual   #171 <Method void Field.set(Object, Object)>
			((Resources) (context)).updateConfiguration(((Resources) (context)).getConfiguration(), ((Resources) (context)).getDisplayMetrics());
	//   49  111:aload_0         
	//   50  112:aload_0         
	//   51  113:invokevirtual   #175 <Method android.content.res.Configuration Resources.getConfiguration()>
	//   52  116:aload_0         
	//   53  117:invokevirtual   #179 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   54  120:invokevirtual   #183 <Method void Resources.updateConfiguration(android.content.res.Configuration, android.util.DisplayMetrics)>
		}
		return ((Object) (s));
	//   55  123:aload_1         
	//   56  124:areturn         
	}

	private static transient Method c(String s, Class aclass[])
		throws NoSuchMethodException
	{
		s = ((String) (((Class) (android/content/res/AssetManager)).getDeclaredMethod(s, aclass)));
	//    0    0:ldc1            #189 <Class AssetManager>
	//    1    2:aload_0         
	//    2    3:aload_1         
	//    3    4:invokevirtual   #192 <Method Method Class.getDeclaredMethod(String, Class[])>
	//    4    7:astore_0        
		((Method) (s)).setAccessible(true);
	//    5    8:aload_0         
	//    6    9:iconst_1        
	//    7   10:invokevirtual   #195 <Method void Method.setAccessible(boolean)>
		return ((Method) (s));
	//    8   13:aload_0         
	//    9   14:areturn         
	}

	private static boolean c(List list, Context context)
	{
		context = ((Context) (context.getResources().getAssets()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #147 <Method Resources Context.getResources()>
	//    2    4:invokevirtual   #153 <Method AssetManager Resources.getAssets()>
	//    3    7:astore_1        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   4    8:aload_0         
	//*   5    9:invokeinterface #96  <Method Iterator List.iterator()>
	//*   6   14:astore_0        
	//*   7   15:aload_0         
	//*   8   16:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            48
			if(((Context)((Iterator) (list)).next()).getResources().getAssets() == context)
	//*  10   24:aload_0         
	//*  11   25:invokeinterface #105 <Method Object Iterator.next()>
	//*  12   30:checkcast       #49  <Class Context>
	//*  13   33:invokevirtual   #147 <Method Resources Context.getResources()>
	//*  14   36:invokevirtual   #153 <Method AssetManager Resources.getAssets()>
	//*  15   39:aload_1         
	//*  16   40:if_acmpne       45
				return false;
	//   17   43:iconst_0        
	//   18   44:ireturn         

	//*  19   45:goto            15
		return true;
	//   20   48:iconst_1        
	//   21   49:ireturn         
	}

	public static boolean c(List list, File file)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       20
		{
			dho.f("Login_ResourcesUtils", new Object[] {
				"null == contexts"
			});
	//    2    4:ldc1            #26  <String "Login_ResourcesUtils">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #78  <String "null == contexts">
	//    8   14:aastore         
	//    9   15:invokestatic    #34  <Method void dho.f(String, Object[])>
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		}
		if(list.isEmpty())
	//*  12   20:aload_0         
	//*  13   21:invokeinterface #83  <Method boolean List.isEmpty()>
	//*  14   26:ifeq            31
			return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         
		ArrayList arraylist = new ArrayList(list.size());
	//   17   31:new             #85  <Class ArrayList>
	//   18   34:dup             
	//   19   35:aload_0         
	//   20   36:invokeinterface #89  <Method int List.size()>
	//   21   41:invokespecial   #92  <Method void ArrayList(int)>
	//   22   44:astore_2        
		list = ((List) (list.iterator()));
	//   23   45:aload_0         
	//   24   46:invokeinterface #96  <Method Iterator List.iterator()>
	//   25   51:astore_0        
		do
		{
			if(!((Iterator) (list)).hasNext())
				break;
	//   26   52:aload_0         
	//   27   53:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//   28   58:ifeq            98
			Context context = (Context)((Iterator) (list)).next();
	//   29   61:aload_0         
	//   30   62:invokeinterface #105 <Method Object Iterator.next()>
	//   31   67:checkcast       #49  <Class Context>
	//   32   70:astore_3        
			if(c(((List) (arraylist)), context) && e(context, file))
	//*  33   71:aload_2         
	//*  34   72:aload_3         
	//*  35   73:invokestatic    #108 <Method boolean c(List, Context)>
	//*  36   76:ifeq            95
	//*  37   79:aload_3         
	//*  38   80:aload_1         
	//*  39   81:invokestatic    #201 <Method boolean e(Context, File)>
	//*  40   84:ifeq            95
				((List) (arraylist)).add(((Object) (context)));
	//   41   87:aload_2         
	//   42   88:aload_3         
	//   43   89:invokeinterface #114 <Method boolean List.add(Object)>
	//   44   94:pop             
		} while(true);
	//   45   95:goto            52
		return true;
	//   46   98:iconst_1        
	//   47   99:ireturn         
	}

	private static boolean d(Context context, File file, boolean flag)
	{
		String s = file.getAbsolutePath();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #57  <Method String File.getAbsolutePath()>
	//    2    4:astore_3        
		if(!file.exists())
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #205 <Method boolean File.exists()>
	//*   5    9:ifne            57
		{
			if(flag)
	//*   6   12:iload_2         
	//*   7   13:ifeq            37
				dho.f("Login_ResourcesUtils", new Object[] {
					s, " is not exists."
				});
	//    8   16:ldc1            #26  <String "Login_ResourcesUtils">
	//    9   18:iconst_2        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:aload_3         
	//   14   25:aastore         
	//   15   26:dup             
	//   16   27:iconst_1        
	//   17   28:ldc1            #207 <String " is not exists.">
	//   18   30:aastore         
	//   19   31:invokestatic    #34  <Method void dho.f(String, Object[])>
			else
	//*  20   34:goto            55
				dho.b("Login_ResourcesUtils", new Object[] {
					s, " is not exists."
				});
	//   21   37:ldc1            #26  <String "Login_ResourcesUtils">
	//   22   39:iconst_2        
	//   23   40:anewarray       Object[]
	//   24   43:dup             
	//   25   44:iconst_0        
	//   26   45:aload_3         
	//   27   46:aastore         
	//   28   47:dup             
	//   29   48:iconst_1        
	//   30   49:ldc1            #207 <String " is not exists.">
	//   31   51:aastore         
	//   32   52:invokestatic    #209 <Method void dho.b(String, Object[])>
			return false;
	//   33   55:iconst_0        
	//   34   56:ireturn         
		}
		try
		{
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  35   57:getstatic       #215 <Field int android.os.Build$VERSION.SDK_INT>
	//*  36   60:bipush          21
	//*  37   62:icmplt          103
			{
				context = ((Context) (context.getResources().getAssets()));
	//   38   65:aload_0         
	//   39   66:invokevirtual   #147 <Method Resources Context.getResources()>
	//   40   69:invokevirtual   #153 <Method AssetManager Resources.getAssets()>
	//   41   72:astore_0        
				file = ((File) (c("addAssetPath", new Class[] {
					java/lang/String
				}).invoke(((Object) (context)), new Object[] {
					s
				})));
	//   42   73:ldc1            #217 <String "addAssetPath">
	//   43   75:iconst_1        
	//   44   76:anewarray       Class[]
	//   45   79:dup             
	//   46   80:iconst_0        
	//   47   81:ldc1            #219 <Class String>
	//   48   83:aastore         
	//   49   84:invokestatic    #221 <Method Method c(String, Class[])>
	//   50   87:aload_0         
	//   51   88:iconst_1        
	//   52   89:anewarray       Object[]
	//   53   92:dup             
	//   54   93:iconst_0        
	//   55   94:aload_3         
	//   56   95:aastore         
	//   57   96:invokevirtual   #225 <Method Object Method.invoke(Object, Object[])>
	//   58   99:astore_1        
				break MISSING_BLOCK_LABEL_117;
	//   59  100:goto            117
			}
		}
	//*  60  103:aload_0         
	//*  61  104:aload_3         
	//*  62  105:invokestatic    #227 <Method Object c(Context, String)>
	//*  63  108:astore_1        
	//*  64  109:aload_0         
	//*  65  110:invokevirtual   #147 <Method Resources Context.getResources()>
	//*  66  113:invokevirtual   #153 <Method AssetManager Resources.getAssets()>
	//*  67  116:astore_0        
	//*  68  117:ldc1            #26  <String "Login_ResourcesUtils">
	//*  69  119:bipush          6
	//*  70  121:anewarray       Object[]
	//*  71  124:dup             
	//*  72  125:iconst_0        
	//*  73  126:ldc1            #229 <String "addResources ">
	//*  74  128:aastore         
	//*  75  129:dup             
	//*  76  130:iconst_1        
	//*  77  131:aload_3         
	//*  78  132:aastore         
	//*  79  133:dup             
	//*  80  134:iconst_2        
	//*  81  135:ldc1            #231 <String ", result=">
	//*  82  137:aastore         
	//*  83  138:dup             
	//*  84  139:iconst_3        
	//*  85  140:aload_1         
	//*  86  141:aastore         
	//*  87  142:dup             
	//*  88  143:iconst_4        
	//*  89  144:ldc1            #233 <String ", assets=">
	//*  90  146:aastore         
	//*  91  147:dup             
	//*  92  148:iconst_5        
	//*  93  149:aload_0         
	//*  94  150:aastore         
	//*  95  151:invokestatic    #209 <Method void dho.b(String, Object[])>
	//*  96  154:iconst_1        
	//*  97  155:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  98  156:astore_0        
		{
			dho.f("Login_ResourcesUtils", new Object[] {
				"addResources ", ((Exception) (context)).toString()
			});
	//   99  157:ldc1            #26  <String "Login_ResourcesUtils">
	//  100  159:iconst_2        
	//  101  160:anewarray       Object[]
	//  102  163:dup             
	//  103  164:iconst_0        
	//  104  165:ldc1            #229 <String "addResources ">
	//  105  167:aastore         
	//  106  168:dup             
	//  107  169:iconst_1        
	//  108  170:aload_0         
	//  109  171:invokevirtual   #234 <Method String Exception.toString()>
	//  110  174:aastore         
	//  111  175:invokestatic    #34  <Method void dho.f(String, Object[])>
			return false;
	//  112  178:iconst_0        
	//  113  179:ireturn         
		}
		file = ((File) (c(context, s)));
		context = ((Context) (context.getResources().getAssets()));
		dho.b("Login_ResourcesUtils", new Object[] {
			"addResources ", s, ", result=", file, ", assets=", context
		});
		return true;
	}

	private static Integer e(String s, String s1)
		throws Exception
	{
		AssetManager assetmanager = (AssetManager)((Class) (android/content/res/AssetManager)).newInstance();
	//    0    0:ldc1            #189 <Class AssetManager>
	//    1    2:invokevirtual   #237 <Method Object Class.newInstance()>
	//    2    5:checkcast       #189 <Class AssetManager>
	//    3    8:astore_2        
		Object obj = ((Object) (c("addAssetPath", new Class[] {
			java/lang/String
		})));
	//    4    9:ldc1            #217 <String "addAssetPath">
	//    5   11:iconst_1        
	//    6   12:anewarray       Class[]
	//    7   15:dup             
	//    8   16:iconst_0        
	//    9   17:ldc1            #219 <Class String>
	//   10   19:aastore         
	//   11   20:invokestatic    #221 <Method Method c(String, Class[])>
	//   12   23:astore_3        
		if(((Integer)((Method) (obj)).invoke(((Object) (assetmanager)), new Object[] {
	s
})).intValue() == 0)
	//*  13   24:aload_3         
	//*  14   25:aload_2         
	//*  15   26:iconst_1        
	//*  16   27:anewarray       Object[]
	//*  17   30:dup             
	//*  18   31:iconst_0        
	//*  19   32:aload_0         
	//*  20   33:aastore         
	//*  21   34:invokevirtual   #225 <Method Object Method.invoke(Object, Object[])>
	//*  22   37:checkcast       #143 <Class Integer>
	//*  23   40:invokevirtual   #240 <Method int Integer.intValue()>
	//*  24   43:ifne            64
			dho.e("Login_ResourcesUtils", new Object[] {
				"addResources fail. baseResPath=", s
			});
	//   25   46:ldc1            #26  <String "Login_ResourcesUtils">
	//   26   48:iconst_2        
	//   27   49:anewarray       Object[]
	//   28   52:dup             
	//   29   53:iconst_0        
	//   30   54:ldc1            #242 <String "addResources fail. baseResPath=">
	//   31   56:aastore         
	//   32   57:dup             
	//   33   58:iconst_1        
	//   34   59:aload_0         
	//   35   60:aastore         
	//   36   61:invokestatic    #244 <Method void dho.e(String, Object[])>
		s = ((String) (new ArrayList()));
	//   37   64:new             #85  <Class ArrayList>
	//   38   67:dup             
	//   39   68:invokespecial   #120 <Method void ArrayList()>
	//   40   71:astore_0        
		Integer integer;
		for(Iterator iterator = e.iterator(); iterator.hasNext(); ((ArrayList) (s)).add(((Object) (integer))))
	//*  41   72:getstatic       #17  <Field ArrayList e>
	//*  42   75:invokevirtual   #245 <Method Iterator ArrayList.iterator()>
	//*  43   78:astore          4
	//*  44   80:aload           4
	//*  45   82:invokeinterface #101 <Method boolean Iterator.hasNext()>
	//*  46   87:ifeq            158
		{
			String s2 = (String)iterator.next();
	//   47   90:aload           4
	//   48   92:invokeinterface #105 <Method Object Iterator.next()>
	//   49   97:checkcast       #219 <Class String>
	//   50  100:astore          5
			integer = (Integer)((Method) (obj)).invoke(((Object) (assetmanager)), new Object[] {
				s2
			});
	//   51  102:aload_3         
	//   52  103:aload_2         
	//   53  104:iconst_1        
	//   54  105:anewarray       Object[]
	//   55  108:dup             
	//   56  109:iconst_0        
	//   57  110:aload           5
	//   58  112:aastore         
	//   59  113:invokevirtual   #225 <Method Object Method.invoke(Object, Object[])>
	//   60  116:checkcast       #143 <Class Integer>
	//   61  119:astore          6
			if(integer.intValue() == 0)
	//*  62  121:aload           6
	//*  63  123:invokevirtual   #240 <Method int Integer.intValue()>
	//*  64  126:ifne            148
				dho.e("Login_ResourcesUtils", new Object[] {
					"addResources fail. resPath=", s2
				});
	//   65  129:ldc1            #26  <String "Login_ResourcesUtils">
	//   66  131:iconst_2        
	//   67  132:anewarray       Object[]
	//   68  135:dup             
	//   69  136:iconst_0        
	//   70  137:ldc1            #247 <String "addResources fail. resPath=">
	//   71  139:aastore         
	//   72  140:dup             
	//   73  141:iconst_1        
	//   74  142:aload           5
	//   75  144:aastore         
	//   76  145:invokestatic    #244 <Method void dho.e(String, Object[])>
		}

	//   77  148:aload_0         
	//   78  149:aload           6
	//   79  151:invokevirtual   #248 <Method boolean ArrayList.add(Object)>
	//   80  154:pop             
	//*  81  155:goto            80
		obj = ((Object) ((Integer)((Method) (obj)).invoke(((Object) (assetmanager)), new Object[] {
			s1
		})));
	//   82  158:aload_3         
	//   83  159:aload_2         
	//   84  160:iconst_1        
	//   85  161:anewarray       Object[]
	//   86  164:dup             
	//   87  165:iconst_0        
	//   88  166:aload_1         
	//   89  167:aastore         
	//   90  168:invokevirtual   #225 <Method Object Method.invoke(Object, Object[])>
	//   91  171:checkcast       #143 <Class Integer>
	//   92  174:astore_3        
		((ArrayList) (s)).add(obj);
	//   93  175:aload_0         
	//   94  176:aload_3         
	//   95  177:invokevirtual   #248 <Method boolean ArrayList.add(Object)>
	//   96  180:pop             
		c("ensureStringBlocks", new Class[0]).invoke(((Object) (assetmanager)), new Object[0]);
	//   97  181:ldc1            #250 <String "ensureStringBlocks">
	//   98  183:iconst_0        
	//   99  184:anewarray       Class[]
	//  100  187:invokestatic    #221 <Method Method c(String, Class[])>
	//  101  190:aload_2         
	//  102  191:iconst_0        
	//  103  192:anewarray       Object[]
	//  104  195:invokevirtual   #225 <Method Object Method.invoke(Object, Object[])>
	//  105  198:pop             
		c = assetmanager;
	//  106  199:aload_2         
	//  107  200:putstatic       #15  <Field AssetManager c>
		b = ((ArrayList) (s));
	//  108  203:aload_0         
	//  109  204:putstatic       #19  <Field ArrayList b>
		e.add(((Object) (s1)));
	//  110  207:getstatic       #17  <Field ArrayList e>
	//  111  210:aload_1         
	//  112  211:invokevirtual   #248 <Method boolean ArrayList.add(Object)>
	//  113  214:pop             
		return ((Integer) (obj));
	//  114  215:aload_3         
	//  115  216:areturn         
	}

	public static boolean e(Context context, File file)
	{
		if(context == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       20
		{
			dho.f("Login_ResourcesUtils", new Object[] {
				"null == context"
			});
	//    2    4:ldc1            #26  <String "Login_ResourcesUtils">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #28  <String "null == context">
	//    8   14:aastore         
	//    9   15:invokestatic    #34  <Method void dho.f(String, Object[])>
			return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
		}
		if(file == null)
	//*  12   20:aload_1         
	//*  13   21:ifnonnull       40
		{
			dho.f("Login_ResourcesUtils", new Object[] {
				"null == resFile"
			});
	//   14   24:ldc1            #26  <String "Login_ResourcesUtils">
	//   15   26:iconst_1        
	//   16   27:anewarray       Object[]
	//   17   30:dup             
	//   18   31:iconst_0        
	//   19   32:ldc1            #42  <String "null == resFile">
	//   20   34:aastore         
	//   21   35:invokestatic    #34  <Method void dho.f(String, Object[])>
			return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
		} else
		{
			return d(context, file, true);
	//   24   40:aload_0         
	//   25   41:aload_1         
	//   26   42:iconst_1        
	//   27   43:invokestatic    #75  <Method boolean d(Context, File, boolean)>
	//   28   46:ireturn         
		}
	}

	private static ArrayList b = null;
	private static AssetManager c = null;
	private static ArrayList e = null;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #15  <Field AssetManager c>
	//    2    4:aconst_null     
	//    3    5:putstatic       #17  <Field ArrayList e>
	//    4    8:aconst_null     
	//    5    9:putstatic       #19  <Field ArrayList b>
	//*   6   12:return          
	}
}
