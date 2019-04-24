.class public final Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;
.super Landroid/support/constraint/ConstraintLayout;
.source "PaymentMethodsView.kt"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;
.implements Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;",
        "Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;",
        ">;",
        "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u00020\u0005B%\u0008\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\t\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;",
        "Landroid/support/constraint/ConstraintLayout;",
        "Lcom/ibotta/android/views/components/ViewComponent;",
        "Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;",
        "Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;",
        "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewEvents;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "viewEvents",
        "bindViewEvents",
        "",
        "onClicked",
        "viewState",
        "Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;",
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

.field private viewEvents:Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;


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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    .line 19
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

    .line 17
    check-cast p2, Landroid/util/AttributeSet;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 18
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public _$_clearFindViewByIdCache()V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->_$_findViewCache:Ljava/util/HashMap;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    :cond_0
    return-void
.end method

.method public _$_findCachedViewById(I)Landroid/view/View;
    .locals 2

    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->_$_findViewCache:Ljava/util/HashMap;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->_$_findViewCache:Ljava/util/HashMap;

    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->_$_findViewCache:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->bindViewEvents(Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewEvents"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    iput-object p1, p0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->viewEvents:Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;

    return-void
.end method

.method public onClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;->getAction()Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState$Action;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 37
    :pswitch_0
    iget-object p1, p0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->viewEvents:Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;->onAddNewPaymentMethodClicked()V

    goto :goto_0

    .line 36
    :pswitch_1
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->viewEvents:Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;->onGooglePayRowClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    goto :goto_0

    .line 35
    :pswitch_2
    iget-object v0, p0, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->viewEvents:Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewEvents;->onPaymentMethodRowClicked(Lcom/ibotta/android/views/pwi/wallet/WalletPaymentOptionRowViewState;)V

    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic onListViewTouched()V
    .locals 0
    .annotation runtime Lkotlin/jvm/JvmDefault;
    .end annotation

    invoke-static {p0}, Lcom/ibotta/android/views/list/IbottaListViewEvents$-CC;->$default$onListViewTouched(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method

.method public bridge synthetic updateViewState(Lcom/ibotta/android/views/components/ViewState;)V
    .locals 0

    .line 15
    check-cast p1, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->updateViewState(Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    sget v0, Lcom/ibotta/views/R$id;->iblvPaymentMethods:I

    invoke-virtual {p0, v0}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListView;

    iget-object p1, p1, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsViewState;->rows:Lcom/ibotta/android/views/list/IbottaListViewState;

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    .line 26
    sget p1, Lcom/ibotta/views/R$id;->iblvPaymentMethods:I

    invoke-virtual {p0, p1}, Lcom/ibotta/android/views/pwi/wallet/PaymentMethodsView;->_$_findCachedViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/ibotta/android/views/list/IbottaListView;

    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/views/list/IbottaListViewEvents;

    invoke-virtual {p1, v0}, Lcom/ibotta/android/views/list/IbottaListView;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method
