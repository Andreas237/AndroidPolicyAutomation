.class public final Lcom/microblink/SummaryServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/SummaryService;


# static fields
.field private static final EMPTY_SUMMARY:Lcom/microblink/internal/services/receipt/SummaryResponse;

.field private static final EMPTY_SUMMARY_IMAGE:Lcom/microblink/internal/services/receipt/SummaryMediaResponse;

.field private static final TAG:Ljava/lang/String; = "SummaryServiceImpl"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/receipt/SummaryResponse;

    invoke-direct {v0}, Lcom/microblink/internal/services/receipt/SummaryResponse;-><init>()V

    sput-object v0, Lcom/microblink/SummaryServiceImpl;->EMPTY_SUMMARY:Lcom/microblink/internal/services/receipt/SummaryResponse;

    new-instance v0, Lcom/microblink/internal/services/receipt/SummaryMediaResponse;

    invoke-direct {v0}, Lcom/microblink/internal/services/receipt/SummaryMediaResponse;-><init>()V

    sput-object v0, Lcom/microblink/SummaryServiceImpl;->EMPTY_SUMMARY_IMAGE:Lcom/microblink/internal/services/receipt/SummaryMediaResponse;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Lcom/microblink/internal/services/receipt/SummaryResponse;
    .locals 1

    sget-object v0, Lcom/microblink/SummaryServiceImpl;->EMPTY_SUMMARY:Lcom/microblink/internal/services/receipt/SummaryResponse;

    return-object v0
.end method

.method private filter(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
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
            ")",
            "Ljava/util/List<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/io/File;

    :try_start_0
    invoke-static {v1, p2}, Lcom/microblink/internal/DiskUtils;->containsId(Ljava/io/File;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "SummaryServiceImpl"

    invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v2, v1, v3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final summary(Lcom/microblink/SummaryStats;Lcom/microblink/Receipt;Lcom/microblink/internal/merchant/MerchantResult;Lcom/microblink/OnCompleteListener;)V
    .locals 0
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
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p1, p2, p3}, Lcom/microblink/SummaryUtils;->parameters(Lcom/microblink/SummaryStats;Lcom/microblink/Receipt;Lcom/microblink/internal/merchant/MerchantResult;)Ljava/util/Map;

    move-result-object p1

    const-class p2, Lcom/microblink/internal/services/receipt/ReceiptApiService;

    invoke-static {p2}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/microblink/internal/services/receipt/ReceiptApiService;

    invoke-interface {p2, p1}, Lcom/microblink/internal/services/receipt/ReceiptApiService;->summary(Ljava/util/Map;)Lretrofit2/Call;

    move-result-object p1

    new-instance p2, Lcom/microblink/SummaryServiceImpl$1;

    invoke-direct {p2, p0, p4}, Lcom/microblink/SummaryServiceImpl$1;-><init>(Lcom/microblink/SummaryServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {p1, p2}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "SummaryServiceImpl"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p3, 0x0

    new-array p3, p3, [Ljava/lang/Object;

    invoke-static {p2, p1, p3}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p1, Lcom/microblink/SummaryServiceImpl;->EMPTY_SUMMARY:Lcom/microblink/internal/services/receipt/SummaryResponse;

    invoke-interface {p4, p1}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method

.method public final uploadImages(Ljava/util/List;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V
    .locals 17
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
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    invoke-direct/range {p0 .. p2}, Lcom/microblink/SummaryServiceImpl;->filter(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/util/Collection;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_0
    if-ge v6, v4, :cond_3

    :try_start_0
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/File;

    if-eqz v0, :cond_2

    const-string v9, "receipt_images[image]"

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lcom/microblink/internal/ServiceUtils;->MULTI_MEDIA_TYPE:Lokhttp3/MediaType;

    invoke-static {v11, v0}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/io/File;)Lokhttp3/RequestBody;

    move-result-object v0

    invoke-static {v9, v10, v0}, Lokhttp3/MultipartBody$Part;->createFormData(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;

    move-result-object v13

    const-class v0, Lcom/microblink/internal/services/receipt/ReceiptApiService;

    invoke-static {v0}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/microblink/internal/services/receipt/ReceiptApiService;

    const-string v12, "https://licensing.blinkreceipt.com/api/receipt_images"

    sget-object v0, Lcom/microblink/internal/ServiceUtils;->MULTI_MEDIA_TYPE:Lokhttp3/MediaType;

    add-int/lit8 v9, v6, 0x1

    invoke-static {v9}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v14

    sget-object v0, Lcom/microblink/internal/ServiceUtils;->MULTI_MEDIA_TYPE:Lokhttp3/MediaType;

    const/4 v9, 0x0

    invoke-static {v9}, Ljava/lang/Float;->toString(F)Ljava/lang/String;

    move-result-object v9

    invoke-static {v0, v9}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v15

    sget-object v0, Lcom/microblink/internal/ServiceUtils;->MULTI_MEDIA_TYPE:Lokhttp3/MediaType;

    invoke-static {v0, v1}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v16

    invoke-interface/range {v11 .. v16}, Lcom/microblink/internal/services/receipt/ReceiptApiService;->uploadImages(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->isSuccessful()Z

    move-result v9

    if-eqz v9, :cond_1

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/receipt/SummaryMediaResponse;

    add-int/lit8 v7, v7, 0x1

    add-int v9, v7, v8

    if-lt v9, v4, :cond_2

    const-string v9, "SummaryServiceImpl"

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "upload images success count: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, " failed count: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v11, " receipt id: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-array v11, v5, [Ljava/lang/Object;

    invoke-static {v9, v10, v11}, Lcom/microblink/internal/Logger;->d(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    if-nez v0, :cond_0

    sget-object v0, Lcom/microblink/SummaryServiceImpl;->EMPTY_SUMMARY_IMAGE:Lcom/microblink/internal/services/receipt/SummaryMediaResponse;

    :cond_0
    :goto_1
    invoke-interface {v2, v0}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    const-string v9, "SummaryServiceImpl"

    invoke-virtual {v0}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object v0

    new-array v10, v5, [Ljava/lang/Object;

    invoke-static {v9, v0, v10}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    add-int/lit8 v8, v8, 0x1

    add-int v0, v7, v8

    if-lt v0, v4, :cond_2

    const-string v0, "SummaryServiceImpl"

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "upload images failed count: "

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, " success count: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, " receipt id: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    new-array v10, v5, [Ljava/lang/Object;

    invoke-static {v0, v9, v10}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/microblink/SummaryServiceImpl;->EMPTY_SUMMARY_IMAGE:Lcom/microblink/internal/services/receipt/SummaryMediaResponse;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v9, "SummaryServiceImpl"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v10, v5, [Ljava/lang/Object;

    invoke-static {v9, v0, v10}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/microblink/SummaryServiceImpl;->EMPTY_SUMMARY_IMAGE:Lcom/microblink/internal/services/receipt/SummaryMediaResponse;

    invoke-interface {v2, v0}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    :cond_2
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    :cond_3
    return-void
.end method
