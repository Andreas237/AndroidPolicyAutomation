// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.paypal.android.sdk.payments;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.paypal.android.sdk.cd;
import com.paypal.android.sdk.dj;
import java.math.BigDecimal;

// Referenced classes of package com.paypal.android.sdk.payments:
//			as, PayPalPaymentDetails, PayPalItem, ShippingAddress

public final class PayPalPayment
	implements Parcelable
{

	private PayPalPayment(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		c = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #50  <Method String Parcel.readString()>
	//    5    9:putfield        #52  <Field String c>
		int i1;
		boolean flag;
		try
		{
			b = new BigDecimal(parcel.readString());
	//    6   12:aload_0         
	//    7   13:new             #54  <Class BigDecimal>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:invokevirtual   #50  <Method String Parcel.readString()>
	//   11   21:invokespecial   #57  <Method void BigDecimal(String)>
	//   12   24:putfield        #59  <Field BigDecimal b>
		}
	//*  13   27:aload_0         
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #50  <Method String Parcel.readString()>
	//*  16   32:putfield        #61  <Field String d>
	//*  17   35:aload_0         
	//*  18   36:aload_1         
	//*  19   37:invokevirtual   #50  <Method String Parcel.readString()>
	//*  20   40:putfield        #63  <Field String g>
	//*  21   43:aload_0         
	//*  22   44:aload_1         
	//*  23   45:invokevirtual   #50  <Method String Parcel.readString()>
	//*  24   48:putfield        #65  <Field String e>
	//*  25   51:aload_0         
	//*  26   52:aload_1         
	//*  27   53:ldc1            #67  <Class PayPalPaymentDetails>
	//*  28   55:invokevirtual   #73  <Method ClassLoader Class.getClassLoader()>
	//*  29   58:invokevirtual   #77  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//*  30   61:checkcast       #67  <Class PayPalPaymentDetails>
	//*  31   64:putfield        #79  <Field PayPalPaymentDetails f>
	//*  32   67:aload_1         
	//*  33   68:invokevirtual   #83  <Method int Parcel.readInt()>
	//*  34   71:istore_2        
	//*  35   72:iload_2         
	//*  36   73:ifle            95
	//*  37   76:aload_0         
	//*  38   77:iload_2         
	//*  39   78:anewarray       PayPalItem[]
	//*  40   81:putfield        #87  <Field PayPalItem[] h>
	//*  41   84:aload_1         
	//*  42   85:aload_0         
	//*  43   86:getfield        #87  <Field PayPalItem[] h>
	//*  44   89:getstatic       #88  <Field android.os.Parcelable$Creator PayPalItem.CREATOR>
	//*  45   92:invokevirtual   #92  <Method void Parcel.readTypedArray(Object[], android.os.Parcelable$Creator)>
	//*  46   95:aload_0         
	//*  47   96:aload_1         
	//*  48   97:ldc1            #94  <Class ShippingAddress>
	//*  49   99:invokevirtual   #73  <Method ClassLoader Class.getClassLoader()>
	//*  50  102:invokevirtual   #77  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//*  51  105:checkcast       #94  <Class ShippingAddress>
	//*  52  108:putfield        #96  <Field ShippingAddress j>
	//*  53  111:aload_1         
	//*  54  112:invokevirtual   #83  <Method int Parcel.readInt()>
	//*  55  115:istore_2        
	//*  56  116:iconst_1        
	//*  57  117:istore_3        
	//*  58  118:iload_2         
	//*  59  119:iconst_1        
	//*  60  120:icmpne          126
	//*  61  123:goto            128
	//*  62  126:iconst_0        
	//*  63  127:istore_3        
	//*  64  128:aload_0         
	//*  65  129:iload_3         
	//*  66  130:putfield        #98  <Field boolean i>
	//*  67  133:aload_0         
	//*  68  134:aload_1         
	//*  69  135:invokevirtual   #50  <Method String Parcel.readString()>
	//*  70  138:putfield        #100 <Field String k>
	//*  71  141:aload_0         
	//*  72  142:aload_1         
	//*  73  143:invokevirtual   #50  <Method String Parcel.readString()>
	//*  74  146:putfield        #102 <Field String l>
	//*  75  149:aload_0         
	//*  76  150:aload_1         
	//*  77  151:invokevirtual   #50  <Method String Parcel.readString()>
	//*  78  154:putfield        #104 <Field String m>
	//*  79  157:aload_0         
	//*  80  158:aload_1         
	//*  81  159:invokevirtual   #50  <Method String Parcel.readString()>
	//*  82  162:putfield        #106 <Field String n>
	//*  83  165:return          
		catch(NumberFormatException numberformatexception) { }
	//   84  166:astore          4
		d = parcel.readString();
		g = parcel.readString();
		e = parcel.readString();
		f = (PayPalPaymentDetails)parcel.readParcelable(((Class) (com/paypal/android/sdk/payments/PayPalPaymentDetails)).getClassLoader());
		i1 = parcel.readInt();
		if(i1 > 0)
		{
			h = new PayPalItem[i1];
			parcel.readTypedArray(((Object []) (h)), PayPalItem.CREATOR);
		}
		j = (ShippingAddress)parcel.readParcelable(((Class) (com/paypal/android/sdk/payments/ShippingAddress)).getClassLoader());
		i1 = parcel.readInt();
		flag = true;
		if(i1 != 1)
			flag = false;
		i = flag;
		k = parcel.readString();
		l = parcel.readString();
		m = parcel.readString();
		n = parcel.readString();
	//*  85  168:goto            27
	}

	PayPalPayment(Parcel parcel, byte byte0)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #109 <Method void PayPalPayment(Parcel)>
	//    3    5:return          
	}

	public PayPalPayment(BigDecimal bigdecimal, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #44  <Method void Object()>
		b = bigdecimal;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #59  <Field BigDecimal b>
		c = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #52  <Field String c>
		d = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #61  <Field String d>
		g = s2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #63  <Field String g>
		f = null;
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:putfield        #79  <Field PayPalPaymentDetails f>
		e = null;
	//   17   30:aload_0         
	//   18   31:aconst_null     
	//   19   32:putfield        #65  <Field String e>
		toString();
	//   20   35:aload_0         
	//   21   36:invokevirtual   #113 <Method String toString()>
	//   22   39:pop             
	//   23   40:return          
	}

	private static void a(boolean flag, String s)
	{
		if(!flag)
	//*   0    0:iload_0         
	//*   1    1:ifne            35
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #116 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #117 <Method void StringBuilder()>
	//    5   11:astore_2        
			stringbuilder.append(s);
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//    9   17:pop             
			stringbuilder.append(" is invalid.  Please see the docs.");
	//   10   18:aload_2         
	//   11   19:ldc1            #123 <String " is invalid.  Please see the docs.">
	//   12   21:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			Log.e("paypal.sdk", stringbuilder.toString());
	//   14   25:ldc1            #125 <String "paypal.sdk">
	//   15   27:aload_2         
	//   16   28:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   17   31:invokestatic    #131 <Method int Log.e(String, String)>
	//   18   34:pop             
		}
	//   19   35:return          
	}

	private static boolean a(String s, String s1, int i1)
	{
		if(cd.b(((CharSequence) (s))) && s.length() > i1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #137 <Method boolean cd.b(CharSequence)>
	//*   2    4:ifeq            61
	//*   3    7:aload_0         
	//*   4    8:invokevirtual   #142 <Method int String.length()>
	//*   5   11:iload_2         
	//*   6   12:icmple          61
		{
			s = ((String) (new StringBuilder()));
	//    7   15:new             #116 <Class StringBuilder>
	//    8   18:dup             
	//    9   19:invokespecial   #117 <Method void StringBuilder()>
	//   10   22:astore_0        
			((StringBuilder) (s)).append(s1);
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   14   28:pop             
			((StringBuilder) (s)).append(" is too long (max ");
	//   15   29:aload_0         
	//   16   30:ldc1            #144 <String " is too long (max ">
	//   17   32:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			((StringBuilder) (s)).append(i1);
	//   19   36:aload_0         
	//   20   37:iload_2         
	//   21   38:invokevirtual   #147 <Method StringBuilder StringBuilder.append(int)>
	//   22   41:pop             
			((StringBuilder) (s)).append(")");
	//   23   42:aload_0         
	//   24   43:ldc1            #149 <String ")">
	//   25   45:invokevirtual   #121 <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
			Log.e("paypal.sdk", ((StringBuilder) (s)).toString());
	//   27   49:ldc1            #125 <String "paypal.sdk">
	//   28   51:aload_0         
	//   29   52:invokevirtual   #126 <Method String StringBuilder.toString()>
	//   30   55:invokestatic    #131 <Method int Log.e(String, String)>
	//   31   58:pop             
			return false;
	//   32   59:iconst_0        
	//   33   60:ireturn         
		} else
		{
			return true;
	//   34   61:iconst_1        
	//   35   62:ireturn         
		}
	}

	public final boolean a()
	{
		return !i && j == null;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field boolean i>
	//    2    4:ifne            16
	//    3    7:aload_0         
	//    4    8:getfield        #96  <Field ShippingAddress j>
	//    5   11:ifnonnull       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final boolean b()
	{
		boolean flag1;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		boolean flag5;
		boolean flag6;
		boolean flag7;
label0:
		{
			flag5 = dj.a(c);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String c>
	//    2    4:invokestatic    #155 <Method boolean dj.a(String)>
	//    3    7:istore          8
			flag6 = dj.a(b, c, true);
	//    4    9:aload_0         
	//    5   10:getfield        #59  <Field BigDecimal b>
	//    6   13:aload_0         
	//    7   14:getfield        #52  <Field String c>
	//    8   17:iconst_1        
	//    9   18:invokestatic    #158 <Method boolean dj.a(BigDecimal, String, boolean)>
	//   10   21:istore          9
			flag7 = TextUtils.isEmpty(((CharSequence) (d))) ^ true;
	//   11   23:aload_0         
	//   12   24:getfield        #61  <Field String d>
	//   13   27:invokestatic    #163 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   14   30:iconst_1        
	//   15   31:ixor            
	//   16   32:istore          10
			if(cd.b(((CharSequence) (g))) && (g.equals("sale") || g.equals("authorize") || g.equals("order")))
	//*  17   34:aload_0         
	//*  18   35:getfield        #63  <Field String g>
	//*  19   38:invokestatic    #137 <Method boolean cd.b(CharSequence)>
	//*  20   41:ifeq            86
	//*  21   44:aload_0         
	//*  22   45:getfield        #63  <Field String g>
	//*  23   48:ldc1            #165 <String "sale">
	//*  24   50:invokevirtual   #169 <Method boolean String.equals(Object)>
	//*  25   53:ifne            80
	//*  26   56:aload_0         
	//*  27   57:getfield        #63  <Field String g>
	//*  28   60:ldc1            #171 <String "authorize">
	//*  29   62:invokevirtual   #169 <Method boolean String.equals(Object)>
	//*  30   65:ifne            80
	//*  31   68:aload_0         
	//*  32   69:getfield        #63  <Field String g>
	//*  33   72:ldc1            #173 <String "order">
	//*  34   74:invokevirtual   #169 <Method boolean String.equals(Object)>
	//*  35   77:ifeq            86
				flag1 = true;
	//   36   80:iconst_1        
	//   37   81:istore          4
			else
	//*  38   83:goto            89
				flag1 = false;
	//   39   86:iconst_0        
	//   40   87:istore          4
			PayPalPaymentDetails paypalpaymentdetails = f;
	//   41   89:aload_0         
	//   42   90:getfield        #79  <Field PayPalPaymentDetails f>
	//   43   93:astore          11
			if(paypalpaymentdetails == null)
	//*  44   95:aload           11
	//*  45   97:ifnonnull       106
				flag2 = true;
	//   46  100:iconst_1        
	//   47  101:istore          5
			else
	//*  48  103:goto            113
				flag2 = paypalpaymentdetails.a();
	//   49  106:aload           11
	//   50  108:invokevirtual   #175 <Method boolean PayPalPaymentDetails.a()>
	//   51  111:istore          5
			if(cd.a(((CharSequence) (e))))
	//*  52  113:aload_0         
	//*  53  114:getfield        #65  <Field String e>
	//*  54  117:invokestatic    #177 <Method boolean cd.a(CharSequence)>
	//*  55  120:ifeq            129
				flag3 = true;
	//   56  123:iconst_1        
	//   57  124:istore          6
			else
	//*  58  126:goto            138
				flag3 = cd.c(e);
	//   59  129:aload_0         
	//   60  130:getfield        #65  <Field String e>
	//   61  133:invokestatic    #179 <Method boolean cd.c(String)>
	//   62  136:istore          6
			PayPalItem apaypalitem[] = h;
	//   63  138:aload_0         
	//   64  139:getfield        #87  <Field PayPalItem[] h>
	//   65  142:astore          11
			if(apaypalitem != null && apaypalitem.length != 0)
	//*  66  144:aload           11
	//*  67  146:ifnull          192
	//*  68  149:aload           11
	//*  69  151:arraylength     
	//*  70  152:ifne            158
	//*  71  155:goto            192
			{
				int j1 = apaypalitem.length;
	//   72  158:aload           11
	//   73  160:arraylength     
	//   74  161:istore_2        
				int i1 = 0;
	//   75  162:iconst_0        
	//   76  163:istore_1        
				do
				{
					if(i1 >= j1)
						break;
	//   77  164:iload_1         
	//   78  165:iload_2         
	//   79  166:icmpge          192
					if(!apaypalitem[i1].a())
	//*  80  169:aload           11
	//*  81  171:iload_1         
	//*  82  172:aaload          
	//*  83  173:invokevirtual   #180 <Method boolean PayPalItem.a()>
	//*  84  176:ifne            185
					{
						flag4 = false;
	//   85  179:iconst_0        
	//   86  180:istore          7
						break label0;
	//   87  182:goto            195
					}
					i1++;
	//   88  185:iload_1         
	//   89  186:iconst_1        
	//   90  187:iadd            
	//   91  188:istore_1        
				} while(true);
	//   92  189:goto            164
			}
			flag4 = true;
	//   93  192:iconst_1        
	//   94  193:istore          7
		}
		boolean flag = a(k, "invoiceNumber", 256);
	//   95  195:aload_0         
	//   96  196:getfield        #100 <Field String k>
	//   97  199:ldc1            #182 <String "invoiceNumber">
	//   98  201:sipush          256
	//   99  204:invokestatic    #184 <Method boolean a(String, String, int)>
	//  100  207:istore_3        
		if(!a(l, "custom", 256))
	//* 101  208:aload_0         
	//* 102  209:getfield        #102 <Field String l>
	//* 103  212:ldc1            #186 <String "custom">
	//* 104  214:sipush          256
	//* 105  217:invokestatic    #184 <Method boolean a(String, String, int)>
	//* 106  220:ifne            225
			flag = false;
	//  107  223:iconst_0        
	//  108  224:istore_3        
		if(!a(m, "softDescriptor", 22))
	//* 109  225:aload_0         
	//* 110  226:getfield        #104 <Field String m>
	//* 111  229:ldc1            #188 <String "softDescriptor">
	//* 112  231:bipush          22
	//* 113  233:invokestatic    #184 <Method boolean a(String, String, int)>
	//* 114  236:ifne            241
			flag = false;
	//  115  239:iconst_0        
	//  116  240:istore_3        
		a(flag5, "currencyCode");
	//  117  241:iload           8
	//  118  243:ldc1            #190 <String "currencyCode">
	//  119  245:invokestatic    #192 <Method void a(boolean, String)>
		a(flag6, "amount");
	//  120  248:iload           9
	//  121  250:ldc1            #194 <String "amount">
	//  122  252:invokestatic    #192 <Method void a(boolean, String)>
		a(flag7, "shortDescription");
	//  123  255:iload           10
	//  124  257:ldc1            #196 <String "shortDescription">
	//  125  259:invokestatic    #192 <Method void a(boolean, String)>
		a(flag1, "paymentIntent");
	//  126  262:iload           4
	//  127  264:ldc1            #198 <String "paymentIntent">
	//  128  266:invokestatic    #192 <Method void a(boolean, String)>
		a(flag2, "details");
	//  129  269:iload           5
	//  130  271:ldc1            #200 <String "details">
	//  131  273:invokestatic    #192 <Method void a(boolean, String)>
		a(flag3, "bnCode");
	//  132  276:iload           6
	//  133  278:ldc1            #202 <String "bnCode">
	//  134  280:invokestatic    #192 <Method void a(boolean, String)>
		a(flag4, "items");
	//  135  283:iload           7
	//  136  285:ldc1            #204 <String "items">
	//  137  287:invokestatic    #192 <Method void a(boolean, String)>
		return flag5 && flag6 && flag7 && flag2 && flag1 && flag3 && flag4 && flag;
	//  138  290:iload           8
	//  139  292:ifeq            331
	//  140  295:iload           9
	//  141  297:ifeq            331
	//  142  300:iload           10
	//  143  302:ifeq            331
	//  144  305:iload           5
	//  145  307:ifeq            331
	//  146  310:iload           4
	//  147  312:ifeq            331
	//  148  315:iload           6
	//  149  317:ifeq            331
	//  150  320:iload           7
	//  151  322:ifeq            331
	//  152  325:iload_3         
	//  153  326:ifeq            331
	//  154  329:iconst_1        
	//  155  330:ireturn         
	//  156  331:iconst_0        
	//  157  332:ireturn         
	}

	protected final BigDecimal c()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field BigDecimal b>
	//    2    4:areturn         
	}

	protected final String d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String d>
	//    2    4:areturn         
	}

	public final int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected final String e()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String g>
	//    2    4:areturn         
	}

	protected final String f()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String c>
	//    2    4:areturn         
	}

	protected final String g()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String e>
	//    2    4:areturn         
	}

	protected final String h()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field String n>
	//    2    4:areturn         
	}

	protected final PayPalPaymentDetails i()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field PayPalPaymentDetails f>
	//    2    4:areturn         
	}

	protected final PayPalItem[] j()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field PayPalItem[] h>
	//    2    4:areturn         
	}

	protected final String k()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field String k>
	//    2    4:areturn         
	}

	protected final String l()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field String l>
	//    2    4:areturn         
	}

	protected final String m()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field String m>
	//    2    4:areturn         
	}

	public final boolean n()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field boolean i>
	//    2    4:ireturn         
	}

	public final ShippingAddress o()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field ShippingAddress j>
	//    2    4:areturn         
	}

	public final String toString()
	{
		String s = d;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String d>
	//    2    4:astore_2        
		Object obj = ((Object) (b));
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field BigDecimal b>
	//    5    9:astore_1        
		if(obj != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          22
			obj = ((Object) (((BigDecimal) (obj)).toString()));
	//    8   14:aload_1         
	//    9   15:invokevirtual   #211 <Method String BigDecimal.toString()>
	//   10   18:astore_1        
		else
	//*  11   19:goto            24
			obj = null;
	//   12   22:aconst_null     
	//   13   23:astore_1        
		return String.format("PayPalPayment: {%s: $%s %s, %s}", new Object[] {
			s, obj, c, g
		});
	//   14   24:ldc1            #213 <String "PayPalPayment: {%s: $%s %s, %s}">
	//   15   26:iconst_4        
	//   16   27:anewarray       Object[]
	//   17   30:dup             
	//   18   31:iconst_0        
	//   19   32:aload_2         
	//   20   33:aastore         
	//   21   34:dup             
	//   22   35:iconst_1        
	//   23   36:aload_1         
	//   24   37:aastore         
	//   25   38:dup             
	//   26   39:iconst_2        
	//   27   40:aload_0         
	//   28   41:getfield        #52  <Field String c>
	//   29   44:aastore         
	//   30   45:dup             
	//   31   46:iconst_3        
	//   32   47:aload_0         
	//   33   48:getfield        #63  <Field String g>
	//   34   51:aastore         
	//   35   52:invokestatic    #217 <Method String String.format(String, Object[])>
	//   36   55:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #221 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #223 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #226 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new as();
	private static final String a = "PayPalPayment";
	private BigDecimal b;
	private String c;
	private String d;
	private String e;
	private PayPalPaymentDetails f;
	private String g;
	private PayPalItem h[];
	private boolean i;
	private ShippingAddress j;
	private String k;
	private String l;
	private String m;
	private String n;

	static 
	{
	//    0    0:new             #34  <Class as>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void as()>
	//    3    7:putstatic       #39  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
