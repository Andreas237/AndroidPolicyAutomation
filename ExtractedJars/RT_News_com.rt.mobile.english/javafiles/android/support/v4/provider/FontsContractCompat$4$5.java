// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat, FontRequest

class FontsContractCompat$4$5
	implements Runnable
{

	public void run()
	{
		val$callback.onTypefaceRequestFailed(1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FontsContractCompat$4 this$0>
	//    2    4:getfield        #24  <Field FontsContractCompat$FontRequestCallback FontsContractCompat$4.val$callback>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #30  <Method void FontsContractCompat$FontRequestCallback.onTypefaceRequestFailed(int)>
	//    5   11:return          
	}

	final FontsContractCompat._cls4 this$0;

	FontsContractCompat$4$5()
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
			android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
			FontsContractCompat.FontFamilyResult fontfamilyresult;
			FontsContractCompat.FontInfo afontinfo[];
			try
			{
				fontfamilyresult = FontsContractCompat.fetchFonts(context, ((android.os.CancellationSignal) (null)), request);
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
		//*   9   17:ifeq            99
		//*  10   20:aload_3         
		//*  11   21:invokevirtual   #64  <Method int FontsContractCompat$FontFamilyResult.getStatusCode()>
		//*  12   24:tableswitch     1 2: default 48
		//		               1 82
		//		               2 65
		//*  13   48:aload_0         
		//*  14   49:getfield        #45  <Field Handler val$callerThreadHandler>
		//*  15   52:new             #19  <Class FontsContractCompat$4$4>
		//*  16   55:dup             
		//*  17   56:aload_0         
		//*  18   57:invokespecial   #67  <Method void FontsContractCompat$4$4(FontsContractCompat$4)>
		//*  19   60:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//*  20   63:pop             
		//*  21   64:return          
		//*  22   65:aload_0         
		//*  23   66:getfield        #45  <Field Handler val$callerThreadHandler>
		//*  24   69:new             #17  <Class FontsContractCompat$4$3>
		//*  25   72:dup             
		//*  26   73:aload_0         
		//*  27   74:invokespecial   #74  <Method void FontsContractCompat$4$3(FontsContractCompat$4)>
		//*  28   77:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//*  29   80:pop             
		//*  30   81:return          
		//*  31   82:aload_0         
		//*  32   83:getfield        #45  <Field Handler val$callerThreadHandler>
		//*  33   86:new             #15  <Class FontsContractCompat$4$2>
		//*  34   89:dup             
		//*  35   90:aload_0         
		//*  36   91:invokespecial   #75  <Method void FontsContractCompat$4$2(FontsContractCompat$4)>
		//*  37   94:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//*  38   97:pop             
		//*  39   98:return          
		//*  40   99:aload_3         
		//*  41  100:invokevirtual   #79  <Method FontsContractCompat$FontInfo[] FontsContractCompat$FontFamilyResult.getFonts()>
		//*  42  103:astore_3        
		//*  43  104:aload_3         
		//*  44  105:ifnull          240
		//*  45  108:aload_3         
		//*  46  109:arraylength     
		//*  47  110:ifne            116
		//*  48  113:goto            240
		//*  49  116:aload_3         
		//*  50  117:arraylength     
		//*  51  118:istore_2        
		//*  52  119:iconst_0        
		//*  53  120:istore_1        
		//*  54  121:iload_1         
		//*  55  122:iload_2         
		//*  56  123:icmpge          191
		//*  57  126:aload_3         
		//*  58  127:iload_1         
		//*  59  128:aaload          
		//*  60  129:astore          4
		//*  61  131:aload           4
		//*  62  133:invokevirtual   #84  <Method int FontsContractCompat$FontInfo.getResultCode()>
		//*  63  136:ifeq            184
		//*  64  139:aload           4
		//*  65  141:invokevirtual   #84  <Method int FontsContractCompat$FontInfo.getResultCode()>
		//*  66  144:istore_1        
		//*  67  145:iload_1         
		//*  68  146:ifge            166
		//*  69  149:aload_0         
		//*  70  150:getfield        #45  <Field Handler val$callerThreadHandler>
		//*  71  153:new             #23  <Class FontsContractCompat$4$6>
		//*  72  156:dup             
		//*  73  157:aload_0         
		//*  74  158:invokespecial   #85  <Method void FontsContractCompat$4$6(FontsContractCompat$4)>
		//*  75  161:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//*  76  164:pop             
		//*  77  165:return          
		//*  78  166:aload_0         
		//*  79  167:getfield        #45  <Field Handler val$callerThreadHandler>
		//*  80  170:new             #25  <Class FontsContractCompat$4$7>
		//*  81  173:dup             
		//*  82  174:aload_0         
		//*  83  175:iload_1         
		//*  84  176:invokespecial   #88  <Method void FontsContractCompat$4$7(FontsContractCompat$4, int)>
		//*  85  179:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//*  86  182:pop             
		//*  87  183:return          
		//*  88  184:iload_1         
		//*  89  185:iconst_1        
		//*  90  186:iadd            
		//*  91  187:istore_1        
		//*  92  188:goto            121
		//*  93  191:aload_0         
		//*  94  192:getfield        #41  <Field Context val$context>
		//*  95  195:aconst_null     
		//*  96  196:aload_3         
		//*  97  197:invokestatic    #92  <Method Typeface FontsContractCompat.buildTypeface(Context, android.os.CancellationSignal, FontsContractCompat$FontInfo[])>
		//*  98  200:astore_3        
		//*  99  201:aload_3         
		//* 100  202:ifnonnull       222
		//* 101  205:aload_0         
		//* 102  206:getfield        #45  <Field Handler val$callerThreadHandler>
		//* 103  209:new             #27  <Class FontsContractCompat$4$8>
		//* 104  212:dup             
		//* 105  213:aload_0         
		//* 106  214:invokespecial   #93  <Method void FontsContractCompat$4$8(FontsContractCompat$4)>
		//* 107  217:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//* 108  220:pop             
		//* 109  221:return          
		//* 110  222:aload_0         
		//* 111  223:getfield        #45  <Field Handler val$callerThreadHandler>
		//* 112  226:new             #29  <Class FontsContractCompat$4$9>
		//* 113  229:dup             
		//* 114  230:aload_0         
		//* 115  231:aload_3         
		//* 116  232:invokespecial   #96  <Method void FontsContractCompat$4$9(FontsContractCompat$4, Typeface)>
		//* 117  235:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//* 118  238:pop             
		//* 119  239:return          
		//* 120  240:aload_0         
		//* 121  241:getfield        #45  <Field Handler val$callerThreadHandler>
		//* 122  244:new             #21  <Class FontsContractCompat$4$5>
		//* 123  247:dup             
		//* 124  248:aload_0         
		//* 125  249:invokespecial   #97  <Method void FontsContractCompat$4$5(FontsContractCompat$4)>
		//* 126  252:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//* 127  255:pop             
		//* 128  256:return          
		//* 129  257:aload_0         
		//* 130  258:getfield        #45  <Field Handler val$callerThreadHandler>
		//* 131  261:new             #13  <Class FontsContractCompat$4$1>
		//* 132  264:dup             
		//* 133  265:aload_0         
		//* 134  266:invokespecial   #98  <Method void FontsContractCompat$4$1(FontsContractCompat$4)>
		//* 135  269:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
		//* 136  272:pop             
		//* 137  273:return          
			// Misplaced declaration of an exception variable
			catch(android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
			{
				callerThreadHandler.post(new FontsContractCompat._cls4._cls1());
				return;
			}
			if(fontfamilyresult.getStatusCode() != 0)
				switch(fontfamilyresult.getStatusCode())
				{
				default:
					callerThreadHandler.post(new FontsContractCompat._cls4._cls4());
					return;

				case 2: // '\002'
					callerThreadHandler.post(new FontsContractCompat._cls4._cls3());
					return;

				case 1: // '\001'
					callerThreadHandler.post(new FontsContractCompat._cls4._cls2());
					return;
				}
			afontinfo = fontfamilyresult.getFonts();
			if(afontinfo != null && afontinfo.length != 0)
			{
				int i = afontinfo.length;
				for(final int resultCode = 0; resultCode < i; resultCode++)
				{
					FontsContractCompat.FontInfo fontinfo = afontinfo[resultCode];
					if(fontinfo.getResultCode() != 0)
					{
						resultCode = fontinfo.getResultCode();
						if(resultCode < 0)
						{
							callerThreadHandler.post(new FontsContractCompat._cls4._cls6());
							return;
						} else
						{
							callerThreadHandler.post(new FontsContractCompat._cls4._cls7());
							return;
						}
					}
				}

				final Typeface typeface = FontsContractCompat.buildTypeface(context, ((android.os.CancellationSignal) (null)), afontinfo);
				if(typeface == null)
				{
					callerThreadHandler.post(new FontsContractCompat._cls4._cls8());
					return;
				} else
				{
					callerThreadHandler.post(new FontsContractCompat._cls4._cls9());
					return;
				}
			} else
			{
				callerThreadHandler.post(((Runnable) (new FontsContractCompat._cls4._cls5())));
				return;
			}
		//* 138  274:astore_3        
		//* 139  275:goto            257
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


		// Unreferenced inner class android/support/v4/provider/FontsContractCompat$4$8

/* anonymous class */
		class FontsContractCompat._cls4._cls8
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
