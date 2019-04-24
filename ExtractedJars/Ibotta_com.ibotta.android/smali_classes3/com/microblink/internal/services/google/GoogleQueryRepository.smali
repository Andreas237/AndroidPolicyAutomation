.class public Lcom/microblink/internal/services/google/GoogleQueryRepository;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/services/google/GoogleQueryRepository$Listener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "GoogleQueryRepository"


# instance fields
.field private final service:Lcom/microblink/internal/services/google/GoogleStoreService;


# direct methods
.method public constructor <init>(Lcom/microblink/internal/services/google/GoogleStoreService;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/google/GoogleStoreService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/google/GoogleQueryRepository;->service:Lcom/microblink/internal/services/google/GoogleStoreService;

    return-void
.end method


# virtual methods
.method public executeLookupStoreByAddress(Lcom/microblink/internal/merchant/AddressSearchRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;
    .locals 1
    .param p1    # Lcom/microblink/internal/merchant/AddressSearchRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleQueryRepository;->service:Lcom/microblink/internal/services/google/GoogleStoreService;

    invoke-interface {v0, p1}, Lcom/microblink/internal/services/google/GoogleStoreService;->executeLookupStoreByAddress(Lcom/microblink/internal/merchant/AddressSearchRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;

    move-result-object p1

    return-object p1
.end method

.method public executeQuery(Lcom/microblink/internal/services/google/GoogleQueryRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;
    .locals 1
    .param p1    # Lcom/microblink/internal/services/google/GoogleQueryRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleQueryRepository;->service:Lcom/microblink/internal/services/google/GoogleStoreService;

    invoke-interface {v0, p1}, Lcom/microblink/internal/services/google/GoogleStoreService;->executeQuery(Lcom/microblink/internal/services/google/GoogleQueryRequest;)Lcom/microblink/internal/services/google/GoogleLookupResponse;

    move-result-object p1

    return-object p1
.end method

.method public lookupStoreByAddress(Lcom/microblink/internal/merchant/AddressSearchRequest;Lcom/microblink/internal/services/google/GoogleQueryRepository$Listener;)V
    .locals 2
    .param p1    # Lcom/microblink/internal/merchant/AddressSearchRequest;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/microblink/internal/services/google/GoogleQueryRepository$Listener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/google/GoogleQueryRepository;->service:Lcom/microblink/internal/services/google/GoogleStoreService;

    new-instance v1, Lcom/microblink/internal/services/google/GoogleQueryRepository$1;

    invoke-direct {v1, p0, p2}, Lcom/microblink/internal/services/google/GoogleQueryRepository$1;-><init>(Lcom/microblink/internal/services/google/GoogleQueryRepository;Lcom/microblink/internal/services/google/GoogleQueryRepository$Listener;)V

    invoke-interface {v0, p1, v1}, Lcom/microblink/internal/services/google/GoogleStoreService;->enqueueStoreByAddress(Lcom/microblink/internal/merchant/AddressSearchRequest;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method
