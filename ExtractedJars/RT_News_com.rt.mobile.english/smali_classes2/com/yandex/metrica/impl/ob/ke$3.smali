.class Lcom/yandex/metrica/impl/ob/ke$3;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ke;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Lcom/yandex/metrica/impl/ob/ke$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/ke;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ke;)V
    .locals 1

    .line 218
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ke$3;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string p1, "p"

    .line 220
    new-instance v0, Lcom/yandex/metrica/impl/ob/ke$3$1;

    invoke-direct {v0, p0}, Lcom/yandex/metrica/impl/ob/ke$3$1;-><init>(Lcom/yandex/metrica/impl/ob/ke$3;)V

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/ke$3;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
