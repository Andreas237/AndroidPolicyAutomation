.class public Lcom/yandex/metrica/impl/ob/mk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/mm;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/h;)Lcom/yandex/metrica/impl/ob/ml;
    .locals 2

    .line 16
    new-instance v0, Lcom/yandex/metrica/impl/ob/ml;

    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/mk;->a()Lcom/yandex/metrica/impl/ob/mo;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/yandex/metrica/impl/ob/ml;-><init>(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/mo;)V

    return-object v0
.end method

.method public a()Lcom/yandex/metrica/impl/ob/mo;
    .locals 1

    .line 24
    sget-object v0, Lcom/yandex/metrica/impl/ob/mo;->a:Lcom/yandex/metrica/impl/ob/mo;

    return-object v0
.end method

.method public a([B)[B
    .locals 0

    return-object p1
.end method
