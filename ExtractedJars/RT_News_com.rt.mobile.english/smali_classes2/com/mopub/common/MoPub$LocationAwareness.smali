.class public final enum Lcom/mopub/common/MoPub$LocationAwareness;
.super Ljava/lang/Enum;
.source "MoPub.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/mopub/common/MoPub;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LocationAwareness"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/mopub/common/MoPub$LocationAwareness;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/mopub/common/MoPub$LocationAwareness;

.field public static final enum DISABLED:Lcom/mopub/common/MoPub$LocationAwareness;

.field public static final enum NORMAL:Lcom/mopub/common/MoPub$LocationAwareness;

.field public static final enum TRUNCATED:Lcom/mopub/common/MoPub$LocationAwareness;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 14
    new-instance v0, Lcom/mopub/common/MoPub$LocationAwareness;

    const-string v1, "NORMAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/mopub/common/MoPub$LocationAwareness;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->NORMAL:Lcom/mopub/common/MoPub$LocationAwareness;

    new-instance v0, Lcom/mopub/common/MoPub$LocationAwareness;

    const-string v1, "TRUNCATED"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3}, Lcom/mopub/common/MoPub$LocationAwareness;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->TRUNCATED:Lcom/mopub/common/MoPub$LocationAwareness;

    new-instance v0, Lcom/mopub/common/MoPub$LocationAwareness;

    const-string v1, "DISABLED"

    const/4 v4, 0x2

    invoke-direct {v0, v1, v4}, Lcom/mopub/common/MoPub$LocationAwareness;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->DISABLED:Lcom/mopub/common/MoPub$LocationAwareness;

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/mopub/common/MoPub$LocationAwareness;

    sget-object v1, Lcom/mopub/common/MoPub$LocationAwareness;->NORMAL:Lcom/mopub/common/MoPub$LocationAwareness;

    aput-object v1, v0, v2

    sget-object v1, Lcom/mopub/common/MoPub$LocationAwareness;->TRUNCATED:Lcom/mopub/common/MoPub$LocationAwareness;

    aput-object v1, v0, v3

    sget-object v1, Lcom/mopub/common/MoPub$LocationAwareness;->DISABLED:Lcom/mopub/common/MoPub$LocationAwareness;

    aput-object v1, v0, v4

    sput-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->$VALUES:[Lcom/mopub/common/MoPub$LocationAwareness;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 14
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/mopub/common/MoPub$LocationAwareness;
    .locals 1

    .line 14
    const-class v0, Lcom/mopub/common/MoPub$LocationAwareness;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/mopub/common/MoPub$LocationAwareness;

    return-object p0
.end method

.method public static values()[Lcom/mopub/common/MoPub$LocationAwareness;
    .locals 1

    .line 14
    sget-object v0, Lcom/mopub/common/MoPub$LocationAwareness;->$VALUES:[Lcom/mopub/common/MoPub$LocationAwareness;

    invoke-virtual {v0}, [Lcom/mopub/common/MoPub$LocationAwareness;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/mopub/common/MoPub$LocationAwareness;

    return-object v0
.end method
