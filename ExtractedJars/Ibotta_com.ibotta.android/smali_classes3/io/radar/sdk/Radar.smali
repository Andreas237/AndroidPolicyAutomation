.class public final Lio/radar/sdk/Radar;
.super Ljava/lang/Object;
.source "Radar.kt"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "StaticFieldLeak"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/radar/sdk/Radar$RadarCallback;,
        Lio/radar/sdk/Radar$RadarStatus;,
        Lio/radar/sdk/Radar$RadarPlacesProvider;,
        Lio/radar/sdk/Radar$RadarTrackingPriority;,
        Lio/radar/sdk/Radar$RadarTrackingOffline;,
        Lio/radar/sdk/Radar$RadarTrackingSync;,
        Lio/radar/sdk/Radar$UserOptions;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nRadar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Radar.kt\nio/radar/sdk/Radar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,542:1\n1491#2,2:543\n*E\n*S KotlinDebug\n*F\n+ 1 Radar.kt\nio/radar/sdk/Radar\n*L\n529#1,2:543\n*E\n"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x2
    }
    d1 = {
        "\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u0007lmnopqrB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000e2\n\u0008\u0002\u0010=\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020@H\u0002J \u0010A\u001a\u00020;2\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010EH\u0002J\u001e\u0010F\u001a\u00020;2\u0014\u0010D\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010C\u0012\u0004\u0012\u00020;0GH\u0002J\u0015\u0010H\u001a\u00020;2\u0006\u0010B\u001a\u00020CH\u0000\u00a2\u0006\u0002\u0008IJ\u001b\u0010J\u001a\u00020;2\u000c\u0010K\u001a\u0008\u0012\u0004\u0012\u00020C0LH\u0000\u00a2\u0006\u0002\u0008MJ=\u0010N\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0004H\u0001\u00a2\u0006\u0002\u0008OJ\u0014\u0010P\u001a\u00020;2\n\u0008\u0002\u0010)\u001a\u0004\u0018\u00010\u000eH\u0007J\u0008\u0010Q\u001a\u00020\u0008H\u0007J\u0010\u0010R\u001a\u00020;2\u0006\u0010<\u001a\u00020\u000eH\u0007J\u0017\u0010S\u001a\u00020;2\u0008\u0008\u0002\u0010T\u001a\u00020\u0008H\u0000\u00a2\u0006\u0002\u0008UJ\u001b\u0010V\u001a\u00020;2\u000c\u0010W\u001a\u0008\u0012\u0004\u0012\u00020;0XH\u0000\u00a2\u0006\u0002\u0008YJ\u0010\u0010Z\u001a\u00020;2\u0006\u0010[\u001a\u00020\\H\u0002J\u0008\u0010]\u001a\u00020;H\u0007J\u0010\u0010]\u001a\u00020;2\u0006\u0010[\u001a\u00020\\H\u0007J\u0008\u0010^\u001a\u00020;H\u0007J%\u0010_\u001a\u00020;2\n\u0008\u0002\u0010B\u001a\u0004\u0018\u00010C2\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010EH\u0000\u00a2\u0006\u0002\u0008`Jt\u0010a\u001a\u00020;2l\u0010b\u001ah\u0012\u0013\u0012\u00110@\u00a2\u0006\u000c\u0008d\u0012\u0008\u0008e\u0012\u0004\u0008\u0008(?\u0012\u0015\u0012\u0013\u0018\u00010C\u00a2\u0006\u000c\u0008d\u0012\u0008\u0008e\u0012\u0004\u0008\u0008(B\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020g\u0018\u00010f\u00a2\u0006\u000c\u0008d\u0012\u0008\u0008e\u0012\u0004\u0008\u0008(h\u0012\u0015\u0012\u0013\u0018\u00010i\u00a2\u0006\u000c\u0008d\u0012\u0008\u0008e\u0012\u0004\u0008\u0008(j\u0012\u0004\u0012\u00020;0cJ\u0014\u0010a\u001a\u00020;2\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010EH\u0007J|\u0010k\u001a\u00020;2\u0006\u0010B\u001a\u00020C2l\u0010b\u001ah\u0012\u0013\u0012\u00110@\u00a2\u0006\u000c\u0008d\u0012\u0008\u0008e\u0012\u0004\u0008\u0008(?\u0012\u0015\u0012\u0013\u0018\u00010C\u00a2\u0006\u000c\u0008d\u0012\u0008\u0008e\u0012\u0004\u0008\u0008(B\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020g\u0018\u00010f\u00a2\u0006\u000c\u0008d\u0012\u0008\u0008e\u0012\u0004\u0008\u0008(h\u0012\u0015\u0012\u0013\u0018\u00010i\u00a2\u0006\u000c\u0008d\u0012\u0008\u0008e\u0012\u0004\u0008\u0008(j\u0012\u0004\u0012\u00020;0cJ\u001c\u0010k\u001a\u00020;2\u0006\u0010B\u001a\u00020C2\n\u0008\u0002\u0010D\u001a\u0004\u0018\u00010EH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u00088B@BX\u0082\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\n\u0010\u000b\"\u0004\u0008\u000c\u0010\rR.\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u000e8F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\u0008\u0010\u0010\u0002\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R.\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00198F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\u0008\u001b\u0010\u0002\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R*\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\"8F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\u0008$\u0010\u0002\u001a\u0004\u0008%\u0010&\"\u0004\u0008\'\u0010(R(\u0010)\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u000e8@@@X\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008*\u0010\u0012\"\u0004\u0008+\u0010\u0014R\u0014\u0010,\u001a\u00020\u00088BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010\u000bR\u000e\u0010.\u001a\u00020/X\u0082.\u00a2\u0006\u0002\n\u0000R.\u00100\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u000e8F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\u00081\u0010\u0002\u001a\u0004\u00082\u0010\u0012\"\u0004\u00083\u0010\u0014R\u001b\u00104\u001a\u0002058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00088\u00109\u001a\u0004\u00086\u00107\u00a8\u0006s"
    }
    d2 = {
        "Lio/radar/sdk/Radar;",
        "",
        "()V",
        "apiClient",
        "Lio/radar/sdk/api/ApiClient;",
        "context",
        "Landroid/content/Context;",
        "value",
        "",
        "debug",
        "getDebug",
        "()Z",
        "setDebug",
        "(Z)V",
        "",
        "description",
        "description$annotations",
        "getDescription",
        "()Ljava/lang/String;",
        "setDescription",
        "(Ljava/lang/String;)V",
        "identityRepository",
        "Lio/radar/sdk/internal/repository/IdentityRepository;",
        "locationManager",
        "Lio/radar/sdk/location/LocationManager;",
        "Lorg/json/JSONObject;",
        "metadata",
        "metadata$annotations",
        "getMetadata",
        "()Lorg/json/JSONObject;",
        "setMetadata",
        "(Lorg/json/JSONObject;)V",
        "optionsRepository",
        "Lio/radar/sdk/internal/repository/OptionsRepository;",
        "Lio/radar/sdk/Radar$RadarPlacesProvider;",
        "placesProvider",
        "placesProvider$annotations",
        "getPlacesProvider",
        "()Lio/radar/sdk/Radar$RadarPlacesProvider;",
        "setPlacesProvider",
        "(Lio/radar/sdk/Radar$RadarPlacesProvider;)V",
        "publishableKey",
        "getPublishableKey$sdk_release",
        "setPublishableKey$sdk_release",
        "sdkInitialized",
        "getSdkInitialized",
        "stateManager",
        "Lio/radar/sdk/state/StateManager;",
        "userId",
        "userId$annotations",
        "getUserId",
        "setUserId",
        "userOptions",
        "Lio/radar/sdk/Radar$UserOptions;",
        "getUserOptions",
        "()Lio/radar/sdk/Radar$UserOptions;",
        "userOptions$delegate",
        "Lkotlin/Lazy;",
        "acceptEvent",
        "",
        "eventId",
        "verifiedPlaceId",
        "broadcastError",
        "status",
        "Lio/radar/sdk/Radar$RadarStatus;",
        "forceTrack",
        "location",
        "Landroid/location/Location;",
        "callback",
        "Lio/radar/sdk/Radar$RadarCallback;",
        "getLocation",
        "Lkotlin/Function1;",
        "handleLocation",
        "handleLocation$sdk_release",
        "handleLocations",
        "locations",
        "",
        "handleLocations$sdk_release",
        "init",
        "init$sdk_release",
        "initialize",
        "isTracking",
        "rejectEvent",
        "requestLocation",
        "force",
        "requestLocation$sdk_release",
        "retryFailedStop",
        "completionCallback",
        "Lkotlin/Function0;",
        "retryFailedStop$sdk_release",
        "setTrackingOptions",
        "trackingOptions",
        "Lio/radar/sdk/RadarTrackingOptions;",
        "startTracking",
        "stopTracking",
        "track",
        "track$sdk_release",
        "trackOnce",
        "block",
        "Lkotlin/Function4;",
        "Lkotlin/ParameterName;",
        "name",
        "",
        "Lio/radar/sdk/model/RadarEvent;",
        "events",
        "Lio/radar/sdk/model/RadarUser;",
        "user",
        "updateLocation",
        "RadarCallback",
        "RadarPlacesProvider",
        "RadarStatus",
        "RadarTrackingOffline",
        "RadarTrackingPriority",
        "RadarTrackingSync",
        "UserOptions",
        "sdk_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x1,
        0xb
    }
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lkotlin/reflect/KProperty;

