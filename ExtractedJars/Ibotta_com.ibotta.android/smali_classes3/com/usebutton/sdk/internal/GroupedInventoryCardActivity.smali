.class public Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;
.super Lcom/usebutton/sdk/internal/BaseCardActivity;
.source "GroupedInventoryCardActivity.java"


# static fields
.field public static final EXTRA_BODY:Ljava/lang/String; = "body"

.field private static final EXTRA_FOOTER:Ljava/lang/String; = "footer"

.field private static final EXTRA_HEADER:Ljava/lang/String; = "header"


# instance fields
.field private mAdapter:Landroid/support/v4/view/PagerAdapter;

.field private mBody:Lcom/usebutton/sdk/models/ListBody;

.field private mFooter:Lcom/usebutton/sdk/internal/models/Footer;

.field private final mGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/models/InventoryGroup;",
            ">;"
        }
    .end annotation
.end field

.field private mHeader:Lcom/usebutton/sdk/internal/models/Header;

.field private final mOnInventorySelected:Lcom/usebutton/sdk/internal/util/Receiver;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/usebutton/sdk/internal/util/Receiver<",
            "Lcom/usebutton/sdk/models/Link;",
            ">;"
        }
    .end annotation
.end field

.field private mOnPageChange:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private mPager:Landroid/support/v4/view/ViewPager;

