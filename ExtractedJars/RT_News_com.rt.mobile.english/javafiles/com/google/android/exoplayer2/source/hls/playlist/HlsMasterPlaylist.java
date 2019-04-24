// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.hls.playlist;

import com.google.android.exoplayer2.Format;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.hls.playlist:
//			HlsPlaylist, RenditionKey

public final class HlsMasterPlaylist extends HlsPlaylist
{
	public static final class HlsUrl
	{

		public static HlsUrl createMediaPlaylistHlsUrl(String s)
		{
			return new HlsUrl(s, Format.createContainerFormat("0", "application/x-mpegURL", ((String) (null)), ((String) (null)), -1, 0, ((String) (null))));
		//    0    0:new             #2   <Class HlsMasterPlaylist$HlsUrl>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:ldc1            #25  <String "0">
		//    4    7:ldc1            #27  <String "application/x-mpegURL">
		//    5    9:aconst_null     
		//    6   10:aconst_null     
		//    7   11:iconst_m1       
		//    8   12:iconst_0        
		//    9   13:aconst_null     
		//   10   14:invokestatic    #33  <Method Format Format.createContainerFormat(String, String, String, String, int, int, String)>
		//   11   17:invokespecial   #35  <Method void HlsMasterPlaylist$HlsUrl(String, Format)>
		//   12   20:areturn         
		}

		public final Format format;
		public final String url;

		public HlsUrl(String s, Format format1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			url = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String url>
			format = format1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field Format format>
		//    8   14:return          
		}
	}


	public HlsMasterPlaylist(String s, List list, List list1, List list2, List list3, Format format, List list4)
	{
		super(s, list);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void HlsPlaylist(String, List)>
		variants = Collections.unmodifiableList(list1);
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:invokestatic    #27  <Method List Collections.unmodifiableList(List)>
	//    7   11:putfield        #29  <Field List variants>
		audios = Collections.unmodifiableList(list2);
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:invokestatic    #27  <Method List Collections.unmodifiableList(List)>
	//   11   20:putfield        #31  <Field List audios>
		subtitles = Collections.unmodifiableList(list3);
	//   12   23:aload_0         
	//   13   24:aload           5
	//   14   26:invokestatic    #27  <Method List Collections.unmodifiableList(List)>
	//   15   29:putfield        #33  <Field List subtitles>
		muxedAudioFormat = format;
	//   16   32:aload_0         
	//   17   33:aload           6
	//   18   35:putfield        #35  <Field Format muxedAudioFormat>
		if(list4 != null)
	//*  19   38:aload           7
	//*  20   40:ifnull          52
			s = ((String) (Collections.unmodifiableList(list4)));
	//   21   43:aload           7
	//   22   45:invokestatic    #27  <Method List Collections.unmodifiableList(List)>
	//   23   48:astore_1        
		else
	//*  24   49:goto            54
			s = null;
	//   25   52:aconst_null     
	//   26   53:astore_1        
		muxedCaptionFormats = ((List) (s));
	//   27   54:aload_0         
	//   28   55:aload_1         
	//   29   56:putfield        #37  <Field List muxedCaptionFormats>
	//   30   59:return          
	}

	private static List copyRenditionsList(List list, int i, List list1)
	{
		ArrayList arraylist = new ArrayList(list1.size());
	//    0    0:new             #44  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokeinterface #50  <Method int List.size()>
	//    4   10:invokespecial   #53  <Method void ArrayList(int)>
	//    5   13:astore          5
label0:
		for(int j = 0; j < list.size(); j++)
	//*   6   15:iconst_0        
	//*   7   16:istore_3        
	//*   8   17:iload_3         
	//*   9   18:aload_0         
	//*  10   19:invokeinterface #50  <Method int List.size()>
	//*  11   24:icmpge          113
		{
			HlsUrl hlsurl = (HlsUrl)list.get(j);
	//   12   27:aload_0         
	//   13   28:iload_3         
	//   14   29:invokeinterface #57  <Method Object List.get(int)>
	//   15   34:checkcast       #6   <Class HlsMasterPlaylist$HlsUrl>
	//   16   37:astore          6
			int k = 0;
	//   17   39:iconst_0        
	//   18   40:istore          4
			do
			{
				if(k >= list1.size())
					continue label0;
	//   19   42:iload           4
	//   20   44:aload_2         
	//   21   45:invokeinterface #50  <Method int List.size()>
	//   22   50:icmpge          106
				RenditionKey renditionkey = (RenditionKey)list1.get(k);
	//   23   53:aload_2         
	//   24   54:iload           4
	//   25   56:invokeinterface #57  <Method Object List.get(int)>
	//   26   61:checkcast       #59  <Class RenditionKey>
	//   27   64:astore          7
				if(renditionkey.type == i && renditionkey.trackIndex == j)
	//*  28   66:aload           7
	//*  29   68:getfield        #63  <Field int RenditionKey.type>
	//*  30   71:iload_1         
	//*  31   72:icmpne          97
	//*  32   75:aload           7
	//*  33   77:getfield        #66  <Field int RenditionKey.trackIndex>
	//*  34   80:iload_3         
	//*  35   81:icmpne          97
				{
					((List) (arraylist)).add(((Object) (hlsurl)));
	//   36   84:aload           5
	//   37   86:aload           6
	//   38   88:invokeinterface #70  <Method boolean List.add(Object)>
	//   39   93:pop             
					continue label0;
	//   40   94:goto            106
				}
				k++;
	//   41   97:iload           4
	//   42   99:iconst_1        
	//   43  100:iadd            
	//   44  101:istore          4
			} while(true);
	//   45  103:goto            42
		}

	//   46  106:iload_3         
	//   47  107:iconst_1        
	//   48  108:iadd            
	//   49  109:istore_3        
	//*  50  110:goto            17
		return ((List) (arraylist));
	//   51  113:aload           5
	//   52  115:areturn         
	}

