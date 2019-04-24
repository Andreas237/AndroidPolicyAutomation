.class public abstract Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;
.super Ljava/lang/Object;
.source "PayPalAppConfig.java"


# annotations
.annotation build Lcom/google/auto/value/AutoValue$Builder;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Builder"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract build()Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;
.end method

.method public abstract connectUrlPattern(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "connect_url_pattern"
    .end annotation
.end method

.method public abstract enabled(Z)Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enabled"
    .end annotation
.end method
