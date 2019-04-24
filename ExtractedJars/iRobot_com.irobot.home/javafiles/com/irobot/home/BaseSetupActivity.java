// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.irobot.home.model.rest.LearnMoreInfo;
import com.irobot.home.model.rest.LearnMoreItem;
import com.irobot.home.rest.CustomerCareRestClient;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomButton;
import java.util.*;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity, WebViewActivity_

public class BaseSetupActivity extends BaseFragmentActivity
{

	public BaseSetupActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void BaseFragmentActivity()>
	//    2    4:return          
	}

	public void a(String s)
	{
		d = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #28  <Field LearnMoreInfo d>
		Locale locale = Locale.getDefault();
	//    3    5:invokestatic    #34  <Method Locale Locale.getDefault()>
	//    4    8:astore_2        
		if(locale != null && j.a())
	//*   5    9:aload_2         
	//*   6   10:ifnull          87
	//*   7   13:invokestatic    #39  <Method boolean j.a()>
	//*   8   16:ifeq            87
			try
			{
				d = c.getLearnMoreInfo(j.a(locale), j.h(((android.content.Context) (this))));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #41  <Field CustomerCareRestClient c>
	//   12   24:aload_2         
	//   13   25:invokestatic    #44  <Method String j.a(Locale)>
	//   14   28:aload_0         
	//   15   29:invokestatic    #48  <Method String j.h(android.content.Context)>
	//   16   32:invokeinterface #54  <Method LearnMoreInfo CustomerCareRestClient.getLearnMoreInfo(String, String)>
	//   17   37:putfield        #28  <Field LearnMoreInfo d>
			}
	//*  18   40:goto            95
			catch(Exception exception)
	//*  19   43:astore_2        
			{
				String s1 = f;
	//   20   44:getstatic       #56  <Field String f>
	//   21   47:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   22   48:new             #58  <Class StringBuilder>
	//   23   51:dup             
	//   24   52:invokespecial   #59  <Method void StringBuilder()>
	//   25   55:astore          4
				stringbuilder.append("Error in getLearnMoreUrl: ");
	//   26   57:aload           4
	//   27   59:ldc1            #61  <String "Error in getLearnMoreUrl: ">
	//   28   61:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   29   64:pop             
				stringbuilder.append(exception.getMessage());
	//   30   65:aload           4
	//   31   67:aload_2         
	//   32   68:invokevirtual   #69  <Method String Exception.getMessage()>
	//   33   71:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   34   74:pop             
				o.e(s1, stringbuilder.toString());
	//   35   75:aload_3         
	//   36   76:aload           4
	//   37   78:invokevirtual   #72  <Method String StringBuilder.toString()>
	//   38   81:invokestatic    #77  <Method void o.e(String, String)>
			}
		else
	//*  39   84:goto            95
			o.e(f, "Unable to get learnMoreUrl, device locale or network unavailable");
	//   40   87:getstatic       #56  <Field String f>
	//   41   90:ldc1            #79  <String "Unable to get learnMoreUrl, device locale or network unavailable">
	//   42   92:invokestatic    #77  <Method void o.e(String, String)>
		if(d != null && !d.aboutItems.isEmpty())
	//*  43   95:aload_0         
	//*  44   96:getfield        #28  <Field LearnMoreInfo d>
	//*  45   99:ifnull          171
	//*  46  102:aload_0         
	//*  47  103:getfield        #28  <Field LearnMoreInfo d>
	//*  48  106:getfield        #85  <Field List LearnMoreInfo.aboutItems>
	//*  49  109:invokeinterface #90  <Method boolean List.isEmpty()>
	//*  50  114:ifne            171
		{
			Iterator iterator = d.aboutItems.iterator();
	//   51  117:aload_0         
	//   52  118:getfield        #28  <Field LearnMoreInfo d>
	//   53  121:getfield        #85  <Field List LearnMoreInfo.aboutItems>
	//   54  124:invokeinterface #94  <Method Iterator List.iterator()>
	//   55  129:astore_2        
			do
			{
				if(!iterator.hasNext())
					break;
	//   56  130:aload_2         
	//   57  131:invokeinterface #99  <Method boolean Iterator.hasNext()>
	//   58  136:ifeq            171
				LearnMoreItem learnmoreitem = (LearnMoreItem)iterator.next();
	//   59  139:aload_2         
	//   60  140:invokeinterface #103 <Method Object Iterator.next()>
	//   61  145:checkcast       #105 <Class LearnMoreItem>
	//   62  148:astore_3        
				if(learnmoreitem.product.contentEquals(((CharSequence) (s))))
	//*  63  149:aload_3         
	//*  64  150:getfield        #108 <Field String LearnMoreItem.product>
	//*  65  153:aload_1         
	//*  66  154:invokevirtual   #114 <Method boolean String.contentEquals(CharSequence)>
	//*  67  157:ifeq            130
					b(learnmoreitem.learnUrl);
	//   68  160:aload_0         
	//   69  161:aload_3         
	//   70  162:getfield        #117 <Field String LearnMoreItem.learnUrl>
	//   71  165:invokevirtual   #119 <Method void b(String)>
			} while(true);
	//   72  168:goto            130
		}
	//   73  171:return          
	}

	public void b(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #123 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            55
		{
			a.setTextAppearance(((android.content.Context) (this)), 0x7f1001d6);
	//    3    7:aload_0         
	//    4    8:getfield        #125 <Field CustomButton a>
	//    5   11:aload_0         
	//    6   12:ldc1            #126 <Int 0x7f1001d6>
	//    7   14:invokevirtual   #132 <Method void CustomButton.setTextAppearance(android.content.Context, int)>
			a.setCompoundDrawablesRelative(((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//    8   17:aload_0         
	//    9   18:getfield        #125 <Field CustomButton a>
	//   10   21:aconst_null     
	//   11   22:aconst_null     
	//   12   23:aconst_null     
	//   13   24:aconst_null     
	//   14   25:invokevirtual   #136 <Method void CustomButton.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
			a.setEnabled(false);
	//   15   28:aload_0         
	//   16   29:getfield        #125 <Field CustomButton a>
	//   17   32:iconst_0        
	//   18   33:invokevirtual   #140 <Method void CustomButton.setEnabled(boolean)>
			a.setVisibility(8);
	//   19   36:aload_0         
	//   20   37:getfield        #125 <Field CustomButton a>
	//   21   40:bipush          8
	//   22   42:invokevirtual   #144 <Method void CustomButton.setVisibility(int)>
			b.setVisibility(8);
	//   23   45:aload_0         
	//   24   46:getfield        #146 <Field View b>
	//   25   49:bipush          8
	//   26   51:invokevirtual   #149 <Method void View.setVisibility(int)>
			return;
	//   27   54:return          
		} else
		{
			e = s;
	//   28   55:aload_0         
	//   29   56:aload_1         
	//   30   57:putfield        #151 <Field String e>
			a.setTextAppearance(((android.content.Context) (this)), 0x7f1001d5);
	//   31   60:aload_0         
	//   32   61:getfield        #125 <Field CustomButton a>
	//   33   64:aload_0         
	//   34   65:ldc1            #152 <Int 0x7f1001d5>
	//   35   67:invokevirtual   #132 <Method void CustomButton.setTextAppearance(android.content.Context, int)>
			s = ((String) (getResources().getDrawable(0x7f0801a9)));
	//   36   70:aload_0         
	//   37   71:invokevirtual   #156 <Method Resources getResources()>
	//   38   74:ldc1            #157 <Int 0x7f0801a9>
	//   39   76:invokevirtual   #163 <Method Drawable Resources.getDrawable(int)>
	//   40   79:astore_1        
			int i = ((Drawable) (s)).getIntrinsicHeight();
	//   41   80:aload_1         
	//   42   81:invokevirtual   #169 <Method int Drawable.getIntrinsicHeight()>
	//   43   84:istore_2        
			((Drawable) (s)).setBounds(0, 0, ((Drawable) (s)).getIntrinsicWidth(), i);
	//   44   85:aload_1         
	//   45   86:iconst_0        
	//   46   87:iconst_0        
	//   47   88:aload_1         
	//   48   89:invokevirtual   #172 <Method int Drawable.getIntrinsicWidth()>
	//   49   92:iload_2         
	//   50   93:invokevirtual   #176 <Method void Drawable.setBounds(int, int, int, int)>
			a.setCompoundDrawablesRelative(((Drawable) (null)), ((Drawable) (null)), ((Drawable) (s)), ((Drawable) (null)));
	//   51   96:aload_0         
	//   52   97:getfield        #125 <Field CustomButton a>
	//   53  100:aconst_null     
	//   54  101:aconst_null     
	//   55  102:aload_1         
	//   56  103:aconst_null     
	//   57  104:invokevirtual   #136 <Method void CustomButton.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
			a.setEnabled(true);
	//   58  107:aload_0         
	//   59  108:getfield        #125 <Field CustomButton a>
	//   60  111:iconst_1        
	//   61  112:invokevirtual   #140 <Method void CustomButton.setEnabled(boolean)>
			a.setVisibility(0);
	//   62  115:aload_0         
	//   63  116:getfield        #125 <Field CustomButton a>
	//   64  119:iconst_0        
	//   65  120:invokevirtual   #144 <Method void CustomButton.setVisibility(int)>
			b.setVisibility(0);
	//   66  123:aload_0         
	//   67  124:getfield        #146 <Field View b>
	//   68  127:iconst_0        
	//   69  128:invokevirtual   #149 <Method void View.setVisibility(int)>
			return;
	//   70  131:return          
		}
	}

	void e()
	{
		a.setTextAppearance(((android.content.Context) (this)), 0x7f1001d6);
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field CustomButton a>
	//    2    4:aload_0         
	//    3    5:ldc1            #126 <Int 0x7f1001d6>
	//    4    7:invokevirtual   #132 <Method void CustomButton.setTextAppearance(android.content.Context, int)>
		a.setCompoundDrawables(((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//    5   10:aload_0         
	//    6   11:getfield        #125 <Field CustomButton a>
	//    7   14:aconst_null     
	//    8   15:aconst_null     
	//    9   16:aconst_null     
	//   10   17:aconst_null     
	//   11   18:invokevirtual   #179 <Method void CustomButton.setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
		a.setEnabled(false);
	//   12   21:aload_0         
	//   13   22:getfield        #125 <Field CustomButton a>
	//   14   25:iconst_0        
	//   15   26:invokevirtual   #140 <Method void CustomButton.setEnabled(boolean)>
		a.setVisibility(8);
	//   16   29:aload_0         
	//   17   30:getfield        #125 <Field CustomButton a>
	//   18   33:bipush          8
	//   19   35:invokevirtual   #144 <Method void CustomButton.setVisibility(int)>
		b.setVisibility(8);
	//   20   38:aload_0         
	//   21   39:getfield        #146 <Field View b>
	//   22   42:bipush          8
	//   23   44:invokevirtual   #149 <Method void View.setVisibility(int)>
		c = j.i(((android.content.Context) (this)));
	//   24   47:aload_0         
	//   25   48:aload_0         
	//   26   49:invokestatic    #183 <Method CustomerCareRestClient j.i(android.content.Context)>
	//   27   52:putfield        #41  <Field CustomerCareRestClient c>
	//   28   55:return          
	}

	public void f()
	{
		WebViewActivity_.a(((android.content.Context) (this))).a(e).a(Integer.valueOf(0x7f0f0427)).a();
	//    0    0:aload_0         
	//    1    1:invokestatic    #188 <Method WebViewActivity_$a WebViewActivity_.a(android.content.Context)>
	//    2    4:aload_0         
	//    3    5:getfield        #151 <Field String e>
	//    4    8:invokevirtual   #193 <Method WebViewActivity_$a WebViewActivity_$a.a(String)>
	//    5   11:ldc1            #194 <Int 0x7f0f0427>
	//    6   13:invokestatic    #200 <Method Integer Integer.valueOf(int)>
	//    7   16:invokevirtual   #203 <Method WebViewActivity_$a WebViewActivity_$a.a(Integer)>
	//    8   19:invokevirtual   #206 <Method org.androidannotations.api.a.e WebViewActivity_$a.a()>
	//    9   22:pop             
	//   10   23:return          
	}

	private static final String f = "BaseSetupActivity";
	CustomButton a;
	View b;
	protected CustomerCareRestClient c;
	protected LearnMoreInfo d;
	protected String e;

	static 
	{
	//    0    0:return          
	}
}
