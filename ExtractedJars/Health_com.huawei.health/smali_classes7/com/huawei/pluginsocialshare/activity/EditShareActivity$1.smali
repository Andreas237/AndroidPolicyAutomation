.class Lcom/huawei/pluginsocialshare/activity/EditShareActivity$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->g()V
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

    .line 542
    iput-object p1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$1;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 545
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$1;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    iget-object v1, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$1;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-static {v1}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->b(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Landroid/content/Context;

    move-result-object v1

    invoke-static {}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->b()[Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->e(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;Landroid/content/Context;[Ljava/lang/String;)V

    .line 546
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$1;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-static {v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Lo/egw;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 547
    iget-object v0, p0, Lcom/huawei/pluginsocialshare/activity/EditShareActivity$1;->a:Lcom/huawei/pluginsocialshare/activity/EditShareActivity;

    invoke-static {v0}, Lcom/huawei/pluginsocialshare/activity/EditShareActivity;->k(Lcom/huawei/pluginsocialshare/activity/EditShareActivity;)Lo/egw;

    move-result-object v0

    invoke-virtual {v0}, Lo/egw;->dismiss()V

    .line 549
    :cond_0
    return-void
.end method
