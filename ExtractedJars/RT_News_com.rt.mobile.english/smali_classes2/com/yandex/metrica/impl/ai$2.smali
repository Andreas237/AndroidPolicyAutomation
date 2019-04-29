.class Lcom/yandex/metrica/impl/ai$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ai;->a()V
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

    .line 113
    iput-object p1, p0, Lcom/yandex/metrica/impl/ai$2;->a:Lcom/yandex/metrica/impl/ai;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/yandex/metrica/impl/ob/j;)V
    .locals 0

    .line 113
    check-cast p1, Lcom/yandex/metrica/impl/ob/r;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ai$2;->a(Lcom/yandex/metrica/impl/ob/r;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/r;)V
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/yandex/metrica/impl/ai$2;->a:Lcom/yandex/metrica/impl/ai;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/r;->b:Lcom/yandex/metrica/impl/ob/ks;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ai;->a(Lcom/yandex/metrica/impl/ob/ks;)V

    return-void
.end method
