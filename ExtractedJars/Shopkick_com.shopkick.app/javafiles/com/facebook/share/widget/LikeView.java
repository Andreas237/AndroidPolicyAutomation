// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.app.Activity;
import android.app.Fragment;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.FacebookException;
import com.facebook.internal.FragmentWrapper;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.share.internal.LikeActionController;
import com.facebook.share.internal.LikeBoxCountView;
import com.facebook.share.internal.LikeButton;

public class LikeView extends FrameLayout
{
	public static final class AuxiliaryViewPosition extends Enum
	{

		static AuxiliaryViewPosition fromInt(int i)
		{
			AuxiliaryViewPosition aauxiliaryviewposition[] = values();
		//    0    0:invokestatic    #66  <Method LikeView$AuxiliaryViewPosition[] values()>
		//    1    3:astore_3        
			int k = aauxiliaryviewposition.length;
		//    2    4:aload_3         
		//    3    5:arraylength     
		//    4    6:istore_2        
			for(int j = 0; j < k; j++)
		//*   5    7:iconst_0        
		//*   6    8:istore_1        
		//*   7    9:iload_1         
		//*   8   10:iload_2         
		//*   9   11:icmpge          38
			{
				AuxiliaryViewPosition auxiliaryviewposition = aauxiliaryviewposition[j];
		//   10   14:aload_3         
		//   11   15:iload_1         
		//   12   16:aaload          
		//   13   17:astore          4
				if(auxiliaryviewposition.getValue() == i)
		//*  14   19:aload           4
		//*  15   21:invokespecial   #60  <Method int getValue()>
		//*  16   24:iload_0         
		//*  17   25:icmpne          31
					return auxiliaryviewposition;
		//   18   28:aload           4
		//   19   30:areturn         
			}

		//   20   31:iload_1         
		//   21   32:iconst_1        
		//   22   33:iadd            
		//   23   34:istore_1        
		//*  24   35:goto            9
			return null;
		//   25   38:aconst_null     
		//   26   39:areturn         
		}

		private int getValue()
		{
			return intValue;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field int intValue>
		//    2    4:ireturn         
		}

		public static AuxiliaryViewPosition valueOf(String s)
		{
			return (AuxiliaryViewPosition)Enum.valueOf(com/facebook/share/widget/LikeView$AuxiliaryViewPosition, s);
		//    0    0:ldc1            #2   <Class LikeView$AuxiliaryViewPosition>
		//    1    2:aload_0         
		//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LikeView$AuxiliaryViewPosition>
		//    4    9:areturn         
		}

