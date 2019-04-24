.class public Lcom/shopkick/app/tutorials/TutorialDetailsScreen;
.super Lcom/shopkick/app/screens/AppScreen;
.source "TutorialDetailsScreen.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/shopkick/app/tutorials/TutorialDetailsScreen$TutorialButtonClick;
    }
.end annotation


# static fields
.field private static final TUTORIAL_DETAILS_TEXT_LARGE_FONT_SIZE:F = 15.0f

.field private static final TUTORIAL_DETAILS_TEXT_MAX_LARGE_FONT_LENGTH:I = 0x57

.field private static final TUTORIAL_DETAILS_TEXT_MAX_NUMBER_OF_LINES:I = 0x5

.field private static final TUTORIAL_DETAILS_TEXT_SMALL_FONT_SIZE:F = 13.0f


# instance fields
.field private bottomLink:Lcom/shopkick/app/widget/SKButton;

.field private fetching:Z

.field private screenID:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 26
    invoke-direct {p0}, Lcom/shopkick/app/screens/AppScreen;-><init>()V

    const/4 v0, 0x0

    .line 36
    iput-boolean v0, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->fetching:Z

    return-void
.end method

.method static synthetic access$000(Lcom/shopkick/app/tutorials/TutorialDetailsScreen;)Z
    .locals 0

    .line 26
    iget-boolean p0, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->fetching:Z

    return p0
.end method

.method static synthetic access$100(Lcom/shopkick/app/tutorials/TutorialDetailsScreen;)I
    .locals 0

    .line 26
    iget p0, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->screenID:I

    return p0
.end method

.method private maybeShrinkText(Landroid/widget/TextView;)V
    .locals 2

    .line 104
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/16 v1, 0x57

    if-le v0, v1, :cond_0

    const/high16 v0, 0x41500000    # 13.0f

    .line 105
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v0, 0x5

    .line 106
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setMaxLines(I)V

    goto :goto_0

    :cond_0
    const/high16 v0, 0x41700000    # 15.0f

    .line 108
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    :goto_0
    return-void
.end method

.method private setUpLinkClickLogging()V
    .locals 4

    .line 96
    new-instance v0, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;

    const/16 v1, 0x7d

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 97
    iget v1, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->screenID:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;->setTutorialDetailsScreenId(Ljava/lang/String;)V

    .line 98
    new-instance v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;

    invoke-direct {v1}, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;-><init>()V

    const/4 v2, 0x1

    .line 99
    iput-boolean v2, v1, Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;->suppressImpressions:Z

    .line 100
    iget-object v2, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->bottomLink:Lcom/shopkick/app/widget/SKButton;

    iget-object v3, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->eventLogger:Lcom/shopkick/app/logging/UserEventLogger;

    invoke-virtual {v2, v0, v3, v1}, Lcom/shopkick/app/widget/SKButton;->setupEventLog(Lcom/shopkick/app/fetchers/api/skapi/ClientLogRecord;Lcom/shopkick/app/logging/UserEventLogger;Lcom/shopkick/app/logging/IUserEventView$OptionalSetupParams;)V

    return-void
.end method


# virtual methods
.method public createScreen(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    const p3, 0x7f0c01e0

    const/4 v0, 0x0

    .line 45
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    const p2, 0x7f0907bc

    .line 47
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const p3, 0x7f0907bf

    .line 48
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/ImageView;

    const v0, 0x7f0907c0

    .line 49
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f0907c1

    .line 50
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    const v2, 0x7f0907c2

    .line 51
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0907c3

    .line 52
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f0907c4

    .line 53
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f0907bd

    .line 54
    invoke-virtual {p1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Lcom/shopkick/app/widget/SKButton;

    iput-object v5, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->bottomLink:Lcom/shopkick/app/widget/SKButton;

    .line 55
    invoke-direct {p0}, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->setUpLinkClickLogging()V

    .line 56
    iget-object v5, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->bottomLink:Lcom/shopkick/app/widget/SKButton;

    new-instance v6, Lcom/shopkick/app/tutorials/TutorialDetailsScreen$TutorialButtonClick;

    invoke-direct {v6, p0}, Lcom/shopkick/app/tutorials/TutorialDetailsScreen$TutorialButtonClick;-><init>(Lcom/shopkick/app/tutorials/TutorialDetailsScreen;)V

    invoke-virtual {v5, v6}, Lcom/shopkick/app/widget/SKButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 59
    iget v5, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->screenID:I

    if-nez v5, :cond_0

    const v5, 0x7f110726

    .line 60
    invoke-virtual {p0, v5}, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->setAppScreenTitle(I)V

    const v5, 0x7f110725

    .line 61
    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setText(I)V

    const p2, 0x7f0801db

    .line 62
    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    const p2, 0x7f110722

    .line 63
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(I)V

    const p2, 0x7f0801e0

    .line 64
    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    const p2, 0x7f110723

    .line 65
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(I)V

    const p2, 0x7f0801e1

    .line 66
    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    const p2, 0x7f110724

    .line 67
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(I)V

    .line 68
    iget-object p2, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->bottomLink:Lcom/shopkick/app/widget/SKButton;

    const p3, 0x7f110721

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    goto :goto_0

    :cond_0
    const/4 v6, 0x1

    if-ne v5, v6, :cond_1

    const v5, 0x7f110720

    .line 71
    invoke-virtual {p0, v5}, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->setAppScreenTitle(I)V

    const v5, 0x7f11071f

    .line 72
    invoke-virtual {p2, v5}, Landroid/widget/TextView;->setText(I)V

    const p2, 0x7f0801da

    .line 73
    invoke-virtual {p3, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    const p2, 0x7f11071c

    .line 74
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(I)V

    const p2, 0x7f0801de

    .line 75
    invoke-virtual {v1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    const p2, 0x7f11071d

    .line 76
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(I)V

    const p2, 0x7f0801dd

    .line 77
    invoke-virtual {v3, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    const p2, 0x7f11071e

    .line 78
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(I)V

    .line 79
    iget-object p2, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->bottomLink:Lcom/shopkick/app/widget/SKButton;

    const p3, 0x7f11071b

    invoke-virtual {p2, p3}, Lcom/shopkick/app/widget/SKButton;->setButtonText(I)V

    .line 83
    :cond_1
    :goto_0
    invoke-direct {p0, v0}, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->maybeShrinkText(Landroid/widget/TextView;)V

    .line 84
    invoke-direct {p0, v2}, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->maybeShrinkText(Landroid/widget/TextView;)V

    .line 85
    invoke-direct {p0, v4}, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->maybeShrinkText(Landroid/widget/TextView;)V

    return-object p1
.end method

.method public init(Lcom/shopkick/app/application/ScreenGlobals;Ljava/util/Map;)V
    .locals 0
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

    const-string/jumbo p1, "tutorial_details_screen_id"

    .line 40
    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lcom/shopkick/app/tutorials/TutorialDetailsScreen;->screenID:I

    return-void
.end method

.method public onDestroy()V
    .locals 0

    .line 92
    invoke-super {p0}, Lcom/shopkick/app/screens/AppScreen;->onDestroy()V

    return-void
.end method
