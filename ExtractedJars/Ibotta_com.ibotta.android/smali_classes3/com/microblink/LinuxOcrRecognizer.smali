.class final Lcom/microblink/LinuxOcrRecognizer;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OcrRecognizer;


# instance fields
.field private repository:Lcom/microblink/internal/services/linux/LinuxRepository;


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/microblink/internal/services/linux/LinuxRepository;

    new-instance v1, Lcom/microblink/internal/services/linux/LinuxServiceImpl;

    invoke-direct {v1, p1}, Lcom/microblink/internal/services/linux/LinuxServiceImpl;-><init>(Landroid/content/Context;)V

    invoke-direct {v0, v1}, Lcom/microblink/internal/services/linux/LinuxRepository;-><init>(Lcom/microblink/internal/services/linux/LinuxService;)V

    iput-object v0, p0, Lcom/microblink/LinuxOcrRecognizer;->repository:Lcom/microblink/internal/services/linux/LinuxRepository;

    return-void
.end method


# virtual methods
.method public final perform(Lcom/microblink/RecognizerDataItem;)Lcom/microblink/OcrResult;
    .locals 1
    .param p1    # Lcom/microblink/RecognizerDataItem;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/LinuxOcrRecognizer;->repository:Lcom/microblink/internal/services/linux/LinuxRepository;

    invoke-virtual {v0, p1}, Lcom/microblink/internal/services/linux/LinuxRepository;->recognize(Lcom/microblink/RecognizerDataItem;)Lcom/microblink/internal/services/linux/LinuxResponse;

    move-result-object p1

    new-instance v0, Lcom/microblink/internal/services/linux/LinuxResultsTransformer;

    invoke-direct {v0}, Lcom/microblink/internal/services/linux/LinuxResultsTransformer;-><init>()V

    invoke-virtual {v0, p1}, Lcom/microblink/internal/services/linux/LinuxResultsTransformer;->transform(Lcom/microblink/internal/services/linux/LinuxResponse;)Lcom/microblink/OcrResult;

    move-result-object p1

    return-object p1
.end method
