.class public Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;
.super Ljava/lang/Object;
.source "NotificationDetailFactoryImpl.java"

# interfaces
.implements Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactory;


# instance fields
.field private final apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

.field private final digitalProductHelper:Lcom/ibotta/api/helper/offer/DigitalProductHelper;

.field private final formatting:Lcom/ibotta/android/util/Formatting;

.field private final graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private final loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

.field private final offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

.field private final retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

.field private final titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

.field private final userState:Lcom/ibotta/android/state/user/UserState;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/api/helper/offer/DigitalProductHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/title/TitleBarReducer;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    .line 56
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    .line 57
    iput-object p3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    .line 58
    iput-object p4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    .line 59
    iput-object p5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    .line 60
    iput-object p6, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    .line 61
    iput-object p7, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->digitalProductHelper:Lcom/ibotta/api/helper/offer/DigitalProductHelper;

    .line 62
    iput-object p8, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    .line 63
    iput-object p9, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 64
    iput-object p10, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    return-void
.end method


# virtual methods
.method public createActivityDetail(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;)Lcom/ibotta/android/fragment/activity/detail/ActivityDetail;
    .locals 11

    .line 71
    sget-object v0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getDisplayType()Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v3

    invoke-virtual {v3}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v3

    aget v0, v0, v3

    const/4 v3, 0x0

    packed-switch v0, :pswitch_data_0

    .line 131
    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getAmount()F

    move-result v0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_4

    .line 132
    new-instance v7, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-direct {v7, p1, p2, v0, v3}, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/title/TitleBarReducer;)V

    move-object v6, v7

    goto/16 :goto_0

    .line 124
    :pswitch_0
    new-instance v7, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v6}, Lcom/ibotta/android/fragment/activity/detail/AddUpcDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/title/TitleBarReducer;)V

    move-object v6, v7

    goto/16 :goto_0

    .line 100
    :pswitch_1
    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v4, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING_VERIFICATION:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v0, v4, :cond_0

    .line 102
    new-instance v10, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    iget-object v9, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->digitalProductHelper:Lcom/ibotta/api/helper/offer/DigitalProductHelper;

    move-object v0, v10

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v9}, Lcom/ibotta/android/fragment/activity/detail/AppPendingDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/api/helper/offer/DigitalProductHelper;)V

    move-object v6, v10

    goto/16 :goto_0

    .line 112
    :cond_0
    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v4, Lcom/ibotta/android/notification/model/NotificationStatus;->EXPIRING:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v0, v4, :cond_1

    .line 113
    new-instance v8, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->graphQLCallFactory:Lcom/ibotta/android/graphql/GraphQLCallFactory;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->offerHelper:Lcom/ibotta/api/helper/offer/OfferHelper;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->imageCache:Lcom/ibotta/android/images/ImageCache;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/fragment/activity/detail/ExpiringDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/graphql/GraphQLCallFactory;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/api/helper/offer/OfferHelper;Lcom/ibotta/android/images/ImageCache;)V

    move-object v6, v8

    goto/16 :goto_0

    .line 115
    :cond_1
    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v4, Lcom/ibotta/android/notification/model/NotificationStatus;->LIKED:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v0, v4, :cond_2

    .line 116
    new-instance v6, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/fragment/activity/detail/LikeDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    goto/16 :goto_0

    .line 117
    :cond_2
    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getStatus()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v4, Lcom/ibotta/android/notification/model/NotificationStatus;->REVERSED:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v0, v4, :cond_3

    .line 118
    new-instance v7, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-direct {v7, p1, p2, v0, v3}, Lcom/ibotta/android/fragment/activity/detail/EarningsReversedDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/title/TitleBarReducer;)V

    move-object v6, v7

    goto/16 :goto_0

    .line 119
    :cond_3
    invoke-virtual {p2}, Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;->getAmount()F

    move-result v0

    cmpl-float v0, v0, v3

    if-lez v0, :cond_4

    .line 120
    new-instance v7, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    invoke-direct {v7, p1, p2, v0, v3}, Lcom/ibotta/android/fragment/activity/detail/AdjustmentDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/title/TitleBarReducer;)V

    move-object v6, v7

    goto/16 :goto_0

    .line 97
    :pswitch_2
    new-instance v6, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/fragment/activity/detail/CreditLedgerDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    goto/16 :goto_0

    .line 93
    :pswitch_3
    new-instance v8, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->titleBarReducer:Lcom/ibotta/android/title/TitleBarReducer;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v7}, Lcom/ibotta/android/fragment/activity/detail/GiftCardDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/title/TitleBarReducer;)V

    move-object v6, v8

    goto :goto_0

    .line 90
    :pswitch_4
    new-instance v6, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/fragment/activity/detail/VenmoDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    goto :goto_0

    .line 87
    :pswitch_5
    new-instance v6, Lcom/ibotta/android/fragment/activity/detail/PayPalDetail;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/fragment/activity/detail/PayPalDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    goto :goto_0

    .line 84
    :pswitch_6
    new-instance v6, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lcom/ibotta/android/fragment/activity/detail/ReferralDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    goto :goto_0

    .line 73
    :pswitch_7
    new-instance v9, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;

    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->userState:Lcom/ibotta/android/state/user/UserState;

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->retailerHelper:Lcom/ibotta/api/helper/retailer/RetailerHelper;

    iget-object v5, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v6, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object v7, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->loadRetailersVariant:Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;

    iget-object v8, p0, Lcom/ibotta/android/mvp/ui/activity/notifications/detail/NotificationDetailFactoryImpl;->apiJobFactory:Lcom/ibotta/android/service/api/job/ApiJobFactory;

    move-object v0, v9

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v8}, Lcom/ibotta/android/fragment/activity/detail/ReceiptDetail;-><init>(Landroid/content/Context;Lcom/ibotta/android/apiandroid/activity/ActivityParcelable;Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/api/helper/retailer/RetailerHelper;Lcom/ibotta/android/util/Formatting;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/features/variant/retailers/LoadRetailersVariant;Lcom/ibotta/android/service/api/job/ApiJobFactory;)V

    move-object v6, v9

    goto :goto_0

    :cond_4
    const/4 v7, 0x0

    move-object v6, v7

    :goto_0
    if-nez v6, :cond_5

    .line 138
    new-instance v6, Lcom/ibotta/android/fragment/activity/detail/NoOpDetail;

    invoke-direct {v6}, Lcom/ibotta/android/fragment/activity/detail/NoOpDetail;-><init>()V

    :cond_5
    return-object v6

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
