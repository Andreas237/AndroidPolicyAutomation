.class Lcom/yandex/metrica/impl/ob/hj;
.super Lcom/yandex/metrica/impl/ob/gq;
.source "SourceFile"


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/ex;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Lcom/yandex/metrica/impl/ob/gr;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/lz;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/gp;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/gp;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 32
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/eu;->g()Lcom/yandex/metrica/impl/ob/ex;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ob/gr;

    invoke-direct {v1, p1}, Lcom/yandex/metrica/impl/ob/gr;-><init>(Landroid/content/Context;)V

    new-instance p1, Lcom/yandex/metrica/impl/ob/lz;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/ob/lz;-><init>()V

    invoke-direct {p0, p2, v0, v1, p1}, Lcom/yandex/metrica/impl/ob/hj;-><init>(Lcom/yandex/metrica/impl/ob/gp;Lcom/yandex/metrica/impl/ob/ex;Lcom/yandex/metrica/impl/ob/gr;Lcom/yandex/metrica/impl/ob/lz;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/gp;Lcom/yandex/metrica/impl/ob/ex;Lcom/yandex/metrica/impl/ob/gr;Lcom/yandex/metrica/impl/ob/lz;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/gp;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ex;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/gr;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/lz;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 54
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/gq;-><init>(Lcom/yandex/metrica/impl/ob/gp;)V

    .line 55
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/hj;->a:Lcom/yandex/metrica/impl/ob/ex;

    .line 56
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/hj;->b:Lcom/yandex/metrica/impl/ob/gr;

    .line 57
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/hj;->c:Lcom/yandex/metrica/impl/ob/lz;

    return-void
.end method


# virtual methods
.method public a(Landroid/location/Location;Lcom/yandex/metrica/impl/ob/gs;)V
    .locals 3
    .param p1    # Landroid/location/Location;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    if-eqz p1, :cond_0

    .line 40
    new-instance v0, Lcom/yandex/metrica/impl/ob/he;

    invoke-virtual {p2}, Lcom/yandex/metrica/impl/ob/gs;->a()Lcom/yandex/metrica/impl/ob/gs$a;

    move-result-object p2

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/hj;->c:Lcom/yandex/metrica/impl/ob/lz;

    .line 41
    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/lz;->a()J

    move-result-wide v1

    invoke-direct {v0, p2, v1, v2, p1}, Lcom/yandex/metrica/impl/ob/he;-><init>(Lcom/yandex/metrica/impl/ob/gs$a;JLandroid/location/Location;)V

    .line 43
    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/hj;->b:Lcom/yandex/metrica/impl/ob/gr;

    invoke-virtual {p2, v0}, Lcom/yandex/metrica/impl/ob/gr;->a(Lcom/yandex/metrica/impl/ob/he;)Ljava/lang/String;

    move-result-object p2

    .line 44
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 47
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/hj;->a:Lcom/yandex/metrica/impl/ob/ex;

    invoke-virtual {p1}, Landroid/location/Location;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2, p2}, Lcom/yandex/metrica/impl/ob/ex;->a(JLjava/lang/String;)V

    :cond_0
    return-void
.end method
