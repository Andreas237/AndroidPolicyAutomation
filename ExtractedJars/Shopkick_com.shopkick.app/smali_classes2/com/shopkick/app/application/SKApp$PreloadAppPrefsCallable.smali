.class Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;
.super Ljava/lang/Object;
.source "SKApp.java"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/application/SKApp;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "PreloadAppPrefsCallable"
.end annotation


# instance fields
.field private appPrefs:Lcom/shopkick/app/application/AppPreferences;

.field private context:Landroid/content/Context;

.field private debugMode:Z


# direct methods
.method public constructor <init>(Lcom/shopkick/app/application/AppPreferences;Landroid/content/Context;Z)V
    .locals 0

    .line 1120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1121
    iput-object p1, p0, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    .line 1122
    iput-object p2, p0, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;->context:Landroid/content/Context;

    .line 1123
    iput-boolean p3, p0, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;->debugMode:Z

    return-void
.end method


# virtual methods
.method public call()Ljava/lang/Object;
    .locals 4

    .line 1128
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getUserAccountJSON()Ljava/lang/String;

    .line 1129
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getAPIManagerToken()Ljava/lang/String;

    .line 1130
    iget-object v0, p0, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->getAppInstalledTimestamp()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 1131
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;->appPrefs:Lcom/shopkick/app/application/AppPreferences;

    invoke-virtual {v1}, Lcom/shopkick/app/application/AppPreferences;->setAppInstalledTimestamp()V

    .line 1133
    iget-object v1, p0, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;->context:Landroid/content/Context;

    iget-boolean v2, p0, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;->debugMode:Z

    invoke-static {v1, v2}, Lcom/shopkick/app/flags/SKFlags;->init(Landroid/content/Context;Z)V

    .line 1134
    invoke-static {}, Lcom/shopkick/app/flags/SKFlags;->getInstance()Lcom/shopkick/app/flags/SKFlags;

    move-result-object v1

    .line 1135
    invoke-static {v1}, Lcom/shopkick/app/application/AppFeatureFlags;->registerFlags(Lcom/shopkick/app/flags/SKFlags;)V

    .line 1136
    invoke-static {v1}, Lcom/shopkick/app/flags/LibFeatureFlags;->registerFlags(Lcom/shopkick/app/flags/SKFlags;)V

    .line 1137
    iget-boolean v2, p0, Lcom/shopkick/app/application/SKApp$PreloadAppPrefsCallable;->debugMode:Z

    if-eqz v2, :cond_1

    .line 1138
    invoke-static {v1}, Lcom/shopkick/app/application/AppDebugFlags;->registerFlags(Lcom/shopkick/app/flags/SKFlags;)V

    .line 1141
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
