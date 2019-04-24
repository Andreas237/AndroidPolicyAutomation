.class Lcom/shopkick/app/feed/AppboyNewsfeedScreen$2;
.super Ljava/lang/Object;
.source "AppboyNewsfeedScreen.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->setupTab()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;


# direct methods
.method constructor <init>(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$2;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageScrollStateChanged(I)V
    .locals 0

    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    return-void
.end method

.method public onPageSelected(I)V
    .locals 2

    if-nez p1, :cond_0

    const/16 v0, 0x182

    goto :goto_0

    :cond_0
    const/16 v0, 0x183

    .line 108
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$2;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    invoke-static {v1, p1}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->access$202(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;I)I

    .line 111
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 112
    iget-object v0, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$2;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    iget-object v0, v0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 115
    iget-object p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$2;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    invoke-static {p1}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->access$200(Lcom/shopkick/app/feed/AppboyNewsfeedScreen;)I

    move-result p1

    if-nez p1, :cond_1

    .line 116
    iget-object p1, p0, Lcom/shopkick/app/feed/AppboyNewsfeedScreen$2;->this$0:Lcom/shopkick/app/feed/AppboyNewsfeedScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/feed/AppboyNewsfeedScreen;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1}, Lcom/appboy/Appboy;->getInstance(Landroid/content/Context;)Lcom/appboy/Appboy;

    move-result-object p1

    invoke-virtual {p1}, Lcom/appboy/Appboy;->logFeedbackDisplayed()V

    :cond_1
    return-void
.end method
