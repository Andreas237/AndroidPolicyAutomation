// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content.res;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.graphics.TypefaceCompat;
import android.support.v4.util.Preconditions;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.content.res:
//			FontResourcesParserCompat

public final class ResourcesCompat
{
	public static abstract class FontCallback
	{

		public final void callbackFailAsync(int i, Handler handler)
		{
			Handler handler1 = handler;
		//    0    0:aload_2         
		//    1    1:astore_3        
			if(handler == null)
		//*   2    2:aload_2         
		//*   3    3:ifnonnull       17
				handler1 = new Handler(Looper.getMainLooper());
		//    4    6:new             #25  <Class Handler>
		//    5    9:dup             
		//    6   10:invokestatic    #31  <Method Looper Looper.getMainLooper()>
		//    7   13:invokespecial   #34  <Method void Handler(Looper)>
		//    8   16:astore_3        
			handler1.post(((_cls2) (i)). new Runnable() {

				public void run()
				{
					onFontRetrievalFailed(reason);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field ResourcesCompat$FontCallback this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #24  <Field int val$reason>
				//    4    8:invokevirtual   #33  <Method void ResourcesCompat$FontCallback.onFontRetrievalFailed(int)>
				//    5   11:return          
				}

				final FontCallback this$0;
				final int val$reason;

			
			{
				this$0 = final_fontcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ResourcesCompat$FontCallback this$0>
				reason = I.this;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #24  <Field int val$reason>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    9   17:aload_3         
		//   10   18:new             #11  <Class ResourcesCompat$FontCallback$2>
		//   11   21:dup             
		//   12   22:aload_0         
		//   13   23:iload_1         
		//   14   24:invokespecial   #37  <Method void ResourcesCompat$FontCallback$2(ResourcesCompat$FontCallback, int)>
		//   15   27:invokevirtual   #41  <Method boolean Handler.post(Runnable)>
		//   16   30:pop             
		//   17   31:return          
		}

		public final void callbackSuccessAsync(Typeface typeface, Handler handler)
		{
			Handler handler1 = handler;
		//    0    0:aload_2         
		//    1    1:astore_3        
			if(handler == null)
		//*   2    2:aload_2         
		//*   3    3:ifnonnull       17
				handler1 = new Handler(Looper.getMainLooper());
		//    4    6:new             #25  <Class Handler>
		//    5    9:dup             
		//    6   10:invokestatic    #31  <Method Looper Looper.getMainLooper()>
		//    7   13:invokespecial   #34  <Method void Handler(Looper)>
		//    8   16:astore_3        
			handler1.post(((_cls1) (typeface)). new Runnable() {

				public void run()
				{
					onFontRetrieved(typeface);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field ResourcesCompat$FontCallback this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #24  <Field Typeface val$typeface>
				//    4    8:invokevirtual   #33  <Method void ResourcesCompat$FontCallback.onFontRetrieved(Typeface)>
				//    5   11:return          
				}

				final FontCallback this$0;
				final Typeface val$typeface;

			
			{
				this$0 = final_fontcallback;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field ResourcesCompat$FontCallback this$0>
				typeface = Typeface.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field Typeface val$typeface>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    9   17:aload_3         
		//   10   18:new             #9   <Class ResourcesCompat$FontCallback$1>
		//   11   21:dup             
		//   12   22:aload_0         
		//   13   23:aload_1         
		//   14   24:invokespecial   #48  <Method void ResourcesCompat$FontCallback$1(ResourcesCompat$FontCallback, Typeface)>
		//   15   27:invokevirtual   #41  <Method boolean Handler.post(Runnable)>
		//   16   30:pop             
		//   17   31:return          
		}

		public abstract void onFontRetrievalFailed(int i);

		public abstract void onFontRetrieved(Typeface typeface);

		public FontCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}


	public static Drawable getDrawable(Resources resources, int i, android.content.res.Resources.Theme theme)
		throws android.content.res.Resources.NotFoundException
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #24  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          15
			return resources.getDrawable(i, theme);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #29  <Method Drawable Resources.getDrawable(int, android.content.res.Resources$Theme)>
	//    7   14:areturn         
		else
			return resources.getDrawable(i);
	//    8   15:aload_0         
	//    9   16:iload_1         
	//   10   17:invokevirtual   #32  <Method Drawable Resources.getDrawable(int)>
	//   11   20:areturn         
	}

	public static Typeface getFont(Context context, int i)
		throws android.content.res.Resources.NotFoundException
	{
		if(context.isRestricted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #45  <Method boolean Context.isRestricted()>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return loadFont(context, i, new TypedValue(), 0, ((FontCallback) (null)), ((Handler) (null)), false);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:new             #47  <Class TypedValue>
	//    8   14:dup             
	//    9   15:invokespecial   #51  <Method void TypedValue()>
	//   10   18:iconst_0        
	//   11   19:aconst_null     
	//   12   20:aconst_null     
	//   13   21:iconst_0        
	//   14   22:invokestatic    #55  <Method Typeface loadFont(Context, int, TypedValue, int, ResourcesCompat$FontCallback, Handler, boolean)>
	//   15   25:areturn         
	}

	public static Typeface getFont(Context context, int i, TypedValue typedvalue, int j, FontCallback fontcallback)
		throws android.content.res.Resources.NotFoundException
	{
		if(context.isRestricted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #45  <Method boolean Context.isRestricted()>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return loadFont(context, i, typedvalue, j, fontcallback, ((Handler) (null)), true);
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:aload_2         
	//    8   12:iload_3         
	//    9   13:aload           4
	//   10   15:aconst_null     
	//   11   16:iconst_1        
	//   12   17:invokestatic    #55  <Method Typeface loadFont(Context, int, TypedValue, int, ResourcesCompat$FontCallback, Handler, boolean)>
	//   13   20:areturn         
	}

	public static void getFont(Context context, int i, FontCallback fontcallback, Handler handler)
		throws android.content.res.Resources.NotFoundException
	{
		Preconditions.checkNotNull(((Object) (fontcallback)));
	//    0    0:aload_2         
	//    1    1:invokestatic    #67  <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		if(context.isRestricted())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #45  <Method boolean Context.isRestricted()>
	//*   5    9:ifeq            20
		{
			fontcallback.callbackFailAsync(-4, handler);
	//    6   12:aload_2         
	//    7   13:bipush          -4
	//    8   15:aload_3         
	//    9   16:invokevirtual   #71  <Method void ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
			return;
	//   10   19:return          
		} else
		{
			loadFont(context, i, new TypedValue(), 0, fontcallback, handler, false);
	//   11   20:aload_0         
	//   12   21:iload_1         
	//   13   22:new             #47  <Class TypedValue>
	//   14   25:dup             
	//   15   26:invokespecial   #51  <Method void TypedValue()>
	//   16   29:iconst_0        
	//   17   30:aload_2         
	//   18   31:aload_3         
	//   19   32:iconst_0        
	//   20   33:invokestatic    #55  <Method Typeface loadFont(Context, int, TypedValue, int, ResourcesCompat$FontCallback, Handler, boolean)>
	//   21   36:pop             
			return;
	//   22   37:return          
		}
	}

	private static Typeface loadFont(Context context, int i, TypedValue typedvalue, int j, FontCallback fontcallback, Handler handler, boolean flag)
	{
		Resources resources = context.getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method Resources Context.getResources()>
	//    2    4:astore          7
		resources.getValue(i, typedvalue, true);
	//    3    6:aload           7
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:iconst_1        
	//    7   11:invokevirtual   #79  <Method void Resources.getValue(int, TypedValue, boolean)>
		context = ((Context) (loadFont(context, resources, typedvalue, i, j, fontcallback, handler, flag)));
	//    8   14:aload_0         
	//    9   15:aload           7
	//   10   17:aload_2         
	//   11   18:iload_1         
	//   12   19:iload_3         
	//   13   20:aload           4
	//   14   22:aload           5
	//   15   24:iload           6
	//   16   26:invokestatic    #82  <Method Typeface loadFont(Context, Resources, TypedValue, int, int, ResourcesCompat$FontCallback, Handler, boolean)>
	//   17   29:astore_0        
		if(context == null)
	//*  18   30:aload_0         
	//*  19   31:ifnonnull       84
		{
			if(fontcallback != null)
	//*  20   34:aload           4
	//*  21   36:ifnull          41
			{
				return ((Typeface) (context));
	//   22   39:aload_0         
	//   23   40:areturn         
			} else
			{
				context = ((Context) (new StringBuilder()));
	//   24   41:new             #84  <Class StringBuilder>
	//   25   44:dup             
	//   26   45:invokespecial   #85  <Method void StringBuilder()>
	//   27   48:astore_0        
				((StringBuilder) (context)).append("Font resource ID #0x");
	//   28   49:aload_0         
	//   29   50:ldc1            #87  <String "Font resource ID #0x">
	//   30   52:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   31   55:pop             
				((StringBuilder) (context)).append(Integer.toHexString(i));
	//   32   56:aload_0         
	//   33   57:iload_1         
	//   34   58:invokestatic    #97  <Method String Integer.toHexString(int)>
	//   35   61:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   36   64:pop             
				((StringBuilder) (context)).append(" could not be retrieved.");
	//   37   65:aload_0         
	//   38   66:ldc1            #99  <String " could not be retrieved.">
	//   39   68:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   40   71:pop             
				throw new android.content.res.Resources.NotFoundException(((StringBuilder) (context)).toString());
	//   41   72:new             #15  <Class android.content.res.Resources$NotFoundException>
	//   42   75:dup             
	//   43   76:aload_0         
	//   44   77:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   45   80:invokespecial   #106 <Method void android.content.res.Resources$NotFoundException(String)>
	//   46   83:athrow          
			}
		} else
		{
			return ((Typeface) (context));
	//   47   84:aload_0         
	//   48   85:areturn         
		}
	}

	private static Typeface loadFont(Context context, Resources resources, TypedValue typedvalue, int i, int j, FontCallback fontcallback, Handler handler, boolean flag)
	{
		if(typedvalue.string == null)
			break MISSING_BLOCK_LABEL_267;
	//    0    0:aload_2         
	//    1    1:getfield        #114 <Field CharSequence TypedValue.string>
	//    2    4:ifnull          267
		typedvalue = ((TypedValue) (typedvalue.string.toString()));
	//    3    7:aload_2         
	//    4    8:getfield        #114 <Field CharSequence TypedValue.string>
	//    5   11:invokeinterface #117 <Method String CharSequence.toString()>
	//    6   16:astore_2        
		if(!((String) (typedvalue)).startsWith("res/"))
	//*   7   17:aload_2         
	//*   8   18:ldc1            #119 <String "res/">
	//*   9   20:invokevirtual   #125 <Method boolean String.startsWith(String)>
	//*  10   23:ifne            42
		{
			if(fontcallback != null)
	//*  11   26:aload           5
	//*  12   28:ifnull          40
				fontcallback.callbackFailAsync(-3, handler);
	//   13   31:aload           5
	//   14   33:bipush          -3
	//   15   35:aload           6
	//   16   37:invokevirtual   #71  <Method void ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
			return null;
	//   17   40:aconst_null     
	//   18   41:areturn         
		}
		Typeface typeface = TypefaceCompat.findFromCache(resources, i, j);
	//   19   42:aload_1         
	//   20   43:iload_3         
	//   21   44:iload           4
	//   22   46:invokestatic    #131 <Method Typeface TypefaceCompat.findFromCache(Resources, int, int)>
	//   23   49:astore          8
		if(typeface != null)
	//*  24   51:aload           8
	//*  25   53:ifnull          73
		{
			if(fontcallback != null)
	//*  26   56:aload           5
	//*  27   58:ifnull          70
				fontcallback.callbackSuccessAsync(typeface, handler);
	//   28   61:aload           5
	//   29   63:aload           8
	//   30   65:aload           6
	//   31   67:invokevirtual   #135 <Method void ResourcesCompat$FontCallback.callbackSuccessAsync(Typeface, Handler)>
			return typeface;
	//   32   70:aload           8
	//   33   72:areturn         
		}
		FontResourcesParserCompat.FamilyResourceEntry familyresourceentry;
		if(!((String) (typedvalue)).toLowerCase().endsWith(".xml"))
			break MISSING_BLOCK_LABEL_142;
	//   34   73:aload_2         
	//   35   74:invokevirtual   #138 <Method String String.toLowerCase()>
	//   36   77:ldc1            #140 <String ".xml">
	//   37   79:invokevirtual   #143 <Method boolean String.endsWith(String)>
	//   38   82:ifeq            142
		familyresourceentry = FontResourcesParserCompat.parse(((org.xmlpull.v1.XmlPullParser) (resources.getXml(i))), resources);
	//   39   85:aload_1         
	//   40   86:iload_3         
	//   41   87:invokevirtual   #147 <Method android.content.res.XmlResourceParser Resources.getXml(int)>
	//   42   90:aload_1         
	//   43   91:invokestatic    #153 <Method FontResourcesParserCompat$FamilyResourceEntry FontResourcesParserCompat.parse(org.xmlpull.v1.XmlPullParser, Resources)>
	//   44   94:astore          8
		if(familyresourceentry != null)
			break MISSING_BLOCK_LABEL_125;
	//   45   96:aload           8
	//   46   98:ifnonnull       125
		Log.e("ResourcesCompat", "Failed to find font-family tag");
	//   47  101:ldc1            #155 <String "ResourcesCompat">
	//   48  103:ldc1            #157 <String "Failed to find font-family tag">
	//   49  105:invokestatic    #163 <Method int Log.e(String, String)>
	//   50  108:pop             
		if(fontcallback == null)
			break MISSING_BLOCK_LABEL_333;
	//   51  109:aload           5
	//   52  111:ifnull          333
		fontcallback.callbackFailAsync(-3, handler);
	//   53  114:aload           5
	//   54  116:bipush          -3
	//   55  118:aload           6
	//   56  120:invokevirtual   #71  <Method void ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
		return null;
	//   57  123:aconst_null     
	//   58  124:areturn         
		return TypefaceCompat.createFromResourcesFamilyXml(context, familyresourceentry, resources, i, j, fontcallback, handler, flag);
	//   59  125:aload_0         
	//   60  126:aload           8
	//   61  128:aload_1         
	//   62  129:iload_3         
	//   63  130:iload           4
	//   64  132:aload           5
	//   65  134:aload           6
	//   66  136:iload           7
	//   67  138:invokestatic    #167 <Method Typeface TypefaceCompat.createFromResourcesFamilyXml(Context, FontResourcesParserCompat$FamilyResourceEntry, Resources, int, int, ResourcesCompat$FontCallback, Handler, boolean)>
	//   68  141:areturn         
		context = ((Context) (TypefaceCompat.createFromResourcesFontFile(context, resources, i, ((String) (typedvalue)), j)));
	//   69  142:aload_0         
	//   70  143:aload_1         
	//   71  144:iload_3         
	//   72  145:aload_2         
	//   73  146:iload           4
	//   74  148:invokestatic    #171 <Method Typeface TypefaceCompat.createFromResourcesFontFile(Context, Resources, int, String, int)>
	//   75  151:astore_0        
		if(fontcallback == null)
			break MISSING_BLOCK_LABEL_180;
	//   76  152:aload           5
	//   77  154:ifnull          180
		if(context == null)
			break MISSING_BLOCK_LABEL_171;
	//   78  157:aload_0         
	//   79  158:ifnull          171
		fontcallback.callbackSuccessAsync(((Typeface) (context)), handler);
	//   80  161:aload           5
	//   81  163:aload_0         
	//   82  164:aload           6
	//   83  166:invokevirtual   #135 <Method void ResourcesCompat$FontCallback.callbackSuccessAsync(Typeface, Handler)>
		return ((Typeface) (context));
	//   84  169:aload_0         
	//   85  170:areturn         
		fontcallback.callbackFailAsync(-3, handler);
	//   86  171:aload           5
	//   87  173:bipush          -3
	//   88  175:aload           6
	//   89  177:invokevirtual   #71  <Method void ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
		return ((Typeface) (context));
	//   90  180:aload_0         
	//   91  181:areturn         
		context;
	//   92  182:astore_0        
		resources = ((Resources) (new StringBuilder()));
	//   93  183:new             #84  <Class StringBuilder>
	//   94  186:dup             
	//   95  187:invokespecial   #85  <Method void StringBuilder()>
	//   96  190:astore_1        
		((StringBuilder) (resources)).append("Failed to read xml resource ");
	//   97  191:aload_1         
	//   98  192:ldc1            #173 <String "Failed to read xml resource ">
	//   99  194:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  100  197:pop             
		((StringBuilder) (resources)).append(((String) (typedvalue)));
	//  101  198:aload_1         
	//  102  199:aload_2         
	//  103  200:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  104  203:pop             
		Log.e("ResourcesCompat", ((StringBuilder) (resources)).toString(), ((Throwable) (context)));
	//  105  204:ldc1            #155 <String "ResourcesCompat">
	//  106  206:aload_1         
	//  107  207:invokevirtual   #103 <Method String StringBuilder.toString()>
	//  108  210:aload_0         
	//  109  211:invokestatic    #176 <Method int Log.e(String, String, Throwable)>
	//  110  214:pop             
		break MISSING_BLOCK_LABEL_251;
	//  111  215:goto            251
		context;
	//  112  218:astore_0        
		resources = ((Resources) (new StringBuilder()));
	//  113  219:new             #84  <Class StringBuilder>
	//  114  222:dup             
	//  115  223:invokespecial   #85  <Method void StringBuilder()>
	//  116  226:astore_1        
		((StringBuilder) (resources)).append("Failed to parse xml resource ");
	//  117  227:aload_1         
	//  118  228:ldc1            #178 <String "Failed to parse xml resource ">
	//  119  230:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  120  233:pop             
		((StringBuilder) (resources)).append(((String) (typedvalue)));
	//  121  234:aload_1         
	//  122  235:aload_2         
	//  123  236:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  124  239:pop             
		Log.e("ResourcesCompat", ((StringBuilder) (resources)).toString(), ((Throwable) (context)));
	//  125  240:ldc1            #155 <String "ResourcesCompat">
	//  126  242:aload_1         
	//  127  243:invokevirtual   #103 <Method String StringBuilder.toString()>
	//  128  246:aload_0         
	//  129  247:invokestatic    #176 <Method int Log.e(String, String, Throwable)>
	//  130  250:pop             
		if(fontcallback != null)
	//* 131  251:aload           5
	//* 132  253:ifnull          265
			fontcallback.callbackFailAsync(-3, handler);
	//  133  256:aload           5
	//  134  258:bipush          -3
	//  135  260:aload           6
	//  136  262:invokevirtual   #71  <Method void ResourcesCompat$FontCallback.callbackFailAsync(int, Handler)>
		return null;
	//  137  265:aconst_null     
	//  138  266:areturn         
		context = ((Context) (new StringBuilder()));
	//  139  267:new             #84  <Class StringBuilder>
	//  140  270:dup             
	//  141  271:invokespecial   #85  <Method void StringBuilder()>
	//  142  274:astore_0        
		((StringBuilder) (context)).append("Resource \"");
	//  143  275:aload_0         
	//  144  276:ldc1            #180 <String "Resource \"">
	//  145  278:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  146  281:pop             
		((StringBuilder) (context)).append(resources.getResourceName(i));
	//  147  282:aload_0         
	//  148  283:aload_1         
	//  149  284:iload_3         
	//  150  285:invokevirtual   #183 <Method String Resources.getResourceName(int)>
	//  151  288:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  152  291:pop             
		((StringBuilder) (context)).append("\" (");
	//  153  292:aload_0         
	//  154  293:ldc1            #185 <String "\" (">
	//  155  295:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  156  298:pop             
		((StringBuilder) (context)).append(Integer.toHexString(i));
	//  157  299:aload_0         
	//  158  300:iload_3         
	//  159  301:invokestatic    #97  <Method String Integer.toHexString(int)>
	//  160  304:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  161  307:pop             
		((StringBuilder) (context)).append(") is not a Font: ");
	//  162  308:aload_0         
	//  163  309:ldc1            #187 <String ") is not a Font: ">
	//  164  311:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  165  314:pop             
		((StringBuilder) (context)).append(((Object) (typedvalue)));
	//  166  315:aload_0         
	//  167  316:aload_2         
	//  168  317:invokevirtual   #190 <Method StringBuilder StringBuilder.append(Object)>
	//  169  320:pop             
		throw new android.content.res.Resources.NotFoundException(((StringBuilder) (context)).toString());
	//  170  321:new             #15  <Class android.content.res.Resources$NotFoundException>
	//  171  324:dup             
	//  172  325:aload_0         
	//  173  326:invokevirtual   #103 <Method String StringBuilder.toString()>
	//  174  329:invokespecial   #106 <Method void android.content.res.Resources$NotFoundException(String)>
	//  175  332:athrow          
		return null;
	//  176  333:aconst_null     
	//  177  334:areturn         
	}
}
