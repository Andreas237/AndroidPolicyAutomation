// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.michaelrocks.libphonenumber.android;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package io.michaelrocks.libphonenumber.android:
//			MetadataSource, MetadataManager, CountryCodeToRegionCodeMap, MetadataLoader

final class MultiFileMetadataSourceImpl
	implements MetadataSource
{

	MultiFileMetadataSourceImpl(MetadataLoader metadataloader)
	{
		this("/io/michaelrocks/libphonenumber/android/data/PhoneNumberMetadataProto", "/io/michaelrocks/libphonenumber/android/data/PhoneNumberAlternateFormatsProto", "/io/michaelrocks/libphonenumber/android/data/ShortNumberMetadataProto", metadataloader);
	//    0    0:aload_0         
	//    1    1:ldc1            #21  <String "/io/michaelrocks/libphonenumber/android/data/PhoneNumberMetadataProto">
	//    2    3:ldc1            #23  <String "/io/michaelrocks/libphonenumber/android/data/PhoneNumberAlternateFormatsProto">
	//    3    5:ldc1            #25  <String "/io/michaelrocks/libphonenumber/android/data/ShortNumberMetadataProto">
	//    4    7:aload_1         
	//    5    8:invokespecial   #28  <Method void MultiFileMetadataSourceImpl(String, String, String, MetadataLoader)>
	//    6   11:return          
	}

	MultiFileMetadataSourceImpl(String s, String s1, String s2, MetadataLoader metadataloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		geographicalRegions = new ConcurrentHashMap();
	//    2    4:aload_0         
	//    3    5:new             #34  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #37  <Field ConcurrentHashMap geographicalRegions>
		nonGeographicalRegions = new ConcurrentHashMap();
	//    7   15:aload_0         
	//    8   16:new             #34  <Class ConcurrentHashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #35  <Method void ConcurrentHashMap()>
	//   11   23:putfield        #39  <Field ConcurrentHashMap nonGeographicalRegions>
		phoneNumberMetadataFilePrefix = s;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #41  <Field String phoneNumberMetadataFilePrefix>
		alternateFormatsFilePrefix = s1;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #43  <Field String alternateFormatsFilePrefix>
		shortNumberFilePrefix = s2;
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:putfield        #45  <Field String shortNumberFilePrefix>
		metadataManager = new MetadataManager(metadataloader);
	//   21   41:aload_0         
	//   22   42:new             #47  <Class MetadataManager>
	//   23   45:dup             
	//   24   46:aload           4
	//   25   48:invokespecial   #49  <Method void MetadataManager(MetadataLoader)>
	//   26   51:putfield        #51  <Field MetadataManager metadataManager>
	//   27   54:return          
	}

	private boolean isNonGeographical(int i)
	{
		List list = (List)CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap().get(((Object) (Integer.valueOf(i))));
	//    0    0:invokestatic    #59  <Method Map CountryCodeToRegionCodeMap.getCountryCodeToRegionCodeMap()>
	//    1    3:iload_1         
	//    2    4:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//    3    7:invokeinterface #71  <Method Object Map.get(Object)>
	//    4   12:checkcast       #73  <Class List>
	//    5   15:astore_2        
		return list.size() == 1 && "001".equals(list.get(0));
	//    6   16:aload_2         
	//    7   17:invokeinterface #77  <Method int List.size()>
	//    8   22:iconst_1        
	//    9   23:icmpne          43
	//   10   26:ldc1            #79  <String "001">
	//   11   28:aload_2         
	//   12   29:iconst_0        
	//   13   30:invokeinterface #82  <Method Object List.get(int)>
	//   14   35:invokevirtual   #88  <Method boolean String.equals(Object)>
	//   15   38:ifeq            43
	//   16   41:iconst_1        
	//   17   42:ireturn         
	//   18   43:iconst_0        
	//   19   44:ireturn         
	}

	public Phonemetadata.PhoneMetadata getAlternateFormatsForCountry(int i)
	{
		return metadataManager.getAlternateFormatsForCountry(i, alternateFormatsFilePrefix);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field MetadataManager metadataManager>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field String alternateFormatsFilePrefix>
	//    5    9:invokevirtual   #93  <Method Phonemetadata$PhoneMetadata MetadataManager.getAlternateFormatsForCountry(int, String)>
	//    6   12:areturn         
	}

	public Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i)
	{
		if(!isNonGeographical(i))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:invokespecial   #96  <Method boolean isNonGeographical(int)>
	//*   3    5:ifne            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		else
			return metadataManager.getMetadataFromMultiFilePrefix(((Object) (Integer.valueOf(i))), nonGeographicalRegions, phoneNumberMetadataFilePrefix);
	//    6   10:aload_0         
	//    7   11:getfield        #51  <Field MetadataManager metadataManager>
	//    8   14:iload_1         
	//    9   15:invokestatic    #65  <Method Integer Integer.valueOf(int)>
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field ConcurrentHashMap nonGeographicalRegions>
	//   12   22:aload_0         
	//   13   23:getfield        #41  <Field String phoneNumberMetadataFilePrefix>
	//   14   26:invokevirtual   #100 <Method Phonemetadata$PhoneMetadata MetadataManager.getMetadataFromMultiFilePrefix(Object, ConcurrentHashMap, String)>
	//   15   29:areturn         
	}

	public Phonemetadata.PhoneMetadata getMetadataForRegion(String s)
	{
		return metadataManager.getMetadataFromMultiFilePrefix(((Object) (s)), geographicalRegions, phoneNumberMetadataFilePrefix);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field MetadataManager metadataManager>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #37  <Field ConcurrentHashMap geographicalRegions>
	//    5    9:aload_0         
	//    6   10:getfield        #41  <Field String phoneNumberMetadataFilePrefix>
	//    7   13:invokevirtual   #100 <Method Phonemetadata$PhoneMetadata MetadataManager.getMetadataFromMultiFilePrefix(Object, ConcurrentHashMap, String)>
	//    8   16:areturn         
	}

	public Phonemetadata.PhoneMetadata getShortNumberMetadataForRegion(String s)
	{
		return metadataManager.getShortNumberMetadataForRegion(s, shortNumberFilePrefix);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field MetadataManager metadataManager>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field String shortNumberFilePrefix>
	//    5    9:invokevirtual   #106 <Method Phonemetadata$PhoneMetadata MetadataManager.getShortNumberMetadataForRegion(String, String)>
	//    6   12:areturn         
	}

	private final String alternateFormatsFilePrefix;
	private final ConcurrentHashMap geographicalRegions;
	private final MetadataManager metadataManager;
	private final ConcurrentHashMap nonGeographicalRegions;
	private final String phoneNumberMetadataFilePrefix;
	private final String shortNumberFilePrefix;
}
