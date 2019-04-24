.class final Lo/bqj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private final c:I

.field private d:I

.field private final e:Ljava/lang/String;

.field private g:I

.field private k:[C


# direct methods
.method constructor <init>(Ljavax/security/auth/x500/X500Principal;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const-string v0, "RFC2253"

    invoke-virtual {p1, v0}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lo/bqj;->e:Ljava/lang/String;

    .line 29
    iget-object v0, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iput v0, p0, Lo/bqj;->c:I

    .line 30
    return-void
.end method

.method private a(I)I
    .locals 5

    .line 256
    add-int/lit8 v0, p1, 0x1

    iget v1, p0, Lo/bqj;->c:I

    if-lt v0, v1, :cond_0

    .line 258
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 263
    :cond_0
    iget-object v0, p0, Lo/bqj;->k:[C

    aget-char v3, v0, p1

    .line 264
    const/16 v0, 0x30

    if-lt v3, v0, :cond_1

    const/16 v0, 0x39

    if-gt v3, v0, :cond_1

    .line 266
    add-int/lit8 v3, v3, -0x30

    goto :goto_0

    .line 268
    :cond_1
    const/16 v0, 0x61

    if-lt v3, v0, :cond_2

    const/16 v0, 0x66

    if-gt v3, v0, :cond_2

    .line 270
    add-int/lit8 v3, v3, -0x57

    goto :goto_0

    .line 272
    :cond_2
    const/16 v0, 0x41

    if-lt v3, v0, :cond_3

    const/16 v0, 0x46

    if-gt v3, v0, :cond_3

    .line 274
    add-int/lit8 v3, v3, -0x37

    goto :goto_0

    .line 278
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error, Malformed DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 281
    :goto_0
    iget-object v0, p0, Lo/bqj;->k:[C

    add-int/lit8 v1, p1, 0x1

    aget-char v4, v0, v1

    .line 282
    const/16 v0, 0x30

    if-lt v4, v0, :cond_4

    const/16 v0, 0x39

    if-gt v4, v0, :cond_4

    .line 284
    add-int/lit8 v4, v4, -0x30

    goto :goto_1

    .line 286
    :cond_4
    const/16 v0, 0x61

    if-lt v4, v0, :cond_5

    const/16 v0, 0x66

    if-gt v4, v0, :cond_5

    .line 288
    add-int/lit8 v4, v4, -0x57

    goto :goto_1

    .line 290
    :cond_5
    const/16 v0, 0x41

    if-lt v4, v0, :cond_6

    const/16 v0, 0x46

    if-gt v4, v0, :cond_6

    .line 292
    add-int/lit8 v4, v4, -0x37

    goto :goto_1

    .line 296
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error, Malformed DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 299
    :goto_1
    shl-int/lit8 v0, v3, 0x4

    add-int/2addr v0, v4

    return v0
.end method

.method private a()Ljava/lang/String;
    .locals 5

    .line 182
    iget v0, p0, Lo/bqj;->d:I

    iput v0, p0, Lo/bqj;->b:I

    .line 183
    iget v0, p0, Lo/bqj;->d:I

    iput v0, p0, Lo/bqj;->a:I

    .line 186
    :cond_0
    :goto_0
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-lt v0, v1, :cond_1

    .line 188
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lo/bqj;->k:[C

    iget v2, p0, Lo/bqj;->b:I

    iget v3, p0, Lo/bqj;->a:I

    iget v4, p0, Lo/bqj;->b:I

    sub-int/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 191
    :cond_1
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_2

    .line 196
    :sswitch_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lo/bqj;->k:[C

    iget v2, p0, Lo/bqj;->b:I

    iget v3, p0, Lo/bqj;->a:I

    iget v4, p0, Lo/bqj;->b:I

    sub-int/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 198
    :sswitch_1
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lo/bqj;->a:I

    invoke-direct {p0}, Lo/bqj;->e()C

    move-result v2

    aput-char v2, v0, v1

    .line 199
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 200
    goto/16 :goto_0

    .line 202
    :sswitch_2
    iget v0, p0, Lo/bqj;->a:I

    iput v0, p0, Lo/bqj;->g:I

    .line 204
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 205
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lo/bqj;->a:I

    const/16 v2, 0x20

    aput-char v2, v0, v1

    .line 207
    :goto_1
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_2

    .line 209
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lo/bqj;->a:I

    const/16 v2, 0x20

    aput-char v2, v0, v1

    .line 207
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    goto :goto_1

    .line 211
    :cond_2
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x2c

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x2b

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_0

    .line 214
    :cond_3
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lo/bqj;->k:[C

    iget v2, p0, Lo/bqj;->b:I

    iget v3, p0, Lo/bqj;->g:I

    iget v4, p0, Lo/bqj;->b:I

    sub-int/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0

    .line 218
    :goto_2
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->a:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lo/bqj;->a:I

    iget-object v2, p0, Lo/bqj;->k:[C

    iget v3, p0, Lo/bqj;->d:I

    aget-char v2, v2, v3

    aput-char v2, v0, v1

    .line 219
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

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

.method private b()Ljava/lang/String;
    .locals 5

    .line 34
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 35
    iget v0, p0, Lo/bqj;->d:I

    iput v0, p0, Lo/bqj;->b:I

    .line 36
    iget v0, p0, Lo/bqj;->b:I

    iput v0, p0, Lo/bqj;->a:I

    .line 40
    :goto_0
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ne v0, v1, :cond_0

    .line 42
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected mEnd of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_0
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x22

    if-ne v0, v1, :cond_1

    .line 47
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 48
    goto :goto_2

    .line 50
    :cond_1
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x5c

    if-ne v0, v1, :cond_2

    .line 52
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->a:I

    invoke-direct {p0}, Lo/bqj;->e()C

    move-result v2

    aput-char v2, v0, v1

    goto :goto_1

    .line 56
    :cond_2
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->a:I

    iget-object v2, p0, Lo/bqj;->k:[C

    iget v3, p0, Lo/bqj;->d:I

    aget-char v2, v2, v3

    aput-char v2, v0, v1

    .line 58
    :goto_1
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 59
    iget v0, p0, Lo/bqj;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->a:I

    goto/16 :goto_0

    .line 62
    :goto_2
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ge v0, v1, :cond_3

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_3

    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    goto :goto_2

    .line 66
    :cond_3
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lo/bqj;->k:[C

    iget v2, p0, Lo/bqj;->b:I

    iget v3, p0, Lo/bqj;->a:I

    iget v4, p0, Lo/bqj;->b:I

    sub-int/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method private c()Ljava/lang/String;
    .locals 5

    .line 71
    :goto_0
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ge v0, v1, :cond_0

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    goto :goto_0

    .line 74
    :cond_0
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ne v0, v1, :cond_1

    .line 76
    const/4 v0, 0x0

    return-object v0

    .line 79
    :cond_1
    iget v0, p0, Lo/bqj;->d:I

    iput v0, p0, Lo/bqj;->b:I

    .line 81
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 82
    :goto_1
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ge v0, v1, :cond_2

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x3d

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-eq v0, v1, :cond_2

    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    goto :goto_1

    .line 86
    :cond_2
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-lt v0, v1, :cond_3

    .line 88
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected mEnd of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 92
    :cond_3
    iget v0, p0, Lo/bqj;->d:I

    iput v0, p0, Lo/bqj;->a:I

    .line 95
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_6

    .line 97
    :goto_2
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ge v0, v1, :cond_4

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x3d

    if-eq v0, v1, :cond_4

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_4

    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    goto :goto_2

    .line 101
    :cond_4
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x3d

    if-ne v0, v1, :cond_5

    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ne v0, v1, :cond_6

    .line 103
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected mEnd of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 107
    :cond_6
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 110
    :goto_3
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ge v0, v1, :cond_7

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_7

    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    goto :goto_3

    .line 114
    :cond_7
    iget v0, p0, Lo/bqj;->a:I

    iget v1, p0, Lo/bqj;->b:I

    sub-int/2addr v0, v1

    const/4 v1, 0x4

    if-le v0, v1, :cond_b

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->b:I

    add-int/lit8 v1, v1, 0x3

    aget-char v0, v0, v1

    const/16 v1, 0x2e

    if-ne v0, v1, :cond_b

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->b:I

    aget-char v0, v0, v1

    const/16 v1, 0x4f

    if-eq v0, v1, :cond_8

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->b:I

    aget-char v0, v0, v1

    const/16 v1, 0x6f

    if-ne v0, v1, :cond_b

    :cond_8
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->b:I

    add-int/lit8 v1, v1, 0x1

    aget-char v0, v0, v1

    const/16 v1, 0x49

    if-eq v0, v1, :cond_9

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->b:I

    add-int/lit8 v1, v1, 0x1

    aget-char v0, v0, v1

    const/16 v1, 0x69

    if-ne v0, v1, :cond_b

    :cond_9
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->b:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    const/16 v1, 0x44

    if-eq v0, v1, :cond_a

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->b:I

    add-int/lit8 v1, v1, 0x2

    aget-char v0, v0, v1

    const/16 v1, 0x64

    if-ne v0, v1, :cond_b

    .line 119
    :cond_a
    iget v0, p0, Lo/bqj;->b:I

    add-int/lit8 v0, v0, 0x4

    iput v0, p0, Lo/bqj;->b:I

    .line 122
    :cond_b
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lo/bqj;->k:[C

    iget v2, p0, Lo/bqj;->b:I

    iget v3, p0, Lo/bqj;->a:I

    iget v4, p0, Lo/bqj;->b:I

    sub-int/2addr v3, v4

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method private d()Ljava/lang/String;
    .locals 8

    .line 128
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x4

    iget v1, p0, Lo/bqj;->c:I

    if-lt v0, v1, :cond_0

    .line 130
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected mEnd of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 133
    :cond_0
    iget v0, p0, Lo/bqj;->d:I

    iput v0, p0, Lo/bqj;->b:I

    .line 134
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 138
    :goto_0
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x2b

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x2c

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_2

    .line 141
    :cond_1
    iget v0, p0, Lo/bqj;->d:I

    iput v0, p0, Lo/bqj;->a:I

    .line 142
    goto/16 :goto_2

    .line 145
    :cond_2
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_3

    .line 147
    iget v0, p0, Lo/bqj;->d:I

    iput v0, p0, Lo/bqj;->a:I

    .line 148
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 150
    :goto_1
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ge v0, v1, :cond_5

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x20

    if-ne v0, v1, :cond_5

    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    goto :goto_1

    .line 155
    :cond_3
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x41

    if-lt v0, v1, :cond_4

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x46

    if-gt v0, v1, :cond_4

    .line 157
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v2, v0, v1

    add-int/lit8 v2, v2, 0x20

    int-to-char v2, v2

    aput-char v2, v0, v1

    .line 160
    :cond_4
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    goto/16 :goto_0

    .line 164
    :cond_5
    :goto_2
    iget v0, p0, Lo/bqj;->a:I

    iget v1, p0, Lo/bqj;->b:I

    sub-int v4, v0, v1

    .line 165
    const/4 v0, 0x5

    if-lt v4, v0, :cond_6

    and-int/lit8 v0, v4, 0x1

    if-nez v0, :cond_7

    .line 167
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected mEnd of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 170
    :cond_7
    div-int/lit8 v0, v4, 0x2

    new-array v5, v0, [B

    .line 171
    const/4 v6, 0x0

    iget v0, p0, Lo/bqj;->b:I

    add-int/lit8 v7, v0, 0x1

    :goto_3
    array-length v0, v5

    if-ge v6, v0, :cond_8

    .line 173
    invoke-direct {p0, v7}, Lo/bqj;->a(I)I

    move-result v0

    int-to-byte v0, v0

    aput-byte v0, v5, v6

    .line 171
    add-int/lit8 v7, v7, 0x2

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 176
    :cond_8
    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lo/bqj;->k:[C

    iget v2, p0, Lo/bqj;->b:I

    invoke-direct {v0, v1, v2, v4}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

.method private e()C
    .locals 3

    .line 227
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 228
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ne v0, v1, :cond_0

    .line 230
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected mEnd of DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 233
    :cond_0
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 248
    :sswitch_0
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    return v0

    .line 250
    :goto_0
    invoke-direct {p0}, Lo/bqj;->i()C

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

.method private i()C
    .locals 6

    .line 377
    iget v0, p0, Lo/bqj;->d:I

    invoke-direct {p0, v0}, Lo/bqj;->a(I)I

    move-result v2

    .line 378
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 380
    const/16 v0, 0x80

    if-ge v2, v0, :cond_0

    .line 382
    int-to-char v0, v2

    return v0

    .line 384
    :cond_0
    const/16 v0, 0xc0

    if-lt v2, v0, :cond_7

    const/16 v0, 0xf7

    if-gt v2, v0, :cond_7

    .line 388
    const/16 v0, 0xdf

    if-gt v2, v0, :cond_1

    .line 390
    const/4 v3, 0x1

    .line 391
    and-int/lit8 v2, v2, 0x1f

    goto :goto_0

    .line 393
    :cond_1
    const/16 v0, 0xef

    if-gt v2, v0, :cond_2

    .line 395
    const/4 v3, 0x2

    .line 396
    and-int/lit8 v2, v2, 0xf

    goto :goto_0

    .line 400
    :cond_2
    const/4 v3, 0x3

    .line 401
    and-int/lit8 v2, v2, 0x7

    .line 405
    :goto_0
    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_6

    .line 407
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 408
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x5c

    if-eq v0, v1, :cond_4

    .line 410
    :cond_3
    const/16 v0, 0x3f

    return v0

    .line 412
    :cond_4
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 414
    iget v0, p0, Lo/bqj;->d:I

    invoke-direct {p0, v0}, Lo/bqj;->a(I)I

    move-result v4

    .line 415
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 416
    and-int/lit16 v0, v4, 0xc0

    const/16 v1, 0x80

    if-eq v0, v1, :cond_5

    .line 418
    const/16 v0, 0x3f

    return v0

    .line 421
    :cond_5
    shl-int/lit8 v0, v2, 0x6

    and-int/lit8 v1, v4, 0x3f

    add-int v2, v0, v1

    .line 405
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 423
    :cond_6
    int-to-char v0, v2

    return v0

    .line 427
    :cond_7
    const/16 v0, 0x3f

    return v0
.end method


# virtual methods
.method c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 311
    const/4 v0, 0x0

    iput v0, p0, Lo/bqj;->d:I

    .line 312
    const/4 v0, 0x0

    iput v0, p0, Lo/bqj;->b:I

    .line 313
    const/4 v0, 0x0

    iput v0, p0, Lo/bqj;->a:I

    .line 314
    const/4 v0, 0x0

    iput v0, p0, Lo/bqj;->g:I

    .line 315
    iget-object v0, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    iput-object v0, p0, Lo/bqj;->k:[C

    .line 317
    invoke-direct {p0}, Lo/bqj;->c()Ljava/lang/String;

    move-result-object v3

    .line 318
    if-nez v3, :cond_0

    .line 320
    const/4 v0, 0x0

    return-object v0

    .line 324
    :cond_0
    :goto_0
    const-string v4, ""

    .line 326
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-ne v0, v1, :cond_1

    .line 328
    const/4 v0, 0x0

    return-object v0

    .line 331
    :cond_1
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    .line 334
    :sswitch_0
    invoke-direct {p0}, Lo/bqj;->b()Ljava/lang/String;

    move-result-object v4

    .line 335
    goto :goto_2

    .line 337
    :sswitch_1
    invoke-direct {p0}, Lo/bqj;->d()Ljava/lang/String;

    move-result-object v4

    .line 338
    goto :goto_2

    .line 342
    :sswitch_2
    goto :goto_2

    .line 344
    :goto_1
    invoke-direct {p0}, Lo/bqj;->a()Ljava/lang/String;

    move-result-object v4

    .line 347
    :goto_2
    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 349
    return-object v4

    .line 352
    :cond_2
    iget v0, p0, Lo/bqj;->d:I

    iget v1, p0, Lo/bqj;->c:I

    if-lt v0, v1, :cond_3

    .line 354
    const/4 v0, 0x0

    return-object v0

    .line 357
    :cond_3
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x2c

    if-eq v0, v1, :cond_5

    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_4

    goto :goto_3

    .line 360
    :cond_4
    iget-object v0, p0, Lo/bqj;->k:[C

    iget v1, p0, Lo/bqj;->d:I

    aget-char v0, v0, v1

    const/16 v1, 0x2b

    if-eq v0, v1, :cond_5

    .line 362
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 365
    :cond_5
    :goto_3
    iget v0, p0, Lo/bqj;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/bqj;->d:I

    .line 366
    invoke-direct {p0}, Lo/bqj;->c()Ljava/lang/String;

    move-result-object v3

    .line 367
    if-nez v3, :cond_6

    .line 369
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Malformed DN: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lo/bqj;->e:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 371
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
