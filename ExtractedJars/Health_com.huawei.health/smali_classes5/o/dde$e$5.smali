.class Lo/dde$e$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dde$e;->handleMessage(Landroid/os/Message;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/dde$e;


# direct methods
.method constructor <init>(Lo/dde$e;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 3851
    iput-object p1, p0, Lo/dde$e$5;->d:Lo/dde$e;

    iput-object p2, p0, Lo/dde$e$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 3

    .line 3854
    const/4 v0, -0x1

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lo/dde$e$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 3855
    iget-object v0, p0, Lo/dde$e$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x18a89

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, -0x1

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    goto :goto_0

    .line 3856
    :cond_0
    iget-object v0, p0, Lo/dde$e$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 3857
    iget-object v0, p0, Lo/dde$e$5;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const v1, 0x186a0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v0, v2, v1}, Lcom/huawei/hwbasemgr/IBaseResponseCallback;->onResponse(ILjava/lang/Object;)V

    .line 3859
    :cond_1
    :goto_0
    return-void
.end method
