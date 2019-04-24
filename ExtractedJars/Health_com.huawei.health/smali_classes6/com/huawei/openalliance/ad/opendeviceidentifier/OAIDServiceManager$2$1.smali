.class Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;


# direct methods
.method constructor <init>(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2$1;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2$1;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->d(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)Lo/bc;

    move-result-object v3

    if-eqz v3, :cond_1

    :try_start_0
    invoke-interface {v3}, Lo/bc;->a()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3}, Lo/bc;->c()Z

    move-result v5

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2$1;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;

    invoke-interface {v7, v4, v5}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$OaidResultCallback;->onOaidAcquired(Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2$1;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    goto :goto_1

    :catch_0
    move-exception v4

    const-string v0, "OAIDServiceManager"

    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "get oaid Exception: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2$1;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2$1;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    goto :goto_1

    :catchall_0
    move-exception v8

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2$1;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->e(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    throw v8

    :goto_1
    goto :goto_2

    :cond_1
    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2$1;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;

    iget-object v0, v0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$2;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)V

    :goto_2
    return-void
.end method
