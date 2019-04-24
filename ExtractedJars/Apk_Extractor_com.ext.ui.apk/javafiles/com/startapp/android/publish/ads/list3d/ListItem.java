// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.list3d;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.startapp.android.publish.common.model.AdDetails;

public class ListItem
	implements Parcelable
{

	public ListItem(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #47  <String "">
	//    4    7:putfield        #49  <Field String a>
		b = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #47  <String "">
	//    7   13:putfield        #51  <Field String b>
		c = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #47  <String "">
	//   10   19:putfield        #53  <Field String c>
		d = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #47  <String "">
	//   13   25:putfield        #55  <Field String d>
		e = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #47  <String "">
	//   16   31:putfield        #57  <Field String e>
		f = "";
	//   17   34:aload_0         
	//   18   35:ldc1            #47  <String "">
	//   19   37:putfield        #59  <Field String f>
		g = "";
	//   20   40:aload_0         
	//   21   41:ldc1            #47  <String "">
	//   22   43:putfield        #61  <Field String g>
		h = "";
	//   23   46:aload_0         
	//   24   47:ldc1            #47  <String "">
	//   25   49:putfield        #63  <Field String h>
		i = "";
	//   26   52:aload_0         
	//   27   53:ldc1            #47  <String "">
	//   28   55:putfield        #65  <Field String i>
		j = 0.0F;
	//   29   58:aload_0         
	//   30   59:fconst_0        
	//   31   60:putfield        #67  <Field float j>
		k = false;
	//   32   63:aload_0         
	//   33   64:iconst_0        
	//   34   65:putfield        #69  <Field boolean k>
		l = true;
	//   35   68:aload_0         
	//   36   69:iconst_1        
	//   37   70:putfield        #71  <Field boolean l>
		m = null;
	//   38   73:aload_0         
	//   39   74:aconst_null     
	//   40   75:putfield        #73  <Field Drawable m>
		q = null;
	//   41   78:aload_0         
	//   42   79:aconst_null     
	//   43   80:putfield        #75  <Field Boolean q>
		r = "";
	//   44   83:aload_0         
	//   45   84:ldc1            #47  <String "">
	//   46   86:putfield        #77  <Field String r>
		int i1;
		if(parcel.readInt() == 1)
	//*  47   89:aload_1         
	//*  48   90:invokevirtual   #83  <Method int Parcel.readInt()>
	//*  49   93:iconst_1        
	//*  50   94:icmpne          294
			m = ((Drawable) (new BitmapDrawable((Bitmap)Bitmap.CREATOR.createFromParcel(parcel))));
	//   51   97:aload_0         
	//   52   98:new             #85  <Class BitmapDrawable>
	//   53  101:dup             
	//   54  102:getstatic       #88  <Field android.os.Parcelable$Creator Bitmap.CREATOR>
	//   55  105:aload_1         
	//   56  106:invokeinterface #94  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   57  111:checkcast       #87  <Class Bitmap>
	//   58  114:invokespecial   #97  <Method void BitmapDrawable(Bitmap)>
	//   59  117:putfield        #73  <Field Drawable m>
		else
	//*  60  120:aload_0         
	//*  61  121:aload_1         
	//*  62  122:invokevirtual   #101 <Method String Parcel.readString()>
	//*  63  125:putfield        #49  <Field String a>
	//*  64  128:aload_0         
	//*  65  129:aload_1         
	//*  66  130:invokevirtual   #101 <Method String Parcel.readString()>
	//*  67  133:putfield        #51  <Field String b>
	//*  68  136:aload_0         
	//*  69  137:aload_1         
	//*  70  138:invokevirtual   #101 <Method String Parcel.readString()>
	//*  71  141:putfield        #53  <Field String c>
	//*  72  144:aload_0         
	//*  73  145:aload_1         
	//*  74  146:invokevirtual   #101 <Method String Parcel.readString()>
	//*  75  149:putfield        #55  <Field String d>
	//*  76  152:aload_0         
	//*  77  153:aload_1         
	//*  78  154:invokevirtual   #101 <Method String Parcel.readString()>
	//*  79  157:putfield        #57  <Field String e>
	//*  80  160:aload_0         
	//*  81  161:aload_1         
	//*  82  162:invokevirtual   #101 <Method String Parcel.readString()>
	//*  83  165:putfield        #59  <Field String f>
	//*  84  168:aload_0         
	//*  85  169:aload_1         
	//*  86  170:invokevirtual   #101 <Method String Parcel.readString()>
	//*  87  173:putfield        #61  <Field String g>
	//*  88  176:aload_0         
	//*  89  177:aload_1         
	//*  90  178:invokevirtual   #101 <Method String Parcel.readString()>
	//*  91  181:putfield        #63  <Field String h>
	//*  92  184:aload_0         
	//*  93  185:aload_1         
	//*  94  186:invokevirtual   #101 <Method String Parcel.readString()>
	//*  95  189:putfield        #65  <Field String i>
	//*  96  192:aload_0         
	//*  97  193:aload_1         
	//*  98  194:invokevirtual   #105 <Method float Parcel.readFloat()>
	//*  99  197:putfield        #67  <Field float j>
	//* 100  200:aload_1         
	//* 101  201:invokevirtual   #83  <Method int Parcel.readInt()>
	//* 102  204:iconst_1        
	//* 103  205:icmpne          302
	//* 104  208:aload_0         
	//* 105  209:iconst_1        
	//* 106  210:putfield        #69  <Field boolean k>
	//* 107  213:aload_1         
	//* 108  214:invokevirtual   #83  <Method int Parcel.readInt()>
	//* 109  217:ifne            310
	//* 110  220:aload_0         
	//* 111  221:iconst_0        
	//* 112  222:putfield        #71  <Field boolean l>
	//* 113  225:aload_0         
	//* 114  226:aload_1         
	//* 115  227:invokevirtual   #101 <Method String Parcel.readString()>
	//* 116  230:putfield        #77  <Field String r>
	//* 117  233:aload_0         
	//* 118  234:aload_1         
	//* 119  235:invokevirtual   #101 <Method String Parcel.readString()>
	//* 120  238:putfield        #107 <Field String o>
	//* 121  241:aload_0         
	//* 122  242:aload_1         
	//* 123  243:invokevirtual   #101 <Method String Parcel.readString()>
	//* 124  246:putfield        #109 <Field String n>
	//* 125  249:aload_0         
	//* 126  250:aload_1         
	//* 127  251:invokevirtual   #113 <Method long Parcel.readLong()>
	//* 128  254:invokestatic    #119 <Method Long Long.valueOf(long)>
	//* 129  257:putfield        #121 <Field Long p>
	//* 130  260:aload_0         
	//* 131  261:getfield        #121 <Field Long p>
	//* 132  264:invokevirtual   #124 <Method long Long.longValue()>
	//* 133  267:ldc2w           #125 <Long -1L>
	//* 134  270:lcmp            
	//* 135  271:ifne            279
	//* 136  274:aload_0         
	//* 137  275:aconst_null     
	//* 138  276:putfield        #121 <Field Long p>
	//* 139  279:aload_1         
	//* 140  280:invokevirtual   #83  <Method int Parcel.readInt()>
	//* 141  283:istore_2        
	//* 142  284:iload_2         
	//* 143  285:ifne            318
	//* 144  288:aload_0         
	//* 145  289:aconst_null     
	//* 146  290:putfield        #75  <Field Boolean q>
	//* 147  293:return          
			m = null;
	//  148  294:aload_0         
	//  149  295:aconst_null     
	//  150  296:putfield        #73  <Field Drawable m>
		a = parcel.readString();
		b = parcel.readString();
		c = parcel.readString();
		d = parcel.readString();
		e = parcel.readString();
		f = parcel.readString();
		g = parcel.readString();
		h = parcel.readString();
		i = parcel.readString();
		j = parcel.readFloat();
		if(parcel.readInt() == 1)
			k = true;
		else
	//* 151  299:goto            120
			k = false;
	//  152  302:aload_0         
	//  153  303:iconst_0        
	//  154  304:putfield        #69  <Field boolean k>
		if(parcel.readInt() == 0)
			l = false;
		else
	//* 155  307:goto            213
			l = true;
	//  156  310:aload_0         
	//  157  311:iconst_1        
	//  158  312:putfield        #71  <Field boolean l>
		r = parcel.readString();
		o = parcel.readString();
		n = parcel.readString();
		p = Long.valueOf(parcel.readLong());
		if(p.longValue() == -1L)
			p = null;
		i1 = parcel.readInt();
		if(i1 == 0)
		{
			q = null;
			return;
		}
	//* 159  315:goto            225
		boolean flag;
		if(i1 == 1)
	//* 160  318:iload_2         
	//* 161  319:iconst_1        
	//* 162  320:icmpne          334
			flag = true;
	//  163  323:iconst_1        
	//  164  324:istore_3        
		else
	//* 165  325:aload_0         
	//* 166  326:iload_3         
	//* 167  327:invokestatic    #131 <Method Boolean Boolean.valueOf(boolean)>
	//* 168  330:putfield        #75  <Field Boolean q>
	//* 169  333:return          
			flag = false;
	//  170  334:iconst_0        
	//  171  335:istore_3        
		q = Boolean.valueOf(flag);
	//* 172  336:goto            325
	}

	public ListItem(AdDetails addetails)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		a = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #47  <String "">
	//    4    7:putfield        #49  <Field String a>
		b = "";
	//    5   10:aload_0         
	//    6   11:ldc1            #47  <String "">
	//    7   13:putfield        #51  <Field String b>
		c = "";
	//    8   16:aload_0         
	//    9   17:ldc1            #47  <String "">
	//   10   19:putfield        #53  <Field String c>
		d = "";
	//   11   22:aload_0         
	//   12   23:ldc1            #47  <String "">
	//   13   25:putfield        #55  <Field String d>
		e = "";
	//   14   28:aload_0         
	//   15   29:ldc1            #47  <String "">
	//   16   31:putfield        #57  <Field String e>
		f = "";
	//   17   34:aload_0         
	//   18   35:ldc1            #47  <String "">
	//   19   37:putfield        #59  <Field String f>
		g = "";
	//   20   40:aload_0         
	//   21   41:ldc1            #47  <String "">
	//   22   43:putfield        #61  <Field String g>
		h = "";
	//   23   46:aload_0         
	//   24   47:ldc1            #47  <String "">
	//   25   49:putfield        #63  <Field String h>
		i = "";
	//   26   52:aload_0         
	//   27   53:ldc1            #47  <String "">
	//   28   55:putfield        #65  <Field String i>
		j = 0.0F;
	//   29   58:aload_0         
	//   30   59:fconst_0        
	//   31   60:putfield        #67  <Field float j>
		k = false;
	//   32   63:aload_0         
	//   33   64:iconst_0        
	//   34   65:putfield        #69  <Field boolean k>
		l = true;
	//   35   68:aload_0         
	//   36   69:iconst_1        
	//   37   70:putfield        #71  <Field boolean l>
		m = null;
	//   38   73:aload_0         
	//   39   74:aconst_null     
	//   40   75:putfield        #73  <Field Drawable m>
		q = null;
	//   41   78:aload_0         
	//   42   79:aconst_null     
	//   43   80:putfield        #75  <Field Boolean q>
		r = "";
	//   44   83:aload_0         
	//   45   84:ldc1            #47  <String "">
	//   46   86:putfield        #77  <Field String r>
		a = addetails.getAdId();
	//   47   89:aload_0         
	//   48   90:aload_1         
	//   49   91:invokevirtual   #137 <Method String AdDetails.getAdId()>
	//   50   94:putfield        #49  <Field String a>
		b = addetails.getClickUrl();
	//   51   97:aload_0         
	//   52   98:aload_1         
	//   53   99:invokevirtual   #140 <Method String AdDetails.getClickUrl()>
	//   54  102:putfield        #51  <Field String b>
		c = addetails.getTrackingUrl();
	//   55  105:aload_0         
	//   56  106:aload_1         
	//   57  107:invokevirtual   #143 <Method String AdDetails.getTrackingUrl()>
	//   58  110:putfield        #53  <Field String c>
		d = addetails.getTrackingClickUrl();
	//   59  113:aload_0         
	//   60  114:aload_1         
	//   61  115:invokevirtual   #146 <Method String AdDetails.getTrackingClickUrl()>
	//   62  118:putfield        #55  <Field String d>
		e = addetails.getTrackingCloseUrl();
	//   63  121:aload_0         
	//   64  122:aload_1         
	//   65  123:invokevirtual   #149 <Method String AdDetails.getTrackingCloseUrl()>
	//   66  126:putfield        #57  <Field String e>
		f = addetails.getPackageName();
	//   67  129:aload_0         
	//   68  130:aload_1         
	//   69  131:invokevirtual   #152 <Method String AdDetails.getPackageName()>
	//   70  134:putfield        #59  <Field String f>
		g = addetails.getTitle();
	//   71  137:aload_0         
	//   72  138:aload_1         
	//   73  139:invokevirtual   #155 <Method String AdDetails.getTitle()>
	//   74  142:putfield        #61  <Field String g>
		h = addetails.getDescription();
	//   75  145:aload_0         
	//   76  146:aload_1         
	//   77  147:invokevirtual   #158 <Method String AdDetails.getDescription()>
	//   78  150:putfield        #63  <Field String h>
		i = addetails.getImageUrl();
	//   79  153:aload_0         
	//   80  154:aload_1         
	//   81  155:invokevirtual   #161 <Method String AdDetails.getImageUrl()>
	//   82  158:putfield        #65  <Field String i>
		j = addetails.getRating();
	//   83  161:aload_0         
	//   84  162:aload_1         
	//   85  163:invokevirtual   #164 <Method float AdDetails.getRating()>
	//   86  166:putfield        #67  <Field float j>
		k = addetails.isSmartRedirect();
	//   87  169:aload_0         
	//   88  170:aload_1         
	//   89  171:invokevirtual   #168 <Method boolean AdDetails.isSmartRedirect()>
	//   90  174:putfield        #69  <Field boolean k>
		l = addetails.isStartappBrowserEnabled();
	//   91  177:aload_0         
	//   92  178:aload_1         
	//   93  179:invokevirtual   #171 <Method boolean AdDetails.isStartappBrowserEnabled()>
	//   94  182:putfield        #71  <Field boolean l>
		m = null;
	//   95  185:aload_0         
	//   96  186:aconst_null     
	//   97  187:putfield        #73  <Field Drawable m>
		r = addetails.getTemplate();
	//   98  190:aload_0         
	//   99  191:aload_1         
	//  100  192:invokevirtual   #174 <Method String AdDetails.getTemplate()>
	//  101  195:putfield        #77  <Field String r>
		n = addetails.getIntentDetails();
	//  102  198:aload_0         
	//  103  199:aload_1         
	//  104  200:invokevirtual   #177 <Method String AdDetails.getIntentDetails()>
	//  105  203:putfield        #109 <Field String n>
		o = addetails.getIntentPackageName();
	//  106  206:aload_0         
	//  107  207:aload_1         
	//  108  208:invokevirtual   #180 <Method String AdDetails.getIntentPackageName()>
	//  109  211:putfield        #107 <Field String o>
		p = addetails.getDelayImpressionInSeconds();
	//  110  214:aload_0         
	//  111  215:aload_1         
	//  112  216:invokevirtual   #184 <Method Long AdDetails.getDelayImpressionInSeconds()>
	//  113  219:putfield        #121 <Field Long p>
		q = addetails.shouldSendRedirectHops();
	//  114  222:aload_0         
	//  115  223:aload_1         
	//  116  224:invokevirtual   #188 <Method Boolean AdDetails.shouldSendRedirectHops()>
	//  117  227:putfield        #75  <Field Boolean q>
	//  118  230:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field String b>
	//    2    4:areturn         
	}

	public String c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String c>
	//    2    4:areturn         
	}

	public String d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String e>
	//    2    4:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String e()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String d>
	//    2    4:areturn         
	}

	public String f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String f>
	//    2    4:areturn         
	}

	public String g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String g>
	//    2    4:areturn         
	}

	public String h()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String h>
	//    2    4:areturn         
	}

	public String i()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String i>
	//    2    4:areturn         
	}

	public Drawable j()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Drawable m>
	//    2    4:areturn         
	}

	public float k()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field float j>
	//    2    4:freturn         
	}

	public boolean l()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean k>
	//    2    4:ireturn         
	}

	public boolean m()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean l>
	//    2    4:ireturn         
	}

	public String n()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String r>
	//    2    4:areturn         
	}

	public String o()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field String n>
	//    2    4:areturn         
	}

	public String p()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field String o>
	//    2    4:areturn         
	}

	public boolean q()
	{
		return o != null;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field String o>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public Long r()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field Long p>
	//    2    4:areturn         
	}

	public Boolean s()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Boolean q>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		if(j() != null)
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #195 <Method Drawable j()>
	//*   4    6:ifnull          188
		{
			parcel.writeParcelable(((Parcelable) (((BitmapDrawable)j()).getBitmap())), i1);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #195 <Method Drawable j()>
	//    8   14:checkcast       #85  <Class BitmapDrawable>
	//    9   17:invokevirtual   #199 <Method Bitmap BitmapDrawable.getBitmap()>
	//   10   20:iload_2         
	//   11   21:invokevirtual   #203 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeInt(1);
	//   12   24:aload_1         
	//   13   25:iconst_1        
	//   14   26:invokevirtual   #207 <Method void Parcel.writeInt(int)>
		} else
	//*  15   29:aload_1         
	//*  16   30:aload_0         
	//*  17   31:getfield        #49  <Field String a>
	//*  18   34:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  19   37:aload_1         
	//*  20   38:aload_0         
	//*  21   39:getfield        #51  <Field String b>
	//*  22   42:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  23   45:aload_1         
	//*  24   46:aload_0         
	//*  25   47:getfield        #53  <Field String c>
	//*  26   50:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  27   53:aload_1         
	//*  28   54:aload_0         
	//*  29   55:getfield        #55  <Field String d>
	//*  30   58:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  31   61:aload_1         
	//*  32   62:aload_0         
	//*  33   63:getfield        #57  <Field String e>
	//*  34   66:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  35   69:aload_1         
	//*  36   70:aload_0         
	//*  37   71:getfield        #59  <Field String f>
	//*  38   74:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  39   77:aload_1         
	//*  40   78:aload_0         
	//*  41   79:getfield        #61  <Field String g>
	//*  42   82:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  43   85:aload_1         
	//*  44   86:aload_0         
	//*  45   87:getfield        #63  <Field String h>
	//*  46   90:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  47   93:aload_1         
	//*  48   94:aload_0         
	//*  49   95:getfield        #65  <Field String i>
	//*  50   98:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  51  101:aload_1         
	//*  52  102:aload_0         
	//*  53  103:getfield        #67  <Field float j>
	//*  54  106:invokevirtual   #215 <Method void Parcel.writeFloat(float)>
	//*  55  109:aload_0         
	//*  56  110:getfield        #69  <Field boolean k>
	//*  57  113:ifeq            238
	//*  58  116:iconst_1        
	//*  59  117:istore_2        
	//*  60  118:aload_1         
	//*  61  119:iload_2         
	//*  62  120:invokevirtual   #207 <Method void Parcel.writeInt(int)>
	//*  63  123:aload_0         
	//*  64  124:getfield        #71  <Field boolean l>
	//*  65  127:ifne            233
	//*  66  130:iconst_0        
	//*  67  131:istore_2        
	//*  68  132:aload_1         
	//*  69  133:iload_2         
	//*  70  134:invokevirtual   #207 <Method void Parcel.writeInt(int)>
	//*  71  137:aload_1         
	//*  72  138:aload_0         
	//*  73  139:getfield        #77  <Field String r>
	//*  74  142:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  75  145:aload_1         
	//*  76  146:aload_0         
	//*  77  147:getfield        #107 <Field String o>
	//*  78  150:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  79  153:aload_1         
	//*  80  154:aload_0         
	//*  81  155:getfield        #109 <Field String n>
	//*  82  158:invokevirtual   #211 <Method void Parcel.writeString(String)>
	//*  83  161:aload_0         
	//*  84  162:getfield        #121 <Field Long p>
	//*  85  165:ifnonnull       196
	//*  86  168:aload_1         
	//*  87  169:ldc2w           #125 <Long -1L>
	//*  88  172:invokevirtual   #219 <Method void Parcel.writeLong(long)>
	//*  89  175:aload_0         
	//*  90  176:getfield        #75  <Field Boolean q>
	//*  91  179:ifnonnull       210
	//*  92  182:aload_1         
	//*  93  183:iconst_0        
	//*  94  184:invokevirtual   #207 <Method void Parcel.writeInt(int)>
	//*  95  187:return          
		{
			parcel.writeInt(0);
	//   96  188:aload_1         
	//   97  189:iconst_0        
	//   98  190:invokevirtual   #207 <Method void Parcel.writeInt(int)>
		}
		parcel.writeString(a);
		parcel.writeString(b);
		parcel.writeString(c);
		parcel.writeString(d);
		parcel.writeString(e);
		parcel.writeString(f);
		parcel.writeString(g);
		parcel.writeString(h);
		parcel.writeString(i);
		parcel.writeFloat(j);
		if(k)
			i1 = 1;
		else
	//*  99  193:goto            29
	//* 100  196:aload_1         
	//* 101  197:aload_0         
	//* 102  198:getfield        #121 <Field Long p>
	//* 103  201:invokevirtual   #124 <Method long Long.longValue()>
	//* 104  204:invokevirtual   #219 <Method void Parcel.writeLong(long)>
	//* 105  207:goto            175
	//* 106  210:aload_0         
	//* 107  211:getfield        #75  <Field Boolean q>
	//* 108  214:invokevirtual   #222 <Method boolean Boolean.booleanValue()>
	//* 109  217:ifeq            228
	//* 110  220:iload_3         
	//* 111  221:istore_2        
	//* 112  222:aload_1         
	//* 113  223:iload_2         
	//* 114  224:invokevirtual   #207 <Method void Parcel.writeInt(int)>
	//* 115  227:return          
	//* 116  228:iconst_m1       
	//* 117  229:istore_2        
	//* 118  230:goto            222
	//* 119  233:iconst_1        
	//* 120  234:istore_2        
	//* 121  235:goto            132
			i1 = 0;
	//  122  238:iconst_0        
	//  123  239:istore_2        
		parcel.writeInt(i1);
		if(!l)
			i1 = 0;
		else
			i1 = 1;
		parcel.writeInt(i1);
		parcel.writeString(r);
		parcel.writeString(o);
		parcel.writeString(n);
		if(p == null)
			parcel.writeLong(-1L);
		else
			parcel.writeLong(p.longValue());
		if(q == null)
		{
			parcel.writeInt(0);
			return;
		}
		if(q.booleanValue())
			i1 = ((int) (flag));
		else
			i1 = -1;
		parcel.writeInt(i1);
	//* 124  240:goto            118
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public ListItem a(Parcel parcel)
		{
			return new ListItem(parcel);
		//    0    0:new             #9   <Class ListItem>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void ListItem(Parcel)>
		//    4    8:areturn         
		}

		public ListItem[] a(int i1)
		{
			return new ListItem[i1];
		//    0    0:iload_1         
		//    1    1:anewarray       ListItem[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method ListItem a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i1)
		{
			return ((Object []) (a(i1)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method ListItem[] a(int)>
		//    3    5:areturn         
		}

	}
;
	private String a;
	private String b;
	private String c;
	private String d;
	private String e;
	private String f;
	private String g;
	private String h;
	private String i;
	private float j;
	private boolean k;
	private boolean l;
	private Drawable m;
	private String n;
	private String o;
	private Long p;
	private Boolean q;
	private String r;

	static 
	{
	//    0    0:new             #8   <Class ListItem$1>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void ListItem$1()>
	//    3    7:putstatic       #42  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
