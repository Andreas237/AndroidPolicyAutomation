// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.*;
import java.io.*;

// Referenced classes of package android.support.v4.graphics:
//			TypefaceCompatBaseImpl

class TypefaceCompatApi21Impl extends TypefaceCompatBaseImpl
{

	TypefaceCompatApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void TypefaceCompatBaseImpl()>
	//    2    4:return          
	}

	private File getFile(ParcelFileDescriptor parcelfiledescriptor)
	{
label0:
		{
			try
			{
				parcelfiledescriptor = ((ParcelFileDescriptor) (Os.readlink((new StringBuilder()).append("/proc/self/fd/").append(parcelfiledescriptor.getFd()).toString())));
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void StringBuilder()>
	//    3    7:ldc1            #28  <String "/proc/self/fd/">
	//    4    9:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_1         
	//    6   13:invokevirtual   #38  <Method int ParcelFileDescriptor.getFd()>
	//    7   16:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//    8   19:invokevirtual   #45  <Method String StringBuilder.toString()>
	//    9   22:invokestatic    #51  <Method String Os.readlink(String)>
	//   10   25:astore_1        
				if(!OsConstants.S_ISREG(Os.stat(((String) (parcelfiledescriptor))).st_mode))
					break label0;
	//   11   26:aload_1         
	//   12   27:invokestatic    #55  <Method StructStat Os.stat(String)>
	//   13   30:getfield        #61  <Field int StructStat.st_mode>
	//   14   33:invokestatic    #67  <Method boolean OsConstants.S_ISREG(int)>
	//   15   36:ifeq            50
				parcelfiledescriptor = ((ParcelFileDescriptor) (new File(((String) (parcelfiledescriptor)))));
	//   16   39:new             #69  <Class File>
	//   17   42:dup             
	//   18   43:aload_1         
	//   19   44:invokespecial   #72  <Method void File(String)>
	//   20   47:astore_1        
			}
	//*  21   48:aload_1         
	//*  22   49:areturn         
	//*  23   50:aconst_null     
	//*  24   51:areturn         
			// Misplaced declaration of an exception variable
			catch(ParcelFileDescriptor parcelfiledescriptor)
	//*  25   52:astore_1        
			{
				return null;
	//   26   53:aconst_null     
	//   27   54:areturn         
			}
			return ((File) (parcelfiledescriptor));
		}
		return null;
	}

	public Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
		Object obj;
		if(afontinfo.length < 1)
	//*   0    0:aload_3         
	//*   1    1:arraylength     
	//*   2    2:iconst_1        
	//*   3    3:icmpge          8
			return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
		afontinfo = ((android.support.v4.provider.FontsContractCompat.FontInfo []) (findBestInfo(afontinfo, i)));
	//    6    8:aload_0         
	//    7    9:aload_3         
	//    8   10:iload           4
	//    9   12:invokevirtual   #83  <Method android.support.v4.provider.FontsContractCompat$FontInfo findBestInfo(android.support.v4.provider.FontsContractCompat$FontInfo[], int)>
	//   10   15:astore_3        
		obj = ((Object) (context.getContentResolver()));
	//   11   16:aload_1         
	//   12   17:invokevirtual   #89  <Method ContentResolver Context.getContentResolver()>
	//   13   20:astore          5
		try
		{
			afontinfo = ((android.support.v4.provider.FontsContractCompat.FontInfo []) (((ContentResolver) (obj)).openFileDescriptor(((android.support.v4.provider.FontsContractCompat.FontInfo) (afontinfo)).getUri(), "r", cancellationsignal)));
	//   14   22:aload           5
	//   15   24:aload_3         
	//   16   25:invokevirtual   #95  <Method android.net.Uri android.support.v4.provider.FontsContractCompat$FontInfo.getUri()>
	//   17   28:ldc1            #97  <String "r">
	//   18   30:aload_2         
	//   19   31:invokevirtual   #103 <Method ParcelFileDescriptor ContentResolver.openFileDescriptor(android.net.Uri, String, CancellationSignal)>
	//   20   34:astore_3        
		}
	//*  21   35:aload_0         
	//*  22   36:aload_3         
	//*  23   37:invokespecial   #105 <Method File getFile(ParcelFileDescriptor)>
	//*  24   40:astore_2        
	//*  25   41:aload_2         
	//*  26   42:ifnull          52
	//*  27   45:aload_2         
	//*  28   46:invokevirtual   #109 <Method boolean File.canRead()>
	//*  29   49:ifne            200
	//*  30   52:new             #111 <Class FileInputStream>
	//*  31   55:dup             
	//*  32   56:aload_3         
	//*  33   57:invokevirtual   #115 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//*  34   60:invokespecial   #118 <Method void FileInputStream(java.io.FileDescriptor)>
	//*  35   63:astore          5
	//*  36   65:aload_0         
	//*  37   66:aload_1         
	//*  38   67:aload           5
	//*  39   69:invokespecial   #122 <Method Typeface TypefaceCompatBaseImpl.createFromInputStream(Context, java.io.InputStream)>
	//*  40   72:astore_1        
	//*  41   73:aload           5
	//*  42   75:ifnull          87
	//*  43   78:iconst_0        
	//*  44   79:ifeq            131
	//*  45   82:aload           5
	//*  46   84:invokevirtual   #125 <Method void FileInputStream.close()>
	//*  47   87:aload_3         
	//*  48   88:ifnull          99
	//*  49   91:iconst_0        
	//*  50   92:ifeq            154
	//*  51   95:aload_3         
	//*  52   96:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
	//*  53   99:aload_1         
	//*  54  100:areturn         
	//*  55  101:astore_1        
	//*  56  102:new             #128 <Class NullPointerException>
	//*  57  105:dup             
	//*  58  106:invokespecial   #129 <Method void NullPointerException()>
	//*  59  109:athrow          
	//*  60  110:astore_2        
	//*  61  111:aload_2         
	//*  62  112:athrow          
	//*  63  113:astore_1        
	//*  64  114:aload_3         
	//*  65  115:ifnull          126
	//*  66  118:aload_2         
	//*  67  119:ifnull          244
	//*  68  122:aload_3         
	//*  69  123:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
	//*  70  126:aload_1         
	//*  71  127:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  72  128:astore_1        
		{
			return null;
	//   73  129:aconst_null     
	//   74  130:areturn         
		}
		cancellationsignal = ((CancellationSignal) (getFile(((ParcelFileDescriptor) (afontinfo)))));
		if(cancellationsignal == null) goto _L2; else goto _L1