		public static AuxiliaryViewPosition[] values()
		{
			return (AuxiliaryViewPosition[])((AuxiliaryViewPosition []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field LikeView$AuxiliaryViewPosition[] $VALUES>
		//    1    3:invokevirtual   #76  <Method Object _5B_Lcom.facebook.share.widget.LikeView$AuxiliaryViewPosition_3B_.clone()>
		//    2    6:checkcast       #72  <Class LikeView$AuxiliaryViewPosition[]>
		//    3    9:areturn         
		}

		public String toString()
		{
			return stringValue;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field String stringValue>
		//    2    4:areturn         
		}

		private static final AuxiliaryViewPosition $VALUES[];
		public static final AuxiliaryViewPosition BOTTOM;
		static AuxiliaryViewPosition DEFAULT;
		public static final AuxiliaryViewPosition INLINE;
		public static final AuxiliaryViewPosition TOP;
		private int intValue;
		private String stringValue;

		static 
		{
			BOTTOM = new AuxiliaryViewPosition("BOTTOM", 0, "bottom", 0);
		//    0    0:new             #2   <Class LikeView$AuxiliaryViewPosition>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "BOTTOM">
		//    3    6:iconst_0        
		//    4    7:ldc1            #25  <String "bottom">
		//    5    9:iconst_0        
		//    6   10:invokespecial   #29  <Method void LikeView$AuxiliaryViewPosition(String, int, String, int)>
		//    7   13:putstatic       #31  <Field LikeView$AuxiliaryViewPosition BOTTOM>
			INLINE = new AuxiliaryViewPosition("INLINE", 1, "inline", 1);
		//    8   16:new             #2   <Class LikeView$AuxiliaryViewPosition>
		//    9   19:dup             
		//   10   20:ldc1            #32  <String "INLINE">
		//   11   22:iconst_1        
		//   12   23:ldc1            #34  <String "inline">
		//   13   25:iconst_1        
		//   14   26:invokespecial   #29  <Method void LikeView$AuxiliaryViewPosition(String, int, String, int)>
		//   15   29:putstatic       #36  <Field LikeView$AuxiliaryViewPosition INLINE>
			TOP = new AuxiliaryViewPosition("TOP", 2, "top", 2);
		//   16   32:new             #2   <Class LikeView$AuxiliaryViewPosition>
		//   17   35:dup             
		//   18   36:ldc1            #37  <String "TOP">
		//   19   38:iconst_2        
		//   20   39:ldc1            #39  <String "top">
		//   21   41:iconst_2        
		//   22   42:invokespecial   #29  <Method void LikeView$AuxiliaryViewPosition(String, int, String, int)>
		//   23   45:putstatic       #41  <Field LikeView$AuxiliaryViewPosition TOP>
			AuxiliaryViewPosition auxiliaryviewposition = BOTTOM;
		//   24   48:getstatic       #31  <Field LikeView$AuxiliaryViewPosition BOTTOM>
		//   25   51:astore_0        
			$VALUES = (new AuxiliaryViewPosition[] {
				auxiliaryviewposition, INLINE, TOP
			});
		//   26   52:iconst_3        
		//   27   53:anewarray       AuxiliaryViewPosition[]
		//   28   56:dup             
		//   29   57:iconst_0        
		//   30   58:aload_0         
		//   31   59:aastore         
		//   32   60:dup             
		//   33   61:iconst_1        
		//   34   62:getstatic       #36  <Field LikeView$AuxiliaryViewPosition INLINE>
		//   35   65:aastore         
		//   36   66:dup             
		//   37   67:iconst_2        
		//   38   68:getstatic       #41  <Field LikeView$AuxiliaryViewPosition TOP>
		//   39   71:aastore         
		//   40   72:putstatic       #43  <Field LikeView$AuxiliaryViewPosition[] $VALUES>
			DEFAULT = auxiliaryviewposition;
		//   41   75:aload_0         
		//   42   76:putstatic       #45  <Field LikeView$AuxiliaryViewPosition DEFAULT>
		//*  43   79:return          
		}


/*
		static int access$100(AuxiliaryViewPosition auxiliaryviewposition)
		{
			return auxiliaryviewposition.getValue();
		//    0    0:aload_0         
		//    1    1:invokespecial   #60  <Method int getValue()>
		//    2    4:ireturn         
		}

*/

		private AuxiliaryViewPosition(String s, int i, String s1, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
			stringValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #51  <Field String stringValue>
			intValue = j;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #53  <Field int intValue>
		//   10   17:return          
		}
	}

	public static final class HorizontalAlignment extends Enum
	{

		static HorizontalAlignment fromInt(int i)
		{
			HorizontalAlignment ahorizontalalignment[] = values();
		//    0    0:invokestatic    #66  <Method LikeView$HorizontalAlignment[] values()>
		//    1    3:astore_3        
			int k = ahorizontalalignment.length;
		//    2    4:aload_3         
		//    3    5:arraylength     
		//    4    6:istore_2        
			for(int j = 0; j < k; j++)
		//*   5    7:iconst_0        
		//*   6    8:istore_1        
		//*   7    9:iload_1         
		//*   8   10:iload_2         
		//*   9   11:icmpge          38
			{
				HorizontalAlignment horizontalalignment = ahorizontalalignment[j];
		//   10   14:aload_3         
		//   11   15:iload_1         
		//   12   16:aaload          
		//   13   17:astore          4
				if(horizontalalignment.getValue() == i)
		//*  14   19:aload           4
		//*  15   21:invokespecial   #60  <Method int getValue()>
		//*  16   24:iload_0         
		//*  17   25:icmpne          31
					return horizontalalignment;
		//   18   28:aload           4
		//   19   30:areturn         
			}

		//   20   31:iload_1         
		//   21   32:iconst_1        
		//   22   33:iadd            
		//   23   34:istore_1        
		//*  24   35:goto            9
			return null;
		//   25   38:aconst_null     
		//   26   39:areturn         
		}

		private int getValue()
		{
			return intValue;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field int intValue>
		//    2    4:ireturn         
		}

		public static HorizontalAlignment valueOf(String s)
		{
			return (HorizontalAlignment)Enum.valueOf(com/facebook/share/widget/LikeView$HorizontalAlignment, s);
		//    0    0:ldc1            #2   <Class LikeView$HorizontalAlignment>
		//    1    2:aload_0         
		//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LikeView$HorizontalAlignment>
		//    4    9:areturn         
		}

		public static HorizontalAlignment[] values()
		{
			return (HorizontalAlignment[])((HorizontalAlignment []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field LikeView$HorizontalAlignment[] $VALUES>
		//    1    3:invokevirtual   #76  <Method Object _5B_Lcom.facebook.share.widget.LikeView$HorizontalAlignment_3B_.clone()>
		//    2    6:checkcast       #72  <Class LikeView$HorizontalAlignment[]>
		//    3    9:areturn         
		}

		public String toString()
		{
			return stringValue;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field String stringValue>
		//    2    4:areturn         
		}

		private static final HorizontalAlignment $VALUES[];
		public static final HorizontalAlignment CENTER;
		static HorizontalAlignment DEFAULT;
		public static final HorizontalAlignment LEFT;
		public static final HorizontalAlignment RIGHT;
		private int intValue;
		private String stringValue;

		static 
		{
			CENTER = new HorizontalAlignment("CENTER", 0, "center", 0);
		//    0    0:new             #2   <Class LikeView$HorizontalAlignment>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "CENTER">
		//    3    6:iconst_0        
		//    4    7:ldc1            #25  <String "center">
		//    5    9:iconst_0        
		//    6   10:invokespecial   #29  <Method void LikeView$HorizontalAlignment(String, int, String, int)>
		//    7   13:putstatic       #31  <Field LikeView$HorizontalAlignment CENTER>
			LEFT = new HorizontalAlignment("LEFT", 1, "left", 1);
		//    8   16:new             #2   <Class LikeView$HorizontalAlignment>
		//    9   19:dup             
		//   10   20:ldc1            #32  <String "LEFT">
		//   11   22:iconst_1        
		//   12   23:ldc1            #34  <String "left">
		//   13   25:iconst_1        
		//   14   26:invokespecial   #29  <Method void LikeView$HorizontalAlignment(String, int, String, int)>
		//   15   29:putstatic       #36  <Field LikeView$HorizontalAlignment LEFT>
			RIGHT = new HorizontalAlignment("RIGHT", 2, "right", 2);
		//   16   32:new             #2   <Class LikeView$HorizontalAlignment>
		//   17   35:dup             
		//   18   36:ldc1            #37  <String "RIGHT">
		//   19   38:iconst_2        
		//   20   39:ldc1            #39  <String "right">
		//   21   41:iconst_2        
		//   22   42:invokespecial   #29  <Method void LikeView$HorizontalAlignment(String, int, String, int)>
		//   23   45:putstatic       #41  <Field LikeView$HorizontalAlignment RIGHT>
			HorizontalAlignment horizontalalignment = CENTER;
		//   24   48:getstatic       #31  <Field LikeView$HorizontalAlignment CENTER>
		//   25   51:astore_0        
			$VALUES = (new HorizontalAlignment[] {
				horizontalalignment, LEFT, RIGHT
			});
		//   26   52:iconst_3        
		//   27   53:anewarray       HorizontalAlignment[]
		//   28   56:dup             
		//   29   57:iconst_0        
		//   30   58:aload_0         
		//   31   59:aastore         
		//   32   60:dup             
		//   33   61:iconst_1        
		//   34   62:getstatic       #36  <Field LikeView$HorizontalAlignment LEFT>
		//   35   65:aastore         
		//   36   66:dup             
		//   37   67:iconst_2        
		//   38   68:getstatic       #41  <Field LikeView$HorizontalAlignment RIGHT>
		//   39   71:aastore         
		//   40   72:putstatic       #43  <Field LikeView$HorizontalAlignment[] $VALUES>
			DEFAULT = horizontalalignment;
		//   41   75:aload_0         
		//   42   76:putstatic       #45  <Field LikeView$HorizontalAlignment DEFAULT>
		//*  43   79:return          
		}


/*
		static int access$200(HorizontalAlignment horizontalalignment)
		{
			return horizontalalignment.getValue();
		//    0    0:aload_0         
		//    1    1:invokespecial   #60  <Method int getValue()>
		//    2    4:ireturn         
		}

*/

		private HorizontalAlignment(String s, int i, String s1, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
			stringValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #51  <Field String stringValue>
			intValue = j;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #53  <Field int intValue>
		//   10   17:return          
		}
	}

	private class LikeActionControllerCreationCallback
		implements com.facebook.share.internal.LikeActionController.CreationCallback
	{

		public void cancel()
		{
			isCancelled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #27  <Field boolean isCancelled>
		//    3    5:return          
		}

		public void onComplete(LikeActionController likeactioncontroller, FacebookException facebookexception)
		{
			if(isCancelled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field boolean isCancelled>
		//*   2    4:ifeq            8
				return;
		//    3    7:return          
			FacebookException facebookexception1 = facebookexception;
		//    4    8:aload_2         
		//    5    9:astore_3        
			if(likeactioncontroller != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          48
			{
				if(!likeactioncontroller.shouldEnableView())
		//*   8   14:aload_1         
		//*   9   15:invokevirtual   #35  <Method boolean LikeActionController.shouldEnableView()>
		//*  10   18:ifne            31
					facebookexception = new FacebookException("Cannot use LikeView. The device may not be supported.");
		//   11   21:new             #37  <Class FacebookException>
		//   12   24:dup             
		//   13   25:ldc1            #39  <String "Cannot use LikeView. The device may not be supported.">
		//   14   27:invokespecial   #42  <Method void FacebookException(String)>
		//   15   30:astore_2        
				associateWithLikeActionController(likeactioncontroller);
		//   16   31:aload_0         
		//   17   32:getfield        #17  <Field LikeView this$0>
		//   18   35:aload_1         
		//   19   36:invokestatic    #46  <Method void LikeView.access$1100(LikeView, LikeActionController)>
				updateLikeStateAndLayout();
		//   20   39:aload_0         
		//   21   40:getfield        #17  <Field LikeView this$0>
		//   22   43:invokestatic    #49  <Method void LikeView.access$700(LikeView)>
				facebookexception1 = facebookexception;
		//   23   46:aload_2         
		//   24   47:astore_3        
			}
			if(facebookexception1 != null && onErrorListener != null)
		//*  25   48:aload_3         
		//*  26   49:ifnull          75
		//*  27   52:aload_0         
		//*  28   53:getfield        #17  <Field LikeView this$0>
		//*  29   56:invokestatic    #53  <Method LikeView$OnErrorListener LikeView.access$800(LikeView)>
		//*  30   59:ifnull          75
				onErrorListener.onError(facebookexception1);
		//   31   62:aload_0         
		//   32   63:getfield        #17  <Field LikeView this$0>
		//   33   66:invokestatic    #53  <Method LikeView$OnErrorListener LikeView.access$800(LikeView)>
		//   34   69:aload_3         
		//   35   70:invokeinterface #59  <Method void LikeView$OnErrorListener.onError(FacebookException)>
			creationCallback = null;
		//   36   75:aload_0         
		//   37   76:getfield        #17  <Field LikeView this$0>
		//   38   79:aconst_null     
		//   39   80:invokestatic    #63  <Method LikeView$LikeActionControllerCreationCallback LikeView.access$1202(LikeView, LikeView$LikeActionControllerCreationCallback)>
		//   40   83:pop             
		//   41   84:return          
		}

		private boolean isCancelled;
		final LikeView this$0;

		private LikeActionControllerCreationCallback()
		{
			this$0 = LikeView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field LikeView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
		//    5    9:return          
		}

	}

	private class LikeControllerBroadcastReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			context = ((Context) (intent.getAction()));
		//    0    0:aload_2         
		//    1    1:invokevirtual   #28  <Method String Intent.getAction()>
		//    2    4:astore_1        
			intent = ((Intent) (intent.getExtras()));
		//    3    5:aload_2         
		//    4    6:invokevirtual   #32  <Method Bundle Intent.getExtras()>
		//    5    9:astore_2        
			boolean flag1 = true;
		//    6   10:iconst_1        
		//    7   11:istore          4
			boolean flag = flag1;
		//    8   13:iload           4
		//    9   15:istore_3        
			if(intent != null)
		//*  10   16:aload_2         
		//*  11   17:ifnull          62
			{
				String s = ((Bundle) (intent)).getString("com.facebook.sdk.LikeActionController.OBJECT_ID");
		//   12   20:aload_2         
		//   13   21:ldc1            #34  <String "com.facebook.sdk.LikeActionController.OBJECT_ID">
		//   14   23:invokevirtual   #40  <Method String Bundle.getString(String)>
		//   15   26:astore          5
				flag = flag1;
		//   16   28:iload           4
		//   17   30:istore_3        
				if(!Utility.isNullOrEmpty(s))
		//*  18   31:aload           5
		//*  19   33:invokestatic    #46  <Method boolean Utility.isNullOrEmpty(String)>
		//*  20   36:ifne            62
					if(Utility.areObjectsEqual(((Object) (objectId)), ((Object) (s))))
		//*  21   39:aload_0         
		//*  22   40:getfield        #13  <Field LikeView this$0>
		//*  23   43:invokestatic    #50  <Method String LikeView.access$600(LikeView)>
		//*  24   46:aload           5
		//*  25   48:invokestatic    #54  <Method boolean Utility.areObjectsEqual(Object, Object)>
		//*  26   51:ifeq            60
						flag = flag1;
		//   27   54:iload           4
		//   28   56:istore_3        
					else
		//*  29   57:goto            62
						flag = false;
		//   30   60:iconst_0        
		//   31   61:istore_3        
			}
			if(!flag)
		//*  32   62:iload_3         
		//*  33   63:ifne            67
				return;
		//   34   66:return          
			if("com.facebook.sdk.LikeActionController.UPDATED".equals(((Object) (context))))
		//*  35   67:ldc1            #56  <String "com.facebook.sdk.LikeActionController.UPDATED">
		//*  36   69:aload_1         
		//*  37   70:invokevirtual   #62  <Method boolean String.equals(Object)>
		//*  38   73:ifeq            84
			{
				updateLikeStateAndLayout();
		//   39   76:aload_0         
		//   40   77:getfield        #13  <Field LikeView this$0>
		//   41   80:invokestatic    #65  <Method void LikeView.access$700(LikeView)>
				return;
		//   42   83:return          
			}
			if("com.facebook.sdk.LikeActionController.DID_ERROR".equals(((Object) (context))))
		//*  43   84:ldc1            #67  <String "com.facebook.sdk.LikeActionController.DID_ERROR">
		//*  44   86:aload_1         
		//*  45   87:invokevirtual   #62  <Method boolean String.equals(Object)>
		//*  46   90:ifeq            120
			{
				if(onErrorListener != null)
		//*  47   93:aload_0         
		//*  48   94:getfield        #13  <Field LikeView this$0>
		//*  49   97:invokestatic    #71  <Method LikeView$OnErrorListener LikeView.access$800(LikeView)>
		//*  50  100:ifnull          156
				{
					onErrorListener.onError(NativeProtocol.getExceptionFromErrorData(((Bundle) (intent))));
		//   51  103:aload_0         
		//   52  104:getfield        #13  <Field LikeView this$0>
		//   53  107:invokestatic    #71  <Method LikeView$OnErrorListener LikeView.access$800(LikeView)>
		//   54  110:aload_2         
		//   55  111:invokestatic    #77  <Method FacebookException NativeProtocol.getExceptionFromErrorData(Bundle)>
		//   56  114:invokeinterface #83  <Method void LikeView$OnErrorListener.onError(FacebookException)>
					return;
		//   57  119:return          
				}
			} else
			if("com.facebook.sdk.LikeActionController.DID_RESET".equals(((Object) (context))))
		//*  58  120:ldc1            #85  <String "com.facebook.sdk.LikeActionController.DID_RESET">
		//*  59  122:aload_1         
		//*  60  123:invokevirtual   #62  <Method boolean String.equals(Object)>
		//*  61  126:ifeq            156
			{
				context = ((Context) (LikeView.this));
		//   62  129:aload_0         
		//   63  130:getfield        #13  <Field LikeView this$0>
		//   64  133:astore_1        
				((LikeView) (context)).setObjectIdAndTypeForced(((LikeView) (context)).objectId, objectType);
		//   65  134:aload_1         
		//   66  135:aload_1         
		//   67  136:invokestatic    #50  <Method String LikeView.access$600(LikeView)>
		//   68  139:aload_0         
		//   69  140:getfield        #13  <Field LikeView this$0>
		//   70  143:invokestatic    #89  <Method LikeView$ObjectType LikeView.access$900(LikeView)>
		//   71  146:invokestatic    #93  <Method void LikeView.access$1000(LikeView, String, LikeView$ObjectType)>
				updateLikeStateAndLayout();
		//   72  149:aload_0         
		//   73  150:getfield        #13  <Field LikeView this$0>
		//   74  153:invokestatic    #65  <Method void LikeView.access$700(LikeView)>
			}
		//   75  156:return          
		}

		final LikeView this$0;

		private LikeControllerBroadcastReceiver()
		{
			this$0 = LikeView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field LikeView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
		//    5    9:return          
		}

	}

	public static final class ObjectType extends Enum
	{

		public static ObjectType fromInt(int i)
		{
			ObjectType aobjecttype[] = values();
		//    0    0:invokestatic    #60  <Method LikeView$ObjectType[] values()>
		//    1    3:astore_3        
			int k = aobjecttype.length;
		//    2    4:aload_3         
		//    3    5:arraylength     
		//    4    6:istore_2        
			for(int j = 0; j < k; j++)
		//*   5    7:iconst_0        
		//*   6    8:istore_1        
		//*   7    9:iload_1         
		//*   8   10:iload_2         
		//*   9   11:icmpge          38
			{
				ObjectType objecttype = aobjecttype[j];
		//   10   14:aload_3         
		//   11   15:iload_1         
		//   12   16:aaload          
		//   13   17:astore          4
				if(objecttype.getValue() == i)
		//*  14   19:aload           4
		//*  15   21:invokevirtual   #64  <Method int getValue()>
		//*  16   24:iload_0         
		//*  17   25:icmpne          31
					return objecttype;
		//   18   28:aload           4
		//   19   30:areturn         
			}

		//   20   31:iload_1         
		//   21   32:iconst_1        
		//   22   33:iadd            
		//   23   34:istore_1        
		//*  24   35:goto            9
			return null;
		//   25   38:aconst_null     
		//   26   39:areturn         
		}

		public static ObjectType valueOf(String s)
		{
			return (ObjectType)Enum.valueOf(com/facebook/share/widget/LikeView$ObjectType, s);
		//    0    0:ldc1            #2   <Class LikeView$ObjectType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #69  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LikeView$ObjectType>
		//    4    9:areturn         
		}

		public static ObjectType[] values()
		{
			return (ObjectType[])((ObjectType []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field LikeView$ObjectType[] $VALUES>
		//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.facebook.share.widget.LikeView$ObjectType_3B_.clone()>
		//    2    6:checkcast       #70  <Class LikeView$ObjectType[]>
		//    3    9:areturn         
		}

		public int getValue()
		{
			return intValue;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field int intValue>
		//    2    4:ireturn         
		}

		public String toString()
		{
			return stringValue;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field String stringValue>
		//    2    4:areturn         
		}

		private static final ObjectType $VALUES[];
		public static ObjectType DEFAULT;
		public static final ObjectType OPEN_GRAPH;
		public static final ObjectType PAGE;
		public static final ObjectType UNKNOWN;
		private int intValue;
		private String stringValue;

		static 
		{
			UNKNOWN = new ObjectType("UNKNOWN", 0, "unknown", 0);
		//    0    0:new             #2   <Class LikeView$ObjectType>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:ldc1            #25  <String "unknown">
		//    5    9:iconst_0        
		//    6   10:invokespecial   #29  <Method void LikeView$ObjectType(String, int, String, int)>
		//    7   13:putstatic       #31  <Field LikeView$ObjectType UNKNOWN>
			OPEN_GRAPH = new ObjectType("OPEN_GRAPH", 1, "open_graph", 1);
		//    8   16:new             #2   <Class LikeView$ObjectType>
		//    9   19:dup             
		//   10   20:ldc1            #32  <String "OPEN_GRAPH">
		//   11   22:iconst_1        
		//   12   23:ldc1            #34  <String "open_graph">
		//   13   25:iconst_1        
		//   14   26:invokespecial   #29  <Method void LikeView$ObjectType(String, int, String, int)>
		//   15   29:putstatic       #36  <Field LikeView$ObjectType OPEN_GRAPH>
			PAGE = new ObjectType("PAGE", 2, "page", 2);
		//   16   32:new             #2   <Class LikeView$ObjectType>
		//   17   35:dup             
		//   18   36:ldc1            #37  <String "PAGE">
		//   19   38:iconst_2        
		//   20   39:ldc1            #39  <String "page">
		//   21   41:iconst_2        
		//   22   42:invokespecial   #29  <Method void LikeView$ObjectType(String, int, String, int)>
		//   23   45:putstatic       #41  <Field LikeView$ObjectType PAGE>
			ObjectType objecttype = UNKNOWN;
		//   24   48:getstatic       #31  <Field LikeView$ObjectType UNKNOWN>
		//   25   51:astore_0        
			$VALUES = (new ObjectType[] {
				objecttype, OPEN_GRAPH, PAGE
			});
		//   26   52:iconst_3        
		//   27   53:anewarray       ObjectType[]
		//   28   56:dup             
		//   29   57:iconst_0        
		//   30   58:aload_0         
		//   31   59:aastore         
		//   32   60:dup             
		//   33   61:iconst_1        
		//   34   62:getstatic       #36  <Field LikeView$ObjectType OPEN_GRAPH>
		//   35   65:aastore         
		//   36   66:dup             
		//   37   67:iconst_2        
		//   38   68:getstatic       #41  <Field LikeView$ObjectType PAGE>
		//   39   71:aastore         
		//   40   72:putstatic       #43  <Field LikeView$ObjectType[] $VALUES>
			DEFAULT = objecttype;
		//   41   75:aload_0         
		//   42   76:putstatic       #45  <Field LikeView$ObjectType DEFAULT>
		//*  43   79:return          
		}

		private ObjectType(String s, int i, String s1, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
			stringValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #51  <Field String stringValue>
			intValue = j;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #53  <Field int intValue>
		//   10   17:return          
		}
	}

	public static interface OnErrorListener
	{

		public abstract void onError(FacebookException facebookexception);
	}

	public static final class Style extends Enum
	{

		static Style fromInt(int i)
		{
			Style astyle[] = values();
		//    0    0:invokestatic    #66  <Method LikeView$Style[] values()>
		//    1    3:astore_3        
			int k = astyle.length;
		//    2    4:aload_3         
		//    3    5:arraylength     
		//    4    6:istore_2        
			for(int j = 0; j < k; j++)
		//*   5    7:iconst_0        
		//*   6    8:istore_1        
		//*   7    9:iload_1         
		//*   8   10:iload_2         
		//*   9   11:icmpge          38
			{
				Style style = astyle[j];
		//   10   14:aload_3         
		//   11   15:iload_1         
		//   12   16:aaload          
		//   13   17:astore          4
				if(style.getValue() == i)
		//*  14   19:aload           4
		//*  15   21:invokespecial   #60  <Method int getValue()>
		//*  16   24:iload_0         
		//*  17   25:icmpne          31
					return style;
		//   18   28:aload           4
		//   19   30:areturn         
			}

		//   20   31:iload_1         
		//   21   32:iconst_1        
		//   22   33:iadd            
		//   23   34:istore_1        
		//*  24   35:goto            9
			return null;
		//   25   38:aconst_null     
		//   26   39:areturn         
		}

		private int getValue()
		{
			return intValue;
		//    0    0:aload_0         
		//    1    1:getfield        #53  <Field int intValue>
		//    2    4:ireturn         
		}

		public static Style valueOf(String s)
		{
			return (Style)Enum.valueOf(com/facebook/share/widget/LikeView$Style, s);
		//    0    0:ldc1            #2   <Class LikeView$Style>
		//    1    2:aload_0         
		//    2    3:invokestatic    #71  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LikeView$Style>
		//    4    9:areturn         
		}

		public static Style[] values()
		{
			return (Style[])((Style []) ($VALUES)).clone();
		//    0    0:getstatic       #43  <Field LikeView$Style[] $VALUES>
		//    1    3:invokevirtual   #76  <Method Object _5B_Lcom.facebook.share.widget.LikeView$Style_3B_.clone()>
		//    2    6:checkcast       #72  <Class LikeView$Style[]>
		//    3    9:areturn         
		}

		public String toString()
		{
			return stringValue;
		//    0    0:aload_0         
		//    1    1:getfield        #51  <Field String stringValue>
		//    2    4:areturn         
		}

		private static final Style $VALUES[];
		public static final Style BOX_COUNT;
		public static final Style BUTTON;
		static Style DEFAULT;
		public static final Style STANDARD;
		private int intValue;
		private String stringValue;

		static 
		{
			STANDARD = new Style("STANDARD", 0, "standard", 0);
		//    0    0:new             #2   <Class LikeView$Style>
		//    1    3:dup             
		//    2    4:ldc1            #23  <String "STANDARD">
		//    3    6:iconst_0        
		//    4    7:ldc1            #25  <String "standard">
		//    5    9:iconst_0        
		//    6   10:invokespecial   #29  <Method void LikeView$Style(String, int, String, int)>
		//    7   13:putstatic       #31  <Field LikeView$Style STANDARD>
			BUTTON = new Style("BUTTON", 1, "button", 1);
		//    8   16:new             #2   <Class LikeView$Style>
		//    9   19:dup             
		//   10   20:ldc1            #32  <String "BUTTON">
		//   11   22:iconst_1        
		//   12   23:ldc1            #34  <String "button">
		//   13   25:iconst_1        
		//   14   26:invokespecial   #29  <Method void LikeView$Style(String, int, String, int)>
		//   15   29:putstatic       #36  <Field LikeView$Style BUTTON>
			BOX_COUNT = new Style("BOX_COUNT", 2, "box_count", 2);
		//   16   32:new             #2   <Class LikeView$Style>
		//   17   35:dup             
		//   18   36:ldc1            #37  <String "BOX_COUNT">
		//   19   38:iconst_2        
		//   20   39:ldc1            #39  <String "box_count">
		//   21   41:iconst_2        
		//   22   42:invokespecial   #29  <Method void LikeView$Style(String, int, String, int)>
		//   23   45:putstatic       #41  <Field LikeView$Style BOX_COUNT>
			Style style = STANDARD;
		//   24   48:getstatic       #31  <Field LikeView$Style STANDARD>
		//   25   51:astore_0        
			$VALUES = (new Style[] {
				style, BUTTON, BOX_COUNT
			});
		//   26   52:iconst_3        
		//   27   53:anewarray       Style[]
		//   28   56:dup             
		//   29   57:iconst_0        
		//   30   58:aload_0         
		//   31   59:aastore         
		//   32   60:dup             
		//   33   61:iconst_1        
		//   34   62:getstatic       #36  <Field LikeView$Style BUTTON>
		//   35   65:aastore         
		//   36   66:dup             
		//   37   67:iconst_2        
		//   38   68:getstatic       #41  <Field LikeView$Style BOX_COUNT>
		//   39   71:aastore         
		//   40   72:putstatic       #43  <Field LikeView$Style[] $VALUES>
			DEFAULT = style;
		//   41   75:aload_0         
		//   42   76:putstatic       #45  <Field LikeView$Style DEFAULT>
		//*  43   79:return          
		}


/*
		static int access$000(Style style)
		{
			return style.getValue();
		//    0    0:aload_0         
		//    1    1:invokespecial   #60  <Method int getValue()>
		//    2    4:ireturn         
		}

*/

		private Style(String s, int i, String s1, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #49  <Method void Enum(String, int)>
			stringValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #51  <Field String stringValue>
			intValue = j;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #53  <Field int intValue>
		//   10   17:return          
		}
	}


	public LikeView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void FrameLayout(Context)>
		likeViewStyle = Style.DEFAULT;
	//    3    5:aload_0         
	//    4    6:getstatic       #73  <Field LikeView$Style LikeView$Style.DEFAULT>
	//    5    9:putfield        #75  <Field LikeView$Style likeViewStyle>
		horizontalAlignment = HorizontalAlignment.DEFAULT;
	//    6   12:aload_0         
	//    7   13:getstatic       #77  <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.DEFAULT>
	//    8   16:putfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
		auxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
	//    9   19:aload_0         
	//   10   20:getstatic       #81  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.DEFAULT>
	//   11   23:putfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
		foregroundColor = -1;
	//   12   26:aload_0         
	//   13   27:iconst_m1       
	//   14   28:putfield        #85  <Field int foregroundColor>
		explicitlyDisabled = true;
	//   15   31:aload_0         
	//   16   32:iconst_1        
	//   17   33:putfield        #87  <Field boolean explicitlyDisabled>
		initialize(context);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokespecial   #90  <Method void initialize(Context)>
	//   21   41:return          
	}

	public LikeView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #95  <Method void FrameLayout(Context, AttributeSet)>
		likeViewStyle = Style.DEFAULT;
	//    4    6:aload_0         
	//    5    7:getstatic       #73  <Field LikeView$Style LikeView$Style.DEFAULT>
	//    6   10:putfield        #75  <Field LikeView$Style likeViewStyle>
		horizontalAlignment = HorizontalAlignment.DEFAULT;
	//    7   13:aload_0         
	//    8   14:getstatic       #77  <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.DEFAULT>
	//    9   17:putfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
		auxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
	//   10   20:aload_0         
	//   11   21:getstatic       #81  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.DEFAULT>
	//   12   24:putfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
		foregroundColor = -1;
	//   13   27:aload_0         
	//   14   28:iconst_m1       
	//   15   29:putfield        #85  <Field int foregroundColor>
		explicitlyDisabled = true;
	//   16   32:aload_0         
	//   17   33:iconst_1        
	//   18   34:putfield        #87  <Field boolean explicitlyDisabled>
		parseAttributes(attributeset);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:invokespecial   #99  <Method void parseAttributes(AttributeSet)>
		initialize(context);
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:invokespecial   #90  <Method void initialize(Context)>
	//   25   47:return          
	}

	private void associateWithLikeActionController(LikeActionController likeactioncontroller)
	{
		likeActionController = likeactioncontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #139 <Field LikeActionController likeActionController>
		broadcastReceiver = ((BroadcastReceiver) (new LikeControllerBroadcastReceiver()));
	//    3    5:aload_0         
	//    4    6:new             #19  <Class LikeView$LikeControllerBroadcastReceiver>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #142 <Method void LikeView$LikeControllerBroadcastReceiver(LikeView, LikeView$1)>
	//    9   15:putfield        #144 <Field BroadcastReceiver broadcastReceiver>
		likeactioncontroller = ((LikeActionController) (LocalBroadcastManager.getInstance(getContext())));
	//   10   18:aload_0         
	//   11   19:invokevirtual   #148 <Method Context getContext()>
	//   12   22:invokestatic    #154 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   13   25:astore_1        
		IntentFilter intentfilter = new IntentFilter();
	//   14   26:new             #156 <Class IntentFilter>
	//   15   29:dup             
	//   16   30:invokespecial   #158 <Method void IntentFilter()>
	//   17   33:astore_2        
		intentfilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
	//   18   34:aload_2         
	//   19   35:ldc1            #160 <String "com.facebook.sdk.LikeActionController.UPDATED">
	//   20   37:invokevirtual   #164 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
	//   21   40:aload_2         
	//   22   41:ldc1            #166 <String "com.facebook.sdk.LikeActionController.DID_ERROR">
	//   23   43:invokevirtual   #164 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
	//   24   46:aload_2         
	//   25   47:ldc1            #168 <String "com.facebook.sdk.LikeActionController.DID_RESET">
	//   26   49:invokevirtual   #164 <Method void IntentFilter.addAction(String)>
		((LocalBroadcastManager) (likeactioncontroller)).registerReceiver(broadcastReceiver, intentfilter);
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:getfield        #144 <Field BroadcastReceiver broadcastReceiver>
	//   30   57:aload_2         
	//   31   58:invokevirtual   #172 <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   32   61:return          
	}

	private Activity getActivity()
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #148 <Method Context getContext()>
	//    2    4:astore_2        
		boolean flag;
		do
		{
			flag = context instanceof Activity;
	//    3    5:aload_2         
	//    4    6:instanceof      #176 <Class Activity>
	//    5    9:istore_1        
			if(flag || !(context instanceof ContextWrapper))
				break;
	//    6   10:iload_1         
	//    7   11:ifne            32
	//    8   14:aload_2         
	//    9   15:instanceof      #178 <Class ContextWrapper>
	//   10   18:ifeq            32
			context = ((ContextWrapper)context).getBaseContext();
	//   11   21:aload_2         
	//   12   22:checkcast       #178 <Class ContextWrapper>
	//   13   25:invokevirtual   #181 <Method Context ContextWrapper.getBaseContext()>
	//   14   28:astore_2        
		} while(true);
	//   15   29:goto            5
		if(flag)
	//*  16   32:iload_1         
	//*  17   33:ifeq            41
			return (Activity)context;
	//   18   36:aload_2         
	//   19   37:checkcast       #176 <Class Activity>
	//   20   40:areturn         
		else
			throw new FacebookException("Unable to get Activity.");
	//   21   41:new             #183 <Class FacebookException>
	//   22   44:dup             
	//   23   45:ldc1            #185 <String "Unable to get Activity.">
	//   24   47:invokespecial   #187 <Method void FacebookException(String)>
	//   25   50:athrow          
	}

	private Bundle getAnalyticsParameters()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #191 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #192 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("style", likeViewStyle.toString());
	//    4    8:aload_1         
	//    5    9:ldc1            #194 <String "style">
	//    6   11:aload_0         
	//    7   12:getfield        #75  <Field LikeView$Style likeViewStyle>
	//    8   15:invokevirtual   #198 <Method String LikeView$Style.toString()>
	//    9   18:invokevirtual   #202 <Method void Bundle.putString(String, String)>
		bundle.putString("auxiliary_position", auxiliaryViewPosition.toString());
	//   10   21:aload_1         
	//   11   22:ldc1            #204 <String "auxiliary_position">
	//   12   24:aload_0         
	//   13   25:getfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//   14   28:invokevirtual   #205 <Method String LikeView$AuxiliaryViewPosition.toString()>
	//   15   31:invokevirtual   #202 <Method void Bundle.putString(String, String)>
		bundle.putString("horizontal_alignment", horizontalAlignment.toString());
	//   16   34:aload_1         
	//   17   35:ldc1            #207 <String "horizontal_alignment">
	//   18   37:aload_0         
	//   19   38:getfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//   20   41:invokevirtual   #208 <Method String LikeView$HorizontalAlignment.toString()>
	//   21   44:invokevirtual   #202 <Method void Bundle.putString(String, String)>
		bundle.putString("object_id", Utility.coerceValueIfNullOrEmpty(objectId, ""));
	//   22   47:aload_1         
	//   23   48:ldc1            #210 <String "object_id">
	//   24   50:aload_0         
	//   25   51:getfield        #125 <Field String objectId>
	//   26   54:ldc1            #212 <String "">
	//   27   56:invokestatic    #218 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//   28   59:invokevirtual   #202 <Method void Bundle.putString(String, String)>
		bundle.putString("object_type", objectType.toString());
	//   29   62:aload_1         
	//   30   63:ldc1            #220 <String "object_type">
	//   31   65:aload_0         
	//   32   66:getfield        #137 <Field LikeView$ObjectType objectType>
	//   33   69:invokevirtual   #221 <Method String LikeView$ObjectType.toString()>
	//   34   72:invokevirtual   #202 <Method void Bundle.putString(String, String)>
		return bundle;
	//   35   75:aload_1         
	//   36   76:areturn         
	}

	private void initialize(Context context)
	{
		edgePadding = getResources().getDimensionPixelSize(com.facebook.common.R.dimen.com_facebook_likeview_edge_padding);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #225 <Method Resources getResources()>
	//    3    5:getstatic       #230 <Field int com.facebook.common.R$dimen.com_facebook_likeview_edge_padding>
	//    4    8:invokevirtual   #236 <Method int Resources.getDimensionPixelSize(int)>
	//    5   11:putfield        #238 <Field int edgePadding>
		internalPadding = getResources().getDimensionPixelSize(com.facebook.common.R.dimen.com_facebook_likeview_internal_padding);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:invokevirtual   #225 <Method Resources getResources()>
	//    9   19:getstatic       #241 <Field int com.facebook.common.R$dimen.com_facebook_likeview_internal_padding>
	//   10   22:invokevirtual   #236 <Method int Resources.getDimensionPixelSize(int)>
	//   11   25:putfield        #243 <Field int internalPadding>
		if(foregroundColor == -1)
	//*  12   28:aload_0         
	//*  13   29:getfield        #85  <Field int foregroundColor>
	//*  14   32:iconst_m1       
	//*  15   33:icmpne          50
			foregroundColor = getResources().getColor(com.facebook.common.R.color.com_facebook_likeview_text_color);
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:invokevirtual   #225 <Method Resources getResources()>
	//   19   41:getstatic       #248 <Field int com.facebook.common.R$color.com_facebook_likeview_text_color>
	//   20   44:invokevirtual   #251 <Method int Resources.getColor(int)>
	//   21   47:putfield        #85  <Field int foregroundColor>
		setBackgroundColor(0);
	//   22   50:aload_0         
	//   23   51:iconst_0        
	//   24   52:invokevirtual   #255 <Method void setBackgroundColor(int)>
		containerView = new LinearLayout(context);
	//   25   55:aload_0         
	//   26   56:new             #257 <Class LinearLayout>
	//   27   59:dup             
	//   28   60:aload_1         
	//   29   61:invokespecial   #258 <Method void LinearLayout(Context)>
	//   30   64:putfield        #260 <Field LinearLayout containerView>
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
	//   31   67:new             #262 <Class android.widget.FrameLayout$LayoutParams>
	//   32   70:dup             
	//   33   71:bipush          -2
	//   34   73:bipush          -2
	//   35   75:invokespecial   #265 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   36   78:astore_2        
		containerView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   37   79:aload_0         
	//   38   80:getfield        #260 <Field LinearLayout containerView>
	//   39   83:aload_2         
	//   40   84:invokevirtual   #269 <Method void LinearLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		initializeLikeButton(context);
	//   41   87:aload_0         
	//   42   88:aload_1         
	//   43   89:invokespecial   #272 <Method void initializeLikeButton(Context)>
		initializeSocialSentenceView(context);
	//   44   92:aload_0         
	//   45   93:aload_1         
	//   46   94:invokespecial   #275 <Method void initializeSocialSentenceView(Context)>
		initializeLikeCountView(context);
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:invokespecial   #278 <Method void initializeLikeCountView(Context)>
		containerView.addView(((View) (likeButton)));
	//   50  102:aload_0         
	//   51  103:getfield        #260 <Field LinearLayout containerView>
	//   52  106:aload_0         
	//   53  107:getfield        #280 <Field LikeButton likeButton>
	//   54  110:invokevirtual   #284 <Method void LinearLayout.addView(View)>
		containerView.addView(((View) (socialSentenceView)));
	//   55  113:aload_0         
	//   56  114:getfield        #260 <Field LinearLayout containerView>
	//   57  117:aload_0         
	//   58  118:getfield        #286 <Field TextView socialSentenceView>
	//   59  121:invokevirtual   #284 <Method void LinearLayout.addView(View)>
		containerView.addView(((View) (likeBoxCountView)));
	//   60  124:aload_0         
	//   61  125:getfield        #260 <Field LinearLayout containerView>
	//   62  128:aload_0         
	//   63  129:getfield        #288 <Field LikeBoxCountView likeBoxCountView>
	//   64  132:invokevirtual   #284 <Method void LinearLayout.addView(View)>
		addView(((View) (containerView)));
	//   65  135:aload_0         
	//   66  136:aload_0         
	//   67  137:getfield        #260 <Field LinearLayout containerView>
	//   68  140:invokevirtual   #289 <Method void addView(View)>
		setObjectIdAndTypeForced(objectId, objectType);
	//   69  143:aload_0         
	//   70  144:aload_0         
	//   71  145:getfield        #125 <Field String objectId>
	//   72  148:aload_0         
	//   73  149:getfield        #137 <Field LikeView$ObjectType objectType>
	//   74  152:invokespecial   #105 <Method void setObjectIdAndTypeForced(String, LikeView$ObjectType)>
		updateLikeStateAndLayout();
	//   75  155:aload_0         
	//   76  156:invokespecial   #129 <Method void updateLikeStateAndLayout()>
	//   77  159:return          
	}

	private void initializeLikeButton(Context context)
	{
		LikeActionController likeactioncontroller = likeActionController;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field LikeActionController likeActionController>
	//    2    4:astore_3        
		boolean flag;
		if(likeactioncontroller != null && likeactioncontroller.isObjectLiked())
	//*   3    5:aload_3         
	//*   4    6:ifnull          21
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #295 <Method boolean LikeActionController.isObjectLiked()>
	//*   7   13:ifeq            21
			flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_2        
		else
	//*  10   18:goto            23
			flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_2        
		likeButton = new LikeButton(context, flag);
	//   13   23:aload_0         
	//   14   24:new             #297 <Class LikeButton>
	//   15   27:dup             
	//   16   28:aload_1         
	//   17   29:iload_2         
	//   18   30:invokespecial   #300 <Method void LikeButton(Context, boolean)>
	//   19   33:putfield        #280 <Field LikeButton likeButton>
		likeButton.setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				toggleLike();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field LikeView this$0>
			//    2    4:invokestatic    #26  <Method void LikeView.access$300(LikeView)>
			//    3    7:return          
			}

			final LikeView this$0;

			
			{
				this$0 = LikeView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field LikeView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   20   36:aload_0         
	//   21   37:getfield        #280 <Field LikeButton likeButton>
	//   22   40:new             #6   <Class LikeView$1>
	//   23   43:dup             
	//   24   44:aload_0         
	//   25   45:invokespecial   #302 <Method void LikeView$1(LikeView)>
	//   26   48:invokevirtual   #306 <Method void LikeButton.setOnClickListener(android.view.View$OnClickListener)>
		context = ((Context) (new android.widget.LinearLayout.LayoutParams(-2, -2)));
	//   27   51:new             #308 <Class android.widget.LinearLayout$LayoutParams>
	//   28   54:dup             
	//   29   55:bipush          -2
	//   30   57:bipush          -2
	//   31   59:invokespecial   #309 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   32   62:astore_1        
		likeButton.setLayoutParams(((android.view.ViewGroup.LayoutParams) (context)));
	//   33   63:aload_0         
	//   34   64:getfield        #280 <Field LikeButton likeButton>
	//   35   67:aload_1         
	//   36   68:invokevirtual   #310 <Method void LikeButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   37   71:return          
	}

	private void initializeLikeCountView(Context context)
	{
		likeBoxCountView = new LikeBoxCountView(context);
	//    0    0:aload_0         
	//    1    1:new             #312 <Class LikeBoxCountView>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #313 <Method void LikeBoxCountView(Context)>
	//    5    9:putfield        #288 <Field LikeBoxCountView likeBoxCountView>
		context = ((Context) (new android.widget.LinearLayout.LayoutParams(-1, -1)));
	//    6   12:new             #308 <Class android.widget.LinearLayout$LayoutParams>
	//    7   15:dup             
	//    8   16:iconst_m1       
	//    9   17:iconst_m1       
	//   10   18:invokespecial   #309 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   11   21:astore_1        
		likeBoxCountView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (context)));
	//   12   22:aload_0         
	//   13   23:getfield        #288 <Field LikeBoxCountView likeBoxCountView>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #314 <Method void LikeBoxCountView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   16   30:return          
	}

