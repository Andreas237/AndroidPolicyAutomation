// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.*;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.design.animation.AnimationUtils;
import android.support.design.animation.AnimatorSetCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.Space;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.AppCompatTextView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

final class IndicatorViewController
{

	public IndicatorViewController(TextInputLayout textinputlayout)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Object()>
		context = textinputlayout.getContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #61  <Method Context TextInputLayout.getContext()>
	//    5    9:putfield        #63  <Field Context context>
		textInputView = textinputlayout;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:putfield        #65  <Field TextInputLayout textInputView>
		captionTranslationYPx = context.getResources().getDimensionPixelSize(android.support.design.R.dimen.design_textinput_caption_translate_y);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #63  <Field Context context>
	//   12   22:invokevirtual   #71  <Method Resources Context.getResources()>
	//   13   25:getstatic       #76  <Field int android.support.design.R$dimen.design_textinput_caption_translate_y>
	//   14   28:invokevirtual   #82  <Method int Resources.getDimensionPixelSize(int)>
	//   15   31:i2f             
	//   16   32:putfield        #84  <Field float captionTranslationYPx>
	//   17   35:return          
	}

	private boolean canAdjustIndicatorPadding()
	{
		return indicatorArea != null && textInputView.getEditText() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field LinearLayout indicatorArea>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #65  <Field TextInputLayout textInputView>
	//    5   11:invokevirtual   #105 <Method android.widget.EditText TextInputLayout.getEditText()>
	//    6   14:ifnull          19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private void createCaptionAnimators(List list, boolean flag, TextView textview, int i, int j, int k)
	{
		if(textview != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          70
		{
			if(!flag)
	//*   2    4:iload_2         
	//*   3    5:ifne            9
				return;
	//    4    8:return          
			if(i == k || i == j)
	//*   5    9:iload           4
	//*   6   11:iload           6
	//*   7   13:icmpeq          23
	//*   8   16:iload           4
	//*   9   18:iload           5
	//*  10   20:icmpne          69
			{
				if(k == i)
	//*  11   23:iload           6
	//*  12   25:iload           4
	//*  13   27:icmpne          35
					flag = true;
	//   14   30:iconst_1        
	//   15   31:istore_2        
				else
	//*  16   32:goto            37
					flag = false;
	//   17   35:iconst_0        
	//   18   36:istore_2        
				list.add(((Object) (createCaptionOpacityAnimator(textview, flag))));
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:iload_2         
	//   23   41:invokespecial   #111 <Method ObjectAnimator createCaptionOpacityAnimator(TextView, boolean)>
	//   24   44:invokeinterface #117 <Method boolean List.add(Object)>
	//   25   49:pop             
				if(k == i)
	//*  26   50:iload           6
	//*  27   52:iload           4
	//*  28   54:icmpne          69
					list.add(((Object) (createCaptionTranslationYAnimator(textview))));
	//   29   57:aload_1         
	//   30   58:aload_0         
	//   31   59:aload_3         
	//   32   60:invokespecial   #121 <Method ObjectAnimator createCaptionTranslationYAnimator(TextView)>
	//   33   63:invokeinterface #117 <Method boolean List.add(Object)>
	//   34   68:pop             
			}
			return;
	//   35   69:return          
		} else
		{
			return;
	//   36   70:return          
		}
	}

	private ObjectAnimator createCaptionOpacityAnimator(TextView textview, boolean flag)
	{
		float f;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            9
			f = 1.0F;
	//    2    4:fconst_1        
	//    3    5:fstore_3        
		else
	//*   4    6:goto            11
			f = 0.0F;
	//    5    9:fconst_0        
	//    6   10:fstore_3        
		textview = ((TextView) (ObjectAnimator.ofFloat(((Object) (textview)), View.ALPHA, new float[] {
			f
		})));
	//    7   11:aload_1         
	//    8   12:getstatic       #129 <Field android.util.Property View.ALPHA>
	//    9   15:iconst_1        
	//   10   16:newarray        float[]
	//   11   18:dup             
	//   12   19:iconst_0        
	//   13   20:fload_3         
	//   14   21:fastore         
	//   15   22:invokestatic    #135 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   16   25:astore_1        
		((ObjectAnimator) (textview)).setDuration(167L);
	//   17   26:aload_1         
	//   18   27:ldc2w           #136 <Long 167L>
	//   19   30:invokevirtual   #141 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   20   33:pop             
		((ObjectAnimator) (textview)).setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
	//   21   34:aload_1         
	//   22   35:getstatic       #147 <Field android.animation.TimeInterpolator AnimationUtils.LINEAR_INTERPOLATOR>
	//   23   38:invokevirtual   #151 <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
		return ((ObjectAnimator) (textview));
	//   24   41:aload_1         
	//   25   42:areturn         
	}

	private ObjectAnimator createCaptionTranslationYAnimator(TextView textview)
	{
		textview = ((TextView) (ObjectAnimator.ofFloat(((Object) (textview)), View.TRANSLATION_Y, new float[] {
			-captionTranslationYPx, 0.0F
		})));
	//    0    0:aload_1         
	//    1    1:getstatic       #154 <Field android.util.Property View.TRANSLATION_Y>
	//    2    4:iconst_2        
	//    3    5:newarray        float[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:getfield        #84  <Field float captionTranslationYPx>
	//    8   13:fneg            
	//    9   14:fastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:fconst_0        
	//   13   18:fastore         
	//   14   19:invokestatic    #135 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, android.util.Property, float[])>
	//   15   22:astore_1        
		((ObjectAnimator) (textview)).setDuration(217L);
	//   16   23:aload_1         
	//   17   24:ldc2w           #155 <Long 217L>
	//   18   27:invokevirtual   #141 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   19   30:pop             
		((ObjectAnimator) (textview)).setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
	//   20   31:aload_1         
	//   21   32:getstatic       #159 <Field android.animation.TimeInterpolator AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR>
	//   22   35:invokevirtual   #151 <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
		return ((ObjectAnimator) (textview));
	//   23   38:aload_1         
	//   24   39:areturn         
	}

	private TextView getCaptionViewFromDisplayState(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 2: default 24
	//	               1 31
	//	               2 26
		default:
			return null;
	//    2   24:aconst_null     
	//    3   25:areturn         

		case 2: // '\002'
			return helperTextView;
	//    4   26:aload_0         
	//    5   27:getfield        #163 <Field TextView helperTextView>
	//    6   30:areturn         

		case 1: // '\001'
			return errorView;
	//    7   31:aload_0         
	//    8   32:getfield        #97  <Field TextView errorView>
	//    9   35:areturn         
		}
	}

	private boolean isCaptionStateError(int i)
	{
		return i == 1 && errorView != null && !TextUtils.isEmpty(errorText);
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:icmpne          24
	//    3    5:aload_0         
	//    4    6:getfield        #97  <Field TextView errorView>
	//    5    9:ifnull          24
	//    6   12:aload_0         
	//    7   13:getfield        #168 <Field CharSequence errorText>
	//    8   16:invokestatic    #174 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    9   19:ifne            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private boolean isCaptionStateHelperText(int i)
	{
		return i == 2 && helperTextView != null && !TextUtils.isEmpty(helperText);
	//    0    0:iload_1         
	//    1    1:iconst_2        
	//    2    2:icmpne          24
	//    3    5:aload_0         
	//    4    6:getfield        #163 <Field TextView helperTextView>
	//    5    9:ifnull          24
	//    6   12:aload_0         
	//    7   13:getfield        #177 <Field CharSequence helperText>
	//    8   16:invokestatic    #174 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    9   19:ifne            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private void setCaptionViewVisibilities(int i, int j)
	{
		if(i == j)
	//*   0    0:iload_1         
	//*   1    1:iload_2         
	//*   2    2:icmpne          6
			return;
	//    3    5:return          
		if(j != 0)
	//*   4    6:iload_2         
	//*   5    7:ifeq            30
		{
			TextView textview = getCaptionViewFromDisplayState(j);
	//    6   10:aload_0         
	//    7   11:iload_2         
	//    8   12:invokespecial   #181 <Method TextView getCaptionViewFromDisplayState(int)>
	//    9   15:astore_3        
			if(textview != null)
	//*  10   16:aload_3         
	//*  11   17:ifnull          30
			{
				textview.setVisibility(0);
	//   12   20:aload_3         
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #187 <Method void TextView.setVisibility(int)>
				textview.setAlpha(1.0F);
	//   15   25:aload_3         
	//   16   26:fconst_1        
	//   17   27:invokevirtual   #191 <Method void TextView.setAlpha(float)>
			}
		}
		if(i != 0)
	//*  18   30:iload_1         
	//*  19   31:ifeq            59
		{
			TextView textview1 = getCaptionViewFromDisplayState(i);
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:invokespecial   #181 <Method TextView getCaptionViewFromDisplayState(int)>
	//   23   39:astore_3        
			if(textview1 != null)
	//*  24   40:aload_3         
	//*  25   41:ifnull          59
			{
				textview1.setVisibility(4);
	//   26   44:aload_3         
	//   27   45:iconst_4        
	//   28   46:invokevirtual   #187 <Method void TextView.setVisibility(int)>
				if(i == 1)
	//*  29   49:iload_1         
	//*  30   50:iconst_1        
	//*  31   51:icmpne          59
					textview1.setText(((CharSequence) (null)));
	//   32   54:aload_3         
	//   33   55:aconst_null     
	//   34   56:invokevirtual   #195 <Method void TextView.setText(CharSequence)>
			}
		}
		captionDisplayed = j;
	//   35   59:aload_0         
	//   36   60:iload_2         
	//   37   61:putfield        #89  <Field int captionDisplayed>
	//   38   64:return          
	}

	private void setTextViewTypeface(TextView textview, Typeface typeface1)
	{
		if(textview != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
			textview.setTypeface(typeface1);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #201 <Method void TextView.setTypeface(Typeface)>
	//    5    9:return          
	}

	private void setViewGroupGoneIfEmpty(ViewGroup viewgroup, int i)
	{
		if(i == 0)
	//*   0    0:iload_2         
	//*   1    1:ifne            10
			viewgroup.setVisibility(8);
	//    2    4:aload_1         
	//    3    5:bipush          8
	//    4    7:invokevirtual   #207 <Method void ViewGroup.setVisibility(int)>
	//    5   10:return          
	}

	private boolean shouldAnimateCaptionView(TextView textview, CharSequence charsequence)
	{
		return ViewCompat.isLaidOut(((View) (textInputView))) && textInputView.isEnabled() && (captionToShow != captionDisplayed || textview == null || !TextUtils.equals(textview.getText(), charsequence));
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field TextInputLayout textInputView>
	//    2    4:invokestatic    #215 <Method boolean ViewCompat.isLaidOut(View)>
	//    3    7:ifeq            48
	//    4   10:aload_0         
	//    5   11:getfield        #65  <Field TextInputLayout textInputView>
	//    6   14:invokevirtual   #218 <Method boolean TextInputLayout.isEnabled()>
	//    7   17:ifeq            48
	//    8   20:aload_0         
	//    9   21:getfield        #220 <Field int captionToShow>
	//   10   24:aload_0         
	//   11   25:getfield        #89  <Field int captionDisplayed>
	//   12   28:icmpne          46
	//   13   31:aload_1         
	//   14   32:ifnull          46
	//   15   35:aload_1         
	//   16   36:invokevirtual   #224 <Method CharSequence TextView.getText()>
	//   17   39:aload_2         
	//   18   40:invokestatic    #228 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   19   43:ifne            48
	//   20   46:iconst_1        
	//   21   47:ireturn         
	//   22   48:iconst_0        
	//   23   49:ireturn         
	}

	private void updateCaptionViewsVisibility(int i, final int captionToShow, boolean flag)
	{
		if(flag)
	//*   0    0:iload_3         
	//*   1    1:ifeq            102
		{
			AnimatorSet animatorset = new AnimatorSet();
	//    2    4:new             #232 <Class AnimatorSet>
	//    3    7:dup             
	//    4    8:invokespecial   #233 <Method void AnimatorSet()>
	//    5   11:astore          4
			captionAnimator = ((Animator) (animatorset));
	//    6   13:aload_0         
	//    7   14:aload           4
	//    8   16:putfield        #93  <Field Animator captionAnimator>
			ArrayList arraylist = new ArrayList();
	//    9   19:new             #235 <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #236 <Method void ArrayList()>
	//   12   26:astore          5
			createCaptionAnimators(((List) (arraylist)), helperTextEnabled, helperTextView, 2, i, captionToShow);
	//   13   28:aload_0         
	//   14   29:aload           5
	//   15   31:aload_0         
	//   16   32:getfield        #238 <Field boolean helperTextEnabled>
	//   17   35:aload_0         
	//   18   36:getfield        #163 <Field TextView helperTextView>
	//   19   39:iconst_2        
	//   20   40:iload_1         
	//   21   41:iload_2         
	//   22   42:invokespecial   #240 <Method void createCaptionAnimators(List, boolean, TextView, int, int, int)>
			createCaptionAnimators(((List) (arraylist)), errorEnabled, errorView, 1, i, captionToShow);
	//   23   45:aload_0         
	//   24   46:aload           5
	//   25   48:aload_0         
	//   26   49:getfield        #242 <Field boolean errorEnabled>
	//   27   52:aload_0         
	//   28   53:getfield        #97  <Field TextView errorView>
	//   29   56:iconst_1        
	//   30   57:iload_1         
	//   31   58:iload_2         
	//   32   59:invokespecial   #240 <Method void createCaptionAnimators(List, boolean, TextView, int, int, int)>
			AnimatorSetCompat.playTogether(animatorset, ((List) (arraylist)));
	//   33   62:aload           4
	//   34   64:aload           5
	//   35   66:invokestatic    #248 <Method void AnimatorSetCompat.playTogether(AnimatorSet, List)>
			animatorset.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator)
				{
					captionDisplayed = captionToShow;
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field IndicatorViewController this$0>
				//    2    4:aload_0         
				//    3    5:getfield        #23  <Field int val$captionToShow>
				//    4    8:invokestatic    #39  <Method int IndicatorViewController.access$002(IndicatorViewController, int)>
				//    5   11:pop             
					captionAnimator = null;
				//    6   12:aload_0         
				//    7   13:getfield        #21  <Field IndicatorViewController this$0>
				//    8   16:aconst_null     
				//    9   17:invokestatic    #43  <Method Animator IndicatorViewController.access$102(IndicatorViewController, Animator)>
				//   10   20:pop             
					animator = ((Animator) (captionViewToHide));
				//   11   21:aload_0         
				//   12   22:getfield        #25  <Field TextView val$captionViewToHide>
				//   13   25:astore_1        
					if(animator != null)
				//*  14   26:aload_1         
				//*  15   27:ifnull          64
					{
						((TextView) (animator)).setVisibility(4);
				//   16   30:aload_1         
				//   17   31:iconst_4        
				//   18   32:invokevirtual   #49  <Method void TextView.setVisibility(int)>
						if(captionToHide == 1 && errorView != null)
				//*  19   35:aload_0         
				//*  20   36:getfield        #27  <Field int val$captionToHide>
				//*  21   39:iconst_1        
				//*  22   40:icmpne          64
				//*  23   43:aload_0         
				//*  24   44:getfield        #21  <Field IndicatorViewController this$0>
				//*  25   47:invokestatic    #53  <Method TextView IndicatorViewController.access$200(IndicatorViewController)>
				//*  26   50:ifnull          64
							errorView.setText(((CharSequence) (null)));
				//   27   53:aload_0         
				//   28   54:getfield        #21  <Field IndicatorViewController this$0>
				//   29   57:invokestatic    #53  <Method TextView IndicatorViewController.access$200(IndicatorViewController)>
				//   30   60:aconst_null     
				//   31   61:invokevirtual   #57  <Method void TextView.setText(CharSequence)>
					}
				//   32   64:return          
				}

				public void onAnimationStart(Animator animator)
				{
					animator = ((Animator) (captionViewToShow));
				//    0    0:aload_0         
				//    1    1:getfield        #29  <Field TextView val$captionViewToShow>
				//    2    4:astore_1        
					if(animator != null)
				//*   3    5:aload_1         
				//*   4    6:ifnull          14
						((TextView) (animator)).setVisibility(0);
				//    5    9:aload_1         
				//    6   10:iconst_0        
				//    7   11:invokevirtual   #49  <Method void TextView.setVisibility(int)>
				//    8   14:return          
				}

				final IndicatorViewController this$0;
				final int val$captionToHide;
				final int val$captionToShow;
				final TextView val$captionViewToHide;
				final TextView val$captionViewToShow;

			
			{
				this$0 = IndicatorViewController.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field IndicatorViewController this$0>
				captionToShow = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #23  <Field int val$captionToShow>
				captionViewToHide = textview;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field TextView val$captionViewToHide>
				captionToHide = j;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #27  <Field int val$captionToHide>
				captionViewToShow = textview1;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #29  <Field TextView val$captionViewToShow>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #32  <Method void AnimatorListenerAdapter()>
			//   17   31:return          
			}
			}
)));
	//   36   69:aload           4
	//   37   71:new             #6   <Class IndicatorViewController$1>
	//   38   74:dup             
	//   39   75:aload_0         
	//   40   76:iload_2         
	//   41   77:aload_0         
	//   42   78:iload_1         
	//   43   79:invokespecial   #181 <Method TextView getCaptionViewFromDisplayState(int)>
	//   44   82:iload_1         
	//   45   83:aload_0         
	//   46   84:iload_2         
	//   47   85:invokespecial   #181 <Method TextView getCaptionViewFromDisplayState(int)>
	//   48   88:invokespecial   #251 <Method void IndicatorViewController$1(IndicatorViewController, int, TextView, int, TextView)>
	//   49   91:invokevirtual   #255 <Method void AnimatorSet.addListener(android.animation.Animator$AnimatorListener)>
			animatorset.start();
	//   50   94:aload           4
	//   51   96:invokevirtual   #258 <Method void AnimatorSet.start()>
		} else
	//*  52   99:goto            108
		{
			setCaptionViewVisibilities(i, captionToShow);
	//   53  102:aload_0         
	//   54  103:iload_1         
	//   55  104:iload_2         
	//   56  105:invokespecial   #260 <Method void setCaptionViewVisibilities(int, int)>
		}
		textInputView.updateEditTextBackground();
	//   57  108:aload_0         
	//   58  109:getfield        #65  <Field TextInputLayout textInputView>
	//   59  112:invokevirtual   #263 <Method void TextInputLayout.updateEditTextBackground()>
		textInputView.updateLabelState(flag);
	//   60  115:aload_0         
	//   61  116:getfield        #65  <Field TextInputLayout textInputView>
	//   62  119:iload_3         
	//   63  120:invokevirtual   #267 <Method void TextInputLayout.updateLabelState(boolean)>
		textInputView.updateTextInputBoxState();
	//   64  123:aload_0         
	//   65  124:getfield        #65  <Field TextInputLayout textInputView>
	//   66  127:invokevirtual   #270 <Method void TextInputLayout.updateTextInputBoxState()>
	//   67  130:return          
	}

	void addIndicator(TextView textview, int i)
	{
		if(indicatorArea == null && captionArea == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field LinearLayout indicatorArea>
	//*   2    4:ifnonnull       137
	//*   3    7:aload_0         
	//*   4    8:getfield        #274 <Field FrameLayout captionArea>
	//*   5   11:ifnonnull       137
		{
			indicatorArea = new LinearLayout(context);
	//    6   14:aload_0         
	//    7   15:new             #276 <Class LinearLayout>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #63  <Field Context context>
	//   11   23:invokespecial   #279 <Method void LinearLayout(Context)>
	//   12   26:putfield        #101 <Field LinearLayout indicatorArea>
			indicatorArea.setOrientation(0);
	//   13   29:aload_0         
	//   14   30:getfield        #101 <Field LinearLayout indicatorArea>
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #282 <Method void LinearLayout.setOrientation(int)>
			textInputView.addView(((View) (indicatorArea)), -1, -2);
	//   17   37:aload_0         
	//   18   38:getfield        #65  <Field TextInputLayout textInputView>
	//   19   41:aload_0         
	//   20   42:getfield        #101 <Field LinearLayout indicatorArea>
	//   21   45:iconst_m1       
	//   22   46:bipush          -2
	//   23   48:invokevirtual   #286 <Method void TextInputLayout.addView(View, int, int)>
			captionArea = new FrameLayout(context);
	//   24   51:aload_0         
	//   25   52:new             #288 <Class FrameLayout>
	//   26   55:dup             
	//   27   56:aload_0         
	//   28   57:getfield        #63  <Field Context context>
	//   29   60:invokespecial   #289 <Method void FrameLayout(Context)>
	//   30   63:putfield        #274 <Field FrameLayout captionArea>
			indicatorArea.addView(((View) (captionArea)), -1, ((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-2, -2))));
	//   31   66:aload_0         
	//   32   67:getfield        #101 <Field LinearLayout indicatorArea>
	//   33   70:aload_0         
	//   34   71:getfield        #274 <Field FrameLayout captionArea>
	//   35   74:iconst_m1       
	//   36   75:new             #291 <Class android.widget.FrameLayout$LayoutParams>
	//   37   78:dup             
	//   38   79:bipush          -2
	//   39   81:bipush          -2
	//   40   83:invokespecial   #293 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   41   86:invokevirtual   #296 <Method void LinearLayout.addView(View, int, android.view.ViewGroup$LayoutParams)>
			Space space = new Space(context);
	//   42   89:new             #298 <Class Space>
	//   43   92:dup             
	//   44   93:aload_0         
	//   45   94:getfield        #63  <Field Context context>
	//   46   97:invokespecial   #299 <Method void Space(Context)>
	//   47  100:astore_3        
			android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(0, 0, 1.0F);
	//   48  101:new             #301 <Class android.widget.LinearLayout$LayoutParams>
	//   49  104:dup             
	//   50  105:iconst_0        
	//   51  106:iconst_0        
	//   52  107:fconst_1        
	//   53  108:invokespecial   #304 <Method void android.widget.LinearLayout$LayoutParams(int, int, float)>
	//   54  111:astore          4
			indicatorArea.addView(((View) (space)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   55  113:aload_0         
	//   56  114:getfield        #101 <Field LinearLayout indicatorArea>
	//   57  117:aload_3         
	//   58  118:aload           4
	//   59  120:invokevirtual   #307 <Method void LinearLayout.addView(View, android.view.ViewGroup$LayoutParams)>
			if(textInputView.getEditText() != null)
	//*  60  123:aload_0         
	//*  61  124:getfield        #65  <Field TextInputLayout textInputView>
	//*  62  127:invokevirtual   #105 <Method android.widget.EditText TextInputLayout.getEditText()>
	//*  63  130:ifnull          137
				adjustIndicatorPadding();
	//   64  133:aload_0         
	//   65  134:invokevirtual   #310 <Method void adjustIndicatorPadding()>
		}
		if(isCaptionView(i))
	//*  66  137:aload_0         
	//*  67  138:iload_2         
	//*  68  139:invokevirtual   #313 <Method boolean isCaptionView(int)>
	//*  69  142:ifeq            174
		{
			captionArea.setVisibility(0);
	//   70  145:aload_0         
	//   71  146:getfield        #274 <Field FrameLayout captionArea>
	//   72  149:iconst_0        
	//   73  150:invokevirtual   #314 <Method void FrameLayout.setVisibility(int)>
			captionArea.addView(((View) (textview)));
	//   74  153:aload_0         
	//   75  154:getfield        #274 <Field FrameLayout captionArea>
	//   76  157:aload_1         
	//   77  158:invokevirtual   #317 <Method void FrameLayout.addView(View)>
			captionViewsAdded = captionViewsAdded + 1;
	//   78  161:aload_0         
	//   79  162:aload_0         
	//   80  163:getfield        #319 <Field int captionViewsAdded>
	//   81  166:iconst_1        
	//   82  167:iadd            
	//   83  168:putfield        #319 <Field int captionViewsAdded>
		} else
	//*  84  171:goto            183
		{
			indicatorArea.addView(((View) (textview)), i);
	//   85  174:aload_0         
	//   86  175:getfield        #101 <Field LinearLayout indicatorArea>
	//   87  178:aload_1         
	//   88  179:iload_2         
	//   89  180:invokevirtual   #322 <Method void LinearLayout.addView(View, int)>
		}
		indicatorArea.setVisibility(0);
	//   90  183:aload_0         
	//   91  184:getfield        #101 <Field LinearLayout indicatorArea>
	//   92  187:iconst_0        
	//   93  188:invokevirtual   #323 <Method void LinearLayout.setVisibility(int)>
		indicatorsAdded = indicatorsAdded + 1;
	//   94  191:aload_0         
	//   95  192:aload_0         
	//   96  193:getfield        #325 <Field int indicatorsAdded>
	//   97  196:iconst_1        
	//   98  197:iadd            
	//   99  198:putfield        #325 <Field int indicatorsAdded>
	//  100  201:return          
	}

	void adjustIndicatorPadding()
	{
		if(canAdjustIndicatorPadding())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #327 <Method boolean canAdjustIndicatorPadding()>
	//*   2    4:ifeq            36
			ViewCompat.setPaddingRelative(((View) (indicatorArea)), ViewCompat.getPaddingStart(((View) (textInputView.getEditText()))), 0, ViewCompat.getPaddingEnd(((View) (textInputView.getEditText()))), 0);
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field LinearLayout indicatorArea>
	//    5   11:aload_0         
	//    6   12:getfield        #65  <Field TextInputLayout textInputView>
	//    7   15:invokevirtual   #105 <Method android.widget.EditText TextInputLayout.getEditText()>
	//    8   18:invokestatic    #331 <Method int ViewCompat.getPaddingStart(View)>
	//    9   21:iconst_0        
	//   10   22:aload_0         
	//   11   23:getfield        #65  <Field TextInputLayout textInputView>
	//   12   26:invokevirtual   #105 <Method android.widget.EditText TextInputLayout.getEditText()>
	//   13   29:invokestatic    #334 <Method int ViewCompat.getPaddingEnd(View)>
	//   14   32:iconst_0        
	//   15   33:invokestatic    #338 <Method void ViewCompat.setPaddingRelative(View, int, int, int, int)>
	//   16   36:return          
	}

	void cancelCaptionAnimator()
	{
		Animator animator = captionAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field Animator captionAnimator>
	//    2    4:astore_1        
		if(animator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			animator.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #344 <Method void Animator.cancel()>
	//    7   13:return          
	}

	boolean errorIsDisplayed()
	{
		return isCaptionStateError(captionDisplayed);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #89  <Field int captionDisplayed>
	//    3    5:invokespecial   #347 <Method boolean isCaptionStateError(int)>
	//    4    8:ireturn         
	}

	boolean errorShouldBeShown()
	{
		return isCaptionStateError(captionToShow);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #220 <Field int captionToShow>
	//    3    5:invokespecial   #347 <Method boolean isCaptionStateError(int)>
	//    4    8:ireturn         
	}

	CharSequence getErrorText()
	{
		return errorText;
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field CharSequence errorText>
	//    2    4:areturn         
	}

	int getErrorViewCurrentTextColor()
	{
		TextView textview = errorView;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field TextView errorView>
	//    2    4:astore_1        
		if(textview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return textview.getCurrentTextColor();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #355 <Method int TextView.getCurrentTextColor()>
	//    7   13:ireturn         
		else
			return -1;
	//    8   14:iconst_m1       
	//    9   15:ireturn         
	}

	ColorStateList getErrorViewTextColors()
	{
		TextView textview = errorView;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field TextView errorView>
	//    2    4:astore_1        
		if(textview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return textview.getTextColors();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #360 <Method ColorStateList TextView.getTextColors()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	CharSequence getHelperText()
	{
		return helperText;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field CharSequence helperText>
	//    2    4:areturn         
	}

	ColorStateList getHelperTextViewColors()
	{
		TextView textview = helperTextView;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field TextView helperTextView>
	//    2    4:astore_1        
		if(textview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return textview.getTextColors();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #360 <Method ColorStateList TextView.getTextColors()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	int getHelperTextViewCurrentTextColor()
	{
		TextView textview = helperTextView;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field TextView helperTextView>
	//    2    4:astore_1        
		if(textview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return textview.getCurrentTextColor();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #355 <Method int TextView.getCurrentTextColor()>
	//    7   13:ireturn         
		else
			return -1;
	//    8   14:iconst_m1       
	//    9   15:ireturn         
	}

	boolean helperTextIsDisplayed()
	{
		return isCaptionStateHelperText(captionDisplayed);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #89  <Field int captionDisplayed>
	//    3    5:invokespecial   #366 <Method boolean isCaptionStateHelperText(int)>
	//    4    8:ireturn         
	}

	boolean helperTextShouldBeShown()
	{
		return isCaptionStateHelperText(captionToShow);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #220 <Field int captionToShow>
	//    3    5:invokespecial   #366 <Method boolean isCaptionStateHelperText(int)>
	//    4    8:ireturn         
	}

	void hideError()
	{
		errorText = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #168 <Field CharSequence errorText>
		cancelCaptionAnimator();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #370 <Method void cancelCaptionAnimator()>
		if(captionDisplayed == 1)
	//*   5    9:aload_0         
	//*   6   10:getfield        #89  <Field int captionDisplayed>
	//*   7   13:iconst_1        
	//*   8   14:icmpne          47
			if(helperTextEnabled && !TextUtils.isEmpty(helperText))
	//*   9   17:aload_0         
	//*  10   18:getfield        #238 <Field boolean helperTextEnabled>
	//*  11   21:ifeq            42
	//*  12   24:aload_0         
	//*  13   25:getfield        #177 <Field CharSequence helperText>
	//*  14   28:invokestatic    #174 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  15   31:ifne            42
				captionToShow = 2;
	//   16   34:aload_0         
	//   17   35:iconst_2        
	//   18   36:putfield        #220 <Field int captionToShow>
			else
	//*  19   39:goto            47
				captionToShow = 0;
	//   20   42:aload_0         
	//   21   43:iconst_0        
	//   22   44:putfield        #220 <Field int captionToShow>
		updateCaptionViewsVisibility(captionDisplayed, captionToShow, shouldAnimateCaptionView(errorView, ((CharSequence) (null))));
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:getfield        #89  <Field int captionDisplayed>
	//   26   52:aload_0         
	//   27   53:getfield        #220 <Field int captionToShow>
	//   28   56:aload_0         
	//   29   57:aload_0         
	//   30   58:getfield        #97  <Field TextView errorView>
	//   31   61:aconst_null     
	//   32   62:invokespecial   #372 <Method boolean shouldAnimateCaptionView(TextView, CharSequence)>
	//   33   65:invokespecial   #374 <Method void updateCaptionViewsVisibility(int, int, boolean)>
	//   34   68:return          
	}

	void hideHelperText()
	{
		cancelCaptionAnimator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #370 <Method void cancelCaptionAnimator()>
		if(captionDisplayed == 2)
	//*   2    4:aload_0         
	//*   3    5:getfield        #89  <Field int captionDisplayed>
	//*   4    8:iconst_2        
	//*   5    9:icmpne          17
			captionToShow = 0;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #220 <Field int captionToShow>
		updateCaptionViewsVisibility(captionDisplayed, captionToShow, shouldAnimateCaptionView(helperTextView, ((CharSequence) (null))));
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #89  <Field int captionDisplayed>
	//   12   22:aload_0         
	//   13   23:getfield        #220 <Field int captionToShow>
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:getfield        #163 <Field TextView helperTextView>
	//   17   31:aconst_null     
	//   18   32:invokespecial   #372 <Method boolean shouldAnimateCaptionView(TextView, CharSequence)>
	//   19   35:invokespecial   #374 <Method void updateCaptionViewsVisibility(int, int, boolean)>
	//   20   38:return          
	}

	boolean isCaptionView(int i)
	{
		boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_2        
		if(i != 0)
	//*   2    2:iload_1         
	//*   3    3:ifeq            15
		{
			if(i == 1)
	//*   4    6:iload_1         
	//*   5    7:iconst_1        
	//*   6    8:icmpne          13
				return true;
	//    7   11:iconst_1        
	//    8   12:ireturn         
			flag = false;
	//    9   13:iconst_0        
	//   10   14:istore_2        
		}
		return flag;
	//   11   15:iload_2         
	//   12   16:ireturn         
	}

	boolean isErrorEnabled()
	{
		return errorEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #242 <Field boolean errorEnabled>
	//    2    4:ireturn         
	}

	boolean isHelperTextEnabled()
	{
		return helperTextEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field boolean helperTextEnabled>
	//    2    4:ireturn         
	}

	void removeIndicator(TextView textview, int i)
	{
label0:
		{
			if(indicatorArea == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field LinearLayout indicatorArea>
	//*   2    4:ifnonnull       8
				return;
	//    3    7:return          
			if(isCaptionView(i))
	//*   4    8:aload_0         
	//*   5    9:iload_2         
	//*   6   10:invokevirtual   #313 <Method boolean isCaptionView(int)>
	//*   7   13:ifeq            55
			{
				FrameLayout framelayout = captionArea;
	//    8   16:aload_0         
	//    9   17:getfield        #274 <Field FrameLayout captionArea>
	//   10   20:astore_3        
				if(framelayout != null)
	//*  11   21:aload_3         
	//*  12   22:ifnull          55
				{
					captionViewsAdded = captionViewsAdded - 1;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #319 <Field int captionViewsAdded>
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:putfield        #319 <Field int captionViewsAdded>
					setViewGroupGoneIfEmpty(((ViewGroup) (framelayout)), captionViewsAdded);
	//   19   35:aload_0         
	//   20   36:aload_3         
	//   21   37:aload_0         
	//   22   38:getfield        #319 <Field int captionViewsAdded>
	//   23   41:invokespecial   #380 <Method void setViewGroupGoneIfEmpty(ViewGroup, int)>
					captionArea.removeView(((View) (textview)));
	//   24   44:aload_0         
	//   25   45:getfield        #274 <Field FrameLayout captionArea>
	//   26   48:aload_1         
	//   27   49:invokevirtual   #383 <Method void FrameLayout.removeView(View)>
					break label0;
	//   28   52:goto            63
				}
			}
			indicatorArea.removeView(((View) (textview)));
	//   29   55:aload_0         
	//   30   56:getfield        #101 <Field LinearLayout indicatorArea>
	//   31   59:aload_1         
	//   32   60:invokevirtual   #384 <Method void LinearLayout.removeView(View)>
		}
		indicatorsAdded = indicatorsAdded - 1;
	//   33   63:aload_0         
	//   34   64:aload_0         
	//   35   65:getfield        #325 <Field int indicatorsAdded>
	//   36   68:iconst_1        
	//   37   69:isub            
	//   38   70:putfield        #325 <Field int indicatorsAdded>
		setViewGroupGoneIfEmpty(((ViewGroup) (indicatorArea)), indicatorsAdded);
	//   39   73:aload_0         
	//   40   74:aload_0         
	//   41   75:getfield        #101 <Field LinearLayout indicatorArea>
	//   42   78:aload_0         
	//   43   79:getfield        #325 <Field int indicatorsAdded>
	//   44   82:invokespecial   #380 <Method void setViewGroupGoneIfEmpty(ViewGroup, int)>
	//   45   85:return          
	}

	void setErrorEnabled(boolean flag)
	{
		if(errorEnabled == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #242 <Field boolean errorEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		cancelCaptionAnimator();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #370 <Method void cancelCaptionAnimator()>
		if(flag)
	//*   7   13:iload_1         
	//*   8   14:ifeq            95
		{
			errorView = ((TextView) (new AppCompatTextView(context)));
	//    9   17:aload_0         
	//   10   18:new             #387 <Class AppCompatTextView>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #63  <Field Context context>
	//   14   26:invokespecial   #388 <Method void AppCompatTextView(Context)>
	//   15   29:putfield        #97  <Field TextView errorView>
			errorView.setId(android.support.design.R.id.textinput_error);
	//   16   32:aload_0         
	//   17   33:getfield        #97  <Field TextView errorView>
	//   18   36:getstatic       #393 <Field int android.support.design.R$id.textinput_error>
	//   19   39:invokevirtual   #396 <Method void TextView.setId(int)>
			Typeface typeface1 = typeface;
	//   20   42:aload_0         
	//   21   43:getfield        #398 <Field Typeface typeface>
	//   22   46:astore_2        
			if(typeface1 != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          59
				errorView.setTypeface(typeface1);
	//   25   51:aload_0         
	//   26   52:getfield        #97  <Field TextView errorView>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #201 <Method void TextView.setTypeface(Typeface)>
			setErrorTextAppearance(errorTextAppearance);
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #400 <Field int errorTextAppearance>
	//   32   64:invokevirtual   #403 <Method void setErrorTextAppearance(int)>
			errorView.setVisibility(4);
	//   33   67:aload_0         
	//   34   68:getfield        #97  <Field TextView errorView>
	//   35   71:iconst_4        
	//   36   72:invokevirtual   #187 <Method void TextView.setVisibility(int)>
			ViewCompat.setAccessibilityLiveRegion(((View) (errorView)), 1);
	//   37   75:aload_0         
	//   38   76:getfield        #97  <Field TextView errorView>
	//   39   79:iconst_1        
	//   40   80:invokestatic    #406 <Method void ViewCompat.setAccessibilityLiveRegion(View, int)>
			addIndicator(errorView, 0);
	//   41   83:aload_0         
	//   42   84:aload_0         
	//   43   85:getfield        #97  <Field TextView errorView>
	//   44   88:iconst_0        
	//   45   89:invokevirtual   #408 <Method void addIndicator(TextView, int)>
		} else
	//*  46   92:goto            127
		{
			hideError();
	//   47   95:aload_0         
	//   48   96:invokevirtual   #410 <Method void hideError()>
			removeIndicator(errorView, 0);
	//   49   99:aload_0         
	//   50  100:aload_0         
	//   51  101:getfield        #97  <Field TextView errorView>
	//   52  104:iconst_0        
	//   53  105:invokevirtual   #412 <Method void removeIndicator(TextView, int)>
			errorView = null;
	//   54  108:aload_0         
	//   55  109:aconst_null     
	//   56  110:putfield        #97  <Field TextView errorView>
			textInputView.updateEditTextBackground();
	//   57  113:aload_0         
	//   58  114:getfield        #65  <Field TextInputLayout textInputView>
	//   59  117:invokevirtual   #263 <Method void TextInputLayout.updateEditTextBackground()>
			textInputView.updateTextInputBoxState();
	//   60  120:aload_0         
	//   61  121:getfield        #65  <Field TextInputLayout textInputView>
	//   62  124:invokevirtual   #270 <Method void TextInputLayout.updateTextInputBoxState()>
		}
		errorEnabled = flag;
	//   63  127:aload_0         
	//   64  128:iload_1         
	//   65  129:putfield        #242 <Field boolean errorEnabled>
	//   66  132:return          
	}

	void setErrorTextAppearance(int i)
	{
		errorTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #400 <Field int errorTextAppearance>
		TextView textview = errorView;
	//    3    5:aload_0         
	//    4    6:getfield        #97  <Field TextView errorView>
	//    5    9:astore_2        
		if(textview != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          23
			textInputView.setTextAppearanceCompatWithErrorFallback(textview, i);
	//    8   14:aload_0         
	//    9   15:getfield        #65  <Field TextInputLayout textInputView>
	//   10   18:aload_2         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #416 <Method void TextInputLayout.setTextAppearanceCompatWithErrorFallback(TextView, int)>
	//   13   23:return          
	}

	void setErrorViewTextColor(ColorStateList colorstatelist)
	{
		TextView textview = errorView;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field TextView errorView>
	//    2    4:astore_2        
		if(textview != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			textview.setTextColor(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #421 <Method void TextView.setTextColor(ColorStateList)>
	//    8   14:return          
	}

	void setHelperTextAppearance(int i)
	{
		helperTextTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #424 <Field int helperTextTextAppearance>
		TextView textview = helperTextView;
	//    3    5:aload_0         
	//    4    6:getfield        #163 <Field TextView helperTextView>
	//    5    9:astore_2        
		if(textview != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			TextViewCompat.setTextAppearance(textview, i);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokestatic    #429 <Method void TextViewCompat.setTextAppearance(TextView, int)>
	//   11   19:return          
	}

	void setHelperTextEnabled(boolean flag)
	{
		if(helperTextEnabled == flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #238 <Field boolean helperTextEnabled>
	//*   2    4:iload_1         
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		cancelCaptionAnimator();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #370 <Method void cancelCaptionAnimator()>
		if(flag)
	//*   7   13:iload_1         
	//*   8   14:ifeq            95
		{
			helperTextView = ((TextView) (new AppCompatTextView(context)));
	//    9   17:aload_0         
	//   10   18:new             #387 <Class AppCompatTextView>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:getfield        #63  <Field Context context>
	//   14   26:invokespecial   #388 <Method void AppCompatTextView(Context)>
	//   15   29:putfield        #163 <Field TextView helperTextView>
			helperTextView.setId(android.support.design.R.id.textinput_helper_text);
	//   16   32:aload_0         
	//   17   33:getfield        #163 <Field TextView helperTextView>
	//   18   36:getstatic       #433 <Field int android.support.design.R$id.textinput_helper_text>
	//   19   39:invokevirtual   #396 <Method void TextView.setId(int)>
			Typeface typeface1 = typeface;
	//   20   42:aload_0         
	//   21   43:getfield        #398 <Field Typeface typeface>
	//   22   46:astore_2        
			if(typeface1 != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          59
				helperTextView.setTypeface(typeface1);
	//   25   51:aload_0         
	//   26   52:getfield        #163 <Field TextView helperTextView>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #201 <Method void TextView.setTypeface(Typeface)>
			helperTextView.setVisibility(4);
	//   29   59:aload_0         
	//   30   60:getfield        #163 <Field TextView helperTextView>
	//   31   63:iconst_4        
	//   32   64:invokevirtual   #187 <Method void TextView.setVisibility(int)>
			ViewCompat.setAccessibilityLiveRegion(((View) (helperTextView)), 1);
	//   33   67:aload_0         
	//   34   68:getfield        #163 <Field TextView helperTextView>
	//   35   71:iconst_1        
	//   36   72:invokestatic    #406 <Method void ViewCompat.setAccessibilityLiveRegion(View, int)>
			setHelperTextAppearance(helperTextTextAppearance);
	//   37   75:aload_0         
	//   38   76:aload_0         
	//   39   77:getfield        #424 <Field int helperTextTextAppearance>
	//   40   80:invokevirtual   #435 <Method void setHelperTextAppearance(int)>
			addIndicator(helperTextView, 1);
	//   41   83:aload_0         
	//   42   84:aload_0         
	//   43   85:getfield        #163 <Field TextView helperTextView>
	//   44   88:iconst_1        
	//   45   89:invokevirtual   #408 <Method void addIndicator(TextView, int)>
		} else
	//*  46   92:goto            127
		{
			hideHelperText();
	//   47   95:aload_0         
	//   48   96:invokevirtual   #437 <Method void hideHelperText()>
			removeIndicator(helperTextView, 1);
	//   49   99:aload_0         
	//   50  100:aload_0         
	//   51  101:getfield        #163 <Field TextView helperTextView>
	//   52  104:iconst_1        
	//   53  105:invokevirtual   #412 <Method void removeIndicator(TextView, int)>
			helperTextView = null;
	//   54  108:aload_0         
	//   55  109:aconst_null     
	//   56  110:putfield        #163 <Field TextView helperTextView>
			textInputView.updateEditTextBackground();
	//   57  113:aload_0         
	//   58  114:getfield        #65  <Field TextInputLayout textInputView>
	//   59  117:invokevirtual   #263 <Method void TextInputLayout.updateEditTextBackground()>
			textInputView.updateTextInputBoxState();
	//   60  120:aload_0         
	//   61  121:getfield        #65  <Field TextInputLayout textInputView>
	//   62  124:invokevirtual   #270 <Method void TextInputLayout.updateTextInputBoxState()>
		}
		helperTextEnabled = flag;
	//   63  127:aload_0         
	//   64  128:iload_1         
	//   65  129:putfield        #238 <Field boolean helperTextEnabled>
	//   66  132:return          
	}

	void setHelperTextViewTextColor(ColorStateList colorstatelist)
	{
		TextView textview = helperTextView;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field TextView helperTextView>
	//    2    4:astore_2        
		if(textview != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			textview.setTextColor(colorstatelist);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #421 <Method void TextView.setTextColor(ColorStateList)>
	//    8   14:return          
	}

	void setTypefaces(Typeface typeface1)
	{
		if(typeface1 != typeface)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #398 <Field Typeface typeface>
	//*   3    5:if_acmpeq       31
		{
			typeface = typeface1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #398 <Field Typeface typeface>
			setTextViewTypeface(errorView, typeface1);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #97  <Field TextView errorView>
	//   10   18:aload_1         
	//   11   19:invokespecial   #441 <Method void setTextViewTypeface(TextView, Typeface)>
			setTextViewTypeface(helperTextView, typeface1);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #163 <Field TextView helperTextView>
	//   15   27:aload_1         
	//   16   28:invokespecial   #441 <Method void setTextViewTypeface(TextView, Typeface)>
		}
	//   17   31:return          
	}

	void showError(CharSequence charsequence)
	{
		cancelCaptionAnimator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #370 <Method void cancelCaptionAnimator()>
		errorText = charsequence;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #168 <Field CharSequence errorText>
		errorView.setText(charsequence);
	//    5    9:aload_0         
	//    6   10:getfield        #97  <Field TextView errorView>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #195 <Method void TextView.setText(CharSequence)>
		if(captionDisplayed != 1)
	//*   9   17:aload_0         
	//*  10   18:getfield        #89  <Field int captionDisplayed>
	//*  11   21:iconst_1        
	//*  12   22:icmpeq          30
			captionToShow = 1;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #220 <Field int captionToShow>
		updateCaptionViewsVisibility(captionDisplayed, captionToShow, shouldAnimateCaptionView(errorView, charsequence));
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #89  <Field int captionDisplayed>
	//   19   35:aload_0         
	//   20   36:getfield        #220 <Field int captionToShow>
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #97  <Field TextView errorView>
	//   24   44:aload_1         
	//   25   45:invokespecial   #372 <Method boolean shouldAnimateCaptionView(TextView, CharSequence)>
	//   26   48:invokespecial   #374 <Method void updateCaptionViewsVisibility(int, int, boolean)>
	//   27   51:return          
	}

	void showHelper(CharSequence charsequence)
	{
		cancelCaptionAnimator();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #370 <Method void cancelCaptionAnimator()>
		helperText = charsequence;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #177 <Field CharSequence helperText>
		helperTextView.setText(charsequence);
	//    5    9:aload_0         
	//    6   10:getfield        #163 <Field TextView helperTextView>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #195 <Method void TextView.setText(CharSequence)>
		if(captionDisplayed != 2)
	//*   9   17:aload_0         
	//*  10   18:getfield        #89  <Field int captionDisplayed>
	//*  11   21:iconst_2        
	//*  12   22:icmpeq          30
			captionToShow = 2;
	//   13   25:aload_0         
	//   14   26:iconst_2        
	//   15   27:putfield        #220 <Field int captionToShow>
		updateCaptionViewsVisibility(captionDisplayed, captionToShow, shouldAnimateCaptionView(helperTextView, charsequence));
	//   16   30:aload_0         
	//   17   31:aload_0         
	//   18   32:getfield        #89  <Field int captionDisplayed>
	//   19   35:aload_0         
	//   20   36:getfield        #220 <Field int captionToShow>
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #163 <Field TextView helperTextView>
	//   24   44:aload_1         
	//   25   45:invokespecial   #372 <Method boolean shouldAnimateCaptionView(TextView, CharSequence)>
	//   26   48:invokespecial   #374 <Method void updateCaptionViewsVisibility(int, int, boolean)>
	//   27   51:return          
	}

	private static final int CAPTION_OPACITY_FADE_ANIMATION_DURATION = 167;
	private static final int CAPTION_STATE_ERROR = 1;
	private static final int CAPTION_STATE_HELPER_TEXT = 2;
	private static final int CAPTION_STATE_NONE = 0;
	private static final int CAPTION_TRANSLATE_Y_ANIMATION_DURATION = 217;
	static final int COUNTER_INDEX = 2;
	static final int ERROR_INDEX = 0;
	static final int HELPER_INDEX = 1;
	private Animator captionAnimator;
	private FrameLayout captionArea;
	private int captionDisplayed;
	private int captionToShow;
	private final float captionTranslationYPx;
	private int captionViewsAdded;
	private final Context context;
	private boolean errorEnabled;
	private CharSequence errorText;
	private int errorTextAppearance;
	private TextView errorView;
	private CharSequence helperText;
	private boolean helperTextEnabled;
	private int helperTextTextAppearance;
	private TextView helperTextView;
	private LinearLayout indicatorArea;
	private int indicatorsAdded;
	private final TextInputLayout textInputView;
	private Typeface typeface;


/*
	static int access$002(IndicatorViewController indicatorviewcontroller, int i)
	{
		indicatorviewcontroller.captionDisplayed = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #89  <Field int captionDisplayed>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static Animator access$102(IndicatorViewController indicatorviewcontroller, Animator animator)
	{
		indicatorviewcontroller.captionAnimator = animator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #93  <Field Animator captionAnimator>
		return animator;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static TextView access$200(IndicatorViewController indicatorviewcontroller)
	{
		return indicatorviewcontroller.errorView;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field TextView errorView>
	//    2    4:areturn         
	}

*/
}
