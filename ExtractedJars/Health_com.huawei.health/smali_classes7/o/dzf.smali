.class public Lo/dzf;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "SourceFile"


# instance fields
.field private a:I

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;III)V
    .locals 1

    .line 16
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 11
    const/4 v0, 0x0

    iput v0, p0, Lo/dzf;->e:I

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lo/dzf;->a:I

    .line 17
    iput p2, p0, Lo/dzf;->e:I

    .line 18
    iput p3, p0, Lo/dzf;->a:I

    .line 19
    iput p4, p0, Lo/dzf;->d:I

    .line 20
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 45
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/FragmentStatePagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 46
    return-void
.end method

.method public getCount()I
    .locals 2

    .line 35
    iget v0, p0, Lo/dzf;->a:I

    iget v1, p0, Lo/dzf;->e:I

    if-le v0, v1, :cond_0

    .line 36
    iget v0, p0, Lo/dzf;->a:I

    iget v1, p0, Lo/dzf;->e:I

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 39
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 4

    .line 29
    iget v0, p0, Lo/dzf;->e:I

    add-int/2addr v0, p1

    iget v1, p0, Lo/dzf;->d:I

    iget v2, p0, Lo/dzf;->a:I

    iget v3, p0, Lo/dzf;->e:I

    invoke-static {v0, v1, v2, v3}, Lcom/huawei/pluginachievement/ui/report/ReportFragment;->a(IIII)Lcom/huawei/pluginachievement/ui/report/ReportFragment;

    move-result-object v0

    return-object v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 1

    .line 24
    invoke-super {p0, p1, p2}, Landroid/support/v4/app/FragmentStatePagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
