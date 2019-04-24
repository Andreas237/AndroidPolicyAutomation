.class public Lo/cvu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/nfc/PluginPayAdapter;
.implements Lo/djh$e;


# static fields
.field private static final A:Ljava/lang/Object;

.field private static final B:Ljava/lang/Object;

.field private static final C:Ljava/lang/Object;

.field private static final D:Ljava/lang/Object;

.field private static final E:Ljava/lang/Object;

.field private static final F:Ljava/lang/Object;

.field private static final G:Ljava/lang/Object;

.field private static final H:Ljava/lang/Object;

.field private static final L:[B

.field private static a:Lo/djh;

.field private static b:Lo/cwh;

.field private static c:Lo/dde;

.field private static e:Lo/cvu;

.field private static f:I

.field private static final j:Ljava/lang/Object;

.field private static final v:Ljava/lang/Object;

.field private static final w:Ljava/lang/Object;

.field private static final x:Ljava/lang/Object;

.field private static final z:Ljava/lang/Object;


# instance fields
.field private I:Lo/deu;

.field private J:Z

.field private final K:Ljava/lang/Object;

.field private M:Landroid/os/Handler;

.field private final N:Ljava/lang/Object;

.field private O:Ljava/lang/Runnable;

.field private S:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

.field d:I

.field private g:Z

.field private h:Z

.field private i:Z

.field private k:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/Integer;Ljava/lang/Object;>;"
        }
    .end annotation
.end field

.field private l:Z

.field private m:I

.field private n:Z

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private p:Z

.field private q:Ljava/lang/String;

.field private r:Ljava/lang/String;

.field private s:Ljava/lang/String;

.field private t:I

.field private u:Ljava/lang/String;

