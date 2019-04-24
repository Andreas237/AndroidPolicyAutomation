.class Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


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

.field final synthetic val$npsScoreList:Landroid/widget/ListView;

.field final synthetic val$score:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;Landroid/widget/ListView;Ljava/lang/String;)V
    .locals 0

    .line 197
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$4;->this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$4;->val$npsScoreList:Landroid/widget/ListView;

    iput-object p3, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$4;->val$score:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 200
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$4;->val$npsScoreList:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$4;->val$score:Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    rsub-int/lit8 v1, v1, 0xa

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setSelection(I)V

    .line 201
    return-void
.end method
