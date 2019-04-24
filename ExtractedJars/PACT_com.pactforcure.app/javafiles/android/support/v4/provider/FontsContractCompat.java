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
import android.widget.TextView;
import java.lang.annotation.Annotation;
import java.lang.ref.WeakReference;
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
		public static final int FAIL_REASON_WRONG_CERTIFICATES = -2;

		public FontRequestCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #27  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface FontRequestCallback.FontRequestFailReason
		extends Annotation
	{
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
	//    4    4:invokestatic    #135 <Method Typeface TypefaceCompat.createFromFontInfo(Context, CancellationSignal, FontsContractCompat$FontInfo[], int)>
	//    5    7:areturn         
	}

	private static List convertToByteArrayList(Signature asignature[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #140 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void ArrayList()>
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
	//   14   20:invokevirtual   #147 <Method byte[] Signature.toByteArray()>
	//   15   23:invokeinterface #153 <Method boolean List.add(Object)>
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
	//*   1    1:invokeinterface #161 <Method int List.size()>
	//*   2    6:aload_1         
	//*   3    7:invokeinterface #161 <Method int List.size()>
	//*   4   12:icmpeq          17
			return false;
	//    5   15:iconst_0        
	//    6   16:ireturn         
		for(int i = 0; i < list.size(); i++)
	//*   7   17:iconst_0        
	//*   8   18:istore_2        
	//*   9   19:iload_2         
	//*  10   20:aload_0         
	//*  11   21:invokeinterface #161 <Method int List.size()>
	//*  12   26:icmpge          64
			if(!Arrays.equals((byte[])list.get(i), (byte[])list1.get(i)))
	//*  13   29:aload_0         
	//*  14   30:iload_2         
	//*  15   31:invokeinterface #165 <Method Object List.get(int)>
	//*  16   36:checkcast       #167 <Class byte[]>
	//*  17   39:aload_1         
	//*  18   40:iload_2         
	//*  19   41:invokeinterface #165 <Method Object List.get(int)>
	//*  20   46:checkcast       #167 <Class byte[]>
	//*  21   49:invokestatic    #173 <Method boolean Arrays.equals(byte[], byte[])>
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
	//    1    1:invokevirtual   #184 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #188 <Method Resources Context.getResources()>
	//    5    9:invokestatic    #192 <Method ProviderInfo getProvider(PackageManager, FontRequest, Resources)>
	//    6   12:astore_3        
		if(providerinfo == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       27
			return new FontFamilyResult(1, ((FontInfo []) (null)));
	//    9   17:new             #37  <Class FontsContractCompat$FontFamilyResult>
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:aconst_null     
	//   13   23:invokespecial   #195 <Method void FontsContractCompat$FontFamilyResult(int, FontsContractCompat$FontInfo[])>
	//   14   26:areturn         
		else
			return new FontFamilyResult(0, getFontFromProvider(context, fontrequest, providerinfo.authority, cancellationsignal));
	//   15   27:new             #37  <Class FontsContractCompat$FontFamilyResult>
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:aload_3         
	//   21   35:getfield        #200 <Field String ProviderInfo.authority>
	//   22   38:aload_1         
	//   23   39:invokestatic    #204 <Method FontsContractCompat$FontInfo[] getFontFromProvider(Context, FontRequest, String, CancellationSignal)>
	//   24   42:invokespecial   #195 <Method void FontsContractCompat$FontFamilyResult(int, FontsContractCompat$FontInfo[])>
	//   25   45:areturn         
	}

	private static List getCertificates(FontRequest fontrequest, Resources resources)
	{
		if(fontrequest.getCertificates() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #213 <Method List FontRequest.getCertificates()>
	//*   2    4:ifnull          12
			return fontrequest.getCertificates();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #213 <Method List FontRequest.getCertificates()>
	//    5   11:areturn         
		else
			return FontResourcesParserCompat.readCerts(resources, fontrequest.getCertificatesArrayResId());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #216 <Method int FontRequest.getCertificatesArrayResId()>
	//    9   17:invokestatic    #222 <Method List FontResourcesParserCompat.readCerts(Resources, int)>
	//   10   20:areturn         
	}

	static FontInfo[] getFontFromProvider(Context context, FontRequest fontrequest, String s, CancellationSignal cancellationsignal)
	{
		ArrayList arraylist;
		Object obj;
		Uri uri;
		Uri uri1;
		arraylist = new ArrayList();
	//    0    0:new             #140 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #141 <Method void ArrayList()>
	//    3    7:astore          14
		uri = (new android.net.Uri.Builder()).scheme("content").authority(s).build();
	//    4    9:new             #226 <Class android.net.Uri$Builder>
	//    5   12:dup             
	//    6   13:invokespecial   #227 <Method void android.net.Uri$Builder()>
	//    7   16:ldc1            #229 <String "content">
	//    8   18:invokevirtual   #233 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    9   21:aload_2         
	//   10   22:invokevirtual   #235 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   11   25:invokevirtual   #239 <Method Uri android.net.Uri$Builder.build()>
	//   12   28:astore          16
		uri1 = (new android.net.Uri.Builder()).scheme("content").authority(s).appendPath("file").build();
	//   13   30:new             #226 <Class android.net.Uri$Builder>
	//   14   33:dup             
	//   15   34:invokespecial   #227 <Method void android.net.Uri$Builder()>
	//   16   37:ldc1            #229 <String "content">
	//   17   39:invokevirtual   #233 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   18   42:aload_2         
	//   19   43:invokevirtual   #235 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   20   46:ldc1            #241 <String "file">
	//   21   48:invokevirtual   #244 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   22   51:invokevirtual   #239 <Method Uri android.net.Uri$Builder.build()>
	//   23   54:astore          17
		obj = null;
	//   24   56:aconst_null     
	//   25   57:astore          15
		s = ((String) (obj));
	//   26   59:aload           15
	//   27   61:astore_2        
		if(android.os.Build.VERSION.SDK_INT <= 16) goto _L2; else goto _L1
	//   28   62:getstatic       #249 <Field int android.os.Build$VERSION.SDK_INT>
	//   29   65:bipush          16
	//   30   67:icmple          395
_L1:
		s = ((String) (obj));
	//   31   70:aload           15
	//   32   72:astore_2        
		context = ((Context) (context.getContentResolver()));
	//   33   73:aload_0         
	//   34   74:invokevirtual   #253 <Method ContentResolver Context.getContentResolver()>
	//   35   77:astore_0        
		s = ((String) (obj));
	//   36   78:aload           15
	//   37   80:astore_2        
		fontrequest = ((FontRequest) (fontrequest.getQuery()));
	//   38   81:aload_1         
	//   39   82:invokevirtual   #257 <Method String FontRequest.getQuery()>
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
	//   49   99:ldc2            #261 <String "_id">
	//   50  102:aastore         
	//   51  103:dup             
	//   52  104:iconst_1        
	//   53  105:ldc2            #263 <String "file_id">
	//   54  108:aastore         
	//   55  109:dup             
	//   56  110:iconst_2        
	//   57  111:ldc2            #265 <String "font_ttc_index">
	//   58  114:aastore         
	//   59  115:dup             
	//   60  116:iconst_3        
	//   61  117:ldc2            #267 <String "font_variation_settings">
	//   62  120:aastore         
	//   63  121:dup             
	//   64  122:iconst_4        
	//   65  123:ldc2            #269 <String "font_weight">
	//   66  126:aastore         
	//   67  127:dup             
	//   68  128:iconst_5        
	//   69  129:ldc2            #271 <String "font_italic">
	//   70  132:aastore         
	//   71  133:dup             
	//   72  134:bipush          6
	//   73  136:ldc2            #273 <String "result_code">
	//   74  139:aastore         
	//   75  140:ldc2            #275 <String "query = ?">
	//   76  143:iconst_1        
	//   77  144:anewarray       String[]
	//   78  147:dup             
	//   79  148:iconst_0        
	//   80  149:aload_1         
	//   81  150:aastore         
	//   82  151:aconst_null     
	//   83  152:aload_3         
	//   84  153:invokevirtual   #281 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String, CancellationSignal)>
	//   85  156:astore_0        
_L20:
		fontrequest = ((FontRequest) (arraylist));
	//   86  157:aload           14
	//   87  159:astore_1        
		if(context == null) goto _L4; else goto _L3
	//   88  160:aload_0         
	//   89  161:ifnull          529
_L3:
		fontrequest = ((FontRequest) (arraylist));
	//   90  164:aload           14
	//   91  166:astore_1        
		s = ((String) (context));
	//   92  167:aload_0         
	//   93  168:astore_2        
		if(((Cursor) (context)).getCount() <= 0) goto _L4; else goto _L5
	//   94  169:aload_0         
	//   95  170:invokeinterface #286 <Method int Cursor.getCount()>
	//   96  175:ifle            529
_L5:
		s = ((String) (context));
	//   97  178:aload_0         
	//   98  179:astore_2        
		int l = ((Cursor) (context)).getColumnIndex("result_code");
	//   99  180:aload_0         
	//  100  181:ldc2            #273 <String "result_code">
	//  101  184:invokeinterface #290 <Method int Cursor.getColumnIndex(String)>
	//  102  189:istore          7
		s = ((String) (context));
	//  103  191:aload_0         
	//  104  192:astore_2        
		cancellationsignal = ((CancellationSignal) (new ArrayList()));
	//  105  193:new             #140 <Class ArrayList>
	//  106  196:dup             
	//  107  197:invokespecial   #141 <Method void ArrayList()>
	//  108  200:astore_3        
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		i1 = ((Cursor) (context)).getColumnIndex("_id");
	//  109  201:aload_0         
	//  110  202:ldc2            #261 <String "_id">
	//  111  205:invokeinterface #290 <Method int Cursor.getColumnIndex(String)>
	//  112  210:istore          8
		j1 = ((Cursor) (context)).getColumnIndex("file_id");
	//  113  212:aload_0         
	//  114  213:ldc2            #263 <String "file_id">
	//  115  216:invokeinterface #290 <Method int Cursor.getColumnIndex(String)>
	//  116  221:istore          9
		k1 = ((Cursor) (context)).getColumnIndex("font_ttc_index");
	//  117  223:aload_0         
	//  118  224:ldc2            #265 <String "font_ttc_index">
	//  119  227:invokeinterface #290 <Method int Cursor.getColumnIndex(String)>
	//  120  232:istore          10
		l1 = ((Cursor) (context)).getColumnIndex("font_weight");
	//  121  234:aload_0         
	//  122  235:ldc2            #269 <String "font_weight">
	//  123  238:invokeinterface #290 <Method int Cursor.getColumnIndex(String)>
	//  124  243:istore          11
		i2 = ((Cursor) (context)).getColumnIndex("font_italic");
	//  125  245:aload_0         
	//  126  246:ldc2            #271 <String "font_italic">
	//  127  249:invokeinterface #290 <Method int Cursor.getColumnIndex(String)>
	//  128  254:istore          12
_L19:
		if(!((Cursor) (context)).moveToNext()) goto _L7; else goto _L6
	//  129  256:aload_0         
	//  130  257:invokeinterface #294 <Method boolean Cursor.moveToNext()>
	//  131  262:ifeq            527
_L6:
		if(l == -1) goto _L9; else goto _L8
	//  132  265:iload           7
	//  133  267:iconst_m1       
	//  134  268:icmpeq          484
_L8:
		int i = ((Cursor) (context)).getInt(l);
	//  135  271:aload_0         
	//  136  272:iload           7
	//  137  274:invokeinterface #298 <Method int Cursor.getInt(int)>
	//  138  279:istore          4
_L21:
		if(k1 == -1) goto _L11; else goto _L10
	//  139  281:iload           10
	//  140  283:iconst_m1       
	//  141  284:icmpeq          490
_L10:
		int j = ((Cursor) (context)).getInt(k1);
	//  142  287:aload_0         
	//  143  288:iload           10
	//  144  290:invokeinterface #298 <Method int Cursor.getInt(int)>
	//  145  295:istore          5
_L22:
		if(j1 != -1) goto _L13; else goto _L12
	//  146  297:iload           9
	//  147  299:iconst_m1       
	//  148  300:icmpne          496
_L12:
		fontrequest = ((FontRequest) (ContentUris.withAppendedId(uri, ((Cursor) (context)).getLong(i1))));
	//  149  303:aload           16
	//  150  305:aload_0         
	//  151  306:iload           8
	//  152  308:invokeinterface #302 <Method long Cursor.getLong(int)>
	//  153  313:invokestatic    #308 <Method Uri ContentUris.withAppendedId(Uri, long)>
	//  154  316:astore_1        
_L23:
		if(l1 == -1) goto _L15; else goto _L14
	//  155  317:iload           11
	//  156  319:iconst_m1       
	//  157  320:icmpeq          513
_L14:
		int k = ((Cursor) (context)).getInt(l1);
	//  158  323:aload_0         
	//  159  324:iload           11
	//  160  326:invokeinterface #298 <Method int Cursor.getInt(int)>
	//  161  331:istore          6
_L24:
		if(i2 == -1) goto _L17; else goto _L16
	//  162  333:iload           12
	//  163  335:iconst_m1       
	//  164  336:icmpeq          521
_L16:
		if(((Cursor) (context)).getInt(i2) != 1) goto _L17; else goto _L18
	//  165  339:aload_0         
	//  166  340:iload           12
	//  167  342:invokeinterface #298 <Method int Cursor.getInt(int)>
	//  168  347:iconst_1        
	//  169  348:icmpne          521
_L18:
		boolean flag = true;
	//  170  351:iconst_1        
	//  171  352:istore          13
_L25:
		((ArrayList) (cancellationsignal)).add(((Object) (new FontInfo(((Uri) (fontrequest)), j, k, flag, i))));
	//  172  354:aload_3         
	//  173  355:new             #43  <Class FontsContractCompat$FontInfo>
	//  174  358:dup             
	//  175  359:aload_1         
	//  176  360:iload           5
	//  177  362:iload           6
	//  178  364:iload           13
	//  179  366:iload           4
	//  180  368:invokespecial   #311 <Method void FontsContractCompat$FontInfo(Uri, int, int, boolean, int)>
	//  181  371:invokevirtual   #312 <Method boolean ArrayList.add(Object)>
	//  182  374:pop             
		  goto _L19
	//* 183  375:goto            256
		fontrequest;
	//  184  378:astore_1        
		s = ((String) (context));
	//  185  379:aload_0         
	//  186  380:astore_2        
		context = ((Context) (fontrequest));
	//  187  381:aload_1         
	//  188  382:astore_0        
_L26:
		if(s != null)
	//* 189  383:aload_2         
	//* 190  384:ifnull          393
			((Cursor) (s)).close();
	//  191  387:aload_2         
	//  192  388:invokeinterface #315 <Method void Cursor.close()>
		throw context;
	//  193  393:aload_0         
	//  194  394:athrow          
_L2:
		s = ((String) (obj));
	//  195  395:aload           15
	//  196  397:astore_2        
		context = ((Context) (context.getContentResolver()));
	//  197  398:aload_0         
	//  198  399:invokevirtual   #253 <Method ContentResolver Context.getContentResolver()>
	//  199  402:astore_0        
		s = ((String) (obj));
	//  200  403:aload           15
	//  201  405:astore_2        
		fontrequest = ((FontRequest) (fontrequest.getQuery()));
	//  202  406:aload_1         
	//  203  407:invokevirtual   #257 <Method String FontRequest.getQuery()>
	//  204  410:astore_1        
		s = ((String) (obj));
	//  205  411:aload           15
	//  206  413:astore_2        
		context = ((Context) (((ContentResolver) (context)).query(uri, new String[] {
			"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"
		}, "query = ?", new String[] {
			fontrequest
		}, ((String) (null)))));
	//  207  414:aload_0         
	//  208  415:aload           16
	//  209  417:bipush          7
	//  210  419:anewarray       String[]
	//  211  422:dup             
	//  212  423:iconst_0        
	//  213  424:ldc2            #261 <String "_id">
	//  214  427:aastore         
	//  215  428:dup             
	//  216  429:iconst_1        
	//  217  430:ldc2            #263 <String "file_id">
	//  218  433:aastore         
	//  219  434:dup             
	//  220  435:iconst_2        
	//  221  436:ldc2            #265 <String "font_ttc_index">
	//  222  439:aastore         
	//  223  440:dup             
	//  224  441:iconst_3        
	//  225  442:ldc2            #267 <String "font_variation_settings">
	//  226  445:aastore         
	//  227  446:dup             
	//  228  447:iconst_4        
	//  229  448:ldc2            #269 <String "font_weight">
	//  230  451:aastore         
	//  231  452:dup             
	//  232  453:iconst_5        
	//  233  454:ldc2            #271 <String "font_italic">
	//  234  457:aastore         
	//  235  458:dup             
	//  236  459:bipush          6
	//  237  461:ldc2            #273 <String "result_code">
	//  238  464:aastore         
	//  239  465:ldc2            #275 <String "query = ?">
	//  240  468:iconst_1        
	//  241  469:anewarray       String[]
	//  242  472:dup             
	//  243  473:iconst_0        
	//  244  474:aload_1         
	//  245  475:aastore         
	//  246  476:aconst_null     
	//  247  477:invokevirtual   #318 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//  248  480:astore_0        
		  goto _L20
	//* 249  481:goto            157
_L9:
		i = 0;
	//  250  484:iconst_0        
	//  251  485:istore          4
		  goto _L21
	//* 252  487:goto            281
_L11:
		j = 0;
	//  253  490:iconst_0        
	//  254  491:istore          5
		  goto _L22
	//* 255  493:goto            297
_L13:
		fontrequest = ((FontRequest) (ContentUris.withAppendedId(uri1, ((Cursor) (context)).getLong(j1))));
	//  256  496:aload           17
	//  257  498:aload_0         
	//  258  499:iload           9
	//  259  501:invokeinterface #302 <Method long Cursor.getLong(int)>
	//  260  506:invokestatic    #308 <Method Uri ContentUris.withAppendedId(Uri, long)>
	//  261  509:astore_1        
		  goto _L23
	//* 262  510:goto            317
_L15:
		k = 400;
	//  263  513:sipush          400
	//  264  516:istore          6
		  goto _L24
	//* 265  518:goto            333
_L17:
		flag = false;
	//  266  521:iconst_0        
	//  267  522:istore          13
		  goto _L25
	//* 268  524:goto            354
_L7:
		fontrequest = ((FontRequest) (cancellationsignal));
	//  269  527:aload_3         
	//  270  528:astore_1        
_L4:
		if(context != null)
	//* 271  529:aload_0         
	//* 272  530:ifnull          539
			((Cursor) (context)).close();
	//  273  533:aload_0         
	//  274  534:invokeinterface #315 <Method void Cursor.close()>
		return (FontInfo[])((ArrayList) (fontrequest)).toArray(((Object []) (new FontInfo[0])));
	//  275  539:aload_1         
	//  276  540:iconst_0        
	//  277  541:anewarray       FontInfo[]
	//  278  544:invokevirtual   #322 <Method Object[] ArrayList.toArray(Object[])>
	//  279  547:checkcast       #324 <Class FontsContractCompat$FontInfo[]>
	//  280  550:areturn         
		context;
	//  281  551:astore_0        
		  goto _L26
	//* 282  552:goto            383
	}

	private static Typeface getFontInternal(Context context, FontRequest fontrequest, int i)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		FontFamilyResult fontfamilyresult;
		try
		{
			fontfamilyresult = fetchFonts(context, ((CancellationSignal) (null)), fontrequest);
	//    2    2:aload_0         
	//    3    3:aconst_null     
	//    4    4:aload_1         
	//    5    5:invokestatic    #326 <Method FontsContractCompat$FontFamilyResult fetchFonts(Context, CancellationSignal, FontRequest)>
	//    6    8:astore          4
		}
	//*   7   10:aload_3         
	//*   8   11:astore_1        
	//*   9   12:aload           4
	//*  10   14:invokevirtual   #329 <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
	//*  11   17:ifne            32
	//*  12   20:aload_0         
	//*  13   21:aconst_null     
	//*  14   22:aload           4
	//*  15   24:invokevirtual   #333 <Method FontsContractCompat$FontInfo[] FontsContractCompat$FontFamilyResult.getFonts()>
	//*  16   27:iload_2         
	//*  17   28:invokestatic    #135 <Method Typeface TypefaceCompat.createFromFontInfo(Context, CancellationSignal, FontsContractCompat$FontInfo[], int)>
	//*  18   31:astore_1        
	//*  19   32:aload_1         
	//*  20   33:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  21   34:astore_0        
		{
			return null;
	//   22   35:aconst_null     
	//   23   36:areturn         
		}
		fontrequest = ((FontRequest) (obj));
		if(fontfamilyresult.getStatusCode() == 0)
			fontrequest = ((FontRequest) (TypefaceCompat.createFromFontInfo(context, ((CancellationSignal) (null)), fontfamilyresult.getFonts(), i)));
		return ((Typeface) (fontrequest));
	}

	public static Typeface getFontSync(Context context, FontRequest fontrequest, TextView textview, int i, int j, int k)
	{
		String s;
		s = (new StringBuilder()).append(fontrequest.getIdentifier()).append("-").append(k).toString();
	//    0    0:new             #339 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #340 <Method void StringBuilder()>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #343 <Method String FontRequest.getIdentifier()>
	//    5   11:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:ldc2            #349 <String "-">
	//    7   17:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//    8   20:iload           5
	//    9   22:invokevirtual   #352 <Method StringBuilder StringBuilder.append(int)>
	//   10   25:invokevirtual   #355 <Method String StringBuilder.toString()>
	//   11   28:astore          6
		Typeface typeface = (Typeface)sTypefaceCache.get(((Object) (s)));
	//   12   30:getstatic       #92  <Field LruCache sTypefaceCache>
	//   13   33:aload           6
	//   14   35:invokevirtual   #358 <Method Object LruCache.get(Object)>
	//   15   38:checkcast       #360 <Class Typeface>
	//   16   41:astore          7
		if(typeface != null)
	//*  17   43:aload           7
	//*  18   45:ifnull          51
			return typeface;
	//   19   48:aload           7
	//   20   50:areturn         
		if(i == 0)
	//*  21   51:iload_3         
	//*  22   52:ifne            75
			i = 1;
	//   23   55:iconst_1        
	//   24   56:istore_3        
		else
	//*  25   57:iload_3         
	//*  26   58:ifeq            80
	//*  27   61:iload           4
	//*  28   63:iconst_m1       
	//*  29   64:icmpne          80
	//*  30   67:aload_0         
	//*  31   68:aload_1         
	//*  32   69:iload           5
	//*  33   71:invokestatic    #119 <Method Typeface getFontInternal(Context, FontRequest, int)>
	//*  34   74:areturn         
			i = 0;
	//   35   75:iconst_0        
	//   36   76:istore_3        
		if(i != 0 && j == -1)
			return getFontInternal(context, fontrequest, k);
	//*  37   77:goto            57
		context = ((Context) (new Callable(context, fontrequest, k, s) {

			public Typeface call()
				throws Exception
			{
				Typeface typeface1 = FontsContractCompat.getFontInternal(context, request, style);
			//    0    0:aload_0         
			//    1    1:getfield        #24  <Field Context val$context>
			//    2    4:aload_0         
			//    3    5:getfield        #26  <Field FontRequest val$request>
			//    4    8:aload_0         
			//    5    9:getfield        #28  <Field int val$style>
			//    6   12:invokestatic    #42  <Method Typeface FontsContractCompat.access$000(Context, FontRequest, int)>
			//    7   15:astore_1        
				if(typeface1 != null)
			//*   8   16:aload_1         
			//*   9   17:ifnull          32
					FontsContractCompat.sTypefaceCache.put(((Object) (id)), ((Object) (typeface1)));
			//   10   20:invokestatic    #46  <Method LruCache FontsContractCompat.access$100()>
			//   11   23:aload_0         
			//   12   24:getfield        #30  <Field String val$id>
			//   13   27:aload_1         
			//   14   28:invokevirtual   #52  <Method Object LruCache.put(Object, Object)>
			//   15   31:pop             
				return typeface1;
			//   16   32:aload_1         
			//   17   33:areturn         
			}

			public volatile Object call()
				throws Exception
			{
				return ((Object) (call()));
			//    0    0:aload_0         
			//    1    1:invokevirtual   #56  <Method Typeface call()>
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
	//   38   80:new             #6   <Class FontsContractCompat$1>
	//   39   83:dup             
	//   40   84:aload_0         
	//   41   85:aload_1         
	//   42   86:iload           5
	//   43   88:aload           6
	//   44   90:invokespecial   #363 <Method void FontsContractCompat$1(Context, FontRequest, int, String)>
	//   45   93:astore_0        
		if(i != 0)
	//*  46   94:iload_3         
	//*  47   95:ifeq            116
		{
			try
			{
				context = ((Context) ((Typeface)sBackgroundThread.postAndWait(((Callable) (context)), j)));
	//   48   98:getstatic       #101 <Field SelfDestructiveThread sBackgroundThread>
	//   49  101:aload_0         
	//   50  102:iload           4
	//   51  104:invokevirtual   #367 <Method Object SelfDestructiveThread.postAndWait(Callable, int)>
	//   52  107:checkcast       #360 <Class Typeface>
	//   53  110:astore_0        
			}
	//*  54  111:aload_0         
	//*  55  112:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  56  113:astore_0        
			{
				return null;
	//   57  114:aconst_null     
	//   58  115:areturn         
			}
			return ((Typeface) (context));
		}
		textview = ((TextView) (new SelfDestructiveThread.ReplyCallback(new WeakReference(((Object) (textview))), textview, k) {

			public void onReply(Typeface typeface1)
			{
				if((TextView)textViewWeak.get() != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field WeakReference val$textViewWeak>
			//*   2    4:invokevirtual   #38  <Method Object WeakReference.get()>
			//*   3    7:checkcast       #40  <Class TextView>
			//*   4   10:ifnull          25
					targetView.setTypeface(typeface1, style);
			//    5   13:aload_0         
			//    6   14:getfield        #24  <Field TextView val$targetView>
			//    7   17:aload_1         
			//    8   18:aload_0         
			//    9   19:getfield        #26  <Field int val$style>
			//   10   22:invokevirtual   #44  <Method void TextView.setTypeface(Typeface, int)>
			//   11   25:return          
			}

			public volatile void onReply(Object obj)
			{
				onReply((Typeface)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #47  <Class Typeface>
			//    3    5:invokevirtual   #49  <Method void onReply(Typeface)>
			//    4    8:return          
			}

			final int val$style;
			final TextView val$targetView;
			final WeakReference val$textViewWeak;

			
			{
				textViewWeak = weakreference;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WeakReference val$textViewWeak>
				targetView = textview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field TextView val$targetView>
				style = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field int val$style>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #29  <Method void Object()>
			//   11   19:return          
			}
		}
));
	//   59  116:new             #8   <Class FontsContractCompat$2>
	//   60  119:dup             
	//   61  120:new             #369 <Class WeakReference>
	//   62  123:dup             
	//   63  124:aload_2         
	//   64  125:invokespecial   #372 <Method void WeakReference(Object)>
	//   65  128:aload_2         
	//   66  129:iload           5
	//   67  131:invokespecial   #375 <Method void FontsContractCompat$2(WeakReference, TextView, int)>
	//   68  134:astore_2        
		synchronized(sLock)
	//*  69  135:getstatic       #105 <Field Object sLock>
	//*  70  138:astore_1        
	//*  71  139:aload_1         
	//*  72  140:monitorenter    
		{
			if(!sPendingReplies.containsKey(((Object) (s))))
				break MISSING_BLOCK_LABEL_177;
	//   73  141:getstatic       #110 <Field SimpleArrayMap sPendingReplies>
	//   74  144:aload           6
	//   75  146:invokevirtual   #378 <Method boolean SimpleArrayMap.containsKey(Object)>
	//   76  149:ifeq            177
			((ArrayList)sPendingReplies.get(((Object) (s)))).add(((Object) (textview)));
	//   77  152:getstatic       #110 <Field SimpleArrayMap sPendingReplies>
	//   78  155:aload           6
	//   79  157:invokevirtual   #379 <Method Object SimpleArrayMap.get(Object)>
	//   80  160:checkcast       #140 <Class ArrayList>
	//   81  163:aload_2         
	//   82  164:invokevirtual   #312 <Method boolean ArrayList.add(Object)>
	//   83  167:pop             
		}
	//   84  168:aload_1         
	//   85  169:monitorexit     
		return null;
	//   86  170:aconst_null     
	//   87  171:areturn         
		context;
	//   88  172:astore_0        
		fontrequest;
	//   89  173:aload_1         
		JVM INSTR monitorexit ;
	//   90  174:monitorexit     
		throw context;
	//   91  175:aload_0         
	//   92  176:athrow          
		ArrayList arraylist = new ArrayList();
	//   93  177:new             #140 <Class ArrayList>
	//   94  180:dup             
	//   95  181:invokespecial   #141 <Method void ArrayList()>
	//   96  184:astore          7
		arraylist.add(((Object) (textview)));
	//   97  186:aload           7
	//   98  188:aload_2         
	//   99  189:invokevirtual   #312 <Method boolean ArrayList.add(Object)>
	//  100  192:pop             
		sPendingReplies.put(((Object) (s)), ((Object) (arraylist)));
	//  101  193:getstatic       #110 <Field SimpleArrayMap sPendingReplies>
	//  102  196:aload           6
	//  103  198:aload           7
	//  104  200:invokevirtual   #383 <Method Object SimpleArrayMap.put(Object, Object)>
	//  105  203:pop             
		fontrequest;
	//  106  204:aload_1         
		JVM INSTR monitorexit ;
	//  107  205:monitorexit     
		sBackgroundThread.postAndReply(((Callable) (context)), new SelfDestructiveThread.ReplyCallback(s) {

			public void onReply(Typeface typeface1)
			{
				ArrayList arraylist1;
				synchronized(FontsContractCompat.sLock)
			//*   0    0:invokestatic    #28  <Method Object FontsContractCompat.access$200()>
			//*   1    3:astore_3        
			//*   2    4:aload_3         
			//*   3    5:monitorenter    
				{
					arraylist1 = (ArrayList)FontsContractCompat.sPendingReplies.get(((Object) (id)));
			//    4    6:invokestatic    #32  <Method SimpleArrayMap FontsContractCompat.access$300()>
			//    5    9:aload_0         
			//    6   10:getfield        #18  <Field String val$id>
			//    7   13:invokevirtual   #38  <Method Object SimpleArrayMap.get(Object)>
			//    8   16:checkcast       #40  <Class ArrayList>
			//    9   19:astore          4
					FontsContractCompat.sPendingReplies.remove(((Object) (id)));
			//   10   21:invokestatic    #32  <Method SimpleArrayMap FontsContractCompat.access$300()>
			//   11   24:aload_0         
			//   12   25:getfield        #18  <Field String val$id>
			//   13   28:invokevirtual   #43  <Method Object SimpleArrayMap.remove(Object)>
			//   14   31:pop             
				}
			//   15   32:aload_3         
			//   16   33:monitorexit     
				for(int l = 0; l < arraylist1.size(); l++)
			//*  17   34:iconst_0        
			//*  18   35:istore_2        
			//*  19   36:iload_2         
			//*  20   37:aload           4
			//*  21   39:invokevirtual   #47  <Method int ArrayList.size()>
			//*  22   42:icmpge          72
					((SelfDestructiveThread.ReplyCallback)arraylist1.get(l)).onReply(((Object) (typeface1)));
			//   23   45:aload           4
			//   24   47:iload_2         
			//   25   48:invokevirtual   #50  <Method Object ArrayList.get(int)>
			//   26   51:checkcast       #7   <Class SelfDestructiveThread$ReplyCallback>
			//   27   54:aload_1         
			//   28   55:invokeinterface #53  <Method void SelfDestructiveThread$ReplyCallback.onReply(Object)>

			//   29   60:iload_2         
			//   30   61:iconst_1        
			//   31   62:iadd            
			//   32   63:istore_2        
				break MISSING_BLOCK_LABEL_72;
			//   33   64:goto            36
				typeface1;
			//   34   67:astore_1        
				obj;
			//   35   68:aload_3         
				JVM INSTR monitorexit ;
			//   36   69:monitorexit     
				throw typeface1;
			//   37   70:aload_1         
			//   38   71:athrow          
			//   39   72:return          
			}

			public volatile void onReply(Object obj)
			{
				onReply((Typeface)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #55  <Class Typeface>
			//    3    5:invokevirtual   #57  <Method void onReply(Typeface)>
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
	//  108  206:getstatic       #101 <Field SelfDestructiveThread sBackgroundThread>
	//  109  209:aload_0         
	//  110  210:new             #10  <Class FontsContractCompat$3>
	//  111  213:dup             
	//  112  214:aload           6
	//  113  216:invokespecial   #386 <Method void FontsContractCompat$3(String)>
	//  114  219:invokevirtual   #390 <Method void SelfDestructiveThread.postAndReply(Callable, SelfDestructiveThread$ReplyCallback)>
		return null;
	//  115  222:aconst_null     
	//  116  223:areturn         
	}

	public static ProviderInfo getProvider(PackageManager packagemanager, FontRequest fontrequest, Resources resources)
		throws android.content.pm.PackageManager.NameNotFoundException
	{
		String s = fontrequest.getProviderAuthority();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #393 <Method String FontRequest.getProviderAuthority()>
	//    2    4:astore          5
		ProviderInfo providerinfo = packagemanager.resolveContentProvider(s, 0);
	//    3    6:aload_0         
	//    4    7:aload           5
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #399 <Method ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//    7   13:astore          4
		if(providerinfo == null)
	//*   8   15:aload           4
	//*   9   17:ifnonnull       49
			throw new android.content.pm.PackageManager.NameNotFoundException((new StringBuilder()).append("No package found for authority: ").append(s).toString());
	//   10   20:new             #178 <Class android.content.pm.PackageManager$NameNotFoundException>
	//   11   23:dup             
	//   12   24:new             #339 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:invokespecial   #340 <Method void StringBuilder()>
	//   15   31:ldc2            #401 <String "No package found for authority: ">
	//   16   34:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:aload           5
	//   18   39:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   19   42:invokevirtual   #355 <Method String StringBuilder.toString()>
	//   20   45:invokespecial   #402 <Method void android.content.pm.PackageManager$NameNotFoundException(String)>
	//   21   48:athrow          
		if(!providerinfo.packageName.equals(((Object) (fontrequest.getProviderPackage()))))
	//*  22   49:aload           4
	//*  23   51:getfield        #405 <Field String ProviderInfo.packageName>
	//*  24   54:aload_1         
	//*  25   55:invokevirtual   #408 <Method String FontRequest.getProviderPackage()>
	//*  26   58:invokevirtual   #410 <Method boolean String.equals(Object)>
	//*  27   61:ifne            106
			throw new android.content.pm.PackageManager.NameNotFoundException((new StringBuilder()).append("Found content provider ").append(s).append(", but package was not ").append(fontrequest.getProviderPackage()).toString());
	//   28   64:new             #178 <Class android.content.pm.PackageManager$NameNotFoundException>
	//   29   67:dup             
	//   30   68:new             #339 <Class StringBuilder>
	//   31   71:dup             
	//   32   72:invokespecial   #340 <Method void StringBuilder()>
	//   33   75:ldc2            #412 <String "Found content provider ">
	//   34   78:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   35   81:aload           5
	//   36   83:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   37   86:ldc2            #414 <String ", but package was not ">
	//   38   89:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   39   92:aload_1         
	//   40   93:invokevirtual   #408 <Method String FontRequest.getProviderPackage()>
	//   41   96:invokevirtual   #347 <Method StringBuilder StringBuilder.append(String)>
	//   42   99:invokevirtual   #355 <Method String StringBuilder.toString()>
	//   43  102:invokespecial   #402 <Method void android.content.pm.PackageManager$NameNotFoundException(String)>
	//   44  105:athrow          
		packagemanager = ((PackageManager) (convertToByteArrayList(packagemanager.getPackageInfo(providerinfo.packageName, 64).signatures)));
	//   45  106:aload_0         
	//   46  107:aload           4
	//   47  109:getfield        #405 <Field String ProviderInfo.packageName>
	//   48  112:bipush          64
	//   49  114:invokevirtual   #418 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   50  117:getfield        #424 <Field Signature[] PackageInfo.signatures>
	//   51  120:invokestatic    #426 <Method List convertToByteArrayList(Signature[])>
	//   52  123:astore_0        
		Collections.sort(((List) (packagemanager)), sByteArrayComparator);
	//   53  124:aload_0         
	//   54  125:getstatic       #113 <Field Comparator sByteArrayComparator>
	//   55  128:invokestatic    #432 <Method void Collections.sort(List, Comparator)>
		fontrequest = ((FontRequest) (getCertificates(fontrequest, resources)));
	//   56  131:aload_1         
	//   57  132:aload_2         
	//   58  133:invokestatic    #434 <Method List getCertificates(FontRequest, Resources)>
	//   59  136:astore_1        
		for(int i = 0; i < ((List) (fontrequest)).size(); i++)
	//*  60  137:iconst_0        
	//*  61  138:istore_3        
	//*  62  139:iload_3         
	//*  63  140:aload_1         
	//*  64  141:invokeinterface #161 <Method int List.size()>
	//*  65  146:icmpge          192
		{
			resources = ((Resources) (new ArrayList((Collection)((List) (fontrequest)).get(i))));
	//   66  149:new             #140 <Class ArrayList>
	//   67  152:dup             
	//   68  153:aload_1         
	//   69  154:iload_3         
	//   70  155:invokeinterface #165 <Method Object List.get(int)>
	//   71  160:checkcast       #436 <Class Collection>
	//   72  163:invokespecial   #439 <Method void ArrayList(Collection)>
	//   73  166:astore_2        
			Collections.sort(((List) (resources)), sByteArrayComparator);
	//   74  167:aload_2         
	//   75  168:getstatic       #113 <Field Comparator sByteArrayComparator>
	//   76  171:invokestatic    #432 <Method void Collections.sort(List, Comparator)>
			if(equalsByteArrayList(((List) (packagemanager)), ((List) (resources))))
	//*  77  174:aload_0         
	//*  78  175:aload_2         
	//*  79  176:invokestatic    #441 <Method boolean equalsByteArrayList(List, List)>
	//*  80  179:ifeq            185
				return providerinfo;
	//   81  182:aload           4
	//   82  184:areturn         
		}

	//   83  185:iload_3         
	//   84  186:iconst_1        
	//   85  187:iadd            
	//   86  188:istore_3        
	//*  87  189:goto            139
		return null;
	//   88  192:aconst_null     
	//   89  193:areturn         
	}

	public static Map prepareFontData(Context context, FontInfo afontinfo[], CancellationSignal cancellationsignal)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #447 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #448 <Method void HashMap()>
	//    3    7:astore          5
		int j = afontinfo.length;
	//    4    9:aload_1         
	//    5   10:arraylength     
	//    6   11:istore          4
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore_3        
		while(i < j) 
	//*   9   15:iload_3         
	//*  10   16:iload           4
	//*  11   18:icmpge          76
		{
			Object obj = ((Object) (afontinfo[i]));
	//   12   21:aload_1         
	//   13   22:iload_3         
	//   14   23:aaload          
	//   15   24:astore          6
			if(((FontInfo) (obj)).getResultCode() == 0)
	//*  16   26:aload           6
	//*  17   28:invokevirtual   #451 <Method int FontsContractCompat$FontInfo.getResultCode()>
	//*  18   31:ifeq            41
	//*  19   34:iload_3         
	//*  20   35:iconst_1        
	//*  21   36:iadd            
	//*  22   37:istore_3        
	//*  23   38:goto            15
			{
				obj = ((Object) (((FontInfo) (obj)).getUri()));
	//   24   41:aload           6
	//   25   43:invokevirtual   #454 <Method Uri FontsContractCompat$FontInfo.getUri()>
	//   26   46:astore          6
				if(!hashmap.containsKey(obj))
	//*  27   48:aload           5
	//*  28   50:aload           6
	//*  29   52:invokevirtual   #455 <Method boolean HashMap.containsKey(Object)>
	//*  30   55:ifne            34
					hashmap.put(obj, ((Object) (TypefaceCompatUtil.mmap(context, cancellationsignal, ((Uri) (obj))))));
	//   31   58:aload           5
	//   32   60:aload           6
	//   33   62:aload_0         
	//   34   63:aload_2         
	//   35   64:aload           6
	//   36   66:invokestatic    #461 <Method java.nio.ByteBuffer TypefaceCompatUtil.mmap(Context, CancellationSignal, Uri)>
	//   37   69:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//   38   72:pop             
			}
			i++;
		}
	//*  39   73:goto            34
		return Collections.unmodifiableMap(((Map) (hashmap)));
	//   40   76:aload           5
	//   41   78:invokestatic    #466 <Method Map Collections.unmodifiableMap(Map)>
	//   42   81:areturn         
	}

	public static void requestFont(Context context, FontRequest fontrequest, FontRequestCallback fontrequestcallback, Handler handler)
	{
		handler.post(new Runnable(context, fontrequest, new Handler(), fontrequestcallback) {

			public void run()
			{
				Object obj;
				try
				{
					obj = ((Object) (FontsContractCompat.fetchFonts(context, ((CancellationSignal) (null)), request)));
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
			//*   9   17:ifeq            117
			//*  10   20:aload_3         
			//*  11   21:invokevirtual   #64  <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
			//*  12   24:tableswitch     1 2: default 48
			//			               1 83
			//			               2 100
			//*  13   48:aload_0         
			//*  14   49:getfield        #45  <Field Handler val$callerThreadHandler>
			//*  15   52:new             #19  <Class FontsContractCompat$4$4>
			//*  16   55:dup             
			//*  17   56:aload_0         
			//*  18   57:invokespecial   #67  <Method void FontsContractCompat$4$4(FontsContractCompat$4)>
			//*  19   60:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//*  20   63:pop             
			//*  21   64:return          
				// Misplaced declaration of an exception variable
				catch(Object obj)
			//*  22   65:astore_3        
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
			//   23   66:aload_0         
			//   24   67:getfield        #45  <Field Handler val$callerThreadHandler>
			//   25   70:new             #13  <Class FontsContractCompat$4$1>
			//   26   73:dup             
			//   27   74:aload_0         
			//   28   75:invokespecial   #74  <Method void FontsContractCompat$4$1(FontsContractCompat$4)>
			//   29   78:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//   30   81:pop             
					return;
			//   31   82:return          
				}
				if(((FontFamilyResult) (obj)).getStatusCode() != 0)
				{
					switch(((FontFamilyResult) (obj)).getStatusCode())
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
			//   32   83:aload_0         
			//   33   84:getfield        #45  <Field Handler val$callerThreadHandler>
			//   34   87:new             #15  <Class FontsContractCompat$4$2>
			//   35   90:dup             
			//   36   91:aload_0         
			//   37   92:invokespecial   #75  <Method void FontsContractCompat$4$2(FontsContractCompat$4)>
			//   38   95:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//   39   98:pop             
						return;
			//   40   99:return          

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
			//   41  100:aload_0         
			//   42  101:getfield        #45  <Field Handler val$callerThreadHandler>
			//   43  104:new             #17  <Class FontsContractCompat$4$3>
			//   44  107:dup             
			//   45  108:aload_0         
			//   46  109:invokespecial   #76  <Method void FontsContractCompat$4$3(FontsContractCompat$4)>
			//   47  112:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//   48  115:pop             
						break;
					}
					return;
			//   49  116:return          
				}
				FontInfo afontinfo[] = ((FontFamilyResult) (obj)).getFonts();
			//   50  117:aload_3         
			//   51  118:invokevirtual   #80  <Method FontsContractCompat$FontInfo[] FontsContractCompat$FontFamilyResult.getFonts()>
			//   52  121:astore_3        
				if(afontinfo == null || afontinfo.length == 0)
			//*  53  122:aload_3         
			//*  54  123:ifnull          131
			//*  55  126:aload_3         
			//*  56  127:arraylength     
			//*  57  128:ifne            148
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
			//   58  131:aload_0         
			//   59  132:getfield        #45  <Field Handler val$callerThreadHandler>
			//   60  135:new             #21  <Class FontsContractCompat$4$5>
			//   61  138:dup             
			//   62  139:aload_0         
			//   63  140:invokespecial   #81  <Method void FontsContractCompat$4$5(FontsContractCompat$4)>
			//   64  143:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//   65  146:pop             
					return;
			//   66  147:return          
				}
				int j = afontinfo.length;
			//   67  148:aload_3         
			//   68  149:arraylength     
			//   69  150:istore_2        
				for(int i = 0; i < j; i++)
			//*  70  151:iconst_0        
			//*  71  152:istore_1        
			//*  72  153:iload_1         
			//*  73  154:iload_2         
			//*  74  155:icmpge          223
				{
					FontInfo fontinfo = afontinfo[i];
			//   75  158:aload_3         
			//   76  159:iload_1         
			//   77  160:aaload          
			//   78  161:astore          4
					if(fontinfo.getResultCode() != 0)
			//*  79  163:aload           4
			//*  80  165:invokevirtual   #86  <Method int FontsContractCompat$FontInfo.getResultCode()>
			//*  81  168:ifeq            216
					{
						i = fontinfo.getResultCode();
			//   82  171:aload           4
			//   83  173:invokevirtual   #86  <Method int FontsContractCompat$FontInfo.getResultCode()>
			//   84  176:istore_1        
						if(i < 0)
			//*  85  177:iload_1         
			//*  86  178:ifge            198
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
			//   87  181:aload_0         
			//   88  182:getfield        #45  <Field Handler val$callerThreadHandler>
			//   89  185:new             #23  <Class FontsContractCompat$4$6>
			//   90  188:dup             
			//   91  189:aload_0         
			//   92  190:invokespecial   #87  <Method void FontsContractCompat$4$6(FontsContractCompat$4)>
			//   93  193:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//   94  196:pop             
							return;
			//   95  197:return          
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
			//   96  198:aload_0         
			//   97  199:getfield        #45  <Field Handler val$callerThreadHandler>
			//   98  202:new             #25  <Class FontsContractCompat$4$7>
			//   99  205:dup             
			//  100  206:aload_0         
			//  101  207:iload_1         
			//  102  208:invokespecial   #90  <Method void FontsContractCompat$4$7(FontsContractCompat$4, int)>
			//  103  211:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//  104  214:pop             
							return;
			//  105  215:return          
						}
					}
				}

			//  106  216:iload_1         
			//  107  217:iconst_1        
			//  108  218:iadd            
			//  109  219:istore_1        
			//* 110  220:goto            153
				afontinfo = ((FontInfo []) (FontsContractCompat.buildTypeface(context, ((CancellationSignal) (null)), afontinfo)));
			//  111  223:aload_0         
			//  112  224:getfield        #41  <Field Context val$context>
			//  113  227:aconst_null     
			//  114  228:aload_3         
			//  115  229:invokestatic    #94  <Method Typeface FontsContractCompat.buildTypeface(Context, CancellationSignal, FontsContractCompat$FontInfo[])>
			//  116  232:astore_3        
				if(afontinfo == null)
			//* 117  233:aload_3         
			//* 118  234:ifnonnull       254
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
			//  119  237:aload_0         
			//  120  238:getfield        #45  <Field Handler val$callerThreadHandler>
			//  121  241:new             #27  <Class FontsContractCompat$4$8>
			//  122  244:dup             
			//  123  245:aload_0         
			//  124  246:invokespecial   #95  <Method void FontsContractCompat$4$8(FontsContractCompat$4)>
			//  125  249:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//  126  252:pop             
					return;
			//  127  253:return          
				} else
				{
					callerThreadHandler.post(((_cls9) (afontinfo)). new Runnable() {

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
			//  128  254:aload_0         
			//  129  255:getfield        #45  <Field Handler val$callerThreadHandler>
			//  130  258:new             #29  <Class FontsContractCompat$4$9>
			//  131  261:dup             
			//  132  262:aload_0         
			//  133  263:aload_3         
			//  134  264:invokespecial   #98  <Method void FontsContractCompat$4$9(FontsContractCompat$4, Typeface)>
			//  135  267:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
			//  136  270:pop             
					return;
			//  137  271:return          
				}
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
	//    5    7:new             #471 <Class Handler>
	//    6   10:dup             
	//    7   11:invokespecial   #472 <Method void Handler()>
	//    8   14:aload_2         
	//    9   15:invokespecial   #475 <Method void FontsContractCompat$4(Context, FontRequest, Handler, FontsContractCompat$FontRequestCallback)>
	//   10   18:invokevirtual   #479 <Method boolean Handler.post(Runnable)>
	//   11   21:pop             
	//   12   22:return          
	}

	private static final int BACKGROUND_THREAD_KEEP_ALIVE_DURATION_MS = 10000;
	public static final String PARCEL_FONT_RESULTS = "font_results";
	public static final int RESULT_CODE_PROVIDER_NOT_FOUND = -1;
	public static final int RESULT_CODE_WRONG_CERTIFICATES = -2;
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


/*
	static Typeface access$000(Context context, FontRequest fontrequest, int i)
	{
		return getFontInternal(context, fontrequest, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #119 <Method Typeface getFontInternal(Context, FontRequest, int)>
	//    4    6:areturn         
	}

*/


/*
	static LruCache access$100()
	{
		return sTypefaceCache;
	//    0    0:getstatic       #92  <Field LruCache sTypefaceCache>
	//    1    3:areturn         
	}

*/


/*
	static Object access$200()
	{
		return sLock;
	//    0    0:getstatic       #105 <Field Object sLock>
	//    1    3:areturn         
	}

*/


/*
	static SimpleArrayMap access$300()
	{
		return sPendingReplies;
	//    0    0:getstatic       #110 <Field SimpleArrayMap sPendingReplies>
	//    1    3:areturn         
	}

*/
}
