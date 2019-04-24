.class Lcom/shopkick/app/ftue/FTUEAnimationManager;
.super Ljava/lang/Object;
.source "FTUEAnimationManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;,
        Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;
    }
.end annotation


# static fields
.field static final ANIMATED_TEXT_DELAY:I = 0x258

.field private static final ANIMATED_TEXT_PERIOD:I = 0x2d

.field private static final ANIMATED_TEXT_SWITCH_SENTENCE_DELAY:I = 0x12c

.field private static final JEAN_ANIMATION_DURATION:I = 0x12c

.field static final JEAN_ANIMATION_START_DELAY:I = 0x64

.field private static final SLIDE_ANIMATION_DURATION:I = 0x12c

.field private static final TAP_INDICATOR_CIRCLE_1_ANIMATION_DURATION:I = 0x64

.field private static final TAP_INDICATOR_CIRCLE_2_ANIMATION_DURATION:I = 0xc8

.field private static final TAP_INDICATOR_CIRCLE_3_ANIMATION_DURATION:I = 0x12c


# instance fields
.field private animateTextViewTimer:Ljava/util/Timer;

.field private animatedSentences:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/text/SpannableString;",
            ">;"
        }
    .end annotation
.end field

.field private closeAnimationStarted:Z

.field private context:Landroid/content/Context;

.field private currentAnimatedSentence:Landroid/text/SpannableString;

.field private currentSentenceDisplayed:Landroid/text/SpannableString;

.field private imageHasBeenAnimated:Z

.field private isFirstSentence:Z

.field private overlayDismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

.field private overlayLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

.field private roundImageView:Lcom/shopkick/app/widget/RoundImageView;

.field private roundImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

.field private roundImageViewLeftMargin:F

.field private roundImageViewTopMargin:F

.field private tapIndicator:Landroid/widget/RelativeLayout;

.field private tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

.field private tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

.field private tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

.field private textAnimationFinishListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

