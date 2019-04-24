.class public Lo/exk;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "SourceFile"


# instance fields
.field private b:I

.field c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/support/v4/app/FragmentManager;Ljava/util/ArrayList<Landroid/support/v4/app/Fragment;>;)V"
        }
    .end annotation

    .line 15
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 12
    const/4 v0, 0x0

    iput v0, p0, Lo/exk;->b:I

    .line 16
    iput-object p2, p0, Lo/exk;->c:Ljava/util/ArrayList;

    .line 17
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 40
    iget-object v0, p0, Lo/exk;->c:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 45
    iget-object v0, p0, Lo/exk;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method public getItemPosition(Ljava/lang/Object;)I
    .locals 2

    .line 30
    iget v0, p0, Lo/exk;->b:I

    if-lez v0, :cond_0

    .line 31
    iget v0, p0, Lo/exk;->b:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo/exk;->b:I

    .line 32
    const/4 v0, -0x2

    return v0

    .line 35
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;->getItemPosition(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public notifyDataSetChanged()V
    .locals 1

    .line 23
    invoke-virtual {p0}, Lo/exk;->getCount()I

    move-result v0

    iput v0, p0, Lo/exk;->b:I

    .line 24
    invoke-super {p0}, Landroid/support/v4/app/FragmentPagerAdapter;->notifyDataSetChanged()V

    .line 25
    return-void
.end method
