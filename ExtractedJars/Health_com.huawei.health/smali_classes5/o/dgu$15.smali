.class Lo/dgu$15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dgu;->a(Landroid/content/Context;IJJLcom/huawei/hwbasemgr/IBaseResponseCallback;)V
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

    .line 1553
    iput-object p1, p0, Lo/dgu$15;->c:Lo/dgu;

    iput-object p2, p0, Lo/dgu$15;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 2

    .line 1556
    const/16 v0, 0x9

    if-ne p1, v0, :cond_0

    .line 1557
    iget-object v0, p0, Lo/dgu$15;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a1

    invoke-interface {v0, v1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 1559
    :cond_0
    iget-object v0, p0, Lo/dgu$15;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 1561
    :goto_0
    return-void
.end method
