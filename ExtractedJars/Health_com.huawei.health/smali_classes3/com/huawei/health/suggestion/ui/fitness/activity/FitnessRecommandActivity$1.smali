.class Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/RadioGroup$OnCheckedChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->b(I[Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

.field final synthetic c:I

.field final synthetic e:[Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;I[Ljava/lang/String;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    iput p2, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->c:I

    iput-object p3, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->e:[Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCheckedChanged(Landroid/widget/RadioGroup;I)V
    .locals 5
    .param p2    # I
        .annotation build Landroid/support/annotation/IdRes;
        .end annotation
    .end param

    .line 269
    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    .line 270
    return-void

    .line 272
    :cond_0
    invoke-virtual {p1, p2}, Landroid/widget/RadioGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/RadioButton;

    .line 273
    invoke-virtual {p1, v3}, Landroid/widget/RadioGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    div-int/lit8 v4, v0, 0x2

    .line 274
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->c:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, v4, :cond_1

    .line 275
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->c:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 276
    return-void

    .line 278
    :cond_1
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/widget/RadioButton;->setChecked(Z)V

    .line 279
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->i(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->c:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/efy;

    iget-object v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->e:[Ljava/lang/String;

    aget-object v1, v1, v4

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 280
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->a(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->c:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 281
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->b(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->c:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 282
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity$1;->a:Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;

    invoke-static {v0}, Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;->k(Lcom/huawei/health/suggestion/ui/fitness/activity/FitnessRecommandActivity;)V

    .line 283
    return-void
.end method
