// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import com.irobot.home.MapPrivacyActivity_;
import com.irobot.home.view.CustomTextView;

// Referenced classes of package com.irobot.home.fragments:
//			j

public class q extends j
{

	public q()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void j()>
	//    2    4:return          
	}

	void a()
	{
		String s = getString(0x7f0f0349);
	//    0    0:aload_0         
	//    1    1:ldc1            #12  <Int 0x7f0f0349>
	//    2    3:invokevirtual   #16  <Method String getString(int)>
	//    3    6:astore_1        
		SpannableString spannablestring = new SpannableString(((CharSequence) (s)));
	//    4    7:new             #18  <Class SpannableString>
	//    5   10:dup             
	//    6   11:aload_1         
	//    7   12:invokespecial   #21  <Method void SpannableString(CharSequence)>
	//    8   15:astore_2        
		spannablestring.setSpan(((Object) (new UnderlineSpan())), 0, s.length(), 0);
	//    9   16:aload_2         
	//   10   17:new             #23  <Class UnderlineSpan>
	//   11   20:dup             
	//   12   21:invokespecial   #24  <Method void UnderlineSpan()>
	//   13   24:iconst_0        
	//   14   25:aload_1         
	//   15   26:invokevirtual   #30  <Method int String.length()>
	//   16   29:iconst_0        
	//   17   30:invokevirtual   #34  <Method void SpannableString.setSpan(Object, int, int, int)>
		a.setText(((CharSequence) (spannablestring)));
	//   18   33:aload_0         
	//   19   34:getfield        #36  <Field CustomTextView a>
	//   20   37:aload_2         
	//   21   38:invokevirtual   #41  <Method void CustomTextView.setText(CharSequence)>
	//   22   41:return          
	}

	void b()
	{
		MapPrivacyActivity_.a(((android.content.Context) (getActivity()))).a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #46  <Method android.support.v4.app.FragmentActivity getActivity()>
	//    2    4:invokestatic    #51  <Method com.irobot.home.MapPrivacyActivity_$a MapPrivacyActivity_.a(android.content.Context)>
	//    3    7:invokevirtual   #56  <Method org.androidannotations.api.a.e com.irobot.home.MapPrivacyActivity_$a.a()>
	//    4   10:pop             
	//    5   11:return          
	}

	CustomTextView a;
}
