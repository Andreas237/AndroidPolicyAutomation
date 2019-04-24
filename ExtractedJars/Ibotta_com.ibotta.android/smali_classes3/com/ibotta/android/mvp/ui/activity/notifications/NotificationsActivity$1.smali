.class Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity$1;
.super Ljava/lang/Object;
.source "NotificationsActivity.java"

# interfaces
.implements Landroid/support/design/widget/TabLayout$OnTabSelectedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->initTabSelector()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;


# direct methods
.method constructor <init>(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;)V
    .locals 0

    .line 113
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTabReselected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 1

    .line 126
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;I)V

    return-void
.end method

.method public onTabSelected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 1

    .line 116
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity$1;->this$0:Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;

    invoke-virtual {p1}, Landroid/support/design/widget/TabLayout$Tab;->getPosition()I

    move-result p1

    invoke-static {v0, p1}, Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;->access$000(Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsActivity;I)V

    return-void
.end method

.method public onTabUnselected(Landroid/support/design/widget/TabLayout$Tab;)V
    .locals 0

    return-void
.end method
