// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package uk.co.chrisjenx.calligraphy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package uk.co.chrisjenx.calligraphy:
//			CalligraphyConfig, CalligraphyLayoutInflater, CalligraphyActivityFactory

public class CalligraphyContextWrapper extends ContextWrapper
{

	CalligraphyContextWrapper(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ContextWrapper(Context)>
		mAttributeId = CalligraphyConfig.get().getAttrId();
	//    3    5:aload_0         
	//    4    6:invokestatic    #18  <Method CalligraphyConfig CalligraphyConfig.get()>
	//    5    9:invokevirtual   #22  <Method int CalligraphyConfig.getAttrId()>
	//    6   12:putfield        #24  <Field int mAttributeId>
	//    7   15:return          
	}

	public CalligraphyContextWrapper(Context context, int i)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ContextWrapper(Context)>
		mAttributeId = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #24  <Field int mAttributeId>
	//    6   10:return          
	}

	static CalligraphyActivityFactory get(Activity activity)
	{
		if(!(activity.getLayoutInflater() instanceof CalligraphyLayoutInflater))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #35  <Method LayoutInflater Activity.getLayoutInflater()>
	//*   2    4:instanceof      #37  <Class CalligraphyLayoutInflater>
	//*   3    7:ifne            20
			throw new RuntimeException("This activity does not wrap the Base Context! See CalligraphyContextWrapper.wrap(Context)");
	//    4   10:new             #39  <Class RuntimeException>
	//    5   13:dup             
	//    6   14:ldc1            #41  <String "This activity does not wrap the Base Context! See CalligraphyContextWrapper.wrap(Context)">
	//    7   16:invokespecial   #44  <Method void RuntimeException(String)>
	//    8   19:athrow          
		else
			return (CalligraphyActivityFactory)activity.getLayoutInflater();
	//    9   20:aload_0         
	//   10   21:invokevirtual   #35  <Method LayoutInflater Activity.getLayoutInflater()>
	//   11   24:checkcast       #46  <Class CalligraphyActivityFactory>
	//   12   27:areturn         
	}

	public static View onActivityCreateView(Activity activity, View view, View view1, String s, Context context, AttributeSet attributeset)
	{
		return get(activity).onActivityCreateView(view, view1, s, context, attributeset);
	//    0    0:aload_0         
	//    1    1:invokestatic    #50  <Method CalligraphyActivityFactory get(Activity)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:invokeinterface #53  <Method View CalligraphyActivityFactory.onActivityCreateView(View, View, String, Context, AttributeSet)>
	//    8   16:areturn         
	}

	public static ContextWrapper wrap(Context context)
	{
		return ((ContextWrapper) (new CalligraphyContextWrapper(context)));
	//    0    0:new             #2   <Class CalligraphyContextWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #56  <Method void CalligraphyContextWrapper(Context)>
	//    4    8:areturn         
	}

	public Object getSystemService(String s)
	{
		if("layout_inflater".equals(((Object) (s))))
	//*   0    0:ldc1            #60  <String "layout_inflater">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #66  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            45
		{
			if(mInflater == null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #68  <Field CalligraphyLayoutInflater mInflater>
	//*   6   13:ifnonnull       40
				mInflater = new CalligraphyLayoutInflater(LayoutInflater.from(getBaseContext()), ((Context) (this)), mAttributeId, false);
	//    7   16:aload_0         
	//    8   17:new             #37  <Class CalligraphyLayoutInflater>
	//    9   20:dup             
	//   10   21:aload_0         
	//   11   22:invokevirtual   #72  <Method Context getBaseContext()>
	//   12   25:invokestatic    #78  <Method LayoutInflater LayoutInflater.from(Context)>
	//   13   28:aload_0         
	//   14   29:aload_0         
	//   15   30:getfield        #24  <Field int mAttributeId>
	//   16   33:iconst_0        
	//   17   34:invokespecial   #81  <Method void CalligraphyLayoutInflater(LayoutInflater, Context, int, boolean)>
	//   18   37:putfield        #68  <Field CalligraphyLayoutInflater mInflater>
			return ((Object) (mInflater));
	//   19   40:aload_0         
	//   20   41:getfield        #68  <Field CalligraphyLayoutInflater mInflater>
	//   21   44:areturn         
		} else
		{
			return super.getSystemService(s);
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:invokespecial   #83  <Method Object ContextWrapper.getSystemService(String)>
	//   25   50:areturn         
		}
	}

	private final int mAttributeId;
	private CalligraphyLayoutInflater mInflater;
}
