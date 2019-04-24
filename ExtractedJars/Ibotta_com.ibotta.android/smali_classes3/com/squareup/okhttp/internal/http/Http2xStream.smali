.class public final Lcom/squareup/okhttp/internal/http/Http2xStream;
.super Ljava/lang/Object;
.source "Http2xStream.java"

# interfaces
.implements Lcom/squareup/okhttp/internal/http/HttpStream;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/http/Http2xStream$StreamFinishingSource;
    }
.end annotation


# static fields
.field private static final CONNECTION:Lokio/ByteString;

.field private static final ENCODING:Lokio/ByteString;

.field private static final HOST:Lokio/ByteString;

.field private static final HTTP_2_SKIPPED_REQUEST_HEADERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokio/ByteString;",
            ">;"
        }
    .end annotation
.end field

.field private static final HTTP_2_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokio/ByteString;",
            ">;"
        }
    .end annotation
.end field

.field private static final KEEP_ALIVE:Lokio/ByteString;

.field private static final PROXY_CONNECTION:Lokio/ByteString;

.field private static final SPDY_3_SKIPPED_REQUEST_HEADERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokio/ByteString;",
            ">;"
        }
    .end annotation
.end field

.field private static final SPDY_3_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lokio/ByteString;",
            ">;"
        }
    .end annotation
.end field

.field private static final TE:Lokio/ByteString;

.field private static final TRANSFER_ENCODING:Lokio/ByteString;

.field private static final UPGRADE:Lokio/ByteString;


# instance fields
.field private final framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

.field private httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

.field private stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

