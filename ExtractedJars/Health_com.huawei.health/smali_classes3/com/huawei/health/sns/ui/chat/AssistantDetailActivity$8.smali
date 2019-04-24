.class Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->u()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)V
    .locals 0

    .line 800
    iput-object p1, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;->d:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 6

    .line 805
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;->d:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->c(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;)Lcom/huawei/health/sns/model/chat/Assistant;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 807
    iget-object v0, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;->d:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    const-string v1, ""

    iget-object v2, p0, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;->d:Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;

    .line 810
    invoke-virtual {v2}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_delete_system_notification_record:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    sget v3, Lcom/huawei/android/sns/R$string;->sns_cancel:I

    sget v4, Lcom/huawei/android/sns/R$string;->sns_delete:I

    new-instance v5, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8$5;

    invoke-direct {v5, p0}, Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8$5;-><init>(Lcom/huawei/health/sns/ui/chat/AssistantDetailActivity$8;)V

    .line 807
    invoke-static/range {v0 .. v5}, Lo/boj;->c(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;IILo/boj$c;)Landroid/app/AlertDialog;

    .line 827
    :cond_0
    return-void
.end method
