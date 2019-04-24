.class Lcom/huawei/bone/social/ui/RankingFragment$3;
.super Landroid/support/v7/widget/RecyclerView$OnScrollListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/bone/social/ui/RankingFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/bone/social/ui/RankingFragment;


# direct methods
.method constructor <init>(Lcom/huawei/bone/social/ui/RankingFragment;)V
    .locals 0

    .line 151
    iput-object p1, p0, Lcom/huawei/bone/social/ui/RankingFragment$3;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;-><init>()V

    return-void
.end method


# virtual methods
.method public onScrollStateChanged(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 2

    .line 154
    if-eqz p2, :cond_0

    const/4 v0, 0x2

    if-ne p2, v0, :cond_1

    .line 155
    :cond_0
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$3;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->a(Lcom/huawei/bone/social/ui/RankingFragment;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    const-string v1, "LOAD"

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->resumeTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 157
    :cond_1
    iget-object v0, p0, Lcom/huawei/bone/social/ui/RankingFragment$3;->a:Lcom/huawei/bone/social/ui/RankingFragment;

    invoke-static {v0}, Lcom/huawei/bone/social/ui/RankingFragment;->a(Lcom/huawei/bone/social/ui/RankingFragment;)Lcom/squareup/picasso/Picasso;

    move-result-object v0

    const-string v1, "LOAD"

    invoke-virtual {v0, v1}, Lcom/squareup/picasso/Picasso;->pauseTag(Ljava/lang/Object;)V

    .line 160
    :goto_0
    return-void
.end method

.method public onScrolled(Landroid/support/v7/widget/RecyclerView;II)V
    .locals 0

    .line 164
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/widget/RecyclerView$OnScrollListener;->onScrolled(Landroid/support/v7/widget/RecyclerView;II)V

    .line 165
    return-void
.end method
