.class public Lcom/yandex/metrica/impl/ob/kt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ac;


# instance fields
.field private final a:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/y;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/ob/kr;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private volatile d:Lcom/yandex/metrica/impl/ob/fo;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/fo<",
            "Lcom/yandex/metrica/impl/ob/ks;",
            ">;"
        }
    .end annotation
.end field

.field private volatile e:Lcom/yandex/metrica/impl/bo;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private f:Lcom/yandex/metrica/impl/ob/kl;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/kr;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/kr;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kt;->a:Landroid/content/Context;

    .line 66
    new-instance p1, Lcom/yandex/metrica/impl/ob/w;

    invoke-direct {p1, p2}, Lcom/yandex/metrica/impl/ob/w;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kt;->b:Lcom/yandex/metrica/impl/ob/y;

    .line 67
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/kt;->c:Lcom/yandex/metrica/impl/ob/kr;

    .line 68
    const-class p1, Lcom/yandex/metrica/impl/ob/ks;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/gd$a;->a(Ljava/lang/Class;)Lcom/yandex/metrica/impl/ob/gd;

    move-result-object p1

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/kt;->a:Landroid/content/Context;

    invoke-interface {p1, p2}, Lcom/yandex/metrica/impl/ob/gd;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/fo;

    move-result-object p1

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kt;->d:Lcom/yandex/metrica/impl/ob/fo;

    .line 69
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kt;->d:Lcom/yandex/metrica/impl/ob/fo;

    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/fo;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/ks;

    .line 70
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kt;->a(Lcom/yandex/metrica/impl/ob/ks;)V

    .line 71
    new-instance p2, Lcom/yandex/metrica/impl/ob/kl;

    new-instance p4, Lcom/yandex/metrica/impl/ob/jw$b;

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kt;->b:Lcom/yandex/metrica/impl/ob/y;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p4, v0, v1}, Lcom/yandex/metrica/impl/ob/jw$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p2, p4, p1, p3}, Lcom/yandex/metrica/impl/ob/kl;-><init>(Lcom/yandex/metrica/impl/ob/jw$b;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/t;)V

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    return-void
.end method

