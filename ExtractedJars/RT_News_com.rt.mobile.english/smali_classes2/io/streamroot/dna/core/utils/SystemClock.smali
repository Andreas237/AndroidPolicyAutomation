.class public final Lio/streamroot/dna/core/utils/SystemClock;
.super Ljava/lang/Object;
.source "Clock.kt"

# interfaces
.implements Lio/streamroot/dna/core/utils/Clock;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"
    }
    d2 = {
        "Lio/streamroot/dna/core/utils/SystemClock;",
        "Lio/streamroot/dna/core/utils/Clock;",
        "()V",
        "currentTimeMillis",
        "",
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
.field public static final INSTANCE:Lio/streamroot/dna/core/utils/SystemClock;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 3
    new-instance v0, Lio/streamroot/dna/core/utils/SystemClock;

    invoke-direct {v0}, Lio/streamroot/dna/core/utils/SystemClock;-><init>()V

    sput-object v0, Lio/streamroot/dna/core/utils/SystemClock;->INSTANCE:Lio/streamroot/dna/core/utils/SystemClock;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public currentTimeMillis()J
    .locals 2

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method
