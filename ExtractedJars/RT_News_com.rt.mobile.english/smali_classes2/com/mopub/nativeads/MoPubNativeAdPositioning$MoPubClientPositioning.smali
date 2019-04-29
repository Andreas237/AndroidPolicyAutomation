.class public Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
.super Ljava/lang/Object;
.source "MoPubNativeAdPositioning.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/nativeads/MoPubNativeAdPositioning;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "MoPubClientPositioning"
.end annotation


# static fields
.field public static final NO_REPEAT:I = 0x7fffffff


# instance fields
.field private final mFixedPositions:Ljava/util/ArrayList;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private mRepeatInterval:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->mFixedPositions:Ljava/util/ArrayList;

    const v0, 0x7fffffff

    .line 44
    iput v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->mRepeatInterval:I

    return-void
.end method

.method static synthetic access$000(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)Ljava/util/ArrayList;
    .locals 0

    .line 37
    iget-object p0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->mFixedPositions:Ljava/util/ArrayList;

    return-object p0
.end method

.method static synthetic access$100(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;)I
    .locals 0

    .line 37
    iget p0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->mRepeatInterval:I

    return p0
.end method

.method static synthetic access$102(Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;I)I
    .locals 0

    .line 37
    iput p1, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->mRepeatInterval:I

    return p1
.end method


# virtual methods
.method public addFixedPosition(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 57
    :goto_0
    invoke-static {v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkArgument(Z)Z

    move-result v0

    if-nez v0, :cond_1

    return-object p0

    .line 62
    :cond_1
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->mFixedPositions:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_2

    .line 64
    iget-object v1, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->mFixedPositions:Ljava/util/ArrayList;

    xor-int/lit8 v0, v0, -0x1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, v0, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    :cond_2
    return-object p0
.end method

.method public enableRepeatingPositions(I)Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Repeating interval must be greater than 1"

    .line 88
    invoke-static {v0, v1}, Lcom/mopub/common/Preconditions$NoThrow;->checkArgument(ZLjava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const p1, 0x7fffffff

    .line 90
    iput p1, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->mRepeatInterval:I

    return-object p0

    .line 93
    :cond_1
    iput p1, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->mRepeatInterval:I

    return-object p0
.end method

.method getFixedPositions()Ljava/util/List;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 76
    iget-object v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->mFixedPositions:Ljava/util/ArrayList;

    return-object v0
.end method

.method getRepeatingInterval()I
    .locals 1

    .line 106
    iget v0, p0, Lcom/mopub/nativeads/MoPubNativeAdPositioning$MoPubClientPositioning;->mRepeatInterval:I

    return v0
.end method
