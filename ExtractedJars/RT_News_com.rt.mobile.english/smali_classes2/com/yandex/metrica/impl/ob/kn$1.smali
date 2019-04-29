.class final Lcom/yandex/metrica/impl/ob/kn$1;
.super Ljava/util/HashMap;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/kn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/HashMap<",
        "Lcom/yandex/metrica/impl/ob/km;",
        "Lcom/yandex/metrica/IIdentifierCallback$Reason;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 34
    sget-object v0, Lcom/yandex/metrica/impl/ob/km;->a:Lcom/yandex/metrica/impl/ob/km;

    sget-object v1, Lcom/yandex/metrica/IIdentifierCallback$Reason;->UNKNOWN:Lcom/yandex/metrica/IIdentifierCallback$Reason;

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/kn$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    sget-object v0, Lcom/yandex/metrica/impl/ob/km;->b:Lcom/yandex/metrica/impl/ob/km;

    sget-object v1, Lcom/yandex/metrica/IIdentifierCallback$Reason;->NETWORK:Lcom/yandex/metrica/IIdentifierCallback$Reason;

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/kn$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    sget-object v0, Lcom/yandex/metrica/impl/ob/km;->c:Lcom/yandex/metrica/impl/ob/km;

    sget-object v1, Lcom/yandex/metrica/IIdentifierCallback$Reason;->INVALID_RESPONSE:Lcom/yandex/metrica/IIdentifierCallback$Reason;

    invoke-virtual {p0, v0, v1}, Lcom/yandex/metrica/impl/ob/kn$1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
