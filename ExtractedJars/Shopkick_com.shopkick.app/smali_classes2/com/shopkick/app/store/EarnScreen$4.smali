.class Lcom/shopkick/app/store/EarnScreen$4;
.super Landroid/content/BroadcastReceiver;
.source "EarnScreen.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopkick/app/store/EarnScreen;->registerProviderChangeReceiver()V
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

    .line 652
    iput-object p1, p0, Lcom/shopkick/app/store/EarnScreen$4;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 655
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$4;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$1300(Lcom/shopkick/app/store/EarnScreen;)V

    .line 656
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$4;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$900(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    move-result-object p1

    sget-object p2, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-eq p1, p2, :cond_0

    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$4;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$900(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    move-result-object p1

    sget-object p2, Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;->SUGGESTED_FILTER:Lcom/shopkick/app/store/EarnScreen$EarnScreenMode;

    if-ne p1, p2, :cond_1

    .line 657
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/store/EarnScreen$4;->this$0:Lcom/shopkick/app/store/EarnScreen;

    invoke-static {p1}, Lcom/shopkick/app/store/EarnScreen;->access$300(Lcom/shopkick/app/store/EarnScreen;)Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;

    move-result-object p1

    invoke-virtual {p1}, Lcom/shopkick/app/store/StoresFeedRecyclerViewAdapter;->checkLocationPermission()V

    :cond_1
    return-void
.end method
