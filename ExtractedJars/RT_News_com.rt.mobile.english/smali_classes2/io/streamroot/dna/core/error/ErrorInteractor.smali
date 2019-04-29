.class public final Lio/streamroot/dna/core/error/ErrorInteractor;
.super Ljava/lang/Object;
.source "ErrorInteractor.kt"

# interfaces
.implements Lio/streamroot/dna/core/js/PanamaInteractor;


# annotations
.annotation runtime Lio/streamroot/dna/core/context/bean/DnaBean;
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008H\u0007J\u0008\u0010\t\u001a\u00020\u0008H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lio/streamroot/dna/core/error/ErrorInteractor;",
        "Lio/streamroot/dna/core/js/PanamaInteractor;",
        "errorAggregator",
        "Lio/streamroot/dna/core/error/ErrorAggregator;",
        "(Lio/streamroot/dna/core/error/ErrorAggregator;)V",
        "error",
        "",
        "message",
        "",
        "name",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# instance fields
.field private final errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;


# direct methods
.method public constructor <init>(Lio/streamroot/dna/core/error/ErrorAggregator;)V
    .locals 1
    .param p1    # Lio/streamroot/dna/core/error/ErrorAggregator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "errorAggregator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/streamroot/dna/core/error/ErrorInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    return-void
.end method


# virtual methods
.method public final error(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    iget-object v0, p0, Lio/streamroot/dna/core/error/ErrorInteractor;->errorAggregator:Lio/streamroot/dna/core/error/ErrorAggregator;

    invoke-virtual {v0, p1}, Lio/streamroot/dna/core/error/ErrorAggregator;->jsError(Ljava/lang/String;)V

    return-void
.end method

.method public name()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "ErrorInteractor"

    return-object v0
.end method
