.class Lcom/shopkick/app/cpg/CPGCategoryScreen$1;
.super Ljava/lang/Object;
.source "CPGCategoryScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/cpg/CPGCategoryScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/cpg/CPGCategoryScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/cpg/CPGCategoryScreen;)V
    .locals 0

    .line 98
    iput-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGCategoryScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 3

    if-eqz p1, :cond_0

    .line 102
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGCategoryScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->access$002(Lcom/shopkick/app/cpg/CPGCategoryScreen;D)D

    .line 103
    iget-object v0, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGCategoryScreen;

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->access$102(Lcom/shopkick/app/cpg/CPGCategoryScreen;D)D

    .line 104
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGCategoryScreen;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->access$202(Lcom/shopkick/app/cpg/CPGCategoryScreen;Z)Z

    .line 105
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGCategoryScreen;

    invoke-static {p1}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->access$300(Lcom/shopkick/app/cpg/CPGCategoryScreen;)V

    goto :goto_0

    .line 107
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGCategoryScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->disableScreenResponsivenessLogging()V

    .line 108
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGCategoryScreen;

    invoke-static {p1}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->access$400(Lcom/shopkick/app/cpg/CPGCategoryScreen;)Lcom/shopkick/app/products/ScansListAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/products/ScansListAdapter;->removeLoadingTiles()V

    .line 109
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGCategoryScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGCategoryScreen;

    invoke-static {p1}, Lcom/shopkick/app/cpg/CPGCategoryScreen;->access$500(Lcom/shopkick/app/cpg/CPGCategoryScreen;)Landroid/widget/ProgressBar;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_0
    return-void
.end method
