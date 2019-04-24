.class public final Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;
.super Ljava/lang/Object;
.source "RetailerLocationsMapView_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/view/map/RetailerLocationsMapView;",
        ">;"
    }
.end annotation


# instance fields
.field private final hardwareProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;"
        }
    .end annotation
.end field

.field private final permissionsHelperFactoryProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
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
.method public constructor <init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->userStateProvider:Ljavax/inject/Provider;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->hardwareProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->permissionsHelperFactoryProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/hardware/Hardware;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/permissions/PermissionsHelperFactory;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/view/map/RetailerLocationsMapView;",
            ">;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectHardware(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/hardware/Hardware;)V
    .locals 0

    .line 51
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->hardware:Lcom/ibotta/android/hardware/Hardware;

    return-void
.end method

.method public static injectPermissionsHelperFactory(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->permissionsHelperFactory:Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    return-void
.end method

.method public static injectUserState(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->userStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->injectUserState(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/state/user/UserState;)V

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->hardwareProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/hardware/Hardware;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->injectHardware(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/hardware/Hardware;)V

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->permissionsHelperFactoryProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/permissions/PermissionsHelperFactory;

    invoke-static {p1, v0}, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->injectPermissionsHelperFactory(Lcom/ibotta/android/view/map/RetailerLocationsMapView;Lcom/ibotta/android/permissions/PermissionsHelperFactory;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/view/map/RetailerLocationsMapView;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/view/map/RetailerLocationsMapView_MembersInjector;->injectMembers(Lcom/ibotta/android/view/map/RetailerLocationsMapView;)V

    return-void
.end method
