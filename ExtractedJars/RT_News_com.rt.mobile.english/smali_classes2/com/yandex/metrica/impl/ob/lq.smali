.class public Lcom/yandex/metrica/impl/ob/lq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/lq$a;
    }
.end annotation


# instance fields
.field private a:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Landroid/net/LocalServerSocket;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/ka;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 40
    new-instance v0, Lcom/yandex/metrica/impl/ob/jy;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/jy;-><init>(I)V

    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/lq;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ka;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/ka;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ka;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lq;->a:Ljava/lang/String;

    const-string v0, "[LocalSocketLock:%s]"

    const/4 v1, 0x1

    .line 93
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/lq;->c:Lcom/yandex/metrica/impl/ob/ka;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/ka;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ka;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/yandex/metrica/impl/ob/lq$a;
        }
    .end annotation

    if-nez p1, :cond_0

    .line 76
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/lq;->c:Lcom/yandex/metrica/impl/ob/ka;

    .line 80
    :cond_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/lq;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 83
    :cond_1
    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ka;->a()V

    .line 84
    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ka;->c()V

    .line 86
    invoke-interface {p1}, Lcom/yandex/metrica/impl/ob/ka;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 88
    new-instance p1, Lcom/yandex/metrica/impl/ob/lq$a;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/ob/lq$a;-><init>()V

    throw p1
.end method

.method public a()Z
    .locals 2

    .line 46
    :try_start_0
    new-instance v0, Landroid/net/LocalServerSocket;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/lq;->a:Ljava/lang/String;

    invoke-direct {v0, v1}, Landroid/net/LocalServerSocket;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/lq;->b:Landroid/net/LocalServerSocket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method

.method public b()V
    .locals 1

    .line 57
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lq;->b:Landroid/net/LocalServerSocket;

    if-eqz v0, :cond_0

    .line 59
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lq;->b:Landroid/net/LocalServerSocket;

    invoke-virtual {v0}, Landroid/net/LocalServerSocket;->close()V

    const/4 v0, 0x0

    .line 60
    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/lq;->b:Landroid/net/LocalServerSocket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    :cond_0
    return-void
.end method

.method public c()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/yandex/metrica/impl/ob/lq$a;
        }
    .end annotation

    const/4 v0, 0x0

    .line 68
    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ob/lq;->a(Lcom/yandex/metrica/impl/ob/ka;)V

    return-void
.end method
