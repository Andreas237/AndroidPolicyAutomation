.class public Lcom/shopkick/app/permissions/PermissionUtils;
.super Ljava/lang/Object;
.source "PermissionUtils.java"


# static fields
.field public static final BOOT_UP_PERMISSIONS:[Ljava/lang/String;

.field public static final CAMERA_PERMISSIONS:[Ljava/lang/String;

.field public static final WALKIN_PERMISSIONS:[Ljava/lang/String;

.field public static final WEBVIEW_PERMISSIONS:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-string v0, "android.permission.ACCESS_COARSE_LOCATION"

    const-string v1, "android.permission.ACCESS_FINE_LOCATION"

    const-string v2, "android.permission.READ_PHONE_STATE"

    .line 33
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->BOOT_UP_PERMISSIONS:[Ljava/lang/String;

    const-string v0, "android.permission.CAMERA"

    .line 40
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->CAMERA_PERMISSIONS:[Ljava/lang/String;

    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v2, "android.permission.CAMERA"

    .line 45
    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->WEBVIEW_PERMISSIONS:[Ljava/lang/String;

    const-string v0, "android.permission.RECORD_AUDIO"

    .line 52
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/permissions/PermissionUtils;->WALKIN_PERMISSIONS:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static arePermissionsEnabled([Ljava/lang/String;Landroid/content/Context;)Z
    .locals 4

    .line 66
    array-length v0, p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    .line 67
    invoke-static {v3, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z

    move-result v3

    if-nez v3, :cond_0

    return v1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static getPermissionGroupFromPermission(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 83
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    const/16 v0, 0x80

    .line 85
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/content/pm/PackageManager;->getPermissionInfo(Ljava/lang/String;I)Landroid/content/pm/PermissionInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PermissionInfo;->group:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 87
    invoke-virtual {p0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static getPermissionsForGroup(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
    .locals 3

    .line 102
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    .line 103
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 106
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/16 v2, 0x1000

    invoke-virtual {v0, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 107
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    const/16 v2, 0x80

    .line 110
    invoke-virtual {v0, p1, v2}, Landroid/content/pm/PackageManager;->queryPermissionsByGroup(Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 112
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/PermissionInfo;

    .line 114
    iget-object v2, v0, Landroid/content/pm/PermissionInfo;->name:Ljava/lang/String;

    invoke-interface {p0, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 115
    iget-object v0, v0, Landroid/content/pm/PermissionInfo;->name:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 120
    invoke-virtual {p0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    .line 123
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 125
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p0

    new-array p0, p0, [Ljava/lang/String;

    .line 126
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    return-object p0
.end method

.method public static getReadablePermissionGroup(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 138
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "android.permission-group.MICROPHONE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    goto :goto_1

    :sswitch_1
    const-string v0, "android.permission-group.STORAGE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :sswitch_2
    const-string v0, "android.permission-group.LOCATION"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_1

    :sswitch_3
    const-string v0, "android.permission-group.CAMERA"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_1

    :sswitch_4
    const-string v0, "android.permission-group.PHONE"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, -0x1

    :goto_1
    packed-switch v0, :pswitch_data_0

    return-object p0

    :pswitch_0
    const-string p0, "Storage"

    return-object p0

    :pswitch_1
    const-string p0, "Phone"

    return-object p0

    :pswitch_2
    const-string p0, "Microphone"

    return-object p0

    :pswitch_3
    const-string p0, "Location"

    return-object p0

    :pswitch_4
    const-string p0, "Camera"

    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x540bd380 -> :sswitch_4
        -0x440149cd -> :sswitch_3
        0x31640343 -> :sswitch_2
        0x32c9b10d -> :sswitch_1
        0x5e404d38 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static isPermissionEnabled(Ljava/lang/String;Landroid/content/Context;)Z
    .locals 0

    .line 62
    invoke-static {p1, p0}, Landroid/support/v4/content/PermissionChecker;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic lambda$showOpenSettingsAppDialog$185(Landroid/content/Context;[Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/16 p3, 0x17f

    const/16 v0, 0x8

    .line 182
    invoke-static {p0, p3, v0, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->logPermission(Landroid/content/Context;II[Ljava/lang/String;)V

    .line 183
    invoke-static {p0}, Lcom/shopkick/app/permissions/PermissionUtils;->openSettingsApp(Landroid/content/Context;)V

    .line 184
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method static synthetic lambda$showOpenSettingsAppDialog$186(Landroid/content/Context;[Ljava/lang/String;Landroid/content/DialogInterface;I)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/16 p3, 0x17f

    const/16 v0, 0x9

    .line 187
    invoke-static {p0, p3, v0, p1}, Lcom/shopkick/app/permissions/PermissionUtils;->logPermission(Landroid/content/Context;II[Ljava/lang/String;)V

    .line 188
    invoke-interface {p2}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method

.method public static logOnRequestPermissionsResult(Landroid/app/Activity;[Ljava/lang/String;[I)V
    .locals 7
    .param p0    # Landroid/app/Activity;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 279
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    .line 281
    :goto_0
    array-length v3, p1

    if-ge v2, v3, :cond_2

    .line 282
    aget-object v3, p1, v2

    .line 283
    invoke-static {p0, v3}, Lcom/shopkick/app/permissions/PermissionUtils;->getPermissionGroupFromPermission(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 286
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 287
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 289
    aget v4, p2, v2

    const/16 v5, 0x17e

    const/4 v6, 0x1

    if-nez v4, :cond_0

    const/16 v4, 0x8

    .line 291
    new-array v6, v6, [Ljava/lang/String;

    aput-object v3, v6, v1

    invoke-static {p0, v5, v4, v6}, Lcom/shopkick/app/permissions/PermissionUtils;->logPermission(Landroid/content/Context;II[Ljava/lang/String;)V

    goto :goto_1

    .line 293
    :cond_0
    invoke-static {p0, v3}, Landroid/support/v4/app/ActivityCompat;->shouldShowRequestPermissionRationale(Landroid/app/Activity;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x9

    .line 295
    new-array v6, v6, [Ljava/lang/String;

    aput-object v3, v6, v1

    invoke-static {p0, v5, v4, v6}, Lcom/shopkick/app/permissions/PermissionUtils;->logPermission(Landroid/content/Context;II[Ljava/lang/String;)V

    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static logPermission(Landroid/content/Context;II[Ljava/lang/String;)V
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 229
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 230
    array-length v1, p3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p3, v2

    .line 231
    invoke-static {p0, v3}, Lcom/shopkick/app/permissions/PermissionUtils;->getPermissionGroupFromPermission(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 232
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 233
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 238
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p3

    new-array p3, p3, [Ljava/lang/String;

    .line 239
    invoke-virtual {v0, p3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 240
    invoke-static {p0, p1, p2, p3}, Lcom/shopkick/app/permissions/PermissionUtils;->logPermissionGroup(Landroid/content/Context;II[Ljava/lang/String;)V

    return-void
.end method

.method public static logPermissionGroup(Landroid/content/Context;II[Ljava/lang/String;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p3    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 257
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v0, v0, Lcom/shopkick/app/application/SKApp;

    if-eqz v0, :cond_2

    .line 258
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    check-cast p0, Lcom/shopkick/app/application/SKApp;

    if-eqz p0, :cond_1

    .line 259
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    if-nez v0, :cond_0

    goto :goto_0

    .line 262
    :cond_0
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    const-string p1, ","

    .line 263
    invoke-static {p3, p1}, Lcom/appboy/support/StringUtils;->join([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setPermissions(Ljava/lang/String;)V

    .line 264
    iget-object p0, p0, Lcom/shopkick/app/application/SKApp;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p0, p0, Lcom/shopkick/app/application/ScreenGlobals;->logger:Lcom/shopkick/app/application/SKLogger;

    iget-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->map:Ljava/util/HashMap;

    invoke-virtual {p0, p1}, Lcom/shopkick/app/application/SKLogger;->logPersistentEvent(Ljava/util/Map;)V

    goto :goto_1

    :cond_1
    :goto_0
    return-void

    :cond_2
    :goto_1
    return-void
.end method

.method public static openSettingsApp(Landroid/content/Context;)V
    .locals 3

    .line 209
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "android.intent.category.DEFAULT"

    .line 210
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 211
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "package:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 212
    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static showOpenSettingsAppDialog(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 199
    invoke-static {p0, p1, v0}, Lcom/shopkick/app/permissions/PermissionUtils;->showOpenSettingsAppDialog(Landroid/content/Context;[Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public static showOpenSettingsAppDialog(Landroid/content/Context;[Ljava/lang/String;Landroid/content/DialogInterface$OnDismissListener;)V
    .locals 8
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # [Ljava/lang/String;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 170
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 171
    array-length v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p1, v3

    .line 172
    invoke-static {p0, v4}, Lcom/shopkick/app/permissions/PermissionUtils;->getPermissionGroupFromPermission(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/shopkick/app/permissions/PermissionUtils;->getReadablePermissionGroup(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    .line 173
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 174
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 177
    :cond_1
    new-instance v1, Landroid/support/v7/app/AlertDialog$Builder;

    new-instance v3, Landroid/view/ContextThemeWrapper;

    const v4, 0x7f120208

    invoke-direct {v3, p0, v4}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v1, v3}, Landroid/support/v7/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 178
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0f002f

    .line 179
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const-string v7, ", "

    .line 180
    invoke-static {v0, v7}, Lcom/appboy/support/StringUtils;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v6, v2

    .line 178
    invoke-virtual {v3, v4, v5, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/support/v7/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f11014f

    new-instance v3, Lcom/shopkick/app/permissions/-$$Lambda$PermissionUtils$CB9kYaDdHB0SWxhv1hQuXCYwSEA;

    invoke-direct {v3, p0, p1}, Lcom/shopkick/app/permissions/-$$Lambda$PermissionUtils$CB9kYaDdHB0SWxhv1hQuXCYwSEA;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 181
    invoke-virtual {v0, v2, v3}, Landroid/support/v7/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    move-result-object v0

    const v2, 0x7f110140

    new-instance v3, Lcom/shopkick/app/permissions/-$$Lambda$PermissionUtils$b9ntsbh1aI9e5Dns0-BQT4szUsQ;

    invoke-direct {v3, p0, p1}, Lcom/shopkick/app/permissions/-$$Lambda$PermissionUtils$b9ntsbh1aI9e5Dns0-BQT4szUsQ;-><init>(Landroid/content/Context;[Ljava/lang/String;)V

    .line 186
    invoke-virtual {v0, v2, v3}, Landroid/support/v7/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/AlertDialog$Builder;

    if-eqz p2, :cond_2

    .line 192
    invoke-virtual {v1, p2}, Landroid/support/v7/app/AlertDialog$Builder;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)Landroid/support/v7/app/AlertDialog$Builder;

    .line 195
    :cond_2
    invoke-virtual {v1}, Landroid/support/v7/app/AlertDialog$Builder;->create()Landroid/support/v7/app/AlertDialog;

    move-result-object p0

    invoke-virtual {p0}, Landroid/support/v7/app/AlertDialog;->show()V

    return-void
.end method
