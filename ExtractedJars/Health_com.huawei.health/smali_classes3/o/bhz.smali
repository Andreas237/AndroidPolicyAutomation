.class public Lo/bhz;
.super Lo/bfk;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 31
    invoke-direct {p0, p1}, Lo/bfk;-><init>(Landroid/content/Context;)V

    .line 32
    const/16 v0, 0x26

    iput v0, p0, Lo/bhz;->e:I

    .line 33
    return-void
.end method


# virtual methods
.method public e(Landroid/view/ViewGroup;Landroid/view/ViewGroup;)Z
    .locals 5

    .line 38
    iget-object v0, p0, Lo/bhz;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 39
    sget v0, Lcom/huawei/android/sns/R$layout;->sns_blank_view:I

    const/4 v1, 0x0

    invoke-virtual {v2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/LinearLayout;

    .line 41
    new-instance v4, Lo/bhd;

    iget-object v0, p0, Lo/bhz;->b:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/bhd;-><init>(Landroid/content/Context;)V

    .line 42
    invoke-virtual {v4, v3}, Lo/bhd;->d(Landroid/view/View;)Lo/bfl;

    .line 44
    invoke-virtual {p0, v4}, Lo/bhz;->d(Lo/bfl;)V

    .line 46
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 48
    const/4 v0, 0x1

    return v0
.end method
