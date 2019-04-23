// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.content.*;
import android.content.pm.*;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.provider.BaseColumns;
import android.support.v4.content.res.FontResourcesParserCompat;
import android.support.v4.graphics.TypefaceCompat;
import android.support.v4.graphics.TypefaceCompatUtil;
import android.support.v4.util.*;
import java.lang.annotation.Annotation;
import java.util.*;
import java.util.concurrent.Callable;

// Referenced classes of package android.support.v4.provider:
//			SelfDestructiveThread, FontRequest

public class FontsContractCompat
{
	public static final class Columns
		implements BaseColumns
	{

		public static final String FILE_ID = "file_id";
		public static final String ITALIC = "font_italic";
		public static final String RESULT_CODE = "result_code";
		public static final int RESULT_CODE_FONT_NOT_FOUND = 1;
		public static final int RESULT_CODE_FONT_UNAVAILABLE = 2;
		public static final int RESULT_CODE_MALFORMED_QUERY = 3;
		public static final int RESULT_CODE_OK = 0;
		public static final String TTC_INDEX = "font_ttc_index";
		public static final String VARIATION_SETTINGS = "font_variation_settings";
		public static final String WEIGHT = "font_weight";

		public Columns()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #41  <Method void Object()>
		//    2    4:return          
		}
	}

	public static class FontFamilyResult
	{

		public FontInfo[] getFonts()
		{
			return mFonts;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field FontsContractCompat$FontInfo[] mFonts>
		//    2    4:areturn         
		}

		public int getStatusCode()
		{
			return mStatusCode;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field int mStatusCode>
		//    2    4:ireturn         
		}

		public static final int STATUS_OK = 0;
		public static final int STATUS_UNEXPECTED_DATA_PROVIDED = 2;
		public static final int STATUS_WRONG_CERTIFICATES = 1;
		private final FontInfo mFonts[];
		private final int mStatusCode;

		public FontFamilyResult(int i, FontInfo afontinfo[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
			mStatusCode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #29  <Field int mStatusCode>
			mFonts = afontinfo;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #31  <Field FontsContractCompat$FontInfo[] mFonts>
		//    8   14:return          
		}
	}

	public static class FontInfo
	{

		public int getResultCode()
		{
			return mResultCode;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field int mResultCode>
		//    2    4:ireturn         
		}

		public int getTtcIndex()
		{
			return mTtcIndex;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field int mTtcIndex>
		//    2    4:ireturn         
		}

		public Uri getUri()
		{
			return mUri;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field Uri mUri>
		//    2    4:areturn         
		}

		public int getWeight()
		{
			return mWeight;
		//    0    0:aload_0         
		//    1    1:getfield        #48  <Field int mWeight>
		//    2    4:ireturn         
		}

		public boolean isItalic()
		{
			return mItalic;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field boolean mItalic>
		//    2    4:ireturn         
		}

		private final boolean mItalic;
		private final int mResultCode;
		private final int mTtcIndex;
		private final Uri mUri;
		private final int mWeight;

		public FontInfo(Uri uri, int i, int j, boolean flag, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #34  <Method void Object()>
			mUri = (Uri)Preconditions.checkNotNull(((Object) (uri)));
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #40  <Method Object Preconditions.checkNotNull(Object)>
		//    5    9:checkcast       #42  <Class Uri>
		//    6   12:putfield        #44  <Field Uri mUri>
			mTtcIndex = i;
		//    7   15:aload_0         
		//    8   16:iload_2         
		//    9   17:putfield        #46  <Field int mTtcIndex>
			mWeight = j;
		//   10   20:aload_0         
		//   11   21:iload_3         
		//   12   22:putfield        #48  <Field int mWeight>
			mItalic = flag;
		//   13   25:aload_0         
		//   14   26:iload           4
		//   15   28:putfield        #50  <Field boolean mItalic>
			mResultCode = k;
		//   16   31:aload_0         
		//   17   32:iload           5
		//   18   34:putfield        #52  <Field int mResultCode>
		//   19   37:return          
		}
	}

	public static class FontRequestCallback
	{

		public void onTypefaceRequestFailed(int i)
		{
		//    0    0:return          
		}

		public void onTypefaceRetrieved(Typeface typeface)
		{
		//    0    0:return          
		}

		public static final int FAIL_REASON_FONT_LOAD_ERROR = -3;
		public static final int FAIL_REASON_FONT_NOT_FOUND = 1;
		public static final int FAIL_REASON_FONT_UNAVAILABLE = 2;
		public static final int FAIL_REASON_MALFORMED_QUERY = 3;
		public static final int FAIL_REASON_PROVIDER_NOT_FOUND = -1;
		public static final int FAIL_REASON_SECURITY_VIOLATION = -4;
		public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;
		public static final int RESULT_OK = 0;

		public FontRequestCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #35  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface FontRequestCallback.FontRequestFailReason
		extends Annotation
	{
	}

	private static final class TypefaceResult
	{

		final int mResult;
		final Typeface mTypeface;

		TypefaceResult(Typeface typeface, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			mTypeface = typeface;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field Typeface mTypeface>
			mResult = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int mResult>
		//    8   14:return          
		}
	}


	private FontsContractCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #103 <Method void Object()>
	//    2    4:return          
	}

	public static Typeface buildTypeface(Context context, CancellationSignal cancellationsignal, FontInfo afontinfo[])
	{
		return TypefaceCompat.createFromFontInfo(context, cancellationsignal, afontinfo, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #124 <Method Typeface TypefaceCompat.createFromFontInfo(Context, CancellationSignal, FontsContractCompat$FontInfo[], int)>
	//    5    7:areturn         
	}

	private static List convertToByteArrayList(Signature asignature[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #130 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #131 <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < asignature.length; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:arraylength     
	//*   9   13:icmpge          36
			((List) (arraylist)).add(((Object) (asignature[i].toByteArray())));
	//   10   16:aload_2         
	//   11   17:aload_0         
	//   12   18:iload_1         
	//   13   19:aaload          
	//   14   20:invokevirtual   #137 <Method byte[] Signature.toByteArray()>
	//   15   23:invokeinterface #143 <Method boolean List.add(Object)>
	//   16   28:pop             

	//   17   29:iload_1         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:istore_1        
	//*  21   33:goto            10
		return ((List) (arraylist));
	//   22   36:aload_2         
	//   23   37:areturn         
	}

	private static boolean equalsByteArrayList(List list, List list1)
	{
		if(list.size() != list1.size())
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #151 <Method int List.size()>
	//*   2    6:aload_1         
	//*   3    7:invokeinterface #151 <Method int List.size()>
	//*   4   12:icmpeq          17
			return false;
	//    5   15:iconst_0        
	//    6   16:ireturn         
		for(int i = 0; i < list.size(); i++)
	//*   7   17:iconst_0        
	//*   8   18:istore_2        
	//*   9   19:iload_2         
	//*  10   20:aload_0         
	//*  11   21:invokeinterface #151 <Method int List.size()>
	//*  12   26:icmpge          64
			if(!Arrays.equals((byte[])list.get(i), (byte[])list1.get(i)))
	//*  13   29:aload_0         
	//*  14   30:iload_2         
	//*  15   31:invokeinterface #155 <Method Object List.get(int)>
	//*  16   36:checkcast       #157 <Class byte[]>
	//*  17   39:aload_1         
	//*  18   40:iload_2         
	//*  19   41:invokeinterface #155 <Method Object List.get(int)>
	//*  20   46:checkcast       #157 <Class byte[]>
	//*  21   49:invokestatic    #163 <Method boolean Arrays.equals(byte[], byte[])>
	//*  22   52:ifne            57
				return false;
	//   23   55:iconst_0        
	//   24   56:ireturn         

	//   25   57:iload_2         
	//   26   58:iconst_1        
	//   27   59:iadd            
	//   28   60:istore_2        
	//*  29   61:goto            19
		return true;
	//   30   64:iconst_1        
	//   31   65:ireturn         
	}

	public static FontFamilyResult fetchFonts(Context context, CancellationSignal cancellationsignal, FontRequest fontrequest)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		ProviderInfo providerinfo = getProvider(context.getPackageManager(), fontrequest, context.getResources());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #174 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #178 <Method Resources Context.getResources()>
	//    5    9:invokestatic    #182 <Method ProviderInfo getProvider(PackageManager, FontRequest, Resources)>
	//    6   12:astore_3        
		if(providerinfo == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       27
			return new FontFamilyResult(1, ((FontInfo []) (null)));
	//    9   17:new             #37  <Class FontsContractCompat$FontFamilyResult>
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:aconst_null     
	//   13   23:invokespecial   #185 <Method void FontsContractCompat$FontFamilyResult(int, FontsContractCompat$FontInfo[])>
	//   14   26:areturn         
		else
			return new FontFamilyResult(0, getFontFromProvider(context, fontrequest, providerinfo.authority, cancellationsignal));
	//   15   27:new             #37  <Class FontsContractCompat$FontFamilyResult>
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:aload_3         
	//   21   35:getfield        #190 <Field String ProviderInfo.authority>
	//   22   38:aload_1         
	//   23   39:invokestatic    #194 <Method FontsContractCompat$FontInfo[] getFontFromProvider(Context, FontRequest, String, CancellationSignal)>
	//   24   42:invokespecial   #185 <Method void FontsContractCompat$FontFamilyResult(int, FontsContractCompat$FontInfo[])>
	//   25   45:areturn         
	}

	private static List getCertificates(FontRequest fontrequest, Resources resources)
	{
		if(fontrequest.getCertificates() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #202 <Method List FontRequest.getCertificates()>
	//*   2    4:ifnull          12
			return fontrequest.getCertificates();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #202 <Method List FontRequest.getCertificates()>
	//    5   11:areturn         
		else
			return FontResourcesParserCompat.readCerts(resources, fontrequest.getCertificatesArrayResId());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #205 <Method int FontRequest.getCertificatesArrayResId()>
	//    9   17:invokestatic    #211 <Method List FontResourcesParserCompat.readCerts(Resources, int)>
	//   10   20:areturn         
	}

	static FontInfo[] getFontFromProvider(Context context, FontRequest fontrequest, String s, CancellationSignal cancellationsignal)
	{
		ArrayList arraylist;
		Object obj;
		Uri uri;
		Uri uri1;
		arraylist = new ArrayList();
	//    0    0:new             #130 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #131 <Method void ArrayList()>
	//    3    7:astore          14
		uri = (new android.net.Uri.Builder()).scheme("content").authority(s).build();
	//    4    9:new             #215 <Class android.net.Uri$Builder>
	//    5   12:dup             
	//    6   13:invokespecial   #216 <Method void android.net.Uri$Builder()>
	//    7   16:ldc1            #218 <String "content">
	//    8   18:invokevirtual   #222 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    9   21:aload_2         
	//   10   22:invokevirtual   #224 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   11   25:invokevirtual   #228 <Method Uri android.net.Uri$Builder.build()>
	//   12   28:astore          16
		uri1 = (new android.net.Uri.Builder()).scheme("content").authority(s).appendPath("file").build();
	//   13   30:new             #215 <Class android.net.Uri$Builder>
	//   14   33:dup             
	//   15   34:invokespecial   #216 <Method void android.net.Uri$Builder()>
	//   16   37:ldc1            #218 <String "content">
	//   17   39:invokevirtual   #222 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   18   42:aload_2         
	//   19   43:invokevirtual   #224 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   20   46:ldc1            #230 <String "file">
	//   21   48:invokevirtual   #233 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   22   51:invokevirtual   #228 <Method Uri android.net.Uri$Builder.build()>
	//   23   54:astore          17
		obj = null;
	//   24   56:aconst_null     
	//   25   57:astore          15
		s = ((String) (obj));
	//   26   59:aload           15
	//   27   61:astore_2        
		if(android.os.Build.VERSION.SDK_INT <= 16)
			break MISSING_BLOCK_LABEL_157;
	//   28   62:getstatic       #238 <Field int android.os.Build$VERSION.SDK_INT>
	//   29   65:bipush          16
	//   30   67:icmple          157
		s = ((String) (obj));
	//   31   70:aload           15
	//   32   72:astore_2        
		context = ((Context) (context.getContentResolver()));
	//   33   73:aload_0         
	//   34   74:invokevirtual   #242 <Method ContentResolver Context.getContentResolver()>
	//   35   77:astore_0        
		s = ((String) (obj));
	//   36   78:aload           15
	//   37   80:astore_2        
		fontrequest = ((FontRequest) (fontrequest.getQuery()));
	//   38   81:aload_1         
	//   39   82:invokevirtual   #246 <Method String FontRequest.getQuery()>
	//   40   85:astore_1        
		s = ((String) (obj));
	//   41   86:aload           15
	//   42   88:astore_2        
		context = ((Context) (((ContentResolver) (context)).query(uri, new String[] {
			"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"
		}, "query = ?", new String[] {
			fontrequest
		}, ((String) (null)), cancellationsignal)));
	//   43   89:aload_0         
	//   44   90:aload           16
	//   45   92:bipush          7
	//   46   94:anewarray       String[]
	//   47   97:dup             
	//   48   98:iconst_0        
	//   49   99:ldc1            #250 <String "_id">
	//   50  101:aastore         
	//   51  102:dup             
	//   52  103:iconst_1        
	//   53  104:ldc1            #252 <String "file_id">
	//   54  106:aastore         
	//   55  107:dup             
	//   56  108:iconst_2        
	//   57  109:ldc1            #254 <String "font_ttc_index">
	//   58  111:aastore         
	//   59  112:dup             
	//   60  113:iconst_3        
	//   61  114:ldc2            #256 <String "font_variation_settings">
	//   62  117:aastore         
	//   63  118:dup             
	//   64  119:iconst_4        
	//   65  120:ldc2            #258 <String "font_weight">
	//   66  123:aastore         
	//   67  124:dup             
	//   68  125:iconst_5        
	//   69  126:ldc2            #260 <String "font_italic">
	//   70  129:aastore         
	//   71  130:dup             
	//   72  131:bipush          6
	//   73  133:ldc2            #262 <String "result_code">
	//   74  136:aastore         
	//   75  137:ldc2            #264 <String "query = ?">
	//   76  140:iconst_1        
	//   77  141:anewarray       String[]
	//   78  144:dup             
	//   79  145:iconst_0        
	//   80  146:aload_1         
	//   81  147:aastore         
	//   82  148:aconst_null     
	//   83  149:aload_3         
	//   84  150:invokevirtual   #270 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String, CancellationSignal)>
	//   85  153:astore_0        
		break MISSING_BLOCK_LABEL_240;
	//   86  154:goto            240
		s = ((String) (obj));
	//   87  157:aload           15
	//   88  159:astore_2        
		context = ((Context) (context.getContentResolver()));
	//   89  160:aload_0         
	//   90  161:invokevirtual   #242 <Method ContentResolver Context.getContentResolver()>
	//   91  164:astore_0        
		s = ((String) (obj));
	//   92  165:aload           15
	//   93  167:astore_2        
		fontrequest = ((FontRequest) (fontrequest.getQuery()));
	//   94  168:aload_1         
	//   95  169:invokevirtual   #246 <Method String FontRequest.getQuery()>
	//   96  172:astore_1        
		s = ((String) (obj));
	//   97  173:aload           15
	//   98  175:astore_2        
		context = ((Context) (((ContentResolver) (context)).query(uri, new String[] {
			"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"
		}, "query = ?", new String[] {
			fontrequest
		}, ((String) (null)))));
	//   99  176:aload_0         
	//  100  177:aload           16
	//  101  179:bipush          7
	//  102  181:anewarray       String[]
	//  103  184:dup             
	//  104  185:iconst_0        
	//  105  186:ldc1            #250 <String "_id">
	//  106  188:aastore         
	//  107  189:dup             
	//  108  190:iconst_1        
	//  109  191:ldc1            #252 <String "file_id">
	//  110  193:aastore         
	//  111  194:dup             
	//  112  195:iconst_2        
	//  113  196:ldc1            #254 <String "font_ttc_index">
	//  114  198:aastore         
	//  115  199:dup             
	//  116  200:iconst_3        
	//  117  201:ldc2            #256 <String "font_variation_settings">
	//  118  204:aastore         
	//  119  205:dup             
	//  120  206:iconst_4        
	//  121  207:ldc2            #258 <String "font_weight">
	//  122  210:aastore         
	//  123  211:dup             
	//  124  212:iconst_5        
	//  125  213:ldc2            #260 <String "font_italic">
	//  126  216:aastore         
	//  127  217:dup             
	//  128  218:bipush          6
	//  129  220:ldc2            #262 <String "result_code">
	//  130  223:aastore         
	//  131  224:ldc2            #264 <String "query = ?">
	//  132  227:iconst_1        
	//  133  228:anewarray       String[]
	//  134  231:dup             
	//  135  232:iconst_0        
	//  136  233:aload_1         
	//  137  234:aastore         
	//  138  235:aconst_null     
	//  139  236:invokevirtual   #273 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//  140  239:astore_0        
		fontrequest = ((FontRequest) (arraylist));
	//  141  240:aload           14
	//  142  242:astore_1        
		if(context == null) goto _L2; else goto _L1
	//  143  243:aload_0         
	//  144  244:ifnull          515
_L1:
		fontrequest = ((FontRequest) (arraylist));
	//  145  247:aload           14
	//  146  249:astore_1        
		s = ((String) (context));
	//  147  250:aload_0         
	//  148  251:astore_2        
		if(((Cursor) (context)).getCount() <= 0) goto _L2; else goto _L3
	//  149  252:aload_0         
	//  150  253:invokeinterface #278 <Method int Cursor.getCount()>
	//  151  258:ifle            515
_L3:
		s = ((String) (context));
	//  152  261:aload_0         
	//  153  262:astore_2        
		int l = ((Cursor) (context)).getColumnIndex("result_code");
	//  154  263:aload_0         
	//  155  264:ldc2            #262 <String "result_code">
	//  156  267:invokeinterface #282 <Method int Cursor.getColumnIndex(String)>
	//  157  272:istore          7
		s = ((String) (context));
	//  158  274:aload_0         
	//  159  275:astore_2        
		cancellationsignal = ((CancellationSignal) (new ArrayList()));
	//  160  276:new             #130 <Class ArrayList>
	//  161  279:dup             
	//  162  280:invokespecial   #131 <Method void ArrayList()>
	//  163  283:astore_3        
		s = ((String) (context));
	//  164  284:aload_0         
	//  165  285:astore_2        
		int i1 = ((Cursor) (context)).getColumnIndex("_id");
	//  166  286:aload_0         
	//  167  287:ldc1            #250 <String "_id">
	//  168  289:invokeinterface #282 <Method int Cursor.getColumnIndex(String)>
	//  169  294:istore          8
		s = ((String) (context));
	//  170  296:aload_0         
	//  171  297:astore_2        
		int j1 = ((Cursor) (context)).getColumnIndex("file_id");
	//  172  298:aload_0         
	//  173  299:ldc1            #252 <String "file_id">
	//  174  301:invokeinterface #282 <Method int Cursor.getColumnIndex(String)>
	//  175  306:istore          9
		s = ((String) (context));
	//  176  308:aload_0         
	//  177  309:astore_2        
		int k1 = ((Cursor) (context)).getColumnIndex("font_ttc_index");
	//  178  310:aload_0         
	//  179  311:ldc1            #254 <String "font_ttc_index">
	//  180  313:invokeinterface #282 <Method int Cursor.getColumnIndex(String)>
	//  181  318:istore          10
		s = ((String) (context));
	//  182  320:aload_0         
	//  183  321:astore_2        
		int l1 = ((Cursor) (context)).getColumnIndex("font_weight");
	//  184  322:aload_0         
	//  185  323:ldc2            #258 <String "font_weight">
	//  186  326:invokeinterface #282 <Method int Cursor.getColumnIndex(String)>
	//  187  331:istore          11
		s = ((String) (context));
	//  188  333:aload_0         
	//  189  334:astore_2        
		int i2 = ((Cursor) (context)).getColumnIndex("font_italic");
	//  190  335:aload_0         
	//  191  336:ldc2            #260 <String "font_italic">
	//  192  339:invokeinterface #282 <Method int Cursor.getColumnIndex(String)>
	//  193  344:istore          12
_L12:
		s = ((String) (context));
	//  194  346:aload_0         
	//  195  347:astore_2        
		if(!((Cursor) (context)).moveToNext()) goto _L5; else goto _L4
	//  196  348:aload_0         
	//  197  349:invokeinterface #286 <Method boolean Cursor.moveToNext()>
	//  198  354:ifeq            513
_L4:
		if(l == -1) goto _L7; else goto _L6
	//  199  357:iload           7
	//  200  359:iconst_m1       
	//  201  360:icmpeq          550
_L6:
		s = ((String) (context));
	//  202  363:aload_0         
	//  203  364:astore_2        
		int i = ((Cursor) (context)).getInt(l);
	//  204  365:aload_0         
	//  205  366:iload           7
	//  206  368:invokeinterface #290 <Method int Cursor.getInt(int)>
	//  207  373:istore          4
	//* 208  375:goto            378
_L13:
		if(k1 == -1) goto _L9; else goto _L8
	//  209  378:iload           10
	//  210  380:iconst_m1       
	//  211  381:icmpeq          556
_L8:
		s = ((String) (context));
	//  212  384:aload_0         
	//  213  385:astore_2        
		int j = ((Cursor) (context)).getInt(k1);
	//  214  386:aload_0         
	//  215  387:iload           10
	//  216  389:invokeinterface #290 <Method int Cursor.getInt(int)>
	//  217  394:istore          5
	//* 218  396:goto            399
_L14:
		if(j1 != -1)
			break MISSING_BLOCK_LABEL_424;
	//  219  399:iload           9
	//  220  401:iconst_m1       
	//  221  402:icmpne          424
		s = ((String) (context));
	//  222  405:aload_0         
	//  223  406:astore_2        
		fontrequest = ((FontRequest) (ContentUris.withAppendedId(uri, ((Cursor) (context)).getLong(i1))));
	//  224  407:aload           16
	//  225  409:aload_0         
	//  226  410:iload           8
	//  227  412:invokeinterface #294 <Method long Cursor.getLong(int)>
	//  228  417:invokestatic    #300 <Method Uri ContentUris.withAppendedId(Uri, long)>
	//  229  420:astore_1        
		break MISSING_BLOCK_LABEL_440;
	//  230  421:goto            440
		s = ((String) (context));
	//  231  424:aload_0         
	//  232  425:astore_2        
		fontrequest = ((FontRequest) (ContentUris.withAppendedId(uri1, ((Cursor) (context)).getLong(j1))));
	//  233  426:aload           17
	//  234  428:aload_0         
	//  235  429:iload           9
	//  236  431:invokeinterface #294 <Method long Cursor.getLong(int)>
	//  237  436:invokestatic    #300 <Method Uri ContentUris.withAppendedId(Uri, long)>
	//  238  439:astore_1        
		if(l1 == -1) goto _L11; else goto _L10
	//  239  440:iload           11
	//  240  442:iconst_m1       
	//  241  443:icmpeq          562
_L10:
		s = ((String) (context));
	//  242  446:aload_0         
	//  243  447:astore_2        
		int k = ((Cursor) (context)).getInt(l1);
	//  244  448:aload_0         
	//  245  449:iload           11
	//  246  451:invokeinterface #290 <Method int Cursor.getInt(int)>
	//  247  456:istore          6
	//* 248  458:goto            461
_L15:
		if(i2 == -1)
			break MISSING_BLOCK_LABEL_570;
	//  249  461:iload           12
	//  250  463:iconst_m1       
	//  251  464:icmpeq          570
		s = ((String) (context));
	//  252  467:aload_0         
	//  253  468:astore_2        
		if(((Cursor) (context)).getInt(i2) != 1)
			break MISSING_BLOCK_LABEL_570;
	//  254  469:aload_0         
	//  255  470:iload           12
	//  256  472:invokeinterface #290 <Method int Cursor.getInt(int)>
	//  257  477:iconst_1        
	//  258  478:icmpne          570
		boolean flag = true;
	//  259  481:iconst_1        
	//  260  482:istore          13
	//* 261  484:goto            487
_L16:
		s = ((String) (context));
	//  262  487:aload_0         
	//  263  488:astore_2        
		((ArrayList) (cancellationsignal)).add(((Object) (new FontInfo(((Uri) (fontrequest)), j, k, flag, i))));
	//  264  489:aload_3         
	//  265  490:new             #40  <Class FontsContractCompat$FontInfo>
	//  266  493:dup             
	//  267  494:aload_1         
	//  268  495:iload           5
	//  269  497:iload           6
	//  270  499:iload           13
	//  271  501:iload           4
	//  272  503:invokespecial   #303 <Method void FontsContractCompat$FontInfo(Uri, int, int, boolean, int)>
	//  273  506:invokevirtual   #304 <Method boolean ArrayList.add(Object)>
	//  274  509:pop             
		  goto _L12
	//* 275  510:goto            346
_L5:
		fontrequest = ((FontRequest) (cancellationsignal));
	//  276  513:aload_3         
	//  277  514:astore_1        
_L2:
		if(context != null)
	//* 278  515:aload_0         
	//* 279  516:ifnull          525
			((Cursor) (context)).close();
	//  280  519:aload_0         
	//  281  520:invokeinterface #307 <Method void Cursor.close()>
		return (FontInfo[])((ArrayList) (fontrequest)).toArray(((Object []) (new FontInfo[0])));
	//  282  525:aload_1         
	//  283  526:iconst_0        
	//  284  527:anewarray       FontInfo[]
	//  285  530:invokevirtual   #311 <Method Object[] ArrayList.toArray(Object[])>
	//  286  533:checkcast       #313 <Class FontsContractCompat$FontInfo[]>
	//  287  536:areturn         
		context;
	//  288  537:astore_0        
		if(s != null)
	//* 289  538:aload_2         
	//* 290  539:ifnull          548
			((Cursor) (s)).close();
	//  291  542:aload_2         
	//  292  543:invokeinterface #307 <Method void Cursor.close()>
		throw context;
	//  293  548:aload_0         
	//  294  549:athrow          
_L7:
		i = 0;
	//  295  550:iconst_0        
	//  296  551:istore          4
		  goto _L13
	//* 297  553:goto            378
_L9:
		j = 0;
	//  298  556:iconst_0        
	//  299  557:istore          5
		  goto _L14
	//* 300  559:goto            399
_L11:
		k = 400;
	//  301  562:sipush          400
	//  302  565:istore          6
		  goto _L15
	//* 303  567:goto            461
		flag = false;
	//  304  570:iconst_0        
	//  305  571:istore          13
		  goto _L16
	//* 306  573:goto            487
	}

	static TypefaceResult getFontInternal(Context context, FontRequest fontrequest, int i)
	{
		byte byte0;
		int j;
		try
		{
			fontrequest = ((FontRequest) (fetchFonts(context, ((CancellationSignal) (null)), fontrequest)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokestatic    #317 <Method FontsContractCompat$FontFamilyResult fetchFonts(Context, CancellationSignal, FontRequest)>
	//    4    6:astore_1        
		}
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #320 <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
	//*   7   11:istore          4
	//*   8   13:bipush          -3
	//*   9   15:istore_3        
	//*  10   16:iload           4
	//*  11   18:ifne            48
	//*  12   21:aload_0         
	//*  13   22:aconst_null     
	//*  14   23:aload_1         
	//*  15   24:invokevirtual   #324 <Method FontsContractCompat$FontInfo[] FontsContractCompat$FontFamilyResult.getFonts()>
	//*  16   27:iload_2         
	//*  17   28:invokestatic    #124 <Method Typeface TypefaceCompat.createFromFontInfo(Context, CancellationSignal, FontsContractCompat$FontInfo[], int)>
	//*  18   31:astore_0        
	//*  19   32:aload_0         
	//*  20   33:ifnull          38
	//*  21   36:iconst_0        
	//*  22   37:istore_3        
	//*  23   38:new             #49  <Class FontsContractCompat$TypefaceResult>
	//*  24   41:dup             
	//*  25   42:aload_0         
	//*  26   43:iload_3         
	//*  27   44:invokespecial   #327 <Method void FontsContractCompat$TypefaceResult(Typeface, int)>
	//*  28   47:areturn         
	//*  29   48:aload_1         
	//*  30   49:invokevirtual   #320 <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
	//*  31   52:iconst_1        
	//*  32   53:icmpne          59
	//*  33   56:bipush          -2
	//*  34   58:istore_3        
	//*  35   59:new             #49  <Class FontsContractCompat$TypefaceResult>
	//*  36   62:dup             
	//*  37   63:aconst_null     
	//*  38   64:iload_3         
	//*  39   65:invokespecial   #327 <Method void FontsContractCompat$TypefaceResult(Typeface, int)>
	//*  40   68:areturn         
	//*  41   69:new             #49  <Class FontsContractCompat$TypefaceResult>
	//*  42   72:dup             
	//*  43   73:aconst_null     
	//*  44   74:iconst_m1       
	//*  45   75:invokespecial   #327 <Method void FontsContractCompat$TypefaceResult(Typeface, int)>
	//*  46   78:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			return new TypefaceResult(((Typeface) (null)), -1);
		}
		j = ((FontFamilyResult) (fontrequest)).getStatusCode();
		byte0 = -3;
		if(j == 0)
		{
			context = ((Context) (TypefaceCompat.createFromFontInfo(context, ((CancellationSignal) (null)), ((FontFamilyResult) (fontrequest)).getFonts(), i)));
			if(context != null)
				byte0 = 0;
			return new TypefaceResult(((Typeface) (context)), ((int) (byte0)));
		}
		if(((FontFamilyResult) (fontrequest)).getStatusCode() == 1)
			byte0 = -2;
		return new TypefaceResult(((Typeface) (null)), ((int) (byte0)));
	//*  47   79:astore_0        
	//*  48   80:goto            69
	}

	public static Typeface getFontSync(Context context, FontRequest fontrequest, android.support.v4.content.res.ResourcesCompat.FontCallback fontcallback, Handler handler, boolean flag, int i, int j)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #333 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #334 <Method void StringBuilder()>
	//    3    7:astore          7
		((StringBuilder) (obj)).append(fontrequest.getIdentifier());
	//    4    9:aload           7
	//    5   11:aload_1         
	//    6   12:invokevirtual   #337 <Method String FontRequest.getIdentifier()>
	//    7   15:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		((StringBuilder) (obj)).append("-");
	//    9   19:aload           7
	//   10   21:ldc2            #343 <String "-">
	//   11   24:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
		((StringBuilder) (obj)).append(j);
	//   13   28:aload           7
	//   14   30:iload           6
	//   15   32:invokevirtual   #346 <Method StringBuilder StringBuilder.append(int)>
	//   16   35:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   17   36:aload           7
	//   18   38:invokevirtual   #349 <Method String StringBuilder.toString()>
	//   19   41:astore          7
		Typeface typeface = (Typeface)sTypefaceCache.get(obj);
	//   20   43:getstatic       #92  <Field LruCache sTypefaceCache>
	//   21   46:aload           7
	//   22   48:invokevirtual   #352 <Method Object LruCache.get(Object)>
	//   23   51:checkcast       #354 <Class Typeface>
	//   24   54:astore          8
		if(typeface != null)
	//*  25   56:aload           8
	//*  26   58:ifnull          74
		{
			if(fontcallback != null)
	//*  27   61:aload_2         
	//*  28   62:ifnull          71
				fontcallback.onFontRetrieved(typeface);
	//   29   65:aload_2         
	//   30   66:aload           8
	//   31   68:invokevirtual   #360 <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.onFontRetrieved(Typeface)>
			return typeface;
	//   32   71:aload           8
	//   33   73:areturn         
		}
		if(flag && i == -1)
	//*  34   74:iload           4
	//*  35   76:ifeq            130
	//*  36   79:iload           5
	//*  37   81:iconst_m1       
	//*  38   82:icmpne          130
		{
			context = ((Context) (getFontInternal(context, fontrequest, j)));
	//   39   85:aload_0         
	//   40   86:aload_1         
	//   41   87:iload           6
	//   42   89:invokestatic    #362 <Method FontsContractCompat$TypefaceResult getFontInternal(Context, FontRequest, int)>
	//   43   92:astore_0        
			if(fontcallback != null)
	//*  44   93:aload_2         
	//*  45   94:ifnull          125
				if(((TypefaceResult) (context)).mResult == 0)
	//*  46   97:aload_0         
	//*  47   98:getfield        #365 <Field int FontsContractCompat$TypefaceResult.mResult>
	//*  48  101:ifne            116
					fontcallback.callbackSuccessAsync(((TypefaceResult) (context)).mTypeface, handler);
	//   49  104:aload_2         
	//   50  105:aload_0         
	//   51  106:getfield        #369 <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
	//   52  109:aload_3         
	//   53  110:invokevirtual   #373 <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackSuccessAsync(Typeface, Handler)>
				else
	//*  54  113:goto            125
					fontcallback.callbackFailAsync(((TypefaceResult) (context)).mResult, handler);
	//   55  116:aload_2         
	//   56  117:aload_0         
	//   57  118:getfield        #365 <Field int FontsContractCompat$TypefaceResult.mResult>
	//   58  121:aload_3         
	//   59  122:invokevirtual   #377 <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
			return ((TypefaceResult) (context)).mTypeface;
	//   60  125:aload_0         
	//   61  126:getfield        #369 <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
	//   62  129:areturn         
		}
		fontrequest = ((FontRequest) (new Callable(context, fontrequest, j, ((String) (obj))) {

			public TypefaceResult call()
				throws Exception
			{
				TypefaceResult typefaceresult = FontsContractCompat.getFontInternal(context, request, style);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field Context val$context>
			//    2    4:aload_0         
			//    3    5:getfield        #26  <Field FontRequest val$request>
			//    4    8:aload_0         
			//    5    9:getfield        #28  <Field int val$style>
			//    6   12:invokestatic    #42  <Method FontsContractCompat$TypefaceResult FontsContractCompat.getFontInternal(Context, FontRequest, int)>
			//    7   15:astore_1        
				if(typefaceresult.mTypeface != null)
			//*   8   16:aload_1         
			//*   9   17:getfield        #48  <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
			//*  10   20:ifnull          38
					FontsContractCompat.sTypefaceCache.put(((Object) (id)), ((Object) (typefaceresult.mTypeface)));
			//   11   23:getstatic       #52  <Field LruCache FontsContractCompat.sTypefaceCache>
			//   12   26:aload_0         
			//   13   27:getfield        #30  <Field String val$id>
			//   14   30:aload_1         
			//   15   31:getfield        #48  <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
			//   16   34:invokevirtual   #58  <Method Object LruCache.put(Object, Object)>
			//   17   37:pop             
				return typefaceresult;
			//   18   38:aload_1         
			//   19   39:areturn         
			}

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #62  <Method FontsContractCompat$TypefaceResult call()>
			//    2    4:areturn         
			}

			final Context val$context;
			final String val$id;
			final FontRequest val$request;
			final int val$style;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #24  <Field Context val$context>
				request = fontrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #26  <Field FontRequest val$request>
				style = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #28  <Field int val$style>
				id = s;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #30  <Field String val$id>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #33  <Method void Object()>
			//   14   25:return          
			}
		}
));
	//   63  130:new             #6   <Class FontsContractCompat$1>
	//   64  133:dup             
	//   65  134:aload_0         
	//   66  135:aload_1         
	//   67  136:iload           6
	//   68  138:aload           7
	//   69  140:invokespecial   #380 <Method void FontsContractCompat$1(Context, FontRequest, int, String)>
	//   70  143:astore_1        
		if(flag)
	//*  71  144:iload           4
	//*  72  146:ifeq            167
		{
			try
			{
				context = ((Context) (((TypefaceResult)sBackgroundThread.postAndWait(((Callable) (fontrequest)), i)).mTypeface));
	//   73  149:getstatic       #101 <Field SelfDestructiveThread sBackgroundThread>
	//   74  152:aload_1         
	//   75  153:iload           5
	//   76  155:invokevirtual   #384 <Method Object SelfDestructiveThread.postAndWait(Callable, int)>
	//   77  158:checkcast       #49  <Class FontsContractCompat$TypefaceResult>
	//   78  161:getfield        #369 <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
	//   79  164:astore_0        
			}
	//*  80  165:aload_0         
	//*  81  166:areturn         
	//*  82  167:aload_2         
	//*  83  168:ifnonnull       176
	//*  84  171:aconst_null     
	//*  85  172:astore_0        
	//*  86  173:goto            186
	//*  87  176:new             #8   <Class FontsContractCompat$2>
	//*  88  179:dup             
	//*  89  180:aload_2         
	//*  90  181:aload_3         
	//*  91  182:invokespecial   #387 <Method void FontsContractCompat$2(android.support.v4.content.res.ResourcesCompat$FontCallback, Handler)>
	//*  92  185:astore_0        
	//*  93  186:getstatic       #105 <Field Object sLock>
	//*  94  189:astore_2        
	//*  95  190:aload_2         
	//*  96  191:monitorenter    
	//*  97  192:getstatic       #110 <Field SimpleArrayMap sPendingReplies>
	//*  98  195:aload           7
	//*  99  197:invokevirtual   #390 <Method boolean SimpleArrayMap.containsKey(Object)>
	//* 100  200:ifeq            227
	//* 101  203:aload_0         
	//* 102  204:ifnull          223
	//* 103  207:getstatic       #110 <Field SimpleArrayMap sPendingReplies>
	//* 104  210:aload           7
	//* 105  212:invokevirtual   #391 <Method Object SimpleArrayMap.get(Object)>
	//* 106  215:checkcast       #130 <Class ArrayList>
	//* 107  218:aload_0         
	//* 108  219:invokevirtual   #304 <Method boolean ArrayList.add(Object)>
	//* 109  222:pop             
	//* 110  223:aload_2         
	//* 111  224:monitorexit     
	//* 112  225:aconst_null     
	//* 113  226:areturn         
	//* 114  227:aload_0         
	//* 115  228:ifnull          255
	//* 116  231:new             #130 <Class ArrayList>
	//* 117  234:dup             
	//* 118  235:invokespecial   #131 <Method void ArrayList()>
	//* 119  238:astore_3        
	//* 120  239:aload_3         
	//* 121  240:aload_0         
	//* 122  241:invokevirtual   #304 <Method boolean ArrayList.add(Object)>
	//* 123  244:pop             
	//* 124  245:getstatic       #110 <Field SimpleArrayMap sPendingReplies>
	//* 125  248:aload           7
	//* 126  250:aload_3         
	//* 127  251:invokevirtual   #395 <Method Object SimpleArrayMap.put(Object, Object)>
	//* 128  254:pop             
	//* 129  255:aload_2         
	//* 130  256:monitorexit     
	//* 131  257:getstatic       #101 <Field SelfDestructiveThread sBackgroundThread>
	//* 132  260:aload_1         
	//* 133  261:new             #10  <Class FontsContractCompat$3>
	//* 134  264:dup             
	//* 135  265:aload           7
	//* 136  267:invokespecial   #398 <Method void FontsContractCompat$3(String)>
	//* 137  270:invokevirtual   #402 <Method void SelfDestructiveThread.postAndReply(Callable, SelfDestructiveThread$ReplyCallback)>
	//* 138  273:aconst_null     
	//* 139  274:areturn         
	//* 140  275:astore_0        
	//* 141  276:aload_2         
	//* 142  277:monitorexit     
	//* 143  278:aload_0         
	//* 144  279:athrow          
			// Misplaced declaration of an exception variable
			catch(Context context)
	//* 145  280:astore_0        
			{
				return null;
	//  146  281:aconst_null     
	//  147  282:areturn         
			}
			return ((Typeface) (context));
		}
		if(fontcallback == null)
			context = null;
		else
			context = ((Context) (new SelfDestructiveThread.ReplyCallback(fontcallback, handler) {

				public void onReply(TypefaceResult typefaceresult)
				{
					if(typefaceresult == null)
				//*   0    0:aload_1         
				//*   1    1:ifnonnull       17
					{
						fontCallback.callbackFailAsync(1, handler);
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$fontCallback>
				//    4    8:iconst_1        
				//    5    9:aload_0         
				//    6   10:getfield        #22  <Field Handler val$handler>
				//    7   13:invokevirtual   #34  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
						return;
				//    8   16:return          
					}
					if(typefaceresult.mResult == 0)
				//*   9   17:aload_1         
				//*  10   18:getfield        #40  <Field int FontsContractCompat$TypefaceResult.mResult>
				//*  11   21:ifne            40
					{
						fontCallback.callbackSuccessAsync(typefaceresult.mTypeface, handler);
				//   12   24:aload_0         
				//   13   25:getfield        #20  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$fontCallback>
				//   14   28:aload_1         
				//   15   29:getfield        #44  <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
				//   16   32:aload_0         
				//   17   33:getfield        #22  <Field Handler val$handler>
				//   18   36:invokevirtual   #48  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackSuccessAsync(Typeface, Handler)>
						return;
				//   19   39:return          
					} else
					{
						fontCallback.callbackFailAsync(typefaceresult.mResult, handler);
				//   20   40:aload_0         
				//   21   41:getfield        #20  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$fontCallback>
				//   22   44:aload_1         
				//   23   45:getfield        #40  <Field int FontsContractCompat$TypefaceResult.mResult>
				//   24   48:aload_0         
				//   25   49:getfield        #22  <Field Handler val$handler>
				//   26   52:invokevirtual   #34  <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
						return;
				//   27   55:return          
					}
				}

				public volatile void onReply(Object obj1)
				{
					onReply((TypefaceResult)obj1);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #36  <Class FontsContractCompat$TypefaceResult>
				//    3    5:invokevirtual   #51  <Method void onReply(FontsContractCompat$TypefaceResult)>
				//    4    8:return          
				}

				final android.support.v4.content.res.ResourcesCompat.FontCallback val$fontCallback;
				final Handler val$handler;

			
			{
				fontCallback = fontcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field android.support.v4.content.res.ResourcesCompat$FontCallback val$fontCallback>
				handler = handler1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #22  <Field Handler val$handler>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #25  <Method void Object()>
			//    8   14:return          
			}
			}
));
		fontcallback = ((android.support.v4.content.res.ResourcesCompat.FontCallback) (sLock));
		fontcallback;
		JVM INSTR monitorenter ;
		if(!sPendingReplies.containsKey(obj))
			break MISSING_BLOCK_LABEL_227;
		if(context == null)
			break MISSING_BLOCK_LABEL_223;
		((ArrayList)sPendingReplies.get(obj)).add(((Object) (context)));
		fontcallback;
		JVM INSTR monitorexit ;
		return null;
		if(context == null)
			break MISSING_BLOCK_LABEL_255;
		handler = ((Handler) (new ArrayList()));
		((ArrayList) (handler)).add(((Object) (context)));
		sPendingReplies.put(obj, ((Object) (handler)));
		fontcallback;
		JVM INSTR monitorexit ;
		sBackgroundThread.postAndReply(((Callable) (fontrequest)), new SelfDestructiveThread.ReplyCallback(((String) (obj))) {

			public void onReply(TypefaceResult typefaceresult)
			{
				Object obj1 = FontsContractCompat.sLock;
			//    0    0:getstatic       #28  <Field Object FontsContractCompat.sLock>
			//    1    3:astore_3        
				obj1;
			//    2    4:aload_3         
				JVM INSTR monitorenter ;
			//    3    5:monitorenter    
				ArrayList arraylist = (ArrayList)FontsContractCompat.sPendingReplies.get(((Object) (id)));
			//    4    6:getstatic       #32  <Field SimpleArrayMap FontsContractCompat.sPendingReplies>
			//    5    9:aload_0         
			//    6   10:getfield        #18  <Field String val$id>
			//    7   13:invokevirtual   #38  <Method Object SimpleArrayMap.get(Object)>
			//    8   16:checkcast       #40  <Class ArrayList>
			//    9   19:astore          4
				if(arraylist != null)
					break MISSING_BLOCK_LABEL_29;
			//   10   21:aload           4
			//   11   23:ifnonnull       29
				obj1;
			//   12   26:aload_3         
				JVM INSTR monitorexit ;
			//   13   27:monitorexit     
				return;
			//   14   28:return          
				FontsContractCompat.sPendingReplies.remove(((Object) (id)));
			//   15   29:getstatic       #32  <Field SimpleArrayMap FontsContractCompat.sPendingReplies>
			//   16   32:aload_0         
			//   17   33:getfield        #18  <Field String val$id>
			//   18   36:invokevirtual   #43  <Method Object SimpleArrayMap.remove(Object)>
			//   19   39:pop             
				obj1;
			//   20   40:aload_3         
				JVM INSTR monitorexit ;
			//   21   41:monitorexit     
				for(int k = 0; k < arraylist.size(); k++)
			//*  22   42:iconst_0        
			//*  23   43:istore_2        
			//*  24   44:iload_2         
			//*  25   45:aload           4
			//*  26   47:invokevirtual   #47  <Method int ArrayList.size()>
			//*  27   50:icmpge          75
					((SelfDestructiveThread.ReplyCallback)arraylist.get(k)).onReply(((Object) (typefaceresult)));
			//   28   53:aload           4
			//   29   55:iload_2         
			//   30   56:invokevirtual   #50  <Method Object ArrayList.get(int)>
			//   31   59:checkcast       #7   <Class SelfDestructiveThread$ReplyCallback>
			//   32   62:aload_1         
			//   33   63:invokeinterface #53  <Method void SelfDestructiveThread$ReplyCallback.onReply(Object)>

			//   34   68:iload_2         
			//   35   69:iconst_1        
			//   36   70:iadd            
			//   37   71:istore_2        
			//*  38   72:goto            44
				return;
			//   39   75:return          
				typefaceresult;
			//   40   76:astore_1        
				obj1;
			//   41   77:aload_3         
				JVM INSTR monitorexit ;
			//   42   78:monitorexit     
				throw typefaceresult;
			//   43   79:aload_1         
			//   44   80:athrow          
			}

			public volatile void onReply(Object obj1)
			{
				onReply((TypefaceResult)obj1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #55  <Class FontsContractCompat$TypefaceResult>
			//    3    5:invokevirtual   #57  <Method void onReply(FontsContractCompat$TypefaceResult)>
			//    4    8:return          
			}

			final String val$id;

			
			{
				id = s;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field String val$id>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
);
		return null;
		context;
		fontcallback;
		JVM INSTR monitorexit ;
		throw context;
	}

	public static ProviderInfo getProvider(PackageManager packagemanager, FontRequest fontrequest, Resources resources)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		String s = fontrequest.getProviderAuthority();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #405 <Method String FontRequest.getProviderAuthority()>
	//    2    4:astore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		ProviderInfo providerinfo = packagemanager.resolveContentProvider(s, 0);
	//    5    8:aload_0         
	//    6    9:aload           5
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #411 <Method ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//    9   15:astore          4
		if(providerinfo != null)
	//*  10   17:aload           4
	//*  11   19:ifnull          175
		{
			if(providerinfo.packageName.equals(((Object) (fontrequest.getProviderPackage()))))
	//*  12   22:aload           4
	//*  13   24:getfield        #414 <Field String ProviderInfo.packageName>
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #417 <Method String FontRequest.getProviderPackage()>
	//*  16   31:invokevirtual   #419 <Method boolean String.equals(Object)>
	//*  17   34:ifeq            123
			{
				packagemanager = ((PackageManager) (convertToByteArrayList(packagemanager.getPackageInfo(providerinfo.packageName, 64).signatures)));
	//   18   37:aload_0         
	//   19   38:aload           4
	//   20   40:getfield        #414 <Field String ProviderInfo.packageName>
	//   21   43:bipush          64
	//   22   45:invokevirtual   #423 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   23   48:getfield        #429 <Field Signature[] PackageInfo.signatures>
	//   24   51:invokestatic    #431 <Method List convertToByteArrayList(Signature[])>
	//   25   54:astore_0        
				Collections.sort(((List) (packagemanager)), sByteArrayComparator);
	//   26   55:aload_0         
	//   27   56:getstatic       #113 <Field Comparator sByteArrayComparator>
	//   28   59:invokestatic    #437 <Method void Collections.sort(List, Comparator)>
				for(fontrequest = ((FontRequest) (getCertificates(fontrequest, resources))); i < ((List) (fontrequest)).size(); i++)
	//*  29   62:aload_1         
	//*  30   63:aload_2         
	//*  31   64:invokestatic    #439 <Method List getCertificates(FontRequest, Resources)>
	//*  32   67:astore_1        
	//*  33   68:iload_3         
	//*  34   69:aload_1         
	//*  35   70:invokeinterface #151 <Method int List.size()>
	//*  36   75:icmpge          121
				{
					resources = ((Resources) (new ArrayList((Collection)((List) (fontrequest)).get(i))));
	//   37   78:new             #130 <Class ArrayList>
	//   38   81:dup             
	//   39   82:aload_1         
	//   40   83:iload_3         
	//   41   84:invokeinterface #155 <Method Object List.get(int)>
	//   42   89:checkcast       #441 <Class Collection>
	//   43   92:invokespecial   #444 <Method void ArrayList(Collection)>
	//   44   95:astore_2        
					Collections.sort(((List) (resources)), sByteArrayComparator);
	//   45   96:aload_2         
	//   46   97:getstatic       #113 <Field Comparator sByteArrayComparator>
	//   47  100:invokestatic    #437 <Method void Collections.sort(List, Comparator)>
					if(equalsByteArrayList(((List) (packagemanager)), ((List) (resources))))
	//*  48  103:aload_0         
	//*  49  104:aload_2         
	//*  50  105:invokestatic    #446 <Method boolean equalsByteArrayList(List, List)>
	//*  51  108:ifeq            114
						return providerinfo;
	//   52  111:aload           4
	//   53  113:areturn         
				}

	//   54  114:iload_3         
	//   55  115:iconst_1        
	//   56  116:iadd            
	//   57  117:istore_3        
	//*  58  118:goto            68
				return null;
	//   59  121:aconst_null     
	//   60  122:areturn         
			} else
			{
				packagemanager = ((PackageManager) (new StringBuilder()));
	//   61  123:new             #333 <Class StringBuilder>
	//   62  126:dup             
	//   63  127:invokespecial   #334 <Method void StringBuilder()>
	//   64  130:astore_0        
				((StringBuilder) (packagemanager)).append("Found content provider ");
	//   65  131:aload_0         
	//   66  132:ldc2            #448 <String "Found content provider ">
	//   67  135:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   68  138:pop             
				((StringBuilder) (packagemanager)).append(s);
	//   69  139:aload_0         
	//   70  140:aload           5
	//   71  142:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   72  145:pop             
				((StringBuilder) (packagemanager)).append(", but package was not ");
	//   73  146:aload_0         
	//   74  147:ldc2            #450 <String ", but package was not ">
	//   75  150:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   76  153:pop             
				((StringBuilder) (packagemanager)).append(fontrequest.getProviderPackage());
	//   77  154:aload_0         
	//   78  155:aload_1         
	//   79  156:invokevirtual   #417 <Method String FontRequest.getProviderPackage()>
	//   80  159:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   81  162:pop             
				throw new android.content.pm.PackageManager.NameNotFoundException(((StringBuilder) (packagemanager)).toString());
	//   82  163:new             #168 <Class android.content.pm.PackageManager$NameNotFoundException>
	//   83  166:dup             
	//   84  167:aload_0         
	//   85  168:invokevirtual   #349 <Method String StringBuilder.toString()>
	//   86  171:invokespecial   #451 <Method void android.content.pm.PackageManager$NameNotFoundException(String)>
	//   87  174:athrow          
			}
		} else
		{
			packagemanager = ((PackageManager) (new StringBuilder()));
	//   88  175:new             #333 <Class StringBuilder>
	//   89  178:dup             
	//   90  179:invokespecial   #334 <Method void StringBuilder()>
	//   91  182:astore_0        
			((StringBuilder) (packagemanager)).append("No package found for authority: ");
	//   92  183:aload_0         
	//   93  184:ldc2            #453 <String "No package found for authority: ">
	//   94  187:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   95  190:pop             
			((StringBuilder) (packagemanager)).append(s);
	//   96  191:aload_0         
	//   97  192:aload           5
	//   98  194:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   99  197:pop             
			throw new android.content.pm.PackageManager.NameNotFoundException(((StringBuilder) (packagemanager)).toString());
	//  100  198:new             #168 <Class android.content.pm.PackageManager$NameNotFoundException>
	//  101  201:dup             
	//  102  202:aload_0         
	//  103  203:invokevirtual   #349 <Method String StringBuilder.toString()>
	//  104  206:invokespecial   #451 <Method void android.content.pm.PackageManager$NameNotFoundException(String)>
	//  105  209:athrow          
		}
	}

	public static Map prepareFontData(Context context, FontInfo afontinfo[], CancellationSignal cancellationsignal)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #459 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #460 <Method void HashMap()>
	//    3    7:astore          5
		int j = afontinfo.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore          4
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_3        
	//*   9   15:iload_3         
	//*  10   16:iload           4
	//*  11   18:icmpge          79
		{
			Object obj = ((Object) (afontinfo[i]));
	//   12   21:aload_1         
	//   13   22:iload_3         
	//   14   23:aaload          
	//   15   24:astore          6
			if(((FontInfo) (obj)).getResultCode() != 0)
	//*  16   26:aload           6
	//*  17   28:invokevirtual   #463 <Method int FontsContractCompat$FontInfo.getResultCode()>
	//*  18   31:ifeq            37
				continue;
	//   19   34:goto            72
			obj = ((Object) (((FontInfo) (obj)).getUri()));
	//   20   37:aload           6
	//   21   39:invokevirtual   #466 <Method Uri FontsContractCompat$FontInfo.getUri()>
	//   22   42:astore          6
			if(!hashmap.containsKey(obj))
	//*  23   44:aload           5
	//*  24   46:aload           6
	//*  25   48:invokevirtual   #467 <Method boolean HashMap.containsKey(Object)>
	//*  26   51:ifeq            57
	//*  27   54:goto            72
				hashmap.put(obj, ((Object) (TypefaceCompatUtil.mmap(context, cancellationsignal, ((Uri) (obj))))));
	//   28   57:aload           5
	//   29   59:aload           6
	//   30   61:aload_0         
	//   31   62:aload_2         
	//   32   63:aload           6
	//   33   65:invokestatic    #473 <Method java.nio.ByteBuffer TypefaceCompatUtil.mmap(Context, CancellationSignal, Uri)>
	//   34   68:invokevirtual   #474 <Method Object HashMap.put(Object, Object)>
	//   35   71:pop             
		}

	//   36   72:iload_3         
	//   37   73:iconst_1        
	//   38   74:iadd            
	//   39   75:istore_3        
	//*  40   76:goto            15
		return Collections.unmodifiableMap(((Map) (hashmap)));
	//   41   79:aload           5
	//   42   81:invokestatic    #478 <Method Map Collections.unmodifiableMap(Map)>
	//   43   84:areturn         
	}

	public static void requestFont(Context context, FontRequest fontrequest, FontRequestCallback fontrequestcallback, Handler handler)
	{
		handler.post(new Runnable(context, fontrequest, new Handler(), fontrequestcallback) {

			public void run()
			{
				android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
				FontFamilyResult fontfamilyresult;
				FontInfo afontinfo[];
				try
				{
					fontfamilyresult = FontsContractCompat.fetchFonts(context, ((CancellationSignal) (null)), request);
			//    0    0:aload_0         
			//    1    1:getfield        #41  <Field Context val$context>
			//    2    4:aconst_null     
			//    3    5:aload_0         
			//    4    6:getfield        #43  <Field FontRequest val$request>
			//    5    9:invokestatic    #58  <Method FontsContractCompat$FontFamilyResult FontsContractCompat.fetchFonts(Context, CancellationSignal, FontRequest)>
			//    6   12:astore_3        
				}
			//*   7   13:aload_3         
			//*   8   14:invokevirtual   #64  <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
			//*   9   17:ifeq            99
			//*  10   20:aload_3         
			//*  11   21:invokevirtual   #64  <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
			//*  12   24:tableswitch     1 2: default 48
			//			               1 82
			//			               2 65
			//*  13   48:aload_0         
			//*  14   49:getfield        #45  <Field Handler val$callerThreadHandler>
			//*  15   52:new             #19  <Class FontsContractCompat$4$4>
			//*  16   55:dup             
			//*  17   56:aload_0         
			//*  18   57:invokespecial   #67  <Method void FontsContractCompat$4$4(FontsContractCompat$4)>
			//*  19   60:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//*  20   63:pop             
			//*  21   64:return          
			//*  22   65:aload_0         
			//*  23   66:getfield        #45  <Field Handler val$callerThreadHandler>
			//*  24   69:new             #17  <Class FontsContractCompat$4$3>
			//*  25   72:dup             
			//*  26   73:aload_0         
			//*  27   74:invokespecial   #74  <Method void FontsContractCompat$4$3(FontsContractCompat$4)>
			//*  28   77:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//*  29   80:pop             
			//*  30   81:return          
			//*  31   82:aload_0         
			//*  32   83:getfield        #45  <Field Handler val$callerThreadHandler>
			//*  33   86:new             #15  <Class FontsContractCompat$4$2>
			//*  34   89:dup             
			//*  35   90:aload_0         
			//*  36   91:invokespecial   #75  <Method void FontsContractCompat$4$2(FontsContractCompat$4)>
			//*  37   94:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//*  38   97:pop             
			//*  39   98:return          
			//*  40   99:aload_3         
			//*  41  100:invokevirtual   #79  <Method FontsContractCompat$FontInfo[] FontsContractCompat$FontFamilyResult.getFonts()>
			//*  42  103:astore_3        
			//*  43  104:aload_3         
			//*  44  105:ifnull          240
			//*  45  108:aload_3         
			//*  46  109:arraylength     
			//*  47  110:ifne            116
			//*  48  113:goto            240
			//*  49  116:aload_3         
			//*  50  117:arraylength     
			//*  51  118:istore_2        
			//*  52  119:iconst_0        
			//*  53  120:istore_1        
			//*  54  121:iload_1         
			//*  55  122:iload_2         
			//*  56  123:icmpge          191
			//*  57  126:aload_3         
			//*  58  127:iload_1         
			//*  59  128:aaload          
			//*  60  129:astore          4
			//*  61  131:aload           4
			//*  62  133:invokevirtual   #84  <Method int FontsContractCompat$FontInfo.getResultCode()>
			//*  63  136:ifeq            184
			//*  64  139:aload           4
			//*  65  141:invokevirtual   #84  <Method int FontsContractCompat$FontInfo.getResultCode()>
			//*  66  144:istore_1        
			//*  67  145:iload_1         
			//*  68  146:ifge            166
			//*  69  149:aload_0         
			//*  70  150:getfield        #45  <Field Handler val$callerThreadHandler>
			//*  71  153:new             #23  <Class FontsContractCompat$4$6>
			//*  72  156:dup             
			//*  73  157:aload_0         
			//*  74  158:invokespecial   #85  <Method void FontsContractCompat$4$6(FontsContractCompat$4)>
			//*  75  161:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//*  76  164:pop             
			//*  77  165:return          
			//*  78  166:aload_0         
			//*  79  167:getfield        #45  <Field Handler val$callerThreadHandler>
			//*  80  170:new             #25  <Class FontsContractCompat$4$7>
			//*  81  173:dup             
			//*  82  174:aload_0         
			//*  83  175:iload_1         
			//*  84  176:invokespecial   #88  <Method void FontsContractCompat$4$7(FontsContractCompat$4, int)>
			//*  85  179:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//*  86  182:pop             
			//*  87  183:return          
			//*  88  184:iload_1         
			//*  89  185:iconst_1        
			//*  90  186:iadd            
			//*  91  187:istore_1        
			//*  92  188:goto            121
			//*  93  191:aload_0         
			//*  94  192:getfield        #41  <Field Context val$context>
			//*  95  195:aconst_null     
			//*  96  196:aload_3         
			//*  97  197:invokestatic    #92  <Method Typeface FontsContractCompat.buildTypeface(Context, CancellationSignal, FontsContractCompat$FontInfo[])>
			//*  98  200:astore_3        
			//*  99  201:aload_3         
			//* 100  202:ifnonnull       222
			//* 101  205:aload_0         
			//* 102  206:getfield        #45  <Field Handler val$callerThreadHandler>
			//* 103  209:new             #27  <Class FontsContractCompat$4$8>
			//* 104  212:dup             
			//* 105  213:aload_0         
			//* 106  214:invokespecial   #93  <Method void FontsContractCompat$4$8(FontsContractCompat$4)>
			//* 107  217:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//* 108  220:pop             
			//* 109  221:return          
			//* 110  222:aload_0         
			//* 111  223:getfield        #45  <Field Handler val$callerThreadHandler>
			//* 112  226:new             #29  <Class FontsContractCompat$4$9>
			//* 113  229:dup             
			//* 114  230:aload_0         
			//* 115  231:aload_3         
			//* 116  232:invokespecial   #96  <Method void FontsContractCompat$4$9(FontsContractCompat$4, Typeface)>
			//* 117  235:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//* 118  238:pop             
			//* 119  239:return          
			//* 120  240:aload_0         
			//* 121  241:getfield        #45  <Field Handler val$callerThreadHandler>
			//* 122  244:new             #21  <Class FontsContractCompat$4$5>
			//* 123  247:dup             
			//* 124  248:aload_0         
			//* 125  249:invokespecial   #97  <Method void FontsContractCompat$4$5(FontsContractCompat$4)>
			//* 126  252:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//* 127  255:pop             
			//* 128  256:return          
			//* 129  257:aload_0         
			//* 130  258:getfield        #45  <Field Handler val$callerThreadHandler>
			//* 131  261:new             #13  <Class FontsContractCompat$4$1>
			//* 132  264:dup             
			//* 133  265:aload_0         
			//* 134  266:invokespecial   #98  <Method void FontsContractCompat$4$1(FontsContractCompat$4)>
			//* 135  269:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//* 136  272:pop             
			//* 137  273:return          
				// Misplaced declaration of an exception variable
				catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
				{
					callerThreadHandler.post(new Runnable() {

						public void run()
						{
							callback.onTypefaceRequestFailed(-1);
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
						//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
						//    3    7:iconst_m1       
						//    4    8:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
						//    5   11:return          
						}

						final _cls4 this$0;

			
			{
				this$0 = _cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
);
					return;
				}
				if(fontfamilyresult.getStatusCode() != 0)
					switch(fontfamilyresult.getStatusCode())
					{
					default:
						callerThreadHandler.post(new Runnable() {

							public void run()
							{
								callback.onTypefaceRequestFailed(-3);
							//    0    0:aload_0         
							//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
							//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
							//    3    7:bipush          -3
							//    4    9:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
							//    5   12:return          
							}

							final _cls4 this$0;

			
			{
				this$0 = _cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
						}
);
						return;

					case 2: // '\002'
						callerThreadHandler.post(new Runnable() {

							public void run()
							{
								callback.onTypefaceRequestFailed(-3);
							//    0    0:aload_0         
							//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
							//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
							//    3    7:bipush          -3
							//    4    9:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
							//    5   12:return          
							}

							final _cls4 this$0;

			
			{
				this$0 = _cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
						}
);
						return;

					case 1: // '\001'
						callerThreadHandler.post(new Runnable() {

							public void run()
							{
								callback.onTypefaceRequestFailed(-2);
							//    0    0:aload_0         
							//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
							//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
							//    3    7:bipush          -2
							//    4    9:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
							//    5   12:return          
							}

							final _cls4 this$0;

			
			{
				this$0 = _cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
						}
);
						return;
					}
				afontinfo = fontfamilyresult.getFonts();
				if(afontinfo != null && afontinfo.length != 0)
				{
					int j = afontinfo.length;
					for(int i = 0; i < j; i++)
					{
						FontInfo fontinfo = afontinfo[i];
						if(fontinfo.getResultCode() != 0)
						{
							i = fontinfo.getResultCode();
							if(i < 0)
							{
								callerThreadHandler.post(new Runnable() {

									public void run()
									{
										callback.onTypefaceRequestFailed(-3);
									//    0    0:aload_0         
									//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
									//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
									//    3    7:bipush          -3
									//    4    9:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
									//    5   12:return          
									}

									final _cls4 this$0;

			
			{
				this$0 = _cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
								}
);
								return;
							} else
							{
								callerThreadHandler.post(((_cls7) (i)). new Runnable() {

									public void run()
									{
										callback.onTypefaceRequestFailed(resultCode);
									//    0    0:aload_0         
									//    1    1:getfield        #19  <Field FontsContractCompat$4 this$0>
									//    2    4:getfield        #28  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
									//    3    7:aload_0         
									//    4    8:getfield        #21  <Field int val$resultCode>
									//    5   11:invokevirtual   #34  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
									//    6   14:return          
									}

									final _cls4 this$0;
									final int val$resultCode;

			
			{
				this$0 = final__pcls4;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FontsContractCompat$4 this$0>
				resultCode = I.this;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int val$resultCode>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
								}
);
								return;
							}
						}
					}

					Typeface typeface = FontsContractCompat.buildTypeface(context, ((CancellationSignal) (null)), afontinfo);
					if(typeface == null)
					{
						callerThreadHandler.post(new Runnable() {

							public void run()
							{
								callback.onTypefaceRequestFailed(-3);
							//    0    0:aload_0         
							//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
							//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
							//    3    7:bipush          -3
							//    4    9:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
							//    5   12:return          
							}

							final _cls4 this$0;

			
			{
				this$0 = _cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
						}
);
						return;
					} else
					{
						callerThreadHandler.post(((_cls9) (typeface)). new Runnable() {

							public void run()
							{
								callback.onTypefaceRetrieved(typeface);
							//    0    0:aload_0         
							//    1    1:getfield        #19  <Field FontsContractCompat$4 this$0>
							//    2    4:getfield        #28  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
							//    3    7:aload_0         
							//    4    8:getfield        #21  <Field Typeface val$typeface>
							//    5   11:invokevirtual   #34  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRetrieved(Typeface)>
							//    6   14:return          
							}

							final _cls4 this$0;
							final Typeface val$typeface;

			
			{
				this$0 = final__pcls4;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FontsContractCompat$4 this$0>
				typeface = Typeface.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Typeface val$typeface>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
						}
);
						return;
					}
				} else
				{
					callerThreadHandler.post(new Runnable() {

						public void run()
						{
							callback.onTypefaceRequestFailed(1);
						//    0    0:aload_0         
						//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
						//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
						//    3    7:iconst_1        
						//    4    8:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
						//    5   11:return          
						}

						final _cls4 this$0;

			
			{
				this$0 = _cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
					}
);
					return;
				}
			//* 138  274:astore_3        
			//* 139  275:goto            257
			}

			final FontRequestCallback val$callback;
			final Handler val$callerThreadHandler;
			final Context val$context;
			final FontRequest val$request;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #41  <Field Context val$context>
				request = fontrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #43  <Field FontRequest val$request>
				callerThreadHandler = handler;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #45  <Field Handler val$callerThreadHandler>
				callback = fontrequestcallback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #47  <Field FontsContractCompat$FontRequestCallback val$callback>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #50  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_3         
	//    1    1:new             #12  <Class FontsContractCompat$4>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:new             #483 <Class Handler>
	//    6   10:dup             
	//    7   11:invokespecial   #484 <Method void Handler()>
	//    8   14:aload_2         
	//    9   15:invokespecial   #487 <Method void FontsContractCompat$4(Context, FontRequest, Handler, FontsContractCompat$FontRequestCallback)>
	//   10   18:invokevirtual   #491 <Method boolean Handler.post(Runnable)>
	//   11   21:pop             
	//   12   22:return          
	}

	public static void resetCache()
	{
		sTypefaceCache.evictAll();
	//    0    0:getstatic       #92  <Field LruCache sTypefaceCache>
	//    1    3:invokevirtual   #495 <Method void LruCache.evictAll()>
	//    2    6:return          
	}

	private static final int BACKGROUND_THREAD_KEEP_ALIVE_DURATION_MS = 10000;
	public static final String PARCEL_FONT_RESULTS = "font_results";
	static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;
	static final int RESULT_CODE_WRONG_CERTIFICATES = -2;
	private static final String TAG = "FontsContractCompat";
	private static final SelfDestructiveThread sBackgroundThread = new SelfDestructiveThread("fonts", 10, 10000);
	private static final Comparator sByteArrayComparator = new Comparator() {

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((byte[])obj, (byte[])obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #18  <Class byte[]>
		//    3    5:aload_2         
		//    4    6:checkcast       #18  <Class byte[]>
		//    5    9:invokevirtual   #21  <Method int compare(byte[], byte[])>
		//    6   12:ireturn         
		}

		public int compare(byte abyte0[], byte abyte1[])
		{
			if(abyte0.length != abyte1.length)
		//*   0    0:aload_1         
		//*   1    1:arraylength     
		//*   2    2:aload_2         
		//*   3    3:arraylength     
		//*   4    4:icmpeq          13
				return abyte0.length - abyte1.length;
		//    5    7:aload_1         
		//    6    8:arraylength     
		//    7    9:aload_2         
		//    8   10:arraylength     
		//    9   11:isub            
		//   10   12:ireturn         
			for(int i = 0; i < abyte0.length; i++)
		//*  11   13:iconst_0        
		//*  12   14:istore_3        
		//*  13   15:iload_3         
		//*  14   16:aload_1         
		//*  15   17:arraylength     
		//*  16   18:icmpge          45
				if(abyte0[i] != abyte1[i])
		//*  17   21:aload_1         
		//*  18   22:iload_3         
		//*  19   23:baload          
		//*  20   24:aload_2         
		//*  21   25:iload_3         
		//*  22   26:baload          
		//*  23   27:icmpeq          38
					return abyte0[i] - abyte1[i];
		//   24   30:aload_1         
		//   25   31:iload_3         
		//   26   32:baload          
		//   27   33:aload_2         
		//   28   34:iload_3         
		//   29   35:baload          
		//   30   36:isub            
		//   31   37:ireturn         

		//   32   38:iload_3         
		//   33   39:iconst_1        
		//   34   40:iadd            
		//   35   41:istore_3        
		//*  36   42:goto            15
			return 0;
		//   37   45:iconst_0        
		//   38   46:ireturn         
		}

	}
;
	static final Object sLock = new Object();
	static final SimpleArrayMap sPendingReplies = new SimpleArrayMap();
	static final LruCache sTypefaceCache = new LruCache(16);

	static 
	{
	//    0    0:new             #86  <Class LruCache>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #90  <Method void LruCache(int)>
	//    4    9:putstatic       #92  <Field LruCache sTypefaceCache>
	//    5   12:new             #94  <Class SelfDestructiveThread>
	//    6   15:dup             
	//    7   16:ldc1            #96  <String "fonts">
	//    8   18:bipush          10
	//    9   20:sipush          10000
	//   10   23:invokespecial   #99  <Method void SelfDestructiveThread(String, int, int)>
	//   11   26:putstatic       #101 <Field SelfDestructiveThread sBackgroundThread>
	//   12   29:new             #4   <Class Object>
	//   13   32:dup             
	//   14   33:invokespecial   #103 <Method void Object()>
	//   15   36:putstatic       #105 <Field Object sLock>
	//   16   39:new             #107 <Class SimpleArrayMap>
	//   17   42:dup             
	//   18   43:invokespecial   #108 <Method void SimpleArrayMap()>
	//   19   46:putstatic       #110 <Field SimpleArrayMap sPendingReplies>
	//   20   49:new             #32  <Class FontsContractCompat$5>
	//   21   52:dup             
	//   22   53:invokespecial   #111 <Method void FontsContractCompat$5()>
	//   23   56:putstatic       #113 <Field Comparator sByteArrayComparator>
	//*  24   59:return          
	}
}
