// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.jni;

import android.content.Context;
import android.util.Log;
import com.baidu.android.pushservice.e.a;
import com.baidu.android.pushservice.h.u;
import com.baidu.android.pushservice.message.i;

public class PushSocket
{

	public static short a(byte abyte0[], int j)
	{
		byte byte0 = abyte0[j + 1];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:iadd            
	//    4    4:baload          
	//    5    5:istore_2        
		return (short)(abyte0[j + 0] & 0xff | byte0 << 8);
	//    6    6:aload_0         
	//    7    7:iload_1         
	//    8    8:iconst_0        
	//    9    9:iadd            
	//   10   10:baload          
	//   11   11:sipush          255
	//   12   14:iand            
	//   13   15:iload_2         
	//   14   16:bipush          8
	//   15   18:ishl            
	//   16   19:ior             
	//   17   20:int2short       
	//   18   21:ireturn         
	}

	public static void a(int j)
	{
		b = null;
	//    0    0:aconst_null     
	//    1    1:putstatic       #47  <Field byte[] b>
		c = 0;
	//    2    4:iconst_0        
	//    3    5:putstatic       #49  <Field int c>
		closeSocket(j);
	//    4    8:iload_0         
	//    5    9:invokestatic    #53  <Method int closeSocket(int)>
	//    6   12:pop             
	//    7   13:return          
	}

	public static boolean a(Context context)
	{
		if(!a)
	//*   0    0:getstatic       #33  <Field boolean a>
	//*   1    3:ifne            51
			try
			{
				System.loadLibrary("bdpush_V2_7");
	//    2    6:ldc1            #25  <String "bdpush_V2_7">
	//    3    8:invokestatic    #31  <Method void System.loadLibrary(String)>
				a = true;
	//    4   11:iconst_1        
	//    5   12:putstatic       #33  <Field boolean a>
			}
	//*   6   15:goto            51
	//*   7   18:new             #56  <Class StringBuilder>
	//*   8   21:dup             
	//*   9   22:invokespecial   #59  <Method void StringBuilder()>
	//*  10   25:astore_0        
	//*  11   26:aload_0         
	//*  12   27:ldc1            #61  <String "BDPushSDK-">
	//*  13   29:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  14   32:pop             
	//*  15   33:aload_0         
	//*  16   34:getstatic       #35  <Field String d>
	//*  17   37:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//*  18   40:pop             
	//*  19   41:aload_0         
	//*  20   42:invokevirtual   #69  <Method String StringBuilder.toString()>
	//*  21   45:ldc1            #37  <String "Native library not found! Please copy libbdpush_V2_7.so into your project!">
	//*  22   47:invokestatic    #74  <Method int Log.e(String, String)>
	//*  23   50:pop             
	//*  24   51:getstatic       #33  <Field boolean a>
	//*  25   54:ireturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
			{
				context = ((Context) (new StringBuilder()));
				((StringBuilder) (context)).append("BDPushSDK-");
				((StringBuilder) (context)).append(d);
				Log.e(((StringBuilder) (context)).toString(), "Native library not found! Please copy libbdpush_V2_7.so into your project!");
			}
		return a;
	//*  26   55:astore_0        
	//*  27   56:goto            18
	}

