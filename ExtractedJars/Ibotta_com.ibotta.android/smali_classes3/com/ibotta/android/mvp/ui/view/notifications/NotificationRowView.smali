.class public Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;
.super Landroid/widget/LinearLayout;
.source "NotificationRowView.java"


# instance fields
.field protected bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0900c0
    .end annotation
.end field

.field formatting:Lcom/ibotta/android/util/Formatting;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field imageCache:Lcom/ibotta/android/images/ImageCache;
    .annotation runtime Ljavax/inject/Inject;
    .end annotation
.end field

.field protected ivIcon:Landroid/widget/ImageView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f0902ac
    .end annotation
.end field

.field private notification:Lcom/ibotta/android/notification/model/Notification;

.field protected tvFootnote:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090526
    .end annotation
.end field

.field protected tvMessage:Landroid/widget/TextView;
    .annotation runtime Lbutterknife/BindView;
        value = 0x7f090548
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 58
    invoke-direct {p0, p1, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 62
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 66
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    .line 70
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 71
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->initLayout()V

    return-void
.end method

.method private getCreditPendingDate(Lcom/ibotta/android/notification/model/Notification;)Ljava/util/Date;
    .locals 2

    .line 267
    invoke-virtual {p1}, Lcom/ibotta/android/notification/model/Notification;->getMessageData()Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava9/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava9/util/Optional;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/mvp/ui/view/notifications/-$$Lambda$NotificationRowView$V4-IBr9QKncVr7_UOx62u9blAtI;

    invoke-direct {v1, p0}, Lcom/ibotta/android/mvp/ui/view/notifications/-$$Lambda$NotificationRowView$V4-IBr9QKncVr7_UOx62u9blAtI;-><init>(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;)V

    .line 268
    invoke-virtual {v0, v1}, Ljava9/util/Optional;->map(Ljava9/util/function/Function;)Ljava9/util/Optional;

    move-result-object v0

    .line 269
    invoke-virtual {p1}, Lcom/ibotta/android/notification/model/Notification;->getDate()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava9/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    return-object p1
.end method

.method private getCreditPendingPeriod(Lcom/ibotta/android/notification/model/Notification;)Ljava/lang/String;
    .locals 1

    .line 259
    invoke-virtual {p1}, Lcom/ibotta/android/notification/model/Notification;->getMessageData()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 263
    :cond_0
    invoke-virtual {p1}, Lcom/ibotta/android/notification/model/Notification;->getMessageData()Ljava/util/Map;

    move-result-object p1

    const-string v0, "credit_pending_period"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method private getIcon()I
    .locals 5

    .line 174
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getDisplayTypeEnum()Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v0

    .line 175
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/Notification;->getStatusEnum()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v1

    const/4 v2, -0x1

    if-nez v0, :cond_0

    const-string v0, "Unexpected customer notification type: %1$s"

    const/4 v1, 0x1

    .line 178
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-virtual {v4}, Lcom/ibotta/android/notification/model/Notification;->getItemType()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v1, v3

    invoke-static {v0, v1}, Ltimber/log/Timber;->w(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    .line 184
    :cond_0
    sget-object v3, Lcom/ibotta/android/notification/model/NotificationStatus;->DUPLICATE:Lcom/ibotta/android/notification/model/NotificationStatus;

    const v4, 0x7f0801f4

    if-eq v1, v3, :cond_7

    sget-object v3, Lcom/ibotta/android/notification/model/NotificationStatus;->ERROR:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v1, v3, :cond_1

    goto :goto_0

    .line 187
    :cond_1
    sget-object v3, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView$1;->$SwitchMap$com$ibotta$android$notification$model$NotificationDisplayType:[I

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/NotificationDisplayType;->ordinal()I

    move-result v0

    aget v0, v3, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_1

    .line 231
    :pswitch_0
    sget-object v0, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING_VERIFICATION:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v1, v0, :cond_2

    const v2, 0x7f0801f3

    goto :goto_1

    :cond_2
    const v2, 0x7f0801f4

    goto :goto_1

    .line 222
    :pswitch_1
    sget-object v0, Lcom/ibotta/android/notification/model/NotificationStatus;->EXPIRING:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v1, v0, :cond_3

    const v2, 0x7f0801f1

    goto :goto_1

    .line 224
    :cond_3
    sget-object v0, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING_VERIFICATION:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v1, v0, :cond_4

    const v2, 0x7f080218

    goto :goto_1

    :cond_4
    const v2, 0x7f0801f5

    goto :goto_1

    :pswitch_2
    const v2, 0x7f0801f4

    goto :goto_1

    :pswitch_3
    const v2, 0x7f0801f8

    goto :goto_1

    :pswitch_4
    const v2, 0x7f0801ef

    goto :goto_1

    .line 204
    :pswitch_5
    sget-object v0, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v1, v0, :cond_5

    const v2, 0x7f0801f6

    goto :goto_1

    :cond_5
    const v2, 0x7f0801f7

    goto :goto_1

    .line 197
    :pswitch_6
    sget-object v0, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v1, v0, :cond_6

    const v2, 0x7f0801f9

    goto :goto_1

    :cond_6
    const v2, 0x7f0801f0

    goto :goto_1

    :pswitch_7
    const v2, 0x7f0801fb

    goto :goto_1

    :pswitch_8
    const v2, 0x7f0801f2

    goto :goto_1

    :cond_7
    :goto_0
    const v2, 0x7f08021a

    :goto_1
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private initBonus()V
    .locals 5

    .line 110
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-static {v0}, Lcom/ibotta/android/mvp/parser/BonusParser;->fromNotification(Lcom/ibotta/android/notification/model/Notification;)Lcom/ibotta/api/model/bonus/Bonus;

    move-result-object v0

    .line 112
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070180

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 113
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0701af

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 115
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setVisibility(I)V

    .line 116
    iget-object v3, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    invoke-virtual {v3, v0}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setViewModel(Lcom/ibotta/api/model/BonusModel;)V

    .line 117
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setProgressRingWidth(I)V

    .line 118
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    invoke-virtual {v0, v2}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setSize(I)V

    return-void
.end method

.method private initFootnote()V
    .locals 8

    .line 155
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->getCreditPendingDate(Lcom/ibotta/android/notification/model/Notification;)Ljava/util/Date;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/ibotta/android/util/Formatting;->date(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    .line 156
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-direct {p0, v1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->getCreditPendingPeriod(Lcom/ibotta/android/notification/model/Notification;)Ljava/lang/String;

    move-result-object v1

    .line 158
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-direct {p0, v2}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->isPendingReceipt(Lcom/ibotta/android/notification/model/Notification;)Z

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    .line 159
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v6, 0x7f110057

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v1, v5, v4

    aput-object v0, v5, v3

    invoke-virtual {v2, v6, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 160
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->tvFootnote:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 162
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-virtual {v2}, Lcom/ibotta/android/notification/model/Notification;->getDate()Ljava/util/Date;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/ibotta/android/util/Formatting;->time(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    .line 163
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->tvFootnote:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f11004b

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v0, v5, v4

    aput-object v1, v5, v3

    invoke-virtual {v6, v7, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private initIcon()V
    .locals 5

    .line 122
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->ivIcon:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 124
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getIconUrl()Ljava/lang/String;

    move-result-object v0

    .line 126
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 128
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->isFriend()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 129
    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->FRIEND_PROFILE_PIC_ACTIVITY:Lcom/ibotta/android/views/images/Sizes;

    goto :goto_0

    .line 131
    :cond_0
    sget-object v1, Lcom/ibotta/android/views/images/Sizes;->BONUS_SMALL:Lcom/ibotta/android/views/images/Sizes;

    .line 134
    :goto_0
    iget-object v2, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->imageCache:Lcom/ibotta/android/images/ImageCache;

    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->getContext()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->ivIcon:Landroid/widget/ImageView;

    invoke-interface {v2, v3, v0, v4, v1}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    goto :goto_1

    .line 136
    :cond_1
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->getIcon()I

    move-result v0

    const/4 v1, -0x1

    if-le v0, v1, :cond_2

    .line 138
    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->ivIcon:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 141
    :cond_2
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->ivIcon:Landroid/widget/ImageView;

    const v1, 0x7f080009

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    :goto_1
    return-void
.end method

.method private initLayout()V
    .locals 3

    .line 83
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ibotta/android/App;->getMainComponent()Lcom/ibotta/android/di/MainComponent;

    move-result-object v0

    invoke-interface {v0, p0}, Lcom/ibotta/android/di/MainComponent;->inject(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;)V

    const/4 v0, 0x0

    .line 85
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->setOrientation(I)V

    const/high16 v1, 0x42c80000    # 100.0f

    .line 86
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->setWeightSum(F)V

    const/4 v1, 0x1

    .line 87
    invoke-virtual {p0, v1}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->setClickable(Z)V

    .line 88
    invoke-virtual {p0, v0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->setFocusable(Z)V

    .line 90
    invoke-virtual {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v2, 0x7f0c0185

    invoke-virtual {v0, v2, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 91
    invoke-static {p0}, Lbutterknife/ButterKnife;->bind(Landroid/view/View;)Lbutterknife/Unbinder;

    return-void
.end method

.method private initMessage()V
    .locals 3

    .line 147
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 148
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->tvMessage:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/Notification;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v2}, Landroid/text/Html;->fromHtml(Ljava/lang/String;I)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 150
    :cond_0
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->tvMessage:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-virtual {v1}, Lcom/ibotta/android/notification/model/Notification;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method private isFriend()Z
    .locals 2

    .line 168
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getDisplayTypeEnum()Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->CUSTOMER:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    .line 169
    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getStatusEnum()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->MESSAGE:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    .line 170
    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getStatusEnum()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationStatus;->EARNED:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private isPendingReceipt(Lcom/ibotta/android/notification/model/Notification;)Z
    .locals 3

    .line 248
    invoke-virtual {p1}, Lcom/ibotta/android/notification/model/Notification;->getDisplayTypeEnum()Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v0

    .line 249
    invoke-virtual {p1}, Lcom/ibotta/android/notification/model/Notification;->getStatusEnum()Lcom/ibotta/android/notification/model/NotificationStatus;

    move-result-object p1

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 255
    :cond_0
    sget-object v2, Lcom/ibotta/android/notification/model/NotificationDisplayType;->RECEIPT:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    if-ne v0, v2, :cond_1

    sget-object v0, Lcom/ibotta/android/notification/model/NotificationStatus;->PENDING:Lcom/ibotta/android/notification/model/NotificationStatus;

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public static synthetic lambda$getCreditPendingDate$0(Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;Ljava/util/Map;)Ljava/util/Date;
    .locals 2

    .line 268
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->formatting:Lcom/ibotta/android/util/Formatting;

    const-string v1, "purchase_time"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v0, p1}, Lcom/ibotta/android/util/Formatting;->fromServerDateString(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p1

    return-object p1
.end method

.method private onNotificationSet()V
    .locals 2

    .line 96
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->ivIcon:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 97
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->bpvBonusProgress:Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/mvp/ui/view/bonus/BonusProgressView;->setVisibility(I)V

    .line 99
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    invoke-virtual {v0}, Lcom/ibotta/android/notification/model/Notification;->getDisplayTypeEnum()Lcom/ibotta/android/notification/model/NotificationDisplayType;

    move-result-object v0

    sget-object v1, Lcom/ibotta/android/notification/model/NotificationDisplayType;->BONUS:Lcom/ibotta/android/notification/model/NotificationDisplayType;

    if-ne v0, v1, :cond_0

    .line 100
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->initBonus()V

    goto :goto_0

    .line 102
    :cond_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->initIcon()V

    .line 105
    :goto_0
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->initMessage()V

    .line 106
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->initFootnote()V

    return-void
.end method


# virtual methods
.method public setNotification(Lcom/ibotta/android/notification/model/Notification;Z)V
    .locals 0

    .line 75
    iput-object p1, p0, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->notification:Lcom/ibotta/android/notification/model/Notification;

    .line 76
    invoke-direct {p0}, Lcom/ibotta/android/mvp/ui/view/notifications/NotificationRowView;->onNotificationSet()V

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    .line 78
    invoke-static {p0, p1}, Lcom/ibotta/android/views/util/IbottaViewsUtilKt;->enableBackgroundRipple(Landroid/view/View;Z)V

    :cond_0
    return-void
.end method
