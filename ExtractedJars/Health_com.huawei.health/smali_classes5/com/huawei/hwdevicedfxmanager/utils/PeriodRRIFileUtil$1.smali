.class Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;


# direct methods
.method constructor <init>(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;)V
    .locals 0

    .line 171
    iput-object p1, p0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 16

    .line 175
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$000(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;)Ljava/lang/Object;

    move-result-object v4

    monitor-enter v4

    .line 176
    :try_start_0
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " getmTransferStateContentPath :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-virtual {v3}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->getmTransferStateContentPath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 177
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " writeFileToSD BuildConfig.IS_DEBUG_VERSION:false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 179
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->getmTransferDataContentPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 180
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logRunnable \uff1a\u540c\u6b65TransferDataContentPath"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 181
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v5

    .line 182
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 183
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    move-result v6

    .line 184
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u521b\u5efa\u6587\u4ef6\u5939\u662f\u5426\u6210 \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    :cond_0
    new-instance v6, Ljava/io/File;

    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->getmTransferDataContentPath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 187
    const/4 v7, 0x0

    .line 189
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "fileparent : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file.getAbsolutePath()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 191
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "file.exists()"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 193
    :try_start_1
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_1

    .line 194
    invoke-virtual {v6}, Ljava/io/File;->createNewFile()Z

    move-result v8

    .line 195
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u521b\u5efa\u662f\u5426\u6210 \uff1a"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 197
    :cond_1
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    move-object v7, v0

    .line 198
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mTransferDataContent.size() : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move-object/from16 v3, p0

    iget-object v3, v3, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-static {v3}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$200(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;)Ljava/util/ArrayList;

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

    .line 199
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$200(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, [B

    .line 201
    invoke-virtual {v7, v9}, Ljava/io/FileOutputStream;->write([B)V

    .line 202
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->flush()V

    .line 203
    goto :goto_0

    .line 204
    :cond_2
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "logRunnable \uff1a\u5199\u5165TransferDataContentPath\u5b8c\u6bd5"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 210
    const/4 v0, 0x0

    if-eq v0, v7, :cond_5

    .line 212
    :try_start_2
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    .line 213
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u91ca\u653e\u8d44\u6e90 \uff1a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 217
    :try_start_3
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 218
    goto :goto_1

    .line 214
    :catch_0
    move-exception v8

    .line 215
    :try_start_4
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write data file Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 217
    :try_start_5
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 218
    goto :goto_1

    .line 217
    :catchall_0
    move-exception v10

    :try_start_6
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    throw v10
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :goto_1
    goto/16 :goto_4

    .line 205
    :catch_1
    move-exception v8

    .line 206
    :try_start_7
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "logRunnable stream write Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 207
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "write data FileNotFoundException e."

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 210
    const/4 v0, 0x0

    if-eq v0, v7, :cond_3

    .line 212
    :try_start_8
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    .line 213
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u91ca\u653e\u8d44\u6e90 \uff1a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 217
    :try_start_9
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 218
    goto :goto_2

    .line 214
    :catch_2
    move-exception v9

    .line 215
    :try_start_a
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write data file Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v9}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 217
    :try_start_b
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    .line 218
    goto :goto_2

    .line 217
    :catchall_1
    move-exception v11

    :try_start_c
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    throw v11
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    :cond_3
    :goto_2
    monitor-exit v4

    .line 208
    return-void

    .line 210
    :catchall_2
    move-exception v12

    const/4 v0, 0x0

    if-eq v0, v7, :cond_4

    .line 212
    :try_start_d
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V

    .line 213
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\u91ca\u653e\u8d44\u6e90 \uff1a "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v6}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_d
    .catch Ljava/io/IOException; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 217
    :try_start_e
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    .line 218
    goto :goto_3

    .line 214
    :catch_3
    move-exception v13

    .line 215
    :try_start_f
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "write data file Exception e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v13}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_3

    .line 217
    :try_start_10
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    .line 218
    goto :goto_3

    .line 217
    :catchall_3
    move-exception v14

    :try_start_11
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finally write data file ok."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    throw v14

    .line 220
    :cond_4
    :goto_3
    throw v12

    .line 224
    :cond_5
    :goto_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    move-object/from16 v1, p0

    iget-object v1, v1, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-static {v1}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$400(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p0

    iget-object v2, v2, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-static {v2}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$200(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$500(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    .line 228
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "success"

    const v2, 0x186a0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 233
    :cond_6
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-virtual {v0}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->getmTransferDataContentPath()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_7

    .line 234
    invoke-static {}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$100()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getmTransferStateContentPath() is null. getmTransferDataContentPath() is null. "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 235
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 236
    move-object/from16 v0, p0

    iget-object v0, v0, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil$1;->this$0:Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;

    invoke-static {v0}, Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;->access$300(Lcom/huawei/hwdevicedfxmanager/utils/PeriodRRIFileUtil;)Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    move-result-object v0

    const-string v1, "path is all null."

    const/16 v2, 0x2711

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 239
    :cond_7
    monitor-exit v4

    goto :goto_5

    :catchall_4
    move-exception v15

    monitor-exit v4

    throw v15

    .line 240
    :goto_5
    return-void
.end method