	public static byte[] a(Context context, int j)
	{
label0:
		do
		{
label1:
			do
				do
				{
					int k;
					do
					{
						if(b == null)
							continue label0;
	//    0    0:getstatic       #47  <Field byte[] b>
	//    1    3:ifnull          269
						k = b.length;
	//    2    6:getstatic       #47  <Field byte[] b>
	//    3    9:arraylength     
	//    4   10:istore_2        
						if(k != c)
							break;
	//    5   11:iload_2         
	//    6   12:getstatic       #49  <Field int c>
	//    7   15:icmpne          29
						b = null;
	//    8   18:aconst_null     
	//    9   19:putstatic       #47  <Field byte[] b>
						c = 0;
	//   10   22:iconst_0        
	//   11   23:putstatic       #49  <Field int c>
					} while(true);
	//   12   26:goto            0
					if(k - c <= 1)
						continue label1;
	//   13   29:iload_2         
	//   14   30:getstatic       #49  <Field int c>
	//   15   33:isub            
	//   16   34:iconst_1        
	//   17   35:icmple          260
					int l = ((int) (a(b, c)));
	//   18   38:getstatic       #47  <Field byte[] b>
	//   19   41:getstatic       #49  <Field int c>
	//   20   44:invokestatic    #77  <Method short a(byte[], int)>
	//   21   47:istore_3        
					String s = d;
	//   22   48:getstatic       #35  <Field String d>
	//   23   51:astore          4
					StringBuilder stringbuilder = new StringBuilder();
	//   24   53:new             #56  <Class StringBuilder>
	//   25   56:dup             
	//   26   57:invokespecial   #59  <Method void StringBuilder()>
	//   27   60:astore          5
					stringbuilder.append("msgid:");
	//   28   62:aload           5
	//   29   64:ldc1            #79  <String "msgid:">
	//   30   66:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   31   69:pop             
					stringbuilder.append(l);
	//   32   70:aload           5
	//   33   72:iload_3         
	//   34   73:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   35   76:pop             
					com.baidu.android.pushservice.e.a.b(s, stringbuilder.toString());
	//   36   77:aload           4
	//   37   79:aload           5
	//   38   81:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   39   84:invokestatic    #84  <Method void a.b(String, String)>
					if(l != i.f.a() && l != i.g.a())
	//*  40   87:iload_3         
	//*  41   88:getstatic       #89  <Field i i.f>
	//*  42   91:invokevirtual   #92  <Method short i.a()>
	//*  43   94:icmpeq          205
	//*  44   97:iload_3         
	//*  45   98:getstatic       #95  <Field i i.g>
	//*  46  101:invokevirtual   #92  <Method short i.a()>
	//*  47  104:icmpne          110
	//*  48  107:goto            205
					{
						if(k - c < e && !b(j))
	//*  49  110:iload_2         
	//*  50  111:getstatic       #49  <Field int c>
	//*  51  114:isub            
	//*  52  115:getstatic       #97  <Field int e>
	//*  53  118:icmpge          130
	//*  54  121:iload_1         
	//*  55  122:invokestatic    #100 <Method boolean b(int)>
	//*  56  125:ifne            130
							return null;
	//   57  128:aconst_null     
	//   58  129:areturn         
						l = b(b, c + f);
	//   59  130:getstatic       #47  <Field byte[] b>
	//   60  133:getstatic       #49  <Field int c>
	//   61  136:getstatic       #102 <Field int f>
	//   62  139:iadd            
	//   63  140:invokestatic    #105 <Method int b(byte[], int)>
	//   64  143:istore_3        
						if(c + l + e <= k - c)
	//*  65  144:getstatic       #49  <Field int c>
	//*  66  147:iload_3         
	//*  67  148:iadd            
	//*  68  149:getstatic       #97  <Field int e>
	//*  69  152:iadd            
	//*  70  153:iload_2         
	//*  71  154:getstatic       #49  <Field int c>
	//*  72  157:isub            
	//*  73  158:icmpgt          196
						{
							context = ((Context) (new byte[e + l]));
	//   74  161:getstatic       #97  <Field int e>
	//   75  164:iload_3         
	//   76  165:iadd            
	//   77  166:newarray        byte[]
	//   78  168:astore_0        
							System.arraycopy(((Object) (b)), c, ((Object) (context)), 0, context.length);
	//   79  169:getstatic       #47  <Field byte[] b>
	//   80  172:getstatic       #49  <Field int c>
	//   81  175:aload_0         
	//   82  176:iconst_0        
	//   83  177:aload_0         
	//   84  178:arraylength     
	//   85  179:invokestatic    #109 <Method void System.arraycopy(Object, int, Object, int, int)>
							c += l + e;
	//   86  182:getstatic       #49  <Field int c>
	//   87  185:iload_3         
	//   88  186:getstatic       #97  <Field int e>
	//   89  189:iadd            
	//   90  190:iadd            
	//   91  191:putstatic       #49  <Field int c>
							return ((byte []) (context));
	//   92  194:aload_0         
	//   93  195:areturn         
						}
						if(!b(j))
	//*  94  196:iload_1         
	//*  95  197:invokestatic    #100 <Method boolean b(int)>
	//*  96  200:ifne            0
							return null;
	//   97  203:aconst_null     
	//   98  204:areturn         
					} else
					{
						byte abyte0[] = new byte[2];
	//   99  205:iconst_2        
	//  100  206:newarray        byte[]
	//  101  208:astore          4
						System.arraycopy(((Object) (b)), c, ((Object) (abyte0)), 0, abyte0.length);
	//  102  210:getstatic       #47  <Field byte[] b>
	//  103  213:getstatic       #49  <Field int c>
	//  104  216:aload           4
	//  105  218:iconst_0        
	//  106  219:aload           4
	//  107  221:arraylength     
	//  108  222:invokestatic    #109 <Method void System.arraycopy(Object, int, Object, int, int)>
						if(l == i.g.a())
	//* 109  225:iload_3         
	//* 110  226:getstatic       #95  <Field i i.g>
	//* 111  229:invokevirtual   #92  <Method short i.a()>
	//* 112  232:icmpne          249
						{
							com.baidu.android.pushservice.e.a.b(d, "MSG_ID_TINY_HEARTBEAT_SERVER");
	//  113  235:getstatic       #35  <Field String d>
	//  114  238:ldc1            #111 <String "MSG_ID_TINY_HEARTBEAT_SERVER">
	//  115  240:invokestatic    #84  <Method void a.b(String, String)>
							u.b("MSG_ID_TINY_HEARTBEAT_SERVER", context);
	//  116  243:ldc1            #111 <String "MSG_ID_TINY_HEARTBEAT_SERVER">
	//  117  245:aload_0         
	//  118  246:invokestatic    #116 <Method void u.b(String, Context)>
						}
						c += 2;
	//  119  249:getstatic       #49  <Field int c>
	//  120  252:iconst_2        
	//  121  253:iadd            
	//  122  254:putstatic       #49  <Field int c>
						return abyte0;
	//  123  257:aload           4
	//  124  259:areturn         
					}
				} while(true);
			while(b(j));
	//  125  260:iload_1         
	//  126  261:invokestatic    #100 <Method boolean b(int)>
	//  127  264:ifne            0
			return null;
	//  128  267:aconst_null     
	//  129  268:areturn         
		} while(b(j));
	//  130  269:iload_1         
	//  131  270:invokestatic    #100 <Method boolean b(int)>
	//  132  273:ifne            0
		return null;
	//  133  276:aconst_null     
	//  134  277:areturn         
	}

