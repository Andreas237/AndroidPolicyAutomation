.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;


# direct methods
.method constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)V
    .locals 0

    .line 196
    iput-object p1, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$4;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 4

    .line 201
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "OnEditorActionListener onEditorAction() actionId:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 202
    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    const/4 v0, 0x5

    if-ne p2, v0, :cond_1

    .line 204
    :cond_0
    iget-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$4;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-virtual {v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->d()V

    .line 205
    const/4 v0, 0x1

    return v0

    .line 207
    :cond_1
    const/4 v0, 0x0

    return v0
.end method
