.class public Lcom/shopkick/app/util/ClockWrapper;
.super Ljava/lang/Object;
.source "ClockWrapper.java"


# instance fields
.field private final clock:Lcom/shopkick/app/util/Clock;

.field private final userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/util/Clock;Lcom/shopkick/app/account/UserAccount;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, Lcom/shopkick/app/util/ClockWrapper;->clock:Lcom/shopkick/app/util/Clock;

    .line 25
    iput-object p2, p0, Lcom/shopkick/app/util/ClockWrapper;->userAccount:Lcom/shopkick/app/account/UserAccount;

    return-void
.end method


# virtual methods
.method public isBeforeMostRecent2AM(J)Z
    .locals 2

    .line 73
    invoke-virtual {p0}, Lcom/shopkick/app/util/ClockWrapper;->mostRecent2AM()J

    move-result-wide v0

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public mostRecent2AM()J
    .locals 6

    .line 38
    iget-object v0, p0, Lcom/shopkick/app/util/ClockWrapper;->clock:Lcom/shopkick/app/util/Clock;

    invoke-virtual {v0}, Lcom/shopkick/app/util/Clock;->millis()J

    move-result-wide v0

    .line 41
    iget-object v2, p0, Lcom/shopkick/app/util/ClockWrapper;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->accountExists()Z

    move-result v2

    if-nez v2, :cond_0

    .line 43
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v2

    goto :goto_0

    .line 44
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/util/ClockWrapper;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/shopkick/app/util/ClockWrapper;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {v2}, Lcom/shopkick/app/account/UserAccount;->getCountry()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v3, 0x3a

    if-ne v2, v3, :cond_1

    const-string v2, "Europe/Berlin"

    .line 45
    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v2

    goto :goto_0

    :cond_1
    const-string v2, "America/Los_Angeles"

    .line 47
    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    move-result-object v2

    .line 49
    :goto_0
    invoke-virtual {v2, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    const/16 v3, 0xb

    const/4 v4, 0x2

    .line 50
    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->set(II)V

    const/16 v3, 0xc

    const/4 v4, 0x0

    .line 51
    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->set(II)V

    const/16 v3, 0xd

    .line 52
    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->set(II)V

    const/16 v3, 0xe

    .line 53
    invoke-virtual {v2, v3, v4}, Ljava/util/Calendar;->set(II)V

    .line 55
    invoke-virtual {v2}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gez v0, :cond_2

    .line 58
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x1

    sget-object v1, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v4, v5, v1}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    sub-long/2addr v2, v0

    return-wide v2

    :cond_2
    return-wide v2
.end method
