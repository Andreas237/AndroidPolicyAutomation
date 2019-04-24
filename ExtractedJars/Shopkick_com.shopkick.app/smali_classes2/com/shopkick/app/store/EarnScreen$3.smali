.class Lcom/shopkick/app/store/EarnScreen$3;
.super Ljava/lang/Object;
.source "EarnScreen.java"

# interfaces
.implements Landroid/support/v7/widget/SearchView$OnQueryTextListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/EarnScreen;->initSearch(Landroid/support/v7/widget/SearchView;)V
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

    .line 454
    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic lambda$onQueryTextChange$229(Lcom/shopkick/app/store/EarnScreen$3;Ljava/lang/String;)V
    .locals 2

    .line 467
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 468
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    .line 469
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$900(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    move-result-object p1

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->SUGGESTED_FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-eq p1, v1, :cond_1

    .line 470
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->SUGGESTED_FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    invoke-static {p1, v1}, Lcom/shopkick/app/store/EarnScreen;->access$1000(Lcom/shopkick/app/store/EarnScreen;Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;)V

    .line 471
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$1100(Lcom/shopkick/app/store/EarnScreen;)Ljava/util/ArrayList;

    move-result-object p1

    .line 472
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {v1, p1}, Lcom/shopkick/app/store/EarnScreen;->access$1200(Lcom/shopkick/app/store/EarnScreen;Ljava/util/ArrayList;)V

    goto :goto_0

    .line 475
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$900(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    move-result-object p1

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-eq p1, v1, :cond_1

    .line 476
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    invoke-static {p1, v1}, Lcom/shopkick/app/store/EarnScreen;->access$1000(Lcom/shopkick/app/store/EarnScreen;Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;)V

    .line 477
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$1100(Lcom/shopkick/app/store/EarnScreen;)Ljava/util/ArrayList;

    move-result-object p1

    .line 478
    iget-object v1, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {v1, p1}, Lcom/shopkick/app/store/EarnScreen;->access$1200(Lcom/shopkick/app/store/EarnScreen;Ljava/util/ArrayList;)V

    .line 481
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$300(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->setSearchKeyword(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 4

    .line 463
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {v0}, Lcom/shopkick/app/store/EarnScreen;->access$700(Lcom/shopkick/app/store/EarnScreen;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 465
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {v0}, Lcom/shopkick/app/store/EarnScreen;->access$900(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {v0}, Lcom/shopkick/app/store/EarnScreen;->access$900(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    move-result-object v0

    sget-object v1, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->SUGGESTED_FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-ne v0, v1, :cond_1

    .line 466
    :cond_0
    iget-object v0, p0, Lcom/shopkick/app/store/EarnScreen$3;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {v0}, Lcom/shopkick/app/store/EarnScreen;->access$700(Lcom/shopkick/app/store/EarnScreen;)Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$3$fySZuROXZWblOqTwXYr3iZ-afE0;

    invoke-direct {v1, p0, p1}, Lcom/shopkick/app/store/-$$Lambda$EarnScreen$3$fySZuROXZWblOqTwXYr3iZ-afE0;-><init>(Lcom/shopkick/app/store/EarnScreen$3;Ljava/lang/String;)V

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method
