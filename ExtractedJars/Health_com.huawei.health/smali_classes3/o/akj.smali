.class public Lo/akj;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/akj$a;
    }
.end annotation


# static fields
.field private static a:Lo/akj$a;

.field private static b:Lo/akj;

.field private static final g:Ljava/lang/Object;


# instance fields
.field private c:Z

.field private d:I

.field public e:Lo/ajd;

.field private f:Lo/afj;

.field private h:Lo/aia;

.field private i:Lo/aik;

.field private k:Lo/ajn;

.field private n:Lo/aka;

.field private o:Lo/ajm;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 47
    const/4 v0, 0x0

    sput-object v0, Lo/akj;->a:Lo/akj$a;

    .line 49
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/akj;->g:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    const/4 v0, 0x5

    iput v0, p0, Lo/akj;->d:I

    .line 43
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/akj;->c:Z

    .line 70
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akj;->f:Lo/afj;

    .line 288
    new-instance v0, Lo/akj$3;

    move-object v1, p0

    const-wide/32 v2, 0xea60

    const-wide/16 v4, 0x5dc

    invoke-direct/range {v0 .. v5}, Lo/akj$3;-><init>(Lo/akj;JJ)V

    iput-object v0, p0, Lo/akj;->n:Lo/aka;

    .line 79
    invoke-static {p1}, Lo/aia;->b(Landroid/content/Context;)Lo/aia;

    move-result-object v0

    iput-object v0, p0, Lo/akj;->h:Lo/aia;

    .line 80
    new-instance v0, Lo/aik;

    invoke-direct {v0}, Lo/aik;-><init>()V

    iput-object v0, p0, Lo/akj;->i:Lo/aik;

    .line 83
    sget-object v0, Lo/akj;->a:Lo/akj$a;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 85
    new-instance v6, Landroid/os/HandlerThread;

    const-string v0, "wifi_scan"

    invoke-direct {v6, v0}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 86
    invoke-virtual {v6}, Landroid/os/HandlerThread;->start()V

    .line 87
    new-instance v0, Lo/akj$a;

    invoke-virtual {v6}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lo/akj$a;-><init>(Lo/akj;Landroid/os/Looper;)V

    sput-object v0, Lo/akj;->a:Lo/akj$a;

    .line 89
    :cond_0
    return-void
.end method

.method static synthetic a(Lo/akj;)Lo/afj;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/akj;->f:Lo/afj;

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lo/akj;
    .locals 3

    .line 95
    sget-object v1, Lo/akj;->g:Ljava/lang/Object;

    monitor-enter v1

    .line 96
    :try_start_0
    sget-object v0, Lo/akj;->b:Lo/akj;

    if-nez v0, :cond_0

    .line 97
    new-instance v0, Lo/akj;

    invoke-direct {v0, p0}, Lo/akj;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/akj;->b:Lo/akj;

    .line 99
    :cond_0
    sget-object v0, Lo/akj;->b:Lo/akj;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 100
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method

