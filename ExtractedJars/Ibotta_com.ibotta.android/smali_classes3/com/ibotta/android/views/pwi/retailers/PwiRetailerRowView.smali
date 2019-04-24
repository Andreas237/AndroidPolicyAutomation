.class public final Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;
.super Landroid/widget/LinearLayout;
.source "PwiRetailerRowView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/widget/LinearLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;",
        "Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPwiRetailerRowView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PwiRetailerRowView.kt\ncom/ibotta/android/views/pwi/retailers/PwiRetailerRowView\n*L\n1#1,58:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;",
        "Landroid/widget/LinearLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;",
        "Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewEvents;",
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
        "setEarnPercentage",
        "setLogo",
        "setTitle",
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

.field private viewEvents:Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewEvents;

.field private viewState:Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 18
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 21
    sget-object p1, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;->EMPTY:Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->viewState:Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 16
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 17
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewState$p(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;)Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;
    .locals 0

    .line 14
    iget-object p0, p0, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->viewState:Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;

    return-object p0
.end method

.method public static final synthetic access$setViewState$p(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;)V
    .locals 0

    .line 14
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->viewState:Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;

    return-void
.end method

.method private final setEarnPercentage(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;)V
    .locals 2

    .line 55
    sget v0, Lcom/ibotta/views/R$id;->tvEarn:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvEarn"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;->getPercentBack()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final setLogo(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;)V
    .locals 4

    .line 37
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;->getLogoUrl()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;->getLogoSize()Lcom/ibotta/android/views/images/Sizes;

    move-result-object p1

    .line 40
    sget v1, Lcom/ibotta/views/R$id;->ivLogo:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const-string v2, "ivLogo"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 41
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_1

    .line 43
    sget-object v1, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v1}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lcom/ibotta/views/R$id;->ivLogo:I

    invoke-virtual {p0, v3}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    check-cast p1, Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v1, v2, v0, v3, p1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    goto :goto_0

    .line 46
    :cond_1
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/images/Sizes;->getPlaceholderResId()I

    move-result v2

    sget v3, Lcom/ibotta/views/R$id;->ivLogo:I

    invoke-virtual {p0, v3}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    check-cast p1, Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v0, v1, v2, v3, p1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    :goto_0
    return-void
.end method

.method private final setTitle(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;)V
    .locals 2

    .line 51
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;->getTitle()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->bindViewEvents(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->viewEvents:Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewEvents;

    .line 32
    new-instance v0, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView$bindViewEvents$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView$bindViewEvents$1;-><init>(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewEvents;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of p1, p0, Landroid/view/View;

    if-nez p1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object p1, p0

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_0
    const/4 p1, 0x0

    .line 33
    invoke-static {p0, p1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 14
    check-cast p1, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->updateViewState(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->viewState:Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->setLogo(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;)V

    .line 26
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->setTitle(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;)V

    .line 27
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/retailers/PwiRetailerRowView;->setEarnPercentage(Lcom/ibotta/android/views/pwi/retailers/PwiRetailerViewState;)V

    return-void
.end method
