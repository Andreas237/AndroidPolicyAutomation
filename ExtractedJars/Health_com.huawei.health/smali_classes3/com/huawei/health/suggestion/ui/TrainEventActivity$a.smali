.class Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;
.super Landroid/support/v4/app/FragmentStatePagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/TrainEventActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/TrainEventActivity;


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/TrainEventActivity;Landroid/support/v4/app/FragmentManager;)V
    .locals 0

    .line 251
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;->c:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    .line 252
    invoke-direct {p0, p2}, Landroid/support/v4/app/FragmentStatePagerAdapter;-><init>(Landroid/support/v4/app/FragmentManager;)V

    .line 253
    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 262
    const/4 v0, 0x3

    return v0
.end method

.method public getItem(I)Landroid/support/v4/app/Fragment;
    .locals 1

    .line 257
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;->c:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->c(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 267
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/TrainEventActivity$a;->c:Lcom/huawei/health/suggestion/ui/TrainEventActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/TrainEventActivity;->a(Lcom/huawei/health/suggestion/ui/TrainEventActivity;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, p1

    return-object v0
.end method

.method public saveState()Landroid/os/Parcelable;
    .locals 1

    .line 277
    const/4 v0, 0x0

    return-object v0
.end method
