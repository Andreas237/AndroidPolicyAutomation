.class public Lcom/mopub/common/UrlHandler;
.super Ljava/lang/Object;
.source "UrlHandler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/common/UrlHandler$Builder;,
        Lcom/mopub/common/UrlHandler$MoPubSchemeListener;,
        Lcom/mopub/common/UrlHandler$ResultActions;
    }
.end annotation


# static fields
.field private static final EMPTY_CLICK_LISTENER:Lcom/mopub/common/UrlHandler$ResultActions;

.field private static final EMPTY_MOPUB_SCHEME_LISTENER:Lcom/mopub/common/UrlHandler$MoPubSchemeListener;


# instance fields
.field private mAlreadySucceeded:Z

.field private mDspCreativeId:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mMoPubSchemeListener:Lcom/mopub/common/UrlHandler$MoPubSchemeListener;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mResultActions:Lcom/mopub/common/UrlHandler$ResultActions;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private mSkipShowMoPubBrowser:Z

.field private mSupportedUrlActions:Ljava/util/EnumSet;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/mopub/common/UrlAction;",
            ">;"
        }
    .end annotation
.end field

.field private mTaskPending:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 157
    new-instance v0, Lcom/mopub/common/UrlHandler$1;

    invoke-direct {v0}, Lcom/mopub/common/UrlHandler$1;-><init>()V

    sput-object v0, Lcom/mopub/common/UrlHandler;->EMPTY_CLICK_LISTENER:Lcom/mopub/common/UrlHandler$ResultActions;

    .line 164
    new-instance v0, Lcom/mopub/common/UrlHandler$2;

    invoke-direct {v0}, Lcom/mopub/common/UrlHandler$2;-><init>()V

    sput-object v0, Lcom/mopub/common/UrlHandler;->EMPTY_MOPUB_SCHEME_LISTENER:Lcom/mopub/common/UrlHandler$MoPubSchemeListener;

    return-void
.end method

.method private constructor <init>(Ljava/util/EnumSet;Lcom/mopub/common/UrlHandler$ResultActions;Lcom/mopub/common/UrlHandler$MoPubSchemeListener;ZLjava/lang/String;)V
    .locals 0
    .param p1    # Ljava/util/EnumSet;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/common/UrlHandler$ResultActions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/mopub/common/UrlHandler$MoPubSchemeListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet<",
            "Lcom/mopub/common/UrlAction;",
            ">;",
            "Lcom/mopub/common/UrlHandler$ResultActions;",
            "Lcom/mopub/common/UrlHandler$MoPubSchemeListener;",
            "Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 192
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 193
    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/common/UrlHandler;->mSupportedUrlActions:Ljava/util/EnumSet;

    .line 194
    iput-object p2, p0, Lcom/mopub/common/UrlHandler;->mResultActions:Lcom/mopub/common/UrlHandler$ResultActions;

    .line 195
    iput-object p3, p0, Lcom/mopub/common/UrlHandler;->mMoPubSchemeListener:Lcom/mopub/common/UrlHandler$MoPubSchemeListener;

    .line 196
    iput-boolean p4, p0, Lcom/mopub/common/UrlHandler;->mSkipShowMoPubBrowser:Z

    .line 197
    iput-object p5, p0, Lcom/mopub/common/UrlHandler;->mDspCreativeId:Ljava/lang/String;

    const/4 p1, 0x0

    .line 198
    iput-boolean p1, p0, Lcom/mopub/common/UrlHandler;->mAlreadySucceeded:Z

    .line 199
    iput-boolean p1, p0, Lcom/mopub/common/UrlHandler;->mTaskPending:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/EnumSet;Lcom/mopub/common/UrlHandler$ResultActions;Lcom/mopub/common/UrlHandler$MoPubSchemeListener;ZLjava/lang/String;Lcom/mopub/common/UrlHandler$1;)V
    .locals 0

    .line 26
    invoke-direct/range {p0 .. p5}, Lcom/mopub/common/UrlHandler;-><init>(Ljava/util/EnumSet;Lcom/mopub/common/UrlHandler$ResultActions;Lcom/mopub/common/UrlHandler$MoPubSchemeListener;ZLjava/lang/String;)V

    return-void
.end method

.method static synthetic access$000()Lcom/mopub/common/UrlHandler$ResultActions;
    .locals 1

    .line 26
    sget-object v0, Lcom/mopub/common/UrlHandler;->EMPTY_CLICK_LISTENER:Lcom/mopub/common/UrlHandler$ResultActions;

    return-object v0
.end method

