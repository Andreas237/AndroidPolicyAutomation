.class Lcom/shopkick/app/cpg/FilteredOffersListScreen$1;
.super Ljava/lang/Object;
.source "FilteredOffersListScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/cpg/FilteredOffersListScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/cpg/FilteredOffersListScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)V
    .locals 0

    .line 96
    iput-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen$1;->this$0:Lcom/shopkick/app/cpg/FilteredOffersListScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 100
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen$1;->this$0:Lcom/shopkick/app/cpg/FilteredOffersListScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->access$002(Lcom/shopkick/app/cpg/FilteredOffersListScreen;D)D

    .line 101
    iget-object v0, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen$1;->this$0:Lcom/shopkick/app/cpg/FilteredOffersListScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->access$102(Lcom/shopkick/app/cpg/FilteredOffersListScreen;D)D

    .line 102
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen$1;->this$0:Lcom/shopkick/app/cpg/FilteredOffersListScreen;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->access$202(Lcom/shopkick/app/cpg/FilteredOffersListScreen;Z)Z

    .line 103
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen$1;->this$0:Lcom/shopkick/app/cpg/FilteredOffersListScreen;

    invoke-static {p1}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->access$300(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)V

    goto :goto_0

    .line 106
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen$1;->this$0:Lcom/shopkick/app/cpg/FilteredOffersListScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->disableScreenResponsivenessLogging()V

    .line 107
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen$1;->this$0:Lcom/shopkick/app/cpg/FilteredOffersListScreen;

    invoke-static {p1}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->access$400(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeLoadingTiles()V

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/cpg/FilteredOffersListScreen$1;->this$0:Lcom/shopkick/app/cpg/FilteredOffersListScreen;

    invoke-static {p1}, Lcom/shopkick/app/cpg/FilteredOffersListScreen;->access$500(Lcom/shopkick/app/cpg/FilteredOffersListScreen;)Landroid/widget/ProgressBar;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_0
    return-void
.end method
