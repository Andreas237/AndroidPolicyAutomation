.class public abstract Lcom/yandex/metrica/impl/ao;
.super Lcom/yandex/metrica/impl/aq;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/mq;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/lo;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/ob/ma;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 36
    new-instance v0, Lcom/yandex/metrica/impl/o;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/o;-><init>()V

    new-instance v1, Lcom/yandex/metrica/impl/ob/mj;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/mj;-><init>()V

    new-instance v2, Lcom/yandex/metrica/impl/ob/lo;

    invoke-direct {v2}, Lcom/yandex/metrica/impl/ob/lo;-><init>()V

    new-instance v3, Lcom/yandex/metrica/impl/ob/lz;

    invoke-direct {v3}, Lcom/yandex/metrica/impl/ob/lz;-><init>()V

    invoke-direct {p0, v0, v1, v2, v3}, Lcom/yandex/metrica/impl/ao;-><init>(Lcom/yandex/metrica/impl/am;Lcom/yandex/metrica/impl/ob/mq;Lcom/yandex/metrica/impl/ob/lo;Lcom/yandex/metrica/impl/ob/ma;)V

    return-void
.end method

.method public constructor <init>(Lcom/yandex/metrica/impl/am;Lcom/yandex/metrica/impl/ob/mq;Lcom/yandex/metrica/impl/ob/lo;Lcom/yandex/metrica/impl/ob/ma;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/am;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/mq;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/lo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/ma;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 47
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/aq;-><init>(Lcom/yandex/metrica/impl/am;)V

    .line 48
    iput-object p2, p0, Lcom/yandex/metrica/impl/ao;->a:Lcom/yandex/metrica/impl/ob/mq;

    .line 49
    iput-object p3, p0, Lcom/yandex/metrica/impl/ao;->b:Lcom/yandex/metrica/impl/ob/lo;

    .line 50
    iput-object p4, p0, Lcom/yandex/metrica/impl/ao;->c:Lcom/yandex/metrica/impl/ob/ma;

    return-void
.end method


# virtual methods
.method protected C()V
    .locals 2

    .line 60
    iget-object v0, p0, Lcom/yandex/metrica/impl/ao;->c:Lcom/yandex/metrica/impl/ob/ma;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/ma;->a()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/yandex/metrica/impl/ao;->a(Ljava/lang/Long;)V

    return-void
.end method

.method protected abstract D()V
.end method

.method protected a(Landroid/net/Uri$Builder;)V
    .locals 2

    .line 74
    iget-object v0, p0, Lcom/yandex/metrica/impl/ao;->a:Lcom/yandex/metrica/impl/ob/mq;

    invoke-interface {v0}, Lcom/yandex/metrica/impl/ob/mq;->a()Lcom/yandex/metrica/impl/ob/mr;

    move-result-object v0

    sget-object v1, Lcom/yandex/metrica/impl/ob/mr;->b:Lcom/yandex/metrica/impl/ob/mr;

    if-ne v0, v1, :cond_0

    const-string v0, "encrypted_request"

    const-string v1, "1"

    .line 75
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    :cond_0
    return-void
.end method

.method public a([B)V
    .locals 0

    .line 104
    invoke-super {p0, p1}, Lcom/yandex/metrica/impl/aq;->a([B)V

    return-void
.end method

.method public c()Z
    .locals 2

    .line 65
    invoke-super {p0}, Lcom/yandex/metrica/impl/aq;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 66
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ao;->p()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 67
    :cond_0
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ao;->D()V

    :cond_1
    return v0
.end method

.method public c([B)Z
    .locals 2
    .param p1    # [B
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 82
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ao;->b:Lcom/yandex/metrica/impl/ob/lo;

    invoke-virtual {v1, p1}, Lcom/yandex/metrica/impl/ob/lo;->a([B)[B

    move-result-object p1

    if-eqz p1, :cond_0

    .line 85
    iget-object v1, p0, Lcom/yandex/metrica/impl/ao;->a:Lcom/yandex/metrica/impl/ob/mq;

    invoke-interface {v1, p1}, Lcom/yandex/metrica/impl/ob/mq;->a([B)[B

    move-result-object p1

    if-eqz p1, :cond_0

    .line 91
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ao;->a([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    :cond_0
    return v0

    :catch_0
    return v0
.end method

.method public e()V
    .locals 0

    .line 55
    invoke-super {p0}, Lcom/yandex/metrica/impl/aq;->e()V

    .line 56
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ao;->C()V

    return-void
.end method

.method protected p()Z
    .locals 2

    .line 108
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ao;->l()I

    move-result v0

    const/16 v1, 0x190

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