.field private y:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 48
    const/4 v0, 0x0

    sput v0, Lo/cvu;->f:I

    .line 82
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->z:Ljava/lang/Object;

    .line 85
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->x:Ljava/lang/Object;

    .line 88
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->w:Ljava/lang/Object;

    .line 91
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->v:Ljava/lang/Object;

    .line 94
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->C:Ljava/lang/Object;

    .line 97
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->B:Ljava/lang/Object;

    .line 99
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->A:Ljava/lang/Object;

    .line 102
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->j:Ljava/lang/Object;

    .line 105
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->D:Ljava/lang/Object;

    .line 108
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->G:Ljava/lang/Object;

    .line 111
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->F:Ljava/lang/Object;

    .line 114
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->H:Ljava/lang/Object;

    .line 117
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/cvu;->E:Ljava/lang/Object;

    .line 131
    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lo/cvu;->L:[B

    return-void
.end method

.method private constructor <init>()V
    .locals 4

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cvu;->k:Ljava/util/Map;

    .line 65
    const/4 v0, -0x1

    iput v0, p0, Lo/cvu;->m:I

    .line 69
    const/4 v0, -0x1

    iput v0, p0, Lo/cvu;->t:I

    .line 79
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cvu;->y:Ljava/util/Map;

    .line 125
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cvu;->K:Ljava/lang/Object;

    .line 127
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lo/cvu;->N:Ljava/lang/Object;

    .line 133
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lo/cvu;->M:Landroid/os/Handler;

    .line 135
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cvu;->J:Z

    .line 316
    new-instance v0, Lo/cvu$7;

    invoke-direct {v0, p0}, Lo/cvu$7;-><init>(Lo/cvu;)V

    iput-object v0, p0, Lo/cvu;->O:Ljava/lang/Runnable;

    .line 338
    new-instance v0, Lo/cvu$13;

    invoke-direct {v0, p0}, Lo/cvu$13;-><init>(Lo/cvu;)V

    iput-object v0, p0, Lo/cvu;->S:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    .line 933
    const/4 v0, 0x2

    iput v0, p0, Lo/cvu;->d:I

    .line 145
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl init"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 146
    invoke-static {}, Lo/djh;->d()Lo/djh;

    move-result-object v0

    sput-object v0, Lo/cvu;->a:Lo/djh;

    .line 147
    sget-object v0, Lo/cvu;->a:Lo/djh;

    invoke-virtual {v0, p0}, Lo/djh;->d(Lo/djh$e;)V

    .line 148
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dde;->d(Landroid/content/Context;)Lo/dde;

    move-result-object v0

    sput-object v0, Lo/cvu;->c:Lo/dde;

    .line 149
    invoke-static {}, Lo/deu;->b()Lo/deu;

    move-result-object v0

    iput-object v0, p0, Lo/cvu;->I:Lo/deu;

    .line 150
    invoke-static {}, Lo/cwh;->c()Lo/cwh;

    move-result-object v0

    sput-object v0, Lo/cvu;->b:Lo/cwh;

    .line 151
    return-void
.end method

.method static synthetic a(Lo/cvu;)Landroid/os/Handler;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/cvu;->M:Landroid/os/Handler;

    return-object v0
.end method

.method static synthetic a()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->H:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic a(Lo/cvu;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/cvu;->s:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic a(Lo/cvu;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lo/cvu;->h:Z

    return p1
.end method

.method static synthetic b(Lo/cvu;I)I
    .locals 0

    .line 39
    iput p1, p0, Lo/cvu;->m:I

    return p1
.end method

.method static synthetic b()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->A:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic b(Lo/cvu;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/cvu;->r:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic b(Lo/cvu;)Ljava/util/Map;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/cvu;->y:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic b(Lo/cvu;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lo/cvu;->p:Z

    return p1
.end method

.method static synthetic c(Lo/cvu;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/cvu;->r:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c()Lo/dde;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->c:Lo/dde;

    return-object v0
.end method

.method private c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 450
    const-wide/32 v0, 0x9c40

    invoke-direct {p0, p1, p2, v0, v1}, Lo/cvu;->e(Ljava/lang/String;Ljava/lang/Object;J)V

    .line 452
    return-void
.end method

.method static synthetic c(Lo/cvu;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 39
    invoke-direct {p0, p1, p2}, Lo/cvu;->e(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic c(Lo/cvu;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lo/cvu;->l:Z

    return p1
.end method

.method static synthetic d(Lo/cvu;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/cvu;->q:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic d(Lo/cvu;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/cvu;->o:Ljava/util/List;

    return-object p1
.end method

.method static synthetic d(Lo/cvu;)Ljava/util/Map;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/cvu;->k:Ljava/util/Map;

    return-object v0
.end method

.method public static d()Lo/cvu;
    .locals 6

    .line 155
    sget-object v4, Lo/cvu;->L:[B

    monitor-enter v4

    .line 156
    :try_start_0
    sget-object v0, Lo/cvu;->e:Lo/cvu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 157
    new-instance v0, Lo/cvu;

    invoke-direct {v0}, Lo/cvu;-><init>()V

    sput-object v0, Lo/cvu;->e:Lo/cvu;

    .line 159
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PluginPayAdapterImpl getInstance : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/cvu;->e:Lo/cvu;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 160
    sget-object v0, Lo/cvu;->e:Lo/cvu;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 161
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method static synthetic d(Lo/cvu;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lo/cvu;->i:Z

    return p1
.end method

.method static synthetic e(Lo/cvu;I)I
    .locals 0

    .line 39
    iput p1, p0, Lo/cvu;->t:I

    return p1
.end method

.method static synthetic e()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->B:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lo/cvu;)Ljava/lang/Runnable;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/cvu;->O:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic e(Lo/cvu;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 39
    iput-object p1, p0, Lo/cvu;->u:Ljava/lang/String;

    return-object p1
.end method

.method private e(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 6

    .line 434
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 435
    return-void

    .line 437
    :cond_0
    move-object v4, p2

    monitor-enter v4

    .line 438
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 439
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "method: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , unlock= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 440
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 441
    :goto_0
    return-void
.end method

.method private e(Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 7

    .line 459
    move-object v4, p2

    monitor-enter v4

    .line 461
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "method: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " , lock= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 462
    invoke-virtual {p2, p3, p4}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 465
    goto :goto_0

    .line 463
    :catch_0
    move-exception v5

    .line 464
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    :try_start_1
    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "InterruptedException,e="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v5}, Ljava/lang/InterruptedException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 466
    :goto_0
    monitor-exit v4

    goto :goto_1

    :catchall_0
    move-exception v6

    monitor-exit v4

    throw v6

    .line 467
    :goto_1
    return-void
.end method

.method static synthetic e(Lo/cvu;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lo/cvu;->g:Z

    return p1
.end method

.method static synthetic f(Lo/cvu;)I
    .locals 1

    .line 39
    iget v0, p0, Lo/cvu;->m:I

    return v0
.end method

.method static synthetic f()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->w:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic g()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->v:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic g(Lo/cvu;)Z
    .locals 1

    .line 39
    iget-boolean v0, p0, Lo/cvu;->n:Z

    return v0
.end method

.method static synthetic h()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->x:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic h(Lo/cvu;)Ljava/lang/String;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/cvu;->q:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic i()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->C:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic k(Lo/cvu;)I
    .locals 1

    .line 39
    iget v0, p0, Lo/cvu;->t:I

    return v0
.end method

.method static synthetic k()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->z:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic k(Lo/cvu;Z)Z
    .locals 0

    .line 39
    iput-boolean p1, p0, Lo/cvu;->n:Z

    return p1
.end method

.method static synthetic l()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->E:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic m()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->F:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic n()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->G:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic o()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->D:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic p()Ljava/lang/Object;
    .locals 1

    .line 39
    sget-object v0, Lo/cvu;->j:Ljava/lang/Object;

    return-object v0
.end method

.method private s()I
    .locals 2

    .line 175
    sget v0, Lo/cvu;->f:I

    const v1, 0x7fffffff

    if-ne v0, v1, :cond_0

    .line 176
    const/4 v0, 0x1

    sput v0, Lo/cvu;->f:I

    .line 178
    :cond_0
    sget v0, Lo/cvu;->f:I

    add-int/lit8 v1, v0, 0x1

    sput v1, Lo/cvu;->f:I

    return v0
.end method

.method private u()Z
    .locals 2

    .line 524
    iget v0, p0, Lo/cvu;->d:I

    const/4 v1, 0x2

    if-ne v1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public addBusCard(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 531
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addBusCard enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 532
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 533
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl addBusCard payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 534
    const/4 v0, 0x0

    return v0

    .line 537
    :cond_1
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$11;

    invoke-direct {v1, p0}, Lo/cvu$11;-><init>(Lo/cvu;)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lo/djh;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 548
    const-string v0, "addBusCard"

    sget-object v1, Lo/cvu;->z:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 549
    iget-boolean v0, p0, Lo/cvu;->p:Z

    return v0
.end method

.method public addCard2Watch(Ljava/lang/String;)Z
    .locals 4

    .line 609
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addCard2Watch enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 611
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 612
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl addCard2Watch payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 613
    const/4 v0, 0x0

    return v0

    .line 616
    :cond_1
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$16;

    invoke-direct {v1, p0}, Lo/cvu$16;-><init>(Lo/cvu;)V

    invoke-virtual {v0, p1, v1}, Lo/djh;->d(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 628
    const-string v0, "addCard2Watch"

    sget-object v1, Lo/cvu;->w:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 629
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "addCard2Watch end , result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/cvu;->g:Z

    if-eqz v3, :cond_2

    const-string v3, "success"

    goto :goto_0

    :cond_2
    const-string v3, "failed"

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 630
    iget-boolean v0, p0, Lo/cvu;->g:Z

    return v0
.end method

.method public c(I)V
    .locals 4

    .line 937
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onConnectStateChange"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 938
    iput p1, p0, Lo/cvu;->d:I

    .line 939
    const/4 v0, 0x2

    if-ne v0, p1, :cond_0

    .line 940
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "DEVICE_CONNECTED"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 944
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cvu;->r:Ljava/lang/String;

    .line 946
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cvu;->q:Ljava/lang/String;

    .line 948
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cvu;->s:Ljava/lang/String;

    .line 950
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cvu;->u:Ljava/lang/String;

    .line 954
    :goto_0
    return-void
.end method

.method public cardEvent(Ljava/lang/String;I)V
    .locals 4

    .line 866
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "cardEvent enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 868
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 869
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl cardEvent payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 870
    return-void

    .line 873
    :cond_1
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$6;

    invoke-direct {v1, p0}, Lo/cvu$6;-><init>(Lo/cvu;)V

    invoke-virtual {v0, p1, p2, v1}, Lo/djh;->e(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 883
    return-void
.end method

.method public closeChannel()V
    .locals 6

    .line 406
    iget-object v4, p0, Lo/cvu;->N:Ljava/lang/Object;

    monitor-enter v4

    .line 408
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeChannel enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 410
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 411
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl closeChannel payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 412
    monitor-exit v4

    return-void

    .line 415
    :cond_1
    :try_start_1
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$14;

    invoke-direct {v1, p0}, Lo/cvu$14;-><init>(Lo/cvu;)V

    invoke-virtual {v0, v1}, Lo/djh;->d(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 425
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 426
    :goto_0
    return-void
.end method

.method public closeChannelSNB()V
    .locals 6

    .line 212
    iget-object v4, p0, Lo/cvu;->N:Ljava/lang/Object;

    monitor-enter v4

    .line 213
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    :try_start_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "closeChannelSNB"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 214
    invoke-virtual {p0}, Lo/cvu;->closeChannel()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 215
    monitor-exit v4

    goto :goto_0

    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5

    .line 216
    :goto_0
    return-void
.end method

.method public deleteCard(Ljava/lang/String;)Z
    .locals 4

    .line 702
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "deleteCard enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 704
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 705
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl deleteCard payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 706
    const/4 v0, 0x0

    return v0

    .line 708
    :cond_1
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$3;

    invoke-direct {v1, p0}, Lo/cvu$3;-><init>(Lo/cvu;)V

    invoke-virtual {v0, p1, v1}, Lo/djh;->e(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 720
    const-string v0, "deleteCard"

    sget-object v1, Lo/cvu;->j:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 721
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "deleteCard end , result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/cvu;->l:Z

    if-eqz v3, :cond_2

    const-string v3, "success"

    goto :goto_0

    :cond_2
    const-string v3, "failed"

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 722
    iget-boolean v0, p0, Lo/cvu;->l:Z

    return v0
.end method

.method public getBTCInfoResponse()Ljava/lang/String;
    .locals 4

    .line 474
    const-string v0, ""

    iput-object v0, p0, Lo/cvu;->q:Ljava/lang/String;

    .line 476
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 477
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl getBTCInfoResponse payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 478
    iget-object v0, p0, Lo/cvu;->q:Ljava/lang/String;

    return-object v0

    .line 481
    :cond_1
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$15;

    invoke-direct {v1, p0}, Lo/cvu$15;-><init>(Lo/cvu;)V

    invoke-virtual {v0, v1}, Lo/djh;->e(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 494
    const-string v0, ""

    iget-object v1, p0, Lo/cvu;->q:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 495
    const-string v0, "getBTCInfoResponse"

    sget-object v1, Lo/cvu;->A:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 497
    :cond_2
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getBTCInfoResponse,btcInfo= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cvu;->q:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 498
    iget-object v0, p0, Lo/cvu;->q:Ljava/lang/String;

    return-object v0
.end method

.method public getCplc()Ljava/lang/String;
    .locals 4

    .line 224
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl getCplc enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    iget-object v0, p0, Lo/cvu;->r:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 227
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "cplc is not null,return cplc = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cvu;->r:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 228
    iget-object v0, p0, Lo/cvu;->r:Ljava/lang/String;

    return-object v0

    .line 231
    :cond_0
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_2

    .line 232
    :cond_1
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl getCplc payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 233
    iget-object v0, p0, Lo/cvu;->r:Ljava/lang/String;

    return-object v0

    .line 236
    :cond_2
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$4;

    invoke-direct {v1, p0}, Lo/cvu$4;-><init>(Lo/cvu;)V

    invoke-virtual {v0, v1}, Lo/djh;->b(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 252
    iget-object v0, p0, Lo/cvu;->r:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 253
    const-string v0, "getCplc"

    sget-object v1, Lo/cvu;->H:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 256
    :cond_3
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PluginPayAdapterImpl getCplc return,cplc = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cvu;->r:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 257
    iget-object v0, p0, Lo/cvu;->r:Ljava/lang/String;

    return-object v0
.end method

.method public getDeviceBTType()I
    .locals 6

    .line 919
    const/4 v4, -0x1

    .line 920
    sget-object v0, Lo/cvu;->c:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 921
    sget-object v0, Lo/cvu;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 922
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 923
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceBTType()I

    move-result v4

    goto :goto_0

    .line 925
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceBTType error,deviceInfo is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 927
    :goto_0
    goto :goto_1

    .line 928
    :cond_1
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceBTType error,HWDeviceConfigManager is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 930
    :goto_1
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceBTType,state= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 931
    return v4
.end method

.method public getDeviceConnectState()I
    .locals 6

    .line 507
    const/4 v4, 0x0

    .line 509
    sget-object v0, Lo/cvu;->c:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 510
    sget-object v0, Lo/cvu;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 511
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 512
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceConnectState()I

    move-result v4

    goto :goto_0

    .line 514
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceConnectState error,deviceInfo is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 516
    :goto_0
    goto :goto_1

    .line 517
    :cond_1
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceConnectState error,HWDeviceConfigManager is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 519
    :goto_1
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceConnectState,state= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 520
    return v4
.end method

.method public getDeviceInfo()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 264
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 265
    sget-object v0, Lo/cvu;->c:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 266
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl getDeviceInfo deviceManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 267
    return-object v4

    .line 270
    :cond_1
    sget-object v0, Lo/cvu;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 271
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    .line 273
    const-string v0, "device_sn"

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getUUID()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lo/czx;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    const-string v0, "device_model"

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getDeviceModel()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    const-string v0, "soft_version"

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getSoft_version()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    const-string v0, "BT_version"

    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getbTversion()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    :cond_2
    return-object v4
.end method

.method public getDeviceProtocol()I
    .locals 6

    .line 900
    const/4 v4, -0x1

    .line 902
    sget-object v0, Lo/cvu;->c:Lo/dde;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 903
    sget-object v0, Lo/cvu;->c:Lo/dde;

    invoke-virtual {v0}, Lo/dde;->d()Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;

    move-result-object v5

    .line 904
    const/4 v0, 0x0

    if-eq v0, v5, :cond_0

    .line 905
    invoke-virtual {v5}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->getProductType()I

    move-result v4

    goto :goto_0

    .line 907
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceProtocol error,deviceInfo is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 909
    :goto_0
    goto :goto_1

    .line 910
    :cond_1
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getDeviceProtocol error,HWDeviceConfigManager is null!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 912
    :goto_1
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getDeviceProtocol,deviceType= "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 913
    return v4
.end method

.method public getLockscreenStatus()I
    .locals 4

    .line 762
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getLockscreenStatus enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 764
    sget-object v0, Lo/cvu;->c:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 765
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl getLockscreenStatus deviceManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 766
    iget v0, p0, Lo/cvu;->t:I

    return v0

    .line 769
    :cond_0
    sget-object v0, Lo/cvu;->c:Lo/dde;

    new-instance v1, Lo/cvu$8;

    invoke-direct {v1, p0}, Lo/cvu$8;-><init>(Lo/cvu;)V

    invoke-virtual {v0, v1}, Lo/dde;->i(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 782
    const-string v0, "getLockscreenStatus"

    sget-object v1, Lo/cvu;->G:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 783
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getLockscreenStatus end,result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cvu;->t:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 784
    iget v0, p0, Lo/cvu;->t:I

    return v0
.end method

.method public getServiceCountryCode()Ljava/lang/String;
    .locals 6

    .line 964
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v4

    .line 965
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 966
    const-string v0, "CN"

    return-object v0

    .line 968
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/login/ui/login/LoginInit;->getCountryCode(Lo/dcx;)Ljava/lang/String;

    move-result-object v5

    .line 969
    const/4 v0, 0x0

    if-eq v0, v5, :cond_1

    const-string v0, ""

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 970
    :cond_1
    const-string v0, "CN"

    return-object v0

    .line 972
    :cond_2
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isDeviceBand countryCode ="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 973
    return-object v5
.end method

.method public getUserID()Ljava/lang/String;
    .locals 2

    .line 554
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/login/ui/login/LoginInit;->getInstance(Landroid/content/Context;)Lcom/huawei/login/ui/login/LoginInit;

    move-result-object v1

    .line 555
    const/4 v0, 0x0

    if-ne v0, v1, :cond_0

    .line 556
    const-string v0, ""

    return-object v0

    .line 558
    :cond_0
    invoke-virtual {v1}, Lcom/huawei/login/ui/login/LoginInit;->getUsetId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getWalletAbility()Ljava/lang/String;
    .locals 4

    .line 731
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getWalletAbility enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 733
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 734
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl getWalletAbility payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 735
    const-string v0, ""

    return-object v0

    .line 737
    :cond_1
    iget-object v0, p0, Lo/cvu;->u:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 738
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mWalletSupportCapacity is not null,return mWalletSupportCapacity = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cvu;->u:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 739
    iget-object v0, p0, Lo/cvu;->u:Ljava/lang/String;

    return-object v0

    .line 741
    :cond_2
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$2;

    invoke-direct {v1, p0}, Lo/cvu$2;-><init>(Lo/cvu;)V

    invoke-virtual {v0, v1}, Lo/djh;->a(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 752
    const-string v0, "getWalletAbility"

    sget-object v1, Lo/cvu;->D:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 753
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getWalletAbility end,result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cvu;->u:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 754
    iget-object v0, p0, Lo/cvu;->u:Ljava/lang/String;

    return-object v0
.end method

.method public isDeviceBand(I)Z
    .locals 4

    .line 958
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "isDeviceBand deviceType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 959
    invoke-static {p1}, Lo/dda;->f(I)Z

    move-result v0

    return v0
.end method

.method public notificationOpenPageOfBand(Ljava/lang/String;)Z
    .locals 4

    .line 802
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notificationOpenPageOfBand enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 803
    sget-object v0, Lo/cvu;->c:Lo/dde;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 804
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl notificationOpenPageOfBand deviceManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 805
    iget-boolean v0, p0, Lo/cvu;->n:Z

    return v0

    .line 808
    :cond_0
    sget-object v0, Lo/cvu;->c:Lo/dde;

    new-instance v1, Lo/cvu$9;

    invoke-direct {v1, p0}, Lo/cvu$9;-><init>(Lo/cvu;)V

    invoke-virtual {v0, p1, v1}, Lo/dde;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 821
    const-string v0, "notificationOpenPageOfBand"

    sget-object v1, Lo/cvu;->F:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 822
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notificationOpenPageOfBand end,result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/cvu;->n:Z

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 823
    iget-boolean v0, p0, Lo/cvu;->n:Z

    return v0
.end method

.method public notifyAfterTransferFile(Ljava/util/List;)Z
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;>;)Z"
        }
    .end annotation

    .line 566
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "notifyAfterTransferFile enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 568
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " == PluginPayAdapterImpl notifyAfterTransferFile instance : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/cvu;->e:Lo/cvu;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 570
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 571
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl notifyAfterTransferFile payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 572
    const/4 v0, 0x0

    return v0

    .line 575
    :cond_1
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 576
    const/4 v5, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v5, v0, :cond_3

    .line 577
    new-instance v6, Lo/deq;

    invoke-direct {v6}, Lo/deq;-><init>()V

    .line 578
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "FILE_NAME"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/lang/String;

    .line 579
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    const-string v1, "FILE_TYPE"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 580
    const/4 v0, 0x1

    invoke-static {v7, v0}, Lcom/huawei/nfc/carrera/util/StringUtil;->isEmpty(Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 581
    const/4 v0, 0x0

    return v0

    .line 583
    :cond_2
    invoke-virtual {v6, v7}, Lo/deq;->e(Ljava/lang/String;)V

    .line 584
    invoke-virtual {v6, v8}, Lo/deq;->e(I)V

    .line 585
    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 576
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 587
    :cond_3
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$18;

    invoke-direct {v1, p0}, Lo/cvu$18;-><init>(Lo/cvu;)V

    invoke-virtual {v0, v4, v1}, Lo/djh;->c(Ljava/util/List;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 599
    const-string v0, "notifyAfterTransferFile"

    sget-object v1, Lo/cvu;->x:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 600
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "notifyAfterTransferFile end , result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/cvu;->i:Z

    if-eqz v3, :cond_4

    const-string v3, "success"

    goto :goto_1

    :cond_4
    const-string v3, "failed"

    :goto_1
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 601
    iget-boolean v0, p0, Lo/cvu;->i:Z

    return v0
.end method

.method public obtainCardList()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 668
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "obtainCardList enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 670
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 671
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl obtainCardList payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 672
    const/4 v0, 0x0

    return-object v0

    .line 675
    :cond_1
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$5;

    invoke-direct {v1, p0}, Lo/cvu$5;-><init>(Lo/cvu;)V

    invoke-virtual {v0, v1}, Lo/djh;->c(Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 689
    const-string v0, "obtainCardList"

    sget-object v1, Lo/cvu;->C:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 691
    iget-object v0, p0, Lo/cvu;->o:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 692
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "obtainCardList end , result cardlist\' size is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cvu;->o:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 694
    :cond_2
    iget-object v0, p0, Lo/cvu;->o:Ljava/util/List;

    return-object v0
.end method

.method public openChannel(Ljava/lang/String;I)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;I)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 373
    iget-object v4, p0, Lo/cvu;->K:Ljava/lang/Object;

    monitor-enter v4

    .line 374
    :try_start_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lo/cvu;->y:Ljava/util/Map;

    .line 375
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openChannel="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 377
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 378
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl openChannel payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 379
    iget-object v0, p0, Lo/cvu;->y:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v4

    return-object v0

    .line 382
    :cond_1
    :try_start_1
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$12;

    invoke-direct {v1, p0}, Lo/cvu$12;-><init>(Lo/cvu;)V

    invoke-virtual {v0, p1, p2, v1}, Lo/djh;->a(Ljava/lang/String;ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 397
    const-string v0, "openChannel"

    sget-object v1, Lo/cvu;->B:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 398
    iget-object v0, p0, Lo/cvu;->y:Ljava/util/Map;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    return-object v0

    .line 399
    :catchall_0
    move-exception v5

    monitor-exit v4

    throw v5
.end method

.method public openChannelSNB([BI)[B
    .locals 5

    .line 188
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openChannelSNB,instance_id="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 189
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openChannelSNB,channelType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 190
    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, Lo/cvu;->openChannel(Ljava/lang/String;I)Ljava/util/Map;

    move-result-object v4

    .line 191
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 192
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "openChannelSNB,rApdu="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "apdu"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 193
    const-string v0, "apdu"

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0

    .line 195
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public sendAccount(Ljava/lang/String;)I
    .locals 5

    .line 828
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendAccount enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 830
    invoke-static {}, Lo/czw;->e()Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;

    move-result-object v4

    .line 833
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 834
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ability is null , Do not sendAccount "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 835
    const/4 v0, -0x2

    return v0

    .line 837
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendAccount ability : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 839
    invoke-virtual {v4}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAccount()Z

    move-result v0

    if-nez v0, :cond_1

    .line 840
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, " bot SupportAccount , Do not sendAccount "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 841
    const/4 v0, -0x2

    return v0

    .line 844
    :cond_1
    sget-object v0, Lo/cvu;->b:Lo/cwh;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_2

    .line 845
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl sendAccount hwWearableManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 846
    iget v0, p0, Lo/cvu;->m:I

    return v0

    .line 849
    :cond_2
    sget-object v0, Lo/cvu;->b:Lo/cwh;

    new-instance v1, Lo/cvu$10;

    invoke-direct {v1, p0}, Lo/cvu$10;-><init>(Lo/cvu;)V

    invoke-virtual {v0, p1, v1}, Lo/cwh;->a(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 859
    const-string v0, "sendAccount"

    sget-object v1, Lo/cvu;->E:Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 860
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "sendAccount end,result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lo/cvu;->m:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 861
    iget v0, p0, Lo/cvu;->m:I

    return v0
.end method

.method public sendApdu(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 288
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, " enter sendApdu channelid :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, " ,reqApdu : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 291
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cvu;->s:Ljava/lang/String;

    .line 292
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 293
    const/4 v0, 0x0

    return-object v0

    .line 295
    :cond_0
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_2

    .line 296
    :cond_1
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "PluginPayAdapterImpl sendApdu payManager is null,return null,isConnected"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 297
    const/4 v0, 0x0

    return-object v0

    .line 300
    :cond_2
    invoke-direct {p0}, Lo/cvu;->s()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    .line 301
    iget-object v0, p0, Lo/cvu;->k:Ljava/util/Map;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    new-instance v5, Lcom/huawei/datatype/PayAPDUInfo;

    invoke-direct {v5}, Lcom/huawei/datatype/PayAPDUInfo;-><init>()V

    .line 303
    invoke-virtual {v5, p2}, Lcom/huawei/datatype/PayAPDUInfo;->setApdu(Ljava/lang/String;)V

    .line 304
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/datatype/PayAPDUInfo;->setReqid(I)V

    .line 305
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v5, v0}, Lcom/huawei/datatype/PayAPDUInfo;->setChannelID(I)V

    .line 306
    sget-object v0, Lo/cvu;->a:Lo/djh;

    iget-object v1, p0, Lo/cvu;->S:Lcom/huawei/hwbasemgr/IBaseResponseCallback;

    invoke-virtual {v0, v5, v1}, Lo/djh;->e(Lcom/huawei/datatype/PayAPDUInfo;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 307
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "lock,reqID="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",lockObject="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cvu;->k:Ljava/util/Map;

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ",map.size="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lo/cvu;->k:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 308
    iget-boolean v0, p0, Lo/cvu;->J:Z

    if-eqz v0, :cond_3

    .line 309
    iget-object v0, p0, Lo/cvu;->M:Landroid/os/Handler;

    iget-object v1, p0, Lo/cvu;->O:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 310
    iget-object v0, p0, Lo/cvu;->M:Landroid/os/Handler;

    iget-object v1, p0, Lo/cvu;->O:Ljava/lang/Runnable;

    const-wide/16 v2, 0x3a98

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 312
    :cond_3
    const-string v0, "sendApdu"

    iget-object v1, p0, Lo/cvu;->k:Ljava/util/Map;

    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lo/cvu;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 313
    iget-object v0, p0, Lo/cvu;->s:Ljava/lang/String;

    return-object v0
.end method

.method public sendFile(Ljava/lang/String;)V
    .locals 4

    .line 789
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sendFile enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 791
    iget-object v0, p0, Lo/cvu;->I:Lo/deu;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 792
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl sendFile fileManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 793
    return-void

    .line 796
    :cond_0
    iget-object v0, p0, Lo/cvu;->I:Lo/deu;

    invoke-virtual {v0, p1}, Lo/deu;->e(Ljava/lang/String;)V

    .line 797
    return-void
.end method

.method public transmitSNB([B)[B
    .locals 4

    .line 204
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "transmitSNB,apdu="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 205
    const-string v0, "00"

    invoke-static {p1}, Lo/czx;->e([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lo/cvu;->sendApdu(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/czx;->e(Ljava/lang/String;)[B

    move-result-object v0

    return-object v0
.end method

.method public updateCardInfo(Ljava/lang/String;)Z
    .locals 4

    .line 638
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "updateCardInfo enter"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 639
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/cvu;->h:Z

    .line 640
    sget-object v0, Lo/cvu;->a:Lo/djh;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    invoke-direct {p0}, Lo/cvu;->u()Z

    move-result v0

    if-nez v0, :cond_1

    .line 641
    :cond_0
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PluginPayAdapterImpl updateCardInfo payManager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 642
    const/4 v0, 0x0

    return v0

    .line 645
    :cond_1
    sget-object v0, Lo/cvu;->a:Lo/djh;

    new-instance v1, Lo/cvu$1;

    invoke-direct {v1, p0}, Lo/cvu$1;-><init>(Lo/cvu;)V

    invoke-virtual {v0, p1, v1}, Lo/djh;->b(Ljava/lang/String;Lcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 657
    const-string v0, "updateCardInfo"

    sget-object v1, Lo/cvu;->v:Ljava/lang/Object;

    const-wide/16 v2, 0x1770

    invoke-direct {p0, v0, v1, v2, v3}, Lo/cvu;->e(Ljava/lang/String;Ljava/lang/Object;J)V

    .line 659
    const-string v0, "PluginPayAdapterImpl"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "updateCardInfo end , result is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-boolean v3, p0, Lo/cvu;->h:Z

    if-eqz v3, :cond_2

    const-string v3, "success"

    goto :goto_0

    :cond_2
    const-string v3, "failed"

    :goto_0
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 660
    iget-boolean v0, p0, Lo/cvu;->h:Z

    return v0
.end method
