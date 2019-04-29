.class Lcom/yandex/metrica/impl/ob/lb$2$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/lb$2;->run()V
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
.field final synthetic a:Lcom/yandex/metrica/impl/ob/lb$2;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/lb$2;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/lb$2$1;->a:Lcom/yandex/metrica/impl/ob/lb$2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/yandex/metrica/impl/ob/j;)V
    .locals 0

    .line 87
    check-cast p1, Lcom/yandex/metrica/impl/ob/r;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ob/lb$2$1;->a(Lcom/yandex/metrica/impl/ob/r;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/r;)V
    .locals 2

    .line 89
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/lb$2$1;->a:Lcom/yandex/metrica/impl/ob/lb$2;

    iget-object v0, v0, Lcom/yandex/metrica/impl/ob/lb$2;->a:Lcom/yandex/metrica/impl/ob/lb;

    monitor-enter v0

    .line 90
    :try_start_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/lb$2$1;->a:Lcom/yandex/metrica/impl/ob/lb$2;

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/lb$2;->a:Lcom/yandex/metrica/impl/ob/lb;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/r;->b:Lcom/yandex/metrica/impl/ob/ks;

    invoke-static {v1, p1}, Lcom/yandex/metrica/impl/ob/lb;->a(Lcom/yandex/metrica/impl/ob/lb;Lcom/yandex/metrica/impl/ob/ks;)Lcom/yandex/metrica/impl/ob/ks;

    .line 91
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
