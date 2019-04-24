// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.rolling;

import ch.qos.logback.core.FileAppender;
import ch.qos.logback.core.rolling.helper.CompressionMode;
import ch.qos.logback.core.rolling.helper.FileNamePattern;
import ch.qos.logback.core.spi.ContextAwareBase;

// Referenced classes of package ch.qos.logback.core.rolling:
//			RollingPolicy

public abstract class RollingPolicyBase extends ContextAwareBase
	implements RollingPolicy
{

	public RollingPolicyBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void ContextAwareBase()>
		compressionMode = CompressionMode.NONE;
	//    2    4:aload_0         
	//    3    5:getstatic       #26  <Field CompressionMode CompressionMode.NONE>
	//    4    8:putfield        #28  <Field CompressionMode compressionMode>
	//    5   11:return          
	}

	protected void determineCompressionMode()
	{
		CompressionMode compressionmode;
		if(fileNamePatternStr.endsWith(".gz"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field String fileNamePatternStr>
	//*   2    4:ldc1            #34  <String ".gz">
	//*   3    6:invokevirtual   #40  <Method boolean String.endsWith(String)>
	//*   4    9:ifeq            28
		{
			addInfo("Will use gz compression");
	//    5   12:aload_0         
	//    6   13:ldc1            #42  <String "Will use gz compression">
	//    7   15:invokevirtual   #46  <Method void addInfo(String)>
			compressionmode = CompressionMode.GZ;
	//    8   18:getstatic       #49  <Field CompressionMode CompressionMode.GZ>
	//    9   21:astore_1        
		} else
	//*  10   22:aload_0         
	//*  11   23:aload_1         
	//*  12   24:putfield        #28  <Field CompressionMode compressionMode>
	//*  13   27:return          
		if(fileNamePatternStr.endsWith(".zip"))
	//*  14   28:aload_0         
	//*  15   29:getfield        #32  <Field String fileNamePatternStr>
	//*  16   32:ldc1            #51  <String ".zip">
	//*  17   34:invokevirtual   #40  <Method boolean String.endsWith(String)>
	//*  18   37:ifeq            53
		{
			addInfo("Will use zip compression");
	//   19   40:aload_0         
	//   20   41:ldc1            #53  <String "Will use zip compression">
	//   21   43:invokevirtual   #46  <Method void addInfo(String)>
			compressionmode = CompressionMode.ZIP;
	//   22   46:getstatic       #56  <Field CompressionMode CompressionMode.ZIP>
	//   23   49:astore_1        
		} else
	//*  24   50:goto            22
		{
			addInfo("No compression will be used");
	//   25   53:aload_0         
	//   26   54:ldc1            #58  <String "No compression will be used">
	//   27   56:invokevirtual   #46  <Method void addInfo(String)>
			compressionmode = CompressionMode.NONE;
	//   28   59:getstatic       #26  <Field CompressionMode CompressionMode.NONE>
	//   29   62:astore_1        
		}
		compressionMode = compressionmode;
	//*  30   63:goto            22
	}

	public CompressionMode getCompressionMode()
	{
		return compressionMode;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field CompressionMode compressionMode>
	//    2    4:areturn         
	}

	public String getFileNamePattern()
	{
		return fileNamePatternStr;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String fileNamePatternStr>
	//    2    4:areturn         
	}

	public String getParentsRawFileProperty()
	{
		return parent.rawFileProperty();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field FileAppender parent>
	//    2    4:invokevirtual   #70  <Method String FileAppender.rawFileProperty()>
	//    3    7:areturn         
	}

	public boolean isParentPrudent()
	{
		return parent.isPrudent();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field FileAppender parent>
	//    2    4:invokevirtual   #75  <Method boolean FileAppender.isPrudent()>
	//    3    7:ireturn         
	}

	public boolean isStarted()
	{
		return started;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean started>
	//    2    4:ireturn         
	}

	public void setFileNamePattern(String s)
	{
		fileNamePatternStr = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #32  <Field String fileNamePatternStr>
	//    3    5:return          
	}

	public void setParent(FileAppender fileappender)
	{
		parent = fileappender;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #65  <Field FileAppender parent>
	//    3    5:return          
	}

	public void start()
	{
		started = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #78  <Field boolean started>
	//    3    5:return          
	}

	public void stop()
	{
		started = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #78  <Field boolean started>
	//    3    5:return          
	}

	protected CompressionMode compressionMode;
	FileNamePattern fileNamePattern;
	protected String fileNamePatternStr;
	private FileAppender parent;
	private boolean started;
	FileNamePattern zipEntryFileNamePattern;
}
