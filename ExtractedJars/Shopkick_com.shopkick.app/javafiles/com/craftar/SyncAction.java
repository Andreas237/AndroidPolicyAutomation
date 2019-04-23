// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.craftar;

import java.io.*;
import java.net.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import org.json.*;

// Referenced classes of package com.craftar:
//			Build, CLog

class SyncAction
{

	public SyncAction(String s, String s1, JSONObject jsonobject)
	{
		int i;
		boolean flag1;
label0:
		{
			super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
			flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore          6
			useIndexFiles = Boolean.valueOf(false);
	//    4    7:aload_0         
	//    5    8:iconst_0        
	//    6    9:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//    7   12:putfield        #38  <Field Boolean useIndexFiles>
			useCtfFiles = Boolean.valueOf(false);
	//    8   15:aload_0         
	//    9   16:iconst_0        
	//   10   17:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//   11   20:putfield        #40  <Field Boolean useCtfFiles>
			type = s;
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:putfield        #42  <Field String type>
			itemUUID = s1;
	//   15   28:aload_0         
	//   16   29:aload_2         
	//   17   30:putfield        #44  <Field String itemUUID>
			i = s.hashCode();
	//   18   33:aload_1         
	//   19   34:invokevirtual   #50  <Method int String.hashCode()>
	//   20   37:istore          4
			if(i != 64641)
	//*  21   39:iload           4
	//*  22   41:ldc1            #51  <Int 64641>
	//*  23   43:icmpeq          71
			{
				if(i == 0x77f979ab && s.equals("DELETE"))
	//*  24   46:iload           4
	//*  25   48:ldc1            #52  <Int 0x77f979ab>
	//*  26   50:icmpeq          56
	//*  27   53:goto            86
	//*  28   56:aload_1         
	//*  29   57:ldc1            #9   <String "DELETE">
	//*  30   59:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  31   62:ifeq            86
				{
					i = 1;
	//   32   65:iconst_1        
	//   33   66:istore          4
					break label0;
	//   34   68:goto            89
				}
			} else
			if(s.equals("ADD"))
	//*  35   71:aload_1         
	//*  36   72:ldc1            #7   <String "ADD">
	//*  37   74:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  38   77:ifeq            86
			{
				i = 0;
	//   39   80:iconst_0        
	//   40   81:istore          4
				break label0;
	//   41   83:goto            89
			}
			i = -1;
	//   42   86:iconst_m1       
	//   43   87:istore          4
		}
		boolean flag;
label1:
		{
			switch(i)
	//*  44   89:iload           4
			{
	//*  45   91:tableswitch     0 1: default 112
	//	               0 133
	//	               1 115
	//*  46  112:goto            148
			case 1: // '\001'
				oldItemObject = jsonobject;
	//   47  115:aload_0         
	//   48  116:aload_3         
	//   49  117:putfield        #58  <Field JSONObject oldItemObject>
				needsToDownloadFiles = false;
	//   50  120:aload_0         
	//   51  121:iconst_0        
	//   52  122:putfield        #60  <Field boolean needsToDownloadFiles>
				syncFailed = false;
	//   53  125:aload_0         
	//   54  126:iconst_0        
	//   55  127:putfield        #62  <Field boolean syncFailed>
				break;

	//*  56  130:goto            148
			case 0: // '\0'
				newItemObject = jsonobject;
	//   57  133:aload_0         
	//   58  134:aload_3         
	//   59  135:putfield        #64  <Field JSONObject newItemObject>
				needsToDownloadFiles = true;
	//   60  138:aload_0         
	//   61  139:iconst_1        
	//   62  140:putfield        #60  <Field boolean needsToDownloadFiles>
				syncFailed = false;
	//   63  143:aload_0         
	//   64  144:iconst_0        
	//   65  145:putfield        #62  <Field boolean syncFailed>
				break;
			}
			if(!Build.SDK_CODENAME.equals("ARSDK") && !Build.SDK_CODENAME.equals("ODIRAR"))
	//*  66  148:getstatic       #69  <Field String Build.SDK_CODENAME>
	//*  67  151:ldc1            #71  <String "ARSDK">
	//*  68  153:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  69  156:ifne            179
	//*  70  159:getstatic       #69  <Field String Build.SDK_CODENAME>
	//*  71  162:ldc1            #73  <String "ODIRAR">
	//*  72  164:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  73  167:ifeq            173
	//*  74  170:goto            179
				flag = false;
	//   75  173:iconst_0        
	//   76  174:istore          5
			else
	//*  77  176:goto            182
				flag = true;
	//   78  179:iconst_1        
	//   79  180:istore          5
			useCtfFiles = Boolean.valueOf(flag);
	//   80  182:aload_0         
	//   81  183:iload           5
	//   82  185:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//   83  188:putfield        #40  <Field Boolean useCtfFiles>
			if(!Build.SDK_CODENAME.equals("ODIR"))
	//*  84  191:getstatic       #69  <Field String Build.SDK_CODENAME>
	//*  85  194:ldc1            #75  <String "ODIR">
	//*  86  196:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  87  199:ifne            217
			{
				flag = flag1;
	//   88  202:iload           6
	//   89  204:istore          5
				if(!Build.SDK_CODENAME.equals("ODIRAR"))
					break label1;
	//   90  206:getstatic       #69  <Field String Build.SDK_CODENAME>
	//   91  209:ldc1            #73  <String "ODIRAR">
	//   92  211:invokevirtual   #56  <Method boolean String.equals(Object)>
	//   93  214:ifeq            220
			}
			flag = true;
	//   94  217:iconst_1        
	//   95  218:istore          5
		}
		useIndexFiles = Boolean.valueOf(flag);
	//   96  220:aload_0         
	//   97  221:iload           5
	//   98  223:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//   99  226:putfield        #38  <Field Boolean useIndexFiles>
	//  100  229:return          
	}

