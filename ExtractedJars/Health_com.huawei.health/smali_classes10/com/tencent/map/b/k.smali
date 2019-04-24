.class public final Lcom/tencent/map/b/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/map/b/k$a;
    }
.end annotation


# static fields
.field private static a:I

.field private static b:I

.field private static c:I

.field private static d:I

.field private static e:I

.field private static f:I

.field private static g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/tencent/map/b/k$a;>;"
        }
    .end annotation
.end field

.field private static h:J

.field private static i:J

.field private static j:J

.field private static k:J

.field private static l:J

.field private static m:J

.field private static n:J

.field private static o:J

.field private static p:J

.field private static q:J

.field private static r:I

.field private static s:I

.field private static t:I

.field private static u:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 19
    const/16 v0, 0x2710

    sput v0, Lcom/tencent/map/b/k;->a:I

    .line 21
    const/16 v0, 0x3a98

    sput v0, Lcom/tencent/map/b/k;->b:I

    .line 23
    const/16 v0, 0x1388

    sput v0, Lcom/tencent/map/b/k;->c:I

    .line 25
    const/16 v0, 0x4e20

    sput v0, Lcom/tencent/map/b/k;->d:I

    .line 27
    const/16 v0, 0x61a8

    sput v0, Lcom/tencent/map/b/k;->e:I

    .line 29
    const/16 v0, 0x3a98

    sput v0, Lcom/tencent/map/b/k;->f:I

    .line 31
    const/16 v0, 0x2ee0

    sput v0, Lcom/tencent/map/b/k;->a:I

    const/16 v0, 0x4e20

    sput v0, Lcom/tencent/map/b/k;->b:I

    const/16 v0, 0x1f40

    sput v0, Lcom/tencent/map/b/k;->c:I

    const/16 v0, 0x4e20

    sput v0, Lcom/tencent/map/b/k;->d:I

    const/16 v0, 0x61a8

    sput v0, Lcom/tencent/map/b/k;->e:I

    const/16 v0, 0x3a98

    sput v0, Lcom/tencent/map/b/k;->f:I

    invoke-static {}, Lcom/tencent/map/b/l;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/net/ConnectivityManager;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    move-result v3

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez v3, :cond_0

    invoke-static {}, Lcom/tencent/map/b/l;->b()Landroid/content/Context;

    move-result-object v0

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/telephony/TelephonyManager;

    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-le v0, v1, :cond_0

    const-string v0, "46000"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "46002"

    invoke-virtual {v2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x3a98

    sput v0, Lcom/tencent/map/b/k;->a:I

    const/16 v0, 0x61a8

    sput v0, Lcom/tencent/map/b/k;->b:I

    const/16 v0, 0x2710

    sput v0, Lcom/tencent/map/b/k;->c:I

    const/16 v0, 0x61a8

    sput v0, Lcom/tencent/map/b/k;->d:I

    const v0, 0x88b8

    sput v0, Lcom/tencent/map/b/k;->e:I

    const/16 v0, 0x3a98

    sput v0, Lcom/tencent/map/b/k;->f:I

    .line 16
    :cond_0
    return-void
.end method

.method public static a()I
    .locals 6

    .line 207
    sget v4, Lcom/tencent/map/b/k;->a:I

    .line 208
    sget-wide v0, Lcom/tencent/map/b/k;->j:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    sget-wide v0, Lcom/tencent/map/b/k;->k:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 209
    sget-wide v0, Lcom/tencent/map/b/k;->m:J

    sget-wide v2, Lcom/tencent/map/b/k;->j:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sget-wide v2, Lcom/tencent/map/b/k;->k:J

    add-long/2addr v0, v2

    sget-wide v2, Lcom/tencent/map/b/k;->l:J

    sub-long/2addr v0, v2

    long-to-int v4, v0

    .line 212
    :cond_0
    invoke-static {}, Lcom/tencent/map/b/l;->b()Landroid/content/Context;

    move-result-object v0

    .line 213
    const-string v1, "connectivity"

    .line 212
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/net/ConnectivityManager;

    .line 214
    if-eqz v5, :cond_2

    .line 215
    invoke-virtual {v5}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v5

    .line 216
    if-eqz v5, :cond_2

    .line 217
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 218
    sget v4, Lcom/tencent/map/b/k;->b:I

    goto :goto_0

    .line 220
    :cond_1
    sget-wide v0, Lcom/tencent/map/b/k;->k:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    sget-wide v0, Lcom/tencent/map/b/k;->k:J

    sget v2, Lcom/tencent/map/b/k;->c:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 221
    sget v4, Lcom/tencent/map/b/k;->c:I

    .line 227
    :cond_2
    :goto_0
    sget v0, Lcom/tencent/map/b/k;->u:I

    sget v1, Lcom/tencent/map/b/k;->c:I

    mul-int/2addr v0, v1

    add-int/2addr v0, v4

    .line 228
    move v4, v0

    sget v1, Lcom/tencent/map/b/k;->c:I

    if-gt v0, v1, :cond_3

    .line 229
    sget v4, Lcom/tencent/map/b/k;->c:I

    .line 230
    :cond_3
    int-to-long v0, v4

    sget-wide v2, Lcom/tencent/map/b/k;->k:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    .line 231
    sget-wide v0, Lcom/tencent/map/b/k;->k:J

    sget v2, Lcom/tencent/map/b/k;->c:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    long-to-int v4, v0

    .line 232
    :cond_4
    sget v0, Lcom/tencent/map/b/k;->b:I

    if-lt v4, v0, :cond_5

    .line 233
    sget v4, Lcom/tencent/map/b/k;->b:I

    .line 235
    :cond_5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tencent/map/b/k;->b(J)Lcom/tencent/map/b/k$a;

    move-result-object v5

    .line 236
    if-nez v5, :cond_6

    .line 237
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tencent/map/b/k;->a(J)Lcom/tencent/map/b/k$a;

    move-result-object v5

    .line 238
    :cond_6
    iget v0, v5, Lcom/tencent/map/b/k$a;->g:I

    sget v1, Lcom/tencent/map/b/k;->c:I

    add-int/2addr v0, v1

    if-ge v4, v0, :cond_7

    .line 239
    iget v0, v5, Lcom/tencent/map/b/k$a;->g:I

    sget v1, Lcom/tencent/map/b/k;->c:I

    add-int v4, v0, v1

    .line 240
    :cond_7
    iput v4, v5, Lcom/tencent/map/b/k$a;->g:I

    .line 242
    return v4
.end method

.method private static a(J)Lcom/tencent/map/b/k$a;
    .locals 9

    .line 576
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 577
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    .line 579
    :cond_0
    sget-object v4, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    monitor-enter v4

    .line 580
    :try_start_0
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x14

    if-le v0, v1, :cond_e

    .line 582
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 583
    const/4 v6, 0x0

    .line 584
    const/4 v7, 0x0

    .line 585
    const/4 v8, 0x0

    goto :goto_1

    .line 586
    :cond_1
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/k$a;

    iget-wide v0, v0, Lcom/tencent/map/b/k$a;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_2

    .line 587
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sget-object v2, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/map/b/k$a;

    iget-wide v2, v2, Lcom/tencent/map/b/k$a;->b:J

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x927c0

    cmp-long v0, v0, v2

    if-lez v0, :cond_3

    .line 589
    :cond_2
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 590
    const/4 v7, 0x1

    goto :goto_0

    .line 592
    :cond_3
    add-int/lit8 v6, v6, 0x1

    .line 585
    :goto_0
    add-int/lit8 v8, v8, 0x1

    :goto_1
    div-int/lit8 v0, v5, 0x2

    if-lt v8, v0, :cond_1

    .line 594
    if-eqz v7, :cond_e

    .line 595
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/tencent/map/b/k;->h:J

    .line 596
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/tencent/map/b/k;->i:J

    .line 597
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/k$a;

    iget-wide v0, v0, Lcom/tencent/map/b/k$a;->c:J

    sput-wide v0, Lcom/tencent/map/b/k;->k:J

    .line 598
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/k$a;

    iget-wide v0, v0, Lcom/tencent/map/b/k$a;->c:J

    sput-wide v0, Lcom/tencent/map/b/k;->l:J

    .line 599
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/k$a;

    iget-wide v0, v0, Lcom/tencent/map/b/k$a;->d:J

    sput-wide v0, Lcom/tencent/map/b/k;->o:J

    .line 600
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/k$a;

    iget-wide v0, v0, Lcom/tencent/map/b/k$a;->d:J

    sput-wide v0, Lcom/tencent/map/b/k;->p:J

    .line 601
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/k$a;

    iget-wide v0, v0, Lcom/tencent/map/b/k$a;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_4

    .line 602
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/k$a;

    iget v0, v0, Lcom/tencent/map/b/k$a;->e:I

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    sget-object v2, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/map/b/k$a;

    iget-wide v2, v2, Lcom/tencent/map/b/k$a;->f:J

    div-long/2addr v0, v2

    long-to-int v0, v0

    sput v0, Lcom/tencent/map/b/k;->r:I

    .line 603
    :cond_4
    sget v0, Lcom/tencent/map/b/k;->r:I

    sput v0, Lcom/tencent/map/b/k;->s:I

    .line 604
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    goto/16 :goto_2

    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/tencent/map/b/k$a;

    .line 605
    sget-wide v0, Lcom/tencent/map/b/k;->h:J

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-lez v0, :cond_6

    .line 606
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/tencent/map/b/k;->h:J

    .line 607
    :cond_6
    sget-wide v0, Lcom/tencent/map/b/k;->i:J

    const-wide/16 v2, 0x0

    cmp-long v0, v2, v0

    if-gez v0, :cond_7

    .line 608
    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/tencent/map/b/k;->i:J

    .line 609
    :cond_7
    iget-wide v0, v8, Lcom/tencent/map/b/k$a;->c:J

    sget-wide v2, Lcom/tencent/map/b/k;->k:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_8

    .line 610
    iget-wide v0, v8, Lcom/tencent/map/b/k$a;->c:J

    sput-wide v0, Lcom/tencent/map/b/k;->k:J

    .line 611
    :cond_8
    iget-wide v0, v8, Lcom/tencent/map/b/k$a;->c:J

    sget-wide v2, Lcom/tencent/map/b/k;->l:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_9

    .line 612
    iget-wide v0, v8, Lcom/tencent/map/b/k$a;->c:J

    sput-wide v0, Lcom/tencent/map/b/k;->l:J

    .line 613
    :cond_9
    iget-wide v0, v8, Lcom/tencent/map/b/k$a;->d:J

    sget-wide v2, Lcom/tencent/map/b/k;->o:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_a

    .line 614
    iget-wide v0, v8, Lcom/tencent/map/b/k$a;->d:J

    sput-wide v0, Lcom/tencent/map/b/k;->o:J

    .line 615
    :cond_a
    iget-wide v0, v8, Lcom/tencent/map/b/k$a;->d:J

    sget-wide v2, Lcom/tencent/map/b/k;->p:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_b

    .line 616
    iget-wide v0, v8, Lcom/tencent/map/b/k$a;->d:J

    sput-wide v0, Lcom/tencent/map/b/k;->p:J

    .line 617
    :cond_b
    iget-wide v0, v8, Lcom/tencent/map/b/k$a;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_d

    .line 618
    iget v0, v8, Lcom/tencent/map/b/k$a;->e:I

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v0, v0

    iget-wide v2, v8, Lcom/tencent/map/b/k$a;->f:J

    div-long/2addr v0, v2

    long-to-int v0, v0

    .line 619
    move v6, v0

    sget v1, Lcom/tencent/map/b/k;->r:I

    if-le v0, v1, :cond_c

    .line 620
    sput v6, Lcom/tencent/map/b/k;->r:I

    .line 621
    :cond_c
    sget v0, Lcom/tencent/map/b/k;->s:I

    if-ge v6, v0, :cond_d

    .line 622
    sput v6, Lcom/tencent/map/b/k;->s:I

    .line 604
    :cond_d
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_5

    .line 628
    :cond_e
    new-instance v5, Lcom/tencent/map/b/k$a;

    invoke-direct {v5}, Lcom/tencent/map/b/k$a;-><init>()V

    .line 629
    iput-wide p0, v5, Lcom/tencent/map/b/k$a;->a:J

    .line 630
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 631
    monitor-exit v4

    return-object v5

    .line 579
    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0
.end method

.method public static a(I)V
    .locals 7

    .line 542
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tencent/map/b/k;->b(J)Lcom/tencent/map/b/k$a;

    move-result-object v4

    .line 543
    if-nez v4, :cond_0

    .line 544
    return-void

    .line 545
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, v4, Lcom/tencent/map/b/k$a;->b:J

    sub-long/2addr v0, v2

    iput-wide v0, v4, Lcom/tencent/map/b/k$a;->f:J

    .line 546
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, v4, Lcom/tencent/map/b/k$a;->b:J

    .line 547
    iput p0, v4, Lcom/tencent/map/b/k$a;->e:I

    .line 548
    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->f:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const-wide/16 v5, 0x1

    goto :goto_0

    :cond_1
    iget-wide v5, v4, Lcom/tencent/map/b/k$a;->f:J

    .line 549
    :goto_0
    mul-int/lit16 v0, p0, 0x3e8

    int-to-long v0, v0

    div-long/2addr v0, v5

    long-to-int v0, v0

    .line 550
    sput v0, Lcom/tencent/map/b/k;->t:I

    sget v1, Lcom/tencent/map/b/k;->r:I

    if-le v0, v1, :cond_2

    sget v0, Lcom/tencent/map/b/k;->t:I

    goto :goto_1

    :cond_2
    sget v0, Lcom/tencent/map/b/k;->r:I

    :goto_1
    sput v0, Lcom/tencent/map/b/k;->r:I

    .line 551
    sget v0, Lcom/tencent/map/b/k;->t:I

    sget v1, Lcom/tencent/map/b/k;->s:I

    if-ge v0, v1, :cond_3

    sget v0, Lcom/tencent/map/b/k;->t:I

    goto :goto_2

    .line 552
    :cond_3
    sget v0, Lcom/tencent/map/b/k;->s:I

    if-nez v0, :cond_4

    sget v0, Lcom/tencent/map/b/k;->t:I

    goto :goto_2

    :cond_4
    sget v0, Lcom/tencent/map/b/k;->s:I

    .line 551
    :goto_2
    sput v0, Lcom/tencent/map/b/k;->s:I

    .line 553
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_6

    .line 556
    sget-object p0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    monitor-enter p0

    .line 557
    :try_start_0
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    goto :goto_3

    :cond_5
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/tencent/map/b/k$a;

    .line 558
    iget v0, v5, Lcom/tencent/map/b/k$a;->e:I

    .line 559
    iget-wide v0, v5, Lcom/tencent/map/b/k$a;->f:J

    .line 557
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_5

    .line 556
    monitor-exit p0

    goto :goto_4

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 562
    :cond_6
    :goto_4
    sget v0, Lcom/tencent/map/b/k;->u:I

    if-lez v0, :cond_7

    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->c:J

    sget v2, Lcom/tencent/map/b/k;->c:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_7

    .line 566
    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->d:J

    sget v2, Lcom/tencent/map/b/k;->f:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_7

    .line 567
    sget v0, Lcom/tencent/map/b/k;->u:I

    add-int/lit8 v0, v0, -0x1

    sput v0, Lcom/tencent/map/b/k;->u:I

    .line 568
    :cond_7
    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->c:J

    long-to-int v0, v0

    iput v0, v4, Lcom/tencent/map/b/k$a;->g:I

    .line 570
    return-void
.end method

.method public static a(Ljava/net/HttpURLConnection;)V
    .locals 2

    .line 463
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tencent/map/b/k;->b(J)Lcom/tencent/map/b/k$a;

    move-result-object p0

    .line 464
    if-nez p0, :cond_0

    .line 465
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tencent/map/b/k;->a(J)Lcom/tencent/map/b/k$a;

    move-result-object p0

    .line 466
    :cond_0
    if-nez p0, :cond_1

    .line 467
    return-void

    .line 468
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/map/b/k$a;->b:J

    .line 470
    return-void
.end method

.method public static a(Z)V
    .locals 2

    .line 422
    if-nez p0, :cond_0

    .line 423
    sget v0, Lcom/tencent/map/b/k;->u:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/tencent/map/b/k;->u:I

    .line 424
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tencent/map/b/k;->c(J)Lcom/tencent/map/b/k$a;

    move-result-object p0

    .line 425
    if-eqz p0, :cond_1

    .line 426
    iget-wide v0, p0, Lcom/tencent/map/b/k$a;->b:J

    .line 429
    :cond_1
    return-void
.end method

.method public static b()I
    .locals 6

    .line 246
    sget v4, Lcom/tencent/map/b/k;->d:I

    .line 247
    sget-wide v0, Lcom/tencent/map/b/k;->n:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    sget-wide v0, Lcom/tencent/map/b/k;->o:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    .line 248
    sget-wide v0, Lcom/tencent/map/b/k;->q:J

    sget-wide v2, Lcom/tencent/map/b/k;->n:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    sget-wide v2, Lcom/tencent/map/b/k;->o:J

    add-long/2addr v0, v2

    sget-wide v2, Lcom/tencent/map/b/k;->p:J

    sub-long/2addr v0, v2

    long-to-int v4, v0

    .line 251
    :cond_0
    invoke-static {}, Lcom/tencent/map/b/l;->b()Landroid/content/Context;

    move-result-object v0

    .line 252
    const-string v1, "connectivity"

    .line 251
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/net/ConnectivityManager;

    .line 253
    if-eqz v5, :cond_2

    .line 254
    invoke-virtual {v5}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v5

    .line 255
    if-eqz v5, :cond_2

    .line 256
    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {v5}, Landroid/net/NetworkInfo;->isAvailable()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 257
    sget v4, Lcom/tencent/map/b/k;->e:I

    goto :goto_0

    .line 259
    :cond_1
    sget-wide v0, Lcom/tencent/map/b/k;->o:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    sget-wide v0, Lcom/tencent/map/b/k;->o:J

    sget v2, Lcom/tencent/map/b/k;->f:I

    int-to-long v2, v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 260
    sget v4, Lcom/tencent/map/b/k;->f:I

    .line 266
    :cond_2
    :goto_0
    sget v0, Lcom/tencent/map/b/k;->u:I

    sget v1, Lcom/tencent/map/b/k;->c:I

    mul-int/2addr v0, v1

    add-int/2addr v0, v4

    .line 267
    move v4, v0

    sget v1, Lcom/tencent/map/b/k;->f:I

    if-gt v0, v1, :cond_3

    .line 268
    sget v4, Lcom/tencent/map/b/k;->f:I

    .line 269
    :cond_3
    int-to-long v0, v4

    sget-wide v2, Lcom/tencent/map/b/k;->o:J

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    .line 270
    sget-wide v0, Lcom/tencent/map/b/k;->o:J

    sget v2, Lcom/tencent/map/b/k;->f:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    long-to-int v4, v0

    .line 271
    :cond_4
    sget v0, Lcom/tencent/map/b/k;->e:I

    if-lt v4, v0, :cond_5

    .line 272
    sget v4, Lcom/tencent/map/b/k;->e:I

    .line 274
    :cond_5
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tencent/map/b/k;->b(J)Lcom/tencent/map/b/k$a;

    move-result-object v5

    .line 275
    if-eqz v5, :cond_8

    .line 276
    iget v0, v5, Lcom/tencent/map/b/k$a;->h:I

    sget v1, Lcom/tencent/map/b/k;->f:I

    add-int/2addr v0, v1

    if-ge v4, v0, :cond_6

    .line 277
    iget v0, v5, Lcom/tencent/map/b/k$a;->h:I

    sget v1, Lcom/tencent/map/b/k;->f:I

    add-int v4, v0, v1

    .line 278
    :cond_6
    iget v0, v5, Lcom/tencent/map/b/k$a;->g:I

    sget v1, Lcom/tencent/map/b/k;->f:I

    add-int/2addr v0, v1

    if-ge v4, v0, :cond_7

    .line 279
    iget v0, v5, Lcom/tencent/map/b/k$a;->g:I

    sget v1, Lcom/tencent/map/b/k;->f:I

    add-int v4, v0, v1

    .line 280
    :cond_7
    iput v4, v5, Lcom/tencent/map/b/k$a;->h:I

    .line 283
    :cond_8
    return v4
.end method

.method private static b(J)Lcom/tencent/map/b/k$a;
    .locals 5

    .line 636
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 637
    const/4 v0, 0x0

    return-object v0

    .line 639
    :cond_0
    sget-object v2, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    monitor-enter v2

    .line 640
    :try_start_0
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    goto :goto_0

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/tencent/map/b/k$a;

    .line 641
    iget-wide v0, v3, Lcom/tencent/map/b/k$a;->a:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v0, v0, p0

    if-nez v0, :cond_2

    .line 642
    monitor-exit v2

    return-object v3

    .line 640
    :cond_2
    :goto_0
    :try_start_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v0

    if-nez v0, :cond_1

    .line 639
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    .line 645
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method private static c(J)Lcom/tencent/map/b/k$a;
    .locals 4

    .line 649
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    .line 650
    sget-object v2, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    monitor-enter v2

    .line 651
    :try_start_0
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 652
    move v3, v0

    add-int/lit8 v3, v0, -0x1

    goto :goto_0

    .line 653
    :cond_0
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/k$a;

    iget-wide v0, v0, Lcom/tencent/map/b/k$a;->a:J

    cmp-long v0, v0, p0

    if-nez v0, :cond_1

    .line 654
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/map/b/k$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 652
    :cond_1
    add-int/lit8 v3, v3, -0x1

    :goto_0
    if-gez v3, :cond_0

    .line 650
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    .line 659
    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public static c()V
    .locals 8

    .line 473
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tencent/map/b/k;->b(J)Lcom/tencent/map/b/k$a;

    move-result-object v4

    .line 474
    if-nez v4, :cond_0

    .line 475
    return-void

    .line 476
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, v4, Lcom/tencent/map/b/k$a;->b:J

    sub-long/2addr v0, v2

    iput-wide v0, v4, Lcom/tencent/map/b/k$a;->c:J

    .line 477
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, v4, Lcom/tencent/map/b/k$a;->b:J

    .line 478
    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->c:J

    sput-wide v0, Lcom/tencent/map/b/k;->m:J

    .line 479
    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->c:J

    sget-wide v2, Lcom/tencent/map/b/k;->k:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->c:J

    goto :goto_0

    :cond_1
    sget-wide v0, Lcom/tencent/map/b/k;->k:J

    :goto_0
    sput-wide v0, Lcom/tencent/map/b/k;->k:J

    .line 480
    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->c:J

    sget-wide v2, Lcom/tencent/map/b/k;->l:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->c:J

    goto :goto_1

    .line 481
    :cond_2
    sget-wide v0, Lcom/tencent/map/b/k;->l:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->c:J

    goto :goto_1

    :cond_3
    sget-wide v0, Lcom/tencent/map/b/k;->l:J

    .line 480
    :goto_1
    sput-wide v0, Lcom/tencent/map/b/k;->l:J

    .line 482
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    .line 483
    sget-object v4, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    monitor-enter v4

    .line 484
    const/4 v5, 0x0

    .line 485
    :try_start_0
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    goto :goto_2

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/tencent/map/b/k$a;

    .line 486
    iget-wide v0, v6, Lcom/tencent/map/b/k$a;->c:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    .line 487
    sget-wide v0, Lcom/tencent/map/b/k;->j:J

    iget-wide v2, v6, Lcom/tencent/map/b/k$a;->c:J

    add-long/2addr v0, v2

    sput-wide v0, Lcom/tencent/map/b/k;->j:J

    .line 488
    add-int/lit8 v5, v5, 0x1

    .line 485
    :cond_5
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 491
    if-lez v5, :cond_6

    .line 492
    sget-wide v0, Lcom/tencent/map/b/k;->j:J

    int-to-long v2, v5

    div-long/2addr v0, v2

    sput-wide v0, Lcom/tencent/map/b/k;->j:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 483
    :cond_6
    monitor-exit v4

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0

    .line 495
    :cond_7
    return-void
.end method

.method public static d()V
    .locals 8

    .line 516
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/tencent/map/b/k;->b(J)Lcom/tencent/map/b/k$a;

    move-result-object v4

    .line 517
    if-nez v4, :cond_0

    .line 518
    return-void

    .line 519
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, v4, Lcom/tencent/map/b/k$a;->b:J

    sub-long/2addr v0, v2

    iput-wide v0, v4, Lcom/tencent/map/b/k$a;->d:J

    .line 520
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, v4, Lcom/tencent/map/b/k$a;->b:J

    .line 521
    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->d:J

    sput-wide v0, Lcom/tencent/map/b/k;->q:J

    .line 522
    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->d:J

    sget-wide v2, Lcom/tencent/map/b/k;->o:J

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->d:J

    goto :goto_0

    .line 523
    :cond_1
    sget-wide v0, Lcom/tencent/map/b/k;->o:J

    .line 522
    :goto_0
    sput-wide v0, Lcom/tencent/map/b/k;->o:J

    .line 524
    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->d:J

    sget-wide v2, Lcom/tencent/map/b/k;->p:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->d:J

    goto :goto_1

    .line 525
    :cond_2
    sget-wide v0, Lcom/tencent/map/b/k;->p:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_3

    iget-wide v0, v4, Lcom/tencent/map/b/k$a;->d:J

    goto :goto_1

    :cond_3
    sget-wide v0, Lcom/tencent/map/b/k;->p:J

    .line 524
    :goto_1
    sput-wide v0, Lcom/tencent/map/b/k;->p:J

    .line 526
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    if-eqz v0, :cond_7

    .line 527
    sget-object v4, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    monitor-enter v4

    .line 528
    const/4 v5, 0x0

    .line 529
    :try_start_0
    sget-object v0, Lcom/tencent/map/b/k;->g:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    goto :goto_2

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/tencent/map/b/k$a;

    .line 530
    iget-wide v0, v6, Lcom/tencent/map/b/k$a;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_5

    .line 531
    sget-wide v0, Lcom/tencent/map/b/k;->n:J

    iget-wide v2, v6, Lcom/tencent/map/b/k$a;->d:J

    add-long/2addr v0, v2

    sput-wide v0, Lcom/tencent/map/b/k;->n:J

    .line 532
    add-int/lit8 v5, v5, 0x1

    .line 529
    :cond_5
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_4

    .line 535
    if-lez v5, :cond_6

    .line 536
    sget-wide v0, Lcom/tencent/map/b/k;->n:J

    int-to-long v2, v5

    div-long/2addr v0, v2

    sput-wide v0, Lcom/tencent/map/b/k;->n:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 527
    :cond_6
    monitor-exit v4

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v4

    throw v0

    .line 539
    :cond_7
    return-void
.end method
