.class Lcom/yandex/metrica/impl/g$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/g;-><init>(Landroid/content/Context;)V
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
.field final synthetic a:Lcom/yandex/metrica/impl/g;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/g;)V
    .locals 0

    .line 81
    iput-object p1, p0, Lcom/yandex/metrica/impl/g$1;->a:Lcom/yandex/metrica/impl/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/yandex/metrica/impl/ob/j;)V
    .locals 0

    .line 81
    check-cast p1, Lcom/yandex/metrica/impl/ob/r;

    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/g$1;->a(Lcom/yandex/metrica/impl/ob/r;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/r;)V
    .locals 1

    .line 83
    monitor-enter p0

    .line 84
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/g$1;->a:Lcom/yandex/metrica/impl/g;

    iget-object p1, p1, Lcom/yandex/metrica/impl/ob/r;->b:Lcom/yandex/metrica/impl/ob/ks;

    invoke-static {v0, p1}, Lcom/yandex/metrica/impl/g;->a(Lcom/yandex/metrica/impl/g;Lcom/yandex/metrica/impl/ob/ks;)Lcom/yandex/metrica/impl/ob/ks;

    .line 85
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
