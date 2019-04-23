// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer;

import android.os.Handler;
import com.google.android.exoplayer.upstream.Allocator;
import com.google.android.exoplayer.upstream.NetworkLock;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer:
//			LoadControl

public final class DefaultLoadControl
	implements LoadControl
{
	public static interface EventListener
	{

		public abstract void onLoadingChanged(boolean flag);
	}

	private static class LoaderState
	{

		public final int bufferSizeContribution;
		public int bufferState;
		public boolean loading;
		public long nextLoadPositionUs;

		public LoaderState(int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void Object()>
			bufferSizeContribution = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #21  <Field int bufferSizeContribution>
			bufferState = 0;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #23  <Field int bufferState>
			loading = false;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #25  <Field boolean loading>
			nextLoadPositionUs = -1L;
		//   11   19:aload_0         
		//   12   20:ldc2w           #26  <Long -1L>
		//   13   23:putfield        #29  <Field long nextLoadPositionUs>
		//   14   26:return          
		}
	}


	public DefaultLoadControl(Allocator allocator1)
	{
		this(allocator1, ((Handler) (null)), ((EventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #58  <Method void DefaultLoadControl(Allocator, Handler, DefaultLoadControl$EventListener)>
	//    5    7:return          
	}

	public DefaultLoadControl(Allocator allocator1, Handler handler, EventListener eventlistener)
	{
		this(allocator1, handler, eventlistener, 15000, 30000, 0.2F, 0.8F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:sipush          15000
	//    5    7:sipush          30000
	//    6   10:ldc1            #28  <Float 0.2F>
	//    7   12:ldc1            #24  <Float 0.8F>
	//    8   14:invokespecial   #62  <Method void DefaultLoadControl(Allocator, Handler, DefaultLoadControl$EventListener, int, int, float, float)>
	//    9   17:return          
	}

	public DefaultLoadControl(Allocator allocator1, Handler handler, EventListener eventlistener, int i, int j, float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void Object()>
		allocator = allocator1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #67  <Field Allocator allocator>
		eventHandler = handler;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #69  <Field Handler eventHandler>
		eventListener = eventlistener;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #71  <Field DefaultLoadControl$EventListener eventListener>
		loaders = ((List) (new ArrayList()));
	//   11   19:aload_0         
	//   12   20:new             #73  <Class ArrayList>
	//   13   23:dup             
	//   14   24:invokespecial   #74  <Method void ArrayList()>
	//   15   27:putfield        #76  <Field List loaders>
		loaderStates = new HashMap();
	//   16   30:aload_0         
	//   17   31:new             #78  <Class HashMap>
	//   18   34:dup             
	//   19   35:invokespecial   #79  <Method void HashMap()>
	//   20   38:putfield        #81  <Field HashMap loaderStates>
		lowWatermarkUs = (long)i * 1000L;
	//   21   41:aload_0         
	//   22   42:iload           4
	//   23   44:i2l             
	//   24   45:ldc2w           #82  <Long 1000L>
	//   25   48:lmul            
	//   26   49:putfield        #85  <Field long lowWatermarkUs>
		highWatermarkUs = (long)j * 1000L;
	//   27   52:aload_0         
	//   28   53:iload           5
	//   29   55:i2l             
	//   30   56:ldc2w           #82  <Long 1000L>
	//   31   59:lmul            
	//   32   60:putfield        #87  <Field long highWatermarkUs>
		lowBufferLoad = f;
	//   33   63:aload_0         
	//   34   64:fload           6
	//   35   66:putfield        #89  <Field float lowBufferLoad>
		highBufferLoad = f1;
	//   36   69:aload_0         
	//   37   70:fload           7
	//   38   72:putfield        #91  <Field float highBufferLoad>
	//   39   75:return          
	}

	private int getBufferState(int i)
	{
		float f = (float)i / (float)targetBufferSize;
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:aload_0         
	//    3    3:getfield        #97  <Field int targetBufferSize>
	//    4    6:i2f             
	//    5    7:fdiv            
	//    6    8:fstore_2        
		if(f > highBufferLoad)
	//*   7    9:fload_2         
	//*   8   10:aload_0         
	//*   9   11:getfield        #91  <Field float highBufferLoad>
	//*  10   14:fcmpl           
	//*  11   15:ifle            20
			return 0;
	//   12   18:iconst_0        
	//   13   19:ireturn         
		return f >= lowBufferLoad ? 1 : 2;
	//   14   20:fload_2         
	//   15   21:aload_0         
	//   16   22:getfield        #89  <Field float lowBufferLoad>
	//   17   25:fcmpg           
	//   18   26:ifge            31
	//   19   29:iconst_2        
	//   20   30:ireturn         
	//   21   31:iconst_1        
	//   22   32:ireturn         
	}

	private int getLoaderBufferState(long l, long l1)
	{
		if(l1 == -1L)
	//*   0    0:lload_3         
	//*   1    1:ldc2w           #100 <Long -1L>
	//*   2    4:lcmp            
	//*   3    5:ifne            10
			return 0;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		l = l1 - l;
	//    6   10:lload_3         
	//    7   11:lload_1         
	//    8   12:lsub            
	//    9   13:lstore_1        
		if(l > highWatermarkUs)
	//*  10   14:lload_1         
	//*  11   15:aload_0         
	//*  12   16:getfield        #87  <Field long highWatermarkUs>
	//*  13   19:lcmp            
	//*  14   20:ifle            25
			return 0;
	//   15   23:iconst_0        
	//   16   24:ireturn         
		return l >= lowWatermarkUs ? 1 : 2;
	//   17   25:lload_1         
	//   18   26:aload_0         
	//   19   27:getfield        #85  <Field long lowWatermarkUs>
	//   20   30:lcmp            
	//   21   31:ifge            36
	//   22   34:iconst_2        
	//   23   35:ireturn         
	//   24   36:iconst_1        
	//   25   37:ireturn         
	}

	private void notifyLoadingChanged(final boolean loading)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field Handler eventHandler>
	//    2    4:astore_2        
		if(handler != null && eventListener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #71  <Field DefaultLoadControl$EventListener eventListener>
	//*   7   13:ifnull          30
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onLoadingChanged(loading);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field DefaultLoadControl this$0>
				//    2    4:invokestatic    #30  <Method DefaultLoadControl$EventListener DefaultLoadControl.access$000(DefaultLoadControl)>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field boolean val$loading>
				//    5   11:invokeinterface #35  <Method void DefaultLoadControl$EventListener.onLoadingChanged(boolean)>
				//    6   16:return          
				}

				final DefaultLoadControl this$0;
				final boolean val$loading;

			
			{
				this$0 = DefaultLoadControl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field DefaultLoadControl this$0>
				loading = flag;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field boolean val$loading>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   16:aload_2         
	//    9   17:new             #8   <Class DefaultLoadControl$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:invokespecial   #106 <Method void DefaultLoadControl$1(DefaultLoadControl, boolean)>
	//   14   26:invokevirtual   #112 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void updateControlState()
	{
		int k = bufferState;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field int bufferState>
	//    2    4:istore_2        
		boolean flag3 = false;
	//    3    5:iconst_0        
	//    4    6:istore          6
		boolean flag2 = false;
	//    5    8:iconst_0        
	//    6    9:istore          5
		int i = ((int) (flag2));
	//    7   11:iload           5
	//    8   13:istore_1        
		boolean flag = ((boolean) (i));
	//    9   14:iload_1         
	//   10   15:istore_3        
		boolean flag1 = ((boolean) (i));
	//   11   16:iload_1         
	//   12   17:istore          4
		i = ((int) (flag2));
	//   13   19:iload           5
	//   14   21:istore_1        
		do
		{
			int l = loaders.size();
	//   15   22:aload_0         
	//   16   23:getfield        #76  <Field List loaders>
	//   17   26:invokeinterface #121 <Method int List.size()>
	//   18   31:istore          5
			boolean flag4 = true;
	//   19   33:iconst_1        
	//   20   34:istore          7
			if(i >= l)
				break;
	//   21   36:iload_1         
	//   22   37:iload           5
	//   23   39:icmpge          122
			LoaderState loaderstate = (LoaderState)loaderStates.get(loaders.get(i));
	//   24   42:aload_0         
	//   25   43:getfield        #81  <Field HashMap loaderStates>
	//   26   46:aload_0         
	//   27   47:getfield        #76  <Field List loaders>
	//   28   50:iload_1         
	//   29   51:invokeinterface #125 <Method Object List.get(int)>
	//   30   56:invokevirtual   #128 <Method Object HashMap.get(Object)>
	//   31   59:checkcast       #13  <Class DefaultLoadControl$LoaderState>
	//   32   62:astore          13
			l = ((int) (flag1 | loaderstate.loading));
	//   33   64:iload           4
	//   34   66:aload           13
	//   35   68:getfield        #131 <Field boolean DefaultLoadControl$LoaderState.loading>
	//   36   71:ior             
	//   37   72:istore          5
			if(loaderstate.nextLoadPositionUs != -1L)
	//*  38   74:aload           13
	//*  39   76:getfield        #134 <Field long DefaultLoadControl$LoaderState.nextLoadPositionUs>
	//*  40   79:ldc2w           #100 <Long -1L>
	//*  41   82:lcmp            
	//*  42   83:ifeq            93
				flag1 = flag4;
	//   43   86:iload           7
	//   44   88:istore          4
			else
	//*  45   90:goto            96
				flag1 = false;
	//   46   93:iconst_0        
	//   47   94:istore          4
			flag |= flag1;
	//   48   96:iload_3         
	//   49   97:iload           4
	//   50   99:ior             
	//   51  100:istore_3        
			k = Math.max(k, loaderstate.bufferState);
	//   52  101:iload_2         
	//   53  102:aload           13
	//   54  104:getfield        #135 <Field int DefaultLoadControl$LoaderState.bufferState>
	//   55  107:invokestatic    #141 <Method int Math.max(int, int)>
	//   56  110:istore_2        
			i++;
	//   57  111:iload_1         
	//   58  112:iconst_1        
	//   59  113:iadd            
	//   60  114:istore_1        
			flag1 = ((boolean) (l));
	//   61  115:iload           5
	//   62  117:istore          4
		} while(true);
	//   63  119:goto            22
		boolean flag5;
		if(!loaders.isEmpty() && (flag1 || flag) && (k == 2 || k == 1 && fillingBuffers))
	//*  64  122:aload_0         
	//*  65  123:getfield        #76  <Field List loaders>
	//*  66  126:invokeinterface #145 <Method boolean List.isEmpty()>
	//*  67  131:ifne            166
	//*  68  134:iload           4
	//*  69  136:ifne            143
	//*  70  139:iload_3         
	//*  71  140:ifeq            166
	//*  72  143:iload_2         
	//*  73  144:iconst_2        
	//*  74  145:icmpeq          160
	//*  75  148:iload_2         
	//*  76  149:iconst_1        
	//*  77  150:icmpne          166
	//*  78  153:aload_0         
	//*  79  154:getfield        #147 <Field boolean fillingBuffers>
	//*  80  157:ifeq            166
			flag5 = true;
	//   81  160:iconst_1        
	//   82  161:istore          8
		else
	//*  83  163:goto            169
			flag5 = false;
	//   84  166:iconst_0        
	//   85  167:istore          8
		fillingBuffers = flag5;
	//   86  169:aload_0         
	//   87  170:iload           8
	//   88  172:putfield        #147 <Field boolean fillingBuffers>
		if(fillingBuffers && !streamingPrioritySet)
	//*  89  175:aload_0         
	//*  90  176:getfield        #147 <Field boolean fillingBuffers>
	//*  91  179:ifeq            209
	//*  92  182:aload_0         
	//*  93  183:getfield        #149 <Field boolean streamingPrioritySet>
	//*  94  186:ifne            209
		{
			NetworkLock.instance.add(0);
	//   95  189:getstatic       #155 <Field NetworkLock NetworkLock.instance>
	//   96  192:iconst_0        
	//   97  193:invokevirtual   #159 <Method void NetworkLock.add(int)>
			streamingPrioritySet = true;
	//   98  196:aload_0         
	//   99  197:iconst_1        
	//  100  198:putfield        #149 <Field boolean streamingPrioritySet>
			notifyLoadingChanged(true);
	//  101  201:aload_0         
	//  102  202:iconst_1        
	//  103  203:invokespecial   #161 <Method void notifyLoadingChanged(boolean)>
		} else
	//* 104  206:goto            245
		if(!fillingBuffers && streamingPrioritySet && !flag1)
	//* 105  209:aload_0         
	//* 106  210:getfield        #147 <Field boolean fillingBuffers>
	//* 107  213:ifne            245
	//* 108  216:aload_0         
	//* 109  217:getfield        #149 <Field boolean streamingPrioritySet>
	//* 110  220:ifeq            245
	//* 111  223:iload           4
	//* 112  225:ifne            245
		{
			NetworkLock.instance.remove(0);
	//  113  228:getstatic       #155 <Field NetworkLock NetworkLock.instance>
	//  114  231:iconst_0        
	//  115  232:invokevirtual   #164 <Method void NetworkLock.remove(int)>
			streamingPrioritySet = false;
	//  116  235:aload_0         
	//  117  236:iconst_0        
	//  118  237:putfield        #149 <Field boolean streamingPrioritySet>
			notifyLoadingChanged(false);
	//  119  240:aload_0         
	//  120  241:iconst_0        
	//  121  242:invokespecial   #161 <Method void notifyLoadingChanged(boolean)>
		}
		maxLoadStartPositionUs = -1L;
	//  122  245:aload_0         
	//  123  246:ldc2w           #100 <Long -1L>
	//  124  249:putfield        #166 <Field long maxLoadStartPositionUs>
		if(fillingBuffers)
	//* 125  252:aload_0         
	//* 126  253:getfield        #147 <Field boolean fillingBuffers>
	//* 127  256:ifeq            349
		{
			for(int j = ((int) (flag3)); j < loaders.size(); j++)
	//* 128  259:iload           6
	//* 129  261:istore_1        
	//* 130  262:iload_1         
	//* 131  263:aload_0         
	//* 132  264:getfield        #76  <Field List loaders>
	//* 133  267:invokeinterface #121 <Method int List.size()>
	//* 134  272:icmpge          349
			{
				Object obj = loaders.get(j);
	//  135  275:aload_0         
	//  136  276:getfield        #76  <Field List loaders>
	//  137  279:iload_1         
	//  138  280:invokeinterface #125 <Method Object List.get(int)>
	//  139  285:astore          13
				long l1 = ((LoaderState)loaderStates.get(obj)).nextLoadPositionUs;
	//  140  287:aload_0         
	//  141  288:getfield        #81  <Field HashMap loaderStates>
	//  142  291:aload           13
	//  143  293:invokevirtual   #128 <Method Object HashMap.get(Object)>
	//  144  296:checkcast       #13  <Class DefaultLoadControl$LoaderState>
	//  145  299:getfield        #134 <Field long DefaultLoadControl$LoaderState.nextLoadPositionUs>
	//  146  302:lstore          9
				if(l1 == -1L)
					continue;
	//  147  304:lload           9
	//  148  306:ldc2w           #100 <Long -1L>
	//  149  309:lcmp            
	//  150  310:ifeq            342
				long l2 = maxLoadStartPositionUs;
	//  151  313:aload_0         
	//  152  314:getfield        #166 <Field long maxLoadStartPositionUs>
	//  153  317:lstore          11
				if(l2 == -1L || l1 < l2)
	//* 154  319:lload           11
	//* 155  321:ldc2w           #100 <Long -1L>
	//* 156  324:lcmp            
	//* 157  325:ifeq            336
	//* 158  328:lload           9
	//* 159  330:lload           11
	//* 160  332:lcmp            
	//* 161  333:ifge            342
					maxLoadStartPositionUs = l1;
	//  162  336:aload_0         
	//  163  337:lload           9
	//  164  339:putfield        #166 <Field long maxLoadStartPositionUs>
			}

	//  165  342:iload_1         
	//  166  343:iconst_1        
	//  167  344:iadd            
	//  168  345:istore_1        
		}
	//* 169  346:goto            262
	//  170  349:return          
	}

	public Allocator getAllocator()
	{
		return allocator;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Allocator allocator>
	//    2    4:areturn         
	}

	public void register(Object obj, int i)
	{
		loaders.add(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field List loaders>
	//    2    4:aload_1         
	//    3    5:invokeinterface #173 <Method boolean List.add(Object)>
	//    4   10:pop             
		loaderStates.put(obj, ((Object) (new LoaderState(i))));
	//    5   11:aload_0         
	//    6   12:getfield        #81  <Field HashMap loaderStates>
	//    7   15:aload_1         
	//    8   16:new             #13  <Class DefaultLoadControl$LoaderState>
	//    9   19:dup             
	//   10   20:iload_2         
	//   11   21:invokespecial   #175 <Method void DefaultLoadControl$LoaderState(int)>
	//   12   24:invokevirtual   #179 <Method Object HashMap.put(Object, Object)>
	//   13   27:pop             
		targetBufferSize = targetBufferSize + i;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #97  <Field int targetBufferSize>
	//   17   33:iload_2         
	//   18   34:iadd            
	//   19   35:putfield        #97  <Field int targetBufferSize>
	//   20   38:return          
	}

	public void trimAllocator()
	{
		allocator.trim(targetBufferSize);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field Allocator allocator>
	//    2    4:aload_0         
	//    3    5:getfield        #97  <Field int targetBufferSize>
	//    4    8:invokeinterface #185 <Method void Allocator.trim(int)>
	//    5   13:return          
	}

	public void unregister(Object obj)
	{
		loaders.remove(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field List loaders>
	//    2    4:aload_1         
	//    3    5:invokeinterface #189 <Method boolean List.remove(Object)>
	//    4   10:pop             
		obj = ((Object) ((LoaderState)loaderStates.remove(obj)));
	//    5   11:aload_0         
	//    6   12:getfield        #81  <Field HashMap loaderStates>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #191 <Method Object HashMap.remove(Object)>
	//    9   19:checkcast       #13  <Class DefaultLoadControl$LoaderState>
	//   10   22:astore_1        
		targetBufferSize = targetBufferSize - ((LoaderState) (obj)).bufferSizeContribution;
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #97  <Field int targetBufferSize>
	//   14   28:aload_1         
	//   15   29:getfield        #194 <Field int DefaultLoadControl$LoaderState.bufferSizeContribution>
	//   16   32:isub            
	//   17   33:putfield        #97  <Field int targetBufferSize>
		updateControlState();
	//   18   36:aload_0         
	//   19   37:invokespecial   #196 <Method void updateControlState()>
	//   20   40:return          
	}

	public boolean update(Object obj, long l, long l1, boolean flag)
	{
		int j = getLoaderBufferState(l, l1);
	//    0    0:aload_0         
	//    1    1:lload_2         
	//    2    2:lload           4
	//    3    4:invokespecial   #200 <Method int getLoaderBufferState(long, long)>
	//    4    7:istore          8
		obj = ((Object) ((LoaderState)loaderStates.get(obj)));
	//    5    9:aload_0         
	//    6   10:getfield        #81  <Field HashMap loaderStates>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #128 <Method Object HashMap.get(Object)>
	//    9   17:checkcast       #13  <Class DefaultLoadControl$LoaderState>
	//   10   20:astore_1        
		int i = ((LoaderState) (obj)).bufferState;
	//   11   21:aload_1         
	//   12   22:getfield        #135 <Field int DefaultLoadControl$LoaderState.bufferState>
	//   13   25:istore          7
		boolean flag3 = false;
	//   14   27:iconst_0        
	//   15   28:istore          10
		boolean flag1;
		if(i == j && ((LoaderState) (obj)).nextLoadPositionUs == l1 && ((LoaderState) (obj)).loading == flag)
	//*  16   30:iload           7
	//*  17   32:iload           8
	//*  18   34:icmpne          65
	//*  19   37:aload_1         
	//*  20   38:getfield        #134 <Field long DefaultLoadControl$LoaderState.nextLoadPositionUs>
	//*  21   41:lload           4
	//*  22   43:lcmp            
	//*  23   44:ifne            65
	//*  24   47:aload_1         
	//*  25   48:getfield        #131 <Field boolean DefaultLoadControl$LoaderState.loading>
	//*  26   51:iload           6
	//*  27   53:icmpeq          59
	//*  28   56:goto            65
			flag1 = false;
	//   29   59:iconst_0        
	//   30   60:istore          7
		else
	//*  31   62:goto            68
			flag1 = true;
	//   32   65:iconst_1        
	//   33   66:istore          7
		if(flag1)
	//*  34   68:iload           7
	//*  35   70:ifeq            91
		{
			obj.bufferState = j;
	//   36   73:aload_1         
	//   37   74:iload           8
	//   38   76:putfield        #135 <Field int DefaultLoadControl$LoaderState.bufferState>
			obj.nextLoadPositionUs = l1;
	//   39   79:aload_1         
	//   40   80:lload           4
	//   41   82:putfield        #134 <Field long DefaultLoadControl$LoaderState.nextLoadPositionUs>
			obj.loading = flag;
	//   42   85:aload_1         
	//   43   86:iload           6
	//   44   88:putfield        #131 <Field boolean DefaultLoadControl$LoaderState.loading>
		}
		int k = getBufferState(allocator.getTotalBytesAllocated());
	//   45   91:aload_0         
	//   46   92:aload_0         
	//   47   93:getfield        #67  <Field Allocator allocator>
	//   48   96:invokeinterface #203 <Method int Allocator.getTotalBytesAllocated()>
	//   49  101:invokespecial   #205 <Method int getBufferState(int)>
	//   50  104:istore          9
		boolean flag2;
		if(bufferState != k)
	//*  51  106:aload_0         
	//*  52  107:getfield        #115 <Field int bufferState>
	//*  53  110:iload           9
	//*  54  112:icmpeq          121
			flag2 = true;
	//   55  115:iconst_1        
	//   56  116:istore          8
		else
	//*  57  118:goto            124
			flag2 = false;
	//   58  121:iconst_0        
	//   59  122:istore          8
		if(flag2)
	//*  60  124:iload           8
	//*  61  126:ifeq            135
			bufferState = k;
	//   62  129:aload_0         
	//   63  130:iload           9
	//   64  132:putfield        #115 <Field int bufferState>
		if(flag1 || flag2)
	//*  65  135:iload           7
	//*  66  137:ifne            145
	//*  67  140:iload           8
	//*  68  142:ifeq            149
			updateControlState();
	//   69  145:aload_0         
	//   70  146:invokespecial   #196 <Method void updateControlState()>
		flag = flag3;
	//   71  149:iload           10
	//   72  151:istore          6
		if(l1 != -1L)
	//*  73  153:lload           4
	//*  74  155:ldc2w           #100 <Long -1L>
	//*  75  158:lcmp            
	//*  76  159:ifeq            179
		{
			flag = flag3;
	//   77  162:iload           10
	//   78  164:istore          6
			if(l1 <= maxLoadStartPositionUs)
	//*  79  166:lload           4
	//*  80  168:aload_0         
	//*  81  169:getfield        #166 <Field long maxLoadStartPositionUs>
	//*  82  172:lcmp            
	//*  83  173:ifgt            179
				flag = true;
	//   84  176:iconst_1        
	//   85  177:istore          6
		}
		return flag;
	//   86  179:iload           6
	//   87  181:ireturn         
	}

	private static final int ABOVE_HIGH_WATERMARK = 0;
	private static final int BELOW_LOW_WATERMARK = 2;
	private static final int BETWEEN_WATERMARKS = 1;
	public static final float DEFAULT_HIGH_BUFFER_LOAD = 0.8F;
	public static final int DEFAULT_HIGH_WATERMARK_MS = 30000;
	public static final float DEFAULT_LOW_BUFFER_LOAD = 0.2F;
	public static final int DEFAULT_LOW_WATERMARK_MS = 15000;
	private final Allocator allocator;
	private int bufferState;
	private final Handler eventHandler;
	private final EventListener eventListener;
	private boolean fillingBuffers;
	private final float highBufferLoad;
	private final long highWatermarkUs;
	private final HashMap loaderStates;
	private final List loaders;
	private final float lowBufferLoad;
	private final long lowWatermarkUs;
	private long maxLoadStartPositionUs;
	private boolean streamingPrioritySet;
	private int targetBufferSize;


/*
	static EventListener access$000(DefaultLoadControl defaultloadcontrol)
	{
		return defaultloadcontrol.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field DefaultLoadControl$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
