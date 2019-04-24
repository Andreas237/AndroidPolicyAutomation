// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.net.URLDecoder;

// Referenced classes of package com.google.android.exoplayer2.upstream:
//			DataSource, DataSpec

public final class DataSchemeDataSource
	implements DataSource
{

	public DataSchemeDataSource()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	public void close()
		throws IOException
	{
		dataSpec = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #25  <Field DataSpec dataSpec>
		data = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #27  <Field byte[] data>
	//    6   10:return          
	}

	public Uri getUri()
	{
		if(dataSpec != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field DataSpec dataSpec>
	//*   2    4:ifnull          15
			return dataSpec.uri;
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field DataSpec dataSpec>
	//    5   11:getfield        #36  <Field Uri DataSpec.uri>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public long open(DataSpec dataspec)
		throws IOException
	{
		dataSpec = dataspec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field DataSpec dataSpec>
		dataspec = ((DataSpec) (dataspec.uri));
	//    3    5:aload_1         
	//    4    6:getfield        #36  <Field Uri DataSpec.uri>
	//    5    9:astore_1        
		Object obj = ((Object) (((Uri) (dataspec)).getScheme()));
	//    6   10:aload_1         
	//    7   11:invokevirtual   #46  <Method String Uri.getScheme()>
	//    8   14:astore_2        
		if(!"data".equals(obj))
	//*   9   15:ldc1            #10  <String "data">
	//*  10   17:aload_2         
	//*  11   18:invokevirtual   #52  <Method boolean String.equals(Object)>
	//*  12   21:ifne            57
		{
			dataspec = ((DataSpec) (new StringBuilder()));
	//   13   24:new             #54  <Class StringBuilder>
	//   14   27:dup             
	//   15   28:invokespecial   #55  <Method void StringBuilder()>
	//   16   31:astore_1        
			((StringBuilder) (dataspec)).append("Unsupported scheme: ");
	//   17   32:aload_1         
	//   18   33:ldc1            #57  <String "Unsupported scheme: ">
	//   19   35:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			((StringBuilder) (dataspec)).append(((String) (obj)));
	//   21   39:aload_1         
	//   22   40:aload_2         
	//   23   41:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
			throw new ParserException(((StringBuilder) (dataspec)).toString());
	//   25   45:new             #63  <Class ParserException>
	//   26   48:dup             
	//   27   49:aload_1         
	//   28   50:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   29   53:invokespecial   #69  <Method void ParserException(String)>
	//   30   56:athrow          
		}
		obj = ((Object) (Util.split(((Uri) (dataspec)).getSchemeSpecificPart(), ",")));
	//   31   57:aload_1         
	//   32   58:invokevirtual   #72  <Method String Uri.getSchemeSpecificPart()>
	//   33   61:ldc1            #74  <String ",">
	//   34   63:invokestatic    #80  <Method String[] Util.split(String, String)>
	//   35   66:astore_2        
		if(obj.length != 2)
	//*  36   67:aload_2         
	//*  37   68:arraylength     
	//*  38   69:iconst_2        
	//*  39   70:icmpeq          106
		{
			obj = ((Object) (new StringBuilder()));
	//   40   73:new             #54  <Class StringBuilder>
	//   41   76:dup             
	//   42   77:invokespecial   #55  <Method void StringBuilder()>
	//   43   80:astore_2        
			((StringBuilder) (obj)).append("Unexpected URI format: ");
	//   44   81:aload_2         
	//   45   82:ldc1            #82  <String "Unexpected URI format: ">
	//   46   84:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   47   87:pop             
			((StringBuilder) (obj)).append(((Object) (dataspec)));
	//   48   88:aload_2         
	//   49   89:aload_1         
	//   50   90:invokevirtual   #85  <Method StringBuilder StringBuilder.append(Object)>
	//   51   93:pop             
			throw new ParserException(((StringBuilder) (obj)).toString());
	//   52   94:new             #63  <Class ParserException>
	//   53   97:dup             
	//   54   98:aload_2         
	//   55   99:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   56  102:invokespecial   #69  <Method void ParserException(String)>
	//   57  105:athrow          
		}
		dataspec = ((DataSpec) (obj[1]));
	//   58  106:aload_2         
	//   59  107:iconst_1        
	//   60  108:aaload          
	//   61  109:astore_1        
		if(((String) (obj[0])).contains(";base64"))
	//*  62  110:aload_2         
	//*  63  111:iconst_0        
	//*  64  112:aaload          
	//*  65  113:ldc1            #87  <String ";base64">
	//*  66  115:invokevirtual   #91  <Method boolean String.contains(CharSequence)>
	//*  67  118:ifeq            168
			try
			{
				data = Base64.decode(((String) (dataspec)), 0);
	//   68  121:aload_0         
	//   69  122:aload_1         
	//   70  123:iconst_0        
	//   71  124:invokestatic    #97  <Method byte[] Base64.decode(String, int)>
	//   72  127:putfield        #27  <Field byte[] data>
			}
	//*  73  130:goto            181
			catch(IllegalArgumentException illegalargumentexception)
	//*  74  133:astore_2        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   75  134:new             #54  <Class StringBuilder>
	//   76  137:dup             
	//   77  138:invokespecial   #55  <Method void StringBuilder()>
	//   78  141:astore_3        
				stringbuilder.append("Error while parsing Base64 encoded string: ");
	//   79  142:aload_3         
	//   80  143:ldc1            #99  <String "Error while parsing Base64 encoded string: ">
	//   81  145:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   82  148:pop             
				stringbuilder.append(((String) (dataspec)));
	//   83  149:aload_3         
	//   84  150:aload_1         
	//   85  151:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   86  154:pop             
				throw new ParserException(stringbuilder.toString(), ((Throwable) (illegalargumentexception)));
	//   87  155:new             #63  <Class ParserException>
	//   88  158:dup             
	//   89  159:aload_3         
	//   90  160:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   91  163:aload_2         
	//   92  164:invokespecial   #102 <Method void ParserException(String, Throwable)>
	//   93  167:athrow          
			}
		else
			data = URLDecoder.decode(((String) (dataspec)), "US-ASCII").getBytes();
	//   94  168:aload_0         
	//   95  169:aload_1         
	//   96  170:ldc1            #104 <String "US-ASCII">
	//   97  172:invokestatic    #109 <Method String URLDecoder.decode(String, String)>
	//   98  175:invokevirtual   #113 <Method byte[] String.getBytes()>
	//   99  178:putfield        #27  <Field byte[] data>
		return (long)data.length;
	//  100  181:aload_0         
	//  101  182:getfield        #27  <Field byte[] data>
	//  102  185:arraylength     
	//  103  186:i2l             
	//  104  187:lreturn         
	}

	public int read(byte abyte0[], int i, int j)
	{
		if(j == 0)
	//*   0    0:iload_3         
	//*   1    1:ifne            6
			return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
		int k = data.length - bytesRead;
	//    4    6:aload_0         
	//    5    7:getfield        #27  <Field byte[] data>
	//    6   10:arraylength     
	//    7   11:aload_0         
	//    8   12:getfield        #117 <Field int bytesRead>
	//    9   15:isub            
	//   10   16:istore          4
		if(k == 0)
	//*  11   18:iload           4
	//*  12   20:ifne            25
		{
			return -1;
	//   13   23:iconst_m1       
	//   14   24:ireturn         
		} else
		{
			j = Math.min(j, k);
	//   15   25:iload_3         
	//   16   26:iload           4
	//   17   28:invokestatic    #123 <Method int Math.min(int, int)>
	//   18   31:istore_3        
			System.arraycopy(((Object) (data)), bytesRead, ((Object) (abyte0)), i, j);
	//   19   32:aload_0         
	//   20   33:getfield        #27  <Field byte[] data>
	//   21   36:aload_0         
	//   22   37:getfield        #117 <Field int bytesRead>
	//   23   40:aload_1         
	//   24   41:iload_2         
	//   25   42:iload_3         
	//   26   43:invokestatic    #129 <Method void System.arraycopy(Object, int, Object, int, int)>
			bytesRead = bytesRead + j;
	//   27   46:aload_0         
	//   28   47:aload_0         
	//   29   48:getfield        #117 <Field int bytesRead>
	//   30   51:iload_3         
	//   31   52:iadd            
	//   32   53:putfield        #117 <Field int bytesRead>
			return j;
	//   33   56:iload_3         
	//   34   57:ireturn         
		}
	}

	public static final String SCHEME_DATA = "data";
	private int bytesRead;
	private byte data[];
	private DataSpec dataSpec;
}
