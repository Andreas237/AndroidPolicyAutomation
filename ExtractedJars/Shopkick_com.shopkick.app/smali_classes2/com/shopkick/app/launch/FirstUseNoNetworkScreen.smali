.class public Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "FirstUseNoNetworkScreen.java"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Lcom/shopkick/app/util/INotificationObserver;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;
    }
.end annotation


# static fields
.field public static final FAILED_EVENT_PARAM:Ljava/lang/String; = "FailedEventParam"


# instance fields
.field private flowId:Ljava/lang/String;

.field private mainImageView:Landroid/widget/ImageView;

.field private previousFailedEvent:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

.field private progressBar:Landroid/widget/ProgressBar;

.field private retryButton:Lcom/shopkick/app/widget/SKButton;

.field private subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

.field private titleTextView:Lcom/shopkick/app/widget/SKTextView;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    return-void
.end method

.method private onClickRetryButton()V
    .locals 3

    const/4 v0, 0x0

    .line 176
    invoke-virtual {p0, v0}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->enableRetryButton(Z)V

    .line 177
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->progressBar:Landroid/widget/ProgressBar;

    invoke-virtual {v1, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 178
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "firstUseControllerReady"

    invoke-virtual {v1, p0, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 179
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "CreateGuestRequestFailure"

    invoke-virtual {v1, p0, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 180
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v1, v1, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v2, "firstUseControllerFetchFailed"

    invoke-virtual {v1, p0, v2, v0}, Lcom/shopkick/app/util/NotificationCenter;->addObserver(Lcom/shopkick/app/util/INotificationObserver;Ljava/lang/String;Z)V

    .line 184
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>()V

    const/4 v1, 0x7

    .line 185
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 186
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->previousFailedEvent:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    sget-object v2, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->NO_NETWORK:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    if-ne v1, v2, :cond_0

    const/16 v1, 0x3bb

    .line 187
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    goto :goto_0

    .line 188
    :cond_0
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->previousFailedEvent:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    sget-object v2, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->TIMEOUT:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    if-ne v1, v2, :cond_1

    const v1, 0x77a1a

    .line 189
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    goto :goto_0

    .line 190
    :cond_1
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->previousFailedEvent:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    sget-object v2, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->GUEST_ACCOUNT_CREATE:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    if-ne v1, v2, :cond_2

    const v1, 0x77a18

    .line 191
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    goto :goto_0

    :cond_2
    const v1, 0x77a19

    .line 193
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setEventType(Ljava/lang/Integer;)V

    .line 195
    :goto_0
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 197
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    invoke-virtual {v0}, Lcom/shopkick/app/launch/FirstUseControllerV2;->launch()V

    return-void
.end method

.method private setUpMessaging(IIILcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;)V
    .locals 3

    .line 119
    sget-object p2, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->TIMEOUT:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    const v0, 0x7f1102dd

    const v1, 0x7f1102df

    const v2, 0x7f0802b9

    if-ne p4, p2, :cond_0

    .line 120
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->mainImageView:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 121
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->titleTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 122
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 124
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const p2, 0x77a1a

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 125
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 126
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 128
    sget-object p1, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->TIMEOUT:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->previousFailedEvent:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    goto :goto_1

    :cond_0
    const/4 p2, 0x2

    if-ne p1, p2, :cond_1

    .line 130
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->mainImageView:Landroid/widget/ImageView;

    const p2, 0x7f080331

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 131
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->titleTextView:Lcom/shopkick/app/widget/SKTextView;

    const p2, 0x7f1102de

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 132
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

    const p2, 0x7f1102dc

    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 134
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 p2, 0x3bb

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 135
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 136
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 138
    sget-object p1, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->NO_NETWORK:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    iput-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->previousFailedEvent:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    goto :goto_1

    .line 143
    :cond_1
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->mainImageView:Landroid/widget/ImageView;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 144
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->titleTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 145
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(I)V

    .line 147
    new-instance p1, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    sget-object p2, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->GUEST_ACCOUNT_CREATE:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    if-ne p4, p2, :cond_2

    const p2, 0x77a18

    goto :goto_0

    :cond_2
    const p2, 0x77a19

    :goto_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;)V

    .line 150
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setAction(Ljava/lang/Integer;)V

    .line 151
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {p2, p1}, Lcom/shopkick/app/logging/UserEventLogger;->logEventRecord(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    .line 153
    iput-object p4, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->previousFailedEvent:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    :goto_1
    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 3

    const p3, 0x7f0c00bf

    const/4 v0, 0x0

    .line 89
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f090314

    .line 90
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    const p3, 0x7f09045d

    .line 93
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    iput-object p3, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->mainImageView:Landroid/widget/ImageView;

    const p3, 0x7f090461

    .line 96
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/widget/SKTextView;

    iput-object p3, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->titleTextView:Lcom/shopkick/app/widget/SKTextView;

    const p3, 0x7f090709

    .line 99
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/widget/SKTextView;

    iput-object p3, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->subtitleTextView:Lcom/shopkick/app/widget/SKTextView;

    const p3, 0x7f0905ba

    .line 102
    invoke-virtual {p2, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/shopkick/app/widget/SKButton;

    iput-object p3, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->retryButton:Lcom/shopkick/app/widget/SKButton;

    .line 103
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->retryButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p3, p0}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 104
    iget-object p3, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->retryButton:Lcom/shopkick/app/widget/SKButton;

    const v0, 0x7f110165

    invoke-virtual {p3, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    const/4 p3, 0x1

    .line 105
    invoke-virtual {p0, p3}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->enableRetryButton(Z)V

    const v0, 0x7f090432

    .line 107
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ProgressBar;

    iput-object p2, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->progressBar:Landroid/widget/ProgressBar;

    .line 108
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->progressBar:Landroid/widget/ProgressBar;

    const/4 v0, 0x4

    invoke-virtual {p2, v0}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 110
    iget-object p2, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->params:Ljava/util/Map;

    const-string v0, "ClientErrorCode"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    .line 111
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->params:Ljava/util/Map;

    const-string v1, "HttpStatusCode"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 112
    iget-object v1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->params:Ljava/util/Map;

    const-string v2, "FailedEventParam"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {v1}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->valueOf(I)Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    move-result-object v1

    .line 113
    invoke-direct {p0, p2, v0, p3, v1}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->setUpMessaging(IIILcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;)V

    return-object p1
.end method

.method protected enableRetryButton(Z)V
    .locals 1

    if-eqz p1, :cond_0

    .line 159
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->retryButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 160
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->retryButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    goto :goto_0

    .line 162
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->retryButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 163
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->retryButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {p1}, Lcom/shopkick/app/widget/SKButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0x4c

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    :goto_0
    return-void
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/shopkick/app/application/ScreenGlobals;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "FirstUseNoNetworkScreen params cannot be null"

    .line 73
    invoke-static {p1, v0}, Lcom/shopkick/app/util/SKAssertion;->assertTrue(ZLjava/lang/String;)V

    .line 74
    invoke-virtual {p0, p2}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->setParams(Ljava/util/Map;)V

    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 169
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->retryButton:Lcom/shopkick/app/widget/SKButton;

    if-ne p1, v0, :cond_0

    .line 171
    invoke-direct {p0}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->onClickRetryButton()V

    :cond_0
    return-void
.end method

.method public onEvent(Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 202
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->progressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 203
    iget-object v0, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object v0, v0, Lcom/shopkick/app/application/ScreenGlobals;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    invoke-virtual {v0, p0}, Lcom/shopkick/app/util/NotificationCenter;->removeObserver(Lcom/shopkick/app/util/INotificationObserver;)V

    const-string v0, "firstUseControllerReady"

    .line 204
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 205
    iget-object p1, p0, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->screenGlobals:Lcom/shopkick/app/application/ScreenGlobals;

    iget-object p1, p1, Lcom/shopkick/app/application/ScreenGlobals;->firstUseControllerV2:Lcom/shopkick/app/launch/FirstUseControllerV2;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/shopkick/app/launch/FirstUseControllerV2;->getInitialScreenPageIdentifier(Ljava/util/Map;)Lcom/shopkick/app/activities/PageIdentifierV2;

    move-result-object p1

    .line 206
    invoke-static {}, Lcom/shopkick/app/screens/ScreenInfo;->getInstance()Lcom/shopkick/app/screens/ScreenInfo;

    move-result-object p2

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getScreenKey()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/shopkick/app/screens/ScreenInfo;->classForKey(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p2

    .line 207
    const-class v0, Lcom/shopkick/app/activities/FirstUseActivityV2;

    invoke-virtual {p1}, Lcom/shopkick/app/activities/PageIdentifierV2;->getParams()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p2, p1}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->goToActivityWithScreen(Ljava/lang/Class;Ljava/lang/Class;Ljava/util/Map;)V

    goto :goto_1

    :cond_0
    const-string v0, "CreateGuestRequestFailure"

    .line 208
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "firstUseControllerFetchFailed"

    .line 209
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    const-string v0, "ClientErrorCode"

    .line 210
    invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const-string v1, "HttpStatusCode"

    .line 211
    invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v1, "CreateGuestRequestFailure"

    .line 214
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    const/16 p1, 0x48

    .line 216
    sget-object v1, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->GUEST_ACCOUNT_CREATE:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    goto :goto_0

    :cond_2
    const/16 p1, 0x49

    .line 219
    sget-object v1, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;->FIRST_USE_CONFIG_FETCH:Lcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;

    .line 222
    :goto_0
    invoke-direct {p0, v0, p2, p1, v1}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->setUpMessaging(IIILcom/shopkick/app/launch/FirstUseNoNetworkScreen$FailedEventType;)V

    const/4 p1, 0x1

    .line 223
    invoke-virtual {p0, p1}, Lcom/shopkick/app/launch/FirstUseNoNetworkScreen;->enableRetryButton(Z)V

    :cond_3
    :goto_1
    return-void
.end method

.method public shouldDisplayAppScreenHeader()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public shouldHideBack()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
