.class public Lcom/ibotta/api/model/retailer/OnboardingRetailer;
.super Ljava/lang/Object;
.source "OnboardingRetailer.java"


# instance fields
.field private description:Ljava/lang/String;

.field private id:I

.field private modelCImageUrl:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "model_c_retailer_image"
    .end annotation
.end field

.field private name:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .line 21
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->description:Ljava/lang/String;

    return-object v0
.end method

.method public getId()I
    .locals 1

    .line 13
    iget v0, p0, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->id:I

    return v0
.end method

.method public getModelCImageUrl()Ljava/lang/String;
    .locals 1

    .line 25
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->modelCImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 17
    iget-object v0, p0, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->name:Ljava/lang/String;

    return-object v0
.end method

.method public setDescription(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->description:Ljava/lang/String;

    return-void
.end method

.method public setId(I)V
    .locals 0

    .line 29
    iput p1, p0, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->id:I

    return-void
.end method

.method public setModelCImageUrl(Ljava/lang/String;)V
    .locals 0

    .line 41
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->modelCImageUrl:Ljava/lang/String;

    return-void
.end method

.method public setName(Ljava/lang/String;)V
    .locals 0

    .line 33
    iput-object p1, p0, Lcom/ibotta/api/model/retailer/OnboardingRetailer;->name:Ljava/lang/String;

    return-void
.end method
