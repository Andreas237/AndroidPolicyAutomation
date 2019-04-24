.class public Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;
.super Ljava/lang/Object;
.source "NewRelicSessionAttributes.java"

# interfaces
.implements Lcom/ibotta/android/location/LocationStatusListener;
.implements Lcom/ibotta/android/state/app/mvt/MvtTestsHolderListener;


# static fields
.field private static final ATTR_EMPLOYEE_TESTER:Ljava/lang/String; = "employee_tester"

.field private static final ATTR_LOCATION_STATUS:Ljava/lang/String; = "location_status"

.field private static final ATTR_MVT_TESTS:Ljava/lang/String; = "mvt_tests"

.field private static final ATTR_PUSH_STATUS:Ljava/lang/String; = "push_status"

.field private static final ATTR_SUPERUSER:Ljava/lang/String; = "superuser"


# instance fields
.field private final app:Lcom/ibotta/android/App;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/App;)V
    .locals 0

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    iput-object p1, p0, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;->app:Lcom/ibotta/android/App;

    return-void
.end method

.method private refreshLocationAttributes()V
    .locals 6

    .line 79
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;->app:Lcom/ibotta/android/App;

    const-string v1, "location"

    invoke-virtual {v0, v1}, Lcom/ibotta/android/App;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    .line 81
    iget-object v1, p0, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;->app:Lcom/ibotta/android/App;

    sget-object v2, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-virtual {v1, v2}, Lcom/ibotta/android/App;->hasPermission(Lcom/ibotta/android/state/app/permissions/PermissionProfile;)Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const-string v4, "network"

    .line 82
    invoke-virtual {v0, v4}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    const-string v1, "Setting %1$s=%2$b"

    const/4 v4, 0x2

    .line 85
    new-array v4, v4, [Ljava/lang/Object;

    const-string v5, "location_status"

    aput-object v5, v4, v3

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v4, v2

    invoke-static {v1, v4}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "location_status"

    .line 86
    invoke-static {v1, v0}, Lcom/newrelic/agent/android/NewRelic;->setAttribute(Ljava/lang/String;Z)Z

    return-void
.end method


# virtual methods
.method public onAppActive()V
    .locals 5

    .line 90
    iget-object v0, p0, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;->app:Lcom/ibotta/android/App;

    invoke-static {v0}, Landroid/support/v4/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v0

    const-string v1, "Setting %1$s=%2$b"

    const/4 v2, 0x2

    .line 92
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "push_status"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    const-string v1, "push_status"

    .line 93
    invoke-static {v1, v0}, Lcom/newrelic/agent/android/NewRelic;->setAttribute(Ljava/lang/String;Z)Z

    return-void
.end method

.method public onLocationChanged(Landroid/location/Location;)V
    .locals 0
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 70
    invoke-direct {p0}, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;->refreshLocationAttributes()V

    return-void
.end method

.method public onLocationStatusChanged(Z)V
    .locals 0
    .annotation build Lhugo/weaving/DebugLog;
    .end annotation

    .line 75
    invoke-direct {p0}, Lcom/ibotta/android/tracking/sdk/NewRelicSessionAttributes;->refreshLocationAttributes()V

    return-void
.end method

.method public onTestVariantsSet(Ljava/util/List;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/mvt/TestVariant;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onTestVariantsSet: %1$d"

    const/4 v1, 0x1

    .line 51
    new-array v2, v1, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v2}, Ltimber/log/Timber;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 56
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/ibotta/api/model/mvt/TestVariant;

    const-string v3, "%1$s=%2$s"

    const/4 v5, 0x2

    .line 58
    new-array v5, v5, [Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/ibotta/api/model/mvt/TestVariant;->getTestName()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v4

    invoke-virtual {v2}, Lcom/ibotta/api/model/mvt/TestVariant;->getVariantName()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v5, v1

    invoke-static {v3, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, ","

    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string p1, "mvt_tests"

    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/newrelic/agent/android/NewRelic;->setAttribute(Ljava/lang/String;Ljava/lang/String;)Z

    return-void
.end method

.method public setEmployeeId(I)V
    .locals 0

    .line 46
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/newrelic/agent/android/NewRelic;->setUserId(Ljava/lang/String;)Z

    return-void
.end method

.method public setEmployeeTester(Z)V
    .locals 1

    const-string v0, "employee_tester"

    .line 42
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/NewRelic;->setAttribute(Ljava/lang/String;Z)Z

    return-void
.end method

.method public setSuperUser(Z)V
    .locals 1

    const-string v0, "superuser"

    .line 38
    invoke-static {v0, p1}, Lcom/newrelic/agent/android/NewRelic;->setAttribute(Ljava/lang/String;Z)Z

    return-void
.end method
