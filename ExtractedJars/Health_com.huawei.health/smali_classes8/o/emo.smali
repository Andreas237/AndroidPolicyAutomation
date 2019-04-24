.class public Lo/emo;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "SourceFile"

# interfaces
.implements Lhuawei/widget/HwSubTabWidget$SubTabListener;
.implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;)V
    .locals 0

    .line 15
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 16
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 25
    const/4 v0, 0x0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 20
    const/4 v0, 0x0

    return-object v0
.end method

.method public onPageScrollStateChanged(I)V
    .locals 0

    .line 41
    return-void
.end method

.method public onPageScrolled(IFI)V
    .locals 0

    .line 31
    return-void
.end method

.method public onPageSelected(I)V
    .locals 0

    .line 36
    return-void
.end method

.method public onSubTabReselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 46
    return-void
.end method

.method public onSubTabSelected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 51
    return-void
.end method

.method public onSubTabUnselected(Lhuawei/widget/HwSubTabWidget$SubTab;Landroid/app/FragmentTransaction;)V
    .locals 0

    .line 56
    return-void
.end method
