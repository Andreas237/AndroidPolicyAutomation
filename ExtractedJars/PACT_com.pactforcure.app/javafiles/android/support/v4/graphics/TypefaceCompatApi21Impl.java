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
		if(afontinfo.length >= 1) goto _L2; else goto _L1
	//    0    0:aload_3         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:icmpge          10
_L1:
		context = null;
	//    4    6:aconst_null     
	//    5    7:astore_1        
_L11:
		return ((Typeface) (context));
	//    6    8:aload_1         
	//    7    9:areturn         
_L2:
		Object obj;
		afontinfo = ((android.support.v4.provider.FontsContractCompat.FontInfo []) (findBestInfo(afontinfo, i)));
	//    8   10:aload_0         
	//    9   11:aload_3         
	//   10   12:iload           4
	//   11   14:invokevirtual   #83  <Method android.support.v4.provider.FontsContractCompat$FontInfo findBestInfo(android.support.v4.provider.FontsContractCompat$FontInfo[], int)>
	//   12   17:astore_3        
		obj = ((Object) (context.getContentResolver()));
	//   13   18:aload_1         
	//   14   19:invokevirtual   #89  <Method ContentResolver Context.getContentResolver()>
	//   15   22:astore          5
		try
		{
			afontinfo = ((android.support.v4.provider.FontsContractCompat.FontInfo []) (((ContentResolver) (obj)).openFileDescriptor(((android.support.v4.provider.FontsContractCompat.FontInfo) (afontinfo)).getUri(), "r", cancellationsignal)));
	//   16   24:aload           5
	//   17   26:aload_3         
	//   18   27:invokevirtual   #95  <Method android.net.Uri android.support.v4.provider.FontsContractCompat$FontInfo.getUri()>
	//   19   30:ldc1            #97  <String "r">
	//   20   32:aload_2         
	//   21   33:invokevirtual   #103 <Method ParcelFileDescriptor ContentResolver.openFileDescriptor(android.net.Uri, String, CancellationSignal)>
	//   22   36:astore_3        
		}
	//*  23   37:aload_0         
	//*  24   38:aload_3         
	//*  25   39:invokespecial   #105 <Method File getFile(ParcelFileDescriptor)>
	//*  26   42:astore_2        
	//*  27   43:aload_2         
	//*  28   44:ifnull          54
	//*  29   47:aload_2         
	//*  30   48:invokevirtual   #109 <Method boolean File.canRead()>
	//*  31   51:ifne            209
	//*  32   54:new             #111 <Class FileInputStream>
	//*  33   57:dup             
	//*  34   58:aload_3         
	//*  35   59:invokevirtual   #115 <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//*  36   62:invokespecial   #118 <Method void FileInputStream(java.io.FileDescriptor)>
	//*  37   65:astore          5
	//*  38   67:aconst_null     
	//*  39   68:astore_2        
	//*  40   69:aload_0         
	//*  41   70:aload_1         
	//*  42   71:aload           5
	//*  43   73:invokespecial   #122 <Method Typeface TypefaceCompatBaseImpl.createFromInputStream(Context, java.io.InputStream)>
	//*  44   76:astore_1        
	//*  45   77:aload_1         
	//*  46   78:astore_2        
	//*  47   79:aload           5
	//*  48   81:ifnull          93
	//*  49   84:iconst_0        
	//*  50   85:ifeq            148
	//*  51   88:aload           5
	//*  52   90:invokevirtual   #125 <Method void FileInputStream.close()>
	//*  53   93:aload_2         
	//*  54   94:astore_1        
	//*  55   95:aload_3         
	//*  56   96:ifnull          8
	//*  57   99:iconst_0        
	//*  58  100:ifeq            162
	//*  59  103:aload_3         
	//*  60  104:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
	//*  61  107:aload_2         
	//*  62  108:areturn         
	//*  63  109:astore_1        
	//*  64  110:new             #128 <Class NullPointerException>
	//*  65  113:dup             
	//*  66  114:invokespecial   #129 <Method void NullPointerException()>
	//*  67  117:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  68  118:astore_1        
		{
			return null;
	//   69  119:aconst_null     
	//   70  120:areturn         
		}
		cancellationsignal = ((CancellationSignal) (getFile(((ParcelFileDescriptor) (afontinfo)))));
		if(cancellationsignal == null) goto _L4; else goto _L3
_L3:
		if(((File) (cancellationsignal)).canRead()) goto _L5; else goto _L4
_L4:
		obj = ((Object) (new FileInputStream(((ParcelFileDescriptor) (afontinfo)).getFileDescriptor())));
		cancellationsignal = null;
		context = ((Context) (super.createFromInputStream(context, ((java.io.InputStream) (obj)))));
		cancellationsignal = ((CancellationSignal) (context));
		if(obj == null) goto _L7; else goto _L6
_L6:
		if(true) goto _L9; else goto _L8
_L8:
		((FileInputStream) (obj)).close();
_L7:
		context = ((Context) (cancellationsignal));
		if(afontinfo == null) goto _L11; else goto _L10
_L10:
		if(true) goto _L13; else goto _L12
