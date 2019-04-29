.class Lcom/yandex/metrica/impl/ob/ke$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ke;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/ke;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ke;Landroid/os/Looper;)V
    .locals 0

    .line 149
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ke$2;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 153
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 154
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x64

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 157
    :cond_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ke$2;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/ke;->e()V

    .line 159
    :try_start_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ke$2;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ke;->b(Lcom/yandex/metrica/impl/ob/ke;)Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke$2;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ke;->a(Lcom/yandex/metrica/impl/ob/ke;)Landroid/content/ServiceConnection;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 162
    :catch_0
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/ke$2;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/ke;->b(Lcom/yandex/metrica/impl/ob/ke;)Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object p1

    const-string v0, "socket_unbind_has_thrown_exception"

    invoke-interface {p1, v0}, Lcom/yandex/metrica/b;->reportEvent(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
