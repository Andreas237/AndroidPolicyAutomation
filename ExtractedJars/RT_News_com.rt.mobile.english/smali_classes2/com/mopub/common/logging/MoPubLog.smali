.class public Lcom/mopub/common/logging/MoPubLog;
.super Ljava/lang/Object;
.source "MoPubLog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/common/logging/MoPubLog$MoPubLogHandler;
    }
.end annotation


# static fields
.field private static final LOGGER:Ljava/util/logging/Logger;

.field public static final LOGGER_NAMESPACE:Ljava/lang/String; = "com.mopub"

.field private static final LOGTAG:Ljava/lang/String; = "MoPub"

.field private static final LOG_HANDLER:Lcom/mopub/common/logging/MoPubLog$MoPubLogHandler;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "com.mopub"

    .line 21
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/mopub/common/logging/MoPubLog;->LOGGER:Ljava/util/logging/Logger;

    .line 22
    new-instance v0, Lcom/mopub/common/logging/MoPubLog$MoPubLogHandler;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mopub/common/logging/MoPubLog$MoPubLogHandler;-><init>(Lcom/mopub/common/logging/MoPubLog$1;)V

    sput-object v0, Lcom/mopub/common/logging/MoPubLog;->LOG_HANDLER:Lcom/mopub/common/logging/MoPubLog$MoPubLogHandler;

    .line 29
    sget-object v0, Lcom/mopub/common/logging/MoPubLog;->LOGGER:Ljava/util/logging/Logger;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->setUseParentHandlers(Z)V

    .line 30
    sget-object v0, Lcom/mopub/common/logging/MoPubLog;->LOGGER:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->ALL:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->setLevel(Ljava/util/logging/Level;)V

    .line 31
    sget-object v0, Lcom/mopub/common/logging/MoPubLog;->LOG_HANDLER:Lcom/mopub/common/logging/MoPubLog$MoPubLogHandler;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Lcom/mopub/common/logging/MoPubLog$MoPubLogHandler;->setLevel(Ljava/util/logging/Level;)V

    .line 33
    invoke-static {}, Ljava/util/logging/LogManager;->getLogManager()Ljava/util/logging/LogManager;

    move-result-object v0

    sget-object v1, Lcom/mopub/common/logging/MoPubLog;->LOGGER:Ljava/util/logging/Logger;

    invoke-virtual {v0, v1}, Ljava/util/logging/LogManager;->addLogger(Ljava/util/logging/Logger;)Z

    .line 34
    sget-object v0, Lcom/mopub/common/logging/MoPubLog;->LOGGER:Ljava/util/logging/Logger;

    sget-object v1, Lcom/mopub/common/logging/MoPubLog;->LOG_HANDLER:Lcom/mopub/common/logging/MoPubLog$MoPubLogHandler;

    invoke-static {v0, v1}, Lcom/mopub/common/logging/MoPubLog;->addHandler(Ljava/util/logging/Logger;Ljava/util/logging/Handler;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static addHandler(Ljava/util/logging/Logger;Ljava/util/logging/Handler;)V
    .locals 4
    .param p0    # Ljava/util/logging/Logger;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p1    # Ljava/util/logging/Handler;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 97
    invoke-virtual {p0}, Ljava/util/logging/Logger;->getHandlers()[Ljava/util/logging/Handler;

    move-result-object v0

    const/4 v1, 0x0

    .line 98
    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    .line 99
    invoke-virtual {v3, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 103
    :cond_1
    invoke-virtual {p0, p1}, Ljava/util/logging/Logger;->addHandler(Ljava/util/logging/Handler;)V

    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 40
    invoke-static {p0, v0}, Lcom/mopub/common/logging/MoPubLog;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 64
    sget-object v0, Lcom/mopub/common/logging/MoPubLog;->LOGGER:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINEST:Ljava/util/logging/Level;

    invoke-virtual {v0, v1, p0, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static d(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 48
    invoke-static {p0, v0}, Lcom/mopub/common/logging/MoPubLog;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 72
    sget-object v0, Lcom/mopub/common/logging/MoPubLog;->LOGGER:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->CONFIG:Ljava/util/logging/Level;

    invoke-virtual {v0, v1, p0, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static e(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 60
    invoke-static {p0, v0}, Lcom/mopub/common/logging/MoPubLog;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 84
    sget-object v0, Lcom/mopub/common/logging/MoPubLog;->LOGGER:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1, p0, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static i(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 52
    invoke-static {p0, v0}, Lcom/mopub/common/logging/MoPubLog;->i(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 76
    sget-object v0, Lcom/mopub/common/logging/MoPubLog;->LOGGER:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    invoke-virtual {v0, v1, p0, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static setSdkHandlerLevel(Ljava/util/logging/Level;)V
    .locals 1
    .param p0    # Ljava/util/logging/Level;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .annotation build Lcom/mopub/common/VisibleForTesting;
    .end annotation

    .line 89
    sget-object v0, Lcom/mopub/common/logging/MoPubLog;->LOG_HANDLER:Lcom/mopub/common/logging/MoPubLog$MoPubLogHandler;

    invoke-virtual {v0, p0}, Lcom/mopub/common/logging/MoPubLog$MoPubLogHandler;->setLevel(Ljava/util/logging/Level;)V

    return-void
.end method

.method public static v(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 44
    invoke-static {p0, v0}, Lcom/mopub/common/logging/MoPubLog;->v(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 68
    sget-object v0, Lcom/mopub/common/logging/MoPubLog;->LOGGER:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1, p0, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static w(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 56
    invoke-static {p0, v0}, Lcom/mopub/common/logging/MoPubLog;->w(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 80
    sget-object v0, Lcom/mopub/common/logging/MoPubLog;->LOGGER:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    invoke-virtual {v0, v1, p0, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
