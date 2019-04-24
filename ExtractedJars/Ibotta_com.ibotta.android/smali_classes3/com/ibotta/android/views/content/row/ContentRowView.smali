.class public final Lcom/ibotta/android/views/content/row/ContentRowView;
.super Landroid/support/constraint/ConstraintLayout;
.source "ContentRowView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/content/row/ContentRowViewState;",
        "Lcom/ibotta/android/views/content/row/ContentRowViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nContentRowView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentRowView.kt\ncom/ibotta/android/views/content/row/ContentRowView\n*L\n1#1,161:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u0014H\u0002J\u0008\u0010\u0015\u001a\u00020\u000fH\u0014J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0014H\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0014H\u0002J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\"H\u0002J\u0010\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010\'\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010(\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010)\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010*\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006+"
    }
    d2 = {
        "Lcom/ibotta/android/views/content/row/ContentRowView;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/content/row/ContentRowViewState;",
        "Lcom/ibotta/android/views/content/row/ContentRowViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "viewEvents",
        "viewState",
        "bindViewEvents",
        "",
        "isTopBias",
        "",
        "loadImage",
        "Lcom/ibotta/android/images/ImageLoadJob;",
        "Lcom/ibotta/android/views/content/row/ContentImageViewState;",
        "onFinishInflate",
        "resizeImageView",
        "setSummaryBias",
        "updateBadgeViewState",
        "badgeView",
        "Landroid/view/View;",
        "badgeViewState",
        "Lcom/ibotta/android/views/offer/badge/BadgeViewState;",
        "(Landroid/view/View;Lcom/ibotta/android/views/offer/badge/BadgeViewState;)Lkotlin/Unit;",
        "updateContentActionButton",
        "Lcom/ibotta/android/views/base/button/IbottaButtonViewState;",
        "updateIconImage",
        "updateRetailerStack",
        "Lcom/ibotta/android/views/spotlight/RetailerStackViewState;",
        "updateSummaryBottom",
        "summaryContentViewState",
        "Lcom/ibotta/android/views/content/SummaryContentViewState;",
        "updateSummaryBottomDescription",
        "updateSummaryCenter",
        "updateSummaryContent",
        "updateSummaryTop",
        "updateViewState",
        "ibotta-views_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private _$_findViewCache:Ljava/util/HashMap;

.field private viewEvents:Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

.field private viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/content/row/ContentRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/content/row/ContentRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
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

    .line 36
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 38
    sget-object p1, Lcom/ibotta/android/views/content/row/ContentRowViewState;->EMPTY:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    iput-object p1, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 34
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 35
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/content/row/ContentRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewEvents$p(Lcom/ibotta/android/views/content/row/ContentRowView;)Lcom/ibotta/android/views/content/row/ContentRowViewEvents;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewEvents:Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

    return-object p0
.end method

.method public static final synthetic access$getViewState$p(Lcom/ibotta/android/views/content/row/ContentRowView;)Lcom/ibotta/android/views/content/row/ContentRowViewState;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    return-object p0
.end method

.method public static final synthetic access$setViewEvents$p(Lcom/ibotta/android/views/content/row/ContentRowView;Lcom/ibotta/android/views/content/row/ContentRowViewEvents;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewEvents:Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

    return-void
.end method

.method public static final synthetic access$setViewState$p(Lcom/ibotta/android/views/content/row/ContentRowView;Lcom/ibotta/android/views/content/row/ContentRowViewState;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    return-void
.end method

.method private final isTopBias(Lcom/ibotta/android/views/content/row/ContentRowViewState;)Z
    .locals 4

    .line 156
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getFirstBadgeViewState()Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->GONE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getSecondBadgeViewState()Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object v0

    sget-object v3, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->GONE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getRetailerStackViewState()Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    move-result-object v0

    sget-object v3, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->GONE:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 157
    :goto_1
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getContentImageViewState()Lcom/ibotta/android/views/content/row/ContentImageViewState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentImageViewState;->getResizeContentImage()Z

    move-result p1

    if-eqz v0, :cond_2

    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method private final loadImage(Lcom/ibotta/android/views/content/row/ContentImageViewState;)Lcom/ibotta/android/images/ImageLoadJob;
    .locals 4

    .line 86
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentImageViewState;->getImageSize()Lcom/ibotta/android/images/ImageCache$Size;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 87
    sget-object v1, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v1}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/views/content/row/ContentRowView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentImageViewState;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    sget v3, Lcom/ibotta/views/R$id;->ivContentImage:I

    invoke-virtual {p0, v3}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    invoke-interface {v1, v2, p1, v3, v0}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private final resizeImageView(Lcom/ibotta/android/views/content/row/ContentImageViewState;)V
    .locals 4

    .line 92
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentImageViewState;->getResizeContentImage()Z

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getContentImageViewState()Lcom/ibotta/android/views/content/row/ContentImageViewState;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/views/content/row/ContentImageViewState;->getResizeContentImage()Z

    move-result v1

    if-eq v0, v1, :cond_1

    .line 93
    sget v0, Lcom/ibotta/views/R$id;->ivContentImage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivContentImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentImageViewState;->getResizeContentImage()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 95
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-virtual {p0}, Lcom/ibotta/android/views/content/row/ContentRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$dimen;->size_80:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    const/4 v2, -0x1

    invoke-direct {v0, v2, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 96
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v1, v2, v2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 98
    sget v2, Lcom/ibotta/views/R$id;->ivContentImage:I

    invoke-virtual {p0, v2}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    const-string v3, "ivContentImage"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentImageViewState;->getResizeContentImage()Z

    move-result p1

    if-eqz p1, :cond_0

    check-cast v1, Landroid/view/ViewGroup$LayoutParams;

    goto :goto_0

    :cond_0
    move-object v1, v0

    check-cast v1, Landroid/view/ViewGroup$LayoutParams;

    :goto_0
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 99
    sget p1, Lcom/ibotta/views/R$id;->cvContentImage:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v7/widget/CardView;

    invoke-virtual {p1}, Landroid/support/v7/widget/CardView;->requestLayout()V

    :cond_1
    return-void
.end method

.method private final setSummaryBias(Lcom/ibotta/android/views/content/row/ContentRowViewState;)V
    .locals 4

    .line 144
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->isTopBias(Lcom/ibotta/android/views/content/row/ContentRowViewState;)Z

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-direct {p0, v1}, Lcom/ibotta/android/views/content/row/ContentRowView;->isTopBias(Lcom/ibotta/android/views/content/row/ContentRowViewState;)Z

    move-result v1

    if-eq v0, v1, :cond_1

    .line 145
    new-instance v0, Landroid/support/constraint/ConstraintSet;

    invoke-direct {v0}, Landroid/support/constraint/ConstraintSet;-><init>()V

    .line 146
    move-object v1, p0

    check-cast v1, Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintSet;->clone(Landroid/support/constraint/ConstraintLayout;)V

    .line 147
    sget v2, Lcom/ibotta/views/R$id;->tvSummaryTop:I

    invoke-virtual {p0, v2}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const-string v3, "tvSummaryTop"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/widget/TextView;->getId()I

    move-result v2

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->isTopBias(Lcom/ibotta/android/views/content/row/ContentRowViewState;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/high16 p1, 0x3f000000    # 0.5f

    :goto_0
    invoke-virtual {v0, v2, p1}, Landroid/support/constraint/ConstraintSet;->setVerticalBias(IF)V

    .line 148
    invoke-virtual {v0, v1}, Landroid/support/constraint/ConstraintSet;->applyTo(Landroid/support/constraint/ConstraintLayout;)V

    :cond_1
    return-void
.end method

.method private final updateBadgeViewState(Landroid/view/View;Lcom/ibotta/android/views/offer/badge/BadgeViewState;)Lkotlin/Unit;
    .locals 2

    .line 113
    instance-of v0, p1, Lcom/ibotta/android/views/offer/badge/BadgeView;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object p1, v1

    :cond_0
    check-cast p1, Lcom/ibotta/android/views/offer/badge/BadgeView;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, Lcom/ibotta/android/views/offer/badge/BadgeView;->updateViewState(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_1
    return-object v1
.end method

.method private final updateContentActionButton(Lcom/ibotta/android/views/base/button/IbottaButtonViewState;)V
    .locals 2

    .line 71
    sget v0, Lcom/ibotta/views/R$id;->iibContentAction:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->updateViewState(Lcom/ibotta/android/views/base/button/IbottaButtonViewState;)V

    .line 73
    sget v0, Lcom/ibotta/views/R$id;->iibContentAction:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    const-string v1, "iibContentAction"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lcom/ibotta/android/views/base/button/IbottaButtonViewState;->EMPTY:Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->setVisibility(I)V

    return-void
.end method

.method private final updateIconImage(Lcom/ibotta/android/views/content/row/ContentImageViewState;)V
    .locals 3

    .line 77
    iget-object v0, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getContentImageViewState()Lcom/ibotta/android/views/content/row/ContentImageViewState;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 79
    :cond_0
    sget v0, Lcom/ibotta/views/R$id;->ivContentImage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivContentImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentImageViewState;->getCenterCropImage()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    goto :goto_0

    :cond_1
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 80
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->loadImage(Lcom/ibotta/android/views/content/row/ContentImageViewState;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 81
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->resizeImageView(Lcom/ibotta/android/views/content/row/ContentImageViewState;)V

    .line 82
    sget v0, Lcom/ibotta/views/R$id;->cvContentImage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/CardView;

    const-string v1, "cvContentImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/content/row/ContentRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentImageViewState;->getImageElevation()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/CardView;->setCardElevation(F)V

    .line 83
    sget v0, Lcom/ibotta/views/R$id;->cvContentImage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/CardView;

    const-string v1, "cvContentImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/content/row/ContentRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentImageViewState;->getCornerRadius()I

    move-result p1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    int-to-float p1, p1

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/CardView;->setRadius(F)V

    return-void
.end method

.method private final updateRetailerStack(Lcom/ibotta/android/views/spotlight/RetailerStackViewState;)V
    .locals 1

    .line 137
    sget v0, Lcom/ibotta/views/R$id;->ivRetailerStack:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/spotlight/RetailerStackView;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->updateViewState(Lcom/ibotta/android/views/spotlight/RetailerStackViewState;)V

    return-void
.end method

.method private final updateSummaryBottom(Lcom/ibotta/android/views/content/SummaryContentViewState;)V
    .locals 3

    .line 125
    sget v0, Lcom/ibotta/views/R$id;->tvSummaryBottom:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSummaryBottom"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getBottomText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 126
    sget v0, Lcom/ibotta/views/R$id;->tvSummaryBottom:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSummaryBottom"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getBottomText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    const/16 v2, 0x8

    :cond_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 127
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getBottomTextMaxLines()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget v0, Lcom/ibotta/views/R$id;->tvSummaryBottom:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSummaryBottom"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    :cond_2
    return-void
.end method

.method private final updateSummaryBottomDescription(Lcom/ibotta/android/views/content/SummaryContentViewState;)V
    .locals 2

    .line 131
    sget v0, Lcom/ibotta/views/R$id;->tvSummaryBottomDescription:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSummaryBottomDescription"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getBottomSubText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 133
    sget v0, Lcom/ibotta/views/R$id;->tvSummaryBottomDescription:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSummaryBottomDescription"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getBottomSubText()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/16 v1, 0x8

    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private final updateSummaryCenter(Lcom/ibotta/android/views/content/SummaryContentViewState;)V
    .locals 2

    .line 120
    sget v0, Lcom/ibotta/views/R$id;->tvSummaryCenter:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSummaryCenter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getCenterText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 121
    sget v0, Lcom/ibotta/views/R$id;->tvSummaryCenter:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSummaryCenter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getCenterText()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    const/16 v1, 0x8

    :cond_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private final updateSummaryContent(Lcom/ibotta/android/views/content/SummaryContentViewState;)V
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-virtual {v0}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getSummaryContentViewState()Lcom/ibotta/android/views/content/SummaryContentViewState;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 105
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateSummaryTop(Lcom/ibotta/android/views/content/SummaryContentViewState;)V

    .line 106
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateSummaryCenter(Lcom/ibotta/android/views/content/SummaryContentViewState;)V

    .line 107
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateSummaryBottom(Lcom/ibotta/android/views/content/SummaryContentViewState;)V

    .line 108
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateSummaryBottomDescription(Lcom/ibotta/android/views/content/SummaryContentViewState;)V

    :cond_0
    return-void
.end method

.method private final updateSummaryTop(Lcom/ibotta/android/views/content/SummaryContentViewState;)V
    .locals 2

    .line 116
    sget v0, Lcom/ibotta/views/R$id;->tvSummaryTop:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSummaryTop"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/SummaryContentViewState;->getTopText()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->bindViewEvents(Lcom/ibotta/android/views/content/row/ContentRowViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/content/row/ContentRowViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/content/row/ContentRowViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewEvents:Lcom/ibotta/android/views/content/row/ContentRowViewEvents;

    .line 56
    sget p1, Lcom/ibotta/views/R$id;->ivRetailerStack:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/spotlight/RetailerStackView;

    new-instance v0, Lcom/ibotta/android/views/content/row/ContentRowView$bindViewEvents$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/content/row/ContentRowView$bindViewEvents$1;-><init>(Lcom/ibotta/android/views/content/row/ContentRowView;)V

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lcom/ibotta/android/views/components/ClickableViewEventKt;->ClickableViewEvent(Lkotlin/jvm/functions/Function0;)Lcom/ibotta/android/views/components/ClickableViewEvent;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    return-void
.end method

.method protected onFinishInflate()V
    .locals 2

    .line 62
    invoke-super {p0}, Landroid/support/constraint/ConstraintLayout;->onFinishInflate()V

    .line 63
    sget v0, Lcom/ibotta/views/R$id;->iibContentAction:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/base/button/IbottaImageButton;

    new-instance v1, Lcom/ibotta/android/views/content/row/ContentRowView$onFinishInflate$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/content/row/ContentRowView$onFinishInflate$1;-><init>(Lcom/ibotta/android/views/content/row/ContentRowView;)V

    check-cast v1, Lcom/ibotta/android/views/components/ClickableViewEvent;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/base/button/IbottaImageButton;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    .line 66
    new-instance v0, Lcom/ibotta/android/views/content/row/ContentRowView$onFinishInflate$2;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/content/row/ContentRowView$onFinishInflate$2;-><init>(Lcom/ibotta/android/views/content/row/ContentRowView;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const/4 v0, 0x0

    .line 67
    invoke-static {p0, v0}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 32
    check-cast p1, Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateViewState(Lcom/ibotta/android/views/content/row/ContentRowViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/content/row/ContentRowViewState;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/content/row/ContentRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 43
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getMainButtonViewState()Lcom/ibotta/android/views/base/button/IbottaButtonViewState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateContentActionButton(Lcom/ibotta/android/views/base/button/IbottaButtonViewState;)V

    .line 44
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getContentImageViewState()Lcom/ibotta/android/views/content/row/ContentImageViewState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateIconImage(Lcom/ibotta/android/views/content/row/ContentImageViewState;)V

    .line 45
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getSummaryContentViewState()Lcom/ibotta/android/views/content/SummaryContentViewState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateSummaryContent(Lcom/ibotta/android/views/content/SummaryContentViewState;)V

    .line 46
    sget v0, Lcom/ibotta/views/R$id;->ibvFirst:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "ibvFirst"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getFirstBadgeViewState()Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateBadgeViewState(Landroid/view/View;Lcom/ibotta/android/views/offer/badge/BadgeViewState;)Lkotlin/Unit;

    .line 47
    sget v0, Lcom/ibotta/views/R$id;->ibvSecond:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    const-string v1, "ibvSecond"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getSecondBadgeViewState()Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateBadgeViewState(Landroid/view/View;Lcom/ibotta/android/views/offer/badge/BadgeViewState;)Lkotlin/Unit;

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/android/views/content/row/ContentRowViewState;->getRetailerStackViewState()Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/content/row/ContentRowView;->updateRetailerStack(Lcom/ibotta/android/views/spotlight/RetailerStackViewState;)V

    .line 49
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/content/row/ContentRowView;->setSummaryBias(Lcom/ibotta/android/views/content/row/ContentRowViewState;)V

    .line 51
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/views/content/row/ContentRowView;->viewState:Lcom/ibotta/android/views/content/row/ContentRowViewState;

    return-void
.end method
