.class Lcom/yandex/metrica/impl/ob/go;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/yandex/metrica/impl/ob/gs;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final b:Lcom/yandex/metrica/impl/ob/ex;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private final c:Lcom/yandex/metrica/impl/ob/ew;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/yandex/metrica/impl/ob/gs;Lcom/yandex/metrica/impl/ob/ex;Lcom/yandex/metrica/impl/ob/ew;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/yandex/metrica/impl/ob/ex;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/yandex/metrica/impl/ob/ew;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/go;->a:Lcom/yandex/metrica/impl/ob/gs;

    .line 32
    iput-object p2, p0, Lcom/yandex/metrica/impl/ob/go;->b:Lcom/yandex/metrica/impl/ob/ex;

    .line 33
    iput-object p3, p0, Lcom/yandex/metrica/impl/ob/go;->c:Lcom/yandex/metrica/impl/ob/ew;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 9

    .line 37
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/go;->a:Lcom/yandex/metrica/impl/ob/gs;

    if-eqz v0, :cond_3

    .line 38
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/go;->a:Lcom/yandex/metrica/impl/ob/gs;

    .line 1046
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/go;->b:Lcom/yandex/metrica/impl/ob/ex;

    invoke-virtual {v1}, Lcom/yandex/metrica/impl/ob/ex;->a()J

    move-result-wide v1

    iget v3, v0, Lcom/yandex/metrica/impl/ob/gs;->h:I

    int-to-long v3, v3

    cmp-long v5, v1, v3

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-lez v5, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    const v4, 0x3dcccccd    # 0.1f

    if-eqz v3, :cond_1

    .line 1050
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/go;->b:Lcom/yandex/metrica/impl/ob/ex;

    iget v0, v0, Lcom/yandex/metrica/impl/ob/gs;->h:I

    int-to-float v0, v0

    mul-float/2addr v0, v4

    float-to-int v0, v0

    invoke-virtual {v3, v0}, Lcom/yandex/metrica/impl/ob/ex;->c(I)I

    .line 39
    :cond_1
    iget-object v0, p0, Lcom/yandex/metrica/impl/ob/go;->a:Lcom/yandex/metrica/impl/ob/gs;

    .line 1056
    iget-object v3, p0, Lcom/yandex/metrica/impl/ob/go;->c:Lcom/yandex/metrica/impl/ob/ew;

    invoke-virtual {v3}, Lcom/yandex/metrica/impl/ob/ew;->a()J

    move-result-wide v5

    iget v3, v0, Lcom/yandex/metrica/impl/ob/gs;->h:I

    int-to-long v7, v3

    cmp-long v3, v5, v7

    if-lez v3, :cond_2

    move v1, v2

    :cond_2
    if-eqz v1, :cond_3

    .line 1060
    iget-object v1, p0, Lcom/yandex/metrica/impl/ob/go;->c:Lcom/yandex/metrica/impl/ob/ew;

    iget v0, v0, Lcom/yandex/metrica/impl/ob/gs;->h:I

    int-to-float v0, v0

    mul-float/2addr v0, v4

    float-to-int v0, v0

    invoke-virtual {v1, v0}, Lcom/yandex/metrica/impl/ob/ew;->c(I)I

    :cond_3
    return-void
.end method

.method public a(Lcom/yandex/metrica/impl/ob/gs;)V
    .locals 0
    .param p1    # Lcom/yandex/metrica/impl/ob/gs;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    .line 66
    iput-object p1, p0, Lcom/yandex/metrica/impl/ob/go;->a:Lcom/yandex/metrica/impl/ob/gs;

    return-void
.end method
