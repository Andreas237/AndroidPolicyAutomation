.class public final enum Lio/streamroot/dna/core/monitoring/WatchType;
.super Ljava/lang/Enum;
.source "Watcher.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/streamroot/dna/core/monitoring/WatchType;",
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0003\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\u0008\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lio/streamroot/dna/core/monitoring/WatchType;",
        "",
        "(Ljava/lang/String;I)V",
        "MEMORY",
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
.field private static final synthetic $VALUES:[Lio/streamroot/dna/core/monitoring/WatchType;

.field public static final enum MEMORY:Lio/streamroot/dna/core/monitoring/WatchType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x1

    new-array v0, v0, [Lio/streamroot/dna/core/monitoring/WatchType;

    new-instance v1, Lio/streamroot/dna/core/monitoring/WatchType;

    const-string v2, "MEMORY"

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lio/streamroot/dna/core/monitoring/WatchType;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/streamroot/dna/core/monitoring/WatchType;->MEMORY:Lio/streamroot/dna/core/monitoring/WatchType;

    aput-object v1, v0, v3

    sput-object v0, Lio/streamroot/dna/core/monitoring/WatchType;->$VALUES:[Lio/streamroot/dna/core/monitoring/WatchType;

    return-void
.end method

.method protected constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 33
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/streamroot/dna/core/monitoring/WatchType;
    .locals 1

    const-class v0, Lio/streamroot/dna/core/monitoring/WatchType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/streamroot/dna/core/monitoring/WatchType;

    return-object p0
.end method

.method public static values()[Lio/streamroot/dna/core/monitoring/WatchType;
    .locals 1

    sget-object v0, Lio/streamroot/dna/core/monitoring/WatchType;->$VALUES:[Lio/streamroot/dna/core/monitoring/WatchType;

    invoke-virtual {v0}, [Lio/streamroot/dna/core/monitoring/WatchType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/streamroot/dna/core/monitoring/WatchType;

    return-object v0
.end method
