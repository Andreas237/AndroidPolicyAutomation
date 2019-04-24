.class public Lo/blw;
.super Lo/bfk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 23
    invoke-direct {p0, p1}, Lo/bfk;-><init>(Landroid/content/Context;)V

    .line 24
    const/16 v0, 0x34

    iput v0, p0, Lo/blw;->e:I

    .line 25
    return-void
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 5

    .line 30
    iget-object v0, p0, Lo/blw;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 31
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_assistant_search_result_item:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/LinearLayout;

    .line 33
    new-instance v4, Lo/bks;

    iget-object v0, p0, Lo/blw;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/bks;-><init>(Landroid/content/Context;)V

    .line 34
    invoke-virtual {v4, v3}, Lo/bks;->d(Landroid/view/View;)Lo/bfl;

    .line 36
    invoke-virtual {p0, v4}, Lo/blw;->d(Lo/bfl;)V

    .line 37
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 38
    const/4 v0, 0x1

    return v0
.end method
