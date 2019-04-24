.class public final Lcom/ibotta/android/location/geofence/GeofenceModule;
.super Ljava/lang/Object;
.source "GeofenceModule.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0008@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u000c@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/ibotta/android/location/geofence/GeofenceModule;",
        "",
        "()V",
        "<set-?>",
        "Lcom/ibotta/android/state/app/debug/DebugState;",
        "debugState",
        "getDebugState",
        "()Lcom/ibotta/android/state/app/debug/DebugState;",
        "Lcom/ibotta/android/state/app/permissions/PermissionsState;",
        "permissionsState",
        "getPermissionsState",
        "()Lcom/ibotta/android/state/app/permissions/PermissionsState;",
        "Lcom/ibotta/android/state/user/UserState;",
        "userState",
        "getUserState",
        "()Lcom/ibotta/android/state/user/UserState;",
        "init",
        "",
        "ibotta-location_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/ibotta/android/location/geofence/GeofenceModule;

.field private static debugState:Lcom/ibotta/android/state/app/debug/DebugState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static userState:Lcom/ibotta/android/state/user/UserState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 7
    new-instance v0, Lcom/ibotta/android/location/geofence/GeofenceModule;

    invoke-direct {v0}, Lcom/ibotta/android/location/geofence/GeofenceModule;-><init>()V

    sput-object v0, Lcom/ibotta/android/location/geofence/GeofenceModule;->INSTANCE:Lcom/ibotta/android/location/geofence/GeofenceModule;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getDebugState()Lcom/ibotta/android/state/app/debug/DebugState;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 9
    sget-object v0, Lcom/ibotta/android/location/geofence/GeofenceModule;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    if-nez v0, :cond_0

    const-string v1, "debugState"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final getPermissionsState()Lcom/ibotta/android/state/app/permissions/PermissionsState;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 10
    sget-object v0, Lcom/ibotta/android/location/geofence/GeofenceModule;->permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

    if-nez v0, :cond_0

    const-string v1, "permissionsState"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final getUserState()Lcom/ibotta/android/state/user/UserState;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 11
    sget-object v0, Lcom/ibotta/android/location/geofence/GeofenceModule;->userState:Lcom/ibotta/android/state/user/UserState;

    if-nez v0, :cond_0

    const-string v1, "userState"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final init(Lcom/ibotta/android/state/app/debug/DebugState;Lcom/ibotta/android/state/app/permissions/PermissionsState;Lcom/ibotta/android/state/user/UserState;)V
    .locals 1
    .param p1    # Lcom/ibotta/android/state/app/debug/DebugState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/ibotta/android/state/app/permissions/PermissionsState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/ibotta/android/state/user/UserState;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "debugState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionsState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    sput-object p1, Lcom/ibotta/android/location/geofence/GeofenceModule;->debugState:Lcom/ibotta/android/state/app/debug/DebugState;

    .line 15
    sput-object p2, Lcom/ibotta/android/location/geofence/GeofenceModule;->permissionsState:Lcom/ibotta/android/state/app/permissions/PermissionsState;

    .line 16
    sput-object p3, Lcom/ibotta/android/location/geofence/GeofenceModule;->userState:Lcom/ibotta/android/state/user/UserState;

    return-void
.end method
