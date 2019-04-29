.class public Lcom/yandex/metrica/impl/ai;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ag;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ai$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/util/concurrent/Executor;

.field public static final b:Lcom/yandex/metrica/impl/ob/v;

.field private static final h:Ljava/util/concurrent/ExecutorService;


# instance fields
.field private c:Lcom/yandex/metrica/impl/ob/ks;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private d:Z

.field private e:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private f:Lcom/yandex/metrica/MetricaService$d;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final g:Lcom/yandex/metrica/impl/ob/kg;

.field private final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private j:Ljava/lang/Thread;

.field private k:Lcom/yandex/metrica/impl/ob/an;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private l:Lcom/yandex/metrica/impl/ob/gy;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private m:Lcom/yandex/metrica/impl/ob/lh;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 78
    new-instance v0, Lcom/yandex/metrica/impl/ob/hn;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/hn;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/ai;->a:Ljava/util/concurrent/Executor;

    .line 79
    new-instance v0, Lcom/yandex/metrica/impl/ob/lt;

    const-string v1, "YMM-MSTE"

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/lt;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Lcom/yandex/metrica/impl/ai;->h:Ljava/util/concurrent/ExecutorService;

    .line 82
    new-instance v0, Lcom/yandex/metrica/impl/ob/v;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/v;-><init>()V

    sput-object v0, Lcom/yandex/metrica/impl/ai;->b:Lcom/yandex/metrica/impl/ob/v;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/MetricaService$d;)V
    .locals 1

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 62
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ai;->d:Z

    .line 83
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ai;->i:Ljava/util/Set;

    .line 94
    iput-object p1, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    .line 95
    iput-object p2, p0, Lcom/yandex/metrica/impl/ai;->f:Lcom/yandex/metrica/MetricaService$d;

    .line 96
    invoke-static {}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a()Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;

    move-result-object p1

    iget-object p2, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->a(Landroid/content/Context;)V

    .line 97
    new-instance p1, Lcom/yandex/metrica/impl/ob/an;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-direct {p1, p2}, Lcom/yandex/metrica/impl/ob/an;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ai;->k:Lcom/yandex/metrica/impl/ob/an;

    .line 98
    iget-object p1, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kg;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/kg;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ai;->g:Lcom/yandex/metrica/impl/ob/kg;

    return-void
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ai;)Landroid/content/Context;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    return-object p0
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ai;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ai;->d(Lcom/yandex/metrica/impl/ob/ks;)V

    return-void
.end method

.method private a(Lcom/yandex/metrica/impl/h;Landroid/os/Bundle;)V
    .locals 2

    .line 429
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->o()Z

    move-result v0

    if-nez v0, :cond_0

    .line 430
    new-instance v0, Lcom/yandex/metrica/impl/ai$a;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/yandex/metrica/impl/ai$a;-><init>(Lcom/yandex/metrica/impl/ai;Landroid/content/Context;Lcom/yandex/metrica/impl/h;Landroid/os/Bundle;)V

    .line 431
    sget-object p1, Lcom/yandex/metrica/impl/ai;->h:Ljava/util/concurrent/ExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 2

    const-string v0, "com.yandex.metrica.ACTION_C_BG_L"

    .line 3472
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4328
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/gy;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/gy;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ai;->l:Lcom/yandex/metrica/impl/ob/gy;

    .line 4329
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->l:Lcom/yandex/metrica/impl/ob/gy;

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/gy;->a(Ljava/lang/Object;)V

    .line 4333
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/lh;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/lh;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ai;->m:Lcom/yandex/metrica/impl/ob/lh;

    .line 4334
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->m:Lcom/yandex/metrica/impl/ob/lh;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lh;->a()V

    .line 255
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->size()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const-string v0, "com.yandex.metrica.ACTION_C_BG_L"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 256
    :cond_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/gy;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/gy;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/gy;->a()V

    :cond_2
    return-void
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ai;)Lcom/yandex/metrica/impl/ob/an;
    .locals 0

    .line 58
    iget-object p0, p0, Lcom/yandex/metrica/impl/ai;->k:Lcom/yandex/metrica/impl/ob/an;

    return-object p0
.end method

