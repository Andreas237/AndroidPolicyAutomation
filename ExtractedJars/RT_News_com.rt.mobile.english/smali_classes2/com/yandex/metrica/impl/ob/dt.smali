.class Lcom/yandex/metrica/impl/ob/dt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Lcom/yandex/metrica/impl/ob/fj;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private b:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/ds;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private d:Lcom/yandex/metrica/impl/ob/ks;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 38
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/yandex/metrica/impl/ob/fj;

    .line 40
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p1

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/eu;->c()Lcom/yandex/metrica/impl/ob/ev;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/yandex/metrica/impl/ob/fj;-><init>(Lcom/yandex/metrica/impl/ob/ev;)V

    new-instance p1, Lcom/yandex/metrica/impl/ob/ds;

    invoke-direct {p1}, Lcom/yandex/metrica/impl/ob/ds;-><init>()V

    .line 37
    invoke-direct {p0, v0, v1, p1, p2}, Lcom/yandex/metrica/impl/ob/dt;-><init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/fj;Lcom/yandex/metrica/impl/ob/ds;Lcom/yandex/metrica/impl/ob/ks;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/String;Lcom/yandex/metrica/impl/ob/fj;Lcom/yandex/metrica/impl/ob/ds;Lcom/yandex/metrica/impl/ob/ks;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/fj;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ds;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Lcom/yandex/metrica/impl/ob/ks;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 61
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dt;->b:Ljava/lang/String;

    .line 62
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/dt;->a:Lcom/yandex/metrica/impl/ob/fj;

    .line 63
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/dt;->c:Lcom/yandex/metrica/impl/ob/ds;

    .line 64
    iput-object p4, p0, Lcom/yandex/metrica/impl/ob/dt;->d:Lcom/yandex/metrica/impl/ob/ks;

    .line 66
    new-instance p1, Lcom/yandex/metrica/impl/ob/w;

    iget-object p2, p0, Lcom/yandex/metrica/impl/ob/dt;->b:Ljava/lang/String;

    invoke-direct {p1, p2}, Lcom/yandex/metrica/impl/ob/w;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 5
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 48
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 49
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/dt;->c:Lcom/yandex/metrica/impl/ob/ds;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/dt;->b:Ljava/lang/String;

    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/dt;->a:Lcom/yandex/metrica/impl/ob/fj;

    .line 50
    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/fj;->g()Z

    move-result v3

    iget-object v4, p0, Lcom/yandex/metrica/impl/ob/dt;->d:Lcom/yandex/metrica/impl/ob/ks;

    .line 49
    invoke-virtual {v1, v0, v2, v3, v4}, Lcom/yandex/metrica/impl/ob/ds;->a(Landroid/os/Bundle;Ljava/lang/String;ZLcom/yandex/metrica/impl/ob/ks;)V

    return-object v0
.end method
