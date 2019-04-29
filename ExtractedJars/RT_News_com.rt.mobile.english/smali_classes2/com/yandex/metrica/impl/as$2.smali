.class final Lcom/yandex/metrica/impl/as$2;
.super Lcom/yandex/metrica/impl/ob/ls;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/as;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/yandex/metrica/impl/ob/ls<",
        "Lcom/yandex/metrica/impl/as$a;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Integer;)V
    .locals 1

    .line 224
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/ls;-><init>(Ljava/lang/Object;)V

    .line 226
    sget-object p1, Lcom/yandex/metrica/impl/as$a;->b:Lcom/yandex/metrica/impl/as$a;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/as$2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 227
    sget-object p1, Lcom/yandex/metrica/impl/as$a;->a:Lcom/yandex/metrica/impl/as$a;

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/as$2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
