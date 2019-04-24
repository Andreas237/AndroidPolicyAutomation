.class public Lo/bmt;
.super Landroid/widget/RelativeLayout;
.source "SourceFile"


# instance fields
.field private d:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bmt;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 44
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/bmt;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 45
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 49
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    invoke-direct {p0}, Lo/bmt;->e()V

    .line 51
    return-void
.end method

.method static synthetic d(Lo/bmt;)Landroid/widget/TextView;
    .locals 1

    .line 28
    iget-object v0, p0, Lo/bmt;->d:Landroid/widget/TextView;

    return-object v0
.end method

.method private e()V
    .locals 4

    .line 61
    invoke-virtual {p0}, Lo/bmt;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v3

    .line 62
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_assistant_menu_view_emui50:I

    invoke-virtual {v3, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 63
    sget v0, Lcom/huawei/android/sns/R$id;->menu_name_tv:I

    invoke-virtual {p0, v0}, Lo/bmt;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bmt;->d:Landroid/widget/TextView;

    .line 64
    iget-object v0, p0, Lo/bmt;->d:Landroid/widget/TextView;

    invoke-virtual {p0}, Lo/bmt;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/android/sns/R$color;->sns_assist_menu_normal_text_color:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 66
    new-instance v0, Lo/bmt$4;

    invoke-direct {v0, p0}, Lo/bmt$4;-><init>(Lo/bmt;)V

    invoke-virtual {p0, v0}, Lo/bmt;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 82
    return-void
.end method


# virtual methods
.method public setMenuData(Lcom/huawei/health/sns/model/chat/AssistantMenu;)V
    .locals 2

    .line 92
    if-nez p1, :cond_0

    .line 94
    const-string v0, "AssistantMenuView"

    const-string v1, "menu data is null "

    invoke-static {v0, v1}, Lo/bpf;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    return-void

    .line 97
    :cond_0
    iget-object v0, p0, Lo/bmt;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lcom/huawei/health/sns/model/chat/AssistantMenu;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    return-void
.end method
