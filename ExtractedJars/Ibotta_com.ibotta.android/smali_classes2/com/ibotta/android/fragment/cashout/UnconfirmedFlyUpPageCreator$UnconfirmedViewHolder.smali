.class Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;
.super Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
.source "UnconfirmedFlyUpPageCreator.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "UnconfirmedViewHolder"
.end annotation


# instance fields
.field private bResendEmail:Landroid/widget/Button;

.field private bResetEmail:Landroid/widget/Button;

.field private tcvTextContainer:Lcom/ibotta/android/view/common/TextContainerView;

.field private tvUnconfirmedBody:Landroid/widget/TextView;


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 158
    invoke-direct {p0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$1;)V
    .locals 0

    .line 158
    invoke-direct {p0}, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;-><init>()V

    return-void
.end method

.method static synthetic access$100(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;)Lcom/ibotta/android/view/common/TextContainerView;
    .locals 0

    .line 158
    iget-object p0, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->tcvTextContainer:Lcom/ibotta/android/view/common/TextContainerView;

    return-object p0
.end method

.method static synthetic access$102(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;Lcom/ibotta/android/view/common/TextContainerView;)Lcom/ibotta/android/view/common/TextContainerView;
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->tcvTextContainer:Lcom/ibotta/android/view/common/TextContainerView;

    return-object p1
.end method

.method static synthetic access$200(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;)Landroid/widget/Button;
    .locals 0

    .line 158
    iget-object p0, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->bResetEmail:Landroid/widget/Button;

    return-object p0
.end method

.method static synthetic access$202(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;Landroid/widget/Button;)Landroid/widget/Button;
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->bResetEmail:Landroid/widget/Button;

    return-object p1
.end method

.method static synthetic access$300(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;)Landroid/widget/Button;
    .locals 0

    .line 158
    iget-object p0, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->bResendEmail:Landroid/widget/Button;

    return-object p0
.end method

.method static synthetic access$302(Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;Landroid/widget/Button;)Landroid/widget/Button;
    .locals 0

    .line 158
    iput-object p1, p0, Lcom/ibotta/android/fragment/cashout/UnconfirmedFlyUpPageCreator$UnconfirmedViewHolder;->bResendEmail:Landroid/widget/Button;

    return-object p1
.end method
