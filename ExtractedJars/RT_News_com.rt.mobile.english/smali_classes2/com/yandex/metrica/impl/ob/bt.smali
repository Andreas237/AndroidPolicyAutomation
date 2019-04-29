.class public Lcom/yandex/metrica/impl/ob/bt;
.super Lcom/yandex/metrica/impl/ob/bq;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/da;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ab;)V
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 17
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ab;->H()Lcom/yandex/metrica/impl/ob/da;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/bt;-><init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/da;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/ab;Lcom/yandex/metrica/impl/ob/da;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ab;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/da;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 33
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bq;-><init>(Lcom/yandex/metrica/impl/ob/ab;)V

    .line 34
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/bt;->a:Lcom/yandex/metrica/impl/ob/da;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Z
    .locals 2
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 22
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->a()Ljava/lang/String;

    move-result-object v0

    .line 23
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 24
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/bt;->a:Lcom/yandex/metrica/impl/ob/da;

    .line 25
    invoke-virtual {p1}, Lcom/yandex/metrica/impl/h;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/da;->a(Ljava/lang/String;)Lcom/yandex/metrica/impl/r;

    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/h;->a(Lcom/yandex/metrica/impl/r;)Lcom/yandex/metrica/impl/h;

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
