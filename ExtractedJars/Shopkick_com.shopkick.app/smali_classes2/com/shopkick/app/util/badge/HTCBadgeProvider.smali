.class Lcom/shopkick/app/util/badge/HTCBadgeProvider;
.super Ljava/lang/Object;
.source "HTCBadgeProvider.java"

# interfaces
.implements Lcom/shopkick/app/util/badge/IBadgeProvider;


# static fields
.field private static final COUNT:Ljava/lang/String; = "count"

.field private static final EXTRA_COMPONENT:Ljava/lang/String; = "com.htc.launcher.extra.COMPONENT"

.field private static final EXTRA_COUNT:Ljava/lang/String; = "com.htc.launcher.extra.COUNT"

.field private static final HTC_LAUNCHER_PACKAGE_NAME:Ljava/lang/String; = "com.htc.launcher"

.field private static final INTENT_SET_NOTIFICATION:Ljava/lang/String; = "com.htc.launcher.action.SET_NOTIFICATION"

.field private static final INTENT_UPDATE_SHORTCUT:Ljava/lang/String; = "com.htc.launcher.action.UPDATE_SHORTCUT"

.field private static final PACKAGENAME:Ljava/lang/String; = "packagename"


# instance fields
.field private appContext:Landroid/content/Context;

.field private componentName:Landroid/content/ComponentName;

.field private homePackageName:Ljava/lang/String;


# direct methods
.method constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Ljava/lang/String;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/shopkick/app/util/badge/HTCBadgeProvider;->appContext:Landroid/content/Context;

    .line 28
    iput-object p2, p0, Lcom/shopkick/app/util/badge/HTCBadgeProvider;->componentName:Landroid/content/ComponentName;

    .line 29
    iput-object p3, p0, Lcom/shopkick/app/util/badge/HTCBadgeProvider;->homePackageName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public setBadge(I)V
    .locals 4

    .line 46
    new-instance v0, Landroid/content/Intent;

    const-string v1, "com.htc.launcher.action.SET_NOTIFICATION"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.htc.launcher.extra.COMPONENT"

    .line 47
    iget-object v2, p0, Lcom/shopkick/app/util/badge/HTCBadgeProvider;->componentName:Landroid/content/ComponentName;

    invoke-virtual {v2}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.htc.launcher.extra.COUNT"

    .line 48
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 50
    new-instance v1, Landroid/content/Intent;

    const-string v2, "com.htc.launcher.action.UPDATE_SHORTCUT"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v2, "packagename"

    .line 51
    iget-object v3, p0, Lcom/shopkick/app/util/badge/HTCBadgeProvider;->componentName:Landroid/content/ComponentName;

    invoke-virtual {v3}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "count"

    .line 52
    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 54
    iget-object p1, p0, Lcom/shopkick/app/util/badge/HTCBadgeProvider;->appContext:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/shopkick/app/util/BroadcastHelper;->canResolveBroadcast(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/shopkick/app/util/badge/HTCBadgeProvider;->appContext:Landroid/content/Context;

    invoke-static {p1, v1}, Lcom/shopkick/app/util/BroadcastHelper;->canResolveBroadcast(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 61
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "Tried to set badge on this HTC launcher but failed. Please investigate."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/util/badge/HTCBadgeProvider;->appContext:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 56
    iget-object p1, p0, Lcom/shopkick/app/util/badge/HTCBadgeProvider;->appContext:Landroid/content/Context;

    invoke-virtual {p1, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    :goto_1
    return-void
.end method

.method public supportBadgeOnDevice()Z
    .locals 2

    .line 37
    iget-object v0, p0, Lcom/shopkick/app/util/badge/HTCBadgeProvider;->homePackageName:Ljava/lang/String;

    const-string v1, "com.htc.launcher"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
