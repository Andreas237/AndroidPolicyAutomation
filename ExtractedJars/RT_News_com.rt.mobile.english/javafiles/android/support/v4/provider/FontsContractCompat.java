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
		//    1    1:getfield        #34  <Field FontsContractCompat$FontInfo[] mFonts>
		//    2    4:areturn         
		}

		public int getStatusCode()
		{
			return mStatusCode;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field int mStatusCode>
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
		//    1    1:invokespecial   #30  <Method void Object()>
			mStatusCode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #32  <Field int mStatusCode>
			mFonts = afontinfo;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #34  <Field FontsContractCompat$FontInfo[] mFonts>
		//    8   14:return          
		}
	}

	static interface FontFamilyResult.FontResultStatus
		extends Annotation
	{
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
	//    1    1:invokespecial   #106 <Method void Object()>
	//    2    4:return          
	}

	public static Typeface buildTypeface(Context context, CancellationSignal cancellationsignal, FontInfo afontinfo[])
	{
		return TypefaceCompat.createFromFontInfo(context, cancellationsignal, afontinfo, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #138 <Method Typeface TypefaceCompat.createFromFontInfo(Context, CancellationSignal, FontsContractCompat$FontInfo[], int)>
	//    5    7:areturn         
	}

	private static List convertToByteArrayList(Signature asignature[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #144 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #145 <Method void ArrayList()>
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
	//   14   20:invokevirtual   #151 <Method byte[] Signature.toByteArray()>
	//   15   23:invokeinterface #157 <Method boolean List.add(Object)>
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
	//*   1    1:invokeinterface #165 <Method int List.size()>
	//*   2    6:aload_1         
	//*   3    7:invokeinterface #165 <Method int List.size()>
	//*   4   12:icmpeq          17
			return false;
	//    5   15:iconst_0        
	//    6   16:ireturn         
		for(int i = 0; i < list.size(); i++)
	//*   7   17:iconst_0        
	//*   8   18:istore_2        
	//*   9   19:iload_2         
	//*  10   20:aload_0         
	//*  11   21:invokeinterface #165 <Method int List.size()>
	//*  12   26:icmpge          64
			if(!Arrays.equals((byte[])list.get(i), (byte[])list1.get(i)))
	//*  13   29:aload_0         
	//*  14   30:iload_2         
	//*  15   31:invokeinterface #169 <Method Object List.get(int)>
	//*  16   36:checkcast       #171 <Class byte[]>
	//*  17   39:aload_1         
	//*  18   40:iload_2         
	//*  19   41:invokeinterface #169 <Method Object List.get(int)>
	//*  20   46:checkcast       #171 <Class byte[]>
	//*  21   49:invokestatic    #177 <Method boolean Arrays.equals(byte[], byte[])>
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
	//    1    1:invokevirtual   #188 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #192 <Method Resources Context.getResources()>
	//    5    9:invokestatic    #196 <Method ProviderInfo getProvider(PackageManager, FontRequest, Resources)>
	//    6   12:astore_3        
		if(providerinfo == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       27
			return new FontFamilyResult(1, ((FontInfo []) (null)));
	//    9   17:new             #37  <Class FontsContractCompat$FontFamilyResult>
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:aconst_null     
	//   13   23:invokespecial   #199 <Method void FontsContractCompat$FontFamilyResult(int, FontsContractCompat$FontInfo[])>
	//   14   26:areturn         
		else
			return new FontFamilyResult(0, getFontFromProvider(context, fontrequest, providerinfo.authority, cancellationsignal));
	//   15   27:new             #37  <Class FontsContractCompat$FontFamilyResult>
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:aload_3         
	//   21   35:getfield        #204 <Field String ProviderInfo.authority>
	//   22   38:aload_1         
	//   23   39:invokestatic    #208 <Method FontsContractCompat$FontInfo[] getFontFromProvider(Context, FontRequest, String, CancellationSignal)>
	//   24   42:invokespecial   #199 <Method void FontsContractCompat$FontFamilyResult(int, FontsContractCompat$FontInfo[])>
	//   25   45:areturn         
	}

	private static List getCertificates(FontRequest fontrequest, Resources resources)
	{
		if(fontrequest.getCertificates() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #216 <Method List FontRequest.getCertificates()>
	//*   2    4:ifnull          12
			return fontrequest.getCertificates();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #216 <Method List FontRequest.getCertificates()>
	//    5   11:areturn         
		else
			return FontResourcesParserCompat.readCerts(resources, fontrequest.getCertificatesArrayResId());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #219 <Method int FontRequest.getCertificatesArrayResId()>
	//    9   17:invokestatic    #225 <Method List FontResourcesParserCompat.readCerts(Resources, int)>
	//   10   20:areturn         
	}

	static FontInfo[] getFontFromProvider(Context context, FontRequest fontrequest, String s, CancellationSignal cancellationsignal)
	{
		ArrayList arraylist;
		Object obj;
		Uri uri;
		Uri uri1;
		arraylist = new ArrayList();
	//    0    0:new             #144 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #145 <Method void ArrayList()>
	//    3    7:astore          14
		uri = (new android.net.Uri.Builder()).scheme("content").authority(s).build();
	//    4    9:new             #229 <Class android.net.Uri$Builder>
	//    5   12:dup             
	//    6   13:invokespecial   #230 <Method void android.net.Uri$Builder()>
	//    7   16:ldc1            #232 <String "content">
	//    8   18:invokevirtual   #236 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    9   21:aload_2         
	//   10   22:invokevirtual   #238 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   11   25:invokevirtual   #242 <Method Uri android.net.Uri$Builder.build()>
	//   12   28:astore          16
		uri1 = (new android.net.Uri.Builder()).scheme("content").authority(s).appendPath("file").build();
	//   13   30:new             #229 <Class android.net.Uri$Builder>
	//   14   33:dup             
	//   15   34:invokespecial   #230 <Method void android.net.Uri$Builder()>
	//   16   37:ldc1            #232 <String "content">
	//   17   39:invokevirtual   #236 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   18   42:aload_2         
	//   19   43:invokevirtual   #238 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   20   46:ldc1            #244 <String "file">
	//   21   48:invokevirtual   #247 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   22   51:invokevirtual   #242 <Method Uri android.net.Uri$Builder.build()>
	//   23   54:astore          17
		obj = null;
	//   24   56:aconst_null     
	//   25   57:astore          15
		s = ((String) (obj));
	//   26   59:aload           15
	//   27   61:astore_2        
		if(android.os.Build.VERSION.SDK_INT <= 16)
			break MISSING_BLOCK_LABEL_160;
	//   28   62:getstatic       #252 <Field int android.os.Build$VERSION.SDK_INT>
	//   29   65:bipush          16
	//   30   67:icmple          160
		s = ((String) (obj));
	//   31   70:aload           15
	//   32   72:astore_2        
		context = ((Context) (context.getContentResolver()));
	//   33   73:aload_0         
	//   34   74:invokevirtual   #256 <Method ContentResolver Context.getContentResolver()>
	//   35   77:astore_0        
		s = ((String) (obj));
	//   36   78:aload           15
	//   37   80:astore_2        
		fontrequest = ((FontRequest) (fontrequest.getQuery()));
	//   38   81:aload_1         
	//   39   82:invokevirtual   #260 <Method String FontRequest.getQuery()>
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
	//   49   99:ldc2            #264 <String "_id">
	//   50  102:aastore         
	//   51  103:dup             
	//   52  104:iconst_1        
	//   53  105:ldc2            #266 <String "file_id">
	//   54  108:aastore         
	//   55  109:dup             
	//   56  110:iconst_2        
	//   57  111:ldc2            #268 <String "font_ttc_index">
	//   58  114:aastore         
	//   59  115:dup             
	//   60  116:iconst_3        
	//   61  117:ldc2            #270 <String "font_variation_settings">
	//   62  120:aastore         
	//   63  121:dup             
	//   64  122:iconst_4        
	//   65  123:ldc2            #272 <String "font_weight">
	//   66  126:aastore         
	//   67  127:dup             
	//   68  128:iconst_5        
	//   69  129:ldc2            #274 <String "font_italic">
	//   70  132:aastore         
	//   71  133:dup             
	//   72  134:bipush          6
	//   73  136:ldc2            #276 <String "result_code">
	//   74  139:aastore         
	//   75  140:ldc2            #278 <String "query = ?">
	//   76  143:iconst_1        
	//   77  144:anewarray       String[]
	//   78  147:dup             
	//   79  148:iconst_0        
	//   80  149:aload_1         
	//   81  150:aastore         
	//   82  151:aconst_null     
	//   83  152:aload_3         
	//   84  153:invokevirtual   #284 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String, CancellationSignal)>
	//   85  156:astore_0        
		break MISSING_BLOCK_LABEL_249;
	//   86  157:goto            565
		s = ((String) (obj));
	//   87  160:aload           15
	//   88  162:astore_2        
		context = ((Context) (context.getContentResolver()));
	//   89  163:aload_0         
	//   90  164:invokevirtual   #256 <Method ContentResolver Context.getContentResolver()>
	//   91  167:astore_0        
		s = ((String) (obj));
	//   92  168:aload           15
	//   93  170:astore_2        
		fontrequest = ((FontRequest) (fontrequest.getQuery()));
	//   94  171:aload_1         
	//   95  172:invokevirtual   #260 <Method String FontRequest.getQuery()>
	//   96  175:astore_1        
		s = ((String) (obj));
	//   97  176:aload           15
	//   98  178:astore_2        
		context = ((Context) (((ContentResolver) (context)).query(uri, new String[] {
			"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"
		}, "query = ?", new String[] {
			fontrequest
		}, ((String) (null)))));
	//   99  179:aload_0         
	//  100  180:aload           16
	//  101  182:bipush          7
	//  102  184:anewarray       String[]
	//  103  187:dup             
	//  104  188:iconst_0        
	//  105  189:ldc2            #264 <String "_id">
	//  106  192:aastore         
	//  107  193:dup             
	//  108  194:iconst_1        
	//  109  195:ldc2            #266 <String "file_id">
	//  110  198:aastore         
	//  111  199:dup             
	//  112  200:iconst_2        
	//  113  201:ldc2            #268 <String "font_ttc_index">
	//  114  204:aastore         
	//  115  205:dup             
	//  116  206:iconst_3        
	//  117  207:ldc2            #270 <String "font_variation_settings">
	//  118  210:aastore         
	//  119  211:dup             
	//  120  212:iconst_4        
	//  121  213:ldc2            #272 <String "font_weight">
	//  122  216:aastore         
	//  123  217:dup             
	//  124  218:iconst_5        
	//  125  219:ldc2            #274 <String "font_italic">
	//  126  222:aastore         
	//  127  223:dup             
	//  128  224:bipush          6
	//  129  226:ldc2            #276 <String "result_code">
	//  130  229:aastore         
	//  131  230:ldc2            #278 <String "query = ?">
	//  132  233:iconst_1        
	//  133  234:anewarray       String[]
	//  134  237:dup             
	//  135  238:iconst_0        
	//  136  239:aload_1         
	//  137  240:aastore         
	//  138  241:aconst_null     
	//  139  242:invokevirtual   #287 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//  140  245:astore_0        
	//* 141  246:goto            565
		fontrequest = ((FontRequest) (arraylist));
	//  142  249:aload           14
	//  143  251:astore_1        
		if(context == null) goto _L2; else goto _L1
	//  144  252:aload_0         
	//  145  253:ifnull          530
_L1:
		fontrequest = ((FontRequest) (arraylist));
	//  146  256:aload           14
	//  147  258:astore_1        
		s = ((String) (context));
	//  148  259:aload_0         
	//  149  260:astore_2        
		if(((Cursor) (context)).getCount() <= 0) goto _L2; else goto _L3
	//  150  261:aload_0         
	//  151  262:invokeinterface #292 <Method int Cursor.getCount()>
	//  152  267:ifle            530
_L3:
		s = ((String) (context));
	//  153  270:aload_0         
	//  154  271:astore_2        
		int l = ((Cursor) (context)).getColumnIndex("result_code");
	//  155  272:aload_0         
	//  156  273:ldc2            #276 <String "result_code">
	//  157  276:invokeinterface #296 <Method int Cursor.getColumnIndex(String)>
	//  158  281:istore          7
		s = ((String) (context));
	//  159  283:aload_0         
	//  160  284:astore_2        
		cancellationsignal = ((CancellationSignal) (new ArrayList()));
	//  161  285:new             #144 <Class ArrayList>
	//  162  288:dup             
	//  163  289:invokespecial   #145 <Method void ArrayList()>
	//  164  292:astore_3        
		s = ((String) (context));
	//  165  293:aload_0         
	//  166  294:astore_2        
		int i1 = ((Cursor) (context)).getColumnIndex("_id");
	//  167  295:aload_0         
	//  168  296:ldc2            #264 <String "_id">
	//  169  299:invokeinterface #296 <Method int Cursor.getColumnIndex(String)>
	//  170  304:istore          8
		s = ((String) (context));
	//  171  306:aload_0         
	//  172  307:astore_2        
		int j1 = ((Cursor) (context)).getColumnIndex("file_id");
	//  173  308:aload_0         
	//  174  309:ldc2            #266 <String "file_id">
	//  175  312:invokeinterface #296 <Method int Cursor.getColumnIndex(String)>
	//  176  317:istore          9
		s = ((String) (context));
	//  177  319:aload_0         
	//  178  320:astore_2        
		int k1 = ((Cursor) (context)).getColumnIndex("font_ttc_index");
	//  179  321:aload_0         
	//  180  322:ldc2            #268 <String "font_ttc_index">
	//  181  325:invokeinterface #296 <Method int Cursor.getColumnIndex(String)>
	//  182  330:istore          10
		s = ((String) (context));
	//  183  332:aload_0         
	//  184  333:astore_2        
		int l1 = ((Cursor) (context)).getColumnIndex("font_weight");
	//  185  334:aload_0         
	//  186  335:ldc2            #272 <String "font_weight">
	//  187  338:invokeinterface #296 <Method int Cursor.getColumnIndex(String)>
	//  188  343:istore          11
		s = ((String) (context));
	//  189  345:aload_0         
	//  190  346:astore_2        
		int i2 = ((Cursor) (context)).getColumnIndex("font_italic");
	//  191  347:aload_0         
	//  192  348:ldc2            #274 <String "font_italic">
	//  193  351:invokeinterface #296 <Method int Cursor.getColumnIndex(String)>
	//  194  356:istore          12
_L12:
		s = ((String) (context));
	//  195  358:aload_0         
	//  196  359:astore_2        
		if(!((Cursor) (context)).moveToNext()) goto _L5; else goto _L4
	//  197  360:aload_0         
	//  198  361:invokeinterface #300 <Method boolean Cursor.moveToNext()>
	//  199  366:ifeq            528
_L4:
		if(l == -1) goto _L7; else goto _L6
	//  200  369:iload           7
	//  201  371:iconst_m1       
	//  202  372:icmpeq          568
_L6:
		s = ((String) (context));
	//  203  375:aload_0         
	//  204  376:astore_2        
		int i = ((Cursor) (context)).getInt(l);
	//  205  377:aload_0         
	//  206  378:iload           7
	//  207  380:invokeinterface #304 <Method int Cursor.getInt(int)>
	//  208  385:istore          4
	//* 209  387:goto            390
_L13:
		if(k1 == -1) goto _L9; else goto _L8
	//  210  390:iload           10
	//  211  392:iconst_m1       
	//  212  393:icmpeq          574
_L8:
		s = ((String) (context));
	//  213  396:aload_0         
	//  214  397:astore_2        
		int j = ((Cursor) (context)).getInt(k1);
	//  215  398:aload_0         
	//  216  399:iload           10
	//  217  401:invokeinterface #304 <Method int Cursor.getInt(int)>
	//  218  406:istore          5
	//* 219  408:goto            411
_L14:
		if(j1 != -1)
			break MISSING_BLOCK_LABEL_436;
	//  220  411:iload           9
	//  221  413:iconst_m1       
	//  222  414:icmpne          436
		s = ((String) (context));
	//  223  417:aload_0         
	//  224  418:astore_2        
		fontrequest = ((FontRequest) (ContentUris.withAppendedId(uri, ((Cursor) (context)).getLong(i1))));
	//  225  419:aload           16
	//  226  421:aload_0         
	//  227  422:iload           8
	//  228  424:invokeinterface #308 <Method long Cursor.getLong(int)>
	//  229  429:invokestatic    #314 <Method Uri ContentUris.withAppendedId(Uri, long)>
	//  230  432:astore_1        
		break MISSING_BLOCK_LABEL_455;
	//  231  433:goto            580
		s = ((String) (context));
	//  232  436:aload_0         
	//  233  437:astore_2        
		fontrequest = ((FontRequest) (ContentUris.withAppendedId(uri1, ((Cursor) (context)).getLong(j1))));
	//  234  438:aload           17
	//  235  440:aload_0         
	//  236  441:iload           9
	//  237  443:invokeinterface #308 <Method long Cursor.getLong(int)>
	//  238  448:invokestatic    #314 <Method Uri ContentUris.withAppendedId(Uri, long)>
	//  239  451:astore_1        
	//* 240  452:goto            580
		if(l1 == -1) goto _L11; else goto _L10
	//  241  455:iload           11
	//  242  457:iconst_m1       
	//  243  458:icmpeq          583
_L10:
		s = ((String) (context));
	//  244  461:aload_0         
	//  245  462:astore_2        
		int k = ((Cursor) (context)).getInt(l1);
	//  246  463:aload_0         
	//  247  464:iload           11
	//  248  466:invokeinterface #304 <Method int Cursor.getInt(int)>
	//  249  471:istore          6
	//* 250  473:goto            476
_L15:
		if(i2 == -1)
			break MISSING_BLOCK_LABEL_591;
	//  251  476:iload           12
	//  252  478:iconst_m1       
	//  253  479:icmpeq          591
		s = ((String) (context));
	//  254  482:aload_0         
	//  255  483:astore_2        
		if(((Cursor) (context)).getInt(i2) != 1)
			break MISSING_BLOCK_LABEL_591;
	//  256  484:aload_0         
	//  257  485:iload           12
	//  258  487:invokeinterface #304 <Method int Cursor.getInt(int)>
	//  259  492:iconst_1        
	//  260  493:icmpne          591
		boolean flag = true;
	//  261  496:iconst_1        
	//  262  497:istore          13
	//* 263  499:goto            502
_L16:
		s = ((String) (context));
	//  264  502:aload_0         
	//  265  503:astore_2        
		((ArrayList) (cancellationsignal)).add(((Object) (new FontInfo(((Uri) (fontrequest)), j, k, flag, i))));
	//  266  504:aload_3         
	//  267  505:new             #43  <Class FontsContractCompat$FontInfo>
	//  268  508:dup             
	//  269  509:aload_1         
	//  270  510:iload           5
	//  271  512:iload           6
	//  272  514:iload           13
	//  273  516:iload           4
	//  274  518:invokespecial   #317 <Method void FontsContractCompat$FontInfo(Uri, int, int, boolean, int)>
	//  275  521:invokevirtual   #318 <Method boolean ArrayList.add(Object)>
	//  276  524:pop             
		  goto _L12
	//* 277  525:goto            358
_L5:
		fontrequest = ((FontRequest) (cancellationsignal));
	//  278  528:aload_3         
	//  279  529:astore_1        
_L2:
		if(context != null)
	//* 280  530:aload_0         
	//* 281  531:ifnull          540
			((Cursor) (context)).close();
	//  282  534:aload_0         
	//  283  535:invokeinterface #321 <Method void Cursor.close()>
		return (FontInfo[])((ArrayList) (fontrequest)).toArray(((Object []) (new FontInfo[0])));
	//  284  540:aload_1         
	//  285  541:iconst_0        
	//  286  542:anewarray       FontInfo[]
	//  287  545:invokevirtual   #325 <Method Object[] ArrayList.toArray(Object[])>
	//  288  548:checkcast       #327 <Class FontsContractCompat$FontInfo[]>
	//  289  551:areturn         
		context;
	//  290  552:astore_0        
		if(s != null)
	//* 291  553:aload_2         
	//* 292  554:ifnull          563
			((Cursor) (s)).close();
	//  293  557:aload_2         
	//  294  558:invokeinterface #321 <Method void Cursor.close()>
		throw context;
	//  295  563:aload_0         
	//  296  564:athrow          
	//* 297  565:goto            249
_L7:
		i = 0;
	//  298  568:iconst_0        
	//  299  569:istore          4
		  goto _L13
	//* 300  571:goto            390
_L9:
		j = 0;
	//  301  574:iconst_0        
	//  302  575:istore          5
		  goto _L14
	//* 303  577:goto            411
	//* 304  580:goto            455
_L11:
		k = 400;
	//  305  583:sipush          400
	//  306  586:istore          6
		  goto _L15
	//* 307  588:goto            476
		flag = false;
	//  308  591:iconst_0        
	//  309  592:istore          13
		  goto _L16
	//* 310  594:goto            502
	}

	private static TypefaceResult getFontInternal(Context context, FontRequest fontrequest, int i)
	{
		byte byte0;
		int j;
		try
		{
			fontrequest = ((FontRequest) (fetchFonts(context, ((CancellationSignal) (null)), fontrequest)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokestatic    #329 <Method FontsContractCompat$FontFamilyResult fetchFonts(Context, CancellationSignal, FontRequest)>
	//    4    6:astore_1        
		}
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #332 <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
	//*   7   11:istore          4
	//*   8   13:bipush          -3
	//*   9   15:istore_3        
	//*  10   16:iload           4
	//*  11   18:ifne            48
	//*  12   21:aload_0         
	//*  13   22:aconst_null     
	//*  14   23:aload_1         
	//*  15   24:invokevirtual   #336 <Method FontsContractCompat$FontInfo[] FontsContractCompat$FontFamilyResult.getFonts()>
	//*  16   27:iload_2         
	//*  17   28:invokestatic    #138 <Method Typeface TypefaceCompat.createFromFontInfo(Context, CancellationSignal, FontsContractCompat$FontInfo[], int)>
	//*  18   31:astore_0        
	//*  19   32:aload_0         
	//*  20   33:ifnull          38
	//*  21   36:iconst_0        
	//*  22   37:istore_3        
	//*  23   38:new             #52  <Class FontsContractCompat$TypefaceResult>
	//*  24   41:dup             
	//*  25   42:aload_0         
	//*  26   43:iload_3         
	//*  27   44:invokespecial   #339 <Method void FontsContractCompat$TypefaceResult(Typeface, int)>
	//*  28   47:areturn         
	//*  29   48:aload_1         
	//*  30   49:invokevirtual   #332 <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
	//*  31   52:iconst_1        
	//*  32   53:icmpne          59
	//*  33   56:bipush          -2
	//*  34   58:istore_3        
	//*  35   59:new             #52  <Class FontsContractCompat$TypefaceResult>
	//*  36   62:dup             
	//*  37   63:aconst_null     
	//*  38   64:iload_3         
	//*  39   65:invokespecial   #339 <Method void FontsContractCompat$TypefaceResult(Typeface, int)>
	//*  40   68:areturn         
	//*  41   69:new             #52  <Class FontsContractCompat$TypefaceResult>
	//*  42   72:dup             
	//*  43   73:aconst_null     
	//*  44   74:iconst_m1       
	//*  45   75:invokespecial   #339 <Method void FontsContractCompat$TypefaceResult(Typeface, int)>
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
	//    0    0:new             #345 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #346 <Method void StringBuilder()>
	//    3    7:astore          7
		((StringBuilder) (obj)).append(fontrequest.getIdentifier());
	//    4    9:aload           7
	//    5   11:aload_1         
	//    6   12:invokevirtual   #349 <Method String FontRequest.getIdentifier()>
	//    7   15:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		((StringBuilder) (obj)).append("-");
	//    9   19:aload           7
	//   10   21:ldc2            #355 <String "-">
	//   11   24:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
		((StringBuilder) (obj)).append(j);
	//   13   28:aload           7
	//   14   30:iload           6
	//   15   32:invokevirtual   #358 <Method StringBuilder StringBuilder.append(int)>
	//   16   35:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   17   36:aload           7
	//   18   38:invokevirtual   #361 <Method String StringBuilder.toString()>
	//   19   41:astore          7
		Typeface typeface = (Typeface)sTypefaceCache.get(obj);
	//   20   43:getstatic       #95  <Field LruCache sTypefaceCache>
	//   21   46:aload           7
	//   22   48:invokevirtual   #364 <Method Object LruCache.get(Object)>
	//   23   51:checkcast       #366 <Class Typeface>
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
	//   31   68:invokevirtual   #372 <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.onFontRetrieved(Typeface)>
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
	//   42   89:invokestatic    #122 <Method FontsContractCompat$TypefaceResult getFontInternal(Context, FontRequest, int)>
	//   43   92:astore_0        
			if(fontcallback != null)
	//*  44   93:aload_2         
	//*  45   94:ifnull          125
				if(((TypefaceResult) (context)).mResult == 0)
	//*  46   97:aload_0         
	//*  47   98:getfield        #375 <Field int FontsContractCompat$TypefaceResult.mResult>
	//*  48  101:ifne            116
					fontcallback.callbackSuccessAsync(((TypefaceResult) (context)).mTypeface, handler);
	//   49  104:aload_2         
	//   50  105:aload_0         
	//   51  106:getfield        #379 <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
	//   52  109:aload_3         
	//   53  110:invokevirtual   #383 <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackSuccessAsync(Typeface, Handler)>
				else
	//*  54  113:goto            125
					fontcallback.callbackFailAsync(((TypefaceResult) (context)).mResult, handler);
	//   55  116:aload_2         
	//   56  117:aload_0         
	//   57  118:getfield        #375 <Field int FontsContractCompat$TypefaceResult.mResult>
	//   58  121:aload_3         
	//   59  122:invokevirtual   #387 <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
			return ((TypefaceResult) (context)).mTypeface;
	//   60  125:aload_0         
	//   61  126:getfield        #379 <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
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
			//    6   12:invokestatic    #42  <Method FontsContractCompat$TypefaceResult FontsContractCompat.access$000(Context, FontRequest, int)>
			//    7   15:astore_1        
				if(typefaceresult.mTypeface != null)
			//*   8   16:aload_1         
			//*   9   17:getfield        #48  <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
			//*  10   20:ifnull          38
					FontsContractCompat.sTypefaceCache.put(((Object) (id)), ((Object) (typefaceresult.mTypeface)));
			//   11   23:invokestatic    #52  <Method LruCache FontsContractCompat.access$100()>
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
	//   69  140:invokespecial   #390 <Method void FontsContractCompat$1(Context, FontRequest, int, String)>
	//   70  143:astore_1        
		if(flag)
	//*  71  144:iload           4
	//*  72  146:ifeq            167
		{
			try
			{
				context = ((Context) (((TypefaceResult)sBackgroundThread.postAndWait(((Callable) (fontrequest)), i)).mTypeface));
	//   73  149:getstatic       #104 <Field SelfDestructiveThread sBackgroundThread>
	//   74  152:aload_1         
	//   75  153:iload           5
	//   76  155:invokevirtual   #394 <Method Object SelfDestructiveThread.postAndWait(Callable, int)>
	//   77  158:checkcast       #52  <Class FontsContractCompat$TypefaceResult>
	//   78  161:getfield        #379 <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
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
	//*  91  182:invokespecial   #397 <Method void FontsContractCompat$2(android.support.v4.content.res.ResourcesCompat$FontCallback, Handler)>
	//*  92  185:astore_0        
	//*  93  186:getstatic       #108 <Field Object sLock>
	//*  94  189:astore_2        
	//*  95  190:aload_2         
	//*  96  191:monitorenter    
	//*  97  192:getstatic       #113 <Field SimpleArrayMap sPendingReplies>
	//*  98  195:aload           7
	//*  99  197:invokevirtual   #400 <Method boolean SimpleArrayMap.containsKey(Object)>
	//* 100  200:ifeq            227
	//* 101  203:aload_0         
	//* 102  204:ifnull          223
	//* 103  207:getstatic       #113 <Field SimpleArrayMap sPendingReplies>
	//* 104  210:aload           7
	//* 105  212:invokevirtual   #401 <Method Object SimpleArrayMap.get(Object)>
	//* 106  215:checkcast       #144 <Class ArrayList>
	//* 107  218:aload_0         
	//* 108  219:invokevirtual   #318 <Method boolean ArrayList.add(Object)>
	//* 109  222:pop             
	//* 110  223:aload_2         
	//* 111  224:monitorexit     
	//* 112  225:aconst_null     
	//* 113  226:areturn         
	//* 114  227:aload_0         
	//* 115  228:ifnull          255
	//* 116  231:new             #144 <Class ArrayList>
	//* 117  234:dup             
	//* 118  235:invokespecial   #145 <Method void ArrayList()>
	//* 119  238:astore_3        
	//* 120  239:aload_3         
	//* 121  240:aload_0         
	//* 122  241:invokevirtual   #318 <Method boolean ArrayList.add(Object)>
	//* 123  244:pop             
	//* 124  245:getstatic       #113 <Field SimpleArrayMap sPendingReplies>
	//* 125  248:aload           7
	//* 126  250:aload_3         
	//* 127  251:invokevirtual   #405 <Method Object SimpleArrayMap.put(Object, Object)>
	//* 128  254:pop             
	//* 129  255:aload_2         
	//* 130  256:monitorexit     
	//* 131  257:getstatic       #104 <Field SelfDestructiveThread sBackgroundThread>
	//* 132  260:aload_1         
	//* 133  261:new             #10  <Class FontsContractCompat$3>
	//* 134  264:dup             
	//* 135  265:aload           7
	//* 136  267:invokespecial   #408 <Method void FontsContractCompat$3(String)>
	//* 137  270:invokevirtual   #412 <Method void SelfDestructiveThread.postAndReply(Callable, SelfDestructiveThread$ReplyCallback)>
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
			//    0    0:invokestatic    #28  <Method Object FontsContractCompat.access$200()>
			//    1    3:astore_3        
				obj1;
			//    2    4:aload_3         
				JVM INSTR monitorenter ;
			//    3    5:monitorenter    
				ArrayList arraylist = (ArrayList)FontsContractCompat.sPendingReplies.get(((Object) (id)));
			//    4    6:invokestatic    #32  <Method SimpleArrayMap FontsContractCompat.access$300()>
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
			//   15   29:invokestatic    #32  <Method SimpleArrayMap FontsContractCompat.access$300()>
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
	//    1    1:invokevirtual   #415 <Method String FontRequest.getProviderAuthority()>
	//    2    4:astore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		ProviderInfo providerinfo = packagemanager.resolveContentProvider(s, 0);
	//    5    8:aload_0         
	//    6    9:aload           5
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #421 <Method ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//    9   15:astore          4
		if(providerinfo == null)
	//*  10   17:aload           4
	//*  11   19:ifnonnull       57
		{
			packagemanager = ((PackageManager) (new StringBuilder()));
	//   12   22:new             #345 <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #346 <Method void StringBuilder()>
	//   15   29:astore_0        
			((StringBuilder) (packagemanager)).append("No package found for authority: ");
	//   16   30:aload_0         
	//   17   31:ldc2            #423 <String "No package found for authority: ">
	//   18   34:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			((StringBuilder) (packagemanager)).append(s);
	//   20   38:aload_0         
	//   21   39:aload           5
	//   22   41:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new android.content.pm.PackageManager.NameNotFoundException(((StringBuilder) (packagemanager)).toString());
	//   24   45:new             #182 <Class android.content.pm.PackageManager$NameNotFoundException>
	//   25   48:dup             
	//   26   49:aload_0         
	//   27   50:invokevirtual   #361 <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #424 <Method void android.content.pm.PackageManager$NameNotFoundException(String)>
	//   29   56:athrow          
		}
		if(!providerinfo.packageName.equals(((Object) (fontrequest.getProviderPackage()))))
	//*  30   57:aload           4
	//*  31   59:getfield        #427 <Field String ProviderInfo.packageName>
	//*  32   62:aload_1         
	//*  33   63:invokevirtual   #430 <Method String FontRequest.getProviderPackage()>
	//*  34   66:invokevirtual   #432 <Method boolean String.equals(Object)>
	//*  35   69:ifne            124
		{
			packagemanager = ((PackageManager) (new StringBuilder()));
	//   36   72:new             #345 <Class StringBuilder>
	//   37   75:dup             
	//   38   76:invokespecial   #346 <Method void StringBuilder()>
	//   39   79:astore_0        
			((StringBuilder) (packagemanager)).append("Found content provider ");
	//   40   80:aload_0         
	//   41   81:ldc2            #434 <String "Found content provider ">
	//   42   84:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
			((StringBuilder) (packagemanager)).append(s);
	//   44   88:aload_0         
	//   45   89:aload           5
	//   46   91:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   47   94:pop             
			((StringBuilder) (packagemanager)).append(", but package was not ");
	//   48   95:aload_0         
	//   49   96:ldc2            #436 <String ", but package was not ">
	//   50   99:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   51  102:pop             
			((StringBuilder) (packagemanager)).append(fontrequest.getProviderPackage());
	//   52  103:aload_0         
	//   53  104:aload_1         
	//   54  105:invokevirtual   #430 <Method String FontRequest.getProviderPackage()>
	//   55  108:invokevirtual   #353 <Method StringBuilder StringBuilder.append(String)>
	//   56  111:pop             
			throw new android.content.pm.PackageManager.NameNotFoundException(((StringBuilder) (packagemanager)).toString());
	//   57  112:new             #182 <Class android.content.pm.PackageManager$NameNotFoundException>
	//   58  115:dup             
	//   59  116:aload_0         
	//   60  117:invokevirtual   #361 <Method String StringBuilder.toString()>
	//   61  120:invokespecial   #424 <Method void android.content.pm.PackageManager$NameNotFoundException(String)>
	//   62  123:athrow          
		}
		packagemanager = ((PackageManager) (convertToByteArrayList(packagemanager.getPackageInfo(providerinfo.packageName, 64).signatures)));
	//   63  124:aload_0         
	//   64  125:aload           4
	//   65  127:getfield        #427 <Field String ProviderInfo.packageName>
	//   66  130:bipush          64
	//   67  132:invokevirtual   #440 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   68  135:getfield        #446 <Field Signature[] PackageInfo.signatures>
	//   69  138:invokestatic    #448 <Method List convertToByteArrayList(Signature[])>
	//   70  141:astore_0        
		Collections.sort(((List) (packagemanager)), sByteArrayComparator);
	//   71  142:aload_0         
	//   72  143:getstatic       #116 <Field Comparator sByteArrayComparator>
	//   73  146:invokestatic    #454 <Method void Collections.sort(List, Comparator)>
		for(fontrequest = ((FontRequest) (getCertificates(fontrequest, resources))); i < ((List) (fontrequest)).size(); i++)
	//*  74  149:aload_1         
	//*  75  150:aload_2         
	//*  76  151:invokestatic    #456 <Method List getCertificates(FontRequest, Resources)>
	//*  77  154:astore_1        
	//*  78  155:iload_3         
	//*  79  156:aload_1         
	//*  80  157:invokeinterface #165 <Method int List.size()>
	//*  81  162:icmpge          208
		{
			resources = ((Resources) (new ArrayList((Collection)((List) (fontrequest)).get(i))));
	//   82  165:new             #144 <Class ArrayList>
	//   83  168:dup             
	//   84  169:aload_1         
	//   85  170:iload_3         
	//   86  171:invokeinterface #169 <Method Object List.get(int)>
	//   87  176:checkcast       #458 <Class Collection>
	//   88  179:invokespecial   #461 <Method void ArrayList(Collection)>
	//   89  182:astore_2        
			Collections.sort(((List) (resources)), sByteArrayComparator);
	//   90  183:aload_2         
	//   91  184:getstatic       #116 <Field Comparator sByteArrayComparator>
	//   92  187:invokestatic    #454 <Method void Collections.sort(List, Comparator)>
			if(equalsByteArrayList(((List) (packagemanager)), ((List) (resources))))
	//*  93  190:aload_0         
	//*  94  191:aload_2         
	//*  95  192:invokestatic    #463 <Method boolean equalsByteArrayList(List, List)>
	//*  96  195:ifeq            201
				return providerinfo;
	//   97  198:aload           4
	//   98  200:areturn         
		}

	//   99  201:iload_3         
	//  100  202:iconst_1        
	//  101  203:iadd            
	//  102  204:istore_3        
	//* 103  205:goto            155
		return null;
	//  104  208:aconst_null     
	//  105  209:areturn         
	}

	public static Map prepareFontData(Context context, FontInfo afontinfo[], CancellationSignal cancellationsignal)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #469 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #470 <Method void HashMap()>
	//    3    7:astore          5
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		for(int j = afontinfo.length; i < j; i++)
	//*   6   11:aload_1         
	//*   7   12:arraylength     
	//*   8   13:istore          4
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
	//*  17   28:invokevirtual   #473 <Method int FontsContractCompat$FontInfo.getResultCode()>
	//*  18   31:ifeq            37
				continue;
	//   19   34:goto            72
			obj = ((Object) (((FontInfo) (obj)).getUri()));
	//   20   37:aload           6
	//   21   39:invokevirtual   #476 <Method Uri FontsContractCompat$FontInfo.getUri()>
	//   22   42:astore          6
			if(!hashmap.containsKey(obj))
	//*  23   44:aload           5
	//*  24   46:aload           6
	//*  25   48:invokevirtual   #477 <Method boolean HashMap.containsKey(Object)>
	//*  26   51:ifeq            57
	//*  27   54:goto            72
				hashmap.put(obj, ((Object) (TypefaceCompatUtil.mmap(context, cancellationsignal, ((Uri) (obj))))));
	//   28   57:aload           5
	//   29   59:aload           6
	//   30   61:aload_0         
	//   31   62:aload_2         
	//   32   63:aload           6
	//   33   65:invokestatic    #483 <Method java.nio.ByteBuffer TypefaceCompatUtil.mmap(Context, CancellationSignal, Uri)>
	//   34   68:invokevirtual   #484 <Method Object HashMap.put(Object, Object)>
	//   35   71:pop             
		}

	//   36   72:iload_3         
	//   37   73:iconst_1        
	//   38   74:iadd            
	//   39   75:istore_3        
	//*  40   76:goto            15
		return Collections.unmodifiableMap(((Map) (hashmap)));
	//   41   79:aload           5
	//   42   81:invokestatic    #488 <Method Map Collections.unmodifiableMap(Map)>
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
	//    5    7:new             #493 <Class Handler>
	//    6   10:dup             
	//    7   11:invokespecial   #494 <Method void Handler()>
	//    8   14:aload_2         
	//    9   15:invokespecial   #497 <Method void FontsContractCompat$4(Context, FontRequest, Handler, FontsContractCompat$FontRequestCallback)>
	//   10   18:invokevirtual   #501 <Method boolean Handler.post(Runnable)>
	//   11   21:pop             
	//   12   22:return          
	}

	public static void resetCache()
	{
		sTypefaceCache.evictAll();
	//    0    0:getstatic       #95  <Field LruCache sTypefaceCache>
	//    1    3:invokevirtual   #505 <Method void LruCache.evictAll()>
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
	private static final Object sLock = new Object();
	private static final SimpleArrayMap sPendingReplies = new SimpleArrayMap();
	private static final LruCache sTypefaceCache = new LruCache(16);

	static 
	{
	//    0    0:new             #89  <Class LruCache>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #93  <Method void LruCache(int)>
	//    4    9:putstatic       #95  <Field LruCache sTypefaceCache>
	//    5   12:new             #97  <Class SelfDestructiveThread>
	//    6   15:dup             
	//    7   16:ldc1            #99  <String "fonts">
	//    8   18:bipush          10
	//    9   20:sipush          10000
	//   10   23:invokespecial   #102 <Method void SelfDestructiveThread(String, int, int)>
	//   11   26:putstatic       #104 <Field SelfDestructiveThread sBackgroundThread>
	//   12   29:new             #4   <Class Object>
	//   13   32:dup             
	//   14   33:invokespecial   #106 <Method void Object()>
	//   15   36:putstatic       #108 <Field Object sLock>
	//   16   39:new             #110 <Class SimpleArrayMap>
	//   17   42:dup             
	//   18   43:invokespecial   #111 <Method void SimpleArrayMap()>
	//   19   46:putstatic       #113 <Field SimpleArrayMap sPendingReplies>
	//   20   49:new             #32  <Class FontsContractCompat$5>
	//   21   52:dup             
	//   22   53:invokespecial   #114 <Method void FontsContractCompat$5()>
	//   23   56:putstatic       #116 <Field Comparator sByteArrayComparator>
	//*  24   59:return          
	}


/*
	static TypefaceResult access$000(Context context, FontRequest fontrequest, int i)
	{
		return getFontInternal(context, fontrequest, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #122 <Method FontsContractCompat$TypefaceResult getFontInternal(Context, FontRequest, int)>
	//    4    6:areturn         
	}

*/


/*
	static LruCache access$100()
	{
		return sTypefaceCache;
	//    0    0:getstatic       #95  <Field LruCache sTypefaceCache>
	//    1    3:areturn         
	}

*/


/*
	static Object access$200()
	{
		return sLock;
	//    0    0:getstatic       #108 <Field Object sLock>
	//    1    3:areturn         
	}

*/


/*
	static SimpleArrayMap access$300()
	{
		return sPendingReplies;
	//    0    0:getstatic       #113 <Field SimpleArrayMap sPendingReplies>
	//    1    3:areturn         
	}

*/
}
