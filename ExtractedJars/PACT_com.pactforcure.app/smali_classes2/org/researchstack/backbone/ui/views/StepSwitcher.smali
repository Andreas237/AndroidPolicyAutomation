.class public Lorg/researchstack/backbone/ui/views/StepSwitcher;
.super Landroid/widget/FrameLayout;
.source "StepSwitcher.java"


# static fields
.field public static final SHIFT_LEFT:I = 0x1

.field public static final SHIFT_RIGHT:I = -0x1

.field public static final interpolator:Landroid/view/animation/DecelerateInterpolator;


# instance fields
.field private animationTime:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 43
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    const/high16 v1, 0x40000000    # 2.0f

    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    sput-object v0, Lorg/researchstack/backbone/ui/views/StepSwitcher;->interpolator:Landroid/view/animation/DecelerateInterpolator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 57
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 58
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->init()V

    .line 59
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 70
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 71
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->init()V

    .line 72
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyleAttr"    # I

    .prologue
    .line 86
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 87
    invoke-direct {p0}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->init()V

    .line 88
    return-void
.end method

.method private getLayoutParams(Lorg/researchstack/backbone/ui/step/layout/StepLayout;)Landroid/widget/FrameLayout$LayoutParams;
    .locals 3
    .param p1, "stepLayout"    # Lorg/researchstack/backbone/ui/step/layout/StepLayout;

    .prologue
    const/4 v2, -0x1

    .line 178
    invoke-interface {p1}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->getLayout()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 179
    .local v0, "lp":Landroid/widget/FrameLayout$LayoutParams;
    if-nez v0, :cond_0

    .line 181
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .end local v0    # "lp":Landroid/widget/FrameLayout$LayoutParams;
    invoke-direct {v0, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 183
    .restart local v0    # "lp":Landroid/widget/FrameLayout$LayoutParams;
    :cond_0
    return-object v0
.end method

.method private init()V
    .locals 2

    .prologue
    .line 92
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lorg/researchstack/backbone/R$integer;->rsb_config_mediumAnimTime:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher;->animationTime:I

    .line 93
    return-void
.end method

.method static synthetic lambda$null$14(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)V
    .locals 3
    .param p0, "this"    # Lorg/researchstack/backbone/ui/views/StepSwitcher;

    .prologue
    .line 159
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "input_method"

    .line 160
    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 162
    .local v0, "imm":Landroid/view/inputmethod/InputMethodManager;
    invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->isActive()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/inputmethod/InputMethodManager;->isAcceptingText()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 164
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 167
    :cond_0
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->removeView(Landroid/view/View;)V

    .line 168
    invoke-interface {p2}, Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;->onTransitionEnded()V

    .line 169
    return-void
.end method

.method static synthetic lambda$show$15(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/step/layout/StepLayout;ILorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)V
    .locals 6
    .param p0, "this"    # Lorg/researchstack/backbone/ui/views/StepSwitcher;

    .prologue
    .line 128
    const/4 v0, 0x0

    .line 129
    .local v0, "currentIndex":I
    if-eqz p1, :cond_0

    .line 131
    const/4 v3, 0x0

    invoke-virtual {p1, v3}, Landroid/view/View;->setId(I)V

    .line 132
    invoke-virtual {p0, p1}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->indexOfChild(Landroid/view/View;)I

    move-result v0

    .line 137
    :cond_0
    invoke-direct {p0, p2}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->getLayoutParams(Lorg/researchstack/backbone/ui/step/layout/StepLayout;)Landroid/widget/FrameLayout$LayoutParams;

    move-result-object v1

    .line 138
    .local v1, "lp":Landroid/widget/FrameLayout$LayoutParams;
    invoke-interface {p2}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->getLayout()Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3, v0, v1}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 139
    invoke-interface {p2}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->getLayout()Landroid/view/View;

    move-result-object v3

    sget v4, Lorg/researchstack/backbone/R$id;->rsb_current_step:I

    invoke-virtual {v3, v4}, Landroid/view/View;->setId(I)V

    .line 143
    if-eqz p1, :cond_1

    .line 145
    invoke-virtual {p0}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->getWidth()I

    move-result v3

    mul-int v2, p3, v3

    .line 147
    .local v2, "newTranslationX":I
    invoke-interface {p2}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->getLayout()Landroid/view/View;

    move-result-object v3

    int-to-float v4, v2

    invoke-virtual {v3, v4}, Landroid/view/View;->setTranslationX(F)V

    .line 148
    invoke-interface {p2}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->getLayout()Landroid/view/View;

    move-result-object v3

    .line 149
    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    iget v4, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher;->animationTime:I

    int-to-long v4, v4

    .line 150
    invoke-virtual {v3, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    sget-object v4, Lorg/researchstack/backbone/ui/views/StepSwitcher;->interpolator:Landroid/view/animation/DecelerateInterpolator;

    .line 151
    invoke-virtual {v3, v4}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    const/4 v4, 0x0

    .line 152
    invoke-virtual {v3, v4}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 154
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    sget-object v4, Lorg/researchstack/backbone/ui/views/StepSwitcher;->interpolator:Landroid/view/animation/DecelerateInterpolator;

    .line 155
    invoke-virtual {v3, v4}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    iget v4, p0, Lorg/researchstack/backbone/ui/views/StepSwitcher;->animationTime:I

    int-to-long v4, v4

    .line 156
    invoke-virtual {v3, v4, v5}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    mul-int/lit8 v4, v2, -0x1

    int-to-float v4, v4

    .line 157
    invoke-virtual {v3, v4}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v3

    invoke-static {p0, p1, p4}, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$2;->lambdaFactory$(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)Ljava/lang/Runnable;

    move-result-object v4

    .line 158
    invoke-virtual {v3, v4}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 173
    .end local v2    # "newTranslationX":I
    :goto_0
    return-void

    .line 171
    :cond_1
    invoke-interface {p4}, Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;->onTransitionEnded()V

    goto :goto_0
.end method


# virtual methods
.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 189
    const-class v0, Lorg/researchstack/backbone/ui/views/StepSwitcher;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public show(Lorg/researchstack/backbone/ui/step/layout/StepLayout;ILorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)V
    .locals 6
    .param p1, "stepLayout"    # Lorg/researchstack/backbone/ui/step/layout/StepLayout;
    .param p2, "direction"    # I
    .param p3, "listener"    # Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;

    .prologue
    .line 106
    sget v3, Lorg/researchstack/backbone/R$id;->rsb_current_step:I

    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 107
    .local v0, "currentStep":Landroid/view/View;
    if-eqz v0, :cond_0

    .line 109
    sget v3, Lorg/researchstack/backbone/R$id;->rsb_step_layout_id:I

    invoke-virtual {v0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 110
    .local v1, "currentStepId":Ljava/lang/String;
    invoke-interface {p1}, Lorg/researchstack/backbone/ui/step/layout/StepLayout;->getLayout()Landroid/view/View;

    move-result-object v3

    sget v4, Lorg/researchstack/backbone/R$id;->rsb_step_layout_id:I

    invoke-virtual {v3, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 111
    .local v2, "stepLayoutId":Ljava/lang/String;
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 113
    invoke-interface {p3}, Lorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;->onTransitionEnded()V

    .line 174
    .end local v1    # "currentStepId":Ljava/lang/String;
    .end local v2    # "stepLayoutId":Ljava/lang/String;
    :goto_0
    return-void

    .line 120
    :cond_0
    const/4 v3, 0x1

    if-eq p2, v3, :cond_1

    const/4 v3, -0x1

    if-eq p2, v3, :cond_1

    .line 122
    new-instance v3, Ljava/security/InvalidParameterException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Direction with value: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v5, " is not supported."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 126
    :cond_1
    invoke-static {p0, v0, p1, p2, p3}, Lorg/researchstack/backbone/ui/views/StepSwitcher$$Lambda$1;->lambdaFactory$(Lorg/researchstack/backbone/ui/views/StepSwitcher;Landroid/view/View;Lorg/researchstack/backbone/ui/step/layout/StepLayout;ILorg/researchstack/backbone/ui/ViewTaskActivity$OnStepTransitionEndListener;)Ljava/lang/Runnable;

    move-result-object v3

    invoke-virtual {p0, v3}, Lorg/researchstack/backbone/ui/views/StepSwitcher;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method
