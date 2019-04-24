.class public Lcom/microblink/internal/services/store/Store;
.super Ljava/lang/Object;


# instance fields
.field private aggDataId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "agg_data_id"
    .end annotation
.end field

.field private bannerId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "banner_id"
    .end annotation
.end field

.field private bannerName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "banner_name"
    .end annotation
.end field

.field private category:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "category"
    .end annotation
.end field

.field private googlePlaceId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "google_place_id"
    .end annotation
.end field

.field private id:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "id"
    .end annotation
.end field

.field private latitude:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_latitude"
    .end annotation
.end field

.field private longitude:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_longitude"
    .end annotation
.end field

.field private merchantName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "merchant_name"
    .end annotation
.end field

.field private score:F
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "score"
    .end annotation
.end field

.field private storeAddress:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_address"
    .end annotation
.end field

.field private storeCity:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_city"
    .end annotation
.end field

.field private storeCountry:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_country"
    .end annotation
.end field

.field private storeLocationNumber:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_location_number"
    .end annotation
.end field

.field private storeManagerName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_manager_name"
    .end annotation
.end field

.field private storeName:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_name"
    .end annotation
.end field

.field private storePhoneNumber:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_phone_number"
    .end annotation
.end field

.field private storeState:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_state"
    .end annotation
.end field

.field private storeTypes:[Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_types"
    .end annotation
.end field

.field private storeZipCode:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "store_zip_code"
    .end annotation
.end field

.field private yelpPlaceId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "yelp_place_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public aggDataId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->aggDataId:Ljava/lang/String;

    return-object v0
.end method

.method public bannerId()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/store/Store;->bannerId:I

    return v0
.end method

.method public bannerName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->bannerName:Ljava/lang/String;

    return-object v0
.end method

.method public category()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->category:Ljava/lang/String;

    return-object v0
.end method

.method public googlePlaceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->googlePlaceId:Ljava/lang/String;

    return-object v0
.end method

.method public id()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/store/Store;->id:I

    return v0
.end method

.method public latitude()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->latitude:Ljava/lang/String;

    return-object v0
.end method

.method public longitude()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->longitude:Ljava/lang/String;

    return-object v0
.end method

.method public merchantName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->merchantName:Ljava/lang/String;

    return-object v0
.end method

.method public score()F
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/store/Store;->score:F

    return v0
.end method

.method public storeAddress()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->storeAddress:Ljava/lang/String;

    return-object v0
.end method

.method public storeCity()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->storeCity:Ljava/lang/String;

    return-object v0
.end method

.method public storeCountry()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->storeCountry:Ljava/lang/String;

    return-object v0
.end method

.method public storeLocationNumber()I
    .locals 1

    iget v0, p0, Lcom/microblink/internal/services/store/Store;->storeLocationNumber:I

    return v0
.end method

.method public storeManagerName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->storeManagerName:Ljava/lang/String;

    return-object v0
.end method

.method public storeName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->storeName:Ljava/lang/String;

    return-object v0
.end method

.method public storePhoneNumber()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->storePhoneNumber:Ljava/lang/String;

    return-object v0
.end method

.method public storeState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->storeState:Ljava/lang/String;

    return-object v0
.end method

.method public storeTypes()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->storeTypes:[Ljava/lang/String;

    return-object v0
.end method

.method public storeZipCode()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->storeZipCode:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Store{id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/microblink/internal/services/store/Store;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bannerId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/services/store/Store;->bannerId:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", storeLocationNumber=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/services/store/Store;->storeLocationNumber:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", storePhoneNumber=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/store/Store;->storePhoneNumber:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", storeAddress=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/store/Store;->storeAddress:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", storeCity=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/store/Store;->storeCity:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", storeState=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/store/Store;->storeState:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", storeZipCode=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/store/Store;->storeZipCode:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", storeManagerName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/store/Store;->storeManagerName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", storeName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/store/Store;->storeName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", latitude=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/store/Store;->latitude:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", longitude=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/services/store/Store;->longitude:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/microblink/internal/services/store/Store;->score:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public yelpPlaceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/services/store/Store;->yelpPlaceId:Ljava/lang/String;

    return-object v0
.end method
