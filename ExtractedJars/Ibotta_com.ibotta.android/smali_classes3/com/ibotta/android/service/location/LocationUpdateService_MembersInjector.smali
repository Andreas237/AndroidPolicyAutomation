.class public final Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;
.super Ljava/lang/Object;
.source "LocationUpdateService_MembersInjector.java"

# interfaces
.implements Ldagger/MembersInjector;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ldagger/MembersInjector<",
        "Lcom/ibotta/android/service/location/LocationUpdateService;",
        ">;"
    }
.end annotation


# instance fields
.field private final appHelperProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;"
        }
    .end annotation
.end field

.field private final permissionsStateProvider:Ljavax/inject/Provider;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/permissions/PermissionsState;",
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
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/permissions/PermissionsState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)V"
        }
    .end annotation

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    .line 27
    iput-object p2, p0, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->permissionsStateProvider:Ljavax/inject/Provider;

    .line 28
    iput-object p3, p0, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->userStateProvider:Ljavax/inject/Provider;

    return-void
.end method

.method public static create(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)Ldagger/MembersInjector;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/util/AppHelper;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/app/permissions/PermissionsState;",
            ">;",
            "Ljavax/inject/Provider<",
            "Lcom/ibotta/android/state/user/UserState;",
            ">;)",
            "Ldagger/MembersInjector<",
            "Lcom/ibotta/android/service/location/LocationUpdateService;",
            ">;"
        }
    .end annotation

    .line 35
    new-instance v0, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;

    invoke-direct {v0, p0, p1, p2}, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;-><init>(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljavax/inject/Provider;)V

    return-object v0
.end method

.method public static injectAppHelper(Lcom/ibotta/android/service/location/LocationUpdateService;Lcom/ibotta/android/util/AppHelper;)V
    .locals 0

    .line 47
    iput-object p1, p0, Lcom/ibotta/android/service/location/LocationUpdateService;->appHelper:Lcom/ibotta/android/util/AppHelper;

    return-void
.end method

.method public static injectPermissionsState(Lcom/ibotta/android/service/location/LocationUpdateService;Lcom/ibotta/android/state/app/permissions/PermissionsState;)V
    .locals 0

    .line 52
    iput-object p1, p0, Lcom/ibotta/android/service/location/LocationUpdateService;->permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

    return-void
.end method

.method public static injectUserState(Lcom/ibotta/android/service/location/LocationUpdateService;Lcom/ibotta/android/state/user/UserState;)V
    .locals 0

    .line 56
    iput-object p1, p0, Lcom/ibotta/android/service/location/LocationUpdateService;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method


# virtual methods
.method public injectMembers(Lcom/ibotta/android/service/location/LocationUpdateService;)V
    .locals 1

    .line 41
    iget-object v0, p0, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->appHelperProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/util/AppHelper;

    invoke-static {p1, v0}, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->injectAppHelper(Lcom/ibotta/android/service/location/LocationUpdateService;Lcom/ibotta/android/util/AppHelper;)V

    .line 42
    iget-object v0, p0, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->permissionsStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/app/permissions/PermissionsState;

    invoke-static {p1, v0}, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->injectPermissionsState(Lcom/ibotta/android/service/location/LocationUpdateService;Lcom/ibotta/android/state/app/permissions/PermissionsState;)V

    .line 43
    iget-object v0, p0, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->userStateProvider:Ljavax/inject/Provider;

    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/state/user/UserState;

    invoke-static {p1, v0}, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->injectUserState(Lcom/ibotta/android/service/location/LocationUpdateService;Lcom/ibotta/android/state/user/UserState;)V

    return-void
.end method

.method public bridge synthetic injectMembers(Ljava/lang/Object;)V
    .locals 0

    .line 10
    check-cast p1, Lcom/ibotta/android/service/location/LocationUpdateService;

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/location/LocationUpdateService_MembersInjector;->injectMembers(Lcom/ibotta/android/service/location/LocationUpdateService;)V

    return-void
.end method