	private void initializeSocialSentenceView(Context context)
	{
		socialSentenceView = new TextView(context);
	//    0    0:aload_0         
	//    1    1:new             #316 <Class TextView>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #317 <Method void TextView(Context)>
	//    5    9:putfield        #286 <Field TextView socialSentenceView>
		socialSentenceView.setTextSize(0, getResources().getDimension(com.facebook.common.R.dimen.com_facebook_likeview_text_size));
	//    6   12:aload_0         
	//    7   13:getfield        #286 <Field TextView socialSentenceView>
	//    8   16:iconst_0        
	//    9   17:aload_0         
	//   10   18:invokevirtual   #225 <Method Resources getResources()>
	//   11   21:getstatic       #320 <Field int com.facebook.common.R$dimen.com_facebook_likeview_text_size>
	//   12   24:invokevirtual   #324 <Method float Resources.getDimension(int)>
	//   13   27:invokevirtual   #328 <Method void TextView.setTextSize(int, float)>
		socialSentenceView.setMaxLines(2);
	//   14   30:aload_0         
	//   15   31:getfield        #286 <Field TextView socialSentenceView>
	//   16   34:iconst_2        
	//   17   35:invokevirtual   #331 <Method void TextView.setMaxLines(int)>
		socialSentenceView.setTextColor(foregroundColor);
	//   18   38:aload_0         
	//   19   39:getfield        #286 <Field TextView socialSentenceView>
	//   20   42:aload_0         
	//   21   43:getfield        #85  <Field int foregroundColor>
	//   22   46:invokevirtual   #334 <Method void TextView.setTextColor(int)>
		socialSentenceView.setGravity(17);
	//   23   49:aload_0         
	//   24   50:getfield        #286 <Field TextView socialSentenceView>
	//   25   53:bipush          17
	//   26   55:invokevirtual   #337 <Method void TextView.setGravity(int)>
		context = ((Context) (new android.widget.LinearLayout.LayoutParams(-2, -1)));
	//   27   58:new             #308 <Class android.widget.LinearLayout$LayoutParams>
	//   28   61:dup             
	//   29   62:bipush          -2
	//   30   64:iconst_m1       
	//   31   65:invokespecial   #309 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   32   68:astore_1        
		socialSentenceView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (context)));
	//   33   69:aload_0         
	//   34   70:getfield        #286 <Field TextView socialSentenceView>
	//   35   73:aload_1         
	//   36   74:invokevirtual   #338 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   37   77:return          
	}

	private void parseAttributes(AttributeSet attributeset)
	{
		if(attributeset != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          195
		{
			if(getContext() == null)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #148 <Method Context getContext()>
	//*   4    8:ifnonnull       12
				return;
	//    5   11:return          
			attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(attributeset, com.facebook.common.R.styleable.com_facebook_like_view)));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #148 <Method Context getContext()>
	//    8   16:aload_1         
	//    9   17:getstatic       #344 <Field int[] com.facebook.common.R$styleable.com_facebook_like_view>
	//   10   20:invokevirtual   #350 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   23:astore_1        
			if(attributeset == null)
	//*  12   24:aload_1         
	//*  13   25:ifnonnull       29
				return;
	//   14   28:return          
			objectId = Utility.coerceValueIfNullOrEmpty(((TypedArray) (attributeset)).getString(com.facebook.common.R.styleable.com_facebook_like_view_com_facebook_object_id), ((String) (null)));
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:getstatic       #353 <Field int com.facebook.common.R$styleable.com_facebook_like_view_com_facebook_object_id>
	//   18   34:invokevirtual   #359 <Method String TypedArray.getString(int)>
	//   19   37:aconst_null     
	//   20   38:invokestatic    #218 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//   21   41:putfield        #125 <Field String objectId>
			objectType = ObjectType.fromInt(((TypedArray) (attributeset)).getInt(com.facebook.common.R.styleable.com_facebook_like_view_com_facebook_object_type, ObjectType.DEFAULT.getValue()));
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getstatic       #362 <Field int com.facebook.common.R$styleable.com_facebook_like_view_com_facebook_object_type>
	//   25   49:getstatic       #364 <Field LikeView$ObjectType LikeView$ObjectType.DEFAULT>
	//   26   52:invokevirtual   #368 <Method int LikeView$ObjectType.getValue()>
	//   27   55:invokevirtual   #372 <Method int TypedArray.getInt(int, int)>
	//   28   58:invokestatic    #376 <Method LikeView$ObjectType LikeView$ObjectType.fromInt(int)>
	//   29   61:putfield        #137 <Field LikeView$ObjectType objectType>
			likeViewStyle = Style.fromInt(((TypedArray) (attributeset)).getInt(com.facebook.common.R.styleable.com_facebook_like_view_com_facebook_style, Style.DEFAULT.getValue()));
	//   30   64:aload_0         
	//   31   65:aload_1         
	//   32   66:getstatic       #379 <Field int com.facebook.common.R$styleable.com_facebook_like_view_com_facebook_style>
	//   33   69:getstatic       #73  <Field LikeView$Style LikeView$Style.DEFAULT>
	//   34   72:invokestatic    #383 <Method int LikeView$Style.access$000(LikeView$Style)>
	//   35   75:invokevirtual   #372 <Method int TypedArray.getInt(int, int)>
	//   36   78:invokestatic    #386 <Method LikeView$Style LikeView$Style.fromInt(int)>
	//   37   81:putfield        #75  <Field LikeView$Style likeViewStyle>
			if(likeViewStyle != null)
	//*  38   84:aload_0         
	//*  39   85:getfield        #75  <Field LikeView$Style likeViewStyle>
	//*  40   88:ifnull          184
			{
				auxiliaryViewPosition = AuxiliaryViewPosition.fromInt(((TypedArray) (attributeset)).getInt(com.facebook.common.R.styleable.com_facebook_like_view_com_facebook_auxiliary_view_position, AuxiliaryViewPosition.DEFAULT.getValue()));
	//   41   91:aload_0         
	//   42   92:aload_1         
	//   43   93:getstatic       #389 <Field int com.facebook.common.R$styleable.com_facebook_like_view_com_facebook_auxiliary_view_position>
	//   44   96:getstatic       #81  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.DEFAULT>
	//   45   99:invokestatic    #393 <Method int LikeView$AuxiliaryViewPosition.access$100(LikeView$AuxiliaryViewPosition)>
	//   46  102:invokevirtual   #372 <Method int TypedArray.getInt(int, int)>
	//   47  105:invokestatic    #396 <Method LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.fromInt(int)>
	//   48  108:putfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
				if(auxiliaryViewPosition != null)
	//*  49  111:aload_0         
	//*  50  112:getfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//*  51  115:ifnull          173
				{
					horizontalAlignment = HorizontalAlignment.fromInt(((TypedArray) (attributeset)).getInt(com.facebook.common.R.styleable.com_facebook_like_view_com_facebook_horizontal_alignment, HorizontalAlignment.DEFAULT.getValue()));
	//   52  118:aload_0         
	//   53  119:aload_1         
	//   54  120:getstatic       #399 <Field int com.facebook.common.R$styleable.com_facebook_like_view_com_facebook_horizontal_alignment>
	//   55  123:getstatic       #77  <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.DEFAULT>
	//   56  126:invokestatic    #403 <Method int LikeView$HorizontalAlignment.access$200(LikeView$HorizontalAlignment)>
	//   57  129:invokevirtual   #372 <Method int TypedArray.getInt(int, int)>
	//   58  132:invokestatic    #406 <Method LikeView$HorizontalAlignment LikeView$HorizontalAlignment.fromInt(int)>
	//   59  135:putfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
					if(horizontalAlignment != null)
	//*  60  138:aload_0         
	//*  61  139:getfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//*  62  142:ifnull          162
					{
						foregroundColor = ((TypedArray) (attributeset)).getColor(com.facebook.common.R.styleable.com_facebook_like_view_com_facebook_foreground_color, -1);
	//   63  145:aload_0         
	//   64  146:aload_1         
	//   65  147:getstatic       #409 <Field int com.facebook.common.R$styleable.com_facebook_like_view_com_facebook_foreground_color>
	//   66  150:iconst_m1       
	//   67  151:invokevirtual   #411 <Method int TypedArray.getColor(int, int)>
	//   68  154:putfield        #85  <Field int foregroundColor>
						((TypedArray) (attributeset)).recycle();
	//   69  157:aload_1         
	//   70  158:invokevirtual   #414 <Method void TypedArray.recycle()>
						return;
	//   71  161:return          
					} else
					{
						throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
	//   72  162:new             #416 <Class IllegalArgumentException>
	//   73  165:dup             
	//   74  166:ldc2            #418 <String "Unsupported value for LikeView 'horizontal_alignment'">
	//   75  169:invokespecial   #419 <Method void IllegalArgumentException(String)>
	//   76  172:athrow          
					}
				} else
				{
					throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
	//   77  173:new             #416 <Class IllegalArgumentException>
	//   78  176:dup             
	//   79  177:ldc2            #421 <String "Unsupported value for LikeView 'auxiliary_view_position'">
	//   80  180:invokespecial   #419 <Method void IllegalArgumentException(String)>
	//   81  183:athrow          
				}
			} else
			{
				throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
	//   82  184:new             #416 <Class IllegalArgumentException>
	//   83  187:dup             
	//   84  188:ldc2            #423 <String "Unsupported value for LikeView 'style'">
	//   85  191:invokespecial   #419 <Method void IllegalArgumentException(String)>
	//   86  194:athrow          
			}
		} else
		{
			return;
	//   87  195:return          
		}
	}

	private void setObjectIdAndTypeForced(String s, ObjectType objecttype)
	{
		tearDownObjectAssociations();
	//    0    0:aload_0         
	//    1    1:invokespecial   #426 <Method void tearDownObjectAssociations()>
		objectId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #125 <Field String objectId>
		objectType = objecttype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #137 <Field LikeView$ObjectType objectType>
		if(Utility.isNullOrEmpty(s))
	//*   8   14:aload_1         
	//*   9   15:invokestatic    #430 <Method boolean Utility.isNullOrEmpty(String)>
	//*  10   18:ifeq            22
			return;
	//   11   21:return          
		creationCallback = new LikeActionControllerCreationCallback();
	//   12   22:aload_0         
	//   13   23:new             #16  <Class LikeView$LikeActionControllerCreationCallback>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:invokespecial   #431 <Method void LikeView$LikeActionControllerCreationCallback(LikeView, LikeView$1)>
	//   18   32:putfield        #115 <Field LikeView$LikeActionControllerCreationCallback creationCallback>
		if(!isInEditMode())
	//*  19   35:aload_0         
	//*  20   36:invokevirtual   #434 <Method boolean isInEditMode()>
	//*  21   39:ifne            51
			LikeActionController.getControllerForObjectId(s, objecttype, ((com.facebook.share.internal.LikeActionController.CreationCallback) (creationCallback)));
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:aload_0         
	//   25   45:getfield        #115 <Field LikeView$LikeActionControllerCreationCallback creationCallback>
	//   26   48:invokestatic    #438 <Method void LikeActionController.getControllerForObjectId(String, LikeView$ObjectType, com.facebook.share.internal.LikeActionController$CreationCallback)>
	//   27   51:return          
	}

	private void tearDownObjectAssociations()
	{
		if(broadcastReceiver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field BroadcastReceiver broadcastReceiver>
	//*   2    4:ifnull          26
		{
			LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(broadcastReceiver);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #148 <Method Context getContext()>
	//    5   11:invokestatic    #154 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    6   14:aload_0         
	//    7   15:getfield        #144 <Field BroadcastReceiver broadcastReceiver>
	//    8   18:invokevirtual   #442 <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
			broadcastReceiver = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #144 <Field BroadcastReceiver broadcastReceiver>
		}
		LikeActionControllerCreationCallback likeactioncontrollercreationcallback = creationCallback;
	//   12   26:aload_0         
	//   13   27:getfield        #115 <Field LikeView$LikeActionControllerCreationCallback creationCallback>
	//   14   30:astore_1        
		if(likeactioncontrollercreationcallback != null)
	//*  15   31:aload_1         
	//*  16   32:ifnull          44
		{
			likeactioncontrollercreationcallback.cancel();
	//   17   35:aload_1         
	//   18   36:invokevirtual   #445 <Method void LikeView$LikeActionControllerCreationCallback.cancel()>
			creationCallback = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #115 <Field LikeView$LikeActionControllerCreationCallback creationCallback>
		}
		likeActionController = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #139 <Field LikeActionController likeActionController>
	//   25   49:return          
	}

	private void toggleLike()
	{
		if(likeActionController != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field LikeActionController likeActionController>
	//*   2    4:ifnull          37
		{
			Activity activity = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
			if(parentFragment == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #447 <Field FragmentWrapper parentFragment>
	//*   7   13:ifnonnull       21
				activity = getActivity();
	//    8   16:aload_0         
	//    9   17:invokespecial   #449 <Method Activity getActivity()>
	//   10   20:astore_1        
			likeActionController.toggleLike(activity, parentFragment, getAnalyticsParameters());
	//   11   21:aload_0         
	//   12   22:getfield        #139 <Field LikeActionController likeActionController>
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #447 <Field FragmentWrapper parentFragment>
	//   16   30:aload_0         
	//   17   31:invokespecial   #451 <Method Bundle getAnalyticsParameters()>
	//   18   34:invokevirtual   #454 <Method void LikeActionController.toggleLike(Activity, FragmentWrapper, Bundle)>
		}
	//   19   37:return          
	}

	private void updateBoxCountCaretPosition()
	{
		static class _cls2
		{

			static final int $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[];

			static 
			{
				$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition = new int[AuxiliaryViewPosition.values().length];
			//    0    0:invokestatic    #18  <Method LikeView$AuxiliaryViewPosition[] LikeView$AuxiliaryViewPosition.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
				try
				{
					$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[AuxiliaryViewPosition.TOP.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
			//    5   12:getstatic       #24  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.TOP>
			//    6   15:invokevirtual   #28  <Method int LikeView$AuxiliaryViewPosition.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
			//*  10   23:getstatic       #31  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.BOTTOM>
			//*  11   26:invokevirtual   #28  <Method int LikeView$AuxiliaryViewPosition.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
			//*  15   34:getstatic       #34  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.INLINE>
			//*  16   37:invokevirtual   #28  <Method int LikeView$AuxiliaryViewPosition.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[AuxiliaryViewPosition.BOTTOM.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition[AuxiliaryViewPosition.INLINE.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(_cls2..SwitchMap.com.facebook.share.widget.LikeView.AuxiliaryViewPosition[auxiliaryViewPosition.ordinal()])
	//*   0    0:getstatic       #458 <Field int[] LikeView$2.$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
	//*   1    3:aload_0         
	//*   2    4:getfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//*   3    7:invokevirtual   #461 <Method int LikeView$AuxiliaryViewPosition.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 80
	//	               2 69
	//	               3 37
		default:
			return;
	//    6   36:return          

		case 3: // '\003'
			LikeBoxCountView likeboxcountview = likeBoxCountView;
	//    7   37:aload_0         
	//    8   38:getfield        #288 <Field LikeBoxCountView likeBoxCountView>
	//    9   41:astore_2        
			com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition likeboxcountviewcaretposition;
			if(horizontalAlignment == HorizontalAlignment.RIGHT)
	//*  10   42:aload_0         
	//*  11   43:getfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//*  12   46:getstatic       #464 <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.RIGHT>
	//*  13   49:if_acmpne       59
				likeboxcountviewcaretposition = com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.RIGHT;
	//   14   52:getstatic       #469 <Field com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition.RIGHT>
	//   15   55:astore_1        
			else
	//*  16   56:goto            63
				likeboxcountviewcaretposition = com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.LEFT;
	//   17   59:getstatic       #472 <Field com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition.LEFT>
	//   18   62:astore_1        
			likeboxcountview.setCaretPosition(likeboxcountviewcaretposition);
	//   19   63:aload_2         
	//   20   64:aload_1         
	//   21   65:invokevirtual   #476 <Method void LikeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition)>
			return;
	//   22   68:return          

		case 2: // '\002'
			likeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.TOP);
	//   23   69:aload_0         
	//   24   70:getfield        #288 <Field LikeBoxCountView likeBoxCountView>
	//   25   73:getstatic       #479 <Field com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition.TOP>
	//   26   76:invokevirtual   #476 <Method void LikeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition)>
			return;
	//   27   79:return          

		case 1: // '\001'
			likeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.BOTTOM);
	//   28   80:aload_0         
	//   29   81:getfield        #288 <Field LikeBoxCountView likeBoxCountView>
	//   30   84:getstatic       #482 <Field com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition.BOTTOM>
	//   31   87:invokevirtual   #476 <Method void LikeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition)>
			return;
	//   32   90:return          
		}
	}

	private void updateLayout()
	{
label0:
		{
			int i;
			Object obj;
label1:
			{
				obj = ((Object) ((android.widget.FrameLayout.LayoutParams)containerView.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:getfield        #260 <Field LinearLayout containerView>
	//    2    4:invokevirtual   #487 <Method android.view.ViewGroup$LayoutParams LinearLayout.getLayoutParams()>
	//    3    7:checkcast       #262 <Class android.widget.FrameLayout$LayoutParams>
	//    4   10:astore_3        
				android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)likeButton.getLayoutParams();
	//    5   11:aload_0         
	//    6   12:getfield        #280 <Field LikeButton likeButton>
	//    7   15:invokevirtual   #488 <Method android.view.ViewGroup$LayoutParams LikeButton.getLayoutParams()>
	//    8   18:checkcast       #308 <Class android.widget.LinearLayout$LayoutParams>
	//    9   21:astore          4
				if(horizontalAlignment == HorizontalAlignment.LEFT)
	//*  10   23:aload_0         
	//*  11   24:getfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//*  12   27:getstatic       #490 <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.LEFT>
	//*  13   30:if_acmpne       38
					i = 3;
	//   14   33:iconst_3        
	//   15   34:istore_1        
				else
	//*  16   35:goto            55
				if(horizontalAlignment == HorizontalAlignment.CENTER)
	//*  17   38:aload_0         
	//*  18   39:getfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//*  19   42:getstatic       #493 <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.CENTER>
	//*  20   45:if_acmpne       53
					i = 1;
	//   21   48:iconst_1        
	//   22   49:istore_1        
				else
	//*  23   50:goto            55
					i = 5;
	//   24   53:iconst_5        
	//   25   54:istore_1        
				obj.gravity = i | 0x30;
	//   26   55:aload_3         
	//   27   56:iload_1         
	//   28   57:bipush          48
	//   29   59:ior             
	//   30   60:putfield        #496 <Field int android.widget.FrameLayout$LayoutParams.gravity>
				layoutparams.gravity = i;
	//   31   63:aload           4
	//   32   65:iload_1         
	//   33   66:putfield        #497 <Field int android.widget.LinearLayout$LayoutParams.gravity>
				socialSentenceView.setVisibility(8);
	//   34   69:aload_0         
	//   35   70:getfield        #286 <Field TextView socialSentenceView>
	//   36   73:bipush          8
	//   37   75:invokevirtual   #500 <Method void TextView.setVisibility(int)>
				likeBoxCountView.setVisibility(8);
	//   38   78:aload_0         
	//   39   79:getfield        #288 <Field LikeBoxCountView likeBoxCountView>
	//   40   82:bipush          8
	//   41   84:invokevirtual   #501 <Method void LikeBoxCountView.setVisibility(int)>
				if(likeViewStyle == Style.STANDARD)
	//*  42   87:aload_0         
	//*  43   88:getfield        #75  <Field LikeView$Style likeViewStyle>
	//*  44   91:getstatic       #504 <Field LikeView$Style LikeView$Style.STANDARD>
	//*  45   94:if_acmpne       124
				{
					obj = ((Object) (likeActionController));
	//   46   97:aload_0         
	//   47   98:getfield        #139 <Field LikeActionController likeActionController>
	//   48  101:astore_3        
					if(obj != null && !Utility.isNullOrEmpty(((LikeActionController) (obj)).getSocialSentence()))
	//*  49  102:aload_3         
	//*  50  103:ifnull          124
	//*  51  106:aload_3         
	//*  52  107:invokevirtual   #507 <Method String LikeActionController.getSocialSentence()>
	//*  53  110:invokestatic    #430 <Method boolean Utility.isNullOrEmpty(String)>
	//*  54  113:ifne            124
					{
						obj = ((Object) (socialSentenceView));
	//   55  116:aload_0         
	//   56  117:getfield        #286 <Field TextView socialSentenceView>
	//   57  120:astore_3        
						break label1;
	//   58  121:goto            162
					}
				}
				if(likeViewStyle != Style.BOX_COUNT)
					break label0;
	//   59  124:aload_0         
	//   60  125:getfield        #75  <Field LikeView$Style likeViewStyle>
	//   61  128:getstatic       #510 <Field LikeView$Style LikeView$Style.BOX_COUNT>
	//   62  131:if_acmpne       401
				obj = ((Object) (likeActionController));
	//   63  134:aload_0         
	//   64  135:getfield        #139 <Field LikeActionController likeActionController>
	//   65  138:astore_3        
				if(obj == null || Utility.isNullOrEmpty(((LikeActionController) (obj)).getLikeCountString()))
					break label0;
	//   66  139:aload_3         
	//   67  140:ifnull          401
	//   68  143:aload_3         
	//   69  144:invokevirtual   #513 <Method String LikeActionController.getLikeCountString()>
	//   70  147:invokestatic    #430 <Method boolean Utility.isNullOrEmpty(String)>
	//   71  150:ifne            401
				updateBoxCountCaretPosition();
	//   72  153:aload_0         
	//   73  154:invokespecial   #515 <Method void updateBoxCountCaretPosition()>
				obj = ((Object) (likeBoxCountView));
	//   74  157:aload_0         
	//   75  158:getfield        #288 <Field LikeBoxCountView likeBoxCountView>
	//   76  161:astore_3        
			}
			boolean flag = false;
	//   77  162:iconst_0        
	//   78  163:istore_2        
			((View) (obj)).setVisibility(0);
	//   79  164:aload_3         
	//   80  165:iconst_0        
	//   81  166:invokevirtual   #518 <Method void View.setVisibility(int)>
			((android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams()).gravity = i;
	//   82  169:aload_3         
	//   83  170:invokevirtual   #519 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   84  173:checkcast       #308 <Class android.widget.LinearLayout$LayoutParams>
	//   85  176:iload_1         
	//   86  177:putfield        #497 <Field int android.widget.LinearLayout$LayoutParams.gravity>
			LinearLayout linearlayout = containerView;
	//   87  180:aload_0         
	//   88  181:getfield        #260 <Field LinearLayout containerView>
	//   89  184:astore          4
			if(auxiliaryViewPosition == AuxiliaryViewPosition.INLINE)
	//*  90  186:aload_0         
	//*  91  187:getfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//*  92  190:getstatic       #522 <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.INLINE>
	//*  93  193:if_acmpne       201
				i = ((int) (flag));
	//   94  196:iload_2         
	//   95  197:istore_1        
			else
	//*  96  198:goto            203
				i = 1;
	//   97  201:iconst_1        
	//   98  202:istore_1        
			linearlayout.setOrientation(i);
	//   99  203:aload           4
	//  100  205:iload_1         
	//  101  206:invokevirtual   #525 <Method void LinearLayout.setOrientation(int)>
			if(auxiliaryViewPosition != AuxiliaryViewPosition.TOP && (auxiliaryViewPosition != AuxiliaryViewPosition.INLINE || horizontalAlignment != HorizontalAlignment.RIGHT))
	//* 102  209:aload_0         
	//* 103  210:getfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//* 104  213:getstatic       #527 <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.TOP>
	//* 105  216:if_acmpeq       261
	//* 106  219:aload_0         
	//* 107  220:getfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//* 108  223:getstatic       #522 <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.INLINE>
	//* 109  226:if_acmpne       242
	//* 110  229:aload_0         
	//* 111  230:getfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//* 112  233:getstatic       #464 <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.RIGHT>
	//* 113  236:if_acmpne       242
	//* 114  239:goto            261
			{
				containerView.removeView(((View) (obj)));
	//  115  242:aload_0         
	//  116  243:getfield        #260 <Field LinearLayout containerView>
	//  117  246:aload_3         
	//  118  247:invokevirtual   #530 <Method void LinearLayout.removeView(View)>
				containerView.addView(((View) (obj)));
	//  119  250:aload_0         
	//  120  251:getfield        #260 <Field LinearLayout containerView>
	//  121  254:aload_3         
	//  122  255:invokevirtual   #284 <Method void LinearLayout.addView(View)>
			} else
	//* 123  258:goto            283
			{
				containerView.removeView(((View) (likeButton)));
	//  124  261:aload_0         
	//  125  262:getfield        #260 <Field LinearLayout containerView>
	//  126  265:aload_0         
	//  127  266:getfield        #280 <Field LikeButton likeButton>
	//  128  269:invokevirtual   #530 <Method void LinearLayout.removeView(View)>
				containerView.addView(((View) (likeButton)));
	//  129  272:aload_0         
	//  130  273:getfield        #260 <Field LinearLayout containerView>
	//  131  276:aload_0         
	//  132  277:getfield        #280 <Field LikeButton likeButton>
	//  133  280:invokevirtual   #284 <Method void LinearLayout.addView(View)>
			}
			switch(_cls2..SwitchMap.com.facebook.share.widget.LikeView.AuxiliaryViewPosition[auxiliaryViewPosition.ordinal()])
	//* 134  283:getstatic       #458 <Field int[] LikeView$2.$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
	//* 135  286:aload_0         
	//* 136  287:getfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//* 137  290:invokevirtual   #461 <Method int LikeView$AuxiliaryViewPosition.ordinal()>
	//* 138  293:iaload          
			{
	//* 139  294:tableswitch     1 3: default 320
	//	               1 384
	//	               2 367
	//	               3 321
			default:
				return;
	//  140  320:return          

			case 3: // '\003'
				if(horizontalAlignment == HorizontalAlignment.RIGHT)
	//* 141  321:aload_0         
	//* 142  322:getfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//* 143  325:getstatic       #464 <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.RIGHT>
	//* 144  328:if_acmpne       348
				{
					int j = edgePadding;
	//  145  331:aload_0         
	//  146  332:getfield        #238 <Field int edgePadding>
	//  147  335:istore_1        
					((View) (obj)).setPadding(j, j, internalPadding, j);
	//  148  336:aload_3         
	//  149  337:iload_1         
	//  150  338:iload_1         
	//  151  339:aload_0         
	//  152  340:getfield        #243 <Field int internalPadding>
	//  153  343:iload_1         
	//  154  344:invokevirtual   #534 <Method void View.setPadding(int, int, int, int)>
					return;
	//  155  347:return          
				} else
				{
					int k = internalPadding;
	//  156  348:aload_0         
	//  157  349:getfield        #243 <Field int internalPadding>
	//  158  352:istore_1        
					int j1 = edgePadding;
	//  159  353:aload_0         
	//  160  354:getfield        #238 <Field int edgePadding>
	//  161  357:istore_2        
					((View) (obj)).setPadding(k, j1, j1, j1);
	//  162  358:aload_3         
	//  163  359:iload_1         
	//  164  360:iload_2         
	//  165  361:iload_2         
	//  166  362:iload_2         
	//  167  363:invokevirtual   #534 <Method void View.setPadding(int, int, int, int)>
					return;
	//  168  366:return          
				}

			case 2: // '\002'
				int l = edgePadding;
	//  169  367:aload_0         
	//  170  368:getfield        #238 <Field int edgePadding>
	//  171  371:istore_1        
				((View) (obj)).setPadding(l, internalPadding, l, l);
	//  172  372:aload_3         
	//  173  373:iload_1         
	//  174  374:aload_0         
	//  175  375:getfield        #243 <Field int internalPadding>
	//  176  378:iload_1         
	//  177  379:iload_1         
	//  178  380:invokevirtual   #534 <Method void View.setPadding(int, int, int, int)>
				return;
	//  179  383:return          

			case 1: // '\001'
				int i1 = edgePadding;
	//  180  384:aload_0         
	//  181  385:getfield        #238 <Field int edgePadding>
	//  182  388:istore_1        
				((View) (obj)).setPadding(i1, i1, i1, internalPadding);
	//  183  389:aload_3         
	//  184  390:iload_1         
	//  185  391:iload_1         
	//  186  392:iload_1         
	//  187  393:aload_0         
	//  188  394:getfield        #243 <Field int internalPadding>
	//  189  397:invokevirtual   #534 <Method void View.setPadding(int, int, int, int)>
				return;
	//  190  400:return          
			}
		}
	//  191  401:return          
	}

	private void updateLikeStateAndLayout()
	{
		boolean flag = explicitlyDisabled ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field boolean explicitlyDisabled>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:istore_1        
		LikeActionController likeactioncontroller = likeActionController;
	//    5    7:aload_0         
	//    6    8:getfield        #139 <Field LikeActionController likeActionController>
	//    7   11:astore_2        
		if(likeactioncontroller == null)
	//*   8   12:aload_2         
	//*   9   13:ifnonnull       43
		{
			likeButton.setSelected(false);
	//   10   16:aload_0         
	//   11   17:getfield        #280 <Field LikeButton likeButton>
	//   12   20:iconst_0        
	//   13   21:invokevirtual   #538 <Method void LikeButton.setSelected(boolean)>
			socialSentenceView.setText(((CharSequence) (null)));
	//   14   24:aload_0         
	//   15   25:getfield        #286 <Field TextView socialSentenceView>
	//   16   28:aconst_null     
	//   17   29:invokevirtual   #542 <Method void TextView.setText(CharSequence)>
			likeBoxCountView.setText(((String) (null)));
	//   18   32:aload_0         
	//   19   33:getfield        #288 <Field LikeBoxCountView likeBoxCountView>
	//   20   36:aconst_null     
	//   21   37:invokevirtual   #544 <Method void LikeBoxCountView.setText(String)>
		} else
	//*  22   40:goto            92
		{
			likeButton.setSelected(likeactioncontroller.isObjectLiked());
	//   23   43:aload_0         
	//   24   44:getfield        #280 <Field LikeButton likeButton>
	//   25   47:aload_2         
	//   26   48:invokevirtual   #295 <Method boolean LikeActionController.isObjectLiked()>
	//   27   51:invokevirtual   #538 <Method void LikeButton.setSelected(boolean)>
			socialSentenceView.setText(((CharSequence) (likeActionController.getSocialSentence())));
	//   28   54:aload_0         
	//   29   55:getfield        #286 <Field TextView socialSentenceView>
	//   30   58:aload_0         
	//   31   59:getfield        #139 <Field LikeActionController likeActionController>
	//   32   62:invokevirtual   #507 <Method String LikeActionController.getSocialSentence()>
	//   33   65:invokevirtual   #542 <Method void TextView.setText(CharSequence)>
			likeBoxCountView.setText(likeActionController.getLikeCountString());
	//   34   68:aload_0         
	//   35   69:getfield        #288 <Field LikeBoxCountView likeBoxCountView>
	//   36   72:aload_0         
	//   37   73:getfield        #139 <Field LikeActionController likeActionController>
	//   38   76:invokevirtual   #513 <Method String LikeActionController.getLikeCountString()>
	//   39   79:invokevirtual   #544 <Method void LikeBoxCountView.setText(String)>
			flag &= likeActionController.shouldEnableView();
	//   40   82:iload_1         
	//   41   83:aload_0         
	//   42   84:getfield        #139 <Field LikeActionController likeActionController>
	//   43   87:invokevirtual   #547 <Method boolean LikeActionController.shouldEnableView()>
	//   44   90:iand            
	//   45   91:istore_1        
		}
		super.setEnabled(flag);
	//   46   92:aload_0         
	//   47   93:iload_1         
	//   48   94:invokespecial   #550 <Method void FrameLayout.setEnabled(boolean)>
		likeButton.setEnabled(flag);
	//   49   97:aload_0         
	//   50   98:getfield        #280 <Field LikeButton likeButton>
	//   51  101:iload_1         
	//   52  102:invokevirtual   #551 <Method void LikeButton.setEnabled(boolean)>
		updateLayout();
	//   53  105:aload_0         
	//   54  106:invokespecial   #553 <Method void updateLayout()>
	//   55  109:return          
	}

	public OnErrorListener getOnErrorListener()
	{
		return onErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field LikeView$OnErrorListener onErrorListener>
	//    2    4:areturn         
	}

	protected void onDetachedFromWindow()
	{
		setObjectIdAndType(((String) (null)), ObjectType.UNKNOWN);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:getstatic       #559 <Field LikeView$ObjectType LikeView$ObjectType.UNKNOWN>
	//    3    5:invokevirtual   #562 <Method void setObjectIdAndType(String, LikeView$ObjectType)>
		super.onDetachedFromWindow();
	//    4    8:aload_0         
	//    5    9:invokespecial   #564 <Method void FrameLayout.onDetachedFromWindow()>
	//    6   12:return          
	}

	public void setAuxiliaryViewPosition(AuxiliaryViewPosition auxiliaryviewposition)
	{
		if(auxiliaryviewposition == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            11
			auxiliaryviewposition = AuxiliaryViewPosition.DEFAULT;
	//    3    7:getstatic       #81  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.DEFAULT>
	//    4   10:astore_1        
		if(auxiliaryViewPosition != auxiliaryviewposition)
	//*   5   11:aload_0         
	//*   6   12:getfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//*   7   15:aload_1         
	//*   8   16:if_acmpeq       28
		{
			auxiliaryViewPosition = auxiliaryviewposition;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #83  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
			updateLayout();
	//   12   24:aload_0         
	//   13   25:invokespecial   #553 <Method void updateLayout()>
		}
	//   14   28:return          
	}

	public void setEnabled(boolean flag)
	{
		explicitlyDisabled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #87  <Field boolean explicitlyDisabled>
		updateLikeStateAndLayout();
	//    3    5:aload_0         
	//    4    6:invokespecial   #129 <Method void updateLikeStateAndLayout()>
	//    5    9:return          
	}

	public void setForegroundColor(int i)
	{
		if(foregroundColor != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field int foregroundColor>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          16
			socialSentenceView.setTextColor(i);
	//    4    8:aload_0         
	//    5    9:getfield        #286 <Field TextView socialSentenceView>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #334 <Method void TextView.setTextColor(int)>
	//    8   16:return          
	}

	public void setFragment(Fragment fragment)
	{
		parentFragment = new FragmentWrapper(fragment);
	//    0    0:aload_0         
	//    1    1:new             #571 <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #573 <Method void FragmentWrapper(Fragment)>
	//    5    9:putfield        #447 <Field FragmentWrapper parentFragment>
	//    6   12:return          
	}

	public void setFragment(android.support.v4.app.Fragment fragment)
	{
		parentFragment = new FragmentWrapper(fragment);
	//    0    0:aload_0         
	//    1    1:new             #571 <Class FragmentWrapper>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #576 <Method void FragmentWrapper(android.support.v4.app.Fragment)>
	//    5    9:putfield        #447 <Field FragmentWrapper parentFragment>
	//    6   12:return          
	}

	public void setHorizontalAlignment(HorizontalAlignment horizontalalignment)
	{
		if(horizontalalignment == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            11
			horizontalalignment = HorizontalAlignment.DEFAULT;
	//    3    7:getstatic       #77  <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.DEFAULT>
	//    4   10:astore_1        
		if(horizontalAlignment != horizontalalignment)
	//*   5   11:aload_0         
	//*   6   12:getfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//*   7   15:aload_1         
	//*   8   16:if_acmpeq       28
		{
			horizontalAlignment = horizontalalignment;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #79  <Field LikeView$HorizontalAlignment horizontalAlignment>
			updateLayout();
	//   12   24:aload_0         
	//   13   25:invokespecial   #553 <Method void updateLayout()>
		}
	//   14   28:return          
	}

	public void setLikeViewStyle(Style style)
	{
		if(style == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            11
			style = Style.DEFAULT;
	//    3    7:getstatic       #73  <Field LikeView$Style LikeView$Style.DEFAULT>
	//    4   10:astore_1        
		if(likeViewStyle != style)
	//*   5   11:aload_0         
	//*   6   12:getfield        #75  <Field LikeView$Style likeViewStyle>
	//*   7   15:aload_1         
	//*   8   16:if_acmpeq       28
		{
			likeViewStyle = style;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #75  <Field LikeView$Style likeViewStyle>
			updateLayout();
	//   12   24:aload_0         
	//   13   25:invokespecial   #553 <Method void updateLayout()>
		}
	//   14   28:return          
	}

	public void setObjectIdAndType(String s, ObjectType objecttype)
	{
		s = Utility.coerceValueIfNullOrEmpty(s, ((String) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #218 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//    3    5:astore_1        
		if(objecttype == null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          13
	//*   6   10:goto            17
			objecttype = ObjectType.DEFAULT;
	//    7   13:getstatic       #364 <Field LikeView$ObjectType LikeView$ObjectType.DEFAULT>
	//    8   16:astore_2        
		if(!Utility.areObjectsEqual(((Object) (s)), ((Object) (objectId))) || objecttype != objectType)
	//*   9   17:aload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #125 <Field String objectId>
	//*  12   22:invokestatic    #584 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  13   25:ifeq            36
	//*  14   28:aload_2         
	//*  15   29:aload_0         
	//*  16   30:getfield        #137 <Field LikeView$ObjectType objectType>
	//*  17   33:if_acmpeq       46
		{
			setObjectIdAndTypeForced(s, objecttype);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokespecial   #105 <Method void setObjectIdAndTypeForced(String, LikeView$ObjectType)>
			updateLikeStateAndLayout();
	//   22   42:aload_0         
	//   23   43:invokespecial   #129 <Method void updateLikeStateAndLayout()>
		}
	//   24   46:return          
	}

	public void setOnErrorListener(OnErrorListener onerrorlistener)
	{
		onErrorListener = onerrorlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #133 <Field LikeView$OnErrorListener onErrorListener>
	//    3    5:return          
	}

	private static final int NO_FOREGROUND_COLOR = -1;
	private AuxiliaryViewPosition auxiliaryViewPosition;
	private BroadcastReceiver broadcastReceiver;
	private LinearLayout containerView;
	private LikeActionControllerCreationCallback creationCallback;
	private int edgePadding;
	private boolean explicitlyDisabled;
	private int foregroundColor;
	private HorizontalAlignment horizontalAlignment;
	private int internalPadding;
	private LikeActionController likeActionController;
	private LikeBoxCountView likeBoxCountView;
	private LikeButton likeButton;
	private Style likeViewStyle;
	private String objectId;
	private ObjectType objectType;
	private OnErrorListener onErrorListener;
	private FragmentWrapper parentFragment;
	private TextView socialSentenceView;


/*
	static void access$1000(LikeView likeview, String s, ObjectType objecttype)
	{
		likeview.setObjectIdAndTypeForced(s, objecttype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #105 <Method void setObjectIdAndTypeForced(String, LikeView$ObjectType)>
		return;
	//    4    6:return          
	}

*/


/*
	static void access$1100(LikeView likeview, LikeActionController likeactioncontroller)
	{
		likeview.associateWithLikeActionController(likeactioncontroller);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #111 <Method void associateWithLikeActionController(LikeActionController)>
		return;
	//    3    5:return          
	}

*/


/*
	static LikeActionControllerCreationCallback access$1202(LikeView likeview, LikeActionControllerCreationCallback likeactioncontrollercreationcallback)
	{
		likeview.creationCallback = likeactioncontrollercreationcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field LikeView$LikeActionControllerCreationCallback creationCallback>
		return likeactioncontrollercreationcallback;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$300(LikeView likeview)
	{
		likeview.toggleLike();
	//    0    0:aload_0         
	//    1    1:invokespecial   #121 <Method void toggleLike()>
		return;
	//    2    4:return          
	}

*/


/*
	static String access$600(LikeView likeview)
	{
		return likeview.objectId;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field String objectId>
	//    2    4:areturn         
	}

*/


/*
	static void access$700(LikeView likeview)
	{
		likeview.updateLikeStateAndLayout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #129 <Method void updateLikeStateAndLayout()>
		return;
	//    2    4:return          
	}

*/


/*
	static OnErrorListener access$800(LikeView likeview)
	{
		return likeview.onErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field LikeView$OnErrorListener onErrorListener>
	//    2    4:areturn         
	}

*/


/*
	static ObjectType access$900(LikeView likeview)
	{
		return likeview.objectType;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field LikeView$ObjectType objectType>
	//    2    4:areturn         
	}

*/
}
