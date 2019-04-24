.class Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->onSuccess(ILjava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

.field final synthetic val$finalMTransferDataContent:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;Ljava/lang/String;)V
    .locals 0

    .line 94
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iput-object p2, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->val$finalMTransferDataContent:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 14

    .line 98
    const/4 v5, 0x0

    .line 99
    const/4 v6, 0x0

    .line 101
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->val$finalMTransferDataContent:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 102
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u6709\u5468\u671fRRI\u6587\u4ef6\u540c\u6b65\u6210\u529f"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 103
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v7

    .line 104
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->val$finalMTransferDataContent:Ljava/lang/String;

    invoke-direct {v0, v7, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    move-object v5, v0

    .line 105
    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    move-object v6, v0

    .line 107
    move-object v8, v6

    .line 109
    invoke-static {v8}, Lo/fkb;->a(Ljava/io/FileInputStream;)Lcom/huawei/datatype/PeriodRRIEntity;

    move-result-object v9

    .line 112
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v0, v9}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$000(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;Lcom/huawei/datatype/PeriodRRIEntity;)V

    .line 113
    invoke-virtual {v9}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchVersion()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_3

    .line 114
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v0, v9}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$100(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;Lcom/huawei/datatype/PeriodRRIEntity;)Z

    move-result v10

    .line 115
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isAllDirtyData : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 116
    if-eqz v10, :cond_2

    .line 118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$300(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)J

    move-result-wide v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$202(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;J)J

    .line 119
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "update uploadLastTime : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v3}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$200(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 120
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$200(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$400(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;J)V

    .line 121
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    const-string v1, "All data is dirty"

    const v2, 0x186a1

    invoke-static {v0, v2, v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$500(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;ILjava/lang/Object;)Z

    .line 122
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->notifyOtherSyncTask()V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 159
    const/4 v0, 0x0

    if-eq v0, v6, :cond_0

    .line 160
    :try_start_1
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    goto :goto_0

    .line 162
    :cond_0
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodFileCallBack() finally fis \u4e3a null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :goto_0
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    .line 165
    invoke-virtual {v5}, Ljava/io/File;->deleteOnExit()V

    .line 167
    :cond_1
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodFileCallBack() finally \u5173\u95ed\u6587\u4ef6\u6d41"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 170
    goto :goto_1

    .line 168
    :catch_0
    move-exception v11

    .line 169
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v11}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 123
    :goto_1
    return-void

    .line 126
    :cond_2
    goto :goto_4

    :cond_3
    :try_start_2
    invoke-virtual {v9}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchVersion()I

    move-result v0

    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    .line 129
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "parse file is version = 3"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_4

    .line 131
    :cond_4
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->notifyOtherSyncTask()V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 159
    const/4 v0, 0x0

    if-eq v0, v6, :cond_5

    .line 160
    :try_start_3
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    goto :goto_2

    .line 162
    :cond_5
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodFileCallBack() finally fis \u4e3a null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :goto_2
    const/4 v0, 0x0

    if-eq v0, v5, :cond_6

    .line 165
    invoke-virtual {v5}, Ljava/io/File;->deleteOnExit()V

    .line 167
    :cond_6
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodFileCallBack() finally \u5173\u95ed\u6587\u4ef6\u6d41"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 170
    goto :goto_3

    .line 168
    :catch_1
    move-exception v10

    .line 169
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 132
    :goto_3
    return-void

    .line 135
    :goto_4
    :try_start_4
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    const/4 v1, 0x0

    invoke-static {v0, v1, v9}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$500(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;ILjava/lang/Object;)Z

    move-result v10

    .line 136
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "return back data isSuccess : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 138
    if-eqz v10, :cond_8

    .line 139
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "push data to UI success,update time success"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 140
    invoke-virtual {v9}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchFailTime()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v2, v0

    if-eqz v0, :cond_7

    .line 141
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-virtual {v9}, Lcom/huawei/datatype/PeriodRRIEntity;->fetchFailTime()J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$202(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;J)J

    .line 142
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "save pressure fail.get failTime : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v3}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$200(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 144
    :cond_7
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    iget-object v1, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v1, v1, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$200(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$400(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;J)V

    goto :goto_5

    .line 146
    :cond_8
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "no callback,update time fail"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 149
    :goto_5
    goto :goto_6

    .line 150
    :cond_9
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$600(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)J

    move-result-wide v7

    .line 151
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "on this time no data : startTime : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " endTime : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v3, v3, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-static {v3}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$200(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "periodFileCallBack() no  mTransferDataContent"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->val$finalMTransferDataContent:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v2, 0x186a1

    invoke-static {v0, v2, v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$500(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;ILjava/lang/Object;)Z
    :try_end_4
    .catch Ljava/io/FileNotFoundException; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 159
    :goto_6
    const/4 v0, 0x0

    if-eq v0, v6, :cond_a

    .line 160
    :try_start_5
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    goto :goto_7

    .line 162
    :cond_a
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodFileCallBack() finally fis \u4e3a null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :goto_7
    const/4 v0, 0x0

    if-eq v0, v5, :cond_b

    .line 165
    invoke-virtual {v5}, Ljava/io/File;->deleteOnExit()V

    .line 167
    :cond_b
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodFileCallBack() finally \u5173\u95ed\u6587\u4ef6\u6d41"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2

    .line 170
    goto/16 :goto_b

    .line 168
    :catch_2
    move-exception v7

    .line 169
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    goto/16 :goto_b

    .line 154
    :catch_3
    move-exception v7

    .line 155
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "periodFileCallBack() No File  path : "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->val$finalMTransferDataContent:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const v2, 0x186a1

    invoke-static {v0, v2, v1}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->access$500(Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;ILjava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 159
    const/4 v0, 0x0

    if-eq v0, v6, :cond_c

    .line 160
    :try_start_7
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    goto :goto_8

    .line 162
    :cond_c
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodFileCallBack() finally fis \u4e3a null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :goto_8
    const/4 v0, 0x0

    if-eq v0, v5, :cond_d

    .line 165
    invoke-virtual {v5}, Ljava/io/File;->deleteOnExit()V

    .line 167
    :cond_d
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodFileCallBack() finally \u5173\u95ed\u6587\u4ef6\u6d41"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_4

    .line 170
    goto :goto_b

    .line 168
    :catch_4
    move-exception v7

    .line 169
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v7}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    goto :goto_b

    .line 158
    :catchall_0
    move-exception v12

    .line 159
    const/4 v0, 0x0

    if-eq v0, v6, :cond_e

    .line 160
    :try_start_8
    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V

    goto :goto_9

    .line 162
    :cond_e
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodFileCallBack() finally fis \u4e3a null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 164
    :goto_9
    const/4 v0, 0x0

    if-eq v0, v5, :cond_f

    .line 165
    invoke-virtual {v5}, Ljava/io/File;->deleteOnExit()V

    .line 167
    :cond_f
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "periodFileCallBack() finally \u5173\u95ed\u6587\u4ef6\u6d41"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    .line 170
    goto :goto_a

    .line 168
    :catch_5
    move-exception v13

    .line 169
    const-string v0, "HWDevicePeriodRRIFileManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v13}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 171
    :goto_a
    throw v12

    .line 172
    :goto_b
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1$1;->this$1:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;

    iget-object v0, v0, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager$1;->this$0:Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;

    invoke-virtual {v0}, Lcom/huawei/hwservicesmgr/remote/HWDevicePeriodRRIFileManager;->notifyOtherSyncTask()V

    .line 173
    return-void
.end method
