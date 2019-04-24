.class public abstract Lcom/ibotta/api/model/im/CredentialIntegration$Builder;
.super Ljava/lang/Object;
.source "CredentialIntegration.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/im/CredentialIntegration;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/im/CredentialIntegration$Builder;
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
    .end annotation

    .line 27
    new-instance v0, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;-><init>()V

    const-string v1, ""

    .line 28
    invoke-virtual {v0, v1}, Lcom/ibotta/api/model/im/AutoValue_CredentialIntegration$Builder;->username(Ljava/lang/String;)Lcom/ibotta/api/model/im/CredentialIntegration$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/api/model/im/CredentialIntegration;
.end method

.method public abstract retailerId(I)Lcom/ibotta/api/model/im/CredentialIntegration$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "retailer_id"
    .end annotation
.end method

.method public abstract status(Ljava/lang/String;)Lcom/ibotta/api/model/im/CredentialIntegration$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation
.end method

.method public abstract username(Ljava/lang/String;)Lcom/ibotta/api/model/im/CredentialIntegration$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "username"
    .end annotation
.end method
