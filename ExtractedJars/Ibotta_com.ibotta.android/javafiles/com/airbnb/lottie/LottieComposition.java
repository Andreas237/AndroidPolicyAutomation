// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.support.v4.util.LongSparseArray;
import android.util.DisplayMetrics;
import com.newrelic.agent.android.instrumentation.AsyncTaskInstrumentation;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import org.json.*;

// Referenced classes of package com.airbnb.lottie:
//			Layer, FileCompositionLoader, Utils, JsonCompositionLoader, 
//			LottieImageAsset, OnCompositionLoadedListener, Cancellable

public class LottieComposition
{
	public static class Factory
	{

		private static void addLayer(List list, LongSparseArray longsparsearray, Layer layer)
		{
			list.add(((Object) (layer)));
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokeinterface #16  <Method boolean List.add(Object)>
		//    3    7:pop             
			longsparsearray.put(layer.getId(), ((Object) (layer)));
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:invokevirtual   #22  <Method long Layer.getId()>
		//    7   13:aload_2         
		//    8   14:invokevirtual   #28  <Method void LongSparseArray.put(long, Object)>
		//    9   17:return          
		}

		public static Cancellable fromAssetFileName(Context context, String s, OnCompositionLoadedListener oncompositionloadedlistener)
		{
			InputStream inputstream;
			try
			{
				inputstream = context.getAssets().open(s);
		//    0    0:aload_0         
		//    1    1:invokevirtual   #41  <Method AssetManager Context.getAssets()>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #47  <Method InputStream AssetManager.open(String)>
		//    4    8:astore_3        
			}
		//*   5    9:aload_0         
		//*   6   10:aload_3         
		//*   7   11:aload_2         
		//*   8   12:invokestatic    #51  <Method Cancellable fromInputStream(Context, InputStream, OnCompositionLoadedListener)>
		//*   9   15:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
		//*  10   16:astore_0        
			{
				oncompositionloadedlistener = ((OnCompositionLoadedListener) (new StringBuilder()));
		//   11   17:new             #53  <Class StringBuilder>
		//   12   20:dup             
		//   13   21:invokespecial   #57  <Method void StringBuilder()>
		//   14   24:astore_2        
				((StringBuilder) (oncompositionloadedlistener)).append("Unable to find file ");
		//   15   25:aload_2         
		//   16   26:ldc1            #59  <String "Unable to find file ">
		//   17   28:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
		//   18   31:pop             
				((StringBuilder) (oncompositionloadedlistener)).append(s);
		//   19   32:aload_2         
		//   20   33:aload_1         
		//   21   34:invokevirtual   #63  <Method StringBuilder StringBuilder.append(String)>
		//   22   37:pop             
				throw new IllegalStateException(((StringBuilder) (oncompositionloadedlistener)).toString(), ((Throwable) (context)));
		//   23   38:new             #65  <Class IllegalStateException>
		//   24   41:dup             
		//   25   42:aload_2         
		//   26   43:invokevirtual   #69  <Method String StringBuilder.toString()>
		//   27   46:aload_0         
		//   28   47:invokespecial   #72  <Method void IllegalStateException(String, Throwable)>
		//   29   50:athrow          
			}
			return fromInputStream(context, inputstream, oncompositionloadedlistener);
		}

