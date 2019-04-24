.class public final Lcom/huawei/pay/ui/PermissionsActivity;
.super Lcom/huawei/pay/ui/baseactivity/BaseActivity;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/pay/ui/PermissionsActivity$PermissionsActivitySAI6;,
        Lcom/huawei/pay/ui/PermissionsActivity$PermissionsActivitySAI5;,
        Lcom/huawei/pay/ui/PermissionsActivity$PermissionsActivitySAI4;,
        Lcom/huawei/pay/ui/PermissionsActivity$PermissionsActivitySAI3;,
        Lcom/huawei/pay/ui/PermissionsActivity$PermissionsActivitySAI2;,
        Lcom/huawei/pay/ui/PermissionsActivity$PermissionsActivitySAI1;
    }
.end annotation


# static fields
.field public static final EXTRA_PERMISSION_REQUESTED_PERMISSIONS:Ljava/lang/String; = "requested_permissions"

.field public static final EXTRA_PERMISSION_REQUEST_CODE:Ljava/lang/String; = "request_code"

.field private static final INVALID_REQUEST_CODE:I = -0x1

.field public static final PERMISSION_CACHE_NAME:Ljava/lang/String; = "permission_requested_cache"


# instance fields
.field private mPendingRequestCode:I

.field private sp:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 54
    invoke-direct {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;-><init>()V

    .line 67
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/pay/ui/PermissionsActivity;->mPendingRequestCode:I

    return-void
.end method

.method private isHaveFirstRequestPermission([Ljava/lang/String;)Z
    .locals 5

    .line 175
    move-object v1, p1

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_1

    aget-object v4, v1, v3

    .line 177
    invoke-direct {p0, v4}, Lcom/huawei/pay/ui/PermissionsActivity;->isPermissionCached(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 179
    const/4 v0, 0x1

    return v0

    .line 175
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 183
    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private isPermissionCached(Ljava/lang/String;)Z
    .locals 2

    .line 98
    iget-object v0, p0, Lcom/huawei/pay/ui/PermissionsActivity;->sp:Landroid/content/SharedPreferences;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static varargs run(Landroid/content/Context;I[Ljava/lang/String;)V
    .locals 3

    .line 111
    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/huawei/pay/ui/PermissionsActivity;

    invoke-direct {v2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 112
    const-string v0, "requested_permissions"

    invoke-virtual {v2, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    const-string v0, "request_code"

    invoke-virtual {v2, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 114
    const/high16 v0, 0x10800000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 115
    invoke-virtual {p0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 116
    return-void
.end method

.method private setPermissionCache([Ljava/lang/String;Ljava/lang/Boolean;)V
    .locals 6

    .line 83
    move-object v2, p1

    array-length v3, v2

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_0

    aget-object v5, v2, v4

    .line 85
    iget-object v0, p0, Lcom/huawei/pay/ui/PermissionsActivity;->sp:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-interface {v0, v5, v1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 83
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 87
    :cond_0
    return-void
.end method

.method private showPermissionDialog(Landroid/app/Activity;I[Ljava/lang/String;)V
    .locals 6

    .line 196
    new-instance v2, Ljava/lang/StringBuilder;

    sget v0, Lcom/huawei/paycommonbase/R$string;->permissions_tips:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/PermissionsActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    const/4 v3, 0x0

    :goto_0
    array-length v0, p3

    if-ge v3, v0, :cond_1

    .line 199
    const-string v0, "\n"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    sget-object v0, Lo/dsy;->b:Ljava/util/HashMap;

    aget-object v1, p3, v3

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/lang/Integer;

    .line 201
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 203
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/PermissionsActivity;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 204
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 207
    .line 208
    :cond_1
    invoke-static {p0}, Lo/yk;->e(Landroid/content/Context;)Lo/yr;

    move-result-object v3

    .line 209
    sget v0, Lcom/huawei/paycommonbase/R$string;->huaweipay_note:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/PermissionsActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lo/yr;->a(Ljava/lang/String;)Lo/yr;

    .line 210
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v3, v0}, Lo/yr;->c(Ljava/lang/String;)Lo/yr;

    .line 211
    sget v0, Lcom/huawei/paycommonbase/R$string;->go_settings:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/PermissionsActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/pay/ui/PermissionsActivity$1;

    invoke-direct {v1, p0, p1, p2}, Lcom/huawei/pay/ui/PermissionsActivity$1;-><init>(Lcom/huawei/pay/ui/PermissionsActivity;Landroid/app/Activity;I)V

    invoke-interface {v3, v0, v1}, Lo/yr;->c(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;

    .line 223
    sget v0, Lcom/huawei/paycommonbase/R$string;->cancel:I

    invoke-virtual {p0, v0}, Lcom/huawei/pay/ui/PermissionsActivity;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/huawei/pay/ui/PermissionsActivity$2;

    invoke-direct {v1, p0, p2}, Lcom/huawei/pay/ui/PermissionsActivity$2;-><init>(Lcom/huawei/pay/ui/PermissionsActivity;I)V

    invoke-interface {v3, v0, v1}, Lo/yr;->a(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lo/yr;

    .line 234
    new-instance v0, Lcom/huawei/pay/ui/PermissionsActivity$3;

    invoke-direct {v0, p0, p2}, Lcom/huawei/pay/ui/PermissionsActivity$3;-><init>(Lcom/huawei/pay/ui/PermissionsActivity;I)V

    invoke-interface {v3, v0}, Lo/yr;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 247
    const/4 v0, 0x0

    invoke-interface {v3, v0}, Lo/yr;->setCanceledOnTouchOutside(Z)V

    .line 248
    invoke-interface {v3}, Lo/yr;->show()V

    .line 249
    return-void
.end method


# virtual methods
.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    .line 307
    invoke-super {p0, p1, p2, p3}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 309
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [I

    invoke-virtual {p0, p1, v0, v1}, Lcom/huawei/pay/ui/PermissionsActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 310
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 121
    invoke-super {p0, p1}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 122
    invoke-static {p0}, Lcom/huawei/wallet/utils/UIUtil;->c(Landroid/app/Activity;)V

    .line 123
    invoke-virtual {p0}, Lcom/huawei/pay/ui/PermissionsActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "permission_requested_cache"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/pay/ui/PermissionsActivity;->sp:Landroid/content/SharedPreferences;

    .line 124
    const-string v0, "permissions check onCreate"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 125
    if-eqz p1, :cond_0

    const-string v0, "request_code"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    iput v0, p0, Lcom/huawei/pay/ui/PermissionsActivity;->mPendingRequestCode:I

    .line 127
    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    .line 315
    const-string v0, " permission activity onRequestPermissionsResult "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->a(Ljava/lang/String;Z)V

    .line 316
    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/pay/ui/PermissionsActivity;->mPendingRequestCode:I

    .line 317
    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lcom/huawei/pay/ui/PermissionsActivity;->setPermissionCache([Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 318
    invoke-virtual {p0}, Lcom/huawei/pay/ui/PermissionsActivity;->finish()V

    .line 319
    invoke-static {}, Lo/dsx;->e()Lo/dsx;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lo/dsx;->e(I[Ljava/lang/String;[I)V

    .line 321
    return-void
.end method

.method public onResume()V
    .locals 5

    .line 139
    invoke-super {p0}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->onResume()V

    .line 141
    iget v0, p0, Lcom/huawei/pay/ui/PermissionsActivity;->mPendingRequestCode:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    .line 143
    invoke-virtual {p0}, Lcom/huawei/pay/ui/PermissionsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 144
    const/4 v3, 0x0

    .line 145
    const/4 v0, 0x0

    if-eq v0, v2, :cond_0

    .line 147
    invoke-virtual {p0}, Lcom/huawei/pay/ui/PermissionsActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object v3

    .line 149
    :cond_0
    const/4 v0, 0x0

    if-eq v0, v3, :cond_2

    .line 151
    const-string v0, "requested_permissions"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getStringArray(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    .line 152
    const-string v0, "request_code"

    invoke-virtual {v3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/huawei/pay/ui/PermissionsActivity;->mPendingRequestCode:I

    .line 154
    invoke-static {p0, v4}, Lo/dsy;->b(Landroid/app/Activity;[Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 155
    invoke-direct {p0, v4}, Lcom/huawei/pay/ui/PermissionsActivity;->isHaveFirstRequestPermission([Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 157
    iget v0, p0, Lcom/huawei/pay/ui/PermissionsActivity;->mPendingRequestCode:I

    invoke-direct {p0, p0, v0, v4}, Lcom/huawei/pay/ui/PermissionsActivity;->showPermissionDialog(Landroid/app/Activity;I[Ljava/lang/String;)V

    goto :goto_0

    .line 161
    :cond_1
    iget v0, p0, Lcom/huawei/pay/ui/PermissionsActivity;->mPendingRequestCode:I

    invoke-static {p0, v0, v4}, Lo/dsy;->a(Landroid/app/Activity;I[Ljava/lang/String;)V

    .line 165
    :cond_2
    :goto_0
    return-void
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .line 132
    invoke-super {p0, p1}, Lcom/huawei/pay/ui/baseactivity/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 133
    const-string v0, "request_code"

    iget v1, p0, Lcom/huawei/pay/ui/PermissionsActivity;->mPendingRequestCode:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 134
    return-void
.end method

.method public openManangePermissionUI(Landroid/app/Activity;I)V
    .locals 6

    .line 266
    const/4 v0, 0x0

    if-ne v0, p1, :cond_0

    .line 268
    const-string v0, "openManangePermissionUI activity is null "

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dtg;->b(Ljava/lang/String;Z)V

    .line 269
    return-void

    .line 273
    :cond_0
    :try_start_0
    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 274
    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-virtual {v4, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 275
    const-string v0, "package"

    invoke-virtual {p0}, Lcom/huawei/pay/ui/PermissionsActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    .line 276
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 278
    invoke-virtual {p1, v4, p2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1

    .line 301
    goto :goto_0

    .line 280
    :catch_0
    move-exception v4

    .line 284
    const-string v0, "start action android.intent.action.MANAGE_APP_PERMISSIONS ActivityNotFoundException error"

    const-string v1, "PermissionsActivity.openManangePermissionUI"

    .line 286
    invoke-virtual {v4}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 284
    const v2, 0x36118617

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lo/dtg;->e(Ljava/lang/String;ILjava/util/Map;Z)V

    .line 289
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [I

    invoke-virtual {p0, p2, v0, v1}, Lcom/huawei/pay/ui/PermissionsActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 301
    goto :goto_0

    .line 291
    :catch_1
    move-exception v4

    .line 295
    const-string v0, "start action android.intent.action.MANAGE_APP_PERMISSIONS java.lang.SecurityException==Permission Denial error"

    const-string v1, "PermissionsActivity.openManangePermissionUI"

    .line 297
    invoke-virtual {v4}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/huawei/wallet/utils/log/LogErrorConstant;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v1

    .line 295
    const v2, 0x36118618

    const/4 v3, 0x0

    invoke-static {v0, v2, v1, v3}, Lo/dtg;->e(Ljava/lang/String;ILjava/util/Map;Z)V

    .line 300
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    new-array v1, v1, [I

    invoke-virtual {p0, p2, v0, v1}, Lcom/huawei/pay/ui/PermissionsActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 302
    :goto_0
    return-void
.end method
