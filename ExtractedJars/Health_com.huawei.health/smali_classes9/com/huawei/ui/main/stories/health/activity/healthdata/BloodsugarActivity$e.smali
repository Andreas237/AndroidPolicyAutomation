.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)V
    .locals 1

    .line 455
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 456
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$e;->d:Ljava/lang/ref/WeakReference;

    .line 457
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 461
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity$e;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;

    .line 462
    const/4 v0, 0x0

    if-eq v0, v1, :cond_0

    .line 463
    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 464
    const/4 v0, 0x1

    iput v0, v2, Landroid/os/Message;->what:I

    .line 465
    iput-object p2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 466
    invoke-static {v1}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodsugarActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 468
    :cond_0
    return-void
.end method
