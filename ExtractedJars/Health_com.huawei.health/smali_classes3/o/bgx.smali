.class public Lo/bgx;
.super Lo/bfl;
.source "SourceFile"


# instance fields
.field private h:Landroid/widget/ImageView;

.field private i:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 39
    invoke-direct {p0, p1}, Lo/bfl;-><init>(Landroid/content/Context;)V

    .line 25
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgx;->h:Landroid/widget/ImageView;

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lo/bgx;->i:Landroid/widget/TextView;

    .line 40
    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)Lo/bfl;
    .locals 1

    .line 45
    sget v0, Lcom/huawei/android/sns/R$id;->image_head:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lo/bgx;->h:Landroid/widget/ImageView;

    .line 46
    sget v0, Lcom/huawei/android/sns/R$id;->text_title:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lo/bgx;->i:Landroid/widget/TextView;

    .line 47
    invoke-virtual {p0, p1}, Lo/bgx;->a(Landroid/view/View;)V

    .line 48
    return-object p0
.end method

.method public e(Lo/bfh;)V
    .locals 4

    .line 54
    invoke-super {p0, p1}, Lo/bfl;->e(Lo/bfh;)V

    .line 55
    new-instance v3, Lcom/huawei/health/sns/model/group/Group;

    invoke-direct {v3}, Lcom/huawei/health/sns/model/group/Group;-><init>()V

    .line 56
    instance-of v0, p1, Lcom/huawei/health/sns/model/group/Group;

    if-eqz v0, :cond_0

    .line 58
    move-object v3, p1

    check-cast v3, Lcom/huawei/health/sns/model/group/Group;

    .line 60
    :cond_0
    iget-object v0, p0, Lo/bgx;->h:Landroid/widget/ImageView;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupId()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/bpg;->e(Landroid/widget/ImageView;J)V

    .line 62
    iget-object v0, p0, Lo/bgx;->i:Landroid/widget/TextView;

    invoke-virtual {v3}, Lcom/huawei/health/sns/model/group/Group;->getGroupName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 63
    return-void
.end method
