// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.util.ParsableByteArray;
import com.google.android.exoplayer.util.Util;
import java.util.*;

abstract class Atom
{
	static final class ContainerAtom extends Atom
	{

		public void add(ContainerAtom containeratom)
		{
			containerChildren.add(((Object) (containeratom)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List containerChildren>
		//    2    4:aload_1         
		//    3    5:invokeinterface #36  <Method boolean List.add(Object)>
		//    4   10:pop             
		//    5   11:return          
		}

		public void add(LeafAtom leafatom)
		{
			leafChildren.add(((Object) (leafatom)));
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field List leafChildren>
		//    2    4:aload_1         
		//    3    5:invokeinterface #36  <Method boolean List.add(Object)>
		//    4   10:pop             
		//    5   11:return          
		}

		public int getChildAtomOfTypeCount(int i)
		{
			int k1 = leafChildren.size();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field List leafChildren>
		//    2    4:invokeinterface #43  <Method int List.size()>
		//    3    9:istore          6
			boolean flag = false;
		//    4   11:iconst_0        
		//    5   12:istore          5
			int l = 0;
		//    6   14:iconst_0        
		//    7   15:istore_3        
			int j;
			int i1;
			for(j = l; l < k1; j = i1)
		//*   8   16:iload_3         
		//*   9   17:istore_2        
		//*  10   18:iload_3         
		//*  11   19:iload           6
		//*  12   21:icmpge          62
			{
				i1 = j;
		//   13   24:iload_2         
		//   14   25:istore          4
				if(((LeafAtom)leafChildren.get(l)).type == i)
		//*  15   27:aload_0         
		//*  16   28:getfield        #26  <Field List leafChildren>
		//*  17   31:iload_3         
		//*  18   32:invokeinterface #47  <Method Object List.get(int)>
		//*  19   37:checkcast       #49  <Class Atom$LeafAtom>
		//*  20   40:getfield        #53  <Field int Atom$LeafAtom.type>
		//*  21   43:iload_1         
		//*  22   44:icmpne          52
					i1 = j + 1;
		//   23   47:iload_2         
		//   24   48:iconst_1        
		//   25   49:iadd            
		//   26   50:istore          4
				l++;
		//   27   52:iload_3         
		//   28   53:iconst_1        
		//   29   54:iadd            
		//   30   55:istore_3        
			}

		//   31   56:iload           4
		//   32   58:istore_2        
		//*  33   59:goto            18
			k1 = containerChildren.size();
		//   34   62:aload_0         
		//   35   63:getfield        #28  <Field List containerChildren>
		//   36   66:invokeinterface #43  <Method int List.size()>
		//   37   71:istore          6
			l = j;
		//   38   73:iload_2         
		//   39   74:istore_3        
			for(int k = ((int) (flag)); k < k1;)
		//*  40   75:iload           5
		//*  41   77:istore_2        
		//*  42   78:iload_2         
		//*  43   79:iload           6
		//*  44   81:icmpge          122
			{
				int j1 = l;
		//   45   84:iload_3         
		//   46   85:istore          4
				if(((ContainerAtom)containerChildren.get(k)).type == i)
		//*  47   87:aload_0         
		//*  48   88:getfield        #28  <Field List containerChildren>
		//*  49   91:iload_2         
		//*  50   92:invokeinterface #47  <Method Object List.get(int)>
		//*  51   97:checkcast       #2   <Class Atom$ContainerAtom>
		//*  52  100:getfield        #54  <Field int type>
		//*  53  103:iload_1         
		//*  54  104:icmpne          112
					j1 = l + 1;
		//   55  107:iload_3         
		//   56  108:iconst_1        
		//   57  109:iadd            
		//   58  110:istore          4
				k++;
		//   59  112:iload_2         
		//   60  113:iconst_1        
		//   61  114:iadd            
		//   62  115:istore_2        
				l = j1;
		//   63  116:iload           4
		//   64  118:istore_3        
			}

		//*  65  119:goto            78
			return l;
		//   66  122:iload_3         
		//   67  123:ireturn         
		}

		public ContainerAtom getContainerAtomOfType(int i)
		{
			int k = containerChildren.size();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field List containerChildren>
		//    2    4:invokeinterface #43  <Method int List.size()>
		//    3    9:istore_3        
			for(int j = 0; j < k; j++)
		//*   4   10:iconst_0        
		//*   5   11:istore_2        
		//*   6   12:iload_2         
		//*   7   13:iload_3         
		//*   8   14:icmpge          51
			{
				ContainerAtom containeratom = (ContainerAtom)containerChildren.get(j);
		//    9   17:aload_0         
		//   10   18:getfield        #28  <Field List containerChildren>
		//   11   21:iload_2         
		//   12   22:invokeinterface #47  <Method Object List.get(int)>
		//   13   27:checkcast       #2   <Class Atom$ContainerAtom>
		//   14   30:astore          4
				if(containeratom.type == i)
		//*  15   32:aload           4
		//*  16   34:getfield        #54  <Field int type>
		//*  17   37:iload_1         
		//*  18   38:icmpne          44
					return containeratom;
		//   19   41:aload           4
		//   20   43:areturn         
			}

		//   21   44:iload_2         
		//   22   45:iconst_1        
		//   23   46:iadd            
		//   24   47:istore_2        
		//*  25   48:goto            12
			return null;
		//   26   51:aconst_null     
		//   27   52:areturn         
		}

		public LeafAtom getLeafAtomOfType(int i)
		{
			int k = leafChildren.size();
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field List leafChildren>
		//    2    4:invokeinterface #43  <Method int List.size()>
		//    3    9:istore_3        
			for(int j = 0; j < k; j++)
		//*   4   10:iconst_0        
		//*   5   11:istore_2        
		//*   6   12:iload_2         
		//*   7   13:iload_3         
		//*   8   14:icmpge          51
			{
				LeafAtom leafatom = (LeafAtom)leafChildren.get(j);
		//    9   17:aload_0         
		//   10   18:getfield        #26  <Field List leafChildren>
		//   11   21:iload_2         
		//   12   22:invokeinterface #47  <Method Object List.get(int)>
		//   13   27:checkcast       #49  <Class Atom$LeafAtom>
		//   14   30:astore          4
				if(leafatom.type == i)
		//*  15   32:aload           4
		//*  16   34:getfield        #53  <Field int Atom$LeafAtom.type>
		//*  17   37:iload_1         
		//*  18   38:icmpne          44
					return leafatom;
		//   19   41:aload           4
		//   20   43:areturn         
			}

		//   21   44:iload_2         
		//   22   45:iconst_1        
		//   23   46:iadd            
		//   24   47:istore_2        
		//*  25   48:goto            12
			return null;
		//   26   51:aconst_null     
		//   27   52:areturn         
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #62  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #63  <Method void StringBuilder()>
		//    3    7:astore_1        
			stringbuilder.append(getAtomTypeString(type));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #54  <Field int type>
		//    7   13:invokestatic    #67  <Method String getAtomTypeString(int)>
		//    8   16:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//    9   19:pop             
			stringbuilder.append(" leaves: ");
		//   10   20:aload_1         
		//   11   21:ldc1            #73  <String " leaves: ">
		//   12   23:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   13   26:pop             
			stringbuilder.append(Arrays.toString(leafChildren.toArray(((Object []) (new LeafAtom[0])))));
		//   14   27:aload_1         
		//   15   28:aload_0         
		//   16   29:getfield        #26  <Field List leafChildren>
		//   17   32:iconst_0        
		//   18   33:anewarray       LeafAtom[]
		//   19   36:invokeinterface #77  <Method Object[] List.toArray(Object[])>
		//   20   41:invokestatic    #82  <Method String Arrays.toString(Object[])>
		//   21   44:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   22   47:pop             
			stringbuilder.append(" containers: ");
		//   23   48:aload_1         
		//   24   49:ldc1            #84  <String " containers: ">
		//   25   51:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   26   54:pop             
			stringbuilder.append(Arrays.toString(containerChildren.toArray(((Object []) (new ContainerAtom[0])))));
		//   27   55:aload_1         
		//   28   56:aload_0         
		//   29   57:getfield        #28  <Field List containerChildren>
		//   30   60:iconst_0        
		//   31   61:anewarray       ContainerAtom[]
		//   32   64:invokeinterface #77  <Method Object[] List.toArray(Object[])>
		//   33   69:invokestatic    #82  <Method String Arrays.toString(Object[])>
		//   34   72:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   35   75:pop             
			return stringbuilder.toString();
		//   36   76:aload_1         
		//   37   77:invokevirtual   #86  <Method String StringBuilder.toString()>
		//   38   80:areturn         
		}

		public final List containerChildren = new ArrayList();
		public final long endPosition;
		public final List leafChildren = new ArrayList();

		public ContainerAtom(int i, long l)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #17  <Method void Atom(int)>
			endPosition = l;
		//    3    5:aload_0         
		//    4    6:lload_2         
		//    5    7:putfield        #19  <Field long endPosition>
		//    6   10:aload_0         
		//    7   11:new             #21  <Class ArrayList>
		//    8   14:dup             
		//    9   15:invokespecial   #24  <Method void ArrayList()>
		//   10   18:putfield        #26  <Field List leafChildren>
		//   11   21:aload_0         
		//   12   22:new             #21  <Class ArrayList>
		//   13   25:dup             
		//   14   26:invokespecial   #24  <Method void ArrayList()>
		//   15   29:putfield        #28  <Field List containerChildren>
		//   16   32:return          
		}
	}

