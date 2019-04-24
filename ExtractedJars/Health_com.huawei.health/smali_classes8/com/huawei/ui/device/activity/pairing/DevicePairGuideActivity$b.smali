.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$b;
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
    name = "b"
.end annotation


# instance fields
.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 1

    .line 722
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 721
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$b;->e:Ljava/lang/ref/WeakReference;

    .line 723
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$b;->e:Ljava/lang/ref/WeakReference;

    .line 724
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 728
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$b;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    .line 729
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 730
    return-void

    .line 732
    :cond_0
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "unbindDeviceList Enter callback err_code:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->s(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 734
    const/4 v0, 0x1

    invoke-static {v4, v0}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->c(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;Z)V

    .line 735
    return-void
.end method
