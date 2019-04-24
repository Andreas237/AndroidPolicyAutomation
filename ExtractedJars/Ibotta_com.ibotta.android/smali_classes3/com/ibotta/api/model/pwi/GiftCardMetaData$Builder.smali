.class public abstract Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
.super Ljava/lang/Object;
.source "GiftCardMetaData.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/pwi/GiftCardMetaData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .line 26
    new-instance v0, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/pwi/AutoValue_GiftCardMetaData$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/api/model/pwi/GiftCardMetaData;
.end method

.method public abstract cardNumber(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "card_number"
    .end annotation
.end method

.method public abstract imageUrl(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "image_url"
    .end annotation
.end method

.method public abstract pin(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "pin"
    .end annotation
.end method

.method public abstract termsAndConditions(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "terms_and_conditions"
    .end annotation
.end method

.method public abstract usageInstructions(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/GiftCardMetaData$Builder;
    .param p1    # Ljava/lang/String;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "usage_instructions"
    .end annotation
.end method
