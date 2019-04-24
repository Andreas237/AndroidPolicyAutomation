.class public Lcom/ibotta/android/routing/area/PermissionPrimersRouteArea;
.super Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;
.source "PermissionPrimersRouteArea.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 23
    invoke-direct {p0}, Lcom/ibotta/android/routing/area/AbstractRegexRouteArea;-><init>()V

    return-void
.end method


# virtual methods
.method protected getAreaRegexes()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "^/permission/location$"

    const-string v1, "^/permission/pushlocation$"

    .line 28
    invoke-static {v0, v1}, Ljava9/util/Sets;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    const-string v0, "^/permission/location$"

    .line 33
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/PermissionPrimersRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "^/permission/pushlocation$"

    .line 34
    invoke-virtual {p0, v0, p2}, Lcom/ibotta/android/routing/area/PermissionPrimersRouteArea;->getMatcher(Ljava/lang/String;Ljava/lang/String;)Lcom/google/code/regexp/Matcher;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/code/regexp/Matcher;->matches()Z

    move-result p2

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1

    .line 35
    :cond_1
    :goto_0
    new-instance p2, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;

    sget-object v0, Lcom/ibotta/android/state/app/permissions/PermissionProfile;->LOCATION:Lcom/ibotta/android/state/app/permissions/PermissionProfile;

    invoke-direct {p2, p1, v0}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/state/app/permissions/PermissionProfile;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/PermissionsGateIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