		public static Cancellable fromInputStream(Context context, InputStream inputstream, OnCompositionLoadedListener oncompositionloadedlistener)
		{
			context = ((Context) (new FileCompositionLoader(context.getResources(), oncompositionloadedlistener)));
		//    0    0:new             #74  <Class FileCompositionLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokevirtual   #78  <Method Resources Context.getResources()>
		//    4    8:aload_2         
		//    5    9:invokespecial   #81  <Method void FileCompositionLoader(Resources, OnCompositionLoadedListener)>
		//    6   12:astore_0        
			oncompositionloadedlistener = ((OnCompositionLoadedListener) (AsyncTask.THREAD_POOL_EXECUTOR));
		//    7   13:getstatic       #87  <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
		//    8   16:astore_2        
			InputStream ainputstream[] = new InputStream[1];
		//    9   17:iconst_1        
		//   10   18:anewarray       InputStream[]
		//   11   21:astore_3        
			ainputstream[0] = inputstream;
		//   12   22:aload_3         
		//   13   23:iconst_0        
		//   14   24:aload_1         
		//   15   25:aastore         
			if(!(context instanceof AsyncTask))
		//*  16   26:aload_0         
		//*  17   27:instanceof      #83  <Class AsyncTask>
		//*  18   30:ifne            42
			{
				((FileCompositionLoader) (context)).executeOnExecutor(((java.util.concurrent.Executor) (oncompositionloadedlistener)), ((Object []) (ainputstream)));
		//   19   33:aload_0         
		//   20   34:aload_2         
		//   21   35:aload_3         
		//   22   36:invokevirtual   #93  <Method AsyncTask FileCompositionLoader.executeOnExecutor(java.util.concurrent.Executor, Object[])>
		//   23   39:pop             
				return ((Cancellable) (context));
		//   24   40:aload_0         
		//   25   41:areturn         
			} else
			{
				AsyncTaskInstrumentation.executeOnExecutor((AsyncTask)context, ((java.util.concurrent.Executor) (oncompositionloadedlistener)), ((Object []) (ainputstream)));
		//   26   42:aload_0         
		//   27   43:checkcast       #83  <Class AsyncTask>
		//   28   46:aload_2         
		//   29   47:aload_3         
		//   30   48:invokestatic    #98  <Method AsyncTask AsyncTaskInstrumentation.executeOnExecutor(AsyncTask, java.util.concurrent.Executor, Object[])>
		//   31   51:pop             
				return ((Cancellable) (context));
		//   32   52:aload_0         
		//   33   53:areturn         
			}
		}

		static LottieComposition fromInputStream(Resources resources, InputStream inputstream)
		{
			byte abyte0[] = new byte[inputstream.available()];
		//    0    0:aload_1         
		//    1    1:invokevirtual   #105 <Method int InputStream.available()>
		//    2    4:newarray        byte[]
		//    3    6:astore_2        
			inputstream.read(abyte0);
		//    4    7:aload_1         
		//    5    8:aload_2         
		//    6    9:invokevirtual   #109 <Method int InputStream.read(byte[])>
		//    7   12:pop             
			resources = ((Resources) (fromJsonSync(resources, JSONObjectInstrumentation.init(new String(abyte0, "UTF-8")))));
		//    8   13:aload_0         
		//    9   14:new             #111 <Class String>
		//   10   17:dup             
		//   11   18:aload_2         
		//   12   19:ldc1            #113 <String "UTF-8">
		//   13   21:invokespecial   #116 <Method void String(byte[], String)>
		//   14   24:invokestatic    #122 <Method JSONObject JSONObjectInstrumentation.init(String)>
		//   15   27:invokestatic    #126 <Method LottieComposition fromJsonSync(Resources, JSONObject)>
		//   16   30:astore_0        
			Utils.closeQuietly(((java.io.Closeable) (inputstream)));
		//   17   31:aload_1         
		//   18   32:invokestatic    #132 <Method void Utils.closeQuietly(java.io.Closeable)>
			return ((LottieComposition) (resources));
		//   19   35:aload_0         
		//   20   36:areturn         
			resources;
		//   21   37:astore_0        
			break MISSING_BLOCK_LABEL_65;
		//   22   38:goto            65
			resources;
		//   23   41:astore_0        
			throw new IllegalStateException("Unable to load JSON.", ((Throwable) (resources)));
		//   24   42:new             #65  <Class IllegalStateException>
		//   25   45:dup             
		//   26   46:ldc1            #134 <String "Unable to load JSON.">
		//   27   48:aload_0         
		//   28   49:invokespecial   #72  <Method void IllegalStateException(String, Throwable)>
		//   29   52:athrow          
			resources;
		//   30   53:astore_0        
			throw new IllegalStateException("Unable to find file.", ((Throwable) (resources)));
		//   31   54:new             #65  <Class IllegalStateException>
		//   32   57:dup             
		//   33   58:ldc1            #136 <String "Unable to find file.">
		//   34   60:aload_0         
		//   35   61:invokespecial   #72  <Method void IllegalStateException(String, Throwable)>
		//   36   64:athrow          
			Utils.closeQuietly(((java.io.Closeable) (inputstream)));
		//   37   65:aload_1         
		//   38   66:invokestatic    #132 <Method void Utils.closeQuietly(java.io.Closeable)>
			throw resources;
		//   39   69:aload_0         
		//   40   70:athrow          
		}

