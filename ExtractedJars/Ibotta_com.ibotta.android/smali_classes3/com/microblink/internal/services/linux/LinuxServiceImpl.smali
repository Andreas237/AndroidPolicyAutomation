.class public final Lcom/microblink/internal/services/linux/LinuxServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/linux/LinuxService;


# static fields
.field private static final DIRECTORY_NAME:Ljava/lang/String; = "microblink/linux/tmp"

.field private static final EMPTY:Lcom/microblink/internal/services/linux/LinuxResponse;

.field private static final FILE_NAME:Ljava/lang/String; = "linux_ocr_frame_%d.jpeg"

.field private static final TAG:Ljava/lang/String; = "LinuxSdkRepository"


# instance fields
.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/linux/LinuxResponse;

    invoke-direct {v0}, Lcom/microblink/internal/services/linux/LinuxResponse;-><init>()V

    sput-object v0, Lcom/microblink/internal/services/linux/LinuxServiceImpl;->EMPTY:Lcom/microblink/internal/services/linux/LinuxResponse;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/microblink/internal/services/linux/LinuxServiceImpl;->context:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final recognize(Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/lang/String;I)Lcom/microblink/internal/services/linux/LinuxResponse;
    .locals 16
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/Bitmap;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p3

    const/4 v2, 0x0

    :try_start_0
    invoke-static/range {p1 .. p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string v3, "US"

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "linux_ocr_frame_%d.jpeg"

    const/4 v6, 0x1

    new-array v7, v6, [Ljava/lang/Object;

    invoke-static/range {p4 .. p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v7, v2

    invoke-static {v4, v5, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, v1, Lcom/microblink/internal/services/linux/LinuxServiceImpl;->context:Landroid/content/Context;

    const-string v7, "microblink/linux/tmp"

    invoke-static {}, Lcom/microblink/FrameCharacteristics;->newBuilder()Lcom/microblink/FrameCharacteristics$Builder;

    move-result-object v8

    const/16 v9, 0x5f

    invoke-virtual {v8, v9}, Lcom/microblink/FrameCharacteristics$Builder;->compressionQuality(I)Lcom/microblink/FrameCharacteristics$Builder;

    move-result-object v8

    invoke-virtual {v8}, Lcom/microblink/FrameCharacteristics$Builder;->build()Lcom/microblink/FrameCharacteristics;

    move-result-object v8

    move-object/from16 v9, p2

    invoke-static {v5, v9, v7, v4, v8}, Lcom/microblink/internal/DiskUtils;->writeToDisk(Landroid/content/Context;Landroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Lcom/microblink/FrameCharacteristics;)Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    const-wide/16 v9, 0x3e8

    div-long/2addr v7, v9

    invoke-static {}, Lcom/microblink/internal/Utility;->linuxToken()Ljava/lang/String;

    move-result-object v5

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "&"

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    long-to-float v7, v7

    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    move-result v7

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, Lcom/microblink/internal/AESCrypt;->encrypt(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-class v7, Lcom/microblink/internal/services/linux/LinuxApiService;

    invoke-static {v7}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/microblink/internal/services/linux/LinuxApiService;

    const-string v9, "https://scan.blinkreceipt.com/parse_receipt.php"

    const-string v7, "image"

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lcom/microblink/internal/ServiceUtils;->MULTI_MEDIA_TYPE:Lokhttp3/MediaType;

    invoke-static {v11, v4}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/io/File;)Lokhttp3/RequestBody;

    move-result-object v4

    invoke-static {v7, v10, v4}, Lokhttp3/MultipartBody$Part;->createFormData(Ljava/lang/String;Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/MultipartBody$Part;

    move-result-object v10

    sget-object v4, Lcom/microblink/internal/ServiceUtils;->MULTI_MEDIA_TYPE:Lokhttp3/MediaType;

    invoke-static {v4, v0}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v11

    sget-object v0, Lcom/microblink/internal/ServiceUtils;->MULTI_MEDIA_TYPE:Lokhttp3/MediaType;

    add-int/lit8 v4, p4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v12

    sget-object v0, Lcom/microblink/internal/ServiceUtils;->MULTI_MEDIA_TYPE:Lokhttp3/MediaType;

    invoke-static {}, Lcom/microblink/ReceiptSdk;->versionName()Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v4}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v13

    sget-object v0, Lcom/microblink/internal/ServiceUtils;->MULTI_MEDIA_TYPE:Lokhttp3/MediaType;

    invoke-static {v0, v5}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v14

    sget-object v0, Lcom/microblink/internal/ServiceUtils;->MULTI_MEDIA_TYPE:Lokhttp3/MediaType;

    invoke-static {v0, v3}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/RequestBody;

    move-result-object v15

    invoke-interface/range {v8 .. v15}, Lcom/microblink/internal/services/linux/LinuxApiService;->recognize(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;Lokhttp3/RequestBody;)Lretrofit2/Call;

    move-result-object v0

    invoke-interface {v0}, Lretrofit2/Call;->execute()Lretrofit2/Response;

    move-result-object v0

    invoke-virtual {v0}, Lretrofit2/Response;->isSuccessful()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Lretrofit2/Response;->body()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/linux/LinuxResponse;

    if-eqz v0, :cond_2

    iget-object v3, v1, Lcom/microblink/internal/services/linux/LinuxServiceImpl;->context:Landroid/content/Context;

    const-string v4, "microblink/linux/tmp"

    invoke-static {v3, v4, v2}, Lcom/microblink/internal/DiskUtils;->deleteFile(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {v0}, Lcom/microblink/internal/services/linux/LinuxResponse;->error()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "LinuxSdkRepository"

    invoke-virtual {v0}, Lcom/microblink/internal/services/linux/LinuxResponse;->error()Ljava/lang/String;

    move-result-object v0

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v3, v0, v4}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/microblink/internal/services/linux/LinuxServiceImpl;->EMPTY:Lcom/microblink/internal/services/linux/LinuxResponse;

    :cond_1
    return-object v0

    :cond_2
    iget-object v0, v1, Lcom/microblink/internal/services/linux/LinuxServiceImpl;->context:Landroid/content/Context;

    const-string v3, "microblink/linux/tmp"

    invoke-static {v0, v3, v2}, Lcom/microblink/internal/DiskUtils;->deleteFile(Landroid/content/Context;Ljava/lang/String;Z)V

    sget-object v0, Lcom/microblink/internal/services/linux/LinuxServiceImpl;->EMPTY:Lcom/microblink/internal/services/linux/LinuxResponse;

    return-object v0

    :cond_3
    const-string v3, "LinuxSdkRepository"

    invoke-virtual {v0}, Lretrofit2/Response;->errorBody()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-static {v0}, Lcom/microblink/internal/ServiceUtils;->errorMessage(Lokhttp3/ResponseBody;)Ljava/lang/String;

    move-result-object v0

    new-array v4, v2, [Ljava/lang/Object;

    invoke-static {v3, v0, v4}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, v1, Lcom/microblink/internal/services/linux/LinuxServiceImpl;->context:Landroid/content/Context;

    const-string v3, "microblink/linux/tmp"

    invoke-static {v0, v3, v2}, Lcom/microblink/internal/DiskUtils;->deleteFile(Landroid/content/Context;Ljava/lang/String;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    sget-object v0, Lcom/microblink/internal/services/linux/LinuxServiceImpl;->EMPTY:Lcom/microblink/internal/services/linux/LinuxResponse;

    return-object v0

    :catch_0
    move-exception v0

    const-string v3, "LinuxSdkRepository"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v5, v2, [Ljava/lang/Object;

    invoke-static {v3, v4, v5}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, v1, Lcom/microblink/internal/services/linux/LinuxServiceImpl;->context:Landroid/content/Context;

    const-string v4, "microblink/linux/tmp"

    invoke-static {v3, v4, v2}, Lcom/microblink/internal/DiskUtils;->deleteFile(Landroid/content/Context;Ljava/lang/String;Z)V

    new-instance v2, Lcom/microblink/internal/services/linux/LinuxResponse;

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/microblink/internal/services/linux/LinuxResponse;-><init>(Ljava/lang/String;)V

    return-object v2
.end method
