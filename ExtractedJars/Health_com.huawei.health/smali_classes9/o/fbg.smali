.class public Lo/fbg;
.super Lo/fbi$c;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 20
    invoke-direct {p0, p1}, Lo/fbi$c;-><init>(Landroid/content/Context;)V

    .line 21
    invoke-virtual {p0}, Lo/fbg;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/LayoutInflater;

    .line 22
    sget v0, Lcom/huawei/ui/main/R$layout;->unixtime_listview_parent_item:I

    invoke-virtual {v2, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 23
    return-void
.end method


# virtual methods
.method public b(Lo/fbp;Z)V
    .locals 7

    .line 28
    sget v0, Lcom/huawei/ui/main/R$id;->health_heartrate_history_father_arrow:I

    invoke-virtual {p0, v0}, Lo/fbg;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/widget/ImageView;

    .line 29
    if-eqz p2, :cond_0

    .line 30
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_list_drop_down_arrow_sel:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    goto :goto_0

    .line 32
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$drawable;->ic_health_list_drop_down_arrow_nor:I

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setBackgroundResource(I)V

    .line 34
    :goto_0
    sget v0, Lcom/huawei/ui/main/R$id;->health_heartrate_history_father_date:I

    invoke-virtual {p0, v0}, Lo/fbg;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Landroid/widget/TextView;

    .line 35
    invoke-interface {p1}, Lo/fbp;->d()J

    move-result-wide v4

    .line 36
    invoke-virtual {p0}, Lo/fbg;->getContext()Landroid/content/Context;

    move-result-object v0

    const/16 v1, 0x34

    invoke-static {v0, v4, v5, v1}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v6

    .line 37
    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    return-void
.end method
