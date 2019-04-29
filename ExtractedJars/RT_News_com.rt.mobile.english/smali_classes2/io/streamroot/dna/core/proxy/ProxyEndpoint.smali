.class public interface abstract Lio/streamroot/dna/core/proxy/ProxyEndpoint;
.super Ljava/lang/Object;
.source "ProxyEndpoint.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tH&\u00a8\u0006\n"
    }
    d2 = {
        "Lio/streamroot/dna/core/proxy/ProxyEndpoint;",
        "",
        "accept",
        "",
        "url",
        "",
        "execute",
        "Lio/streamroot/dna/core/proxy/server/ProxyResponse;",
        "request",
        "Lio/streamroot/dna/core/proxy/server/ProxyRequest;",
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
.method public abstract accept(Ljava/lang/String;)Z
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
.end method

.method public abstract execute(Lio/streamroot/dna/core/proxy/server/ProxyRequest;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .param p1    # Lio/streamroot/dna/core/proxy/server/ProxyRequest;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
