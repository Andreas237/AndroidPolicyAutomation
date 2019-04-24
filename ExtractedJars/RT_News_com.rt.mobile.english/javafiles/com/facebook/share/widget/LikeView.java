// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.share.widget;

import android.app.Activity;
import android.content.*;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.*;
import com.facebook.FacebookException;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.Utility;
import com.facebook.share.internal.*;

public class LikeView extends FrameLayout
{
	public static final class AuxiliaryViewPosition extends Enum
	{

		static AuxiliaryViewPosition fromInt(int i)
		{
			AuxiliaryViewPosition aauxiliaryviewposition[] = values();
		//    0    0:invokestatic    #65  <Method LikeView$AuxiliaryViewPosition[] values()>
		//    1    3:astore_3        
			int j = 0;
		//    2    4:iconst_0        
		//    3    5:istore_1        
			for(int k = aauxiliaryviewposition.length; j < k; j++)
		//*   4    6:aload_3         
		//*   5    7:arraylength     
		//*   6    8:istore_2        
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
		//*  15   21:invokespecial   #59  <Method int getValue()>
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
		//    1    1:getfield        #52  <Field int intValue>
		//    2    4:ireturn         
		}

		public static AuxiliaryViewPosition valueOf(String s)
		{
			return (AuxiliaryViewPosition)Enum.valueOf(com/facebook/share/widget/LikeView$AuxiliaryViewPosition, s);
		//    0    0:ldc1            #2   <Class LikeView$AuxiliaryViewPosition>
		//    1    2:aload_0         
		//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LikeView$AuxiliaryViewPosition>
		//    4    9:areturn         
		}

		public static AuxiliaryViewPosition[] values()
		{
			return (AuxiliaryViewPosition[])((AuxiliaryViewPosition []) ($VALUES)).clone();
		//    0    0:getstatic       #42  <Field LikeView$AuxiliaryViewPosition[] $VALUES>
		//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.facebook.share.widget.LikeView$AuxiliaryViewPosition_3B_.clone()>
		//    2    6:checkcast       #71  <Class LikeView$AuxiliaryViewPosition[]>
		//    3    9:areturn         
		}

		public String toString()
		{
			return stringValue;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field String stringValue>
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
		//    2    4:ldc1            #22  <String "BOTTOM">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "bottom">
		//    5    9:iconst_0        
		//    6   10:invokespecial   #28  <Method void LikeView$AuxiliaryViewPosition(String, int, String, int)>
		//    7   13:putstatic       #30  <Field LikeView$AuxiliaryViewPosition BOTTOM>
			INLINE = new AuxiliaryViewPosition("INLINE", 1, "inline", 1);
		//    8   16:new             #2   <Class LikeView$AuxiliaryViewPosition>
		//    9   19:dup             
		//   10   20:ldc1            #31  <String "INLINE">
		//   11   22:iconst_1        
		//   12   23:ldc1            #33  <String "inline">
		//   13   25:iconst_1        
		//   14   26:invokespecial   #28  <Method void LikeView$AuxiliaryViewPosition(String, int, String, int)>
		//   15   29:putstatic       #35  <Field LikeView$AuxiliaryViewPosition INLINE>
			TOP = new AuxiliaryViewPosition("TOP", 2, "top", 2);
		//   16   32:new             #2   <Class LikeView$AuxiliaryViewPosition>
		//   17   35:dup             
		//   18   36:ldc1            #36  <String "TOP">
		//   19   38:iconst_2        
		//   20   39:ldc1            #38  <String "top">
		//   21   41:iconst_2        
		//   22   42:invokespecial   #28  <Method void LikeView$AuxiliaryViewPosition(String, int, String, int)>
		//   23   45:putstatic       #40  <Field LikeView$AuxiliaryViewPosition TOP>
			$VALUES = (new AuxiliaryViewPosition[] {
				BOTTOM, INLINE, TOP
			});
		//   24   48:iconst_3        
		//   25   49:anewarray       AuxiliaryViewPosition[]
		//   26   52:dup             
		//   27   53:iconst_0        
		//   28   54:getstatic       #30  <Field LikeView$AuxiliaryViewPosition BOTTOM>
		//   29   57:aastore         
		//   30   58:dup             
		//   31   59:iconst_1        
		//   32   60:getstatic       #35  <Field LikeView$AuxiliaryViewPosition INLINE>
		//   33   63:aastore         
		//   34   64:dup             
		//   35   65:iconst_2        
		//   36   66:getstatic       #40  <Field LikeView$AuxiliaryViewPosition TOP>
		//   37   69:aastore         
		//   38   70:putstatic       #42  <Field LikeView$AuxiliaryViewPosition[] $VALUES>
			DEFAULT = BOTTOM;
		//   39   73:getstatic       #30  <Field LikeView$AuxiliaryViewPosition BOTTOM>
		//   40   76:putstatic       #44  <Field LikeView$AuxiliaryViewPosition DEFAULT>
		//*  41   79:return          
		}


/*
		static int access$100(AuxiliaryViewPosition auxiliaryviewposition)
		{
			return auxiliaryviewposition.getValue();
		//    0    0:aload_0         
		//    1    1:invokespecial   #59  <Method int getValue()>
		//    2    4:ireturn         
		}

*/

		private AuxiliaryViewPosition(String s, int i, String s1, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #48  <Method void Enum(String, int)>
			stringValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #50  <Field String stringValue>
			intValue = j;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #52  <Field int intValue>
		//   10   17:return          
		}
	}

	public static final class HorizontalAlignment extends Enum
	{

		static HorizontalAlignment fromInt(int i)
		{
			HorizontalAlignment ahorizontalalignment[] = values();
		//    0    0:invokestatic    #65  <Method LikeView$HorizontalAlignment[] values()>
		//    1    3:astore_3        
			int j = 0;
		//    2    4:iconst_0        
		//    3    5:istore_1        
			for(int k = ahorizontalalignment.length; j < k; j++)
		//*   4    6:aload_3         
		//*   5    7:arraylength     
		//*   6    8:istore_2        
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
		//*  15   21:invokespecial   #59  <Method int getValue()>
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
		//    1    1:getfield        #52  <Field int intValue>
		//    2    4:ireturn         
		}

		public static HorizontalAlignment valueOf(String s)
		{
			return (HorizontalAlignment)Enum.valueOf(com/facebook/share/widget/LikeView$HorizontalAlignment, s);
		//    0    0:ldc1            #2   <Class LikeView$HorizontalAlignment>
		//    1    2:aload_0         
		//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LikeView$HorizontalAlignment>
		//    4    9:areturn         
		}

		public static HorizontalAlignment[] values()
		{
			return (HorizontalAlignment[])((HorizontalAlignment []) ($VALUES)).clone();
		//    0    0:getstatic       #42  <Field LikeView$HorizontalAlignment[] $VALUES>
		//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.facebook.share.widget.LikeView$HorizontalAlignment_3B_.clone()>
		//    2    6:checkcast       #71  <Class LikeView$HorizontalAlignment[]>
		//    3    9:areturn         
		}

		public String toString()
		{
			return stringValue;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field String stringValue>
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
		//    2    4:ldc1            #22  <String "CENTER">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "center">
		//    5    9:iconst_0        
		//    6   10:invokespecial   #28  <Method void LikeView$HorizontalAlignment(String, int, String, int)>
		//    7   13:putstatic       #30  <Field LikeView$HorizontalAlignment CENTER>
			LEFT = new HorizontalAlignment("LEFT", 1, "left", 1);
		//    8   16:new             #2   <Class LikeView$HorizontalAlignment>
		//    9   19:dup             
		//   10   20:ldc1            #31  <String "LEFT">
		//   11   22:iconst_1        
		//   12   23:ldc1            #33  <String "left">
		//   13   25:iconst_1        
		//   14   26:invokespecial   #28  <Method void LikeView$HorizontalAlignment(String, int, String, int)>
		//   15   29:putstatic       #35  <Field LikeView$HorizontalAlignment LEFT>
			RIGHT = new HorizontalAlignment("RIGHT", 2, "right", 2);
		//   16   32:new             #2   <Class LikeView$HorizontalAlignment>
		//   17   35:dup             
		//   18   36:ldc1            #36  <String "RIGHT">
		//   19   38:iconst_2        
		//   20   39:ldc1            #38  <String "right">
		//   21   41:iconst_2        
		//   22   42:invokespecial   #28  <Method void LikeView$HorizontalAlignment(String, int, String, int)>
		//   23   45:putstatic       #40  <Field LikeView$HorizontalAlignment RIGHT>
			$VALUES = (new HorizontalAlignment[] {
				CENTER, LEFT, RIGHT
			});
		//   24   48:iconst_3        
		//   25   49:anewarray       HorizontalAlignment[]
		//   26   52:dup             
		//   27   53:iconst_0        
		//   28   54:getstatic       #30  <Field LikeView$HorizontalAlignment CENTER>
		//   29   57:aastore         
		//   30   58:dup             
		//   31   59:iconst_1        
		//   32   60:getstatic       #35  <Field LikeView$HorizontalAlignment LEFT>
		//   33   63:aastore         
		//   34   64:dup             
		//   35   65:iconst_2        
		//   36   66:getstatic       #40  <Field LikeView$HorizontalAlignment RIGHT>
		//   37   69:aastore         
		//   38   70:putstatic       #42  <Field LikeView$HorizontalAlignment[] $VALUES>
			DEFAULT = CENTER;
		//   39   73:getstatic       #30  <Field LikeView$HorizontalAlignment CENTER>
		//   40   76:putstatic       #44  <Field LikeView$HorizontalAlignment DEFAULT>
		//*  41   79:return          
		}


/*
		static int access$200(HorizontalAlignment horizontalalignment)
		{
			return horizontalalignment.getValue();
		//    0    0:aload_0         
		//    1    1:invokespecial   #59  <Method int getValue()>
		//    2    4:ireturn         
		}

*/