.field public static final INSTANCE:Lio/radar/sdk/Radar;

.field private static apiClient:Lio/radar/sdk/api/ApiClient;

.field private static context:Landroid/content/Context;

.field private static identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

.field private static locationManager:Lio/radar/sdk/location/LocationManager;

.field private static optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

.field private static stateManager:Lio/radar/sdk/state/StateManager;

.field private static final userOptions$delegate:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x1

    new-array v0, v0, [Lkotlin/reflect/KProperty;

    new-instance v1, Lkotlin/jvm/internal/PropertyReference1Impl;

    const-class v2, Lio/radar/sdk/Radar;

    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    move-result-object v2

    const-string v3, "userOptions"

    const-string v4, "getUserOptions()Lio/radar/sdk/Radar$UserOptions;"

    invoke-direct {v1, v2, v3, v4}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Lkotlin/reflect/KDeclarationContainer;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    move-result-object v1

    check-cast v1, Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sput-object v0, Lio/radar/sdk/Radar;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    .line 41
    new-instance v0, Lio/radar/sdk/Radar;

    invoke-direct {v0}, Lio/radar/sdk/Radar;-><init>()V

    sput-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    .line 189
    sget-object v0, Lio/radar/sdk/Radar$userOptions$2;->INSTANCE:Lio/radar/sdk/Radar$userOptions$2;

    check-cast v0, Lkotlin/jvm/functions/Function0;

    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    sput-object v0, Lio/radar/sdk/Radar;->userOptions$delegate:Lkotlin/Lazy;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$broadcastError(Lio/radar/sdk/Radar;Lio/radar/sdk/Radar$RadarStatus;)V
    .locals 0
    .param p1    # Lio/radar/sdk/Radar$RadarStatus;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 41
    invoke-direct {p0, p1}, Lio/radar/sdk/Radar;->broadcastError(Lio/radar/sdk/Radar$RadarStatus;)V

    return-void
.end method

.method public static final synthetic access$getIdentityRepository$p(Lio/radar/sdk/Radar;)Lio/radar/sdk/internal/repository/IdentityRepository;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 41
    sget-object p0, Lio/radar/sdk/Radar;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    if-nez p0, :cond_0

    const-string v0, "identityRepository"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    return-object p0
.end method

.method private final broadcastError(Lio/radar/sdk/Radar$RadarStatus;)V
    .locals 5

    .line 524
    sget-object v0, Lio/radar/sdk/RadarReceiver;->Companion:Lio/radar/sdk/RadarReceiver$Companion;

    invoke-virtual {v0, p1}, Lio/radar/sdk/RadarReceiver$Companion;->createErrorIntent$sdk_release(Lio/radar/sdk/Radar$RadarStatus;)Landroid/content/Intent;

    move-result-object p1

    .line 526
    sget-object v0, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v1, "context"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-static {v0}, Landroid/support/v4/content/LocalBroadcastManager;->getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    .line 528
    sget-object v0, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    if-nez v0, :cond_1

    const-string v1, "context"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    const-string v1, "matches"

    .line 529
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    .line 543
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 530
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 531
    sget-object v3, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    if-nez v3, :cond_3

    const-string v4, "context"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 532
    new-instance v3, Landroid/content/ComponentName;

    .line 533
    iget-object v4, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v4, v4, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v4, v4, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 534
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 532
    invoke-direct {v3, v4, v1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 538
    sget-object v1, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    if-nez v1, :cond_4

    const-string v3, "context"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v1, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    :cond_5
    return-void
.end method

.method private final forceTrack(Landroid/location/Location;Lio/radar/sdk/Radar$RadarCallback;)V
    .locals 8

    .line 469
    sget-object v0, Lio/radar/sdk/util/PermissionsHelper;->INSTANCE:Lio/radar/sdk/util/PermissionsHelper;

    sget-object v1, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    if-nez v1, :cond_0

    const-string v2, "context"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0, v1}, Lio/radar/sdk/util/PermissionsHelper;->check(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 470
    sget-object v0, Lio/radar/sdk/util/DeviceHelper;->INSTANCE:Lio/radar/sdk/util/DeviceHelper;

    sget-object v1, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    if-nez v1, :cond_1

    const-string v2, "context"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0, v1}, Lio/radar/sdk/util/DeviceHelper;->isLocationOn$sdk_release(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_3

    if-eqz p2, :cond_2

    .line 471
    sget-object v2, Lio/radar/sdk/Radar$RadarStatus;->ERROR_LOCATION:Lio/radar/sdk/Radar$RadarStatus;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xe

    const/4 v7, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v7}, Lio/radar/sdk/Radar$RadarCallback$DefaultImpls;->onComplete$default(Lio/radar/sdk/Radar$RadarCallback;Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;ILjava/lang/Object;)V

    .line 472
    :cond_2
    sget-object p1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_LOCATION:Lio/radar/sdk/Radar$RadarStatus;

    invoke-direct {p0, p1}, Lio/radar/sdk/Radar;->broadcastError(Lio/radar/sdk/Radar$RadarStatus;)V

    return-void

    .line 475
    :cond_3
    sget-object v0, Lio/radar/sdk/Radar;->apiClient:Lio/radar/sdk/api/ApiClient;

    if-nez v0, :cond_4

    const-string v1, "apiClient"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_4
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lio/radar/sdk/api/ApiClient;->setSendNextState$sdk_release(Z)V

    if-eqz p2, :cond_6

    .line 476
    sget-object v0, Lio/radar/sdk/Radar;->apiClient:Lio/radar/sdk/api/ApiClient;

    if-nez v0, :cond_5

    const-string v1, "apiClient"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_5
    invoke-virtual {v0, p2}, Lio/radar/sdk/api/ApiClient;->addCallback$sdk_release(Lio/radar/sdk/Radar$RadarCallback;)V

    :cond_6
    if-eqz p1, :cond_7

    .line 478
    invoke-virtual {p0, p1}, Lio/radar/sdk/Radar;->handleLocation$sdk_release(Landroid/location/Location;)V

    goto :goto_0

    .line 480
    :cond_7
    new-instance p1, Lio/radar/sdk/Radar$forceTrack$2;

    invoke-direct {p1, p2}, Lio/radar/sdk/Radar$forceTrack$2;-><init>(Lio/radar/sdk/Radar$RadarCallback;)V

    check-cast p1, Lkotlin/jvm/functions/Function1;

    invoke-direct {p0, p1}, Lio/radar/sdk/Radar;->getLocation(Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_8
    if-eqz p2, :cond_9

    .line 490
    sget-object v1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PERMISSIONS:Lio/radar/sdk/Radar$RadarStatus;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v6, 0x0

    move-object v0, p2

    invoke-static/range {v0 .. v6}, Lio/radar/sdk/Radar$RadarCallback$DefaultImpls;->onComplete$default(Lio/radar/sdk/Radar$RadarCallback;Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;ILjava/lang/Object;)V

    .line 491
    :cond_9
    sget-object p1, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PERMISSIONS:Lio/radar/sdk/Radar$RadarStatus;

    invoke-direct {p0, p1}, Lio/radar/sdk/Radar;->broadcastError(Lio/radar/sdk/Radar$RadarStatus;)V

    :goto_0
    return-void
.end method

.method private final getLocation(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroid/location/Location;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 496
    sget-object v0, Lio/radar/sdk/Radar;->locationManager:Lio/radar/sdk/location/LocationManager;

    if-nez v0, :cond_0

    const-string v1, "locationManager"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0, p1}, Lio/radar/sdk/location/LocationManager;->getLocation$sdk_release(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private final getSdkInitialized()Z
    .locals 1

    .line 207
    sget-object v0, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    if-eqz v0, :cond_0

    sget-object v0, Lio/radar/sdk/Radar;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    if-eqz v0, :cond_0

    sget-object v0, Lio/radar/sdk/Radar;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    if-eqz v0, :cond_0

    sget-object v0, Lio/radar/sdk/Radar;->stateManager:Lio/radar/sdk/state/StateManager;

    if-eqz v0, :cond_0

    sget-object v0, Lio/radar/sdk/Radar;->locationManager:Lio/radar/sdk/location/LocationManager;

    if-eqz v0, :cond_0

    sget-object v0, Lio/radar/sdk/Radar;->apiClient:Lio/radar/sdk/api/ApiClient;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private final getUserOptions()Lio/radar/sdk/Radar$UserOptions;
    .locals 3

    sget-object v0, Lio/radar/sdk/Radar;->userOptions$delegate:Lkotlin/Lazy;

    sget-object v1, Lio/radar/sdk/Radar;->$$delegatedProperties:[Lkotlin/reflect/KProperty;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/radar/sdk/Radar$UserOptions;

    return-object v0
.end method

.method public static final initialize(Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 239
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-direct {v0}, Lio/radar/sdk/Radar;->getSdkInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 241
    :cond_0
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-virtual {v0, p0}, Lio/radar/sdk/Radar;->setPublishableKey$sdk_release(Ljava/lang/String;)V

    return-void
.end method

.method public static final isTracking()Z
    .locals 2
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 341
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-direct {v0}, Lio/radar/sdk/Radar;->getSdkInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lio/radar/sdk/Radar;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    if-nez v0, :cond_0

    const-string v1, "optionsRepository"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getBackgroundTracking$sdk_release()Z

    move-result v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static bridge synthetic requestLocation$sdk_release$default(Lio/radar/sdk/Radar;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 499
    :cond_0
    invoke-virtual {p0, p1}, Lio/radar/sdk/Radar;->requestLocation$sdk_release(Z)V

    return-void
.end method

.method public static final setPlacesProvider(Lio/radar/sdk/Radar$RadarPlacesProvider;)V
    .locals 2
    .param p0    # Lio/radar/sdk/Radar$RadarPlacesProvider;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 281
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-direct {v0}, Lio/radar/sdk/Radar;->getSdkInitialized()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lio/radar/sdk/Radar;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    if-nez v0, :cond_0

    const-string v1, "optionsRepository"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0, p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->setPlacesProvider$sdk_release(Lio/radar/sdk/Radar$RadarPlacesProvider;)V

    :cond_1
    return-void
.end method

.method private final setTrackingOptions(Lio/radar/sdk/RadarTrackingOptions;)V
    .locals 5

    .line 457
    invoke-virtual {p1}, Lio/radar/sdk/RadarTrackingOptions;->getPriority()Lio/radar/sdk/Radar$RadarTrackingPriority;

    move-result-object v0

    sget-object v1, Lio/radar/sdk/Radar$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Lio/radar/sdk/Radar$RadarTrackingPriority;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    .line 459
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const-wide/32 v0, 0xdbba0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    long-to-int v1, v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    const-wide/32 v0, 0x57e40

    .line 458
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const v1, 0x249f0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 457
    :goto_0
    invoke-virtual {v0}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    invoke-virtual {v0}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 461
    sget-object v3, Lio/radar/sdk/Radar;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    if-nez v3, :cond_0

    const-string v4, "optionsRepository"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v3, v1, v2}, Lio/radar/sdk/internal/repository/OptionsRepository;->setUpdateInterval$sdk_release(J)V

    .line 462
    sget-object v1, Lio/radar/sdk/Radar;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    if-nez v1, :cond_1

    const-string v2, "optionsRepository"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v1, v0}, Lio/radar/sdk/internal/repository/OptionsRepository;->setDwellDelay$sdk_release(I)V

    .line 464
    sget-object v0, Lio/radar/sdk/Radar;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    if-nez v0, :cond_2

    const-string v1, "optionsRepository"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Lio/radar/sdk/RadarTrackingOptions;->getOffline()Lio/radar/sdk/Radar$RadarTrackingOffline;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/radar/sdk/internal/repository/OptionsRepository;->setOfflineMode$sdk_release(Lio/radar/sdk/Radar$RadarTrackingOffline;)V

    .line 465
    sget-object v0, Lio/radar/sdk/Radar;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    if-nez v0, :cond_3

    const-string v1, "optionsRepository"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {p1}, Lio/radar/sdk/RadarTrackingOptions;->getSync()Lio/radar/sdk/Radar$RadarTrackingSync;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/radar/sdk/internal/repository/OptionsRepository;->setSyncMode$sdk_release(Lio/radar/sdk/Radar$RadarTrackingSync;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static final setUserId(Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 251
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-direct {v0}, Lio/radar/sdk/Radar;->getSdkInitialized()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-direct {v0}, Lio/radar/sdk/Radar;->getUserOptions()Lio/radar/sdk/Radar$UserOptions;

    move-result-object v0

    invoke-virtual {v0, p0}, Lio/radar/sdk/Radar$UserOptions;->setUserId(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final startTracking(Lio/radar/sdk/RadarTrackingOptions;)V
    .locals 3
    .param p0    # Lio/radar/sdk/RadarTrackingOptions;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    const-string v0, "trackingOptions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 301
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-direct {v0}, Lio/radar/sdk/Radar;->getSdkInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 303
    :cond_0
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-direct {v0, p0}, Lio/radar/sdk/Radar;->setTrackingOptions(Lio/radar/sdk/RadarTrackingOptions;)V

    .line 305
    sget-object p0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-virtual {p0}, Lio/radar/sdk/Radar;->getPublishableKey$sdk_release()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_7

    sget-object p0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-virtual {p0}, Lio/radar/sdk/Radar;->getPublishableKey$sdk_release()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    if-nez p0, :cond_1

    goto :goto_0

    .line 310
    :cond_1
    sget-object p0, Lio/radar/sdk/util/PermissionsHelper;->INSTANCE:Lio/radar/sdk/util/PermissionsHelper;

    sget-object v0, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    if-nez v0, :cond_2

    const-string v1, "context"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p0, v0}, Lio/radar/sdk/util/PermissionsHelper;->check(Landroid/content/Context;)Z

    move-result p0

    if-nez p0, :cond_3

    .line 311
    sget-object p0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PERMISSIONS:Lio/radar/sdk/Radar$RadarStatus;

    invoke-direct {p0, v0}, Lio/radar/sdk/Radar;->broadcastError(Lio/radar/sdk/Radar$RadarStatus;)V

    return-void

    .line 315
    :cond_3
    sget-object p0, Lio/radar/sdk/Radar;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    if-nez p0, :cond_4

    const-string v0, "optionsRepository"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {p0}, Lio/radar/sdk/internal/repository/OptionsRepository;->getBackgroundTracking$sdk_release()Z

    move-result p0

    .line 316
    sget-object v0, Lio/radar/sdk/Radar;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    if-nez v0, :cond_5

    const-string v1, "optionsRepository"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_5
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lio/radar/sdk/internal/repository/OptionsRepository;->setBackgroundTracking$sdk_release(Z)V

    if-nez p0, :cond_6

    .line 318
    sget-object p0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    const/4 v0, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lio/radar/sdk/Radar;->requestLocation$sdk_release$default(Lio/radar/sdk/Radar;ZILjava/lang/Object;)V

    :cond_6
    return-void

    .line 306
    :cond_7
    :goto_0
    sget-object p0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PUBLISHABLE_KEY:Lio/radar/sdk/Radar$RadarStatus;

    invoke-direct {p0, v0}, Lio/radar/sdk/Radar;->broadcastError(Lio/radar/sdk/Radar$RadarStatus;)V

    return-void
.end method

.method public static final stopTracking()V
    .locals 4
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 327
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-direct {v0}, Lio/radar/sdk/Radar;->getSdkInitialized()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 329
    :cond_0
    sget-object v0, Lio/radar/sdk/util/PermissionsHelper;->INSTANCE:Lio/radar/sdk/util/PermissionsHelper;

    sget-object v1, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    if-nez v1, :cond_1

    const-string v2, "context"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0, v1}, Lio/radar/sdk/util/PermissionsHelper;->check(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 330
    sget-object v0, Lio/radar/sdk/Radar;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    if-nez v0, :cond_2

    const-string v1, "optionsRepository"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lio/radar/sdk/internal/repository/OptionsRepository;->setBackgroundTracking$sdk_release(Z)V

    .line 331
    sget-object v0, Lio/radar/sdk/Radar;->locationManager:Lio/radar/sdk/location/LocationManager;

    if-nez v0, :cond_3

    const-string v2, "locationManager"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_3
    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lio/radar/sdk/location/LocationManager;->requestLocation$sdk_release$default(Lio/radar/sdk/location/LocationManager;ZILjava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public static bridge synthetic track$sdk_release$default(Lio/radar/sdk/Radar;Landroid/location/Location;Lio/radar/sdk/Radar$RadarCallback;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    .line 426
    move-object p1, v0

    check-cast p1, Landroid/location/Location;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    check-cast p2, Lio/radar/sdk/Radar$RadarCallback;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lio/radar/sdk/Radar;->track$sdk_release(Landroid/location/Location;Lio/radar/sdk/Radar$RadarCallback;)V

    return-void
.end method

.method public static final trackOnce(Lio/radar/sdk/Radar$RadarCallback;)V
    .locals 4
    .param p0    # Lio/radar/sdk/Radar$RadarCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 350
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-direct {v0}, Lio/radar/sdk/Radar;->getSdkInitialized()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    if-eqz p0, :cond_0

    .line 351
    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->ERROR_UNKNOWN:Lio/radar/sdk/Radar$RadarStatus;

    invoke-interface {p0, v0, v1, v1, v1}, Lio/radar/sdk/Radar$RadarCallback;->onComplete(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    :cond_0
    return-void

    .line 355
    :cond_1
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-virtual {v0}, Lio/radar/sdk/Radar;->getPublishableKey$sdk_release()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_6

    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    invoke-virtual {v0}, Lio/radar/sdk/Radar;->getPublishableKey$sdk_release()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 361
    :cond_2
    sget-object v0, Lio/radar/sdk/util/PermissionsHelper;->INSTANCE:Lio/radar/sdk/util/PermissionsHelper;

    sget-object v2, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    if-nez v2, :cond_3

    const-string v3, "context"

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_3
    invoke-virtual {v0, v2}, Lio/radar/sdk/util/PermissionsHelper;->check(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_5

    if-eqz p0, :cond_4

    .line 362
    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PERMISSIONS:Lio/radar/sdk/Radar$RadarStatus;

    invoke-interface {p0, v0, v1, v1, v1}, Lio/radar/sdk/Radar$RadarCallback;->onComplete(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    .line 363
    :cond_4
    sget-object p0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PERMISSIONS:Lio/radar/sdk/Radar$RadarStatus;

    invoke-direct {p0, v0}, Lio/radar/sdk/Radar;->broadcastError(Lio/radar/sdk/Radar$RadarStatus;)V

    return-void

    .line 366
    :cond_5
    sget-object v0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    const/4 v2, 0x1

    invoke-static {v0, v1, p0, v2, v1}, Lio/radar/sdk/Radar;->track$sdk_release$default(Lio/radar/sdk/Radar;Landroid/location/Location;Lio/radar/sdk/Radar$RadarCallback;ILjava/lang/Object;)V

    return-void

    :cond_6
    :goto_0
    if-eqz p0, :cond_7

    .line 356
    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PUBLISHABLE_KEY:Lio/radar/sdk/Radar$RadarStatus;

    invoke-interface {p0, v0, v1, v1, v1}, Lio/radar/sdk/Radar$RadarCallback;->onComplete(Lio/radar/sdk/Radar$RadarStatus;Landroid/location/Location;[Lio/radar/sdk/model/RadarEvent;Lio/radar/sdk/model/RadarUser;)V

    .line 357
    :cond_7
    sget-object p0, Lio/radar/sdk/Radar;->INSTANCE:Lio/radar/sdk/Radar;

    sget-object v0, Lio/radar/sdk/Radar$RadarStatus;->ERROR_PUBLISHABLE_KEY:Lio/radar/sdk/Radar$RadarStatus;

    invoke-direct {p0, v0}, Lio/radar/sdk/Radar;->broadcastError(Lio/radar/sdk/Radar$RadarStatus;)V

    return-void
.end method


# virtual methods
.method public final getPublishableKey$sdk_release()Ljava/lang/String;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 180
    sget-object v0, Lio/radar/sdk/Radar;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    if-nez v0, :cond_0

    const-string v1, "identityRepository"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getPublishableKey$sdk_release()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final handleLocation$sdk_release(Landroid/location/Location;)V
    .locals 2
    .param p1    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "location"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 506
    sget-object v0, Lio/radar/sdk/Radar;->stateManager:Lio/radar/sdk/state/StateManager;

    if-nez v0, :cond_0

    const-string v1, "stateManager"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0, p1}, Lio/radar/sdk/state/StateManager;->updateState$sdk_release(Landroid/location/Location;)Lio/radar/sdk/internal/RadarState;

    move-result-object p1

    .line 508
    sget-object v0, Lio/radar/sdk/Radar;->locationManager:Lio/radar/sdk/location/LocationManager;

    if-nez v0, :cond_1

    const-string v1, "locationManager"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0, p1}, Lio/radar/sdk/location/LocationManager;->handleState$sdk_release(Lio/radar/sdk/internal/RadarState;)V

    .line 509
    sget-object v0, Lio/radar/sdk/Radar;->apiClient:Lio/radar/sdk/api/ApiClient;

    if-nez v0, :cond_2

    const-string v1, "apiClient"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0, p1}, Lio/radar/sdk/api/ApiClient;->handleState$sdk_release(Lio/radar/sdk/internal/RadarState;)V

    return-void
.end method

.method public final handleLocations$sdk_release(Ljava/util/List;)V
    .locals 2
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Landroid/location/Location;",
            ">;)V"
        }
    .end annotation

    const-string v0, "locations"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 513
    sget-object v0, Lio/radar/sdk/Radar;->stateManager:Lio/radar/sdk/state/StateManager;

    if-nez v0, :cond_0

    const-string v1, "stateManager"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0, p1}, Lio/radar/sdk/state/StateManager;->updateState$sdk_release(Ljava/util/List;)Lio/radar/sdk/internal/RadarState;

    move-result-object p1

    .line 515
    sget-object v0, Lio/radar/sdk/Radar;->locationManager:Lio/radar/sdk/location/LocationManager;

    if-nez v0, :cond_1

    const-string v1, "locationManager"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0, p1}, Lio/radar/sdk/location/LocationManager;->handleState$sdk_release(Lio/radar/sdk/internal/RadarState;)V

    .line 516
    sget-object v0, Lio/radar/sdk/Radar;->apiClient:Lio/radar/sdk/api/ApiClient;

    if-nez v0, :cond_2

    const-string v1, "apiClient"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    invoke-virtual {v0, p1}, Lio/radar/sdk/api/ApiClient;->handleState$sdk_release(Lio/radar/sdk/internal/RadarState;)V

    return-void
.end method

.method public final init$sdk_release(Landroid/content/Context;Lio/radar/sdk/internal/repository/OptionsRepository;Lio/radar/sdk/internal/repository/IdentityRepository;Lio/radar/sdk/state/StateManager;Lio/radar/sdk/location/LocationManager;Lio/radar/sdk/api/ApiClient;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lio/radar/sdk/internal/repository/OptionsRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lio/radar/sdk/internal/repository/IdentityRepository;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lio/radar/sdk/state/StateManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lio/radar/sdk/location/LocationManager;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lio/radar/sdk/api/ApiClient;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation runtime Lio/radar/shadow/javax/inject/Inject;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optionsRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "identityRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "apiClient"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    sput-object p1, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    .line 220
    sget-object p1, Lio/radar/sdk/internal/RadarLogger;->INSTANCE:Lio/radar/sdk/internal/RadarLogger;

    invoke-virtual {p2}, Lio/radar/sdk/internal/repository/OptionsRepository;->getDebug$sdk_release()Z

    move-result v0

    invoke-virtual {p1, v0}, Lio/radar/sdk/internal/RadarLogger;->setDEBUG(Z)V

    .line 222
    sput-object p2, Lio/radar/sdk/Radar;->optionsRepository:Lio/radar/sdk/internal/repository/OptionsRepository;

    .line 223
    sput-object p3, Lio/radar/sdk/Radar;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    .line 225
    sput-object p4, Lio/radar/sdk/Radar;->stateManager:Lio/radar/sdk/state/StateManager;

    .line 227
    sput-object p5, Lio/radar/sdk/Radar;->locationManager:Lio/radar/sdk/location/LocationManager;

    .line 228
    sput-object p6, Lio/radar/sdk/Radar;->apiClient:Lio/radar/sdk/api/ApiClient;

    return-void
.end method

.method public final requestLocation$sdk_release(Z)V
    .locals 3

    .line 500
    sget-object v0, Lio/radar/sdk/util/PermissionsHelper;->INSTANCE:Lio/radar/sdk/util/PermissionsHelper;

    sget-object v1, Lio/radar/sdk/Radar;->context:Landroid/content/Context;

    if-nez v1, :cond_0

    const-string v2, "context"

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0, v1}, Lio/radar/sdk/util/PermissionsHelper;->check(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 501
    sget-object v0, Lio/radar/sdk/Radar;->locationManager:Lio/radar/sdk/location/LocationManager;

    if-nez v0, :cond_1

    const-string v1, "locationManager"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0, p1}, Lio/radar/sdk/location/LocationManager;->requestLocation$sdk_release(Z)V

    :cond_2
    return-void
.end method

.method public final retryFailedStop$sdk_release(Lkotlin/jvm/functions/Function0;)V
    .locals 2
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "completionCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkParameterIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 520
    sget-object v0, Lio/radar/sdk/Radar;->apiClient:Lio/radar/sdk/api/ApiClient;

    if-nez v0, :cond_0

    const-string v1, "apiClient"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0, p1}, Lio/radar/sdk/api/ApiClient;->retryFailedStop$sdk_release(Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public final setPublishableKey$sdk_release(Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 174
    sget-object v0, Lio/radar/sdk/Radar;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    if-nez v0, :cond_0

    const-string v1, "identityRepository"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Lio/radar/sdk/internal/repository/IdentityRepository;->getPublishableKey$sdk_release()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 175
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_3

    .line 176
    :cond_1
    sget-object v0, Lio/radar/sdk/Radar;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    if-nez v0, :cond_2

    const-string v1, "identityRepository"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_2
    const/4 v1, 0x0

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lio/radar/sdk/internal/repository/IdentityRepository;->setRadarId$sdk_release(Ljava/lang/String;)V

    .line 178
    :cond_3
    sget-object v0, Lio/radar/sdk/Radar;->identityRepository:Lio/radar/sdk/internal/repository/IdentityRepository;

    if-nez v0, :cond_4

    const-string v1, "identityRepository"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v0, p1}, Lio/radar/sdk/internal/repository/IdentityRepository;->setPublishableKey$sdk_release(Ljava/lang/String;)V

    return-void
.end method

.method public final track$sdk_release(Landroid/location/Location;Lio/radar/sdk/Radar$RadarCallback;)V
    .locals 0
    .param p1    # Landroid/location/Location;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Lio/radar/sdk/Radar$RadarCallback;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 427
    invoke-direct {p0, p1, p2}, Lio/radar/sdk/Radar;->forceTrack(Landroid/location/Location;Lio/radar/sdk/Radar$RadarCallback;)V

    return-void
.end method
