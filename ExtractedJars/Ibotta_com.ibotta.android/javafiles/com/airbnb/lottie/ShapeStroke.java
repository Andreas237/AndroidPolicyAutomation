// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.airbnb.lottie:
//			AnimatableColorValue, AnimatableFloatValue, AnimatableIntegerValue, LottieComposition

class ShapeStroke
{
	static class Factory
	{

		static ShapeStroke newInstance(JSONObject jsonobject, LottieComposition lottiecomposition)
		{
			String s;
			ArrayList arraylist;
			AnimatableColorValue animatablecolorvalue;
			AnimatableFloatValue animatablefloatvalue;
			AnimatableIntegerValue animatableintegervalue;
			LineCapType linecaptype;
			LineJoinType linejointype;
label0:
			{
label1:
				{
					s = jsonobject.optString("nm");
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "nm">
		//    2    3:invokevirtual   #17  <Method String JSONObject.optString(String)>
		//    3    6:astore          4
					arraylist = new ArrayList();
		//    4    8:new             #19  <Class ArrayList>
		//    5   11:dup             
		//    6   12:invokespecial   #23  <Method void ArrayList()>
		//    7   15:astore          5
					animatablecolorvalue = AnimatableColorValue.Factory.newInstance(jsonobject.optJSONObject("c"), lottiecomposition);
		//    8   17:aload_0         
		//    9   18:ldc1            #25  <String "c">
		//   10   20:invokevirtual   #29  <Method JSONObject JSONObject.optJSONObject(String)>
		//   11   23:aload_1         
		//   12   24:invokestatic    #34  <Method AnimatableColorValue AnimatableColorValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   13   27:astore          6
					animatablefloatvalue = AnimatableFloatValue.Factory.newInstance(jsonobject.optJSONObject("w"), lottiecomposition);
		//   14   29:aload_0         
		//   15   30:ldc1            #36  <String "w">
		//   16   32:invokevirtual   #29  <Method JSONObject JSONObject.optJSONObject(String)>
		//   17   35:aload_1         
		//   18   36:invokestatic    #41  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   19   39:astore          7
					animatableintegervalue = AnimatableIntegerValue.Factory.newInstance(jsonobject.optJSONObject("o"), lottiecomposition);
		//   20   41:aload_0         
		//   21   42:ldc1            #43  <String "o">
		//   22   44:invokevirtual   #29  <Method JSONObject JSONObject.optJSONObject(String)>
		//   23   47:aload_1         
		//   24   48:invokestatic    #48  <Method AnimatableIntegerValue AnimatableIntegerValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   25   51:astore          8
					linecaptype = LineCapType.values()[jsonobject.optInt("lc") - 1];
		//   26   53:invokestatic    #54  <Method ShapeStroke$LineCapType[] ShapeStroke$LineCapType.values()>
		//   27   56:aload_0         
		//   28   57:ldc1            #56  <String "lc">
		//   29   59:invokevirtual   #60  <Method int JSONObject.optInt(String)>
		//   30   62:iconst_1        
		//   31   63:isub            
		//   32   64:aaload          
		//   33   65:astore          9
					linejointype = LineJoinType.values()[jsonobject.optInt("lj") - 1];
		//   34   67:invokestatic    #65  <Method ShapeStroke$LineJoinType[] ShapeStroke$LineJoinType.values()>
		//   35   70:aload_0         
		//   36   71:ldc1            #67  <String "lj">
		//   37   73:invokevirtual   #60  <Method int JSONObject.optInt(String)>
		//   38   76:iconst_1        
		//   39   77:isub            
		//   40   78:aaload          
		//   41   79:astore          10
					if(!jsonobject.has("d"))
						break label1;
		//   42   81:aload_0         
		//   43   82:ldc1            #69  <String "d">
		//   44   84:invokevirtual   #73  <Method boolean JSONObject.has(String)>
		//   45   87:ifeq            235
					JSONArray jsonarray = jsonobject.optJSONArray("d");
		//   46   90:aload_0         
		//   47   91:ldc1            #69  <String "d">
		//   48   93:invokevirtual   #77  <Method JSONArray JSONObject.optJSONArray(String)>
		//   49   96:astore          11
					jsonobject = null;
		//   50   98:aconst_null     
		//   51   99:astore_0        
					for(int i = 0; i < jsonarray.length();)
		//*  52  100:iconst_0        
		//*  53  101:istore_2        
		//*  54  102:iload_2         
		//*  55  103:aload           11
		//*  56  105:invokevirtual   #83  <Method int JSONArray.length()>
		//*  57  108:icmpge          205
					{
						Object obj;
label2:
						{
							JSONObject jsonobject1 = jsonarray.optJSONObject(i);
		//   58  111:aload           11
		//   59  113:iload_2         
		//   60  114:invokevirtual   #86  <Method JSONObject JSONArray.optJSONObject(int)>
		//   61  117:astore          12
							String s1 = jsonobject1.optString("n");
		//   62  119:aload           12
		//   63  121:ldc1            #88  <String "n">
		//   64  123:invokevirtual   #17  <Method String JSONObject.optString(String)>
		//   65  126:astore          13
							if(s1.equals("o"))
		//*  66  128:aload           13
		//*  67  130:ldc1            #43  <String "o">
		//*  68  132:invokevirtual   #94  <Method boolean String.equals(Object)>
		//*  69  135:ifeq            153
							{
								obj = ((Object) (AnimatableFloatValue.Factory.newInstance(jsonobject1.optJSONObject("v"), lottiecomposition)));
		//   70  138:aload           12
		//   71  140:ldc1            #96  <String "v">
		//   72  142:invokevirtual   #29  <Method JSONObject JSONObject.optJSONObject(String)>
		//   73  145:aload_1         
		//   74  146:invokestatic    #41  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   75  149:astore_3        
								break label2;
		//   76  150:goto            196
							}
							if(!s1.equals("d"))
		//*  77  153:aload           13
		//*  78  155:ldc1            #69  <String "d">
		//*  79  157:invokevirtual   #94  <Method boolean String.equals(Object)>
		//*  80  160:ifne            175
							{
								obj = ((Object) (jsonobject));
		//   81  163:aload_0         
		//   82  164:astore_3        
								if(!s1.equals("g"))
									break label2;
		//   83  165:aload           13
		//   84  167:ldc1            #98  <String "g">
		//   85  169:invokevirtual   #94  <Method boolean String.equals(Object)>
		//   86  172:ifeq            196
							}
							((List) (arraylist)).add(((Object) (AnimatableFloatValue.Factory.newInstance(jsonobject1.optJSONObject("v"), lottiecomposition))));
		//   87  175:aload           5
		//   88  177:aload           12
		//   89  179:ldc1            #96  <String "v">
		//   90  181:invokevirtual   #29  <Method JSONObject JSONObject.optJSONObject(String)>
		//   91  184:aload_1         
		//   92  185:invokestatic    #41  <Method AnimatableFloatValue AnimatableFloatValue$Factory.newInstance(JSONObject, LottieComposition)>
		//   93  188:invokeinterface #103 <Method boolean List.add(Object)>
		//   94  193:pop             
							obj = ((Object) (jsonobject));
		//   95  194:aload_0         
		//   96  195:astore_3        
						}
						i++;
		//   97  196:iload_2         
		//   98  197:iconst_1        
		//   99  198:iadd            
		//  100  199:istore_2        
						jsonobject = ((JSONObject) (obj));
		//  101  200:aload_3         
		//  102  201:astore_0        
					}

		//* 103  202:goto            102
					if(((List) (arraylist)).size() == 1)
		//* 104  205:aload           5
		//* 105  207:invokeinterface #106 <Method int List.size()>
		//* 106  212:iconst_1        
		//* 107  213:icmpne          232
						((List) (arraylist)).add(((List) (arraylist)).get(0));
		//  108  216:aload           5
		//  109  218:aload           5
		//  110  220:iconst_0        
		//  111  221:invokeinterface #110 <Method Object List.get(int)>
		//  112  226:invokeinterface #103 <Method boolean List.add(Object)>
		//  113  231:pop             
					break label0;
		//  114  232:goto            237
				}
				jsonobject = null;
		//  115  235:aconst_null     
		//  116  236:astore_0        
			}
			return new ShapeStroke(s, ((AnimatableFloatValue) (jsonobject)), ((List) (arraylist)), animatablecolorvalue, animatableintegervalue, animatablefloatvalue, linecaptype, linejointype);
		//  117  237:new             #6   <Class ShapeStroke>
		//  118  240:dup             
		//  119  241:aload           4
		//  120  243:aload_0         
		//  121  244:aload           5
		//  122  246:aload           6
		//  123  248:aload           8
		//  124  250:aload           7
		//  125  252:aload           9
		//  126  254:aload           10
		//  127  256:aconst_null     
		//  128  257:invokespecial   #113 <Method void ShapeStroke(String, AnimatableFloatValue, List, AnimatableColorValue, AnimatableIntegerValue, AnimatableFloatValue, ShapeStroke$LineCapType, ShapeStroke$LineJoinType, ShapeStroke$1)>
		//  129  260:areturn         
		}
	}

