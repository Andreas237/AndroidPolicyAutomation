.class Lcom/mopub/mobileads/VastIconConfig;
.super Ljava/lang/Object;
.source "VastIconConfig.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J


# instance fields
.field private final mClickThroughUri:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mClickTrackingUris:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final mDurationMS:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mHeight:I

.field private final mOffsetMS:I

.field private final mVastResource:Lcom/mopub/mobileads/VastResource;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final mViewTrackingUris:Ljava/util/List;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastTracker;",
            ">;"
        }
    .end annotation
.end field

.field private final mWidth:I


# direct methods
.method constructor <init>(IILjava/lang/Integer;Ljava/lang/Integer;Lcom/mopub/mobileads/VastResource;Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .param p3    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Integer;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Lcom/mopub/mobileads/VastResource;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p6    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p8    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Lcom/mopub/mobileads/VastResource;",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastTracker;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastTracker;",
            ">;)V"
        }
    .end annotation

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    invoke-static {p5}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 47
    invoke-static {p6}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 48
    invoke-static {p8}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 50
    iput p1, p0, Lcom/mopub/mobileads/VastIconConfig;->mWidth:I

    .line 51
    iput p2, p0, Lcom/mopub/mobileads/VastIconConfig;->mHeight:I

    if-nez p3, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 52
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    iput p1, p0, Lcom/mopub/mobileads/VastIconConfig;->mOffsetMS:I

    .line 53
    iput-object p4, p0, Lcom/mopub/mobileads/VastIconConfig;->mDurationMS:Ljava/lang/Integer;

    .line 54
    iput-object p5, p0, Lcom/mopub/mobileads/VastIconConfig;->mVastResource:Lcom/mopub/mobileads/VastResource;

    .line 55
    iput-object p6, p0, Lcom/mopub/mobileads/VastIconConfig;->mClickTrackingUris:Ljava/util/List;

    .line 56
    iput-object p7, p0, Lcom/mopub/mobileads/VastIconConfig;->mClickThroughUri:Ljava/lang/String;

    .line 57
    iput-object p8, p0, Lcom/mopub/mobileads/VastIconConfig;->mViewTrackingUris:Ljava/util/List;

    return-void
.end method


# virtual methods
.method getClickThroughUri()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 104
    iget-object v0, p0, Lcom/mopub/mobileads/VastIconConfig;->mClickThroughUri:Ljava/lang/String;

    return-object v0
.end method

.method getClickTrackingUris()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastTracker;",
            ">;"
        }
    .end annotation

    .line 99
    iget-object v0, p0, Lcom/mopub/mobileads/VastIconConfig;->mClickTrackingUris:Ljava/util/List;

    return-object v0
.end method

.method getDurationMS()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 84
    iget-object v0, p0, Lcom/mopub/mobileads/VastIconConfig;->mDurationMS:Ljava/lang/Integer;

    return-object v0
.end method

.method getHeight()I
    .locals 1

    .line 65
    iget v0, p0, Lcom/mopub/mobileads/VastIconConfig;->mHeight:I

    return v0
.end method

.method getOffsetMS()I
    .locals 1

    .line 74
    iget v0, p0, Lcom/mopub/mobileads/VastIconConfig;->mOffsetMS:I

    return v0
.end method

.method getVastResource()Lcom/mopub/mobileads/VastResource;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 94
    iget-object v0, p0, Lcom/mopub/mobileads/VastIconConfig;->mVastResource:Lcom/mopub/mobileads/VastResource;

    return-object v0
.end method

.method getViewTrackingUris()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mopub/mobileads/VastTracker;",
            ">;"
        }
    .end annotation

    .line 109
    iget-object v0, p0, Lcom/mopub/mobileads/VastIconConfig;->mViewTrackingUris:Ljava/util/List;

    return-object v0
.end method

.method getWidth()I
    .locals 1

    .line 61
    iget v0, p0, Lcom/mopub/mobileads/VastIconConfig;->mWidth:I

    return v0
.end method

.method handleClick(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 5
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 141
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 144
    iget-object v0, p0, Lcom/mopub/mobileads/VastIconConfig;->mVastResource:Lcom/mopub/mobileads/VastResource;

    iget-object v1, p0, Lcom/mopub/mobileads/VastIconConfig;->mClickThroughUri:Ljava/lang/String;

    invoke-virtual {v0, v1, p2}, Lcom/mopub/mobileads/VastResource;->getCorrectClickThroughUrl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 147
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 151
    :cond_0
    new-instance v0, Lcom/mopub/common/UrlHandler$Builder;

    invoke-direct {v0}, Lcom/mopub/common/UrlHandler$Builder;-><init>()V

    sget-object v1, Lcom/mopub/common/UrlAction;->IGNORE_ABOUT_SCHEME:Lcom/mopub/common/UrlAction;

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/mopub/common/UrlAction;

    const/4 v3, 0x0

    sget-object v4, Lcom/mopub/common/UrlAction;->OPEN_NATIVE_BROWSER:Lcom/mopub/common/UrlAction;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    sget-object v4, Lcom/mopub/common/UrlAction;->OPEN_IN_APP_BROWSER:Lcom/mopub/common/UrlAction;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/mopub/common/UrlHandler$Builder;->withSupportedUrlActions(Lcom/mopub/common/UrlAction;[Lcom/mopub/common/UrlAction;)Lcom/mopub/common/UrlHandler$Builder;

    move-result-object v0

    new-instance v1, Lcom/mopub/mobileads/VastIconConfig$1;

    invoke-direct {v1, p0, p3, p1}, Lcom/mopub/mobileads/VastIconConfig$1;-><init>(Lcom/mopub/mobileads/VastIconConfig;Ljava/lang/String;Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Lcom/mopub/common/UrlHandler$Builder;->withResultActions(Lcom/mopub/common/UrlHandler$ResultActions;)Lcom/mopub/common/UrlHandler$Builder;

    move-result-object p3

    invoke-virtual {p3}, Lcom/mopub/common/UrlHandler$Builder;->withoutMoPubBrowser()Lcom/mopub/common/UrlHandler$Builder;

    move-result-object p3

    invoke-virtual {p3}, Lcom/mopub/common/UrlHandler$Builder;->build()Lcom/mopub/common/UrlHandler;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lcom/mopub/common/UrlHandler;->handleUrl(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method handleImpression(Landroid/content/Context;ILjava/lang/String;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 120
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 121
    invoke-static {p3}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 123
    iget-object v0, p0, Lcom/mopub/mobileads/VastIconConfig;->mViewTrackingUris:Ljava/util/List;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const/4 v1, 0x0

    invoke-static {v0, v1, p2, p3, p1}, Lcom/mopub/network/TrackingRequest;->makeVastTrackingHttpRequest(Ljava/util/List;Lcom/mopub/mobileads/VastErrorCode;Ljava/lang/Integer;Ljava/lang/String;Landroid/content/Context;)V

    return-void
.end method
