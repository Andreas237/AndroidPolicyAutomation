.class public Lme/pushy/sdk/util/PushyPermissionVerification;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static verifyManifestPermissions(Landroid/content/Context;)V
    .locals 7

    const-string v0, "pushyPermissionVerification"

    const/4 v1, 0x1

    invoke-static {v0, v1, p0}, Lme/pushy/sdk/util/PushyPreferences;->getBoolean(Ljava/lang/String;ZLandroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v1, "Pushy"

    const-string v2, "Warning: AndroidManifest permission verification disabled by developer"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    sget-object v1, Lme/pushy/sdk/config/PushyPermissions;->REQUIRED_MANIFEST_PERMISSIONS:[Ljava/lang/String;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_3

    aget-object v4, v1, v3

    invoke-virtual {p0, v4}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v5

    if-eqz v5, :cond_2

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Error: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " is missing from your AndroidManifest.xml."

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    if-eqz v0, :cond_1

    new-instance p0, Lme/pushy/sdk/util/exceptions/PushyPermissionException;

    invoke-direct {p0, v4}, Lme/pushy/sdk/util/exceptions/PushyPermissionException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-string v5, "Pushy"

    invoke-static {v5, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method
