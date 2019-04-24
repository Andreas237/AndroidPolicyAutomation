// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;


// Referenced classes of package com.facebook.stetho.inspector.network:
//			MimeMatcher

public class ResourceTypeHelper
{

	public ResourceTypeHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class MimeMatcher>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void MimeMatcher()>
	//    6   12:putfield        #16  <Field MimeMatcher mMimeMatcher>
		mMimeMatcher.addRule("text/css", ((Object) (com.facebook.stetho.inspector.protocol.module.Page.ResourceType.STYLESHEET)));
	//    7   15:aload_0         
	//    8   16:getfield        #16  <Field MimeMatcher mMimeMatcher>
	//    9   19:ldc1            #18  <String "text/css">
	//   10   21:getstatic       #24  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.STYLESHEET>
	//   11   24:invokevirtual   #28  <Method void MimeMatcher.addRule(String, Object)>
		mMimeMatcher.addRule("image/*", ((Object) (com.facebook.stetho.inspector.protocol.module.Page.ResourceType.IMAGE)));
	//   12   27:aload_0         
	//   13   28:getfield        #16  <Field MimeMatcher mMimeMatcher>
	//   14   31:ldc1            #30  <String "image/*">
	//   15   33:getstatic       #33  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.IMAGE>
	//   16   36:invokevirtual   #28  <Method void MimeMatcher.addRule(String, Object)>
		mMimeMatcher.addRule("application/x-javascript", ((Object) (com.facebook.stetho.inspector.protocol.module.Page.ResourceType.SCRIPT)));
	//   17   39:aload_0         
	//   18   40:getfield        #16  <Field MimeMatcher mMimeMatcher>
	//   19   43:ldc1            #35  <String "application/x-javascript">
	//   20   45:getstatic       #38  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.SCRIPT>
	//   21   48:invokevirtual   #28  <Method void MimeMatcher.addRule(String, Object)>
		mMimeMatcher.addRule("text/javascript", ((Object) (com.facebook.stetho.inspector.protocol.module.Page.ResourceType.XHR)));
	//   22   51:aload_0         
	//   23   52:getfield        #16  <Field MimeMatcher mMimeMatcher>
	//   24   55:ldc1            #40  <String "text/javascript">
	//   25   57:getstatic       #43  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.XHR>
	//   26   60:invokevirtual   #28  <Method void MimeMatcher.addRule(String, Object)>
		mMimeMatcher.addRule("application/json", ((Object) (com.facebook.stetho.inspector.protocol.module.Page.ResourceType.XHR)));
	//   27   63:aload_0         
	//   28   64:getfield        #16  <Field MimeMatcher mMimeMatcher>
	//   29   67:ldc1            #45  <String "application/json">
	//   30   69:getstatic       #43  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.XHR>
	//   31   72:invokevirtual   #28  <Method void MimeMatcher.addRule(String, Object)>
		mMimeMatcher.addRule("text/*", ((Object) (com.facebook.stetho.inspector.protocol.module.Page.ResourceType.DOCUMENT)));
	//   32   75:aload_0         
	//   33   76:getfield        #16  <Field MimeMatcher mMimeMatcher>
	//   34   79:ldc1            #47  <String "text/*">
	//   35   81:getstatic       #50  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.DOCUMENT>
	//   36   84:invokevirtual   #28  <Method void MimeMatcher.addRule(String, Object)>
		mMimeMatcher.addRule("*", ((Object) (com.facebook.stetho.inspector.protocol.module.Page.ResourceType.OTHER)));
	//   37   87:aload_0         
	//   38   88:getfield        #16  <Field MimeMatcher mMimeMatcher>
	//   39   91:ldc1            #52  <String "*">
	//   40   93:getstatic       #55  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.OTHER>
	//   41   96:invokevirtual   #28  <Method void MimeMatcher.addRule(String, Object)>
	//   42   99:return          
	}

	public com.facebook.stetho.inspector.protocol.module.Page.ResourceType determineResourceType(String s)
	{
		s = stripContentExtras(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method String stripContentExtras(String)>
	//    3    5:astore_1        
		return (com.facebook.stetho.inspector.protocol.module.Page.ResourceType)mMimeMatcher.match(s);
	//    4    6:aload_0         
	//    5    7:getfield        #16  <Field MimeMatcher mMimeMatcher>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #66  <Method Object MimeMatcher.match(String)>
	//    8   14:checkcast       #20  <Class com.facebook.stetho.inspector.protocol.module.Page$ResourceType>
	//    9   17:areturn         
	}

	public String stripContentExtras(String s)
	{
		int i = s.indexOf(';');
	//    0    0:aload_1         
	//    1    1:bipush          59
	//    2    3:invokevirtual   #72  <Method int String.indexOf(int)>
	//    3    6:istore_2        
		String s1 = s;
	//    4    7:aload_1         
	//    5    8:astore_3        
		if(i >= 0)
	//*   6    9:iload_2         
	//*   7   10:iflt            20
			s1 = s.substring(0, i);
	//    8   13:aload_1         
	//    9   14:iconst_0        
	//   10   15:iload_2         
	//   11   16:invokevirtual   #76  <Method String String.substring(int, int)>
	//   12   19:astore_3        
		return s1;
	//   13   20:aload_3         
	//   14   21:areturn         
	}

	private final MimeMatcher mMimeMatcher = new MimeMatcher();
}
