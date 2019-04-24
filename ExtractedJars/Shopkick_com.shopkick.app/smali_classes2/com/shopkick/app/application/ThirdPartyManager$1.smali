.class Lcom/shopkick/app/application/ThirdPartyManager$1;
.super Ljava/lang/Object;
.source "ThirdPartyManager.java"

# interfaces
.implements Lcom/github/anrwatchdog/ANRWatchDog$ANRListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/application/ThirdPartyManager;-><init>(Lcom/shopkick/app/util/NotificationCenter;Landroid/content/Context;Lcom/shopkick/app/account/UserAccountDataSource;Lcom/shopkick/app/application/ClientFlagsManager;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/application/ThirdPartyManager;


# direct methods
.method constructor <init>(Lcom/shopkick/app/application/ThirdPartyManager;)V
    .locals 0

    .line 87
    iput-object p1, p0, Lcom/shopkick/app/application/ThirdPartyManager$1;->this$0:Lcom/shopkick/app/application/ThirdPartyManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAppNotResponding(Lcom/github/anrwatchdog/ANRError;)V
    .locals 5

    .line 90
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v1, "ANR Error detected. ToString = %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/github/anrwatchdog/ANRError;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 91
    invoke-static {}, Lcom/shopkick/app/application/CrashlyticsWrapper;->getInstance()Lcom/shopkick/app/application/CrashlyticsWrapper;

    move-result-object v1

    const-string v2, "ANRWatchdog"

    invoke-virtual {v1, v2, v0}, Lcom/shopkick/app/application/CrashlyticsWrapper;->log(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    invoke-static {p1}, Lcom/crashlytics/android/Crashlytics;->logException(Ljava/lang/Throwable;)V

    return-void
.end method
