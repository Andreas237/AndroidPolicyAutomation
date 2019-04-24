.class final Lcom/microblink/DeepOcrRecognizer;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/OcrRecognizer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native performDeepOcr(IZLandroid/graphics/Bitmap;Ljava/lang/String;Ljava/util/ArrayList;Z)Lcom/microblink/OcrResult;
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/ArrayList;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;Z)",
            "Lcom/microblink/OcrResult;"
        }
    .end annotation
.end method


# virtual methods
.method public final perform(Lcom/microblink/RecognizerDataItem;)Lcom/microblink/OcrResult;
    .locals 6
    .param p1    # Lcom/microblink/RecognizerDataItem;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-virtual {p1}, Lcom/microblink/RecognizerDataItem;->retailerId()I

    move-result v0

    invoke-virtual {p1}, Lcom/microblink/RecognizerDataItem;->ocrCorrections()Z

    move-result v1

    invoke-virtual {p1}, Lcom/microblink/RecognizerDataItem;->bitmap()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {p1}, Lcom/microblink/RecognizerDataItem;->countryCode()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/microblink/RecognizerDataItem;->csv()Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {p1}, Lcom/microblink/RecognizerDataItem;->frameIndex()I

    move-result p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v5, 0x0

    :goto_0
    invoke-static/range {v0 .. v5}, Lcom/microblink/DeepOcrRecognizer;->performDeepOcr(IZLandroid/graphics/Bitmap;Ljava/lang/String;Ljava/util/ArrayList;Z)Lcom/microblink/OcrResult;

    move-result-object p1

    return-object p1
.end method
