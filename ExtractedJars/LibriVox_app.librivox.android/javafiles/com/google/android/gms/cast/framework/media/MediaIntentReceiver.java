// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.media;

import android.content.*;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.*;

// Referenced classes of package com.google.android.gms.cast.framework.media:
//			i

public class MediaIntentReceiver extends BroadcastReceiver
{

	public MediaIntentReceiver()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BroadcastReceiver()>
	//    2    4:return          
	}

	private static void a(e e1)
	{
		e1 = ((e) (b(e1)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #15  <Method i b(e)>
	//    2    4:astore_0        
		if(e1 == null)
	//*   3    5:aload_0         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			((i) (e1)).r();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #20  <Method void com.google.android.gms.cast.framework.media.i.r()>
			return;
	//    8   14:return          
		}
	}

	private static void a(e e1, long l)
	{
		if(l == 0L)
	//*   0    0:lload_1         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            7
			return;
	//    4    6:return          
		e1 = ((e) (b(e1)));
	//    5    7:aload_0         
	//    6    8:invokestatic    #15  <Method i b(e)>
	//    7   11:astore_0        
		if(e1 != null && !((i) (e1)).l())
	//*   8   12:aload_0         
	//*   9   13:ifnull          43
	//*  10   16:aload_0         
	//*  11   17:invokevirtual   #25  <Method boolean i.l()>
	//*  12   20:ifne            43
		{
			if(((i) (e1)).t())
	//*  13   23:aload_0         
	//*  14   24:invokevirtual   #28  <Method boolean com.google.android.gms.cast.framework.media.i.t()>
	//*  15   27:ifeq            31
			{
				return;
	//   16   30:return          
			} else
			{
				((i) (e1)).a(((i) (e1)).f() + l);
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #32  <Method long i.f()>
	//   20   36:lload_1         
	//   21   37:ladd            
	//   22   38:invokevirtual   #35  <Method com.google.android.gms.common.api.ab i.a(long)>
	//   23   41:pop             
				return;
	//   24   42:return          
			}
		} else
		{
			return;
	//   25   43:return          
		}
	}

	private static i b(e e1)
	{
		if(e1 != null && ((r) (e1)).e())
	//*   0    0:aload_0         
	//*   1    1:ifnull          19
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #40  <Method boolean r.e()>
	//*   4    8:ifne            14
	//*   5   11:goto            19
			return e1.a();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #45  <Method i e.a()>
	//    8   18:areturn         
		else
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
	}

	protected void a(Context context, String s, Intent intent)
	{
	//    0    0:return          
	}

	protected void a(r r1)
	{
		if(r1 instanceof e)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #42  <Class e>
	//*   2    4:ifeq            14
			a((e)r1);
	//    3    7:aload_1         
	//    4    8:checkcast       #42  <Class e>
	//    5   11:invokestatic    #49  <Method void a(e)>
	//    6   14:return          
	}

	protected void a(r r1, long l)
	{
		if(r1 instanceof e)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #42  <Class e>
	//*   2    4:ifeq            15
			a((e)r1, l);
	//    3    7:aload_1         
	//    4    8:checkcast       #42  <Class e>
	//    5   11:lload_2         
	//    6   12:invokestatic    #52  <Method void a(e, long)>
	//    7   15:return          
	}

	protected void a(r r1, Intent intent)
	{
		if(r1 instanceof e)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #42  <Class e>
	//*   2    4:ifeq            60
		{
			if(!intent.hasExtra("android.intent.extra.KEY_EVENT"))
	//*   3    7:aload_2         
	//*   4    8:ldc1            #55  <String "android.intent.extra.KEY_EVENT">
	//*   5   10:invokevirtual   #61  <Method boolean Intent.hasExtra(String)>
	//*   6   13:ifne            17
				return;
	//    7   16:return          
			intent = ((Intent) ((KeyEvent)intent.getExtras().get("android.intent.extra.KEY_EVENT")));
	//    8   17:aload_2         
	//    9   18:invokevirtual   #65  <Method Bundle Intent.getExtras()>
	//   10   21:ldc1            #55  <String "android.intent.extra.KEY_EVENT">
	//   11   23:invokevirtual   #71  <Method Object Bundle.get(String)>
	//   12   26:checkcast       #73  <Class KeyEvent>
	//   13   29:astore_2        
			if(intent != null)
	//*  14   30:aload_2         
	//*  15   31:ifnull          59
			{
				if(((KeyEvent) (intent)).getAction() != 0)
	//*  16   34:aload_2         
	//*  17   35:invokevirtual   #77  <Method int KeyEvent.getAction()>
	//*  18   38:ifeq            42
					return;
	//   19   41:return          
				if(((KeyEvent) (intent)).getKeyCode() == 85)
	//*  20   42:aload_2         
	//*  21   43:invokevirtual   #80  <Method int KeyEvent.getKeyCode()>
	//*  22   46:bipush          85
	//*  23   48:icmpne          60
				{
					a((e)r1);
	//   24   51:aload_1         
	//   25   52:checkcast       #42  <Class e>
	//   26   55:invokestatic    #49  <Method void a(e)>
					return;
	//   27   58:return          
				}
			} else
			{
				return;
	//   28   59:return          
			}
		}
	//   29   60:return          
	}

	protected void b(r r1)
	{
		if(r1 instanceof e)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #42  <Class e>
	//*   2    4:ifeq            35
		{
			r1 = ((r) (b((e)r1)));
	//    3    7:aload_1         
	//    4    8:checkcast       #42  <Class e>
	//    5   11:invokestatic    #15  <Method i b(e)>
	//    6   14:astore_1        
			if(r1 != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          34
			{
				if(((i) (r1)).t())
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #28  <Method boolean com.google.android.gms.cast.framework.media.i.t()>
	//*  11   23:ifeq            27
				{
					return;
	//   12   26:return          
				} else
				{
					((i) (r1)).e(((org.json.JSONObject) (null)));
	//   13   27:aload_1         
	//   14   28:aconst_null     
	//   15   29:invokevirtual   #83  <Method com.google.android.gms.common.api.ab com.google.android.gms.cast.framework.media.i.e(org.json.JSONObject)>
	//   16   32:pop             
					return;
	//   17   33:return          
				}
			} else
			{
				return;
	//   18   34:return          
			}
		} else
		{
			return;
	//   19   35:return          
		}
	}

	protected void b(r r1, long l)
	{
		if(r1 instanceof e)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #42  <Class e>
	//*   2    4:ifeq            16
			a((e)r1, -l);
	//    3    7:aload_1         
	//    4    8:checkcast       #42  <Class e>
	//    5   11:lload_2         
	//    6   12:lneg            
	//    7   13:invokestatic    #52  <Method void a(e, long)>
	//    8   16:return          
	}

	protected void c(r r1)
	{
		if(r1 instanceof e)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #42  <Class e>
	//*   2    4:ifeq            35
		{
			r1 = ((r) (b((e)r1)));
	//    3    7:aload_1         
	//    4    8:checkcast       #42  <Class e>
	//    5   11:invokestatic    #15  <Method i b(e)>
	//    6   14:astore_1        
			if(r1 != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          34
			{
				if(((i) (r1)).t())
	//*   9   19:aload_1         
	//*  10   20:invokevirtual   #28  <Method boolean com.google.android.gms.cast.framework.media.i.t()>
	//*  11   23:ifeq            27
				{
					return;
	//   12   26:return          
				} else
				{
					((i) (r1)).d(((org.json.JSONObject) (null)));
	//   13   27:aload_1         
	//   14   28:aconst_null     
	//   15   29:invokevirtual   #87  <Method com.google.android.gms.common.api.ab i.d(org.json.JSONObject)>
	//   16   32:pop             
					return;
	//   17   33:return          
				}
			} else
			{
				return;
	//   18   34:return          
			}
		} else
		{
			return;
	//   19   35:return          
		}
	}

	public void onReceive(Context context, Intent intent)
	{
		String s = intent.getAction();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #92  <Method String Intent.getAction()>
	//    2    4:astore          6
		if(s == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		t t1 = com.google.android.gms.cast.framework.c.a(context).b();
	//    6   12:aload_1         
	//    7   13:invokestatic    #97  <Method c c.a(Context)>
	//    8   16:invokevirtual   #100 <Method t c.b()>
	//    9   19:astore          7
		byte byte0 = -1;
	//   10   21:iconst_m1       
	//   11   22:istore_3        
		switch(s.hashCode())
	//*  12   23:aload           6
	//*  13   25:invokevirtual   #105 <Method int String.hashCode()>
		{
	//*  14   28:lookupswitch    8: default 104
	//	               -1699820260: 214
	//	               -945151566: 199
	//	               -945080078: 184
	//	               -668151673: 169
	//	               -124479363: 153
	//	               235550565: 138
	//	               1362116196: 123
	//	               1997055314: 107
	//*  15  104:goto            226
		case 1997055314: 
			if(s.equals("android.intent.action.MEDIA_BUTTON"))
	//*  16  107:aload           6
	//*  17  109:ldc1            #107 <String "android.intent.action.MEDIA_BUTTON">
	//*  18  111:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  19  114:ifeq            226
				byte0 = 7;
	//   20  117:bipush          7
	//   21  119:istore_3        
			break;

	//*  22  120:goto            226
		case 1362116196: 
			if(s.equals("com.google.android.gms.cast.framework.action.FORWARD"))
	//*  23  123:aload           6
	//*  24  125:ldc1            #113 <String "com.google.android.gms.cast.framework.action.FORWARD">
	//*  25  127:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  26  130:ifeq            226
				byte0 = 3;
	//   27  133:iconst_3        
	//   28  134:istore_3        
			break;

	//*  29  135:goto            226
		case 235550565: 
			if(s.equals("com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"))
	//*  30  138:aload           6
	//*  31  140:ldc1            #115 <String "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK">
	//*  32  142:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  33  145:ifeq            226
				byte0 = 0;
	//   34  148:iconst_0        
	//   35  149:istore_3        
			break;

	//*  36  150:goto            226
		case -124479363: 
			if(s.equals("com.google.android.gms.cast.framework.action.DISCONNECT"))
	//*  37  153:aload           6
	//*  38  155:ldc1            #117 <String "com.google.android.gms.cast.framework.action.DISCONNECT">
	//*  39  157:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  40  160:ifeq            226
				byte0 = 6;
	//   41  163:bipush          6
	//   42  165:istore_3        
			break;

	//*  43  166:goto            226
		case -668151673: 
			if(s.equals("com.google.android.gms.cast.framework.action.STOP_CASTING"))
	//*  44  169:aload           6
	//*  45  171:ldc1            #119 <String "com.google.android.gms.cast.framework.action.STOP_CASTING">
	//*  46  173:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  47  176:ifeq            226
				byte0 = 5;
	//   48  179:iconst_5        
	//   49  180:istore_3        
			break;

	//*  50  181:goto            226
		case -945080078: 
			if(s.equals("com.google.android.gms.cast.framework.action.SKIP_PREV"))
	//*  51  184:aload           6
	//*  52  186:ldc1            #121 <String "com.google.android.gms.cast.framework.action.SKIP_PREV">
	//*  53  188:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  54  191:ifeq            226
				byte0 = 2;
	//   55  194:iconst_2        
	//   56  195:istore_3        
			break;

	//*  57  196:goto            226
		case -945151566: 
			if(s.equals("com.google.android.gms.cast.framework.action.SKIP_NEXT"))
	//*  58  199:aload           6
	//*  59  201:ldc1            #123 <String "com.google.android.gms.cast.framework.action.SKIP_NEXT">
	//*  60  203:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  61  206:ifeq            226
				byte0 = 1;
	//   62  209:iconst_1        
	//   63  210:istore_3        
			break;

	//*  64  211:goto            226
		case -1699820260: 
			if(s.equals("com.google.android.gms.cast.framework.action.REWIND"))
	//*  65  214:aload           6
	//*  66  216:ldc1            #125 <String "com.google.android.gms.cast.framework.action.REWIND">
	//*  67  218:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  68  221:ifeq            226
				byte0 = 4;
	//   69  224:iconst_4        
	//   70  225:istore_3        
			break;
		}
		switch(byte0)
	//*  71  226:iload_3         
		{
	//*  72  227:tableswitch     0 7: default 272
	//	               0 368
	//	               1 358
	//	               2 348
	//	               3 327
	//	               4 306
	//	               5 299
	//	               6 292
	//	               7 281
		default:
			a(context, s, intent);
	//   73  272:aload_0         
	//   74  273:aload_1         
	//   75  274:aload           6
	//   76  276:aload_2         
	//   77  277:invokevirtual   #127 <Method void a(Context, String, Intent)>
			return;
	//   78  280:return          

		case 7: // '\007'
			a(t1.a(), intent);
	//   79  281:aload_0         
	//   80  282:aload           7
	//   81  284:invokevirtual   #132 <Method r t.a()>
	//   82  287:aload_2         
	//   83  288:invokevirtual   #134 <Method void a(r, Intent)>
			return;
	//   84  291:return          

		case 6: // '\006'
			t1.a(false);
	//   85  292:aload           7
	//   86  294:iconst_0        
	//   87  295:invokevirtual   #137 <Method void t.a(boolean)>
			return;
	//   88  298:return          

		case 5: // '\005'
			t1.a(true);
	//   89  299:aload           7
	//   90  301:iconst_1        
	//   91  302:invokevirtual   #137 <Method void t.a(boolean)>
			return;
	//   92  305:return          

		case 4: // '\004'
			long l = intent.getLongExtra("googlecast-extra_skip_step_ms", 0L);
	//   93  306:aload_2         
	//   94  307:ldc1            #139 <String "googlecast-extra_skip_step_ms">
	//   95  309:lconst_0        
	//   96  310:invokevirtual   #143 <Method long Intent.getLongExtra(String, long)>
	//   97  313:lstore          4
			b(t1.a(), l);
	//   98  315:aload_0         
	//   99  316:aload           7
	//  100  318:invokevirtual   #132 <Method r t.a()>
	//  101  321:lload           4
	//  102  323:invokevirtual   #145 <Method void b(r, long)>
			return;
	//  103  326:return          

		case 3: // '\003'
			long l1 = intent.getLongExtra("googlecast-extra_skip_step_ms", 0L);
	//  104  327:aload_2         
	//  105  328:ldc1            #139 <String "googlecast-extra_skip_step_ms">
	//  106  330:lconst_0        
	//  107  331:invokevirtual   #143 <Method long Intent.getLongExtra(String, long)>
	//  108  334:lstore          4
			a(t1.a(), l1);
	//  109  336:aload_0         
	//  110  337:aload           7
	//  111  339:invokevirtual   #132 <Method r t.a()>
	//  112  342:lload           4
	//  113  344:invokevirtual   #147 <Method void a(r, long)>
			return;
	//  114  347:return          

		case 2: // '\002'
			c(t1.a());
	//  115  348:aload_0         
	//  116  349:aload           7
	//  117  351:invokevirtual   #132 <Method r t.a()>
	//  118  354:invokevirtual   #149 <Method void c(r)>
			return;
	//  119  357:return          

		case 1: // '\001'
			b(t1.a());
	//  120  358:aload_0         
	//  121  359:aload           7
	//  122  361:invokevirtual   #132 <Method r t.a()>
	//  123  364:invokevirtual   #151 <Method void b(r)>
			return;
	//  124  367:return          

		case 0: // '\0'
			a(t1.a());
	//  125  368:aload_0         
	//  126  369:aload           7
	//  127  371:invokevirtual   #132 <Method r t.a()>
	//  128  374:invokevirtual   #153 <Method void a(r)>
			return;
	//  129  377:return          
		}
	}
}
