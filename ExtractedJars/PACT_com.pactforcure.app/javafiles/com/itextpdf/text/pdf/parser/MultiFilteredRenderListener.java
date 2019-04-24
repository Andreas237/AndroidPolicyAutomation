// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;

import java.util.*;

// Referenced classes of package com.itextpdf.text.pdf.parser:
//			RenderListener, RenderFilter, ImageRenderInfo, TextRenderInfo

public class MultiFilteredRenderListener
	implements RenderListener
{

	public MultiFilteredRenderListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void ArrayList()>
	//    6   12:putfield        #20  <Field List delegates>
	//    7   15:aload_0         
	//    8   16:new             #17  <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #18  <Method void ArrayList()>
	//   11   23:putfield        #22  <Field List filters>
	//   12   26:return          
	}

	public transient RenderListener attachRenderListener(RenderListener renderlistener, RenderFilter arenderfilter[])
	{
		delegates.add(((Object) (renderlistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List delegates>
	//    2    4:aload_1         
	//    3    5:invokeinterface #31  <Method boolean List.add(Object)>
	//    4   10:pop             
		filters.add(((Object) (arenderfilter)));
	//    5   11:aload_0         
	//    6   12:getfield        #22  <Field List filters>
	//    7   15:aload_2         
	//    8   16:invokeinterface #31  <Method boolean List.add(Object)>
	//    9   21:pop             
		return renderlistener;
	//   10   22:aload_1         
	//   11   23:areturn         
	}

	public void beginTextBlock()
	{
		for(Iterator iterator = delegates.iterator(); iterator.hasNext(); ((RenderListener)iterator.next()).beginTextBlock());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List delegates>
	//    2    4:invokeinterface #38  <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #48  <Method Object Iterator.next()>
	//    9   25:checkcast       #6   <Class RenderListener>
	//   10   28:invokeinterface #50  <Method void RenderListener.beginTextBlock()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	public void endTextBlock()
	{
		for(Iterator iterator = delegates.iterator(); iterator.hasNext(); ((RenderListener)iterator.next()).endTextBlock());
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field List delegates>
	//    2    4:invokeinterface #38  <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #44  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #48  <Method Object Iterator.next()>
	//    9   25:checkcast       #6   <Class RenderListener>
	//   10   28:invokeinterface #53  <Method void RenderListener.endTextBlock()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	public void renderImage(ImageRenderInfo imagerenderinfo)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
label0:
		do
		{
			if(i < delegates.size())
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #20  <Field List delegates>
	//*   5    7:invokeinterface #59  <Method int List.size()>
	//*   6   12:icmpge          102
			{
				boolean flag1 = true;
	//    7   15:iconst_1        
	//    8   16:istore          5
				RenderFilter arenderfilter[] = (RenderFilter[])filters.get(i);
	//    9   18:aload_0         
	//   10   19:getfield        #22  <Field List filters>
	//   11   22:iload_2         
	//   12   23:invokeinterface #63  <Method Object List.get(int)>
	//   13   28:checkcast       #65  <Class RenderFilter[]>
	//   14   31:astore          7
				int k = arenderfilter.length;
	//   15   33:aload           7
	//   16   35:arraylength     
	//   17   36:istore          6
				int j = 0;
	//   18   38:iconst_0        
	//   19   39:istore_3        
				do
				{
label1:
					{
						boolean flag = flag1;
	//   20   40:iload           5
	//   21   42:istore          4
						if(j < k)
	//*  22   44:iload_3         
	//*  23   45:iload           6
	//*  24   47:icmpge          64
						{
							if(arenderfilter[j].allowImage(imagerenderinfo))
								break label1;
	//   25   50:aload           7
	//   26   52:iload_3         
	//   27   53:aaload          
	//   28   54:aload_1         
	//   29   55:invokevirtual   #71  <Method boolean RenderFilter.allowImage(ImageRenderInfo)>
	//   30   58:ifne            95
							flag = false;
	//   31   61:iconst_0        
	//   32   62:istore          4
						}
						if(flag)
	//*  33   64:iload           4
	//*  34   66:ifeq            88
							((RenderListener)delegates.get(i)).renderImage(imagerenderinfo);
	//   35   69:aload_0         
	//   36   70:getfield        #20  <Field List delegates>
	//   37   73:iload_2         
	//   38   74:invokeinterface #63  <Method Object List.get(int)>
	//   39   79:checkcast       #6   <Class RenderListener>
	//   40   82:aload_1         
	//   41   83:invokeinterface #73  <Method void RenderListener.renderImage(ImageRenderInfo)>
						i++;
	//   42   88:iload_2         
	//   43   89:iconst_1        
	//   44   90:iadd            
	//   45   91:istore_2        
						continue label0;
	//   46   92:goto            2
					}
					j++;
	//   47   95:iload_3         
	//   48   96:iconst_1        
	//   49   97:iadd            
	//   50   98:istore_3        
				} while(true);
	//   51   99:goto            40
			}
			return;
	//   52  102:return          
		} while(true);
	}

	public void renderText(TextRenderInfo textrenderinfo)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
label0:
		do
		{
			if(i < delegates.size())
	//*   2    2:iload_2         
	//*   3    3:aload_0         
	//*   4    4:getfield        #20  <Field List delegates>
	//*   5    7:invokeinterface #59  <Method int List.size()>
	//*   6   12:icmpge          102
			{
				boolean flag1 = true;
	//    7   15:iconst_1        
	//    8   16:istore          5
				RenderFilter arenderfilter[] = (RenderFilter[])filters.get(i);
	//    9   18:aload_0         
	//   10   19:getfield        #22  <Field List filters>
	//   11   22:iload_2         
	//   12   23:invokeinterface #63  <Method Object List.get(int)>
	//   13   28:checkcast       #65  <Class RenderFilter[]>
	//   14   31:astore          7
				int k = arenderfilter.length;
	//   15   33:aload           7
	//   16   35:arraylength     
	//   17   36:istore          6
				int j = 0;
	//   18   38:iconst_0        
	//   19   39:istore_3        
				do
				{
label1:
					{
						boolean flag = flag1;
	//   20   40:iload           5
	//   21   42:istore          4
						if(j < k)
	//*  22   44:iload_3         
	//*  23   45:iload           6
	//*  24   47:icmpge          64
						{
							if(arenderfilter[j].allowText(textrenderinfo))
								break label1;
	//   25   50:aload           7
	//   26   52:iload_3         
	//   27   53:aaload          
	//   28   54:aload_1         
	//   29   55:invokevirtual   #79  <Method boolean RenderFilter.allowText(TextRenderInfo)>
	//   30   58:ifne            95
							flag = false;
	//   31   61:iconst_0        
	//   32   62:istore          4
						}
						if(flag)
	//*  33   64:iload           4
	//*  34   66:ifeq            88
							((RenderListener)delegates.get(i)).renderText(textrenderinfo);
	//   35   69:aload_0         
	//   36   70:getfield        #20  <Field List delegates>
	//   37   73:iload_2         
	//   38   74:invokeinterface #63  <Method Object List.get(int)>
	//   39   79:checkcast       #6   <Class RenderListener>
	//   40   82:aload_1         
	//   41   83:invokeinterface #81  <Method void RenderListener.renderText(TextRenderInfo)>
						i++;
	//   42   88:iload_2         
	//   43   89:iconst_1        
	//   44   90:iadd            
	//   45   91:istore_2        
						continue label0;
	//   46   92:goto            2
					}
					j++;
	//   47   95:iload_3         
	//   48   96:iconst_1        
	//   49   97:iadd            
	//   50   98:istore_3        
				} while(true);
	//   51   99:goto            40
			}
			return;
	//   52  102:return          
		} while(true);
	}

	private final List delegates = new ArrayList();
	private final List filters = new ArrayList();
}
