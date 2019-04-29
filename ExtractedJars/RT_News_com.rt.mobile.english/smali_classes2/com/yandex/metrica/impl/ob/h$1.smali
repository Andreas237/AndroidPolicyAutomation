.class Lcom/yandex/metrica/impl/ob/h$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/yandex/metrica/impl/ob/h;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/h;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/h;)V
    .locals 0

    .line 86
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/h$1;->a:Lcom/yandex/metrica/impl/ob/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 88
    :catch_0
    :goto_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h$1;->a:Lcom/yandex/metrica/impl/ob/h;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/h;->a(Lcom/yandex/metrica/impl/ob/h;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 90
    :try_start_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/h$1;->a:Lcom/yandex/metrica/impl/ob/h;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/h;->b(Lcom/yandex/metrica/impl/ob/h;)Ljava/util/concurrent/BlockingQueue;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/yandex/metrica/impl/ob/h$a;

    .line 91
    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/h$a;->a()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-void
.end method
