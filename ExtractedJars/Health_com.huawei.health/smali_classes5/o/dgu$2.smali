.class Lo/dgu$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgu;->a(Landroid/content/Context;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic c:Lo/dgu;


# direct methods
.method constructor <init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1072
    iput-object p1, p0, Lo/dgu$2;->c:Lo/dgu;

    iput-object p2, p0, Lo/dgu$2;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 6

    .line 1093
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWeightGoal onFailure"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1094
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWeightGoal errMsg = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1096
    const-wide/high16 v4, 0x404e000000000000L    # 60.0

    .line 1097
    iget-object v0, p0, Lo/dgu$2;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const v2, 0x186a1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1098
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 8

    .line 1075
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWeightGoal onSuccess"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1076
    invoke-static {}, Lo/dgu;->B()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWeightGoal data = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1077
    const-wide/high16 v4, 0x404e000000000000L    # 60.0

    .line 1078
    move-object v6, p2

    check-cast v6, Ljava/util/List;

    .line 1079
    const/4 v0, 0x0

    if-eq v0, v6, :cond_1

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 1080
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1081
    const/4 v0, 0x0

    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/hihealth/HiGoalInfo;

    .line 1082
    invoke-virtual {v7}, Lcom/huawei/hihealth/HiGoalInfo;->getGoalValue()D

    move-result-wide v4

    .line 1085
    :cond_0
    iget-object v0, p0, Lo/dgu$2;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 1087
    :cond_1
    iget-object v0, p0, Lo/dgu$2;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const v2, 0x186a1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1089
    :goto_0
    return-void
.end method
