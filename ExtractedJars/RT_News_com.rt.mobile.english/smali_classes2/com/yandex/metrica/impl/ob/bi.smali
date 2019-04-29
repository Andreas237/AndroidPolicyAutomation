.class public Lcom/yandex/metrica/impl/ob/bi;
.super Lcom/yandex/metrica/impl/ob/bg;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/x;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/bg;-><init>(Lcom/yandex/metrica/impl/ob/x;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/aq;)Z
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/h;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/aq;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 25
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/bi;->a()Lcom/yandex/metrica/impl/ob/x;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/x;->a(Lcom/yandex/metrica/impl/ob/kp;)V

    const/4 p1, 0x0

    return p1
.end method
