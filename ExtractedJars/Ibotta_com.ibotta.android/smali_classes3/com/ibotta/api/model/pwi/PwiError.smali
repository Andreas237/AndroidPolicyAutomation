.class public abstract Lcom/ibotta/api/model/pwi/PwiError;
.super Ljava/lang/Object;
.source "PwiError.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    as = Lcom/ibotta/api/model/pwi/PwiError;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/model/pwi/PwiError$Builder;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/api/model/pwi/PwiError$Builder;
    .locals 1

    .line 21
    new-instance v0, Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;

    invoke-direct {v0}, Lcom/ibotta/api/model/pwi/AutoValue_PwiError$Builder;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract getBody()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "body"
    .end annotation
.end method

.method public abstract getCode()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "code"
    .end annotation
.end method

.method public abstract getTitle()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "title"
    .end annotation
.end method
