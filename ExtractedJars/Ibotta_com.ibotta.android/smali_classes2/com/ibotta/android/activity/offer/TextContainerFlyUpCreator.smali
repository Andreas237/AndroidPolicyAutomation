.class public Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;
.super Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;
.source "TextContainerFlyUpCreator.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field public static final EVENT_BUTTON_ACTION:I = 0x1


# instance fields
.field private final body:Ljava/lang/String;

.field private final buttonText:Ljava/lang/String;

.field private final header:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const v1, 0x7f0c00eb

    .line 28
    invoke-direct {p0, p1, v0, v1}, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;I)V

    .line 29
    iput-object p2, p0, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;->header:Ljava/lang/String;

    .line 30
    iput-object p3, p0, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;->body:Ljava/lang/String;

    .line 31
    iput-object p4, p0, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;->buttonText:Ljava/lang/String;

    return-void
.end method

.method public static synthetic lambda$makeFlyUpViewHolder$0(Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    .line 49
    invoke-virtual {p0, p1}, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;->notifyPageEvent(I)V

    return-void
.end method


# virtual methods
.method public makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
    .locals 3

    const v0, 0x7f090450

    .line 36
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/ibotta/android/view/common/TextContainerView;

    .line 37
    iget-object v1, p0, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;->header:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TextContainerView;->setHeader(Ljava/lang/String;)V

    .line 38
    iget-object v1, p0, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;->body:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/ibotta/android/view/common/TextContainerView;->setBody(Ljava/lang/String;)V

    const v0, 0x7f090079

    .line 40
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 42
    iget-object v1, p0, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;->buttonText:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 43
    iget-object v1, p0, Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;->buttonText:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 44
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    .line 46
    invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V

    .line 49
    :goto_0
    new-instance v1, Lcom/ibotta/android/activity/offer/-$$Lambda$TextContainerFlyUpCreator$GVrMp_qlSaInrAi9ptiEbifJmcc;

    invoke-direct {v1, p0}, Lcom/ibotta/android/activity/offer/-$$Lambda$TextContainerFlyUpCreator$GVrMp_qlSaInrAi9ptiEbifJmcc;-><init>(Lcom/ibotta/android/activity/offer/TextContainerFlyUpCreator;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 51
    :goto_1
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;

    move-result-object p1

    return-object p1
.end method
