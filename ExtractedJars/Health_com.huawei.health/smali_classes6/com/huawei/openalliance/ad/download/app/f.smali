.class public Lcom/huawei/openalliance/ad/download/app/f;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/openalliance/ad/download/app/f$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AppInfo;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lcom/huawei/openalliance/ad/download/app/f;->a(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/app/f$a;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/huawei/openalliance/ad/inter/data/AppInfo;Lcom/huawei/openalliance/ad/download/app/f$a;)V
    .locals 12

    const-string v0, "AppPermissionsDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "show, context:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->b(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Landroid/app/AlertDialog$Builder;

    invoke-direct {v5, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const-string v0, ""

    invoke-virtual {v5, v0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    if-eqz p2, :cond_0

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_dialog_accept:I

    new-instance v1, Lcom/huawei/openalliance/ad/download/app/f$1;

    invoke-direct {v1, p2}, Lcom/huawei/openalliance/ad/download/app/f$1;-><init>(Lcom/huawei/openalliance/ad/download/app/f$a;)V

    invoke-virtual {v5, v0, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_dialog_cancel:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    goto :goto_0

    :cond_0
    sget v0, Lcom/huawei/openalliance/ad/R$string;->hiad_dialog_close:I

    const/4 v1, 0x0

    invoke-virtual {v5, v0, v1}, Landroid/app/AlertDialog$Builder;->setNeutralButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    :goto_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$layout;->hiad_permission_dialog_cotent:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_permissions_dialog_content_title_tv:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/openalliance/ad/R$string;->hiad_permission_dialog_title:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getAppName()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget v0, Lcom/huawei/openalliance/ad/R$id;->hiad_permissions_dialog_content_lv:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Landroid/widget/ListView;

    new-instance v10, Lcom/huawei/openalliance/ad/download/app/e;

    invoke-virtual {p1}, Lcom/huawei/openalliance/ad/inter/data/AppInfo;->getPermissions()Ljava/util/List;

    move-result-object v0

    invoke-direct {v10, p0, v0}, Lcom/huawei/openalliance/ad/download/app/e;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v9, v10}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    invoke-virtual {v5, v6}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    invoke-virtual {v5}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v11

    instance-of v0, p0, Landroid/app/Activity;

    if-nez v0, :cond_1

    invoke-virtual {v11}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x7d3

    invoke-virtual {v0, v1}, Landroid/view/Window;->setType(I)V

    :cond_1
    const-string v0, "AppPermissionsDialog"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "show, time:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/openalliance/ad/g/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v11}, Landroid/app/AlertDialog;->show()V

    return-void
.end method
