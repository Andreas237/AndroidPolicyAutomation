.class Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/din;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V
    .locals 1

    .line 684
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 686
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$5;)V
    .locals 0

    .line 684
    invoke-direct {p0, p1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)V

    return-void
.end method

.method static synthetic e(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;)Ljava/util/List;
    .locals 1

    .line 684
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(I)Lo/din;
    .locals 1

    .line 709
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/din;

    return-object v0
.end method

.method public b()V
    .locals 1

    .line 696
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 697
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 699
    :cond_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->notifyDataSetChanged()V

    .line 700
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/din;>;)V"
        }
    .end annotation

    .line 689
    if-eqz p1, :cond_0

    .line 690
    iput-object p1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    .line 691
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->notifyDataSetChanged()V

    .line 693
    :cond_0
    return-void
.end method

.method public d()V
    .locals 2

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;Z)Z

    .line 724
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->notifyDataSetChanged()V

    .line 725
    return-void
.end method

.method public e()V
    .locals 2

    .line 728
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->b(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;Z)Z

    .line 729
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->notifyDataSetChanged()V

    .line 730
    return-void
.end method

.method public getCount()I
    .locals 1

    .line 704
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .line 684
    invoke-virtual {p0, p1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->a(I)Lo/din;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    .line 714
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .line 734
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 735
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$layout;->notification_list_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p2

    .line 737
    :cond_0
    sget v0, Lcom/huawei/ui/device/R$id;->app_icon:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/ImageView;

    .line 738
    sget v0, Lcom/huawei/ui/device/R$id;->app_name:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 739
    sget v0, Lcom/huawei/ui/device/R$id;->app_switch:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/Switch;

    .line 740
    sget v0, Lcom/huawei/ui/device/R$id;->notification_divider:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/widget/ImageView;

    .line 741
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 742
    const/16 v0, 0x8

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_0

    .line 744
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 747
    :goto_0
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->getCount()I

    move-result v0

    if-ge p1, v0, :cond_3

    .line 748
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lo/din;

    .line 749
    invoke-virtual {v9}, Lo/din;->a()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 750
    invoke-virtual {v9}, Lo/din;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 751
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 752
    invoke-virtual {v9}, Lo/din;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v7, v0}, Landroid/widget/Switch;->setChecked(Z)V

    .line 755
    :cond_3
    new-instance v0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e$1;

    invoke-direct {v0, p0, p1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e$1;-><init>(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;I)V

    invoke-virtual {v7, v0}, Landroid/widget/Switch;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 811
    const-string v0, "true"

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v1}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->e(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Landroid/content/Context;

    move-result-object v1

    const/16 v2, 0x2711

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "KEY_NOTIFICATION_SETTINGS_FIRST_OPEN_FLAG"

    invoke-static {v1, v2, v3}, Lo/dct;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    .line 812
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x7

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getView() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const-string v2, "  isSetFirstOpen = "

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x2

    aput-object v2, v1, v3

    const-string v2, ", position = "

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x4

    aput-object v2, v1, v3

    const-string v2, ", getCount = "

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->getCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x6

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 813
    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->getCount()I

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->getCount()I

    move-result v0

    if-le v0, p1, :cond_4

    .line 814
    const-string v0, "NotificationOpenActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "packagename:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/din;

    invoke-virtual {v3}, Lo/din;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "is autho: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/din;

    invoke-virtual {v3}, Lo/din;->c()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "is auto 2 :"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v3}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/eoa;

    move-result-object v3

    iget-object v4, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/din;

    invoke-virtual {v4}, Lo/din;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 816
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->c(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Lo/eoa;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/din;

    invoke-virtual {v1}, Lo/din;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo/eoa;->c(Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_4

    .line 817
    invoke-static {}, Lo/dip;->d()Lo/dip;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->d:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/din;

    invoke-virtual {v1}, Lo/din;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lo/dip;->a(Ljava/lang/String;I)V

    .line 820
    :cond_4
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->l(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 821
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Landroid/widget/Switch;->setEnabled(Z)V

    .line 822
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$color;->common_white_0alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 823
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$color;->common_black_90alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_2

    .line 825
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/widget/Switch;->setEnabled(Z)V

    .line 826
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$color;->common_white_60alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 827
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/ui/device/R$color;->common_black_20alpha:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-virtual {v6, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 829
    :goto_2
    return-object p2
.end method

.method public isEnabled(I)Z
    .locals 1

    .line 719
    iget-object v0, p0, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity$e;->c:Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;

    invoke-static {v0}, Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;->l(Lcom/huawei/ui/device/activity/notification/NotificationOpenActivity;)Z

    move-result v0

    return v0
.end method
