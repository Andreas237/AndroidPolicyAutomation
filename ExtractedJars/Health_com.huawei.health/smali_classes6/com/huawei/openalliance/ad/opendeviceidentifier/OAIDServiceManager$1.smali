.class Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a(J)V
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

    iput-object p1, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$1;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    const-string v0, "OAIDServiceManager"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "bind timeout "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$1;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;Z)V

    iget-object v0, p0, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager$1;->a:Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;->a(Lcom/huawei/openalliance/ad/opendeviceidentifier/OAIDServiceManager;)V

    return-void
.end method
