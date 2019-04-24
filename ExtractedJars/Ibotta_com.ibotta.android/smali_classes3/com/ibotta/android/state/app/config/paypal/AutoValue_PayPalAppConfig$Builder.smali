.class final Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$Builder;
.super Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;
.source "AutoValue_PayPalAppConfig.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private connectUrlPattern:Ljava/lang/String;

.field private enabled:Ljava/lang/Boolean;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 66
    invoke-direct {p0}, Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig;
    .locals 4

    const-string v0, ""

    .line 84
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$Builder;->enabled:Ljava/lang/Boolean;

    if-nez v1, :cond_0

    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " enabled"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 87
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$Builder;->connectUrlPattern:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 88
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " connectUrlPattern"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 90
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 93
    new-instance v0, Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig;

    iget-object v1, p0, Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$Builder;->enabled:Ljava/lang/Boolean;

    .line 94
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, p0, Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$Builder;->connectUrlPattern:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig;-><init>(ZLjava/lang/String;Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$1;)V

    return-object v0

    .line 91
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

.method public connectUrlPattern(Ljava/lang/String;)Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 78
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$Builder;->connectUrlPattern:Ljava/lang/String;

    return-object p0

    .line 76
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null connectUrlPattern"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public enabled(Z)Lcom/ibotta/android/state/app/config/paypal/PayPalAppConfig$Builder;
    .locals 0

    .line 70
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/android/state/app/config/paypal/AutoValue_PayPalAppConfig$Builder;->enabled:Ljava/lang/Boolean;

    return-object p0
.end method
