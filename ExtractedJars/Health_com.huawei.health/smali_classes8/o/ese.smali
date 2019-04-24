.class public Lo/ese;
.super Lo/emo;
.source "SourceFile"


# instance fields
.field private final a:Lo/emq;

.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lhuawei/widget/HwSubTabWidget$SubTab;>;"
        }
    .end annotation
.end field

.field private final e:Landroid/support/v4/view/ViewPager;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;Landroid/support/v4/view/ViewPager;Lo/emq;)V
    .locals 1

    .line 22
    invoke-direct {p0, p1}, Lo/emo;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 19
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/ese;->d:Ljava/util/ArrayList;

    .line 23
    iput-object p3, p0, Lo/ese;->a:Lo/emq;

    .line 24
    iput-object p2, p0, Lo/ese;->e:Landroid/support/v4/view/ViewPager;

    .line 25
    iget-object v0, p0, Lo/ese;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 26
    return-void
.end method


# virtual methods
.method public e(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Z)V
    .locals 2

    .line 29
    invoke-virtual {p1}, Lhuawei/widget/HwSubTabWidget$SubTab;->getCallback()Lhuawei/widget/HwSubTabWidget$SubTabListener;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 30
    invoke-virtual {p1, p0}, Lhuawei/widget/HwSubTabWidget$SubTab;->setSubTabListener(Lhuawei/widget/HwSubTabWidget$SubTabListener;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 32
    :cond_0
    invoke-virtual {p1, p2}, Lhuawei/widget/HwSubTabWidget$SubTab;->setTag(Ljava/lang/Object;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 33
    iget-object v0, p0, Lo/ese;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 34
    iget-object v0, p0, Lo/ese;->a:Lo/emq;

    invoke-virtual {v0, p1, p3}, Lo/emq;->addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;Z)V

    .line 35
    invoke-virtual {p0}, Lo/ese;->notifyDataSetChanged()V

    .line 36
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 45
    iget-object v0, p0, Lo/ese;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 40
    iget-object v0, p0, Lo/ese;->d:Ljava/util/ArrayList;

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

    .line 61
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 50
    iget-object v0, p0, Lo/ese;->a:Lo/emq;

    invoke-virtual {v0, p1, p2}, Lo/emq;->setSubTabScrollingOffsets(IF)V

    .line 51
    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 55
    iget-object v0, p0, Lo/ese;->a:Lo/emq;

    invoke-virtual {v0, p1}, Lo/emq;->setSubTabSelected(I)V

    .line 56
    return-void
.end method

.method public onSubTabReselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 66
    return-void
.end method

.method public onSubTabSelected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 2

    .line 70
    instance-of v0, p1, Lhuawei/widget/HwSubTabWidget$SubTab;

    if-eqz v0, :cond_1

    .line 71
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lo/ese;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 72
    iget-object v0, p0, Lo/ese;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 73
    iget-object v0, p0, Lo/ese;->e:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 71
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 77
    :cond_1
    return-void
.end method

.method public onSubTabUnselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 82
    return-void
.end method
