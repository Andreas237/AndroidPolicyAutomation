.class public final Lcom/ibotta/android/views/retailers/RetailerSSCardView;
.super Landroid/widget/LinearLayout;
.source "RetailerSSCardView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/LinearLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;",
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
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\t\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0008\u0010\u0010\u001a\u00020\u000fH\u0002J\u0008\u0010\u0011\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/ibotta/android/views/retailers/RetailerSSCardView;",
        "Landroid/widget/LinearLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;",
        "Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;",
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
        "initImageHeight",
        "initLayout",
        "onClick",
        "updateClickListener",
        "updateImage",
        "updateLabel",
        "updateType",
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

.field private viewEvents:Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;

.field private viewState:Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 12
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
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 24
    new-instance p1, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0xff

    const/4 v11, 0x0

    move-object v1, p1

    invoke-direct/range {v1 .. v11}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;-><init>(Lcom/ibotta/android/apiandroid/content/ContentId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLcom/ibotta/android/tracking/content/TrackingPayload;Lcom/ibotta/android/views/list/ContentViewState$ContentType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->viewState:Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    .line 28
    invoke-direct {p0}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->initLayout()V

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
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$onClick(Lcom/ibotta/android/views/retailers/RetailerSSCardView;Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V
    .locals 0

    .line 18
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->onClick(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V

    return-void
.end method

.method private final initImageHeight()V
    .locals 4

    .line 37
    sget v0, Lcom/ibotta/views/R$id;->ivImage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 38
    sget-object v2, Lcom/ibotta/android/views/util/CardHelper;->INSTANCE:Lcom/ibotta/android/views/util/CardHelper;

    invoke-virtual {v2}, Lcom/ibotta/android/views/util/CardHelper;->getRetailerSsWidth()I

    move-result v2

    .line 39
    sget-object v3, Lcom/ibotta/android/views/util/CardHelper;->INSTANCE:Lcom/ibotta/android/views/util/CardHelper;

    invoke-virtual {v3}, Lcom/ibotta/android/views/util/CardHelper;->getSsRetailerCardHeight()I

    move-result v3

    .line 37
    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    check-cast v1, Landroid/view/ViewGroup$LayoutParams;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method private final initLayout()V
    .locals 2

    .line 32
    move-object v0, p0

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableForegroundRipple(Landroid/view/View;Z)V

    const/4 v0, 0x1

    .line 33
    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->setOrientation(I)V

    return-void
.end method

.method private final onClick(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V
    .locals 2

    .line 60
    invoke-virtual {p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;->getContentId()Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->getIntId()I

    move-result p1

    const/4 v0, 0x2

    invoke-static {v0, p1}, Lcom/ibotta/android/apiandroid/content/ContentId;->create(II)Lcom/ibotta/android/apiandroid/content/ContentId;

    move-result-object p1

    .line 61
    iget-object v0, p0, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->viewEvents:Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;

    if-eqz v0, :cond_0

    const-string v1, "contentId"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;->onRetailerClicked(Lcom/ibotta/android/apiandroid/content/ContentId;)V

    :cond_0
    return-void
.end method

.method private final updateClickListener(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V
    .locals 1

    .line 65
    new-instance v0, Lcom/ibotta/android/views/retailers/RetailerSSCardView$updateClickListener$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardView$updateClickListener$1;-><init>(Lcom/ibotta/android/views/retailers/RetailerSSCardView;Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of p1, p0, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    return-void
.end method

.method private final updateImage(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V
    .locals 4

    .line 69
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    sget v2, Lcom/ibotta/views/R$id;->ivImage:I

    invoke-virtual {p0, v2}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->RETAILER_SMALL_CARD:Lcom/ibotta/android/views/images/Sizes;

    check-cast v3, Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private final updateLabel(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V
    .locals 2

    .line 73
    sget v0, Lcom/ibotta/views/R$id;->tvLabel:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;->getLabel()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final updateType(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V
    .locals 2

    .line 77
    sget v0, Lcom/ibotta/views/R$id;->tvType:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;->getType()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->bindViewEvents(Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->viewEvents:Lcom/ibotta/android/views/retailers/RetailerSSCardViewEvents;

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 18
    check-cast p1, Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->updateViewState(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->viewState:Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 46
    :cond_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->updateImage(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->updateLabel(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V

    .line 48
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->updateType(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V

    .line 49
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->updateClickListener(Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;)V

    .line 50
    invoke-direct {p0}, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->initImageHeight()V

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/views/retailers/RetailerSSCardView;->viewState:Lcom/ibotta/android/views/retailers/RetailerSSCardViewState;

    return-void
.end method
