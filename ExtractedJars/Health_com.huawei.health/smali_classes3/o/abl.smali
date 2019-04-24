.class public Lo/abl;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "SourceFile"


# instance fields
.field private final a:[Ljava/lang/String;

.field private final c:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/support/v4/app/FragmentManager;Landroid/os/Bundle;[Ljava/lang/String;)V
    .locals 4

    .line 15
    invoke-direct {p0, p1}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 16
    iput-object p2, p0, Lo/abl;->c:Landroid/os/Bundle;

    .line 17
    array-length v0, p3

    new-array v0, v0, [Ljava/lang/String;

    iput-object v0, p0, Lo/abl;->a:[Ljava/lang/String;

    .line 18
    iget-object v0, p0, Lo/abl;->a:[Ljava/lang/String;

    array-length v1, p3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p3, v2, v0, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 36
    iget-object v0, p0, Lo/abl;->a:[Ljava/lang/String;

    array-length v0, v0

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 3

    .line 27
    new-instance v1, Lcom/huawei/ui/homehealth/EmptyFragment;

    invoke-direct {v1}, Lcom/huawei/ui/homehealth/EmptyFragment;-><init>()V

    .line 28
    iget-object v0, p0, Lo/abl;->c:Landroid/os/Bundle;

    invoke-virtual {v0}, Landroid/os/Bundle;->clone()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/os/Bundle;

    .line 29
    const-string v0, "position"

    invoke-virtual {v2, v0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 30
    invoke-virtual {v1, v2}, Landroid/support/v4/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 31
    return-object v1
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/abl;->a:[Ljava/lang/String;

    aget-object v0, v0, p1

    return-object v0
.end method
