.class public abstract Lcom/ibotta/api/model/im/CredentialIntegration;
.super Ljava/lang/Object;
.source "CredentialIntegration.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/api/model/im/CredentialIntegration$Builder;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    as = Lcom/ibotta/api/model/im/CredentialIntegration;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/im/CredentialIntegration$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getRetailerId()I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "retailer_id"
    .end annotation
.end method

.method public abstract getStatus()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "status"
    .end annotation
.end method

.method public getStatusEnum()Lcom/ibotta/api/model/im/ImConnectionStatus;
    .locals 1

    .line 20
    invoke-virtual {p0}, Lcom/ibotta/api/model/im/CredentialIntegration;->getStatus()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/ibotta/api/model/im/ImConnectionStatus;->fromApiName(Ljava/lang/String;)Lcom/ibotta/api/model/im/ImConnectionStatus;

    move-result-object v0

    return-object v0
.end method

.method public abstract getUsername()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "username"
    .end annotation
.end method
