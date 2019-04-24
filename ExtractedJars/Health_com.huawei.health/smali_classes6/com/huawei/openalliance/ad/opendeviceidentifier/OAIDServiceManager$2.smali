.class Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->b(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/aj;->a(Ljava/lang/String;)V

    const-string v0, "OAIDServiceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "OAID service connected "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2}, Lo/bc$e;->b(Landroid/os/IBinder;)Lo/bc;

    move-result-object v4

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-static {v0, v4}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;Lo/bc;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->c(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "OAIDServiceManager"

    const-string v1, "oaid require is already timeout"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2$1;

    invoke-direct {v0, p0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2$1;-><init>(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;)V

    sget-object v1, Lcom/huawei/openalliance/ad/utils/d$a;->c:Lcom/huawei/openalliance/ad/utils/d$a;

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/huawei/openalliance/ad/utils/d;->a(Ljava/lang/Runnable;Lcom/huawei/openalliance/ad/utils/d$a;Z)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    const-string v0, "OAIDServiceManager"

    const-string v1, "OAID service disconnected"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;Lo/bc;)V

    return-void
.end method
