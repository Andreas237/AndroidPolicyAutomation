.class public final Lcom/microblink/internal/services/license/LicenseeServiceImpl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/microblink/internal/services/license/LicenseeService;


# static fields
.field private static final EMPTY:Lcom/microblink/internal/services/license/LicenseServiceResponse;

.field private static final TAG:Ljava/lang/String; = "LicenseeServiceImpl"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/license/LicenseServiceResponse;

    invoke-direct {v0}, Lcom/microblink/internal/services/license/LicenseServiceResponse;-><init>()V

    sput-object v0, Lcom/microblink/internal/services/license/LicenseeServiceImpl;->EMPTY:Lcom/microblink/internal/services/license/LicenseServiceResponse;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000()Lcom/microblink/internal/services/license/LicenseServiceResponse;
    .locals 1

    sget-object v0, Lcom/microblink/internal/services/license/LicenseeServiceImpl;->EMPTY:Lcom/microblink/internal/services/license/LicenseServiceResponse;

    return-object v0
.end method


# virtual methods
.method public final checkLicense(Lcom/microblink/OnCompleteListener;)V
    .locals 3
    .param p1    # Lcom/microblink/OnCompleteListener;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/microblink/OnCompleteListener<",
            "Lcom/microblink/internal/services/license/LicenseServiceResponse;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    const-class v0, Lcom/microblink/internal/services/license/LicenseApiService;

    invoke-static {v0}, Lcom/microblink/internal/services/ServiceGenerator;->createService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/microblink/internal/services/license/LicenseApiService;

    invoke-static {}, Lcom/microblink/internal/services/license/License;->create()Lcom/microblink/internal/services/license/License;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/microblink/internal/services/license/LicenseApiService;->create(Lcom/microblink/internal/services/license/License;)Lretrofit2/Call;

    move-result-object v0

    new-instance v1, Lcom/microblink/internal/services/license/LicenseeServiceImpl$1;

    invoke-direct {v1, p0, p1}, Lcom/microblink/internal/services/license/LicenseeServiceImpl$1;-><init>(Lcom/microblink/internal/services/license/LicenseeServiceImpl;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, v1}, Lretrofit2/Call;->enqueue(Lretrofit2/Callback;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "LicenseeServiceImpl"

    invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v0, v2}, Lcom/microblink/internal/Logger;->e(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object v0, Lcom/microblink/internal/services/license/LicenseeServiceImpl;->EMPTY:Lcom/microblink/internal/services/license/LicenseServiceResponse;

    invoke-interface {p1, v0}, Lcom/microblink/OnCompleteListener;->onComplete(Ljava/lang/Object;)V

    return-void
.end method
