.class final Lokhttp3/internal/tls/DistinguishedNameParser;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private beg:I

.field private chars:[C

.field private cur:I

.field private final dn:Ljava/lang/String;

.field private end:I

.field private final length:I

.field private pos:I


# direct methods
.method public constructor <init>(Ljavax/security/auth/x500/X500Principal;)V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    const-string v0, "RFC2253"

    invoke-virtual {p1, v0}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    .line 43
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    .line 44
    return-void
.end method

.method private escapedAV()Ljava/lang/String;
    .locals 5

    .line 187
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    .line 188
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    .line 190
    :cond_0
    :goto_0
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-lt v0, v1, :cond_1

    .line 192
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    iget v3, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    iget v4, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    sub-int/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 195
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 200
    :sswitch_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    iget v3, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    iget v4, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    sub-int/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 203
    :sswitch_1
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    invoke-direct {p0}, Lokhttp3/internal/tls/DistinguishedNameParser;->getEscaped()C

    move-result v2

    aput-char v2, v0, v1

    .line 204
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 205
    goto/16 :goto_0

    .line 209
    :sswitch_2
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->cur:I

    .line 211
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 212
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    const/16 v2, 0x20

    aput-char v2, v0, v1

    .line 214
    :goto_1
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    .line 215
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    const/16 v2, 0x20

    aput-char v2, v0, v1

    .line 214
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    goto :goto_1

    .line 217
    :cond_2
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x2c

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x2b

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_0

    .line 220
    :cond_3
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    iget v3, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->cur:I

    iget v4, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    sub-int/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 224
    :goto_2
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v3, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v2, v2, v3

    aput-char v2, v0, v1

    .line 225
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_2
        0x2b -> :sswitch_0
        0x2c -> :sswitch_0
        0x3b -> :sswitch_0
        0x5c -> :sswitch_1
    .end sparse-switch
.end method

.method private getByte(I)I
    .locals 5

    .line 311
    add-int/lit8 v0, p1, 0x1

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-lt v0, v1, :cond_0

    .line 312
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 317
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    aget-char v3, v0, p1

    .line 318
    const/16 v0, 0x30

    if-lt v3, v0, :cond_1

    const/16 v0, 0x39

    if-gt v3, v0, :cond_1

    .line 319
    add-int/lit8 v3, v3, -0x30

    goto :goto_0

    .line 320
    :cond_1
    const/16 v0, 0x61

    if-lt v3, v0, :cond_2

    const/16 v0, 0x66

    if-gt v3, v0, :cond_2

    .line 321
    add-int/lit8 v3, v3, -0x57

    goto :goto_0

    .line 322
    :cond_2
    const/16 v0, 0x41

    if-lt v3, v0, :cond_3

    const/16 v0, 0x46

    if-gt v3, v0, :cond_3

    .line 323
    add-int/lit8 v3, v3, -0x37

    goto :goto_0

    .line 325
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 328
    :goto_0
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    add-int/lit8 v1, p1, 0x1

    aget-char v4, v0, v1

    .line 329
    const/16 v0, 0x30

    if-lt v4, v0, :cond_4

    const/16 v0, 0x39

    if-gt v4, v0, :cond_4

    .line 330
    add-int/lit8 v4, v4, -0x30

    goto :goto_1

    .line 331
    :cond_4
    const/16 v0, 0x61

    if-lt v4, v0, :cond_5

    const/16 v0, 0x66

    if-gt v4, v0, :cond_5

    .line 332
    add-int/lit8 v4, v4, -0x57

    goto :goto_1

    .line 333
    :cond_5
    const/16 v0, 0x41

    if-lt v4, v0, :cond_6

    const/16 v0, 0x46

    if-gt v4, v0, :cond_6

    .line 334
    add-int/lit8 v4, v4, -0x37

    goto :goto_1

    .line 336
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 339
    :goto_1
    shl-int/lit8 v0, v3, 0x4

    add-int/2addr v0, v4

    return v0
.end method

.method private getEscaped()C
    .locals 3

    .line 232
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 233
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ne v0, v1, :cond_0

    .line 234
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected end of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 237
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 252
    :sswitch_0
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    return v0

    .line 256
    :goto_0
    invoke-direct {p0}, Lokhttp3/internal/tls/DistinguishedNameParser;->getUTF8()C

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x20 -> :sswitch_0
        0x22 -> :sswitch_0
        0x23 -> :sswitch_0
        0x25 -> :sswitch_0
        0x2a -> :sswitch_0
        0x2b -> :sswitch_0
        0x2c -> :sswitch_0
        0x3b -> :sswitch_0
        0x3c -> :sswitch_0
        0x3d -> :sswitch_0
        0x3e -> :sswitch_0
        0x5c -> :sswitch_0
        0x5f -> :sswitch_0
    .end sparse-switch
.end method

.method private getUTF8()C
    .locals 6

    .line 263
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    invoke-direct {p0, v0}, Lokhttp3/internal/tls/DistinguishedNameParser;->getByte(I)I

    move-result v2

    .line 264
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 266
    const/16 v0, 0x80

    if-ge v2, v0, :cond_0

    .line 267
    int-to-char v0, v2

    return v0

    .line 268
    :cond_0
    const/16 v0, 0xc0

    if-lt v2, v0, :cond_7

    const/16 v0, 0xf7

    if-gt v2, v0, :cond_7

    .line 271
    const/16 v0, 0xdf

    if-gt v2, v0, :cond_1

    .line 272
    const/4 v3, 0x1

    .line 273
    and-int/lit8 v2, v2, 0x1f

    goto :goto_0

    .line 274
    :cond_1
    const/16 v0, 0xef

    if-gt v2, v0, :cond_2

    .line 275
    const/4 v3, 0x2

    .line 276
    and-int/lit8 v2, v2, 0xf

    goto :goto_0

    .line 278
    :cond_2
    const/4 v3, 0x3

    .line 279
    and-int/lit8 v2, v2, 0x7

    .line 283
    :goto_0
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_6

    .line 284
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 285
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x5c

    if-eq v0, v1, :cond_4

    .line 286
    :cond_3
    const/16 v0, 0x3f

    return v0

    .line 288
    :cond_4
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 290
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    invoke-direct {p0, v0}, Lokhttp3/internal/tls/DistinguishedNameParser;->getByte(I)I

    move-result v4

    .line 291
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 292
    and-int/lit16 v0, v4, 0xc0

    const/16 v1, 0x80

    if-eq v0, v1, :cond_5

    .line 293
    const/16 v0, 0x3f

    return v0

    .line 296
    :cond_5
    shl-int/lit8 v0, v2, 0x6

    and-int/lit8 v1, v4, 0x3f

    add-int v2, v0, v1

    .line 283
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 298
    :cond_6
    int-to-char v0, v2

    return v0

    .line 300
    :cond_7
    const/16 v0, 0x3f

    return v0
.end method

.method private hexAV()Ljava/lang/String;
    .locals 8

    .line 137
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x4

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-lt v0, v1, :cond_0

    .line 139
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected end of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 142
    :cond_0
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    .line 143
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 148
    :goto_0
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x2b

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x2c

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_2

    .line 150
    :cond_1
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    .line 151
    goto/16 :goto_2

    .line 154
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_3

    .line 155
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    .line 156
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 159
    :goto_1
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ge v0, v1, :cond_5

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    goto :goto_1

    .line 162
    :cond_3
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x41

    if-lt v0, v1, :cond_4

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x46

    if-gt v0, v1, :cond_4

    .line 163
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v2, v0, v1

    add-int/lit8 v2, v2, 0x20

    int-to-char v2, v2

    aput-char v2, v0, v1

    .line 166
    :cond_4
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    goto/16 :goto_0

    .line 171
    :cond_5
    :goto_2
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    sub-int v4, v0, v1

    .line 172
    const/4 v0, 0x5

    if-lt v4, v0, :cond_6

    and-int/lit8 v0, v4, 0x1

    if-nez v0, :cond_7

    .line 173
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected end of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 177
    :cond_7
    div-int/lit8 v0, v4, 0x2

    new-array v5, v0, [B

    .line 178
    const/4 v6, 0x0

    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    add-int/lit8 v7, v0, 0x1

    :goto_3
    array-length v0, v5

    if-ge v6, v0, :cond_8

    .line 179
    invoke-direct {p0, v7}, Lokhttp3/internal/tls/DistinguishedNameParser;->getByte(I)I

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, v5, v6

    .line 178
    add-int/lit8 v7, v7, 0x2

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 182
    :cond_8
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    invoke-direct {v0, v1, v2, v4}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method private nextAT()Ljava/lang/String;
    .locals 5

    .line 50
    :goto_0
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    goto :goto_0

    .line 52
    :cond_0
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ne v0, v1, :cond_1

    .line 53
    const/4 v0, 0x0

    return-object v0

    .line 57
    :cond_1
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    .line 60
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 61
    :goto_1
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x3d

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-eq v0, v1, :cond_2

    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    goto :goto_1

    .line 65
    :cond_2
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-lt v0, v1, :cond_3

    .line 66
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected end of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 70
    :cond_3
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    .line 74
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 75
    :goto_2
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ge v0, v1, :cond_4

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x3d

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_4

    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    goto :goto_2

    .line 78
    :cond_4
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_5

    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ne v0, v1, :cond_6

    .line 79
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected end of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 83
    :cond_6
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 87
    :goto_3
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ge v0, v1, :cond_7

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_7

    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    goto :goto_3

    .line 92
    :cond_7
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    sub-int/2addr v0, v1

    const/4 v1, 0x4

    if-le v0, v1, :cond_b

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_b

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    aget-char v0, v0, v1

    const/16 v1, 0x4f

    if-eq v0, v1, :cond_8

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    aget-char v0, v0, v1

    const/16 v1, 0x6f

    if-ne v0, v1, :cond_b

    :cond_8
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    add-int/lit8 v1, v1, 0x1

    aget-char v0, v0, v1

    const/16 v1, 0x49

    if-eq v0, v1, :cond_9

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    add-int/lit8 v1, v1, 0x1

    aget-char v0, v0, v1

    const/16 v1, 0x69

    if-ne v0, v1, :cond_b

    :cond_9
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    const/16 v1, 0x44

    if-eq v0, v1, :cond_a

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    const/16 v1, 0x64

    if-ne v0, v1, :cond_b

    .line 96
    :cond_a
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    .line 99
    :cond_b
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    iget v3, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    iget v4, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    sub-int/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method private quotedAV()Ljava/lang/String;
    .locals 5

    .line 104
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 105
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    .line 106
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    .line 109
    :goto_0
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ne v0, v1, :cond_0

    .line 110
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected end of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 113
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x22

    if-ne v0, v1, :cond_1

    .line 115
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 116
    goto :goto_2

    .line 117
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_2

    .line 118
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    invoke-direct {p0}, Lokhttp3/internal/tls/DistinguishedNameParser;->getEscaped()C

    move-result v2

    aput-char v2, v0, v1

    goto :goto_1

    .line 121
    :cond_2
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v3, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v2, v2, v3

    aput-char v2, v0, v1

    .line 123
    :goto_1
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 124
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    goto/16 :goto_0

    .line 129
    :goto_2
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ge v0, v1, :cond_3

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_3

    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    goto :goto_2

    .line 132
    :cond_3
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    iget v3, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    iget v4, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    sub-int/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method


# virtual methods
.method public findMostSpecific(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 350
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 351
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->beg:I

    .line 352
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->end:I

    .line 353
    const/4 v0, 0x0

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->cur:I

    .line 354
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    iput-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    .line 356
    invoke-direct {p0}, Lokhttp3/internal/tls/DistinguishedNameParser;->nextAT()Ljava/lang/String;

    move-result-object v3

    .line 357
    if-nez v3, :cond_0

    .line 358
    const/4 v0, 0x0

    return-object v0

    .line 361
    :cond_0
    :goto_0
    const-string v4, ""

    .line 363
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-ne v0, v1, :cond_1

    .line 364
    const/4 v0, 0x0

    return-object v0

    .line 367
    :cond_1
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 369
    :sswitch_0
    invoke-direct {p0}, Lokhttp3/internal/tls/DistinguishedNameParser;->quotedAV()Ljava/lang/String;

    move-result-object v4

    .line 370
    goto :goto_2

    .line 372
    :sswitch_1
    invoke-direct {p0}, Lokhttp3/internal/tls/DistinguishedNameParser;->hexAV()Ljava/lang/String;

    move-result-object v4

    .line 373
    goto :goto_2

    .line 378
    :sswitch_2
    goto :goto_2

    .line 380
    :goto_1
    invoke-direct {p0}, Lokhttp3/internal/tls/DistinguishedNameParser;->escapedAV()Ljava/lang/String;

    move-result-object v4

    .line 386
    :goto_2
    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 387
    return-object v4

    .line 390
    :cond_2
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->length:I

    if-lt v0, v1, :cond_3

    .line 391
    const/4 v0, 0x0

    return-object v0

    .line 394
    :cond_3
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x2c

    if-eq v0, v1, :cond_5

    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_4

    goto :goto_3

    .line 395
    :cond_4
    iget-object v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->chars:[C

    iget v1, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    aget-char v0, v0, v1

    const/16 v1, 0x2b

    if-eq v0, v1, :cond_5

    .line 396
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 399
    :cond_5
    :goto_3
    iget v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->pos:I

    .line 400
    invoke-direct {p0}, Lokhttp3/internal/tls/DistinguishedNameParser;->nextAT()Ljava/lang/String;

    move-result-object v3

    .line 401
    if-nez v3, :cond_6

    .line 402
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lokhttp3/internal/tls/DistinguishedNameParser;->dn:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 404
    :cond_6
    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_0
        0x23 -> :sswitch_1
        0x2b -> :sswitch_2
        0x2c -> :sswitch_2
        0x3b -> :sswitch_2
    .end sparse-switch
.end method
