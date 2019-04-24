.class Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;)V
    .locals 0

    .line 271
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 275
    const-string v0, "CommonSleepNoDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "coreSleep btn err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 276
    const v0, 0x186a1

    if-ne v0, p1, :cond_0

    .line 277
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    goto :goto_0

    .line 278
    :cond_0
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 279
    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    .line 280
    const-string v0, "CommonSleepNoDataActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "info = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 282
    const-string v0, "0"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 283
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity$5;->a:Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;->d(Lcom/huawei/ui/main/stories/fitness/activity/coreSleep/CommonSleepNoDataActivity;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 286
    :cond_1
    :goto_0
    return-void
.end method