.method private b(Landroid/content/Intent;I)V
    .locals 3

    if-eqz p1, :cond_2

    .line 302
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    const-class v1, Lcom/yandex/metrica/CounterConfiguration;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    if-eqz p1, :cond_1

    .line 5380
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-nez v0, :cond_2

    .line 4396
    new-instance v0, Lcom/yandex/metrica/impl/ob/t;

    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/t;-><init>(Landroid/os/Bundle;)V

    .line 4397
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ai;->a(Lcom/yandex/metrica/impl/ob/t;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 4401
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Lcom/yandex/metrica/impl/h;->b(Landroid/os/Bundle;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 4403
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->n()Z

    move-result v1

    .line 4404
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->o()Z

    move-result v2

    or-int/2addr v1, v2

    if-nez v1, :cond_2

    .line 4414
    :try_start_0
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/am;->a(Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/am;

    move-result-object v1

    .line 4415
    iget-object v2, p0, Lcom/yandex/metrica/impl/ai;->k:Lcom/yandex/metrica/impl/ob/an;

    invoke-virtual {v2, v1, v0}, Lcom/yandex/metrica/impl/ob/an;->a(Lcom/yandex/metrica/impl/ob/am;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/ao;

    move-result-object v2

    .line 4419
    invoke-interface {v2, p1, v0}, Lcom/yandex/metrica/impl/ob/ao;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/t;)V

    .line 4420
    iget-object p1, p0, Lcom/yandex/metrica/impl/ai;->k:Lcom/yandex/metrica/impl/ob/an;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/am;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/am;->d()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 4421
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/am;->e()Ljava/lang/String;

    move-result-object v1

    .line 4420
    invoke-virtual {p1, v0, v2, v1}, Lcom/yandex/metrica/impl/ob/an;->a(Ljava/lang/String;ILjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 308
    :catch_0
    :cond_2
    iget-object p1, p0, Lcom/yandex/metrica/impl/ai;->f:Lcom/yandex/metrica/MetricaService$d;

    invoke-interface {p1, p2}, Lcom/yandex/metrica/MetricaService$d;->a(I)V

    return-void
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ai;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 0

    .line 58
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ai;->c(Lcom/yandex/metrica/impl/ob/ks;)V

    return-void
.end method

.method private c()V
    .locals 1

    .line 313
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->l:Lcom/yandex/metrica/impl/ob/gy;

    if-eqz v0, :cond_0

    .line 314
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->l:Lcom/yandex/metrica/impl/ob/gy;

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/gy;->b(Ljava/lang/Object;)V

    .line 316
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->m:Lcom/yandex/metrica/impl/ob/lh;

    if-eqz v0, :cond_1

    .line 317
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->m:Lcom/yandex/metrica/impl/ob/lh;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lh;->b()V

    :cond_1
    return-void
.end method

.method static synthetic c(Lcom/yandex/metrica/impl/ai;)V
    .locals 1

    const/4 v0, 0x0

    .line 6198
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ai;->d:Z

    .line 6199
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->c:Lcom/yandex/metrica/impl/ob/ks;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ai;->c(Lcom/yandex/metrica/impl/ob/ks;)V

    return-void
.end method

.method private c(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_1

    .line 437
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/gy;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/gy;

    move-result-object v0

    .line 5464
    iget-boolean v1, p0, Lcom/yandex/metrica/impl/ai;->d:Z

    if-eqz v1, :cond_0

    .line 437
    iget-object v1, p0, Lcom/yandex/metrica/impl/ai;->c:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ks;->m:Lcom/yandex/metrica/impl/ob/gn;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ai;->c:Lcom/yandex/metrica/impl/ob/ks;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/ks;->l:Lcom/yandex/metrica/impl/ob/gs;

    :goto_0
    invoke-virtual {v0, p1, v1}, Lcom/yandex/metrica/impl/ob/gy;->a(Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/gs;)V

    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/yandex/metrica/impl/ai;)V
    .locals 0

    .line 6204
    iget-object p0, p0, Lcom/yandex/metrica/impl/ai;->g:Lcom/yandex/metrica/impl/ob/kg;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/kg;->a()V

    return-void
.end method

.method private d(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p1, :cond_0

    .line 447
    new-instance v0, Lcom/yandex/metrica/impl/ob/du;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-direct {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/du;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;)V

    const-string p1, "YMM-CSL"

    .line 450
    new-instance v1, Lcom/yandex/metrica/impl/ai$5;

    invoke-direct {v1, v0}, Lcom/yandex/metrica/impl/ai$5;-><init>(Lcom/yandex/metrica/impl/ob/du;)V

    .line 451
    invoke-static {p1, v1}, Lcom/yandex/metrica/impl/ob/lt;->a(Ljava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Thread;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ai;->j:Ljava/lang/Thread;

    .line 458
    iget-object p1, p0, Lcom/yandex/metrica/impl/ai;->j:Ljava/lang/Thread;

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 109
    new-instance v0, Lcom/yandex/metrica/impl/bk;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/bk;-><init>(Landroid/content/Context;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/bk;->a(Landroid/content/Context;)V

    .line 111
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lx;->a()Lcom/yandex/metrica/impl/ob/lx;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/lx;->a(Landroid/content/Context;)V

    .line 113
    new-instance v0, Lcom/yandex/metrica/impl/ai$2;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ai$2;-><init>(Lcom/yandex/metrica/impl/ai;)V

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ai$1;

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/ai$1;-><init>(Lcom/yandex/metrica/impl/ai;)V

    .line 117
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/l$a;->a(Lcom/yandex/metrica/impl/ob/i;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v0

    .line 121
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v0

    .line 122
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v1

    const-class v2, Lcom/yandex/metrica/impl/ob/r;

    invoke-virtual {v1, p0, v2, v0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    .line 124
    invoke-static {}, Lcom/yandex/metrica/impl/ob/gi;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/gi;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 125
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/eu;->e()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object v0

    .line 126
    new-instance v1, Lcom/yandex/metrica/impl/ob/fk;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lcom/yandex/metrica/impl/ob/fk;-><init>(Lcom/yandex/metrica/impl/ob/ev;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/fk;->a()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ai;->c:Lcom/yandex/metrica/impl/ob/ks;

    .line 1261
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->c:Lcom/yandex/metrica/impl/ob/ks;

    if-eqz v0, :cond_0

    .line 1262
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->c:Lcom/yandex/metrica/impl/ob/ks;

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ai;->b(Lcom/yandex/metrica/impl/ob/ks;)V

    .line 1263
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->c:Lcom/yandex/metrica/impl/ob/ks;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ai;->d(Lcom/yandex/metrica/impl/ob/ks;)V

    .line 1266
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->c:Lcom/yandex/metrica/impl/ob/ks;

    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/ai;->c(Lcom/yandex/metrica/impl/ob/ks;)V

    .line 1272
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    const-class v1, Lcom/yandex/metrica/impl/ob/r;

    new-instance v2, Lcom/yandex/metrica/impl/ai$4;

    invoke-direct {v2, p0}, Lcom/yandex/metrica/impl/ai$4;-><init>(Lcom/yandex/metrica/impl/ai;)V

    .line 1273
    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v2

    new-instance v3, Lcom/yandex/metrica/impl/ai$3;

    invoke-direct {v3, p0}, Lcom/yandex/metrica/impl/ai$3;-><init>(Lcom/yandex/metrica/impl/ai;)V

    .line 1281
    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/l$a;->a(Lcom/yandex/metrica/impl/ob/i;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v2

    .line 1285
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v2

    .line 1272
    invoke-virtual {v0, p0, v1, v2}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    .line 130
    invoke-static {}, Lcom/yandex/metrica/impl/ob/gi;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/gi;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 131
    invoke-static {}, Lcom/yandex/metrica/impl/t;->a()Lcom/yandex/metrica/impl/t;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/t;->e()Lcom/yandex/metrica/impl/ob/jk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jk;->a()V

    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 1

    .line 149
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    .line 150
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->i:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 155
    :cond_0
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ai;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/content/Intent;I)V
    .locals 0

    .line 137
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ai;->b(Landroid/content/Intent;I)V

    return-void
.end method

.method public a(Landroid/content/Intent;II)V
    .locals 0

    .line 143
    invoke-direct {p0, p1, p3}, Lcom/yandex/metrica/impl/ai;->b(Landroid/content/Intent;I)V

    return-void
.end method

.method a(Landroid/net/Uri;Ljava/lang/String;)V
    .locals 2
    .param p1    # Landroid/net/Uri;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    if-eqz p1, :cond_0

    .line 216
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/client"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "pid"

    .line 217
    invoke-virtual {p1, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    const-string v1, "psid"

    .line 218
    invoke-virtual {p1, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 220
    iget-object v1, p0, Lcom/yandex/metrica/impl/ai;->k:Lcom/yandex/metrica/impl/ob/an;

    invoke-virtual {v1, p2, v0, p1}, Lcom/yandex/metrica/impl/ob/an;->a(Ljava/lang/String;ILjava/lang/String;)V

    .line 223
    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ai;->k:Lcom/yandex/metrica/impl/ob/an;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/an;->a()I

    move-result p1

    if-gtz p1, :cond_1

    const/4 p1, 0x1

    .line 3208
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ai;->d:Z

    .line 3209
    iget-object p1, p0, Lcom/yandex/metrica/impl/ai;->c:Lcom/yandex/metrica/impl/ob/ks;

    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ai;->c(Lcom/yandex/metrica/impl/ob/ks;)V

    .line 3211
    iget-object p1, p0, Lcom/yandex/metrica/impl/ai;->g:Lcom/yandex/metrica/impl/ob/kg;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/kg;->b()V

    :cond_1
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 245
    const-class v0, Lcom/yandex/metrica/CounterConfiguration;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 246
    invoke-static {p1}, Lcom/yandex/metrica/impl/h;->b(Landroid/os/Bundle;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    invoke-direct {p0, v0, p1}, Lcom/yandex/metrica/impl/ai;->a(Lcom/yandex/metrica/impl/h;Landroid/os/Bundle;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 65
    iput-object p1, p0, Lcom/yandex/metrica/impl/ai;->c:Lcom/yandex/metrica/impl/ob/ks;

    .line 66
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ai;->d(Lcom/yandex/metrica/impl/ob/ks;)V

    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;Landroid/os/Bundle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 238
    const-class v0, Lcom/yandex/metrica/CounterConfiguration;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 239
    new-instance v0, Lcom/yandex/metrica/impl/h;

    invoke-direct {v0, p3, p1, p2}, Lcom/yandex/metrica/impl/h;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-direct {p0, v0, p4}, Lcom/yandex/metrica/impl/ai;->a(Lcom/yandex/metrica/impl/h;Landroid/os/Bundle;)V

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ob/t;)Z
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    if-eqz p1, :cond_1

    .line 386
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/t;->a()Lcom/yandex/metrica/impl/ob/u;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->e:Landroid/content/Context;

    .line 387
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/t;->a()Lcom/yandex/metrica/impl/ob/u;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/u;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 388
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/t;->a()Lcom/yandex/metrica/impl/ob/u;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/u;->g()I

    move-result p1

    const/16 v0, 0x43

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public b()V
    .locals 1

    .line 231
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ai;->c()V

    .line 232
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Landroid/content/Intent;)V
    .locals 1

    .line 161
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    .line 162
    invoke-static {p1}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 163
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai;->i:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 168
    :cond_0
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ai;->a(Ljava/lang/String;)V

    return-void
.end method

.method b(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 289
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/ks;->n:Lcom/yandex/metrica/impl/ob/kj;

    if-nez p1, :cond_0

    .line 291
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class v0, Lcom/yandex/metrica/impl/ob/q;

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Class;)V

    return-void

    .line 293
    :cond_0
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ob/q;

    invoke-direct {v1, p1}, Lcom/yandex/metrica/impl/ob/q;-><init>(Lcom/yandex/metrica/impl/ob/kj;)V

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/h;->b(Lcom/yandex/metrica/impl/ob/j;)V

    return-void
.end method

.method public c(Landroid/content/Intent;)V
    .locals 3

    if-eqz p1, :cond_3

    .line 175
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 176
    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 177
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedAuthority()Ljava/lang/String;

    move-result-object v1

    .line 181
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 182
    iget-object v2, p0, Lcom/yandex/metrica/impl/ai;->i:Ljava/util/Set;

    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    :cond_1
    const-string v2, "com.yandex.metrica.ACTION_C_BG_L"

    .line 1472
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 188
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ai;->c()V

    .line 2468
    :cond_2
    sget-object v2, Lcom/yandex/metrica/MetricaService$a;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 192
    invoke-virtual {p0, p1, v1}, Lcom/yandex/metrica/impl/ai;->a(Landroid/net/Uri;Ljava/lang/String;)V

    :cond_3
    return-void
.end method
