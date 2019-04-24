.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;
.super Landroid/support/design/widget/BottomSheetDialog;
.source "PaymentOptionBottomSelector.java"

# interfaces
.implements Lcom/ibotta/android/views/components/ViewComponent;
.implements Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/design/widget/BottomSheetDialog;",
        "Lcom/ibotta/android/views/components/ViewComponent<",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewEvents;",
        ">;",
        "Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewEvents;"
    }
.end annotation


# instance fields
.field protected iblvPaymentMethods:Lcom/ibotta/android/views/list/IbottaListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090239
    .end annotation
.end field

.field private viewEvents:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewEvents;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 34
    invoke-direct {p0, p1}, Landroid/support/design/widget/BottomSheetDialog;-><init>(Landroid/content/Context;)V

    .line 35
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->initLayout()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 39
    invoke-direct {p0, p1, p2}, Landroid/support/design/widget/BottomSheetDialog;-><init>(Landroid/content/Context;I)V

    .line 40
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->initLayout()V

    return-void
.end method

.method protected constructor <init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 45
    invoke-direct {p0, p1, p2, p3}, Landroid/support/design/widget/BottomSheetDialog;-><init>(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;)V

    .line 46
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->initLayout()V

    return-void
.end method

.method private initLayout()V
    .locals 1

    const v0, 0x7f0c00da

    .line 50
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->setContentView(I)V

    .line 51
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/app/Dialog;)Lbutterknife/Unbinder;

    return-void
.end method


# virtual methods
.method public bridge synthetic bindViewEvents(Lcom/ibotta/android/views/components/ViewEvents;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/components/ViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 26
    check-cast p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewEvents;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->bindViewEvents(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewEvents;)V

    return-void
.end method

.method public bindViewEvents(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewEvents;)V
    .locals 0
    .param p1    # Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewEvents;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 62
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->viewEvents:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewEvents;

    return-void
.end method

.method public onClicked(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 67
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->viewEvents:Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewEvents;

    if-eqz v0, :cond_0

    .line 68
    invoke-interface {v0, p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewEvents;->onPaymentMethodClicked(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionRowViewState;)V

    .line 69
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->dismiss()V

    :cond_0
    return-void
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
    .param p1    # Lcom/ibotta/android/views/components/ViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 26
    check-cast p1, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->updateViewState(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;)V

    return-void
.end method

.method public updateViewState(Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;)V
    .locals 2
    .param p1    # Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 56
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->iblvPaymentMethods:Lcom/ibotta/android/views/list/IbottaListView;

    new-instance v1, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    invoke-direct {v1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;-><init>()V

    invoke-virtual {p1}, Lcom/ibotta/android/views/pwi/home/payments/PaymentOptionSelectorViewState;->getPaymentOptions()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->rows(Ljava/util/List;)Lcom/ibotta/android/views/list/IbottaListViewState$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/views/list/IbottaListViewState$Builder;->build()Lcom/ibotta/android/views/list/IbottaListViewState;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/ibotta/android/views/list/IbottaListView;->updateViewState(Lcom/ibotta/android/views/list/IbottaListViewState;)V

    .line 57
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->iblvPaymentMethods:Lcom/ibotta/android/views/list/IbottaListView;

    invoke-virtual {p1, p0}, Lcom/ibotta/android/views/list/IbottaListView;->bindViewEvents(Lcom/ibotta/android/views/list/IbottaListViewEvents;)V

    return-void
.end method
