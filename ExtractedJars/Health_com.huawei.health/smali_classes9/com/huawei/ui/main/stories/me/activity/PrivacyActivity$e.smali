.class Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$e;
.super Lo/dbb;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo/dbb<Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)V
    .locals 0

    .line 228
    invoke-direct {p0, p1}, Lo/dbb;-><init>(Ljava/lang/Object;)V

    .line 229
    return-void
.end method


# virtual methods
.method public c(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;Landroid/os/Message;)V
    .locals 5

    .line 234
    iget v4, p2, Landroid/os/Message;->arg1:I

    .line 235
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PrivacyActivityHandler handleMessage() resultType : "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 237
    iget v0, p2, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 240
    :sswitch_0
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->f(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 241
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->g(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 242
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 243
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->i(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 244
    goto :goto_0

    .line 246
    :sswitch_1
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->f(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 247
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->g(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/graphics/drawable/AnimationDrawable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/drawable/AnimationDrawable;->stop()V

    .line 248
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->i(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 249
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 250
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 252
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setAllowFileAccessFromFileURLs(Z)V

    .line 253
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 254
    invoke-static {p1}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/webkit/WebView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file:///"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p2, Landroid/os/Message;->obj:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 256
    .line 260
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x89787 -> :sswitch_1
        0x89789 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic handleMessageWhenReferenceNotNull(Ljava/lang/Object;Landroid/os/Message;)V
    .locals 1

    .line 223
    move-object v0, p1

    check-cast v0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;

    invoke-virtual {p0, v0, p2}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$e;->c(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;Landroid/os/Message;)V

    return-void
.end method
