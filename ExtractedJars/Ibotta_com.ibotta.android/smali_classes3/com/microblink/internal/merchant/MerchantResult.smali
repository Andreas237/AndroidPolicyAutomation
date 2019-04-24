.class public Lcom/microblink/internal/merchant/MerchantResult;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/microblink/internal/merchant/MerchantResult$Source;
    }
.end annotation


# static fields
.field public static final ABN:Ljava/lang/String; = "ABN"

.field public static final BLINK:Ljava/lang/String; = "BLINK"

.field public static final CANDIDATE_FOR_PHONE_LOOKUP:Ljava/lang/String; = "CANDIDATE FOR PHONE LOOKUP"

.field public static final CANDIDATE_LOOKUP:Ljava/lang/String; = "CANDIDATE LOOKUP"

.field public static final COUNTRY_SPECIFIC_LOOKUP:Ljava/lang/String; = "COUNTRY LOOKUP"

.field public static final GOOGLE:Ljava/lang/String; = "GOOGLE"

.field public static final INVALID_BANNER_ID:I = -0x1

.field public static final MERCHANT_CSV:Ljava/lang/String; = "MERCHANT CSV"

.field public static final YELP:Ljava/lang/String; = "YELP"


# instance fields
.field public bannerId:I

.field public catTypes:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public city:Ljava/lang/String;

.field public country:Ljava/lang/String;

.field public googleFormattedAddress:Ljava/lang/String;

.field public googlePlaceId:Ljava/lang/String;

.field public googleVicinity:Ljava/lang/String;

.field public mallName:Ljava/lang/String;

.field private merchantSource:Ljava/lang/String;

.field public name:Ljava/lang/String;

.field public rawMatch:Z

.field public state:Ljava/lang/String;

.field public storeNumber:I

.field public street:Ljava/lang/String;

.field public yelpId:Ljava/lang/String;

