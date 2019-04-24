// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.app.TimePickerDialog;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.a;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import com.irobot.core.AssetCapabilityUtils;
import com.irobot.core.AssetInfo;
import com.irobot.core.ScheduleMultipleMappingType;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomCheckedTextView;
import com.irobot.home.view.CustomRadioButton;
import com.irobot.home.view.CustomTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.b.a.b;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class ba extends com.irobot.home.fragments.j
	implements android.app.TimePickerDialog.OnTimeSetListener
{
	public static interface a
	{

		public abstract void a(boolean flag);
	}


	public ba()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void com.irobot.home.fragments.j()>
	//    2    4:aload_0         
	//    3    5:ldc1            #53  <String "PScheduleTimeFragment">
	//    4    7:putfield        #55  <Field String r>
	//    5   10:aload_0         
	//    6   11:bipush          9
	//    7   13:putfield        #57  <Field int s>
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #59  <Field int t>
		k = ScheduleMultipleMappingType.Normal;
	//   11   21:aload_0         
	//   12   22:getstatic       #64  <Field ScheduleMultipleMappingType ScheduleMultipleMappingType.Normal>
	//   13   25:putfield        #66  <Field ScheduleMultipleMappingType k>
		l = 9;
	//   14   28:aload_0         
	//   15   29:bipush          9
	//   16   31:putfield        #68  <Field int l>
		m = 0;
	//   17   34:aload_0         
	//   18   35:iconst_0        
	//   19   36:putfield        #70  <Field int m>
		v = new a() {

			public void a(boolean flag)
			{
			//    0    0:return          
			}

			final ba a;

			
			{
				a = ba.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ba a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   20   39:aload_0         
	//   21   40:new             #8   <Class ba$1>
	//   22   43:dup             
	//   23   44:aload_0         
	//   24   45:invokespecial   #73  <Method void ba$1(ba)>
	//   25   48:putfield        #75  <Field ba$a v>
	//   26   51:return          
	}

	private void a(int i1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(i1 == 0x7f090396)
			break MISSING_BLOCK_LABEL_80;
	//    2    2:iload_1         
	//    3    3:ldc1            #78  <Int 0x7f090396>
	//    4    5:icmpeq          80
		if(i1 == 0x7f0903a2)
			break MISSING_BLOCK_LABEL_24;
	//    5    8:iload_1         
	//    6    9:ldc1            #79  <Int 0x7f0903a2>
	//    7   11:icmpeq          24
		com.irobot.home.util.o.d("PScheduleTimeFragment", "Unknown schedule type selected. Cannot update choices.");
	//    8   14:ldc1            #53  <String "PScheduleTimeFragment">
	//    9   16:ldc1            #81  <String "Unknown schedule type selected. Cannot update choices.">
	//   10   18:invokestatic    #86  <Method void o.d(String, String)>
		break MISSING_BLOCK_LABEL_133;
	//   11   21:goto            133
		com.irobot.home.util.o.b("PScheduleTimeFragment", "Weekly selected.");
	//   12   24:ldc1            #53  <String "PScheduleTimeFragment">
	//   13   26:ldc1            #88  <String "Weekly selected.">
	//   14   28:invokestatic    #90  <Method void o.b(String, String)>
		k = ScheduleMultipleMappingType.Normal;
	//   15   31:aload_0         
	//   16   32:getstatic       #64  <Field ScheduleMultipleMappingType ScheduleMultipleMappingType.Normal>
	//   17   35:putfield        #66  <Field ScheduleMultipleMappingType k>
		i.setTextColor(o);
	//   18   38:aload_0         
	//   19   39:getfield        #92  <Field CustomRadioButton i>
	//   20   42:aload_0         
	//   21   43:getfield        #94  <Field int o>
	//   22   46:invokevirtual   #99  <Method void CustomRadioButton.setTextColor(int)>
		f.setTextColor(p);
	//   23   49:aload_0         
	//   24   50:getfield        #101 <Field CustomRadioButton f>
	//   25   53:aload_0         
	//   26   54:getfield        #103 <Field int p>
	//   27   57:invokevirtual   #99  <Method void CustomRadioButton.setTextColor(int)>
		d.setVisibility(8);
	//   28   60:aload_0         
	//   29   61:getfield        #105 <Field CustomTextView d>
	//   30   64:bipush          8
	//   31   66:invokevirtual   #110 <Method void CustomTextView.setVisibility(int)>
		b.setVisibility(0);
	//   32   69:aload_0         
	//   33   70:getfield        #112 <Field LinearLayout b>
	//   34   73:iconst_0        
	//   35   74:invokevirtual   #115 <Method void LinearLayout.setVisibility(int)>
		break MISSING_BLOCK_LABEL_133;
	//   36   77:goto            133
		com.irobot.home.util.o.b("PScheduleTimeFragment", "One time selected.");
	//   37   80:ldc1            #53  <String "PScheduleTimeFragment">
	//   38   82:ldc1            #117 <String "One time selected.">
	//   39   84:invokestatic    #90  <Method void o.b(String, String)>
		k = ScheduleMultipleMappingType.Once;
	//   40   87:aload_0         
	//   41   88:getstatic       #120 <Field ScheduleMultipleMappingType ScheduleMultipleMappingType.Once>
	//   42   91:putfield        #66  <Field ScheduleMultipleMappingType k>
		f.setTextColor(o);
	//   43   94:aload_0         
	//   44   95:getfield        #101 <Field CustomRadioButton f>
	//   45   98:aload_0         
	//   46   99:getfield        #94  <Field int o>
	//   47  102:invokevirtual   #99  <Method void CustomRadioButton.setTextColor(int)>
		i.setTextColor(p);
	//   48  105:aload_0         
	//   49  106:getfield        #92  <Field CustomRadioButton i>
	//   50  109:aload_0         
	//   51  110:getfield        #103 <Field int p>
	//   52  113:invokevirtual   #99  <Method void CustomRadioButton.setTextColor(int)>
		d.setVisibility(0);
	//   53  116:aload_0         
	//   54  117:getfield        #105 <Field CustomTextView d>
	//   55  120:iconst_0        
	//   56  121:invokevirtual   #110 <Method void CustomTextView.setVisibility(int)>
		b.setVisibility(8);
	//   57  124:aload_0         
	//   58  125:getfield        #112 <Field LinearLayout b>
	//   59  128:bipush          8
	//   60  130:invokevirtual   #115 <Method void LinearLayout.setVisibility(int)>
		i();
	//   61  133:aload_0         
	//   62  134:invokespecial   #122 <Method void i()>
		this;
	//   63  137:aload_0         
		JVM INSTR monitorexit ;
	//   64  138:monitorexit     
		return;
	//   65  139:return          
	//*  66  140:aload_0         
_L2:
		Exception exception;
		throw exception;
	//   67  141:monitorexit     
	//   68  142:aload_2         
	//   69  143:athrow          
		exception;
	//   70  144:astore_2        
		if(true) goto _L2; else goto _L1
_L1:
	//*  71  145:goto            140
	}

	static void a(ba ba1, int i1)
	{
		ba1.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #125 <Method void a(int)>
	//    3    5:return          
	}

	private void h()
	{
		e.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() {

			public void onCheckedChanged(RadioGroup radiogroup1, int k1)
			{
				com.irobot.home.fragments.ba.a(a, k1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field ba a>
			//    2    4:iload_2         
			//    3    5:invokestatic    #25  <Method void com.irobot.home.fragments.ba.a(ba, int)>
			//    4    8:return          
			}

			final ba a;

			
			{
				a = ba.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ba a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field RadioGroup e>
	//    2    4:new             #10  <Class ba$2>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #129 <Method void ba$2(ba)>
	//    6   12:invokevirtual   #135 <Method void RadioGroup.setOnCheckedChangeListener(android.widget.RadioGroup$OnCheckedChangeListener)>
		if(k != ScheduleMultipleMappingType.Normal) goto _L2; else goto _L1
	//    7   15:aload_0         
	//    8   16:getfield        #66  <Field ScheduleMultipleMappingType k>
	//    9   19:getstatic       #64  <Field ScheduleMultipleMappingType ScheduleMultipleMappingType.Normal>
	//   10   22:if_acmpne       41
_L1:
		int i1;
		RadioGroup radiogroup;
		radiogroup = e;
	//   11   25:aload_0         
	//   12   26:getfield        #128 <Field RadioGroup e>
	//   13   29:astore_2        
		i1 = 0x7f0903a2;
	//   14   30:ldc1            #79  <Int 0x7f0903a2>
	//   15   32:istore_1        
_L4:
		radiogroup.check(i1);
	//   16   33:aload_2         
	//   17   34:iload_1         
	//   18   35:invokevirtual   #138 <Method void RadioGroup.check(int)>
		break MISSING_BLOCK_LABEL_69;
	//   19   38:goto            69
_L2:
		if(k != ScheduleMultipleMappingType.Once)
			break; /* Loop/switch isn't completed */
	//   20   41:aload_0         
	//   21   42:getfield        #66  <Field ScheduleMultipleMappingType k>
	//   22   45:getstatic       #120 <Field ScheduleMultipleMappingType ScheduleMultipleMappingType.Once>
	//   23   48:if_acmpne       62
		radiogroup = e;
	//   24   51:aload_0         
	//   25   52:getfield        #128 <Field RadioGroup e>
	//   26   55:astore_2        
		i1 = 0x7f090396;
	//   27   56:ldc1            #78  <Int 0x7f090396>
	//   28   58:istore_1        
		if(true) goto _L4; else goto _L3
	//   29   59:goto            33
_L3:
		com.irobot.home.util.o.d("PScheduleTimeFragment", "Unknown schedule type selected. Cannot set default.");
	//   30   62:ldc1            #53  <String "PScheduleTimeFragment">
	//   31   64:ldc1            #140 <String "Unknown schedule type selected. Cannot set default.">
	//   32   66:invokestatic    #86  <Method void o.d(String, String)>
		for(int j1 = 0; j1 < a.size(); j1++)
	//*  33   69:iconst_0        
	//*  34   70:istore_1        
	//*  35   71:iload_1         
	//*  36   72:aload_0         
	//*  37   73:getfield        #142 <Field List a>
	//*  38   76:invokeinterface #148 <Method int List.size()>
	//*  39   81:icmpge          136
		{
			CustomCheckedTextView customcheckedtextview = (CustomCheckedTextView)a.get(j1);
	//   40   84:aload_0         
	//   41   85:getfield        #142 <Field List a>
	//   42   88:iload_1         
	//   43   89:invokeinterface #152 <Method Object List.get(int)>
	//   44   94:checkcast       #154 <Class CustomCheckedTextView>
	//   45   97:astore_2        
			customcheckedtextview.setCheckMarkDrawable(((Drawable) (null)));
	//   46   98:aload_2         
	//   47   99:aconst_null     
	//   48  100:invokevirtual   #158 <Method void CustomCheckedTextView.setCheckMarkDrawable(Drawable)>
			if(j != null && j.contains(((Object) (Integer.valueOf(j1)))))
	//*  49  103:aload_0         
	//*  50  104:getfield        #160 <Field ArrayList j>
	//*  51  107:ifnull          129
	//*  52  110:aload_0         
	//*  53  111:getfield        #160 <Field ArrayList j>
	//*  54  114:iload_1         
	//*  55  115:invokestatic    #166 <Method Integer Integer.valueOf(int)>
	//*  56  118:invokevirtual   #172 <Method boolean ArrayList.contains(Object)>
	//*  57  121:ifeq            129
				a(((View) (customcheckedtextview)));
	//   58  124:aload_0         
	//   59  125:aload_2         
	//   60  126:invokevirtual   #175 <Method void a(View)>
		}

	//   61  129:iload_1         
	//   62  130:iconst_1        
	//   63  131:iadd            
	//   64  132:istore_1        
	//*  65  133:goto            71
		return;
	//   66  136:return          
	}

	private void i()
	{
		boolean flag;
		if(k != ScheduleMultipleMappingType.Once && g().size() <= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field ScheduleMultipleMappingType k>
	//*   2    4:getstatic       #120 <Field ScheduleMultipleMappingType ScheduleMultipleMappingType.Once>
	//*   3    7:if_acmpeq       28
	//*   4   10:aload_0         
	//*   5   11:invokevirtual   #179 <Method ArrayList g()>
	//*   6   14:invokevirtual   #180 <Method int ArrayList.size()>
	//*   7   17:ifle            23
	//*   8   20:goto            28
			flag = false;
	//    9   23:iconst_0        
	//   10   24:istore_1        
		else
	//*  11   25:goto            30
			flag = true;
	//   12   28:iconst_1        
	//   13   29:istore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   14   30:new             #182 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #183 <Method void StringBuilder()>
	//   17   37:astore_2        
		stringbuilder.append("Time is valid for saving: ");
	//   18   38:aload_2         
	//   19   39:ldc1            #185 <String "Time is valid for saving: ">
	//   20   41:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
		stringbuilder.append(flag);
	//   22   45:aload_2         
	//   23   46:iload_1         
	//   24   47:invokevirtual   #192 <Method StringBuilder StringBuilder.append(boolean)>
	//   25   50:pop             
		com.irobot.home.util.o.b("PScheduleTimeFragment", stringbuilder.toString());
	//   26   51:ldc1            #53  <String "PScheduleTimeFragment">
	//   27   53:aload_2         
	//   28   54:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   29   57:invokestatic    #90  <Method void o.b(String, String)>
		v.a(flag);
	//   30   60:aload_0         
	//   31   61:getfield        #75  <Field ba$a v>
	//   32   64:iload_1         
	//   33   65:invokeinterface #199 <Method void com.irobot.home.fragments.ba$a.a(boolean)>
	//   34   70:return          
	}

	protected void a()
	{
		u = android.support.v4.content.a.getDrawable(((android.content.Context) (getActivity())), q);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #203 <Method FragmentActivity getActivity()>
	//    3    5:aload_0         
	//    4    6:getfield        #205 <Field int q>
	//    5    9:invokestatic    #211 <Method Drawable a.getDrawable(android.content.Context, int)>
	//    6   12:putfield        #213 <Field Drawable u>
		h();
	//    7   15:aload_0         
	//    8   16:invokespecial   #215 <Method void h()>
	//    9   19:return          
	}

	protected void a(View view)
	{
		int i1 = Integer.parseInt((String)view.getTag());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #221 <Method Object View.getTag()>
	//    2    4:checkcast       #223 <Class String>
	//    3    7:invokestatic    #227 <Method int Integer.parseInt(String)>
	//    4   10:istore_2        
		view = ((View) (new StringBuilder()));
	//    5   11:new             #182 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #183 <Method void StringBuilder()>
	//    8   18:astore_1        
		((StringBuilder) (view)).append("Day pressed: ");
	//    9   19:aload_1         
	//   10   20:ldc1            #229 <String "Day pressed: ">
	//   11   22:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:pop             
		((StringBuilder) (view)).append(i1);
	//   13   26:aload_1         
	//   14   27:iload_2         
	//   15   28:invokevirtual   #232 <Method StringBuilder StringBuilder.append(int)>
	//   16   31:pop             
		com.irobot.home.util.o.b("PScheduleTimeFragment", ((StringBuilder) (view)).toString());
	//   17   32:ldc1            #53  <String "PScheduleTimeFragment">
	//   18   34:aload_1         
	//   19   35:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   20   38:invokestatic    #90  <Method void o.b(String, String)>
		view = ((View) ((CustomCheckedTextView)a.get(i1)));
	//   21   41:aload_0         
	//   22   42:getfield        #142 <Field List a>
	//   23   45:iload_2         
	//   24   46:invokeinterface #152 <Method Object List.get(int)>
	//   25   51:checkcast       #154 <Class CustomCheckedTextView>
	//   26   54:astore_1        
		((CustomCheckedTextView) (view)).toggle();
	//   27   55:aload_1         
	//   28   56:invokevirtual   #235 <Method void CustomCheckedTextView.toggle()>
		if(((CustomCheckedTextView) (view)).isChecked())
	//*  29   59:aload_1         
	//*  30   60:invokevirtual   #239 <Method boolean CustomCheckedTextView.isChecked()>
	//*  31   63:ifeq            74
			i1 = n;
	//   32   66:aload_0         
	//   33   67:getfield        #241 <Field int n>
	//   34   70:istore_2        
		else
	//*  35   71:goto            79
			i1 = p;
	//   36   74:aload_0         
	//   37   75:getfield        #103 <Field int p>
	//   38   78:istore_2        
		((CustomCheckedTextView) (view)).setTextColor(i1);
	//   39   79:aload_1         
	//   40   80:iload_2         
	//   41   81:invokevirtual   #242 <Method void CustomCheckedTextView.setTextColor(int)>
		i();
	//   42   84:aload_0         
	//   43   85:invokespecial   #122 <Method void i()>
	//   44   88:return          
	}

	public void a(a a1)
	{
		if(a1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			v = a1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #75  <Field ba$a v>
	//    5    9:return          
	}

	protected void b()
	{
		TimePickerDialog timepickerdialog = new TimePickerDialog(((android.content.Context) (getActivity())), ((android.app.TimePickerDialog.OnTimeSetListener) (this)), l, m, w);
	//    0    0:new             #245 <Class TimePickerDialog>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #203 <Method FragmentActivity getActivity()>
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #68  <Field int l>
	//    7   13:aload_0         
	//    8   14:getfield        #70  <Field int m>
	//    9   17:aload_0         
	//   10   18:getfield        #247 <Field boolean w>
	//   11   21:invokespecial   #250 <Method void TimePickerDialog(android.content.Context, android.app.TimePickerDialog$OnTimeSetListener, int, int, boolean)>
	//   12   24:astore_1        
		timepickerdialog.setTitle(((CharSequence) (null)));
	//   13   25:aload_1         
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #254 <Method void TimePickerDialog.setTitle(CharSequence)>
		timepickerdialog.setCustomTitle(((View) (null)));
	//   16   30:aload_1         
	//   17   31:aconst_null     
	//   18   32:invokevirtual   #257 <Method void TimePickerDialog.setCustomTitle(View)>
		timepickerdialog.show();
	//   19   35:aload_1         
	//   20   36:invokevirtual   #260 <Method void TimePickerDialog.show()>
	//   21   39:return          
	}

	protected void c()
	{
		String s1;
		String s2;
		Object obj;
		Object obj1;
		String s3;
		String s4;
		AssetInfo assetinfo;
		obj = ((Object) ((new b()).a(l).b(m).g()));
	//    0    0:new             #262 <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #263 <Method void b()>
	//    3    7:aload_0         
	//    4    8:getfield        #68  <Field int l>
	//    5   11:invokevirtual   #266 <Method b b.a(int)>
	//    6   14:aload_0         
	//    7   15:getfield        #70  <Field int m>
	//    8   18:invokevirtual   #268 <Method b b.b(int)>
	//    9   21:invokevirtual   #271 <Method java.util.Date b.g()>
	//   10   24:astore          4
		s3 = (new SimpleDateFormat("mm")).format(((java.util.Date) (obj)));
	//   11   26:new             #273 <Class SimpleDateFormat>
	//   12   29:dup             
	//   13   30:ldc2            #275 <String "mm">
	//   14   33:invokespecial   #278 <Method void SimpleDateFormat(String)>
	//   15   36:aload           4
	//   16   38:invokevirtual   #282 <Method String SimpleDateFormat.format(java.util.Date)>
	//   17   41:astore          6
		if(w)
	//*  18   43:aload_0         
	//*  19   44:getfield        #247 <Field boolean w>
	//*  20   47:ifeq            103
		{
			s1 = "";
	//   21   50:ldc2            #284 <String "">
	//   22   53:astore_2        
			s2 = (new SimpleDateFormat("HH")).format(((java.util.Date) (obj)));
	//   23   54:new             #273 <Class SimpleDateFormat>
	//   24   57:dup             
	//   25   58:ldc2            #286 <String "HH">
	//   26   61:invokespecial   #278 <Method void SimpleDateFormat(String)>
	//   27   64:aload           4
	//   28   66:invokevirtual   #282 <Method String SimpleDateFormat.format(java.util.Date)>
	//   29   69:astore_3        
			obj1 = ((Object) (c));
	//   30   70:aload_0         
	//   31   71:getfield        #288 <Field CustomTextView c>
	//   32   74:astore          5
			obj = ((Object) ((new SimpleDateFormat("HH:mm")).format(((java.util.Date) (obj)))));
	//   33   76:new             #273 <Class SimpleDateFormat>
	//   34   79:dup             
	//   35   80:ldc2            #290 <String "HH:mm">
	//   36   83:invokespecial   #278 <Method void SimpleDateFormat(String)>
	//   37   86:aload           4
	//   38   88:invokevirtual   #282 <Method String SimpleDateFormat.format(java.util.Date)>
	//   39   91:astore          4
		} else
	//*  40   93:aload           5
	//*  41   95:aload           4
	//*  42   97:invokevirtual   #293 <Method void CustomTextView.setText(CharSequence)>
	//*  43  100:goto            207
		{
			int i1;
			if(l < 12)
	//*  44  103:aload_0         
	//*  45  104:getfield        #68  <Field int l>
	//*  46  107:bipush          12
	//*  47  109:icmpge          119
				i1 = 0x7f0f0090;
	//   48  112:ldc2            #294 <Int 0x7f0f0090>
	//   49  115:istore_1        
			else
	//*  50  116:goto            123
				i1 = 0x7f0f0621;
	//   51  119:ldc2            #295 <Int 0x7f0f0621>
	//   52  122:istore_1        
			s1 = getString(i1);
	//   53  123:aload_0         
	//   54  124:iload_1         
	//   55  125:invokevirtual   #299 <Method String getString(int)>
	//   56  128:astore_2        
			s2 = (new SimpleDateFormat("hh")).format(((java.util.Date) (obj)));
	//   57  129:new             #273 <Class SimpleDateFormat>
	//   58  132:dup             
	//   59  133:ldc2            #301 <String "hh">
	//   60  136:invokespecial   #278 <Method void SimpleDateFormat(String)>
	//   61  139:aload           4
	//   62  141:invokevirtual   #282 <Method String SimpleDateFormat.format(java.util.Date)>
	//   63  144:astore_3        
			obj1 = ((Object) (c));
	//   64  145:aload_0         
	//   65  146:getfield        #288 <Field CustomTextView c>
	//   66  149:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//   67  151:new             #182 <Class StringBuilder>
	//   68  154:dup             
	//   69  155:invokespecial   #183 <Method void StringBuilder()>
	//   70  158:astore          7
			stringbuilder.append((new SimpleDateFormat("hh:mm")).format(((java.util.Date) (obj))));
	//   71  160:aload           7
	//   72  162:new             #273 <Class SimpleDateFormat>
	//   73  165:dup             
	//   74  166:ldc2            #303 <String "hh:mm">
	//   75  169:invokespecial   #278 <Method void SimpleDateFormat(String)>
	//   76  172:aload           4
	//   77  174:invokevirtual   #282 <Method String SimpleDateFormat.format(java.util.Date)>
	//   78  177:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   79  180:pop             
			stringbuilder.append(" ");
	//   80  181:aload           7
	//   81  183:ldc2            #305 <String " ">
	//   82  186:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   83  189:pop             
			stringbuilder.append(s1);
	//   84  190:aload           7
	//   85  192:aload_2         
	//   86  193:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   87  196:pop             
			obj = ((Object) (stringbuilder.toString()));
	//   88  197:aload           7
	//   89  199:invokevirtual   #196 <Method String StringBuilder.toString()>
	//   90  202:astore          4
		}
		((CustomTextView) (obj1)).setText(((CharSequence) (obj)));
	//*  91  204:goto            93
		obj = ((Object) (new StringBuilder()));
	//   92  207:new             #182 <Class StringBuilder>
	//   93  210:dup             
	//   94  211:invokespecial   #183 <Method void StringBuilder()>
	//   95  214:astore          4
		((StringBuilder) (obj)).append("Show time as ");
	//   96  216:aload           4
	//   97  218:ldc2            #307 <String "Show time as ">
	//   98  221:invokevirtual   #189 <Method StringBuilder StringBuilder.append(String)>
	//   99  224:pop             
		((StringBuilder) (obj)).append(((Object) (c.getText())));
	//  100  225:aload           4
	//  101  227:aload_0         
	//  102  228:getfield        #288 <Field CustomTextView c>
	//  103  231:invokevirtual   #311 <Method CharSequence CustomTextView.getText()>
	//  104  234:invokevirtual   #314 <Method StringBuilder StringBuilder.append(Object)>
	//  105  237:pop             
		com.irobot.home.util.o.b("PScheduleTimeFragment", ((StringBuilder) (obj)).toString());
	//  106  238:ldc1            #53  <String "PScheduleTimeFragment">
	//  107  240:aload           4
	//  108  242:invokevirtual   #196 <Method String StringBuilder.toString()>
	//  109  245:invokestatic    #90  <Method void o.b(String, String)>
		obj = ((Object) (org.b.a.b.g_()));
	//  110  248:invokestatic    #318 <Method b b.g_()>
	//  111  251:astore          4
		((b) (obj)).e();
	//  112  253:aload           4
	//  113  255:invokevirtual   #320 <Method int b.e()>
	//  114  258:pop             
		int j1;
		if(((b) (obj)).e() * 60 + ((b) (obj)).f() <= l * 60 + m)
	//* 115  259:aload           4
	//* 116  261:invokevirtual   #320 <Method int b.e()>
	//* 117  264:bipush          60
	//* 118  266:imul            
	//* 119  267:aload           4
	//* 120  269:invokevirtual   #322 <Method int b.f()>
	//* 121  272:iadd            
	//* 122  273:aload_0         
	//* 123  274:getfield        #68  <Field int l>
	//* 124  277:bipush          60
	//* 125  279:imul            
	//* 126  280:aload_0         
	//* 127  281:getfield        #70  <Field int m>
	//* 128  284:iadd            
	//* 129  285:icmpgt          295
			j1 = 0x7f0f07d1;
	//  130  288:ldc2            #323 <Int 0x7f0f07d1>
	//  131  291:istore_1        
		else
	//* 132  292:goto            299
			j1 = 0x7f0f07d3;
	//  133  295:ldc2            #324 <Int 0x7f0f07d3>
	//  134  298:istore_1        
		obj1 = ((Object) (getString(j1)));
	//  135  299:aload_0         
	//  136  300:iload_1         
	//  137  301:invokevirtual   #299 <Method String getString(int)>
	//  138  304:astore          5
		assetinfo = com.irobot.home.util.j.j().a();
	//  139  306:invokestatic    #329 <Method com.irobot.home.model.a j.j()>
	//  140  309:invokevirtual   #334 <Method AssetInfo com.irobot.home.model.a.a()>
	//  141  312:astore          8
		s4 = assetinfo.getName();
	//  142  314:aload           8
	//  143  316:invokevirtual   #339 <Method String AssetInfo.getName()>
	//  144  319:astore          7
		obj = "";
	//  145  321:ldc2            #284 <String "">
	//  146  324:astore          4
		if(!AssetCapabilityUtils.isVacuumingRobot(assetinfo)) goto _L2; else goto _L1
	//  147  326:aload           8
	//  148  328:invokestatic    #345 <Method boolean AssetCapabilityUtils.isVacuumingRobot(AssetInfo)>
	//  149  331:ifeq            348
_L1:
		int k1 = 0x7f0f0950;
	//  150  334:ldc2            #346 <Int 0x7f0f0950>
	//  151  337:istore_1        
_L4:
		obj = ((Object) (getString(k1)));
	//  152  338:aload_0         
	//  153  339:iload_1         
	//  154  340:invokevirtual   #299 <Method String getString(int)>
	//  155  343:astore          4
		break MISSING_BLOCK_LABEL_370;
	//  156  345:goto            370
_L2:
		if(!AssetCapabilityUtils.isMoppingRobot(assetinfo))
			break; /* Loop/switch isn't completed */
	//  157  348:aload           8
	//  158  350:invokestatic    #349 <Method boolean AssetCapabilityUtils.isMoppingRobot(AssetInfo)>
	//  159  353:ifeq            363
		k1 = 0x7f0f049b;
	//  160  356:ldc2            #350 <Int 0x7f0f049b>
	//  161  359:istore_1        
		if(true) goto _L4; else goto _L3
	//  162  360:goto            338
_L3:
		junit.b.a.a("Asset type not supported", false);
	//  163  363:ldc2            #352 <String "Asset type not supported">
	//  164  366:iconst_0        
	//  165  367:invokestatic    #357 <Method void junit.b.a.a(String, boolean)>
		d.setText(((CharSequence) (getString(0x7f0f07cd, new Object[] {
			s4, obj, s2, s3, s1, obj1
		}))));
	//  166  370:aload_0         
	//  167  371:getfield        #105 <Field CustomTextView d>
	//  168  374:aload_0         
	//  169  375:ldc2            #358 <Int 0x7f0f07cd>
	//  170  378:bipush          6
	//  171  380:anewarray       Object[]
	//  172  383:dup             
	//  173  384:iconst_0        
	//  174  385:aload           7
	//  175  387:aastore         
	//  176  388:dup             
	//  177  389:iconst_1        
	//  178  390:aload           4
	//  179  392:aastore         
	//  180  393:dup             
	//  181  394:iconst_2        
	//  182  395:aload_3         
	//  183  396:aastore         
	//  184  397:dup             
	//  185  398:iconst_3        
	//  186  399:aload           6
	//  187  401:aastore         
	//  188  402:dup             
	//  189  403:iconst_4        
	//  190  404:aload_2         
	//  191  405:aastore         
	//  192  406:dup             
	//  193  407:iconst_5        
	//  194  408:aload           5
	//  195  410:aastore         
	//  196  411:invokevirtual   #363 <Method String getString(int, Object[])>
	//  197  414:invokevirtual   #293 <Method void CustomTextView.setText(CharSequence)>
		return;
	//  198  417:return          
	}

	public int d()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int l>
	//    2    4:ireturn         
	}

	public int e()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field int m>
	//    2    4:ireturn         
	}

	public ScheduleMultipleMappingType f()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field ScheduleMultipleMappingType k>
	//    2    4:areturn         
	}

	public ArrayList g()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #168 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #365 <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i1 = 0; i1 < a.size(); i1++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #142 <Field List a>
	//*   9   15:invokeinterface #148 <Method int List.size()>
	//*  10   20:icmpge          58
			if(((CustomCheckedTextView)a.get(i1)).isChecked())
	//*  11   23:aload_0         
	//*  12   24:getfield        #142 <Field List a>
	//*  13   27:iload_1         
	//*  14   28:invokeinterface #152 <Method Object List.get(int)>
	//*  15   33:checkcast       #154 <Class CustomCheckedTextView>
	//*  16   36:invokevirtual   #239 <Method boolean CustomCheckedTextView.isChecked()>
	//*  17   39:ifeq            51
				arraylist.add(((Object) (Integer.valueOf(i1))));
	//   18   42:aload_2         
	//   19   43:iload_1         
	//   20   44:invokestatic    #166 <Method Integer Integer.valueOf(int)>
	//   21   47:invokevirtual   #368 <Method boolean ArrayList.add(Object)>
	//   22   50:pop             

	//   23   51:iload_1         
	//   24   52:iconst_1        
	//   25   53:iadd            
	//   26   54:istore_1        
	//*  27   55:goto            10
		return arraylist;
	//   28   58:aload_2         
	//   29   59:areturn         
	}

	public void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #373 <Method void j.onResume()>
		w = DateFormat.is24HourFormat(getActivity().getApplicationContext());
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #203 <Method FragmentActivity getActivity()>
	//    5    9:invokevirtual   #379 <Method android.content.Context FragmentActivity.getApplicationContext()>
	//    6   12:invokestatic    #385 <Method boolean DateFormat.is24HourFormat(android.content.Context)>
	//    7   15:putfield        #247 <Field boolean w>
		c();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #387 <Method void c()>
	//   10   22:return          
	}

	public void onTimeSet(TimePicker timepicker, int i1, int j1)
	{
		l = i1;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #68  <Field int l>
		m = j1;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:putfield        #70  <Field int m>
		c();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #387 <Method void c()>
	//    8   14:return          
	}

	List a;
	LinearLayout b;
	CustomTextView c;
	CustomTextView d;
	RadioGroup e;
	CustomRadioButton f;
	CustomRadioButton i;
	ArrayList j;
	ScheduleMultipleMappingType k;
	int l;
	int m;
	int n;
	int o;
	int p;
	int q;
	private final String r = "PScheduleTimeFragment";
	private final int s = 9;
	private final int t = 0;
	private Drawable u;
	private a v;
	private boolean w;
}
