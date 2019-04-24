.class public final Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;
.super Landroid/support/design/widget/CollapsingToolbarLayout;
.source "GalleryCollapsingToolbarLayout.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/design/widget/CollapsingToolbarLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;",
        "Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGalleryCollapsingToolbarLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GalleryCollapsingToolbarLayout.kt\ncom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n68#1,8:229\n1574#2,2:237\n667#2:239\n740#2,2:240\n1574#2,2:242\n*E\n*S KotlinDebug\n*F\n+ 1 GalleryCollapsingToolbarLayout.kt\ncom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout\n*L\n61#1,8:229\n130#1,2:237\n173#1:239\n173#1,2:240\n174#1,2:242\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B%\u0008\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0004H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\nH\u0002J\u0008\u0010\u001a\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\rH\u0002J\u0008\u0010\u001c\u001a\u00020\u0014H\u0002J\u0008\u0010\u001d\u001a\u00020\u0014H\u0002J\u0008\u0010\u001e\u001a\u00020\u0014H\u0002J\u0008\u0010\u001f\u001a\u00020\u0014H\u0002J\u0008\u0010 \u001a\u00020\u0014H\u0002J\u0008\u0010!\u001a\u00020\u0014H\u0002J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010\u000c\u001a\u00020\rJ\u0010\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0002J\u0008\u0010&\u001a\u00020\u0014H\u0002J\u0010\u0010\'\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0003H\u0003J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0003H\u0002J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0002J\u000e\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\nJ\u0010\u0010-\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\u0003H\u0016J\u0019\u0010.\u001a\u00020\u00142\u000e\u0008\u0004\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u001400H\u0082\u0008R\u000e\u0010\u000c\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00061"
    }
    d2 = {
        "Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;",
        "Landroid/support/design/widget/CollapsingToolbarLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;",
        "Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "editing",
        "",
        "headerButtons",
        "Ljava/util/HashSet;",
        "Landroid/widget/Button;",
        "isLoyaltyLinkVariantEnabled",
        "viewEvents",
        "bindViewEvents",
        "",
        "connectTopToBottom",
        "constraintSet",
        "Landroid/support/constraint/ConstraintSet;",
        "firstViewRes",
        "secondViewRes",
        "getVisibleChildrenCount",
        "handleLoyaltyLinkVariant",
        "initMyOffersButtons",
        "onBuyIgcClicked",
        "onImCardClicked",
        "onLinkLoyaltyCardClicked",
        "onRedeemClicked",
        "replaceButtonAttributes",
        "setEditing",
        "updateCollapsingToolbarAttributes",
        "retailerName",
        "",
        "updateExpandedTitleMargins",
        "updateHeaderButtons",
        "viewState",
        "updateRetailerLogo",
        "updateRetailerName",
        "updateSubtitleAndLogo",
        "size",
        "updateViewState",
        "waitForLayout",
        "function",
        "Lkotlin/Function0;",
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

.field private editing:Z

.field private final headerButtons:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Landroid/widget/Button;",
            ">;"
        }
    .end annotation
.end field

.field private isLoyaltyLinkVariantEnabled:Z