_L12:
		((ParcelFileDescriptor) (afontinfo)).close();
		return ((Typeface) (cancellationsignal));
		context;
		throw new NullPointerException();
		context;
	//   71  121:astore_1        
		try
		{
			throw new NullPointerException();
	//   72  122:new             #128 <Class NullPointerException>
	//   73  125:dup             
	//   74  126:invokespecial   #129 <Method void NullPointerException()>
	//   75  129:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context) { }
	//   76  130:astore_1        
		throw context;
	//   77  131:aload_1         
	//   78  132:athrow          
		cancellationsignal;
	//   79  133:astore_2        
_L14:
		if(afontinfo == null)
			break MISSING_BLOCK_LABEL_146;
	//   80  134:aload_3         
	//   81  135:ifnull          146
		if(context == null)
			break MISSING_BLOCK_LABEL_254;
	//   82  138:aload_1         
	//   83  139:ifnull          254
		((ParcelFileDescriptor) (afontinfo)).close();
	//   84  142:aload_3         
	//   85  143:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
_L17:
		throw cancellationsignal;
	//   86  146:aload_2         
	//   87  147:athrow          
_L9:
		((FileInputStream) (obj)).close();
	//   88  148:aload           5
	//   89  150:invokevirtual   #125 <Method void FileInputStream.close()>
		  goto _L7
	//*  90  153:goto            93
		cancellationsignal;
	//   91  156:astore_2        
		context = null;
	//   92  157:aconst_null     
	//   93  158:astore_1        
		  goto _L14
	//*  94  159:goto            134
_L13:
		((ParcelFileDescriptor) (afontinfo)).close();
	//   95  162:aload_3         
	//   96  163:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
		return ((Typeface) (cancellationsignal));
	//   97  166:aload_2         
	//   98  167:areturn         
		context;
	//   99  168:astore_1        
		cancellationsignal = ((CancellationSignal) (context));
	//  100  169:aload_1         
	//  101  170:astore_2        
		throw context;
	//  102  171:aload_1         
	//  103  172:athrow          
		context;
	//  104  173:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_188;
	//  105  174:aload           5
	//  106  176:ifnull          188
		if(cancellationsignal == null)
			break MISSING_BLOCK_LABEL_201;
	//  107  179:aload_2         
	//  108  180:ifnull          201
		((FileInputStream) (obj)).close();
	//  109  183:aload           5
	//  110  185:invokevirtual   #125 <Method void FileInputStream.close()>
_L15:
		throw context;
	//  111  188:aload_1         
	//  112  189:athrow          
		obj;
	//  113  190:astore          5
		((Throwable) (cancellationsignal)).addSuppressed(((Throwable) (obj)));
	//  114  192:aload_2         
	//  115  193:aload           5
	//  116  195:invokevirtual   #133 <Method void Throwable.addSuppressed(Throwable)>
		  goto _L15
	//* 117  198:goto            188
		((FileInputStream) (obj)).close();
	//  118  201:aload           5
	//  119  203:invokevirtual   #125 <Method void FileInputStream.close()>
		  goto _L15
	//* 120  206:goto            188
_L5:
		cancellationsignal = ((CancellationSignal) (Typeface.createFromFile(((File) (cancellationsignal)))));
	//  121  209:aload_2         
	//  122  210:invokestatic    #139 <Method Typeface Typeface.createFromFile(File)>
	//  123  213:astore_2        
		context = ((Context) (cancellationsignal));
	//  124  214:aload_2         
	//  125  215:astore_1        
		if(afontinfo == null) goto _L11; else goto _L16
	//  126  216:aload_3         
	//  127  217:ifnull          8
_L16:
		if(true)
			break MISSING_BLOCK_LABEL_239;
	//  128  220:iconst_0        
	//  129  221:ifeq            239
		((ParcelFileDescriptor) (afontinfo)).close();
	//  130  224:aload_3         
	//  131  225:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
		return ((Typeface) (cancellationsignal));
	//  132  228:aload_2         
	//  133  229:areturn         
		context;
	//  134  230:astore_1        
		throw new NullPointerException();
	//  135  231:new             #128 <Class NullPointerException>
	//  136  234:dup             
	//  137  235:invokespecial   #129 <Method void NullPointerException()>
	//  138  238:athrow          
		((ParcelFileDescriptor) (afontinfo)).close();
	//  139  239:aload_3         
	//  140  240:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
		return ((Typeface) (cancellationsignal));
	//  141  243:aload_2         
	//  142  244:areturn         
		afontinfo;
	//  143  245:astore_3        
		((Throwable) (context)).addSuppressed(((Throwable) (afontinfo)));
	//  144  246:aload_1         
	//  145  247:aload_3         
	//  146  248:invokevirtual   #133 <Method void Throwable.addSuppressed(Throwable)>
		  goto _L17
	//* 147  251:goto            146
		((ParcelFileDescriptor) (afontinfo)).close();
	//  148  254:aload_3         
	//  149  255:invokevirtual   #126 <Method void ParcelFileDescriptor.close()>
		  goto _L17
	//* 150  258:goto            146
	}

	private static final String TAG = "TypefaceCompatApi21Impl";
}
