.class Lnet/toddm/comm/CommWork$1;
.super Ljava/lang/Object;
.source "CommWork.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/CommWork;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lnet/toddm/comm/Response;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 367
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lnet/toddm/comm/Response;

    check-cast p2, Lnet/toddm/comm/Response;

    invoke-virtual {p0, p1, p2}, Lnet/toddm/comm/CommWork$1;->compare(Lnet/toddm/comm/Response;Lnet/toddm/comm/Response;)I

    move-result p1

    return p1
.end method

.method public compare(Lnet/toddm/comm/Response;Lnet/toddm/comm/Response;)I
    .locals 2

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 375
    invoke-virtual {p1}, Lnet/toddm/comm/Response;->getInstanceCreationTime()J

    move-result-wide v0

    invoke-virtual {p2}, Lnet/toddm/comm/Response;->getInstanceCreationTime()J

    move-result-wide p1

    sub-long/2addr v0, p1

    long-to-int p1, v0

    return p1

    .line 371
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'rhs\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 370
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'lhs\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
