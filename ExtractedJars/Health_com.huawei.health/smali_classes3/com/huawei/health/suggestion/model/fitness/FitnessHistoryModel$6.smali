.class Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->getWorkoutRecords(Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

.field final synthetic val$callback:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

.field final synthetic val$sql:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;Ljava/lang/String;Lcom/huawei/health/suggestion/model/fitness/IResultCallback;)V
    .locals 0

    .line 725
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$6;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    iput-object p2, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$6;->val$sql:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$6;->val$callback:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 728
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 729
    invoke-static {}, Lcom/huawei/health/suggestion/data/DBFactory;->b()Lcom/huawei/health/suggestion/data/DBFactory;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$6;->val$sql:Ljava/lang/String;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/String;

    const-string v3, "[A-Z][0-9][0-9][0-9]*"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$6;->this$0:Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;

    .line 732
    invoke-static {v3}, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;->access$1100(Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel;)Lcom/huawei/health/suggestion/model/AccountInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/AccountInfo;->acquireHuid()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    .line 729
    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Lcom/huawei/health/suggestion/data/DBFactory;->rawQueryStorageData(ILjava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 733
    if-eqz v6, :cond_1

    .line 734
    :goto_0
    invoke-interface {v6}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 735
    invoke-static {v6}, Lo/btw;->c(Landroid/database/Cursor;)Lcom/huawei/health/suggestion/model/WorkoutRecord;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 737
    :cond_0
    invoke-interface {v6}, Landroid/database/Cursor;->close()V

    .line 740
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/FitnessHistoryModel$6;->val$callback:Lcom/huawei/health/suggestion/model/fitness/IResultCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v5}, Lcom/huawei/health/suggestion/model/fitness/IResultCallback;->onResult(ILjava/lang/Object;)V

    .line 741
    return-void
.end method
