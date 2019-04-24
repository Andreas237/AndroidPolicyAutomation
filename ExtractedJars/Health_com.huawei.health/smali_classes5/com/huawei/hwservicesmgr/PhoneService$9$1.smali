.class Lcom/huawei/hwservicesmgr/PhoneService$9$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/yc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/hwservicesmgr/PhoneService$9;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILo/djw;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/hwservicesmgr/PhoneService$9;

.field final synthetic d:Lo/djw;


# direct methods
.method constructor <init>(Lcom/huawei/hwservicesmgr/PhoneService$9;Lo/djw;)V
    .locals 0

    .line 1102
    iput-object p1, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$1;->b:Lcom/huawei/hwservicesmgr/PhoneService$9;

    iput-object p2, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$1;->d:Lo/djw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;I)V
    .locals 5

    .line 1106
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$1;->d:Lo/djw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1107
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$1;->d:Lo/djw;

    invoke-interface {v0, p2}, Lo/djw;->b(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1111
    :cond_0
    goto :goto_0

    .line 1109
    :catch_0
    move-exception v4

    .line 1110
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1112
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;I)V
    .locals 5

    .line 1128
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$1;->d:Lo/djw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1129
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$1;->d:Lo/djw;

    invoke-interface {v0, p2}, Lo/djw;->e(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1133
    :cond_0
    goto :goto_0

    .line 1131
    :catch_0
    move-exception v4

    .line 1132
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1134
    :goto_0
    return-void
.end method

.method public b(Ljava/lang/String;ILjava/lang/String;)V
    .locals 5

    .line 1117
    :try_start_0
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$1;->d:Lo/djw;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 1118
    iget-object v0, p0, Lcom/huawei/hwservicesmgr/PhoneService$9$1;->d:Lo/djw;

    invoke-interface {v0, p2, p3}, Lo/djw;->e(ILjava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1122
    :cond_0
    goto :goto_0

    .line 1120
    :catch_0
    move-exception v4

    .line 1121
    const-string v0, "PhoneService"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Landroid/os/RemoteException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1123
    :goto_0
    return-void
.end method
