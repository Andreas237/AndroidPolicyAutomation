.class Lcom/shopkick/app/cpg/CPGLocationScreen$1;
.super Ljava/lang/Object;
.source "CPGLocationScreen.java"

# interfaces
.implements Lcom/shopkick/sdk/presence/LocationUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/shopkick/app/cpg/CPGLocationScreen;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/cpg/CPGLocationScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/cpg/CPGLocationScreen;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGLocationScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLocationUpdated(Landroid/location/Location;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 94
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGLocationScreen;

    invoke-static {p1}, Lcom/shopkick/app/cpg/CPGLocationScreen;->access$000(Lcom/shopkick/app/cpg/CPGLocationScreen;)V

    goto :goto_0

    .line 96
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGLocationScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/cpg/CPGLocationScreen;->disableScreenResponsivenessLogging()V

    .line 97
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGLocationScreen;

    invoke-static {p1}, Lcom/shopkick/app/cpg/CPGLocationScreen;->access$100(Lcom/shopkick/app/cpg/CPGLocationScreen;)Lcom/shopkick/app/products/ScansListAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/products/ScansListAdapter;->removeLoadingTiles()V

    .line 98
    iget-object p1, p0, Lcom/shopkick/app/cpg/CPGLocationScreen$1;->this$0:Lcom/shopkick/app/cpg/CPGLocationScreen;

    invoke-static {p1}, Lcom/shopkick/app/cpg/CPGLocationScreen;->access$200(Lcom/shopkick/app/cpg/CPGLocationScreen;)Landroid/widget/ProgressBar;

    move-result-object p1

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    :goto_0
    return-void
.end method