.method static synthetic access$100()Lcom/mopub/common/UrlHandler$MoPubSchemeListener;
    .locals 1

    .line 26
    sget-object v0, Lcom/mopub/common/UrlHandler;->EMPTY_MOPUB_SCHEME_LISTENER:Lcom/mopub/common/UrlHandler$MoPubSchemeListener;

    return-object v0
.end method

.method static synthetic access$302(Lcom/mopub/common/UrlHandler;Z)Z
    .locals 0

    .line 26
    iput-boolean p1, p0, Lcom/mopub/common/UrlHandler;->mTaskPending:Z

    return p1
.end method

.method static synthetic access$400(Lcom/mopub/common/UrlHandler;Ljava/lang/String;Lcom/mopub/common/UrlAction;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/mopub/common/UrlHandler;->failUrlHandling(Ljava/lang/String;Lcom/mopub/common/UrlAction;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method private failUrlHandling(Ljava/lang/String;Lcom/mopub/common/UrlAction;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/mopub/common/UrlAction;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Throwable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 336
    invoke-static {p3}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    if-nez p2, :cond_0

    .line 339
    sget-object p2, Lcom/mopub/common/UrlAction;->NOOP:Lcom/mopub/common/UrlAction;

    .line 342
    :cond_0
    invoke-static {p3, p4}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 343
    iget-object p3, p0, Lcom/mopub/common/UrlHandler;->mResultActions:Lcom/mopub/common/UrlHandler$ResultActions;

    invoke-interface {p3, p1, p2}, Lcom/mopub/common/UrlHandler$ResultActions;->urlHandlingFailed(Ljava/lang/String;Lcom/mopub/common/UrlAction;)V

    return-void
.end method


# virtual methods
.method getMoPubSchemeListener()Lcom/mopub/common/UrlHandler$MoPubSchemeListener;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 214
    iget-object v0, p0, Lcom/mopub/common/UrlHandler;->mMoPubSchemeListener:Lcom/mopub/common/UrlHandler$MoPubSchemeListener;

    return-object v0
.end method

.method getResultActions()Lcom/mopub/common/UrlHandler$ResultActions;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 209
    iget-object v0, p0, Lcom/mopub/common/UrlHandler;->mResultActions:Lcom/mopub/common/UrlHandler$ResultActions;

    return-object v0
.end method

.method getSupportedUrlActions()Ljava/util/EnumSet;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/EnumSet<",
            "Lcom/mopub/common/UrlAction;",
            ">;"
        }
    .end annotation

    .line 204
    iget-object v0, p0, Lcom/mopub/common/UrlHandler;->mSupportedUrlActions:Ljava/util/EnumSet;

    invoke-static {v0}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object v0

    return-object v0
.end method

.method public handleResolvedUrl(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Iterable;)Z
    .locals 14
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Iterable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    move-object v7, p0

    move-object/from16 v8, p2

    .line 300
    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v9, 0x0

    const/4 v10, 0x0

    if-eqz v1, :cond_0

    const-string v1, "Attempted to handle empty url."

    .line 301
    invoke-direct {v7, v8, v10, v1, v10}, Lcom/mopub/common/UrlHandler;->failUrlHandling(Ljava/lang/String;Lcom/mopub/common/UrlAction;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v9

    .line 305
    :cond_0
    sget-object v1, Lcom/mopub/common/UrlAction;->NOOP:Lcom/mopub/common/UrlAction;

    .line 306
    invoke-static/range {p2 .. p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v11

    .line 308
    iget-object v2, v7, Lcom/mopub/common/UrlHandler;->mSupportedUrlActions:Ljava/util/EnumSet;

    invoke-virtual {v2}, Ljava/util/EnumSet;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_0
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v13, v2

    check-cast v13, Lcom/mopub/common/UrlAction;

    .line 309
    invoke-virtual {v13, v11}, Lcom/mopub/common/UrlAction;->shouldTryHandlingUrl(Landroid/net/Uri;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 311
    :try_start_0
    iget-object v6, v7, Lcom/mopub/common/UrlHandler;->mDspCreativeId:Ljava/lang/String;

    move-object v1, v13

    move-object v2, v7

    move-object v3, p1

    move-object v4, v11

    move/from16 v5, p3

    invoke-virtual/range {v1 .. v6}, Lcom/mopub/common/UrlAction;->handleUrl(Lcom/mopub/common/UrlHandler;Landroid/content/Context;Landroid/net/Uri;ZLjava/lang/String;)V

    .line 313
    iget-boolean v1, v7, Lcom/mopub/common/UrlHandler;->mAlreadySucceeded:Z

    const/4 v2, 0x1

    if-nez v1, :cond_1

    iget-boolean v1, v7, Lcom/mopub/common/UrlHandler;->mTaskPending:Z

    if-nez v1, :cond_1

    sget-object v1, Lcom/mopub/common/UrlAction;->IGNORE_ABOUT_SCHEME:Lcom/mopub/common/UrlAction;

    invoke-virtual {v1, v13}, Lcom/mopub/common/UrlAction;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lcom/mopub/common/UrlAction;->HANDLE_MOPUB_SCHEME:Lcom/mopub/common/UrlAction;

    invoke-virtual {v1, v13}, Lcom/mopub/common/UrlAction;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 316
    sget-object v1, Lcom/mopub/common/event/BaseEvent$Name;->CLICK_REQUEST:Lcom/mopub/common/event/BaseEvent$Name;
    :try_end_0
    .catch Lcom/mopub/exceptions/IntentNotResolvableException; {:try_start_0 .. :try_end_0} :catch_1

    move-object v3, p1

    move-object/from16 v4, p4

    :try_start_1
    invoke-static {v4, v3, v1}, Lcom/mopub/network/TrackingRequest;->makeTrackingHttpRequest(Ljava/lang/Iterable;Landroid/content/Context;Lcom/mopub/common/event/BaseEvent$Name;)V

    .line 318
    iget-object v1, v7, Lcom/mopub/common/UrlHandler;->mResultActions:Lcom/mopub/common/UrlHandler$ResultActions;

    invoke-virtual {v11}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v5, v13}, Lcom/mopub/common/UrlHandler$ResultActions;->urlHandlingSucceeded(Ljava/lang/String;Lcom/mopub/common/UrlAction;)V

    .line 320
    iput-boolean v2, v7, Lcom/mopub/common/UrlHandler;->mAlreadySucceeded:Z
    :try_end_1
    .catch Lcom/mopub/exceptions/IntentNotResolvableException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_1
    return v2

    :catch_1
    move-exception v0

    move-object v3, p1

    move-object/from16 v4, p4

    :goto_2
    move-object v1, v0

    .line 324
    invoke-virtual {v1}, Lcom/mopub/exceptions/IntentNotResolvableException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v1, v13

    goto :goto_0

    :cond_2
    move-object v3, p1

    move-object/from16 v4, p4

    goto :goto_0

    .line 330
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Link ignored. Unable to handle url: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v7, v8, v1, v2, v10}, Lcom/mopub/common/UrlHandler;->failUrlHandling(Ljava/lang/String;Lcom/mopub/common/UrlAction;Ljava/lang/String;Ljava/lang/Throwable;)V

    return v9
.end method

.method public handleUrl(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 229
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    const/4 v0, 0x1

    .line 231
    invoke-virtual {p0, p1, p2, v0}, Lcom/mopub/common/UrlHandler;->handleUrl(Landroid/content/Context;Ljava/lang/String;Z)V

    return-void
.end method

.method public handleUrl(Landroid/content/Context;Ljava/lang/String;Z)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 244
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    const/4 v0, 0x0

    .line 246
    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/mopub/common/UrlHandler;->handleUrl(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Iterable;)V

    return-void
.end method

.method public handleUrl(Landroid/content/Context;Ljava/lang/String;ZLjava/lang/Iterable;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Iterable;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 259
    invoke-static {p1}, Lcom/mopub/common/Preconditions;->checkNotNull(Ljava/lang/Object;)V

    .line 261
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Attempted to handle empty url."

    const/4 p3, 0x0

    .line 262
    invoke-direct {p0, p2, p3, p1, p3}, Lcom/mopub/common/UrlHandler;->failUrlHandling(Ljava/lang/String;Lcom/mopub/common/UrlAction;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    .line 266
    :cond_0
    new-instance v6, Lcom/mopub/common/UrlHandler$3;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p3

    move-object v4, p4

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/mopub/common/UrlHandler$3;-><init>(Lcom/mopub/common/UrlHandler;Landroid/content/Context;ZLjava/lang/Iterable;Ljava/lang/String;)V

    .line 283
    invoke-static {p2, v6}, Lcom/mopub/common/UrlResolutionTask;->getResolvedUrl(Ljava/lang/String;Lcom/mopub/common/UrlResolutionTask$UrlResolutionListener;)V

    const/4 p1, 0x1

    .line 284
    iput-boolean p1, p0, Lcom/mopub/common/UrlHandler;->mTaskPending:Z

    return-void
.end method

.method shouldSkipShowMoPubBrowser()Z
    .locals 1

    .line 218
    iget-boolean v0, p0, Lcom/mopub/common/UrlHandler;->mSkipShowMoPubBrowser:Z

    return v0
.end method
