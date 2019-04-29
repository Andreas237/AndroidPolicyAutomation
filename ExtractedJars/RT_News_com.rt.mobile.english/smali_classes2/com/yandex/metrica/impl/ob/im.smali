.class public Lcom/yandex/metrica/impl/ob/im;
.super Lcom/yandex/metrica/impl/ob/ik;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/ij;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/ij;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 19
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/ik;-><init>(Lcom/yandex/metrica/impl/ob/ij;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/ja;Lcom/yandex/metrica/impl/ob/jg$a$a;Lcom/yandex/metrica/impl/ob/ii;)Lcom/yandex/metrica/impl/ob/jg$a$a;
    .locals 1
    .param p1    # Lcom/yandex/metrica/impl/ob/ja;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/jg$a$a;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ii;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 26
    invoke-static {p2}, Lcom/yandex/metrica/impl/ob/im;->a(Lcom/yandex/metrica/impl/ob/jg$a$a;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/im;->a()Lcom/yandex/metrica/impl/ob/ij;

    move-result-object p2

    invoke-interface {p3}, Lcom/yandex/metrica/impl/ob/ii;->a()Lcom/yandex/metrica/impl/ob/jg$a$a;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Lcom/yandex/metrica/impl/ob/ij;->a(Lcom/yandex/metrica/impl/ob/ja;Lcom/yandex/metrica/impl/ob/jg$a$a;)Lcom/yandex/metrica/impl/ob/jg$a$a;

    move-result-object p1

    return-object p1

    .line 29
    :cond_0
    new-instance p1, Lcom/yandex/metrica/impl/ob/jg$a$b;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/ob/jg$a$b;-><init>()V

    iput-object p1, p2, Lcom/yandex/metrica/impl/ob/jg$a$a;->d:Lcom/yandex/metrica/impl/ob/jg$a$b;

    return-object p2
.end method
