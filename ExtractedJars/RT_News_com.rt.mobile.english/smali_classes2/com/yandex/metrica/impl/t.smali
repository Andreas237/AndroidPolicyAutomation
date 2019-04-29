.class public final Lcom/yandex/metrica/impl/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Lcom/yandex/metrica/impl/t;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "StaticFieldLeak"
        }
    .end annotation
.end field


# instance fields
.field private final b:Landroid/content/Context;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/jm;

.field private d:Lcom/yandex/metrica/impl/ob/kb;

.field private e:Lcom/yandex/metrica/impl/ob/jk;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput-object p1, p0, Lcom/yandex/metrica/impl/t;->b:Landroid/content/Context;

    return-void
.end method

.method public static a()Lcom/yandex/metrica/impl/t;
    .locals 1

    .line 32
    sget-object v0, Lcom/yandex/metrica/impl/t;->a:Lcom/yandex/metrica/impl/t;

    return-object v0
.end method

.method public static declared-synchronized a(Landroid/content/Context;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-class v0, Lcom/yandex/metrica/impl/t;

    monitor-enter v0

    .line 26
    :try_start_0
    sget-object v1, Lcom/yandex/metrica/impl/t;->a:Lcom/yandex/metrica/impl/t;

    if-nez v1, :cond_0

    .line 27
    new-instance v1, Lcom/yandex/metrica/impl/t;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {v1, p0}, Lcom/yandex/metrica/impl/t;-><init>(Landroid/content/Context;)V

    sput-object v1, Lcom/yandex/metrica/impl/t;->a:Lcom/yandex/metrica/impl/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 25
    monitor-exit v0

    throw p0
.end method


# virtual methods
.method public b()Landroid/content/Context;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/yandex/metrica/impl/t;->b:Landroid/content/Context;

    return-object v0
.end method

.method public declared-synchronized c()Lcom/yandex/metrica/impl/ob/jm;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 52
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/t;->c:Lcom/yandex/metrica/impl/ob/jm;

    if-nez v0, :cond_0

    .line 53
    new-instance v0, Lcom/yandex/metrica/impl/ob/jm;

    iget-object v1, p0, Lcom/yandex/metrica/impl/t;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/jm;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/t;->c:Lcom/yandex/metrica/impl/ob/jm;

    .line 55
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/t;->c:Lcom/yandex/metrica/impl/ob/jm;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 51
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d()Lcom/yandex/metrica/impl/ob/kb;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 60
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/t;->d:Lcom/yandex/metrica/impl/ob/kb;

    if-nez v0, :cond_0

    .line 61
    new-instance v0, Lcom/yandex/metrica/impl/ob/kb;

    iget-object v1, p0, Lcom/yandex/metrica/impl/t;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/kb;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/t;->d:Lcom/yandex/metrica/impl/ob/kb;

    .line 63
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/t;->d:Lcom/yandex/metrica/impl/ob/kb;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 59
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized e()Lcom/yandex/metrica/impl/ob/jk;
    .locals 4
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    monitor-enter p0

    .line 68
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/t;->e:Lcom/yandex/metrica/impl/ob/jk;

    if-nez v0, :cond_0

    .line 69
    new-instance v0, Lcom/yandex/metrica/impl/ob/jk;

    iget-object v1, p0, Lcom/yandex/metrica/impl/t;->b:Landroid/content/Context;

    const-class v2, Lcom/yandex/metrica/impl/ob/jk$a;

    .line 71
    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/gd$a;->a(Ljava/lang/Class;)Lcom/yandex/metrica/impl/ob/gd;

    move-result-object v2

    iget-object v3, p0, Lcom/yandex/metrica/impl/t;->b:Landroid/content/Context;

    invoke-interface {v2, v3}, Lcom/yandex/metrica/impl/ob/gd;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/fo;

    move-result-object v2

    .line 72
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/t;->d()Lcom/yandex/metrica/impl/ob/kb;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/yandex/metrica/impl/ob/jk;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/fo;Lcom/yandex/metrica/impl/ob/kb;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/t;->e:Lcom/yandex/metrica/impl/ob/jk;

    .line 75
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/t;->e:Lcom/yandex/metrica/impl/ob/jk;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 67
    monitor-exit p0

    throw v0
.end method
