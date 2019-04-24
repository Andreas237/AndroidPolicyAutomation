.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)V
    .locals 0

    .line 212
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$5;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 217
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "mCancelImage onClick() "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 218
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$5;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 220
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$5;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d()V

    goto :goto_0

    .line 224
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$5;->c:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-static {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)Landroid/widget/EditText;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 226
    :goto_0
    return-void
.end method
