.class Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent$com_ibotta_android_di_MainComponent_getFeatureFlagResponseUtil;
.super Ljava/lang/Object;
.source "DaggerDebugFeatureFlagsComponent.java"

# interfaces
.implements Ljavax/inject/Provider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "com_ibotta_android_di_MainComponent_getFeatureFlagResponseUtil"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljavax/inject/Provider<",
        "Lcom/ibotta/android/features/FeatureFlagResponseUtil;",
        ">;"
    }
.end annotation


# instance fields
.field private final mainComponent:Lcom/ibotta/android/di/MainComponent;


# direct methods
.method constructor <init>(Lcom/ibotta/android/di/MainComponent;)V
    .locals 0

    .line 282
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 283
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent$com_ibotta_android_di_MainComponent_getFeatureFlagResponseUtil;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    return-void
.end method


# virtual methods
.method public get()Lcom/ibotta/android/features/FeatureFlagResponseUtil;
    .locals 2

    .line 288
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent$com_ibotta_android_di_MainComponent_getFeatureFlagResponseUtil;->mainComponent:Lcom/ibotta/android/di/MainComponent;

    .line 289
    invoke-interface {v0}, Lcom/ibotta/android/di/MainComponent;->getFeatureFlagResponseUtil()Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    move-result-object v0

    const-string v1, "Cannot return null from a non-@Nullable component method"

    .line 288
    invoke-static {v0, v1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 278
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/debug/feature/DaggerDebugFeatureFlagsComponent$com_ibotta_android_di_MainComponent_getFeatureFlagResponseUtil;->get()Lcom/ibotta/android/features/FeatureFlagResponseUtil;

    move-result-object v0

    return-object v0
.end method
