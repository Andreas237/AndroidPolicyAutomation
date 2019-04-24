.class Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity$1;
.super Landroid/content/BroadcastReceiver;
.source "FeaturedActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->onStart()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;)V
    .locals 0

    .line 163
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 0

    .line 166
    iget-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;

    invoke-virtual {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/featured/FeaturedActivity;->onLocalBroadcastReceived(Landroid/content/Intent;)V

    return-void
.end method
