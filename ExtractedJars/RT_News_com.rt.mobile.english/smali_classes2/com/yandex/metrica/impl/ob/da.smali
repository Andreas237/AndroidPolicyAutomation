.class public Lcom/yandex/metrica/impl/ob/da;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I

.field private final b:Lcom/yandex/metrica/impl/ob/dd;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private c:Lcom/yandex/metrica/impl/ob/db;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/y;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/y;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 26
    new-instance v0, Lcom/yandex/metrica/impl/ob/dd;

    invoke-direct {v0, p1, p2}, Lcom/yandex/metrica/impl/ob/dd;-><init>(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/y;)V

    invoke-direct {p0, v0, p3}, Lcom/yandex/metrica/impl/ob/da;-><init>(Lcom/yandex/metrica/impl/ob/dd;I)V

    return-void
.end method

.method constructor <init>(Lcom/yandex/metrica/impl/ob/dd;I)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/dd;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    iput p2, p0, Lcom/yandex/metrica/impl/ob/da;->a:I

    .line 97
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/da;->b:Lcom/yandex/metrica/impl/ob/dd;

    return-void
.end method

.method private b()V
    .locals 2

    .line 77
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->b:Lcom/yandex/metrica/impl/ob/dd;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/dd;->a()Lcom/yandex/metrica/impl/ob/db;

    move-result-object v0

    iput-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    .line 78
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/db;->e()I

    move-result v0

    iget v1, p0, Lcom/yandex/metrica/impl/ob/da;->a:I

    if-eq v0, v1, :cond_0

    .line 80
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    iget v1, p0, Lcom/yandex/metrica/impl/ob/da;->a:I

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/db;->a(I)V

    .line 81
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/da;->c()V

    :cond_0
    return-void
.end method

.method private c()V
    .locals 2

    .line 87
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->b:Lcom/yandex/metrica/impl/ob/dd;

    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/dd;->a(Lcom/yandex/metrica/impl/ob/db;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/yandex/metrica/impl/r;
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 31
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    if-nez v0, :cond_0

    .line 32
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/da;->b()V

    .line 1091
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p1

    .line 37
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/db;->c()Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 38
    sget-object p1, Lcom/yandex/metrica/impl/r;->c:Lcom/yandex/metrica/impl/r;

    goto :goto_1

    .line 40
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/db;->d()I

    move-result v0

    const/16 v1, 0x3e8

    if-ge v0, v1, :cond_2

    .line 41
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    invoke-virtual {v0, p1}, Lcom/yandex/metrica/impl/ob/db;->b(I)V

    goto :goto_0

    .line 43
    :cond_2
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/yandex/metrica/impl/ob/db;->a(Z)V

    .line 45
    :goto_0
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/da;->c()V

    .line 47
    iget-object p1, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    invoke-virtual {p1}, Lcom/yandex/metrica/impl/ob/db;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/yandex/metrica/impl/r;->b:Lcom/yandex/metrica/impl/r;

    goto :goto_1

    :cond_3
    sget-object p1, Lcom/yandex/metrica/impl/r;->a:Lcom/yandex/metrica/impl/r;

    :goto_1
    return-object p1
.end method

.method public a()V
    .locals 2

    .line 67
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    if-nez v0, :cond_0

    .line 68
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/da;->b()V

    .line 70
    :cond_0
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    invoke-virtual {v0}, Lcom/yandex/metrica/impl/ob/db;->a()V

    .line 71
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/da;->c:Lcom/yandex/metrica/impl/ob/db;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/yandex/metrica/impl/ob/db;->a(Z)V

    .line 72
    invoke-direct {p0}, Lcom/yandex/metrica/impl/ob/da;->c()V

    return-void
.end method
