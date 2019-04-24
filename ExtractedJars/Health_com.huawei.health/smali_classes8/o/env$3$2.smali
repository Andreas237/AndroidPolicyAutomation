.class Lo/env$3$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/env$3;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/env$3;


# direct methods
.method constructor <init>(Lo/env$3;)V
    .locals 0

    .line 470
    iput-object p1, p0, Lo/env$3$2;->b:Lo/env$3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 472
    const/4 v0, 0x0

    if-ne v0, p1, :cond_1

    const/4 v0, 0x0

    if-eq v0, p2, :cond_1

    .line 473
    move-object v3, p2

    check-cast v3, Ljava/util/List;

    .line 474
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 475
    iget-object v0, p0, Lo/env$3$2;->b:Lo/env$3;

    iget-object v0, v0, Lo/env$3;->e:Lo/env;

    invoke-virtual {v0, v3}, Lo/env;->e(Ljava/util/List;)V

    .line 476
    iget-object v0, p0, Lo/env$3$2;->b:Lo/env$3;

    iget-object v0, v0, Lo/env$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 478
    :cond_0
    iget-object v0, p0, Lo/env$3$2;->b:Lo/env$3;

    iget-object v0, v0, Lo/env$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 480
    :goto_0
    goto :goto_1

    .line 481
    :cond_1
    iget-object v0, p0, Lo/env$3$2;->b:Lo/env$3;

    iget-object v0, v0, Lo/env$3;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 483
    :goto_1
    return-void
.end method
