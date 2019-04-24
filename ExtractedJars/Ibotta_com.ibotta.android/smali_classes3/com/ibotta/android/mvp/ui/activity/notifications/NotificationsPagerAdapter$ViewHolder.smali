.class public Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter$ViewHolder;
.super Ljava/lang/Object;
.source "NotificationsPagerAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/mvp/ui/activity/notifications/NotificationsPagerAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "ViewHolder"
.end annotation


# instance fields
.field protected nlvNotifications:Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsListView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f09037d
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 145
    invoke-static {p0, p1}, Lbutterknife/ButterKnife;->bind(Ljava/lang/Object;Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method
