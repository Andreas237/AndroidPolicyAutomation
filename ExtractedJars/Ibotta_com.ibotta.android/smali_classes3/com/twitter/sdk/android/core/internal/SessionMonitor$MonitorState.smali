.class public Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;
.super Ljava/lang/Object;
.source "SessionMonitor.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/twitter/sdk/android/core/internal/SessionMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "MonitorState"
.end annotation


# instance fields
.field public lastVerification:J

.field private final utcCalendar:Ljava/util/Calendar;

.field public verifying:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "UTC"

    .line 123
    invoke-static {v0}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v0

    iput-object v0, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->utcCalendar:Ljava/util/Calendar;

    return-void
.end method

.method private isOnSameDate(JJ)Z
    .locals 3

    .line 143
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->utcCalendar:Ljava/util/Calendar;

    invoke-virtual {v0, p1, p2}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 144
    iget-object p1, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->utcCalendar:Ljava/util/Calendar;

    const/4 p2, 0x6

    invoke-virtual {p1, p2}, Ljava/util/Calendar;->get(I)I

    move-result p1

    .line 145
    iget-object v0, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->utcCalendar:Ljava/util/Calendar;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->get(I)I

    move-result v0

    .line 147
    iget-object v2, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->utcCalendar:Ljava/util/Calendar;

    invoke-virtual {v2, p3, p4}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 148
    iget-object p3, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->utcCalendar:Ljava/util/Calendar;

    invoke-virtual {p3, p2}, Ljava/util/Calendar;->get(I)I

    move-result p2

    .line 149
    iget-object p3, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->utcCalendar:Ljava/util/Calendar;

    invoke-virtual {p3, v1}, Ljava/util/Calendar;->get(I)I

    move-result p3

    if-ne p1, p2, :cond_0

    if-ne v0, p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method


# virtual methods
.method public declared-synchronized beginVerification(J)Z
    .locals 7

    monitor-enter p0

    .line 127
    :try_start_0
    iget-wide v0, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->lastVerification:J

    sub-long v0, p1, v0

    const-wide/32 v2, 0x1499700

    const/4 v4, 0x1

    const/4 v5, 0x0

    cmp-long v6, v0, v2

    if-lez v6, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 129
    :goto_0
    iget-wide v1, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->lastVerification:J

    invoke-direct {p0, p1, p2, v1, v2}, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->isOnSameDate(JJ)Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    .line 131
    :goto_1
    iget-boolean p2, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->verifying:Z

    if-nez p2, :cond_3

    if-nez v0, :cond_2

    if-eqz p1, :cond_3

    .line 132
    :cond_2
    iput-boolean v4, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->verifying:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v4

    .line 134
    :cond_3
    monitor-exit p0

    return v5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized endVerification(J)V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x0

    .line 138
    :try_start_0
    iput-boolean v0, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->verifying:Z

    .line 139
    iput-wide p1, p0, Lcom/twitter/sdk/android/core/internal/SessionMonitor$MonitorState;->lastVerification:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 140
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
