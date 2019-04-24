.class public final Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;
.super Ljava/lang/Object;
.source "TrackingModule_ProvideEventBodyFactoryFactory.java"

# interfaces
.implements Ldagger/internal/Factory;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/internal/Factory<",
        "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;",
        ">;"
    }
.end annotation


# instance fields
.field private final buildProfileProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;"
        }
    .end annotation
.end field

.field private final deviceSecurityProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;"
        }
    .end annotation
.end field

.field private final eventIdCounterProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ">;"
        }
    .end annotation
.end field

.field private final googleStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/google/GoogleState;",
            ">;"
        }
    .end annotation
.end field

.field private final hardwareProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;"
        }
    .end annotation
.end field

.field private final sessionStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/session/SessionState;",
            ">;"
        }
    .end annotation
.end field

.field private final telephonyManagerProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Landroid/telephony/TelephonyManager;",
            ">;"
        }
    .end annotation
.end field

.field private final userStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/session/SessionState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/google/GoogleState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/telephony/TelephonyManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ">;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->userStateProvider:Ljavax/inject/Provider;

    .line 49
    iput-object p2, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->sessionStateProvider:Ljavax/inject/Provider;

    .line 50
    iput-object p3, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->deviceSecurityProvider:Ljavax/inject/Provider;

    .line 51
    iput-object p4, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->hardwareProvider:Ljavax/inject/Provider;

    .line 52
    iput-object p5, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    .line 53
    iput-object p6, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->googleStateProvider:Ljavax/inject/Provider;

    .line 54
    iput-object p7, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->telephonyManagerProvider:Ljavax/inject/Provider;

    .line 55
    iput-object p8, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->eventIdCounterProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/session/SessionState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/google/GoogleState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/telephony/TelephonyManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ">;)",
            "Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;"
        }
    .end annotation

    .line 100
    new-instance v9, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v9
.end method

.method public static provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/session/SessionState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/security/DeviceSecurity;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/profile/BuildProfile;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/google/GoogleState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Landroid/telephony/TelephonyManager;",
            ">;",
            "Ljavax/inject/Provider<",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ">;)",
            "Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;"
        }
    .end annotation

    .line 81
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    .line 82
    invoke-interface {p1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/ibotta/android/state/session/SessionState;

    .line 83
    invoke-interface {p2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v2, p0

    check-cast v2, Lcom/ibotta/android/security/DeviceSecurity;

    .line 84
    invoke-interface {p3}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v3, p0

    check-cast v3, Lcom/ibotta/android/hardware/Hardware;

    .line 85
    invoke-interface {p4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v4, p0

    check-cast v4, Lcom/ibotta/android/profile/BuildProfile;

    .line 86
    invoke-interface {p5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v5, p0

    check-cast v5, Lcom/ibotta/android/state/app/google/GoogleState;

    .line 87
    invoke-interface {p6}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v6, p0

    check-cast v6, Landroid/telephony/TelephonyManager;

    .line 88
    invoke-interface {p7}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v7, p0

    check-cast v7, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 80
    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->proxyProvideEventBodyFactory(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/session/SessionState;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/google/GoogleState;Landroid/telephony/TelephonyManager;Ljava/util/concurrent/atomic/AtomicInteger;)Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    move-result-object p0

    return-object p0
.end method

.method public static proxyProvideEventBodyFactory(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/session/SessionState;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/google/GoogleState;Landroid/telephony/TelephonyManager;Ljava/util/concurrent/atomic/AtomicInteger;)Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;
    .locals 0

    .line 121
    invoke-static/range {p0 .. p7}, Lcom/ibotta/android/di/TrackingModule;->provideEventBodyFactory(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/state/session/SessionState;Lcom/ibotta/android/security/DeviceSecurity;Lcom/ibotta/android/hardware/Hardware;Lcom/ibotta/android/profile/BuildProfile;Lcom/ibotta/android/state/app/google/GoogleState;Landroid/telephony/TelephonyManager;Ljava/util/concurrent/atomic/AtomicInteger;)Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    move-result-object p0

    const-string p1, "Cannot return null from a non-@Nullable @Provides method"

    .line 120
    invoke-static {p0, p1}, Ldagger/internal/Preconditions;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    return-object p0
.end method


# virtual methods
.method public get()Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;
    .locals 8

    .line 60
    iget-object v0, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->userStateProvider:Ljavax/inject/Provider;

    iget-object v1, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->sessionStateProvider:Ljavax/inject/Provider;

    iget-object v2, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->deviceSecurityProvider:Ljavax/inject/Provider;

    iget-object v3, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->hardwareProvider:Ljavax/inject/Provider;

    iget-object v4, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->buildProfileProvider:Ljavax/inject/Provider;

    iget-object v5, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->googleStateProvider:Ljavax/inject/Provider;

    iget-object v6, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->telephonyManagerProvider:Ljavax/inject/Provider;

    iget-object v7, p0, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->eventIdCounterProvider:Ljavax/inject/Provider;

    invoke-static/range {v0 .. v7}, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->provideInstance(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 17
    invoke-virtual {p0}, Lcom/ibotta/android/di/TrackingModule_ProvideEventBodyFactoryFactory;->get()Lcom/ibotta/android/tracking/proprietary/event/factory/EventBodyFactory;

    move-result-object v0

    return-object v0
.end method
