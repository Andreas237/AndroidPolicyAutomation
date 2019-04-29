.class public final Lcom/mopub/nativeads/RequestParameters$Builder;
.super Ljava/lang/Object;
.source "RequestParameters.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/nativeads/RequestParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private desiredAssets:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;",
            ">;"
        }
    .end annotation
.end field

.field private keywords:Ljava/lang/String;

.field private location:Landroid/location/Location;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/mopub/nativeads/RequestParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->keywords:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$200(Lcom/mopub/nativeads/RequestParameters$Builder;)Landroid/location/Location;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->location:Landroid/location/Location;

    return-object p0
.end method

.method static synthetic access$300(Lcom/mopub/nativeads/RequestParameters$Builder;)Ljava/util/EnumSet;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->desiredAssets:Ljava/util/EnumSet;

    return-object p0
.end method


# virtual methods
.method public final build()Lcom/mopub/nativeads/RequestParameters;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 63
    new-instance v0, Lcom/mopub/nativeads/RequestParameters;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/mopub/nativeads/RequestParameters;-><init>(Lcom/mopub/nativeads/RequestParameters$Builder;Lcom/mopub/nativeads/RequestParameters$1;)V

    return-object v0
.end method

.method public final desiredAssets(Ljava/util/EnumSet;)Lcom/mopub/nativeads/RequestParameters$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/EnumSet<",
            "Lcom/mopub/nativeads/RequestParameters$NativeAdAsset;",
            ">;)",
            "Lcom/mopub/nativeads/RequestParameters$Builder;"
        }
    .end annotation

    .line 57
    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/EnumSet;)Ljava/util/EnumSet;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->desiredAssets:Ljava/util/EnumSet;

    return-object p0
.end method

.method public final keywords(Ljava/lang/String;)Lcom/mopub/nativeads/RequestParameters$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 44
    iput-object p1, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->keywords:Ljava/lang/String;

    return-object p0
.end method

.method public final location(Landroid/location/Location;)Lcom/mopub/nativeads/RequestParameters$Builder;
    .locals 0
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 50
    iput-object p1, p0, Lcom/mopub/nativeads/RequestParameters$Builder;->location:Landroid/location/Location;

    return-object p0
.end method
