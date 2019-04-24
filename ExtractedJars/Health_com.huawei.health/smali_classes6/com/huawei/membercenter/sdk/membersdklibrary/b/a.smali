.class public final Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;,
        Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;,
        Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;
    }
.end annotation


# static fields
.field private static final a:Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 37
    new-instance v0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;

    invoke-direct {v0}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;-><init>()V

    sput-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    return-void
.end method

.method public static a()Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;
    .locals 1

    .line 46
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;->a:Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;

    return-object v0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 355
    const/4 v4, 0x0

    .line 357
    new-instance v5, Landroid/app/AlertDialog$Builder;

    invoke-direct {v5, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 358
    const-string v0, "string"

    const-string v1, "membersdk_update_tip"

    invoke-static {p1, v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "string"

    .line 359
    invoke-static {p1, v2, p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    .line 358
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "string"

    const-string v2, "membersdk_download_file_download"

    .line 360
    invoke-static {p1, v1, v2}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;

    invoke-direct {v2, p1, p2}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 359
    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 363
    const-string v0, "string"

    const-string v1, "membersdk_download_file_download_cancel"

    invoke-static {p1, v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/e;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;

    const-string v2, ""

    invoke-direct {v1, p1, v2}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-virtual {v5, v0, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 367
    invoke-virtual {v5}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v4

    .line 368
    invoke-virtual {v4}, Landroid/app/Dialog;->show()V

    .line 369
    return-void
.end method

.method private a(Landroid/content/Context;Ljava/lang/Object;Landroid/os/Bundle;)Z
    .locals 2

    .line 300
    if-nez p1, :cond_0

    .line 301
    const-string v0, "MemberServiceManager"

    const-string v1, "[isParamInvalid] context is NULL, return."

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 302
    const/4 v0, 0x1

    return v0

    .line 304
    :cond_0
    if-nez p2, :cond_1

    .line 305
    const-string v0, "MemberServiceManager"

    const-string v1, "[isParamInvalid] callback is NULL, return."

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 306
    const/4 v0, 0x1

    return v0

    .line 308
    :cond_1
    if-nez p3, :cond_2

    .line 309
    const-string v0, "MemberServiceManager"

    const-string v1, "[isParamInvalid] bundle is NULL, return."

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 310
    const/4 v0, 0x1

    return v0

    .line 312
    :cond_2
    const-string v0, "userID"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "st"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "deviceType"

    .line 313
    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "deviceID"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 314
    :cond_3
    const-string v0, "MemberServiceManager"

    const-string v1, "[paramInvalid] bundle without the required parameters(userID?st?deviceType?deviceID?), but we continue to execute."

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 317
    :cond_4
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 4

    .line 326
    if-nez p1, :cond_0

    .line 327
    const-string v0, "MemberServiceManager"

    const-string v1, "[enterPhoneServiceApk] context is NULL, return."

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    return-void

    .line 330
    :cond_0
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 331
    const-string v0, "com.huawei.phoneservice"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 332
    const-string v0, "com.huawei.phoneservice.action.ENTER_MEMBER"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 333
    const/high16 v0, 0x4000000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 335
    :try_start_0
    invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 344
    goto :goto_0

    .line 336
    :catch_0
    move-exception v3

    .line 337
    const-string v0, "MemberServiceManager"

    const-string v1, "phoneservice is not exist"

    invoke-static {v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/d;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 343
    const-string v0, "http://huiyuan.dbankcloud.com/VIP/HwPhoneService.apk"

    const-string v1, "membersdk_oem_name"

    invoke-direct {p0, p1, v0, v1}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 345
    :goto_0
    return-void
.end method

.method public a(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;)V
    .locals 2

    .line 140
    invoke-direct {p0, p2, p3, p1}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;->a(Landroid/content/Context;Ljava/lang/Object;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 141
    return-void

    .line 143
    :cond_0
    new-instance v1, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;

    invoke-direct {v1, p2, p1, p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$a;-><init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IActiveMemberCallback;)V

    .line 144
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/g;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 145
    return-void
.end method

.method public a(Landroid/os/Bundle;Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;)V
    .locals 2

    .line 58
    invoke-direct {p0, p2, p3, p1}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a;->a(Landroid/content/Context;Ljava/lang/Object;Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 59
    return-void

    .line 61
    :cond_0
    new-instance v1, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;

    invoke-direct {v1, p2, p1, p3}, Lcom/huawei/membercenter/sdk/membersdklibrary/b/a$c;-><init>(Landroid/content/Context;Landroid/os/Bundle;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;)V

    .line 62
    sget-object v0, Lcom/huawei/membercenter/sdk/membersdklibrary/a/d/g;->a:Ljava/util/concurrent/ThreadPoolExecutor;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 63
    return-void
.end method
