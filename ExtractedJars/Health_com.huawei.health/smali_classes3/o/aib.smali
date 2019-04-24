.class public Lo/aib;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aib$d;,
        Lo/aib$e;,
        Lo/aib$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lo/aie;

.field private c:Lo/aib$e;

.field private d:[B

.field private e:Lo/ajm;

.field private g:Lo/aib$d;

.field private h:Landroid/content/Context;

.field private i:Landroid/os/Handler;

.field private volatile k:I


# direct methods
.method public constructor <init>(Lo/aie;Ljava/lang/String;Lo/ajm;)V
    .locals 1

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aib;->c:Lo/aib$e;

    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aib;->g:Lo/aib$d;

    .line 59
    const/4 v0, 0x0

    iput v0, p0, Lo/aib;->k:I

    .line 63
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aib;->h:Landroid/content/Context;

    .line 109
    new-instance v0, Lo/aib$2;

    invoke-direct {v0, p0}, Lo/aib$2;-><init>(Lo/aib;)V

    iput-object v0, p0, Lo/aib;->i:Landroid/os/Handler;

    .line 66
    iput-object p3, p0, Lo/aib;->e:Lo/ajm;

    .line 67
    iput-object p1, p0, Lo/aib;->b:Lo/aie;

    .line 68
    iput-object p2, p0, Lo/aib;->a:Ljava/lang/String;

    .line 69
    const/4 v0, 0x0

    iput v0, p0, Lo/aib;->k:I

    .line 70
    return-void
.end method

.method private a(Lo/aie;)B
    .locals 7

    .line 313
    const/4 v4, 0x1

    const/4 v5, 0x0

    .line 315
    iget-object v0, p1, Lo/aie;->l:Ljava/lang/String;

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 316
    array-length v0, v6

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    .line 317
    const/4 v0, 0x3

    aget-object v0, v6, v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x30

    if-ne v1, v0, :cond_0

    .line 318
    const/4 v5, 0x0

    .line 321
    :cond_0
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "AssembleDataPackageget VersionMode: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p1, Lo/aie;->g:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 322
    iget v0, p1, Lo/aie;->g:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 324
    :sswitch_0
    const/4 v4, 0x1

    .line 325
    goto :goto_0

    .line 327
    :sswitch_1
    const/4 v4, 0x3

    .line 328
    goto :goto_0

    .line 330
    :sswitch_2
    const/4 v4, 0x2

    .line 331
    .line 335
    :goto_0
    shl-int/lit8 v0, v4, 0x4

    or-int/lit8 v0, v0, 0x0

    int-to-byte v0, v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0x65 -> :sswitch_2
        0x6e -> :sswitch_1
    .end sparse-switch
.end method

.method static synthetic a(Lo/aib;)Lo/ajm;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/aib;->e:Lo/ajm;

    return-object v0
.end method

.method private a()V
    .locals 2

    .line 96
    iget-object v0, p0, Lo/aib;->c:Lo/aib$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 97
    iget-object v0, p0, Lo/aib;->c:Lo/aib$e;

    invoke-virtual {v0}, Lo/aib$e;->e()V

    .line 98
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aib;->c:Lo/aib$e;

    .line 100
    :cond_0
    iget-object v0, p0, Lo/aib;->g:Lo/aib$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 101
    iget-object v0, p0, Lo/aib;->g:Lo/aib$d;

    invoke-virtual {v0}, Lo/aib$d;->e()V

    .line 102
    const/4 v0, 0x0

    iput-object v0, p0, Lo/aib;->g:Lo/aib$d;

    .line 104
    :cond_1
    iget-object v0, p0, Lo/aib;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 105
    const/4 v0, 0x0

    iput v0, p0, Lo/aib;->k:I

    .line 106
    return-void
.end method

.method private static b([BII)B
    .locals 5

    .line 283
    const/16 v2, 0xff

    .line 284
    move v3, p1

    :goto_0
    if-ge v3, p2, :cond_2

    .line 285
    aget-byte v0, p0, v3

    and-int/lit16 v0, v0, 0xff

    xor-int/2addr v2, v0

    .line 286
    const/4 v4, 0x0

    :goto_1
    const/16 v0, 0x8

    if-ge v4, v0, :cond_1

    .line 287
    and-int/lit8 v0, v2, 0x1

    if-eqz v0, :cond_0

    .line 288
    shr-int/lit8 v2, v2, 0x1

    .line 289
    xor-int/lit16 v2, v2, 0xb8

    goto :goto_2

    .line 291
    :cond_0
    shr-int/lit8 v2, v2, 0x1

    .line 286
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 284
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 295
    :cond_2
    and-int/lit16 v0, v2, 0xff

    int-to-byte v0, v0

    return v0
.end method

.method static synthetic b(Lo/aib;)Lo/aib$e;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/aib;->c:Lo/aib$e;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)[B
    .locals 6

    .line 251
    const/4 v4, 0x0

    .line 252
    const/4 v0, 0x0

    if-eq v0, p0, :cond_0

    .line 254
    const-string v0, "UTF-8"

    :try_start_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    move-object v4, v0

    .line 257
    goto :goto_0

    .line 255
    :catch_0
    move-exception v5

    .line 256
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "UnsupportedEncodingException e:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v5}, Ljava/io/UnsupportedEncodingException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 260
    :cond_0
    :goto_0
    return-object v4
.end method

.method private b([B)[B
    .locals 4

    .line 265
    const/16 v0, 0x10

    new-array v2, v0, [B

    .line 266
    if-eqz p1, :cond_0

    array-length v0, p1

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 267
    const/4 v3, 0x0

    :goto_0
    const/16 v0, 0x10

    if-ge v3, v0, :cond_0

    .line 268
    aget-byte v0, p1, v3

    aput-byte v0, v2, v3

    .line 267
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 271
    :cond_0
    return-object v2
.end method

.method static synthetic c(Lo/aib;)Landroid/os/Handler;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/aib;->i:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic d(Lo/aib;Lo/aie;)B
    .locals 1

    .line 40
    invoke-direct {p0, p1}, Lo/aib;->a(Lo/aie;)B

    move-result v0

    return v0
.end method

.method static synthetic d([BII)B
    .locals 1

    .line 40
    invoke-static {p0, p1, p2}, Lo/aib;->b([BII)B

    move-result v0

    return v0
.end method

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 275
    const-string v0, "-"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 276
    array-length v0, v3

    const/4 v1, 0x4

    if-ge v0, v1, :cond_0

    .line 277
    const-string v0, ""

    return-object v0

    .line 278
    :cond_0
    const/4 v0, 0x3

    aget-object v0, v3, v0

    const/4 v1, 0x1

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/aib;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 40
    invoke-direct {p0, p1}, Lo/aib;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lo/aib;Lo/aib$d;)Lo/aib$d;
    .locals 0

    .line 40
    iput-object p1, p0, Lo/aib;->g:Lo/aib$d;

    return-object p1
.end method

.method static synthetic d(Lo/aib;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lo/aib;->a()V

    return-void
.end method

.method static synthetic d(Lo/aib;[B)[B
    .locals 1

    .line 40
    invoke-direct {p0, p1}, Lo/aib;->b([B)[B

    move-result-object v0

    return-object v0
.end method

.method static synthetic e(Lo/aib;)Lo/aib$d;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/aib;->g:Lo/aib$d;

    return-object v0
.end method

.method static synthetic e(Lo/aib;Lo/aib$e;)Lo/aib$e;
    .locals 0

    .line 40
    iput-object p1, p0, Lo/aib;->c:Lo/aib$e;

    return-object p1
.end method

.method static synthetic e(Lo/aib;[B)[B
    .locals 0

    .line 40
    iput-object p1, p0, Lo/aib;->d:[B

    return-object p1
.end method

.method static synthetic f(Lo/aib;)Landroid/content/Context;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/aib;->h:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic g(Lo/aib;)[B
    .locals 1

    .line 40
    iget-object v0, p0, Lo/aib;->d:[B

    return-object v0
.end method

.method static synthetic i(Lo/aib;)Lo/aie;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/aib;->b:Lo/aie;

    return-object v0
.end method

.method static synthetic k(Lo/aib;)Ljava/lang/String;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/aib;->a:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public b(Landroid/content/Context;)V
    .locals 5

    .line 73
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startDeviceSoftAPTask enter:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/aib;->k:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 74
    iput-object p1, p0, Lo/aib;->h:Landroid/content/Context;

    .line 75
    iget v0, p0, Lo/aib;->k:I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 76
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lo/aib$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lo/aib$a;-><init>(Lo/aib;Lo/aib$2;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-result-object v4

    .line 77
    invoke-interface {v4}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 78
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "submit isDone"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 79
    const/4 v0, 0x1

    iput v0, p0, Lo/aib;->k:I

    .line 81
    :cond_0
    goto :goto_0

    .line 82
    :cond_1
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "softAp task is doing"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 84
    :goto_0
    return-void
.end method

.method public e()V
    .locals 4

    .line 87
    const-string v0, "AddSoftApDeviceTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "stopDeviceSoftAPTask enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 88
    iget-object v0, p0, Lo/aib;->c:Lo/aib$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 89
    iget-object v0, p0, Lo/aib;->c:Lo/aib$e;

    invoke-virtual {v0}, Lo/aib$e;->e()V

    .line 91
    :cond_0
    iget-object v0, p0, Lo/aib;->i:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 92
    iget-object v0, p0, Lo/aib;->i:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 93
    return-void
.end method
