// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import android.support.v4.util.ArrayMap;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v4.media:
//			MediaMetadataCompatApi21

public final class MediaMetadataCompat
	implements Parcelable
{
	public static interface BitmapKey
		extends Annotation
	{
	}

	public static interface LongKey
		extends Annotation
	{
	}

	public static interface RatingKey
		extends Annotation
	{
	}

	public static interface TextKey
		extends Annotation
	{
	}


	MediaMetadataCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void Object()>
		mBundle = parcel.readBundle();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #135 <Method Bundle Parcel.readBundle()>
	//    5    9:putfield        #137 <Field Bundle mBundle>
		mBundle.setClassLoader(((Class) (android/support/v4/media/MediaMetadataCompat)).getClassLoader());
	//    6   12:aload_0         
	//    7   13:getfield        #137 <Field Bundle mBundle>
	//    8   16:ldc1            #2   <Class MediaMetadataCompat>
	//    9   18:invokevirtual   #143 <Method ClassLoader Class.getClassLoader()>
	//   10   21:invokevirtual   #149 <Method void Bundle.setClassLoader(ClassLoader)>
	//   11   24:return          
	}

	public static MediaMetadataCompat fromMediaMetadata(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          51
	//*   2    4:getstatic       #157 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          51
		{
			Parcel parcel = Parcel.obtain();
	//    5   12:invokestatic    #161 <Method Parcel Parcel.obtain()>
	//    6   15:astore_1        
			MediaMetadataCompatApi21.writeToParcel(obj, parcel, 0);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:iconst_0        
	//   10   19:invokestatic    #167 <Method void MediaMetadataCompatApi21.writeToParcel(Object, Parcel, int)>
			parcel.setDataPosition(0);
	//   11   22:aload_1         
	//   12   23:iconst_0        
	//   13   24:invokevirtual   #171 <Method void Parcel.setDataPosition(int)>
			MediaMetadataCompat mediametadatacompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
	//   14   27:getstatic       #126 <Field android.os.Parcelable$Creator CREATOR>
	//   15   30:aload_1         
	//   16   31:invokeinterface #177 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   17   36:checkcast       #2   <Class MediaMetadataCompat>
	//   18   39:astore_2        
			parcel.recycle();
	//   19   40:aload_1         
	//   20   41:invokevirtual   #180 <Method void Parcel.recycle()>
			mediametadatacompat.mMetadataObj = obj;
	//   21   44:aload_2         
	//   22   45:aload_0         
	//   23   46:putfield        #182 <Field Object mMetadataObj>
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

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeBundle(mBundle);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #137 <Field Bundle mBundle>
	//    3    5:invokevirtual   #189 <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaMetadataCompat createFromParcel(Parcel parcel)
		{
			return new MediaMetadataCompat(parcel);
		//    0    0:new             #9   <Class MediaMetadataCompat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void MediaMetadataCompat(Parcel)>
		//    4    8:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method MediaMetadataCompat createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public MediaMetadataCompat[] newArray(int i)
		{
			return new MediaMetadataCompat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaMetadataCompat[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #27  <Method MediaMetadataCompat[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	static final ArrayMap METADATA_KEYS_TYPE;
	private static final String PREFERRED_BITMAP_ORDER[] = {
		"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"
	};
	private static final String PREFERRED_DESCRIPTION_ORDER[] = {
		"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"
	};
	private static final String PREFERRED_URI_ORDER[] = {
		"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"
	};
	final Bundle mBundle;
	private Object mMetadataObj;

	static 
	{
		METADATA_KEYS_TYPE = new ArrayMap();
	//    0    0:new             #38  <Class ArrayMap>
	//    1    3:dup             
	//    2    4:invokespecial   #41  <Method void ArrayMap()>
	//    3    7:putstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
		METADATA_KEYS_TYPE.put("android.media.metadata.TITLE", ((Object) (Integer.valueOf(1))));
	//    4   10:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//    5   13:ldc1            #45  <String "android.media.metadata.TITLE">
	//    6   15:iconst_1        
	//    7   16:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//    8   19:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//    9   22:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ARTIST", ((Object) (Integer.valueOf(1))));
	//   10   23:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   11   26:ldc1            #57  <String "android.media.metadata.ARTIST">
	//   12   28:iconst_1        
	//   13   29:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   14   32:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   15   35:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DURATION", ((Object) (Integer.valueOf(0))));
	//   16   36:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   17   39:ldc1            #59  <String "android.media.metadata.DURATION">
	//   18   41:iconst_0        
	//   19   42:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   20   45:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   21   48:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM", ((Object) (Integer.valueOf(1))));
	//   22   49:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   23   52:ldc1            #61  <String "android.media.metadata.ALBUM">
	//   24   54:iconst_1        
	//   25   55:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   26   58:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   27   61:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.AUTHOR", ((Object) (Integer.valueOf(1))));
	//   28   62:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   29   65:ldc1            #63  <String "android.media.metadata.AUTHOR">
	//   30   67:iconst_1        
	//   31   68:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   32   71:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   33   74:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.WRITER", ((Object) (Integer.valueOf(1))));
	//   34   75:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   35   78:ldc1            #65  <String "android.media.metadata.WRITER">
	//   36   80:iconst_1        
	//   37   81:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   38   84:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   39   87:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.COMPOSER", ((Object) (Integer.valueOf(1))));
	//   40   88:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   41   91:ldc1            #67  <String "android.media.metadata.COMPOSER">
	//   42   93:iconst_1        
	//   43   94:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   44   97:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   45  100:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.COMPILATION", ((Object) (Integer.valueOf(1))));
	//   46  101:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   47  104:ldc1            #69  <String "android.media.metadata.COMPILATION">
	//   48  106:iconst_1        
	//   49  107:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   50  110:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   51  113:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DATE", ((Object) (Integer.valueOf(1))));
	//   52  114:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   53  117:ldc1            #71  <String "android.media.metadata.DATE">
	//   54  119:iconst_1        
	//   55  120:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   56  123:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   57  126:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.YEAR", ((Object) (Integer.valueOf(0))));
	//   58  127:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   59  130:ldc1            #73  <String "android.media.metadata.YEAR">
	//   60  132:iconst_0        
	//   61  133:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   62  136:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   63  139:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.GENRE", ((Object) (Integer.valueOf(1))));
	//   64  140:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   65  143:ldc1            #75  <String "android.media.metadata.GENRE">
	//   66  145:iconst_1        
	//   67  146:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   68  149:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   69  152:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.TRACK_NUMBER", ((Object) (Integer.valueOf(0))));
	//   70  153:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   71  156:ldc1            #77  <String "android.media.metadata.TRACK_NUMBER">
	//   72  158:iconst_0        
	//   73  159:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   74  162:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   75  165:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.NUM_TRACKS", ((Object) (Integer.valueOf(0))));
	//   76  166:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   77  169:ldc1            #79  <String "android.media.metadata.NUM_TRACKS">
	//   78  171:iconst_0        
	//   79  172:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   80  175:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   81  178:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISC_NUMBER", ((Object) (Integer.valueOf(0))));
	//   82  179:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   83  182:ldc1            #81  <String "android.media.metadata.DISC_NUMBER">
	//   84  184:iconst_0        
	//   85  185:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   86  188:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   87  191:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ARTIST", ((Object) (Integer.valueOf(1))));
	//   88  192:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   89  195:ldc1            #83  <String "android.media.metadata.ALBUM_ARTIST">
	//   90  197:iconst_1        
	//   91  198:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   92  201:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   93  204:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ART", ((Object) (Integer.valueOf(2))));
	//   94  205:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//   95  208:ldc1            #85  <String "android.media.metadata.ART">
	//   96  210:iconst_2        
	//   97  211:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//   98  214:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//   99  217:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ART_URI", ((Object) (Integer.valueOf(1))));
	//  100  218:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  101  221:ldc1            #87  <String "android.media.metadata.ART_URI">
	//  102  223:iconst_1        
	//  103  224:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  104  227:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  105  230:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ART", ((Object) (Integer.valueOf(2))));
	//  106  231:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  107  234:ldc1            #89  <String "android.media.metadata.ALBUM_ART">
	//  108  236:iconst_2        
	//  109  237:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  110  240:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  111  243:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ALBUM_ART_URI", ((Object) (Integer.valueOf(1))));
	//  112  244:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  113  247:ldc1            #91  <String "android.media.metadata.ALBUM_ART_URI">
	//  114  249:iconst_1        
	//  115  250:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  116  253:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  117  256:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.USER_RATING", ((Object) (Integer.valueOf(3))));
	//  118  257:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  119  260:ldc1            #93  <String "android.media.metadata.USER_RATING">
	//  120  262:iconst_3        
	//  121  263:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  122  266:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  123  269:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.RATING", ((Object) (Integer.valueOf(3))));
	//  124  270:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  125  273:ldc1            #95  <String "android.media.metadata.RATING">
	//  126  275:iconst_3        
	//  127  276:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  128  279:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  129  282:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_TITLE", ((Object) (Integer.valueOf(1))));
	//  130  283:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  131  286:ldc1            #97  <String "android.media.metadata.DISPLAY_TITLE">
	//  132  288:iconst_1        
	//  133  289:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  134  292:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  135  295:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_SUBTITLE", ((Object) (Integer.valueOf(1))));
	//  136  296:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  137  299:ldc1            #99  <String "android.media.metadata.DISPLAY_SUBTITLE">
	//  138  301:iconst_1        
	//  139  302:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  140  305:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  141  308:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_DESCRIPTION", ((Object) (Integer.valueOf(1))));
	//  142  309:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  143  312:ldc1            #101 <String "android.media.metadata.DISPLAY_DESCRIPTION">
	//  144  314:iconst_1        
	//  145  315:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  146  318:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  147  321:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_ICON", ((Object) (Integer.valueOf(2))));
	//  148  322:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  149  325:ldc1            #103 <String "android.media.metadata.DISPLAY_ICON">
	//  150  327:iconst_2        
	//  151  328:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  152  331:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  153  334:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DISPLAY_ICON_URI", ((Object) (Integer.valueOf(1))));
	//  154  335:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  155  338:ldc1            #105 <String "android.media.metadata.DISPLAY_ICON_URI">
	//  156  340:iconst_1        
	//  157  341:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  158  344:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  159  347:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.MEDIA_ID", ((Object) (Integer.valueOf(1))));
	//  160  348:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  161  351:ldc1            #107 <String "android.media.metadata.MEDIA_ID">
	//  162  353:iconst_1        
	//  163  354:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  164  357:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  165  360:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.BT_FOLDER_TYPE", ((Object) (Integer.valueOf(0))));
	//  166  361:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  167  364:ldc1            #109 <String "android.media.metadata.BT_FOLDER_TYPE">
	//  168  366:iconst_0        
	//  169  367:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  170  370:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  171  373:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.MEDIA_URI", ((Object) (Integer.valueOf(1))));
	//  172  374:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  173  377:ldc1            #111 <String "android.media.metadata.MEDIA_URI">
	//  174  379:iconst_1        
	//  175  380:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  176  383:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  177  386:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.ADVERTISEMENT", ((Object) (Integer.valueOf(0))));
	//  178  387:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  179  390:ldc1            #113 <String "android.media.metadata.ADVERTISEMENT">
	//  180  392:iconst_0        
	//  181  393:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  182  396:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  183  399:pop             
		METADATA_KEYS_TYPE.put("android.media.metadata.DOWNLOAD_STATUS", ((Object) (Integer.valueOf(0))));
	//  184  400:getstatic       #43  <Field ArrayMap METADATA_KEYS_TYPE>
	//  185  403:ldc1            #115 <String "android.media.metadata.DOWNLOAD_STATUS">
	//  186  405:iconst_0        
	//  187  406:invokestatic    #51  <Method Integer Integer.valueOf(int)>
	//  188  409:invokevirtual   #55  <Method Object ArrayMap.put(Object, Object)>
	//  189  412:pop             
	//  190  413:bipush          7
	//  191  415:anewarray       String[]
	//  192  418:dup             
	//  193  419:iconst_0        
	//  194  420:ldc1            #45  <String "android.media.metadata.TITLE">
	//  195  422:aastore         
	//  196  423:dup             
	//  197  424:iconst_1        
	//  198  425:ldc1            #57  <String "android.media.metadata.ARTIST">
	//  199  427:aastore         
	//  200  428:dup             
	//  201  429:iconst_2        
	//  202  430:ldc1            #61  <String "android.media.metadata.ALBUM">
	//  203  432:aastore         
	//  204  433:dup             
	//  205  434:iconst_3        
	//  206  435:ldc1            #83  <String "android.media.metadata.ALBUM_ARTIST">
	//  207  437:aastore         
	//  208  438:dup             
	//  209  439:iconst_4        
	//  210  440:ldc1            #65  <String "android.media.metadata.WRITER">
	//  211  442:aastore         
	//  212  443:dup             
	//  213  444:iconst_5        
	//  214  445:ldc1            #63  <String "android.media.metadata.AUTHOR">
	//  215  447:aastore         
	//  216  448:dup             
	//  217  449:bipush          6
	//  218  451:ldc1            #67  <String "android.media.metadata.COMPOSER">
	//  219  453:aastore         
	//  220  454:putstatic       #119 <Field String[] PREFERRED_DESCRIPTION_ORDER>
	//  221  457:iconst_3        
	//  222  458:anewarray       String[]
	//  223  461:dup             
	//  224  462:iconst_0        
	//  225  463:ldc1            #103 <String "android.media.metadata.DISPLAY_ICON">
	//  226  465:aastore         
	//  227  466:dup             
	//  228  467:iconst_1        
	//  229  468:ldc1            #85  <String "android.media.metadata.ART">
	//  230  470:aastore         
	//  231  471:dup             
	//  232  472:iconst_2        
	//  233  473:ldc1            #89  <String "android.media.metadata.ALBUM_ART">
	//  234  475:aastore         
	//  235  476:putstatic       #121 <Field String[] PREFERRED_BITMAP_ORDER>
	//  236  479:iconst_3        
	//  237  480:anewarray       String[]
	//  238  483:dup             
	//  239  484:iconst_0        
	//  240  485:ldc1            #105 <String "android.media.metadata.DISPLAY_ICON_URI">
	//  241  487:aastore         
	//  242  488:dup             
	//  243  489:iconst_1        
	//  244  490:ldc1            #87  <String "android.media.metadata.ART_URI">
	//  245  492:aastore         
	//  246  493:dup             
	//  247  494:iconst_2        
	//  248  495:ldc1            #91  <String "android.media.metadata.ALBUM_ART_URI">
	//  249  497:aastore         
	//  250  498:putstatic       #123 <Field String[] PREFERRED_URI_ORDER>
	//  251  501:new             #8   <Class MediaMetadataCompat$1>
	//  252  504:dup             
	//  253  505:invokespecial   #124 <Method void MediaMetadataCompat$1()>
	//  254  508:putstatic       #126 <Field android.os.Parcelable$Creator CREATOR>
	//* 255  511:return          
	}
}
