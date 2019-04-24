.class final Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;
.super Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
.source "AutoValue_BrazeBonusTrackingData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private amount:Ljava/lang/Float;

.field private description:Ljava/lang/String;

.field private details:Ljava/lang/String;

.field private expiration:Ljava/util/Date;

.field private featured:Ljava/lang/Boolean;

.field private id:Ljava/lang/Integer;

.field private name:Ljava/lang/String;

.field private otherReward:Ljava/lang/String;

.field private route:Ljava/lang/String;

.field private tokenUrl:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 176
    invoke-direct {p0}, Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public amount(F)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    .locals 0

    .line 190
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->amount:Ljava/lang/Float;

    return-object p0
.end method

.method public build()Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData;
    .locals 14

    const-string v0, ""

    .line 231
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->id:Ljava/lang/Integer;

    if-nez v1, :cond_0

    .line 232
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " id"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 234
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->amount:Ljava/lang/Float;

    if-nez v1, :cond_1

    .line 235
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " amount"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 237
    :cond_1
    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->featured:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    .line 238
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " featured"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 240
    :cond_2
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 243
    new-instance v0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->id:Ljava/lang/Integer;

    .line 244
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->name:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->amount:Ljava/lang/Float;

    .line 246
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v5

    iget-object v6, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->tokenUrl:Ljava/lang/String;

    iget-object v7, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->route:Ljava/lang/String;

    iget-object v8, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->description:Ljava/lang/String;

    iget-object v9, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->details:Ljava/lang/String;

    iget-object v10, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->expiration:Ljava/util/Date;

    iget-object v1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->featured:Ljava/lang/Boolean;

    .line 252
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    iget-object v12, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->otherReward:Ljava/lang/String;

    const/4 v13, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v13}, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData;-><init>(ILjava/lang/String;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;ZLjava/lang/String;Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$1;)V

    return-object v0

    .line 241
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

.method public description(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 205
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->description:Ljava/lang/String;

    return-object p0
.end method

.method public details(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 210
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->details:Ljava/lang/String;

    return-object p0
.end method

.method public expiration(Ljava/util/Date;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/util/Date;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 215
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->expiration:Ljava/util/Date;

    return-object p0
.end method

.method public featured(Z)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    .locals 0

    .line 220
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->featured:Ljava/lang/Boolean;

    return-object p0
.end method

.method public id(I)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    .locals 0

    .line 180
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->id:Ljava/lang/Integer;

    return-object p0
.end method

.method public name(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 185
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public otherReward(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 225
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->otherReward:Ljava/lang/String;

    return-object p0
.end method

.method public route(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 200
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->route:Ljava/lang/String;

    return-object p0
.end method

.method public tokenUrl(Ljava/lang/String;)Lcom/ibotta/android/tracking/braze/BrazeBonusTrackingData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 195
    iput-object p1, p0, Lcom/ibotta/android/tracking/braze/AutoValue_BrazeBonusTrackingData$Builder;->tokenUrl:Ljava/lang/String;

    return-object p0
.end method
