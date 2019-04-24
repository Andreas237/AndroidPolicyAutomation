.class public final Lcom/ibotta/android/views/offer/badge/BadgeView;
.super Landroid/widget/LinearLayout;
.source "BadgeView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/LinearLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/offer/badge/BadgeViewState;",
        "Lcom/ibotta/android/views/components/NoViewEvents;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B/\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0012\u0010\u0014\u001a\u00020\u000f2\u0008\u0008\u0001\u0010\u0015\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ibotta/android/views/offer/badge/BadgeView;",
        "Landroid/widget/LinearLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/offer/badge/BadgeViewState;",
        "Lcom/ibotta/android/views/components/NoViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "defStyleRes",
        "(Landroid/content/Context;Landroid/util/AttributeSet;II)V",
        "viewState",
        "bindViewEvents",
        "",
        "viewEvents",
        "updateBackground",
        "updateContentDescription",
        "updateImageResource",
        "updateImageViewLayoutParams",
        "requestedSize",
        "updateText",
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

.field private viewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/offer/badge/BadgeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
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

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/offer/badge/BadgeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 7
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

    const/4 v4, 0x0

    const/16 v5, 0x8

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/views/offer/badge/BadgeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
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

    .line 18
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 20
    sget-object p1, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->GONE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    iput-object p1, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->viewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    const/4 p2, 0x0

    .line 15
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_1

    const/4 p3, 0x0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    .line 17
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/ibotta/android/views/offer/badge/BadgeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method private final updateBackground(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V
    .locals 2

    .line 62
    invoke-virtual {p1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->getBackgroundDrawableResource()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->viewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->getBackgroundDrawableResource()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 63
    invoke-virtual {p0}, Lcom/ibotta/android/views/offer/badge/BadgeView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->getBackgroundDrawableResource()I

    move-result p1

    invoke-static {v0, p1}, Landroid/support/v4/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/offer/badge/BadgeView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method

.method private final updateContentDescription(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V
    .locals 2

    .line 58
    sget v0, Lcom/ibotta/views/R$id;->tvBadge:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/offer/badge/BadgeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvBadge"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->getContentDescription()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setContentDescription(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final updateImageResource(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V
    .locals 2

    .line 52
    invoke-virtual {p1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->getImageResource()I

    move-result v0

    iget-object v1, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->viewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->getImageResource()I

    move-result v1

    if-eq v0, v1, :cond_0

    .line 53
    sget v0, Lcom/ibotta/views/R$id;->ivBadge:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/offer/badge/BadgeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->getImageResource()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-void
.end method

.method private final updateImageViewLayoutParams(I)V
    .locals 2
    .param p1    # I
        .annotation build Landroid/support/annotation/DimenRes;
        .end annotation
    .end param

    .line 68
    sget v0, Lcom/ibotta/views/R$id;->ivBadge:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/offer/badge/BadgeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivBadge"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/android/views/offer/badge/BadgeView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result p1

    .line 71
    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    if-ne v1, p1, :cond_0

    iget v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-eq v1, p1, :cond_1

    .line 72
    :cond_0
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 73
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 74
    sget p1, Lcom/ibotta/views/R$id;->ivBadge:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/offer/badge/BadgeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string v1, "ivBadge"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_1
    return-void
.end method

.method private final updateText(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V
    .locals 2

    .line 46
    invoke-virtual {p1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->getText()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->viewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-virtual {v1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 47
    sget v0, Lcom/ibotta/views/R$id;->tvBadge:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/offer/badge/BadgeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvBadge"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->getText()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/components/NoViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/components/NoViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/views/components/NoViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/offer/badge/BadgeView;->bindViewEvents(Lcom/ibotta/android/views/components/NoViewEvents;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 13
    check-cast p1, Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/offer/badge/BadgeView;->updateViewState(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/offer/badge/BadgeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->viewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->viewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    return-void

    .line 31
    :cond_0
    sget-object v0, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->GONE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x8

    goto :goto_0

    .line 32
    :cond_1
    sget-object v0, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->INVISIBLE:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x4

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    .line 30
    :goto_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/offer/badge/BadgeView;->setVisibility(I)V

    .line 36
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/offer/badge/BadgeView;->updateText(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V

    .line 37
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/offer/badge/BadgeView;->updateImageResource(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V

    .line 38
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/offer/badge/BadgeView;->updateContentDescription(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V

    .line 39
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/offer/badge/BadgeView;->updateBackground(Lcom/ibotta/android/views/offer/badge/BadgeViewState;)V

    .line 40
    invoke-virtual {p1}, Lcom/ibotta/android/views/offer/badge/BadgeViewState;->getImageSize()I

    move-result v0

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/offer/badge/BadgeView;->updateImageViewLayoutParams(I)V

    .line 42
    iput-object p1, p0, Lcom/ibotta/android/views/offer/badge/BadgeView;->viewState:Lcom/ibotta/android/views/offer/badge/BadgeViewState;

    return-void
.end method
