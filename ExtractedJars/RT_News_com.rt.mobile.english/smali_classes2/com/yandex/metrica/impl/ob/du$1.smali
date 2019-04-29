.class Lcom/yandex/metrica/impl/ob/du$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/yandex/metrica/impl/ob/du$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/du;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Ljava/util/concurrent/CountDownLatch;

.field final synthetic c:Lcom/yandex/metrica/impl/ob/du;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/du;Landroid/content/Intent;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 180
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/du$1;->c:Lcom/yandex/metrica/impl/ob/du;

    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/du$1;->a:Landroid/content/Intent;

    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/du$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 183
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/du$1;->c:Lcom/yandex/metrica/impl/ob/du;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/du$1;->a:Landroid/content/Intent;

    invoke-static {v0, v1}, Lcom/yandex/metrica/impl/ob/du;->a(Lcom/yandex/metrica/impl/ob/du;Landroid/content/Intent;)V

    .line 184
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/du$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public b()V
    .locals 1

    .line 188
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/du$1;->b:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
