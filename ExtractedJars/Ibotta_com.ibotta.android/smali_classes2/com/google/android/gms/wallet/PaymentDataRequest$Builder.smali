.class public final Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/PaymentDataRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "Builder"
.end annotation


# instance fields
.field private final synthetic zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/wallet/PaymentDataRequest;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/wallet/PaymentDataRequest;Lcom/google/android/gms/wallet/zzad;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;-><init>(Lcom/google/android/gms/wallet/PaymentDataRequest;)V

    return-void
.end method


# virtual methods
.method public final addAllowedPaymentMethod(I)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzbw:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzbw:Ljava/util/ArrayList;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzbw:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final addAllowedPaymentMethods(Ljava/util/Collection;)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;
    .locals 2
    .param p1    # Ljava/util/Collection;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/Integer;",
            ">;)",
            "Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "allowedPaymentMethods can\'t be null or empty!"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzbw:Ljava/util/ArrayList;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzbw:Ljava/util/ArrayList;

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzbw:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final build()Lcom/google/android/gms/wallet/PaymentDataRequest;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzby:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzbw:Ljava/util/ArrayList;

    const-string v1, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzdw:Lcom/google/android/gms/wallet/CardRequirements;

    const-string v1, "Card requirements must be set!"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzdo:Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iget-object v0, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzdy:Lcom/google/android/gms/wallet/TransactionInfo;

    const-string v1, "Transaction info must be set if paymentMethodTokenizationParameters is set!"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    return-object v0
.end method

.method public final setCardRequirements(Lcom/google/android/gms/wallet/CardRequirements;)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;
    .locals 1
    .param p1    # Lcom/google/android/gms/wallet/CardRequirements;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzdw:Lcom/google/android/gms/wallet/CardRequirements;

    return-object p0
.end method

.method public final setEmailRequired(Z)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzdv:Z

    return-object p0
.end method

.method public final setPaymentMethodTokenizationParameters(Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzdo:Lcom/google/android/gms/wallet/PaymentMethodTokenizationParameters;

    return-object p0
.end method

.method public final setPhoneNumberRequired(Z)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzdd:Z

    return-object p0
.end method

.method public final setShippingAddressRequired(Z)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzde:Z

    return-object p0
.end method

.method public final setShippingAddressRequirements(Lcom/google/android/gms/wallet/ShippingAddressRequirements;)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;
    .locals 1
    .param p1    # Lcom/google/android/gms/wallet/ShippingAddressRequirements;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzdx:Lcom/google/android/gms/wallet/ShippingAddressRequirements;

    return-object p0
.end method

.method public final setTransactionInfo(Lcom/google/android/gms/wallet/TransactionInfo;)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;
    .locals 1
    .param p1    # Lcom/google/android/gms/wallet/TransactionInfo;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iput-object p1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzdy:Lcom/google/android/gms/wallet/TransactionInfo;

    return-object p0
.end method

.method public final setUiRequired(Z)Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/wallet/PaymentDataRequest$Builder;->zzea:Lcom/google/android/gms/wallet/PaymentDataRequest;

    iput-boolean p1, v0, Lcom/google/android/gms/wallet/PaymentDataRequest;->zzdz:Z

    return-object p0
.end method
