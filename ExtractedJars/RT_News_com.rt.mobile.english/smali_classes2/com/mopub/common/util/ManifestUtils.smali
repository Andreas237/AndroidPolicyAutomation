.class public Lcom/mopub/common/util/ManifestUtils;
.super Ljava/lang/Object;
.source "ManifestUtils.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;,
        Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;
    }
.end annotation


# static fields
.field private static final REQUIRED_NATIVE_SDK_ACTIVITIES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation
.end field

.field private static final REQUIRED_WEB_VIEW_SDK_ACTIVITIES:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation
.end field

.field private static sFlagCheckUtil:Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 29
    new-instance v0, Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;

    invoke-direct {v0}, Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;-><init>()V

    sput-object v0, Lcom/mopub/common/util/ManifestUtils;->sFlagCheckUtil:Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;

    .line 36
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_WEB_VIEW_SDK_ACTIVITIES:Ljava/util/List;

    .line 39
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_WEB_VIEW_SDK_ACTIVITIES:Ljava/util/List;

    const-class v1, Lcom/mopub/mobileads/MoPubActivity;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_WEB_VIEW_SDK_ACTIVITIES:Ljava/util/List;

    const-class v1, Lcom/mopub/mobileads/MraidActivity;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_WEB_VIEW_SDK_ACTIVITIES:Ljava/util/List;

    const-class v1, Lcom/mopub/mobileads/MraidVideoPlayerActivity;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_WEB_VIEW_SDK_ACTIVITIES:Ljava/util/List;

    const-class v1, Lcom/mopub/common/MoPubBrowser;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    sput-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_NATIVE_SDK_ACTIVITIES:Ljava/util/List;

    .line 48
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_NATIVE_SDK_ACTIVITIES:Ljava/util/List;

    const-class v1, Lcom/mopub/common/MoPubBrowser;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkNativeActivitiesDeclared(Landroid/content/Context;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "context is not allowed to be null"

    .line 61
    invoke-static {p0, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 65
    :cond_0
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_NATIVE_SDK_ACTIVITIES:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/mopub/common/util/ManifestUtils;->displayWarningForMissingActivities(Landroid/content/Context;Ljava/util/List;)V

    .line 66
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_NATIVE_SDK_ACTIVITIES:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/mopub/common/util/ManifestUtils;->displayWarningForMisconfiguredActivities(Landroid/content/Context;Ljava/util/List;)V

    return-void
.end method

.method public static checkWebViewActivitiesDeclared(Landroid/content/Context;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    const-string v0, "context is not allowed to be null"

    .line 52
    invoke-static {p0, v0}, Lcom/mopub/common/Preconditions$NoThrow;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 56
    :cond_0
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_WEB_VIEW_SDK_ACTIVITIES:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/mopub/common/util/ManifestUtils;->displayWarningForMissingActivities(Landroid/content/Context;Ljava/util/List;)V

    .line 57
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_WEB_VIEW_SDK_ACTIVITIES:Ljava/util/List;

    invoke-static {p0, v0}, Lcom/mopub/common/util/ManifestUtils;->displayWarningForMisconfiguredActivities(Landroid/content/Context;Ljava/util/List;)V

    return-void
.end method

.method static displayWarningForMisconfiguredActivities(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    .line 102
    invoke-static {p0, p1, v0}, Lcom/mopub/common/util/ManifestUtils;->filterDeclaredActivities(Landroid/content/Context;Ljava/util/List;Z)Ljava/util/List;

    move-result-object p1

    .line 104
    invoke-static {p0, p1}, Lcom/mopub/common/util/ManifestUtils;->getMisconfiguredActivities(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    .line 107
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 111
    :cond_0
    invoke-static {p0}, Lcom/mopub/common/util/ManifestUtils;->logWarningToast(Landroid/content/Context;)V

    .line 114
    invoke-static {p0, p1}, Lcom/mopub/common/util/ManifestUtils;->logMisconfiguredActivities(Landroid/content/Context;Ljava/util/List;)V

    return-void
.end method

.method static displayWarningForMissingActivities(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    .line 79
    invoke-static {p0, p1, v0}, Lcom/mopub/common/util/ManifestUtils;->filterDeclaredActivities(Landroid/content/Context;Ljava/util/List;Z)Ljava/util/List;

    move-result-object p1

    .line 82
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 86
    :cond_0
    invoke-static {p0}, Lcom/mopub/common/util/ManifestUtils;->logWarningToast(Landroid/content/Context;)V

    .line 89
    invoke-static {p1}, Lcom/mopub/common/util/ManifestUtils;->logMissingActivities(Ljava/util/List;)V

    return-void
.end method

.method private static filterDeclaredActivities(Landroid/content/Context;Ljava/util/List;Z)Ljava/util/List;
    .locals 3
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;Z)",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation

    .line 134
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 137
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 138
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 140
    invoke-static {p0, v2}, Lcom/mopub/common/util/Intents;->deviceCanHandleIntent(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result v2

    if-ne v2, p2, :cond_0

    .line 141
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static getActivityConfigChanges(Landroid/content/Context;Ljava/lang/Class;)Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Class;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;)",
            "Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/content/pm/PackageManager$NameNotFoundException;
        }
    .end annotation

    .line 218
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    new-instance v1, Landroid/content/ComponentName;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v0

    .line 221
    new-instance v1, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;-><init>(Lcom/mopub/common/util/ManifestUtils$1;)V

    .line 222
    sget-object v2, Lcom/mopub/common/util/ManifestUtils;->sFlagCheckUtil:Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;

    iget v3, v0, Landroid/content/pm/ActivityInfo;->configChanges:I

    const/16 v4, 0x20

    invoke-virtual {v2, p1, v3, v4}, Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;->hasFlag(Ljava/lang/Class;II)Z

    move-result v2

    iput-boolean v2, v1, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;->hasKeyboardHidden:Z

    .line 223
    sget-object v2, Lcom/mopub/common/util/ManifestUtils;->sFlagCheckUtil:Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;

    iget v3, v0, Landroid/content/pm/ActivityInfo;->configChanges:I

    const/16 v4, 0x80

    invoke-virtual {v2, p1, v3, v4}, Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;->hasFlag(Ljava/lang/Class;II)Z

    move-result v2

    iput-boolean v2, v1, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;->hasOrientation:Z

    const/4 v2, 0x1

    .line 224
    iput-boolean v2, v1, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;->hasScreenSize:Z

    .line 228
    invoke-static {}, Lcom/mopub/common/util/VersionCode;->currentApiLevel()Lcom/mopub/common/util/VersionCode;

    move-result-object v2

    sget-object v3, Lcom/mopub/common/util/VersionCode;->HONEYCOMB_MR2:Lcom/mopub/common/util/VersionCode;

    invoke-virtual {v2, v3}, Lcom/mopub/common/util/VersionCode;->isAtLeast(Lcom/mopub/common/util/VersionCode;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget p0, p0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    sget-object v2, Lcom/mopub/common/util/VersionCode;->HONEYCOMB_MR2:Lcom/mopub/common/util/VersionCode;

    invoke-virtual {v2}, Lcom/mopub/common/util/VersionCode;->getApiLevel()I

    move-result v2

    if-lt p0, v2, :cond_0

    .line 230
    sget-object p0, Lcom/mopub/common/util/ManifestUtils;->sFlagCheckUtil:Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;

    iget v0, v0, Landroid/content/pm/ActivityInfo;->configChanges:I

    const/16 v2, 0x400

    invoke-virtual {p0, p1, v0, v2}, Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;->hasFlag(Ljava/lang/Class;II)Z

    move-result p0

    iput-boolean p0, v1, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;->hasScreenSize:Z

    :cond_0
    return-object v1
.end method

.method private static getMisconfiguredActivities(Landroid/content/Context;Ljava/util/List;)Ljava/util/List;
    .locals 4
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/TargetApi;
        value = 0xd
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;)",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation

    .line 151
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 154
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :catch_0
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 157
    :try_start_0
    invoke-static {p0, v1}, Lcom/mopub/common/util/ManifestUtils;->getActivityConfigChanges(Landroid/content/Context;Ljava/lang/Class;)Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;

    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 162
    iget-boolean v3, v2, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;->hasKeyboardHidden:Z

    if-eqz v3, :cond_1

    iget-boolean v3, v2, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;->hasOrientation:Z

    if-eqz v3, :cond_1

    iget-boolean v2, v2, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;->hasScreenSize:Z

    if-nez v2, :cond_0

    .line 163
    :cond_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method static getRequiredNativeSdkActivities()Ljava/util/List;
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 262
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_NATIVE_SDK_ACTIVITIES:Ljava/util/List;

    return-object v0
.end method

.method static getRequiredWebViewSdkActivities()Ljava/util/List;
    .locals 1
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 256
    sget-object v0, Lcom/mopub/common/util/ManifestUtils;->REQUIRED_WEB_VIEW_SDK_ACTIVITIES:Ljava/util/List;

    return-object v0
.end method

.method public static isDebuggable(Landroid/content/Context;)Z
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 118
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p0

    iget p0, p0, Landroid/content/pm/ApplicationInfo;->flags:I

    const/4 v0, 0x2

    .line 119
    invoke-static {p0, v0}, Lcom/mopub/common/util/Utils;->bitMaskContainsFlag(II)Z

    move-result p0

    return p0
.end method

.method private static logMisconfiguredActivities(Landroid/content/Context;Ljava/util/List;)V
    .locals 5
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;)V"
        }
    .end annotation

    .line 184
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "In AndroidManifest, the android:configChanges param is missing values for the following MoPub activities:\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 187
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :catch_0
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    .line 191
    :try_start_0
    invoke-static {p0, v1}, Lcom/mopub/common/util/ManifestUtils;->getActivityConfigChanges(Landroid/content/Context;Ljava/lang/Class;)Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;

    move-result-object v2
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 196
    iget-boolean v3, v2, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;->hasKeyboardHidden:Z

    if-nez v3, :cond_1

    .line 197
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\n\tThe android:configChanges param for activity "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " must include keyboardHidden."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 199
    :cond_1
    iget-boolean v3, v2, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;->hasOrientation:Z

    if-nez v3, :cond_2

    .line 200
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "\n\tThe android:configChanges param for activity "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " must include orientation."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    :cond_2
    iget-boolean v2, v2, Lcom/mopub/common/util/ManifestUtils$ActivityConfigChanges;->hasScreenSize:Z

    if-nez v2, :cond_0

    .line 203
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "\n\tThe android:configChanges param for activity "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " must include screenSize."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    const-string p0, "\n\nPlease update your manifest to include them."

    .line 207
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    return-void
.end method

.method private static logMissingActivities(Ljava/util/List;)V
    .locals 3
    .param p0    # Ljava/util/List;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Landroid/app/Activity;",
            ">;>;)V"
        }
    .end annotation

    .line 171
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AndroidManifest permissions for the following required MoPub activities are missing:\n"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 174
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Class;

    const-string v2, "\n\t"

    .line 175
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string p0, "\n\nPlease update your manifest to include them."

    .line 177
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;)V

    return-void
.end method

.method private static logWarningToast(Landroid/content/Context;)V
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 238
    invoke-static {p0}, Lcom/mopub/common/util/ManifestUtils;->isDebuggable(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "ERROR: YOUR MOPUB INTEGRATION IS INCOMPLETE.\nCheck logcat and update your AndroidManifest.xml with the correct activities and configuration."

    const/4 v1, 0x1

    .line 241
    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    const/4 v0, 0x7

    const/4 v1, 0x0

    .line 242
    invoke-virtual {p0, v0, v1, v1}, Landroid/widget/Toast;->setGravity(III)V

    .line 243
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    :cond_0
    return-void
.end method

.method static setFlagCheckUtil(Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;)V
    .locals 0
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 268
    sput-object p0, Lcom/mopub/common/util/ManifestUtils;->sFlagCheckUtil:Lcom/mopub/common/util/ManifestUtils$FlagCheckUtil;

    return-void
.end method
