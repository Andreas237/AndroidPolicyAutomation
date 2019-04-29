.class public final enum Lio/streamroot/dna/core/PlaybackState;
.super Ljava/lang/Enum;
.source "QosModule.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/streamroot/dna/core/PlaybackState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lio/streamroot/dna/core/PlaybackState;",
        "",
        "(Ljava/lang/String;I)V",
        "IDLE",
        "PLAYING",
        "PAUSING",
        "BUFFERING",
        "SEEKING",
        "ENDED",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/streamroot/dna/core/PlaybackState;

.field public static final enum BUFFERING:Lio/streamroot/dna/core/PlaybackState;

.field public static final enum ENDED:Lio/streamroot/dna/core/PlaybackState;

.field public static final enum IDLE:Lio/streamroot/dna/core/PlaybackState;

.field public static final enum PAUSING:Lio/streamroot/dna/core/PlaybackState;

.field public static final enum PLAYING:Lio/streamroot/dna/core/PlaybackState;

.field public static final enum SEEKING:Lio/streamroot/dna/core/PlaybackState;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x6

    new-array v0, v0, [Lio/streamroot/dna/core/PlaybackState;

    new-instance v1, Lio/streamroot/dna/core/PlaybackState;

    const-string v2, "IDLE"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/PlaybackState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/PlaybackState;->IDLE:Lio/streamroot/dna/core/PlaybackState;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/PlaybackState;

    const-string v2, "PLAYING"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/PlaybackState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/PlaybackState;->PLAYING:Lio/streamroot/dna/core/PlaybackState;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/PlaybackState;

    const-string v2, "PAUSING"

    const/4 v3, 0x2

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/PlaybackState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/PlaybackState;->PAUSING:Lio/streamroot/dna/core/PlaybackState;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/PlaybackState;

    const-string v2, "BUFFERING"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/PlaybackState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/PlaybackState;->BUFFERING:Lio/streamroot/dna/core/PlaybackState;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/PlaybackState;

    const-string v2, "SEEKING"

    const/4 v3, 0x4

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/PlaybackState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/PlaybackState;->SEEKING:Lio/streamroot/dna/core/PlaybackState;

    aput-object v1, v0, v3

    new-instance v1, Lio/streamroot/dna/core/PlaybackState;

    const-string v2, "ENDED"

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/PlaybackState;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/PlaybackState;->ENDED:Lio/streamroot/dna/core/PlaybackState;

    aput-object v1, v0, v3

    sput-object v0, Lio/streamroot/dna/core/PlaybackState;->$VALUES:[Lio/streamroot/dna/core/PlaybackState;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/streamroot/dna/core/PlaybackState;
    .locals 1

    const-class v0, Lio/streamroot/dna/core/PlaybackState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/core/PlaybackState;

    return-object p0
.end method

.method public static values()[Lio/streamroot/dna/core/PlaybackState;
    .locals 1

    sget-object v0, Lio/streamroot/dna/core/PlaybackState;->$VALUES:[Lio/streamroot/dna/core/PlaybackState;

    invoke-virtual {v0}, [Lio/streamroot/dna/core/PlaybackState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/streamroot/dna/core/PlaybackState;

    return-object v0
.end method
