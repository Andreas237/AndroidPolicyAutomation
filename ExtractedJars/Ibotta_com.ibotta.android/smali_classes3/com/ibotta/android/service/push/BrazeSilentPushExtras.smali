.class public abstract Lcom/ibotta/android/service/push/BrazeSilentPushExtras;
.super Ljava/lang/Object;
.source "BrazeSilentPushExtras.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    as = Lcom/ibotta/android/service/push/BrazeSilentPushExtras;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;
    }
.end annotation


# static fields
.field private static EMPTY:Lcom/ibotta/android/service/push/BrazeSilentPushExtras;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 19
    invoke-static {}, Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;->builder()Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;

    move-result-object v0

    const-string v1, ""

    .line 20
    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;->campaignName(Ljava/lang/String;)Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 21
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;->isServerEventStr(Ljava/lang/String;)Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;

    move-result-object v0

    .line 22
    invoke-virtual {v0}, Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;->build()Lcom/ibotta/android/service/push/BrazeSilentPushExtras;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;->EMPTY:Lcom/ibotta/android/service/push/BrazeSilentPushExtras;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create(Landroid/content/Intent;)Lcom/ibotta/android/service/push/BrazeSilentPushExtras;
    .locals 2

    .line 38
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_0

    .line 39
    sget-object p0, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;->EMPTY:Lcom/ibotta/android/service/push/BrazeSilentPushExtras;

    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "extra"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 42
    sget-object v0, Lcom/ibotta/android/json/IbottaJsonFactory;->INSTANCE:Lcom/ibotta/android/json/IbottaJsonFactory;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Lcom/ibotta/android/json/IbottaJsonFactory;->getInstance(ZZ)Lcom/ibotta/android/json/IbottaJson;

    move-result-object v0

    if-nez p0, :cond_1

    .line 45
    sget-object p0, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;->EMPTY:Lcom/ibotta/android/service/push/BrazeSilentPushExtras;

    goto :goto_0

    .line 48
    :cond_1
    :try_start_0
    const-class v1, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;

    invoke-interface {v0, p0, v1}, Lcom/ibotta/android/json/IbottaJson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;
    :try_end_0
    .catch Lcom/ibotta/android/json/IbottaJsonException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 51
    :catch_0
    sget-object p0, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;->EMPTY:Lcom/ibotta/android/service/push/BrazeSilentPushExtras;

    :goto_0
    return-object p0
.end method


# virtual methods
.method public abstract getCampaignName()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "CAMPAIGN_NAME"
    .end annotation
.end method

.method public abstract getIsServerEventStr()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "IS_SERVER_EVENT"
    .end annotation
.end method

.method public isEmpty()Z
    .locals 1

    .line 32
    sget-object v0, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;->EMPTY:Lcom/ibotta/android/service/push/BrazeSilentPushExtras;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public isServerEvent()Z
    .locals 1

    .line 28
    invoke-virtual {p0}, Lcom/ibotta/android/service/push/BrazeSilentPushExtras;->getIsServerEventStr()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method
