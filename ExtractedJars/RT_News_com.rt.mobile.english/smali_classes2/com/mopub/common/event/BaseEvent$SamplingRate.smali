.class public final enum Lcom/mopub/common/event/BaseEvent$SamplingRate;
.super Ljava/lang/Enum;
.source "BaseEvent.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/event/BaseEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SamplingRate"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/common/event/BaseEvent$SamplingRate;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/common/event/BaseEvent$SamplingRate;

.field public static final enum AD_INTERACTIONS:Lcom/mopub/common/event/BaseEvent$SamplingRate;

.field public static final enum AD_REQUEST:Lcom/mopub/common/event/BaseEvent$SamplingRate;

.field public static final enum NATIVE_VIDEO:Lcom/mopub/common/event/BaseEvent$SamplingRate;


# instance fields
.field private final mSamplingRate:D


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 109
    new-instance v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;

    const-string v1, "AD_REQUEST"

    const/4 v2, 0x0

    const-wide v3, 0x3fb999999999999aL    # 0.1

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/mopub/common/event/BaseEvent$SamplingRate;-><init>(Ljava/lang/String;ID)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->AD_REQUEST:Lcom/mopub/common/event/BaseEvent$SamplingRate;

    .line 110
    new-instance v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;

    const-string v1, "NATIVE_VIDEO"

    const/4 v5, 0x1

    invoke-direct {v0, v1, v5, v3, v4}, Lcom/mopub/common/event/BaseEvent$SamplingRate;-><init>(Ljava/lang/String;ID)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->NATIVE_VIDEO:Lcom/mopub/common/event/BaseEvent$SamplingRate;

    .line 111
    new-instance v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;

    const-string v1, "AD_INTERACTIONS"

    const/4 v6, 0x2

    invoke-direct {v0, v1, v6, v3, v4}, Lcom/mopub/common/event/BaseEvent$SamplingRate;-><init>(Ljava/lang/String;ID)V

    sput-object v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->AD_INTERACTIONS:Lcom/mopub/common/event/BaseEvent$SamplingRate;

    const/4 v0, 0x3

    .line 108
    new-array v0, v0, [Lcom/mopub/common/event/BaseEvent$SamplingRate;

    sget-object v1, Lcom/mopub/common/event/BaseEvent$SamplingRate;->AD_REQUEST:Lcom/mopub/common/event/BaseEvent$SamplingRate;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/common/event/BaseEvent$SamplingRate;->NATIVE_VIDEO:Lcom/mopub/common/event/BaseEvent$SamplingRate;

    aput-object v1, v0, v5

    sget-object v1, Lcom/mopub/common/event/BaseEvent$SamplingRate;->AD_INTERACTIONS:Lcom/mopub/common/event/BaseEvent$SamplingRate;

    aput-object v1, v0, v6

    sput-object v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->$VALUES:[Lcom/mopub/common/event/BaseEvent$SamplingRate;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ID)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)V"
        }
    .end annotation

    .line 115
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 116
    iput-wide p3, p0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->mSamplingRate:D

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/event/BaseEvent$SamplingRate;
    .locals 1

    .line 108
    const-class v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/common/event/BaseEvent$SamplingRate;

    return-object p0
.end method

.method public static values()[Lcom/mopub/common/event/BaseEvent$SamplingRate;
    .locals 1

    .line 108
    sget-object v0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->$VALUES:[Lcom/mopub/common/event/BaseEvent$SamplingRate;

    invoke-virtual {v0}, [Lcom/mopub/common/event/BaseEvent$SamplingRate;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/event/BaseEvent$SamplingRate;

    return-object v0
.end method


# virtual methods
.method public getSamplingRate()D
    .locals 2

    .line 120
    iget-wide v0, p0, Lcom/mopub/common/event/BaseEvent$SamplingRate;->mSamplingRate:D

    return-wide v0
.end method
