.class Lo/dgt$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgt;->c(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic c:Lo/dgt;

.field final synthetic d:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;


# direct methods
.method constructor <init>(Lo/dgt;Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 777
    iput-object p1, p0, Lo/dgt$1;->c:Lo/dgt;

    iput-object p2, p0, Lo/dgt$1;->d:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    iput-object p3, p0, Lo/dgt$1;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 3

    .line 793
    iget-object v0, p0, Lo/dgt$1;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 794
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 5

    .line 781
    if-eqz p2, :cond_0

    .line 782
    move-object v3, p2

    check-cast v3, Ljava/util/List;

    .line 783
    iget-object v0, p0, Lo/dgt$1;->c:Lo/dgt;

    iget-object v1, p0, Lo/dgt$1;->d:Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    invoke-static {v0, v1, v3}, Lo/dgt;->d(Lo/dgt;Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Ljava/util/List;)Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;

    move-result-object v4

    .line 785
    iget-object v0, p0, Lo/dgt$1;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, v4}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 786
    goto :goto_0

    .line 787
    :cond_0
    iget-object v0, p0, Lo/dgt$1;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 789
    :goto_0
    return-void
.end method
