// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v13.view.inputmethod;

import android.content.ClipDescription;
import android.os.Bundle;
import android.view.inputmethod.*;

// Referenced classes of package android.support.v13.view.inputmethod:
//			InputContentInfoCompat, EditorInfoCompat

public final class InputConnectionCompat
{
	public static interface OnCommitContentListener
	{

		public abstract boolean onCommitContent(InputContentInfoCompat inputcontentinfocompat, int i, Bundle bundle);
	}


	public InputConnectionCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
	//    2    4:return          
	}

	public static boolean commitContent(InputConnection inputconnection, EditorInfo editorinfo, InputContentInfoCompat inputcontentinfocompat, int i, Bundle bundle)
	{
		int j;
label0:
		{
			ClipDescription clipdescription = inputcontentinfocompat.getDescription();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #52  <Method ClipDescription InputContentInfoCompat.getDescription()>
	//    2    4:astore          7
			editorinfo = ((EditorInfo) (EditorInfoCompat.getContentMimeTypes(editorinfo)));
	//    3    6:aload_1         
	//    4    7:invokestatic    #58  <Method String[] EditorInfoCompat.getContentMimeTypes(EditorInfo)>
	//    5   10:astore_1        
			int k = editorinfo.length;
	//    6   11:aload_1         
	//    7   12:arraylength     
	//    8   13:istore          6
			j = 0;
	//    9   15:iconst_0        
	//   10   16:istore          5
			do
			{
				if(j >= k)
					break;
	//   11   18:iload           5
	//   12   20:iload           6
	//   13   22:icmpge          52
				if(clipdescription.hasMimeType(((String) (editorinfo[j]))))
	//*  14   25:aload           7
	//*  15   27:aload_1         
	//*  16   28:iload           5
	//*  17   30:aaload          
	//*  18   31:invokevirtual   #64  <Method boolean ClipDescription.hasMimeType(String)>
	//*  19   34:ifeq            43
				{
					j = 1;
	//   20   37:iconst_1        
	//   21   38:istore          5
					break label0;
	//   22   40:goto            55
				}
				j++;
	//   23   43:iload           5
	//   24   45:iconst_1        
	//   25   46:iadd            
	//   26   47:istore          5
			} while(true);
	//   27   49:goto            18
			j = 0;
	//   28   52:iconst_0        
	//   29   53:istore          5
		}
		if(j == 0)
	//*  30   55:iload           5
	//*  31   57:ifne            62
			return false;
	//   32   60:iconst_0        
	//   33   61:ireturn         
		if(android.os.Build.VERSION.SDK_INT >= 25)
	//*  34   62:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//*  35   65:bipush          25
	//*  36   67:icmplt          87
		{
			return inputconnection.commitContent((InputContentInfo)inputcontentinfocompat.unwrap(), i, bundle);
	//   37   70:aload_0         
	//   38   71:aload_2         
	//   39   72:invokevirtual   #73  <Method Object InputContentInfoCompat.unwrap()>
	//   40   75:checkcast       #75  <Class InputContentInfo>
	//   41   78:iload_3         
	//   42   79:aload           4
	//   43   81:invokeinterface #80  <Method boolean InputConnection.commitContent(InputContentInfo, int, Bundle)>
	//   44   86:ireturn         
		} else
		{
			editorinfo = ((EditorInfo) (new Bundle()));
	//   45   87:new             #82  <Class Bundle>
	//   46   90:dup             
	//   47   91:invokespecial   #83  <Method void Bundle()>
	//   48   94:astore_1        
			((Bundle) (editorinfo)).putParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI", ((android.os.Parcelable) (inputcontentinfocompat.getContentUri())));
	//   49   95:aload_1         
	//   50   96:ldc1            #18  <String "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI">
	//   51   98:aload_2         
	//   52   99:invokevirtual   #87  <Method android.net.Uri InputContentInfoCompat.getContentUri()>
	//   53  102:invokevirtual   #91  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			((Bundle) (editorinfo)).putParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION", ((android.os.Parcelable) (inputcontentinfocompat.getDescription())));
	//   54  105:aload_1         
	//   55  106:ldc1            #21  <String "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION">
	//   56  108:aload_2         
	//   57  109:invokevirtual   #52  <Method ClipDescription InputContentInfoCompat.getDescription()>
	//   58  112:invokevirtual   #91  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			((Bundle) (editorinfo)).putParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI", ((android.os.Parcelable) (inputcontentinfocompat.getLinkUri())));
	//   59  115:aload_1         
	//   60  116:ldc1            #27  <String "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI">
	//   61  118:aload_2         
	//   62  119:invokevirtual   #94  <Method android.net.Uri InputContentInfoCompat.getLinkUri()>
	//   63  122:invokevirtual   #91  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			((Bundle) (editorinfo)).putInt("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS", i);
	//   64  125:aload_1         
	//   65  126:ldc1            #24  <String "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS">
	//   66  128:iload_3         
	//   67  129:invokevirtual   #98  <Method void Bundle.putInt(String, int)>
			((Bundle) (editorinfo)).putParcelable("android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS", ((android.os.Parcelable) (bundle)));
	//   68  132:aload_1         
	//   69  133:ldc1            #30  <String "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS">
	//   70  135:aload           4
	//   71  137:invokevirtual   #91  <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			return inputconnection.performPrivateCommand("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", ((Bundle) (editorinfo)));
	//   72  140:aload_0         
	//   73  141:ldc1            #15  <String "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT">
	//   74  143:aload_1         
	//   75  144:invokeinterface #102 <Method boolean InputConnection.performPrivateCommand(String, Bundle)>
	//   76  149:ireturn         
		}
	}

	public static InputConnection createWrapper(InputConnection inputconnection, EditorInfo editorinfo, OnCommitContentListener oncommitcontentlistener)
	{
		if(inputconnection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("inputConnection must be non-null");
	//    2    4:new             #107 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #109 <String "inputConnection must be non-null">
	//    5   10:invokespecial   #112 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		if(editorinfo == null)
	//*   7   14:aload_1         
	//*   8   15:ifnonnull       28
			throw new IllegalArgumentException("editorInfo must be non-null");
	//    9   18:new             #107 <Class IllegalArgumentException>
	//   10   21:dup             
	//   11   22:ldc1            #114 <String "editorInfo must be non-null">
	//   12   24:invokespecial   #112 <Method void IllegalArgumentException(String)>
	//   13   27:athrow          
		if(oncommitcontentlistener == null)
	//*  14   28:aload_2         
	//*  15   29:ifnonnull       42
			throw new IllegalArgumentException("onCommitContentListener must be non-null");
	//   16   32:new             #107 <Class IllegalArgumentException>
	//   17   35:dup             
	//   18   36:ldc1            #116 <String "onCommitContentListener must be non-null">
	//   19   38:invokespecial   #112 <Method void IllegalArgumentException(String)>
	//   20   41:athrow          
		if(android.os.Build.VERSION.SDK_INT >= 25)
	//*  21   42:getstatic       #69  <Field int android.os.Build$VERSION.SDK_INT>
	//*  22   45:bipush          25
	//*  23   47:icmplt          61
			return ((InputConnection) (new InputConnectionWrapper(inputconnection, false, oncommitcontentlistener) {

				public boolean commitContent(InputContentInfo inputcontentinfo, int i, Bundle bundle)
				{
					if(listener.onCommitContent(InputContentInfoCompat.wrap(((Object) (inputcontentinfo))), i, bundle))
				//*   0    0:aload_0         
				//*   1    1:getfield        #15  <Field InputConnectionCompat$OnCommitContentListener val$listener>
				//*   2    4:aload_1         
				//*   3    5:invokestatic    #27  <Method InputContentInfoCompat InputContentInfoCompat.wrap(Object)>
				//*   4    8:iload_2         
				//*   5    9:aload_3         
				//*   6   10:invokeinterface #33  <Method boolean InputConnectionCompat$OnCommitContentListener.onCommitContent(InputContentInfoCompat, int, Bundle)>
				//*   7   15:ifeq            20
						return true;
				//    8   18:iconst_1        
				//    9   19:ireturn         
					else
						return super.commitContent(inputcontentinfo, i, bundle);
				//   10   20:aload_0         
				//   11   21:aload_1         
				//   12   22:iload_2         
				//   13   23:aload_3         
				//   14   24:invokespecial   #35  <Method boolean InputConnectionWrapper.commitContent(InputContentInfo, int, Bundle)>
				//   15   27:ireturn         
				}

				final OnCommitContentListener val$listener;

			
			{
				listener = oncommitcontentlistener;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field InputConnectionCompat$OnCommitContentListener val$listener>
				super(inputconnection, flag);
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:iload_2         
			//    6    8:invokespecial   #18  <Method void InputConnectionWrapper(InputConnection, boolean)>
			//    7   11:return          
			}
			}
));
	//   24   50:new             #6   <Class InputConnectionCompat$1>
	//   25   53:dup             
	//   26   54:aload_0         
	//   27   55:iconst_0        
	//   28   56:aload_2         
	//   29   57:invokespecial   #119 <Method void InputConnectionCompat$1(InputConnection, boolean, InputConnectionCompat$OnCommitContentListener)>
	//   30   60:areturn         
		if(EditorInfoCompat.getContentMimeTypes(editorinfo).length == 0)
	//*  31   61:aload_1         
	//*  32   62:invokestatic    #58  <Method String[] EditorInfoCompat.getContentMimeTypes(EditorInfo)>
	//*  33   65:arraylength     
	//*  34   66:ifne            71
			return inputconnection;
	//   35   69:aload_0         
	//   36   70:areturn         
		else
			return ((InputConnection) (new InputConnectionWrapper(inputconnection, false, oncommitcontentlistener) {

				public boolean performPrivateCommand(String s, Bundle bundle)
				{
					if(InputConnectionCompat.handlePerformPrivateCommand(s, bundle, listener))
				//*   0    0:aload_1         
				//*   1    1:aload_2         
				//*   2    2:aload_0         
				//*   3    3:getfield        #15  <Field InputConnectionCompat$OnCommitContentListener val$listener>
				//*   4    6:invokestatic    #25  <Method boolean InputConnectionCompat.handlePerformPrivateCommand(String, Bundle, InputConnectionCompat$OnCommitContentListener)>
				//*   5    9:ifeq            14
						return true;
				//    6   12:iconst_1        
				//    7   13:ireturn         
					else
						return super.performPrivateCommand(s, bundle);
				//    8   14:aload_0         
				//    9   15:aload_1         
				//   10   16:aload_2         
				//   11   17:invokespecial   #27  <Method boolean InputConnectionWrapper.performPrivateCommand(String, Bundle)>
				//   12   20:ireturn         
				}

				final OnCommitContentListener val$listener;

			
			{
				listener = oncommitcontentlistener;
			//    0    0:aload_0         
			//    1    1:aload_3         
			//    2    2:putfield        #15  <Field InputConnectionCompat$OnCommitContentListener val$listener>
				super(inputconnection, flag);
			//    3    5:aload_0         
			//    4    6:aload_1         
			//    5    7:iload_2         
			//    6    8:invokespecial   #18  <Method void InputConnectionWrapper(InputConnection, boolean)>
			//    7   11:return          
			}
			}
));
	//   37   71:new             #8   <Class InputConnectionCompat$2>
	//   38   74:dup             
	//   39   75:aload_0         
	//   40   76:iconst_0        
	//   41   77:aload_2         
	//   42   78:invokespecial   #120 <Method void InputConnectionCompat$2(InputConnection, boolean, InputConnectionCompat$OnCommitContentListener)>
	//   43   81:areturn         
	}

	static boolean handlePerformPrivateCommand(String s, Bundle bundle, OnCommitContentListener oncommitcontentlistener)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:806)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #125 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc1            #127 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.useAs(TypeTransformer.java:868)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:806)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    6:invokespecial   #130 <Method void Runtime(String)>
	//    4    9:athrow          
	}

	private static final String COMMIT_CONTENT_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
	private static final String COMMIT_CONTENT_CONTENT_URI_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
	private static final String COMMIT_CONTENT_DESCRIPTION_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
	private static final String COMMIT_CONTENT_FLAGS_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
	private static final String COMMIT_CONTENT_LINK_URI_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
	private static final String COMMIT_CONTENT_OPTS_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
	private static final String COMMIT_CONTENT_RESULT_RECEIVER = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
	public static int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;

	static 
	{
	//    0    0:return          
	}
}