		private HorizontalAlignment(String s, int i, String s1, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #48  <Method void Enum(String, int)>
			stringValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #50  <Field String stringValue>
			intValue = j;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #52  <Field int intValue>
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
		//*  50  100:ifnull          157
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
		//*  61  126:ifeq            157
			{
				setObjectIdAndTypeForced(objectId, objectType);
		//   62  129:aload_0         
		//   63  130:getfield        #13  <Field LikeView this$0>
		//   64  133:aload_0         
		//   65  134:getfield        #13  <Field LikeView this$0>
		//   66  137:invokestatic    #50  <Method String LikeView.access$600(LikeView)>
		//   67  140:aload_0         
		//   68  141:getfield        #13  <Field LikeView this$0>
		//   69  144:invokestatic    #89  <Method LikeView$ObjectType LikeView.access$900(LikeView)>
		//   70  147:invokestatic    #93  <Method void LikeView.access$1000(LikeView, String, LikeView$ObjectType)>
				updateLikeStateAndLayout();
		//   71  150:aload_0         
		//   72  151:getfield        #13  <Field LikeView this$0>
		//   73  154:invokestatic    #65  <Method void LikeView.access$700(LikeView)>
			}
		//   74  157:return          
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
		//    0    0:invokestatic    #59  <Method LikeView$ObjectType[] values()>
		//    1    3:astore_3        
			int j = 0;
		//    2    4:iconst_0        
		//    3    5:istore_1        
			for(int k = aobjecttype.length; j < k; j++)
		//*   4    6:aload_3         
		//*   5    7:arraylength     
		//*   6    8:istore_2        
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
		//*  15   21:invokevirtual   #63  <Method int getValue()>
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
		//    2    3:invokestatic    #68  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LikeView$ObjectType>
		//    4    9:areturn         
		}

		public static ObjectType[] values()
		{
			return (ObjectType[])((ObjectType []) ($VALUES)).clone();
		//    0    0:getstatic       #42  <Field LikeView$ObjectType[] $VALUES>
		//    1    3:invokevirtual   #73  <Method Object _5B_Lcom.facebook.share.widget.LikeView$ObjectType_3B_.clone()>
		//    2    6:checkcast       #69  <Class LikeView$ObjectType[]>
		//    3    9:areturn         
		}

		public int getValue()
		{
			return intValue;
		//    0    0:aload_0         
		//    1    1:getfield        #52  <Field int intValue>
		//    2    4:ireturn         
		}

		public String toString()
		{
			return stringValue;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field String stringValue>
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
		//    2    4:ldc1            #22  <String "UNKNOWN">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "unknown">
		//    5    9:iconst_0        
		//    6   10:invokespecial   #28  <Method void LikeView$ObjectType(String, int, String, int)>
		//    7   13:putstatic       #30  <Field LikeView$ObjectType UNKNOWN>
			OPEN_GRAPH = new ObjectType("OPEN_GRAPH", 1, "open_graph", 1);
		//    8   16:new             #2   <Class LikeView$ObjectType>
		//    9   19:dup             
		//   10   20:ldc1            #31  <String "OPEN_GRAPH">
		//   11   22:iconst_1        
		//   12   23:ldc1            #33  <String "open_graph">
		//   13   25:iconst_1        
		//   14   26:invokespecial   #28  <Method void LikeView$ObjectType(String, int, String, int)>
		//   15   29:putstatic       #35  <Field LikeView$ObjectType OPEN_GRAPH>
			PAGE = new ObjectType("PAGE", 2, "page", 2);
		//   16   32:new             #2   <Class LikeView$ObjectType>
		//   17   35:dup             
		//   18   36:ldc1            #36  <String "PAGE">
		//   19   38:iconst_2        
		//   20   39:ldc1            #38  <String "page">
		//   21   41:iconst_2        
		//   22   42:invokespecial   #28  <Method void LikeView$ObjectType(String, int, String, int)>
		//   23   45:putstatic       #40  <Field LikeView$ObjectType PAGE>
			$VALUES = (new ObjectType[] {
				UNKNOWN, OPEN_GRAPH, PAGE
			});
		//   24   48:iconst_3        
		//   25   49:anewarray       ObjectType[]
		//   26   52:dup             
		//   27   53:iconst_0        
		//   28   54:getstatic       #30  <Field LikeView$ObjectType UNKNOWN>
		//   29   57:aastore         
		//   30   58:dup             
		//   31   59:iconst_1        
		//   32   60:getstatic       #35  <Field LikeView$ObjectType OPEN_GRAPH>
		//   33   63:aastore         
		//   34   64:dup             
		//   35   65:iconst_2        
		//   36   66:getstatic       #40  <Field LikeView$ObjectType PAGE>
		//   37   69:aastore         
		//   38   70:putstatic       #42  <Field LikeView$ObjectType[] $VALUES>
			DEFAULT = UNKNOWN;
		//   39   73:getstatic       #30  <Field LikeView$ObjectType UNKNOWN>
		//   40   76:putstatic       #44  <Field LikeView$ObjectType DEFAULT>
		//*  41   79:return          
		}

		private ObjectType(String s, int i, String s1, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #48  <Method void Enum(String, int)>
			stringValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #50  <Field String stringValue>
			intValue = j;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #52  <Field int intValue>
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
		//    0    0:invokestatic    #65  <Method LikeView$Style[] values()>
		//    1    3:astore_3        
			int j = 0;
		//    2    4:iconst_0        
		//    3    5:istore_1        
			for(int k = astyle.length; j < k; j++)
		//*   4    6:aload_3         
		//*   5    7:arraylength     
		//*   6    8:istore_2        
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
		//*  15   21:invokespecial   #59  <Method int getValue()>
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
		//    1    1:getfield        #52  <Field int intValue>
		//    2    4:ireturn         
		}

		public static Style valueOf(String s)
		{
			return (Style)Enum.valueOf(com/facebook/share/widget/LikeView$Style, s);
		//    0    0:ldc1            #2   <Class LikeView$Style>
		//    1    2:aload_0         
		//    2    3:invokestatic    #70  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LikeView$Style>
		//    4    9:areturn         
		}

		public static Style[] values()
		{
			return (Style[])((Style []) ($VALUES)).clone();
		//    0    0:getstatic       #42  <Field LikeView$Style[] $VALUES>
		//    1    3:invokevirtual   #75  <Method Object _5B_Lcom.facebook.share.widget.LikeView$Style_3B_.clone()>
		//    2    6:checkcast       #71  <Class LikeView$Style[]>
		//    3    9:areturn         
		}

		public String toString()
		{
			return stringValue;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field String stringValue>
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
		//    2    4:ldc1            #22  <String "STANDARD">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "standard">
		//    5    9:iconst_0        
		//    6   10:invokespecial   #28  <Method void LikeView$Style(String, int, String, int)>
		//    7   13:putstatic       #30  <Field LikeView$Style STANDARD>
			BUTTON = new Style("BUTTON", 1, "button", 1);
		//    8   16:new             #2   <Class LikeView$Style>
		//    9   19:dup             
		//   10   20:ldc1            #31  <String "BUTTON">
		//   11   22:iconst_1        
		//   12   23:ldc1            #33  <String "button">
		//   13   25:iconst_1        
		//   14   26:invokespecial   #28  <Method void LikeView$Style(String, int, String, int)>
		//   15   29:putstatic       #35  <Field LikeView$Style BUTTON>
			BOX_COUNT = new Style("BOX_COUNT", 2, "box_count", 2);
		//   16   32:new             #2   <Class LikeView$Style>
		//   17   35:dup             
		//   18   36:ldc1            #36  <String "BOX_COUNT">
		//   19   38:iconst_2        
		//   20   39:ldc1            #38  <String "box_count">
		//   21   41:iconst_2        
		//   22   42:invokespecial   #28  <Method void LikeView$Style(String, int, String, int)>
		//   23   45:putstatic       #40  <Field LikeView$Style BOX_COUNT>
			$VALUES = (new Style[] {
				STANDARD, BUTTON, BOX_COUNT
			});
		//   24   48:iconst_3        
		//   25   49:anewarray       Style[]
		//   26   52:dup             
		//   27   53:iconst_0        
		//   28   54:getstatic       #30  <Field LikeView$Style STANDARD>
		//   29   57:aastore         
		//   30   58:dup             
		//   31   59:iconst_1        
		//   32   60:getstatic       #35  <Field LikeView$Style BUTTON>
		//   33   63:aastore         
		//   34   64:dup             
		//   35   65:iconst_2        
		//   36   66:getstatic       #40  <Field LikeView$Style BOX_COUNT>
		//   37   69:aastore         
		//   38   70:putstatic       #42  <Field LikeView$Style[] $VALUES>
			DEFAULT = STANDARD;
		//   39   73:getstatic       #30  <Field LikeView$Style STANDARD>
		//   40   76:putstatic       #44  <Field LikeView$Style DEFAULT>
		//*  41   79:return          
		}


/*
		static int access$000(Style style)
		{
			return style.getValue();
		//    0    0:aload_0         
		//    1    1:invokespecial   #59  <Method int getValue()>
		//    2    4:ireturn         
		}

*/

