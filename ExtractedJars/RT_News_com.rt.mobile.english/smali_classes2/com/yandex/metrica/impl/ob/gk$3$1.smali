.class Lcom/yandex/metrica/impl/ob/gk$3$1;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/gk$3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/gk$3;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/gk$3;)V
    .locals 1

    .line 245
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/gk$3$1;->a:Lcom/yandex/metrica/impl/ob/gk$3;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string p1, "candidates_count"

    .line 247
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/gk$3$1;->a:Lcom/yandex/metrica/impl/ob/gk$3;

    iget v0, v0, Lcom/yandex/metrica/impl/ob/gk$3;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/ob/gk$3$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
