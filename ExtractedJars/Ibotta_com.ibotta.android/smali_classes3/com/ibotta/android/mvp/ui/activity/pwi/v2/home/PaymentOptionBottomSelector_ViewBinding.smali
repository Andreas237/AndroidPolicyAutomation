.class public Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector_ViewBinding;
.super Ljava/lang/Object;
.source "PaymentOptionBottomSelector_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;)V
    .locals 1
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 19
    invoke-virtual {p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;

    const-string v0, "field \'iblvPaymentMethods\'"

    .line 26
    const-class v1, Lcom/ibotta/android/views/list/IbottaListView;

    const v2, 0x7f090239

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/ibotta/android/views/list/IbottaListView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->iblvPaymentMethods:Lcom/ibotta/android/views/list/IbottaListView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 34
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;

    .line 36
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/home/PaymentOptionBottomSelector;->iblvPaymentMethods:Lcom/ibotta/android/views/list/IbottaListView;

    return-void

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
