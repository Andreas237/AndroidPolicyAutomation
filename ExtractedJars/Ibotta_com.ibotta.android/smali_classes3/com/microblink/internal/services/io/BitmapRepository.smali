.class public final Lcom/microblink/internal/services/io/BitmapRepository;
.super Ljava/lang/Object;


# instance fields
.field private service:Lcom/microblink/internal/services/io/BitmapService;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/io/BitmapServiceImpl;

    invoke-direct {v0}, Lcom/microblink/internal/services/io/BitmapServiceImpl;-><init>()V

    invoke-direct {p0, v0}, Lcom/microblink/internal/services/io/BitmapRepository;-><init>(Lcom/microblink/internal/services/io/BitmapService;)V

    return-void
.end method

.method public constructor <init>(Lcom/microblink/internal/services/io/BitmapService;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/io/BitmapService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/io/BitmapRepository;->service:Lcom/microblink/internal/services/io/BitmapService;

    return-void
.end method


# virtual methods
.method public final enqueue(Ljava/util/List;Lcom/microblink/OnNullableCompleteListener;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnNullableCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/microblink/OnNullableCompleteListener<",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/io/BitmapRepository;->service:Lcom/microblink/internal/services/io/BitmapService;

    new-instance v1, Lcom/microblink/internal/services/io/BitmapRepository$1;

    invoke-direct {v1, p0, p2}, Lcom/microblink/internal/services/io/BitmapRepository$1;-><init>(Lcom/microblink/internal/services/io/BitmapRepository;Lcom/microblink/OnNullableCompleteListener;)V

    invoke-interface {v0, p1, v1}, Lcom/microblink/internal/services/io/BitmapService;->enqueue(Ljava/util/Collection;Lcom/microblink/OnNullableCompleteListener;)V

    return-void
.end method

.method public final execute(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/microblink/internal/services/io/BitmapRepository;->service:Lcom/microblink/internal/services/io/BitmapService;

    invoke-interface {p1, v0}, Lcom/microblink/internal/services/io/BitmapService;->execute(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final execute(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/io/BitmapRepository;->service:Lcom/microblink/internal/services/io/BitmapService;

    invoke-interface {v0, p1}, Lcom/microblink/internal/services/io/BitmapService;->execute(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
