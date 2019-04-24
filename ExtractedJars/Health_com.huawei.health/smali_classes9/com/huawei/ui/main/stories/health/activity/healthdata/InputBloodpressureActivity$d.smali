.class Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;>;"
        }
    .end annotation
.end field

.field e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)V
    .locals 1

    .line 635
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 636
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$d;->b:Ljava/lang/ref/WeakReference;

    .line 637
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$d;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$d;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    .line 638
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 642
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$d;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 643
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$d;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 644
    const/4 v0, 0x4

    iput v0, v2, Landroid/os/Message;->what:I

    .line 645
    iput-object p2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 646
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity$d;->e:Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;->C(Lcom/huawei/ui/main/stories/health/activity/healthdata/InputBloodpressureActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 648
    :cond_0
    return-void
.end method
