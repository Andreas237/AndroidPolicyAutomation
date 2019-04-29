.class public final enum Lio/streamroot/dna/core/monitoring/ThreatLevel;
.super Ljava/lang/Enum;
.source "ThreatLevel.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/streamroot/dna/core/monitoring/ThreatLevel;",
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
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0008\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0005\u0010\u0006j\u0002\u0008\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lio/streamroot/dna/core/monitoring/ThreatLevel;",
        "",
        "prettyName",
        "",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getPrettyName",
        "()Ljava/lang/String;",
        "UNKNOWN",
        "LOW",
        "HIGH",
        "CRITICAL",
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
.field private static final synthetic $VALUES:[Lio/streamroot/dna/core/monitoring/ThreatLevel;

.field public static final enum CRITICAL:Lio/streamroot/dna/core/monitoring/ThreatLevel;

.field public static final enum HIGH:Lio/streamroot/dna/core/monitoring/ThreatLevel;

.field public static final enum LOW:Lio/streamroot/dna/core/monitoring/ThreatLevel;

.field public static final enum UNKNOWN:Lio/streamroot/dna/core/monitoring/ThreatLevel;


# instance fields
.field private final prettyName:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x4

    new-array v0, v0, [Lio/streamroot/dna/core/monitoring/ThreatLevel;

    new-instance v1, Lio/streamroot/dna/core/monitoring/ThreatLevel;

    const-string v2, "UNKNOWN"

    const-string v3, "unknown"

    const/4 v4, 0x0

    .line 4
    invoke-direct {v1, v2, v4, v3}, Lio/streamroot/dna/core/monitoring/ThreatLevel;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lio/streamroot/dna/core/monitoring/ThreatLevel;->UNKNOWN:Lio/streamroot/dna/core/monitoring/ThreatLevel;

    aput-object v1, v0, v4

    new-instance v1, Lio/streamroot/dna/core/monitoring/ThreatLevel;

    const-string v2, "LOW"

    const-string v3, "low"

    const/4 v4, 0x1

    .line 5
    invoke-direct {v1, v2, v4, v3}, Lio/streamroot/dna/core/monitoring/ThreatLevel;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lio/streamroot/dna/core/monitoring/ThreatLevel;->LOW:Lio/streamroot/dna/core/monitoring/ThreatLevel;

    aput-object v1, v0, v4

    new-instance v1, Lio/streamroot/dna/core/monitoring/ThreatLevel;

    const-string v2, "HIGH"

    const-string v3, "high"

    const/4 v4, 0x2

    .line 6
    invoke-direct {v1, v2, v4, v3}, Lio/streamroot/dna/core/monitoring/ThreatLevel;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lio/streamroot/dna/core/monitoring/ThreatLevel;->HIGH:Lio/streamroot/dna/core/monitoring/ThreatLevel;

    aput-object v1, v0, v4

    new-instance v1, Lio/streamroot/dna/core/monitoring/ThreatLevel;

    const-string v2, "CRITICAL"

    const-string v3, "critical"

    const/4 v4, 0x3

    .line 7
    invoke-direct {v1, v2, v4, v3}, Lio/streamroot/dna/core/monitoring/ThreatLevel;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lio/streamroot/dna/core/monitoring/ThreatLevel;->CRITICAL:Lio/streamroot/dna/core/monitoring/ThreatLevel;

    aput-object v1, v0, v4

    sput-object v0, Lio/streamroot/dna/core/monitoring/ThreatLevel;->$VALUES:[Lio/streamroot/dna/core/monitoring/ThreatLevel;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "prettyName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/streamroot/dna/core/monitoring/ThreatLevel;->prettyName:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/streamroot/dna/core/monitoring/ThreatLevel;
    .locals 1

    const-class v0, Lio/streamroot/dna/core/monitoring/ThreatLevel;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/core/monitoring/ThreatLevel;

    return-object p0
.end method

.method public static values()[Lio/streamroot/dna/core/monitoring/ThreatLevel;
    .locals 1

    sget-object v0, Lio/streamroot/dna/core/monitoring/ThreatLevel;->$VALUES:[Lio/streamroot/dna/core/monitoring/ThreatLevel;

    invoke-virtual {v0}, [Lio/streamroot/dna/core/monitoring/ThreatLevel;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/streamroot/dna/core/monitoring/ThreatLevel;

    return-object v0
.end method


# virtual methods
.method public final getPrettyName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 3
    iget-object v0, p0, Lio/streamroot/dna/core/monitoring/ThreatLevel;->prettyName:Ljava/lang/String;

    return-object v0
.end method