.field private viewEvents:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 29
    invoke-direct {p0, p1, p2, p3}, Landroid/support/design/widget/CollapsingToolbarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 34
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->headerButtons:Ljava/util/HashSet;

    .line 38
    invoke-virtual {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    sget p2, Lcom/ibotta/views/R$layout;->view_collapsing_toolbar_gallery:I

    move-object p3, p0

    check-cast p3, Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-virtual {p1, p2, p3, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 39
    invoke-virtual {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget p2, Lcom/ibotta/views/R$color;->white:I

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->setBackgroundColor(I)V

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->initMyOffersButtons()V

    .line 41
    sget p1, Lcom/ibotta/views/R$id;->bImUndefined:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance p2, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$1;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$1;-><init>(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V

    check-cast p2, Landroid/view/View$OnClickListener;

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_0

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 42
    :goto_0
    sget p1, Lcom/ibotta/views/R$id;->bImVerified:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance p2, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$2;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$2;-><init>(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V

    check-cast p2, Landroid/view/View$OnClickListener;

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_1

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 43
    :goto_1
    sget p1, Lcom/ibotta/views/R$id;->bImPending:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance p2, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$3;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$3;-><init>(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V

    check-cast p2, Landroid/view/View$OnClickListener;

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_2

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 44
    :goto_2
    sget p1, Lcom/ibotta/views/R$id;->bImError:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance p2, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$4;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$4;-><init>(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V

    check-cast p2, Landroid/view/View$OnClickListener;

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_3

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 45
    :goto_3
    sget p1, Lcom/ibotta/views/R$id;->bRedeem:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance p2, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$5;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$5;-><init>(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V

    check-cast p2, Landroid/view/View$OnClickListener;

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_4

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_4
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 46
    :goto_4
    sget p1, Lcom/ibotta/views/R$id;->bBuyIgc:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance p2, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$6;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$6;-><init>(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V

    check-cast p2, Landroid/view/View$OnClickListener;

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_5

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_5

    :cond_5
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 47
    :goto_5
    sget p1, Lcom/ibotta/views/R$id;->bLinkLoyaltyCard:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    new-instance p2, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$7;

    invoke-direct {p2, p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$7;-><init>(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V

    check-cast p2, Landroid/view/View$OnClickListener;

    instance-of p3, p1, Landroid/view/View;

    if-nez p3, :cond_6

    invoke-virtual {p1, p2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_6

    :cond_6
    check-cast p1, Landroid/view/View;

    invoke-static {p1, p2}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_6
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 27
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 28
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$onBuyIgcClicked(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->onBuyIgcClicked()V

    return-void
.end method

.method public static final synthetic access$onImCardClicked(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->onImCardClicked()V

    return-void
.end method

.method public static final synthetic access$onLinkLoyaltyCardClicked(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->onLinkLoyaltyCardClicked()V

    return-void
.end method

.method public static final synthetic access$onRedeemClicked(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->onRedeemClicked()V

    return-void
.end method

.method public static final synthetic access$updateExpandedTitleMargins(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;)V
    .locals 0

    .line 25
    invoke-direct {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->updateExpandedTitleMargins()V

    return-void
.end method

.method public static final synthetic access$updateRetailerName(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;Ljava/lang/String;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->updateRetailerName(Ljava/lang/String;)V

    return-void
.end method

.method private final connectTopToBottom(Landroid/support/constraint/ConstraintSet;II)V
    .locals 8

    .line 125
    invoke-virtual {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/ibotta/views/R$dimen;->size_14:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    const/4 v4, 0x3

    const/4 v6, 0x4

    move-object v2, p1

    move v3, p2

    move v5, p3

    .line 121
    invoke-virtual/range {v2 .. v7}, Landroid/support/constraint/ConstraintSet;->connect(IIIII)V

    return-void
.end method

.method private final getVisibleChildrenCount()I
    .locals 4

    .line 130
    sget v0, Lcom/ibotta/views/R$id;->llHeaderContainer:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    const-string v1, "llHeaderContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/constraint/ConstraintLayout;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lkotlin/ranges/RangesKt;->until(II)Lkotlin/ranges/IntRange;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    .line 237
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v0

    check-cast v2, Lkotlin/collections/IntIterator;

    invoke-virtual {v2}, Lkotlin/collections/IntIterator;->nextInt()I

    move-result v2

    .line 131
    sget v3, Lcom/ibotta/views/R$id;->llHeaderContainer:I

    invoke-virtual {p0, v3}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {v3, v2}, Landroid/support/constraint/ConstraintLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-string v3, "view"

    .line 132
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_0

    instance-of v2, v2, Landroid/widget/Button;

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method private final handleLoyaltyLinkVariant(Z)V
    .locals 2

    .line 108
    iput-boolean p1, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->isLoyaltyLinkVariantEnabled:Z

    if-eqz p1, :cond_0

    .line 111
    new-instance p1, Landroid/support/constraint/ConstraintSet;

    invoke-direct {p1}, Landroid/support/constraint/ConstraintSet;-><init>()V

    .line 112
    sget v0, Lcom/ibotta/views/R$id;->llHeaderContainer:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {p1, v0}, Landroid/support/constraint/ConstraintSet;->clone(Landroid/support/constraint/ConstraintLayout;)V

    .line 113
    sget v0, Lcom/ibotta/views/R$id;->bLinkLoyaltyCard:I

    sget v1, Lcom/ibotta/views/R$id;->bImUndefined:I

    invoke-direct {p0, p1, v0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->connectTopToBottom(Landroid/support/constraint/ConstraintSet;II)V

    .line 114
    sget v0, Lcom/ibotta/views/R$id;->bImVerified:I

    sget v1, Lcom/ibotta/views/R$id;->bLinkLoyaltyCard:I

    invoke-direct {p0, p1, v0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->connectTopToBottom(Landroid/support/constraint/ConstraintSet;II)V

    .line 115
    sget v0, Lcom/ibotta/views/R$id;->llHeaderContainer:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    invoke-virtual {p1, v0}, Landroid/support/constraint/ConstraintSet;->applyTo(Landroid/support/constraint/ConstraintLayout;)V

    .line 117
    invoke-direct {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->replaceButtonAttributes()V

    :cond_0
    return-void
.end method

.method private final initMyOffersButtons()V
    .locals 2

    .line 223
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->headerButtons:Ljava/util/HashSet;

    sget v1, Lcom/ibotta/views/R$id;->bImUndefined:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 224
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->headerButtons:Ljava/util/HashSet;

    sget v1, Lcom/ibotta/views/R$id;->bRedeem:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 225
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->headerButtons:Ljava/util/HashSet;

    sget v1, Lcom/ibotta/views/R$id;->bBuyIgc:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 226
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->headerButtons:Ljava/util/HashSet;

    sget v1, Lcom/ibotta/views/R$id;->bLinkLoyaltyCard:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private final onBuyIgcClicked()V
    .locals 3

    .line 211
    iget-boolean v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->editing:Z

    if-nez v0, :cond_0

    .line 212
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->viewEvents:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;

    if-eqz v0, :cond_0

    sget v1, Lcom/ibotta/views/R$id;->bBuyIgc:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const-string v2, "bBuyIgc"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;->onBuyIgcClicked(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final onImCardClicked()V
    .locals 3

    .line 198
    iget-boolean v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->editing:Z

    if-nez v0, :cond_0

    .line 200
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->viewEvents:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;

    if-eqz v0, :cond_0

    sget v1, Lcom/ibotta/views/R$id;->bImUndefined:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const-string v2, "bImUndefined"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;->onImCardClicked(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final onLinkLoyaltyCardClicked()V
    .locals 3

    .line 217
    iget-boolean v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->editing:Z

    if-nez v0, :cond_0

    .line 218
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->viewEvents:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;

    if-eqz v0, :cond_0

    sget v1, Lcom/ibotta/views/R$id;->bLinkLoyaltyCard:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const-string v2, "bLinkLoyaltyCard"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;->onLinkLoyaltyCardClicked(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final onRedeemClicked()V
    .locals 3

    .line 205
    iget-boolean v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->editing:Z

    if-nez v0, :cond_0

    .line 206
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->viewEvents:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;

    if-eqz v0, :cond_0

    sget v1, Lcom/ibotta/views/R$id;->bRedeem:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    const-string v2, "bRedeem"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/widget/Button;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;->onRedeemReceiptClicked(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final replaceButtonAttributes()V
    .locals 3

    .line 140
    invoke-direct {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getVisibleChildrenCount()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 141
    sget v0, Lcom/ibotta/views/R$id;->bBuyIgc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$style;->ModelC_Btn_SecondaryText:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/Button;->setTextAppearance(Landroid/content/Context;I)V

    .line 142
    sget v0, Lcom/ibotta/views/R$id;->bBuyIgc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    sget v1, Lcom/ibotta/views/R$drawable;->button_secondary_button_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    .line 143
    sget v0, Lcom/ibotta/views/R$id;->bRedeem:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    invoke-virtual {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$style;->ModelC_Btn_SecondaryText:I

    invoke-virtual {v0, v1, v2}, Landroid/widget/Button;->setTextAppearance(Landroid/content/Context;I)V

    .line 144
    sget v0, Lcom/ibotta/views/R$id;->bRedeem:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    sget v1, Lcom/ibotta/views/R$drawable;->button_secondary_button_gray:I

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setBackgroundResource(I)V

    :cond_0
    return-void
.end method

.method private final updateCollapsingToolbarAttributes(Ljava/lang/String;)V
    .locals 2

    .line 229
    invoke-virtual {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 230
    new-instance v1, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$updateCollapsingToolbarAttributes$$inlined$waitForLayout$1;

    invoke-direct {v1, p0, p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$updateCollapsingToolbarAttributes$$inlined$waitForLayout$1;-><init>(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;Ljava/lang/String;)V

    check-cast v1, Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private final updateExpandedTitleMargins()V
    .locals 5

    .line 187
    sget v0, Lcom/ibotta/views/R$id;->llHeaderContainer:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/constraint/ConstraintLayout;

    const-string v1, "llHeaderContainer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/support/constraint/ConstraintLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_1

    check-cast v0, Landroid/support/design/widget/CollapsingToolbarLayout$LayoutParams;

    .line 188
    sget v1, Lcom/ibotta/views/R$id;->ivRetailerLogo:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const-string v2, "ivRetailerLogo"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Landroid/support/constraint/ConstraintLayout$LayoutParams;

    .line 190
    sget-object v2, Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;->INSTANCE:Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;

    .line 191
    sget v3, Lcom/ibotta/views/R$id;->llHeaderContainer:I

    invoke-virtual {p0, v3}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/support/constraint/ConstraintLayout;

    const-string v4, "llHeaderContainer"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/support/constraint/ConstraintLayout;->getPaddingStart()I

    move-result v3

    .line 190
    invoke-virtual {v2, v1, v3}, Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;->getExpandedTitleMarginStart(Landroid/support/constraint/ConstraintLayout$LayoutParams;I)I

    move-result v1

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->setExpandedTitleMarginStart(I)V

    .line 192
    sget-object v1, Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;->INSTANCE:Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;

    .line 193
    sget v2, Lcom/ibotta/views/R$id;->tvSubtitle:I

    invoke-virtual {p0, v2}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const-string v3, "tvSubtitle"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    invoke-virtual {v1, v0, v2}, Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;->getExpandedTitleMarginTop(Landroid/support/design/widget/CollapsingToolbarLayout$LayoutParams;Landroid/widget/TextView;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->setExpandedTitleMarginTop(I)V

    .line 194
    sget-object v0, Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;->INSTANCE:Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;

    invoke-virtual {v0}, Lcom/ibotta/android/views/gallery/CollapsingToolbarAttributeGenerator;->getCollapsedTitleTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->setCollapsedTitleTypeface(Landroid/graphics/Typeface;)V

    return-void

    .line 188
    :cond_0
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type android.support.constraint.ConstraintLayout.LayoutParams"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 187
    :cond_1
    new-instance v0, Lkotlin/TypeCastException;

    const-string v1, "null cannot be cast to non-null type android.support.design.widget.CollapsingToolbarLayout.LayoutParams"

    invoke-direct {v0, v1}, Lkotlin/TypeCastException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final updateHeaderButtons(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 79
    sget v0, Lcom/ibotta/views/R$id;->bImUndefined:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bImUndefined"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getImStateUndefined()Z

    move-result v1

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 80
    sget v0, Lcom/ibotta/views/R$id;->bImUndefined:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bImUndefined"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getImButtonText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 82
    sget v0, Lcom/ibotta/views/R$id;->bImVerified:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bImVerified"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getImStateVerified()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 83
    sget v0, Lcom/ibotta/views/R$id;->bImVerified:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bImVerified"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v1, v4, :cond_2

    .line 84
    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getImButtonText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v3}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    goto :goto_2

    .line 86
    :cond_2
    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getImButtonText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    .line 83
    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 88
    sget v0, Lcom/ibotta/views/R$id;->bImPending:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bImPending"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getImStatePending()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    goto :goto_3

    :cond_3
    const/16 v1, 0x8

    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 89
    sget v0, Lcom/ibotta/views/R$id;->bImPending:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bImPending"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getImButtonText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 91
    sget v0, Lcom/ibotta/views/R$id;->bImError:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bImError"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getImStateError()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    goto :goto_4

    :cond_4
    const/16 v1, 0x8

    :goto_4
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 92
    sget v0, Lcom/ibotta/views/R$id;->bImError:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bImError"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getImButtonText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 94
    sget v0, Lcom/ibotta/views/R$id;->bBuyIgc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bBuyIgc"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getBuyIgcButtonVisible()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    goto :goto_5

    :cond_5
    const/16 v1, 0x8

    :goto_5
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 95
    sget v0, Lcom/ibotta/views/R$id;->bBuyIgc:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bBuyIgc"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getPwiButtonText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 97
    sget v0, Lcom/ibotta/views/R$id;->bRedeem:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bRedeem"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getRedeemButtonVisible()Z

    move-result v1

    if-eqz v1, :cond_6

    const/4 v1, 0x0

    goto :goto_6

    :cond_6
    const/16 v1, 0x8

    :goto_6
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 98
    sget v0, Lcom/ibotta/views/R$id;->bRedeem:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bRedeem"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getRedeemButtonText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 100
    sget v0, Lcom/ibotta/views/R$id;->bLinkLoyaltyCard:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bLinkLoyaltyCard"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getLinkLoyaltyCardButtonVisible()Z

    move-result v1

    if-eqz v1, :cond_7

    const/4 v2, 0x0

    :cond_7
    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 102
    sget v0, Lcom/ibotta/views/R$id;->bLinkLoyaltyCard:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    const-string v1, "bLinkLoyaltyCard"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getLinkLoyaltyCardButtonText()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 104
    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->isLoyaltyLinkVariantEnabled()Z

    move-result p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->handleLoyaltyLinkVariant(Z)V

    return-void
.end method

.method private final updateRetailerLogo(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)V
    .locals 4

    .line 151
    sget v0, Lcom/ibotta/views/R$id;->ivRetailerLogo:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivRetailerLogo"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setClipToOutline(Z)V

    .line 153
    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getUseIconRes()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    sget v0, Lcom/ibotta/views/R$id;->ivRetailerLogo:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getIconRes()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_0

    .line 156
    :cond_0
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getRetailerLogoUrl()Ljava/lang/String;

    move-result-object p1

    sget v2, Lcom/ibotta/views/R$id;->ivRetailerLogo:I

    invoke-virtual {p0, v2}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    sget-object v3, Lcom/ibotta/android/views/images/Sizes;->MODEL_C_RETAILER_ROW:Lcom/ibotta/android/views/images/Sizes;

    check-cast v3, Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v0, v1, p1, v2, v3}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    :goto_0
    return-void
.end method

.method private final updateRetailerName(Ljava/lang/String;)V
    .locals 2

    .line 161
    sget v0, Lcom/ibotta/views/R$id;->t_toolbar:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    const-string v1, "t_toolbar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final waitForLayout(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 68
    invoke-virtual {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    .line 69
    new-instance v1, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$$inlined$with$lambda$2;

    invoke-direct {v1, p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout$waitForLayout$$inlined$with$lambda$2;-><init>(Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;Lkotlin/jvm/functions/Function0;)V

    check-cast v1, Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 25
    check-cast p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->bindViewEvents(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    iput-object p1, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->viewEvents:Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewEvents;

    return-void
.end method

.method public final setEditing(Z)V
    .locals 4

    .line 170
    iput-boolean p1, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->editing:Z

    .line 172
    iget-object v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->headerButtons:Ljava/util/HashSet;

    check-cast v0, Ljava/lang/Iterable;

    .line 239
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v1, Ljava/util/Collection;

    .line 240
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Landroid/widget/Button;

    .line 173
    invoke-virtual {v3}, Landroid/widget/Button;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    if-eqz v3, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 241
    :cond_2
    check-cast v1, Ljava/util/List;

    check-cast v1, Ljava/lang/Iterable;

    .line 242
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/Button;

    xor-int/lit8 v2, p1, 0x1

    .line 175
    invoke-virtual {v1, v2}, Landroid/widget/Button;->setEnabled(Z)V

    .line 176
    invoke-virtual {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getContext()Landroid/content/Context;

    move-result-object v2

    if-eqz p1, :cond_3

    .line 177
    sget v3, Lcom/ibotta/views/R$style;->ModelC_Btn_DisabledText:I

    goto :goto_3

    .line 179
    :cond_3
    sget v3, Lcom/ibotta/views/R$style;->ModelC_Button_Primary_Green:I

    .line 176
    :goto_3
    invoke-virtual {v1, v2, v3}, Landroid/widget/Button;->setTextAppearance(Landroid/content/Context;I)V

    goto :goto_2

    .line 183
    :cond_4
    iget-boolean v0, p0, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->isLoyaltyLinkVariantEnabled:Z

    if-eqz v0, :cond_5

    if-nez p1, :cond_5

    invoke-direct {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->replaceButtonAttributes()V

    :cond_5
    return-void
.end method

.method public final updateSubtitleAndLogo(I)V
    .locals 5

    .line 165
    sget v0, Lcom/ibotta/views/R$id;->tvSubtitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSubtitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/ibotta/views/R$string;->my_offers_subtitle:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 166
    sget p1, Lcom/ibotta/views/R$id;->tvSubtitle:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const-string v0, "tvSubtitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v4}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 25
    check-cast p1, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->updateViewState(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->updateHeaderButtons(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)V

    .line 52
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->updateRetailerLogo(Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;)V

    .line 53
    invoke-virtual {p1}, Lcom/ibotta/android/views/headers/retailer/GalleryHeaderViewState;->getRetailerName()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/gallery/GalleryCollapsingToolbarLayout;->updateCollapsingToolbarAttributes(Ljava/lang/String;)V

    return-void
.end method
