// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.irobot.core.ScheduleMultipleMappingType;
import com.irobot.home.view.CustomCheckedTextView;
import com.irobot.home.view.CustomRadioButton;
import com.irobot.home.view.CustomTextView;
import java.util.ArrayList;
import org.androidannotations.api.c.a;
import org.androidannotations.api.c.b;
import org.androidannotations.api.c.c;

// Referenced classes of package com.irobot.home.fragments:
//			ba

public final class bb extends ba
	implements org.androidannotations.api.c.a, b
{
	public static class a extends org.androidannotations.api.a.c
	{

		public ba a()
		{
			bb bb1 = new bb();
		//    0    0:new             #7   <Class bb>
		//    1    3:dup             
		//    2    4:invokespecial   #15  <Method void bb()>
		//    3    7:astore_1        
			bb1.setArguments(a);
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #18  <Field Bundle a>
		//    7   13:invokevirtual   #22  <Method void bb.setArguments(Bundle)>
			return ((ba) (bb1));
		//    8   16:aload_1         
		//    9   17:areturn         
		}

		public a a(int j)
		{
			a.putInt("hourSelected", j);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #25  <String "hourSelected">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(ScheduleMultipleMappingType schedulemultiplemappingtype)
		{
			a.putSerializable("typeSelected", ((java.io.Serializable) (schedulemultiplemappingtype)));
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #34  <String "typeSelected">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #38  <Method void Bundle.putSerializable(String, java.io.Serializable)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a a(ArrayList arraylist)
		{
			a.putIntegerArrayList("daysSelected", arraylist);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #41  <String "daysSelected">
		//    3    6:aload_1         
		//    4    7:invokevirtual   #45  <Method void Bundle.putIntegerArrayList(String, ArrayList)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a b(int j)
		{
			a.putInt("minuteSelected", j);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #50  <String "minuteSelected">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a c(int j)
		{
			a.putInt("selectedDayTextColor", j);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #53  <String "selectedDayTextColor">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a d(int j)
		{
			a.putInt("selectedTypeTextColor", j);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #56  <String "selectedTypeTextColor">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a e(int j)
		{
			a.putInt("unselectedTextColor", j);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #59  <String "unselectedTextColor">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a f(int j)
		{
			a.putInt("selectedDayBackgroundResource", j);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Bundle a>
		//    2    4:ldc1            #62  <String "selectedDayBackgroundResource">
		//    3    6:iload_1         
		//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
			return this;
		//    5   10:aload_0         
		//    6   11:areturn         
		}

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void org.androidannotations.api.a.c()>
		//    2    4:return          
		}
	}


	public bb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void ba()>
	//    2    4:aload_0         
	//    3    5:new             #37  <Class c>
	//    4    8:dup             
	//    5    9:invokespecial   #38  <Method void c()>
	//    6   12:putfield        #40  <Field c r>
	//    7   15:return          
	}

	private void a(Bundle bundle)
	{
		c.a(((b) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #45  <Method void c.a(b)>
		i();
	//    2    4:aload_0         
	//    3    5:invokespecial   #48  <Method void i()>
	//    4    8:return          
	}

	public static a h()
	{
		return new a();
	//    0    0:new             #26  <Class bb$a>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void bb$a()>
	//    3    7:areturn         
	}

	private void i()
	{
		Bundle bundle = getArguments();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method Bundle getArguments()>
	//    2    4:astore_1        
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          164
		{
			if(bundle.containsKey("daysSelected"))
	//*   5    9:aload_1         
	//*   6   10:ldc1            #57  <String "daysSelected">
	//*   7   12:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*   8   15:ifeq            28
				j = bundle.getIntegerArrayList("daysSelected");
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:ldc1            #57  <String "daysSelected">
	//   12   22:invokevirtual   #67  <Method ArrayList Bundle.getIntegerArrayList(String)>
	//   13   25:putfield        #71  <Field ArrayList j>
			if(bundle.containsKey("typeSelected"))
	//*  14   28:aload_1         
	//*  15   29:ldc1            #73  <String "typeSelected">
	//*  16   31:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  17   34:ifeq            50
				k = (ScheduleMultipleMappingType)bundle.getSerializable("typeSelected");
	//   18   37:aload_0         
	//   19   38:aload_1         
	//   20   39:ldc1            #73  <String "typeSelected">
	//   21   41:invokevirtual   #77  <Method java.io.Serializable Bundle.getSerializable(String)>
	//   22   44:checkcast       #79  <Class ScheduleMultipleMappingType>
	//   23   47:putfield        #83  <Field ScheduleMultipleMappingType k>
			if(bundle.containsKey("hourSelected"))
	//*  24   50:aload_1         
	//*  25   51:ldc1            #85  <String "hourSelected">
	//*  26   53:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  27   56:ifeq            69
				l = bundle.getInt("hourSelected");
	//   28   59:aload_0         
	//   29   60:aload_1         
	//   30   61:ldc1            #85  <String "hourSelected">
	//   31   63:invokevirtual   #89  <Method int Bundle.getInt(String)>
	//   32   66:putfield        #93  <Field int l>
			if(bundle.containsKey("minuteSelected"))
	//*  33   69:aload_1         
	//*  34   70:ldc1            #95  <String "minuteSelected">
	//*  35   72:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  36   75:ifeq            88
				m = bundle.getInt("minuteSelected");
	//   37   78:aload_0         
	//   38   79:aload_1         
	//   39   80:ldc1            #95  <String "minuteSelected">
	//   40   82:invokevirtual   #89  <Method int Bundle.getInt(String)>
	//   41   85:putfield        #98  <Field int m>
			if(bundle.containsKey("selectedDayTextColor"))
	//*  42   88:aload_1         
	//*  43   89:ldc1            #100 <String "selectedDayTextColor">
	//*  44   91:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  45   94:ifeq            107
				n = bundle.getInt("selectedDayTextColor");
	//   46   97:aload_0         
	//   47   98:aload_1         
	//   48   99:ldc1            #100 <String "selectedDayTextColor">
	//   49  101:invokevirtual   #89  <Method int Bundle.getInt(String)>
	//   50  104:putfield        #103 <Field int n>
			if(bundle.containsKey("selectedTypeTextColor"))
	//*  51  107:aload_1         
	//*  52  108:ldc1            #105 <String "selectedTypeTextColor">
	//*  53  110:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  54  113:ifeq            126
				o = bundle.getInt("selectedTypeTextColor");
	//   55  116:aload_0         
	//   56  117:aload_1         
	//   57  118:ldc1            #105 <String "selectedTypeTextColor">
	//   58  120:invokevirtual   #89  <Method int Bundle.getInt(String)>
	//   59  123:putfield        #108 <Field int o>
			if(bundle.containsKey("unselectedTextColor"))
	//*  60  126:aload_1         
	//*  61  127:ldc1            #110 <String "unselectedTextColor">
	//*  62  129:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  63  132:ifeq            145
				p = bundle.getInt("unselectedTextColor");
	//   64  135:aload_0         
	//   65  136:aload_1         
	//   66  137:ldc1            #110 <String "unselectedTextColor">
	//   67  139:invokevirtual   #89  <Method int Bundle.getInt(String)>
	//   68  142:putfield        #113 <Field int p>
			if(bundle.containsKey("selectedDayBackgroundResource"))
	//*  69  145:aload_1         
	//*  70  146:ldc1            #115 <String "selectedDayBackgroundResource">
	//*  71  148:invokevirtual   #63  <Method boolean Bundle.containsKey(String)>
	//*  72  151:ifeq            164
				q = bundle.getInt("selectedDayBackgroundResource");
	//   73  154:aload_0         
	//   74  155:aload_1         
	//   75  156:ldc1            #115 <String "selectedDayBackgroundResource">
	//   76  158:invokevirtual   #89  <Method int Bundle.getInt(String)>
	//   77  161:putfield        #118 <Field int q>
		}
	//   78  164:return          
	}

	public View a(int j)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field View s>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return s.findViewById(j);
	//    5    9:aload_0         
	//    6   10:getfield        #121 <Field View s>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #126 <Method View View.findViewById(int)>
	//    9   17:areturn         
	}

	public void a(org.androidannotations.api.c.a a1)
	{
		b = (LinearLayout)a1.a(0x7f090385);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #130 <Int 0x7f090385>
	//    3    4:invokeinterface #132 <Method View a.a(int)>
	//    4    9:checkcast       #134 <Class LinearLayout>
	//    5   12:putfield        #138 <Field LinearLayout b>
		c = (CustomTextView)a1.a(0x7f090381);
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:ldc1            #139 <Int 0x7f090381>
	//    9   19:invokeinterface #132 <Method View a.a(int)>
	//   10   24:checkcast       #141 <Class CustomTextView>
	//   11   27:putfield        #145 <Field CustomTextView c>
		d = (CustomTextView)a1.a(0x7f090397);
	//   12   30:aload_0         
	//   13   31:aload_1         
	//   14   32:ldc1            #146 <Int 0x7f090397>
	//   15   34:invokeinterface #132 <Method View a.a(int)>
	//   16   39:checkcast       #141 <Class CustomTextView>
	//   17   42:putfield        #149 <Field CustomTextView d>
		e = (RadioGroup)a1.a(0x7f0903a0);
	//   18   45:aload_0         
	//   19   46:aload_1         
	//   20   47:ldc1            #150 <Int 0x7f0903a0>
	//   21   49:invokeinterface #132 <Method View a.a(int)>
	//   22   54:checkcast       #152 <Class RadioGroup>
	//   23   57:putfield        #156 <Field RadioGroup e>
		f = (CustomRadioButton)a1.a(0x7f090396);
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:ldc1            #157 <Int 0x7f090396>
	//   27   64:invokeinterface #132 <Method View a.a(int)>
	//   28   69:checkcast       #159 <Class CustomRadioButton>
	//   29   72:putfield        #163 <Field CustomRadioButton f>
		i = (CustomRadioButton)a1.a(0x7f0903a2);
	//   30   75:aload_0         
	//   31   76:aload_1         
	//   32   77:ldc1            #164 <Int 0x7f0903a2>
	//   33   79:invokeinterface #132 <Method View a.a(int)>
	//   34   84:checkcast       #159 <Class CustomRadioButton>
	//   35   87:putfield        #166 <Field CustomRadioButton i>
		ArrayList arraylist = new ArrayList();
	//   36   90:new             #168 <Class ArrayList>
	//   37   93:dup             
	//   38   94:invokespecial   #169 <Method void ArrayList()>
	//   39   97:astore_2        
		CustomCheckedTextView customcheckedtextview = (CustomCheckedTextView)a1.a(0x7f09039c);
	//   40   98:aload_1         
	//   41   99:ldc1            #170 <Int 0x7f09039c>
	//   42  101:invokeinterface #132 <Method View a.a(int)>
	//   43  106:checkcast       #172 <Class CustomCheckedTextView>
	//   44  109:astore_3        
		CustomCheckedTextView customcheckedtextview1 = (CustomCheckedTextView)a1.a(0x7f090394);
	//   45  110:aload_1         
	//   46  111:ldc1            #173 <Int 0x7f090394>
	//   47  113:invokeinterface #132 <Method View a.a(int)>
	//   48  118:checkcast       #172 <Class CustomCheckedTextView>
	//   49  121:astore          4
		CustomCheckedTextView customcheckedtextview2 = (CustomCheckedTextView)a1.a(0x7f09039f);
	//   50  123:aload_1         
	//   51  124:ldc1            #174 <Int 0x7f09039f>
	//   52  126:invokeinterface #132 <Method View a.a(int)>
	//   53  131:checkcast       #172 <Class CustomCheckedTextView>
	//   54  134:astore          5
		CustomCheckedTextView customcheckedtextview3 = (CustomCheckedTextView)a1.a(0x7f0903a1);
	//   55  136:aload_1         
	//   56  137:ldc1            #175 <Int 0x7f0903a1>
	//   57  139:invokeinterface #132 <Method View a.a(int)>
	//   58  144:checkcast       #172 <Class CustomCheckedTextView>
	//   59  147:astore          6
		CustomCheckedTextView customcheckedtextview4 = (CustomCheckedTextView)a1.a(0x7f09039e);
	//   60  149:aload_1         
	//   61  150:ldc1            #176 <Int 0x7f09039e>
	//   62  152:invokeinterface #132 <Method View a.a(int)>
	//   63  157:checkcast       #172 <Class CustomCheckedTextView>
	//   64  160:astore          7
		CustomCheckedTextView customcheckedtextview5 = (CustomCheckedTextView)a1.a(0x7f090388);
	//   65  162:aload_1         
	//   66  163:ldc1            #177 <Int 0x7f090388>
	//   67  165:invokeinterface #132 <Method View a.a(int)>
	//   68  170:checkcast       #172 <Class CustomCheckedTextView>
	//   69  173:astore          8
		a1 = ((org.androidannotations.api.c.a) ((CustomCheckedTextView)a1.a(0x7f09039a)));
	//   70  175:aload_1         
	//   71  176:ldc1            #178 <Int 0x7f09039a>
	//   72  178:invokeinterface #132 <Method View a.a(int)>
	//   73  183:checkcast       #172 <Class CustomCheckedTextView>
	//   74  186:astore_1        
		if(customcheckedtextview != null)
	//*  75  187:aload_3         
	//*  76  188:ifnull          209
		{
			arraylist.add(((Object) (customcheckedtextview)));
	//   77  191:aload_2         
	//   78  192:aload_3         
	//   79  193:invokevirtual   #182 <Method boolean ArrayList.add(Object)>
	//   80  196:pop             
			customcheckedtextview.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.a(view);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bb a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #24  <Method void com.irobot.home.fragments.bb.a(View)>
				//    4    8:return          
				}

				final bb a;

			
			{
				a = bb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bb a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   81  197:aload_3         
	//   82  198:new             #10  <Class bb$1>
	//   83  201:dup             
	//   84  202:aload_0         
	//   85  203:invokespecial   #185 <Method void bb$1(bb)>
	//   86  206:invokevirtual   #189 <Method void CustomCheckedTextView.setOnClickListener(android.view.View$OnClickListener)>
		}
		if(customcheckedtextview1 != null)
	//*  87  209:aload           4
	//*  88  211:ifnull          234
		{
			arraylist.add(((Object) (customcheckedtextview1)));
	//   89  214:aload_2         
	//   90  215:aload           4
	//   91  217:invokevirtual   #182 <Method boolean ArrayList.add(Object)>
	//   92  220:pop             
			customcheckedtextview1.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.a(view);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bb a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #24  <Method void com.irobot.home.fragments.bb.a(View)>
				//    4    8:return          
				}

				final bb a;

			
			{
				a = bb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bb a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   93  221:aload           4
	//   94  223:new             #12  <Class bb$2>
	//   95  226:dup             
	//   96  227:aload_0         
	//   97  228:invokespecial   #190 <Method void bb$2(bb)>
	//   98  231:invokevirtual   #189 <Method void CustomCheckedTextView.setOnClickListener(android.view.View$OnClickListener)>
		}
		if(customcheckedtextview2 != null)
	//*  99  234:aload           5
	//* 100  236:ifnull          259
		{
			arraylist.add(((Object) (customcheckedtextview2)));
	//  101  239:aload_2         
	//  102  240:aload           5
	//  103  242:invokevirtual   #182 <Method boolean ArrayList.add(Object)>
	//  104  245:pop             
			customcheckedtextview2.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.a(view);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bb a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #24  <Method void com.irobot.home.fragments.bb.a(View)>
				//    4    8:return          
				}

				final bb a;

			
			{
				a = bb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bb a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  105  246:aload           5
	//  106  248:new             #14  <Class bb$3>
	//  107  251:dup             
	//  108  252:aload_0         
	//  109  253:invokespecial   #191 <Method void bb$3(bb)>
	//  110  256:invokevirtual   #189 <Method void CustomCheckedTextView.setOnClickListener(android.view.View$OnClickListener)>
		}
		if(customcheckedtextview3 != null)
	//* 111  259:aload           6
	//* 112  261:ifnull          284
		{
			arraylist.add(((Object) (customcheckedtextview3)));
	//  113  264:aload_2         
	//  114  265:aload           6
	//  115  267:invokevirtual   #182 <Method boolean ArrayList.add(Object)>
	//  116  270:pop             
			customcheckedtextview3.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.a(view);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bb a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #24  <Method void com.irobot.home.fragments.bb.a(View)>
				//    4    8:return          
				}

				final bb a;

			
			{
				a = bb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bb a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  117  271:aload           6
	//  118  273:new             #16  <Class bb$4>
	//  119  276:dup             
	//  120  277:aload_0         
	//  121  278:invokespecial   #192 <Method void bb$4(bb)>
	//  122  281:invokevirtual   #189 <Method void CustomCheckedTextView.setOnClickListener(android.view.View$OnClickListener)>
		}
		if(customcheckedtextview4 != null)
	//* 123  284:aload           7
	//* 124  286:ifnull          309
		{
			arraylist.add(((Object) (customcheckedtextview4)));
	//  125  289:aload_2         
	//  126  290:aload           7
	//  127  292:invokevirtual   #182 <Method boolean ArrayList.add(Object)>
	//  128  295:pop             
			customcheckedtextview4.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.a(view);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bb a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #24  <Method void com.irobot.home.fragments.bb.a(View)>
				//    4    8:return          
				}

				final bb a;

			
			{
				a = bb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bb a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  129  296:aload           7
	//  130  298:new             #18  <Class bb$5>
	//  131  301:dup             
	//  132  302:aload_0         
	//  133  303:invokespecial   #193 <Method void bb$5(bb)>
	//  134  306:invokevirtual   #189 <Method void CustomCheckedTextView.setOnClickListener(android.view.View$OnClickListener)>
		}
		if(customcheckedtextview5 != null)
	//* 135  309:aload           8
	//* 136  311:ifnull          334
		{
			arraylist.add(((Object) (customcheckedtextview5)));
	//  137  314:aload_2         
	//  138  315:aload           8
	//  139  317:invokevirtual   #182 <Method boolean ArrayList.add(Object)>
	//  140  320:pop             
			customcheckedtextview5.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.a(view);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bb a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #24  <Method void com.irobot.home.fragments.bb.a(View)>
				//    4    8:return          
				}

				final bb a;

			
			{
				a = bb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bb a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  141  321:aload           8
	//  142  323:new             #20  <Class bb$6>
	//  143  326:dup             
	//  144  327:aload_0         
	//  145  328:invokespecial   #194 <Method void bb$6(bb)>
	//  146  331:invokevirtual   #189 <Method void CustomCheckedTextView.setOnClickListener(android.view.View$OnClickListener)>
		}
		if(a1 != null)
	//* 147  334:aload_1         
	//* 148  335:ifnull          356
		{
			arraylist.add(((Object) (a1)));
	//  149  338:aload_2         
	//  150  339:aload_1         
	//  151  340:invokevirtual   #182 <Method boolean ArrayList.add(Object)>
	//  152  343:pop             
			((CustomCheckedTextView) (a1)).setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.a(view);
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bb a>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #24  <Method void com.irobot.home.fragments.bb.a(View)>
				//    4    8:return          
				}

				final bb a;

			
			{
				a = bb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bb a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  153  344:aload_1         
	//  154  345:new             #22  <Class bb$7>
	//  155  348:dup             
	//  156  349:aload_0         
	//  157  350:invokespecial   #195 <Method void bb$7(bb)>
	//  158  353:invokevirtual   #189 <Method void CustomCheckedTextView.setOnClickListener(android.view.View$OnClickListener)>
		}
		if(c != null)
	//* 159  356:aload_0         
	//* 160  357:getfield        #145 <Field CustomTextView c>
	//* 161  360:ifnull          378
			c.setOnClickListener(new android.view.View.OnClickListener() {

				public void onClick(View view)
				{
					a.b();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field bb a>
				//    2    4:invokevirtual   #25  <Method void com.irobot.home.fragments.bb.b()>
				//    3    7:return          
				}

				final bb a;

			
			{
				a = bb.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field bb a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//  162  363:aload_0         
	//  163  364:getfield        #145 <Field CustomTextView c>
	//  164  367:new             #24  <Class bb$8>
	//  165  370:dup             
	//  166  371:aload_0         
	//  167  372:invokespecial   #196 <Method void bb$8(bb)>
	//  168  375:invokevirtual   #197 <Method void CustomTextView.setOnClickListener(android.view.View$OnClickListener)>
		a = ((java.util.List) (arraylist));
	//  169  378:aload_0         
	//  170  379:aload_2         
	//  171  380:putfield        #200 <Field java.util.List a>
		a();
	//  172  383:aload_0         
	//  173  384:invokevirtual   #202 <Method void a()>
	//  174  387:return          
	}

	public void onCreate(Bundle bundle)
	{
		c c1 = c.a(r);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field c r>
	//    2    4:invokestatic    #206 <Method c c.a(c)>
	//    3    7:astore_2        
		a(bundle);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #208 <Method void a(Bundle)>
		super.onCreate(bundle);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #210 <Method void ba.onCreate(Bundle)>
		c.a(c1);
	//   10   18:aload_2         
	//   11   19:invokestatic    #206 <Method c c.a(c)>
	//   12   22:pop             
	//   13   23:return          
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		s = super.onCreateView(layoutinflater, viewgroup, bundle);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:aload_3         
	//    5    5:invokespecial   #214 <Method View ba.onCreateView(LayoutInflater, ViewGroup, Bundle)>
	//    6    8:putfield        #121 <Field View s>
		if(s == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #121 <Field View s>
	//*   9   15:ifnonnull       30
			s = layoutinflater.inflate(0x7f0b00d2, viewgroup, false);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:ldc1            #215 <Int 0x7f0b00d2>
	//   13   22:aload_2         
	//   14   23:iconst_0        
	//   15   24:invokevirtual   #221 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//   16   27:putfield        #121 <Field View s>
		return s;
	//   17   30:aload_0         
	//   18   31:getfield        #121 <Field View s>
	//   19   34:areturn         
	}

	public void onDestroyView()
	{
		super.onDestroyView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #224 <Method void ba.onDestroyView()>
		s = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #121 <Field View s>
		b = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #138 <Field LinearLayout b>
		c = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #145 <Field CustomTextView c>
		d = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #149 <Field CustomTextView d>
		e = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #156 <Field RadioGroup e>
		f = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #163 <Field CustomRadioButton f>
		i = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #166 <Field CustomRadioButton i>
	//   23   39:return          
	}

	public void onViewCreated(View view, Bundle bundle)
	{
		super.onViewCreated(view, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #228 <Method void ba.onViewCreated(View, Bundle)>
		r.a(((org.androidannotations.api.c.a) (this)));
	//    4    6:aload_0         
	//    5    7:getfield        #40  <Field c r>
	//    6   10:aload_0         
	//    7   11:invokevirtual   #230 <Method void c.a(a)>
	//    8   14:return          
	}

	private final c r = new c();
	private View s;
}
