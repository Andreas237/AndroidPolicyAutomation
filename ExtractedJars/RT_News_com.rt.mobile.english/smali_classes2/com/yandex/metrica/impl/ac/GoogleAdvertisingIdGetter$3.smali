.class Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter;->b(Landroid/content/Context;)Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$d<",
        "Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 149
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/concurrent/Future;)Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 153
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Pair;

    .line 154
    new-instance v0, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;

    iget-object v1, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-direct {v0, v1, p1}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public synthetic b(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    .line 149
    invoke-virtual {p0, p1}, Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$3;->a(Ljava/util/concurrent/Future;)Lcom/yandex/metrica/impl/ac/GoogleAdvertisingIdGetter$a;

    move-result-object p1

    return-object p1
.end method
