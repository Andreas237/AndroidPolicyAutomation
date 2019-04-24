// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.widget.TextView;
import com.irobot.home.BaseFragmentActivity;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import com.irobot.home.view.CustomTypefaceSpan;
import java.util.Locale;

// Referenced classes of package com.irobot.home.fragments:
//			g

public class bo extends g
{

	public bo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void g()>
	//    2    4:return          
	}

	void a()
	{
		((BaseFragmentActivity)getActivity()).b(d);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method android.app.Activity getActivity()>
	//    2    4:checkcast       #22  <Class BaseFragmentActivity>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field int d>
	//    5   11:invokevirtual   #27  <Method void BaseFragmentActivity.b(int)>
		o.c("*** PROVISIONING ***", String.format(Locale.US, getString(d), new Object[0]));
	//    6   14:ldc1            #29  <String "*** PROVISIONING ***">
	//    7   16:getstatic       #35  <Field Locale Locale.US>
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #24  <Field int d>
	//   11   24:invokevirtual   #39  <Method String getString(int)>
	//   12   27:iconst_0        
	//   13   28:anewarray       Object[]
	//   14   31:invokestatic    #47  <Method String String.format(Locale, String, Object[])>
	//   15   34:invokestatic    #52  <Method void o.c(String, String)>
		Object obj = ((Object) (new StringBuilder()));
	//   16   37:new             #54  <Class StringBuilder>
	//   17   40:dup             
	//   18   41:invokespecial   #55  <Method void StringBuilder()>
	//   19   44:astore          5
		((StringBuilder) (obj)).append(getString(0x7f0f0801));
	//   20   46:aload           5
	//   21   48:aload_0         
	//   22   49:ldc1            #56  <Int 0x7f0f0801>
	//   23   51:invokevirtual   #39  <Method String getString(int)>
	//   24   54:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   25   57:pop             
		((StringBuilder) (obj)).append(" ");
	//   26   58:aload           5
	//   27   60:ldc1            #62  <String " ">
	//   28   62:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   29   65:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   30   66:aload           5
	//   31   68:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   32   71:astore          5
		Object obj1 = ((Object) (new StringBuilder()));
	//   33   73:new             #54  <Class StringBuilder>
	//   34   76:dup             
	//   35   77:invokespecial   #55  <Method void StringBuilder()>
	//   36   80:astore          6
		((StringBuilder) (obj1)).append(" ");
	//   37   82:aload           6
	//   38   84:ldc1            #62  <String " ">
	//   39   86:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   40   89:pop             
		((StringBuilder) (obj1)).append(getString(0x7f0f0802));
	//   41   90:aload           6
	//   42   92:aload_0         
	//   43   93:ldc1            #67  <Int 0x7f0f0802>
	//   44   95:invokevirtual   #39  <Method String getString(int)>
	//   45   98:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   46  101:pop             
		((StringBuilder) (obj1)).append(" ");
	//   47  102:aload           6
	//   48  104:ldc1            #62  <String " ">
	//   49  106:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   50  109:pop             
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//   51  110:aload           6
	//   52  112:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   53  115:astore          6
		Object obj2 = ((Object) (new StringBuilder()));
	//   54  117:new             #54  <Class StringBuilder>
	//   55  120:dup             
	//   56  121:invokespecial   #55  <Method void StringBuilder()>
	//   57  124:astore          7
		((StringBuilder) (obj2)).append(" ");
	//   58  126:aload           7
	//   59  128:ldc1            #62  <String " ">
	//   60  130:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   61  133:pop             
		((StringBuilder) (obj2)).append(getString(0x7f0f0803));
	//   62  134:aload           7
	//   63  136:aload_0         
	//   64  137:ldc1            #68  <Int 0x7f0f0803>
	//   65  139:invokevirtual   #39  <Method String getString(int)>
	//   66  142:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   67  145:pop             
		obj2 = ((Object) (((StringBuilder) (obj2)).toString()));
	//   68  146:aload           7
	//   69  148:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   70  151:astore          7
		String s1 = getString(0x7f0f03e5);
	//   71  153:aload_0         
	//   72  154:ldc1            #69  <Int 0x7f0f03e5>
	//   73  156:invokevirtual   #39  <Method String getString(int)>
	//   74  159:astore          11
		String s = getString(0x7f0f03f6);
	//   75  161:aload_0         
	//   76  162:ldc1            #70  <Int 0x7f0f03f6>
	//   77  164:invokevirtual   #39  <Method String getString(int)>
	//   78  167:astore          9
		int k = ((String) (obj)).length();
	//   79  169:aload           5
	//   80  171:invokevirtual   #74  <Method int String.length()>
	//   81  174:istore_2        
		int l = ((String) (obj1)).length();
	//   82  175:aload           6
	//   83  177:invokevirtual   #74  <Method int String.length()>
	//   84  180:istore_3        
		int i1 = s1.length();
	//   85  181:aload           11
	//   86  183:invokevirtual   #74  <Method int String.length()>
	//   87  186:istore          4
		int i = s.length();
	//   88  188:aload           9
	//   89  190:invokevirtual   #74  <Method int String.length()>
	//   90  193:istore_1        
		android.graphics.Typeface typeface = j.a(((android.content.Context) (getActivity())));
	//   91  194:aload_0         
	//   92  195:invokevirtual   #20  <Method android.app.Activity getActivity()>
	//   93  198:invokestatic    #79  <Method android.graphics.Typeface j.a(android.content.Context)>
	//   94  201:astore          10
		SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//   95  203:new             #81  <Class SpannableStringBuilder>
	//   96  206:dup             
	//   97  207:invokespecial   #82  <Method void SpannableStringBuilder()>
	//   98  210:astore          8
		spannablestringbuilder.append(((CharSequence) (obj)));
	//   99  212:aload           8
	//  100  214:aload           5
	//  101  216:invokevirtual   #85  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//  102  219:pop             
		spannablestringbuilder.append(((CharSequence) (s1)));
	//  103  220:aload           8
	//  104  222:aload           11
	//  105  224:invokevirtual   #85  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//  106  227:pop             
		obj = ((Object) (new CustomTypefaceSpan("", typeface)));
	//  107  228:new             #87  <Class CustomTypefaceSpan>
	//  108  231:dup             
	//  109  232:ldc1            #89  <String "">
	//  110  234:aload           10
	//  111  236:invokespecial   #92  <Method void CustomTypefaceSpan(String, android.graphics.Typeface)>
	//  112  239:astore          5
		i1 += k;
	//  113  241:iload           4
	//  114  243:iload_2         
	//  115  244:iadd            
	//  116  245:istore          4
		spannablestringbuilder.setSpan(obj, k, i1, 33);
	//  117  247:aload           8
	//  118  249:aload           5
	//  119  251:iload_2         
	//  120  252:iload           4
	//  121  254:bipush          33
	//  122  256:invokevirtual   #96  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		spannablestringbuilder.setSpan(((Object) (new RelativeSizeSpan(2.0F))), k, i1, 33);
	//  123  259:aload           8
	//  124  261:new             #98  <Class RelativeSizeSpan>
	//  125  264:dup             
	//  126  265:fconst_2        
	//  127  266:invokespecial   #101 <Method void RelativeSizeSpan(float)>
	//  128  269:iload_2         
	//  129  270:iload           4
	//  130  272:bipush          33
	//  131  274:invokevirtual   #96  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		spannablestringbuilder.append(((CharSequence) (obj1)));
	//  132  277:aload           8
	//  133  279:aload           6
	//  134  281:invokevirtual   #85  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//  135  284:pop             
		spannablestringbuilder.append(((CharSequence) (s)));
	//  136  285:aload           8
	//  137  287:aload           9
	//  138  289:invokevirtual   #85  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//  139  292:pop             
		k = i1 + l;
	//  140  293:iload           4
	//  141  295:iload_3         
	//  142  296:iadd            
	//  143  297:istore_2        
		obj = ((Object) (new CustomTypefaceSpan("", typeface)));
	//  144  298:new             #87  <Class CustomTypefaceSpan>
	//  145  301:dup             
	//  146  302:ldc1            #89  <String "">
	//  147  304:aload           10
	//  148  306:invokespecial   #92  <Method void CustomTypefaceSpan(String, android.graphics.Typeface)>
	//  149  309:astore          5
		i += k;
	//  150  311:iload_1         
	//  151  312:iload_2         
	//  152  313:iadd            
	//  153  314:istore_1        
		spannablestringbuilder.setSpan(obj, k, i, 33);
	//  154  315:aload           8
	//  155  317:aload           5
	//  156  319:iload_2         
	//  157  320:iload_1         
	//  158  321:bipush          33
	//  159  323:invokevirtual   #96  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		spannablestringbuilder.setSpan(((Object) (new RelativeSizeSpan(2.0F))), k, i, 33);
	//  160  326:aload           8
	//  161  328:new             #98  <Class RelativeSizeSpan>
	//  162  331:dup             
	//  163  332:fconst_2        
	//  164  333:invokespecial   #101 <Method void RelativeSizeSpan(float)>
	//  165  336:iload_2         
	//  166  337:iload_1         
	//  167  338:bipush          33
	//  168  340:invokevirtual   #96  <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
		spannablestringbuilder.append(((CharSequence) (obj2)));
	//  169  343:aload           8
	//  170  345:aload           7
	//  171  347:invokevirtual   #85  <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//  172  350:pop             
		a.setText(((CharSequence) (spannablestringbuilder)));
	//  173  351:aload_0         
	//  174  352:getfield        #103 <Field TextView a>
	//  175  355:aload           8
	//  176  357:invokevirtual   #109 <Method void TextView.setText(CharSequence)>
		b.setTypeface(j.a(((android.content.Context) (getActivity()))));
	//  177  360:aload_0         
	//  178  361:getfield        #111 <Field TextView b>
	//  179  364:aload_0         
	//  180  365:invokevirtual   #20  <Method android.app.Activity getActivity()>
	//  181  368:invokestatic    #79  <Method android.graphics.Typeface j.a(android.content.Context)>
	//  182  371:invokevirtual   #115 <Method void TextView.setTypeface(android.graphics.Typeface)>
	//  183  374:return          
	}

	TextView a;
	TextView b;
	String c;
	int d;
}
