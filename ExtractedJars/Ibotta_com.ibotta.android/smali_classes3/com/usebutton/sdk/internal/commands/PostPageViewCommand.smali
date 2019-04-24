.class public Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;
.super Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.source "PostPageViewCommand.java"


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

.field private final flags:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final sourceToken:Ljava/lang/String;

.field private final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/api/ButtonApi;",
            "Lcom/usebutton/sdk/internal/core/Storage;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lorg/json/JSONObject;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0, p1, p2, p6}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 21
    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;->api:Lcom/usebutton/sdk/internal/api/ButtonApi;

    .line 22
    iput-object p3, p0, Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;->url:Ljava/lang/String;

    .line 23
    iput-object p4, p0, Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;->sourceToken:Ljava/lang/String;

    .line 24
    iput-object p5, p0, Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;->flags:Ljava/util/List;

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

    .line 11
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;->execute()Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public execute()Lorg/json/JSONObject;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 34
    invoke-super {p0}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->execute()Ljava/lang/Object;

    .line 35
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;->api:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;->url:Ljava/lang/String;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;->sourceToken:Ljava/lang/String;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/commands/PostPageViewCommand;->flags:Ljava/util/List;

    invoke-virtual {v0, v1, v2, v3}, Lcom/usebutton/sdk/internal/api/ButtonApi;->postPageView(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lorg/json/JSONObject;

    move-result-object v0

    return-object v0
.end method

.method public key()Ljava/lang/String;
    .locals 1

    const-string v0, "post-page-view-command"

    return-object v0
.end method
