.class Lcom/shopkick/app/logging/DiagnosticLoggerConfig;
.super Lcom/shopkick/app/logging/SimpleLoggerConfig;
.source "DiagnosticLoggerConfig.java"

# interfaces
.implements Lcom/shopkick/app/util/INotificationObserver;


# instance fields
.field private clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

.field private final notificationCenter:Lcom/shopkick/app/util/NotificationCenter;


# direct methods
.method constructor <init>(ZJLcom/shopkick/logging/Level;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 0

    .line 26
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/shopkick/app/logging/SimpleLoggerConfig;-><init>(ZJLcom/shopkick/logging/Level;)V

    .line 27
    iput-object p5, p0, Lcom/shopkick/app/logging/DiagnosticLoggerConfig;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string p1, "LOGGING_CONFIGURATION_CLIENT_FLAGS_MANAGER_READY"

    const/4 p2, 0x0

    .line 28
    invoke-virtual {p5, p0, p1, p2}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public isLoggingEnabled()Z
    .locals 1

    .line 38
    iget-object v0, p0, Lcom/shopkick/app/logging/DiagnosticLoggerConfig;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    if-eqz v0, :cond_0

    .line 39
    invoke-static {v0}, Lcom/shopkick/app/util/FeatureFlagHelper;->isDevLoggingEnabled(Lcom/shopkick/app/application/ClientFlagsManager;)Z

    move-result v0

    return v0

    .line 41
    :cond_0
    invoke-super {p0}, Lcom/shopkick/app/logging/SimpleLoggerConfig;->isLoggingEnabled()Z

    move-result v0

    return v0
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "LOGGING_CONFIGURATION_CLIENT_FLAGS_MANAGER_READY"

    .line 47
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 48
    iget-object p1, p0, Lcom/shopkick/app/logging/DiagnosticLoggerConfig;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {p1, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    const-string p1, "CLIENT_FLAGS_MANAGER"

    .line 49
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/application/ClientFlagsManager;

    iput-object p1, p0, Lcom/shopkick/app/logging/DiagnosticLoggerConfig;->clientFlagsManager:Lcom/shopkick/app/application/ClientFlagsManager;

    :cond_0
    return-void
.end method