		public static Cancellable fromJson(Resources resources, JSONObject jsonobject, OnCompositionLoadedListener oncompositionloadedlistener)
		{
			resources = ((Resources) (new JsonCompositionLoader(resources, oncompositionloadedlistener)));
		//    0    0:new             #140 <Class JsonCompositionLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_2         
		//    4    6:invokespecial   #141 <Method void JsonCompositionLoader(Resources, OnCompositionLoadedListener)>
		//    5    9:astore_0        
			oncompositionloadedlistener = ((OnCompositionLoadedListener) (AsyncTask.THREAD_POOL_EXECUTOR));
		//    6   10:getstatic       #87  <Field java.util.concurrent.Executor AsyncTask.THREAD_POOL_EXECUTOR>
		//    7   13:astore_2        
			JSONObject ajsonobject[] = new JSONObject[1];
		//    8   14:iconst_1        
		//    9   15:anewarray       JSONObject[]
		//   10   18:astore_3        
			ajsonobject[0] = jsonobject;
		//   11   19:aload_3         
		//   12   20:iconst_0        
		//   13   21:aload_1         
		//   14   22:aastore         
			if(!(resources instanceof AsyncTask))
		//*  15   23:aload_0         
		//*  16   24:instanceof      #83  <Class AsyncTask>
		//*  17   27:ifne            39
			{
				((JsonCompositionLoader) (resources)).executeOnExecutor(((java.util.concurrent.Executor) (oncompositionloadedlistener)), ((Object []) (ajsonobject)));
		//   18   30:aload_0         
		//   19   31:aload_2         
		//   20   32:aload_3         
		//   21   33:invokevirtual   #144 <Method AsyncTask JsonCompositionLoader.executeOnExecutor(java.util.concurrent.Executor, Object[])>
		//   22   36:pop             
				return ((Cancellable) (resources));
		//   23   37:aload_0         
		//   24   38:areturn         
			} else
			{
				AsyncTaskInstrumentation.executeOnExecutor((AsyncTask)resources, ((java.util.concurrent.Executor) (oncompositionloadedlistener)), ((Object []) (ajsonobject)));
		//   25   39:aload_0         
		//   26   40:checkcast       #83  <Class AsyncTask>
		//   27   43:aload_2         
		//   28   44:aload_3         
		//   29   45:invokestatic    #98  <Method AsyncTask AsyncTaskInstrumentation.executeOnExecutor(AsyncTask, java.util.concurrent.Executor, Object[])>
		//   30   48:pop             
				return ((Cancellable) (resources));
		//   31   49:aload_0         
		//   32   50:areturn         
			}
		}

