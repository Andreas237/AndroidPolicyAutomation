.class Lo/dgt$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clz;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgt;->e(Lcom/huawei/hwcommonmodel/fitnessdatatype/MotionGoal;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dgt;

.field final synthetic d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dgt;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 752
    iput-object p1, p0, Lo/dgt$8;->b:Lo/dgt;

    iput-object p2, p0, Lo/dgt$8;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onFailure(ILjava/lang/Object;)V
    .locals 3

    .line 764
    iget-object v0, p0, Lo/dgt$8;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 765
    return-void
.end method

.method public onSuccess(ILjava/lang/Object;)V
    .locals 3

    .line 756
    iget-object v0, p0, Lo/dgt$8;->d:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 758
    iget-object v0, p0, Lo/dgt$8;->b:Lo/dgt;

    invoke-static {v0}, Lo/dgt;->d(Lo/dgt;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->y(Landroid/content/Context;)V

    .line 759
    return-void
.end method
