.class Lcom/yandex/metrica/impl/ob/ge;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/yandex/metrica/impl/ob/ge$a;
    }
.end annotation


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/gh;

.field private final b:Lcom/yandex/metrica/impl/bl$a;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/bl$a;Lcom/yandex/metrica/impl/ob/gh;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/ge;->a:Lcom/yandex/metrica/impl/ob/gh;

    .line 24
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ge;->b:Lcom/yandex/metrica/impl/bl$a;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/gj;)Lcom/yandex/metrica/impl/ob/ge$a;
    .locals 0

    .line 32
    sget-object p1, Lcom/yandex/metrica/impl/ob/ge$a;->a:Lcom/yandex/metrica/impl/ob/ge$a;

    return-object p1
.end method

.method public a()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ge;->a:Lcom/yandex/metrica/impl/ob/gh;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/gh;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/yandex/metrica/impl/ob/gh;
    .locals 1

    .line 36
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ge;->a:Lcom/yandex/metrica/impl/ob/gh;

    return-object v0
.end method

.method public c()Lcom/yandex/metrica/impl/bl$a;
    .locals 1

    .line 48
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ge;->b:Lcom/yandex/metrica/impl/bl$a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Bid{mCredentials=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ge;->a:Lcom/yandex/metrica/impl/ob/gh;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", mDescriptor="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ge;->b:Lcom/yandex/metrica/impl/bl$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
