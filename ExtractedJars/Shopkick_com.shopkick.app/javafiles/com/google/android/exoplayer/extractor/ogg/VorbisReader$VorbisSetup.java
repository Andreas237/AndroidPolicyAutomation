// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.ogg;


// Referenced classes of package com.google.android.exoplayer.extractor.ogg:
//			VorbisReader

static final class VorbisReader$VorbisSetup
{

	public final VorbisUtil$CommentHeader commentHeader;
	public final int iLogModes;
	public final  idHeader;
	public final VorbisUtil.Mode modes[];
	public final byte setupHeaderData[];

	public VorbisReader$VorbisSetup( , VorbisUtil$CommentHeader vorbisutil$commentheader, byte abyte0[], VorbisUtil.Mode amode[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		idHeader = ;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field VorbisUtil$VorbisIdHeader idHeader>
		commentHeader = vorbisutil$commentheader;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field VorbisUtil$CommentHeader commentHeader>
		setupHeaderData = abyte0;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #28  <Field byte[] setupHeaderData>
		modes = amode;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #30  <Field VorbisUtil$Mode[] modes>
		iLogModes = i;
	//   14   25:aload_0         
	//   15   26:iload           5
	//   16   28:putfield        #32  <Field int iLogModes>
	//   17   31:return          
	}
}
