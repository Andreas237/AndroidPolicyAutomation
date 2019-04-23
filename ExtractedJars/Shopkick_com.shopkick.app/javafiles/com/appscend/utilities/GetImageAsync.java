// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import com.appscend.media.APSMediaPlayer;
import java.io.*;
import java.net.*;

public class GetImageAsync extends AsyncTask
{

	public GetImageAsync()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void AsyncTask()>
	//    2    4:return          
	}

	private static boolean assetExists(String s)
	{
		APSMediaPlayer.getInstance().getActivity().getAssets().open(s).close();
	//    0    0:invokestatic    #22  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    1    3:invokevirtual   #26  <Method Activity APSMediaPlayer.getActivity()>
	//    2    6:invokevirtual   #32  <Method AssetManager Activity.getAssets()>
	//    3    9:aload_0         
	//    4   10:invokevirtual   #38  <Method InputStream AssetManager.open(String)>
	//    5   13:invokevirtual   #43  <Method void InputStream.close()>
		return true;
	//    6   16:iconst_1        
	//    7   17:ireturn         
		s;
	//    8   18:astore_0        
		StringBuilder stringbuilder = new StringBuilder();
	//    9   19:new             #45  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #46  <Method void StringBuilder()>
	//   12   26:astore_1        
		stringbuilder.append("assetExists failed: ");
	//   13   27:aload_1         
	//   14   28:ldc1            #48  <String "assetExists failed: ">
	//   15   30:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
		stringbuilder.append(((IOException) (s)).toString());
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:invokevirtual   #56  <Method String IOException.toString()>
	//   20   39:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
		Log.w("IOUtilities", stringbuilder.toString());
	//   22   43:ldc1            #58  <String "IOUtilities">
	//   23   45:aload_1         
	//   24   46:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   25   49:invokestatic    #65  <Method int Log.w(String, String)>
	//   26   52:pop             
		break MISSING_BLOCK_LABEL_91;
	//   27   53:goto            91
		s;
	//   28   56:astore_0        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   29   57:new             #45  <Class StringBuilder>
	//   30   60:dup             
	//   31   61:invokespecial   #46  <Method void StringBuilder()>
	//   32   64:astore_1        
		stringbuilder1.append("assetExists failed: ");
	//   33   65:aload_1         
	//   34   66:ldc1            #48  <String "assetExists failed: ">
	//   35   68:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   36   71:pop             
		stringbuilder1.append(((FileNotFoundException) (s)).toString());
	//   37   72:aload_1         
	//   38   73:aload_0         
	//   39   74:invokevirtual   #66  <Method String FileNotFoundException.toString()>
	//   40   77:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
		Log.w("IOUtilities", stringbuilder1.toString());
	//   42   81:ldc1            #58  <String "IOUtilities">
	//   43   83:aload_1         
	//   44   84:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   45   87:invokestatic    #65  <Method int Log.w(String, String)>
	//   46   90:pop             
		return false;
	//   47   91:iconst_0        
	//   48   92:ireturn         
	}

	private static Bitmap getBitmapFromAssets(String s)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(!assetExists(s)) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:invokestatic    #74  <Method boolean assetExists(String)>
	//    4    6:ifeq            26
_L1:
		s = ((String) (APSMediaPlayer.getInstance().getActivity().getAssets().open(s)));
	//    5    9:invokestatic    #22  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//    6   12:invokevirtual   #26  <Method Activity APSMediaPlayer.getActivity()>
	//    7   15:invokevirtual   #32  <Method AssetManager Activity.getAssets()>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #38  <Method InputStream AssetManager.open(String)>
	//   10   22:astore_0        
		  goto _L3
	//*  11   23:goto            97
_L2:
		Object obj1;
		obj1 = ((Object) (new StringBuilder()));
	//   12   26:new             #45  <Class StringBuilder>
	//   13   29:dup             
	//   14   30:invokespecial   #46  <Method void StringBuilder()>
	//   15   33:astore_2        
		((StringBuilder) (obj1)).append("www/");
	//   16   34:aload_2         
	//   17   35:ldc1            #76  <String "www/">
	//   18   37:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
		((StringBuilder) (obj1)).append(s);
	//   20   41:aload_2         
	//   21   42:aload_0         
	//   22   43:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		if(!assetExists(((StringBuilder) (obj1)).toString())) goto _L5; else goto _L4
	//   24   47:aload_2         
	//   25   48:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   26   51:invokestatic    #74  <Method boolean assetExists(String)>
	//   27   54:ifeq            167
