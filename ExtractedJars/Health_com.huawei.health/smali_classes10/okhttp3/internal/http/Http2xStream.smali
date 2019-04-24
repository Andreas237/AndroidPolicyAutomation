.class public final Lokhttp3/internal/http/Http2xStream;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/internal/http/HttpStream;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lokhttp3/internal/http/Http2xStream$StreamFinishingSource;
    }
.end annotation


# static fields
.field private static final CONNECTION:Lokio/ByteString;

.field private static final ENCODING:Lokio/ByteString;

.field private static final HOST:Lokio/ByteString;

.field private static final HTTP_2_SKIPPED_REQUEST_HEADERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lokio/ByteString;>;"
        }
    .end annotation
.end field

.field private static final HTTP_2_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lokio/ByteString;>;"
        }
    .end annotation
.end field

.field private static final KEEP_ALIVE:Lokio/ByteString;

.field private static final PROXY_CONNECTION:Lokio/ByteString;

.field private static final SPDY_3_SKIPPED_REQUEST_HEADERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lokio/ByteString;>;"
        }
    .end annotation
.end field

.field private static final SPDY_3_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lokio/ByteString;>;"
        }
    .end annotation
.end field

.field private static final TE:Lokio/ByteString;

.field private static final TRANSFER_ENCODING:Lokio/ByteString;

.field private static final UPGRADE:Lokio/ByteString;


# instance fields
.field private final framedConnection:Lokhttp3/internal/framed/FramedConnection;

.field private httpEngine:Lokhttp3/internal/http/HttpEngine;

.field private stream:Lokhttp3/internal/framed/FramedStream;

