.class Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent$com_ibotta_android_di_MainComponent_getVariantFactory;
.super Ljava/lang/Object;
.source "DaggerPwiCardInputComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getVariantFactory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/features/factory/VariantFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 411
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 412
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent$com_ibotta_android_di_MainComponent_getVariantFactory;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/features/factory/VariantFactory;
    .locals 2

    .line 417
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent$com_ibotta_android_di_MainComponent_getVariantFactory;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 418
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getVariantFactory()Lcom/ibotta/android/features/factory/VariantFactory;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 417
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/factory/VariantFactory;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 407
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/v2/card/DaggerPwiCardInputComponent$com_ibotta_android_di_MainComponent_getVariantFactory;->get()Lcom/ibotta/android/features/factory/VariantFactory;

    move-result-object v0

    return-object v0
.end method
