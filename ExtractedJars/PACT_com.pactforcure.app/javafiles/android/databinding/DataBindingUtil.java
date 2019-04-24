// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.app.Activity;
import android.view.*;

// Referenced classes of package android.databinding:
//			DataBinderMapper, ViewDataBinding, DataBindingComponent

public class DataBindingUtil
{

	private DataBindingUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	static ViewDataBinding bind(DataBindingComponent databindingcomponent, View view, int i)
	{
		return sMapper.getDataBinder(databindingcomponent, view, i);
	//    0    0:getstatic       #17  <Field DataBinderMapper sMapper>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #26  <Method ViewDataBinding DataBinderMapper.getDataBinder(DataBindingComponent, View, int)>
	//    5    9:areturn         
	}

	static ViewDataBinding bind(DataBindingComponent databindingcomponent, View aview[], int i)
	{
		return sMapper.getDataBinder(databindingcomponent, aview, i);
	//    0    0:getstatic       #17  <Field DataBinderMapper sMapper>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #31  <Method ViewDataBinding DataBinderMapper.getDataBinder(DataBindingComponent, View[], int)>
	//    5    9:areturn         
	}

	public static ViewDataBinding bind(View view)
	{
		return bind(view, sDefaultComponent);
	//    0    0:aload_0         
	//    1    1:getstatic       #19  <Field DataBindingComponent sDefaultComponent>
	//    2    4:invokestatic    #36  <Method ViewDataBinding bind(View, DataBindingComponent)>
	//    3    7:areturn         
	}

