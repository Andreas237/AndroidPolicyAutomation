.class public final Lcom/ibotta/android/views/spotlight/RetailerStackView;
.super Landroid/widget/FrameLayout;
.source "RetailerStackView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/FrameLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/spotlight/RetailerStackViewState;",
        "Lcom/ibotta/android/views/components/ClickableViewEvent;",
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
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u000e\u0010\u000c\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/views/spotlight/RetailerStackView;",
        "Landroid/widget/FrameLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/spotlight/RetailerStackViewState;",
        "Lcom/ibotta/android/views/components/ClickableViewEvent;",
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
        "loadImageFromViewState",
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

.field private viewEvents:Lcom/ibotta/android/views/components/ClickableViewEvent;

.field private viewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/spotlight/RetailerStackView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/spotlight/RetailerStackView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 21
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 23
    sget-object p2, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->GONE:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    iput-object p2, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->viewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    .line 24
    sget-object p2, Lcom/ibotta/android/views/spotlight/RetailerStackView$viewEvents$1;->INSTANCE:Lcom/ibotta/android/views/spotlight/RetailerStackView$viewEvents$1;

    check-cast p2, Lkotlin/jvm/functions/Function0;

    invoke-static {p2}, Lcom/ibotta/android/views/components/ClickableViewEventKt;->ClickableViewEvent(Lkotlin/jvm/functions/Function0;)Lcom/ibotta/android/views/components/ClickableViewEvent;

    move-result-object p2

    iput-object p2, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->viewEvents:Lcom/ibotta/android/views/components/ClickableViewEvent;

    .line 27
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/ibotta/views/R$layout;->view_retailer_stack_image:I

    move-object p3, p0

    check-cast p3, Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 28
    sget p1, Lcom/ibotta/views/R$id;->ivLogo:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    const-string p2, "ivLogo"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setClipToOutline(Z)V

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

    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/spotlight/RetailerStackView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewEvents$p(Lcom/ibotta/android/views/spotlight/RetailerStackView;)Lcom/ibotta/android/views/components/ClickableViewEvent;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->viewEvents:Lcom/ibotta/android/views/components/ClickableViewEvent;

    return-object p0
.end method

.method public static final synthetic access$setViewEvents$p(Lcom/ibotta/android/views/spotlight/RetailerStackView;Lcom/ibotta/android/views/components/ClickableViewEvent;)V
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->viewEvents:Lcom/ibotta/android/views/components/ClickableViewEvent;

    return-void
.end method

.method private final loadImageFromViewState(Lcom/ibotta/android/views/spotlight/RetailerStackViewState;)V
    .locals 4

    .line 56
    invoke-virtual {p1}, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 57
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->getIconUrl()Ljava/lang/String;

    move-result-object p1

    sget v2, Lcom/ibotta/views/R$id;->ivLogo:I

    invoke-virtual {p0, v2}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->MODEL_C_RETAILER_ROW:Lcom/ibotta/android/views/images/Sizes;

    check-cast v3, Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    :cond_0
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/components/ClickableViewEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    iget-object v0, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->viewEvents:Lcom/ibotta/android/views/components/ClickableViewEvent;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 51
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->viewEvents:Lcom/ibotta/android/views/components/ClickableViewEvent;

    .line 52
    sget p1, Lcom/ibotta/views/R$id;->ivLogo:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    new-instance v0, Lcom/ibotta/android/views/spotlight/RetailerStackView$bindViewEvents$1;

    invoke-direct {v0, p0}, Lcom/ibotta/android/views/spotlight/RetailerStackView$bindViewEvents$1;-><init>(Lcom/ibotta/android/views/spotlight/RetailerStackView;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p1, Landroid/view/View;

    if-nez v1, :cond_1

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 19
    check-cast p1, Lcom/ibotta/android/views/components/ClickableViewEvent;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->bindViewEvents(Lcom/ibotta/android/views/components/ClickableViewEvent;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 19
    check-cast p1, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->updateViewState(Lcom/ibotta/android/views/spotlight/RetailerStackViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/spotlight/RetailerStackViewState;)V
    .locals 6
    .param p1    # Lcom/ibotta/android/views/spotlight/RetailerStackViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->viewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 34
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->getVisibility()Lcom/ibotta/android/views/components/Visibility;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/spotlight/RetailerStackView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/ibotta/android/views/components/Visibility;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1

    const/16 v0, 0x8

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->setVisibility(I)V

    .line 39
    sget v0, Lcom/ibotta/views/R$id;->ivStack:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v4, "ivStack"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/spotlight/RetailerStackViewState;->getStackVisibility()Lcom/ibotta/android/views/components/Visibility;

    move-result-object v4

    sget-object v5, Lcom/ibotta/android/views/spotlight/RetailerStackView$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {v4}, Lcom/ibotta/android/views/components/Visibility;->ordinal()I

    move-result v4

    aget v4, v5, v4

    if-eq v4, v3, :cond_2

    const/16 v1, 0x8

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 44
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/spotlight/RetailerStackView;->loadImageFromViewState(Lcom/ibotta/android/views/spotlight/RetailerStackViewState;)V

    .line 45
    iput-object p1, p0, Lcom/ibotta/android/views/spotlight/RetailerStackView;->viewState:Lcom/ibotta/android/views/spotlight/RetailerStackViewState;

    return-void
.end method