_L1:
		if(((File) (cancellationsignal)).canRead()) goto _L3; else goto _L2
_L2:
		obj = ((Object) (new FileInputStream(((ParcelFileDescriptor) (afontinfo)).getFileDescriptor())));
		context = ((Context) (super.createFromInputStream(context, ((java.io.InputStream) (obj)))));
		if(obj == null) goto _L5; else goto _L4
_L4:
		if(true) goto _L7; else goto _L6
_L6:
		((FileInputStream) (obj)).close();
_L5:
		if(afontinfo == null) goto _L9; else goto _L8
_L8:
		if(true) goto _L11; else goto _L10
_L10:
		((ParcelFileDescriptor) (afontinfo)).close();
_L9:
		return ((Typeface) (context));
		context;
		try
		{
			throw new NullPointerException();
		}
		// Misplaced declaration of an exception variable
		catch(CancellationSignal cancellationsignal) { }
		throw cancellationsignal;
		context;
_L16:
		if(afontinfo == null) goto _L13; else goto _L12
_L12:
		if(cancellationsignal == null) goto _L15; else goto _L14
_L14:
		((ParcelFileDescriptor) (afontinfo)).close();
_L13:
		throw context;
_L7:
		((FileInputStream) (obj)).close();
	//   75  131:aload           5
	//   76  133:invokevirtual   #125 <Method void FileInputStream.close()>
		  goto _L5
	//*  77  136:goto            87
		context;
	//   78  139:astore_1        
		cancellationsignal = null;
	//   79  140:aconst_null     
	//   80  141:astore_2        
		  goto _L16
	//*  81  142:goto            114
		context;
	//   82  145:astore_1        
		throw new NullPointerException();
	//   83  146:new             #128 <Class NullPointerException>
	//   84  149:dup             
	//   85  150:invokespecial   #129 <Method void NullPointerException()>
	//   86  153:athrow          
