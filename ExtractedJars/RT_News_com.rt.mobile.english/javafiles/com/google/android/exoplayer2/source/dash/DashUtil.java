// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.source.chunk.ChunkExtractorWrapper;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.*;
import java.io.IOException;
import java.util.List;

public final class DashUtil
{

	private DashUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	private static Representation getFirstRepresentation(Period period, int i)
	{
		i = period.getAdaptationSetIndex(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #18  <Method int Period.getAdaptationSetIndex(int)>
	//    3    5:istore_1        
		if(i == -1)
	//*   4    6:iload_1         
	//*   5    7:iconst_m1       
	//*   6    8:icmpne          13
			return null;
	//    7   11:aconst_null     
	//    8   12:areturn         
		period = ((Period) (((AdaptationSet)period.adaptationSets.get(i)).representations));
	//    9   13:aload_0         
	//   10   14:getfield        #22  <Field List Period.adaptationSets>
	//   11   17:iload_1         
	//   12   18:invokeinterface #28  <Method Object List.get(int)>
	//   13   23:checkcast       #30  <Class AdaptationSet>
	//   14   26:getfield        #33  <Field List AdaptationSet.representations>
	//   15   29:astore_0        
		if(((List) (period)).isEmpty())
	//*  16   30:aload_0         
	//*  17   31:invokeinterface #37  <Method boolean List.isEmpty()>
	//*  18   36:ifeq            41
			return null;
	//   19   39:aconst_null     
	//   20   40:areturn         
		else
			return (Representation)((List) (period)).get(0);
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:invokeinterface #28  <Method Object List.get(int)>
	//   24   48:checkcast       #39  <Class Representation>
	//   25   51:areturn         
	}

	public static ChunkIndex loadChunkIndex(DataSource datasource, int i, Representation representation)
		throws IOException, InterruptedException
	{
		datasource = ((DataSource) (loadInitializationData(datasource, i, representation, true)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_1        
	//    4    4:invokestatic    #50  <Method ChunkExtractorWrapper loadInitializationData(DataSource, int, Representation, boolean)>
	//    5    7:astore_0        
		if(datasource == null)
	//*   6    8:aload_0         
	//*   7    9:ifnonnull       14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		else
			return (ChunkIndex)((ChunkExtractorWrapper) (datasource)).getSeekMap();
	//   10   14:aload_0         
	//   11   15:invokevirtual   #56  <Method com.google.android.exoplayer2.extractor.SeekMap ChunkExtractorWrapper.getSeekMap()>
	//   12   18:checkcast       #58  <Class ChunkIndex>
	//   13   21:areturn         
	}

	public static DrmInitData loadDrmInitData(DataSource datasource, Period period)
		throws IOException, InterruptedException
	{
		byte byte0 = 2;
	//    0    0:iconst_2        
	//    1    1:istore_2        
		Representation representation = getFirstRepresentation(period, 2);
	//    2    2:aload_1         
	//    3    3:iconst_2        
	//    4    4:invokestatic    #63  <Method Representation getFirstRepresentation(Period, int)>
	//    5    7:astore          4
		Object obj = ((Object) (representation));
	//    6    9:aload           4
	//    7   11:astore_3        
		if(representation == null)
	//*   8   12:aload           4
	//*   9   14:ifnonnull       33
		{
			byte0 = 1;
	//   10   17:iconst_1        
	//   11   18:istore_2        
			period = ((Period) (getFirstRepresentation(period, 1)));
	//   12   19:aload_1         
	//   13   20:iconst_1        
	//   14   21:invokestatic    #63  <Method Representation getFirstRepresentation(Period, int)>
	//   15   24:astore_1        
			obj = ((Object) (period));
	//   16   25:aload_1         
	//   17   26:astore_3        
			if(period == null)
	//*  18   27:aload_1         
	//*  19   28:ifnonnull       33
				return null;
	//   20   31:aconst_null     
	//   21   32:areturn         
		}
		period = ((Period) (((Representation) (obj)).format));
	//   22   33:aload_3         
	//   23   34:getfield        #67  <Field Format Representation.format>
	//   24   37:astore_1        
		datasource = ((DataSource) (loadSampleFormat(datasource, ((int) (byte0)), ((Representation) (obj)))));
	//   25   38:aload_0         
	//   26   39:iload_2         
	//   27   40:aload_3         
	//   28   41:invokestatic    #71  <Method Format loadSampleFormat(DataSource, int, Representation)>
	//   29   44:astore_0        
		if(datasource == null)
	//*  30   45:aload_0         
	//*  31   46:ifnonnull       54
			return ((Format) (period)).drmInitData;
	//   32   49:aload_1         
	//   33   50:getfield        #77  <Field DrmInitData Format.drmInitData>
	//   34   53:areturn         
		else
			return ((Format) (datasource)).copyWithManifestFormatInfo(((Format) (period))).drmInitData;
	//   35   54:aload_0         
	//   36   55:aload_1         
	//   37   56:invokevirtual   #81  <Method Format Format.copyWithManifestFormatInfo(Format)>
	//   38   59:getfield        #77  <Field DrmInitData Format.drmInitData>
	//   39   62:areturn         
	}

	private static ChunkExtractorWrapper loadInitializationData(DataSource datasource, int i, Representation representation, boolean flag)
		throws IOException, InterruptedException
	{
		RangedUri rangeduri1 = representation.getInitializationUri();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #85  <Method RangedUri Representation.getInitializationUri()>
	//    2    4:astore          5
		if(rangeduri1 == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		ChunkExtractorWrapper chunkextractorwrapper = newWrappedExtractor(i, representation.format);
	//    7   13:iload_1         
	//    8   14:aload_2         
	//    9   15:getfield        #67  <Field Format Representation.format>
	//   10   18:invokestatic    #89  <Method ChunkExtractorWrapper newWrappedExtractor(int, Format)>
	//   11   21:astore          7
		RangedUri rangeduri = rangeduri1;
	//   12   23:aload           5
	//   13   25:astore          4
		if(flag)
	//*  14   27:iload_3         
	//*  15   28:ifeq            78
		{
			rangeduri = representation.getIndexUri();
	//   16   31:aload_2         
	//   17   32:invokevirtual   #92  <Method RangedUri Representation.getIndexUri()>
	//   18   35:astore          4
			if(rangeduri == null)
	//*  19   37:aload           4
	//*  20   39:ifnonnull       44
				return null;
	//   21   42:aconst_null     
	//   22   43:areturn         
			RangedUri rangeduri2 = rangeduri1.attemptMerge(rangeduri, representation.baseUrl);
	//   23   44:aload           5
	//   24   46:aload           4
	//   25   48:aload_2         
	//   26   49:getfield        #96  <Field String Representation.baseUrl>
	//   27   52:invokevirtual   #102 <Method RangedUri RangedUri.attemptMerge(RangedUri, String)>
	//   28   55:astore          6
			if(rangeduri2 == null)
	//*  29   57:aload           6
	//*  30   59:ifnonnull       74
				loadInitializationData(datasource, representation, chunkextractorwrapper, rangeduri1);
	//   31   62:aload_0         
	//   32   63:aload_2         
	//   33   64:aload           7
	//   34   66:aload           5
	//   35   68:invokestatic    #105 <Method void loadInitializationData(DataSource, Representation, ChunkExtractorWrapper, RangedUri)>
			else
	//*  36   71:goto            78
				rangeduri = rangeduri2;
	//   37   74:aload           6
	//   38   76:astore          4
		}
		loadInitializationData(datasource, representation, chunkextractorwrapper, rangeduri);
	//   39   78:aload_0         
	//   40   79:aload_2         
	//   41   80:aload           7
	//   42   82:aload           4
	//   43   84:invokestatic    #105 <Method void loadInitializationData(DataSource, Representation, ChunkExtractorWrapper, RangedUri)>
		return chunkextractorwrapper;
	//   44   87:aload           7
	//   45   89:areturn         
	}

	private static void loadInitializationData(DataSource datasource, Representation representation, ChunkExtractorWrapper chunkextractorwrapper, RangedUri rangeduri)
		throws IOException, InterruptedException
	{
		(new InitializationChunk(datasource, new DataSpec(rangeduri.resolveUri(representation.baseUrl), rangeduri.start, rangeduri.length, representation.getCacheKey()), representation.format, 0, ((Object) (null)), chunkextractorwrapper)).load();
	//    0    0:new             #107 <Class InitializationChunk>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #109 <Class DataSpec>
	//    4    8:dup             
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:getfield        #96  <Field String Representation.baseUrl>
	//    8   14:invokevirtual   #113 <Method Uri RangedUri.resolveUri(String)>
	//    9   17:aload_3         
	//   10   18:getfield        #117 <Field long RangedUri.start>
	//   11   21:aload_3         
	//   12   22:getfield        #120 <Field long RangedUri.length>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #124 <Method String Representation.getCacheKey()>
	//   15   29:invokespecial   #127 <Method void DataSpec(Uri, long, long, String)>
	//   16   32:aload_1         
	//   17   33:getfield        #67  <Field Format Representation.format>
	//   18   36:iconst_0        
	//   19   37:aconst_null     
	//   20   38:aload_2         
	//   21   39:invokespecial   #130 <Method void InitializationChunk(DataSource, DataSpec, Format, int, Object, ChunkExtractorWrapper)>
	//   22   42:invokevirtual   #133 <Method void InitializationChunk.load()>
	//   23   45:return          
	}

	public static DashManifest loadManifest(DataSource datasource, Uri uri)
		throws IOException
	{
		return (DashManifest)ParsingLoadable.load(datasource, ((com.google.android.exoplayer2.upstream.ParsingLoadable.Parser) (new DashManifestParser())), uri);
	//    0    0:aload_0         
	//    1    1:new             #137 <Class DashManifestParser>
	//    2    4:dup             
	//    3    5:invokespecial   #138 <Method void DashManifestParser()>
	//    4    8:aload_1         
	//    5    9:invokestatic    #143 <Method Object ParsingLoadable.load(DataSource, com.google.android.exoplayer2.upstream.ParsingLoadable$Parser, Uri)>
	//    6   12:checkcast       #145 <Class DashManifest>
	//    7   15:areturn         
	}

	public static Format loadSampleFormat(DataSource datasource, int i, Representation representation)
		throws IOException, InterruptedException
	{
		datasource = ((DataSource) (loadInitializationData(datasource, i, representation, false)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokestatic    #50  <Method ChunkExtractorWrapper loadInitializationData(DataSource, int, Representation, boolean)>
	//    5    7:astore_0        
		if(datasource == null)
	//*   6    8:aload_0         
	//*   7    9:ifnonnull       14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		else
			return ((ChunkExtractorWrapper) (datasource)).getSampleFormats()[0];
	//   10   14:aload_0         
	//   11   15:invokevirtual   #149 <Method Format[] ChunkExtractorWrapper.getSampleFormats()>
	//   12   18:iconst_0        
	//   13   19:aaload          
	//   14   20:areturn         
	}

	private static ChunkExtractorWrapper newWrappedExtractor(int i, Format format)
	{
		Object obj = ((Object) (format.containerMimeType));
	//    0    0:aload_1         
	//    1    1:getfield        #152 <Field String Format.containerMimeType>
	//    2    4:astore_3        
		boolean flag;
		if(obj != null && (((String) (obj)).startsWith("video/webm") || ((String) (obj)).startsWith("audio/webm")))
	//*   3    5:aload_3         
	//*   4    6:ifnull          32
	//*   5    9:aload_3         
	//*   6   10:ldc1            #154 <String "video/webm">
	//*   7   12:invokevirtual   #160 <Method boolean String.startsWith(String)>
	//*   8   15:ifne            27
	//*   9   18:aload_3         
	//*  10   19:ldc1            #162 <String "audio/webm">
	//*  11   21:invokevirtual   #160 <Method boolean String.startsWith(String)>
	//*  12   24:ifeq            32
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_2        
		else
	//*  15   29:goto            34
			flag = false;
	//   16   32:iconst_0        
	//   17   33:istore_2        
		if(flag)
	//*  18   34:iload_2         
	//*  19   35:ifeq            49
			obj = ((Object) (new MatroskaExtractor()));
	//   20   38:new             #164 <Class MatroskaExtractor>
	//   21   41:dup             
	//   22   42:invokespecial   #165 <Method void MatroskaExtractor()>
	//   23   45:astore_3        
		else
	//*  24   46:goto            57
			obj = ((Object) (new FragmentedMp4Extractor()));
	//   25   49:new             #167 <Class FragmentedMp4Extractor>
	//   26   52:dup             
	//   27   53:invokespecial   #168 <Method void FragmentedMp4Extractor()>
	//   28   56:astore_3        
		return new ChunkExtractorWrapper(((com.google.android.exoplayer2.extractor.Extractor) (obj)), i, format);
	//   29   57:new             #52  <Class ChunkExtractorWrapper>
	//   30   60:dup             
	//   31   61:aload_3         
	//   32   62:iload_0         
	//   33   63:aload_1         
	//   34   64:invokespecial   #171 <Method void ChunkExtractorWrapper(com.google.android.exoplayer2.extractor.Extractor, int, Format)>
	//   35   67:areturn         
	}
}
