.class public Lcom/microblink/ScanOptions$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/microblink/ScanOptions;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private countryCode:Ljava/lang/String;

.field private edgeDetectionConfiguration:Lcom/microblink/EdgeDetectionConfiguration;

.field private frameCharacteristics:Lcom/microblink/FrameCharacteristics;

.field private logoDetection:Z

.field private merchantConfiguration:Lcom/microblink/MerchantConfiguration;

.field private retailer:Lcom/microblink/Retailer;
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation
.end field

.field private searchTargets:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/microblink/EdgeDetectionConfiguration;

    invoke-direct {v0}, Lcom/microblink/EdgeDetectionConfiguration;-><init>()V

    iput-object v0, p0, Lcom/microblink/ScanOptions$Builder;->edgeDetectionConfiguration:Lcom/microblink/EdgeDetectionConfiguration;

    new-instance v0, Lcom/microblink/MerchantConfiguration;

    invoke-direct {v0}, Lcom/microblink/MerchantConfiguration;-><init>()V

    iput-object v0, p0, Lcom/microblink/ScanOptions$Builder;->merchantConfiguration:Lcom/microblink/MerchantConfiguration;

    return-void
.end method

.method static synthetic access$000(Lcom/microblink/ScanOptions$Builder;)Lcom/microblink/Retailer;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanOptions$Builder;->retailer:Lcom/microblink/Retailer;

    return-object p0
.end method

.method static synthetic access$100(Lcom/microblink/ScanOptions$Builder;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanOptions$Builder;->searchTargets:Ljava/util/List;

    return-object p0
.end method

.method static synthetic access$200(Lcom/microblink/ScanOptions$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanOptions$Builder;->countryCode:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$300(Lcom/microblink/ScanOptions$Builder;)Lcom/microblink/MerchantConfiguration;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanOptions$Builder;->merchantConfiguration:Lcom/microblink/MerchantConfiguration;

    return-object p0
.end method

.method static synthetic access$400(Lcom/microblink/ScanOptions$Builder;)Lcom/microblink/FrameCharacteristics;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanOptions$Builder;->frameCharacteristics:Lcom/microblink/FrameCharacteristics;

    return-object p0
.end method

.method static synthetic access$500(Lcom/microblink/ScanOptions$Builder;)Lcom/microblink/EdgeDetectionConfiguration;
    .locals 0

    iget-object p0, p0, Lcom/microblink/ScanOptions$Builder;->edgeDetectionConfiguration:Lcom/microblink/EdgeDetectionConfiguration;

    return-object p0
.end method

.method static synthetic access$600(Lcom/microblink/ScanOptions$Builder;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/microblink/ScanOptions$Builder;->logoDetection:Z

    return p0
.end method


# virtual methods
.method public build()Lcom/microblink/ScanOptions;
    .locals 2

    new-instance v0, Lcom/microblink/ScanOptions;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/microblink/ScanOptions;-><init>(Lcom/microblink/ScanOptions$Builder;Lcom/microblink/ScanOptions$1;)V

    return-object v0
.end method

.method public countryCode(Ljava/lang/String;)Lcom/microblink/ScanOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanOptions$Builder;->countryCode:Ljava/lang/String;

    return-object p0
.end method

.method public edgeDetectionConfiguration(Lcom/microblink/EdgeDetectionConfiguration;)Lcom/microblink/ScanOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanOptions$Builder;->edgeDetectionConfiguration:Lcom/microblink/EdgeDetectionConfiguration;

    return-object p0
.end method

.method public frameCharacteristics(Lcom/microblink/FrameCharacteristics;)Lcom/microblink/ScanOptions$Builder;
    .locals 0
    .param p1    # Lcom/microblink/FrameCharacteristics;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/microblink/ScanOptions$Builder;->frameCharacteristics:Lcom/microblink/FrameCharacteristics;

    return-object p0
.end method

.method public logoDetection(Z)Lcom/microblink/ScanOptions$Builder;
    .locals 0

    iput-boolean p1, p0, Lcom/microblink/ScanOptions$Builder;->logoDetection:Z

    return-object p0
.end method

.method public merchantConfiguration(Lcom/microblink/MerchantConfiguration;)Lcom/microblink/ScanOptions$Builder;
    .locals 0

    iput-object p1, p0, Lcom/microblink/ScanOptions$Builder;->merchantConfiguration:Lcom/microblink/MerchantConfiguration;

    return-object p0
.end method

.method public retailer(Lcom/microblink/Retailer;)Lcom/microblink/ScanOptions$Builder;
    .locals 0
    .param p1    # Lcom/microblink/Retailer;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/microblink/ScanOptions$Builder;->retailer:Lcom/microblink/Retailer;

    return-object p0
.end method

.method public searchTargets(Ljava/util/List;)Lcom/microblink/ScanOptions$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/microblink/Product;",
            ">;)",
            "Lcom/microblink/ScanOptions$Builder;"
        }
    .end annotation

    iput-object p1, p0, Lcom/microblink/ScanOptions$Builder;->searchTargets:Ljava/util/List;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Builder{retailer="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/ScanOptions$Builder;->retailer:Lcom/microblink/Retailer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", searchTargets="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanOptions$Builder;->searchTargets:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", countryCode=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanOptions$Builder;->countryCode:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", logoDetection="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/ScanOptions$Builder;->logoDetection:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", edgeDetectionConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanOptions$Builder;->edgeDetectionConfiguration:Lcom/microblink/EdgeDetectionConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", merchantConfiguration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanOptions$Builder;->merchantConfiguration:Lcom/microblink/MerchantConfiguration;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", frameCharacteristics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/ScanOptions$Builder;->frameCharacteristics:Lcom/microblink/FrameCharacteristics;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
