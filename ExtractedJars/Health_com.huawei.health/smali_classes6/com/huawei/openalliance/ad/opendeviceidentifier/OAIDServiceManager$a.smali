.class Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;

.field private b:Lo/bc;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;Lo/bc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$a;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$a;->b:Lo/bc;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$a;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;

    iget-object v1, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$a;->b:Lo/bc;

    invoke-interface {v1}, Lo/bc;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$a;->b:Lo/bc;

    invoke-interface {v2}, Lo/bc;->c()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;->onOaidAcquired(Ljava/lang/String;Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    const-string v0, "OAIDServiceManager"

    const-string v1, "requireOaid RemoteException"

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$a;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;

    invoke-interface {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;->onOaidAcquireFailed()V

    :goto_0
    return-void
.end method
