.class public Lcom/yandex/metrica/impl/ob/kb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/kc;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/b;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 22
    new-instance v0, Lcom/yandex/metrica/impl/ob/kc;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/kc;-><init>()V

    .line 23
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/kd;->a(Landroid/content/Context;)Lcom/yandex/metrica/b;

    move-result-object p1

    .line 22
    invoke-direct {p0, v0, p1}, Lcom/yandex/metrica/impl/ob/kb;-><init>(Lcom/yandex/metrica/impl/ob/kc;Lcom/yandex/metrica/b;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/kc;Lcom/yandex/metrica/b;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/kc;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/kb;->a:Lcom/yandex/metrica/impl/ob/kc;

    .line 45
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/kb;->b:Lcom/yandex/metrica/b;

    return-void
.end method


# virtual methods
.method public a(Lcom/yandex/metrica/impl/ob/jk$a$a;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/jk$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 34
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kb;->b:Lcom/yandex/metrica/b;

    const-string v1, "provided_request_schedule"

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kb;->a:Lcom/yandex/metrica/impl/ob/kc;

    invoke-virtual {v2, p1}, Lcom/yandex/metrica/impl/ob/kc;->a(Lcom/yandex/metrica/impl/ob/jk$a$a;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/yandex/metrica/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/jk$a$b;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/jk$a$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 27
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kb;->b:Lcom/yandex/metrica/b;

    const-string v1, "provided_request_result"

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kb;->a:Lcom/yandex/metrica/impl/ob/kc;

    .line 29
    invoke-virtual {v2, p1}, Lcom/yandex/metrica/impl/ob/kc;->a(Lcom/yandex/metrica/impl/ob/jk$a$b;)Ljava/lang/String;

    move-result-object p1

    .line 27
    invoke-interface {v0, v1, p1}, Lcom/yandex/metrica/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/yandex/metrica/impl/ob/jk$a$a;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/jk$a$a;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 38
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/kb;->b:Lcom/yandex/metrica/b;

    const-string v1, "provided_request_send"

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/kb;->a:Lcom/yandex/metrica/impl/ob/kc;

    invoke-virtual {v2, p1}, Lcom/yandex/metrica/impl/ob/kc;->a(Lcom/yandex/metrica/impl/ob/jk$a$a;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/yandex/metrica/b;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
