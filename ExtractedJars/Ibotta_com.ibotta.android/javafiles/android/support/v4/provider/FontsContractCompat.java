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
	public static class FontFamilyResult
	{

		public FontInfo[] getFonts()
		{
			return mFonts;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field FontsContractCompat$FontInfo[] mFonts>
		//    2    4:areturn         
		}

		public int getStatusCode()
		{
			return mStatusCode;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field int mStatusCode>
		//    2    4:ireturn         
		}

		private final FontInfo mFonts[];
		private final int mStatusCode;

		public FontFamilyResult(int i, FontInfo afontinfo[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			mStatusCode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #23  <Field int mStatusCode>
			mFonts = afontinfo;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #25  <Field FontsContractCompat$FontInfo[] mFonts>
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


	private static List convertToByteArrayList(Signature asignature[])
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #78  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void ArrayList()>
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
	//   14   20:invokevirtual   #85  <Method byte[] Signature.toByteArray()>
	//   15   23:invokeinterface #91  <Method boolean List.add(Object)>
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
	//*   1    1:invokeinterface #99  <Method int List.size()>
	//*   2    6:aload_1         
	//*   3    7:invokeinterface #99  <Method int List.size()>
	//*   4   12:icmpeq          17
			return false;
	//    5   15:iconst_0        
	//    6   16:ireturn         
		for(int i = 0; i < list.size(); i++)
	//*   7   17:iconst_0        
	//*   8   18:istore_2        
	//*   9   19:iload_2         
	//*  10   20:aload_0         
	//*  11   21:invokeinterface #99  <Method int List.size()>
	//*  12   26:icmpge          64
			if(!Arrays.equals((byte[])list.get(i), (byte[])list1.get(i)))
	//*  13   29:aload_0         
	//*  14   30:iload_2         
	//*  15   31:invokeinterface #103 <Method Object List.get(int)>
	//*  16   36:checkcast       #105 <Class byte[]>
	//*  17   39:aload_1         
	//*  18   40:iload_2         
	//*  19   41:invokeinterface #103 <Method Object List.get(int)>
	//*  20   46:checkcast       #105 <Class byte[]>
	//*  21   49:invokestatic    #111 <Method boolean Arrays.equals(byte[], byte[])>
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
	//    1    1:invokevirtual   #124 <Method PackageManager Context.getPackageManager()>
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #128 <Method Resources Context.getResources()>
	//    5    9:invokestatic    #132 <Method ProviderInfo getProvider(PackageManager, FontRequest, Resources)>
	//    6   12:astore_3        
		if(providerinfo == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       27
			return new FontFamilyResult(1, ((FontInfo []) (null)));
	//    9   17:new             #14  <Class FontsContractCompat$FontFamilyResult>
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:aconst_null     
	//   13   23:invokespecial   #135 <Method void FontsContractCompat$FontFamilyResult(int, FontsContractCompat$FontInfo[])>
	//   14   26:areturn         
		else
			return new FontFamilyResult(0, getFontFromProvider(context, fontrequest, providerinfo.authority, cancellationsignal));
	//   15   27:new             #14  <Class FontsContractCompat$FontFamilyResult>
	//   16   30:dup             
	//   17   31:iconst_0        
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:aload_3         
	//   21   35:getfield        #141 <Field String ProviderInfo.authority>
	//   22   38:aload_1         
	//   23   39:invokestatic    #145 <Method FontsContractCompat$FontInfo[] getFontFromProvider(Context, FontRequest, String, CancellationSignal)>
	//   24   42:invokespecial   #135 <Method void FontsContractCompat$FontFamilyResult(int, FontsContractCompat$FontInfo[])>
	//   25   45:areturn         
	}

	private static List getCertificates(FontRequest fontrequest, Resources resources)
	{
		if(fontrequest.getCertificates() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #155 <Method List FontRequest.getCertificates()>
	//*   2    4:ifnull          12
			return fontrequest.getCertificates();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #155 <Method List FontRequest.getCertificates()>
	//    5   11:areturn         
		else
			return FontResourcesParserCompat.readCerts(resources, fontrequest.getCertificatesArrayResId());
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #158 <Method int FontRequest.getCertificatesArrayResId()>
	//    9   17:invokestatic    #164 <Method List FontResourcesParserCompat.readCerts(Resources, int)>
	//   10   20:areturn         
	}

	static FontInfo[] getFontFromProvider(Context context, FontRequest fontrequest, String s, CancellationSignal cancellationsignal)
	{
		ArrayList arraylist;
		Object obj;
		Uri uri;
		Uri uri1;
		arraylist = new ArrayList();
	//    0    0:new             #78  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void ArrayList()>
	//    3    7:astore          14
		uri = (new android.net.Uri.Builder()).scheme("content").authority(s).build();
	//    4    9:new             #168 <Class android.net.Uri$Builder>
	//    5   12:dup             
	//    6   13:invokespecial   #169 <Method void android.net.Uri$Builder()>
	//    7   16:ldc1            #171 <String "content">
	//    8   18:invokevirtual   #175 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//    9   21:aload_2         
	//   10   22:invokevirtual   #177 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   11   25:invokevirtual   #181 <Method Uri android.net.Uri$Builder.build()>
	//   12   28:astore          16
		uri1 = (new android.net.Uri.Builder()).scheme("content").authority(s).appendPath("file").build();
	//   13   30:new             #168 <Class android.net.Uri$Builder>
	//   14   33:dup             
	//   15   34:invokespecial   #169 <Method void android.net.Uri$Builder()>
	//   16   37:ldc1            #171 <String "content">
	//   17   39:invokevirtual   #175 <Method android.net.Uri$Builder android.net.Uri$Builder.scheme(String)>
	//   18   42:aload_2         
	//   19   43:invokevirtual   #177 <Method android.net.Uri$Builder android.net.Uri$Builder.authority(String)>
	//   20   46:ldc1            #183 <String "file">
	//   21   48:invokevirtual   #186 <Method android.net.Uri$Builder android.net.Uri$Builder.appendPath(String)>
	//   22   51:invokevirtual   #181 <Method Uri android.net.Uri$Builder.build()>
	//   23   54:astore          17
		obj = null;
	//   24   56:aconst_null     
	//   25   57:astore          15
		s = ((String) (obj));
	//   26   59:aload           15
	//   27   61:astore_2        
		if(android.os.Build.VERSION.SDK_INT <= 16)
			break MISSING_BLOCK_LABEL_152;
	//   28   62:getstatic       #192 <Field int android.os.Build$VERSION.SDK_INT>
	//   29   65:bipush          16
	//   30   67:icmple          152
		s = ((String) (obj));
	//   31   70:aload           15
	//   32   72:astore_2        
		context = ((Context) (context.getContentResolver()));
	//   33   73:aload_0         
	//   34   74:invokevirtual   #196 <Method ContentResolver Context.getContentResolver()>
	//   35   77:astore_0        
		s = ((String) (obj));
	//   36   78:aload           15
	//   37   80:astore_2        
		fontrequest = ((FontRequest) (fontrequest.getQuery()));
	//   38   81:aload_1         
	//   39   82:invokevirtual   #200 <Method String FontRequest.getQuery()>
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
	//   49   99:ldc1            #204 <String "_id">
	//   50  101:aastore         
	//   51  102:dup             
	//   52  103:iconst_1        
	//   53  104:ldc1            #206 <String "file_id">
	//   54  106:aastore         
	//   55  107:dup             
	//   56  108:iconst_2        
	//   57  109:ldc1            #208 <String "font_ttc_index">
	//   58  111:aastore         
	//   59  112:dup             
	//   60  113:iconst_3        
	//   61  114:ldc1            #210 <String "font_variation_settings">
	//   62  116:aastore         
	//   63  117:dup             
	//   64  118:iconst_4        
	//   65  119:ldc1            #212 <String "font_weight">
	//   66  121:aastore         
	//   67  122:dup             
	//   68  123:iconst_5        
	//   69  124:ldc1            #214 <String "font_italic">
	//   70  126:aastore         
	//   71  127:dup             
	//   72  128:bipush          6
	//   73  130:ldc1            #216 <String "result_code">
	//   74  132:aastore         
	//   75  133:ldc1            #218 <String "query = ?">
	//   76  135:iconst_1        
	//   77  136:anewarray       String[]
	//   78  139:dup             
	//   79  140:iconst_0        
	//   80  141:aload_1         
	//   81  142:aastore         
	//   82  143:aconst_null     
	//   83  144:aload_3         
	//   84  145:invokevirtual   #224 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String, CancellationSignal)>
	//   85  148:astore_0        
		break MISSING_BLOCK_LABEL_230;
	//   86  149:goto            230
		s = ((String) (obj));
	//   87  152:aload           15
	//   88  154:astore_2        
		context = ((Context) (context.getContentResolver()));
	//   89  155:aload_0         
	//   90  156:invokevirtual   #196 <Method ContentResolver Context.getContentResolver()>
	//   91  159:astore_0        
		s = ((String) (obj));
	//   92  160:aload           15
	//   93  162:astore_2        
		fontrequest = ((FontRequest) (fontrequest.getQuery()));
	//   94  163:aload_1         
	//   95  164:invokevirtual   #200 <Method String FontRequest.getQuery()>
	//   96  167:astore_1        
		s = ((String) (obj));
	//   97  168:aload           15
	//   98  170:astore_2        
		context = ((Context) (((ContentResolver) (context)).query(uri, new String[] {
			"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"
		}, "query = ?", new String[] {
			fontrequest
		}, ((String) (null)))));
	//   99  171:aload_0         
	//  100  172:aload           16
	//  101  174:bipush          7
	//  102  176:anewarray       String[]
	//  103  179:dup             
	//  104  180:iconst_0        
	//  105  181:ldc1            #204 <String "_id">
	//  106  183:aastore         
	//  107  184:dup             
	//  108  185:iconst_1        
	//  109  186:ldc1            #206 <String "file_id">
	//  110  188:aastore         
	//  111  189:dup             
	//  112  190:iconst_2        
	//  113  191:ldc1            #208 <String "font_ttc_index">
	//  114  193:aastore         
	//  115  194:dup             
	//  116  195:iconst_3        
	//  117  196:ldc1            #210 <String "font_variation_settings">
	//  118  198:aastore         
	//  119  199:dup             
	//  120  200:iconst_4        
	//  121  201:ldc1            #212 <String "font_weight">
	//  122  203:aastore         
	//  123  204:dup             
	//  124  205:iconst_5        
	//  125  206:ldc1            #214 <String "font_italic">
	//  126  208:aastore         
	//  127  209:dup             
	//  128  210:bipush          6
	//  129  212:ldc1            #216 <String "result_code">
	//  130  214:aastore         
	//  131  215:ldc1            #218 <String "query = ?">
	//  132  217:iconst_1        
	//  133  218:anewarray       String[]
	//  134  221:dup             
	//  135  222:iconst_0        
	//  136  223:aload_1         
	//  137  224:aastore         
	//  138  225:aconst_null     
	//  139  226:invokevirtual   #227 <Method Cursor ContentResolver.query(Uri, String[], String, String[], String)>
	//  140  229:astore_0        
		fontrequest = ((FontRequest) (arraylist));
	//  141  230:aload           14
	//  142  232:astore_1        
		if(context == null) goto _L2; else goto _L1
	//  143  233:aload_0         
	//  144  234:ifnull          502
_L1:
		fontrequest = ((FontRequest) (arraylist));
	//  145  237:aload           14
	//  146  239:astore_1        
		s = ((String) (context));
	//  147  240:aload_0         
	//  148  241:astore_2        
		if(((Cursor) (context)).getCount() <= 0) goto _L2; else goto _L3
	//  149  242:aload_0         
	//  150  243:invokeinterface #232 <Method int Cursor.getCount()>
	//  151  248:ifle            502
_L3:
		s = ((String) (context));
	//  152  251:aload_0         
	//  153  252:astore_2        
		int l = ((Cursor) (context)).getColumnIndex("result_code");
	//  154  253:aload_0         
	//  155  254:ldc1            #216 <String "result_code">
	//  156  256:invokeinterface #236 <Method int Cursor.getColumnIndex(String)>
	//  157  261:istore          7
		s = ((String) (context));
	//  158  263:aload_0         
	//  159  264:astore_2        
		cancellationsignal = ((CancellationSignal) (new ArrayList()));
	//  160  265:new             #78  <Class ArrayList>
	//  161  268:dup             
	//  162  269:invokespecial   #79  <Method void ArrayList()>
	//  163  272:astore_3        
		s = ((String) (context));
	//  164  273:aload_0         
	//  165  274:astore_2        
		int i1 = ((Cursor) (context)).getColumnIndex("_id");
	//  166  275:aload_0         
	//  167  276:ldc1            #204 <String "_id">
	//  168  278:invokeinterface #236 <Method int Cursor.getColumnIndex(String)>
	//  169  283:istore          8
		s = ((String) (context));
	//  170  285:aload_0         
	//  171  286:astore_2        
		int j1 = ((Cursor) (context)).getColumnIndex("file_id");
	//  172  287:aload_0         
	//  173  288:ldc1            #206 <String "file_id">
	//  174  290:invokeinterface #236 <Method int Cursor.getColumnIndex(String)>
	//  175  295:istore          9
		s = ((String) (context));
	//  176  297:aload_0         
	//  177  298:astore_2        
		int k1 = ((Cursor) (context)).getColumnIndex("font_ttc_index");
	//  178  299:aload_0         
	//  179  300:ldc1            #208 <String "font_ttc_index">
	//  180  302:invokeinterface #236 <Method int Cursor.getColumnIndex(String)>
	//  181  307:istore          10
		s = ((String) (context));
	//  182  309:aload_0         
	//  183  310:astore_2        
		int l1 = ((Cursor) (context)).getColumnIndex("font_weight");
	//  184  311:aload_0         
	//  185  312:ldc1            #212 <String "font_weight">
	//  186  314:invokeinterface #236 <Method int Cursor.getColumnIndex(String)>
	//  187  319:istore          11
		s = ((String) (context));
	//  188  321:aload_0         
	//  189  322:astore_2        
		int i2 = ((Cursor) (context)).getColumnIndex("font_italic");
	//  190  323:aload_0         
	//  191  324:ldc1            #214 <String "font_italic">
	//  192  326:invokeinterface #236 <Method int Cursor.getColumnIndex(String)>
	//  193  331:istore          12
_L12:
		s = ((String) (context));
	//  194  333:aload_0         
	//  195  334:astore_2        
		if(!((Cursor) (context)).moveToNext()) goto _L5; else goto _L4
	//  196  335:aload_0         
	//  197  336:invokeinterface #240 <Method boolean Cursor.moveToNext()>
	//  198  341:ifeq            500
_L4:
		if(l == -1) goto _L7; else goto _L6
	//  199  344:iload           7
	//  200  346:iconst_m1       
	//  201  347:icmpeq          537
_L6:
		s = ((String) (context));
	//  202  350:aload_0         
	//  203  351:astore_2        
		int i = ((Cursor) (context)).getInt(l);
	//  204  352:aload_0         
	//  205  353:iload           7
	//  206  355:invokeinterface #244 <Method int Cursor.getInt(int)>
	//  207  360:istore          4
	//* 208  362:goto            365
_L13:
		if(k1 == -1) goto _L9; else goto _L8
	//  209  365:iload           10
	//  210  367:iconst_m1       
	//  211  368:icmpeq          543
_L8:
		s = ((String) (context));
	//  212  371:aload_0         
	//  213  372:astore_2        
		int j = ((Cursor) (context)).getInt(k1);
	//  214  373:aload_0         
	//  215  374:iload           10
	//  216  376:invokeinterface #244 <Method int Cursor.getInt(int)>
	//  217  381:istore          5
	//* 218  383:goto            386
_L14:
		if(j1 != -1)
			break MISSING_BLOCK_LABEL_411;
	//  219  386:iload           9
	//  220  388:iconst_m1       
	//  221  389:icmpne          411
		s = ((String) (context));
	//  222  392:aload_0         
	//  223  393:astore_2        
		fontrequest = ((FontRequest) (ContentUris.withAppendedId(uri, ((Cursor) (context)).getLong(i1))));
	//  224  394:aload           16
	//  225  396:aload_0         
	//  226  397:iload           8
	//  227  399:invokeinterface #248 <Method long Cursor.getLong(int)>
	//  228  404:invokestatic    #254 <Method Uri ContentUris.withAppendedId(Uri, long)>
	//  229  407:astore_1        
		break MISSING_BLOCK_LABEL_427;
	//  230  408:goto            427
		s = ((String) (context));
	//  231  411:aload_0         
	//  232  412:astore_2        
		fontrequest = ((FontRequest) (ContentUris.withAppendedId(uri1, ((Cursor) (context)).getLong(j1))));
	//  233  413:aload           17
	//  234  415:aload_0         
	//  235  416:iload           9
	//  236  418:invokeinterface #248 <Method long Cursor.getLong(int)>
	//  237  423:invokestatic    #254 <Method Uri ContentUris.withAppendedId(Uri, long)>
	//  238  426:astore_1        
		if(l1 == -1) goto _L11; else goto _L10
	//  239  427:iload           11
	//  240  429:iconst_m1       
	//  241  430:icmpeq          549
_L10:
		s = ((String) (context));
	//  242  433:aload_0         
	//  243  434:astore_2        
		int k = ((Cursor) (context)).getInt(l1);
	//  244  435:aload_0         
	//  245  436:iload           11
	//  246  438:invokeinterface #244 <Method int Cursor.getInt(int)>
	//  247  443:istore          6
	//* 248  445:goto            448
_L15:
		if(i2 == -1)
			break MISSING_BLOCK_LABEL_557;
	//  249  448:iload           12
	//  250  450:iconst_m1       
	//  251  451:icmpeq          557
		s = ((String) (context));
	//  252  454:aload_0         
	//  253  455:astore_2        
		if(((Cursor) (context)).getInt(i2) != 1)
			break MISSING_BLOCK_LABEL_557;
	//  254  456:aload_0         
	//  255  457:iload           12
	//  256  459:invokeinterface #244 <Method int Cursor.getInt(int)>
	//  257  464:iconst_1        
	//  258  465:icmpne          557
		boolean flag = true;
	//  259  468:iconst_1        
	//  260  469:istore          13
	//* 261  471:goto            474
_L16:
		s = ((String) (context));
	//  262  474:aload_0         
	//  263  475:astore_2        
		((ArrayList) (cancellationsignal)).add(((Object) (new FontInfo(((Uri) (fontrequest)), j, k, flag, i))));
	//  264  476:aload_3         
	//  265  477:new             #17  <Class FontsContractCompat$FontInfo>
	//  266  480:dup             
	//  267  481:aload_1         
	//  268  482:iload           5
	//  269  484:iload           6
	//  270  486:iload           13
	//  271  488:iload           4
	//  272  490:invokespecial   #257 <Method void FontsContractCompat$FontInfo(Uri, int, int, boolean, int)>
	//  273  493:invokevirtual   #258 <Method boolean ArrayList.add(Object)>
	//  274  496:pop             
		  goto _L12
	//* 275  497:goto            333
_L5:
		fontrequest = ((FontRequest) (cancellationsignal));
	//  276  500:aload_3         
	//  277  501:astore_1        
_L2:
		if(context != null)
	//* 278  502:aload_0         
	//* 279  503:ifnull          512
			((Cursor) (context)).close();
	//  280  506:aload_0         
	//  281  507:invokeinterface #261 <Method void Cursor.close()>
		return (FontInfo[])((ArrayList) (fontrequest)).toArray(((Object []) (new FontInfo[0])));
	//  282  512:aload_1         
	//  283  513:iconst_0        
	//  284  514:anewarray       FontInfo[]
	//  285  517:invokevirtual   #265 <Method Object[] ArrayList.toArray(Object[])>
	//  286  520:checkcast       #267 <Class FontsContractCompat$FontInfo[]>
	//  287  523:areturn         
		context;
	//  288  524:astore_0        
		if(s != null)
	//* 289  525:aload_2         
	//* 290  526:ifnull          535
			((Cursor) (s)).close();
	//  291  529:aload_2         
	//  292  530:invokeinterface #261 <Method void Cursor.close()>
		throw context;
	//  293  535:aload_0         
	//  294  536:athrow          
_L7:
		i = 0;
	//  295  537:iconst_0        
	//  296  538:istore          4
		  goto _L13
	//* 297  540:goto            365
_L9:
		j = 0;
	//  298  543:iconst_0        
	//  299  544:istore          5
		  goto _L14
	//* 300  546:goto            386
_L11:
		k = 400;
	//  301  549:sipush          400
	//  302  552:istore          6
		  goto _L15
	//* 303  554:goto            448
		flag = false;
	//  304  557:iconst_0        
	//  305  558:istore          13
		  goto _L16
	//* 306  560:goto            474
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
	//    3    3:invokestatic    #271 <Method FontsContractCompat$FontFamilyResult fetchFonts(Context, CancellationSignal, FontRequest)>
	//    4    6:astore_1        
		}
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #274 <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
	//*   7   11:istore          4
	//*   8   13:bipush          -3
	//*   9   15:istore_3        
	//*  10   16:iload           4
	//*  11   18:ifne            48
	//*  12   21:aload_0         
	//*  13   22:aconst_null     
	//*  14   23:aload_1         
	//*  15   24:invokevirtual   #278 <Method FontsContractCompat$FontInfo[] FontsContractCompat$FontFamilyResult.getFonts()>
	//*  16   27:iload_2         
	//*  17   28:invokestatic    #284 <Method Typeface TypefaceCompat.createFromFontInfo(Context, CancellationSignal, FontsContractCompat$FontInfo[], int)>
	//*  18   31:astore_0        
	//*  19   32:aload_0         
	//*  20   33:ifnull          38
	//*  21   36:iconst_0        
	//*  22   37:istore_3        
	//*  23   38:new             #26  <Class FontsContractCompat$TypefaceResult>
	//*  24   41:dup             
	//*  25   42:aload_0         
	//*  26   43:iload_3         
	//*  27   44:invokespecial   #287 <Method void FontsContractCompat$TypefaceResult(Typeface, int)>
	//*  28   47:areturn         
	//*  29   48:aload_1         
	//*  30   49:invokevirtual   #274 <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
	//*  31   52:iconst_1        
	//*  32   53:icmpne          59
	//*  33   56:bipush          -2
	//*  34   58:istore_3        
	//*  35   59:new             #26  <Class FontsContractCompat$TypefaceResult>
	//*  36   62:dup             
	//*  37   63:aconst_null     
	//*  38   64:iload_3         
	//*  39   65:invokespecial   #287 <Method void FontsContractCompat$TypefaceResult(Typeface, int)>
	//*  40   68:areturn         
	//*  41   69:new             #26  <Class FontsContractCompat$TypefaceResult>
	//*  42   72:dup             
	//*  43   73:aconst_null     
	//*  44   74:iconst_m1       
	//*  45   75:invokespecial   #287 <Method void FontsContractCompat$TypefaceResult(Typeface, int)>
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
	//    0    0:new             #296 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #297 <Method void StringBuilder()>
	//    3    7:astore          7
		((StringBuilder) (obj)).append(fontrequest.getIdentifier());
	//    4    9:aload           7
	//    5   11:aload_1         
	//    6   12:invokevirtual   #300 <Method String FontRequest.getIdentifier()>
	//    7   15:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		((StringBuilder) (obj)).append("-");
	//    9   19:aload           7
	//   10   21:ldc2            #306 <String "-">
	//   11   24:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
		((StringBuilder) (obj)).append(j);
	//   13   28:aload           7
	//   14   30:iload           6
	//   15   32:invokevirtual   #309 <Method StringBuilder StringBuilder.append(int)>
	//   16   35:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   17   36:aload           7
	//   18   38:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   19   41:astore          7
		Typeface typeface = (Typeface)sTypefaceCache.get(obj);
	//   20   43:getstatic       #52  <Field LruCache sTypefaceCache>
	//   21   46:aload           7
	//   22   48:invokevirtual   #315 <Method Object LruCache.get(Object)>
	//   23   51:checkcast       #317 <Class Typeface>
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
	//   31   68:invokevirtual   #323 <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.onFontRetrieved(Typeface)>
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
	//   42   89:invokestatic    #325 <Method FontsContractCompat$TypefaceResult getFontInternal(Context, FontRequest, int)>
	//   43   92:astore_0        
			if(fontcallback != null)
	//*  44   93:aload_2         
	//*  45   94:ifnull          125
				if(((TypefaceResult) (context)).mResult == 0)
	//*  46   97:aload_0         
	//*  47   98:getfield        #328 <Field int FontsContractCompat$TypefaceResult.mResult>
	//*  48  101:ifne            116
					fontcallback.callbackSuccessAsync(((TypefaceResult) (context)).mTypeface, handler);
	//   49  104:aload_2         
	//   50  105:aload_0         
	//   51  106:getfield        #332 <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
	//   52  109:aload_3         
	//   53  110:invokevirtual   #336 <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackSuccessAsync(Typeface, Handler)>
				else
	//*  54  113:goto            125
					fontcallback.callbackFailAsync(((TypefaceResult) (context)).mResult, handler);
	//   55  116:aload_2         
	//   56  117:aload_0         
	//   57  118:getfield        #328 <Field int FontsContractCompat$TypefaceResult.mResult>
	//   58  121:aload_3         
	//   59  122:invokevirtual   #340 <Method void android.support.v4.content.res.ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
			return ((TypefaceResult) (context)).mTypeface;
	//   60  125:aload_0         
	//   61  126:getfield        #332 <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
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
	//   69  140:invokespecial   #343 <Method void FontsContractCompat$1(Context, FontRequest, int, String)>
	//   70  143:astore_1        
		if(flag)
	//*  71  144:iload           4
	//*  72  146:ifeq            167
		{
			try
			{
				context = ((Context) (((TypefaceResult)sBackgroundThread.postAndWait(((Callable) (fontrequest)), i)).mTypeface));
	//   73  149:getstatic       #61  <Field SelfDestructiveThread sBackgroundThread>
	//   74  152:aload_1         
	//   75  153:iload           5
	//   76  155:invokevirtual   #347 <Method Object SelfDestructiveThread.postAndWait(Callable, int)>
	//   77  158:checkcast       #26  <Class FontsContractCompat$TypefaceResult>
	//   78  161:getfield        #332 <Field Typeface FontsContractCompat$TypefaceResult.mTypeface>
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
	//*  91  182:invokespecial   #350 <Method void FontsContractCompat$2(android.support.v4.content.res.ResourcesCompat$FontCallback, Handler)>
	//*  92  185:astore_0        
	//*  93  186:getstatic       #65  <Field Object sLock>
	//*  94  189:astore_2        
	//*  95  190:aload_2         
	//*  96  191:monitorenter    
	//*  97  192:getstatic       #70  <Field SimpleArrayMap sPendingReplies>
	//*  98  195:aload           7
	//*  99  197:invokevirtual   #353 <Method boolean SimpleArrayMap.containsKey(Object)>
	//* 100  200:ifeq            227
	//* 101  203:aload_0         
	//* 102  204:ifnull          223
	//* 103  207:getstatic       #70  <Field SimpleArrayMap sPendingReplies>
	//* 104  210:aload           7
	//* 105  212:invokevirtual   #354 <Method Object SimpleArrayMap.get(Object)>
	//* 106  215:checkcast       #78  <Class ArrayList>
	//* 107  218:aload_0         
	//* 108  219:invokevirtual   #258 <Method boolean ArrayList.add(Object)>
	//* 109  222:pop             
	//* 110  223:aload_2         
	//* 111  224:monitorexit     
	//* 112  225:aconst_null     
	//* 113  226:areturn         
	//* 114  227:aload_0         
	//* 115  228:ifnull          255
	//* 116  231:new             #78  <Class ArrayList>
	//* 117  234:dup             
	//* 118  235:invokespecial   #79  <Method void ArrayList()>
	//* 119  238:astore_3        
	//* 120  239:aload_3         
	//* 121  240:aload_0         
	//* 122  241:invokevirtual   #258 <Method boolean ArrayList.add(Object)>
	//* 123  244:pop             
	//* 124  245:getstatic       #70  <Field SimpleArrayMap sPendingReplies>
	//* 125  248:aload           7
	//* 126  250:aload_3         
	//* 127  251:invokevirtual   #358 <Method Object SimpleArrayMap.put(Object, Object)>
	//* 128  254:pop             
	//* 129  255:aload_2         
	//* 130  256:monitorexit     
	//* 131  257:getstatic       #61  <Field SelfDestructiveThread sBackgroundThread>
	//* 132  260:aload_1         
	//* 133  261:new             #10  <Class FontsContractCompat$3>
	//* 134  264:dup             
	//* 135  265:aload           7
	//* 136  267:invokespecial   #361 <Method void FontsContractCompat$3(String)>
	//* 137  270:invokevirtual   #365 <Method void SelfDestructiveThread.postAndReply(Callable, SelfDestructiveThread$ReplyCallback)>
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
	//    1    1:invokevirtual   #368 <Method String FontRequest.getProviderAuthority()>
	//    2    4:astore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		ProviderInfo providerinfo = packagemanager.resolveContentProvider(s, 0);
	//    5    8:aload_0         
	//    6    9:aload           5
	//    7   11:iconst_0        
	//    8   12:invokevirtual   #374 <Method ProviderInfo PackageManager.resolveContentProvider(String, int)>
	//    9   15:astore          4
		if(providerinfo != null)
	//*  10   17:aload           4
	//*  11   19:ifnull          175
		{
			if(providerinfo.packageName.equals(((Object) (fontrequest.getProviderPackage()))))
	//*  12   22:aload           4
	//*  13   24:getfield        #377 <Field String ProviderInfo.packageName>
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #380 <Method String FontRequest.getProviderPackage()>
	//*  16   31:invokevirtual   #382 <Method boolean String.equals(Object)>
	//*  17   34:ifeq            123
			{
				packagemanager = ((PackageManager) (convertToByteArrayList(packagemanager.getPackageInfo(providerinfo.packageName, 64).signatures)));
	//   18   37:aload_0         
	//   19   38:aload           4
	//   20   40:getfield        #377 <Field String ProviderInfo.packageName>
	//   21   43:bipush          64
	//   22   45:invokevirtual   #386 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   23   48:getfield        #392 <Field Signature[] PackageInfo.signatures>
	//   24   51:invokestatic    #394 <Method List convertToByteArrayList(Signature[])>
	//   25   54:astore_0        
				Collections.sort(((List) (packagemanager)), sByteArrayComparator);
	//   26   55:aload_0         
	//   27   56:getstatic       #73  <Field Comparator sByteArrayComparator>
	//   28   59:invokestatic    #400 <Method void Collections.sort(List, Comparator)>
				for(fontrequest = ((FontRequest) (getCertificates(fontrequest, resources))); i < ((List) (fontrequest)).size(); i++)
	//*  29   62:aload_1         
	//*  30   63:aload_2         
	//*  31   64:invokestatic    #402 <Method List getCertificates(FontRequest, Resources)>
	//*  32   67:astore_1        
	//*  33   68:iload_3         
	//*  34   69:aload_1         
	//*  35   70:invokeinterface #99  <Method int List.size()>
	//*  36   75:icmpge          121
				{
					resources = ((Resources) (new ArrayList((Collection)((List) (fontrequest)).get(i))));
	//   37   78:new             #78  <Class ArrayList>
	//   38   81:dup             
	//   39   82:aload_1         
	//   40   83:iload_3         
	//   41   84:invokeinterface #103 <Method Object List.get(int)>
	//   42   89:checkcast       #404 <Class Collection>
	//   43   92:invokespecial   #407 <Method void ArrayList(Collection)>
	//   44   95:astore_2        
					Collections.sort(((List) (resources)), sByteArrayComparator);
	//   45   96:aload_2         
	//   46   97:getstatic       #73  <Field Comparator sByteArrayComparator>
	//   47  100:invokestatic    #400 <Method void Collections.sort(List, Comparator)>
					if(equalsByteArrayList(((List) (packagemanager)), ((List) (resources))))
	//*  48  103:aload_0         
	//*  49  104:aload_2         
	//*  50  105:invokestatic    #409 <Method boolean equalsByteArrayList(List, List)>
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
	//   61  123:new             #296 <Class StringBuilder>
	//   62  126:dup             
	//   63  127:invokespecial   #297 <Method void StringBuilder()>
	//   64  130:astore_0        
				((StringBuilder) (packagemanager)).append("Found content provider ");
	//   65  131:aload_0         
	//   66  132:ldc2            #411 <String "Found content provider ">
	//   67  135:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   68  138:pop             
				((StringBuilder) (packagemanager)).append(s);
	//   69  139:aload_0         
	//   70  140:aload           5
	//   71  142:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   72  145:pop             
				((StringBuilder) (packagemanager)).append(", but package was not ");
	//   73  146:aload_0         
	//   74  147:ldc2            #413 <String ", but package was not ">
	//   75  150:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   76  153:pop             
				((StringBuilder) (packagemanager)).append(fontrequest.getProviderPackage());
	//   77  154:aload_0         
	//   78  155:aload_1         
	//   79  156:invokevirtual   #380 <Method String FontRequest.getProviderPackage()>
	//   80  159:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   81  162:pop             
				throw new android.content.pm.PackageManager.NameNotFoundException(((StringBuilder) (packagemanager)).toString());
	//   82  163:new             #116 <Class android.content.pm.PackageManager$NameNotFoundException>
	//   83  166:dup             
	//   84  167:aload_0         
	//   85  168:invokevirtual   #312 <Method String StringBuilder.toString()>
	//   86  171:invokespecial   #414 <Method void android.content.pm.PackageManager$NameNotFoundException(String)>
	//   87  174:athrow          
			}
		} else
		{
			packagemanager = ((PackageManager) (new StringBuilder()));
	//   88  175:new             #296 <Class StringBuilder>
	//   89  178:dup             
	//   90  179:invokespecial   #297 <Method void StringBuilder()>
	//   91  182:astore_0        
			((StringBuilder) (packagemanager)).append("No package found for authority: ");
	//   92  183:aload_0         
	//   93  184:ldc2            #416 <String "No package found for authority: ">
	//   94  187:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   95  190:pop             
			((StringBuilder) (packagemanager)).append(s);
	//   96  191:aload_0         
	//   97  192:aload           5
	//   98  194:invokevirtual   #304 <Method StringBuilder StringBuilder.append(String)>
	//   99  197:pop             
			throw new android.content.pm.PackageManager.NameNotFoundException(((StringBuilder) (packagemanager)).toString());
	//  100  198:new             #116 <Class android.content.pm.PackageManager$NameNotFoundException>
	//  101  201:dup             
	//  102  202:aload_0         
	//  103  203:invokevirtual   #312 <Method String StringBuilder.toString()>
	//  104  206:invokespecial   #414 <Method void android.content.pm.PackageManager$NameNotFoundException(String)>
	//  105  209:athrow          
		}
	}

	public static Map prepareFontData(Context context, FontInfo afontinfo[], CancellationSignal cancellationsignal)
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #422 <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #423 <Method void HashMap()>
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
	//*  17   28:invokevirtual   #426 <Method int FontsContractCompat$FontInfo.getResultCode()>
	//*  18   31:ifeq            37
				continue;
	//   19   34:goto            72
			obj = ((Object) (((FontInfo) (obj)).getUri()));
	//   20   37:aload           6
	//   21   39:invokevirtual   #429 <Method Uri FontsContractCompat$FontInfo.getUri()>
	//   22   42:astore          6
			if(!hashmap.containsKey(obj))
	//*  23   44:aload           5
	//*  24   46:aload           6
	//*  25   48:invokevirtual   #430 <Method boolean HashMap.containsKey(Object)>
	//*  26   51:ifeq            57
	//*  27   54:goto            72
				hashmap.put(obj, ((Object) (TypefaceCompatUtil.mmap(context, cancellationsignal, ((Uri) (obj))))));
	//   28   57:aload           5
	//   29   59:aload           6
	//   30   61:aload_0         
	//   31   62:aload_2         
	//   32   63:aload           6
	//   33   65:invokestatic    #436 <Method java.nio.ByteBuffer TypefaceCompatUtil.mmap(Context, CancellationSignal, Uri)>
	//   34   68:invokevirtual   #437 <Method Object HashMap.put(Object, Object)>
	//   35   71:pop             
		}

	//   36   72:iload_3         
	//   37   73:iconst_1        
	//   38   74:iadd            
	//   39   75:istore_3        
	//*  40   76:goto            15
		return Collections.unmodifiableMap(((Map) (hashmap)));
	//   41   79:aload           5
	//   42   81:invokestatic    #441 <Method Map Collections.unmodifiableMap(Map)>
	//   43   84:areturn         
	}

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
	//    0    0:new             #46  <Class LruCache>
	//    1    3:dup             
	//    2    4:bipush          16
	//    3    6:invokespecial   #50  <Method void LruCache(int)>
	//    4    9:putstatic       #52  <Field LruCache sTypefaceCache>
	//    5   12:new             #54  <Class SelfDestructiveThread>
	//    6   15:dup             
	//    7   16:ldc1            #56  <String "fonts">
	//    8   18:bipush          10
	//    9   20:sipush          10000
	//   10   23:invokespecial   #59  <Method void SelfDestructiveThread(String, int, int)>
	//   11   26:putstatic       #61  <Field SelfDestructiveThread sBackgroundThread>
	//   12   29:new             #4   <Class Object>
	//   13   32:dup             
	//   14   33:invokespecial   #63  <Method void Object()>
	//   15   36:putstatic       #65  <Field Object sLock>
	//   16   39:new             #67  <Class SimpleArrayMap>
	//   17   42:dup             
	//   18   43:invokespecial   #68  <Method void SimpleArrayMap()>
	//   19   46:putstatic       #70  <Field SimpleArrayMap sPendingReplies>
	//   20   49:new             #12  <Class FontsContractCompat$5>
	//   21   52:dup             
	//   22   53:invokespecial   #71  <Method void FontsContractCompat$5()>
	//   23   56:putstatic       #73  <Field Comparator sByteArrayComparator>
	//*  24   59:return          
	}
}
