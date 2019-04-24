.class final Lcom/newrelic/agent/android/AndroidAgentImpl$1;
.super Ljava/lang/Object;
.source "AndroidAgentImpl.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/newrelic/agent/android/AndroidAgentImpl;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/newrelic/agent/android/api/common/TransactionData;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 627
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public compare(Lcom/newrelic/agent/android/api/common/TransactionData;Lcom/newrelic/agent/android/api/common/TransactionData;)I
    .locals 5

    .line 630
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getTimestamp()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/newrelic/agent/android/api/common/TransactionData;->getTimestamp()J

    move-result-wide v2

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    const/4 p1, -0x1

    return p1

    .line 632
    :cond_0
    invoke-virtual {p1}, Lcom/newrelic/agent/android/api/common/TransactionData;->getTimestamp()J

    move-result-wide v0

    invoke-virtual {p2}, Lcom/newrelic/agent/android/api/common/TransactionData;->getTimestamp()J

    move-result-wide p1

    cmp-long v2, v0, p1

    if-gez v2, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 627
    check-cast p1, Lcom/newrelic/agent/android/api/common/TransactionData;

    check-cast p2, Lcom/newrelic/agent/android/api/common/TransactionData;

    invoke-virtual {p0, p1, p2}, Lcom/newrelic/agent/android/AndroidAgentImpl$1;->compare(Lcom/newrelic/agent/android/api/common/TransactionData;Lcom/newrelic/agent/android/api/common/TransactionData;)I

    move-result p1

    return p1
.end method
