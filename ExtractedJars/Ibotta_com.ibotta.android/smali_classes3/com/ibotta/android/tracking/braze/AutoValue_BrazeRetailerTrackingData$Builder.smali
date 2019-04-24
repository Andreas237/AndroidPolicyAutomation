.class final Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;
.super Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
.source "AutoValue_BrazeRetailerTrackingData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private auxiliaryLoyaltyEnabled:Ljava/lang/Boolean;

.field private id:Ljava/lang/Integer;

.field private name:Ljava/lang/String;

.field private shortDescription:Ljava/lang/String;

.field private verificationTypeApiName:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 106
    invoke-direct {p0}, Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public auxiliaryLoyaltyEnabled(Z)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
    .locals 0

    .line 120
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->auxiliaryLoyaltyEnabled:Ljava/lang/Boolean;

    return-object p0
.end method

.method public build()Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData;
    .locals 9

    const-string v0, ""

    .line 136
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->id:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " id"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 139
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->auxiliaryLoyaltyEnabled:Ljava/lang/Boolean;

    if-nez v1, :cond_1

    .line 140
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " auxiliaryLoyaltyEnabled"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 142
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 145
    new-instance v0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->id:Ljava/lang/Integer;

    .line 146
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->name:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->auxiliaryLoyaltyEnabled:Ljava/lang/Boolean;

    .line 148
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iget-object v6, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->verificationTypeApiName:Ljava/lang/String;

    iget-object v7, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->shortDescription:Ljava/lang/String;

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData;-><init>(ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$1;)V

    return-object v0

    .line 143
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public id(I)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
    .locals 0

    .line 110
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->id:Ljava/lang/Integer;

    return-object p0
.end method

.method public name(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 115
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public shortDescription(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 130
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->shortDescription:Ljava/lang/String;

    return-object p0
.end method

.method public verificationTypeApiName(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeRetailerTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 125
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeRetailerTrackingData$Builder;->verificationTypeApiName:Ljava/lang/String;

    return-object p0
.end method
