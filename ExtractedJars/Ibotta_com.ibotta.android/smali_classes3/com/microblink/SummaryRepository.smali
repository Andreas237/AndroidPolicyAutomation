.class final Lcom/microblink/SummaryRepository;
.super Ljava/lang/Object;


# instance fields
.field private service:Lcom/microblink/SummaryService;


# direct methods
.method constructor <init>()V
    .locals 1

    new-instance v0, Lcom/microblink/SummaryServiceImpl;

    invoke-direct {v0}, Lcom/microblink/SummaryServiceImpl;-><init>()V

    invoke-direct {p0, v0}, Lcom/microblink/SummaryRepository;-><init>(Lcom/microblink/SummaryService;)V

    return-void
.end method

.method private constructor <init>(Lcom/microblink/SummaryService;)V
    .locals 0
    .param p1    # Lcom/microblink/SummaryService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/SummaryRepository;->service:Lcom/microblink/SummaryService;

    return-void
.end method


# virtual methods
.method final summary(Lcom/microblink/SummaryStats;Lcom/microblink/Receipt;Lcom/microblink/internal/merchant/MerchantResult;Lcom/microblink/OnCompleteListener;)Lcom/microblink/SummaryRepository;
    .locals 2
    .param p1    # Lcom/microblink/SummaryStats;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/Receipt;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Lcom/microblink/internal/merchant/MerchantResult;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/SummaryStats;",
            "Lcom/microblink/Receipt;",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/receipt/SummaryResponse;",
            ">;)",
            "Lcom/microblink/SummaryRepository;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/SummaryRepository;->service:Lcom/microblink/SummaryService;

    new-instance v1, Lcom/microblink/SummaryRepository$1;

    invoke-direct {v1, p0, p4}, Lcom/microblink/SummaryRepository$1;-><init>(Lcom/microblink/SummaryRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, p1, p2, p3, v1}, Lcom/microblink/SummaryService;->summary(Lcom/microblink/SummaryStats;Lcom/microblink/Receipt;Lcom/microblink/internal/merchant/MerchantResult;Lcom/microblink/OnCompleteListener;)V

    return-object p0
.end method

.method final upload(Ljava/util/List;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)Lcom/microblink/SummaryRepository;
    .locals 2
    .param p1    # Ljava/util/List;
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
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/receipt/SummaryMediaResponse;",
            ">;)",
            "Lcom/microblink/SummaryRepository;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/SummaryRepository;->service:Lcom/microblink/SummaryService;

    new-instance v1, Lcom/microblink/SummaryRepository$2;

    invoke-direct {v1, p0, p3}, Lcom/microblink/SummaryRepository$2;-><init>(Lcom/microblink/SummaryRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, p1, p2, v1}, Lcom/microblink/SummaryService;->uploadImages(Ljava/util/List;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V

    return-object p0
.end method
