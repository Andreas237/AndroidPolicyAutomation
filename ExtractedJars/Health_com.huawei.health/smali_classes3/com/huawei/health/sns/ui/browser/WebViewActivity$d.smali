.class Lcom/huawei/health/sns/ui/browser/WebViewActivity$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/webkit/DownloadListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/health/sns/ui/browser/WebViewActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic d:Lcom/huawei/health/sns/ui/browser/WebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/health/sns/ui/browser/WebViewActivity;)V
    .locals 0

    .line 1068
    iput-object p1, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$d;->d:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onDownloadStart(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
    .locals 3

    .line 1074
    const-string v0, "browser"

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "start download, mimetype="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lo/bpf;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 1075
    iget-object v0, p0, Lcom/huawei/health/sns/ui/browser/WebViewActivity$d;->d:Lcom/huawei/health/sns/ui/browser/WebViewActivity;

    invoke-static {v0, p1}, Lcom/huawei/health/sns/ui/browser/WebViewActivity;->a(Lcom/huawei/health/sns/ui/browser/WebViewActivity;Ljava/lang/String;)V

    .line 1076
    return-void
.end method
