.class public final Lcom/microblink/internal/services/io/AssetManagerRepository;
.super Ljava/lang/Object;


# instance fields
.field private service:Lcom/microblink/internal/services/io/AssetManagerService;
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

    new-instance v0, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/microblink/internal/services/io/AssetManagerServiceImpl;-><init>(Landroid/content/Context;)V

    invoke-direct {p0, v0}, Lcom/microblink/internal/services/io/AssetManagerRepository;-><init>(Lcom/microblink/internal/services/io/AssetManagerService;)V

    return-void
.end method

.method private constructor <init>(Lcom/microblink/internal/services/io/AssetManagerService;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/io/AssetManagerService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/io/AssetManagerRepository;->service:Lcom/microblink/internal/services/io/AssetManagerService;

    return-void
.end method


# virtual methods
.method public final enqueueReadFileFromAssets(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/io/AssetManagerRepository;->service:Lcom/microblink/internal/services/io/AssetManagerService;

    new-instance v1, Lcom/microblink/internal/services/io/AssetManagerRepository$1;

    invoke-direct {v1, p0, p2}, Lcom/microblink/internal/services/io/AssetManagerRepository$1;-><init>(Lcom/microblink/internal/services/io/AssetManagerRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, p1, v1}, Lcom/microblink/internal/services/io/AssetManagerService;->enqueueReadFileFromAssets(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method public final enqueueReadFileFromInput(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/io/AssetManagerRepository;->service:Lcom/microblink/internal/services/io/AssetManagerService;

    new-instance v1, Lcom/microblink/internal/services/io/AssetManagerRepository$3;

    invoke-direct {v1, p0, p2}, Lcom/microblink/internal/services/io/AssetManagerRepository$3;-><init>(Lcom/microblink/internal/services/io/AssetManagerRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, p1, v1}, Lcom/microblink/internal/services/io/AssetManagerService;->enqueueReadFileFromInput(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method public final enqueueWriteFileToOutput(Ljava/lang/String;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/io/AssetManagerRepository;->service:Lcom/microblink/internal/services/io/AssetManagerService;

    new-instance v1, Lcom/microblink/internal/services/io/AssetManagerRepository$2;

    invoke-direct {v1, p0, p3}, Lcom/microblink/internal/services/io/AssetManagerRepository$2;-><init>(Lcom/microblink/internal/services/io/AssetManagerRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/microblink/internal/services/io/AssetManagerService;->enqueueWriteFileToOutput(Ljava/lang/String;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method public final executeReadFileFromAssets(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/io/AssetManagerRepository;->service:Lcom/microblink/internal/services/io/AssetManagerService;

    invoke-interface {v0, p1}, Lcom/microblink/internal/services/io/AssetManagerService;->executeReadFileFromAssets(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
