// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.card.payment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DateKeyListener;
import android.text.method.DigitsKeyListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import io.card.payment.b.a;
import io.card.payment.b.b;
import io.card.payment.b.c;

// Referenced classes of package io.card.payment:
//			CreditCard, j, u, CardIOActivity, 
//			m, a, CardType, k, 
//			e, h, i

public final class DataEntryActivity extends Activity
	implements TextWatcher
{

	public DataEntryActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Activity()>
		a = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #47  <Field int a>
		b = 100;
	//    5    9:aload_0         
	//    6   10:bipush          100
	//    7   12:putfield        #49  <Field int b>
	//    8   15:return          
	}

	private void a()
	{
		if(q == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field CreditCard q>
	//*   2    4:ifnonnull       18
			q = new CreditCard();
	//    3    7:aload_0         
	//    4    8:new             #53  <Class CreditCard>
	//    5   11:dup             
	//    6   12:invokespecial   #54  <Method void CreditCard()>
	//    7   15:putfield        #51  <Field CreditCard q>
		if(f != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #56  <Field EditText f>
	//*  10   22:ifnull          59
		{
			q.expiryMonth = ((j)g).a;
	//   11   25:aload_0         
	//   12   26:getfield        #51  <Field CreditCard q>
	//   13   29:aload_0         
	//   14   30:getfield        #58  <Field u g>
	//   15   33:checkcast       #60  <Class j>
	//   16   36:getfield        #61  <Field int io.card.payment.j.a>
	//   17   39:putfield        #64  <Field int CreditCard.expiryMonth>
			q.expiryYear = ((j)g).b;
	//   18   42:aload_0         
	//   19   43:getfield        #51  <Field CreditCard q>
	//   20   46:aload_0         
	//   21   47:getfield        #58  <Field u g>
	//   22   50:checkcast       #60  <Class j>
	//   23   53:getfield        #65  <Field int io.card.payment.j.b>
	//   24   56:putfield        #68  <Field int CreditCard.expiryYear>
		}
		CreditCard creditcard = new CreditCard(e.b(), q.expiryMonth, q.expiryYear, i.b(), k.b(), m.b());
	//   25   59:new             #53  <Class CreditCard>
	//   26   62:dup             
	//   27   63:aload_0         
	//   28   64:getfield        #70  <Field u e>
	//   29   67:invokeinterface #75  <Method String io.card.payment.u.b()>
	//   30   72:aload_0         
	//   31   73:getfield        #51  <Field CreditCard q>
	//   32   76:getfield        #64  <Field int CreditCard.expiryMonth>
	//   33   79:aload_0         
	//   34   80:getfield        #51  <Field CreditCard q>
	//   35   83:getfield        #68  <Field int CreditCard.expiryYear>
	//   36   86:aload_0         
	//   37   87:getfield        #77  <Field u i>
	//   38   90:invokeinterface #75  <Method String io.card.payment.u.b()>
	//   39   95:aload_0         
	//   40   96:getfield        #79  <Field u k>
	//   41   99:invokeinterface #75  <Method String io.card.payment.u.b()>
	//   42  104:aload_0         
	//   43  105:getfield        #81  <Field u m>
	//   44  108:invokeinterface #75  <Method String io.card.payment.u.b()>
	//   45  113:invokespecial   #84  <Method void CreditCard(String, int, int, String, String, String)>
	//   46  116:astore_1        
		Intent intent = new Intent();
	//   47  117:new             #86  <Class Intent>
	//   48  120:dup             
	//   49  121:invokespecial   #87  <Method void Intent()>
	//   50  124:astore_2        
		intent.putExtra("io.card.payment.scanResult", ((android.os.Parcelable) (creditcard)));
	//   51  125:aload_2         
	//   52  126:ldc1            #89  <String "io.card.payment.scanResult">
	//   53  128:aload_1         
	//   54  129:invokevirtual   #93  <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   55  132:pop             
		if(getIntent().hasExtra("io.card.payment.capturedCardImage"))
	//*  56  133:aload_0         
	//*  57  134:invokevirtual   #97  <Method Intent getIntent()>
	//*  58  137:ldc1            #99  <String "io.card.payment.capturedCardImage">
	//*  59  139:invokevirtual   #103 <Method boolean Intent.hasExtra(String)>
	//*  60  142:ifeq            161
			intent.putExtra("io.card.payment.capturedCardImage", getIntent().getByteArrayExtra("io.card.payment.capturedCardImage"));
	//   61  145:aload_2         
	//   62  146:ldc1            #99  <String "io.card.payment.capturedCardImage">
	//   63  148:aload_0         
	//   64  149:invokevirtual   #97  <Method Intent getIntent()>
	//   65  152:ldc1            #99  <String "io.card.payment.capturedCardImage">
	//   66  154:invokevirtual   #107 <Method byte[] Intent.getByteArrayExtra(String)>
	//   67  157:invokevirtual   #110 <Method Intent Intent.putExtra(String, byte[])>
	//   68  160:pop             
		setResult(CardIOActivity.RESULT_CARD_INFO, intent);
	//   69  161:aload_0         
	//   70  162:getstatic       #115 <Field int CardIOActivity.RESULT_CARD_INFO>
	//   71  165:aload_2         
	//   72  166:invokevirtual   #119 <Method void setResult(int, Intent)>
		finish();
	//   73  169:aload_0         
	//   74  170:invokevirtual   #122 <Method void finish()>
	//   75  173:return          
	}

	private void a(ViewGroup viewgroup)
	{
		if(getIntent().getBooleanExtra("io.card.payment.requireCardholderName", false))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #97  <Method Intent getIntent()>
	//*   2    4:ldc1            #125 <String "io.card.payment.requireCardholderName">
	//*   3    6:iconst_0        
	//*   4    7:invokevirtual   #129 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*   5   10:ifeq            237
		{
			LinearLayout linearlayout = new LinearLayout(((android.content.Context) (this)));
	//    6   13:new             #131 <Class LinearLayout>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #134 <Method void LinearLayout(android.content.Context)>
	//   10   21:astore_3        
			io.card.payment.b.c.a(((android.view.View) (linearlayout)), ((String) (null)), "4dip", ((String) (null)), ((String) (null)));
	//   11   22:aload_3         
	//   12   23:aconst_null     
	//   13   24:ldc1            #136 <String "4dip">
	//   14   26:aconst_null     
	//   15   27:aconst_null     
	//   16   28:invokestatic    #141 <Method void c.a(android.view.View, String, String, String, String)>
			linearlayout.setOrientation(1);
	//   17   31:aload_3         
	//   18   32:iconst_1        
	//   19   33:invokevirtual   #145 <Method void LinearLayout.setOrientation(int)>
			Object obj = ((Object) (new TextView(((android.content.Context) (this)))));
	//   20   36:new             #147 <Class TextView>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:invokespecial   #148 <Method void TextView(android.content.Context)>
	//   24   44:astore          4
			if(!t)
	//*  25   46:aload_0         
	//*  26   47:getfield        #150 <Field boolean t>
	//*  27   50:ifne            61
				((TextView) (obj)).setTextColor(b.t);
	//   28   53:aload           4
	//   29   55:getstatic       #154 <Field int b.t>
	//   30   58:invokevirtual   #157 <Method void TextView.setTextColor(int)>
			io.card.payment.b.c.a(((android.view.View) (obj)), s, ((String) (null)), ((String) (null)), ((String) (null)));
	//   31   61:aload           4
	//   32   63:aload_0         
	//   33   64:getfield        #159 <Field String s>
	//   34   67:aconst_null     
	//   35   68:aconst_null     
	//   36   69:aconst_null     
	//   37   70:invokestatic    #141 <Method void c.a(android.view.View, String, String, String, String)>
			((TextView) (obj)).setText(((CharSequence) (io.card.payment.a.b.a(io.card.payment.a.c.k))));
	//   38   73:aload           4
	//   39   75:getstatic       #164 <Field io.card.payment.a.c io.card.payment.a.c.k>
	//   40   78:invokestatic    #169 <Method String io.card.payment.a.b.a(io.card.payment.a.c)>
	//   41   81:invokevirtual   #173 <Method void TextView.setText(CharSequence)>
			linearlayout.addView(((android.view.View) (obj)), -2, -2);
	//   42   84:aload_3         
	//   43   85:aload           4
	//   44   87:bipush          -2
	//   45   89:bipush          -2
	//   46   91:invokevirtual   #177 <Method void LinearLayout.addView(android.view.View, int, int)>
			l = new EditText(((android.content.Context) (this)));
	//   47   94:aload_0         
	//   48   95:new             #179 <Class EditText>
	//   49   98:dup             
	//   50   99:aload_0         
	//   51  100:invokespecial   #180 <Method void EditText(android.content.Context)>
	//   52  103:putfield        #182 <Field EditText l>
			obj = ((Object) (l));
	//   53  106:aload_0         
	//   54  107:getfield        #182 <Field EditText l>
	//   55  110:astore          4
			int i1 = b;
	//   56  112:aload_0         
	//   57  113:getfield        #49  <Field int b>
	//   58  116:istore_2        
			b = i1 + 1;
	//   59  117:aload_0         
	//   60  118:iload_2         
	//   61  119:iconst_1        
	//   62  120:iadd            
	//   63  121:putfield        #49  <Field int b>
			((EditText) (obj)).setId(i1);
	//   64  124:aload           4
	//   65  126:iload_2         
	//   66  127:invokevirtual   #185 <Method void EditText.setId(int)>
			l.setMaxLines(1);
	//   67  130:aload_0         
	//   68  131:getfield        #182 <Field EditText l>
	//   69  134:iconst_1        
	//   70  135:invokevirtual   #188 <Method void EditText.setMaxLines(int)>
			l.setImeOptions(6);
	//   71  138:aload_0         
	//   72  139:getfield        #182 <Field EditText l>
	//   73  142:bipush          6
	//   74  144:invokevirtual   #191 <Method void EditText.setImeOptions(int)>
			l.setTextAppearance(getApplicationContext(), 0x1010040);
	//   75  147:aload_0         
	//   76  148:getfield        #182 <Field EditText l>
	//   77  151:aload_0         
	//   78  152:invokevirtual   #195 <Method android.content.Context getApplicationContext()>
	//   79  155:ldc1            #196 <Int 0x1010040>
	//   80  157:invokevirtual   #200 <Method void EditText.setTextAppearance(android.content.Context, int)>
			l.setInputType(1);
	//   81  160:aload_0         
	//   82  161:getfield        #182 <Field EditText l>
	//   83  164:iconst_1        
	//   84  165:invokevirtual   #203 <Method void EditText.setInputType(int)>
			if(!t)
	//*  85  168:aload_0         
	//*  86  169:getfield        #150 <Field boolean t>
	//*  87  172:ifne            184
				l.setHintTextColor(0xffcccccc);
	//   88  175:aload_0         
	//   89  176:getfield        #182 <Field EditText l>
	//   90  179:ldc1            #204 <Int 0xffcccccc>
	//   91  181:invokevirtual   #207 <Method void EditText.setHintTextColor(int)>
			m = ((u) (new m(175)));
	//   92  184:aload_0         
	//   93  185:new             #209 <Class m>
	//   94  188:dup             
	//   95  189:sipush          175
	//   96  192:invokespecial   #211 <Method void m(int)>
	//   97  195:putfield        #81  <Field u m>
			l.addTextChangedListener(((TextWatcher) (m)));
	//   98  198:aload_0         
	//   99  199:getfield        #182 <Field EditText l>
	//  100  202:aload_0         
	//  101  203:getfield        #81  <Field u m>
	//  102  206:invokevirtual   #215 <Method void EditText.addTextChangedListener(TextWatcher)>
			l.addTextChangedListener(((TextWatcher) (this)));
	//  103  209:aload_0         
	//  104  210:getfield        #182 <Field EditText l>
	//  105  213:aload_0         
	//  106  214:invokevirtual   #215 <Method void EditText.addTextChangedListener(TextWatcher)>
			linearlayout.addView(((android.view.View) (l)), -1, -2);
	//  107  217:aload_3         
	//  108  218:aload_0         
	//  109  219:getfield        #182 <Field EditText l>
	//  110  222:iconst_m1       
	//  111  223:bipush          -2
	//  112  225:invokevirtual   #177 <Method void LinearLayout.addView(android.view.View, int, int)>
			viewgroup.addView(((android.view.View) (linearlayout)), -1, -2);
	//  113  228:aload_1         
	//  114  229:aload_3         
	//  115  230:iconst_m1       
	//  116  231:bipush          -2
	//  117  233:invokevirtual   #218 <Method void ViewGroup.addView(android.view.View, int, int)>
			return;
	//  118  236:return          
		} else
		{
			m = ((u) (new io.card.payment.a()));
	//  119  237:aload_0         
	//  120  238:new             #220 <Class io.card.payment.a>
	//  121  241:dup             
	//  122  242:invokespecial   #221 <Method void io.card.payment.a()>
	//  123  245:putfield        #81  <Field u m>
			return;
	//  124  248:return          
		}
	}

	private void a(EditText edittext)
	{
		if(t)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field boolean t>
	//*   2    4:ifeq            16
		{
			edittext.setTextColor(u);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #224 <Field int u>
	//    6   12:invokevirtual   #225 <Method void EditText.setTextColor(int)>
			return;
	//    7   15:return          
		} else
		{
			edittext.setTextColor(0xff444444);
	//    8   16:aload_1         
	//    9   17:ldc1            #226 <Int 0xff444444>
	//   10   19:invokevirtual   #225 <Method void EditText.setTextColor(int)>
			return;
	//   11   22:return          
		}
	}

	static void a(DataEntryActivity dataentryactivity)
	{
		dataentryactivity.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #229 <Method void a()>
	//    2    4:return          
	}

	private EditText b()
	{
		int i1 = 100;
	//    0    0:bipush          100
	//    1    2:istore_1        
		do
		{
			EditText edittext = (EditText)findViewById(i1);
	//    2    3:aload_0         
	//    3    4:iload_1         
	//    4    5:invokevirtual   #234 <Method android.view.View findViewById(int)>
	//    5    8:checkcast       #179 <Class EditText>
	//    6   11:astore_2        
			if(edittext != null)
	//*   7   12:aload_2         
	//*   8   13:ifnull          44
			{
				if(edittext.getText().length() == 0 && edittext.requestFocus())
	//*   9   16:aload_2         
	//*  10   17:invokevirtual   #238 <Method Editable EditText.getText()>
	//*  11   20:invokeinterface #244 <Method int Editable.length()>
	//*  12   25:ifne            37
	//*  13   28:aload_2         
	//*  14   29:invokevirtual   #248 <Method boolean EditText.requestFocus()>
	//*  15   32:ifeq            37
					return edittext;
	//   16   35:aload_2         
	//   17   36:areturn         
				i1++;
	//   18   37:iload_1         
	//   19   38:iconst_1        
	//   20   39:iadd            
	//   21   40:istore_1        
			} else
	//*  22   41:goto            3
			{
				return null;
	//   23   44:aconst_null     
	//   24   45:areturn         
			}
		} while(true);
	}

	private void c()
	{
		Button button = o;
	//    0    0:aload_0         
	//    1    1:getfield        #250 <Field Button o>
	//    2    4:astore_2        
		boolean flag;
		if(e.a() && g.a() && i.a() && k.a() && m.a())
	//*   3    5:aload_0         
	//*   4    6:getfield        #70  <Field u e>
	//*   5    9:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*   6   14:ifeq            70
	//*   7   17:aload_0         
	//*   8   18:getfield        #58  <Field u g>
	//*   9   21:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  10   26:ifeq            70
	//*  11   29:aload_0         
	//*  12   30:getfield        #77  <Field u i>
	//*  13   33:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  14   38:ifeq            70
	//*  15   41:aload_0         
	//*  16   42:getfield        #79  <Field u k>
	//*  17   45:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  18   50:ifeq            70
	//*  19   53:aload_0         
	//*  20   54:getfield        #81  <Field u m>
	//*  21   57:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  22   62:ifeq            70
			flag = true;
	//   23   65:iconst_1        
	//   24   66:istore_1        
		else
	//*  25   67:goto            72
			flag = false;
	//   26   70:iconst_0        
	//   27   71:istore_1        
		button.setEnabled(flag);
	//   28   72:aload_2         
	//   29   73:iload_1         
	//   30   74:invokevirtual   #258 <Method void Button.setEnabled(boolean)>
		if(r && e.a() && g.a() && i.a() && k.a() && m.a())
	//*  31   77:aload_0         
	//*  32   78:getfield        #260 <Field boolean r>
	//*  33   81:ifeq            148
	//*  34   84:aload_0         
	//*  35   85:getfield        #70  <Field u e>
	//*  36   88:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  37   93:ifeq            148
	//*  38   96:aload_0         
	//*  39   97:getfield        #58  <Field u g>
	//*  40  100:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  41  105:ifeq            148
	//*  42  108:aload_0         
	//*  43  109:getfield        #77  <Field u i>
	//*  44  112:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  45  117:ifeq            148
	//*  46  120:aload_0         
	//*  47  121:getfield        #79  <Field u k>
	//*  48  124:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  49  129:ifeq            148
	//*  50  132:aload_0         
	//*  51  133:getfield        #81  <Field u m>
	//*  52  136:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  53  141:ifeq            148
			a();
	//   54  144:aload_0         
	//   55  145:invokespecial   #229 <Method void a()>
	//   56  148:return          
	}

	public void afterTextChanged(Editable editable)
	{
		EditText edittext = d;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field EditText d>
	//    2    4:astore_3        
		if(edittext != null && editable == edittext.getText())
	//*   3    5:aload_3         
	//*   4    6:ifnull          148
	//*   5    9:aload_1         
	//*   6   10:aload_3         
	//*   7   11:invokevirtual   #238 <Method Editable EditText.getText()>
	//*   8   14:if_acmpne       148
		{
			if(e.c())
	//*   9   17:aload_0         
	//*  10   18:getfield        #70  <Field u e>
	//*  11   21:invokeinterface #266 <Method boolean io.card.payment.u.c()>
	//*  12   26:ifeq            70
			{
				if(!e.a())
	//*  13   29:aload_0         
	//*  14   30:getfield        #70  <Field u e>
	//*  15   33:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  16   38:ifne            54
				{
					d.setTextColor(b.s);
	//   17   41:aload_0         
	//   18   42:getfield        #264 <Field EditText d>
	//   19   45:getstatic       #268 <Field int b.s>
	//   20   48:invokevirtual   #225 <Method void EditText.setTextColor(int)>
				} else
	//*  21   51:goto            78
				{
					a(d);
	//   22   54:aload_0         
	//   23   55:aload_0         
	//   24   56:getfield        #264 <Field EditText d>
	//   25   59:invokespecial   #270 <Method void a(EditText)>
					b();
	//   26   62:aload_0         
	//   27   63:invokespecial   #272 <Method EditText b()>
	//   28   66:pop             
				}
			} else
	//*  29   67:goto            78
			{
				a(d);
	//   30   70:aload_0         
	//   31   71:aload_0         
	//   32   72:getfield        #264 <Field EditText d>
	//   33   75:invokespecial   #270 <Method void a(EditText)>
			}
			if(h != null)
	//*  34   78:aload_0         
	//*  35   79:getfield        #274 <Field EditText h>
	//*  36   82:ifnull          459
			{
				editable = ((Editable) (CardType.fromCardNumber(e.b().toString())));
	//   37   85:aload_0         
	//   38   86:getfield        #70  <Field u e>
	//   39   89:invokeinterface #75  <Method String io.card.payment.u.b()>
	//   40   94:invokevirtual   #279 <Method String String.toString()>
	//   41   97:invokestatic    #285 <Method CardType CardType.fromCardNumber(String)>
	//   42  100:astore_1        
				Object obj = ((Object) ((k)i));
	//   43  101:aload_0         
	//   44  102:getfield        #77  <Field u i>
	//   45  105:checkcast       #287 <Class k>
	//   46  108:astore_3        
				int i1 = ((CardType) (editable)).cvvLength();
	//   47  109:aload_1         
	//   48  110:invokevirtual   #290 <Method int CardType.cvvLength()>
	//   49  113:istore_2        
				obj.a = i1;
	//   50  114:aload_3         
	//   51  115:iload_2         
	//   52  116:putfield        #291 <Field int io.card.payment.k.a>
				obj = ((Object) (h));
	//   53  119:aload_0         
	//   54  120:getfield        #274 <Field EditText h>
	//   55  123:astore_3        
				if(i1 == 4)
	//*  56  124:iload_2         
	//*  57  125:iconst_4        
	//*  58  126:icmpne          136
					editable = "1234";
	//   59  129:ldc2            #293 <String "1234">
	//   60  132:astore_1        
				else
	//*  61  133:goto            140
					editable = "123";
	//   62  136:ldc2            #295 <String "123">
	//   63  139:astore_1        
				((EditText) (obj)).setHint(((CharSequence) (editable)));
	//   64  140:aload_3         
	//   65  141:aload_1         
	//   66  142:invokevirtual   #298 <Method void EditText.setHint(CharSequence)>
			}
		} else
	//*  67  145:goto            459
		{
			EditText edittext1 = f;
	//   68  148:aload_0         
	//   69  149:getfield        #56  <Field EditText f>
	//   70  152:astore_3        
			if(edittext1 != null && editable == edittext1.getText())
	//*  71  153:aload_3         
	//*  72  154:ifnull          229
	//*  73  157:aload_1         
	//*  74  158:aload_3         
	//*  75  159:invokevirtual   #238 <Method Editable EditText.getText()>
	//*  76  162:if_acmpne       229
			{
				if(g.c())
	//*  77  165:aload_0         
	//*  78  166:getfield        #58  <Field u g>
	//*  79  169:invokeinterface #266 <Method boolean io.card.payment.u.c()>
	//*  80  174:ifeq            218
				{
					if(!g.a())
	//*  81  177:aload_0         
	//*  82  178:getfield        #58  <Field u g>
	//*  83  181:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  84  186:ifne            202
					{
						f.setTextColor(b.s);
	//   85  189:aload_0         
	//   86  190:getfield        #56  <Field EditText f>
	//   87  193:getstatic       #268 <Field int b.s>
	//   88  196:invokevirtual   #225 <Method void EditText.setTextColor(int)>
					} else
	//*  89  199:goto            459
					{
						a(f);
	//   90  202:aload_0         
	//   91  203:aload_0         
	//   92  204:getfield        #56  <Field EditText f>
	//   93  207:invokespecial   #270 <Method void a(EditText)>
						b();
	//   94  210:aload_0         
	//   95  211:invokespecial   #272 <Method EditText b()>
	//   96  214:pop             
					}
				} else
	//*  97  215:goto            459
				{
					a(f);
	//   98  218:aload_0         
	//   99  219:aload_0         
	//  100  220:getfield        #56  <Field EditText f>
	//  101  223:invokespecial   #270 <Method void a(EditText)>
				}
			} else
	//* 102  226:goto            459
			{
				EditText edittext2 = h;
	//  103  229:aload_0         
	//  104  230:getfield        #274 <Field EditText h>
	//  105  233:astore_3        
				if(edittext2 != null && editable == edittext2.getText())
	//* 106  234:aload_3         
	//* 107  235:ifnull          310
	//* 108  238:aload_1         
	//* 109  239:aload_3         
	//* 110  240:invokevirtual   #238 <Method Editable EditText.getText()>
	//* 111  243:if_acmpne       310
				{
					if(i.c())
	//* 112  246:aload_0         
	//* 113  247:getfield        #77  <Field u i>
	//* 114  250:invokeinterface #266 <Method boolean io.card.payment.u.c()>
	//* 115  255:ifeq            299
					{
						if(!i.a())
	//* 116  258:aload_0         
	//* 117  259:getfield        #77  <Field u i>
	//* 118  262:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//* 119  267:ifne            283
						{
							h.setTextColor(b.s);
	//  120  270:aload_0         
	//  121  271:getfield        #274 <Field EditText h>
	//  122  274:getstatic       #268 <Field int b.s>
	//  123  277:invokevirtual   #225 <Method void EditText.setTextColor(int)>
						} else
	//* 124  280:goto            459
						{
							a(h);
	//  125  283:aload_0         
	//  126  284:aload_0         
	//  127  285:getfield        #274 <Field EditText h>
	//  128  288:invokespecial   #270 <Method void a(EditText)>
							b();
	//  129  291:aload_0         
	//  130  292:invokespecial   #272 <Method EditText b()>
	//  131  295:pop             
						}
					} else
	//* 132  296:goto            459
					{
						a(h);
	//  133  299:aload_0         
	//  134  300:aload_0         
	//  135  301:getfield        #274 <Field EditText h>
	//  136  304:invokespecial   #270 <Method void a(EditText)>
					}
				} else
	//* 137  307:goto            459
				{
					EditText edittext3 = j;
	//  138  310:aload_0         
	//  139  311:getfield        #300 <Field EditText j>
	//  140  314:astore_3        
					if(edittext3 != null && editable == edittext3.getText())
	//* 141  315:aload_3         
	//* 142  316:ifnull          386
	//* 143  319:aload_1         
	//* 144  320:aload_3         
	//* 145  321:invokevirtual   #238 <Method Editable EditText.getText()>
	//* 146  324:if_acmpne       386
					{
						if(k.c())
	//* 147  327:aload_0         
	//* 148  328:getfield        #79  <Field u k>
	//* 149  331:invokeinterface #266 <Method boolean io.card.payment.u.c()>
	//* 150  336:ifeq            375
						{
							if(!k.a())
	//* 151  339:aload_0         
	//* 152  340:getfield        #79  <Field u k>
	//* 153  343:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//* 154  348:ifne            364
								j.setTextColor(b.s);
	//  155  351:aload_0         
	//  156  352:getfield        #300 <Field EditText j>
	//  157  355:getstatic       #268 <Field int b.s>
	//  158  358:invokevirtual   #225 <Method void EditText.setTextColor(int)>
							else
	//* 159  361:goto            459
								a(j);
	//  160  364:aload_0         
	//  161  365:aload_0         
	//  162  366:getfield        #300 <Field EditText j>
	//  163  369:invokespecial   #270 <Method void a(EditText)>
						} else
	//* 164  372:goto            459
						{
							a(j);
	//  165  375:aload_0         
	//  166  376:aload_0         
	//  167  377:getfield        #300 <Field EditText j>
	//  168  380:invokespecial   #270 <Method void a(EditText)>
						}
					} else
	//* 169  383:goto            459
					{
						EditText edittext4 = l;
	//  170  386:aload_0         
	//  171  387:getfield        #182 <Field EditText l>
	//  172  390:astore_3        
						if(edittext4 != null && editable == edittext4.getText())
	//* 173  391:aload_3         
	//* 174  392:ifnull          459
	//* 175  395:aload_1         
	//* 176  396:aload_3         
	//* 177  397:invokevirtual   #238 <Method Editable EditText.getText()>
	//* 178  400:if_acmpne       459
							if(m.c())
	//* 179  403:aload_0         
	//* 180  404:getfield        #81  <Field u m>
	//* 181  407:invokeinterface #266 <Method boolean io.card.payment.u.c()>
	//* 182  412:ifeq            451
							{
								if(!m.a())
	//* 183  415:aload_0         
	//* 184  416:getfield        #81  <Field u m>
	//* 185  419:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//* 186  424:ifne            440
									l.setTextColor(b.s);
	//  187  427:aload_0         
	//  188  428:getfield        #182 <Field EditText l>
	//  189  431:getstatic       #268 <Field int b.s>
	//  190  434:invokevirtual   #225 <Method void EditText.setTextColor(int)>
								else
	//* 191  437:goto            459
									a(l);
	//  192  440:aload_0         
	//  193  441:aload_0         
	//  194  442:getfield        #182 <Field EditText l>
	//  195  445:invokespecial   #270 <Method void a(EditText)>
							} else
	//* 196  448:goto            459
							{
								a(l);
	//  197  451:aload_0         
	//  198  452:aload_0         
	//  199  453:getfield        #182 <Field EditText l>
	//  200  456:invokespecial   #270 <Method void a(EditText)>
							}
					}
				}
			}
		}
		c();
	//  201  459:aload_0         
	//  202  460:invokespecial   #302 <Method void c()>
	//  203  463:return          
	}

	public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
	{
	//    0    0:return          
	}

	public void onBackPressed()
	{
		setResult(CardIOActivity.RESULT_ENTRY_CANCELED);
	//    0    0:aload_0         
	//    1    1:getstatic       #308 <Field int CardIOActivity.RESULT_ENTRY_CANCELED>
	//    2    4:invokevirtual   #310 <Method void setResult(int)>
		finish();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #122 <Method void finish()>
	//    5   11:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #314 <Method void Activity.onCreate(Bundle)>
		if(getIntent().getExtras() == null)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #97  <Method Intent getIntent()>
	//*   5    9:invokevirtual   #318 <Method Bundle Intent.getExtras()>
	//*   6   12:ifnonnull       20
		{
			onBackPressed();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #320 <Method void onBackPressed()>
			return;
	//    9   19:return          
		}
		t = getIntent().getBooleanExtra("io.card.payment.keepApplicationTheme", false);
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #97  <Method Intent getIntent()>
	//   13   25:ldc2            #322 <String "io.card.payment.keepApplicationTheme">
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #129 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//   16   32:putfield        #150 <Field boolean t>
		io.card.payment.b.a.a(((Activity) (this)), t);
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #150 <Field boolean t>
	//   20   40:invokestatic    #327 <Method void a.a(Activity, boolean)>
		u = (new TextView(((android.content.Context) (this)))).getTextColors().getDefaultColor();
	//   21   43:aload_0         
	//   22   44:new             #147 <Class TextView>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:invokespecial   #148 <Method void TextView(android.content.Context)>
	//   26   52:invokevirtual   #331 <Method ColorStateList TextView.getTextColors()>
	//   27   55:invokevirtual   #336 <Method int ColorStateList.getDefaultColor()>
	//   28   58:putfield        #224 <Field int u>
		if(io.card.payment.b.a.a())
	//*  29   61:invokestatic    #337 <Method boolean a.a()>
	//*  30   64:ifeq            74
			bundle = "12dip";
	//   31   67:ldc2            #339 <String "12dip">
	//   32   70:astore_1        
		else
	//*  33   71:goto            78
			bundle = "2dip";
	//   34   74:ldc2            #341 <String "2dip">
	//   35   77:astore_1        
		s = ((String) (bundle));
	//   36   78:aload_0         
	//   37   79:aload_1         
	//   38   80:putfield        #159 <Field String s>
		io.card.payment.a.b.a(getIntent());
	//   39   83:aload_0         
	//   40   84:invokevirtual   #97  <Method Intent getIntent()>
	//   41   87:invokestatic    #344 <Method void io.card.payment.a.b.a(Intent)>
		int j1 = io.card.payment.b.c.a("4dip", ((android.content.Context) (this)));
	//   42   90:ldc1            #136 <String "4dip">
	//   43   92:aload_0         
	//   44   93:invokestatic    #347 <Method int c.a(String, android.content.Context)>
	//   45   96:istore_3        
		Object obj = ((Object) (new RelativeLayout(((android.content.Context) (this)))));
	//   46   97:new             #349 <Class RelativeLayout>
	//   47  100:dup             
	//   48  101:aload_0         
	//   49  102:invokespecial   #350 <Method void RelativeLayout(android.content.Context)>
	//   50  105:astore          7
		if(!t)
	//*  51  107:aload_0         
	//*  52  108:getfield        #150 <Field boolean t>
	//*  53  111:ifne            122
			((RelativeLayout) (obj)).setBackgroundColor(b.i);
	//   54  114:aload           7
	//   55  116:getstatic       #352 <Field int b.i>
	//   56  119:invokevirtual   #355 <Method void RelativeLayout.setBackgroundColor(int)>
		bundle = ((Bundle) (new ScrollView(((android.content.Context) (this)))));
	//   57  122:new             #357 <Class ScrollView>
	//   58  125:dup             
	//   59  126:aload_0         
	//   60  127:invokespecial   #358 <Method void ScrollView(android.content.Context)>
	//   61  130:astore_1        
		int i1 = a;
	//   62  131:aload_0         
	//   63  132:getfield        #47  <Field int a>
	//   64  135:istore_2        
		a = i1 + 1;
	//   65  136:aload_0         
	//   66  137:iload_2         
	//   67  138:iconst_1        
	//   68  139:iadd            
	//   69  140:putfield        #47  <Field int a>
		((ScrollView) (bundle)).setId(i1);
	//   70  143:aload_1         
	//   71  144:iload_2         
	//   72  145:invokevirtual   #359 <Method void ScrollView.setId(int)>
		Object obj3 = ((Object) (new android.widget.RelativeLayout.LayoutParams(-1, -2)));
	//   73  148:new             #361 <Class android.widget.RelativeLayout$LayoutParams>
	//   74  151:dup             
	//   75  152:iconst_m1       
	//   76  153:bipush          -2
	//   77  155:invokespecial   #364 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   78  158:astore          9
		((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(10);
	//   79  160:aload           9
	//   80  162:bipush          10
	//   81  164:invokevirtual   #367 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		((RelativeLayout) (obj)).addView(((android.view.View) (bundle)), ((android.view.ViewGroup.LayoutParams) (obj3)));
	//   82  167:aload           7
	//   83  169:aload_1         
	//   84  170:aload           9
	//   85  172:invokevirtual   #370 <Method void RelativeLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		LinearLayout linearlayout2 = new LinearLayout(((android.content.Context) (this)));
	//   86  175:new             #131 <Class LinearLayout>
	//   87  178:dup             
	//   88  179:aload_0         
	//   89  180:invokespecial   #134 <Method void LinearLayout(android.content.Context)>
	//   90  183:astore          10
		linearlayout2.setOrientation(1);
	//   91  185:aload           10
	//   92  187:iconst_1        
	//   93  188:invokevirtual   #145 <Method void LinearLayout.setOrientation(int)>
		((ScrollView) (bundle)).addView(((android.view.View) (linearlayout2)), -1, -1);
	//   94  191:aload_1         
	//   95  192:aload           10
	//   96  194:iconst_m1       
	//   97  195:iconst_m1       
	//   98  196:invokevirtual   #371 <Method void ScrollView.addView(android.view.View, int, int)>
		LinearLayout linearlayout3 = new LinearLayout(((android.content.Context) (this)));
	//   99  199:new             #131 <Class LinearLayout>
	//  100  202:dup             
	//  101  203:aload_0         
	//  102  204:invokespecial   #134 <Method void LinearLayout(android.content.Context)>
	//  103  207:astore          11
		linearlayout3.setOrientation(1);
	//  104  209:aload           11
	//  105  211:iconst_1        
	//  106  212:invokevirtual   #145 <Method void LinearLayout.setOrientation(int)>
		android.widget.LinearLayout.LayoutParams layoutparams1 = new android.widget.LinearLayout.LayoutParams(-1, -1);
	//  107  215:new             #373 <Class android.widget.LinearLayout$LayoutParams>
	//  108  218:dup             
	//  109  219:iconst_m1       
	//  110  220:iconst_m1       
	//  111  221:invokespecial   #374 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//  112  224:astore          12
		q = (CreditCard)getIntent().getParcelableExtra("io.card.payment.scanResult");
	//  113  226:aload_0         
	//  114  227:aload_0         
	//  115  228:invokevirtual   #97  <Method Intent getIntent()>
	//  116  231:ldc1            #89  <String "io.card.payment.scanResult">
	//  117  233:invokevirtual   #378 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//  118  236:checkcast       #53  <Class CreditCard>
	//  119  239:putfield        #51  <Field CreditCard q>
		r = getIntent().getBooleanExtra("debug_autoAcceptResult", false);
	//  120  242:aload_0         
	//  121  243:aload_0         
	//  122  244:invokevirtual   #97  <Method Intent getIntent()>
	//  123  247:ldc2            #380 <String "debug_autoAcceptResult">
	//  124  250:iconst_0        
	//  125  251:invokevirtual   #129 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  126  254:putfield        #260 <Field boolean r>
		bundle = ((Bundle) (q));
	//  127  257:aload_0         
	//  128  258:getfield        #51  <Field CreditCard q>
	//  129  261:astore_1        
		if(bundle != null)
	//* 130  262:aload_1         
	//* 131  263:ifnull          356
		{
			e = ((u) (new e(((CreditCard) (bundle)).cardNumber)));
	//  132  266:aload_0         
	//  133  267:new             #382 <Class e>
	//  134  270:dup             
	//  135  271:aload_1         
	//  136  272:getfield        #385 <Field String CreditCard.cardNumber>
	//  137  275:invokespecial   #388 <Method void e(String)>
	//  138  278:putfield        #70  <Field u e>
			n = new ImageView(((android.content.Context) (this)));
	//  139  281:aload_0         
	//  140  282:new             #390 <Class ImageView>
	//  141  285:dup             
	//  142  286:aload_0         
	//  143  287:invokespecial   #391 <Method void ImageView(android.content.Context)>
	//  144  290:putfield        #393 <Field ImageView n>
			bundle = ((Bundle) (new android.widget.LinearLayout.LayoutParams(-1, -2)));
	//  145  293:new             #373 <Class android.widget.LinearLayout$LayoutParams>
	//  146  296:dup             
	//  147  297:iconst_m1       
	//  148  298:bipush          -2
	//  149  300:invokespecial   #374 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//  150  303:astore_1        
			n.setPadding(0, 0, 0, j1);
	//  151  304:aload_0         
	//  152  305:getfield        #393 <Field ImageView n>
	//  153  308:iconst_0        
	//  154  309:iconst_0        
	//  155  310:iconst_0        
	//  156  311:iload_3         
	//  157  312:invokevirtual   #397 <Method void ImageView.setPadding(int, int, int, int)>
			bundle.weight = 1.0F;
	//  158  315:aload_1         
	//  159  316:fconst_1        
	//  160  317:putfield        #401 <Field float android.widget.LinearLayout$LayoutParams.weight>
			n.setImageBitmap(io.card.payment.CardIOActivity.b);
	//  161  320:aload_0         
	//  162  321:getfield        #393 <Field ImageView n>
	//  163  324:getstatic       #404 <Field android.graphics.Bitmap io.card.payment.CardIOActivity.b>
	//  164  327:invokevirtual   #408 <Method void ImageView.setImageBitmap(android.graphics.Bitmap)>
			linearlayout3.addView(((android.view.View) (n)), ((android.view.ViewGroup.LayoutParams) (bundle)));
	//  165  330:aload           11
	//  166  332:aload_0         
	//  167  333:getfield        #393 <Field ImageView n>
	//  168  336:aload_1         
	//  169  337:invokevirtual   #409 <Method void LinearLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			io.card.payment.b.c.b(((android.view.View) (n)), ((String) (null)), ((String) (null)), ((String) (null)), "8dip");
	//  170  340:aload_0         
	//  171  341:getfield        #393 <Field ImageView n>
	//  172  344:aconst_null     
	//  173  345:aconst_null     
	//  174  346:aconst_null     
	//  175  347:ldc2            #411 <String "8dip">
	//  176  350:invokestatic    #413 <Method void c.b(android.view.View, String, String, String, String)>
		} else
	//* 177  353:goto            687
		{
			c = new TextView(((android.content.Context) (this)));
	//  178  356:aload_0         
	//  179  357:new             #147 <Class TextView>
	//  180  360:dup             
	//  181  361:aload_0         
	//  182  362:invokespecial   #148 <Method void TextView(android.content.Context)>
	//  183  365:putfield        #415 <Field TextView c>
			c.setTextSize(24F);
	//  184  368:aload_0         
	//  185  369:getfield        #415 <Field TextView c>
	//  186  372:ldc2            #416 <Float 24F>
	//  187  375:invokevirtual   #420 <Method void TextView.setTextSize(float)>
			if(!t)
	//* 188  378:aload_0         
	//* 189  379:getfield        #150 <Field boolean t>
	//* 190  382:ifne            395
				c.setTextColor(b.e);
	//  191  385:aload_0         
	//  192  386:getfield        #415 <Field TextView c>
	//  193  389:getstatic       #422 <Field int b.e>
	//  194  392:invokevirtual   #157 <Method void TextView.setTextColor(int)>
			linearlayout3.addView(((android.view.View) (c)));
	//  195  395:aload           11
	//  196  397:aload_0         
	//  197  398:getfield        #415 <Field TextView c>
	//  198  401:invokevirtual   #425 <Method void LinearLayout.addView(android.view.View)>
			io.card.payment.b.c.a(((android.view.View) (c)), ((String) (null)), ((String) (null)), ((String) (null)), "8dip");
	//  199  404:aload_0         
	//  200  405:getfield        #415 <Field TextView c>
	//  201  408:aconst_null     
	//  202  409:aconst_null     
	//  203  410:aconst_null     
	//  204  411:ldc2            #411 <String "8dip">
	//  205  414:invokestatic    #141 <Method void c.a(android.view.View, String, String, String, String)>
			io.card.payment.b.c.a(((android.view.View) (c)), -2, -2);
	//  206  417:aload_0         
	//  207  418:getfield        #415 <Field TextView c>
	//  208  421:bipush          -2
	//  209  423:bipush          -2
	//  210  425:invokestatic    #427 <Method void c.a(android.view.View, int, int)>
			bundle = ((Bundle) (new LinearLayout(((android.content.Context) (this)))));
	//  211  428:new             #131 <Class LinearLayout>
	//  212  431:dup             
	//  213  432:aload_0         
	//  214  433:invokespecial   #134 <Method void LinearLayout(android.content.Context)>
	//  215  436:astore_1        
			((LinearLayout) (bundle)).setOrientation(1);
	//  216  437:aload_1         
	//  217  438:iconst_1        
	//  218  439:invokevirtual   #145 <Method void LinearLayout.setOrientation(int)>
			io.card.payment.b.c.a(((android.view.View) (bundle)), ((String) (null)), "4dip", ((String) (null)), "4dip");
	//  219  442:aload_1         
	//  220  443:aconst_null     
	//  221  444:ldc1            #136 <String "4dip">
	//  222  446:aconst_null     
	//  223  447:ldc1            #136 <String "4dip">
	//  224  449:invokestatic    #141 <Method void c.a(android.view.View, String, String, String, String)>
			Object obj1 = ((Object) (new TextView(((android.content.Context) (this)))));
	//  225  452:new             #147 <Class TextView>
	//  226  455:dup             
	//  227  456:aload_0         
	//  228  457:invokespecial   #148 <Method void TextView(android.content.Context)>
	//  229  460:astore          8
			io.card.payment.b.c.a(((android.view.View) (obj1)), s, ((String) (null)), ((String) (null)), ((String) (null)));
	//  230  462:aload           8
	//  231  464:aload_0         
	//  232  465:getfield        #159 <Field String s>
	//  233  468:aconst_null     
	//  234  469:aconst_null     
	//  235  470:aconst_null     
	//  236  471:invokestatic    #141 <Method void c.a(android.view.View, String, String, String, String)>
			((TextView) (obj1)).setText(((CharSequence) (io.card.payment.a.b.a(io.card.payment.a.c.p))));
	//  237  474:aload           8
	//  238  476:getstatic       #429 <Field io.card.payment.a.c io.card.payment.a.c.p>
	//  239  479:invokestatic    #169 <Method String io.card.payment.a.b.a(io.card.payment.a.c)>
	//  240  482:invokevirtual   #173 <Method void TextView.setText(CharSequence)>
			if(!t)
	//* 241  485:aload_0         
	//* 242  486:getfield        #150 <Field boolean t>
	//* 243  489:ifne            500
				((TextView) (obj1)).setTextColor(b.t);
	//  244  492:aload           8
	//  245  494:getstatic       #154 <Field int b.t>
	//  246  497:invokevirtual   #157 <Method void TextView.setTextColor(int)>
			((LinearLayout) (bundle)).addView(((android.view.View) (obj1)), -2, -2);
	//  247  500:aload_1         
	//  248  501:aload           8
	//  249  503:bipush          -2
	//  250  505:bipush          -2
	//  251  507:invokevirtual   #177 <Method void LinearLayout.addView(android.view.View, int, int)>
			d = new EditText(((android.content.Context) (this)));
	//  252  510:aload_0         
	//  253  511:new             #179 <Class EditText>
	//  254  514:dup             
	//  255  515:aload_0         
	//  256  516:invokespecial   #180 <Method void EditText(android.content.Context)>
	//  257  519:putfield        #264 <Field EditText d>
			obj1 = ((Object) (d));
	//  258  522:aload_0         
	//  259  523:getfield        #264 <Field EditText d>
	//  260  526:astore          8
			i1 = b;
	//  261  528:aload_0         
	//  262  529:getfield        #49  <Field int b>
	//  263  532:istore_2        
			b = i1 + 1;
	//  264  533:aload_0         
	//  265  534:iload_2         
	//  266  535:iconst_1        
	//  267  536:iadd            
	//  268  537:putfield        #49  <Field int b>
			((EditText) (obj1)).setId(i1);
	//  269  540:aload           8
	//  270  542:iload_2         
	//  271  543:invokevirtual   #185 <Method void EditText.setId(int)>
			d.setMaxLines(1);
	//  272  546:aload_0         
	//  273  547:getfield        #264 <Field EditText d>
	//  274  550:iconst_1        
	//  275  551:invokevirtual   #188 <Method void EditText.setMaxLines(int)>
			d.setImeOptions(6);
	//  276  554:aload_0         
	//  277  555:getfield        #264 <Field EditText d>
	//  278  558:bipush          6
	//  279  560:invokevirtual   #191 <Method void EditText.setImeOptions(int)>
			d.setTextAppearance(getApplicationContext(), 0x1010040);
	//  280  563:aload_0         
	//  281  564:getfield        #264 <Field EditText d>
	//  282  567:aload_0         
	//  283  568:invokevirtual   #195 <Method android.content.Context getApplicationContext()>
	//  284  571:ldc1            #196 <Int 0x1010040>
	//  285  573:invokevirtual   #200 <Method void EditText.setTextAppearance(android.content.Context, int)>
			d.setInputType(3);
	//  286  576:aload_0         
	//  287  577:getfield        #264 <Field EditText d>
	//  288  580:iconst_3        
	//  289  581:invokevirtual   #203 <Method void EditText.setInputType(int)>
			d.setHint("1234 5678 1234 5678");
	//  290  584:aload_0         
	//  291  585:getfield        #264 <Field EditText d>
	//  292  588:ldc2            #431 <String "1234 5678 1234 5678">
	//  293  591:invokevirtual   #298 <Method void EditText.setHint(CharSequence)>
			if(!t)
	//* 294  594:aload_0         
	//* 295  595:getfield        #150 <Field boolean t>
	//* 296  598:ifne            610
				d.setHintTextColor(0xffcccccc);
	//  297  601:aload_0         
	//  298  602:getfield        #264 <Field EditText d>
	//  299  605:ldc1            #204 <Int 0xffcccccc>
	//  300  607:invokevirtual   #207 <Method void EditText.setHintTextColor(int)>
			e = ((u) (new e()));
	//  301  610:aload_0         
	//  302  611:new             #382 <Class e>
	//  303  614:dup             
	//  304  615:invokespecial   #432 <Method void e()>
	//  305  618:putfield        #70  <Field u e>
			d.addTextChangedListener(((TextWatcher) (e)));
	//  306  621:aload_0         
	//  307  622:getfield        #264 <Field EditText d>
	//  308  625:aload_0         
	//  309  626:getfield        #70  <Field u e>
	//  310  629:invokevirtual   #215 <Method void EditText.addTextChangedListener(TextWatcher)>
			d.addTextChangedListener(((TextWatcher) (this)));
	//  311  632:aload_0         
	//  312  633:getfield        #264 <Field EditText d>
	//  313  636:aload_0         
	//  314  637:invokevirtual   #215 <Method void EditText.addTextChangedListener(TextWatcher)>
			d.setFilters(new InputFilter[] {
				new DigitsKeyListener(), e
			});
	//  315  640:aload_0         
	//  316  641:getfield        #264 <Field EditText d>
	//  317  644:iconst_2        
	//  318  645:anewarray       InputFilter[]
	//  319  648:dup             
	//  320  649:iconst_0        
	//  321  650:new             #436 <Class DigitsKeyListener>
	//  322  653:dup             
	//  323  654:invokespecial   #437 <Method void DigitsKeyListener()>
	//  324  657:aastore         
	//  325  658:dup             
	//  326  659:iconst_1        
	//  327  660:aload_0         
	//  328  661:getfield        #70  <Field u e>
	//  329  664:aastore         
	//  330  665:invokevirtual   #441 <Method void EditText.setFilters(InputFilter[])>
			((LinearLayout) (bundle)).addView(((android.view.View) (d)), -1, -2);
	//  331  668:aload_1         
	//  332  669:aload_0         
	//  333  670:getfield        #264 <Field EditText d>
	//  334  673:iconst_m1       
	//  335  674:bipush          -2
	//  336  676:invokevirtual   #177 <Method void LinearLayout.addView(android.view.View, int, int)>
			linearlayout3.addView(((android.view.View) (bundle)), -1, -1);
	//  337  679:aload           11
	//  338  681:aload_1         
	//  339  682:iconst_m1       
	//  340  683:iconst_m1       
	//  341  684:invokevirtual   #177 <Method void LinearLayout.addView(android.view.View, int, int)>
		}
		LinearLayout linearlayout4 = new LinearLayout(((android.content.Context) (this)));
	//  342  687:new             #131 <Class LinearLayout>
	//  343  690:dup             
	//  344  691:aload_0         
	//  345  692:invokespecial   #134 <Method void LinearLayout(android.content.Context)>
	//  346  695:astore          13
		android.widget.LinearLayout.LayoutParams layoutparams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
	//  347  697:new             #373 <Class android.widget.LinearLayout$LayoutParams>
	//  348  700:dup             
	//  349  701:iconst_m1       
	//  350  702:bipush          -2
	//  351  704:invokespecial   #374 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//  352  707:astore          14
		io.card.payment.b.c.a(((android.view.View) (linearlayout4)), ((String) (null)), "4dip", ((String) (null)), "4dip");
	//  353  709:aload           13
	//  354  711:aconst_null     
	//  355  712:ldc1            #136 <String "4dip">
	//  356  714:aconst_null     
	//  357  715:ldc1            #136 <String "4dip">
	//  358  717:invokestatic    #141 <Method void c.a(android.view.View, String, String, String, String)>
		linearlayout4.setOrientation(0);
	//  359  720:aload           13
	//  360  722:iconst_0        
	//  361  723:invokevirtual   #145 <Method void LinearLayout.setOrientation(int)>
		boolean flag = getIntent().getBooleanExtra("io.card.payment.requireExpiry", false);
	//  362  726:aload_0         
	//  363  727:invokevirtual   #97  <Method Intent getIntent()>
	//  364  730:ldc2            #443 <String "io.card.payment.requireExpiry">
	//  365  733:iconst_0        
	//  366  734:invokevirtual   #129 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  367  737:istore          4
		boolean flag1 = getIntent().getBooleanExtra("io.card.payment.requireCVV", false);
	//  368  739:aload_0         
	//  369  740:invokevirtual   #97  <Method Intent getIntent()>
	//  370  743:ldc2            #445 <String "io.card.payment.requireCVV">
	//  371  746:iconst_0        
	//  372  747:invokevirtual   #129 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  373  750:istore          5
		boolean flag2 = getIntent().getBooleanExtra("io.card.payment.requirePostalCode", false);
	//  374  752:aload_0         
	//  375  753:invokevirtual   #97  <Method Intent getIntent()>
	//  376  756:ldc2            #447 <String "io.card.payment.requirePostalCode">
	//  377  759:iconst_0        
	//  378  760:invokevirtual   #129 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  379  763:istore          6
		if(flag)
	//* 380  765:iload           4
	//* 381  767:ifeq            1135
		{
			LinearLayout linearlayout = new LinearLayout(((android.content.Context) (this)));
	//  382  770:new             #131 <Class LinearLayout>
	//  383  773:dup             
	//  384  774:aload_0         
	//  385  775:invokespecial   #134 <Method void LinearLayout(android.content.Context)>
	//  386  778:astore          8
			bundle = ((Bundle) (new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F)));
	//  387  780:new             #373 <Class android.widget.LinearLayout$LayoutParams>
	//  388  783:dup             
	//  389  784:iconst_0        
	//  390  785:iconst_m1       
	//  391  786:fconst_1        
	//  392  787:invokespecial   #450 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//  393  790:astore_1        
			linearlayout.setOrientation(1);
	//  394  791:aload           8
	//  395  793:iconst_1        
	//  396  794:invokevirtual   #145 <Method void LinearLayout.setOrientation(int)>
			Object obj4 = ((Object) (new TextView(((android.content.Context) (this)))));
	//  397  797:new             #147 <Class TextView>
	//  398  800:dup             
	//  399  801:aload_0         
	//  400  802:invokespecial   #148 <Method void TextView(android.content.Context)>
	//  401  805:astore          15
			if(!t)
	//* 402  807:aload_0         
	//* 403  808:getfield        #150 <Field boolean t>
	//* 404  811:ifne            822
				((TextView) (obj4)).setTextColor(b.t);
	//  405  814:aload           15
	//  406  816:getstatic       #154 <Field int b.t>
	//  407  819:invokevirtual   #157 <Method void TextView.setTextColor(int)>
			((TextView) (obj4)).setText(((CharSequence) (io.card.payment.a.b.a(io.card.payment.a.c.l))));
	//  408  822:aload           15
	//  409  824:getstatic       #452 <Field io.card.payment.a.c io.card.payment.a.c.l>
	//  410  827:invokestatic    #169 <Method String io.card.payment.a.b.a(io.card.payment.a.c)>
	//  411  830:invokevirtual   #173 <Method void TextView.setText(CharSequence)>
			io.card.payment.b.c.a(((android.view.View) (obj4)), s, ((String) (null)), ((String) (null)), ((String) (null)));
	//  412  833:aload           15
	//  413  835:aload_0         
	//  414  836:getfield        #159 <Field String s>
	//  415  839:aconst_null     
	//  416  840:aconst_null     
	//  417  841:aconst_null     
	//  418  842:invokestatic    #141 <Method void c.a(android.view.View, String, String, String, String)>
			linearlayout.addView(((android.view.View) (obj4)), -2, -2);
	//  419  845:aload           8
	//  420  847:aload           15
	//  421  849:bipush          -2
	//  422  851:bipush          -2
	//  423  853:invokevirtual   #177 <Method void LinearLayout.addView(android.view.View, int, int)>
			f = new EditText(((android.content.Context) (this)));
	//  424  856:aload_0         
	//  425  857:new             #179 <Class EditText>
	//  426  860:dup             
	//  427  861:aload_0         
	//  428  862:invokespecial   #180 <Method void EditText(android.content.Context)>
	//  429  865:putfield        #56  <Field EditText f>
			obj4 = ((Object) (f));
	//  430  868:aload_0         
	//  431  869:getfield        #56  <Field EditText f>
	//  432  872:astore          15
			i1 = b;
	//  433  874:aload_0         
	//  434  875:getfield        #49  <Field int b>
	//  435  878:istore_2        
			b = i1 + 1;
	//  436  879:aload_0         
	//  437  880:iload_2         
	//  438  881:iconst_1        
	//  439  882:iadd            
	//  440  883:putfield        #49  <Field int b>
			((EditText) (obj4)).setId(i1);
	//  441  886:aload           15
	//  442  888:iload_2         
	//  443  889:invokevirtual   #185 <Method void EditText.setId(int)>
			f.setMaxLines(1);
	//  444  892:aload_0         
	//  445  893:getfield        #56  <Field EditText f>
	//  446  896:iconst_1        
	//  447  897:invokevirtual   #188 <Method void EditText.setMaxLines(int)>
			f.setImeOptions(6);
	//  448  900:aload_0         
	//  449  901:getfield        #56  <Field EditText f>
	//  450  904:bipush          6
	//  451  906:invokevirtual   #191 <Method void EditText.setImeOptions(int)>
			f.setTextAppearance(getApplicationContext(), 0x1010040);
	//  452  909:aload_0         
	//  453  910:getfield        #56  <Field EditText f>
	//  454  913:aload_0         
	//  455  914:invokevirtual   #195 <Method android.content.Context getApplicationContext()>
	//  456  917:ldc1            #196 <Int 0x1010040>
	//  457  919:invokevirtual   #200 <Method void EditText.setTextAppearance(android.content.Context, int)>
			f.setInputType(3);
	//  458  922:aload_0         
	//  459  923:getfield        #56  <Field EditText f>
	//  460  926:iconst_3        
	//  461  927:invokevirtual   #203 <Method void EditText.setInputType(int)>
			f.setHint(((CharSequence) (io.card.payment.a.b.a(io.card.payment.a.c.m))));
	//  462  930:aload_0         
	//  463  931:getfield        #56  <Field EditText f>
	//  464  934:getstatic       #454 <Field io.card.payment.a.c io.card.payment.a.c.m>
	//  465  937:invokestatic    #169 <Method String io.card.payment.a.b.a(io.card.payment.a.c)>
	//  466  940:invokevirtual   #298 <Method void EditText.setHint(CharSequence)>
			if(!t)
	//* 467  943:aload_0         
	//* 468  944:getfield        #150 <Field boolean t>
	//* 469  947:ifne            959
				f.setHintTextColor(0xffcccccc);
	//  470  950:aload_0         
	//  471  951:getfield        #56  <Field EditText f>
	//  472  954:ldc1            #204 <Int 0xffcccccc>
	//  473  956:invokevirtual   #207 <Method void EditText.setHintTextColor(int)>
			obj4 = ((Object) (q));
	//  474  959:aload_0         
	//  475  960:getfield        #51  <Field CreditCard q>
	//  476  963:astore          15
			if(obj4 != null)
	//* 477  965:aload           15
	//* 478  967:ifnull          996
				g = ((u) (new j(((CreditCard) (obj4)).expiryMonth, q.expiryYear)));
	//  479  970:aload_0         
	//  480  971:new             #60  <Class j>
	//  481  974:dup             
	//  482  975:aload           15
	//  483  977:getfield        #64  <Field int CreditCard.expiryMonth>
	//  484  980:aload_0         
	//  485  981:getfield        #51  <Field CreditCard q>
	//  486  984:getfield        #68  <Field int CreditCard.expiryYear>
	//  487  987:invokespecial   #455 <Method void j(int, int)>
	//  488  990:putfield        #58  <Field u g>
			else
	//* 489  993:goto            1007
				g = ((u) (new j()));
	//  490  996:aload_0         
	//  491  997:new             #60  <Class j>
	//  492 1000:dup             
	//  493 1001:invokespecial   #456 <Method void j()>
	//  494 1004:putfield        #58  <Field u g>
			if(g.c())
	//* 495 1007:aload_0         
	//* 496 1008:getfield        #58  <Field u g>
	//* 497 1011:invokeinterface #266 <Method boolean io.card.payment.u.c()>
	//* 498 1016:ifeq            1035
				f.setText(((CharSequence) (g.b())));
	//  499 1019:aload_0         
	//  500 1020:getfield        #56  <Field EditText f>
	//  501 1023:aload_0         
	//  502 1024:getfield        #58  <Field u g>
	//  503 1027:invokeinterface #75  <Method String io.card.payment.u.b()>
	//  504 1032:invokevirtual   #457 <Method void EditText.setText(CharSequence)>
			f.addTextChangedListener(((TextWatcher) (g)));
	//  505 1035:aload_0         
	//  506 1036:getfield        #56  <Field EditText f>
	//  507 1039:aload_0         
	//  508 1040:getfield        #58  <Field u g>
	//  509 1043:invokevirtual   #215 <Method void EditText.addTextChangedListener(TextWatcher)>
			f.addTextChangedListener(((TextWatcher) (this)));
	//  510 1046:aload_0         
	//  511 1047:getfield        #56  <Field EditText f>
	//  512 1050:aload_0         
	//  513 1051:invokevirtual   #215 <Method void EditText.addTextChangedListener(TextWatcher)>
			f.setFilters(new InputFilter[] {
				new DateKeyListener(), g
			});
	//  514 1054:aload_0         
	//  515 1055:getfield        #56  <Field EditText f>
	//  516 1058:iconst_2        
	//  517 1059:anewarray       InputFilter[]
	//  518 1062:dup             
	//  519 1063:iconst_0        
	//  520 1064:new             #459 <Class DateKeyListener>
	//  521 1067:dup             
	//  522 1068:invokespecial   #460 <Method void DateKeyListener()>
	//  523 1071:aastore         
	//  524 1072:dup             
	//  525 1073:iconst_1        
	//  526 1074:aload_0         
	//  527 1075:getfield        #58  <Field u g>
	//  528 1078:aastore         
	//  529 1079:invokevirtual   #441 <Method void EditText.setFilters(InputFilter[])>
			linearlayout.addView(((android.view.View) (f)), -1, -2);
	//  530 1082:aload           8
	//  531 1084:aload_0         
	//  532 1085:getfield        #56  <Field EditText f>
	//  533 1088:iconst_m1       
	//  534 1089:bipush          -2
	//  535 1091:invokevirtual   #177 <Method void LinearLayout.addView(android.view.View, int, int)>
			linearlayout4.addView(((android.view.View) (linearlayout)), ((android.view.ViewGroup.LayoutParams) (bundle)));
	//  536 1094:aload           13
	//  537 1096:aload           8
	//  538 1098:aload_1         
	//  539 1099:invokevirtual   #409 <Method void LinearLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			if(!flag1 && !flag2)
	//* 540 1102:iload           5
	//* 541 1104:ifne            1120
	//* 542 1107:iload           6
	//* 543 1109:ifeq            1115
	//* 544 1112:goto            1120
				bundle = null;
	//  545 1115:aconst_null     
	//  546 1116:astore_1        
			else
	//* 547 1117:goto            1123
				bundle = "4dip";
	//  548 1120:ldc1            #136 <String "4dip">
	//  549 1122:astore_1        
			io.card.payment.b.c.b(((android.view.View) (linearlayout)), ((String) (null)), ((String) (null)), ((String) (bundle)), ((String) (null)));
	//  550 1123:aload           8
	//  551 1125:aconst_null     
	//  552 1126:aconst_null     
	//  553 1127:aload_1         
	//  554 1128:aconst_null     
	//  555 1129:invokestatic    #413 <Method void c.b(android.view.View, String, String, String, String)>
		} else
	//* 556 1132:goto            1146
		{
			g = ((u) (new io.card.payment.a()));
	//  557 1135:aload_0         
	//  558 1136:new             #220 <Class io.card.payment.a>
	//  559 1139:dup             
	//  560 1140:invokespecial   #221 <Method void io.card.payment.a()>
	//  561 1143:putfield        #58  <Field u g>
		}
		bundle = ((Bundle) (obj));
	//  562 1146:aload           7
	//  563 1148:astore_1        
		if(flag1)
	//* 564 1149:iload           5
	//* 565 1151:ifeq            1490
		{
			LinearLayout linearlayout5 = new LinearLayout(((android.content.Context) (this)));
	//  566 1154:new             #131 <Class LinearLayout>
	//  567 1157:dup             
	//  568 1158:aload_0         
	//  569 1159:invokespecial   #134 <Method void LinearLayout(android.content.Context)>
	//  570 1162:astore          15
			obj = ((Object) (new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F)));
	//  571 1164:new             #373 <Class android.widget.LinearLayout$LayoutParams>
	//  572 1167:dup             
	//  573 1168:iconst_0        
	//  574 1169:iconst_m1       
	//  575 1170:fconst_1        
	//  576 1171:invokespecial   #450 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//  577 1174:astore          7
			linearlayout5.setOrientation(1);
	//  578 1176:aload           15
	//  579 1178:iconst_1        
	//  580 1179:invokevirtual   #145 <Method void LinearLayout.setOrientation(int)>
			Object obj2 = ((Object) (new TextView(((android.content.Context) (this)))));
	//  581 1182:new             #147 <Class TextView>
	//  582 1185:dup             
	//  583 1186:aload_0         
	//  584 1187:invokespecial   #148 <Method void TextView(android.content.Context)>
	//  585 1190:astore          8
			if(!t)
	//* 586 1192:aload_0         
	//* 587 1193:getfield        #150 <Field boolean t>
	//* 588 1196:ifne            1207
				((TextView) (obj2)).setTextColor(b.t);
	//  589 1199:aload           8
	//  590 1201:getstatic       #154 <Field int b.t>
	//  591 1204:invokevirtual   #157 <Method void TextView.setTextColor(int)>
			io.card.payment.b.c.a(((android.view.View) (obj2)), s, ((String) (null)), ((String) (null)), ((String) (null)));
	//  592 1207:aload           8
	//  593 1209:aload_0         
	//  594 1210:getfield        #159 <Field String s>
	//  595 1213:aconst_null     
	//  596 1214:aconst_null     
	//  597 1215:aconst_null     
	//  598 1216:invokestatic    #141 <Method void c.a(android.view.View, String, String, String, String)>
			((TextView) (obj2)).setText(((CharSequence) (io.card.payment.a.b.a(io.card.payment.a.c.i))));
	//  599 1219:aload           8
	//  600 1221:getstatic       #462 <Field io.card.payment.a.c io.card.payment.a.c.i>
	//  601 1224:invokestatic    #169 <Method String io.card.payment.a.b.a(io.card.payment.a.c)>
	//  602 1227:invokevirtual   #173 <Method void TextView.setText(CharSequence)>
			linearlayout5.addView(((android.view.View) (obj2)), -2, -2);
	//  603 1230:aload           15
	//  604 1232:aload           8
	//  605 1234:bipush          -2
	//  606 1236:bipush          -2
	//  607 1238:invokevirtual   #177 <Method void LinearLayout.addView(android.view.View, int, int)>
			h = new EditText(((android.content.Context) (this)));
	//  608 1241:aload_0         
	//  609 1242:new             #179 <Class EditText>
	//  610 1245:dup             
	//  611 1246:aload_0         
	//  612 1247:invokespecial   #180 <Method void EditText(android.content.Context)>
	//  613 1250:putfield        #274 <Field EditText h>
			obj2 = ((Object) (h));
	//  614 1253:aload_0         
	//  615 1254:getfield        #274 <Field EditText h>
	//  616 1257:astore          8
			i1 = b;
	//  617 1259:aload_0         
	//  618 1260:getfield        #49  <Field int b>
	//  619 1263:istore_2        
			b = i1 + 1;
	//  620 1264:aload_0         
	//  621 1265:iload_2         
	//  622 1266:iconst_1        
	//  623 1267:iadd            
	//  624 1268:putfield        #49  <Field int b>
			((EditText) (obj2)).setId(i1);
	//  625 1271:aload           8
	//  626 1273:iload_2         
	//  627 1274:invokevirtual   #185 <Method void EditText.setId(int)>
			h.setMaxLines(1);
	//  628 1277:aload_0         
	//  629 1278:getfield        #274 <Field EditText h>
	//  630 1281:iconst_1        
	//  631 1282:invokevirtual   #188 <Method void EditText.setMaxLines(int)>
			h.setImeOptions(6);
	//  632 1285:aload_0         
	//  633 1286:getfield        #274 <Field EditText h>
	//  634 1289:bipush          6
	//  635 1291:invokevirtual   #191 <Method void EditText.setImeOptions(int)>
			h.setTextAppearance(getApplicationContext(), 0x1010040);
	//  636 1294:aload_0         
	//  637 1295:getfield        #274 <Field EditText h>
	//  638 1298:aload_0         
	//  639 1299:invokevirtual   #195 <Method android.content.Context getApplicationContext()>
	//  640 1302:ldc1            #196 <Int 0x1010040>
	//  641 1304:invokevirtual   #200 <Method void EditText.setTextAppearance(android.content.Context, int)>
			h.setInputType(3);
	//  642 1307:aload_0         
	//  643 1308:getfield        #274 <Field EditText h>
	//  644 1311:iconst_3        
	//  645 1312:invokevirtual   #203 <Method void EditText.setInputType(int)>
			h.setHint("123");
	//  646 1315:aload_0         
	//  647 1316:getfield        #274 <Field EditText h>
	//  648 1319:ldc2            #295 <String "123">
	//  649 1322:invokevirtual   #298 <Method void EditText.setHint(CharSequence)>
			if(!t)
	//* 650 1325:aload_0         
	//* 651 1326:getfield        #150 <Field boolean t>
	//* 652 1329:ifne            1341
				h.setHintTextColor(0xffcccccc);
	//  653 1332:aload_0         
	//  654 1333:getfield        #274 <Field EditText h>
	//  655 1336:ldc1            #204 <Int 0xffcccccc>
	//  656 1338:invokevirtual   #207 <Method void EditText.setHintTextColor(int)>
			i1 = 4;
	//  657 1341:iconst_4        
	//  658 1342:istore_2        
			if(q != null)
	//* 659 1343:aload_0         
	//* 660 1344:getfield        #51  <Field CreditCard q>
	//* 661 1347:ifnull          1366
				i1 = CardType.fromCardNumber(e.b()).cvvLength();
	//  662 1350:aload_0         
	//  663 1351:getfield        #70  <Field u e>
	//  664 1354:invokeinterface #75  <Method String io.card.payment.u.b()>
	//  665 1359:invokestatic    #285 <Method CardType CardType.fromCardNumber(String)>
	//  666 1362:invokevirtual   #290 <Method int CardType.cvvLength()>
	//  667 1365:istore_2        
			i = ((u) (new k(i1)));
	//  668 1366:aload_0         
	//  669 1367:new             #287 <Class k>
	//  670 1370:dup             
	//  671 1371:iload_2         
	//  672 1372:invokespecial   #463 <Method void k(int)>
	//  673 1375:putfield        #77  <Field u i>
			h.setFilters(new InputFilter[] {
				new DigitsKeyListener(), i
			});
	//  674 1378:aload_0         
	//  675 1379:getfield        #274 <Field EditText h>
	//  676 1382:iconst_2        
	//  677 1383:anewarray       InputFilter[]
	//  678 1386:dup             
	//  679 1387:iconst_0        
	//  680 1388:new             #436 <Class DigitsKeyListener>
	//  681 1391:dup             
	//  682 1392:invokespecial   #437 <Method void DigitsKeyListener()>
	//  683 1395:aastore         
	//  684 1396:dup             
	//  685 1397:iconst_1        
	//  686 1398:aload_0         
	//  687 1399:getfield        #77  <Field u i>
	//  688 1402:aastore         
	//  689 1403:invokevirtual   #441 <Method void EditText.setFilters(InputFilter[])>
			h.addTextChangedListener(((TextWatcher) (i)));
	//  690 1406:aload_0         
	//  691 1407:getfield        #274 <Field EditText h>
	//  692 1410:aload_0         
	//  693 1411:getfield        #77  <Field u i>
	//  694 1414:invokevirtual   #215 <Method void EditText.addTextChangedListener(TextWatcher)>
			h.addTextChangedListener(((TextWatcher) (this)));
	//  695 1417:aload_0         
	//  696 1418:getfield        #274 <Field EditText h>
	//  697 1421:aload_0         
	//  698 1422:invokevirtual   #215 <Method void EditText.addTextChangedListener(TextWatcher)>
			linearlayout5.addView(((android.view.View) (h)), -1, -2);
	//  699 1425:aload           15
	//  700 1427:aload_0         
	//  701 1428:getfield        #274 <Field EditText h>
	//  702 1431:iconst_m1       
	//  703 1432:bipush          -2
	//  704 1434:invokevirtual   #177 <Method void LinearLayout.addView(android.view.View, int, int)>
			linearlayout4.addView(((android.view.View) (linearlayout5)), ((android.view.ViewGroup.LayoutParams) (obj)));
	//  705 1437:aload           13
	//  706 1439:aload           15
	//  707 1441:aload           7
	//  708 1443:invokevirtual   #409 <Method void LinearLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			if(flag)
	//* 709 1446:iload           4
	//* 710 1448:ifeq            1458
				obj = "4dip";
	//  711 1451:ldc1            #136 <String "4dip">
	//  712 1453:astore          7
			else
	//* 713 1455:goto            1461
				obj = null;
	//  714 1458:aconst_null     
	//  715 1459:astore          7
			if(flag2)
	//* 716 1461:iload           6
	//* 717 1463:ifeq            1473
				obj2 = "4dip";
	//  718 1466:ldc1            #136 <String "4dip">
	//  719 1468:astore          8
			else
	//* 720 1470:goto            1476
				obj2 = null;
	//  721 1473:aconst_null     
	//  722 1474:astore          8
			io.card.payment.b.c.b(((android.view.View) (linearlayout5)), ((String) (obj)), ((String) (null)), ((String) (obj2)), ((String) (null)));
	//  723 1476:aload           15
	//  724 1478:aload           7
	//  725 1480:aconst_null     
	//  726 1481:aload           8
	//  727 1483:aconst_null     
	//  728 1484:invokestatic    #413 <Method void c.b(android.view.View, String, String, String, String)>
		} else
	//* 729 1487:goto            1501
		{
			i = ((u) (new io.card.payment.a()));
	//  730 1490:aload_0         
	//  731 1491:new             #220 <Class io.card.payment.a>
	//  732 1494:dup             
	//  733 1495:invokespecial   #221 <Method void io.card.payment.a()>
	//  734 1498:putfield        #77  <Field u i>
		}
		if(flag2)
	//* 735 1501:iload           6
	//* 736 1503:ifeq            1801
		{
			LinearLayout linearlayout1 = new LinearLayout(((android.content.Context) (this)));
	//  737 1506:new             #131 <Class LinearLayout>
	//  738 1509:dup             
	//  739 1510:aload_0         
	//  740 1511:invokespecial   #134 <Method void LinearLayout(android.content.Context)>
	//  741 1514:astore          8
			obj = ((Object) (new android.widget.LinearLayout.LayoutParams(0, -1, 1.0F)));
	//  742 1516:new             #373 <Class android.widget.LinearLayout$LayoutParams>
	//  743 1519:dup             
	//  744 1520:iconst_0        
	//  745 1521:iconst_m1       
	//  746 1522:fconst_1        
	//  747 1523:invokespecial   #450 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//  748 1526:astore          7
			linearlayout1.setOrientation(1);
	//  749 1528:aload           8
	//  750 1530:iconst_1        
	//  751 1531:invokevirtual   #145 <Method void LinearLayout.setOrientation(int)>
			Object obj5 = ((Object) (new TextView(((android.content.Context) (this)))));
	//  752 1534:new             #147 <Class TextView>
	//  753 1537:dup             
	//  754 1538:aload_0         
	//  755 1539:invokespecial   #148 <Method void TextView(android.content.Context)>
	//  756 1542:astore          15
			if(!t)
	//* 757 1544:aload_0         
	//* 758 1545:getfield        #150 <Field boolean t>
	//* 759 1548:ifne            1559
				((TextView) (obj5)).setTextColor(b.t);
	//  760 1551:aload           15
	//  761 1553:getstatic       #154 <Field int b.t>
	//  762 1556:invokevirtual   #157 <Method void TextView.setTextColor(int)>
			io.card.payment.b.c.a(((android.view.View) (obj5)), s, ((String) (null)), ((String) (null)), ((String) (null)));
	//  763 1559:aload           15
	//  764 1561:aload_0         
	//  765 1562:getfield        #159 <Field String s>
	//  766 1565:aconst_null     
	//  767 1566:aconst_null     
	//  768 1567:aconst_null     
	//  769 1568:invokestatic    #141 <Method void c.a(android.view.View, String, String, String, String)>
			((TextView) (obj5)).setText(((CharSequence) (io.card.payment.a.b.a(io.card.payment.a.c.j))));
	//  770 1571:aload           15
	//  771 1573:getstatic       #465 <Field io.card.payment.a.c io.card.payment.a.c.j>
	//  772 1576:invokestatic    #169 <Method String io.card.payment.a.b.a(io.card.payment.a.c)>
	//  773 1579:invokevirtual   #173 <Method void TextView.setText(CharSequence)>
			linearlayout1.addView(((android.view.View) (obj5)), -2, -2);
	//  774 1582:aload           8
	//  775 1584:aload           15
	//  776 1586:bipush          -2
	//  777 1588:bipush          -2
	//  778 1590:invokevirtual   #177 <Method void LinearLayout.addView(android.view.View, int, int)>
			boolean flag3 = getIntent().getBooleanExtra("io.card.payment.restrictPostalCodeToNumericOnly", false);
	//  779 1593:aload_0         
	//  780 1594:invokevirtual   #97  <Method Intent getIntent()>
	//  781 1597:ldc2            #467 <String "io.card.payment.restrictPostalCodeToNumericOnly">
	//  782 1600:iconst_0        
	//  783 1601:invokevirtual   #129 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//  784 1604:istore          6
			j = new EditText(((android.content.Context) (this)));
	//  785 1606:aload_0         
	//  786 1607:new             #179 <Class EditText>
	//  787 1610:dup             
	//  788 1611:aload_0         
	//  789 1612:invokespecial   #180 <Method void EditText(android.content.Context)>
	//  790 1615:putfield        #300 <Field EditText j>
			obj5 = ((Object) (j));
	//  791 1618:aload_0         
	//  792 1619:getfield        #300 <Field EditText j>
	//  793 1622:astore          15
			i1 = b;
	//  794 1624:aload_0         
	//  795 1625:getfield        #49  <Field int b>
	//  796 1628:istore_2        
			b = i1 + 1;
	//  797 1629:aload_0         
	//  798 1630:iload_2         
	//  799 1631:iconst_1        
	//  800 1632:iadd            
	//  801 1633:putfield        #49  <Field int b>
			((EditText) (obj5)).setId(i1);
	//  802 1636:aload           15
	//  803 1638:iload_2         
	//  804 1639:invokevirtual   #185 <Method void EditText.setId(int)>
			j.setMaxLines(1);
	//  805 1642:aload_0         
	//  806 1643:getfield        #300 <Field EditText j>
	//  807 1646:iconst_1        
	//  808 1647:invokevirtual   #188 <Method void EditText.setMaxLines(int)>
			j.setImeOptions(6);
	//  809 1650:aload_0         
	//  810 1651:getfield        #300 <Field EditText j>
	//  811 1654:bipush          6
	//  812 1656:invokevirtual   #191 <Method void EditText.setImeOptions(int)>
			j.setTextAppearance(getApplicationContext(), 0x1010040);
	//  813 1659:aload_0         
	//  814 1660:getfield        #300 <Field EditText j>
	//  815 1663:aload_0         
	//  816 1664:invokevirtual   #195 <Method android.content.Context getApplicationContext()>
	//  817 1667:ldc1            #196 <Int 0x1010040>
	//  818 1669:invokevirtual   #200 <Method void EditText.setTextAppearance(android.content.Context, int)>
			if(flag3)
	//* 819 1672:iload           6
	//* 820 1674:ifeq            1688
				j.setInputType(3);
	//  821 1677:aload_0         
	//  822 1678:getfield        #300 <Field EditText j>
	//  823 1681:iconst_3        
	//  824 1682:invokevirtual   #203 <Method void EditText.setInputType(int)>
			else
	//* 825 1685:goto            1696
				j.setInputType(1);
	//  826 1688:aload_0         
	//  827 1689:getfield        #300 <Field EditText j>
	//  828 1692:iconst_1        
	//  829 1693:invokevirtual   #203 <Method void EditText.setInputType(int)>
			if(!t)
	//* 830 1696:aload_0         
	//* 831 1697:getfield        #150 <Field boolean t>
	//* 832 1700:ifne            1712
				j.setHintTextColor(0xffcccccc);
	//  833 1703:aload_0         
	//  834 1704:getfield        #300 <Field EditText j>
	//  835 1707:ldc1            #204 <Int 0xffcccccc>
	//  836 1709:invokevirtual   #207 <Method void EditText.setHintTextColor(int)>
			k = ((u) (new m(20)));
	//  837 1712:aload_0         
	//  838 1713:new             #209 <Class m>
	//  839 1716:dup             
	//  840 1717:bipush          20
	//  841 1719:invokespecial   #211 <Method void m(int)>
	//  842 1722:putfield        #79  <Field u k>
			j.addTextChangedListener(((TextWatcher) (k)));
	//  843 1725:aload_0         
	//  844 1726:getfield        #300 <Field EditText j>
	//  845 1729:aload_0         
	//  846 1730:getfield        #79  <Field u k>
	//  847 1733:invokevirtual   #215 <Method void EditText.addTextChangedListener(TextWatcher)>
			j.addTextChangedListener(((TextWatcher) (this)));
	//  848 1736:aload_0         
	//  849 1737:getfield        #300 <Field EditText j>
	//  850 1740:aload_0         
	//  851 1741:invokevirtual   #215 <Method void EditText.addTextChangedListener(TextWatcher)>
			linearlayout1.addView(((android.view.View) (j)), -1, -2);
	//  852 1744:aload           8
	//  853 1746:aload_0         
	//  854 1747:getfield        #300 <Field EditText j>
	//  855 1750:iconst_m1       
	//  856 1751:bipush          -2
	//  857 1753:invokevirtual   #177 <Method void LinearLayout.addView(android.view.View, int, int)>
			linearlayout4.addView(((android.view.View) (linearlayout1)), ((android.view.ViewGroup.LayoutParams) (obj)));
	//  858 1756:aload           13
	//  859 1758:aload           8
	//  860 1760:aload           7
	//  861 1762:invokevirtual   #409 <Method void LinearLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
			if(!flag && !flag1)
	//* 862 1765:iload           4
	//* 863 1767:ifne            1784
	//* 864 1770:iload           5
	//* 865 1772:ifeq            1778
	//* 866 1775:goto            1784
				obj = null;
	//  867 1778:aconst_null     
	//  868 1779:astore          7
			else
	//* 869 1781:goto            1788
				obj = "4dip";
	//  870 1784:ldc1            #136 <String "4dip">
	//  871 1786:astore          7
			io.card.payment.b.c.b(((android.view.View) (linearlayout1)), ((String) (obj)), ((String) (null)), ((String) (null)), ((String) (null)));
	//  872 1788:aload           8
	//  873 1790:aload           7
	//  874 1792:aconst_null     
	//  875 1793:aconst_null     
	//  876 1794:aconst_null     
	//  877 1795:invokestatic    #413 <Method void c.b(android.view.View, String, String, String, String)>
		} else
	//* 878 1798:goto            1812
		{
			k = ((u) (new io.card.payment.a()));
	//  879 1801:aload_0         
	//  880 1802:new             #220 <Class io.card.payment.a>
	//  881 1805:dup             
	//  882 1806:invokespecial   #221 <Method void io.card.payment.a()>
	//  883 1809:putfield        #79  <Field u k>
		}
		linearlayout3.addView(((android.view.View) (linearlayout4)), ((android.view.ViewGroup.LayoutParams) (layoutparams2)));
	//  884 1812:aload           11
	//  885 1814:aload           13
	//  886 1816:aload           14
	//  887 1818:invokevirtual   #409 <Method void LinearLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		a(((ViewGroup) (linearlayout3)));
	//  888 1821:aload_0         
	//  889 1822:aload           11
	//  890 1824:invokespecial   #469 <Method void a(ViewGroup)>
		linearlayout2.addView(((android.view.View) (linearlayout3)), ((android.view.ViewGroup.LayoutParams) (layoutparams1)));
	//  891 1827:aload           10
	//  892 1829:aload           11
	//  893 1831:aload           12
	//  894 1833:invokevirtual   #409 <Method void LinearLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		io.card.payment.b.c.b(((android.view.View) (linearlayout3)), "16dip", "20dip", "16dip", "20dip");
	//  895 1836:aload           11
	//  896 1838:ldc2            #471 <String "16dip">
	//  897 1841:ldc2            #473 <String "20dip">
	//  898 1844:ldc2            #471 <String "16dip">
	//  899 1847:ldc2            #473 <String "20dip">
	//  900 1850:invokestatic    #413 <Method void c.b(android.view.View, String, String, String, String)>
		obj = ((Object) (new LinearLayout(((android.content.Context) (this)))));
	//  901 1853:new             #131 <Class LinearLayout>
	//  902 1856:dup             
	//  903 1857:aload_0         
	//  904 1858:invokespecial   #134 <Method void LinearLayout(android.content.Context)>
	//  905 1861:astore          7
		i1 = a;
	//  906 1863:aload_0         
	//  907 1864:getfield        #47  <Field int a>
	//  908 1867:istore_2        
		a = i1 + 1;
	//  909 1868:aload_0         
	//  910 1869:iload_2         
	//  911 1870:iconst_1        
	//  912 1871:iadd            
	//  913 1872:putfield        #47  <Field int a>
		((LinearLayout) (obj)).setId(i1);
	//  914 1875:aload           7
	//  915 1877:iload_2         
	//  916 1878:invokevirtual   #474 <Method void LinearLayout.setId(int)>
		android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
	//  917 1881:new             #361 <Class android.widget.RelativeLayout$LayoutParams>
	//  918 1884:dup             
	//  919 1885:iconst_m1       
	//  920 1886:bipush          -2
	//  921 1888:invokespecial   #364 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//  922 1891:astore          8
		layoutparams.addRule(12);
	//  923 1893:aload           8
	//  924 1895:bipush          12
	//  925 1897:invokevirtual   #367 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int)>
		((LinearLayout) (obj)).setPadding(0, j1, 0, 0);
	//  926 1900:aload           7
	//  927 1902:iconst_0        
	//  928 1903:iload_3         
	//  929 1904:iconst_0        
	//  930 1905:iconst_0        
	//  931 1906:invokevirtual   #475 <Method void LinearLayout.setPadding(int, int, int, int)>
		((LinearLayout) (obj)).setBackgroundColor(0);
	//  932 1909:aload           7
	//  933 1911:iconst_0        
	//  934 1912:invokevirtual   #476 <Method void LinearLayout.setBackgroundColor(int)>
		((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(2, ((LinearLayout) (obj)).getId());
	//  935 1915:aload           9
	//  936 1917:iconst_2        
	//  937 1918:aload           7
	//  938 1920:invokevirtual   #479 <Method int LinearLayout.getId()>
	//  939 1923:invokevirtual   #481 <Method void android.widget.RelativeLayout$LayoutParams.addRule(int, int)>
		o = new Button(((android.content.Context) (this)));
	//  940 1926:aload_0         
	//  941 1927:new             #254 <Class Button>
	//  942 1930:dup             
	//  943 1931:aload_0         
	//  944 1932:invokespecial   #482 <Method void Button(android.content.Context)>
	//  945 1935:putfield        #250 <Field Button o>
		obj3 = ((Object) (new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F)));
	//  946 1938:new             #373 <Class android.widget.LinearLayout$LayoutParams>
	//  947 1941:dup             
	//  948 1942:iconst_m1       
	//  949 1943:bipush          -2
	//  950 1945:fconst_1        
	//  951 1946:invokespecial   #450 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//  952 1949:astore          9
		o.setText(((CharSequence) (io.card.payment.a.b.a(io.card.payment.a.c.h))));
	//  953 1951:aload_0         
	//  954 1952:getfield        #250 <Field Button o>
	//  955 1955:getstatic       #484 <Field io.card.payment.a.c io.card.payment.a.c.h>
	//  956 1958:invokestatic    #169 <Method String io.card.payment.a.b.a(io.card.payment.a.c)>
	//  957 1961:invokevirtual   #485 <Method void Button.setText(CharSequence)>
		o.setOnClickListener(((android.view.View.OnClickListener) (new h(this))));
	//  958 1964:aload_0         
	//  959 1965:getfield        #250 <Field Button o>
	//  960 1968:new             #487 <Class h>
	//  961 1971:dup             
	//  962 1972:aload_0         
	//  963 1973:invokespecial   #489 <Method void h(DataEntryActivity)>
	//  964 1976:invokevirtual   #493 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		o.setEnabled(false);
	//  965 1979:aload_0         
	//  966 1980:getfield        #250 <Field Button o>
	//  967 1983:iconst_0        
	//  968 1984:invokevirtual   #258 <Method void Button.setEnabled(boolean)>
		((LinearLayout) (obj)).addView(((android.view.View) (o)), ((android.view.ViewGroup.LayoutParams) (obj3)));
	//  969 1987:aload           7
	//  970 1989:aload_0         
	//  971 1990:getfield        #250 <Field Button o>
	//  972 1993:aload           9
	//  973 1995:invokevirtual   #409 <Method void LinearLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		io.card.payment.b.c.a(o, true, ((android.content.Context) (this)), t);
	//  974 1998:aload_0         
	//  975 1999:getfield        #250 <Field Button o>
	//  976 2002:iconst_1        
	//  977 2003:aload_0         
	//  978 2004:aload_0         
	//  979 2005:getfield        #150 <Field boolean t>
	//  980 2008:invokestatic    #496 <Method void c.a(Button, boolean, android.content.Context, boolean)>
		io.card.payment.b.c.a(((android.view.View) (o)), "5dip", ((String) (null)), "5dip", ((String) (null)));
	//  981 2011:aload_0         
	//  982 2012:getfield        #250 <Field Button o>
	//  983 2015:ldc2            #498 <String "5dip">
	//  984 2018:aconst_null     
	//  985 2019:ldc2            #498 <String "5dip">
	//  986 2022:aconst_null     
	//  987 2023:invokestatic    #141 <Method void c.a(android.view.View, String, String, String, String)>
		io.card.payment.b.c.b(((android.view.View) (o)), "8dip", "8dip", "8dip", "8dip");
	//  988 2026:aload_0         
	//  989 2027:getfield        #250 <Field Button o>
	//  990 2030:ldc2            #411 <String "8dip">
	//  991 2033:ldc2            #411 <String "8dip">
	//  992 2036:ldc2            #411 <String "8dip">
	//  993 2039:ldc2            #411 <String "8dip">
	//  994 2042:invokestatic    #413 <Method void c.b(android.view.View, String, String, String, String)>
		if(!t)
	//* 995 2045:aload_0         
	//* 996 2046:getfield        #150 <Field boolean t>
	//* 997 2049:ifne            2062
			o.setTextSize(16F);
	//  998 2052:aload_0         
	//  999 2053:getfield        #250 <Field Button o>
	// 1000 2056:ldc2            #499 <Float 16F>
	// 1001 2059:invokevirtual   #500 <Method void Button.setTextSize(float)>
		p = new Button(((android.content.Context) (this)));
	// 1002 2062:aload_0         
	// 1003 2063:new             #254 <Class Button>
	// 1004 2066:dup             
	// 1005 2067:aload_0         
	// 1006 2068:invokespecial   #482 <Method void Button(android.content.Context)>
	// 1007 2071:putfield        #502 <Field Button p>
		obj3 = ((Object) (new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F)));
	// 1008 2074:new             #373 <Class android.widget.LinearLayout$LayoutParams>
	// 1009 2077:dup             
	// 1010 2078:iconst_m1       
	// 1011 2079:bipush          -2
	// 1012 2081:fconst_1        
	// 1013 2082:invokespecial   #450 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	// 1014 2085:astore          9
		p.setText(((CharSequence) (io.card.payment.a.b.a(io.card.payment.a.c.a))));
	// 1015 2087:aload_0         
	// 1016 2088:getfield        #502 <Field Button p>
	// 1017 2091:getstatic       #504 <Field io.card.payment.a.c io.card.payment.a.c.a>
	// 1018 2094:invokestatic    #169 <Method String io.card.payment.a.b.a(io.card.payment.a.c)>
	// 1019 2097:invokevirtual   #485 <Method void Button.setText(CharSequence)>
		p.setOnClickListener(((android.view.View.OnClickListener) (new i(this))));
	// 1020 2100:aload_0         
	// 1021 2101:getfield        #502 <Field Button p>
	// 1022 2104:new             #506 <Class i>
	// 1023 2107:dup             
	// 1024 2108:aload_0         
	// 1025 2109:invokespecial   #507 <Method void i(DataEntryActivity)>
	// 1026 2112:invokevirtual   #493 <Method void Button.setOnClickListener(android.view.View$OnClickListener)>
		((LinearLayout) (obj)).addView(((android.view.View) (p)), ((android.view.ViewGroup.LayoutParams) (obj3)));
	// 1027 2115:aload           7
	// 1028 2117:aload_0         
	// 1029 2118:getfield        #502 <Field Button p>
	// 1030 2121:aload           9
	// 1031 2123:invokevirtual   #409 <Method void LinearLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		io.card.payment.b.c.a(p, false, ((android.content.Context) (this)), t);
	// 1032 2126:aload_0         
	// 1033 2127:getfield        #502 <Field Button p>
	// 1034 2130:iconst_0        
	// 1035 2131:aload_0         
	// 1036 2132:aload_0         
	// 1037 2133:getfield        #150 <Field boolean t>
	// 1038 2136:invokestatic    #496 <Method void c.a(Button, boolean, android.content.Context, boolean)>
		io.card.payment.b.c.a(((android.view.View) (p)), "5dip", ((String) (null)), "5dip", ((String) (null)));
	// 1039 2139:aload_0         
	// 1040 2140:getfield        #502 <Field Button p>
	// 1041 2143:ldc2            #498 <String "5dip">
	// 1042 2146:aconst_null     
	// 1043 2147:ldc2            #498 <String "5dip">
	// 1044 2150:aconst_null     
	// 1045 2151:invokestatic    #141 <Method void c.a(android.view.View, String, String, String, String)>
		io.card.payment.b.c.b(((android.view.View) (p)), "4dip", "8dip", "8dip", "8dip");
	// 1046 2154:aload_0         
	// 1047 2155:getfield        #502 <Field Button p>
	// 1048 2158:ldc1            #136 <String "4dip">
	// 1049 2160:ldc2            #411 <String "8dip">
	// 1050 2163:ldc2            #411 <String "8dip">
	// 1051 2166:ldc2            #411 <String "8dip">
	// 1052 2169:invokestatic    #413 <Method void c.b(android.view.View, String, String, String, String)>
		if(!t)
	//*1053 2172:aload_0         
	//*1054 2173:getfield        #150 <Field boolean t>
	//*1055 2176:ifne            2192
			p.setTextSize(16F);
	// 1056 2179:aload_0         
	// 1057 2180:getfield        #502 <Field Button p>
	// 1058 2183:ldc2            #499 <Float 16F>
	// 1059 2186:invokevirtual   #500 <Method void Button.setTextSize(float)>
	//*1060 2189:goto            2192
		((RelativeLayout) (bundle)).addView(((android.view.View) (obj)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	// 1061 2192:aload_1         
	// 1062 2193:aload           7
	// 1063 2195:aload           8
	// 1064 2197:invokevirtual   #370 <Method void RelativeLayout.addView(android.view.View, android.view.ViewGroup$LayoutParams)>
		io.card.payment.b.a.a(((Activity) (this)));
	// 1065 2200:aload_0         
	// 1066 2201:invokestatic    #510 <Method void a.a(Activity)>
		setContentView(((android.view.View) (bundle)));
	// 1067 2204:aload_0         
	// 1068 2205:aload_1         
	// 1069 2206:invokevirtual   #513 <Method void setContentView(android.view.View)>
		if(getIntent().getBooleanExtra("io.card.payment.intentSenderIsPayPal", true))
	//*1070 2209:aload_0         
	//*1071 2210:invokevirtual   #97  <Method Intent getIntent()>
	//*1072 2213:ldc2            #515 <String "io.card.payment.intentSenderIsPayPal">
	//*1073 2216:iconst_1        
	//*1074 2217:invokevirtual   #129 <Method boolean Intent.getBooleanExtra(String, boolean)>
	//*1075 2220:ifeq            2237
			bundle = ((Bundle) (getResources().getDrawable(R.drawable.cio_ic_paypal_monogram)));
	// 1076 2223:aload_0         
	// 1077 2224:invokevirtual   #519 <Method Resources getResources()>
	// 1078 2227:getstatic       #524 <Field int R$drawable.cio_ic_paypal_monogram>
	// 1079 2230:invokevirtual   #530 <Method android.graphics.drawable.Drawable Resources.getDrawable(int)>
	// 1080 2233:astore_1        
		else
	//*1081 2234:goto            2239
			bundle = null;
	// 1082 2237:aconst_null     
	// 1083 2238:astore_1        
		if(flag && g.a())
	//*1084 2239:iload           4
	//*1085 2241:ifeq            2267
	//*1086 2244:aload_0         
	//*1087 2245:getfield        #58  <Field u g>
	//*1088 2248:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*1089 2253:ifeq            2267
			afterTextChanged(f.getEditableText());
	// 1090 2256:aload_0         
	// 1091 2257:aload_0         
	// 1092 2258:getfield        #56  <Field EditText f>
	// 1093 2261:invokevirtual   #533 <Method Editable EditText.getEditableText()>
	// 1094 2264:invokevirtual   #535 <Method void afterTextChanged(Editable)>
		io.card.payment.b.a.a(((Activity) (this)), c, io.card.payment.a.b.a(io.card.payment.a.c.q), "card.io - ", ((android.graphics.drawable.Drawable) (bundle)));
	// 1095 2267:aload_0         
	// 1096 2268:aload_0         
	// 1097 2269:getfield        #415 <Field TextView c>
	// 1098 2272:getstatic       #537 <Field io.card.payment.a.c io.card.payment.a.c.q>
	// 1099 2275:invokestatic    #169 <Method String io.card.payment.a.b.a(io.card.payment.a.c)>
	// 1100 2278:ldc2            #539 <String "card.io - ">
	// 1101 2281:aload_1         
	// 1102 2282:invokestatic    #542 <Method void a.a(Activity, TextView, String, String, android.graphics.drawable.Drawable)>
	// 1103 2285:return          
	}

	protected void onResume()
	{
		super.onResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #545 <Method void Activity.onResume()>
		getWindow().setFlags(0, 1024);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #549 <Method Window getWindow()>
	//    4    8:iconst_0        
	//    5    9:sipush          1024
	//    6   12:invokevirtual   #554 <Method void Window.setFlags(int, int)>
		io.card.payment.b.a.b(((Activity) (this)));
	//    7   15:aload_0         
	//    8   16:invokestatic    #556 <Method void a.b(Activity)>
		c();
	//    9   19:aload_0         
	//   10   20:invokespecial   #302 <Method void c()>
		if(d == null && f != null && !g.a())
	//*  11   23:aload_0         
	//*  12   24:getfield        #264 <Field EditText d>
	//*  13   27:ifnonnull       60
	//*  14   30:aload_0         
	//*  15   31:getfield        #56  <Field EditText f>
	//*  16   34:ifnull          60
	//*  17   37:aload_0         
	//*  18   38:getfield        #58  <Field u g>
	//*  19   41:invokeinterface #252 <Method boolean io.card.payment.u.a()>
	//*  20   46:ifne            60
			f.requestFocus();
	//   21   49:aload_0         
	//   22   50:getfield        #56  <Field EditText f>
	//   23   53:invokevirtual   #248 <Method boolean EditText.requestFocus()>
	//   24   56:pop             
		else
	//*  25   57:goto            65
			b();
	//   26   60:aload_0         
	//   27   61:invokespecial   #272 <Method EditText b()>
	//   28   64:pop             
		if(d != null || f != null || h != null || j != null || l != null)
	//*  29   65:aload_0         
	//*  30   66:getfield        #264 <Field EditText d>
	//*  31   69:ifnonnull       100
	//*  32   72:aload_0         
	//*  33   73:getfield        #56  <Field EditText f>
	//*  34   76:ifnonnull       100
	//*  35   79:aload_0         
	//*  36   80:getfield        #274 <Field EditText h>
	//*  37   83:ifnonnull       100
	//*  38   86:aload_0         
	//*  39   87:getfield        #300 <Field EditText j>
	//*  40   90:ifnonnull       100
	//*  41   93:aload_0         
	//*  42   94:getfield        #182 <Field EditText l>
	//*  43   97:ifnull          108
			getWindow().setSoftInputMode(5);
	//   44  100:aload_0         
	//   45  101:invokevirtual   #549 <Method Window getWindow()>
	//   46  104:iconst_5        
	//   47  105:invokevirtual   #559 <Method void Window.setSoftInputMode(int)>
	//   48  108:return          
	}

	public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
	{
	//    0    0:return          
	}

	private static final String v = "DataEntryActivity";
	private int a;
	private int b;
	private TextView c;
	private EditText d;
	private u e;
	private EditText f;
	private u g;
	private EditText h;
	private u i;
	private EditText j;
	private u k;
	private EditText l;
	private u m;
	private ImageView n;
	private Button o;
	private Button p;
	private CreditCard q;
	private boolean r;
	private String s;
	private boolean t;
	private int u;

	static 
	{
	//    0    0:return          
	}
}