	public static int b(byte abyte0[], int j)
	{
		byte byte0 = abyte0[j + 3];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:iadd            
	//    4    4:baload          
	//    5    5:istore_2        
		byte byte1 = abyte0[j + 2];
	//    6    6:aload_0         
	//    7    7:iload_1         
	//    8    8:iconst_2        
	//    9    9:iadd            
	//   10   10:baload          
	//   11   11:istore_3        
		byte byte2 = abyte0[j + 1];
	//   12   12:aload_0         
	//   13   13:iload_1         
	//   14   14:iconst_1        
	//   15   15:iadd            
	//   16   16:baload          
	//   17   17:istore          4
		return (abyte0[j + 0] & 0xff) << 0 | ((byte0 & 0xff) << 24 | (byte1 & 0xff) << 16 | (byte2 & 0xff) << 8);
	//   18   19:aload_0         
	//   19   20:iload_1         
	//   20   21:iconst_0        
	//   21   22:iadd            
	//   22   23:baload          
	//   23   24:sipush          255
	//   24   27:iand            
	//   25   28:iconst_0        
	//   26   29:ishl            
	//   27   30:iload_2         
	//   28   31:sipush          255
	//   29   34:iand            
	//   30   35:bipush          24
	//   31   37:ishl            
	//   32   38:iload_3         
	//   33   39:sipush          255
	//   34   42:iand            
	//   35   43:bipush          16
	//   36   45:ishl            
	//   37   46:ior             
	//   38   47:iload           4
	//   39   49:sipush          255
	//   40   52:iand            
	//   41   53:bipush          8
	//   42   55:ishl            
	//   43   56:ior             
	//   44   57:ior             
	//   45   58:ireturn         
	}

