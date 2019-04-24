.class public final Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;
.super Ljava/lang/Object;
.source "PwiOnboardingModule_ProvidePwiOnboardingReducerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/pwi/PwiOnboardingReducer;",
        ">;"
    }
.end annotation


# instance fields
.field private final module:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;

.field private final resourcesProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;

    .line 23
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;)Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;"
        }
    .end annotation

    .line 38
    new-instance v0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;

    invoke-direct {v0, p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;-><init>(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;)Lcom/ibotta/android/pwi/PwiOnboardingReducer;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;",
            "Ljavax/inject/Provider<",
            "Landroid/content/res/Resources;",
            ">;)",
            "Lcom/ibotta/android/pwi/PwiOnboardingReducer;"
        }
    .end annotation

    .line 33
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/res/Resources;

    invoke-static {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;->proxyProvidePwiOnboardingReducer(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Landroid/content/res/Resources;)Lcom/ibotta/android/pwi/PwiOnboardingReducer;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvidePwiOnboardingReducer(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Landroid/content/res/Resources;)Lcom/ibotta/android/pwi/PwiOnboardingReducer;
    .locals 0

    .line 44
    invoke-virtual {p0, p1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;->providePwiOnboardingReducer(Landroid/content/res/Resources;)Lcom/ibotta/android/pwi/PwiOnboardingReducer;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 43
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/pwi/PwiOnboardingReducer;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/pwi/PwiOnboardingReducer;
    .locals 2

    .line 28
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;->module:Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;->resourcesProvider:Ljavax/inject/Provider;

    invoke-static {v0, v1}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;->provideInstance(Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule;Ljavax/inject/Provider;)Lcom/ibotta/android/pwi/PwiOnboardingReducer;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/activity/pwi/onboarding/PwiOnboardingModule_ProvidePwiOnboardingReducerFactory;->get()Lcom/ibotta/android/pwi/PwiOnboardingReducer;

    move-result-object v0

    return-object v0
.end method
