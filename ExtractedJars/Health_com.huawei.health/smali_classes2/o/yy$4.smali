.class Lo/yy$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/yy;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/yy;


# direct methods
.method constructor <init>(Lo/yy;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 328
    iput-object p1, p0, Lo/yy$4;->d:Lo/yy;

    iput-object p2, p0, Lo/yy$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 331
    const v0, 0x186a0

    if-ne v0, p1, :cond_1

    .line 332
    move-object v0, p2

    check-cast v0, Ljava/lang/String;

    const-class v1, Lcom/huawei/exercise/modle/OperatorStatus;

    invoke-static {v0, v1}, Lo/cae;->d(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/exercise/modle/OperatorStatus;

    .line 333
    invoke-virtual {v3}, Lcom/huawei/exercise/modle/OperatorStatus;->getTrain_monitor_state()I

    move-result v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 334
    iget-object v0, p0, Lo/yy$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 336
    :cond_0
    iget-object v0, p0, Lo/yy$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 338
    :goto_0
    goto :goto_1

    .line 339
    :cond_1
    iget-object v0, p0, Lo/yy$4;->c:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 341
    :goto_1
    return-void
.end method
