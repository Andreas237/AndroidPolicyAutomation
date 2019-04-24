// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ts;


// Referenced classes of package com.google.android.exoplayer2.extractor.ts:
//			TsPayloadReader

public static final class TsPayloadReader$TrackIdGenerator
{

	private void maybeThrowUninitializedError()
	{
		if(trackId == 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field int trackId>
	//*   2    4:ldc1            #10  <Int 0x80000000>
	//*   3    6:icmpne          19
			throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
	//    4    9:new             #54  <Class IllegalStateException>
	//    5   12:dup             
	//    6   13:ldc1            #56  <String "generateNewId() must be called before retrieving ids.">
	//    7   15:invokespecial   #59  <Method void IllegalStateException(String)>
	//    8   18:athrow          
		else
			return;
	//    9   19:return          
	}

	public void generateNewId()
	{
		int i;
		if(trackId == 0x80000000)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field int trackId>
	//*   2    4:ldc1            #10  <Int 0x80000000>
	//*   3    6:icmpne          17
			i = firstTrackId;
	//    4    9:aload_0         
	//    5   10:getfield        #47  <Field int firstTrackId>
	//    6   13:istore_1        
		else
	//*   7   14:goto            27
			i = trackId + trackIdIncrement;
	//    8   17:aload_0         
	//    9   18:getfield        #51  <Field int trackId>
	//   10   21:aload_0         
	//   11   22:getfield        #49  <Field int trackIdIncrement>
	//   12   25:iadd            
	//   13   26:istore_1        
		trackId = i;
	//   14   27:aload_0         
	//   15   28:iload_1         
	//   16   29:putfield        #51  <Field int trackId>
		StringBuilder stringbuilder = new StringBuilder();
	//   17   32:new             #27  <Class StringBuilder>
	//   18   35:dup             
	//   19   36:invokespecial   #28  <Method void StringBuilder()>
	//   20   39:astore_2        
		stringbuilder.append(formatIdPrefix);
	//   21   40:aload_2         
	//   22   41:aload_0         
	//   23   42:getfield        #45  <Field String formatIdPrefix>
	//   24   45:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
		stringbuilder.append(trackId);
	//   26   49:aload_2         
	//   27   50:aload_0         
	//   28   51:getfield        #51  <Field int trackId>
	//   29   54:invokevirtual   #32  <Method StringBuilder StringBuilder.append(int)>
	//   30   57:pop             
		formatId = stringbuilder.toString();
	//   31   58:aload_0         
	//   32   59:aload_2         
	//   33   60:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   34   63:putfield        #62  <Field String formatId>
	//   35   66:return          
	}

	public String getFormatId()
	{
		maybeThrowUninitializedError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void maybeThrowUninitializedError()>
		return formatId;
	//    2    4:aload_0         
	//    3    5:getfield        #62  <Field String formatId>
	//    4    8:areturn         
	}

	public int getTrackId()
	{
		maybeThrowUninitializedError();
	//    0    0:aload_0         
	//    1    1:invokespecial   #65  <Method void maybeThrowUninitializedError()>
		return trackId;
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field int trackId>
	//    4    8:ireturn         
	}

	private static final int ID_UNSET = 0x80000000;
	private final int firstTrackId;
	private String formatId;
	private final String formatIdPrefix;
	private int trackId;
	private final int trackIdIncrement;

	public TsPayloadReader$TrackIdGenerator(int i, int j)
	{
		this(0x80000000, i, j);
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <Int 0x80000000>
	//    2    3:iload_1         
	//    3    4:iload_2         
	//    4    5:invokespecial   #21  <Method void TsPayloadReader$TrackIdGenerator(int, int, int)>
	//    5    8:return          
	}

	public TsPayloadReader$TrackIdGenerator(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		Object obj;
		if(i != 0x80000000)
	//*   2    4:iload_1         
	//*   3    5:ldc1            #10  <Int 0x80000000>
	//*   4    7:icmpeq          44
		{
			obj = ((Object) (new StringBuilder()));
	//    5   10:new             #27  <Class StringBuilder>
	//    6   13:dup             
	//    7   14:invokespecial   #28  <Method void StringBuilder()>
	//    8   17:astore          4
			((StringBuilder) (obj)).append(i);
	//    9   19:aload           4
	//   10   21:iload_1         
	//   11   22:invokevirtual   #32  <Method StringBuilder StringBuilder.append(int)>
	//   12   25:pop             
			((StringBuilder) (obj)).append("/");
	//   13   26:aload           4
	//   14   28:ldc1            #34  <String "/">
	//   15   30:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   17   34:aload           4
	//   18   36:invokevirtual   #41  <Method String StringBuilder.toString()>
	//   19   39:astore          4
		} else
	//*  20   41:goto            48
		{
			obj = "";
	//   21   44:ldc1            #43  <String "">
	//   22   46:astore          4
		}
		formatIdPrefix = ((String) (obj));
	//   23   48:aload_0         
	//   24   49:aload           4
	//   25   51:putfield        #45  <Field String formatIdPrefix>
		firstTrackId = j;
	//   26   54:aload_0         
	//   27   55:iload_2         
	//   28   56:putfield        #47  <Field int firstTrackId>
		trackIdIncrement = k;
	//   29   59:aload_0         
	//   30   60:iload_3         
	//   31   61:putfield        #49  <Field int trackIdIncrement>
		trackId = 0x80000000;
	//   32   64:aload_0         
	//   33   65:ldc1            #10  <Int 0x80000000>
	//   34   67:putfield        #51  <Field int trackId>
	//   35   70:return          
	}
}
