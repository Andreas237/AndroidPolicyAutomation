.class public Lo/cgq;
.super Lo/emo;
.source "SourceFile"


# instance fields
.field private final c:Landroid/support/v4/view/ViewPager;

.field private final d:Lo/emq;

.field private final e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lhuawei/widget/HwSubTabWidget$SubTab;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V
    .locals 1

    .line 28
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/emo;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/cgq;->e:Ljava/util/ArrayList;

    .line 29
    iput-object p3, p0, Lo/cgq;->d:Lo/emq;

    .line 30
    iput-object p2, p0, Lo/cgq;->c:Landroid/support/v4/view/ViewPager;

    .line 31
    iget-object v0, p0, Lo/cgq;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 32
    iget-object v0, p0, Lo/cgq;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 34
    return-void
.end method


# virtual methods
.method public c(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V
    .locals 4

    .line 37
    if-nez p1, :cond_0

    .line 38
    const-string v0, "Track_TrackDetailTabsAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSubTab subTab is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    return-void

    .line 42
    :cond_0
    invoke-virtual {p1}, Lhuawei/widget/HwSubTabWidget$SubTab;->getCallback()Lhuawei/widget/HwSubTabWidget$SubTabListener;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 43
    invoke-virtual {p1, p0}, Lhuawei/widget/HwSubTabWidget$SubTab;->setSubTabListener(Lhuawei/widget/HwSubTabWidget$SubTabListener;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 46
    :cond_1
    invoke-virtual {p1, p2}, Lhuawei/widget/HwSubTabWidget$SubTab;->setTag(Ljava/lang/Object;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 47
    iget-object v0, p0, Lo/cgq;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 49
    iget-object v0, p0, Lo/cgq;->d:Lo/emq;

    if-eqz v0, :cond_2

    .line 50
    iget-object v0, p0, Lo/cgq;->d:Lo/emq;

    invoke-virtual {v0, p1, p3}, Lo/emq;->addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;Z)V

    .line 52
    :cond_2
    invoke-virtual {p0}, Lo/cgq;->notifyDataSetChanged()V

    .line 53
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 62
    iget-object v0, p0, Lo/cgq;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 57
    iget-object v0, p0, Lo/cgq;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhuawei/widget/HwSubTabWidget$SubTab;

    invoke-virtual {v0}, Lhuawei/widget/HwSubTabWidget$SubTab;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 82
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 67
    iget-object v0, p0, Lo/cgq;->d:Lo/emq;

    if-eqz v0, :cond_0

    .line 68
    iget-object v0, p0, Lo/cgq;->d:Lo/emq;

    invoke-virtual {v0, p1, p2}, Lo/emq;->setSubTabScrollingOffsets(IF)V

    .line 70
    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 74
    iget-object v0, p0, Lo/cgq;->d:Lo/emq;

    if-eqz v0, :cond_0

    .line 75
    iget-object v0, p0, Lo/cgq;->d:Lo/emq;

    invoke-virtual {v0, p1}, Lo/emq;->setSubTabSelected(I)V

    .line 77
    :cond_0
    return-void
.end method

.method public onSubTabReselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 87
    return-void
.end method

.method public onSubTabSelected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 2

    .line 91
    instance-of v0, p1, Lhuawei/widget/HwSubTabWidget$SubTab;

    if-eqz v0, :cond_1

    .line 92
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lo/cgq;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 93
    iget-object v0, p0, Lo/cgq;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 94
    iget-object v0, p0, Lo/cgq;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 92
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 98
    :cond_1
    return-void
.end method

.method public onSubTabUnselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 103
    return-void
.end method