_L4:
		obj1 = ((Object) (APSMediaPlayer.getInstance().getActivity().getAssets()));
	//   28   57:invokestatic    #22  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   29   60:invokevirtual   #26  <Method Activity APSMediaPlayer.getActivity()>
	//   30   63:invokevirtual   #32  <Method AssetManager Activity.getAssets()>
	//   31   66:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   32   67:new             #45  <Class StringBuilder>
	//   33   70:dup             
	//   34   71:invokespecial   #46  <Method void StringBuilder()>
	//   35   74:astore_3        
		stringbuilder.append("www/");
	//   36   75:aload_3         
	//   37   76:ldc1            #76  <String "www/">
	//   38   78:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   39   81:pop             
		stringbuilder.append(s);
	//   40   82:aload_3         
	//   41   83:aload_0         
	//   42   84:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//   43   87:pop             
		s = ((String) (((AssetManager) (obj1)).open(stringbuilder.toString())));
	//   44   88:aload_2         
	//   45   89:aload_3         
	//   46   90:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   47   93:invokevirtual   #38  <Method InputStream AssetManager.open(String)>
	//   48   96:astore_0        
_L3:
		obj1 = ((Object) (new android.graphics.BitmapFactory.Options()));
	//   49   97:new             #78  <Class android.graphics.BitmapFactory$Options>
	//   50  100:dup             
	//   51  101:invokespecial   #79  <Method void android.graphics.BitmapFactory$Options()>
	//   52  104:astore_2        
		obj1.inDither = false;
	//   53  105:aload_2         
	//   54  106:iconst_0        
	//   55  107:putfield        #83  <Field boolean android.graphics.BitmapFactory$Options.inDither>
		obj1.inPurgeable = true;
	//   56  110:aload_2         
	//   57  111:iconst_1        
	//   58  112:putfield        #86  <Field boolean android.graphics.BitmapFactory$Options.inPurgeable>
		obj1.inInputShareable = true;
	//   59  115:aload_2         
	//   60  116:iconst_1        
	//   61  117:putfield        #89  <Field boolean android.graphics.BitmapFactory$Options.inInputShareable>
		obj1.inTempStorage = new byte[8192];
	//   62  120:aload_2         
	//   63  121:sipush          8192
	//   64  124:newarray        byte[]
	//   65  126:putfield        #93  <Field byte[] android.graphics.BitmapFactory$Options.inTempStorage>
		obj1 = ((Object) (BitmapFactory.decodeStream(((InputStream) (s)), ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (obj1)))));
	//   66  129:aload_0         
	//   67  130:aconst_null     
	//   68  131:aload_2         
	//   69  132:invokestatic    #99  <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   70  135:astore_2        
		if(s == null)
			break MISSING_BLOCK_LABEL_144;
	//   71  136:aload_0         
	//   72  137:ifnull          144
		((InputStream) (s)).close();
	//   73  140:aload_0         
	//   74  141:invokevirtual   #43  <Method void InputStream.close()>
		return ((Bitmap) (obj1));
	//   75  144:aload_2         
	//   76  145:areturn         
		obj;
	//   77  146:astore_1        
		if(s == null)
			break MISSING_BLOCK_LABEL_155;
	//   78  147:aload_0         
	//   79  148:ifnull          155
		((InputStream) (s)).close();
	//   80  151:aload_0         
	//   81  152:invokevirtual   #43  <Method void InputStream.close()>
		throw obj;
	//   82  155:aload_1         
	//   83  156:athrow          
_L9:
		if(s == null) goto _L7; else goto _L6
	//   84  157:aload_0         
	//   85  158:ifnull          183
_L6:
		((InputStream) (s)).close();
	//   86  161:aload_0         
	//   87  162:invokevirtual   #43  <Method void InputStream.close()>
		return null;
	//   88  165:aconst_null     
	//   89  166:areturn         
_L5:
		return null;
	//   90  167:aconst_null     
	//   91  168:areturn         
_L8:
		s = null;
	//   92  169:aconst_null     
	//   93  170:astore_0        
_L10:
		if(s != null)
	//*  94  171:aload_0         
	//*  95  172:ifnull          181
		{
			((Bitmap) (s)).recycle();
	//   96  175:aload_0         
	//   97  176:invokevirtual   #104 <Method void Bitmap.recycle()>
			return null;
	//   98  179:aconst_null     
	//   99  180:areturn         
		}
		obj = ((Object) (s));
	//  100  181:aload_0         
	//  101  182:astore_1        
