// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import android.util.*;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.extractor.*;
import com.google.android.exoplayer.util.*;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//			TrackFragment, DefaultSampleValues, Track, TrackEncryptionBox, 
//			Atom, PsshAtomUtil, AtomParsers, Sniffer

public class FragmentedMp4Extractor
	implements Extractor
{
	private static final class TrackBundle
	{

		public void init(Track track1, DefaultSampleValues defaultsamplevalues)
		{
			track = (Track)Assertions.checkNotNull(((Object) (track1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
		//    3    5:checkcast       #40  <Class Track>
		//    4    8:putfield        #42  <Field Track track>
			defaultSampleValues = (DefaultSampleValues)Assertions.checkNotNull(((Object) (defaultsamplevalues)));
		//    5   11:aload_0         
		//    6   12:aload_2         
		//    7   13:invokestatic    #38  <Method Object Assertions.checkNotNull(Object)>
		//    8   16:checkcast       #44  <Class DefaultSampleValues>
		//    9   19:putfield        #46  <Field DefaultSampleValues defaultSampleValues>
			output.format(track1.mediaFormat);
		//   10   22:aload_0         
		//   11   23:getfield        #29  <Field TrackOutput output>
		//   12   26:aload_1         
		//   13   27:getfield        #50  <Field com.google.android.exoplayer.MediaFormat Track.mediaFormat>
		//   14   30:invokeinterface #56  <Method void TrackOutput.format(com.google.android.exoplayer.MediaFormat)>
			reset();
		//   15   35:aload_0         
		//   16   36:invokevirtual   #59  <Method void reset()>
		//   17   39:return          
		}

		public void reset()
		{
			fragment.reset();
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field TrackFragment fragment>
		//    2    4:invokevirtual   #60  <Method void TrackFragment.reset()>
			currentSampleIndex = 0;
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:putfield        #62  <Field int currentSampleIndex>
		//    6   12:return          
		}

		public int currentSampleIndex;
		public DefaultSampleValues defaultSampleValues;
		public final TrackFragment fragment = new TrackFragment();
		public final TrackOutput output;
		public Track track;

		public TrackBundle(TrackOutput trackoutput)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #24  <Class TrackFragment>
		//    4    8:dup             
		//    5    9:invokespecial   #25  <Method void TrackFragment()>
		//    6   12:putfield        #27  <Field TrackFragment fragment>
			output = trackoutput;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #29  <Field TrackOutput output>
		//   10   20:return          
		}
	}


	public FragmentedMp4Extractor()
	{
		this(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #94  <Method void FragmentedMp4Extractor(int)>
	//    3    5:return          
	}

	public FragmentedMp4Extractor(int i)
	{
		this(i, ((Track) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #97  <Method void FragmentedMp4Extractor(int, Track)>
	//    4    6:return          
	}

	public FragmentedMp4Extractor(int i, Track track)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #99  <Method void Object()>
		sideloadedTrack = track;
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:putfield        #101 <Field Track sideloadedTrack>
		byte byte0;
		if(track != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          18
			byte0 = 4;
	//    7   13:iconst_4        
	//    8   14:istore_3        
		else
	//*   9   15:goto            20
			byte0 = 0;
	//   10   18:iconst_0        
	//   11   19:istore_3        
		flags = i | byte0;
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:iload_3         
	//   15   23:ior             
	//   16   24:putfield        #103 <Field int flags>
		atomHeader = new ParsableByteArray(16);
	//   17   27:aload_0         
	//   18   28:new             #105 <Class ParsableByteArray>
	//   19   31:dup             
	//   20   32:bipush          16
	//   21   34:invokespecial   #106 <Method void ParsableByteArray(int)>
	//   22   37:putfield        #108 <Field ParsableByteArray atomHeader>
		nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
	//   23   40:aload_0         
	//   24   41:new             #105 <Class ParsableByteArray>
	//   25   44:dup             
	//   26   45:getstatic       #113 <Field byte[] NalUnitUtil.NAL_START_CODE>
	//   27   48:invokespecial   #116 <Method void ParsableByteArray(byte[])>
	//   28   51:putfield        #118 <Field ParsableByteArray nalStartCode>
		nalLength = new ParsableByteArray(4);
	//   29   54:aload_0         
	//   30   55:new             #105 <Class ParsableByteArray>
	//   31   58:dup             
	//   32   59:iconst_4        
	//   33   60:invokespecial   #106 <Method void ParsableByteArray(int)>
	//   34   63:putfield        #120 <Field ParsableByteArray nalLength>
		encryptionSignalByte = new ParsableByteArray(1);
	//   35   66:aload_0         
	//   36   67:new             #105 <Class ParsableByteArray>
	//   37   70:dup             
	//   38   71:iconst_1        
	//   39   72:invokespecial   #106 <Method void ParsableByteArray(int)>
	//   40   75:putfield        #122 <Field ParsableByteArray encryptionSignalByte>
		extendedTypeScratch = new byte[16];
	//   41   78:aload_0         
	//   42   79:bipush          16
	//   43   81:newarray        byte[]
	//   44   83:putfield        #124 <Field byte[] extendedTypeScratch>
		containerAtoms = new Stack();
	//   45   86:aload_0         
	//   46   87:new             #126 <Class Stack>
	//   47   90:dup             
	//   48   91:invokespecial   #127 <Method void Stack()>
	//   49   94:putfield        #129 <Field Stack containerAtoms>
		trackBundles = new SparseArray();
	//   50   97:aload_0         
	//   51   98:new             #131 <Class SparseArray>
	//   52  101:dup             
	//   53  102:invokespecial   #132 <Method void SparseArray()>
	//   54  105:putfield        #134 <Field SparseArray trackBundles>
		enterReadingAtomHeaderState();
	//   55  108:aload_0         
	//   56  109:invokespecial   #137 <Method void enterReadingAtomHeaderState()>
	//   57  112:return          
	}

	private int appendSampleEncryptionData(TrackBundle trackbundle)
	{
		TrackFragment trackfragment = trackbundle.fragment;
	//    0    0:aload_1         
	//    1    1:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//    2    4:astore          7
		ParsableByteArray parsablebytearray = trackfragment.sampleEncryptionData;
	//    3    6:aload           7
	//    4    8:getfield        #148 <Field ParsableByteArray TrackFragment.sampleEncryptionData>
	//    5   11:astore          6
		int i = trackfragment.header.sampleDescriptionIndex;
	//    6   13:aload           7
	//    7   15:getfield        #152 <Field DefaultSampleValues TrackFragment.header>
	//    8   18:getfield        #157 <Field int DefaultSampleValues.sampleDescriptionIndex>
	//    9   21:istore_2        
		TrackEncryptionBox trackencryptionbox;
		if(trackfragment.trackEncryptionBox != null)
	//*  10   22:aload           7
	//*  11   24:getfield        #161 <Field TrackEncryptionBox TrackFragment.trackEncryptionBox>
	//*  12   27:ifnull          40
			trackencryptionbox = trackfragment.trackEncryptionBox;
	//   13   30:aload           7
	//   14   32:getfield        #161 <Field TrackEncryptionBox TrackFragment.trackEncryptionBox>
	//   15   35:astore          5
		else
	//*  16   37:goto            51
			trackencryptionbox = trackbundle.track.sampleDescriptionEncryptionBoxes[i];
	//   17   40:aload_1         
	//   18   41:getfield        #164 <Field Track FragmentedMp4Extractor$TrackBundle.track>
	//   19   44:getfield        #170 <Field TrackEncryptionBox[] Track.sampleDescriptionEncryptionBoxes>
	//   20   47:iload_2         
	//   21   48:aaload          
	//   22   49:astore          5
		int k = trackencryptionbox.initializationVectorSize;
	//   23   51:aload           5
	//   24   53:getfield        #175 <Field int TrackEncryptionBox.initializationVectorSize>
	//   25   56:istore_3        
		boolean flag = trackfragment.sampleHasSubsampleEncryptionTable[trackbundle.currentSampleIndex];
	//   26   57:aload           7
	//   27   59:getfield        #179 <Field boolean[] TrackFragment.sampleHasSubsampleEncryptionTable>
	//   28   62:aload_1         
	//   29   63:getfield        #182 <Field int FragmentedMp4Extractor$TrackBundle.currentSampleIndex>
	//   30   66:baload          
	//   31   67:istore          4
		byte abyte0[] = encryptionSignalByte.data;
	//   32   69:aload_0         
	//   33   70:getfield        #122 <Field ParsableByteArray encryptionSignalByte>
	//   34   73:getfield        #185 <Field byte[] ParsableByteArray.data>
	//   35   76:astore          5
		if(flag)
	//*  36   78:iload           4
	//*  37   80:ifeq            90
			i = 128;
	//   38   83:sipush          128
	//   39   86:istore_2        
		else
	//*  40   87:goto            92
			i = 0;
	//   41   90:iconst_0        
	//   42   91:istore_2        
		abyte0[0] = (byte)(i | k);
	//   43   92:aload           5
	//   44   94:iconst_0        
	//   45   95:iload_2         
	//   46   96:iload_3         
	//   47   97:ior             
	//   48   98:int2byte        
	//   49   99:bastore         
		encryptionSignalByte.setPosition(0);
	//   50  100:aload_0         
	//   51  101:getfield        #122 <Field ParsableByteArray encryptionSignalByte>
	//   52  104:iconst_0        
	//   53  105:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		trackbundle = ((TrackBundle) (trackbundle.output));
	//   54  108:aload_1         
	//   55  109:getfield        #192 <Field TrackOutput FragmentedMp4Extractor$TrackBundle.output>
	//   56  112:astore_1        
		((TrackOutput) (trackbundle)).sampleData(encryptionSignalByte, 1);
	//   57  113:aload_1         
	//   58  114:aload_0         
	//   59  115:getfield        #122 <Field ParsableByteArray encryptionSignalByte>
	//   60  118:iconst_1        
	//   61  119:invokeinterface #198 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		((TrackOutput) (trackbundle)).sampleData(parsablebytearray, k);
	//   62  124:aload_1         
	//   63  125:aload           6
	//   64  127:iload_3         
	//   65  128:invokeinterface #198 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
		if(!flag)
	//*  66  133:iload           4
	//*  67  135:ifne            142
		{
			return k + 1;
	//   68  138:iload_3         
	//   69  139:iconst_1        
	//   70  140:iadd            
	//   71  141:ireturn         
		} else
		{
			int j = parsablebytearray.readUnsignedShort();
	//   72  142:aload           6
	//   73  144:invokevirtual   #202 <Method int ParsableByteArray.readUnsignedShort()>
	//   74  147:istore_2        
			parsablebytearray.skipBytes(-2);
	//   75  148:aload           6
	//   76  150:bipush          -2
	//   77  152:invokevirtual   #205 <Method void ParsableByteArray.skipBytes(int)>
			j = j * 6 + 2;
	//   78  155:iload_2         
	//   79  156:bipush          6
	//   80  158:imul            
	//   81  159:iconst_2        
	//   82  160:iadd            
	//   83  161:istore_2        
			((TrackOutput) (trackbundle)).sampleData(parsablebytearray, j);
	//   84  162:aload_1         
	//   85  163:aload           6
	//   86  165:iload_2         
	//   87  166:invokeinterface #198 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
			return k + 1 + j;
	//   88  171:iload_3         
	//   89  172:iconst_1        
	//   90  173:iadd            
	//   91  174:iload_2         
	//   92  175:iadd            
	//   93  176:ireturn         
		}
	}

	private void enterReadingAtomHeaderState()
	{
		parserState = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #207 <Field int parserState>
		atomHeaderBytesRead = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #209 <Field int atomHeaderBytesRead>
	//    6   10:return          
	}

	private static com.google.android.exoplayer.drm.DrmInitData.Mapped getDrmInitDataFromAtoms(List list)
	{
		int j = list.size();
	//    0    0:aload_0         
	//    1    1:invokeinterface #216 <Method int List.size()>
	//    2    6:istore_2        
		byte abyte0[] = null;
	//    3    7:aconst_null     
	//    4    8:astore_3        
		for(int i = 0; i < j;)
	//*   5    9:iconst_0        
	//*   6   10:istore_1        
	//*   7   11:iload_1         
	//*   8   12:iload_2         
	//*   9   13:icmpge          114
		{
			Atom.LeafAtom leafatom = (Atom.LeafAtom)list.get(i);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:invokeinterface #220 <Method Object List.get(int)>
	//   13   23:checkcast       #222 <Class Atom$LeafAtom>
	//   14   26:astore          5
			Object obj = ((Object) (abyte0));
	//   15   28:aload_3         
	//   16   29:astore          4
			if(leafatom.type == Atom.TYPE_pssh)
	//*  17   31:aload           5
	//*  18   33:getfield        #225 <Field int Atom$LeafAtom.type>
	//*  19   36:getstatic       #230 <Field int Atom.TYPE_pssh>
	//*  20   39:icmpne          104
			{
				obj = ((Object) (abyte0));
	//   21   42:aload_3         
	//   22   43:astore          4
				if(abyte0 == null)
	//*  23   45:aload_3         
	//*  24   46:ifnonnull       58
					obj = ((Object) (new com.google.android.exoplayer.drm.DrmInitData.Mapped()));
	//   25   49:new             #232 <Class com.google.android.exoplayer.drm.DrmInitData$Mapped>
	//   26   52:dup             
	//   27   53:invokespecial   #233 <Method void com.google.android.exoplayer.drm.DrmInitData$Mapped()>
	//   28   56:astore          4
				abyte0 = leafatom.data.data;
	//   29   58:aload           5
	//   30   60:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//   31   63:getfield        #185 <Field byte[] ParsableByteArray.data>
	//   32   66:astore_3        
				if(PsshAtomUtil.parseUuid(abyte0) == null)
	//*  33   67:aload_3         
	//*  34   68:invokestatic    #241 <Method java.util.UUID PsshAtomUtil.parseUuid(byte[])>
	//*  35   71:ifnonnull       85
					Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
	//   36   74:ldc1            #30  <String "FragmentedMp4Extractor">
	//   37   76:ldc1            #243 <String "Skipped pssh atom (failed to extract uuid)">
	//   38   78:invokestatic    #249 <Method int Log.w(String, String)>
	//   39   81:pop             
				else
	//*  40   82:goto            104
					((com.google.android.exoplayer.drm.DrmInitData.Mapped) (obj)).put(PsshAtomUtil.parseUuid(abyte0), new com.google.android.exoplayer.drm.DrmInitData.SchemeInitData("video/mp4", abyte0));
	//   41   85:aload           4
	//   42   87:aload_3         
	//   43   88:invokestatic    #241 <Method java.util.UUID PsshAtomUtil.parseUuid(byte[])>
	//   44   91:new             #251 <Class com.google.android.exoplayer.drm.DrmInitData$SchemeInitData>
	//   45   94:dup             
	//   46   95:ldc1            #253 <String "video/mp4">
	//   47   97:aload_3         
	//   48   98:invokespecial   #256 <Method void com.google.android.exoplayer.drm.DrmInitData$SchemeInitData(String, byte[])>
	//   49  101:invokevirtual   #260 <Method void com.google.android.exoplayer.drm.DrmInitData$Mapped.put(java.util.UUID, com.google.android.exoplayer.drm.DrmInitData$SchemeInitData)>
			}
			i++;
	//   50  104:iload_1         
	//   51  105:iconst_1        
	//   52  106:iadd            
	//   53  107:istore_1        
			abyte0 = ((byte []) (obj));
	//   54  108:aload           4
	//   55  110:astore_3        
		}

	//*  56  111:goto            11
		return ((com.google.android.exoplayer.drm.DrmInitData.Mapped) (abyte0));
	//   57  114:aload_3         
	//   58  115:areturn         
	}

	private static TrackBundle getNextFragmentRun(SparseArray sparsearray)
	{
		int j = sparsearray.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #265 <Method int SparseArray.size()>
	//    2    4:istore_2        
		TrackBundle trackbundle = null;
	//    3    5:aconst_null     
	//    4    6:astore          9
		long l = 0xffffffffL;
	//    5    8:ldc2w           #266 <Long 0xffffffffL>
	//    6   11:lstore_3        
		for(int i = 0; i < j;)
	//*   7   12:iconst_0        
	//*   8   13:istore_1        
	//*   9   14:iload_1         
	//*  10   15:iload_2         
	//*  11   16:icmpge          89
		{
			TrackBundle trackbundle1 = (TrackBundle)sparsearray.valueAt(i);
	//   12   19:aload_0         
	//   13   20:iload_1         
	//   14   21:invokevirtual   #270 <Method Object SparseArray.valueAt(int)>
	//   15   24:checkcast       #8   <Class FragmentedMp4Extractor$TrackBundle>
	//   16   27:astore          10
			long l1;
			if(trackbundle1.currentSampleIndex == trackbundle1.fragment.length)
	//*  17   29:aload           10
	//*  18   31:getfield        #182 <Field int FragmentedMp4Extractor$TrackBundle.currentSampleIndex>
	//*  19   34:aload           10
	//*  20   36:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//*  21   39:getfield        #273 <Field int TrackFragment.length>
	//*  22   42:icmpne          51
			{
				l1 = l;
	//   23   45:lload_3         
	//   24   46:lstore          5
			} else
	//*  25   48:goto            79
			{
				long l2 = trackbundle1.fragment.dataPosition;
	//   26   51:aload           10
	//   27   53:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   28   56:getfield        #276 <Field long TrackFragment.dataPosition>
	//   29   59:lstore          7
				l1 = l;
	//   30   61:lload_3         
	//   31   62:lstore          5
				if(l2 < l)
	//*  32   64:lload           7
	//*  33   66:lload_3         
	//*  34   67:lcmp            
	//*  35   68:ifge            79
				{
					trackbundle = trackbundle1;
	//   36   71:aload           10
	//   37   73:astore          9
					l1 = l2;
	//   38   75:lload           7
	//   39   77:lstore          5
				}
			}
			i++;
	//   40   79:iload_1         
	//   41   80:iconst_1        
	//   42   81:iadd            
	//   43   82:istore_1        
			l = l1;
	//   44   83:lload           5
	//   45   85:lstore_3        
		}

	//*  46   86:goto            14
		return trackbundle;
	//   47   89:aload           9
	//   48   91:areturn         
	}

	private void onContainerAtomRead(Atom.ContainerAtom containeratom)
		throws ParserException
	{
		if(containeratom.type == Atom.TYPE_moov)
	//*   0    0:aload_1         
	//*   1    1:getfield        #284 <Field int Atom$ContainerAtom.type>
	//*   2    4:getstatic       #287 <Field int Atom.TYPE_moov>
	//*   3    7:icmpne          16
		{
			onMoovContainerAtomRead(containeratom);
	//    4   10:aload_0         
	//    5   11:aload_1         
	//    6   12:invokespecial   #290 <Method void onMoovContainerAtomRead(Atom$ContainerAtom)>
			return;
	//    7   15:return          
		}
		if(containeratom.type == Atom.TYPE_moof)
	//*   8   16:aload_1         
	//*   9   17:getfield        #284 <Field int Atom$ContainerAtom.type>
	//*  10   20:getstatic       #293 <Field int Atom.TYPE_moof>
	//*  11   23:icmpne          32
		{
			onMoofContainerAtomRead(containeratom);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:invokespecial   #296 <Method void onMoofContainerAtomRead(Atom$ContainerAtom)>
			return;
	//   15   31:return          
		}
		if(!containerAtoms.isEmpty())
	//*  16   32:aload_0         
	//*  17   33:getfield        #129 <Field Stack containerAtoms>
	//*  18   36:invokevirtual   #300 <Method boolean Stack.isEmpty()>
	//*  19   39:ifne            56
			((Atom.ContainerAtom)containerAtoms.peek()).add(containeratom);
	//   20   42:aload_0         
	//   21   43:getfield        #129 <Field Stack containerAtoms>
	//   22   46:invokevirtual   #304 <Method Object Stack.peek()>
	//   23   49:checkcast       #283 <Class Atom$ContainerAtom>
	//   24   52:aload_1         
	//   25   53:invokevirtual   #307 <Method void Atom$ContainerAtom.add(Atom$ContainerAtom)>
	//   26   56:return          
	}

	private void onLeafAtomRead(Atom.LeafAtom leafatom, long l)
		throws ParserException
	{
		if(!containerAtoms.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #129 <Field Stack containerAtoms>
	//*   2    4:invokevirtual   #300 <Method boolean Stack.isEmpty()>
	//*   3    7:ifne            25
		{
			((Atom.ContainerAtom)containerAtoms.peek()).add(leafatom);
	//    4   10:aload_0         
	//    5   11:getfield        #129 <Field Stack containerAtoms>
	//    6   14:invokevirtual   #304 <Method Object Stack.peek()>
	//    7   17:checkcast       #283 <Class Atom$ContainerAtom>
	//    8   20:aload_1         
	//    9   21:invokevirtual   #313 <Method void Atom$ContainerAtom.add(Atom$LeafAtom)>
			return;
	//   10   24:return          
		}
		if(leafatom.type == Atom.TYPE_sidx)
	//*  11   25:aload_1         
	//*  12   26:getfield        #225 <Field int Atom$LeafAtom.type>
	//*  13   29:getstatic       #316 <Field int Atom.TYPE_sidx>
	//*  14   32:icmpne          60
		{
			leafatom = ((Atom.LeafAtom) (parseSidx(leafatom.data, l)));
	//   15   35:aload_1         
	//   16   36:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//   17   39:lload_2         
	//   18   40:invokestatic    #320 <Method ChunkIndex parseSidx(ParsableByteArray, long)>
	//   19   43:astore_1        
			extractorOutput.seekMap(((SeekMap) (leafatom)));
	//   20   44:aload_0         
	//   21   45:getfield        #322 <Field ExtractorOutput extractorOutput>
	//   22   48:aload_1         
	//   23   49:invokeinterface #328 <Method void ExtractorOutput.seekMap(SeekMap)>
			haveOutputSeekMap = true;
	//   24   54:aload_0         
	//   25   55:iconst_1        
	//   26   56:putfield        #330 <Field boolean haveOutputSeekMap>
			return;
	//   27   59:return          
		}
		if(leafatom.type == Atom.TYPE_emsg)
	//*  28   60:aload_1         
	//*  29   61:getfield        #225 <Field int Atom$LeafAtom.type>
	//*  30   64:getstatic       #333 <Field int Atom.TYPE_emsg>
	//*  31   67:icmpne          79
			parseEmsg(leafatom.data, l);
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//   35   75:lload_2         
	//   36   76:invokevirtual   #337 <Method void parseEmsg(ParsableByteArray, long)>
	//   37   79:return          
	}

	private void onMoofContainerAtomRead(Atom.ContainerAtom containeratom)
		throws ParserException
	{
		parseMoof(containeratom, trackBundles, flags, extendedTypeScratch);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #134 <Field SparseArray trackBundles>
	//    3    5:aload_0         
	//    4    6:getfield        #103 <Field int flags>
	//    5    9:aload_0         
	//    6   10:getfield        #124 <Field byte[] extendedTypeScratch>
	//    7   13:invokestatic    #341 <Method void parseMoof(Atom$ContainerAtom, SparseArray, int, byte[])>
		containeratom = ((Atom.ContainerAtom) (getDrmInitDataFromAtoms(containeratom.leafChildren)));
	//    8   16:aload_1         
	//    9   17:getfield        #345 <Field List Atom$ContainerAtom.leafChildren>
	//   10   20:invokestatic    #347 <Method com.google.android.exoplayer.drm.DrmInitData$Mapped getDrmInitDataFromAtoms(List)>
	//   11   23:astore_1        
		if(containeratom != null)
	//*  12   24:aload_1         
	//*  13   25:ifnull          38
			extractorOutput.drmInitData(((com.google.android.exoplayer.drm.DrmInitData) (containeratom)));
	//   14   28:aload_0         
	//   15   29:getfield        #322 <Field ExtractorOutput extractorOutput>
	//   16   32:aload_1         
	//   17   33:invokeinterface #351 <Method void ExtractorOutput.drmInitData(com.google.android.exoplayer.drm.DrmInitData)>
	//   18   38:return          
	}

	private void onMoovContainerAtomRead(Atom.ContainerAtom containeratom)
	{
		Object obj = ((Object) (sideloadedTrack));
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Track sideloadedTrack>
	//    2    4:astore          9
		boolean flag3 = true;
	//    3    6:iconst_1        
	//    4    7:istore          6
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		boolean flag1;
		if(obj == null)
	//*   7   11:aload           9
	//*   8   13:ifnonnull       22
			flag1 = true;
	//    9   16:iconst_1        
	//   10   17:istore          5
		else
	//*  11   19:goto            25
			flag1 = false;
	//   12   22:iconst_0        
	//   13   23:istore          5
		Assertions.checkState(flag1, "Unexpected moov box.");
	//   14   25:iload           5
	//   15   27:ldc2            #353 <String "Unexpected moov box.">
	//   16   30:invokestatic    #359 <Method void Assertions.checkState(boolean, Object)>
		obj = ((Object) (getDrmInitDataFromAtoms(containeratom.leafChildren)));
	//   17   33:aload_1         
	//   18   34:getfield        #345 <Field List Atom$ContainerAtom.leafChildren>
	//   19   37:invokestatic    #347 <Method com.google.android.exoplayer.drm.DrmInitData$Mapped getDrmInitDataFromAtoms(List)>
	//   20   40:astore          9
		if(obj != null)
	//*  21   42:aload           9
	//*  22   44:ifnull          58
			extractorOutput.drmInitData(((com.google.android.exoplayer.drm.DrmInitData) (obj)));
	//   23   47:aload_0         
	//   24   48:getfield        #322 <Field ExtractorOutput extractorOutput>
	//   25   51:aload           9
	//   26   53:invokeinterface #351 <Method void ExtractorOutput.drmInitData(com.google.android.exoplayer.drm.DrmInitData)>
		Object obj1 = ((Object) (containeratom.getContainerAtomOfType(Atom.TYPE_mvex)));
	//   27   58:aload_1         
	//   28   59:getstatic       #362 <Field int Atom.TYPE_mvex>
	//   29   62:invokevirtual   #366 <Method Atom$ContainerAtom Atom$ContainerAtom.getContainerAtomOfType(int)>
	//   30   65:astore          10
		obj = ((Object) (new SparseArray()));
	//   31   67:new             #131 <Class SparseArray>
	//   32   70:dup             
	//   33   71:invokespecial   #132 <Method void SparseArray()>
	//   34   74:astore          9
		int i1 = ((Atom.ContainerAtom) (obj1)).leafChildren.size();
	//   35   76:aload           10
	//   36   78:getfield        #345 <Field List Atom$ContainerAtom.leafChildren>
	//   37   81:invokeinterface #216 <Method int List.size()>
	//   38   86:istore          4
		long l1 = -1L;
	//   39   88:ldc2w           #367 <Long -1L>
	//   40   91:lstore          7
		for(int i = 0; i < i1; i++)
	//*  41   93:iconst_0        
	//*  42   94:istore_2        
	//*  43   95:iload_2         
	//*  44   96:iload           4
	//*  45   98:icmpge          190
		{
			Object obj2 = ((Object) ((Atom.LeafAtom)((Atom.ContainerAtom) (obj1)).leafChildren.get(i)));
	//   46  101:aload           10
	//   47  103:getfield        #345 <Field List Atom$ContainerAtom.leafChildren>
	//   48  106:iload_2         
	//   49  107:invokeinterface #220 <Method Object List.get(int)>
	//   50  112:checkcast       #222 <Class Atom$LeafAtom>
	//   51  115:astore          11
			if(((Atom.LeafAtom) (obj2)).type == Atom.TYPE_trex)
	//*  52  117:aload           11
	//*  53  119:getfield        #225 <Field int Atom$LeafAtom.type>
	//*  54  122:getstatic       #371 <Field int Atom.TYPE_trex>
	//*  55  125:icmpne          162
			{
				obj2 = ((Object) (parseTrex(((Atom.LeafAtom) (obj2)).data)));
	//   56  128:aload           11
	//   57  130:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//   58  133:invokestatic    #375 <Method Pair parseTrex(ParsableByteArray)>
	//   59  136:astore          11
				((SparseArray) (obj)).put(((Integer)((Pair) (obj2)).first).intValue(), ((Pair) (obj2)).second);
	//   60  138:aload           9
	//   61  140:aload           11
	//   62  142:getfield        #381 <Field Object Pair.first>
	//   63  145:checkcast       #383 <Class Integer>
	//   64  148:invokevirtual   #386 <Method int Integer.intValue()>
	//   65  151:aload           11
	//   66  153:getfield        #389 <Field Object Pair.second>
	//   67  156:invokevirtual   #392 <Method void SparseArray.put(int, Object)>
				continue;
	//   68  159:goto            183
			}
			if(((Atom.LeafAtom) (obj2)).type == Atom.TYPE_mehd)
	//*  69  162:aload           11
	//*  70  164:getfield        #225 <Field int Atom$LeafAtom.type>
	//*  71  167:getstatic       #395 <Field int Atom.TYPE_mehd>
	//*  72  170:icmpne          183
				l1 = parseMehd(((Atom.LeafAtom) (obj2)).data);
	//   73  173:aload           11
	//   74  175:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//   75  178:invokestatic    #399 <Method long parseMehd(ParsableByteArray)>
	//   76  181:lstore          7
		}

	//   77  183:iload_2         
	//   78  184:iconst_1        
	//   79  185:iadd            
	//   80  186:istore_2        
	//*  81  187:goto            95
		obj1 = ((Object) (new SparseArray()));
	//   82  190:new             #131 <Class SparseArray>
	//   83  193:dup             
	//   84  194:invokespecial   #132 <Method void SparseArray()>
	//   85  197:astore          10
		i1 = containeratom.containerChildren.size();
	//   86  199:aload_1         
	//   87  200:getfield        #402 <Field List Atom$ContainerAtom.containerChildren>
	//   88  203:invokeinterface #216 <Method int List.size()>
	//   89  208:istore          4
		for(int j = 0; j < i1; j++)
	//*  90  210:iconst_0        
	//*  91  211:istore_2        
	//*  92  212:iload_2         
	//*  93  213:iload           4
	//*  94  215:icmpge          285
		{
			Object obj3 = ((Object) ((Atom.ContainerAtom)containeratom.containerChildren.get(j)));
	//   95  218:aload_1         
	//   96  219:getfield        #402 <Field List Atom$ContainerAtom.containerChildren>
	//   97  222:iload_2         
	//   98  223:invokeinterface #220 <Method Object List.get(int)>
	//   99  228:checkcast       #283 <Class Atom$ContainerAtom>
	//  100  231:astore          11
			if(((Atom.ContainerAtom) (obj3)).type != Atom.TYPE_trak)
				continue;
	//  101  233:aload           11
	//  102  235:getfield        #284 <Field int Atom$ContainerAtom.type>
	//  103  238:getstatic       #405 <Field int Atom.TYPE_trak>
	//  104  241:icmpne          278
			obj3 = ((Object) (AtomParsers.parseTrak(((Atom.ContainerAtom) (obj3)), containeratom.getLeafAtomOfType(Atom.TYPE_mvhd), l1, false)));
	//  105  244:aload           11
	//  106  246:aload_1         
	//  107  247:getstatic       #408 <Field int Atom.TYPE_mvhd>
	//  108  250:invokevirtual   #412 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//  109  253:lload           7
	//  110  255:iconst_0        
	//  111  256:invokestatic    #418 <Method Track AtomParsers.parseTrak(Atom$ContainerAtom, Atom$LeafAtom, long, boolean)>
	//  112  259:astore          11
			if(obj3 != null)
	//* 113  261:aload           11
	//* 114  263:ifnull          278
				((SparseArray) (obj1)).put(((Track) (obj3)).id, obj3);
	//  115  266:aload           10
	//  116  268:aload           11
	//  117  270:getfield        #421 <Field int Track.id>
	//  118  273:aload           11
	//  119  275:invokevirtual   #392 <Method void SparseArray.put(int, Object)>
		}

	//  120  278:iload_2         
	//  121  279:iconst_1        
	//  122  280:iadd            
	//  123  281:istore_2        
	//* 124  282:goto            212
		i1 = ((SparseArray) (obj1)).size();
	//  125  285:aload           10
	//  126  287:invokevirtual   #265 <Method int SparseArray.size()>
	//  127  290:istore          4
		int l;
		if(trackBundles.size() == 0)
	//* 128  292:aload_0         
	//* 129  293:getfield        #134 <Field SparseArray trackBundles>
	//* 130  296:invokevirtual   #265 <Method int SparseArray.size()>
	//* 131  299:ifne            367
		{
			for(int k = 0; k < i1; k++)
	//* 132  302:iconst_0        
	//* 133  303:istore_2        
	//* 134  304:iload_2         
	//* 135  305:iload           4
	//* 136  307:icmpge          353
				trackBundles.put(((Track)((SparseArray) (obj1)).valueAt(k)).id, ((Object) (new TrackBundle(extractorOutput.track(k)))));
	//  137  310:aload_0         
	//  138  311:getfield        #134 <Field SparseArray trackBundles>
	//  139  314:aload           10
	//  140  316:iload_2         
	//  141  317:invokevirtual   #270 <Method Object SparseArray.valueAt(int)>
	//  142  320:checkcast       #166 <Class Track>
	//  143  323:getfield        #421 <Field int Track.id>
	//  144  326:new             #8   <Class FragmentedMp4Extractor$TrackBundle>
	//  145  329:dup             
	//  146  330:aload_0         
	//  147  331:getfield        #322 <Field ExtractorOutput extractorOutput>
	//  148  334:iload_2         
	//  149  335:invokeinterface #424 <Method TrackOutput ExtractorOutput.track(int)>
	//  150  340:invokespecial   #427 <Method void FragmentedMp4Extractor$TrackBundle(TrackOutput)>
	//  151  343:invokevirtual   #392 <Method void SparseArray.put(int, Object)>

	//  152  346:iload_2         
	//  153  347:iconst_1        
	//  154  348:iadd            
	//  155  349:istore_2        
	//* 156  350:goto            304
			extractorOutput.endTracks();
	//  157  353:aload_0         
	//  158  354:getfield        #322 <Field ExtractorOutput extractorOutput>
	//  159  357:invokeinterface #430 <Method void ExtractorOutput.endTracks()>
			l = ((int) (flag));
	//  160  362:iload_3         
	//  161  363:istore_2        
		} else
	//* 162  364:goto            396
		{
			boolean flag2;
			if(trackBundles.size() == i1)
	//* 163  367:aload_0         
	//* 164  368:getfield        #134 <Field SparseArray trackBundles>
	//* 165  371:invokevirtual   #265 <Method int SparseArray.size()>
	//* 166  374:iload           4
	//* 167  376:icmpne          386
				flag2 = flag3;
	//  168  379:iload           6
	//  169  381:istore          5
			else
	//* 170  383:goto            389
				flag2 = false;
	//  171  386:iconst_0        
	//  172  387:istore          5
			Assertions.checkState(flag2);
	//  173  389:iload           5
	//  174  391:invokestatic    #433 <Method void Assertions.checkState(boolean)>
			l = ((int) (flag));
	//  175  394:iload_3         
	//  176  395:istore_2        
		}
		for(; l < i1; l++)
	//* 177  396:iload_2         
	//* 178  397:iload           4
	//* 179  399:icmpge          449
		{
			containeratom = ((Atom.ContainerAtom) ((Track)((SparseArray) (obj1)).valueAt(l)));
	//  180  402:aload           10
	//  181  404:iload_2         
	//  182  405:invokevirtual   #270 <Method Object SparseArray.valueAt(int)>
	//  183  408:checkcast       #166 <Class Track>
	//  184  411:astore_1        
			((TrackBundle)trackBundles.get(((Track) (containeratom)).id)).init(((Track) (containeratom)), (DefaultSampleValues)((SparseArray) (obj)).get(((Track) (containeratom)).id));
	//  185  412:aload_0         
	//  186  413:getfield        #134 <Field SparseArray trackBundles>
	//  187  416:aload_1         
	//  188  417:getfield        #421 <Field int Track.id>
	//  189  420:invokevirtual   #434 <Method Object SparseArray.get(int)>
	//  190  423:checkcast       #8   <Class FragmentedMp4Extractor$TrackBundle>
	//  191  426:aload_1         
	//  192  427:aload           9
	//  193  429:aload_1         
	//  194  430:getfield        #421 <Field int Track.id>
	//  195  433:invokevirtual   #434 <Method Object SparseArray.get(int)>
	//  196  436:checkcast       #154 <Class DefaultSampleValues>
	//  197  439:invokevirtual   #438 <Method void FragmentedMp4Extractor$TrackBundle.init(Track, DefaultSampleValues)>
		}

	//  198  442:iload_2         
	//  199  443:iconst_1        
	//  200  444:iadd            
	//  201  445:istore_2        
	//* 202  446:goto            396
	//  203  449:return          
	}

	private static long parseMehd(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		if(Atom.parseFullAtomVersion(parsablebytearray.readInt()) == 0)
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//*   5   10:invokestatic    #445 <Method int Atom.parseFullAtomVersion(int)>
	//*   6   13:ifne            21
			return parsablebytearray.readUnsignedInt();
	//    7   16:aload_0         
	//    8   17:invokevirtual   #449 <Method long ParsableByteArray.readUnsignedInt()>
	//    9   20:lreturn         
		else
			return parsablebytearray.readUnsignedLongToLong();
	//   10   21:aload_0         
	//   11   22:invokevirtual   #452 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   12   25:lreturn         
	}

	private static void parseMoof(Atom.ContainerAtom containeratom, SparseArray sparsearray, int i, byte abyte0[])
		throws ParserException
	{
		int k = containeratom.containerChildren.size();
	//    0    0:aload_0         
	//    1    1:getfield        #402 <Field List Atom$ContainerAtom.containerChildren>
	//    2    4:invokeinterface #216 <Method int List.size()>
	//    3    9:istore          5
		for(int j = 0; j < k; j++)
	//*   4   11:iconst_0        
	//*   5   12:istore          4
	//*   6   14:iload           4
	//*   7   16:iload           5
	//*   8   18:icmpge          65
		{
			Atom.ContainerAtom containeratom1 = (Atom.ContainerAtom)containeratom.containerChildren.get(j);
	//    9   21:aload_0         
	//   10   22:getfield        #402 <Field List Atom$ContainerAtom.containerChildren>
	//   11   25:iload           4
	//   12   27:invokeinterface #220 <Method Object List.get(int)>
	//   13   32:checkcast       #283 <Class Atom$ContainerAtom>
	//   14   35:astore          6
			if(containeratom1.type == Atom.TYPE_traf)
	//*  15   37:aload           6
	//*  16   39:getfield        #284 <Field int Atom$ContainerAtom.type>
	//*  17   42:getstatic       #455 <Field int Atom.TYPE_traf>
	//*  18   45:icmpne          56
				parseTraf(containeratom1, sparsearray, i, abyte0);
	//   19   48:aload           6
	//   20   50:aload_1         
	//   21   51:iload_2         
	//   22   52:aload_3         
	//   23   53:invokestatic    #458 <Method void parseTraf(Atom$ContainerAtom, SparseArray, int, byte[])>
		}

	//   24   56:iload           4
	//   25   58:iconst_1        
	//   26   59:iadd            
	//   27   60:istore          4
	//*  28   62:goto            14
	//   29   65:return          
	}

	private static void parseSaio(ParsableByteArray parsablebytearray, TrackFragment trackfragment)
		throws ParserException
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		int i = parsablebytearray.readInt();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//    5   10:istore_2        
		if((Atom.parseFullAtomFlags(i) & 1) == 1)
	//*   6   11:iload_2         
	//*   7   12:invokestatic    #464 <Method int Atom.parseFullAtomFlags(int)>
	//*   8   15:iconst_1        
	//*   9   16:iand            
	//*  10   17:iconst_1        
	//*  11   18:icmpne          27
			parsablebytearray.skipBytes(8);
	//   12   21:aload_0         
	//   13   22:bipush          8
	//   14   24:invokevirtual   #205 <Method void ParsableByteArray.skipBytes(int)>
		int j = parsablebytearray.readUnsignedIntToInt();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   17   31:istore_3        
		if(j == 1)
	//*  18   32:iload_3         
	//*  19   33:iconst_1        
	//*  20   34:icmpne          77
		{
			i = Atom.parseFullAtomVersion(i);
	//   21   37:iload_2         
	//   22   38:invokestatic    #445 <Method int Atom.parseFullAtomVersion(int)>
	//   23   41:istore_2        
			long l1 = trackfragment.auxiliaryDataPosition;
	//   24   42:aload_1         
	//   25   43:getfield        #470 <Field long TrackFragment.auxiliaryDataPosition>
	//   26   46:lstore          6
			long l;
			if(i == 0)
	//*  27   48:iload_2         
	//*  28   49:ifne            61
				l = parsablebytearray.readUnsignedInt();
	//   29   52:aload_0         
	//   30   53:invokevirtual   #449 <Method long ParsableByteArray.readUnsignedInt()>
	//   31   56:lstore          4
			else
	//*  32   58:goto            67
				l = parsablebytearray.readUnsignedLongToLong();
	//   33   61:aload_0         
	//   34   62:invokevirtual   #452 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   35   65:lstore          4
			trackfragment.auxiliaryDataPosition = l1 + l;
	//   36   67:aload_1         
	//   37   68:lload           6
	//   38   70:lload           4
	//   39   72:ladd            
	//   40   73:putfield        #470 <Field long TrackFragment.auxiliaryDataPosition>
			return;
	//   41   76:return          
		} else
		{
			parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   42   77:new             #472 <Class StringBuilder>
	//   43   80:dup             
	//   44   81:invokespecial   #473 <Method void StringBuilder()>
	//   45   84:astore_0        
			((StringBuilder) (parsablebytearray)).append("Unexpected saio entry count: ");
	//   46   85:aload_0         
	//   47   86:ldc2            #475 <String "Unexpected saio entry count: ">
	//   48   89:invokevirtual   #479 <Method StringBuilder StringBuilder.append(String)>
	//   49   92:pop             
			((StringBuilder) (parsablebytearray)).append(j);
	//   50   93:aload_0         
	//   51   94:iload_3         
	//   52   95:invokevirtual   #482 <Method StringBuilder StringBuilder.append(int)>
	//   53   98:pop             
			throw new ParserException(((StringBuilder) (parsablebytearray)).toString());
	//   54   99:new             #281 <Class ParserException>
	//   55  102:dup             
	//   56  103:aload_0         
	//   57  104:invokevirtual   #486 <Method String StringBuilder.toString()>
	//   58  107:invokespecial   #489 <Method void ParserException(String)>
	//   59  110:athrow          
		}
	}

	private static void parseSaiz(TrackEncryptionBox trackencryptionbox, ParsableByteArray parsablebytearray, TrackFragment trackfragment)
		throws ParserException
	{
		int l = trackencryptionbox.initializationVectorSize;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field int TrackEncryptionBox.initializationVectorSize>
	//    2    4:istore          6
		parsablebytearray.setPosition(8);
	//    3    6:aload_1         
	//    4    7:bipush          8
	//    5    9:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		int i = Atom.parseFullAtomFlags(parsablebytearray.readInt());
	//    6   12:aload_1         
	//    7   13:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//    8   16:invokestatic    #464 <Method int Atom.parseFullAtomFlags(int)>
	//    9   19:istore_3        
		boolean flag = true;
	//   10   20:iconst_1        
	//   11   21:istore          8
		if((i & 1) == 1)
	//*  12   23:iload_3         
	//*  13   24:iconst_1        
	//*  14   25:iand            
	//*  15   26:iconst_1        
	//*  16   27:icmpne          36
			parsablebytearray.skipBytes(8);
	//   17   30:aload_1         
	//   18   31:bipush          8
	//   19   33:invokevirtual   #205 <Method void ParsableByteArray.skipBytes(int)>
		i = parsablebytearray.readUnsignedByte();
	//   20   36:aload_1         
	//   21   37:invokevirtual   #494 <Method int ParsableByteArray.readUnsignedByte()>
	//   22   40:istore_3        
		int i1 = parsablebytearray.readUnsignedIntToInt();
	//   23   41:aload_1         
	//   24   42:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   25   45:istore          7
		if(i1 == trackfragment.length)
	//*  26   47:iload           7
	//*  27   49:aload_2         
	//*  28   50:getfield        #273 <Field int TrackFragment.length>
	//*  29   53:icmpne          162
		{
			int k;
			if(i == 0)
	//*  30   56:iload_3         
	//*  31   57:ifne            123
			{
				trackencryptionbox = ((TrackEncryptionBox) (trackfragment.sampleHasSubsampleEncryptionTable));
	//   32   60:aload_2         
	//   33   61:getfield        #179 <Field boolean[] TrackFragment.sampleHasSubsampleEncryptionTable>
	//   34   64:astore_0        
				int j = 0;
	//   35   65:iconst_0        
	//   36   66:istore          4
				i = j;
	//   37   68:iload           4
	//   38   70:istore_3        
				do
				{
					k = i;
	//   39   71:iload_3         
	//   40   72:istore          5
					if(j >= i1)
						break;
	//   41   74:iload           4
	//   42   76:iload           7
	//   43   78:icmpge          155
					k = parsablebytearray.readUnsignedByte();
	//   44   81:aload_1         
	//   45   82:invokevirtual   #494 <Method int ParsableByteArray.readUnsignedByte()>
	//   46   85:istore          5
					i += k;
	//   47   87:iload_3         
	//   48   88:iload           5
	//   49   90:iadd            
	//   50   91:istore_3        
					if(k > l)
	//*  51   92:iload           5
	//*  52   94:iload           6
	//*  53   96:icmple          105
						flag = true;
	//   54   99:iconst_1        
	//   55  100:istore          8
					else
	//*  56  102:goto            108
						flag = false;
	//   57  105:iconst_0        
	//   58  106:istore          8
					trackencryptionbox[j] = ((byte) (flag));
	//   59  108:aload_0         
	//   60  109:iload           4
	//   61  111:iload           8
	//   62  113:bastore         
					j++;
	//   63  114:iload           4
	//   64  116:iconst_1        
	//   65  117:iadd            
	//   66  118:istore          4
				} while(true);
	//   67  120:goto            71
			} else
			{
				if(i <= l)
	//*  68  123:iload_3         
	//*  69  124:iload           6
	//*  70  126:icmple          132
	//*  71  129:goto            135
					flag = false;
	//   72  132:iconst_0        
	//   73  133:istore          8
				k = i * i1 + 0;
	//   74  135:iload_3         
	//   75  136:iload           7
	//   76  138:imul            
	//   77  139:iconst_0        
	//   78  140:iadd            
	//   79  141:istore          5
				Arrays.fill(trackfragment.sampleHasSubsampleEncryptionTable, 0, i1, flag);
	//   80  143:aload_2         
	//   81  144:getfield        #179 <Field boolean[] TrackFragment.sampleHasSubsampleEncryptionTable>
	//   82  147:iconst_0        
	//   83  148:iload           7
	//   84  150:iload           8
	//   85  152:invokestatic    #500 <Method void Arrays.fill(boolean[], int, int, boolean)>
			}
			trackfragment.initEncryptionData(k);
	//   86  155:aload_2         
	//   87  156:iload           5
	//   88  158:invokevirtual   #503 <Method void TrackFragment.initEncryptionData(int)>
			return;
	//   89  161:return          
		} else
		{
			trackencryptionbox = ((TrackEncryptionBox) (new StringBuilder()));
	//   90  162:new             #472 <Class StringBuilder>
	//   91  165:dup             
	//   92  166:invokespecial   #473 <Method void StringBuilder()>
	//   93  169:astore_0        
			((StringBuilder) (trackencryptionbox)).append("Length mismatch: ");
	//   94  170:aload_0         
	//   95  171:ldc2            #505 <String "Length mismatch: ">
	//   96  174:invokevirtual   #479 <Method StringBuilder StringBuilder.append(String)>
	//   97  177:pop             
			((StringBuilder) (trackencryptionbox)).append(i1);
	//   98  178:aload_0         
	//   99  179:iload           7
	//  100  181:invokevirtual   #482 <Method StringBuilder StringBuilder.append(int)>
	//  101  184:pop             
			((StringBuilder) (trackencryptionbox)).append(", ");
	//  102  185:aload_0         
	//  103  186:ldc2            #507 <String ", ">
	//  104  189:invokevirtual   #479 <Method StringBuilder StringBuilder.append(String)>
	//  105  192:pop             
			((StringBuilder) (trackencryptionbox)).append(trackfragment.length);
	//  106  193:aload_0         
	//  107  194:aload_2         
	//  108  195:getfield        #273 <Field int TrackFragment.length>
	//  109  198:invokevirtual   #482 <Method StringBuilder StringBuilder.append(int)>
	//  110  201:pop             
			throw new ParserException(((StringBuilder) (trackencryptionbox)).toString());
	//  111  202:new             #281 <Class ParserException>
	//  112  205:dup             
	//  113  206:aload_0         
	//  114  207:invokevirtual   #486 <Method String StringBuilder.toString()>
	//  115  210:invokespecial   #489 <Method void ParserException(String)>
	//  116  213:athrow          
		}
	}

	private static void parseSenc(ParsableByteArray parsablebytearray, int i, TrackFragment trackfragment)
		throws ParserException
	{
		parsablebytearray.setPosition(i + 8);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:iadd            
	//    4    5:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		i = Atom.parseFullAtomFlags(parsablebytearray.readInt());
	//    5    8:aload_0         
	//    6    9:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//    7   12:invokestatic    #464 <Method int Atom.parseFullAtomFlags(int)>
	//    8   15:istore_1        
		if((i & 1) == 0)
	//*   9   16:iload_1         
	//*  10   17:iconst_1        
	//*  11   18:iand            
	//*  12   19:ifne            123
		{
			boolean flag;
			if((i & 2) != 0)
	//*  13   22:iload_1         
	//*  14   23:iconst_2        
	//*  15   24:iand            
	//*  16   25:ifeq            33
				flag = true;
	//   17   28:iconst_1        
	//   18   29:istore_3        
			else
	//*  19   30:goto            35
				flag = false;
	//   20   33:iconst_0        
	//   21   34:istore_3        
			i = parsablebytearray.readUnsignedIntToInt();
	//   22   35:aload_0         
	//   23   36:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   24   39:istore_1        
			if(i == trackfragment.length)
	//*  25   40:iload_1         
	//*  26   41:aload_2         
	//*  27   42:getfield        #273 <Field int TrackFragment.length>
	//*  28   45:icmpne          72
			{
				Arrays.fill(trackfragment.sampleHasSubsampleEncryptionTable, 0, i, flag);
	//   29   48:aload_2         
	//   30   49:getfield        #179 <Field boolean[] TrackFragment.sampleHasSubsampleEncryptionTable>
	//   31   52:iconst_0        
	//   32   53:iload_1         
	//   33   54:iload_3         
	//   34   55:invokestatic    #500 <Method void Arrays.fill(boolean[], int, int, boolean)>
				trackfragment.initEncryptionData(parsablebytearray.bytesLeft());
	//   35   58:aload_2         
	//   36   59:aload_0         
	//   37   60:invokevirtual   #512 <Method int ParsableByteArray.bytesLeft()>
	//   38   63:invokevirtual   #503 <Method void TrackFragment.initEncryptionData(int)>
				trackfragment.fillEncryptionData(parsablebytearray);
	//   39   66:aload_2         
	//   40   67:aload_0         
	//   41   68:invokevirtual   #516 <Method void TrackFragment.fillEncryptionData(ParsableByteArray)>
				return;
	//   42   71:return          
			} else
			{
				parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
	//   43   72:new             #472 <Class StringBuilder>
	//   44   75:dup             
	//   45   76:invokespecial   #473 <Method void StringBuilder()>
	//   46   79:astore_0        
				((StringBuilder) (parsablebytearray)).append("Length mismatch: ");
	//   47   80:aload_0         
	//   48   81:ldc2            #505 <String "Length mismatch: ">
	//   49   84:invokevirtual   #479 <Method StringBuilder StringBuilder.append(String)>
	//   50   87:pop             
				((StringBuilder) (parsablebytearray)).append(i);
	//   51   88:aload_0         
	//   52   89:iload_1         
	//   53   90:invokevirtual   #482 <Method StringBuilder StringBuilder.append(int)>
	//   54   93:pop             
				((StringBuilder) (parsablebytearray)).append(", ");
	//   55   94:aload_0         
	//   56   95:ldc2            #507 <String ", ">
	//   57   98:invokevirtual   #479 <Method StringBuilder StringBuilder.append(String)>
	//   58  101:pop             
				((StringBuilder) (parsablebytearray)).append(trackfragment.length);
	//   59  102:aload_0         
	//   60  103:aload_2         
	//   61  104:getfield        #273 <Field int TrackFragment.length>
	//   62  107:invokevirtual   #482 <Method StringBuilder StringBuilder.append(int)>
	//   63  110:pop             
				throw new ParserException(((StringBuilder) (parsablebytearray)).toString());
	//   64  111:new             #281 <Class ParserException>
	//   65  114:dup             
	//   66  115:aload_0         
	//   67  116:invokevirtual   #486 <Method String StringBuilder.toString()>
	//   68  119:invokespecial   #489 <Method void ParserException(String)>
	//   69  122:athrow          
			}
		} else
		{
			throw new ParserException("Overriding TrackEncryptionBox parameters is unsupported.");
	//   70  123:new             #281 <Class ParserException>
	//   71  126:dup             
	//   72  127:ldc2            #518 <String "Overriding TrackEncryptionBox parameters is unsupported.">
	//   73  130:invokespecial   #489 <Method void ParserException(String)>
	//   74  133:athrow          
		}
	}

	private static void parseSenc(ParsableByteArray parsablebytearray, TrackFragment trackfragment)
		throws ParserException
	{
		parseSenc(parsablebytearray, 0, trackfragment);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokestatic    #520 <Method void parseSenc(ParsableByteArray, int, TrackFragment)>
	//    4    6:return          
	}

	private static void parseSgpd(ParsableByteArray parsablebytearray, ParsableByteArray parsablebytearray1, TrackFragment trackfragment)
		throws ParserException
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		int i = parsablebytearray.readInt();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//    5   10:istore_3        
		if(parsablebytearray.readInt() != SAMPLE_GROUP_TYPE_seig)
	//*   6   11:aload_0         
	//*   7   12:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//*   8   15:getstatic       #73  <Field int SAMPLE_GROUP_TYPE_seig>
	//*   9   18:icmpeq          22
			return;
	//   10   21:return          
		if(Atom.parseFullAtomVersion(i) == 1)
	//*  11   22:iload_3         
	//*  12   23:invokestatic    #445 <Method int Atom.parseFullAtomVersion(int)>
	//*  13   26:iconst_1        
	//*  14   27:icmpne          35
			parsablebytearray.skipBytes(4);
	//   15   30:aload_0         
	//   16   31:iconst_4        
	//   17   32:invokevirtual   #205 <Method void ParsableByteArray.skipBytes(int)>
		if(parsablebytearray.readInt() == 1)
	//*  18   35:aload_0         
	//*  19   36:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//*  20   39:iconst_1        
	//*  21   40:icmpne          195
		{
			parsablebytearray1.setPosition(8);
	//   22   43:aload_1         
	//   23   44:bipush          8
	//   24   46:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
			int j = parsablebytearray1.readInt();
	//   25   49:aload_1         
	//   26   50:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//   27   53:istore_3        
			if(parsablebytearray1.readInt() != SAMPLE_GROUP_TYPE_seig)
	//*  28   54:aload_1         
	//*  29   55:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//*  30   58:getstatic       #73  <Field int SAMPLE_GROUP_TYPE_seig>
	//*  31   61:icmpeq          65
				return;
	//   32   64:return          
			j = Atom.parseFullAtomVersion(j);
	//   33   65:iload_3         
	//   34   66:invokestatic    #445 <Method int Atom.parseFullAtomVersion(int)>
	//   35   69:istore_3        
			if(j == 1)
	//*  36   70:iload_3         
	//*  37   71:iconst_1        
	//*  38   72:icmpne          98
			{
				if(parsablebytearray1.readUnsignedInt() == 0L)
	//*  39   75:aload_1         
	//*  40   76:invokevirtual   #449 <Method long ParsableByteArray.readUnsignedInt()>
	//*  41   79:lconst_0        
	//*  42   80:lcmp            
	//*  43   81:ifeq            87
	//*  44   84:goto            108
					throw new ParserException("Variable length decription in sgpd found (unsupported)");
	//   45   87:new             #281 <Class ParserException>
	//   46   90:dup             
	//   47   91:ldc2            #524 <String "Variable length decription in sgpd found (unsupported)">
	//   48   94:invokespecial   #489 <Method void ParserException(String)>
	//   49   97:athrow          
			} else
			if(j >= 2)
	//*  50   98:iload_3         
	//*  51   99:iconst_2        
	//*  52  100:icmplt          108
				parsablebytearray1.skipBytes(4);
	//   53  103:aload_1         
	//   54  104:iconst_4        
	//   55  105:invokevirtual   #205 <Method void ParsableByteArray.skipBytes(int)>
			if(parsablebytearray1.readUnsignedInt() == 1L)
	//*  56  108:aload_1         
	//*  57  109:invokevirtual   #449 <Method long ParsableByteArray.readUnsignedInt()>
	//*  58  112:lconst_1        
	//*  59  113:lcmp            
	//*  60  114:ifne            184
			{
				parsablebytearray1.skipBytes(2);
	//   61  117:aload_1         
	//   62  118:iconst_2        
	//   63  119:invokevirtual   #205 <Method void ParsableByteArray.skipBytes(int)>
				boolean flag;
				if(parsablebytearray1.readUnsignedByte() == 1)
	//*  64  122:aload_1         
	//*  65  123:invokevirtual   #494 <Method int ParsableByteArray.readUnsignedByte()>
	//*  66  126:iconst_1        
	//*  67  127:icmpne          136
					flag = true;
	//   68  130:iconst_1        
	//   69  131:istore          4
				else
	//*  70  133:goto            139
					flag = false;
	//   71  136:iconst_0        
	//   72  137:istore          4
				if(!flag)
	//*  73  139:iload           4
	//*  74  141:ifne            145
				{
					return;
	//   75  144:return          
				} else
				{
					int k = parsablebytearray1.readUnsignedByte();
	//   76  145:aload_1         
	//   77  146:invokevirtual   #494 <Method int ParsableByteArray.readUnsignedByte()>
	//   78  149:istore_3        
					parsablebytearray = ((ParsableByteArray) (new byte[16]));
	//   79  150:bipush          16
	//   80  152:newarray        byte[]
	//   81  154:astore_0        
					parsablebytearray1.readBytes(((byte []) (parsablebytearray)), 0, parsablebytearray.length);
	//   82  155:aload_1         
	//   83  156:aload_0         
	//   84  157:iconst_0        
	//   85  158:aload_0         
	//   86  159:arraylength     
	//   87  160:invokevirtual   #528 <Method void ParsableByteArray.readBytes(byte[], int, int)>
					trackfragment.definesEncryptionData = true;
	//   88  163:aload_2         
	//   89  164:iconst_1        
	//   90  165:putfield        #531 <Field boolean TrackFragment.definesEncryptionData>
					trackfragment.trackEncryptionBox = new TrackEncryptionBox(flag, k, ((byte []) (parsablebytearray)));
	//   91  168:aload_2         
	//   92  169:new             #172 <Class TrackEncryptionBox>
	//   93  172:dup             
	//   94  173:iload           4
	//   95  175:iload_3         
	//   96  176:aload_0         
	//   97  177:invokespecial   #534 <Method void TrackEncryptionBox(boolean, int, byte[])>
	//   98  180:putfield        #161 <Field TrackEncryptionBox TrackFragment.trackEncryptionBox>
					return;
	//   99  183:return          
				}
			} else
			{
				throw new ParserException("Entry count in sgpd != 1 (unsupported).");
	//  100  184:new             #281 <Class ParserException>
	//  101  187:dup             
	//  102  188:ldc2            #536 <String "Entry count in sgpd != 1 (unsupported).">
	//  103  191:invokespecial   #489 <Method void ParserException(String)>
	//  104  194:athrow          
			}
		} else
		{
			throw new ParserException("Entry count in sbgp != 1 (unsupported).");
	//  105  195:new             #281 <Class ParserException>
	//  106  198:dup             
	//  107  199:ldc2            #538 <String "Entry count in sbgp != 1 (unsupported).">
	//  108  202:invokespecial   #489 <Method void ParserException(String)>
	//  109  205:athrow          
		}
	}

	private static ChunkIndex parseSidx(ParsableByteArray parsablebytearray, long l)
		throws ParserException
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		int i = Atom.parseFullAtomVersion(parsablebytearray.readInt());
	//    3    6:aload_0         
	//    4    7:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//    5   10:invokestatic    #445 <Method int Atom.parseFullAtomVersion(int)>
	//    6   13:istore_3        
		parsablebytearray.skipBytes(4);
	//    7   14:aload_0         
	//    8   15:iconst_4        
	//    9   16:invokevirtual   #205 <Method void ParsableByteArray.skipBytes(int)>
		long l7 = parsablebytearray.readUnsignedInt();
	//   10   19:aload_0         
	//   11   20:invokevirtual   #449 <Method long ParsableByteArray.readUnsignedInt()>
	//   12   23:lstore          12
		long l1;
		if(i == 0)
	//*  13   25:iload_3         
	//*  14   26:ifne            57
		{
			l1 = parsablebytearray.readUnsignedInt();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #449 <Method long ParsableByteArray.readUnsignedInt()>
	//   17   33:lstore          6
			long l2 = parsablebytearray.readUnsignedInt();
	//   18   35:aload_0         
	//   19   36:invokevirtual   #449 <Method long ParsableByteArray.readUnsignedInt()>
	//   20   39:lstore          8
			l2 = l + l2;
	//   21   41:lload_1         
	//   22   42:lload           8
	//   23   44:ladd            
	//   24   45:lstore          8
			l = l1;
	//   25   47:lload           6
	//   26   49:lstore_1        
			l1 = l2;
	//   27   50:lload           8
	//   28   52:lstore          6
		} else
	//*  29   54:goto            78
		{
			long l3 = parsablebytearray.readUnsignedLongToLong();
	//   30   57:aload_0         
	//   31   58:invokevirtual   #452 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   32   61:lstore          8
			l1 = parsablebytearray.readUnsignedLongToLong();
	//   33   63:aload_0         
	//   34   64:invokevirtual   #452 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   35   67:lstore          6
			l1 = l + l1;
	//   36   69:lload_1         
	//   37   70:lload           6
	//   38   72:ladd            
	//   39   73:lstore          6
			l = l3;
	//   40   75:lload           8
	//   41   77:lstore_1        
		}
		parsablebytearray.skipBytes(2);
	//   42   78:aload_0         
	//   43   79:iconst_2        
	//   44   80:invokevirtual   #205 <Method void ParsableByteArray.skipBytes(int)>
		int j = parsablebytearray.readUnsignedShort();
	//   45   83:aload_0         
	//   46   84:invokevirtual   #202 <Method int ParsableByteArray.readUnsignedShort()>
	//   47   87:istore          4
		int ai[] = new int[j];
	//   48   89:iload           4
	//   49   91:newarray        int[]
	//   50   93:astore          14
		long al[] = new long[j];
	//   51   95:iload           4
	//   52   97:newarray        long[]
	//   53   99:astore          15
		long al1[] = new long[j];
	//   54  101:iload           4
	//   55  103:newarray        long[]
	//   56  105:astore          16
		long al2[] = new long[j];
	//   57  107:iload           4
	//   58  109:newarray        long[]
	//   59  111:astore          17
		long l5 = Util.scaleLargeTimestamp(l, 0xf4240L, l7);
	//   60  113:lload_1         
	//   61  114:ldc2w           #539 <Long 0xf4240L>
	//   62  117:lload           12
	//   63  119:invokestatic    #544 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   64  122:lstore          10
		i = 0;
	//   65  124:iconst_0        
	//   66  125:istore_3        
		long l4 = l;
	//   67  126:lload_1         
	//   68  127:lstore          8
		l = l1;
	//   69  129:lload           6
	//   70  131:lstore_1        
		l1 = l5;
	//   71  132:lload           10
	//   72  134:lstore          6
		while(i < j) 
	//*  73  136:iload_3         
	//*  74  137:iload           4
	//*  75  139:icmpge          245
		{
			int k = parsablebytearray.readInt();
	//   76  142:aload_0         
	//   77  143:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//   78  146:istore          5
			if((0x80000000 & k) == 0)
	//*  79  148:ldc2            #545 <Int 0x80000000>
	//*  80  151:iload           5
	//*  81  153:iand            
	//*  82  154:ifne            234
			{
				long l6 = parsablebytearray.readUnsignedInt();
	//   83  157:aload_0         
	//   84  158:invokevirtual   #449 <Method long ParsableByteArray.readUnsignedInt()>
	//   85  161:lstore          10
				ai[i] = k & 0x7fffffff;
	//   86  163:aload           14
	//   87  165:iload_3         
	//   88  166:iload           5
	//   89  168:ldc2            #546 <Int 0x7fffffff>
	//   90  171:iand            
	//   91  172:iastore         
				al[i] = l;
	//   92  173:aload           15
	//   93  175:iload_3         
	//   94  176:lload_1         
	//   95  177:lastore         
				al2[i] = l1;
	//   96  178:aload           17
	//   97  180:iload_3         
	//   98  181:lload           6
	//   99  183:lastore         
				l4 += l6;
	//  100  184:lload           8
	//  101  186:lload           10
	//  102  188:ladd            
	//  103  189:lstore          8
				l1 = Util.scaleLargeTimestamp(l4, 0xf4240L, l7);
	//  104  191:lload           8
	//  105  193:ldc2w           #539 <Long 0xf4240L>
	//  106  196:lload           12
	//  107  198:invokestatic    #544 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  108  201:lstore          6
				al1[i] = l1 - al2[i];
	//  109  203:aload           16
	//  110  205:iload_3         
	//  111  206:lload           6
	//  112  208:aload           17
	//  113  210:iload_3         
	//  114  211:laload          
	//  115  212:lsub            
	//  116  213:lastore         
				parsablebytearray.skipBytes(4);
	//  117  214:aload_0         
	//  118  215:iconst_4        
	//  119  216:invokevirtual   #205 <Method void ParsableByteArray.skipBytes(int)>
				l += ai[i];
	//  120  219:lload_1         
	//  121  220:aload           14
	//  122  222:iload_3         
	//  123  223:iaload          
	//  124  224:i2l             
	//  125  225:ladd            
	//  126  226:lstore_1        
				i++;
	//  127  227:iload_3         
	//  128  228:iconst_1        
	//  129  229:iadd            
	//  130  230:istore_3        
			} else
	//* 131  231:goto            136
			{
				throw new ParserException("Unhandled indirect reference");
	//  132  234:new             #281 <Class ParserException>
	//  133  237:dup             
	//  134  238:ldc2            #548 <String "Unhandled indirect reference">
	//  135  241:invokespecial   #489 <Method void ParserException(String)>
	//  136  244:athrow          
			}
		}
		return new ChunkIndex(ai, al, al1, al2);
	//  137  245:new             #550 <Class ChunkIndex>
	//  138  248:dup             
	//  139  249:aload           14
	//  140  251:aload           15
	//  141  253:aload           16
	//  142  255:aload           17
	//  143  257:invokespecial   #553 <Method void ChunkIndex(int[], long[], long[], long[])>
	//  144  260:areturn         
	}

	private static long parseTfdt(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		if(Atom.parseFullAtomVersion(parsablebytearray.readInt()) == 1)
	//*   3    6:aload_0         
	//*   4    7:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//*   5   10:invokestatic    #445 <Method int Atom.parseFullAtomVersion(int)>
	//*   6   13:iconst_1        
	//*   7   14:icmpne          22
			return parsablebytearray.readUnsignedLongToLong();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #452 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   10   21:lreturn         
		else
			return parsablebytearray.readUnsignedInt();
	//   11   22:aload_0         
	//   12   23:invokevirtual   #449 <Method long ParsableByteArray.readUnsignedInt()>
	//   13   26:lreturn         
	}

	private static TrackBundle parseTfhd(ParsableByteArray parsablebytearray, SparseArray sparsearray, int i)
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		int l = Atom.parseFullAtomFlags(parsablebytearray.readInt());
	//    3    6:aload_0         
	//    4    7:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//    5   10:invokestatic    #464 <Method int Atom.parseFullAtomFlags(int)>
	//    6   13:istore          5
		int j = parsablebytearray.readInt();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//    9   19:istore_3        
		if((i & 4) == 0)
	//*  10   20:iload_2         
	//*  11   21:iconst_4        
	//*  12   22:iand            
	//*  13   23:ifne            31
			i = j;
	//   14   26:iload_3         
	//   15   27:istore_2        
		else
	//*  16   28:goto            33
			i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_2        
		sparsearray = ((SparseArray) ((TrackBundle)sparsearray.get(i)));
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokevirtual   #434 <Method Object SparseArray.get(int)>
	//   22   38:checkcast       #8   <Class FragmentedMp4Extractor$TrackBundle>
	//   23   41:astore_1        
		if(sparsearray == null)
	//*  24   42:aload_1         
	//*  25   43:ifnonnull       48
			return null;
	//   26   46:aconst_null     
	//   27   47:areturn         
		if((l & 1) != 0)
	//*  28   48:iload           5
	//*  29   50:iconst_1        
	//*  30   51:iand            
	//*  31   52:ifeq            79
		{
			long l1 = parsablebytearray.readUnsignedLongToLong();
	//   32   55:aload_0         
	//   33   56:invokevirtual   #452 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   34   59:lstore          6
			((TrackBundle) (sparsearray)).fragment.dataPosition = l1;
	//   35   61:aload_1         
	//   36   62:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   37   65:lload           6
	//   38   67:putfield        #276 <Field long TrackFragment.dataPosition>
			((TrackBundle) (sparsearray)).fragment.auxiliaryDataPosition = l1;
	//   39   70:aload_1         
	//   40   71:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   41   74:lload           6
	//   42   76:putfield        #470 <Field long TrackFragment.auxiliaryDataPosition>
		}
		DefaultSampleValues defaultsamplevalues = ((TrackBundle) (sparsearray)).defaultSampleValues;
	//   43   79:aload_1         
	//   44   80:getfield        #559 <Field DefaultSampleValues FragmentedMp4Extractor$TrackBundle.defaultSampleValues>
	//   45   83:astore          8
		if((l & 2) != 0)
	//*  46   85:iload           5
	//*  47   87:iconst_2        
	//*  48   88:iand            
	//*  49   89:ifeq            102
			i = parsablebytearray.readUnsignedIntToInt() - 1;
	//   50   92:aload_0         
	//   51   93:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   52   96:iconst_1        
	//   53   97:isub            
	//   54   98:istore_2        
		else
	//*  55   99:goto            108
			i = defaultsamplevalues.sampleDescriptionIndex;
	//   56  102:aload           8
	//   57  104:getfield        #157 <Field int DefaultSampleValues.sampleDescriptionIndex>
	//   58  107:istore_2        
		if((l & 8) != 0)
	//*  59  108:iload           5
	//*  60  110:bipush          8
	//*  61  112:iand            
	//*  62  113:ifeq            124
			j = parsablebytearray.readUnsignedIntToInt();
	//   63  116:aload_0         
	//   64  117:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   65  120:istore_3        
		else
	//*  66  121:goto            130
			j = defaultsamplevalues.duration;
	//   67  124:aload           8
	//   68  126:getfield        #562 <Field int DefaultSampleValues.duration>
	//   69  129:istore_3        
		int k;
		if((l & 0x10) != 0)
	//*  70  130:iload           5
	//*  71  132:bipush          16
	//*  72  134:iand            
	//*  73  135:ifeq            147
			k = parsablebytearray.readUnsignedIntToInt();
	//   74  138:aload_0         
	//   75  139:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   76  142:istore          4
		else
	//*  77  144:goto            154
			k = defaultsamplevalues.size;
	//   78  147:aload           8
	//   79  149:getfield        #564 <Field int DefaultSampleValues.size>
	//   80  152:istore          4
		if((l & 0x20) != 0)
	//*  81  154:iload           5
	//*  82  156:bipush          32
	//*  83  158:iand            
	//*  84  159:ifeq            171
			l = parsablebytearray.readUnsignedIntToInt();
	//   85  162:aload_0         
	//   86  163:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   87  166:istore          5
		else
	//*  88  168:goto            178
			l = defaultsamplevalues.flags;
	//   89  171:aload           8
	//   90  173:getfield        #565 <Field int DefaultSampleValues.flags>
	//   91  176:istore          5
		((TrackBundle) (sparsearray)).fragment.header = new DefaultSampleValues(i, j, k, l);
	//   92  178:aload_1         
	//   93  179:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   94  182:new             #154 <Class DefaultSampleValues>
	//   95  185:dup             
	//   96  186:iload_2         
	//   97  187:iload_3         
	//   98  188:iload           4
	//   99  190:iload           5
	//  100  192:invokespecial   #568 <Method void DefaultSampleValues(int, int, int, int)>
	//  101  195:putfield        #152 <Field DefaultSampleValues TrackFragment.header>
		return ((TrackBundle) (sparsearray));
	//  102  198:aload_1         
	//  103  199:areturn         
	}

	private static void parseTraf(Atom.ContainerAtom containeratom, SparseArray sparsearray, int i, byte abyte0[])
		throws ParserException
	{
		if(containeratom.getChildAtomOfTypeCount(Atom.TYPE_trun) == 1)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #572 <Field int Atom.TYPE_trun>
	//*   2    4:invokevirtual   #575 <Method int Atom$ContainerAtom.getChildAtomOfTypeCount(int)>
	//*   3    7:iconst_1        
	//*   4    8:icmpne          298
		{
			Object obj = ((Object) (parseTfhd(containeratom.getLeafAtomOfType(Atom.TYPE_tfhd).data, sparsearray, i)));
	//    5   11:aload_0         
	//    6   12:getstatic       #578 <Field int Atom.TYPE_tfhd>
	//    7   15:invokevirtual   #412 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//    8   18:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//    9   21:aload_1         
	//   10   22:iload_2         
	//   11   23:invokestatic    #580 <Method FragmentedMp4Extractor$TrackBundle parseTfhd(ParsableByteArray, SparseArray, int)>
	//   12   26:astore          9
			if(obj == null)
	//*  13   28:aload           9
	//*  14   30:ifnonnull       34
				return;
	//   15   33:return          
			sparsearray = ((SparseArray) (((TrackBundle) (obj)).fragment));
	//   16   34:aload           9
	//   17   36:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   18   39:astore_1        
			long l1 = ((TrackFragment) (sparsearray)).nextFragmentDecodeTime;
	//   19   40:aload_1         
	//   20   41:getfield        #583 <Field long TrackFragment.nextFragmentDecodeTime>
	//   21   44:lstore          7
			((TrackBundle) (obj)).reset();
	//   22   46:aload           9
	//   23   48:invokevirtual   #586 <Method void FragmentedMp4Extractor$TrackBundle.reset()>
			long l = l1;
	//   24   51:lload           7
	//   25   53:lstore          5
			if(containeratom.getLeafAtomOfType(Atom.TYPE_tfdt) != null)
	//*  26   55:aload_0         
	//*  27   56:getstatic       #589 <Field int Atom.TYPE_tfdt>
	//*  28   59:invokevirtual   #412 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//*  29   62:ifnull          90
			{
				l = l1;
	//   30   65:lload           7
	//   31   67:lstore          5
				if((i & 2) == 0)
	//*  32   69:iload_2         
	//*  33   70:iconst_2        
	//*  34   71:iand            
	//*  35   72:ifne            90
					l = parseTfdt(containeratom.getLeafAtomOfType(Atom.TYPE_tfdt).data);
	//   36   75:aload_0         
	//   37   76:getstatic       #589 <Field int Atom.TYPE_tfdt>
	//   38   79:invokevirtual   #412 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   39   82:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//   40   85:invokestatic    #591 <Method long parseTfdt(ParsableByteArray)>
	//   41   88:lstore          5
			}
			parseTrun(((TrackBundle) (obj)), l, i, containeratom.getLeafAtomOfType(Atom.TYPE_trun).data);
	//   42   90:aload           9
	//   43   92:lload           5
	//   44   94:iload_2         
	//   45   95:aload_0         
	//   46   96:getstatic       #572 <Field int Atom.TYPE_trun>
	//   47   99:invokevirtual   #412 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   48  102:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//   49  105:invokestatic    #595 <Method void parseTrun(FragmentedMp4Extractor$TrackBundle, long, int, ParsableByteArray)>
			Atom.LeafAtom leafatom1 = containeratom.getLeafAtomOfType(Atom.TYPE_saiz);
	//   50  108:aload_0         
	//   51  109:getstatic       #598 <Field int Atom.TYPE_saiz>
	//   52  112:invokevirtual   #412 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   53  115:astore          10
			if(leafatom1 != null)
	//*  54  117:aload           10
	//*  55  119:ifnull          147
				parseSaiz(((TrackBundle) (obj)).track.sampleDescriptionEncryptionBoxes[((TrackFragment) (sparsearray)).header.sampleDescriptionIndex], leafatom1.data, ((TrackFragment) (sparsearray)));
	//   56  122:aload           9
	//   57  124:getfield        #164 <Field Track FragmentedMp4Extractor$TrackBundle.track>
	//   58  127:getfield        #170 <Field TrackEncryptionBox[] Track.sampleDescriptionEncryptionBoxes>
	//   59  130:aload_1         
	//   60  131:getfield        #152 <Field DefaultSampleValues TrackFragment.header>
	//   61  134:getfield        #157 <Field int DefaultSampleValues.sampleDescriptionIndex>
	//   62  137:aaload          
	//   63  138:aload           10
	//   64  140:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//   65  143:aload_1         
	//   66  144:invokestatic    #600 <Method void parseSaiz(TrackEncryptionBox, ParsableByteArray, TrackFragment)>
			obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_saio)));
	//   67  147:aload_0         
	//   68  148:getstatic       #603 <Field int Atom.TYPE_saio>
	//   69  151:invokevirtual   #412 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   70  154:astore          9
			if(obj != null)
	//*  71  156:aload           9
	//*  72  158:ifnull          170
				parseSaio(((Atom.LeafAtom) (obj)).data, ((TrackFragment) (sparsearray)));
	//   73  161:aload           9
	//   74  163:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//   75  166:aload_1         
	//   76  167:invokestatic    #605 <Method void parseSaio(ParsableByteArray, TrackFragment)>
			obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_senc)));
	//   77  170:aload_0         
	//   78  171:getstatic       #608 <Field int Atom.TYPE_senc>
	//   79  174:invokevirtual   #412 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   80  177:astore          9
			if(obj != null)
	//*  81  179:aload           9
	//*  82  181:ifnull          193
				parseSenc(((Atom.LeafAtom) (obj)).data, ((TrackFragment) (sparsearray)));
	//   83  184:aload           9
	//   84  186:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//   85  189:aload_1         
	//   86  190:invokestatic    #610 <Method void parseSenc(ParsableByteArray, TrackFragment)>
			obj = ((Object) (containeratom.getLeafAtomOfType(Atom.TYPE_sbgp)));
	//   87  193:aload_0         
	//   88  194:getstatic       #613 <Field int Atom.TYPE_sbgp>
	//   89  197:invokevirtual   #412 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   90  200:astore          9
			leafatom1 = containeratom.getLeafAtomOfType(Atom.TYPE_sgpd);
	//   91  202:aload_0         
	//   92  203:getstatic       #616 <Field int Atom.TYPE_sgpd>
	//   93  206:invokevirtual   #412 <Method Atom$LeafAtom Atom$ContainerAtom.getLeafAtomOfType(int)>
	//   94  209:astore          10
			if(obj != null && leafatom1 != null)
	//*  95  211:aload           9
	//*  96  213:ifnull          235
	//*  97  216:aload           10
	//*  98  218:ifnull          235
				parseSgpd(((Atom.LeafAtom) (obj)).data, leafatom1.data, ((TrackFragment) (sparsearray)));
	//   99  221:aload           9
	//  100  223:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//  101  226:aload           10
	//  102  228:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//  103  231:aload_1         
	//  104  232:invokestatic    #618 <Method void parseSgpd(ParsableByteArray, ParsableByteArray, TrackFragment)>
			int j = containeratom.leafChildren.size();
	//  105  235:aload_0         
	//  106  236:getfield        #345 <Field List Atom$ContainerAtom.leafChildren>
	//  107  239:invokeinterface #216 <Method int List.size()>
	//  108  244:istore          4
			for(i = 0; i < j; i++)
	//* 109  246:iconst_0        
	//* 110  247:istore_2        
	//* 111  248:iload_2         
	//* 112  249:iload           4
	//* 113  251:icmpge          297
			{
				Atom.LeafAtom leafatom = (Atom.LeafAtom)containeratom.leafChildren.get(i);
	//  114  254:aload_0         
	//  115  255:getfield        #345 <Field List Atom$ContainerAtom.leafChildren>
	//  116  258:iload_2         
	//  117  259:invokeinterface #220 <Method Object List.get(int)>
	//  118  264:checkcast       #222 <Class Atom$LeafAtom>
	//  119  267:astore          9
				if(leafatom.type == Atom.TYPE_uuid)
	//* 120  269:aload           9
	//* 121  271:getfield        #225 <Field int Atom$LeafAtom.type>
	//* 122  274:getstatic       #621 <Field int Atom.TYPE_uuid>
	//* 123  277:icmpne          290
					parseUuid(leafatom.data, ((TrackFragment) (sparsearray)), abyte0);
	//  124  280:aload           9
	//  125  282:getfield        #235 <Field ParsableByteArray Atom$LeafAtom.data>
	//  126  285:aload_1         
	//  127  286:aload_3         
	//  128  287:invokestatic    #624 <Method void parseUuid(ParsableByteArray, TrackFragment, byte[])>
			}

	//  129  290:iload_2         
	//  130  291:iconst_1        
	//  131  292:iadd            
	//  132  293:istore_2        
	//* 133  294:goto            248
			return;
	//  134  297:return          
		} else
		{
			throw new ParserException("Trun count in traf != 1 (unsupported).");
	//  135  298:new             #281 <Class ParserException>
	//  136  301:dup             
	//  137  302:ldc2            #626 <String "Trun count in traf != 1 (unsupported).">
	//  138  305:invokespecial   #489 <Method void ParserException(String)>
	//  139  308:athrow          
		}
	}

	private static Pair parseTrex(ParsableByteArray parsablebytearray)
	{
		parsablebytearray.setPosition(12);
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		return Pair.create(((Object) (Integer.valueOf(parsablebytearray.readInt()))), ((Object) (new DefaultSampleValues(parsablebytearray.readUnsignedIntToInt() - 1, parsablebytearray.readUnsignedIntToInt(), parsablebytearray.readUnsignedIntToInt(), parsablebytearray.readInt()))));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//    5   10:invokestatic    #630 <Method Integer Integer.valueOf(int)>
	//    6   13:new             #154 <Class DefaultSampleValues>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   10   21:iconst_1        
	//   11   22:isub            
	//   12   23:aload_0         
	//   13   24:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   14   27:aload_0         
	//   15   28:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   16   31:aload_0         
	//   17   32:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//   18   35:invokespecial   #568 <Method void DefaultSampleValues(int, int, int, int)>
	//   19   38:invokestatic    #634 <Method Pair Pair.create(Object, Object)>
	//   20   41:areturn         
	}

	private static void parseTrun(TrackBundle trackbundle, long l, int i, ParsableByteArray parsablebytearray)
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload           4
	//    1    2:bipush          8
	//    2    4:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		int k = Atom.parseFullAtomFlags(parsablebytearray.readInt());
	//    3    7:aload           4
	//    4    9:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//    5   12:invokestatic    #464 <Method int Atom.parseFullAtomFlags(int)>
	//    6   15:istore          9
		Track track = trackbundle.track;
	//    7   17:aload_0         
	//    8   18:getfield        #164 <Field Track FragmentedMp4Extractor$TrackBundle.track>
	//    9   21:astore          23
		trackbundle = ((TrackBundle) (trackbundle.fragment));
	//   10   23:aload_0         
	//   11   24:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   12   27:astore_0        
		DefaultSampleValues defaultsamplevalues = ((TrackFragment) (trackbundle)).header;
	//   13   28:aload_0         
	//   14   29:getfield        #152 <Field DefaultSampleValues TrackFragment.header>
	//   15   32:astore          24
		int i1 = parsablebytearray.readUnsignedIntToInt();
	//   16   34:aload           4
	//   17   36:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   18   39:istore          12
		if((k & 1) != 0)
	//*  19   41:iload           9
	//*  20   43:iconst_1        
	//*  21   44:iand            
	//*  22   45:ifeq            63
			trackbundle.dataPosition = ((TrackFragment) (trackbundle)).dataPosition + (long)parsablebytearray.readInt();
	//   23   48:aload_0         
	//   24   49:aload_0         
	//   25   50:getfield        #276 <Field long TrackFragment.dataPosition>
	//   26   53:aload           4
	//   27   55:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//   28   58:i2l             
	//   29   59:ladd            
	//   30   60:putfield        #276 <Field long TrackFragment.dataPosition>
		boolean flag;
		if((k & 4) != 0)
	//*  31   63:iload           9
	//*  32   65:iconst_4        
	//*  33   66:iand            
	//*  34   67:ifeq            76
			flag = true;
	//   35   70:iconst_1        
	//   36   71:istore          6
		else
	//*  37   73:goto            79
			flag = false;
	//   38   76:iconst_0        
	//   39   77:istore          6
		int j = defaultsamplevalues.flags;
	//   40   79:aload           24
	//   41   81:getfield        #565 <Field int DefaultSampleValues.flags>
	//   42   84:istore          5
		if(flag)
	//*  43   86:iload           6
	//*  44   88:ifeq            98
			j = parsablebytearray.readUnsignedIntToInt();
	//   45   91:aload           4
	//   46   93:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//   47   96:istore          5
		boolean flag1;
		if((k & 0x100) != 0)
	//*  48   98:iload           9
	//*  49  100:sipush          256
	//*  50  103:iand            
	//*  51  104:ifeq            113
			flag1 = true;
	//   52  107:iconst_1        
	//   53  108:istore          7
		else
	//*  54  110:goto            116
			flag1 = false;
	//   55  113:iconst_0        
	//   56  114:istore          7
		boolean flag2;
		if((k & 0x200) != 0)
	//*  57  116:iload           9
	//*  58  118:sipush          512
	//*  59  121:iand            
	//*  60  122:ifeq            131
			flag2 = true;
	//   61  125:iconst_1        
	//   62  126:istore          8
		else
	//*  63  128:goto            134
			flag2 = false;
	//   64  131:iconst_0        
	//   65  132:istore          8
		boolean flag4;
		if((k & 0x400) != 0)
	//*  66  134:iload           9
	//*  67  136:sipush          1024
	//*  68  139:iand            
	//*  69  140:ifeq            149
			flag4 = true;
	//   70  143:iconst_1        
	//   71  144:istore          10
		else
	//*  72  146:goto            152
			flag4 = false;
	//   73  149:iconst_0        
	//   74  150:istore          10
		boolean flag3;
		if((k & 0x800) != 0)
	//*  75  152:iload           9
	//*  76  154:sipush          2048
	//*  77  157:iand            
	//*  78  158:ifeq            167
			flag3 = true;
	//   79  161:iconst_1        
	//   80  162:istore          9
		else
	//*  81  164:goto            170
			flag3 = false;
	//   82  167:iconst_0        
	//   83  168:istore          9
		long al[] = track.editListDurations;
	//   84  170:aload           23
	//   85  172:getfield        #639 <Field long[] Track.editListDurations>
	//   86  175:astore          25
		long l3 = 0L;
	//   87  177:lconst_0        
	//   88  178:lstore          18
		long l2 = l3;
	//   89  180:lload           18
	//   90  182:lstore          16
		if(al != null)
	//*  91  184:aload           25
	//*  92  186:ifnull          239
		{
			l2 = l3;
	//   93  189:lload           18
	//   94  191:lstore          16
			if(track.editListDurations.length == 1)
	//*  95  193:aload           23
	//*  96  195:getfield        #639 <Field long[] Track.editListDurations>
	//*  97  198:arraylength     
	//*  98  199:iconst_1        
	//*  99  200:icmpne          239
			{
				l2 = l3;
	//  100  203:lload           18
	//  101  205:lstore          16
				if(track.editListDurations[0] == 0L)
	//* 102  207:aload           23
	//* 103  209:getfield        #639 <Field long[] Track.editListDurations>
	//* 104  212:iconst_0        
	//* 105  213:laload          
	//* 106  214:lconst_0        
	//* 107  215:lcmp            
	//* 108  216:ifne            239
					l2 = Util.scaleLargeTimestamp(track.editListMediaTimes[0], 1000L, track.timescale);
	//  109  219:aload           23
	//  110  221:getfield        #642 <Field long[] Track.editListMediaTimes>
	//  111  224:iconst_0        
	//  112  225:laload          
	//  113  226:ldc2w           #643 <Long 1000L>
	//  114  229:aload           23
	//  115  231:getfield        #647 <Field long Track.timescale>
	//  116  234:invokestatic    #544 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  117  237:lstore          16
			}
		}
		((TrackFragment) (trackbundle)).initTables(i1);
	//  118  239:aload_0         
	//  119  240:iload           12
	//  120  242:invokevirtual   #650 <Method void TrackFragment.initTables(int)>
		al = ((long []) (((TrackFragment) (trackbundle)).sampleSizeTable));
	//  121  245:aload_0         
	//  122  246:getfield        #654 <Field int[] TrackFragment.sampleSizeTable>
	//  123  249:astore          25
		int ai[] = ((TrackFragment) (trackbundle)).sampleCompositionTimeOffsetTable;
	//  124  251:aload_0         
	//  125  252:getfield        #657 <Field int[] TrackFragment.sampleCompositionTimeOffsetTable>
	//  126  255:astore          26
		long al1[] = ((TrackFragment) (trackbundle)).sampleDecodingTimeTable;
	//  127  257:aload_0         
	//  128  258:getfield        #660 <Field long[] TrackFragment.sampleDecodingTimeTable>
	//  129  261:astore          27
		boolean aflag[] = ((TrackFragment) (trackbundle)).sampleIsSyncFrameTable;
	//  130  263:aload_0         
	//  131  264:getfield        #663 <Field boolean[] TrackFragment.sampleIsSyncFrameTable>
	//  132  267:astore          28
		l3 = track.timescale;
	//  133  269:aload           23
	//  134  271:getfield        #647 <Field long Track.timescale>
	//  135  274:lstore          18
		boolean flag5;
		if(track.type == Track.TYPE_vide && (i & 1) != 0)
	//* 136  276:aload           23
	//* 137  278:getfield        #664 <Field int Track.type>
	//* 138  281:getstatic       #667 <Field int Track.TYPE_vide>
	//* 139  284:icmpne          299
	//* 140  287:iload_3         
	//* 141  288:iconst_1        
	//* 142  289:iand            
	//* 143  290:ifeq            299
			flag5 = true;
	//  144  293:iconst_1        
	//  145  294:istore          11
		else
	//* 146  296:goto            302
			flag5 = false;
	//  147  299:iconst_0        
	//  148  300:istore          11
		for(int j1 = 0; j1 < i1;)
	//* 149  302:iconst_0        
	//* 150  303:istore          13
	//* 151  305:iload           13
	//* 152  307:iload           12
	//* 153  309:icmpge          503
		{
			int k1;
			if(flag1)
	//* 154  312:iload           7
	//* 155  314:ifeq            327
				k1 = parsablebytearray.readUnsignedIntToInt();
	//  156  317:aload           4
	//  157  319:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  158  322:istore          14
			else
	//* 159  324:goto            334
				k1 = defaultsamplevalues.duration;
	//  160  327:aload           24
	//  161  329:getfield        #562 <Field int DefaultSampleValues.duration>
	//  162  332:istore          14
			int l1;
			if(flag2)
	//* 163  334:iload           8
	//* 164  336:ifeq            349
				l1 = parsablebytearray.readUnsignedIntToInt();
	//  165  339:aload           4
	//  166  341:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  167  344:istore          15
			else
	//* 168  346:goto            356
				l1 = defaultsamplevalues.size;
	//  169  349:aload           24
	//  170  351:getfield        #564 <Field int DefaultSampleValues.size>
	//  171  354:istore          15
			if(j1 == 0 && flag)
	//* 172  356:iload           13
	//* 173  358:ifne            372
	//* 174  361:iload           6
	//* 175  363:ifeq            372
				i = j;
	//  176  366:iload           5
	//  177  368:istore_3        
			else
	//* 178  369:goto            392
			if(flag4)
	//* 179  372:iload           10
	//* 180  374:ifeq            386
				i = parsablebytearray.readInt();
	//  181  377:aload           4
	//  182  379:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//  183  382:istore_3        
			else
	//* 184  383:goto            392
				i = defaultsamplevalues.flags;
	//  185  386:aload           24
	//  186  388:getfield        #565 <Field int DefaultSampleValues.flags>
	//  187  391:istore_3        
			if(flag3)
	//* 188  392:iload           9
	//* 189  394:ifeq            419
				ai[j1] = (int)((long)(parsablebytearray.readInt() * 1000) / l3);
	//  190  397:aload           26
	//  191  399:iload           13
	//  192  401:aload           4
	//  193  403:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//  194  406:sipush          1000
	//  195  409:imul            
	//  196  410:i2l             
	//  197  411:lload           18
	//  198  413:ldiv            
	//  199  414:l2i             
	//  200  415:iastore         
			else
	//* 201  416:goto            425
				ai[j1] = 0;
	//  202  419:aload           26
	//  203  421:iload           13
	//  204  423:iconst_0        
	//  205  424:iastore         
			al1[j1] = Util.scaleLargeTimestamp(l, 1000L, l3) - l2;
	//  206  425:aload           27
	//  207  427:iload           13
	//  208  429:lload_1         
	//  209  430:ldc2w           #643 <Long 1000L>
	//  210  433:lload           18
	//  211  435:invokestatic    #544 <Method long Util.scaleLargeTimestamp(long, long, long)>
	//  212  438:lload           16
	//  213  440:lsub            
	//  214  441:lastore         
			al[j1] = l1;
	//  215  442:aload           25
	//  216  444:iload           13
	//  217  446:iload           15
	//  218  448:iastore         
			boolean flag6;
			if((i >> 16 & 1) == 0 && (!flag5 || j1 == 0))
	//* 219  449:iload_3         
	//* 220  450:bipush          16
	//* 221  452:ishr            
	//* 222  453:iconst_1        
	//* 223  454:iand            
	//* 224  455:ifne            474
	//* 225  458:iload           11
	//* 226  460:ifeq            468
	//* 227  463:iload           13
	//* 228  465:ifne            474
				flag6 = true;
	//  229  468:iconst_1        
	//  230  469:istore          22
			else
	//* 231  471:goto            477
				flag6 = false;
	//  232  474:iconst_0        
	//  233  475:istore          22
			aflag[j1] = flag6;
	//  234  477:aload           28
	//  235  479:iload           13
	//  236  481:iload           22
	//  237  483:bastore         
			long l4 = k1;
	//  238  484:iload           14
	//  239  486:i2l             
	//  240  487:lstore          20
			j1++;
	//  241  489:iload           13
	//  242  491:iconst_1        
	//  243  492:iadd            
	//  244  493:istore          13
			l = l4 + l;
	//  245  495:lload           20
	//  246  497:lload_1         
	//  247  498:ladd            
	//  248  499:lstore_1        
		}

	//* 249  500:goto            305
		trackbundle.nextFragmentDecodeTime = l;
	//  250  503:aload_0         
	//  251  504:lload_1         
	//  252  505:putfield        #583 <Field long TrackFragment.nextFragmentDecodeTime>
	//  253  508:return          
	}

	private static void parseUuid(ParsableByteArray parsablebytearray, TrackFragment trackfragment, byte abyte0[])
		throws ParserException
	{
		parsablebytearray.setPosition(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
		parsablebytearray.readBytes(abyte0, 0, 16);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:iconst_0        
	//    6    9:bipush          16
	//    7   11:invokevirtual   #528 <Method void ParsableByteArray.readBytes(byte[], int, int)>
		if(!Arrays.equals(abyte0, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE))
	//*   8   14:aload_2         
	//*   9   15:getstatic       #89  <Field byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE>
	//*  10   18:invokestatic    #671 <Method boolean Arrays.equals(byte[], byte[])>
	//*  11   21:ifne            25
		{
			return;
	//   12   24:return          
		} else
		{
			parseSenc(parsablebytearray, 16, trackfragment);
	//   13   25:aload_0         
	//   14   26:bipush          16
	//   15   28:aload_1         
	//   16   29:invokestatic    #520 <Method void parseSenc(ParsableByteArray, int, TrackFragment)>
			return;
	//   17   32:return          
		}
	}

	private void processAtomEnded(long l)
		throws ParserException
	{
		for(; !containerAtoms.isEmpty() && ((Atom.ContainerAtom)containerAtoms.peek()).endPosition == l; onContainerAtomRead((Atom.ContainerAtom)containerAtoms.pop()));
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field Stack containerAtoms>
	//    2    4:invokevirtual   #300 <Method boolean Stack.isEmpty()>
	//    3    7:ifne            45
	//    4   10:aload_0         
	//    5   11:getfield        #129 <Field Stack containerAtoms>
	//    6   14:invokevirtual   #304 <Method Object Stack.peek()>
	//    7   17:checkcast       #283 <Class Atom$ContainerAtom>
	//    8   20:getfield        #676 <Field long Atom$ContainerAtom.endPosition>
	//    9   23:lload_1         
	//   10   24:lcmp            
	//   11   25:ifne            45
	//   12   28:aload_0         
	//   13   29:aload_0         
	//   14   30:getfield        #129 <Field Stack containerAtoms>
	//   15   33:invokevirtual   #679 <Method Object Stack.pop()>
	//   16   36:checkcast       #283 <Class Atom$ContainerAtom>
	//   17   39:invokespecial   #681 <Method void onContainerAtomRead(Atom$ContainerAtom)>
	//*  18   42:goto            0
		enterReadingAtomHeaderState();
	//   19   45:aload_0         
	//   20   46:invokespecial   #137 <Method void enterReadingAtomHeaderState()>
	//   21   49:return          
	}

	private boolean readAtomHeader(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		if(atomHeaderBytesRead == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field int atomHeaderBytesRead>
	//*   2    4:ifne            65
		{
			if(!extractorinput.readFully(atomHeader.data, 0, 8, true))
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #108 <Field ParsableByteArray atomHeader>
	//*   6   12:getfield        #185 <Field byte[] ParsableByteArray.data>
	//*   7   15:iconst_0        
	//*   8   16:bipush          8
	//*   9   18:iconst_1        
	//*  10   19:invokeinterface #693 <Method boolean ExtractorInput.readFully(byte[], int, int, boolean)>
	//*  11   24:ifne            29
				return false;
	//   12   27:iconst_0        
	//   13   28:ireturn         
			atomHeaderBytesRead = 8;
	//   14   29:aload_0         
	//   15   30:bipush          8
	//   16   32:putfield        #209 <Field int atomHeaderBytesRead>
			atomHeader.setPosition(0);
	//   17   35:aload_0         
	//   18   36:getfield        #108 <Field ParsableByteArray atomHeader>
	//   19   39:iconst_0        
	//   20   40:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
			atomSize = atomHeader.readUnsignedInt();
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #108 <Field ParsableByteArray atomHeader>
	//   24   48:invokevirtual   #449 <Method long ParsableByteArray.readUnsignedInt()>
	//   25   51:putfield        #695 <Field long atomSize>
			atomType = atomHeader.readInt();
	//   26   54:aload_0         
	//   27   55:aload_0         
	//   28   56:getfield        #108 <Field ParsableByteArray atomHeader>
	//   29   59:invokevirtual   #441 <Method int ParsableByteArray.readInt()>
	//   30   62:putfield        #697 <Field int atomType>
		}
		if(atomSize == 1L)
	//*  31   65:aload_0         
	//*  32   66:getfield        #695 <Field long atomSize>
	//*  33   69:lconst_1        
	//*  34   70:lcmp            
	//*  35   71:ifne            113
		{
			extractorinput.readFully(atomHeader.data, 8, 8);
	//   36   74:aload_1         
	//   37   75:aload_0         
	//   38   76:getfield        #108 <Field ParsableByteArray atomHeader>
	//   39   79:getfield        #185 <Field byte[] ParsableByteArray.data>
	//   40   82:bipush          8
	//   41   84:bipush          8
	//   42   86:invokeinterface #699 <Method void ExtractorInput.readFully(byte[], int, int)>
			atomHeaderBytesRead = atomHeaderBytesRead + 8;
	//   43   91:aload_0         
	//   44   92:aload_0         
	//   45   93:getfield        #209 <Field int atomHeaderBytesRead>
	//   46   96:bipush          8
	//   47   98:iadd            
	//   48   99:putfield        #209 <Field int atomHeaderBytesRead>
			atomSize = atomHeader.readUnsignedLongToLong();
	//   49  102:aload_0         
	//   50  103:aload_0         
	//   51  104:getfield        #108 <Field ParsableByteArray atomHeader>
	//   52  107:invokevirtual   #452 <Method long ParsableByteArray.readUnsignedLongToLong()>
	//   53  110:putfield        #695 <Field long atomSize>
		}
		if(atomSize >= (long)atomHeaderBytesRead)
	//*  54  113:aload_0         
	//*  55  114:getfield        #695 <Field long atomSize>
	//*  56  117:aload_0         
	//*  57  118:getfield        #209 <Field int atomHeaderBytesRead>
	//*  58  121:i2l             
	//*  59  122:lcmp            
	//*  60  123:iflt            466
		{
			long l = extractorinput.getPosition() - (long)atomHeaderBytesRead;
	//   61  126:aload_1         
	//   62  127:invokeinterface #702 <Method long ExtractorInput.getPosition()>
	//   63  132:aload_0         
	//   64  133:getfield        #209 <Field int atomHeaderBytesRead>
	//   65  136:i2l             
	//   66  137:lsub            
	//   67  138:lstore          4
			if(atomType == Atom.TYPE_moof)
	//*  68  140:aload_0         
	//*  69  141:getfield        #697 <Field int atomType>
	//*  70  144:getstatic       #293 <Field int Atom.TYPE_moof>
	//*  71  147:icmpne          202
			{
				int j = trackBundles.size();
	//   72  150:aload_0         
	//   73  151:getfield        #134 <Field SparseArray trackBundles>
	//   74  154:invokevirtual   #265 <Method int SparseArray.size()>
	//   75  157:istore_3        
				for(int i = 0; i < j; i++)
	//*  76  158:iconst_0        
	//*  77  159:istore_2        
	//*  78  160:iload_2         
	//*  79  161:iload_3         
	//*  80  162:icmpge          202
				{
					TrackFragment trackfragment = ((TrackBundle)trackBundles.valueAt(i)).fragment;
	//   81  165:aload_0         
	//   82  166:getfield        #134 <Field SparseArray trackBundles>
	//   83  169:iload_2         
	//   84  170:invokevirtual   #270 <Method Object SparseArray.valueAt(int)>
	//   85  173:checkcast       #8   <Class FragmentedMp4Extractor$TrackBundle>
	//   86  176:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   87  179:astore          6
					trackfragment.auxiliaryDataPosition = l;
	//   88  181:aload           6
	//   89  183:lload           4
	//   90  185:putfield        #470 <Field long TrackFragment.auxiliaryDataPosition>
					trackfragment.dataPosition = l;
	//   91  188:aload           6
	//   92  190:lload           4
	//   93  192:putfield        #276 <Field long TrackFragment.dataPosition>
				}

	//   94  195:iload_2         
	//   95  196:iconst_1        
	//   96  197:iadd            
	//   97  198:istore_2        
			}
	//*  98  199:goto            160
			if(atomType == Atom.TYPE_mdat)
	//*  99  202:aload_0         
	//* 100  203:getfield        #697 <Field int atomType>
	//* 101  206:getstatic       #705 <Field int Atom.TYPE_mdat>
	//* 102  209:icmpne          259
			{
				currentTrackBundle = null;
	//  103  212:aload_0         
	//  104  213:aconst_null     
	//  105  214:putfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
				endOfMdatPosition = l + atomSize;
	//  106  217:aload_0         
	//  107  218:lload           4
	//  108  220:aload_0         
	//  109  221:getfield        #695 <Field long atomSize>
	//  110  224:ladd            
	//  111  225:putfield        #709 <Field long endOfMdatPosition>
				if(!haveOutputSeekMap)
	//* 112  228:aload_0         
	//* 113  229:getfield        #330 <Field boolean haveOutputSeekMap>
	//* 114  232:ifne            252
				{
					extractorOutput.seekMap(SeekMap.UNSEEKABLE);
	//  115  235:aload_0         
	//  116  236:getfield        #322 <Field ExtractorOutput extractorOutput>
	//  117  239:getstatic       #715 <Field SeekMap SeekMap.UNSEEKABLE>
	//  118  242:invokeinterface #328 <Method void ExtractorOutput.seekMap(SeekMap)>
					haveOutputSeekMap = true;
	//  119  247:aload_0         
	//  120  248:iconst_1        
	//  121  249:putfield        #330 <Field boolean haveOutputSeekMap>
				}
				parserState = 2;
	//  122  252:aload_0         
	//  123  253:iconst_2        
	//  124  254:putfield        #207 <Field int parserState>
				return true;
	//  125  257:iconst_1        
	//  126  258:ireturn         
			}
			if(shouldParseContainerAtom(atomType))
	//* 127  259:aload_0         
	//* 128  260:getfield        #697 <Field int atomType>
	//* 129  263:invokestatic    #719 <Method boolean shouldParseContainerAtom(int)>
	//* 130  266:ifeq            334
			{
				long l1 = (extractorinput.getPosition() + atomSize) - 8L;
	//  131  269:aload_1         
	//  132  270:invokeinterface #702 <Method long ExtractorInput.getPosition()>
	//  133  275:aload_0         
	//  134  276:getfield        #695 <Field long atomSize>
	//  135  279:ladd            
	//  136  280:ldc2w           #720 <Long 8L>
	//  137  283:lsub            
	//  138  284:lstore          4
				containerAtoms.add(((Object) (new Atom.ContainerAtom(atomType, l1))));
	//  139  286:aload_0         
	//  140  287:getfield        #129 <Field Stack containerAtoms>
	//  141  290:new             #283 <Class Atom$ContainerAtom>
	//  142  293:dup             
	//  143  294:aload_0         
	//  144  295:getfield        #697 <Field int atomType>
	//  145  298:lload           4
	//  146  300:invokespecial   #724 <Method void Atom$ContainerAtom(int, long)>
	//  147  303:invokevirtual   #727 <Method boolean Stack.add(Object)>
	//  148  306:pop             
				if(atomSize == (long)atomHeaderBytesRead)
	//* 149  307:aload_0         
	//* 150  308:getfield        #695 <Field long atomSize>
	//* 151  311:aload_0         
	//* 152  312:getfield        #209 <Field int atomHeaderBytesRead>
	//* 153  315:i2l             
	//* 154  316:lcmp            
	//* 155  317:ifne            328
				{
					processAtomEnded(l1);
	//  156  320:aload_0         
	//  157  321:lload           4
	//  158  323:invokespecial   #729 <Method void processAtomEnded(long)>
					return true;
	//  159  326:iconst_1        
	//  160  327:ireturn         
				} else
				{
					enterReadingAtomHeaderState();
	//  161  328:aload_0         
	//  162  329:invokespecial   #137 <Method void enterReadingAtomHeaderState()>
					return true;
	//  163  332:iconst_1        
	//  164  333:ireturn         
				}
			}
			if(shouldParseLeafAtom(atomType))
	//* 165  334:aload_0         
	//* 166  335:getfield        #697 <Field int atomType>
	//* 167  338:invokestatic    #732 <Method boolean shouldParseLeafAtom(int)>
	//* 168  341:ifeq            432
				if(atomHeaderBytesRead == 8)
	//* 169  344:aload_0         
	//* 170  345:getfield        #209 <Field int atomHeaderBytesRead>
	//* 171  348:bipush          8
	//* 172  350:icmpne          421
				{
					long l2 = atomSize;
	//  173  353:aload_0         
	//  174  354:getfield        #695 <Field long atomSize>
	//  175  357:lstore          4
					if(l2 <= 0x7fffffffL)
	//* 176  359:lload           4
	//* 177  361:ldc2w           #733 <Long 0x7fffffffL>
	//* 178  364:lcmp            
	//* 179  365:ifgt            410
					{
						atomData = new ParsableByteArray((int)l2);
	//  180  368:aload_0         
	//  181  369:new             #105 <Class ParsableByteArray>
	//  182  372:dup             
	//  183  373:lload           4
	//  184  375:l2i             
	//  185  376:invokespecial   #106 <Method void ParsableByteArray(int)>
	//  186  379:putfield        #736 <Field ParsableByteArray atomData>
						System.arraycopy(((Object) (atomHeader.data)), 0, ((Object) (atomData.data)), 0, 8);
	//  187  382:aload_0         
	//  188  383:getfield        #108 <Field ParsableByteArray atomHeader>
	//  189  386:getfield        #185 <Field byte[] ParsableByteArray.data>
	//  190  389:iconst_0        
	//  191  390:aload_0         
	//  192  391:getfield        #736 <Field ParsableByteArray atomData>
	//  193  394:getfield        #185 <Field byte[] ParsableByteArray.data>
	//  194  397:iconst_0        
	//  195  398:bipush          8
	//  196  400:invokestatic    #742 <Method void System.arraycopy(Object, int, Object, int, int)>
						parserState = 1;
	//  197  403:aload_0         
	//  198  404:iconst_1        
	//  199  405:putfield        #207 <Field int parserState>
						return true;
	//  200  408:iconst_1        
	//  201  409:ireturn         
					} else
					{
						throw new ParserException("Leaf atom with length > 2147483647 (unsupported).");
	//  202  410:new             #281 <Class ParserException>
	//  203  413:dup             
	//  204  414:ldc2            #744 <String "Leaf atom with length > 2147483647 (unsupported).">
	//  205  417:invokespecial   #489 <Method void ParserException(String)>
	//  206  420:athrow          
					}
				} else
				{
					throw new ParserException("Leaf atom defines extended atom size (unsupported).");
	//  207  421:new             #281 <Class ParserException>
	//  208  424:dup             
	//  209  425:ldc2            #746 <String "Leaf atom defines extended atom size (unsupported).">
	//  210  428:invokespecial   #489 <Method void ParserException(String)>
	//  211  431:athrow          
				}
			if(atomSize <= 0x7fffffffL)
	//* 212  432:aload_0         
	//* 213  433:getfield        #695 <Field long atomSize>
	//* 214  436:ldc2w           #733 <Long 0x7fffffffL>
	//* 215  439:lcmp            
	//* 216  440:ifgt            455
			{
				atomData = null;
	//  217  443:aload_0         
	//  218  444:aconst_null     
	//  219  445:putfield        #736 <Field ParsableByteArray atomData>
				parserState = 1;
	//  220  448:aload_0         
	//  221  449:iconst_1        
	//  222  450:putfield        #207 <Field int parserState>
				return true;
	//  223  453:iconst_1        
	//  224  454:ireturn         
			} else
			{
				throw new ParserException("Skipping atom with length > 2147483647 (unsupported).");
	//  225  455:new             #281 <Class ParserException>
	//  226  458:dup             
	//  227  459:ldc2            #748 <String "Skipping atom with length > 2147483647 (unsupported).">
	//  228  462:invokespecial   #489 <Method void ParserException(String)>
	//  229  465:athrow          
			}
		} else
		{
			throw new ParserException("Atom size less than header length (unsupported).");
	//  230  466:new             #281 <Class ParserException>
	//  231  469:dup             
	//  232  470:ldc2            #750 <String "Atom size less than header length (unsupported).">
	//  233  473:invokespecial   #489 <Method void ParserException(String)>
	//  234  476:athrow          
		}
	}

	private void readAtomPayload(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		int i = (int)atomSize - atomHeaderBytesRead;
	//    0    0:aload_0         
	//    1    1:getfield        #695 <Field long atomSize>
	//    2    4:l2i             
	//    3    5:aload_0         
	//    4    6:getfield        #209 <Field int atomHeaderBytesRead>
	//    5    9:isub            
	//    6   10:istore_2        
		ParsableByteArray parsablebytearray = atomData;
	//    7   11:aload_0         
	//    8   12:getfield        #736 <Field ParsableByteArray atomData>
	//    9   15:astore_3        
		if(parsablebytearray != null)
	//*  10   16:aload_3         
	//*  11   17:ifnull          61
		{
			extractorinput.readFully(parsablebytearray.data, 8, i);
	//   12   20:aload_1         
	//   13   21:aload_3         
	//   14   22:getfield        #185 <Field byte[] ParsableByteArray.data>
	//   15   25:bipush          8
	//   16   27:iload_2         
	//   17   28:invokeinterface #699 <Method void ExtractorInput.readFully(byte[], int, int)>
			onLeafAtomRead(new Atom.LeafAtom(atomType, atomData), extractorinput.getPosition());
	//   18   33:aload_0         
	//   19   34:new             #222 <Class Atom$LeafAtom>
	//   20   37:dup             
	//   21   38:aload_0         
	//   22   39:getfield        #697 <Field int atomType>
	//   23   42:aload_0         
	//   24   43:getfield        #736 <Field ParsableByteArray atomData>
	//   25   46:invokespecial   #755 <Method void Atom$LeafAtom(int, ParsableByteArray)>
	//   26   49:aload_1         
	//   27   50:invokeinterface #702 <Method long ExtractorInput.getPosition()>
	//   28   55:invokespecial   #757 <Method void onLeafAtomRead(Atom$LeafAtom, long)>
		} else
	//*  29   58:goto            68
		{
			extractorinput.skipFully(i);
	//   30   61:aload_1         
	//   31   62:iload_2         
	//   32   63:invokeinterface #760 <Method void ExtractorInput.skipFully(int)>
		}
		processAtomEnded(extractorinput.getPosition());
	//   33   68:aload_0         
	//   34   69:aload_1         
	//   35   70:invokeinterface #702 <Method long ExtractorInput.getPosition()>
	//   36   75:invokespecial   #729 <Method void processAtomEnded(long)>
	//   37   78:return          
	}

	private void readEncryptionData(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		int k = trackBundles.size();
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field SparseArray trackBundles>
	//    2    4:invokevirtual   #265 <Method int SparseArray.size()>
	//    3    7:istore_3        
		TrackBundle trackbundle = null;
	//    4    8:aconst_null     
	//    5    9:astore          8
		long l = 0xffffffffL;
	//    6   11:ldc2w           #266 <Long 0xffffffffL>
	//    7   14:lstore          4
		for(int i = 0; i < k;)
	//*   8   16:iconst_0        
	//*   9   17:istore_2        
	//*  10   18:iload_2         
	//*  11   19:iload_3         
	//*  12   20:icmpge          109
		{
			TrackFragment trackfragment = ((TrackBundle)trackBundles.valueAt(i)).fragment;
	//   13   23:aload_0         
	//   14   24:getfield        #134 <Field SparseArray trackBundles>
	//   15   27:iload_2         
	//   16   28:invokevirtual   #270 <Method Object SparseArray.valueAt(int)>
	//   17   31:checkcast       #8   <Class FragmentedMp4Extractor$TrackBundle>
	//   18   34:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   19   37:astore          10
			TrackBundle trackbundle1 = trackbundle;
	//   20   39:aload           8
	//   21   41:astore          9
			long l1 = l;
	//   22   43:lload           4
	//   23   45:lstore          6
			if(trackfragment.sampleEncryptionDataNeedsFill)
	//*  24   47:aload           10
	//*  25   49:getfield        #764 <Field boolean TrackFragment.sampleEncryptionDataNeedsFill>
	//*  26   52:ifeq            94
			{
				trackbundle1 = trackbundle;
	//   27   55:aload           8
	//   28   57:astore          9
				l1 = l;
	//   29   59:lload           4
	//   30   61:lstore          6
				if(trackfragment.auxiliaryDataPosition < l)
	//*  31   63:aload           10
	//*  32   65:getfield        #470 <Field long TrackFragment.auxiliaryDataPosition>
	//*  33   68:lload           4
	//*  34   70:lcmp            
	//*  35   71:ifge            94
				{
					l1 = trackfragment.auxiliaryDataPosition;
	//   36   74:aload           10
	//   37   76:getfield        #470 <Field long TrackFragment.auxiliaryDataPosition>
	//   38   79:lstore          6
					trackbundle1 = (TrackBundle)trackBundles.valueAt(i);
	//   39   81:aload_0         
	//   40   82:getfield        #134 <Field SparseArray trackBundles>
	//   41   85:iload_2         
	//   42   86:invokevirtual   #270 <Method Object SparseArray.valueAt(int)>
	//   43   89:checkcast       #8   <Class FragmentedMp4Extractor$TrackBundle>
	//   44   92:astore          9
				}
			}
			i++;
	//   45   94:iload_2         
	//   46   95:iconst_1        
	//   47   96:iadd            
	//   48   97:istore_2        
			trackbundle = trackbundle1;
	//   49   98:aload           9
	//   50  100:astore          8
			l = l1;
	//   51  102:lload           6
	//   52  104:lstore          4
		}

	//*  53  106:goto            18
		if(trackbundle == null)
	//*  54  109:aload           8
	//*  55  111:ifnonnull       120
		{
			parserState = 3;
	//   56  114:aload_0         
	//   57  115:iconst_3        
	//   58  116:putfield        #207 <Field int parserState>
			return;
	//   59  119:return          
		}
		int j = (int)(l - extractorinput.getPosition());
	//   60  120:lload           4
	//   61  122:aload_1         
	//   62  123:invokeinterface #702 <Method long ExtractorInput.getPosition()>
	//   63  128:lsub            
	//   64  129:l2i             
	//   65  130:istore_2        
		if(j >= 0)
	//*  66  131:iload_2         
	//*  67  132:iflt            152
		{
			extractorinput.skipFully(j);
	//   68  135:aload_1         
	//   69  136:iload_2         
	//   70  137:invokeinterface #760 <Method void ExtractorInput.skipFully(int)>
			trackbundle.fragment.fillEncryptionData(extractorinput);
	//   71  142:aload           8
	//   72  144:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   73  147:aload_1         
	//   74  148:invokevirtual   #766 <Method void TrackFragment.fillEncryptionData(ExtractorInput)>
			return;
	//   75  151:return          
		} else
		{
			throw new ParserException("Offset to encryption data was negative.");
	//   76  152:new             #281 <Class ParserException>
	//   77  155:dup             
	//   78  156:ldc2            #768 <String "Offset to encryption data was negative.">
	//   79  159:invokespecial   #489 <Method void ParserException(String)>
	//   80  162:athrow          
		}
	}

	private boolean readSample(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		int i = parserState;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field int parserState>
	//    2    4:istore_2        
		int j = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		if(i == 3)
	//*   5    7:iload_2         
	//*   6    8:iconst_3        
	//*   7    9:icmpne          204
		{
			if(currentTrackBundle == null)
	//*   8   12:aload_0         
	//*   9   13:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//*  10   16:ifnonnull       126
			{
				currentTrackBundle = getNextFragmentRun(trackBundles);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #134 <Field SparseArray trackBundles>
	//   14   24:invokestatic    #771 <Method FragmentedMp4Extractor$TrackBundle getNextFragmentRun(SparseArray)>
	//   15   27:putfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
				TrackBundle trackbundle = currentTrackBundle;
	//   16   30:aload_0         
	//   17   31:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//   18   34:astore          10
				if(trackbundle == null)
	//*  19   36:aload           10
	//*  20   38:ifnonnull       82
				{
					i = (int)(endOfMdatPosition - extractorinput.getPosition());
	//   21   41:aload_0         
	//   22   42:getfield        #709 <Field long endOfMdatPosition>
	//   23   45:aload_1         
	//   24   46:invokeinterface #702 <Method long ExtractorInput.getPosition()>
	//   25   51:lsub            
	//   26   52:l2i             
	//   27   53:istore_2        
					if(i >= 0)
	//*  28   54:iload_2         
	//*  29   55:iflt            71
					{
						extractorinput.skipFully(i);
	//   30   58:aload_1         
	//   31   59:iload_2         
	//   32   60:invokeinterface #760 <Method void ExtractorInput.skipFully(int)>
						enterReadingAtomHeaderState();
	//   33   65:aload_0         
	//   34   66:invokespecial   #137 <Method void enterReadingAtomHeaderState()>
						return false;
	//   35   69:iconst_0        
	//   36   70:ireturn         
					} else
					{
						throw new ParserException("Offset to end of mdat was negative.");
	//   37   71:new             #281 <Class ParserException>
	//   38   74:dup             
	//   39   75:ldc2            #773 <String "Offset to end of mdat was negative.">
	//   40   78:invokespecial   #489 <Method void ParserException(String)>
	//   41   81:athrow          
					}
				}
				int k = (int)(trackbundle.fragment.dataPosition - extractorinput.getPosition());
	//   42   82:aload           10
	//   43   84:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   44   87:getfield        #276 <Field long TrackFragment.dataPosition>
	//   45   90:aload_1         
	//   46   91:invokeinterface #702 <Method long ExtractorInput.getPosition()>
	//   47   96:lsub            
	//   48   97:l2i             
	//   49   98:istore          4
				i = k;
	//   50  100:iload           4
	//   51  102:istore_2        
				if(k < 0)
	//*  52  103:iload           4
	//*  53  105:ifge            119
				{
					Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
	//   54  108:ldc1            #30  <String "FragmentedMp4Extractor">
	//   55  110:ldc2            #775 <String "Ignoring negative offset to sample data.">
	//   56  113:invokestatic    #249 <Method int Log.w(String, String)>
	//   57  116:pop             
					i = 0;
	//   58  117:iconst_0        
	//   59  118:istore_2        
				}
				extractorinput.skipFully(i);
	//   60  119:aload_1         
	//   61  120:iload_2         
	//   62  121:invokeinterface #760 <Method void ExtractorInput.skipFully(int)>
			}
			sampleSize = currentTrackBundle.fragment.sampleSizeTable[currentTrackBundle.currentSampleIndex];
	//   63  126:aload_0         
	//   64  127:aload_0         
	//   65  128:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//   66  131:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//   67  134:getfield        #654 <Field int[] TrackFragment.sampleSizeTable>
	//   68  137:aload_0         
	//   69  138:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//   70  141:getfield        #182 <Field int FragmentedMp4Extractor$TrackBundle.currentSampleIndex>
	//   71  144:iaload          
	//   72  145:putfield        #777 <Field int sampleSize>
			if(currentTrackBundle.fragment.definesEncryptionData)
	//*  73  148:aload_0         
	//*  74  149:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//*  75  152:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//*  76  155:getfield        #531 <Field boolean TrackFragment.definesEncryptionData>
	//*  77  158:ifeq            189
			{
				sampleBytesWritten = appendSampleEncryptionData(currentTrackBundle);
	//   78  161:aload_0         
	//   79  162:aload_0         
	//   80  163:aload_0         
	//   81  164:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//   82  167:invokespecial   #779 <Method int appendSampleEncryptionData(FragmentedMp4Extractor$TrackBundle)>
	//   83  170:putfield        #781 <Field int sampleBytesWritten>
				sampleSize = sampleSize + sampleBytesWritten;
	//   84  173:aload_0         
	//   85  174:aload_0         
	//   86  175:getfield        #777 <Field int sampleSize>
	//   87  178:aload_0         
	//   88  179:getfield        #781 <Field int sampleBytesWritten>
	//   89  182:iadd            
	//   90  183:putfield        #777 <Field int sampleSize>
			} else
	//*  91  186:goto            194
			{
				sampleBytesWritten = 0;
	//   92  189:aload_0         
	//   93  190:iconst_0        
	//   94  191:putfield        #781 <Field int sampleBytesWritten>
			}
			parserState = 4;
	//   95  194:aload_0         
	//   96  195:iconst_4        
	//   97  196:putfield        #207 <Field int parserState>
			sampleCurrentNalBytesRemaining = 0;
	//   98  199:aload_0         
	//   99  200:iconst_0        
	//  100  201:putfield        #783 <Field int sampleCurrentNalBytesRemaining>
		}
		TrackFragment trackfragment = currentTrackBundle.fragment;
	//  101  204:aload_0         
	//  102  205:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//  103  208:getfield        #143 <Field TrackFragment FragmentedMp4Extractor$TrackBundle.fragment>
	//  104  211:astore          10
		Track track = currentTrackBundle.track;
	//  105  213:aload_0         
	//  106  214:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//  107  217:getfield        #164 <Field Track FragmentedMp4Extractor$TrackBundle.track>
	//  108  220:astore          12
		TrackOutput trackoutput = currentTrackBundle.output;
	//  109  222:aload_0         
	//  110  223:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//  111  226:getfield        #192 <Field TrackOutput FragmentedMp4Extractor$TrackBundle.output>
	//  112  229:astore          11
		int l = currentTrackBundle.currentSampleIndex;
	//  113  231:aload_0         
	//  114  232:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//  115  235:getfield        #182 <Field int FragmentedMp4Extractor$TrackBundle.currentSampleIndex>
	//  116  238:istore          4
		if(track.nalUnitLengthFieldLength != -1)
	//* 117  240:aload           12
	//* 118  242:getfield        #786 <Field int Track.nalUnitLengthFieldLength>
	//* 119  245:iconst_m1       
	//* 120  246:icmpeq          427
		{
			byte abyte0[] = nalLength.data;
	//  121  249:aload_0         
	//  122  250:getfield        #120 <Field ParsableByteArray nalLength>
	//  123  253:getfield        #185 <Field byte[] ParsableByteArray.data>
	//  124  256:astore          13
			abyte0[0] = 0;
	//  125  258:aload           13
	//  126  260:iconst_0        
	//  127  261:iconst_0        
	//  128  262:bastore         
			abyte0[1] = 0;
	//  129  263:aload           13
	//  130  265:iconst_1        
	//  131  266:iconst_0        
	//  132  267:bastore         
			abyte0[2] = 0;
	//  133  268:aload           13
	//  134  270:iconst_2        
	//  135  271:iconst_0        
	//  136  272:bastore         
			i = track.nalUnitLengthFieldLength;
	//  137  273:aload           12
	//  138  275:getfield        #786 <Field int Track.nalUnitLengthFieldLength>
	//  139  278:istore_2        
			int i1 = 4 - track.nalUnitLengthFieldLength;
	//  140  279:iconst_4        
	//  141  280:aload           12
	//  142  282:getfield        #786 <Field int Track.nalUnitLengthFieldLength>
	//  143  285:isub            
	//  144  286:istore          5
			while(sampleBytesWritten < sampleSize) 
	//* 145  288:aload_0         
	//* 146  289:getfield        #781 <Field int sampleBytesWritten>
	//* 147  292:aload_0         
	//* 148  293:getfield        #777 <Field int sampleSize>
	//* 149  296:icmpge          471
			{
				int k1 = sampleCurrentNalBytesRemaining;
	//  150  299:aload_0         
	//  151  300:getfield        #783 <Field int sampleCurrentNalBytesRemaining>
	//  152  303:istore          6
				if(k1 == 0)
	//* 153  305:iload           6
	//* 154  307:ifne            389
				{
					extractorinput.readFully(nalLength.data, i1, i);
	//  155  310:aload_1         
	//  156  311:aload_0         
	//  157  312:getfield        #120 <Field ParsableByteArray nalLength>
	//  158  315:getfield        #185 <Field byte[] ParsableByteArray.data>
	//  159  318:iload           5
	//  160  320:iload_2         
	//  161  321:invokeinterface #699 <Method void ExtractorInput.readFully(byte[], int, int)>
					nalLength.setPosition(0);
	//  162  326:aload_0         
	//  163  327:getfield        #120 <Field ParsableByteArray nalLength>
	//  164  330:iconst_0        
	//  165  331:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
					sampleCurrentNalBytesRemaining = nalLength.readUnsignedIntToInt();
	//  166  334:aload_0         
	//  167  335:aload_0         
	//  168  336:getfield        #120 <Field ParsableByteArray nalLength>
	//  169  339:invokevirtual   #467 <Method int ParsableByteArray.readUnsignedIntToInt()>
	//  170  342:putfield        #783 <Field int sampleCurrentNalBytesRemaining>
					nalStartCode.setPosition(0);
	//  171  345:aload_0         
	//  172  346:getfield        #118 <Field ParsableByteArray nalStartCode>
	//  173  349:iconst_0        
	//  174  350:invokevirtual   #188 <Method void ParsableByteArray.setPosition(int)>
					trackoutput.sampleData(nalStartCode, 4);
	//  175  353:aload           11
	//  176  355:aload_0         
	//  177  356:getfield        #118 <Field ParsableByteArray nalStartCode>
	//  178  359:iconst_4        
	//  179  360:invokeinterface #198 <Method void TrackOutput.sampleData(ParsableByteArray, int)>
					sampleBytesWritten = sampleBytesWritten + 4;
	//  180  365:aload_0         
	//  181  366:aload_0         
	//  182  367:getfield        #781 <Field int sampleBytesWritten>
	//  183  370:iconst_4        
	//  184  371:iadd            
	//  185  372:putfield        #781 <Field int sampleBytesWritten>
					sampleSize = sampleSize + i1;
	//  186  375:aload_0         
	//  187  376:aload_0         
	//  188  377:getfield        #777 <Field int sampleSize>
	//  189  380:iload           5
	//  190  382:iadd            
	//  191  383:putfield        #777 <Field int sampleSize>
				} else
	//* 192  386:goto            288
				{
					k1 = trackoutput.sampleData(extractorinput, k1, false);
	//  193  389:aload           11
	//  194  391:aload_1         
	//  195  392:iload           6
	//  196  394:iconst_0        
	//  197  395:invokeinterface #789 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//  198  400:istore          6
					sampleBytesWritten = sampleBytesWritten + k1;
	//  199  402:aload_0         
	//  200  403:aload_0         
	//  201  404:getfield        #781 <Field int sampleBytesWritten>
	//  202  407:iload           6
	//  203  409:iadd            
	//  204  410:putfield        #781 <Field int sampleBytesWritten>
					sampleCurrentNalBytesRemaining = sampleCurrentNalBytesRemaining - k1;
	//  205  413:aload_0         
	//  206  414:aload_0         
	//  207  415:getfield        #783 <Field int sampleCurrentNalBytesRemaining>
	//  208  418:iload           6
	//  209  420:isub            
	//  210  421:putfield        #783 <Field int sampleCurrentNalBytesRemaining>
				}
			}
		} else
	//* 211  424:goto            288
		{
			do
			{
				i = sampleBytesWritten;
	//  212  427:aload_0         
	//  213  428:getfield        #781 <Field int sampleBytesWritten>
	//  214  431:istore_2        
				int j1 = sampleSize;
	//  215  432:aload_0         
	//  216  433:getfield        #777 <Field int sampleSize>
	//  217  436:istore          5
				if(i >= j1)
					break;
	//  218  438:iload_2         
	//  219  439:iload           5
	//  220  441:icmpge          471
				i = trackoutput.sampleData(extractorinput, j1 - i, false);
	//  221  444:aload           11
	//  222  446:aload_1         
	//  223  447:iload           5
	//  224  449:iload_2         
	//  225  450:isub            
	//  226  451:iconst_0        
	//  227  452:invokeinterface #789 <Method int TrackOutput.sampleData(ExtractorInput, int, boolean)>
	//  228  457:istore_2        
				sampleBytesWritten = sampleBytesWritten + i;
	//  229  458:aload_0         
	//  230  459:aload_0         
	//  231  460:getfield        #781 <Field int sampleBytesWritten>
	//  232  463:iload_2         
	//  233  464:iadd            
	//  234  465:putfield        #781 <Field int sampleBytesWritten>
			} while(true);
	//  235  468:goto            427
		}
		long l1 = trackfragment.getSamplePresentationTime(l);
	//  236  471:aload           10
	//  237  473:iload           4
	//  238  475:invokevirtual   #793 <Method long TrackFragment.getSamplePresentationTime(int)>
	//  239  478:lstore          7
		i = j;
	//  240  480:iload_3         
	//  241  481:istore_2        
		if(trackfragment.definesEncryptionData)
	//* 242  482:aload           10
	//* 243  484:getfield        #531 <Field boolean TrackFragment.definesEncryptionData>
	//* 244  487:ifeq            492
			i = 2;
	//  245  490:iconst_2        
	//  246  491:istore_2        
		boolean flag = trackfragment.sampleIsSyncFrameTable[l];
	//  247  492:aload           10
	//  248  494:getfield        #663 <Field boolean[] TrackFragment.sampleIsSyncFrameTable>
	//  249  497:iload           4
	//  250  499:baload          
	//  251  500:istore          9
		j = trackfragment.header.sampleDescriptionIndex;
	//  252  502:aload           10
	//  253  504:getfield        #152 <Field DefaultSampleValues TrackFragment.header>
	//  254  507:getfield        #157 <Field int DefaultSampleValues.sampleDescriptionIndex>
	//  255  510:istore_3        
		if(trackfragment.definesEncryptionData)
	//* 256  511:aload           10
	//* 257  513:getfield        #531 <Field boolean TrackFragment.definesEncryptionData>
	//* 258  516:ifeq            552
		{
			if(trackfragment.trackEncryptionBox != null)
	//* 259  519:aload           10
	//* 260  521:getfield        #161 <Field TrackEncryptionBox TrackFragment.trackEncryptionBox>
	//* 261  524:ifnull          536
				extractorinput = ((ExtractorInput) (trackfragment.trackEncryptionBox));
	//  262  527:aload           10
	//  263  529:getfield        #161 <Field TrackEncryptionBox TrackFragment.trackEncryptionBox>
	//  264  532:astore_1        
			else
	//* 265  533:goto            544
				extractorinput = ((ExtractorInput) (track.sampleDescriptionEncryptionBoxes[j]));
	//  266  536:aload           12
	//  267  538:getfield        #170 <Field TrackEncryptionBox[] Track.sampleDescriptionEncryptionBoxes>
	//  268  541:iload_3         
	//  269  542:aaload          
	//  270  543:astore_1        
			extractorinput = ((ExtractorInput) (((TrackEncryptionBox) (extractorinput)).keyId));
	//  271  544:aload_1         
	//  272  545:getfield        #796 <Field byte[] TrackEncryptionBox.keyId>
	//  273  548:astore_1        
		} else
	//* 274  549:goto            554
		{
			extractorinput = null;
	//  275  552:aconst_null     
	//  276  553:astore_1        
		}
		trackoutput.sampleMetadata(l1 * 1000L, i | flag, sampleSize, 0, ((byte []) (extractorinput)));
	//  277  554:aload           11
	//  278  556:lload           7
	//  279  558:ldc2w           #643 <Long 1000L>
	//  280  561:lmul            
	//  281  562:iload_2         
	//  282  563:iload           9
	//  283  565:ior             
	//  284  566:aload_0         
	//  285  567:getfield        #777 <Field int sampleSize>
	//  286  570:iconst_0        
	//  287  571:aload_1         
	//  288  572:invokeinterface #800 <Method void TrackOutput.sampleMetadata(long, int, int, int, byte[])>
		extractorinput = ((ExtractorInput) (currentTrackBundle));
	//  289  577:aload_0         
	//  290  578:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//  291  581:astore_1        
		extractorinput.currentSampleIndex = ((TrackBundle) (extractorinput)).currentSampleIndex + 1;
	//  292  582:aload_1         
	//  293  583:aload_1         
	//  294  584:getfield        #182 <Field int FragmentedMp4Extractor$TrackBundle.currentSampleIndex>
	//  295  587:iconst_1        
	//  296  588:iadd            
	//  297  589:putfield        #182 <Field int FragmentedMp4Extractor$TrackBundle.currentSampleIndex>
		if(currentTrackBundle.currentSampleIndex == trackfragment.length)
	//* 298  592:aload_0         
	//* 299  593:getfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
	//* 300  596:getfield        #182 <Field int FragmentedMp4Extractor$TrackBundle.currentSampleIndex>
	//* 301  599:aload           10
	//* 302  601:getfield        #273 <Field int TrackFragment.length>
	//* 303  604:icmpne          612
			currentTrackBundle = null;
	//  304  607:aload_0         
	//  305  608:aconst_null     
	//  306  609:putfield        #707 <Field FragmentedMp4Extractor$TrackBundle currentTrackBundle>
		parserState = 3;
	//  307  612:aload_0         
	//  308  613:iconst_3        
	//  309  614:putfield        #207 <Field int parserState>
		return true;
	//  310  617:iconst_1        
	//  311  618:ireturn         
	}

	private static boolean shouldParseContainerAtom(int i)
	{
		return i == Atom.TYPE_moov || i == Atom.TYPE_trak || i == Atom.TYPE_mdia || i == Atom.TYPE_minf || i == Atom.TYPE_stbl || i == Atom.TYPE_moof || i == Atom.TYPE_traf || i == Atom.TYPE_mvex || i == Atom.TYPE_edts;
	//    0    0:iload_0         
	//    1    1:getstatic       #287 <Field int Atom.TYPE_moov>
	//    2    4:icmpeq          68
	//    3    7:iload_0         
	//    4    8:getstatic       #405 <Field int Atom.TYPE_trak>
	//    5   11:icmpeq          68
	//    6   14:iload_0         
	//    7   15:getstatic       #803 <Field int Atom.TYPE_mdia>
	//    8   18:icmpeq          68
	//    9   21:iload_0         
	//   10   22:getstatic       #806 <Field int Atom.TYPE_minf>
	//   11   25:icmpeq          68
	//   12   28:iload_0         
	//   13   29:getstatic       #809 <Field int Atom.TYPE_stbl>
	//   14   32:icmpeq          68
	//   15   35:iload_0         
	//   16   36:getstatic       #293 <Field int Atom.TYPE_moof>
	//   17   39:icmpeq          68
	//   18   42:iload_0         
	//   19   43:getstatic       #455 <Field int Atom.TYPE_traf>
	//   20   46:icmpeq          68
	//   21   49:iload_0         
	//   22   50:getstatic       #362 <Field int Atom.TYPE_mvex>
	//   23   53:icmpeq          68
	//   24   56:iload_0         
	//   25   57:getstatic       #812 <Field int Atom.TYPE_edts>
	//   26   60:icmpne          66
	//   27   63:goto            68
	//   28   66:iconst_0        
	//   29   67:ireturn         
	//   30   68:iconst_1        
	//   31   69:ireturn         
	}

	private static boolean shouldParseLeafAtom(int i)
	{
		return i == Atom.TYPE_hdlr || i == Atom.TYPE_mdhd || i == Atom.TYPE_mvhd || i == Atom.TYPE_sidx || i == Atom.TYPE_stsd || i == Atom.TYPE_tfdt || i == Atom.TYPE_tfhd || i == Atom.TYPE_tkhd || i == Atom.TYPE_trex || i == Atom.TYPE_trun || i == Atom.TYPE_pssh || i == Atom.TYPE_saiz || i == Atom.TYPE_saio || i == Atom.TYPE_senc || i == Atom.TYPE_sbgp || i == Atom.TYPE_sgpd || i == Atom.TYPE_uuid || i == Atom.TYPE_elst || i == Atom.TYPE_mehd || i == Atom.TYPE_emsg;
	//    0    0:iload_0         
	//    1    1:getstatic       #815 <Field int Atom.TYPE_hdlr>
	//    2    4:icmpeq          145
	//    3    7:iload_0         
	//    4    8:getstatic       #818 <Field int Atom.TYPE_mdhd>
	//    5   11:icmpeq          145
	//    6   14:iload_0         
	//    7   15:getstatic       #408 <Field int Atom.TYPE_mvhd>
	//    8   18:icmpeq          145
	//    9   21:iload_0         
	//   10   22:getstatic       #316 <Field int Atom.TYPE_sidx>
	//   11   25:icmpeq          145
	//   12   28:iload_0         
	//   13   29:getstatic       #821 <Field int Atom.TYPE_stsd>
	//   14   32:icmpeq          145
	//   15   35:iload_0         
	//   16   36:getstatic       #589 <Field int Atom.TYPE_tfdt>
	//   17   39:icmpeq          145
	//   18   42:iload_0         
	//   19   43:getstatic       #578 <Field int Atom.TYPE_tfhd>
	//   20   46:icmpeq          145
	//   21   49:iload_0         
	//   22   50:getstatic       #824 <Field int Atom.TYPE_tkhd>
	//   23   53:icmpeq          145
	//   24   56:iload_0         
	//   25   57:getstatic       #371 <Field int Atom.TYPE_trex>
	//   26   60:icmpeq          145
	//   27   63:iload_0         
	//   28   64:getstatic       #572 <Field int Atom.TYPE_trun>
	//   29   67:icmpeq          145
	//   30   70:iload_0         
	//   31   71:getstatic       #230 <Field int Atom.TYPE_pssh>
	//   32   74:icmpeq          145
	//   33   77:iload_0         
	//   34   78:getstatic       #598 <Field int Atom.TYPE_saiz>
	//   35   81:icmpeq          145
	//   36   84:iload_0         
	//   37   85:getstatic       #603 <Field int Atom.TYPE_saio>
	//   38   88:icmpeq          145
	//   39   91:iload_0         
	//   40   92:getstatic       #608 <Field int Atom.TYPE_senc>
	//   41   95:icmpeq          145
	//   42   98:iload_0         
	//   43   99:getstatic       #613 <Field int Atom.TYPE_sbgp>
	//   44  102:icmpeq          145
	//   45  105:iload_0         
	//   46  106:getstatic       #616 <Field int Atom.TYPE_sgpd>
	//   47  109:icmpeq          145
	//   48  112:iload_0         
	//   49  113:getstatic       #621 <Field int Atom.TYPE_uuid>
	//   50  116:icmpeq          145
	//   51  119:iload_0         
	//   52  120:getstatic       #827 <Field int Atom.TYPE_elst>
	//   53  123:icmpeq          145
	//   54  126:iload_0         
	//   55  127:getstatic       #395 <Field int Atom.TYPE_mehd>
	//   56  130:icmpeq          145
	//   57  133:iload_0         
	//   58  134:getstatic       #333 <Field int Atom.TYPE_emsg>
	//   59  137:icmpne          143
	//   60  140:goto            145
	//   61  143:iconst_0        
	//   62  144:ireturn         
	//   63  145:iconst_1        
	//   64  146:ireturn         
	}

	public final void init(ExtractorOutput extractoroutput)
	{
		extractorOutput = extractoroutput;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #322 <Field ExtractorOutput extractorOutput>
		if(sideloadedTrack != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #101 <Field Track sideloadedTrack>
	//*   5    9:ifnull          64
		{
			extractoroutput = ((ExtractorOutput) (new TrackBundle(extractoroutput.track(0))));
	//    6   12:new             #8   <Class FragmentedMp4Extractor$TrackBundle>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokeinterface #424 <Method TrackOutput ExtractorOutput.track(int)>
	//   11   23:invokespecial   #427 <Method void FragmentedMp4Extractor$TrackBundle(TrackOutput)>
	//   12   26:astore_1        
			((TrackBundle) (extractoroutput)).init(sideloadedTrack, new DefaultSampleValues(0, 0, 0, 0));
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #101 <Field Track sideloadedTrack>
	//   16   32:new             #154 <Class DefaultSampleValues>
	//   17   35:dup             
	//   18   36:iconst_0        
	//   19   37:iconst_0        
	//   20   38:iconst_0        
	//   21   39:iconst_0        
	//   22   40:invokespecial   #568 <Method void DefaultSampleValues(int, int, int, int)>
	//   23   43:invokevirtual   #438 <Method void FragmentedMp4Extractor$TrackBundle.init(Track, DefaultSampleValues)>
			trackBundles.put(0, ((Object) (extractoroutput)));
	//   24   46:aload_0         
	//   25   47:getfield        #134 <Field SparseArray trackBundles>
	//   26   50:iconst_0        
	//   27   51:aload_1         
	//   28   52:invokevirtual   #392 <Method void SparseArray.put(int, Object)>
			extractorOutput.endTracks();
	//   29   55:aload_0         
	//   30   56:getfield        #322 <Field ExtractorOutput extractorOutput>
	//   31   59:invokeinterface #430 <Method void ExtractorOutput.endTracks()>
		}
	//   32   64:return          
	}

	protected void parseEmsg(ParsableByteArray parsablebytearray, long l)
		throws ParserException
	{
	//    0    0:return          
	}

	public final int read(ExtractorInput extractorinput, PositionHolder positionholder)
		throws IOException, InterruptedException
	{
_L6:
		parserState;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field int parserState>
		JVM INSTR tableswitch 0 2: default 32
	//	               0 58
	//	               1 50
	//	               2 42;
	//    2    4:tableswitch     0 2: default 32
	//	               0 58
	//	               1 50
	//	               2 42
		   goto _L1 _L2 _L3 _L4
_L2:
		continue; /* Loop/switch isn't completed */
_L1:
		if(readSample(extractorinput))
	//*   3   32:aload_0         
	//*   4   33:aload_1         
	//*   5   34:invokespecial   #832 <Method boolean readSample(ExtractorInput)>
	//*   6   37:ifeq            0
			return 0;
	//    7   40:iconst_0        
	//    8   41:ireturn         
		continue; /* Loop/switch isn't completed */
_L4:
		readEncryptionData(extractorinput);
	//    9   42:aload_0         
	//   10   43:aload_1         
	//   11   44:invokespecial   #834 <Method void readEncryptionData(ExtractorInput)>
		continue; /* Loop/switch isn't completed */
	//   12   47:goto            0
_L3:
		readAtomPayload(extractorinput);
	//   13   50:aload_0         
	//   14   51:aload_1         
	//   15   52:invokespecial   #836 <Method void readAtomPayload(ExtractorInput)>
		if(true) goto _L6; else goto _L5
	//   16   55:goto            0
_L5:
		if(readAtomHeader(extractorinput)) goto _L6; else goto _L7
	//   17   58:aload_0         
	//   18   59:aload_1         
	//   19   60:invokespecial   #838 <Method boolean readAtomHeader(ExtractorInput)>
	//   20   63:ifne            0
_L7:
		return -1;
	//   21   66:iconst_m1       
	//   22   67:ireturn         
	}

	public final void release()
	{
	//    0    0:return          
	}

	public final void seek()
	{
		int j = trackBundles.size();
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field SparseArray trackBundles>
	//    2    4:invokevirtual   #265 <Method int SparseArray.size()>
	//    3    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          36
			((TrackBundle)trackBundles.valueAt(i)).reset();
	//    9   15:aload_0         
	//   10   16:getfield        #134 <Field SparseArray trackBundles>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #270 <Method Object SparseArray.valueAt(int)>
	//   13   23:checkcast       #8   <Class FragmentedMp4Extractor$TrackBundle>
	//   14   26:invokevirtual   #586 <Method void FragmentedMp4Extractor$TrackBundle.reset()>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:istore_1        
	//*  19   33:goto            10
		containerAtoms.clear();
	//   20   36:aload_0         
	//   21   37:getfield        #129 <Field Stack containerAtoms>
	//   22   40:invokevirtual   #843 <Method void Stack.clear()>
		enterReadingAtomHeaderState();
	//   23   43:aload_0         
	//   24   44:invokespecial   #137 <Method void enterReadingAtomHeaderState()>
	//   25   47:return          
	}

	public final boolean sniff(ExtractorInput extractorinput)
		throws IOException, InterruptedException
	{
		return Sniffer.sniffFragmented(extractorinput);
	//    0    0:aload_1         
	//    1    1:invokestatic    #849 <Method boolean Sniffer.sniffFragmented(ExtractorInput)>
	//    2    4:ireturn         
	}

	private static final int FLAG_SIDELOADED = 4;
	public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
	public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
	private static final byte PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE[] = {
		-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 
		108, 66, 124, 100, -115, -12
	};
	private static final int SAMPLE_GROUP_TYPE_seig = Util.getIntegerCodeForString("seig");
	private static final int STATE_READING_ATOM_HEADER = 0;
	private static final int STATE_READING_ATOM_PAYLOAD = 1;
	private static final int STATE_READING_ENCRYPTION_DATA = 2;
	private static final int STATE_READING_SAMPLE_CONTINUE = 4;
	private static final int STATE_READING_SAMPLE_START = 3;
	private static final String TAG = "FragmentedMp4Extractor";
	private ParsableByteArray atomData;
	private final ParsableByteArray atomHeader;
	private int atomHeaderBytesRead;
	private long atomSize;
	private int atomType;
	private final Stack containerAtoms;
	private TrackBundle currentTrackBundle;
	private final ParsableByteArray encryptionSignalByte;
	private long endOfMdatPosition;
	private final byte extendedTypeScratch[];
	private ExtractorOutput extractorOutput;
	private final int flags;
	private boolean haveOutputSeekMap;
	private final ParsableByteArray nalLength;
	private final ParsableByteArray nalStartCode;
	private int parserState;
	private int sampleBytesWritten;
	private int sampleCurrentNalBytesRemaining;
	private int sampleSize;
	private final Track sideloadedTrack;
	private final SparseArray trackBundles;

	static 
	{
	//    0    0:ldc1            #65  <String "seig">
	//    1    2:invokestatic    #71  <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #73  <Field int SAMPLE_GROUP_TYPE_seig>
	//    3    8:bipush          16
	//    4   10:newarray        byte[]
	//    5   12:dup             
	//    6   13:iconst_0        
	//    7   14:ldc1            #74  <Int -94>
	//    8   16:bastore         
	//    9   17:dup             
	//   10   18:iconst_1        
	//   11   19:ldc1            #75  <Int 57>
	//   12   21:bastore         
	//   13   22:dup             
	//   14   23:iconst_2        
	//   15   24:ldc1            #76  <Int 79>
	//   16   26:bastore         
	//   17   27:dup             
	//   18   28:iconst_3        
	//   19   29:ldc1            #77  <Int 82>
	//   20   31:bastore         
	//   21   32:dup             
	//   22   33:iconst_4        
	//   23   34:ldc1            #78  <Int 90>
	//   24   36:bastore         
	//   25   37:dup             
	//   26   38:iconst_5        
	//   27   39:ldc1            #79  <Int -101>
	//   28   41:bastore         
	//   29   42:dup             
	//   30   43:bipush          6
	//   31   45:ldc1            #76  <Int 79>
	//   32   47:bastore         
	//   33   48:dup             
	//   34   49:bipush          7
	//   35   51:ldc1            #80  <Int 20>
	//   36   53:bastore         
	//   37   54:dup             
	//   38   55:bipush          8
	//   39   57:ldc1            #74  <Int -94>
	//   40   59:bastore         
	//   41   60:dup             
	//   42   61:bipush          9
	//   43   63:ldc1            #81  <Int 68>
	//   44   65:bastore         
	//   45   66:dup             
	//   46   67:bipush          10
	//   47   69:ldc1            #82  <Int 108>
	//   48   71:bastore         
	//   49   72:dup             
	//   50   73:bipush          11
	//   51   75:ldc1            #83  <Int 66>
	//   52   77:bastore         
	//   53   78:dup             
	//   54   79:bipush          12
	//   55   81:ldc1            #84  <Int 124>
	//   56   83:bastore         
	//   57   84:dup             
	//   58   85:bipush          13
	//   59   87:ldc1            #85  <Int 100>
	//   60   89:bastore         
	//   61   90:dup             
	//   62   91:bipush          14
	//   63   93:ldc1            #86  <Int -115>
	//   64   95:bastore         
	//   65   96:dup             
	//   66   97:bipush          15
	//   67   99:ldc1            #87  <Int -12>
	//   68  101:bastore         
	//   69  102:putstatic       #89  <Field byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE>
	//*  70  105:return          
	}
}
