.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$5;
.super Landroid/support/v7/widget/RecyclerView$ItemDecoration;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->c(Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;Ljava/util/List;)V
    .locals 0

    .line 152
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    iput-object p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$5;->a:Ljava/util/List;

    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$ItemDecoration;-><init>()V

    return-void
.end method


# virtual methods
.method public getItemOffsets(Landroid/graphics/Rect;Landroid/view/View;Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$State;)V
    .locals 4

    .line 155
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;->c(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;)Lo/bur;

    move-result-object v0

    invoke-virtual {v0}, Lo/bur;->getItemCount()I

    move-result v2

    .line 156
    invoke-virtual {p3, p2}, Landroid/support/v7/widget/RecyclerView;->getChildAdapterPosition(Landroid/view/View;)I

    move-result v3

    .line 157
    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/Rect;->left:I

    .line 158
    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/Rect;->right:I

    .line 159
    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/Rect;->top:I

    .line 160
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$5;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_1

    .line 161
    add-int/lit8 v0, v2, -0x1

    if-eq v3, v0, :cond_0

    .line 162
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_0

    .line 164
    :cond_0
    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 166
    :goto_0
    if-nez v3, :cond_4

    .line 167
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_2

    .line 171
    :cond_1
    add-int/lit8 v0, v2, -0x1

    if-eq v3, v0, :cond_3

    .line 172
    if-nez v3, :cond_2

    .line 173
    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_1

    .line 175
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    goto :goto_1

    .line 178
    :cond_3
    const/4 v0, 0x0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 181
    :goto_1
    const/4 v0, 0x1

    if-ne v3, v0, :cond_4

    .line 182
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity$5;->d:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessCourseActivity;

    const/high16 v1, 0x41000000    # 8.0f

    invoke-static {v0, v1}, Lo/bzx;->b(Landroid/content/Context;F)I

    move-result v0

    iput v0, p1, Landroid/graphics/Rect;->bottom:I

    .line 187
    :cond_4
    :goto_2
    return-void
.end method