		static LottieComposition fromJsonSync(Resources resources, JSONObject jsonobject)
		{
			float f = resources.getDisplayMetrics().density;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #150 <Method DisplayMetrics Resources.getDisplayMetrics()>
		//    2    4:getfield        #156 <Field float DisplayMetrics.density>
		//    3    7:fstore_2        
			int i = jsonobject.optInt("w", -1);
		//    4    8:aload_1         
		//    5    9:ldc1            #158 <String "w">
		//    6   11:iconst_m1       
		//    7   12:invokevirtual   #162 <Method int JSONObject.optInt(String, int)>
		//    8   15:istore_3        
			int j = jsonobject.optInt("h", -1);
		//    9   16:aload_1         
		//   10   17:ldc1            #164 <String "h">
		//   11   19:iconst_m1       
		//   12   20:invokevirtual   #162 <Method int JSONObject.optInt(String, int)>
		//   13   23:istore          4
			if(i != -1 && j != -1)
		//*  14   25:iload_3         
		//*  15   26:iconst_m1       
		//*  16   27:icmpeq          60
		//*  17   30:iload           4
		//*  18   32:iconst_m1       
		//*  19   33:icmpeq          60
				resources = ((Resources) (new Rect(0, 0, (int)((float)i * f), (int)((float)j * f))));
		//   20   36:new             #166 <Class Rect>
		//   21   39:dup             
		//   22   40:iconst_0        
		//   23   41:iconst_0        
		//   24   42:iload_3         
		//   25   43:i2f             
		//   26   44:fload_2         
		//   27   45:fmul            
		//   28   46:f2i             
		//   29   47:iload           4
		//   30   49:i2f             
		//   31   50:fload_2         
		//   32   51:fmul            
		//   33   52:f2i             
		//   34   53:invokespecial   #169 <Method void Rect(int, int, int, int)>
		//   35   56:astore_0        
			else
		//*  36   57:goto            62
				resources = null;
		//   37   60:aconst_null     
		//   38   61:astore_0        
			resources = ((Resources) (new LottieComposition(((Rect) (resources)), jsonobject.optLong("ip", 0L), jsonobject.optLong("op", 0L), jsonobject.optInt("fr", 0), f)));
		//   39   62:new             #6   <Class LottieComposition>
		//   40   65:dup             
		//   41   66:aload_0         
		//   42   67:aload_1         
		//   43   68:ldc1            #171 <String "ip">
		//   44   70:lconst_0        
		//   45   71:invokevirtual   #175 <Method long JSONObject.optLong(String, long)>
		//   46   74:aload_1         
		//   47   75:ldc1            #177 <String "op">
		//   48   77:lconst_0        
		//   49   78:invokevirtual   #175 <Method long JSONObject.optLong(String, long)>
		//   50   81:aload_1         
		//   51   82:ldc1            #179 <String "fr">
		//   52   84:iconst_0        
		//   53   85:invokevirtual   #162 <Method int JSONObject.optInt(String, int)>
		//   54   88:fload_2         
		//   55   89:aconst_null     
		//   56   90:invokespecial   #182 <Method void LottieComposition(Rect, long, long, int, float, LottieComposition$1)>
		//   57   93:astore_0        
			JSONArray jsonarray = jsonobject.optJSONArray("assets");
		//   58   94:aload_1         
		//   59   95:ldc1            #184 <String "assets">
		//   60   97:invokevirtual   #188 <Method JSONArray JSONObject.optJSONArray(String)>
		//   61  100:astore          5
			parseImages(jsonarray, ((LottieComposition) (resources)));
		//   62  102:aload           5
		//   63  104:aload_0         
		//   64  105:invokestatic    #192 <Method void parseImages(JSONArray, LottieComposition)>
			parsePrecomps(jsonarray, ((LottieComposition) (resources)));
		//   65  108:aload           5
		//   66  110:aload_0         
		//   67  111:invokestatic    #195 <Method void parsePrecomps(JSONArray, LottieComposition)>
			parseLayers(jsonobject, ((LottieComposition) (resources)));
		//   68  114:aload_1         
		//   69  115:aload_0         
		//   70  116:invokestatic    #199 <Method void parseLayers(JSONObject, LottieComposition)>
			return ((LottieComposition) (resources));
		//   71  119:aload_0         
		//   72  120:areturn         
		}

