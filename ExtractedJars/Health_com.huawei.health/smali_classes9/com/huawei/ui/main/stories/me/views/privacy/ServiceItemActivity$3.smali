.class Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$3;
.super Landroid/webkit/WebViewClient;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;


# direct methods
.method constructor <init>(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$3;->c:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V
    .locals 2

    .line 205
    invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V

    .line 206
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$3;->c:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->c(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 207
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$3;->c:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->d(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 208
    return-void
.end method