.field private mPagerTitle:Landroid/support/v4/view/PagerTabStrip;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 33
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;-><init>()V

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mGroups:Ljava/util/List;

    .line 144
    new-instance v0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$1;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$1;-><init>(Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mOnInventorySelected:Lcom/usebutton/sdk/internal/util/Receiver;

    .line 180
    new-instance v0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$2;

    invoke-direct {v0, p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity$2;-><init>(Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mOnPageChange:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    return-void
.end method

.method static synthetic access$000(Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;)Ljava/lang/String;
    .locals 0

    .line 33
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->currentGroupName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private currentGroupName()Ljava/lang/String;
    .locals 2

    .line 173
    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 175
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private initBody()V
    .locals 4

    .line 113
    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mGroups:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 114
    new-instance v0, Lcom/usebutton/sdk/internal/views/SingleInventoryAdapter;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mOnInventorySelected:Lcom/usebutton/sdk/internal/util/Receiver;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mGroups:Ljava/util/List;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/usebutton/sdk/models/InventoryGroup;

    invoke-direct {v0, p0, v1, v2}, Lcom/usebutton/sdk/internal/views/SingleInventoryAdapter;-><init>(Landroid/content/Context;Lcom/usebutton/sdk/internal/util/Receiver;Lcom/usebutton/sdk/models/InventoryGroup;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    goto :goto_0

    .line 116
    :cond_0
    new-instance v0, Lcom/usebutton/sdk/internal/views/InventoryGroupPager;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mGroups:Ljava/util/List;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mOnInventorySelected:Lcom/usebutton/sdk/internal/util/Receiver;

    invoke-direct {v0, p0, v1, v2}, Lcom/usebutton/sdk/internal/views/InventoryGroupPager;-><init>(Landroid/content/Context;Ljava/util/List;Lcom/usebutton/sdk/internal/util/Receiver;)V

    iput-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    .line 118
    :goto_0
    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 119
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->getButton()Lcom/usebutton/sdk/internal/ButtonPrivate;

    move-result-object v0

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/ButtonPrivate;->getStorage()Lcom/usebutton/sdk/internal/core/Storage;

    move-result-object v0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->getPromotionId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/usebutton/sdk/internal/core/Storage;->getPreferredInventoryGroup(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->selectPreferredGroup(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPager:Landroid/support/v4/view/ViewPager;

    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mOnPageChange:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->addOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    return-void
.end method

.method private initFooter(Lcom/usebutton/sdk/internal/models/Footer;)V
    .locals 2

    .line 205
    sget v0, Lcom/usebutton/sdk/R$id;->promo_footer:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;

    if-eqz p1, :cond_0

    .line 208
    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mOnInventorySelected:Lcom/usebutton/sdk/internal/util/Receiver;

    invoke-virtual {v0, p1, v1}, Lcom/usebutton/sdk/internal/views/OneLineInventoryView;->setFooter(Lcom/usebutton/sdk/internal/models/Footer;Lcom/usebutton/sdk/internal/util/Receiver;)V

    const/4 p1, 0x1

    .line 209
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->showFooter(Z)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 211
    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->showFooter(Z)V

    :goto_0
    return-void
.end method

.method private initPager(Lcom/usebutton/sdk/models/InventoryGroup;)V
    .locals 2

    .line 124
    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mBody:Lcom/usebutton/sdk/models/ListBody;

    invoke-virtual {v0}, Lcom/usebutton/sdk/models/ListBody;->shouldShowHeadings()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPagerTitle:Landroid/support/v4/view/PagerTabStrip;

    invoke-virtual {p1}, Lcom/usebutton/sdk/models/InventoryGroup;->getNameColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/PagerTabStrip;->setTabIndicatorColor(I)V

    .line 127
    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPagerTitle:Landroid/support/v4/view/PagerTabStrip;

    invoke-virtual {p1}, Lcom/usebutton/sdk/models/InventoryGroup;->getNameColor()I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/support/v4/view/PagerTabStrip;->setTextColor(I)V

    .line 128
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPagerTitle:Landroid/support/v4/view/PagerTabStrip;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/support/v4/view/PagerTabStrip;->setVisibility(I)V

    goto :goto_0

    .line 130
    :cond_0
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPagerTitle:Landroid/support/v4/view/PagerTabStrip;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/support/v4/view/PagerTabStrip;->setVisibility(I)V

    :goto_0
    return-void
.end method

.method public static intentForPromotion(Landroid/content/Context;Lcom/usebutton/sdk/internal/models/MetaInfo;Lcom/usebutton/sdk/internal/models/Header;Lcom/usebutton/sdk/models/ListBody;Lcom/usebutton/sdk/internal/models/Footer;)Landroid/content/Intent;
    .locals 2

    .line 48
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string p0, "meta_info"

    .line 49
    invoke-virtual {v0, p0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "header"

    .line 50
    invoke-virtual {v0, p0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "body"

    .line 51
    invoke-virtual {v0, p0, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string p0, "footer"

    .line 52
    invoke-virtual {v0, p0, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    return-object v0
.end method

.method private selectPreferredGroup(Ljava/lang/String;)V
    .locals 2

    .line 135
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 136
    :goto_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v1}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 137
    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v1, v0}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 138
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPager:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private showFooter(Z)V
    .locals 3

    .line 216
    sget v0, Lcom/usebutton/sdk/R$id;->promo_footer:I

    invoke-virtual {p0, v0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    const/16 v2, 0x8

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 217
    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    if-eqz p1, :cond_1

    .line 218
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    sget v1, Lcom/usebutton/sdk/R$dimen;->btn_footer_height:I

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    :cond_1
    iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 219
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {p1, v0}, Landroid/support/v4/view/ViewPager;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method


# virtual methods
.method public bind(Lcom/usebutton/sdk/internal/models/MetaInfo;)V
    .locals 1

    .line 76
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "header"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Header;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    .line 77
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "body"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/models/ListBody;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mBody:Lcom/usebutton/sdk/models/ListBody;

    .line 78
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->getIntent()Landroid/content/Intent;

    move-result-object p1

    const-string v0, "footer"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/internal/models/Footer;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    .line 79
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mGroups:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    .line 80
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mGroups:Ljava/util/List;

    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mBody:Lcom/usebutton/sdk/models/ListBody;

    invoke-virtual {v0}, Lcom/usebutton/sdk/models/ListBody;->getGroups()Ljava/util/List;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 82
    sget p1, Lcom/usebutton/sdk/R$id;->promo_pager:I

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v4/view/ViewPager;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPager:Landroid/support/v4/view/ViewPager;

    .line 83
    sget p1, Lcom/usebutton/sdk/R$id;->promo_pager_title:I

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/support/v4/view/PagerTabStrip;

    iput-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mPagerTitle:Landroid/support/v4/view/PagerTabStrip;

    .line 85
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mHeader:Lcom/usebutton/sdk/internal/models/Header;

    invoke-virtual {p0, p1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->initHeader(Lcom/usebutton/sdk/internal/models/Header;)V

    .line 86
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->initBody()V

    .line 87
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mGroups:Ljava/util/List;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/usebutton/sdk/models/InventoryGroup;

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->initPager(Lcom/usebutton/sdk/models/InventoryGroup;)V

    .line 88
    iget-object p1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    invoke-direct {p0, p1}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->initFooter(Lcom/usebutton/sdk/internal/models/Footer;)V

    return-void
.end method

.method public collectAssets()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/models/Asset;",
            ">;"
        }
    .end annotation

    .line 93
    invoke-super {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->collectAssets()Ljava/util/List;

    move-result-object v0

    .line 94
    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    if-eqz v1, :cond_0

    .line 95
    invoke-virtual {v1}, Lcom/usebutton/sdk/internal/models/Footer;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/Arrays;->addIfNotNull(Ljava/util/List;Ljava/lang/Object;)V

    .line 97
    :cond_0
    iget-object v1, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mGroups:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/usebutton/sdk/models/InventoryGroup;

    .line 98
    invoke-virtual {v2}, Lcom/usebutton/sdk/models/InventoryGroup;->getInventory()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/usebutton/sdk/models/Inventory;

    .line 99
    invoke-virtual {v3}, Lcom/usebutton/sdk/models/Inventory;->getIcon()Lcom/usebutton/sdk/internal/models/Asset;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/usebutton/sdk/internal/util/Arrays;->addIfNotNull(Ljava/util/List;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method protected getCardDismissedEvent()Ljava/lang/String;
    .locals 1

    const-string v0, "btn:inventory-card-dismissed"

    return-object v0
.end method

.method protected getCardSpecificEventProperties()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/usebutton/sdk/internal/functional/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    const/4 v0, 0x1

    .line 167
    new-array v0, v0, [Lcom/usebutton/sdk/internal/functional/Pair;

    new-instance v1, Lcom/usebutton/sdk/internal/functional/Pair;

    const-string v2, "group_name"

    .line 168
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->currentGroupName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/usebutton/sdk/internal/functional/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    .line 167
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method protected getCardViewedEvent()Ljava/lang/String;
    .locals 1

    const-string v0, "btn:inventory-card-displayed"

    return-object v0
.end method

.method public getContentLayoutId()I
    .locals 1

    .line 71
    sget v0, Lcom/usebutton/sdk/R$layout;->btn_promotion_grouped_inventory:I

    return v0
.end method

.method public onAssetsReady()V
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v0}, Landroid/support/v4/view/PagerAdapter;->notifyDataSetChanged()V

    .line 108
    invoke-direct {p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->initBody()V

    .line 109
    iget-object v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mFooter:Lcom/usebutton/sdk/internal/models/Footer;

    invoke-direct {p0, v0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->initFooter(Lcom/usebutton/sdk/internal/models/Footer;)V

    return-void
.end method

.method protected onStart()V
    .locals 4

    .line 58
    iget-boolean v0, p0, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->mDidTrackViewed:Z

    if-nez v0, :cond_0

    const-string v0, "Commerce Card presented: (Action ID: %s)"

    const/4 v1, 0x1

    .line 59
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/GroupedInventoryCardActivity;->getPromotionId()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 61
    :cond_0
    invoke-super {p0}, Lcom/usebutton/sdk/internal/BaseCardActivity;->onStart()V

    return-void
.end method

.method public shouldBindAndShowContent(Lcom/usebutton/sdk/internal/models/MetaInfo;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
