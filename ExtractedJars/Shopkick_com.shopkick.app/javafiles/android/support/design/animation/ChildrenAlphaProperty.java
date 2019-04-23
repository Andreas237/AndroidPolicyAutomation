// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.animation;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

public class ChildrenAlphaProperty extends Property
{

	private ChildrenAlphaProperty(String s)
	{
		super(java/lang/Float, s);
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <Class Float>
	//    2    3:aload_1         
	//    3    4:invokespecial   #23  <Method void Property(Class, String)>
	//    4    7:return          
	}

	public Float get(ViewGroup viewgroup)
	{
		viewgroup = ((ViewGroup) ((Float)viewgroup.getTag(android.support.design.R.id.mtrl_internal_children_alpha_tag)));
	//    0    0:aload_1         
	//    1    1:getstatic       #31  <Field int android.support.design.R$id.mtrl_internal_children_alpha_tag>
	//    2    4:invokevirtual   #37  <Method Object ViewGroup.getTag(int)>
	//    3    7:checkcast       #20  <Class Float>
	//    4   10:astore_1        
		if(viewgroup != null)
	//*   5   11:aload_1         
	//*   6   12:ifnull          17
			return ((Float) (viewgroup));
	//    7   15:aload_1         
	//    8   16:areturn         
		else
			return Float.valueOf(1.0F);
	//    9   17:fconst_1        
	//   10   18:invokestatic    #41  <Method Float Float.valueOf(float)>
	//   11   21:areturn         
	}

	public volatile Object get(Object obj)
	{
		return ((Object) (get((ViewGroup)obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class ViewGroup>
	//    3    5:invokevirtual   #44  <Method Float get(ViewGroup)>
	//    4    8:areturn         
	}

	public void set(ViewGroup viewgroup, Float float1)
	{
		float f = float1.floatValue();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #50  <Method float Float.floatValue()>
	//    2    4:fstore_3        
		viewgroup.setTag(android.support.design.R.id.mtrl_internal_children_alpha_tag, ((Object) (Float.valueOf(f))));
	//    3    5:aload_1         
	//    4    6:getstatic       #31  <Field int android.support.design.R$id.mtrl_internal_children_alpha_tag>
	//    5    9:fload_3         
	//    6   10:invokestatic    #41  <Method Float Float.valueOf(float)>
	//    7   13:invokevirtual   #54  <Method void ViewGroup.setTag(int, Object)>
		int j = viewgroup.getChildCount();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #58  <Method int ViewGroup.getChildCount()>
	//   10   20:istore          5
		for(int i = 0; i < j; i++)
	//*  11   22:iconst_0        
	//*  12   23:istore          4
	//*  13   25:iload           4
	//*  14   27:iload           5
	//*  15   29:icmpge          51
			viewgroup.getChildAt(i).setAlpha(f);
	//   16   32:aload_1         
	//   17   33:iload           4
	//   18   35:invokevirtual   #62  <Method View ViewGroup.getChildAt(int)>
	//   19   38:fload_3         
	//   20   39:invokevirtual   #68  <Method void View.setAlpha(float)>

	//   21   42:iload           4
	//   22   44:iconst_1        
	//   23   45:iadd            
	//   24   46:istore          4
	//*  25   48:goto            25
	//   26   51:return          
	}

	public volatile void set(Object obj, Object obj1)
	{
		set((ViewGroup)obj, (Float)obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #33  <Class ViewGroup>
	//    3    5:aload_2         
	//    4    6:checkcast       #20  <Class Float>
	//    5    9:invokevirtual   #71  <Method void set(ViewGroup, Float)>
	//    6   12:return          
	}

	public static final Property CHILDREN_ALPHA = new ChildrenAlphaProperty("childrenAlpha");

	static 
	{
	//    0    0:new             #2   <Class ChildrenAlphaProperty>
	//    1    3:dup             
	//    2    4:ldc1            #11  <String "childrenAlpha">
	//    3    6:invokespecial   #15  <Method void ChildrenAlphaProperty(String)>
	//    4    9:putstatic       #17  <Field Property CHILDREN_ALPHA>
	//*   5   12:return          
	}
}
