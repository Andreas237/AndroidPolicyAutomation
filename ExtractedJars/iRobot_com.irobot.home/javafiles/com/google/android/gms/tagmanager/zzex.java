// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.internal.measurement.*;
import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzah, zzda, zzdi, zzez, 
//			zzey, zzdh, zzeh, zzcz

final class zzex
	implements zzah
{

	zzex(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		zzri = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context zzri>
		zzazq = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field String zzazq>
	//    8   14:aload_0         
	//    9   15:invokestatic    #30  <Method ExecutorService Executors.newSingleThreadExecutor()>
	//   10   18:putfield        #32  <Field ExecutorService zzadl>
	//   11   21:return          
	}

	private static zzrk zza(ByteArrayOutputStream bytearrayoutputstream)
	{
		try
		{
			bytearrayoutputstream = ((ByteArrayOutputStream) (zzda.zzdv(bytearrayoutputstream.toString("UTF-8"))));
	//    0    0:aload_0         
	//    1    1:ldc1            #41  <String "UTF-8">
	//    2    3:invokevirtual   #47  <Method String ByteArrayOutputStream.toString(String)>
	//    3    6:invokestatic    #53  <Method zzrk zzda.zzdv(String)>
	//    4    9:astore_0        
		}
	//*   5   10:aload_0         
	//*   6   11:areturn         
	//*   7   12:ldc1            #55  <String "Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container">
	//*   8   14:invokestatic    #61  <Method void zzdi.zzab(String)>
	//*   9   17:aconst_null     
	//*  10   18:areturn         
	//*  11   19:ldc1            #63  <String "Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.">
	//*  12   21:invokestatic    #66  <Method void zzdi.zzdn(String)>
	//*  13   24:aconst_null     
	//*  14   25:areturn         
		// Misplaced declaration of an exception variable
		catch(ByteArrayOutputStream bytearrayoutputstream)
		{
			zzdi.zzdn("Failed to convert binary resource to string for JSON parsing; the file format is not UTF-8 format.");
			return null;
		}
	//*  15   26:astore_0        
	//*  16   27:goto            19
		// Misplaced declaration of an exception variable
		catch(ByteArrayOutputStream bytearrayoutputstream)
		{
			zzdi.zzab("Failed to extract the container from the resource file. Resource is a UTF-8 encoded string but doesn't contain a JSON container");
			return null;
		}
		return ((zzrk) (bytearrayoutputstream));
	//*  17   30:astore_0        
	//*  18   31:goto            12
	}

	private static zzrk zze(byte abyte0[])
	{
		try
		{
			abyte0 = ((byte []) (zzrg.zza((zzl)zzyi.zza(((zzyi) (new zzl())), abyte0))));
	//    0    0:new             #74  <Class zzl>
	//    1    3:dup             
	//    2    4:invokespecial   #75  <Method void zzl()>
	//    3    7:aload_0         
	//    4    8:invokestatic    #80  <Method zzyi zzyi.zza(zzyi, byte[])>
	//    5   11:checkcast       #74  <Class zzl>
	//    6   14:invokestatic    #85  <Method zzrk zzrg.zza(zzl)>
	//    7   17:astore_0        
		}
	//*   8   18:aload_0         
	//*   9   19:ifnull          27
	//*  10   22:ldc1            #87  <String "The container was successfully loaded from the resource (using binary file)">
	//*  11   24:invokestatic    #90  <Method void zzdi.v(String)>
	//*  12   27:aload_0         
	//*  13   28:areturn         
	//*  14   29:ldc1            #92  <String "The resource file is invalid. The container from the binary file is invalid">
	//*  15   31:invokestatic    #61  <Method void zzdi.zzab(String)>
	//*  16   34:aconst_null     
	//*  17   35:areturn         
	//*  18   36:ldc1            #94  <String "The resource file is corrupted. The container cannot be extracted from the binary file">
	//*  19   38:invokestatic    #97  <Method void zzdi.e(String)>
	//*  20   41:aconst_null     
	//*  21   42:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			zzdi.e("The resource file is corrupted. The container cannot be extracted from the binary file");
			return null;
		}
	//*  22   43:astore_0        
	//*  23   44:goto            36
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			zzdi.zzab("The resource file is invalid. The container from the binary file is invalid");
			return null;
		}
		if(abyte0 == null)
			break MISSING_BLOCK_LABEL_27;
		zzdi.v("The container was successfully loaded from the resource (using binary file)");
		return ((zzrk) (abyte0));
	//*  24   47:astore_0        
	//*  25   48:goto            29
	}

	private final File zzps()
	{
		String s = String.valueOf("resource_");
	//    0    0:ldc1            #102 <String "resource_">
	//    1    2:invokestatic    #108 <Method String String.valueOf(Object)>
	//    2    5:astore_1        
		String s1 = String.valueOf(((Object) (zzazq)));
	//    3    6:aload_0         
	//    4    7:getfield        #24  <Field String zzazq>
	//    5   10:invokestatic    #108 <Method String String.valueOf(Object)>
	//    6   13:astore_2        
		if(s1.length() != 0)
	//*   7   14:aload_2         
	//*   8   15:invokevirtual   #112 <Method int String.length()>
	//*   9   18:ifeq            30
			s = s.concat(s1);
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:invokevirtual   #115 <Method String String.concat(String)>
	//   13   26:astore_1        
		else
	//*  14   27:goto            39
			s = new String(s);
	//   15   30:new             #104 <Class String>
	//   16   33:dup             
	//   17   34:aload_1         
	//   18   35:invokespecial   #117 <Method void String(String)>
	//   19   38:astore_1        
		return new File(zzri.getDir("google_tagmanager", 0), s);
	//   20   39:new             #119 <Class File>
	//   21   42:dup             
	//   22   43:aload_0         
	//   23   44:getfield        #22  <Field Context zzri>
	//   24   47:ldc1            #121 <String "google_tagmanager">
	//   25   49:iconst_0        
	//   26   50:invokevirtual   #127 <Method File Context.getDir(String, int)>
	//   27   53:aload_1         
	//   28   54:invokespecial   #130 <Method void File(File, String)>
	//   29   57:areturn         
	}

	public final void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzadl.shutdown();
	//    2    2:aload_0         
	//    3    3:getfield        #32  <Field ExecutorService zzadl>
	//    4    6:invokeinterface #137 <Method void ExecutorService.shutdown()>
		this;
	//    5   11:aload_0         
		JVM INSTR monitorexit ;
	//    6   12:monitorexit     
		return;
	//    7   13:return          
		Exception exception;
		exception;
	//    8   14:astore_1        
	//*   9   15:aload_0         
		throw exception;
	//   10   16:monitorexit     
	//   11   17:aload_1         
	//   12   18:athrow          
	}

	public final void zza(zzre zzre1)
	{
		zzadl.execute(((Runnable) (new zzez(this, zzre1))));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ExecutorService zzadl>
	//    2    4:new             #140 <Class zzez>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #143 <Method void zzez(zzex, zzre)>
	//    7   13:invokeinterface #147 <Method void ExecutorService.execute(Runnable)>
	//    8   18:return          
	}

	public final void zza(zzdh zzdh1)
	{
		zzbes = zzdh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #150 <Field zzdh zzbes>
	//    3    5:return          
	}

	final boolean zzb(zzre zzre1)
	{
		File file = zzps();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method File zzps()>
	//    2    4:astore_3        
		FileOutputStream fileoutputstream;
		byte abyte0[];
		try
		{
			fileoutputstream = new FileOutputStream(file);
	//    3    5:new             #162 <Class FileOutputStream>
	//    4    8:dup             
	//    5    9:aload_3         
	//    6   10:invokespecial   #165 <Method void FileOutputStream(File)>
	//    7   13:astore_2        
		}
	//*   8   14:aload_1         
	//*   9   15:invokevirtual   #168 <Method int zzyi.zzvx()>
	//*  10   18:newarray        byte[]
	//*  11   20:astore          4
	//*  12   22:aload_1         
	//*  13   23:aload           4
	//*  14   25:iconst_0        
	//*  15   26:aload           4
	//*  16   28:arraylength     
	//*  17   29:invokestatic    #171 <Method void zzyi.zza(zzyi, byte[], int, int)>
	//*  18   32:aload_2         
	//*  19   33:aload           4
	//*  20   35:invokevirtual   #175 <Method void FileOutputStream.write(byte[])>
	//*  21   38:aload_2         
	//*  22   39:invokevirtual   #178 <Method void FileOutputStream.close()>
	//*  23   42:goto            50
	//*  24   45:ldc1            #180 <String "error closing stream for writing resource to disk">
	//*  25   47:invokestatic    #61  <Method void zzdi.zzab(String)>
	//*  26   50:iconst_1        
	//*  27   51:ireturn         
	//*  28   52:astore_1        
	//*  29   53:goto            79
	//*  30   56:ldc1            #182 <String "Error writing resource to disk. Removing resource from disk.">
	//*  31   58:invokestatic    #61  <Method void zzdi.zzab(String)>
	//*  32   61:aload_3         
	//*  33   62:invokevirtual   #186 <Method boolean File.delete()>
	//*  34   65:pop             
	//*  35   66:aload_2         
	//*  36   67:invokevirtual   #178 <Method void FileOutputStream.close()>
	//*  37   70:iconst_0        
	//*  38   71:ireturn         
	//*  39   72:ldc1            #180 <String "error closing stream for writing resource to disk">
	//*  40   74:invokestatic    #61  <Method void zzdi.zzab(String)>
	//*  41   77:iconst_0        
	//*  42   78:ireturn         
	//*  43   79:aload_2         
	//*  44   80:invokevirtual   #178 <Method void FileOutputStream.close()>
	//*  45   83:goto            91
	//*  46   86:ldc1            #180 <String "error closing stream for writing resource to disk">
	//*  47   88:invokestatic    #61  <Method void zzdi.zzab(String)>
	//*  48   91:aload_1         
	//*  49   92:athrow          
	//*  50   93:ldc1            #188 <String "Error opening resource file for writing">
	//*  51   95:invokestatic    #97  <Method void zzdi.e(String)>
	//*  52   98:iconst_0        
	//*  53   99:ireturn         
		// Misplaced declaration of an exception variable
		catch(zzre zzre1)
		{
			zzdi.e("Error opening resource file for writing");
			return false;
		}
		abyte0 = new byte[((zzyi) (zzre1)).zzvx()];
		zzyi.zza(((zzyi) (zzre1)), abyte0, 0, abyte0.length);
		fileoutputstream.write(abyte0);
		try
		{
			fileoutputstream.close();
		}
	//*  54  100:astore_1        
	//*  55  101:goto            93
	//*  56  104:astore_1        
	//*  57  105:goto            56
		// Misplaced declaration of an exception variable
		catch(zzre zzre1)
		{
			zzdi.zzab("error closing stream for writing resource to disk");
		}
		return true;
		zzre1;
		  goto _L1
_L3:
		zzdi.zzab("Error writing resource to disk. Removing resource from disk.");
		file.delete();
		try
		{
			fileoutputstream.close();
		}
	//*  58  108:astore_1        
	//*  59  109:goto            45
		// Misplaced declaration of an exception variable
		catch(zzre zzre1)
		{
			zzdi.zzab("error closing stream for writing resource to disk");
			return false;
		}
		return false;
_L1:
		try
		{
			fileoutputstream.close();
		}
	//*  60  112:astore_1        
	//*  61  113:goto            72
		// Misplaced declaration of an exception variable
		catch(IOException ioexception)
		{
			zzdi.zzab("error closing stream for writing resource to disk");
		}
		throw zzre1;
		zzre1;
		if(true) goto _L3; else goto _L2
_L2:
		IOException ioexception;
	//*  62  116:astore_2        
	//*  63  117:goto            86
	}

	public final void zzny()
	{
		zzadl.execute(((Runnable) (new zzey(this))));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field ExecutorService zzadl>
	//    2    4:new             #191 <Class zzey>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #194 <Method void zzey(zzex)>
	//    6   12:invokeinterface #147 <Method void ExecutorService.execute(Runnable)>
	//    7   17:return          
	}

	final void zzpr()
	{
		if(zzbes == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #150 <Field zzdh zzbes>
	//*   2    4:ifnonnull       17
			throw new IllegalStateException("Callback must be set before execute");
	//    3    7:new             #199 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #201 <String "Callback must be set before execute">
	//    6   13:invokespecial   #202 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		zzbes.zznx();
	//    8   17:aload_0         
	//    9   18:getfield        #150 <Field zzdh zzbes>
	//   10   21:invokeinterface #207 <Method void zzdh.zznx()>
		zzdi.v("Attempting to load resource from disk");
	//   11   26:ldc1            #209 <String "Attempting to load resource from disk">
	//   12   28:invokestatic    #90  <Method void zzdi.v(String)>
		if((zzeh.zzpm().zzpn() == zzeh.zza.zzbeh || zzeh.zzpm().zzpn() == zzeh.zza.zzbei) && zzazq.equals(((Object) (zzeh.zzpm().getContainerId()))))
	//*  13   31:invokestatic    #215 <Method zzeh zzeh.zzpm()>
	//*  14   34:invokevirtual   #219 <Method zzeh$zza zzeh.zzpn()>
	//*  15   37:getstatic       #225 <Field zzeh$zza zzeh$zza.zzbeh>
	//*  16   40:if_acmpeq       55
	//*  17   43:invokestatic    #215 <Method zzeh zzeh.zzpm()>
	//*  18   46:invokevirtual   #219 <Method zzeh$zza zzeh.zzpn()>
	//*  19   49:getstatic       #228 <Field zzeh$zza zzeh$zza.zzbei>
	//*  20   52:if_acmpne       84
	//*  21   55:aload_0         
	//*  22   56:getfield        #24  <Field String zzazq>
	//*  23   59:invokestatic    #215 <Method zzeh zzeh.zzpm()>
	//*  24   62:invokevirtual   #232 <Method String zzeh.getContainerId()>
	//*  25   65:invokevirtual   #236 <Method boolean String.equals(Object)>
	//*  26   68:ifeq            84
		{
			zzbes.zzu(zzcz.zzbdg);
	//   27   71:aload_0         
	//   28   72:getfield        #150 <Field zzdh zzbes>
	//   29   75:getstatic       #242 <Field int zzcz.zzbdg>
	//   30   78:invokeinterface #246 <Method void zzdh.zzu(int)>
			return;
	//   31   83:return          
		}
		FileInputStream fileinputstream;
		Object obj1;
		byte abyte0[];
		Exception exception;
		try
		{
			fileinputstream = new FileInputStream(zzps());
	//   32   84:new             #248 <Class FileInputStream>
	//   33   87:dup             
	//   34   88:aload_0         
	//   35   89:invokespecial   #160 <Method File zzps()>
	//   36   92:invokespecial   #249 <Method void FileInputStream(File)>
	//   37   95:astore_1        
		}
	//*  38   96:new             #43  <Class ByteArrayOutputStream>
	//*  39   99:dup             
	//*  40  100:invokespecial   #250 <Method void ByteArrayOutputStream()>
	//*  41  103:astore_2        
	//*  42  104:aload_1         
	//*  43  105:aload_2         
	//*  44  106:invokestatic    #253 <Method void zzrg.zza(java.io.InputStream, java.io.OutputStream)>
	//*  45  109:aload_2         
	//*  46  110:invokevirtual   #257 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  47  113:astore_2        
	//*  48  114:new             #259 <Class zzre>
	//*  49  117:dup             
	//*  50  118:invokespecial   #260 <Method void zzre()>
	//*  51  121:aload_2         
	//*  52  122:invokestatic    #80  <Method zzyi zzyi.zza(zzyi, byte[])>
	//*  53  125:checkcast       #259 <Class zzre>
	//*  54  128:astore_2        
	//*  55  129:aload_2         
	//*  56  130:getfield        #264 <Field zzl zzre.zzqg>
	//*  57  133:ifnonnull       154
	//*  58  136:aload_2         
	//*  59  137:getfield        #268 <Field com.google.android.gms.internal.measurement.zzo zzre.zzbqf>
	//*  60  140:ifnonnull       154
	//*  61  143:new             #197 <Class IllegalArgumentException>
	//*  62  146:dup             
	//*  63  147:ldc2            #270 <String "Resource and SupplementedResource are NULL.">
	//*  64  150:invokespecial   #271 <Method void IllegalArgumentException(String)>
	//*  65  153:athrow          
	//*  66  154:aload_0         
	//*  67  155:getfield        #150 <Field zzdh zzbes>
	//*  68  158:aload_2         
	//*  69  159:invokeinterface #275 <Method void zzdh.onSuccess(Object)>
	//*  70  164:goto            189
	//*  71  167:astore_2        
	//*  72  168:goto            230
	//*  73  171:aload_0         
	//*  74  172:getfield        #150 <Field zzdh zzbes>
	//*  75  175:getstatic       #278 <Field int zzcz.zzbdh>
	//*  76  178:invokeinterface #246 <Method void zzdh.zzu(int)>
	//*  77  183:ldc2            #280 <String "Failed to read the resource from disk. The resource is inconsistent">
	//*  78  186:invokestatic    #61  <Method void zzdi.zzab(String)>
	//*  79  189:aload_1         
	//*  80  190:invokevirtual   #281 <Method void FileInputStream.close()>
	//*  81  193:goto            223
	//*  82  196:aload_0         
	//*  83  197:getfield        #150 <Field zzdh zzbes>
	//*  84  200:getstatic       #278 <Field int zzcz.zzbdh>
	//*  85  203:invokeinterface #246 <Method void zzdh.zzu(int)>
	//*  86  208:ldc2            #283 <String "Failed to read the resource from disk">
	//*  87  211:invokestatic    #61  <Method void zzdi.zzab(String)>
	//*  88  214:goto            189
	//*  89  217:ldc2            #285 <String "Error closing stream for reading resource from disk">
	//*  90  220:invokestatic    #61  <Method void zzdi.zzab(String)>
	//*  91  223:ldc2            #287 <String "The Disk resource was successfully read.">
	//*  92  226:invokestatic    #90  <Method void zzdi.v(String)>
	//*  93  229:return          
	//*  94  230:aload_1         
	//*  95  231:invokevirtual   #281 <Method void FileInputStream.close()>
	//*  96  234:goto            243
	//*  97  237:ldc2            #285 <String "Error closing stream for reading resource from disk">
	//*  98  240:invokestatic    #61  <Method void zzdi.zzab(String)>
	//*  99  243:aload_2         
	//* 100  244:athrow          
	//* 101  245:ldc2            #289 <String "Failed to find the resource in the disk">
	//* 102  248:invokestatic    #66  <Method void zzdi.zzdn(String)>
	//* 103  251:aload_0         
	//* 104  252:getfield        #150 <Field zzdh zzbes>
	//* 105  255:getstatic       #242 <Field int zzcz.zzbdg>
	//* 106  258:invokeinterface #246 <Method void zzdh.zzu(int)>
	//* 107  263:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			zzdi.zzdn("Failed to find the resource in the disk");
			zzbes.zzu(zzcz.zzbdg);
			return;
		}
		obj1 = ((Object) (new ByteArrayOutputStream()));
		zzrg.zza(((java.io.InputStream) (fileinputstream)), ((java.io.OutputStream) (obj1)));
		abyte0 = ((ByteArrayOutputStream) (obj1)).toByteArray();
		abyte0 = ((byte []) ((zzre)zzyi.zza(((zzyi) (new zzre())), abyte0)));
		if(((zzre) (abyte0)).zzqg == null && ((zzre) (abyte0)).zzbqf == null)
			throw new IllegalArgumentException("Resource and SupplementedResource are NULL.");
		zzbes.onSuccess(((Object) (abyte0)));
		  goto _L1
		exception;
		  goto _L2
_L5:
		zzbes.zzu(zzcz.zzbdh);
		zzdi.zzab("Failed to read the resource from disk. The resource is inconsistent");
		  goto _L1
_L3:
		zzbes.zzu(zzcz.zzbdh);
		zzdi.zzab("Failed to read the resource from disk");
_L1:
		try
		{
			fileinputstream.close();
		}
	//* 108  264:astore_1        
	//* 109  265:goto            245
	//* 110  268:astore_2        
	//* 111  269:goto            196
	//* 112  272:astore_2        
	//* 113  273:goto            171
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			zzdi.zzab("Error closing stream for reading resource from disk");
		}
		zzdi.v("The Disk resource was successfully read.");
		return;
