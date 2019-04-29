.class public interface abstract Lio/streamroot/dna/core/monitoring/Watcher;
.super Ljava/lang/Object;
.source "Watcher.kt"

# interfaces
.implements Lio/streamroot/dna/core/analytics/AnalyticsReporter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/streamroot/dna/core/monitoring/Watcher$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0008\u0010\u0006\u001a\u00020\u0007H&J\u0008\u0010\u0008\u001a\u00020\tH&R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\n"
    }
    d2 = {
        "Lio/streamroot/dna/core/monitoring/Watcher;",
        "Lio/streamroot/dna/core/analytics/AnalyticsReporter;",
        "type",
        "Lio/streamroot/dna/core/monitoring/WatchType;",
        "getType",
        "()Lio/streamroot/dna/core/monitoring/WatchType;",
        "statusPhrase",
        "",
        "watch",
        "Lio/streamroot/dna/core/monitoring/WatchResult;",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# virtual methods
.method public abstract getType()Lio/streamroot/dna/core/monitoring/WatchType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract statusPhrase()Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract watch()Lio/streamroot/dna/core/monitoring/WatchResult;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
