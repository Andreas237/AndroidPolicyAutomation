.class public Lo/agw;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/agw$e;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Landroid/net/wifi/ScanResult;>;"
        }
    .end annotation
.end field

.field public e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Landroid/net/wifi/ScanResult;>;)V"
        }
    .end annotation

    .line 28
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 25
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/agw;->c:Ljava/util/List;

    .line 27
    const/4 v0, -0x1

    iput v0, p0, Lo/agw;->e:I

    .line 29
    iput-object p1, p0, Lo/agw;->a:Landroid/content/Context;

    .line 30
    iput-object p2, p0, Lo/agw;->c:Ljava/util/List;

    .line 31
    return-void
.end method


# virtual methods
.method public e(I)V
    .locals 0

    .line 90
    iput p1, p0, Lo/agw;->e:I

    .line 91
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 35
    iget-object v0, p0, Lo/agw;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 36
    iget-object v0, p0, Lo/agw;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0

    .line 38
    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    .line 44
    iget-object v0, p0, Lo/agw;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lo/agw;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    .line 45
    iget-object v0, p0, Lo/agw;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 47
    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 53
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4

    .line 58
    const/4 v3, 0x0

    .line 59
    if-nez p2, :cond_0

    .line 60
    new-instance v3, Lo/agw$e;

    invoke-direct {v3}, Lo/agw$e;-><init>()V

    .line 61
    iget-object v0, p0, Lo/agw;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$layout;->wifi_list_item_layout:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 62
    sget v0, Lcom/huawei/plugindevice/R$id;->wifi_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    invoke-static {v3, v0}, Lo/agw$e;->a(Lo/agw$e;Landroid/widget/TextView;)Landroid/widget/TextView;

    .line 63
    sget v0, Lcom/huawei/plugindevice/R$id;->wifi_check_img:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {v3, v0}, Lo/agw$e;->c(Lo/agw$e;Landroid/widget/ImageView;)Landroid/widget/ImageView;

    .line 64
    sget v0, Lcom/huawei/plugindevice/R$id;->wifi_name_divider_line:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v3, v0}, Lo/agw$e;->a(Lo/agw$e;Landroid/view/View;)Landroid/view/View;

    .line 65
    invoke-virtual {p2, v3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/agw$e;

    .line 69
    :goto_0
    invoke-static {v3}, Lo/agw$e;->b(Lo/agw$e;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lo/agw;->c:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/wifi/ScanResult;

    iget-object v1, v1, Landroid/net/wifi/ScanResult;->SSID:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 70
    iget v0, p0, Lo/agw;->e:I

    if-ne v0, p1, :cond_1

    .line 71
    invoke-static {v3}, Lo/agw$e;->c(Lo/agw$e;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$drawable;->btn_health_list_radio_sel:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto :goto_1

    .line 73
    :cond_1
    invoke-static {v3}, Lo/agw$e;->c(Lo/agw$e;)Landroid/widget/ImageView;

    move-result-object v0

    sget v1, Lcom/huawei/plugindevice/R$drawable;->btn_health_list_radio_nor:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 75
    :goto_1
    iget-object v0, p0, Lo/agw;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_2

    .line 76
    invoke-static {v3}, Lo/agw$e;->a(Lo/agw$e;)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 78
    :cond_2
    invoke-static {v3}, Lo/agw$e;->a(Lo/agw$e;)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 80
    :goto_2
    return-object p2
.end method
