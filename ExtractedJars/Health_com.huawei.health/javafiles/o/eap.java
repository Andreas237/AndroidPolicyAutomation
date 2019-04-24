// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.text.TextUtils;
import com.huawei.hwcommonmodel.application.BaseApplication;
import java.io.*;
import java.util.HashMap;
import java.util.List;

// Referenced classes of package o:
//			dho, eas, eaq, eat, 
//			ear, eav, eao, dbf, 
//			eax, eba, eay, eaz

public final class eap
{
	public static final class e extends Enum
	{

		public static e valueOf(String s)
		{
			return (e)Enum.valueOf(o/eap$e, s);
		//    0    0:ldc1            #2   <Class eap$e>
		//    1    2:aload_0         
		//    2    3:invokestatic    #46  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class eap$e>
		//    4    9:areturn         
		}

		public static e[] values()
		{
			return (e[])((e []) (b)).clone();
		//    0    0:getstatic       #38  <Field eap$e[] b>
		//    1    3:invokevirtual   #53  <Method Object _5B_Lo.eap$e_3B_.clone()>
		//    2    6:checkcast       #49  <Class eap$e[]>
		//    3    9:areturn         
		}

		public static final e a;
		private static final e b[];
		public static final e c;
		public static final e d;
		public static final e e;

