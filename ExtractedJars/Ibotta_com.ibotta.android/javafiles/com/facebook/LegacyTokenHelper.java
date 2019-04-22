// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import java.util.*;
import org.json.*;

// Referenced classes of package com.facebook:
//			AccessTokenSource, LoggingBehavior

final class LegacyTokenHelper
{

	public LegacyTokenHelper(Context context)
	{
		this(context, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #20  <Method void LegacyTokenHelper(Context, String)>
	//    4    6:return          
	}

	public LegacyTokenHelper(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		Validate.notNull(((Object) (context)), "context");
	//    2    4:aload_1         
	//    3    5:ldc1            #24  <String "context">
	//    4    7:invokestatic    #30  <Method void Validate.notNull(Object, String)>
		String s1 = s;
	//    5   10:aload_2         
	//    6   11:astore_3        
		if(Utility.isNullOrEmpty(s))
	//*   7   12:aload_2         
	//*   8   13:invokestatic    #36  <Method boolean Utility.isNullOrEmpty(String)>
	//*   9   16:ifeq            22
			s1 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
	//   10   19:ldc1            #38  <String "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY">
	//   11   21:astore_3        
		cacheKey = s1;
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:putfield        #40  <Field String cacheKey>
		s = ((String) (context.getApplicationContext()));
	//   15   27:aload_1         
	//   16   28:invokevirtual   #46  <Method Context Context.getApplicationContext()>
	//   17   31:astore_2        
		if(s != null)
	//*  18   32:aload_2         
	//*  19   33:ifnull          38
			context = ((Context) (s));
	//   20   36:aload_2         
	//   21   37:astore_1        
		cache = context.getSharedPreferences(cacheKey, 0);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:aload_0         
	//   25   41:getfield        #40  <Field String cacheKey>
	//   26   44:iconst_0        
	//   27   45:invokevirtual   #50  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   28   48:putfield        #52  <Field SharedPreferences cache>
	//   29   51:return          
	}

	private void deserializeKey(String s, Bundle bundle)
		throws JSONException
	{
		Object obj;
		obj = ((Object) (JSONObjectInstrumentation.init(cache.getString(s, "{}"))));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field SharedPreferences cache>
	//    2    4:aload_1         
	//    3    5:ldc1            #62  <String "{}">
	//    4    7:invokeinterface #68  <Method String SharedPreferences.getString(String, String)>
	//    5   12:invokestatic    #74  <Method JSONObject JSONObjectInstrumentation.init(String)>
	//    6   15:astore          12
		Object obj1 = ((Object) (((JSONObject) (obj)).getString("valueType")));
	//    7   17:aload           12
	//    8   19:ldc1            #76  <String "valueType">
	//    9   21:invokevirtual   #81  <Method String JSONObject.getString(String)>
	//   10   24:astore          13
		if(((String) (obj1)).equals("bool"))
	//*  11   26:aload           13
	//*  12   28:ldc1            #83  <String "bool">
	//*  13   30:invokevirtual   #89  <Method boolean String.equals(Object)>
	//*  14   33:ifeq            49
		{
			bundle.putBoolean(s, ((JSONObject) (obj)).getBoolean("value"));
	//   15   36:aload_2         
	//   16   37:aload_1         
	//   17   38:aload           12
	//   18   40:ldc1            #91  <String "value">
	//   19   42:invokevirtual   #94  <Method boolean JSONObject.getBoolean(String)>
	//   20   45:invokevirtual   #100 <Method void Bundle.putBoolean(String, boolean)>
			return;
	//   21   48:return          
		}
		boolean flag7 = ((String) (obj1)).equals("bool[]");
	//   22   49:aload           13
	//   23   51:ldc1            #102 <String "bool[]">
	//   24   53:invokevirtual   #89  <Method boolean String.equals(Object)>
	//   25   56:istore          11
		boolean flag1 = false;
	//   26   58:iconst_0        
	//   27   59:istore          5
		boolean flag2 = false;
	//   28   61:iconst_0        
	//   29   62:istore          6
		boolean flag3 = false;
	//   30   64:iconst_0        
	//   31   65:istore          7
		boolean flag4 = false;
	//   32   67:iconst_0        
	//   33   68:istore          8
		boolean flag5 = false;
	//   34   70:iconst_0        
	//   35   71:istore          9
		boolean flag6 = false;
	//   36   73:iconst_0        
	//   37   74:istore          10
		int i = 0;
	//   38   76:iconst_0        
	//   39   77:istore_3        
		boolean flag = false;
	//   40   78:iconst_0        
	//   41   79:istore          4
		if(flag7)
	//*  42   81:iload           11
	//*  43   83:ifeq            139
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//   44   86:aload           12
	//   45   88:ldc1            #91  <String "value">
	//   46   90:invokevirtual   #106 <Method JSONArray JSONObject.getJSONArray(String)>
	//   47   93:astore          12
			obj1 = ((Object) (new boolean[((JSONArray) (obj)).length()]));
	//   48   95:aload           12
	//   49   97:invokevirtual   #112 <Method int JSONArray.length()>
	//   50  100:newarray        boolean[]
	//   51  102:astore          13
			for(i = ((int) (flag)); i < obj1.length; i++)
	//*  52  104:iload           4
	//*  53  106:istore_3        
	//*  54  107:iload_3         
	//*  55  108:aload           13
	//*  56  110:arraylength     
	//*  57  111:icmpge          131
				obj1[i] = ((byte) (((JSONArray) (obj)).getBoolean(i)));
	//   58  114:aload           13
	//   59  116:iload_3         
	//   60  117:aload           12
	//   61  119:iload_3         
	//   62  120:invokevirtual   #115 <Method boolean JSONArray.getBoolean(int)>
	//   63  123:bastore         

	//   64  124:iload_3         
	//   65  125:iconst_1        
	//   66  126:iadd            
	//   67  127:istore_3        
	//*  68  128:goto            107
			bundle.putBooleanArray(s, ((boolean []) (obj1)));
	//   69  131:aload_2         
	//   70  132:aload_1         
	//   71  133:aload           13
	//   72  135:invokevirtual   #119 <Method void Bundle.putBooleanArray(String, boolean[])>
			return;
	//   73  138:return          
		}
		if(((String) (obj1)).equals("byte"))
	//*  74  139:aload           13
	//*  75  141:ldc1            #121 <String "byte">
	//*  76  143:invokevirtual   #89  <Method boolean String.equals(Object)>
	//*  77  146:ifeq            163
		{
			bundle.putByte(s, (byte)((JSONObject) (obj)).getInt("value"));
	//   78  149:aload_2         
	//   79  150:aload_1         
	//   80  151:aload           12
	//   81  153:ldc1            #91  <String "value">
	//   82  155:invokevirtual   #125 <Method int JSONObject.getInt(String)>
	//   83  158:int2byte        
	//   84  159:invokevirtual   #129 <Method void Bundle.putByte(String, byte)>
			return;
	//   85  162:return          
		}
		if(((String) (obj1)).equals("byte[]"))
	//*  86  163:aload           13
	//*  87  165:ldc1            #131 <String "byte[]">
	//*  88  167:invokevirtual   #89  <Method boolean String.equals(Object)>
	//*  89  170:ifeq            227
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//   90  173:aload           12
	//   91  175:ldc1            #91  <String "value">
	//   92  177:invokevirtual   #106 <Method JSONArray JSONObject.getJSONArray(String)>
	//   93  180:astore          12
			obj1 = ((Object) (new byte[((JSONArray) (obj)).length()]));
	//   94  182:aload           12
	//   95  184:invokevirtual   #112 <Method int JSONArray.length()>
	//   96  187:newarray        byte[]
	//   97  189:astore          13
			for(i = ((int) (flag1)); i < obj1.length; i++)
	//*  98  191:iload           5
	//*  99  193:istore_3        
	//* 100  194:iload_3         
	//* 101  195:aload           13
	//* 102  197:arraylength     
	//* 103  198:icmpge          219
				obj1[i] = (byte)((JSONArray) (obj)).getInt(i);
	//  104  201:aload           13
	//  105  203:iload_3         
	//  106  204:aload           12
	//  107  206:iload_3         
	//  108  207:invokevirtual   #134 <Method int JSONArray.getInt(int)>
	//  109  210:int2byte        
	//  110  211:bastore         

	//  111  212:iload_3         
	//  112  213:iconst_1        
	//  113  214:iadd            
	//  114  215:istore_3        
	//* 115  216:goto            194
			bundle.putByteArray(s, ((byte []) (obj1)));
	//  116  219:aload_2         
	//  117  220:aload_1         
	//  118  221:aload           13
	//  119  223:invokevirtual   #138 <Method void Bundle.putByteArray(String, byte[])>
			return;
	//  120  226:return          
		}
		if(((String) (obj1)).equals("short"))
	//* 121  227:aload           13
	//* 122  229:ldc1            #140 <String "short">
	//* 123  231:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 124  234:ifeq            251
		{
			bundle.putShort(s, (short)((JSONObject) (obj)).getInt("value"));
	//  125  237:aload_2         
	//  126  238:aload_1         
	//  127  239:aload           12
	//  128  241:ldc1            #91  <String "value">
	//  129  243:invokevirtual   #125 <Method int JSONObject.getInt(String)>
	//  130  246:int2short       
	//  131  247:invokevirtual   #144 <Method void Bundle.putShort(String, short)>
			return;
	//  132  250:return          
		}
		if(((String) (obj1)).equals("short[]"))
	//* 133  251:aload           13
	//* 134  253:ldc1            #146 <String "short[]">
	//* 135  255:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 136  258:ifeq            315
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  137  261:aload           12
	//  138  263:ldc1            #91  <String "value">
	//  139  265:invokevirtual   #106 <Method JSONArray JSONObject.getJSONArray(String)>
	//  140  268:astore          12
			obj1 = ((Object) (new short[((JSONArray) (obj)).length()]));
	//  141  270:aload           12
	//  142  272:invokevirtual   #112 <Method int JSONArray.length()>
	//  143  275:newarray        short[]
	//  144  277:astore          13
			for(i = ((int) (flag2)); i < obj1.length; i++)
	//* 145  279:iload           6
	//* 146  281:istore_3        
	//* 147  282:iload_3         
	//* 148  283:aload           13
	//* 149  285:arraylength     
	//* 150  286:icmpge          307
				obj1[i] = (short)((JSONArray) (obj)).getInt(i);
	//  151  289:aload           13
	//  152  291:iload_3         
	//  153  292:aload           12
	//  154  294:iload_3         
	//  155  295:invokevirtual   #134 <Method int JSONArray.getInt(int)>
	//  156  298:int2short       
	//  157  299:sastore         

