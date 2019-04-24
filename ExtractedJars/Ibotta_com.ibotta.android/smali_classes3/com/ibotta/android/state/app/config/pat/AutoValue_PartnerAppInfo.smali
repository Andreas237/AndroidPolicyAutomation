.class final Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;
.super Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo;
.source "AutoValue_PartnerAppInfo.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo$Builder;
    }
.end annotation


# instance fields
.field private final appId:Ljava/lang/String;

.field private final name:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 15
    invoke-direct {p0}, Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo;-><init>()V

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;->name:Ljava/lang/String;

    .line 17
    iput-object p2, p0, Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;->appId:Ljava/lang/String;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo$1;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    .line 45
    :cond_0
    instance-of v1, p1, Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 46
    check-cast p1, Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo;

    .line 47
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;->name:Ljava/lang/String;

    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;->appId:Ljava/lang/String;

    .line 48
    invoke-virtual {p1}, Lcom/ibotta/android/state/app/config/pat/PartnerAppInfo;->getAppId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

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
        value = "app_id"
    .end annotation

    .line 29
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;->appId:Ljava/lang/String;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "name"
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;->name:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 57
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;->name:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    .line 59
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;->appId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 34
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PartnerAppInfo{name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", appId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/pat/AutoValue_PartnerAppInfo;->appId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
