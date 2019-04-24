.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/health/suggestion/ui/fitness/service/DeviceRecordSyncService$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V
    .locals 1

    .line 481
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 482
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$b;->d:Ljava/lang/ref/WeakReference;

    .line 483
    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 486
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceRecordSync,errorCode:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 487
    return-void
.end method

.method public e()V
    .locals 5

    .line 491
    const-string v0, "FitnessHistoryActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DeviceRecordSync finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 492
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity$b;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;

    .line 493
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 494
    invoke-static {v4}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessHistoryActivity;)V

    .line 496
    :cond_0
    return-void
.end method
