.class public final Lio/streamroot/dna/core/utils/ExectionsKt;
.super Ljava/lang/Object;
.source "Exections.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0016\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "wrapProxyException",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "e",
        "dna-core_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method public static final wrapProxyException(Ljava/lang/Exception;)Ljava/lang/Exception;
    .locals 3
    .param p0    # Ljava/lang/Exception;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "e"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    instance-of v0, p0, Ljava/io/IOException;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    check-cast v0, Ljava/io/IOException;

    if-eqz v0, :cond_1

    :goto_1
    check-cast v0, Ljava/lang/Exception;

    goto :goto_2

    :cond_1
    new-instance v0, Lio/streamroot/dna/core/proxy/server/ResponseException;

    const/16 v1, 0x1f4

    const-string v2, "UNEXPECTED EXCEPTION"

    invoke-direct {v0, v1, v2, p0}, Lio/streamroot/dna/core/proxy/server/ResponseException;-><init>(ILjava/lang/String;Ljava/lang/Exception;)V

    goto :goto_1

    :goto_2
    return-object v0
.end method
