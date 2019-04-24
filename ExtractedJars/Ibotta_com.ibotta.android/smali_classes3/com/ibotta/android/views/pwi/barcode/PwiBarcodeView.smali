.class public final Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;
.super Landroid/support/constraint/ConstraintLayout;
.source "PwiBarcodeView.kt"

# interfaces
.implements Lcom/ibotta/android/images/ImageCacheListener;
.implements Lcom/ibotta/android/views/components/ViewComponent;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/images/ImageCacheListener;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;",
        "Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPwiBarcodeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PwiBarcodeView.kt\ncom/ibotta/android/views/pwi/barcode/PwiBarcodeView\n*L\n1#1,184:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u0005B%\u0008\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0008\u0010\u0016\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010%\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010&\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0008\u0010\'\u001a\u00020\u0010H\u0002J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;",
        "Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;",
        "Lcom/ibotta/android/images/ImageCacheListener;",
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
        "loadBarcode",
        "barcodeUrl",
        "",
        "barcodeSize",
        "Lcom/ibotta/android/views/images/Sizes;",
        "onError",
        "onSuccess",
        "height",
        "width",
        "revealCardNumber",
        "setAmountAddedDate",
        "setBarcodeUrl",
        "setGiftCard",
        "setGiftCardAmount",
        "setGiftCardNumber",
        "setLogo",
        "setPin",
        "setRevealGiftCard",
        "setSpentBadge",
        "setTermsOfUse",
        "setTitle",
        "setUpdatedState",
        "setViewEventListeners",
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

.field private viewEvents:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;

.field private viewState:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 32
    invoke-direct {p0, p1, p2, p3}, Landroid/support/constraint/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 36
    sget-object p1, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->EMPTY:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewState:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    .line 30
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 31
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic access$getViewEvents$p(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;)Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewEvents:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;

    return-object p0
.end method

.method public static final synthetic access$getViewState$p(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;)Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewState:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    return-object p0
.end method

