.class public Lcom/yandex/metrica/impl/ob/cu;
.super Lcom/yandex/metrica/impl/ob/cl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/cl<",
        "Lcom/yandex/metrica/impl/ob/bq;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/bq;


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/cs;Lcom/yandex/metrica/impl/ob/bq;)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/cl;-><init>(Lcom/yandex/metrica/impl/ob/cs;)V

    .line 23
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/cu;->a:Lcom/yandex/metrica/impl/ob/bq;

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/yandex/metrica/impl/ob/bq;",
            ">;)V"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/cu;->a:Lcom/yandex/metrica/impl/ob/bq;

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method
