.class public Lo/bhf;
.super Landroid/support/v4/app/FragmentPagerAdapter;
.source "SourceFile"


# instance fields
.field private final d:[Ljava/lang/String;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/support/v4/app/Fragment;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;Ljava/util/List;[Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/support/v4/app/FragmentManager;Ljava/util/List<Landroid/support/v4/app/Fragment;>;[Ljava/lang/String;)V"
        }
    .end annotation

    .line 13
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentPagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 14
    iput-object p2, p0, Lo/bhf;->e:Ljava/util/List;

    .line 15
    array-length v0, p3

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/bhf;->d:[Ljava/lang/String;

    .line 16
    iget-object v0, p0, Lo/bhf;->d:[Ljava/lang/String;

    array-length v1, p3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p3, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 17
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 29
    iget-object v0, p0, Lo/bhf;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 24
    iget-object v0, p0, Lo/bhf;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 20
    iget-object v0, p0, Lo/bhf;->d:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method
