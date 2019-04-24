.class public Lo/aic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aic$b;
    }
.end annotation


# static fields
.field private static a:Z


# instance fields
.field private b:Landroid/content/Context;

.field private c:Lo/aie;

.field private d:Lo/ajm;

.field private e:Ljava/lang/String;

.field private f:[I

.field private g:[B

.field private h:[B

.field private i:I

.field private k:Ljava/lang/String;

.field private m:I

.field private o:Lo/ahv;

.field private p:Landroid/os/Handler;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 31
    const/4 v0, 0x1

    sput-boolean v0, Lo/aic;->a:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/aie;Lo/ajm;)V
    .locals 1

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    const-string v0, ""

    iput-object v0, p0, Lo/aic;->e:Ljava/lang/String;

    .line 43
    const-string v0, ""

    iput-object v0, p0, Lo/aic;->k:Ljava/lang/String;

    .line 58
    new-instance v0, Lo/aic$3;

    invoke-direct {v0, p0}, Lo/aic$3;-><init>(Lo/aic;)V

    iput-object v0, p0, Lo/aic;->p:Landroid/os/Handler;

    .line 48
    iput-object p1, p0, Lo/aic;->b:Landroid/content/Context;

    .line 49
    iput-object p3, p0, Lo/aic;->d:Lo/ajm;

    .line 50
    iput-object p2, p0, Lo/aic;->c:Lo/aie;

    .line 51
    iget-object v0, p2, Lo/aie;->l:Ljava/lang/String;

    iput-object v0, p0, Lo/aic;->e:Ljava/lang/String;

    .line 52
    return-void
.end method

.method static synthetic a(Lo/aic;)I
    .locals 1

    .line 26
    iget v0, p0, Lo/aic;->m:I

    return v0
.end method

.method static synthetic a(Lo/aic;[B)[B
    .locals 1

    .line 26
    invoke-direct {p0, p1}, Lo/aic;->c([B)[B

    move-result-object v0

    return-object v0
.end method

.method public static b(II)I
    .locals 4

    .line 133
    shr-int/lit8 v0, p1, 0x4

    add-int/lit8 v2, v0, -0x1

    .line 134
    add-int/lit8 v3, p0, -0x1

    .line 135
    shl-int/lit8 v0, v2, 0x5

    or-int/2addr v0, v3

    return v0
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 279
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 280
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    .line 281
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 282
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b()V
    .locals 21

    .line 172
    const-string v0, "MulticastMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateIpData: in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 173
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->g:[B

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->h:[B

    array-length v0, v0

    if-nez v0, :cond_1

    .line 174
    :cond_0
    const/4 v0, 0x0

    sput-boolean v0, Lo/aic;->a:Z

    .line 175
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->d:Lo/ajm;

    const/16 v1, 0x837

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V

    .line 176
    return-void

    .line 178
    :cond_1
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->c:Lo/aie;

    iget-object v4, v0, Lo/aie;->d:Ljava/lang/String;

    .line 179
    if-nez v4, :cond_2

    .line 180
    return-void

    .line 182
    :cond_2
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    array-length v5, v0

    .line 183
    const-string v0, "MulticastMessage"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ssidStr="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    const-string v2, " String.length="

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "  byte[].length="

    const/4 v3, 0x4

    aput-object v2, v1, v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 184
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->h:[B

    array-length v6, v0

    .line 185
    const/4 v7, 0x1

    .line 186
    const/4 v8, 0x1

    .line 187
    const/4 v9, 0x1

    .line 188
    const/16 v10, 0x10

    .line 189
    const/4 v11, 0x1

    .line 190
    add-int/lit8 v0, v5, 0x14

    add-int v12, v0, v6

    .line 193
    rem-int/lit8 v0, v12, 0x2

    if-eqz v0, :cond_3

    .line 194
    add-int/lit8 v12, v12, 0x1

    .line 195
    new-array v0, v12, [I

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/aic;->f:[I

    .line 196
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    add-int/lit8 v1, v12, -0x1

    const/4 v2, 0x0

    aput v2, v0, v1

    goto :goto_0

    .line 198
    :cond_3
    new-array v0, v12, [I

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/aic;->f:[I

    .line 202
    :goto_0
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->e:Ljava/lang/String;

    move-object/from16 v1, p0

    invoke-direct {v1, v0}, Lo/aic;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/aic;->k:Ljava/lang/String;

    .line 203
    const/4 v13, 0x0

    .line 205
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/aic;->k:Ljava/lang/String;

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v13, v0

    .line 208
    goto :goto_1

    .line 206
    :catch_0
    move-exception v14

    .line 207
    const-string v0, "MulticastMessage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UnsupportedEncodingException e:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v14}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 209
    :goto_1
    const-string v0, "MulticastMessage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "info :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v13}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 210
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    invoke-static {v13}, Lo/akc;->d([B)I

    move-result v1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 214
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 217
    move-object/from16 v0, p0

    iget v0, v0, Lo/aic;->i:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_4

    .line 218
    const-string v0, "MulticastMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateIpData HAND_ADD_WIFIAP_MODE "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 219
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    const/16 v1, 0xf

    const/4 v2, 0x2

    aput v1, v0, v2

    goto :goto_2

    .line 222
    :cond_4
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    invoke-direct/range {p0 .. p0}, Lo/aic;->k()I

    move-result v1

    const/4 v2, 0x2

    aput v1, v0, v2

    .line 226
    :goto_2
    const/4 v14, 0x0

    :goto_3
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->g:[B

    array-length v0, v0

    if-ge v14, v0, :cond_5

    .line 227
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    add-int/lit8 v1, v14, 0x3

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/aic;->g:[B

    aget-byte v2, v2, v14

    aput v2, v0, v1

    .line 226
    add-int/lit8 v14, v14, 0x1

    goto :goto_3

    .line 231
    :cond_5
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    invoke-static {v5, v6}, Lo/aic;->b(II)I

    move-result v1

    const/16 v2, 0x13

    aput v1, v0, v2

    .line 234
    const/16 v14, 0x14

    .line 235
    add-int/lit8 v15, v5, 0x14

    .line 236
    invoke-virtual/range {p0 .. p0}, Lo/aic;->e()I

    move-result v16

    .line 238
    if-lez v16, :cond_6

    .line 239
    const/16 v15, 0x14

    .line 240
    add-int/lit8 v14, v6, 0x14

    .line 243
    :cond_6
    const/16 v17, 0x0

    .line 245
    const-string v0, "UTF-8"

    :try_start_1
    invoke-virtual {v4, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    move-object/from16 v17, v0

    .line 248
    goto :goto_4

    .line 246
    :catch_1
    move-exception v18

    .line 247
    const-string v0, "MulticastMessage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UnsupportedEncodingException e:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual/range {v18 .. v18}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 250
    :goto_4
    if-eqz v17, :cond_7

    move-object/from16 v0, v17

    array-length v0, v0

    if-lez v0, :cond_7

    .line 251
    const/16 v18, 0x0

    :goto_5
    move/from16 v0, v18

    if-ge v0, v5, :cond_7

    .line 252
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    add-int v1, v14, v18

    aget-byte v2, v17, v18

    aput v2, v0, v1

    .line 251
    add-int/lit8 v18, v18, 0x1

    goto :goto_5

    .line 257
    :cond_7
    const/16 v18, 0x0

    :goto_6
    move/from16 v0, v18

    if-ge v0, v6, :cond_8

    .line 258
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    add-int v1, v15, v18

    move-object/from16 v2, p0

    iget-object v2, v2, Lo/aic;->h:[B

    aget-byte v2, v2, v18

    aput v2, v0, v1

    .line 257
    add-int/lit8 v18, v18, 0x1

    goto :goto_6

    .line 262
    :cond_8
    add-int/lit8 v0, v5, 0x12

    add-int v18, v0, v6

    .line 263
    move/from16 v0, v18

    new-array v0, v0, [B

    move-object/from16 v19, v0

    .line 264
    const/16 v20, 0x0

    :goto_7
    move/from16 v0, v20

    move/from16 v1, v18

    if-ge v0, v1, :cond_9

    .line 265
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    add-int/lit8 v1, v20, 0x2

    aget v0, v0, v1

    int-to-byte v0, v0

    aput-byte v0, v19, v20

    .line 264
    add-int/lit8 v20, v20, 0x1

    goto :goto_7

    .line 268
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    invoke-static/range {v19 .. v19}, Lo/akc;->d([B)I

    move-result v1

    const/4 v2, 0x1

    aput v1, v0, v2

    .line 269
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    invoke-static {v0}, Lo/ajw;->b([I)[I

    move-result-object v0

    move-object/from16 v1, p0

    iput-object v0, v1, Lo/aic;->f:[I

    .line 270
    move-object/from16 v0, p0

    iget-object v0, v0, Lo/aic;->f:[I

    invoke-static {v0}, Lo/ajw;->c([I)[B

    move-result-object v20

    .line 271
    const-string v0, "MulticastMessage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateIpData Hex : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static/range {v20 .. v20}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 272
    const-string v0, "MulticastMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "generateIpData: out"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 273
    return-void
.end method

.method private b(ILo/aij;)V
    .locals 3

    .line 93
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 95
    :pswitch_0
    new-instance v0, Lo/aig;

    iget-object v1, p0, Lo/aic;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/aic;->d:Lo/ajm;

    invoke-direct {v0, v1, p2, v2}, Lo/aig;-><init>(Landroid/content/Context;Lo/aij;Lo/ajm;)V

    iput-object v0, p0, Lo/aic;->o:Lo/ahv;

    .line 96
    goto :goto_1

    .line 98
    :pswitch_1
    new-instance v0, Lo/aif;

    iget-object v1, p0, Lo/aic;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/aic;->d:Lo/ajm;

    invoke-direct {v0, v1, p2, v2}, Lo/aif;-><init>(Landroid/content/Context;Lo/aij;Lo/ajm;)V

    iput-object v0, p0, Lo/aic;->o:Lo/ahv;

    .line 99
    goto :goto_1

    .line 102
    :goto_0
    :pswitch_2
    new-instance v0, Lo/ahz;

    iget-object v1, p0, Lo/aic;->b:Landroid/content/Context;

    iget-object v2, p0, Lo/aic;->d:Lo/ajm;

    invoke-direct {v0, v1, p2, v2}, Lo/ahz;-><init>(Landroid/content/Context;Lo/aij;Lo/ajm;)V

    iput-object v0, p0, Lo/aic;->o:Lo/ahv;

    .line 103
    iget v0, p0, Lo/aic;->i:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    .line 104
    iget-object v0, p0, Lo/aic;->o:Lo/ahv;

    check-cast v0, Lo/ahz;

    iget v1, p0, Lo/aic;->i:I

    invoke-virtual {v0, v1}, Lo/ahz;->b(I)V

    .line 108
    :cond_0
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method static synthetic b(Lo/aic;)[I
    .locals 1

    .line 26
    iget-object v0, p0, Lo/aic;->f:[I

    return-object v0
.end method

.method static synthetic c(Lo/aic;)Landroid/content/Context;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/aic;->b:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic c(Lo/aic;ILo/aij;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2}, Lo/aic;->b(ILo/aij;)V

    return-void
.end method

.method private c([B)[B
    .locals 4

    .line 299
    const/16 v0, 0x10

    new-array v2, v0, [B

    .line 300
    if-eqz p1, :cond_0

    array-length v0, p1

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 301
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x10

    if-ge v3, v0, :cond_0

    .line 302
    aget-byte v0, p1, v3

    aput-byte v0, v2, v3

    .line 301
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 305
    :cond_0
    return-object v2
.end method

.method static synthetic d(Lo/aic;)Lo/aie;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/aic;->c:Lo/aie;

    return-object v0
.end method

.method static synthetic e(Lo/aic;)Lo/ahv;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/aic;->o:Lo/ahv;

    return-object v0
.end method

.method private f()V
    .locals 4

    .line 290
    const-string v0, "MulticastMessage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "encryptKeyData: in mode "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aic;->c:Lo/aie;

    iget v2, v2, Lo/aie;->g:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 291
    iget-object v0, p0, Lo/aic;->c:Lo/aie;

    iget v0, v0, Lo/aie;->g:I

    iget-object v1, p0, Lo/aic;->c:Lo/aie;

    iget-object v1, v1, Lo/aie;->i:[B

    iget-object v2, p0, Lo/aic;->c:Lo/aie;

    iget-object v2, v2, Lo/aie;->f:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Lo/ajw;->e(I[BLjava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lo/aic;->g:[B

    .line 292
    iget-object v0, p0, Lo/aic;->g:[B

    if-nez v0, :cond_0

    .line 293
    const-string v0, "MulticastMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "encryptKeyData: out mKeyEncodeData is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 295
    :cond_0
    return-void
.end method

.method static synthetic f(Lo/aic;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lo/aic;->f()V

    return-void
.end method

.method static synthetic g(Lo/aic;)Landroid/os/Handler;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/aic;->p:Landroid/os/Handler;

    return-object v0
.end method

.method private h()V
    .locals 6

    .line 312
    const-string v0, "MulticastMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "encryptValueData: in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lo/aic;->c:Lo/aie;

    iget-object v4, v0, Lo/aie;->c:Ljava/lang/String;

    .line 315
    if-nez v4, :cond_0

    .line 316
    return-void

    .line 318
    :cond_0
    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v5

    .line 319
    iget-object v0, p0, Lo/aic;->c:Lo/aie;

    iget-object v0, v0, Lo/aie;->f:Ljava/lang/String;

    iget-object v1, p0, Lo/aic;->c:Lo/aie;

    iget-object v1, v1, Lo/aie;->k:[B

    invoke-static {v5, v0, v1}, Lo/ajt;->d([BLjava/lang/String;[B)[B

    move-result-object v0

    iput-object v0, p0, Lo/aic;->h:[B

    .line 320
    const-string v0, "MulticastMessage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "encryptValueData mValueEncodeData :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aic;->h:[B

    invoke-static {v2}, Lo/ajw;->d([B)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 321
    return-void
.end method

.method static synthetic h(Lo/aic;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lo/aic;->b()V

    return-void
.end method

.method static synthetic i(Lo/aic;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Lo/aic;->h()V

    return-void
.end method

.method private k()I
    .locals 6

    .line 338
    invoke-virtual {p0}, Lo/aic;->e()I

    move-result v3

    .line 339
    const/4 v4, 0x1

    .line 341
    iget-object v0, p0, Lo/aic;->c:Lo/aie;

    iget v5, v0, Lo/aie;->g:I

    .line 342
    sparse-switch v5, :sswitch_data_0

    goto :goto_0

    .line 344
    :sswitch_0
    const/4 v4, 0x1

    .line 345
    goto :goto_0

    .line 347
    :sswitch_1
    const/4 v4, 0x3

    .line 348
    goto :goto_0

    .line 350
    :sswitch_2
    const/4 v4, 0x2

    .line 351
    .line 355
    :goto_0
    and-int/lit8 v0, v3, 0xf

    and-int/lit8 v1, v4, 0xf

    shl-int/lit8 v1, v1, 0x4

    or-int/2addr v0, v1

    return v0

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0x65 -> :sswitch_2
        0x6e -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic k(Lo/aic;)[B
    .locals 1

    .line 26
    iget-object v0, p0, Lo/aic;->h:[B

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 114
    sget-boolean v0, Lo/aic;->a:Z

    if-nez v0, :cond_0

    .line 115
    const-string v0, "MulticastMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startMulticast: multicast failed"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 116
    return-void

    .line 118
    :cond_0
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/aic$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/aic$b;-><init>(Lo/aic;Lo/aic$3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v4

    .line 119
    invoke-interface {v4}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 120
    const-string v0, "MulticastMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "submit isDone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 122
    :cond_1
    return-void
.end method

.method public b(I)V
    .locals 1

    .line 55
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/ahn;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lo/aic;->m:I

    .line 56
    return-void
.end method

.method public c()V
    .locals 2

    .line 368
    iget-object v0, p0, Lo/aic;->p:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 369
    return-void
.end method

.method public c(I)V
    .locals 0

    .line 394
    iput p1, p0, Lo/aic;->i:I

    .line 395
    return-void
.end method

.method public d()V
    .locals 2

    .line 361
    iget-object v0, p0, Lo/aic;->p:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 362
    return-void
.end method

.method public e()I
    .locals 9

    .line 375
    const/4 v4, 0x0

    .line 377
    iget-object v0, p0, Lo/aic;->e:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    .line 378
    const/4 v0, 0x4

    if-le v5, v0, :cond_0

    .line 379
    const-string v0, "MulticastMessage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSsidVersion char "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/aic;->e:Ljava/lang/String;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 380
    iget-object v0, p0, Lo/aic;->e:Ljava/lang/String;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v6

    .line 381
    invoke-static {v6}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v7

    .line 382
    const-string v0, "MulticastMessage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSsidVersion str "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 384
    :try_start_0
    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v4, v0

    .line 387
    goto :goto_0

    .line 385
    :catch_0
    move-exception v8

    .line 386
    const-string v0, "MulticastMessage"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v8}, Ljava/lang/NumberFormatException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 388
    :goto_0
    const-string v0, "MulticastMessage"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getSsidVersion version "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 390
    :cond_0
    return v4
.end method
