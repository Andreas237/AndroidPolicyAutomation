.class public Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;
.super Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.source "GetPromotionsCommand.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "GetPromotionsCommand"


# instance fields
.field private final mCache:Lcom/usebutton/sdk/internal/api/ActionCache;

.field private final mContext:Lcom/usebutton/sdk/action/ActionQuery;

.field private final mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

.field private final mKey:Ljava/lang/String;

.field private final mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

.field private final mPlacementId:Ljava/lang/String;

.field private final mPubRef:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/api/ActionCache;Lcom/usebutton/sdk/internal/ImageLoader;Lcom/usebutton/sdk/internal/util/PackageObserver;Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V
    .locals 0
    .param p7    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Lcom/usebutton/sdk/action/ActionQuery;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/api/ButtonApi;",
            "Lcom/usebutton/sdk/internal/core/Storage;",
            "Lcom/usebutton/sdk/internal/api/ActionCache;",
            "Lcom/usebutton/sdk/internal/ImageLoader;",
            "Lcom/usebutton/sdk/internal/util/PackageObserver;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/usebutton/sdk/action/ActionQuery;",
            "Lcom/usebutton/sdk/internal/core/FailableReceiver<",
            "Lcom/usebutton/sdk/internal/models/AppAction;",
            ">;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0, p1, p2, p9}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/core/FailableReceiver;)V

    .line 36
    iput-object p4, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    .line 37
    iput-object p5, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

    .line 38
    iput-object p6, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPlacementId:Ljava/lang/String;

    .line 39
    iput-object p7, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPubRef:Ljava/lang/String;

    .line 40
    iput-object p8, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mContext:Lcom/usebutton/sdk/action/ActionQuery;

    .line 41
    iput-object p3, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mCache:Lcom/usebutton/sdk/internal/api/ActionCache;

    const-string p1, "%s,%s,%s"

    const/4 p2, 0x3

    .line 43
    new-array p2, p2, [Ljava/lang/Object;

    const/4 p3, 0x0

    aput-object p6, p2, p3

    const/4 p3, 0x1

    aput-object p7, p2, p3

    invoke-direct {p0, p8}, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->contextKey(Lcom/usebutton/sdk/action/ActionQuery;)Ljava/lang/String;

    move-result-object p3

    const/4 p4, 0x2

    aput-object p3, p2, p4

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mKey:Ljava/lang/String;

    return-void
.end method

.method private contextKey(Lcom/usebutton/sdk/action/ActionQuery;)Ljava/lang/String;
    .locals 0

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    .line 48
    :cond_0
    invoke-virtual {p1}, Lcom/usebutton/sdk/action/ActionQuery;->key()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getButton()Lcom/usebutton/sdk/internal/api/models/AppActionDTO;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/usebutton/sdk/internal/api/ButtonNetworkException;
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPackageObserver:Lcom/usebutton/sdk/internal/util/PackageObserver;

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/api/AppStatus;->create(Lcom/usebutton/sdk/internal/core/Storage;Lcom/usebutton/sdk/internal/util/PackageObserver;)Lcom/usebutton/sdk/internal/api/AppStatus;

    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPlacementId:Ljava/lang/String;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPubRef:Ljava/lang/String;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mContext:Lcom/usebutton/sdk/action/ActionQuery;

    invoke-virtual {v1, v2, v3, v4, v0}, Lcom/usebutton/sdk/internal/api/ButtonApi;->getButton(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;Lcom/usebutton/sdk/internal/api/AppStatus;)Lcom/usebutton/sdk/internal/api/models/AppActionDTO;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->validateButton(Lcom/usebutton/sdk/internal/api/models/AppActionDTO;)Lcom/usebutton/sdk/internal/api/models/AppActionDTO;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const-string v3, "Button action fetched (Button ID: %s, Action ID: %s)"

    const/4 v4, 0x2

    .line 97
    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPlacementId:Ljava/lang/String;

    aput-object v5, v4, v1

    iget-object v1, v0, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->id:Ljava/lang/String;

    aput-object v1, v4, v2

    invoke-static {v3, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string v3, "Button has no action available (Button ID: %s)"

    .line 100
    new-array v2, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPlacementId:Ljava/lang/String;

    aput-object v4, v2, v1

    invoke-static {v3, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method private reportResult(Lcom/usebutton/sdk/internal/models/AppAction;)Lcom/usebutton/sdk/internal/models/AppAction;
    .locals 0
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    return-object p1
.end method

.method private validateButton(Lcom/usebutton/sdk/internal/api/models/AppActionDTO;)Lcom/usebutton/sdk/internal/api/models/AppActionDTO;
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 109
    :cond_0
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->id:Ljava/lang/String;

    if-nez v1, :cond_1

    const-string p1, "Button rejected (No ID)."

    .line 110
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-object v0

    .line 113
    :cond_1
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->sourceToken:Ljava/lang/String;

    if-nez v1, :cond_2

    const-string p1, "Button rejected (No source token)."

    .line 114
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-object v0

    .line 117
    :cond_2
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mPreview:Lcom/usebutton/sdk/internal/api/models/PreviewDTO;

    if-nez v1, :cond_3

    const-string p1, "Button rejected (No preview)."

    .line 118
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-object v0

    .line 121
    :cond_3
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mPreview:Lcom/usebutton/sdk/internal/api/models/PreviewDTO;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mLabel:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    if-nez v1, :cond_4

    const-string p1, "Button rejected (No preview label)."

    .line 122
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-object v0

    :cond_4
    const-string/jumbo v1, "webview"

    .line 124
    iget-object v2, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mMeta:Lcom/usebutton/sdk/internal/api/models/MetaDTO;

    iget-object v2, v2, Lcom/usebutton/sdk/internal/api/models/MetaDTO;->target:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mBrowser:Lcom/usebutton/sdk/internal/api/models/BrowserDTO;

    if-nez v1, :cond_5

    const-string p1, "Button rejected, no valid browser while target=webview."

    .line 125
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-object v0

    .line 127
    :cond_5
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mBrowser:Lcom/usebutton/sdk/internal/api/models/BrowserDTO;

    if-eqz v1, :cond_6

    .line 128
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mBrowser:Lcom/usebutton/sdk/internal/api/models/BrowserDTO;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/api/models/BrowserDTO;->titleText:Lcom/usebutton/sdk/internal/api/models/TextDTO;

    if-nez v1, :cond_6

    const-string p1, "Button rejected, no valid title field for browser."

    .line 129
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-object v0

    .line 133
    :cond_6
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mPreview:Lcom/usebutton/sdk/internal/api/models/PreviewDTO;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/api/models/PreviewDTO;->mDeepLink:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    if-eqz v1, :cond_7

    goto :goto_0

    .line 137
    :cond_7
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mList:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;

    if-eqz v1, :cond_9

    .line 138
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mList:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;->groups:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    const-string p1, "Button rejected (No inventory group)."

    .line 139
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-object v0

    .line 142
    :cond_8
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mList:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ListDTO;->groups:Ljava/util/List;

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/usebutton/sdk/internal/api/models/GroupDTO;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/api/models/GroupDTO;->mItems:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_b

    const-string p1, "Button rejected (No inventory items)."

    .line 143
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-object v0

    .line 146
    :cond_9
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mProduct:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;

    if-eqz v1, :cond_d

    .line 147
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mProduct:Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/api/models/BodyDTO$ProductDTO;->images:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_a

    const-string p1, "Button rejected (No product images)."

    .line 148
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-object v0

    .line 151
    :cond_a
    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mFooter:Lcom/usebutton/sdk/internal/api/models/FooterDTO;

    if-eqz v1, :cond_c

    iget-object v1, p1, Lcom/usebutton/sdk/internal/api/models/AppActionDTO;->mFooter:Lcom/usebutton/sdk/internal/api/models/FooterDTO;

    iget-object v1, v1, Lcom/usebutton/sdk/internal/api/models/FooterDTO;->mAction:Lcom/usebutton/sdk/internal/api/models/LinkDTO;

    if-nez v1, :cond_b

    goto :goto_1

    :cond_b
    :goto_0
    return-object p1

    :cond_c
    :goto_1
    const-string p1, "Button rejected, no valid footer."

    .line 152
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-object v0

    :cond_d
    const-string p1, "Button rejected, no valid body."

    .line 159
    invoke-static {p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visible(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public execute()Lcom/usebutton/sdk/internal/models/AppAction;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 54
    invoke-super {p0}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->execute()Ljava/lang/Object;

    .line 56
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->isCancelled()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    .line 57
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/util/StopWatch;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/StopWatch;-><init>()V

    .line 59
    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mCache:Lcom/usebutton/sdk/internal/api/ActionCache;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPlacementId:Ljava/lang/String;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPubRef:Ljava/lang/String;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mContext:Lcom/usebutton/sdk/action/ActionQuery;

    invoke-virtual {v2, v3, v4, v5}, Lcom/usebutton/sdk/internal/api/ActionCache;->contains(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 60
    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mCache:Lcom/usebutton/sdk/internal/api/ActionCache;

    iget-object v3, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPlacementId:Ljava/lang/String;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPubRef:Ljava/lang/String;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mContext:Lcom/usebutton/sdk/action/ActionQuery;

    invoke-virtual {v2, v3, v4, v5}, Lcom/usebutton/sdk/internal/api/ActionCache;->get(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)Lcom/usebutton/sdk/internal/models/AppAction;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "Button action retrieved from local cache (Button ID: %s, Action ID: %s)"

    const/4 v4, 0x2

    .line 62
    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    iget-object v6, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPlacementId:Ljava/lang/String;

    aput-object v6, v4, v5

    const/4 v5, 0x1

    .line 63
    invoke-virtual {v2}, Lcom/usebutton/sdk/internal/models/AppAction;->getMeta()Lcom/usebutton/sdk/internal/models/MetaInfo;

    move-result-object v6

    invoke-virtual {v6}, Lcom/usebutton/sdk/internal/models/MetaInfo;->getId()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v4, v5

    .line 62
    invoke-static {v3, v4}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    move-object v2, v1

    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 67
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->getButton()Lcom/usebutton/sdk/internal/api/models/AppActionDTO;

    move-result-object v2

    const-string v3, "- /get-button"

    .line 68
    invoke-virtual {v0, v3}, Lcom/usebutton/sdk/internal/util/StopWatch;->lap(Ljava/lang/String;)V

    .line 69
    invoke-static {v2}, Lcom/usebutton/sdk/internal/models/AppAction;->fromDTO(Lcom/usebutton/sdk/internal/api/models/AppActionDTO;)Lcom/usebutton/sdk/internal/models/AppAction;

    move-result-object v2

    const-string v3, " - converted to model"

    .line 70
    invoke-virtual {v0, v3}, Lcom/usebutton/sdk/internal/util/StopWatch;->lap(Ljava/lang/String;)V

    .line 71
    iget-object v3, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mCache:Lcom/usebutton/sdk/internal/api/ActionCache;

    iget-object v4, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPlacementId:Ljava/lang/String;

    iget-object v5, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mPubRef:Ljava/lang/String;

    iget-object v6, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mContext:Lcom/usebutton/sdk/action/ActionQuery;

    invoke-virtual {v3, v4, v5, v6, v2}, Lcom/usebutton/sdk/internal/api/ActionCache;->put(Ljava/lang/String;Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;Lcom/usebutton/sdk/internal/models/AppAction;)V

    :cond_3
    if-nez v2, :cond_4

    .line 74
    invoke-direct {p0, v1}, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->reportResult(Lcom/usebutton/sdk/internal/models/AppAction;)Lcom/usebutton/sdk/internal/models/AppAction;

    move-result-object v0

    return-object v0

    .line 78
    :cond_4
    new-instance v3, Lcom/usebutton/sdk/internal/models/AssetCollection;

    invoke-direct {v3, v2}, Lcom/usebutton/sdk/internal/models/AssetCollection;-><init>(Lcom/usebutton/sdk/internal/models/AppAction;)V

    iget-object v4, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mImageLoader:Lcom/usebutton/sdk/internal/ImageLoader;

    invoke-virtual {v3, v4}, Lcom/usebutton/sdk/internal/models/AssetCollection;->downloadToAsset(Lcom/usebutton/sdk/internal/ImageLoader;)V

    const-string v3, " - downloaded assets"

    .line 79
    invoke-virtual {v0, v3}, Lcom/usebutton/sdk/internal/util/StopWatch;->lap(Ljava/lang/String;)V

    .line 81
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->isCancelled()Z

    move-result v3

    if-eqz v3, :cond_5

    return-object v1

    :cond_5
    const-string v1, "GetPromotionsCommand finished"

    .line 83
    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/util/StopWatch;->stop(Ljava/lang/String;)V

    .line 84
    invoke-direct {p0, v2}, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->reportResult(Lcom/usebutton/sdk/internal/models/AppAction;)Lcom/usebutton/sdk/internal/models/AppAction;

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

    .line 20
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->execute()Lcom/usebutton/sdk/internal/models/AppAction;

    move-result-object v0

    return-object v0
.end method

.method public key()Ljava/lang/String;
    .locals 1

    .line 167
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/GetPromotionsCommand;->mKey:Ljava/lang/String;

    return-object v0
.end method
