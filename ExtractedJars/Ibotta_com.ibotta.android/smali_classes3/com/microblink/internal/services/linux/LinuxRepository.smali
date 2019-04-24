.class public final Lcom/microblink/internal/services/linux/LinuxRepository;
.super Ljava/lang/Object;


# instance fields
.field private final service:Lcom/microblink/internal/services/linux/LinuxService;


# direct methods
.method public constructor <init>(Lcom/microblink/internal/services/linux/LinuxService;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/linux/LinuxService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/linux/LinuxRepository;->service:Lcom/microblink/internal/services/linux/LinuxService;

    return-void
.end method


# virtual methods
.method public final recognize(Lcom/microblink/RecognizerDataItem;)Lcom/microblink/internal/services/linux/LinuxResponse;
    .locals 4
    .param p1    # Lcom/microblink/RecognizerDataItem;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxRepository;->service:Lcom/microblink/internal/services/linux/LinuxService;

    invoke-virtual {p1}, Lcom/microblink/RecognizerDataItem;->countryCode()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/RecognizerDataItem;->bitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {p1}, Lcom/microblink/RecognizerDataItem;->blinkReceiptId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/microblink/RecognizerDataItem;->frameIndex()I

    move-result p1

    invoke-interface {v0, v1, v2, v3, p1}, Lcom/microblink/internal/services/linux/LinuxService;->recognize(Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;I)Lcom/microblink/internal/services/linux/LinuxResponse;

    move-result-object p1

    return-object p1
.end method
