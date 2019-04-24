.class public interface abstract Lcom/ibotta/android/mvp/ui/activity/earnings/EarningsLoaderListener;
.super Ljava/lang/Object;
.source "EarningsLoaderListener.java"

# interfaces
.implements Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/ibotta/android/mvp/base/loading/pagination/PaginationLoaderListener<",
        "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;",
        ">;"
    }
.end annotation


# virtual methods
.method public abstract onEarningsLoaded(Ljava/util/Set;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Lcom/ibotta/api/call/customer/earnings/CustomerEarningsCall$EarningsFilter;",
            ">;",
            "Ljava/util/List<",
            "Lcom/ibotta/api/model/earnings/Earning;",
            ">;)V"
        }
    .end annotation
.end method