_L2:
		Object obj;
		try
		{
			fileinputstream.close();
		}
	//* 114  276:astore_1        
	//* 115  277:goto            217
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			zzdi.zzab("Error closing stream for reading resource from disk");
		}
		throw exception;
		Object obj2;
		obj2;
		  goto _L3
		obj2;
		if(true) goto _L5; else goto _L4
_L4:
	//* 116  280:astore_1        
	//* 117  281:goto            237
	}

	public final zzrk zzv(int i)
	{
		Object obj = ((Object) (zzri.getResources().openRawResource(i)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Context zzri>
	//    2    4:invokevirtual   #297 <Method Resources Context.getResources()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #303 <Method java.io.InputStream Resources.openRawResource(int)>
	//    5   11:astore_2        
		String s = zzri.getResources().getResourceName(i);
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field Context zzri>
	//    8   16:invokevirtual   #297 <Method Resources Context.getResources()>
	//    9   19:iload_1         
	//   10   20:invokevirtual   #307 <Method String Resources.getResourceName(int)>
	//   11   23:astore_3        
		StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s))).length() + 66);
	//   12   24:new             #309 <Class StringBuilder>
	//   13   27:dup             
	//   14   28:aload_3         
	//   15   29:invokestatic    #108 <Method String String.valueOf(Object)>
	//   16   32:invokevirtual   #112 <Method int String.length()>
	//   17   35:bipush          66
	//   18   37:iadd            
	//   19   38:invokespecial   #311 <Method void StringBuilder(int)>
	//   20   41:astore          4
		stringbuilder1.append("Attempting to load a container from the resource ID ");
	//   21   43:aload           4
	//   22   45:ldc2            #313 <String "Attempting to load a container from the resource ID ">
	//   23   48:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
		stringbuilder1.append(i);
	//   25   52:aload           4
	//   26   54:iload_1         
	//   27   55:invokevirtual   #320 <Method StringBuilder StringBuilder.append(int)>
	//   28   58:pop             
		stringbuilder1.append(" (");
	//   29   59:aload           4
	//   30   61:ldc2            #322 <String " (">
	//   31   64:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   32   67:pop             
		stringbuilder1.append(s);
	//   33   68:aload           4
	//   34   70:aload_3         
	//   35   71:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
		stringbuilder1.append(")");
	//   37   75:aload           4
	//   38   77:ldc2            #324 <String ")">
	//   39   80:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   40   83:pop             
		zzdi.v(stringbuilder1.toString());
	//   41   84:aload           4
	//   42   86:invokevirtual   #326 <Method String StringBuilder.toString()>
	//   43   89:invokestatic    #90  <Method void zzdi.v(String)>
		ByteArrayOutputStream bytearrayoutputstream;
		bytearrayoutputstream = new ByteArrayOutputStream();
	//   44   92:new             #43  <Class ByteArrayOutputStream>
	//   45   95:dup             
	//   46   96:invokespecial   #250 <Method void ByteArrayOutputStream()>
	//   47   99:astore_3        
		zzrg.zza(((java.io.InputStream) (obj)), ((java.io.OutputStream) (bytearrayoutputstream)));
	//   48  100:aload_2         
	//   49  101:aload_3         
	//   50  102:invokestatic    #253 <Method void zzrg.zza(java.io.InputStream, java.io.OutputStream)>
		obj = ((Object) (zza(bytearrayoutputstream)));
	//   51  105:aload_3         
	//   52  106:invokestatic    #328 <Method zzrk zza(ByteArrayOutputStream)>
	//   53  109:astore_2        
		if(obj == null)
			break MISSING_BLOCK_LABEL_122;
	//   54  110:aload_2         
	//   55  111:ifnull          122
		zzdi.v("The container was successfully loaded from the resource (using JSON file format)");
	//   56  114:ldc2            #330 <String "The container was successfully loaded from the resource (using JSON file format)">
	//   57  117:invokestatic    #90  <Method void zzdi.v(String)>
		return ((zzrk) (obj));
	//   58  120:aload_2         
	//   59  121:areturn         
		obj = ((Object) (zze(bytearrayoutputstream.toByteArray())));
	//   60  122:aload_3         
	//   61  123:invokevirtual   #257 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   62  126:invokestatic    #332 <Method zzrk zze(byte[])>
	//   63  129:astore_2        
		return ((zzrk) (obj));
	//   64  130:aload_2         
	//   65  131:areturn         