_L7:
		return ((Bitmap) (obj));
	//  102  183:aload_1         
	//  103  184:areturn         
		s;
	//  104  185:astore_0        
		  goto _L8
	//* 105  186:goto            169
		obj1;
	//  106  189:astore_2        
		  goto _L9
	//* 107  190:goto            157
		s;
	//  108  193:astore_0        
		s = ((String) (obj1));
	//  109  194:aload_2         
	//  110  195:astore_0        
		  goto _L10
	//* 111  196:goto            171
	}

	protected transient Bitmap doInBackground(String as[])
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		Object obj1;
		if(!as[0].startsWith("http://") && !as[0].startsWith("https://"))
	//*   2    2:aload_1         
	//*   3    3:iconst_0        
	//*   4    4:aaload          
	//*   5    5:ldc1            #108 <String "http://">
	//*   6    7:invokevirtual   #113 <Method boolean String.startsWith(String)>
	//*   7   10:ifne            31
	//*   8   13:aload_1         
	//*   9   14:iconst_0        
	//*  10   15:aaload          
	//*  11   16:ldc1            #115 <String "https://">
	//*  12   18:invokevirtual   #113 <Method boolean String.startsWith(String)>
	//*  13   21:ifne            31
			return getBitmapFromAssets(as[0]);
	//   14   24:aload_1         
	//   15   25:iconst_0        
	//   16   26:aaload          
	//   17   27:invokestatic    #117 <Method Bitmap getBitmapFromAssets(String)>
	//   18   30:areturn         
		obj1 = ((Object) (new URL(as[0])));
	//   19   31:new             #119 <Class URL>
	//   20   34:dup             
	//   21   35:aload_1         
	//   22   36:iconst_0        
	//   23   37:aaload          
	//   24   38:invokespecial   #122 <Method void URL(String)>
	//   25   41:astore_3        
		as = ((String []) (new android.graphics.BitmapFactory.Options()));
	//   26   42:new             #78  <Class android.graphics.BitmapFactory$Options>
	//   27   45:dup             
	//   28   46:invokespecial   #79  <Method void android.graphics.BitmapFactory$Options()>
	//   29   49:astore_1        
		HttpURLConnection httpurlconnection = (HttpURLConnection)((URL) (obj1)).openConnection();
	//   30   50:aload_3         
	//   31   51:invokevirtual   #126 <Method URLConnection URL.openConnection()>
	//   32   54:checkcast       #128 <Class HttpURLConnection>
	//   33   57:astore          4
		((URLConnection) (httpurlconnection)).setDoInput(true);
	//   34   59:aload           4
	//   35   61:iconst_1        
	//   36   62:invokevirtual   #134 <Method void URLConnection.setDoInput(boolean)>
		((URLConnection) (httpurlconnection)).setConnectTimeout(5000);
	//   37   65:aload           4
	//   38   67:sipush          5000
	//   39   70:invokevirtual   #138 <Method void URLConnection.setConnectTimeout(int)>
		((URLConnection) (httpurlconnection)).setReadTimeout(20000);
	//   40   73:aload           4
	//   41   75:sipush          20000
	//   42   78:invokevirtual   #141 <Method void URLConnection.setReadTimeout(int)>
		((URLConnection) (httpurlconnection)).connect();
	//   43   81:aload           4
	//   44   83:invokevirtual   #144 <Method void URLConnection.connect()>
		((URLConnection) (httpurlconnection)).getInputStream();
	//   45   86:aload           4
	//   46   88:invokevirtual   #148 <Method InputStream URLConnection.getInputStream()>
	//   47   91:pop             
		obj1 = ((Object) ((HttpURLConnection)((URL) (obj1)).openConnection()));
	//   48   92:aload_3         
	//   49   93:invokevirtual   #126 <Method URLConnection URL.openConnection()>
	//   50   96:checkcast       #128 <Class HttpURLConnection>
	//   51   99:astore_3        
		((URLConnection) (obj1)).setDoInput(true);
	//   52  100:aload_3         
	//   53  101:iconst_1        
	//   54  102:invokevirtual   #134 <Method void URLConnection.setDoInput(boolean)>
		((URLConnection) (obj1)).setConnectTimeout(5000);
	//   55  105:aload_3         
	//   56  106:sipush          5000
	//   57  109:invokevirtual   #138 <Method void URLConnection.setConnectTimeout(int)>
		((URLConnection) (obj1)).setReadTimeout(20000);
	//   58  112:aload_3         
	//   59  113:sipush          20000
	//   60  116:invokevirtual   #141 <Method void URLConnection.setReadTimeout(int)>
		((URLConnection) (obj1)).connect();
	//   61  119:aload_3         
	//   62  120:invokevirtual   #144 <Method void URLConnection.connect()>
		obj1 = ((Object) (((URLConnection) (obj1)).getInputStream()));
	//   63  123:aload_3         
	//   64  124:invokevirtual   #148 <Method InputStream URLConnection.getInputStream()>
	//   65  127:astore_3        
		as.inDither = false;
	//   66  128:aload_1         
	//   67  129:iconst_0        
	//   68  130:putfield        #83  <Field boolean android.graphics.BitmapFactory$Options.inDither>
		as.inPurgeable = true;
	//   69  133:aload_1         
	//   70  134:iconst_1        
	//   71  135:putfield        #86  <Field boolean android.graphics.BitmapFactory$Options.inPurgeable>
		as.inInputShareable = true;
	//   72  138:aload_1         
	//   73  139:iconst_1        
	//   74  140:putfield        #89  <Field boolean android.graphics.BitmapFactory$Options.inInputShareable>
		as.inTempStorage = new byte[8192];
	//   75  143:aload_1         
	//   76  144:sipush          8192
	//   77  147:newarray        byte[]
	//   78  149:putfield        #93  <Field byte[] android.graphics.BitmapFactory$Options.inTempStorage>
		as = ((String []) (BitmapFactory.decodeStream(((InputStream) (obj1)), ((android.graphics.Rect) (null)), ((android.graphics.BitmapFactory.Options) (as)))));
	//   79  152:aload_3         
	//   80  153:aconst_null     
	//   81  154:aload_1         
	//   82  155:invokestatic    #99  <Method Bitmap BitmapFactory.decodeStream(InputStream, android.graphics.Rect, android.graphics.BitmapFactory$Options)>
	//   83  158:astore_1        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_167;
	//   84  159:aload_3         
	//   85  160:ifnull          167
		((InputStream) (obj1)).close();
	//   86  163:aload_3         
	//   87  164:invokevirtual   #43  <Method void InputStream.close()>
		return ((Bitmap) (as));
	//   88  167:aload_1         
	//   89  168:areturn         
		as;
	//   90  169:astore_1        
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_178;
	//   91  170:aload_3         
	//   92  171:ifnull          178
		((InputStream) (obj1)).close();
	//   93  174:aload_3         
	//   94  175:invokevirtual   #43  <Method void InputStream.close()>
		throw as;
	//   95  178:aload_1         
	//   96  179:athrow          
