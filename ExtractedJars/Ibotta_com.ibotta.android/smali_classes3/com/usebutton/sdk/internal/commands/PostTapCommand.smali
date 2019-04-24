.class public Lcom/usebutton/sdk/internal/commands/PostTapCommand;
.super Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.source "PostTapCommand.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand<",
        "Lorg/json/JSONObject;",
        ">;"
    }
.end annotation


# instance fields
.field private final api:Lcom/usebutton/sdk/internal/api/ButtonApi;

.field private final sourceToken:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Ljava/lang/String;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/api/ButtonApi;",
            "Lcom/usebutton/sdk/internal/core/Storage;",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1, p2, p4}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 16
    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/PostTapCommand;->api:Lcom/usebutton/sdk/internal/api/ButtonApi;

    .line 17
    iput-object p3, p0, Lcom/usebutton/sdk/internal/commands/PostTapCommand;->sourceToken:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic execute()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 9
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/commands/PostTapCommand;->execute()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public execute()Lorg/json/JSONObject;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 27
    invoke-super {p0}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->execute()Ljava/lang/Object;

    .line 28
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/PostTapCommand;->api:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/PostTapCommand;->sourceToken:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->postTap(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public key()Ljava/lang/String;
    .locals 1

    .line 22
    const-class v0, Lcom/usebutton/sdk/internal/commands/PostTapCommand;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