_L11:
		((ParcelFileDescriptor) (afontinfo)).close();
	//   87  154:aload_3         
	//   88  155:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
		  goto _L9
	//*  89  158:goto            99
		context;
	//   90  161:astore_1        
		throw context;
	//   91  162:aload_1         
	//   92  163:athrow          
		cancellationsignal;
	//   93  164:astore_2        
_L23:
		if(obj == null)
			break MISSING_BLOCK_LABEL_179;
	//   94  165:aload           5
	//   95  167:ifnull          179
		if(context == null)
			break MISSING_BLOCK_LABEL_192;
	//   96  170:aload_1         
	//   97  171:ifnull          192
		((FileInputStream) (obj)).close();
	//   98  174:aload           5
	//   99  176:invokevirtual   #125 <Method void FileInputStream.close()>
_L17:
		throw cancellationsignal;
	//  100  179:aload_2         
	//  101  180:athrow          
		obj;
	//  102  181:astore          5
		((Throwable) (context)).addSuppressed(((Throwable) (obj)));
	//  103  183:aload_1         
	//  104  184:aload           5
	//  105  186:invokevirtual   #133 <Method void Throwable.addSuppressed(Throwable)>
		  goto _L17
	//* 106  189:goto            179
		((FileInputStream) (obj)).close();
	//  107  192:aload           5
	//  108  194:invokevirtual   #125 <Method void FileInputStream.close()>
		  goto _L17
	//* 109  197:goto            179
_L3:
		context = ((Context) (Typeface.createFromFile(((File) (cancellationsignal)))));
	//  110  200:aload_2         
	//  111  201:invokestatic    #139 <Method Typeface Typeface.createFromFile(File)>
	//  112  204:astore_1        
		if(afontinfo == null) goto _L19; else goto _L18
	//  113  205:aload_3         
	//  114  206:ifnull          217
_L18:
		if(true) goto _L21; else goto _L20
	//  115  209:iconst_0        
	//  116  210:ifeq            228
_L20:
		((ParcelFileDescriptor) (afontinfo)).close();
	//  117  213:aload_3         
	//  118  214:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
_L19:
		return ((Typeface) (context));
	//  119  217:aload_1         
	//  120  218:areturn         
		context;
	//  121  219:astore_1        
		throw new NullPointerException();
	//  122  220:new             #128 <Class NullPointerException>
	//  123  223:dup             
	//  124  224:invokespecial   #129 <Method void NullPointerException()>
	//  125  227:athrow          
_L21:
		((ParcelFileDescriptor) (afontinfo)).close();
	//  126  228:aload_3         
	//  127  229:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
		if(true) goto _L19; else goto _L22
	//  128  232:goto            217
_L22:
		afontinfo;
	//  129  235:astore_3        
		((Throwable) (cancellationsignal)).addSuppressed(((Throwable) (afontinfo)));
	//  130  236:aload_2         
	//  131  237:aload_3         
	//  132  238:invokevirtual   #133 <Method void Throwable.addSuppressed(Throwable)>
		  goto _L13
	//* 133  241:goto            126
_L15:
		((ParcelFileDescriptor) (afontinfo)).close();
	//  134  244:aload_3         
	//  135  245:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
		  goto _L13
	//* 136  248:goto            126
		cancellationsignal;
	//  137  251:astore_2        
		context = null;
	//  138  252:aconst_null     
	//  139  253:astore_1        
		  goto _L23
	//* 140  254:goto            165
	}

	private static final String TAG = "TypefaceCompatApi21Impl";
}