	static final class LineCapType extends Enum
	{

		public static LineCapType valueOf(String s)
		{
			return (LineCapType)Enum.valueOf(com/airbnb/lottie/ShapeStroke$LineCapType, s);
		//    0    0:ldc1            #2   <Class ShapeStroke$LineCapType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ShapeStroke$LineCapType>
		//    4    9:areturn         
		}

		public static LineCapType[] values()
		{
			return (LineCapType[])((LineCapType []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field ShapeStroke$LineCapType[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.airbnb.lottie.ShapeStroke$LineCapType_3B_.clone()>
		//    2    6:checkcast       #42  <Class ShapeStroke$LineCapType[]>
		//    3    9:areturn         
		}

		android.graphics.Paint.Cap toPaintCap()
		{
			static class _cls1
			{

				static final int $SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType[];
				static final int $SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType[];

				static 
				{
					$SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType = new int[LineJoinType.values().length];
				//    0    0:invokestatic    #19  <Method ShapeStroke$LineJoinType[] ShapeStroke$LineJoinType.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType>
					try
					{
						$SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType[LineJoinType.Bevel.ordinal()] = 1;
				//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType>
				//    5   12:getstatic       #25  <Field ShapeStroke$LineJoinType ShapeStroke$LineJoinType.Bevel>
				//    6   15:invokevirtual   #29  <Method int ShapeStroke$LineJoinType.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType>
				//*  10   23:getstatic       #32  <Field ShapeStroke$LineJoinType ShapeStroke$LineJoinType.Miter>
				//*  11   26:invokevirtual   #29  <Method int ShapeStroke$LineJoinType.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType>
				//*  15   34:getstatic       #35  <Field ShapeStroke$LineJoinType ShapeStroke$LineJoinType.Round>
				//*  16   37:invokevirtual   #29  <Method int ShapeStroke$LineJoinType.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:invokestatic    #40  <Method ShapeStroke$LineCapType[] ShapeStroke$LineCapType.values()>
				//*  20   45:arraylength     
				//*  21   46:newarray        int[]
				//*  22   48:putstatic       #42  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType>
				//*  23   51:getstatic       #42  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType>
				//*  24   54:getstatic       #46  <Field ShapeStroke$LineCapType ShapeStroke$LineCapType.Butt>
				//*  25   57:invokevirtual   #47  <Method int ShapeStroke$LineCapType.ordinal()>
				//*  26   60:iconst_1        
				//*  27   61:iastore         
				//*  28   62:getstatic       #42  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType>
				//*  29   65:getstatic       #49  <Field ShapeStroke$LineCapType ShapeStroke$LineCapType.Round>
				//*  30   68:invokevirtual   #47  <Method int ShapeStroke$LineCapType.ordinal()>
				//*  31   71:iconst_2        
				//*  32   72:iastore         
				//*  33   73:getstatic       #42  <Field int[] $SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType>
				//*  34   76:getstatic       #52  <Field ShapeStroke$LineCapType ShapeStroke$LineCapType.Unknown>
				//*  35   79:invokevirtual   #47  <Method int ShapeStroke$LineCapType.ordinal()>
				//*  36   82:iconst_3        
				//*  37   83:iastore         
				//*  38   84:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   39   85:astore_0        
					try
					{
						$SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType[LineJoinType.Miter.ordinal()] = 2;
					}
				//*  40   86:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   41   89:astore_0        
					try
					{
						$SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType[LineJoinType.Round.ordinal()] = 3;
					}
				//*  42   90:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   43   93:astore_0        
					$SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType = new int[LineCapType.values().length];
					try
					{
						$SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType[LineCapType.Butt.ordinal()] = 1;
					}
				//*  44   94:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   45   97:astore_0        
					try
					{
						$SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType[LineCapType.Round.ordinal()] = 2;
					}
				//*  46   98:goto            62
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   47  101:astore_0        
					try
					{
						$SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType[LineCapType.Unknown.ordinal()] = 3;
					}
				//*  48  102:goto            73
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   49  105:astore_0        
				//*  50  106:return          
				}
			}

			switch(_cls1..SwitchMap.com.airbnb.lottie.ShapeStroke.LineCapType[ordinal()])
		//*   0    0:getstatic       #54  <Field int[] ShapeStroke$1.$SwitchMap$com$airbnb$lottie$ShapeStroke$LineCapType>
		//*   1    3:aload_0         
		//*   2    4:invokevirtual   #58  <Method int ordinal()>
		//*   3    7:iaload          
			{
		//*   4    8:tableswitch     1 2: default 32
		//		               1 40
		//		               2 36
			default:
				return android.graphics.Paint.Cap.SQUARE;
		//    5   32:getstatic       #64  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.SQUARE>
		//    6   35:areturn         

			case 2: // '\002'
				return android.graphics.Paint.Cap.ROUND;
		//    7   36:getstatic       #67  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.ROUND>
		//    8   39:areturn         

			case 1: // '\001'
				return android.graphics.Paint.Cap.BUTT;
		//    9   40:getstatic       #70  <Field android.graphics.Paint$Cap android.graphics.Paint$Cap.BUTT>
		//   10   43:areturn         
			}
		}

		private static final LineCapType $VALUES[];
		public static final LineCapType Butt;
		public static final LineCapType Round;
		public static final LineCapType Unknown;

		static 
		{
			Butt = new LineCapType("Butt", 0);
		//    0    0:new             #2   <Class ShapeStroke$LineCapType>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "Butt">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void ShapeStroke$LineCapType(String, int)>
		//    5   10:putstatic       #23  <Field ShapeStroke$LineCapType Butt>
			Round = new LineCapType("Round", 1);
		//    6   13:new             #2   <Class ShapeStroke$LineCapType>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "Round">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void ShapeStroke$LineCapType(String, int)>
		//   11   23:putstatic       #26  <Field ShapeStroke$LineCapType Round>
			Unknown = new LineCapType("Unknown", 2);
		//   12   26:new             #2   <Class ShapeStroke$LineCapType>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "Unknown">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void ShapeStroke$LineCapType(String, int)>
		//   17   36:putstatic       #29  <Field ShapeStroke$LineCapType Unknown>
			$VALUES = (new LineCapType[] {
				Butt, Round, Unknown
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       LineCapType[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field ShapeStroke$LineCapType Butt>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field ShapeStroke$LineCapType Round>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field ShapeStroke$LineCapType Unknown>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field ShapeStroke$LineCapType[] $VALUES>
		//*  33   64:return          
		}

		private LineCapType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	static final class LineJoinType extends Enum
	{

		public static LineJoinType valueOf(String s)
		{
			return (LineJoinType)Enum.valueOf(com/airbnb/lottie/ShapeStroke$LineJoinType, s);
		//    0    0:ldc1            #2   <Class ShapeStroke$LineJoinType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ShapeStroke$LineJoinType>
		//    4    9:areturn         
		}

		public static LineJoinType[] values()
		{
			return (LineJoinType[])((LineJoinType []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field ShapeStroke$LineJoinType[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.airbnb.lottie.ShapeStroke$LineJoinType_3B_.clone()>
		//    2    6:checkcast       #42  <Class ShapeStroke$LineJoinType[]>
		//    3    9:areturn         
		}

		android.graphics.Paint.Join toPaintJoin()
		{
			switch(_cls1..SwitchMap.com.airbnb.lottie.ShapeStroke.LineJoinType[ordinal()])
		//*   0    0:getstatic       #54  <Field int[] ShapeStroke$1.$SwitchMap$com$airbnb$lottie$ShapeStroke$LineJoinType>
		//*   1    3:aload_0         
		//*   2    4:invokevirtual   #58  <Method int ordinal()>
		//*   3    7:iaload          
			{
		//*   4    8:tableswitch     1 3: default 36
		//		               1 46
		//		               2 42
		//		               3 38
			default:
				return null;
		//    5   36:aconst_null     
		//    6   37:areturn         

			case 3: // '\003'
				return android.graphics.Paint.Join.ROUND;
		//    7   38:getstatic       #64  <Field android.graphics.Paint$Join android.graphics.Paint$Join.ROUND>
		//    8   41:areturn         

			case 2: // '\002'
				return android.graphics.Paint.Join.MITER;
		//    9   42:getstatic       #67  <Field android.graphics.Paint$Join android.graphics.Paint$Join.MITER>
		//   10   45:areturn         

			case 1: // '\001'
				return android.graphics.Paint.Join.BEVEL;
		//   11   46:getstatic       #70  <Field android.graphics.Paint$Join android.graphics.Paint$Join.BEVEL>
		//   12   49:areturn         
			}
		}

		private static final LineJoinType $VALUES[];
		public static final LineJoinType Bevel;
		public static final LineJoinType Miter;
		public static final LineJoinType Round;

		static 
		{
			Miter = new LineJoinType("Miter", 0);
		//    0    0:new             #2   <Class ShapeStroke$LineJoinType>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "Miter">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void ShapeStroke$LineJoinType(String, int)>
		//    5   10:putstatic       #23  <Field ShapeStroke$LineJoinType Miter>
			Round = new LineJoinType("Round", 1);
		//    6   13:new             #2   <Class ShapeStroke$LineJoinType>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "Round">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void ShapeStroke$LineJoinType(String, int)>
		//   11   23:putstatic       #26  <Field ShapeStroke$LineJoinType Round>
			Bevel = new LineJoinType("Bevel", 2);
		//   12   26:new             #2   <Class ShapeStroke$LineJoinType>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "Bevel">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void ShapeStroke$LineJoinType(String, int)>
		//   17   36:putstatic       #29  <Field ShapeStroke$LineJoinType Bevel>
			$VALUES = (new LineJoinType[] {
				Miter, Round, Bevel
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       LineJoinType[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field ShapeStroke$LineJoinType Miter>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field ShapeStroke$LineJoinType Round>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field ShapeStroke$LineJoinType Bevel>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field ShapeStroke$LineJoinType[] $VALUES>
		//*  33   64:return          
		}

		private LineJoinType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	private ShapeStroke(String s, AnimatableFloatValue animatablefloatvalue, List list, AnimatableColorValue animatablecolorvalue, AnimatableIntegerValue animatableintegervalue, AnimatableFloatValue animatablefloatvalue1, LineCapType linecaptype, 
			LineJoinType linejointype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		name = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field String name>
		offset = animatablefloatvalue;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field AnimatableFloatValue offset>
		lineDashPattern = list;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #43  <Field List lineDashPattern>
		color = animatablecolorvalue;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #45  <Field AnimatableColorValue color>
		opacity = animatableintegervalue;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #47  <Field AnimatableIntegerValue opacity>
		width = animatablefloatvalue1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #49  <Field AnimatableFloatValue width>
		capType = linecaptype;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #51  <Field ShapeStroke$LineCapType capType>
		joinType = linejointype;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #53  <Field ShapeStroke$LineJoinType joinType>
	//   26   49:return          
	}

	ShapeStroke(String s, AnimatableFloatValue animatablefloatvalue, List list, AnimatableColorValue animatablecolorvalue, AnimatableIntegerValue animatableintegervalue, AnimatableFloatValue animatablefloatvalue1, LineCapType linecaptype, 
			LineJoinType linejointype, _cls1 _pcls1)
	{
		this(s, animatablefloatvalue, list, animatablecolorvalue, animatableintegervalue, animatablefloatvalue1, linecaptype, linejointype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:aload           7
	//    8   12:aload           8
	//    9   14:invokespecial   #60  <Method void ShapeStroke(String, AnimatableFloatValue, List, AnimatableColorValue, AnimatableIntegerValue, AnimatableFloatValue, ShapeStroke$LineCapType, ShapeStroke$LineJoinType)>
	//   10   17:return          
	}

	LineCapType getCapType()
	{
		return capType;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field ShapeStroke$LineCapType capType>
	//    2    4:areturn         
	}

	AnimatableColorValue getColor()
	{
		return color;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field AnimatableColorValue color>
	//    2    4:areturn         
	}

	AnimatableFloatValue getDashOffset()
	{
		return offset;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field AnimatableFloatValue offset>
	//    2    4:areturn         
	}

	LineJoinType getJoinType()
	{
		return joinType;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field ShapeStroke$LineJoinType joinType>
	//    2    4:areturn         
	}

	List getLineDashPattern()
	{
		return lineDashPattern;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field List lineDashPattern>
	//    2    4:areturn         
	}

	String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String name>
	//    2    4:areturn         
	}

	AnimatableIntegerValue getOpacity()
	{
		return opacity;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field AnimatableIntegerValue opacity>
	//    2    4:areturn         
	}

	AnimatableFloatValue getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field AnimatableFloatValue width>
	//    2    4:areturn         
	}

	private final LineCapType capType;
	private final AnimatableColorValue color;
	private final LineJoinType joinType;
	private final List lineDashPattern;
	private final String name;
	private final AnimatableFloatValue offset;
	private final AnimatableIntegerValue opacity;
	private final AnimatableFloatValue width;
}