		private static void parseImages(JSONArray jsonarray, LottieComposition lottiecomposition)
		{
			if(jsonarray == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			int j = jsonarray.length();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #205 <Method int JSONArray.length()>
		//    5    9:istore_3        
			for(int i = 0; i < j; i++)
		//*   6   10:iconst_0        
		//*   7   11:istore_2        
		//*   8   12:iload_2         
		//*   9   13:iload_3         
		//*  10   14:icmpge          68
			{
				Object obj = ((Object) (jsonarray.optJSONObject(i)));
		//   11   17:aload_0         
		//   12   18:iload_2         
		//   13   19:invokevirtual   #209 <Method JSONObject JSONArray.optJSONObject(int)>
		//   14   22:astore          4
				if(((JSONObject) (obj)).has("p"))
		//*  15   24:aload           4
		//*  16   26:ldc1            #211 <String "p">
		//*  17   28:invokevirtual   #215 <Method boolean JSONObject.has(String)>
		//*  18   31:ifne            37
		//*  19   34:goto            61
				{
					obj = ((Object) (LottieImageAsset.Factory.newInstance(((JSONObject) (obj)))));
		//   20   37:aload           4
		//   21   39:invokestatic    #221 <Method LottieImageAsset LottieImageAsset$Factory.newInstance(JSONObject)>
		//   22   42:astore          4
					lottiecomposition.images.put(((Object) (((LottieImageAsset) (obj)).getId())), obj);
		//   23   44:aload_1         
		//   24   45:invokestatic    #225 <Method Map LottieComposition.access$400(LottieComposition)>
		//   25   48:aload           4
		//   26   50:invokevirtual   #229 <Method String LottieImageAsset.getId()>
		//   27   53:aload           4
		//   28   55:invokeinterface #234 <Method Object Map.put(Object, Object)>
		//   29   60:pop             
				}
			}

		//   30   61:iload_2         
		//   31   62:iconst_1        
		//   32   63:iadd            
		//   33   64:istore_2        
		//*  34   65:goto            12
		//   35   68:return          
		}

		private static void parseLayers(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			jsonobject = ((JSONObject) (jsonobject.optJSONArray("layers")));
		//    0    0:aload_0         
		//    1    1:ldc1            #237 <String "layers">
		//    2    3:invokevirtual   #188 <Method JSONArray JSONObject.optJSONArray(String)>
		//    3    6:astore_0        
			int j = ((JSONArray) (jsonobject)).length();
		//    4    7:aload_0         
		//    5    8:invokevirtual   #205 <Method int JSONArray.length()>
		//    6   11:istore_3        
			for(int i = 0; i < j; i++)
		//*   7   12:iconst_0        
		//*   8   13:istore_2        
		//*   9   14:iload_2         
		//*  10   15:iload_3         
		//*  11   16:icmpge          50
			{
				Layer layer = Layer.Factory.newInstance(((JSONArray) (jsonobject)).optJSONObject(i), lottiecomposition);
		//   12   19:aload_0         
		//   13   20:iload_2         
		//   14   21:invokevirtual   #209 <Method JSONObject JSONArray.optJSONObject(int)>
		//   15   24:aload_1         
		//   16   25:invokestatic    #242 <Method Layer Layer$Factory.newInstance(JSONObject, LottieComposition)>
		//   17   28:astore          4
				addLayer(lottiecomposition.layers, lottiecomposition.layerMap, layer);
		//   18   30:aload_1         
		//   19   31:invokestatic    #246 <Method List LottieComposition.access$100(LottieComposition)>
		//   20   34:aload_1         
		//   21   35:invokestatic    #250 <Method LongSparseArray LottieComposition.access$200(LottieComposition)>
		//   22   38:aload           4
		//   23   40:invokestatic    #252 <Method void addLayer(List, LongSparseArray, Layer)>
			}

		//   24   43:iload_2         
		//   25   44:iconst_1        
		//   26   45:iadd            
		//   27   46:istore_2        
		//*  28   47:goto            14
		//   29   50:return          
		}

		private static void parsePrecomps(JSONArray jsonarray, LottieComposition lottiecomposition)
		{
			if(jsonarray == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       5
				return;
		//    2    4:return          
			int k = jsonarray.length();
		//    3    5:aload_0         
		//    4    6:invokevirtual   #205 <Method int JSONArray.length()>
		//    5    9:istore          4
			for(int i = 0; i < k; i++)
		//*   6   11:iconst_0        
		//*   7   12:istore_2        
		//*   8   13:iload_2         
		//*   9   14:iload           4
		//*  10   16:icmpge          149
			{
				Object obj = ((Object) (jsonarray.optJSONObject(i)));
		//   11   19:aload_0         
		//   12   20:iload_2         
		//   13   21:invokevirtual   #209 <Method JSONObject JSONArray.optJSONObject(int)>
		//   14   24:astore          6
				JSONArray jsonarray1 = ((JSONObject) (obj)).optJSONArray("layers");
		//   15   26:aload           6
		//   16   28:ldc1            #237 <String "layers">
		//   17   30:invokevirtual   #188 <Method JSONArray JSONObject.optJSONArray(String)>
		//   18   33:astore          7
				if(jsonarray1 == null)
		//*  19   35:aload           7
		//*  20   37:ifnonnull       43
					continue;
		//   21   40:goto            142
				ArrayList arraylist = new ArrayList(jsonarray1.length());
		//   22   43:new             #254 <Class ArrayList>
		//   23   46:dup             
		//   24   47:aload           7
		//   25   49:invokevirtual   #205 <Method int JSONArray.length()>
		//   26   52:invokespecial   #257 <Method void ArrayList(int)>
		//   27   55:astore          5
				LongSparseArray longsparsearray = new LongSparseArray();
		//   28   57:new             #24  <Class LongSparseArray>
		//   29   60:dup             
		//   30   61:invokespecial   #258 <Method void LongSparseArray()>
		//   31   64:astore          8
				for(int j = 0; j < jsonarray1.length(); j++)
		//*  32   66:iconst_0        
		//*  33   67:istore_3        
		//*  34   68:iload_3         
		//*  35   69:aload           7
		//*  36   71:invokevirtual   #205 <Method int JSONArray.length()>
		//*  37   74:icmpge          118
				{
					Layer layer = Layer.Factory.newInstance(jsonarray1.optJSONObject(j), lottiecomposition);
		//   38   77:aload           7
		//   39   79:iload_3         
		//   40   80:invokevirtual   #209 <Method JSONObject JSONArray.optJSONObject(int)>
		//   41   83:aload_1         
		//   42   84:invokestatic    #242 <Method Layer Layer$Factory.newInstance(JSONObject, LottieComposition)>
		//   43   87:astore          9
					longsparsearray.put(layer.getId(), ((Object) (layer)));
		//   44   89:aload           8
		//   45   91:aload           9
		//   46   93:invokevirtual   #22  <Method long Layer.getId()>
		//   47   96:aload           9
		//   48   98:invokevirtual   #28  <Method void LongSparseArray.put(long, Object)>
					((List) (arraylist)).add(((Object) (layer)));
		//   49  101:aload           5
		//   50  103:aload           9
		//   51  105:invokeinterface #16  <Method boolean List.add(Object)>
		//   52  110:pop             
				}

		//   53  111:iload_3         
		//   54  112:iconst_1        
		//   55  113:iadd            
		//   56  114:istore_3        
		//*  57  115:goto            68
				obj = ((Object) (((JSONObject) (obj)).optString("id")));
		//   58  118:aload           6
		//   59  120:ldc2            #260 <String "id">
		//   60  123:invokevirtual   #264 <Method String JSONObject.optString(String)>
		//   61  126:astore          6
				lottiecomposition.precomps.put(obj, ((Object) (arraylist)));
		//   62  128:aload_1         
		//   63  129:invokestatic    #267 <Method Map LottieComposition.access$300(LottieComposition)>
		//   64  132:aload           6
		//   65  134:aload           5
		//   66  136:invokeinterface #234 <Method Object Map.put(Object, Object)>
		//   67  141:pop             
			}

		//   68  142:iload_2         
		//   69  143:iconst_1        
		//   70  144:iadd            
		//   71  145:istore_2        
		//*  72  146:goto            13
		//   73  149:return          
		}
	}


	private LottieComposition(Rect rect, long l, long l1, int i, float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void Object()>
		precomps = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #36  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void HashMap()>
	//    6   12:putfield        #39  <Field Map precomps>
		images = ((Map) (new HashMap()));
	//    7   15:aload_0         
	//    8   16:new             #36  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void HashMap()>
	//   11   23:putfield        #41  <Field Map images>
		layerMap = new LongSparseArray();
	//   12   26:aload_0         
	//   13   27:new             #43  <Class LongSparseArray>
	//   14   30:dup             
	//   15   31:invokespecial   #44  <Method void LongSparseArray()>
	//   16   34:putfield        #46  <Field LongSparseArray layerMap>
		layers = ((List) (new ArrayList()));
	//   17   37:aload_0         
	//   18   38:new             #48  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #49  <Method void ArrayList()>
	//   21   45:putfield        #51  <Field List layers>
		bounds = rect;
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:putfield        #53  <Field Rect bounds>
		startFrame = l;
	//   25   53:aload_0         
	//   26   54:lload_2         
	//   27   55:putfield        #55  <Field long startFrame>
		endFrame = l1;
	//   28   58:aload_0         
	//   29   59:lload           4
	//   30   61:putfield        #57  <Field long endFrame>
		frameRate = i;
	//   31   64:aload_0         
	//   32   65:iload           6
	//   33   67:putfield        #59  <Field int frameRate>
		dpScale = f;
	//   34   70:aload_0         
	//   35   71:fload           7
	//   36   73:putfield        #61  <Field float dpScale>
	//   37   76:return          
	}

	LottieComposition(Rect rect, long l, long l1, int i, float f, 
			_cls1 _pcls1)
	{
		this(rect, l, l1, i, f);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:iload           6
	//    5    7:fload           7
	//    6    9:invokespecial   #65  <Method void LottieComposition(Rect, long, long, int, float)>
	//    7   12:return          
	}

	public Rect getBounds()
	{
		return bounds;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Rect bounds>
	//    2    4:areturn         
	}

	public float getDpScale()
	{
		return dpScale;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field float dpScale>
	//    2    4:freturn         
	}

	public long getDuration()
	{
		return (long)(((float)(endFrame - startFrame) / (float)frameRate) * 1000F);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field long endFrame>
	//    2    4:aload_0         
	//    3    5:getfield        #55  <Field long startFrame>
	//    4    8:lsub            
	//    5    9:l2f             
	//    6   10:aload_0         
	//    7   11:getfield        #59  <Field int frameRate>
	//    8   14:i2f             
	//    9   15:fdiv            
	//   10   16:ldc1            #79  <Float 1000F>
	//   11   18:fmul            
	//   12   19:f2l             
	//   13   20:lreturn         
	}

	float getDurationFrames()
	{
		return ((float)getDuration() * (float)frameRate) / 1000F;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method long getDuration()>
	//    2    4:l2f             
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field int frameRate>
	//    5    9:i2f             
	//    6   10:fmul            
	//    7   11:ldc1            #79  <Float 1000F>
	//    8   13:fdiv            
	//    9   14:freturn         
	}

	long getEndFrame()
	{
		return endFrame;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field long endFrame>
	//    2    4:lreturn         
	}

	Map getImages()
	{
		return images;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Map images>
	//    2    4:areturn         
	}

	List getLayers()
	{
		return layers;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field List layers>
	//    2    4:areturn         
	}

	List getPrecomps(String s)
	{
		return (List)precomps.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Map precomps>
	//    2    4:aload_1         
	//    3    5:invokeinterface #99  <Method Object Map.get(Object)>
	//    4   10:checkcast       #101 <Class List>
	//    5   13:areturn         
	}

	Layer layerModelForId(long l)
	{
		return (Layer)layerMap.get(l);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field LongSparseArray layerMap>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #108 <Method Object LongSparseArray.get(long)>
	//    4    8:checkcast       #110 <Class Layer>
	//    5   11:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("LottieComposition:\n");
	//    0    0:new             #114 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #116 <String "LottieComposition:\n">
	//    3    6:invokespecial   #119 <Method void StringBuilder(String)>
	//    4    9:astore_1        
		for(Iterator iterator = layers.iterator(); iterator.hasNext(); stringbuilder.append(((Layer)iterator.next()).toString("\t")));
	//    5   10:aload_0         
	//    6   11:getfield        #51  <Field List layers>
	//    7   14:invokeinterface #123 <Method Iterator List.iterator()>
	//    8   19:astore_2        
	//    9   20:aload_2         
	//   10   21:invokeinterface #129 <Method boolean Iterator.hasNext()>
	//   11   26:ifeq            51
	//   12   29:aload_1         
	//   13   30:aload_2         
	//   14   31:invokeinterface #133 <Method Object Iterator.next()>
	//   15   36:checkcast       #110 <Class Layer>
	//   16   39:ldc1            #135 <String "\t">
	//   17   41:invokevirtual   #138 <Method String Layer.toString(String)>
	//   18   44:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   19   47:pop             
	//*  20   48:goto            20
		return stringbuilder.toString();
	//   21   51:aload_1         
	//   22   52:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   23   55:areturn         
	}

	private final Rect bounds;
	private final float dpScale;
	private final long endFrame;
	private final int frameRate;
	private final Map images;
	private final LongSparseArray layerMap;
	private final List layers;
	private final Map precomps;
	private final long startFrame;


/*
	static List access$100(LottieComposition lottiecomposition)
	{
		return lottiecomposition.layers;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field List layers>
	//    2    4:areturn         
	}

*/


/*
	static LongSparseArray access$200(LottieComposition lottiecomposition)
	{
		return lottiecomposition.layerMap;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field LongSparseArray layerMap>
	//    2    4:areturn         
	}

*/


/*
	static Map access$300(LottieComposition lottiecomposition)
	{
		return lottiecomposition.precomps;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Map precomps>
	//    2    4:areturn         
	}

*/


/*
	static Map access$400(LottieComposition lottiecomposition)
	{
		return lottiecomposition.images;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Map images>
	//    2    4:areturn         
	}

*/
}
