.class public Lo/ahz;
.super Lo/ahv;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/ahz$c;,
        Lo/ahz$a;
    }
.end annotation


# static fields
.field static c:J

.field private static k:[B


# instance fields
.field private final A:Lo/aik;

.field private B:Lo/ace;

.field private C:Z

.field private D:Z

.field private E:I

.field private F:Lo/ajv;

.field private G:[I

.field private H:Z

.field private I:Lo/aka;

.field private K:Landroid/os/Handler;

.field private final a:[I

.field private b:I

.field private final d:[I

.field private final e:[I

.field private f:I

.field private g:I

.field private h:Landroid/net/wifi/WifiManager$MulticastLock;

.field private i:Landroid/content/Context;

.field private final j:Lo/aia;

.field private l:J

.field private m:Ljava/lang/String;

.field private n:Lo/ahz$c;

.field private o:Lo/ahz$a;

.field private p:Lo/ajm;

.field private q:[I

.field private r:I

.field private s:I

.field private t:[I

.field private u:I

.field private final v:Landroid/net/wifi/WifiManager;

.field private w:[[I

.field private x:Z

.field private y:Ljava/lang/String;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 77
    const/16 v0, 0x800

    new-array v0, v0, [B

    sput-object v0, Lo/ahz;->k:[B

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lo/aij;Lo/ajm;)V
    .locals 6

    .line 112
    invoke-direct {p0}, Lo/ahv;-><init>()V

    .line 49
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    iput-object v0, p0, Lo/ahz;->e:[I

    .line 51
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    iput-object v0, p0, Lo/ahz;->d:[I

    .line 53
    const/4 v0, 0x3

    new-array v0, v0, [I

    fill-array-data v0, :array_2

    iput-object v0, p0, Lo/ahz;->a:[I

    .line 73
    const/4 v0, 0x0

    iput v0, p0, Lo/ahz;->b:I

    .line 75
    const/4 v0, 0x0

    iput v0, p0, Lo/ahz;->f:I

    .line 88
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lo/ahz;->l:J

    .line 92
    const/4 v0, 0x0

    iput v0, p0, Lo/ahz;->r:I

    .line 93
    const/4 v0, 0x0

    iput v0, p0, Lo/ahz;->s:I

    .line 94
    const/4 v0, 0x0

    iput v0, p0, Lo/ahz;->u:I

    .line 95
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz;->x:Z

    .line 96
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz;->z:Z

    .line 101
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz;->D:Z

    .line 105
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz;->C:Z

    .line 110
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz;->H:Z

    .line 217
    new-instance v0, Lo/ahz$2;

    move-object v1, p0

    const-wide/32 v2, 0x15f90

    const-wide/16 v4, 0x1388

    invoke-direct/range {v0 .. v5}, Lo/ahz$2;-><init>(Lo/ahz;JJ)V

    iput-object v0, p0, Lo/ahz;->I:Lo/aka;

    .line 297
    new-instance v0, Lo/ahz$1;

    invoke-direct {v0, p0}, Lo/ahz$1;-><init>(Lo/ahz;)V

    iput-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    .line 113
    iput-object p1, p0, Lo/ahz;->i:Landroid/content/Context;

    .line 114
    iput-object p3, p0, Lo/ahz;->p:Lo/ajm;

    .line 115
    iget-object v0, p2, Lo/aij;->c:[I

    iput-object v0, p0, Lo/ahz;->q:[I

    .line 116
    iget-object v0, p2, Lo/aij;->d:Ljava/lang/String;

    iput-object v0, p0, Lo/ahz;->m:Ljava/lang/String;

    .line 117
    new-instance v0, Lo/ajv;

    invoke-direct {v0}, Lo/ajv;-><init>()V

    iput-object v0, p0, Lo/ahz;->F:Lo/ajv;

    .line 118
    const-string v0, "CombinationTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mIpData: "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/ahz;->q:[I

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 119
    iget-object v0, p0, Lo/ahz;->q:[I

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 120
    const/4 v0, 0x1

    new-array v0, v0, [I

    iput-object v0, p0, Lo/ahz;->q:[I

    .line 122
    :cond_0
    iget-object v0, p0, Lo/ahz;->q:[I

    invoke-static {v0}, Lo/aid;->d([I)[I

    move-result-object v0

    iput-object v0, p0, Lo/ahz;->t:[I

    .line 123
    new-instance v0, Lo/ahz$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/ahz$a;-><init>(Lo/ahz;Lo/ahz$2;)V

    iput-object v0, p0, Lo/ahz;->o:Lo/ahz$a;

    .line 124
    new-instance v0, Lo/ahz$c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lo/ahz$c;-><init>(Lo/ahz;Lo/ahz$2;)V

    iput-object v0, p0, Lo/ahz;->n:Lo/ahz$c;

    .line 126
    new-instance v0, Lo/aik;

    invoke-direct {v0}, Lo/aik;-><init>()V

    iput-object v0, p0, Lo/ahz;->A:Lo/aik;

    .line 127
    iget-object v0, p0, Lo/ahz;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/aia;->b(Landroid/content/Context;)Lo/aia;

    move-result-object v0

    iput-object v0, p0, Lo/ahz;->j:Lo/aia;

    .line 128
    iget-object v0, p0, Lo/ahz;->i:Landroid/content/Context;

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    iput-object v0, p0, Lo/ahz;->v:Landroid/net/wifi/WifiManager;

    .line 129
    iget-object v0, p0, Lo/ahz;->q:[I

    invoke-static {v0}, Lo/aii;->c([I)[[I

    move-result-object v0

    iput-object v0, p0, Lo/ahz;->w:[[I

    .line 130
    iget-object v0, p2, Lo/aij;->a:Ljava/lang/String;

    iput-object v0, p0, Lo/ahz;->y:Ljava/lang/String;

    .line 131
    iget-object v0, p2, Lo/aij;->b:Lo/ace;

    iput-object v0, p0, Lo/ahz;->B:Lo/ace;

    .line 132
    return-void

    nop

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

.method static synthetic a(Lo/ahz;I)I
    .locals 0

    .line 41
    iput p1, p0, Lo/ahz;->b:I

    return p1
.end method

.method static synthetic a(Lo/ahz;)Lo/aka;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->I:Lo/aka;

    return-object v0
.end method

.method private a(ILjava/net/DatagramSocket;ILjava/lang/String;I)V
    .locals 16

    .line 593
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    .line 594
    sget-wide v0, Lo/ahz;->c:J

    sub-long v6, v4, v0

    .line 597
    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-gez v0, :cond_0

    .line 599
    const-wide/16 v6, 0x0

    .line 601
    :cond_0
    sput-wide v4, Lo/ahz;->c:J

    .line 603
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 606
    :sswitch_0
    move-object/from16 v0, p0

    :try_start_0
    iget-object v0, v0, Lo/ahz;->e:[I

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahz;->f:I

    aget v0, v0, v1

    int-to-long v0, v0

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    sub-long v8, v0, v6

    .line 607
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahz;->s:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lo/ahz;->s:I

    .line 608
    invoke-static/range {p4 .. p4}, Lo/aid;->d(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v0

    if-nez v0, :cond_1

    .line 609
    return-void

    .line 613
    :sswitch_1
    move-object/from16 v0, p0

    :try_start_1
    iget-object v0, v0, Lo/ahz;->a:[I

    move-object/from16 v1, p0

    iget v1, v1, Lo/ahz;->f:I

    aget v0, v0, v1

    int-to-long v0, v0

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    sub-long v8, v0, v6

    .line 614
    move-object/from16 v0, p0

    iget v0, v0, Lo/ahz;->u:I

    add-int/lit8 v0, v0, 0x1

    move-object/from16 v1, p0

    iput v0, v1, Lo/ahz;->u:I

    .line 615
    goto :goto_1

    .line 617
    :goto_0
    const-wide/16 v8, 0x0

    .line 621
    :cond_1
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v0, v8, v0

    if-lez v0, :cond_2

    const-wide/32 v0, 0xbebc200

    cmp-long v0, v8, v0

    if-gez v0, :cond_2

    .line 622
    sget-wide v0, Lo/ahz;->c:J

    add-long/2addr v0, v8

    sput-wide v0, Lo/ahz;->c:J

    .line 623
    const-wide/32 v0, 0xf4240

    div-long v0, v8, v0

    const-wide/32 v2, 0xf4240

    rem-long v2, v8, v2

    long-to-int v2, v2

    invoke-static {v0, v1, v2}, Ljava/lang/Thread;->sleep(JI)V

    .line 626
    :cond_2
    invoke-static/range {p4 .. p4}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v10

    .line 627
    new-instance v11, Ljava/net/DatagramPacket;

    sget-object v0, Lo/ahz;->k:[B

    move/from16 v1, p3

    move/from16 v2, p5

    invoke-direct {v11, v0, v1, v10, v2}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    .line 628
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v12

    .line 629
    move-object/from16 v0, p2

    invoke-virtual {v0, v11}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    .line 630
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v14

    .line 631
    move-object/from16 v0, p0

    iget-boolean v0, v0, Lo/ahz;->x:Z

    if-eqz v0, :cond_3

    .line 633
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v15, v12, v13}, Lo/ahz;->d(JJ)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    .line 639
    :cond_3
    goto :goto_2

    .line 635
    :catch_0
    move-exception v10

    .line 636
    const-string v0, "CombinationTask"

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

    .line 639
    goto :goto_2

    .line 637
    :catch_1
    move-exception v10

    .line 638
    const-string v0, "CombinationTask"

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

    .line 640
    :goto_2
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method

.method private a(Ljava/net/DatagramSocket;I)V
    .locals 6

    .line 581
    move-object v0, p0

    move-object v2, p1

    move v3, p2

    const-string v4, "255.255.255.255"

    const/4 v1, 0x2

    const v5, 0xe2cc

    invoke-direct/range {v0 .. v5}, Lo/ahz;->a(ILjava/net/DatagramSocket;ILjava/lang/String;I)V

    .line 582
    return-void
.end method

.method static synthetic b(Lo/ahz;)I
    .locals 1

    .line 41
    iget v0, p0, Lo/ahz;->E:I

    return v0
.end method

.method static synthetic b(Lo/ahz;Landroid/os/Message;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1}, Lo/ahz;->c(Landroid/os/Message;)V

    return-void
.end method

.method static synthetic b(Lo/ahz;Ljava/lang/String;Lo/ace;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lo/ahz;->c(Ljava/lang/String;Lo/ace;)V

    return-void
.end method

.method static synthetic b(Lo/ahz;Ljava/net/DatagramSocket;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lo/ahz;->e(Ljava/net/DatagramSocket;I)V

    return-void
.end method

.method static synthetic c(Lo/ahz;)Lo/ace;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->B:Lo/ace;

    return-object v0
.end method

.method private c(Landroid/os/Message;)V
    .locals 5

    .line 378
    iget-object v0, p0, Lo/ahz;->I:Lo/aka;

    invoke-virtual {v0}, Lo/aka;->d()V

    .line 379
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ahz;->D:Z

    .line 381
    :try_start_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 382
    const-string v0, "CombinationTask"

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

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 383
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "baseurl  is true"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Landroid/util/Patterns;->IP_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 384
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    sget-object v0, Landroid/util/Patterns;->IP_ADDRESS:Ljava/util/regex/Pattern;

    invoke-virtual {v0, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 386
    invoke-virtual {p0}, Lo/ahz;->c()V

    .line 387
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isStartflag: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/ahz;->H:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 388
    iget-object v0, p0, Lo/ahz;->F:Lo/ajv;

    const-string v1, "\u914d\u7f51\u6210\u529f"

    invoke-virtual {v0, v1}, Lo/ajv;->c(Ljava/lang/String;)V

    .line 389
    iget-object v0, p0, Lo/ahz;->p:Lo/ajm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-boolean v0, p0, Lo/ahz;->H:Z

    if-eqz v0, :cond_1

    .line 390
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz;->H:Z

    .line 391
    iget-object v0, p0, Lo/ahz;->p:Lo/ajm;

    invoke-interface {v0, v4}, Lo/ajm;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    .line 394
    :cond_0
    invoke-virtual {p0}, Lo/ahz;->c()V

    .line 395
    iget-object v0, p0, Lo/ahz;->F:Lo/ajv;

    const-string v1, "\u914d\u7f51\u5931\u8d25-\u83b7\u53d6URL\u5931\u8d25"

    const/16 v2, 0x835

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lo/ajv;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 396
    iget-object v0, p0, Lo/ahz;->p:Lo/ajm;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 397
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz;->H:Z

    .line 398
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "runAfterGetMessage  MULTICAST_ERROR_CONFIG_FAIL "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 399
    iget-object v0, p0, Lo/ahz;->p:Lo/ajm;

    const/16 v1, 0x835

    invoke-interface {v0, v1}, Lo/ajm;->onFailure(I)V
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 404
    :cond_1
    :goto_0
    goto :goto_1

    .line 402
    :catch_0
    move-exception v4

    .line 403
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/IndexOutOfBoundsException;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 405
    :goto_1
    const-string v0, "CombinationTask"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u603b\u8ba1\u79d2\u53d1\u4e86"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p0, Lo/ahz;->r:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, "\u4e2a\u5355\u64ad\uff0c"

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget v2, p0, Lo/ahz;->s:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, "\u7ec4\u64ad"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget v2, p0, Lo/ahz;->u:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    const-string v2, "\u5e7f\u64ad"

    const/4 v3, 0x6

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 406
    return-void
.end method

.method private c(Ljava/lang/String;Lo/ace;)V
    .locals 3

    .line 234
    new-instance v2, Lo/ais;

    invoke-direct {v2}, Lo/ais;-><init>()V

    .line 235
    const/16 v0, 0x8

    invoke-static {v0}, Lo/akc;->b(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lo/ais;->c:Ljava/lang/String;

    .line 236
    const-string v0, "1.0"

    iput-object v0, v2, Lo/ais;->b:Ljava/lang/String;

    .line 238
    iget-object v0, p0, Lo/ahz;->A:Lo/aik;

    new-instance v1, Lo/ahz$4;

    invoke-direct {v1, p0, p1}, Lo/ahz$4;-><init>(Lo/ahz;Ljava/lang/String;)V

    invoke-virtual {v0, v2, v1}, Lo/aik;->c(Lo/ais;Lo/aiq$d;)V

    .line 295
    return-void
.end method

.method private c(Ljava/net/MulticastSocket;I)V
    .locals 4

    .line 696
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lo/ahz;->m:Ljava/lang/String;

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

    .line 697
    const/4 v3, 0x0

    :goto_0
    if-ge v3, p2, :cond_0

    .line 698
    const/16 v0, 0x130

    invoke-direct {p0, p1, v0, v2}, Lo/ahz;->c(Ljava/net/MulticastSocket;ILjava/lang/String;)V

    .line 697
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 700
    :cond_0
    return-void
.end method

.method private c(Ljava/net/MulticastSocket;ILjava/lang/String;)V
    .locals 6

    .line 586
    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    const/4 v1, 0x0

    const v5, 0xe290

    invoke-direct/range {v0 .. v5}, Lo/ahz;->a(ILjava/net/DatagramSocket;ILjava/lang/String;I)V

    .line 587
    return-void
.end method

.method static synthetic c(Lo/ahz;Ljava/net/MulticastSocket;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lo/ahz;->c(Ljava/net/MulticastSocket;I)V

    return-void
.end method

.method static synthetic c(Lo/ahz;Ljava/net/MulticastSocket;ILjava/lang/String;)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2, p3}, Lo/ahz;->c(Ljava/net/MulticastSocket;ILjava/lang/String;)V

    return-void
.end method

.method private d(JJ)V
    .locals 4

    .line 644
    sub-long v0, p1, p3

    const-wide/32 v2, 0x4c4b40

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 645
    iget-boolean v0, p0, Lo/ahz;->z:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/ahz;->e:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const/4 v1, 0x2

    if-gt v0, v1, :cond_0

    .line 646
    iget-object v0, p0, Lo/ahz;->e:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x4

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 647
    iget-object v0, p0, Lo/ahz;->d:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 648
    iget-object v0, p0, Lo/ahz;->a:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x4

    const/4 v2, 0x0

    aput v1, v0, v2

    goto :goto_0

    .line 649
    :cond_0
    sub-long v0, p1, p3

    const-wide/32 v2, 0x2faf080

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    .line 650
    iget-object v0, p0, Lo/ahz;->e:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 651
    iget-object v0, p0, Lo/ahz;->d:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 652
    iget-object v0, p0, Lo/ahz;->a:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x2

    const/4 v2, 0x0

    aput v1, v0, v2

    goto :goto_0

    .line 655
    :cond_1
    iget-object v0, p0, Lo/ahz;->e:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 657
    iget-object v0, p0, Lo/ahz;->a:[I

    const/4 v1, 0x0

    aget v1, v0, v1

    add-int/lit8 v1, v1, 0x1

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 660
    :goto_0
    iget-object v0, p0, Lo/ahz;->e:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const/16 v1, 0xa

    if-ge v0, v1, :cond_2

    iget-wide v0, p0, Lo/ahz;->l:J

    sub-long v0, p1, v0

    const-wide v2, 0x2540be400L

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    .line 661
    iget-object v0, p0, Lo/ahz;->e:[I

    const/16 v1, 0xa

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 662
    iget-object v0, p0, Lo/ahz;->d:[I

    const/16 v1, 0xa

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 663
    iget-object v0, p0, Lo/ahz;->a:[I

    const/16 v1, 0xa

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 666
    :cond_2
    iget-object v0, p0, Lo/ahz;->e:[I

    const/4 v1, 0x0

    aget v0, v0, v1

    const/16 v1, 0xc8

    if-le v0, v1, :cond_3

    .line 667
    iget-object v0, p0, Lo/ahz;->e:[I

    const/16 v1, 0xc8

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 668
    iget-object v0, p0, Lo/ahz;->d:[I

    const/16 v1, 0xc8

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 669
    iget-object v0, p0, Lo/ahz;->a:[I

    const/16 v1, 0xc8

    const/4 v2, 0x0

    aput v1, v0, v2

    .line 672
    :cond_3
    return-void
.end method

.method static synthetic d(Lo/ahz;Ljava/net/DatagramSocket;I)V
    .locals 0

    .line 41
    invoke-direct {p0, p1, p2}, Lo/ahz;->a(Ljava/net/DatagramSocket;I)V

    return-void
.end method

.method static synthetic d(Lo/ahz;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lo/ahz;->D:Z

    return v0
.end method

.method static synthetic d(Lo/ahz;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lo/ahz;->D:Z

    return p1
.end method

.method static synthetic e(Lo/ahz;)Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->y:Ljava/lang/String;

    return-object v0
.end method

.method private e(Ljava/net/DatagramSocket;I)V
    .locals 4

    .line 680
    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    .line 682
    const/16 v2, 0x8

    .line 683
    invoke-direct {p0, p1, v2}, Lo/ahz;->a(Ljava/net/DatagramSocket;I)V

    .line 685
    const/16 v3, 0xf

    .line 686
    invoke-direct {p0, p1, v3}, Lo/ahz;->a(Ljava/net/DatagramSocket;I)V

    .line 680
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 688
    :cond_0
    return-void
.end method

.method static synthetic e(Lo/ahz;Z)Z
    .locals 0

    .line 41
    iput-boolean p1, p0, Lo/ahz;->C:Z

    return p1
.end method

.method static synthetic f(Lo/ahz;)Lo/ajv;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->F:Lo/ajv;

    return-object v0
.end method

.method private f()V
    .locals 2

    .line 161
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 162
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 163
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/4 v1, 0x7

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 164
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/4 v1, 0x5

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 165
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 166
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 167
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 168
    return-void
.end method

.method private g()Ljava/lang/String;
    .locals 12

    .line 783
    iget v0, p0, Lo/ahz;->r:I

    div-int/lit16 v0, v0, 0x1f4

    const/16 v1, 0x63

    if-le v0, v1, :cond_0

    const/16 v4, 0x63

    goto :goto_0

    :cond_0
    iget v0, p0, Lo/ahz;->r:I

    div-int/lit16 v4, v0, 0x1f4

    .line 784
    :goto_0
    iget v0, p0, Lo/ahz;->s:I

    div-int/lit16 v0, v0, 0x1f4

    const/16 v1, 0x63

    if-le v0, v1, :cond_1

    const/16 v5, 0x63

    goto :goto_1

    :cond_1
    iget v0, p0, Lo/ahz;->s:I

    div-int/lit16 v5, v0, 0x1f4

    .line 785
    :goto_1
    iget v0, p0, Lo/ahz;->u:I

    div-int/lit16 v0, v0, 0x1f4

    const/16 v1, 0x63

    if-le v0, v1, :cond_2

    const/16 v6, 0x63

    goto :goto_2

    :cond_2
    iget v0, p0, Lo/ahz;->u:I

    div-int/lit16 v6, v0, 0x1f4

    .line 786
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

    .line 787
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    .line 788
    const-string v0, "%02d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    .line 789
    const-string v0, "-%03d"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lo/ahz;->e:[I

    const/4 v3, 0x0

    aget v2, v2, v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 790
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 791
    iget v0, p0, Lo/ahz;->b:I

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 792
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic g(Lo/ahz;)Lo/aia;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->j:Lo/aia;

    return-object v0
.end method

.method static synthetic h(Lo/ahz;)Landroid/content/Context;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->i:Landroid/content/Context;

    return-object v0
.end method

.method private h()V
    .locals 9

    .line 801
    iget-object v0, p0, Lo/ahz;->w:[[I

    if-eqz v0, :cond_3

    .line 802
    iget-object v0, p0, Lo/ahz;->w:[[I

    array-length v0, v0

    if-lez v0, :cond_0

    .line 803
    iget-object v0, p0, Lo/ahz;->w:[[I

    array-length v0, v0

    new-array v0, v0, [I

    iput-object v0, p0, Lo/ahz;->G:[I

    .line 806
    :cond_0
    const/4 v4, 0x0

    :goto_0
    iget-object v0, p0, Lo/ahz;->w:[[I

    array-length v0, v0

    if-ge v4, v0, :cond_2

    .line 807
    iget-object v0, p0, Lo/ahz;->w:[[I

    aget-object v0, v0, v4

    invoke-static {v0}, Lo/ajw;->c([I)[B

    move-result-object v5

    .line 808
    new-instance v6, Ljava/lang/String;

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-direct {v6, v5, v0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 809
    invoke-static {v6}, Lo/aii;->b(Ljava/lang/String;)Landroid/net/wifi/WifiConfiguration;

    move-result-object v7

    .line 810
    iget-object v0, p0, Lo/ahz;->v:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0, v7}, Landroid/net/wifi/WifiManager;->addNetwork(Landroid/net/wifi/WifiConfiguration;)I

    move-result v8

    .line 811
    iget-object v0, p0, Lo/ahz;->G:[I

    aput v8, v0, v4

    .line 812
    iget-object v0, p0, Lo/ahz;->v:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->saveConfiguration()Z

    .line 813
    const-string v0, "CombinationTask"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addNetwork "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " sdk api "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 814
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-ge v0, v1, :cond_1

    .line 815
    iget-object v0, p0, Lo/ahz;->v:Landroid/net/wifi/WifiManager;

    const/4 v1, 0x0

    invoke-virtual {v0, v8, v1}, Landroid/net/wifi/WifiManager;->enableNetwork(IZ)Z

    .line 806
    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    goto :goto_1

    .line 819
    :cond_3
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "configMsg is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 821
    :goto_1
    return-void
.end method

.method static synthetic i(Lo/ahz;)Ljava/lang/String;
    .locals 1

    .line 41
    invoke-direct {p0}, Lo/ahz;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic k(Lo/ahz;)Landroid/os/Handler;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic l(Lo/ahz;)Z
    .locals 1

    .line 41
    iget-boolean v0, p0, Lo/ahz;->C:Z

    return v0
.end method

.method static synthetic m(Lo/ahz;)Lo/ahz$a;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->o:Lo/ahz$a;

    return-object v0
.end method

.method static synthetic n(Lo/ahz;)Lo/ajm;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->p:Lo/ajm;

    return-object v0
.end method

.method static synthetic o(Lo/ahz;)V
    .locals 0

    .line 41
    invoke-direct {p0}, Lo/ahz;->h()V

    return-void
.end method

.method static synthetic p(Lo/ahz;)I
    .locals 1

    .line 41
    iget v0, p0, Lo/ahz;->b:I

    return v0
.end method

.method static synthetic q(Lo/ahz;)[I
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->q:[I

    return-object v0
.end method

.method static synthetic r(Lo/ahz;)Landroid/net/wifi/WifiManager;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->v:Landroid/net/wifi/WifiManager;

    return-object v0
.end method

.method static synthetic s(Lo/ahz;)Ljava/lang/String;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->m:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic t(Lo/ahz;)[I
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->G:[I

    return-object v0
.end method

.method static synthetic u(Lo/ahz;)[I
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->t:[I

    return-object v0
.end method

.method static synthetic w(Lo/ahz;)Lo/ahz$c;
    .locals 1

    .line 41
    iget-object v0, p0, Lo/ahz;->n:Lo/ahz$c;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 150
    iget v0, p0, Lo/ahz;->b:I

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 151
    const/4 v0, 0x0

    iput v0, p0, Lo/ahz;->b:I

    goto :goto_0

    .line 153
    :cond_0
    iget v0, p0, Lo/ahz;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo/ahz;->b:I

    .line 155
    :goto_0
    return-void
.end method

.method public a(I)V
    .locals 0

    .line 409
    iput p1, p0, Lo/ahz;->f:I

    .line 410
    return-void
.end method

.method public b()V
    .locals 2

    .line 142
    iget-object v0, p0, Lo/ahz;->v:Landroid/net/wifi/WifiManager;

    const-string v1, "health.test"

    invoke-virtual {v0, v1}, Landroid/net/wifi/WifiManager;->createMulticastLock(Ljava/lang/String;)Landroid/net/wifi/WifiManager$MulticastLock;

    move-result-object v0

    iput-object v0, p0, Lo/ahz;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    .line 143
    iget-object v0, p0, Lo/ahz;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->acquire()V

    .line 144
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 134
    iput p1, p0, Lo/ahz;->E:I

    .line 135
    return-void
.end method

.method public c()V
    .locals 4

    .line 443
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "disableMulticast: stopTask"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 445
    invoke-direct {p0}, Lo/ahz;->f()V

    .line 448
    iget-object v0, p0, Lo/ahz;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/aii;->b(Landroid/content/Context;)Z

    .line 449
    iget-object v0, p0, Lo/ahz;->o:Lo/ahz$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 450
    iget-object v0, p0, Lo/ahz;->o:Lo/ahz$a;

    invoke-virtual {v0}, Lo/ahz$a;->b()V

    .line 454
    :cond_0
    iget-object v0, p0, Lo/ahz;->n:Lo/ahz$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 455
    iget-object v0, p0, Lo/ahz;->n:Lo/ahz$c;

    invoke-virtual {v0}, Lo/ahz$c;->b()V

    .line 458
    :cond_1
    iget-object v0, p0, Lo/ahz;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz v0, :cond_2

    .line 459
    iget-object v0, p0, Lo/ahz;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 460
    iget-object v0, p0, Lo/ahz;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V

    .line 463
    :cond_2
    iget-object v0, p0, Lo/ahz;->I:Lo/aka;

    invoke-virtual {v0}, Lo/aka;->d()V

    .line 464
    return-void
.end method

.method public d()V
    .locals 4

    .line 418
    const-string v0, "CombinationTask"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "startTask SDK_INT "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 419
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ahz;->H:Z

    .line 420
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ahz;->x:Z

    .line 421
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ahz;->z:Z

    .line 422
    invoke-virtual {p0}, Lo/ahz;->b()V

    .line 423
    invoke-virtual {p0}, Lo/ahz;->k()V

    .line 424
    return-void
.end method

.method public e()V
    .locals 4

    .line 429
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "disableMulticast: pauseTask"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 430
    iget-object v0, p0, Lo/ahz;->i:Landroid/content/Context;

    invoke-static {v0}, Lo/aii;->b(Landroid/content/Context;)Z

    .line 431
    iget-object v0, p0, Lo/ahz;->o:Lo/ahz$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 432
    iget-object v0, p0, Lo/ahz;->o:Lo/ahz$a;

    invoke-virtual {v0}, Lo/ahz$a;->b()V

    .line 434
    :cond_0
    iget-object v0, p0, Lo/ahz;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    if-eqz v0, :cond_1

    .line 435
    iget-object v0, p0, Lo/ahz;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->isHeld()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 436
    iget-object v0, p0, Lo/ahz;->h:Landroid/net/wifi/WifiManager$MulticastLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$MulticastLock;->release()V

    .line 439
    :cond_1
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 413
    iput p1, p0, Lo/ahz;->g:I

    .line 414
    return-void
.end method

.method public k()V
    .locals 5

    .line 174
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, p0, Lo/ahz;->l:J

    .line 175
    const-string v0, "CombinationTask"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "startMulticast: start time is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-wide v3, p0, Lo/ahz;->l:J

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 176
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lo/ahz;->e(I)V

    .line 177
    iget v0, p0, Lo/ahz;->g:I

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    .line 179
    :sswitch_0
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/4 v1, 0x5

    const-wide/16 v2, 0x7530

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 180
    goto :goto_1

    .line 182
    :sswitch_1
    const/4 v0, 0x0

    iput v0, p0, Lo/ahz;->b:I

    .line 183
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/16 v1, 0x8

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 184
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/4 v1, 0x5

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 185
    goto :goto_1

    .line 187
    :goto_0
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/4 v1, 0x5

    const-wide/32 v2, 0xea60

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 190
    :goto_1
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/32 v2, 0x15f90

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 193
    iget-object v0, p0, Lo/ahz;->o:Lo/ahz$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 194
    iget-object v0, p0, Lo/ahz;->o:Lo/ahz$a;

    invoke-virtual {v0}, Lo/ahz$a;->c()V

    .line 198
    :cond_0
    iget-object v0, p0, Lo/ahz;->n:Lo/ahz$c;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 199
    iget-object v0, p0, Lo/ahz;->n:Lo/ahz$c;

    invoke-virtual {v0}, Lo/ahz$c;->c()V

    .line 202
    :cond_1
    const-string v0, "Xiaomi"

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 203
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/16 v1, 0x9

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_2

    .line 205
    :cond_2
    iget-object v0, p0, Lo/ahz;->K:Landroid/os/Handler;

    const/16 v1, 0x9

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 208
    :goto_2
    iget-object v0, p0, Lo/ahz;->I:Lo/aka;

    invoke-virtual {v0}, Lo/aka;->e()Lo/aka;

    .line 209
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ahz;->D:Z

    .line 210
    iget-object v0, p0, Lo/ahz;->F:Lo/ajv;

    const-string v1, "\u8bbe\u5907\u70ed\u70b9"

    invoke-virtual {v0, v1}, Lo/ajv;->a(Ljava/lang/String;)V

    .line 211
    iget-object v0, p0, Lo/ahz;->F:Lo/ajv;

    invoke-virtual {v0}, Lo/ajv;->b()V

    .line 212
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method
