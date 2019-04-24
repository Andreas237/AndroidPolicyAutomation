.class Lo/dfv$11;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dfv;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field final synthetic d:Lo/dfv;


# direct methods
.method constructor <init>(Lo/dfv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1026
    iput-object p1, p0, Lo/dfv$11;->d:Lo/dfv;

    iput-object p2, p0, Lo/dfv$11;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 1029
    const-string v0, "05"

    const-string v1, "HWFitnessAW70Mgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, " today total finish nedd detail err_code:"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1030
    iget-object v0, p0, Lo/dfv$11;->d:Lo/dfv;

    iget-object v0, v0, Lo/dfv;->e:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dfv$a;

    iget-object v2, p0, Lo/dfv$11;->d:Lo/dfv;

    iget-object v3, p0, Lo/dfv$11;->a:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Lo/dfv$a;-><init>(Lo/dfv;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1031
    return-void
.end method
