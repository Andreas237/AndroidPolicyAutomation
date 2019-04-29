.class public Lcom/mopub/common/UrlHandler$Builder;
.super Ljava/lang/Object;
.source "UrlHandler.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/UrlHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private creativeId:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private moPubSchemeListener:Lcom/mopub/common/UrlHandler$MoPubSchemeListener;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private resultActions:Lcom/mopub/common/UrlHandler$ResultActions;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private skipShowMoPubBrowser:Z

.field private supportedUrlActions:Ljava/util/EnumSet;
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


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    sget-object v0, Lcom/mopub/common/UrlAction;->NOOP:Lcom/mopub/common/UrlAction;

    invoke-static {v0}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/UrlHandler$Builder;->supportedUrlActions:Ljava/util/EnumSet;

    .line 66
    invoke-static {}, Lcom/mopub/common/UrlHandler;->access$000()Lcom/mopub/common/UrlHandler$ResultActions;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/UrlHandler$Builder;->resultActions:Lcom/mopub/common/UrlHandler$ResultActions;

    .line 68
    invoke-static {}, Lcom/mopub/common/UrlHandler;->access$100()Lcom/mopub/common/UrlHandler$MoPubSchemeListener;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/UrlHandler$Builder;->moPubSchemeListener:Lcom/mopub/common/UrlHandler$MoPubSchemeListener;

    const/4 v0, 0x0

    .line 70
    iput-boolean v0, p0, Lcom/mopub/common/UrlHandler$Builder;->skipShowMoPubBrowser:Z

    return-void
.end method


# virtual methods
.method public build()Lcom/mopub/common/UrlHandler;
    .locals 8

    .line 152
    new-instance v7, Lcom/mopub/common/UrlHandler;

    iget-object v1, p0, Lcom/mopub/common/UrlHandler$Builder;->supportedUrlActions:Ljava/util/EnumSet;

    iget-object v2, p0, Lcom/mopub/common/UrlHandler$Builder;->resultActions:Lcom/mopub/common/UrlHandler$ResultActions;

    iget-object v3, p0, Lcom/mopub/common/UrlHandler$Builder;->moPubSchemeListener:Lcom/mopub/common/UrlHandler$MoPubSchemeListener;

    iget-boolean v4, p0, Lcom/mopub/common/UrlHandler$Builder;->skipShowMoPubBrowser:Z

    iget-object v5, p0, Lcom/mopub/common/UrlHandler$Builder;->creativeId:Ljava/lang/String;

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/mopub/common/UrlHandler;-><init>(Ljava/util/EnumSet;Lcom/mopub/common/UrlHandler$ResultActions;Lcom/mopub/common/UrlHandler$MoPubSchemeListener;ZLjava/lang/String;Lcom/mopub/common/UrlHandler$1;)V

    return-object v7
.end method

.method public withDspCreativeId(Ljava/lang/String;)Lcom/mopub/common/UrlHandler$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 141
    iput-object p1, p0, Lcom/mopub/common/UrlHandler$Builder;->creativeId:Ljava/lang/String;

    return-object p0
.end method

.method public withMoPubSchemeListener(Lcom/mopub/common/UrlHandler$MoPubSchemeListener;)Lcom/mopub/common/UrlHandler$Builder;
    .locals 0
    .param p1    # Lcom/mopub/common/UrlHandler$MoPubSchemeListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 120
    iput-object p1, p0, Lcom/mopub/common/UrlHandler$Builder;->moPubSchemeListener:Lcom/mopub/common/UrlHandler$MoPubSchemeListener;

    return-object p0
.end method

.method public withResultActions(Lcom/mopub/common/UrlHandler$ResultActions;)Lcom/mopub/common/UrlHandler$Builder;
    .locals 0
    .param p1    # Lcom/mopub/common/UrlHandler$ResultActions;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 108
    iput-object p1, p0, Lcom/mopub/common/UrlHandler$Builder;->resultActions:Lcom/mopub/common/UrlHandler$ResultActions;

    return-object p0
.end method

.method public varargs withSupportedUrlActions(Lcom/mopub/common/UrlAction;[Lcom/mopub/common/UrlAction;)Lcom/mopub/common/UrlHandler$Builder;
    .locals 0
    .param p1    # Lcom/mopub/common/UrlAction;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [Lcom/mopub/common/UrlAction;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 83
    invoke-static {p1, p2}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;[Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/common/UrlHandler$Builder;->supportedUrlActions:Ljava/util/EnumSet;

    return-object p0
.end method

.method public withSupportedUrlActions(Ljava/util/EnumSet;)Lcom/mopub/common/UrlHandler$Builder;
    .locals 0
    .param p1    # Ljava/util/EnumSet;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet<",
            "Lcom/mopub/common/UrlAction;",
            ">;)",
            "Lcom/mopub/common/UrlHandler$Builder;"
        }
    .end annotation

    .line 96
    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/common/UrlHandler$Builder;->supportedUrlActions:Ljava/util/EnumSet;

    return-object p0
.end method

.method public withoutMoPubBrowser()Lcom/mopub/common/UrlHandler$Builder;
    .locals 1

    const/4 v0, 0x1

    .line 131
    iput-boolean v0, p0, Lcom/mopub/common/UrlHandler$Builder;->skipShowMoPubBrowser:Z

    return-object p0
.end method
