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
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
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
				StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void StringBuilder()>
	//    3    7:astore_2        
				stringbuilder.append("/proc/self/fd/");
	//    4    8:aload_2         
	//    5    9:ldc1            #28  <String "/proc/self/fd/">
	//    6   11:invokevirtual   #32  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
				stringbuilder.append(parcelfiledescriptor.getFd());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #38  <Method int ParcelFileDescriptor.getFd()>
	//   11   20:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
				parcelfiledescriptor = ((ParcelFileDescriptor) (Os.readlink(stringbuilder.toString())));
	//   13   24:aload_2         
	//   14   25:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #51  <Method String Os.readlink(String)>
	//   16   31:astore_1        
				if(!OsConstants.S_ISREG(Os.stat(((String) (parcelfiledescriptor))).st_mode))
					break label0;
	//   17   32:aload_1         
	//   18   33:invokestatic    #55  <Method StructStat Os.stat(String)>
	//   19   36:getfield        #61  <Field int StructStat.st_mode>
	//   20   39:invokestatic    #67  <Method boolean OsConstants.S_ISREG(int)>
	//   21   42:ifeq            56
				parcelfiledescriptor = ((ParcelFileDescriptor) (new File(((String) (parcelfiledescriptor)))));
	//   22   45:new             #69  <Class File>
	//   23   48:dup             
	//   24   49:aload_1         
	//   25   50:invokespecial   #72  <Method void File(String)>
	//   26   53:astore_1        
			}
	//*  27   54:aload_1         
	//*  28   55:areturn         
	//*  29   56:aconst_null     
	//*  30   57:areturn         
			// Misplaced declaration of an exception variable
			catch(ParcelFileDescriptor parcelfiledescriptor)
	//*  31   58:astore_1        
			{
				return null;
	//   32   59:aconst_null     
	//   33   60:areturn         
			}
			return ((File) (parcelfiledescriptor));
		}
		return null;
	}

	public Typeface createFromFontInfo(Context context, CancellationSignal cancellationsignal, android.support.v4.provider.FontsContractCompat.FontInfo afontinfo[], int i)
	{
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
		Object obj = ((Object) (context.getContentResolver()));
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
	//*  26   42:ifnull          70
	//*  27   45:aload_2         
	//*  28   46:invokevirtual   #109 <Method boolean File.canRead()>
	//*  29   49:ifne            55
	//*  30   52:goto            70
	//*  31   55:aload_2         
	//*  32   56:invokestatic    #115 <Method Typeface Typeface.createFromFile(File)>
	//*  33   59:astore_1        
	//*  34   60:aload_3         
	//*  35   61:ifnull          68
	//*  36   64:aload_3         
	//*  37   65:invokevirtual   #118 <Method void ParcelFileDescriptor.close()>
	//*  38   68:aload_1         
	//*  39   69:areturn         
	//*  40   70:new             #120 <Class FileInputStream>
	//*  41   73:dup             
	//*  42   74:aload_3         
	//*  43   75:invokevirtual   #124 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//*  44   78:invokespecial   #127 <Method void FileInputStream(java.io.FileDescriptor)>
	//*  45   81:astore          5
	//*  46   83:aload_0         
	//*  47   84:aload_1         
	//*  48   85:aload           5
	//*  49   87:invokespecial   #131 <Method Typeface TypefaceCompatBaseImpl.createFromInputStream(Context, java.io.InputStream)>
	//*  50   90:astore_1        
	//*  51   91:aload           5
	//*  52   93:ifnull          101
	//*  53   96:aload           5
	//*  54   98:invokevirtual   #132 <Method void FileInputStream.close()>
	//*  55  101:aload_3         
	//*  56  102:ifnull          109
	//*  57  105:aload_3         
	//*  58  106:invokevirtual   #118 <Method void ParcelFileDescriptor.close()>
	//*  59  109:aload_1         
	//*  60  110:areturn         
	//*  61  111:astore_1        
	//*  62  112:aconst_null     
	//*  63  113:astore_2        
	//*  64  114:goto            121
	//*  65  117:astore_2        
	//*  66  118:aload_2         
	//*  67  119:athrow          
	//*  68  120:astore_1        
	//*  69  121:aload           5
	//*  70  123:ifnull          154
	//*  71  126:aload_2         
	//*  72  127:ifnull          149
	//*  73  130:aload           5
	//*  74  132:invokevirtual   #132 <Method void FileInputStream.close()>
	//*  75  135:goto            154
	//*  76  138:astore          5
	//*  77  140:aload_2         
	//*  78  141:aload           5
	//*  79  143:invokestatic    #138 <Method void ThrowableExtension.addSuppressed(Throwable, Throwable)>
	//*  80  146:goto            154
	//*  81  149:aload           5
	//*  82  151:invokevirtual   #132 <Method void FileInputStream.close()>
	//*  83  154:aload_1         
	//*  84  155:athrow          
	//*  85  156:astore_1        
	//*  86  157:aconst_null     
	//*  87  158:astore_2        
	//*  88  159:goto            166
	//*  89  162:astore_2        
	//*  90  163:aload_2         
	//*  91  164:athrow          
	//*  92  165:astore_1        
	//*  93  166:aload_3         
	//*  94  167:ifnull          194
	//*  95  170:aload_2         
	//*  96  171:ifnull          190
	//*  97  174:aload_3         
	//*  98  175:invokevirtual   #118 <Method void ParcelFileDescriptor.close()>
	//*  99  178:goto            194
	//* 100  181:astore_3        
	//* 101  182:aload_2         
	//* 102  183:aload_3         
	//* 103  184:invokestatic    #138 <Method void ThrowableExtension.addSuppressed(Throwable, Throwable)>
	//* 104  187:goto            194
	//* 105  190:aload_3         
	//* 106  191:invokevirtual   #118 <Method void ParcelFileDescriptor.close()>
	//* 107  194:aload_1         
	//* 108  195:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 109  196:astore_1        
		{
			return null;
	//  110  197:aconst_null     
	//  111  198:areturn         
		}
		cancellationsignal = ((CancellationSignal) (getFile(((ParcelFileDescriptor) (afontinfo)))));
		if(cancellationsignal == null)
			break MISSING_BLOCK_LABEL_70;
		if(!((File) (cancellationsignal)).canRead())
			break MISSING_BLOCK_LABEL_70;
		context = ((Context) (Typeface.createFromFile(((File) (cancellationsignal)))));
		if(afontinfo == null)
			break MISSING_BLOCK_LABEL_68;
		((ParcelFileDescriptor) (afontinfo)).close();
		return ((Typeface) (context));
		obj = ((Object) (new FileInputStream(((ParcelFileDescriptor) (afontinfo)).getFileDescriptor())));
		context = ((Context) (super.createFromInputStream(context, ((java.io.InputStream) (obj)))));
		if(obj == null)
			break MISSING_BLOCK_LABEL_101;
		((FileInputStream) (obj)).close();
		if(afontinfo == null)
			break MISSING_BLOCK_LABEL_109;
		((ParcelFileDescriptor) (afontinfo)).close();
		return ((Typeface) (context));
		context;
		cancellationsignal = null;
		break MISSING_BLOCK_LABEL_121;
		cancellationsignal;
		throw cancellationsignal;
		context;
		if(obj == null)
			break MISSING_BLOCK_LABEL_154;
		if(cancellationsignal == null) goto _L2; else goto _L1
_L1:
		try
		{
			((FileInputStream) (obj)).close();
			break MISSING_BLOCK_LABEL_154;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		try
		{
			ThrowableExtension.addSuppressed(((Throwable) (cancellationsignal)), ((Throwable) (obj)));
			break MISSING_BLOCK_LABEL_154;
		}
		// Misplaced declaration of an exception variable
		catch(CancellationSignal cancellationsignal) { }
		  goto _L3
_L2:
		((FileInputStream) (obj)).close();
		throw context;
		context;
		cancellationsignal = null;
		break MISSING_BLOCK_LABEL_166;
_L3:
		throw cancellationsignal;
		context;
		if(afontinfo == null)
			break MISSING_BLOCK_LABEL_194;
		if(cancellationsignal == null)
			break MISSING_BLOCK_LABEL_190;
		((ParcelFileDescriptor) (afontinfo)).close();
		break MISSING_BLOCK_LABEL_194;
		afontinfo;
		ThrowableExtension.addSuppressed(((Throwable) (cancellationsignal)), ((Throwable) (afontinfo)));
		break MISSING_BLOCK_LABEL_194;
		((ParcelFileDescriptor) (afontinfo)).close();
		throw context;
	}

	private static final String TAG = "TypefaceCompatApi21Impl";
}
