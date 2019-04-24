.class Lcom/shopkick/app/store/EarnScreen$1;
.super Ljava/lang/Object;
.source "EarnScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/EarnScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/EarnScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/EarnScreen;)V
    .locals 0

    .line 214
    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen$1;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 218
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$1;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/store/EarnScreen;->access$002(Lcom/shopkick/app/store/EarnScreen;D)D

    .line 219
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$1;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/store/EarnScreen;->access$102(Lcom/shopkick/app/store/EarnScreen;D)D

    .line 220
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$1;->this$0:Lcom/shopkick/app/store/EarnScreen;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/shopkick/app/store/EarnScreen;->access$202(Lcom/shopkick/app/store/EarnScreen;Z)Z

    .line 221
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$1;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$300(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->tryRefreshWithoutClear()V

    goto :goto_0

    .line 223
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$1;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/store/EarnScreen;->disableScreenResponsivenessLogging()V

    .line 224
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$1;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$400(Lcom/shopkick/app/store/EarnScreen;)V

    .line 225
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$1;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$300(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->removeLoadingTiles()V

    .line 226
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$1;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$500(Lcom/shopkick/app/store/EarnScreen;)Landroid/widget/ProgressBar;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_0
    return-void
.end method
