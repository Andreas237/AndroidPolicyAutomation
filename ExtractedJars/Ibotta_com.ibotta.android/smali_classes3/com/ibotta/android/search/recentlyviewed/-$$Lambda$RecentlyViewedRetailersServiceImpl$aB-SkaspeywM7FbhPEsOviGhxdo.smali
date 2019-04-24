.class public final synthetic Lcom/ibotta/android/search/recentlyviewed/-$$Lambda$RecentlyViewedRetailersServiceImpl$aB-SkaspeywM7FbhPEsOviGhxdo;
.super Ljava/lang/Object;
.source "lambda"

# interfaces
.implements Lcom/ibotta/android/service/api/job/ApiJobListener;


# instance fields
.field private final synthetic f$0:Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;


# direct methods
.method public synthetic constructor <init>(Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/search/recentlyviewed/-$$Lambda$RecentlyViewedRetailersServiceImpl$aB-SkaspeywM7FbhPEsOviGhxdo;->f$0:Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;

    return-void
.end method


# virtual methods
.method public final onApiJobFinished(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    iget-object v0, p0, Lcom/ibotta/android/search/recentlyviewed/-$$Lambda$RecentlyViewedRetailersServiceImpl$aB-SkaspeywM7FbhPEsOviGhxdo;->f$0:Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;

    invoke-static {v0, p1}, Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;->lambda$aB-SkaspeywM7FbhPEsOviGhxdo(Lcom/ibotta/android/search/recentlyviewed/RecentlyViewedRetailersServiceImpl;Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method public synthetic onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/ibotta/android/service/api/job/ApiJobListener$-CC;->$default$onApiJobLongTask(Lcom/ibotta/android/service/api/job/ApiJobListener;Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method
