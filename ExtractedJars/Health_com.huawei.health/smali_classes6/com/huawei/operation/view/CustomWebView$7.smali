.class Lcom/huawei/operation/view/CustomWebView$7;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/operation/view/CustomWebView;->onCustomUserPrefSet(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/huawei/operation/view/CustomWebView;

.field final synthetic val$functionRes:Ljava/lang/String;

.field final synthetic val$key:Ljava/lang/String;

.field final synthetic val$value:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/huawei/operation/view/CustomWebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1106
    iput-object p1, p0, Lcom/huawei/operation/view/CustomWebView$7;->this$0:Lcom/huawei/operation/view/CustomWebView;

    iput-object p2, p0, Lcom/huawei/operation/view/CustomWebView$7;->val$key:Ljava/lang/String;

    iput-object p3, p0, Lcom/huawei/operation/view/CustomWebView$7;->val$value:Ljava/lang/String;

    iput-object p4, p0, Lcom/huawei/operation/view/CustomWebView$7;->val$functionRes:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1110
    new-instance v2, Lcom/huawei/hihealth/HiUserPreference;

    invoke-direct {v2}, Lcom/huawei/hihealth/HiUserPreference;-><init>()V

    .line 1111
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$7;->val$key:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserPreference;->setKey(Ljava/lang/String;)V

    .line 1112
    iget-object v0, p0, Lcom/huawei/operation/view/CustomWebView$7;->val$value:Ljava/lang/String;

    invoke-virtual {v2, v0}, Lcom/huawei/hihealth/HiUserPreference;->setValue(Ljava/lang/String;)V

    .line 1113
    invoke-static {}, Lcom/huawei/hwcommonmodel/application/BaseApplication;->a()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/clp;->b(Landroid/content/Context;)Lo/clt;

    move-result-object v0

    invoke-interface {v0, v2}, Lo/clt;->e(Lcom/huawei/hihealth/HiUserPreference;)Z

    move-result v3

    .line 1114
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/huawei/operation/view/CustomWebView$7$1;

    invoke-direct {v1, p0, v3}, Lcom/huawei/operation/view/CustomWebView$7$1;-><init>(Lcom/huawei/operation/view/CustomWebView$7;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1123
    return-void
.end method