	public static HlsMasterPlaylist createSingleVariantMasterPlaylist(String s)
	{
		s = ((String) (Collections.singletonList(((Object) (HlsUrl.createMediaPlaylistHlsUrl(s))))));
	//    0    0:aload_0         
	//    1    1:invokestatic    #77  <Method HlsMasterPlaylist$HlsUrl HlsMasterPlaylist$HlsUrl.createMediaPlaylistHlsUrl(String)>
	//    2    4:invokestatic    #81  <Method List Collections.singletonList(Object)>
	//    3    7:astore_0        
		List list = Collections.emptyList();
	//    4    8:invokestatic    #85  <Method List Collections.emptyList()>
	//    5   11:astore_1        
		return new HlsMasterPlaylist(((String) (null)), Collections.emptyList(), ((List) (s)), list, list, ((Format) (null)), ((List) (null)));
	//    6   12:new             #2   <Class HlsMasterPlaylist>
	//    7   15:dup             
	//    8   16:aconst_null     
	//    9   17:invokestatic    #85  <Method List Collections.emptyList()>
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_1         
	//   13   23:aconst_null     
	//   14   24:aconst_null     
	//   15   25:invokespecial   #87  <Method void HlsMasterPlaylist(String, List, List, List, List, Format, List)>
	//   16   28:areturn         
	}

	public HlsMasterPlaylist copy(List list)
	{
		return new HlsMasterPlaylist(baseUri, tags, copyRenditionsList(variants, 0, list), copyRenditionsList(audios, 1, list), copyRenditionsList(subtitles, 2, list), muxedAudioFormat, muxedCaptionFormats);
	//    0    0:new             #2   <Class HlsMasterPlaylist>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #93  <Field String baseUri>
	//    4    8:aload_0         
	//    5    9:getfield        #96  <Field List tags>
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field List variants>
	//    8   16:iconst_0        
	//    9   17:aload_1         
	//   10   18:invokestatic    #98  <Method List copyRenditionsList(List, int, List)>
	//   11   21:aload_0         
	//   12   22:getfield        #31  <Field List audios>
	//   13   25:iconst_1        
	//   14   26:aload_1         
	//   15   27:invokestatic    #98  <Method List copyRenditionsList(List, int, List)>
	//   16   30:aload_0         
	//   17   31:getfield        #33  <Field List subtitles>
	//   18   34:iconst_2        
	//   19   35:aload_1         
	//   20   36:invokestatic    #98  <Method List copyRenditionsList(List, int, List)>
	//   21   39:aload_0         
	//   22   40:getfield        #35  <Field Format muxedAudioFormat>
	//   23   43:aload_0         
	//   24   44:getfield        #37  <Field List muxedCaptionFormats>
	//   25   47:invokespecial   #87  <Method void HlsMasterPlaylist(String, List, List, List, List, Format, List)>
	//   26   50:areturn         
	}

	public volatile Object copy(List list)
	{
		return ((Object) (copy(list)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #102 <Method HlsMasterPlaylist copy(List)>
	//    3    5:areturn         
	}

	public final List audios;
	public final Format muxedAudioFormat;
	public final List muxedCaptionFormats;
	public final List subtitles;
	public final List variants;
}
