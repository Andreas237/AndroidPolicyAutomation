.class Lcom/yandex/metrica/impl/ob/ke$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/k;


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
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/k<",
        "Lcom/yandex/metrica/impl/ob/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/ke;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ke;)V
    .locals 0

    .line 264
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ke$7;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/yandex/metrica/impl/ob/j;)V
    .locals 0

    .line 264
    check-cast p1, Lcom/yandex/metrica/impl/ob/m;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/ke$7;->a(Lcom/yandex/metrica/impl/ob/m;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/m;)V
    .locals 1

    .line 266
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke$7;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ke;->d(Lcom/yandex/metrica/impl/ob/ke;)Lcom/yandex/metrica/impl/ob/kf;

    move-result-object v0

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/m;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/kf;->c(Ljava/lang/String;)V

    return-void
.end method
