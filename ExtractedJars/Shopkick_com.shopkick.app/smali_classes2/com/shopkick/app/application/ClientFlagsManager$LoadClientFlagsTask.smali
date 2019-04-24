.class Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;
.super Ljava/lang/Object;
.source "ClientFlagsManager.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/ClientFlagsManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LoadClientFlagsTask"
.end annotation


# instance fields
.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private handler:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/application/AppPreferences;Landroid/os/Handler;)V
    .locals 0

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 248
    iput-object p1, p0, Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    .line 249
    iput-object p2, p0, Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 250
    iput-object p3, p0, Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;->handler:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 256
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    if-eqz v0, :cond_1

    .line 257
    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getClientFlagsJSON()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 259
    iget-object v0, p0, Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v0}, Lcom/shopkick/app/application/ClientFlagsManager;->access$000(Lcom/shopkick/app/application/ClientFlagsManager;)Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    move-result-object v0

    goto :goto_0

    .line 262
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-static {v1}, Lcom/shopkick/app/application/ClientFlagsManager;->access$000(Lcom/shopkick/app/application/ClientFlagsManager;)Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/shopkick/app/util/GsonUtils;->merge(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 264
    const-class v1, Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Gson Exception inflating the ClientFlags from json: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 265
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 264
    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    const/4 v0, 0x0

    .line 269
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;->handler:Landroid/os/Handler;

    new-instance v2, Lcom/shopkick/app/application/ClientFlagsManager$PostLoadRunnable;

    iget-object v3, p0, Lcom/shopkick/app/application/ClientFlagsManager$LoadClientFlagsTask;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    invoke-direct {v2, v3, v0}, Lcom/shopkick/app/application/ClientFlagsManager$PostLoadRunnable;-><init>(Lcom/shopkick/app/application/ClientFlagsManager;Lcom/shopkick/app/fetchers/api/skapi/ClientFlags;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object v0
.end method