.field private textView:Lcom/shopkick/app/widget/SKTextView;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 64
    iput-boolean v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->isFirstSentence:Z

    const/4 v0, 0x0

    .line 70
    iput-boolean v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->closeAnimationStarted:Z

    const/4 v0, 0x0

    .line 71
    iput v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewLeftMargin:F

    .line 72
    iput v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewTopMargin:F

    .line 84
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->context:Landroid/content/Context;

    .line 85
    new-instance p1, Landroid/text/SpannableString;

    const-string v0, ""

    invoke-direct {p1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentAnimatedSentence:Landroid/text/SpannableString;

    .line 86
    new-instance p1, Landroid/text/SpannableString;

    const-string v0, ""

    invoke-direct {p1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentSentenceDisplayed:Landroid/text/SpannableString;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateText()V

    return-void
.end method

.method static synthetic access$100(Lcom/shopkick/app/ftue/FTUEAnimationManager;)Lcom/shopkick/app/widget/RoundImageView;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    return-object p0
.end method

.method static synthetic access$200(Lcom/shopkick/app/ftue/FTUEAnimationManager;)Lcom/shopkick/app/widget/RoundImageView;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    return-object p0
.end method

.method static synthetic access$300(Lcom/shopkick/app/ftue/FTUEAnimationManager;)Lcom/shopkick/app/ftue/DragConstraintLayout;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->overlayLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    return-object p0
.end method

.method static synthetic access$400(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V
    .locals 0

    .line 35
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->prepareOverlayFadeOutAnimation()V

    return-void
.end method

.method static synthetic access$500(Lcom/shopkick/app/ftue/FTUEAnimationManager;)Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;
    .locals 0

    .line 35
    iget-object p0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->overlayDismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    return-object p0
.end method

.method private animateRoundImageView()V
    .locals 3

    .line 175
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 176
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->context:Landroid/content/Context;

    const v2, 0x7f010026

    invoke-static {v1, v2}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/RoundImageView;->startAnimation(Landroid/view/animation/Animation;)V

    const/4 v0, 0x1

    .line 177
    iput-boolean v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->imageHasBeenAnimated:Z

    :cond_0
    return-void
.end method

.method private animateTapIndicator()V
    .locals 3

    .line 198
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$OwUjtmHn8RwMmxekAf79r5IU5DQ;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$OwUjtmHn8RwMmxekAf79r5IU5DQ;-><init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    :cond_0
    return-void
.end method

.method private animateText()V
    .locals 7

    .line 249
    iget-boolean v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->imageHasBeenAnimated:Z

    if-nez v0, :cond_0

    .line 250
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateRoundImageView()V

    .line 256
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animatedSentences:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentAnimatedSentence:Landroid/text/SpannableString;

    invoke-virtual {v0}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 257
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->stopTextViewAnimation()V

    .line 258
    invoke-virtual {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->startAnimateTapIndicator()V

    .line 259
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->finishCallback()V

    return-void

    .line 262
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentAnimatedSentence:Landroid/text/SpannableString;

    invoke-virtual {v0}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    .line 263
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animatedSentences:Ljava/util/List;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/text/SpannableString;

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentAnimatedSentence:Landroid/text/SpannableString;

    .line 265
    iget-boolean v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->isFirstSentence:Z

    if-eqz v0, :cond_2

    .line 266
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateRoundImageView()V

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v2

    .line 269
    :goto_0
    new-instance v3, Landroid/text/SpannableString;

    iget-object v4, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentAnimatedSentence:Landroid/text/SpannableString;

    invoke-virtual {v4, v2, v1}, Landroid/text/SpannableString;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 270
    new-instance v4, Landroid/text/SpannableString;

    iget-object v5, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentAnimatedSentence:Landroid/text/SpannableString;

    invoke-virtual {v5}, Landroid/text/SpannableString;->length()I

    move-result v6

    invoke-virtual {v5, v1, v6}, Landroid/text/SpannableString;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object v4, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentAnimatedSentence:Landroid/text/SpannableString;

    if-eqz v0, :cond_4

    .line 272
    iput-object v3, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentSentenceDisplayed:Landroid/text/SpannableString;

    goto :goto_1

    .line 274
    :cond_4
    new-instance v4, Landroid/text/SpannableString;

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/CharSequence;

    iget-object v6, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentSentenceDisplayed:Landroid/text/SpannableString;

    invoke-direct {p0, v6}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->cloneWithSpans(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v6

    aput-object v6, v5, v2

    aput-object v3, v5, v1

    invoke-static {v5}, Landroid/text/TextUtils;->concat([Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-direct {v4, v1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    iput-object v4, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentSentenceDisplayed:Landroid/text/SpannableString;

    :goto_1
    if-eqz v0, :cond_5

    .line 277
    iget-boolean v1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->isFirstSentence:Z

    if-nez v1, :cond_5

    .line 278
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->stopTextViewAnimation()V

    const/16 v0, 0x12c

    .line 279
    invoke-virtual {p0, v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->startTextViewAnimation(I)V

    .line 280
    iput-boolean v2, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->imageHasBeenAnimated:Z

    goto :goto_2

    :cond_5
    if-eqz v0, :cond_6

    .line 282
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->textView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0, v3}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    iput-boolean v2, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->isFirstSentence:Z

    goto :goto_2

    .line 285
    :cond_6
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->textView:Lcom/shopkick/app/widget/SKTextView;

    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->currentSentenceDisplayed:Landroid/text/SpannableString;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/CharSequence;)V

    :goto_2
    return-void
.end method

.method static applyTextCustomization(Ljava/lang/String;Landroid/content/Context;Ljava/lang/Boolean;)Landroid/text/SpannableString;
    .locals 9

    const-string v0, "#(.*?)#"

    .line 422
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 423
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1, p0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    if-eqz v0, :cond_1

    .line 425
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    const/4 v0, 0x0

    .line 427
    :goto_0
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 428
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->start()I

    move-result v2

    mul-int/lit8 v3, v0, 0x2

    sub-int/2addr v2, v3

    .line 429
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->end()I

    move-result v4

    sub-int/2addr v4, v3

    .line 430
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/16 v5, 0x11

    if-eqz v3, :cond_0

    .line 431
    new-instance v3, Landroid/text/style/StyleSpan;

    const/16 v6, 0x8

    invoke-static {p1, v6}, Lcom/shopkick/app/widget/SKTypeface;->getDefaultTypeface(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/Typeface;->getStyle()I

    move-result v6

    invoke-direct {v3, v6}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 433
    :cond_0
    new-instance v3, Landroid/text/style/ForegroundColorSpan;

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f060120

    const/4 v8, 0x0

    invoke-virtual {v6, v7, v8}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v6

    invoke-direct {v3, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v1, v3, v2, v4, v5}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v3, v2, 0x1

    .line 435
    invoke-virtual {v1, v2, v3}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    add-int/lit8 v2, v4, -0x2

    add-int/lit8 v4, v4, -0x1

    .line 436
    invoke-virtual {v1, v2, v4}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 440
    :cond_1
    invoke-static {v1}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    move-result-object p0

    return-object p0
.end method

.method private cleanListeners()V
    .locals 1

    const/4 v0, 0x0

    .line 149
    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->textAnimationFinishListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    .line 150
    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->overlayDismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    return-void
.end method

.method private cloneWithSpans(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 2

    .line 290
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v0

    const/4 v1, 0x0

    .line 291
    invoke-static {p1, v0, v1}, Landroid/text/TextUtils;->writeToParcel(Ljava/lang/CharSequence;Landroid/os/Parcel;I)V

    .line 292
    invoke-virtual {v0, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 293
    sget-object p1, Landroid/text/TextUtils;->CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p1, v0}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    .line 294
    invoke-virtual {v0}, Landroid/os/Parcel;->recycle()V

    return-object p1
.end method

.method private finishCallback()V
    .locals 1

    .line 243
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->textAnimationFinishListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 244
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->textAnimationFinishListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    invoke-interface {v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;->onTextAnimationFinish()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$Ev_s-qu6MTkBmReZriA1e7-Z0cc(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V
    .locals 0

    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateTapIndicator()V

    return-void
.end method

.method public static synthetic lambda$animateTapIndicator$82(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V
    .locals 3

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 201
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$HX7_bMdIH9CYk-uwUPa0nNKH6rY;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$HX7_bMdIH9CYk-uwUPa0nNKH6rY;-><init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    :cond_0
    return-void
.end method

.method public static synthetic lambda$null$78(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V
    .locals 3

    .line 208
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 209
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x64

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$Ev_s-qu6MTkBmReZriA1e7-Z0cc;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$Ev_s-qu6MTkBmReZriA1e7-Z0cc;-><init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    :cond_0
    return-void
.end method

.method public static synthetic lambda$null$79(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V
    .locals 3

    .line 206
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 207
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0xc8

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$nCa-X8b10TtL5wnN8eCjAv-C0mI;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$nCa-X8b10TtL5wnN8eCjAv-C0mI;-><init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    :cond_0
    return-void
.end method

.method public static synthetic lambda$null$80(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V
    .locals 3

    .line 204
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$ofLK1rY0hpk3qtc8vRsPeUtFP3A;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$ofLK1rY0hpk3qtc8vRsPeUtFP3A;-><init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    :cond_0
    return-void
.end method

.method public static synthetic lambda$null$81(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V
    .locals 3

    .line 202
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    const-wide/16 v1, 0x12c

    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$af1c0T11_RWxxOlk2SCjJDay-yI;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/-$$Lambda$FTUEAnimationManager$af1c0T11_RWxxOlk2SCjJDay-yI;-><init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    :cond_0
    return-void
.end method

.method private prepareOverlayFadeOutAnimation()V
    .locals 2

    .line 386
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->context:Landroid/content/Context;

    const v1, 0x7f010013

    invoke-static {v0, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 387
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->overlayLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/ftue/DragConstraintLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 388
    new-instance v1, Lcom/shopkick/app/ftue/FTUEAnimationManager$4;

    invoke-direct {v1, p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager$4;-><init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method static slideInViewEnterAnimation(Landroid/view/View;)V
    .locals 3

    const/4 v0, 0x0

    .line 408
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 409
    new-instance v0, Landroid/view/animation/TranslateAnimation;

    .line 411
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    int-to-float v1, v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, v2}, Landroid/view/animation/TranslateAnimation;-><init>(FFFF)V

    const-wide/16 v1, 0x12c

    .line 413
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/TranslateAnimation;->setDuration(J)V

    .line 414
    invoke-virtual {p0, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private stopAnimateRoundImageView()V
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->clearAnimation()V

    :cond_0
    return-void
.end method

.method private stopAnimateTapIndicator()V
    .locals 3

    .line 224
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicator:Landroid/widget/RelativeLayout;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 225
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicator:Landroid/widget/RelativeLayout;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 226
    iput-object v1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicator:Landroid/widget/RelativeLayout;

    .line 228
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 229
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->clearAnimation()V

    .line 230
    iput-object v1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    .line 232
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 233
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->clearAnimation()V

    .line 234
    iput-object v1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    .line 236
    :cond_2
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 237
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/RoundImageView;->clearAnimation()V

    .line 238
    iput-object v1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    :cond_3
    return-void
.end method

.method private stopTextViewAnimation()V
    .locals 1

    .line 168
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateTextViewTimer:Ljava/util/Timer;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateTextViewTimer:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    const/4 v0, 0x0

    .line 170
    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateTextViewTimer:Ljava/util/Timer;

    :cond_0
    return-void
.end method


# virtual methods
.method animateJeanIconToEndPosition(Z)V
    .locals 11

    .line 339
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 340
    iget-boolean v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->closeAnimationStarted:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 343
    iput-boolean v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->closeAnimationStarted:Z

    .line 344
    iget v1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewLeftMargin:F

    .line 345
    iget-object v2, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    const-string/jumbo v3, "translationX"

    const/4 v4, 0x2

    new-array v5, v4, [F

    const/4 v6, 0x0

    const/4 v7, 0x0

    aput v6, v5, v7

    aput v1, v5, v0

    invoke-static {v2, v3, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    const-wide/16 v2, 0x12c

    .line 346
    invoke-virtual {v1, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 348
    iget v5, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewTopMargin:F

    .line 349
    iget-object v8, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    const-string/jumbo v9, "translationY"

    new-array v10, v4, [F

    aput v6, v10, v7

    aput v5, v10, v0

    invoke-static {v8, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v5

    .line 350
    invoke-virtual {v5, v2, v3}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 352
    new-instance v2, Landroid/animation/AnimatorSet;

    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    if-eqz p1, :cond_1

    .line 354
    new-array p1, v0, [Landroid/animation/Animator;

    aput-object v1, p1, v7

    invoke-virtual {v2, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    goto :goto_0

    .line 356
    :cond_1
    new-array p1, v4, [Landroid/animation/Animator;

    aput-object v1, p1, v7

    aput-object v5, p1, v0

    invoke-virtual {v2, p1}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 358
    :goto_0
    new-instance p1, Lcom/shopkick/app/ftue/FTUEAnimationManager$3;

    invoke-direct {p1, p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager$3;-><init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V

    invoke-virtual {v2, p1}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 381
    invoke-virtual {v2}, Landroid/animation/AnimatorSet;->start()V

    :cond_2
    return-void
.end method

.method animateJeanIconToStartPosition()V
    .locals 11

    .line 303
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    .line 304
    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 305
    iget v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewLeftMargin:F

    neg-float v0, v0

    .line 306
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    const-string/jumbo v2, "translationX"

    const/4 v3, 0x2

    new-array v4, v3, [F

    const/4 v5, 0x0

    const/4 v6, 0x0

    aput v5, v4, v6

    const/4 v7, 0x1

    aput v0, v4, v7

    invoke-static {v1, v2, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    const-wide/16 v1, 0x12c

    .line 307
    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 309
    iget v4, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewTopMargin:F

    neg-float v4, v4

    .line 310
    iget-object v8, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    const-string/jumbo v9, "translationY"

    new-array v10, v3, [F

    aput v5, v10, v6

    aput v4, v10, v7

    invoke-static {v8, v9, v10}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v4

    .line 311
    invoke-virtual {v4, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 313
    new-instance v1, Landroid/animation/AnimatorSet;

    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 314
    new-array v2, v3, [Landroid/animation/Animator;

    aput-object v0, v2, v6

    aput-object v4, v2, v7

    invoke-virtual {v1, v2}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 315
    new-instance v0, Lcom/shopkick/app/ftue/FTUEAnimationManager$2;

    invoke-direct {v0, p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager$2;-><init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;)V

    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 334
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    :cond_0
    return-void
.end method

.method cleanFTUEAnimationManager()V
    .locals 0

    .line 142
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->stopTextViewAnimation()V

    .line 143
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->stopAnimateRoundImageView()V

    .line 144
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->stopAnimateTapIndicator()V

    .line 145
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->cleanListeners()V

    return-void
.end method

.method setAnimatedSentences(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/text/SpannableString;",
            ">;)V"
        }
    .end annotation

    .line 130
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animatedSentences:Ljava/util/List;

    return-void
.end method

.method setOverlayDismissListener(Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;)V
    .locals 0

    .line 138
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->overlayDismissListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerOverlayDismissListener;

    return-void
.end method

.method setOverlayLayout(Lcom/shopkick/app/ftue/DragConstraintLayout;)V
    .locals 0

    .line 126
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->overlayLayout:Lcom/shopkick/app/ftue/DragConstraintLayout;

    return-void
.end method

.method setRoundImageView(Lcom/shopkick/app/widget/RoundImageView;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageView:Lcom/shopkick/app/widget/RoundImageView;

    return-void
.end method

.method setRoundImageViewAnimated(Lcom/shopkick/app/widget/RoundImageView;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewAnimated:Lcom/shopkick/app/widget/RoundImageView;

    return-void
.end method

.method setRoundImageViewLeftMargin(F)V
    .locals 0

    .line 102
    iput p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewLeftMargin:F

    return-void
.end method

.method setRoundImageViewTopMargin(F)V
    .locals 0

    .line 106
    iput p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->roundImageViewTopMargin:F

    return-void
.end method

.method setTapIndicator(Landroid/widget/RelativeLayout;)V
    .locals 0

    .line 110
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicator:Landroid/widget/RelativeLayout;

    return-void
.end method

.method setTapIndicatorCircle1(Lcom/shopkick/app/widget/RoundImageView;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    return-void
.end method

.method setTapIndicatorCircle2(Lcom/shopkick/app/widget/RoundImageView;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    return-void
.end method

.method setTapIndicatorCircle3(Lcom/shopkick/app/widget/RoundImageView;)V
    .locals 0

    .line 122
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    return-void
.end method

.method setTextAnimationFinishListener(Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;)V
    .locals 0

    .line 134
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->textAnimationFinishListener:Lcom/shopkick/app/ftue/FTUEAnimationManager$FTUEAnimationManagerTextAnimationFinishListener;

    return-void
.end method

.method setTextView(Lcom/shopkick/app/widget/SKTextView;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->textView:Lcom/shopkick/app/widget/SKTextView;

    return-void
.end method

.method startAnimateTapIndicator()V
    .locals 2

    .line 188
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicator:Landroid/widget/RelativeLayout;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle1:Lcom/shopkick/app/widget/RoundImageView;

    .line 189
    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle2:Lcom/shopkick/app/widget/RoundImageView;

    .line 190
    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicatorCircle3:Lcom/shopkick/app/widget/RoundImageView;

    .line 191
    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 192
    invoke-direct {p0}, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateTapIndicator()V

    .line 193
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->tapIndicator:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method startTextViewAnimation(I)V
    .locals 7

    .line 154
    iget-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->textView:Lcom/shopkick/app/widget/SKTextView;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 155
    new-instance v0, Ljava/util/Timer;

    invoke-direct {v0}, Ljava/util/Timer;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateTextViewTimer:Ljava/util/Timer;

    .line 156
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 157
    new-instance v2, Lcom/shopkick/app/ftue/FTUEAnimationManager$1;

    invoke-direct {v2, p0, v0}, Lcom/shopkick/app/ftue/FTUEAnimationManager$1;-><init>(Lcom/shopkick/app/ftue/FTUEAnimationManager;Landroid/os/Handler;)V

    .line 163
    iget-object v1, p0, Lcom/shopkick/app/ftue/FTUEAnimationManager;->animateTextViewTimer:Ljava/util/Timer;

    int-to-long v3, p1

    const-wide/16 v5, 0x2d

    invoke-virtual/range {v1 .. v6}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V

    :cond_0
    return-void
.end method