	public SyncAction(String s, String s1, JSONObject jsonobject, JSONObject jsonobject1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		useIndexFiles = Boolean.valueOf(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:putfield        #38  <Field Boolean useIndexFiles>
		useCtfFiles = Boolean.valueOf(false);
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//    9   17:putfield        #40  <Field Boolean useCtfFiles>
		type = s;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #42  <Field String type>
		itemUUID = s1;
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:putfield        #44  <Field String itemUUID>
		newItemObject = jsonobject;
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:putfield        #64  <Field JSONObject newItemObject>
		oldItemObject = jsonobject1;
	//   19   35:aload_0         
	//   20   36:aload           4
	//   21   38:putfield        #58  <Field JSONObject oldItemObject>
		boolean flag;
		if(!Build.SDK_CODENAME.equals("ARSDK") && !Build.SDK_CODENAME.equals("ODIRAR"))
	//*  22   41:getstatic       #69  <Field String Build.SDK_CODENAME>
	//*  23   44:ldc1            #71  <String "ARSDK">
	//*  24   46:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  25   49:ifne            72
	//*  26   52:getstatic       #69  <Field String Build.SDK_CODENAME>
	//*  27   55:ldc1            #73  <String "ODIRAR">
	//*  28   57:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  29   60:ifeq            66
	//*  30   63:goto            72
			flag = false;
	//   31   66:iconst_0        
	//   32   67:istore          5
		else
	//*  33   69:goto            75
			flag = true;
	//   34   72:iconst_1        
	//   35   73:istore          5
		useCtfFiles = Boolean.valueOf(flag);
	//   36   75:aload_0         
	//   37   76:iload           5
	//   38   78:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//   39   81:putfield        #40  <Field Boolean useCtfFiles>
		if(!Build.SDK_CODENAME.equals("ODIR") && !Build.SDK_CODENAME.equals("ODIRAR"))
	//*  40   84:getstatic       #69  <Field String Build.SDK_CODENAME>
	//*  41   87:ldc1            #75  <String "ODIR">
	//*  42   89:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  43   92:ifne            115
	//*  44   95:getstatic       #69  <Field String Build.SDK_CODENAME>
	//*  45   98:ldc1            #73  <String "ODIRAR">
	//*  46  100:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  47  103:ifeq            109
	//*  48  106:goto            115
			flag = false;
	//   49  109:iconst_0        
	//   50  110:istore          5
		else
	//*  51  112:goto            118
			flag = true;
	//   52  115:iconst_1        
	//   53  116:istore          5
		useIndexFiles = Boolean.valueOf(flag);
	//   54  118:aload_0         
	//   55  119:iload           5
	//   56  121:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//   57  124:putfield        #38  <Field Boolean useIndexFiles>
		needsToDownloadFiles = true;
	//   58  127:aload_0         
	//   59  128:iconst_1        
	//   60  129:putfield        #60  <Field boolean needsToDownloadFiles>
		syncFailed = false;
	//   61  132:aload_0         
	//   62  133:iconst_0        
	//   63  134:putfield        #62  <Field boolean syncFailed>
	//   64  137:return          
	}

	private void add()
		throws JSONException
	{
		boolean flag1 = newItemObject.getBoolean("trackable");
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JSONObject newItemObject>
	//    2    4:ldc1            #82  <String "trackable">
	//    3    6:invokevirtual   #88  <Method boolean JSONObject.getBoolean(String)>
	//    4    9:istore          5
		JSONArray jsonarray = newItemObject.getJSONArray("images");
	//    5   11:aload_0         
	//    6   12:getfield        #64  <Field JSONObject newItemObject>
	//    7   15:ldc1            #90  <String "images">
	//    8   17:invokevirtual   #94  <Method JSONArray JSONObject.getJSONArray(String)>
	//    9   20:astore          7
		boolean flag = false;
	//   10   22:iconst_0        
	//   11   23:istore          4
		int l = 0;
	//   12   25:iconst_0        
	//   13   26:istore_3        
		int i = l;
	//   14   27:iload_3         
	//   15   28:istore_1        
		int k;
		do
		{
			k = i;
	//   16   29:iload_1         
	//   17   30:istore_2        
			if(l >= jsonarray.length())
				break;
	//   18   31:iload_3         
	//   19   32:aload           7
	//   20   34:invokevirtual   #99  <Method int JSONArray.length()>
	//   21   37:icmpge          86
			boolean flag2 = downloadFilesForImage(jsonarray.getString(l), Boolean.valueOf(flag1).booleanValue());
	//   22   40:aload_0         
	//   23   41:aload           7
	//   24   43:iload_3         
	//   25   44:invokevirtual   #103 <Method String JSONArray.getString(int)>
	//   26   47:iload           5
	//   27   49:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//   28   52:invokevirtual   #107 <Method boolean Boolean.booleanValue()>
	//   29   55:invokespecial   #111 <Method boolean downloadFilesForImage(String, boolean)>
	//   30   58:istore          6
			i++;
	//   31   60:iload_1         
	//   32   61:iconst_1        
	//   33   62:iadd            
	//   34   63:istore_1        
			if(!flag2)
	//*  35   64:iload           6
	//*  36   66:ifne            79
			{
				syncFailed = true;
	//   37   69:aload_0         
	//   38   70:iconst_1        
	//   39   71:putfield        #62  <Field boolean syncFailed>
				k = i;
	//   40   74:iload_1         
	//   41   75:istore_2        
				break;
	//   42   76:goto            86
			}
			l++;
	//   43   79:iload_3         
	//   44   80:iconst_1        
	//   45   81:iadd            
	//   46   82:istore_3        
		} while(true);
	//   47   83:goto            29
		if(syncFailed)
	//*  48   86:aload_0         
	//*  49   87:getfield        #62  <Field boolean syncFailed>
	//*  50   90:ifeq            118
		{
			for(int j = ((int) (flag)); j < k; j++)
	//*  51   93:iload           4
	//*  52   95:istore_1        
	//*  53   96:iload_1         
	//*  54   97:iload_2         
	//*  55   98:icmpge          118
				deleteFilesForImage(jsonarray.getString(j));
	//   56  101:aload_0         
	//   57  102:aload           7
	//   58  104:iload_1         
	//   59  105:invokevirtual   #103 <Method String JSONArray.getString(int)>
	//   60  108:invokespecial   #115 <Method void deleteFilesForImage(String)>

	//   61  111:iload_1         
	//   62  112:iconst_1        
	//   63  113:iadd            
	//   64  114:istore_1        
		}
	//*  65  115:goto            96
	//   66  118:return          
	}

	private void delete()
		throws JSONException
	{
		JSONArray jsonarray = oldItemObject.getJSONArray("images");
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field JSONObject oldItemObject>
	//    2    4:ldc1            #90  <String "images">
	//    3    6:invokevirtual   #94  <Method JSONArray JSONObject.getJSONArray(String)>
	//    4    9:astore_2        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   5   10:iconst_0        
	//*   6   11:istore_1        
	//*   7   12:iload_1         
	//*   8   13:aload_2         
	//*   9   14:invokevirtual   #99  <Method int JSONArray.length()>
	//*  10   17:icmpge          36
			deleteFilesForImage(jsonarray.getString(i));
	//   11   20:aload_0         
	//   12   21:aload_2         
	//   13   22:iload_1         
	//   14   23:invokevirtual   #103 <Method String JSONArray.getString(int)>
	//   15   26:invokespecial   #115 <Method void deleteFilesForImage(String)>

	//   16   29:iload_1         
	//   17   30:iconst_1        
	//   18   31:iadd            
	//   19   32:istore_1        
	//*  20   33:goto            12
	//   21   36:return          
	}

	private void deleteFileIfExists(String s)
	{
		(new File(s)).delete();
	//    0    0:new             #120 <Class File>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #122 <Method void File(String)>
	//    4    8:invokevirtual   #124 <Method boolean File.delete()>
	//    5   11:pop             
	//    6   12:return          
	}

	private void deleteFilesForImage(String s)
	{
		if(useCtfFiles.booleanValue())
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Boolean useCtfFiles>
	//*   2    4:invokevirtual   #107 <Method boolean Boolean.booleanValue()>
	//*   3    7:ifeq            39
		{
			String s1 = getCtfFileName();
	//    4   10:aload_0         
	//    5   11:invokespecial   #128 <Method String getCtfFileName()>
	//    6   14:astore_2        
			deleteFileIfExists(String.format("%s/%s", new Object[] {
				collectionPath, s1
			}));
	//    7   15:aload_0         
	//    8   16:ldc1            #130 <String "%s/%s">
	//    9   18:iconst_2        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:aload_0         
	//   14   25:getfield        #132 <Field String collectionPath>
	//   15   28:aastore         
	//   16   29:dup             
	//   17   30:iconst_1        
	//   18   31:aload_2         
	//   19   32:aastore         
	//   20   33:invokestatic    #136 <Method String String.format(String, Object[])>
	//   21   36:invokespecial   #138 <Method void deleteFileIfExists(String)>
		}
		if(useIndexFiles.booleanValue())
	//*  22   39:aload_0         
	//*  23   40:getfield        #38  <Field Boolean useIndexFiles>
	//*  24   43:invokevirtual   #107 <Method boolean Boolean.booleanValue()>
	//*  25   46:ifeq            79
		{
			s = getIndexFileName(s);
	//   26   49:aload_0         
	//   27   50:aload_1         
	//   28   51:invokespecial   #142 <Method String getIndexFileName(String)>
	//   29   54:astore_1        
			deleteFileIfExists(String.format("%s/%s", new Object[] {
				collectionPath, s
			}));
	//   30   55:aload_0         
	//   31   56:ldc1            #130 <String "%s/%s">
	//   32   58:iconst_2        
	//   33   59:anewarray       Object[]
	//   34   62:dup             
	//   35   63:iconst_0        
	//   36   64:aload_0         
	//   37   65:getfield        #132 <Field String collectionPath>
	//   38   68:aastore         
	//   39   69:dup             
	//   40   70:iconst_1        
	//   41   71:aload_1         
	//   42   72:aastore         
	//   43   73:invokestatic    #136 <Method String String.format(String, Object[])>
	//   44   76:invokespecial   #138 <Method void deleteFileIfExists(String)>
		}
	//   45   79:return          
	}

	private boolean downloadFile(String s, String s1)
	{
		int i;
		Object obj;
		String s2;
		byte abyte0[];
		try
		{
			obj = ((Object) ((new URL(s)).openConnection()));
	//    0    0:new             #150 <Class URL>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #151 <Method void URL(String)>
	//    4    8:invokevirtual   #155 <Method URLConnection URL.openConnection()>
	//    5   11:astore          4
			((URLConnection) (obj)).addRequestProperty("Accept-encoding", "gzip");
	//    6   13:aload           4
	//    7   15:ldc1            #157 <String "Accept-encoding">
	//    8   17:ldc1            #159 <String "gzip">
	//    9   19:invokevirtual   #165 <Method void URLConnection.addRequestProperty(String, String)>
			s2 = ((URLConnection) (obj)).getHeaderField("Content-Type");
	//   10   22:aload           4
	//   11   24:ldc1            #167 <String "Content-Type">
	//   12   26:invokevirtual   #170 <Method String URLConnection.getHeaderField(String)>
	//   13   29:astore          5
		}
	//*  14   31:aload           5
	//*  15   33:ifnull          63
	//*  16   36:aload           5
	//*  17   38:ldc1            #172 <String "application/zip">
	//*  18   40:invokevirtual   #175 <Method boolean String.matches(String)>
	//*  19   43:ifeq            63
	//*  20   46:new             #177 <Class ZipInputStream>
	//*  21   49:dup             
	//*  22   50:aload           4
	//*  23   52:invokevirtual   #181 <Method InputStream URLConnection.getInputStream()>
	//*  24   55:invokespecial   #184 <Method void ZipInputStream(InputStream)>
	//*  25   58:astore          4
	//*  26   60:goto            147
	//*  27   63:aload           5
	//*  28   65:ifnull          95
	//*  29   68:aload           5
	//*  30   70:ldc1            #186 <String "application/gzip">
	//*  31   72:invokevirtual   #175 <Method boolean String.matches(String)>
	//*  32   75:ifeq            95
	//*  33   78:new             #188 <Class GZIPInputStream>
	//*  34   81:dup             
	//*  35   82:aload           4
	//*  36   84:invokevirtual   #181 <Method InputStream URLConnection.getInputStream()>
	//*  37   87:invokespecial   #189 <Method void GZIPInputStream(InputStream)>
	//*  38   90:astore          4
	//*  39   92:goto            147
	//*  40   95:aload           4
	//*  41   97:invokevirtual   #192 <Method String URLConnection.getContentEncoding()>
	//*  42  100:ifnull          133
	//*  43  103:aload           4
	//*  44  105:invokevirtual   #192 <Method String URLConnection.getContentEncoding()>
	//*  45  108:ldc1            #159 <String "gzip">
	//*  46  110:invokevirtual   #175 <Method boolean String.matches(String)>
	//*  47  113:ifeq            133
	//*  48  116:new             #188 <Class GZIPInputStream>
	//*  49  119:dup             
	//*  50  120:aload           4
	//*  51  122:invokevirtual   #181 <Method InputStream URLConnection.getInputStream()>
	//*  52  125:invokespecial   #189 <Method void GZIPInputStream(InputStream)>
	//*  53  128:astore          4
	//*  54  130:goto            147
	//*  55  133:new             #194 <Class BufferedInputStream>
	//*  56  136:dup             
	//*  57  137:aload           4
	//*  58  139:invokevirtual   #181 <Method InputStream URLConnection.getInputStream()>
	//*  59  142:invokespecial   #195 <Method void BufferedInputStream(InputStream)>
	//*  60  145:astore          4
	//*  61  147:sipush          1024
	//*  62  150:newarray        byte[]
	//*  63  152:astore          5
	//*  64  154:new             #197 <Class BufferedOutputStream>
	//*  65  157:dup             
	//*  66  158:new             #199 <Class FileOutputStream>
	//*  67  161:dup             
	//*  68  162:aload_2         
	//*  69  163:invokespecial   #200 <Method void FileOutputStream(String)>
	//*  70  166:invokespecial   #203 <Method void BufferedOutputStream(java.io.OutputStream)>
	//*  71  169:astore_2        
	//*  72  170:aload           4
	//*  73  172:aload           5
	//*  74  174:iconst_0        
	//*  75  175:sipush          1024
	//*  76  178:invokevirtual   #209 <Method int InputStream.read(byte[], int, int)>
	//*  77  181:istore_3        
	//*  78  182:iload_3         
	//*  79  183:iflt            197
	//*  80  186:aload_2         
	//*  81  187:aload           5
	//*  82  189:iconst_0        
	//*  83  190:iload_3         
	//*  84  191:invokevirtual   #213 <Method void BufferedOutputStream.write(byte[], int, int)>
	//*  85  194:goto            170
	//*  86  197:aload_2         
	//*  87  198:invokevirtual   #216 <Method void BufferedOutputStream.close()>
	//*  88  201:aload           4
	//*  89  203:invokevirtual   #217 <Method void InputStream.close()>
	//*  90  206:iconst_1        
	//*  91  207:ireturn         
	//*  92  208:astore_2        
	//*  93  209:new             #219 <Class StringBuilder>
	//*  94  212:dup             
	//*  95  213:invokespecial   #220 <Method void StringBuilder()>
	//*  96  216:astore          4
	//*  97  218:aload           4
	//*  98  220:ldc1            #222 <String "Could not download file from: ">
	//*  99  222:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 100  225:pop             
	//* 101  226:aload           4
	//* 102  228:aload_1         
	//* 103  229:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 104  232:pop             
	//* 105  233:aload           4
	//* 106  235:ldc1            #228 <String " Error: ">
	//* 107  237:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 108  240:pop             
	//* 109  241:aload           4
	//* 110  243:aload_2         
	//* 111  244:invokevirtual   #231 <Method String Exception.getLocalizedMessage()>
	//* 112  247:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 113  250:pop             
	//* 114  251:aload           4
	//* 115  253:invokevirtual   #234 <Method String StringBuilder.toString()>
	//* 116  256:invokestatic    #239 <Method void CLog.e(String)>
	//* 117  259:aload_2         
	//* 118  260:invokevirtual   #242 <Method void Exception.printStackTrace()>
	//* 119  263:iconst_0        
	//* 120  264:ireturn         
	//* 121  265:astore_2        
	//* 122  266:new             #219 <Class StringBuilder>
	//* 123  269:dup             
	//* 124  270:invokespecial   #220 <Method void StringBuilder()>
	//* 125  273:astore          4
	//* 126  275:aload           4
	//* 127  277:ldc1            #222 <String "Could not download file from: ">
	//* 128  279:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 129  282:pop             
	//* 130  283:aload           4
	//* 131  285:aload_1         
	//* 132  286:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 133  289:pop             
	//* 134  290:aload           4
	//* 135  292:ldc1            #228 <String " Error: ">
	//* 136  294:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 137  297:pop             
	//* 138  298:aload           4
	//* 139  300:aload_2         
	//* 140  301:invokevirtual   #243 <Method String MalformedURLException.getLocalizedMessage()>
	//* 141  304:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//* 142  307:pop             
	//* 143  308:aload           4
	//* 144  310:invokevirtual   #234 <Method String StringBuilder.toString()>
	//* 145  313:invokestatic    #239 <Method void CLog.e(String)>
	//* 146  316:aload_2         
	//* 147  317:invokevirtual   #244 <Method void MalformedURLException.printStackTrace()>
	//* 148  320:iconst_0        
	//* 149  321:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s1)
	//* 150  322:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  151  323:new             #219 <Class StringBuilder>
	//  152  326:dup             
	//  153  327:invokespecial   #220 <Method void StringBuilder()>
	//  154  330:astore          4
			stringbuilder.append("Could not download file from: ");
	//  155  332:aload           4
	//  156  334:ldc1            #222 <String "Could not download file from: ">
	//  157  336:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  158  339:pop             
			stringbuilder.append(s);
	//  159  340:aload           4
	//  160  342:aload_1         
	//  161  343:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  162  346:pop             
			stringbuilder.append(" Error: ");
	//  163  347:aload           4
	//  164  349:ldc1            #228 <String " Error: ">
	//  165  351:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  166  354:pop             
			stringbuilder.append(((Exception) (s1)).getLocalizedMessage());
	//  167  355:aload           4
	//  168  357:aload_2         
	//  169  358:invokevirtual   #231 <Method String Exception.getLocalizedMessage()>
	//  170  361:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//  171  364:pop             
			CLog.e(stringbuilder.toString());
	//  172  365:aload           4
	//  173  367:invokevirtual   #234 <Method String StringBuilder.toString()>
	//  174  370:invokestatic    #239 <Method void CLog.e(String)>
			((Exception) (s1)).printStackTrace();
	//  175  373:aload_2         
	//  176  374:invokevirtual   #242 <Method void Exception.printStackTrace()>
			return false;
	//  177  377:iconst_0        
	//  178  378:ireturn         
		}
		if(s2 == null)
			break MISSING_BLOCK_LABEL_63;
		if(s2.matches("application/zip"))
		{
			obj = ((Object) (new ZipInputStream(((URLConnection) (obj)).getInputStream())));
			break MISSING_BLOCK_LABEL_147;
		}
		if(s2 == null)
			break MISSING_BLOCK_LABEL_95;
		if(s2.matches("application/gzip"))
		{
			obj = ((Object) (new GZIPInputStream(((URLConnection) (obj)).getInputStream())));
			break MISSING_BLOCK_LABEL_147;
		}
		if(((URLConnection) (obj)).getContentEncoding() != null && ((URLConnection) (obj)).getContentEncoding().matches("gzip"))
		{
			obj = ((Object) (new GZIPInputStream(((URLConnection) (obj)).getInputStream())));
			break MISSING_BLOCK_LABEL_147;
		}
		obj = ((Object) (new BufferedInputStream(((URLConnection) (obj)).getInputStream())));
		abyte0 = new byte[1024];
		s1 = ((String) (new BufferedOutputStream(((java.io.OutputStream) (new FileOutputStream(s1))))));
_L1:
		i = ((InputStream) (obj)).read(abyte0, 0, 1024);
		if(i < 0)
			break MISSING_BLOCK_LABEL_197;
		((BufferedOutputStream) (s1)).write(abyte0, 0, i);
		  goto _L1
		((BufferedOutputStream) (s1)).close();
		((InputStream) (obj)).close();
		return true;
		s1;
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Could not download file from: ");
		((StringBuilder) (obj)).append(s);
		((StringBuilder) (obj)).append(" Error: ");
		((StringBuilder) (obj)).append(((Exception) (s1)).getLocalizedMessage());
		CLog.e(((StringBuilder) (obj)).toString());
		((Exception) (s1)).printStackTrace();
		return false;
		s1;
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("Could not download file from: ");
		((StringBuilder) (obj)).append(s);
		((StringBuilder) (obj)).append(" Error: ");
		((StringBuilder) (obj)).append(((MalformedURLException) (s1)).getLocalizedMessage());
		CLog.e(((StringBuilder) (obj)).toString());
		((MalformedURLException) (s1)).printStackTrace();
		return false;
	}

