.class public Lo/esc;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "SourceFile"


# instance fields
.field private c:[Landroid/support/v4/app/Fragment;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;[Landroid/support/v4/app/Fragment;)V
    .locals 2

    .line 19
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 20
    if-nez p2, :cond_0

    .line 21
    const-string v0, "Track_"

    const-string v1, "SportTypeTargetViewPagerAdapter fragments null"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p2}, [Landroid/support/v4/app/Fragment;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/support/v4/app/Fragment;

    iput-object v0, p0, Lo/esc;->c:[Landroid/support/v4/app/Fragment;

    .line 26
    :goto_0
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 38
    iget-object v0, p0, Lo/esc;->c:[Landroid/support/v4/app/Fragment;

    if-nez v0, :cond_0

    .line 39
    const/4 v0, 0x0

    return v0

    .line 41
    :cond_0
    iget-object v0, p0, Lo/esc;->c:[Landroid/support/v4/app/Fragment;

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 30
    iget-object v0, p0, Lo/esc;->c:[Landroid/support/v4/app/Fragment;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/esc;->c:[Landroid/support/v4/app/Fragment;

    array-length v0, v0

    if-ge p1, v0, :cond_0

    .line 31
    iget-object v0, p0, Lo/esc;->c:[Landroid/support/v4/app/Fragment;

    aget-object v0, v0, p1

    return-object v0

    .line 33
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