.method public static final synthetic access$revealCardNumber(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->revealCardNumber(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    return-void
.end method

.method public static final synthetic access$setViewEvents$p(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewEvents:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;

    return-void
.end method

.method public static final synthetic access$setViewState$p(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 0

    .line 28
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewState:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    return-void
.end method

.method private final loadBarcode(Ljava/lang/String;Lcom/ibotta/android/views/images/Sizes;)V
    .locals 7

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewEvents:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;->onStartBarcodeLoading()V

    .line 118
    :cond_0
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v0, "context"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/ibotta/views/R$id;->ivBarcode:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/ImageView;

    move-object v5, p2

    check-cast v5, Lcom/ibotta/android/images/ImageCache$Size;

    move-object v6, p0

    check-cast v6, Lcom/ibotta/android/images/ImageCacheListener;

    move-object v3, p1

    invoke-interface/range {v1 .. v6}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;Lcom/ibotta/android/images/ImageCacheListener;)Lcom/ibotta/android/images/ImageLoadJob;

    return-void
.end method

.method private final revealCardNumber(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 2

    .line 165
    sget v0, Lcom/ibotta/views/R$id;->tvRevealCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvRevealCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 166
    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeNumberTextView;

    const-string v1, "tvCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeNumberTextView;->setVisibility(I)V

    .line 167
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewEvents:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;->onRevealCardNumber(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    :cond_0
    return-void
.end method

.method private final setAmountAddedDate(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 2

    .line 145
    sget v0, Lcom/ibotta/views/R$id;->tvAmountAddedDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvAmountAddedDate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 146
    sget v0, Lcom/ibotta/views/R$id;->tvAmountAddedDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvAmountAddedDate"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getPurchaseDate()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 147
    sget v0, Lcom/ibotta/views/R$id;->tvAmountAddedDate:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getPurchaseDateTextColor()I

    move-result p1

    invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private final setBarcodeUrl(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 4

    .line 103
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getBarcodeUrl()Ljava/lang/String;

    move-result-object v0

    .line 104
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    const/4 v2, 0x0

    if-lez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 106
    sget v1, Lcom/ibotta/views/R$id;->ivBarcode:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const-string v3, "ivBarcode"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 107
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getBarcodeSize()Lcom/ibotta/android/views/images/Sizes;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->loadBarcode(Ljava/lang/String;Lcom/ibotta/android/views/images/Sizes;)V

    goto :goto_1

    .line 110
    :cond_1
    sget v0, Lcom/ibotta/views/R$id;->ivBarcode:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivBarcode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 111
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setLogo(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 113
    :goto_1
    sget v0, Lcom/ibotta/views/R$id;->ivBarcode:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const-string v1, "ivBarcode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getBarcodeAlpha()F

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setAlpha(F)V

    return-void
.end method

.method private final setGiftCard(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 2

    .line 95
    sget v0, Lcom/ibotta/views/R$id;->tvGiftCard:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getGiftCardTextColor()I

    move-result p1

    invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private final setGiftCardAmount(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 2

    .line 151
    sget v0, Lcom/ibotta/views/R$id;->tvGiftCardAmount:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvGiftCardAmount"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 152
    sget v0, Lcom/ibotta/views/R$id;->tvGiftCardAmount:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvGiftCardAmount"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getGiftCardAmount()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    sget v0, Lcom/ibotta/views/R$id;->tvGiftCardAmount:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getGiftCardAmountTextColor()I

    move-result p1

    invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private final setGiftCardNumber(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 3

    .line 122
    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeNumberTextView;

    const-string v1, "tvCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getBarcodeNumber()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeNumberTextView;->setText(Ljava/lang/CharSequence;)V

    .line 123
    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeNumberTextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getBarcodeNumberTextColor()I

    move-result v2

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeNumberTextView;->setTextColor(I)V

    .line 124
    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeNumberTextView;

    const-string v1, "tvCardNumber"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeNumberTextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/4 v1, 0x2

    aget-object v0, v0, v1

    const-string v1, "tvCardNumber.compoundDrawablesRelative[2]"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getCopyBarcodeNumberAlpha()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    return-void
.end method

.method private final setLogo(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 4

    .line 76
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getLogoUrl()Ljava/lang/String;

    move-result-object v0

    .line 77
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getLogoSize()Lcom/ibotta/android/views/images/Sizes;

    move-result-object p1

    .line 79
    sget v1, Lcom/ibotta/views/R$id;->ivLogo:I

    invoke-virtual {p0, v1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const-string v2, "ivLogo"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 80
    move-object v1, v0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-lez v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    if-eqz v2, :cond_1

    .line 82
    sget-object v1, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v1}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v1

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "context"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Lcom/ibotta/views/R$id;->ivLogo:I

    invoke-virtual {p0, v3}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    check-cast p1, Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v1, v2, v0, v3, p1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    goto :goto_0

    .line 85
    :cond_1
    sget-object v0, Lcom/ibotta/android/views/ViewsModule;->INSTANCE:Lcom/ibotta/android/views/ViewsModule;

    invoke-virtual {v0}, Lcom/ibotta/android/views/ViewsModule;->getImageCache()Lcom/ibotta/android/images/ImageCache;

    move-result-object v0

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/images/Sizes;->getPlaceholderResId()I

    move-result v2

    sget v3, Lcom/ibotta/views/R$id;->ivLogo:I

    invoke-virtual {p0, v3}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    check-cast p1, Lcom/ibotta/android/images/ImageCache$Size;

    invoke-interface {v0, v1, v2, v3, p1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;ILandroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    :goto_0
    return-void
.end method

.method private final setPin(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 2

    .line 139
    sget v0, Lcom/ibotta/views/R$id;->tvPin:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvPin"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 140
    sget v0, Lcom/ibotta/views/R$id;->tvPin:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvPin"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getBarcodePin()Ljava/lang/String;

    move-result-object v1

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    sget v0, Lcom/ibotta/views/R$id;->tvPin:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getBarcodePinTextColor()I

    move-result p1

    invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private final setRevealGiftCard(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 2

    .line 135
    sget v0, Lcom/ibotta/views/R$id;->tvRevealCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getTermsOfUseTextColor()I

    move-result p1

    invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private final setSpentBadge(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 2

    .line 99
    sget v0, Lcom/ibotta/views/R$id;->tvSpent:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvSpent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->isSpent()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private final setTermsOfUse(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 3

    .line 128
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getTerms()Ljava/lang/String;

    move-result-object v0

    check-cast v0, Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 129
    sget v0, Lcom/ibotta/views/R$id;->tvTermsOfUse:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v2, "tvTermsOfUse"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 131
    :cond_1
    sget v0, Lcom/ibotta/views/R$id;->tvTermsOfUse:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getTermsOfUseTextColor()I

    move-result p1

    invoke-static {v1, p1}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private final setTitle(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 2

    .line 90
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 91
    sget v0, Lcom/ibotta/views/R$id;->tvTitle:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvTitle"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getRetailerName()Ljava/lang/String;

    move-result-object p1

    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final setUpdatedState(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 3

    .line 157
    sget v0, Lcom/ibotta/views/R$id;->tvUpdated:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->getGiftCardAmountTextColor()I

    move-result v2

    invoke-static {v1, v2}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 158
    sget v0, Lcom/ibotta/views/R$id;->tvUpdated:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const-string v1, "tvUpdated"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;->isUpdatedBalanceVisibility()Lcom/ibotta/android/views/components/Visibility;

    move-result-object p1

    sget-object v1, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Lcom/ibotta/android/views/components/Visibility;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    return-void
.end method

.method private final setViewEventListeners()V
    .locals 3

    .line 68
    sget v0, Lcom/ibotta/views/R$id;->tvCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeNumberTextView;

    new-instance v1, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView$setViewEventListeners$1;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView$setViewEventListeners$1;-><init>(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeNumberTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_0
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 69
    :goto_0
    sget v0, Lcom/ibotta/views/R$id;->tvTermsOfUse:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView$setViewEventListeners$2;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView$setViewEventListeners$2;-><init>(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 70
    :goto_1
    sget v0, Lcom/ibotta/views/R$id;->bDone:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView$setViewEventListeners$3;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView$setViewEventListeners$3;-><init>(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 71
    :goto_2
    sget v0, Lcom/ibotta/views/R$id;->bUpdateBalance:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    new-instance v1, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView$setViewEventListeners$4;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView$setViewEventListeners$4;-><init>(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_3

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_3

    :cond_3
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 72
    :goto_3
    sget v0, Lcom/ibotta/views/R$id;->tvRevealCardNumber:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    new-instance v1, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView$setViewEventListeners$5;

    invoke-direct {v1, p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView$setViewEventListeners$5;-><init>(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;)V

    check-cast v1, Landroid/view/View$OnClickListener;

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_4
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_4
    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->bindViewEvents(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewEvents:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;

    return-void
.end method

.method public onError()V
    .locals 1

    .line 182
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewState:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    invoke-direct {p0, v0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setLogo(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    return-void
.end method

.method public onSuccess(II)V
    .locals 0

    .line 173
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewEvents:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewEvents;->onStopBarcodeLoading()V

    .line 176
    :cond_0
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewState:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setLogo(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->updateViewState(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewState:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 44
    :cond_0
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->viewState:Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;

    .line 45
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setTitle(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 46
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setGiftCard(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 47
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setSpentBadge(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 48
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setBarcodeUrl(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 49
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setPin(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 50
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setTermsOfUse(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 51
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setAmountAddedDate(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 52
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setGiftCardAmount(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 53
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setUpdatedState(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 54
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setRevealGiftCard(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 55
    invoke-direct {p0, p1}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setGiftCardNumber(Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeViewState;)V

    .line 60
    invoke-direct {p0}, Lcom/ibotta/android/views/pwi/barcode/PwiBarcodeView;->setViewEventListeners()V

    return-void
.end method