	private boolean downloadFilesForImage(String s, boolean flag)
	{
		if(flag && useCtfFiles.booleanValue())
	//*   0    0:iload_2         
	//*   1    1:ifeq            62
	//*   2    4:aload_0         
	//*   3    5:getfield        #40  <Field Boolean useCtfFiles>
	//*   4    8:invokevirtual   #107 <Method boolean Boolean.booleanValue()>
	//*   5   11:ifeq            62
		{
			String s1 = getCtfFileName();
	//    6   14:aload_0         
	//    7   15:invokespecial   #128 <Method String getCtfFileName()>
	//    8   18:astore          4
			if(downloadFile(getCtfUrl(), String.format("%s/%s", new Object[] {
	collectionPath, s1
})))
	//*   9   20:aload_0         
	//*  10   21:aload_0         
	//*  11   22:invokespecial   #247 <Method String getCtfUrl()>
	//*  12   25:ldc1            #130 <String "%s/%s">
	//*  13   27:iconst_2        
	//*  14   28:anewarray       Object[]
	//*  15   31:dup             
	//*  16   32:iconst_0        
	//*  17   33:aload_0         
	//*  18   34:getfield        #132 <Field String collectionPath>
	//*  19   37:aastore         
	//*  20   38:dup             
	//*  21   39:iconst_1        
	//*  22   40:aload           4
	//*  23   42:aastore         
	//*  24   43:invokestatic    #136 <Method String String.format(String, Object[])>
	//*  25   46:invokespecial   #249 <Method boolean downloadFile(String, String)>
	//*  26   49:ifeq            57
				flag = true;
	//   27   52:iconst_1        
	//   28   53:istore_2        
			else
	//*  29   54:goto            64
				flag = false;
	//   30   57:iconst_0        
	//   31   58:istore_2        
		} else
	//*  32   59:goto            64
		{
			flag = true;
	//   33   62:iconst_1        
	//   34   63:istore_2        
		}
		boolean flag1 = flag;
	//   35   64:iload_2         
	//   36   65:istore_3        
		if(useIndexFiles.booleanValue())
	//*  37   66:aload_0         
	//*  38   67:getfield        #38  <Field Boolean useIndexFiles>
	//*  39   70:invokevirtual   #107 <Method boolean Boolean.booleanValue()>
	//*  40   73:ifeq            130
		{
			flag1 = flag;
	//   41   76:iload_2         
	//   42   77:istore_3        
			if(flag)
	//*  43   78:iload_2         
	//*  44   79:ifeq            130
			{
				String s2 = getIndexFileName(s);
	//   45   82:aload_0         
	//   46   83:aload_1         
	//   47   84:invokespecial   #142 <Method String getIndexFileName(String)>
	//   48   87:astore          4
				if(downloadFile(getIndexUrl(s), String.format("%s/%s", new Object[] {
	collectionPath, s2
})) && flag)
	//*  49   89:aload_0         
	//*  50   90:aload_0         
	//*  51   91:aload_1         
	//*  52   92:invokespecial   #252 <Method String getIndexUrl(String)>
	//*  53   95:ldc1            #130 <String "%s/%s">
	//*  54   97:iconst_2        
	//*  55   98:anewarray       Object[]
	//*  56  101:dup             
	//*  57  102:iconst_0        
	//*  58  103:aload_0         
	//*  59  104:getfield        #132 <Field String collectionPath>
	//*  60  107:aastore         
	//*  61  108:dup             
	//*  62  109:iconst_1        
	//*  63  110:aload           4
	//*  64  112:aastore         
	//*  65  113:invokestatic    #136 <Method String String.format(String, Object[])>
	//*  66  116:invokespecial   #249 <Method boolean downloadFile(String, String)>
	//*  67  119:ifeq            128
	//*  68  122:iload_2         
	//*  69  123:ifeq            128
					return true;
	//   70  126:iconst_1        
	//   71  127:ireturn         
				flag1 = false;
	//   72  128:iconst_0        
	//   73  129:istore_3        
			}
		}
		return flag1;
	//   74  130:iload_3         
	//   75  131:ireturn         
	}

