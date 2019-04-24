// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import com.irobot.core.*;
import com.irobot.home.CarpetBoostSettingsActivity_;
import com.irobot.home.CleaningPassSettingsActivity_;
import com.irobot.home.model.a;
import com.irobot.home.util.*;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home.fragments:
//			e, t

public class s extends com.irobot.home.fragments.e
	implements android.widget.CompoundButton.OnCheckedChangeListener
{

	public s()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void com.irobot.home.fragments.e()>
	//    2    4:return          
	}

	public static s a(String s1, SettingsSubsystem settingssubsystem)
	{
		s s2 = com.irobot.home.fragments.t.e().a();
	//    0    0:invokestatic    #40  <Method t$a com.irobot.home.fragments.t.e()>
	//    1    3:invokevirtual   #45  <Method s com.irobot.home.fragments.t$a.a()>
	//    2    6:astore_2        
		s2.a(s1);
	//    3    7:aload_2         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #48  <Method void a(String)>
		s2.a(settingssubsystem);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #51  <Method void a(SettingsSubsystem)>
		return s2;
	//    9   17:aload_2         
	//   10   18:areturn         
	}

	public void a()
	{
		f.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field View f>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #59  <Method void View.setVisibility(int)>
	//    4    8:return          
	}

	public void a(View view)
	{
		view = ((View) (SettingsUIServiceData.create()));
	//    0    0:invokestatic    #66  <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//    1    3:astore_1        
		b.sendCommand(SettingsUIServiceCommand.RestoreDefaultPreferences, ((SettingsUIServiceData) (view)));
	//    2    4:aload_0         
	//    3    5:getfield        #70  <Field SettingsSubsystem b>
	//    4    8:getstatic       #76  <Field SettingsUIServiceCommand SettingsUIServiceCommand.RestoreDefaultPreferences>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #82  <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
	//    7   15:return          
	}

	public void a(CarpetBoostMode carpetboostmode)
	{
		j = (CustomTextView)com.irobot.home.util.j.a(c, 0x7f0f0188);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #85  <Field RelativeLayout c>
	//    3    5:ldc1            #86  <Int 0x7f0f0188>
	//    4    7:invokestatic    #91  <Method android.widget.TextView j.a(RelativeLayout, int)>
	//    5   10:checkcast       #93  <Class CustomTextView>
	//    6   13:putfield        #95  <Field CustomTextView j>
		com.irobot.home.util.j.a(((View) (c)), j, true);
	//    7   16:aload_0         
	//    8   17:getfield        #85  <Field RelativeLayout c>
	//    9   20:aload_0         
	//   10   21:getfield        #95  <Field CustomTextView j>
	//   11   24:iconst_1        
	//   12   25:invokestatic    #98  <Method void j.a(View, CustomTextView, boolean)>
		l = carpetboostmode;
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:putfield        #100 <Field CarpetBoostMode l>
		int i1 = l.ordinal();
	//   16   33:aload_0         
	//   17   34:getfield        #100 <Field CarpetBoostMode l>
	//   18   37:invokevirtual   #106 <Method int CarpetBoostMode.ordinal()>
	//   19   40:istore_2        
		com.irobot.home.util.j.c(c, o[i1].toString());
	//   20   41:aload_0         
	//   21   42:getfield        #85  <Field RelativeLayout c>
	//   22   45:aload_0         
	//   23   46:getfield        #108 <Field CharSequence[] o>
	//   24   49:iload_2         
	//   25   50:aaload          
	//   26   51:invokeinterface #114 <Method String CharSequence.toString()>
	//   27   56:invokestatic    #117 <Method android.widget.TextView j.c(RelativeLayout, String)>
	//   28   59:pop             
		c.setVisibility(0);
	//   29   60:aload_0         
	//   30   61:getfield        #85  <Field RelativeLayout c>
	//   31   64:iconst_0        
	//   32   65:invokevirtual   #120 <Method void RelativeLayout.setVisibility(int)>
	//   33   68:return          
	}

	public void a(MultiPassMode multipassmode)
	{
		com.irobot.home.util.j.a(d, 0x7f0f07eb);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field RelativeLayout d>
	//    2    4:ldc1            #124 <Int 0x7f0f07eb>
	//    3    6:invokestatic    #91  <Method android.widget.TextView j.a(RelativeLayout, int)>
	//    4    9:pop             
		m = multipassmode;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #126 <Field MultiPassMode m>
		int i1 = m.ordinal();
	//    8   15:aload_0         
	//    9   16:getfield        #126 <Field MultiPassMode m>
	//   10   19:invokevirtual   #129 <Method int MultiPassMode.ordinal()>
	//   11   22:istore_2        
		com.irobot.home.util.j.c(d, n[i1].toString());
	//   12   23:aload_0         
	//   13   24:getfield        #123 <Field RelativeLayout d>
	//   14   27:aload_0         
	//   15   28:getfield        #131 <Field CharSequence[] n>
	//   16   31:iload_2         
	//   17   32:aaload          
	//   18   33:invokeinterface #114 <Method String CharSequence.toString()>
	//   19   38:invokestatic    #117 <Method android.widget.TextView j.c(RelativeLayout, String)>
	//   20   41:pop             
		d.setVisibility(0);
	//   21   42:aload_0         
	//   22   43:getfield        #123 <Field RelativeLayout d>
	//   23   46:iconst_0        
	//   24   47:invokevirtual   #120 <Method void RelativeLayout.setVisibility(int)>
	//   25   50:return          
	}

	public void b()
	{
		n = getResources().getTextArray(0x7f030005);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #135 <Method Resources getResources()>
	//    3    5:ldc1            #136 <Int 0x7f030005>
	//    4    7:invokevirtual   #142 <Method CharSequence[] Resources.getTextArray(int)>
	//    5   10:putfield        #131 <Field CharSequence[] n>
		o = getResources().getTextArray(0x7f030002);
	//    6   13:aload_0         
	//    7   14:aload_0         
	//    8   15:invokevirtual   #135 <Method Resources getResources()>
	//    9   18:ldc1            #143 <Int 0x7f030002>
	//   10   20:invokevirtual   #142 <Method CharSequence[] Resources.getTextArray(int)>
	//   11   23:putfield        #108 <Field CharSequence[] o>
		com.irobot.core.AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//   12   26:aload_0         
	//   13   27:getfield        #145 <Field String a>
	//   14   30:invokestatic    #148 <Method a j.a(String)>
	//   15   33:invokevirtual   #153 <Method com.irobot.core.AssetInfo a.a()>
	//   16   36:astore_1        
		AnalyticsSubsystem.getInstance().trackCleaningPreferencesView(assetinfo);
	//   17   37:invokestatic    #159 <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   18   40:aload_1         
	//   19   41:invokevirtual   #163 <Method void AnalyticsSubsystem.trackCleaningPreferencesView(com.irobot.core.AssetInfo)>
	//   20   44:return          
	}

	public void b(boolean flag)
	{
		com.irobot.home.util.j.a(e, 0x7f0f0294);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field RelativeLayout e>
	//    2    4:ldc1            #167 <Int 0x7f0f0294>
	//    3    6:invokestatic    #91  <Method android.widget.TextView j.a(RelativeLayout, int)>
	//    4    9:pop             
		k = com.irobot.home.util.j.a(e, getString(0x7f0f0294), ((android.widget.CompoundButton.OnCheckedChangeListener) (this)));
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:getfield        #166 <Field RelativeLayout e>
	//    8   15:aload_0         
	//    9   16:ldc1            #167 <Int 0x7f0f0294>
	//   10   18:invokevirtual   #171 <Method String getString(int)>
	//   11   21:aload_0         
	//   12   22:invokestatic    #174 <Method SwitchCompat j.a(RelativeLayout, String, android.widget.CompoundButton$OnCheckedChangeListener)>
	//   13   25:putfield        #176 <Field SwitchCompat k>
		k.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (null)));
	//   14   28:aload_0         
	//   15   29:getfield        #176 <Field SwitchCompat k>
	//   16   32:aconst_null     
	//   17   33:invokevirtual   #182 <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		k.setChecked(flag);
	//   18   36:aload_0         
	//   19   37:getfield        #176 <Field SwitchCompat k>
	//   20   40:iload_1         
	//   21   41:invokevirtual   #185 <Method void SwitchCompat.setChecked(boolean)>
		RelativeLayout relativelayout = e;
	//   22   44:aload_0         
	//   23   45:getfield        #166 <Field RelativeLayout e>
	//   24   48:astore_3        
		int i1;
		String s1;
		if(flag)
	//*  25   49:iload_1         
	//*  26   50:ifeq            66
			i1 = 0x7f0f0297;
	//   27   53:ldc1            #186 <Int 0x7f0f0297>
	//   28   55:istore_2        
		else
	//*  29   56:aload_0         
	//*  30   57:iload_2         
	//*  31   58:invokevirtual   #171 <Method String getString(int)>
	//*  32   61:astore          4
	//*  33   63:goto            72
			i1 = 0x7f0f0296;
	//   34   66:ldc1            #187 <Int 0x7f0f0296>
	//   35   68:istore_2        
		s1 = getString(i1);
	//*  36   69:goto            56
		com.irobot.home.util.j.a(relativelayout, s1);
	//   37   72:aload_3         
	//   38   73:aload           4
	//   39   75:invokestatic    #190 <Method void j.a(RelativeLayout, String)>
		k.setOnCheckedChangeListener(((android.widget.CompoundButton.OnCheckedChangeListener) (this)));
	//   40   78:aload_0         
	//   41   79:getfield        #176 <Field SwitchCompat k>
	//   42   82:aload_0         
	//   43   83:invokevirtual   #182 <Method void SwitchCompat.setOnCheckedChangeListener(android.widget.CompoundButton$OnCheckedChangeListener)>
		e.setVisibility(0);
	//   44   86:aload_0         
	//   45   87:getfield        #166 <Field RelativeLayout e>
	//   46   90:iconst_0        
	//   47   91:invokevirtual   #120 <Method void RelativeLayout.setVisibility(int)>
	//   48   94:return          
	}

	public void c()
	{
		if(l == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field CarpetBoostMode l>
	//*   2    4:ifnonnull       16
		{
			com.irobot.home.util.o.e(i, "Could not launch CarpetBoostMode selection, selected is null.");
	//    3    7:getstatic       #192 <Field String i>
	//    4   10:ldc1            #194 <String "Could not launch CarpetBoostMode selection, selected is null.">
	//    5   12:invokestatic    #199 <Method void o.e(String, String)>
			return;
	//    6   15:return          
		} else
		{
			CarpetBoostSettingsActivity_.a(((android.support.v4.app.Fragment) (this))).a(a).a(0);
	//    7   16:aload_0         
	//    8   17:invokestatic    #204 <Method com.irobot.home.CarpetBoostSettingsActivity_$a CarpetBoostSettingsActivity_.a(android.support.v4.app.Fragment)>
	//    9   20:aload_0         
	//   10   21:getfield        #145 <Field String a>
	//   11   24:invokevirtual   #209 <Method com.irobot.home.CarpetBoostSettingsActivity_$a com.irobot.home.CarpetBoostSettingsActivity_$a.a(String)>
	//   12   27:iconst_0        
	//   13   28:invokevirtual   #212 <Method org.androidannotations.api.a.e com.irobot.home.CarpetBoostSettingsActivity_$a.a(int)>
	//   14   31:pop             
			return;
	//   15   32:return          
		}
	}

	public void d()
	{
		if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field MultiPassMode m>
	//*   2    4:ifnonnull       16
		{
			com.irobot.home.util.o.e(i, "Could not launch MultiPassMode selection, selected is null.");
	//    3    7:getstatic       #192 <Field String i>
	//    4   10:ldc1            #214 <String "Could not launch MultiPassMode selection, selected is null.">
	//    5   12:invokestatic    #199 <Method void o.e(String, String)>
			return;
	//    6   15:return          
		} else
		{
			CleaningPassSettingsActivity_.a(((android.support.v4.app.Fragment) (this))).a(a).a(1);
	//    7   16:aload_0         
	//    8   17:invokestatic    #219 <Method com.irobot.home.CleaningPassSettingsActivity_$a CleaningPassSettingsActivity_.a(android.support.v4.app.Fragment)>
	//    9   20:aload_0         
	//   10   21:getfield        #145 <Field String a>
	//   11   24:invokevirtual   #224 <Method com.irobot.home.CleaningPassSettingsActivity_$a com.irobot.home.CleaningPassSettingsActivity_$a.a(String)>
	//   12   27:iconst_1        
	//   13   28:invokevirtual   #225 <Method org.androidannotations.api.a.e com.irobot.home.CleaningPassSettingsActivity_$a.a(int)>
	//   14   31:pop             
			return;
	//   15   32:return          
		}
	}

	public void onActivityResult(int i1, int j1, Intent intent)
	{
		switch(i1)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 87
	//	               1 25
		default:
			return;
	//    2   24:return          

		case 1: // '\001'
			intent = ((Intent) ((MultiPassMode)com.irobot.home.util.e.a(com/irobot/core/MultiPassMode).a(intent)));
	//    3   25:ldc1            #128 <Class MultiPassMode>
	//    4   27:invokestatic    #232 <Method com.irobot.home.util.e$a e.a(Class)>
	//    5   30:aload_3         
	//    6   31:invokevirtual   #237 <Method Enum com.irobot.home.util.e$a.a(Intent)>
	//    7   34:checkcast       #128 <Class MultiPassMode>
	//    8   37:astore_3        
			String s1 = i;
	//    9   38:getstatic       #192 <Field String i>
	//   10   41:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   11   43:new             #239 <Class StringBuilder>
	//   12   46:dup             
	//   13   47:invokespecial   #240 <Method void StringBuilder()>
	//   14   50:astore          5
			stringbuilder.append("Selected multi pass mode returned: ");
	//   15   52:aload           5
	//   16   54:ldc1            #242 <String "Selected multi pass mode returned: ">
	//   17   56:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   18   59:pop             
			stringbuilder.append(((Object) (intent)));
	//   19   60:aload           5
	//   20   62:aload_3         
	//   21   63:invokevirtual   #249 <Method StringBuilder StringBuilder.append(Object)>
	//   22   66:pop             
			com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   23   67:aload           4
	//   24   69:aload           5
	//   25   71:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   26   74:invokestatic    #252 <Method void o.b(String, String)>
			if(intent != null)
	//*  27   77:aload_3         
	//*  28   78:ifnull          148
			{
				m = ((MultiPassMode) (intent));
	//   29   81:aload_0         
	//   30   82:aload_3         
	//   31   83:putfield        #126 <Field MultiPassMode m>
				return;
	//   32   86:return          
			}
			break;

		case 0: // '\0'
			intent = ((Intent) ((CarpetBoostMode)com.irobot.home.util.e.a(com/irobot/core/CarpetBoostMode).a(intent)));
	//   33   87:ldc1            #102 <Class CarpetBoostMode>
	//   34   89:invokestatic    #232 <Method com.irobot.home.util.e$a e.a(Class)>
	//   35   92:aload_3         
	//   36   93:invokevirtual   #237 <Method Enum com.irobot.home.util.e$a.a(Intent)>
	//   37   96:checkcast       #102 <Class CarpetBoostMode>
	//   38   99:astore_3        
			String s2 = i;
	//   39  100:getstatic       #192 <Field String i>
	//   40  103:astore          4
			StringBuilder stringbuilder1 = new StringBuilder();
	//   41  105:new             #239 <Class StringBuilder>
	//   42  108:dup             
	//   43  109:invokespecial   #240 <Method void StringBuilder()>
	//   44  112:astore          5
			stringbuilder1.append("Selected carpet boost mode returned: ");
	//   45  114:aload           5
	//   46  116:ldc1            #254 <String "Selected carpet boost mode returned: ">
	//   47  118:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   48  121:pop             
			stringbuilder1.append(((Object) (intent)));
	//   49  122:aload           5
	//   50  124:aload_3         
	//   51  125:invokevirtual   #249 <Method StringBuilder StringBuilder.append(Object)>
	//   52  128:pop             
			com.irobot.home.util.o.b(s2, stringbuilder1.toString());
	//   53  129:aload           4
	//   54  131:aload           5
	//   55  133:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   56  136:invokestatic    #252 <Method void o.b(String, String)>
			if(intent != null)
	//*  57  139:aload_3         
	//*  58  140:ifnull          148
				l = ((CarpetBoostMode) (intent));
	//   59  143:aload_0         
	//   60  144:aload_3         
	//   61  145:putfield        #100 <Field CarpetBoostMode l>
			break;
		}
	//   62  148:return          
	}

	public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
	{
		if(compoundbutton == k)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #176 <Field SwitchCompat k>
	//*   3    5:if_acmpne       65
		{
			compoundbutton = ((CompoundButton) (i));
	//    4    8:getstatic       #192 <Field String i>
	//    5   11:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #239 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #240 <Method void StringBuilder()>
	//    9   19:astore_3        
			stringbuilder.append("Turned edge clean to: ");
	//   10   20:aload_3         
	//   11   21:ldc2            #258 <String "Turned edge clean to: ">
	//   12   24:invokevirtual   #246 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
			stringbuilder.append(flag);
	//   14   28:aload_3         
	//   15   29:iload_2         
	//   16   30:invokevirtual   #261 <Method StringBuilder StringBuilder.append(boolean)>
	//   17   33:pop             
			com.irobot.home.util.o.b(((String) (compoundbutton)), stringbuilder.toString());
	//   18   34:aload_1         
	//   19   35:aload_3         
	//   20   36:invokevirtual   #250 <Method String StringBuilder.toString()>
	//   21   39:invokestatic    #252 <Method void o.b(String, String)>
			compoundbutton = ((CompoundButton) (SettingsUIServiceData.create()));
	//   22   42:invokestatic    #66  <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//   23   45:astore_1        
			((SettingsUIServiceData) (compoundbutton)).setBooleanSetting(SettingType.EdgeClean, flag);
	//   24   46:aload_1         
	//   25   47:getstatic       #267 <Field SettingType SettingType.EdgeClean>
	//   26   50:iload_2         
	//   27   51:invokevirtual   #271 <Method void SettingsUIServiceData.setBooleanSetting(SettingType, boolean)>
			b.sendCommand(SettingsUIServiceCommand.SetCleaningPreference, ((SettingsUIServiceData) (compoundbutton)));
	//   28   54:aload_0         
	//   29   55:getfield        #70  <Field SettingsSubsystem b>
	//   30   58:getstatic       #274 <Field SettingsUIServiceCommand SettingsUIServiceCommand.SetCleaningPreference>
	//   31   61:aload_1         
	//   32   62:invokevirtual   #82  <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
		}
	//   33   65:return          
	}

	private static final String i = "s";
	RelativeLayout c;
	RelativeLayout d;
	RelativeLayout e;
	View f;
	private CustomTextView j;
	private SwitchCompat k;
	private CarpetBoostMode l;
	private MultiPassMode m;
	private CharSequence n[];
	private CharSequence o[];

	static 
	{
	//    0    0:return          
	}
}
