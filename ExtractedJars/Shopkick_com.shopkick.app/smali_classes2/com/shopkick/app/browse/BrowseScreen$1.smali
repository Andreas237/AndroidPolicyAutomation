.class Lcom/shopkick/app/browse/BrowseScreen$1;
.super Ljava/lang/Object;
.source "BrowseScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/browse/BrowseScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/browse/BrowseScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/browse/BrowseScreen;)V
    .locals 0

    .line 159
    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen$1;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 163
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen$1;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-static {v0}, Lcom/shopkick/app/browse/BrowseScreen;->access$000(Lcom/shopkick/app/browse/BrowseScreen;)Landroid/location/Location;

    move-result-object v0

    if-nez v0, :cond_1

    .line 164
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen$1;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-static {v0, p1}, Lcom/shopkick/app/browse/BrowseScreen;->access$002(Lcom/shopkick/app/browse/BrowseScreen;Landroid/location/Location;)Landroid/location/Location;

    .line 165
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen$1;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/browse/BrowseScreen;->fetchFeed(Z)V

    goto :goto_0

    .line 168
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen$1;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/browse/BrowseScreen;->disableScreenResponsivenessLogging()V

    .line 169
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen$1;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-static {p1}, Lcom/shopkick/app/browse/BrowseScreen;->access$100(Lcom/shopkick/app/browse/BrowseScreen;)V

    .line 170
    iget-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen$1;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-static {p1}, Lcom/shopkick/app/browse/BrowseScreen;->access$200(Lcom/shopkick/app/browse/BrowseScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeLoadingTiles()V

    :cond_1
    :goto_0
    return-void
.end method
