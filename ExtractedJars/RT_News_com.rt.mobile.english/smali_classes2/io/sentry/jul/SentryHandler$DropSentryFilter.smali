.class Lio/sentry/jul/SentryHandler$DropSentryFilter;
.super Ljava/lang/Object;
.source "SentryHandler.java"

# interfaces
.implements Ljava/util/logging/Filter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/jul/SentryHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DropSentryFilter"
.end annotation


# instance fields
.field final synthetic this$0:Lio/sentry/jul/SentryHandler;


# direct methods
.method private constructor <init>(Lio/sentry/jul/SentryHandler;)V
    .locals 0

    .line 207
    iput-object p1, p0, Lio/sentry/jul/SentryHandler$DropSentryFilter;->this$0:Lio/sentry/jul/SentryHandler;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/sentry/jul/SentryHandler;Lio/sentry/jul/SentryHandler$1;)V
    .locals 0

    .line 207
    invoke-direct {p0, p1}, Lio/sentry/jul/SentryHandler$DropSentryFilter;-><init>(Lio/sentry/jul/SentryHandler;)V

    return-void
.end method


# virtual methods
.method public isLoggable(Ljava/util/logging/LogRecord;)Z
    .locals 1

    .line 210
    invoke-virtual {p1}, Ljava/util/logging/LogRecord;->getLoggerName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "io.sentry"

    .line 211
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
