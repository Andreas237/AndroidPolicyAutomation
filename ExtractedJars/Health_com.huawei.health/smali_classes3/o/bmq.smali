.class public Lo/bmq;
.super Lo/bnj;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lo/bmq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 29
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 39
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lo/bmq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 40
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 51
    invoke-direct {p0, p1, p2, p3}, Lo/bnj;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 52
    return-void
.end method


# virtual methods
.method protected e()V
    .locals 4

    .line 60
    invoke-virtual {p0}, Lo/bmq;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 61
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_big_red_point_text_view:I

    const/4 v1, 0x1

    invoke-virtual {v2, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    .line 62
    sget v0, Lcom/huawei/android/sns/R$id;->text_count:I

    invoke-virtual {v3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bmq;->b:Landroid/widget/TextView;

    .line 63
    return-void
.end method
