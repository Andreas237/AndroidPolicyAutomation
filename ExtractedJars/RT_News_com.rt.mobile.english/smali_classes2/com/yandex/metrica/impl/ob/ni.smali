.class public final Lcom/yandex/metrica/impl/ob/ni;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Z

.field private final b:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/yandex/metrica/impl/ob/nk;ZLjava/lang/String;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "*>;Z",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    iput-boolean p2, p0, Lcom/yandex/metrica/impl/ob/ni;->a:Z

    .line 24
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/ni;->b:Ljava/lang/String;

    return-void
.end method

.method public static final a(Lcom/yandex/metrica/impl/ob/nk;)Lcom/yandex/metrica/impl/ob/ni;
    .locals 3
    .param p0    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "*>;)",
            "Lcom/yandex/metrica/impl/ob/ni;"
        }
    .end annotation

    .line 42
    new-instance v0, Lcom/yandex/metrica/impl/ob/ni;

    const-string v1, ""

    const/4 v2, 0x1

    invoke-direct {v0, p0, v2, v1}, Lcom/yandex/metrica/impl/ob/ni;-><init>(Lcom/yandex/metrica/impl/ob/nk;ZLjava/lang/String;)V

    return-object v0
.end method

.method public static final a(Lcom/yandex/metrica/impl/ob/nk;Ljava/lang/String;)Lcom/yandex/metrica/impl/ob/ni;
    .locals 2
    .param p0    # Lcom/yandex/metrica/impl/ob/nk;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/yandex/metrica/impl/ob/nk<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Lcom/yandex/metrica/impl/ob/ni;"
        }
    .end annotation

    .line 46
    new-instance v0, Lcom/yandex/metrica/impl/ob/ni;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1, p1}, Lcom/yandex/metrica/impl/ob/ni;-><init>(Lcom/yandex/metrica/impl/ob/nk;ZLjava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 28
    iget-boolean v0, p0, Lcom/yandex/metrica/impl/ob/ni;->a:Z

    return v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/ni;->b:Ljava/lang/String;

    return-object v0
.end method
