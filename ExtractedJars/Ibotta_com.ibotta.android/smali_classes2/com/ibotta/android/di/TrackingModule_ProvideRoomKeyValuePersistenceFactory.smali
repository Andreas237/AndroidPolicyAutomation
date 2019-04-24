.class public final Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;
.super Ljava/lang/Object;
.source "TrackingModule_ProvideRoomKeyValuePersistenceFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
        "Lcom/ibotta/tracking/generated/model/Body;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final trackingDaoProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;",
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
            "Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;",
            ">;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;->trackingDaoProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;",
            ">;)",
            "Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;"
        }
    .end annotation

    .line 36
    new-instance v0, Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;

    invoke-direct {v0, p0}, Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;-><init>(Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation

    .line 31
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;

    invoke-static {p0}, Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;->proxyProvideRoomKeyValuePersistence(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;)Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideRoomKeyValuePersistence(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;)Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;",
            ")",
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation

    .line 42
    invoke-static {p0}, Lcom/ibotta/android/di/TrackingModule;->provideRoomKeyValuePersistence(Lcom/ibotta/android/tracking/proprietary/persistence/room/TrackingDao;)Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    move-result-object p0

    const-string v0, "Cannot return null from a non-@Nullable @Provides method"

    .line 41
    invoke-static {p0, v0}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence<",
            "Lcom/ibotta/tracking/generated/model/Body;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;->trackingDaoProvider:Ljavax/inject/Provider;

    invoke-static {v0}, Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;->provideInstance(Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 11
    invoke-virtual {p0}, Lcom/ibotta/android/di/TrackingModule_ProvideRoomKeyValuePersistenceFactory;->get()Lcom/ibotta/android/tracking/proprietary/persistence/KeyValuePersistence;

    move-result-object v0

    return-object v0
.end method
