.class Lcom/huawei/ui/device/activity/alarm/AlarmActivity$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->onActivityResult(IILandroid/content/Intent;)V
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

    .line 1132
    iput-object p1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$7;->e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 1134
    const-string v0, "AlarmActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "onActivityResult mIbaseResponseCallbach err_code = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ;objData="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1135
    if-nez p1, :cond_0

    .line 1136
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$7;->e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$7;->e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->G(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->e(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)V

    .line 1137
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$7;->e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    iget-object v1, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$7;->e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->G(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->c(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;Ljava/util/List;)Ljava/util/List;

    goto :goto_0

    .line 1139
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$7;->e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v4

    .line 1140
    const/16 v0, 0x69

    iput v0, v4, Landroid/os/Message;->what:I

    .line 1141
    iget-object v0, p0, Lcom/huawei/ui/device/activity/alarm/AlarmActivity$7;->e:Lcom/huawei/ui/device/activity/alarm/AlarmActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/alarm/AlarmActivity;->m(Lcom/huawei/ui/device/activity/alarm/AlarmActivity;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 1143
    :goto_0
    return-void
.end method
