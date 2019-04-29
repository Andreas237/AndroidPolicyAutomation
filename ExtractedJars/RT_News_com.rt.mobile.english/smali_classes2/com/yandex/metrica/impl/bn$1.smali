.class final Lcom/yandex/metrica/impl/bn$1;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/bn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Ljava/lang/String;",
        "Lcom/yandex/metrica/impl/bn$a$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    .line 319
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    const-string v0, "wifi"

    .line 321
    sget-object v1, Lcom/yandex/metrica/impl/bn$a$a;->a:Lcom/yandex/metrica/impl/bn$a$a;

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/bn$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "cell"

    .line 322
    sget-object v1, Lcom/yandex/metrica/impl/bn$a$a;->b:Lcom/yandex/metrica/impl/bn$a$a;

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/bn$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
