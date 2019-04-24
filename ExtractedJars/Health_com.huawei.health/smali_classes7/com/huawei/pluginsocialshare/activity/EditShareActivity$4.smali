.class Lcom/huawei/pluginsocialshare/activity/EditShareActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;


# direct methods
.method constructor <init>(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)V
    .locals 0

    .line 210
    iput-object p1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$4;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 9

    .line 213
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$4;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-static {v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->d(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Lo/ebr;

    move-result-object v0

    invoke-static {v0}, Lo/ecc;->b(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 214
    if-nez v4, :cond_0

    .line 215
    const-string v0, "EditShareActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "share pic is null "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    return-void

    .line 218
    :cond_0
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$4;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-static {v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->a(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Landroid/graphics/Bitmap;

    move-result-object v5

    .line 219
    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v4, v1, v5, v0}, Lo/ecc;->d(Landroid/graphics/Bitmap;ILandroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v6

    .line 220
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick_show_share_pig1 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    if-nez v6, :cond_1

    .line 222
    return-void

    .line 224
    :cond_1
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$4;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-static {v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->e(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)V

    .line 225
    const-string v0, "EditShareActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "onClick_show_share_pig3 "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getByteCount()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 226
    new-instance v7, Lo/dav;

    const/4 v0, 0x1

    invoke-direct {v7, v0}, Lo/dav;-><init>(I)V

    .line 227
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lo/dav;->d(Z)V

    .line 228
    invoke-virtual {v7, v6}, Lo/dav;->e(Landroid/graphics/Bitmap;)V

    .line 229
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$4;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-static {v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->c(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Lo/dau;

    move-result-object v0

    invoke-virtual {v0}, Lo/dau;->h()I

    move-result v0

    const/4 v1, 0x6

    if-ne v0, v1, :cond_2

    .line 230
    const/4 v0, 0x6

    invoke-virtual {v7, v0}, Lo/dav;->a(I)V

    goto :goto_0

    .line 232
    :cond_2
    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lo/dav;->a(I)V

    .line 234
    :goto_0
    invoke-static {v7}, Lo/ebk;->e(Lo/dav;)V

    .line 235
    const/4 v0, 0x0

    invoke-static {v0}, Lo/ebk;->c(Z)V

    .line 236
    new-instance v8, Landroid/content/Intent;

    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$4;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-static {v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->b(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/pluginsocialshare/activity/SharePopupActivity;

    invoke-direct {v8, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 237
    const/high16 v0, 0x10000000

    invoke-virtual {v8, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 238
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$4;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-static {v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->b(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v8}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 239
    return-void
.end method
