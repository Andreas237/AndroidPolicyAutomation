.class public Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;
.super Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;
.source "FriendsMessageFlyUpCreator.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;,
        Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendSendMessageEvent;,
        Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;
    }
.end annotation


# static fields
.field public static final EVENT_SEND_MESSAGE:I = 0x1

.field private static final MESSAGE_MAX_LENGTH:I = 0x8c

.field public static final PAGE_MESSAGE:I


# instance fields
.field private final appHelper:Lcom/ibotta/android/util/AppHelper;

.field private final context:Landroid/content/Context;

.field private final fullName:Ljava/lang/String;

.field private final imageCache:Lcom/ibotta/android/images/ImageCache;

.field private final pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

.field private final profilePicUrl:Ljava/lang/String;

.field private vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/util/AppHelper;Lcom/ibotta/android/images/ImageCache;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 103
    invoke-direct {p0, p4}, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;)V

    .line 105
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->context:Landroid/content/Context;

    .line 106
    iput-object p2, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->appHelper:Lcom/ibotta/android/util/AppHelper;

    .line 107
    iput-object p3, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->imageCache:Lcom/ibotta/android/images/ImageCache;

    .line 108
    iput-object p5, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->fullName:Ljava/lang/String;

    .line 109
    iput-object p6, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->profilePicUrl:Ljava/lang/String;

    .line 111
    new-instance p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-direct {p1}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;-><init>()V

    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    .line 112
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    const/4 p2, 0x0

    iput p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    .line 113
    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;->CANCEL:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->leftControl:Lcom/ibotta/android/fragment/dialog/flyup/LeftControl;

    .line 114
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    sget-object p2, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SEND:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    iput-object p2, p1, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->rightControl:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    return-void
.end method

.method static synthetic access$500(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;)V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->updateCharsRemaining()V

    return-void
.end method

.method public static getSuccessDialog()Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;
    .locals 3

    const/4 v0, 0x1

    const-wide/16 v1, 0x7d0

    .line 93
    invoke-static {v0, v1, v2}, Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;->newInstance(ZJ)Lcom/ibotta/android/fragment/dialog/StatusResponseDialogFragment;

    move-result-object v0

    return-object v0
.end method

