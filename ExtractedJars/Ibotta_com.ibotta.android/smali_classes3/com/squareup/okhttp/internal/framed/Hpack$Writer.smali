.class final Lcom/squareup/okhttp/internal/framed/Hpack$Writer;
.super Ljava/lang/Object;
.source "Hpack.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/okhttp/internal/framed/Hpack;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Writer"
.end annotation


# instance fields
.field private final out:Lokio/Buffer;


# direct methods
.method constructor <init>(Lokio/Buffer;)V
    .locals 0

    .line 372
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 373
    iput-object p1, p0, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->out:Lokio/Buffer;

    return-void
.end method


# virtual methods
.method writeByteString(Lokio/ByteString;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 417
    invoke-virtual {p1}, Lokio/ByteString;->size()I

    move-result v0

    const/16 v1, 0x7f

    const/4 v2, 0x0

    invoke-virtual {p0, v0, v1, v2}, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->writeInt(III)V

    .line 418
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->out:Lokio/Buffer;

    invoke-virtual {v0, p1}, Lokio/Buffer;->write(Lokio/ByteString;)Lokio/Buffer;

    return-void
.end method

.method writeHeaders(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/squareup/okhttp/internal/framed/Header;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 380
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 381
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/squareup/okhttp/internal/framed/Header;

    iget-object v3, v3, Lcom/squareup/okhttp/internal/framed/Header;->name:Lokio/ByteString;

    invoke-virtual {v3}, Lokio/ByteString;->toAsciiLowercase()Lokio/ByteString;

    move-result-object v3

    .line 382
    invoke-static {}, Lcom/squareup/okhttp/internal/framed/Hpack;->access$200()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    if-eqz v4, :cond_0

    .line 385
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    const/16 v4, 0xf

    invoke-virtual {p0, v3, v4, v1}, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->writeInt(III)V

    .line 386
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/squareup/okhttp/internal/framed/Header;

    iget-object v3, v3, Lcom/squareup/okhttp/internal/framed/Header;->value:Lokio/ByteString;

    invoke-virtual {p0, v3}, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->writeByteString(Lokio/ByteString;)V

    goto :goto_1

    .line 388
    :cond_0
    iget-object v4, p0, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->out:Lokio/Buffer;

    invoke-virtual {v4, v1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    .line 389
    invoke-virtual {p0, v3}, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->writeByteString(Lokio/ByteString;)V

    .line 390
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/squareup/okhttp/internal/framed/Header;

    iget-object v3, v3, Lcom/squareup/okhttp/internal/framed/Header;->value:Lokio/ByteString;

    invoke-virtual {p0, v3}, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->writeByteString(Lokio/ByteString;)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method writeInt(III)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-ge p1, p2, :cond_0

    .line 399
    iget-object p2, p0, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->out:Lokio/Buffer;

    or-int/2addr p1, p3

    invoke-virtual {p2, p1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    return-void

    .line 404
    :cond_0
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->out:Lokio/Buffer;

    or-int/2addr p3, p2

    invoke-virtual {v0, p3}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    sub-int/2addr p1, p2

    :goto_0
    const/16 p2, 0x80

    if-lt p1, p2, :cond_1

    and-int/lit8 p3, p1, 0x7f

    .line 410
    iget-object v0, p0, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->out:Lokio/Buffer;

    or-int/2addr p2, p3

    invoke-virtual {v0, p2}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    ushr-int/lit8 p1, p1, 0x7

    goto :goto_0

    .line 413
    :cond_1
    iget-object p2, p0, Lcom/squareup/okhttp/internal/framed/Hpack$Writer;->out:Lokio/Buffer;

    invoke-virtual {p2, p1}, Lokio/Buffer;->writeByte(I)Lokio/Buffer;

    return-void
.end method
