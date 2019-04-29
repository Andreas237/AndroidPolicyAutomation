.class Lcom/mopub/nativeads/NativeUrlGenerator;
.super Lcom/mopub/common/AdUrlGenerator;
.source "NativeUrlGenerator.java"


# instance fields
.field private mDesiredAssets:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mSequenceNumber:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0, p1}, Lcom/mopub/common/AdUrlGenerator;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method private setDesiredAssets()V
    .locals 2

    .line 64
    iget-object v0, p0, Lcom/mopub/nativeads/NativeUrlGenerator;->mDesiredAssets:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "assets"

    .line 65
    iget-object v1, p0, Lcom/mopub/nativeads/NativeUrlGenerator;->mDesiredAssets:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/mopub/nativeads/NativeUrlGenerator;->addParam(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private setSequenceNumber()V
    .locals 2

    .line 58
    iget-object v0, p0, Lcom/mopub/nativeads/NativeUrlGenerator;->mSequenceNumber:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "MAGIC_NO"

    .line 59
    iget-object v1, p0, Lcom/mopub/nativeads/NativeUrlGenerator;->mSequenceNumber:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lcom/mopub/nativeads/NativeUrlGenerator;->addParam(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public generateUrlString(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "/m/ad"

    .line 45
    invoke-virtual {p0, p1, v0}, Lcom/mopub/nativeads/NativeUrlGenerator;->initUrlString(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    iget-object p1, p0, Lcom/mopub/nativeads/NativeUrlGenerator;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/mopub/common/ClientMetadata;->getInstance(Landroid/content/Context;)Lcom/mopub/common/ClientMetadata;

    move-result-object p1

    .line 48
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/NativeUrlGenerator;->addBaseParams(Lcom/mopub/common/ClientMetadata;)V

    .line 50
    invoke-direct {p0}, Lcom/mopub/nativeads/NativeUrlGenerator;->setDesiredAssets()V

    .line 52
    invoke-direct {p0}, Lcom/mopub/nativeads/NativeUrlGenerator;->setSequenceNumber()V

    .line 54
    invoke-virtual {p0}, Lcom/mopub/nativeads/NativeUrlGenerator;->getFinalUrlString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected setSdkVersion(Ljava/lang/String;)V
    .locals 1

    const-string v0, "nsv"

    .line 71
    invoke-virtual {p0, v0, p1}, Lcom/mopub/nativeads/NativeUrlGenerator;->addParam(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic withAdUnitId(Ljava/lang/String;)Lcom/mopub/common/AdUrlGenerator;
    .locals 0

    .line 12
    invoke-virtual {p0, p1}, Lcom/mopub/nativeads/NativeUrlGenerator;->withAdUnitId(Ljava/lang/String;)Lcom/mopub/nativeads/NativeUrlGenerator;

    move-result-object p1

    return-object p1
.end method

.method public withAdUnitId(Ljava/lang/String;)Lcom/mopub/nativeads/NativeUrlGenerator;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 23
    iput-object p1, p0, Lcom/mopub/nativeads/NativeUrlGenerator;->mAdUnitId:Ljava/lang/String;

    return-object p0
.end method

.method withRequest(Lcom/mopub/nativeads/RequestParameters;)Lcom/mopub/nativeads/NativeUrlGenerator;
    .locals 1
    .param p1    # Lcom/mopub/nativeads/RequestParameters;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-eqz p1, :cond_0

    .line 30
    invoke-virtual {p1}, Lcom/mopub/nativeads/RequestParameters;->getKeywords()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/NativeUrlGenerator;->mKeywords:Ljava/lang/String;

    .line 31
    invoke-virtual {p1}, Lcom/mopub/nativeads/RequestParameters;->getLocation()Landroid/location/Location;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/NativeUrlGenerator;->mLocation:Landroid/location/Location;

    .line 32
    invoke-virtual {p1}, Lcom/mopub/nativeads/RequestParameters;->getDesiredAssets()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/nativeads/NativeUrlGenerator;->mDesiredAssets:Ljava/lang/String;

    :cond_0
    return-object p0
.end method

.method withSequenceNumber(I)Lcom/mopub/nativeads/NativeUrlGenerator;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 39
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/nativeads/NativeUrlGenerator;->mSequenceNumber:Ljava/lang/String;

    return-object p0
.end method
