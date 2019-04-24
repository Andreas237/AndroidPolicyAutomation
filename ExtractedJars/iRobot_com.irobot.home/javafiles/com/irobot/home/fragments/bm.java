// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.s;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.b.ag;
import com.irobot.home.model.p;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTextView;
import com.irobot.home.view.DiscreteSeekBar;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.irobot.home.fragments:
//			e, bn

public class bm extends e
	implements android.view.View.OnClickListener, com.irobot.home.view.DiscreteSeekBar.a
{

	public bm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void e()>
		n = new android.widget.AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
			{
				bm.a(a).a(i1);
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field bm a>
			//    2    4:invokestatic    #23  <Method ag bm.a(bm)>
			//    3    7:iload_3         
			//    4    8:invokevirtual   #28  <Method void ag.a(int)>
				adapterview = ((AdapterView) (SettingsUIServiceData.create()));
			//    5   11:invokestatic    #34  <Method SettingsUIServiceData SettingsUIServiceData.create()>
			//    6   14:astore_1        
				((SettingsUIServiceData) (adapterview)).setIntegerSetting(SettingType.RobotRankOverlap, bm.a(a, i1).ordinal());
			//    7   15:aload_1         
			//    8   16:getstatic       #40  <Field SettingType SettingType.RobotRankOverlap>
			//    9   19:aload_0         
			//   10   20:getfield        #14  <Field bm a>
			//   11   23:iload_3         
			//   12   24:invokestatic    #43  <Method RobotRankOverlap bm.a(bm, int)>
			//   13   27:invokevirtual   #49  <Method int RobotRankOverlap.ordinal()>
			//   14   30:invokevirtual   #53  <Method void SettingsUIServiceData.setIntegerSetting(SettingType, int)>
				a.b.sendCommand(SettingsUIServiceCommand.SetCleaningPreference, ((SettingsUIServiceData) (adapterview)));
			//   15   33:aload_0         
			//   16   34:getfield        #14  <Field bm a>
			//   17   37:getfield        #57  <Field SettingsSubsystem bm.b>
			//   18   40:getstatic       #63  <Field SettingsUIServiceCommand SettingsUIServiceCommand.SetCleaningPreference>
			//   19   43:aload_1         
			//   20   44:invokevirtual   #69  <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
			//   21   47:return          
			}

			final bm a;

			
			{
				a = bm.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field bm a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    2    4:aload_0         
	//    3    5:new             #10  <Class bm$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #54  <Method void bm$1(bm)>
	//    7   13:putfield        #56  <Field android.widget.AdapterView$OnItemClickListener n>
	//    8   16:return          
	}

	private RobotRankOverlap a(int i1)
	{
		if(i1 == 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          9
			return RobotRankOverlap.DeepClean;
	//    3    5:getstatic       #64  <Field RobotRankOverlap RobotRankOverlap.DeepClean>
	//    4    8:areturn         
		if(i1 == 3)
	//*   5    9:iload_1         
	//*   6   10:iconst_3        
	//*   7   11:icmpne          18
			return RobotRankOverlap.ExtendedClean;
	//    8   14:getstatic       #67  <Field RobotRankOverlap RobotRankOverlap.ExtendedClean>
	//    9   17:areturn         
		else
			return RobotRankOverlap.DetailClean;
	//   10   18:getstatic       #70  <Field RobotRankOverlap RobotRankOverlap.DetailClean>
	//   11   21:areturn         
	}

	static RobotRankOverlap a(bm bm1, int i1)
	{
		return bm1.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #73  <Method RobotRankOverlap a(int)>
	//    3    5:areturn         
	}

	static ag a(bm bm1)
	{
		return bm1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field ag d>
	//    2    4:areturn         
	}

	public static bm a(String s1, SettingsSubsystem settingssubsystem)
	{
		bm bm1 = bn.c().a();
	//    0    0:invokestatic    #82  <Method bn$a bn.c()>
	//    1    3:invokevirtual   #87  <Method bm bn$a.a()>
	//    2    6:astore_2        
		bm1.a(s1);
	//    3    7:aload_2         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #90  <Method void a(String)>
		bm1.a(settingssubsystem);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #93  <Method void a(SettingsSubsystem)>
		return bm1;
	//    9   17:aload_2         
	//   10   18:areturn         
	}

	private int b(RobotRankOverlap robotrankoverlap)
	{
		if(robotrankoverlap == RobotRankOverlap.DeepClean)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #64  <Field RobotRankOverlap RobotRankOverlap.DeepClean>
	//*   2    4:if_acmpne       9
			return 2;
	//    3    7:iconst_2        
	//    4    8:ireturn         
		return robotrankoverlap != RobotRankOverlap.ExtendedClean ? 1 : 3;
	//    5    9:aload_1         
	//    6   10:getstatic       #67  <Field RobotRankOverlap RobotRankOverlap.ExtendedClean>
	//    7   13:if_acmpne       18
	//    8   16:iconst_3        
	//    9   17:ireturn         
	//   10   18:iconst_1        
	//   11   19:ireturn         
	}

	private void c()
	{
		Object obj = ((Object) (getActivity().getLayoutInflater()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method FragmentActivity getActivity()>
	//    2    4:invokevirtual   #105 <Method LayoutInflater FragmentActivity.getLayoutInflater()>
	//    3    7:astore_1        
		f = ((LayoutInflater) (obj)).inflate(0x7f0b0139, ((android.view.ViewGroup) (null)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:ldc1            #106 <Int 0x7f0b0139>
	//    7   12:aconst_null     
	//    8   13:invokevirtual   #112 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    9   16:putfield        #114 <Field View f>
		f.setVisibility(8);
	//   10   19:aload_0         
	//   11   20:getfield        #114 <Field View f>
	//   12   23:bipush          8
	//   13   25:invokevirtual   #120 <Method void View.setVisibility(int)>
		l.addFooterView(f, ((Object) (null)), false);
	//   14   28:aload_0         
	//   15   29:getfield        #122 <Field ListView l>
	//   16   32:aload_0         
	//   17   33:getfield        #114 <Field View f>
	//   18   36:aconst_null     
	//   19   37:iconst_0        
	//   20   38:invokevirtual   #128 <Method void ListView.addFooterView(View, Object, boolean)>
		i = (LinearLayout)f.findViewById(0x7f0902e5);
	//   21   41:aload_0         
	//   22   42:aload_0         
	//   23   43:getfield        #114 <Field View f>
	//   24   46:ldc1            #129 <Int 0x7f0902e5>
	//   25   48:invokevirtual   #133 <Method View View.findViewById(int)>
	//   26   51:checkcast       #135 <Class LinearLayout>
	//   27   54:putfield        #137 <Field LinearLayout i>
		j = (ImageView)f.findViewById(0x7f0901dd);
	//   28   57:aload_0         
	//   29   58:aload_0         
	//   30   59:getfield        #114 <Field View f>
	//   31   62:ldc1            #138 <Int 0x7f0901dd>
	//   32   64:invokevirtual   #133 <Method View View.findViewById(int)>
	//   33   67:checkcast       #140 <Class ImageView>
	//   34   70:putfield        #142 <Field ImageView j>
		j.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   35   73:aload_0         
	//   36   74:getfield        #142 <Field ImageView j>
	//   37   77:aload_0         
	//   38   78:invokevirtual   #146 <Method void ImageView.setOnClickListener(android.view.View$OnClickListener)>
		obj = ((Object) (((LayoutInflater) (obj)).inflate(0x7f0b012f, ((android.view.ViewGroup) (null)))));
	//   39   81:aload_1         
	//   40   82:ldc1            #147 <Int 0x7f0b012f>
	//   41   84:aconst_null     
	//   42   85:invokevirtual   #112 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   43   88:astore_1        
		((CustomTextView)((View) (obj)).findViewById(0x7f0902fc)).setText(0x7f0f0413);
	//   44   89:aload_1         
	//   45   90:ldc1            #148 <Int 0x7f0902fc>
	//   46   92:invokevirtual   #133 <Method View View.findViewById(int)>
	//   47   95:checkcast       #150 <Class CustomTextView>
	//   48   98:ldc1            #151 <Int 0x7f0f0413>
	//   49  100:invokevirtual   #154 <Method void CustomTextView.setText(int)>
		k = new PopupWindow(((View) (obj)), (int)getResources().getDimension(0x7f07013e), -2, true);
	//   50  103:aload_0         
	//   51  104:new             #156 <Class PopupWindow>
	//   52  107:dup             
	//   53  108:aload_1         
	//   54  109:aload_0         
	//   55  110:invokevirtual   #160 <Method Resources getResources()>
	//   56  113:ldc1            #161 <Int 0x7f07013e>
	//   57  115:invokevirtual   #167 <Method float Resources.getDimension(int)>
	//   58  118:f2i             
	//   59  119:bipush          -2
	//   60  121:iconst_1        
	//   61  122:invokespecial   #170 <Method void PopupWindow(View, int, int, boolean)>
	//   62  125:putfield        #172 <Field PopupWindow k>
		m = (DiscreteSeekBar)f.findViewById(0x7f0901f1);
	//   63  128:aload_0         
	//   64  129:aload_0         
	//   65  130:getfield        #114 <Field View f>
	//   66  133:ldc1            #173 <Int 0x7f0901f1>
	//   67  135:invokevirtual   #133 <Method View View.findViewById(int)>
	//   68  138:checkcast       #175 <Class DiscreteSeekBar>
	//   69  141:putfield        #177 <Field DiscreteSeekBar m>
		m.setThumb(getActivity().getDrawable(0x7f0801c3));
	//   70  144:aload_0         
	//   71  145:getfield        #177 <Field DiscreteSeekBar m>
	//   72  148:aload_0         
	//   73  149:invokevirtual   #99  <Method FragmentActivity getActivity()>
	//   74  152:ldc1            #178 <Int 0x7f0801c3>
	//   75  154:invokevirtual   #182 <Method android.graphics.drawable.Drawable FragmentActivity.getDrawable(int)>
	//   76  157:invokevirtual   #186 <Method void DiscreteSeekBar.setThumb(android.graphics.drawable.Drawable)>
		m.setProgressTint(getResources().getColor(0x7f060061));
	//   77  160:aload_0         
	//   78  161:getfield        #177 <Field DiscreteSeekBar m>
	//   79  164:aload_0         
	//   80  165:invokevirtual   #160 <Method Resources getResources()>
	//   81  168:ldc1            #187 <Int 0x7f060061>
	//   82  170:invokevirtual   #191 <Method int Resources.getColor(int)>
	//   83  173:invokevirtual   #194 <Method void DiscreteSeekBar.setProgressTint(int)>
		m.setSteps(3);
	//   84  176:aload_0         
	//   85  177:getfield        #177 <Field DiscreteSeekBar m>
	//   86  180:iconst_3        
	//   87  181:invokevirtual   #197 <Method void DiscreteSeekBar.setSteps(int)>
		m.setOnRangeSeekBarChangeListener(((com.irobot.home.view.DiscreteSeekBar.a) (this)));
	//   88  184:aload_0         
	//   89  185:getfield        #177 <Field DiscreteSeekBar m>
	//   90  188:aload_0         
	//   91  189:invokevirtual   #201 <Method void DiscreteSeekBar.setOnRangeSeekBarChangeListener(com.irobot.home.view.DiscreteSeekBar$a)>
	//   92  192:return          
	}

	private void d()
	{
		String as[] = getResources().getStringArray(0x7f030004);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #160 <Method Resources getResources()>
	//    2    4:ldc1            #202 <Int 0x7f030004>
	//    3    6:invokevirtual   #206 <Method String[] Resources.getStringArray(int)>
	//    4    9:astore_2        
		String as1[] = getResources().getStringArray(0x7f030003);
	//    5   10:aload_0         
	//    6   11:invokevirtual   #160 <Method Resources getResources()>
	//    7   14:ldc1            #207 <Int 0x7f030003>
	//    8   16:invokevirtual   #206 <Method String[] Resources.getStringArray(int)>
	//    9   19:astore_3        
		e = ((List) (new ArrayList()));
	//   10   20:aload_0         
	//   11   21:new             #209 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #210 <Method void ArrayList()>
	//   14   28:putfield        #212 <Field List e>
		for(int i1 = 0; i1 < as1.length; i1++)
	//*  15   31:iconst_0        
	//*  16   32:istore_1        
	//*  17   33:iload_1         
	//*  18   34:aload_3         
	//*  19   35:arraylength     
	//*  20   36:icmpge          69
			e.add(((Object) (new p(as[i1], as1[i1]))));
	//   21   39:aload_0         
	//   22   40:getfield        #212 <Field List e>
	//   23   43:new             #214 <Class p>
	//   24   46:dup             
	//   25   47:aload_2         
	//   26   48:iload_1         
	//   27   49:aaload          
	//   28   50:aload_3         
	//   29   51:iload_1         
	//   30   52:aaload          
	//   31   53:invokespecial   #217 <Method void p(String, String)>
	//   32   56:invokeinterface #223 <Method boolean List.add(Object)>
	//   33   61:pop             

	//   34   62:iload_1         
	//   35   63:iconst_1        
	//   36   64:iadd            
	//   37   65:istore_1        
	//*  38   66:goto            33
		d = new ag(((android.content.Context) (getActivity())));
	//   39   69:aload_0         
	//   40   70:new             #225 <Class ag>
	//   41   73:dup             
	//   42   74:aload_0         
	//   43   75:invokevirtual   #99  <Method FragmentActivity getActivity()>
	//   44   78:invokespecial   #228 <Method void ag(android.content.Context)>
	//   45   81:putfield        #76  <Field ag d>
		d.addAll(((java.util.Collection) (e)));
	//   46   84:aload_0         
	//   47   85:getfield        #76  <Field ag d>
	//   48   88:aload_0         
	//   49   89:getfield        #212 <Field List e>
	//   50   92:invokevirtual   #232 <Method void ag.addAll(java.util.Collection)>
		l.setAdapter(((android.widget.ListAdapter) (d)));
	//   51   95:aload_0         
	//   52   96:getfield        #122 <Field ListView l>
	//   53   99:aload_0         
	//   54  100:getfield        #76  <Field ag d>
	//   55  103:invokevirtual   #236 <Method void ListView.setAdapter(android.widget.ListAdapter)>
		View view = getActivity().getLayoutInflater().inflate(0x7f0b0089, ((android.view.ViewGroup) (null)));
	//   56  106:aload_0         
	//   57  107:invokevirtual   #99  <Method FragmentActivity getActivity()>
	//   58  110:invokevirtual   #105 <Method LayoutInflater FragmentActivity.getLayoutInflater()>
	//   59  113:ldc1            #237 <Int 0x7f0b0089>
	//   60  115:aconst_null     
	//   61  116:invokevirtual   #112 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   62  119:astore_2        
		((TextView)view.findViewById(0x7f0900f4)).setText(0x7f0f096b);
	//   63  120:aload_2         
	//   64  121:ldc1            #238 <Int 0x7f0900f4>
	//   65  123:invokevirtual   #133 <Method View View.findViewById(int)>
	//   66  126:checkcast       #240 <Class TextView>
	//   67  129:ldc1            #241 <Int 0x7f0f096b>
	//   68  131:invokevirtual   #242 <Method void TextView.setText(int)>
		l.addHeaderView(view, ((Object) (null)), false);
	//   69  134:aload_0         
	//   70  135:getfield        #122 <Field ListView l>
	//   71  138:aload_2         
	//   72  139:aconst_null     
	//   73  140:iconst_0        
	//   74  141:invokevirtual   #245 <Method void ListView.addHeaderView(View, Object, boolean)>
	//   75  144:return          
	}

	public void a(RobotPadWetnessLevel robotpadwetnesslevel)
	{
		if(robotpadwetnesslevel == RobotPadWetnessLevel.Damp)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #252 <Field RobotPadWetnessLevel RobotPadWetnessLevel.Damp>
	//*   2    4:if_acmpne       18
		{
			m.setSelectedIndex(0);
	//    3    7:aload_0         
	//    4    8:getfield        #177 <Field DiscreteSeekBar m>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #255 <Method void DiscreteSeekBar.setSelectedIndex(int)>
		} else
	//*   7   15:goto            50
		{
			int i1;
			if(robotpadwetnesslevel == RobotPadWetnessLevel.Moderate)
	//*   8   18:aload_1         
	//*   9   19:getstatic       #258 <Field RobotPadWetnessLevel RobotPadWetnessLevel.Moderate>
	//*  10   22:if_acmpne       40
			{
				robotpadwetnesslevel = ((RobotPadWetnessLevel) (m));
	//   11   25:aload_0         
	//   12   26:getfield        #177 <Field DiscreteSeekBar m>
	//   13   29:astore_1        
				i1 = 1;
	//   14   30:iconst_1        
	//   15   31:istore_2        
			} else
	//*  16   32:aload_1         
	//*  17   33:iload_2         
	//*  18   34:invokevirtual   #255 <Method void DiscreteSeekBar.setSelectedIndex(int)>
	//*  19   37:goto            50
			{
				robotpadwetnesslevel = ((RobotPadWetnessLevel) (m));
	//   20   40:aload_0         
	//   21   41:getfield        #177 <Field DiscreteSeekBar m>
	//   22   44:astore_1        
				i1 = 2;
	//   23   45:iconst_2        
	//   24   46:istore_2        
			}
			((DiscreteSeekBar) (robotpadwetnesslevel)).setSelectedIndex(i1);
		}
	//*  25   47:goto            32
		f.setVisibility(0);
	//   26   50:aload_0         
	//   27   51:getfield        #114 <Field View f>
	//   28   54:iconst_0        
	//   29   55:invokevirtual   #120 <Method void View.setVisibility(int)>
	//   30   58:return          
	}

	public void a(RobotRankOverlap robotrankoverlap)
	{
		l.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field ListView l>
	//    2    4:aconst_null     
	//    3    5:invokevirtual   #263 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		d.a(b(robotrankoverlap));
	//    4    8:aload_0         
	//    5    9:getfield        #76  <Field ag d>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokespecial   #265 <Method int b(RobotRankOverlap)>
	//    9   17:invokevirtual   #267 <Method void ag.a(int)>
		l.setOnItemClickListener(n);
	//   10   20:aload_0         
	//   11   21:getfield        #122 <Field ListView l>
	//   12   24:aload_0         
	//   13   25:getfield        #56  <Field android.widget.AdapterView$OnItemClickListener n>
	//   14   28:invokevirtual   #263 <Method void ListView.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
	//   15   31:return          
	}

	public void b()
	{
		l = (ListView)getView().findViewById(0x7f0903e4);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #271 <Method View getView()>
	//    3    5:ldc2            #272 <Int 0x7f0903e4>
	//    4    8:invokevirtual   #133 <Method View View.findViewById(int)>
	//    5   11:checkcast       #124 <Class ListView>
	//    6   14:putfield        #122 <Field ListView l>
		s.c(((View) (l)), true);
	//    7   17:aload_0         
	//    8   18:getfield        #122 <Field ListView l>
	//    9   21:iconst_1        
	//   10   22:invokestatic    #277 <Method void s.c(View, boolean)>
		d();
	//   11   25:aload_0         
	//   12   26:invokespecial   #279 <Method void d()>
		c();
	//   13   29:aload_0         
	//   14   30:invokespecial   #281 <Method void c()>
	//   15   33:return          
	}

	public void b(int i1)
	{
		SettingsUIServiceData settingsuiservicedata = SettingsUIServiceData.create();
	//    0    0:invokestatic    #287 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//    1    3:astore_3        
		RobotPadWetnessLevel robotpadwetnesslevel;
		if(i1 == 2)
	//*   2    4:iload_1         
	//*   3    5:iconst_2        
	//*   4    6:icmpne          21
			robotpadwetnesslevel = RobotPadWetnessLevel.Wet;
	//    5    9:getstatic       #290 <Field RobotPadWetnessLevel RobotPadWetnessLevel.Wet>
	//    6   12:astore_2        
		else
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #294 <Method int RobotPadWetnessLevel.ordinal()>
	//*   9   17:istore_1        
	//*  10   18:goto            44
		if(i1 == 1)
	//*  11   21:iload_1         
	//*  12   22:iconst_1        
	//*  13   23:icmpne          33
			robotpadwetnesslevel = RobotPadWetnessLevel.Moderate;
	//   14   26:getstatic       #258 <Field RobotPadWetnessLevel RobotPadWetnessLevel.Moderate>
	//   15   29:astore_2        
		else
	//*  16   30:goto            13
		if(i1 == 0)
	//*  17   33:iload_1         
	//*  18   34:ifne            64
		{
			robotpadwetnesslevel = RobotPadWetnessLevel.Damp;
	//   19   37:getstatic       #252 <Field RobotPadWetnessLevel RobotPadWetnessLevel.Damp>
	//   20   40:astore_2        
		} else
	//*  21   41:goto            13
	//*  22   44:aload_3         
	//*  23   45:getstatic       #300 <Field SettingType SettingType.RobotPadWetness>
	//*  24   48:iload_1         
	//*  25   49:invokevirtual   #304 <Method void SettingsUIServiceData.setIntegerSetting(SettingType, int)>
	//*  26   52:aload_0         
	//*  27   53:getfield        #307 <Field SettingsSubsystem b>
	//*  28   56:getstatic       #313 <Field SettingsUIServiceCommand SettingsUIServiceCommand.SetCleaningPreference>
	//*  29   59:aload_3         
	//*  30   60:invokevirtual   #319 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
	//*  31   63:return          
		{
			o.e(c, "Unexpected pad wetness.");
	//   32   64:getstatic       #47  <Field String c>
	//   33   67:ldc2            #321 <String "Unexpected pad wetness.">
	//   34   70:invokestatic    #325 <Method void o.e(String, String)>
			return;
	//   35   73:return          
		}
		i1 = robotpadwetnesslevel.ordinal();
		settingsuiservicedata.setIntegerSetting(SettingType.RobotPadWetness, i1);
		b.sendCommand(SettingsUIServiceCommand.SetCleaningPreference, settingsuiservicedata);
	}

	public void onClick(View view)
	{
		if(view == j)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #142 <Field ImageView j>
	//*   3    5:if_acmpne       19
			k.showAsDropDown(((View) (j)));
	//    4    8:aload_0         
	//    5    9:getfield        #172 <Field PopupWindow k>
	//    6   12:aload_0         
	//    7   13:getfield        #142 <Field ImageView j>
	//    8   16:invokevirtual   #330 <Method void PopupWindow.showAsDropDown(View)>
	//    9   19:return          
	}

	private static final String c = com.irobot.home.util.j.r(((Class) (com/irobot/home/fragments/bm)).getSimpleName());
	private ag d;
	private List e;
	private View f;
	private LinearLayout i;
	private ImageView j;
	private PopupWindow k;
	private ListView l;
	private DiscreteSeekBar m;
	private android.widget.AdapterView.OnItemClickListener n;

	static 
	{
	//    0    0:ldc1            #2   <Class bm>
	//    1    2:invokevirtual   #39  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #45  <Method String j.r(String)>
	//    3    8:putstatic       #47  <Field String c>
	//*   4   11:return          
	}
}
