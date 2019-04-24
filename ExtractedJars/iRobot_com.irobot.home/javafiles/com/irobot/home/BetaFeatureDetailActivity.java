// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.irobot.core.*;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class BetaFeatureDetailActivity extends BaseFragmentActivity
{

	public BetaFeatureDetailActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void BaseFragmentActivity()>
		d = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #26  <Field int d>
	//    5    9:return          
	}

	private void f()
	{
		a(i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #29  <Field Toolbar i>
	//    3    5:invokevirtual   #32  <Method void a(Toolbar)>
		ActionBar actionbar = a();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #35  <Method ActionBar a()>
	//    6   12:astore_1        
		if(actionbar != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          39
		{
			actionbar.a(((CharSequence) (null)));
	//    9   17:aload_1         
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #40  <Method void ActionBar.a(CharSequence)>
			b(a);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #42  <Field int a>
	//   15   27:invokevirtual   #45  <Method void b(int)>
			j.setVisibility(8);
	//   16   30:aload_0         
	//   17   31:getfield        #47  <Field View j>
	//   18   34:bipush          8
	//   19   36:invokevirtual   #52  <Method void View.setVisibility(int)>
		}
	//   20   39:return          
	}

	protected void e()
	{
		e.setText(b);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field CustomTextView e>
	//    2    4:aload_0         
	//    3    5:getfield        #56  <Field int b>
	//    4    8:invokevirtual   #61  <Method void CustomTextView.setText(int)>
		f.setText(c);
	//    5   11:aload_0         
	//    6   12:getfield        #63  <Field CustomTextView f>
	//    7   15:aload_0         
	//    8   16:getfield        #65  <Field int c>
	//    9   19:invokevirtual   #61  <Method void CustomTextView.setText(int)>
		if(d == 0)
	//*  10   22:aload_0         
	//*  11   23:getfield        #26  <Field int d>
	//*  12   26:ifne            50
		{
			h.setVisibility(8);
	//   13   29:aload_0         
	//   14   30:getfield        #67  <Field CustomTextView h>
	//   15   33:bipush          8
	//   16   35:invokevirtual   #68  <Method void CustomTextView.setVisibility(int)>
			g.setVisibility(8);
	//   17   38:aload_0         
	//   18   39:getfield        #70  <Field View g>
	//   19   42:bipush          8
	//   20   44:invokevirtual   #52  <Method void View.setVisibility(int)>
		} else
	//*  21   47:goto            61
		{
			h.setText(d);
	//   22   50:aload_0         
	//   23   51:getfield        #67  <Field CustomTextView h>
	//   24   54:aload_0         
	//   25   55:getfield        #26  <Field int d>
	//   26   58:invokevirtual   #61  <Method void CustomTextView.setText(int)>
		}
		if(k == FeatureType.WifiMaps)
	//*  27   61:aload_0         
	//*  28   62:getfield        #72  <Field FeatureType k>
	//*  29   65:getstatic       #77  <Field FeatureType FeatureType.WifiMaps>
	//*  30   68:if_acmpne       86
			AnalyticsSubsystem.getInstance().trackViewForAsset(ViewId.WifiCoverageMap, com.irobot.home.util.j.j().a());
	//   31   71:invokestatic    #83  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   32   74:getstatic       #89  <Field ViewId ViewId.WifiCoverageMap>
	//   33   77:invokestatic    #94  <Method a j.j()>
	//   34   80:invokevirtual   #99  <Method com.irobot.core.AssetInfo a.a()>
	//   35   83:invokevirtual   #103 <Method void AnalyticsSubsystem.trackViewForAsset(ViewId, com.irobot.core.AssetInfo)>
	//   36   86:return          
	}

	protected void onPostCreate(Bundle bundle)
	{
		super.onPostCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void BaseFragmentActivity.onPostCreate(Bundle)>
		f();
	//    3    5:aload_0         
	//    4    6:invokespecial   #109 <Method void f()>
	//    5    9:return          
	}

	public void onPostCreate(Bundle bundle, PersistableBundle persistablebundle)
	{
		super.onPostCreate(bundle, persistablebundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #112 <Method void BaseFragmentActivity.onPostCreate(Bundle, PersistableBundle)>
		f();
	//    4    6:aload_0         
	//    5    7:invokespecial   #109 <Method void f()>
	//    6   10:return          
	}

	int a;
	int b;
	int c;
	int d;
	CustomTextView e;
	CustomTextView f;
	View g;
	CustomTextView h;
	Toolbar i;
	View j;
	FeatureType k;
}
