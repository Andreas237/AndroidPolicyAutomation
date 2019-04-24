.class public Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# instance fields
.field private a:Landroid/widget/EditText;

.field private b:Landroid/widget/LinearLayout;

.field private c:Landroid/widget/EditText;

.field private d:Landroid/widget/Button;

.field private e:Landroid/widget/EditText;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 20
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;)Landroid/widget/EditText;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->a:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic b(Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;)Landroid/widget/EditText;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->c:Landroid/widget/EditText;

    return-object v0
.end method

.method static synthetic e(Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;)Landroid/widget/EditText;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->e:Landroid/widget/EditText;

    return-object v0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 30
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 31
    sget v0, Lcom/huawei/ui/homehealth/R$layout;->activity_test_recommend:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->setContentView(I)V

    .line 33
    sget v0, Lcom/huawei/ui/homehealth/R$id;->layout_for_easy_test:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->b:Landroid/widget/LinearLayout;

    .line 34
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_level:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->e:Landroid/widget/EditText;

    .line 35
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_reason:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->a:Landroid/widget/EditText;

    .line 36
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_value:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->c:Landroid/widget/EditText;

    .line 37
    sget v0, Lcom/huawei/ui/homehealth/R$id;->button_ok:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->d:Landroid/widget/Button;

    .line 41
    iget-object v0, p0, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;->d:Landroid/widget/Button;

    new-instance v1, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity$2;

    invoke-direct {v1, p0}, Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity$2;-><init>(Lcom/huawei/ui/homehealth/runCard/utils/RecommendTestActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 64
    return-void
.end method
