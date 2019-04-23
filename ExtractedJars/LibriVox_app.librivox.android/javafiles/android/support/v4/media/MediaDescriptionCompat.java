// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.*;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media:
//			ce, cf, cg, ci, 
//			ch, cj

public final class MediaDescriptionCompat
	implements Parcelable
{

	MediaDescriptionCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #41  <Method String Parcel.readString()>
	//    5    9:putfield        #43  <Field String a>
		b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #48  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #54  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #56  <Class CharSequence>
	//   11   25:putfield        #58  <Field CharSequence b>
		c = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   12   28:aload_0         
	//   13   29:getstatic       #48  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   14   32:aload_1         
	//   15   33:invokeinterface #54  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   16   38:checkcast       #56  <Class CharSequence>
	//   17   41:putfield        #60  <Field CharSequence c>
		d = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   18   44:aload_0         
	//   19   45:getstatic       #48  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   20   48:aload_1         
	//   21   49:invokeinterface #54  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   22   54:checkcast       #56  <Class CharSequence>
	//   23   57:putfield        #62  <Field CharSequence d>
		ClassLoader classloader = ((Object)this).getClass().getClassLoader();
	//   24   60:aload_0         
	//   25   61:invokevirtual   #66  <Method Class Object.getClass()>
	//   26   64:invokevirtual   #72  <Method ClassLoader Class.getClassLoader()>
	//   27   67:astore_2        
		e = (Bitmap)parcel.readParcelable(classloader);
	//   28   68:aload_0         
	//   29   69:aload_1         
	//   30   70:aload_2         
	//   31   71:invokevirtual   #76  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   32   74:checkcast       #78  <Class Bitmap>
	//   33   77:putfield        #80  <Field Bitmap e>
		f = (Uri)parcel.readParcelable(classloader);
	//   34   80:aload_0         
	//   35   81:aload_1         
	//   36   82:aload_2         
	//   37   83:invokevirtual   #76  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   38   86:checkcast       #82  <Class Uri>
	//   39   89:putfield        #84  <Field Uri f>
		g = parcel.readBundle(classloader);
	//   40   92:aload_0         
	//   41   93:aload_1         
	//   42   94:aload_2         
	//   43   95:invokevirtual   #88  <Method Bundle Parcel.readBundle(ClassLoader)>
	//   44   98:putfield        #90  <Field Bundle g>
		h = (Uri)parcel.readParcelable(classloader);
	//   45  101:aload_0         
	//   46  102:aload_1         
	//   47  103:aload_2         
	//   48  104:invokevirtual   #76  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   49  107:checkcast       #82  <Class Uri>
	//   50  110:putfield        #92  <Field Uri h>
	//   51  113:return          
	}

	MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle, 
			Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field String a>
		b = charsequence;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #58  <Field CharSequence b>
		c = charsequence1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #60  <Field CharSequence c>
		d = charsequence2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #62  <Field CharSequence d>
		e = bitmap;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #80  <Field Bitmap e>
		f = uri;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #84  <Field Uri f>
		g = bundle;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #90  <Field Bundle g>
		h = uri1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #92  <Field Uri h>
	//   26   49:return          
	}

	public static MediaDescriptionCompat a(Object obj)
	{
label0:
		{
			Object obj1;
			Bundle bundle;
			cf cf1;
label1:
			{
				bundle = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
				if(obj == null || android.os.Build.VERSION.SDK_INT < 21)
					break label0;
	//    2    2:aload_0         
	//    3    3:ifnull          201
	//    4    6:getstatic       #100 <Field int android.os.Build$VERSION.SDK_INT>
	//    5    9:bipush          21
	//    6   11:icmplt          201
				cf1 = new cf();
	//    7   14:new             #102 <Class cf>
	//    8   17:dup             
	//    9   18:invokespecial   #103 <Method void cf()>
	//   10   21:astore          4
				cf1.a(cg.a(obj));
	//   11   23:aload           4
	//   12   25:aload_0         
	//   13   26:invokestatic    #108 <Method String cg.a(Object)>
	//   14   29:invokevirtual   #111 <Method cf cf.a(String)>
	//   15   32:pop             
				cf1.a(cg.b(obj));
	//   16   33:aload           4
	//   17   35:aload_0         
	//   18   36:invokestatic    #114 <Method CharSequence cg.b(Object)>
	//   19   39:invokevirtual   #117 <Method cf cf.a(CharSequence)>
	//   20   42:pop             
				cf1.b(cg.c(obj));
	//   21   43:aload           4
	//   22   45:aload_0         
	//   23   46:invokestatic    #119 <Method CharSequence cg.c(Object)>
	//   24   49:invokevirtual   #121 <Method cf cf.b(CharSequence)>
	//   25   52:pop             
				cf1.c(cg.d(obj));
	//   26   53:aload           4
	//   27   55:aload_0         
	//   28   56:invokestatic    #123 <Method CharSequence cg.d(Object)>
	//   29   59:invokevirtual   #125 <Method cf cf.c(CharSequence)>
	//   30   62:pop             
				cf1.a(cg.e(obj));
	//   31   63:aload           4
	//   32   65:aload_0         
	//   33   66:invokestatic    #128 <Method Bitmap cg.e(Object)>
	//   34   69:invokevirtual   #131 <Method cf cf.a(Bitmap)>
	//   35   72:pop             
				cf1.a(cg.f(obj));
	//   36   73:aload           4
	//   37   75:aload_0         
	//   38   76:invokestatic    #134 <Method Uri cg.f(Object)>
	//   39   79:invokevirtual   #137 <Method cf cf.a(Uri)>
	//   40   82:pop             
				Bundle bundle1 = cg.g(obj);
	//   41   83:aload_0         
	//   42   84:invokestatic    #140 <Method Bundle cg.g(Object)>
	//   43   87:astore_3        
				if(bundle1 != null)
	//*  44   88:aload_3         
	//*  45   89:ifnull          109
				{
					MediaSessionCompat.a(bundle1);
	//   46   92:aload_3         
	//   47   93:invokestatic    #145 <Method void MediaSessionCompat.a(Bundle)>
					obj1 = ((Object) ((Uri)bundle1.getParcelable("android.support.v4.media.description.MEDIA_URI")));
	//   48   96:aload_3         
	//   49   97:ldc1            #147 <String "android.support.v4.media.description.MEDIA_URI">
	//   50   99:invokevirtual   #153 <Method Parcelable Bundle.getParcelable(String)>
	//   51  102:checkcast       #82  <Class Uri>
	//   52  105:astore_1        
				} else
	//*  53  106:goto            111
				{
					obj1 = null;
	//   54  109:aconst_null     
	//   55  110:astore_1        
				}
				if(obj1 != null)
	//*  56  111:aload_1         
	//*  57  112:ifnull          147
				{
					if(bundle1.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundle1.size() == 2)
	//*  58  115:aload_3         
	//*  59  116:ldc1            #155 <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//*  60  118:invokevirtual   #159 <Method boolean Bundle.containsKey(String)>
	//*  61  121:ifeq            135
	//*  62  124:aload_3         
	//*  63  125:invokevirtual   #163 <Method int Bundle.size()>
	//*  64  128:iconst_2        
	//*  65  129:icmpne          135
						break label1;
	//   66  132:goto            149
					bundle1.remove("android.support.v4.media.description.MEDIA_URI");
	//   67  135:aload_3         
	//   68  136:ldc1            #147 <String "android.support.v4.media.description.MEDIA_URI">
	//   69  138:invokevirtual   #167 <Method void Bundle.remove(String)>
					bundle1.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
	//   70  141:aload_3         
	//   71  142:ldc1            #155 <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//   72  144:invokevirtual   #167 <Method void Bundle.remove(String)>
				}
				bundle = bundle1;
	//   73  147:aload_3         
	//   74  148:astore_2        
			}
			cf1.a(bundle);
	//   75  149:aload           4
	//   76  151:aload_2         
	//   77  152:invokevirtual   #170 <Method cf cf.a(Bundle)>
	//   78  155:pop             
			if(obj1 != null)
	//*  79  156:aload_1         
	//*  80  157:ifnull          170
				cf1.b(((Uri) (obj1)));
	//   81  160:aload           4
	//   82  162:aload_1         
	//   83  163:invokevirtual   #172 <Method cf cf.b(Uri)>
	//   84  166:pop             
			else
	//*  85  167:goto            188
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  86  170:getstatic       #100 <Field int android.os.Build$VERSION.SDK_INT>
	//*  87  173:bipush          23
	//*  88  175:icmplt          188
				cf1.b(ci.a(obj));
	//   89  178:aload           4
	//   90  180:aload_0         
	//   91  181:invokestatic    #176 <Method Uri ci.a(Object)>
	//   92  184:invokevirtual   #172 <Method cf cf.b(Uri)>
	//   93  187:pop             
			obj1 = ((Object) (cf1.a()));
	//   94  188:aload           4
	//   95  190:invokevirtual   #179 <Method MediaDescriptionCompat cf.a()>
	//   96  193:astore_1        
			obj1.i = obj;
	//   97  194:aload_1         
	//   98  195:aload_0         
	//   99  196:putfield        #181 <Field Object i>
			return ((MediaDescriptionCompat) (obj1));
	//  100  199:aload_1         
	//  101  200:areturn         
		}
		return null;
	//  102  201:aconst_null     
	//  103  202:areturn         
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field String a>
	//    2    4:areturn         
	}

	public CharSequence b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field CharSequence b>
	//    2    4:areturn         
	}

	public CharSequence c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field CharSequence c>
	//    2    4:areturn         
	}

	public Bitmap d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Bitmap e>
	//    2    4:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Uri e()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Uri f>
	//    2    4:areturn         
	}

	public Object f()
	{
		if(i == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #181 <Field Object i>
	//*   2    4:ifnonnull       159
	//*   3    7:getstatic       #100 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          18
	//*   6   15:goto            159
		{
			Object obj = ch.a();
	//    7   18:invokestatic    #190 <Method Object ch.a()>
	//    8   21:astore_3        
			ch.a(obj, a);
	//    9   22:aload_3         
	//   10   23:aload_0         
	//   11   24:getfield        #43  <Field String a>
	//   12   27:invokestatic    #193 <Method void ch.a(Object, String)>
			ch.a(obj, b);
	//   13   30:aload_3         
	//   14   31:aload_0         
	//   15   32:getfield        #58  <Field CharSequence b>
	//   16   35:invokestatic    #196 <Method void ch.a(Object, CharSequence)>
			ch.b(obj, c);
	//   17   38:aload_3         
	//   18   39:aload_0         
	//   19   40:getfield        #60  <Field CharSequence c>
	//   20   43:invokestatic    #198 <Method void ch.b(Object, CharSequence)>
			ch.c(obj, d);
	//   21   46:aload_3         
	//   22   47:aload_0         
	//   23   48:getfield        #62  <Field CharSequence d>
	//   24   51:invokestatic    #200 <Method void ch.c(Object, CharSequence)>
			ch.a(obj, e);
	//   25   54:aload_3         
	//   26   55:aload_0         
	//   27   56:getfield        #80  <Field Bitmap e>
	//   28   59:invokestatic    #203 <Method void ch.a(Object, Bitmap)>
			ch.a(obj, f);
	//   29   62:aload_3         
	//   30   63:aload_0         
	//   31   64:getfield        #84  <Field Uri f>
	//   32   67:invokestatic    #206 <Method void ch.a(Object, Uri)>
			Bundle bundle1 = g;
	//   33   70:aload_0         
	//   34   71:getfield        #90  <Field Bundle g>
	//   35   74:astore_2        
			Bundle bundle = bundle1;
	//   36   75:aload_2         
	//   37   76:astore_1        
			if(android.os.Build.VERSION.SDK_INT < 23)
	//*  38   77:getstatic       #100 <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   80:bipush          23
	//*  40   82:icmpge          125
			{
				bundle = bundle1;
	//   41   85:aload_2         
	//   42   86:astore_1        
				if(h != null)
	//*  43   87:aload_0         
	//*  44   88:getfield        #92  <Field Uri h>
	//*  45   91:ifnull          125
				{
					bundle = bundle1;
	//   46   94:aload_2         
	//   47   95:astore_1        
					if(bundle1 == null)
	//*  48   96:aload_2         
	//*  49   97:ifnonnull       115
					{
						bundle = new Bundle();
	//   50  100:new             #149 <Class Bundle>
	//   51  103:dup             
	//   52  104:invokespecial   #207 <Method void Bundle()>
	//   53  107:astore_1        
						bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
	//   54  108:aload_1         
	//   55  109:ldc1            #155 <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//   56  111:iconst_1        
	//   57  112:invokevirtual   #211 <Method void Bundle.putBoolean(String, boolean)>
					}
					bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", ((Parcelable) (h)));
	//   58  115:aload_1         
	//   59  116:ldc1            #147 <String "android.support.v4.media.description.MEDIA_URI">
	//   60  118:aload_0         
	//   61  119:getfield        #92  <Field Uri h>
	//   62  122:invokevirtual   #215 <Method void Bundle.putParcelable(String, Parcelable)>
				}
			}
			ch.a(obj, bundle);
	//   63  125:aload_3         
	//   64  126:aload_1         
	//   65  127:invokestatic    #218 <Method void ch.a(Object, Bundle)>
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  66  130:getstatic       #100 <Field int android.os.Build$VERSION.SDK_INT>
	//*  67  133:bipush          23
	//*  68  135:icmplt          146
				cj.a(obj, h);
	//   69  138:aload_3         
	//   70  139:aload_0         
	//   71  140:getfield        #92  <Field Uri h>
	//   72  143:invokestatic    #221 <Method void cj.a(Object, Uri)>
			i = ch.a(obj);
	//   73  146:aload_0         
	//   74  147:aload_3         
	//   75  148:invokestatic    #224 <Method Object ch.a(Object)>
	//   76  151:putfield        #181 <Field Object i>
			return i;
	//   77  154:aload_0         
	//   78  155:getfield        #181 <Field Object i>
	//   79  158:areturn         
		} else
		{
			return i;
	//   80  159:aload_0         
	//   81  160:getfield        #181 <Field Object i>
	//   82  163:areturn         
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #227 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #228 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object) (b)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #58  <Field CharSequence b>
	//    7   13:invokevirtual   #232 <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append(", ");
	//    9   17:aload_1         
	//   10   18:ldc1            #234 <String ", ">
	//   11   20:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(((Object) (c)));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #60  <Field CharSequence c>
	//   16   29:invokevirtual   #232 <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		stringbuilder.append(", ");
	//   18   33:aload_1         
	//   19   34:ldc1            #234 <String ", ">
	//   20   36:invokevirtual   #237 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(((Object) (d)));
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #62  <Field CharSequence d>
	//   25   45:invokevirtual   #232 <Method StringBuilder StringBuilder.append(Object)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #239 <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	public void writeToParcel(Parcel parcel, int j)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #100 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          79
		{
			parcel.writeString(a);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #43  <Field String a>
	//    6   13:invokevirtual   #244 <Method void Parcel.writeString(String)>
			TextUtils.writeToParcel(b, parcel, j);
	//    7   16:aload_0         
	//    8   17:getfield        #58  <Field CharSequence b>
	//    9   20:aload_1         
	//   10   21:iload_2         
	//   11   22:invokestatic    #247 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			TextUtils.writeToParcel(c, parcel, j);
	//   12   25:aload_0         
	//   13   26:getfield        #60  <Field CharSequence c>
	//   14   29:aload_1         
	//   15   30:iload_2         
	//   16   31:invokestatic    #247 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			TextUtils.writeToParcel(d, parcel, j);
	//   17   34:aload_0         
	//   18   35:getfield        #62  <Field CharSequence d>
	//   19   38:aload_1         
	//   20   39:iload_2         
	//   21   40:invokestatic    #247 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			parcel.writeParcelable(((Parcelable) (e)), j);
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #80  <Field Bitmap e>
	//   25   48:iload_2         
	//   26   49:invokevirtual   #251 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeParcelable(((Parcelable) (f)), j);
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:getfield        #84  <Field Uri f>
	//   30   57:iload_2         
	//   31   58:invokevirtual   #251 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeBundle(g);
	//   32   61:aload_1         
	//   33   62:aload_0         
	//   34   63:getfield        #90  <Field Bundle g>
	//   35   66:invokevirtual   #254 <Method void Parcel.writeBundle(Bundle)>
			parcel.writeParcelable(((Parcelable) (h)), j);
	//   36   69:aload_1         
	//   37   70:aload_0         
	//   38   71:getfield        #92  <Field Uri h>
	//   39   74:iload_2         
	//   40   75:invokevirtual   #251 <Method void Parcel.writeParcelable(Parcelable, int)>
			return;
	//   41   78:return          
		} else
		{
			cg.a(f(), parcel, j);
	//   42   79:aload_0         
	//   43   80:invokevirtual   #256 <Method Object f()>
	//   44   83:aload_1         
	//   45   84:iload_2         
	//   46   85:invokestatic    #259 <Method void cg.a(Object, Parcel, int)>
			return;
	//   47   88:return          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new ce();
	private final String a;
	private final CharSequence b;
	private final CharSequence c;
	private final CharSequence d;
	private final Bitmap e;
	private final Uri f;
	private final Bundle g;
	private final Uri h;
	private Object i;

	static 
	{
	//    0    0:new             #27  <Class ce>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void ce()>
	//    3    7:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
