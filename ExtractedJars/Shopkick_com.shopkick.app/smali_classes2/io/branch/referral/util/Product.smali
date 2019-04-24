.class public Lio/branch/referral/util/Product;
.super Ljava/lang/Object;
.source "Product.java"


# instance fields
.field private brand:Ljava/lang/String;

.field private category:Lio/branch/referral/util/ProductCategory;

.field private name:Ljava/lang/String;

.field private price:Ljava/lang/Double;

.field private quantity:Ljava/lang/Integer;

.field private sku:Ljava/lang/String;

.field private variant:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lio/branch/referral/util/ProductCategory;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lio/branch/referral/util/Product;->sku:Ljava/lang/String;

    .line 80
    iput-object p2, p0, Lio/branch/referral/util/Product;->name:Ljava/lang/String;

    .line 81
    iput-object p3, p0, Lio/branch/referral/util/Product;->price:Ljava/lang/Double;

    .line 82
    iput-object p4, p0, Lio/branch/referral/util/Product;->quantity:Ljava/lang/Integer;

    .line 83
    iput-object p5, p0, Lio/branch/referral/util/Product;->brand:Ljava/lang/String;

    .line 84
    iput-object p6, p0, Lio/branch/referral/util/Product;->variant:Ljava/lang/String;

    .line 85
    iput-object p7, p0, Lio/branch/referral/util/Product;->category:Lio/branch/referral/util/ProductCategory;

    return-void
.end method


# virtual methods
.method public getBrand()Ljava/lang/String;
    .locals 1

    .line 52
    iget-object v0, p0, Lio/branch/referral/util/Product;->brand:Ljava/lang/String;

    return-object v0
.end method

.method public getCategory()Lio/branch/referral/util/ProductCategory;
    .locals 1

    .line 68
    iget-object v0, p0, Lio/branch/referral/util/Product;->category:Lio/branch/referral/util/ProductCategory;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 28
    iget-object v0, p0, Lio/branch/referral/util/Product;->name:Ljava/lang/String;

    return-object v0
.end method

.method public getPrice()Ljava/lang/Double;
    .locals 1

    .line 36
    iget-object v0, p0, Lio/branch/referral/util/Product;->price:Ljava/lang/Double;

    return-object v0
.end method

.method public getProductJSONObject()Lorg/json/JSONObject;
    .locals 3

    .line 89
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string/jumbo v1, "sku"

    .line 91
    iget-object v2, p0, Lio/branch/referral/util/Product;->sku:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "name"

    .line 92
    iget-object v2, p0, Lio/branch/referral/util/Product;->name:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "price"

    .line 93
    iget-object v2, p0, Lio/branch/referral/util/Product;->price:Ljava/lang/Double;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "quantity"

    .line 94
    iget-object v2, p0, Lio/branch/referral/util/Product;->quantity:Ljava/lang/Integer;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "brand"

    .line 95
    iget-object v2, p0, Lio/branch/referral/util/Product;->brand:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string/jumbo v1, "variant"

    .line 96
    iget-object v2, p0, Lio/branch/referral/util/Product;->variant:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "category"

    .line 97
    iget-object v2, p0, Lio/branch/referral/util/Product;->category:Lio/branch/referral/util/ProductCategory;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0
.end method

.method public getQuantity()Ljava/lang/Integer;
    .locals 1

    .line 44
    iget-object v0, p0, Lio/branch/referral/util/Product;->quantity:Ljava/lang/Integer;

    return-object v0
.end method

.method public getSku()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lio/branch/referral/util/Product;->sku:Ljava/lang/String;

    return-object v0
.end method

.method public getVariant()Ljava/lang/String;
    .locals 1

    .line 60
    iget-object v0, p0, Lio/branch/referral/util/Product;->variant:Ljava/lang/String;

    return-object v0
.end method

.method public setBrand(Ljava/lang/String;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lio/branch/referral/util/Product;->brand:Ljava/lang/String;

    return-void
.end method

.method public setCategory(Lio/branch/referral/util/ProductCategory;)V
    .locals 0

    .line 72
    iput-object p1, p0, Lio/branch/referral/util/Product;->category:Lio/branch/referral/util/ProductCategory;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 32
    iput-object p1, p0, Lio/branch/referral/util/Product;->name:Ljava/lang/String;

    return-void
.end method

.method public setPrice(Ljava/lang/Double;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lio/branch/referral/util/Product;->price:Ljava/lang/Double;

    return-void
.end method

.method public setQuantity(Ljava/lang/Integer;)V
    .locals 0

    .line 48
    iput-object p1, p0, Lio/branch/referral/util/Product;->quantity:Ljava/lang/Integer;

    return-void
.end method

.method public setSku(Ljava/lang/String;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lio/branch/referral/util/Product;->sku:Ljava/lang/String;

    return-void
.end method

.method public setVariant(Ljava/lang/String;)V
    .locals 0

    .line 64
    iput-object p1, p0, Lio/branch/referral/util/Product;->variant:Ljava/lang/String;

    return-void
.end method
