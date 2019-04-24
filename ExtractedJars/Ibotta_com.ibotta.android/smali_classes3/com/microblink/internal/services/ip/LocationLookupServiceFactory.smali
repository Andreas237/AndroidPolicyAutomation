.class public final Lcom/microblink/internal/services/ip/LocationLookupServiceFactory;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Z)Lcom/microblink/internal/services/ip/LocationLookupService;
    .locals 0

    new-instance p0, Lcom/microblink/internal/services/ip/LocationServiceImpl;

    invoke-direct {p0}, Lcom/microblink/internal/services/ip/LocationServiceImpl;-><init>()V

    return-object p0
.end method
