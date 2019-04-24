.class Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 3

    .line 48
    iget v2, p1, Landroid/os/Message;->what:I

    .line 49
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->access$000(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)Landroid/widget/ListView;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 50
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->saveData()V

    .line 51
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 52
    return-void
.end method
