.class public Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory;
.super Ljava/lang/Object;
.source "NotificationsViewHolderFactory.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public createViewHolder(Landroid/view/ViewGroup;I)Lcom/ibotta/android/mvp/ui/view/notifications/holder/AbstractNotificationsViewHolder;
    .locals 2

    .line 18
    sget-object v0, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationsViewHolderFactory$1;->$SwitchMap$com$ibotta$android$mvp$ui$view$notifications$NotificationsRowType:[I

    invoke-static {}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->values()[Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;

    move-result-object v1

    aget-object p2, v1, p2

    invoke-virtual {p2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationsRowType;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    const/4 p2, 0x0

    goto :goto_0

    .line 29
    :pswitch_0
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/notifications/holder/LoadingSpinnerViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/notifications/LoadingSpinnerView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/LoadingSpinnerView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/LoadingSpinnerViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/LoadingSpinnerView;)V

    goto :goto_0

    .line 26
    :pswitch_1
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;

    new-instance v0, Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/empty/EmptyView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyTeammatesViewHolder;-><init>(Lcom/ibotta/android/views/empty/EmptyView;)V

    goto :goto_0

    .line 23
    :pswitch_2
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;

    new-instance v0, Lcom/ibotta/android/views/empty/EmptyView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/views/empty/EmptyView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/EmptyMineViewHolder;-><init>(Lcom/ibotta/android/views/empty/EmptyView;)V

    goto :goto_0

    .line 20
    :pswitch_3
    new-instance p2, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;

    new-instance v0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;-><init>(Landroid/content/Context;)V

    invoke-direct {p2, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/holder/NotificationRowViewHolder;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;)V

    :goto_0
    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
