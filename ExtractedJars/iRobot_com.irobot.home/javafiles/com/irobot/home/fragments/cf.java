// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.Activity;
import android.content.Context;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.ViewId;
import com.irobot.home.model.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class cf extends com.irobot.home.fragments.j
{
	public static interface a
	{

		public abstract void f();

		public abstract void g();
	}


	public cf()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void com.irobot.home.fragments.j()>
	//    2    4:return          
	}

	protected void a()
	{
		com.irobot.core.AssetInfo assetinfo = j.a(a).a();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String a>
	//    2    4:invokestatic    #22  <Method a j.a(String)>
	//    3    7:invokevirtual   #27  <Method com.irobot.core.AssetInfo a.a()>
	//    4   10:astore_1        
		AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.OnDemandOtaFailed, assetinfo);
	//    5   11:invokestatic    #33  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    6   14:getstatic       #39  <Field ViewId ViewId.OnDemandOtaFailed>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #43  <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
	//    9   21:return          
	}

	protected void b()
	{
		b.f();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field cf$a b>
	//    2    4:invokeinterface #48  <Method void cf$a.f()>
		com.irobot.core.AssetInfo assetinfo = j.a(a).a();
	//    3    9:aload_0         
	//    4   10:getfield        #17  <Field String a>
	//    5   13:invokestatic    #22  <Method a j.a(String)>
	//    6   16:invokevirtual   #27  <Method com.irobot.core.AssetInfo a.a()>
	//    7   19:astore_1        
		AnalyticsSubsystem.getInstance().trackOnDemandOtaFailedTryAgainButtonPressed(assetinfo);
	//    8   20:invokestatic    #33  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    9   23:aload_1         
	//   10   24:invokevirtual   #52  <Method void AnalyticsSubsystem.trackOnDemandOtaFailedTryAgainButtonPressed(com.irobot.core.AssetInfo)>
	//   11   27:return          
	}

	protected void c()
	{
		b.g();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field cf$a b>
	//    2    4:invokeinterface #56  <Method void cf$a.g()>
		com.irobot.core.AssetInfo assetinfo = j.a(a).a();
	//    3    9:aload_0         
	//    4   10:getfield        #17  <Field String a>
	//    5   13:invokestatic    #22  <Method a j.a(String)>
	//    6   16:invokevirtual   #27  <Method com.irobot.core.AssetInfo a.a()>
	//    7   19:astore_1        
		AnalyticsSubsystem.getInstance().trackOnDemandOtaFailedUpdateLaterButtonPressed(assetinfo);
	//    8   20:invokestatic    #33  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    9   23:aload_1         
	//   10   24:invokevirtual   #59  <Method void AnalyticsSubsystem.trackOnDemandOtaFailedUpdateLaterButtonPressed(com.irobot.core.AssetInfo)>
	//   11   27:return          
	}

	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #63  <Method void j.onAttach(Activity)>
		if(activity instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #6   <Class cf$a>
	//*   5    9:ifeq            21
		{
			b = (a)activity;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #6   <Class cf$a>
	//    9   17:putfield        #45  <Field cf$a b>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #65  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #66  <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (activity)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #72  <Method String Object.toString()>
	//   18   34:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnUpdateFailedListener");
	//   20   38:aload_2         
	//   21   39:ldc1            #78  <String " must implement OnUpdateFailedListener">
	//   22   41:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   45:new             #80  <Class RuntimeException>
	//   25   48:dup             
	//   26   49:aload_2         
	//   27   50:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #84  <Method void RuntimeException(String)>
	//   29   56:athrow          
		}
	}

	public void onAttach(Context context)
	{
		super.onAttach(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #87  <Method void j.onAttach(Context)>
		if(context instanceof a)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #6   <Class cf$a>
	//*   5    9:ifeq            21
		{
			b = (a)context;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:checkcast       #6   <Class cf$a>
	//    9   17:putfield        #45  <Field cf$a b>
			return;
	//   10   20:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   21:new             #65  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #66  <Method void StringBuilder()>
	//   14   28:astore_2        
			stringbuilder.append(((Object) (context)).toString());
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #72  <Method String Object.toString()>
	//   18   34:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" must implement OnUpdateFailedListener");
	//   20   38:aload_2         
	//   21   39:ldc1            #78  <String " must implement OnUpdateFailedListener">
	//   22   41:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   24   45:new             #80  <Class RuntimeException>
	//   25   48:dup             
	//   26   49:aload_2         
	//   27   50:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #84  <Method void RuntimeException(String)>
	//   29   56:athrow          
		}
	}

	public void onDetach()
	{
		super.onDetach();
	//    0    0:aload_0         
	//    1    1:invokespecial   #90  <Method void j.onDetach()>
		b = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #45  <Field cf$a b>
	//    5    9:return          
	}

	String a;
	private a b;
}
