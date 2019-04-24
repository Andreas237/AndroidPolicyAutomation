.class public Lcom/usebutton/sdk/internal/commands/LoadAssetsCommand;
.super Lcom/usebutton/sdk/internal/core/Command;
.source "LoadAssetsCommand.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<Void:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/usebutton/sdk/internal/core/Command;"
    }
.end annotation


# instance fields
.field private final mAssets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;"
        }
    .end annotation
.end field

.field private final mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/ImageLoader;Ljava/util/List;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/ImageLoader;",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "TVoid;>;)V"
        }
    .end annotation

    .line 18
    invoke-direct {p0, p3}, Lcom/usebutton/sdk/internal/core/Command;-><init>(Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 19
    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/LoadAssetsCommand;->mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    .line 20
    iput-object p2, p0, Lcom/usebutton/sdk/internal/commands/LoadAssetsCommand;->mAssets:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public execute()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 25
    new-instance v0, Lcom/usebutton/sdk/internal/util/StopWatch;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/StopWatch;-><init>()V

    .line 26
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/LoadAssetsCommand;->mAssets:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/usebutton/sdk/internal/models/Asset;

    .line 27
    iget-object v3, p0, Lcom/usebutton/sdk/internal/commands/LoadAssetsCommand;->mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    invoke-static {v0, v3, v2}, Lcom/usebutton/sdk/internal/models/AssetCollection;->downloadToAsset(Lcom/usebutton/sdk/internal/util/StopWatch;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/models/Asset;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 28
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;

    const-string v1, "Failure while loading assets."

    invoke-direct {v0, v1}, Lcom/usebutton/sdk/internal/api/ButtonNetworkException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const-string v1, "Done loading assets."

    .line 31
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/StopWatch;->stop(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public key()Ljava/lang/String;
    .locals 2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "LoadAssetsCommand: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/LoadAssetsCommand;->mAssets:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
