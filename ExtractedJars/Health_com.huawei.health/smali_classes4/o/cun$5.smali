.class Lo/cun$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/cun;->e(ILjava/lang/String;Lcom/huawei/hihealth/HiHealthClient;Lcom/huawei/hihealth/HiHealthData;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hihealth/HiHealthClient;

.field final synthetic b:Lcom/huawei/hihealth/HiHealthData;

.field final synthetic c:Lo/cun;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lo/cun;ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;)V
    .locals 0

    .line 190
    iput-object p1, p0, Lo/cun$5;->c:Lo/cun;

    iput p2, p0, Lo/cun$5;->e:I

    iput-object p3, p0, Lo/cun$5;->a:Lcom/huawei/hihealth/HiHealthClient;

    iput-object p4, p0, Lo/cun$5;->d:Ljava/lang/String;

    iput-object p5, p0, Lo/cun$5;->b:Lcom/huawei/hihealth/HiHealthData;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 12

    .line 193
    iget-object v0, p0, Lo/cun$5;->c:Lo/cun;

    invoke-static {v0}, Lo/cun;->b(Lo/cun;)Landroid/util/SparseArray;

    move-result-object v0

    iget v1, p0, Lo/cun$5;->e:I

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/os/RemoteCallbackList;

    .line 194
    const/4 v0, 0x0

    if-ne v0, v7, :cond_0

    .line 195
    return-void

    .line 198
    :cond_0
    :try_start_0
    invoke-virtual {v7}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v8

    .line 199
    const/4 v9, 0x0

    :goto_0
    if-ge v9, v8, :cond_2

    .line 200
    invoke-virtual {v7, v9}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 201
    invoke-virtual {v7, v9}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lo/clo;

    iget v1, p0, Lo/cun$5;->e:I

    iget-object v2, p0, Lo/cun$5;->a:Lcom/huawei/hihealth/HiHealthClient;

    iget-object v3, p0, Lo/cun$5;->d:Ljava/lang/String;

    iget-object v4, p0, Lo/cun$5;->b:Lcom/huawei/hihealth/HiHealthData;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-interface/range {v0 .. v6}, Lo/clo;->e(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_5
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    :cond_1
    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    .line 212
    :cond_2
    :try_start_1
    invoke-virtual {v7}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 215
    goto/16 :goto_2

    .line 213
    :catch_0
    move-exception v8

    .line 214
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishBroadcast IllegalStateException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    goto/16 :goto_2

    .line 204
    :catch_1
    move-exception v8

    .line 205
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x1

    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RemoteException = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v8}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 212
    :try_start_3
    invoke-virtual {v7}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_3
    .catch Ljava/lang/IllegalStateException; {:try_start_3 .. :try_end_3} :catch_2

    .line 215
    goto/16 :goto_2

    .line 213
    :catch_2
    move-exception v8

    .line 214
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishBroadcast IllegalStateException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    goto/16 :goto_2

    .line 206
    :catch_3
    move-exception v8

    .line 207
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    :try_start_4
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "beginBroadcast IllegalStateException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 212
    :try_start_5
    invoke-virtual {v7}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_5
    .catch Ljava/lang/IllegalStateException; {:try_start_5 .. :try_end_5} :catch_4

    .line 215
    goto :goto_2

    .line 213
    :catch_4
    move-exception v8

    .line 214
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishBroadcast IllegalStateException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    goto :goto_2

    .line 208
    :catch_5
    move-exception v8

    .line 209
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    :try_start_6
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "beginBroadcast Exception = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 212
    :try_start_7
    invoke-virtual {v7}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_7
    .catch Ljava/lang/IllegalStateException; {:try_start_7 .. :try_end_7} :catch_6

    .line 215
    goto :goto_2

    .line 213
    :catch_6
    move-exception v8

    .line 214
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishBroadcast IllegalStateException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v8}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    goto :goto_2

    .line 211
    :catchall_0
    move-exception v10

    .line 212
    :try_start_8
    invoke-virtual {v7}, Landroid/os/RemoteCallbackList;->finishBroadcast()V
    :try_end_8
    .catch Ljava/lang/IllegalStateException; {:try_start_8 .. :try_end_8} :catch_7

    .line 215
    goto :goto_1

    .line 213
    :catch_7
    move-exception v11

    .line 214
    const-string v0, "HiH_ListenerManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "finishBroadcast IllegalStateException = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v11}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    :goto_1
    throw v10

    .line 217
    :goto_2
    return-void
.end method
