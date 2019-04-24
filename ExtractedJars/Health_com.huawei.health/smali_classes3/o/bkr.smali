.class public Lo/bkr;
.super Lo/bfl;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bkr$c;
    }
.end annotation


# instance fields
.field private k:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 33
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 34
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 39
    sget v0, Lcom/huawei/android/sns/R$id;->two_dim_code_imageview:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bkr;->a:Landroid/widget/ImageView;

    .line 40
    sget v0, Lcom/huawei/android/sns/R$id;->two_dim_code_msg:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bkr;->b:Landroid/widget/TextView;

    .line 41
    sget v0, Lcom/huawei/android/sns/R$id;->text_version_condition:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bkr;->k:Landroid/widget/TextView;

    .line 42
    invoke-virtual {p0, p1}, Lo/bkr;->a(Landroid/view/View;)V

    .line 43
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 6

    .line 49
    iget-object v0, p0, Lo/bkr;->k:Landroid/widget/TextView;

    if-nez v0, :cond_0

    .line 51
    const-string v0, "AccountCard"

    const-string v1, "error, ViewHolder conditionView have not initialized!"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    return-void

    .line 55
    :cond_0
    instance-of v0, p1, Lo/bkr$c;

    if-eqz v0, :cond_2

    invoke-static {}, Lo/azc;->c()Lo/azc;

    move-result-object v0

    invoke-virtual {v0}, Lo/azc;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 57
    move-object v4, p1

    check-cast v4, Lo/bkr$c;

    .line 58
    invoke-virtual {v4}, Lo/bkr$c;->b()Ljava/lang/String;

    move-result-object v5

    .line 59
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 62
    new-instance v0, Lo/biw;

    invoke-direct {v0}, Lo/biw;-><init>()V

    iget-object v1, p0, Lo/bkr;->a:Landroid/widget/ImageView;

    const/16 v2, 0x12c

    const/16 v3, 0x12c

    invoke-virtual {v0, v5, v2, v3, v1}, Lo/biw;->b(Ljava/lang/String;IILandroid/widget/ImageView;)V

    .line 63
    iget-object v0, p0, Lo/bkr;->a:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 64
    iget-object v0, p0, Lo/bkr;->b:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 65
    iget-object v0, p0, Lo/bkr;->k:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 69
    :cond_1
    iget-object v0, p0, Lo/bkr;->a:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 70
    iget-object v0, p0, Lo/bkr;->b:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 71
    iget-object v0, p0, Lo/bkr;->k:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 73
    :goto_0
    goto :goto_1

    .line 76
    :cond_2
    iget-object v0, p0, Lo/bkr;->a:Landroid/widget/ImageView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 77
    iget-object v0, p0, Lo/bkr;->b:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 78
    iget-object v0, p0, Lo/bkr;->k:Landroid/widget/TextView;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 80
    :goto_1
    return-void
.end method
