.class public abstract Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.super Lcom/usebutton/sdk/internal/core/Command;
.source "AuthenticatedCommand.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/usebutton/sdk/internal/core/Command<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "AuthenticatedCommand"


# instance fields
.field final mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

.field final mStorage:Lcom/usebutton/sdk/internal/core/Storage;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/core/Command;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    .line 20
    iput-object p2, p0, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0

    .line 24
    invoke-direct {p0, p3}, Lcom/usebutton/sdk/internal/core/Command;-><init>(Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 25
    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    .line 26
    iput-object p2, p0, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    return-void
.end method


# virtual methods
.method public execute()Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Storage;->getSessionId()Ljava/lang/String;

    move-result-object v0

    .line 32
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "AuthenticatedCommand"

    const-string v1, "Fetching session ID."

    .line 33
    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->info(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->createSession()Ljava/lang/String;

    move-result-object v0

    .line 35
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v1, v0}, Lcom/usebutton/sdk/internal/core/Storage;->setSessionId(Ljava/lang/String;)V

    const-string v1, "AuthenticatedCommand"

    const-string v2, "Logged in with sessionId "

    const/4 v3, 0x1

    .line 36
    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    invoke-static {v1, v2, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "Created session (Session ID: %s)"

    .line 37
    new-array v2, v3, [Ljava/lang/Object;

    aput-object v0, v2, v5

    invoke-static {v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/api/ButtonApi;->setSessionInfo(Lcom/usebutton/sdk/internal/core/Storage;)V

    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method
