.class public Lcom/huawei/feedback/ui/CustomActionBar;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/feedback/ui/CustomActionBar$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Lcom/huawei/feedback/ui/CustomActionBar$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5

    .line 49
    invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 50
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const-string v1, "feedback_custom_actionbar"

    invoke-static {p1, v1}, Lcom/huawei/feedback/f;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 51
    const-string v0, "tv_title"

    invoke-static {p1, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/CustomActionBar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/huawei/feedback/ui/CustomActionBar;->a:Landroid/widget/TextView;

    .line 52
    const-string v0, "status_layout"

    invoke-static {p1, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/CustomActionBar;->findViewById(I)Landroid/view/View;

    move-result-object v2

    .line 53
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 54
    move-object v0, p1

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/huawei/phoneserviceuni/common/e/a;->b(Landroid/app/Activity;)I

    move-result v0

    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 55
    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    const-string v0, "emui_color_gray_1"

    invoke-static {p1, v0}, Lcom/huawei/feedback/f;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, v0}, Landroid/support/v4/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/CustomActionBar;->setBackgroundColor(I)V

    .line 58
    const-string v0, "layout_back"

    invoke-static {p1, v0}, Lcom/huawei/feedback/f;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/feedback/ui/CustomActionBar;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Landroid/widget/RelativeLayout;

    .line 60
    new-instance v0, Lcom/huawei/feedback/ui/a;

    invoke-direct {v0, p0}, Lcom/huawei/feedback/ui/a;-><init>(Lcom/huawei/feedback/ui/CustomActionBar;)V

    invoke-virtual {v4, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 71
    return-void
.end method

.method static synthetic a(Lcom/huawei/feedback/ui/CustomActionBar;)Lcom/huawei/feedback/ui/CustomActionBar$a;
    .locals 1

    .line 29
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomActionBar;->b:Lcom/huawei/feedback/ui/CustomActionBar$a;

    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 1

    .line 93
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomActionBar;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 94
    return-void
.end method

.method public a(Lcom/huawei/feedback/ui/CustomActionBar$a;)V
    .locals 0

    .line 103
    iput-object p1, p0, Lcom/huawei/feedback/ui/CustomActionBar;->b:Lcom/huawei/feedback/ui/CustomActionBar$a;

    .line 104
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 80
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 82
    iget-object v0, p0, Lcom/huawei/feedback/ui/CustomActionBar;->a:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    :cond_0
    return-void
.end method
