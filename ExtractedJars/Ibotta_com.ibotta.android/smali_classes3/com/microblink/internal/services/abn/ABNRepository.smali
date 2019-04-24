.class public final Lcom/microblink/internal/services/abn/ABNRepository;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/services/abn/ABNRepository$Listener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ABNRepository"


# instance fields
.field private final mapper:Lcom/microblink/internal/merchant/ABNResultMapper;

.field private final service:Lcom/microblink/internal/services/abn/ABNLookupService;


# direct methods
.method public constructor <init>(Lcom/microblink/internal/services/abn/ABNLookupService;Lcom/microblink/internal/merchant/ABNResultMapper;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/abn/ABNLookupService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/merchant/ABNResultMapper;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/abn/ABNRepository;->service:Lcom/microblink/internal/services/abn/ABNLookupService;

    iput-object p2, p0, Lcom/microblink/internal/services/abn/ABNRepository;->mapper:Lcom/microblink/internal/merchant/ABNResultMapper;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/internal/services/abn/ABNRepository;)Lcom/microblink/internal/merchant/ABNResultMapper;
    .locals 0

    iget-object p0, p0, Lcom/microblink/internal/services/abn/ABNRepository;->mapper:Lcom/microblink/internal/merchant/ABNResultMapper;

    return-object p0
.end method


# virtual methods
.method public final executeLookupService(Lcom/microblink/internal/services/abn/ABNLookupRequest;)Lcom/microblink/internal/merchant/MerchantDetection;
    .locals 3
    .param p1    # Lcom/microblink/internal/services/abn/ABNLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/abn/ABNRepository;->mapper:Lcom/microblink/internal/merchant/ABNResultMapper;

    iget-object v1, p0, Lcom/microblink/internal/services/abn/ABNRepository;->service:Lcom/microblink/internal/services/abn/ABNLookupService;

    invoke-virtual {p1}, Lcom/microblink/internal/services/abn/ABNLookupRequest;->apiKey()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/microblink/internal/services/abn/ABNLookupRequest;->taxId()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, v2, p1}, Lcom/microblink/internal/services/abn/ABNLookupService;->execute(Ljava/lang/String;Ljava/lang/String;)Lcom/microblink/internal/services/abn/ABNResponse;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/microblink/internal/merchant/ABNResultMapper;->transform(Lcom/microblink/internal/services/abn/ABNResponse;)Lcom/microblink/internal/merchant/MerchantDetection;

    move-result-object p1

    return-object p1
.end method

.method public final lookupService(Lcom/microblink/internal/services/abn/ABNLookupRequest;Lcom/microblink/internal/services/abn/ABNRepository$Listener;)V
    .locals 3
    .param p1    # Lcom/microblink/internal/services/abn/ABNLookupRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/services/abn/ABNRepository$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/abn/ABNRepository;->service:Lcom/microblink/internal/services/abn/ABNLookupService;

    invoke-virtual {p1}, Lcom/microblink/internal/services/abn/ABNLookupRequest;->apiKey()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/microblink/internal/services/abn/ABNLookupRequest;->taxId()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Lcom/microblink/internal/services/abn/ABNRepository$1;

    invoke-direct {v2, p0, p2}, Lcom/microblink/internal/services/abn/ABNRepository$1;-><init>(Lcom/microblink/internal/services/abn/ABNRepository;Lcom/microblink/internal/services/abn/ABNRepository$Listener;)V

    invoke-interface {v0, v1, p1, v2}, Lcom/microblink/internal/services/abn/ABNLookupService;->enqueue(Ljava/lang/String;Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ABNRepository{service="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/abn/ABNRepository;->service:Lcom/microblink/internal/services/abn/ABNLookupService;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mapper="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/abn/ABNRepository;->mapper:Lcom/microblink/internal/merchant/ABNResultMapper;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
