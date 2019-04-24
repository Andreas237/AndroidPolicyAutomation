.class Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/myfitnesspal/android/sdk/MfpDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "MfpWebViewClient"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;


# direct methods
.method private constructor <init>(Lcom/myfitnesspal/android/sdk/MfpDialog;)V
    .locals 0

    .line 129
    iput-object p1, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/myfitnesspal/android/sdk/MfpDialog;Lcom/myfitnesspal/android/sdk/MfpDialog$1;)V
    .locals 0

    .line 129
    invoke-direct {p0, p1}, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;-><init>(Lcom/myfitnesspal/android/sdk/MfpDialog;)V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 186
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 187
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-static {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->access$300(Lcom/myfitnesspal/android/sdk/MfpDialog;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->dismiss()V

    .line 192
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-static {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->access$400(Lcom/myfitnesspal/android/sdk/MfpDialog;)Landroid/widget/FrameLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    .line 193
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-static {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->access$500(Lcom/myfitnesspal/android/sdk/MfpDialog;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 194
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-static {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->access$600(Lcom/myfitnesspal/android/sdk/MfpDialog;)Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 195
    return-void
.end method

.method public onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .locals 2

    .line 178
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Webview loading URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 179
    invoke-super {p0, p1, p2, p3}, Landroid/webkit/WebViewClient;->onPageStarted(Landroid/webkit/WebView;Ljava/lang/String;Landroid/graphics/Bitmap;)V

    .line 180
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-static {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->access$300(Lcom/myfitnesspal/android/sdk/MfpDialog;)Landroid/app/ProgressDialog;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/ProgressDialog;->show()V

    .line 181
    return-void
.end method

.method public onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 170
    invoke-super {p0, p1, p2, p3, p4}, Landroid/webkit/WebViewClient;->onReceivedError(Landroid/webkit/WebView;ILjava/lang/String;Ljava/lang/String;)V

    .line 171
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-static {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->access$000(Lcom/myfitnesspal/android/sdk/MfpDialog;)Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    move-result-object v0

    new-instance v1, Lcom/myfitnesspal/android/sdk/MfpWebError;

    invoke-direct {v1, p3, p2, p4}, Lcom/myfitnesspal/android/sdk/MfpWebError;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/myfitnesspal/android/sdk/MfpAuthListener;->onError(Lcom/myfitnesspal/android/sdk/MfpWebError;)V

    .line 172
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-virtual {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->dismiss()V

    .line 173
    return-void
.end method

.method public shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 6

    .line 134
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Redirect URL: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v1}, Lcom/myfitnesspal/shared/utils/Ln;->d(Ljava/lang/Object;[Ljava/lang/Object;)I

    .line 135
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-static {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->access$200(Lcom/myfitnesspal/android/sdk/MfpDialog;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 137
    invoke-static {p2}, Lcom/myfitnesspal/shared/utils/UriUtils;->getQueryParams(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    .line 138
    const-string v0, "error"

    invoke-virtual {v4, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 140
    if-nez v5, :cond_0

    .line 142
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-static {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->access$000(Lcom/myfitnesspal/android/sdk/MfpDialog;)Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/myfitnesspal/android/sdk/MfpAuthListener;->onComplete(Landroid/os/Bundle;)V

    goto :goto_0

    .line 144
    :cond_0
    const-string v0, "access_denied"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "OAuthAccessDeniedException"

    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 146
    :cond_1
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-static {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->access$000(Lcom/myfitnesspal/android/sdk/MfpDialog;)Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    move-result-object v0

    invoke-interface {v0, v4}, Lcom/myfitnesspal/android/sdk/MfpAuthListener;->onCancel(Landroid/os/Bundle;)V

    goto :goto_0

    .line 150
    :cond_2
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-static {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->access$000(Lcom/myfitnesspal/android/sdk/MfpDialog;)Lcom/myfitnesspal/android/sdk/MfpAuthListener;

    move-result-object v0

    new-instance v1, Lcom/myfitnesspal/android/sdk/MfpAuthError;

    invoke-direct {v1, v5}, Lcom/myfitnesspal/android/sdk/MfpAuthError;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lcom/myfitnesspal/android/sdk/MfpAuthListener;->onMfpError(Lcom/myfitnesspal/android/sdk/MfpAuthError;)V

    .line 153
    :goto_0
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-virtual {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->dismiss()V

    .line 154
    const/4 v0, 0x1

    return v0

    .line 156
    :cond_3
    const-string v0, "https://www.myfitnesspal.com/oauth2"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 158
    const/4 v0, 0x0

    return v0

    .line 162
    :cond_4
    iget-object v0, p0, Lcom/myfitnesspal/android/sdk/MfpDialog$MfpWebViewClient;->this$0:Lcom/myfitnesspal/android/sdk/MfpDialog;

    invoke-virtual {v0}, Lcom/myfitnesspal/android/sdk/MfpDialog;->getContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 163
    const/4 v0, 0x1

    return v0
.end method
