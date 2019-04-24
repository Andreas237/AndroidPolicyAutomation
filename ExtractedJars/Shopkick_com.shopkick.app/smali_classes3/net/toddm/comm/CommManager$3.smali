.class Lnet/toddm/comm/CommManager$3;
.super Ljava/lang/Object;
.source "CommManager.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/toddm/comm/CommManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lnet/toddm/comm/CommWork;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lnet/toddm/comm/CommManager;


# direct methods
.method constructor <init>(Lnet/toddm/comm/CommManager;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/toddm/comm/CommManager$3;->this$0:Lnet/toddm/comm/CommManager;

    .line 672
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lnet/toddm/comm/CommWork;

    check-cast p2, Lnet/toddm/comm/CommWork;

    invoke-virtual {p0, p1, p2}, Lnet/toddm/comm/CommManager$3;->compare(Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommWork;)I

    move-result p1

    return p1
.end method

.method public compare(Lnet/toddm/comm/CommWork;Lnet/toddm/comm/CommWork;)I
    .locals 1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_0

    .line 677
    iget-object v0, p0, Lnet/toddm/comm/CommManager$3;->this$0:Lnet/toddm/comm/CommManager;

    invoke-static {v0}, Lnet/toddm/comm/CommManager;->access$0(Lnet/toddm/comm/CommManager;)Lnet/toddm/comm/PriorityManagementProvider;

    move-result-object v0

    invoke-interface {v0}, Lnet/toddm/comm/PriorityManagementProvider;->getPriorityComparator()Ljava/util/Comparator;

    move-result-object v0

    invoke-virtual {p1}, Lnet/toddm/comm/CommWork;->getRequestPriority()Lnet/toddm/comm/Priority;

    move-result-object p1

    invoke-virtual {p2}, Lnet/toddm/comm/CommWork;->getRequestPriority()Lnet/toddm/comm/Priority;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1

    .line 676
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'rhs\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 675
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "\'lhs\' can not be NULL"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
