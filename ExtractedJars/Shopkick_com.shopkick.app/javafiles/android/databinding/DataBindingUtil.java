// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding;

import android.app.Activity;
import android.view.*;

// Referenced classes of package android.databinding:
//			DataBinderMapperImpl, DataBinderMapper, ViewDataBinding, DataBindingComponent

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
	//    4    6:invokevirtual   #28  <Method ViewDataBinding DataBinderMapper.getDataBinder(DataBindingComponent, View, int)>
	//    5    9:areturn         
	}

	static ViewDataBinding bind(DataBindingComponent databindingcomponent, View aview[], int i)
	{
		return sMapper.getDataBinder(databindingcomponent, aview, i);
	//    0    0:getstatic       #17  <Field DataBinderMapper sMapper>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #33  <Method ViewDataBinding DataBinderMapper.getDataBinder(DataBindingComponent, View[], int)>
	//    5    9:areturn         
	}

	public static ViewDataBinding bind(View view)
	{
		return bind(view, sDefaultComponent);
	//    0    0:aload_0         
	//    1    1:getstatic       #19  <Field DataBindingComponent sDefaultComponent>
	//    2    4:invokestatic    #40  <Method ViewDataBinding bind(View, DataBindingComponent)>
	//    3    7:areturn         
	}

	public static ViewDataBinding bind(View view, DataBindingComponent databindingcomponent)
	{
		Object obj = ((Object) (getBinding(view)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #46  <Method ViewDataBinding getBinding(View)>
	//    2    4:astore_3        
		if(obj != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          11
			return ((ViewDataBinding) (obj));
	//    5    9:aload_3         
	//    6   10:areturn         
		obj = view.getTag();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #52  <Method Object View.getTag()>
	//    9   15:astore_3        
		if(obj instanceof String)
	//*  10   16:aload_3         
	//*  11   17:instanceof      #54  <Class String>
	//*  12   20:ifeq            85
		{
			String s = (String)obj;
	//   13   23:aload_3         
	//   14   24:checkcast       #54  <Class String>
	//   15   27:astore          4
			int i = sMapper.getLayoutId(s);
	//   16   29:getstatic       #17  <Field DataBinderMapper sMapper>
	//   17   32:aload           4
	//   18   34:invokevirtual   #58  <Method int DataBinderMapper.getLayoutId(String)>
	//   19   37:istore_2        
			if(i != 0)
	//*  20   38:iload_2         
	//*  21   39:ifeq            52
			{
				return sMapper.getDataBinder(databindingcomponent, view, i);
	//   22   42:getstatic       #17  <Field DataBinderMapper sMapper>
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:iload_2         
	//   26   48:invokevirtual   #28  <Method ViewDataBinding DataBinderMapper.getDataBinder(DataBindingComponent, View, int)>
	//   27   51:areturn         
			} else
			{
				view = ((View) (new StringBuilder()));
	//   28   52:new             #60  <Class StringBuilder>
	//   29   55:dup             
	//   30   56:invokespecial   #61  <Method void StringBuilder()>
	//   31   59:astore_0        
				((StringBuilder) (view)).append("View is not a binding layout. Tag: ");
	//   32   60:aload_0         
	//   33   61:ldc1            #63  <String "View is not a binding layout. Tag: ">
	//   34   63:invokevirtual   #67  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
				((StringBuilder) (view)).append(obj);
	//   36   67:aload_0         
	//   37   68:aload_3         
	//   38   69:invokevirtual   #70  <Method StringBuilder StringBuilder.append(Object)>
	//   39   72:pop             
				throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   40   73:new             #72  <Class IllegalArgumentException>
	//   41   76:dup             
	//   42   77:aload_0         
	//   43   78:invokevirtual   #76  <Method String StringBuilder.toString()>
	//   44   81:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//   45   84:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("View is not a binding layout");
	//   46   85:new             #72  <Class IllegalArgumentException>
	//   47   88:dup             
	//   48   89:ldc1            #81  <String "View is not a binding layout">
	//   49   91:invokespecial   #79  <Method void IllegalArgumentException(String)>
	//   50   94:athrow          
		}
	}

	private static ViewDataBinding bindToAddedViews(DataBindingComponent databindingcomponent, ViewGroup viewgroup, int i, int j)
	{
		int k = viewgroup.getChildCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #90  <Method int ViewGroup.getChildCount()>
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
	//   15   24:invokevirtual   #94  <Method View ViewGroup.getChildAt(int)>
	//   16   27:iload_3         
	//   17   28:invokestatic    #96  <Method ViewDataBinding bind(DataBindingComponent, View, int)>
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
	//   33   58:invokevirtual   #94  <Method View ViewGroup.getChildAt(int)>
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
	//   43   75:invokestatic    #98  <Method ViewDataBinding bind(DataBindingComponent, View[], int)>
	//   44   78:areturn         
	}

	public static String convertBrIdToString(int i)
	{
		return sMapper.convertBrIdToString(i);
	//    0    0:getstatic       #17  <Field DataBinderMapper sMapper>
	//    1    3:iload_0         
	//    2    4:invokevirtual   #103 <Method String DataBinderMapper.convertBrIdToString(int)>
	//    3    7:areturn         
	}

	public static ViewDataBinding findBinding(View view)
	{
		while(view != null) 
	//*   0    0:aload_0         
	//*   1    1:ifnull          165
		{
			Object obj = ((Object) (ViewDataBinding.getBinding(view)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #107 <Method ViewDataBinding ViewDataBinding.getBinding(View)>
	//    4    8:astore          5
			if(obj != null)
	//*   5   10:aload           5
	//*   6   12:ifnull          18
				return ((ViewDataBinding) (obj));
	//    7   15:aload           5
	//    8   17:areturn         
			obj = view.getTag();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #52  <Method Object View.getTag()>
	//   11   22:astore          5
			if(obj instanceof String)
	//*  12   24:aload           5
	//*  13   26:instanceof      #54  <Class String>
	//*  14   29:ifeq            140
			{
				obj = ((Object) ((String)obj));
	//   15   32:aload           5
	//   16   34:checkcast       #54  <Class String>
	//   17   37:astore          5
				if(((String) (obj)).startsWith("layout") && ((String) (obj)).endsWith("_0"))
	//*  18   39:aload           5
	//*  19   41:ldc1            #109 <String "layout">
	//*  20   43:invokevirtual   #113 <Method boolean String.startsWith(String)>
	//*  21   46:ifeq            140
	//*  22   49:aload           5
	//*  23   51:ldc1            #115 <String "_0">
	//*  24   53:invokevirtual   #118 <Method boolean String.endsWith(String)>
	//*  25   56:ifeq            140
				{
					char c = ((String) (obj)).charAt(6);
	//   26   59:aload           5
	//   27   61:bipush          6
	//   28   63:invokevirtual   #122 <Method char String.charAt(int)>
	//   29   66:istore_3        
					int i = ((String) (obj)).indexOf('/', 7);
	//   30   67:aload           5
	//   31   69:bipush          47
	//   32   71:bipush          7
	//   33   73:invokevirtual   #126 <Method int String.indexOf(int, int)>
	//   34   76:istore          4
					boolean flag1 = false;
	//   35   78:iconst_0        
	//   36   79:istore_2        
					boolean flag;
					if(c == '/')
	//*  37   80:iload_3         
	//*  38   81:bipush          47
	//*  39   83:icmpne          99
					{
						flag = flag1;
	//   40   86:iload_2         
	//   41   87:istore_1        
						if(i == -1)
	//*  42   88:iload           4
	//*  43   90:iconst_m1       
	//*  44   91:icmpne          134
							flag = true;
	//   45   94:iconst_1        
	//   46   95:istore_1        
					} else
	//*  47   96:goto            134
					{
						flag = flag1;
	//   48   99:iload_2         
	//   49  100:istore_1        
						if(c == '-')
	//*  50  101:iload_3         
	//*  51  102:bipush          45
	//*  52  104:icmpne          134
						{
							flag = flag1;
	//   53  107:iload_2         
	//   54  108:istore_1        
							if(i != -1)
	//*  55  109:iload           4
	//*  56  111:iconst_m1       
	//*  57  112:icmpeq          134
							{
								flag = flag1;
	//   58  115:iload_2         
	//   59  116:istore_1        
								if(((String) (obj)).indexOf('/', i + 1) == -1)
	//*  60  117:aload           5
	//*  61  119:bipush          47
	//*  62  121:iload           4
	//*  63  123:iconst_1        
	//*  64  124:iadd            
	//*  65  125:invokevirtual   #126 <Method int String.indexOf(int, int)>
	//*  66  128:iconst_m1       
	//*  67  129:icmpne          134
									flag = true;
	//   68  132:iconst_1        
	//   69  133:istore_1        
							}
						}
					}
					if(flag)
	//*  70  134:iload_1         
	//*  71  135:ifeq            140
						return null;
	//   72  138:aconst_null     
	//   73  139:areturn         
				}
			}
			view = ((View) (view.getParent()));
	//   74  140:aload_0         
	//   75  141:invokevirtual   #130 <Method android.view.ViewParent View.getParent()>
	//   76  144:astore_0        
			if(view instanceof View)
	//*  77  145:aload_0         
	//*  78  146:instanceof      #48  <Class View>
	//*  79  149:ifeq            160
				view = (View)view;
	//   80  152:aload_0         
	//   81  153:checkcast       #48  <Class View>
	//   82  156:astore_0        
			else
	//*  83  157:goto            0
				view = null;
	//   84  160:aconst_null     
	//   85  161:astore_0        
		}
	//*  86  162:goto            0
		return null;
	//   87  165:aconst_null     
	//   88  166:areturn         
	}

	public static ViewDataBinding getBinding(View view)
	{
		return ViewDataBinding.getBinding(view);
	//    0    0:aload_0         
	//    1    1:invokestatic    #107 <Method ViewDataBinding ViewDataBinding.getBinding(View)>
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
	//    5    7:invokestatic    #137 <Method ViewDataBinding inflate(LayoutInflater, int, ViewGroup, boolean, DataBindingComponent)>
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
	//*   3    4:ifnull          17
	//*   4    7:iload_3         
	//*   5    8:ifeq            17
			flag1 = true;
	//    6   11:iconst_1        
	//    7   12:istore          5
		else
	//*   8   14:goto            20
			flag1 = false;
	//    9   17:iconst_0        
	//   10   18:istore          5
		if(flag1)
	//*  11   20:iload           5
	//*  12   22:ifeq            31
			j = viewgroup.getChildCount();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #90  <Method int ViewGroup.getChildCount()>
	//   15   29:istore          6
		layoutinflater = ((LayoutInflater) (layoutinflater.inflate(i, viewgroup, flag)));
	//   16   31:aload_0         
	//   17   32:iload_1         
	//   18   33:aload_2         
	//   19   34:iload_3         
	//   20   35:invokevirtual   #143 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   21   38:astore_0        
		if(flag1)
	//*  22   39:iload           5
	//*  23   41:ifeq            54
			return bindToAddedViews(databindingcomponent, viewgroup, j, i);
	//   24   44:aload           4
	//   25   46:aload_2         
	//   26   47:iload           6
	//   27   49:iload_1         
	//   28   50:invokestatic    #145 <Method ViewDataBinding bindToAddedViews(DataBindingComponent, ViewGroup, int, int)>
	//   29   53:areturn         
		else
			return bind(databindingcomponent, ((View) (layoutinflater)), i);
	//   30   54:aload           4
	//   31   56:aload_0         
	//   32   57:iload_1         
	//   33   58:invokestatic    #96  <Method ViewDataBinding bind(DataBindingComponent, View, int)>
	//   34   61:areturn         
	}

	public static ViewDataBinding setContentView(Activity activity, int i)
	{
		return setContentView(activity, i, sDefaultComponent);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:getstatic       #19  <Field DataBindingComponent sDefaultComponent>
	//    3    5:invokestatic    #151 <Method ViewDataBinding setContentView(Activity, int, DataBindingComponent)>
	//    4    8:areturn         
	}

	public static ViewDataBinding setContentView(Activity activity, int i, DataBindingComponent databindingcomponent)
	{
		activity.setContentView(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #157 <Method void Activity.setContentView(int)>
		return bindToAddedViews(databindingcomponent, (ViewGroup)activity.getWindow().getDecorView().findViewById(0x1020002), 0, i);
	//    3    5:aload_2         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #161 <Method Window Activity.getWindow()>
	//    6   10:invokevirtual   #167 <Method View Window.getDecorView()>
	//    7   13:ldc1            #168 <Int 0x1020002>
	//    8   15:invokevirtual   #171 <Method View View.findViewById(int)>
	//    9   18:checkcast       #86  <Class ViewGroup>
	//   10   21:iconst_0        
	//   11   22:iload_1         
	//   12   23:invokestatic    #145 <Method ViewDataBinding bindToAddedViews(DataBindingComponent, ViewGroup, int, int)>
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
	private static DataBinderMapper sMapper = new DataBinderMapperImpl();

	static 
	{
	//    0    0:new             #12  <Class DataBinderMapperImpl>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void DataBinderMapperImpl()>
	//    3    7:putstatic       #17  <Field DataBinderMapper sMapper>
	//    4   10:aconst_null     
	//    5   11:putstatic       #19  <Field DataBindingComponent sDefaultComponent>
	//*   6   14:return          
	}
}