.method private b()V
    .locals 3

    .line 186
    new-instance v2, Lo/ais;

    invoke-direct {v2}, Lo/ais;-><init>()V

    .line 187
    const-string v0, "1.0"

    iput-object v0, v2, Lo/ais;->b:Ljava/lang/String;

    .line 188
    const/16 v0, 0x8

    invoke-static {v0}, Lo/akc;->b(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, v2, Lo/ais;->c:Ljava/lang/String;

    .line 189
    iget-object v0, p0, Lo/akj;->i:Lo/aik;

    new-instance v1, Lo/akj$1;

    invoke-direct {v1, p0}, Lo/akj$1;-><init>(Lo/akj;)V

    invoke-virtual {v0, v2, v1}, Lo/aik;->c(Lo/ais;Lo/aiq$d;)V

    .line 225
    return-void
.end method

.method static synthetic b(Lo/akj;)Z
    .locals 1

    .line 31
    iget-boolean v0, p0, Lo/akj;->c:Z

    return v0
.end method

.method static synthetic c(Lo/akj;)Lo/aia;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/akj;->h:Lo/aia;

    return-object v0
.end method

.method private c(Lo/afj;)V
    .locals 0

    .line 75
    iput-object p1, p0, Lo/akj;->f:Lo/afj;

    .line 76
    return-void
.end method

.method static synthetic d(Lo/akj;)Lo/ajn;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/akj;->k:Lo/ajn;

    return-object v0
.end method

.method private d(ILo/ajn;)V
    .locals 4

    .line 119
    const-string v0, "ScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "scanDeviceWifiAP: in"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 120
    if-nez p2, :cond_0

    .line 121
    return-void

    .line 123
    :cond_0
    iput-object p2, p0, Lo/akj;->k:Lo/ajn;

    .line 125
    iput p1, p0, Lo/akj;->d:I

    .line 127
    sget-object v0, Lo/akj;->a:Lo/akj$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 128
    sget-object v0, Lo/akj;->a:Lo/akj$a;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Lo/akj$a;->removeMessages(I)V

    .line 129
    sget-object v0, Lo/akj;->a:Lo/akj$a;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lo/akj$a;->removeMessages(I)V

    .line 130
    sget-object v0, Lo/akj;->a:Lo/akj$a;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lo/akj$a;->sendEmptyMessage(I)Z

    .line 132
    :cond_1
    return-void
.end method

.method static synthetic e(Lo/akj;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lo/akj;->b()V

    return-void
.end method

.method static synthetic i(Lo/akj;)I
    .locals 2

    .line 31
    iget v0, p0, Lo/akj;->d:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/akj;->d:I

    return v0
.end method

.method static synthetic k(Lo/akj;)Lo/ajm;
    .locals 1

    .line 31
    iget-object v0, p0, Lo/akj;->o:Lo/ajm;

    return-object v0
.end method


# virtual methods
.method public a(Lo/ajd;Lo/ajm;)V
    .locals 4

    .line 265
    const-string v0, "ScanManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u626b\u63cf\u6307\u5b9a\u8bbe\u5907\uff0c\u6682\u65f6\u8bbe\u7f6e\u4e3a60\u79d2\uff0c1.5\u6b21/\u79d2\u6267\u884c\u68c0\u67e5\u4e00\u6b21"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x0

    invoke-static {v2, v0, v1}, Lo/aho;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    .line 267
    iput-object p2, p0, Lo/akj;->o:Lo/ajm;

    .line 268
    invoke-virtual {p0, p1}, Lo/akj;->b(Lo/ajd;)V

    .line 269
    iget-object v0, p0, Lo/akj;->n:Lo/aka;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 270
    iget-object v0, p0, Lo/akj;->n:Lo/aka;

    invoke-virtual {v0}, Lo/aka;->e()Lo/aka;

    .line 272
    :cond_0
    return-void
.end method

.method public b(Lo/ajd;)V
    .locals 0

    .line 253
    iput-object p1, p0, Lo/akj;->e:Lo/ajd;

    .line 254
    return-void
.end method

.method public c()V
    .locals 2

    .line 279
    iget-object v0, p0, Lo/akj;->n:Lo/aka;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 280
    iget-object v0, p0, Lo/akj;->n:Lo/aka;

    invoke-virtual {v0}, Lo/aka;->d()V

    .line 282
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 232
    sget-object v0, Lo/akj;->a:Lo/akj$a;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 233
    sget-object v0, Lo/akj;->a:Lo/akj$a;

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Lo/akj$a;->removeMessages(I)V

    .line 234
    sget-object v0, Lo/akj;->a:Lo/akj$a;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Lo/akj$a;->removeMessages(I)V

    .line 235
    sget-object v0, Lo/akj;->a:Lo/akj$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lo/akj$a;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 236
    const/4 v0, 0x0

    iput v0, p0, Lo/akj;->d:I

    .line 237
    const/4 v0, 0x0

    iput-object v0, p0, Lo/akj;->k:Lo/ajn;

    .line 239
    :cond_0
    return-void
.end method

.method public d(Lo/afj;ILo/ajn;)V
    .locals 0

    .line 104
    invoke-direct {p0, p1}, Lo/akj;->c(Lo/afj;)V

    .line 105
    invoke-direct {p0, p2, p3}, Lo/akj;->d(ILo/ajn;)V

    .line 106
    return-void
.end method

.method public e()Lo/ajd;
    .locals 1

    .line 257
    iget-object v0, p0, Lo/akj;->e:Lo/ajd;

    return-object v0
.end method
