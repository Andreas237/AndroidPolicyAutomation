// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat, FontRequest

class FontsContractCompat$4$8
	implements Runnable
{

	public void run()
	{
		val$callback.onTypefaceRequestFailed(-3);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
	//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
	//    3    7:bipush          -3
	//    4    9:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
	//    5   12:return          
	}

	final FontsContractCompat._cls4 this$0;

	FontsContractCompat$4$8()
	{
		this$0 = FontsContractCompat._cls4.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class android/support/v4/provider/FontsContractCompat$4

/* anonymous class */
	static final class FontsContractCompat._cls4
		implements Runnable
	{

		public void run()
		{
			final Typeface typeface;
			try
			{
				typeface = ((Typeface) (FontsContractCompat.fetchFonts(context, ((android.os.CancellationSignal) (null)), request)));
		//    0    0:aload_0         
		//    1    1:getfield        #41  <Field Context val$context>
		//    2    4:aconst_null     
		//    3    5:aload_0         
		//    4    6:getfield        #43  <Field FontRequest val$request>
		//    5    9:invokestatic    #58  <Method FontsContractCompat$FontFamilyResult FontsContractCompat.fetchFonts(Context, android.os.CancellationSignal, FontRequest)>
		//    6   12:astore_3        
			}
		//*   7   13:aload_3         
		//*   8   14:invokevirtual   #64  <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
		//*   9   17:ifeq            117
		//*  10   20:aload_3         
		//*  11   21:invokevirtual   #64  <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
		//*  12   24:tableswitch     1 2: default 48
		//		               1 83
		//		               2 100
		//*  13   48:aload_0         
		//*  14   49:getfield        #45  <Field Handler val$callerThreadHandler>
		//*  15   52:new             #19  <Class FontsContractCompat$4$4>
		//*  16   55:dup             
		//*  17   56:aload_0         
		//*  18   57:invokespecial   #67  <Method void FontsContractCompat$4$4(FontsContractCompat$4)>
		//*  19   60:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//*  20   63:pop             
		//*  21   64:return          
			// Misplaced declaration of an exception variable
			catch(final Typeface typeface)
		//*  22   65:astore_3        
			{
				callerThreadHandler.post(new FontsContractCompat._cls4._cls1());
		//   23   66:aload_0         
		//   24   67:getfield        #45  <Field Handler val$callerThreadHandler>
		//   25   70:new             #13  <Class FontsContractCompat$4$1>
		//   26   73:dup             
		//   27   74:aload_0         
		//   28   75:invokespecial   #74  <Method void FontsContractCompat$4$1(FontsContractCompat$4)>
		//   29   78:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//   30   81:pop             
				return;
		//   31   82:return          
			}
			if(((FontsContractCompat.FontFamilyResult) (typeface)).getStatusCode() != 0)
			{
				switch(((FontsContractCompat.FontFamilyResult) (typeface)).getStatusCode())
				{
				default:
					callerThreadHandler.post(new FontsContractCompat._cls4._cls4());
					return;

				case 1: // '\001'
					callerThreadHandler.post(new FontsContractCompat._cls4._cls2());
		//   32   83:aload_0         
		//   33   84:getfield        #45  <Field Handler val$callerThreadHandler>
		//   34   87:new             #15  <Class FontsContractCompat$4$2>
		//   35   90:dup             
		//   36   91:aload_0         
		//   37   92:invokespecial   #75  <Method void FontsContractCompat$4$2(FontsContractCompat$4)>
		//   38   95:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//   39   98:pop             
					return;
		//   40   99:return          

				case 2: // '\002'
					callerThreadHandler.post(new FontsContractCompat._cls4._cls3());
		//   41  100:aload_0         
		//   42  101:getfield        #45  <Field Handler val$callerThreadHandler>
		//   43  104:new             #17  <Class FontsContractCompat$4$3>
		//   44  107:dup             
		//   45  108:aload_0         
		//   46  109:invokespecial   #76  <Method void FontsContractCompat$4$3(FontsContractCompat$4)>
		//   47  112:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//   48  115:pop             
					break;
				}
				return;
		//   49  116:return          
			}
			FontsContractCompat.FontInfo afontinfo[] = ((FontsContractCompat.FontFamilyResult) (typeface)).getFonts();
		//   50  117:aload_3         
		//   51  118:invokevirtual   #80  <Method FontsContractCompat$FontInfo[] FontsContractCompat$FontFamilyResult.getFonts()>
		//   52  121:astore_3        
			if(afontinfo == null || afontinfo.length == 0)
		//*  53  122:aload_3         
		//*  54  123:ifnull          131
		//*  55  126:aload_3         
		//*  56  127:arraylength     
		//*  57  128:ifne            148
			{
				callerThreadHandler.post(new FontsContractCompat._cls4._cls5());
		//   58  131:aload_0         
		//   59  132:getfield        #45  <Field Handler val$callerThreadHandler>
		//   60  135:new             #21  <Class FontsContractCompat$4$5>
		//   61  138:dup             
		//   62  139:aload_0         
		//   63  140:invokespecial   #81  <Method void FontsContractCompat$4$5(FontsContractCompat$4)>
		//   64  143:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//   65  146:pop             
				return;
		//   66  147:return          
			}
			int i = afontinfo.length;
		//   67  148:aload_3         
		//   68  149:arraylength     
		//   69  150:istore_2        
			for(final int resultCode = 0; resultCode < i; resultCode++)
		//*  70  151:iconst_0        
		//*  71  152:istore_1        
		//*  72  153:iload_1         
		//*  73  154:iload_2         
		//*  74  155:icmpge          223
			{
				FontsContractCompat.FontInfo fontinfo = afontinfo[resultCode];
		//   75  158:aload_3         
		//   76  159:iload_1         
		//   77  160:aaload          
		//   78  161:astore          4
				if(fontinfo.getResultCode() != 0)
		//*  79  163:aload           4
		//*  80  165:invokevirtual   #86  <Method int FontsContractCompat$FontInfo.getResultCode()>
		//*  81  168:ifeq            216
				{
					resultCode = fontinfo.getResultCode();
		//   82  171:aload           4
		//   83  173:invokevirtual   #86  <Method int FontsContractCompat$FontInfo.getResultCode()>
		//   84  176:istore_1        
					if(resultCode < 0)
		//*  85  177:iload_1         
		//*  86  178:ifge            198
					{
						callerThreadHandler.post(new FontsContractCompat._cls4._cls6());
		//   87  181:aload_0         
		//   88  182:getfield        #45  <Field Handler val$callerThreadHandler>
		//   89  185:new             #23  <Class FontsContractCompat$4$6>
		//   90  188:dup             
		//   91  189:aload_0         
		//   92  190:invokespecial   #87  <Method void FontsContractCompat$4$6(FontsContractCompat$4)>
		//   93  193:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//   94  196:pop             
						return;
		//   95  197:return          
					} else
					{
						callerThreadHandler.post(new FontsContractCompat._cls4._cls7());
		//   96  198:aload_0         
		//   97  199:getfield        #45  <Field Handler val$callerThreadHandler>
		//   98  202:new             #25  <Class FontsContractCompat$4$7>
		//   99  205:dup             
		//  100  206:aload_0         
		//  101  207:iload_1         
		//  102  208:invokespecial   #90  <Method void FontsContractCompat$4$7(FontsContractCompat$4, int)>
		//  103  211:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//  104  214:pop             
						return;
		//  105  215:return          
					}
				}
			}

		//  106  216:iload_1         
		//  107  217:iconst_1        
		//  108  218:iadd            
		//  109  219:istore_1        
		//* 110  220:goto            153
			afontinfo = ((FontsContractCompat.FontInfo []) (FontsContractCompat.buildTypeface(context, ((android.os.CancellationSignal) (null)), afontinfo)));
		//  111  223:aload_0         
		//  112  224:getfield        #41  <Field Context val$context>
		//  113  227:aconst_null     
		//  114  228:aload_3         
		//  115  229:invokestatic    #94  <Method Typeface FontsContractCompat.buildTypeface(Context, android.os.CancellationSignal, FontsContractCompat$FontInfo[])>
		//  116  232:astore_3        
			if(afontinfo == null)
		//* 117  233:aload_3         
		//* 118  234:ifnonnull       254
			{
				callerThreadHandler.post(((Runnable) (new FontsContractCompat._cls4._cls8())));
		//  119  237:aload_0         
		//  120  238:getfield        #45  <Field Handler val$callerThreadHandler>
		//  121  241:new             #27  <Class FontsContractCompat$4$8>
		//  122  244:dup             
		//  123  245:aload_0         
		//  124  246:invokespecial   #95  <Method void FontsContractCompat$4$8(FontsContractCompat$4)>
		//  125  249:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//  126  252:pop             
				return;
		//  127  253:return          
			} else
			{
				callerThreadHandler.post(new FontsContractCompat._cls4._cls9());
		//  128  254:aload_0         
		//  129  255:getfield        #45  <Field Handler val$callerThreadHandler>
		//  130  258:new             #29  <Class FontsContractCompat$4$9>
		//  131  261:dup             
		//  132  262:aload_0         
		//  133  263:aload_3         
		//  134  264:invokespecial   #98  <Method void FontsContractCompat$4$9(FontsContractCompat$4, Typeface)>
		//  135  267:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//  136  270:pop             
				return;
		//  137  271:return          
			}
		}

		final FontsContractCompat.FontRequestCallback val$callback;
		final Handler val$callerThreadHandler;
		final Context val$context;
		final FontRequest val$request;

			
			{
				context = context1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #41  <Field Context val$context>
				request = fontrequest;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #43  <Field FontRequest val$request>
				callerThreadHandler = handler;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #45  <Field Handler val$callerThreadHandler>
				callback = fontrequestcallback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #47  <Field FontsContractCompat$FontRequestCallback val$callback>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #50  <Method void Object()>
			//   14   25:return          
			}

		// Unreferenced inner class android/support/v4/provider/FontsContractCompat$4$1

/* anonymous class */
		class FontsContractCompat._cls4._cls1
			implements Runnable
		{

			public void run()
			{
				callback.onTypefaceRequestFailed(-1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
			//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
			//    3    7:iconst_m1       
			//    4    8:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
			//    5   11:return          
			}

			final FontsContractCompat._cls4 this$0;

					
					{
						this$0 = FontsContractCompat._cls4.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}


		// Unreferenced inner class android/support/v4/provider/FontsContractCompat$4$2

/* anonymous class */
		class FontsContractCompat._cls4._cls2
			implements Runnable
		{

			public void run()
			{
				callback.onTypefaceRequestFailed(-2);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
			//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
			//    3    7:bipush          -2
			//    4    9:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
			//    5   12:return          
			}

			final FontsContractCompat._cls4 this$0;

					
					{
						this$0 = FontsContractCompat._cls4.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}


		// Unreferenced inner class android/support/v4/provider/FontsContractCompat$4$3

/* anonymous class */
		class FontsContractCompat._cls4._cls3
			implements Runnable
		{

			public void run()
			{
				callback.onTypefaceRequestFailed(-3);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
			//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
			//    3    7:bipush          -3
			//    4    9:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
			//    5   12:return          
			}

			final FontsContractCompat._cls4 this$0;

					
					{
						this$0 = FontsContractCompat._cls4.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}


		// Unreferenced inner class android/support/v4/provider/FontsContractCompat$4$4

/* anonymous class */
		class FontsContractCompat._cls4._cls4
			implements Runnable
		{

			public void run()
			{
				callback.onTypefaceRequestFailed(-3);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
			//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
			//    3    7:bipush          -3
			//    4    9:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
			//    5   12:return          
			}

			final FontsContractCompat._cls4 this$0;

					
					{
						this$0 = FontsContractCompat._cls4.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}


		// Unreferenced inner class android/support/v4/provider/FontsContractCompat$4$5

/* anonymous class */
		class FontsContractCompat._cls4._cls5
			implements Runnable
		{

			public void run()
			{
				callback.onTypefaceRequestFailed(1);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
			//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
			//    3    7:iconst_1        
			//    4    8:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
			//    5   11:return          
			}

			final FontsContractCompat._cls4 this$0;

					
					{
						this$0 = FontsContractCompat._cls4.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}


		// Unreferenced inner class android/support/v4/provider/FontsContractCompat$4$6

/* anonymous class */
		class FontsContractCompat._cls4._cls6
			implements Runnable
		{

			public void run()
			{
				callback.onTypefaceRequestFailed(-3);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
			//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
			//    3    7:bipush          -3
			//    4    9:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
			//    5   12:return          
			}

			final FontsContractCompat._cls4 this$0;

					
					{
						this$0 = FontsContractCompat._cls4.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #17  <Field FontsContractCompat$4 this$0>
						super();
					//    3    5:aload_0         
					//    4    6:invokespecial   #19  <Method void Object()>
					//    5    9:return          
					}
		}


		// Unreferenced inner class android/support/v4/provider/FontsContractCompat$4$7

/* anonymous class */
		class FontsContractCompat._cls4._cls7
			implements Runnable
		{

			public void run()
			{
				callback.onTypefaceRequestFailed(resultCode);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field FontsContractCompat$4 this$0>
			//    2    4:getfield        #28  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field int val$resultCode>
			//    5   11:invokevirtual   #34  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
			//    6   14:return          
			}

			final FontsContractCompat._cls4 this$0;
			final int val$resultCode;

					
					{
						this$0 = FontsContractCompat._cls4.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #19  <Field FontsContractCompat$4 this$0>
						resultCode = i;
					//    3    5:aload_0         
					//    4    6:iload_2         
					//    5    7:putfield        #21  <Field int val$resultCode>
						super();
					//    6   10:aload_0         
					//    7   11:invokespecial   #23  <Method void Object()>
					//    8   14:return          
					}
		}


		// Unreferenced inner class android/support/v4/provider/FontsContractCompat$4$9

/* anonymous class */
		class FontsContractCompat._cls4._cls9
			implements Runnable
		{

			public void run()
			{
				callback.onTypefaceRetrieved(typeface);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field FontsContractCompat$4 this$0>
			//    2    4:getfield        #28  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field Typeface val$typeface>
			//    5   11:invokevirtual   #34  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRetrieved(Typeface)>
			//    6   14:return          
			}

			final FontsContractCompat._cls4 this$0;
			final Typeface val$typeface;

					
					{
						this$0 = FontsContractCompat._cls4.this;
					//    0    0:aload_0         
					//    1    1:aload_1         
					//    2    2:putfield        #19  <Field FontsContractCompat$4 this$0>
						typeface = typeface1;
					//    3    5:aload_0         
					//    4    6:aload_2         
					//    5    7:putfield        #21  <Field Typeface val$typeface>
						super();
					//    6   10:aload_0         
					//    7   11:invokespecial   #23  <Method void Object()>
					//    8   14:return          
					}
		}

	}

}
