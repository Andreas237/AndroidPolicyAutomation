.class public Lcom/yandex/metrica/impl/ob/kk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/kk$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/me;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/me<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/kp;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/yandex/metrica/impl/ob/kt;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/ob/kr;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    new-instance v0, Lcom/yandex/metrica/impl/ob/me;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/me;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/kk;->a:Lcom/yandex/metrica/impl/ob/me;

    .line 38
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/kk;->b:Ljava/util/HashMap;

    .line 41
    new-instance v0, Lcom/yandex/metrica/impl/ob/kk$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ob/kk$1;-><init>(Lcom/yandex/metrica/impl/ob/kk;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/kk;->c:Lcom/yandex/metrica/impl/ob/kr;

    return-void
.end method

.method public static final a()Lcom/yandex/metrica/impl/ob/kk;
    .locals 1

    .line 33
    sget-object v0, Lcom/yandex/metrica/impl/ob/kk$a;->a:Lcom/yandex/metrica/impl/ob/kk;

    return-object v0
.end method

.method static synthetic a(Lcom/yandex/metrica/impl/ob/kk;)Ljava/util/HashMap;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/kk;->b:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic b(Lcom/yandex/metrica/impl/ob/kk;)Lcom/yandex/metrica/impl/ob/me;
    .locals 0

    .line 28
    iget-object p0, p0, Lcom/yandex/metrica/impl/ob/kk;->a:Lcom/yandex/metrica/impl/ob/me;

    return-object p0
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/ae;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/bo;
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ae;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 74
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/kk;->b(Lcom/yandex/metrica/impl/ob/ae;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/kt;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/kt;->a()Lcom/yandex/metrica/impl/bo;

    move-result-object p1

    return-object p1
.end method

.method public a(Lcom/yandex/metrica/impl/ob/ae;)V
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/ob/ae;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/ae<",
            "+",
            "Lcom/yandex/metrica/impl/ob/ao;",
            ">;)V"
        }
    .end annotation

    .line 125
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kk;->b:Ljava/util/HashMap;

    monitor-enter v0

    .line 126
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kk;->a:Lcom/yandex/metrica/impl/ob/me;

    .line 127
    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object v2

    .line 128
    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->e()Lcom/yandex/metrica/impl/ob/kp;

    move-result-object v3

    .line 126
    invoke-virtual {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/me;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Collection;

    move-result-object v1

    .line 130
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    invoke-static {v1}, Lcom/yandex/metrica/impl/br;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kk;->b:Ljava/util/HashMap;

    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 130
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method b(Lcom/yandex/metrica/impl/ob/ae;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/kt;
    .locals 5
    .param p1    # Lcom/yandex/metrica/impl/ob/ae;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 82
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kk;->b:Ljava/util/HashMap;

    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v1

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/kt;

    const/4 v1, 0x1

    if-nez v0, :cond_1

    .line 84
    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kk;->b:Ljava/util/HashMap;

    monitor-enter v2

    .line 85
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kk;->b:Ljava/util/HashMap;

    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v3

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/kt;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 88
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/kk;->c(Lcom/yandex/metrica/impl/ob/ae;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/kt;

    move-result-object v1

    .line 89
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/kk;->b:Ljava/util/HashMap;

    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v4, v1

    move v1, v0

    move-object v0, v4

    .line 91
    :cond_0
    monitor-exit v2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 94
    invoke-virtual {v0, p2}, Lcom/yandex/metrica/impl/ob/kt;->a(Lcom/yandex/metrica/impl/ob/t;)V

    :cond_2
    return-object v0
.end method

.method c(Lcom/yandex/metrica/impl/ob/ae;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/kt;
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/ae;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 102
    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/y;->c()Lcom/yandex/metrica/impl/ob/kw;

    move-result-object v0

    .line 104
    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->c()Landroid/content/Context;

    move-result-object v1

    .line 105
    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kk;->c:Lcom/yandex/metrica/impl/ob/kr;

    .line 103
    invoke-interface {v0, v1, p1, p2, v2}, Lcom/yandex/metrica/impl/ob/kw;->a(Landroid/content/Context;Ljava/lang/String;Lcom/yandex/metrica/impl/ob/t;Lcom/yandex/metrica/impl/ob/kr;)Lcom/yandex/metrica/impl/ob/kt;

    move-result-object p1

    return-object p1
.end method

.method public d(Lcom/yandex/metrica/impl/ob/ae;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/kt;
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/ob/ae;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/ae<",
            "+",
            "Lcom/yandex/metrica/impl/ob/ao;",
            ">;",
            "Lcom/yandex/metrica/impl/ob/t;",
            ")",
            "Lcom/yandex/metrica/impl/ob/kt;"
        }
    .end annotation

    .line 114
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kk;->b:Ljava/util/HashMap;

    monitor-enter v0

    .line 116
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/kk;->a:Lcom/yandex/metrica/impl/ob/me;

    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->b()Lcom/yandex/metrica/impl/ob/y;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/y;->b()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ae;->e()Lcom/yandex/metrica/impl/ob/kp;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lcom/yandex/metrica/impl/ob/me;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Collection;

    .line 117
    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/kk;->b(Lcom/yandex/metrica/impl/ob/ae;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/kt;

    move-result-object p1

    .line 118
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    .line 119
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
