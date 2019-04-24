.class Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
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

    .line 98
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$2;->this$0:Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 102
    const/4 v3, 0x0

    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$2;->this$0:Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->access$100(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    .line 103
    if-ne p3, v3, :cond_0

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$2;->this$0:Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->access$200(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 106
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$2;->this$0:Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->access$200(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)Ljava/util/HashMap;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 109
    :cond_1
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$2;->this$0:Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->access$300(Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;)Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->notifyDataSetChanged()V

    .line 110
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment$2;->this$0:Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/SingleFragment;->saveData()V

    .line 111
    return-void
.end method
