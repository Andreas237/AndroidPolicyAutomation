.class Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->showSelectQstnDialog()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)V
    .locals 0

    .line 622
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$7;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 625
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager$7;->this$0:Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;->access$000(Lcom/huawei/ui/main/stories/nps/interactors/HWNPSManager;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "=========nps press NegativeButton"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 626
    return-void
.end method
