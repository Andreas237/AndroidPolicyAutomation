.class Lcom/yandex/metrica/impl/ob/bf$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/ay$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/bf;->b(Lcom/yandex/metrica/impl/h;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/ay$a<",
        "TT;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/bl;Lcom/yandex/metrica/impl/h;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/yandex/metrica/impl/h;",
            ")Z"
        }
    .end annotation

    .line 27
    invoke-interface {p1, p2}, Lcom/yandex/metrica/impl/ob/bl;->a(Lcom/yandex/metrica/impl/h;)Z

    move-result p1

    return p1
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/yandex/metrica/impl/h;)Z
    .locals 0

    .line 24
    check-cast p1, Lcom/yandex/metrica/impl/ob/bl;

    invoke-virtual {p0, p1, p2}, Lcom/yandex/metrica/impl/ob/bf$1;->a(Lcom/yandex/metrica/impl/ob/bl;Lcom/yandex/metrica/impl/h;)Z

    move-result p1

    return p1
.end method