.field public zip:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/microblink/internal/merchant/MerchantResult;->storeNumber:I

    const/4 v1, -0x1

    iput v1, p0, Lcom/microblink/internal/merchant/MerchantResult;->bannerId:I

    iput-boolean v0, p0, Lcom/microblink/internal/merchant/MerchantResult;->rawMatch:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/microblink/internal/merchant/MerchantResult;->merchantSource:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_1c

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto/16 :goto_b

    :cond_1
    check-cast p1, Lcom/microblink/internal/merchant/MerchantResult;

    iget v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->storeNumber:I

    iget v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->storeNumber:I

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->bannerId:I

    iget v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->bannerId:I

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-boolean v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->rawMatch:Z

    iget-boolean v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->rawMatch:Z

    if-eq v2, v3, :cond_4

    return v1

    :cond_4
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    if-eqz v2, :cond_5

    iget-object v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_0

    :cond_5
    iget-object v2, p1, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    if-eqz v2, :cond_6

    :goto_0
    return v1

    :cond_6
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->street:Ljava/lang/String;

    if-eqz v2, :cond_7

    iget-object v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->street:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    goto :goto_1

    :cond_7
    iget-object v2, p1, Lcom/microblink/internal/merchant/MerchantResult;->street:Ljava/lang/String;

    if-eqz v2, :cond_8

    :goto_1
    return v1

    :cond_8
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->city:Ljava/lang/String;

    if-eqz v2, :cond_9

    iget-object v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->city:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_2

    :cond_9
    iget-object v2, p1, Lcom/microblink/internal/merchant/MerchantResult;->city:Ljava/lang/String;

    if-eqz v2, :cond_a

    :goto_2
    return v1

    :cond_a
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->state:Ljava/lang/String;

    if-eqz v2, :cond_b

    iget-object v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->state:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    goto :goto_3

    :cond_b
    iget-object v2, p1, Lcom/microblink/internal/merchant/MerchantResult;->state:Ljava/lang/String;

    if-eqz v2, :cond_c

    :goto_3
    return v1

    :cond_c
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->zip:Ljava/lang/String;

    if-eqz v2, :cond_d

    iget-object v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->zip:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_4

    :cond_d
    iget-object v2, p1, Lcom/microblink/internal/merchant/MerchantResult;->zip:Ljava/lang/String;

    if-eqz v2, :cond_e

    :goto_4
    return v1

    :cond_e
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->country:Ljava/lang/String;

    if-eqz v2, :cond_f

    iget-object v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->country:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_5

    :cond_f
    iget-object v2, p1, Lcom/microblink/internal/merchant/MerchantResult;->country:Ljava/lang/String;

    if-eqz v2, :cond_10

    :goto_5
    return v1

    :cond_10
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->catTypes:Ljava/util/ArrayList;

    if-eqz v2, :cond_11

    iget-object v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->catTypes:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_12

    goto :goto_6

    :cond_11
    iget-object v2, p1, Lcom/microblink/internal/merchant/MerchantResult;->catTypes:Ljava/util/ArrayList;

    if-eqz v2, :cond_12

    :goto_6
    return v1

    :cond_12
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->mallName:Ljava/lang/String;

    if-eqz v2, :cond_13

    iget-object v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->mallName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_7

    :cond_13
    iget-object v2, p1, Lcom/microblink/internal/merchant/MerchantResult;->mallName:Ljava/lang/String;

    if-eqz v2, :cond_14

    :goto_7
    return v1

    :cond_14
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->yelpId:Ljava/lang/String;

    if-eqz v2, :cond_15

    iget-object v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->yelpId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    goto :goto_8

    :cond_15
    iget-object v2, p1, Lcom/microblink/internal/merchant/MerchantResult;->yelpId:Ljava/lang/String;

    if-eqz v2, :cond_16

    :goto_8
    return v1

    :cond_16
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->googleVicinity:Ljava/lang/String;

    if-eqz v2, :cond_17

    iget-object v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->googleVicinity:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_18

    goto :goto_9

    :cond_17
    iget-object v2, p1, Lcom/microblink/internal/merchant/MerchantResult;->googleVicinity:Ljava/lang/String;

    if-eqz v2, :cond_18

    :goto_9
    return v1

    :cond_18
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->googlePlaceId:Ljava/lang/String;

    if-eqz v2, :cond_19

    iget-object v3, p1, Lcom/microblink/internal/merchant/MerchantResult;->googlePlaceId:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    goto :goto_a

    :cond_19
    iget-object v2, p1, Lcom/microblink/internal/merchant/MerchantResult;->googlePlaceId:Ljava/lang/String;

    if-eqz v2, :cond_1a

    :goto_a
    return v1

    :cond_1a
    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->googleFormattedAddress:Ljava/lang/String;

    if-eqz v2, :cond_1b

    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantResult;->googleFormattedAddress:Ljava/lang/String;

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1b
    iget-object p1, p1, Lcom/microblink/internal/merchant/MerchantResult;->googleFormattedAddress:Ljava/lang/String;

    if-nez p1, :cond_1c

    return v0

    :cond_1c
    :goto_b
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->street:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->city:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->state:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->zip:Ljava/lang/String;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_4

    :cond_4
    const/4 v2, 0x0

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->country:Ljava/lang/String;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_5

    :cond_5
    const/4 v2, 0x0

    :goto_5
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->storeNumber:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->bannerId:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->catTypes:Ljava/util/ArrayList;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/util/ArrayList;->hashCode()I

    move-result v2

    goto :goto_6

    :cond_6
    const/4 v2, 0x0

    :goto_6
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->mallName:Ljava/lang/String;

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_7

    :cond_7
    const/4 v2, 0x0

    :goto_7
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->yelpId:Ljava/lang/String;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_8

    :cond_8
    const/4 v2, 0x0

    :goto_8
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->googleVicinity:Ljava/lang/String;

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_9

    :cond_9
    const/4 v2, 0x0

    :goto_9
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->googlePlaceId:Ljava/lang/String;

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_a

    :cond_a
    const/4 v2, 0x0

    :goto_a
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->googleFormattedAddress:Ljava/lang/String;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_b
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/microblink/internal/merchant/MerchantResult;->rawMatch:Z

    add-int/2addr v0, v1

    return v0
.end method

.method public merchantSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/microblink/internal/merchant/MerchantResult;->merchantSource:Ljava/lang/String;

    return-object v0
.end method

.method public setSource(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/microblink/internal/merchant/MerchantResult;->merchantSource:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MerchantResult{name=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/microblink/internal/merchant/MerchantResult;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", street=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->street:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", city=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->city:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", state=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->state:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", zip=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->zip:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", country=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->country:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", storeNumber="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->storeNumber:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", bannerId="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->bannerId:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", catTypes="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->catTypes:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", mallName=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->mallName:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", yelpId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->yelpId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", googleVicinity=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->googleVicinity:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", googlePlaceId=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->googlePlaceId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v2, ", googleFormattedAddress=\'"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lcom/microblink/internal/merchant/MerchantResult;->googleFormattedAddress:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v1, ", rawMatch="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/microblink/internal/merchant/MerchantResult;->rawMatch:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
