.class final Lcom/yandex/metrica/impl/ob/kc$1;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/kc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Lcom/yandex/metrica/impl/ob/jk$a$b$a;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 40
    sget-object v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->c:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    const-string v1, "complete"

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/kc$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    sget-object v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->d:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    const-string v1, "error"

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/kc$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    sget-object v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->a:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    const-string v1, "offline"

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/kc$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    sget-object v0, Lcom/yandex/metrica/impl/ob/jk$a$b$a;->b:Lcom/yandex/metrica/impl/ob/jk$a$b$a;

    const-string v1, "incompatible_network_type"

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/kc$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
