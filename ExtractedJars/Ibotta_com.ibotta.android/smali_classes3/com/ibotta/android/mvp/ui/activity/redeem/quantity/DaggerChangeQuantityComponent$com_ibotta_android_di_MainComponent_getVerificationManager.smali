.class Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVerificationManager;
.super Ljava/lang/Object;
.source "DaggerChangeQuantityComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getVerificationManager"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/verification/VerificationManager;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 258
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 259
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVerificationManager;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/verification/VerificationManager;
    .locals 2

    .line 264
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVerificationManager;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 265
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getVerificationManager()Lcom/ibotta/android/verification/VerificationManager;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 264
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/verification/VerificationManager;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 254
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/redeem/quantity/DaggerChangeQuantityComponent$com_ibotta_android_di_MainComponent_getVerificationManager;->get()Lcom/ibotta/android/verification/VerificationManager;

    move-result-object v0

    return-object v0
.end method
