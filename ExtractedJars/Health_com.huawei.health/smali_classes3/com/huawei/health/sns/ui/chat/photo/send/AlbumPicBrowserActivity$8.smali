.class Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->d(Lo/bdw$d;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/widget/CheckBox;

.field final synthetic b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

.field final synthetic d:Lo/bdw$d;

.field final synthetic e:I


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;Landroid/widget/CheckBox;Lo/bdw$d;I)V
    .locals 0

    .line 1005
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    iput-object p2, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->a:Landroid/widget/CheckBox;

    iput-object p3, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->d:Lo/bdw$d;

    iput p4, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 8

    .line 1008
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 1009
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->a:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v6

    .line 1010
    if-eqz v6, :cond_1

    const/16 v0, 0x9

    if-lt v5, v0, :cond_1

    .line 1011
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->a:Landroid/widget/CheckBox;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 1012
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lcom/huawei/android/sns/R$string;->sns_select_pic_counts_over_notice:I

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "9"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-virtual {v0, v1, v2}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    .line 1014
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->c()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1015
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-static {v0, v7}, Lo/brh;->e(Landroid/app/Activity;Ljava/lang/String;)V

    .line 1017
    :cond_0
    return-void

    .line 1019
    :cond_1
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->d:Lo/bdw$d;

    invoke-virtual {v0}, Lo/bdw$d;->getCover()Landroid/view/View;

    move-result-object v7

    .line 1020
    if-eqz v6, :cond_3

    .line 1021
    if-eqz v7, :cond_2

    .line 1022
    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1024
    :cond_2
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    iget-object v0, v0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->h:Ljava/util/ArrayList;

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->e:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1026
    :cond_3
    if-eqz v7, :cond_4

    .line 1027
    const/16 v0, 0x8

    invoke-virtual {v7, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1029
    :cond_4
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    iget v1, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->e:I

    invoke-static {v0, v1}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->e(Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;I)V

    .line 1032
    :goto_0
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity$8;->b:Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;

    invoke-virtual {v0}, Lcom/huawei/health/sns/ui/chat/photo/send/AlbumPicBrowserActivity;->a()V

    .line 1033
    return-void
.end method
