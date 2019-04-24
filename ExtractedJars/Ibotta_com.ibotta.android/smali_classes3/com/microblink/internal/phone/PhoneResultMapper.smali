.class public Lcom/microblink/internal/phone/PhoneResultMapper;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/merchant/MerchantDetectionMapper;


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/microblink/internal/merchant/MerchantDetectionMapper<",
        "Lcom/microblink/internal/services/store/StoreLookUpResponse;",
        ">;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "PhoneResultMapper"


# instance fields
.field private gson:Lcom/google/gson/Gson;

.field private final rawResults:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    invoke-static {}, Lcom/microblink/NativeLibraryLoader;->loadNativeLibrary()Z

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1
    .param p1    # Ljava/util/ArrayList;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    iput-object v0, p0, Lcom/microblink/internal/phone/PhoneResultMapper;->gson:Lcom/google/gson/Gson;

    iput-object p1, p0, Lcom/microblink/internal/phone/PhoneResultMapper;->rawResults:Ljava/util/ArrayList;

    return-void
.end method

.method private static native processDbPhoneResults(Ljava/lang/String;Ljava/util/ArrayList;)Lcom/microblink/internal/merchant/MerchantDetection;
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/ArrayList;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/microblink/internal/merchant/MerchantDetection;"
        }
    .end annotation
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PhoneResultMapper{rawResults="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/phone/PhoneResultMapper;->rawResults:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", gson="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/phone/PhoneResultMapper;->gson:Lcom/google/gson/Gson;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public transform(Lcom/microblink/internal/services/store/StoreLookUpResponse;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 3
    .param p1    # Lcom/microblink/internal/services/store/StoreLookUpResponse;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/microblink/internal/phone/PhoneResultMapper;->gson:Lcom/google/gson/Gson;

    instance-of v2, v1, Lcom/google/gson/Gson;

    if-nez v2, :cond_0

    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    check-cast v1, Lcom/google/gson/Gson;

    invoke-static {v1, p1}, Lcom/newrelic/agent/android/instrumentation/GsonInstrumentation;->toJson(Lcom/google/gson/Gson;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-static {p1}, Lcom/microblink/internal/Utility;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/microblink/internal/phone/PhoneResultMapper;->rawResults:Ljava/util/ArrayList;

    invoke-static {p1, v1}, Lcom/microblink/internal/phone/PhoneResultMapper;->processDbPhoneResults(Ljava/lang/String;Ljava/util/ArrayList;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v1, p1, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    goto :goto_1

    :cond_1
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_2

    const-string v2, "BLINK"

    invoke-virtual {v1, v2}, Lcom/microblink/internal/merchant/MerchantResult;->setSource(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "PhoneResultMapper"

    invoke-virtual {p1}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, p1, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-object v0
.end method

.method public bridge synthetic transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    check-cast p1, Lcom/microblink/internal/services/store/StoreLookUpResponse;

    invoke-virtual {p0, p1}, Lcom/microblink/internal/phone/PhoneResultMapper;->transform(Lcom/microblink/internal/services/store/StoreLookUpResponse;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    return-object p1
.end method
