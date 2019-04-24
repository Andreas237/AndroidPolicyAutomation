.class public Lcom/shopkick/app/bnc/LinkedCardsViewController;
.super Ljava/lang/Object;
.source "LinkedCardsViewController.java"

# interfaces
.implements Lcom/shopkick/fetchers/api/IAPICallback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/bnc/LinkedCardsViewController$FadeInOutListener;,
        Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;,
        Lcom/shopkick/app/bnc/LinkedCardsViewController$UnEnrollCardClickListener;,
        Lcom/shopkick/app/bnc/LinkedCardsViewController$EditLinkedCardsButtonClick;,
        Lcom/shopkick/app/bnc/LinkedCardsViewController$ILinkedCardsViewCallback;
    }
.end annotation


# static fields
.field private static final ACTION_BUTTON_VIEW_BUTTON_ONLY_HEIGHT:I = 0x3e

.field private static final ACTION_BUTTON_VIEW_FULL_HEIGHT:I = 0x55

.field public static final BUY_AND_COLLECT_UNENROLL_SUCCESS:Ljava/lang/String; = "BUY_AND_COLLECT_UNENROLL_SUCCESS"

.field public static final DEFAULT_ANIMATION_DURATION:I = 0x12c

.field private static final ENROLLED_CARD_1X_HEIGHT:I = 0x69

.field private static final ENROLLED_CARD_1X_WIDTH:I = 0x99

.field private static final GENERIC_PADDING_DIP:I = 0xf

.field private static final LOYALTY_PROGRAM_ID_ADD:I = -0x80000000


# instance fields
.field private actionButton:Lcom/shopkick/app/widget/SKButton;

.field private actionButtonView:Landroid/widget/RelativeLayout;

.field private addVisaCardView:Landroid/view/View;

.field private apiManager:Lcom/shopkick/fetchers/api/APIManager;

.field private cardsViewCallbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/bnc/LinkedCardsViewController$ILinkedCardsViewCallback;",
            ">;"
        }
    .end annotation
.end field

.field private containingScrollView:Landroid/widget/ScrollView;

.field private context:Landroid/content/Context;

.field private deleteCardsRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardRequest;

.field private enrolledCardViews:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private enrolledCardsDescriptorHeight:I

.field private eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

.field private isVisaOnly:Z

.field private linkedCardsView:Landroid/widget/RelativeLayout;

.field private lockAndPromptView:Landroid/view/View;

.field private loyaltyProgramDialogCallbackRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;",
            ">;"
        }
    .end annotation
.end field

.field private manageCardsButton:Lcom/shopkick/app/widget/SKTextView;

.field private notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

.field private unlinkIndividualCardsDialog:Landroid/app/Dialog;

.field private userAccount:Lcom/shopkick/app/account/UserAccount;


# direct methods
.method public constructor <init>(Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;Lcom/shopkick/app/bnc/LinkedCardsViewController$ILinkedCardsViewCallback;Landroid/content/Context;Lcom/shopkick/app/logging/UserEventLogger;Landroid/widget/RelativeLayout;Lcom/shopkick/fetchers/api/APIManager;Lcom/shopkick/app/account/UserAccount;Lcom/shopkick/app/util/NotificationCenter;)V
    .locals 1

    .line 95
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 96
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->loyaltyProgramDialogCallbackRef:Ljava/lang/ref/WeakReference;

    .line 97
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->cardsViewCallbackRef:Ljava/lang/ref/WeakReference;

    .line 98
    iput-object p3, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    .line 99
    iput-object p4, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    .line 100
    iput-object p5, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    .line 101
    iput-object p6, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    .line 102
    iput-object p7, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    .line 103
    iput-object p8, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    .line 104
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardViews:Ljava/util/ArrayList;

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/bnc/LinkedCardsViewController;)Landroid/view/View;
    .locals 0

    .line 45
    iget-object p0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->lockAndPromptView:Landroid/view/View;

    return-object p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->scrollUpScrollView()V

    return-void
.end method

