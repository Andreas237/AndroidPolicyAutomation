.class public final Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;
.super Ljava/lang/Object;
.source "MiscModule_ProvideTrackerFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/Tracker;",
        ">;"
    }
.end annotation


# instance fields
.field private final appContextProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;->appContextProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;"
        }
    .end annotation

    .line 31
    new-instance v0, Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/Tracker;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/ibotta/android/tracking/Tracker;"
        }
    .end annotation

    .line 27
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;->proxyProvideTracker(Landroid/content/Context;)Lcom/ibotta/android/tracking/Tracker;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideTracker(Landroid/content/Context;)Lcom/ibotta/android/tracking/Tracker;
    .locals 1

    .line 36
    invoke-static {p0}, Lcom/ibotta/android/di/MiscModule;->provideTracker(Landroid/content/Context;)Lcom/ibotta/android/tracking/Tracker;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 35
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/Tracker;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/Tracker;
    .locals 1

    .line 23
    iget-object v0, p0, Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;->appContextProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/MiscModule_ProvideTrackerFactory;->get()Lcom/ibotta/android/tracking/Tracker;

    move-result-object v0

    return-object v0
.end method
