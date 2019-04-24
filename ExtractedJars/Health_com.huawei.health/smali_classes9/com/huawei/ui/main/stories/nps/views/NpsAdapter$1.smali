.class Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

.field final synthetic val$position:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;I)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;->this$0:Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

    iput p2, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;->val$position:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5

    .line 97
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;->this$0:Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->states:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    .line 98
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;->this$0:Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->states:Ljava/util/HashMap;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    goto :goto_0

    .line 101
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;->this$0:Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->states:Ljava/util/HashMap;

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;->val$position:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;->this$0:Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->access$000(Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;)Landroid/os/Handler;

    move-result-object v0

    iget v1, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;->val$position:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 103
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter$1;->this$0:Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/views/NpsAdapter;->notifyDataSetChanged()V

    .line 105
    return-void
.end method
