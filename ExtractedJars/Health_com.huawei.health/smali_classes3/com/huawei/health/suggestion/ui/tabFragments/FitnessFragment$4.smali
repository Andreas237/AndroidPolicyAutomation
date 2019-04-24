.class Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->b(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;Ljava/util/List;)V
    .locals 0

    .line 226
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;->a:Ljava/util/List;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 4

    .line 229
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    iget-object v0, v0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->d:Lo/bur;

    invoke-virtual {v0}, Lo/bur;->getItemCount()I

    move-result v2

    .line 230
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v3

    .line 231
    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 232
    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 233
    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 235
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 236
    add-int/lit8 v0, v2, -0x1

    if-eq v3, v0, :cond_0

    .line 237
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    .line 239
    :cond_0
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42480000    # 50.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 241
    :goto_0
    if-nez v3, :cond_4

    .line 242
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_2

    .line 246
    :cond_1
    add-int/lit8 v0, v2, -0x1

    if-eq v3, v0, :cond_3

    .line 247
    if-nez v3, :cond_2

    .line 248
    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_1

    .line 250
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_1

    .line 253
    :cond_3
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x42480000    # 50.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 256
    :goto_1
    const/4 v0, 0x1

    if-ne v3, v0, :cond_4

    .line 257
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment$4;->e:Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;->f(Lcom/huawei/health/suggestion/ui/tabFragments/FitnessFragment;)Landroid/content/Context;

    move-result-object v0

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 262
    :cond_4
    :goto_2
    return-void
.end method
