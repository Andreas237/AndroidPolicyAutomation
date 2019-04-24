.class Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$e;
.super Landroid/support/v4/view/PagerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

.field private e:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Landroid/view/View;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Landroid/view/View;>;)V"
        }
    .end annotation

    .line 967
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$e;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-direct {p0}, Landroid/support/v4/view/PagerAdapter;-><init>()V

    .line 968
    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$e;->e:Ljava/util/ArrayList;

    .line 969
    return-void
.end method


# virtual methods
.method public destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
    .locals 0

    .line 983
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 973
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$e;->e:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 1

    .line 994
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$e;->c:Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;->n(Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail;)[Ljava/lang/String;

    move-result-object v0

    aget-object v0, v0, p1

    return-object v0
.end method

.method public instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
    .locals 2

    .line 987
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/TrainDetail$e;->e:Ljava/util/ArrayList;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    .line 988
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 989
    return-object v1
.end method

.method public isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
    .locals 1

    .line 978
    if-ne p1, p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
