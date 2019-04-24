.class public interface abstract Lnet/toddm/comm/PriorityManagementProvider;
.super Ljava/lang/Object;
.source "PriorityManagementProvider.java"


# virtual methods
.method public abstract getPriorityComparator()Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "Lnet/toddm/comm/Priority;",
            ">;"
        }
    .end annotation
.end method

.method public abstract promotePriority(Lnet/toddm/comm/Priority;)V
.end method
