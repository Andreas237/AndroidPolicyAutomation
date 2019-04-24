.class public Lo/flt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/flt$4;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;Ljava/lang/Comparable<Lo/flt;>;"
    }
.end annotation


# instance fields
.field private b:[B

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 78
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lo/flt;->b:[B

    .line 79
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput p1, p0, Lo/flt;->e:I

    .line 90
    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lo/flt;->b:[B

    .line 91
    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput p1, p0, Lo/flt;->e:I

    .line 114
    invoke-virtual {p0, p2}, Lo/flt;->c(I)V

    .line 115
    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 0

    .line 124
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 125
    iput p1, p0, Lo/flt;->e:I

    .line 126
    invoke-virtual {p0, p2, p3}, Lo/flt;->b(J)V

    .line 127
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput p1, p0, Lo/flt;->e:I

    .line 102
    invoke-virtual {p0, p2}, Lo/flt;->e(Ljava/lang/String;)V

    .line 103
    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 0

    .line 135
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 136
    iput p1, p0, Lo/flt;->e:I

    .line 137
    invoke-virtual {p0, p2}, Lo/flt;->d([B)V

    .line 138
    return-void
.end method

.method private e([B)Ljava/lang/String;
    .locals 9

    .line 370
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 371
    const-string v0, "0x"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    move-object v5, p1

    array-length v6, v5

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v6, :cond_0

    aget-byte v8, v5, v7

    .line 373
    const-string v0, "%02x"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    and-int/lit16 v2, v8, 0xff

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    .line 374
    :cond_0
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 148
    iget-object v0, p0, Lo/flt;->b:[B

    array-length v0, v0

    return v0
.end method

.method public b()I
    .locals 1

    .line 157
    iget v0, p0, Lo/flt;->e:I

    return v0
.end method

.method public b(Lo/flt;)I
    .locals 2

    .line 304
    iget v0, p0, Lo/flt;->e:I

    iget v1, p1, Lo/flt;->e:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public b(J)V
    .locals 6

    .line 260
    const/4 v4, 0x0

    .line 261
    const/4 v5, 0x0

    :goto_0
    const/16 v0, 0x8

    if-ge v5, v0, :cond_1

    .line 262
    mul-int/lit8 v0, v5, 0x8

    const-wide/16 v1, 0x1

    shl-long v0, v1, v0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 261
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 264
    :cond_1
    new-array v0, v4, [B

    iput-object v0, p0, Lo/flt;->b:[B

    .line 265
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_2

    .line 266
    iget-object v0, p0, Lo/flt;->b:[B

    sub-int v1, v4, v5

    add-int/lit8 v1, v1, -0x1

    mul-int/lit8 v2, v5, 0x8

    shr-long v2, p1, v2

    long-to-int v2, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 265
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 267
    :cond_2
    return-void
.end method

.method public c()I
    .locals 5

    .line 195
    const/4 v3, 0x0

    .line 196
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/flt;->b:[B

    array-length v0, v0

    if-ge v4, v0, :cond_0

    .line 197
    iget-object v0, p0, Lo/flt;->b:[B

    iget-object v1, p0, Lo/flt;->b:[B

    array-length v1, v1

    sub-int/2addr v1, v4

    add-int/lit8 v1, v1, -0x1

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    mul-int/lit8 v1, v4, 0x8

    shl-int/2addr v0, v1

    add-int/2addr v3, v0

    .line 196
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 199
    :cond_0
    return v3
.end method

.method public c(I)V
    .locals 5

    .line 245
    const/4 v3, 0x0

    .line 246
    const/4 v4, 0x0

    :goto_0
    const/4 v0, 0x4

    if-ge v4, v0, :cond_1

    .line 247
    mul-int/lit8 v0, v4, 0x8

    const/4 v1, 0x1

    shl-int v0, v1, v0

    if-ge p1, v0, :cond_0

    if-gez p1, :cond_1

    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 246
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 249
    :cond_1
    new-array v0, v3, [B

    iput-object v0, p0, Lo/flt;->b:[B

    .line 250
    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_2

    .line 251
    iget-object v0, p0, Lo/flt;->b:[B

    sub-int v1, v3, v4

    add-int/lit8 v1, v1, -0x1

    mul-int/lit8 v2, v4, 0x8

    shr-int v2, p1, v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    .line 250
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 252
    :cond_2
    return-void
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 66
    move-object v0, p1

    check-cast v0, Lo/flt;

    invoke-virtual {p0, v0}, Lo/flt;->b(Lo/flt;)I

    move-result v0

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 3

    .line 184
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lo/flt;->b:[B

    sget-object v2, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v0
.end method

.method public d(I)V
    .locals 0

    .line 166
    iput p1, p0, Lo/flt;->e:I

    .line 167
    return-void
.end method

.method public d([B)V
    .locals 1

    .line 223
    if-nez p1, :cond_0

    .line 224
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 225
    :cond_0
    iput-object p1, p0, Lo/flt;->b:[B

    .line 226
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 234
    if-nez p1, :cond_0

    .line 235
    new-instance v0, Ljava/lang/NullPointerException;

    invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V

    throw v0

    .line 236
    :cond_0
    sget-object v0, Lo/flj;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    iput-object v0, p0, Lo/flt;->b:[B

    .line 237
    return-void
.end method

.method public e()[B
    .locals 1

    .line 175
    iget-object v0, p0, Lo/flt;->b:[B

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 312
    if-ne p1, p0, :cond_0

    .line 313
    const/4 v0, 0x1

    return v0

    .line 314
    :cond_0
    instance-of v0, p1, Lo/flt;

    if-nez v0, :cond_1

    .line 315
    const/4 v0, 0x0

    return v0

    .line 317
    :cond_1
    move-object v2, p1

    check-cast v2, Lo/flt;

    .line 318
    iget v0, p0, Lo/flt;->e:I

    iget v1, v2, Lo/flt;->e:I

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lo/flt;->b:[B

    iget-object v1, v2, Lo/flt;->b:[B

    invoke-static {v0, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 3

    .line 351
    sget-object v0, Lo/flt$4;->b:[I

    iget v1, p0, Lo/flt;->e:I

    invoke-static {v1}, Lo/flu;->d(I)Lo/flu$e;

    move-result-object v1

    invoke-virtual {v1}, Lo/flu$e;->ordinal()I

    move-result v1

    aget v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 353
    :sswitch_0
    iget v0, p0, Lo/flt;->e:I

    const/16 v1, 0x11

    if-eq v0, v1, :cond_0

    iget v0, p0, Lo/flt;->e:I

    const/16 v1, 0xc

    if-ne v0, v1, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/flt;->c()I

    move-result v1

    invoke-static {v1}, Lo/flp;->c(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 354
    :cond_1
    iget v0, p0, Lo/flt;->e:I

    const/16 v1, 0x1b

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/flt;->e:I

    const/16 v1, 0x17

    if-ne v0, v1, :cond_3

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v1, Lo/fll;

    iget-object v2, p0, Lo/flt;->b:[B

    invoke-direct {v1, v2}, Lo/fll;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 355
    :cond_3
    invoke-virtual {p0}, Lo/flt;->c()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 357
    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lo/flt;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 359
    :goto_0
    invoke-virtual {p0}, Lo/flt;->e()[B

    move-result-object v0

    invoke-direct {p0, v0}, Lo/flt;->e([B)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method public hashCode()I
    .locals 2

    .line 326
    iget v0, p0, Lo/flt;->e:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lo/flt;->b:[B

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i()J
    .locals 6

    .line 210
    const-wide/16 v3, 0x0

    .line 211
    const/4 v5, 0x0

    :goto_0
    iget-object v0, p0, Lo/flt;->b:[B

    array-length v0, v0

    if-ge v5, v0, :cond_0

    .line 212
    iget-object v0, p0, Lo/flt;->b:[B

    iget-object v1, p0, Lo/flt;->b:[B

    array-length v1, v1

    sub-int/2addr v1, v5

    add-int/lit8 v1, v1, -0x1

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    int-to-long v0, v0

    mul-int/lit8 v2, v5, 0x8

    shl-long/2addr v0, v2

    add-long/2addr v3, v0

    .line 211
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 214
    :cond_0
    return-wide v3
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 334
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 335
    iget v0, p0, Lo/flt;->e:I

    invoke-static {v0}, Lo/flu;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    invoke-virtual {p0}, Lo/flt;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
