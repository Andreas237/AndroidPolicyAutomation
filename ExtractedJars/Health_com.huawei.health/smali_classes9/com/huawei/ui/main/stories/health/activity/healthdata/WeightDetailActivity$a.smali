.class public Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;)V
    .locals 1

    .line 327
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 328
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;->e:Ljava/lang/ref/WeakReference;

    .line 329
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 333
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 334
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 336
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;

    .line 337
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    invoke-static {v4}, Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;->a(Lcom/huawei/ui/main/stories/health/activity/healthdata/WeightDetailActivity;)Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;

    move-result-object v5

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 338
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 339
    invoke-virtual {v5}, Lcom/huawei/ui/main/stories/health/fragment/WeightShareFragment;->d()V

    goto :goto_1

    .line 341
    :cond_1
    const-string v0, "WeightDetailActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage: fragment is null when share the weight details!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cnr;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 343
    .line 349
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x3e8 -> :sswitch_0
    .end sparse-switch
.end method
