// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.content.Context;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomVideoView;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class cj extends com.irobot.home.fragments.j
{
	public static interface a
	{

		public abstract void j();
	}


	public cj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void com.irobot.home.fragments.j()>
	//    2    4:return          
	}

	protected void a()
	{
		Object obj = ((Object) (j.a(a)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field String a>
	//    2    4:invokestatic    #24  <Method a j.a(String)>
	//    3    7:astore_3        
		boolean flag1 = false;
	//    4    8:iconst_0        
	//    5    9:istore_2        
		boolean flag = flag1;
	//    6   10:iload_2         
	//    7   11:istore_1        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          41
		{
			obj = ((Object) (((com.irobot.home.model.a) (obj)).a()));
	//   10   16:aload_3         
	//   11   17:invokevirtual   #29  <Method com.irobot.core.AssetInfo a.a()>
	//   12   20:astore_3        
			flag = flag1;
	//   13   21:iload_2         
	//   14   22:istore_1        
			if(AssetCapabilityUtils.isCloudCapable(((com.irobot.core.AssetInfo) (obj))))
	//*  15   23:aload_3         
	//*  16   24:invokestatic    #35  <Method boolean AssetCapabilityUtils.isCloudCapable(com.irobot.core.AssetInfo)>
	//*  17   27:ifeq            41
			{
				flag = flag1;
	//   18   30:iload_2         
	//   19   31:istore_1        
				if(AssetCapabilityUtils.isMoppingRobot(((com.irobot.core.AssetInfo) (obj))))
	//*  20   32:aload_3         
	//*  21   33:invokestatic    #38  <Method boolean AssetCapabilityUtils.isMoppingRobot(com.irobot.core.AssetInfo)>
	//*  22   36:ifeq            41
					flag = true;
	//   23   39:iconst_1        
	//   24   40:istore_1        
			}
		}
		obj = ((Object) (getActivity()));
	//   25   41:aload_0         
	//   26   42:invokevirtual   #42  <Method android.support.v4.app.FragmentActivity getActivity()>
	//   27   45:astore_3        
		int i;
		if(flag)
	//*  28   46:iload_1         
	//*  29   47:ifeq            56
			i = 0x7f0e020b;
	//   30   50:ldc1            #43  <Int 0x7f0e020b>
	//   31   52:istore_1        
		else
	//*  32   53:goto            59
			i = 0x7f0e01fe;
	//   33   56:ldc1            #44  <Int 0x7f0e01fe>
	//   34   58:istore_1        
		obj = ((Object) (j.a(((Context) (obj)), i)));
	//   35   59:aload_3         
	//   36   60:iload_1         
	//   37   61:invokestatic    #47  <Method android.net.Uri j.a(Context, int)>
	//   38   64:astore_3        
		b.setSource(((android.net.Uri) (obj)));
	//   39   65:aload_0         
	//   40   66:getfield        #49  <Field CustomVideoView b>
	//   41   69:aload_3         
	//   42   70:invokevirtual   #55  <Method void CustomVideoView.setSource(android.net.Uri)>
		b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-1, j.a(((Activity) (getActivity())), ((android.net.Uri) (obj)))))));
	//   43   73:aload_0         
	//   44   74:getfield        #49  <Field CustomVideoView b>
	//   45   77:new             #57  <Class android.widget.RelativeLayout$LayoutParams>
	//   46   80:dup             
	//   47   81:iconst_m1       
	//   48   82:aload_0         
	//   49   83:invokevirtual   #42  <Method android.support.v4.app.FragmentActivity getActivity()>
	//   50   86:aload_3         
	//   51   87:invokestatic    #60  <Method int j.a(Activity, android.net.Uri)>
	//   52   90:invokespecial   #63  <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   53   93:invokevirtual   #67  <Method void CustomVideoView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		b.setLooping(true);
	//   54   96:aload_0         
	//   55   97:getfield        #49  <Field CustomVideoView b>
	//   56  100:iconst_1        
	//   57  101:invokevirtual   #71  <Method void CustomVideoView.setLooping(boolean)>
		b.a();
	//   58  104:aload_0         
	//   59  105:getfield        #49  <Field CustomVideoView b>
	//   60  108:invokevirtual   #73  <Method void CustomVideoView.a()>
		obj = ((Object) (j.a(a).a()));
	//   61  111:aload_0         
	//   62  112:getfield        #19  <Field String a>
	//   63  115:invokestatic    #24  <Method a j.a(String)>
	//   64  118:invokevirtual   #29  <Method com.irobot.core.AssetInfo a.a()>
	//   65  121:astore_3        
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.OnDemandOtaSuccess, ((com.irobot.core.AssetInfo) (obj)));
	//   66  122:invokestatic    #79  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   67  125:getstatic       #85  <Field ViewId ViewId.OnDemandOtaSuccess>
	//   68  128:aload_3         
	//   69  129:invokevirtual   #89  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
	//   70  132:return          
	}

	protected void b()
	{
		c.j();
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field cj$a c>
	//    2    4:invokeinterface #94  <Method void com.irobot.home.fragments.cj$a.j()>
	//    3    9:return          
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void j.onAttach(Activity)>
		if(activity instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #6   <Class cj$a>
	//*   5    9:ifeq            21
		{
			c = (a)activity;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #6   <Class cj$a>
	//    9   17:putfield        #91  <Field cj$a c>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #100 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #101 <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (activity)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #107 <Method String Object.toString()>
	//   18   34:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnUpdateSucceededListener");
	//   20   38:aload_2         
	//   21   39:ldc1            #113 <String " must implement OnUpdateSucceededListener">
	//   22   41:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   45:new             #115 <Class RuntimeException>
	//   25   48:dup             
	//   26   49:aload_2         
	//   27   50:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #119 <Method void RuntimeException(String)>
	//   29   56:athrow          
		}
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #122 <Method void j.onAttach(Context)>
		if(context instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #6   <Class cj$a>
	//*   5    9:ifeq            21
		{
			c = (a)context;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #6   <Class cj$a>
	//    9   17:putfield        #91  <Field cj$a c>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #100 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #101 <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (context)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #107 <Method String Object.toString()>
	//   18   34:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnUpdateSucceededListener");
	//   20   38:aload_2         
	//   21   39:ldc1            #113 <String " must implement OnUpdateSucceededListener">
	//   22   41:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   45:new             #115 <Class RuntimeException>
	//   25   48:dup             
	//   26   49:aload_2         
	//   27   50:invokevirtual   #116 <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #119 <Method void RuntimeException(String)>
	//   29   56:athrow          
		}
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void j.onDetach()>
		c = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #91  <Field cj$a c>
	//    5    9:return          
	}

	String a;
	CustomVideoView b;
	private a c;
}
