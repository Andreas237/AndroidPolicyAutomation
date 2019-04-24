.class public Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$b;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/EditText;

.field private b:Landroid/widget/Spinner;

.field private c:Landroid/widget/Spinner;

.field private d:Landroid/widget/TextView;

.field private e:Landroid/content/Context;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/RelativeLayout;

.field private h:Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$b;

.field private i:Landroid/widget/Button;

.field private k:Z

.field private l:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private n:Landroid/widget/ArrayAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/widget/ArrayAdapter<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private o:I

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private q:I

.field private r:I

.field private s:Ljava/lang/String;

.field private u:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 44
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->k:Z

    .line 52
    const-string v0, ""

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->s:Ljava/lang/String;

    return-void
.end method

.method private a()V
    .locals 1

    .line 66
    sget v0, Lcom/huawei/ui/main/R$id;->developer_query_health_suggestion_set_gender:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->d:Landroid/widget/TextView;

    .line 67
    sget v0, Lcom/huawei/ui/main/R$id;->developer_query_health_suggestion_set_age:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->a:Landroid/widget/EditText;

    .line 69
    sget v0, Lcom/huawei/ui/main/R$id;->developer_query_health_suggestion_set_index_level:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->c:Landroid/widget/Spinner;

    .line 70
    sget v0, Lcom/huawei/ui/main/R$id;->developer_query_health_suggestion_data_type:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->b:Landroid/widget/Spinner;

    .line 71
    sget v0, Lcom/huawei/ui/main/R$id;->developer_query_health_suggestion_content:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->f:Landroid/widget/TextView;

    .line 72
    sget v0, Lcom/huawei/ui/main/R$id;->developer_query_health_suggestion_gender_rl:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->g:Landroid/widget/RelativeLayout;

    .line 73
    sget v0, Lcom/huawei/ui/main/R$id;->developer_query_health_suggestion_btn:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->i:Landroid/widget/Button;

    .line 74
    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;Z)Z
    .locals 0

    .line 31
    iput-boolean p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->k:Z

    return p1
.end method

.method private b()V
    .locals 2

    .line 128
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->g:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 129
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->i:Landroid/widget/Button;

    invoke-virtual {v0, p0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->c:Landroid/widget/Spinner;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$5;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$5;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 144
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->b:Landroid/widget/Spinner;

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$1;

    invoke-direct {v1, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$1;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 156
    return-void
.end method

.method static synthetic b(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;)V
    .locals 0

    .line 31
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->c()V

    return-void
.end method

.method static synthetic c(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;I)I
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->r:I

    return p1
.end method

.method private c()V
    .locals 2

    .line 186
    iget-boolean v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->k:Z

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_default_gender_male:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 188
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->q:I

    goto :goto_0

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->d:Landroid/widget/TextView;

    sget v1, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_default_gender_female:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 191
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->q:I

    .line 193
    :goto_0
    return-void
.end method

.method static synthetic d(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;I)I
    .locals 0

    .line 31
    iput p1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->u:I

    return p1
.end method

.method private d()V
    .locals 6

    .line 208
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->a:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 209
    const/4 v5, 0x0

    .line 210
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 211
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 213
    :cond_0
    invoke-static {v5}, Lo/fea;->a(I)I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->o:I

    .line 214
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->o:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_1

    .line 215
    const-string v0, "DeveloperQueryHealthSuggestionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "query fail, ageType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "sexType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mIndexLevel="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->r:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mDataType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->u:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_common_err_parameter_error:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 217
    return-void

    .line 219
    :cond_1
    const-string v0, "DeveloperQueryHealthSuggestionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "ageType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->o:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "sexType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->q:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mIndexLevel="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->r:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "; mDataType="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->u:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 220
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->u:I

    iget v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->q:I

    iget v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->o:I

    iget v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->r:I

    invoke-static {v0, v1, v2, v3}, Lo/fea;->c(IIII)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->s:Ljava/lang/String;

    .line 222
    const-string v0, "DeveloperQueryHealthSuggestionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "mSuggestions == "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->s:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 223
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->s:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 224
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_device_common_err_parameter_error:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 226
    :cond_2
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 229
    :goto_0
    return-void
.end method

.method private e()V
    .locals 4

    .line 77
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->c()V

    .line 84
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->m:Ljava/util/List;

    .line 85
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->m:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_status_low:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3001"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    .line 86
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_light:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3001"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    .line 87
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_hydropenia:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 85
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->m:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_standard:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3001"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    .line 90
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_warn:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3001"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    .line 91
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_normal:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 89
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 93
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->m:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_inclined_fat:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3001"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    .line 94
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_weight:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3001"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    .line 95
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_pressure_highly:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3001"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    .line 96
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fine:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 93
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->m:Ljava/util/List;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_fat:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3001"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    .line 99
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_super_weight:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "\u3001"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    .line 100
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_hw_weight_details_grade_dangerous:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 98
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->p:Ljava/util/List;

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->p:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_health_show_healthdata_bodyfat_rate:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->p:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_BMI:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->p:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_water:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 106
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->p:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_metabolism:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->p:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_haslet:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->p:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_muscle:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->p:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_bone:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->p:Ljava/util/List;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_protein:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    new-instance v0, Landroid/widget/ArrayAdapter;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->m:Ljava/util/List;

    const v2, 0x1090008

    invoke-direct {v0, p0, v2, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->n:Landroid/widget/ArrayAdapter;

    .line 114
    new-instance v0, Landroid/widget/ArrayAdapter;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->p:Ljava/util/List;

    const v2, 0x1090008

    invoke-direct {v0, p0, v2, v1}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->l:Landroid/widget/ArrayAdapter;

    .line 117
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->n:Landroid/widget/ArrayAdapter;

    const v1, 0x1090009

    invoke-virtual {v0, v1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 118
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->l:Landroid/widget/ArrayAdapter;

    const v1, 0x1090009

    invoke-virtual {v0, v1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 121
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->c:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->n:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 122
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->b:Landroid/widget/Spinner;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->l:Landroid/widget/ArrayAdapter;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 124
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->s:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 196
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->g:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 197
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->k:Z

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->h:Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$b;

    invoke-static {v0, v1, v2}, Lo/fdr;->d(Landroid/content/Context;ZLcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    goto :goto_0

    .line 198
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->i:Landroid/widget/Button;

    if-ne p1, v0, :cond_1

    .line 199
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->d()V

    .line 201
    :cond_1
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 55
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 56
    const-string v0, "DeveloperQueryHealthSuggestionActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onCreate()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 57
    sget v0, Lcom/huawei/ui/main/R$layout;->hw_show_developer_query_health_suggestion:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->setContentView(I)V

    .line 58
    iput-object p0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e:Landroid/content/Context;

    .line 59
    new-instance v0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$b;

    invoke-direct {v0, p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$b;-><init>(Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->h:Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$b;

    .line 60
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->a()V

    .line 61
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->e()V

    .line 62
    invoke-direct {p0}, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->b()V

    .line 63
    return-void
.end method

.method public onDestroy()V
    .locals 1

    .line 233
    invoke-super {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;->onDestroy()V

    .line 234
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity;->h:Lcom/huawei/ui/main/stories/me/activity/DeveloperQueryHealthSuggestionActivity$b;

    .line 235
    return-void
.end method
