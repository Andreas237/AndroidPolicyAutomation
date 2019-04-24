.class Lo/dgu$13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgu;->c(Landroid/content/Context;Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dgu;

.field final synthetic b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dgu;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1526
    iput-object p1, p0, Lo/dgu$13;->a:Lo/dgu;

    iput-object p2, p0, Lo/dgu$13;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 4

    .line 1530
    move-object v0, p2

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    .line 1531
    if-eqz v3, :cond_0

    .line 1532
    iget-object v0, p0, Lo/dgu$13;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 1534
    :cond_0
    iget-object v0, p0, Lo/dgu$13;->b:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const v2, 0x186a1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1536
    :goto_0
    return-void
.end method