	static final class LeafAtom extends Atom
	{

		public final ParsableByteArray data;

		public LeafAtom(int i, ParsableByteArray parsablebytearray)
		{
			super(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #12  <Method void Atom(int)>
			data = parsablebytearray;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #14  <Field ParsableByteArray data>
		//    6   10:return          
		}
	}


	public Atom(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #493 <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #495 <Field int type>
	//    5    9:return          
	}

	public static String getAtomTypeString(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #499 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #500 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("");
	//    4    8:aload_1         
	//    5    9:ldc2            #502 <String "">
	//    6   12:invokevirtual   #506 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append((char)(i >> 24));
	//    8   16:aload_1         
	//    9   17:iload_0         
	//   10   18:bipush          24
	//   11   20:ishr            
	//   12   21:int2char        
	//   13   22:invokevirtual   #509 <Method StringBuilder StringBuilder.append(char)>
	//   14   25:pop             
		stringbuilder.append((char)(i >> 16 & 0xff));
	//   15   26:aload_1         
	//   16   27:iload_0         
	//   17   28:bipush          16
	//   18   30:ishr            
	//   19   31:sipush          255
	//   20   34:iand            
	//   21   35:int2char        
	//   22   36:invokevirtual   #509 <Method StringBuilder StringBuilder.append(char)>
	//   23   39:pop             
		stringbuilder.append((char)(i >> 8 & 0xff));
	//   24   40:aload_1         
	//   25   41:iload_0         
	//   26   42:bipush          8
	//   27   44:ishr            
	//   28   45:sipush          255
	//   29   48:iand            
	//   30   49:int2char        
	//   31   50:invokevirtual   #509 <Method StringBuilder StringBuilder.append(char)>
	//   32   53:pop             
		stringbuilder.append((char)(i & 0xff));
	//   33   54:aload_1         
	//   34   55:iload_0         
	//   35   56:sipush          255
	//   36   59:iand            
	//   37   60:int2char        
	//   38   61:invokevirtual   #509 <Method StringBuilder StringBuilder.append(char)>
	//   39   64:pop             
		return stringbuilder.toString();
	//   40   65:aload_1         
	//   41   66:invokevirtual   #513 <Method String StringBuilder.toString()>
	//   42   69:areturn         
	}

