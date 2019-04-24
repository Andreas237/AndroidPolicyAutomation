// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.text.TextUtils;
import com.ta.utdid2.device.UTDevice;
import java.io.*;

// Referenced classes of package o:
//			ft

public final class hj
{

	private hj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static boolean b()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_0        
_L2:
		if(i >= 5)
			break; /* Loop/switch isn't completed */
	//    2    2:iload_0         
	//    3    3:iconst_5        
	//    4    4:icmpge          130
		int j;
		String s = (new StringBuilder()).append((new String[] {
			"/system/xbin/", "/system/bin/", "/system/sbin/", "/sbin/", "/vendor/bin/"
		})[i]).append("su").toString();
	//    5    7:new             #19  <Class StringBuilder>
	//    6   10:dup             
	//    7   11:invokespecial   #20  <Method void StringBuilder()>
	//    8   14:iconst_5        
	//    9   15:anewarray       String[]
	//   10   18:dup             
	//   11   19:iconst_0        
	//   12   20:ldc1            #24  <String "/system/xbin/">
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_1        
	//   16   25:ldc1            #26  <String "/system/bin/">
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_2        
	//   20   30:ldc1            #28  <String "/system/sbin/">
	//   21   32:aastore         
	//   22   33:dup             
	//   23   34:iconst_3        
	//   24   35:ldc1            #30  <String "/sbin/">
	//   25   37:aastore         
	//   26   38:dup             
	//   27   39:iconst_4        
	//   28   40:ldc1            #32  <String "/vendor/bin/">
	//   29   42:aastore         
	//   30   43:iload_0         
	//   31   44:aaload          
	//   32   45:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   33   48:ldc1            #38  <String "su">
	//   34   50:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   35   53:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   36   56:astore_2        
		if(!(new File(s)).exists())
			break MISSING_BLOCK_LABEL_123;
	//   37   57:new             #44  <Class File>
	//   38   60:dup             
	//   39   61:aload_2         
	//   40   62:invokespecial   #47  <Method void File(String)>
	//   41   65:invokevirtual   #50  <Method boolean File.exists()>
	//   42   68:ifeq            123
		s = e(new String[] {
			"ls", "-l", s
		});
	//   43   71:iconst_3        
	//   44   72:anewarray       String[]
	//   45   75:dup             
	//   46   76:iconst_0        
	//   47   77:ldc1            #52  <String "ls">
	//   48   79:aastore         
	//   49   80:dup             
	//   50   81:iconst_1        
	//   51   82:ldc1            #54  <String "-l">
	//   52   84:aastore         
	//   53   85:dup             
	//   54   86:iconst_2        
	//   55   87:aload_2         
	//   56   88:aastore         
	//   57   89:invokestatic    #58  <Method String e(String[])>
	//   58   92:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_119;
	//   59   93:aload_2         
	//   60   94:invokestatic    #64  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   61   97:ifne            119
		i = s.indexOf("root");
	//   62  100:aload_2         
	//   63  101:ldc1            #66  <String "root">
	//   64  103:invokevirtual   #70  <Method int String.indexOf(String)>
	//   65  106:istore_0        
		j = s.lastIndexOf("root");
	//   66  107:aload_2         
	//   67  108:ldc1            #66  <String "root">
	//   68  110:invokevirtual   #73  <Method int String.lastIndexOf(String)>
	//   69  113:istore_1        
		if(i != j)
			break MISSING_BLOCK_LABEL_121;
	//   70  114:iload_0         
	//   71  115:iload_1         
	//   72  116:icmpne          121
		return false;
	//   73  119:iconst_0        
	//   74  120:ireturn         
		return true;
	//   75  121:iconst_1        
	//   76  122:ireturn         
		i++;
	//   77  123:iload_0         
	//   78  124:iconst_1        
	//   79  125:iadd            
	//   80  126:istore_0        
		if(true) goto _L2; else goto _L1
	//   81  127:goto            2
_L1:
		return false;
	//   82  130:iconst_0        
	//   83  131:ireturn         
		Exception exception;
		exception;
	//   84  132:astore_2        
		if(true) goto _L1; else goto _L3
_L3:
	//*  85  133:goto            130
	}

	public static hj d()
	{
		if(a == null)
	//*   0    0:getstatic       #77  <Field hj a>
	//*   1    3:ifnonnull       16
			a = new hj();
	//    2    6:new             #2   <Class hj>
	//    3    9:dup             
	//    4   10:invokespecial   #78  <Method void hj()>
	//    5   13:putstatic       #77  <Field hj a>
		return a;
	//    6   16:getstatic       #77  <Field hj a>
	//    7   19:areturn         
	}

	private static String e(String as[])
	{
		String s;
		String as1[];
		String as2[];
		String s1;
		DataOutputStream dataoutputstream;
		Object obj;
		s1 = "";
	//    0    0:ldc1            #82  <String "">
	//    1    2:astore          4
		obj = null;
	//    2    4:aconst_null     
	//    3    5:astore          6
		dataoutputstream = null;
	//    4    7:aconst_null     
	//    5    8:astore          5
		as1 = ((String []) (dataoutputstream));
	//    6   10:aload           5
	//    7   12:astore_2        
		s = s1;
	//    8   13:aload           4
	//    9   15:astore_1        
		as2 = ((String []) (obj));
	//   10   16:aload           6
	//   11   18:astore_3        
		try
		{
			as = ((String []) (new ProcessBuilder(as)));
	//   12   19:new             #84  <Class ProcessBuilder>
	//   13   22:dup             
	//   14   23:aload_0         
	//   15   24:invokespecial   #87  <Method void ProcessBuilder(String[])>
	//   16   27:astore_0        
		}
	//*  17   28:aload           5
	//*  18   30:astore_2        
	//*  19   31:aload           4
	//*  20   33:astore_1        
	//*  21   34:aload           6
	//*  22   36:astore_3        
	//*  23   37:aload_0         
	//*  24   38:iconst_0        
	//*  25   39:invokevirtual   #91  <Method ProcessBuilder ProcessBuilder.redirectErrorStream(boolean)>
	//*  26   42:pop             
	//*  27   43:aload           5
	//*  28   45:astore_2        
	//*  29   46:aload           4
	//*  30   48:astore_1        
	//*  31   49:aload           6
	//*  32   51:astore_3        
	//*  33   52:aload_0         
	//*  34   53:invokevirtual   #95  <Method Process ProcessBuilder.start()>
	//*  35   56:astore_0        
	//*  36   57:aload_0         
	//*  37   58:astore_2        
	//*  38   59:aload           4
	//*  39   61:astore_1        
	//*  40   62:aload_0         
	//*  41   63:astore_3        
	//*  42   64:new             #97  <Class DataOutputStream>
	//*  43   67:dup             
	//*  44   68:aload_0         
	//*  45   69:invokevirtual   #103 <Method java.io.OutputStream Process.getOutputStream()>
	//*  46   72:invokespecial   #106 <Method void DataOutputStream(java.io.OutputStream)>
	//*  47   75:astore          5
	//*  48   77:aload_0         
	//*  49   78:astore_2        
	//*  50   79:aload           4
	//*  51   81:astore_1        
	//*  52   82:aload_0         
	//*  53   83:astore_3        
	//*  54   84:new             #108 <Class DataInputStream>
	//*  55   87:dup             
	//*  56   88:aload_0         
	//*  57   89:invokevirtual   #112 <Method java.io.InputStream Process.getInputStream()>
	//*  58   92:invokespecial   #115 <Method void DataInputStream(java.io.InputStream)>
	//*  59   95:invokevirtual   #118 <Method String DataInputStream.readLine()>
	//*  60   98:astore          4
	//*  61  100:aload_0         
	//*  62  101:astore_2        
	//*  63  102:aload           4
	//*  64  104:astore_1        
	//*  65  105:aload_0         
	//*  66  106:astore_3        
	//*  67  107:aload           5
	//*  68  109:ldc1            #120 <String "exit\n">
	//*  69  111:invokevirtual   #123 <Method void DataOutputStream.writeBytes(String)>
	//*  70  114:aload_0         
	//*  71  115:astore_2        
	//*  72  116:aload           4
	//*  73  118:astore_1        
	//*  74  119:aload_0         
	//*  75  120:astore_3        
	//*  76  121:aload           5
	//*  77  123:invokevirtual   #126 <Method void DataOutputStream.flush()>
	//*  78  126:aload_0         
	//*  79  127:astore_2        
	//*  80  128:aload           4
	//*  81  130:astore_1        
	//*  82  131:aload_0         
	//*  83  132:astore_3        
	//*  84  133:aload_0         
	//*  85  134:invokevirtual   #130 <Method int Process.waitFor()>
	//*  86  137:pop             
	//*  87  138:aload_0         
	//*  88  139:invokevirtual   #133 <Method void Process.destroy()>
	//*  89  142:aload           4
	//*  90  144:areturn         
	//*  91  145:aload_3         
	//*  92  146:invokevirtual   #133 <Method void Process.destroy()>
	//*  93  149:aload_1         
	//*  94  150:areturn         
	//*  95  151:astore_0        
	//*  96  152:aload_2         
	//*  97  153:invokevirtual   #133 <Method void Process.destroy()>
	//*  98  156:aload_0         
	//*  99  157:athrow          
		// Misplaced declaration of an exception variable
		catch(String as[])
		{
			try
			{
				((Process) (as2)).destroy();
			}
	//* 100  158:astore_0        
	//* 101  159:goto            145
	//* 102  162:astore_0        
	//* 103  163:aload           4
	//* 104  165:areturn         
			// Misplaced declaration of an exception variable
			catch(String as[])
	//* 105  166:astore_0        
			{
				return s;
	//  106  167:aload_1         
	//  107  168:areturn         
			}
			return s;
		}
		as1 = ((String []) (dataoutputstream));
		s = s1;
		as2 = ((String []) (obj));
		((ProcessBuilder) (as)).redirectErrorStream(false);
		as1 = ((String []) (dataoutputstream));
		s = s1;
		as2 = ((String []) (obj));
		as = ((String []) (((ProcessBuilder) (as)).start()));
		as1 = as;
		s = s1;
		as2 = as;
		dataoutputstream = new DataOutputStream(((Process) (as)).getOutputStream());
		as1 = as;
		s = s1;
		as2 = as;
		s1 = (new DataInputStream(((Process) (as)).getInputStream())).readLine();
		as1 = as;
		s = s1;
		as2 = as;
		dataoutputstream.writeBytes("exit\n");
		as1 = as;
		s = s1;
		as2 = as;
		dataoutputstream.flush();
		as1 = as;
		s = s1;
		as2 = as;
		((Process) (as)).waitFor();
		try
		{
			((Process) (as)).destroy();
		}
		// Misplaced declaration of an exception variable
		catch(String as[])
		{
			return s1;
		}
		return s1;
		as;
		try
		{
			((Process) (as1)).destroy();
		}
		catch(Exception exception) { }
	//  108  169:astore_1        
		throw as;
	//* 109  170:goto            156
	}

	public final void b(Context context)
	{
		c = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #140 <Method Context Context.getApplicationContext()>
	//    3    5:putfield        #142 <Field Context c>
	//    4    8:return          
	}

	public final String c()
	{
		String s;
		try
		{
			s = UTDevice.getUtdid(c);
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field Context c>
	//    2    4:invokestatic    #148 <Method String UTDevice.getUtdid(Context)>
	//    3    7:astore_1        
		}
	//*   4    8:aload_1         
	//*   5    9:areturn         
		catch(Throwable throwable)
	//*   6   10:astore_1        
		{
			ft.e("third", "GetUtdidEx", throwable);
	//    7   11:ldc1            #150 <String "third">
	//    8   13:ldc1            #152 <String "GetUtdidEx">
	//    9   15:aload_1         
	//   10   16:invokestatic    #157 <Method void ft.e(String, String, Throwable)>
			return "";
	//   11   19:ldc1            #82  <String "">
	//   12   21:areturn         
		}
		return s;
	}

	private static hj a;
	public Context c;
}
