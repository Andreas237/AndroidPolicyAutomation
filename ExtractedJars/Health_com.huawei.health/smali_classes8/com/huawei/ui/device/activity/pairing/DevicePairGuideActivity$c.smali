.class Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$c;
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
    name = "c"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)V
    .locals 1

    .line 655
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 654
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$c;->b:Ljava/lang/ref/WeakReference;

    .line 656
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$c;->b:Ljava/lang/ref/WeakReference;

    .line 657
    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 661
    iget-object v0, p0, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity$c;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;

    .line 662
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 663
    return-void

    .line 665
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 666
    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 667
    invoke-static {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->f(Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;)Lo/enw;

    const-string v0, "SURE"

    move-object v1, p2

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 668
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->j(Landroid/content/Context;)V

    .line 672
    :cond_1
    const-string v0, "DevicePairGuideActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Enter showDialogToMigrate finish"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 673
    invoke-virtual {v4}, Lcom/huawei/ui/device/activity/pairing/DevicePairGuideActivity;->finish()V

    .line 674
    return-void
.end method