_L5:
		obj = ((Object) (zzri.getResources().getResourceName(i)));
	//   66  132:aload_0         
	//   67  133:getfield        #22  <Field Context zzri>
	//   68  136:invokevirtual   #297 <Method Resources Context.getResources()>
	//   69  139:iload_1         
	//   70  140:invokevirtual   #307 <Method String Resources.getResourceName(int)>
	//   71  143:astore_2        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 67);
	//   72  144:new             #309 <Class StringBuilder>
	//   73  147:dup             
	//   74  148:aload_2         
	//   75  149:invokestatic    #108 <Method String String.valueOf(Object)>
	//   76  152:invokevirtual   #112 <Method int String.length()>
	//   77  155:bipush          67
	//   78  157:iadd            
	//   79  158:invokespecial   #311 <Method void StringBuilder(int)>
	//   80  161:astore_3        
		stringbuilder.append("Error reading the default container with resource ID ");
	//   81  162:aload_3         
	//   82  163:ldc2            #334 <String "Error reading the default container with resource ID ">
	//   83  166:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   84  169:pop             
		stringbuilder.append(i);
	//   85  170:aload_3         
	//   86  171:iload_1         
	//   87  172:invokevirtual   #320 <Method StringBuilder StringBuilder.append(int)>
	//   88  175:pop             
		stringbuilder.append(" (");
	//   89  176:aload_3         
	//   90  177:ldc2            #322 <String " (">
	//   91  180:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   92  183:pop             
		stringbuilder.append(((String) (obj)));
	//   93  184:aload_3         
	//   94  185:aload_2         
	//   95  186:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//   96  189:pop             
		stringbuilder.append(")");
	//   97  190:aload_3         
	//   98  191:ldc2            #324 <String ")">
	//   99  194:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//  100  197:pop             
		obj = ((Object) (stringbuilder.toString()));
	//  101  198:aload_3         
	//  102  199:invokevirtual   #326 <Method String StringBuilder.toString()>
	//  103  202:astore_2        
