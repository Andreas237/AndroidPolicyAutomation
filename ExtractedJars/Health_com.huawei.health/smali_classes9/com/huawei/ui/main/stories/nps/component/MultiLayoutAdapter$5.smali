.class Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->initializeScoreDialogLayout(Landroid/view/View;Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;I)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

.field final synthetic val$holder:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;

.field final synthetic val$pos:I


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;I)V
    .locals 0

    .line 207
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$5;->this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$5;->val$holder:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;

    iput p3, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$5;->val$pos:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Landroid/widget/AdapterView<*>;Landroid/view/View;IJ)V"
        }
    .end annotation

    .line 210
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$5;->this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->access$300(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)Landroid/app/Dialog;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 211
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$5;->this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->access$300(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)Landroid/app/Dialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 213
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$5;->val$holder:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;

    iget-object v0, v0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;->score:Landroid/widget/TextView;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    rsub-int/lit8 v2, p3, 0xa

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 214
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$5;->this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->access$400(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;)Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$NpsBarProgressListener;

    move-result-object v0

    rsub-int/lit8 v1, p3, 0xa

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$5;->val$pos:I

    invoke-interface {v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$NpsBarProgressListener;->getProgress(II)V

    .line 215
    return-void
.end method