	private static boolean b(int j)
	{
		byte abyte0[] = rcvMsg(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #120 <Method byte[] rcvMsg(int)>
	//    2    4:astore_1        
		if(abyte0 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          76
		{
			if(abyte0.length == 0)
	//*   5    9:aload_1         
	//*   6   10:arraylength     
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			if(b == null)
	//*  10   16:getstatic       #47  <Field byte[] b>
	//*  11   19:ifnonnull       29
			{
				b = abyte0;
	//   12   22:aload_1         
	//   13   23:putstatic       #47  <Field byte[] b>
			} else
	//*  14   26:goto            74
			{
				byte abyte1[] = new byte[b.length + abyte0.length];
	//   15   29:getstatic       #47  <Field byte[] b>
	//   16   32:arraylength     
	//   17   33:aload_1         
	//   18   34:arraylength     
	//   19   35:iadd            
	//   20   36:newarray        byte[]
	//   21   38:astore_2        
				System.arraycopy(((Object) (b)), c, ((Object) (abyte1)), 0, b.length - c);
	//   22   39:getstatic       #47  <Field byte[] b>
	//   23   42:getstatic       #49  <Field int c>
	//   24   45:aload_2         
	//   25   46:iconst_0        
	//   26   47:getstatic       #47  <Field byte[] b>
	//   27   50:arraylength     
	//   28   51:getstatic       #49  <Field int c>
	//   29   54:isub            
	//   30   55:invokestatic    #109 <Method void System.arraycopy(Object, int, Object, int, int)>
				System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), b.length, abyte0.length);
	//   31   58:aload_1         
	//   32   59:iconst_0        
	//   33   60:aload_2         
	//   34   61:getstatic       #47  <Field byte[] b>
	//   35   64:arraylength     
	//   36   65:aload_1         
	//   37   66:arraylength     
	//   38   67:invokestatic    #109 <Method void System.arraycopy(Object, int, Object, int, int)>
				b = abyte1;
	//   39   70:aload_2         
	//   40   71:putstatic       #47  <Field byte[] b>
			}
			return true;
	//   41   74:iconst_1        
	//   42   75:ireturn         
		} else
		{
			return false;
	//   43   76:iconst_0        
	//   44   77:ireturn         
		}
	}

	public static native int closeSocket(int j);

	public static native int createSocket(String s, int j);

	public static native int getLastSocketError();

	private static native byte[] rcvMsg(int j);

	public static native int sendMsg(int j, byte abyte0[], int k);

	public static boolean a = false;
	private static byte b[];
	private static int c = 0;
	private static String d = "PushSocket";
	private static int e = 36;
	private static int f = 32;

	static 
	{
		UnsatisfiedLinkError unsatisfiedlinkerror;
		try
		{
			System.loadLibrary("bdpush_V2_7");
	//    0    0:ldc1            #25  <String "bdpush_V2_7">
	//    1    2:invokestatic    #31  <Method void System.loadLibrary(String)>
			a = true;
	//    2    5:iconst_1        
	//    3    6:putstatic       #33  <Field boolean a>
			return;
	//    4    9:return          
		}
	//*   5   10:getstatic       #35  <Field String d>
	//*   6   13:ldc1            #37  <String "Native library not found! Please copy libbdpush_V2_7.so into your project!">
	//*   7   15:invokestatic    #42  <Method void a.e(String, String)>
	//*   8   18:return          
		// Misplaced declaration of an exception variable
		catch(UnsatisfiedLinkError unsatisfiedlinkerror)
		{
			com.baidu.android.pushservice.e.a.e(d, "Native library not found! Please copy libbdpush_V2_7.so into your project!");
		}
	//*   9   19:astore_0        
	//*  10   20:goto            10
	}
}
