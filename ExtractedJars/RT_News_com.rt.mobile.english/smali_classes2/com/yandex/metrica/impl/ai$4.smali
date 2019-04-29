.class Lcom/yandex/metrica/impl/ai$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ai;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ob/k<",
        "Lcom/yandex/metrica/impl/ob/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ai;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ai;)V
    .locals 0

    .line 273
    iput-object p1, p0, Lcom/yandex/metrica/impl/ai$4;->a:Lcom/yandex/metrica/impl/ai;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/yandex/metrica/impl/ob/j;)V
    .locals 0

    .line 273
    check-cast p1, Lcom/yandex/metrica/impl/ob/r;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ai$4;->a(Lcom/yandex/metrica/impl/ob/r;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/r;)V
    .locals 2

    .line 275
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai$4;->a:Lcom/yandex/metrica/impl/ai;

    iget-object v1, p1, Lcom/yandex/metrica/impl/ob/r;->b:Lcom/yandex/metrica/impl/ob/ks;

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ai;->a(Lcom/yandex/metrica/impl/ai;Lcom/yandex/metrica/impl/ob/ks;)V

    .line 277
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai$4;->a:Lcom/yandex/metrica/impl/ai;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/r;->b:Lcom/yandex/metrica/impl/ob/ks;

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/ai;->b(Lcom/yandex/metrica/impl/ai;Lcom/yandex/metrica/impl/ob/ks;)V

    return-void
.end method