		static 
		{
			d = new e("COMMON_INDEX_TYPE", 0);
		//    0    0:new             #2   <Class eap$e>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "COMMON_INDEX_TYPE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void eap$e(String, int)>
		//    5   10:putstatic       #24  <Field eap$e d>
			a = new e("LANGUAGE_INDEX_TYPE", 1);
		//    6   13:new             #2   <Class eap$e>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "LANGUAGE_INDEX_TYPE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void eap$e(String, int)>
		//   11   23:putstatic       #28  <Field eap$e a>
			e = new e("COMMON_RESOURCES_INDEX_TYPE", 2);
		//   12   26:new             #2   <Class eap$e>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "COMMON_RESOURCES_INDEX_TYPE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void eap$e(String, int)>
		//   17   36:putstatic       #32  <Field eap$e e>
			c = new e("RESOURCES_INDEX_TYPE", 3);
		//   18   39:new             #2   <Class eap$e>
		//   19   42:dup             
		//   20   43:ldc1            #34  <String "RESOURCES_INDEX_TYPE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void eap$e(String, int)>
		//   23   49:putstatic       #36  <Field eap$e c>
			b = (new e[] {
				d, a, e, c
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       e[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field eap$e d>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #28  <Field eap$e a>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #32  <Field eap$e e>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #36  <Field eap$e c>
		//   41   79:aastore         
		//   42   80:putstatic       #38  <Field eap$e[] b>
		//*  43   83:return          
		}

		private e(String s, int j)
		{
			super(s, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #40  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public eap()
	{
		this(e.d, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getstatic       #21  <Field eap$e eap$e.d>
	//    2    4:aconst_null     
	//    3    5:invokespecial   #24  <Method void eap(eap$e, String)>
	//    4    8:return          
	}

	public eap(e e1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		k = new HashMap();
	//    2    4:aload_0         
	//    3    5:new             #29  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void HashMap()>
	//    6   12:putfield        #32  <Field HashMap k>
		d = e1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #33  <Field eap$e d>
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  10   20:aload_2         
	//*  11   21:invokestatic    #39  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   24:ifeq            35
			s = a();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #42  <Method String a()>
	//   15   31:astore_2        
	//*  16   32:goto            35
		c = s;
	//   17   35:aload_0         
	//   18   36:aload_2         
	//   19   37:putfield        #44  <Field String c>
		c();
	//   20   40:aload_0         
	//   21   41:invokevirtual   #46  <Method void c()>
	//   22   44:return          
	}

	private String a(String s, StringBuilder stringbuilder)
	{
		if(stringbuilder != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			stringbuilder.setLength(0);
	//    2    4:aload_2         
	//    3    5:iconst_0        
	//    4    6:invokevirtual   #53  <Method void StringBuilder.setLength(int)>
		else
	//*   5    9:goto            22
			stringbuilder = new StringBuilder(32);
	//    6   12:new             #49  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:bipush          32
	//    9   18:invokespecial   #55  <Method void StringBuilder(int)>
	//   10   21:astore_2        
		switch(_cls4.d[d.ordinal()])
	//*  11   22:getstatic       #60  <Field int[] eap$4.d>
	//*  12   25:aload_0         
	//*  13   26:getfield        #33  <Field eap$e d>
	//*  14   29:invokevirtual   #64  <Method int eap$e.ordinal()>
	//*  15   32:iaload          
		{
	//*  16   33:tableswitch     1 3: default 60
	//	               1 63
	//	               2 63
	//	               3 95
	//*  17   60:goto            125
		case 1: // '\001'
		case 2: // '\002'
			stringbuilder.append("version=").append(c);
	//   18   63:aload_2         
	//   19   64:ldc1            #66  <String "version=">
	//   20   66:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   21   69:aload_0         
	//   22   70:getfield        #44  <Field String c>
	//   23   73:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   24   76:pop             
			if(s != null)
	//*  25   77:aload_1         
	//*  26   78:ifnull          135
				stringbuilder.append('&').append(s);
	//   27   81:aload_2         
	//   28   82:bipush          38
	//   29   84:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//   30   87:aload_1         
	//   31   88:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   32   91:pop             
			break;
	//   33   92:goto            135

		case 3: // '\003'
			stringbuilder.append("version=").append("common");
	//   34   95:aload_2         
	//   35   96:ldc1            #66  <String "version=">
	//   36   98:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   37  101:ldc1            #75  <String "common">
	//   38  103:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   39  106:pop             
			if(s != null)
	//*  40  107:aload_1         
	//*  41  108:ifnull          135
				stringbuilder.append('&').append(s);
	//   42  111:aload_2         
	//   43  112:bipush          38
	//   44  114:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//   45  117:aload_1         
	//   46  118:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   47  121:pop             
			break;
	//   48  122:goto            135

		default:
			if(s != null)
	//*  49  125:aload_1         
	//*  50  126:ifnull          135
				stringbuilder.append(s);
	//   51  129:aload_2         
	//   52  130:aload_1         
	//   53  131:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   54  134:pop             
			break;
		}
		return stringbuilder.toString();
	//   55  135:aload_2         
	//   56  136:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   57  139:areturn         
	}

	private static void b(File file)
	{
		if(file.isDirectory())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #87  <Method boolean File.isDirectory()>
	//*   2    4:ifeq            43
		{
			File afile[] = file.listFiles();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #91  <Method File[] File.listFiles()>
	//    5   11:astore          4
			if(afile != null)
	//*   6   13:aload           4
	//*   7   15:ifnull          43
			{
				int i1 = afile.length;
	//    8   18:aload           4
	//    9   20:arraylength     
	//   10   21:istore_2        
				for(int j = 0; j < i1; j++)
	//*  11   22:iconst_0        
	//*  12   23:istore_1        
	//*  13   24:iload_1         
	//*  14   25:iload_2         
	//*  15   26:icmpge          43
					b(afile[j]);
	//   16   29:aload           4
	//   17   31:iload_1         
	//   18   32:aaload          
	//   19   33:invokestatic    #93  <Method void b(File)>

	//   20   36:iload_1         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_1        
			}
		}
	//*  24   40:goto            24
		try
		{
			boolean flag = file.delete();
	//   25   43:aload_0         
	//   26   44:invokevirtual   #96  <Method boolean File.delete()>
	//   27   47:istore_3        
			dho.b("EzPlugin_EzPluginHelper", new Object[] {
				"delete file:", file.getPath(), ", bRet=", Boolean.valueOf(flag)
			});
	//   28   48:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   29   50:iconst_4        
	//   30   51:anewarray       Object[]
	//   31   54:dup             
	//   32   55:iconst_0        
	//   33   56:ldc1            #100 <String "delete file:">
	//   34   58:aastore         
	//   35   59:dup             
	//   36   60:iconst_1        
	//   37   61:aload_0         
	//   38   62:invokevirtual   #103 <Method String File.getPath()>
	//   39   65:aastore         
	//   40   66:dup             
	//   41   67:iconst_2        
	//   42   68:ldc1            #105 <String ", bRet=">
	//   43   70:aastore         
	//   44   71:dup             
	//   45   72:iconst_3        
	//   46   73:iload_3         
	//   47   74:invokestatic    #111 <Method Boolean Boolean.valueOf(boolean)>
	//   48   77:aastore         
	//   49   78:invokestatic    #116 <Method void dho.b(String, Object[])>
			return;
	//   50   81:return          
		}
		catch(Exception exception)
	//*  51   82:astore          4
		{
			dho.f("EzPlugin_EzPluginHelper", new Object[] {
				"delete file:", file.getPath(), ", ex=", exception.toString()
			});
	//   52   84:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   53   86:iconst_4        
	//   54   87:anewarray       Object[]
	//   55   90:dup             
	//   56   91:iconst_0        
	//   57   92:ldc1            #100 <String "delete file:">
	//   58   94:aastore         
	//   59   95:dup             
	//   60   96:iconst_1        
	//   61   97:aload_0         
	//   62   98:invokevirtual   #103 <Method String File.getPath()>
	//   63  101:aastore         
	//   64  102:dup             
	//   65  103:iconst_2        
	//   66  104:ldc1            #118 <String ", ex=">
	//   67  106:aastore         
	//   68  107:dup             
	//   69  108:iconst_3        
	//   70  109:aload           4
	//   71  111:invokevirtual   #119 <Method String Exception.toString()>
	//   72  114:aastore         
	//   73  115:invokestatic    #122 <Method void dho.f(String, Object[])>
		}
	//   74  118:return          
	}

	private void c(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #39  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            16
			s = f(((String) (null)));
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:invokespecial   #126 <Method String f(String)>
	//    6   12:astore_1        
	//*   7   13:goto            16
		e = s;
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:putfield        #128 <Field String e>
		a = null;
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:putfield        #130 <Field String a>
		b = false;
	//   14   26:aload_0         
	//   15   27:iconst_0        
	//   16   28:putfield        #132 <Field boolean b>
	//   17   31:return          
	}

	private void d(String s, eat eat1)
	{
		if(eat1 == null)
			break MISSING_BLOCK_LABEL_29;
	//    0    0:aload_2         
	//    1    1:ifnull          29
		HashMap hashmap = k;
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field HashMap k>
	//    4    8:astore_3        
		hashmap;
	//    5    9:aload_3         
		JVM INSTR monitorenter ;
	//    6   10:monitorenter    
		k.put(((Object) (s)), ((Object) (eat1)));
	//    7   11:aload_0         
	//    8   12:getfield        #32  <Field HashMap k>
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #137 <Method Object HashMap.put(Object, Object)>
	//   12   20:pop             
		hashmap;
	//   13   21:aload_3         
		JVM INSTR monitorexit ;
	//   14   22:monitorexit     
		return;
	//   15   23:return          
		s;
	//   16   24:astore_1        
	//*  17   25:aload_3         
		throw s;
	//   18   26:monitorexit     
	//   19   27:aload_1         
	//   20   28:athrow          
	//   21   29:return          
	}

	private void d(String s, eaz eaz1)
	{
		dho.b("EzPlugin_EzPluginHelper", new Object[] {
			"updateDescrption indexType=", d, ", version=", c, ", uuid=", s
		});
	//    0    0:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//    1    2:bipush          6
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:ldc1            #140 <String "updateDescrption indexType=">
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #33  <Field eap$e d>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:ldc1            #142 <String ", version=">
	//   15   23:aastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:aload_0         
	//   19   27:getfield        #44  <Field String c>
	//   20   30:aastore         
	//   21   31:dup             
	//   22   32:iconst_4        
	//   23   33:ldc1            #144 <String ", uuid=">
	//   24   35:aastore         
	//   25   36:dup             
	//   26   37:iconst_5        
	//   27   38:aload_1         
	//   28   39:aastore         
	//   29   40:invokestatic    #116 <Method void dho.b(String, Object[])>
		a(((eaz) (new _cls5(s, eaz1))));
	//   30   43:aload_0         
	//   31   44:new             #146 <Class eap$5>
	//   32   47:dup             
	//   33   48:aload_0         
	//   34   49:aload_1         
	//   35   50:aload_2         
	//   36   51:invokespecial   #149 <Method void eap$5(eap, String, eaz)>
	//   37   54:invokevirtual   #152 <Method void a(eaz)>
	//   38   57:return          
	}

	private static String e(File file)
	{
		File file1;
		File file2;
		StringBuilder stringbuilder;
		if(file == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       20
		{
			dho.f("EzPlugin_EzPluginHelper", new Object[] {
				"readFileToData, null == file"
			});
	//    2    4:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//    3    6:iconst_1        
	//    4    7:anewarray       Object[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:ldc1            #157 <String "readFileToData, null == file">
	//    8   14:aastore         
	//    9   15:invokestatic    #122 <Method void dho.f(String, Object[])>
			return null;
	//   10   18:aconst_null     
	//   11   19:areturn         
		}
		dho.b("EzPlugin_EzPluginHelper", new Object[] {
			"enter readFileToData: filePath = ", file.getAbsolutePath()
		});
	//   12   20:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   13   22:iconst_2        
	//   14   23:anewarray       Object[]
	//   15   26:dup             
	//   16   27:iconst_0        
	//   17   28:ldc1            #159 <String "enter readFileToData: filePath = ">
	//   18   30:aastore         
	//   19   31:dup             
	//   20   32:iconst_1        
	//   21   33:aload_0         
	//   22   34:invokevirtual   #162 <Method String File.getAbsolutePath()>
	//   23   37:aastore         
	//   24   38:invokestatic    #116 <Method void dho.b(String, Object[])>
		stringbuilder = new StringBuilder(1024);
	//   25   41:new             #49  <Class StringBuilder>
	//   26   44:dup             
	//   27   45:sipush          1024
	//   28   48:invokespecial   #55  <Method void StringBuilder(int)>
	//   29   51:astore          4
		file2 = null;
	//   30   53:aconst_null     
	//   31   54:astore_3        
		file1 = null;
	//   32   55:aconst_null     
	//   33   56:astore_2        
		file = ((File) (new FileInputStream(file)));
	//   34   57:new             #164 <Class FileInputStream>
	//   35   60:dup             
	//   36   61:aload_0         
	//   37   62:invokespecial   #166 <Method void FileInputStream(File)>
	//   38   65:astore_0        
		file1 = file;
	//   39   66:aload_0         
	//   40   67:astore_2        
		file2 = file;
	//   41   68:aload_0         
	//   42   69:astore_3        
		byte abyte0[] = new byte[1024];
	//   43   70:sipush          1024
	//   44   73:newarray        byte[]
	//   45   75:astore          5
_L2:
		file1 = file;
	//   46   77:aload_0         
	//   47   78:astore_2        
		file2 = file;
	//   48   79:aload_0         
	//   49   80:astore_3        
		int j = ((FileInputStream) (file)).read(abyte0);
	//   50   81:aload_0         
	//   51   82:aload           5
	//   52   84:invokevirtual   #170 <Method int FileInputStream.read(byte[])>
	//   53   87:istore_1        
		if(j == -1)
			break; /* Loop/switch isn't completed */
	//   54   88:iload_1         
	//   55   89:iconst_m1       
	//   56   90:icmpeq          119
		file1 = file;
	//   57   93:aload_0         
	//   58   94:astore_2        
		file2 = file;
	//   59   95:aload_0         
	//   60   96:astore_3        
		stringbuilder.append(new String(abyte0, 0, j, "UTF-8"));
	//   61   97:aload           4
	//   62   99:new             #172 <Class String>
	//   63  102:dup             
	//   64  103:aload           5
	//   65  105:iconst_0        
	//   66  106:iload_1         
	//   67  107:ldc1            #174 <String "UTF-8">
	//   68  109:invokespecial   #177 <Method void String(byte[], int, int, String)>
	//   69  112:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   70  115:pop             
		if(true) goto _L2; else goto _L1
	//   71  116:goto            77
_L1:
		if(file != null)
	//*  72  119:aload_0         
	//*  73  120:ifnull          251
			try
			{
				((FileInputStream) (file)).close();
	//   74  123:aload_0         
	//   75  124:invokevirtual   #180 <Method void FileInputStream.close()>
			}
	//*  76  127:goto            251
			// Misplaced declaration of an exception variable
			catch(File file)
	//*  77  130:astore_0        
			{
				dho.f("EzPlugin_EzPluginHelper", new Object[] {
					"readFiletoData final IOException = ", ((IOException) (file)).getMessage()
				});
	//   78  131:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   79  133:iconst_2        
	//   80  134:anewarray       Object[]
	//   81  137:dup             
	//   82  138:iconst_0        
	//   83  139:ldc1            #182 <String "readFiletoData final IOException = ">
	//   84  141:aastore         
	//   85  142:dup             
	//   86  143:iconst_1        
	//   87  144:aload_0         
	//   88  145:invokevirtual   #185 <Method String IOException.getMessage()>
	//   89  148:aastore         
	//   90  149:invokestatic    #122 <Method void dho.f(String, Object[])>
			}
		break MISSING_BLOCK_LABEL_251;
	//   91  152:goto            251
		file;
	//   92  155:astore_0        
		file2 = file1;
	//   93  156:aload_2         
	//   94  157:astore_3        
		dho.f("EzPlugin_EzPluginHelper", new Object[] {
			"readFiletoData IOException = ", ((IOException) (file)).getMessage()
		});
	//   95  158:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   96  160:iconst_2        
	//   97  161:anewarray       Object[]
	//   98  164:dup             
	//   99  165:iconst_0        
	//  100  166:ldc1            #187 <String "readFiletoData IOException = ">
	//  101  168:aastore         
	//  102  169:dup             
	//  103  170:iconst_1        
	//  104  171:aload_0         
	//  105  172:invokevirtual   #185 <Method String IOException.getMessage()>
	//  106  175:aastore         
	//  107  176:invokestatic    #122 <Method void dho.f(String, Object[])>
		if(file1 != null)
	//* 108  179:aload_2         
	//* 109  180:ifnull          251
			try
			{
				((FileInputStream) (file1)).close();
	//  110  183:aload_2         
	//  111  184:invokevirtual   #180 <Method void FileInputStream.close()>
			}
	//* 112  187:goto            251
			// Misplaced declaration of an exception variable
			catch(File file)
	//* 113  190:astore_0        
			{
				dho.f("EzPlugin_EzPluginHelper", new Object[] {
					"readFiletoData final IOException = ", ((IOException) (file)).getMessage()
				});
	//  114  191:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//  115  193:iconst_2        
	//  116  194:anewarray       Object[]
	//  117  197:dup             
	//  118  198:iconst_0        
	//  119  199:ldc1            #182 <String "readFiletoData final IOException = ">
	//  120  201:aastore         
	//  121  202:dup             
	//  122  203:iconst_1        
	//  123  204:aload_0         
	//  124  205:invokevirtual   #185 <Method String IOException.getMessage()>
	//  125  208:aastore         
	//  126  209:invokestatic    #122 <Method void dho.f(String, Object[])>
			}
		break MISSING_BLOCK_LABEL_251;
	//  127  212:goto            251
		file;
	//  128  215:astore_0        
		if(file2 != null)
	//* 129  216:aload_3         
	//* 130  217:ifnull          249
			try
			{
				((FileInputStream) (file2)).close();
	//  131  220:aload_3         
	//  132  221:invokevirtual   #180 <Method void FileInputStream.close()>
			}
	//* 133  224:goto            249
			catch(IOException ioexception)
	//* 134  227:astore_2        
			{
				dho.f("EzPlugin_EzPluginHelper", new Object[] {
					"readFiletoData final IOException = ", ioexception.getMessage()
				});
	//  135  228:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//  136  230:iconst_2        
	//  137  231:anewarray       Object[]
	//  138  234:dup             
	//  139  235:iconst_0        
	//  140  236:ldc1            #182 <String "readFiletoData final IOException = ">
	//  141  238:aastore         
	//  142  239:dup             
	//  143  240:iconst_1        
	//  144  241:aload_2         
	//  145  242:invokevirtual   #185 <Method String IOException.getMessage()>
	//  146  245:aastore         
	//  147  246:invokestatic    #122 <Method void dho.f(String, Object[])>
			}
		throw file;
	//  148  249:aload_0         
	//  149  250:athrow          
		return stringbuilder.toString();
	//  150  251:aload           4
	//  151  253:invokevirtual   #78  <Method String StringBuilder.toString()>
	//  152  256:areturn         
	}

	static eav e(eap eap1, String s)
	{
		return eap1.n(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #192 <Method eav n(String)>
	//    3    5:areturn         
	}

	public static void e(FilenameFilter filenamefilter)
	{
		filenamefilter = ((FilenameFilter) ((new File(eas.b)).listFiles(filenamefilter)));
	//    0    0:new             #83  <Class File>
	//    1    3:dup             
	//    2    4:getstatic       #197 <Field String eas.b>
	//    3    7:invokespecial   #199 <Method void File(String)>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #202 <Method File[] File.listFiles(FilenameFilter)>
	//    6   14:astore_0        
		if(filenamefilter == null)
	//*   7   15:aload_0         
	//*   8   16:ifnonnull       20
			return;
	//    9   19:return          
		int i1 = filenamefilter.length;
	//   10   20:aload_0         
	//   11   21:arraylength     
	//   12   22:istore_2        
		for(int j = 0; j < i1; j++)
	//*  13   23:iconst_0        
	//*  14   24:istore_1        
	//*  15   25:iload_1         
	//*  16   26:iload_2         
	//*  17   27:icmpge          43
			b(((File) (filenamefilter[j])));
	//   18   30:aload_0         
	//   19   31:iload_1         
	//   20   32:aaload          
	//   21   33:invokestatic    #93  <Method void b(File)>

	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_1        
	//*  26   40:goto            25
	//   27   43:return          
	}

	private String f()
	{
		switch(_cls4.d[d.ordinal()])
	//*   0    0:getstatic       #60  <Field int[] eap$4.d>
	//*   1    3:aload_0         
	//*   2    4:getfield        #33  <Field eap$e d>
	//*   3    7:invokevirtual   #64  <Method int eap$e.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 39
	//	               2 62
	//	               3 85
	//*   6   36:goto            88
		case 1: // '\001'
			return (new StringBuilder()).append("index_language_").append(c).toString();
	//    7   39:new             #49  <Class StringBuilder>
	//    8   42:dup             
	//    9   43:invokespecial   #203 <Method void StringBuilder()>
	//   10   46:ldc1            #205 <String "index_language_">
	//   11   48:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   12   51:aload_0         
	//   13   52:getfield        #44  <Field String c>
	//   14   55:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   15   58:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   16   61:areturn         

		case 2: // '\002'
			return (new StringBuilder()).append("index_resources_").append(c).toString();
	//   17   62:new             #49  <Class StringBuilder>
	//   18   65:dup             
	//   19   66:invokespecial   #203 <Method void StringBuilder()>
	//   20   69:ldc1            #207 <String "index_resources_">
	//   21   71:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   22   74:aload_0         
	//   23   75:getfield        #44  <Field String c>
	//   24   78:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   25   81:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   26   84:areturn         

		case 3: // '\003'
			return "index_resources_common";
	//   27   85:ldc1            #209 <String "index_resources_common">
	//   28   87:areturn         
		}
		return "index";
	//   29   88:ldc1            #211 <String "index">
	//   30   90:areturn         
	}

	private String f(String s)
	{
		switch(_cls4.d[d.ordinal()])
	//*   0    0:getstatic       #60  <Field int[] eap$4.d>
	//*   1    3:aload_0         
	//*   2    4:getfield        #33  <Field eap$e d>
	//*   3    7:invokevirtual   #64  <Method int eap$e.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 39
	//	               2 71
	//	               3 71
	//*   6   36:goto            103
		case 1: // '\001'
			String s1 = s;
	//    7   39:aload_1         
	//    8   40:astore_2        
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   9   41:aload_1         
	//*  10   42:invokestatic    #39  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  11   45:ifeq            51
				s1 = "https://configserver-dra.platform.hicloud.com/servicesupport/updateserver/data/";
	//   12   48:ldc1            #213 <String "https://configserver-dra.platform.hicloud.com/servicesupport/updateserver/data/">
	//   13   50:astore_2        
			return (new StringBuilder()).append(s1).append("com.huawei.health_EzPlugin_Languages").toString();
	//   14   51:new             #49  <Class StringBuilder>
	//   15   54:dup             
	//   16   55:invokespecial   #203 <Method void StringBuilder()>
	//   17   58:aload_2         
	//   18   59:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   19   62:ldc1            #215 <String "com.huawei.health_EzPlugin_Languages">
	//   20   64:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   21   67:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   22   70:areturn         

		case 2: // '\002'
		case 3: // '\003'
			String s2 = s;
	//   23   71:aload_1         
	//   24   72:astore_2        
			if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  25   73:aload_1         
	//*  26   74:invokestatic    #39  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   77:ifeq            83
				s2 = "https://configserver-dra.platform.hicloud.com/servicesupport/updateserver/data/";
	//   28   80:ldc1            #213 <String "https://configserver-dra.platform.hicloud.com/servicesupport/updateserver/data/">
	//   29   82:astore_2        
			return (new StringBuilder()).append(s2).append("com.huawei.health_EzPlugin_Resources").toString();
	//   30   83:new             #49  <Class StringBuilder>
	//   31   86:dup             
	//   32   87:invokespecial   #203 <Method void StringBuilder()>
	//   33   90:aload_2         
	//   34   91:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   35   94:ldc1            #217 <String "com.huawei.health_EzPlugin_Resources">
	//   36   96:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   37   99:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   38  102:areturn         
		}
		String s3 = s;
	//   39  103:aload_1         
	//   40  104:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*  41  105:aload_1         
	//*  42  106:invokestatic    #39  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  43  109:ifeq            115
			s3 = "https://configserver.hicloud.com/servicesupport/updateserver/getLatestVersion";
	//   44  112:ldc1            #219 <String "https://configserver.hicloud.com/servicesupport/updateserver/getLatestVersion">
	//   45  114:astore_2        
		return s3;
	//   46  115:aload_2         
	//   47  116:areturn         
	}

	private String g()
	{
		String s = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		Object obj = ((Object) (eaq.d(e, "MD5")));
	//    2    2:aload_0         
	//    3    3:getfield        #128 <Field String e>
	//    4    6:ldc1            #222 <String "MD5">
	//    5    8:invokestatic    #227 <Method String eaq.d(String, String)>
	//    6   11:astore_2        
		if(obj != null)
	//*   7   12:aload_2         
	//*   8   13:ifnull          21
			s = ((String) (obj)).toLowerCase();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #230 <Method String String.toLowerCase()>
	//   11   20:astore_1        
		obj = ((Object) (new StringBuilder(128)));
	//   12   21:new             #49  <Class StringBuilder>
	//   13   24:dup             
	//   14   25:sipush          128
	//   15   28:invokespecial   #55  <Method void StringBuilder(int)>
	//   16   31:astore_2        
		((StringBuilder) (obj)).append(eas.b).append(f()).append(File.separator);
	//   17   32:aload_2         
	//   18   33:getstatic       #197 <Field String eas.b>
	//   19   36:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:aload_0         
	//   21   40:invokespecial   #232 <Method String f()>
	//   22   43:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:getstatic       #235 <Field String File.separator>
	//   24   49:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		((StringBuilder) (obj)).append(s).append(".json");
	//   26   53:aload_2         
	//   27   54:aload_1         
	//   28   55:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   29   58:ldc1            #237 <String ".json">
	//   30   60:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
		return ((StringBuilder) (obj)).toString();
	//   32   64:aload_2         
	//   33   65:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   34   68:areturn         
	}

	private StringBuilder g(String s)
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #49  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #55  <Method void StringBuilder(int)>
	//    4   10:astore_2        
		stringbuilder.append(eas.b).append(i(s)).append(File.separator);
	//    5   11:aload_2         
	//    6   12:getstatic       #197 <Field String eas.b>
	//    7   15:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #240 <Method String i(String)>
	//   11   23:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:getstatic       #235 <Field String File.separator>
	//   13   29:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
		return stringbuilder;
	//   15   33:aload_2         
	//   16   34:areturn         
	}

	private List h(String s)
	{
		HashMap hashmap = k;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field HashMap k>
	//    2    4:astore_2        
		hashmap;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		s = ((String) ((eat)k.get(((Object) (s)))));
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field HashMap k>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #246 <Method Object HashMap.get(Object)>
	//    9   15:checkcast       #248 <Class eat>
	//   10   18:astore_1        
		hashmap;
	//   11   19:aload_2         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		  goto _L1
	//*  13   21:goto            29
		s;
	//   14   24:astore_1        
	//*  15   25:aload_2         
		throw s;
	//   16   26:monitorexit     
	//   17   27:aload_1         
	//   18   28:athrow          
_L1:
		if(s == null)
	//*  19   29:aload_1         
	//*  20   30:ifnonnull       35
			return null;
	//   21   33:aconst_null     
	//   22   34:areturn         
		else
			return ((eat) (s)).d();
	//   23   35:aload_1         
	//   24   36:invokevirtual   #251 <Method List eat.d()>
	//   25   39:areturn         
	}

	private String i(String s)
	{
		switch(_cls4.d[d.ordinal()])
	//*   0    0:getstatic       #60  <Field int[] eap$4.d>
	//*   1    3:aload_0         
	//*   2    4:getfield        #33  <Field eap$e d>
	//*   3    7:invokevirtual   #64  <Method int eap$e.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:lookupswitch    2: default 36
	//	               1: 39
	//	               2: 39
	//*   6   36:goto            66
		case 1: // '\001'
		case 2: // '\002'
			return (new StringBuilder()).append(s).append("-").append(c).toString();
	//    7   39:new             #49  <Class StringBuilder>
	//    8   42:dup             
	//    9   43:invokespecial   #203 <Method void StringBuilder()>
	//   10   46:aload_1         
	//   11   47:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   12   50:ldc1            #255 <String "-">
	//   13   52:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   14   55:aload_0         
	//   15   56:getfield        #44  <Field String c>
	//   16   59:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   17   62:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   18   65:areturn         
		}
		return s;
	//   19   66:aload_1         
	//   20   67:areturn         
	}

	private String k()
	{
		switch(_cls4.d[d.ordinal()])
	//*   0    0:getstatic       #60  <Field int[] eap$4.d>
	//*   1    3:aload_0         
	//*   2    4:getfield        #33  <Field eap$e d>
	//*   3    7:invokevirtual   #64  <Method int eap$e.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 39
	//	               2 43
	//	               3 47
	//*   6   36:goto            51
		case 1: // '\001'
			return "plugin_index_languages_version";
	//    7   39:ldc2            #257 <String "plugin_index_languages_version">
	//    8   42:areturn         

		case 2: // '\002'
			return "plugin_index_resources_version";
	//    9   43:ldc2            #259 <String "plugin_index_resources_version">
	//   10   46:areturn         

		case 3: // '\003'
			return "plugin_index_resources_common";
	//   11   47:ldc2            #261 <String "plugin_index_resources_common">
	//   12   50:areturn         
		}
		return "plugin_index";
	//   13   51:ldc2            #263 <String "plugin_index">
	//   14   54:areturn         
	}

	private String k(String s)
	{
		s = ((String) (g(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #265 <Method StringBuilder g(String)>
	//    3    5:astore_1        
		((StringBuilder) (s)).append("description").append(".json");
	//    4    6:aload_1         
	//    5    7:ldc2            #267 <String "description">
	//    6   10:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:ldc1            #237 <String ".json">
	//    8   15:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		return ((StringBuilder) (s)).toString();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   12   23:areturn         
	}

	private List l()
	{
		String s = f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #232 <Method String f()>
	//    2    4:astore_1        
		List list = h(s);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #270 <Method List h(String)>
	//    6   10:astore_2        
		if(list != null)
	//*   7   11:aload_2         
	//*   8   12:ifnull          17
			return list;
	//    9   15:aload_2         
	//   10   16:areturn         
		if(!h())
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #272 <Method boolean h()>
	//*  13   21:ifne            26
			return null;
	//   14   24:aconst_null     
	//   15   25:areturn         
		else
			return h(s);
	//   16   26:aload_0         
	//   17   27:aload_1         
	//   18   28:invokespecial   #270 <Method List h(String)>
	//   19   31:areturn         
	}

	private boolean m(String s)
	{
		ear ear1 = d(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #278 <Method ear d(String)>
	//    3    5:astore_2        
		if(ear1 != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          45
		{
			if("Deprecated".equalsIgnoreCase(ear1.a()))
	//*   6   10:ldc2            #280 <String "Deprecated">
	//*   7   13:aload_2         
	//*   8   14:invokevirtual   #283 <Method String ear.a()>
	//*   9   17:invokevirtual   #286 <Method boolean String.equalsIgnoreCase(String)>
	//*  10   20:ifeq            64
			{
				dho.b("EzPlugin_EzPluginHelper", new Object[] {
					"this plugin is deprecated "
				});
	//   11   23:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   12   25:iconst_1        
	//   13   26:anewarray       Object[]
	//   14   29:dup             
	//   15   30:iconst_0        
	//   16   31:ldc2            #288 <String "this plugin is deprecated ">
	//   17   34:aastore         
	//   18   35:invokestatic    #116 <Method void dho.b(String, Object[])>
				o(s);
	//   19   38:aload_0         
	//   20   39:aload_1         
	//   21   40:invokespecial   #291 <Method void o(String)>
				return true;
	//   22   43:iconst_1        
	//   23   44:ireturn         
			}
		} else
		{
			dho.b("EzPlugin_EzPluginHelper", new Object[] {
				s, " is not exists"
			});
	//   24   45:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   25   47:iconst_2        
	//   26   48:anewarray       Object[]
	//   27   51:dup             
	//   28   52:iconst_0        
	//   29   53:aload_1         
	//   30   54:aastore         
	//   31   55:dup             
	//   32   56:iconst_1        
	//   33   57:ldc2            #293 <String " is not exists">
	//   34   60:aastore         
	//   35   61:invokestatic    #116 <Method void dho.b(String, Object[])>
		}
		return false;
	//   36   64:iconst_0        
	//   37   65:ireturn         
	}

	private eav n(String s)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		Boolean boolean1 = Boolean.valueOf(m(s));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #295 <Method boolean m(String)>
	//    5    7:invokestatic    #111 <Method Boolean Boolean.valueOf(boolean)>
	//    6   10:astore_3        
		dho.b("EzPlugin_EzPluginHelper", new Object[] {
			"isDeprecated is = ", boolean1
		});
	//    7   11:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//    8   13:iconst_2        
	//    9   14:anewarray       Object[]
	//   10   17:dup             
	//   11   18:iconst_0        
	//   12   19:ldc2            #297 <String "isDeprecated is = ">
	//   13   22:aastore         
	//   14   23:dup             
	//   15   24:iconst_1        
	//   16   25:aload_3         
	//   17   26:aastore         
	//   18   27:invokestatic    #116 <Method void dho.b(String, Object[])>
		if(!boolean1.booleanValue())
	//*  19   30:aload_3         
	//*  20   31:invokevirtual   #300 <Method boolean Boolean.booleanValue()>
	//*  21   34:ifne            158
		{
			if(!e())
	//*  22   37:aload_0         
	//*  23   38:invokevirtual   #302 <Method boolean e()>
	//*  24   41:ifne            118
			{
				obj = ((Object) (d(s)));
	//   25   44:aload_0         
	//   26   45:aload_1         
	//   27   46:invokevirtual   #278 <Method ear d(String)>
	//   28   49:astore_2        
				if(obj != null)
	//*  29   50:aload_2         
	//*  30   51:ifnull          118
				{
					s = ((String) (new eav()));
	//   31   54:new             #304 <Class eav>
	//   32   57:dup             
	//   33   58:invokespecial   #305 <Method void eav()>
	//   34   61:astore_1        
					((eav) (s)).g("Resource");
	//   35   62:aload_1         
	//   36   63:ldc2            #307 <String "Resource">
	//   37   66:invokevirtual   #309 <Method void eav.g(String)>
					((eav) (s)).b(((ear) (obj)).d());
	//   38   69:aload_1         
	//   39   70:aload_2         
	//   40   71:invokevirtual   #311 <Method String ear.d()>
	//   41   74:invokevirtual   #313 <Method void eav.b(String)>
					((eav) (s)).e(((ear) (obj)).a());
	//   42   77:aload_1         
	//   43   78:aload_2         
	//   44   79:invokevirtual   #283 <Method String ear.a()>
	//   45   82:invokevirtual   #315 <Method void eav.e(String)>
					((eav) (s)).d(((ear) (obj)).c());
	//   46   85:aload_1         
	//   47   86:aload_2         
	//   48   87:invokevirtual   #317 <Method String ear.c()>
	//   49   90:invokevirtual   #319 <Method void eav.d(String)>
					((eav) (s)).c(((ear) (obj)).i());
	//   50   93:aload_1         
	//   51   94:aload_2         
	//   52   95:invokevirtual   #321 <Method int ear.i()>
	//   53   98:invokevirtual   #323 <Method void eav.c(int)>
					((eav) (s)).k(((ear) (obj)).k());
	//   54  101:aload_1         
	//   55  102:aload_2         
	//   56  103:invokevirtual   #325 <Method String ear.k()>
	//   57  106:invokevirtual   #327 <Method void eav.k(String)>
					((eav) (s)).f("2");
	//   58  109:aload_1         
	//   59  110:ldc2            #329 <String "2">
	//   60  113:invokevirtual   #331 <Method void eav.f(String)>
					return ((eav) (s));
	//   61  116:aload_1         
	//   62  117:areturn         
				}
			}
			s = e(new File(k(s)));
	//   63  118:new             #83  <Class File>
	//   64  121:dup             
	//   65  122:aload_0         
	//   66  123:aload_1         
	//   67  124:invokespecial   #333 <Method String k(String)>
	//   68  127:invokespecial   #199 <Method void File(String)>
	//   69  130:invokestatic    #335 <Method String e(File)>
	//   70  133:astore_1        
			dho.b("EzPlugin_EzPluginHelper", new Object[] {
				"descriptionJson = ", s
			});
	//   71  134:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   72  136:iconst_2        
	//   73  137:anewarray       Object[]
	//   74  140:dup             
	//   75  141:iconst_0        
	//   76  142:ldc2            #337 <String "descriptionJson = ">
	//   77  145:aastore         
	//   78  146:dup             
	//   79  147:iconst_1        
	//   80  148:aload_1         
	//   81  149:aastore         
	//   82  150:invokestatic    #116 <Method void dho.b(String, Object[])>
			obj = ((Object) (eao.b(s)));
	//   83  153:aload_1         
	//   84  154:invokestatic    #341 <Method eav eao.b(String)>
	//   85  157:astore_2        
		}
		return ((eav) (obj));
	//   86  158:aload_2         
	//   87  159:areturn         
	}

	private void o(String s)
	{
		Object obj = ((Object) (p(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #344 <Method String p(String)>
	//    3    5:astore_2        
		File file = new File(((String) (obj)));
	//    4    6:new             #83  <Class File>
	//    5    9:dup             
	//    6   10:aload_2         
	//    7   11:invokespecial   #199 <Method void File(String)>
	//    8   14:astore_3        
		if(file.exists())
	//*   9   15:aload_3         
	//*  10   16:invokevirtual   #347 <Method boolean File.exists()>
	//*  11   19:ifeq            51
			dho.b("EzPlugin_EzPluginHelper", new Object[] {
				obj, " isDeleteDone is = ", Boolean.valueOf(file.delete())
			});
	//   12   22:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   13   24:iconst_3        
	//   14   25:anewarray       Object[]
	//   15   28:dup             
	//   16   29:iconst_0        
	//   17   30:aload_2         
	//   18   31:aastore         
	//   19   32:dup             
	//   20   33:iconst_1        
	//   21   34:ldc2            #349 <String " isDeleteDone is = ">
	//   22   37:aastore         
	//   23   38:dup             
	//   24   39:iconst_2        
	//   25   40:aload_3         
	//   26   41:invokevirtual   #96  <Method boolean File.delete()>
	//   27   44:invokestatic    #111 <Method Boolean Boolean.valueOf(boolean)>
	//   28   47:aastore         
	//   29   48:invokestatic    #116 <Method void dho.b(String, Object[])>
		s = k(s);
	//   30   51:aload_0         
	//   31   52:aload_1         
	//   32   53:invokespecial   #333 <Method String k(String)>
	//   33   56:astore_1        
		obj = ((Object) (new File(s)));
	//   34   57:new             #83  <Class File>
	//   35   60:dup             
	//   36   61:aload_1         
	//   37   62:invokespecial   #199 <Method void File(String)>
	//   38   65:astore_2        
		if(((File) (obj)).exists())
	//*  39   66:aload_2         
	//*  40   67:invokevirtual   #347 <Method boolean File.exists()>
	//*  41   70:ifeq            102
			dho.b("EzPlugin_EzPluginHelper", new Object[] {
				s, " isDeleteDescrption is = ", Boolean.valueOf(((File) (obj)).delete())
			});
	//   42   73:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   43   75:iconst_3        
	//   44   76:anewarray       Object[]
	//   45   79:dup             
	//   46   80:iconst_0        
	//   47   81:aload_1         
	//   48   82:aastore         
	//   49   83:dup             
	//   50   84:iconst_1        
	//   51   85:ldc2            #351 <String " isDeleteDescrption is = ">
	//   52   88:aastore         
	//   53   89:dup             
	//   54   90:iconst_2        
	//   55   91:aload_2         
	//   56   92:invokevirtual   #96  <Method boolean File.delete()>
	//   57   95:invokestatic    #111 <Method Boolean Boolean.valueOf(boolean)>
	//   58   98:aastore         
	//   59   99:invokestatic    #116 <Method void dho.b(String, Object[])>
	//   60  102:return          
	}

	private String p(String s)
	{
		s = ((String) (g(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #265 <Method StringBuilder g(String)>
	//    3    5:astore_1        
		((StringBuilder) (s)).append("done");
	//    4    6:aload_1         
	//    5    7:ldc2            #353 <String "done">
	//    6   10:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		return ((StringBuilder) (s)).toString();
	//    8   14:aload_1         
	//    9   15:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   10   18:areturn         
	}

	private boolean p()
	{
		switch(_cls4.d[d.ordinal()])
	//*   0    0:getstatic       #60  <Field int[] eap$4.d>
	//*   1    3:aload_0         
	//*   2    4:getfield        #33  <Field eap$e d>
	//*   3    7:invokevirtual   #64  <Method int eap$e.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 38
	//	               2 38
	//	               3 38
		default:
			return true;
	//    6   36:iconst_1        
	//    7   37:ireturn         

		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			return false;
	//    8   38:iconst_0        
	//    9   39:ireturn         
		}
	}

	public String a()
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field String c>
	//*   2    4:ifnull          12
			return c;
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field String c>
	//    5   11:areturn         
		String s1 = dbf.h(BaseApplication.a());
	//    6   12:invokestatic    #358 <Method android.content.Context BaseApplication.a()>
	//    7   15:invokestatic    #363 <Method String dbf.h(android.content.Context)>
	//    8   18:astore_3        
		int j = s1.indexOf("-");
	//    9   19:aload_3         
	//   10   20:ldc1            #255 <String "-">
	//   11   22:invokevirtual   #367 <Method int String.indexOf(String)>
	//   12   25:istore_1        
		String s = s1;
	//   13   26:aload_3         
	//   14   27:astore_2        
		if(j >= 0)
	//*  15   28:iload_1         
	//*  16   29:iflt            39
			s = s1.substring(0, j);
	//   17   32:aload_3         
	//   18   33:iconst_0        
	//   19   34:iload_1         
	//   20   35:invokevirtual   #371 <Method String String.substring(int, int)>
	//   21   38:astore_2        
		return s;
	//   22   39:aload_2         
	//   23   40:areturn         
	}

	public void a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #130 <Field String a>
	//    3    5:return          
	}

	public void a(String s, eaz eaz1)
	{
		dho.b("EzPlugin_EzPluginHelper", new Object[] {
			"updatePlugin indexType=", d, ", version=", c, ", uuid=", s
		});
	//    0    0:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//    1    2:bipush          6
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:ldc2            #373 <String "updatePlugin indexType=">
	//    6   12:aastore         
	//    7   13:dup             
	//    8   14:iconst_1        
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field eap$e d>
	//   11   19:aastore         
	//   12   20:dup             
	//   13   21:iconst_2        
	//   14   22:ldc1            #142 <String ", version=">
	//   15   24:aastore         
	//   16   25:dup             
	//   17   26:iconst_3        
	//   18   27:aload_0         
	//   19   28:getfield        #44  <Field String c>
	//   20   31:aastore         
	//   21   32:dup             
	//   22   33:iconst_4        
	//   23   34:ldc1            #144 <String ", uuid=">
	//   24   36:aastore         
	//   25   37:dup             
	//   26   38:iconst_5        
	//   27   39:aload_1         
	//   28   40:aastore         
	//   29   41:invokestatic    #116 <Method void dho.b(String, Object[])>
		eav eav1 = n(s);
	//   30   44:aload_0         
	//   31   45:aload_1         
	//   32   46:invokespecial   #192 <Method eav n(String)>
	//   33   49:astore_3        
		if(eav1 != null)
	//*  34   50:aload_3         
	//*  35   51:ifnull          106
		{
			dho.b("EzPlugin_EzPluginHelper", new Object[] {
				"pluginUrl is = ", e
			});
	//   36   54:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   37   56:iconst_2        
	//   38   57:anewarray       Object[]
	//   39   60:dup             
	//   40   61:iconst_0        
	//   41   62:ldc2            #375 <String "pluginUrl is = ">
	//   42   65:aastore         
	//   43   66:dup             
	//   44   67:iconst_1        
	//   45   68:aload_0         
	//   46   69:getfield        #128 <Field String e>
	//   47   72:aastore         
	//   48   73:invokestatic    #116 <Method void dho.b(String, Object[])>
			String s1 = g(s).toString();
	//   49   76:aload_0         
	//   50   77:aload_1         
	//   51   78:invokespecial   #265 <Method StringBuilder g(String)>
	//   52   81:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   53   84:astore          4
			eax.b().b(s, e, s1, a, eav1, eaz1);
	//   54   86:invokestatic    #380 <Method eax eax.b()>
	//   55   89:aload_1         
	//   56   90:aload_0         
	//   57   91:getfield        #128 <Field String e>
	//   58   94:aload           4
	//   59   96:aload_0         
	//   60   97:getfield        #130 <Field String a>
	//   61  100:aload_3         
	//   62  101:aload_2         
	//   63  102:invokevirtual   #383 <Method void eax.b(String, String, String, String, eav, eaz)>
			return;
	//   64  105:return          
		} else
		{
			d(s, ((eaz) (new _cls3(s, eaz1))));
	//   65  106:aload_0         
	//   66  107:aload_1         
	//   67  108:new             #385 <Class eap$3>
	//   68  111:dup             
	//   69  112:aload_0         
	//   70  113:aload_1         
	//   71  114:aload_2         
	//   72  115:invokespecial   #386 <Method void eap$3(eap, String, eaz)>
	//   73  118:invokespecial   #388 <Method void d(String, eaz)>
			return;
	//   74  121:return          
		}
	}

	public void a(eaz eaz1)
	{
		dho.b("EzPlugin_EzPluginHelper", new Object[] {
			"updateIndex indexType=", d, ", version=", c
		});
	//    0    0:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//    1    2:iconst_4        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:ldc2            #390 <String "updateIndex indexType=">
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #33  <Field eap$e d>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:ldc1            #142 <String ", version=">
	//   15   23:aastore         
	//   16   24:dup             
	//   17   25:iconst_3        
	//   18   26:aload_0         
	//   19   27:getfield        #44  <Field String c>
	//   20   30:aastore         
	//   21   31:invokestatic    #116 <Method void dho.b(String, Object[])>
		String s = k();
	//   22   34:aload_0         
	//   23   35:invokespecial   #391 <Method String k()>
	//   24   38:astore_2        
		String s1 = g();
	//   25   39:aload_0         
	//   26   40:invokespecial   #393 <Method String g()>
	//   27   43:astore_3        
		dho.b("EzPlugin_EzPluginHelper", new Object[] {
			"updateIndex plugin_down_url=", e, ", savePath=", s1
		});
	//   28   44:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   29   46:iconst_4        
	//   30   47:anewarray       Object[]
	//   31   50:dup             
	//   32   51:iconst_0        
	//   33   52:ldc2            #395 <String "updateIndex plugin_down_url=">
	//   34   55:aastore         
	//   35   56:dup             
	//   36   57:iconst_1        
	//   37   58:aload_0         
	//   38   59:getfield        #128 <Field String e>
	//   39   62:aastore         
	//   40   63:dup             
	//   41   64:iconst_2        
	//   42   65:ldc2            #397 <String ", savePath=">
	//   43   68:aastore         
	//   44   69:dup             
	//   45   70:iconst_3        
	//   46   71:aload_3         
	//   47   72:aastore         
	//   48   73:invokestatic    #116 <Method void dho.b(String, Object[])>
		eax.b().a(s, e, s1, a, eaz1);
	//   49   76:invokestatic    #380 <Method eax eax.b()>
	//   50   79:aload_2         
	//   51   80:aload_0         
	//   52   81:getfield        #128 <Field String e>
	//   53   84:aload_3         
	//   54   85:aload_0         
	//   55   86:getfield        #130 <Field String a>
	//   56   89:aload_1         
	//   57   90:invokevirtual   #400 <Method void eax.a(String, String, String, String, eaz)>
	//   58   93:return          
	}

	public String b(String s)
	{
		StringBuilder stringbuilder = g(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #265 <Method StringBuilder g(String)>
	//    3    5:astore_2        
		if(!p())
	//*   4    6:aload_0         
	//*   5    7:invokespecial   #402 <Method boolean p()>
	//*   6   10:ifne            44
		{
			s = ((String) (n(s)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokespecial   #192 <Method eav n(String)>
	//   10   18:astore_1        
			if(s == null || TextUtils.isEmpty(((CharSequence) (((eav) (s)).k()))))
	//*  11   19:aload_1         
	//*  12   20:ifnull          33
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #403 <Method String eav.k()>
	//*  15   27:invokestatic    #39  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   30:ifeq            35
				return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
			stringbuilder.append(((eav) (s)).k());
	//   19   35:aload_2         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #403 <Method String eav.k()>
	//   22   40:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
		}
		return stringbuilder.toString();
	//   24   44:aload_2         
	//   25   45:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   26   48:areturn         
	}

	public e b()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field eap$e d>
	//    2    4:areturn         
	}

	public String c(String s, String s1)
	{
		String s2 = f(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #126 <Method String f(String)>
	//    3    5:astore_3        
		StringBuilder stringbuilder = new StringBuilder(128);
	//    4    6:new             #49  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:sipush          128
	//    7   13:invokespecial   #55  <Method void StringBuilder(int)>
	//    8   16:astore          4
		s1 = a(s1, stringbuilder);
	//    9   18:aload_0         
	//   10   19:aload_2         
	//   11   20:aload           4
	//   12   22:invokespecial   #406 <Method String a(String, StringBuilder)>
	//   13   25:astore_2        
		s = s2;
	//   14   26:aload_3         
	//   15   27:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
	//*  16   28:aload_2         
	//*  17   29:invokestatic    #39  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   32:ifne            63
		{
			stringbuilder.setLength(0);
	//   19   35:aload           4
	//   20   37:iconst_0        
	//   21   38:invokevirtual   #53  <Method void StringBuilder.setLength(int)>
			stringbuilder.append(s2).append('?').append(s1);
	//   22   41:aload           4
	//   23   43:aload_3         
	//   24   44:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:bipush          63
	//   26   49:invokevirtual   #73  <Method StringBuilder StringBuilder.append(char)>
	//   27   52:aload_2         
	//   28   53:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   29   56:pop             
			s = stringbuilder.toString();
	//   30   57:aload           4
	//   31   59:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   32   62:astore_1        
		}
		if(e.compareToIgnoreCase(s) != 0)
	//*  33   63:aload_0         
	//*  34   64:getfield        #128 <Field String e>
	//*  35   67:aload_1         
	//*  36   68:invokevirtual   #409 <Method int String.compareToIgnoreCase(String)>
	//*  37   71:ifeq            79
			c(s);
	//   38   74:aload_0         
	//   39   75:aload_1         
	//   40   76:invokespecial   #411 <Method void c(String)>
		return s1;
	//   41   79:aload_2         
	//   42   80:areturn         
	}

	public void c()
	{
		c(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #411 <Method void c(String)>
	//    3    5:return          
	}

	public ear d(String s)
	{
		List list = l();
	//    0    0:aload_0         
	//    1    1:invokespecial   #413 <Method List l()>
	//    2    4:astore_3        
		if(list != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          55
		{
			for(int j = 0; j < list.size(); j++)
	//*   5    9:iconst_0        
	//*   6   10:istore_2        
	//*   7   11:iload_2         
	//*   8   12:aload_3         
	//*   9   13:invokeinterface #418 <Method int List.size()>
	//*  10   18:icmpge          55
			{
				ear ear1 = (ear)list.get(j);
	//   11   21:aload_3         
	//   12   22:iload_2         
	//   13   23:invokeinterface #421 <Method Object List.get(int)>
	//   14   28:checkcast       #282 <Class ear>
	//   15   31:astore          4
				if(s.equals(((Object) (ear1.d()))))
	//*  16   33:aload_1         
	//*  17   34:aload           4
	//*  18   36:invokevirtual   #311 <Method String ear.d()>
	//*  19   39:invokevirtual   #425 <Method boolean String.equals(Object)>
	//*  20   42:ifeq            48
					return ear1;
	//   21   45:aload           4
	//   22   47:areturn         
			}

	//   23   48:iload_2         
	//   24   49:iconst_1        
	//   25   50:iadd            
	//   26   51:istore_2        
		}
	//*  27   52:goto            11
		return null;
	//   28   55:aconst_null     
	//   29   56:areturn         
	}

	public void d(boolean flag)
	{
		b = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #132 <Field boolean b>
	//    3    5:return          
	}

	public boolean d()
	{
		return e.d != d;
	//    0    0:getstatic       #21  <Field eap$e eap$e.d>
	//    1    3:aload_0         
	//    2    4:getfield        #33  <Field eap$e d>
	//    3    7:if_acmpeq       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public void e(String s, eaz eaz1)
	{
		dho.b("EzPlugin_EzPluginHelper", new Object[] {
			"downloadDescription indexType=", d, ", version=", c, ", uuid=", s
		});
	//    0    0:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//    1    2:bipush          6
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:ldc2            #428 <String "downloadDescription indexType=">
	//    6   12:aastore         
	//    7   13:dup             
	//    8   14:iconst_1        
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field eap$e d>
	//   11   19:aastore         
	//   12   20:dup             
	//   13   21:iconst_2        
	//   14   22:ldc1            #142 <String ", version=">
	//   15   24:aastore         
	//   16   25:dup             
	//   17   26:iconst_3        
	//   18   27:aload_0         
	//   19   28:getfield        #44  <Field String c>
	//   20   31:aastore         
	//   21   32:dup             
	//   22   33:iconst_4        
	//   23   34:ldc1            #144 <String ", uuid=">
	//   24   36:aastore         
	//   25   37:dup             
	//   26   38:iconst_5        
	//   27   39:aload_1         
	//   28   40:aastore         
	//   29   41:invokestatic    #116 <Method void dho.b(String, Object[])>
		if(!m(s))
	//*  30   44:aload_0         
	//*  31   45:aload_1         
	//*  32   46:invokespecial   #295 <Method boolean m(String)>
	//*  33   49:ifne            74
		{
			eax.b().b(s, e, k(s), a, eaz1);
	//   34   52:invokestatic    #380 <Method eax eax.b()>
	//   35   55:aload_1         
	//   36   56:aload_0         
	//   37   57:getfield        #128 <Field String e>
	//   38   60:aload_0         
	//   39   61:aload_1         
	//   40   62:invokespecial   #333 <Method String k(String)>
	//   41   65:aload_0         
	//   42   66:getfield        #130 <Field String a>
	//   43   69:aload_2         
	//   44   70:invokevirtual   #430 <Method void eax.b(String, String, String, String, eaz)>
			return;
	//   45   73:return          
		}
		s = ((String) (new eba()));
	//   46   74:new             #432 <Class eba>
	//   47   77:dup             
	//   48   78:invokespecial   #433 <Method void eba()>
	//   49   81:astore_1        
		eay eay1 = new eay();
	//   50   82:new             #435 <Class eay>
	//   51   85:dup             
	//   52   86:invokespecial   #436 <Method void eay()>
	//   53   89:astore_3        
		s.c = -5;
	//   54   90:aload_1         
	//   55   91:bipush          -5
	//   56   93:putfield        #439 <Field int eba.c>
		if(eaz1 != null)
	//*  57   96:aload_2         
	//*  58   97:ifnull          108
			eaz1.onPullingChange(eay1, ((eba) (s)));
	//   59  100:aload_2         
	//   60  101:aload_3         
	//   61  102:aload_1         
	//   62  103:invokeinterface #445 <Method void eaz.onPullingChange(eay, eba)>
	//   63  108:return          
	}

	public boolean e()
	{
		return e.a != d && e.c != d;
	//    0    0:getstatic       #447 <Field eap$e eap$e.a>
	//    1    3:aload_0         
	//    2    4:getfield        #33  <Field eap$e d>
	//    3    7:if_acmpeq       22
	//    4   10:getstatic       #449 <Field eap$e eap$e.c>
	//    5   13:aload_0         
	//    6   14:getfield        #33  <Field eap$e d>
	//    7   17:if_acmpeq       22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public boolean e(String s)
	{
		boolean flag = m(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #295 <Method boolean m(String)>
	//    3    5:istore_2        
		dho.b("EzPlugin_EzPluginHelper", new Object[] {
			"isDeprecated is = ", Boolean.valueOf(flag)
		});
	//    4    6:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//    5    8:iconst_2        
	//    6    9:anewarray       Object[]
	//    7   12:dup             
	//    8   13:iconst_0        
	//    9   14:ldc2            #297 <String "isDeprecated is = ">
	//   10   17:aastore         
	//   11   18:dup             
	//   12   19:iconst_1        
	//   13   20:iload_2         
	//   14   21:invokestatic    #111 <Method Boolean Boolean.valueOf(boolean)>
	//   15   24:aastore         
	//   16   25:invokestatic    #116 <Method void dho.b(String, Object[])>
		if(!flag)
	//*  17   28:iload_2         
	//*  18   29:ifne            136
		{
			if(!e())
	//*  19   32:aload_0         
	//*  20   33:invokevirtual   #302 <Method boolean e()>
	//*  21   36:ifne            41
				return false;
	//   22   39:iconst_0        
	//   23   40:ireturn         
			String s1 = p(s);
	//   24   41:aload_0         
	//   25   42:aload_1         
	//   26   43:invokespecial   #344 <Method String p(String)>
	//   27   46:astore_3        
			dho.b("EzPlugin_EzPluginHelper", new Object[] {
				"done_path is = ", s1
			});
	//   28   47:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   29   49:iconst_2        
	//   30   50:anewarray       Object[]
	//   31   53:dup             
	//   32   54:iconst_0        
	//   33   55:ldc2            #451 <String "done_path is = ">
	//   34   58:aastore         
	//   35   59:dup             
	//   36   60:iconst_1        
	//   37   61:aload_3         
	//   38   62:aastore         
	//   39   63:invokestatic    #116 <Method void dho.b(String, Object[])>
			if((new File(s1)).exists())
	//*  40   66:new             #83  <Class File>
	//*  41   69:dup             
	//*  42   70:aload_3         
	//*  43   71:invokespecial   #199 <Method void File(String)>
	//*  44   74:invokevirtual   #347 <Method boolean File.exists()>
	//*  45   77:ifeq            136
			{
				s = k(s);
	//   46   80:aload_0         
	//   47   81:aload_1         
	//   48   82:invokespecial   #333 <Method String k(String)>
	//   49   85:astore_1        
				dho.b("EzPlugin_EzPluginHelper", new Object[] {
					"descrption_path is = ", s
				});
	//   50   86:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   51   88:iconst_2        
	//   52   89:anewarray       Object[]
	//   53   92:dup             
	//   54   93:iconst_0        
	//   55   94:ldc2            #453 <String "descrption_path is = ">
	//   56   97:aastore         
	//   57   98:dup             
	//   58   99:iconst_1        
	//   59  100:aload_1         
	//   60  101:aastore         
	//   61  102:invokestatic    #116 <Method void dho.b(String, Object[])>
				if((new File(s)).exists())
	//*  62  105:new             #83  <Class File>
	//*  63  108:dup             
	//*  64  109:aload_1         
	//*  65  110:invokespecial   #199 <Method void File(String)>
	//*  66  113:invokevirtual   #347 <Method boolean File.exists()>
	//*  67  116:ifeq            136
				{
					dho.b("EzPlugin_EzPluginHelper", new Object[] {
						"the plugin avaiable"
					});
	//   68  119:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   69  121:iconst_1        
	//   70  122:anewarray       Object[]
	//   71  125:dup             
	//   72  126:iconst_0        
	//   73  127:ldc2            #455 <String "the plugin avaiable">
	//   74  130:aastore         
	//   75  131:invokestatic    #116 <Method void dho.b(String, Object[])>
					return true;
	//   76  134:iconst_1        
	//   77  135:ireturn         
				}
			}
		}
		dho.b("EzPlugin_EzPluginHelper", new Object[] {
			"the plugin not avaiable"
		});
	//   78  136:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   79  138:iconst_1        
	//   80  139:anewarray       Object[]
	//   81  142:dup             
	//   82  143:iconst_0        
	//   83  144:ldc2            #457 <String "the plugin not avaiable">
	//   84  147:aastore         
	//   85  148:invokestatic    #116 <Method void dho.b(String, Object[])>
		return false;
	//   86  151:iconst_0        
	//   87  152:ireturn         
	}

	public boolean h()
	{
		Object obj = ((Object) (new File(g())));
	//    0    0:new             #83  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #393 <Method String g()>
	//    4    8:invokespecial   #199 <Method void File(String)>
	//    5   11:astore_1        
		if(!((File) (obj)).exists())
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #347 <Method boolean File.exists()>
	//*   8   16:ifne            43
		{
			dho.e("EzPlugin_EzPluginHelper", new Object[] {
				((File) (obj)).getAbsolutePath(), " is not exist."
			});
	//    9   19:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   10   21:iconst_2        
	//   11   22:anewarray       Object[]
	//   12   25:dup             
	//   13   26:iconst_0        
	//   14   27:aload_1         
	//   15   28:invokevirtual   #162 <Method String File.getAbsolutePath()>
	//   16   31:aastore         
	//   17   32:dup             
	//   18   33:iconst_1        
	//   19   34:ldc2            #459 <String " is not exist.">
	//   20   37:aastore         
	//   21   38:invokestatic    #461 <Method void dho.e(String, Object[])>
			return false;
	//   22   41:iconst_0        
	//   23   42:ireturn         
		} else
		{
			obj = ((Object) (e(((File) (obj)))));
	//   24   43:aload_1         
	//   25   44:invokestatic    #335 <Method String e(File)>
	//   26   47:astore_1        
			dho.b("EzPlugin_EzPluginHelper", new Object[] {
				"updateIndexCache indexJson = ", obj
			});
	//   27   48:ldc1            #98  <String "EzPlugin_EzPluginHelper">
	//   28   50:iconst_2        
	//   29   51:anewarray       Object[]
	//   30   54:dup             
	//   31   55:iconst_0        
	//   32   56:ldc2            #463 <String "updateIndexCache indexJson = ">
	//   33   59:aastore         
	//   34   60:dup             
	//   35   61:iconst_1        
	//   36   62:aload_1         
	//   37   63:aastore         
	//   38   64:invokestatic    #116 <Method void dho.b(String, Object[])>
			d(f(), eao.a(((String) (obj))));
	//   39   67:aload_0         
	//   40   68:aload_0         
	//   41   69:invokespecial   #232 <Method String f()>
	//   42   72:aload_1         
	//   43   73:invokestatic    #466 <Method eat eao.a(String)>
	//   44   76:invokespecial   #468 <Method void d(String, eat)>
			return true;
	//   45   79:iconst_1        
	//   46   80:ireturn         
		}
	}

	public boolean i()
	{
		return b && e.d != b();
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field boolean b>
	//    2    4:ifeq            19
	//    3    7:getstatic       #21  <Field eap$e eap$e.d>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #470 <Method eap$e b()>
	//    6   14:if_acmpeq       19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private String a;
	private boolean b;
	private final String c;
	private final e d;
	private String e;
	private final HashMap k;

	/* member class not found */
	class _cls4 {}


	/* member class not found */
	class _cls5 {}


	/* member class not found */
	class _cls3 {}

}
