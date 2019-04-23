// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.vast;

import java.util.*;

// Referenced classes of package com.appscend.vast:
//			APSVASTXMLNode

public class APSVASTRootNode extends APSVASTXMLNode
{
	public static final class APSAdPodFallback extends Enum
	{

		public static APSAdPodFallback valueOf(String s)
		{
			return (APSAdPodFallback)Enum.valueOf(com/appscend/vast/APSVASTRootNode$APSAdPodFallback, s);
		//    0    0:ldc1            #2   <Class APSVASTRootNode$APSAdPodFallback>
		//    1    2:aload_0         
		//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class APSVASTRootNode$APSAdPodFallback>
		//    4    9:areturn         
		}

		public static APSAdPodFallback[] values()
		{
			return (APSAdPodFallback[])((APSAdPodFallback []) ($VALUES)).clone();
		//    0    0:getstatic       #31  <Field APSVASTRootNode$APSAdPodFallback[] $VALUES>
		//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.appscend.vast.APSVASTRootNode$APSAdPodFallback_3B_.clone()>
		//    2    6:checkcast       #42  <Class APSVASTRootNode$APSAdPodFallback[]>
		//    3    9:areturn         
		}

		private static final APSAdPodFallback $VALUES[];
		public static final APSAdPodFallback APSAdPodFallbackDrop;
		public static final APSAdPodFallback APSAdPodFallbackSelectAll;
		public static final APSAdPodFallback APSAdPodFallbackSelectFirst;

