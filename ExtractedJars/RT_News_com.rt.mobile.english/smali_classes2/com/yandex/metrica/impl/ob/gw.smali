.class public Lcom/yandex/metrica/impl/ob/gw;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/ew;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/gr;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 28
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/eu;->h()Lcom/yandex/metrica/impl/ob/ew;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ob/gr;

    invoke-direct {v1, p1}, Lcom/yandex/metrica/impl/ob/gr;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/gw;-><init>(Lcom/yandex/metrica/impl/ob/ew;Lcom/yandex/metrica/impl/ob/gr;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/ew;Lcom/yandex/metrica/impl/ob/gr;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ew;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/gr;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gw;->a:Lcom/yandex/metrica/impl/ob/ew;

    .line 44
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/gw;->b:Lcom/yandex/metrica/impl/ob/gr;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/gx;)V
    .locals 4
    .param p1    # Lcom/yandex/metrica/impl/ob/gx;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 33
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gw;->b:Lcom/yandex/metrica/impl/ob/gr;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/gr;->a(Lcom/yandex/metrica/impl/ob/gx;)Ljava/lang/String;

    move-result-object v0

    .line 34
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 37
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/gw;->a:Lcom/yandex/metrica/impl/ob/ew;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/gx;->b()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3, v0}, Lcom/yandex/metrica/impl/ob/ew;->a(JLjava/lang/String;)V

    :cond_0
    return-void
.end method
