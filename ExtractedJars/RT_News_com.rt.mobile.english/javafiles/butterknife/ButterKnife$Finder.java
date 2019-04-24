// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import java.util.List;

// Referenced classes of package butterknife:
//			ButterKnife, ImmutableViewList

public static abstract class ButterKnife$Finder extends Enum
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

	public static ButterKnife$Finder valueOf(String s)
	{
		return (ButterKnife$Finder)Enum.valueOf(butterknife/ButterKnife$Finder, s);
	//    0    0:ldc1            #2   <Class ButterKnife$Finder>
	//    1    2:aload_0         
	//    2    3:invokestatic    #60  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ButterKnife$Finder>
	//    4    9:areturn         
	}

	public static ButterKnife$Finder[] values()
	{
		return (ButterKnife$Finder[])((ButterKnife$Finder []) ($VALUES)).clone();
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

	private static final ButterKnife$Finder $VALUES[];
	public static final ButterKnife$Finder ACTIVITY;
	public static final ButterKnife$Finder DIALOG;
	public static final ButterKnife$Finder VIEW;

	static 
	{
		VIEW = ((ButterKnife$Finder) (new ButterKnife.Finder("VIEW", 0) {

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
		ACTIVITY = ((ButterKnife$Finder) (new ButterKnife.Finder("ACTIVITY", 1) {

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
		DIALOG = ((ButterKnife$Finder) (new ButterKnife.Finder("DIALOG", 2) {

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
		$VALUES = (new ButterKnife$Finder[] {
			VIEW, ACTIVITY, DIALOG
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       ButterKnife$Finder[]
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

	private ButterKnife$Finder(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}

	ButterKnife$Finder(String s, int i, ButterKnife._cls1 _pcls1)
	{
		this(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #44  <Method void ButterKnife$Finder(String, int)>
	//    4    6:return          
	}
}
