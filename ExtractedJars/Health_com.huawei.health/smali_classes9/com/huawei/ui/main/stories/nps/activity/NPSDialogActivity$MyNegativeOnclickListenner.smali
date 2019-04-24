.class Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity$MyNegativeOnclickListenner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MyNegativeOnclickListenner"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;)V
    .locals 0

    .line 74
    iput-object p1, p0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity$MyNegativeOnclickListenner;->this$0:Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity$MyNegativeOnclickListenner;->this$0:Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->finish()V

    .line 78
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity$MyNegativeOnclickListenner;->this$0:Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->access$000(Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;)Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->getNegativeListener()Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity$MyNegativeOnclickListenner;->this$0:Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;->access$000(Lcom/huawei/ui/main/stories/nps/activity/NPSDialogActivity;)Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;

    move-result-object v0

    invoke-virtual {v0}, Lcom/huawei/ui/main/stories/nps/activity/DialogActivityUtils;->getNegativeListener()Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 81
    :cond_0
    return-void
.end method
