.class public Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method private e()V
    .locals 1

    .line 34
    invoke-static {}, Lo/bmo;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 37
    invoke-static {p0}, Lo/bmo;->d(Landroid/app/Activity;)V

    .line 39
    :cond_0
    return-void
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 22
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 24
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->requestWindowFeature(I)Z

    .line 25
    invoke-direct {p0}, Lcom/huawei/health/sns/ui/qrcode/TranslucentActivity;->e()V

    .line 26
    return-void
.end method
