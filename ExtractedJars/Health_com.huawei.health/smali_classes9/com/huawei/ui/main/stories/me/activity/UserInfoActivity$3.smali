.class Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->e(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

.field final synthetic e:Lo/elk;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;ILo/elk;)V
    .locals 0

    .line 859
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iput p2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->b:I

    iput-object p3, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->e:Lo/elk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 862
    invoke-static {}, Lo/dbf;->b()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->c(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "1"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 863
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dbf;->f(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 864
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->i(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)V

    .line 865
    return-void

    .line 868
    :cond_0
    iget v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->b:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    .line 870
    invoke-static {}, Lo/cxh;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 871
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get LB wselect="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->e:Lo/elk;

    invoke-virtual {v2}, Lo/elk;->getValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 872
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->e:Lo/elk;

    invoke-virtual {v0}, Lo/elk;->getValue()I

    move-result v0

    const-wide/high16 v1, 0x4024000000000000L    # 10.0

    invoke-static {v1, v2}, Lo/cxh;->e(D)D

    move-result-wide v1

    double-to-int v1, v1

    add-int/2addr v0, v1

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 874
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->o(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_weightvalue_with_unit_lb:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 876
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->e:Lo/elk;

    invoke-virtual {v1}, Lo/elk;->getValue()I

    move-result v1

    const-wide/high16 v2, 0x4024000000000000L    # 10.0

    invoke-static {v2, v3}, Lo/cxh;->e(D)D

    move-result-wide v2

    double-to-int v2, v2

    add-int/2addr v1, v2

    int-to-double v1, v1

    invoke-static {v1, v2}, Lo/cxh;->a(D)D

    move-result-wide v1

    double-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->b(F)V

    .line 877
    goto/16 :goto_0

    .line 878
    :cond_1
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get wselect="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->e:Lo/elk;

    invoke-virtual {v2}, Lo/elk;->getValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 879
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->e:Lo/elk;

    invoke-virtual {v0}, Lo/elk;->getValue()I

    move-result v0

    add-int/lit8 v0, v0, 0xa

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 881
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->o(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_weightvalue_with_unit_kg:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 882
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->e:Lo/elk;

    invoke-virtual {v1}, Lo/elk;->getValue()I

    move-result v1

    add-int/lit8 v1, v1, 0xa

    iget v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->b:I

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(II)V

    .line 883
    goto :goto_0

    .line 885
    :cond_2
    const-string v0, "UIME_UserInfoActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get hselect="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->e:Lo/elk;

    invoke-virtual {v2}, Lo/elk;->getValue()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 886
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->e:Lo/elk;

    invoke-virtual {v0}, Lo/elk;->getValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x32

    int-to-double v0, v0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3}, Lo/cxh;->a(DII)Ljava/lang/String;

    move-result-object v5

    .line 888
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->p(Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    invoke-virtual {v1}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/huawei/ui/main/R$string;->IDS_hw_show_set_height_value_with_unit_cm:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 889
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->c:Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->e:Lo/elk;

    invoke-virtual {v1}, Lo/elk;->getValue()I

    move-result v1

    add-int/lit8 v1, v1, 0x32

    iget v2, p0, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity$3;->b:I

    invoke-virtual {v0, v1, v2}, Lcom/huawei/ui/main/stories/me/activity/UserInfoActivity;->a(II)V

    .line 891
    :goto_0
    return-void
.end method
