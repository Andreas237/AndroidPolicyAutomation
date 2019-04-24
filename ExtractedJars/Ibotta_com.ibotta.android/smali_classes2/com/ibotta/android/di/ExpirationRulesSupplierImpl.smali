.class public Lcom/ibotta/android/di/ExpirationRulesSupplierImpl;
.super Ljava/lang/Object;
.source "ExpirationRulesSupplierImpl.java"

# interfaces
.implements Lcom/ibotta/android/util/ExpirationRulesSupplier;


# instance fields
.field private final appConfig:Lcom/ibotta/android/state/app/config/AppConfig;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/app/config/AppConfig;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lcom/ibotta/android/di/ExpirationRulesSupplierImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    return-void
.end method


# virtual methods
.method public getExpirationDateFormat()Ljava/lang/String;
    .locals 1

    .line 15
    iget-object v0, p0, Lcom/ibotta/android/di/ExpirationRulesSupplierImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getExpirationDateFormat()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getExpiringThresholdHours()I
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/di/ExpirationRulesSupplierImpl;->appConfig:Lcom/ibotta/android/state/app/config/AppConfig;

    invoke-interface {v0}, Lcom/ibotta/android/state/app/config/AppConfig;->getExpiringThresholdHours()I

    move-result v0

    return v0
.end method
