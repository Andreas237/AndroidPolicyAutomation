.class Lcom/shopkick/app/store/EarnScreen$2;
.super Ljava/lang/Object;
.source "EarnScreen.java"

# interfaces
.implements Landroid/view/MenuItem$OnActionExpandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/EarnScreen;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/shopkick/app/store/EarnScreen;

.field final synthetic val$menu:Landroid/view/Menu;


# direct methods
.method constructor <init>(Lcom/shopkick/app/store/EarnScreen;Landroid/view/Menu;)V
    .locals 0

    .line 345
    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen$2;->this$0:Lcom/shopkick/app/store/EarnScreen;

    iput-object p2, p0, Lcom/shopkick/app/store/EarnScreen$2;->val$menu:Landroid/view/Menu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .locals 2

    .line 360
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$2;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$700(Lcom/shopkick/app/store/EarnScreen;)Landroid/os/Handler;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 361
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$2;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$800(Lcom/shopkick/app/store/EarnScreen;)V

    .line 363
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$2;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-virtual {p1}, Lcom/shopkick/app/store/EarnScreen;->getBaseActivity()Lcom/shopkick/app/activities/BaseActivity;

    move-result-object p1

    .line 364
    invoke-static {p1}, Lcom/shopkick/app/util/NullUtils;->isNull(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 365
    invoke-virtual {p1}, Landroid/app/Activity;->invalidateOptionsMenu()V

    .line 369
    :cond_0
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v0, 0x184

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 370
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$2;->this$0:Lcom/shopkick/app/store/EarnScreen;

    iget-object v0, v0, Lcom/shopkick/app/store/EarnScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v0, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    const/4 p1, 0x1

    return p1
.end method

.method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .locals 3

    const/4 p1, 0x0

    move v0, p1

    .line 349
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen$2;->val$menu:Landroid/view/Menu;

    invoke-interface {v1}, Landroid/view/Menu;->size()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 350
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen$2;->val$menu:Landroid/view/Menu;

    invoke-interface {v1, v0}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    .line 351
    iget-object v2, p0, Lcom/shopkick/app/store/EarnScreen$2;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {v2}, Lcom/shopkick/app/store/EarnScreen;->access$600(Lcom/shopkick/app/store/EarnScreen;)Landroid/view/MenuItem;

    move-result-object v2

    if-eq v1, v2, :cond_0

    .line 352
    invoke-interface {v1, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
