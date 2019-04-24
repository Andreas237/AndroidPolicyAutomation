// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.exoplayer2.extractor:
//			ExtractorInput

public interface TrackOutput
{
	public static final class CryptoData
	{

		public boolean equals(Object obj)
		{
			if(this == obj)
		//*   0    0:aload_0         
		//*   1    1:aload_1         
		//*   2    2:if_acmpne       7
				return true;
		//    3    5:iconst_1        
		//    4    6:ireturn         
			if(obj != null)
		//*   5    7:aload_1         
		//*   6    8:ifnull          80
			{
				if(((Object)this).getClass() != obj.getClass())
		//*   7   11:aload_0         
		//*   8   12:invokevirtual   #34  <Method Class Object.getClass()>
		//*   9   15:aload_1         
		//*  10   16:invokevirtual   #34  <Method Class Object.getClass()>
		//*  11   19:if_acmpeq       24
					return false;
		//   12   22:iconst_0        
		//   13   23:ireturn         
				obj = ((Object) ((CryptoData)obj));
		//   14   24:aload_1         
		//   15   25:checkcast       #2   <Class TrackOutput$CryptoData>
		//   16   28:astore_1        
				return cryptoMode == ((CryptoData) (obj)).cryptoMode && encryptedBlocks == ((CryptoData) (obj)).encryptedBlocks && clearBlocks == ((CryptoData) (obj)).clearBlocks && Arrays.equals(encryptionKey, ((CryptoData) (obj)).encryptionKey);
		//   17   29:aload_0         
		//   18   30:getfield        #20  <Field int cryptoMode>
		//   19   33:aload_1         
		//   20   34:getfield        #20  <Field int cryptoMode>
		//   21   37:icmpne          78
		//   22   40:aload_0         
		//   23   41:getfield        #24  <Field int encryptedBlocks>
		//   24   44:aload_1         
		//   25   45:getfield        #24  <Field int encryptedBlocks>
		//   26   48:icmpne          78
		//   27   51:aload_0         
		//   28   52:getfield        #26  <Field int clearBlocks>
		//   29   55:aload_1         
		//   30   56:getfield        #26  <Field int clearBlocks>
		//   31   59:icmpne          78
		//   32   62:aload_0         
		//   33   63:getfield        #22  <Field byte[] encryptionKey>
		//   34   66:aload_1         
		//   35   67:getfield        #22  <Field byte[] encryptionKey>
		//   36   70:invokestatic    #39  <Method boolean Arrays.equals(byte[], byte[])>
		//   37   73:ifeq            78
		//   38   76:iconst_1        
		//   39   77:ireturn         
		//   40   78:iconst_0        
		//   41   79:ireturn         
			} else
			{
				return false;
		//   42   80:iconst_0        
		//   43   81:ireturn         
			}
		}

		public int hashCode()
		{
			return 31 * ((cryptoMode * 31 + Arrays.hashCode(encryptionKey)) * 31 + encryptedBlocks) + clearBlocks;
		//    0    0:bipush          31
		//    1    2:aload_0         
		//    2    3:getfield        #20  <Field int cryptoMode>
		//    3    6:bipush          31
		//    4    8:imul            
		//    5    9:aload_0         
		//    6   10:getfield        #22  <Field byte[] encryptionKey>
		//    7   13:invokestatic    #45  <Method int Arrays.hashCode(byte[])>
		//    8   16:iadd            
		//    9   17:bipush          31
		//   10   19:imul            
		//   11   20:aload_0         
		//   12   21:getfield        #24  <Field int encryptedBlocks>
		//   13   24:iadd            
		//   14   25:imul            
		//   15   26:aload_0         
		//   16   27:getfield        #26  <Field int clearBlocks>
		//   17   30:iadd            
		//   18   31:ireturn         
		}

		public final int clearBlocks;
		public final int cryptoMode;
		public final int encryptedBlocks;
		public final byte encryptionKey[];

		public CryptoData(int i, byte abyte0[], int j, int k)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			cryptoMode = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #20  <Field int cryptoMode>
			encryptionKey = abyte0;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field byte[] encryptionKey>
			encryptedBlocks = j;
		//    8   14:aload_0         
		//    9   15:iload_3         
		//   10   16:putfield        #24  <Field int encryptedBlocks>
			clearBlocks = k;
		//   11   19:aload_0         
		//   12   20:iload           4
		//   13   22:putfield        #26  <Field int clearBlocks>
		//   14   25:return          
		}
	}


	public abstract void format(Format format1);

	public abstract int sampleData(ExtractorInput extractorinput, int i, boolean flag)
		throws IOException, InterruptedException;

	public abstract void sampleData(ParsableByteArray parsablebytearray, int i);

	public abstract void sampleMetadata(long l, int i, int j, int k, CryptoData cryptodata);
}
