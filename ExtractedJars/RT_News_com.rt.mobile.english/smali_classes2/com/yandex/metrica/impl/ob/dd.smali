.class public Lcom/yandex/metrica/impl/ob/dd;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lcom/yandex/metrica/impl/ob/dc;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/ep;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Ljava/lang/String;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/y;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/y;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 24
    new-instance v0, Lcom/yandex/metrica/impl/ob/dc;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/dc;-><init>()V

    .line 26
    invoke-static {p1}, Lcom/yandex/metrica/impl/ob/eu;->a(Landroid/content/Context;)Lcom/yandex/metrica/impl/ob/eu;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/yandex/metrica/impl/ob/eu;->c(Lcom/yandex/metrica/impl/ob/y;)Lcom/yandex/metrica/impl/ob/ep;

    move-result-object p1

    const-string p2, "event_hashes"

    .line 24
    invoke-direct {p0, v0, p1, p2}, Lcom/yandex/metrica/impl/ob/dd;-><init>(Lcom/yandex/metrica/impl/ob/dc;Lcom/yandex/metrica/impl/ob/ep;Ljava/lang/String;)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/dc;Lcom/yandex/metrica/impl/ob/ep;Ljava/lang/String;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/dc;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ep;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/dd;->a:Lcom/yandex/metrica/impl/ob/dc;

    .line 36
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/dd;->b:Lcom/yandex/metrica/impl/ob/ep;

    .line 37
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/dd;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lcom/yandex/metrica/impl/ob/db;
    .locals 2
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dd;->b:Lcom/yandex/metrica/impl/ob/ep;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/dd;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/ep;->a(Ljava/lang/String;)[B

    move-result-object v0

    .line 44
    invoke-static {v0}, Lcom/yandex/metrica/impl/br;->a([B)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 45
    new-instance v0, Lcom/yandex/metrica/impl/ob/db;

    invoke-direct {v0}, Lcom/yandex/metrica/impl/ob/db;-><init>()V

    goto :goto_0

    .line 47
    :cond_0
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/dd;->a:Lcom/yandex/metrica/impl/ob/dc;

    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ob/dc;->a([B)Lcom/yandex/metrica/impl/ob/db;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public a(Lcom/yandex/metrica/impl/ob/db;)V
    .locals 3
    .param p1    # Lcom/yandex/metrica/impl/ob/db;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 53
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/dd;->b:Lcom/yandex/metrica/impl/ob/ep;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/dd;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/yandex/metrica/impl/ob/dd;->a:Lcom/yandex/metrica/impl/ob/dc;

    invoke-virtual {v2, p1}, Lcom/yandex/metrica/impl/ob/dc;->a(Lcom/yandex/metrica/impl/ob/db;)[B

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/yandex/metrica/impl/ob/ep;->a(Ljava/lang/String;[B)V

    return-void
.end method
