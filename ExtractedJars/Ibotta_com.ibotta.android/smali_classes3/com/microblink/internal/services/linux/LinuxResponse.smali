.class public final Lcom/microblink/internal/services/linux/LinuxResponse;
.super Lcom/microblink/internal/services/ServiceResponse;


# instance fields
.field private bannerId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "banner_id"
    .end annotation
.end field

.field private cashier:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cashier"
    .end annotation
.end field

.field private dateTime:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "date"
    .end annotation
.end field

.field private discounts:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "discounts"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/linux/Discount;",
            ">;"
        }
    .end annotation
.end field

.field private error:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "error"
    .end annotation
.end field

.field private last4cc:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "last4cc"
    .end annotation
.end field

.field private longTransactionId:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "long_transaction"
    .end annotation
.end field

.field private merchantCsv:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "merchant_csv"
    .end annotation
.end field

.field private merchantLogo:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "merchant_logo"
    .end annotation
.end field

.field private merchantName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "merchant_name"
    .end annotation
.end field

.field private merchantSource:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "merchant_source"
    .end annotation
.end field

.field private paymentMethods:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "paymentMethods"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/linux/PaymentMethod;",
            ">;"
        }
    .end annotation
.end field

.field private phones:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "phones"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/StringType;",
            ">;"
        }
    .end annotation
.end field

.field private products:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "products"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/linux/Product;",
            ">;"
        }
    .end annotation
.end field

.field private rawText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "raw_text"
    .end annotation
.end field

.field private register:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "register"
    .end annotation
.end field

.field private sdkVersion:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sdk_version"
    .end annotation
.end field

.field private store:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store"
    .end annotation
.end field

.field private storeCity:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_city"
    .end annotation
.end field

.field private storeState:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_state"
    .end annotation
.end field

.field private storeStreet:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_street"
    .end annotation
.end field

.field private storeZip:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_zip"
    .end annotation
.end field

.field private subtotal:Lcom/microblink/FloatType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtotal"
    .end annotation
.end field

.field private subtotalMatches:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "subtotal_matches"
    .end annotation
.end field

.field private taxId:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "tax_id"
    .end annotation
.end field

.field private taxes:Lcom/microblink/FloatType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "taxes"
    .end annotation
.end field

.field private time:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time"
    .end annotation
.end field

.field private total:Lcom/microblink/FloatType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total"
    .end annotation
.end field

.field private transaction:Lcom/microblink/StringType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "transaction"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/microblink/internal/services/ServiceResponse;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Lcom/microblink/internal/services/ServiceResponse;-><init>()V

    iput-object p1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->error:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final bannerId()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->bannerId:I

    return v0
.end method

.method public final cashier()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->cashier:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final dateTime()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->dateTime:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final discounts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/linux/Discount;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->discounts:Ljava/util/List;

    return-object v0
.end method

.method public final error()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->error:Ljava/lang/String;

    return-object v0
.end method

.method public final last4cc()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->last4cc:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final longTransactionId()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->longTransactionId:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final merchantCsv()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantCsv:Ljava/lang/String;

    return-object v0
.end method

.method public final merchantLogo()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantLogo:Ljava/lang/String;

    return-object v0
.end method

.method public final merchantName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public final merchantSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantSource:Ljava/lang/String;

    return-object v0
.end method

.method public final paymentMethods()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/linux/PaymentMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->paymentMethods:Ljava/util/List;

    return-object v0
.end method

.method public final phones()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/StringType;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->phones:Ljava/util/List;

    return-object v0
.end method

.method public final products()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/microblink/internal/services/linux/Product;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->products:Ljava/util/List;

    return-object v0
.end method

.method public final rawText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->rawText:Ljava/lang/String;

    return-object v0
.end method

.method public final register()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->register:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final sdkVersion()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->sdkVersion:Ljava/lang/String;

    return-object v0
.end method

.method public final store()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->store:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeCity()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->storeCity:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeState()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->storeState:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeStreet()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->storeStreet:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final storeZip()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->storeZip:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final subtotal()Lcom/microblink/FloatType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->subtotal:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final subtotalMatches()Z
    .locals 1

    iget-boolean v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->subtotalMatches:Z

    return v0
.end method

.method public final taxId()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->taxId:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final taxes()Lcom/microblink/FloatType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->taxes:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final time()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->time:Lcom/microblink/StringType;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "LinuxResponse{longTransactionId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->longTransactionId:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", error=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->error:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", sdkVersion=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->sdkVersion:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", bannerId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->bannerId:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", merchantLogo=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantLogo:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", phones="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->phones:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", products="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->products:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", cashier="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->cashier:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", dateTime="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->dateTime:Lcom/microblink/StringType;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", discounts="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->discounts:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", merchantCsv=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantCsv:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", merchantName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", merchantSource=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->merchantSource:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", paymentMethods="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->paymentMethods:Ljava/util/List;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", rawText=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->rawText:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", register="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->register:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", store="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->store:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", storeCity="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->storeCity:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", storeState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->storeState:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", storeStreet="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->storeStreet:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", storeZip="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->storeZip:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtotal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->subtotal:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", taxes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->taxes:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", transaction="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->transaction:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", total="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->total:Lcom/microblink/FloatType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", taxId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->taxId:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", time="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->time:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", last4cc="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->last4cc:Lcom/microblink/StringType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", subtotalMatches="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->subtotalMatches:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final total()Lcom/microblink/FloatType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->total:Lcom/microblink/FloatType;

    return-object v0
.end method

.method public final transaction()Lcom/microblink/StringType;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/linux/LinuxResponse;->transaction:Lcom/microblink/StringType;

    return-object v0
.end method
