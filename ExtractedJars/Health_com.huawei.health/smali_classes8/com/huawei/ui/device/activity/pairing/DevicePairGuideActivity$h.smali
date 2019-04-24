.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 1

    .line 576
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 575
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;->a:Ljava/lang/ref/WeakReference;

    .line 577
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;->a:Ljava/lang/ref/WeakReference;

    .line 578
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 582
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    .line 583
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 584
    return-void

    .line 587
    :cond_0
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isHuaweiWearBinded err_code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " objData:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 588
    new-instance v0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;

    invoke-direct {v0, p0, p1, p2, v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h$1;-><init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$h;ILjava/lang/Object;Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V

    invoke-virtual {v4, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 605
    return-void
.end method