.method static synthetic access$200(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->handleEditCardsClick()V

    return-void
.end method

.method static synthetic access$300(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V
    .locals 0

    .line 45
    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->toggleCard(Landroid/view/View;)V

    return-void
.end method

.method private animateCardsDescriptionTextChange(Landroid/view/View;Landroid/view/View;)V
    .locals 3

    .line 481
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x12c

    .line 482
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 483
    new-instance v1, Lcom/shopkick/app/bnc/LinkedCardsViewController$FadeInOutListener;

    invoke-direct {v1, p1, p2}, Lcom/shopkick/app/bnc/LinkedCardsViewController$FadeInOutListener;-><init>(Landroid/view/View;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 484
    invoke-virtual {p1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private animateManageCardsButtonTextChange(Landroid/widget/TextView;Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 473
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setClickable(Z)V

    .line 474
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x12c

    .line 475
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 476
    new-instance v1, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;

    invoke-direct {v1, p1, p2}, Lcom/shopkick/app/bnc/LinkedCardsViewController$TextOutListener;-><init>(Landroid/widget/TextView;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 477
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private cancelUnlinkDialog()V
    .locals 3

    .line 572
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    const/4 v0, 0x0

    .line 573
    iput-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    .line 575
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->manageCardsButton:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v0}, Lcom/shopkick/app/widget/SKTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v2, 0x7f110099

    .line 576
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 577
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 576
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 578
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->toggleCardEditing()V

    :cond_0
    return-void
.end method

.method private configureEnrolledCard(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;Landroid/widget/RelativeLayout;FF)V
    .locals 8

    .line 202
    invoke-virtual {p2}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 203
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p3

    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 204
    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p3

    iput p3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 205
    invoke-virtual {p2, v0}, Landroid/widget/RelativeLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 212
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    const p4, 0x7f0900d0

    const/high16 v0, -0x80000000

    const/16 v1, 0xa

    const v2, 0x7f0900cf

    const/16 v3, 0x8

    const/4 v4, 0x0

    const v5, 0x7f08031a

    const v6, 0x7f08031b

    if-ne p3, v3, :cond_0

    const/16 p3, 0x1e

    .line 213
    iget-object v7, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-static {p3, v7}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p3

    .line 214
    iget-object v7, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-static {v1, v7}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v1

    goto :goto_1

    .line 215
    :cond_0
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    if-ne p3, v1, :cond_2

    .line 216
    iget-boolean p3, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->isVisaOnly:Z

    if-eqz p3, :cond_1

    const p3, 0x7f0801fd

    const v1, 0x7f0801fe

    .line 221
    iget-object v5, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    const v6, 0x7f0600c7

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    .line 222
    invoke-virtual {p2, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 223
    invoke-virtual {p2, p4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTextColor(I)V

    move v5, p3

    move v6, v1

    goto :goto_0

    :cond_1
    const p3, 0x7f0801fc

    const v1, 0x7f0801fb

    move v5, p3

    move v6, v1

    :goto_0
    const/16 p3, 0x19

    .line 229
    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-static {p3, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result p3

    const/16 v1, 0xf

    .line 230
    iget-object v7, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-static {v1, v7}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v1

    goto :goto_1

    .line 231
    :cond_2
    iget-object p3, p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    if-eq p3, v0, :cond_3

    .line 232
    invoke-virtual {p2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    return-void

    :cond_3
    move p3, v4

    move v1, p3

    :goto_1
    const v7, 0x7f0900c7

    .line 235
    invoke-virtual {p2, v7}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    .line 236
    invoke-virtual {v7, v5}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    const v5, 0x7f090459

    .line 237
    invoke-virtual {p2, v5}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v5

    .line 238
    iget-object v7, p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v0, :cond_4

    .line 239
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    const p1, 0x7f090245

    .line 240
    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 241
    invoke-virtual {p2, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 p3, 0x4

    invoke-virtual {p1, p3}, Landroid/view/View;->setVisibility(I)V

    .line 242
    invoke-virtual {p2, p4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    const p3, 0x7f110069

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(I)V

    .line 243
    new-instance p1, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$oMU2aM64O9njGQnQg0OiDed0cMc;

    invoke-direct {p1, p0}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$oMU2aM64O9njGQnQg0OiDed0cMc;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    iput-object p2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->addVisaCardView:Landroid/view/View;

    goto :goto_2

    .line 251
    :cond_4
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackgroundResource(I)V

    .line 252
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    .line 253
    iput p3, p4, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 254
    iput v1, p4, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 255
    invoke-virtual {v5, p4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 256
    invoke-virtual {p2, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    iget-object p4, p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->panLastFourString:Ljava/lang/String;

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 258
    iget-object p3, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardViews:Ljava/util/ArrayList;

    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 259
    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->setTag(Ljava/lang/Object;)V

    .line 260
    new-instance p1, Lcom/shopkick/app/bnc/LinkedCardsViewController$UnEnrollCardClickListener;

    invoke-direct {p1, p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController$UnEnrollCardClickListener;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    invoke-virtual {p2, p1}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 261
    invoke-virtual {p2, v4}, Landroid/widget/RelativeLayout;->setClickable(Z)V

    :goto_2
    return-void
.end method

.method private configureLinkAnotherCardButton()V
    .locals 4

    .line 268
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0900c0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 269
    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v2, 0x7f110062

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 270
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButton:Lcom/shopkick/app/widget/SKButton;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 271
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButton:Lcom/shopkick/app/widget/SKButton;

    const v2, 0x7f110096

    invoke-virtual {v0, v2}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 273
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v2, 0xf

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 274
    new-instance v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v2}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    .line 275
    iput-boolean v1, v2, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 276
    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v3, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0, v3, v2}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 278
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v1, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$TCCOeqSbCJCkTD2FTEFWFDpYHIk;

    invoke-direct {v1, p0}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$TCCOeqSbCJCkTD2FTEFWFDpYHIk;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->lockAndPromptView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 286
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x12c

    .line 287
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setStartOffset(J)V

    .line 288
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 289
    new-instance v1, Lcom/shopkick/app/bnc/LinkedCardsViewController$1;

    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->lockAndPromptView:Landroid/view/View;

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/bnc/LinkedCardsViewController$1;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 295
    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->lockAndPromptView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    return-void
.end method

.method private configureUnlinkCardsButton()V
    .locals 4

    .line 301
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->updateUnlinkCardsButtonState()V

    .line 303
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0xac

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 304
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    const/4 v2, 0x1

    .line 305
    iput-boolean v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 306
    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v3, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v0, v3, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    .line 308
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButton:Lcom/shopkick/app/widget/SKButton;

    new-instance v1, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$PNJI6wgJSf0FU75rzzQVhrLtNgQ;

    invoke-direct {v1, p0}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$PNJI6wgJSf0FU75rzzQVhrLtNgQ;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 310
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    const-wide/16 v1, 0x12c

    .line 311
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 312
    new-instance v1, Lcom/shopkick/app/bnc/LinkedCardsViewController$2;

    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->lockAndPromptView:Landroid/view/View;

    invoke-direct {v1, p0, v2}, Lcom/shopkick/app/bnc/LinkedCardsViewController$2;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V

    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 318
    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->lockAndPromptView:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private configureUnlinkIndividualCardsDialog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V
    .locals 4

    .line 545
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    .line 546
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 547
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    const v1, 0x7f0901fb

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 548
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    const v2, 0x7f090431

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 550
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    const v3, 0x7f0902fd

    invoke-virtual {v0, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 551
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    const v0, 0x7f09076e

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 552
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    const p2, 0x7f090703

    invoke-virtual {p1, p2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 553
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    const p2, 0x7f090534

    invoke-virtual {p1, p2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    .line 554
    invoke-virtual {p1, p4}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 555
    invoke-virtual {p1, p6}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 557
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    const p2, 0x7f0904a3

    invoke-virtual {p1, p2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/SKButton;

    const p2, 0x7f0900bf

    if-eqz p5, :cond_0

    .line 559
    iget-object p3, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    invoke-virtual {p3, p2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 560
    invoke-virtual {p1, v1}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    .line 561
    invoke-virtual {p1, p5}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 562
    invoke-virtual {p1, p7}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    .line 564
    :cond_0
    iget-object p3, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    invoke-virtual {p3, p2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2, v2}, Landroid/view/View;->setVisibility(I)V

    .line 565
    invoke-virtual {p1, v2}, Lcom/shopkick/app/widget/SKButton;->setVisibility(I)V

    const/4 p2, 0x0

    .line 566
    invoke-virtual {p1, p2}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private expandLinkedCardsWidget()V
    .locals 7

    .line 456
    new-instance v0, Lcom/shopkick/app/animation/VerticalResizeAnimation;

    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    .line 457
    invoke-virtual {v1}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v2

    iget-object v3, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    const/16 v4, 0x55

    .line 458
    invoke-static {v4, v3}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v3

    invoke-direct {v0, v1, v2, v3}, Lcom/shopkick/app/animation/VerticalResizeAnimation;-><init>(Landroid/view/View;II)V

    const-wide/16 v1, 0x12c

    .line 459
    invoke-virtual {v0, v1, v2}, Lcom/shopkick/app/animation/VerticalResizeAnimation;->setDuration(J)V

    .line 461
    iget-object v3, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v4, 0x7f0900d1

    invoke-virtual {v3, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 462
    new-instance v4, Lcom/shopkick/app/animation/VerticalResizeAnimation;

    .line 463
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    move-result v5

    iget v6, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardsDescriptorHeight:I

    invoke-direct {v4, v3, v5, v6}, Lcom/shopkick/app/animation/VerticalResizeAnimation;-><init>(Landroid/view/View;II)V

    .line 465
    invoke-virtual {v4, v1, v2}, Lcom/shopkick/app/animation/VerticalResizeAnimation;->setDuration(J)V

    .line 467
    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    invoke-virtual {v1, v0}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 468
    invoke-virtual {v3, v4}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private handleDeleteCardsResponse(Lcom/shopkick/fetchers/DataResponse;)V
    .locals 14

    const/4 v0, 0x0

    .line 614
    iput-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->deleteCardsRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardRequest;

    .line 615
    iget-boolean v1, p1, Lcom/shopkick/fetchers/DataResponse;->success:Z

    if-eqz v1, :cond_6

    iget-object v1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    if-eqz v1, :cond_6

    .line 616
    iget-object p1, p1, Lcom/shopkick/fetchers/DataResponse;->responseData:Ljava/lang/Object;

    check-cast p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardResponse;

    .line 620
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 621
    iget-object v2, p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardResponse;->deleteCardStatuses:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardStatus;

    .line 622
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardStatus;->status:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-nez v7, :cond_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 624
    :cond_1
    iget-object v7, v6, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardStatus;->status:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_0

    .line 625
    iget-object v6, v6, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardStatus;->cardToBeDeleted:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectCardToBeDeleted;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 629
    :cond_2
    iget-object p1, p1, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardResponse;->deleteCardStatuses:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ne v4, p1, :cond_3

    .line 631
    new-instance p1, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$H9kOvpgtPaoU_4iNhwRPEbZMgvg;

    invoke-direct {p1, p0, v1}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$H9kOvpgtPaoU_4iNhwRPEbZMgvg;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;Ljava/util/ArrayList;)V

    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->showUnlinkErrorOccurredDialog(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_3
    if-lez v4, :cond_4

    .line 634
    new-instance p1, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$k110GjBheGxtsQp4TsFNyJK_qH0;

    invoke-direct {p1, p0, v1}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$k110GjBheGxtsQp4TsFNyJK_qH0;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;Ljava/util/ArrayList;)V

    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->showUnlinkErrorOccurredDialog(Landroid/view/View$OnClickListener;)V

    .line 635
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "BUY_AND_COLLECT_UNENROLL_SUCCESS"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_1

    :cond_4
    const v7, 0x7f08030a

    .line 638
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    .line 639
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0f000c

    .line 640
    invoke-virtual {p1, v1, v5}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v8

    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    .line 642
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v1, 0x7f0f000b

    .line 643
    invoke-virtual {p1, v1, v5}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v9

    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v1, 0x7f11016e

    .line 644
    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    const/4 v11, 0x0

    new-instance v12, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$v-tXSDF4IxSaAzMRfeX2Iz961i0;

    invoke-direct {v12, p0}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$v-tXSDF4IxSaAzMRfeX2Iz961i0;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    const/4 v13, 0x0

    move-object v6, p0

    .line 638
    invoke-direct/range {v6 .. v13}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->configureUnlinkIndividualCardsDialog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    .line 649
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardViews:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ne p1, v5, :cond_5

    .line 650
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1, v3}, Lcom/shopkick/app/account/UserAccount;->setBuyAndCollectEnrolled(Z)V

    .line 651
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1, v0}, Lcom/shopkick/app/account/UserAccount;->setAllLoyaltyProgramsEnrolled(Ljava/util/ArrayList;)V

    .line 652
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->userAccount:Lcom/shopkick/app/account/UserAccount;

    invoke-virtual {p1}, Lcom/shopkick/app/account/UserAccount;->save()V

    .line 654
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->notificationCenter:Lcom/shopkick/app/util/NotificationCenter;

    const-string v0, "BUY_AND_COLLECT_UNENROLL_SUCCESS"

    invoke-virtual {p1, v0}, Lcom/shopkick/app/util/NotificationCenter;->notifyEvent(Ljava/lang/String;)Ljava/util/List;

    goto :goto_1

    .line 657
    :cond_6
    new-instance p1, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$9L1XxDaJzBJKyIjkiFn4EVuzJe4;

    invoke-direct {p1, p0}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$9L1XxDaJzBJKyIjkiFn4EVuzJe4;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->showUnlinkErrorOccurredDialog(Landroid/view/View$OnClickListener;)V

    :goto_1
    return-void
.end method

.method private handleEditCardsClick()V
    .locals 0

    .line 344
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->toggleCardEditing()V

    return-void
.end method

.method public static synthetic lambda$configureEnrolledCard$23(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V
    .locals 1

    .line 244
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->loyaltyProgramDialogCallbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    .line 246
    invoke-interface {p1, v0}, Lcom/shopkick/app/widget/IBuyAndCollectLoyaltyProgramDialogCallback;->buttonTapped(I)V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$configureLinkAnotherCardButton$24(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V
    .locals 0

    .line 279
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->cardsViewCallbackRef:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/shopkick/app/bnc/LinkedCardsViewController$ILinkedCardsViewCallback;

    if-eqz p1, :cond_0

    .line 281
    invoke-interface {p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController$ILinkedCardsViewCallback;->onLinkAnotherCardClicked()V

    :cond_0
    return-void
.end method

.method public static synthetic lambda$configureUnlinkCardsButton$25(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V
    .locals 0

    .line 308
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->showUnlinkIndividualCardsDialog()V

    return-void
.end method

.method public static synthetic lambda$handleDeleteCardsResponse$31(Lcom/shopkick/app/bnc/LinkedCardsViewController;Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 0

    .line 631
    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkCards(Ljava/util/ArrayList;)V

    return-void
.end method

.method public static synthetic lambda$handleDeleteCardsResponse$32(Lcom/shopkick/app/bnc/LinkedCardsViewController;Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 0

    .line 634
    invoke-direct {p0, p1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkCards(Ljava/util/ArrayList;)V

    return-void
.end method

.method public static synthetic lambda$handleDeleteCardsResponse$33(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V
    .locals 0

    .line 646
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    return-void
.end method

.method public static synthetic lambda$handleDeleteCardsResponse$34(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V
    .locals 0

    .line 657
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkSelectedCards()V

    return-void
.end method

.method public static synthetic lambda$scrollUpScrollView$26(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/animation/ValueAnimator;)V
    .locals 2

    .line 493
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->containingScrollView:Landroid/widget/ScrollView;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/widget/ScrollView;->scrollTo(II)V

    return-void
.end method

.method public static synthetic lambda$showUnlinkErrorOccurredDialog$30(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V
    .locals 0

    .line 534
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->cancelUnlinkDialog()V

    return-void
.end method

.method public static synthetic lambda$showUnlinkIndividualCardsDialog$27(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/content/DialogInterface;)V
    .locals 0

    .line 517
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->cancelUnlinkDialog()V

    return-void
.end method

.method public static synthetic lambda$showUnlinkIndividualCardsDialog$28(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V
    .locals 0

    .line 523
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->cancelUnlinkDialog()V

    return-void
.end method

.method public static synthetic lambda$showUnlinkIndividualCardsDialog$29(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V
    .locals 0

    .line 524
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkSelectedCards()V

    return-void
.end method

.method private logEditButtonTapped()V
    .locals 3

    .line 500
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x7a

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 501
    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v1, v0}, Lcom/shopkick/app/logging/UserEventLogger;->detectedEvent(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;)V

    return-void
.end method

.method private scrollUpScrollView()V
    .locals 3

    .line 488
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->containingScrollView:Landroid/widget/ScrollView;

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    .line 489
    new-array v1, v1, [I

    const/4 v2, 0x0

    invoke-virtual {v0}, Landroid/widget/ScrollView;->getScrollY()I

    move-result v0

    aput v0, v1, v2

    const/4 v0, 0x1

    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    .line 490
    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getTop()I

    move-result v2

    aput v2, v1, v0

    .line 489
    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofInt([I)Landroid/animation/ValueAnimator;

    move-result-object v0

    const-wide/16 v1, 0x12c

    .line 491
    invoke-virtual {v0, v1, v2}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 492
    new-instance v1, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$3r8RwlpyrIkiTJyPw8pHRNAKMdM;

    invoke-direct {v1, p0}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$3r8RwlpyrIkiTJyPw8pHRNAKMdM;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 495
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    :cond_0
    return-void
.end method

.method private showUnlinkErrorOccurredDialog(Landroid/view/View$OnClickListener;)V
    .locals 10

    .line 529
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v1, 0x7f1100c2

    .line 530
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v1, 0x7f1100c1

    .line 531
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v1, 0x7f11015b

    .line 532
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v1, 0x7f110157

    .line 533
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$pTw5QlgX6eEwbDmIWGQ6wWd_lh4;

    invoke-direct {v8, p0}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$pTw5QlgX6eEwbDmIWGQ6wWd_lh4;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    const v3, 0x7f080309

    move-object v2, p0

    move-object v9, p1

    .line 529
    invoke-direct/range {v2 .. v9}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->configureUnlinkIndividualCardsDialog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private showUnlinkIndividualCardsDialog()V
    .locals 10

    .line 515
    new-instance v0, Landroid/app/Dialog;

    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v2, 0x7f12022d

    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    .line 516
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    const v1, 0x7f0c01e2

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setContentView(I)V

    .line 517
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    new-instance v1, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$h6cRbyc7J5KlRjkPUk2yiPm80EM;

    invoke-direct {v1, p0}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$h6cRbyc7J5KlRjkPUk2yiPm80EM;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 518
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v1, 0x7f1100bd

    .line 519
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v1, 0x7f1100bc

    .line 520
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v1, 0x7f11015b

    .line 521
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v1, 0x7f1100c4

    .line 522
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$xKSKh822Lf-b1Orof1eVy-KglW4;

    invoke-direct {v8, p0}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$xKSKh822Lf-b1Orof1eVy-KglW4;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    new-instance v9, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$gNrfGDWG_ofQIXFNJLSA-wAv8RA;

    invoke-direct {v9, p0}, Lcom/shopkick/app/bnc/-$$Lambda$LinkedCardsViewController$gNrfGDWG_ofQIXFNJLSA-wAv8RA;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    const v3, 0x7f08005b

    move-object v2, p0

    .line 518
    invoke-direct/range {v2 .. v9}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->configureUnlinkIndividualCardsDialog(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Landroid/view/View$OnClickListener;)V

    .line 525
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    return-void
.end method

.method private shrinkLinkedCardsWidget()V
    .locals 7

    .line 430
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v1, 0x7f090246

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iput v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardsDescriptorHeight:I

    .line 431
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v1, 0x7f0907de

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    .line 433
    new-instance v1, Lcom/shopkick/app/animation/VerticalResizeAnimation;

    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    .line 434
    invoke-virtual {v2}, Landroid/widget/RelativeLayout;->getHeight()I

    move-result v3

    iget-object v4, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    const/16 v5, 0x3e

    .line 435
    invoke-static {v5, v4}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v4

    invoke-direct {v1, v2, v3, v4}, Lcom/shopkick/app/animation/VerticalResizeAnimation;-><init>(Landroid/view/View;II)V

    const-wide/16 v2, 0x12c

    .line 436
    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/animation/VerticalResizeAnimation;->setStartOffset(J)V

    .line 437
    invoke-virtual {v1, v2, v3}, Lcom/shopkick/app/animation/VerticalResizeAnimation;->setDuration(J)V

    .line 439
    iget-object v4, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v5, 0x7f0900d1

    invoke-virtual {v4, v5}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v4

    .line 440
    new-instance v5, Lcom/shopkick/app/animation/VerticalResizeAnimation;

    .line 441
    invoke-virtual {v4}, Landroid/view/View;->getHeight()I

    move-result v6

    invoke-direct {v5, v4, v6, v0}, Lcom/shopkick/app/animation/VerticalResizeAnimation;-><init>(Landroid/view/View;II)V

    .line 443
    invoke-virtual {v5, v2, v3}, Lcom/shopkick/app/animation/VerticalResizeAnimation;->setStartOffset(J)V

    .line 444
    invoke-virtual {v5, v2, v3}, Lcom/shopkick/app/animation/VerticalResizeAnimation;->setDuration(J)V

    .line 445
    new-instance v0, Lcom/shopkick/app/bnc/LinkedCardsViewController$3;

    invoke-direct {v0, p0, v4}, Lcom/shopkick/app/bnc/LinkedCardsViewController$3;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;Landroid/view/View;)V

    invoke-virtual {v5, v0}, Lcom/shopkick/app/animation/VerticalResizeAnimation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 451
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->startAnimation(Landroid/view/animation/Animation;)V

    .line 452
    invoke-virtual {v4, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    return-void
.end method

.method private toggleCard(Landroid/view/View;)V
    .locals 1

    const v0, 0x7f0900fe

    .line 505
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    .line 506
    invoke-virtual {p1}, Landroid/view/View;->isSelected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 507
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    .line 509
    invoke-virtual {p1, v0}, Landroid/view/View;->setSelected(Z)V

    .line 511
    :goto_0
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->updateUnlinkCardsButtonState()V

    return-void
.end method

.method private toggleCardEditing()V
    .locals 16

    move-object/from16 v0, p0

    .line 348
    iget-object v1, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v2, 0x7f090246

    invoke-virtual {v1, v2}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    .line 349
    iget-object v2, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v3, 0x7f0907de

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 351
    iget-object v3, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f06015d

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 352
    iget-object v4, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x7f0600c7

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    .line 354
    iget-object v5, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->manageCardsButton:Lcom/shopkick/app/widget/SKTextView;

    invoke-virtual {v5}, Lcom/shopkick/app/widget/SKTextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    iget-object v6, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v7, 0x7f110099

    .line 355
    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 356
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    .line 355
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    const v6, 0x7f090459

    const v8, 0x7f0900cf

    const/16 v9, 0xa

    const v11, 0x7f0801fd

    const v13, 0x7f0900fe

    const v14, 0x7f0900c7

    const v15, 0x7f0900d0

    const/4 v7, 0x0

    if-eqz v5, :cond_3

    .line 358
    iget-object v5, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->manageCardsButton:Lcom/shopkick/app/widget/SKTextView;

    iget-object v10, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v12, 0x7f11009a

    .line 359
    invoke-virtual {v10, v12}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    .line 358
    invoke-direct {v0, v5, v10}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->animateManageCardsButtonTextChange(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 360
    iget-object v5, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardViews:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/view/View;

    .line 361
    invoke-virtual {v10, v7}, Landroid/view/View;->setClickable(Z)V

    .line 362
    invoke-virtual {v10, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    invoke-virtual {v12, v7}, Landroid/view/View;->setSelected(Z)V

    .line 363
    invoke-virtual {v10, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    const/16 v7, 0x8

    invoke-virtual {v12, v7}, Landroid/view/View;->setVisibility(I)V

    .line 365
    iget-boolean v7, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->isVisaOnly:Z

    if-eqz v7, :cond_0

    .line 367
    invoke-virtual {v10}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;

    if-eqz v7, :cond_0

    .line 368
    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v9, :cond_0

    .line 369
    invoke-virtual {v10, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 370
    invoke-virtual {v10, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 371
    invoke-virtual {v10, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    .line 372
    invoke-virtual {v7, v11}, Landroid/view/View;->setBackgroundResource(I)V

    .line 373
    invoke-virtual {v10, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const v10, 0x7f0801fe

    .line 374
    invoke-virtual {v7, v10}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_0
    const/4 v7, 0x0

    goto :goto_0

    .line 380
    :cond_1
    iget-boolean v4, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->isVisaOnly:Z

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->addVisaCardView:Landroid/view/View;

    if-eqz v4, :cond_2

    const/4 v5, 0x1

    .line 381
    invoke-virtual {v4, v5}, Landroid/view/View;->setClickable(Z)V

    .line 382
    iget-object v4, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->addVisaCardView:Landroid/view/View;

    invoke-virtual {v4, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 383
    iget-object v3, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->addVisaCardView:Landroid/view/View;

    invoke-virtual {v3, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f08031a

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundResource(I)V

    .line 384
    iget-object v3, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->addVisaCardView:Landroid/view/View;

    const v4, 0x7f090245

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f080088

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundResource(I)V

    .line 387
    :cond_2
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->expandLinkedCardsWidget()V

    .line 388
    invoke-direct {v0, v2, v1}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->animateCardsDescriptionTextChange(Landroid/view/View;Landroid/view/View;)V

    .line 389
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->configureLinkAnotherCardButton()V

    goto/16 :goto_2

    .line 393
    :cond_3
    iget-object v5, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->manageCardsButton:Lcom/shopkick/app/widget/SKTextView;

    iget-object v7, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v10, 0x7f110099

    .line 394
    invoke-virtual {v7, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    .line 393
    invoke-direct {v0, v5, v7}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->animateManageCardsButtonTextChange(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 395
    iget-object v5, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardViews:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/view/View;

    const/4 v10, 0x1

    .line 396
    invoke-virtual {v7, v10}, Landroid/view/View;->setClickable(Z)V

    .line 397
    invoke-virtual {v7, v13}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    const/4 v10, 0x0

    invoke-virtual {v12, v10}, Landroid/view/View;->setVisibility(I)V

    .line 400
    iget-boolean v10, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->isVisaOnly:Z

    if-eqz v10, :cond_4

    .line 401
    invoke-virtual {v7}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;

    if-eqz v10, :cond_4

    .line 402
    iget-object v10, v10, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v10

    if-ne v10, v9, :cond_4

    .line 403
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 404
    invoke-virtual {v7, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    check-cast v10, Landroid/widget/TextView;

    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 405
    invoke-virtual {v7, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v10

    const v12, 0x7f0801fc

    .line 406
    invoke-virtual {v10, v12}, Landroid/view/View;->setBackgroundResource(I)V

    .line 407
    invoke-virtual {v7, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const v10, 0x7f0801fb

    invoke-virtual {v7, v10}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    .line 413
    :cond_5
    iget-boolean v3, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->isVisaOnly:Z

    if-eqz v3, :cond_6

    iget-object v3, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->addVisaCardView:Landroid/view/View;

    if-eqz v3, :cond_6

    const/4 v5, 0x0

    .line 414
    invoke-virtual {v3, v5}, Landroid/view/View;->setClickable(Z)V

    .line 415
    iget-object v3, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->addVisaCardView:Landroid/view/View;

    invoke-virtual {v3, v15}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    .line 416
    iget-object v3, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->addVisaCardView:Landroid/view/View;

    invoke-virtual {v3, v14}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 417
    invoke-virtual {v3, v11}, Landroid/view/View;->setBackgroundResource(I)V

    .line 418
    iget-object v3, v0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->addVisaCardView:Landroid/view/View;

    const v4, 0x7f090245

    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    const v4, 0x7f080089

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackgroundResource(I)V

    .line 421
    :cond_6
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->shrinkLinkedCardsWidget()V

    .line 422
    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->animateCardsDescriptionTextChange(Landroid/view/View;Landroid/view/View;)V

    .line 423
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->configureUnlinkCardsButton()V

    .line 424
    invoke-direct/range {p0 .. p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->logEditButtonTapped()V

    :goto_2
    return-void
.end method

.method private unlinkCards(Ljava/util/ArrayList;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectCardToBeDeleted;",
            ">;)V"
        }
    .end annotation

    .line 598
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 599
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    const v2, 0x7f0901fb

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 600
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    const v2, 0x7f090431

    invoke-virtual {v0, v2}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 601
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 602
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardRequest;

    invoke-direct {v0}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardRequest;-><init>()V

    iput-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->deleteCardsRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardRequest;

    .line 603
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->deleteCardsRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardRequest;

    iput-object p1, v0, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardRequest;->cardsToBeDeleted:Ljava/util/List;

    .line 604
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {p1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->appFetch(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)Lcom/shopkick/fetchers/RequestDetails;

    goto :goto_0

    .line 608
    :cond_0
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    const/4 p1, 0x0

    .line 609
    iput-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkIndividualCardsDialog:Landroid/app/Dialog;

    :goto_0
    return-void
.end method

.method private unlinkSelectedCards()V
    .locals 5

    .line 583
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 584
    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardViews:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    const v3, 0x7f0900fe

    .line 585
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 586
    invoke-virtual {v3}, Landroid/view/View;->isSelected()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 587
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;

    .line 588
    new-instance v3, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectCardToBeDeleted;

    invoke-direct {v3}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectCardToBeDeleted;-><init>()V

    .line 589
    iget-object v4, v2, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    iput-object v4, v3, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectCardToBeDeleted;->loyaltyProgramId:Ljava/lang/Integer;

    .line 590
    iget-object v2, v2, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramMemberId:Ljava/lang/String;

    iput-object v2, v3, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectCardToBeDeleted;->loyaltyProgramMemberId:Ljava/lang/String;

    .line 591
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 594
    :cond_1
    invoke-direct {p0, v0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->unlinkCards(Ljava/util/ArrayList;)V

    return-void
.end method

.method private updateUnlinkCardsButtonState()V
    .locals 5

    .line 323
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardViews:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    const v4, 0x7f0900fe

    .line 324
    invoke-virtual {v3, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    .line 325
    invoke-virtual {v3}, Landroid/view/View;->isSelected()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const v0, 0x7f0f000a

    const/4 v3, 0x1

    if-lez v2, :cond_2

    .line 330
    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v1, v3}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    .line 331
    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v3, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 332
    invoke-virtual {v3, v0, v2}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    .line 331
    invoke-virtual {v1, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    goto :goto_1

    .line 336
    :cond_2
    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButton:Lcom/shopkick/app/widget/SKButton;

    iget-object v4, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    .line 337
    invoke-virtual {v4, v0, v3}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v0

    .line 336
    invoke-virtual {v2, v0}, Lcom/shopkick/app/widget/SKButton;->setButtonText(Ljava/lang/String;)V

    .line 339
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButton:Lcom/shopkick/app/widget/SKButton;

    invoke-virtual {v0, v1}, Lcom/shopkick/app/widget/SKButton;->setEnabled(Z)V

    :goto_1
    return-void
.end method


# virtual methods
.method public completedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 1

    .line 667
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->deleteCardsRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardRequest;

    if-ne p1, v0, :cond_0

    .line 668
    invoke-direct {p0, p2}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->handleDeleteCardsResponse(Lcom/shopkick/fetchers/DataResponse;)V

    :cond_0
    return-void
.end method

.method public configureEnrolledCards(Ljava/util/List;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;",
            ">;)V"
        }
    .end annotation

    .line 122
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v1, 0x7f09041c

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    .line 123
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    const/16 v1, 0x8

    if-eqz p1, :cond_7

    .line 124
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_4

    .line 127
    :cond_0
    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 128
    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v4, 0x7f090017

    invoke-virtual {v2, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout;

    iput-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    .line 129
    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    const v4, 0x7f090014

    invoke-virtual {v2, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKButton;

    iput-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButton:Lcom/shopkick/app/widget/SKButton;

    .line 130
    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    const v4, 0x7f090446

    invoke-virtual {v2, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->lockAndPromptView:Landroid/view/View;

    .line 131
    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v4, 0x7f090464

    invoke-virtual {v2, v4}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/shopkick/app/widget/SKTextView;

    iput-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->manageCardsButton:Lcom/shopkick/app/widget/SKTextView;

    .line 132
    iget-object v2, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardViews:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    const/16 v2, 0xf

    .line 135
    iget-object v4, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-static {v2, v4}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v2

    .line 136
    iget-object v4, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-static {v4}, Lcom/shopkick/app/util/FrameConfigurator;->maxScreenWidth(Landroid/content/Context;)I

    move-result v4

    int-to-float v4, v4

    mul-int/lit8 v5, v2, 0x3

    int-to-float v5, v5

    sub-float/2addr v4, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    const/16 v5, 0x99

    .line 138
    iget-object v6, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-static {v5, v6}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v5

    int-to-float v5, v5

    div-float v5, v4, v5

    const/16 v6, 0x69

    .line 139
    iget-object v7, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-static {v6, v7}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/content/Context;)I

    move-result v6

    int-to-float v6, v6

    mul-float/2addr v6, v5

    int-to-float v5, v2

    add-float/2addr v4, v5

    add-float/2addr v6, v5

    move v5, v3

    .line 147
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v5, v7, :cond_2

    .line 148
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;

    iget-object v7, v7, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v1, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    move v5, v3

    .line 155
    :goto_1
    iget-boolean v7, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->isVisaOnly:Z

    if-eqz v7, :cond_3

    if-nez v5, :cond_3

    .line 156
    new-instance v5, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;

    invoke-direct {v5}, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;-><init>()V

    const/high16 v7, -0x80000000

    .line 157
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    iput-object v7, v5, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;->loyaltyProgramId:Ljava/lang/Integer;

    .line 158
    invoke-interface {p1, v3, v5}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_3
    move v5, v3

    .line 161
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v5, v7, :cond_5

    .line 163
    iget-object v7, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    invoke-static {v7}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v7

    const v8, 0x7f0c00af

    const/4 v9, 0x0

    .line 164
    invoke-virtual {v7, v8, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v7

    .line 165
    invoke-virtual {v0, v7}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 167
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    check-cast v8, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 168
    invoke-virtual {v8, v2, v3, v3, v3}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    const v8, 0x7f09040f

    .line 170
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/RelativeLayout;

    .line 171
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;

    invoke-direct {p0, v9, v8, v4, v6}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->configureEnrolledCard(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;Landroid/widget/RelativeLayout;FF)V

    const v8, 0x7f0905ea

    .line 173
    invoke-virtual {v7, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/RelativeLayout;

    add-int/lit8 v8, v5, 0x1

    .line 174
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v9

    if-ge v8, v9, :cond_4

    .line 175
    invoke-interface {p1, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;

    invoke-direct {p0, v8, v7, v4, v6}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->configureEnrolledCard(Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectEnrolledCard;Landroid/widget/RelativeLayout;FF)V

    goto :goto_3

    .line 177
    :cond_4
    invoke-virtual {v7, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :goto_3
    add-int/lit8 v5, v5, 0x2

    goto :goto_2

    .line 181
    :cond_5
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->manageCardsButton:Lcom/shopkick/app/widget/SKTextView;

    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->context:Landroid/content/Context;

    const v1, 0x7f11009a

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setText(Ljava/lang/String;)V

    .line 182
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->manageCardsButton:Lcom/shopkick/app/widget/SKTextView;

    new-instance v0, Lcom/shopkick/app/bnc/LinkedCardsViewController$EditLinkedCardsButtonClick;

    invoke-direct {v0, p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController$EditLinkedCardsButtonClick;-><init>(Lcom/shopkick/app/bnc/LinkedCardsViewController;)V

    invoke-virtual {p1, v0}, Lcom/shopkick/app/widget/SKTextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 185
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v0, 0x7f090246

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 186
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v0, 0x7f0907de

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 187
    iget p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardsDescriptorHeight:I

    if-eqz p1, :cond_6

    .line 188
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    const v0, 0x7f0900d1

    invoke-virtual {p1, v0}, Landroid/widget/RelativeLayout;->findViewById(I)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iget v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->enrolledCardsDescriptorHeight:I

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 191
    :cond_6
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    invoke-virtual {p1}, Landroid/widget/RelativeLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    const/16 v0, 0x55

    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->actionButtonView:Landroid/widget/RelativeLayout;

    invoke-static {v0, v1}, Lcom/shopkick/app/util/FrameConfigurator;->pixelDimension(ILandroid/view/View;)I

    move-result v0

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 194
    invoke-direct {p0}, Lcom/shopkick/app/bnc/LinkedCardsViewController;->configureLinkAnotherCardButton()V

    goto :goto_5

    .line 125
    :cond_7
    :goto_4
    iget-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->linkedCardsView:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    :goto_5
    return-void
.end method

.method public destroy()V
    .locals 2

    .line 108
    iget-object v0, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->deleteCardsRequest:Lcom/shopkick/app/fetchers/api/skapi/BuyAndCollectDeleteCardRequest;

    if-eqz v0, :cond_0

    .line 109
    iget-object v1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->apiManager:Lcom/shopkick/fetchers/api/APIManager;

    invoke-virtual {v1, v0, p0}, Lcom/shopkick/fetchers/api/APIManager;->cancel(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/api/IAPICallback;)V

    :cond_0
    return-void
.end method

.method public receivedResponse(Lcom/shopkick/app/fetchers/api/IAPIObject;Lcom/shopkick/fetchers/DataResponse;)V
    .locals 0

    return-void
.end method

.method public setContainingScrollView(Landroid/widget/ScrollView;)V
    .locals 0

    .line 114
    iput-object p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->containingScrollView:Landroid/widget/ScrollView;

    return-void
.end method

.method public setIsVisaOnly(Z)V
    .locals 0

    .line 118
    iput-boolean p1, p0, Lcom/shopkick/app/bnc/LinkedCardsViewController;->isVisaOnly:Z

    return-void
.end method
