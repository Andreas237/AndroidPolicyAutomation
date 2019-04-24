.class Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)V
    .locals 1

    .line 143
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 144
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$a;->e:Ljava/lang/ref/WeakReference;

    .line 145
    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .line 150
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$a;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;

    .line 151
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 153
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyRunnable run() activity null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 154
    return-void

    .line 156
    :cond_0
    const-string v0, "PrivacyActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MyRunnable run()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 157
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setBackgroundColor(I)V

    .line 158
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->b(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/webkit/WebView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v5

    .line 159
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 160
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setCacheMode(I)V

    .line 161
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Landroid/webkit/WebSettings;->setSavePassword(Z)V

    .line 163
    new-instance v6, Lo/fgm;

    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->a(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/os/Handler;

    move-result-object v0

    const-string v1, ""

    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->d(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)I

    move-result v2

    invoke-direct {v6, v4, v0, v1, v2}, Lo/fgm;-><init>(Landroid/content/Context;Landroid/os/Handler;Ljava/lang/String;I)V

    .line 164
    invoke-virtual {v6}, Lo/fgm;->a()V

    .line 165
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->c(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$c;

    invoke-direct {v1, v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$c;-><init>(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 166
    invoke-static {v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;->e(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$d;

    invoke-direct {v1, v4}, Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity$d;-><init>(Lcom/huawei/ui/main/stories/me/activity/PrivacyActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 167
    return-void
.end method
