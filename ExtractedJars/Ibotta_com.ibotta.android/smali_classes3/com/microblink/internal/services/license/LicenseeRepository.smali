.class public Lcom/microblink/internal/services/license/LicenseeRepository;
.super Ljava/lang/Object;


# static fields
.field private static final TAG:Ljava/lang/String; = "LicenseeRepository"


# instance fields
.field private service:Lcom/microblink/internal/services/license/LicenseeService;


# direct methods
.method public constructor <init>()V
    .locals 1

    new-instance v0, Lcom/microblink/internal/services/license/LicenseeServiceImpl;

    invoke-direct {v0}, Lcom/microblink/internal/services/license/LicenseeServiceImpl;-><init>()V

    invoke-direct {p0, v0}, Lcom/microblink/internal/services/license/LicenseeRepository;-><init>(Lcom/microblink/internal/services/license/LicenseeService;)V

    return-void
.end method

.method private constructor <init>(Lcom/microblink/internal/services/license/LicenseeService;)V
    .locals 0
    .param p1    # Lcom/microblink/internal/services/license/LicenseeService;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/license/LicenseeRepository;->service:Lcom/microblink/internal/services/license/LicenseeService;

    return-void
.end method


# virtual methods
.method public checkLicense(Lcom/microblink/OnCompleteListener;)V
    .locals 2
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

    iget-object v0, p0, Lcom/microblink/internal/services/license/LicenseeRepository;->service:Lcom/microblink/internal/services/license/LicenseeService;

    new-instance v1, Lcom/microblink/internal/services/license/LicenseeRepository$1;

    invoke-direct {v1, p0, p1}, Lcom/microblink/internal/services/license/LicenseeRepository$1;-><init>(Lcom/microblink/internal/services/license/LicenseeRepository;Lcom/microblink/OnCompleteListener;)V

    invoke-interface {v0, v1}, Lcom/microblink/internal/services/license/LicenseeService;->checkLicense(Lcom/microblink/OnCompleteListener;)V

    return-void
.end method
