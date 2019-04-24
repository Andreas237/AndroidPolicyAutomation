.class Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "h"
.end annotation


# instance fields
.field a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)V
    .locals 1

    .line 983
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 984
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;->e:Ljava/lang/ref/WeakReference;

    .line 985
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    .line 986
    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 3

    .line 990
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 991
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v2

    .line 992
    const/4 v0, 0x1

    iput v0, v2, Landroid/os/Message;->what:I

    .line 993
    iput-object p2, v2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 994
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity$h;->a:Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/BloodpresureActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 996
    :cond_0
    return-void
.end method
