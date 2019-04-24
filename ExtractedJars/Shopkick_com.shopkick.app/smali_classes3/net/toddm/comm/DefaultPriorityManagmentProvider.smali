.class public Lnet/toddm/comm/DefaultPriorityManagmentProvider;
.super Ljava/lang/Object;
.source "DefaultPriorityManagmentProvider.java"

# interfaces
.implements Lnet/toddm/comm/PriorityManagementProvider;


# static fields
.field private static _PriorityComparator:Ljava/util/Comparator; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lnet/toddm/comm/Priority;",
            ">;"
        }
    .end annotation
.end field

.field private static _PromotionIntervalInMilliseconds:J = 0xea60L


# instance fields
.field private final _logger:Lnet/toddm/cache/LoggingProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 74
    new-instance v0, Lnet/toddm/comm/DefaultPriorityManagmentProvider$1;

    invoke-direct {v0}, Lnet/toddm/comm/DefaultPriorityManagmentProvider$1;-><init>()V

    sput-object v0, Lnet/toddm/comm/DefaultPriorityManagmentProvider;->_PriorityComparator:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Lnet/toddm/cache/LoggingProvider;)V
    .locals 0

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 39
    iput-object p1, p0, Lnet/toddm/comm/DefaultPriorityManagmentProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    return-void
.end method


# virtual methods
.method public getPriorityComparator()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "Lnet/toddm/comm/Priority;",
            ">;"
        }
    .end annotation

    .line 71
    sget-object v0, Lnet/toddm/comm/DefaultPriorityManagmentProvider;->_PriorityComparator:Ljava/util/Comparator;

    return-object v0
.end method

.method public promotePriority(Lnet/toddm/comm/Priority;)V
    .locals 7

    .line 51
    invoke-virtual {p1}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-void

    .line 54
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1}, Lnet/toddm/comm/Priority;->getLastPromotionTimestamp()J

    move-result-wide v4

    sub-long/2addr v2, v4

    sget-wide v4, Lnet/toddm/comm/DefaultPriorityManagmentProvider;->_PromotionIntervalInMilliseconds:J

    cmp-long v0, v2, v4

    const/4 v2, 0x0

    if-ltz v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    if-eqz v0, :cond_3

    .line 58
    iget-object v0, p0, Lnet/toddm/comm/DefaultPriorityManagmentProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    const/4 v3, 0x2

    if-eqz v0, :cond_2

    const-string v4, "promotePriority() PRE [request:%1$d priority:%2$d]"

    new-array v5, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lnet/toddm/comm/Priority;->getWork()Lnet/toddm/comm/Work;

    move-result-object v6

    invoke-interface {v6}, Lnet/toddm/comm/Work;->getId()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v2

    invoke-virtual {p1}, Lnet/toddm/comm/Priority;->getValue()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-interface {v0, v4, v5}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iput-wide v4, p1, Lnet/toddm/comm/Priority;->_lastPromotionTimestamp:J

    .line 60
    iget v0, p1, Lnet/toddm/comm/Priority;->_priority:I

    sub-int/2addr v0, v1

    iput v0, p1, Lnet/toddm/comm/Priority;->_priority:I

    .line 61
    iget-object v0, p0, Lnet/toddm/comm/DefaultPriorityManagmentProvider;->_logger:Lnet/toddm/cache/LoggingProvider;

    if-eqz v0, :cond_3

    const-string v4, "promotePriority() POST [request:%1$d priority:%2$d]"

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p1}, Lnet/toddm/comm/Priority;->getWork()Lnet/toddm/comm/Work;

    move-result-object v5

    invoke-interface {v5}, Lnet/toddm/comm/Work;->getId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v3, v2

    invoke-virtual {p1}, Lnet/toddm/comm/Priority;->getValue()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v1

    invoke-interface {v0, v4, v3}, Lnet/toddm/cache/LoggingProvider;->debug(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_3
    return-void
.end method
