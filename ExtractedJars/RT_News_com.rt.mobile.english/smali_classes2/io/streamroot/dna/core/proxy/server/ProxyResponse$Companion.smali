.class public final Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;
.super Ljava/lang/Object;
.source "ProxyResponse.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/streamroot/dna/core/proxy/server/ProxyResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nProxyResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProxyResponse.kt\nio/streamroot/dna/core/proxy/server/ProxyResponse$Companion\n*L\n1#1,170:1\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0007\u00a8\u0006\n"
    }
    d2 = {
        "Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;",
        "",
        "()V",
        "newFixedLengthResponse",
        "Lio/streamroot/dna/core/proxy/server/ProxyResponse;",
        "code",
        "",
        "mimeType",
        "",
        "txt",
        "dna-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 152
    invoke-direct {p0}, Lio/streamroot/dna/core/proxy/server/ProxyResponse$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final newFixedLengthResponse(ILjava/lang/String;Ljava/lang/String;)Lio/streamroot/dna/core/proxy/server/ProxyResponse;
    .locals 8
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 155
    new-instance v0, Lio/streamroot/dna/core/proxy/server/ContentType;

    invoke-direct {v0, p2}, Lio/streamroot/dna/core/proxy/server/ContentType;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    if-nez p3, :cond_0

    .line 157
    new-instance p3, Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    new-instance v0, Ljava/io/ByteArrayInputStream;

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object v5, v0

    check-cast v5, Ljava/io/InputStream;

    const-wide/16 v6, 0x0

    move-object v2, p3

    move v3, p1

    move-object v4, p2

    invoke-direct/range {v2 .. v7}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;-><init>(ILjava/lang/String;Ljava/io/InputStream;J)V

    goto :goto_1

    .line 160
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Lio/streamroot/dna/core/proxy/server/ContentType;->getEncoding()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p3

    const-string v0, "(this as java.lang.String).getBytes(charset)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p3

    .line 162
    sget-object v0, Lio/streamroot/dna/core/log/Logger;->INSTANCE:Lio/streamroot/dna/core/log/Logger;

    check-cast p3, Ljava/lang/Throwable;

    const-string v2, "encoding problem, responding nothing"

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v0, p3, v2, v3}, Lio/streamroot/dna/core/log/Logger;->warn(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 163
    new-array p3, v1, [B

    .line 166
    :goto_0
    new-instance v6, Lio/streamroot/dna/core/proxy/server/ProxyResponse;

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, p3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    move-object v3, v0

    check-cast v3, Ljava/io/InputStream;

    array-length p3, p3

    int-to-long v4, p3

    move-object v0, v6

    move v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lio/streamroot/dna/core/proxy/server/ProxyResponse;-><init>(ILjava/lang/String;Ljava/io/InputStream;J)V

    move-object p3, v6

    :goto_1
    return-object p3
.end method
