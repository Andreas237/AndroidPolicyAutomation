.class public Lcom/microblink/internal/services/lookup/StoreLookupRepository;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/Cancelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/microblink/Cancelable;"
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "StoreLookupRepository"


# instance fields
.field private final mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/internal/merchant/MerchantDetectionMapper<",
            "TT;>;"
        }
    .end annotation
.end field

.field private final service:Lcom/microblink/internal/services/lookup/StoreLookUpService;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/microblink/internal/services/lookup/StoreLookUpService<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/microblink/internal/services/lookup/StoreLookUpService;Lcom/microblink/internal/merchant/MerchantDetectionMapper;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookUpService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/merchant/MerchantDetectionMapper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/internal/services/lookup/StoreLookUpService<",
            "TT;>;",
            "Lcom/microblink/internal/merchant/MerchantDetectionMapper<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository;->service:Lcom/microblink/internal/services/lookup/StoreLookUpService;

    iput-object p2, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository;->mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/internal/services/lookup/StoreLookupRepository;)Lcom/microblink/internal/merchant/MerchantDetectionMapper;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository;->mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;

    return-object p0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository;->service:Lcom/microblink/internal/services/lookup/StoreLookUpService;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/microblink/internal/services/lookup/StoreLookUpService;->cancel()V

    :cond_0
    return-void
.end method

.method public enqueue(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;)V
    .locals 2
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository;->service:Lcom/microblink/internal/services/lookup/StoreLookUpService;

    new-instance v1, Lcom/microblink/internal/services/lookup/StoreLookupRepository$1;

    invoke-direct {v1, p0, p2, p1}, Lcom/microblink/internal/services/lookup/StoreLookupRepository$1;-><init>(Lcom/microblink/internal/services/lookup/StoreLookupRepository;Lcom/microblink/internal/services/lookup/StoreLookupRepository$Listener;Lcom/microblink/internal/services/lookup/StoreLookupRequest;)V

    invoke-interface {v0, p1, v1}, Lcom/microblink/internal/services/lookup/StoreLookUpService;->enqueue(Lcom/microblink/internal/services/lookup/StoreLookupRequest;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method public execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 2
    .param p1    # Lcom/microblink/internal/services/lookup/StoreLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository;->mapper:Lcom/microblink/internal/merchant/MerchantDetectionMapper;

    iget-object v1, p0, Lcom/microblink/internal/services/lookup/StoreLookupRepository;->service:Lcom/microblink/internal/services/lookup/StoreLookUpService;

    invoke-interface {v1, p1}, Lcom/microblink/internal/services/lookup/StoreLookUpService;->execute(Lcom/microblink/internal/services/lookup/StoreLookupRequest;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/microblink/internal/merchant/MerchantDetectionMapper;->transform(Ljava/lang/Object;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    return-object p1
.end method