.field private final streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    const-string v0, "connection"

    .line 53
    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/Http2xStream;->CONNECTION:Lokio/ByteString;

    const-string v0, "host"

    .line 54
    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/Http2xStream;->HOST:Lokio/ByteString;

    const-string v0, "keep-alive"

    .line 55
    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/Http2xStream;->KEEP_ALIVE:Lokio/ByteString;

    const-string v0, "proxy-connection"

    .line 56
    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/Http2xStream;->PROXY_CONNECTION:Lokio/ByteString;

    const-string v0, "transfer-encoding"

    .line 57
    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/Http2xStream;->TRANSFER_ENCODING:Lokio/ByteString;

    const-string v0, "te"

    .line 58
    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/Http2xStream;->TE:Lokio/ByteString;

    const-string v0, "encoding"

    .line 59
    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/Http2xStream;->ENCODING:Lokio/ByteString;

    const-string v0, "upgrade"

    .line 60
    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/Http2xStream;->UPGRADE:Lokio/ByteString;

    const/16 v0, 0xb

    .line 63
    new-array v1, v0, [Lokio/ByteString;

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->CONNECTION:Lokio/ByteString;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->HOST:Lokio/ByteString;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->KEEP_ALIVE:Lokio/ByteString;

    const/4 v5, 0x2

    aput-object v2, v1, v5

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->PROXY_CONNECTION:Lokio/ByteString;

    const/4 v6, 0x3

    aput-object v2, v1, v6

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->TRANSFER_ENCODING:Lokio/ByteString;

    const/4 v7, 0x4

    aput-object v2, v1, v7

    sget-object v2, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_METHOD:Lokio/ByteString;

    const/4 v8, 0x5

    aput-object v2, v1, v8

    sget-object v2, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_PATH:Lokio/ByteString;

    const/4 v9, 0x6

    aput-object v2, v1, v9

    sget-object v2, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_SCHEME:Lokio/ByteString;

    const/4 v10, 0x7

    aput-object v2, v1, v10

    sget-object v2, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_AUTHORITY:Lokio/ByteString;

    const/16 v11, 0x8

    aput-object v2, v1, v11

    sget-object v2, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_HOST:Lokio/ByteString;

    const/16 v12, 0x9

    aput-object v2, v1, v12

    sget-object v2, Lcom/squareup/okhttp/internal/framed/Header;->VERSION:Lokio/ByteString;

    const/16 v13, 0xa

    aput-object v2, v1, v13

    invoke-static {v1}, Lcom/squareup/okhttp/internal/Util;->immutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/squareup/okhttp/internal/http/Http2xStream;->SPDY_3_SKIPPED_REQUEST_HEADERS:Ljava/util/List;

    .line 75
    new-array v1, v8, [Lokio/ByteString;

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->CONNECTION:Lokio/ByteString;

    aput-object v2, v1, v3

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->HOST:Lokio/ByteString;

    aput-object v2, v1, v4

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->KEEP_ALIVE:Lokio/ByteString;

    aput-object v2, v1, v5

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->PROXY_CONNECTION:Lokio/ByteString;

    aput-object v2, v1, v6

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->TRANSFER_ENCODING:Lokio/ByteString;

    aput-object v2, v1, v7

    invoke-static {v1}, Lcom/squareup/okhttp/internal/Util;->immutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Lcom/squareup/okhttp/internal/http/Http2xStream;->SPDY_3_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;

    const/16 v1, 0xe

    .line 83
    new-array v1, v1, [Lokio/ByteString;

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->CONNECTION:Lokio/ByteString;

    aput-object v2, v1, v3

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->HOST:Lokio/ByteString;

    aput-object v2, v1, v4

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->KEEP_ALIVE:Lokio/ByteString;

    aput-object v2, v1, v5

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->PROXY_CONNECTION:Lokio/ByteString;

    aput-object v2, v1, v6

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->TE:Lokio/ByteString;

    aput-object v2, v1, v7

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->TRANSFER_ENCODING:Lokio/ByteString;

    aput-object v2, v1, v8

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->ENCODING:Lokio/ByteString;

    aput-object v2, v1, v9

    sget-object v2, Lcom/squareup/okhttp/internal/http/Http2xStream;->UPGRADE:Lokio/ByteString;

    aput-object v2, v1, v10

    sget-object v2, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_METHOD:Lokio/ByteString;

    aput-object v2, v1, v11

    sget-object v2, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_PATH:Lokio/ByteString;

    aput-object v2, v1, v12

    sget-object v2, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_SCHEME:Lokio/ByteString;

    aput-object v2, v1, v13

    sget-object v2, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_AUTHORITY:Lokio/ByteString;

    aput-object v2, v1, v0

    sget-object v0, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_HOST:Lokio/ByteString;

    const/16 v2, 0xc

    aput-object v0, v1, v2

    sget-object v0, Lcom/squareup/okhttp/internal/framed/Header;->VERSION:Lokio/ByteString;

    const/16 v2, 0xd

    aput-object v0, v1, v2

    invoke-static {v1}, Lcom/squareup/okhttp/internal/Util;->immutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/Http2xStream;->HTTP_2_SKIPPED_REQUEST_HEADERS:Ljava/util/List;

    .line 98
    new-array v0, v11, [Lokio/ByteString;

    sget-object v1, Lcom/squareup/okhttp/internal/http/Http2xStream;->CONNECTION:Lokio/ByteString;

    aput-object v1, v0, v3

    sget-object v1, Lcom/squareup/okhttp/internal/http/Http2xStream;->HOST:Lokio/ByteString;

    aput-object v1, v0, v4

    sget-object v1, Lcom/squareup/okhttp/internal/http/Http2xStream;->KEEP_ALIVE:Lokio/ByteString;

    aput-object v1, v0, v5

    sget-object v1, Lcom/squareup/okhttp/internal/http/Http2xStream;->PROXY_CONNECTION:Lokio/ByteString;

    aput-object v1, v0, v6

    sget-object v1, Lcom/squareup/okhttp/internal/http/Http2xStream;->TE:Lokio/ByteString;

    aput-object v1, v0, v7

    sget-object v1, Lcom/squareup/okhttp/internal/http/Http2xStream;->TRANSFER_ENCODING:Lokio/ByteString;

    aput-object v1, v0, v8

    sget-object v1, Lcom/squareup/okhttp/internal/http/Http2xStream;->ENCODING:Lokio/ByteString;

    aput-object v1, v0, v9

    sget-object v1, Lcom/squareup/okhttp/internal/http/Http2xStream;->UPGRADE:Lokio/ByteString;

    aput-object v1, v0, v10

    invoke-static {v0}, Lcom/squareup/okhttp/internal/Util;->immutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/http/Http2xStream;->HTTP_2_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/squareup/okhttp/internal/http/StreamAllocation;Lcom/squareup/okhttp/internal/framed/FramedConnection;)V
    .locals 0

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    .line 115
    iput-object p2, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    return-void
.end method

.method static synthetic access$000(Lcom/squareup/okhttp/internal/http/Http2xStream;)Lcom/squareup/okhttp/internal/http/StreamAllocation;
    .locals 0

    .line 52
    iget-object p0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->streamAllocation:Lcom/squareup/okhttp/internal/http/StreamAllocation;

    return-object p0
.end method

.method public static http2HeadersList(Lcom/squareup/okhttp/Request;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/okhttp/Request;",
            ")",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;"
        }
    .end annotation

    .line 200
    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    .line 201
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x4

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 202
    new-instance v2, Lcom/squareup/okhttp/internal/framed/Header;

    sget-object v3, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_METHOD:Lokio/ByteString;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    new-instance v2, Lcom/squareup/okhttp/internal/framed/Header;

    sget-object v3, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_PATH:Lokio/ByteString;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v4

    invoke-static {v4}, Lcom/squareup/okhttp/internal/http/RequestLine;->requestPath(Lcom/squareup/okhttp/HttpUrl;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    new-instance v2, Lcom/squareup/okhttp/internal/framed/Header;

    sget-object v3, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_AUTHORITY:Lokio/ByteString;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v4

    invoke-static {v4}, Lcom/squareup/okhttp/internal/Util;->hostHeader(Lcom/squareup/okhttp/HttpUrl;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 205
    new-instance v2, Lcom/squareup/okhttp/internal/framed/Header;

    sget-object v3, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_SCHEME:Lokio/ByteString;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object p0

    invoke-virtual {p0}, Lcom/squareup/okhttp/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, v3, p0}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 207
    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers;->size()I

    move-result p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p0, :cond_1

    .line 209
    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/Headers;->name(I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v3

    .line 210
    sget-object v4, Lcom/squareup/okhttp/internal/http/Http2xStream;->HTTP_2_SKIPPED_REQUEST_HEADERS:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 211
    new-instance v4, Lcom/squareup/okhttp/internal/framed/Header;

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/Headers;->value(I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private static joinOnNull(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static readHttp2HeadersList(Ljava/util/List;)Lcom/squareup/okhttp/Response$Builder;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;)",
            "Lcom/squareup/okhttp/Response$Builder;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 256
    new-instance v0, Lcom/squareup/okhttp/Headers$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/Headers$Builder;-><init>()V

    .line 257
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    .line 258
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/squareup/okhttp/internal/framed/Header;

    iget-object v4, v4, Lcom/squareup/okhttp/internal/framed/Header;->name:Lokio/ByteString;

    .line 260
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/squareup/okhttp/internal/framed/Header;

    iget-object v5, v5, Lcom/squareup/okhttp/internal/framed/Header;->value:Lokio/ByteString;

    invoke-virtual {v5}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v5

    .line 261
    sget-object v6, Lcom/squareup/okhttp/internal/framed/Header;->RESPONSE_STATUS:Lokio/ByteString;

    invoke-virtual {v4, v6}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move-object v2, v5

    goto :goto_1

    .line 263
    :cond_0
    sget-object v6, Lcom/squareup/okhttp/internal/http/Http2xStream;->HTTP_2_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;

    invoke-interface {v6, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 264
    invoke-virtual {v4}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4, v5}, Lcom/squareup/okhttp/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    if-eqz v2, :cond_3

    .line 269
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HTTP/1.1 "

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/squareup/okhttp/internal/http/StatusLine;->parse(Ljava/lang/String;)Lcom/squareup/okhttp/internal/http/StatusLine;

    move-result-object p0

    .line 270
    new-instance v1, Lcom/squareup/okhttp/Response$Builder;

    invoke-direct {v1}, Lcom/squareup/okhttp/Response$Builder;-><init>()V

    sget-object v2, Lcom/squareup/okhttp/Protocol;->HTTP_2:Lcom/squareup/okhttp/Protocol;

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->protocol(Lcom/squareup/okhttp/Protocol;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    iget v2, p0, Lcom/squareup/okhttp/internal/http/StatusLine;->code:I

    invoke-virtual {v1, v2}, Lcom/squareup/okhttp/Response$Builder;->code(I)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v1

    iget-object p0, p0, Lcom/squareup/okhttp/internal/http/StatusLine;->message:Ljava/lang/String;

    invoke-virtual {v1, p0}, Lcom/squareup/okhttp/Response$Builder;->message(Ljava/lang/String;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p0

    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers$Builder;->build()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/Response$Builder;->headers(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p0

    return-object p0

    .line 267
    :cond_3
    new-instance p0, Ljava/net/ProtocolException;

    const-string v0, "Expected \':status\' header not present"

    invoke-direct {p0, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static readSpdy3HeadersList(Ljava/util/List;)Lcom/squareup/okhttp/Response$Builder;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;)",
            "Lcom/squareup/okhttp/Response$Builder;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "HTTP/1.1"

    .line 221
    new-instance v1, Lcom/squareup/okhttp/Headers$Builder;

    invoke-direct {v1}, Lcom/squareup/okhttp/Headers$Builder;-><init>()V

    .line 222
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v0

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_5

    .line 223
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/squareup/okhttp/internal/framed/Header;

    iget-object v6, v6, Lcom/squareup/okhttp/internal/framed/Header;->name:Lokio/ByteString;

    .line 225
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/squareup/okhttp/internal/framed/Header;

    iget-object v7, v7, Lcom/squareup/okhttp/internal/framed/Header;->value:Lokio/ByteString;

    invoke-virtual {v7}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v7

    move-object v8, v5

    move-object v5, v4

    const/4 v4, 0x0

    .line 226
    :goto_1
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    if-ge v4, v9, :cond_4

    .line 227
    invoke-virtual {v7, v3, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_0

    .line 229
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v9

    .line 231
    :cond_0
    invoke-virtual {v7, v4, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    .line 232
    sget-object v10, Lcom/squareup/okhttp/internal/framed/Header;->RESPONSE_STATUS:Lokio/ByteString;

    invoke-virtual {v6, v10}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    move-object v5, v4

    goto :goto_2

    .line 234
    :cond_1
    sget-object v10, Lcom/squareup/okhttp/internal/framed/Header;->VERSION:Lokio/ByteString;

    invoke-virtual {v6, v10}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    move-object v8, v4

    goto :goto_2

    .line 236
    :cond_2
    sget-object v10, Lcom/squareup/okhttp/internal/http/Http2xStream;->SPDY_3_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;

    invoke-interface {v10, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    .line 237
    invoke-virtual {v6}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1, v10, v4}, Lcom/squareup/okhttp/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/okhttp/Headers$Builder;

    :cond_3
    :goto_2
    add-int/lit8 v4, v9, 0x1

    goto :goto_1

    :cond_4
    add-int/lit8 v0, v0, 0x1

    move-object v4, v5

    move-object v5, v8

    goto :goto_0

    :cond_5
    if-eqz v4, :cond_6

    .line 244
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/squareup/okhttp/internal/http/StatusLine;->parse(Ljava/lang/String;)Lcom/squareup/okhttp/internal/http/StatusLine;

    move-result-object p0

    .line 245
    new-instance v0, Lcom/squareup/okhttp/Response$Builder;

    invoke-direct {v0}, Lcom/squareup/okhttp/Response$Builder;-><init>()V

    sget-object v2, Lcom/squareup/okhttp/Protocol;->SPDY_3:Lcom/squareup/okhttp/Protocol;

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/Response$Builder;->protocol(Lcom/squareup/okhttp/Protocol;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    iget v2, p0, Lcom/squareup/okhttp/internal/http/StatusLine;->code:I

    invoke-virtual {v0, v2}, Lcom/squareup/okhttp/Response$Builder;->code(I)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    iget-object p0, p0, Lcom/squareup/okhttp/internal/http/StatusLine;->message:Ljava/lang/String;

    invoke-virtual {v0, p0}, Lcom/squareup/okhttp/Response$Builder;->message(Ljava/lang/String;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p0

    invoke-virtual {v1}, Lcom/squareup/okhttp/Headers$Builder;->build()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/squareup/okhttp/Response$Builder;->headers(Lcom/squareup/okhttp/Headers;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object p0

    return-object p0

    .line 242
    :cond_6
    new-instance p0, Ljava/net/ProtocolException;

    const-string v0, "Expected \':status\' header not present"

    invoke-direct {p0, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static spdy3HeadersList(Lcom/squareup/okhttp/Request;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/squareup/okhttp/Request;",
            ")",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;"
        }
    .end annotation

    .line 160
    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object v0

    .line 161
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x5

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 162
    new-instance v2, Lcom/squareup/okhttp/internal/framed/Header;

    sget-object v3, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_METHOD:Lokio/ByteString;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->method()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    new-instance v2, Lcom/squareup/okhttp/internal/framed/Header;

    sget-object v3, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_PATH:Lokio/ByteString;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v4

    invoke-static {v4}, Lcom/squareup/okhttp/internal/http/RequestLine;->requestPath(Lcom/squareup/okhttp/HttpUrl;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    new-instance v2, Lcom/squareup/okhttp/internal/framed/Header;

    sget-object v3, Lcom/squareup/okhttp/internal/framed/Header;->VERSION:Lokio/ByteString;

    const-string v4, "HTTP/1.1"

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    new-instance v2, Lcom/squareup/okhttp/internal/framed/Header;

    sget-object v3, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_HOST:Lokio/ByteString;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object v4

    invoke-static {v4}, Lcom/squareup/okhttp/internal/Util;->hostHeader(Lcom/squareup/okhttp/HttpUrl;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    new-instance v2, Lcom/squareup/okhttp/internal/framed/Header;

    sget-object v3, Lcom/squareup/okhttp/internal/framed/Header;->TARGET_SCHEME:Lokio/ByteString;

    invoke-virtual {p0}, Lcom/squareup/okhttp/Request;->httpUrl()Lcom/squareup/okhttp/HttpUrl;

    move-result-object p0

    invoke-virtual {p0}, Lcom/squareup/okhttp/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, v3, p0}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 168
    new-instance p0, Ljava/util/LinkedHashSet;

    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 169
    invoke-virtual {v0}, Lcom/squareup/okhttp/Headers;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    .line 171
    invoke-virtual {v0, v4}, Lcom/squareup/okhttp/Headers;->name(I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v5

    .line 174
    sget-object v6, Lcom/squareup/okhttp/internal/http/Http2xStream;->SPDY_3_SKIPPED_REQUEST_HEADERS:Ljava/util/List;

    invoke-interface {v6, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_2

    .line 177
    :cond_0
    invoke-virtual {v0, v4}, Lcom/squareup/okhttp/Headers;->value(I)Ljava/lang/String;

    move-result-object v6

    .line 178
    invoke-interface {p0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 179
    new-instance v7, Lcom/squareup/okhttp/internal/framed/Header;

    invoke-direct {v7, v5, v6}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    const/4 v7, 0x0

    .line 184
    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_3

    .line 185
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/squareup/okhttp/internal/framed/Header;

    iget-object v8, v8, Lcom/squareup/okhttp/internal/framed/Header;->name:Lokio/ByteString;

    invoke-virtual {v8, v5}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    .line 186
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/squareup/okhttp/internal/framed/Header;

    iget-object v8, v8, Lcom/squareup/okhttp/internal/framed/Header;->value:Lokio/ByteString;

    invoke-virtual {v8}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v6}, Lcom/squareup/okhttp/internal/http/Http2xStream;->joinOnNull(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 187
    new-instance v8, Lcom/squareup/okhttp/internal/framed/Header;

    invoke-direct {v8, v5, v6}, Lcom/squareup/okhttp/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v1, v7, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    return-object v1
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 283
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

    if-eqz v0, :cond_0

    sget-object v1, Lcom/squareup/okhttp/internal/framed/ErrorCode;->CANCEL:Lcom/squareup/okhttp/internal/framed/ErrorCode;

    invoke-virtual {v0, v1}, Lcom/squareup/okhttp/internal/framed/FramedStream;->closeLater(Lcom/squareup/okhttp/internal/framed/ErrorCode;)V

    :cond_0
    return-void
.end method

.method public createRequestBody(Lcom/squareup/okhttp/Request;J)Lokio/Sink;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 123
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/framed/FramedStream;->getSink()Lokio/Sink;

    move-result-object p1

    return-object p1
.end method

.method public finishRequest()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 145
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->getSink()Lokio/Sink;

    move-result-object v0

    invoke-interface {v0}, Lokio/Sink;->close()V

    return-void
.end method

.method public openResponseBody(Lcom/squareup/okhttp/Response;)Lcom/squareup/okhttp/ResponseBody;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 278
    new-instance v0, Lcom/squareup/okhttp/internal/http/Http2xStream$StreamFinishingSource;

    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/framed/FramedStream;->getSource()Lokio/Source;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/squareup/okhttp/internal/http/Http2xStream$StreamFinishingSource;-><init>(Lcom/squareup/okhttp/internal/http/Http2xStream;Lokio/Source;)V

    .line 279
    new-instance v1, Lcom/squareup/okhttp/internal/http/RealResponseBody;

    invoke-virtual {p1}, Lcom/squareup/okhttp/Response;->headers()Lcom/squareup/okhttp/Headers;

    move-result-object p1

    invoke-static {v0}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Lcom/squareup/okhttp/internal/http/RealResponseBody;-><init>(Lcom/squareup/okhttp/Headers;Lokio/BufferedSource;)V

    return-object v1
.end method

.method public readResponseHeaders()Lcom/squareup/okhttp/Response$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 149
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->getProtocol()Lcom/squareup/okhttp/Protocol;

    move-result-object v0

    sget-object v1, Lcom/squareup/okhttp/Protocol;->HTTP_2:Lcom/squareup/okhttp/Protocol;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->getResponseHeaders()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/Http2xStream;->readHttp2HeadersList(Ljava/util/List;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->getResponseHeaders()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lcom/squareup/okhttp/internal/http/Http2xStream;->readSpdy3HeadersList(Ljava/util/List;)Lcom/squareup/okhttp/Response$Builder;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public setHttpEngine(Lcom/squareup/okhttp/internal/http/HttpEngine;)V
    .locals 0

    .line 119
    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    return-void
.end method

.method public writeRequestBody(Lcom/squareup/okhttp/internal/http/RetryableSink;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 141
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/framed/FramedStream;->getSink()Lokio/Sink;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/squareup/okhttp/internal/http/RetryableSink;->writeToSocket(Lokio/Sink;)V

    return-void
.end method

.method public writeRequestHeaders(Lcom/squareup/okhttp/Request;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 127
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

    if-eqz v0, :cond_0

    return-void

    .line 129
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0}, Lcom/squareup/okhttp/internal/http/HttpEngine;->writingRequestHeaders()V

    .line 130
    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    invoke-virtual {v0, p1}, Lcom/squareup/okhttp/internal/http/HttpEngine;->permitsRequestBody(Lcom/squareup/okhttp/Request;)Z

    move-result v0

    .line 131
    iget-object v1, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    invoke-virtual {v1}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->getProtocol()Lcom/squareup/okhttp/Protocol;

    move-result-object v1

    sget-object v2, Lcom/squareup/okhttp/Protocol;->HTTP_2:Lcom/squareup/okhttp/Protocol;

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lcom/squareup/okhttp/internal/http/Http2xStream;->http2HeadersList(Lcom/squareup/okhttp/Request;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lcom/squareup/okhttp/internal/http/Http2xStream;->spdy3HeadersList(Lcom/squareup/okhttp/Request;)Ljava/util/List;

    move-result-object p1

    :goto_0
    const/4 v1, 0x1

    .line 135
    iget-object v2, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->framedConnection:Lcom/squareup/okhttp/internal/framed/FramedConnection;

    invoke-virtual {v2, p1, v0, v1}, Lcom/squareup/okhttp/internal/framed/FramedConnection;->newStream(Ljava/util/List;ZZ)Lcom/squareup/okhttp/internal/framed/FramedStream;

    move-result-object p1

    iput-object p1, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

    .line 136
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/framed/FramedStream;->readTimeout()Lokio/Timeout;

    move-result-object p1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getReadTimeout()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 137
    iget-object p1, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->stream:Lcom/squareup/okhttp/internal/framed/FramedStream;

    invoke-virtual {p1}, Lcom/squareup/okhttp/internal/framed/FramedStream;->writeTimeout()Lokio/Timeout;

    move-result-object p1

    iget-object v0, p0, Lcom/squareup/okhttp/internal/http/Http2xStream;->httpEngine:Lcom/squareup/okhttp/internal/http/HttpEngine;

    iget-object v0, v0, Lcom/squareup/okhttp/internal/http/HttpEngine;->client:Lcom/squareup/okhttp/OkHttpClient;

    invoke-virtual {v0}, Lcom/squareup/okhttp/OkHttpClient;->getWriteTimeout()I

    move-result v0

    int-to-long v0, v0

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    return-void
.end method