	public static int parseFullAtomFlags(int i)
	{
		return i & 0xffffff;
	//    0    0:iload_0         
	//    1    1:ldc2            #516 <Int 0xffffff>
	//    2    4:iand            
	//    3    5:ireturn         
	}

	public static int parseFullAtomVersion(int i)
	{
		return i >> 24 & 0xff;
	//    0    0:iload_0         
	//    1    1:bipush          24
	//    2    3:ishr            
	//    3    4:sipush          255
	//    4    7:iand            
	//    5    8:ireturn         
	}

	public String toString()
	{
		return getAtomTypeString(type);
	//    0    0:aload_0         
	//    1    1:getfield        #495 <Field int type>
	//    2    4:invokestatic    #519 <Method String getAtomTypeString(int)>
	//    3    7:areturn         
	}

	public static final int FULL_HEADER_SIZE = 12;
	public static final int HEADER_SIZE = 8;
	public static final int LONG_HEADER_SIZE = 16;
	public static final int LONG_SIZE_PREFIX = 1;
	public static final int TYPE_DASHES = Util.getIntegerCodeForString("----");
	public static final int TYPE_TTML = Util.getIntegerCodeForString("TTML");
	public static final int TYPE__mp3 = Util.getIntegerCodeForString(".mp3");
	public static final int TYPE_ac_3 = Util.getIntegerCodeForString("ac-3");
	public static final int TYPE_avc1 = Util.getIntegerCodeForString("avc1");
	public static final int TYPE_avc3 = Util.getIntegerCodeForString("avc3");
	public static final int TYPE_avcC = Util.getIntegerCodeForString("avcC");
	public static final int TYPE_camm = Util.getIntegerCodeForString("camm");
	public static final int TYPE_co64 = Util.getIntegerCodeForString("co64");
	public static final int TYPE_ctts = Util.getIntegerCodeForString("ctts");
	public static final int TYPE_d263 = Util.getIntegerCodeForString("d263");
	public static final int TYPE_dac3 = Util.getIntegerCodeForString("dac3");
	public static final int TYPE_data = Util.getIntegerCodeForString("data");
	public static final int TYPE_ddts = Util.getIntegerCodeForString("ddts");
	public static final int TYPE_dec3 = Util.getIntegerCodeForString("dec3");
	public static final int TYPE_dtsc = Util.getIntegerCodeForString("dtsc");
	public static final int TYPE_dtse = Util.getIntegerCodeForString("dtse");
	public static final int TYPE_dtsh = Util.getIntegerCodeForString("dtsh");
	public static final int TYPE_dtsl = Util.getIntegerCodeForString("dtsl");
	public static final int TYPE_ec_3 = Util.getIntegerCodeForString("ec-3");
	public static final int TYPE_edts = Util.getIntegerCodeForString("edts");
	public static final int TYPE_elst = Util.getIntegerCodeForString("elst");
	public static final int TYPE_emsg = Util.getIntegerCodeForString("emsg");
	public static final int TYPE_enca = Util.getIntegerCodeForString("enca");
	public static final int TYPE_encv = Util.getIntegerCodeForString("encv");
	public static final int TYPE_esds = Util.getIntegerCodeForString("esds");
	public static final int TYPE_frma = Util.getIntegerCodeForString("frma");
	public static final int TYPE_ftyp = Util.getIntegerCodeForString("ftyp");
	public static final int TYPE_hdlr = Util.getIntegerCodeForString("hdlr");
	public static final int TYPE_hev1 = Util.getIntegerCodeForString("hev1");
	public static final int TYPE_hvc1 = Util.getIntegerCodeForString("hvc1");
	public static final int TYPE_hvcC = Util.getIntegerCodeForString("hvcC");
	public static final int TYPE_ilst = Util.getIntegerCodeForString("ilst");
	public static final int TYPE_lpcm = Util.getIntegerCodeForString("lpcm");
	public static final int TYPE_mdat = Util.getIntegerCodeForString("mdat");
	public static final int TYPE_mdhd = Util.getIntegerCodeForString("mdhd");
	public static final int TYPE_mdia = Util.getIntegerCodeForString("mdia");
	public static final int TYPE_mean = Util.getIntegerCodeForString("mean");
	public static final int TYPE_mehd = Util.getIntegerCodeForString("mehd");
	public static final int TYPE_meta = Util.getIntegerCodeForString("meta");
	public static final int TYPE_minf = Util.getIntegerCodeForString("minf");
	public static final int TYPE_moof = Util.getIntegerCodeForString("moof");
	public static final int TYPE_moov = Util.getIntegerCodeForString("moov");
	public static final int TYPE_mp4a = Util.getIntegerCodeForString("mp4a");
	public static final int TYPE_mp4v = Util.getIntegerCodeForString("mp4v");
	public static final int TYPE_mvex = Util.getIntegerCodeForString("mvex");
	public static final int TYPE_mvhd = Util.getIntegerCodeForString("mvhd");
	public static final int TYPE_name = Util.getIntegerCodeForString("name");
	public static final int TYPE_pasp = Util.getIntegerCodeForString("pasp");
	public static final int TYPE_proj = Util.getIntegerCodeForString("proj");
	public static final int TYPE_pssh = Util.getIntegerCodeForString("pssh");
	public static final int TYPE_s263 = Util.getIntegerCodeForString("s263");
	public static final int TYPE_saio = Util.getIntegerCodeForString("saio");
	public static final int TYPE_saiz = Util.getIntegerCodeForString("saiz");
	public static final int TYPE_samr = Util.getIntegerCodeForString("samr");
	public static final int TYPE_sawb = Util.getIntegerCodeForString("sawb");
	public static final int TYPE_sbgp = Util.getIntegerCodeForString("sbgp");
	public static final int TYPE_schi = Util.getIntegerCodeForString("schi");
	public static final int TYPE_schm = Util.getIntegerCodeForString("schm");
	public static final int TYPE_senc = Util.getIntegerCodeForString("senc");
	public static final int TYPE_sgpd = Util.getIntegerCodeForString("sgpd");
	public static final int TYPE_sidx = Util.getIntegerCodeForString("sidx");
	public static final int TYPE_sinf = Util.getIntegerCodeForString("sinf");
	public static final int TYPE_sowt = Util.getIntegerCodeForString("sowt");
	public static final int TYPE_st3d = Util.getIntegerCodeForString("st3d");
	public static final int TYPE_stbl = Util.getIntegerCodeForString("stbl");
	public static final int TYPE_stco = Util.getIntegerCodeForString("stco");
	public static final int TYPE_stpp = Util.getIntegerCodeForString("stpp");
	public static final int TYPE_stsc = Util.getIntegerCodeForString("stsc");
	public static final int TYPE_stsd = Util.getIntegerCodeForString("stsd");
	public static final int TYPE_stss = Util.getIntegerCodeForString("stss");
	public static final int TYPE_stsz = Util.getIntegerCodeForString("stsz");
	public static final int TYPE_stts = Util.getIntegerCodeForString("stts");
	public static final int TYPE_stz2 = Util.getIntegerCodeForString("stz2");
	public static final int TYPE_sv3d = Util.getIntegerCodeForString("sv3d");
	public static final int TYPE_tenc = Util.getIntegerCodeForString("tenc");
	public static final int TYPE_tfdt = Util.getIntegerCodeForString("tfdt");
	public static final int TYPE_tfhd = Util.getIntegerCodeForString("tfhd");
	public static final int TYPE_tkhd = Util.getIntegerCodeForString("tkhd");
	public static final int TYPE_traf = Util.getIntegerCodeForString("traf");
	public static final int TYPE_trak = Util.getIntegerCodeForString("trak");
	public static final int TYPE_trex = Util.getIntegerCodeForString("trex");
	public static final int TYPE_trun = Util.getIntegerCodeForString("trun");
	public static final int TYPE_tx3g = Util.getIntegerCodeForString("tx3g");
	public static final int TYPE_udta = Util.getIntegerCodeForString("udta");
	public static final int TYPE_uuid = Util.getIntegerCodeForString("uuid");
	public static final int TYPE_vmhd = Util.getIntegerCodeForString("vmhd");
	public static final int TYPE_vp08 = Util.getIntegerCodeForString("vp08");
	public static final int TYPE_vp09 = Util.getIntegerCodeForString("vp09");
	public static final int TYPE_vpcC = Util.getIntegerCodeForString("vpcC");
	public static final int TYPE_wave = Util.getIntegerCodeForString("wave");
	public static final int TYPE_wvtt = Util.getIntegerCodeForString("wvtt");
	public final int type;

