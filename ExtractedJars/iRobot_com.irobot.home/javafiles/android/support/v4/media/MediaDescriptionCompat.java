// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.*;
import android.text.TextUtils;

// Referenced classes of package android.support.v4.media:
//			d, e

public final class MediaDescriptionCompat
	implements Parcelable
{
	public static final class a
	{

		public a a(Bitmap bitmap)
		{
			e = bitmap;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field Bitmap e>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a a(Uri uri)
		{
			f = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #30  <Field Uri f>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a a(Bundle bundle)
		{
			g = bundle;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #33  <Field Bundle g>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a a(CharSequence charsequence)
		{
			b = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #36  <Field CharSequence b>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a a(String s)
		{
			a = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #39  <Field String a>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public MediaDescriptionCompat a()
		{
			return new MediaDescriptionCompat(a, b, c, d, e, f, g, h);
		//    0    0:new             #6   <Class MediaDescriptionCompat>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #39  <Field String a>
		//    4    8:aload_0         
		//    5    9:getfield        #36  <Field CharSequence b>
		//    6   12:aload_0         
		//    7   13:getfield        #42  <Field CharSequence c>
		//    8   16:aload_0         
		//    9   17:getfield        #44  <Field CharSequence d>
		//   10   20:aload_0         
		//   11   21:getfield        #27  <Field Bitmap e>
		//   12   24:aload_0         
		//   13   25:getfield        #30  <Field Uri f>
		//   14   28:aload_0         
		//   15   29:getfield        #33  <Field Bundle g>
		//   16   32:aload_0         
		//   17   33:getfield        #46  <Field Uri h>
		//   18   36:invokespecial   #49  <Method void MediaDescriptionCompat(String, CharSequence, CharSequence, CharSequence, Bitmap, Uri, Bundle, Uri)>
		//   19   39:areturn         
		}

		public a b(Uri uri)
		{
			h = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #46  <Field Uri h>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a b(CharSequence charsequence)
		{
			c = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #42  <Field CharSequence c>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public a c(CharSequence charsequence)
		{
			d = charsequence;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #44  <Field CharSequence d>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String a;
		private CharSequence b;
		private CharSequence c;
		private CharSequence d;
		private Bitmap e;
		private Uri f;
		private Bundle g;
		private Uri h;

		public a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void Object()>
		//    2    4:return          
		}
	}


	MediaDescriptionCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		a = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #44  <Method String Parcel.readString()>
	//    5    9:putfield        #46  <Field String a>
		b = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//    6   12:aload_0         
	//    7   13:getstatic       #51  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//    8   16:aload_1         
	//    9   17:invokeinterface #57  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   10   22:checkcast       #59  <Class CharSequence>
	//   11   25:putfield        #61  <Field CharSequence b>
		c = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   12   28:aload_0         
	//   13   29:getstatic       #51  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   14   32:aload_1         
	//   15   33:invokeinterface #57  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   16   38:checkcast       #59  <Class CharSequence>
	//   17   41:putfield        #63  <Field CharSequence c>
		d = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
	//   18   44:aload_0         
	//   19   45:getstatic       #51  <Field android.os.Parcelable$Creator TextUtils.CHAR_SEQUENCE_CREATOR>
	//   20   48:aload_1         
	//   21   49:invokeinterface #57  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   22   54:checkcast       #59  <Class CharSequence>
	//   23   57:putfield        #65  <Field CharSequence d>
		e = (Bitmap)parcel.readParcelable(((ClassLoader) (null)));
	//   24   60:aload_0         
	//   25   61:aload_1         
	//   26   62:aconst_null     
	//   27   63:invokevirtual   #69  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   28   66:checkcast       #71  <Class Bitmap>
	//   29   69:putfield        #73  <Field Bitmap e>
		f = (Uri)parcel.readParcelable(((ClassLoader) (null)));
	//   30   72:aload_0         
	//   31   73:aload_1         
	//   32   74:aconst_null     
	//   33   75:invokevirtual   #69  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   34   78:checkcast       #75  <Class Uri>
	//   35   81:putfield        #77  <Field Uri f>
		g = parcel.readBundle();
	//   36   84:aload_0         
	//   37   85:aload_1         
	//   38   86:invokevirtual   #81  <Method Bundle Parcel.readBundle()>
	//   39   89:putfield        #83  <Field Bundle g>
		h = (Uri)parcel.readParcelable(((ClassLoader) (null)));
	//   40   92:aload_0         
	//   41   93:aload_1         
	//   42   94:aconst_null     
	//   43   95:invokevirtual   #69  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   44   98:checkcast       #75  <Class Uri>
	//   45  101:putfield        #85  <Field Uri h>
	//   46  104:return          
	}

	MediaDescriptionCompat(String s, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, Bitmap bitmap, Uri uri, Bundle bundle, 
			Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #46  <Field String a>
		b = charsequence;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #61  <Field CharSequence b>
		c = charsequence1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #63  <Field CharSequence c>
		d = charsequence2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #65  <Field CharSequence d>
		e = bitmap;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #73  <Field Bitmap e>
		f = uri;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #77  <Field Uri f>
		g = bundle;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #83  <Field Bundle g>
		h = uri1;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #85  <Field Uri h>
	//   26   49:return          
	}

	public static MediaDescriptionCompat a(Object obj)
	{
		Object obj1;
label0:
		{
			Bundle bundle;
			a a1;
label1:
			{
				Bundle bundle1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
				bundle = null;
	//    2    2:aconst_null     
	//    3    3:astore_2        
				obj1 = ((Object) (bundle1));
	//    4    4:aload_3         
	//    5    5:astore_1        
				if(obj == null)
					break label0;
	//    6    6:aload_0         
	//    7    7:ifnull          201
				obj1 = ((Object) (bundle1));
	//    8   10:aload_3         
	//    9   11:astore_1        
				if(android.os.Build.VERSION.SDK_INT < 21)
					break label0;
	//   10   12:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//   11   15:bipush          21
	//   12   17:icmplt          201
				a1 = new a();
	//   13   20:new             #10  <Class MediaDescriptionCompat$a>
	//   14   23:dup             
	//   15   24:invokespecial   #94  <Method void MediaDescriptionCompat$a()>
	//   16   27:astore          4
				a1.a(android.support.v4.media.d.a(obj));
	//   17   29:aload           4
	//   18   31:aload_0         
	//   19   32:invokestatic    #99  <Method String d.a(Object)>
	//   20   35:invokevirtual   #102 <Method MediaDescriptionCompat$a MediaDescriptionCompat$a.a(String)>
	//   21   38:pop             
				a1.a(android.support.v4.media.d.b(obj));
	//   22   39:aload           4
	//   23   41:aload_0         
	//   24   42:invokestatic    #105 <Method CharSequence d.b(Object)>
	//   25   45:invokevirtual   #108 <Method MediaDescriptionCompat$a MediaDescriptionCompat$a.a(CharSequence)>
	//   26   48:pop             
				a1.b(android.support.v4.media.d.c(obj));
	//   27   49:aload           4
	//   28   51:aload_0         
	//   29   52:invokestatic    #110 <Method CharSequence d.c(Object)>
	//   30   55:invokevirtual   #112 <Method MediaDescriptionCompat$a MediaDescriptionCompat$a.b(CharSequence)>
	//   31   58:pop             
				a1.c(android.support.v4.media.d.d(obj));
	//   32   59:aload           4
	//   33   61:aload_0         
	//   34   62:invokestatic    #114 <Method CharSequence d.d(Object)>
	//   35   65:invokevirtual   #116 <Method MediaDescriptionCompat$a MediaDescriptionCompat$a.c(CharSequence)>
	//   36   68:pop             
				a1.a(android.support.v4.media.d.e(obj));
	//   37   69:aload           4
	//   38   71:aload_0         
	//   39   72:invokestatic    #119 <Method Bitmap d.e(Object)>
	//   40   75:invokevirtual   #122 <Method MediaDescriptionCompat$a MediaDescriptionCompat$a.a(Bitmap)>
	//   41   78:pop             
				a1.a(android.support.v4.media.d.f(obj));
	//   42   79:aload           4
	//   43   81:aload_0         
	//   44   82:invokestatic    #125 <Method Uri d.f(Object)>
	//   45   85:invokevirtual   #128 <Method MediaDescriptionCompat$a MediaDescriptionCompat$a.a(Uri)>
	//   46   88:pop             
				bundle1 = android.support.v4.media.d.g(obj);
	//   47   89:aload_0         
	//   48   90:invokestatic    #131 <Method Bundle d.g(Object)>
	//   49   93:astore_3        
				if(bundle1 == null)
	//*  50   94:aload_3         
	//*  51   95:ifnonnull       103
					obj1 = null;
	//   52   98:aconst_null     
	//   53   99:astore_1        
				else
	//*  54  100:goto            113
					obj1 = ((Object) ((Uri)bundle1.getParcelable("android.support.v4.media.description.MEDIA_URI")));
	//   55  103:aload_3         
	//   56  104:ldc1            #133 <String "android.support.v4.media.description.MEDIA_URI">
	//   57  106:invokevirtual   #139 <Method Parcelable Bundle.getParcelable(String)>
	//   58  109:checkcast       #75  <Class Uri>
	//   59  112:astore_1        
				if(obj1 != null)
	//*  60  113:aload_1         
	//*  61  114:ifnull          149
				{
					if(bundle1.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && bundle1.size() == 2)
	//*  62  117:aload_3         
	//*  63  118:ldc1            #141 <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//*  64  120:invokevirtual   #145 <Method boolean Bundle.containsKey(String)>
	//*  65  123:ifeq            137
	//*  66  126:aload_3         
	//*  67  127:invokevirtual   #149 <Method int Bundle.size()>
	//*  68  130:iconst_2        
	//*  69  131:icmpne          137
						break label1;
	//   70  134:goto            151
					bundle1.remove("android.support.v4.media.description.MEDIA_URI");
	//   71  137:aload_3         
	//   72  138:ldc1            #133 <String "android.support.v4.media.description.MEDIA_URI">
	//   73  140:invokevirtual   #153 <Method void Bundle.remove(String)>
					bundle1.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
	//   74  143:aload_3         
	//   75  144:ldc1            #141 <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//   76  146:invokevirtual   #153 <Method void Bundle.remove(String)>
				}
				bundle = bundle1;
	//   77  149:aload_3         
	//   78  150:astore_2        
			}
			a1.a(bundle);
	//   79  151:aload           4
	//   80  153:aload_2         
	//   81  154:invokevirtual   #156 <Method MediaDescriptionCompat$a MediaDescriptionCompat$a.a(Bundle)>
	//   82  157:pop             
			if(obj1 != null)
	//*  83  158:aload_1         
	//*  84  159:ifnull          172
				a1.b(((Uri) (obj1)));
	//   85  162:aload           4
	//   86  164:aload_1         
	//   87  165:invokevirtual   #158 <Method MediaDescriptionCompat$a MediaDescriptionCompat$a.b(Uri)>
	//   88  168:pop             
			else
	//*  89  169:goto            190
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  90  172:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//*  91  175:bipush          23
	//*  92  177:icmplt          190
				a1.b(android.support.v4.media.e.h(obj));
	//   93  180:aload           4
	//   94  182:aload_0         
	//   95  183:invokestatic    #162 <Method Uri e.h(Object)>
	//   96  186:invokevirtual   #158 <Method MediaDescriptionCompat$a MediaDescriptionCompat$a.b(Uri)>
	//   97  189:pop             
			obj1 = ((Object) (a1.a()));
	//   98  190:aload           4
	//   99  192:invokevirtual   #165 <Method MediaDescriptionCompat MediaDescriptionCompat$a.a()>
	//  100  195:astore_1        
			obj1.i = obj;
	//  101  196:aload_1         
	//  102  197:aload_0         
	//  103  198:putfield        #167 <Field Object i>
		}
		return ((MediaDescriptionCompat) (obj1));
	//  104  201:aload_1         
	//  105  202:areturn         
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String a>
	//    2    4:areturn         
	}

	public Object b()
	{
		if(i == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field Object i>
	//*   2    4:ifnonnull       159
	//*   3    7:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmpge          18
	//*   6   15:goto            159
		{
			Object obj = android.support.v4.media.d.a.a();
	//    7   18:invokestatic    #172 <Method Object d$a.a()>
	//    8   21:astore_3        
			android.support.v4.media.d.a.a(obj, a);
	//    9   22:aload_3         
	//   10   23:aload_0         
	//   11   24:getfield        #46  <Field String a>
	//   12   27:invokestatic    #175 <Method void d$a.a(Object, String)>
			android.support.v4.media.d.a.a(obj, b);
	//   13   30:aload_3         
	//   14   31:aload_0         
	//   15   32:getfield        #61  <Field CharSequence b>
	//   16   35:invokestatic    #178 <Method void d$a.a(Object, CharSequence)>
			android.support.v4.media.d.a.b(obj, c);
	//   17   38:aload_3         
	//   18   39:aload_0         
	//   19   40:getfield        #63  <Field CharSequence c>
	//   20   43:invokestatic    #180 <Method void d$a.b(Object, CharSequence)>
			android.support.v4.media.d.a.c(obj, d);
	//   21   46:aload_3         
	//   22   47:aload_0         
	//   23   48:getfield        #65  <Field CharSequence d>
	//   24   51:invokestatic    #182 <Method void d$a.c(Object, CharSequence)>
			android.support.v4.media.d.a.a(obj, e);
	//   25   54:aload_3         
	//   26   55:aload_0         
	//   27   56:getfield        #73  <Field Bitmap e>
	//   28   59:invokestatic    #185 <Method void d$a.a(Object, Bitmap)>
			android.support.v4.media.d.a.a(obj, f);
	//   29   62:aload_3         
	//   30   63:aload_0         
	//   31   64:getfield        #77  <Field Uri f>
	//   32   67:invokestatic    #188 <Method void d$a.a(Object, Uri)>
			Bundle bundle1 = g;
	//   33   70:aload_0         
	//   34   71:getfield        #83  <Field Bundle g>
	//   35   74:astore_2        
			Bundle bundle = bundle1;
	//   36   75:aload_2         
	//   37   76:astore_1        
			if(android.os.Build.VERSION.SDK_INT < 23)
	//*  38   77:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//*  39   80:bipush          23
	//*  40   82:icmpge          125
			{
				bundle = bundle1;
	//   41   85:aload_2         
	//   42   86:astore_1        
				if(h != null)
	//*  43   87:aload_0         
	//*  44   88:getfield        #85  <Field Uri h>
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
	//   50  100:new             #135 <Class Bundle>
	//   51  103:dup             
	//   52  104:invokespecial   #189 <Method void Bundle()>
	//   53  107:astore_1        
						bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
	//   54  108:aload_1         
	//   55  109:ldc1            #141 <String "android.support.v4.media.description.NULL_BUNDLE_FLAG">
	//   56  111:iconst_1        
	//   57  112:invokevirtual   #193 <Method void Bundle.putBoolean(String, boolean)>
					}
					bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", ((Parcelable) (h)));
	//   58  115:aload_1         
	//   59  116:ldc1            #133 <String "android.support.v4.media.description.MEDIA_URI">
	//   60  118:aload_0         
	//   61  119:getfield        #85  <Field Uri h>
	//   62  122:invokevirtual   #197 <Method void Bundle.putParcelable(String, Parcelable)>
				}
			}
			android.support.v4.media.d.a.a(obj, bundle);
	//   63  125:aload_3         
	//   64  126:aload_1         
	//   65  127:invokestatic    #200 <Method void d$a.a(Object, Bundle)>
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  66  130:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//*  67  133:bipush          23
	//*  68  135:icmplt          146
				android.support.v4.media.e.a.b(obj, h);
	//   69  138:aload_3         
	//   70  139:aload_0         
	//   71  140:getfield        #85  <Field Uri h>
	//   72  143:invokestatic    #204 <Method void e$a.b(Object, Uri)>
			i = android.support.v4.media.d.a.a(obj);
	//   73  146:aload_0         
	//   74  147:aload_3         
	//   75  148:invokestatic    #207 <Method Object d$a.a(Object)>
	//   76  151:putfield        #167 <Field Object i>
			return i;
	//   77  154:aload_0         
	//   78  155:getfield        #167 <Field Object i>
	//   79  158:areturn         
		} else
		{
			return i;
	//   80  159:aload_0         
	//   81  160:getfield        #167 <Field Object i>
	//   82  163:areturn         
		}
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #211 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #212 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(((Object) (b)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field CharSequence b>
	//    7   13:invokevirtual   #216 <Method StringBuilder StringBuilder.append(Object)>
	//    8   16:pop             
		stringbuilder.append(", ");
	//    9   17:aload_1         
	//   10   18:ldc1            #218 <String ", ">
	//   11   20:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(((Object) (c)));
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:getfield        #63  <Field CharSequence c>
	//   16   29:invokevirtual   #216 <Method StringBuilder StringBuilder.append(Object)>
	//   17   32:pop             
		stringbuilder.append(", ");
	//   18   33:aload_1         
	//   19   34:ldc1            #218 <String ", ">
	//   20   36:invokevirtual   #221 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(((Object) (d)));
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:getfield        #65  <Field CharSequence d>
	//   25   45:invokevirtual   #216 <Method StringBuilder StringBuilder.append(Object)>
	//   26   48:pop             
		return stringbuilder.toString();
	//   27   49:aload_1         
	//   28   50:invokevirtual   #223 <Method String StringBuilder.toString()>
	//   29   53:areturn         
	}

	public void writeToParcel(Parcel parcel, int j)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #93  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          79
		{
			parcel.writeString(a);
	//    3    8:aload_1         
	//    4    9:aload_0         
	//    5   10:getfield        #46  <Field String a>
	//    6   13:invokevirtual   #228 <Method void Parcel.writeString(String)>
			TextUtils.writeToParcel(b, parcel, j);
	//    7   16:aload_0         
	//    8   17:getfield        #61  <Field CharSequence b>
	//    9   20:aload_1         
	//   10   21:iload_2         
	//   11   22:invokestatic    #231 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			TextUtils.writeToParcel(c, parcel, j);
	//   12   25:aload_0         
	//   13   26:getfield        #63  <Field CharSequence c>
	//   14   29:aload_1         
	//   15   30:iload_2         
	//   16   31:invokestatic    #231 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			TextUtils.writeToParcel(d, parcel, j);
	//   17   34:aload_0         
	//   18   35:getfield        #65  <Field CharSequence d>
	//   19   38:aload_1         
	//   20   39:iload_2         
	//   21   40:invokestatic    #231 <Method void TextUtils.writeToParcel(CharSequence, Parcel, int)>
			parcel.writeParcelable(((Parcelable) (e)), j);
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #73  <Field Bitmap e>
	//   25   48:iload_2         
	//   26   49:invokevirtual   #235 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeParcelable(((Parcelable) (f)), j);
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:getfield        #77  <Field Uri f>
	//   30   57:iload_2         
	//   31   58:invokevirtual   #235 <Method void Parcel.writeParcelable(Parcelable, int)>
			parcel.writeBundle(g);
	//   32   61:aload_1         
	//   33   62:aload_0         
	//   34   63:getfield        #83  <Field Bundle g>
	//   35   66:invokevirtual   #239 <Method void Parcel.writeBundle(Bundle)>
			parcel.writeParcelable(((Parcelable) (h)), j);
	//   36   69:aload_1         
	//   37   70:aload_0         
	//   38   71:getfield        #85  <Field Uri h>
	//   39   74:iload_2         
	//   40   75:invokevirtual   #235 <Method void Parcel.writeParcelable(Parcelable, int)>
			return;
	//   41   78:return          
		} else
		{
			android.support.v4.media.d.a(b(), parcel, j);
	//   42   79:aload_0         
	//   43   80:invokevirtual   #241 <Method Object b()>
	//   44   83:aload_1         
	//   45   84:iload_2         
	//   46   85:invokestatic    #244 <Method void d.a(Object, Parcel, int)>
			return;
	//   47   88:return          
		}
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaDescriptionCompat a(Parcel parcel)
		{
			if(android.os.Build.VERSION.SDK_INT < 21)
		//*   0    0:getstatic       #22  <Field int android.os.Build$VERSION.SDK_INT>
		//*   1    3:bipush          21
		//*   2    5:icmpge          17
				return new MediaDescriptionCompat(parcel);
		//    3    8:new             #9   <Class MediaDescriptionCompat>
		//    4   11:dup             
		//    5   12:aload_1         
		//    6   13:invokespecial   #25  <Method void MediaDescriptionCompat(Parcel)>
		//    7   16:areturn         
			else
				return MediaDescriptionCompat.a(android.support.v4.media.d.a(parcel));
		//    8   17:aload_1         
		//    9   18:invokestatic    #30  <Method Object d.a(Parcel)>
		//   10   21:invokestatic    #33  <Method MediaDescriptionCompat MediaDescriptionCompat.a(Object)>
		//   11   24:areturn         
		}

		public MediaDescriptionCompat[] a(int j)
		{
			return new MediaDescriptionCompat[j];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaDescriptionCompat[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #37  <Method MediaDescriptionCompat a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int j)
		{
			return ((Object []) (a(j)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #41  <Method MediaDescriptionCompat[] a(int)>
		//    3    5:areturn         
		}

	}
;
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
	//    0    0:new             #8   <Class MediaDescriptionCompat$1>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void MediaDescriptionCompat$1()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
