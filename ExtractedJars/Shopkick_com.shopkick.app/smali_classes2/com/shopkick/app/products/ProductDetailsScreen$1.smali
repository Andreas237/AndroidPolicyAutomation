.class Lcom/shopkick/app/products/ProductDetailsScreen$1;
.super Ljava/lang/Object;
.source "ProductDetailsScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/products/ProductDetailsScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/products/ProductDetailsScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/products/ProductDetailsScreen;)V
    .locals 0

    .line 93
    iput-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen$1;->this$0:Lcom/shopkick/app/products/ProductDetailsScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$onLocationUpdated$191(Lcom/shopkick/app/products/ProductDetailsScreen$1;)V
    .locals 1

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen$1;->this$0:Lcom/shopkick/app/products/ProductDetailsScreen;

    invoke-static {v0}, Lcom/shopkick/app/products/ProductDetailsScreen;->access$100(Lcom/shopkick/app/products/ProductDetailsScreen;)Lcom/shopkick/app/fetchers/api/skapi/Product;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen$1;->this$0:Lcom/shopkick/app/products/ProductDetailsScreen;

    invoke-static {v0}, Lcom/shopkick/app/products/ProductDetailsScreen;->access$200(Lcom/shopkick/app/products/ProductDetailsScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->addReloadTile()V

    return-void

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen$1;->this$0:Lcom/shopkick/app/products/ProductDetailsScreen;

    invoke-static {v0}, Lcom/shopkick/app/products/ProductDetailsScreen;->access$300(Lcom/shopkick/app/products/ProductDetailsScreen;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    .line 118
    iget-object v0, p0, Lcom/shopkick/app/products/ProductDetailsScreen$1;->this$0:Lcom/shopkick/app/products/ProductDetailsScreen;

    invoke-static {v0}, Lcom/shopkick/app/products/ProductDetailsScreen;->access$400(Lcom/shopkick/app/products/ProductDetailsScreen;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 97
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/shopkick/sdk/presence/LocationManager;->removeLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/products/ProductDetailsScreen$1;->this$0:Lcom/shopkick/app/products/ProductDetailsScreen;

    invoke-static {p1}, Lcom/shopkick/app/products/ProductDetailsScreen;->access$000(Lcom/shopkick/app/products/ProductDetailsScreen;)V

    goto :goto_0

    .line 100
    :cond_0
    invoke-static {}, Lcom/shopkick/app/sdk/SDKClientAccessor;->getInstance()Lcom/shopkick/sdk/SDKClient;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/sdk/SDKClient;->getLocationManager()Lcom/shopkick/sdk/presence/LocationManager;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/shopkick/sdk/presence/LocationManager;->removeLocationUpdateListener(Lcom/shopkick/sdk/presence/LocationUpdateListener;)V

    .line 104
    new-instance p1, Landroid/os/Handler;

    invoke-direct {p1}, Landroid/os/Handler;-><init>()V

    .line 105
    new-instance v0, Lcom/shopkick/app/products/-$$Lambda$ProductDetailsScreen$1$EVxR7JgrUQS1bmQSU0ezDe8lycQ;

    invoke-direct {v0, p0}, Lcom/shopkick/app/products/-$$Lambda$ProductDetailsScreen$1$EVxR7JgrUQS1bmQSU0ezDe8lycQ;-><init>(Lcom/shopkick/app/products/ProductDetailsScreen$1;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_0
    return-void
.end method