		private Style(String s, int i, String s1, int j)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #48  <Method void Enum(String, int)>
			stringValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #50  <Field String stringValue>
			intValue = j;
		//    7   11:aload_0         
		//    8   12:iload           4
		//    9   14:putfield        #52  <Field int intValue>
		//   10   17:return          
		}
	}


	public LikeView(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method void FrameLayout(Context)>
		likeViewStyle = Style.DEFAULT;
	//    3    5:aload_0         
	//    4    6:getstatic       #72  <Field LikeView$Style LikeView$Style.DEFAULT>
	//    5    9:putfield        #74  <Field LikeView$Style likeViewStyle>
		horizontalAlignment = HorizontalAlignment.DEFAULT;
	//    6   12:aload_0         
	//    7   13:getstatic       #76  <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.DEFAULT>
	//    8   16:putfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
		auxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
	//    9   19:aload_0         
	//   10   20:getstatic       #80  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.DEFAULT>
	//   11   23:putfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
		foregroundColor = -1;
	//   12   26:aload_0         
	//   13   27:iconst_m1       
	//   14   28:putfield        #84  <Field int foregroundColor>
		initialize(context);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #87  <Method void initialize(Context)>
	//   18   36:return          
	}

	public LikeView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #91  <Method void FrameLayout(Context, AttributeSet)>
		likeViewStyle = Style.DEFAULT;
	//    4    6:aload_0         
	//    5    7:getstatic       #72  <Field LikeView$Style LikeView$Style.DEFAULT>
	//    6   10:putfield        #74  <Field LikeView$Style likeViewStyle>
		horizontalAlignment = HorizontalAlignment.DEFAULT;
	//    7   13:aload_0         
	//    8   14:getstatic       #76  <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.DEFAULT>
	//    9   17:putfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
		auxiliaryViewPosition = AuxiliaryViewPosition.DEFAULT;
	//   10   20:aload_0         
	//   11   21:getstatic       #80  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.DEFAULT>
	//   12   24:putfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
		foregroundColor = -1;
	//   13   27:aload_0         
	//   14   28:iconst_m1       
	//   15   29:putfield        #84  <Field int foregroundColor>
		parseAttributes(attributeset);
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokespecial   #95  <Method void parseAttributes(AttributeSet)>
		initialize(context);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:invokespecial   #87  <Method void initialize(Context)>
	//   22   42:return          
	}

	private void associateWithLikeActionController(LikeActionController likeactioncontroller)
	{
		likeActionController = likeactioncontroller;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #135 <Field LikeActionController likeActionController>
		broadcastReceiver = ((BroadcastReceiver) (new LikeControllerBroadcastReceiver()));
	//    3    5:aload_0         
	//    4    6:new             #19  <Class LikeView$LikeControllerBroadcastReceiver>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:invokespecial   #138 <Method void LikeView$LikeControllerBroadcastReceiver(LikeView, LikeView$1)>
	//    9   15:putfield        #140 <Field BroadcastReceiver broadcastReceiver>
		likeactioncontroller = ((LikeActionController) (LocalBroadcastManager.getInstance(getContext())));
	//   10   18:aload_0         
	//   11   19:invokevirtual   #144 <Method Context getContext()>
	//   12   22:invokestatic    #150 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//   13   25:astore_1        
		IntentFilter intentfilter = new IntentFilter();
	//   14   26:new             #152 <Class IntentFilter>
	//   15   29:dup             
	//   16   30:invokespecial   #154 <Method void IntentFilter()>
	//   17   33:astore_2        
		intentfilter.addAction("com.facebook.sdk.LikeActionController.UPDATED");
	//   18   34:aload_2         
	//   19   35:ldc1            #156 <String "com.facebook.sdk.LikeActionController.UPDATED">
	//   20   37:invokevirtual   #160 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_ERROR");
	//   21   40:aload_2         
	//   22   41:ldc1            #162 <String "com.facebook.sdk.LikeActionController.DID_ERROR">
	//   23   43:invokevirtual   #160 <Method void IntentFilter.addAction(String)>
		intentfilter.addAction("com.facebook.sdk.LikeActionController.DID_RESET");
	//   24   46:aload_2         
	//   25   47:ldc1            #164 <String "com.facebook.sdk.LikeActionController.DID_RESET">
	//   26   49:invokevirtual   #160 <Method void IntentFilter.addAction(String)>
		((LocalBroadcastManager) (likeactioncontroller)).registerReceiver(broadcastReceiver, intentfilter);
	//   27   52:aload_1         
	//   28   53:aload_0         
	//   29   54:getfield        #140 <Field BroadcastReceiver broadcastReceiver>
	//   30   57:aload_2         
	//   31   58:invokevirtual   #168 <Method void LocalBroadcastManager.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   32   61:return          
	}

	private Activity getActivity()
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #144 <Method Context getContext()>
	//    2    4:astore_2        
		boolean flag;
		do
		{
			flag = context instanceof Activity;
	//    3    5:aload_2         
	//    4    6:instanceof      #172 <Class Activity>
	//    5    9:istore_1        
			if(flag || !(context instanceof ContextWrapper))
				break;
	//    6   10:iload_1         
	//    7   11:ifne            32
	//    8   14:aload_2         
	//    9   15:instanceof      #174 <Class ContextWrapper>
	//   10   18:ifeq            32
			context = ((ContextWrapper)context).getBaseContext();
	//   11   21:aload_2         
	//   12   22:checkcast       #174 <Class ContextWrapper>
	//   13   25:invokevirtual   #177 <Method Context ContextWrapper.getBaseContext()>
	//   14   28:astore_2        
		} while(true);
	//   15   29:goto            5
		if(flag)
	//*  16   32:iload_1         
	//*  17   33:ifeq            41
			return (Activity)context;
	//   18   36:aload_2         
	//   19   37:checkcast       #172 <Class Activity>
	//   20   40:areturn         
		else
			throw new FacebookException("Unable to get Activity.");
	//   21   41:new             #179 <Class FacebookException>
	//   22   44:dup             
	//   23   45:ldc1            #181 <String "Unable to get Activity.">
	//   24   47:invokespecial   #183 <Method void FacebookException(String)>
	//   25   50:athrow          
	}

	private Bundle getAnalyticsParameters()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #187 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #188 <Method void Bundle()>
	//    3    7:astore_1        
		bundle.putString("style", likeViewStyle.toString());
	//    4    8:aload_1         
	//    5    9:ldc1            #190 <String "style">
	//    6   11:aload_0         
	//    7   12:getfield        #74  <Field LikeView$Style likeViewStyle>
	//    8   15:invokevirtual   #194 <Method String LikeView$Style.toString()>
	//    9   18:invokevirtual   #198 <Method void Bundle.putString(String, String)>
		bundle.putString("auxiliary_position", auxiliaryViewPosition.toString());
	//   10   21:aload_1         
	//   11   22:ldc1            #200 <String "auxiliary_position">
	//   12   24:aload_0         
	//   13   25:getfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//   14   28:invokevirtual   #201 <Method String LikeView$AuxiliaryViewPosition.toString()>
	//   15   31:invokevirtual   #198 <Method void Bundle.putString(String, String)>
		bundle.putString("horizontal_alignment", horizontalAlignment.toString());
	//   16   34:aload_1         
	//   17   35:ldc1            #203 <String "horizontal_alignment">
	//   18   37:aload_0         
	//   19   38:getfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//   20   41:invokevirtual   #204 <Method String LikeView$HorizontalAlignment.toString()>
	//   21   44:invokevirtual   #198 <Method void Bundle.putString(String, String)>
		bundle.putString("object_id", Utility.coerceValueIfNullOrEmpty(objectId, ""));
	//   22   47:aload_1         
	//   23   48:ldc1            #206 <String "object_id">
	//   24   50:aload_0         
	//   25   51:getfield        #121 <Field String objectId>
	//   26   54:ldc1            #208 <String "">
	//   27   56:invokestatic    #214 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//   28   59:invokevirtual   #198 <Method void Bundle.putString(String, String)>
		bundle.putString("object_type", objectType.toString());
	//   29   62:aload_1         
	//   30   63:ldc1            #216 <String "object_type">
	//   31   65:aload_0         
	//   32   66:getfield        #133 <Field LikeView$ObjectType objectType>
	//   33   69:invokevirtual   #217 <Method String LikeView$ObjectType.toString()>
	//   34   72:invokevirtual   #198 <Method void Bundle.putString(String, String)>
		return bundle;
	//   35   75:aload_1         
	//   36   76:areturn         
	}

	private void initialize(Context context)
	{
		edgePadding = getResources().getDimensionPixelSize(com.facebook.R.dimen.com_facebook_likeview_edge_padding);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #221 <Method Resources getResources()>
	//    3    5:getstatic       #226 <Field int com.facebook.R$dimen.com_facebook_likeview_edge_padding>
	//    4    8:invokevirtual   #232 <Method int Resources.getDimensionPixelSize(int)>
	//    5   11:putfield        #234 <Field int edgePadding>
		internalPadding = getResources().getDimensionPixelSize(com.facebook.R.dimen.com_facebook_likeview_internal_padding);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:invokevirtual   #221 <Method Resources getResources()>
	//    9   19:getstatic       #237 <Field int com.facebook.R$dimen.com_facebook_likeview_internal_padding>
	//   10   22:invokevirtual   #232 <Method int Resources.getDimensionPixelSize(int)>
	//   11   25:putfield        #239 <Field int internalPadding>
		if(foregroundColor == -1)
	//*  12   28:aload_0         
	//*  13   29:getfield        #84  <Field int foregroundColor>
	//*  14   32:iconst_m1       
	//*  15   33:icmpne          50
			foregroundColor = getResources().getColor(com.facebook.R.color.com_facebook_likeview_text_color);
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:invokevirtual   #221 <Method Resources getResources()>
	//   19   41:getstatic       #244 <Field int com.facebook.R$color.com_facebook_likeview_text_color>
	//   20   44:invokevirtual   #247 <Method int Resources.getColor(int)>
	//   21   47:putfield        #84  <Field int foregroundColor>
		setBackgroundColor(0);
	//   22   50:aload_0         
	//   23   51:iconst_0        
	//   24   52:invokevirtual   #251 <Method void setBackgroundColor(int)>
		containerView = new LinearLayout(context);
	//   25   55:aload_0         
	//   26   56:new             #253 <Class LinearLayout>
	//   27   59:dup             
	//   28   60:aload_1         
	//   29   61:invokespecial   #254 <Method void LinearLayout(Context)>
	//   30   64:putfield        #256 <Field LinearLayout containerView>
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
	//   31   67:new             #258 <Class android.widget.FrameLayout$LayoutParams>
	//   32   70:dup             
	//   33   71:bipush          -2
	//   34   73:bipush          -2
	//   35   75:invokespecial   #261 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   36   78:astore_2        
		containerView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   37   79:aload_0         
	//   38   80:getfield        #256 <Field LinearLayout containerView>
	//   39   83:aload_2         
	//   40   84:invokevirtual   #265 <Method void LinearLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		initializeLikeButton(context);
	//   41   87:aload_0         
	//   42   88:aload_1         
	//   43   89:invokespecial   #268 <Method void initializeLikeButton(Context)>
		initializeSocialSentenceView(context);
	//   44   92:aload_0         
	//   45   93:aload_1         
	//   46   94:invokespecial   #271 <Method void initializeSocialSentenceView(Context)>
		initializeLikeCountView(context);
	//   47   97:aload_0         
	//   48   98:aload_1         
	//   49   99:invokespecial   #274 <Method void initializeLikeCountView(Context)>
		containerView.addView(((View) (likeButton)));
	//   50  102:aload_0         
	//   51  103:getfield        #256 <Field LinearLayout containerView>
	//   52  106:aload_0         
	//   53  107:getfield        #276 <Field LikeButton likeButton>
	//   54  110:invokevirtual   #280 <Method void LinearLayout.addView(View)>
		containerView.addView(((View) (socialSentenceView)));
	//   55  113:aload_0         
	//   56  114:getfield        #256 <Field LinearLayout containerView>
	//   57  117:aload_0         
	//   58  118:getfield        #282 <Field TextView socialSentenceView>
	//   59  121:invokevirtual   #280 <Method void LinearLayout.addView(View)>
		containerView.addView(((View) (likeBoxCountView)));
	//   60  124:aload_0         
	//   61  125:getfield        #256 <Field LinearLayout containerView>
	//   62  128:aload_0         
	//   63  129:getfield        #284 <Field LikeBoxCountView likeBoxCountView>
	//   64  132:invokevirtual   #280 <Method void LinearLayout.addView(View)>
		addView(((View) (containerView)));
	//   65  135:aload_0         
	//   66  136:aload_0         
	//   67  137:getfield        #256 <Field LinearLayout containerView>
	//   68  140:invokevirtual   #285 <Method void addView(View)>
		setObjectIdAndTypeForced(objectId, objectType);
	//   69  143:aload_0         
	//   70  144:aload_0         
	//   71  145:getfield        #121 <Field String objectId>
	//   72  148:aload_0         
	//   73  149:getfield        #133 <Field LikeView$ObjectType objectType>
	//   74  152:invokespecial   #101 <Method void setObjectIdAndTypeForced(String, LikeView$ObjectType)>
		updateLikeStateAndLayout();
	//   75  155:aload_0         
	//   76  156:invokespecial   #125 <Method void updateLikeStateAndLayout()>
	//   77  159:return          
	}

	private void initializeLikeButton(Context context)
	{
		boolean flag;
		if(likeActionController != null && likeActionController.isObjectLiked())
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field LikeActionController likeActionController>
	//*   2    4:ifnull          22
	//*   3    7:aload_0         
	//*   4    8:getfield        #135 <Field LikeActionController likeActionController>
	//*   5   11:invokevirtual   #291 <Method boolean LikeActionController.isObjectLiked()>
	//*   6   14:ifeq            22
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore_2        
		else
	//*   9   19:goto            24
			flag = false;
	//   10   22:iconst_0        
	//   11   23:istore_2        
		likeButton = new LikeButton(context, flag);
	//   12   24:aload_0         
	//   13   25:new             #293 <Class LikeButton>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:iload_2         
	//   17   31:invokespecial   #296 <Method void LikeButton(Context, boolean)>
	//   18   34:putfield        #276 <Field LikeButton likeButton>
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
	//   19   37:aload_0         
	//   20   38:getfield        #276 <Field LikeButton likeButton>
	//   21   41:new             #6   <Class LikeView$1>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:invokespecial   #298 <Method void LikeView$1(LikeView)>
	//   25   49:invokevirtual   #302 <Method void LikeButton.setOnClickListener(android.view.View$OnClickListener)>
		context = ((Context) (new android.widget.LinearLayout.LayoutParams(-2, -2)));
	//   26   52:new             #304 <Class android.widget.LinearLayout$LayoutParams>
	//   27   55:dup             
	//   28   56:bipush          -2
	//   29   58:bipush          -2
	//   30   60:invokespecial   #305 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   31   63:astore_1        
		likeButton.setLayoutParams(((android.view.ViewGroup.LayoutParams) (context)));
	//   32   64:aload_0         
	//   33   65:getfield        #276 <Field LikeButton likeButton>
	//   34   68:aload_1         
	//   35   69:invokevirtual   #306 <Method void LikeButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   36   72:return          
	}

	private void initializeLikeCountView(Context context)
	{
		likeBoxCountView = new LikeBoxCountView(context);
	//    0    0:aload_0         
	//    1    1:new             #308 <Class LikeBoxCountView>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #309 <Method void LikeBoxCountView(Context)>
	//    5    9:putfield        #284 <Field LikeBoxCountView likeBoxCountView>
		context = ((Context) (new android.widget.LinearLayout.LayoutParams(-1, -1)));
	//    6   12:new             #304 <Class android.widget.LinearLayout$LayoutParams>
	//    7   15:dup             
	//    8   16:iconst_m1       
	//    9   17:iconst_m1       
	//   10   18:invokespecial   #305 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   11   21:astore_1        
		likeBoxCountView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (context)));
	//   12   22:aload_0         
	//   13   23:getfield        #284 <Field LikeBoxCountView likeBoxCountView>
	//   14   26:aload_1         
	//   15   27:invokevirtual   #310 <Method void LikeBoxCountView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   16   30:return          
	}

	private void initializeSocialSentenceView(Context context)
	{
		socialSentenceView = new TextView(context);
	//    0    0:aload_0         
	//    1    1:new             #312 <Class TextView>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #313 <Method void TextView(Context)>
	//    5    9:putfield        #282 <Field TextView socialSentenceView>
		socialSentenceView.setTextSize(0, getResources().getDimension(com.facebook.R.dimen.com_facebook_likeview_text_size));
	//    6   12:aload_0         
	//    7   13:getfield        #282 <Field TextView socialSentenceView>
	//    8   16:iconst_0        
	//    9   17:aload_0         
	//   10   18:invokevirtual   #221 <Method Resources getResources()>
	//   11   21:getstatic       #316 <Field int com.facebook.R$dimen.com_facebook_likeview_text_size>
	//   12   24:invokevirtual   #320 <Method float Resources.getDimension(int)>
	//   13   27:invokevirtual   #324 <Method void TextView.setTextSize(int, float)>
		socialSentenceView.setMaxLines(2);
	//   14   30:aload_0         
	//   15   31:getfield        #282 <Field TextView socialSentenceView>
	//   16   34:iconst_2        
	//   17   35:invokevirtual   #327 <Method void TextView.setMaxLines(int)>
		socialSentenceView.setTextColor(foregroundColor);
	//   18   38:aload_0         
	//   19   39:getfield        #282 <Field TextView socialSentenceView>
	//   20   42:aload_0         
	//   21   43:getfield        #84  <Field int foregroundColor>
	//   22   46:invokevirtual   #330 <Method void TextView.setTextColor(int)>
		socialSentenceView.setGravity(17);
	//   23   49:aload_0         
	//   24   50:getfield        #282 <Field TextView socialSentenceView>
	//   25   53:bipush          17
	//   26   55:invokevirtual   #333 <Method void TextView.setGravity(int)>
		context = ((Context) (new android.widget.LinearLayout.LayoutParams(-2, -1)));
	//   27   58:new             #304 <Class android.widget.LinearLayout$LayoutParams>
	//   28   61:dup             
	//   29   62:bipush          -2
	//   30   64:iconst_m1       
	//   31   65:invokespecial   #305 <Method void android.widget.LinearLayout$LayoutParams(int, int)>
	//   32   68:astore_1        
		socialSentenceView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (context)));
	//   33   69:aload_0         
	//   34   70:getfield        #282 <Field TextView socialSentenceView>
	//   35   73:aload_1         
	//   36   74:invokevirtual   #334 <Method void TextView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//*   3    5:invokevirtual   #144 <Method Context getContext()>
	//*   4    8:ifnonnull       12
				return;
	//    5   11:return          
			attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(attributeset, com.facebook.R.styleable.com_facebook_like_view)));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #144 <Method Context getContext()>
	//    8   16:aload_1         
	//    9   17:getstatic       #340 <Field int[] com.facebook.R$styleable.com_facebook_like_view>
	//   10   20:invokevirtual   #346 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   11   23:astore_1        
			if(attributeset == null)
	//*  12   24:aload_1         
	//*  13   25:ifnonnull       29
				return;
	//   14   28:return          
			objectId = Utility.coerceValueIfNullOrEmpty(((TypedArray) (attributeset)).getString(com.facebook.R.styleable.com_facebook_like_view_com_facebook_object_id), ((String) (null)));
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:getstatic       #349 <Field int com.facebook.R$styleable.com_facebook_like_view_com_facebook_object_id>
	//   18   34:invokevirtual   #355 <Method String TypedArray.getString(int)>
	//   19   37:aconst_null     
	//   20   38:invokestatic    #214 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//   21   41:putfield        #121 <Field String objectId>
			objectType = ObjectType.fromInt(((TypedArray) (attributeset)).getInt(com.facebook.R.styleable.com_facebook_like_view_com_facebook_object_type, ObjectType.DEFAULT.getValue()));
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:getstatic       #358 <Field int com.facebook.R$styleable.com_facebook_like_view_com_facebook_object_type>
	//   25   49:getstatic       #360 <Field LikeView$ObjectType LikeView$ObjectType.DEFAULT>
	//   26   52:invokevirtual   #364 <Method int LikeView$ObjectType.getValue()>
	//   27   55:invokevirtual   #368 <Method int TypedArray.getInt(int, int)>
	//   28   58:invokestatic    #372 <Method LikeView$ObjectType LikeView$ObjectType.fromInt(int)>
	//   29   61:putfield        #133 <Field LikeView$ObjectType objectType>
			likeViewStyle = Style.fromInt(((TypedArray) (attributeset)).getInt(com.facebook.R.styleable.com_facebook_like_view_com_facebook_style, Style.DEFAULT.getValue()));
	//   30   64:aload_0         
	//   31   65:aload_1         
	//   32   66:getstatic       #375 <Field int com.facebook.R$styleable.com_facebook_like_view_com_facebook_style>
	//   33   69:getstatic       #72  <Field LikeView$Style LikeView$Style.DEFAULT>
	//   34   72:invokestatic    #379 <Method int LikeView$Style.access$000(LikeView$Style)>
	//   35   75:invokevirtual   #368 <Method int TypedArray.getInt(int, int)>
	//   36   78:invokestatic    #382 <Method LikeView$Style LikeView$Style.fromInt(int)>
	//   37   81:putfield        #74  <Field LikeView$Style likeViewStyle>
			if(likeViewStyle == null)
	//*  38   84:aload_0         
	//*  39   85:getfield        #74  <Field LikeView$Style likeViewStyle>
	//*  40   88:ifnonnull       102
				throw new IllegalArgumentException("Unsupported value for LikeView 'style'");
	//   41   91:new             #384 <Class IllegalArgumentException>
	//   42   94:dup             
	//   43   95:ldc2            #386 <String "Unsupported value for LikeView 'style'">
	//   44   98:invokespecial   #387 <Method void IllegalArgumentException(String)>
	//   45  101:athrow          
			auxiliaryViewPosition = AuxiliaryViewPosition.fromInt(((TypedArray) (attributeset)).getInt(com.facebook.R.styleable.com_facebook_like_view_com_facebook_auxiliary_view_position, AuxiliaryViewPosition.DEFAULT.getValue()));
	//   46  102:aload_0         
	//   47  103:aload_1         
	//   48  104:getstatic       #390 <Field int com.facebook.R$styleable.com_facebook_like_view_com_facebook_auxiliary_view_position>
	//   49  107:getstatic       #80  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.DEFAULT>
	//   50  110:invokestatic    #394 <Method int LikeView$AuxiliaryViewPosition.access$100(LikeView$AuxiliaryViewPosition)>
	//   51  113:invokevirtual   #368 <Method int TypedArray.getInt(int, int)>
	//   52  116:invokestatic    #397 <Method LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.fromInt(int)>
	//   53  119:putfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
			if(auxiliaryViewPosition == null)
	//*  54  122:aload_0         
	//*  55  123:getfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//*  56  126:ifnonnull       140
				throw new IllegalArgumentException("Unsupported value for LikeView 'auxiliary_view_position'");
	//   57  129:new             #384 <Class IllegalArgumentException>
	//   58  132:dup             
	//   59  133:ldc2            #399 <String "Unsupported value for LikeView 'auxiliary_view_position'">
	//   60  136:invokespecial   #387 <Method void IllegalArgumentException(String)>
	//   61  139:athrow          
			horizontalAlignment = HorizontalAlignment.fromInt(((TypedArray) (attributeset)).getInt(com.facebook.R.styleable.com_facebook_like_view_com_facebook_horizontal_alignment, HorizontalAlignment.DEFAULT.getValue()));
	//   62  140:aload_0         
	//   63  141:aload_1         
	//   64  142:getstatic       #402 <Field int com.facebook.R$styleable.com_facebook_like_view_com_facebook_horizontal_alignment>
	//   65  145:getstatic       #76  <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.DEFAULT>
	//   66  148:invokestatic    #406 <Method int LikeView$HorizontalAlignment.access$200(LikeView$HorizontalAlignment)>
	//   67  151:invokevirtual   #368 <Method int TypedArray.getInt(int, int)>
	//   68  154:invokestatic    #409 <Method LikeView$HorizontalAlignment LikeView$HorizontalAlignment.fromInt(int)>
	//   69  157:putfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
			if(horizontalAlignment == null)
	//*  70  160:aload_0         
	//*  71  161:getfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//*  72  164:ifnonnull       178
			{
				throw new IllegalArgumentException("Unsupported value for LikeView 'horizontal_alignment'");
	//   73  167:new             #384 <Class IllegalArgumentException>
	//   74  170:dup             
	//   75  171:ldc2            #411 <String "Unsupported value for LikeView 'horizontal_alignment'">
	//   76  174:invokespecial   #387 <Method void IllegalArgumentException(String)>
	//   77  177:athrow          
			} else
			{
				foregroundColor = ((TypedArray) (attributeset)).getColor(com.facebook.R.styleable.com_facebook_like_view_com_facebook_foreground_color, -1);
	//   78  178:aload_0         
	//   79  179:aload_1         
	//   80  180:getstatic       #414 <Field int com.facebook.R$styleable.com_facebook_like_view_com_facebook_foreground_color>
	//   81  183:iconst_m1       
	//   82  184:invokevirtual   #416 <Method int TypedArray.getColor(int, int)>
	//   83  187:putfield        #84  <Field int foregroundColor>
				((TypedArray) (attributeset)).recycle();
	//   84  190:aload_1         
	//   85  191:invokevirtual   #419 <Method void TypedArray.recycle()>
				return;
	//   86  194:return          
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
	//    1    1:invokespecial   #422 <Method void tearDownObjectAssociations()>
		objectId = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #121 <Field String objectId>
		objectType = objecttype;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #133 <Field LikeView$ObjectType objectType>
		if(Utility.isNullOrEmpty(s))
	//*   8   14:aload_1         
	//*   9   15:invokestatic    #426 <Method boolean Utility.isNullOrEmpty(String)>
	//*  10   18:ifeq            22
			return;
	//   11   21:return          
		creationCallback = new LikeActionControllerCreationCallback();
	//   12   22:aload_0         
	//   13   23:new             #16  <Class LikeView$LikeActionControllerCreationCallback>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:invokespecial   #427 <Method void LikeView$LikeActionControllerCreationCallback(LikeView, LikeView$1)>
	//   18   32:putfield        #111 <Field LikeView$LikeActionControllerCreationCallback creationCallback>
		if(!isInEditMode())
	//*  19   35:aload_0         
	//*  20   36:invokevirtual   #430 <Method boolean isInEditMode()>
	//*  21   39:ifne            51
			LikeActionController.getControllerForObjectId(s, objecttype, ((com.facebook.share.internal.LikeActionController.CreationCallback) (creationCallback)));
	//   22   42:aload_1         
	//   23   43:aload_2         
	//   24   44:aload_0         
	//   25   45:getfield        #111 <Field LikeView$LikeActionControllerCreationCallback creationCallback>
	//   26   48:invokestatic    #434 <Method void LikeActionController.getControllerForObjectId(String, LikeView$ObjectType, com.facebook.share.internal.LikeActionController$CreationCallback)>
	//   27   51:return          
	}

	private void tearDownObjectAssociations()
	{
		if(broadcastReceiver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field BroadcastReceiver broadcastReceiver>
	//*   2    4:ifnull          26
		{
			LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(broadcastReceiver);
	//    3    7:aload_0         
	//    4    8:invokevirtual   #144 <Method Context getContext()>
	//    5   11:invokestatic    #150 <Method LocalBroadcastManager LocalBroadcastManager.getInstance(Context)>
	//    6   14:aload_0         
	//    7   15:getfield        #140 <Field BroadcastReceiver broadcastReceiver>
	//    8   18:invokevirtual   #438 <Method void LocalBroadcastManager.unregisterReceiver(BroadcastReceiver)>
			broadcastReceiver = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #140 <Field BroadcastReceiver broadcastReceiver>
		}
		if(creationCallback != null)
	//*  12   26:aload_0         
	//*  13   27:getfield        #111 <Field LikeView$LikeActionControllerCreationCallback creationCallback>
	//*  14   30:ifnull          45
		{
			creationCallback.cancel();
	//   15   33:aload_0         
	//   16   34:getfield        #111 <Field LikeView$LikeActionControllerCreationCallback creationCallback>
	//   17   37:invokevirtual   #441 <Method void LikeView$LikeActionControllerCreationCallback.cancel()>
			creationCallback = null;
	//   18   40:aload_0         
	//   19   41:aconst_null     
	//   20   42:putfield        #111 <Field LikeView$LikeActionControllerCreationCallback creationCallback>
		}
		likeActionController = null;
	//   21   45:aload_0         
	//   22   46:aconst_null     
	//   23   47:putfield        #135 <Field LikeActionController likeActionController>
	//   24   50:return          
	}

	private void toggleLike()
	{
		if(likeActionController != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field LikeActionController likeActionController>
	//*   2    4:ifnull          37
		{
			Activity activity = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
			if(parentFragment == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #443 <Field Fragment parentFragment>
	//*   7   13:ifnonnull       21
				activity = getActivity();
	//    8   16:aload_0         
	//    9   17:invokespecial   #445 <Method Activity getActivity()>
	//   10   20:astore_1        
			likeActionController.toggleLike(activity, parentFragment, getAnalyticsParameters());
	//   11   21:aload_0         
	//   12   22:getfield        #135 <Field LikeActionController likeActionController>
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #443 <Field Fragment parentFragment>
	//   16   30:aload_0         
	//   17   31:invokespecial   #447 <Method Bundle getAnalyticsParameters()>
	//   18   34:invokevirtual   #450 <Method void LikeActionController.toggleLike(Activity, Fragment, Bundle)>
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
	//*   0    0:getstatic       #454 <Field int[] LikeView$2.$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
	//*   1    3:aload_0         
	//*   2    4:getfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//*   3    7:invokevirtual   #457 <Method int LikeView$AuxiliaryViewPosition.ordinal()>
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
	//    8   38:getfield        #284 <Field LikeBoxCountView likeBoxCountView>
	//    9   41:astore_2        
			com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition likeboxcountviewcaretposition;
			if(horizontalAlignment == HorizontalAlignment.RIGHT)
	//*  10   42:aload_0         
	//*  11   43:getfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//*  12   46:getstatic       #460 <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.RIGHT>
	//*  13   49:if_acmpne       59
				likeboxcountviewcaretposition = com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.RIGHT;
	//   14   52:getstatic       #465 <Field com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition.RIGHT>
	//   15   55:astore_1        
			else
	//*  16   56:goto            63
				likeboxcountviewcaretposition = com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.LEFT;
	//   17   59:getstatic       #468 <Field com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition.LEFT>
	//   18   62:astore_1        
			likeboxcountview.setCaretPosition(likeboxcountviewcaretposition);
	//   19   63:aload_2         
	//   20   64:aload_1         
	//   21   65:invokevirtual   #472 <Method void LikeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition)>
			return;
	//   22   68:return          

		case 2: // '\002'
			likeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.TOP);
	//   23   69:aload_0         
	//   24   70:getfield        #284 <Field LikeBoxCountView likeBoxCountView>
	//   25   73:getstatic       #475 <Field com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition.TOP>
	//   26   76:invokevirtual   #472 <Method void LikeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition)>
			return;
	//   27   79:return          

		case 1: // '\001'
			likeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView.LikeBoxCountViewCaretPosition.BOTTOM);
	//   28   80:aload_0         
	//   29   81:getfield        #284 <Field LikeBoxCountView likeBoxCountView>
	//   30   84:getstatic       #478 <Field com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition.BOTTOM>
	//   31   87:invokevirtual   #472 <Method void LikeBoxCountView.setCaretPosition(com.facebook.share.internal.LikeBoxCountView$LikeBoxCountViewCaretPosition)>
			return;
	//   32   90:return          
		}
	}

	private void updateLayout()
	{
label0:
		{
			Object obj = ((Object) ((android.widget.FrameLayout.LayoutParams)containerView.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field LinearLayout containerView>
	//    2    4:invokevirtual   #483 <Method android.view.ViewGroup$LayoutParams LinearLayout.getLayoutParams()>
	//    3    7:checkcast       #258 <Class android.widget.FrameLayout$LayoutParams>
	//    4   10:astore_3        
			Object obj1 = ((Object) ((android.widget.LinearLayout.LayoutParams)likeButton.getLayoutParams()));
	//    5   11:aload_0         
	//    6   12:getfield        #276 <Field LikeButton likeButton>
	//    7   15:invokevirtual   #484 <Method android.view.ViewGroup$LayoutParams LikeButton.getLayoutParams()>
	//    8   18:checkcast       #304 <Class android.widget.LinearLayout$LayoutParams>
	//    9   21:astore          4
			int i;
			if(horizontalAlignment == HorizontalAlignment.LEFT)
	//*  10   23:aload_0         
	//*  11   24:getfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//*  12   27:getstatic       #486 <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.LEFT>
	//*  13   30:if_acmpne       38
				i = 3;
	//   14   33:iconst_3        
	//   15   34:istore_1        
			else
	//*  16   35:goto            55
			if(horizontalAlignment == HorizontalAlignment.CENTER)
	//*  17   38:aload_0         
	//*  18   39:getfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//*  19   42:getstatic       #489 <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.CENTER>
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
	//   30   60:putfield        #492 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			obj1.gravity = i;
	//   31   63:aload           4
	//   32   65:iload_1         
	//   33   66:putfield        #493 <Field int android.widget.LinearLayout$LayoutParams.gravity>
			socialSentenceView.setVisibility(8);
	//   34   69:aload_0         
	//   35   70:getfield        #282 <Field TextView socialSentenceView>
	//   36   73:bipush          8
	//   37   75:invokevirtual   #496 <Method void TextView.setVisibility(int)>
			likeBoxCountView.setVisibility(8);
	//   38   78:aload_0         
	//   39   79:getfield        #284 <Field LikeBoxCountView likeBoxCountView>
	//   40   82:bipush          8
	//   41   84:invokevirtual   #497 <Method void LikeBoxCountView.setVisibility(int)>
			if(likeViewStyle == Style.STANDARD && likeActionController != null && !Utility.isNullOrEmpty(likeActionController.getSocialSentence()))
	//*  42   87:aload_0         
	//*  43   88:getfield        #74  <Field LikeView$Style likeViewStyle>
	//*  44   91:getstatic       #500 <Field LikeView$Style LikeView$Style.STANDARD>
	//*  45   94:if_acmpne       125
	//*  46   97:aload_0         
	//*  47   98:getfield        #135 <Field LikeActionController likeActionController>
	//*  48  101:ifnull          125
	//*  49  104:aload_0         
	//*  50  105:getfield        #135 <Field LikeActionController likeActionController>
	//*  51  108:invokevirtual   #503 <Method String LikeActionController.getSocialSentence()>
	//*  52  111:invokestatic    #426 <Method boolean Utility.isNullOrEmpty(String)>
	//*  53  114:ifne            125
			{
				obj = ((Object) (socialSentenceView));
	//   54  117:aload_0         
	//   55  118:getfield        #282 <Field TextView socialSentenceView>
	//   56  121:astore_3        
			} else
	//*  57  122:goto            164
			{
				if(likeViewStyle != Style.BOX_COUNT || likeActionController == null || Utility.isNullOrEmpty(likeActionController.getLikeCountString()))
					break label0;
	//   58  125:aload_0         
	//   59  126:getfield        #74  <Field LikeView$Style likeViewStyle>
	//   60  129:getstatic       #506 <Field LikeView$Style LikeView$Style.BOX_COUNT>
	//   61  132:if_acmpne       419
	//   62  135:aload_0         
	//   63  136:getfield        #135 <Field LikeActionController likeActionController>
	//   64  139:ifnull          419
	//   65  142:aload_0         
	//   66  143:getfield        #135 <Field LikeActionController likeActionController>
	//   67  146:invokevirtual   #509 <Method String LikeActionController.getLikeCountString()>
	//   68  149:invokestatic    #426 <Method boolean Utility.isNullOrEmpty(String)>
	//   69  152:ifne            419
				updateBoxCountCaretPosition();
	//   70  155:aload_0         
	//   71  156:invokespecial   #511 <Method void updateBoxCountCaretPosition()>
				obj = ((Object) (likeBoxCountView));
	//   72  159:aload_0         
	//   73  160:getfield        #284 <Field LikeBoxCountView likeBoxCountView>
	//   74  163:astore_3        
			}
			boolean flag = false;
	//   75  164:iconst_0        
	//   76  165:istore_2        
			((View) (obj)).setVisibility(0);
	//   77  166:aload_3         
	//   78  167:iconst_0        
	//   79  168:invokevirtual   #514 <Method void View.setVisibility(int)>
			((android.widget.LinearLayout.LayoutParams)((View) (obj)).getLayoutParams()).gravity = i;
	//   80  171:aload_3         
	//   81  172:invokevirtual   #515 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   82  175:checkcast       #304 <Class android.widget.LinearLayout$LayoutParams>
	//   83  178:iload_1         
	//   84  179:putfield        #493 <Field int android.widget.LinearLayout$LayoutParams.gravity>
			obj1 = ((Object) (containerView));
	//   85  182:aload_0         
	//   86  183:getfield        #256 <Field LinearLayout containerView>
	//   87  186:astore          4
			if(auxiliaryViewPosition == AuxiliaryViewPosition.INLINE)
	//*  88  188:aload_0         
	//*  89  189:getfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//*  90  192:getstatic       #518 <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.INLINE>
	//*  91  195:if_acmpne       203
				i = ((int) (flag));
	//   92  198:iload_2         
	//   93  199:istore_1        
			else
	//*  94  200:goto            205
				i = 1;
	//   95  203:iconst_1        
	//   96  204:istore_1        
			((LinearLayout) (obj1)).setOrientation(i);
	//   97  205:aload           4
	//   98  207:iload_1         
	//   99  208:invokevirtual   #521 <Method void LinearLayout.setOrientation(int)>
			if(auxiliaryViewPosition != AuxiliaryViewPosition.TOP && (auxiliaryViewPosition != AuxiliaryViewPosition.INLINE || horizontalAlignment != HorizontalAlignment.RIGHT))
	//* 100  211:aload_0         
	//* 101  212:getfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//* 102  215:getstatic       #523 <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.TOP>
	//* 103  218:if_acmpeq       263
	//* 104  221:aload_0         
	//* 105  222:getfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//* 106  225:getstatic       #518 <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.INLINE>
	//* 107  228:if_acmpne       244
	//* 108  231:aload_0         
	//* 109  232:getfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//* 110  235:getstatic       #460 <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.RIGHT>
	//* 111  238:if_acmpne       244
	//* 112  241:goto            263
			{
				containerView.removeView(((View) (obj)));
	//  113  244:aload_0         
	//  114  245:getfield        #256 <Field LinearLayout containerView>
	//  115  248:aload_3         
	//  116  249:invokevirtual   #526 <Method void LinearLayout.removeView(View)>
				containerView.addView(((View) (obj)));
	//  117  252:aload_0         
	//  118  253:getfield        #256 <Field LinearLayout containerView>
	//  119  256:aload_3         
	//  120  257:invokevirtual   #280 <Method void LinearLayout.addView(View)>
			} else
	//* 121  260:goto            285
			{
				containerView.removeView(((View) (likeButton)));
	//  122  263:aload_0         
	//  123  264:getfield        #256 <Field LinearLayout containerView>
	//  124  267:aload_0         
	//  125  268:getfield        #276 <Field LikeButton likeButton>
	//  126  271:invokevirtual   #526 <Method void LinearLayout.removeView(View)>
				containerView.addView(((View) (likeButton)));
	//  127  274:aload_0         
	//  128  275:getfield        #256 <Field LinearLayout containerView>
	//  129  278:aload_0         
	//  130  279:getfield        #276 <Field LikeButton likeButton>
	//  131  282:invokevirtual   #280 <Method void LinearLayout.addView(View)>
			}
			switch(_cls2..SwitchMap.com.facebook.share.widget.LikeView.AuxiliaryViewPosition[auxiliaryViewPosition.ordinal()])
	//* 132  285:getstatic       #454 <Field int[] LikeView$2.$SwitchMap$com$facebook$share$widget$LikeView$AuxiliaryViewPosition>
	//* 133  288:aload_0         
	//* 134  289:getfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//* 135  292:invokevirtual   #457 <Method int LikeView$AuxiliaryViewPosition.ordinal()>
	//* 136  295:iaload          
			{
	//* 137  296:tableswitch     1 3: default 324
	//	               1 398
	//	               2 377
	//	               3 325
			default:
				return;
	//  138  324:return          

			case 3: // '\003'
				if(horizontalAlignment == HorizontalAlignment.RIGHT)
	//* 139  325:aload_0         
	//* 140  326:getfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//* 141  329:getstatic       #460 <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.RIGHT>
	//* 142  332:if_acmpne       356
				{
					((View) (obj)).setPadding(edgePadding, edgePadding, internalPadding, edgePadding);
	//  143  335:aload_3         
	//  144  336:aload_0         
	//  145  337:getfield        #234 <Field int edgePadding>
	//  146  340:aload_0         
	//  147  341:getfield        #234 <Field int edgePadding>
	//  148  344:aload_0         
	//  149  345:getfield        #239 <Field int internalPadding>
	//  150  348:aload_0         
	//  151  349:getfield        #234 <Field int edgePadding>
	//  152  352:invokevirtual   #530 <Method void View.setPadding(int, int, int, int)>
					return;
	//  153  355:return          
				} else
				{
					((View) (obj)).setPadding(internalPadding, edgePadding, edgePadding, edgePadding);
	//  154  356:aload_3         
	//  155  357:aload_0         
	//  156  358:getfield        #239 <Field int internalPadding>
	//  157  361:aload_0         
	//  158  362:getfield        #234 <Field int edgePadding>
	//  159  365:aload_0         
	//  160  366:getfield        #234 <Field int edgePadding>
	//  161  369:aload_0         
	//  162  370:getfield        #234 <Field int edgePadding>
	//  163  373:invokevirtual   #530 <Method void View.setPadding(int, int, int, int)>
					return;
	//  164  376:return          
				}

			case 2: // '\002'
				((View) (obj)).setPadding(edgePadding, internalPadding, edgePadding, edgePadding);
	//  165  377:aload_3         
	//  166  378:aload_0         
	//  167  379:getfield        #234 <Field int edgePadding>
	//  168  382:aload_0         
	//  169  383:getfield        #239 <Field int internalPadding>
	//  170  386:aload_0         
	//  171  387:getfield        #234 <Field int edgePadding>
	//  172  390:aload_0         
	//  173  391:getfield        #234 <Field int edgePadding>
	//  174  394:invokevirtual   #530 <Method void View.setPadding(int, int, int, int)>
				return;
	//  175  397:return          

			case 1: // '\001'
				((View) (obj)).setPadding(edgePadding, edgePadding, edgePadding, internalPadding);
	//  176  398:aload_3         
	//  177  399:aload_0         
	//  178  400:getfield        #234 <Field int edgePadding>
	//  179  403:aload_0         
	//  180  404:getfield        #234 <Field int edgePadding>
	//  181  407:aload_0         
	//  182  408:getfield        #234 <Field int edgePadding>
	//  183  411:aload_0         
	//  184  412:getfield        #239 <Field int internalPadding>
	//  185  415:invokevirtual   #530 <Method void View.setPadding(int, int, int, int)>
				return;
	//  186  418:return          
			}
		}
	//  187  419:return          
	}

	private void updateLikeStateAndLayout()
	{
		boolean flag = explicitlyDisabled ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #532 <Field boolean explicitlyDisabled>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:istore_1        
		if(likeActionController == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #135 <Field LikeActionController likeActionController>
	//*   7   11:ifnonnull       41
		{
			likeButton.setSelected(false);
	//    8   14:aload_0         
	//    9   15:getfield        #276 <Field LikeButton likeButton>
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #536 <Method void LikeButton.setSelected(boolean)>
			socialSentenceView.setText(((CharSequence) (null)));
	//   12   22:aload_0         
	//   13   23:getfield        #282 <Field TextView socialSentenceView>
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #540 <Method void TextView.setText(CharSequence)>
			likeBoxCountView.setText(((String) (null)));
	//   16   30:aload_0         
	//   17   31:getfield        #284 <Field LikeBoxCountView likeBoxCountView>
	//   18   34:aconst_null     
	//   19   35:invokevirtual   #542 <Method void LikeBoxCountView.setText(String)>
		} else
	//*  20   38:goto            93
		{
			likeButton.setSelected(likeActionController.isObjectLiked());
	//   21   41:aload_0         
	//   22   42:getfield        #276 <Field LikeButton likeButton>
	//   23   45:aload_0         
	//   24   46:getfield        #135 <Field LikeActionController likeActionController>
	//   25   49:invokevirtual   #291 <Method boolean LikeActionController.isObjectLiked()>
	//   26   52:invokevirtual   #536 <Method void LikeButton.setSelected(boolean)>
			socialSentenceView.setText(((CharSequence) (likeActionController.getSocialSentence())));
	//   27   55:aload_0         
	//   28   56:getfield        #282 <Field TextView socialSentenceView>
	//   29   59:aload_0         
	//   30   60:getfield        #135 <Field LikeActionController likeActionController>
	//   31   63:invokevirtual   #503 <Method String LikeActionController.getSocialSentence()>
	//   32   66:invokevirtual   #540 <Method void TextView.setText(CharSequence)>
			likeBoxCountView.setText(likeActionController.getLikeCountString());
	//   33   69:aload_0         
	//   34   70:getfield        #284 <Field LikeBoxCountView likeBoxCountView>
	//   35   73:aload_0         
	//   36   74:getfield        #135 <Field LikeActionController likeActionController>
	//   37   77:invokevirtual   #509 <Method String LikeActionController.getLikeCountString()>
	//   38   80:invokevirtual   #542 <Method void LikeBoxCountView.setText(String)>
			flag &= likeActionController.shouldEnableView();
	//   39   83:iload_1         
	//   40   84:aload_0         
	//   41   85:getfield        #135 <Field LikeActionController likeActionController>
	//   42   88:invokevirtual   #545 <Method boolean LikeActionController.shouldEnableView()>
	//   43   91:iand            
	//   44   92:istore_1        
		}
		super.setEnabled(flag);
	//   45   93:aload_0         
	//   46   94:iload_1         
	//   47   95:invokespecial   #548 <Method void FrameLayout.setEnabled(boolean)>
		likeButton.setEnabled(flag);
	//   48   98:aload_0         
	//   49   99:getfield        #276 <Field LikeButton likeButton>
	//   50  102:iload_1         
	//   51  103:invokevirtual   #549 <Method void LikeButton.setEnabled(boolean)>
		updateLayout();
	//   52  106:aload_0         
	//   53  107:invokespecial   #551 <Method void updateLayout()>
	//   54  110:return          
	}

	public OnErrorListener getOnErrorListener()
	{
		return onErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field LikeView$OnErrorListener onErrorListener>
	//    2    4:areturn         
	}

	protected void onDetachedFromWindow()
	{
		setObjectIdAndType(((String) (null)), ObjectType.UNKNOWN);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:getstatic       #557 <Field LikeView$ObjectType LikeView$ObjectType.UNKNOWN>
	//    3    5:invokevirtual   #560 <Method void setObjectIdAndType(String, LikeView$ObjectType)>
		super.onDetachedFromWindow();
	//    4    8:aload_0         
	//    5    9:invokespecial   #562 <Method void FrameLayout.onDetachedFromWindow()>
	//    6   12:return          
	}

	public void setAuxiliaryViewPosition(AuxiliaryViewPosition auxiliaryviewposition)
	{
		if(auxiliaryviewposition == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            11
			auxiliaryviewposition = AuxiliaryViewPosition.DEFAULT;
	//    3    7:getstatic       #80  <Field LikeView$AuxiliaryViewPosition LikeView$AuxiliaryViewPosition.DEFAULT>
	//    4   10:astore_1        
		if(auxiliaryViewPosition != auxiliaryviewposition)
	//*   5   11:aload_0         
	//*   6   12:getfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
	//*   7   15:aload_1         
	//*   8   16:if_acmpeq       28
		{
			auxiliaryViewPosition = auxiliaryviewposition;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #82  <Field LikeView$AuxiliaryViewPosition auxiliaryViewPosition>
			updateLayout();
	//   12   24:aload_0         
	//   13   25:invokespecial   #551 <Method void updateLayout()>
		}
	//   14   28:return          
	}

	public void setEnabled(boolean flag)
	{
		explicitlyDisabled = flag ^ true;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:ixor            
	//    4    4:putfield        #532 <Field boolean explicitlyDisabled>
		updateLikeStateAndLayout();
	//    5    7:aload_0         
	//    6    8:invokespecial   #125 <Method void updateLikeStateAndLayout()>
	//    7   11:return          
	}

	public void setForegroundColor(int i)
	{
		if(foregroundColor != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field int foregroundColor>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          16
			socialSentenceView.setTextColor(i);
	//    4    8:aload_0         
	//    5    9:getfield        #282 <Field TextView socialSentenceView>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #330 <Method void TextView.setTextColor(int)>
	//    8   16:return          
	}

	public void setFragment(Fragment fragment)
	{
		parentFragment = fragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #443 <Field Fragment parentFragment>
	//    3    5:return          
	}

	public void setHorizontalAlignment(HorizontalAlignment horizontalalignment)
	{
		if(horizontalalignment == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          7
	//*   2    4:goto            11
			horizontalalignment = HorizontalAlignment.DEFAULT;
	//    3    7:getstatic       #76  <Field LikeView$HorizontalAlignment LikeView$HorizontalAlignment.DEFAULT>
	//    4   10:astore_1        
		if(horizontalAlignment != horizontalalignment)
	//*   5   11:aload_0         
	//*   6   12:getfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
	//*   7   15:aload_1         
	//*   8   16:if_acmpeq       28
		{
			horizontalAlignment = horizontalalignment;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #78  <Field LikeView$HorizontalAlignment horizontalAlignment>
			updateLayout();
	//   12   24:aload_0         
	//   13   25:invokespecial   #551 <Method void updateLayout()>
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
	//    3    7:getstatic       #72  <Field LikeView$Style LikeView$Style.DEFAULT>
	//    4   10:astore_1        
		if(likeViewStyle != style)
	//*   5   11:aload_0         
	//*   6   12:getfield        #74  <Field LikeView$Style likeViewStyle>
	//*   7   15:aload_1         
	//*   8   16:if_acmpeq       28
		{
			likeViewStyle = style;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #74  <Field LikeView$Style likeViewStyle>
			updateLayout();
	//   12   24:aload_0         
	//   13   25:invokespecial   #551 <Method void updateLayout()>
		}
	//   14   28:return          
	}

	public void setObjectIdAndType(String s, ObjectType objecttype)
	{
		s = Utility.coerceValueIfNullOrEmpty(s, ((String) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #214 <Method String Utility.coerceValueIfNullOrEmpty(String, String)>
	//    3    5:astore_1        
		if(objecttype == null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          13
	//*   6   10:goto            17
			objecttype = ObjectType.DEFAULT;
	//    7   13:getstatic       #360 <Field LikeView$ObjectType LikeView$ObjectType.DEFAULT>
	//    8   16:astore_2        
		if(!Utility.areObjectsEqual(((Object) (s)), ((Object) (objectId))) || objecttype != objectType)
	//*   9   17:aload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #121 <Field String objectId>
	//*  12   22:invokestatic    #575 <Method boolean Utility.areObjectsEqual(Object, Object)>
	//*  13   25:ifeq            36
	//*  14   28:aload_2         
	//*  15   29:aload_0         
	//*  16   30:getfield        #133 <Field LikeView$ObjectType objectType>
	//*  17   33:if_acmpeq       46
		{
			setObjectIdAndTypeForced(s, objecttype);
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:invokespecial   #101 <Method void setObjectIdAndTypeForced(String, LikeView$ObjectType)>
			updateLikeStateAndLayout();
	//   22   42:aload_0         
	//   23   43:invokespecial   #125 <Method void updateLikeStateAndLayout()>
		}
	//   24   46:return          
	}

	public void setOnErrorListener(OnErrorListener onerrorlistener)
	{
		onErrorListener = onerrorlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field LikeView$OnErrorListener onErrorListener>
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
	private Fragment parentFragment;
	private TextView socialSentenceView;


/*
	static void access$1000(LikeView likeview, String s, ObjectType objecttype)
	{
		likeview.setObjectIdAndTypeForced(s, objecttype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #101 <Method void setObjectIdAndTypeForced(String, LikeView$ObjectType)>
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
	//    2    2:invokespecial   #107 <Method void associateWithLikeActionController(LikeActionController)>
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
	//    2    2:putfield        #111 <Field LikeView$LikeActionControllerCreationCallback creationCallback>
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
	//    1    1:invokespecial   #117 <Method void toggleLike()>
		return;
	//    2    4:return          
	}

*/


/*
	static String access$600(LikeView likeview)
	{
		return likeview.objectId;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field String objectId>
	//    2    4:areturn         
	}

*/


/*
	static void access$700(LikeView likeview)
	{
		likeview.updateLikeStateAndLayout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #125 <Method void updateLikeStateAndLayout()>
		return;
	//    2    4:return          
	}

*/


/*
	static OnErrorListener access$800(LikeView likeview)
	{
		return likeview.onErrorListener;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field LikeView$OnErrorListener onErrorListener>
	//    2    4:areturn         
	}

*/


/*
	static ObjectType access$900(LikeView likeview)
	{
		return likeview.objectType;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field LikeView$ObjectType objectType>
	//    2    4:areturn         
	}

*/
}
