.class Lo/dkv$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dkv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/dkv;


# direct methods
.method constructor <init>(Lo/dkv;)V
    .locals 0

    .line 186
    iput-object p1, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 15

    .line 189
    invoke-static {}, Lo/dkv;->b()Ljava/lang/Object;

    move-result-object v5

    monitor-enter v5

    .line 190
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "myCallback \u8fdb\u5165\u9501"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dkq;->a(I)V

    .line 192
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 193
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "myCallback \u8fdb\u5165\u9501 size = 0"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 194
    invoke-static {}, Lo/dkq;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    monitor-exit v5

    return-void

    .line 197
    :cond_0
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "myCallback \u6587\u4ef6\u4f20\u8f93\u5b8c\u6bd5\uff0c\u5c06\u8fd4\u56de\u503c\u8fd4\u56de\u7ed9\u4e0a\u5c42 callbacks.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " callbacks.get(0).getType() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v3}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 199
    const/4 v6, 0x0

    .line 200
    const/4 v7, 0x0

    .line 201
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v8

    .line 202
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v1, v0, :cond_1

    .line 203
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getCallback()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lo/yg;

    goto :goto_0

    .line 205
    :cond_1
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    invoke-virtual {v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->getCallback()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lo/djv;

    .line 209
    :goto_0
    move/from16 v0, p1

    const/16 v1, 0x4e20

    if-eq v0, v1, :cond_5

    move/from16 v0, p1

    const/16 v1, 0x4e21

    if-eq v0, v1, :cond_5

    .line 210
    move/from16 v0, p1

    const v1, 0x19643

    if-ne v0, v1, :cond_3

    .line 211
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u4efb\u52a1\u4f20\u8f93\u88ab\u4e2d\u65ad\uff0c\u5220\u9664\u540e\uff0c\u91cd\u65b0\u52a0\u5165\u4efb\u52a1\u961f\u5217"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    .line 213
    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;->setSuspend(I)V

    .line 214
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 215
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dad;->d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V

    .line 216
    iget-object v0, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1, v9}, Lo/dkv;->b(Lo/dkv;Ljava/util/List;Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V

    .line 217
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 218
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "callbacks \u961f\u5217\u4e2d\u8fd8\u6709\u6570\u636e\uff0c\u7ee7\u7eed\u4f20\u8f93"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 219
    iget-object v0, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->c(Lo/dkv;)Lo/dkw;

    move-result-object v0

    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    iget-object v2, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v2}, Lo/dkv;->e(Lo/dkv;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dkw;->d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_1

    .line 221
    :cond_2
    invoke-static {}, Lo/dkq;->i()V

    .line 222
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(I)V

    .line 224
    :goto_1
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u6587\u4ef6\u4f20\u8f93\u5b8c\u6bd5\uff0c\u5c06\u8fd4\u56de\u503c\u8fd4\u56de\u7ed9\u4e0a\u5c42 callbacks.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 225
    goto :goto_3

    .line 226
    :cond_3
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 227
    const/4 v0, 0x0

    invoke-static {v0}, Lo/dad;->d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;)V

    .line 229
    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    .line 230
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "myCallback \u961f\u5217\u4e2d\u8fd8\u6709\u6570\u636e\uff0c\u7ee7\u7eed\u4f20\u8f93"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 231
    iget-object v0, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->c(Lo/dkv;)Lo/dkw;

    move-result-object v0

    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;

    iget-object v2, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v2}, Lo/dkv;->e(Lo/dkv;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/dkw;->d(Lcom/huawei/hwcommonmodel/datatypes/TransferFileInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_2

    .line 233
    :cond_4
    invoke-static {}, Lo/dkq;->i()V

    .line 234
    const/4 v0, -0x1

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/PhoneService;->e(I)V

    .line 236
    :goto_2
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "myCallback \u6587\u4ef6\u4f20\u8f93\u5b8c\u6bd5\uff0c\u5c06\u8fd4\u56de\u503c\u8fd4\u56de\u7ed9\u4e0a\u5c42 callbacks.size() = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lo/dkv;->e()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 239
    :cond_5
    :goto_3
    iget-object v0, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->a(Lo/dkv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Handler;->obtainMessage()Landroid/os/Message;

    move-result-object v9

    .line 241
    const/4 v0, 0x0

    if-eq v0, v6, :cond_6

    .line 242
    new-instance v10, Lcom/huawei/datatype/TransferTaskInfo;

    invoke-direct {v10}, Lcom/huawei/datatype/TransferTaskInfo;-><init>()V

    .line 243
    invoke-virtual {v10, v6}, Lcom/huawei/datatype/TransferTaskInfo;->setObject1(Ljava/lang/Object;)V

    .line 244
    move-object/from16 v0, p2

    invoke-virtual {v10, v0}, Lcom/huawei/datatype/TransferTaskInfo;->setObject2(Ljava/lang/Object;)V

    .line 245
    iput-object v10, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 246
    const/4 v0, 0x1

    iput v0, v9, Landroid/os/Message;->what:I

    .line 247
    move/from16 v0, p1

    iput v0, v9, Landroid/os/Message;->arg1:I

    .line 248
    iget-object v0, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->a(Lo/dkv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 249
    goto/16 :goto_4

    .line 250
    :cond_6
    const/4 v0, 0x0

    if-eq v0, v7, :cond_f

    .line 251
    const/4 v0, 0x2

    if-eq v0, v8, :cond_7

    const/4 v0, 0x4

    if-ne v0, v8, :cond_a

    .line 252
    :cond_7
    const/16 v0, 0x2710

    move/from16 v1, p1

    if-ne v0, v1, :cond_8

    .line 253
    move-object/from16 v10, p2

    check-cast v10, Lo/dkb;

    .line 254
    invoke-virtual {v10}, Lo/dkb;->d()Ljava/lang/String;

    move-result-object v11

    .line 255
    invoke-virtual {v10}, Lo/dkb;->e()Ljava/lang/String;

    move-result-object v12

    .line 256
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDataPath :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getStatusPath :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 258
    new-instance v13, Lcom/huawei/datatype/TransferTaskInfo;

    invoke-direct {v13}, Lcom/huawei/datatype/TransferTaskInfo;-><init>()V

    .line 259
    invoke-virtual {v13, v7}, Lcom/huawei/datatype/TransferTaskInfo;->setObject1(Ljava/lang/Object;)V

    .line 260
    invoke-virtual {v13, v11}, Lcom/huawei/datatype/TransferTaskInfo;->setObject2(Ljava/lang/Object;)V

    .line 261
    invoke-virtual {v13, v12}, Lcom/huawei/datatype/TransferTaskInfo;->setObject3(Ljava/lang/Object;)V

    .line 262
    iput-object v13, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 263
    iput v8, v9, Landroid/os/Message;->what:I

    .line 264
    move/from16 v0, p1

    iput v0, v9, Landroid/os/Message;->arg1:I

    .line 265
    iget-object v0, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->a(Lo/dkv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 266
    goto/16 :goto_4

    :cond_8
    const/16 v0, 0x4e20

    move/from16 v1, p1

    if-ne v0, v1, :cond_9

    .line 267
    move-object/from16 v10, p2

    check-cast v10, Lo/dkb;

    .line 268
    invoke-virtual {v10}, Lo/dkb;->c()I

    move-result v11

    .line 269
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "myHanlder SleepProgress:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 270
    new-instance v12, Lcom/huawei/datatype/TransferTaskInfo;

    invoke-direct {v12}, Lcom/huawei/datatype/TransferTaskInfo;-><init>()V

    .line 271
    invoke-virtual {v12, v7}, Lcom/huawei/datatype/TransferTaskInfo;->setObject1(Ljava/lang/Object;)V

    .line 272
    iput-object v12, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 273
    iput v8, v9, Landroid/os/Message;->what:I

    .line 274
    move/from16 v0, p1

    iput v0, v9, Landroid/os/Message;->arg1:I

    .line 275
    iput v11, v9, Landroid/os/Message;->arg2:I

    .line 276
    iget-object v0, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->a(Lo/dkv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 277
    goto/16 :goto_4

    .line 278
    :cond_9
    new-instance v10, Lcom/huawei/datatype/TransferTaskInfo;

    invoke-direct {v10}, Lcom/huawei/datatype/TransferTaskInfo;-><init>()V

    .line 279
    invoke-virtual {v10, v7}, Lcom/huawei/datatype/TransferTaskInfo;->setObject1(Ljava/lang/Object;)V

    .line 280
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/datatype/TransferTaskInfo;->setObject2(Ljava/lang/Object;)V

    .line 281
    iput-object v10, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 283
    iput v8, v9, Landroid/os/Message;->what:I

    .line 284
    move/from16 v0, p1

    iput v0, v9, Landroid/os/Message;->arg1:I

    .line 285
    iget-object v0, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->a(Lo/dkv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 286
    goto/16 :goto_4

    .line 288
    :cond_a
    const/16 v0, 0x2710

    move/from16 v1, p1

    if-ne v0, v1, :cond_b

    .line 290
    new-instance v10, Lcom/huawei/datatype/TransferTaskInfo;

    invoke-direct {v10}, Lcom/huawei/datatype/TransferTaskInfo;-><init>()V

    .line 291
    invoke-virtual {v10, v7}, Lcom/huawei/datatype/TransferTaskInfo;->setObject1(Ljava/lang/Object;)V

    .line 292
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lcom/huawei/datatype/TransferTaskInfo;->setObject2(Ljava/lang/Object;)V

    .line 293
    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lcom/huawei/datatype/TransferTaskInfo;->setObject3(Ljava/lang/Object;)V

    .line 294
    iput-object v10, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 295
    const/4 v0, 0x0

    iput v0, v9, Landroid/os/Message;->what:I

    .line 296
    move/from16 v0, p1

    iput v0, v9, Landroid/os/Message;->arg1:I

    .line 297
    iget-object v0, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->a(Lo/dkv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 298
    goto/16 :goto_4

    :cond_b
    const/16 v0, 0x4e21

    move/from16 v1, p1

    if-ne v0, v1, :cond_d

    .line 299
    move-object/from16 v10, p2

    check-cast v10, Ljava/lang/String;

    .line 300
    const-string v0, "&"

    invoke-virtual {v10, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v11

    .line 301
    array-length v0, v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x2

    if-ge v0, v1, :cond_c

    .line 302
    monitor-exit v5

    return-void

    .line 304
    :cond_c
    const/4 v0, 0x0

    :try_start_2
    aget-object v0, v11, v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    .line 305
    new-instance v13, Lcom/huawei/datatype/TransferTaskInfo;

    invoke-direct {v13}, Lcom/huawei/datatype/TransferTaskInfo;-><init>()V

    .line 306
    invoke-virtual {v13, v7}, Lcom/huawei/datatype/TransferTaskInfo;->setObject1(Ljava/lang/Object;)V

    .line 307
    const/4 v0, 0x1

    aget-object v0, v11, v0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/TransferTaskInfo;->setObject2(Ljava/lang/Object;)V

    .line 308
    const/4 v0, 0x0

    invoke-virtual {v13, v0}, Lcom/huawei/datatype/TransferTaskInfo;->setObject3(Ljava/lang/Object;)V

    .line 309
    iput-object v13, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 310
    const/4 v0, 0x0

    iput v0, v9, Landroid/os/Message;->what:I

    .line 311
    move/from16 v0, p1

    iput v0, v9, Landroid/os/Message;->arg1:I

    .line 312
    iput v12, v9, Landroid/os/Message;->arg2:I

    .line 313
    iget-object v0, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->a(Lo/dkv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 315
    goto :goto_4

    :cond_d
    const v0, 0x1adb2

    move/from16 v1, p1

    if-ne v0, v1, :cond_e

    .line 316
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "110002\u95ed\u5408"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 318
    :cond_e
    new-instance v10, Lcom/huawei/datatype/TransferTaskInfo;

    invoke-direct {v10}, Lcom/huawei/datatype/TransferTaskInfo;-><init>()V

    .line 319
    invoke-virtual {v10, v7}, Lcom/huawei/datatype/TransferTaskInfo;->setObject1(Ljava/lang/Object;)V

    .line 320
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Lcom/huawei/datatype/TransferTaskInfo;->setObject2(Ljava/lang/Object;)V

    .line 321
    iput-object v10, v9, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 322
    const/4 v0, 0x0

    iput v0, v9, Landroid/os/Message;->what:I

    .line 323
    move/from16 v0, p1

    iput v0, v9, Landroid/os/Message;->arg1:I

    .line 324
    iget-object v0, p0, Lo/dkv$4;->e:Lo/dkv;

    invoke-static {v0}, Lo/dkv;->a(Lo/dkv;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 329
    :cond_f
    :goto_4
    const-string v0, "HWFileTransferTaskQueue"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "myCallback \u9000\u51fa\u9501"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 330
    monitor-exit v5

    goto :goto_5

    :catchall_0
    move-exception v14

    monitor-exit v5

    throw v14

    .line 331
    :goto_5
    return-void
.end method
