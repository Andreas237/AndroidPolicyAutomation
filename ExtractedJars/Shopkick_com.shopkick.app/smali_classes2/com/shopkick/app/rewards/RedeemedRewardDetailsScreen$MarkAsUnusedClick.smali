.class Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$MarkAsUnusedClick;
.super Ljava/lang/Object;
.source "RedeemedRewardDetailsScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "MarkAsUnusedClick"
.end annotation


# instance fields
.field private alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

.field private redeemedRewardDetailsScreenRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;Lcom/shopkick/app/application/dialog/DialogsManager;)V
    .locals 1

    .line 528
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 529
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$MarkAsUnusedClick;->redeemedRewardDetailsScreenRef:Ljava/lang/ref/WeakReference;

    .line 531
    iput-object p2, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$MarkAsUnusedClick;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 536
    iget-object p1, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$MarkAsUnusedClick;->redeemedRewardDetailsScreenRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;

    if-nez p1, :cond_0

    return-void

    .line 539
    :cond_0
    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, "connectivity"

    .line 542
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    .line 543
    new-instance v1, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    invoke-direct {v1, v0}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;-><init>(Landroid/net/ConnectivityManager;)V

    .line 544
    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;->isNetworkConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 545
    invoke-static {p1}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->access$200(Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;)V

    .line 546
    invoke-virtual {p1}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->popScreen()V

    goto :goto_0

    .line 548
    :cond_1
    iget-object v0, p0, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen$MarkAsUnusedClick;->alertViewFactory:Lcom/shopkick/app/application/dialog/DialogsManager;

    const v1, 0x7f110568

    invoke-virtual {p1, v1}, Lcom/shopkick/app/rewards/RedeemedRewardDetailsScreen;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_2
    :goto_0
    return-void
.end method
