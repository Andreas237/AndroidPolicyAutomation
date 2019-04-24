.class Lcom/tencent/open/yyb/AppbarActivity$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/tauth/IUiListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/tencent/open/yyb/AppbarActivity;->shareToQzone()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/tencent/connect/auth/QQToken;

.field final synthetic b:Lcom/tencent/open/yyb/AppbarActivity;


# direct methods
.method constructor <init>(Lcom/tencent/open/yyb/AppbarActivity;Lcom/tencent/connect/auth/QQToken;)V
    .locals 0

    .line 576
    iput-object p1, p0, Lcom/tencent/open/yyb/AppbarActivity$3;->b:Lcom/tencent/open/yyb/AppbarActivity;

    iput-object p2, p0, Lcom/tencent/open/yyb/AppbarActivity$3;->a:Lcom/tencent/connect/auth/QQToken;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 2

    .line 593
    const-string v0, "openSDK_LOG"

    const-string v1, "-->(AppbarActivity)shareToQzone onCancel"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 594
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$3;->b:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-static {v0}, Lcom/tencent/open/yyb/AppbarActivity;->access$400(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/yyb/AppbarJsBridge;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseShareFail(I)V

    .line 595
    return-void
.end method

.method public onComplete(Ljava/lang/Object;)V
    .locals 3

    .line 586
    const-string v0, "openSDK_LOG"

    const-string v1, "-->(AppbarActivity)shareToQzone onComplete"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 587
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$3;->b:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-static {v0}, Lcom/tencent/open/yyb/AppbarActivity;->access$400(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/yyb/AppbarJsBridge;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseShare(I)V

    .line 588
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$3;->a:Lcom/tencent/connect/auth/QQToken;

    invoke-virtual {v0}, Lcom/tencent/connect/auth/QQToken;->getAppId()Ljava/lang/String;

    move-result-object v0

    const-string v1, "400"

    const-string v2, "SDK.APPBAR.HOME.SHARE.QZ"

    invoke-static {v0, v1, v2}, Lcom/tencent/open/yyb/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 589
    return-void
.end method

.method public onError(Lcom/tencent/tauth/UiError;)V
    .locals 2

    .line 580
    const-string v0, "openSDK_LOG"

    const-string v1, "-->(AppbarActivity)shareToQzone onError"

    invoke-static {v0, v1}, Lcom/tencent/open/a/f;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 581
    iget-object v0, p0, Lcom/tencent/open/yyb/AppbarActivity$3;->b:Lcom/tencent/open/yyb/AppbarActivity;

    invoke-static {v0}, Lcom/tencent/open/yyb/AppbarActivity;->access$400(Lcom/tencent/open/yyb/AppbarActivity;)Lcom/tencent/open/yyb/AppbarJsBridge;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/tencent/open/yyb/AppbarJsBridge;->responseShareFail(I)V

    .line 582
    return-void
.end method
