.class Lcom/yandex/metrica/impl/ob/ke$a;
.super Lcom/yandex/metrica/impl/ob/ke$b;
.source "SourceFile"


# annotations
.annotation build Landroid/support/annotation/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/yandex/metrica/impl/ob/ke;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/yandex/metrica/impl/ob/ke;


# direct methods
.method constructor <init>(Lcom/yandex/metrica/impl/ob/ke;Landroid/net/Uri;Ljava/net/Socket;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 173
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/ke$a;->a:Lcom/yandex/metrica/impl/ob/ke;

    .line 174
    invoke-direct {p0, p2, p3}, Lcom/yandex/metrica/impl/ob/ke$b;-><init>(Landroid/net/Uri;Ljava/net/Socket;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 179
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke$a;->b:Landroid/net/Uri;

    const-string v1, "t"

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 180
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/ke$a;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-static {v1}, Lcom/yandex/metrica/impl/ob/ke;->c(Lcom/yandex/metrica/impl/ob/ke;)Lcom/yandex/metrica/impl/ob/kj;

    move-result-object v1

    iget-object v1, v1, Lcom/yandex/metrica/impl/ob/kj;->b:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "HTTP/1.1 200 OK"

    .line 181
    new-instance v1, Lcom/yandex/metrica/impl/ob/ke$a$1;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/ke$a$1;-><init>()V

    .line 188
    invoke-virtual {p0}, Lcom/yandex/metrica/impl/ob/ke$a;->c()[B

    move-result-object v2

    .line 181
    invoke-virtual {p0, v0, v1, v2}, Lcom/yandex/metrica/impl/ob/ke$a;->a(Ljava/lang/String;Ljava/util/Map;[B)V

    return-void

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke$a;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ke;->b(Lcom/yandex/metrica/impl/ob/ke;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v0

    const-string v1, "socket_request_with_wrong_token"

    .line 191
    invoke-interface {v0, v1}, Lcom/yandex/metrica/b;->reportEvent(Ljava/lang/String;)V

    return-void
.end method

.method protected a(Ljava/lang/Throwable;)V
    .locals 2

    .line 203
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke$a;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ke;->b(Lcom/yandex/metrica/impl/ob/ke;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v0

    const-string v1, "socket_io_exception_during_sync"

    invoke-interface {v0, v1, p1}, Lcom/yandex/metrica/b;->reportError(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method protected b()V
    .locals 3

    .line 197
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ke$a;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/ke;->b(Lcom/yandex/metrica/impl/ob/ke;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object v0

    const-string v1, "socket_sync_succeed"

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ke$a;->c:Ljava/net/Socket;

    .line 198
    invoke-virtual {v2}, Ljava/net/Socket;->getLocalPort()I

    move-result v2

    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/ke;->b(I)Ljava/util/HashMap;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/yandex/metrica/b;->reportEvent(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method protected c()[B
    .locals 3

    const/4 v0, 0x0

    .line 210
    :try_start_0
    new-instance v1, Lcom/yandex/metrica/impl/ob/mi;

    invoke-direct {v1}, Lcom/yandex/metrica/impl/ob/mi;-><init>()V

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/ke$a;->a:Lcom/yandex/metrica/impl/ob/ke;

    invoke-static {v2}, Lcom/yandex/metrica/impl/ob/ke;->d(Lcom/yandex/metrica/impl/ob/ke;)Lcom/yandex/metrica/impl/ob/kf;

    move-result-object v2

    invoke-virtual {v2}, Lcom/yandex/metrica/impl/ob/kf;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/yandex/metrica/impl/ob/mi;->a([B)[B

    move-result-object v1

    invoke-static {v1, v0}, Landroid/util/Base64;->encode([BI)[B

    move-result-object v1
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    .line 212
    :catch_0
    new-array v0, v0, [B

    return-object v0
.end method
