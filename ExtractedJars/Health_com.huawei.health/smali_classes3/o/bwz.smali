.class public Lo/bwz;
.super Landroid/support/v7/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bwz$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/widget/RecyclerView$Adapter<Lo/bwz$b;>;"
    }
.end annotation


# instance fields
.field private a:Lcom/huawei/health/suggestion/model/Plan;

.field private b:Lo/egv;

.field private c:I

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bxw;>;"
        }
    .end annotation
.end field

.field private i:Landroid/content/Context;

.field private k:Z


# direct methods
.method public constructor <init>(ILjava/util/List;Landroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lo/bxw;>;Landroid/content/Context;)V"
        }
    .end annotation

    .line 82
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lo/bwz;->c:I

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwz;->k:Z

    .line 83
    iput-object p3, p0, Lo/bwz;->i:Landroid/content/Context;

    .line 84
    iput-object p2, p0, Lo/bwz;->e:Ljava/util/List;

    .line 85
    iput p1, p0, Lo/bwz;->c:I

    .line 86
    invoke-direct {p0}, Lo/bwz;->d()V

    .line 87
    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILandroid/content/Context;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/FitnessPackageInfo;>;ILandroid/content/Context;)V"
        }
    .end annotation

    .line 75
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$Adapter;-><init>()V

    .line 41
    const/4 v0, 0x0

    iput v0, p0, Lo/bwz;->c:I

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/bwz;->k:Z

    .line 76
    iput-object p3, p0, Lo/bwz;->i:Landroid/content/Context;

    .line 77
    iput-object p1, p0, Lo/bwz;->d:Ljava/util/List;

    .line 78
    iput p2, p0, Lo/bwz;->c:I

    .line 79
    invoke-direct {p0}, Lo/bwz;->d()V

    .line 80
    return-void
.end method

