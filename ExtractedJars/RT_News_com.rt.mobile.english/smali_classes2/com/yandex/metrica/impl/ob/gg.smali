.class public Lcom/yandex/metrica/impl/ob/gg;
.super Lcom/yandex/metrica/impl/ob/ge;
.source "SourceFile"


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/bl$a;Lcom/yandex/metrica/impl/ob/gh;Lcom/yandex/metrica/impl/ob/gh;)V
    .locals 0

    if-nez p2, :cond_0

    move-object p2, p3

    .line 18
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/ge;-><init>(Lcom/yandex/metrica/impl/bl$a;Lcom/yandex/metrica/impl/ob/gh;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/gj;)Lcom/yandex/metrica/impl/ob/ge$a;
    .locals 2

    .line 23
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/gg;->b()Lcom/yandex/metrica/impl/ob/gh;

    move-result-object v0

    .line 24
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gh;->d()Lcom/yandex/metrica/impl/ob/gj;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/yandex/metrica/impl/ob/gj;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 25
    sget-object p1, Lcom/yandex/metrica/impl/ob/ge$a;->a:Lcom/yandex/metrica/impl/ob/ge$a;

    return-object p1

    .line 26
    :cond_0
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gh;->d()Lcom/yandex/metrica/impl/ob/gj;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 27
    sget-object p1, Lcom/yandex/metrica/impl/ob/ge$a;->b:Lcom/yandex/metrica/impl/ob/ge$a;

    return-object p1

    .line 29
    :cond_1
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gh;->b()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 30
    sget-object p1, Lcom/yandex/metrica/impl/ob/ge$a;->b:Lcom/yandex/metrica/impl/ob/ge$a;

    return-object p1

    .line 32
    :cond_2
    sget-object p1, Lcom/yandex/metrica/impl/ob/ge$a;->c:Lcom/yandex/metrica/impl/ob/ge$a;

    return-object p1
.end method

.method public bridge synthetic a()Ljava/lang/String;
    .locals 1

    .line 13
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/ge;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()Lcom/yandex/metrica/impl/ob/gh;
    .locals 1

    .line 13
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/ge;->b()Lcom/yandex/metrica/impl/ob/gh;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lcom/yandex/metrica/impl/bl$a;
    .locals 1

    .line 13
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/ge;->c()Lcom/yandex/metrica/impl/bl$a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    .line 13
    invoke-super {p0}, Lcom/yandex/metrica/impl/ob/ge;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