_L2:
		zzdi.zzab(((String) (obj)));
	//  104  203:aload_2         
	//  105  204:invokestatic    #61  <Method void zzdi.zzab(String)>
		return null;
	//  106  207:aconst_null     
	//  107  208:areturn         
_L3:
		obj = ((Object) (new StringBuilder(98)));
	//  108  209:new             #309 <Class StringBuilder>
	//  109  212:dup             
	//  110  213:bipush          98
	//  111  215:invokespecial   #311 <Method void StringBuilder(int)>
	//  112  218:astore_2        
		((StringBuilder) (obj)).append("Failed to load the container. No default container resource found with the resource ID ");
	//  113  219:aload_2         
	//  114  220:ldc2            #336 <String "Failed to load the container. No default container resource found with the resource ID ">
	//  115  223:invokevirtual   #317 <Method StringBuilder StringBuilder.append(String)>
	//  116  226:pop             
		((StringBuilder) (obj)).append(i);
	//  117  227:aload_2         
	//  118  228:iload_1         
	//  119  229:invokevirtual   #320 <Method StringBuilder StringBuilder.append(int)>
	//  120  232:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  121  233:aload_2         
	//  122  234:invokevirtual   #326 <Method String StringBuilder.toString()>
	//  123  237:astore_2        
		if(true) goto _L2; else goto _L1
	//  124  238:goto            203
_L1:
		Object obj1;
		obj1;
	//  125  241:astore_2        
		  goto _L3
	//* 126  242:goto            209
		obj1;
	//  127  245:astore_2        
		if(true) goto _L5; else goto _L4
_L4:
	//* 128  246:goto            132
	}

	private final ExecutorService zzadl = Executors.newSingleThreadExecutor();
	private final String zzazq;
	private zzdh zzbes;
	private final Context zzri;
}
