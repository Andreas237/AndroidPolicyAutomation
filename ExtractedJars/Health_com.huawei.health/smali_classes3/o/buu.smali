.class public Lo/buu;
.super Lo/emo;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/buu$b;
    }
.end annotation


# instance fields
.field private final b:Lo/emq;

.field private final c:Landroid/support/v4/view/ViewPager;

.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lhuawei/widget/HwSubTabWidget$SubTab;>;"
        }
    .end annotation
.end field

.field private e:Lo/buu$b;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentActivity;Landroid/support/v4/view/ViewPager;Lo/emq;)V
    .locals 1

    .line 29
    invoke-virtual {p1}, Landroid/support/v4/app/FragmentActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/emo;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/buu;->d:Ljava/util/ArrayList;

    .line 30
    iput-object p3, p0, Lo/buu;->b:Lo/emq;

    .line 31
    iput-object p2, p0, Lo/buu;->c:Landroid/support/v4/view/ViewPager;

    .line 32
    iget-object v0, p0, Lo/buu;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 33
    iget-object v0, p0, Lo/buu;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ViewPager;->setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V

    .line 38
    return-void
.end method


# virtual methods
.method public b(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/support/v4/app/Fragment;Landroid/view/View;Z)V
    .locals 4

    .line 41
    if-nez p1, :cond_0

    .line 42
    const-string v0, "Sug_FitnessTabsAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "addSubTab subTab is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    return-void

    .line 46
    :cond_0
    invoke-virtual {p1}, Lhuawei/widget/HwSubTabWidget$SubTab;->getCallback()Lhuawei/widget/HwSubTabWidget$SubTabListener;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_1

    .line 47
    invoke-virtual {p1, p0}, Lhuawei/widget/HwSubTabWidget$SubTab;->setSubTabListener(Lhuawei/widget/HwSubTabWidget$SubTabListener;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 49
    :cond_1
    if-eqz p2, :cond_2

    .line 50
    invoke-virtual {p1, p2}, Lhuawei/widget/HwSubTabWidget$SubTab;->setTag(Ljava/lang/Object;)Lhuawei/widget/HwSubTabWidget$SubTab;

    goto :goto_0

    .line 51
    :cond_2
    if-eqz p3, :cond_3

    .line 52
    invoke-virtual {p1, p3}, Lhuawei/widget/HwSubTabWidget$SubTab;->setTag(Ljava/lang/Object;)Lhuawei/widget/HwSubTabWidget$SubTab;

    .line 55
    :cond_3
    :goto_0
    iget-object v0, p0, Lo/buu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    iget-object v0, p0, Lo/buu;->b:Lo/emq;

    if-eqz v0, :cond_4

    .line 58
    iget-object v0, p0, Lo/buu;->b:Lo/emq;

    invoke-virtual {v0, p1, p4}, Lo/emq;->addSubTab(Lhuawei/widget/HwSubTabWidget$SubTab;Z)V

    .line 60
    :cond_4
    invoke-virtual {p0}, Lo/buu;->notifyDataSetChanged()V

    .line 61
    return-void
.end method

.method public e(Lo/buu$b;)V
    .locals 0

    .line 164
    iput-object p1, p0, Lo/buu;->e:Lo/buu$b;

    .line 165
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 70
    iget-object v0, p0, Lo/buu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 65
    iget-object v0, p0, Lo/buu;->d:Ljava/util/ArrayList;

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

    .line 92
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 1

    .line 75
    iget-object v0, p0, Lo/buu;->b:Lo/emq;

    if-eqz v0, :cond_0

    .line 76
    iget-object v0, p0, Lo/buu;->b:Lo/emq;

    invoke-virtual {v0, p1, p2}, Lo/emq;->setSubTabScrollingOffsets(IF)V

    .line 78
    :cond_0
    return-void
.end method

.method public onPageSelected(I)V
    .locals 1

    .line 82
    iget-object v0, p0, Lo/buu;->b:Lo/emq;

    if-eqz v0, :cond_0

    .line 83
    iget-object v0, p0, Lo/buu;->b:Lo/emq;

    invoke-virtual {v0, p1}, Lo/emq;->setSubTabSelected(I)V

    .line 84
    iget-object v0, p0, Lo/buu;->e:Lo/buu$b;

    invoke-interface {v0, p1}, Lo/buu$b;->b(I)V

    .line 87
    :cond_0
    return-void
.end method

.method public onSubTabReselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 97
    return-void
.end method

.method public onSubTabSelected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 2

    .line 101
    instance-of v0, p1, Lhuawei/widget/HwSubTabWidget$SubTab;

    if-eqz v0, :cond_1

    .line 102
    const/4 v1, 0x0

    :goto_0
    iget-object v0, p0, Lo/buu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 103
    iget-object v0, p0, Lo/buu;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 104
    iget-object v0, p0, Lo/buu;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 102
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 108
    :cond_1
    return-void
.end method

.method public onSubTabUnselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 113
    return-void
.end method
