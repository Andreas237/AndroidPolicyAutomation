.class public Lcom/mopub/nativeads/RequestParameters;
.super Ljava/lang/Object;
.source "RequestParameters.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/nativeads/RequestParameters$Builder;,
        Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;
    }
.end annotation


# instance fields
.field private final mDesiredAssets:Ljava/util/EnumSet;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;",
            ">;"
        }
    .end annotation
.end field

.field private final mKeywords:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mLocation:Landroid/location/Location;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/mopub/nativeads/RequestParameters$Builder;)V
    .locals 1
    .param p1    # Lcom/mopub/nativeads/RequestParameters$Builder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    invoke-static {p1}, Lcom/mopub/nativeads/RequestParameters$Builder;->access$100(Lcom/mopub/nativeads/RequestParameters$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/RequestParameters;->mKeywords:Ljava/lang/String;

    .line 69
    invoke-static {p1}, Lcom/mopub/nativeads/RequestParameters$Builder;->access$200(Lcom/mopub/nativeads/RequestParameters$Builder;)Landroid/location/Location;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/nativeads/RequestParameters;->mLocation:Landroid/location/Location;

    .line 70
    invoke-static {p1}, Lcom/mopub/nativeads/RequestParameters$Builder;->access$300(Lcom/mopub/nativeads/RequestParameters$Builder;)Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/nativeads/RequestParameters;->mDesiredAssets:Ljava/util/EnumSet;

    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/nativeads/RequestParameters$Builder;Lcom/mopub/nativeads/RequestParameters$1;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Lcom/mopub/nativeads/RequestParameters;-><init>(Lcom/mopub/nativeads/RequestParameters$Builder;)V

    return-void
.end method


# virtual methods
.method public final getDesiredAssets()Ljava/lang/String;
    .locals 2

    const-string v0, ""

    .line 86
    iget-object v1, p0, Lcom/mopub/nativeads/RequestParameters;->mDesiredAssets:Ljava/util/EnumSet;

    if-eqz v1, :cond_0

    const-string v0, ","

    .line 87
    iget-object v1, p0, Lcom/mopub/nativeads/RequestParameters;->mDesiredAssets:Ljava/util/EnumSet;

    invoke-virtual {v1}, Ljava/util/EnumSet;->toArray()[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final getKeywords()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 75
    iget-object v0, p0, Lcom/mopub/nativeads/RequestParameters;->mKeywords:Ljava/lang/String;

    return-object v0
.end method

.method public final getLocation()Landroid/location/Location;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 80
    iget-object v0, p0, Lcom/mopub/nativeads/RequestParameters;->mLocation:Landroid/location/Location;

    return-object v0
.end method
