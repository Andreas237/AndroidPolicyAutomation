.class public Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;
.super Ljava/lang/Object;
.source "NotificationIntentCreatorImpl.java"

# interfaces
.implements Lcom/ibotta/android/routing/intent/NotificationIntentCreator;


# instance fields
.field private final notificationDetailFactory:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;

.field private final notificationRoutingUtil:Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;

.field private final routeHandler:Lcom/ibotta/android/routing/RouteHandler;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/routing/RouteHandler;Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->routeHandler:Lcom/ibotta/android/routing/RouteHandler;

    .line 45
    iput-object p2, p0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->notificationDetailFactory:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;

    .line 46
    iput-object p3, p0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->notificationRoutingUtil:Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;

    return-void
.end method

.method private getBgcDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 149
    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/Notification;->getMessageData()Ljava/util/Map;

    move-result-object p2

    const-string v0, "transaction_uuid"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 151
    new-instance v0, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/PwiBarcodeIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private getBonusDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;
    .locals 3

    .line 125
    new-instance v0, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    invoke-direct {v0, p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    new-array v1, p1, [I

    .line 126
    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/Notification;->getDisplayId()I

    move-result p2

    const/4 v2, 0x0

    aput p2, v1, v2

    invoke-virtual {v0, v1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->bonusIds([I)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p2

    .line 127
    invoke-virtual {p2, p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->explicitRequest(Z)Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;

    move-result-object p1

    .line 128
    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/BonusDetailIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method private getCustomerBgcDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;
    .locals 0

    .line 144
    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->fromBuyableGiftCardNotification(Lcom/ibotta/android/notification/model/Notification;)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    move-result-object p2

    .line 143
    invoke-static {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method private getCustomerDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;
    .locals 4
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 114
    sget-object v0, Lcom/ibotta/android/notification/model/NotificationStatus;->MESSAGE:Lcom/ibotta/android/notification/model/NotificationStatus;

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->NEW:Lcom/ibotta/android/notification/model/NotificationStatus;

    sget-object v2, Lcom/ibotta/android/notification/model/NotificationStatus;->EARNED:Lcom/ibotta/android/notification/model/NotificationStatus;

    sget-object v3, Lcom/ibotta/android/notification/model/NotificationStatus;->SUCCESS:Lcom/ibotta/android/notification/model/NotificationStatus;

    invoke-static {v0, v1, v2, v3}, Ljava9/util/Sets;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 116
    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/Notification;->getStatusEnum()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/Notification;->getDisplayId()I

    move-result v0

    .line 120
    invoke-static {p2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->fromNotification(Lcom/ibotta/android/notification/model/Notification;)Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    move-result-object p2

    .line 117
    invoke-static {p1, v0, p2}, Lcom/ibotta/android/mvp/ui/activity/lifetimevsteammates/teammate/TeammateActivity;->newIntent(Landroid/content/Context;ILcom/ibotta/android/apiandroid/activity/ActivityParcelable;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 121
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->getNotificationDetailIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private getIntentForDisplayType(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 73
    sget-object v0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/Notification;->getDisplayTypeEnum()Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 105
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->getNotificationDetailIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 100
    :pswitch_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->getBgcDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 95
    :pswitch_1
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->getCustomerBgcDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 90
    :pswitch_2
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->getReceiptDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 85
    :pswitch_3
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->getOfferDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 80
    :pswitch_4
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->getBonusDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 75
    :pswitch_5
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->getCustomerDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private getNotificationDetailIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 156
    iget-object v0, p0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->notificationDetailFactory:Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;

    .line 157
    invoke-static {p2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->fromNotification(Lcom/ibotta/android/notification/model/Notification;)Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;

    move-result-object v1

    .line 156
    invoke-interface {v0, p1, v1}, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;->createActivityDetail(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;

    move-result-object v0

    instance-of v0, v0, Lcom/ibotta/android/fragment/activity/detail/NoOpDetail;

    if-nez v0, :cond_0

    .line 158
    new-instance v0, Lcom/ibotta/android/routing/intent/NotificationDetailIntentCreator;

    invoke-direct {v0, p1, p2}, Lcom/ibotta/android/routing/intent/NotificationDetailIntentCreator;-><init>(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)V

    invoke-virtual {v0}, Lcom/ibotta/android/routing/intent/NotificationDetailIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method private getOfferDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;
    .locals 2
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 133
    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/Notification;->getStatusEnum()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->EXPIRING:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v0, v1, :cond_0

    new-instance p2, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;

    invoke-direct {p2, p1}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;-><init>(Landroid/content/Context;)V

    invoke-virtual {p2}, Lcom/ibotta/android/routing/intent/MyRebatesIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    goto :goto_0

    .line 134
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->getNotificationDetailIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private getReceiptDisplayTypeIntent(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;
    .locals 0

    .line 139
    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/Notification;->getDisplayId()I

    move-result p2

    invoke-static {p2}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;->fromReceiptNotification(I)Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;

    move-result-object p2

    .line 138
    invoke-static {p1, p2}, Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningsDetailActivity;->newIntent(Landroid/content/Context;Lcom/ibotta/android/mvp/ui/activity/earningsdetail/EarningDetailParcel;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public createIntentFor(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;
    .locals 5
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 51
    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/Notification;->getDisplayTypeEnum()Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v0

    .line 52
    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/Notification;->getStatusEnum()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v1

    .line 53
    invoke-virtual {p2}, Lcom/ibotta/android/notification/model/Notification;->getContext()Ljava/lang/String;

    move-result-object v2

    .line 55
    iget-object v3, p0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->notificationRoutingUtil:Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;

    invoke-interface {v3, v0, v1}, Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;->shouldIgnoreRouteHandler(Lcom/ibotta/android/notification/model/NotificationDisplayType;Lcom/ibotta/android/notification/model/NotificationStatus;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    move-object v3, v4

    goto :goto_0

    .line 56
    :cond_0
    iget-object v3, p0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->routeHandler:Lcom/ibotta/android/routing/RouteHandler;

    invoke-interface {v3, p1, v2}, Lcom/ibotta/android/routing/RouteHandler;->getIntentFor(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_1

    .line 60
    new-instance p2, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v2, v0}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V

    invoke-virtual {p2, v0}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->clearTask(Z)Lcom/ibotta/android/routing/intent/RoutingIntentCreator;

    move-result-object p1

    invoke-virtual {p1}, Lcom/ibotta/android/routing/intent/RoutingIntentCreator;->create()Landroid/content/Intent;

    move-result-object p1

    return-object p1

    .line 61
    :cond_1
    iget-object v3, p0, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->notificationRoutingUtil:Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;

    invoke-interface {v3, v0, v1, v2}, Lcom/ibotta/android/routing/notification/NotificationRoutingUtil;->isNoOp(Lcom/ibotta/android/notification/model/NotificationDisplayType;Lcom/ibotta/android/notification/model/NotificationStatus;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object v4

    .line 66
    :cond_2
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/routing/intent/NotificationIntentCreatorImpl;->getIntentForDisplayType(Landroid/content/Context;Lcom/ibotta/android/notification/model/Notification;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method
