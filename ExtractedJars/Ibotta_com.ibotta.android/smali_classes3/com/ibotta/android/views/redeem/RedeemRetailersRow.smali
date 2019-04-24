.class public final Lcom/ibotta/android/views/redeem/RedeemRetailersRow;
.super Landroid/support/constraint/ConstraintLayout;
.source "RedeemRetailersRow.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRedeemRetailersRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RedeemRetailersRow.kt\ncom/ibotta/android/views/redeem/RedeemRetailersRow\n*L\n1#1,81:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0002J\u0018\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/ibotta/android/views/redeem/RedeemRetailersRow;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;",
        "Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;",
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
        "setAppToAppDescription",
        "setContent",
        "setEmptyRow",
        "setEmptyText",
        "setRetailerLogoUrl",
        "Lcom/ibotta/android/images/ImageLoadJob;",
        "setRetailerName",
        "toggleView",
        "view",
        "Landroid/view/View;",
        "show",
        "",
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

.field private viewEvents:Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;

.field private viewState:Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 20
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 18
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 19
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewEvents$p(Lcom/ibotta/android/views/redeem/RedeemRetailersRow;)Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;
    .locals 0

    .line 16
    iget-object p0, p0, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->viewEvents:Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;

    return-object p0
.end method

.method public static final synthetic access$setViewEvents$p(Lcom/ibotta/android/views/redeem/RedeemRetailersRow;Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->viewEvents:Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;

    return-void
.end method

.method private final setAppToAppDescription(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
    .locals 2

    .line 69
    sget v0, Lcom/ibotta/views/R$id;->tvAppToAppDescription:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 70
    check-cast v0, Landroid/view/View;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->toggleView(Landroid/view/View;Z)V

    .line 71
    sget v0, Lcom/ibotta/views/R$id;->tvAppToAppDescription:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvAppToAppDescription"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;->getDescription()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method private final setContent(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
    .locals 2

    .line 40
    sget v0, Lcom/ibotta/views/R$id;->gRetailerRow:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/Group;

    const-string v1, "gRetailerRow"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->toggleView(Landroid/view/View;Z)V

    .line 41
    sget v0, Lcom/ibotta/views/R$id;->tvEmptyMessage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvEmptyMessage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->toggleView(Landroid/view/View;Z)V

    .line 43
    new-instance v0, Lcom/ibotta/android/views/redeem/RedeemRetailersRow$setContent$1;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow$setContent$1;-><init>(Lcom/ibotta/android/views/redeem/RedeemRetailersRow;Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    check-cast v0, Landroid/view/View$OnClickListener;

    instance-of v1, p0, Landroid/view/View;

    if-nez v1, :cond_0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    move-object v1, p0

    check-cast v1, Landroid/view/View;

    invoke-static {v1, v0}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 45
    :goto_0
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->setRetailerName(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    .line 46
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->setRetailerLogoUrl(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->setAppToAppDescription(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    return-void
.end method

.method private final setEmptyRow(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
    .locals 2

    .line 51
    sget v0, Lcom/ibotta/views/R$id;->gRetailerRow:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/Group;

    const-string v1, "gRetailerRow"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->toggleView(Landroid/view/View;Z)V

    .line 52
    sget v0, Lcom/ibotta/views/R$id;->tvEmptyMessage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvEmptyMessage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/View;

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->toggleView(Landroid/view/View;Z)V

    .line 54
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->setEmptyText(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    return-void
.end method

.method private final setEmptyText(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
    .locals 2

    .line 58
    sget v0, Lcom/ibotta/views/R$id;->tvEmptyMessage:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvEmptyMessage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;->getTitle()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final setRetailerLogoUrl(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)Lcom/ibotta/android/images/ImageLoadJob;
    .locals 4

    .line 62
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;->getUrl()Ljava/lang/String;

    move-result-object p1

    sget v2, Lcom/ibotta/views/R$id;->ivRedeemRetailerLogo:I

    invoke-virtual {p0, v2}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->RETAILER_LOGO:Lcom/ibotta/android/views/images/Sizes;

    check-cast v3, Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    move-result-object p1

    return-object p1
.end method

.method private final setRetailerName(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
    .locals 2

    .line 65
    sget v0, Lcom/ibotta/views/R$id;->tvRedeemRetailerName:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvRedeemRetailerName"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;->getTitle()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final toggleView(Landroid/view/View;Z)V
    .locals 1

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    if-nez p2, :cond_1

    const/16 p2, 0x8

    .line 76
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 78
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 16
    check-cast p1, Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->bindViewEvents(Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    iput-object p1, p0, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->viewEvents:Lcom/ibotta/android/views/redeem/RedeemRetailerViewEvents;

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 16
    check-cast p1, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->updateViewState(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->viewState:Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;

    .line 29
    invoke-virtual {p1}, Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 30
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->setEmptyRow(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    .line 31
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/redeem/RedeemRetailersRow;->setContent(Lcom/ibotta/android/views/redeem/RedeemRetailerListRowViewState;)V

    :cond_1
    :goto_0
    return-void
.end method
