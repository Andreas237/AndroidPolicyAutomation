.class Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)V
    .locals 0

    .line 116
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 118
    return-void
.end method


# virtual methods
.method protected a(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;Landroid/os/Message;)V
    .locals 6

    .line 123
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "handleMessageWhenReferenceNotNull msg.what:"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget v2, p2, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 124
    iget v0, p2, Landroid/os/Message;->what:I

    const/16 v1, 0x64

    if-ne v0, v1, :cond_3

    .line 127
    invoke-static {p1}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 129
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->a:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    invoke-static {p1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;)V

    .line 130
    return-void

    .line 132
    :cond_0
    iget-object v4, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 133
    instance-of v0, v4, Ljava/util/List;

    if-nez v0, :cond_1

    .line 135
    const-string v0, "OfflineCitysFragment"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyHandler msg.obj is not List or is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    return-void

    .line 138
    :cond_1
    move-object v5, v4

    check-cast v5, Ljava/util/List;

    .line 139
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 141
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->d:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    invoke-static {p1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;)V

    .line 142
    invoke-static {p1, v5}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->e(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;Ljava/util/List;)V

    goto :goto_0

    .line 146
    :cond_2
    sget-object v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;->b:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;

    invoke-static {p1, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;->c(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$b;)V

    .line 150
    :cond_3
    :goto_0
    return-void
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 111
    move-object v0, p1

    check-cast v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment$d;->a(Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/view/OfflineCitysFragment;Landroid/os/Message;)V

    return-void
.end method
