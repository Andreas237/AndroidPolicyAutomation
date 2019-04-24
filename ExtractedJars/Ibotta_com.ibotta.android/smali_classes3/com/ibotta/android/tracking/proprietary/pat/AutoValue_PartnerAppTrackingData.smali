.class final Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;
.super Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;
.source "AutoValue_PartnerAppTrackingData.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;
    }
.end annotation


# instance fields
.field private final appId:Ljava/lang/String;

.field private final installed:Z

.field private final name:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->name:Ljava/lang/String;

    .line 19
    iput-object p2, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->appId:Ljava/lang/String;

    .line 20
    iput-boolean p3, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->installed:Z

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$1;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p3}, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 55
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 56
    check-cast p1, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;

    .line 57
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->name:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->appId:Ljava/lang/String;

    .line 58
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;->getAppId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->installed:Z

    .line 59
    invoke-virtual {p1}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;->isInstalled()Z

    move-result p1

    if-ne v1, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public getAppId()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "appId"
    .end annotation

    .line 32
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "name"
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    .line 68
    iget-object v0, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 70
    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->appId:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    .line 72
    iget-boolean v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->installed:Z

    if-eqz v1, :cond_0

    const/16 v1, 0x4cf

    goto :goto_0

    :cond_0
    const/16 v1, 0x4d5

    :goto_0
    xor-int/2addr v0, v1

    return v0
.end method

.method public isInstalled()Z
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "installed"
    .end annotation

    .line 38
    iget-boolean v0, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->installed:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 43
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PartnerAppTrackingData{name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", appId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->appId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", installed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;->installed:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
