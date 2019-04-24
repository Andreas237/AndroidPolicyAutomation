.class Lo/dkw$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkw;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic d:Lo/dkw;


# direct methods
.method private constructor <init>(Lo/dkw;)V
    .locals 0

    .line 2124
    iput-object p1, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo/dkw;Lo/dkw$3;)V
    .locals 0

    .line 2124
    invoke-direct {p0, p1}, Lo/dkw$e;-><init>(Lo/dkw;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 13

    .line 2127
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 2128
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0x9

    if-eq v1, v0, :cond_0

    .line 2129
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DFXAndSleepHandle handleMessage msg = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2134
    :cond_0
    :try_start_0
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 2136
    :sswitch_0
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->A(Lo/dkw;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->A(Lo/dkw;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 2137
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    iget-object v1, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->A(Lo/dkw;)Ljava/util/ArrayList;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v0, v1}, Lo/dkw;->d(Lo/dkw;Ljava/lang/String;)Ljava/lang/String;

    .line 2138
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "start querySleepOrDFXFileInformation fileName = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v3}, Lo/dkw;->f(Lo/dkw;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2139
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/dkw;->i(Lo/dkw;I)I

    .line 2140
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    iget-object v1, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->f(Lo/dkw;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/dkw;->e(Lo/dkw;Ljava/lang/String;)V

    goto/16 :goto_2

    .line 2142
    :cond_1
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v7

    .line 2144
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->c()V

    .line 2145
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->onDestroyMaintenance()V

    .line 2147
    const/4 v0, 0x0

    if-eq v0, v7, :cond_2

    .line 2148
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 2149
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "!!dataPath = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v3}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v3

    invoke-interface {v3}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->getmTransferDataContentPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2151
    new-instance v8, Lo/dkb;

    invoke-direct {v8}, Lo/dkb;-><init>()V

    .line 2152
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->getmTransferDataContentPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/dkb;->e(Ljava/lang/String;)V

    .line 2153
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->getmTransferStateContentPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Lo/dkb;->d(Ljava/lang/String;)V

    .line 2154
    const/16 v0, 0x2710

    invoke-interface {v7, v0, v8}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2155
    goto :goto_0

    .line 2156
    :cond_2
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callback is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2158
    :goto_0
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "maintenance success  ***"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2160
    goto/16 :goto_2

    .line 2163
    :sswitch_1
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->n(Lo/dkw;)I

    .line 2165
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->o(Lo/dkw;)I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    .line 2166
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5927\u4e8e3\u6b21\u5931\u8d25 reTransforTime = 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2167
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->c()V

    .line 2168
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 2171
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_3

    .line 2172
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5927\u4e8e3\u6b21\u5931\u8d25 \u4fdd\u5b58\u5df2\u91c7\u96c6\u65e5\u5fd7\u5230\u672c\u5730 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2173
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    new-instance v1, Lo/dkw$e$1;

    invoke-direct {v1, p0}, Lo/dkw$e$1;-><init>(Lo/dkw$e;)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto :goto_1

    .line 2182
    :cond_3
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 2183
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    if-eqz v0, :cond_4

    .line 2184
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryResult(Z)V

    .line 2186
    :cond_4
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->d(Lo/dkw;)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_1

    .line 2189
    :cond_5
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "maintenanceCallback is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2191
    :goto_1
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_19

    .line 2192
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    goto/16 :goto_2

    .line 2201
    :cond_6
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_19

    .line 2202
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4e22\u5305\u91cd\u53d1"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2203
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->b()V

    goto/16 :goto_2

    .line 2209
    :sswitch_2
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "data transfer time out ...."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2210
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->c()V

    .line 2211
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_9

    .line 2213
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_7

    .line 2214
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u53ef\u7ef4\u53ef\u6d4b  \u6307\u4ee4\u4e0a\u62a5\u8d85\u65f6 \u4fdd\u5b58\u5df2\u91c7\u96c6\u65e5\u5fd7\u5230\u672c\u5730 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2215
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    new-instance v1, Lo/dkw$e$2;

    invoke-direct {v1, p0}, Lo/dkw$e$2;-><init>(Lo/dkw$e;)V

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->save2File(Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    goto/16 :goto_2

    .line 2224
    :cond_7
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    sget-object v1, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH_TEMP:Ljava/lang/String;

    sget-object v2, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;->LOG_PATH:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->cutFolder(Ljava/lang/String;Ljava/lang/String;)V

    .line 2225
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    if-eqz v0, :cond_8

    .line 2226
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryResult(Z)V

    .line 2228
    :cond_8
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "30s timeout"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 2231
    :cond_9
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "maintenanceCallback is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2233
    goto/16 :goto_2

    .line 2235
    :sswitch_3
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->getErrorCode([B)[I

    move-result-object v6

    .line 2237
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0, v6}, Lo/dkw;->b(Lo/dkw;Ljava/lang/Object;)V

    .line 2238
    goto/16 :goto_2

    .line 2240
    :sswitch_4
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    .line 2241
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2243
    :cond_a
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    move-object v7, v0

    check-cast v7, [B

    .line 2244
    array-length v0, v7

    const/16 v1, 0x8

    if-ne v1, v0, :cond_f

    const/4 v0, 0x2

    aget-byte v0, v7, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_f

    .line 2246
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0, v7}, Lo/dkw;->e(Lo/dkw;[B)Z

    move-result v0

    if-eqz v0, :cond_d

    .line 2247
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is LEO return "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2248
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dkq;->c(Z)V

    .line 2249
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    iget-object v1, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v1}, Lo/dkw;->D(Lo/dkw;)Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    move-result-object v1

    invoke-virtual {v1}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getIsUploadAppLog()I

    move-result v1

    invoke-static {v0, v1}, Lo/dkw;->f(Lo/dkw;I)I

    .line 2252
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "last_trigger_beta_log_time"

    .line 2253
    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Lo/dcy;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lo/dcy;-><init>(I)V

    .line 2252
    invoke-static {v0, v1, v2, v3, v4}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 2255
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->g()V

    .line 2257
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 2258
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    const-wide/32 v2, 0x927c0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 2261
    :cond_b
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isgetlog_from_aboutactivity  == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v3}, Lo/dkw;->B(Lo/dkw;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2262
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->B(Lo/dkw;)Z

    move-result v0

    if-nez v0, :cond_c

    .line 2263
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 2264
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "is LEO return  callback"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2265
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const v1, 0x1adb2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2269
    :cond_c
    return-void

    .line 2272
    :cond_d
    :try_start_1
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->c()V

    .line 2273
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_19

    .line 2274
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->onDestroyMaintenance()V

    .line 2275
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_e

    .line 2276
    invoke-static {v7}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v8

    .line 2277
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbackErrorCode messageHex = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v8, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2278
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v8, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v9

    .line 2279
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v1, v9}, Lo/dkw;->c(Lo/dkw;I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v9, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2280
    goto/16 :goto_2

    .line 2281
    :cond_e
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-static {v7}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 2285
    :cond_f
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unGetFileName([B)Ljava/util/ArrayList;

    move-result-object v6

    .line 2286
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0, v6}, Lo/dkw;->h(Lo/dkw;Ljava/lang/Object;)V

    .line 2288
    goto/16 :goto_2

    .line 2290
    :sswitch_5
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_10

    .line 2291
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2293
    :cond_10
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    move-object v8, v0

    check-cast v8, [B

    .line 2294
    array-length v0, v8

    const/16 v1, 0x8

    if-ne v1, v0, :cond_11

    const/4 v0, 0x2

    aget-byte v0, v8, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_11

    .line 2295
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->c()V

    .line 2296
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0, v8}, Lo/dkw;->d(Lo/dkw;[B)V

    .line 2299
    :cond_11
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unGetMaintParameters([B)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintParameters;

    move-result-object v6

    .line 2300
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0, v6}, Lo/dkw;->i(Lo/dkw;Ljava/lang/Object;)V

    .line 2301
    goto/16 :goto_2

    .line 2303
    :sswitch_6
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_12

    .line 2304
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2306
    :cond_12
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    move-object v9, v0

    check-cast v9, [B

    .line 2307
    array-length v0, v9

    const/16 v1, 0x8

    if-ne v1, v0, :cond_15

    const/4 v0, 0x2

    aget-byte v0, v9, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_15

    .line 2308
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->c()V

    .line 2309
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_19

    .line 2310
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    invoke-interface {v0}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->onDestroyMaintenance()V

    .line 2311
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    if-eqz v0, :cond_13

    .line 2312
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;->setMaintRetryResult(Z)V

    .line 2314
    :cond_13
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_14

    .line 2315
    invoke-static {v9}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v10

    .line 2316
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "COMMAND_ID_MAINT_QUERY_FILE_INFORMATION messageHex = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v10, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2317
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v10, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v11

    .line 2318
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v1, v11}, Lo/dkw;->c(Lo/dkw;I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v11, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2319
    goto/16 :goto_2

    .line 2320
    :cond_14
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    invoke-static {v9}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2712

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto/16 :goto_2

    .line 2324
    :cond_15
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unQueryFileInformation([B)Lcom/huawei/hwdevicedfxmanager/datatype/DataMaintFileInformation;

    move-result-object v6

    .line 2325
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0, v6}, Lo/dkw;->f(Lo/dkw;Ljava/lang/Object;)V

    .line 2327
    goto/16 :goto_2

    .line 2329
    :sswitch_7
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v1, [B

    check-cast v1, [B

    invoke-virtual {v0, v1}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->getAckCodeExt([B)[I

    move-result-object v6

    .line 2331
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0, v6}, Lo/dkw;->g(Lo/dkw;Ljava/lang/Object;)V

    .line 2332
    goto/16 :goto_2

    .line 2334
    :sswitch_8
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    move-object v10, v0

    check-cast v10, [B

    .line 2335
    array-length v0, v10

    const/16 v1, 0x8

    if-ne v1, v0, :cond_17

    const/4 v0, 0x2

    aget-byte v0, v10, v0

    const/16 v1, 0x7f

    if-ne v1, v0, :cond_17

    .line 2336
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-virtual {v0}, Lo/dkw;->c()V

    .line 2337
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->c(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/utils/MaintenaceInterface;

    move-result-object v0

    instance-of v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/MaintenanceUtil;

    if-eqz v0, :cond_17

    .line 2338
    invoke-static {v10}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v11

    .line 2339
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "COMMAND_ID_MAINT_QUERY_FILE_INFORMATION messageHex = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v11, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2340
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {v11, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v12

    .line 2341
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_16

    .line 2342
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->h(Lo/dkw;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    iget-object v1, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v1, v12}, Lo/dkw;->c(Lo/dkw;I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v12, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 2344
    :cond_16
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 2345
    return-void

    .line 2348
    :cond_17
    :try_start_2
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->x(Lo/dkw;)Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;

    move-result-object v0

    invoke-virtual {v0, v10}, Lcom/huawei/hwdevicedfxmanager/datatype/CommandUnpackage;->unApplyDataFromDevice([B)Lcom/huawei/hwdevicedfxmanager/datatype/FileTransferActiveReport;

    move-result-object v6

    .line 2349
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0, v6}, Lo/dkw;->k(Lo/dkw;Ljava/lang/Object;)V

    .line 2350
    goto :goto_2

    .line 2353
    :sswitch_9
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_18

    .line 2354
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0}, Lo/dkw;->a(Lo/dkw;)Landroid/os/Handler;

    move-result-object v0

    const/16 v1, 0xf

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 2356
    :cond_18
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast v0, [B

    move-object v11, v0

    check-cast v11, [B

    .line 2357
    iget-object v0, p0, Lo/dkw$e;->d:Lo/dkw;

    invoke-static {v0, v11}, Lo/dkw;->b(Lo/dkw;[B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 2358
    .line 2364
    :cond_19
    :goto_2
    goto :goto_3

    .line 2362
    :catch_0
    move-exception v7

    .line 2363
    const-string v0, "HWFileTransferTaskManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessage() Exception e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v7}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 2365
    :goto_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_4
        0x2 -> :sswitch_5
        0x3 -> :sswitch_6
        0x4 -> :sswitch_7
        0x5 -> :sswitch_8
        0x7 -> :sswitch_1
        0xa -> :sswitch_0
        0xb -> :sswitch_9
        0xf -> :sswitch_2
        0x7f -> :sswitch_3
    .end sparse-switch
.end method
