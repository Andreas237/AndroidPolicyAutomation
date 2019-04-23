// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.appscend.media.events.APSMediaOverlay;
import com.appscend.media.events.APSMediaUnit;
import com.appscend.media.events.APSVastAdBreak;
import com.appscend.utilities.GetImageAsync;
import com.appscend.utilities.VPUtilities;
import com.appscend.vast.APSVASTRootNode;
import com.appscend.vast.APSVASTXMLNode;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.squareup.okhttp.*;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.util.*;
import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

// Referenced classes of package com.appscend.media:
//			APSMediaPlayer

public class APSMediaBuilder
{
	public static final class APSResolvMultipleAdsConflictsBy extends Enum
	{

		public static APSResolvMultipleAdsConflictsBy valueOf(String s)
		{
			return (APSResolvMultipleAdsConflictsBy)Enum.valueOf(com/appscend/media/APSMediaBuilder$APSResolvMultipleAdsConflictsBy, s);
		//    0    0:ldc1            #2   <Class APSMediaBuilder$APSResolvMultipleAdsConflictsBy>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSMediaBuilder$APSResolvMultipleAdsConflictsBy>
		//    4    9:areturn         
		}

		public static APSResolvMultipleAdsConflictsBy[] values()
		{
			return (APSResolvMultipleAdsConflictsBy[])((APSResolvMultipleAdsConflictsBy []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field APSMediaBuilder$APSResolvMultipleAdsConflictsBy[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.media.APSMediaBuilder$APSResolvMultipleAdsConflictsBy_3B_.clone()>
		//    2    6:checkcast       #42  <Class APSMediaBuilder$APSResolvMultipleAdsConflictsBy[]>
		//    3    9:areturn         
		}

		private static final APSResolvMultipleAdsConflictsBy $VALUES[];
		public static final APSResolvMultipleAdsConflictsBy APSResolvMultipleAdsConflictsByDropping;
		public static final APSResolvMultipleAdsConflictsBy APSResolvMultipleAdsConflictsBySelectingFirst;
		public static final APSResolvMultipleAdsConflictsBy APSResolvMultipleAdsConflictsBySelectingRandom;

		static 
		{
			APSResolvMultipleAdsConflictsByDropping = new APSResolvMultipleAdsConflictsBy("APSResolvMultipleAdsConflictsByDropping", 0);
		//    0    0:new             #2   <Class APSMediaBuilder$APSResolvMultipleAdsConflictsBy>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "APSResolvMultipleAdsConflictsByDropping">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void APSMediaBuilder$APSResolvMultipleAdsConflictsBy(String, int)>
		//    5   10:putstatic       #23  <Field APSMediaBuilder$APSResolvMultipleAdsConflictsBy APSResolvMultipleAdsConflictsByDropping>
			APSResolvMultipleAdsConflictsBySelectingFirst = new APSResolvMultipleAdsConflictsBy("APSResolvMultipleAdsConflictsBySelectingFirst", 1);
		//    6   13:new             #2   <Class APSMediaBuilder$APSResolvMultipleAdsConflictsBy>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "APSResolvMultipleAdsConflictsBySelectingFirst">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void APSMediaBuilder$APSResolvMultipleAdsConflictsBy(String, int)>
		//   11   23:putstatic       #26  <Field APSMediaBuilder$APSResolvMultipleAdsConflictsBy APSResolvMultipleAdsConflictsBySelectingFirst>
			APSResolvMultipleAdsConflictsBySelectingRandom = new APSResolvMultipleAdsConflictsBy("APSResolvMultipleAdsConflictsBySelectingRandom", 2);
		//   12   26:new             #2   <Class APSMediaBuilder$APSResolvMultipleAdsConflictsBy>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "APSResolvMultipleAdsConflictsBySelectingRandom">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void APSMediaBuilder$APSResolvMultipleAdsConflictsBy(String, int)>
		//   17   36:putstatic       #29  <Field APSMediaBuilder$APSResolvMultipleAdsConflictsBy APSResolvMultipleAdsConflictsBySelectingRandom>
			$VALUES = (new APSResolvMultipleAdsConflictsBy[] {
				APSResolvMultipleAdsConflictsByDropping, APSResolvMultipleAdsConflictsBySelectingFirst, APSResolvMultipleAdsConflictsBySelectingRandom
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       APSResolvMultipleAdsConflictsBy[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field APSMediaBuilder$APSResolvMultipleAdsConflictsBy APSResolvMultipleAdsConflictsByDropping>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field APSMediaBuilder$APSResolvMultipleAdsConflictsBy APSResolvMultipleAdsConflictsBySelectingFirst>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field APSMediaBuilder$APSResolvMultipleAdsConflictsBy APSResolvMultipleAdsConflictsBySelectingRandom>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field APSMediaBuilder$APSResolvMultipleAdsConflictsBy[] $VALUES>
		//*  33   64:return          
		}

		private APSResolvMultipleAdsConflictsBy(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class APSWebviewDismissedAction extends Enum
	{

		public static APSWebviewDismissedAction valueOf(String s)
		{
			return (APSWebviewDismissedAction)Enum.valueOf(com/appscend/media/APSMediaBuilder$APSWebviewDismissedAction, s);
		//    0    0:ldc1            #2   <Class APSMediaBuilder$APSWebviewDismissedAction>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSMediaBuilder$APSWebviewDismissedAction>
		//    4    9:areturn         
		}

		public static APSWebviewDismissedAction[] values()
		{
			return (APSWebviewDismissedAction[])((APSWebviewDismissedAction []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field APSMediaBuilder$APSWebviewDismissedAction[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.media.APSMediaBuilder$APSWebviewDismissedAction_3B_.clone()>
		//    2    6:checkcast       #42  <Class APSMediaBuilder$APSWebviewDismissedAction[]>
		//    3    9:areturn         
		}

		private static final APSWebviewDismissedAction $VALUES[];
		public static final APSWebviewDismissedAction APSDoNothingOnWebviewDismiss;
		public static final APSWebviewDismissedAction APSHideOverlayOnWebviewDismiss;
		public static final APSWebviewDismissedAction APSSkipUnitOnWebviewDismiss;

		static 
		{
			APSHideOverlayOnWebviewDismiss = new APSWebviewDismissedAction("APSHideOverlayOnWebviewDismiss", 0);
		//    0    0:new             #2   <Class APSMediaBuilder$APSWebviewDismissedAction>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "APSHideOverlayOnWebviewDismiss">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void APSMediaBuilder$APSWebviewDismissedAction(String, int)>
		//    5   10:putstatic       #23  <Field APSMediaBuilder$APSWebviewDismissedAction APSHideOverlayOnWebviewDismiss>
			APSSkipUnitOnWebviewDismiss = new APSWebviewDismissedAction("APSSkipUnitOnWebviewDismiss", 1);
		//    6   13:new             #2   <Class APSMediaBuilder$APSWebviewDismissedAction>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "APSSkipUnitOnWebviewDismiss">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void APSMediaBuilder$APSWebviewDismissedAction(String, int)>
		//   11   23:putstatic       #26  <Field APSMediaBuilder$APSWebviewDismissedAction APSSkipUnitOnWebviewDismiss>
			APSDoNothingOnWebviewDismiss = new APSWebviewDismissedAction("APSDoNothingOnWebviewDismiss", 2);
		//   12   26:new             #2   <Class APSMediaBuilder$APSWebviewDismissedAction>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "APSDoNothingOnWebviewDismiss">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void APSMediaBuilder$APSWebviewDismissedAction(String, int)>
		//   17   36:putstatic       #29  <Field APSMediaBuilder$APSWebviewDismissedAction APSDoNothingOnWebviewDismiss>
			$VALUES = (new APSWebviewDismissedAction[] {
				APSHideOverlayOnWebviewDismiss, APSSkipUnitOnWebviewDismiss, APSDoNothingOnWebviewDismiss
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       APSWebviewDismissedAction[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field APSMediaBuilder$APSWebviewDismissedAction APSHideOverlayOnWebviewDismiss>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field APSMediaBuilder$APSWebviewDismissedAction APSSkipUnitOnWebviewDismiss>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field APSMediaBuilder$APSWebviewDismissedAction APSDoNothingOnWebviewDismiss>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field APSMediaBuilder$APSWebviewDismissedAction[] $VALUES>
		//*  33   64:return          
		}

		private APSWebviewDismissedAction(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class MPMovieControlStyle extends Enum
	{

		public static MPMovieControlStyle valueOf(String s)
		{
			return (MPMovieControlStyle)Enum.valueOf(com/appscend/media/APSMediaBuilder$MPMovieControlStyle, s);
		//    0    0:ldc1            #2   <Class APSMediaBuilder$MPMovieControlStyle>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSMediaBuilder$MPMovieControlStyle>
		//    4    9:areturn         
		}

		public static MPMovieControlStyle[] values()
		{
			return (MPMovieControlStyle[])((MPMovieControlStyle []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field APSMediaBuilder$MPMovieControlStyle[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.appscend.media.APSMediaBuilder$MPMovieControlStyle_3B_.clone()>
		//    2    6:checkcast       #38  <Class APSMediaBuilder$MPMovieControlStyle[]>
		//    3    9:areturn         
		}

		private static final MPMovieControlStyle $VALUES[];
		public static final MPMovieControlStyle MPMovieControlStyleFullscreen;
		public static final MPMovieControlStyle MPMovieControlStyleNone;

		static 
		{
			MPMovieControlStyleNone = new MPMovieControlStyle("MPMovieControlStyleNone", 0);
		//    0    0:new             #2   <Class APSMediaBuilder$MPMovieControlStyle>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "MPMovieControlStyleNone">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void APSMediaBuilder$MPMovieControlStyle(String, int)>
		//    5   10:putstatic       #22  <Field APSMediaBuilder$MPMovieControlStyle MPMovieControlStyleNone>
			MPMovieControlStyleFullscreen = new MPMovieControlStyle("MPMovieControlStyleFullscreen", 1);
		//    6   13:new             #2   <Class APSMediaBuilder$MPMovieControlStyle>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "MPMovieControlStyleFullscreen">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void APSMediaBuilder$MPMovieControlStyle(String, int)>
		//   11   23:putstatic       #25  <Field APSMediaBuilder$MPMovieControlStyle MPMovieControlStyleFullscreen>
			$VALUES = (new MPMovieControlStyle[] {
				MPMovieControlStyleNone, MPMovieControlStyleFullscreen
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       MPMovieControlStyle[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field APSMediaBuilder$MPMovieControlStyle MPMovieControlStyleNone>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field APSMediaBuilder$MPMovieControlStyle MPMovieControlStyleFullscreen>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field APSMediaBuilder$MPMovieControlStyle[] $VALUES>
		//*  23   45:return          
		}

		private MPMovieControlStyle(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static class getDataAsync extends AsyncTask
	{

		protected volatile Object doInBackground(Object aobj[])
		{
			return ((Object) (doInBackground((URL[])aobj)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #17  <Class URL[]>
		//    3    5:invokevirtual   #20  <Method String doInBackground(URL[])>
		//    4    8:areturn         
		}

		protected transient String doInBackground(URL aurl[])
		{
			aurl = ((URL []) ((new com.squareup.okhttp.Request.Builder()).url(aurl[0]).header("User-Agent", APSMediaPlayer.getInstance().getUserAgent()).build()));
		//    0    0:new             #24  <Class com.squareup.okhttp.Request$Builder>
		//    1    3:dup             
		//    2    4:invokespecial   #25  <Method void com.squareup.okhttp.Request$Builder()>
		//    3    7:aload_1         
		//    4    8:iconst_0        
		//    5    9:aaload          
		//    6   10:invokevirtual   #29  <Method com.squareup.okhttp.Request$Builder com.squareup.okhttp.Request$Builder.url(URL)>
		//    7   13:ldc1            #31  <String "User-Agent">
		//    8   15:invokestatic    #37  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
		//    9   18:invokevirtual   #41  <Method String APSMediaPlayer.getUserAgent()>
		//   10   21:invokevirtual   #45  <Method com.squareup.okhttp.Request$Builder com.squareup.okhttp.Request$Builder.header(String, String)>
		//   11   24:invokevirtual   #49  <Method com.squareup.okhttp.Request com.squareup.okhttp.Request$Builder.build()>
		//   12   27:astore_1        
			try
			{
				aurl = ((URL []) (APSMediaPlayer.getInstance().getHttpClient().newCall(((com.squareup.okhttp.Request) (aurl))).execute()));
		//   13   28:invokestatic    #37  <Method APSMediaPlayer APSMediaPlayer.getInstance()>
		//   14   31:invokevirtual   #53  <Method OkHttpClient APSMediaPlayer.getHttpClient()>
		//   15   34:aload_1         
		//   16   35:invokevirtual   #59  <Method Call OkHttpClient.newCall(com.squareup.okhttp.Request)>
		//   17   38:invokevirtual   #65  <Method Response Call.execute()>
		//   18   41:astore_1        
				if(((Response) (aurl)).isSuccessful())
		//*  19   42:aload_1         
		//*  20   43:invokevirtual   #71  <Method boolean Response.isSuccessful()>
		//*  21   46:ifeq            57
				{
					return ((Response) (aurl)).body().string();
		//   22   49:aload_1         
		//   23   50:invokevirtual   #75  <Method ResponseBody Response.body()>
		//   24   53:invokevirtual   #80  <Method String ResponseBody.string()>
		//   25   56:areturn         
				} else
				{
					StringBuilder stringbuilder = new StringBuilder();
		//   26   57:new             #82  <Class StringBuilder>
		//   27   60:dup             
		//   28   61:invokespecial   #83  <Method void StringBuilder()>
		//   29   64:astore_2        
					stringbuilder.append("Unexpected code ");
		//   30   65:aload_2         
		//   31   66:ldc1            #85  <String "Unexpected code ">
		//   32   68:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
		//   33   71:pop             
					stringbuilder.append(((Object) (aurl)));
		//   34   72:aload_2         
		//   35   73:aload_1         
		//   36   74:invokevirtual   #92  <Method StringBuilder StringBuilder.append(Object)>
		//   37   77:pop             
					throw new IOException(stringbuilder.toString());
		//   38   78:new             #22  <Class IOException>
		//   39   81:dup             
		//   40   82:aload_2         
		//   41   83:invokevirtual   #95  <Method String StringBuilder.toString()>
		//   42   86:invokespecial   #98  <Method void IOException(String)>
		//   43   89:athrow          
				}
			}
		//*  44   90:ldc1            #100 <String "">
		//*  45   92:areturn         
			// Misplaced declaration of an exception variable
			catch(URL aurl[])
			{
				return "";
			}
		//*  46   93:astore_1        
		//*  47   94:goto            90
		}

		public getDataAsync()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void AsyncTask()>
		//    2    4:return          
		}
	}


	public APSMediaBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
		userAgent = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #52  <Field String userAgent>
		adBreaks = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #54  <Field ArrayList adBreaks>
		defaultAdBreakPositions = new ArrayList(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
			"5", "75%"
		}))))));
	//    8   14:aload_0         
	//    9   15:new             #56  <Class ArrayList>
	//   10   18:dup             
	//   11   19:iconst_2        
	//   12   20:anewarray       String[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:ldc1            #60  <String "5">
	//   16   27:aastore         
	//   17   28:dup             
	//   18   29:iconst_1        
	//   19   30:ldc1            #62  <String "75%">
	//   20   32:aastore         
	//   21   33:invokestatic    #68  <Method java.util.List Arrays.asList(Object[])>
	//   22   36:invokespecial   #71  <Method void ArrayList(java.util.Collection)>
	//   23   39:putfield        #73  <Field ArrayList defaultAdBreakPositions>
		adBreakTemplate = new APSVastAdBreak();
	//   24   42:aload_0         
	//   25   43:new             #75  <Class APSVastAdBreak>
	//   26   46:dup             
	//   27   47:invokespecial   #76  <Method void APSVastAdBreak()>
	//   28   50:putfield        #78  <Field APSVastAdBreak adBreakTemplate>
	//   29   53:return          
	}

	public static HashMap controlsParametersFromDictionary(HashMap hashmap)
	{
		HashMap hashmap1;
		hashmap1 = new HashMap();
	//    0    0:new             #85  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #86  <Method void HashMap()>
	//    3    7:astore_3        
		if(hashmap.get("barColor") != null)
	//*   4    8:aload_0         
	//*   5    9:ldc1            #88  <String "barColor">
	//*   6   11:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*   7   14:ifnull          30
			hashmap1.put("barColor", hashmap.get("barColor"));
	//    8   17:aload_3         
	//    9   18:ldc1            #88  <String "barColor">
	//   10   20:aload_0         
	//   11   21:ldc1            #88  <String "barColor">
	//   12   23:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   13   26:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//   14   29:pop             
		if(hashmap.get("barAlpha") != null)
	//*  15   30:aload_0         
	//*  16   31:ldc1            #98  <String "barAlpha">
	//*  17   33:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  18   36:ifnull          61
			hashmap1.put("barAlpha", ((Object) (Float.valueOf(((Double)hashmap.get("barAlpha")).floatValue()))));
	//   19   39:aload_3         
	//   20   40:ldc1            #98  <String "barAlpha">
	//   21   42:aload_0         
	//   22   43:ldc1            #98  <String "barAlpha">
	//   23   45:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   24   48:checkcast       #100 <Class Double>
	//   25   51:invokevirtual   #104 <Method float Double.floatValue()>
	//   26   54:invokestatic    #110 <Method Float Float.valueOf(float)>
	//   27   57:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//   28   60:pop             
		if(hashmap.get("playedTrackColor") != null)
	//*  29   61:aload_0         
	//*  30   62:ldc1            #112 <String "playedTrackColor">
	//*  31   64:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  32   67:ifnull          83
			hashmap1.put("playedTrackColor", hashmap.get("playedTrackColor"));
	//   33   70:aload_3         
	//   34   71:ldc1            #112 <String "playedTrackColor">
	//   35   73:aload_0         
	//   36   74:ldc1            #112 <String "playedTrackColor">
	//   37   76:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   38   79:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//   39   82:pop             
		if(hashmap.get("bufferedTrackColor") != null)
	//*  40   83:aload_0         
	//*  41   84:ldc1            #114 <String "bufferedTrackColor">
	//*  42   86:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  43   89:ifnull          105
			hashmap1.put("bufferedTrackColor", hashmap.get("bufferedTrackColor"));
	//   44   92:aload_3         
	//   45   93:ldc1            #114 <String "bufferedTrackColor">
	//   46   95:aload_0         
	//   47   96:ldc1            #114 <String "bufferedTrackColor">
	//   48   98:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   49  101:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//   50  104:pop             
		if(hashmap.get("emptyTrackColor") != null)
	//*  51  105:aload_0         
	//*  52  106:ldc1            #116 <String "emptyTrackColor">
	//*  53  108:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  54  111:ifnull          127
			hashmap1.put("emptyTrackColor", hashmap.get("emptyTrackColor"));
	//   55  114:aload_3         
	//   56  115:ldc1            #116 <String "emptyTrackColor">
	//   57  117:aload_0         
	//   58  118:ldc1            #116 <String "emptyTrackColor">
	//   59  120:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   60  123:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//   61  126:pop             
		if(hashmap.get("playImage") == null)
			break MISSING_BLOCK_LABEL_184;
	//   62  127:aload_0         
	//   63  128:ldc1            #118 <String "playImage">
	//   64  130:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   65  133:ifnull          184
		Bitmap bitmap = (Bitmap)(new GetImageAsync()).execute(((Object []) (new String[] {
			(String)hashmap.get("playImage")
		}))).get();
	//   66  136:new             #120 <Class GetImageAsync>
	//   67  139:dup             
	//   68  140:invokespecial   #121 <Method void GetImageAsync()>
	//   69  143:iconst_1        
	//   70  144:anewarray       String[]
	//   71  147:dup             
	//   72  148:iconst_0        
	//   73  149:aload_0         
	//   74  150:ldc1            #118 <String "playImage">
	//   75  152:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   76  155:checkcast       #58  <Class String>
	//   77  158:aastore         
	//   78  159:invokevirtual   #125 <Method AsyncTask GetImageAsync.execute(Object[])>
	//   79  162:invokevirtual   #130 <Method Object AsyncTask.get()>
	//   80  165:checkcast       #132 <Class Bitmap>
	//   81  168:astore          4
		byte byte0;
		if(bitmap != null)
	//*  82  170:aload           4
	//*  83  172:ifnull          184
			try
			{
				hashmap1.put("playImage", ((Object) (bitmap)));
	//   84  175:aload_3         
	//   85  176:ldc1            #118 <String "playImage">
	//   86  178:aload           4
	//   87  180:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//   88  183:pop             
			}
	//*  89  184:aload_0         
	//*  90  185:ldc1            #134 <String "pauseImage">
	//*  91  187:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  92  190:ifnull          241
	//*  93  193:new             #120 <Class GetImageAsync>
	//*  94  196:dup             
	//*  95  197:invokespecial   #121 <Method void GetImageAsync()>
	//*  96  200:iconst_1        
	//*  97  201:anewarray       String[]
	//*  98  204:dup             
	//*  99  205:iconst_0        
	//* 100  206:aload_0         
	//* 101  207:ldc1            #134 <String "pauseImage">
	//* 102  209:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 103  212:checkcast       #58  <Class String>
	//* 104  215:aastore         
	//* 105  216:invokevirtual   #125 <Method AsyncTask GetImageAsync.execute(Object[])>
	//* 106  219:invokevirtual   #130 <Method Object AsyncTask.get()>
	//* 107  222:checkcast       #132 <Class Bitmap>
	//* 108  225:astore          4
	//* 109  227:aload           4
	//* 110  229:ifnull          241
	//* 111  232:aload_3         
	//* 112  233:ldc1            #134 <String "pauseImage">
	//* 113  235:aload           4
	//* 114  237:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 115  240:pop             
	//* 116  241:aload_0         
	//* 117  242:ldc1            #136 <String "fullscreenImage">
	//* 118  244:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 119  247:ifnull          298
	//* 120  250:new             #120 <Class GetImageAsync>
	//* 121  253:dup             
	//* 122  254:invokespecial   #121 <Method void GetImageAsync()>
	//* 123  257:iconst_1        
	//* 124  258:anewarray       String[]
	//* 125  261:dup             
	//* 126  262:iconst_0        
	//* 127  263:aload_0         
	//* 128  264:ldc1            #136 <String "fullscreenImage">
	//* 129  266:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 130  269:checkcast       #58  <Class String>
	//* 131  272:aastore         
	//* 132  273:invokevirtual   #125 <Method AsyncTask GetImageAsync.execute(Object[])>
	//* 133  276:invokevirtual   #130 <Method Object AsyncTask.get()>
	//* 134  279:checkcast       #132 <Class Bitmap>
	//* 135  282:astore          4
	//* 136  284:aload           4
	//* 137  286:ifnull          298
	//* 138  289:aload_3         
	//* 139  290:ldc1            #136 <String "fullscreenImage">
	//* 140  292:aload           4
	//* 141  294:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 142  297:pop             
	//* 143  298:aload_0         
	//* 144  299:ldc1            #138 <String "seekThumbImage">
	//* 145  301:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 146  304:ifnull          355
	//* 147  307:new             #120 <Class GetImageAsync>
	//* 148  310:dup             
	//* 149  311:invokespecial   #121 <Method void GetImageAsync()>
	//* 150  314:iconst_1        
	//* 151  315:anewarray       String[]
	//* 152  318:dup             
	//* 153  319:iconst_0        
	//* 154  320:aload_0         
	//* 155  321:ldc1            #138 <String "seekThumbImage">
	//* 156  323:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 157  326:checkcast       #58  <Class String>
	//* 158  329:aastore         
	//* 159  330:invokevirtual   #125 <Method AsyncTask GetImageAsync.execute(Object[])>
	//* 160  333:invokevirtual   #130 <Method Object AsyncTask.get()>
	//* 161  336:checkcast       #132 <Class Bitmap>
	//* 162  339:astore          4
	//* 163  341:aload           4
	//* 164  343:ifnull          355
	//* 165  346:aload_3         
	//* 166  347:ldc1            #138 <String "seekThumbImage">
	//* 167  349:aload           4
	//* 168  351:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 169  354:pop             
	//* 170  355:aload_0         
	//* 171  356:ldc1            #140 <String "visibleInFullscreenOnly">
	//* 172  358:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 173  361:ifnull          378
	//* 174  364:aload_3         
	//* 175  365:ldc1            #140 <String "visibleInFullscreenOnly">
	//* 176  367:iconst_1        
	//* 177  368:invokestatic    #145 <Method Boolean Boolean.valueOf(boolean)>
	//* 178  371:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 179  374:pop             
	//* 180  375:goto            389
	//* 181  378:aload_3         
	//* 182  379:ldc1            #140 <String "visibleInFullscreenOnly">
	//* 183  381:iconst_0        
	//* 184  382:invokestatic    #145 <Method Boolean Boolean.valueOf(boolean)>
	//* 185  385:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 186  388:pop             
	//* 187  389:aload_0         
	//* 188  390:ldc1            #147 <String "autohideDuration">
	//* 189  392:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 190  395:ifnull          414
	//* 191  398:aload_3         
	//* 192  399:ldc1            #147 <String "autohideDuration">
	//* 193  401:aload_0         
	//* 194  402:ldc1            #147 <String "autohideDuration">
	//* 195  404:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 196  407:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 197  410:pop             
	//* 198  411:goto            423
	//* 199  414:aload_3         
	//* 200  415:ldc1            #147 <String "autohideDuration">
	//* 201  417:ldc1            #60  <String "5">
	//* 202  419:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 203  422:pop             
	//* 204  423:aload_0         
	//* 205  424:ldc1            #149 <String "liveText">
	//* 206  426:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 207  429:ifnull          445
	//* 208  432:aload_3         
	//* 209  433:ldc1            #149 <String "liveText">
	//* 210  435:aload_0         
	//* 211  436:ldc1            #149 <String "liveText">
	//* 212  438:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 213  441:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 214  444:pop             
	//* 215  445:aload_0         
	//* 216  446:ldc1            #151 <String "playbackTimeText">
	//* 217  448:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 218  451:ifnull          467
	//* 219  454:aload_3         
	//* 220  455:ldc1            #151 <String "playbackTimeText">
	//* 221  457:aload_0         
	//* 222  458:ldc1            #151 <String "playbackTimeText">
	//* 223  460:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 224  463:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 225  466:pop             
	//* 226  467:aload_0         
	//* 227  468:ldc1            #153 <String "textColor">
	//* 228  470:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 229  473:ifnull          489
	//* 230  476:aload_3         
	//* 231  477:ldc1            #153 <String "textColor">
	//* 232  479:aload_0         
	//* 233  480:ldc1            #153 <String "textColor">
	//* 234  482:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 235  485:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 236  488:pop             
	//* 237  489:aload_0         
	//* 238  490:ldc1            #155 <String "components">
	//* 239  492:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 240  495:ifnull          653
	//* 241  498:aload_0         
	//* 242  499:ldc1            #155 <String "components">
	//* 243  501:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 244  504:checkcast       #56  <Class ArrayList>
	//* 245  507:invokevirtual   #159 <Method Iterator ArrayList.iterator()>
	//* 246  510:astore_0        
	//* 247  511:iconst_0        
	//* 248  512:istore_2        
	//* 249  513:iload_2         
	//* 250  514:istore_1        
	//* 251  515:aload_0         
	//* 252  516:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//* 253  521:ifeq            655
	//* 254  524:aload_0         
	//* 255  525:invokeinterface #168 <Method Object Iterator.next()>
	//* 256  530:checkcast       #58  <Class String>
	//* 257  533:astore          4
	//* 258  535:aload           4
	//* 259  537:ldc1            #170 <String "playback">
	//* 260  539:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 261  542:ifeq            551
	//* 262  545:bipush          64
	//* 263  547:istore_1        
	//* 264  548:goto            646
	//* 265  551:aload           4
	//* 266  553:ldc1            #176 <String "currentTime">
	//* 267  555:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 268  558:ifeq            566
	//* 269  561:iconst_1        
	//* 270  562:istore_1        
	//* 271  563:goto            646
	//* 272  566:aload           4
	//* 273  568:ldc1            #178 <String "slider">
	//* 274  570:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 275  573:ifeq            581
	//* 276  576:iconst_2        
	//* 277  577:istore_1        
	//* 278  578:goto            646
	//* 279  581:aload           4
	//* 280  583:ldc1            #180 <String "totalTime">
	//* 281  585:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 282  588:ifeq            596
	//* 283  591:iconst_4        
	//* 284  592:istore_1        
	//* 285  593:goto            646
	//* 286  596:aload           4
	//* 287  598:ldc1            #182 <String "fullscreen">
	//* 288  600:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 289  603:ifeq            612
	//* 290  606:bipush          8
	//* 291  608:istore_1        
	//* 292  609:goto            646
	//* 293  612:aload           4
	//* 294  614:ldc1            #184 <String "backButton">
	//* 295  616:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 296  619:ifeq            628
	//* 297  622:bipush          16
	//* 298  624:istore_1        
	//* 299  625:goto            646
	//* 300  628:aload           4
	//* 301  630:ldc1            #186 <String "forwardButton">
	//* 302  632:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 303  635:ifeq            644
	//* 304  638:bipush          32
	//* 305  640:istore_1        
	//* 306  641:goto            646
	//* 307  644:iconst_0        
	//* 308  645:istore_1        
	//* 309  646:iload_2         
	//* 310  647:iload_1         
	//* 311  648:ior             
	//* 312  649:istore_2        
	//* 313  650:goto            513
	//* 314  653:iconst_0        
	//* 315  654:istore_1        
	//* 316  655:iload_1         
	//* 317  656:ifeq            670
	//* 318  659:aload_3         
	//* 319  660:ldc1            #155 <String "components">
	//* 320  662:iload_1         
	//* 321  663:invokestatic    #191 <Method Integer Integer.valueOf(int)>
	//* 322  666:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 323  669:pop             
	//* 324  670:aload_3         
	//* 325  671:areturn         
			catch(Exception exception) { }
	//  326  672:astore          4
		if(hashmap.get("pauseImage") == null)
			break MISSING_BLOCK_LABEL_241;
		bitmap = (Bitmap)(new GetImageAsync()).execute(((Object []) (new String[] {
			(String)hashmap.get("pauseImage")
		}))).get();
		if(bitmap != null)
			try
			{
				hashmap1.put("pauseImage", ((Object) (bitmap)));
			}
	//* 327  674:goto            184
			catch(Exception exception1) { }
	//  328  677:astore          4
		if(hashmap.get("fullscreenImage") == null)
			break MISSING_BLOCK_LABEL_298;
		bitmap = (Bitmap)(new GetImageAsync()).execute(((Object []) (new String[] {
			(String)hashmap.get("fullscreenImage")
		}))).get();
		if(bitmap != null)
			try
			{
				hashmap1.put("fullscreenImage", ((Object) (bitmap)));
			}
	//* 329  679:goto            241
			catch(Exception exception2) { }
	//  330  682:astore          4
		if(hashmap.get("seekThumbImage") == null)
			break MISSING_BLOCK_LABEL_355;
		bitmap = (Bitmap)(new GetImageAsync()).execute(((Object []) (new String[] {
			(String)hashmap.get("seekThumbImage")
		}))).get();
		if(bitmap != null)
			try
			{
				hashmap1.put("seekThumbImage", ((Object) (bitmap)));
			}
	//* 331  684:goto            298
			catch(Exception exception3) { }
	//  332  687:astore          4
		if(hashmap.get("visibleInFullscreenOnly") != null)
			hashmap1.put("visibleInFullscreenOnly", ((Object) (Boolean.valueOf(true))));
		else
			hashmap1.put("visibleInFullscreenOnly", ((Object) (Boolean.valueOf(false))));
		if(hashmap.get("autohideDuration") != null)
			hashmap1.put("autohideDuration", hashmap.get("autohideDuration"));
		else
			hashmap1.put("autohideDuration", "5");
		if(hashmap.get("liveText") != null)
			hashmap1.put("liveText", hashmap.get("liveText"));
		if(hashmap.get("playbackTimeText") != null)
			hashmap1.put("playbackTimeText", hashmap.get("playbackTimeText"));
		if(hashmap.get("textColor") != null)
			hashmap1.put("textColor", hashmap.get("textColor"));
		if(hashmap.get("components") != null)
		{
			hashmap = ((HashMap) (((ArrayList)hashmap.get("components")).iterator()));
			int i = 0;
			do
			{
				byte0 = ((byte) (i));
				if(!((Iterator) (hashmap)).hasNext())
					break;
				String s = (String)((Iterator) (hashmap)).next();
				if(s.equals("playback"))
					byte0 = 64;
				else
				if(s.equals("currentTime"))
					byte0 = 1;
				else
				if(s.equals("slider"))
					byte0 = 2;
				else
				if(s.equals("totalTime"))
					byte0 = 4;
				else
				if(s.equals("fullscreen"))
					byte0 = 8;
				else
				if(s.equals("backButton"))
					byte0 = 16;
				else
				if(s.equals("forwardButton"))
					byte0 = 32;
				else
					byte0 = 0;
				i |= ((int) (byte0));
			} while(true);
		} else
		{
			byte0 = 0;
		}
		if(byte0 != 0)
			hashmap1.put("components", ((Object) (Integer.valueOf(((int) (byte0))))));
		return hashmap1;
	//* 333  689:goto            355
	}

	public static APSMediaOverlay overlayFromDictionary(HashMap hashmap)
	{
		Object obj;
		APSMediaOverlay apsmediaoverlay;
		if(hashmap == null || hashmap.get("type") == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          1623
	//*   2    4:aload_0         
	//*   3    5:ldc1            #197 <String "type">
	//*   4    7:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*   5   10:ifnonnull       16
			break MISSING_BLOCK_LABEL_1623;
	//    6   13:goto            1623
		apsmediaoverlay = new APSMediaOverlay();
	//    7   16:new             #199 <Class APSMediaOverlay>
	//    8   19:dup             
	//    9   20:invokespecial   #200 <Method void APSMediaOverlay()>
	//   10   23:astore_3        
		String s = (String)hashmap.get("type");
	//   11   24:aload_0         
	//   12   25:ldc1            #197 <String "type">
	//   13   27:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   14   30:checkcast       #58  <Class String>
	//   15   33:astore          4
		if(s.equals("button"))
	//*  16   35:aload           4
	//*  17   37:ldc1            #202 <String "button">
	//*  18   39:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*  19   42:ifeq            51
			obj = "button";
	//   20   45:ldc1            #202 <String "button">
	//   21   47:astore_2        
		else
	//*  22   48:goto            86
		if(s.equals("html"))
	//*  23   51:aload           4
	//*  24   53:ldc1            #204 <String "html">
	//*  25   55:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*  26   58:ifeq            67
			obj = "com.appscend.mp.overlays.html";
	//   27   61:ldc1            #206 <String "com.appscend.mp.overlays.html">
	//   28   63:astore_2        
		else
	//*  29   64:goto            86
		if(s.equals("image"))
	//*  30   67:aload           4
	//*  31   69:ldc1            #208 <String "image">
	//*  32   71:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*  33   74:ifeq            83
			obj = "com.appscend.mp.overlays.image";
	//   34   77:ldc1            #210 <String "com.appscend.mp.overlays.image">
	//   35   79:astore_2        
		else
	//*  36   80:goto            86
			obj = "com.appscend.mp.overlays.text";
	//   37   83:ldc1            #212 <String "com.appscend.mp.overlays.text">
	//   38   85:astore_2        
		apsmediaoverlay.type = ((String) (obj));
	//   39   86:aload_3         
	//   40   87:aload_2         
	//   41   88:putfield        #214 <Field String APSMediaOverlay.type>
		if(hashmap.get("position") != null)
	//*  42   91:aload_0         
	//*  43   92:ldc1            #216 <String "position">
	//*  44   94:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  45   97:ifnull          116
			apsmediaoverlay.position = positionFromString((String)hashmap.get("position"));
	//   46  100:aload_3         
	//   47  101:aload_0         
	//   48  102:ldc1            #216 <String "position">
	//   49  104:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   50  107:checkcast       #58  <Class String>
	//   51  110:invokestatic    #220 <Method com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition positionFromString(String)>
	//   52  113:putfield        #223 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
		if(hashmap.get("width") != null)
	//*  53  116:aload_0         
	//*  54  117:ldc1            #225 <String "width">
	//*  55  119:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  56  122:ifnull          138
			apsmediaoverlay.width = String.valueOf(hashmap.get("width"));
	//   57  125:aload_3         
	//   58  126:aload_0         
	//   59  127:ldc1            #225 <String "width">
	//   60  129:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   61  132:invokestatic    #228 <Method String String.valueOf(Object)>
	//   62  135:putfield        #230 <Field String APSMediaOverlay.width>
		if(hashmap.get("height") != null)
	//*  63  138:aload_0         
	//*  64  139:ldc1            #232 <String "height">
	//*  65  141:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  66  144:ifnull          160
			apsmediaoverlay.height = String.valueOf(hashmap.get("height"));
	//   67  147:aload_3         
	//   68  148:aload_0         
	//   69  149:ldc1            #232 <String "height">
	//   70  151:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   71  154:invokestatic    #228 <Method String String.valueOf(Object)>
	//   72  157:putfield        #234 <Field String APSMediaOverlay.height>
		if(hashmap.get("fadeIn") != null)
	//*  73  160:aload_0         
	//*  74  161:ldc1            #236 <String "fadeIn">
	//*  75  163:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  76  166:ifnull          185
			apsmediaoverlay.fadeInDuration = ((Double)hashmap.get("fadeIn")).floatValue();
	//   77  169:aload_3         
	//   78  170:aload_0         
	//   79  171:ldc1            #236 <String "fadeIn">
	//   80  173:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   81  176:checkcast       #100 <Class Double>
	//   82  179:invokevirtual   #104 <Method float Double.floatValue()>
	//   83  182:putfield        #240 <Field float APSMediaOverlay.fadeInDuration>
		if(hashmap.get("tracking") != null)
	//*  84  185:aload_0         
	//*  85  186:ldc1            #242 <String "tracking">
	//*  86  188:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  87  191:ifnull          210
			apsmediaoverlay.trackingURLs = VPUtilities.hashmapValuesToURLs((HashMap)hashmap.get("tracking"));
	//   88  194:aload_3         
	//   89  195:aload_0         
	//   90  196:ldc1            #242 <String "tracking">
	//   91  198:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   92  201:checkcast       #85  <Class HashMap>
	//   93  204:invokestatic    #247 <Method HashMap VPUtilities.hashmapValuesToURLs(HashMap)>
	//   94  207:putfield        #251 <Field HashMap APSMediaOverlay.trackingURLs>
		if(hashmap.get("start") != null)
	//*  95  210:aload_0         
	//*  96  211:ldc1            #253 <String "start">
	//*  97  213:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  98  216:ifnull          232
			apsmediaoverlay.setStartPoint((String)hashmap.get("start"));
	//   99  219:aload_3         
	//  100  220:aload_0         
	//  101  221:ldc1            #253 <String "start">
	//  102  223:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  103  226:checkcast       #58  <Class String>
	//  104  229:invokevirtual   #257 <Method void APSMediaOverlay.setStartPoint(String)>
		if(hashmap.get("end") != null)
	//* 105  232:aload_0         
	//* 106  233:ldc2            #259 <String "end">
	//* 107  236:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 108  239:ifnull          256
			apsmediaoverlay.setEndPoint((String)hashmap.get("end"));
	//  109  242:aload_3         
	//  110  243:aload_0         
	//  111  244:ldc2            #259 <String "end">
	//  112  247:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  113  250:checkcast       #58  <Class String>
	//  114  253:invokevirtual   #262 <Method void APSMediaOverlay.setEndPoint(String)>
		if(hashmap.get("absoluteX") != null)
	//* 115  256:aload_0         
	//* 116  257:ldc2            #264 <String "absoluteX">
	//* 117  260:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 118  263:ifnull          280
			apsmediaoverlay.absoluteOffsetX = String.valueOf(hashmap.get("absoluteX"));
	//  119  266:aload_3         
	//  120  267:aload_0         
	//  121  268:ldc2            #264 <String "absoluteX">
	//  122  271:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  123  274:invokestatic    #228 <Method String String.valueOf(Object)>
	//  124  277:putfield        #267 <Field String APSMediaOverlay.absoluteOffsetX>
		if(hashmap.get("absoluteY") != null)
	//* 125  280:aload_0         
	//* 126  281:ldc2            #269 <String "absoluteY">
	//* 127  284:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 128  287:ifnull          304
			apsmediaoverlay.absoluteOffsetY = String.valueOf(hashmap.get("absoluteY"));
	//  129  290:aload_3         
	//  130  291:aload_0         
	//  131  292:ldc2            #269 <String "absoluteY">
	//  132  295:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  133  298:invokestatic    #228 <Method String String.valueOf(Object)>
	//  134  301:putfield        #272 <Field String APSMediaOverlay.absoluteOffsetY>
		apsmediaoverlay.parameters = new HashMap();
	//  135  304:aload_3         
	//  136  305:new             #85  <Class HashMap>
	//  137  308:dup             
	//  138  309:invokespecial   #86  <Method void HashMap()>
	//  139  312:putfield        #275 <Field HashMap APSMediaOverlay.parameters>
		if(hashmap.get("parameters") != null)
	//* 140  315:aload_0         
	//* 141  316:ldc2            #276 <String "parameters">
	//* 142  319:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 143  322:ifnull          1134
		{
			int i;
label0:
			{
				obj = ((Object) (new HashMap(((java.util.Map) ((LinkedTreeMap)hashmap.get("parameters"))))));
	//  144  325:new             #85  <Class HashMap>
	//  145  328:dup             
	//  146  329:aload_0         
	//  147  330:ldc2            #276 <String "parameters">
	//  148  333:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  149  336:checkcast       #278 <Class LinkedTreeMap>
	//  150  339:invokespecial   #281 <Method void HashMap(java.util.Map)>
	//  151  342:astore_2        
				i = s.hashCode();
	//  152  343:aload           4
	//  153  345:invokevirtual   #285 <Method int String.hashCode()>
	//  154  348:istore_1        
				if(i != 0xade22732)
	//* 155  349:iload_1         
	//* 156  350:ldc2            #286 <Int 0xade22732>
	//* 157  353:icmpeq          403
				{
					if(i != 0x3107ab)
	//* 158  356:iload_1         
	//* 159  357:ldc2            #287 <Int 0x3107ab>
	//* 160  360:icmpeq          388
					{
						if(i == 0x5faa95b && s.equals("image"))
	//* 161  363:iload_1         
	//* 162  364:ldc2            #288 <Int 0x5faa95b>
	//* 163  367:icmpeq          373
	//* 164  370:goto            418
	//* 165  373:aload           4
	//* 166  375:ldc1            #208 <String "image">
	//* 167  377:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 168  380:ifeq            418
						{
							i = 2;
	//  169  383:iconst_2        
	//  170  384:istore_1        
							break label0;
	//  171  385:goto            420
						}
					} else
					if(s.equals("html"))
	//* 172  388:aload           4
	//* 173  390:ldc1            #204 <String "html">
	//* 174  392:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 175  395:ifeq            418
					{
						i = 1;
	//  176  398:iconst_1        
	//  177  399:istore_1        
						break label0;
	//  178  400:goto            420
					}
				} else
				if(s.equals("button"))
	//* 179  403:aload           4
	//* 180  405:ldc1            #202 <String "button">
	//* 181  407:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 182  410:ifeq            418
				{
					i = 0;
	//  183  413:iconst_0        
	//  184  414:istore_1        
					break label0;
	//  185  415:goto            420
				}
				i = -1;
	//  186  418:iconst_m1       
	//  187  419:istore_1        
			}
			switch(i)
	//* 188  420:iload_1         
			{
	//* 189  421:tableswitch     0 2: default 448
	//	               0 957
	//	               1 724
	//	               2 479
			default:
				if(((HashMap) (obj)).get("text") != null)
	//* 190  448:aload_2         
	//* 191  449:ldc2            #290 <String "text">
	//* 192  452:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 193  455:ifnull          1050
					apsmediaoverlay.parameters.put("text", ((HashMap) (obj)).get("text"));
	//  194  458:aload_3         
	//  195  459:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//  196  462:ldc2            #290 <String "text">
	//  197  465:aload_2         
	//  198  466:ldc2            #290 <String "text">
	//  199  469:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  200  472:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//  201  475:pop             
	//* 202  476:goto            1050
	//* 203  479:aload_2         
	//* 204  480:ldc2            #292 <String "url">
	//* 205  483:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 206  486:ifnull          507
	//* 207  489:aload_3         
	//* 208  490:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 209  493:ldc2            #292 <String "url">
	//* 210  496:aload_2         
	//* 211  497:ldc2            #292 <String "url">
	//* 212  500:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 213  503:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 214  506:pop             
	//* 215  507:aload_2         
	//* 216  508:ldc2            #294 <String "clickThrough">
	//* 217  511:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 218  514:ifnull          535
	//* 219  517:aload_3         
	//* 220  518:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 221  521:ldc2            #294 <String "clickThrough">
	//* 222  524:aload_2         
	//* 223  525:ldc2            #294 <String "clickThrough">
	//* 224  528:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 225  531:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 226  534:pop             
	//* 227  535:aload_2         
	//* 228  536:ldc2            #296 <String "dismissAction">
	//* 229  539:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 230  542:ifnull          563
	//* 231  545:aload_3         
	//* 232  546:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 233  549:ldc2            #296 <String "dismissAction">
	//* 234  552:aload_2         
	//* 235  553:ldc2            #296 <String "dismissAction">
	//* 236  556:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 237  559:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 238  562:pop             
	//* 239  563:aload_2         
	//* 240  564:ldc2            #298 <String "clickTracking">
	//* 241  567:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 242  570:ifnull          597
	//* 243  573:aload_3         
	//* 244  574:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 245  577:ldc2            #298 <String "clickTracking">
	//* 246  580:aload_2         
	//* 247  581:ldc2            #298 <String "clickTracking">
	//* 248  584:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 249  587:checkcast       #56  <Class ArrayList>
	//* 250  590:invokestatic    #302 <Method ArrayList VPUtilities.arrayValuesToURLs(ArrayList)>
	//* 251  593:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 252  596:pop             
	//* 253  597:aload_2         
	//* 254  598:ldc2            #304 <String "viewTracking">
	//* 255  601:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 256  604:ifnull          631
	//* 257  607:aload_3         
	//* 258  608:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 259  611:ldc2            #304 <String "viewTracking">
	//* 260  614:aload_2         
	//* 261  615:ldc2            #304 <String "viewTracking">
	//* 262  618:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 263  621:checkcast       #56  <Class ArrayList>
	//* 264  624:invokestatic    #302 <Method ArrayList VPUtilities.arrayValuesToURLs(ArrayList)>
	//* 265  627:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 266  630:pop             
	//* 267  631:aload_2         
	//* 268  632:ldc2            #306 <String "errorTracking">
	//* 269  635:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 270  638:ifnull          665
	//* 271  641:aload_3         
	//* 272  642:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 273  645:ldc2            #306 <String "errorTracking">
	//* 274  648:aload_2         
	//* 275  649:ldc2            #306 <String "errorTracking">
	//* 276  652:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 277  655:checkcast       #56  <Class ArrayList>
	//* 278  658:invokestatic    #302 <Method ArrayList VPUtilities.arrayValuesToURLs(ArrayList)>
	//* 279  661:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 280  664:pop             
	//* 281  665:aload_2         
	//* 282  666:ldc2            #308 <String "backgroundColor">
	//* 283  669:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 284  672:ifnull          693
	//* 285  675:aload_3         
	//* 286  676:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 287  679:ldc2            #310 <String "imageOverlayBackgroundColor">
	//* 288  682:aload_2         
	//* 289  683:ldc2            #308 <String "backgroundColor">
	//* 290  686:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 291  689:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 292  692:pop             
	//* 293  693:aload_2         
	//* 294  694:ldc2            #312 <String "stretchMode">
	//* 295  697:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 296  700:ifnull          1134
	//* 297  703:aload_3         
	//* 298  704:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 299  707:ldc2            #312 <String "stretchMode">
	//* 300  710:aload_2         
	//* 301  711:ldc2            #312 <String "stretchMode">
	//* 302  714:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 303  717:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 304  720:pop             
	//* 305  721:goto            1134
	//* 306  724:aload_2         
	//* 307  725:ldc2            #314 <String "code">
	//* 308  728:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 309  731:ifnull          752
	//* 310  734:aload_3         
	//* 311  735:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 312  738:ldc2            #314 <String "code">
	//* 313  741:aload_2         
	//* 314  742:ldc2            #314 <String "code">
	//* 315  745:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 316  748:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 317  751:pop             
	//* 318  752:aload_2         
	//* 319  753:ldc2            #316 <String "iframe">
	//* 320  756:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 321  759:ifnull          780
	//* 322  762:aload_3         
	//* 323  763:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 324  766:ldc2            #316 <String "iframe">
	//* 325  769:aload_2         
	//* 326  770:ldc2            #316 <String "iframe">
	//* 327  773:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 328  776:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 329  779:pop             
	//* 330  780:aload_2         
	//* 331  781:ldc2            #318 <String "script">
	//* 332  784:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 333  787:ifnull          808
	//* 334  790:aload_3         
	//* 335  791:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 336  794:ldc2            #318 <String "script">
	//* 337  797:aload_2         
	//* 338  798:ldc2            #318 <String "script">
	//* 339  801:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 340  804:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 341  807:pop             
	//* 342  808:aload_2         
	//* 343  809:ldc2            #292 <String "url">
	//* 344  812:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 345  815:ifnull          836
	//* 346  818:aload_3         
	//* 347  819:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 348  822:ldc2            #292 <String "url">
	//* 349  825:aload_2         
	//* 350  826:ldc2            #292 <String "url">
	//* 351  829:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 352  832:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 353  835:pop             
	//* 354  836:aload_2         
	//* 355  837:ldc2            #320 <String "viewportWidth">
	//* 356  840:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 357  843:ifnull          864
	//* 358  846:aload_3         
	//* 359  847:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 360  850:ldc2            #320 <String "viewportWidth">
	//* 361  853:aload_2         
	//* 362  854:ldc2            #320 <String "viewportWidth">
	//* 363  857:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 364  860:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 365  863:pop             
	//* 366  864:aload_2         
	//* 367  865:ldc2            #322 <String "viewportHeight">
	//* 368  868:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 369  871:ifnull          892
	//* 370  874:aload_3         
	//* 371  875:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 372  878:ldc2            #322 <String "viewportHeight">
	//* 373  881:aload_2         
	//* 374  882:ldc2            #322 <String "viewportHeight">
	//* 375  885:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 376  888:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 377  891:pop             
	//* 378  892:aload_2         
	//* 379  893:ldc2            #306 <String "errorTracking">
	//* 380  896:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 381  899:ifnull          926
	//* 382  902:aload_3         
	//* 383  903:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 384  906:ldc2            #306 <String "errorTracking">
	//* 385  909:aload_2         
	//* 386  910:ldc2            #306 <String "errorTracking">
	//* 387  913:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 388  916:checkcast       #56  <Class ArrayList>
	//* 389  919:invokestatic    #302 <Method ArrayList VPUtilities.arrayValuesToURLs(ArrayList)>
	//* 390  922:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 391  925:pop             
	//* 392  926:aload_2         
	//* 393  927:ldc2            #296 <String "dismissAction">
	//* 394  930:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 395  933:ifnull          1134
	//* 396  936:aload_3         
	//* 397  937:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 398  940:ldc2            #296 <String "dismissAction">
	//* 399  943:aload_2         
	//* 400  944:ldc2            #296 <String "dismissAction">
	//* 401  947:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 402  950:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 403  953:pop             
	//* 404  954:goto            1134
	//* 405  957:aload_2         
	//* 406  958:ldc2            #296 <String "dismissAction">
	//* 407  961:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 408  964:ifnull          985
	//* 409  967:aload_3         
	//* 410  968:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 411  971:ldc2            #296 <String "dismissAction">
	//* 412  974:aload_2         
	//* 413  975:ldc2            #296 <String "dismissAction">
	//* 414  978:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 415  981:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 416  984:pop             
	//* 417  985:aload_2         
	//* 418  986:ldc2            #294 <String "clickThrough">
	//* 419  989:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 420  992:ifnull          1013
	//* 421  995:aload_3         
	//* 422  996:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 423  999:ldc2            #294 <String "clickThrough">
	//* 424 1002:aload_2         
	//* 425 1003:ldc2            #294 <String "clickThrough">
	//* 426 1006:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 427 1009:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 428 1012:pop             
	//* 429 1013:aload_2         
	//* 430 1014:ldc2            #298 <String "clickTracking">
	//* 431 1017:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 432 1020:ifnull          1134
	//* 433 1023:aload_3         
	//* 434 1024:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 435 1027:ldc2            #298 <String "clickTracking">
	//* 436 1030:aload_2         
	//* 437 1031:ldc2            #298 <String "clickTracking">
	//* 438 1034:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 439 1037:checkcast       #56  <Class ArrayList>
	//* 440 1040:invokestatic    #302 <Method ArrayList VPUtilities.arrayValuesToURLs(ArrayList)>
	//* 441 1043:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 442 1046:pop             
	//* 443 1047:goto            1134
				if(((HashMap) (obj)).get("color") != null)
	//* 444 1050:aload_2         
	//* 445 1051:ldc2            #324 <String "color">
	//* 446 1054:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 447 1057:ifnull          1078
					apsmediaoverlay.parameters.put("color", ((HashMap) (obj)).get("color"));
	//  448 1060:aload_3         
	//  449 1061:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//  450 1064:ldc2            #324 <String "color">
	//  451 1067:aload_2         
	//  452 1068:ldc2            #324 <String "color">
	//  453 1071:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  454 1074:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//  455 1077:pop             
				if(((HashMap) (obj)).get("font") != null)
	//* 456 1078:aload_2         
	//* 457 1079:ldc2            #326 <String "font">
	//* 458 1082:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 459 1085:ifnull          1106
					apsmediaoverlay.parameters.put("font", ((HashMap) (obj)).get("font"));
	//  460 1088:aload_3         
	//  461 1089:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//  462 1092:ldc2            #326 <String "font">
	//  463 1095:aload_2         
	//  464 1096:ldc2            #326 <String "font">
	//  465 1099:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  466 1102:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//  467 1105:pop             
				if(((HashMap) (obj)).get("size") != null)
	//* 468 1106:aload_2         
	//* 469 1107:ldc2            #328 <String "size">
	//* 470 1110:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 471 1113:ifnull          1134
					apsmediaoverlay.parameters.put("size", ((HashMap) (obj)).get("size"));
	//  472 1116:aload_3         
	//  473 1117:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//  474 1120:ldc2            #328 <String "size">
	//  475 1123:aload_2         
	//  476 1124:ldc2            #328 <String "size">
	//  477 1127:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  478 1130:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//  479 1133:pop             
				break;

			case 2: // '\002'
				if(((HashMap) (obj)).get("url") != null)
					apsmediaoverlay.parameters.put("url", ((HashMap) (obj)).get("url"));
				if(((HashMap) (obj)).get("clickThrough") != null)
					apsmediaoverlay.parameters.put("clickThrough", ((HashMap) (obj)).get("clickThrough"));
				if(((HashMap) (obj)).get("dismissAction") != null)
					apsmediaoverlay.parameters.put("dismissAction", ((HashMap) (obj)).get("dismissAction"));
				if(((HashMap) (obj)).get("clickTracking") != null)
					apsmediaoverlay.parameters.put("clickTracking", ((Object) (VPUtilities.arrayValuesToURLs((ArrayList)((HashMap) (obj)).get("clickTracking")))));
				if(((HashMap) (obj)).get("viewTracking") != null)
					apsmediaoverlay.parameters.put("viewTracking", ((Object) (VPUtilities.arrayValuesToURLs((ArrayList)((HashMap) (obj)).get("viewTracking")))));
				if(((HashMap) (obj)).get("errorTracking") != null)
					apsmediaoverlay.parameters.put("errorTracking", ((Object) (VPUtilities.arrayValuesToURLs((ArrayList)((HashMap) (obj)).get("errorTracking")))));
				if(((HashMap) (obj)).get("backgroundColor") != null)
					apsmediaoverlay.parameters.put("imageOverlayBackgroundColor", ((HashMap) (obj)).get("backgroundColor"));
				if(((HashMap) (obj)).get("stretchMode") != null)
					apsmediaoverlay.parameters.put("stretchMode", ((HashMap) (obj)).get("stretchMode"));
				break;

			case 1: // '\001'
				if(((HashMap) (obj)).get("code") != null)
					apsmediaoverlay.parameters.put("code", ((HashMap) (obj)).get("code"));
				if(((HashMap) (obj)).get("iframe") != null)
					apsmediaoverlay.parameters.put("iframe", ((HashMap) (obj)).get("iframe"));
				if(((HashMap) (obj)).get("script") != null)
					apsmediaoverlay.parameters.put("script", ((HashMap) (obj)).get("script"));
				if(((HashMap) (obj)).get("url") != null)
					apsmediaoverlay.parameters.put("url", ((HashMap) (obj)).get("url"));
				if(((HashMap) (obj)).get("viewportWidth") != null)
					apsmediaoverlay.parameters.put("viewportWidth", ((HashMap) (obj)).get("viewportWidth"));
				if(((HashMap) (obj)).get("viewportHeight") != null)
					apsmediaoverlay.parameters.put("viewportHeight", ((HashMap) (obj)).get("viewportHeight"));
				if(((HashMap) (obj)).get("errorTracking") != null)
					apsmediaoverlay.parameters.put("errorTracking", ((Object) (VPUtilities.arrayValuesToURLs((ArrayList)((HashMap) (obj)).get("errorTracking")))));
				if(((HashMap) (obj)).get("dismissAction") != null)
					apsmediaoverlay.parameters.put("dismissAction", ((HashMap) (obj)).get("dismissAction"));
				break;

			case 0: // '\0'
				if(((HashMap) (obj)).get("dismissAction") != null)
					apsmediaoverlay.parameters.put("dismissAction", ((HashMap) (obj)).get("dismissAction"));
				if(((HashMap) (obj)).get("clickThrough") != null)
					apsmediaoverlay.parameters.put("clickThrough", ((HashMap) (obj)).get("clickThrough"));
				if(((HashMap) (obj)).get("clickTracking") != null)
					apsmediaoverlay.parameters.put("clickTracking", ((Object) (VPUtilities.arrayValuesToURLs((ArrayList)((HashMap) (obj)).get("clickTracking")))));
				break;
			}
		}
		if(hashmap.get("closeButton") == null)
			break MISSING_BLOCK_LABEL_1590;
	//  480 1134:aload_0         
	//  481 1135:ldc2            #330 <String "closeButton">
	//  482 1138:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  483 1141:ifnull          1590
		obj = ((Object) (new HashMap(((java.util.Map) ((LinkedTreeMap)hashmap.get("closeButton"))))));
	//  484 1144:new             #85  <Class HashMap>
	//  485 1147:dup             
	//  486 1148:aload_0         
	//  487 1149:ldc2            #330 <String "closeButton">
	//  488 1152:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  489 1155:checkcast       #278 <Class LinkedTreeMap>
	//  490 1158:invokespecial   #281 <Method void HashMap(java.util.Map)>
	//  491 1161:astore_2        
		if(((HashMap) (obj)).get("image") == null)
			break MISSING_BLOCK_LABEL_1222;
	//  492 1162:aload_2         
	//  493 1163:ldc1            #208 <String "image">
	//  494 1165:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  495 1168:ifnull          1222
		Bitmap bitmap = (Bitmap)(new GetImageAsync()).execute(((Object []) (new String[] {
			(String)((HashMap) (obj)).get("image")
		}))).get();
	//  496 1171:new             #120 <Class GetImageAsync>
	//  497 1174:dup             
	//  498 1175:invokespecial   #121 <Method void GetImageAsync()>
	//  499 1178:iconst_1        
	//  500 1179:anewarray       String[]
	//  501 1182:dup             
	//  502 1183:iconst_0        
	//  503 1184:aload_2         
	//  504 1185:ldc1            #208 <String "image">
	//  505 1187:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  506 1190:checkcast       #58  <Class String>
	//  507 1193:aastore         
	//  508 1194:invokevirtual   #125 <Method AsyncTask GetImageAsync.execute(Object[])>
	//  509 1197:invokevirtual   #130 <Method Object AsyncTask.get()>
	//  510 1200:checkcast       #132 <Class Bitmap>
	//  511 1203:astore          4
		if(bitmap != null)
	//* 512 1205:aload           4
	//* 513 1207:ifnull          1222
			try
			{
				apsmediaoverlay.parameters.put("image", ((Object) (bitmap)));
	//  514 1210:aload_3         
	//  515 1211:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//  516 1214:ldc1            #208 <String "image">
	//  517 1216:aload           4
	//  518 1218:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//  519 1221:pop             
			}
	//* 520 1222:aload_2         
	//* 521 1223:ldc2            #328 <String "size">
	//* 522 1226:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 523 1229:ifnull          1250
	//* 524 1232:aload_3         
	//* 525 1233:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 526 1236:ldc2            #328 <String "size">
	//* 527 1239:aload_2         
	//* 528 1240:ldc2            #328 <String "size">
	//* 529 1243:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 530 1246:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 531 1249:pop             
	//* 532 1250:aload_2         
	//* 533 1251:ldc2            #308 <String "backgroundColor">
	//* 534 1254:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 535 1257:ifnull          1278
	//* 536 1260:aload_3         
	//* 537 1261:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 538 1264:ldc2            #332 <String "closeBackgroundColor">
	//* 539 1267:aload_2         
	//* 540 1268:ldc2            #308 <String "backgroundColor">
	//* 541 1271:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 542 1274:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 543 1277:pop             
	//* 544 1278:aload_2         
	//* 545 1279:ldc2            #334 <String "xColor">
	//* 546 1282:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 547 1285:ifnull          1306
	//* 548 1288:aload_3         
	//* 549 1289:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 550 1292:ldc2            #334 <String "xColor">
	//* 551 1295:aload_2         
	//* 552 1296:ldc2            #334 <String "xColor">
	//* 553 1299:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 554 1302:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 555 1305:pop             
	//* 556 1306:aload_2         
	//* 557 1307:ldc2            #336 <String "progressColor">
	//* 558 1310:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 559 1313:ifnull          1334
	//* 560 1316:aload_3         
	//* 561 1317:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 562 1320:ldc2            #336 <String "progressColor">
	//* 563 1323:aload_2         
	//* 564 1324:ldc2            #336 <String "progressColor">
	//* 565 1327:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 566 1330:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 567 1333:pop             
	//* 568 1334:aload_2         
	//* 569 1335:ldc2            #338 <String "trackColor">
	//* 570 1338:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 571 1341:ifnull          1362
	//* 572 1344:aload_3         
	//* 573 1345:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 574 1348:ldc2            #338 <String "trackColor">
	//* 575 1351:aload_2         
	//* 576 1352:ldc2            #338 <String "trackColor">
	//* 577 1355:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 578 1358:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 579 1361:pop             
	//* 580 1362:aload_2         
	//* 581 1363:ldc2            #340 <String "offsetX">
	//* 582 1366:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 583 1369:ifnull          1390
	//* 584 1372:aload_3         
	//* 585 1373:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 586 1376:ldc2            #340 <String "offsetX">
	//* 587 1379:aload_2         
	//* 588 1380:ldc2            #340 <String "offsetX">
	//* 589 1383:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 590 1386:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 591 1389:pop             
	//* 592 1390:aload_2         
	//* 593 1391:ldc2            #342 <String "offsetY">
	//* 594 1394:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 595 1397:ifnull          1418
	//* 596 1400:aload_3         
	//* 597 1401:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 598 1404:ldc2            #342 <String "offsetY">
	//* 599 1407:aload_2         
	//* 600 1408:ldc2            #342 <String "offsetY">
	//* 601 1411:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 602 1414:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 603 1417:pop             
	//* 604 1418:aload_2         
	//* 605 1419:ldc2            #344 <String "initialAlpha">
	//* 606 1422:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 607 1425:ifnull          1455
	//* 608 1428:aload_3         
	//* 609 1429:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 610 1432:ldc2            #344 <String "initialAlpha">
	//* 611 1435:aload_2         
	//* 612 1436:ldc2            #344 <String "initialAlpha">
	//* 613 1439:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 614 1442:checkcast       #100 <Class Double>
	//* 615 1445:invokevirtual   #104 <Method float Double.floatValue()>
	//* 616 1448:invokestatic    #110 <Method Float Float.valueOf(float)>
	//* 617 1451:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 618 1454:pop             
	//* 619 1455:aload_2         
	//* 620 1456:ldc2            #346 <String "finalAlpha">
	//* 621 1459:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 622 1462:ifnull          1492
	//* 623 1465:aload_3         
	//* 624 1466:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 625 1469:ldc2            #346 <String "finalAlpha">
	//* 626 1472:aload_2         
	//* 627 1473:ldc2            #346 <String "finalAlpha">
	//* 628 1476:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 629 1479:checkcast       #100 <Class Double>
	//* 630 1482:invokevirtual   #104 <Method float Double.floatValue()>
	//* 631 1485:invokestatic    #110 <Method Float Float.valueOf(float)>
	//* 632 1488:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 633 1491:pop             
	//* 634 1492:aload_2         
	//* 635 1493:ldc2            #348 <String "show">
	//* 636 1496:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 637 1499:ifnull          1531
	//* 638 1502:aload_3         
	//* 639 1503:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 640 1506:ldc2            #348 <String "show">
	//* 641 1509:iconst_1        
	//* 642 1510:aload_2         
	//* 643 1511:ldc2            #348 <String "show">
	//* 644 1514:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 645 1517:checkcast       #142 <Class Boolean>
	//* 646 1520:invokevirtual   #351 <Method boolean Boolean.booleanValue()>
	//* 647 1523:ixor            
	//* 648 1524:invokestatic    #145 <Method Boolean Boolean.valueOf(boolean)>
	//* 649 1527:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 650 1530:pop             
	//* 651 1531:aload_2         
	//* 652 1532:ldc1            #242 <String "tracking">
	//* 653 1534:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 654 1537:ifnull          1562
	//* 655 1540:aload_3         
	//* 656 1541:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 657 1544:ldc1            #242 <String "tracking">
	//* 658 1546:aload_2         
	//* 659 1547:ldc1            #242 <String "tracking">
	//* 660 1549:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 661 1552:checkcast       #56  <Class ArrayList>
	//* 662 1555:invokestatic    #302 <Method ArrayList VPUtilities.arrayValuesToURLs(ArrayList)>
	//* 663 1558:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 664 1561:pop             
	//* 665 1562:aload_2         
	//* 666 1563:ldc2            #353 <String "activationOffset">
	//* 667 1566:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 668 1569:ifnull          1590
	//* 669 1572:aload_3         
	//* 670 1573:getfield        #275 <Field HashMap APSMediaOverlay.parameters>
	//* 671 1576:ldc2            #353 <String "activationOffset">
	//* 672 1579:aload_2         
	//* 673 1580:ldc2            #353 <String "activationOffset">
	//* 674 1583:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 675 1586:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//* 676 1589:pop             
	//* 677 1590:aload_0         
	//* 678 1591:ldc2            #355 <String "metadata">
	//* 679 1594:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 680 1597:ifnull          1621
	//* 681 1600:aload_3         
	//* 682 1601:new             #85  <Class HashMap>
	//* 683 1604:dup             
	//* 684 1605:aload_0         
	//* 685 1606:ldc2            #355 <String "metadata">
	//* 686 1609:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 687 1612:checkcast       #278 <Class LinkedTreeMap>
	//* 688 1615:invokespecial   #281 <Method void HashMap(java.util.Map)>
	//* 689 1618:putfield        #357 <Field HashMap APSMediaOverlay.metadata>
	//* 690 1621:aload_3         
	//* 691 1622:areturn         
	//* 692 1623:aconst_null     
	//* 693 1624:areturn         
			catch(Exception exception) { }
	//  694 1625:astore          4
		if(((HashMap) (obj)).get("size") != null)
			apsmediaoverlay.parameters.put("size", ((HashMap) (obj)).get("size"));
		if(((HashMap) (obj)).get("backgroundColor") != null)
			apsmediaoverlay.parameters.put("closeBackgroundColor", ((HashMap) (obj)).get("backgroundColor"));
		if(((HashMap) (obj)).get("xColor") != null)
			apsmediaoverlay.parameters.put("xColor", ((HashMap) (obj)).get("xColor"));
		if(((HashMap) (obj)).get("progressColor") != null)
			apsmediaoverlay.parameters.put("progressColor", ((HashMap) (obj)).get("progressColor"));
		if(((HashMap) (obj)).get("trackColor") != null)
			apsmediaoverlay.parameters.put("trackColor", ((HashMap) (obj)).get("trackColor"));
		if(((HashMap) (obj)).get("offsetX") != null)
			apsmediaoverlay.parameters.put("offsetX", ((HashMap) (obj)).get("offsetX"));
		if(((HashMap) (obj)).get("offsetY") != null)
			apsmediaoverlay.parameters.put("offsetY", ((HashMap) (obj)).get("offsetY"));
		if(((HashMap) (obj)).get("initialAlpha") != null)
			apsmediaoverlay.parameters.put("initialAlpha", ((Object) (Float.valueOf(((Double)((HashMap) (obj)).get("initialAlpha")).floatValue()))));
		if(((HashMap) (obj)).get("finalAlpha") != null)
			apsmediaoverlay.parameters.put("finalAlpha", ((Object) (Float.valueOf(((Double)((HashMap) (obj)).get("finalAlpha")).floatValue()))));
		if(((HashMap) (obj)).get("show") != null)
			apsmediaoverlay.parameters.put("show", ((Object) (Boolean.valueOf(true ^ ((Boolean)((HashMap) (obj)).get("show")).booleanValue()))));
		if(((HashMap) (obj)).get("tracking") != null)
			apsmediaoverlay.parameters.put("tracking", ((Object) (VPUtilities.arrayValuesToURLs((ArrayList)((HashMap) (obj)).get("tracking")))));
		if(((HashMap) (obj)).get("activationOffset") != null)
			apsmediaoverlay.parameters.put("activationOffset", ((HashMap) (obj)).get("activationOffset"));
		if(hashmap.get("metadata") != null)
			apsmediaoverlay.metadata = new HashMap(((java.util.Map) ((LinkedTreeMap)hashmap.get("metadata"))));
		return apsmediaoverlay;
		return null;
	//* 695 1627:goto            1222
	}

	public static com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition positionFromString(String s)
	{
		if(s.equals("top"))
	//*   0    0:aload_0         
	//*   1    1:ldc2            #360 <String "top">
	//*   2    4:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*   3    7:ifeq            14
			return com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTop;
	//    4   10:getstatic       #365 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTop>
	//    5   13:areturn         
		if(s.equals("topLeft"))
	//*   6   14:aload_0         
	//*   7   15:ldc2            #367 <String "topLeft">
	//*   8   18:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*   9   21:ifeq            28
			return com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTopLeft;
	//   10   24:getstatic       #370 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTopLeft>
	//   11   27:areturn         
		if(s.equals("topRight"))
	//*  12   28:aload_0         
	//*  13   29:ldc2            #372 <String "topRight">
	//*  14   32:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*  15   35:ifeq            42
			return com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionTopRight;
	//   16   38:getstatic       #375 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionTopRight>
	//   17   41:areturn         
		if(s.equals("bottomLeft"))
	//*  18   42:aload_0         
	//*  19   43:ldc2            #377 <String "bottomLeft">
	//*  20   46:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*  21   49:ifeq            56
			return com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft;
	//   22   52:getstatic       #380 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomLeft>
	//   23   55:areturn         
		if(s.equals("bottomRight"))
	//*  24   56:aload_0         
	//*  25   57:ldc2            #382 <String "bottomRight">
	//*  26   60:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*  27   63:ifeq            70
			return com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight;
	//   28   66:getstatic       #385 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottomRight>
	//   29   69:areturn         
		if(s.equals("left"))
	//*  30   70:aload_0         
	//*  31   71:ldc2            #387 <String "left">
	//*  32   74:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*  33   77:ifeq            84
			return com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionLeft;
	//   34   80:getstatic       #390 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionLeft>
	//   35   83:areturn         
		if(s.equals("right"))
	//*  36   84:aload_0         
	//*  37   85:ldc2            #392 <String "right">
	//*  38   88:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*  39   91:ifeq            98
			return com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionRight;
	//   40   94:getstatic       #395 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionRight>
	//   41   97:areturn         
		if(s.equals("fullscreen"))
	//*  42   98:aload_0         
	//*  43   99:ldc1            #182 <String "fullscreen">
	//*  44  101:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*  45  104:ifeq            111
			return com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen;
	//   46  107:getstatic       #398 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen>
	//   47  110:areturn         
		else
			return com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionBottom;
	//   48  111:getstatic       #401 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionBottom>
	//   49  114:areturn         
	}

	public static APSMediaUnit unitFromDictionary(HashMap hashmap)
	{
		boolean flag;
		APSMediaUnit apsmediaunit;
label0:
		{
label1:
			{
				Object obj;
label2:
				{
					int i;
label3:
					{
						if(hashmap == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
							return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
						apsmediaunit = new APSMediaUnit();
	//    4    6:new             #405 <Class APSMediaUnit>
	//    5    9:dup             
	//    6   10:invokespecial   #406 <Method void APSMediaUnit()>
	//    7   13:astore_3        
						if(hashmap.get("autoplay") != null)
	//*   8   14:aload_0         
	//*   9   15:ldc2            #408 <String "autoplay">
	//*  10   18:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  11   21:ifnull          41
							apsmediaunit.shouldAutoplay = ((Boolean)hashmap.get("autoplay")).booleanValue();
	//   12   24:aload_3         
	//   13   25:aload_0         
	//   14   26:ldc2            #408 <String "autoplay">
	//   15   29:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   16   32:checkcast       #142 <Class Boolean>
	//   17   35:invokevirtual   #351 <Method boolean Boolean.booleanValue()>
	//   18   38:putfield        #411 <Field boolean APSMediaUnit.shouldAutoplay>
						if(hashmap.get("manager") != null)
	//*  19   41:aload_0         
	//*  20   42:ldc2            #413 <String "manager">
	//*  21   45:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  22   48:ifnull          65
							apsmediaunit.manager = (String)hashmap.get("manager");
	//   23   51:aload_3         
	//   24   52:aload_0         
	//   25   53:ldc2            #413 <String "manager">
	//   26   56:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   27   59:checkcast       #58  <Class String>
	//   28   62:putfield        #415 <Field String APSMediaUnit.manager>
						if(hashmap.get("renderer") != null)
	//*  29   65:aload_0         
	//*  30   66:ldc2            #417 <String "renderer">
	//*  31   69:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  32   72:ifnull          89
							apsmediaunit.renderer = (String)hashmap.get("renderer");
	//   33   75:aload_3         
	//   34   76:aload_0         
	//   35   77:ldc2            #417 <String "renderer">
	//   36   80:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   37   83:checkcast       #58  <Class String>
	//   38   86:putfield        #419 <Field String APSMediaUnit.renderer>
						obj = hashmap.get("url");
	//   39   89:aload_0         
	//   40   90:ldc2            #292 <String "url">
	//   41   93:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   42   96:astore          4
						flag = false;
	//   43   98:iconst_0        
	//   44   99:istore_2        
						if(obj != null)
	//*  45  100:aload           4
	//*  46  102:ifnull          122
							apsmediaunit.url = VPUtilities.sanitizeUnitUrl(hashmap.get("url"));
	//   47  105:aload_3         
	//   48  106:aload_0         
	//   49  107:ldc2            #292 <String "url">
	//   50  110:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   51  113:invokestatic    #422 <Method String VPUtilities.sanitizeUnitUrl(Object)>
	//   52  116:putfield        #424 <Field String APSMediaUnit.url>
						else
	//*  53  119:goto            377
						if(hashmap.get("youtube") != null)
	//*  54  122:aload_0         
	//*  55  123:ldc2            #426 <String "youtube">
	//*  56  126:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  57  129:ifnull          251
						{
							obj = ((Object) (new APSMediaOverlay()));
	//   58  132:new             #199 <Class APSMediaOverlay>
	//   59  135:dup             
	//   60  136:invokespecial   #200 <Method void APSMediaOverlay()>
	//   61  139:astore          4
							obj.type = "com.appscend.mp.overlays.youtube";
	//   62  141:aload           4
	//   63  143:ldc2            #428 <String "com.appscend.mp.overlays.youtube">
	//   64  146:putfield        #214 <Field String APSMediaOverlay.type>
							obj.position = com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen;
	//   65  149:aload           4
	//   66  151:getstatic       #398 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen>
	//   67  154:putfield        #223 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
							HashMap hashmap1 = new HashMap();
	//   68  157:new             #85  <Class HashMap>
	//   69  160:dup             
	//   70  161:invokespecial   #86  <Method void HashMap()>
	//   71  164:astore          5
							hashmap1.put("youtube", hashmap.get("youtube"));
	//   72  166:aload           5
	//   73  168:ldc2            #426 <String "youtube">
	//   74  171:aload_0         
	//   75  172:ldc2            #426 <String "youtube">
	//   76  175:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   77  178:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//   78  181:pop             
							obj.parameters = hashmap1;
	//   79  182:aload           4
	//   80  184:aload           5
	//   81  186:putfield        #275 <Field HashMap APSMediaOverlay.parameters>
							((APSMediaOverlay) (obj)).setStartPoint("0");
	//   82  189:aload           4
	//   83  191:ldc2            #430 <String "0">
	//   84  194:invokevirtual   #257 <Method void APSMediaOverlay.setStartPoint(String)>
							((APSMediaOverlay) (obj)).setEndPoint(String.valueOf(0x7fffffff));
	//   85  197:aload           4
	//   86  199:ldc2            #431 <Int 0x7fffffff>
	//   87  202:invokestatic    #434 <Method String String.valueOf(int)>
	//   88  205:invokevirtual   #262 <Method void APSMediaOverlay.setEndPoint(String)>
							obj.zIndex = 0;
	//   89  208:aload           4
	//   90  210:iconst_0        
	//   91  211:putfield        #438 <Field int APSMediaOverlay.zIndex>
							apsmediaunit.addOverlay(((APSMediaOverlay) (obj)));
	//   92  214:aload_3         
	//   93  215:aload           4
	//   94  217:invokevirtual   #442 <Method void APSMediaUnit.addOverlay(APSMediaOverlay)>
							obj = ((Object) (new HashMap()));
	//   95  220:new             #85  <Class HashMap>
	//   96  223:dup             
	//   97  224:invokespecial   #86  <Method void HashMap()>
	//   98  227:astore          4
							((HashMap) (obj)).put("components", ((Object) (Integer.valueOf(79))));
	//   99  229:aload           4
	//  100  231:ldc1            #155 <String "components">
	//  101  233:bipush          79
	//  102  235:invokestatic    #191 <Method Integer Integer.valueOf(int)>
	//  103  238:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//  104  241:pop             
							apsmediaunit.controlsParameters = ((HashMap) (obj));
	//  105  242:aload_3         
	//  106  243:aload           4
	//  107  245:putfield        #445 <Field HashMap APSMediaUnit.controlsParameters>
						} else
	//* 108  248:goto            377
						if(hashmap.get("vimeo") != null)
	//* 109  251:aload_0         
	//* 110  252:ldc2            #447 <String "vimeo">
	//* 111  255:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 112  258:ifnull          377
						{
							obj = ((Object) (new APSMediaOverlay()));
	//  113  261:new             #199 <Class APSMediaOverlay>
	//  114  264:dup             
	//  115  265:invokespecial   #200 <Method void APSMediaOverlay()>
	//  116  268:astore          4
							obj.type = "com.appscend.mp.overlays.vimeo";
	//  117  270:aload           4
	//  118  272:ldc2            #449 <String "com.appscend.mp.overlays.vimeo">
	//  119  275:putfield        #214 <Field String APSMediaOverlay.type>
							obj.position = com.appscend.media.events.APSMediaOverlay.APSMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen;
	//  120  278:aload           4
	//  121  280:getstatic       #398 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition.kAPSMediaOverlayPositionFullscreen>
	//  122  283:putfield        #223 <Field com.appscend.media.events.APSMediaOverlay$APSMediaOverlayPosition APSMediaOverlay.position>
							HashMap hashmap2 = new HashMap();
	//  123  286:new             #85  <Class HashMap>
	//  124  289:dup             
	//  125  290:invokespecial   #86  <Method void HashMap()>
	//  126  293:astore          5
							hashmap2.put("vimeo", hashmap.get("vimeo"));
	//  127  295:aload           5
	//  128  297:ldc2            #447 <String "vimeo">
	//  129  300:aload_0         
	//  130  301:ldc2            #447 <String "vimeo">
	//  131  304:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  132  307:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//  133  310:pop             
							obj.parameters = hashmap2;
	//  134  311:aload           4
	//  135  313:aload           5
	//  136  315:putfield        #275 <Field HashMap APSMediaOverlay.parameters>
							((APSMediaOverlay) (obj)).setStartPoint("0");
	//  137  318:aload           4
	//  138  320:ldc2            #430 <String "0">
	//  139  323:invokevirtual   #257 <Method void APSMediaOverlay.setStartPoint(String)>
							((APSMediaOverlay) (obj)).setEndPoint(String.valueOf(0x7fffffff));
	//  140  326:aload           4
	//  141  328:ldc2            #431 <Int 0x7fffffff>
	//  142  331:invokestatic    #434 <Method String String.valueOf(int)>
	//  143  334:invokevirtual   #262 <Method void APSMediaOverlay.setEndPoint(String)>
							obj.zIndex = 0;
	//  144  337:aload           4
	//  145  339:iconst_0        
	//  146  340:putfield        #438 <Field int APSMediaOverlay.zIndex>
							apsmediaunit.addOverlay(((APSMediaOverlay) (obj)));
	//  147  343:aload_3         
	//  148  344:aload           4
	//  149  346:invokevirtual   #442 <Method void APSMediaUnit.addOverlay(APSMediaOverlay)>
							obj = ((Object) (new HashMap()));
	//  150  349:new             #85  <Class HashMap>
	//  151  352:dup             
	//  152  353:invokespecial   #86  <Method void HashMap()>
	//  153  356:astore          4
							((HashMap) (obj)).put("components", ((Object) (Integer.valueOf(79))));
	//  154  358:aload           4
	//  155  360:ldc1            #155 <String "components">
	//  156  362:bipush          79
	//  157  364:invokestatic    #191 <Method Integer Integer.valueOf(int)>
	//  158  367:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//  159  370:pop             
							apsmediaunit.controlsParameters = ((HashMap) (obj));
	//  160  371:aload_3         
	//  161  372:aload           4
	//  162  374:putfield        #445 <Field HashMap APSMediaUnit.controlsParameters>
						}
						if(hashmap.get("subtitlesUrl") != null)
	//* 163  377:aload_0         
	//* 164  378:ldc2            #451 <String "subtitlesUrl">
	//* 165  381:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 166  384:ifnull          401
							apsmediaunit.subtitlesUrl = VPUtilities.sanitizeUnitUrl(hashmap.get("subtitlesUrl"));
	//  167  387:aload_3         
	//  168  388:aload_0         
	//  169  389:ldc2            #451 <String "subtitlesUrl">
	//  170  392:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  171  395:invokestatic    #422 <Method String VPUtilities.sanitizeUnitUrl(Object)>
	//  172  398:putfield        #453 <Field String APSMediaUnit.subtitlesUrl>
						obj = ((Object) ((LinkedTreeMap)hashmap.get("controls")));
	//  173  401:aload_0         
	//  174  402:ldc2            #455 <String "controls">
	//  175  405:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  176  408:checkcast       #278 <Class LinkedTreeMap>
	//  177  411:astore          4
						if(obj == null)
							break label1;
	//  178  413:aload           4
	//  179  415:ifnull          562
						String s1 = (String)((LinkedTreeMap) (obj)).get("position");
	//  180  418:aload           4
	//  181  420:ldc1            #216 <String "position">
	//  182  422:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//  183  425:checkcast       #58  <Class String>
	//  184  428:astore          5
						if(s1 == null)
							break label2;
	//  185  430:aload           5
	//  186  432:ifnull          543
						i = s1.hashCode();
	//  187  435:aload           5
	//  188  437:invokevirtual   #285 <Method int String.hashCode()>
	//  189  440:istore_1        
						if(i != 0xad8d9a2b)
	//* 190  441:iload_1         
	//* 191  442:ldc2            #457 <Int 0xad8d9a2b>
	//* 192  445:icmpeq          474
						{
							if(i == 0x1c155 && s1.equals("top"))
	//* 193  448:iload_1         
	//* 194  449:ldc2            #458 <Int 0x1c155>
	//* 195  452:icmpeq          458
	//* 196  455:goto            490
	//* 197  458:aload           5
	//* 198  460:ldc2            #360 <String "top">
	//* 199  463:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 200  466:ifeq            490
							{
								i = 0;
	//  201  469:iconst_0        
	//  202  470:istore_1        
								break label3;
	//  203  471:goto            492
							}
						} else
						if(s1.equals("bottom"))
	//* 204  474:aload           5
	//* 205  476:ldc2            #460 <String "bottom">
	//* 206  479:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 207  482:ifeq            490
						{
							i = 1;
	//  208  485:iconst_1        
	//  209  486:istore_1        
							break label3;
	//  210  487:goto            492
						}
						i = -1;
	//  211  490:iconst_m1       
	//  212  491:istore_1        
					}
					switch(i)
	//* 213  492:iload_1         
					{
	//* 214  493:tableswitch     0 1: default 516
	//	               0 536
	//	               1 526
					default:
						apsmediaunit.controlsDisplay = com.appscend.media.events.APSMediaUnit.APSMediaControlsDisplay.APSMediaControlsDisplayNone;
	//  215  516:aload_3         
	//  216  517:getstatic       #466 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayNone>
	//  217  520:putfield        #469 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay APSMediaUnit.controlsDisplay>
						break;

	//* 218  523:goto            543
					case 1: // '\001'
						apsmediaunit.controlsDisplay = com.appscend.media.events.APSMediaUnit.APSMediaControlsDisplay.APSMediaControlsDisplayBottom;
	//  219  526:aload_3         
	//  220  527:getstatic       #472 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayBottom>
	//  221  530:putfield        #469 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay APSMediaUnit.controlsDisplay>
						break;

	//* 222  533:goto            543
					case 0: // '\0'
						apsmediaunit.controlsDisplay = com.appscend.media.events.APSMediaUnit.APSMediaControlsDisplay.APSMediaControlsDisplayTop;
	//  223  536:aload_3         
	//  224  537:getstatic       #475 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay.APSMediaControlsDisplayTop>
	//  225  540:putfield        #469 <Field com.appscend.media.events.APSMediaUnit$APSMediaControlsDisplay APSMediaUnit.controlsDisplay>
						break;
					}
				}
				apsmediaunit.controlsParameters = controlsParametersFromDictionary(new HashMap(((java.util.Map) (obj))));
	//  226  543:aload_3         
	//  227  544:new             #85  <Class HashMap>
	//  228  547:dup             
	//  229  548:aload           4
	//  230  550:invokespecial   #281 <Method void HashMap(java.util.Map)>
	//  231  553:invokestatic    #477 <Method HashMap controlsParametersFromDictionary(HashMap)>
	//  232  556:putfield        #445 <Field HashMap APSMediaUnit.controlsParameters>
				break label0;
	//  233  559:goto            576
			}
			apsmediaunit.controlsParameters = controlsParametersFromDictionary(new HashMap());
	//  234  562:aload_3         
	//  235  563:new             #85  <Class HashMap>
	//  236  566:dup             
	//  237  567:invokespecial   #86  <Method void HashMap()>
	//  238  570:invokestatic    #477 <Method HashMap controlsParametersFromDictionary(HashMap)>
	//  239  573:putfield        #445 <Field HashMap APSMediaUnit.controlsParameters>
		}
label4:
		{
label5:
			{
				int j;
label6:
				{
					if(hashmap.get("allowPinch") != null)
	//* 240  576:aload_0         
	//* 241  577:ldc2            #479 <String "allowPinch">
	//* 242  580:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 243  583:ifnull          603
						apsmediaunit.pinchToFullscreen = ((Boolean)hashmap.get("allowPinch")).booleanValue();
	//  244  586:aload_3         
	//  245  587:aload_0         
	//  246  588:ldc2            #479 <String "allowPinch">
	//  247  591:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  248  594:checkcast       #142 <Class Boolean>
	//  249  597:invokevirtual   #351 <Method boolean Boolean.booleanValue()>
	//  250  600:putfield        #482 <Field boolean APSMediaUnit.pinchToFullscreen>
					if(hashmap.get("tracking") != null)
	//* 251  603:aload_0         
	//* 252  604:ldc1            #242 <String "tracking">
	//* 253  606:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 254  609:ifnull          628
						apsmediaunit.trackingURLs = VPUtilities.hashmapValuesToURLs((HashMap)hashmap.get("tracking"));
	//  255  612:aload_3         
	//  256  613:aload_0         
	//  257  614:ldc1            #242 <String "tracking">
	//  258  616:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  259  619:checkcast       #85  <Class HashMap>
	//  260  622:invokestatic    #247 <Method HashMap VPUtilities.hashmapValuesToURLs(HashMap)>
	//  261  625:putfield        #483 <Field HashMap APSMediaUnit.trackingURLs>
					if(hashmap.get("initialPlaybackTime") != null)
	//* 262  628:aload_0         
	//* 263  629:ldc2            #485 <String "initialPlaybackTime">
	//* 264  632:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 265  635:ifnull          667
						apsmediaunit.initialPlaybackTime = (int)Math.floor(Double.parseDouble(String.valueOf(hashmap.get("initialPlaybackTime"))) + 0.5D) * 1000;
	//  266  638:aload_3         
	//  267  639:aload_0         
	//  268  640:ldc2            #485 <String "initialPlaybackTime">
	//  269  643:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  270  646:invokestatic    #228 <Method String String.valueOf(Object)>
	//  271  649:invokestatic    #489 <Method double Double.parseDouble(String)>
	//  272  652:ldc2w           #490 <Double 0.5D>
	//  273  655:dadd            
	//  274  656:invokestatic    #497 <Method double Math.floor(double)>
	//  275  659:d2i             
	//  276  660:sipush          1000
	//  277  663:imul            
	//  278  664:putfield        #499 <Field int APSMediaUnit.initialPlaybackTime>
					if(hashmap.get("overlays") != null)
	//* 279  667:aload_0         
	//* 280  668:ldc2            #501 <String "overlays">
	//* 281  671:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 282  674:ifnull          750
					{
						Iterator iterator = ((ArrayList)hashmap.get("overlays")).iterator();
	//  283  677:aload_0         
	//  284  678:ldc2            #501 <String "overlays">
	//  285  681:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  286  684:checkcast       #56  <Class ArrayList>
	//  287  687:invokevirtual   #159 <Method Iterator ArrayList.iterator()>
	//  288  690:astore          4
						do
						{
							if(!iterator.hasNext())
								break;
	//  289  692:aload           4
	//  290  694:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//  291  699:ifeq            750
							Object obj1 = iterator.next();
	//  292  702:aload           4
	//  293  704:invokeinterface #168 <Method Object Iterator.next()>
	//  294  709:astore          5
							if(obj1 instanceof LinkedTreeMap)
	//* 295  711:aload           5
	//* 296  713:instanceof      #278 <Class LinkedTreeMap>
	//* 297  716:ifeq            692
							{
								obj1 = ((Object) (overlayFromDictionary(new HashMap(((java.util.Map) ((LinkedTreeMap)obj1))))));
	//  298  719:new             #85  <Class HashMap>
	//  299  722:dup             
	//  300  723:aload           5
	//  301  725:checkcast       #278 <Class LinkedTreeMap>
	//  302  728:invokespecial   #281 <Method void HashMap(java.util.Map)>
	//  303  731:invokestatic    #503 <Method APSMediaOverlay overlayFromDictionary(HashMap)>
	//  304  734:astore          5
								if(obj1 != null)
	//* 305  736:aload           5
	//* 306  738:ifnull          692
									apsmediaunit.addOverlay(((APSMediaOverlay) (obj1)));
	//  307  741:aload_3         
	//  308  742:aload           5
	//  309  744:invokevirtual   #442 <Method void APSMediaUnit.addOverlay(APSMediaOverlay)>
							}
						} while(true);
	//  310  747:goto            692
					}
					if(hashmap.get("minimumAdInitialOffset") != null)
	//* 311  750:aload_0         
	//* 312  751:ldc2            #505 <String "minimumAdInitialOffset">
	//* 313  754:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 314  757:ifnull          777
						apsmediaunit.midcontentAdMinimumInitialOffset = ((Double)hashmap.get("minimumAdInitialOffset")).intValue();
	//  315  760:aload_3         
	//  316  761:aload_0         
	//  317  762:ldc2            #505 <String "minimumAdInitialOffset">
	//  318  765:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  319  768:checkcast       #100 <Class Double>
	//  320  771:invokevirtual   #508 <Method int Double.intValue()>
	//  321  774:putfield        #511 <Field int APSMediaUnit.midcontentAdMinimumInitialOffset>
					if(hashmap.get("minimumAdFinalOffset") != null)
	//* 322  777:aload_0         
	//* 323  778:ldc2            #513 <String "minimumAdFinalOffset">
	//* 324  781:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 325  784:ifnull          804
						apsmediaunit.midcontentAdMinimumFinalOffset = ((Double)hashmap.get("minimumAdFinalOffset")).intValue();
	//  326  787:aload_3         
	//  327  788:aload_0         
	//  328  789:ldc2            #513 <String "minimumAdFinalOffset">
	//  329  792:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  330  795:checkcast       #100 <Class Double>
	//  331  798:invokevirtual   #508 <Method int Double.intValue()>
	//  332  801:putfield        #516 <Field int APSMediaUnit.midcontentAdMinimumFinalOffset>
					if(hashmap.get("minimumAdSpacing") != null)
	//* 333  804:aload_0         
	//* 334  805:ldc2            #518 <String "minimumAdSpacing">
	//* 335  808:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 336  811:ifnull          831
						apsmediaunit.midcontentAdMinimumSpacing = ((Double)hashmap.get("minimumAdSpacing")).intValue();
	//  337  814:aload_3         
	//  338  815:aload_0         
	//  339  816:ldc2            #518 <String "minimumAdSpacing">
	//  340  819:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  341  822:checkcast       #100 <Class Double>
	//  342  825:invokevirtual   #508 <Method int Double.intValue()>
	//  343  828:putfield        #521 <Field int APSMediaUnit.midcontentAdMinimumSpacing>
					if(hashmap.get("seekAdHandling") == null)
						break label5;
	//  344  831:aload_0         
	//  345  832:ldc2            #523 <String "seekAdHandling">
	//  346  835:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  347  838:ifnull          962
					String s = (String)hashmap.get("seekAdHandling");
	//  348  841:aload_0         
	//  349  842:ldc2            #523 <String "seekAdHandling">
	//  350  845:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  351  848:checkcast       #58  <Class String>
	//  352  851:astore          4
					j = s.hashCode();
	//  353  853:aload           4
	//  354  855:invokevirtual   #285 <Method int String.hashCode()>
	//  355  858:istore_1        
					if(j != 0x329296)
	//* 356  859:iload_1         
	//* 357  860:ldc2            #524 <Int 0x329296>
	//* 358  863:icmpeq          892
					{
						if(j == 0x5ced2b0 && s.equals("first"))
	//* 359  866:iload_1         
	//* 360  867:ldc2            #525 <Int 0x5ced2b0>
	//* 361  870:icmpeq          876
	//* 362  873:goto            908
	//* 363  876:aload           4
	//* 364  878:ldc2            #527 <String "first">
	//* 365  881:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 366  884:ifeq            908
						{
							j = ((int) (flag));
	//  367  887:iload_2         
	//  368  888:istore_1        
							break label6;
	//  369  889:goto            910
						}
					} else
					if(s.equals("last"))
	//* 370  892:aload           4
	//* 371  894:ldc2            #529 <String "last">
	//* 372  897:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 373  900:ifeq            908
					{
						j = 1;
	//  374  903:iconst_1        
	//  375  904:istore_1        
						break label6;
	//  376  905:goto            910
					}
					j = -1;
	//  377  908:iconst_m1       
	//  378  909:istore_1        
				}
				switch(j)
	//* 379  910:iload_1         
				{
	//* 380  911:tableswitch     0 1: default 932
	//	               0 952
	//	               1 942
				default:
					apsmediaunit.seekHandling = com.appscend.media.events.APSMediaUnit.APSHandleSeekEvent.APSHandleSeekEventPlayAllBreaks;
	//  381  932:aload_3         
	//  382  933:getstatic       #535 <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayAllBreaks>
	//  383  936:putfield        #538 <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent APSMediaUnit.seekHandling>
					break;

	//* 384  939:goto            969
				case 1: // '\001'
					apsmediaunit.seekHandling = com.appscend.media.events.APSMediaUnit.APSHandleSeekEvent.APSHandleSeekEventPlayLastBreak;
	//  385  942:aload_3         
	//  386  943:getstatic       #541 <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayLastBreak>
	//  387  946:putfield        #538 <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent APSMediaUnit.seekHandling>
					break;

	//* 388  949:goto            969
				case 0: // '\0'
					apsmediaunit.seekHandling = com.appscend.media.events.APSMediaUnit.APSHandleSeekEvent.APSHandleSeekEventPlayFirstBreak;
	//  389  952:aload_3         
	//  390  953:getstatic       #544 <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayFirstBreak>
	//  391  956:putfield        #538 <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent APSMediaUnit.seekHandling>
					break;
				}
				break label4;
	//  392  959:goto            969
			}
			apsmediaunit.seekHandling = com.appscend.media.events.APSMediaUnit.APSHandleSeekEvent.APSHandleSeekEventPlayAllBreaks;
	//  393  962:aload_3         
	//  394  963:getstatic       #535 <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent.APSHandleSeekEventPlayAllBreaks>
	//  395  966:putfield        #538 <Field com.appscend.media.events.APSMediaUnit$APSHandleSeekEvent APSMediaUnit.seekHandling>
		}
		if(hashmap.get("metadata") != null)
	//* 396  969:aload_0         
	//* 397  970:ldc2            #355 <String "metadata">
	//* 398  973:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 399  976:ifnull          1005
		{
			hashmap = new HashMap(((java.util.Map) ((LinkedTreeMap)hashmap.get("metadata"))));
	//  400  979:new             #85  <Class HashMap>
	//  401  982:dup             
	//  402  983:aload_0         
	//  403  984:ldc2            #355 <String "metadata">
	//  404  987:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  405  990:checkcast       #278 <Class LinkedTreeMap>
	//  406  993:invokespecial   #281 <Method void HashMap(java.util.Map)>
	//  407  996:astore_0        
			apsmediaunit.metadata.putAll(((java.util.Map) (hashmap)));
	//  408  997:aload_3         
	//  409  998:getfield        #545 <Field HashMap APSMediaUnit.metadata>
	//  410 1001:aload_0         
	//  411 1002:invokevirtual   #548 <Method void HashMap.putAll(java.util.Map)>
		}
		return apsmediaunit;
	//  412 1005:aload_3         
	//  413 1006:areturn         
	}

	public ArrayList adBreaksForVMAP()
	{
		Object obj;
		APSVASTRootNode apsvastrootnode;
label0:
		{
			obj = ((Object) (userAgent));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String userAgent>
	//    2    4:astore          6
			if(obj != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          20
				System.setProperty("http.agent", ((String) (obj)));
	//    5   11:ldc2            #557 <String "http.agent">
	//    6   14:aload           6
	//    7   16:invokestatic    #563 <Method String System.setProperty(String, String)>
	//    8   19:pop             
			apsvastrootnode = null;
	//    9   20:aconst_null     
	//   10   21:astore          7
			try
			{
				obj = ((Object) ((String)(new getDataAsync()).execute(((Object []) (new URL[] {
					new URL(vmapURL)
				}))).get()));
	//   11   23:new             #17  <Class APSMediaBuilder$getDataAsync>
	//   12   26:dup             
	//   13   27:invokespecial   #564 <Method void APSMediaBuilder$getDataAsync()>
	//   14   30:iconst_1        
	//   15   31:anewarray       URL[]
	//   16   34:dup             
	//   17   35:iconst_0        
	//   18   36:new             #566 <Class URL>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:getfield        #568 <Field String vmapURL>
	//   22   44:invokespecial   #570 <Method void URL(String)>
	//   23   47:aastore         
	//   24   48:invokevirtual   #571 <Method AsyncTask APSMediaBuilder$getDataAsync.execute(Object[])>
	//   25   51:invokevirtual   #130 <Method Object AsyncTask.get()>
	//   26   54:checkcast       #58  <Class String>
	//   27   57:astore          6
			}
	//*  28   59:goto            72
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  29   62:astore          6
			{
				((Exception) (obj)).printStackTrace();
	//   30   64:aload           6
	//   31   66:invokevirtual   #574 <Method void Exception.printStackTrace()>
				obj = null;
	//   32   69:aconst_null     
	//   33   70:astore          6
			}
			if(obj == null)
	//*  34   72:aload           6
	//*  35   74:ifnonnull       85
				return new ArrayList();
	//   36   77:new             #56  <Class ArrayList>
	//   37   80:dup             
	//   38   81:invokespecial   #575 <Method void ArrayList()>
	//   39   84:areturn         
			try
			{
				obj = ((Object) ((new SAXBuilder()).build(((java.io.Reader) (new StringReader(((String) (obj))))))));
	//   40   85:new             #577 <Class SAXBuilder>
	//   41   88:dup             
	//   42   89:invokespecial   #578 <Method void SAXBuilder()>
	//   43   92:new             #580 <Class StringReader>
	//   44   95:dup             
	//   45   96:aload           6
	//   46   98:invokespecial   #581 <Method void StringReader(String)>
	//   47  101:invokevirtual   #585 <Method Document SAXBuilder.build(java.io.Reader)>
	//   48  104:astore          6
				break label0;
	//   49  106:goto            124
			}
	//*  50  109:astore          6
	//*  51  111:goto            116
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
	//   52  114:astore          6
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
			((Exception) (obj)).printStackTrace();
	//   53  116:aload           6
	//   54  118:invokevirtual   #574 <Method void Exception.printStackTrace()>
			obj = null;
	//   55  121:aconst_null     
	//   56  122:astore          6
		}
		if(obj != null && ((Document) (obj)).getRootElement() != null)
	//*  57  124:aload           6
	//*  58  126:ifnull          147
	//*  59  129:aload           6
	//*  60  131:invokevirtual   #591 <Method org.jdom2.Element Document.getRootElement()>
	//*  61  134:ifnull          147
			obj = ((Object) (((Document) (obj)).getRootElement()));
	//   62  137:aload           6
	//   63  139:invokevirtual   #591 <Method org.jdom2.Element Document.getRootElement()>
	//   64  142:astore          6
		else
	//*  65  144:goto            150
			obj = null;
	//   66  147:aconst_null     
	//   67  148:astore          6
		if(obj != null)
	//*  68  150:aload           6
	//*  69  152:ifnull          171
		{
			apsvastrootnode = new APSVASTRootNode();
	//   70  155:new             #593 <Class APSVASTRootNode>
	//   71  158:dup             
	//   72  159:invokespecial   #594 <Method void APSVASTRootNode()>
	//   73  162:astore          7
			apsvastrootnode.initWithTBXMLElement(((org.jdom2.Element) (obj)));
	//   74  164:aload           7
	//   75  166:aload           6
	//   76  168:invokevirtual   #598 <Method void APSVASTRootNode.initWithTBXMLElement(org.jdom2.Element)>
		}
		if(apsvastrootnode == null)
	//*  77  171:aload           7
	//*  78  173:ifnonnull       184
			return new ArrayList();
	//   79  176:new             #56  <Class ArrayList>
	//   80  179:dup             
	//   81  180:invokespecial   #575 <Method void ArrayList()>
	//   82  183:areturn         
		ArrayList arraylist = new ArrayList();
	//   83  184:new             #56  <Class ArrayList>
	//   84  187:dup             
	//   85  188:invokespecial   #575 <Method void ArrayList()>
	//   86  191:astore          8
		Iterator iterator2 = apsvastrootnode.childrenNamed("AdBreak").iterator();
	//   87  193:aload           7
	//   88  195:ldc2            #600 <String "AdBreak">
	//   89  198:invokevirtual   #604 <Method ArrayList APSVASTRootNode.childrenNamed(String)>
	//   90  201:invokevirtual   #159 <Method Iterator ArrayList.iterator()>
	//   91  204:astore          9
label1:
		do
		{
label2:
			{
				APSVASTXMLNode apsvastxmlnode3;
				String as[];
				String s;
				APSVASTXMLNode apsvastxmlnode4;
				do
				{
					if(!iterator2.hasNext())
						break label2;
	//   92  206:aload           9
	//   93  208:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//   94  213:ifeq            862
					apsvastxmlnode3 = (APSVASTXMLNode)iterator2.next();
	//   95  216:aload           9
	//   96  218:invokeinterface #168 <Method Object Iterator.next()>
	//   97  223:checkcast       #606 <Class APSVASTXMLNode>
	//   98  226:astore          10
					as = ((String)apsvastxmlnode3.attributes.get("breakType")).trim().split(",");
	//   99  228:aload           10
	//  100  230:getfield        #609 <Field HashMap APSVASTXMLNode.attributes>
	//  101  233:ldc2            #611 <String "breakType">
	//  102  236:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  103  239:checkcast       #58  <Class String>
	//  104  242:invokevirtual   #615 <Method String String.trim()>
	//  105  245:ldc2            #617 <String ",">
	//  106  248:invokevirtual   #621 <Method String[] String.split(String)>
	//  107  251:astore          11
					s = (String)apsvastxmlnode3.attributes.get("timeOffset");
	//  108  253:aload           10
	//  109  255:getfield        #609 <Field HashMap APSVASTXMLNode.attributes>
	//  110  258:ldc2            #623 <String "timeOffset">
	//  111  261:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  112  264:checkcast       #58  <Class String>
	//  113  267:astore          12
					apsvastxmlnode4 = apsvastxmlnode3.firstChildNamed("AdSource");
	//  114  269:aload           10
	//  115  271:ldc2            #625 <String "AdSource">
	//  116  274:invokevirtual   #629 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//  117  277:astore          13
				} while(apsvastxmlnode4 == null);
	//  118  279:aload           13
	//  119  281:ifnull          206
				int j = as.length;
	//  120  284:aload           11
	//  121  286:arraylength     
	//  122  287:istore_3        
				int i = 0;
	//  123  288:iconst_0        
	//  124  289:istore_2        
				do
				{
					APSVastAdBreak apsvastadbreak;
					String s1;
label3:
					{
						if(i >= j)
							continue label1;
	//  125  290:iload_2         
	//  126  291:iload_3         
	//  127  292:icmpge          206
						s1 = as[i];
	//  128  295:aload           11
	//  129  297:iload_2         
	//  130  298:aaload          
	//  131  299:astore          15
						apsvastadbreak = APSVastAdBreak.copyAdBreak(adBreakTemplate);
	//  132  301:aload_0         
	//  133  302:getfield        #78  <Field APSVastAdBreak adBreakTemplate>
	//  134  305:invokestatic    #633 <Method APSVastAdBreak APSVastAdBreak.copyAdBreak(APSVastAdBreak)>
	//  135  308:astore          14
						if(apsvastxmlnode4.firstChildNamed("VASTData") != null)
	//* 136  310:aload           13
	//* 137  312:ldc2            #635 <String "VASTData">
	//* 138  315:invokevirtual   #629 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//* 139  318:ifnull          393
						{
							APSVASTRootNode apsvastrootnode1 = new APSVASTRootNode();
	//  140  321:new             #593 <Class APSVASTRootNode>
	//  141  324:dup             
	//  142  325:invokespecial   #594 <Method void APSVASTRootNode()>
	//  143  328:astore          16
							APSVASTXMLNode apsvastxmlnode1 = apsvastxmlnode4.firstChildNamed("VASTData").firstChildNamed("VAST");
	//  144  330:aload           13
	//  145  332:ldc2            #635 <String "VASTData">
	//  146  335:invokevirtual   #629 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//  147  338:ldc2            #637 <String "VAST">
	//  148  341:invokevirtual   #629 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//  149  344:astore          7
							APSVASTXMLNode apsvastxmlnode = apsvastxmlnode1;
	//  150  346:aload           7
	//  151  348:astore          6
							if(apsvastxmlnode1 == null)
	//* 152  350:aload           7
	//* 153  352:ifnonnull       371
								apsvastxmlnode = apsvastxmlnode4.firstChildNamed("VASTData").firstChildNamed("VideoAdServingTemplate");
	//  154  355:aload           13
	//  155  357:ldc2            #635 <String "VASTData">
	//  156  360:invokevirtual   #629 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//  157  363:ldc2            #639 <String "VideoAdServingTemplate">
	//  158  366:invokevirtual   #629 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//  159  369:astore          6
							if(apsvastxmlnode != null)
	//* 160  371:aload           6
	//* 161  373:ifnull          206
							{
								apsvastrootnode1.initWithNode(apsvastxmlnode);
	//  162  376:aload           16
	//  163  378:aload           6
	//  164  380:invokevirtual   #643 <Method void APSVASTRootNode.initWithNode(APSVASTXMLNode)>
								apsvastadbreak.addSource(((APSVASTXMLNode) (apsvastrootnode1)));
	//  165  383:aload           14
	//  166  385:aload           16
	//  167  387:invokevirtual   #646 <Method void APSVastAdBreak.addSource(APSVASTXMLNode)>
								break label3;
	//  168  390:goto            448
							}
							continue label1;
						}
						if(apsvastxmlnode4.firstChildNamed("AdTagURI") != null)
	//* 169  393:aload           13
	//* 170  395:ldc2            #648 <String "AdTagURI">
	//* 171  398:invokevirtual   #629 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//* 172  401:ifnull          448
						{
							for(Iterator iterator = apsvastxmlnode4.childrenNamed("AdTagURI").iterator(); iterator.hasNext(); apsvastadbreak.addSource(((APSVASTXMLNode)iterator.next()).value));
	//  173  404:aload           13
	//  174  406:ldc2            #648 <String "AdTagURI">
	//  175  409:invokevirtual   #649 <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//  176  412:invokevirtual   #159 <Method Iterator ArrayList.iterator()>
	//  177  415:astore          6
	//  178  417:aload           6
	//  179  419:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//  180  424:ifeq            448
	//  181  427:aload           14
	//  182  429:aload           6
	//  183  431:invokeinterface #168 <Method Object Iterator.next()>
	//  184  436:checkcast       #606 <Class APSVASTXMLNode>
	//  185  439:getfield        #652 <Field String APSVASTXMLNode.value>
	//  186  442:invokevirtual   #654 <Method void APSVastAdBreak.addSource(String)>
						}
					}
	//* 187  445:goto            417
					if(s1.equals("linear"))
	//* 188  448:aload           15
	//* 189  450:ldc2            #656 <String "linear">
	//* 190  453:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 191  456:ifeq            580
					{
						byte byte0 = -1;
	//  192  459:iconst_m1       
	//  193  460:istore_1        
						int k = s.hashCode();
	//  194  461:aload           12
	//  195  463:invokevirtual   #285 <Method int String.hashCode()>
	//  196  466:istore          4
						if(k != 0x188db)
	//* 197  468:iload           4
	//* 198  470:ldc2            #657 <Int 0x188db>
	//* 199  473:icmpeq          502
						{
							if(k == 0x68ac462 && s.equals("start"))
	//* 200  476:iload           4
	//* 201  478:ldc2            #658 <Int 0x68ac462>
	//* 202  481:icmpeq          487
	//* 203  484:goto            515
	//* 204  487:aload           12
	//* 205  489:ldc1            #253 <String "start">
	//* 206  491:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 207  494:ifeq            515
								byte0 = 0;
	//  208  497:iconst_0        
	//  209  498:istore_1        
						} else
	//* 210  499:goto            515
						if(s.equals("end"))
	//* 211  502:aload           12
	//* 212  504:ldc2            #259 <String "end">
	//* 213  507:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 214  510:ifeq            515
							byte0 = 1;
	//  215  513:iconst_1        
	//  216  514:istore_1        
						switch(byte0)
	//* 217  515:iload_1         
						{
	//* 218  516:tableswitch     0 1: default 540
	//	               0 569
	//	               1 558
						default:
							apsvastadbreak.type = com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTMidContent;
	//  219  540:aload           14
	//  220  542:getstatic       #664 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTMidContent>
	//  221  545:putfield        #666 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
							apsvastadbreak.adOffset = s;
	//  222  548:aload           14
	//  223  550:aload           12
	//  224  552:putfield        #669 <Field String APSVastAdBreak.adOffset>
							break;

	//* 225  555:goto            606
						case 1: // '\001'
							apsvastadbreak.type = com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTPostContent;
	//  226  558:aload           14
	//  227  560:getstatic       #672 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPostContent>
	//  228  563:putfield        #666 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
							break;

	//* 229  566:goto            606
						case 0: // '\0'
							apsvastadbreak.type = com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTPreContent;
	//  230  569:aload           14
	//  231  571:getstatic       #675 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPreContent>
	//  232  574:putfield        #666 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
							break;
						}
					} else
	//* 233  577:goto            606
					if(s1.equals("nonlinear"))
	//* 234  580:aload           15
	//* 235  582:ldc2            #677 <String "nonlinear">
	//* 236  585:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 237  588:ifeq            606
					{
						apsvastadbreak.type = com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTNonLinear;
	//  238  591:aload           14
	//  239  593:getstatic       #680 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTNonLinear>
	//  240  596:putfield        #666 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
						apsvastadbreak.adOffset = s;
	//  241  599:aload           14
	//  242  601:aload           12
	//  243  603:putfield        #669 <Field String APSVastAdBreak.adOffset>
					}
					apsvastadbreak.trackingURLs = new HashMap();
	//  244  606:aload           14
	//  245  608:new             #85  <Class HashMap>
	//  246  611:dup             
	//  247  612:invokespecial   #86  <Method void HashMap()>
	//  248  615:putfield        #681 <Field HashMap APSVastAdBreak.trackingURLs>
					if(apsvastxmlnode4.firstChildNamed("TrackingEvents") != null)
	//* 249  618:aload           13
	//* 250  620:ldc2            #683 <String "TrackingEvents">
	//* 251  623:invokevirtual   #629 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//* 252  626:ifnull          705
					{
						APSVASTXMLNode apsvastxmlnode2;
						String s2;
						for(Iterator iterator1 = apsvastxmlnode4.firstChildNamed("TrackingEvents").childrenNamed("Tracking").iterator(); iterator1.hasNext(); apsvastadbreak.trackingURLs.put(((Object) (s2)), ((Object) (apsvastxmlnode2.urlsForCurrentNode()))))
	//* 253  629:aload           13
	//* 254  631:ldc2            #683 <String "TrackingEvents">
	//* 255  634:invokevirtual   #629 <Method APSVASTXMLNode APSVASTXMLNode.firstChildNamed(String)>
	//* 256  637:ldc2            #685 <String "Tracking">
	//* 257  640:invokevirtual   #649 <Method ArrayList APSVASTXMLNode.childrenNamed(String)>
	//* 258  643:invokevirtual   #159 <Method Iterator ArrayList.iterator()>
	//* 259  646:astore          6
	//* 260  648:aload           6
	//* 261  650:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//* 262  655:ifeq            705
						{
							apsvastxmlnode2 = (APSVASTXMLNode)iterator1.next();
	//  263  658:aload           6
	//  264  660:invokeinterface #168 <Method Object Iterator.next()>
	//  265  665:checkcast       #606 <Class APSVASTXMLNode>
	//  266  668:astore          7
							s2 = (String)apsvastxmlnode2.attributes.get("event");
	//  267  670:aload           7
	//  268  672:getfield        #609 <Field HashMap APSVASTXMLNode.attributes>
	//  269  675:ldc2            #687 <String "event">
	//  270  678:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  271  681:checkcast       #58  <Class String>
	//  272  684:astore          15
						}

	//  273  686:aload           14
	//  274  688:getfield        #681 <Field HashMap APSVastAdBreak.trackingURLs>
	//  275  691:aload           15
	//  276  693:aload           7
	//  277  695:invokevirtual   #690 <Method ArrayList APSVASTXMLNode.urlsForCurrentNode()>
	//  278  698:invokevirtual   #96  <Method Object HashMap.put(Object, Object)>
	//  279  701:pop             
					}
	//* 280  702:goto            648
					if(apsvastxmlnode3.attributes.get("repeatAfter") != null)
	//* 281  705:aload           10
	//* 282  707:getfield        #609 <Field HashMap APSVASTXMLNode.attributes>
	//* 283  710:ldc2            #692 <String "repeatAfter">
	//* 284  713:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 285  716:ifnull          741
						apsvastadbreak.repeatAfter = Long.parseLong((String)apsvastxmlnode3.attributes.get("repeatAfter"));
	//  286  719:aload           14
	//  287  721:aload           10
	//  288  723:getfield        #609 <Field HashMap APSVASTXMLNode.attributes>
	//  289  726:ldc2            #692 <String "repeatAfter">
	//  290  729:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  291  732:checkcast       #58  <Class String>
	//  292  735:invokestatic    #698 <Method long Long.parseLong(String)>
	//  293  738:putfield        #701 <Field long APSVastAdBreak.repeatAfter>
					boolean flag;
					if(apsvastxmlnode4.attributes.get("allowMultipleAds") != null && !((String)apsvastxmlnode4.attributes.get("allowMultipleAds")).equals("false"))
	//* 294  741:aload           13
	//* 295  743:getfield        #609 <Field HashMap APSVASTXMLNode.attributes>
	//* 296  746:ldc2            #703 <String "allowMultipleAds">
	//* 297  749:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 298  752:ifnull          784
	//* 299  755:aload           13
	//* 300  757:getfield        #609 <Field HashMap APSVASTXMLNode.attributes>
	//* 301  760:ldc2            #703 <String "allowMultipleAds">
	//* 302  763:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 303  766:checkcast       #58  <Class String>
	//* 304  769:ldc2            #705 <String "false">
	//* 305  772:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 306  775:ifne            784
						flag = true;
	//  307  778:iconst_1        
	//  308  779:istore          5
					else
	//* 309  781:goto            787
						flag = false;
	//  310  784:iconst_0        
	//  311  785:istore          5
					apsvastadbreak.allowMultipleAds = flag;
	//  312  787:aload           14
	//  313  789:iload           5
	//  314  791:putfield        #707 <Field boolean APSVastAdBreak.allowMultipleAds>
					if(apsvastxmlnode4.attributes.get("followRedirects") != null && !((String)apsvastxmlnode4.attributes.get("followRedirects")).equals("false"))
	//* 315  794:aload           13
	//* 316  796:getfield        #609 <Field HashMap APSVASTXMLNode.attributes>
	//* 317  799:ldc2            #709 <String "followRedirects">
	//* 318  802:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 319  805:ifnull          837
	//* 320  808:aload           13
	//* 321  810:getfield        #609 <Field HashMap APSVASTXMLNode.attributes>
	//* 322  813:ldc2            #709 <String "followRedirects">
	//* 323  816:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 324  819:checkcast       #58  <Class String>
	//* 325  822:ldc2            #705 <String "false">
	//* 326  825:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 327  828:ifne            837
						flag = true;
	//  328  831:iconst_1        
	//  329  832:istore          5
					else
	//* 330  834:goto            840
						flag = false;
	//  331  837:iconst_0        
	//  332  838:istore          5
					apsvastadbreak.followWrappers = flag;
	//  333  840:aload           14
	//  334  842:iload           5
	//  335  844:putfield        #712 <Field boolean APSVastAdBreak.followWrappers>
					arraylist.add(((Object) (apsvastadbreak)));
	//  336  847:aload           8
	//  337  849:aload           14
	//  338  851:invokevirtual   #715 <Method boolean ArrayList.add(Object)>
	//  339  854:pop             
					i++;
	//  340  855:iload_2         
	//  341  856:iconst_1        
	//  342  857:iadd            
	//  343  858:istore_2        
				} while(true);
	//  344  859:goto            290
			}
			return arraylist;
	//  345  862:aload           8
	//  346  864:areturn         
		} while(true);
	}

	public boolean configureFromData(String s)
	{
		try
		{
			s = ((String) ((HashMap)(new Gson()).fromJson(s, java/util/HashMap)));
	//    0    0:new             #720 <Class Gson>
	//    1    3:dup             
	//    2    4:invokespecial   #721 <Method void Gson()>
	//    3    7:aload_1         
	//    4    8:ldc1            #85  <Class HashMap>
	//    5   10:invokevirtual   #725 <Method Object Gson.fromJson(String, Class)>
	//    6   13:checkcast       #85  <Class HashMap>
	//    7   16:astore_1        
		}
	//*   8   17:goto            27
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   9   20:astore_1        
		{
			((Exception) (s)).printStackTrace();
	//   10   21:aload_1         
	//   11   22:invokevirtual   #574 <Method void Exception.printStackTrace()>
			s = null;
	//   12   25:aconst_null     
	//   13   26:astore_1        
		}
		return s != null && ((HashMap) (s)).get("content") != null && configureFromDictionary(((HashMap) (s)));
	//   14   27:aload_1         
	//   15   28:ifnull          51
	//   16   31:aload_1         
	//   17   32:ldc2            #727 <String "content">
	//   18   35:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   19   38:ifnull          51
	//   20   41:aload_0         
	//   21   42:aload_1         
	//   22   43:invokevirtual   #731 <Method boolean configureFromDictionary(HashMap)>
	//   23   46:ifeq            51
	//   24   49:iconst_1        
	//   25   50:ireturn         
	//   26   51:iconst_0        
	//   27   52:ireturn         
	}

	public boolean configureFromDictionary(HashMap hashmap)
	{
		if(hashmap.get("content") == null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ldc2            #727 <String "content">
	//    2    4:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//    3    7:ifnull          123
_L1:
		contentUnits = new ArrayList();
	//    4   10:aload_0         
	//    5   11:new             #56  <Class ArrayList>
	//    6   14:dup             
	//    7   15:invokespecial   #575 <Method void ArrayList()>
	//    8   18:putfield        #735 <Field ArrayList contentUnits>
		Iterator iterator = ((ArrayList)hashmap.get("content")).iterator();
	//    9   21:aload_1         
	//   10   22:ldc2            #727 <String "content">
	//   11   25:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   12   28:checkcast       #56  <Class ArrayList>
	//   13   31:invokevirtual   #159 <Method Iterator ArrayList.iterator()>
	//   14   34:astore          4
_L5:
		if(!iterator.hasNext()) goto _L2; else goto _L3
	//   15   36:aload           4
	//   16   38:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//   17   43:ifeq            123
_L3:
		APSMediaUnit apsmediaunit1 = unitFromDictionary(new HashMap(((java.util.Map) ((LinkedTreeMap)iterator.next()))));
	//   18   46:new             #85  <Class HashMap>
	//   19   49:dup             
	//   20   50:aload           4
	//   21   52:invokeinterface #168 <Method Object Iterator.next()>
	//   22   57:checkcast       #278 <Class LinkedTreeMap>
	//   23   60:invokespecial   #281 <Method void HashMap(java.util.Map)>
	//   24   63:invokestatic    #737 <Method APSMediaUnit unitFromDictionary(HashMap)>
	//   25   66:astore          5
		if(apsmediaunit1 == null) goto _L5; else goto _L4
	//   26   68:aload           5
	//   27   70:ifnull          36
_L4:
		contentUnits.add(((Object) (apsmediaunit1)));
	//   28   73:aload_0         
	//   29   74:getfield        #735 <Field ArrayList contentUnits>
	//   30   77:aload           5
	//   31   79:invokevirtual   #715 <Method boolean ArrayList.add(Object)>
	//   32   82:pop             
		  goto _L5
	//*  33   83:goto            36
_L7:
		APSMediaUnit apsmediaunit = unitFromDictionary(new HashMap(((java.util.Map) ((LinkedTreeMap)hashmap.get("content")))));
	//   34   86:new             #85  <Class HashMap>
	//   35   89:dup             
	//   36   90:aload_1         
	//   37   91:ldc2            #727 <String "content">
	//   38   94:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   39   97:checkcast       #278 <Class LinkedTreeMap>
	//   40  100:invokespecial   #281 <Method void HashMap(java.util.Map)>
	//   41  103:invokestatic    #737 <Method APSMediaUnit unitFromDictionary(HashMap)>
	//   42  106:astore          4
		if(apsmediaunit != null)
	//*  43  108:aload           4
	//*  44  110:ifnull          123
			contentUnits.add(((Object) (apsmediaunit)));
	//   45  113:aload_0         
	//   46  114:getfield        #735 <Field ArrayList contentUnits>
	//   47  117:aload           4
	//   48  119:invokevirtual   #715 <Method boolean ArrayList.add(Object)>
	//   49  122:pop             
_L2:
		byte byte1;
label0:
		{
			int i;
label1:
			{
				if(hashmap.get("bumpers") != null)
	//*  50  123:aload_1         
	//*  51  124:ldc2            #739 <String "bumpers">
	//*  52  127:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  53  130:ifnull          211
				{
					ArrayList arraylist = new ArrayList();
	//   54  133:new             #56  <Class ArrayList>
	//   55  136:dup             
	//   56  137:invokespecial   #575 <Method void ArrayList()>
	//   57  140:astore          4
					Iterator iterator1 = ((ArrayList)hashmap.get("bumpers")).iterator();
	//   58  142:aload_1         
	//   59  143:ldc2            #739 <String "bumpers">
	//   60  146:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   61  149:checkcast       #56  <Class ArrayList>
	//   62  152:invokevirtual   #159 <Method Iterator ArrayList.iterator()>
	//   63  155:astore          5
					do
					{
						if(!iterator1.hasNext())
							break;
	//   64  157:aload           5
	//   65  159:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//   66  164:ifeq            205
						APSMediaUnit apsmediaunit2 = unitFromDictionary(new HashMap(((java.util.Map) ((LinkedTreeMap)iterator1.next()))));
	//   67  167:new             #85  <Class HashMap>
	//   68  170:dup             
	//   69  171:aload           5
	//   70  173:invokeinterface #168 <Method Object Iterator.next()>
	//   71  178:checkcast       #278 <Class LinkedTreeMap>
	//   72  181:invokespecial   #281 <Method void HashMap(java.util.Map)>
	//   73  184:invokestatic    #737 <Method APSMediaUnit unitFromDictionary(HashMap)>
	//   74  187:astore          6
						if(apsmediaunit2 != null)
	//*  75  189:aload           6
	//*  76  191:ifnull          157
							arraylist.add(((Object) (apsmediaunit2)));
	//   77  194:aload           4
	//   78  196:aload           6
	//   79  198:invokevirtual   #715 <Method boolean ArrayList.add(Object)>
	//   80  201:pop             
					} while(true);
	//   81  202:goto            157
					bumperUnits = arraylist;
	//   82  205:aload_0         
	//   83  206:aload           4
	//   84  208:putfield        #741 <Field ArrayList bumperUnits>
				}
				if(hashmap.get("closers") != null)
	//*  85  211:aload_1         
	//*  86  212:ldc2            #743 <String "closers">
	//*  87  215:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//*  88  218:ifnull          299
				{
					ArrayList arraylist1 = new ArrayList();
	//   89  221:new             #56  <Class ArrayList>
	//   90  224:dup             
	//   91  225:invokespecial   #575 <Method void ArrayList()>
	//   92  228:astore          4
					Iterator iterator2 = ((ArrayList)hashmap.get("closers")).iterator();
	//   93  230:aload_1         
	//   94  231:ldc2            #743 <String "closers">
	//   95  234:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//   96  237:checkcast       #56  <Class ArrayList>
	//   97  240:invokevirtual   #159 <Method Iterator ArrayList.iterator()>
	//   98  243:astore          5
					do
					{
						if(!iterator2.hasNext())
							break;
	//   99  245:aload           5
	//  100  247:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//  101  252:ifeq            293
						APSMediaUnit apsmediaunit3 = unitFromDictionary(new HashMap(((java.util.Map) ((LinkedTreeMap)iterator2.next()))));
	//  102  255:new             #85  <Class HashMap>
	//  103  258:dup             
	//  104  259:aload           5
	//  105  261:invokeinterface #168 <Method Object Iterator.next()>
	//  106  266:checkcast       #278 <Class LinkedTreeMap>
	//  107  269:invokespecial   #281 <Method void HashMap(java.util.Map)>
	//  108  272:invokestatic    #737 <Method APSMediaUnit unitFromDictionary(HashMap)>
	//  109  275:astore          6
						if(apsmediaunit3 != null)
	//* 110  277:aload           6
	//* 111  279:ifnull          245
							arraylist1.add(((Object) (apsmediaunit3)));
	//  112  282:aload           4
	//  113  284:aload           6
	//  114  286:invokevirtual   #715 <Method boolean ArrayList.add(Object)>
	//  115  289:pop             
					} while(true);
	//  116  290:goto            245
					exitUnits = arraylist1;
	//  117  293:aload_0         
	//  118  294:aload           4
	//  119  296:putfield        #745 <Field ArrayList exitUnits>
				}
				if(hashmap.get("exits") != null)
	//* 120  299:aload_1         
	//* 121  300:ldc2            #747 <String "exits">
	//* 122  303:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//* 123  306:ifnull          409
				{
					ArrayList arraylist2 = new ArrayList();
	//  124  309:new             #56  <Class ArrayList>
	//  125  312:dup             
	//  126  313:invokespecial   #575 <Method void ArrayList()>
	//  127  316:astore          4
					Object obj1 = ((Object) (((ArrayList)hashmap.get("exits")).iterator()));
	//  128  318:aload_1         
	//  129  319:ldc2            #747 <String "exits">
	//  130  322:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  131  325:checkcast       #56  <Class ArrayList>
	//  132  328:invokevirtual   #159 <Method Iterator ArrayList.iterator()>
	//  133  331:astore          5
					do
					{
						if(!((Iterator) (obj1)).hasNext())
							break;
	//  134  333:aload           5
	//  135  335:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//  136  340:ifeq            381
						APSMediaUnit apsmediaunit4 = unitFromDictionary(new HashMap(((java.util.Map) ((LinkedTreeMap)((Iterator) (obj1)).next()))));
	//  137  343:new             #85  <Class HashMap>
	//  138  346:dup             
	//  139  347:aload           5
	//  140  349:invokeinterface #168 <Method Object Iterator.next()>
	//  141  354:checkcast       #278 <Class LinkedTreeMap>
	//  142  357:invokespecial   #281 <Method void HashMap(java.util.Map)>
	//  143  360:invokestatic    #737 <Method APSMediaUnit unitFromDictionary(HashMap)>
	//  144  363:astore          6
						if(apsmediaunit4 != null)
	//* 145  365:aload           6
	//* 146  367:ifnull          333
							arraylist2.add(((Object) (apsmediaunit4)));
	//  147  370:aload           4
	//  148  372:aload           6
	//  149  374:invokevirtual   #715 <Method boolean ArrayList.add(Object)>
	//  150  377:pop             
					} while(true);
	//  151  378:goto            333
					obj1 = ((Object) (exitUnits));
	//  152  381:aload_0         
	//  153  382:getfield        #745 <Field ArrayList exitUnits>
	//  154  385:astore          5
					if(obj1 != null)
	//* 155  387:aload           5
	//* 156  389:ifnull          403
						((ArrayList) (obj1)).addAll(((java.util.Collection) (arraylist2)));
	//  157  392:aload           5
	//  158  394:aload           4
	//  159  396:invokevirtual   #751 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  160  399:pop             
					else
	//* 161  400:goto            409
						exitUnits = arraylist2;
	//  162  403:aload_0         
	//  163  404:aload           4
	//  164  406:putfield        #745 <Field ArrayList exitUnits>
				}
				Object obj = hashmap.get("fullscreenOrientationBehaviour");
	//  165  409:aload_1         
	//  166  410:ldc2            #753 <String "fullscreenOrientationBehaviour">
	//  167  413:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  168  416:astore          4
				byte1 = 2;
	//  169  418:iconst_2        
	//  170  419:istore_3        
				if(obj == null)
					break label0;
	//  171  420:aload           4
	//  172  422:ifnull          540
				obj = ((Object) ((String)hashmap.get("fullscreenOrientationBehaviour")));
	//  173  425:aload_1         
	//  174  426:ldc2            #753 <String "fullscreenOrientationBehaviour">
	//  175  429:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  176  432:checkcast       #58  <Class String>
	//  177  435:astore          4
				i = ((String) (obj)).hashCode();
	//  178  437:aload           4
	//  179  439:invokevirtual   #285 <Method int String.hashCode()>
	//  180  442:istore_2        
				if(i != 0x8fc15021)
	//* 181  443:iload_2         
	//* 182  444:ldc2            #754 <Int 0x8fc15021>
	//* 183  447:icmpeq          476
				{
					if(i == 0xe3081975 && ((String) (obj)).equals("sensorPortrait"))
	//* 184  450:iload_2         
	//* 185  451:ldc2            #755 <Int 0xe3081975>
	//* 186  454:icmpeq          460
	//* 187  457:goto            492
	//* 188  460:aload           4
	//* 189  462:ldc2            #757 <String "sensorPortrait">
	//* 190  465:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 191  468:ifeq            492
					{
						i = 1;
	//  192  471:iconst_1        
	//  193  472:istore_2        
						break label1;
	//  194  473:goto            494
					}
				} else
				if(((String) (obj)).equals("sensorLandscape"))
	//* 195  476:aload           4
	//* 196  478:ldc2            #759 <String "sensorLandscape">
	//* 197  481:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 198  484:ifeq            492
				{
					i = 2;
	//  199  487:iconst_2        
	//  200  488:istore_2        
					break label1;
	//  201  489:goto            494
				}
				i = -1;
	//  202  492:iconst_m1       
	//  203  493:istore_2        
			}
			switch(i)
	//* 204  494:iload_2         
			{
	//* 205  495:tableswitch     1 2: default 516
	//	               1 531
	//	               2 519
	//* 206  516:goto            540
			case 2: // '\002'
				APSMediaPlayer.getInstance().setFullscreenOrientationBehaviour(APSMediaPlayer.FullscreenOrientationBehaviour.sensorLandscapeOrientation);
	//  207  519:invokestatic    #765 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  208  522:getstatic       #771 <Field APSMediaPlayer$FullscreenOrientationBehaviour APSMediaPlayer$FullscreenOrientationBehaviour.sensorLandscapeOrientation>
	//  209  525:invokevirtual   #775 <Method void APSMediaPlayer.setFullscreenOrientationBehaviour(APSMediaPlayer$FullscreenOrientationBehaviour)>
				break;

	//* 210  528:goto            540
			case 1: // '\001'
				APSMediaPlayer.getInstance().setFullscreenOrientationBehaviour(APSMediaPlayer.FullscreenOrientationBehaviour.sensorPortraitOrientation);
	//  211  531:invokestatic    #765 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//  212  534:getstatic       #778 <Field APSMediaPlayer$FullscreenOrientationBehaviour APSMediaPlayer$FullscreenOrientationBehaviour.sensorPortraitOrientation>
	//  213  537:invokevirtual   #775 <Method void APSMediaPlayer.setFullscreenOrientationBehaviour(APSMediaPlayer$FullscreenOrientationBehaviour)>
				break;
			}
		}
		hashmap = ((HashMap) ((LinkedTreeMap)hashmap.get("ads")));
	//  214  540:aload_1         
	//  215  541:ldc2            #780 <String "ads">
	//  216  544:invokevirtual   #92  <Method Object HashMap.get(Object)>
	//  217  547:checkcast       #278 <Class LinkedTreeMap>
	//  218  550:astore_1        
		if(hashmap != null)
	//* 219  551:aload_1         
	//* 220  552:ifnull          1084
		{
label2:
			{
				adBreakTemplate = new APSVastAdBreak();
	//  221  555:aload_0         
	//  222  556:new             #75  <Class APSVastAdBreak>
	//  223  559:dup             
	//  224  560:invokespecial   #76  <Method void APSVastAdBreak()>
	//  225  563:putfield        #78  <Field APSVastAdBreak adBreakTemplate>
				adBreakTemplate.configureFromDictionary(((java.util.Map) (hashmap)));
	//  226  566:aload_0         
	//  227  567:getfield        #78  <Field APSVastAdBreak adBreakTemplate>
	//  228  570:aload_1         
	//  229  571:invokevirtual   #783 <Method boolean APSVastAdBreak.configureFromDictionary(java.util.Map)>
	//  230  574:pop             
				if(((LinkedTreeMap) (hashmap)).get("vmap") != null)
	//* 231  575:aload_1         
	//* 232  576:ldc2            #785 <String "vmap">
	//* 233  579:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//* 234  582:ifnull          602
				{
					vmapURL = (String)((LinkedTreeMap) (hashmap)).get("vmap");
	//  235  585:aload_0         
	//  236  586:aload_1         
	//  237  587:ldc2            #785 <String "vmap">
	//  238  590:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//  239  593:checkcast       #58  <Class String>
	//  240  596:putfield        #568 <Field String vmapURL>
					break label2;
	//  241  599:goto            1060
				}
				if(((LinkedTreeMap) (hashmap)).get("adBreaks") != null)
	//* 242  602:aload_1         
	//* 243  603:ldc2            #786 <String "adBreaks">
	//* 244  606:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//* 245  609:ifnull          636
				{
					adBreaks = APSVastAdBreak.parseAdBreaksDictionary((LinkedTreeMap)((LinkedTreeMap) (hashmap)).get("adBreaks"), adBreakTemplate);
	//  246  612:aload_0         
	//  247  613:aload_1         
	//  248  614:ldc2            #786 <String "adBreaks">
	//  249  617:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//  250  620:checkcast       #278 <Class LinkedTreeMap>
	//  251  623:aload_0         
	//  252  624:getfield        #78  <Field APSVastAdBreak adBreakTemplate>
	//  253  627:invokestatic    #790 <Method ArrayList APSVastAdBreak.parseAdBreaksDictionary(LinkedTreeMap, APSVastAdBreak)>
	//  254  630:putfield        #54  <Field ArrayList adBreaks>
					break label2;
	//  255  633:goto            1060
				}
				if(((LinkedTreeMap) (hashmap)).get("vastURL") == null)
					break label2;
	//  256  636:aload_1         
	//  257  637:ldc2            #791 <String "vastURL">
	//  258  640:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//  259  643:ifnull          1060
				vastURL = (String)((LinkedTreeMap) (hashmap)).get("vastURL");
	//  260  646:aload_0         
	//  261  647:aload_1         
	//  262  648:ldc2            #791 <String "vastURL">
	//  263  651:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//  264  654:checkcast       #58  <Class String>
	//  265  657:putfield        #793 <Field String vastURL>
				APSVastAdBreak apsvastadbreak = APSVastAdBreak.copyAdBreak(adBreakTemplate);
	//  266  660:aload_0         
	//  267  661:getfield        #78  <Field APSVastAdBreak adBreakTemplate>
	//  268  664:invokestatic    #633 <Method APSVastAdBreak APSVastAdBreak.copyAdBreak(APSVastAdBreak)>
	//  269  667:astore          4
				apsvastadbreak.addSource(vastURL);
	//  270  669:aload           4
	//  271  671:aload_0         
	//  272  672:getfield        #793 <Field String vastURL>
	//  273  675:invokevirtual   #654 <Method void APSVastAdBreak.addSource(String)>
				if(((LinkedTreeMap) (hashmap)).get("vastType") != null)
	//* 274  678:aload_1         
	//* 275  679:ldc2            #794 <String "vastType">
	//* 276  682:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//* 277  685:ifnull          995
				{
					byte byte0;
label3:
					{
						vastType = (String)((LinkedTreeMap) (hashmap)).get("vastType");
	//  278  688:aload_0         
	//  279  689:aload_1         
	//  280  690:ldc2            #794 <String "vastType">
	//  281  693:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//  282  696:checkcast       #58  <Class String>
	//  283  699:putfield        #796 <Field String vastType>
						String s = vastType;
	//  284  702:aload_0         
	//  285  703:getfield        #796 <Field String vastType>
	//  286  706:astore          5
						switch(s.hashCode())
	//* 287  708:aload           5
	//* 288  710:invokevirtual   #285 <Method int String.hashCode()>
						{
						default:
							break;

	//* 289  713:lookupswitch    7: default 780
	//	               -318297696: 880
	//	               54265105: 864
	//	               757909789: 848
	//	               1055572677: 832
	//	               1371533921: 815
	//	               1486634937: 799
	//	               2120313942: 783
	//* 290  780:goto            896
						case 2120313942: 
							if(s.equals("preContent"))
	//* 291  783:aload           5
	//* 292  785:ldc2            #798 <String "preContent">
	//* 293  788:invokevirtual   #174 <Method boolean String.equals(Object)>
	//* 294  791:ifeq            896
							{
								byte0 = 0;
	//  295  794:iconst_0        
	//  296  795:istore_2        
								break label3;
	//  297  796:goto            898
							}
							break;

						case 1486634937: 
							if(!s.equals("postContent"))
								break;
	//  298  799:aload           5
	//  299  801:ldc2            #800 <String "postContent">
	//  300  804:invokevirtual   #174 <Method boolean String.equals(Object)>
	//  301  807:ifeq            896
							byte0 = byte1;
	//  302  810:iload_3         
	//  303  811:istore_2        
							break label3;
	//  304  812:goto            898

						case 1371533921: 
							if(!s.equals("nonLinears"))
								break;
	//  305  815:aload           5
	//  306  817:ldc2            #802 <String "nonLinears">
	//  307  820:invokevirtual   #174 <Method boolean String.equals(Object)>
	//  308  823:ifeq            896
							byte0 = 6;
	//  309  826:bipush          6
	//  310  828:istore_2        
							break label3;
	//  311  829:goto            898

						case 1055572677: 
							if(!s.equals("midroll"))
								break;
	//  312  832:aload           5
	//  313  834:ldc2            #804 <String "midroll">
	//  314  837:invokevirtual   #174 <Method boolean String.equals(Object)>
	//  315  840:ifeq            896
							byte0 = 5;
	//  316  843:iconst_5        
	//  317  844:istore_2        
							break label3;
	//  318  845:goto            898

						case 757909789: 
							if(!s.equals("postroll"))
								break;
	//  319  848:aload           5
	//  320  850:ldc2            #806 <String "postroll">
	//  321  853:invokevirtual   #174 <Method boolean String.equals(Object)>
	//  322  856:ifeq            896
							byte0 = 3;
	//  323  859:iconst_3        
	//  324  860:istore_2        
							break label3;
	//  325  861:goto            898

						case 54265105: 
							if(!s.equals("midContent"))
								break;
	//  326  864:aload           5
	//  327  866:ldc2            #808 <String "midContent">
	//  328  869:invokevirtual   #174 <Method boolean String.equals(Object)>
	//  329  872:ifeq            896
							byte0 = 4;
	//  330  875:iconst_4        
	//  331  876:istore_2        
							break label3;
	//  332  877:goto            898

						case -318297696: 
							if(!s.equals("preroll"))
								break;
	//  333  880:aload           5
	//  334  882:ldc2            #810 <String "preroll">
	//  335  885:invokevirtual   #174 <Method boolean String.equals(Object)>
	//  336  888:ifeq            896
							byte0 = 1;
	//  337  891:iconst_1        
	//  338  892:istore_2        
							break label3;
	//  339  893:goto            898
						}
						byte0 = -1;
	//  340  896:iconst_m1       
	//  341  897:istore_2        
					}
					switch(byte0)
	//* 342  898:iload_2         
					{
	//* 343  899:tableswitch     0 6: default 940
	//	               0 984
	//	               1 984
	//	               2 973
	//	               3 973
	//	               4 962
	//	               5 962
	//	               6 951
					default:
						apsvastadbreak.type = com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTPreContent;
	//  344  940:aload           4
	//  345  942:getstatic       #675 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPreContent>
	//  346  945:putfield        #666 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
						break;

	//* 347  948:goto            1003
					case 6: // '\006'
						apsvastadbreak.type = com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTNonLinear;
	//  348  951:aload           4
	//  349  953:getstatic       #680 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTNonLinear>
	//  350  956:putfield        #666 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
						break;

	//* 351  959:goto            1003
					case 4: // '\004'
					case 5: // '\005'
						apsvastadbreak.type = com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTMidContent;
	//  352  962:aload           4
	//  353  964:getstatic       #664 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTMidContent>
	//  354  967:putfield        #666 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
						break;

	//* 355  970:goto            1003
					case 2: // '\002'
					case 3: // '\003'
						apsvastadbreak.type = com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTPostContent;
	//  356  973:aload           4
	//  357  975:getstatic       #672 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPostContent>
	//  358  978:putfield        #666 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
						break;

	//* 359  981:goto            1003
					case 0: // '\0'
					case 1: // '\001'
						apsvastadbreak.type = com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTPreContent;
	//  360  984:aload           4
	//  361  986:getstatic       #675 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPreContent>
	//  362  989:putfield        #666 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
						break;
					}
				} else
	//* 363  992:goto            1003
				{
					apsvastadbreak.type = com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTPreContent;
	//  364  995:aload           4
	//  365  997:getstatic       #675 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPreContent>
	//  366 1000:putfield        #666 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
				}
				if(((LinkedTreeMap) (hashmap)).get("vastOffset") != null)
	//* 367 1003:aload_1         
	//* 368 1004:ldc2            #811 <String "vastOffset">
	//* 369 1007:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//* 370 1010:ifnull          1031
					apsvastadbreak.adOffset = (String)((LinkedTreeMap) (hashmap)).get("vastOffset");
	//  371 1013:aload           4
	//  372 1015:aload_1         
	//  373 1016:ldc2            #811 <String "vastOffset">
	//  374 1019:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//  375 1022:checkcast       #58  <Class String>
	//  376 1025:putfield        #669 <Field String APSVastAdBreak.adOffset>
				else
	//* 377 1028:goto            1039
					apsvastadbreak.adOffset = "00:00:10";
	//  378 1031:aload           4
	//  379 1033:ldc2            #813 <String "00:00:10">
	//  380 1036:putfield        #669 <Field String APSVastAdBreak.adOffset>
				adBreaks = new ArrayList();
	//  381 1039:aload_0         
	//  382 1040:new             #56  <Class ArrayList>
	//  383 1043:dup             
	//  384 1044:invokespecial   #575 <Method void ArrayList()>
	//  385 1047:putfield        #54  <Field ArrayList adBreaks>
				adBreaks.add(((Object) (apsvastadbreak)));
	//  386 1050:aload_0         
	//  387 1051:getfield        #54  <Field ArrayList adBreaks>
	//  388 1054:aload           4
	//  389 1056:invokevirtual   #715 <Method boolean ArrayList.add(Object)>
	//  390 1059:pop             
			}
			if(((LinkedTreeMap) (hashmap)).get("defaultAdBreakPositions") != null)
	//* 391 1060:aload_1         
	//* 392 1061:ldc2            #814 <String "defaultAdBreakPositions">
	//* 393 1064:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//* 394 1067:ifnull          1084
				defaultAdBreakPositions = (ArrayList)((LinkedTreeMap) (hashmap)).get("defaultAdBreakPositions");
	//  395 1070:aload_0         
	//  396 1071:aload_1         
	//  397 1072:ldc2            #814 <String "defaultAdBreakPositions">
	//  398 1075:invokevirtual   #456 <Method Object LinkedTreeMap.get(Object)>
	//  399 1078:checkcast       #56  <Class ArrayList>
	//  400 1081:putfield        #73  <Field ArrayList defaultAdBreakPositions>
		}
		return true;
	//  401 1084:iconst_1        
	//  402 1085:ireturn         
		ClassCastException classcastexception;
		classcastexception;
	//  403 1086:astore          4
		if(true) goto _L7; else goto _L6
	//  404 1088:goto            86
_L6:
	}

	public boolean configureFromURL(URL url)
	{
		String s = userAgent;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field String userAgent>
	//    2    4:astore          4
		if(s != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          20
			System.setProperty("http.agent", s);
	//    5   11:ldc2            #557 <String "http.agent">
	//    6   14:aload           4
	//    7   16:invokestatic    #563 <Method String System.setProperty(String, String)>
	//    8   19:pop             
		boolean flag1 = false;
	//    9   20:iconst_0        
	//   10   21:istore_3        
		try
		{
			url = ((URL) ((String)(new getDataAsync()).execute(((Object []) (new URL[] {
				url
			}))).get()));
	//   11   22:new             #17  <Class APSMediaBuilder$getDataAsync>
	//   12   25:dup             
	//   13   26:invokespecial   #564 <Method void APSMediaBuilder$getDataAsync()>
	//   14   29:iconst_1        
	//   15   30:anewarray       URL[]
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:aload_1         
	//   19   36:aastore         
	//   20   37:invokevirtual   #571 <Method AsyncTask APSMediaBuilder$getDataAsync.execute(Object[])>
	//   21   40:invokevirtual   #130 <Method Object AsyncTask.get()>
	//   22   43:checkcast       #58  <Class String>
	//   23   46:astore_1        
		}
	//*  24   47:goto            52
	//*  25   50:aconst_null     
	//*  26   51:astore_1        
	//*  27   52:iload_3         
	//*  28   53:istore_2        
	//*  29   54:aload_1         
	//*  30   55:ifnull          70
	//*  31   58:iload_3         
	//*  32   59:istore_2        
	//*  33   60:aload_0         
	//*  34   61:aload_1         
	//*  35   62:invokevirtual   #819 <Method boolean configureFromData(String)>
	//*  36   65:ifeq            70
	//*  37   68:iconst_1        
	//*  38   69:istore_2        
	//*  39   70:iload_2         
	//*  40   71:ireturn         
		// Misplaced declaration of an exception variable
		catch(URL url)
		{
			url = null;
		}
		boolean flag = flag1;
		if(url != null)
		{
			flag = flag1;
			if(configureFromData(((String) (url))))
				flag = true;
		}
		return flag;
	//*  41   72:astore_1        
	//*  42   73:goto            50
	}

	public void initWithMediUnit(APSMediaUnit apsmediaunit, String s)
	{
		initWithMediaUnit(apsmediaunit, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #825 <Method void initWithMediaUnit(APSMediaUnit, String)>
	//    4    6:return          
	}

	public void initWithMediaUnit(APSMediaUnit apsmediaunit, String s)
	{
		contentUnits = new ArrayList();
	//    0    0:aload_0         
	//    1    1:new             #56  <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #575 <Method void ArrayList()>
	//    4    8:putfield        #735 <Field ArrayList contentUnits>
		contentUnits.add(((Object) (apsmediaunit)));
	//    5   11:aload_0         
	//    6   12:getfield        #735 <Field ArrayList contentUnits>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #715 <Method boolean ArrayList.add(Object)>
	//    9   19:pop             
		vmapURL = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #568 <Field String vmapURL>
	//   13   25:return          
	}

	public ArrayList mediaUnits()
	{
		ArrayList arraylist;
		arraylist = new ArrayList();
	//    0    0:new             #56  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #575 <Method void ArrayList()>
	//    3    7:astore_2        
		ArrayList arraylist1 = bumperUnits;
	//    4    8:aload_0         
	//    5    9:getfield        #741 <Field ArrayList bumperUnits>
	//    6   12:astore_3        
		if(arraylist1 != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          23
			arraylist.addAll(((java.util.Collection) (arraylist1)));
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:invokevirtual   #751 <Method boolean ArrayList.addAll(java.util.Collection)>
	//   12   22:pop             
		if(vmapURL != null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #568 <Field String vmapURL>
	//*  15   27:ifnull          38
			adBreaks = adBreaksForVMAP();
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:invokevirtual   #829 <Method ArrayList adBreaksForVMAP()>
	//   19   35:putfield        #54  <Field ArrayList adBreaks>
		if(adBreaks == null) goto _L2; else goto _L1
	//   20   38:aload_0         
	//   21   39:getfield        #54  <Field ArrayList adBreaks>
	//   22   42:ifnull          361
_L1:
		ArrayList arraylist2;
		ArrayList arraylist5;
		Object obj;
		Iterator iterator;
		arraylist5 = new ArrayList();
	//   23   45:new             #56  <Class ArrayList>
	//   24   48:dup             
	//   25   49:invokespecial   #575 <Method void ArrayList()>
	//   26   52:astore          4
		arraylist2 = new ArrayList();
	//   27   54:new             #56  <Class ArrayList>
	//   28   57:dup             
	//   29   58:invokespecial   #575 <Method void ArrayList()>
	//   30   61:astore_3        
		obj = ((Object) (new ArrayList()));
	//   31   62:new             #56  <Class ArrayList>
	//   32   65:dup             
	//   33   66:invokespecial   #575 <Method void ArrayList()>
	//   34   69:astore          5
		iterator = adBreaks.iterator();
	//   35   71:aload_0         
	//   36   72:getfield        #54  <Field ArrayList adBreaks>
	//   37   75:invokevirtual   #159 <Method Iterator ArrayList.iterator()>
	//   38   78:astore          6
_L5:
		if(iterator.hasNext())
	//*  39   80:aload           6
	//*  40   82:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//*  41   87:ifeq            187
		{
			APSVastAdBreak apsvastadbreak1 = (APSVastAdBreak)iterator.next();
	//   42   90:aload           6
	//   43   92:invokeinterface #168 <Method Object Iterator.next()>
	//   44   97:checkcast       #75  <Class APSVastAdBreak>
	//   45  100:astore          7
			apsvastadbreak1.preloadInterval = 10L;
	//   46  102:aload           7
	//   47  104:ldc2w           #830 <Long 10L>
	//   48  107:putfield        #834 <Field long APSVastAdBreak.preloadInterval>
			static class _cls1
			{

				static final int $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions[];

				static 
				{
					$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions = new int[com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.values().length];
				//    0    0:invokestatic    #18  <Method com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions[] com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
					try
					{
						$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions[com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTPreContent.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
				//    5   12:getstatic       #24  <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPreContent>
				//    6   15:invokevirtual   #28  <Method int com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
				//*  10   23:getstatic       #31  <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTPostContent>
				//*  11   26:invokevirtual   #28  <Method int com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
				//*  15   34:getstatic       #34  <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTMidContent>
				//*  16   37:invokevirtual   #28  <Method int com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
				//*  20   45:getstatic       #37  <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.APSVASTNonLinear>
				//*  21   48:invokevirtual   #28  <Method int com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   25   54:astore_0        
					try
					{
						$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions[com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTPostContent.ordinal()] = 2;
					}
				//*  26   55:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   27   58:astore_0        
					try
					{
						$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions[com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTMidContent.ordinal()] = 3;
					}
				//*  28   59:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   29   62:astore_0        
					try
					{
						$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions[com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions.APSVASTNonLinear.ordinal()] = 4;
					}
				//*  30   63:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   31   66:astore_0        
				//*  32   67:return          
				}
			}

			switch(_cls1..SwitchMap.com.appscend.media.events.APSVastAdBreak.APSVASTConfigurationOptions[apsvastadbreak1.type.ordinal()])
	//*  49  110:getstatic       #838 <Field int[] APSMediaBuilder$1.$SwitchMap$com$appscend$media$events$APSVastAdBreak$APSVASTConfigurationOptions>
	//*  50  113:aload           7
	//*  51  115:getfield        #666 <Field com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions APSVastAdBreak.type>
	//*  52  118:invokevirtual   #841 <Method int com.appscend.media.events.APSVastAdBreak$APSVASTConfigurationOptions.ordinal()>
	//*  53  121:iaload          
			{
	//*  54  122:tableswitch     1 4: default 152
	//	               1 176
	//	               2 166
	//	               3 155
	//	               4 155
	//*  55  152:goto            80
			case 3: // '\003'
			case 4: // '\004'
				((ArrayList) (obj)).add(((Object) (apsvastadbreak1)));
	//   56  155:aload           5
	//   57  157:aload           7
	//   58  159:invokevirtual   #715 <Method boolean ArrayList.add(Object)>
	//   59  162:pop             
				break;

	//*  60  163:goto            80
			case 2: // '\002'
				arraylist2.add(((Object) (apsvastadbreak1)));
	//   61  166:aload_3         
	//   62  167:aload           7
	//   63  169:invokevirtual   #715 <Method boolean ArrayList.add(Object)>
	//   64  172:pop             
				break;

	//*  65  173:goto            80
			case 1: // '\001'
				arraylist5.add(((Object) (apsvastadbreak1)));
	//   66  176:aload           4
	//   67  178:aload           7
	//   68  180:invokevirtual   #715 <Method boolean ArrayList.add(Object)>
	//   69  183:pop             
				break;
			}
			continue; /* Loop/switch isn't completed */
	//   70  184:goto            80
		}
		for(obj = ((Object) (((ArrayList) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  71  187:aload           5
	//*  72  189:invokevirtual   #159 <Method Iterator ArrayList.iterator()>
	//*  73  192:astore          5
	//*  74  194:aload           5
	//*  75  196:invokeinterface #165 <Method boolean Iterator.hasNext()>
	//*  76  201:ifeq            317
		{
			APSVastAdBreak apsvastadbreak = (APSVastAdBreak)((Iterator) (obj)).next();
	//   77  204:aload           5
	//   78  206:invokeinterface #168 <Method Object Iterator.next()>
	//   79  211:checkcast       #75  <Class APSVastAdBreak>
	//   80  214:astore          6
			int i = 0;
	//   81  216:iconst_0        
	//   82  217:istore_1        
			while(i < contentUnits.size()) 
	//*  83  218:iload_1         
	//*  84  219:aload_0         
	//*  85  220:getfield        #735 <Field ArrayList contentUnits>
	//*  86  223:invokevirtual   #843 <Method int ArrayList.size()>
	//*  87  226:icmpge          194
			{
				APSMediaUnit apsmediaunit = (APSMediaUnit)contentUnits.get(i);
	//   88  229:aload_0         
	//   89  230:getfield        #735 <Field ArrayList contentUnits>
	//   90  233:iload_1         
	//   91  234:invokevirtual   #846 <Method Object ArrayList.get(int)>
	//   92  237:checkcast       #405 <Class APSMediaUnit>
	//   93  240:astore          7
				String s = pointsForOffset(apsvastadbreak.adOffset);
	//   94  242:aload_0         
	//   95  243:aload           6
	//   96  245:getfield        #669 <Field String APSVastAdBreak.adOffset>
	//   97  248:invokevirtual   #850 <Method String pointsForOffset(String)>
	//   98  251:astore          8
				if(s != null)
	//*  99  253:aload           8
	//* 100  255:ifnull          286
				{
					apsvastadbreak.setStartPoint(s);
	//  101  258:aload           6
	//  102  260:aload           8
	//  103  262:invokevirtual   #851 <Method void APSVastAdBreak.setStartPoint(String)>
					apsmediaunit.addEvent(((com.appscend.media.events.APSMediaEvent) (apsvastadbreak)));
	//  104  265:aload           7
	//  105  267:aload           6
	//  106  269:invokevirtual   #855 <Method void APSMediaUnit.addEvent(com.appscend.media.events.APSMediaEvent)>
					contentUnits.set(i, ((Object) (apsmediaunit)));
	//  107  272:aload_0         
	//  108  273:getfield        #735 <Field ArrayList contentUnits>
	//  109  276:iload_1         
	//  110  277:aload           7
	//  111  279:invokevirtual   #859 <Method Object ArrayList.set(int, Object)>
	//  112  282:pop             
				} else
	//* 113  283:goto            310
				{
					apsvastadbreak.dynamicPosition = true;
	//  114  286:aload           6
	//  115  288:iconst_1        
	//  116  289:putfield        #862 <Field boolean APSVastAdBreak.dynamicPosition>
					apsmediaunit.addEvent(((com.appscend.media.events.APSMediaEvent) (apsvastadbreak)));
	//  117  292:aload           7
	//  118  294:aload           6
	//  119  296:invokevirtual   #855 <Method void APSMediaUnit.addEvent(com.appscend.media.events.APSMediaEvent)>
					contentUnits.set(i, ((Object) (apsmediaunit)));
	//  120  299:aload_0         
	//  121  300:getfield        #735 <Field ArrayList contentUnits>
	//  122  303:iload_1         
	//  123  304:aload           7
	//  124  306:invokevirtual   #859 <Method Object ArrayList.set(int, Object)>
	//  125  309:pop             
				}
				i++;
	//  126  310:iload_1         
	//  127  311:iconst_1        
	//  128  312:iadd            
	//  129  313:istore_1        
			}
		}

	//* 130  314:goto            218
		arraylist.addAll(((java.util.Collection) (arraylist5)));
	//  131  317:aload_2         
	//  132  318:aload           4
	//  133  320:invokevirtual   #751 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  134  323:pop             
		arraylist5 = contentUnits;
	//  135  324:aload_0         
	//  136  325:getfield        #735 <Field ArrayList contentUnits>
	//  137  328:astore          4
		if(arraylist5 != null && arraylist5.size() > 0)
	//* 138  330:aload           4
	//* 139  332:ifnull          352
	//* 140  335:aload           4
	//* 141  337:invokevirtual   #843 <Method int ArrayList.size()>
	//* 142  340:ifle            352
			arraylist.addAll(((java.util.Collection) (contentUnits)));
	//  143  343:aload_2         
	//  144  344:aload_0         
	//  145  345:getfield        #735 <Field ArrayList contentUnits>
	//  146  348:invokevirtual   #751 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  147  351:pop             
		arraylist.addAll(((java.util.Collection) (arraylist2)));
	//  148  352:aload_2         
	//  149  353:aload_3         
	//  150  354:invokevirtual   #751 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  151  357:pop             
		  goto _L3
	//* 152  358:goto            386
_L2:
		ArrayList arraylist3 = contentUnits;
	//  153  361:aload_0         
	//  154  362:getfield        #735 <Field ArrayList contentUnits>
	//  155  365:astore_3        
		if(arraylist3 != null && arraylist3.size() > 0)
	//* 156  366:aload_3         
	//* 157  367:ifnull          386
	//* 158  370:aload_3         
	//* 159  371:invokevirtual   #843 <Method int ArrayList.size()>
	//* 160  374:ifle            386
			arraylist.addAll(((java.util.Collection) (contentUnits)));
	//  161  377:aload_2         
	//  162  378:aload_0         
	//  163  379:getfield        #735 <Field ArrayList contentUnits>
	//  164  382:invokevirtual   #751 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  165  385:pop             
_L3:
		ArrayList arraylist4 = exitUnits;
	//  166  386:aload_0         
	//  167  387:getfield        #745 <Field ArrayList exitUnits>
	//  168  390:astore_3        
		if(arraylist4 != null)
	//* 169  391:aload_3         
	//* 170  392:ifnull          401
			arraylist.addAll(((java.util.Collection) (arraylist4)));
	//  171  395:aload_2         
	//  172  396:aload_3         
	//  173  397:invokevirtual   #751 <Method boolean ArrayList.addAll(java.util.Collection)>
	//  174  400:pop             
		return arraylist;
	//  175  401:aload_2         
	//  176  402:areturn         
		if(true) goto _L5; else goto _L4
_L4:
	}

	public String pointsForOffset(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = APSVASTXMLNode.durationFromString(s);
	//    4    6:aload_1         
	//    5    7:invokestatic    #867 <Method int APSVASTXMLNode.durationFromString(String)>
	//    6   10:istore_2        
		if(i > -1)
	//*   7   11:iload_2         
	//*   8   12:iconst_m1       
	//*   9   13:icmple          21
			return String.valueOf(i);
	//   10   16:iload_2         
	//   11   17:invokestatic    #434 <Method String String.valueOf(int)>
	//   12   20:areturn         
		if(s.contains("%"))
	//*  13   21:aload_1         
	//*  14   22:ldc2            #869 <String "%">
	//*  15   25:invokevirtual   #873 <Method boolean String.contains(CharSequence)>
	//*  16   28:ifeq            33
			return s;
	//   17   31:aload_1         
	//   18   32:areturn         
		if(s.contains("#"))
	//*  19   33:aload_1         
	//*  20   34:ldc2            #875 <String "#">
	//*  21   37:invokevirtual   #873 <Method boolean String.contains(CharSequence)>
	//*  22   40:ifeq            84
		{
			int j = Integer.parseInt(s.replace("#", ""));
	//   23   43:aload_1         
	//   24   44:ldc2            #875 <String "#">
	//   25   47:ldc2            #877 <String "">
	//   26   50:invokevirtual   #881 <Method String String.replace(CharSequence, CharSequence)>
	//   27   53:invokestatic    #884 <Method int Integer.parseInt(String)>
	//   28   56:istore_2        
			if(defaultAdBreakPositions.size() >= j)
	//*  29   57:aload_0         
	//*  30   58:getfield        #73  <Field ArrayList defaultAdBreakPositions>
	//*  31   61:invokevirtual   #843 <Method int ArrayList.size()>
	//*  32   64:iload_2         
	//*  33   65:icmplt          82
				return (String)defaultAdBreakPositions.get(j - 1);
	//   34   68:aload_0         
	//   35   69:getfield        #73  <Field ArrayList defaultAdBreakPositions>
	//   36   72:iload_2         
	//   37   73:iconst_1        
	//   38   74:isub            
	//   39   75:invokevirtual   #846 <Method Object ArrayList.get(int)>
	//   40   78:checkcast       #58  <Class String>
	//   41   81:areturn         
			else
				return null;
	//   42   82:aconst_null     
	//   43   83:areturn         
		}
		if(s.equals("start"))
	//*  44   84:aload_1         
	//*  45   85:ldc1            #253 <String "start">
	//*  46   87:invokevirtual   #174 <Method boolean String.equals(Object)>
	//*  47   90:ifeq            119
		{
			if(defaultAdBreakPositions.size() > 0)
	//*  48   93:aload_0         
	//*  49   94:getfield        #73  <Field ArrayList defaultAdBreakPositions>
	//*  50   97:invokevirtual   #843 <Method int ArrayList.size()>
	//*  51  100:ifle            115
				return (String)defaultAdBreakPositions.get(0);
	//   52  103:aload_0         
	//   53  104:getfield        #73  <Field ArrayList defaultAdBreakPositions>
	//   54  107:iconst_0        
	//   55  108:invokevirtual   #846 <Method Object ArrayList.get(int)>
	//   56  111:checkcast       #58  <Class String>
	//   57  114:areturn         
			else
				return "0";
	//   58  115:ldc2            #430 <String "0">
	//   59  118:areturn         
		} else
		{
			return null;
	//   60  119:aconst_null     
	//   61  120:areturn         
		}
	}

	public static final String kAPSMarlinDRMEncoding = "marlin";
	public static final String kAPSMetadataDrmEncodingType = "drm_encoding_type";
	public static final String kAPSMetadataDrmUrl = "drm_encoding_url";
	public APSVastAdBreak adBreakTemplate;
	public ArrayList adBreaks;
	public ArrayList bumperUnits;
	public ArrayList contentUnits;
	public boolean debugMode;
	public ArrayList defaultAdBreakPositions;
	public ArrayList exitUnits;
	public String userAgent;
	public String vastOffset;
	public String vastType;
	public String vastURL;
	public String vmapURL;
}
