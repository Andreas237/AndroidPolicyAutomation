.class Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ClickListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;


# direct methods
.method constructor <init>(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)V
    .locals 0

    .line 170
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 173
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->access$200(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)Landroid/widget/Button;

    move-result-object v0

    if-ne p1, v0, :cond_2

    .line 174
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->access$300(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 175
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 176
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;->dismiss()V

    .line 178
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->access$400(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)Landroid/view/View$OnClickListener;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_3

    .line 179
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->access$400(Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    goto :goto_0

    .line 182
    :cond_1
    const-string v0, "ServiceAuthDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "checkBox is not checked, do nothing!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    .line 185
    :cond_2
    const-string v0, "ServiceAuthDialog"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "click titleBar"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 186
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder$ClickListener;->this$0:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/ui/dialog/ServiceAuthDialog;->dismiss()V

    .line 188
    :cond_3
    :goto_0
    return-void
.end method
