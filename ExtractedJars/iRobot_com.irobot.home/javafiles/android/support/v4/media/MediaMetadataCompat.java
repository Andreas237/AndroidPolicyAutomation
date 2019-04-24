// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media;

import android.os.*;
import android.support.v4.f.a;

// Referenced classes of package android.support.v4.media:
//			f

public final class MediaMetadataCompat
	implements Parcelable
{

	MediaMetadataCompat(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void Object()>
		b = parcel.readBundle();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #123 <Method Bundle Parcel.readBundle()>
	//    5    9:putfield        #125 <Field Bundle b>
	//    6   12:return          
	}

	public static MediaMetadataCompat a(Object obj)
	{
		if(obj != null && android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:aload_0         
	//*   1    1:ifnull          51
	//*   2    4:getstatic       #132 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    7:bipush          21
	//*   4    9:icmplt          51
		{
			Parcel parcel = Parcel.obtain();
	//    5   12:invokestatic    #136 <Method Parcel Parcel.obtain()>
	//    6   15:astore_1        
			android.support.v4.media.f.a(obj, parcel, 0);
	//    7   16:aload_0         
	//    8   17:aload_1         
	//    9   18:iconst_0        
	//   10   19:invokestatic    #141 <Method void android.support.v4.media.f.a(Object, Parcel, int)>
			parcel.setDataPosition(0);
	//   11   22:aload_1         
	//   12   23:iconst_0        
	//   13   24:invokevirtual   #145 <Method void Parcel.setDataPosition(int)>
			MediaMetadataCompat mediametadatacompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
	//   14   27:getstatic       #114 <Field android.os.Parcelable$Creator CREATOR>
	//   15   30:aload_1         
	//   16   31:invokeinterface #151 <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   17   36:checkcast       #2   <Class MediaMetadataCompat>
	//   18   39:astore_2        
			parcel.recycle();
	//   19   40:aload_1         
	//   20   41:invokevirtual   #154 <Method void Parcel.recycle()>
			mediametadatacompat.f = obj;
	//   21   44:aload_2         
	//   22   45:aload_0         
	//   23   46:putfield        #156 <Field Object f>
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
		parcel.writeBundle(b);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #125 <Field Bundle b>
	//    3    5:invokevirtual   #164 <Method void Parcel.writeBundle(Bundle)>
	//    4    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public MediaMetadataCompat a(Parcel parcel)
		{
			return new MediaMetadataCompat(parcel);
		//    0    0:new             #9   <Class MediaMetadataCompat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #19  <Method void MediaMetadataCompat(Parcel)>
		//    4    8:areturn         
		}

		public MediaMetadataCompat[] a(int i)
		{
			return new MediaMetadataCompat[i];
		//    0    0:iload_1         
		//    1    1:anewarray       MediaMetadataCompat[]
		//    2    4:areturn         
		}

		public Object createFromParcel(Parcel parcel)
		{
			return ((Object) (a(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method MediaMetadataCompat a(Parcel)>
		//    3    5:areturn         
		}

		public Object[] newArray(int i)
		{
			return ((Object []) (a(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #28  <Method MediaMetadataCompat[] a(int)>
		//    3    5:areturn         
		}

	}
;
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

	static 
	{
		a = new a();
	//    0    0:new             #26  <Class a>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void a()>
	//    3    7:putstatic       #31  <Field a a>
		a.put("android.media.metadata.TITLE", ((Object) (Integer.valueOf(1))));
	//    4   10:getstatic       #31  <Field a a>
	//    5   13:ldc1            #33  <String "android.media.metadata.TITLE">
	//    6   15:iconst_1        
	//    7   16:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//    8   19:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//    9   22:pop             
		a.put("android.media.metadata.ARTIST", ((Object) (Integer.valueOf(1))));
	//   10   23:getstatic       #31  <Field a a>
	//   11   26:ldc1            #45  <String "android.media.metadata.ARTIST">
	//   12   28:iconst_1        
	//   13   29:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   14   32:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   15   35:pop             
		a.put("android.media.metadata.DURATION", ((Object) (Integer.valueOf(0))));
	//   16   36:getstatic       #31  <Field a a>
	//   17   39:ldc1            #47  <String "android.media.metadata.DURATION">
	//   18   41:iconst_0        
	//   19   42:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   20   45:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   21   48:pop             
		a.put("android.media.metadata.ALBUM", ((Object) (Integer.valueOf(1))));
	//   22   49:getstatic       #31  <Field a a>
	//   23   52:ldc1            #49  <String "android.media.metadata.ALBUM">
	//   24   54:iconst_1        
	//   25   55:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   26   58:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   27   61:pop             
		a.put("android.media.metadata.AUTHOR", ((Object) (Integer.valueOf(1))));
	//   28   62:getstatic       #31  <Field a a>
	//   29   65:ldc1            #51  <String "android.media.metadata.AUTHOR">
	//   30   67:iconst_1        
	//   31   68:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   32   71:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   33   74:pop             
		a.put("android.media.metadata.WRITER", ((Object) (Integer.valueOf(1))));
	//   34   75:getstatic       #31  <Field a a>
	//   35   78:ldc1            #53  <String "android.media.metadata.WRITER">
	//   36   80:iconst_1        
	//   37   81:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   38   84:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   39   87:pop             
		a.put("android.media.metadata.COMPOSER", ((Object) (Integer.valueOf(1))));
	//   40   88:getstatic       #31  <Field a a>
	//   41   91:ldc1            #55  <String "android.media.metadata.COMPOSER">
	//   42   93:iconst_1        
	//   43   94:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   44   97:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   45  100:pop             
		a.put("android.media.metadata.COMPILATION", ((Object) (Integer.valueOf(1))));
	//   46  101:getstatic       #31  <Field a a>
	//   47  104:ldc1            #57  <String "android.media.metadata.COMPILATION">
	//   48  106:iconst_1        
	//   49  107:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   50  110:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   51  113:pop             
		a.put("android.media.metadata.DATE", ((Object) (Integer.valueOf(1))));
	//   52  114:getstatic       #31  <Field a a>
	//   53  117:ldc1            #59  <String "android.media.metadata.DATE">
	//   54  119:iconst_1        
	//   55  120:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   56  123:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   57  126:pop             
		a.put("android.media.metadata.YEAR", ((Object) (Integer.valueOf(0))));
	//   58  127:getstatic       #31  <Field a a>
	//   59  130:ldc1            #61  <String "android.media.metadata.YEAR">
	//   60  132:iconst_0        
	//   61  133:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   62  136:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   63  139:pop             
		a.put("android.media.metadata.GENRE", ((Object) (Integer.valueOf(1))));
	//   64  140:getstatic       #31  <Field a a>
	//   65  143:ldc1            #63  <String "android.media.metadata.GENRE">
	//   66  145:iconst_1        
	//   67  146:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   68  149:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   69  152:pop             
		a.put("android.media.metadata.TRACK_NUMBER", ((Object) (Integer.valueOf(0))));
	//   70  153:getstatic       #31  <Field a a>
	//   71  156:ldc1            #65  <String "android.media.metadata.TRACK_NUMBER">
	//   72  158:iconst_0        
	//   73  159:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   74  162:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   75  165:pop             
		a.put("android.media.metadata.NUM_TRACKS", ((Object) (Integer.valueOf(0))));
	//   76  166:getstatic       #31  <Field a a>
	//   77  169:ldc1            #67  <String "android.media.metadata.NUM_TRACKS">
	//   78  171:iconst_0        
	//   79  172:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   80  175:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   81  178:pop             
		a.put("android.media.metadata.DISC_NUMBER", ((Object) (Integer.valueOf(0))));
	//   82  179:getstatic       #31  <Field a a>
	//   83  182:ldc1            #69  <String "android.media.metadata.DISC_NUMBER">
	//   84  184:iconst_0        
	//   85  185:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   86  188:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   87  191:pop             
		a.put("android.media.metadata.ALBUM_ARTIST", ((Object) (Integer.valueOf(1))));
	//   88  192:getstatic       #31  <Field a a>
	//   89  195:ldc1            #71  <String "android.media.metadata.ALBUM_ARTIST">
	//   90  197:iconst_1        
	//   91  198:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   92  201:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   93  204:pop             
		a.put("android.media.metadata.ART", ((Object) (Integer.valueOf(2))));
	//   94  205:getstatic       #31  <Field a a>
	//   95  208:ldc1            #73  <String "android.media.metadata.ART">
	//   96  210:iconst_2        
	//   97  211:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//   98  214:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//   99  217:pop             
		a.put("android.media.metadata.ART_URI", ((Object) (Integer.valueOf(1))));
	//  100  218:getstatic       #31  <Field a a>
	//  101  221:ldc1            #75  <String "android.media.metadata.ART_URI">
	//  102  223:iconst_1        
	//  103  224:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  104  227:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  105  230:pop             
		a.put("android.media.metadata.ALBUM_ART", ((Object) (Integer.valueOf(2))));
	//  106  231:getstatic       #31  <Field a a>
	//  107  234:ldc1            #77  <String "android.media.metadata.ALBUM_ART">
	//  108  236:iconst_2        
	//  109  237:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  110  240:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  111  243:pop             
		a.put("android.media.metadata.ALBUM_ART_URI", ((Object) (Integer.valueOf(1))));
	//  112  244:getstatic       #31  <Field a a>
	//  113  247:ldc1            #79  <String "android.media.metadata.ALBUM_ART_URI">
	//  114  249:iconst_1        
	//  115  250:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  116  253:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  117  256:pop             
		a.put("android.media.metadata.USER_RATING", ((Object) (Integer.valueOf(3))));
	//  118  257:getstatic       #31  <Field a a>
	//  119  260:ldc1            #81  <String "android.media.metadata.USER_RATING">
	//  120  262:iconst_3        
	//  121  263:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  122  266:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  123  269:pop             
		a.put("android.media.metadata.RATING", ((Object) (Integer.valueOf(3))));
	//  124  270:getstatic       #31  <Field a a>
	//  125  273:ldc1            #83  <String "android.media.metadata.RATING">
	//  126  275:iconst_3        
	//  127  276:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  128  279:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  129  282:pop             
		a.put("android.media.metadata.DISPLAY_TITLE", ((Object) (Integer.valueOf(1))));
	//  130  283:getstatic       #31  <Field a a>
	//  131  286:ldc1            #85  <String "android.media.metadata.DISPLAY_TITLE">
	//  132  288:iconst_1        
	//  133  289:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  134  292:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  135  295:pop             
		a.put("android.media.metadata.DISPLAY_SUBTITLE", ((Object) (Integer.valueOf(1))));
	//  136  296:getstatic       #31  <Field a a>
	//  137  299:ldc1            #87  <String "android.media.metadata.DISPLAY_SUBTITLE">
	//  138  301:iconst_1        
	//  139  302:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  140  305:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  141  308:pop             
		a.put("android.media.metadata.DISPLAY_DESCRIPTION", ((Object) (Integer.valueOf(1))));
	//  142  309:getstatic       #31  <Field a a>
	//  143  312:ldc1            #89  <String "android.media.metadata.DISPLAY_DESCRIPTION">
	//  144  314:iconst_1        
	//  145  315:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  146  318:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  147  321:pop             
		a.put("android.media.metadata.DISPLAY_ICON", ((Object) (Integer.valueOf(2))));
	//  148  322:getstatic       #31  <Field a a>
	//  149  325:ldc1            #91  <String "android.media.metadata.DISPLAY_ICON">
	//  150  327:iconst_2        
	//  151  328:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  152  331:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  153  334:pop             
		a.put("android.media.metadata.DISPLAY_ICON_URI", ((Object) (Integer.valueOf(1))));
	//  154  335:getstatic       #31  <Field a a>
	//  155  338:ldc1            #93  <String "android.media.metadata.DISPLAY_ICON_URI">
	//  156  340:iconst_1        
	//  157  341:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  158  344:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  159  347:pop             
		a.put("android.media.metadata.MEDIA_ID", ((Object) (Integer.valueOf(1))));
	//  160  348:getstatic       #31  <Field a a>
	//  161  351:ldc1            #95  <String "android.media.metadata.MEDIA_ID">
	//  162  353:iconst_1        
	//  163  354:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  164  357:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  165  360:pop             
		a.put("android.media.metadata.BT_FOLDER_TYPE", ((Object) (Integer.valueOf(0))));
	//  166  361:getstatic       #31  <Field a a>
	//  167  364:ldc1            #97  <String "android.media.metadata.BT_FOLDER_TYPE">
	//  168  366:iconst_0        
	//  169  367:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  170  370:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  171  373:pop             
		a.put("android.media.metadata.MEDIA_URI", ((Object) (Integer.valueOf(1))));
	//  172  374:getstatic       #31  <Field a a>
	//  173  377:ldc1            #99  <String "android.media.metadata.MEDIA_URI">
	//  174  379:iconst_1        
	//  175  380:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  176  383:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  177  386:pop             
		a.put("android.media.metadata.ADVERTISEMENT", ((Object) (Integer.valueOf(0))));
	//  178  387:getstatic       #31  <Field a a>
	//  179  390:ldc1            #101 <String "android.media.metadata.ADVERTISEMENT">
	//  180  392:iconst_0        
	//  181  393:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  182  396:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  183  399:pop             
		a.put("android.media.metadata.DOWNLOAD_STATUS", ((Object) (Integer.valueOf(0))));
	//  184  400:getstatic       #31  <Field a a>
	//  185  403:ldc1            #103 <String "android.media.metadata.DOWNLOAD_STATUS">
	//  186  405:iconst_0        
	//  187  406:invokestatic    #39  <Method Integer Integer.valueOf(int)>
	//  188  409:invokevirtual   #43  <Method Object a.put(Object, Object)>
	//  189  412:pop             
	//  190  413:bipush          7
	//  191  415:anewarray       String[]
	//  192  418:dup             
	//  193  419:iconst_0        
	//  194  420:ldc1            #33  <String "android.media.metadata.TITLE">
	//  195  422:aastore         
	//  196  423:dup             
	//  197  424:iconst_1        
	//  198  425:ldc1            #45  <String "android.media.metadata.ARTIST">
	//  199  427:aastore         
	//  200  428:dup             
	//  201  429:iconst_2        
	//  202  430:ldc1            #49  <String "android.media.metadata.ALBUM">
	//  203  432:aastore         
	//  204  433:dup             
	//  205  434:iconst_3        
	//  206  435:ldc1            #71  <String "android.media.metadata.ALBUM_ARTIST">
	//  207  437:aastore         
	//  208  438:dup             
	//  209  439:iconst_4        
	//  210  440:ldc1            #53  <String "android.media.metadata.WRITER">
	//  211  442:aastore         
	//  212  443:dup             
	//  213  444:iconst_5        
	//  214  445:ldc1            #51  <String "android.media.metadata.AUTHOR">
	//  215  447:aastore         
	//  216  448:dup             
	//  217  449:bipush          6
	//  218  451:ldc1            #55  <String "android.media.metadata.COMPOSER">
	//  219  453:aastore         
	//  220  454:putstatic       #107 <Field String[] c>
	//  221  457:iconst_3        
	//  222  458:anewarray       String[]
	//  223  461:dup             
	//  224  462:iconst_0        
	//  225  463:ldc1            #91  <String "android.media.metadata.DISPLAY_ICON">
	//  226  465:aastore         
	//  227  466:dup             
	//  228  467:iconst_1        
	//  229  468:ldc1            #73  <String "android.media.metadata.ART">
	//  230  470:aastore         
	//  231  471:dup             
	//  232  472:iconst_2        
	//  233  473:ldc1            #77  <String "android.media.metadata.ALBUM_ART">
	//  234  475:aastore         
	//  235  476:putstatic       #109 <Field String[] d>
	//  236  479:iconst_3        
	//  237  480:anewarray       String[]
	//  238  483:dup             
	//  239  484:iconst_0        
	//  240  485:ldc1            #93  <String "android.media.metadata.DISPLAY_ICON_URI">
	//  241  487:aastore         
	//  242  488:dup             
	//  243  489:iconst_1        
	//  244  490:ldc1            #75  <String "android.media.metadata.ART_URI">
	//  245  492:aastore         
	//  246  493:dup             
	//  247  494:iconst_2        
	//  248  495:ldc1            #79  <String "android.media.metadata.ALBUM_ART_URI">
	//  249  497:aastore         
	//  250  498:putstatic       #111 <Field String[] e>
	//  251  501:new             #8   <Class MediaMetadataCompat$1>
	//  252  504:dup             
	//  253  505:invokespecial   #112 <Method void MediaMetadataCompat$1()>
	//  254  508:putstatic       #114 <Field android.os.Parcelable$Creator CREATOR>
	//* 255  511:return          
	}
}
