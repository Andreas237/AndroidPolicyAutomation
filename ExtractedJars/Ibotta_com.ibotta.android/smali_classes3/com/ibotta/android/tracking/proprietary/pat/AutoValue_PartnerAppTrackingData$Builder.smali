.class final Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;
.super Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;
.source "AutoValue_PartnerAppTrackingData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private appId:Ljava/lang/String;

.field private installed:Ljava/lang/Boolean;

.field private name:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 80
    invoke-direct {p0}, Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public appId(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 95
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;->appId:Ljava/lang/String;

    return-object p0

    .line 93
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null appId"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public build()Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData;
    .locals 5

    const-string v0, ""

    .line 106
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;->name:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 107
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " name"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 109
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;->appId:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 110
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " appId"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 112
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;->installed:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    .line 113
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " installed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 115
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 118
    new-instance v0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;

    iget-object v1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;->name:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;->appId:Ljava/lang/String;

    iget-object v3, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;->installed:Ljava/lang/Boolean;

    .line 121
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData;-><init>(Ljava/lang/String;Ljava/lang/String;ZLcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$1;)V

    return-object v0

    .line 116
    :cond_3
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

.method public installed(Z)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;
    .locals 0

    .line 100
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;->installed:Ljava/lang/Boolean;

    return-object p0
.end method

.method public name(Ljava/lang/String;)Lcom/ibotta/android/tracking/proprietary/pat/PartnerAppTrackingData$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 87
    iput-object p1, p0, Lcom/ibotta/android/tracking/proprietary/pat/AutoValue_PartnerAppTrackingData$Builder;->name:Ljava/lang/String;

    return-object p0

    .line 85
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null name"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
