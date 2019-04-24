.class Lcom/usebutton/sdk/internal/api/SessionRateLimiter;
.super Ljava/lang/Object;
.source "SessionRateLimiter.java"


# static fields
.field private static final MAX_RESET_MILLI_SECONDS:I = 0xdbba0

.field static final RATE_LIMIT_RESET_HEADER:Ljava/lang/String; = "X-Button-Limit-Reset-Seconds"


# instance fields
.field private clock:Lcom/usebutton/sdk/internal/functional/Getter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private sessionRateLimitEnd:J


# direct methods
.method constructor <init>()V
    .locals 2

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/api/SessionRateLimiter$1;-><init>(Lcom/usebutton/sdk/internal/api/SessionRateLimiter;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;->clock:Lcom/usebutton/sdk/internal/functional/Getter;

    const-wide/16 v0, 0x0

    .line 33
    iput-wide v0, p0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;->sessionRateLimitEnd:J

    return-void
.end method

.method constructor <init>(Lcom/usebutton/sdk/internal/functional/Getter;)V
    .locals 2
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/usebutton/sdk/internal/functional/Getter<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/api/SessionRateLimiter$1;-><init>(Lcom/usebutton/sdk/internal/api/SessionRateLimiter;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;->clock:Lcom/usebutton/sdk/internal/functional/Getter;

    const-wide/16 v0, 0x0

    .line 33
    iput-wide v0, p0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;->sessionRateLimitEnd:J

    .line 48
    iput-object p1, p0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;->clock:Lcom/usebutton/sdk/internal/functional/Getter;

    return-void
.end method


# virtual methods
.method isRateLimited()Z
    .locals 5

    .line 81
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;->clock:Lcom/usebutton/sdk/internal/functional/Getter;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/functional/Getter;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;->sessionRateLimitEnd:J

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method parseException(Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;)V
    .locals 4

    .line 61
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;->wasRateLimited()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 64
    invoke-virtual {p1}, Lcom/usebutton/sdk/internal/api/ButtonHttpStatusException;->getLimitResetSeconds()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 66
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;->clock:Lcom/usebutton/sdk/internal/functional/Getter;

    invoke-interface {v0}, Lcom/usebutton/sdk/internal/functional/Getter;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 68
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1

    mul-int/lit16 p1, p1, 0x3e8

    const v2, 0xdbba0

    .line 67
    invoke-static {p1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lcom/usebutton/sdk/internal/api/SessionRateLimiter;->sessionRateLimitEnd:J

    :cond_0
    return-void
.end method
