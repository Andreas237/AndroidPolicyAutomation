.class Lcom/shopkick/app/rewards/RewardsListAdapter$SeeUsedClick;
.super Ljava/lang/Object;
.source "RewardsListAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RewardsListAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SeeUsedClick"
.end annotation


# instance fields
.field private adapterRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RewardsListAdapter;",
            ">;"
        }
    .end annotation
.end field

.field private hasUsedRewards:Z


# direct methods
.method constructor <init>(Lcom/shopkick/app/rewards/RewardsListAdapter;Z)V
    .locals 1

    .line 339
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 340
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$SeeUsedClick;->adapterRef:Ljava/lang/ref/WeakReference;

    .line 341
    iput-boolean p2, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$SeeUsedClick;->hasUsedRewards:Z

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 346
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$SeeUsedClick;->adapterRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RewardsListAdapter;

    if-eqz p1, :cond_2

    .line 349
    iget-boolean v0, p0, Lcom/shopkick/app/rewards/RewardsListAdapter$SeeUsedClick;->hasUsedRewards:Z

    if-nez v0, :cond_0

    .line 351
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$200(Lcom/shopkick/app/rewards/RewardsListAdapter;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 352
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$300(Lcom/shopkick/app/rewards/RewardsListAdapter;)Lcom/shopkick/app/application/dialog/DialogsManager;

    move-result-object v0

    .line 353
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$200(Lcom/shopkick/app/rewards/RewardsListAdapter;)Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f110443

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 354
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$200(Lcom/shopkick/app/rewards/RewardsListAdapter;)Landroid/content/Context;

    move-result-object p1

    const v2, 0x7f110442

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 352
    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showCustomAlert(Ljava/lang/String;Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    goto :goto_0

    .line 357
    :cond_0
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$100(Lcom/shopkick/app/rewards/RewardsListAdapter;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;

    .line 358
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$400(Lcom/shopkick/app/rewards/RewardsListAdapter;)Lcom/shopkick/app/fetchers/network/SKConnectivityManager;

    move-result-object v1

    invoke-virtual {v1}, Lcom/shopkick/app/fetchers/network/SKConnectivityManager;->isNetworkConnected()Z

    move-result v1

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 359
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    const-string/jumbo v1, "used_rewards"

    const-string v2, "1"

    .line 360
    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "chain_id"

    .line 361
    invoke-virtual {v0}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->getChainId()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    const-class v1, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;

    invoke-virtual {v0, v1, p1}, Lcom/shopkick/app/rewards/RedeemedRewardsScreen;->goToScreenInCurrentActivity(Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_0

    .line 365
    :cond_1
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$200(Lcom/shopkick/app/rewards/RewardsListAdapter;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 366
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$300(Lcom/shopkick/app/rewards/RewardsListAdapter;)Lcom/shopkick/app/application/dialog/DialogsManager;

    move-result-object v0

    .line 367
    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsListAdapter;->access$200(Lcom/shopkick/app/rewards/RewardsListAdapter;)Landroid/content/Context;

    move-result-object p1

    const v1, 0x7f1105fb

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    .line 366
    invoke-virtual {v0, p1}, Lcom/shopkick/app/application/dialog/DialogsManager;->showDialogWithMessage(Ljava/lang/String;)Lcom/shopkick/app/application/dialog/SKDialogFragment;

    :cond_2
    :goto_0
    return-void
.end method
