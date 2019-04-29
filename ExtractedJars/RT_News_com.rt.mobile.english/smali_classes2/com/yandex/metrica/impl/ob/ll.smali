.class public abstract Lcom/yandex/metrica/impl/ob/ll;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private volatile a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ll;->a:Z

    .line 27
    iput-boolean p1, p0, Lcom/yandex/metrica/impl/ob/ll;->a:Z

    return-void
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method private d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 101
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ll;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ll;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/ll;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 103
    :catch_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ll;->c()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    .line 19
    iput-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ll;->a:Z

    return-void
.end method

.method a(ILjava/lang/String;)V
    .locals 3

    .line 71
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ll;->a:Z

    if-eqz v0, :cond_0

    .line 72
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ll;->d()Ljava/lang/String;

    move-result-object v0

    .line 1096
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ll;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, Lcom/yandex/metrica/impl/ob/ll;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 72
    invoke-static {p1, v0, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method varargs a(ILjava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 77
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ll;->a:Z

    if-eqz v0, :cond_0

    .line 78
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ll;->d()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p2, p3}, Lcom/yandex/metrica/impl/ob/ll;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v0, p2}, Landroid/util/Log;->println(ILjava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x4

    .line 35
    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/ll;->a(ILjava/lang/String;)V

    return-void
.end method

.method public varargs a(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x4

    .line 55
    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ll;->a(ILjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x5

    .line 39
    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/ll;->a(ILjava/lang/String;)V

    return-void
.end method

.method public varargs b(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    const/4 v0, 0x5

    .line 59
    invoke-virtual {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/ll;->a(ILjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public b()Z
    .locals 1

    .line 23
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ll;->a:Z

    return v0
.end method

.method c()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 109
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ll;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method abstract c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x6

    .line 43
    invoke-virtual {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/ll;->a(ILjava/lang/String;)V

    return-void
.end method

.method abstract d()Ljava/lang/String;
.end method

.method abstract e()Ljava/lang/String;
.end method
