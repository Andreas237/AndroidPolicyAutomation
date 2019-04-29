.class final Lcom/yandex/metrica/impl/ai$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation build Landroid/support/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ai;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ai;

.field private final b:Lcom/yandex/metrica/impl/h;

.field private final c:Landroid/os/Bundle;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ai;Landroid/content/Context;Lcom/yandex/metrica/impl/h;Landroid/os/Bundle;)V
    .locals 0

    .line 344
    iput-object p1, p0, Lcom/yandex/metrica/impl/ai$a;->a:Lcom/yandex/metrica/impl/ai;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 345
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 346
    iput-object p3, p0, Lcom/yandex/metrica/impl/ai$a;->b:Lcom/yandex/metrica/impl/h;

    .line 347
    iput-object p4, p0, Lcom/yandex/metrica/impl/ai$a;->c:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 352
    new-instance v0, Lcom/yandex/metrica/impl/ob/t;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ai$a;->c:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Lcom/yandex/metrica/impl/ob/t;-><init>(Landroid/os/Bundle;)V

    .line 353
    iget-object v1, p0, Lcom/yandex/metrica/impl/ai$a;->a:Lcom/yandex/metrica/impl/ai;

    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ai;->a(Lcom/yandex/metrica/impl/ob/t;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 357
    :cond_0
    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/am;->a(Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/am;

    move-result-object v1

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v2, 0x0

    .line 366
    iget-object v3, p0, Lcom/yandex/metrica/impl/ai$a;->a:Lcom/yandex/metrica/impl/ai;

    invoke-static {v3}, Lcom/yandex/metrica/impl/ai;->b(Lcom/yandex/metrica/impl/ai;)Lcom/yandex/metrica/impl/ob/an;

    move-result-object v3

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/an;->a()I

    move-result v3

    if-nez v3, :cond_2

    const/4 v2, 0x1

    .line 369
    :cond_2
    iget-object v3, p0, Lcom/yandex/metrica/impl/ai$a;->a:Lcom/yandex/metrica/impl/ai;

    invoke-static {v3}, Lcom/yandex/metrica/impl/ai;->b(Lcom/yandex/metrica/impl/ai;)Lcom/yandex/metrica/impl/ob/an;

    move-result-object v3

    invoke-virtual {v3, v1, v0}, Lcom/yandex/metrica/impl/ob/an;->a(Lcom/yandex/metrica/impl/ob/am;Lcom/yandex/metrica/impl/ob/t;)Lcom/yandex/metrica/impl/ob/ao;

    move-result-object v1

    if-eqz v2, :cond_3

    .line 371
    iget-object v2, p0, Lcom/yandex/metrica/impl/ai$a;->a:Lcom/yandex/metrica/impl/ai;

    invoke-static {v2}, Lcom/yandex/metrica/impl/ai;->c(Lcom/yandex/metrica/impl/ai;)V

    .line 373
    :cond_3
    iget-object v2, p0, Lcom/yandex/metrica/impl/ai$a;->a:Lcom/yandex/metrica/impl/ai;

    invoke-static {v2}, Lcom/yandex/metrica/impl/ai;->d(Lcom/yandex/metrica/impl/ai;)V

    .line 374
    iget-object v2, p0, Lcom/yandex/metrica/impl/ai$a;->b:Lcom/yandex/metrica/impl/h;

    invoke-interface {v1, v2, v0}, Lcom/yandex/metrica/impl/ob/ao;->a(Lcom/yandex/metrica/impl/h;Lcom/yandex/metrica/impl/ob/t;)V

    return-void
.end method
