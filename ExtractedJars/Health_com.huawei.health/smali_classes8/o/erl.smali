.class public Lo/erl;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/erl$d;
    }
.end annotation


# instance fields
.field private b:Landroid/content/Context;

.field private c:Landroid/view/LayoutInflater;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;>;)V"
        }
    .end annotation

    .line 35
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 36
    if-nez p1, :cond_0

    .line 37
    const-string v0, "OperationalInfoAdapter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "context is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    return-void

    .line 41
    :cond_0
    iput-object p1, p0, Lo/erl;->b:Landroid/content/Context;

    .line 42
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lo/erl;->c:Landroid/view/LayoutInflater;

    .line 43
    iput-object p2, p0, Lo/erl;->d:Ljava/util/List;

    .line 44
    return-void
.end method

.method static synthetic c(Lo/erl;)Landroid/content/Context;
    .locals 1

    .line 29
    iget-object v0, p0, Lo/erl;->b:Landroid/content/Context;

    return-object v0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .line 48
    iget-object v0, p0, Lo/erl;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lo/erl;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 51
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/erl;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lo/erl;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, p1, :cond_0

    .line 57
    iget-object v0, p0, Lo/erl;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 59
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 64
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 8

    .line 77
    const/4 v4, 0x0

    .line 78
    if-nez p2, :cond_0

    .line 79
    new-instance v4, Lo/erl$d;

    const/4 v0, 0x0

    invoke-direct {v4, v0}, Lo/erl$d;-><init>(Lo/erl$2;)V

    .line 80
    iget-object v0, p0, Lo/erl;->c:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/ui/homehealth/R$layout;->item_operational_run_info_viewholder:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 81
    sget v0, Lcom/huawei/ui/homehealth/R$id;->img_info:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v4, v0}, Lo/erl$d;->e(Lo/erl$d;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 82
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_info_title:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    invoke-static {v4, v0}, Lo/erl$d;->a(Lo/erl$d;Lo/egb;)Lo/egb;

    .line 83
    sget v0, Lcom/huawei/ui/homehealth/R$id;->text_info_time:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lo/egb;

    invoke-static {v4, v0}, Lo/erl$d;->d(Lo/erl$d;Lo/egb;)Lo/egb;

    .line 84
    sget v0, Lcom/huawei/ui/homehealth/R$id;->view_diver:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v4, v0}, Lo/erl$d;->c(Lo/erl$d;Landroid/view/View;)Landroid/view/View;

    .line 86
    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 88
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/erl$d;

    .line 91
    :goto_0
    invoke-virtual {p0, p1}, Lo/erl;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;

    .line 93
    if-eqz v5, :cond_3

    .line 94
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 96
    invoke-static {v4}, Lo/erl$d;->e(Lo/erl$d;)Lo/egb;

    move-result-object v0

    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getMsgTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 98
    new-instance v6, Ljava/text/SimpleDateFormat;

    const-string v0, "yyyy-MM-dd"

    invoke-direct {v6, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 99
    invoke-static {v4}, Lo/erl$d;->c(Lo/erl$d;)Lo/egb;

    move-result-object v0

    new-instance v1, Ljava/util/Date;

    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getCreateTime()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v6, v1}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/egb;->setText(Ljava/lang/CharSequence;)V

    .line 100
    invoke-virtual {v5}, Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;->getImgUri()Ljava/lang/String;

    move-result-object v7

    .line 102
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 103
    iget-object v0, p0, Lo/erl;->b:Landroid/content/Context;

    invoke-static {v4}, Lo/erl$d;->b(Lo/erl$d;)Landroid/widget/ImageView;

    move-result-object v1

    const/4 v2, 0x4

    invoke-static {v0, v7, v1, v2}, Lo/fic;->e(Landroid/content/Context;Ljava/lang/String;Landroid/widget/ImageView;I)V

    .line 106
    :cond_1
    invoke-virtual {p0}, Lo/erl;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_2

    .line 107
    invoke-static {v4}, Lo/erl$d;->d(Lo/erl$d;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    .line 109
    :cond_2
    invoke-static {v4}, Lo/erl$d;->d(Lo/erl$d;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 112
    :goto_1
    goto :goto_2

    .line 113
    :cond_3
    const/16 v0, 0x8

    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 115
    :goto_2
    new-instance v0, Lo/erl$2;

    invoke-direct {v0, p0, v5}, Lo/erl$2;-><init>(Lo/erl;Lcom/huawei/pluginmessagecenter/provider/data/MessageObject;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 124
    return-object p2
.end method
