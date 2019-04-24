.class public Lcom/huawei/hwid/core/d/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 20
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/huawei/hwid/core/d/l;->a:Z

    return-void
.end method

.method public static a(Landroid/content/Context;)I
    .locals 3

    .line 89
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 90
    const-string v0, "UIUtil"

    const-string v1, "getDialogThemeId, context is null"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    const/4 v0, 0x3

    return v0

    .line 93
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/l;->b(Landroid/content/Context;)I

    move-result v2

    .line 94
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    if-eqz v2, :cond_1

    .line 95
    const/4 v0, 0x0

    return v0

    .line 97
    :cond_1
    const/4 v0, 0x3

    return v0
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/AlertDialog$Builder;
    .locals 7

    .line 140
    const/4 v3, 0x0

    .line 141
    const-string v0, "UIUtil"

    const-string v1, "createRefusePermissionBuild"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-static {p0}, Lcom/huawei/hwid/core/d/l;->a(Landroid/content/Context;)I

    move-result v0

    invoke-direct {v3, p0, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;I)V

    .line 144
    const-string v0, "cloudsetting_refuse_permission_dialog"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->d(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    const/4 v1, 0x0

    invoke-static {p0, v0, v1}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 145
    const-string v0, "text1"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/widget/TextView;

    .line 146
    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 148
    const-string v0, "text2"

    invoke-static {p0, v0}, Lcom/huawei/hwid/core/d/i;->e(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 149
    invoke-virtual {v6, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 151
    invoke-virtual {v3, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const-string v1, "CS_go_settings"

    .line 152
    invoke-static {p0, v1}, Lcom/huawei/hwid/core/d/i;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/huawei/hwid/core/d/l$1;

    invoke-direct {v2, p0}, Lcom/huawei/hwid/core/d/l$1;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    .line 157
    const/high16 v1, 0x1040000

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 158
    return-object v3
.end method

.method public static a(Landroid/content/Context;I)V
    .locals 2

    .line 137
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lcom/huawei/hwid/core/d/l;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 138
    return-void
.end method

.method public static a(Landroid/content/Context;Ljava/lang/String;I)V
    .locals 2

    .line 71
    invoke-static {}, Lcom/huawei/hwid/core/d/b;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 72
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 74
    :cond_0
    invoke-static {p0}, Lcom/huawei/hwid/core/d/l;->b(Landroid/content/Context;)I

    move-result v1

    .line 75
    const/4 v0, 0x0

    if-eq v0, v1, :cond_1

    .line 76
    invoke-virtual {p0, v1}, Landroid/content/Context;->setTheme(I)V

    .line 78
    :cond_1
    invoke-static {p0, p1, p2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 80
    :goto_0
    return-void
.end method

.method public static b(Landroid/content/Context;)I
    .locals 5

    .line 104
    const/4 v4, 0x0

    .line 105
    invoke-static {}, Lcom/huawei/hwid/core/d/d;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "androidhwext:style/Theme.Emui.Dark"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    goto :goto_0

    .line 108
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const-string v1, "androidhwext:style/Theme.Emui"

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 111
    :goto_0
    return v4
.end method

.method public static c(Landroid/content/Context;)V
    .locals 5

    .line 121
    if-nez p0, :cond_0

    .line 122
    return-void

    .line 125
    :cond_0
    :try_start_0
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 126
    const-string v0, "package"

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 127
    invoke-virtual {v3, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 128
    invoke-virtual {p0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 131
    goto :goto_0

    .line 129
    :catch_0
    move-exception v3

    .line 130
    const-string v0, "UIUtil"

    const-string v1, "Exception"

    invoke-static {v0, v1}, Lcom/huawei/hwid/core/d/b/e;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 132
    :goto_0
    return-void
.end method
