.class Lo/dez$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dez;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dez;

.field final synthetic e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# direct methods
.method constructor <init>(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    .locals 0

    .line 1645
    iput-object p1, p0, Lo/dez$8;->c:Lo/dez;

    iput-object p2, p0, Lo/dez$8;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 5

    .line 1648
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

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

    .line 1649
    iget-object v0, p0, Lo/dez$8;->c:Lo/dez;

    iget-object v0, v0, Lo/dez;->d:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lo/dez$i;

    iget-object v2, p0, Lo/dez$8;->c:Lo/dez;

    iget-object v3, p0, Lo/dez$8;->e:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v3, v4}, Lo/dez$i;-><init>(Lo/dez;Lcom/huawei/hwbasemgr/IBaseResponseCallback;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    .line 1650
    return-void
.end method
