.class public Lcom/usebutton/sdk/internal/commands/GetLinksCommand;
.super Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.source "GetLinksCommand.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand<",
        "Lcom/usebutton/sdk/internal/core/Response<",
        "Lcom/usebutton/sdk/internal/models/AppAction;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final mKey:Ljava/lang/String;

.field private final mMerchantId:Ljava/lang/String;

.field private final mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

.field private final mPubRef:Ljava/lang/String;

.field private final mUrl:Ljava/net/URL;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/util/PackageObserver;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/api/ButtonApi;",
            "Lcom/usebutton/sdk/internal/core/Storage;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/util/PackageObserver;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lcom/usebutton/sdk/internal/core/Response<",
            "Lcom/usebutton/sdk/internal/models/AppAction;",
            ">;>;)V"
        }
    .end annotation

    .line 32
    invoke-direct {p0, p1, p2, p6}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 33
    iput-object p3, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mMerchantId:Ljava/lang/String;

    const/4 p1, 0x0

    .line 34
    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mUrl:Ljava/net/URL;

    .line 35
    iput-object p4, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mPubRef:Ljava/lang/String;

    .line 36
    iput-object p5, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

    const-string p1, "get-links-%s-%s"

    const/4 p2, 0x2

    .line 37
    new-array p2, p2, [Ljava/lang/Object;

    const/4 p5, 0x0

    aput-object p3, p2, p5

    const/4 p3, 0x1

    aput-object p4, p2, p3

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mKey:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Ljava/net/URL;Ljava/lang/String;Lcom/usebutton/sdk/internal/util/PackageObserver;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0
    .param p3    # Ljava/net/URL;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/api/ButtonApi;",
            "Lcom/usebutton/sdk/internal/core/Storage;",
            "Ljava/net/URL;",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/internal/util/PackageObserver;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lcom/usebutton/sdk/internal/core/Response<",
            "Lcom/usebutton/sdk/internal/models/AppAction;",
            ">;>;)V"
        }
    .end annotation

    .line 46
    invoke-direct {p0, p1, p2, p6}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    const/4 p1, 0x0

    .line 47
    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mMerchantId:Ljava/lang/String;

    .line 48
    iput-object p3, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mUrl:Ljava/net/URL;

    .line 49
    iput-object p4, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mPubRef:Ljava/lang/String;

    .line 50
    iput-object p5, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

    const-string p1, "get-links-%s-%s"

    const/4 p2, 0x2

    .line 51
    new-array p2, p2, [Ljava/lang/Object;

    const/4 p5, 0x0

    aput-object p3, p2, p5

    const/4 p3, 0x1

    aput-object p4, p2, p3

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mKey:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public execute()Lcom/usebutton/sdk/internal/core/Response;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/usebutton/sdk/internal/core/Response<",
            "Lcom/usebutton/sdk/internal/models/AppAction;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 56
    invoke-super {p0}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->execute()Ljava/lang/Object;

    .line 58
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/api/AppStatus;->create(Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/util/PackageObserver;)Lcom/usebutton/sdk/internal/api/AppStatus;

    move-result-object v0

    .line 60
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mUrl:Ljava/net/URL;

    if-eqz v1, :cond_0

    .line 61
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mUrl:Ljava/net/URL;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mPubRef:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getLinks(Ljava/net/URL;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/AppStatus;)Lcom/usebutton/sdk/internal/core/Response;

    move-result-object v0

    goto :goto_0

    .line 63
    :cond_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mMerchantId:Ljava/lang/String;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mPubRef:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getLinks(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/internal/api/AppStatus;)Lcom/usebutton/sdk/internal/core/Response;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 66
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Response;->object()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-eqz v0, :cond_2

    .line 67
    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Response;->httpResponse()Lcom/usebutton/sdk/internal/api/HttpResponse;

    move-result-object v1

    :cond_2
    const/4 v0, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x2

    if-eqz v2, :cond_3

    const-string v5, "Button action fetched (Merchant ID: %s, URL: %s Action ID: %s)"

    const/4 v6, 0x3

    .line 70
    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mMerchantId:Ljava/lang/String;

    aput-object v7, v6, v3

    iget-object v3, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mUrl:Ljava/net/URL;

    aput-object v3, v6, v0

    iget-object v0, v2, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v0, v0, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->id:Ljava/lang/String;

    aput-object v0, v6, v4

    invoke-static {v5, v6}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    const-string v5, "Button has no action available (Merchant ID: %s, URL: %s)"

    .line 73
    new-array v4, v4, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mMerchantId:Ljava/lang/String;

    aput-object v6, v4, v3

    iget-object v3, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mUrl:Ljava/net/URL;

    aput-object v3, v4, v0

    invoke-static {v5, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 77
    :goto_2
    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/AppAction;->fromDTO(Lcom/usebutton/sdk/internal/api/models/AppActionDTO;)Lcom/usebutton/sdk/internal/models/AppAction;

    move-result-object v0

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/core/Response;->success(Ljava/lang/Object;Lcom/usebutton/sdk/internal/api/HttpResponse;)Lcom/usebutton/sdk/internal/core/Response;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic execute()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 19
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->execute()Lcom/usebutton/sdk/internal/core/Response;

    move-result-object v0

    return-object v0
.end method

.method public key()Ljava/lang/String;
    .locals 1

    .line 82
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/GetLinksCommand;->mKey:Ljava/lang/String;

    return-object v0
.end method
