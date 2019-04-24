.class public Lo/bih;
.super Lo/bfk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 30
    invoke-direct {p0, p1}, Lo/bfk;-><init>(Landroid/content/Context;)V

    .line 31
    iput p2, p0, Lo/bih;->e:I

    .line 32
    return-void
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 5

    .line 37
    iget-object v0, p0, Lo/bih;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 38
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_normal_group_tag_value:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/LinearLayout;

    .line 40
    new-instance v4, Lo/bhh;

    iget-object v0, p0, Lo/bih;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/bhh;-><init>(Landroid/content/Context;)V

    .line 41
    invoke-virtual {v4, v3}, Lo/bhh;->d(Landroid/view/View;)Lo/bfl;

    .line 43
    invoke-virtual {p0, v4}, Lo/bih;->d(Lo/bfl;)V

    .line 45
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 47
    const/4 v0, 0x1

    return v0
.end method