	public static ViewDataBinding bind(View view, DataBindingComponent databindingcomponent)
	{
		Object obj = ((Object) (getBinding(view)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method ViewDataBinding getBinding(View)>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          11
			return ((ViewDataBinding) (obj));
	//    5    9:aload_3         
	//    6   10:areturn         
		obj = view.getTag();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #46  <Method Object View.getTag()>
	//    9   15:astore_3        
		if(!(obj instanceof String))
	//*  10   16:aload_3         
	//*  11   17:instanceof      #48  <Class String>
	//*  12   20:ifne            33
			throw new IllegalArgumentException("View is not a binding layout");
	//   13   23:new             #50  <Class IllegalArgumentException>
	//   14   26:dup             
	//   15   27:ldc1            #52  <String "View is not a binding layout">
	//   16   29:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//   17   32:athrow          
		obj = ((Object) ((String)obj));
	//   18   33:aload_3         
	//   19   34:checkcast       #48  <Class String>
	//   20   37:astore_3        
		int i = sMapper.getLayoutId(((String) (obj)));
	//   21   38:getstatic       #17  <Field DataBinderMapper sMapper>
	//   22   41:aload_3         
	//   23   42:invokevirtual   #59  <Method int DataBinderMapper.getLayoutId(String)>
	//   24   45:istore_2        
		if(i == 0)
	//*  25   46:iload_2         
	//*  26   47:ifne            60
			throw new IllegalArgumentException("View is not a binding layout");
	//   27   50:new             #50  <Class IllegalArgumentException>
	//   28   53:dup             
	//   29   54:ldc1            #52  <String "View is not a binding layout">
	//   30   56:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//   31   59:athrow          
		else
			return sMapper.getDataBinder(databindingcomponent, view, i);
	//   32   60:getstatic       #17  <Field DataBinderMapper sMapper>
	//   33   63:aload_1         
	//   34   64:aload_0         
	//   35   65:iload_2         
	//   36   66:invokevirtual   #26  <Method ViewDataBinding DataBinderMapper.getDataBinder(DataBindingComponent, View, int)>
	//   37   69:areturn         
	}

	private static ViewDataBinding bindToAddedViews(DataBindingComponent databindingcomponent, ViewGroup viewgroup, int i, int j)
	{
		int k = viewgroup.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #68  <Method int ViewGroup.getChildCount()>
	//    2    4:istore          4
		int i1 = k - i;
	//    3    6:iload           4
	//    4    8:iload_2         
	//    5    9:isub            
	//    6   10:istore          5
		if(i1 == 1)
	//*   7   12:iload           5
	//*   8   14:iconst_1        
	//*   9   15:icmpne          32
			return bind(databindingcomponent, viewgroup.getChildAt(k - 1), j);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:iload           4
	//   13   22:iconst_1        
	//   14   23:isub            
	//   15   24:invokevirtual   #72  <Method View ViewGroup.getChildAt(int)>
	//   16   27:iload_3         
	//   17   28:invokestatic    #74  <Method ViewDataBinding bind(DataBindingComponent, View, int)>
	//   18   31:areturn         
		View aview[] = new View[i1];
	//   19   32:iload           5
	//   20   34:anewarray       View[]
	//   21   37:astore          6
		for(int l = 0; l < i1; l++)
	//*  22   39:iconst_0        
	//*  23   40:istore          4
	//*  24   42:iload           4
	//*  25   44:iload           5
	//*  26   46:icmpge          71
			aview[l] = viewgroup.getChildAt(l + i);
	//   27   49:aload           6
	//   28   51:iload           4
	//   29   53:aload_1         
	//   30   54:iload           4
	//   31   56:iload_2         
	//   32   57:iadd            
	//   33   58:invokevirtual   #72  <Method View ViewGroup.getChildAt(int)>
	//   34   61:aastore         

	//   35   62:iload           4
	//   36   64:iconst_1        
	//   37   65:iadd            
	//   38   66:istore          4
	//*  39   68:goto            42
		return bind(databindingcomponent, aview, j);
	//   40   71:aload_0         
	//   41   72:aload           6
	//   42   74:iload_3         
	//   43   75:invokestatic    #76  <Method ViewDataBinding bind(DataBindingComponent, View[], int)>
	//   44   78:areturn         
	}

	public static String convertBrIdToString(int i)
	{
		return sMapper.convertBrIdToString(i);
	//    0    0:getstatic       #17  <Field DataBinderMapper sMapper>
	//    1    3:iload_0         
	//    2    4:invokevirtual   #81  <Method String DataBinderMapper.convertBrIdToString(int)>
	//    3    7:areturn         
	}

	public static ViewDataBinding findBinding(View view)
	{
_L8:
		Object obj;
		if(view == null)
			break; /* Loop/switch isn't completed */
	//    0    0:aload_0         
	//    1    1:ifnull          171
		obj = ((Object) (ViewDataBinding.getBinding(view)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #85  <Method ViewDataBinding ViewDataBinding.getBinding(View)>
	//    4    8:astore          5
		if(obj != null)
	//*   5   10:aload           5
	//*   6   12:ifnull          18
			return ((ViewDataBinding) (obj));
	//    7   15:aload           5
	//    8   17:areturn         
		obj = view.getTag();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #46  <Method Object View.getTag()>
	//   11   22:astore          5
		if(!(obj instanceof String)) goto _L2; else goto _L1
	//   12   24:aload           5
	//   13   26:instanceof      #48  <Class String>
	//   14   29:ifeq            146
_L1:
		obj = ((Object) ((String)obj));
	//   15   32:aload           5
	//   16   34:checkcast       #48  <Class String>
	//   17   37:astore          5
		if(!((String) (obj)).startsWith("layout") || !((String) (obj)).endsWith("_0")) goto _L2; else goto _L3
	//   18   39:aload           5
	//   19   41:ldc1            #87  <String "layout">
	//   20   43:invokevirtual   #91  <Method boolean String.startsWith(String)>
	//   21   46:ifeq            146
	//   22   49:aload           5
	//   23   51:ldc1            #93  <String "_0">
	//   24   53:invokevirtual   #96  <Method boolean String.endsWith(String)>
	//   25   56:ifeq            146
_L3:
		boolean flag1;
		char c;
		int i;
		c = ((String) (obj)).charAt(6);
	//   26   59:aload           5
	//   27   61:bipush          6
	//   28   63:invokevirtual   #100 <Method char String.charAt(int)>
	//   29   66:istore_3        
		i = ((String) (obj)).indexOf('/', 7);
	//   30   67:aload           5
	//   31   69:bipush          47
	//   32   71:bipush          7
	//   33   73:invokevirtual   #104 <Method int String.indexOf(int, int)>
	//   34   76:istore          4
		flag1 = false;
	//   35   78:iconst_0        
	//   36   79:istore_2        
		if(c != '/') goto _L5; else goto _L4
	//   37   80:iload_3         
	//   38   81:bipush          47
	//   39   83:icmpne          105
_L4:
		boolean flag;
		if(i == -1)
	//*  40   86:iload           4
	//*  41   88:iconst_m1       
	//*  42   89:icmpne          100
			flag = true;
	//   43   92:iconst_1        
	//   44   93:istore_1        
		else
	//*  45   94:iload_1         
	//*  46   95:ifeq            146
	//*  47   98:aconst_null     
	//*  48   99:areturn         
			flag = false;
	//   49  100:iconst_0        
	//   50  101:istore_1        
_L6:
		if(flag)
			return null;
		break; /* Loop/switch isn't completed */
	//*  51  102:goto            94
_L5:
		flag = flag1;
	//   52  105:iload_2         
	//   53  106:istore_1        
		if(c == '-')
	//*  54  107:iload_3         
	//*  55  108:bipush          45
	//*  56  110:icmpne          94
		{
			flag = flag1;
	//   57  113:iload_2         
	//   58  114:istore_1        
			if(i != -1)
	//*  59  115:iload           4
	//*  60  117:iconst_m1       
	//*  61  118:icmpeq          94
				if(((String) (obj)).indexOf('/', i + 1) == -1)
	//*  62  121:aload           5
	//*  63  123:bipush          47
	//*  64  125:iload           4
	//*  65  127:iconst_1        
	//*  66  128:iadd            
	//*  67  129:invokevirtual   #104 <Method int String.indexOf(int, int)>
	//*  68  132:iconst_m1       
	//*  69  133:icmpne          141
					flag = true;
	//   70  136:iconst_1        
	//   71  137:istore_1        
				else
	//*  72  138:goto            94
					flag = false;
	//   73  141:iconst_0        
	//   74  142:istore_1        
		}
		if(true) goto _L6; else goto _L2
	//   75  143:goto            138
_L2:
		view = ((View) (view.getParent()));
	//   76  146:aload_0         
	//   77  147:invokevirtual   #108 <Method android.view.ViewParent View.getParent()>
	//   78  150:astore_0        
		if(view instanceof View)
	//*  79  151:aload_0         
	//*  80  152:instanceof      #42  <Class View>
	//*  81  155:ifeq            166
			view = (View)view;
	//   82  158:aload_0         
	//   83  159:checkcast       #42  <Class View>
	//   84  162:astore_0        
		else
	//*  85  163:goto            0
			view = null;
	//   86  166:aconst_null     
	//   87  167:astore_0        
		if(true) goto _L8; else goto _L7
	//   88  168:goto            0
_L7:
		return null;
	//   89  171:aconst_null     
	//   90  172:areturn         
	}

	public static ViewDataBinding getBinding(View view)
	{
		return ViewDataBinding.getBinding(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #85  <Method ViewDataBinding ViewDataBinding.getBinding(View)>
	//    2    4:areturn         
	}

	public static DataBindingComponent getDefaultComponent()
	{
		return sDefaultComponent;
	//    0    0:getstatic       #19  <Field DataBindingComponent sDefaultComponent>
	//    1    3:areturn         
	}

	public static ViewDataBinding inflate(LayoutInflater layoutinflater, int i, ViewGroup viewgroup, boolean flag)
	{
		return inflate(layoutinflater, i, viewgroup, flag, sDefaultComponent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:getstatic       #19  <Field DataBindingComponent sDefaultComponent>
	//    5    7:invokestatic    #116 <Method ViewDataBinding inflate(LayoutInflater, int, ViewGroup, boolean, DataBindingComponent)>
	//    6   10:areturn         
	}

	public static ViewDataBinding inflate(LayoutInflater layoutinflater, int i, ViewGroup viewgroup, boolean flag, DataBindingComponent databindingcomponent)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          6
		boolean flag1;
		if(viewgroup != null && flag)
	//*   2    3:aload_2         
	//*   3    4:ifnull          48
	//*   4    7:iload_3         
	//*   5    8:ifeq            48
			flag1 = true;
	//    6   11:iconst_1        
	//    7   12:istore          5
		else
	//*   8   14:iload           5
	//*   9   16:ifeq            25
	//*  10   19:aload_2         
	//*  11   20:invokevirtual   #68  <Method int ViewGroup.getChildCount()>
	//*  12   23:istore          6
	//*  13   25:aload_0         
	//*  14   26:iload_1         
	//*  15   27:aload_2         
	//*  16   28:iload_3         
	//*  17   29:invokevirtual   #123 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//*  18   32:astore_0        
	//*  19   33:iload           5
	//*  20   35:ifeq            54
	//*  21   38:aload           4
	//*  22   40:aload_2         
	//*  23   41:iload           6
	//*  24   43:iload_1         
	//*  25   44:invokestatic    #125 <Method ViewDataBinding bindToAddedViews(DataBindingComponent, ViewGroup, int, int)>
	//*  26   47:areturn         
			flag1 = false;
	//   27   48:iconst_0        
	//   28   49:istore          5
		if(flag1)
			j = viewgroup.getChildCount();
		layoutinflater = ((LayoutInflater) (layoutinflater.inflate(i, viewgroup, flag)));
		if(flag1)
			return bindToAddedViews(databindingcomponent, viewgroup, j, i);
		else
	//*  29   51:goto            14
			return bind(databindingcomponent, ((View) (layoutinflater)), i);
	//   30   54:aload           4
	//   31   56:aload_0         
	//   32   57:iload_1         
	//   33   58:invokestatic    #74  <Method ViewDataBinding bind(DataBindingComponent, View, int)>
	//   34   61:areturn         
	}

	public static ViewDataBinding setContentView(Activity activity, int i)
	{
		return setContentView(activity, i, sDefaultComponent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:getstatic       #19  <Field DataBindingComponent sDefaultComponent>
	//    3    5:invokestatic    #131 <Method ViewDataBinding setContentView(Activity, int, DataBindingComponent)>
	//    4    8:areturn         
	}

	public static ViewDataBinding setContentView(Activity activity, int i, DataBindingComponent databindingcomponent)
	{
		activity.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #137 <Method void Activity.setContentView(int)>
		return bindToAddedViews(databindingcomponent, (ViewGroup)activity.getWindow().getDecorView().findViewById(0x1020002), 0, i);
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #141 <Method Window Activity.getWindow()>
	//    6   10:invokevirtual   #147 <Method View Window.getDecorView()>
	//    7   13:ldc1            #148 <Int 0x1020002>
	//    8   15:invokevirtual   #151 <Method View View.findViewById(int)>
	//    9   18:checkcast       #64  <Class ViewGroup>
	//   10   21:iconst_0        
	//   11   22:iload_1         
	//   12   23:invokestatic    #125 <Method ViewDataBinding bindToAddedViews(DataBindingComponent, ViewGroup, int, int)>
	//   13   26:areturn         
	}

	public static void setDefaultComponent(DataBindingComponent databindingcomponent)
	{
		sDefaultComponent = databindingcomponent;
	//    0    0:aload_0         
	//    1    1:putstatic       #19  <Field DataBindingComponent sDefaultComponent>
	//    2    4:return          
	}

	private static DataBindingComponent sDefaultComponent = null;
	private static DataBinderMapper sMapper = new DataBinderMapper();

	static 
	{
	//    0    0:new             #12  <Class DataBinderMapper>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void DataBinderMapper()>
	//    3    7:putstatic       #17  <Field DataBinderMapper sMapper>
	//    4   10:aconst_null     
	//    5   11:putstatic       #19  <Field DataBindingComponent sDefaultComponent>
	//*   6   14:return          
	}
}
