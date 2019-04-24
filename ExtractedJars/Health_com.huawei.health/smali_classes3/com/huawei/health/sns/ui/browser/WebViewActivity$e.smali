.class Lcom/huawei/health/sns/ui/browser/WebViewActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bcy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/browser/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;


# direct methods
.method private constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V
    .locals 0

    .line 1664
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$e;->a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Lcom/huawei/health/sns/ui/browser/WebViewActivity$1;)V
    .locals 0

    .line 1664
    invoke-direct {p0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$e;-><init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V

    return-void
.end method


# virtual methods
.method public b(ILjava/lang/String;)V
    .locals 4

    .line 1669
    const-string v0, "browser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "receive js callback id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1671
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$e;->a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->t(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 1672
    iput p1, v3, Landroid/os/Message;->arg1:I

    .line 1673
    iput-object p2, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 1674
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$e;->a:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->t(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/huawei/health/sns/ui/browser/WebViewActivity$b;->sendMessage(Landroid/os/Message;)Z

    .line 1675
    return-void
.end method
