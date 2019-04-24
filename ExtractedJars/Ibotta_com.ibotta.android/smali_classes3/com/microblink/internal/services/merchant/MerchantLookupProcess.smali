.class public Lcom/microblink/internal/services/merchant/MerchantLookupProcess;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "MerchantLookupProcess"


# instance fields
.field private detections:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;",
            ">;"
        }
    .end annotation
.end field

.field private validator:Lcom/microblink/internal/merchant/MerchantResultValidator;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/merchant/MerchantResultValidatorImpl;

    invoke-direct {v0}, Lcom/microblink/internal/merchant/MerchantResultValidatorImpl;-><init>()V

    invoke-direct {p0, v0}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;-><init>(Lcom/microblink/internal/merchant/MerchantResultValidator;)V

    return-void
.end method

.method public constructor <init>(Lcom/microblink/internal/merchant/MerchantResultValidator;)V
    .locals 1
    .param p1    # Lcom/microblink/internal/merchant/MerchantResultValidator;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->detections:Ljava/util/List;

    iput-object p1, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->validator:Lcom/microblink/internal/merchant/MerchantResultValidator;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/internal/services/merchant/MerchantLookupProcess;)Lcom/microblink/internal/merchant/MerchantResultValidator;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->validator:Lcom/microblink/internal/merchant/MerchantResultValidator;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/internal/services/merchant/MerchantLookupProcess;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->detections:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/internal/services/merchant/MerchantLookupProcess;ILcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->execute(ILcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;Ljava/util/Map;)V

    return-void
.end method

.method private execute(ILcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;Ljava/util/Map;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/microblink/internal/services/lookup/StoreLookupRequest;",
            "Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/microblink/internal/merchant/MerchantResult;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->detections:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;

    new-instance v7, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move-object v4, p4

    move-object v5, p3

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess$1;-><init>(Lcom/microblink/internal/services/merchant/MerchantLookupProcess;ILjava/util/Map;Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;Lcom/microblink/internal/services/lookup/StoreLookupRequest;)V

    invoke-interface {v0, p2, v7}, Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;->enqueue(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->detections:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;

    invoke-interface {v1}, Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;->cancel()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "MerchantLookupProcess"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public chain(Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;)Lcom/microblink/internal/services/merchant/MerchantLookupProcess;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->detections:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 5
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    new-instance v0, Lcom/microblink/internal/merchant/MerchantDetection;

    invoke-direct {v0}, Lcom/microblink/internal/merchant/MerchantDetection;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->detections:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;

    invoke-interface {v3, p1}, Lcom/microblink/internal/services/merchant/MerchantDetectionProcess;->execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v3, v3, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/microblink/internal/merchant/MerchantResult;->merchantSource()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v4, p0, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->validator:Lcom/microblink/internal/merchant/MerchantResultValidator;

    invoke-interface {v4, v3}, Lcom/microblink/internal/merchant/MerchantResultValidator;->valid(Lcom/microblink/internal/merchant/MerchantResult;)Z

    move-result v4

    if-eqz v4, :cond_0

    iput-object v3, v0, Lcom/microblink/internal/merchant/MerchantDetection;->merchantResult:Lcom/microblink/internal/merchant/MerchantResult;

    iput-object v1, v0, Lcom/microblink/internal/merchant/MerchantDetection;->phoneLookupMap:Ljava/util/Map;

    :cond_2
    return-object v0
.end method

.method public execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;)V
    .locals 2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    invoke-direct {p0, v1, p1, p2, v0}, Lcom/microblink/internal/services/merchant/MerchantLookupProcess;->execute(ILcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/services/merchant/MerchantLookupProcess$Listener;Ljava/util/Map;)V

    return-void
.end method
