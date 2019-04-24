.class Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
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

    .line 144
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$2;->this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    iput-object p2, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$2;->val$holder:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;

    iput p3, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$2;->val$pos:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .line 147
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$2;->this$0:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;

    iget-object v1, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$2;->val$holder:Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;

    iget v2, p0, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$2;->val$pos:I

    invoke-static {v0, v1, v2}, Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;->access$200(Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter;Lcom/huawei/ui/main/stories/nps/component/MultiLayoutAdapter$ViewHolder1;I)V

    .line 148
    return-void
.end method
