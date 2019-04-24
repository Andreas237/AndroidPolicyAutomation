.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V
    .locals 0

    .line 284
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$3;->e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 287
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v4

    .line 288
    const/16 v0, 0xd

    invoke-virtual {v4, v0}, Ljava/util/Calendar;->get(I)I

    move-result v5

    .line 289
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "==once== set timer enter...curSecond = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 290
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$3;->e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;

    move-result-object v0

    add-int/lit8 v1, v5, -0x1

    mul-int/lit16 v1, v1, 0x3e8

    const v2, 0xea60

    sub-int v1, v2, v1

    int-to-long v1, v1

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 292
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$3;->e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->n(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    .line 294
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$3;->e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->s(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)V

    .line 295
    return-void
.end method
