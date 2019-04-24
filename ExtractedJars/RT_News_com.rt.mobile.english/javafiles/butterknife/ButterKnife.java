// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.util.Property;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

// Referenced classes of package butterknife:
//			ImmutableViewList

public final class ButterKnife
{
	public static interface Action
	{

		public abstract void apply(View view, int i);
	}

	public static abstract class Finder extends Enum
	{

		public static transient View[] arrayOf(View aview[])
		{
			return aview;
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public static transient List listOf(View aview[])
		{
			return ((List) (new ImmutableViewList(aview)));
		//    0    0:new             #51  <Class ImmutableViewList>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #54  <Method void ImmutableViewList(View[])>
		//    4    8:areturn         
		}

		public static Finder valueOf(String s)
		{
			return (Finder)Enum.valueOf(butterknife/ButterKnife$Finder, s);
		//    0    0:ldc1            #2   <Class ButterKnife$Finder>
		//    1    2:aload_0         
		//    2    3:invokestatic    #60  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ButterKnife$Finder>
		//    4    9:areturn         
		}

		public static Finder[] values()
		{
			return (Finder[])((Finder []) ($VALUES)).clone();
		//    0    0:getstatic       #39  <Field ButterKnife$Finder[] $VALUES>
		//    1    3:invokevirtual   #67  <Method Object _5B_Lbutterknife.ButterKnife$Finder_3B_.clone()>
		//    2    6:checkcast       #63  <Class ButterKnife$Finder[]>
		//    3    9:areturn         
		}

		public abstract View findOptionalView(Object obj, int i);

		public View findRequiredView(Object obj, int i, String s)
		{
			Object obj1 = ((Object) (findOptionalView(obj, i)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokevirtual   #73  <Method View findOptionalView(Object, int)>
		//    4    6:astore          4
			if(obj1 == null)
		//*   5    8:aload           4
		//*   6   10:ifnonnull       101
			{
				obj = ((Object) (getContext(obj).getResources().getResourceEntryName(i)));
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:invokevirtual   #77  <Method Context getContext(Object)>
		//   10   18:invokevirtual   #83  <Method Resources Context.getResources()>
		//   11   21:iload_2         
		//   12   22:invokevirtual   #89  <Method String Resources.getResourceEntryName(int)>
		//   13   25:astore_1        
				obj1 = ((Object) (new StringBuilder()));
		//   14   26:new             #91  <Class StringBuilder>
		//   15   29:dup             
		//   16   30:invokespecial   #93  <Method void StringBuilder()>
		//   17   33:astore          4
				((StringBuilder) (obj1)).append("Required view '");
		//   18   35:aload           4
		//   19   37:ldc1            #95  <String "Required view '">
		//   20   39:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
		//   21   42:pop             
				((StringBuilder) (obj1)).append(((String) (obj)));
		//   22   43:aload           4
		//   23   45:aload_1         
		//   24   46:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
		//   25   49:pop             
				((StringBuilder) (obj1)).append("' with ID ");
		//   26   50:aload           4
		//   27   52:ldc1            #101 <String "' with ID ">
		//   28   54:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
		//   29   57:pop             
				((StringBuilder) (obj1)).append(i);
		//   30   58:aload           4
		//   31   60:iload_2         
		//   32   61:invokevirtual   #104 <Method StringBuilder StringBuilder.append(int)>
		//   33   64:pop             
				((StringBuilder) (obj1)).append(" for ");
		//   34   65:aload           4
		//   35   67:ldc1            #106 <String " for ">
		//   36   69:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
		//   37   72:pop             
				((StringBuilder) (obj1)).append(s);
		//   38   73:aload           4
		//   39   75:aload_3         
		//   40   76:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
		//   41   79:pop             
				((StringBuilder) (obj1)).append(" was not found. If this view is optional add '@Optional' annotation.");
		//   42   80:aload           4
		//   43   82:ldc1            #108 <String " was not found. If this view is optional add '@Optional' annotation.">
		//   44   84:invokevirtual   #99  <Method StringBuilder StringBuilder.append(String)>
		//   45   87:pop             
				throw new IllegalStateException(((StringBuilder) (obj1)).toString());
		//   46   88:new             #110 <Class IllegalStateException>
		//   47   91:dup             
		//   48   92:aload           4
		//   49   94:invokevirtual   #114 <Method String StringBuilder.toString()>
		//   50   97:invokespecial   #117 <Method void IllegalStateException(String)>
		//   51  100:athrow          
			} else
			{
				return ((View) (obj1));
		//   52  101:aload           4
		//   53  103:areturn         
			}
		}

		protected abstract Context getContext(Object obj);

		private static final Finder $VALUES[];
		public static final Finder ACTIVITY;
		public static final Finder DIALOG;
		public static final Finder VIEW;

		static 
		{
			VIEW = ((Finder) (new Finder("VIEW", 0) {

				public View findOptionalView(Object obj, int i)
				{
					return ((View)obj).findViewById(i);
				//    0    0:aload_1         
				//    1    1:checkcast       #17  <Class View>
				//    2    4:iload_2         
				//    3    5:invokevirtual   #21  <Method View View.findViewById(int)>
				//    4    8:areturn         
				}

				protected Context getContext(Object obj)
				{
					return ((View)obj).getContext();
				//    0    0:aload_1         
				//    1    1:checkcast       #17  <Class View>
				//    2    4:invokevirtual   #26  <Method Context View.getContext()>
				//    3    7:areturn         
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void ButterKnife$Finder(String, int, ButterKnife$1)>
			//    5    7:return          
			}
			}
));
		//    0    0:new             #10  <Class ButterKnife$Finder$1>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "VIEW">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #27  <Method void ButterKnife$Finder$1(String, int)>
		//    5   10:putstatic       #29  <Field ButterKnife$Finder VIEW>
			ACTIVITY = ((Finder) (new Finder("ACTIVITY", 1) {

				public View findOptionalView(Object obj, int i)
				{
					return ((Activity)obj).findViewById(i);
				//    0    0:aload_1         
				//    1    1:checkcast       #17  <Class Activity>
				//    2    4:iload_2         
				//    3    5:invokevirtual   #21  <Method View Activity.findViewById(int)>
				//    4    8:areturn         
				}

				protected Context getContext(Object obj)
				{
					return ((Context) ((Activity)obj));
				//    0    0:aload_1         
				//    1    1:checkcast       #17  <Class Activity>
				//    2    4:areturn         
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void ButterKnife$Finder(String, int, ButterKnife$1)>
			//    5    7:return          
			}
			}
));
		//    6   13:new             #12  <Class ButterKnife$Finder$2>
		//    7   16:dup             
		//    8   17:ldc1            #30  <String "ACTIVITY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #31  <Method void ButterKnife$Finder$2(String, int)>
		//   11   23:putstatic       #33  <Field ButterKnife$Finder ACTIVITY>
			DIALOG = ((Finder) (new Finder("DIALOG", 2) {

				public View findOptionalView(Object obj, int i)
				{
					return ((Dialog)obj).findViewById(i);
				//    0    0:aload_1         
				//    1    1:checkcast       #17  <Class Dialog>
				//    2    4:iload_2         
				//    3    5:invokevirtual   #21  <Method View Dialog.findViewById(int)>
				//    4    8:areturn         
				}

				protected Context getContext(Object obj)
				{
					return ((Dialog)obj).getContext();
				//    0    0:aload_1         
				//    1    1:checkcast       #17  <Class Dialog>
				//    2    4:invokevirtual   #26  <Method Context Dialog.getContext()>
				//    3    7:areturn         
				}

			
			{
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aconst_null     
			//    4    4:invokespecial   #12  <Method void ButterKnife$Finder(String, int, ButterKnife$1)>
			//    5    7:return          
			}
			}
));
		//   12   26:new             #14  <Class ButterKnife$Finder$3>
		//   13   29:dup             
		//   14   30:ldc1            #34  <String "DIALOG">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #35  <Method void ButterKnife$Finder$3(String, int)>
		//   17   36:putstatic       #37  <Field ButterKnife$Finder DIALOG>
			$VALUES = (new Finder[] {
				VIEW, ACTIVITY, DIALOG
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       Finder[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #29  <Field ButterKnife$Finder VIEW>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #33  <Field ButterKnife$Finder ACTIVITY>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #37  <Field ButterKnife$Finder DIALOG>
		//   31   60:aastore         
		//   32   61:putstatic       #39  <Field ButterKnife$Finder[] $VALUES>
		//*  33   64:return          
		}

		private Finder(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
		//    4    6:return          
		}

	}

	public static interface Setter
	{

		public abstract void set(View view, Object obj, int i);
	}


	private ButterKnife()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		throw new AssertionError("No instances.");
	//    2    4:new             #49  <Class AssertionError>
	//    3    7:dup             
	//    4    8:ldc1            #51  <String "No instances.">
	//    5   10:invokespecial   #54  <Method void AssertionError(Object)>
	//    6   13:athrow          
	}

	public static void apply(List list, Property property, Object obj)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #65  <Method int List.size()>
	//    2    6:istore          4
		for(int i = 0; i < j; i++)
	//*   3    8:iconst_0        
	//*   4    9:istore_3        
	//*   5   10:iload_3         
	//*   6   11:iload           4
	//*   7   13:icmpge          35
			property.set(list.get(i), obj);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:iload_3         
	//   11   19:invokeinterface #69  <Method Object List.get(int)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #75  <Method void Property.set(Object, Object)>

	//   14   28:iload_3         
	//   15   29:iconst_1        
	//   16   30:iadd            
	//   17   31:istore_3        
	//*  18   32:goto            10
	//   19   35:return          
	}

	public static void apply(List list, Action action)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #65  <Method int List.size()>
	//    2    6:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iload_3         
	//*   7   11:icmpge          38
			action.apply((View)list.get(i), i);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokeinterface #69  <Method Object List.get(int)>
	//   12   22:checkcast       #81  <Class View>
	//   13   25:iload_2         
	//   14   26:invokeinterface #84  <Method void ButterKnife$Action.apply(View, int)>

	//   15   31:iload_2         
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:istore_2        
	//*  19   35:goto            9
	//   20   38:return          
	}

	public static void apply(List list, Setter setter, Object obj)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #65  <Method int List.size()>
	//    2    6:istore          4
		for(int i = 0; i < j; i++)
	//*   3    8:iconst_0        
	//*   4    9:istore_3        
	//*   5   10:iload_3         
	//*   6   11:iload           4
	//*   7   13:icmpge          41
			setter.set((View)list.get(i), obj, i);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:iload_3         
	//   11   19:invokeinterface #69  <Method Object List.get(int)>
	//   12   24:checkcast       #81  <Class View>
	//   13   27:aload_2         
	//   14   28:iload_3         
	//   15   29:invokeinterface #89  <Method void ButterKnife$Setter.set(View, Object, int)>

	//   16   34:iload_3         
	//   17   35:iconst_1        
	//   18   36:iadd            
	//   19   37:istore_3        
	//*  20   38:goto            10
	//   21   41:return          
	}

	public static View findById(Activity activity, int i)
	{
		return activity.findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #98  <Method View Activity.findViewById(int)>
	//    3    5:areturn         
	}

	public static View findById(Dialog dialog, int i)
	{
		return dialog.findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #103 <Method View Dialog.findViewById(int)>
	//    3    5:areturn         
	}

	public static View findById(View view, int i)
	{
		return view.findViewById(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #106 <Method View View.findViewById(int)>
	//    3    5:areturn         
	}

	private static Method findInjectorForClass(Class class1)
		throws NoSuchMethodException
	{
		Object obj;
		obj = ((Object) ((Method)INJECTORS.get(((Object) (class1)))));
	//    0    0:getstatic       #43  <Field Map INJECTORS>
	//    1    3:aload_0         
	//    2    4:invokeinterface #118 <Method Object Map.get(Object)>
	//    3    9:checkcast       #120 <Class Method>
	//    4   12:astore_1        
		if(obj != null)
	//*   5   13:aload_1         
	//*   6   14:ifnull          33
		{
			if(debug)
	//*   7   17:getstatic       #122 <Field boolean debug>
	//*   8   20:ifeq            31
				Log.d("ButterKnife", "HIT: Cached in injector map.");
	//    9   23:ldc1            #31  <String "ButterKnife">
	//   10   25:ldc1            #124 <String "HIT: Cached in injector map.">
	//   11   27:invokestatic    #130 <Method int Log.d(String, String)>
	//   12   30:pop             
			return ((Method) (obj));
	//   13   31:aload_1         
	//   14   32:areturn         
		}
		obj = ((Object) (class1.getName()));
	//   15   33:aload_0         
	//   16   34:invokevirtual   #136 <Method String Class.getName()>
	//   17   37:astore_1        
		if(!((String) (obj)).startsWith("android.") && !((String) (obj)).startsWith("java.")) goto _L2; else goto _L1
	//   18   38:aload_1         
	//   19   39:ldc1            #138 <String "android.">
	//   20   41:invokevirtual   #144 <Method boolean String.startsWith(String)>
	//   21   44:ifne            196
	//   22   47:aload_1         
	//   23   48:ldc1            #146 <String "java.">
	//   24   50:invokevirtual   #144 <Method boolean String.startsWith(String)>
	//   25   53:ifeq            59
	//*  26   56:goto            196
_L2:
		Object obj1;
		obj1 = ((Object) (new StringBuilder()));
	//   27   59:new             #148 <Class StringBuilder>
	//   28   62:dup             
	//   29   63:invokespecial   #149 <Method void StringBuilder()>
	//   30   66:astore_2        
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   31   67:aload_2         
	//   32   68:aload_1         
	//   33   69:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		((StringBuilder) (obj1)).append("$$ViewInjector");
	//   35   73:aload_2         
	//   36   74:ldc1            #155 <String "$$ViewInjector">
	//   37   76:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
		obj1 = ((Object) (Class.forName(((StringBuilder) (obj1)).toString()).getMethod("inject", new Class[] {
			butterknife/ButterKnife$Finder, class1, java/lang/Object
		})));
	//   39   80:aload_2         
	//   40   81:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   41   84:invokestatic    #162 <Method Class Class.forName(String)>
	//   42   87:ldc1            #164 <String "inject">
	//   43   89:iconst_3        
	//   44   90:anewarray       Class[]
	//   45   93:dup             
	//   46   94:iconst_0        
	//   47   95:ldc1            #11  <Class ButterKnife$Finder>
	//   48   97:aastore         
	//   49   98:dup             
	//   50   99:iconst_1        
	//   51  100:aload_0         
	//   52  101:aastore         
	//   53  102:dup             
	//   54  103:iconst_2        
	//   55  104:ldc1            #4   <Class Object>
	//   56  106:aastore         
	//   57  107:invokevirtual   #168 <Method Method Class.getMethod(String, Class[])>
	//   58  110:astore_2        
		obj = obj1;
	//   59  111:aload_2         
	//   60  112:astore_1        
		if(!debug) goto _L4; else goto _L3
	//   61  113:getstatic       #122 <Field boolean debug>
	//   62  116:ifeq            183
_L3:
		Log.d("ButterKnife", "HIT: Class loaded injection class.");
	//   63  119:ldc1            #31  <String "ButterKnife">
	//   64  121:ldc1            #170 <String "HIT: Class loaded injection class.">
	//   65  123:invokestatic    #130 <Method int Log.d(String, String)>
	//   66  126:pop             
		obj = obj1;
	//   67  127:aload_2         
	//   68  128:astore_1        
		  goto _L4
	//*  69  129:goto            183
_L6:
		if(debug)
	//*  70  132:getstatic       #122 <Field boolean debug>
	//*  71  135:ifeq            175
		{
			obj = ((Object) (new StringBuilder()));
	//   72  138:new             #148 <Class StringBuilder>
	//   73  141:dup             
	//   74  142:invokespecial   #149 <Method void StringBuilder()>
	//   75  145:astore_1        
			((StringBuilder) (obj)).append("Not found. Trying superclass ");
	//   76  146:aload_1         
	//   77  147:ldc1            #172 <String "Not found. Trying superclass ">
	//   78  149:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   79  152:pop             
			((StringBuilder) (obj)).append(class1.getSuperclass().getName());
	//   80  153:aload_1         
	//   81  154:aload_0         
	//   82  155:invokevirtual   #176 <Method Class Class.getSuperclass()>
	//   83  158:invokevirtual   #136 <Method String Class.getName()>
	//   84  161:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   85  164:pop             
			Log.d("ButterKnife", ((StringBuilder) (obj)).toString());
	//   86  165:ldc1            #31  <String "ButterKnife">
	//   87  167:aload_1         
	//   88  168:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   89  171:invokestatic    #130 <Method int Log.d(String, String)>
	//   90  174:pop             
		}
		obj = ((Object) (findInjectorForClass(class1.getSuperclass())));
	//   91  175:aload_0         
	//   92  176:invokevirtual   #176 <Method Class Class.getSuperclass()>
	//   93  179:invokestatic    #178 <Method Method findInjectorForClass(Class)>
	//   94  182:astore_1        
_L4:
		INJECTORS.put(((Object) (class1)), obj);
	//   95  183:getstatic       #43  <Field Map INJECTORS>
	//   96  186:aload_0         
	//   97  187:aload_1         
	//   98  188:invokeinterface #182 <Method Object Map.put(Object, Object)>
	//   99  193:pop             
		return ((Method) (obj));
	//  100  194:aload_1         
	//  101  195:areturn         
_L1:
		if(debug)
	//* 102  196:getstatic       #122 <Field boolean debug>
	//* 103  199:ifeq            210
			Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
	//  104  202:ldc1            #31  <String "ButterKnife">
	//  105  204:ldc1            #184 <String "MISS: Reached framework class. Abandoning search.">
	//  106  206:invokestatic    #130 <Method int Log.d(String, String)>
	//  107  209:pop             
		return NO_OP;
	//  108  210:getstatic       #186 <Field Method NO_OP>
	//  109  213:areturn         
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//  110  214:astore_1        
		if(true) goto _L6; else goto _L5
_L5:
	//* 111  215:goto            132
	}

	private static Method findResettersForClass(Class class1)
		throws NoSuchMethodException
	{
		Object obj;
		obj = ((Object) ((Method)RESETTERS.get(((Object) (class1)))));
	//    0    0:getstatic       #45  <Field Map RESETTERS>
	//    1    3:aload_0         
	//    2    4:invokeinterface #118 <Method Object Map.get(Object)>
	//    3    9:checkcast       #120 <Class Method>
	//    4   12:astore_1        
		if(obj != null)
	//*   5   13:aload_1         
	//*   6   14:ifnull          33
		{
			if(debug)
	//*   7   17:getstatic       #122 <Field boolean debug>
	//*   8   20:ifeq            31
				Log.d("ButterKnife", "HIT: Cached in injector map.");
	//    9   23:ldc1            #31  <String "ButterKnife">
	//   10   25:ldc1            #124 <String "HIT: Cached in injector map.">
	//   11   27:invokestatic    #130 <Method int Log.d(String, String)>
	//   12   30:pop             
			return ((Method) (obj));
	//   13   31:aload_1         
	//   14   32:areturn         
		}
		obj = ((Object) (class1.getName()));
	//   15   33:aload_0         
	//   16   34:invokevirtual   #136 <Method String Class.getName()>
	//   17   37:astore_1        
		if(!((String) (obj)).startsWith("android.") && !((String) (obj)).startsWith("java.")) goto _L2; else goto _L1
	//   18   38:aload_1         
	//   19   39:ldc1            #138 <String "android.">
	//   20   41:invokevirtual   #144 <Method boolean String.startsWith(String)>
	//   21   44:ifne            186
	//   22   47:aload_1         
	//   23   48:ldc1            #146 <String "java.">
	//   24   50:invokevirtual   #144 <Method boolean String.startsWith(String)>
	//   25   53:ifeq            59
	//*  26   56:goto            186
_L2:
		Object obj1;
		obj1 = ((Object) (new StringBuilder()));
	//   27   59:new             #148 <Class StringBuilder>
	//   28   62:dup             
	//   29   63:invokespecial   #149 <Method void StringBuilder()>
	//   30   66:astore_2        
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   31   67:aload_2         
	//   32   68:aload_1         
	//   33   69:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   34   72:pop             
		((StringBuilder) (obj1)).append("$$ViewInjector");
	//   35   73:aload_2         
	//   36   74:ldc1            #155 <String "$$ViewInjector">
	//   37   76:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
		obj1 = ((Object) (Class.forName(((StringBuilder) (obj1)).toString()).getMethod("reset", new Class[] {
			class1
		})));
	//   39   80:aload_2         
	//   40   81:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   41   84:invokestatic    #162 <Method Class Class.forName(String)>
	//   42   87:ldc1            #191 <String "reset">
	//   43   89:iconst_1        
	//   44   90:anewarray       Class[]
	//   45   93:dup             
	//   46   94:iconst_0        
	//   47   95:aload_0         
	//   48   96:aastore         
	//   49   97:invokevirtual   #168 <Method Method Class.getMethod(String, Class[])>
	//   50  100:astore_2        
		obj = obj1;
	//   51  101:aload_2         
	//   52  102:astore_1        
		if(!debug) goto _L4; else goto _L3
	//   53  103:getstatic       #122 <Field boolean debug>
	//   54  106:ifeq            173
_L3:
		Log.d("ButterKnife", "HIT: Class loaded injection class.");
	//   55  109:ldc1            #31  <String "ButterKnife">
	//   56  111:ldc1            #170 <String "HIT: Class loaded injection class.">
	//   57  113:invokestatic    #130 <Method int Log.d(String, String)>
	//   58  116:pop             
		obj = obj1;
	//   59  117:aload_2         
	//   60  118:astore_1        
		  goto _L4
	//*  61  119:goto            173
_L6:
		if(debug)
	//*  62  122:getstatic       #122 <Field boolean debug>
	//*  63  125:ifeq            165
		{
			obj = ((Object) (new StringBuilder()));
	//   64  128:new             #148 <Class StringBuilder>
	//   65  131:dup             
	//   66  132:invokespecial   #149 <Method void StringBuilder()>
	//   67  135:astore_1        
			((StringBuilder) (obj)).append("Not found. Trying superclass ");
	//   68  136:aload_1         
	//   69  137:ldc1            #172 <String "Not found. Trying superclass ">
	//   70  139:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   71  142:pop             
			((StringBuilder) (obj)).append(class1.getSuperclass().getName());
	//   72  143:aload_1         
	//   73  144:aload_0         
	//   74  145:invokevirtual   #176 <Method Class Class.getSuperclass()>
	//   75  148:invokevirtual   #136 <Method String Class.getName()>
	//   76  151:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   77  154:pop             
			Log.d("ButterKnife", ((StringBuilder) (obj)).toString());
	//   78  155:ldc1            #31  <String "ButterKnife">
	//   79  157:aload_1         
	//   80  158:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   81  161:invokestatic    #130 <Method int Log.d(String, String)>
	//   82  164:pop             
		}
		obj = ((Object) (findResettersForClass(class1.getSuperclass())));
	//   83  165:aload_0         
	//   84  166:invokevirtual   #176 <Method Class Class.getSuperclass()>
	//   85  169:invokestatic    #193 <Method Method findResettersForClass(Class)>
	//   86  172:astore_1        
_L4:
		RESETTERS.put(((Object) (class1)), obj);
	//   87  173:getstatic       #45  <Field Map RESETTERS>
	//   88  176:aload_0         
	//   89  177:aload_1         
	//   90  178:invokeinterface #182 <Method Object Map.put(Object, Object)>
	//   91  183:pop             
		return ((Method) (obj));
	//   92  184:aload_1         
	//   93  185:areturn         
_L1:
		if(debug)
	//*  94  186:getstatic       #122 <Field boolean debug>
	//*  95  189:ifeq            200
			Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
	//   96  192:ldc1            #31  <String "ButterKnife">
	//   97  194:ldc1            #184 <String "MISS: Reached framework class. Abandoning search.">
	//   98  196:invokestatic    #130 <Method int Log.d(String, String)>
	//   99  199:pop             
		return NO_OP;
	//  100  200:getstatic       #186 <Field Method NO_OP>
	//  101  203:areturn         
		ClassNotFoundException classnotfoundexception;
		classnotfoundexception;
	//  102  204:astore_1        
		if(true) goto _L6; else goto _L5
_L5:
	//* 103  205:goto            122
	}

	public static void inject(Activity activity)
	{
		inject(((Object) (activity)), ((Object) (activity)), Finder.ACTIVITY);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getstatic       #198 <Field ButterKnife$Finder ButterKnife$Finder.ACTIVITY>
	//    3    5:invokestatic    #201 <Method void inject(Object, Object, ButterKnife$Finder)>
	//    4    8:return          
	}

	public static void inject(Dialog dialog)
	{
		inject(((Object) (dialog)), ((Object) (dialog)), Finder.DIALOG);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getstatic       #205 <Field ButterKnife$Finder ButterKnife$Finder.DIALOG>
	//    3    5:invokestatic    #201 <Method void inject(Object, Object, ButterKnife$Finder)>
	//    4    8:return          
	}

	public static void inject(View view)
	{
		inject(((Object) (view)), ((Object) (view)), Finder.VIEW);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getstatic       #209 <Field ButterKnife$Finder ButterKnife$Finder.VIEW>
	//    3    5:invokestatic    #201 <Method void inject(Object, Object, ButterKnife$Finder)>
	//    4    8:return          
	}

	public static void inject(Object obj, Activity activity)
	{
		inject(obj, ((Object) (activity)), Finder.ACTIVITY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #198 <Field ButterKnife$Finder ButterKnife$Finder.ACTIVITY>
	//    3    5:invokestatic    #201 <Method void inject(Object, Object, ButterKnife$Finder)>
	//    4    8:return          
	}

	public static void inject(Object obj, Dialog dialog)
	{
		inject(obj, ((Object) (dialog)), Finder.DIALOG);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #205 <Field ButterKnife$Finder ButterKnife$Finder.DIALOG>
	//    3    5:invokestatic    #201 <Method void inject(Object, Object, ButterKnife$Finder)>
	//    4    8:return          
	}

	public static void inject(Object obj, View view)
	{
		inject(obj, ((Object) (view)), Finder.VIEW);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #209 <Field ButterKnife$Finder ButterKnife$Finder.VIEW>
	//    3    5:invokestatic    #201 <Method void inject(Object, Object, ButterKnife$Finder)>
	//    4    8:return          
	}

	static void inject(Object obj, Object obj1, Finder finder)
	{
		Object obj2 = ((Object) (obj.getClass()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method Class Object.getClass()>
	//    2    4:astore_3        
		try
		{
			if(debug)
	//*   3    5:getstatic       #122 <Field boolean debug>
	//*   4    8:ifeq            49
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #148 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #149 <Method void StringBuilder()>
	//    8   18:astore          4
				stringbuilder.append("Looking up view injector for ");
	//    9   20:aload           4
	//   10   22:ldc1            #221 <String "Looking up view injector for ">
	//   11   24:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
				stringbuilder.append(((Class) (obj2)).getName());
	//   13   28:aload           4
	//   14   30:aload_3         
	//   15   31:invokevirtual   #136 <Method String Class.getName()>
	//   16   34:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
				Log.d("ButterKnife", stringbuilder.toString());
	//   18   38:ldc1            #31  <String "ButterKnife">
	//   19   40:aload           4
	//   20   42:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   21   45:invokestatic    #130 <Method int Log.d(String, String)>
	//   22   48:pop             
			}
			obj2 = ((Object) (findInjectorForClass(((Class) (obj2)))));
	//   23   49:aload_3         
	//   24   50:invokestatic    #178 <Method Method findInjectorForClass(Class)>
	//   25   53:astore_3        
		}
	//*  26   54:aload_3         
	//*  27   55:ifnull          80
	//*  28   58:aload_3         
	//*  29   59:aconst_null     
	//*  30   60:iconst_3        
	//*  31   61:anewarray       Object[]
	//*  32   64:dup             
	//*  33   65:iconst_0        
	//*  34   66:aload_2         
	//*  35   67:aastore         
	//*  36   68:dup             
	//*  37   69:iconst_1        
	//*  38   70:aload_0         
	//*  39   71:aastore         
	//*  40   72:dup             
	//*  41   73:iconst_2        
	//*  42   74:aload_1         
	//*  43   75:aastore         
	//*  44   76:invokevirtual   #225 <Method Object Method.invoke(Object, Object[])>
	//*  45   79:pop             
	//*  46   80:return          
	//*  47   81:astore_2        
	//*  48   82:aload_2         
	//*  49   83:astore_1        
	//*  50   84:aload_2         
	//*  51   85:instanceof      #227 <Class InvocationTargetException>
	//*  52   88:ifeq            96
	//*  53   91:aload_2         
	//*  54   92:invokevirtual   #233 <Method Throwable Throwable.getCause()>
	//*  55   95:astore_1        
	//*  56   96:new             #148 <Class StringBuilder>
	//*  57   99:dup             
	//*  58  100:invokespecial   #149 <Method void StringBuilder()>
	//*  59  103:astore_2        
	//*  60  104:aload_2         
	//*  61  105:ldc1            #235 <String "Unable to inject views for ">
	//*  62  107:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//*  63  110:pop             
	//*  64  111:aload_2         
	//*  65  112:aload_0         
	//*  66  113:invokevirtual   #238 <Method StringBuilder StringBuilder.append(Object)>
	//*  67  116:pop             
	//*  68  117:new             #214 <Class RuntimeException>
	//*  69  120:dup             
	//*  70  121:aload_2         
	//*  71  122:invokevirtual   #158 <Method String StringBuilder.toString()>
	//*  72  125:aload_1         
	//*  73  126:invokespecial   #241 <Method void RuntimeException(String, Throwable)>
	//*  74  129:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  75  130:astore_0        
		{
			throw obj;
	//   76  131:aload_0         
	//   77  132:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Finder finder)
		{
			obj1 = ((Object) (finder));
			if(finder instanceof InvocationTargetException)
				obj1 = ((Object) (((Throwable) (finder)).getCause()));
			finder = ((Finder) (new StringBuilder()));
			((StringBuilder) (finder)).append("Unable to inject views for ");
			((StringBuilder) (finder)).append(obj);
			throw new RuntimeException(((StringBuilder) (finder)).toString(), ((Throwable) (obj1)));
		}
		if(obj2 == null)
			break MISSING_BLOCK_LABEL_80;
		((Method) (obj2)).invoke(((Object) (null)), new Object[] {
			finder, obj, obj1
		});
	}

	public static void reset(Object obj)
	{
		Object obj1 = ((Object) (obj.getClass()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #219 <Method Class Object.getClass()>
	//    2    4:astore_1        
		try
		{
			if(debug)
	//*   3    5:getstatic       #122 <Field boolean debug>
	//*   4    8:ifeq            45
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    5   11:new             #148 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #149 <Method void StringBuilder()>
	//    8   18:astore_2        
				stringbuilder.append("Looking up view injector for ");
	//    9   19:aload_2         
	//   10   20:ldc1            #221 <String "Looking up view injector for ">
	//   11   22:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
				stringbuilder.append(((Class) (obj1)).getName());
	//   13   26:aload_2         
	//   14   27:aload_1         
	//   15   28:invokevirtual   #136 <Method String Class.getName()>
	//   16   31:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
				Log.d("ButterKnife", stringbuilder.toString());
	//   18   35:ldc1            #31  <String "ButterKnife">
	//   19   37:aload_2         
	//   20   38:invokevirtual   #158 <Method String StringBuilder.toString()>
	//   21   41:invokestatic    #130 <Method int Log.d(String, String)>
	//   22   44:pop             
			}
			obj1 = ((Object) (findResettersForClass(((Class) (obj1)))));
	//   23   45:aload_1         
	//   24   46:invokestatic    #193 <Method Method findResettersForClass(Class)>
	//   25   49:astore_1        
		}
	//*  26   50:aload_1         
	//*  27   51:ifnull          68
	//*  28   54:aload_1         
	//*  29   55:aconst_null     
	//*  30   56:iconst_1        
	//*  31   57:anewarray       Object[]
	//*  32   60:dup             
	//*  33   61:iconst_0        
	//*  34   62:aload_0         
	//*  35   63:aastore         
	//*  36   64:invokevirtual   #225 <Method Object Method.invoke(Object, Object[])>
	//*  37   67:pop             
	//*  38   68:return          
	//*  39   69:astore_2        
	//*  40   70:aload_2         
	//*  41   71:astore_1        
	//*  42   72:aload_2         
	//*  43   73:instanceof      #227 <Class InvocationTargetException>
	//*  44   76:ifeq            84
	//*  45   79:aload_2         
	//*  46   80:invokevirtual   #233 <Method Throwable Throwable.getCause()>
	//*  47   83:astore_1        
	//*  48   84:new             #148 <Class StringBuilder>
	//*  49   87:dup             
	//*  50   88:invokespecial   #149 <Method void StringBuilder()>
	//*  51   91:astore_2        
	//*  52   92:aload_2         
	//*  53   93:ldc1            #243 <String "Unable to reset views for ">
	//*  54   95:invokevirtual   #153 <Method StringBuilder StringBuilder.append(String)>
	//*  55   98:pop             
	//*  56   99:aload_2         
	//*  57  100:aload_0         
	//*  58  101:invokevirtual   #238 <Method StringBuilder StringBuilder.append(Object)>
	//*  59  104:pop             
	//*  60  105:new             #214 <Class RuntimeException>
	//*  61  108:dup             
	//*  62  109:aload_2         
	//*  63  110:invokevirtual   #158 <Method String StringBuilder.toString()>
	//*  64  113:aload_1         
	//*  65  114:invokespecial   #241 <Method void RuntimeException(String, Throwable)>
	//*  66  117:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  67  118:astore_0        
		{
			throw obj;
	//   68  119:aload_0         
	//   69  120:athrow          
		}
		catch(Exception exception)
		{
			Object obj2 = ((Object) (exception));
			if(exception instanceof InvocationTargetException)
				obj2 = ((Object) (((Throwable) (exception)).getCause()));
			StringBuilder stringbuilder1 = new StringBuilder();
			stringbuilder1.append("Unable to reset views for ");
			stringbuilder1.append(obj);
			throw new RuntimeException(stringbuilder1.toString(), ((Throwable) (obj2)));
		}
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_68;
		((Method) (obj1)).invoke(((Object) (null)), new Object[] {
			obj
		});
	}

	public static void setDebug(boolean flag)
	{
		debug = flag;
	//    0    0:iload_0         
	//    1    1:putstatic       #122 <Field boolean debug>
	//    2    4:return          
	}

	static final Map INJECTORS = new LinkedHashMap();
	static final Method NO_OP;
	static final Map RESETTERS = new LinkedHashMap();
	private static final String TAG = "ButterKnife";
	private static boolean debug = false;

	static 
	{
	//    0    0:new             #38  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void LinkedHashMap()>
	//    3    7:putstatic       #43  <Field Map INJECTORS>
	//    4   10:new             #38  <Class LinkedHashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #41  <Method void LinkedHashMap()>
	//    7   17:putstatic       #45  <Field Map RESETTERS>
	//*   8   20:return          
	}
}
