.class Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyPositiveOnclickListenner;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MyPositiveOnclickListenner"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;


# direct methods
.method constructor <init>(Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;)V
    .locals 0

    .line 490
    iput-object p1, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyPositiveOnclickListenner;->this$0:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 493
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyPositiveOnclickListenner;->this$0:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;

    if-eqz v0, :cond_0

    .line 494
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyPositiveOnclickListenner;->this$0:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;

    iget-object v0, v0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->dialog:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;

    invoke-virtual {v0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog;->dismiss()V

    .line 497
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyPositiveOnclickListenner;->this$0:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->access$100(Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;)Landroid/view/View$OnClickListener;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 498
    iget-object v0, p0, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder$MyPositiveOnclickListenner;->this$0:Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;

    invoke-static {v0}, Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;->access$100(Lcom/huawei/ui/openservice/ui/dialog/CustomAuthAlertDialog$Builder;)Landroid/view/View$OnClickListener;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 500
    :cond_1
    return-void
.end method
