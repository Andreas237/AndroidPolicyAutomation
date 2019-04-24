.class public final Lio/fotoapparat/view/FeedbackCircleView;
.super Landroid/widget/FrameLayout;
.source "FeedbackCircleView.kt"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nFeedbackCircleView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackCircleView.kt\nio/fotoapparat/view/FeedbackCircleView\n*L\n1#1,84:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B%\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u0008J\"\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f2\u0008\u0008\u0001\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001d\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0000\u00a2\u0006\u0002\u0008\u0019R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/fotoapparat/view/FeedbackCircleView;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "animatorSet",
        "Landroid/animation/AnimatorSet;",
        "inner",
        "Landroid/widget/ImageView;",
        "outer",
        "newAnimator",
        "Landroid/animation/Animator;",
        "kotlin.jvm.PlatformType",
        "id",
        "target",
        "Landroid/view/View;",
        "showAt",
        "",
        "x",
        "",
        "y",
        "showAt$fotoapparat_release",
        "fotoapparat_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final animatorSet:Landroid/animation/AnimatorSet;

.field private final inner:Landroid/widget/ImageView;

.field private final outer:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lio/fotoapparat/view/FeedbackCircleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lio/fotoapparat/view/FeedbackCircleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 25
    sget v1, Lio/fotoapparat/R$drawable;->focus_inner:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    invoke-direct {v1, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 26
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v1, 0x0

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 24
    iput-object v0, p0, Lio/fotoapparat/view/FeedbackCircleView;->inner:Landroid/widget/ImageView;

    .line 35
    new-instance v0, Landroid/widget/ImageView;

    invoke-direct {v0, p1, p2, p3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    sget p2, Lio/fotoapparat/R$drawable;->focus_outer:I

    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 37
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 38
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p2, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 37
    invoke-virtual {v0, p2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 43
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAlpha(F)V

    .line 35
    iput-object v0, p0, Lio/fotoapparat/view/FeedbackCircleView;->outer:Landroid/widget/ImageView;

    .line 46
    new-instance p2, Landroid/animation/AnimatorSet;

    invoke-direct {p2}, Landroid/animation/AnimatorSet;-><init>()V

    const/4 p3, 0x2

    .line 47
    new-array p3, p3, [Landroid/animation/Animator;

    .line 48
    sget v0, Lio/fotoapparat/R$animator;->focus_outer:I

    iget-object v1, p0, Lio/fotoapparat/view/FeedbackCircleView;->outer:Landroid/widget/ImageView;

    check-cast v1, Landroid/view/View;

    invoke-direct {p0, v0, v1}, Lio/fotoapparat/view/FeedbackCircleView;->newAnimator(ILandroid/view/View;)Landroid/animation/Animator;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p3, v1

    .line 49
    sget v0, Lio/fotoapparat/R$animator;->focus_inner:I

    iget-object v2, p0, Lio/fotoapparat/view/FeedbackCircleView;->inner:Landroid/widget/ImageView;

    check-cast v2, Landroid/view/View;

    invoke-direct {p0, v0, v2}, Lio/fotoapparat/view/FeedbackCircleView;->newAnimator(ILandroid/view/View;)Landroid/animation/Animator;

    move-result-object v0

    const/4 v2, 0x1

    aput-object v0, p3, v2

    .line 47
    invoke-virtual {p2, p3}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 46
    iput-object p2, p0, Lio/fotoapparat/view/FeedbackCircleView;->animatorSet:Landroid/animation/AnimatorSet;

    .line 54
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    .line 55
    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    .line 56
    sget p3, Lio/fotoapparat/R$dimen;->focus_diameter:I

    invoke-virtual {p1, p3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p3

    .line 57
    sget v0, Lio/fotoapparat/R$dimen;->focus_diameter:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 55
    invoke-direct {p2, p3, p1}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 54
    invoke-virtual {p0, p2}, Lio/fotoapparat/view/FeedbackCircleView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    invoke-virtual {p0, v1}, Lio/fotoapparat/view/FeedbackCircleView;->setClipToPadding(Z)V

    .line 61
    invoke-virtual {p0, v1}, Lio/fotoapparat/view/FeedbackCircleView;->setClipChildren(Z)V

    .line 63
    iget-object p1, p0, Lio/fotoapparat/view/FeedbackCircleView;->outer:Landroid/widget/ImageView;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lio/fotoapparat/view/FeedbackCircleView;->addView(Landroid/view/View;)V

    .line 64
    iget-object p1, p0, Lio/fotoapparat/view/FeedbackCircleView;->inner:Landroid/widget/ImageView;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p0, p1}, Lio/fotoapparat/view/FeedbackCircleView;->addView(Landroid/view/View;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 20
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 21
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lio/fotoapparat/view/FeedbackCircleView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private final newAnimator(ILandroid/view/View;)Landroid/animation/Animator;
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/AnimatorRes;
        .end annotation
    .end param

    .line 80
    invoke-virtual {p0}, Lio/fotoapparat/view/FeedbackCircleView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/animation/AnimatorInflater;->loadAnimator(Landroid/content/Context;I)Landroid/animation/Animator;

    move-result-object p1

    .line 81
    invoke-virtual {p1, p2}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    return-object p1
.end method


# virtual methods
.method public final showAt$fotoapparat_release(FF)V
    .locals 0

    .line 72
    invoke-virtual {p0, p1}, Lio/fotoapparat/view/FeedbackCircleView;->setTranslationX(F)V

    .line 73
    invoke-virtual {p0, p2}, Lio/fotoapparat/view/FeedbackCircleView;->setTranslationY(F)V

    .line 75
    iget-object p1, p0, Lio/fotoapparat/view/FeedbackCircleView;->animatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->cancel()V

    .line 76
    iget-object p1, p0, Lio/fotoapparat/view/FeedbackCircleView;->animatorSet:Landroid/animation/AnimatorSet;

    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->start()V

    return-void
.end method
