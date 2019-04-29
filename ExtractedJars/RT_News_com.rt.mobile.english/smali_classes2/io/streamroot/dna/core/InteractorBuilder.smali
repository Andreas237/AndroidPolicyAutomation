.class public interface abstract Lio/streamroot/dna/core/InteractorBuilder;
.super Ljava/lang/Object;
.source "DnaClientBuilder.kt"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008f\u0018\u0000*\u0006\u0008\u0000\u0010\u0001 \u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&\u00a2\u0006\u0002\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lio/streamroot/dna/core/InteractorBuilder;",
        "T",
        "",
        "playerInteractor",
        "Lio/streamroot/dna/core/PlayerInteractor;",
        "(Lio/streamroot/dna/core/PlayerInteractor;)Ljava/lang/Object;",
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
.method public abstract playerInteractor(Lio/streamroot/dna/core/PlayerInteractor;)Ljava/lang/Object;
    .param p1    # Lio/streamroot/dna/core/PlayerInteractor;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/streamroot/dna/core/PlayerInteractor;",
            ")TT;"
        }
    .end annotation
.end method
