// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.libphonenumber.android;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package io.michaelrocks.libphonenumber.android:
//			AlternateFormatsCountryCodeSet, ShortNumbersRegionCodeSet, MetadataLoader

final class MetadataManager
{

	MetadataManager(MetadataLoader metadataloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #51  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #52  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #54  <Field ConcurrentHashMap alternateFormatsMap>
	//    7   15:aload_0         
	//    8   16:new             #51  <Class ConcurrentHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #52  <Method void ConcurrentHashMap()>
	//   11   23:putfield        #56  <Field ConcurrentHashMap shortNumberMetadataMap>
	//   12   26:aload_0         
	//   13   27:invokestatic    #62  <Method Set AlternateFormatsCountryCodeSet.getCountryCodeSet()>
	//   14   30:putfield        #64  <Field Set alternateFormatsCountryCodes>
	//   15   33:aload_0         
	//   16   34:invokestatic    #69  <Method Set ShortNumbersRegionCodeSet.getRegionCodeSet()>
	//   17   37:putfield        #71  <Field Set shortNumberMetadataRegionCodes>
		metadataLoader = metadataloader;
	//   18   40:aload_0         
	//   19   41:aload_1         
	//   20   42:putfield        #73  <Field MetadataLoader metadataLoader>
	//   21   45:return          
	}

