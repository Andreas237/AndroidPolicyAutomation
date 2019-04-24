.class Lcom/huawei/hwservicesmgr/PhoneService$9$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cxs;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/PhoneService$9;->a(ILjava/lang/String;Ljava/util/List;Lo/djp;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/djp;

.field final synthetic e:Lcom/huawei/hwservicesmgr/PhoneService$9;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/PhoneService$9;Lo/djp;)V
    .locals 0

    .line 1009
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$3;->e:Lcom/huawei/hwservicesmgr/PhoneService$9;

    iput-object p2, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$3;->d:Lo/djp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public e(I)V
    .locals 5

    .line 1013
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$3;->d:Lo/djp;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1014
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$3;->d:Lo/djp;

    invoke-interface {v0, p1}, Lo/djp;->a(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1018
    :cond_0
    goto :goto_0

    .line 1016
    :catch_0
    move-exception v4

    .line 1017
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1019
    :goto_0
    return-void
.end method
