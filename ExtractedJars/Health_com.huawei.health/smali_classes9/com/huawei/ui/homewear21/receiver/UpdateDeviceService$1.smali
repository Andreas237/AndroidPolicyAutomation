.class Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;


# direct methods
.method constructor <init>(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;)V
    .locals 0

    .line 95
    iput-object p1, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 11

    .line 98
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 99
    return-void

    .line 101
    :cond_0
    invoke-static {}, Lo/etq;->d()Lo/etq;

    move-result-object v0

    invoke-virtual {v0}, Lo/etq;->h()Ljava/lang/String;

    move-result-object v4

    .line 102
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v5

    .line 103
    const-string v0, "content"

    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 104
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mAutoCheckNewVersionReceiver onReceive: content = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 105
    const-string v0, "action_band_auto_check_new_version_result"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 106
    const-string v0, "result"

    const/16 v1, 0x8

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v7

    .line 107
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 108
    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_0

    .line 110
    :sswitch_0
    invoke-static {}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 111
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "auto check band success "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;

    const-string v1, "name"

    invoke-virtual {p2, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->b(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;Ljava/lang/String;)Ljava/lang/String;

    .line 113
    iget-object v0, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;

    const-string v1, "size"

    const/4 v2, -0x1

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->a(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;I)I

    .line 115
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AUTO_CHECK_BAND_SUCCESS mCheckBandNewVersionName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;

    invoke-static {v3}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->b(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AUTO_CHECK_BAND_SUCCESS mCheckBandNewVersionSize:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;

    invoke-static {v3}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->e(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 118
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AUTO_CHECK_BAND_SUCCESS deviceName:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const-string v0, "isForced"

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    .line 121
    const/4 v0, 0x0

    if-eq v0, v8, :cond_2

    .line 122
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "is band forcedUPdate:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2

    .line 124
    invoke-static {p1}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;

    invoke-static {v1}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->b(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;

    invoke-static {v2}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->e(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;)I

    move-result v2

    iget-object v3, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;

    invoke-static {v3}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->d(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/eob;->c(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0

    .line 129
    :sswitch_1
    invoke-static {}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 130
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mBandAutoCheckNewVersionReceiver: AUTO_CHECK_BAND_NOT_TIME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 131
    invoke-static {p1}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->p()V

    .line 132
    goto/16 :goto_0

    .line 134
    :sswitch_2
    invoke-static {}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 135
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "band support silence OTA isAutoSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    new-instance v9, Lo/fip;

    invoke-direct {v9}, Lo/fip;-><init>()V

    .line 137
    iget-object v0, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->c(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1$5;-><init>(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 144
    invoke-virtual {v9}, Lo/fip;->d()Z

    move-result v10

    .line 145
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "get auto ota checkbox status,isAutoupdate = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    if-eqz v10, :cond_2

    invoke-static {p1}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->k()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 153
    :cond_1
    invoke-static {p1}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->a()V

    .line 155
    goto :goto_0

    .line 157
    :sswitch_3
    invoke-static {}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 158
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "band not support silence OTA isAutoSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;->c:Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;

    invoke-static {v0}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->c(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1$4;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1$4;-><init>(Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 168
    goto :goto_0

    .line 170
    :sswitch_4
    invoke-static {}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/huawei/ui/homewear21/receiver/UpdateDeviceService;->e(Ljava/lang/String;Landroid/content/Context;)V

    .line 171
    const-string v0, "UpdateDeviceService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "auto download band package success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 172
    invoke-static {p1}, Lo/eob;->c(Landroid/content/Context;)Lo/eob;

    move-result-object v0

    invoke-virtual {v0}, Lo/eob;->m()V

    .line 173
    .line 178
    :cond_2
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x7 -> :sswitch_0
        0xb -> :sswitch_1
        0xc -> :sswitch_3
        0xd -> :sswitch_2
        0x1a -> :sswitch_4
    .end sparse-switch
.end method
