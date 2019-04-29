.class public abstract Lcom/yandex/metrica/impl/ob/js;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/js$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lcom/yandex/metrica/impl/ob/jq;",
        "A:",
        "Ljava/lang/Object;",
        "L::Lcom/yandex/metrica/impl/ob/jq$d<",
        "TT;",
        "Lcom/yandex/metrica/impl/ob/jq$c<",
        "TA;>;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/jq;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/jq$d;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "T",
            "L;"
        }
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/jq$c;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/jq$c<",
            "TA;>;"
        }
    .end annotation
.end field

.field private d:Lcom/yandex/metrica/impl/ob/js$a;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/yandex/metrica/impl/ob/js$a<",
            "TA;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/jq$d;Lcom/yandex/metrica/impl/ob/js$a;Lcom/yandex/metrica/impl/ob/ks;Lcom/yandex/metrica/impl/ob/t;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$d;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/js$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(T",
            "L;",
            "Lcom/yandex/metrica/impl/ob/js$a<",
            "TA;>;",
            "Lcom/yandex/metrica/impl/ob/ks;",
            "Lcom/yandex/metrica/impl/ob/t;",
            ")V"
        }
    .end annotation

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/js;->b:Lcom/yandex/metrica/impl/ob/jq$d;

    .line 43
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/js;->d:Lcom/yandex/metrica/impl/ob/js$a;

    .line 44
    invoke-static {}, Lcom/yandex/metrica/impl/ob/h;->a()Lcom/yandex/metrica/impl/ob/h;

    move-result-object p1

    const-class p2, Lcom/yandex/metrica/impl/ob/p;

    new-instance v0, Lcom/yandex/metrica/impl/ob/js$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ob/js$1;-><init>(Lcom/yandex/metrica/impl/ob/js;)V

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/l;->a(Lcom/yandex/metrica/impl/ob/k;)Lcom/yandex/metrica/impl/ob/l$a;

    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/l$a;->a()Lcom/yandex/metrica/impl/ob/l;

    move-result-object v0

    .line 44
    invoke-virtual {p1, p0, p2, v0}, Lcom/yandex/metrica/impl/ob/h;->a(Ljava/lang/Object;Ljava/lang/Class;Lcom/yandex/metrica/impl/ob/l;)V

    .line 51
    new-instance p1, Lcom/yandex/metrica/impl/ob/jq$c;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/js;->d:Lcom/yandex/metrica/impl/ob/js$a;

    const/4 v0, 0x0

    .line 52
    invoke-interface {p2, v0, p4}, Lcom/yandex/metrica/impl/ob/js$a;->a(Ljava/lang/Object;Lcom/yandex/metrica/impl/ob/t;)Ljava/lang/Object;

    move-result-object p2

    invoke-direct {p1, p3, p2}, Lcom/yandex/metrica/impl/ob/jq$c;-><init>(Lcom/yandex/metrica/impl/ob/ks;Ljava/lang/Object;)V

    .line 51
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/js;->a(Lcom/yandex/metrica/impl/ob/jq$c;)V

    return-void
.end method


# virtual methods
.method protected declared-synchronized a(Lcom/yandex/metrica/impl/ob/jq$c;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/jq$c;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/jq$c<",
            "TA;>;)V"
        }
    .end annotation

    monitor-enter p0

    .line 61
    :try_start_0
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/js;->c:Lcom/yandex/metrica/impl/ob/jq$c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 60
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    monitor-enter p0

    .line 73
    :try_start_0
    new-instance v0, Lcom/yandex/metrica/impl/ob/jq$c;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/js;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/yandex/metrica/impl/ob/jq$c;-><init>(Lcom/yandex/metrica/impl/ob/ks;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/js;->a(Lcom/yandex/metrica/impl/ob/jq$c;)V

    .line 74
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/js;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    .line 72
    monitor-exit p0

    throw p1
.end method

.method public final b(Lcom/yandex/metrica/impl/ob/t;)Ljava/lang/Object;
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/ob/t;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
        otherwise = 0x4
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/t;",
            ")TA;"
        }
    .end annotation

    .line 66
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/js;->d:Lcom/yandex/metrica/impl/ob/js$a;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/js;->c:Lcom/yandex/metrica/impl/ob/jq$c;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;

    invoke-interface {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/js$a;->a(Ljava/lang/Object;Lcom/yandex/metrica/impl/ob/t;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public declared-synchronized b()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 57
    :try_start_0
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/js;->a:Lcom/yandex/metrica/impl/ob/jq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    .line 56
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized c()Lcom/yandex/metrica/impl/ob/ks;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 79
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/js;->c:Lcom/yandex/metrica/impl/ob/jq$c;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/jq$c;->a:Lcom/yandex/metrica/impl/ob/ks;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()Ljava/lang/Object;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation build Landroid/support/annotation/VisibleForTesting;
        otherwise = 0x4
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TA;"
        }
    .end annotation

    monitor-enter p0

    .line 85
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/js;->c:Lcom/yandex/metrica/impl/ob/jq$c;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/jq$c;->b:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e()Lcom/yandex/metrica/impl/ob/jq;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    monitor-enter p0

    .line 90
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/js;->a:Lcom/yandex/metrica/impl/ob/jq;

    if-nez v0, :cond_0

    .line 91
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/js;->b:Lcom/yandex/metrica/impl/ob/jq$d;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/js;->c:Lcom/yandex/metrica/impl/ob/jq$c;

    invoke-interface {v0, v1}, Lcom/yandex/metrica/impl/ob/jq$d;->a(Ljava/lang/Object;)Lcom/yandex/metrica/impl/ob/jq;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/js;->a:Lcom/yandex/metrica/impl/ob/jq;

    .line 93
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/js;->a:Lcom/yandex/metrica/impl/ob/jq;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 89
    monitor-exit p0

    throw v0
.end method
