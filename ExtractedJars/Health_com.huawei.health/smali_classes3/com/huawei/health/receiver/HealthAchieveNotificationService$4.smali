.class Lcom/huawei/health/receiver/HealthAchieveNotificationService$4;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/receiver/HealthAchieveNotificationService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/receiver/HealthAchieveNotificationService;


# direct methods
.method constructor <init>(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)V
    .locals 0

    .line 55
    iput-object p1, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$4;->d:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 58
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 59
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 62
    :sswitch_0
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$4;->d:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    iget v1, p1, Landroid/os/Message;->arg1:I

    invoke-static {v0, v1}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->c(Lcom/huawei/health/receiver/HealthAchieveNotificationService;I)I

    .line 63
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$4;->d:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-static {v0, v1}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->b(Lcom/huawei/health/receiver/HealthAchieveNotificationService;I)I

    .line 64
    invoke-static {}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handler mMinReportNo="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$4;->d:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-static {v3}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->c(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "mMaxReportNo"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$4;->d:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-static {v3}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    iget-object v0, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$4;->d:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    iget-object v1, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$4;->d:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-static {v1}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->c(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)I

    move-result v1

    iget-object v2, p0, Lcom/huawei/health/receiver/HealthAchieveNotificationService$4;->d:Lcom/huawei/health/receiver/HealthAchieveNotificationService;

    invoke-static {v2}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->e(Lcom/huawei/health/receiver/HealthAchieveNotificationService;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d(II)V

    .line 66
    goto :goto_1

    .line 68
    :goto_0
    invoke-static {}, Lcom/huawei/health/receiver/HealthAchieveNotificationService;->d()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Main Thread receive unknown message"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
