.class public Lcom/stripe/android/model/SourceParams;
.super Ljava/lang/Object;
.source "SourceParams.java"


# instance fields
.field private mAmount:Ljava/lang/Long;
    .annotation build Landroid/support/annotation/IntRange;
        from = 0x0L
    .end annotation
.end field

.field private mApiParameterMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mCurrency:Ljava/lang/String;

.field private mExtraParams:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mMetaData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mOwner:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mRedirect:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private mToken:Ljava/lang/String;

.field private mType:Ljava/lang/String;

.field private mTypeRaw:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private mUsage:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static createCardParams(Lcom/stripe/android/model/Card;)Lcom/stripe/android/model/SourceParams;
    .locals 4
    .param p0    # Lcom/stripe/android/model/Card;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 249
    new-instance v0, Lcom/stripe/android/model/SourceParams;

    invoke-direct {v0}, Lcom/stripe/android/model/SourceParams;-><init>()V

    const-string v1, "card"

    invoke-virtual {v0, v1}, Lcom/stripe/android/model/SourceParams;->setType(Ljava/lang/String;)Lcom/stripe/android/model/SourceParams;

    move-result-object v0

    .line 253
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "number"

    .line 254
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getNumber()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "exp_month"

    .line 255
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getExpMonth()Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "exp_year"

    .line 256
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getExpYear()Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "cvc"

    .line 257
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getCVC()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    invoke-static {v1}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    .line 260
    invoke-virtual {v0, v1}, Lcom/stripe/android/model/SourceParams;->setApiParameterMap(Ljava/util/Map;)Lcom/stripe/android/model/SourceParams;

    .line 262
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "line1"

    .line 263
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getAddressLine1()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "line2"

    .line 264
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getAddressLine2()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "city"

    .line 265
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getAddressCity()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "country"

    .line 266
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getAddressCountry()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "state"

    .line 267
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getAddressState()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "postal_code"

    .line 268
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getAddressZip()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    invoke-static {v1}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    .line 272
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "name"

    .line 273
    invoke-virtual {p0}, Lcom/stripe/android/model/Card;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-interface {v2, v3, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result p0

    if-lez p0, :cond_0

    const-string p0, "address"

    .line 275
    invoke-interface {v2, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    :cond_0
    invoke-static {v2}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    .line 278
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result p0

    if-lez p0, :cond_1

    .line 279
    invoke-virtual {v0, v2}, Lcom/stripe/android/model/SourceParams;->setOwner(Ljava/util/Map;)Lcom/stripe/android/model/SourceParams;

    :cond_1
    return-object v0
.end method


# virtual methods
.method public getType()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 642
    iget-object v0, p0, Lcom/stripe/android/model/SourceParams;->mType:Ljava/lang/String;

    return-object v0
.end method

.method public setApiParameterMap(Ljava/util/Map;)Lcom/stripe/android/model/SourceParams;
    .locals 0
    .param p1    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/stripe/android/model/SourceParams;"
        }
    .end annotation

    .line 686
    iput-object p1, p0, Lcom/stripe/android/model/SourceParams;->mApiParameterMap:Ljava/util/Map;

    return-object p0
.end method

.method public setOwner(Ljava/util/Map;)Lcom/stripe/android/model/SourceParams;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/stripe/android/model/SourceParams;"
        }
    .end annotation

    .line 704
    iput-object p1, p0, Lcom/stripe/android/model/SourceParams;->mOwner:Ljava/util/Map;

    return-object p0
.end method

.method public setType(Ljava/lang/String;)Lcom/stripe/android/model/SourceParams;
    .locals 0

    .line 752
    iput-object p1, p0, Lcom/stripe/android/model/SourceParams;->mType:Ljava/lang/String;

    .line 753
    iput-object p1, p0, Lcom/stripe/android/model/SourceParams;->mTypeRaw:Ljava/lang/String;

    return-object p0
.end method

.method public toParamMap()Ljava/util/Map;
    .locals 3
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 816
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "type"

    .line 818
    iget-object v2, p0, Lcom/stripe/android/model/SourceParams;->mTypeRaw:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 819
    iget-object v1, p0, Lcom/stripe/android/model/SourceParams;->mTypeRaw:Ljava/lang/String;

    iget-object v2, p0, Lcom/stripe/android/model/SourceParams;->mApiParameterMap:Ljava/util/Map;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "amount"

    .line 820
    iget-object v2, p0, Lcom/stripe/android/model/SourceParams;->mAmount:Ljava/lang/Long;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "currency"

    .line 821
    iget-object v2, p0, Lcom/stripe/android/model/SourceParams;->mCurrency:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "owner"

    .line 822
    iget-object v2, p0, Lcom/stripe/android/model/SourceParams;->mOwner:Ljava/util/Map;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "redirect"

    .line 823
    iget-object v2, p0, Lcom/stripe/android/model/SourceParams;->mRedirect:Ljava/util/Map;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "metadata"

    .line 824
    iget-object v2, p0, Lcom/stripe/android/model/SourceParams;->mMetaData:Ljava/util/Map;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "token"

    .line 825
    iget-object v2, p0, Lcom/stripe/android/model/SourceParams;->mToken:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "usage"

    .line 826
    iget-object v2, p0, Lcom/stripe/android/model/SourceParams;->mUsage:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 827
    iget-object v1, p0, Lcom/stripe/android/model/SourceParams;->mExtraParams:Ljava/util/Map;

    if-eqz v1, :cond_0

    .line 828
    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 830
    :cond_0
    invoke-static {v0}, Lcom/stripe/android/StripeNetworkUtils;->removeNullAndEmptyParams(Ljava/util/Map;)V

    return-object v0
.end method
