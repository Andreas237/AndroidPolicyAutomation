.class public final Lcom/tencent/map/b/d;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/map/b/d$c;,
        Lcom/tencent/map/b/d$b;,
        Lcom/tencent/map/b/d$a;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroid/telephony/TelephonyManager;

.field private c:Lcom/tencent/map/b/d$a;

.field private d:Lcom/tencent/map/b/d$c;

.field private e:Lcom/tencent/map/b/d$b;

.field private f:Z

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/telephony/NeighboringCellInfo;>;"
        }
    .end annotation
.end field

.field private h:[B

.field private i:[B

.field private j:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/d;->a:Landroid/content/Context;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/d;->b:Landroid/telephony/TelephonyManager;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/d;->c:Lcom/tencent/map/b/d$a;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/d;->d:Lcom/tencent/map/b/d$c;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/map/b/d;->e:Lcom/tencent/map/b/d$b;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/map/b/d;->f:Z

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lcom/tencent/map/b/d;->g:Ljava/util/List;

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/tencent/map/b/d;->h:[B

    const/4 v0, 0x0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/tencent/map/b/d;->i:[B

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/map/b/d;->j:Z

    return-void
.end method

.method private a(I)I
    .locals 4

    iget-object v0, p0, Lcom/tencent/map/b/d;->b:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v2

    const/4 v3, -0x1

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x3

    :try_start_0
    invoke-virtual {v2, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    move v3, v0

    nop

    :catch_0
    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    const/4 v0, -0x1

    if-ne v3, v0, :cond_1

    const/4 v3, 0x0

    :cond_1
    return v3
.end method

.method static synthetic a(Lcom/tencent/map/b/d;Lcom/tencent/map/b/d$b;)Lcom/tencent/map/b/d$b;
    .locals 0

    iput-object p1, p0, Lcom/tencent/map/b/d;->e:Lcom/tencent/map/b/d$b;

    return-object p1
.end method

.method static synthetic a(Lcom/tencent/map/b/d;)Lcom/tencent/map/b/d$c;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/d;->d:Lcom/tencent/map/b/d$c;

    return-object v0
.end method

.method static synthetic a(Lcom/tencent/map/b/d;Z)Z
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/map/b/d;->j:Z

    const/4 v0, 0x0

    return v0
.end method

.method static synthetic b(Lcom/tencent/map/b/d;)Lcom/tencent/map/b/d$b;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/d;->e:Lcom/tencent/map/b/d$b;

    return-object v0
.end method

.method static synthetic c(Lcom/tencent/map/b/d;)V
    .locals 2

    iget-boolean v0, p0, Lcom/tencent/map/b/d;->j:Z

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/map/b/d;->j:Z

    new-instance v0, Lcom/tencent/map/b/d$1;

    invoke-direct {v0, p0}, Lcom/tencent/map/b/d$1;-><init>(Lcom/tencent/map/b/d;)V

    invoke-virtual {v0}, Lcom/tencent/map/b/d$1;->start()V

    :cond_0
    return-void
.end method

.method static synthetic d(Lcom/tencent/map/b/d;)Landroid/telephony/TelephonyManager;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/d;->b:Landroid/telephony/TelephonyManager;

    return-object v0
.end method

.method static synthetic e(Lcom/tencent/map/b/d;)[B
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/d;->i:[B

    return-object v0
.end method

.method static synthetic f(Lcom/tencent/map/b/d;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/tencent/map/b/d;->g:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v3, p0, Lcom/tencent/map/b/d;->h:[B

    monitor-enter v3

    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/map/b/d;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit v3

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/tencent/map/b/d;->b:Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/tencent/map/b/d;->c:Lcom/tencent/map/b/d$a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    :try_start_2
    iget-object v0, p0, Lcom/tencent/map/b/d;->b:Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/tencent/map/b/d;->c:Lcom/tencent/map/b/d$a;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :try_start_3
    iput-boolean v0, p0, Lcom/tencent/map/b/d;->f:Z

    :cond_1
    :goto_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/map/b/d;->f:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v3

    return-void

    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public final a(Landroid/content/Context;Lcom/tencent/map/b/d$c;)Z
    .locals 4

    iget-object v3, p0, Lcom/tencent/map/b/d;->h:[B

    monitor-enter v3

    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/map/b/d;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit v3

    const/4 v0, 0x1

    return v0

    :cond_0
    if-eqz p1, :cond_1

    if-nez p2, :cond_2

    :cond_1
    monitor-exit v3

    const/4 v0, 0x0

    return v0

    :cond_2
    :try_start_1
    iput-object p1, p0, Lcom/tencent/map/b/d;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/tencent/map/b/d;->d:Lcom/tencent/map/b/d$c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v0, p0, Lcom/tencent/map/b/d;->a:Landroid/content/Context;

    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    iput-object v0, p0, Lcom/tencent/map/b/d;->b:Landroid/telephony/TelephonyManager;

    iget-object v0, p0, Lcom/tencent/map/b/d;->b:Landroid/telephony/TelephonyManager;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_3

    monitor-exit v3

    const/4 v0, 0x0

    return v0

    :cond_3
    :try_start_3
    iget-object v0, p0, Lcom/tencent/map/b/d;->b:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result p1

    invoke-direct {p0, p1}, Lcom/tencent/map/b/d;->a(I)I

    move-result p2

    new-instance v0, Lcom/tencent/map/b/d$a;

    invoke-direct {v0, p0, p2, p1}, Lcom/tencent/map/b/d$a;-><init>(Lcom/tencent/map/b/d;II)V

    iput-object v0, p0, Lcom/tencent/map/b/d;->c:Lcom/tencent/map/b/d$a;

    iget-object v0, p0, Lcom/tencent/map/b/d;->c:Lcom/tencent/map/b/d$a;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v0, :cond_4

    monitor-exit v3

    const/4 v0, 0x0

    return v0

    :cond_4
    :try_start_4
    iget-object v0, p0, Lcom/tencent/map/b/d;->b:Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Lcom/tencent/map/b/d;->c:Lcom/tencent/map/b/d$a;

    const/16 v2, 0x12

    invoke-virtual {v0, v1, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :catch_0
    monitor-exit v3

    const/4 v0, 0x0

    return v0

    :goto_0
    const/4 v0, 0x1

    :try_start_5
    iput-boolean v0, p0, Lcom/tencent/map/b/d;->f:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit v3

    goto :goto_1

    :catchall_0
    move-exception p1

    monitor-exit v3

    throw p1

    :goto_1
    iget-boolean v0, p0, Lcom/tencent/map/b/d;->f:Z

    return v0
.end method

.method public final b()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Landroid/telephony/NeighboringCellInfo;>;"
        }
    .end annotation

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/tencent/map/b/d;->i:[B

    monitor-enter v2

    :try_start_0
    iget-object v0, p0, Lcom/tencent/map/b/d;->g:Ljava/util/List;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    iget-object v0, p0, Lcom/tencent/map/b/d;->g:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception v1

    monitor-exit v2

    throw v1

    :goto_0
    return-object v1
.end method
