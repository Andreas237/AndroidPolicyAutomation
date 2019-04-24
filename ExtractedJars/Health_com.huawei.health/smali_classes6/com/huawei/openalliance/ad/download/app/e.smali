.class Lcom/huawei/openalliance/ad/download/app/e;
.super Landroid/widget/BaseAdapter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/download/app/e$a;,
        Lcom/huawei/openalliance/ad/download/app/e$b;
    }
.end annotation


# instance fields
.field private a:Landroid/content/Context;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;>;"
        }
    .end annotation
.end field

.field private c:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/content/Context;Ljava/util/List<Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    iput-object p1, p0, Lcom/huawei/openalliance/ad/download/app/e;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/huawei/openalliance/ad/download/app/e;->b:Ljava/util/List;

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->a:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->c:Landroid/view/LayoutInflater;

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->b:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->b:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;

    :goto_0
    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->b:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    int-to-long v0, p1

    :goto_0
    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->b:Ljava/util/List;

    invoke-static {v0}, Lcom/huawei/openalliance/ad/utils/q;->a(Ljava/util/Collection;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;

    invoke-virtual {v0}, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;->getType()I

    move-result v0

    :goto_0
    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;

    invoke-virtual {p0, p1}, Lcom/huawei/openalliance/ad/download/app/e;->getItemViewType(I)I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_4

    :sswitch_0
    if-nez p2, :cond_0

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->c:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/openalliance/ad/R$layout;->hiad_permission_dialog_parent_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    new-instance v4, Lcom/huawei/openalliance/ad/download/app/e$b;

    invoke-direct {v4, p2}, Lcom/huawei/openalliance/ad/download/app/e$b;-><init>(Landroid/view/View;)V

    invoke-virtual {p2, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/openalliance/ad/download/app/e$b;

    :goto_0
    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;->getName()Ljava/lang/String;

    move-result-object v8

    iget-object v0, v4, Lcom/huawei/openalliance/ad/download/app/e$b;->a:Landroid/widget/TextView;

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, ""

    goto :goto_1

    :cond_1
    move-object v1, v8

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_4

    :sswitch_1
    if-nez p2, :cond_2

    iget-object v0, p0, Lcom/huawei/openalliance/ad/download/app/e;->c:Landroid/view/LayoutInflater;

    sget v1, Lcom/huawei/openalliance/ad/R$layout;->hiad_permission_dialog_child_item:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    new-instance v5, Lcom/huawei/openalliance/ad/download/app/e$a;

    invoke-direct {v5, p2}, Lcom/huawei/openalliance/ad/download/app/e$a;-><init>(Landroid/view/View;)V

    invoke-virtual {p2, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/openalliance/ad/download/app/e$a;

    :goto_2
    invoke-virtual {v6}, Lcom/huawei/openalliance/ad/inter/data/PermissionEntity;->getName()Ljava/lang/String;

    move-result-object v9

    iget-object v0, v5, Lcom/huawei/openalliance/ad/download/app/e$a;->a:Landroid/widget/TextView;

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, ""

    goto :goto_3

    :cond_3
    move-object v1, v9

    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_4
    const-string v0, "AppPermissionsDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getView, time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", position:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object p2

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
    .end sparse-switch
.end method

.method public getViewTypeCount()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public isEnabled(I)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
