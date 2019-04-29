.class public Lio/sentry/connection/ConnectionException;
.super Ljava/lang/RuntimeException;
.source "ConnectionException.java"


# instance fields
.field private recommendedLockdownTime:Ljava/lang/Long;

.field private responseCode:Ljava/lang/Integer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lio/sentry/connection/ConnectionException;->recommendedLockdownTime:Ljava/lang/Long;

    .line 17
    iput-object v0, p0, Lio/sentry/connection/ConnectionException;->responseCode:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lio/sentry/connection/ConnectionException;->recommendedLockdownTime:Ljava/lang/Long;

    .line 17
    iput-object p1, p0, Lio/sentry/connection/ConnectionException;->responseCode:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/Long;Ljava/lang/Integer;)V
    .locals 0

    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 12
    iput-object p1, p0, Lio/sentry/connection/ConnectionException;->recommendedLockdownTime:Ljava/lang/Long;

    .line 17
    iput-object p1, p0, Lio/sentry/connection/ConnectionException;->responseCode:Ljava/lang/Integer;

    .line 30
    iput-object p3, p0, Lio/sentry/connection/ConnectionException;->recommendedLockdownTime:Ljava/lang/Long;

    .line 31
    iput-object p4, p0, Lio/sentry/connection/ConnectionException;->responseCode:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public getRecommendedLockdownTime()Ljava/lang/Long;
    .locals 1

    .line 35
    iget-object v0, p0, Lio/sentry/connection/ConnectionException;->recommendedLockdownTime:Ljava/lang/Long;

    return-object v0
.end method

.method public getResponseCode()Ljava/lang/Integer;
    .locals 1

    .line 39
    iget-object v0, p0, Lio/sentry/connection/ConnectionException;->responseCode:Ljava/lang/Integer;

    return-object v0
.end method