.field private final streamAllocation:Lokhttp3/internal/http/StreamAllocation;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 52
    const-string v0, "connection"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->CONNECTION:Lokio/ByteString;

    .line 53
    const-string v0, "host"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->HOST:Lokio/ByteString;

    .line 54
    const-string v0, "keep-alive"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->KEEP_ALIVE:Lokio/ByteString;

    .line 55
    const-string v0, "proxy-connection"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->PROXY_CONNECTION:Lokio/ByteString;

    .line 56
    const-string v0, "transfer-encoding"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->TRANSFER_ENCODING:Lokio/ByteString;

    .line 57
    const-string v0, "te"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->TE:Lokio/ByteString;

    .line 58
    const-string v0, "encoding"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->ENCODING:Lokio/ByteString;

    .line 59
    const-string v0, "upgrade"

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->UPGRADE:Lokio/ByteString;

    .line 62
    const/16 v0, 0xb

    new-array v0, v0, [Lokio/ByteString;

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->CONNECTION:Lokio/ByteString;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->HOST:Lokio/ByteString;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->KEEP_ALIVE:Lokio/ByteString;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->PROXY_CONNECTION:Lokio/ByteString;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->TRANSFER_ENCODING:Lokio/ByteString;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_METHOD:Lokio/ByteString;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_PATH:Lokio/ByteString;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_SCHEME:Lokio/ByteString;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_AUTHORITY:Lokio/ByteString;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_HOST:Lokio/ByteString;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->VERSION:Lokio/ByteString;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    invoke-static {v0}, Lokhttp3/internal/Util;->immutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->SPDY_3_SKIPPED_REQUEST_HEADERS:Ljava/util/List;

    .line 74
    const/4 v0, 0x5

    new-array v0, v0, [Lokio/ByteString;

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->CONNECTION:Lokio/ByteString;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->HOST:Lokio/ByteString;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->KEEP_ALIVE:Lokio/ByteString;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->PROXY_CONNECTION:Lokio/ByteString;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->TRANSFER_ENCODING:Lokio/ByteString;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Lokhttp3/internal/Util;->immutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->SPDY_3_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;

    .line 82
    const/16 v0, 0xe

    new-array v0, v0, [Lokio/ByteString;

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->CONNECTION:Lokio/ByteString;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->HOST:Lokio/ByteString;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->KEEP_ALIVE:Lokio/ByteString;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->PROXY_CONNECTION:Lokio/ByteString;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->TE:Lokio/ByteString;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->TRANSFER_ENCODING:Lokio/ByteString;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->ENCODING:Lokio/ByteString;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->UPGRADE:Lokio/ByteString;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_METHOD:Lokio/ByteString;

    const/16 v2, 0x8

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_PATH:Lokio/ByteString;

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_SCHEME:Lokio/ByteString;

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_AUTHORITY:Lokio/ByteString;

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_HOST:Lokio/ByteString;

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/framed/Header;->VERSION:Lokio/ByteString;

    const/16 v2, 0xd

    aput-object v1, v0, v2

    invoke-static {v0}, Lokhttp3/internal/Util;->immutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->HTTP_2_SKIPPED_REQUEST_HEADERS:Ljava/util/List;

    .line 97
    const/16 v0, 0x8

    new-array v0, v0, [Lokio/ByteString;

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->CONNECTION:Lokio/ByteString;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->HOST:Lokio/ByteString;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->KEEP_ALIVE:Lokio/ByteString;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->PROXY_CONNECTION:Lokio/ByteString;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->TE:Lokio/ByteString;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->TRANSFER_ENCODING:Lokio/ByteString;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->ENCODING:Lokio/ByteString;

    const/4 v2, 0x6

    aput-object v1, v0, v2

    sget-object v1, Lokhttp3/internal/http/Http2xStream;->UPGRADE:Lokio/ByteString;

    const/4 v2, 0x7

    aput-object v1, v0, v2

    invoke-static {v0}, Lokhttp3/internal/Util;->immutableList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lokhttp3/internal/http/Http2xStream;->HTTP_2_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lokhttp3/internal/http/StreamAllocation;Lokhttp3/internal/framed/FramedConnection;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, Lokhttp3/internal/http/Http2xStream;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    .line 114
    iput-object p2, p0, Lokhttp3/internal/http/Http2xStream;->framedConnection:Lokhttp3/internal/framed/FramedConnection;

    .line 115
    return-void
.end method

.method static synthetic access$000(Lokhttp3/internal/http/Http2xStream;)Lokhttp3/internal/http/StreamAllocation;
    .locals 1

    .line 51
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->streamAllocation:Lokhttp3/internal/http/StreamAllocation;

    return-object v0
.end method

.method public static http2HeadersList(Lokhttp3/Request;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lokhttp3/Request;)Ljava/util/List<Lokhttp3/internal/framed/Header;>;"
        }
    .end annotation

    .line 199
    invoke-virtual {p0}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v4

    .line 200
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v4}, Lokhttp3/Headers;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 201
    new-instance v0, Lokhttp3/internal/framed/Header;

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_METHOD:Lokio/ByteString;

    invoke-virtual {p0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 202
    new-instance v0, Lokhttp3/internal/framed/Header;

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_PATH:Lokio/ByteString;

    invoke-virtual {p0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-static {v2}, Lokhttp3/internal/http/RequestLine;->requestPath(Lokhttp3/HttpUrl;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 203
    new-instance v0, Lokhttp3/internal/framed/Header;

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_AUTHORITY:Lokio/ByteString;

    invoke-virtual {p0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lokhttp3/internal/Util;->hostHeader(Lokhttp3/HttpUrl;Z)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 204
    new-instance v0, Lokhttp3/internal/framed/Header;

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_SCHEME:Lokio/ByteString;

    invoke-virtual {p0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    const/4 v6, 0x0

    invoke-virtual {v4}, Lokhttp3/Headers;->size()I

    move-result v7

    :goto_0
    if-ge v6, v7, :cond_1

    .line 208
    invoke-virtual {v4, v6}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v8

    .line 209
    sget-object v0, Lokhttp3/internal/http/Http2xStream;->HTTP_2_SKIPPED_REQUEST_HEADERS:Ljava/util/List;

    invoke-interface {v0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 210
    new-instance v0, Lokhttp3/internal/framed/Header;

    invoke-virtual {v4, v6}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v8, v1}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    .line 213
    :cond_1
    return-object v5
.end method

.method private static joinOnNull(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static readHttp2HeadersList(Ljava/util/List;)Lokhttp3/Response$Builder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lokhttp3/internal/framed/Header;>;)Lokhttp3/Response$Builder;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 253
    const/4 v2, 0x0

    .line 255
    new-instance v3, Lokhttp3/Headers$Builder;

    invoke-direct {v3}, Lokhttp3/Headers$Builder;-><init>()V

    .line 256
    const/4 v4, 0x0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v5

    :goto_0
    if-ge v4, v5, :cond_2

    .line 257
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/internal/framed/Header;

    iget-object v6, v0, Lokhttp3/internal/framed/Header;->name:Lokio/ByteString;

    .line 259
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/internal/framed/Header;

    iget-object v0, v0, Lokhttp3/internal/framed/Header;->value:Lokio/ByteString;

    invoke-virtual {v0}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v7

    .line 260
    sget-object v0, Lokhttp3/internal/framed/Header;->RESPONSE_STATUS:Lokio/ByteString;

    invoke-virtual {v6, v0}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 261
    move-object v2, v7

    goto :goto_1

    .line 262
    :cond_0
    sget-object v0, Lokhttp3/internal/http/Http2xStream;->HTTP_2_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;

    invoke-interface {v0, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 263
    invoke-virtual {v6}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v7}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 256
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 266
    :cond_2
    if-nez v2, :cond_3

    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Expected \':status\' header not present"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 268
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "HTTP/1.1 "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/http/StatusLine;->parse(Ljava/lang/String;)Lokhttp3/internal/http/StatusLine;

    move-result-object v4

    .line 269
    new-instance v0, Lokhttp3/Response$Builder;

    invoke-direct {v0}, Lokhttp3/Response$Builder;-><init>()V

    sget-object v1, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    .line 270
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->protocol(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget v1, v4, Lokhttp3/internal/http/StatusLine;->code:I

    .line 271
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->code(I)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, v4, Lokhttp3/internal/http/StatusLine;->message:Ljava/lang/String;

    .line 272
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->message(Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 273
    invoke-virtual {v3}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Response$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static readSpdy3HeadersList(Ljava/util/List;)Lokhttp3/Response$Builder;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lokhttp3/internal/framed/Header;>;)Lokhttp3/Response$Builder;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 218
    const/4 v2, 0x0

    .line 219
    const-string v3, "HTTP/1.1"

    .line 220
    new-instance v4, Lokhttp3/Headers$Builder;

    invoke-direct {v4}, Lokhttp3/Headers$Builder;-><init>()V

    .line 221
    const/4 v5, 0x0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v6

    :goto_0
    if-ge v5, v6, :cond_5

    .line 222
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/internal/framed/Header;

    iget-object v7, v0, Lokhttp3/internal/framed/Header;->name:Lokio/ByteString;

    .line 224
    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/internal/framed/Header;

    iget-object v0, v0, Lokhttp3/internal/framed/Header;->value:Lokio/ByteString;

    invoke-virtual {v0}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v8

    .line 225
    const/4 v9, 0x0

    :goto_1
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v9, v0, :cond_4

    .line 226
    const/4 v0, 0x0

    invoke-virtual {v8, v0, v9}, Ljava/lang/String;->indexOf(II)I

    move-result v10

    .line 227
    const/4 v0, -0x1

    if-ne v10, v0, :cond_0

    .line 228
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v10

    .line 230
    :cond_0
    invoke-virtual {v8, v9, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v11

    .line 231
    sget-object v0, Lokhttp3/internal/framed/Header;->RESPONSE_STATUS:Lokio/ByteString;

    invoke-virtual {v7, v0}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 232
    move-object v2, v11

    goto :goto_2

    .line 233
    :cond_1
    sget-object v0, Lokhttp3/internal/framed/Header;->VERSION:Lokio/ByteString;

    invoke-virtual {v7, v0}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 234
    move-object v3, v11

    goto :goto_2

    .line 235
    :cond_2
    sget-object v0, Lokhttp3/internal/http/Http2xStream;->SPDY_3_SKIPPED_RESPONSE_HEADERS:Ljava/util/List;

    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 236
    invoke-virtual {v7}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0, v11}, Lokhttp3/Headers$Builder;->add(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$Builder;

    .line 238
    :cond_3
    :goto_2
    add-int/lit8 v9, v10, 0x1

    .line 239
    goto :goto_1

    .line 221
    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_0

    .line 241
    :cond_5
    if-nez v2, :cond_6

    new-instance v0, Ljava/net/ProtocolException;

    const-string v1, "Expected \':status\' header not present"

    invoke-direct {v0, v1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 243
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/http/StatusLine;->parse(Ljava/lang/String;)Lokhttp3/internal/http/StatusLine;

    move-result-object v5

    .line 244
    new-instance v0, Lokhttp3/Response$Builder;

    invoke-direct {v0}, Lokhttp3/Response$Builder;-><init>()V

    sget-object v1, Lokhttp3/Protocol;->SPDY_3:Lokhttp3/Protocol;

    .line 245
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->protocol(Lokhttp3/Protocol;)Lokhttp3/Response$Builder;

    move-result-object v0

    iget v1, v5, Lokhttp3/internal/http/StatusLine;->code:I

    .line 246
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->code(I)Lokhttp3/Response$Builder;

    move-result-object v0

    iget-object v1, v5, Lokhttp3/internal/http/StatusLine;->message:Ljava/lang/String;

    .line 247
    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->message(Ljava/lang/String;)Lokhttp3/Response$Builder;

    move-result-object v0

    .line 248
    invoke-virtual {v4}, Lokhttp3/Headers$Builder;->build()Lokhttp3/Headers;

    move-result-object v1

    invoke-virtual {v0, v1}, Lokhttp3/Response$Builder;->headers(Lokhttp3/Headers;)Lokhttp3/Response$Builder;

    move-result-object v0

    return-object v0
.end method

.method public static spdy3HeadersList(Lokhttp3/Request;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lokhttp3/Request;)Ljava/util/List<Lokhttp3/internal/framed/Header;>;"
        }
    .end annotation

    .line 159
    invoke-virtual {p0}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    move-result-object v4

    .line 160
    new-instance v5, Ljava/util/ArrayList;

    invoke-virtual {v4}, Lokhttp3/Headers;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x5

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 161
    new-instance v0, Lokhttp3/internal/framed/Header;

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_METHOD:Lokio/ByteString;

    invoke-virtual {p0}, Lokhttp3/Request;->method()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 162
    new-instance v0, Lokhttp3/internal/framed/Header;

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_PATH:Lokio/ByteString;

    invoke-virtual {p0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-static {v2}, Lokhttp3/internal/http/RequestLine;->requestPath(Lokhttp3/HttpUrl;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 163
    new-instance v0, Lokhttp3/internal/framed/Header;

    sget-object v1, Lokhttp3/internal/framed/Header;->VERSION:Lokio/ByteString;

    const-string v2, "HTTP/1.1"

    invoke-direct {v0, v1, v2}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 164
    new-instance v0, Lokhttp3/internal/framed/Header;

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_HOST:Lokio/ByteString;

    invoke-virtual {p0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Lokhttp3/internal/Util;->hostHeader(Lokhttp3/HttpUrl;Z)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 165
    new-instance v0, Lokhttp3/internal/framed/Header;

    sget-object v1, Lokhttp3/internal/framed/Header;->TARGET_SCHEME:Lokio/ByteString;

    invoke-virtual {p0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v2

    invoke-virtual {v2}, Lokhttp3/HttpUrl;->scheme()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 167
    new-instance v6, Ljava/util/LinkedHashSet;

    invoke-direct {v6}, Ljava/util/LinkedHashSet;-><init>()V

    .line 168
    const/4 v7, 0x0

    invoke-virtual {v4}, Lokhttp3/Headers;->size()I

    move-result v8

    :goto_0
    if-ge v7, v8, :cond_4

    .line 170
    invoke-virtual {v4, v7}, Lokhttp3/Headers;->name(I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lokio/ByteString;->encodeUtf8(Ljava/lang/String;)Lokio/ByteString;

    move-result-object v9

    .line 173
    sget-object v0, Lokhttp3/internal/http/Http2xStream;->SPDY_3_SKIPPED_REQUEST_HEADERS:Ljava/util/List;

    invoke-interface {v0, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 176
    :cond_0
    invoke-virtual {v4, v7}, Lokhttp3/Headers;->value(I)Ljava/lang/String;

    move-result-object v10

    .line 177
    invoke-interface {v6, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 178
    new-instance v0, Lokhttp3/internal/framed/Header;

    invoke-direct {v0, v9, v10}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 179
    goto :goto_2

    .line 183
    :cond_1
    const/4 v11, 0x0

    :goto_1
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-ge v11, v0, :cond_3

    .line 184
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/internal/framed/Header;

    iget-object v0, v0, Lokhttp3/internal/framed/Header;->name:Lokio/ByteString;

    invoke-virtual {v0, v9}, Lokio/ByteString;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 185
    invoke-interface {v5, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lokhttp3/internal/framed/Header;

    iget-object v0, v0, Lokhttp3/internal/framed/Header;->value:Lokio/ByteString;

    invoke-virtual {v0}, Lokio/ByteString;->utf8()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lokhttp3/internal/http/Http2xStream;->joinOnNull(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    .line 186
    new-instance v0, Lokhttp3/internal/framed/Header;

    invoke-direct {v0, v9, v12}, Lokhttp3/internal/framed/Header;-><init>(Lokio/ByteString;Ljava/lang/String;)V

    invoke-interface {v5, v11, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 187
    goto :goto_2

    .line 183
    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    .line 168
    :cond_3
    :goto_2
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 191
    :cond_4
    return-object v5
.end method


# virtual methods
.method public cancel()V
    .locals 2

    .line 282
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    sget-object v1, Lokhttp3/internal/framed/ErrorCode;->CANCEL:Lokhttp3/internal/framed/ErrorCode;

    invoke-virtual {v0, v1}, Lokhttp3/internal/framed/FramedStream;->closeLater(Lokhttp3/internal/framed/ErrorCode;)V

    .line 283
    :cond_0
    return-void
.end method

.method public createRequestBody(Lokhttp3/Request;J)Lokio/Sink;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 122
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream;->getSink()Lokio/Sink;

    move-result-object v0

    return-object v0
.end method

.method public finishRequest()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 144
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream;->getSink()Lokio/Sink;

    move-result-object v0

    invoke-interface {v0}, Lokio/Sink;->close()V

    .line 145
    return-void
.end method

.method public openResponseBody(Lokhttp3/Response;)Lokhttp3/ResponseBody;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 277
    new-instance v3, Lokhttp3/internal/http/Http2xStream$StreamFinishingSource;

    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream;->getSource()Lokio/Source;

    move-result-object v0

    invoke-direct {v3, p0, v0}, Lokhttp3/internal/http/Http2xStream$StreamFinishingSource;-><init>(Lokhttp3/internal/http/Http2xStream;Lokio/Source;)V

    .line 278
    new-instance v0, Lokhttp3/internal/http/RealResponseBody;

    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object v1

    invoke-static {v3}, Lokio/Okio;->buffer(Lokio/Source;)Lokio/BufferedSource;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lokhttp3/internal/http/RealResponseBody;-><init>(Lokhttp3/Headers;Lokio/BufferedSource;)V

    return-object v0
.end method

.method public readResponseHeaders()Lokhttp3/Response$Builder;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 148
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->framedConnection:Lokhttp3/internal/framed/FramedConnection;

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedConnection;->getProtocol()Lokhttp3/Protocol;

    move-result-object v0

    sget-object v1, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    .line 149
    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream;->getResponseHeaders()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/http/Http2xStream;->readHttp2HeadersList(Ljava/util/List;)Lokhttp3/Response$Builder;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    .line 150
    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream;->getResponseHeaders()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lokhttp3/internal/http/Http2xStream;->readSpdy3HeadersList(Ljava/util/List;)Lokhttp3/Response$Builder;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public setHttpEngine(Lokhttp3/internal/http/HttpEngine;)V
    .locals 0

    .line 118
    iput-object p1, p0, Lokhttp3/internal/http/Http2xStream;->httpEngine:Lokhttp3/internal/http/HttpEngine;

    .line 119
    return-void
.end method

.method public writeRequestBody(Lokhttp3/internal/http/RetryableSink;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 140
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream;->getSink()Lokio/Sink;

    move-result-object v0

    invoke-virtual {p1, v0}, Lokhttp3/internal/http/RetryableSink;->writeToSocket(Lokio/Sink;)V

    .line 141
    return-void
.end method

.method public writeRequestHeaders(Lokhttp3/Request;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 126
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    if-eqz v0, :cond_0

    return-void

    .line 128
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->httpEngine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0}, Lokhttp3/internal/http/HttpEngine;->writingRequestHeaders()V

    .line 129
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->httpEngine:Lokhttp3/internal/http/HttpEngine;

    invoke-virtual {v0, p1}, Lokhttp3/internal/http/HttpEngine;->permitsRequestBody(Lokhttp3/Request;)Z

    move-result v4

    .line 130
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->framedConnection:Lokhttp3/internal/framed/FramedConnection;

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedConnection;->getProtocol()Lokhttp3/Protocol;

    move-result-object v0

    sget-object v1, Lokhttp3/Protocol;->HTTP_2:Lokhttp3/Protocol;

    if-ne v0, v1, :cond_1

    .line 131
    invoke-static {p1}, Lokhttp3/internal/http/Http2xStream;->http2HeadersList(Lokhttp3/Request;)Ljava/util/List;

    move-result-object v5

    goto :goto_0

    .line 132
    :cond_1
    invoke-static {p1}, Lokhttp3/internal/http/Http2xStream;->spdy3HeadersList(Lokhttp3/Request;)Ljava/util/List;

    move-result-object v5

    .line 133
    :goto_0
    const/4 v6, 0x1

    .line 134
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->framedConnection:Lokhttp3/internal/framed/FramedConnection;

    invoke-virtual {v0, v5, v4, v6}, Lokhttp3/internal/framed/FramedConnection;->newStream(Ljava/util/List;ZZ)Lokhttp3/internal/framed/FramedStream;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    .line 135
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream;->readTimeout()Lokio/Timeout;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/Http2xStream;->httpEngine:Lokhttp3/internal/http/HttpEngine;

    iget-object v1, v1, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v1}, Lokhttp3/OkHttpClient;->readTimeoutMillis()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 136
    iget-object v0, p0, Lokhttp3/internal/http/Http2xStream;->stream:Lokhttp3/internal/framed/FramedStream;

    invoke-virtual {v0}, Lokhttp3/internal/framed/FramedStream;->writeTimeout()Lokio/Timeout;

    move-result-object v0

    iget-object v1, p0, Lokhttp3/internal/http/Http2xStream;->httpEngine:Lokhttp3/internal/http/HttpEngine;

    iget-object v1, v1, Lokhttp3/internal/http/HttpEngine;->client:Lokhttp3/OkHttpClient;

    invoke-virtual {v1}, Lokhttp3/OkHttpClient;->writeTimeoutMillis()I

    move-result v1

    int-to-long v1, v1

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v1, v2, v3}, Lokio/Timeout;->timeout(JLjava/util/concurrent/TimeUnit;)Lokio/Timeout;

    .line 137
    return-void
.end method
