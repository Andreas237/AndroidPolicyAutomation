.class public Lcom/yandex/metrica/impl/ob/mx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/na;

.field private final b:Lcom/yandex/metrica/impl/ob/na;

.field private final c:Lcom/yandex/metrica/impl/ob/mu;

.field private final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(IIILjava/lang/String;)V
    .locals 2
    .param p4    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Lcom/yandex/metrica/impl/ob/mu;

    invoke-direct {v0, p1}, Lcom/yandex/metrica/impl/ob/mu;-><init>(I)V

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/mx;->c:Lcom/yandex/metrica/impl/ob/mu;

    .line 29
    new-instance p1, Lcom/yandex/metrica/impl/ob/na;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "map key"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, p2, v0}, Lcom/yandex/metrica/impl/ob/na;-><init>(ILjava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/mx;->a:Lcom/yandex/metrica/impl/ob/na;

    .line 30
    new-instance p1, Lcom/yandex/metrica/impl/ob/na;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "map value"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p3, p2}, Lcom/yandex/metrica/impl/ob/na;-><init>(ILjava/lang/String;)V

    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/mx;->b:Lcom/yandex/metrica/impl/ob/na;

    .line 31
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/mx;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/na;
    .locals 1

    .line 35
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/mx;->a:Lcom/yandex/metrica/impl/ob/na;

    return-object v0
.end method

.method public a(Ljava/lang/String;)V
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 47
    invoke-static {}, Lcom/yandex/metrica/impl/ob/lv;->f()Lcom/yandex/metrica/impl/ob/lv;

    move-result-object v0

    const-string v1, "The %s has reached the limit of %d items. Item with key %s will be ignored"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/mx;->d:Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/mx;->c:Lcom/yandex/metrica/impl/ob/mu;

    .line 48
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/mu;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x2

    aput-object p1, v2, v3

    .line 47
    invoke-virtual {v0, v1, v2}, Lcom/yandex/metrica/impl/ob/lv;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public b()Lcom/yandex/metrica/impl/ob/na;
    .locals 1

    .line 39
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/mx;->b:Lcom/yandex/metrica/impl/ob/na;

    return-object v0
.end method

.method public c()Lcom/yandex/metrica/impl/ob/mu;
    .locals 1

    .line 43
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/mx;->c:Lcom/yandex/metrica/impl/ob/mu;

    return-object v0
.end method
