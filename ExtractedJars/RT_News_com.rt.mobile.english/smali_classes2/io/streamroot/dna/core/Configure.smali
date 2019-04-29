.class public interface abstract Lio/streamroot/dna/core/Configure;
.super Ljava/lang/Object;
.source "DnaClientBuilder.kt"

# interfaces
.implements Lio/streamroot/dna/core/OptionalConfigBuilder;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0002\u0008\u0006H&\u00a8\u0006\u0007"
    }
    d2 = {
        "Lio/streamroot/dna/core/Configure;",
        "Lio/streamroot/dna/core/OptionalConfigBuilder;",
        "configure",
        "Lio/streamroot/dna/core/DnaClient;",
        "init",
        "Lkotlin/Function1;",
        "Lkotlin/ExtensionFunctionType;",
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
.method public abstract configure(Lkotlin/jvm/functions/Function1;)Lio/streamroot/dna/core/DnaClient;
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lio/streamroot/dna/core/OptionalConfigBuilder;",
            "Lio/streamroot/dna/core/DnaClient;",
            ">;)",
            "Lio/streamroot/dna/core/DnaClient;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
