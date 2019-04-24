.class public Lo/fbb;
.super Lo/fbi$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/fbb$e;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 21
    invoke-direct {p0, p1}, Lo/fbi$e;-><init>(Landroid/content/Context;)V

    .line 22
    invoke-virtual {p0}, Lo/fbb;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroid/view/LayoutInflater;

    .line 23
    sget v0, Lcom/huawei/ui/main/R$layout;->unixtime_listview_child_item:I

    invoke-virtual {v2, v0, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 24
    return-void
.end method


# virtual methods
.method public a(Lo/fbm;)V
    .locals 15

    .line 29
    move-object/from16 v0, p1

    instance-of v0, v0, Lo/fbb$e;

    if-nez v0, :cond_0

    .line 30
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "modelDetail not instanceof CustomDetailModel"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 33
    :cond_0
    sget v0, Lcom/huawei/ui/main/R$id;->health_heartrate_history_child_times:I

    invoke-virtual {p0, v0}, Lo/fbb;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 34
    invoke-interface/range {p1 .. p1}, Lo/fbm;->d()J

    move-result-wide v7

    .line 35
    invoke-interface/range {p1 .. p1}, Lo/fbm;->b()J

    move-result-wide v9

    .line 36
    invoke-virtual {p0}, Lo/fbb;->getContext()Landroid/content/Context;

    move-result-object v0

    const v1, 0x20014

    invoke-static {v0, v7, v8, v1}, Landroid/text/format/DateUtils;->formatDateTime(Landroid/content/Context;JI)Ljava/lang/String;

    move-result-object v11

    .line 38
    invoke-virtual {p0}, Lo/fbb;->getContext()Landroid/content/Context;

    move-result-object v0

    move-wide v1, v7

    move-wide v3, v9

    const/16 v5, 0x41

    invoke-static/range {v0 .. v5}, Landroid/text/format/DateUtils;->formatDateRange(Landroid/content/Context;JJI)Ljava/lang/String;

    move-result-object v12

    .line 41
    sget v0, Lcom/huawei/ui/main/R$id;->health_heartrate_history_child_date:I

    invoke-virtual {p0, v0}, Lo/fbb;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/TextView;

    .line 42
    sget v0, Lcom/huawei/ui/main/R$id;->health_heartrate_history_child_time:I

    invoke-virtual {p0, v0}, Lo/fbb;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/TextView;

    .line 44
    invoke-virtual {v13, v11}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    invoke-virtual {v14, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    move-object/from16 v0, p1

    check-cast v0, Lo/fbb$e;

    invoke-virtual {v0}, Lo/fbb$e;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 48
    return-void
.end method
