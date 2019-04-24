// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.y;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetInfo;
import com.irobot.core.FloorPlanListItem;
import com.irobot.core.ScheduleLocationType;
import com.irobot.core.ScheduleMapData;
import com.irobot.home.model.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomRadioButton;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home.fragments:
//			j, p, o, aw, 
//			Toolbar

public class aw extends com.irobot.home.fragments.j
	implements o.b
{
	public static interface a
	{

		public abstract void b(boolean flag);
	}


	public aw()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void com.irobot.home.fragments.j()>
	//    2    4:aload_0         
	//    3    5:ldc1            #55  <String "PScheduleLocationFrag">
	//    4    7:putfield        #57  <Field String a>
		m = ScheduleLocationType.Everywhere;
	//    5   10:aload_0         
	//    6   11:getstatic       #62  <Field ScheduleLocationType ScheduleLocationType.Everywhere>
	//    7   14:putfield        #64  <Field ScheduleLocationType m>
		n = new ArrayList();
	//    8   17:aload_0         
	//    9   18:new             #66  <Class ArrayList>
	//   10   21:dup             
	//   11   22:invokespecial   #67  <Method void ArrayList()>
	//   12   25:putfield        #69  <Field ArrayList n>
		s = false;
	//   13   28:aload_0         
	//   14   29:iconst_0        
	//   15   30:putfield        #71  <Field boolean s>
		w = new a() {

			public void b(boolean flag)
			{
			//    0    0:return          
			}

			final aw a;

			
			{
				a = aw.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field aw a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   16   33:aload_0         
	//   17   34:new             #8   <Class aw$1>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:invokespecial   #74  <Method void aw$1(aw)>
	//   21   42:putfield        #76  <Field aw$a w>
	//   22   45:return          
	}

	private void a(int i1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(i1 == 0x7f09038b)
			break MISSING_BLOCK_LABEL_90;
	//    2    2:iload_1         
	//    3    3:ldc1            #79  <Int 0x7f09038b>
	//    4    5:icmpeq          90
		if(i1 == 0x7f090392)
			break MISSING_BLOCK_LABEL_24;
	//    5    8:iload_1         
	//    6    9:ldc1            #80  <Int 0x7f090392>
	//    7   11:icmpeq          24
		com.irobot.home.util.o.d("PScheduleLocationFrag", "Unknown location type selected. Cannot set.");
	//    8   14:ldc1            #55  <String "PScheduleLocationFrag">
	//    9   16:ldc1            #82  <String "Unknown location type selected. Cannot set.">
	//   10   18:invokestatic    #87  <Method void o.d(String, String)>
		break MISSING_BLOCK_LABEL_192;
	//   11   21:goto            192
		ScheduleLocationType schedulelocationtype;
		com.irobot.home.util.o.b("PScheduleLocationFrag", "Selected room type.");
	//   12   24:ldc1            #55  <String "PScheduleLocationFrag">
	//   13   26:ldc1            #89  <String "Selected room type.">
	//   14   28:invokestatic    #91  <Method void o.b(String, String)>
		f.setVisibility(0);
	//   15   31:aload_0         
	//   16   32:getfield        #93  <Field View f>
	//   17   35:iconst_0        
	//   18   36:invokevirtual   #98  <Method void View.setVisibility(int)>
		i.setVisibility(0);
	//   19   39:aload_0         
	//   20   40:getfield        #100 <Field FrameLayout i>
	//   21   43:iconst_0        
	//   22   44:invokevirtual   #103 <Method void FrameLayout.setVisibility(int)>
		j.setVisibility(8);
	//   23   47:aload_0         
	//   24   48:getfield        #105 <Field CustomTextView j>
	//   25   51:bipush          8
	//   26   53:invokevirtual   #108 <Method void CustomTextView.setVisibility(int)>
		e.setTextColor(q);
	//   27   56:aload_0         
	//   28   57:getfield        #110 <Field CustomRadioButton e>
	//   29   60:aload_0         
	//   30   61:getfield        #112 <Field int q>
	//   31   64:invokevirtual   #117 <Method void CustomRadioButton.setTextColor(int)>
		d.setTextColor(p);
	//   32   67:aload_0         
	//   33   68:getfield        #119 <Field CustomRadioButton d>
	//   34   71:aload_0         
	//   35   72:getfield        #121 <Field int p>
	//   36   75:invokevirtual   #117 <Method void CustomRadioButton.setTextColor(int)>
		schedulelocationtype = ScheduleLocationType.Room;
	//   37   78:getstatic       #124 <Field ScheduleLocationType ScheduleLocationType.Room>
	//   38   81:astore_2        
_L1:
		m = schedulelocationtype;
	//   39   82:aload_0         
	//   40   83:aload_2         
	//   41   84:putfield        #64  <Field ScheduleLocationType m>
		break MISSING_BLOCK_LABEL_192;
	//   42   87:goto            192
		com.irobot.home.util.o.b("PScheduleLocationFrag", "Selected everywhere type.");
	//   43   90:ldc1            #55  <String "PScheduleLocationFrag">
	//   44   92:ldc1            #126 <String "Selected everywhere type.">
	//   45   94:invokestatic    #91  <Method void o.b(String, String)>
		k.setVisibility(8);
	//   46   97:aload_0         
	//   47   98:getfield        #128 <Field CustomTextView k>
	//   48  101:bipush          8
	//   49  103:invokevirtual   #108 <Method void CustomTextView.setVisibility(int)>
		f.setVisibility(8);
	//   50  106:aload_0         
	//   51  107:getfield        #93  <Field View f>
	//   52  110:bipush          8
	//   53  112:invokevirtual   #98  <Method void View.setVisibility(int)>
		i.setVisibility(8);
	//   54  115:aload_0         
	//   55  116:getfield        #100 <Field FrameLayout i>
	//   56  119:bipush          8
	//   57  121:invokevirtual   #103 <Method void FrameLayout.setVisibility(int)>
		j.setVisibility(0);
	//   58  124:aload_0         
	//   59  125:getfield        #105 <Field CustomTextView j>
	//   60  128:iconst_0        
	//   61  129:invokevirtual   #108 <Method void CustomTextView.setVisibility(int)>
		j.setText(((CharSequence) (getString(0x7f0f07c1, new Object[] {
			t, u
		}))));
	//   62  132:aload_0         
	//   63  133:getfield        #105 <Field CustomTextView j>
	//   64  136:aload_0         
	//   65  137:ldc1            #129 <Int 0x7f0f07c1>
	//   66  139:iconst_2        
	//   67  140:anewarray       Object[]
	//   68  143:dup             
	//   69  144:iconst_0        
	//   70  145:aload_0         
	//   71  146:getfield        #133 <Field String t>
	//   72  149:aastore         
	//   73  150:dup             
	//   74  151:iconst_1        
	//   75  152:aload_0         
	//   76  153:getfield        #135 <Field String u>
	//   77  156:aastore         
	//   78  157:invokevirtual   #139 <Method String getString(int, Object[])>
	//   79  160:invokevirtual   #143 <Method void CustomTextView.setText(CharSequence)>
		e.setTextColor(p);
	//   80  163:aload_0         
	//   81  164:getfield        #110 <Field CustomRadioButton e>
	//   82  167:aload_0         
	//   83  168:getfield        #121 <Field int p>
	//   84  171:invokevirtual   #117 <Method void CustomRadioButton.setTextColor(int)>
		d.setTextColor(q);
	//   85  174:aload_0         
	//   86  175:getfield        #119 <Field CustomRadioButton d>
	//   87  178:aload_0         
	//   88  179:getfield        #112 <Field int q>
	//   89  182:invokevirtual   #117 <Method void CustomRadioButton.setTextColor(int)>
		schedulelocationtype = ScheduleLocationType.Everywhere;
	//   90  185:getstatic       #62  <Field ScheduleLocationType ScheduleLocationType.Everywhere>
	//   91  188:astore_2        
		  goto _L1
	//*  92  189:goto            82
		f();
	//   93  192:aload_0         
	//   94  193:invokespecial   #145 <Method void f()>
		this;
	//   95  196:aload_0         
		JVM INSTR monitorexit ;
	//   96  197:monitorexit     
		return;
	//   97  198:return          
	//*  98  199:aload_0         
_L3:
		Exception exception;
		throw exception;
	//   99  200:monitorexit     
	//  100  201:aload_2         
	//  101  202:athrow          
		exception;
	//  102  203:astore_2        
		if(true) goto _L3; else goto _L2
_L2:
	//* 103  204:goto            199
	}

	static void a(aw aw1, int i1)
	{
		aw1.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #148 <Method void a(int)>
	//    3    5:return          
	}

	private void e()
	{
		if(v != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field com.irobot.home.fragments.o v>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		p.a a1 = com.irobot.home.fragments.p.k();
	//    4    8:invokestatic    #155 <Method p$a p.k()>
	//    5   11:astore_1        
		a1.a(n).a(o).a(r);
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #69  <Field ArrayList n>
	//    9   17:invokevirtual   #160 <Method p$a com.irobot.home.fragments.p$a.a(ArrayList)>
	//   10   20:aload_0         
	//   11   21:getfield        #162 <Field String o>
	//   12   24:invokevirtual   #165 <Method p$a com.irobot.home.fragments.p$a.a(String)>
	//   13   27:aload_0         
	//   14   28:getfield        #167 <Field boolean r>
	//   15   31:invokevirtual   #170 <Method p$a com.irobot.home.fragments.p$a.a(boolean)>
	//   16   34:pop             
		v = a1.a();
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokevirtual   #173 <Method com.irobot.home.fragments.o com.irobot.home.fragments.p$a.a()>
	//   20   40:putfield        #150 <Field com.irobot.home.fragments.o v>
		v.a(((o.b) (this)));
	//   21   43:aload_0         
	//   22   44:getfield        #150 <Field com.irobot.home.fragments.o v>
	//   23   47:aload_0         
	//   24   48:invokevirtual   #178 <Method void com.irobot.home.fragments.o.a(o$b)>
		if(!isDetached() && !isRemoving())
	//*  25   51:aload_0         
	//*  26   52:invokevirtual   #182 <Method boolean isDetached()>
	//*  27   55:ifne            84
	//*  28   58:aload_0         
	//*  29   59:invokevirtual   #185 <Method boolean isRemoving()>
	//*  30   62:ifne            84
			getChildFragmentManager().beginTransaction().replace(0x7f09038e, ((android.support.v4.app.Fragment) (v))).commitNow();
	//   31   65:aload_0         
	//   32   66:invokevirtual   #189 <Method FragmentManager getChildFragmentManager()>
	//   33   69:invokevirtual   #195 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   34   72:ldc1            #196 <Int 0x7f09038e>
	//   35   74:aload_0         
	//   36   75:getfield        #150 <Field com.irobot.home.fragments.o v>
	//   37   78:invokevirtual   #202 <Method FragmentTransaction FragmentTransaction.replace(int, android.support.v4.app.Fragment)>
	//   38   81:invokevirtual   #205 <Method void FragmentTransaction.commitNow()>
	//   39   84:return          
	}

	private void f()
	{
		int i1;
		boolean flag;
		boolean flag1;
		static class _cls3
		{

			static final int a[];

			static 
			{
				a = new int[ScheduleLocationType.values().length];
			//    0    0:invokestatic    #18  <Method ScheduleLocationType[] ScheduleLocationType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[ScheduleLocationType.Everywhere.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field ScheduleLocationType ScheduleLocationType.Everywhere>
			//    6   15:invokevirtual   #28  <Method int ScheduleLocationType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field ScheduleLocationType ScheduleLocationType.Room>
			//*  11   26:invokevirtual   #28  <Method int ScheduleLocationType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					a[ScheduleLocationType.Room.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		i1 = com.irobot.home.fragments._cls3.a[m.ordinal()];
	//    0    0:getstatic       #208 <Field int[] com.irobot.home.fragments.aw$3.a>
	//    1    3:aload_0         
	//    2    4:getfield        #64  <Field ScheduleLocationType m>
	//    3    7:invokevirtual   #212 <Method int ScheduleLocationType.ordinal()>
	//    4   10:iaload          
	//    5   11:istore_1        
		flag1 = true;
	//    6   12:iconst_1        
	//    7   13:istore_3        
		flag = flag1;
	//    8   14:iload_3         
	//    9   15:istore_2        
		i1;
	//   10   16:iload_1         
		JVM INSTR tableswitch 1 2: default 40
	//	               1 77
	//	               2 45;
	//   11   17:tableswitch     1 2: default 40
	//	               1 77
	//	               2 45
		   goto _L1 _L2 _L3
_L2:
		break; /* Loop/switch isn't completed */
_L1:
		flag = false;
	//   12   40:iconst_0        
	//   13   41:istore_2        
		break; /* Loop/switch isn't completed */
	//   14   42:goto            77
_L3:
		if(v == null || v.d() == null || v.g().size() <= 0) goto _L1; else goto _L4
	//   15   45:aload_0         
	//   16   46:getfield        #150 <Field com.irobot.home.fragments.o v>
	//   17   49:ifnull          40
	//   18   52:aload_0         
	//   19   53:getfield        #150 <Field com.irobot.home.fragments.o v>
	//   20   56:invokevirtual   #215 <Method String o.d()>
	//   21   59:ifnull          40
	//   22   62:aload_0         
	//   23   63:getfield        #150 <Field com.irobot.home.fragments.o v>
	//   24   66:invokevirtual   #219 <Method ArrayList o.g()>
	//   25   69:invokevirtual   #222 <Method int ArrayList.size()>
	//   26   72:ifle            40
_L4:
		flag = flag1;
	//   27   75:iload_3         
	//   28   76:istore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   29   77:new             #224 <Class StringBuilder>
	//   30   80:dup             
	//   31   81:invokespecial   #225 <Method void StringBuilder()>
	//   32   84:astore          4
		stringbuilder.append("Location is valid for saving: ");
	//   33   86:aload           4
	//   34   88:ldc1            #227 <String "Location is valid for saving: ">
	//   35   90:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//   36   93:pop             
		stringbuilder.append(flag);
	//   37   94:aload           4
	//   38   96:iload_2         
	//   39   97:invokevirtual   #234 <Method StringBuilder StringBuilder.append(boolean)>
	//   40  100:pop             
		com.irobot.home.util.o.b("PScheduleLocationFrag", stringbuilder.toString());
	//   41  101:ldc1            #55  <String "PScheduleLocationFrag">
	//   42  103:aload           4
	//   43  105:invokevirtual   #237 <Method String StringBuilder.toString()>
	//   44  108:invokestatic    #91  <Method void o.b(String, String)>
		w.b(flag);
	//   45  111:aload_0         
	//   46  112:getfield        #76  <Field aw$a w>
	//   47  115:iload_2         
	//   48  116:invokeinterface #240 <Method void aw$a.b(boolean)>
		return;
	//   49  121:return          
	}

	protected void a()
	{
		Object obj = ((Object) (com.irobot.home.util.j.j().a()));
	//    0    0:invokestatic    #245 <Method a j.j()>
	//    1    3:invokevirtual   #250 <Method AssetInfo a.a()>
	//    2    6:astore_2        
		t = ((AssetInfo) (obj)).getName();
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:invokevirtual   #255 <Method String AssetInfo.getName()>
	//    6   12:putfield        #133 <Field String t>
		int i1;
		if(AssetCapabilityUtils.isVacuumingRobot(((AssetInfo) (obj))))
	//*   7   15:aload_2         
	//*   8   16:invokestatic    #261 <Method boolean AssetCapabilityUtils.isVacuumingRobot(AssetInfo)>
	//*   9   19:ifeq            38
			i1 = 0x7f0f0950;
	//   10   22:ldc2            #262 <Int 0x7f0f0950>
	//   11   25:istore_1        
		else
	//*  12   26:aload_0         
	//*  13   27:aload_0         
	//*  14   28:iload_1         
	//*  15   29:invokevirtual   #265 <Method String getString(int)>
	//*  16   32:putfield        #135 <Field String u>
	//*  17   35:goto            52
		if(AssetCapabilityUtils.isMoppingRobot(((AssetInfo) (obj))))
	//*  18   38:aload_2         
	//*  19   39:invokestatic    #268 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//*  20   42:ifeq            140
		{
			i1 = 0x7f0f049b;
	//   21   45:ldc2            #269 <Int 0x7f0f049b>
	//   22   48:istore_1        
		} else
	//*  23   49:goto            26
	//*  24   52:aload_0         
	//*  25   53:getfield        #271 <Field RadioGroup c>
	//*  26   56:new             #10  <Class aw$2>
	//*  27   59:dup             
	//*  28   60:aload_0         
	//*  29   61:invokespecial   #272 <Method void aw$2(aw)>
	//*  30   64:invokevirtual   #278 <Method void RadioGroup.setOnCheckedChangeListener(android.widget.RadioGroup$OnCheckedChangeListener)>
	//*  31   67:getstatic       #208 <Field int[] com.irobot.home.fragments.aw$3.a>
	//*  32   70:aload_0         
	//*  33   71:getfield        #64  <Field ScheduleLocationType m>
	//*  34   74:invokevirtual   #212 <Method int ScheduleLocationType.ordinal()>
	//*  35   77:iaload          
	//*  36   78:tableswitch     1 2: default 100
	//	               1 122
	//	               2 111
	//*  37  100:ldc1            #55  <String "PScheduleLocationFrag">
	//*  38  102:ldc2            #280 <String "Tried to set cleaning location type to an unknown value.">
	//*  39  105:invokestatic    #282 <Method void o.e(String, String)>
	//*  40  108:goto            135
	//*  41  111:aload_0         
	//*  42  112:getfield        #271 <Field RadioGroup c>
	//*  43  115:astore_2        
	//*  44  116:ldc1            #80  <Int 0x7f090392>
	//*  45  118:istore_1        
	//*  46  119:goto            130
	//*  47  122:aload_0         
	//*  48  123:getfield        #271 <Field RadioGroup c>
	//*  49  126:astore_2        
	//*  50  127:ldc1            #79  <Int 0x7f09038b>
	//*  51  129:istore_1        
	//*  52  130:aload_2         
	//*  53  131:iload_1         
	//*  54  132:invokevirtual   #285 <Method void RadioGroup.check(int)>
	//*  55  135:aload_0         
	//*  56  136:invokespecial   #287 <Method void e()>
	//*  57  139:return          
		{
			com.irobot.home.util.o.e("PScheduleLocationFrag", "Failed to find action verb for asset.");
	//   58  140:ldc1            #55  <String "PScheduleLocationFrag">
	//   59  142:ldc2            #289 <String "Failed to find action verb for asset.">
	//   60  145:invokestatic    #282 <Method void o.e(String, String)>
			junit.b.a.a("Asset type not supported");
	//   61  148:ldc2            #291 <String "Asset type not supported">
	//   62  151:invokestatic    #296 <Method void junit.b.a.a(String)>
			getActivity().finish();
	//   63  154:aload_0         
	//   64  155:invokevirtual   #300 <Method FragmentActivity getActivity()>
	//   65  158:invokevirtual   #305 <Method void FragmentActivity.finish()>
			return;
	//   66  161:return          
		}
		u = getString(i1);
		c.setOnCheckedChangeListener(((android.widget.RadioGroup.OnCheckedChangeListener) (new y(this) {

			public void a(View view)
			{
				b.a.setVisibility(0);
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field aw b>
			//    2    4:getfield        #30  <Field Toolbar android.support.v7.widget.aw.a>
			//    3    7:iconst_0        
			//    4    8:invokevirtual   #36  <Method void Toolbar.setVisibility(int)>
			//    5   11:return          
			}

			public void b(View view)
			{
				if(!c)
			//*   0    0:aload_0         
			//*   1    1:getfield        #25  <Field boolean c>
			//*   2    4:ifne            21
					b.a.setVisibility(a);
			//    3    7:aload_0         
			//    4    8:getfield        #18  <Field aw b>
			//    5   11:getfield        #30  <Field Toolbar android.support.v7.widget.aw.a>
			//    6   14:aload_0         
			//    7   15:getfield        #20  <Field int a>
			//    8   18:invokevirtual   #36  <Method void Toolbar.setVisibility(int)>
			//    9   21:return          
			}

			public void c(View view)
			{
				c = true;
			//    0    0:aload_0         
			//    1    1:iconst_1        
			//    2    2:putfield        #25  <Field boolean c>
			//    3    5:return          
			}

			final int a;
			final aw b;
			private boolean c;

			
			{
				b = aw1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field aw b>
				a = i1;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field int a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void y()>
				c = false;
			//    8   14:aload_0         
			//    9   15:iconst_0        
			//   10   16:putfield        #25  <Field boolean c>
			//   11   19:return          
			}
		}
)));
		com.irobot.home.fragments._cls3.a[m.ordinal()];
		JVM INSTR tableswitch 1 2: default 100
	//	               1 122
	//	               2 111;
		   goto _L1 _L2 _L3
_L1:
		com.irobot.home.util.o.e("PScheduleLocationFrag", "Tried to set cleaning location type to an unknown value.");
		  goto _L4
_L3:
		obj = ((Object) (c));
		i1 = 0x7f090392;
		  goto _L5
_L2:
		obj = ((Object) (c));
		i1 = 0x7f09038b;
_L5:
		((RadioGroup) (obj)).check(i1);
_L4:
		e();
		return;
	}

	public void a(a a1)
	{
		if(a1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			w = a1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #76  <Field aw$a w>
	//    5    9:return          
	}

	public void a(ArrayList arraylist)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #224 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #225 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Received floor list with contents: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #309 <String "Received floor list with contents: ">
	//    6   12:invokevirtual   #231 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object) (arraylist)));
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #312 <Method StringBuilder StringBuilder.append(Object)>
	//   11   21:pop             
		com.irobot.home.util.o.b("PScheduleLocationFrag", stringbuilder.toString());
	//   12   22:ldc1            #55  <String "PScheduleLocationFrag">
	//   13   24:aload_2         
	//   14   25:invokevirtual   #237 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #91  <Method void o.b(String, String)>
		if(arraylist.isEmpty())
	//*  16   31:aload_1         
	//*  17   32:invokevirtual   #315 <Method boolean ArrayList.isEmpty()>
	//*  18   35:ifeq            49
		{
			a(0x7f09038b);
	//   19   38:aload_0         
	//   20   39:ldc1            #79  <Int 0x7f09038b>
	//   21   41:invokespecial   #148 <Method void a(int)>
			d();
	//   22   44:aload_0         
	//   23   45:invokevirtual   #317 <Method void d()>
			return;
	//   24   48:return          
		} else
		{
			k.setVisibility(8);
	//   25   49:aload_0         
	//   26   50:getfield        #128 <Field CustomTextView k>
	//   27   53:bipush          8
	//   28   55:invokevirtual   #108 <Method void CustomTextView.setVisibility(int)>
			b.setVisibility(0);
	//   29   58:aload_0         
	//   30   59:getfield        #319 <Field View b>
	//   31   62:iconst_0        
	//   32   63:invokevirtual   #98  <Method void View.setVisibility(int)>
			l.setVisibility(8);
	//   33   66:aload_0         
	//   34   67:getfield        #321 <Field ProgressBar l>
	//   35   70:bipush          8
	//   36   72:invokevirtual   #324 <Method void ProgressBar.setVisibility(int)>
			a(c.getCheckedRadioButtonId());
	//   37   75:aload_0         
	//   38   76:aload_0         
	//   39   77:getfield        #271 <Field RadioGroup c>
	//   40   80:invokevirtual   #327 <Method int RadioGroup.getCheckedRadioButtonId()>
	//   41   83:invokespecial   #148 <Method void a(int)>
			return;
	//   42   86:return          
		}
	}

	public void a(ArrayList arraylist, FloorPlanListItem floorplanlistitem)
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #145 <Method void f()>
	//    2    4:return          
	}

	public ScheduleLocationType b()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field ScheduleLocationType m>
	//    2    4:areturn         
	}

	public ScheduleMapData c()
	{
		return new ScheduleMapData(v.d(), v.e(), v.f(), v.g(), v.h(), false);
	//    0    0:new             #335 <Class ScheduleMapData>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #150 <Field com.irobot.home.fragments.o v>
	//    4    8:invokevirtual   #215 <Method String o.d()>
	//    5   11:aload_0         
	//    6   12:getfield        #150 <Field com.irobot.home.fragments.o v>
	//    7   15:invokevirtual   #337 <Method String o.e()>
	//    8   18:aload_0         
	//    9   19:getfield        #150 <Field com.irobot.home.fragments.o v>
	//   10   22:invokevirtual   #339 <Method String o.f()>
	//   11   25:aload_0         
	//   12   26:getfield        #150 <Field com.irobot.home.fragments.o v>
	//   13   29:invokevirtual   #219 <Method ArrayList o.g()>
	//   14   32:aload_0         
	//   15   33:getfield        #150 <Field com.irobot.home.fragments.o v>
	//   16   36:invokevirtual   #342 <Method ArrayList o.h()>
	//   17   39:iconst_0        
	//   18   40:invokespecial   #345 <Method void ScheduleMapData(String, String, String, ArrayList, ArrayList, boolean)>
	//   19   43:areturn         
	}

	protected void d()
	{
		if(s)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean s>
	//*   2    4:ifeq            56
		{
			l.setVisibility(8);
	//    3    7:aload_0         
	//    4    8:getfield        #321 <Field ProgressBar l>
	//    5   11:bipush          8
	//    6   13:invokevirtual   #324 <Method void ProgressBar.setVisibility(int)>
			k.setVisibility(0);
	//    7   16:aload_0         
	//    8   17:getfield        #128 <Field CustomTextView k>
	//    9   20:iconst_0        
	//   10   21:invokevirtual   #108 <Method void CustomTextView.setVisibility(int)>
			AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//   11   24:invokestatic    #245 <Method a j.j()>
	//   12   27:invokevirtual   #250 <Method AssetInfo a.a()>
	//   13   30:astore_1        
			k.setText(((CharSequence) (getString(0x7f0f07ce, new Object[] {
				assetinfo.getName()
			}))));
	//   14   31:aload_0         
	//   15   32:getfield        #128 <Field CustomTextView k>
	//   16   35:aload_0         
	//   17   36:ldc2            #346 <Int 0x7f0f07ce>
	//   18   39:iconst_1        
	//   19   40:anewarray       Object[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:aload_1         
	//   23   46:invokevirtual   #255 <Method String AssetInfo.getName()>
	//   24   49:aastore         
	//   25   50:invokevirtual   #139 <Method String getString(int, Object[])>
	//   26   53:invokevirtual   #143 <Method void CustomTextView.setText(CharSequence)>
		}
	//   27   56:return          
	}

	public void h()
	{
		com.irobot.home.util.o.b("PScheduleLocationFrag", "No floor plan items found!");
	//    0    0:ldc1            #55  <String "PScheduleLocationFrag">
	//    1    2:ldc2            #348 <String "No floor plan items found!">
	//    2    5:invokestatic    #91  <Method void o.b(String, String)>
		d();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #317 <Method void d()>
	//    5   12:return          
	}

	public void i()
	{
		l.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field ProgressBar l>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #324 <Method void ProgressBar.setVisibility(int)>
		b.setVisibility(8);
	//    4    8:aload_0         
	//    5    9:getfield        #319 <Field View b>
	//    6   12:bipush          8
	//    7   14:invokevirtual   #98  <Method void View.setVisibility(int)>
	//    8   17:return          
	}

	public final String a = "PScheduleLocationFrag";
	View b;
	RadioGroup c;
	CustomRadioButton d;
	CustomRadioButton e;
	View f;
	FrameLayout i;
	CustomTextView j;
	CustomTextView k;
	ProgressBar l;
	ScheduleLocationType m;
	ArrayList n;
	String o;
	int p;
	int q;
	boolean r;
	boolean s;
	private String t;
	private String u;
	private com.irobot.home.fragments.o v;
	private a w;
}
