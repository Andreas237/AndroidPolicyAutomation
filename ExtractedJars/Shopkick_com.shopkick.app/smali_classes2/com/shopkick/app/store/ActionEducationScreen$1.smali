.class Lcom/shopkick/app/store/ActionEducationScreen$1;
.super Ljava/lang/Object;
.source "ActionEducationScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/store/ActionEducationScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/ActionEducationScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/ActionEducationScreen;)V
    .locals 0

    .line 195
    iput-object p1, p0, Lcom/shopkick/app/store/ActionEducationScreen$1;->this$0:Lcom/shopkick/app/store/ActionEducationScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 199
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen$1;->this$0:Lcom/shopkick/app/store/ActionEducationScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/store/ActionEducationScreen;->access$002(Lcom/shopkick/app/store/ActionEducationScreen;D)D

    .line 200
    iget-object v0, p0, Lcom/shopkick/app/store/ActionEducationScreen$1;->this$0:Lcom/shopkick/app/store/ActionEducationScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/store/ActionEducationScreen;->access$102(Lcom/shopkick/app/store/ActionEducationScreen;D)D

    .line 201
    iget-object p1, p0, Lcom/shopkick/app/store/ActionEducationScreen$1;->this$0:Lcom/shopkick/app/store/ActionEducationScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/ActionEducationScreen;->access$200(Lcom/shopkick/app/store/ActionEducationScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->fetchNextPage()V

    goto :goto_0

    .line 203
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/ActionEducationScreen$1;->this$0:Lcom/shopkick/app/store/ActionEducationScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/store/ActionEducationScreen;->disableScreenResponsivenessLogging()V

    .line 204
    iget-object p1, p0, Lcom/shopkick/app/store/ActionEducationScreen$1;->this$0:Lcom/shopkick/app/store/ActionEducationScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/ActionEducationScreen;->access$200(Lcom/shopkick/app/store/ActionEducationScreen;)Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/feed/FeedRecyclerViewAdapter;->removeLoadingTiles()V

    .line 205
    iget-object p1, p0, Lcom/shopkick/app/store/ActionEducationScreen$1;->this$0:Lcom/shopkick/app/store/ActionEducationScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/ActionEducationScreen;->access$300(Lcom/shopkick/app/store/ActionEducationScreen;)Landroid/widget/ProgressBar;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_0
    return-void
.end method
