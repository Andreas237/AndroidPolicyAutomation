.class public Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView_ViewBinding;
.super Ljava/lang/Object;
.source "PendingEarningsProgressView_ViewBinding.java"

# interfaces
.implements Lbutterknife/Unbinder;


# instance fields
.field private target:Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;)V
    .locals 0
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 22
    invoke-direct {p0, p1, p1}, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView_ViewBinding;-><init>(Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;Landroid/view/View;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;Landroid/view/View;)V
    .locals 3
    .annotation build Landroid/support/annotation/UiThread;
    .end annotation

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;

    const-string v0, "field \'ivBottomArrow\'"

    .line 29
    const-class v1, Landroid/widget/ImageView;

    const v2, 0x7f09029a

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->ivBottomArrow:Landroid/widget/ImageView;

    const-string v0, "field \'tvPendingEarningsText\'"

    .line 30
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f09055b

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->tvPendingEarningsText:Landroid/widget/TextView;

    const-string v0, "field \'pbPendingEarnings\'"

    .line 31
    const-class v1, Landroid/widget/ProgressBar;

    const v2, 0x7f090398

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->pbPendingEarnings:Landroid/widget/ProgressBar;

    const-string v0, "field \'llProgressPointerContainer\'"

    .line 32
    const-class v1, Landroid/widget/LinearLayout;

    const v2, 0x7f090322

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p1, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->llProgressPointerContainer:Landroid/widget/LinearLayout;

    const-string v0, "field \'tvAmountEarned\'"

    .line 33
    const-class v1, Landroid/widget/TextView;

    const v2, 0x7f0904f2

    invoke-static {p2, v2, v0, v1}, Lbutterknife/internal/Utils;->findRequiredViewAsType(Landroid/view/View;ILjava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    iput-object p2, p1, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->tvAmountEarned:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public unbind()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    .line 41
    iput-object v1, p0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView_ViewBinding;->target:Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;

    .line 43
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->ivBottomArrow:Landroid/widget/ImageView;

    .line 44
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->tvPendingEarningsText:Landroid/widget/TextView;

    .line 45
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->pbPendingEarnings:Landroid/widget/ProgressBar;

    .line 46
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->llProgressPointerContainer:Landroid/widget/LinearLayout;

    .line 47
    iput-object v1, v0, Lcom/ibotta/android/mvp/ui/view/account/PendingEarningsProgressView;->tvAmountEarned:Landroid/widget/TextView;

    return-void

    .line 40
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Bindings already cleared."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