.method static synthetic c(Lo/bwz;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/bwz;->a:Lcom/huawei/health/suggestion/model/Plan;

    return-object v0
.end method

.method static synthetic d(Lo/bwz;)Landroid/content/Context;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/bwz;->i:Landroid/content/Context;

    return-object v0
.end method

.method private d()V
    .locals 3

    .line 90
    new-instance v2, Lo/egv$b;

    iget-object v0, p0, Lo/bwz;->i:Landroid/content/Context;

    invoke-direct {v2, v0}, Lo/egv$b;-><init>(Landroid/content/Context;)V

    .line 91
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_title:I

    invoke-virtual {v2, v0}, Lo/egv$b;->b(I)Lo/egv$b;

    .line 92
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_content:I

    invoke-virtual {v2, v0}, Lo/egv$b;->e(I)Lo/egv$b;

    .line 93
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_ok:I

    new-instance v1, Lo/bwz$3;

    invoke-direct {v1, p0}, Lo/bwz$3;-><init>(Lo/bwz;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->e(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 101
    sget v0, Lcom/huawei/health/suggestion/R$string;->IDS_FitnessAdvice_has_doing_plan_no:I

    new-instance v1, Lo/bwz$2;

    invoke-direct {v1, p0}, Lo/bwz$2;-><init>(Lo/bwz;)V

    invoke-virtual {v2, v0, v1}, Lo/egv$b;->b(ILandroid/view/View$OnClickListener;)Lo/egv$b;

    .line 107
    invoke-virtual {v2}, Lo/egv$b;->b()Lo/egv;

    move-result-object v0

    iput-object v0, p0, Lo/bwz;->b:Lo/egv;

    .line 108
    return-void
.end method

.method private d(Lcom/huawei/health/suggestion/model/FitnessPackageInfo;)V
    .locals 4

    .line 211
    invoke-virtual {p1}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePlanTempId()Ljava/lang/String;

    move-result-object v2

    .line 212
    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lo/bwz;->i:Landroid/content/Context;

    const-class v1, Lcom/huawei/health/suggestion/ui/FitnessPlanJoinActivity;

    invoke-direct {v3, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 213
    const-string v0, "PLAN_TEMP_ID_KEY"

    invoke-virtual {v3, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 214
    iget-object v0, p0, Lo/bwz;->i:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 215
    return-void
.end method

.method static synthetic e(Lo/bwz;Lcom/huawei/health/suggestion/model/Plan;)Lcom/huawei/health/suggestion/model/Plan;
    .locals 0

    .line 36
    iput-object p1, p0, Lo/bwz;->a:Lcom/huawei/health/suggestion/model/Plan;

    return-object p1
.end method

.method static synthetic e(Lo/bwz;)Lo/egv;
    .locals 1

    .line 36
    iget-object v0, p0, Lo/bwz;->b:Lo/egv;

    return-object v0
.end method

.method static synthetic e(Lo/bwz;Lcom/huawei/health/suggestion/model/FitnessPackageInfo;)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lo/bwz;->d(Lcom/huawei/health/suggestion/model/FitnessPackageInfo;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/bxw;>;"
        }
    .end annotation

    .line 68
    iget-object v0, p0, Lo/bwz;->e:Ljava/util/List;

    return-object v0
.end method

.method public b(Lo/bwz$b;I)V
    .locals 4

    .line 119
    iget-object v0, p0, Lo/bwz;->e:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lo/bwz;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_0

    .line 120
    iget-object v0, p1, Lo/bwz$b;->b:Landroid/view/View;

    iget-object v1, p0, Lo/bwz;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->common_ui_custom_dialog_transparent_bg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 122
    :cond_0
    iget-object v0, p0, Lo/bwz;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    iget-object v0, p0, Lo/bwz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p2, v0, :cond_1

    .line 123
    iget-object v0, p1, Lo/bwz$b;->b:Landroid/view/View;

    iget-object v1, p0, Lo/bwz;->i:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/health/suggestion/R$color;->common_ui_custom_dialog_transparent_bg:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 126
    :cond_1
    iget v0, p0, Lo/bwz;->c:I

    const/16 v1, 0x66

    if-ne v0, v1, :cond_2

    .line 127
    iget-object v0, p0, Lo/bwz;->d:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    if-ltz p2, :cond_3

    iget-object v0, p0, Lo/bwz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_3

    .line 128
    iget-object v0, p0, Lo/bwz;->d:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;

    .line 129
    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquirePicture()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lo/bwz$b;->d:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cam;->c(Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 130
    iget-object v0, p1, Lo/bwz$b;->e:Lo/efy;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 131
    iget-object v0, p1, Lo/bwz$b;->c:Lo/efy;

    invoke-virtual {v3}, Lcom/huawei/health/suggestion/model/FitnessPackageInfo;->acquireDescription()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 132
    iget-object v0, p1, Lo/bwz$b;->d:Landroid/widget/ImageView;

    new-instance v1, Lo/bwz$4;

    invoke-direct {v1, p0, v3}, Lo/bwz$4;-><init>(Lo/bwz;Lcom/huawei/health/suggestion/model/FitnessPackageInfo;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    goto :goto_0

    .line 185
    :cond_2
    iget v0, p0, Lo/bwz;->c:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_3

    .line 186
    iget-object v0, p0, Lo/bwz;->e:Ljava/util/List;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    if-ltz p2, :cond_3

    iget-object v0, p0, Lo/bwz;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p2, v0, :cond_3

    .line 187
    iget-object v0, p0, Lo/bwz;->e:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/bxw;

    .line 188
    iget-object v0, p1, Lo/bwz$b;->e:Lo/efy;

    invoke-virtual {v3}, Lo/bxw;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 189
    iget-object v0, p1, Lo/bwz$b;->c:Lo/efy;

    invoke-virtual {v3}, Lo/bxw;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/efy;->setText(Ljava/lang/CharSequence;)V

    .line 191
    invoke-virtual {v3}, Lo/bxw;->e()I

    move-result v0

    iget-object v1, p1, Lo/bwz$b;->d:Landroid/widget/ImageView;

    const/4 v2, 0x4

    invoke-static {v0, v1, v2}, Lo/cam;->b(ILandroid/widget/ImageView;I)V

    .line 192
    iget-object v0, p1, Lo/bwz$b;->d:Landroid/widget/ImageView;

    new-instance v1, Lo/bwz$1;

    invoke-direct {v1, p0, v3}, Lo/bwz$1;-><init>(Lo/bwz;Lo/bxw;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 208
    :cond_3
    :goto_0
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 233
    iput-boolean p1, p0, Lo/bwz;->k:Z

    .line 234
    return-void
.end method

.method public c(Landroid/view/ViewGroup;I)Lo/bwz$b;
    .locals 5

    .line 112
    iget-object v0, p0, Lo/bwz;->i:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/health/suggestion/R$layout;->sug_plan_type_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 113
    new-instance v4, Lo/bwz$b;

    invoke-direct {v4, v3}, Lo/bwz$b;-><init>(Landroid/view/View;)V

    .line 114
    return-object v4
.end method

.method public e()Z
    .locals 1

    .line 229
    iget-boolean v0, p0, Lo/bwz;->k:Z

    return v0
.end method

.method public getItemCount()I
    .locals 2

    .line 219
    iget v0, p0, Lo/bwz;->c:I

    const/16 v1, 0x66

    if-ne v0, v1, :cond_0

    .line 220
    iget-object v0, p0, Lo/bwz;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 221
    :cond_0
    iget v0, p0, Lo/bwz;->c:I

    const/16 v1, 0x65

    if-ne v0, v1, :cond_1

    .line 222
    iget-object v0, p0, Lo/bwz;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 225
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public synthetic onBindViewHolder(Landroid/support/v7/widget/RecyclerView$ViewHolder;I)V
    .locals 1

    .line 36
    move-object v0, p1

    check-cast v0, Lo/bwz$b;

    invoke-virtual {p0, v0, p2}, Lo/bwz;->b(Lo/bwz$b;I)V

    return-void
.end method

.method public synthetic onCreateViewHolder(Landroid/view/ViewGroup;I)Landroid/support/v7/widget/RecyclerView$ViewHolder;
    .locals 1

    .line 36
    invoke-virtual {p0, p1, p2}, Lo/bwz;->c(Landroid/view/ViewGroup;I)Lo/bwz$b;

    move-result-object v0

    return-object v0
.end method