	//  158  300:iload_3         
	//  159  301:iconst_1        
	//  160  302:iadd            
	//  161  303:istore_3        
	//* 162  304:goto            282
			bundle.putShortArray(s, ((short []) (obj1)));
	//  163  307:aload_2         
	//  164  308:aload_1         
	//  165  309:aload           13
	//  166  311:invokevirtual   #150 <Method void Bundle.putShortArray(String, short[])>
			return;
	//  167  314:return          
		}
		if(((String) (obj1)).equals("int"))
	//* 168  315:aload           13
	//* 169  317:ldc1            #152 <String "int">
	//* 170  319:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 171  322:ifeq            338
		{
			bundle.putInt(s, ((JSONObject) (obj)).getInt("value"));
	//  172  325:aload_2         
	//  173  326:aload_1         
	//  174  327:aload           12
	//  175  329:ldc1            #91  <String "value">
	//  176  331:invokevirtual   #125 <Method int JSONObject.getInt(String)>
	//  177  334:invokevirtual   #156 <Method void Bundle.putInt(String, int)>
			return;
	//  178  337:return          
		}
		if(((String) (obj1)).equals("int[]"))
	//* 179  338:aload           13
	//* 180  340:ldc1            #158 <String "int[]">
	//* 181  342:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 182  345:ifeq            401
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  183  348:aload           12
	//  184  350:ldc1            #91  <String "value">
	//  185  352:invokevirtual   #106 <Method JSONArray JSONObject.getJSONArray(String)>
	//  186  355:astore          12
			obj1 = ((Object) (new int[((JSONArray) (obj)).length()]));
	//  187  357:aload           12
	//  188  359:invokevirtual   #112 <Method int JSONArray.length()>
	//  189  362:newarray        int[]
	//  190  364:astore          13
			for(i = ((int) (flag3)); i < obj1.length; i++)
	//* 191  366:iload           7
	//* 192  368:istore_3        
	//* 193  369:iload_3         
	//* 194  370:aload           13
	//* 195  372:arraylength     
	//* 196  373:icmpge          393
				obj1[i] = ((JSONArray) (obj)).getInt(i);
	//  197  376:aload           13
	//  198  378:iload_3         
	//  199  379:aload           12
	//  200  381:iload_3         
	//  201  382:invokevirtual   #134 <Method int JSONArray.getInt(int)>
	//  202  385:iastore         

	//  203  386:iload_3         
	//  204  387:iconst_1        
	//  205  388:iadd            
	//  206  389:istore_3        
	//* 207  390:goto            369
			bundle.putIntArray(s, ((int []) (obj1)));
	//  208  393:aload_2         
	//  209  394:aload_1         
	//  210  395:aload           13
	//  211  397:invokevirtual   #162 <Method void Bundle.putIntArray(String, int[])>
			return;
	//  212  400:return          
		}
		if(((String) (obj1)).equals("long"))
	//* 213  401:aload           13
	//* 214  403:ldc1            #164 <String "long">
	//* 215  405:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 216  408:ifeq            424
		{
			bundle.putLong(s, ((JSONObject) (obj)).getLong("value"));
	//  217  411:aload_2         
	//  218  412:aload_1         
	//  219  413:aload           12
	//  220  415:ldc1            #91  <String "value">
	//  221  417:invokevirtual   #168 <Method long JSONObject.getLong(String)>
	//  222  420:invokevirtual   #172 <Method void Bundle.putLong(String, long)>
			return;
	//  223  423:return          
		}
		if(((String) (obj1)).equals("long[]"))
	//* 224  424:aload           13
	//* 225  426:ldc1            #174 <String "long[]">
	//* 226  428:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 227  431:ifeq            487
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  228  434:aload           12
	//  229  436:ldc1            #91  <String "value">
	//  230  438:invokevirtual   #106 <Method JSONArray JSONObject.getJSONArray(String)>
	//  231  441:astore          12
			obj1 = ((Object) (new long[((JSONArray) (obj)).length()]));
	//  232  443:aload           12
	//  233  445:invokevirtual   #112 <Method int JSONArray.length()>
	//  234  448:newarray        long[]
	//  235  450:astore          13
			for(i = ((int) (flag4)); i < obj1.length; i++)
	//* 236  452:iload           8
	//* 237  454:istore_3        
	//* 238  455:iload_3         
	//* 239  456:aload           13
	//* 240  458:arraylength     
	//* 241  459:icmpge          479
				obj1[i] = ((JSONArray) (obj)).getLong(i);
	//  242  462:aload           13
	//  243  464:iload_3         
	//  244  465:aload           12
	//  245  467:iload_3         
	//  246  468:invokevirtual   #177 <Method long JSONArray.getLong(int)>
	//  247  471:lastore         

	//  248  472:iload_3         
	//  249  473:iconst_1        
	//  250  474:iadd            
	//  251  475:istore_3        
	//* 252  476:goto            455
			bundle.putLongArray(s, ((long []) (obj1)));
	//  253  479:aload_2         
	//  254  480:aload_1         
	//  255  481:aload           13
	//  256  483:invokevirtual   #181 <Method void Bundle.putLongArray(String, long[])>
			return;
	//  257  486:return          
		}
		if(((String) (obj1)).equals("float"))
	//* 258  487:aload           13
	//* 259  489:ldc1            #183 <String "float">
	//* 260  491:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 261  494:ifeq            511
		{
			bundle.putFloat(s, (float)((JSONObject) (obj)).getDouble("value"));
	//  262  497:aload_2         
	//  263  498:aload_1         
	//  264  499:aload           12
	//  265  501:ldc1            #91  <String "value">
	//  266  503:invokevirtual   #187 <Method double JSONObject.getDouble(String)>
	//  267  506:d2f             
	//  268  507:invokevirtual   #191 <Method void Bundle.putFloat(String, float)>
			return;
	//  269  510:return          
		}
		if(((String) (obj1)).equals("float[]"))
	//* 270  511:aload           13
	//* 271  513:ldc1            #193 <String "float[]">
	//* 272  515:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 273  518:ifeq            575
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  274  521:aload           12
	//  275  523:ldc1            #91  <String "value">
	//  276  525:invokevirtual   #106 <Method JSONArray JSONObject.getJSONArray(String)>
	//  277  528:astore          12
			obj1 = ((Object) (new float[((JSONArray) (obj)).length()]));
	//  278  530:aload           12
	//  279  532:invokevirtual   #112 <Method int JSONArray.length()>
	//  280  535:newarray        float[]
	//  281  537:astore          13
			for(i = ((int) (flag5)); i < obj1.length; i++)
	//* 282  539:iload           9
	//* 283  541:istore_3        
	//* 284  542:iload_3         
	//* 285  543:aload           13
	//* 286  545:arraylength     
	//* 287  546:icmpge          567
				obj1[i] = (float)((JSONArray) (obj)).getDouble(i);
	//  288  549:aload           13
	//  289  551:iload_3         
	//  290  552:aload           12
	//  291  554:iload_3         
	//  292  555:invokevirtual   #196 <Method double JSONArray.getDouble(int)>
	//  293  558:d2f             
	//  294  559:fastore         

	//  295  560:iload_3         
	//  296  561:iconst_1        
	//  297  562:iadd            
	//  298  563:istore_3        
	//* 299  564:goto            542
			bundle.putFloatArray(s, ((float []) (obj1)));
	//  300  567:aload_2         
	//  301  568:aload_1         
	//  302  569:aload           13
	//  303  571:invokevirtual   #200 <Method void Bundle.putFloatArray(String, float[])>
			return;
	//  304  574:return          
		}
		if(((String) (obj1)).equals("double"))
	//* 305  575:aload           13
	//* 306  577:ldc1            #202 <String "double">
	//* 307  579:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 308  582:ifeq            598
		{
			bundle.putDouble(s, ((JSONObject) (obj)).getDouble("value"));
	//  309  585:aload_2         
	//  310  586:aload_1         
	//  311  587:aload           12
	//  312  589:ldc1            #91  <String "value">
	//  313  591:invokevirtual   #187 <Method double JSONObject.getDouble(String)>
	//  314  594:invokevirtual   #206 <Method void Bundle.putDouble(String, double)>
			return;
	//  315  597:return          
		}
		if(((String) (obj1)).equals("double[]"))
	//* 316  598:aload           13
	//* 317  600:ldc1            #208 <String "double[]">
	//* 318  602:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 319  605:ifeq            661
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  320  608:aload           12
	//  321  610:ldc1            #91  <String "value">
	//  322  612:invokevirtual   #106 <Method JSONArray JSONObject.getJSONArray(String)>
	//  323  615:astore          12
			obj1 = ((Object) (new double[((JSONArray) (obj)).length()]));
	//  324  617:aload           12
	//  325  619:invokevirtual   #112 <Method int JSONArray.length()>
	//  326  622:newarray        double[]
	//  327  624:astore          13
			for(i = ((int) (flag6)); i < obj1.length; i++)
	//* 328  626:iload           10
	//* 329  628:istore_3        
	//* 330  629:iload_3         
	//* 331  630:aload           13
	//* 332  632:arraylength     
	//* 333  633:icmpge          653
				obj1[i] = ((JSONArray) (obj)).getDouble(i);
	//  334  636:aload           13
	//  335  638:iload_3         
	//  336  639:aload           12
	//  337  641:iload_3         
	//  338  642:invokevirtual   #196 <Method double JSONArray.getDouble(int)>
	//  339  645:dastore         

	//  340  646:iload_3         
	//  341  647:iconst_1        
	//  342  648:iadd            
	//  343  649:istore_3        
	//* 344  650:goto            629
			bundle.putDoubleArray(s, ((double []) (obj1)));
	//  345  653:aload_2         
	//  346  654:aload_1         
	//  347  655:aload           13
	//  348  657:invokevirtual   #212 <Method void Bundle.putDoubleArray(String, double[])>
			return;
	//  349  660:return          
		}
		if(((String) (obj1)).equals("char"))
	//* 350  661:aload           13
	//* 351  663:ldc1            #214 <String "char">
	//* 352  665:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 353  668:ifeq            706
		{
			obj = ((Object) (((JSONObject) (obj)).getString("value")));
	//  354  671:aload           12
	//  355  673:ldc1            #91  <String "value">
	//  356  675:invokevirtual   #81  <Method String JSONObject.getString(String)>
	//  357  678:astore          12
			if(obj != null && ((String) (obj)).length() == 1)
	//* 358  680:aload           12
	//* 359  682:ifnull          945
	//* 360  685:aload           12
	//* 361  687:invokevirtual   #215 <Method int String.length()>
	//* 362  690:iconst_1        
	//* 363  691:icmpne          945
			{
				bundle.putChar(s, ((String) (obj)).charAt(0));
	//  364  694:aload_2         
	//  365  695:aload_1         
	//  366  696:aload           12
	//  367  698:iconst_0        
	//  368  699:invokevirtual   #219 <Method char String.charAt(int)>
	//  369  702:invokevirtual   #223 <Method void Bundle.putChar(String, char)>
				return;
	//  370  705:return          
			}
			break MISSING_BLOCK_LABEL_945;
		}
		if(((String) (obj1)).equals("char[]"))
	//* 371  706:aload           13
	//* 372  708:ldc1            #225 <String "char[]">
	//* 373  710:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 374  713:ifeq            790
		{
			obj = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  375  716:aload           12
	//  376  718:ldc1            #91  <String "value">
	//  377  720:invokevirtual   #106 <Method JSONArray JSONObject.getJSONArray(String)>
	//  378  723:astore          12
			obj1 = ((Object) (new char[((JSONArray) (obj)).length()]));
	//  379  725:aload           12
	//  380  727:invokevirtual   #112 <Method int JSONArray.length()>
	//  381  730:newarray        char[]
	//  382  732:astore          13
			for(i = 0; i < obj1.length; i++)
	//* 383  734:iconst_0        
	//* 384  735:istore_3        
	//* 385  736:iload_3         
	//* 386  737:aload           13
	//* 387  739:arraylength     
	//* 388  740:icmpge          782
			{
				String s1 = ((JSONArray) (obj)).getString(i);
	//  389  743:aload           12
	//  390  745:iload_3         
	//  391  746:invokevirtual   #228 <Method String JSONArray.getString(int)>
	//  392  749:astore          14
				if(s1 != null && s1.length() == 1)
	//* 393  751:aload           14
	//* 394  753:ifnull          775
	//* 395  756:aload           14
	//* 396  758:invokevirtual   #215 <Method int String.length()>
	//* 397  761:iconst_1        
	//* 398  762:icmpne          775
					obj1[i] = ((double) (s1.charAt(0)));
	//  399  765:aload           13
	//  400  767:iload_3         
	//  401  768:aload           14
	//  402  770:iconst_0        
	//  403  771:invokevirtual   #219 <Method char String.charAt(int)>
	//  404  774:castore         
			}

	//  405  775:iload_3         
	//  406  776:iconst_1        
	//  407  777:iadd            
	//  408  778:istore_3        
	//* 409  779:goto            736
			bundle.putCharArray(s, ((char []) (obj1)));
	//  410  782:aload_2         
	//  411  783:aload_1         
	//  412  784:aload           13
	//  413  786:invokevirtual   #232 <Method void Bundle.putCharArray(String, char[])>
			return;
	//  414  789:return          
		}
		if(((String) (obj1)).equals("string"))
	//* 415  790:aload           13
	//* 416  792:ldc1            #234 <String "string">
	//* 417  794:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 418  797:ifeq            813
		{
			bundle.putString(s, ((JSONObject) (obj)).getString("value"));
	//  419  800:aload_2         
	//  420  801:aload_1         
	//  421  802:aload           12
	//  422  804:ldc1            #91  <String "value">
	//  423  806:invokevirtual   #81  <Method String JSONObject.getString(String)>
	//  424  809:invokevirtual   #238 <Method void Bundle.putString(String, String)>
			return;
	//  425  812:return          
		}
		if(((String) (obj1)).equals("stringList"))
	//* 426  813:aload           13
	//* 427  815:ldc1            #240 <String "stringList">
	//* 428  817:invokevirtual   #89  <Method boolean String.equals(Object)>
	//* 429  820:ifeq            908
		{
			obj1 = ((Object) (((JSONObject) (obj)).getJSONArray("value")));
	//  430  823:aload           12
	//  431  825:ldc1            #91  <String "value">
	//  432  827:invokevirtual   #106 <Method JSONArray JSONObject.getJSONArray(String)>
	//  433  830:astore          13
			int j = ((JSONArray) (obj1)).length();
	//  434  832:aload           13
	//  435  834:invokevirtual   #112 <Method int JSONArray.length()>
	//  436  837:istore          4
			ArrayList arraylist = new ArrayList(j);
	//  437  839:new             #242 <Class ArrayList>
	//  438  842:dup             
	//  439  843:iload           4
	//  440  845:invokespecial   #245 <Method void ArrayList(int)>
	//  441  848:astore          14
			for(; i < j; i++)
	//* 442  850:iload_3         
	//* 443  851:iload           4
	//* 444  853:icmpge          900
			{
				obj = ((JSONArray) (obj1)).get(i);
	//  445  856:aload           13
	//  446  858:iload_3         
	//  447  859:invokevirtual   #249 <Method Object JSONArray.get(int)>
	//  448  862:astore          12
				if(obj == JSONObject.NULL)
	//* 449  864:aload           12
	//* 450  866:getstatic       #253 <Field Object JSONObject.NULL>
	//* 451  869:if_acmpne       878
					obj = null;
	//  452  872:aconst_null     
	//  453  873:astore          12
				else
	//* 454  875:goto            885
					obj = ((Object) ((String)obj));
	//  455  878:aload           12
	//  456  880:checkcast       #85  <Class String>
	//  457  883:astore          12
				arraylist.add(i, obj);
	//  458  885:aload           14
	//  459  887:iload_3         
	//  460  888:aload           12
	//  461  890:invokevirtual   #257 <Method void ArrayList.add(int, Object)>
			}

	//  462  893:iload_3         
	//  463  894:iconst_1        
	//  464  895:iadd            
	//  465  896:istore_3        
	//* 466  897:goto            850
			bundle.putStringArrayList(s, arraylist);
	//  467  900:aload_2         
	//  468  901:aload_1         
	//  469  902:aload           14
	//  470  904:invokevirtual   #261 <Method void Bundle.putStringArrayList(String, ArrayList)>
			return;
	//  471  907:return          
		}
		if(!((String) (obj1)).equals("enum"))
			break MISSING_BLOCK_LABEL_945;
	//  472  908:aload           13
	//  473  910:ldc2            #263 <String "enum">
	//  474  913:invokevirtual   #89  <Method boolean String.equals(Object)>
	//  475  916:ifeq            945
		bundle.putSerializable(s, ((java.io.Serializable) (Enum.valueOf(Class.forName(((JSONObject) (obj)).getString("enumType")), ((JSONObject) (obj)).getString("value")))));
	//  476  919:aload_2         
	//  477  920:aload_1         
	//  478  921:aload           12
	//  479  923:ldc2            #265 <String "enumType">
	//  480  926:invokevirtual   #81  <Method String JSONObject.getString(String)>
	//  481  929:invokestatic    #271 <Method Class Class.forName(String)>
	//  482  932:aload           12
	//  483  934:ldc1            #91  <String "value">
	//  484  936:invokevirtual   #81  <Method String JSONObject.getString(String)>
	//  485  939:invokestatic    #277 <Method Enum Enum.valueOf(Class, String)>
	//  486  942:invokevirtual   #281 <Method void Bundle.putSerializable(String, java.io.Serializable)>
		return;
	//  487  945:return          
		s;
	//  488  946:astore_1        
	//  489  947:return          
	}

	public static String getApplicationId(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #286 <String "bundle">
	//    2    4:invokestatic    #30  <Method void Validate.notNull(Object, String)>
		return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
	//    3    7:aload_0         
	//    4    8:ldc2            #288 <String "com.facebook.TokenCachingStrategy.ApplicationId">
	//    5   11:invokevirtual   #289 <Method String Bundle.getString(String)>
	//    6   14:areturn         
	}

	static Date getDate(Bundle bundle, String s)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		long l = bundle.getLong(s, 0x0L);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:ldc2w           #292 <Long 0x0L>
	//    7   11:invokevirtual   #296 <Method long Bundle.getLong(String, long)>
	//    8   14:lstore_2        
		if(l == 0x0L)
	//*   9   15:lload_2         
	//*  10   16:ldc2w           #292 <Long 0x0L>
	//*  11   19:lcmp            
	//*  12   20:ifne            25
			return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
		else
			return new Date(l);
	//   15   25:new             #298 <Class Date>
	//   16   28:dup             
	//   17   29:lload_2         
	//   18   30:invokespecial   #301 <Method void Date(long)>
	//   19   33:areturn         
	}

	public static AccessTokenSource getSource(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #286 <String "bundle">
	//    2    4:invokestatic    #30  <Method void Validate.notNull(Object, String)>
		if(bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource"))
	//*   3    7:aload_0         
	//*   4    8:ldc2            #305 <String "com.facebook.TokenCachingStrategy.AccessTokenSource">
	//*   5   11:invokevirtual   #308 <Method boolean Bundle.containsKey(String)>
	//*   6   14:ifeq            28
			return (AccessTokenSource)bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
	//    7   17:aload_0         
	//    8   18:ldc2            #305 <String "com.facebook.TokenCachingStrategy.AccessTokenSource">
	//    9   21:invokevirtual   #312 <Method java.io.Serializable Bundle.getSerializable(String)>
	//   10   24:checkcast       #314 <Class AccessTokenSource>
	//   11   27:areturn         
		if(bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO"))
	//*  12   28:aload_0         
	//*  13   29:ldc2            #316 <String "com.facebook.TokenCachingStrategy.IsSSO">
	//*  14   32:invokevirtual   #317 <Method boolean Bundle.getBoolean(String)>
	//*  15   35:ifeq            42
			return AccessTokenSource.FACEBOOK_APPLICATION_WEB;
	//   16   38:getstatic       #321 <Field AccessTokenSource AccessTokenSource.FACEBOOK_APPLICATION_WEB>
	//   17   41:areturn         
		else
			return AccessTokenSource.WEB_VIEW;
	//   18   42:getstatic       #324 <Field AccessTokenSource AccessTokenSource.WEB_VIEW>
	//   19   45:areturn         
	}

	public static String getToken(Bundle bundle)
	{
		Validate.notNull(((Object) (bundle)), "bundle");
	//    0    0:aload_0         
	//    1    1:ldc2            #286 <String "bundle">
	//    2    4:invokestatic    #30  <Method void Validate.notNull(Object, String)>
		return bundle.getString("com.facebook.TokenCachingStrategy.Token");
	//    3    7:aload_0         
	//    4    8:ldc2            #327 <String "com.facebook.TokenCachingStrategy.Token">
	//    5   11:invokevirtual   #289 <Method String Bundle.getString(String)>
	//    6   14:areturn         
	}

	public static boolean hasTokenInformation(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		String s = bundle.getString("com.facebook.TokenCachingStrategy.Token");
	//    4    6:aload_0         
	//    5    7:ldc2            #327 <String "com.facebook.TokenCachingStrategy.Token">
	//    6   10:invokevirtual   #289 <Method String Bundle.getString(String)>
	//    7   13:astore_1        
		if(s != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          44
		{
			if(s.length() == 0)
	//*  10   18:aload_1         
	//*  11   19:invokevirtual   #215 <Method int String.length()>
	//*  12   22:ifne            27
				return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
			return bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L;
	//   15   27:aload_0         
	//   16   28:ldc2            #331 <String "com.facebook.TokenCachingStrategy.ExpirationDate">
	//   17   31:lconst_0        
	//   18   32:invokevirtual   #296 <Method long Bundle.getLong(String, long)>
	//   19   35:lconst_0        
	//   20   36:lcmp            
	//   21   37:ifne            42
	//   22   40:iconst_0        
	//   23   41:ireturn         
	//   24   42:iconst_1        
	//   25   43:ireturn         
		} else
		{
			return false;
	//   26   44:iconst_0        
	//   27   45:ireturn         
		}
	}

	public void clear()
	{
		cache.edit().clear().apply();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field SharedPreferences cache>
	//    2    4:invokeinterface #336 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:invokeinterface #340 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.clear()>
	//    4   14:invokeinterface #343 <Method void android.content.SharedPreferences$Editor.apply()>
	//    5   19:return          
	}

	public Bundle load()
	{
		Object obj = ((Object) (new Bundle()));
	//    0    0:new             #96  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #346 <Method void Bundle()>
	//    3    7:astore_2        
		Iterator iterator = cache.getAll().keySet().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #52  <Field SharedPreferences cache>
	//    6   12:invokeinterface #350 <Method Map SharedPreferences.getAll()>
	//    7   17:invokeinterface #356 <Method Set Map.keySet()>
	//    8   22:invokeinterface #362 <Method Iterator Set.iterator()>
	//    9   27:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   10   28:aload_3         
	//   11   29:invokeinterface #368 <Method boolean Iterator.hasNext()>
	//   12   34:ifeq            121
			String s = (String)iterator.next();
	//   13   37:aload_3         
	//   14   38:invokeinterface #372 <Method Object Iterator.next()>
	//   15   43:checkcast       #85  <Class String>
	//   16   46:astore_1        
			try
			{
				deserializeKey(s, ((Bundle) (obj)));
	//   17   47:aload_0         
	//   18   48:aload_1         
	//   19   49:aload_2         
	//   20   50:invokespecial   #374 <Method void deserializeKey(String, Bundle)>
			}
	//*  21   53:goto            28
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  22   56:astore_2        
			{
				LoggingBehavior loggingbehavior = LoggingBehavior.CACHE;
	//   23   57:getstatic       #380 <Field LoggingBehavior LoggingBehavior.CACHE>
	//   24   60:astore_3        
				String s1 = TAG;
	//   25   61:getstatic       #382 <Field String TAG>
	//   26   64:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   27   66:new             #384 <Class StringBuilder>
	//   28   69:dup             
	//   29   70:invokespecial   #385 <Method void StringBuilder()>
	//   30   73:astore          5
				stringbuilder.append("Error reading cached value for key: '");
	//   31   75:aload           5
	//   32   77:ldc2            #387 <String "Error reading cached value for key: '">
	//   33   80:invokevirtual   #391 <Method StringBuilder StringBuilder.append(String)>
	//   34   83:pop             
				stringbuilder.append(s);
	//   35   84:aload           5
	//   36   86:aload_1         
	//   37   87:invokevirtual   #391 <Method StringBuilder StringBuilder.append(String)>
	//   38   90:pop             
				stringbuilder.append("' -- ");
	//   39   91:aload           5
	//   40   93:ldc2            #393 <String "' -- ">
	//   41   96:invokevirtual   #391 <Method StringBuilder StringBuilder.append(String)>
	//   42   99:pop             
				stringbuilder.append(obj);
	//   43  100:aload           5
	//   44  102:aload_2         
	//   45  103:invokevirtual   #396 <Method StringBuilder StringBuilder.append(Object)>
	//   46  106:pop             
				Logger.log(loggingbehavior, 5, s1, stringbuilder.toString());
	//   47  107:aload_3         
	//   48  108:iconst_5        
	//   49  109:aload           4
	//   50  111:aload           5
	//   51  113:invokevirtual   #400 <Method String StringBuilder.toString()>
	//   52  116:invokestatic    #406 <Method void Logger.log(LoggingBehavior, int, String, String)>
				return null;
	//   53  119:aconst_null     
	//   54  120:areturn         
			}
		} while(true);
		return ((Bundle) (obj));
	//   55  121:aload_2         
	//   56  122:areturn         
	}

	private static final String TAG = "LegacyTokenHelper";
	private SharedPreferences cache;
	private String cacheKey;

	static 
	{
	//    0    0:return          
	}
}
