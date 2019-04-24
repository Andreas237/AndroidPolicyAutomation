.class Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->acquireRecentExerciseRecord(JJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

.field final synthetic val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic val$sql:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Ljava/lang/String;)V
    .locals 0

    .line 1100
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$9;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    iput-object p2, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$9;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    iput-object p3, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$9;->val$sql:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1103
    invoke-static {}, Lo/bst;->c()Lo/bsp;

    move-result-object v0

    invoke-interface {v0}, Lo/bsp;->f()Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v5

    .line 1104
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 1105
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$9;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const-string v1, "account info is null"

    const/4 v2, -0x2

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1106
    return-void

    .line 1109
    :cond_0
    new-instance v6, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    invoke-direct {v6}, Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;-><init>()V

    .line 1110
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$9;->val$sql:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "[A-Z][0-9][0-9][0-9]*"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    .line 1113
    invoke-virtual {v5}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 1110
    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v7

    .line 1114
    if-eqz v7, :cond_2

    .line 1115
    :goto_0
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1116
    invoke-static {v7}, Lo/btw;->b(Landroid/database/Cursor;)Lcom/huawei/health/suggestion/model/fitness/FitnessRecord;

    move-result-object v6

    goto :goto_0

    .line 1118
    :cond_1
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 1120
    :cond_2
    const-string v0, "Suggestion_FitnessHistoryModel"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "recentRecord = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1121
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$9;->val$callback:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v6}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1122
    return-void
.end method
