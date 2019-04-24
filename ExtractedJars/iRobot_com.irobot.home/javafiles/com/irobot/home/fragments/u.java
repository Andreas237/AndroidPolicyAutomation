// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.*;
import android.widget.*;
import com.irobot.core.*;
import com.irobot.home.CleaningPassSettingsActivity_;
import com.irobot.home.model.a;
import com.irobot.home.util.*;
import com.irobot.home.view.*;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.irobot.home.fragments:
//			e, v, t, u

public class u extends com.irobot.home.fragments.e
	implements android.view.View.OnClickListener, com.irobot.home.view.DiscreteSeekBar.a
{

	public u()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method void com.irobot.home.fragments.e()>
		m = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #89  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #90  <Method void HashMap()>
	//    6   12:putfield        #92  <Field HashMap m>
		n = true;
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:putfield        #94  <Field boolean n>
		o = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #96  <Field boolean o>
		p = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #98  <Field boolean p>
		y = null;
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:putfield        #100 <Field CleanPresetType y>
		z = null;
	//   19   35:aload_0         
	//   20   36:aconst_null     
	//   21   37:putfield        #102 <Field MultiPassMode z>
		A = null;
	//   22   40:aload_0         
	//   23   41:aconst_null     
	//   24   42:putfield        #104 <Field CarpetBoostMode A>
		B = null;
	//   25   45:aload_0         
	//   26   46:aconst_null     
	//   27   47:putfield        #106 <Field Boolean B>
		M = ((android.view.View.OnClickListener) (new t(this) {

			public Object a()
			{
				return ((Object) (b()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #17  <Method String b()>
			//    2    4:areturn         
			}

			public String b()
			{
				return com.mixpanel.android.mpmetrics.u.a(b, a).a();
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field u b>
			//    2    4:aload_0         
			//    3    5:getfield        #22  <Field String a>
			//    4    8:invokestatic    #25  <Method u$b com.mixpanel.android.mpmetrics.u.a(u, String)>
			//    5   11:invokevirtual   #29  <Method String com.mixpanel.android.mpmetrics.u$b.a()>
			//    6   14:areturn         
			}

			final String a;
			final u b;
		}
));
	//   28   50:aload_0         
	//   29   51:new             #10  <Class u$1>
	//   30   54:dup             
	//   31   55:aload_0         
	//   32   56:invokespecial   #109 <Method void u$1(u)>
	//   33   59:putfield        #111 <Field android.view.View$OnClickListener M>
		O = 0x7f060078;
	//   34   62:aload_0         
	//   35   63:ldc1            #112 <Int 0x7f060078>
	//   36   65:putfield        #114 <Field int O>
	//   37   68:return          
	}

	public static u a(String s1, SettingsSubsystem settingssubsystem)
	{
		s1 = ((String) (com.irobot.home.fragments.v.f().a(s1).a()));
	//    0    0:invokestatic    #121 <Method v$a v.f()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #126 <Method v$a com.irobot.home.fragments.v$a.a(String)>
	//    3    7:invokevirtual   #129 <Method u com.irobot.home.fragments.v$a.a()>
	//    4   10:astore_0        
		((u) (s1)).a(settingssubsystem);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #132 <Method void a(SettingsSubsystem)>
		return ((u) (s1));
	//    8   16:aload_0         
	//    9   17:areturn         
	}

	public static u a(String s1, SettingsSubsystem settingssubsystem, HashMap hashmap, boolean flag)
	{
		s1 = ((String) (com.irobot.home.fragments.v.f().a(hashmap).b(false).c(true).a(flag).a(s1).a()));
	//    0    0:invokestatic    #121 <Method v$a v.f()>
	//    1    3:aload_2         
	//    2    4:invokevirtual   #136 <Method v$a com.irobot.home.fragments.v$a.a(HashMap)>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #140 <Method v$a v$a.b(boolean)>
	//    5   11:iconst_1        
	//    6   12:invokevirtual   #142 <Method v$a v$a.c(boolean)>
	//    7   15:iload_3         
	//    8   16:invokevirtual   #144 <Method v$a com.irobot.home.fragments.v$a.a(boolean)>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #126 <Method v$a com.irobot.home.fragments.v$a.a(String)>
	//   11   23:invokevirtual   #129 <Method u com.irobot.home.fragments.v$a.a()>
	//   12   26:astore_0        
		((u) (s1)).a(settingssubsystem);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #132 <Method void a(SettingsSubsystem)>
		return ((u) (s1));
	//   16   32:aload_0         
	//   17   33:areturn         
	}

	private void a(SettingsUIServiceCommand settingsuiservicecommand, SettingsUIServiceData settingsuiservicedata)
	{
		if(!p)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field boolean p>
	//*   2    4:ifne            16
			b.sendCommand(settingsuiservicecommand, settingsuiservicedata);
	//    3    7:aload_0         
	//    4    8:getfield        #150 <Field SettingsSubsystem b>
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:invokevirtual   #155 <Method void SettingsSubsystem.sendCommand(SettingsUIServiceCommand, SettingsUIServiceData)>
	//    8   16:return          
	}

	private boolean c(boolean flag)
	{
		return !p || flag;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field boolean p>
	//    2    4:ifeq            16
	//    3    7:iload_1         
	//    4    8:ifeq            14
	//    5   11:goto            16
	//    6   14:iconst_0        
	//    7   15:ireturn         
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	private void f()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.a(a).a();
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field String a>
	//    2    4:invokestatic    #161 <Method a j.a(String)>
	//    3    7:invokevirtual   #166 <Method AssetInfo a.a()>
	//    4   10:astore_1        
		b = Assembler.getInstance().getSettingsSubsystem(assetinfo.getAssetId());
	//    5   11:aload_0         
	//    6   12:invokestatic    #172 <Method Assembler Assembler.getInstance()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #178 <Method com.irobot.core.AssetId AssetInfo.getAssetId()>
	//    9   19:invokevirtual   #182 <Method SettingsSubsystem Assembler.getSettingsSubsystem(com.irobot.core.AssetId)>
	//   10   22:putfield        #150 <Field SettingsSubsystem b>
		if(o)
	//*  11   25:aload_0         
	//*  12   26:getfield        #96  <Field boolean o>
	//*  13   29:ifeq            52
			((TextView)k.findViewById(0x7f0900f4)).setText(0x7f0f0952);
	//   14   32:aload_0         
	//   15   33:getfield        #184 <Field LinearLayout k>
	//   16   36:ldc1            #185 <Int 0x7f0900f4>
	//   17   38:invokevirtual   #191 <Method View LinearLayout.findViewById(int)>
	//   18   41:checkcast       #193 <Class TextView>
	//   19   44:ldc1            #194 <Int 0x7f0f0952>
	//   20   46:invokevirtual   #198 <Method void TextView.setText(int)>
		else
	//*  21   49:goto            61
			k.setVisibility(8);
	//   22   52:aload_0         
	//   23   53:getfield        #184 <Field LinearLayout k>
	//   24   56:bipush          8
	//   25   58:invokevirtual   #201 <Method void LinearLayout.setVisibility(int)>
		((DiscreteSeekBar)f.findViewById(0x7f09042b)).setThumb(getActivity().getDrawable(0x7f0801c3));
	//   26   61:aload_0         
	//   27   62:getfield        #203 <Field RelativeLayout f>
	//   28   65:ldc1            #204 <Int 0x7f09042b>
	//   29   67:invokevirtual   #207 <Method View RelativeLayout.findViewById(int)>
	//   30   70:checkcast       #209 <Class DiscreteSeekBar>
	//   31   73:aload_0         
	//   32   74:invokevirtual   #213 <Method FragmentActivity getActivity()>
	//   33   77:ldc1            #214 <Int 0x7f0801c3>
	//   34   79:invokevirtual   #220 <Method android.graphics.drawable.Drawable FragmentActivity.getDrawable(int)>
	//   35   82:invokevirtual   #224 <Method void DiscreteSeekBar.setThumb(android.graphics.drawable.Drawable)>
		c.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   36   85:aload_0         
	//   37   86:getfield        #226 <Field RelativeLayout c>
	//   38   89:aload_0         
	//   39   90:invokevirtual   #230 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		r = (CustomCheckedTextView)c.findViewById(0x7f090426);
	//   40   93:aload_0         
	//   41   94:aload_0         
	//   42   95:getfield        #226 <Field RelativeLayout c>
	//   43   98:ldc1            #231 <Int 0x7f090426>
	//   44  100:invokevirtual   #207 <Method View RelativeLayout.findViewById(int)>
	//   45  103:checkcast       #233 <Class CustomCheckedTextView>
	//   46  106:putfield        #235 <Field CustomCheckedTextView r>
		u = (CustomTextView)c.findViewById(0x7f090427);
	//   47  109:aload_0         
	//   48  110:aload_0         
	//   49  111:getfield        #226 <Field RelativeLayout c>
	//   50  114:ldc1            #236 <Int 0x7f090427>
	//   51  116:invokevirtual   #207 <Method View RelativeLayout.findViewById(int)>
	//   52  119:checkcast       #238 <Class CustomTextView>
	//   53  122:putfield        #240 <Field CustomTextView u>
		r.setText(0x7f0f025d);
	//   54  125:aload_0         
	//   55  126:getfield        #235 <Field CustomCheckedTextView r>
	//   56  129:ldc1            #241 <Int 0x7f0f025d>
	//   57  131:invokevirtual   #242 <Method void CustomCheckedTextView.setText(int)>
		u.setText(0x7f0f01c2);
	//   58  134:aload_0         
	//   59  135:getfield        #240 <Field CustomTextView u>
	//   60  138:ldc1            #243 <Int 0x7f0f01c2>
	//   61  140:invokevirtual   #244 <Method void CustomTextView.setText(int)>
		d.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   62  143:aload_0         
	//   63  144:getfield        #246 <Field RelativeLayout d>
	//   64  147:aload_0         
	//   65  148:invokevirtual   #230 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		s = (CustomCheckedTextView)d.findViewById(0x7f090426);
	//   66  151:aload_0         
	//   67  152:aload_0         
	//   68  153:getfield        #246 <Field RelativeLayout d>
	//   69  156:ldc1            #231 <Int 0x7f090426>
	//   70  158:invokevirtual   #207 <Method View RelativeLayout.findViewById(int)>
	//   71  161:checkcast       #233 <Class CustomCheckedTextView>
	//   72  164:putfield        #248 <Field CustomCheckedTextView s>
		v = (CustomTextView)d.findViewById(0x7f090427);
	//   73  167:aload_0         
	//   74  168:aload_0         
	//   75  169:getfield        #246 <Field RelativeLayout d>
	//   76  172:ldc1            #236 <Int 0x7f090427>
	//   77  174:invokevirtual   #207 <Method View RelativeLayout.findViewById(int)>
	//   78  177:checkcast       #238 <Class CustomTextView>
	//   79  180:putfield        #250 <Field CustomTextView v>
		s.setText(0x7f0f0721);
	//   80  183:aload_0         
	//   81  184:getfield        #248 <Field CustomCheckedTextView s>
	//   82  187:ldc1            #251 <Int 0x7f0f0721>
	//   83  189:invokevirtual   #242 <Method void CustomCheckedTextView.setText(int)>
		v.setText(0x7f0f01c3);
	//   84  192:aload_0         
	//   85  193:getfield        #250 <Field CustomTextView v>
	//   86  196:ldc1            #252 <Int 0x7f0f01c3>
	//   87  198:invokevirtual   #244 <Method void CustomTextView.setText(int)>
		e.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   88  201:aload_0         
	//   89  202:getfield        #254 <Field RelativeLayout e>
	//   90  205:aload_0         
	//   91  206:invokevirtual   #230 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		t = (CustomCheckedTextView)e.findViewById(0x7f090426);
	//   92  209:aload_0         
	//   93  210:aload_0         
	//   94  211:getfield        #254 <Field RelativeLayout e>
	//   95  214:ldc1            #231 <Int 0x7f090426>
	//   96  216:invokevirtual   #207 <Method View RelativeLayout.findViewById(int)>
	//   97  219:checkcast       #233 <Class CustomCheckedTextView>
	//   98  222:putfield        #256 <Field CustomCheckedTextView t>
		w = (CustomTextView)e.findViewById(0x7f090427);
	//   99  225:aload_0         
	//  100  226:aload_0         
	//  101  227:getfield        #254 <Field RelativeLayout e>
	//  102  230:ldc1            #236 <Int 0x7f090427>
	//  103  232:invokevirtual   #207 <Method View RelativeLayout.findViewById(int)>
	//  104  235:checkcast       #238 <Class CustomTextView>
	//  105  238:putfield        #258 <Field CustomTextView w>
		t.setText(0x7f0f063a);
	//  106  241:aload_0         
	//  107  242:getfield        #256 <Field CustomCheckedTextView t>
	//  108  245:ldc2            #259 <Int 0x7f0f063a>
	//  109  248:invokevirtual   #242 <Method void CustomCheckedTextView.setText(int)>
		w.setVisibility(8);
	//  110  251:aload_0         
	//  111  252:getfield        #258 <Field CustomTextView w>
	//  112  255:bipush          8
	//  113  257:invokevirtual   #260 <Method void CustomTextView.setVisibility(int)>
		f.setVisibility(8);
	//  114  260:aload_0         
	//  115  261:getfield        #203 <Field RelativeLayout f>
	//  116  264:bipush          8
	//  117  266:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
		i.setVisibility(8);
	//  118  269:aload_0         
	//  119  270:getfield        #263 <Field RelativeLayout i>
	//  120  273:bipush          8
	//  121  275:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
		h();
	//  122  278:aload_0         
	//  123  279:invokespecial   #266 <Method void h()>
	//  124  282:return          
	}

	private void g()
	{
		com.irobot.home.util.o.a(q, "Multipass is supported and shown.");
	//    0    0:getstatic       #83  <Field String q>
	//    1    3:ldc2            #269 <String "Multipass is supported and shown.">
	//    2    6:invokestatic    #274 <Method void o.a(String, String)>
		D = (ViewGroup)j.inflate();
	//    3    9:aload_0         
	//    4   10:aload_0         
	//    5   11:getfield        #276 <Field ViewStub j>
	//    6   14:invokevirtual   #282 <Method View ViewStub.inflate()>
	//    7   17:checkcast       #284 <Class ViewGroup>
	//    8   20:putfield        #286 <Field ViewGroup D>
		E = (RelativeLayout)D.findViewById(0x7f0900e6);
	//    9   23:aload_0         
	//   10   24:aload_0         
	//   11   25:getfield        #286 <Field ViewGroup D>
	//   12   28:ldc2            #287 <Int 0x7f0900e6>
	//   13   31:invokevirtual   #288 <Method View ViewGroup.findViewById(int)>
	//   14   34:checkcast       #206 <Class RelativeLayout>
	//   15   37:putfield        #290 <Field RelativeLayout E>
		K = D.findViewById(0x7f0900e7);
	//   16   40:aload_0         
	//   17   41:aload_0         
	//   18   42:getfield        #286 <Field ViewGroup D>
	//   19   45:ldc2            #291 <Int 0x7f0900e7>
	//   20   48:invokevirtual   #288 <Method View ViewGroup.findViewById(int)>
	//   21   51:putfield        #293 <Field View K>
		F = (RelativeLayout)D.findViewById(0x7f0900e9);
	//   22   54:aload_0         
	//   23   55:aload_0         
	//   24   56:getfield        #286 <Field ViewGroup D>
	//   25   59:ldc2            #294 <Int 0x7f0900e9>
	//   26   62:invokevirtual   #288 <Method View ViewGroup.findViewById(int)>
	//   27   65:checkcast       #206 <Class RelativeLayout>
	//   28   68:putfield        #296 <Field RelativeLayout F>
		L = D.findViewById(0x7f0900ea);
	//   29   71:aload_0         
	//   30   72:aload_0         
	//   31   73:getfield        #286 <Field ViewGroup D>
	//   32   76:ldc2            #297 <Int 0x7f0900ea>
	//   33   79:invokevirtual   #288 <Method View ViewGroup.findViewById(int)>
	//   34   82:putfield        #299 <Field View L>
		G = (RelativeLayout)D.findViewById(0x7f0900eb);
	//   35   85:aload_0         
	//   36   86:aload_0         
	//   37   87:getfield        #286 <Field ViewGroup D>
	//   38   90:ldc2            #300 <Int 0x7f0900eb>
	//   39   93:invokevirtual   #288 <Method View ViewGroup.findViewById(int)>
	//   40   96:checkcast       #206 <Class RelativeLayout>
	//   41   99:putfield        #302 <Field RelativeLayout G>
		H = ((CheckedTextView) (com.irobot.home.util.j.b(E, getString(0x7f0f05b5))));
	//   42  102:aload_0         
	//   43  103:aload_0         
	//   44  104:getfield        #290 <Field RelativeLayout E>
	//   45  107:aload_0         
	//   46  108:ldc2            #303 <Int 0x7f0f05b5>
	//   47  111:invokevirtual   #307 <Method String getString(int)>
	//   48  114:invokestatic    #310 <Method CustomCheckedTextView j.b(RelativeLayout, String)>
	//   49  117:putfield        #312 <Field CheckedTextView H>
		I = ((CheckedTextView) (com.irobot.home.util.j.b(F, getString(0x7f0f05b9))));
	//   50  120:aload_0         
	//   51  121:aload_0         
	//   52  122:getfield        #296 <Field RelativeLayout F>
	//   53  125:aload_0         
	//   54  126:ldc2            #313 <Int 0x7f0f05b9>
	//   55  129:invokevirtual   #307 <Method String getString(int)>
	//   56  132:invokestatic    #310 <Method CustomCheckedTextView j.b(RelativeLayout, String)>
	//   57  135:putfield        #315 <Field CheckedTextView I>
		J = ((CheckedTextView) (com.irobot.home.util.j.b(G, getString(0x7f0f05b7))));
	//   58  138:aload_0         
	//   59  139:aload_0         
	//   60  140:getfield        #302 <Field RelativeLayout G>
	//   61  143:aload_0         
	//   62  144:ldc2            #316 <Int 0x7f0f05b7>
	//   63  147:invokevirtual   #307 <Method String getString(int)>
	//   64  150:invokestatic    #310 <Method CustomCheckedTextView j.b(RelativeLayout, String)>
	//   65  153:putfield        #318 <Field CheckedTextView J>
		com.irobot.home.util.j.a(E, getString(0x7f0f05b6));
	//   66  156:aload_0         
	//   67  157:getfield        #290 <Field RelativeLayout E>
	//   68  160:aload_0         
	//   69  161:ldc2            #319 <Int 0x7f0f05b6>
	//   70  164:invokevirtual   #307 <Method String getString(int)>
	//   71  167:invokestatic    #322 <Method void j.a(RelativeLayout, String)>
		com.irobot.home.util.j.a(F, getString(0x7f0f05ba));
	//   72  170:aload_0         
	//   73  171:getfield        #296 <Field RelativeLayout F>
	//   74  174:aload_0         
	//   75  175:ldc2            #323 <Int 0x7f0f05ba>
	//   76  178:invokevirtual   #307 <Method String getString(int)>
	//   77  181:invokestatic    #322 <Method void j.a(RelativeLayout, String)>
		com.irobot.home.util.j.a(G, getString(0x7f0f05b8));
	//   78  184:aload_0         
	//   79  185:getfield        #302 <Field RelativeLayout G>
	//   80  188:aload_0         
	//   81  189:ldc2            #324 <Int 0x7f0f05b8>
	//   82  192:invokevirtual   #307 <Method String getString(int)>
	//   83  195:invokestatic    #322 <Method void j.a(RelativeLayout, String)>
		E.setOnClickListener(M);
	//   84  198:aload_0         
	//   85  199:getfield        #290 <Field RelativeLayout E>
	//   86  202:aload_0         
	//   87  203:getfield        #111 <Field android.view.View$OnClickListener M>
	//   88  206:invokevirtual   #230 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		F.setOnClickListener(M);
	//   89  209:aload_0         
	//   90  210:getfield        #296 <Field RelativeLayout F>
	//   91  213:aload_0         
	//   92  214:getfield        #111 <Field android.view.View$OnClickListener M>
	//   93  217:invokevirtual   #230 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
		G.setOnClickListener(M);
	//   94  220:aload_0         
	//   95  221:getfield        #302 <Field RelativeLayout G>
	//   96  224:aload_0         
	//   97  225:getfield        #111 <Field android.view.View$OnClickListener M>
	//   98  228:invokevirtual   #230 <Method void RelativeLayout.setOnClickListener(android.view.View$OnClickListener)>
	//   99  231:return          
	}

	private void h()
	{
		String s1 = q;
	//    0    0:getstatic       #83  <Field String q>
	//    1    3:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #326 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #327 <Method void StringBuilder()>
	//    5   11:astore_2        
		stringbuilder.append("Loading existing settings values: ");
	//    6   12:aload_2         
	//    7   13:ldc2            #329 <String "Loading existing settings values: ">
	//    8   16:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
		stringbuilder.append(((Object) (m)));
	//   10   20:aload_2         
	//   11   21:aload_0         
	//   12   22:getfield        #92  <Field HashMap m>
	//   13   25:invokevirtual   #336 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
		com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   15   29:aload_1         
	//   16   30:aload_2         
	//   17   31:invokevirtual   #339 <Method String StringBuilder.toString()>
	//   18   34:invokestatic    #341 <Method void o.b(String, String)>
		if(!m.isEmpty())
	//*  19   37:aload_0         
	//*  20   38:getfield        #92  <Field HashMap m>
	//*  21   41:invokevirtual   #345 <Method boolean HashMap.isEmpty()>
	//*  22   44:ifne            94
		{
			B = Boolean.valueOf(CommonUtilities.edgeCleanFromMap(m));
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:getfield        #92  <Field HashMap m>
	//   26   52:invokestatic    #351 <Method boolean CommonUtilities.edgeCleanFromMap(HashMap)>
	//   27   55:invokestatic    #357 <Method Boolean Boolean.valueOf(boolean)>
	//   28   58:putfield        #106 <Field Boolean B>
			A = CommonUtilities.carpetBoostModeFromMap(m);
	//   29   61:aload_0         
	//   30   62:aload_0         
	//   31   63:getfield        #92  <Field HashMap m>
	//   32   66:invokestatic    #361 <Method CarpetBoostMode CommonUtilities.carpetBoostModeFromMap(HashMap)>
	//   33   69:putfield        #104 <Field CarpetBoostMode A>
			z = CommonUtilities.multiPassModeFromMap(m);
	//   34   72:aload_0         
	//   35   73:aload_0         
	//   36   74:getfield        #92  <Field HashMap m>
	//   37   77:invokestatic    #365 <Method MultiPassMode CommonUtilities.multiPassModeFromMap(HashMap)>
	//   38   80:putfield        #102 <Field MultiPassMode z>
			y = CommonUtilities.cleanPresetTypeFromMap(m);
	//   39   83:aload_0         
	//   40   84:aload_0         
	//   41   85:getfield        #92  <Field HashMap m>
	//   42   88:invokestatic    #369 <Method CleanPresetType CommonUtilities.cleanPresetTypeFromMap(HashMap)>
	//   43   91:putfield        #100 <Field CleanPresetType y>
		}
	//   44   94:return          
	}

	public void a(CarpetBoostMode carpetboostmode)
	{
		if(c(false) || A == null)
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokespecial   #372 <Method boolean c(boolean)>
	//*   3    5:ifne            15
	//*   4    8:aload_0         
	//*   5    9:getfield        #104 <Field CarpetBoostMode A>
	//*   6   12:ifnonnull       20
			A = carpetboostmode;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #104 <Field CarpetBoostMode A>
		com.irobot.home.util.j.a(f, getString(0x7f0f01b8), 0x7f0800c3, 0x7f0800c4, A.ordinal(), ((com.irobot.home.view.DiscreteSeekBar.a) (this)));
	//   10   20:aload_0         
	//   11   21:getfield        #203 <Field RelativeLayout f>
	//   12   24:aload_0         
	//   13   25:ldc2            #373 <Int 0x7f0f01b8>
	//   14   28:invokevirtual   #307 <Method String getString(int)>
	//   15   31:ldc2            #374 <Int 0x7f0800c3>
	//   16   34:ldc2            #375 <Int 0x7f0800c4>
	//   17   37:aload_0         
	//   18   38:getfield        #104 <Field CarpetBoostMode A>
	//   19   41:invokevirtual   #381 <Method int CarpetBoostMode.ordinal()>
	//   20   44:aload_0         
	//   21   45:invokestatic    #384 <Method DiscreteSeekBar j.a(RelativeLayout, String, int, int, int, com.irobot.home.view.DiscreteSeekBar$a)>
	//   22   48:pop             
		carpetboostmode = ((CarpetBoostMode) (getResources().getTextArray(0x7f030006)[A.ordinal()].toString()));
	//   23   49:aload_0         
	//   24   50:invokevirtual   #388 <Method Resources getResources()>
	//   25   53:ldc2            #389 <Int 0x7f030006>
	//   26   56:invokevirtual   #395 <Method CharSequence[] Resources.getTextArray(int)>
	//   27   59:aload_0         
	//   28   60:getfield        #104 <Field CarpetBoostMode A>
	//   29   63:invokevirtual   #381 <Method int CarpetBoostMode.ordinal()>
	//   30   66:aaload          
	//   31   67:invokeinterface #398 <Method String CharSequence.toString()>
	//   32   72:astore_1        
		com.irobot.home.util.j.a(f, ((String) (carpetboostmode)));
	//   33   73:aload_0         
	//   34   74:getfield        #203 <Field RelativeLayout f>
	//   35   77:aload_1         
	//   36   78:invokestatic    #322 <Method void j.a(RelativeLayout, String)>
	//   37   81:return          
	}

	public void a(CleanPresetType cleanpresettype)
	{
		CleanPresetType cleanpresettype1 = cleanpresettype;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(p)
	//*   2    2:aload_0         
	//*   3    3:getfield        #98  <Field boolean p>
	//*   4    6:ifeq            23
		{
			cleanpresettype1 = cleanpresettype;
	//    5    9:aload_1         
	//    6   10:astore_2        
			if(y != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #100 <Field CleanPresetType y>
	//*   9   15:ifnull          23
				cleanpresettype1 = y;
	//   10   18:aload_0         
	//   11   19:getfield        #100 <Field CleanPresetType y>
	//   12   22:astore_2        
		}
		static class _cls2
			implements t
		{

			public Object a()
			{
				return ((Object) (b()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #29  <Method Boolean b()>
			//    2    4:areturn         
			}

			public Boolean b()
			{
				return com.mixpanel.android.mpmetrics.u.a(b, a).c();
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field u b>
			//    2    4:aload_0         
			//    3    5:getfield        #21  <Field String a>
			//    4    8:invokestatic    #32  <Method u$b com.mixpanel.android.mpmetrics.u.a(u, String)>
			//    5   11:invokevirtual   #37  <Method Boolean u$b.c()>
			//    6   14:areturn         
			}

			final String a;
			final u b;

			
			{
				b = u1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field u b>
				a = s1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field String a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}

		switch(_cls2.b[cleanpresettype1.ordinal()])
	//*  13   23:getstatic       #402 <Field int[] u$2.b>
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #405 <Method int CleanPresetType.ordinal()>
	//*  16   30:iaload          
		{
	//*  17   31:tableswitch     1 3: default 56
	//	               1 191
	//	               2 136
	//	               3 57
		default:
			return;
	//   18   56:return          

		case 3: // '\003'
			r.setChecked(false);
	//   19   57:aload_0         
	//   20   58:getfield        #235 <Field CustomCheckedTextView r>
	//   21   61:iconst_0        
	//   22   62:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
			s.setChecked(false);
	//   23   65:aload_0         
	//   24   66:getfield        #248 <Field CustomCheckedTextView s>
	//   25   69:iconst_0        
	//   26   70:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
			t.setChecked(true);
	//   27   73:aload_0         
	//   28   74:getfield        #256 <Field CustomCheckedTextView t>
	//   29   77:iconst_1        
	//   30   78:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
			r.setTextColor(0xff000000);
	//   31   81:aload_0         
	//   32   82:getfield        #235 <Field CustomCheckedTextView r>
	//   33   85:ldc2            #410 <Int 0xff000000>
	//   34   88:invokevirtual   #413 <Method void CustomCheckedTextView.setTextColor(int)>
			s.setTextColor(0xff000000);
	//   35   91:aload_0         
	//   36   92:getfield        #248 <Field CustomCheckedTextView s>
	//   37   95:ldc2            #410 <Int 0xff000000>
	//   38   98:invokevirtual   #413 <Method void CustomCheckedTextView.setTextColor(int)>
			t.setTextColor(getResources().getColor(O));
	//   39  101:aload_0         
	//   40  102:getfield        #256 <Field CustomCheckedTextView t>
	//   41  105:aload_0         
	//   42  106:invokevirtual   #388 <Method Resources getResources()>
	//   43  109:aload_0         
	//   44  110:getfield        #114 <Field int O>
	//   45  113:invokevirtual   #417 <Method int Resources.getColor(int)>
	//   46  116:invokevirtual   #413 <Method void CustomCheckedTextView.setTextColor(int)>
			i.setVisibility(0);
	//   47  119:aload_0         
	//   48  120:getfield        #263 <Field RelativeLayout i>
	//   49  123:iconst_0        
	//   50  124:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
			f.setVisibility(0);
	//   51  127:aload_0         
	//   52  128:getfield        #203 <Field RelativeLayout f>
	//   53  131:iconst_0        
	//   54  132:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
			return;
	//   55  135:return          

		case 2: // '\002'
			r.setChecked(false);
	//   56  136:aload_0         
	//   57  137:getfield        #235 <Field CustomCheckedTextView r>
	//   58  140:iconst_0        
	//   59  141:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
			s.setChecked(true);
	//   60  144:aload_0         
	//   61  145:getfield        #248 <Field CustomCheckedTextView s>
	//   62  148:iconst_1        
	//   63  149:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
			t.setChecked(false);
	//   64  152:aload_0         
	//   65  153:getfield        #256 <Field CustomCheckedTextView t>
	//   66  156:iconst_0        
	//   67  157:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
			r.setTextColor(0xff000000);
	//   68  160:aload_0         
	//   69  161:getfield        #235 <Field CustomCheckedTextView r>
	//   70  164:ldc2            #410 <Int 0xff000000>
	//   71  167:invokevirtual   #413 <Method void CustomCheckedTextView.setTextColor(int)>
			s.setTextColor(getResources().getColor(O));
	//   72  170:aload_0         
	//   73  171:getfield        #248 <Field CustomCheckedTextView s>
	//   74  174:aload_0         
	//   75  175:invokevirtual   #388 <Method Resources getResources()>
	//   76  178:aload_0         
	//   77  179:getfield        #114 <Field int O>
	//   78  182:invokevirtual   #417 <Method int Resources.getColor(int)>
	//   79  185:invokevirtual   #413 <Method void CustomCheckedTextView.setTextColor(int)>
			break;

	//*  80  188:goto            243
		case 1: // '\001'
			r.setChecked(true);
	//   81  191:aload_0         
	//   82  192:getfield        #235 <Field CustomCheckedTextView r>
	//   83  195:iconst_1        
	//   84  196:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
			s.setChecked(false);
	//   85  199:aload_0         
	//   86  200:getfield        #248 <Field CustomCheckedTextView s>
	//   87  203:iconst_0        
	//   88  204:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
			t.setChecked(false);
	//   89  207:aload_0         
	//   90  208:getfield        #256 <Field CustomCheckedTextView t>
	//   91  211:iconst_0        
	//   92  212:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
			r.setTextColor(getResources().getColor(O));
	//   93  215:aload_0         
	//   94  216:getfield        #235 <Field CustomCheckedTextView r>
	//   95  219:aload_0         
	//   96  220:invokevirtual   #388 <Method Resources getResources()>
	//   97  223:aload_0         
	//   98  224:getfield        #114 <Field int O>
	//   99  227:invokevirtual   #417 <Method int Resources.getColor(int)>
	//  100  230:invokevirtual   #413 <Method void CustomCheckedTextView.setTextColor(int)>
			s.setTextColor(0xff000000);
	//  101  233:aload_0         
	//  102  234:getfield        #248 <Field CustomCheckedTextView s>
	//  103  237:ldc2            #410 <Int 0xff000000>
	//  104  240:invokevirtual   #413 <Method void CustomCheckedTextView.setTextColor(int)>
			break;
		}
		t.setTextColor(0xff000000);
	//  105  243:aload_0         
	//  106  244:getfield        #256 <Field CustomCheckedTextView t>
	//  107  247:ldc2            #410 <Int 0xff000000>
	//  108  250:invokevirtual   #413 <Method void CustomCheckedTextView.setTextColor(int)>
		i.setVisibility(8);
	//  109  253:aload_0         
	//  110  254:getfield        #263 <Field RelativeLayout i>
	//  111  257:bipush          8
	//  112  259:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
		f.setVisibility(8);
	//  113  262:aload_0         
	//  114  263:getfield        #203 <Field RelativeLayout f>
	//  115  266:bipush          8
	//  116  268:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
	//  117  271:return          
	}

	public void a(MultiPassMode multipassmode)
	{
		a(multipassmode, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #421 <Method void a(MultiPassMode, boolean)>
	//    4    6:return          
	}

	public void a(MultiPassMode multipassmode, boolean flag)
	{
		com.irobot.home.util.j.a(i, 0x7f0f07eb);
	//    0    0:aload_0         
	//    1    1:getfield        #263 <Field RelativeLayout i>
	//    2    4:ldc2            #422 <Int 0x7f0f07eb>
	//    3    7:invokestatic    #425 <Method TextView j.a(RelativeLayout, int)>
	//    4   10:pop             
		if(x == null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #427 <Field CustomTextView x>
	//*   7   15:ifnonnull       35
			x = (CustomTextView)com.irobot.home.util.j.c(i, "");
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #263 <Field RelativeLayout i>
	//   11   23:ldc2            #429 <String "">
	//   12   26:invokestatic    #432 <Method TextView j.c(RelativeLayout, String)>
	//   13   29:checkcast       #238 <Class CustomTextView>
	//   14   32:putfield        #427 <Field CustomTextView x>
		if(c(flag) || z == null)
	//*  15   35:aload_0         
	//*  16   36:iload_2         
	//*  17   37:invokespecial   #372 <Method boolean c(boolean)>
	//*  18   40:ifne            50
	//*  19   43:aload_0         
	//*  20   44:getfield        #102 <Field MultiPassMode z>
	//*  21   47:ifnonnull       55
			z = multipassmode;
	//   22   50:aload_0         
	//   23   51:aload_1         
	//   24   52:putfield        #102 <Field MultiPassMode z>
		multipassmode = ((MultiPassMode) (getResources().getTextArray(0x7f030005)[z.ordinal()]));
	//   25   55:aload_0         
	//   26   56:invokevirtual   #388 <Method Resources getResources()>
	//   27   59:ldc2            #433 <Int 0x7f030005>
	//   28   62:invokevirtual   #395 <Method CharSequence[] Resources.getTextArray(int)>
	//   29   65:aload_0         
	//   30   66:getfield        #102 <Field MultiPassMode z>
	//   31   69:invokevirtual   #436 <Method int MultiPassMode.ordinal()>
	//   32   72:aaload          
	//   33   73:astore_1        
		x.setText(((CharSequence) (((CharSequence) (multipassmode)).toString())));
	//   34   74:aload_0         
	//   35   75:getfield        #427 <Field CustomTextView x>
	//   36   78:aload_1         
	//   37   79:invokeinterface #398 <Method String CharSequence.toString()>
	//   38   84:invokevirtual   #439 <Method void CustomTextView.setText(CharSequence)>
	//   39   87:return          
	}

	public void a(ArrayList arraylist)
	{
		if(p && !N)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field boolean p>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:getfield        #442 <Field boolean N>
	//*   5   11:ifne            23
		{
			C = arraylist;
	//    6   14:aload_0         
	//    7   15:aload_1         
	//    8   16:putfield        #444 <Field ArrayList C>
			c();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #446 <Method void c()>
		}
	//   11   23:return          
	}

	public void a(boolean flag)
	{
		byte byte0;
		RelativeLayout relativelayout;
		if(!flag && y != CleanPresetType.CustomClean)
	//*   0    0:iload_1         
	//*   1    1:ifne            28
	//*   2    4:aload_0         
	//*   3    5:getfield        #100 <Field CleanPresetType y>
	//*   4    8:getstatic       #450 <Field CleanPresetType CleanPresetType.CustomClean>
	//*   5   11:if_acmpne       17
	//*   6   14:goto            28
		{
			relativelayout = i;
	//    7   17:aload_0         
	//    8   18:getfield        #263 <Field RelativeLayout i>
	//    9   21:astore_3        
			byte0 = 8;
	//   10   22:bipush          8
	//   11   24:istore_2        
		} else
	//*  12   25:goto            35
		{
			relativelayout = i;
	//   13   28:aload_0         
	//   14   29:getfield        #263 <Field RelativeLayout i>
	//   15   32:astore_3        
			byte0 = 0;
	//   16   33:iconst_0        
	//   17   34:istore_2        
		}
		relativelayout.setVisibility(((int) (byte0)));
	//   18   35:aload_3         
	//   19   36:iload_2         
	//   20   37:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
		f.setVisibility(((int) (byte0)));
	//   21   40:aload_0         
	//   22   41:getfield        #203 <Field RelativeLayout f>
	//   23   44:iload_2         
	//   24   45:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
	//   25   48:return          
	}

	public void b()
	{
		AssetInfo assetinfo = com.irobot.home.util.j.j().a();
	//    0    0:invokestatic    #453 <Method a j.j()>
	//    1    3:invokevirtual   #166 <Method AssetInfo a.a()>
	//    2    6:astore_1        
		N = SkuUtils.isSkuOfType(SkuType.Soho, assetinfo.getSku());
	//    3    7:aload_0         
	//    4    8:getstatic       #459 <Field SkuType SkuType.Soho>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #462 <Method String AssetInfo.getSku()>
	//    7   15:invokestatic    #468 <Method boolean SkuUtils.isSkuOfType(SkuType, String)>
	//    8   18:putfield        #442 <Field boolean N>
		g();
	//    9   21:aload_0         
	//   10   22:invokespecial   #470 <Method void g()>
		f();
	//   11   25:aload_0         
	//   12   26:invokespecial   #472 <Method void f()>
		if(p && !N)
	//*  13   29:aload_0         
	//*  14   30:getfield        #98  <Field boolean p>
	//*  15   33:ifeq            61
	//*  16   36:aload_0         
	//*  17   37:getfield        #442 <Field boolean N>
	//*  18   40:ifne            61
		{
			D.setVisibility(0);
	//   19   43:aload_0         
	//   20   44:getfield        #286 <Field ViewGroup D>
	//   21   47:iconst_0        
	//   22   48:invokevirtual   #473 <Method void ViewGroup.setVisibility(int)>
			l.setVisibility(8);
	//   23   51:aload_0         
	//   24   52:getfield        #475 <Field LinearLayout l>
	//   25   55:bipush          8
	//   26   57:invokevirtual   #201 <Method void LinearLayout.setVisibility(int)>
			return;
	//   27   60:return          
		} else
		{
			l.setVisibility(0);
	//   28   61:aload_0         
	//   29   62:getfield        #475 <Field LinearLayout l>
	//   30   65:iconst_0        
	//   31   66:invokevirtual   #201 <Method void LinearLayout.setVisibility(int)>
			D.setVisibility(8);
	//   32   69:aload_0         
	//   33   70:getfield        #286 <Field ViewGroup D>
	//   34   73:bipush          8
	//   35   75:invokevirtual   #473 <Method void ViewGroup.setVisibility(int)>
			return;
	//   36   78:return          
		}
	}

	public void b(int i1)
	{
		Object obj = ((Object) (getResources().getTextArray(0x7f030002)[i1].toString()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #388 <Method Resources getResources()>
	//    2    4:ldc2            #476 <Int 0x7f030002>
	//    3    7:invokevirtual   #395 <Method CharSequence[] Resources.getTextArray(int)>
	//    4   10:iload_1         
	//    5   11:aaload          
	//    6   12:invokeinterface #398 <Method String CharSequence.toString()>
	//    7   17:astore_2        
		com.irobot.home.util.j.a(f, ((String) (obj)));
	//    8   18:aload_0         
	//    9   19:getfield        #203 <Field RelativeLayout f>
	//   10   22:aload_2         
	//   11   23:invokestatic    #322 <Method void j.a(RelativeLayout, String)>
		obj = ((Object) (SettingsUIServiceData.create()));
	//   12   26:invokestatic    #482 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//   13   29:astore_2        
		A = CarpetBoostMode.values()[i1];
	//   14   30:aload_0         
	//   15   31:invokestatic    #486 <Method CarpetBoostMode[] CarpetBoostMode.values()>
	//   16   34:iload_1         
	//   17   35:aaload          
	//   18   36:putfield        #104 <Field CarpetBoostMode A>
		((SettingsUIServiceData) (obj)).setIntegerSetting(SettingType.CarpetBoost, A.ordinal());
	//   19   39:aload_2         
	//   20   40:getstatic       #492 <Field SettingType SettingType.CarpetBoost>
	//   21   43:aload_0         
	//   22   44:getfield        #104 <Field CarpetBoostMode A>
	//   23   47:invokevirtual   #381 <Method int CarpetBoostMode.ordinal()>
	//   24   50:invokevirtual   #496 <Method void SettingsUIServiceData.setIntegerSetting(SettingType, int)>
		a(SettingsUIServiceCommand.SetCleaningPreference, ((SettingsUIServiceData) (obj)));
	//   25   53:aload_0         
	//   26   54:getstatic       #502 <Field SettingsUIServiceCommand SettingsUIServiceCommand.SetCleaningPreference>
	//   27   57:aload_2         
	//   28   58:invokespecial   #504 <Method void a(SettingsUIServiceCommand, SettingsUIServiceData)>
		y = CleanPresetType.CustomClean;
	//   29   61:aload_0         
	//   30   62:getstatic       #450 <Field CleanPresetType CleanPresetType.CustomClean>
	//   31   65:putfield        #100 <Field CleanPresetType y>
	//   32   68:return          
	}

	public void b(boolean flag)
	{
		if(c(false) || B == null)
	//*   0    0:aload_0         
	//*   1    1:iconst_0        
	//*   2    2:invokespecial   #372 <Method boolean c(boolean)>
	//*   3    5:ifne            15
	//*   4    8:aload_0         
	//*   5    9:getfield        #106 <Field Boolean B>
	//*   6   12:ifnonnull       23
			B = Boolean.valueOf(flag);
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:invokestatic    #357 <Method Boolean Boolean.valueOf(boolean)>
	//   10   20:putfield        #106 <Field Boolean B>
	//   11   23:return          
	}

	protected void c()
	{
		ViewGroup viewgroup = D;
	//    0    0:aload_0         
	//    1    1:getfield        #286 <Field ViewGroup D>
	//    2    4:astore_2        
		byte byte0 = 0;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(viewgroup == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       18
			g();
	//    7   11:aload_0         
	//    8   12:invokespecial   #470 <Method void g()>
		else
	//*   9   15:goto            26
			D.setVisibility(0);
	//   10   18:aload_0         
	//   11   19:getfield        #286 <Field ViewGroup D>
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #473 <Method void ViewGroup.setVisibility(int)>
		if(C != null)
	//*  14   26:aload_0         
	//*  15   27:getfield        #444 <Field ArrayList C>
	//*  16   30:ifnull          162
		{
			if(C.contains(((Object) (MultiPassMode.Auto))))
	//*  17   33:aload_0         
	//*  18   34:getfield        #444 <Field ArrayList C>
	//*  19   37:getstatic       #507 <Field MultiPassMode MultiPassMode.Auto>
	//*  20   40:invokevirtual   #513 <Method boolean ArrayList.contains(Object)>
	//*  21   43:ifeq            65
			{
				E.setVisibility(0);
	//   22   46:aload_0         
	//   23   47:getfield        #290 <Field RelativeLayout E>
	//   24   50:iconst_0        
	//   25   51:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
				K.setVisibility(0);
	//   26   54:aload_0         
	//   27   55:getfield        #293 <Field View K>
	//   28   58:iconst_0        
	//   29   59:invokevirtual   #516 <Method void View.setVisibility(int)>
			} else
	//*  30   62:goto            83
			{
				E.setVisibility(8);
	//   31   65:aload_0         
	//   32   66:getfield        #290 <Field RelativeLayout E>
	//   33   69:bipush          8
	//   34   71:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
				K.setVisibility(8);
	//   35   74:aload_0         
	//   36   75:getfield        #293 <Field View K>
	//   37   78:bipush          8
	//   38   80:invokevirtual   #516 <Method void View.setVisibility(int)>
			}
			if(C.contains(((Object) (MultiPassMode.One))))
	//*  39   83:aload_0         
	//*  40   84:getfield        #444 <Field ArrayList C>
	//*  41   87:getstatic       #519 <Field MultiPassMode MultiPassMode.One>
	//*  42   90:invokevirtual   #513 <Method boolean ArrayList.contains(Object)>
	//*  43   93:ifeq            115
			{
				F.setVisibility(0);
	//   44   96:aload_0         
	//   45   97:getfield        #296 <Field RelativeLayout F>
	//   46  100:iconst_0        
	//   47  101:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
				L.setVisibility(0);
	//   48  104:aload_0         
	//   49  105:getfield        #299 <Field View L>
	//   50  108:iconst_0        
	//   51  109:invokevirtual   #516 <Method void View.setVisibility(int)>
			} else
	//*  52  112:goto            133
			{
				F.setVisibility(8);
	//   53  115:aload_0         
	//   54  116:getfield        #296 <Field RelativeLayout F>
	//   55  119:bipush          8
	//   56  121:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
				L.setVisibility(8);
	//   57  124:aload_0         
	//   58  125:getfield        #299 <Field View L>
	//   59  128:bipush          8
	//   60  130:invokevirtual   #516 <Method void View.setVisibility(int)>
			}
			RelativeLayout relativelayout = G;
	//   61  133:aload_0         
	//   62  134:getfield        #302 <Field RelativeLayout G>
	//   63  137:astore_2        
			if(!C.contains(((Object) (MultiPassMode.Two))))
	//*  64  138:aload_0         
	//*  65  139:getfield        #444 <Field ArrayList C>
	//*  66  142:getstatic       #522 <Field MultiPassMode MultiPassMode.Two>
	//*  67  145:invokevirtual   #513 <Method boolean ArrayList.contains(Object)>
	//*  68  148:ifeq            154
	//*  69  151:goto            157
				byte0 = 8;
	//   70  154:bipush          8
	//   71  156:istore_1        
			relativelayout.setVisibility(((int) (byte0)));
	//   72  157:aload_2         
	//   73  158:iload_1         
	//   74  159:invokevirtual   #261 <Method void RelativeLayout.setVisibility(int)>
		}
		if(z != null)
	//*  75  162:aload_0         
	//*  76  163:getfield        #102 <Field MultiPassMode z>
	//*  77  166:ifnull          235
		{
			RelativeLayout relativelayout1;
			switch(com.irobot.home.fragments._cls2.a[z.ordinal()])
	//*  78  169:getstatic       #524 <Field int[] com.irobot.home.fragments.u$2.a>
	//*  79  172:aload_0         
	//*  80  173:getfield        #102 <Field MultiPassMode z>
	//*  81  176:invokevirtual   #436 <Method int MultiPassMode.ordinal()>
	//*  82  179:iaload          
			{
	//*  83  180:tableswitch     1 3: default 208
	//	               1 225
	//	               2 217
	//	               3 209
			default:
				return;
	//   84  208:return          

			case 3: // '\003'
				relativelayout1 = G;
	//   85  209:aload_0         
	//   86  210:getfield        #302 <Field RelativeLayout G>
	//   87  213:astore_2        
				break;

	//*  88  214:goto            230
			case 2: // '\002'
				relativelayout1 = F;
	//   89  217:aload_0         
	//   90  218:getfield        #296 <Field RelativeLayout F>
	//   91  221:astore_2        
				break;

	//*  92  222:goto            230
			case 1: // '\001'
				relativelayout1 = E;
	//   93  225:aload_0         
	//   94  226:getfield        #290 <Field RelativeLayout E>
	//   95  229:astore_2        
				break;
			}
			relativelayout1.callOnClick();
	//   96  230:aload_2         
	//   97  231:invokevirtual   #527 <Method boolean RelativeLayout.callOnClick()>
	//   98  234:pop             
		}
	//   99  235:return          
	}

	protected void c(int i1)
	{
label0:
		{
			MultiPassMode multipassmode;
			if(i1 != 0x7f0900e6)
	//*   0    0:iload_1         
	//*   1    1:ldc2            #287 <Int 0x7f0900e6>
	//*   2    4:icmpeq          113
			{
				if(i1 != 0x7f0900e9)
	//*   3    7:iload_1         
	//*   4    8:ldc2            #294 <Int 0x7f0900e9>
	//*   5   11:icmpeq          72
				{
					if(i1 != 0x7f0900eb)
	//*   6   14:iload_1         
	//*   7   15:ldc2            #300 <Int 0x7f0900eb>
	//*   8   18:icmpeq          31
					{
						com.irobot.home.util.o.e(q, "Unknown view pressed.");
	//    9   21:getstatic       #83  <Field String q>
	//   10   24:ldc2            #529 <String "Unknown view pressed.">
	//   11   27:invokestatic    #531 <Method void o.e(String, String)>
						return;
	//   12   30:return          
					}
					if(J.isChecked())
						break label0;
	//   13   31:aload_0         
	//   14   32:getfield        #318 <Field CheckedTextView J>
	//   15   35:invokevirtual   #536 <Method boolean CheckedTextView.isChecked()>
	//   16   38:ifne            156
					H.setChecked(false);
	//   17   41:aload_0         
	//   18   42:getfield        #312 <Field CheckedTextView H>
	//   19   45:iconst_0        
	//   20   46:invokevirtual   #537 <Method void CheckedTextView.setChecked(boolean)>
					I.setChecked(false);
	//   21   49:aload_0         
	//   22   50:getfield        #315 <Field CheckedTextView I>
	//   23   53:iconst_0        
	//   24   54:invokevirtual   #537 <Method void CheckedTextView.setChecked(boolean)>
					J.setChecked(true);
	//   25   57:aload_0         
	//   26   58:getfield        #318 <Field CheckedTextView J>
	//   27   61:iconst_1        
	//   28   62:invokevirtual   #537 <Method void CheckedTextView.setChecked(boolean)>
					multipassmode = MultiPassMode.Two;
	//   29   65:getstatic       #522 <Field MultiPassMode MultiPassMode.Two>
	//   30   68:astore_2        
				} else
	//*  31   69:goto            151
				{
					if(I.isChecked())
						break label0;
	//   32   72:aload_0         
	//   33   73:getfield        #315 <Field CheckedTextView I>
	//   34   76:invokevirtual   #536 <Method boolean CheckedTextView.isChecked()>
	//   35   79:ifne            156
					H.setChecked(false);
	//   36   82:aload_0         
	//   37   83:getfield        #312 <Field CheckedTextView H>
	//   38   86:iconst_0        
	//   39   87:invokevirtual   #537 <Method void CheckedTextView.setChecked(boolean)>
					I.setChecked(true);
	//   40   90:aload_0         
	//   41   91:getfield        #315 <Field CheckedTextView I>
	//   42   94:iconst_1        
	//   43   95:invokevirtual   #537 <Method void CheckedTextView.setChecked(boolean)>
					J.setChecked(false);
	//   44   98:aload_0         
	//   45   99:getfield        #318 <Field CheckedTextView J>
	//   46  102:iconst_0        
	//   47  103:invokevirtual   #537 <Method void CheckedTextView.setChecked(boolean)>
					multipassmode = MultiPassMode.One;
	//   48  106:getstatic       #519 <Field MultiPassMode MultiPassMode.One>
	//   49  109:astore_2        
				}
			} else
	//*  50  110:goto            151
			{
				if(H.isChecked())
					break label0;
	//   51  113:aload_0         
	//   52  114:getfield        #312 <Field CheckedTextView H>
	//   53  117:invokevirtual   #536 <Method boolean CheckedTextView.isChecked()>
	//   54  120:ifne            156
				H.setChecked(true);
	//   55  123:aload_0         
	//   56  124:getfield        #312 <Field CheckedTextView H>
	//   57  127:iconst_1        
	//   58  128:invokevirtual   #537 <Method void CheckedTextView.setChecked(boolean)>
				I.setChecked(false);
	//   59  131:aload_0         
	//   60  132:getfield        #315 <Field CheckedTextView I>
	//   61  135:iconst_0        
	//   62  136:invokevirtual   #537 <Method void CheckedTextView.setChecked(boolean)>
				J.setChecked(false);
	//   63  139:aload_0         
	//   64  140:getfield        #318 <Field CheckedTextView J>
	//   65  143:iconst_0        
	//   66  144:invokevirtual   #537 <Method void CheckedTextView.setChecked(boolean)>
				multipassmode = MultiPassMode.Auto;
	//   67  147:getstatic       #507 <Field MultiPassMode MultiPassMode.Auto>
	//   68  150:astore_2        
			}
			z = multipassmode;
	//   69  151:aload_0         
	//   70  152:aload_2         
	//   71  153:putfield        #102 <Field MultiPassMode z>
		}
	//   72  156:return          
	}

	public HashMap d()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #89  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #90  <Method void HashMap()>
	//    3    7:astore_1        
		if(A != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #104 <Field CarpetBoostMode A>
	//*   6   12:ifnull          26
			hashmap.putAll(((java.util.Map) (CommonUtilities.mapFromCarpetBoostMode(A))));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #104 <Field CarpetBoostMode A>
	//   10   20:invokestatic    #542 <Method HashMap CommonUtilities.mapFromCarpetBoostMode(CarpetBoostMode)>
	//   11   23:invokevirtual   #546 <Method void HashMap.putAll(java.util.Map)>
		if(z != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #102 <Field MultiPassMode z>
	//*  14   30:ifnull          44
			hashmap.putAll(((java.util.Map) (CommonUtilities.mapFromMultiPassMode(z))));
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:getfield        #102 <Field MultiPassMode z>
	//   18   38:invokestatic    #550 <Method HashMap CommonUtilities.mapFromMultiPassMode(MultiPassMode)>
	//   19   41:invokevirtual   #546 <Method void HashMap.putAll(java.util.Map)>
		String s1 = q;
	//   20   44:getstatic       #83  <Field String q>
	//   21   47:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   22   48:new             #326 <Class StringBuilder>
	//   23   51:dup             
	//   24   52:invokespecial   #327 <Method void StringBuilder()>
	//   25   55:astore_3        
		stringbuilder.append("Something requested settings, they get: ");
	//   26   56:aload_3         
	//   27   57:ldc2            #552 <String "Something requested settings, they get: ">
	//   28   60:invokevirtual   #333 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
		stringbuilder.append(((Object) (hashmap)));
	//   30   64:aload_3         
	//   31   65:aload_1         
	//   32   66:invokevirtual   #336 <Method StringBuilder StringBuilder.append(Object)>
	//   33   69:pop             
		com.irobot.home.util.o.b(s1, stringbuilder.toString());
	//   34   70:aload_2         
	//   35   71:aload_3         
	//   36   72:invokevirtual   #339 <Method String StringBuilder.toString()>
	//   37   75:invokestatic    #341 <Method void o.b(String, String)>
		return hashmap;
	//   38   78:aload_1         
	//   39   79:areturn         
	}

	public void e()
	{
		CleaningPassSettingsActivity_.a(((android.support.v4.app.Fragment) (this))).a(a).a(p ^ true).a(1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #558 <Method com.irobot.home.CleaningPassSettingsActivity_$a CleaningPassSettingsActivity_.a(android.support.v4.app.Fragment)>
	//    2    4:aload_0         
	//    3    5:getfield        #158 <Field String a>
	//    4    8:invokevirtual   #563 <Method com.irobot.home.CleaningPassSettingsActivity_$a com.irobot.home.CleaningPassSettingsActivity_$a.a(String)>
	//    5   11:aload_0         
	//    6   12:getfield        #98  <Field boolean p>
	//    7   15:iconst_1        
	//    8   16:ixor            
	//    9   17:invokevirtual   #566 <Method com.irobot.home.CleaningPassSettingsActivity_$a com.irobot.home.CleaningPassSettingsActivity_$a.a(boolean)>
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #569 <Method org.androidannotations.api.a.e com.irobot.home.CleaningPassSettingsActivity_$a.a(int)>
	//   12   24:pop             
	//   13   25:return          
	}

	public void onActivityResult(int i1, int j1, Intent intent)
	{
		if(i1 != 1)
	//*   0    0:iload_1         
	//*   1    1:iconst_1        
	//*   2    2:icmpeq          6
		{
			return;
	//    3    5:return          
		} else
		{
			intent = ((Intent) ((MultiPassMode)com.irobot.home.util.e.a(com/irobot/core/MultiPassMode).a(intent)));
	//    4    6:ldc2            #435 <Class MultiPassMode>
	//    5    9:invokestatic    #576 <Method com.irobot.home.util.e$a e.a(Class)>
	//    6   12:aload_3         
	//    7   13:invokevirtual   #581 <Method Enum com.irobot.home.util.e$a.a(Intent)>
	//    8   16:checkcast       #435 <Class MultiPassMode>
	//    9   19:astore_3        
			SettingsUIServiceData settingsuiservicedata = SettingsUIServiceData.create();
	//   10   20:invokestatic    #482 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//   11   23:astore          4
			settingsuiservicedata.setIntegerSetting(SettingType.MultiPass, ((MultiPassMode) (intent)).ordinal());
	//   12   25:aload           4
	//   13   27:getstatic       #584 <Field SettingType SettingType.MultiPass>
	//   14   30:aload_3         
	//   15   31:invokevirtual   #436 <Method int MultiPassMode.ordinal()>
	//   16   34:invokevirtual   #496 <Method void SettingsUIServiceData.setIntegerSetting(SettingType, int)>
			a(SettingsUIServiceCommand.SetCleaningPreference, settingsuiservicedata);
	//   17   37:aload_0         
	//   18   38:getstatic       #502 <Field SettingsUIServiceCommand SettingsUIServiceCommand.SetCleaningPreference>
	//   19   41:aload           4
	//   20   43:invokespecial   #504 <Method void a(SettingsUIServiceCommand, SettingsUIServiceData)>
			a(((MultiPassMode) (intent)), true);
	//   21   46:aload_0         
	//   22   47:aload_3         
	//   23   48:iconst_1        
	//   24   49:invokevirtual   #421 <Method void a(MultiPassMode, boolean)>
			return;
	//   25   52:return          
		}
	}

	public void onClick(View view)
	{
		if(view != c) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #226 <Field RelativeLayout c>
	//    3    5:if_acmpne       56
_L1:
		y = CleanPresetType.DetailClean;
	//    4    8:aload_0         
	//    5    9:getstatic       #589 <Field CleanPresetType CleanPresetType.DetailClean>
	//    6   12:putfield        #100 <Field CleanPresetType y>
		z = MultiPassMode.Auto;
	//    7   15:aload_0         
	//    8   16:getstatic       #507 <Field MultiPassMode MultiPassMode.Auto>
	//    9   19:putfield        #102 <Field MultiPassMode z>
		A = CarpetBoostMode.Auto;
	//   10   22:aload_0         
	//   11   23:getstatic       #591 <Field CarpetBoostMode CarpetBoostMode.Auto>
	//   12   26:putfield        #104 <Field CarpetBoostMode A>
		r.setChecked(true);
	//   13   29:aload_0         
	//   14   30:getfield        #235 <Field CustomCheckedTextView r>
	//   15   33:iconst_1        
	//   16   34:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
		s.setChecked(false);
	//   17   37:aload_0         
	//   18   38:getfield        #248 <Field CustomCheckedTextView s>
	//   19   41:iconst_0        
	//   20   42:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
_L4:
		t.setChecked(false);
	//   21   45:aload_0         
	//   22   46:getfield        #256 <Field CustomCheckedTextView t>
	//   23   49:iconst_0        
	//   24   50:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
		break MISSING_BLOCK_LABEL_143;
	//   25   53:goto            143
_L2:
		if(view != d)
			break; /* Loop/switch isn't completed */
	//   26   56:aload_1         
	//   27   57:aload_0         
	//   28   58:getfield        #246 <Field RelativeLayout d>
	//   29   61:if_acmpne       104
		y = CleanPresetType.QuietClean;
	//   30   64:aload_0         
	//   31   65:getstatic       #594 <Field CleanPresetType CleanPresetType.QuietClean>
	//   32   68:putfield        #100 <Field CleanPresetType y>
		z = MultiPassMode.Auto;
	//   33   71:aload_0         
	//   34   72:getstatic       #507 <Field MultiPassMode MultiPassMode.Auto>
	//   35   75:putfield        #102 <Field MultiPassMode z>
		A = CarpetBoostMode.Eco;
	//   36   78:aload_0         
	//   37   79:getstatic       #597 <Field CarpetBoostMode CarpetBoostMode.Eco>
	//   38   82:putfield        #104 <Field CarpetBoostMode A>
		r.setChecked(false);
	//   39   85:aload_0         
	//   40   86:getfield        #235 <Field CustomCheckedTextView r>
	//   41   89:iconst_0        
	//   42   90:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
		s.setChecked(true);
	//   43   93:aload_0         
	//   44   94:getfield        #248 <Field CustomCheckedTextView s>
	//   45   97:iconst_1        
	//   46   98:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
		if(true) goto _L4; else goto _L3
	//   47  101:goto            45
_L3:
		if(view != e)
			break MISSING_BLOCK_LABEL_178;
	//   48  104:aload_1         
	//   49  105:aload_0         
	//   50  106:getfield        #254 <Field RelativeLayout e>
	//   51  109:if_acmpne       178
		y = CleanPresetType.CustomClean;
	//   52  112:aload_0         
	//   53  113:getstatic       #450 <Field CleanPresetType CleanPresetType.CustomClean>
	//   54  116:putfield        #100 <Field CleanPresetType y>
		r.setChecked(false);
	//   55  119:aload_0         
	//   56  120:getfield        #235 <Field CustomCheckedTextView r>
	//   57  123:iconst_0        
	//   58  124:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
		s.setChecked(false);
	//   59  127:aload_0         
	//   60  128:getfield        #248 <Field CustomCheckedTextView s>
	//   61  131:iconst_0        
	//   62  132:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
		t.setChecked(true);
	//   63  135:aload_0         
	//   64  136:getfield        #256 <Field CustomCheckedTextView t>
	//   65  139:iconst_1        
	//   66  140:invokevirtual   #409 <Method void CustomCheckedTextView.setChecked(boolean)>
		view = ((View) (SettingsUIServiceData.create()));
	//   67  143:invokestatic    #482 <Method SettingsUIServiceData SettingsUIServiceData.create()>
	//   68  146:astore_1        
		((SettingsUIServiceData) (view)).setIntegerSetting(SettingType.CleaningPresets, y.ordinal());
	//   69  147:aload_1         
	//   70  148:getstatic       #600 <Field SettingType SettingType.CleaningPresets>
	//   71  151:aload_0         
	//   72  152:getfield        #100 <Field CleanPresetType y>
	//   73  155:invokevirtual   #405 <Method int CleanPresetType.ordinal()>
	//   74  158:invokevirtual   #496 <Method void SettingsUIServiceData.setIntegerSetting(SettingType, int)>
		a(SettingsUIServiceCommand.SelectCleaningPreset, ((SettingsUIServiceData) (view)));
	//   75  161:aload_0         
	//   76  162:getstatic       #603 <Field SettingsUIServiceCommand SettingsUIServiceCommand.SelectCleaningPreset>
	//   77  165:aload_1         
	//   78  166:invokespecial   #504 <Method void a(SettingsUIServiceCommand, SettingsUIServiceData)>
		a(y);
	//   79  169:aload_0         
	//   80  170:aload_0         
	//   81  171:getfield        #100 <Field CleanPresetType y>
	//   82  174:invokevirtual   #605 <Method void a(CleanPresetType)>
		return;
	//   83  177:return          
		com.irobot.home.util.o.e(q, "Unexpected layout checked, no preset available.");
	//   84  178:getstatic       #83  <Field String q>
	//   85  181:ldc2            #607 <String "Unexpected layout checked, no preset available.">
	//   86  184:invokestatic    #531 <Method void o.e(String, String)>
		return;
	//   87  187:return          
	}

	private static final String q = com.irobot.home.util.j.r(((Class) (com/irobot/home/fragments/u)).getSimpleName());
	private CarpetBoostMode A;
	private Boolean B;
	private ArrayList C;
	private ViewGroup D;
	private RelativeLayout E;
	private RelativeLayout F;
	private RelativeLayout G;
	private CheckedTextView H;
	private CheckedTextView I;
	private CheckedTextView J;
	private View K;
	private View L;
	private android.view.View.OnClickListener M;
	private boolean N;
	private int O;
	RelativeLayout c;
	RelativeLayout d;
	RelativeLayout e;
	RelativeLayout f;
	RelativeLayout i;
	ViewStub j;
	LinearLayout k;
	LinearLayout l;
	protected volatile HashMap m;
	boolean n;
	boolean o;
	boolean p;
	private CustomCheckedTextView r;
	private CustomCheckedTextView s;
	private CustomCheckedTextView t;
	private CustomTextView u;
	private CustomTextView v;
	private CustomTextView w;
	private CustomTextView x;
	private CleanPresetType y;
	private MultiPassMode z;

	static 
	{
	//    0    0:ldc1            #2   <Class u>
	//    1    2:invokevirtual   #76  <Method String Class.getSimpleName()>
	//    2    5:invokestatic    #81  <Method String j.r(String)>
	//    3    8:putstatic       #83  <Field String q>
	//*   4   11:return          
	}
}