		static 
		{
			APSAdPodFallbackSelectAll = new APSAdPodFallback("APSAdPodFallbackSelectAll", 0);
		//    0    0:new             #2   <Class APSVASTRootNode$APSAdPodFallback>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "APSAdPodFallbackSelectAll">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void APSVASTRootNode$APSAdPodFallback(String, int)>
		//    5   10:putstatic       #23  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackSelectAll>
			APSAdPodFallbackSelectFirst = new APSAdPodFallback("APSAdPodFallbackSelectFirst", 1);
		//    6   13:new             #2   <Class APSVASTRootNode$APSAdPodFallback>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "APSAdPodFallbackSelectFirst">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void APSVASTRootNode$APSAdPodFallback(String, int)>
		//   11   23:putstatic       #26  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackSelectFirst>
			APSAdPodFallbackDrop = new APSAdPodFallback("APSAdPodFallbackDrop", 2);
		//   12   26:new             #2   <Class APSVASTRootNode$APSAdPodFallback>
		//   13   29:dup             
		//   14   30:ldc1            #27  <String "APSAdPodFallbackDrop">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void APSVASTRootNode$APSAdPodFallback(String, int)>
		//   17   36:putstatic       #29  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackDrop>
			$VALUES = (new APSAdPodFallback[] {
				APSAdPodFallbackSelectAll, APSAdPodFallbackSelectFirst, APSAdPodFallbackDrop
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       APSAdPodFallback[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackSelectAll>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #26  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackSelectFirst>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #29  <Field APSVASTRootNode$APSAdPodFallback APSAdPodFallbackDrop>
		//   31   60:aastore         
		//   32   61:putstatic       #31  <Field APSVASTRootNode$APSAdPodFallback[] $VALUES>
		//*  33   64:return          
		}

		private APSAdPodFallback(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #33  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public APSVASTRootNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void APSVASTXMLNode()>
	//    2    4:return          
	}

	public ArrayList allAds()
	{
		return childrenNamed("Ad");
	//    0    0:aload_0         
	//    1    1:ldc1            #20  <String "Ad">
	//    2    3:invokevirtual   #24  <Method ArrayList childrenNamed(String)>
	//    3    6:areturn         
	}

	public ArrayList getAdsWithFallback(APSAdPodFallback apsadpodfallback)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #30  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void ArrayList()>
	//    3    7:astore_2        
		ArrayList arraylist1 = new ArrayList();
	//    4    8:new             #30  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #31  <Method void ArrayList()>
	//    7   15:astore_3        
		if(childrenNamed("Ad") != null)
	//*   8   16:aload_0         
	//*   9   17:ldc1            #20  <String "Ad">
	//*  10   19:invokevirtual   #24  <Method ArrayList childrenNamed(String)>
	//*  11   22:ifnull          91
		{
			for(Iterator iterator = childrenNamed("Ad").iterator(); iterator.hasNext();)
	//*  12   25:aload_0         
	//*  13   26:ldc1            #20  <String "Ad">
	//*  14   28:invokevirtual   #24  <Method ArrayList childrenNamed(String)>
	//*  15   31:invokevirtual   #35  <Method Iterator ArrayList.iterator()>
	//*  16   34:astore          4
	//*  17   36:aload           4
	//*  18   38:invokeinterface #41  <Method boolean Iterator.hasNext()>
	//*  19   43:ifeq            91
			{
				APSVASTXMLNode apsvastxmlnode = (APSVASTXMLNode)iterator.next();
	//   20   46:aload           4
	//   21   48:invokeinterface #45  <Method Object Iterator.next()>
	//   22   53:checkcast       #4   <Class APSVASTXMLNode>
	//   23   56:astore          5
				if(apsvastxmlnode.attributes.get("sequence") != null)
	//*  24   58:aload           5
	//*  25   60:getfield        #49  <Field HashMap APSVASTXMLNode.attributes>
	//*  26   63:ldc1            #51  <String "sequence">
	//*  27   65:invokevirtual   #57  <Method Object HashMap.get(Object)>
	//*  28   68:ifnull          81
					arraylist.add(((Object) (apsvastxmlnode)));
	//   29   71:aload_2         
	//   30   72:aload           5
	//   31   74:invokevirtual   #61  <Method boolean ArrayList.add(Object)>
	//   32   77:pop             
				else
	//*  33   78:goto            36
					arraylist1.add(((Object) (apsvastxmlnode)));
	//   34   81:aload_3         
	//   35   82:aload           5
	//   36   84:invokevirtual   #61  <Method boolean ArrayList.add(Object)>
	//   37   87:pop             
			}

		}
	//*  38   88:goto            36
		if(arraylist.size() > 0)
	//*  39   91:aload_2         
	//*  40   92:invokevirtual   #65  <Method int ArrayList.size()>
	//*  41   95:ifle            112
		{
			Collections.sort(((java.util.List) (arraylist)), new Comparator() {

				public int compare(Object obj, Object obj1)
				{
					obj = ((Object) ((String)((APSVASTXMLNode)obj).attributes.get("sequence")));
				//    0    0:aload_1         
				//    1    1:checkcast       #26  <Class APSVASTXMLNode>
				//    2    4:getfield        #30  <Field HashMap APSVASTXMLNode.attributes>
				//    3    7:ldc1            #32  <String "sequence">
				//    4    9:invokevirtual   #38  <Method Object HashMap.get(Object)>
				//    5   12:checkcast       #40  <Class String>
				//    6   15:astore_1        
					int i;
					if(obj != null)
				//*   7   16:aload_1         
				//*   8   17:ifnull          28
						i = Integer.parseInt(((String) (obj)));
				//    9   20:aload_1         
				//   10   21:invokestatic    #46  <Method int Integer.parseInt(String)>
				//   11   24:istore_3        
					else
				//*  12   25:goto            30
						i = 0;
				//   13   28:iconst_0        
				//   14   29:istore_3        
					obj = ((Object) ((String)((APSVASTXMLNode)obj1).attributes.get("sequence")));
				//   15   30:aload_2         
				//   16   31:checkcast       #26  <Class APSVASTXMLNode>
				//   17   34:getfield        #30  <Field HashMap APSVASTXMLNode.attributes>
				//   18   37:ldc1            #32  <String "sequence">
				//   19   39:invokevirtual   #38  <Method Object HashMap.get(Object)>
				//   20   42:checkcast       #40  <Class String>
				//   21   45:astore_1        
					int j;
					if(obj != null)
				//*  22   46:aload_1         
				//*  23   47:ifnull          59
						j = Integer.parseInt(((String) (obj)));
				//   24   50:aload_1         
				//   25   51:invokestatic    #46  <Method int Integer.parseInt(String)>
				//   26   54:istore          4
					else
				//*  27   56:goto            62
						j = 0;
				//   28   59:iconst_0        
				//   29   60:istore          4
					if(i < j)
				//*  30   62:iload_3         
				//*  31   63:iload           4
				//*  32   65:icmpge          70
						return -1;
				//   33   68:iconst_m1       
				//   34   69:ireturn         
					return i <= j ? 0 : 1;
				//   35   70:iload_3         
				//   36   71:iload           4
				//   37   73:icmple          78
				//   38   76:iconst_1        
				//   39   77:ireturn         
				//   40   78:iconst_0        
				//   41   79:ireturn         
				}

				final APSVASTRootNode this$0;

			
			{
				this$0 = APSVASTRootNode.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field APSVASTRootNode this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   42   98:aload_2         
	//   43   99:new             #6   <Class APSVASTRootNode$1>
	//   44  102:dup             
	//   45  103:aload_0         
	//   46  104:invokespecial   #68  <Method void APSVASTRootNode$1(APSVASTRootNode)>
	//   47  107:invokestatic    #74  <Method void Collections.sort(java.util.List, Comparator)>
			return arraylist;
	//   48  110:aload_2         
	//   49  111:areturn         
		}
		static class _cls2
		{

			static final int $SwitchMap$com$appscend$vast$APSVASTRootNode$APSAdPodFallback[];

			static 
			{
				$SwitchMap$com$appscend$vast$APSVASTRootNode$APSAdPodFallback = new int[APSAdPodFallback.values().length];
			//    0    0:invokestatic    #18  <Method APSVASTRootNode$APSAdPodFallback[] APSVASTRootNode$APSAdPodFallback.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$appscend$vast$APSVASTRootNode$APSAdPodFallback>
				try
				{
					$SwitchMap$com$appscend$vast$APSVASTRootNode$APSAdPodFallback[APSAdPodFallback.APSAdPodFallbackDrop.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$appscend$vast$APSVASTRootNode$APSAdPodFallback>
			//    5   12:getstatic       #24  <Field APSVASTRootNode$APSAdPodFallback APSVASTRootNode$APSAdPodFallback.APSAdPodFallbackDrop>
			//    6   15:invokevirtual   #28  <Method int APSVASTRootNode$APSAdPodFallback.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$appscend$vast$APSVASTRootNode$APSAdPodFallback>
			//*  10   23:getstatic       #31  <Field APSVASTRootNode$APSAdPodFallback APSVASTRootNode$APSAdPodFallback.APSAdPodFallbackSelectFirst>
			//*  11   26:invokevirtual   #28  <Method int APSVASTRootNode$APSAdPodFallback.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$appscend$vast$APSVASTRootNode$APSAdPodFallback>
			//*  15   34:getstatic       #34  <Field APSVASTRootNode$APSAdPodFallback APSVASTRootNode$APSAdPodFallback.APSAdPodFallbackSelectAll>
			//*  16   37:invokevirtual   #28  <Method int APSVASTRootNode$APSAdPodFallback.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$com$appscend$vast$APSVASTRootNode$APSAdPodFallback[APSAdPodFallback.APSAdPodFallbackSelectFirst.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$com$appscend$vast$APSVASTRootNode$APSAdPodFallback[APSAdPodFallback.APSAdPodFallbackSelectAll.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(_cls2..SwitchMap.com.appscend.vast.APSVASTRootNode.APSAdPodFallback[apsadpodfallback.ordinal()])
	//*  50  112:getstatic       #78  <Field int[] APSVASTRootNode$2.$SwitchMap$com$appscend$vast$APSVASTRootNode$APSAdPodFallback>
	//*  51  115:aload_1         
	//*  52  116:invokevirtual   #81  <Method int APSVASTRootNode$APSAdPodFallback.ordinal()>
	//*  53  119:iaload          
		{
	//*  54  120:tableswitch     1 2: default 144
	//	               1 169
	//	               2 146
		default:
			return arraylist1;
	//   55  144:aload_3         
	//   56  145:areturn         

		case 2: // '\002'
			return new ArrayList(((java.util.Collection) (Arrays.asList(new Object[] {
				arraylist1.get(0)
			}))));
	//   57  146:new             #30  <Class ArrayList>
	//   58  149:dup             
	//   59  150:iconst_1        
	//   60  151:anewarray       Object[]
	//   61  154:dup             
	//   62  155:iconst_0        
	//   63  156:aload_3         
	//   64  157:iconst_0        
	//   65  158:invokevirtual   #86  <Method Object ArrayList.get(int)>
	//   66  161:aastore         
	//   67  162:invokestatic    #92  <Method java.util.List Arrays.asList(Object[])>
	//   68  165:invokespecial   #95  <Method void ArrayList(java.util.Collection)>
	//   69  168:areturn         

		case 1: // '\001'
			return new ArrayList();
	//   70  169:new             #30  <Class ArrayList>
	//   71  172:dup             
	//   72  173:invokespecial   #31  <Method void ArrayList()>
	//   73  176:areturn         
		}
	}
}
