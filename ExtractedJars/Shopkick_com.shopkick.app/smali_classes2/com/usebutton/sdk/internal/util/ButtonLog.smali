.class public Lcom/usebutton/sdk/internal/util/ButtonLog;
.super Ljava/lang/Object;
.source "ButtonLog.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;
    }
.end annotation


# static fields
.field private static final ANDROID_LOGGER:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

.field public static final SDK_TAG:Ljava/lang/String; = "ButtonSDK"

.field private static sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;


# instance fields
.field private mIsPartnerLoggingEnabled:Z

.field private final mLogger:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

.field private final mMinimumLogLevel:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 20
    new-instance v0, Lcom/usebutton/sdk/internal/util/ButtonLog$1;

    invoke-direct {v0}, Lcom/usebutton/sdk/internal/util/ButtonLog$1;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->ANDROID_LOGGER:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    .line 45
    new-instance v0, Lcom/usebutton/sdk/internal/util/ButtonLog;

    sget-object v1, Lcom/usebutton/sdk/internal/util/ButtonLog;->ANDROID_LOGGER:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;-><init>(Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;I)V

    sput-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;I)V
    .locals 0

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    iput-object p1, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mLogger:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    .line 52
    iput p2, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mMinimumLogLevel:I

    return-void
.end method

.method private doLogInfo(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 120
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->isLoggingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mLogger:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private varargs doLogInfo(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 126
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->isLoggingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 127
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mLogger:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    invoke-direct {p0, p2, p3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->safelyFormat(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private doWarn(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 144
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->isLoggingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 145
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mLogger:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private varargs doWarn(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 150
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->isLoggingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 151
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mLogger:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    invoke-direct {p0, p2, p3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->safelyFormat(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static final info(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Size;
            max = 0x17L
        .end annotation
    .end param

    .line 73
    sget-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->doLogInfo(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final varargs infoFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Size;
            max = 0x17L
        .end annotation
    .end param

    .line 77
    sget-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    invoke-direct {v0, p0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->doLogInfo(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method private isLoggingEnabled()Z
    .locals 2

    const-string v0, "ButtonSDK"

    .line 174
    iget v1, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mMinimumLogLevel:I

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static isPartnerLoggingEnabled()Z
    .locals 1

    .line 61
    sget-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    iget-boolean v0, v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mIsPartnerLoggingEnabled:Z

    return v0
.end method

.method private varargs safelyFormat(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 157
    :try_start_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-static {v0, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/util/IllegalFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    return-object p1
.end method

.method public static setPartnerLoggingEnabled(Z)V
    .locals 1

    .line 56
    sget-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->doSetPartnerLoggingEnabled(Z)V

    return-void
.end method

.method public static final verbose(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Size;
            max = 0x17L
        .end annotation
    .end param

    .line 81
    sget-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    invoke-virtual {v0, p0, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->doVerbose(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final varargs verboseFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Size;
            max = 0x17L
        .end annotation
    .end param

    .line 85
    sget-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    invoke-virtual {v0, p0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->doVerbose(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static visible(Ljava/lang/String;)V
    .locals 1

    .line 65
    sget-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    invoke-virtual {v0, p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->doVisible(Ljava/lang/String;)V

    return-void
.end method

.method public static varargs visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 69
    sget-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    invoke-virtual {v0, p0, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->doVisible(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public static final warn(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Size;
            max = 0x17L
        .end annotation
    .end param

    .line 89
    sget-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    invoke-direct {v0, p0, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->doWarn(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final warn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Size;
            max = 0x17L
        .end annotation
    .end param

    .line 97
    sget-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    invoke-virtual {v0, p0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->doWarn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static final varargs warnFormat(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1
    .param p0    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Size;
            max = 0x17L
        .end annotation
    .end param

    .line 93
    sget-object v0, Lcom/usebutton/sdk/internal/util/ButtonLog;->sLog:Lcom/usebutton/sdk/internal/util/ButtonLog;

    invoke-direct {v0, p0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->doWarn(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method declared-synchronized doSetPartnerLoggingEnabled(Z)V
    .locals 0

    monitor-enter p0

    .line 101
    :try_start_0
    iput-boolean p1, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mIsPartnerLoggingEnabled:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 102
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method doVerbose(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 132
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->isLoggingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 133
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mLogger:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method varargs doVerbose(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 138
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->isLoggingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mLogger:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    invoke-direct {p0, p2, p3}, Lcom/usebutton/sdk/internal/util/ButtonLog;->safelyFormat(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;->d(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method declared-synchronized doVisible(Ljava/lang/String;)V
    .locals 2

    monitor-enter p0

    .line 105
    :try_start_0
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mIsPartnerLoggingEnabled:Z

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mLogger:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    const-string v1, "ButtonSDK"

    invoke-interface {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const-string v0, "ButtonSDK"

    .line 109
    invoke-virtual {p0, v0, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->doVerbose(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    :goto_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method varargs declared-synchronized doVisible(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    monitor-enter p0

    .line 114
    :try_start_0
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mIsPartnerLoggingEnabled:Z

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mLogger:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    const-string v1, "ButtonSDK"

    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->safelyFormat(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;->i(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    :cond_0
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method doWarn(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .line 164
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/util/ButtonLog;->isLoggingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/usebutton/sdk/internal/util/ButtonLog;->mLogger:Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;

    invoke-interface {v0, p1, p2, p3}, Lcom/usebutton/sdk/internal/util/ButtonLog$Logger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
