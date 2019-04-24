.class Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;)V
    .locals 0

    .line 121
    iput-object p1, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$5;->c:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 125
    iget-object v0, p0, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity$5;->c:Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;

    invoke-virtual {v0}, Lcom/huawei/ui/commonui/webview/LegalInfoWebViewActivity;->finish()V

    .line 126
    return-void
.end method