_L4:
		as = ((String []) (obj));
	//   97  180:aload_2         
	//   98  181:astore_1        
		if(obj1 == null) goto _L2; else goto _L1
	//   99  182:aload_3         
	//  100  183:ifnull          204
_L1:
		((InputStream) (obj1)).close();
	//  101  186:aload_3         
	//  102  187:invokevirtual   #43  <Method void InputStream.close()>
		return null;
	//  103  190:aconst_null     
	//  104  191:areturn         
_L3:
		as = null;
	//  105  192:aconst_null     
	//  106  193:astore_1        
_L5:
		if(as != null)
	//* 107  194:aload_1         
	//* 108  195:ifnull          204
		{
			((Bitmap) (as)).recycle();
	//  109  198:aload_1         
	//  110  199:invokevirtual   #104 <Method void Bitmap.recycle()>
			return null;
	//  111  202:aconst_null     
	//  112  203:areturn         
		}
_L2:
		return ((Bitmap) (as));
	//  113  204:aload_1         
	//  114  205:areturn         
		as;
	//  115  206:astore_1        
		  goto _L3
	//* 116  207:goto            192
		as;
	//  117  210:astore_1        
		  goto _L4
	//* 118  211:goto            180
		Exception exception;
		exception;
	//  119  214:astore_2        
		  goto _L5
	//* 120  215:goto            194
	}

	protected volatile Object doInBackground(Object aobj[])
	{
		return ((Object) (doInBackground((String[])aobj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #151 <Class String[]>
	//    3    5:invokevirtual   #153 <Method Bitmap doInBackground(String[])>
	//    4    8:areturn         
	}
}
