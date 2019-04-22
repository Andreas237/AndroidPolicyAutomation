// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.addupc;

import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.addupc:
//			AddUpcActivity

public class AddUpcActivity_ViewBinding
	implements Unbinder
{

	public AddUpcActivity_ViewBinding(AddUpcActivity addupcactivity)
	{
		this(addupcactivity, addupcactivity.getWindow().getDecorView());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #25  <Method Window AddUpcActivity.getWindow()>
	//    4    6:invokevirtual   #31  <Method View Window.getDecorView()>
	//    5    9:invokespecial   #34  <Method void AddUpcActivity_ViewBinding(AddUpcActivity, View)>
	//    6   12:return          
	}

	public AddUpcActivity_ViewBinding(final AddUpcActivity target, View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
		this.target = target;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field AddUpcActivity target>
		target.ivImage = (ImageView)Utils.findRequiredViewAsType(view, 0x7f0902ad, "field 'ivImage'", android/widget/ImageView);
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:ldc1            #42  <Int 0x7f0902ad>
	//    8   13:ldc1            #44  <String "field 'ivImage'">
	//    9   15:ldc1            #46  <Class ImageView>
	//   10   17:invokestatic    #52  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   11   20:checkcast       #46  <Class ImageView>
	//   12   23:putfield        #56  <Field ImageView AddUpcActivity.ivImage>
		target.tvName = (TextView)Utils.findRequiredViewAsType(view, 0x7f09054d, "field 'tvName'", android/widget/TextView);
	//   13   26:aload_1         
	//   14   27:aload_2         
	//   15   28:ldc1            #57  <Int 0x7f09054d>
	//   16   30:ldc1            #59  <String "field 'tvName'">
	//   17   32:ldc1            #61  <Class TextView>
	//   18   34:invokestatic    #52  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   19   37:checkcast       #61  <Class TextView>
	//   20   40:putfield        #65  <Field TextView AddUpcActivity.tvName>
		target.tvDescription = (TextView)Utils.findRequiredViewAsType(view, 0x7f090515, "field 'tvDescription'", android/widget/TextView);
	//   21   43:aload_1         
	//   22   44:aload_2         
	//   23   45:ldc1            #66  <Int 0x7f090515>
	//   24   47:ldc1            #68  <String "field 'tvDescription'">
	//   25   49:ldc1            #61  <Class TextView>
	//   26   51:invokestatic    #52  <Method Object Utils.findRequiredViewAsType(View, int, String, Class)>
	//   27   54:checkcast       #61  <Class TextView>
	//   28   57:putfield        #71  <Field TextView AddUpcActivity.tvDescription>
		View view1 = Utils.findRequiredView(view, 0x7f0900b4, "method 'onYesClicked'");
	//   29   60:aload_2         
	//   30   61:ldc1            #72  <Int 0x7f0900b4>
	//   31   63:ldc1            #74  <String "method 'onYesClicked'">
	//   32   65:invokestatic    #78  <Method View Utils.findRequiredView(View, int, String)>
	//   33   68:astore_3        
		view7f0900b4 = view1;
	//   34   69:aload_0         
	//   35   70:aload_3         
	//   36   71:putfield        #80  <Field View view7f0900b4>
		DebouncingOnClickListener debouncingonclicklistener = new DebouncingOnClickListener() {

			public void doClick(View view2)
			{
				target.onYesClicked();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AddUpcActivity val$target>
			//    2    4:invokevirtual   #29  <Method void AddUpcActivity.onYesClicked()>
			//    3    7:return          
			}

			final AddUpcActivity_ViewBinding this$0;
			final AddUpcActivity val$target;

			
			{
				this$0 = AddUpcActivity_ViewBinding.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AddUpcActivity_ViewBinding this$0>
				target = addupcactivity;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field AddUpcActivity val$target>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void DebouncingOnClickListener()>
			//    8   14:return          
			}
		}
;
	//   37   74:new             #8   <Class AddUpcActivity_ViewBinding$1>
	//   38   77:dup             
	//   39   78:aload_0         
	//   40   79:aload_1         
	//   41   80:invokespecial   #83  <Method void AddUpcActivity_ViewBinding$1(AddUpcActivity_ViewBinding, AddUpcActivity)>
	//   42   83:astore          4
		if(!(view1 instanceof View))
	//*  43   85:aload_3         
	//*  44   86:instanceof      #85  <Class View>
	//*  45   89:ifne            101
			view1.setOnClickListener(((android.view.View.OnClickListener) (debouncingonclicklistener)));
	//   46   92:aload_3         
	//   47   93:aload           4
	//   48   95:invokevirtual   #89  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		else
	//*  49   98:goto            110
			ViewInstrumentation.setOnClickListener((View)view1, ((android.view.View.OnClickListener) (debouncingonclicklistener)));
	//   50  101:aload_3         
	//   51  102:checkcast       #85  <Class View>
	//   52  105:aload           4
	//   53  107:invokestatic    #94  <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		view = Utils.findRequiredView(view, 0x7f090095, "method 'onNoClicked'");
	//   54  110:aload_2         
	//   55  111:ldc1            #95  <Int 0x7f090095>
	//   56  113:ldc1            #97  <String "method 'onNoClicked'">
	//   57  115:invokestatic    #78  <Method View Utils.findRequiredView(View, int, String)>
	//   58  118:astore_2        
		view7f090095 = view;
	//   59  119:aload_0         
	//   60  120:aload_2         
	//   61  121:putfield        #99  <Field View view7f090095>
		target = ((AddUpcActivity) (new DebouncingOnClickListener() {

			public void doClick(View view2)
			{
				target.onNoClicked();
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field AddUpcActivity val$target>
			//    2    4:invokevirtual   #29  <Method void AddUpcActivity.onNoClicked()>
			//    3    7:return          
			}

			final AddUpcActivity_ViewBinding this$0;
			final AddUpcActivity val$target;

			
			{
				this$0 = AddUpcActivity_ViewBinding.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field AddUpcActivity_ViewBinding this$0>
				target = addupcactivity;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #18  <Field AddUpcActivity val$target>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #21  <Method void DebouncingOnClickListener()>
			//    8   14:return          
			}
		}
));
	//   62  124:new             #10  <Class AddUpcActivity_ViewBinding$2>
	//   63  127:dup             
	//   64  128:aload_0         
	//   65  129:aload_1         
	//   66  130:invokespecial   #100 <Method void AddUpcActivity_ViewBinding$2(AddUpcActivity_ViewBinding, AddUpcActivity)>
	//   67  133:astore_1        
		if(!(view instanceof View))
	//*  68  134:aload_2         
	//*  69  135:instanceof      #85  <Class View>
	//*  70  138:ifne            147
		{
			view.setOnClickListener(((android.view.View.OnClickListener) (target)));
	//   71  141:aload_2         
	//   72  142:aload_1         
	//   73  143:invokevirtual   #89  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			return;
	//   74  146:return          
		} else
		{
			ViewInstrumentation.setOnClickListener((View)view, ((android.view.View.OnClickListener) (target)));
	//   75  147:aload_2         
	//   76  148:checkcast       #85  <Class View>
	//   77  151:aload_1         
	//   78  152:invokestatic    #94  <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			return;
	//   79  155:return          
		}
	}

	public void unbind()
	{
		Object obj = ((Object) (target));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field AddUpcActivity target>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          96
		{
			target = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #41  <Field AddUpcActivity target>
			obj.ivImage = null;
	//    8   14:aload_1         
	//    9   15:aconst_null     
	//   10   16:putfield        #56  <Field ImageView AddUpcActivity.ivImage>
			obj.tvName = null;
	//   11   19:aload_1         
	//   12   20:aconst_null     
	//   13   21:putfield        #65  <Field TextView AddUpcActivity.tvName>
			obj.tvDescription = null;
	//   14   24:aload_1         
	//   15   25:aconst_null     
	//   16   26:putfield        #71  <Field TextView AddUpcActivity.tvDescription>
			obj = ((Object) (view7f0900b4));
	//   17   29:aload_0         
	//   18   30:getfield        #80  <Field View view7f0900b4>
	//   19   33:astore_1        
			if(!(obj instanceof View))
	//*  20   34:aload_1         
	//*  21   35:instanceof      #85  <Class View>
	//*  22   38:ifne            49
				((View) (obj)).setOnClickListener(((android.view.View.OnClickListener) (null)));
	//   23   41:aload_1         
	//   24   42:aconst_null     
	//   25   43:invokevirtual   #89  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			else
	//*  26   46:goto            57
				ViewInstrumentation.setOnClickListener((View)obj, ((android.view.View.OnClickListener) (null)));
	//   27   49:aload_1         
	//   28   50:checkcast       #85  <Class View>
	//   29   53:aconst_null     
	//   30   54:invokestatic    #94  <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			view7f0900b4 = null;
	//   31   57:aload_0         
	//   32   58:aconst_null     
	//   33   59:putfield        #80  <Field View view7f0900b4>
			obj = ((Object) (view7f090095));
	//   34   62:aload_0         
	//   35   63:getfield        #99  <Field View view7f090095>
	//   36   66:astore_1        
			if(!(obj instanceof View))
	//*  37   67:aload_1         
	//*  38   68:instanceof      #85  <Class View>
	//*  39   71:ifne            82
				((View) (obj)).setOnClickListener(((android.view.View.OnClickListener) (null)));
	//   40   74:aload_1         
	//   41   75:aconst_null     
	//   42   76:invokevirtual   #89  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
			else
	//*  43   79:goto            90
				ViewInstrumentation.setOnClickListener((View)obj, ((android.view.View.OnClickListener) (null)));
	//   44   82:aload_1         
	//   45   83:checkcast       #85  <Class View>
	//   46   86:aconst_null     
	//   47   87:invokestatic    #94  <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
			view7f090095 = null;
	//   48   90:aload_0         
	//   49   91:aconst_null     
	//   50   92:putfield        #99  <Field View view7f090095>
			return;
	//   51   95:return          
		} else
		{
			throw new IllegalStateException("Bindings already cleared.");
	//   52   96:new             #104 <Class IllegalStateException>
	//   53   99:dup             
	//   54  100:ldc1            #106 <String "Bindings already cleared.">
	//   55  102:invokespecial   #109 <Method void IllegalStateException(String)>
	//   56  105:athrow          
		}
	}

	private AddUpcActivity target;
	private View view7f090095;
	private View view7f0900b4;
}
