.class public Lnet/toddm/comm/RetryProfile;
.super Ljava/lang/Object;
.source "RetryProfile.java"


# instance fields
.field private final _retryAfterMilliseconds:J

.field private final _shouldRetry:Z


# direct methods
.method public constructor <init>(ZJ)V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-boolean p1, p0, Lnet/toddm/comm/RetryProfile;->_shouldRetry:Z

    .line 32
    iput-wide p2, p0, Lnet/toddm/comm/RetryProfile;->_retryAfterMilliseconds:J

    return-void
.end method


# virtual methods
.method public getRetryAfterMilliseconds()J
    .locals 2

    .line 39
    iget-wide v0, p0, Lnet/toddm/comm/RetryProfile;->_retryAfterMilliseconds:J

    return-wide v0
.end method

.method public shouldRetry()Z
    .locals 1

    .line 36
    iget-boolean v0, p0, Lnet/toddm/comm/RetryProfile;->_shouldRetry:Z

    return v0
.end method
