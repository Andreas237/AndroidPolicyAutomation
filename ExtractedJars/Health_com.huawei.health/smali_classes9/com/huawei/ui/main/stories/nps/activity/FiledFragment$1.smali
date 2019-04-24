.class Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/text/TextWatcher;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)V
    .locals 0

    .line 79
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public afterTextChanged(Landroid/text/Editable;)V
    .locals 0

    .line 106
    return-void
.end method

.method public beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 101
    return-void
.end method

.method public onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 4

    .line 84
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 85
    return-void

    .line 86
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->access$002(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->access$100(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->queryInt(Ljava/lang/Integer;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 88
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getStringDataCenter()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->access$100(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getStringDataCenter()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->access$100(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->access$000(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 91
    :cond_1
    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getStringDataCenter()Ljava/util/HashMap;

    move-result-object v0

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    invoke-static {v1}, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->access$100(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    invoke-static {v2}, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->access$000(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    :goto_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment$1;->this$0:Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;->access$200(Lcom/huawei/ui/main/stories/nps/activity/FiledFragment;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "finish Filed question successful:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/huawei/ui/main/stories/nps/interactors/mode/Records;->getStringDataCenter()Ljava/util/HashMap;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    return-void
.end method