	static 
	{
	//    0    0:ldc1            #116 <String "ftyp">
	//    1    2:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #124 <Field int TYPE_ftyp>
	//    3    8:ldc1            #126 <String "avc1">
	//    4   10:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//    5   13:putstatic       #128 <Field int TYPE_avc1>
	//    6   16:ldc1            #130 <String "avc3">
	//    7   18:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//    8   21:putstatic       #132 <Field int TYPE_avc3>
	//    9   24:ldc1            #134 <String "hvc1">
	//   10   26:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   11   29:putstatic       #136 <Field int TYPE_hvc1>
	//   12   32:ldc1            #138 <String "hev1">
	//   13   34:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   14   37:putstatic       #140 <Field int TYPE_hev1>
	//   15   40:ldc1            #142 <String "s263">
	//   16   42:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   17   45:putstatic       #144 <Field int TYPE_s263>
	//   18   48:ldc1            #146 <String "d263">
	//   19   50:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   20   53:putstatic       #148 <Field int TYPE_d263>
	//   21   56:ldc1            #150 <String "mdat">
	//   22   58:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   23   61:putstatic       #152 <Field int TYPE_mdat>
	//   24   64:ldc1            #154 <String "mp4a">
	//   25   66:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   26   69:putstatic       #156 <Field int TYPE_mp4a>
	//   27   72:ldc1            #158 <String ".mp3">
	//   28   74:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   29   77:putstatic       #160 <Field int TYPE__mp3>
	//   30   80:ldc1            #162 <String "wave">
	//   31   82:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   32   85:putstatic       #164 <Field int TYPE_wave>
	//   33   88:ldc1            #166 <String "lpcm">
	//   34   90:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   35   93:putstatic       #168 <Field int TYPE_lpcm>
	//   36   96:ldc1            #170 <String "sowt">
	//   37   98:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   38  101:putstatic       #172 <Field int TYPE_sowt>
	//   39  104:ldc1            #174 <String "ac-3">
	//   40  106:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   41  109:putstatic       #176 <Field int TYPE_ac_3>
	//   42  112:ldc1            #178 <String "dac3">
	//   43  114:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   44  117:putstatic       #180 <Field int TYPE_dac3>
	//   45  120:ldc1            #182 <String "ec-3">
	//   46  122:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   47  125:putstatic       #184 <Field int TYPE_ec_3>
	//   48  128:ldc1            #186 <String "dec3">
	//   49  130:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   50  133:putstatic       #188 <Field int TYPE_dec3>
	//   51  136:ldc1            #190 <String "dtsc">
	//   52  138:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   53  141:putstatic       #192 <Field int TYPE_dtsc>
	//   54  144:ldc1            #194 <String "dtsh">
	//   55  146:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   56  149:putstatic       #196 <Field int TYPE_dtsh>
	//   57  152:ldc1            #198 <String "dtsl">
	//   58  154:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   59  157:putstatic       #200 <Field int TYPE_dtsl>
	//   60  160:ldc1            #202 <String "dtse">
	//   61  162:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   62  165:putstatic       #204 <Field int TYPE_dtse>
	//   63  168:ldc1            #206 <String "ddts">
	//   64  170:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   65  173:putstatic       #208 <Field int TYPE_ddts>
	//   66  176:ldc1            #210 <String "tfdt">
	//   67  178:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   68  181:putstatic       #212 <Field int TYPE_tfdt>
	//   69  184:ldc1            #214 <String "tfhd">
	//   70  186:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   71  189:putstatic       #216 <Field int TYPE_tfhd>
	//   72  192:ldc1            #218 <String "trex">
	//   73  194:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   74  197:putstatic       #220 <Field int TYPE_trex>
	//   75  200:ldc1            #222 <String "trun">
	//   76  202:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   77  205:putstatic       #224 <Field int TYPE_trun>
	//   78  208:ldc1            #226 <String "sidx">
	//   79  210:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   80  213:putstatic       #228 <Field int TYPE_sidx>
	//   81  216:ldc1            #230 <String "moov">
	//   82  218:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   83  221:putstatic       #232 <Field int TYPE_moov>
	//   84  224:ldc1            #234 <String "mvhd">
	//   85  226:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   86  229:putstatic       #236 <Field int TYPE_mvhd>
	//   87  232:ldc1            #238 <String "trak">
	//   88  234:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   89  237:putstatic       #240 <Field int TYPE_trak>
	//   90  240:ldc1            #242 <String "mdia">
	//   91  242:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   92  245:putstatic       #244 <Field int TYPE_mdia>
	//   93  248:ldc1            #246 <String "minf">
	//   94  250:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   95  253:putstatic       #248 <Field int TYPE_minf>
	//   96  256:ldc1            #250 <String "stbl">
	//   97  258:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//   98  261:putstatic       #252 <Field int TYPE_stbl>
	//   99  264:ldc1            #254 <String "avcC">
	//  100  266:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  101  269:putstatic       #256 <Field int TYPE_avcC>
	//  102  272:ldc2            #258 <String "hvcC">
	//  103  275:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  104  278:putstatic       #260 <Field int TYPE_hvcC>
	//  105  281:ldc2            #262 <String "esds">
	//  106  284:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  107  287:putstatic       #264 <Field int TYPE_esds>
	//  108  290:ldc2            #266 <String "moof">
	//  109  293:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  110  296:putstatic       #268 <Field int TYPE_moof>
	//  111  299:ldc2            #270 <String "traf">
	//  112  302:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  113  305:putstatic       #272 <Field int TYPE_traf>
	//  114  308:ldc2            #274 <String "mvex">
	//  115  311:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  116  314:putstatic       #276 <Field int TYPE_mvex>
	//  117  317:ldc2            #278 <String "mehd">
	//  118  320:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  119  323:putstatic       #280 <Field int TYPE_mehd>
	//  120  326:ldc2            #282 <String "tkhd">
	//  121  329:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  122  332:putstatic       #284 <Field int TYPE_tkhd>
	//  123  335:ldc2            #286 <String "edts">
	//  124  338:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  125  341:putstatic       #288 <Field int TYPE_edts>
	//  126  344:ldc2            #290 <String "elst">
	//  127  347:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  128  350:putstatic       #292 <Field int TYPE_elst>
	//  129  353:ldc2            #294 <String "mdhd">
	//  130  356:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  131  359:putstatic       #296 <Field int TYPE_mdhd>
	//  132  362:ldc2            #298 <String "hdlr">
	//  133  365:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  134  368:putstatic       #300 <Field int TYPE_hdlr>
	//  135  371:ldc2            #302 <String "stsd">
	//  136  374:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  137  377:putstatic       #304 <Field int TYPE_stsd>
	//  138  380:ldc2            #306 <String "pssh">
	//  139  383:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  140  386:putstatic       #308 <Field int TYPE_pssh>
	//  141  389:ldc2            #310 <String "sinf">
	//  142  392:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  143  395:putstatic       #312 <Field int TYPE_sinf>
	//  144  398:ldc2            #314 <String "schm">
	//  145  401:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  146  404:putstatic       #316 <Field int TYPE_schm>
	//  147  407:ldc2            #318 <String "schi">
	//  148  410:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  149  413:putstatic       #320 <Field int TYPE_schi>
	//  150  416:ldc2            #322 <String "tenc">
	//  151  419:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  152  422:putstatic       #324 <Field int TYPE_tenc>
	//  153  425:ldc2            #326 <String "encv">
	//  154  428:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  155  431:putstatic       #328 <Field int TYPE_encv>
	//  156  434:ldc2            #330 <String "enca">
	//  157  437:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  158  440:putstatic       #332 <Field int TYPE_enca>
	//  159  443:ldc2            #334 <String "frma">
	//  160  446:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  161  449:putstatic       #336 <Field int TYPE_frma>
	//  162  452:ldc2            #338 <String "saiz">
	//  163  455:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  164  458:putstatic       #340 <Field int TYPE_saiz>
	//  165  461:ldc2            #342 <String "saio">
	//  166  464:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  167  467:putstatic       #344 <Field int TYPE_saio>
	//  168  470:ldc2            #346 <String "sbgp">
	//  169  473:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  170  476:putstatic       #348 <Field int TYPE_sbgp>
	//  171  479:ldc2            #350 <String "sgpd">
	//  172  482:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  173  485:putstatic       #352 <Field int TYPE_sgpd>
	//  174  488:ldc2            #354 <String "uuid">
	//  175  491:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  176  494:putstatic       #356 <Field int TYPE_uuid>
	//  177  497:ldc2            #358 <String "senc">
	//  178  500:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  179  503:putstatic       #360 <Field int TYPE_senc>
	//  180  506:ldc2            #362 <String "pasp">
	//  181  509:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  182  512:putstatic       #364 <Field int TYPE_pasp>
	//  183  515:ldc2            #366 <String "TTML">
	//  184  518:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  185  521:putstatic       #368 <Field int TYPE_TTML>
	//  186  524:ldc2            #370 <String "vmhd">
	//  187  527:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  188  530:putstatic       #372 <Field int TYPE_vmhd>
	//  189  533:ldc2            #374 <String "mp4v">
	//  190  536:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  191  539:putstatic       #376 <Field int TYPE_mp4v>
	//  192  542:ldc2            #378 <String "stts">
	//  193  545:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  194  548:putstatic       #380 <Field int TYPE_stts>
	//  195  551:ldc2            #382 <String "stss">
	//  196  554:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  197  557:putstatic       #384 <Field int TYPE_stss>
	//  198  560:ldc2            #386 <String "ctts">
	//  199  563:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  200  566:putstatic       #388 <Field int TYPE_ctts>
	//  201  569:ldc2            #390 <String "stsc">
	//  202  572:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  203  575:putstatic       #392 <Field int TYPE_stsc>
	//  204  578:ldc2            #394 <String "stsz">
	//  205  581:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  206  584:putstatic       #396 <Field int TYPE_stsz>
	//  207  587:ldc2            #398 <String "stz2">
	//  208  590:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  209  593:putstatic       #400 <Field int TYPE_stz2>
	//  210  596:ldc2            #402 <String "stco">
	//  211  599:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  212  602:putstatic       #404 <Field int TYPE_stco>
	//  213  605:ldc2            #406 <String "co64">
	//  214  608:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  215  611:putstatic       #408 <Field int TYPE_co64>
	//  216  614:ldc2            #410 <String "tx3g">
	//  217  617:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  218  620:putstatic       #412 <Field int TYPE_tx3g>
	//  219  623:ldc2            #414 <String "wvtt">
	//  220  626:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  221  629:putstatic       #416 <Field int TYPE_wvtt>
	//  222  632:ldc2            #418 <String "stpp">
	//  223  635:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  224  638:putstatic       #420 <Field int TYPE_stpp>
	//  225  641:ldc2            #422 <String "samr">
	//  226  644:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  227  647:putstatic       #424 <Field int TYPE_samr>
	//  228  650:ldc2            #426 <String "sawb">
	//  229  653:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  230  656:putstatic       #428 <Field int TYPE_sawb>
	//  231  659:ldc2            #430 <String "udta">
	//  232  662:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  233  665:putstatic       #432 <Field int TYPE_udta>
	//  234  668:ldc2            #434 <String "meta">
	//  235  671:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  236  674:putstatic       #436 <Field int TYPE_meta>
	//  237  677:ldc2            #438 <String "ilst">
	//  238  680:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  239  683:putstatic       #440 <Field int TYPE_ilst>
	//  240  686:ldc2            #442 <String "mean">
	//  241  689:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  242  692:putstatic       #444 <Field int TYPE_mean>
	//  243  695:ldc2            #446 <String "name">
	//  244  698:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  245  701:putstatic       #448 <Field int TYPE_name>
	//  246  704:ldc2            #450 <String "data">
	//  247  707:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  248  710:putstatic       #452 <Field int TYPE_data>
	//  249  713:ldc2            #454 <String "emsg">
	//  250  716:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  251  719:putstatic       #456 <Field int TYPE_emsg>
	//  252  722:ldc2            #458 <String "st3d">
	//  253  725:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  254  728:putstatic       #460 <Field int TYPE_st3d>
	//  255  731:ldc2            #462 <String "sv3d">
	//  256  734:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  257  737:putstatic       #464 <Field int TYPE_sv3d>
	//  258  740:ldc2            #466 <String "proj">
	//  259  743:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  260  746:putstatic       #468 <Field int TYPE_proj>
	//  261  749:ldc2            #470 <String "vp08">
	//  262  752:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  263  755:putstatic       #472 <Field int TYPE_vp08>
	//  264  758:ldc2            #474 <String "vp09">
	//  265  761:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  266  764:putstatic       #476 <Field int TYPE_vp09>
	//  267  767:ldc2            #478 <String "vpcC">
	//  268  770:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  269  773:putstatic       #480 <Field int TYPE_vpcC>
	//  270  776:ldc2            #482 <String "camm">
	//  271  779:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  272  782:putstatic       #484 <Field int TYPE_camm>
	//  273  785:ldc2            #486 <String "----">
	//  274  788:invokestatic    #122 <Method int Util.getIntegerCodeForString(String)>
	//  275  791:putstatic       #488 <Field int TYPE_DASHES>
	//* 276  794:return          
	}
}
