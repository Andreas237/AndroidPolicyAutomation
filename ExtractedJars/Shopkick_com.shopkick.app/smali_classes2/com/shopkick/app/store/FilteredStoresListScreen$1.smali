.class Lcom/shopkick/app/store/FilteredStoresListScreen$1;
.super Ljava/lang/Object;
.source "FilteredStoresListScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/FilteredStoresListScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/FilteredStoresListScreen;)V
    .locals 0

    .line 84
    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 88
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/store/FilteredStoresListScreen;->access$002(Lcom/shopkick/app/store/FilteredStoresListScreen;D)D

    .line 89
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresListScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/store/FilteredStoresListScreen;->access$102(Lcom/shopkick/app/store/FilteredStoresListScreen;D)D

    .line 90
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/shopkick/app/store/FilteredStoresListScreen;->access$202(Lcom/shopkick/app/store/FilteredStoresListScreen;Z)Z

    .line 91
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/FilteredStoresListScreen;->access$300(Lcom/shopkick/app/store/FilteredStoresListScreen;)Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->tryRefreshWithoutClear()V

    goto :goto_0

    .line 93
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/store/FilteredStoresListScreen;->disableScreenResponsivenessLogging()V

    .line 94
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/FilteredStoresListScreen;->access$300(Lcom/shopkick/app/store/FilteredStoresListScreen;)Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/feed/DataFeedRecyclerViewAdapter;->removeLoadingTiles()V

    .line 95
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresListScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresListScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/FilteredStoresListScreen;->access$400(Lcom/shopkick/app/store/FilteredStoresListScreen;)Landroid/widget/ProgressBar;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_0
    return-void
.end method
