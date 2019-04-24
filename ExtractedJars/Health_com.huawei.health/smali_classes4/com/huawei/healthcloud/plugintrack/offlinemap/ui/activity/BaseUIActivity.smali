.class public abstract Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity$e;
    }
.end annotation


# instance fields
.field private b:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity$e;

.field private c:Ljava/lang/String;

.field private d:Landroid/content/Context;

.field private e:Landroid/widget/FrameLayout;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    .line 30
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;->b:Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity$e;

    .line 32
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;->e:Landroid/widget/FrameLayout;

    .line 36
    const-class v0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;->c:Ljava/lang/String;

    return-void
.end method

.method private e()V
    .locals 2

    .line 104
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    .line 106
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x2400

    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 109
    :cond_0
    return-void
.end method


# virtual methods
.method protected abstract c()I
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 40
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 41
    iput-object p0, p0, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;->d:Landroid/content/Context;

    .line 46
    invoke-virtual {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;->c()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;->setContentView(I)V

    .line 48
    invoke-direct {p0}, Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseUIActivity;->e()V

    .line 49
    return-void
.end method
