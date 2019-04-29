.class public Lcom/yandex/metrica/impl/bf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/v;


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Lcom/yandex/metrica/impl/af;

.field private final c:Lcom/yandex/metrica/impl/NativeCrashesHelper;

.field private final d:Ljava/util/concurrent/ExecutorService;

.field private e:Lcom/yandex/metrica/impl/ab;

.field private final f:Lcom/yandex/metrica/impl/f;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private g:Lcom/yandex/metrica/impl/ob/ko;

.field private final h:Lcom/yandex/metrica/impl/bg;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/u;Ljava/util/concurrent/ExecutorService;Landroid/content/Context;Landroid/os/Handler;)V
    .locals 1

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    new-instance v0, Lcom/yandex/metrica/impl/af;

    invoke-direct {v0, p3, p4}, Lcom/yandex/metrica/impl/af;-><init>(Landroid/content/Context;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/bf;->b:Lcom/yandex/metrica/impl/af;

    .line 57
    iput-object p2, p0, Lcom/yandex/metrica/impl/bf;->d:Ljava/util/concurrent/ExecutorService;

    .line 59
    iput-object p3, p0, Lcom/yandex/metrica/impl/bf;->a:Landroid/content/Context;

    .line 60
    new-instance p2, Lcom/yandex/metrica/impl/NativeCrashesHelper;

    invoke-direct {p2, p3}, Lcom/yandex/metrica/impl/NativeCrashesHelper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/yandex/metrica/impl/bf;->c:Lcom/yandex/metrica/impl/NativeCrashesHelper;

    .line 63
    new-instance p2, Lcom/yandex/metrica/impl/f;

    invoke-direct {p2, p1}, Lcom/yandex/metrica/impl/f;-><init>(Lcom/yandex/metrica/impl/ob/u;)V

    iput-object p2, p0, Lcom/yandex/metrica/impl/bf;->f:Lcom/yandex/metrica/impl/f;

    .line 65
    new-instance p1, Lcom/yandex/metrica/impl/bg;

    invoke-direct {p1, p0}, Lcom/yandex/metrica/impl/bg;-><init>(Lcom/yandex/metrica/impl/v;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/bf;->h:Lcom/yandex/metrica/impl/bg;

    return-void
.end method

.method private a(Lcom/yandex/metrica/impl/bg$d;)Ljava/util/concurrent/Future;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/bg$d;",
            ")",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 296
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bg$d;->a()Lcom/yandex/metrica/impl/bc;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/bf;->g:Lcom/yandex/metrica/impl/ob/ko;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/bc;->a(Lcom/yandex/metrica/impl/ob/ko;)V

    .line 298
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->h:Lcom/yandex/metrica/impl/bg;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bg;->a(Lcom/yandex/metrica/impl/bg$d;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)Lcom/yandex/metrica/impl/h;
    .locals 0

    .line 36
    invoke-static {p0, p1}, Lcom/yandex/metrica/impl/bf;->c(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)Lcom/yandex/metrica/impl/h;

    move-result-object p0

    return-object p0
.end method

.method private static c(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)Lcom/yandex/metrica/impl/h;
    .locals 2

    .line 108
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/h;->d()I

    move-result v0

    sget-object v1, Lcom/yandex/metrica/impl/q$a;->e:Lcom/yandex/metrica/impl/q$a;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 109
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bc;->f()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/h;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    :cond_0
    return-object p0
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/af;
    .locals 1

    .line 303
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->b:Lcom/yandex/metrica/impl/af;

    return-object v0
.end method

.method public a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;Ljava/util/Map;)Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/h;",
            "Lcom/yandex/metrica/impl/bc;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/concurrent/Future<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 121
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->b:Lcom/yandex/metrica/impl/af;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/af;->c()V

    .line 122
    new-instance v0, Lcom/yandex/metrica/impl/bg$d;

    invoke-direct {v0, p1, p2}, Lcom/yandex/metrica/impl/bg$d;-><init>(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    .line 123
    invoke-static {p3}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Map;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 124
    new-instance p1, Lcom/yandex/metrica/impl/bf$1;

    invoke-direct {p1, p3, p2}, Lcom/yandex/metrica/impl/bf$1;-><init>(Ljava/util/Map;Lcom/yandex/metrica/impl/bc;)V

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bg$d;->a(Lcom/yandex/metrica/impl/bg$c;)Lcom/yandex/metrica/impl/bg$d;

    .line 130
    :cond_0
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/bg$d;)Ljava/util/concurrent/Future;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/IMetricaService;Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 206
    invoke-virtual {p0, p3}, Lcom/yandex/metrica/impl/bf;->c(Lcom/yandex/metrica/impl/bc;)V

    .line 211
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->c:Lcom/yandex/metrica/impl/NativeCrashesHelper;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 213
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->c:Lcom/yandex/metrica/impl/NativeCrashesHelper;

    iget-object v1, p0, Lcom/yandex/metrica/impl/bf;->d:Ljava/util/concurrent/ExecutorService;

    invoke-virtual {v0, p0, v1}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->a(Lcom/yandex/metrica/impl/bf;Ljava/util/concurrent/ExecutorService;)V

    .line 1291
    :cond_0
    invoke-virtual {p3}, Lcom/yandex/metrica/impl/bc;->c()Landroid/os/Bundle;

    move-result-object p3

    invoke-virtual {p2, p3}, Lcom/yandex/metrica/impl/h;->a(Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/yandex/metrica/IMetricaService;->reportData(Landroid/os/Bundle;)V

    .line 2281
    iget-object p1, p0, Lcom/yandex/metrica/impl/bf;->e:Lcom/yandex/metrica/impl/ab;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/yandex/metrica/impl/bf;->e:Lcom/yandex/metrica/impl/ab;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ab;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 2282
    :cond_1
    iget-object p1, p0, Lcom/yandex/metrica/impl/bf;->b:Lcom/yandex/metrica/impl/af;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/af;->b()V

    :cond_2
    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ab;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/yandex/metrica/impl/bf;->e:Lcom/yandex/metrica/impl/ab;

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/bc;)V
    .locals 1

    .line 149
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bc;->g()Lcom/yandex/metrica/impl/at;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/q;->a(Lcom/yandex/metrica/impl/at;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/bh;Lcom/yandex/metrica/impl/bc;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/bh;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/bc;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 259
    new-instance v0, Lcom/yandex/metrica/impl/bg$d;

    .line 3166
    new-instance v1, Lcom/yandex/metrica/impl/d;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/d;-><init>()V

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->l:Lcom/yandex/metrica/impl/q$a;

    .line 3167
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/d;->a(I)Lcom/yandex/metrica/impl/h;

    move-result-object v1

    .line 260
    invoke-direct {v0, v1, p2}, Lcom/yandex/metrica/impl/bg$d;-><init>(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    new-instance p2, Lcom/yandex/metrica/impl/bf$4;

    invoke-direct {p2, p1}, Lcom/yandex/metrica/impl/bf$4;-><init>(Lcom/yandex/metrica/impl/bh;)V

    .line 261
    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/bg$d;->a(Lcom/yandex/metrica/impl/bg$c;)Lcom/yandex/metrica/impl/bg$d;

    move-result-object p1

    .line 259
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/bg$d;)Ljava/util/concurrent/Future;

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V
    .locals 1

    .line 115
    invoke-static {p1, p2}, Lcom/yandex/metrica/impl/bf;->c(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;Ljava/util/Map;)Ljava/util/concurrent/Future;

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/j;)V
    .locals 1

    .line 84
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->f:Lcom/yandex/metrica/impl/f;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/f;->a(Lcom/yandex/metrica/impl/j;)V

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ob/jg$a;Lcom/yandex/metrica/impl/bc;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/jg$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/bc;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 234
    new-instance v0, Lcom/yandex/metrica/impl/bg$d;

    .line 3153
    new-instance v1, Lcom/yandex/metrica/impl/h;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/h;-><init>()V

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->j:Lcom/yandex/metrica/impl/q$a;

    .line 3154
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/h;->a(I)Lcom/yandex/metrica/impl/h;

    move-result-object v1

    .line 234
    invoke-direct {v0, v1, p2}, Lcom/yandex/metrica/impl/bg$d;-><init>(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    new-instance p2, Lcom/yandex/metrica/impl/bf$2;

    invoke-direct {p2, p1}, Lcom/yandex/metrica/impl/bf$2;-><init>(Lcom/yandex/metrica/impl/ob/jg$a;)V

    .line 235
    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/bg$d;->a(Lcom/yandex/metrica/impl/bg$c;)Lcom/yandex/metrica/impl/bg$d;

    move-result-object p1

    .line 234
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/bg$d;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jn;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jn;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 145
    invoke-static {p1}, Lcom/yandex/metrica/impl/q;->a(Lcom/yandex/metrica/impl/ob/jn;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->f:Lcom/yandex/metrica/impl/f;

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ob/ko;)V
    .locals 1

    .line 77
    iput-object p1, p0, Lcom/yandex/metrica/impl/bf;->g:Lcom/yandex/metrica/impl/ob/ko;

    .line 80
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->f:Lcom/yandex/metrica/impl/f;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/f;->b(Lcom/yandex/metrica/impl/ob/ko;)V

    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->e:Lcom/yandex/metrica/impl/ab;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ab;->d()Lcom/yandex/metrica/impl/bc;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/bf;->a(Ljava/lang/String;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method a(Ljava/lang/String;Lcom/yandex/metrica/impl/bc;)V
    .locals 2

    .line 96
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    const-string v1, "Error received: native"

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/lv;->a(Ljava/lang/String;)V

    .line 98
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->n:Lcom/yandex/metrica/impl/q$a;

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/q;->a(Lcom/yandex/metrica/impl/q$a;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/metrica/impl/bc;)V
    .locals 3

    .line 223
    new-instance v0, Lcom/yandex/metrica/impl/bg$d;

    .line 3142
    new-instance v1, Lcom/yandex/metrica/impl/h;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/h;-><init>()V

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->u:Lcom/yandex/metrica/impl/q$a;

    .line 3143
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/h;->a(I)Lcom/yandex/metrica/impl/h;

    move-result-object v1

    .line 3144
    invoke-virtual {v1, p1, p2}, Lcom/yandex/metrica/impl/h;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 224
    invoke-direct {v0, p1, p3}, Lcom/yandex/metrica/impl/bg$d;-><init>(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    .line 223
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/bg$d;)Ljava/util/concurrent/Future;

    return-void
.end method

.method a(Ljava/lang/Throwable;Lcom/yandex/metrica/impl/bc;)V
    .locals 2

    .line 169
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/bc;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/CounterConfiguration;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 170
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    const-string v1, "Error received: uncaught"

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/lv;->a(Ljava/lang/String;)V

    .line 174
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->b:Lcom/yandex/metrica/impl/af;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/af;->c()V

    const/4 v0, 0x0

    .line 176
    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v0

    if-nez p1, :cond_1

    const-string p1, ""

    goto :goto_0

    .line 178
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    .line 177
    :goto_0
    invoke-static {p1, v0}, Lcom/yandex/metrica/impl/q;->d(Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    .line 180
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/bc;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/h;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    .line 182
    :try_start_0
    new-instance v0, Lcom/yandex/metrica/impl/bg$d;

    invoke-direct {v0, p1, p2}, Lcom/yandex/metrica/impl/bg$d;-><init>(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    const/4 p1, 0x1

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/bg$d;->a(Z)Lcom/yandex/metrica/impl/bg$d;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/bg$d;)Ljava/util/concurrent/Future;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    return-void

    :catch_1
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 153
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->f:Lcom/yandex/metrica/impl/f;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/f;->h()Lcom/yandex/metrica/impl/ob/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/u;->a(Ljava/util/List;)V

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 157
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->f:Lcom/yandex/metrica/impl/f;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/f;->h()Lcom/yandex/metrica/impl/ob/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/u;->a(Ljava/util/Map;)V

    return-void
.end method

.method a(Z)V
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->c:Lcom/yandex/metrica/impl/NativeCrashesHelper;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/NativeCrashesHelper;->a(Z)V

    return-void
.end method

.method public b()Landroid/content/Context;
    .locals 1

    .line 308
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->a:Landroid/content/Context;

    return-object v0
.end method

.method public b(Lcom/yandex/metrica/impl/bc;)V
    .locals 3

    .line 228
    new-instance v0, Lcom/yandex/metrica/impl/bg$d;

    .line 3148
    new-instance v1, Lcom/yandex/metrica/impl/h;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/h;-><init>()V

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->v:Lcom/yandex/metrica/impl/q$a;

    .line 3149
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/h;->a(I)Lcom/yandex/metrica/impl/h;

    move-result-object v1

    .line 229
    invoke-direct {v0, v1, p1}, Lcom/yandex/metrica/impl/bg$d;-><init>(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    .line 228
    invoke-direct {p0, v0}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/bg$d;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 141
    invoke-static {p1}, Lcom/yandex/metrica/impl/q;->d(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object p1

    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->f:Lcom/yandex/metrica/impl/f;

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method b(Ljava/lang/String;Lcom/yandex/metrica/impl/bc;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/bc;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 246
    new-instance v0, Lcom/yandex/metrica/impl/bg$d;

    .line 3159
    new-instance v1, Lcom/yandex/metrica/impl/d;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/d;-><init>()V

    sget-object v2, Lcom/yandex/metrica/impl/q$a;->k:Lcom/yandex/metrica/impl/q$a;

    .line 3160
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/q$a;->a()I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/d;->a(I)Lcom/yandex/metrica/impl/h;

    move-result-object v1

    .line 3161
    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/h;->d(Ljava/lang/String;)Lcom/yandex/metrica/impl/h;

    move-result-object v1

    .line 247
    invoke-direct {v0, v1, p2}, Lcom/yandex/metrica/impl/bg$d;-><init>(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    new-instance p2, Lcom/yandex/metrica/impl/bf$3;

    invoke-direct {p2, p1}, Lcom/yandex/metrica/impl/bf$3;-><init>(Ljava/lang/String;)V

    .line 248
    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/bg$d;->a(Lcom/yandex/metrica/impl/bg$c;)Lcom/yandex/metrica/impl/bg$d;

    move-result-object p1

    .line 246
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/bg$d;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public c()V
    .locals 2

    .line 134
    sget-object v0, Lcom/yandex/metrica/impl/q$a;->o:Lcom/yandex/metrica/impl/q$a;

    .line 135
    invoke-static {v0}, Lcom/yandex/metrica/impl/q;->c(Lcom/yandex/metrica/impl/q$a;)Lcom/yandex/metrica/impl/h;

    move-result-object v0

    iget-object v1, p0, Lcom/yandex/metrica/impl/bf;->f:Lcom/yandex/metrica/impl/f;

    .line 134
    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/bf;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/bc;)V

    return-void
.end method

.method c(Lcom/yandex/metrica/impl/bc;)V
    .locals 1

    .line 274
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bc;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/CounterConfiguration;->p()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 275
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bc;->b()Lcom/yandex/metrica/CounterConfiguration;

    move-result-object p1

    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/lv;->b()Z

    move-result v0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/CounterConfiguration;->c(Z)V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 161
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->f:Lcom/yandex/metrica/impl/f;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/f;->h()Lcom/yandex/metrica/impl/ob/u;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/u;->a(Ljava/lang/String;)V

    return-void
.end method

.method d()V
    .locals 1

    .line 192
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->b:Lcom/yandex/metrica/impl/af;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/af;->c()V

    return-void
.end method

.method e()V
    .locals 1

    .line 197
    iget-object v0, p0, Lcom/yandex/metrica/impl/bf;->b:Lcom/yandex/metrica/impl/af;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/af;->b()V

    return-void
.end method
