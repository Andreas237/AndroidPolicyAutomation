.class public Lo/emm;
.super Lo/emo;
.source "SourceFile"


# instance fields
.field private final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lhuawei/widget/HwSubTabWidget$SubTab;>;"
        }
    .end annotation
.end field

.field private final d:Landroid/support/v4/view/ViewPager;

.field private final e:Lo/emq;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V
    .locals 1

    .line 17
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/emo;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/emm;->c:Ljava/util/ArrayList;

    .line 18
    iput-object p3, p0, Lo/emm;->e:Lo/emq;

    .line 19
    iput-object p2, p0, Lo/emm;->d:Landroid/support/v4/view/ViewPager;

    .line 20
    iget-object v0, p0, Lo/emm;->d:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 21
    iget-object v0, p0, Lo/emm;->d:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 22
    return-void
.end method


# virtual methods
.method public b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V
    .locals 2

    .line 25
    invoke-virtual {p1}, Lhuawei/widget/HwSubTabWidget$SubTab;->getCallback()Lhuawei/widget/HwSubTabWidget$SubTabListener;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 26
    invoke-virtual {p1, p0}, Lhuawei/widget/HwSubTabWidget$SubTab;->setSubTabListener(Lhuawei/widget/HwSubTabWidget$SubTabListener;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 28
    :cond_0
    invoke-virtual {p1, p2}, Lhuawei/widget/HwSubTabWidget$SubTab;->setTag(Ljava/lang/Object;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 29
    iget-object v0, p0, Lo/emm;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    iget-object v0, p0, Lo/emm;->e:Lo/emq;

    invoke-virtual {v0, p1, p3}, Lo/emq;->addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;Z)V

    .line 31
    invoke-virtual {p0}, Lo/emm;->notifyDataSetChanged()V

    .line 32
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 41
    iget-object v0, p0, Lo/emm;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/emm;->c:Ljava/util/ArrayList;

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

    .line 57
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 46
    iget-object v0, p0, Lo/emm;->e:Lo/emq;

    invoke-virtual {v0, p1, p2}, Lo/emq;->setSubTabScrollingOffsets(IF)V

    .line 47
    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 51
    iget-object v0, p0, Lo/emm;->e:Lo/emq;

    invoke-virtual {v0, p1}, Lo/emq;->setSubTabSelected(I)V

    .line 52
    return-void
.end method

.method public onSubTabReselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 62
    return-void
.end method

.method public onSubTabSelected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 2

    .line 66
    instance-of v0, p1, Lhuawei/widget/HwSubTabWidget$SubTab;

    if-eqz v0, :cond_1

    .line 67
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lo/emm;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 68
    iget-object v0, p0, Lo/emm;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 69
    iget-object v0, p0, Lo/emm;->d:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 67
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 73
    :cond_1
    return-void
.end method

.method public onSubTabUnselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 78
    return-void
.end method
