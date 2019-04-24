.class Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;
.super Landroid/os/AsyncTask;
.source "RewardsDataController.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/rewards/RewardsDataController;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LoadRewardsMallItemsTask"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "Ljava/util/List<",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field private weakRefRewardsDataController:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/rewards/RewardsDataController;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/shopkick/app/rewards/RewardsDataController;)V
    .locals 1

    .line 628
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 629
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;->weakRefRewardsDataController:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 623
    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;->doInBackground([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Object;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 634
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;->weakRefRewardsDataController:Ljava/lang/ref/WeakReference;

    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 635
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;->weakRefRewardsDataController:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-static {p1}, Lcom/shopkick/app/rewards/RewardsDataController;->access$000(Lcom/shopkick/app/rewards/RewardsDataController;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 623
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;->onPostExecute(Ljava/util/List;)V

    return-void
.end method

.method protected onPostExecute(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 640
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;->weakRefRewardsDataController:Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lcom/shopkick/app/util/NullUtils;->isNull(Ljava/lang/ref/WeakReference;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 642
    iget-object v0, p0, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;->weakRefRewardsDataController:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/rewards/RewardsDataController;

    invoke-static {v0, p1}, Lcom/shopkick/app/rewards/RewardsDataController;->access$100(Lcom/shopkick/app/rewards/RewardsDataController;Ljava/util/List;)V

    .line 643
    iget-object p1, p0, Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;->weakRefRewardsDataController:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/rewards/RewardsDataController;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/shopkick/app/rewards/RewardsDataController;->access$202(Lcom/shopkick/app/rewards/RewardsDataController;Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;)Lcom/shopkick/app/rewards/RewardsDataController$LoadRewardsMallItemsTask;

    :cond_1
    return-void
.end method
