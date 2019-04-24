.class public final Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;
.super Ljava/lang/Object;
.source "TrackingModule_ProvideTrackingEventDatabaseFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;",
        ">;"
    }
.end annotation


# instance fields
.field private final contextProvider:Ljavax/inject/Provider;
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

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;->contextProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;"
        }
    .end annotation

    .line 33
    new-instance v0, Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Landroid/content/Context;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;"
        }
    .end annotation

    .line 28
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/content/Context;

    invoke-static {p0}, Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;->proxyProvideTrackingEventDatabase(Landroid/content/Context;)Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideTrackingEventDatabase(Landroid/content/Context;)Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;
    .locals 1

    .line 38
    invoke-static {p0}, Lcom/ibotta/android/di/TrackingModule;->provideTrackingEventDatabase(Landroid/content/Context;)Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 37
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;
    .locals 1

    .line 24
    iget-object v0, p0, Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;->contextProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 10
    invoke-virtual {p0}, Lcom/ibotta/android/di/TrackingModule_ProvideTrackingEventDatabaseFactory;->get()Lcom/ibotta/android/tracking/proprietary/persistence/room/IbottaTrackingDatabase;

    move-result-object v0

    return-object v0
.end method
