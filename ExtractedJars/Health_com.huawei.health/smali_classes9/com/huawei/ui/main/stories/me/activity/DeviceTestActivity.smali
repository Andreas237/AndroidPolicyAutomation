.class public Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;
.super Lcom/huawei/ui/commonui/base/BaseActivity;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# static fields
.field private static e:[Ljava/lang/String;


# instance fields
.field private a:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/RelativeLayout;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 26
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "android.permission.READ_EXTERNAL_STORAGE"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "android.permission.WRITE_EXTERNAL_STORAGE"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sput-object v0, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->e:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/huawei/ui/commonui/base/BaseActivity;-><init>()V

    return-void
.end method

.method private b(Landroid/app/Activity;)V
    .locals 5

    .line 34
    const-string v0, "android.permission.READ_EXTERNAL_STORAGE"

    :try_start_0
    invoke-static {p1, v0}, Landroid/support/v4/app/ActivityCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v4

    .line 36
    if-eqz v4, :cond_0

    .line 38
    const-string v0, "DeviceTestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "verifyStoragePermissions apply READ_EXTERNAL_STORAGE permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    sget-object v0, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->e:[Ljava/lang/String;

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Landroid/support/v4/app/ActivityCompat;->requestPermissions(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_0

    .line 41
    :cond_0
    const-string v0, "DeviceTestActivity"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "verifyStoragePermissions already have READ_EXTERNAL_STORAGE permission"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :goto_0
    goto :goto_1

    .line 44
    :catch_0
    move-exception v4

    .line 45
    const-string v0, "DeviceTestActivity"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "verifyStoragePermissions e.getMessage = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 47
    :goto_1
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 5

    .line 77
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/ui/commonui/base/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 78
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 79
    const/4 v0, -0x1

    if-ne p2, v0, :cond_2

    .line 80
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v2

    .line 81
    const-string v3, ""

    .line 82
    const-string v0, "file"

    invoke-virtual {v2}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 83
    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v3

    .line 85
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-le v0, v1, :cond_1

    .line 86
    invoke-static {}, Lo/fgf;->e()Lo/fgf;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lo/fgf;->e(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    .line 88
    :cond_1
    invoke-virtual {p3}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 89
    invoke-static {}, Lo/fgf;->e()Lo/fgf;

    move-result-object v0

    invoke-virtual {p0}, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lo/fgf;->b(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v3

    .line 91
    :goto_0
    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".zip"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 93
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 94
    const-string v0, "com.huawei.health"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 95
    const-string v0, "com.huawei.health"

    const-string v1, "com.huawei.health.device.ui.DeviceMainActivity"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 97
    const-string v0, "kind"

    const-string v1, "HDK_UNKNOWN"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    const-string v0, "view"

    const-string v1, "ListDevice"

    invoke-virtual {v4, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    const-string v0, "ZipPath"

    invoke-virtual {v4, v0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 100
    invoke-virtual {p0, v4}, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->startActivity(Landroid/content/Intent;)V

    .line 105
    :cond_2
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 65
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->a:Landroid/widget/RelativeLayout;

    if-ne p1, v0, :cond_0

    .line 66
    new-instance v1, Landroid/content/Intent;

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 67
    const-string v0, "*/*"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 68
    const-string v0, "android.intent.category.OPENABLE"

    invoke-virtual {v1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 69
    const/4 v0, 0x0

    invoke-virtual {p0, v1, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 70
    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->c:Landroid/widget/RelativeLayout;

    .line 73
    :goto_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    .line 51
    invoke-super {p0, p1}, Lcom/huawei/ui/commonui/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 52
    sget v0, Lcom/huawei/ui/main/R$layout;->activity_device_test:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->setContentView(I)V

    .line 54
    sget v0, Lcom/huawei/ui/main/R$id;->device_test_device_in:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->a:Landroid/widget/RelativeLayout;

    .line 55
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    sget v0, Lcom/huawei/ui/main/R$id;->device_test_device_service:I

    invoke-virtual {p0, v0}, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->c:Landroid/widget/RelativeLayout;

    .line 58
    iget-object v0, p0, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 60
    invoke-direct {p0, p0}, Lcom/huawei/ui/main/stories/me/activity/DeviceTestActivity;->b(Landroid/app/Activity;)V

    .line 61
    return-void
.end method
