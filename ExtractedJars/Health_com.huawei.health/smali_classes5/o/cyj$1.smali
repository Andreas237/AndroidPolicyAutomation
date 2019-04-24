.class Lo/cyj$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cxx;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cyj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/cyj;


# direct methods
.method constructor <init>(Lo/cyj;)V
    .locals 0

    .line 1165
    iput-object p1, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V
    .locals 8

    .line 1169
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "device state changed, btState:"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1170
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->b(Lo/cyj;)Lo/cxx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    .line 1171
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "BTDeviceSendCommandUtil"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1172
    return-void

    .line 1175
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device Mac Address = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->d(Lo/cyj;)Lo/cxk;

    move-result-object v4

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceIdentify()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lo/cxk;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1176
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Device Protocol = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceProtocol()I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1178
    const/4 v0, 0x1

    if-ne v0, p2, :cond_2

    .line 1180
    new-instance v6, Landroid/os/Message;

    invoke-direct {v6}, Landroid/os/Message;-><init>()V

    .line 1181
    const/4 v0, 0x2

    iput v0, v6, Landroid/os/Message;->what:I

    .line 1182
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to create connect timeout info msg."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1183
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->e(Lo/cyj;)Landroid/os/Handler;

    move-result-object v0

    const-wide/32 v1, 0xea60

    invoke-virtual {v0, v6, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 1184
    goto :goto_0

    .line 1186
    :cond_2
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to remove connect timeout message."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1187
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->e(Lo/cyj;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1190
    :goto_0
    const/4 v0, 0x2

    if-eq v0, p2, :cond_8

    .line 1191
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyj;->d(Lo/cyj;Z)Z

    .line 1192
    const/4 v0, 0x3

    if-ne v0, p2, :cond_5

    .line 1194
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1195
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to clear command list for disconnect."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1196
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->f(Lo/cyj;)Ljava/lang/Object;

    move-result-object v6

    monitor-enter v6

    .line 1198
    :try_start_0
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->c(Lo/cyj;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1199
    monitor-exit v6

    goto :goto_1

    :catchall_0
    move-exception v7

    monitor-exit v6

    throw v7

    .line 1203
    :cond_3
    :goto_1
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->e(Lo/cyj;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 1206
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    iget-object v1, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->k(Lo/cyj;)I

    move-result v1

    invoke-static {v0, v1}, Lo/cyj;->d(Lo/cyj;I)I

    .line 1209
    invoke-virtual {p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_4

    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_4

    .line 1210
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Need reset reSendCounter and unLockAW."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1212
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->g(Lo/cyj;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/cyj$1$4;

    invoke-direct {v1, p0}, Lo/cyj$1$4;-><init>(Lo/cyj$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    goto :goto_2

    .line 1219
    :cond_4
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Need reset reSendCounter and unlockBT."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1221
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->g(Lo/cyj;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/cyj$1$1;

    invoke-direct {v1, p0}, Lo/cyj$1$1;-><init>(Lo/cyj$1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1231
    :cond_5
    :goto_2
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_6

    .line 1232
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Reset V2 package info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1233
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->p(Lo/cyj;)Lo/cyv;

    move-result-object v0

    invoke-virtual {v0}, Lo/cyv;->d()V

    .line 1237
    :cond_6
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->n(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_7

    .line 1238
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyj;->b(Lo/cyj;Z)Z

    .line 1240
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 1241
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    invoke-interface {v0}, Lo/cyn;->h()V

    .line 1245
    :cond_7
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceProtocol(I)V

    .line 1246
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0, p2}, Lo/cyj;->e(Lo/cyj;I)I

    .line 1247
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->b(Lo/cyj;)Lo/cxx;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    goto/16 :goto_3

    .line 1250
    :cond_8
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->o(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_9

    .line 1251
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Already finish handshake and repeat report connected."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1252
    return-void

    .line 1256
    :cond_9
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->u(Lo/cyj;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1257
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Already Start handshake."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1258
    return-void

    .line 1261
    :cond_a
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cyj;->d(Lo/cyj;Z)Z

    .line 1263
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->n(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_b

    .line 1265
    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceProtocol(I)V

    .line 1266
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/cyj;->a(Lo/cyj;I)I

    .line 1268
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Set init AW Device Protocol = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->i(Lo/cyj;)I

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1273
    :cond_b
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_c

    .line 1276
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->n(Lo/cyj;)I

    move-result v0

    invoke-static {v0}, Lo/cxo;->d(I)Lo/cye;

    move-result-object v6

    .line 1277
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to get link parameter."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1279
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-virtual {v0, v6}, Lo/cyj;->a(Lo/cye;)V

    .line 1280
    goto/16 :goto_3

    :cond_c
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_e

    .line 1282
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->n(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_d

    .line 1283
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Start to get bond status info."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1285
    const/4 v0, 0x5

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 1287
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x1

    invoke-static {v1}, Lo/cxo;->c(I)Lo/cye;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/cyj;->a(Lo/cye;)V

    goto :goto_3

    .line 1290
    :cond_d
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0, p2}, Lo/cyj;->e(Lo/cyj;I)I

    .line 1292
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceProtocol(I)V

    .line 1294
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyj;->d(Lo/cyj;Z)Z

    .line 1296
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->b(Lo/cyj;)Lo/cxx;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    goto :goto_3

    .line 1299
    :cond_e
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 1300
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceProtocol(I)V

    .line 1302
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0, p2}, Lo/cyj;->e(Lo/cyj;I)I

    .line 1304
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyj;->d(Lo/cyj;Z)Z

    .line 1306
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->b(Lo/cyj;)Lo/cxx;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    .line 1309
    :goto_3
    return-void
.end method

.method public e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V
    .locals 10

    .line 1315
    const/4 v0, 0x0

    if-eq v0, p3, :cond_24

    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->b(Lo/cyj;)Lo/cxx;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_24

    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->n(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->p(Lo/cyj;)Lo/cyv;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_24

    .line 1316
    :cond_0
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x2

    if-ne v1, v0, :cond_9

    .line 1318
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->n(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    array-length v0, p3

    const/4 v1, 0x6

    if-ne v1, v0, :cond_2

    const/4 v0, 0x1

    aget-byte v0, p3, v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_2

    const/4 v0, 0x3

    aget-byte v0, p3, v0

    const/16 v1, 0x24

    if-ne v1, v0, :cond_2

    .line 1319
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->s(Lo/cyj;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1320
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "receive v1 check command and has not checked aw version."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1322
    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setProductType(I)V

    .line 1323
    const-string v0, "HUAWEI WATCH"

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceName(Ljava/lang/String;)V

    .line 1326
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyj;->d(Lo/cyj;I)I

    .line 1328
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->m(Lo/cyj;)V

    .line 1331
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cyj;->b(Lo/cyj;Z)Z

    .line 1334
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/cyj;->a(Lo/cyj;I)I

    .line 1335
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->setDeviceProtocol(I)V

    .line 1337
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x2

    invoke-static {v0, v1}, Lo/cyj;->e(Lo/cyj;I)I

    .line 1339
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/cyj;->d(Lo/cyj;Z)Z

    .line 1341
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->b(Lo/cyj;)Lo/cxx;

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {v0, p1, v1}, Lo/cxx;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I)V

    goto :goto_0

    .line 1343
    :cond_1
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "receive v1 check command but has checked aw version."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1347
    :goto_0
    return-void

    .line 1351
    :cond_2
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->p(Lo/cyj;)Lo/cyv;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/cyv;->c(I[B)Ljava/lang/String;

    move-result-object v5

    .line 1352
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 1353
    invoke-static {v5}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object p3

    .line 1354
    array-length p2, p3

    goto :goto_1

    .line 1356
    :cond_3
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "BLE package and length less than MTU threshold."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1357
    return-void

    .line 1361
    :goto_1
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->p(Lo/cyj;)Lo/cyv;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/cyv;->a(I[B)Ljava/util/List;

    move-result-object v6

    .line 1362
    const/4 v0, 0x0

    if-ne v0, v6, :cond_4

    .line 1363
    return-void

    .line 1367
    :cond_4
    const/4 v7, 0x0

    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-ge v7, v0, :cond_8

    .line 1368
    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/cyh;

    .line 1369
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "slice info = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, v8, Lo/cyh;->d:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ". success info = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, v8, Lo/cyh;->b:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ". receivedAll info = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-boolean v4, v8, Lo/cyh;->e:Z

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1370
    iget-boolean v0, v8, Lo/cyh;->d:Z

    if-nez v0, :cond_5

    iget-boolean v0, v8, Lo/cyh;->b:Z

    if-eqz v0, :cond_5

    .line 1372
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    iget v1, v8, Lo/cyh;->c:I

    iget-object v2, v8, Lo/cyh;->a:[B

    invoke-static {v0, p1, v1, v2}, Lo/cyj;->c(Lo/cyj;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    goto/16 :goto_4

    .line 1375
    :cond_5
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget v0, v0, Lo/cyh;->c:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 1376
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-object v0, v0, Lo/cyh;->a:[B

    array-length v0, v0

    iget-object v1, v8, Lo/cyh;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    new-array v9, v0, [B

    .line 1377
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-object v0, v0, Lo/cyh;->a:[B

    iget-object v1, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v1

    iget-object v1, v1, Lo/cyh;->a:[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v9, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1378
    iget-object v0, v8, Lo/cyh;->a:[B

    iget-object v1, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v1

    iget-object v1, v1, Lo/cyh;->a:[B

    array-length v1, v1

    iget-object v2, v8, Lo/cyh;->a:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1379
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iput-object v9, v0, Lo/cyh;->a:[B

    .line 1380
    goto :goto_3

    .line 1381
    :cond_6
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-object v1, v8, Lo/cyh;->a:[B

    iput-object v1, v0, Lo/cyh;->a:[B

    .line 1385
    :goto_3
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget v1, v0, Lo/cyh;->c:I

    iget v2, v8, Lo/cyh;->c:I

    add-int/2addr v1, v2

    iput v1, v0, Lo/cyh;->c:I

    .line 1386
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-boolean v1, v8, Lo/cyh;->b:Z

    iput-boolean v1, v0, Lo/cyh;->b:Z

    .line 1387
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-boolean v1, v8, Lo/cyh;->e:Z

    iput-boolean v1, v0, Lo/cyh;->e:Z

    .line 1389
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-boolean v0, v0, Lo/cyh;->e:Z

    if-eqz v0, :cond_7

    .line 1391
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    iget-object v1, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v1

    iget v1, v1, Lo/cyh;->c:I

    iget-object v2, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v2}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v2

    iget-object v2, v2, Lo/cyh;->a:[B

    invoke-static {v0, p1, v1, v2}, Lo/cyj;->c(Lo/cyj;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 1394
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/cyh;->e:Z

    .line 1395
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Lo/cyh;->c:I

    .line 1396
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, v0, Lo/cyh;->a:[B

    .line 1397
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/cyh;->d:Z

    .line 1367
    :cond_7
    :goto_4
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_2

    .line 1401
    :cond_8
    goto/16 :goto_b

    :cond_9
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1b

    .line 1402
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Current is V1 Protocol."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1404
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->n(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_a

    .line 1408
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    array-length v1, p3

    invoke-static {v0, p1, v1, p3}, Lo/cyj;->c(Lo/cyj;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 1410
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->h(Lo/cyj;)V

    goto/16 :goto_b

    .line 1413
    :cond_a
    invoke-static {p3}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 1417
    const-string v0, "AA0100496C"

    invoke-virtual {v5, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    .line 1418
    const-string v0, "AA0100496C"

    const-string v1, ""

    invoke-virtual {v5, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v7

    .line 1419
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 1421
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Receive ACK info and Response at the same time."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->e(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1423
    invoke-static {v7}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v6

    goto :goto_5

    .line 1426
    :cond_b
    move-object v6, p3

    .line 1428
    :goto_5
    goto :goto_6

    .line 1430
    :cond_c
    move-object v6, p3

    .line 1434
    :goto_6
    invoke-static {v6}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v5

    .line 1436
    const-string v0, "AA0100496C"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "AA01000049"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "AA0C010000"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 1437
    :cond_d
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Receive ACK info, mIsLastCommandPackage = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v4}, Lo/cyj;->r(Lo/cyj;)Z

    move-result v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1441
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->r(Lo/cyj;)Z

    move-result v0

    if-nez v0, :cond_e

    .line 1442
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->m(Lo/cyj;)V

    goto/16 :goto_8

    .line 1444
    :cond_e
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "The last CommandPackage, do unLockBT() need wait response in reportReceivedData()"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_8

    .line 1446
    :cond_f
    const-string v0, "AA0102692E"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_10

    .line 1448
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "device tell sdk receive a incorrect command."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_8

    .line 1451
    :cond_10
    invoke-static {v6}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "cc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_11

    invoke-static {v6}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "CC"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_12

    .line 1453
    :cond_11
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    array-length v1, v6

    invoke-static {v0, p1, v1, v6}, Lo/cyj;->c(Lo/cyj;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    goto/16 :goto_8

    .line 1455
    :cond_12
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->p(Lo/cyj;)Lo/cyv;

    move-result-object v0

    array-length v1, v6

    invoke-virtual {v0, v1, v6}, Lo/cyv;->a(I[B)Ljava/util/List;

    move-result-object v7

    .line 1456
    const/4 v0, 0x0

    if-eq v0, v7, :cond_13

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_14

    .line 1457
    :cond_13
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Parse response packet fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1458
    return-void

    .line 1462
    :cond_14
    const/4 v0, 0x0

    invoke-interface {v7, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lo/cyh;

    .line 1463
    iget-boolean v0, v8, Lo/cyh;->d:Z

    if-nez v0, :cond_16

    .line 1465
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_15

    .line 1466
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    const-string v1, "AA0101594D"

    invoke-static {v1}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v1

    invoke-interface {v0, v1}, Lo/cyn;->a([B)Z

    .line 1470
    :cond_15
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Report V1 not sliced data."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1471
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    iget v1, v8, Lo/cyh;->c:I

    iget-object v2, v8, Lo/cyh;->a:[B

    invoke-static {v0, p1, v1, v2}, Lo/cyj;->c(Lo/cyj;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    goto/16 :goto_8

    .line 1474
    :cond_16
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget v0, v0, Lo/cyh;->c:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_18

    .line 1476
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-object v0, v0, Lo/cyh;->a:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_17

    iget-object v0, v8, Lo/cyh;->a:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_17

    .line 1477
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-object v0, v0, Lo/cyh;->a:[B

    array-length v0, v0

    iget-object v1, v8, Lo/cyh;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    new-array v9, v0, [B

    .line 1478
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-object v0, v0, Lo/cyh;->a:[B

    iget-object v1, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v1

    iget-object v1, v1, Lo/cyh;->a:[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v9, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1479
    iget-object v0, v8, Lo/cyh;->a:[B

    iget-object v1, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v1

    iget-object v1, v1, Lo/cyh;->a:[B

    array-length v1, v1

    iget-object v2, v8, Lo/cyh;->a:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v9, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1480
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iput-object v9, v0, Lo/cyh;->a:[B

    .line 1481
    goto :goto_7

    .line 1482
    :cond_17
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "data array is null."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_7

    .line 1486
    :cond_18
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-object v1, v8, Lo/cyh;->a:[B

    iput-object v1, v0, Lo/cyh;->a:[B

    .line 1490
    :goto_7
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget v1, v0, Lo/cyh;->c:I

    iget v2, v8, Lo/cyh;->c:I

    add-int/2addr v1, v2

    iput v1, v0, Lo/cyh;->c:I

    .line 1491
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-boolean v1, v8, Lo/cyh;->b:Z

    iput-boolean v1, v0, Lo/cyh;->b:Z

    .line 1492
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-boolean v1, v8, Lo/cyh;->e:Z

    iput-boolean v1, v0, Lo/cyh;->e:Z

    .line 1495
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_19

    .line 1496
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    const-string v1, "AA0101594D"

    invoke-static {v1}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v1

    invoke-interface {v0, v1}, Lo/cyn;->a([B)Z

    .line 1499
    :cond_19
    iget-boolean v0, v8, Lo/cyh;->e:Z

    if-eqz v0, :cond_1a

    .line 1501
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Report V1 sliced data."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1502
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    iget-object v1, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v1

    iget v1, v1, Lo/cyh;->c:I

    iget-object v2, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v2}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v2

    iget-object v2, v2, Lo/cyh;->a:[B

    invoke-static {v0, p1, v1, v2}, Lo/cyj;->c(Lo/cyj;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 1504
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/cyh;->e:Z

    .line 1505
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Lo/cyh;->c:I

    .line 1506
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, v0, Lo/cyh;->a:[B

    .line 1507
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/cyh;->d:Z

    .line 1512
    :cond_1a
    :goto_8
    goto/16 :goto_b

    .line 1513
    :cond_1b
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->i(Lo/cyj;)I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_23

    .line 1514
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Current is V0 Protocol."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1517
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->p(Lo/cyj;)Lo/cyv;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lo/cyv;->a(I[B)Ljava/util/List;

    move-result-object v5

    .line 1518
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1c

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1d

    .line 1519
    :cond_1c
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Parse response packet fail."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1520
    return-void

    .line 1525
    :cond_1d
    const/4 v0, 0x0

    invoke-interface {v5, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/cyh;

    .line 1526
    iget-boolean v0, v6, Lo/cyh;->d:Z

    if-nez v0, :cond_1e

    .line 1531
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    iget v1, v6, Lo/cyh;->c:I

    iget-object v2, v6, Lo/cyh;->a:[B

    invoke-static {v0, p1, v1, v2}, Lo/cyj;->c(Lo/cyj;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    goto/16 :goto_a

    .line 1534
    :cond_1e
    iget-boolean v0, v6, Lo/cyh;->b:Z

    if-eqz v0, :cond_21

    .line 1536
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1f

    .line 1538
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->l(Lo/cyj;)Lo/cyn;

    move-result-object v0

    invoke-interface {v0, p3}, Lo/cyn;->a([B)Z

    .line 1541
    :cond_1f
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget v0, v0, Lo/cyh;->c:I

    const/4 v1, 0x0

    if-eq v1, v0, :cond_20

    .line 1542
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-object v0, v0, Lo/cyh;->a:[B

    array-length v0, v0

    iget-object v1, v6, Lo/cyh;->a:[B

    array-length v1, v1

    add-int/2addr v0, v1

    new-array v7, v0, [B

    .line 1543
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-object v0, v0, Lo/cyh;->a:[B

    iget-object v1, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v1

    iget-object v1, v1, Lo/cyh;->a:[B

    array-length v1, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, v2, v7, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1544
    iget-object v0, v6, Lo/cyh;->a:[B

    iget-object v1, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v1

    iget-object v1, v1, Lo/cyh;->a:[B

    array-length v1, v1

    iget-object v2, v6, Lo/cyh;->a:[B

    array-length v2, v2

    const/4 v3, 0x0

    invoke-static {v0, v3, v7, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1545
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iput-object v7, v0, Lo/cyh;->a:[B

    .line 1546
    goto :goto_9

    .line 1547
    :cond_20
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-object v1, v6, Lo/cyh;->a:[B

    iput-object v1, v0, Lo/cyh;->a:[B

    .line 1551
    :goto_9
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget v1, v0, Lo/cyh;->c:I

    iget-object v2, v6, Lo/cyh;->a:[B

    array-length v2, v2

    add-int/2addr v1, v2

    iput v1, v0, Lo/cyh;->c:I

    .line 1552
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-boolean v1, v6, Lo/cyh;->b:Z

    iput-boolean v1, v0, Lo/cyh;->b:Z

    .line 1553
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    iget-boolean v1, v6, Lo/cyh;->e:Z

    iput-boolean v1, v0, Lo/cyh;->e:Z

    .line 1555
    iget-boolean v0, v6, Lo/cyh;->e:Z

    if-eqz v0, :cond_22

    .line 1557
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    iget-object v1, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v1}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v1

    iget v1, v1, Lo/cyh;->c:I

    iget-object v2, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v2}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v2

    iget-object v2, v2, Lo/cyh;->a:[B

    invoke-static {v0, p1, v1, v2}, Lo/cyj;->c(Lo/cyj;Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V

    .line 1559
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/cyh;->e:Z

    .line 1560
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput v1, v0, Lo/cyh;->c:I

    .line 1561
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, v0, Lo/cyh;->a:[B

    .line 1562
    iget-object v0, p0, Lo/cyj$1;->e:Lo/cyj;

    invoke-static {v0}, Lo/cyj;->q(Lo/cyj;)Lo/cyh;

    move-result-object v0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lo/cyh;->d:Z

    goto :goto_a

    .line 1566
    :cond_21
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Receive incorrect data from device."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1569
    :cond_22
    :goto_a
    goto :goto_b

    .line 1570
    :cond_23
    const-string v0, "01"

    const-string v1, "BTDeviceSendCommandUtil"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Do not support this link protocol."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1573
    :cond_24
    :goto_b
    return-void
.end method
