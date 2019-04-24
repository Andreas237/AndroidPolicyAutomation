.class Lnet/toddm/comm/DefaultPriorityManagmentProvider$1;
.super Ljava/lang/Object;
.source "DefaultPriorityManagmentProvider.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/DefaultPriorityManagmentProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lnet/toddm/comm/Priority;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lnet/toddm/comm/Priority;

    check-cast p2, Lnet/toddm/comm/Priority;

    invoke-virtual {p0, p1, p2}, Lnet/toddm/comm/DefaultPriorityManagmentProvider$1;->compare(Lnet/toddm/comm/Priority;Lnet/toddm/comm/Priority;)I

    move-result p1

    return p1
.end method

.method public compare(Lnet/toddm/comm/Priority;Lnet/toddm/comm/Priority;)I
    .locals 7

    if-eqz p1, :cond_5

    if-eqz p2, :cond_4

    const/4 v0, 0x0

    .line 91
    iget v1, p1, Lnet/toddm/comm/Priority;->_priority:I

    iget v2, p2, Lnet/toddm/comm/Priority;->_priority:I

    const/4 v3, 0x1

    const/4 v4, -0x1

    if-ge v1, v2, :cond_0

    move v0, v4

    goto :goto_0

    .line 92
    :cond_0
    iget v1, p1, Lnet/toddm/comm/Priority;->_priority:I

    iget v2, p2, Lnet/toddm/comm/Priority;->_priority:I

    if-le v1, v2, :cond_1

    move v0, v3

    :cond_1
    :goto_0
    if-nez v0, :cond_3

    .line 96
    invoke-virtual {p1}, Lnet/toddm/comm/Priority;->getCreatedTimestamp()J

    move-result-wide v1

    invoke-virtual {p2}, Lnet/toddm/comm/Priority;->getCreatedTimestamp()J

    move-result-wide v5

    cmp-long v1, v1, v5

    if-lez v1, :cond_2

    move v0, v4

    goto :goto_1

    .line 97
    :cond_2
    invoke-virtual {p1}, Lnet/toddm/comm/Priority;->getCreatedTimestamp()J

    move-result-wide v1

    invoke-virtual {p2}, Lnet/toddm/comm/Priority;->getCreatedTimestamp()J

    move-result-wide p1

    cmp-long p1, v1, p1

    if-gez p1, :cond_3

    move v0, v3

    :cond_3
    :goto_1
    return v0

    .line 87
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'rhs\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 86
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'lhs\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
