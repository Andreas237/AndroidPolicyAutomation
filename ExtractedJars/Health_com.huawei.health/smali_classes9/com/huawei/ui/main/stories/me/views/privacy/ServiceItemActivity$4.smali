.class Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;
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

    .line 301
    iput-object p1, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$4;->c:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 305
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "-"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 306
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file:///android_asset/healthUserAgreement/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 307
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".html"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 308
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "file:///android_asset/healthUserAgreement/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    .line 309
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "User_agreementAll = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v4, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 310
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "User_agreement = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 311
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$4;->c:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->a(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_2

    .line 312
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$4;->c:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-static {v0, v4}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->b(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 313
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$4;->c:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->a(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, v5}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 314
    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$4;->c:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-static {v0, v6}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->b(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 315
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$4;->c:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->a(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    goto :goto_0

    .line 317
    :cond_1
    const-string v0, "ServiceItemActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "User_agreement ="

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 318
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity$4;->c:Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;

    invoke-static {v0}, Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;->a(Lcom/huawei/ui/main/stories/me/views/privacy/ServiceItemActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const-string v1, "file:///android_asset/healthUserAgreement/en-US.html"

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 321
    :cond_2
    :goto_0
    return-void
.end method