	private static List getMetadataFromSingleFileName(String s, MetadataLoader metadataloader)
	{
		metadataloader = ((MetadataLoader) (metadataloader.loadMetadata(s)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #81  <Method InputStream MetadataLoader.loadMetadata(String)>
	//    3    7:astore_1        
		if(metadataloader == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       39
			throw new IllegalStateException((new StringBuilder()).append("missing metadata: ").append(s).toString());
	//    6   12:new             #83  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:new             #85  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #86  <Method void StringBuilder()>
	//   11   23:ldc1            #88  <String "missing metadata: ">
	//   12   25:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:aload_0         
	//   14   29:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   16   35:invokespecial   #98  <Method void IllegalStateException(String)>
	//   17   38:athrow          
		metadataloader = ((MetadataLoader) (loadMetadataAndCloseInput(((InputStream) (metadataloader))).getMetadataList()));
	//   18   39:aload_1         
	//   19   40:invokestatic    #102 <Method Phonemetadata$PhoneMetadataCollection loadMetadataAndCloseInput(InputStream)>
	//   20   43:invokevirtual   #108 <Method List Phonemetadata$PhoneMetadataCollection.getMetadataList()>
	//   21   46:astore_1        
		if(((List) (metadataloader)).size() == 0)
	//*  22   47:aload_1         
	//*  23   48:invokeinterface #114 <Method int List.size()>
	//*  24   53:ifne            83
			throw new IllegalStateException((new StringBuilder()).append("empty metadata: ").append(s).toString());
	//   25   56:new             #83  <Class IllegalStateException>
	//   26   59:dup             
	//   27   60:new             #85  <Class StringBuilder>
	//   28   63:dup             
	//   29   64:invokespecial   #86  <Method void StringBuilder()>
	//   30   67:ldc1            #116 <String "empty metadata: ">
	//   31   69:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   32   72:aload_0         
	//   33   73:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   34   76:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   35   79:invokespecial   #98  <Method void IllegalStateException(String)>
	//   36   82:athrow          
		else
			return ((List) (metadataloader));
	//   37   83:aload_1         
	//   38   84:areturn         
	}

	private static Phonemetadata.PhoneMetadataCollection loadMetadataAndCloseInput(InputStream inputstream)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		Object obj = ((Object) (new ObjectInputStream(inputstream)));
	//    2    2:new             #122 <Class ObjectInputStream>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #125 <Method void ObjectInputStream(InputStream)>
	//    6   10:astore_1        
		obj1 = ((Object) (new Phonemetadata.PhoneMetadataCollection()));
	//    7   11:new             #104 <Class Phonemetadata$PhoneMetadataCollection>
	//    8   14:dup             
	//    9   15:invokespecial   #126 <Method void Phonemetadata$PhoneMetadataCollection()>
	//   10   18:astore_2        
		((Phonemetadata.PhoneMetadataCollection) (obj1)).readExternal(((java.io.ObjectInput) (obj)));
	//   11   19:aload_2         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #130 <Method void Phonemetadata$PhoneMetadataCollection.readExternal(java.io.ObjectInput)>
		if(obj != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          77
		{
			Exception exception;
			try
			{
				((ObjectInputStream) (obj)).close();
	//   16   28:aload_1         
	//   17   29:invokevirtual   #133 <Method void ObjectInputStream.close()>
			}
	//*  18   32:aload_2         
	//*  19   33:areturn         
	//*  20   34:astore_1        
	//*  21   35:new             #135 <Class RuntimeException>
	//*  22   38:dup             
	//*  23   39:ldc1            #137 <String "cannot load/parse metadata">
	//*  24   41:aload_1         
	//*  25   42:invokespecial   #140 <Method void RuntimeException(String, Throwable)>
	//*  26   45:athrow          
	//*  27   46:astore_1        
	//*  28   47:aload_2         
	//*  29   48:ifnull          98
	//*  30   51:aload_2         
	//*  31   52:invokevirtual   #133 <Method void ObjectInputStream.close()>
	//*  32   55:aload_1         
	//*  33   56:athrow          
	//*  34   57:astore_2        
	//*  35   58:new             #135 <Class RuntimeException>
	//*  36   61:dup             
	//*  37   62:ldc1            #137 <String "cannot load/parse metadata">
	//*  38   64:aload_2         
	//*  39   65:invokespecial   #140 <Method void RuntimeException(String, Throwable)>
	//*  40   68:athrow          
	//*  41   69:astore_3        
	//*  42   70:aload_1         
	//*  43   71:astore_2        
	//*  44   72:aload_3         
	//*  45   73:astore_1        
	//*  46   74:goto            47
	//*  47   77:aload_0         
	//*  48   78:invokevirtual   #143 <Method void InputStream.close()>
	//*  49   81:aload_2         
	//*  50   82:areturn         
			// Misplaced declaration of an exception variable
			catch(InputStream inputstream)
	//*  51   83:astore_0        
			{
				logger.log(Level.WARNING, "error closing input stream (ignored)", ((Throwable) (inputstream)));
	//   52   84:getstatic       #44  <Field Logger logger>
	//   53   87:getstatic       #149 <Field Level Level.WARNING>
	//   54   90:ldc1            #151 <String "error closing input stream (ignored)">
	//   55   92:aload_0         
	//   56   93:invokevirtual   #155 <Method void Logger.log(Level, String, Throwable)>
				return ((Phonemetadata.PhoneMetadataCollection) (obj1));
	//   57   96:aload_2         
	//   58   97:areturn         
			}
			return ((Phonemetadata.PhoneMetadataCollection) (obj1));
		}
		  goto _L1
		obj;
		throw new RuntimeException("cannot load/parse metadata", ((Throwable) (obj)));
		obj;
_L2:
		if(obj1 == null)
			break MISSING_BLOCK_LABEL_98;
		try
		{
			((ObjectInputStream) (obj1)).close();
		}
	//*  59   98:aload_0         
	//*  60   99:invokevirtual   #143 <Method void InputStream.close()>
	//*  61  102:goto            55
		// Misplaced declaration of an exception variable
		catch(InputStream inputstream)
	//*  62  105:astore_0        
		{
			logger.log(Level.WARNING, "error closing input stream (ignored)", ((Throwable) (inputstream)));
	//   63  106:getstatic       #44  <Field Logger logger>
	//   64  109:getstatic       #149 <Field Level Level.WARNING>
	//   65  112:ldc1            #151 <String "error closing input stream (ignored)">
	//   66  114:aload_0         
	//   67  115:invokevirtual   #155 <Method void Logger.log(Level, String, Throwable)>
		}
_L3:
		throw obj;
		obj1;
		throw new RuntimeException("cannot load/parse metadata", ((Throwable) (obj1)));
		exception;
		obj1 = obj;
		obj = ((Object) (exception));
		  goto _L2
_L1:
		inputstream.close();
		return ((Phonemetadata.PhoneMetadataCollection) (obj1));
		inputstream.close();
		  goto _L3
	//*  68  118:goto            55
	}

	Phonemetadata.PhoneMetadata getAlternateFormatsForCountry(int i, String s)
	{
		if(!alternateFormatsCountryCodes.contains(((Object) (Integer.valueOf(i)))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field Set alternateFormatsCountryCodes>
	//*   2    4:iload_1         
	//*   3    5:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//*   4    8:invokeinterface #169 <Method boolean Set.contains(Object)>
	//*   5   13:ifne            18
			return null;
	//    6   16:aconst_null     
	//    7   17:areturn         
		else
			return getMetadataFromMultiFilePrefix(((Object) (Integer.valueOf(i))), alternateFormatsMap, s);
	//    8   18:aload_0         
	//    9   19:iload_1         
	//   10   20:invokestatic    #163 <Method Integer Integer.valueOf(int)>
	//   11   23:aload_0         
	//   12   24:getfield        #54  <Field ConcurrentHashMap alternateFormatsMap>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #173 <Method Phonemetadata$PhoneMetadata getMetadataFromMultiFilePrefix(Object, ConcurrentHashMap, String)>
	//   15   31:areturn         
	}

	Phonemetadata.PhoneMetadata getMetadataFromMultiFilePrefix(Object obj, ConcurrentHashMap concurrenthashmap, String s)
	{
		Phonemetadata.PhoneMetadata phonemetadata = (Phonemetadata.PhoneMetadata)concurrenthashmap.get(obj);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #177 <Method Object ConcurrentHashMap.get(Object)>
	//    3    5:checkcast       #179 <Class Phonemetadata$PhoneMetadata>
	//    4    8:astore          4
		if(phonemetadata != null)
	//*   5   10:aload           4
	//*   6   12:ifnull          20
		{
			obj = ((Object) (phonemetadata));
	//    7   15:aload           4
	//    8   17:astore_1        
		} else
	//*   9   18:aload_1         
	//*  10   19:areturn         
		{
			s = (new StringBuilder()).append(s).append("_").append(obj).toString();
	//   11   20:new             #85  <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #86  <Method void StringBuilder()>
	//   14   27:aload_3         
	//   15   28:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:ldc1            #181 <String "_">
	//   17   33:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:aload_1         
	//   19   37:invokevirtual   #184 <Method StringBuilder StringBuilder.append(Object)>
	//   20   40:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   21   43:astore_3        
			List list = getMetadataFromSingleFileName(s, metadataLoader);
	//   22   44:aload_3         
	//   23   45:aload_0         
	//   24   46:getfield        #73  <Field MetadataLoader metadataLoader>
	//   25   49:invokestatic    #186 <Method List getMetadataFromSingleFileName(String, MetadataLoader)>
	//   26   52:astore          4
			if(list.size() > 1)
	//*  27   54:aload           4
	//*  28   56:invokeinterface #114 <Method int List.size()>
	//*  29   61:iconst_1        
	//*  30   62:icmple          93
				logger.log(Level.WARNING, (new StringBuilder()).append("more than one metadata in file ").append(s).toString());
	//   31   65:getstatic       #44  <Field Logger logger>
	//   32   68:getstatic       #149 <Field Level Level.WARNING>
	//   33   71:new             #85  <Class StringBuilder>
	//   34   74:dup             
	//   35   75:invokespecial   #86  <Method void StringBuilder()>
	//   36   78:ldc1            #188 <String "more than one metadata in file ">
	//   37   80:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   38   83:aload_3         
	//   39   84:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   40   87:invokevirtual   #95  <Method String StringBuilder.toString()>
	//   41   90:invokevirtual   #191 <Method void Logger.log(Level, String)>
			s = ((String) ((Phonemetadata.PhoneMetadata)list.get(0)));
	//   42   93:aload           4
	//   43   95:iconst_0        
	//   44   96:invokeinterface #194 <Method Object List.get(int)>
	//   45  101:checkcast       #179 <Class Phonemetadata$PhoneMetadata>
	//   46  104:astore_3        
			concurrenthashmap = ((ConcurrentHashMap) ((Phonemetadata.PhoneMetadata)concurrenthashmap.putIfAbsent(obj, ((Object) (s)))));
	//   47  105:aload_2         
	//   48  106:aload_1         
	//   49  107:aload_3         
	//   50  108:invokevirtual   #198 <Method Object ConcurrentHashMap.putIfAbsent(Object, Object)>
	//   51  111:checkcast       #179 <Class Phonemetadata$PhoneMetadata>
	//   52  114:astore_2        
			obj = ((Object) (concurrenthashmap));
	//   53  115:aload_2         
	//   54  116:astore_1        
			if(concurrenthashmap == null)
	//*  55  117:aload_2         
	//*  56  118:ifnonnull       18
				return ((Phonemetadata.PhoneMetadata) (s));
	//   57  121:aload_3         
	//   58  122:areturn         
		}
		return ((Phonemetadata.PhoneMetadata) (obj));
	}

	Phonemetadata.PhoneMetadata getShortNumberMetadataForRegion(String s, String s1)
	{
		if(!shortNumberMetadataRegionCodes.contains(((Object) (s))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field Set shortNumberMetadataRegionCodes>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #169 <Method boolean Set.contains(Object)>
	//*   4   10:ifne            15
			return null;
	//    5   13:aconst_null     
	//    6   14:areturn         
		else
			return getMetadataFromMultiFilePrefix(((Object) (s)), shortNumberMetadataMap, s1);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #56  <Field ConcurrentHashMap shortNumberMetadataMap>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #173 <Method Phonemetadata$PhoneMetadata getMetadataFromMultiFilePrefix(Object, ConcurrentHashMap, String)>
	//   13   25:areturn         
	}

	Set getSupportedShortNumberRegions()
	{
		return Collections.unmodifiableSet(shortNumberMetadataRegionCodes);
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Set shortNumberMetadataRegionCodes>
	//    2    4:invokestatic    #208 <Method Set Collections.unmodifiableSet(Set)>
	//    3    7:areturn         
	}

	static final String ALTERNATE_FORMATS_FILE_PREFIX = "/io/michaelrocks/libphonenumber/android/data/PhoneNumberAlternateFormatsProto";
	static final String MULTI_FILE_PHONE_NUMBER_METADATA_FILE_PREFIX = "/io/michaelrocks/libphonenumber/android/data/PhoneNumberMetadataProto";
	static final String SHORT_NUMBER_METADATA_FILE_PREFIX = "/io/michaelrocks/libphonenumber/android/data/ShortNumberMetadataProto";
	private static final Logger logger = Logger.getLogger(((Class) (io/michaelrocks/libphonenumber/android/MetadataManager)).getName());
	private final Set alternateFormatsCountryCodes = AlternateFormatsCountryCodeSet.getCountryCodeSet();
	private final ConcurrentHashMap alternateFormatsMap = new ConcurrentHashMap();
	private final MetadataLoader metadataLoader;
	private final ConcurrentHashMap shortNumberMetadataMap = new ConcurrentHashMap();
	private final Set shortNumberMetadataRegionCodes = ShortNumbersRegionCodeSet.getRegionCodeSet();

	static 
	{
	//    0    0:ldc1            #2   <Class MetadataManager>
	//    1    2:invokevirtual   #36  <Method String Class.getName()>
	//    2    5:invokestatic    #42  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #44  <Field Logger logger>
	//*   4   11:return          
	}
}
