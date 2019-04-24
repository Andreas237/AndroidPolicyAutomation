.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/elk;

.field final synthetic b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

.field final synthetic e:Lo/elk;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;Lo/elk;Lo/elk;)V
    .locals 0

    .line 777
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->e:Lo/elk;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->a:Lo/elk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 13

    .line 780
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 781
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 782
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->i(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 783
    return-void

    .line 786
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->e:Lo/elk;

    invoke-virtual {v1}, Lo/elk;->getValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)I

    .line 787
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->a:Lo/elk;

    invoke-virtual {v1}, Lo/elk;->getValue()I

    move-result v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;I)I

    .line 788
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->p(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_ft_string:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v5}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->n(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v5

    int-to-double v5, v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    .line 789
    invoke-virtual {v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/ui/main/R$string;->IDS_ins_string:I

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/Object;

    iget-object v5, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v5}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->l(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v5

    int-to-double v5, v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    invoke-static {v5, v6, v7, v8}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 788
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 790
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->n(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v0

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double v9, v2, v0

    .line 791
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->l(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)I

    move-result v0

    int-to-double v0, v0

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lo/cxh;->d(DI)D

    move-result-wide v11

    .line 792
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$4;->b:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    add-double v1, v9, v11

    invoke-static {v1, v2}, Ljava/lang/Math;->rint(D)D

    move-result-wide v1

    double-to-int v1, v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(I)V

    .line 793
    return-void
.end method
