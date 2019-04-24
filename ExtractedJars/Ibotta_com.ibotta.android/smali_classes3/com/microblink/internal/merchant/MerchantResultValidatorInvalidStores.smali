.class public Lcom/microblink/internal/merchant/MerchantResultValidatorInvalidStores;
.super Lcom/microblink/internal/merchant/MerchantResultValidatorImpl;


# static fields
.field private static final MERCHANTS:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const-string v0, "starbucks"

    const-string v1, "starbucks us"

    const-string v2, "caribou"

    const-string v3, "dunkin\' donuts"

    const-string v4, "subway"

    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/microblink/internal/merchant/MerchantResultValidatorInvalidStores;->MERCHANTS:Ljava/util/List;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/internal/merchant/MerchantResultValidatorImpl;-><init>()V

    return-void
.end method


# virtual methods
.method public valid(Lcom/microblink/internal/merchant/MerchantResult;)Z
    .locals 2
    .param p1    # Lcom/microblink/internal/merchant/MerchantResult;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    invoke-super {p0, p1}, Lcom/microblink/internal/merchant/MerchantResultValidatorImpl;->valid(Lcom/microblink/internal/merchant/MerchantResult;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    const-string v0, "BLINK"

    invoke-virtual {p1}, Lcom/microblink/internal/merchant/MerchantResult;->merchantSource()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/microblink/internal/merchant/MerchantResultValidatorInvalidStores;->MERCHANTS:Ljava/util/List;

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
