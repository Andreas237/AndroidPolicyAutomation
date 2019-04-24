.class public Lcom/microblink/internal/services/ip/LocationLookupRepository;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/services/ip/LocationLookupRepository$Listener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "LocationLookupRepository"


# instance fields
.field private final service:Lcom/microblink/internal/services/ip/LocationLookupService;


# direct methods
.method public constructor <init>(Lcom/microblink/internal/services/ip/LocationLookupService;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/ip/LocationLookupService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/ip/LocationLookupRepository;->service:Lcom/microblink/internal/services/ip/LocationLookupService;

    return-void
.end method


# virtual methods
.method public executeLocationLookup(Ljava/lang/String;)Lcom/microblink/internal/services/ip/LocationResult;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/microblink/internal/services/ip/LocationLookupRepository;->service:Lcom/microblink/internal/services/ip/LocationLookupService;

    invoke-interface {v0, p1}, Lcom/microblink/internal/services/ip/LocationLookupService;->execute(Ljava/lang/String;)Lcom/microblink/internal/services/ip/LocationResult;

    move-result-object p1

    return-object p1
.end method

.method public fetchLocation(Ljava/lang/String;Lcom/microblink/internal/services/ip/LocationLookupRepository$Listener;)V
    .locals 2

    iget-object v0, p0, Lcom/microblink/internal/services/ip/LocationLookupRepository;->service:Lcom/microblink/internal/services/ip/LocationLookupService;

    new-instance v1, Lcom/microblink/internal/services/ip/LocationLookupRepository$1;

    invoke-direct {v1, p0, p2}, Lcom/microblink/internal/services/ip/LocationLookupRepository$1;-><init>(Lcom/microblink/internal/services/ip/LocationLookupRepository;Lcom/microblink/internal/services/ip/LocationLookupRepository$Listener;)V

    invoke-interface {v0, p1, v1}, Lcom/microblink/internal/services/ip/LocationLookupService;->enqueue(Ljava/lang/String;Lcom/microblink/OnCompleteListener;)V

    return-void
.end method
