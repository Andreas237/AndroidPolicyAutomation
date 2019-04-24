.class public abstract Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;
.super Ljava/lang/Object;
.source "PayPalAppConfig.java"


# annotations
.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonDeserialize;
    builder = Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$Builder;
.end annotation

.annotation runtime Lcom/fasterxml/jackson/databind/annotation/JsonSerialize;
    as = Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;
.end annotation

.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;
    }
.end annotation


# static fields
.field public static DEFAULT:Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 17
    invoke-static {}, Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;->builder()Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;

    move-result-object v0

    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;->enabled(Z)Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;

    move-result-object v0

    const-string v1, "^http.*\\.ibotta\\.com/.*/paypal/accounts.*"

    .line 19
    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;->connectUrlPattern(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;

    move-result-object v0

    .line 20
    invoke-virtual {v0}, Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;->build()Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;

    move-result-object v0

    sput-object v0, Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;->DEFAULT:Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static builder()Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;
    .locals 2

    .line 23
    new-instance v0, Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$Builder;

    invoke-direct {v0}, Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$Builder;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$Builder;->enabled(Z)Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;->connectUrlPattern(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract getConnectUrlPattern()Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "connect_url_pattern"
    .end annotation
.end method

.method public abstract isEnabled()Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enabled"
    .end annotation
.end method
