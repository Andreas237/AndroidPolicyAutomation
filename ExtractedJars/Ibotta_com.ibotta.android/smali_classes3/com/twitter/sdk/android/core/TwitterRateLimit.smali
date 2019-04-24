.class Lcom/twitter/sdk/android/core/TwitterRateLimit;
.super Ljava/lang/Object;
.source "TwitterRateLimit.java"


# instance fields
.field private final epochSeconds:J

.field private remainingRequest:I

.field private requestLimit:I

.field private resetSeconds:J


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lretrofit/client/Header;",
            ">;)V"
        }
    .end annotation

    .line 43
    new-instance v0, Lio/fabric/sdk/android/services/common/SystemCurrentTimeProvider;

    invoke-direct {v0}, Lio/fabric/sdk/android/services/common/SystemCurrentTimeProvider;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/twitter/sdk/android/core/TwitterRateLimit;-><init>(Ljava/util/List;Lio/fabric/sdk/android/services/common/CurrentTimeProvider;)V

    return-void
.end method

.method constructor <init>(Ljava/util/List;Lio/fabric/sdk/android/services/common/CurrentTimeProvider;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lretrofit/client/Header;",
            ">;",
            "Lio/fabric/sdk/android/services/common/CurrentTimeProvider;",
            ")V"
        }
    .end annotation

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_4

    .line 50
    invoke-interface {p2}, Lio/fabric/sdk/android/services/common/CurrentTimeProvider;->getCurrentTimeMillis()J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iput-wide v0, p0, Lcom/twitter/sdk/android/core/TwitterRateLimit;->epochSeconds:J

    .line 51
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lretrofit/client/Header;

    const-string v0, "x-rate-limit-limit"

    .line 52
    invoke-virtual {p2}, Lretrofit/client/Header;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 53
    invoke-virtual {p2}, Lretrofit/client/Header;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p0, Lcom/twitter/sdk/android/core/TwitterRateLimit;->requestLimit:I

    goto :goto_0

    :cond_1
    const-string v0, "x-rate-limit-remaining"

    .line 54
    invoke-virtual {p2}, Lretrofit/client/Header;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 55
    invoke-virtual {p2}, Lretrofit/client/Header;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    iput p2, p0, Lcom/twitter/sdk/android/core/TwitterRateLimit;->remainingRequest:I

    goto :goto_0

    :cond_2
    const-string v0, "x-rate-limit-reset"

    .line 56
    invoke-virtual {p2}, Lretrofit/client/Header;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 57
    invoke-virtual {p2}, Lretrofit/client/Header;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/twitter/sdk/android/core/TwitterRateLimit;->resetSeconds:J

    goto :goto_0

    :cond_3
    return-void

    .line 48
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "headers must not be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
