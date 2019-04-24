.class Lcom/huawei/health/sns/ui/base/SNSBaseActivity$4;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/health/sns/ui/base/SNSBaseActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/base/SNSBaseActivity;)V
    .locals 0

    .line 157
    iput-object p1, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$4;->c:Lcom/huawei/health/sns/ui/base/SNSBaseActivity;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 161
    if-eqz p2, :cond_0

    .line 163
    const-string v0, "com.huawei.android.sns.action.login.account"

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Lcom/huawei/health/sns/ui/base/SNSBaseActivity$4;->c:Lcom/huawei/health/sns/ui/base/SNSBaseActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/base/SNSBaseActivity;->c(Lcom/huawei/health/sns/ui/base/SNSBaseActivity;)V

    .line 168
    :cond_0
    return-void
.end method
