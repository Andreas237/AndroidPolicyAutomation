.class Lcom/shopkick/app/store/FilteredStoresScreen$1;
.super Ljava/lang/Object;
.source "FilteredStoresScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/FilteredStoresScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/FilteredStoresScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/FilteredStoresScreen;)V
    .locals 0

    .line 40
    iput-object p1, p0, Lcom/shopkick/app/store/FilteredStoresScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 44
    iget-object v0, p0, Lcom/shopkick/app/store/FilteredStoresScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresScreen;

    invoke-static {v0, p1}, Lcom/shopkick/app/store/FilteredStoresScreen;->access$002(Lcom/shopkick/app/store/FilteredStoresScreen;Landroid/location/Location;)Landroid/location/Location;

    .line 45
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/FilteredStoresScreen;->access$100(Lcom/shopkick/app/store/FilteredStoresScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    goto :goto_0

    .line 47
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/FilteredStoresScreen$1;->this$0:Lcom/shopkick/app/store/FilteredStoresScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/FilteredStoresScreen;->access$200(Lcom/shopkick/app/store/FilteredStoresScreen;)Landroid/view/View;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    return-void
.end method
