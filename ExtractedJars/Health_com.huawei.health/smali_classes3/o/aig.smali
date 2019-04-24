.class public Lo/aig;
.super Lo/ahv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aig$d;,
        Lo/aig$e;
    }
.end annotation


# static fields
.field static b:J

.field private static f:[B


# instance fields
.field private final a:[I

.field private final c:[I

.field private final d:[I

.field private e:I

.field private g:I

.field private h:Landroid/net/wifi/WifiManager$MulticastLock;

.field private i:I

.field private k:Landroid/content/Context;

.field private l:Ljava/lang/String;

.field private m:Lo/ajm;

.field private n:J

.field private o:Lo/aig$e;

.field private p:Lo/aig$d;

.field private q:I

.field private r:I

.field private s:I

.field private t:[I

.field private u:[I

.field private v:Lo/ajv;

.field private w:Z

.field private x:Landroid/os/Handler;

.field private y:Z

.field private final z:Landroid/net/wifi/WifiManager;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 65
    const/16 v0, 0x800

    new-array v0, v0, [B

    sput-object v0, Lo/aig;->f:[B

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/aij;Lo/ajm;)V
    .locals 2

    .line 89
    invoke-direct {p0}, Lo/ahv;-><init>()V

    .line 39
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/aig;->a:[I

    .line 41
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lo/aig;->c:[I

    .line 43
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    iput-object v0, p0, Lo/aig;->d:[I

    .line 61
    const/4 v0, 0x0

    iput v0, p0, Lo/aig;->e:I

    .line 63
    const/4 v0, 0x0

    iput v0, p0, Lo/aig;->i:I

    .line 76
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/aig;->n:J

    .line 80
    const/4 v0, 0x0

    iput v0, p0, Lo/aig;->q:I

    .line 81
    const/4 v0, 0x0

    iput v0, p0, Lo/aig;->s:I

    .line 82
    const/4 v0, 0x0

    iput v0, p0, Lo/aig;->r:I

    .line 83
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aig;->w:Z

    .line 84
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/aig;->y:Z

    .line 196
    new-instance v0, Lo/aig$5;

    invoke-direct {v0, p0}, Lo/aig$5;-><init>(Lo/aig;)V

    iput-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    .line 90
    iput-object p1, p0, Lo/aig;->k:Landroid/content/Context;

    .line 91
    iput-object p3, p0, Lo/aig;->m:Lo/ajm;

    .line 92
    iget-object v0, p2, Lo/aij;->c:[I

    iput-object v0, p0, Lo/aig;->u:[I

    .line 93
    iget-object v0, p2, Lo/aij;->d:Ljava/lang/String;

    iput-object v0, p0, Lo/aig;->l:Ljava/lang/String;

    .line 94
    iget-object v0, p0, Lo/aig;->u:[I

    invoke-static {v0}, Lo/aid;->d([I)[I

    move-result-object v0

    iput-object v0, p0, Lo/aig;->t:[I

    .line 95
    new-instance v0, Lo/aig$e;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/aig$e;-><init>(Lo/aig;Lo/aig$5;)V

    iput-object v0, p0, Lo/aig;->o:Lo/aig$e;

    .line 96
    new-instance v0, Lo/aig$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/aig$d;-><init>(Lo/aig;Lo/aig$5;)V

    iput-object v0, p0, Lo/aig;->p:Lo/aig$d;

    .line 99
    iget-object v0, p0, Lo/aig;->k:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lo/aig;->z:Landroid/net/wifi/WifiManager;

    .line 100
    new-instance v0, Lo/ajv;

    const-string v1, "\u7ec4\u64ad/\u5e7f\u64ad/Probe"

    invoke-direct {v0, v1}, Lo/ajv;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lo/aig;->v:Lo/ajv;

    .line 101
    iget-object v0, p0, Lo/aig;->v:Lo/ajv;

    invoke-virtual {v0}, Lo/ajv;->b()V

    .line 102
    return-void

    :array_0
    .array-data 4
        0x2
        0x8
        0x10
    .end array-data

    :array_1
    .array-data 4
        0x2
        0x3
        0x6
    .end array-data

    :array_2
    .array-data 4
        0x2
        0x5
        0xa
    .end array-data
.end method

.method static synthetic a(Lo/aig;)Landroid/content/Context;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aig;->k:Landroid/content/Context;

    return-object v0
.end method

.method private a(JJ)V
    .locals 4

    .line 551
    sub-long v0, p1, p3

    const-wide/32 v2, 0x4c4b40

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 554
    iget-boolean v0, p0, Lo/aig;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/aig;->a:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    .line 556
    iget-object v0, p0, Lo/aig;->a:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x4

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 557
    iget-object v0, p0, Lo/aig;->c:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 558
    iget-object v0, p0, Lo/aig;->d:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x4

    const/4 v2, 0x0

    aput v1, v0, v2

    goto :goto_0

    .line 560
    :cond_0
    sub-long v0, p1, p3

    const-wide/32 v2, 0x2faf080

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 562
    iget-object v0, p0, Lo/aig;->a:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 563
    iget-object v0, p0, Lo/aig;->c:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 564
    iget-object v0, p0, Lo/aig;->d:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    aput v1, v0, v2

    goto :goto_0

    .line 568
    :cond_1
    iget-object v0, p0, Lo/aig;->a:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 570
    iget-object v0, p0, Lo/aig;->d:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 581
    :goto_0
    iget-object v0, p0, Lo/aig;->a:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const/16 v1, 0xa

    if-ge v0, v1, :cond_2

    iget-wide v0, p0, Lo/aig;->n:J

    sub-long v0, p1, v0

    const-wide v2, 0x2540be400L

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 584
    iget-object v0, p0, Lo/aig;->a:[I

    const/16 v1, 0xa

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 585
    iget-object v0, p0, Lo/aig;->c:[I

    const/16 v1, 0xa

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 586
    iget-object v0, p0, Lo/aig;->d:[I

    const/16 v1, 0xa

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 589
    :cond_2
    iget-object v0, p0, Lo/aig;->a:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const/16 v1, 0xc8

    if-le v0, v1, :cond_3

    .line 592
    iget-object v0, p0, Lo/aig;->a:[I

    const/16 v1, 0xc8

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 593
    iget-object v0, p0, Lo/aig;->c:[I

    const/16 v1, 0xc8

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 594
    iget-object v0, p0, Lo/aig;->d:[I

    const/16 v1, 0xc8

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 597
    :cond_3
    return-void
.end method

.method private a(Ljava/net/MulticastSocket;I)V
    .locals 4

    .line 621
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/aig;->l:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x7f

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x8d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 622
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p2, :cond_0

    .line 623
    const/16 v0, 0x130

    invoke-direct {p0, p1, v0, v2}, Lo/aig;->a(Ljava/net/MulticastSocket;ILjava/lang/String;)V

    .line 622
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 625
    :cond_0
    return-void
.end method

.method private a(Ljava/net/MulticastSocket;ILjava/lang/String;)V
    .locals 6

    .line 472
    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    const/4 v1, 0x0

    const v5, 0xe290

    invoke-direct/range {v0 .. v5}, Lo/aig;->c(ILjava/net/DatagramSocket;ILjava/lang/String;I)V

    .line 473
    return-void
.end method

.method static synthetic b(Lo/aig;)Lo/ajm;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aig;->m:Lo/ajm;

    return-object v0
.end method

.method private b(Landroid/os/Message;)V
    .locals 5

    .line 269
    :try_start_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 270
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 271
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "baseurl  is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 273
    invoke-virtual {p0}, Lo/aig;->c()V

    .line 274
    invoke-virtual {p0}, Lo/aig;->i()V

    .line 275
    iget-object v0, p0, Lo/aig;->v:Lo/ajv;

    const-string v1, "\u914d\u7f51\u6210\u529f"

    invoke-virtual {v0, v1}, Lo/ajv;->c(Ljava/lang/String;)V

    .line 276
    iget-object v0, p0, Lo/aig;->m:Lo/ajm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 277
    iget-object v0, p0, Lo/aig;->m:Lo/ajm;

    invoke-interface {v0, v4}, Lo/ajm;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    .line 280
    :cond_0
    invoke-virtual {p0}, Lo/aig;->c()V

    .line 281
    iget-object v0, p0, Lo/aig;->m:Lo/ajm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 282
    iget-object v0, p0, Lo/aig;->m:Lo/ajm;

    const/16 v1, 0x835

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V

    .line 284
    :cond_1
    iget-object v0, p0, Lo/aig;->v:Lo/ajv;

    const-string v1, "\u914d\u7f51\u5931\u8d25-\u83b7\u53d6URL\u5931\u8d25"

    const/16 v2, 0x835

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/ajv;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 288
    :cond_2
    :goto_0
    goto :goto_1

    .line 286
    :catch_0
    move-exception v4

    .line 287
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 289
    :goto_1
    const-string v0, "MulticastTask"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u603b\u8ba1\u79d2\u53d1\u4e86"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/aig;->q:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "\u4e2a\u5355\u64ad\uff0c"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/aig;->s:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "\u7ec4\u64ad"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lo/aig;->r:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "\u5e7f\u64ad"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 290
    return-void
.end method

.method static synthetic b(Lo/aig;Ljava/net/DatagramSocket;I)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Lo/aig;->c(Ljava/net/DatagramSocket;I)V

    return-void
.end method

.method static synthetic b(Lo/aig;Ljava/net/MulticastSocket;I)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Lo/aig;->a(Ljava/net/MulticastSocket;I)V

    return-void
.end method

.method static synthetic c(Lo/aig;)Ljava/lang/String;
    .locals 1

    .line 28
    invoke-direct {p0}, Lo/aig;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private c(ILjava/net/DatagramSocket;ILjava/lang/String;I)V
    .locals 16

    .line 490
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    .line 491
    sget-wide v0, Lo/aig;->b:J

    sub-long v6, v4, v0

    .line 494
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-gez v0, :cond_0

    .line 496
    const-wide/16 v6, 0x0

    .line 498
    :cond_0
    sput-wide v4, Lo/aig;->b:J

    .line 501
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 504
    :sswitch_0
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/aig;->a:[I

    move-object/from16 v1, p0

    iget v1, v1, Lo/aig;->i:I

    aget v0, v0, v1

    int-to-long v0, v0

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    sub-long v8, v0, v6

    .line 505
    move-object/from16 v0, p0

    iget v0, v0, Lo/aig;->s:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lo/aig;->s:I

    .line 506
    invoke-static/range {p4 .. p4}, Lo/aid;->d(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-nez v0, :cond_1

    .line 507
    return-void

    .line 515
    :sswitch_1
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lo/aig;->d:[I

    move-object/from16 v1, p0

    iget v1, v1, Lo/aig;->i:I

    aget v0, v0, v1

    int-to-long v0, v0

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    sub-long v8, v0, v6

    .line 516
    move-object/from16 v0, p0

    iget v0, v0, Lo/aig;->r:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lo/aig;->r:I

    .line 517
    goto :goto_1

    .line 519
    :goto_0
    const-wide/16 v8, 0x0

    .line 523
    :cond_1
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-lez v0, :cond_2

    const-wide/32 v0, 0xbebc200

    cmp-long v0, v8, v0

    if-gez v0, :cond_2

    .line 525
    sget-wide v0, Lo/aig;->b:J

    add-long/2addr v0, v8

    sput-wide v0, Lo/aig;->b:J

    .line 526
    const-wide/32 v0, 0xf4240

    div-long v0, v8, v0

    const-wide/32 v2, 0xf4240

    rem-long v2, v8, v2

    long-to-int v2, v2

    invoke-static {v0, v1, v2}, Ljava/lang/Thread;->sleep(JI)V

    .line 529
    :cond_2
    invoke-static/range {p4 .. p4}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v10

    .line 530
    new-instance v11, Ljava/net/DatagramPacket;

    sget-object v0, Lo/aig;->f:[B

    move/from16 v1, p3

    move/from16 v2, p5

    invoke-direct {v11, v0, v1, v10, v2}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    .line 531
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v12

    .line 532
    move-object/from16 v0, p2

    invoke-virtual {v0, v11}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 533
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v14

    .line 535
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/aig;->w:Z

    if-eqz v0, :cond_3

    .line 538
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v15, v12, v13}, Lo/aig;->a(JJ)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 546
    :cond_3
    goto :goto_2

    .line 542
    :catch_0
    move-exception v10

    .line 543
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "current Index"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    move/from16 v3, p3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 546
    goto :goto_2

    .line 544
    :catch_1
    move-exception v10

    .line 545
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unit sleep failed, "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v10}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 547
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method private c(Ljava/net/DatagramSocket;I)V
    .locals 6

    .line 467
    move-object v0, p0

    move-object v2, p1

    move v3, p2

    const-string v4, "255.255.255.255"

    const/4 v1, 0x2

    const v5, 0xe2cc

    invoke-direct/range {v0 .. v5}, Lo/aig;->c(ILjava/net/DatagramSocket;ILjava/lang/String;I)V

    .line 468
    return-void
.end method

.method static synthetic c(Lo/aig;Ljava/net/DatagramSocket;I)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2}, Lo/aig;->d(Ljava/net/DatagramSocket;I)V

    return-void
.end method

.method static synthetic d(Lo/aig;I)I
    .locals 0

    .line 28
    iput p1, p0, Lo/aig;->e:I

    return p1
.end method

.method private d(Ljava/net/DatagramSocket;I)V
    .locals 4

    .line 605
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 607
    const/16 v2, 0x8

    .line 608
    invoke-direct {p0, p1, v2}, Lo/aig;->c(Ljava/net/DatagramSocket;I)V

    .line 610
    const/16 v3, 0xf

    .line 611
    invoke-direct {p0, p1, v3}, Lo/aig;->c(Ljava/net/DatagramSocket;I)V

    .line 605
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 613
    :cond_0
    return-void
.end method

.method static synthetic d(Lo/aig;Landroid/os/Message;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1}, Lo/aig;->b(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic d(Lo/aig;Ljava/net/MulticastSocket;ILjava/lang/String;)V
    .locals 0

    .line 28
    invoke-direct {p0, p1, p2, p3}, Lo/aig;->a(Ljava/net/MulticastSocket;ILjava/lang/String;)V

    return-void
.end method

.method static synthetic d(Lo/aig;)[I
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aig;->a:[I

    return-object v0
.end method

.method static synthetic e(Lo/aig;)Lo/ajv;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aig;->v:Lo/ajv;

    return-object v0
.end method

.method static synthetic f(Lo/aig;)Lo/aig$e;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aig;->o:Lo/aig$e;

    return-object v0
.end method

.method static synthetic g(Lo/aig;)I
    .locals 1

    .line 28
    iget v0, p0, Lo/aig;->r:I

    return v0
.end method

.method private g()Ljava/lang/String;
    .locals 12

    .line 708
    iget v0, p0, Lo/aig;->q:I

    div-int/lit16 v0, v0, 0x1f4

    const/16 v1, 0x63

    if-le v0, v1, :cond_0

    const/16 v4, 0x63

    goto :goto_0

    :cond_0
    iget v0, p0, Lo/aig;->q:I

    div-int/lit16 v4, v0, 0x1f4

    .line 709
    :goto_0
    iget v0, p0, Lo/aig;->s:I

    div-int/lit16 v0, v0, 0x1f4

    const/16 v1, 0x63

    if-le v0, v1, :cond_1

    const/16 v5, 0x63

    goto :goto_1

    :cond_1
    iget v0, p0, Lo/aig;->s:I

    div-int/lit16 v5, v0, 0x1f4

    .line 710
    :goto_1
    iget v0, p0, Lo/aig;->r:I

    div-int/lit16 v0, v0, 0x1f4

    const/16 v1, 0x63

    if-le v0, v1, :cond_2

    const/16 v6, 0x63

    goto :goto_2

    :cond_2
    iget v0, p0, Lo/aig;->r:I

    div-int/lit16 v6, v0, 0x1f4

    .line 711
    :goto_2
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 712
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 713
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 714
    const-string v0, "-%03d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/aig;->a:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 715
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 716
    iget v0, p0, Lo/aig;->e:I

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 717
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic h(Lo/aig;)I
    .locals 1

    .line 28
    iget v0, p0, Lo/aig;->s:I

    return v0
.end method

.method private h()V
    .locals 2

    .line 151
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 152
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 153
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 154
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 155
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 156
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 157
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 158
    return-void
.end method

.method static synthetic i(Lo/aig;)I
    .locals 1

    .line 28
    iget v0, p0, Lo/aig;->e:I

    return v0
.end method

.method static synthetic k(Lo/aig;)Landroid/net/wifi/WifiManager;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aig;->z:Landroid/net/wifi/WifiManager;

    return-object v0
.end method

.method static synthetic l(Lo/aig;)[I
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aig;->t:[I

    return-object v0
.end method

.method static synthetic m(Lo/aig;)Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aig;->l:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic n(Lo/aig;)Lo/aig$d;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aig;->p:Lo/aig$d;

    return-object v0
.end method

.method static synthetic o(Lo/aig;)[I
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aig;->u:[I

    return-object v0
.end method

.method static synthetic p(Lo/aig;)Landroid/os/Handler;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 116
    iget v0, p0, Lo/aig;->e:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 117
    const/4 v0, 0x0

    iput v0, p0, Lo/aig;->e:I

    goto :goto_0

    .line 119
    :cond_0
    iget v0, p0, Lo/aig;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/aig;->e:I

    .line 121
    :goto_0
    return-void
.end method

.method public b()V
    .locals 2

    .line 108
    iget-object v0, p0, Lo/aig;->z:Landroid/net/wifi/WifiManager;

    const-string v1, "health_wifi.test"

    invoke-virtual {v0, v1}, Landroid/net/wifi/WifiManager;->createMulticastLock(Ljava/lang/String;)Landroid/net/wifi/WifiManager$MulticastLock;

    move-result-object v0

    iput-object v0, p0, Lo/aig;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    .line 109
    iget-object v0, p0, Lo/aig;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->acquire()V

    .line 110
    return-void
.end method

.method public c()V
    .locals 4

    .line 325
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "disableMulticast: in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 327
    invoke-direct {p0}, Lo/aig;->h()V

    .line 328
    iget-object v0, p0, Lo/aig;->o:Lo/aig$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 329
    iget-object v0, p0, Lo/aig;->o:Lo/aig$e;

    invoke-virtual {v0}, Lo/aig$e;->b()V

    .line 333
    :cond_0
    iget-object v0, p0, Lo/aig;->p:Lo/aig$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 334
    iget-object v0, p0, Lo/aig;->p:Lo/aig$d;

    invoke-virtual {v0}, Lo/aig$d;->b()V

    .line 337
    :cond_1
    iget-object v0, p0, Lo/aig;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz v0, :cond_2

    .line 338
    iget-object v0, p0, Lo/aig;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 339
    iget-object v0, p0, Lo/aig;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V

    .line 343
    :cond_2
    return-void
.end method

.method public d()V
    .locals 1

    .line 302
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aig;->w:Z

    .line 303
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/aig;->y:Z

    .line 304
    invoke-virtual {p0}, Lo/aig;->b()V

    .line 305
    invoke-virtual {p0}, Lo/aig;->f()V

    .line 306
    return-void
.end method

.method public d(I)V
    .locals 0

    .line 297
    iput p1, p0, Lo/aig;->g:I

    .line 298
    return-void
.end method

.method public e()V
    .locals 4

    .line 311
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "disableMulticastAp"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lo/aig;->o:Lo/aig$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 314
    iget-object v0, p0, Lo/aig;->o:Lo/aig$e;

    invoke-virtual {v0}, Lo/aig$e;->b()V

    .line 316
    :cond_0
    iget-object v0, p0, Lo/aig;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz v0, :cond_1

    .line 317
    iget-object v0, p0, Lo/aig;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 318
    iget-object v0, p0, Lo/aig;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V

    .line 321
    :cond_1
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 293
    iput p1, p0, Lo/aig;->i:I

    .line 294
    return-void
.end method

.method public f()V
    .locals 5

    .line 165
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/aig;->n:J

    .line 166
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startMulticast: start time is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/aig;->n:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 168
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/aig;->d(I)V

    .line 169
    iget v0, p0, Lo/aig;->g:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 171
    :sswitch_0
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 172
    goto :goto_1

    .line 174
    :sswitch_1
    const/4 v0, 0x0

    iput v0, p0, Lo/aig;->e:I

    .line 175
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x6

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 176
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 177
    goto :goto_1

    .line 179
    :goto_0
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 182
    :goto_1
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/32 v2, 0x15f90

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 184
    iget-object v0, p0, Lo/aig;->o:Lo/aig$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 185
    iget-object v0, p0, Lo/aig;->o:Lo/aig$e;

    invoke-virtual {v0}, Lo/aig$e;->e()V

    .line 189
    :cond_0
    iget-object v0, p0, Lo/aig;->p:Lo/aig$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 190
    iget-object v0, p0, Lo/aig;->p:Lo/aig$d;

    invoke-virtual {v0}, Lo/aig$d;->d()V

    .line 192
    :cond_1
    iget-object v0, p0, Lo/aig;->x:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 193
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public i()V
    .locals 4

    .line 126
    const-string v0, "MulticastTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "disableMulticast: in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 128
    invoke-direct {p0}, Lo/aig;->h()V

    .line 131
    iget-object v0, p0, Lo/aig;->o:Lo/aig$e;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 132
    iget-object v0, p0, Lo/aig;->o:Lo/aig$e;

    invoke-virtual {v0}, Lo/aig$e;->b()V

    .line 136
    :cond_0
    iget-object v0, p0, Lo/aig;->p:Lo/aig$d;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 137
    iget-object v0, p0, Lo/aig;->p:Lo/aig$d;

    invoke-virtual {v0}, Lo/aig$d;->b()V

    .line 140
    :cond_1
    iget-object v0, p0, Lo/aig;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz v0, :cond_2

    .line 141
    iget-object v0, p0, Lo/aig;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 142
    iget-object v0, p0, Lo/aig;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V

    .line 145
    :cond_2
    return-void
.end method
