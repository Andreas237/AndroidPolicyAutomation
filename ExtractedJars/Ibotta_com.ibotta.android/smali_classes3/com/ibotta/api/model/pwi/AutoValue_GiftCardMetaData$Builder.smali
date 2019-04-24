.class final Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;
.super Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
.source "AutoValue_GiftCardMetaData.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private cardNumber:Ljava/lang/String;

.field private imageUrl:Ljava/lang/String;

.field private pin:Ljava/lang/String;

.field private termsAndConditions:Ljava/lang/String;

.field private usageInstructions:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 113
    invoke-direct {p0}, Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/api/model/pwi/GiftCardMetaData;
    .locals 9

    const-string v0, ""

    .line 149
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->cardNumber:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 150
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " cardNumber"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 152
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->termsAndConditions:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 153
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " termsAndConditions"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 155
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 158
    new-instance v0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;

    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->cardNumber:Ljava/lang/String;

    iget-object v4, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->pin:Ljava/lang/String;

    iget-object v5, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->imageUrl:Ljava/lang/String;

    iget-object v6, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->termsAndConditions:Ljava/lang/String;

    iget-object v7, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->usageInstructions:Ljava/lang/String;

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$1;)V

    return-object v0

    .line 156
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

.method public cardNumber(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 120
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->cardNumber:Ljava/lang/String;

    return-object p0

    .line 118
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null cardNumber"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public imageUrl(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 130
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->imageUrl:Ljava/lang/String;

    return-object p0
.end method

.method public pin(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 125
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->pin:Ljava/lang/String;

    return-object p0
.end method

.method public termsAndConditions(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 138
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->termsAndConditions:Ljava/lang/String;

    return-object p0

    .line 136
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null termsAndConditions"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public usageInstructions(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 143
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;->usageInstructions:Ljava/lang/String;

    return-object p0
.end method