.method private declared-synchronized a(Lcom/yandex/metrica/impl/ob/jw;)V
    .locals 5

    monitor-enter p0

    .line 296
    :try_start_0
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/jw;->H()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 299
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/jw;->G()Ljava/util/List;

    move-result-object v1

    .line 300
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_0

    .line 301
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/jw;->C()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 303
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/kt;->f()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ks;->a()Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/yandex/metrica/impl/ob/ks$a;->d(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v4

    move v0, v3

    .line 306
    :cond_0
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 307
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/jw;->C()Ljava/util/List;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/yandex/metrica/impl/br;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    .line 309
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/kt;->f()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ks;->a()Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->d(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v4

    move v0, v3

    :cond_1
    if-eqz v0, :cond_2

    .line 313
    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/ks$a;->a()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kt;->c(Lcom/yandex/metrica/impl/ob/ks;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 316
    :cond_2
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 295
    monitor-exit p0

    throw p1
.end method

.method private declared-synchronized g()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 163
    :try_start_0
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->e:Lcom/yandex/metrica/impl/bo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 164
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 162
    monitor-exit p0

    throw v0
.end method


# virtual methods
.method declared-synchronized a()Lcom/yandex/metrica/impl/bo;
    .locals 2
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    monitor-enter p0

    .line 102
    :try_start_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/kt;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 103
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->e:Lcom/yandex/metrica/impl/bo;

    if-nez v0, :cond_0

    .line 104
    new-instance v0, Lcom/yandex/metrica/impl/bo;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/kt;->e()Lcom/yandex/metrica/impl/ob/jw;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/yandex/metrica/impl/bo;-><init>(Lcom/yandex/metrica/impl/ob/kt;Lcom/yandex/metrica/impl/ob/jw;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->e:Lcom/yandex/metrica/impl/bo;

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->e:Lcom/yandex/metrica/impl/bo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    .line 108
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 101
    monitor-exit p0

    throw v0
.end method

.method protected a(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/jw;)Lcom/yandex/metrica/impl/ob/ks;
    .locals 7
    .param p1    # Lcom/yandex/metrica/impl/bn$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/jw;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 184
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/jw;->D()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ly;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    .line 185
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->j()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    .line 186
    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/kl;->c()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v2

    iget-object v2, v2, Lcom/yandex/metrica/impl/ob/ks;->i:Ljava/lang/String;

    .line 3061
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/ly;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v3

    .line 3062
    invoke-static {v3}, Lcom/yandex/metrica/impl/ob/ly;->b(Ljava/util/Map;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    .line 4061
    :cond_0
    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/ly;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 4062
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/ly;->b(Ljava/util/Map;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 188
    :goto_0
    new-instance v2, Lcom/yandex/metrica/impl/ob/ks$a;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->a()Lcom/yandex/metrica/impl/ob/kh;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/yandex/metrica/impl/ob/ks$a;-><init>(Lcom/yandex/metrica/impl/ob/kh;)V

    .line 5028
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    div-long/2addr v3, v5

    .line 189
    invoke-virtual {v2, v3, v4}, Lcom/yandex/metrica/impl/ob/ks$a;->a(J)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v2

    .line 190
    invoke-static {}, Lcom/yandex/metrica/impl/ob/gi;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v3

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/kt;->a:Landroid/content/Context;

    .line 191
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Lcom/yandex/metrica/impl/ob/gi;->c(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 190
    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/ks$a;->b(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v2

    .line 192
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->i()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    invoke-virtual {v4}, Lcom/yandex/metrica/impl/ob/kl;->c()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v4

    iget-object v4, v4, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    .line 5029
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v3, v4

    .line 192
    :cond_2
    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v2

    .line 193
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/ks$a;->c(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v2

    .line 194
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->c()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/ks$a;->c(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v2

    .line 195
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/jw;->C()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/ks$a;->d(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v2

    .line 196
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->e()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v2

    .line 197
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->g()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/ks$a;->b(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v2

    .line 198
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/yandex/metrica/impl/ob/ks$a;->d(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v2

    .line 199
    invoke-virtual {v2, v1}, Lcom/yandex/metrica/impl/ob/ks$a;->e(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v2

    .line 200
    invoke-virtual {v2, v0}, Lcom/yandex/metrica/impl/ob/ks$a;->f(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    .line 202
    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/jw;->D()Ljava/util/Map;

    move-result-object p2

    .line 5262
    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/ly;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 5263
    invoke-interface {v1, p2}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p2

    .line 201
    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Z)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object p2

    .line 203
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->m()Lcom/yandex/metrica/impl/ob/kj;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Lcom/yandex/metrica/impl/ob/kj;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object p2

    new-instance v0, Lcom/yandex/metrica/impl/ob/fx;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/fx;-><init>()V

    .line 206
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->n()Lcom/yandex/metrica/impl/ob/jj$a$c;

    move-result-object v1

    .line 205
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fx;->a(Lcom/yandex/metrica/impl/ob/jj$a$c;)Lcom/yandex/metrica/impl/ob/gs;

    move-result-object v0

    .line 204
    invoke-virtual {p2, v0}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Lcom/yandex/metrica/impl/ob/gs;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object p2

    new-instance v0, Lcom/yandex/metrica/impl/ob/fu;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/fu;-><init>()V

    .line 210
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->o()Lcom/yandex/metrica/impl/ob/jj$a$a;

    move-result-object v1

    .line 209
    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/fu;->a(Lcom/yandex/metrica/impl/ob/jj$a$a;)Lcom/yandex/metrica/impl/ob/gn;

    move-result-object v0

    .line 208
    invoke-virtual {p2, v0}, Lcom/yandex/metrica/impl/ob/ks$a;->a(Lcom/yandex/metrica/impl/ob/gn;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object p2

    .line 212
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->q()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/yandex/metrica/impl/ob/ks$a;->e(Ljava/util/List;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object p1

    .line 213
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ks$a;->a()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/jw;Ljava/util/Map;)V
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/bn$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/jw;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/bn$b;",
            "Lcom/yandex/metrica/impl/ob/jw;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)V"
        }
    .end annotation

    .line 169
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/bn$b;->p()Ljava/lang/Long;

    move-result-object v0

    .line 1230
    invoke-static {p3}, Lcom/yandex/metrica/impl/bn;->a(Ljava/util/Map;)Ljava/lang/Long;

    move-result-object p3

    if-eqz p3, :cond_0

    .line 1232
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lx;->a()Lcom/yandex/metrica/impl/ob/lx;

    move-result-object v1

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3, v0}, Lcom/yandex/metrica/impl/ob/lx;->a(JLjava/lang/Long;)V

    .line 171
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/kt;->a(Lcom/yandex/metrica/impl/bn$b;Lcom/yandex/metrica/impl/ob/jw;)Lcom/yandex/metrica/impl/ob/ks;

    move-result-object p1

    .line 173
    monitor-enter p0

    .line 174
    :try_start_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kt;->g()V

    .line 175
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kt;->c(Lcom/yandex/metrica/impl/ob/ks;)V

    .line 176
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2217
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/kt;->c:Lcom/yandex/metrica/impl/ob/kr;

    iget-object p3, p0, Lcom/yandex/metrica/impl/ob/kt;->b:Lcom/yandex/metrica/impl/ob/y;

    invoke-virtual {p3}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, p3, p1}, Lcom/yandex/metrica/impl/ob/kr;->a(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ks;)V

    .line 2218
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kt;->a(Lcom/yandex/metrica/impl/ob/ks;)V

    return-void

    :catchall_0
    move-exception p1

    .line 176
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/km;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/km;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 284
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/kt;->g()V

    .line 285
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->c:Lcom/yandex/metrica/impl/ob/kr;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/kt;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/kr;->a(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/km;)V

    return-void
.end method

.method a(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 3

    .line 222
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ob/r;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kt;->b:Lcom/yandex/metrica/impl/ob/y;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Lcom/yandex/metrica/impl/ob/r;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ks;)V

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/h;->b(Lcom/yandex/metrica/impl/ob/j;)V

    .line 223
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 224
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ob/s;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kt;->b:Lcom/yandex/metrica/impl/ob/y;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Lcom/yandex/metrica/impl/ob/s;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/h;->b(Lcom/yandex/metrica/impl/ob/j;)V

    :cond_0
    return-void
.end method

.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/t;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 291
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kl;->a(Lcom/yandex/metrica/impl/ob/t;)V

    .line 292
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/kl;->e()Lcom/yandex/metrica/impl/ob/jq;

    move-result-object p1

    check-cast p1, Lcom/yandex/metrica/impl/ob/jw;

    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/kt;->a(Lcom/yandex/metrica/impl/ob/jw;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 293
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 290
    monitor-exit p0

    throw p1
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 324
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/kt;->f()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/ks;->a()Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/ks$a;->g(Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ks$a;

    move-result-object p1

    .line 326
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ks$a;->a()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object p1

    .line 323
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kt;->c(Lcom/yandex/metrica/impl/ob/ks;)V

    return-void
.end method

.method declared-synchronized a(J)Z
    .locals 6
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    monitor-enter p0

    .line 140
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kl;->e()Lcom/yandex/metrica/impl/ob/jq;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/jw;->e()Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 141
    monitor-exit p0

    return v1

    .line 1028
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sub-long v4, v2, p1

    const-wide/32 p1, 0x15180

    cmp-long v0, v4, p1

    if-gtz v0, :cond_2

    const-wide/16 p1, 0x0

    cmp-long v0, v4, p1

    if-gez v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    .line 149
    monitor-exit p0

    return p1

    .line 146
    :cond_2
    :goto_0
    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    .line 139
    monitor-exit p0

    throw p1
.end method

.method public b()Lcom/yandex/metrica/impl/ob/y;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 97
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->b:Lcom/yandex/metrica/impl/ob/y;

    return-object v0
.end method

.method b(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 154
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->d:Lcom/yandex/metrica/impl/ob/fo;

    invoke-interface {v0, p1}, Lcom/yandex/metrica/impl/ob/fo;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public c()Landroid/content/Context;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 92
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->a:Landroid/content/Context;

    return-object v0
.end method

.method declared-synchronized c(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    monitor-enter p0

    .line 238
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kl;->a(Lcom/yandex/metrica/impl/ob/ks;)V

    .line 239
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/kt;->b(Lcom/yandex/metrica/impl/ob/ks;)V

    .line 5268
    iget-object v0, p1, Lcom/yandex/metrica/impl/ob/ks;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/yandex/metrica/impl/bp;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 5269
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.yandex.metrica.intent.action.SYNC"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "CAUSE"

    const-string v2, "CAUSE_DEVICE_ID"

    .line 5270
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "SYNC_TO_PKG"

    .line 5271
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kt;->b:Lcom/yandex/metrica/impl/ob/y;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "SYNC_DATA"

    .line 5272
    iget-object v2, p1, Lcom/yandex/metrica/impl/ob/ks;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "SYNC_DATA_2"

    .line 5273
    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/ks;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 5274
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/kt;->a:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 237
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized d()Z
    .locals 4

    monitor-enter p0

    .line 114
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kl;->c()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v0

    iget-wide v0, v0, Lcom/yandex/metrica/impl/ob/ks;->p:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/md;->a(Ljava/lang/Long;J)J

    move-result-wide v0

    .line 115
    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/kt;->a(J)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    .line 116
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/kl;->e()Lcom/yandex/metrica/impl/ob/jq;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jw;->D()Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/ly;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    if-nez v0, :cond_0

    .line 118
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 119
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/kl;->c()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v3

    iget-object v3, v3, Lcom/yandex/metrica/impl/ob/ks;->j:Ljava/lang/String;

    .line 121
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    :cond_0
    if-nez v0, :cond_2

    .line 126
    invoke-static {}, Lcom/yandex/metrica/impl/ob/gi;->a()Lcom/yandex/metrica/impl/ob/gi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gi;->d()Ljava/lang/String;

    move-result-object v0

    .line 127
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/kl;->e()Lcom/yandex/metrica/impl/ob/jq;

    move-result-object v2

    check-cast v2, Lcom/yandex/metrica/impl/ob/jw;

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/jw;->q()Ljava/lang/String;

    move-result-object v2

    .line 129
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 130
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    :goto_0
    xor-int/2addr v0, v1

    goto :goto_1

    .line 132
    :cond_1
    invoke-static {v2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 135
    :cond_2
    :goto_1
    monitor-exit p0

    return v0

    :catchall_0
    move-exception v0

    .line 113
    monitor-exit p0

    throw v0
.end method

.method public e()Lcom/yandex/metrica/impl/ob/jw;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 159
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kl;->e()Lcom/yandex/metrica/impl/ob/jq;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/jw;

    return-object v0
.end method

.method public f()Lcom/yandex/metrica/impl/ob/ks;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 280
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kt;->f:Lcom/yandex/metrica/impl/ob/kl;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/kl;->c()Lcom/yandex/metrica/impl/ob/ks;

    move-result-object v0

    return-object v0
.end method
