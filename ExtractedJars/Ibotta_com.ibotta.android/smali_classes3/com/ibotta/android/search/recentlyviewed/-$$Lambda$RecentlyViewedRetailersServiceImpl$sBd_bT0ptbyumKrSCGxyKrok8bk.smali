.class public final synthetic Lcom/ibotta/android/search/recentlyviewed/-$$Lambda$RecentlyViewedRetailersServiceImpl$sBd_bT0ptbyumKrSCGxyKrok8bk;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# instance fields
.field private final synthetic f$0:Ljava9/util/function/Consumer;


# direct methods
.method public synthetic constructor <init>(Ljava9/util/function/Consumer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/search/recentlyviewed/-$$Lambda$RecentlyViewedRetailersServiceImpl$sBd_bT0ptbyumKrSCGxyKrok8bk;->f$0:Ljava9/util/function/Consumer;

    return-void
.end method


# virtual methods
.method public final onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/-$$Lambda$RecentlyViewedRetailersServiceImpl$sBd_bT0ptbyumKrSCGxyKrok8bk;->f$0:Ljava9/util/function/Consumer;

    invoke-static {v0, p1}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->lambda$loadRecentlyViewedRetailers$0(Ljava9/util/function/Consumer;Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public synthetic onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobListener$-CC;->$default$onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJobListener;Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method
