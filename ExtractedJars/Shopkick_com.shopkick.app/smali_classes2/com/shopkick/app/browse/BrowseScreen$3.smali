.class Lcom/shopkick/app/browse/BrowseScreen$3;
.super Ljava/util/TimerTask;
.source "BrowseScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/browse/BrowseScreen;->ftueQuickVideoProcessed()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/browse/BrowseScreen;

.field final synthetic val$handler:Landroid/os/Handler;


# direct methods
.method constructor <init>(Lcom/shopkick/app/browse/BrowseScreen;Landroid/os/Handler;)V
    .locals 0

    .line 1049
    iput-object p1, p0, Lcom/shopkick/app/browse/BrowseScreen$3;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    iput-object p2, p0, Lcom/shopkick/app/browse/BrowseScreen$3;->val$handler:Landroid/os/Handler;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method

.method public static synthetic lambda$run$47(Lcom/shopkick/app/browse/BrowseScreen$3;)V
    .locals 2

    .line 1053
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen$3;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-static {v0}, Lcom/shopkick/app/browse/BrowseScreen;->access$300(Lcom/shopkick/app/browse/BrowseScreen;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v0

    invoke-virtual {v0}, Lcom/shopkick/app/application/AppPreferences;->isFtueDiscoveryLessonStage3Completed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1054
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen$3;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-static {v0}, Lcom/shopkick/app/browse/BrowseScreen;->access$300(Lcom/shopkick/app/browse/BrowseScreen;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonStage2Completed(Z)V

    .line 1055
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen$3;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-static {v0}, Lcom/shopkick/app/browse/BrowseScreen;->access$300(Lcom/shopkick/app/browse/BrowseScreen;)Lcom/shopkick/app/application/AppPreferences;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/shopkick/app/application/AppPreferences;->setFtueDiscoveryLessonPaused(Z)V

    .line 1056
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen$3;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-static {v0}, Lcom/shopkick/app/browse/BrowseScreen;->access$400(Lcom/shopkick/app/browse/BrowseScreen;)V

    .line 1057
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen$3;->this$0:Lcom/shopkick/app/browse/BrowseScreen;

    invoke-virtual {v0}, Lcom/shopkick/app/browse/BrowseScreen;->startFTUELesson3()V

    :cond_0
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1052
    iget-object v0, p0, Lcom/shopkick/app/browse/BrowseScreen$3;->val$handler:Landroid/os/Handler;

    new-instance v1, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$3$YBgadnq3x2WCFCKQWKRWiPbMZWI;

    invoke-direct {v1, p0}, Lcom/shopkick/app/browse/-$$Lambda$BrowseScreen$3$YBgadnq3x2WCFCKQWKRWiPbMZWI;-><init>(Lcom/shopkick/app/browse/BrowseScreen$3;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