	private String getCollectionPath(String s, String s1)
		throws JSONException
	{
		return String.format("%s/%s", new Object[] {
			s, s1
		});
	//    0    0:ldc1            #130 <String "%s/%s">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_1         
	//    6    9:aastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:aload_2         
	//   10   13:aastore         
	//   11   14:invokestatic    #136 <Method String String.format(String, Object[])>
	//   12   17:areturn         
	}

	private String getCtfFileName()
	{
		return String.format("%s.ctf", new Object[] {
			itemUUID
		});
	//    0    0:ldc2            #256 <String "%s.ctf">
	//    1    3:iconst_1        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field String itemUUID>
	//    7   13:aastore         
	//    8   14:invokestatic    #136 <Method String String.format(String, Object[])>
	//    9   17:areturn         
	}

	private String getCtfUrl()
	{
		return trackingTemplate.replace("{item_uuid}", ((CharSequence) (itemUUID)));
	//    0    0:aload_0         
	//    1    1:getfield        #258 <Field String trackingTemplate>
	//    2    4:ldc2            #260 <String "{item_uuid}">
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field String itemUUID>
	//    5   11:invokevirtual   #264 <Method String String.replace(CharSequence, CharSequence)>
	//    6   14:areturn         
	}

	private HashSet getImagesSetFromList(JSONArray jsonarray)
		throws JSONException
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #268 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #269 <Method void HashSet()>
	//    3    7:astore_3        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_2        
	//*   6   10:iload_2         
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #99  <Method int JSONArray.length()>
	//*   9   15:icmpge          35
			hashset.add(((Object) (jsonarray.getString(i))));
	//   10   18:aload_3         
	//   11   19:aload_1         
	//   12   20:iload_2         
	//   13   21:invokevirtual   #103 <Method String JSONArray.getString(int)>
	//   14   24:invokevirtual   #271 <Method boolean HashSet.add(Object)>
	//   15   27:pop             

