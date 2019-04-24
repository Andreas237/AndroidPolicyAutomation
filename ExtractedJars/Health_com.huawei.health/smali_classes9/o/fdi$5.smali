.class Lo/fdi$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cma;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fdi;->e(Landroid/content/Context;IILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic b:Lo/fdi;


# direct methods
.method constructor <init>(Lo/fdi;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lo/fdi$5;->b:Lo/fdi;

    iput-object p2, p0, Lo/fdi$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResult(ILjava/lang/Object;)V
    .locals 3

    .line 76
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 77
    iget-object v0, p0, Lo/fdi$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p2}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 79
    :cond_0
    iget-object v0, p0, Lo/fdi$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const v2, 0x186a1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 81
    :goto_0
    return-void
.end method
