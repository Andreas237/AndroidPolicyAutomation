// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
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
			stringbuilder.append(Arrays.toString(leafChildren.toArray()));
		//   14   27:aload_1         
		//   15   28:aload_0         
		//   16   29:getfield        #26  <Field List leafChildren>
		//   17   32:invokeinterface #77  <Method Object[] List.toArray()>
		//   18   37:invokestatic    #82  <Method String Arrays.toString(Object[])>
		//   19   40:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   20   43:pop             
			stringbuilder.append(" containers: ");
		//   21   44:aload_1         
		//   22   45:ldc1            #84  <String " containers: ">
		//   23   47:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   24   50:pop             
			stringbuilder.append(Arrays.toString(containerChildren.toArray()));
		//   25   51:aload_1         
		//   26   52:aload_0         
		//   27   53:getfield        #28  <Field List containerChildren>
		//   28   56:invokeinterface #77  <Method Object[] List.toArray()>
		//   29   61:invokestatic    #82  <Method String Arrays.toString(Object[])>
		//   30   64:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
		//   31   67:pop             
			return stringbuilder.toString();
		//   32   68:aload_1         
		//   33   69:invokevirtual   #86  <Method String StringBuilder.toString()>
		//   34   72:areturn         
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
	//    1    1:invokespecial   #500 <Method void Object()>
		type = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #502 <Field int type>
	//    5    9:return          
	}

	public static String getAtomTypeString(int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #506 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #507 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("");
	//    4    8:aload_1         
	//    5    9:ldc2            #509 <String "">
	//    6   12:invokevirtual   #513 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append((char)(i >> 24 & 0xff));
	//    8   16:aload_1         
	//    9   17:iload_0         
	//   10   18:bipush          24
	//   11   20:ishr            
	//   12   21:sipush          255
	//   13   24:iand            
	//   14   25:int2char        
	//   15   26:invokevirtual   #516 <Method StringBuilder StringBuilder.append(char)>
	//   16   29:pop             
		stringbuilder.append((char)(i >> 16 & 0xff));
	//   17   30:aload_1         
	//   18   31:iload_0         
	//   19   32:bipush          16
	//   20   34:ishr            
	//   21   35:sipush          255
	//   22   38:iand            
	//   23   39:int2char        
	//   24   40:invokevirtual   #516 <Method StringBuilder StringBuilder.append(char)>
	//   25   43:pop             
		stringbuilder.append((char)(i >> 8 & 0xff));
	//   26   44:aload_1         
	//   27   45:iload_0         
	//   28   46:bipush          8
	//   29   48:ishr            
	//   30   49:sipush          255
	//   31   52:iand            
	//   32   53:int2char        
	//   33   54:invokevirtual   #516 <Method StringBuilder StringBuilder.append(char)>
	//   34   57:pop             
		stringbuilder.append((char)(i & 0xff));
	//   35   58:aload_1         
	//   36   59:iload_0         
	//   37   60:sipush          255
	//   38   63:iand            
	//   39   64:int2char        
	//   40   65:invokevirtual   #516 <Method StringBuilder StringBuilder.append(char)>
	//   41   68:pop             
		return stringbuilder.toString();
	//   42   69:aload_1         
	//   43   70:invokevirtual   #520 <Method String StringBuilder.toString()>
	//   44   73:areturn         
	}

	public static int parseFullAtomFlags(int i)
	{
		return i & 0xffffff;
	//    0    0:iload_0         
	//    1    1:ldc2            #523 <Int 0xffffff>
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
	//    1    1:getfield        #502 <Field int type>
	//    2    4:invokestatic    #526 <Method String getAtomTypeString(int)>
	//    3    7:areturn         
	}

	public static final int DEFINES_LARGE_SIZE = 1;
	public static final int EXTENDS_TO_END_SIZE = 0;
	public static final int FULL_HEADER_SIZE = 12;
	public static final int HEADER_SIZE = 8;
	public static final int LONG_HEADER_SIZE = 16;
	public static final int TYPE_TTML = Util.getIntegerCodeForString("TTML");
	public static final int TYPE__mp3 = Util.getIntegerCodeForString(".mp3");
	public static final int TYPE_ac_3 = Util.getIntegerCodeForString("ac-3");
	public static final int TYPE_alac = Util.getIntegerCodeForString("alac");
	public static final int TYPE_avc1 = Util.getIntegerCodeForString("avc1");
	public static final int TYPE_avc3 = Util.getIntegerCodeForString("avc3");
	public static final int TYPE_avcC = Util.getIntegerCodeForString("avcC");
	public static final int TYPE_c608 = Util.getIntegerCodeForString("c608");
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
	//    0    0:ldc1            #119 <String "ftyp">
	//    1    2:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//    2    5:putstatic       #127 <Field int TYPE_ftyp>
	//    3    8:ldc1            #129 <String "avc1">
	//    4   10:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//    5   13:putstatic       #131 <Field int TYPE_avc1>
	//    6   16:ldc1            #133 <String "avc3">
	//    7   18:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//    8   21:putstatic       #135 <Field int TYPE_avc3>
	//    9   24:ldc1            #137 <String "hvc1">
	//   10   26:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   11   29:putstatic       #139 <Field int TYPE_hvc1>
	//   12   32:ldc1            #141 <String "hev1">
	//   13   34:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   14   37:putstatic       #143 <Field int TYPE_hev1>
	//   15   40:ldc1            #145 <String "s263">
	//   16   42:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   17   45:putstatic       #147 <Field int TYPE_s263>
	//   18   48:ldc1            #149 <String "d263">
	//   19   50:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   20   53:putstatic       #151 <Field int TYPE_d263>
	//   21   56:ldc1            #153 <String "mdat">
	//   22   58:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   23   61:putstatic       #155 <Field int TYPE_mdat>
	//   24   64:ldc1            #157 <String "mp4a">
	//   25   66:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   26   69:putstatic       #159 <Field int TYPE_mp4a>
	//   27   72:ldc1            #161 <String ".mp3">
	//   28   74:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   29   77:putstatic       #163 <Field int TYPE__mp3>
	//   30   80:ldc1            #165 <String "wave">
	//   31   82:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   32   85:putstatic       #167 <Field int TYPE_wave>
	//   33   88:ldc1            #169 <String "lpcm">
	//   34   90:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   35   93:putstatic       #171 <Field int TYPE_lpcm>
	//   36   96:ldc1            #173 <String "sowt">
	//   37   98:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   38  101:putstatic       #175 <Field int TYPE_sowt>
	//   39  104:ldc1            #177 <String "ac-3">
	//   40  106:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   41  109:putstatic       #179 <Field int TYPE_ac_3>
	//   42  112:ldc1            #181 <String "dac3">
	//   43  114:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   44  117:putstatic       #183 <Field int TYPE_dac3>
	//   45  120:ldc1            #185 <String "ec-3">
	//   46  122:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   47  125:putstatic       #187 <Field int TYPE_ec_3>
	//   48  128:ldc1            #189 <String "dec3">
	//   49  130:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   50  133:putstatic       #191 <Field int TYPE_dec3>
	//   51  136:ldc1            #193 <String "dtsc">
	//   52  138:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   53  141:putstatic       #195 <Field int TYPE_dtsc>
	//   54  144:ldc1            #197 <String "dtsh">
	//   55  146:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   56  149:putstatic       #199 <Field int TYPE_dtsh>
	//   57  152:ldc1            #201 <String "dtsl">
	//   58  154:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   59  157:putstatic       #203 <Field int TYPE_dtsl>
	//   60  160:ldc1            #205 <String "dtse">
	//   61  162:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   62  165:putstatic       #207 <Field int TYPE_dtse>
	//   63  168:ldc1            #209 <String "ddts">
	//   64  170:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   65  173:putstatic       #211 <Field int TYPE_ddts>
	//   66  176:ldc1            #213 <String "tfdt">
	//   67  178:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   68  181:putstatic       #215 <Field int TYPE_tfdt>
	//   69  184:ldc1            #217 <String "tfhd">
	//   70  186:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   71  189:putstatic       #219 <Field int TYPE_tfhd>
	//   72  192:ldc1            #221 <String "trex">
	//   73  194:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   74  197:putstatic       #223 <Field int TYPE_trex>
	//   75  200:ldc1            #225 <String "trun">
	//   76  202:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   77  205:putstatic       #227 <Field int TYPE_trun>
	//   78  208:ldc1            #229 <String "sidx">
	//   79  210:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   80  213:putstatic       #231 <Field int TYPE_sidx>
	//   81  216:ldc1            #233 <String "moov">
	//   82  218:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   83  221:putstatic       #235 <Field int TYPE_moov>
	//   84  224:ldc1            #237 <String "mvhd">
	//   85  226:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   86  229:putstatic       #239 <Field int TYPE_mvhd>
	//   87  232:ldc1            #241 <String "trak">
	//   88  234:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   89  237:putstatic       #243 <Field int TYPE_trak>
	//   90  240:ldc1            #245 <String "mdia">
	//   91  242:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   92  245:putstatic       #247 <Field int TYPE_mdia>
	//   93  248:ldc1            #249 <String "minf">
	//   94  250:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   95  253:putstatic       #251 <Field int TYPE_minf>
	//   96  256:ldc1            #253 <String "stbl">
	//   97  258:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//   98  261:putstatic       #255 <Field int TYPE_stbl>
	//   99  264:ldc2            #257 <String "avcC">
	//  100  267:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  101  270:putstatic       #259 <Field int TYPE_avcC>
	//  102  273:ldc2            #261 <String "hvcC">
	//  103  276:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  104  279:putstatic       #263 <Field int TYPE_hvcC>
	//  105  282:ldc2            #265 <String "esds">
	//  106  285:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  107  288:putstatic       #267 <Field int TYPE_esds>
	//  108  291:ldc2            #269 <String "moof">
	//  109  294:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  110  297:putstatic       #271 <Field int TYPE_moof>
	//  111  300:ldc2            #273 <String "traf">
	//  112  303:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  113  306:putstatic       #275 <Field int TYPE_traf>
	//  114  309:ldc2            #277 <String "mvex">
	//  115  312:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  116  315:putstatic       #279 <Field int TYPE_mvex>
	//  117  318:ldc2            #281 <String "mehd">
	//  118  321:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  119  324:putstatic       #283 <Field int TYPE_mehd>
	//  120  327:ldc2            #285 <String "tkhd">
	//  121  330:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  122  333:putstatic       #287 <Field int TYPE_tkhd>
	//  123  336:ldc2            #289 <String "edts">
	//  124  339:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  125  342:putstatic       #291 <Field int TYPE_edts>
	//  126  345:ldc2            #293 <String "elst">
	//  127  348:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  128  351:putstatic       #295 <Field int TYPE_elst>
	//  129  354:ldc2            #297 <String "mdhd">
	//  130  357:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  131  360:putstatic       #299 <Field int TYPE_mdhd>
	//  132  363:ldc2            #301 <String "hdlr">
	//  133  366:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  134  369:putstatic       #303 <Field int TYPE_hdlr>
	//  135  372:ldc2            #305 <String "stsd">
	//  136  375:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  137  378:putstatic       #307 <Field int TYPE_stsd>
	//  138  381:ldc2            #309 <String "pssh">
	//  139  384:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  140  387:putstatic       #311 <Field int TYPE_pssh>
	//  141  390:ldc2            #313 <String "sinf">
	//  142  393:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  143  396:putstatic       #315 <Field int TYPE_sinf>
	//  144  399:ldc2            #317 <String "schm">
	//  145  402:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  146  405:putstatic       #319 <Field int TYPE_schm>
	//  147  408:ldc2            #321 <String "schi">
	//  148  411:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  149  414:putstatic       #323 <Field int TYPE_schi>
	//  150  417:ldc2            #325 <String "tenc">
	//  151  420:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  152  423:putstatic       #327 <Field int TYPE_tenc>
	//  153  426:ldc2            #329 <String "encv">
	//  154  429:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  155  432:putstatic       #331 <Field int TYPE_encv>
	//  156  435:ldc2            #333 <String "enca">
	//  157  438:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  158  441:putstatic       #335 <Field int TYPE_enca>
	//  159  444:ldc2            #337 <String "frma">
	//  160  447:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  161  450:putstatic       #339 <Field int TYPE_frma>
	//  162  453:ldc2            #341 <String "saiz">
	//  163  456:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  164  459:putstatic       #343 <Field int TYPE_saiz>
	//  165  462:ldc2            #345 <String "saio">
	//  166  465:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  167  468:putstatic       #347 <Field int TYPE_saio>
	//  168  471:ldc2            #349 <String "sbgp">
	//  169  474:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  170  477:putstatic       #351 <Field int TYPE_sbgp>
	//  171  480:ldc2            #353 <String "sgpd">
	//  172  483:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  173  486:putstatic       #355 <Field int TYPE_sgpd>
	//  174  489:ldc2            #357 <String "uuid">
	//  175  492:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  176  495:putstatic       #359 <Field int TYPE_uuid>
	//  177  498:ldc2            #361 <String "senc">
	//  178  501:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  179  504:putstatic       #363 <Field int TYPE_senc>
	//  180  507:ldc2            #365 <String "pasp">
	//  181  510:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  182  513:putstatic       #367 <Field int TYPE_pasp>
	//  183  516:ldc2            #369 <String "TTML">
	//  184  519:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  185  522:putstatic       #371 <Field int TYPE_TTML>
	//  186  525:ldc2            #373 <String "vmhd">
	//  187  528:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  188  531:putstatic       #375 <Field int TYPE_vmhd>
	//  189  534:ldc2            #377 <String "mp4v">
	//  190  537:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  191  540:putstatic       #379 <Field int TYPE_mp4v>
	//  192  543:ldc2            #381 <String "stts">
	//  193  546:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  194  549:putstatic       #383 <Field int TYPE_stts>
	//  195  552:ldc2            #385 <String "stss">
	//  196  555:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  197  558:putstatic       #387 <Field int TYPE_stss>
	//  198  561:ldc2            #389 <String "ctts">
	//  199  564:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  200  567:putstatic       #391 <Field int TYPE_ctts>
	//  201  570:ldc2            #393 <String "stsc">
	//  202  573:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  203  576:putstatic       #395 <Field int TYPE_stsc>
	//  204  579:ldc2            #397 <String "stsz">
	//  205  582:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  206  585:putstatic       #399 <Field int TYPE_stsz>
	//  207  588:ldc2            #401 <String "stz2">
	//  208  591:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  209  594:putstatic       #403 <Field int TYPE_stz2>
	//  210  597:ldc2            #405 <String "stco">
	//  211  600:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  212  603:putstatic       #407 <Field int TYPE_stco>
	//  213  606:ldc2            #409 <String "co64">
	//  214  609:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  215  612:putstatic       #411 <Field int TYPE_co64>
	//  216  615:ldc2            #413 <String "tx3g">
	//  217  618:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  218  621:putstatic       #415 <Field int TYPE_tx3g>
	//  219  624:ldc2            #417 <String "wvtt">
	//  220  627:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  221  630:putstatic       #419 <Field int TYPE_wvtt>
	//  222  633:ldc2            #421 <String "stpp">
	//  223  636:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  224  639:putstatic       #423 <Field int TYPE_stpp>
	//  225  642:ldc2            #425 <String "c608">
	//  226  645:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  227  648:putstatic       #427 <Field int TYPE_c608>
	//  228  651:ldc2            #429 <String "samr">
	//  229  654:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  230  657:putstatic       #431 <Field int TYPE_samr>
	//  231  660:ldc2            #433 <String "sawb">
	//  232  663:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  233  666:putstatic       #435 <Field int TYPE_sawb>
	//  234  669:ldc2            #437 <String "udta">
	//  235  672:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  236  675:putstatic       #439 <Field int TYPE_udta>
	//  237  678:ldc2            #441 <String "meta">
	//  238  681:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  239  684:putstatic       #443 <Field int TYPE_meta>
	//  240  687:ldc2            #445 <String "ilst">
	//  241  690:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  242  693:putstatic       #447 <Field int TYPE_ilst>
	//  243  696:ldc2            #449 <String "mean">
	//  244  699:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  245  702:putstatic       #451 <Field int TYPE_mean>
	//  246  705:ldc2            #453 <String "name">
	//  247  708:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  248  711:putstatic       #455 <Field int TYPE_name>
	//  249  714:ldc2            #457 <String "data">
	//  250  717:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  251  720:putstatic       #459 <Field int TYPE_data>
	//  252  723:ldc2            #461 <String "emsg">
	//  253  726:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  254  729:putstatic       #463 <Field int TYPE_emsg>
	//  255  732:ldc2            #465 <String "st3d">
	//  256  735:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  257  738:putstatic       #467 <Field int TYPE_st3d>
	//  258  741:ldc2            #469 <String "sv3d">
	//  259  744:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  260  747:putstatic       #471 <Field int TYPE_sv3d>
	//  261  750:ldc2            #473 <String "proj">
	//  262  753:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  263  756:putstatic       #475 <Field int TYPE_proj>
	//  264  759:ldc2            #477 <String "vp08">
	//  265  762:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  266  765:putstatic       #479 <Field int TYPE_vp08>
	//  267  768:ldc2            #481 <String "vp09">
	//  268  771:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  269  774:putstatic       #483 <Field int TYPE_vp09>
	//  270  777:ldc2            #485 <String "vpcC">
	//  271  780:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  272  783:putstatic       #487 <Field int TYPE_vpcC>
	//  273  786:ldc2            #489 <String "camm">
	//  274  789:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  275  792:putstatic       #491 <Field int TYPE_camm>
	//  276  795:ldc2            #493 <String "alac">
	//  277  798:invokestatic    #125 <Method int Util.getIntegerCodeForString(String)>
	//  278  801:putstatic       #495 <Field int TYPE_alac>
	//* 279  804:return          
	}
}
