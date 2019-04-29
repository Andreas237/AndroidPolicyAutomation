.class final Lcom/yandex/metrica/impl/as$1;
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
        "Ljava/lang/Integer;",
        "Lcom/yandex/metrica/impl/as$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/as$a;)V
    .locals 1

    .line 216
    invoke-direct {p0, p1}, Lcom/yandex/metrica/impl/ob/ls;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x1

    .line 218
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object v0, Lcom/yandex/metrica/impl/as$a;->a:Lcom/yandex/metrica/impl/as$a;

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/as$1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 219
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object v0, Lcom/yandex/metrica/impl/as$a;->b:Lcom/yandex/metrica/impl/as$a;

    invoke-virtual {p0, p1, v0}, Lcom/yandex/metrica/impl/as$1;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
