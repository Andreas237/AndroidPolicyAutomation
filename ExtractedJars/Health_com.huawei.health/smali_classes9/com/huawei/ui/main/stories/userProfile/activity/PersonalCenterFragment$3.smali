.class Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V
    .locals 0

    .line 1938
    iput-object p1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 1941
    invoke-static {}, Lo/ene;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1942
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click too fast"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1943
    return-void

    .line 1945
    :cond_0
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 1946
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1947
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->t(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 1949
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Goto Rank."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1950
    sget-object v0, Lo/dae;->dx:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 1951
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1952
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->q(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dth;->g(Landroid/content/Context;)V

    .line 1953
    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->z(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->w(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-ne p1, v0, :cond_3

    .line 1955
    :cond_2
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Goto Sheet."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1956
    sget-object v0, Lo/dae;->dF:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 1957
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1958
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->q(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dth;->a(Landroid/content/Context;)V

    .line 1960
    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->x(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-ne p1, v0, :cond_8

    .line 1962
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Goto Reward."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1963
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->v(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/dwr;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_6

    invoke-static {}, Lo/czu;->i()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 1966
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "_medalPngStatusDownloadDoing"

    invoke-static {v0, v1}, Lo/dtn;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 1967
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    const-string v0, "done"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1968
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->v(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwr;->i()V

    .line 1971
    :cond_5
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->v(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/dwr;

    move-result-object v0

    invoke-virtual {v0}, Lo/dwr;->r()V

    .line 1973
    :cond_6
    sget-object v0, Lo/dae;->dE:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 1974
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1977
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->y(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->y(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_7

    .line 1978
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->y(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1979
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->b(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;Z)Z

    .line 1980
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->e(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 1981
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "my_medal_red_point"

    const-string v2, "no"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1983
    :cond_7
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->q(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dth;->k(Landroid/content/Context;)V

    .line 1985
    goto/16 :goto_0

    :cond_8
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->D(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-ne p1, v0, :cond_9

    .line 1987
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Goto Kaka."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1988
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->A(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)V

    .line 1989
    sget-object v0, Lo/dae;->dC:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 1990
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 1991
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->q(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Lo/dth;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/dth;->e(Landroid/content/Context;)V

    .line 1992
    goto/16 :goto_0

    :cond_9
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->j(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-ne p1, v0, :cond_b

    .line 1993
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Goto report."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1995
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->B(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_a

    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->B(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/ImageView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/ImageView;->getVisibility()I

    move-result v0

    if-nez v0, :cond_a

    .line 1996
    const-string v0, "UIME_PersonalCenterFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "ReportRedPoint GONE."

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1997
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->B(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1998
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "my_annual_report_point"

    const-string v2, "no"

    invoke-static {v0, v1, v2}, Lo/dtn;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2001
    :cond_a
    sget-object v0, Lo/dae;->ez:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v5

    .line 2002
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v5, v4, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2004
    new-instance v6, Landroid/content/Intent;

    invoke-direct {v6}, Landroid/content/Intent;-><init>()V

    .line 2005
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "com.huawei.pluginachievement.ui.report.WeekAndMonthActivity"

    invoke-virtual {v6, v0, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 2007
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2008
    goto :goto_0

    :cond_b
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->C(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/widget/RelativeLayout;

    move-result-object v0

    if-ne p1, v0, :cond_c

    .line 2009
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 2010
    const-string v0, "click"

    const-string v1, "1"

    invoke-interface {v5, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2011
    sget-object v0, Lo/dae;->eB:Lo/dae;

    invoke-virtual {v0}, Lo/dae;->b()Ljava/lang/String;

    move-result-object v6

    .line 2012
    invoke-static {}, Lo/cxf;->e()Lo/cxf;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v6, v5, v2}, Lo/cxf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;I)I

    .line 2013
    new-instance v7, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/ui/main/stories/history/SportHistoryActivity;

    invoke-direct {v7, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2014
    const-string v0, "sportType"

    const/4 v1, 0x0

    invoke-virtual {v7, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 2015
    iget-object v0, p0, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment$3;->b:Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;->d(Lcom/huawei/ui/main/stories/userProfile/activity/PersonalCenterFragment;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 2017
    :cond_c
    :goto_0
    return-void
.end method
