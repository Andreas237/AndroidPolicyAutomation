.class public final Lokhttp3/internal/ws/WebSocketProtocol;
.super Ljava/lang/Object;
.source "WebSocketProtocol.java"


# direct methods
.method static closeCodeExceptionMessage(I)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x3e8

    if-lt p0, v0, :cond_4

    const/16 v0, 0x1388

    if-lt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x3ec

    if-lt p0, v0, :cond_1

    const/16 v0, 0x3ee

    if-le p0, v0, :cond_2

    :cond_1
    const/16 v0, 0x3f4

    if-lt p0, v0, :cond_3

    const/16 v0, 0xbb7

    if-gt p0, v0, :cond_3

    .line 111
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Code "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " is reserved and may not be used."

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3
    const/4 p0, 0x0

    return-object p0

    .line 109
    :cond_4
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Code must be in range [1000,5000): "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static toggleMask(Lokio/Buffer$UnsafeCursor;[B)V
    .locals 7

    .line 97
    array-length v0, p1

    const/4 v1, 0x0

    .line 99
    :cond_0
    iget-object v2, p0, Lokio/Buffer$UnsafeCursor;->data:[B

    .line 100
    iget v3, p0, Lokio/Buffer$UnsafeCursor;->start:I

    iget v4, p0, Lokio/Buffer$UnsafeCursor;->end:I

    :goto_0
    if-ge v3, v4, :cond_1

    .line 101
    rem-int/2addr v1, v0

    .line 102
    aget-byte v5, v2, v3

    aget-byte v6, p1, v1

    xor-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v2, v3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 104
    :cond_1
    invoke-virtual {p0}, Lokio/Buffer$UnsafeCursor;->next()I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_0

    return-void
.end method

.method static validateCloseCode(I)V
    .locals 1

    .line 118
    invoke-static {p0}, Lokhttp3/internal/ws/WebSocketProtocol;->closeCodeExceptionMessage(I)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    return-void

    .line 119
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