.method public static isMessageValid(Ljava/lang/String;)Z
    .locals 1

    .line 63
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    const/16 v0, 0x8c

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method static synthetic lambda$sendFriendMessage$0(Ljava/lang/String;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;Lcom/ibotta/android/service/api/job/ApiJob;)V
    .locals 1

    .line 78
    invoke-interface {p3}, Lcom/ibotta/android/service/api/job/ApiJob;->isSuccessfullyLoaded()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    const-string p0, "message"

    goto :goto_0

    :cond_0
    const-string p0, "nudge"

    :goto_0
    const-string v0, "friend_message"

    .line 81
    invoke-interface {p1, v0, p0}, Lcom/ibotta/android/tracking/Tracker;->event(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    :cond_1
    invoke-interface {p3}, Lcom/ibotta/android/service/api/job/ApiJob;->getException()Lcom/ibotta/api/ApiException;

    move-result-object p0

    invoke-interface {p2, p0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;->onFriendMessageSendFinished(Lcom/ibotta/api/ApiException;)V

    return-void
.end method

.method private makeFriendMessageViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;
    .locals 3

    .line 161
    new-instance p2, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;-><init>(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$1;)V

    iput-object p2, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    .line 162
    iget-object p2, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    const v0, 0x7f0902be

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {p2, v0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->access$102(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 163
    iget-object p2, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    const v0, 0x7f09052a

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {p2, v0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->access$202(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 164
    iget-object p2, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    const v0, 0x7f0901cd

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    invoke-static {p2, v0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->access$302(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;Landroid/widget/EditText;)Landroid/widget/EditText;

    .line 165
    iget-object p2, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    const v0, 0x7f090509

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-static {p2, p1}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->access$402(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 167
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->imageCache:Lcom/ibotta/android/images/ImageCache;

    iget-object p2, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->context:Landroid/content/Context;

    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->profilePicUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    invoke-static {v1}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->access$100(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;)Landroid/widget/ImageView;

    move-result-object v1

    sget-object v2, Lcom/ibotta/android/views/images/Sizes;->FRIEND_PROFILE_PIC:Lcom/ibotta/android/views/images/Sizes;

    invoke-interface {p1, p2, v0, v1, v2}, Lcom/ibotta/android/images/ImageCache;->load(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;Lcom/ibotta/android/images/ImageCache$Size;)Lcom/ibotta/android/images/ImageLoadJob;

    .line 169
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->access$200(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;)Landroid/widget/TextView;

    move-result-object p1

    iget-object p2, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->fullName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 171
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    invoke-static {p1}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->access$300(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;)Landroid/widget/EditText;

    move-result-object p1

    new-instance p2, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$1;

    invoke-direct {p2, p0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$1;-><init>(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;)V

    invoke-virtual {p1, p2}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 188
    invoke-direct {p0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->updateCharsRemaining()V

    .line 190
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->appHelper:Lcom/ibotta/android/util/AppHelper;

    iget-object p2, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    invoke-static {p2}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->access$300(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;)Landroid/widget/EditText;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/ibotta/android/util/AppHelper;->showSoftKeyboardAsyncFocus(Landroid/view/View;)V

    .line 192
    iget-object p1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    return-object p1
.end method

.method private onSendMessage()V
    .locals 2

    .line 202
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    invoke-static {v0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->access$300(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 203
    new-instance v1, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendSendMessageEvent;

    invoke-direct {v1, v0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendSendMessageEvent;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 204
    invoke-virtual {v1, v0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendSendMessageEvent;->setEventId(I)V

    .line 205
    invoke-virtual {p0, v1}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->notifyPageEvent(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageEvent;)V

    return-void
.end method

.method public static sendFriendMessage(Lcom/ibotta/android/state/user/UserState;Lcom/ibotta/android/service/api/job/ApiJobFactory;Lcom/ibotta/android/service/api/ApiWorkSubmitter;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;ILjava/lang/String;)V
    .locals 0

    .line 75
    invoke-interface {p0}, Lcom/ibotta/android/state/user/UserState;->getCustomerId()I

    move-result p0

    .line 74
    invoke-interface {p1, p0, p5, p6}, Lcom/ibotta/android/service/api/job/ApiJobFactory;->createCustomerFriendsMessagePostJob(IILjava/lang/String;)Lcom/ibotta/android/service/api/job/SingleApiJob;

    move-result-object p0

    .line 77
    new-instance p1, Lcom/ibotta/android/fragment/activity/-$$Lambda$FriendsMessageFlyUpCreator$tShcek4QMIJJJeHSPRAvC7wVw44;

    invoke-direct {p1, p6, p3, p4}, Lcom/ibotta/android/fragment/activity/-$$Lambda$FriendsMessageFlyUpCreator$tShcek4QMIJJJeHSPRAvC7wVw44;-><init>(Ljava/lang/String;Lcom/ibotta/android/tracking/Tracker;Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;)V

    invoke-virtual {p0, p1}, Lcom/ibotta/android/service/api/job/SingleApiJob;->addListener(Lcom/ibotta/android/service/api/job/ApiJobListener;)V

    .line 87
    invoke-interface {p4, p6}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageListener;->onFriendMessageSending(Ljava/lang/String;)V

    .line 89
    invoke-interface {p2, p0}, Lcom/ibotta/android/service/api/ApiWorkSubmitter;->submit(Lcom/ibotta/android/service/api/job/ApiJob;)V

    return-void
.end method

.method private updateCharsRemaining()V
    .locals 4

    .line 196
    iget-object v0, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    invoke-static {v0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->access$300(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;)Landroid/widget/EditText;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    rsub-int v0, v0, 0x8c

    .line 197
    invoke-static {}, Lcom/ibotta/android/App;->instance()Lcom/ibotta/android/App;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const v0, 0x7f110144

    invoke-virtual {v1, v0, v2}, Lcom/ibotta/android/App;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 198
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->vhMessage:Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    invoke-static {v1}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;->access$400(Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;)Landroid/widget/TextView;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public getFlyUpData()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;",
            ">;"
        }
    .end annotation

    .line 119
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 120
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->pageDataMessage:Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public makeFlyUpPage(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)V
    .locals 1

    .line 127
    iget p3, p3, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    if-eqz p3, :cond_0

    const/4 p3, -0x1

    goto :goto_0

    :cond_0
    const p3, 0x7f0c00e7

    :goto_0
    const/4 v0, 0x1

    .line 132
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    return-void
.end method

.method public makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
    .locals 1

    .line 138
    iget v0, p2, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;->id:I

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 140
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->makeFriendMessageViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator$FriendMessageViewHolder;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public onRightControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)Z
    .locals 1

    .line 149
    sget-object v0, Lcom/ibotta/android/fragment/dialog/flyup/RightControl;->SEND:Lcom/ibotta/android/fragment/dialog/flyup/RightControl;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x1

    .line 151
    invoke-direct {p0}, Lcom/ibotta/android/fragment/activity/FriendsMessageFlyUpCreator;->onSendMessage()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 155
    invoke-super {p0, p1}, Lcom/ibotta/android/fragment/dialog/flyup/BaseFlyUpPageCreator;->onRightControlClicked(Lcom/ibotta/android/fragment/dialog/flyup/RightControl;)Z

    move-result v0

    :cond_1
    return v0
.end method
