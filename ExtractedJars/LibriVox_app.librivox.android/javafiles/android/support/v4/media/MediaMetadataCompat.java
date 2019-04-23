// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.*;
import android.support.v4.g.a;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;

// Referenced classes of package android.support.v4.media:
//			ck, cm, cf, MediaDescriptionCompat

public final class MediaMetadataCompat
	implements Parcelable
{

	MediaMetadataCompat(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void Object()>
		b = new Bundle(bundle);
	//    2    4:aload_0         
	//    3    5:new             #119 <Class Bundle>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #121 <Method void Bundle(Bundle)>
	//    7   13:putfield        #123 <Field Bundle b>
		MediaSessionCompat.a(b);
	//    8   16:aload_0         
	//    9   17:getfield        #123 <Field Bundle b>
	//   10   20:invokestatic    #127 <Method void MediaSessionCompat.a(Bundle)>
	//   11   23:return          
	}

	MediaMetadataCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void Object()>
		b = parcel.readBundle(((Class) (android/support/v4/media/session/MediaSessionCompat)).getClassLoader());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #125 <Class MediaSessionCompat>
	//    5    8:invokevirtual   #134 <Method ClassLoader Class.getClassLoader()>
	//    6   11:invokevirtual   #140 <Method Bundle Parcel.readBundle(ClassLoader)>
	//    7   14:putfield        #123 <Field Bundle b>
	//    8   17:return          
	}

	public static MediaMetadataCompat a(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          51
	//*   2    4:getstatic       #147 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          51
		{
			Parcel parcel = Parcel.obtain();
	//    5   12:invokestatic    #151 <Method Parcel Parcel.obtain()>
	//    6   15:astore_1        
			android.support.v4.media.cm.a(obj, parcel, 0);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:iconst_0        
	//   10   19:invokestatic    #156 <Method void android.support.v4.media.cm.a(Object, Parcel, int)>
			parcel.setDataPosition(0);
	//   11   22:aload_1         
	//   12   23:iconst_0        
	//   13   24:invokevirtual   #160 <Method void Parcel.setDataPosition(int)>
			MediaMetadataCompat mediametadatacompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
	//   14   27:getstatic       #114 <Field android.os.Parcelable$Creator CREATOR>
	//   15   30:aload_1         
	//   16   31:invokeinterface #166 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   17   36:checkcast       #2   <Class MediaMetadataCompat>
	//   18   39:astore_2        
			parcel.recycle();
	//   19   40:aload_1         
	//   20   41:invokevirtual   #169 <Method void Parcel.recycle()>
			mediametadatacompat.f = obj;
	//   21   44:aload_2         
	//   22   45:aload_0         
	//   23   46:putfield        #171 <Field Object f>
			return mediametadatacompat;
	//   24   49:aload_2         
	//   25   50:areturn         
		} else
		{
			return null;
	//   26   51:aconst_null     
	//   27   52:areturn         
		}
	}

	public MediaDescriptionCompat a()
	{
		Object obj;
		Uri uri;
		String s;
		CharSequence acharsequence[];
label0:
		{
			obj = ((Object) (g));
	//    0    0:aload_0         
	//    1    1:getfield        #174 <Field MediaDescriptionCompat g>
	//    2    4:astore          4
			if(obj != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          14
				return ((MediaDescriptionCompat) (obj));
	//    5   11:aload           4
	//    6   13:areturn         
			s = c("android.media.metadata.MEDIA_ID");
	//    7   14:aload_0         
	//    8   15:ldc1            #93  <String "android.media.metadata.MEDIA_ID">
	//    9   17:invokevirtual   #177 <Method String c(String)>
	//   10   20:astore          7
			acharsequence = new CharSequence[3];
	//   11   22:iconst_3        
	//   12   23:anewarray       CharSequence[]
	//   13   26:astore          8
			obj = ((Object) (b("android.media.metadata.DISPLAY_TITLE")));
	//   14   28:aload_0         
	//   15   29:ldc1            #83  <String "android.media.metadata.DISPLAY_TITLE">
	//   16   31:invokevirtual   #182 <Method CharSequence b(String)>
	//   17   34:astore          4
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  18   36:aload           4
	//*  19   38:invokestatic    #188 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  20   41:ifne            73
			{
				acharsequence[0] = ((CharSequence) (obj));
	//   21   44:aload           8
	//   22   46:iconst_0        
	//   23   47:aload           4
	//   24   49:aastore         
				acharsequence[1] = b("android.media.metadata.DISPLAY_SUBTITLE");
	//   25   50:aload           8
	//   26   52:iconst_1        
	//   27   53:aload_0         
	//   28   54:ldc1            #85  <String "android.media.metadata.DISPLAY_SUBTITLE">
	//   29   56:invokevirtual   #182 <Method CharSequence b(String)>
	//   30   59:aastore         
				acharsequence[2] = b("android.media.metadata.DISPLAY_DESCRIPTION");
	//   31   60:aload           8
	//   32   62:iconst_2        
	//   33   63:aload_0         
	//   34   64:ldc1            #87  <String "android.media.metadata.DISPLAY_DESCRIPTION">
	//   35   66:invokevirtual   #182 <Method CharSequence b(String)>
	//   36   69:aastore         
			} else
	//*  37   70:goto            135
			{
				int l = 0;
	//   38   73:iconst_0        
	//   39   74:istore_2        
				int i = 0;
	//   40   75:iconst_0        
	//   41   76:istore_1        
				int j1;
				for(; l < acharsequence.length; l = j1)
	//*  42   77:iload_2         
	//*  43   78:aload           8
	//*  44   80:arraylength     
	//*  45   81:icmpge          135
				{
					String as[] = c;
	//   46   84:getstatic       #105 <Field String[] c>
	//   47   87:astore          4
					if(i >= as.length)
						break;
	//   48   89:iload_1         
	//   49   90:aload           4
	//   50   92:arraylength     
	//   51   93:icmpge          135
					as = ((String []) (b(as[i])));
	//   52   96:aload_0         
	//   53   97:aload           4
	//   54   99:iload_1         
	//   55  100:aaload          
	//   56  101:invokevirtual   #182 <Method CharSequence b(String)>
	//   57  104:astore          4
					j1 = l;
	//   58  106:iload_2         
	//   59  107:istore_3        
					if(!TextUtils.isEmpty(((CharSequence) (as))))
	//*  60  108:aload           4
	//*  61  110:invokestatic    #188 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  62  113:ifne            126
					{
						acharsequence[l] = ((CharSequence) (as));
	//   63  116:aload           8
	//   64  118:iload_2         
	//   65  119:aload           4
	//   66  121:aastore         
						j1 = l + 1;
	//   67  122:iload_2         
	//   68  123:iconst_1        
	//   69  124:iadd            
	//   70  125:istore_3        
					}
					i++;
	//   71  126:iload_1         
	//   72  127:iconst_1        
	//   73  128:iadd            
	//   74  129:istore_1        
				}

	//   75  130:iload_3         
	//   76  131:istore_2        
			}
	//*  77  132:goto            77
			int j = 0;
	//   78  135:iconst_0        
	//   79  136:istore_1        
			do
			{
				String as1[] = d;
	//   80  137:getstatic       #107 <Field String[] d>
	//   81  140:astore          4
				int i1 = as1.length;
	//   82  142:aload           4
	//   83  144:arraylength     
	//   84  145:istore_2        
				uri = null;
	//   85  146:aconst_null     
	//   86  147:astore          6
				if(j >= i1)
					break;
	//   87  149:iload_1         
	//   88  150:iload_2         
	//   89  151:icmpge          179
				as1 = ((String []) (e(as1[j])));
	//   90  154:aload_0         
	//   91  155:aload           4
	//   92  157:iload_1         
	//   93  158:aaload          
	//   94  159:invokevirtual   #191 <Method Bitmap e(String)>
	//   95  162:astore          4
				if(as1 != null)
	//*  96  164:aload           4
	//*  97  166:ifnull          172
					break label0;
	//   98  169:goto            182
				j++;
	//   99  172:iload_1         
	//  100  173:iconst_1        
	//  101  174:iadd            
	//  102  175:istore_1        
			} while(true);
	//  103  176:goto            137
			as1 = null;
	//  104  179:aconst_null     
	//  105  180:astore          4
		}
		Object obj1;
label1:
		{
			int k = 0;
	//  106  182:iconst_0        
	//  107  183:istore_1        
			do
			{
				String as2[] = e;
	//  108  184:getstatic       #109 <Field String[] e>
	//  109  187:astore          5
				if(k >= as2.length)
					break;
	//  110  189:iload_1         
	//  111  190:aload           5
	//  112  192:arraylength     
	//  113  193:icmpge          231
				obj1 = ((Object) (c(as2[k])));
	//  114  196:aload_0         
	//  115  197:aload           5
	//  116  199:iload_1         
	//  117  200:aaload          
	//  118  201:invokevirtual   #177 <Method String c(String)>
	//  119  204:astore          5
				if(!TextUtils.isEmpty(((CharSequence) (obj1))))
	//* 120  206:aload           5
	//* 121  208:invokestatic    #188 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 122  211:ifne            224
				{
					obj1 = ((Object) (Uri.parse(((String) (obj1)))));
	//  123  214:aload           5
	//  124  216:invokestatic    #197 <Method Uri Uri.parse(String)>
	//  125  219:astore          5
					break label1;
	//  126  221:goto            234
				}
				k++;
	//  127  224:iload_1         
	//  128  225:iconst_1        
	//  129  226:iadd            
	//  130  227:istore_1        
			} while(true);
	//  131  228:goto            184
			obj1 = null;
	//  132  231:aconst_null     
	//  133  232:astore          5
		}
		Object obj2 = ((Object) (c("android.media.metadata.MEDIA_URI")));
	//  134  234:aload_0         
	//  135  235:ldc1            #97  <String "android.media.metadata.MEDIA_URI">
	//  136  237:invokevirtual   #177 <Method String c(String)>
	//  137  240:astore          9
		if(!TextUtils.isEmpty(((CharSequence) (obj2))))
	//* 138  242:aload           9
	//* 139  244:invokestatic    #188 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 140  247:ifne            257
			uri = Uri.parse(((String) (obj2)));
	//  141  250:aload           9
	//  142  252:invokestatic    #197 <Method Uri Uri.parse(String)>
	//  143  255:astore          6
		obj2 = ((Object) (new cf()));
	//  144  257:new             #199 <Class cf>
	//  145  260:dup             
	//  146  261:invokespecial   #200 <Method void cf()>
	//  147  264:astore          9
		((cf) (obj2)).a(s);
	//  148  266:aload           9
	//  149  268:aload           7
	//  150  270:invokevirtual   #203 <Method cf android.support.v4.media.cf.a(String)>
	//  151  273:pop             
		((cf) (obj2)).a(acharsequence[0]);
	//  152  274:aload           9
	//  153  276:aload           8
	//  154  278:iconst_0        
	//  155  279:aaload          
	//  156  280:invokevirtual   #206 <Method cf android.support.v4.media.cf.a(CharSequence)>
	//  157  283:pop             
		((cf) (obj2)).b(acharsequence[1]);
	//  158  284:aload           9
	//  159  286:aload           8
	//  160  288:iconst_1        
	//  161  289:aaload          
	//  162  290:invokevirtual   #208 <Method cf cf.b(CharSequence)>
	//  163  293:pop             
		((cf) (obj2)).c(acharsequence[2]);
	//  164  294:aload           9
	//  165  296:aload           8
	//  166  298:iconst_2        
	//  167  299:aaload          
	//  168  300:invokevirtual   #210 <Method cf cf.c(CharSequence)>
	//  169  303:pop             
		((cf) (obj2)).a(((Bitmap) (as1)));
	//  170  304:aload           9
	//  171  306:aload           4
	//  172  308:invokevirtual   #213 <Method cf android.support.v4.media.cf.a(Bitmap)>
	//  173  311:pop             
		((cf) (obj2)).a(((Uri) (obj1)));
	//  174  312:aload           9
	//  175  314:aload           5
	//  176  316:invokevirtual   #216 <Method cf android.support.v4.media.cf.a(Uri)>
	//  177  319:pop             
		((cf) (obj2)).b(uri);
	//  178  320:aload           9
	//  179  322:aload           6
	//  180  324:invokevirtual   #218 <Method cf cf.b(Uri)>
	//  181  327:pop             
		as1 = ((String []) (new Bundle()));
	//  182  328:new             #119 <Class Bundle>
	//  183  331:dup             
	//  184  332:invokespecial   #219 <Method void Bundle()>
	//  185  335:astore          4
		if(b.containsKey("android.media.metadata.BT_FOLDER_TYPE"))
	//* 186  337:aload_0         
	//* 187  338:getfield        #123 <Field Bundle b>
	//* 188  341:ldc1            #95  <String "android.media.metadata.BT_FOLDER_TYPE">
	//* 189  343:invokevirtual   #223 <Method boolean Bundle.containsKey(String)>
	//* 190  346:ifeq            362
			((Bundle) (as1)).putLong("android.media.extra.BT_FOLDER_TYPE", d("android.media.metadata.BT_FOLDER_TYPE"));
	//  191  349:aload           4
	//  192  351:ldc1            #225 <String "android.media.extra.BT_FOLDER_TYPE">
	//  193  353:aload_0         
	//  194  354:ldc1            #95  <String "android.media.metadata.BT_FOLDER_TYPE">
	//  195  356:invokevirtual   #228 <Method long d(String)>
	//  196  359:invokevirtual   #232 <Method void Bundle.putLong(String, long)>
		if(b.containsKey("android.media.metadata.DOWNLOAD_STATUS"))
	//* 197  362:aload_0         
	//* 198  363:getfield        #123 <Field Bundle b>
	//* 199  366:ldc1            #101 <String "android.media.metadata.DOWNLOAD_STATUS">
	//* 200  368:invokevirtual   #223 <Method boolean Bundle.containsKey(String)>
	//* 201  371:ifeq            387
			((Bundle) (as1)).putLong("android.media.extra.DOWNLOAD_STATUS", d("android.media.metadata.DOWNLOAD_STATUS"));
	//  202  374:aload           4
	//  203  376:ldc1            #234 <String "android.media.extra.DOWNLOAD_STATUS">
	//  204  378:aload_0         
	//  205  379:ldc1            #101 <String "android.media.metadata.DOWNLOAD_STATUS">
	//  206  381:invokevirtual   #228 <Method long d(String)>
	//  207  384:invokevirtual   #232 <Method void Bundle.putLong(String, long)>
		if(!((Bundle) (as1)).isEmpty())
	//* 208  387:aload           4
	//* 209  389:invokevirtual   #237 <Method boolean Bundle.isEmpty()>
	//* 210  392:ifne            403
			((cf) (obj2)).a(((Bundle) (as1)));
	//  211  395:aload           9
	//  212  397:aload           4
	//  213  399:invokevirtual   #240 <Method cf android.support.v4.media.cf.a(Bundle)>
	//  214  402:pop             
		g = ((cf) (obj2)).a();
	//  215  403:aload_0         
	//  216  404:aload           9
	//  217  406:invokevirtual   #242 <Method MediaDescriptionCompat android.support.v4.media.cf.a()>
	//  218  409:putfield        #174 <Field MediaDescriptionCompat g>
		return g;
	//  219  412:aload_0         
	//  220  413:getfield        #174 <Field MediaDescriptionCompat g>
	//  221  416:areturn         
	}

	public boolean a(String s)
	{
		return b.containsKey(s);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Bundle b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #223 <Method boolean Bundle.containsKey(String)>
	//    4    8:ireturn         
	}

	public Bundle b()
	{
		return new Bundle(b);
	//    0    0:new             #119 <Class Bundle>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #123 <Field Bundle b>
	//    4    8:invokespecial   #121 <Method void Bundle(Bundle)>
	//    5   11:areturn         
	}

	public CharSequence b(String s)
	{
		return b.getCharSequence(s);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Bundle b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #246 <Method CharSequence Bundle.getCharSequence(String)>
	//    4    8:areturn         
	}

	public Object c()
	{
		if(f == null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field Object f>
	//*   2    4:ifnonnull       42
	//*   3    7:getstatic       #147 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4   10:bipush          21
	//*   5   12:icmplt          42
		{
			Parcel parcel = Parcel.obtain();
	//    6   15:invokestatic    #151 <Method Parcel Parcel.obtain()>
	//    7   18:astore_1        
			writeToParcel(parcel, 0);
	//    8   19:aload_0         
	//    9   20:aload_1         
	//   10   21:iconst_0        
	//   11   22:invokevirtual   #251 <Method void writeToParcel(Parcel, int)>
			parcel.setDataPosition(0);
	//   12   25:aload_1         
	//   13   26:iconst_0        
	//   14   27:invokevirtual   #160 <Method void Parcel.setDataPosition(int)>
			f = android.support.v4.media.cm.a(parcel);
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:invokestatic    #253 <Method Object android.support.v4.media.cm.a(Parcel)>
	//   18   35:putfield        #171 <Field Object f>
			parcel.recycle();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #169 <Method void Parcel.recycle()>
		}
		return f;
	//   21   42:aload_0         
	//   22   43:getfield        #171 <Field Object f>
	//   23   46:areturn         
	}

	public String c(String s)
	{
		s = ((String) (b.getCharSequence(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Bundle b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #246 <Method CharSequence Bundle.getCharSequence(String)>
	//    4    8:astore_1        
		if(s != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          20
			return ((CharSequence) (s)).toString();
	//    7   13:aload_1         
	//    8   14:invokeinterface #257 <Method String CharSequence.toString()>
	//    9   19:areturn         
		else
			return null;
	//   10   20:aconst_null     
	//   11   21:areturn         
	}

	public long d(String s)
	{
		return b.getLong(s, 0L);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Bundle b>
	//    2    4:aload_1         
	//    3    5:lconst_0        
	//    4    6:invokevirtual   #261 <Method long Bundle.getLong(String, long)>
	//    5    9:lreturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Bitmap e(String s)
	{
		try
		{
			s = ((String) ((Bitmap)b.getParcelable(s)));
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field Bundle b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #269 <Method Parcelable Bundle.getParcelable(String)>
	//    4    8:checkcast       #271 <Class Bitmap>
	//    5   11:astore_1        
		}
	//*   6   12:aload_1         
	//*   7   13:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   8   14:astore_1        
		{
			Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", ((Throwable) (s)));
	//    9   15:ldc2            #273 <String "MediaMetadata">
	//   10   18:ldc2            #275 <String "Failed to retrieve a key as Bitmap.">
	//   11   21:aload_1         
	//   12   22:invokestatic    #281 <Method int Log.w(String, String, Throwable)>
	//   13   25:pop             
			return null;
	//   14   26:aconst_null     
	//   15   27:areturn         
		}
		return ((Bitmap) (s));
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(b);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #123 <Field Bundle b>
	//    3    5:invokevirtual   #284 <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ck();
	static final a a;
	private static final String c[] = {
		"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"
	};
	private static final String d[] = {
		"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"
	};
	private static final String e[] = {
		"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"
	};
	final Bundle b;
	private Object f;
	private MediaDescriptionCompat g;

	static 
	{
		a = new a();
	//    0    0:new             #24  <Class a>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void a()>
	//    3    7:putstatic       #29  <Field a a>
		a.put("android.media.metadata.TITLE", ((Object) (Integer.valueOf(1))));
	//    4   10:getstatic       #29  <Field a a>
	//    5   13:ldc1            #31  <String "android.media.metadata.TITLE">
	//    6   15:iconst_1        
	//    7   16:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//    8   19:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//    9   22:pop             
		a.put("android.media.metadata.ARTIST", ((Object) (Integer.valueOf(1))));
	//   10   23:getstatic       #29  <Field a a>
	//   11   26:ldc1            #43  <String "android.media.metadata.ARTIST">
	//   12   28:iconst_1        
	//   13   29:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   14   32:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   15   35:pop             
		a.put("android.media.metadata.DURATION", ((Object) (Integer.valueOf(0))));
	//   16   36:getstatic       #29  <Field a a>
	//   17   39:ldc1            #45  <String "android.media.metadata.DURATION">
	//   18   41:iconst_0        
	//   19   42:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   20   45:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   21   48:pop             
		a.put("android.media.metadata.ALBUM", ((Object) (Integer.valueOf(1))));
	//   22   49:getstatic       #29  <Field a a>
	//   23   52:ldc1            #47  <String "android.media.metadata.ALBUM">
	//   24   54:iconst_1        
	//   25   55:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   26   58:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   27   61:pop             
		a.put("android.media.metadata.AUTHOR", ((Object) (Integer.valueOf(1))));
	//   28   62:getstatic       #29  <Field a a>
	//   29   65:ldc1            #49  <String "android.media.metadata.AUTHOR">
	//   30   67:iconst_1        
	//   31   68:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   32   71:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   33   74:pop             
		a.put("android.media.metadata.WRITER", ((Object) (Integer.valueOf(1))));
	//   34   75:getstatic       #29  <Field a a>
	//   35   78:ldc1            #51  <String "android.media.metadata.WRITER">
	//   36   80:iconst_1        
	//   37   81:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   38   84:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   39   87:pop             
		a.put("android.media.metadata.COMPOSER", ((Object) (Integer.valueOf(1))));
	//   40   88:getstatic       #29  <Field a a>
	//   41   91:ldc1            #53  <String "android.media.metadata.COMPOSER">
	//   42   93:iconst_1        
	//   43   94:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   44   97:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   45  100:pop             
		a.put("android.media.metadata.COMPILATION", ((Object) (Integer.valueOf(1))));
	//   46  101:getstatic       #29  <Field a a>
	//   47  104:ldc1            #55  <String "android.media.metadata.COMPILATION">
	//   48  106:iconst_1        
	//   49  107:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   50  110:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   51  113:pop             
		a.put("android.media.metadata.DATE", ((Object) (Integer.valueOf(1))));
	//   52  114:getstatic       #29  <Field a a>
	//   53  117:ldc1            #57  <String "android.media.metadata.DATE">
	//   54  119:iconst_1        
	//   55  120:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   56  123:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   57  126:pop             
		a.put("android.media.metadata.YEAR", ((Object) (Integer.valueOf(0))));
	//   58  127:getstatic       #29  <Field a a>
	//   59  130:ldc1            #59  <String "android.media.metadata.YEAR">
	//   60  132:iconst_0        
	//   61  133:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   62  136:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   63  139:pop             
		a.put("android.media.metadata.GENRE", ((Object) (Integer.valueOf(1))));
	//   64  140:getstatic       #29  <Field a a>
	//   65  143:ldc1            #61  <String "android.media.metadata.GENRE">
	//   66  145:iconst_1        
	//   67  146:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   68  149:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   69  152:pop             
		a.put("android.media.metadata.TRACK_NUMBER", ((Object) (Integer.valueOf(0))));
	//   70  153:getstatic       #29  <Field a a>
	//   71  156:ldc1            #63  <String "android.media.metadata.TRACK_NUMBER">
	//   72  158:iconst_0        
	//   73  159:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   74  162:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   75  165:pop             
		a.put("android.media.metadata.NUM_TRACKS", ((Object) (Integer.valueOf(0))));
	//   76  166:getstatic       #29  <Field a a>
	//   77  169:ldc1            #65  <String "android.media.metadata.NUM_TRACKS">
	//   78  171:iconst_0        
	//   79  172:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   80  175:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   81  178:pop             
		a.put("android.media.metadata.DISC_NUMBER", ((Object) (Integer.valueOf(0))));
	//   82  179:getstatic       #29  <Field a a>
	//   83  182:ldc1            #67  <String "android.media.metadata.DISC_NUMBER">
	//   84  184:iconst_0        
	//   85  185:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   86  188:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   87  191:pop             
		a.put("android.media.metadata.ALBUM_ARTIST", ((Object) (Integer.valueOf(1))));
	//   88  192:getstatic       #29  <Field a a>
	//   89  195:ldc1            #69  <String "android.media.metadata.ALBUM_ARTIST">
	//   90  197:iconst_1        
	//   91  198:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   92  201:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   93  204:pop             
		a.put("android.media.metadata.ART", ((Object) (Integer.valueOf(2))));
	//   94  205:getstatic       #29  <Field a a>
	//   95  208:ldc1            #71  <String "android.media.metadata.ART">
	//   96  210:iconst_2        
	//   97  211:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//   98  214:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//   99  217:pop             
		a.put("android.media.metadata.ART_URI", ((Object) (Integer.valueOf(1))));
	//  100  218:getstatic       #29  <Field a a>
	//  101  221:ldc1            #73  <String "android.media.metadata.ART_URI">
	//  102  223:iconst_1        
	//  103  224:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  104  227:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  105  230:pop             
		a.put("android.media.metadata.ALBUM_ART", ((Object) (Integer.valueOf(2))));
	//  106  231:getstatic       #29  <Field a a>
	//  107  234:ldc1            #75  <String "android.media.metadata.ALBUM_ART">
	//  108  236:iconst_2        
	//  109  237:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  110  240:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  111  243:pop             
		a.put("android.media.metadata.ALBUM_ART_URI", ((Object) (Integer.valueOf(1))));
	//  112  244:getstatic       #29  <Field a a>
	//  113  247:ldc1            #77  <String "android.media.metadata.ALBUM_ART_URI">
	//  114  249:iconst_1        
	//  115  250:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  116  253:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  117  256:pop             
		a.put("android.media.metadata.USER_RATING", ((Object) (Integer.valueOf(3))));
	//  118  257:getstatic       #29  <Field a a>
	//  119  260:ldc1            #79  <String "android.media.metadata.USER_RATING">
	//  120  262:iconst_3        
	//  121  263:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  122  266:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  123  269:pop             
		a.put("android.media.metadata.RATING", ((Object) (Integer.valueOf(3))));
	//  124  270:getstatic       #29  <Field a a>
	//  125  273:ldc1            #81  <String "android.media.metadata.RATING">
	//  126  275:iconst_3        
	//  127  276:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  128  279:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  129  282:pop             
		a.put("android.media.metadata.DISPLAY_TITLE", ((Object) (Integer.valueOf(1))));
	//  130  283:getstatic       #29  <Field a a>
	//  131  286:ldc1            #83  <String "android.media.metadata.DISPLAY_TITLE">
	//  132  288:iconst_1        
	//  133  289:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  134  292:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  135  295:pop             
		a.put("android.media.metadata.DISPLAY_SUBTITLE", ((Object) (Integer.valueOf(1))));
	//  136  296:getstatic       #29  <Field a a>
	//  137  299:ldc1            #85  <String "android.media.metadata.DISPLAY_SUBTITLE">
	//  138  301:iconst_1        
	//  139  302:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  140  305:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  141  308:pop             
		a.put("android.media.metadata.DISPLAY_DESCRIPTION", ((Object) (Integer.valueOf(1))));
	//  142  309:getstatic       #29  <Field a a>
	//  143  312:ldc1            #87  <String "android.media.metadata.DISPLAY_DESCRIPTION">
	//  144  314:iconst_1        
	//  145  315:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  146  318:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  147  321:pop             
		a.put("android.media.metadata.DISPLAY_ICON", ((Object) (Integer.valueOf(2))));
	//  148  322:getstatic       #29  <Field a a>
	//  149  325:ldc1            #89  <String "android.media.metadata.DISPLAY_ICON">
	//  150  327:iconst_2        
	//  151  328:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  152  331:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  153  334:pop             
		a.put("android.media.metadata.DISPLAY_ICON_URI", ((Object) (Integer.valueOf(1))));
	//  154  335:getstatic       #29  <Field a a>
	//  155  338:ldc1            #91  <String "android.media.metadata.DISPLAY_ICON_URI">
	//  156  340:iconst_1        
	//  157  341:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  158  344:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  159  347:pop             
		a.put("android.media.metadata.MEDIA_ID", ((Object) (Integer.valueOf(1))));
	//  160  348:getstatic       #29  <Field a a>
	//  161  351:ldc1            #93  <String "android.media.metadata.MEDIA_ID">
	//  162  353:iconst_1        
	//  163  354:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  164  357:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  165  360:pop             
		a.put("android.media.metadata.BT_FOLDER_TYPE", ((Object) (Integer.valueOf(0))));
	//  166  361:getstatic       #29  <Field a a>
	//  167  364:ldc1            #95  <String "android.media.metadata.BT_FOLDER_TYPE">
	//  168  366:iconst_0        
	//  169  367:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  170  370:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  171  373:pop             
		a.put("android.media.metadata.MEDIA_URI", ((Object) (Integer.valueOf(1))));
	//  172  374:getstatic       #29  <Field a a>
	//  173  377:ldc1            #97  <String "android.media.metadata.MEDIA_URI">
	//  174  379:iconst_1        
	//  175  380:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  176  383:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  177  386:pop             
		a.put("android.media.metadata.ADVERTISEMENT", ((Object) (Integer.valueOf(0))));
	//  178  387:getstatic       #29  <Field a a>
	//  179  390:ldc1            #99  <String "android.media.metadata.ADVERTISEMENT">
	//  180  392:iconst_0        
	//  181  393:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  182  396:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  183  399:pop             
		a.put("android.media.metadata.DOWNLOAD_STATUS", ((Object) (Integer.valueOf(0))));
	//  184  400:getstatic       #29  <Field a a>
	//  185  403:ldc1            #101 <String "android.media.metadata.DOWNLOAD_STATUS">
	//  186  405:iconst_0        
	//  187  406:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//  188  409:invokevirtual   #41  <Method Object a.put(Object, Object)>
	//  189  412:pop             
	//  190  413:bipush          7
	//  191  415:anewarray       String[]
	//  192  418:dup             
	//  193  419:iconst_0        
	//  194  420:ldc1            #31  <String "android.media.metadata.TITLE">
	//  195  422:aastore         
	//  196  423:dup             
	//  197  424:iconst_1        
	//  198  425:ldc1            #43  <String "android.media.metadata.ARTIST">
	//  199  427:aastore         
	//  200  428:dup             
	//  201  429:iconst_2        
	//  202  430:ldc1            #47  <String "android.media.metadata.ALBUM">
	//  203  432:aastore         
	//  204  433:dup             
	//  205  434:iconst_3        
	//  206  435:ldc1            #69  <String "android.media.metadata.ALBUM_ARTIST">
	//  207  437:aastore         
	//  208  438:dup             
	//  209  439:iconst_4        
	//  210  440:ldc1            #51  <String "android.media.metadata.WRITER">
	//  211  442:aastore         
	//  212  443:dup             
	//  213  444:iconst_5        
	//  214  445:ldc1            #49  <String "android.media.metadata.AUTHOR">
	//  215  447:aastore         
	//  216  448:dup             
	//  217  449:bipush          6
	//  218  451:ldc1            #53  <String "android.media.metadata.COMPOSER">
	//  219  453:aastore         
	//  220  454:putstatic       #105 <Field String[] c>
	//  221  457:iconst_3        
	//  222  458:anewarray       String[]
	//  223  461:dup             
	//  224  462:iconst_0        
	//  225  463:ldc1            #89  <String "android.media.metadata.DISPLAY_ICON">
	//  226  465:aastore         
	//  227  466:dup             
	//  228  467:iconst_1        
	//  229  468:ldc1            #71  <String "android.media.metadata.ART">
	//  230  470:aastore         
	//  231  471:dup             
	//  232  472:iconst_2        
	//  233  473:ldc1            #75  <String "android.media.metadata.ALBUM_ART">
	//  234  475:aastore         
	//  235  476:putstatic       #107 <Field String[] d>
	//  236  479:iconst_3        
	//  237  480:anewarray       String[]
	//  238  483:dup             
	//  239  484:iconst_0        
	//  240  485:ldc1            #91  <String "android.media.metadata.DISPLAY_ICON_URI">
	//  241  487:aastore         
	//  242  488:dup             
	//  243  489:iconst_1        
	//  244  490:ldc1            #73  <String "android.media.metadata.ART_URI">
	//  245  492:aastore         
	//  246  493:dup             
	//  247  494:iconst_2        
	//  248  495:ldc1            #77  <String "android.media.metadata.ALBUM_ART_URI">
	//  249  497:aastore         
	//  250  498:putstatic       #109 <Field String[] e>
	//  251  501:new             #111 <Class ck>
	//  252  504:dup             
	//  253  505:invokespecial   #112 <Method void ck()>
	//  254  508:putstatic       #114 <Field android.os.Parcelable$Creator CREATOR>
	//* 255  511:return          
	}
}
