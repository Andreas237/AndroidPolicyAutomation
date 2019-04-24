.class Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;


# direct methods
.method constructor <init>(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)V
    .locals 0

    .line 199
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 20

    .line 203
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$000(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 204
    :try_start_0
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DetailSleep saveFile run ....isStateFileWrite = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v3}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$200(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$200(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->getmTransferDataContentPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 211
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "error: when isStateFileWrite is true,getmTransferDataContentPath() should not be null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 212
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 213
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "error: when isStateFileWrite is true,getmTransferDataContentPath() should not be null"

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 215
    :cond_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$202(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_a

    .line 216
    monitor-exit v4

    return-void

    .line 220
    :cond_1
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->getmTransferStateContentPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_a

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$200(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_a

    move-result v0

    if-nez v0, :cond_a

    .line 221
    const/4 v5, 0x0

    .line 223
    :try_start_2
    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-virtual {v2}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->getmTransferStateContentPath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v5, v0

    .line 225
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$400(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 226
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mTransferStateContent size : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v3}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$400(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    :cond_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$400(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 229
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V

    .line 236
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 237
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "success"

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 250
    :cond_3
    const/4 v0, 0x0

    if-eq v0, v5, :cond_4

    .line 252
    :try_start_3
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 256
    :try_start_4
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_a

    .line 257
    goto :goto_0

    .line 253
    :catch_0
    move-exception v6

    .line 254
    :try_start_5
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write stateFile Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 256
    :try_start_6
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_a

    .line 257
    goto :goto_0

    .line 256
    :catchall_0
    move-exception v7

    :try_start_7
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    throw v7

    .line 259
    :cond_4
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$202(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;Z)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_a

    .line 260
    goto/16 :goto_4

    .line 239
    :catch_1
    move-exception v6

    .line 240
    :try_start_8
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "write stateFile FileNotFoundException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 241
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    .line 242
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "write state FileNotFoundException e."

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    .line 250
    :cond_5
    const/4 v0, 0x0

    if-eq v0, v5, :cond_6

    .line 252
    :try_start_9
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    .line 256
    :try_start_a
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 257
    goto :goto_1

    .line 253
    :catch_2
    move-exception v6

    .line 254
    :try_start_b
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write stateFile Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 256
    :try_start_c
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    .line 257
    goto :goto_1

    .line 256
    :catchall_1
    move-exception v8

    :try_start_d
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    throw v8

    .line 259
    :cond_6
    :goto_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$202(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;Z)Z
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    .line 260
    goto/16 :goto_4

    .line 244
    :catch_3
    move-exception v6

    .line 245
    :try_start_e
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write stateFile Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 246
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 247
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "write state file Exception e."

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    .line 250
    :cond_7
    const/4 v0, 0x0

    if-eq v0, v5, :cond_8

    .line 252
    :try_start_f
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_4
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 256
    :try_start_10
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_a

    .line 257
    goto :goto_2

    .line 253
    :catch_4
    move-exception v6

    .line 254
    :try_start_11
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write stateFile Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 256
    :try_start_12
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_a

    .line 257
    goto :goto_2

    .line 256
    :catchall_2
    move-exception v9

    :try_start_13
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    throw v9

    .line 259
    :cond_8
    :goto_2
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$202(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;Z)Z
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_a

    .line 260
    goto :goto_4

    .line 250
    :catchall_3
    move-exception v10

    const/4 v0, 0x0

    if-eq v0, v5, :cond_9

    .line 252
    :try_start_14
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_14
    .catch Ljava/io/IOException; {:try_start_14 .. :try_end_14} :catch_5
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 256
    :try_start_15
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_a

    .line 257
    goto :goto_3

    .line 253
    :catch_5
    move-exception v11

    .line 254
    :try_start_16
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write stateFile Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 256
    :try_start_17
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_a

    .line 257
    goto :goto_3

    .line 256
    :catchall_4
    move-exception v12

    :try_start_18
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write stateFile ok. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    throw v12

    .line 259
    :cond_9
    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$202(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;Z)Z

    .line 260
    throw v10

    .line 263
    :cond_a
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->getmTransferDataContentPath()Ljava/lang/String;
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_13

    .line 264
    const/4 v5, 0x0

    .line 266
    :try_start_19
    new-instance v0, Ljava/io/ObjectOutputStream;

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-virtual {v2}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->getmTransferDataContentPath()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/ObjectOutputStream;-><init>(Ljava/io/OutputStream;)V

    move-object v5, v0

    .line 268
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$500(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    .line 269
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " mTransferDataContent ---size : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v3}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$500(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 271
    :cond_b
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$500(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/io/ObjectOutputStream;->writeObject(Ljava/lang/Object;)V

    .line 272
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V

    .line 279
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    .line 280
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "success"

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_19
    .catch Ljava/io/FileNotFoundException; {:try_start_19 .. :try_end_19} :catch_7
    .catch Ljava/io/IOException; {:try_start_19 .. :try_end_19} :catch_9
    .catchall {:try_start_19 .. :try_end_19} :catchall_8

    .line 293
    :cond_c
    const/4 v0, 0x0

    if-eq v0, v5, :cond_d

    .line 295
    :try_start_1a
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_1a
    .catch Ljava/io/IOException; {:try_start_1a .. :try_end_1a} :catch_6
    .catchall {:try_start_1a .. :try_end_1a} :catchall_5

    .line 299
    :try_start_1b
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_a

    .line 300
    goto :goto_5

    .line 296
    :catch_6
    move-exception v6

    .line 297
    :try_start_1c
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write data file Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_5

    .line 299
    :try_start_1d
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_a

    .line 300
    goto :goto_5

    .line 299
    :catchall_5
    move-exception v13

    :try_start_1e
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    throw v13

    .line 302
    :cond_d
    :goto_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$202(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;Z)Z
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_a

    .line 303
    goto/16 :goto_9

    .line 282
    :catch_7
    move-exception v6

    .line 283
    :try_start_1f
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "write data File FileNotFoundException e = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 284
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_e

    .line 285
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "write data FileNotFoundException e."

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_1f
    .catchall {:try_start_1f .. :try_end_1f} :catchall_8

    .line 293
    :cond_e
    const/4 v0, 0x0

    if-eq v0, v5, :cond_f

    .line 295
    :try_start_20
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_20
    .catch Ljava/io/IOException; {:try_start_20 .. :try_end_20} :catch_8
    .catchall {:try_start_20 .. :try_end_20} :catchall_6

    .line 299
    :try_start_21
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_21
    .catchall {:try_start_21 .. :try_end_21} :catchall_a

    .line 300
    goto :goto_6

    .line 296
    :catch_8
    move-exception v6

    .line 297
    :try_start_22
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write data file Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_22
    .catchall {:try_start_22 .. :try_end_22} :catchall_6

    .line 299
    :try_start_23
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_23
    .catchall {:try_start_23 .. :try_end_23} :catchall_a

    .line 300
    goto :goto_6

    .line 299
    :catchall_6
    move-exception v14

    :try_start_24
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    throw v14

    .line 302
    :cond_f
    :goto_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$202(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;Z)Z
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_a

    .line 303
    goto/16 :goto_9

    .line 287
    :catch_9
    move-exception v6

    .line 288
    :try_start_25
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write data file Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 289
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_10

    .line 290
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "write data file Exception e."

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_25
    .catchall {:try_start_25 .. :try_end_25} :catchall_8

    .line 293
    :cond_10
    const/4 v0, 0x0

    if-eq v0, v5, :cond_11

    .line 295
    :try_start_26
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_26
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_26} :catch_a
    .catchall {:try_start_26 .. :try_end_26} :catchall_7

    .line 299
    :try_start_27
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_27
    .catchall {:try_start_27 .. :try_end_27} :catchall_a

    .line 300
    goto :goto_7

    .line 296
    :catch_a
    move-exception v6

    .line 297
    :try_start_28
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write data file Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_28
    .catchall {:try_start_28 .. :try_end_28} :catchall_7

    .line 299
    :try_start_29
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_a

    .line 300
    goto :goto_7

    .line 299
    :catchall_7
    move-exception v15

    :try_start_2a
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    throw v15

    .line 302
    :cond_11
    :goto_7
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$202(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;Z)Z
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_a

    .line 303
    goto :goto_9

    .line 293
    :catchall_8
    move-exception v16

    const/4 v0, 0x0

    if-eq v0, v5, :cond_12

    .line 295
    :try_start_2b
    invoke-virtual {v5}, Ljava/io/ObjectOutputStream;->close()V
    :try_end_2b
    .catch Ljava/io/IOException; {:try_start_2b .. :try_end_2b} :catch_b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_9

    .line 299
    :try_start_2c
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2c
    .catchall {:try_start_2c .. :try_end_2c} :catchall_a

    .line 300
    goto :goto_8

    .line 296
    :catch_b
    move-exception v17

    .line 297
    :try_start_2d
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write data file Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual/range {v17 .. v17}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2d
    .catchall {:try_start_2d .. :try_end_2d} :catchall_9

    .line 299
    :try_start_2e
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2e
    .catchall {:try_start_2e .. :try_end_2e} :catchall_a

    .line 300
    goto :goto_8

    .line 299
    :catchall_9
    move-exception v18

    :try_start_2f
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 300
    throw v18

    .line 302
    :cond_12
    :goto_8
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$202(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;Z)Z

    .line 303
    throw v16

    .line 306
    :cond_13
    :goto_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->getmTransferStateContentPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_14

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->getmTransferDataContentPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_14

    .line 307
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getmTransferStateContentPath() is null. getmTransferDataContentPath() is null. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$202(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;Z)Z

    .line 309
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_14

    .line 310
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/DetailSleepUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "path is all null."

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_2f
    .catchall {:try_start_2f .. :try_end_2f} :catchall_a

    .line 315
    :cond_14
    monitor-exit v4

    goto :goto_a

    :catchall_a
    move-exception v19

    monitor-exit v4

    throw v19

    .line 316
    :goto_a
    return-void
.end method
