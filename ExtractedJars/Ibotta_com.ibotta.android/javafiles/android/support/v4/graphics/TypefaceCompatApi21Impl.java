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
	//    1    1:invokespecial   #14  <Method void TypefaceCompatBaseImpl()>
	//    2    4:return          
	}

	private File getFile(ParcelFileDescriptor parcelfiledescriptor)
	{
label0:
		{
			try
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #21  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void StringBuilder()>
	//    3    7:astore_2        
				stringbuilder.append("/proc/self/fd/");
	//    4    8:aload_2         
	//    5    9:ldc1            #24  <String "/proc/self/fd/">
	//    6   11:invokevirtual   #28  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
				stringbuilder.append(parcelfiledescriptor.getFd());
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #34  <Method int ParcelFileDescriptor.getFd()>
	//   11   20:invokevirtual   #37  <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
				parcelfiledescriptor = ((ParcelFileDescriptor) (Os.readlink(stringbuilder.toString())));
	//   13   24:aload_2         
	//   14   25:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #47  <Method String Os.readlink(String)>
	//   16   31:astore_1        
				if(!OsConstants.S_ISREG(Os.stat(((String) (parcelfiledescriptor))).st_mode))
					break label0;
	//   17   32:aload_1         
	//   18   33:invokestatic    #51  <Method StructStat Os.stat(String)>
	//   19   36:getfield        #57  <Field int StructStat.st_mode>
	//   20   39:invokestatic    #63  <Method boolean OsConstants.S_ISREG(int)>
	//   21   42:ifeq            56
				parcelfiledescriptor = ((ParcelFileDescriptor) (new File(((String) (parcelfiledescriptor)))));
	//   22   45:new             #65  <Class File>
	//   23   48:dup             
	//   24   49:aload_1         
	//   25   50:invokespecial   #68  <Method void File(String)>
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
	//    9   12:invokevirtual   #79  <Method android.support.v4.provider.FontsContractCompat$FontInfo findBestInfo(android.support.v4.provider.FontsContractCompat$FontInfo[], int)>
	//   10   15:astore_3        
		Object obj = ((Object) (context.getContentResolver()));
	//   11   16:aload_1         
	//   12   17:invokevirtual   #85  <Method ContentResolver Context.getContentResolver()>
	//   13   20:astore          5
		try
		{
			afontinfo = ((android.support.v4.provider.FontsContractCompat.FontInfo []) (((ContentResolver) (obj)).openFileDescriptor(((android.support.v4.provider.FontsContractCompat.FontInfo) (afontinfo)).getUri(), "r", cancellationsignal)));
	//   14   22:aload           5
	//   15   24:aload_3         
	//   16   25:invokevirtual   #91  <Method android.net.Uri android.support.v4.provider.FontsContractCompat$FontInfo.getUri()>
	//   17   28:ldc1            #93  <String "r">
	//   18   30:aload_2         
	//   19   31:invokevirtual   #99  <Method ParcelFileDescriptor ContentResolver.openFileDescriptor(android.net.Uri, String, CancellationSignal)>
	//   20   34:astore_3        
		}
	//*  21   35:aload_0         
	//*  22   36:aload_3         
	//*  23   37:invokespecial   #101 <Method File getFile(ParcelFileDescriptor)>
	//*  24   40:astore_2        
	//*  25   41:aload_2         
	//*  26   42:ifnull          70
	//*  27   45:aload_2         
	//*  28   46:invokevirtual   #105 <Method boolean File.canRead()>
	//*  29   49:ifne            55
	//*  30   52:goto            70
	//*  31   55:aload_2         
	//*  32   56:invokestatic    #111 <Method Typeface Typeface.createFromFile(File)>
	//*  33   59:astore_1        
	//*  34   60:aload_3         
	//*  35   61:ifnull          68
	//*  36   64:aload_3         
	//*  37   65:invokevirtual   #114 <Method void ParcelFileDescriptor.close()>
	//*  38   68:aload_1         
	//*  39   69:areturn         
	//*  40   70:new             #116 <Class FileInputStream>
	//*  41   73:dup             
	//*  42   74:aload_3         
	//*  43   75:invokevirtual   #120 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//*  44   78:invokespecial   #123 <Method void FileInputStream(java.io.FileDescriptor)>
	//*  45   81:astore          5
	//*  46   83:aload_0         
	//*  47   84:aload_1         
	//*  48   85:aload           5
	//*  49   87:invokespecial   #127 <Method Typeface TypefaceCompatBaseImpl.createFromInputStream(Context, java.io.InputStream)>
	//*  50   90:astore_1        
	//*  51   91:aload           5
	//*  52   93:invokevirtual   #128 <Method void FileInputStream.close()>
	//*  53   96:aload_3         
	//*  54   97:ifnull          104
	//*  55  100:aload_3         
	//*  56  101:invokevirtual   #114 <Method void ParcelFileDescriptor.close()>
	//*  57  104:aload_1         
	//*  58  105:areturn         
	//*  59  106:astore_1        
	//*  60  107:aconst_null     
	//*  61  108:astore_2        
	//*  62  109:goto            116
	//*  63  112:astore_2        
	//*  64  113:aload_2         
	//*  65  114:athrow          
	//*  66  115:astore_1        
	//*  67  116:aload_2         
	//*  68  117:ifnull          139
	//*  69  120:aload           5
	//*  70  122:invokevirtual   #128 <Method void FileInputStream.close()>
	//*  71  125:goto            144
	//*  72  128:astore          5
	//*  73  130:aload_2         
	//*  74  131:aload           5
	//*  75  133:invokevirtual   #132 <Method void Throwable.addSuppressed(Throwable)>
	//*  76  136:goto            144
	//*  77  139:aload           5
	//*  78  141:invokevirtual   #128 <Method void FileInputStream.close()>
	//*  79  144:aload_1         
	//*  80  145:athrow          
	//*  81  146:astore_1        
	//*  82  147:aconst_null     
	//*  83  148:astore_2        
	//*  84  149:goto            156
	//*  85  152:astore_2        
	//*  86  153:aload_2         
	//*  87  154:athrow          
	//*  88  155:astore_1        
	//*  89  156:aload_3         
	//*  90  157:ifnull          184
	//*  91  160:aload_2         
	//*  92  161:ifnull          180
	//*  93  164:aload_3         
	//*  94  165:invokevirtual   #114 <Method void ParcelFileDescriptor.close()>
	//*  95  168:goto            184
	//*  96  171:astore_3        
	//*  97  172:aload_2         
	//*  98  173:aload_3         
	//*  99  174:invokevirtual   #132 <Method void Throwable.addSuppressed(Throwable)>
	//* 100  177:goto            184
	//* 101  180:aload_3         
	//* 102  181:invokevirtual   #114 <Method void ParcelFileDescriptor.close()>
	//* 103  184:aload_1         
	//* 104  185:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 105  186:astore_1        
		{
			return null;
	//  106  187:aconst_null     
	//  107  188:areturn         
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
		((FileInputStream) (obj)).close();
		if(afontinfo == null)
			break MISSING_BLOCK_LABEL_104;
		((ParcelFileDescriptor) (afontinfo)).close();
		return ((Typeface) (context));
		context;
		cancellationsignal = null;
		break MISSING_BLOCK_LABEL_116;
		cancellationsignal;
		throw cancellationsignal;
		context;
		if(cancellationsignal == null) goto _L2; else goto _L1
_L1:
		try
		{
			((FileInputStream) (obj)).close();
			break MISSING_BLOCK_LABEL_144;
		}
		// Misplaced declaration of an exception variable
		catch(Object obj) { }
		try
		{
			((Throwable) (cancellationsignal)).addSuppressed(((Throwable) (obj)));
			break MISSING_BLOCK_LABEL_144;
		}
		// Misplaced declaration of an exception variable
		catch(CancellationSignal cancellationsignal) { }
		  goto _L3
_L2:
		((FileInputStream) (obj)).close();
		throw context;
		context;
		cancellationsignal = null;
		break MISSING_BLOCK_LABEL_156;
_L3:
		throw cancellationsignal;
		context;
		if(afontinfo == null)
			break MISSING_BLOCK_LABEL_184;
		if(cancellationsignal == null)
			break MISSING_BLOCK_LABEL_180;
		((ParcelFileDescriptor) (afontinfo)).close();
		break MISSING_BLOCK_LABEL_184;
		afontinfo;
		((Throwable) (cancellationsignal)).addSuppressed(((Throwable) (afontinfo)));
		break MISSING_BLOCK_LABEL_184;
		((ParcelFileDescriptor) (afontinfo)).close();
		throw context;
	}
}
