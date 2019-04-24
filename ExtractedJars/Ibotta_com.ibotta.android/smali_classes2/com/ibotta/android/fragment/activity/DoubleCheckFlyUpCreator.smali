.class public Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;
.super Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;
.source "DoubleCheckFlyUpCreator.java"


# annotations
.annotation build Lcom/newrelic/agent/android/instrumentation/Instrumented;
.end annotation


# static fields
.field public static final EVENT_CONTINUE:I = 0x1


# instance fields
.field private final context:Landroid/content/Context;

.field private final retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;Lcom/ibotta/android/fragment/retailer/RetailerParcel;)V
    .locals 1

    const v0, 0x7f0c00e6

    .line 28
    invoke-direct {p0, p2, p3, v0}, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;-><init>(Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator$OnePageFlyUpCreatorListener;I)V

    .line 29
    iput-object p1, p0, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;->context:Landroid/content/Context;

    .line 30
    iput-object p4, p0, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    return-void
.end method

.method public static synthetic lambda$makeFlyUpViewHolder$0(Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;Landroid/view/View;)V
    .locals 0

    .line 43
    invoke-direct {p0}, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;->onCancelClicked()V

    return-void
.end method

.method public static synthetic lambda$makeFlyUpViewHolder$1(Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;Landroid/view/View;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;->onContineClicked()V

    return-void
.end method

.method private onCancelClicked()V
    .locals 1

    .line 50
    invoke-virtual {p0}, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;->getController()Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;

    move-result-object v0

    invoke-interface {v0}, Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPagerController;->onCloseClicked()V

    return-void
.end method

.method private onContineClicked()V
    .locals 1

    const/4 v0, 0x1

    .line 54
    invoke-virtual {p0, v0}, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;->notifyPageEvent(I)V

    return-void
.end method


# virtual methods
.method public makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;
    .locals 6

    const v0, 0x7f09050a

    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 37
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    if-eqz v1, :cond_0

    .line 38
    iget-object v2, p0, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;->context:Landroid/content/Context;

    invoke-virtual {v1}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object v3, p0, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;->retailer:Lcom/ibotta/android/fragment/retailer/RetailerParcel;

    invoke-virtual {v3}, Lcom/ibotta/android/fragment/retailer/RetailerParcel;->getRedemptionMeta()Lcom/ibotta/api/model/retailer/RedemptionMeta;

    move-result-object v3

    invoke-static {v2, v1, v3}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;Ljava/lang/String;Lcom/ibotta/api/model/retailer/RedemptionMeta;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v1

    goto :goto_0

    .line 39
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;->context:Landroid/content/Context;

    invoke-static {v1}, Lcom/ibotta/android/util/RedemptionFormat;->build(Landroid/content/Context;)Lcom/ibotta/android/util/RedemptionFormat;

    move-result-object v1

    .line 41
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f1102db

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    .line 42
    invoke-virtual {v1}, Lcom/ibotta/android/util/RedemptionFormat;->getReceiptNameLower()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v4, v5

    .line 41
    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v0, 0x7f09007f

    .line 43
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/fragment/activity/-$$Lambda$DoubleCheckFlyUpCreator$vDHDUBFL9ZC1elE-YSoGIqklNR4;

    invoke-direct {v1, p0}, Lcom/ibotta/android/fragment/activity/-$$Lambda$DoubleCheckFlyUpCreator$vDHDUBFL9ZC1elE-YSoGIqklNR4;-><init>(Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_1
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    :goto_1
    const v0, 0x7f090084

    .line 44
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lcom/ibotta/android/fragment/activity/-$$Lambda$DoubleCheckFlyUpCreator$fbQjBFvekhGxw0FFIOgic0z3OGk;

    invoke-direct {v1, p0}, Lcom/ibotta/android/fragment/activity/-$$Lambda$DoubleCheckFlyUpCreator$fbQjBFvekhGxw0FFIOgic0z3OGk;-><init>(Lcom/ibotta/android/fragment/activity/DoubleCheckFlyUpCreator;)V

    instance-of v2, v0, Landroid/view/View;

    if-nez v2, :cond_2

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    :cond_2
    check-cast v0, Landroid/view/View;

    invoke-static {v0, v1}, Lcom/newrelic/agent/android/instrumentation/ViewInstrumentation;->setOnClickListener(Landroid/view/View;Landroid/view/View$OnClickListener;)V

    .line 46
    :goto_2
    invoke-super {p0, p1, p2}, Lcom/ibotta/android/fragment/dialog/flyup/OnePageFlyUpCreator;->makeFlyUpViewHolder(Landroid/view/View;Lcom/ibotta/android/fragment/dialog/flyup/FlyUpPageData;)Lcom/ibotta/android/fragment/dialog/flyup/FlyUpViewHolder;

    move-result-object p1

    return-object p1
.end method