	//   16   28:iload_2         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_2        
	//*  20   32:goto            10
		return hashset;
	//   21   35:aload_3         
	//   22   36:areturn         
	}

	private String getIndexFileName(String s)
	{
		return String.format("%s_%s.index_s", new Object[] {
			itemUUID, s
		});
	//    0    0:ldc2            #275 <String "%s_%s.index_s">
	//    1    3:iconst_2        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field String itemUUID>
	//    7   13:aastore         
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:aload_1         
	//   11   17:aastore         
	//   12   18:invokestatic    #136 <Method String String.format(String, Object[])>
	//   13   21:areturn         
	}

	private String getIndexUrl(String s)
	{
		return indexTemplate.replace("{item_uuid}", ((CharSequence) (itemUUID))).replace("{image_uuid}", ((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #277 <Field String indexTemplate>
	//    2    4:ldc2            #260 <String "{item_uuid}">
	//    3    7:aload_0         
	//    4    8:getfield        #44  <Field String itemUUID>
	//    5   11:invokevirtual   #264 <Method String String.replace(CharSequence, CharSequence)>
	//    6   14:ldc2            #279 <String "{image_uuid}">
	//    7   17:aload_1         
	//    8   18:invokevirtual   #264 <Method String String.replace(CharSequence, CharSequence)>
	//    9   21:areturn         
	}

	private void update()
		throws JSONException
	{
		boolean flag = newItemObject.getBoolean("trackable");
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JSONObject newItemObject>
	//    2    4:ldc1            #82  <String "trackable">
	//    3    6:invokevirtual   #88  <Method boolean JSONObject.getBoolean(String)>
	//    4    9:istore_1        
		Object obj = ((Object) (newItemObject.getJSONArray("images")));
	//    5   10:aload_0         
	//    6   11:getfield        #64  <Field JSONObject newItemObject>
	//    7   14:ldc1            #90  <String "images">
	//    8   16:invokevirtual   #94  <Method JSONArray JSONObject.getJSONArray(String)>
	//    9   19:astore_2        
		Object obj1 = ((Object) (oldItemObject.getJSONArray("images")));
	//   10   20:aload_0         
	//   11   21:getfield        #58  <Field JSONObject oldItemObject>
	//   12   24:ldc1            #90  <String "images">
	//   13   26:invokevirtual   #94  <Method JSONArray JSONObject.getJSONArray(String)>
	//   14   29:astore_3        
		obj = ((Object) (getImagesSetFromList(((JSONArray) (obj)))));
	//   15   30:aload_0         
	//   16   31:aload_2         
	//   17   32:invokespecial   #282 <Method HashSet getImagesSetFromList(JSONArray)>
	//   18   35:astore_2        
		HashSet hashset = getImagesSetFromList(((JSONArray) (obj1)));
	//   19   36:aload_0         
	//   20   37:aload_3         
	//   21   38:invokespecial   #282 <Method HashSet getImagesSetFromList(JSONArray)>
	//   22   41:astore          4
		obj1 = ((Object) ((HashSet)((HashSet) (obj)).clone()));
	//   23   43:aload_2         
	//   24   44:invokevirtual   #286 <Method Object HashSet.clone()>
	//   25   47:checkcast       #268 <Class HashSet>
	//   26   50:astore_3        
		((HashSet) (obj1)).removeAll(((java.util.Collection) (hashset)));
	//   27   51:aload_3         
	//   28   52:aload           4
	//   29   54:invokevirtual   #290 <Method boolean HashSet.removeAll(java.util.Collection)>
	//   30   57:pop             
		hashset = (HashSet)hashset.clone();
	//   31   58:aload           4
	//   32   60:invokevirtual   #286 <Method Object HashSet.clone()>
	//   33   63:checkcast       #268 <Class HashSet>
	//   34   66:astore          4
		hashset.removeAll(((java.util.Collection) (obj)));
	//   35   68:aload           4
	//   36   70:aload_2         
	//   37   71:invokevirtual   #290 <Method boolean HashSet.removeAll(java.util.Collection)>
	//   38   74:pop             
		obj = ((Object) (((HashSet) (obj1)).iterator()));
	//   39   75:aload_3         
	//   40   76:invokevirtual   #294 <Method Iterator HashSet.iterator()>
	//   41   79:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   42   80:aload_2         
	//   43   81:invokeinterface #299 <Method boolean Iterator.hasNext()>
	//   44   86:ifeq            117
			if(downloadFilesForImage((String)((Iterator) (obj)).next(), Boolean.valueOf(flag).booleanValue()))
				continue;
	//   45   89:aload_0         
	//   46   90:aload_2         
	//   47   91:invokeinterface #302 <Method Object Iterator.next()>
	//   48   96:checkcast       #46  <Class String>
	//   49   99:iload_1         
	//   50  100:invokestatic    #36  <Method Boolean Boolean.valueOf(boolean)>
	//   51  103:invokevirtual   #107 <Method boolean Boolean.booleanValue()>
	//   52  106:invokespecial   #111 <Method boolean downloadFilesForImage(String, boolean)>
	//   53  109:ifne            80
			syncFailed = true;
	//   54  112:aload_0         
	//   55  113:iconst_1        
	//   56  114:putfield        #62  <Field boolean syncFailed>
			break;
		} while(true);
		if(syncFailed)
	//*  57  117:aload_0         
	//*  58  118:getfield        #62  <Field boolean syncFailed>
	//*  59  121:ifeq            155
		{
			for(Iterator iterator = ((HashSet) (obj1)).iterator(); iterator.hasNext(); deleteFilesForImage((String)iterator.next()));
	//   60  124:aload_3         
	//   61  125:invokevirtual   #294 <Method Iterator HashSet.iterator()>
	//   62  128:astore_2        
	//   63  129:aload_2         
	//   64  130:invokeinterface #299 <Method boolean Iterator.hasNext()>
	//   65  135:ifeq            154
	//   66  138:aload_0         
	//   67  139:aload_2         
	//   68  140:invokeinterface #302 <Method Object Iterator.next()>
	//   69  145:checkcast       #46  <Class String>
	//   70  148:invokespecial   #115 <Method void deleteFilesForImage(String)>
	//*  71  151:goto            129
			return;
	//   72  154:return          
		}
		for(Iterator iterator1 = hashset.iterator(); iterator1.hasNext(); deleteFilesForImage((String)iterator1.next()));
	//   73  155:aload           4
	//   74  157:invokevirtual   #294 <Method Iterator HashSet.iterator()>
	//   75  160:astore_2        
	//   76  161:aload_2         
	//   77  162:invokeinterface #299 <Method boolean Iterator.hasNext()>
	//   78  167:ifeq            186
	//   79  170:aload_0         
	//   80  171:aload_2         
	//   81  172:invokeinterface #302 <Method Object Iterator.next()>
	//   82  177:checkcast       #46  <Class String>
	//   83  180:invokespecial   #115 <Method void deleteFilesForImage(String)>
	//*  84  183:goto            161
	//   85  186:return          
	}

	public void execute(String s, String s1, String s2, String s3)
	{
		collectionPath = getCollectionPath(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #306 <Method String getCollectionPath(String, String)>
	//    5    7:putfield        #132 <Field String collectionPath>
		trackingTemplate = s2;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #258 <Field String trackingTemplate>
		indexTemplate = s3;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #277 <Field String indexTemplate>
		s = type;
	//   12   21:aload_0         
	//   13   22:getfield        #42  <Field String type>
	//   14   25:astore_1        
		byte byte0 = -1;
	//   15   26:iconst_m1       
	//   16   27:istore          5
		int i = s.hashCode();
	//   17   29:aload_1         
	//   18   30:invokevirtual   #50  <Method int String.hashCode()>
	//   19   33:istore          6
		if(i == 0x95932cc9) goto _L2; else goto _L1
	//   20   35:iload           6
	//   21   37:ldc2            #307 <Int 0x95932cc9>
	//   22   40:icmpeq          90
_L1:
		if(i == 64641) goto _L4; else goto _L3
	//   23   43:iload           6
	//   24   45:ldc1            #51  <Int 64641>
	//   25   47:icmpeq          75
_L3:
		if(i == 0x77f979ab) goto _L6; else goto _L5
	//   26   50:iload           6
	//   27   52:ldc1            #52  <Int 0x77f979ab>
	//   28   54:icmpeq          60
	//*  29   57:goto            175
_L6:
		if(s.equals("DELETE"))
	//*  30   60:aload_1         
	//*  31   61:ldc1            #9   <String "DELETE">
	//*  32   63:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  33   66:ifeq            175
			byte0 = 2;
	//   34   69:iconst_2        
	//   35   70:istore          5
		  goto _L5
	//*  36   72:goto            175
_L4:
		if(s.equals("ADD"))
	//*  37   75:aload_1         
	//*  38   76:ldc1            #7   <String "ADD">
	//*  39   78:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  40   81:ifeq            175
			byte0 = 0;
	//   41   84:iconst_0        
	//   42   85:istore          5
		  goto _L5
	//*  43   87:goto            175
_L2:
		if(s.equals("UPDATE"))
	//*  44   90:aload_1         
	//*  45   91:ldc1            #11  <String "UPDATE">
	//*  46   93:invokevirtual   #56  <Method boolean String.equals(Object)>
	//*  47   96:ifeq            175
			byte0 = 1;
	//   48   99:iconst_1        
	//   49  100:istore          5
		  goto _L5
	//*  50  102:goto            175
	//*  51  105:aload_0         
	//*  52  106:invokespecial   #309 <Method void delete()>
	//*  53  109:return          
_L10:
		update();
	//   54  110:aload_0         
	//   55  111:invokespecial   #311 <Method void update()>
		return;
	//   56  114:return          
_L8:
		add();
	//   57  115:aload_0         
	//   58  116:invokespecial   #313 <Method void add()>
		return;
	//   59  119:return          
_L12:
		try
		{
			delete();
			return;
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  60  120:astore_1        
		{
			s1 = ((String) (new StringBuilder()));
	//   61  121:new             #219 <Class StringBuilder>
	//   62  124:dup             
	//   63  125:invokespecial   #220 <Method void StringBuilder()>
	//   64  128:astore_2        
		}
		((StringBuilder) (s1)).append("Error executing action ");
	//   65  129:aload_2         
	//   66  130:ldc2            #315 <String "Error executing action ">
	//   67  133:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   68  136:pop             
		((StringBuilder) (s1)).append(type);
	//   69  137:aload_2         
	//   70  138:aload_0         
	//   71  139:getfield        #42  <Field String type>
	//   72  142:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   73  145:pop             
		((StringBuilder) (s1)).append(" error: ");
	//   74  146:aload_2         
	//   75  147:ldc2            #317 <String " error: ">
	//   76  150:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   77  153:pop             
		((StringBuilder) (s1)).append(((Exception) (s)).getLocalizedMessage());
	//   78  154:aload_2         
	//   79  155:aload_1         
	//   80  156:invokevirtual   #231 <Method String Exception.getLocalizedMessage()>
	//   81  159:invokevirtual   #226 <Method StringBuilder StringBuilder.append(String)>
	//   82  162:pop             
		CLog.w(((StringBuilder) (s1)).toString());
	//   83  163:aload_2         
	//   84  164:invokevirtual   #234 <Method String StringBuilder.toString()>
	//   85  167:invokestatic    #320 <Method void CLog.w(String)>
		((Exception) (s)).printStackTrace();
	//   86  170:aload_1         
	//   87  171:invokevirtual   #242 <Method void Exception.printStackTrace()>
		return;
	//   88  174:return          
_L5:
		switch(byte0)
	//*  89  175:iload           5
		{
	//*  90  177:tableswitch     0 2: default 204
	//	               0 115
	//	               1 110
	//	               2 105
		default:
			break; /* Loop/switch isn't completed */
	//   91  204:return          

		case 0: // '\0'
			continue; /* Loop/switch isn't completed */

		case 1: // '\001'
			break;

		case 2: // '\002'
			continue; /* Loop/switch isn't completed */
		}
		break; /* Loop/switch isn't completed */
		if(true) goto _L8; else goto _L7
_L7:
		if(true) goto _L10; else goto _L9
_L9:
		if(true) goto _L12; else goto _L11
_L11:
	}

	public JSONObject getRemoteItemJson()
	{
		return newItemObject;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JSONObject newItemObject>
	//    2    4:areturn         
	}

	public String getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field String type>
	//    2    4:areturn         
	}

	public String getUUID()
	{
		return itemUUID;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String itemUUID>
	//    2    4:areturn         
	}

	public JSONObject getValue()
	{
		return newItemObject;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field JSONObject newItemObject>
	//    2    4:areturn         
	}

	public boolean hasSyncFailed()
	{
		return syncFailed;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field boolean syncFailed>
	//    2    4:ireturn         
	}

	public boolean needsToDownloadFiles()
	{
		return needsToDownloadFiles;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field boolean needsToDownloadFiles>
	//    2    4:ireturn         
	}

	public static final String ADD = "ADD";
	public static final String DELETE = "DELETE";
	public static final String UPDATE = "UPDATE";
	private String collectionPath;
	private String indexTemplate;
	private String itemUUID;
	private boolean needsToDownloadFiles;
	private JSONObject newItemObject;
	private JSONObject oldItemObject;
	private boolean syncFailed;
	private String trackingTemplate;
	private String type;
	private Boolean useCtfFiles;
	private Boolean useIndexFiles;
}
