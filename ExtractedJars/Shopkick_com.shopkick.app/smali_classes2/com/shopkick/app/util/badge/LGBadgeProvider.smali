.class Lcom/shopkick/app/util/badge/LGBadgeProvider;
.super Ljava/lang/Object;
.source "LGBadgeProvider.java"

# interfaces
.implements Lcom/shopkick/app/util/badge/IBadgeProvider;


# static fields
.field private static final INTENT_ACTION:Ljava/lang/String; = "android.intent.action.BADGE_COUNT_UPDATE"

.field private static final INTENT_EXTRA_ACTIVITY_NAME:Ljava/lang/String; = "badge_count_class_name"

.field private static final INTENT_EXTRA_BADGE_COUNT:Ljava/lang/String; = "badge_count"

.field private static final INTENT_EXTRA_PACKAGENAME:Ljava/lang/String; = "badge_count_package_name"

.field private static final supportedLaunchers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final appContext:Landroid/content/Context;

.field private final componentName:Landroid/content/ComponentName;

.field private final homePackageName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "com.lge.launcher"

    const-string v1, "com.lge.launcher2"

    .line 21
    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/shopkick/app/util/badge/LGBadgeProvider;->supportedLaunchers:Ljava/util/List;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Ljava/lang/String;)V
    .locals 0

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    iput-object p1, p0, Lcom/shopkick/app/util/badge/LGBadgeProvider;->appContext:Landroid/content/Context;

    .line 31
    iput-object p2, p0, Lcom/shopkick/app/util/badge/LGBadgeProvider;->componentName:Landroid/content/ComponentName;

    .line 32
    iput-object p3, p0, Lcom/shopkick/app/util/badge/LGBadgeProvider;->homePackageName:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public setBadge(I)V
    .locals 4

    .line 48
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.BADGE_COUNT_UPDATE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "badge_count"

    .line 49
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string p1, "badge_count_package_name"

    .line 50
    iget-object v1, p0, Lcom/shopkick/app/util/badge/LGBadgeProvider;->componentName:Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "badge_count_class_name"

    .line 51
    iget-object v1, p0, Lcom/shopkick/app/util/badge/LGBadgeProvider;->componentName:Landroid/content/ComponentName;

    invoke-virtual {v1}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 52
    iget-object p1, p0, Lcom/shopkick/app/util/badge/LGBadgeProvider;->appContext:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/shopkick/app/util/BroadcastHelper;->canResolveBroadcast(Landroid/content/Context;Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 53
    iget-object p1, p0, Lcom/shopkick/app/util/badge/LGBadgeProvider;->appContext:Landroid/content/Context;

    invoke-virtual {p1, v0}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    goto :goto_0

    .line 58
    :cond_0
    invoke-static {}, Lcom/shopkick/logging/LoggerManager;->getInstance()Lcom/shopkick/logging/LoggerManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/logging/LoggerManager;->getDiagnosticLogger()Lcom/shopkick/logging/DiagnosticLogger;

    move-result-object p1

    sget-object v0, Lcom/shopkick/logging/Area;->CRASHLYTICS:Lcom/shopkick/logging/Area;

    invoke-virtual {v0}, Lcom/shopkick/logging/Area;->getValue()J

    move-result-wide v0

    const-string v2, "Tried to set badge on this LG launcher but failed. Please investigate."

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1, v0, v1, v2, v3}, Lcom/shopkick/logging/DiagnosticLogger;->e(JLjava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public supportBadgeOnDevice()Z
    .locals 2

    .line 40
    sget-object v0, Lcom/shopkick/app/util/badge/LGBadgeProvider;->supportedLaunchers:Ljava/util/List;

    iget-object v1, p0, Lcom/shopkick/app/util/badge/LGBadgeProvider;->homePackageName:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method
