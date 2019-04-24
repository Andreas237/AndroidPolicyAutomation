.class public Lo/bnz;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/bnz$e;
    }
.end annotation


# static fields
.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    const/4 v0, 0x0

    sput-boolean v0, Lo/bnz;->b:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a(Landroid/app/Activity;)V
    .locals 0

    .line 28
    invoke-static {p0}, Lo/bnz;->b(Landroid/app/Activity;)V

    return-void
.end method

.method private static b()V
    .locals 2

    .line 140
    invoke-static {}, Lo/brb;->d()Lo/brb;

    move-result-object v0

    new-instance v1, Lo/bnz$4;

    invoke-direct {v1}, Lo/bnz$4;-><init>()V

    invoke-virtual {v0, v1}, Lo/brb;->c(Lo/brd;)Lo/bqy;

    .line 150
    return-void
.end method

.method private static b(Landroid/app/Activity;)V
    .locals 3

    .line 97
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    :cond_0
    const-string v0, "CheckNotificationsUtils"

    const-string v1, "showTipDialog activity is null or isFinishing."

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 100
    return-void

    .line 103
    :cond_1
    new-instance v0, Lo/bnz$e;

    invoke-direct {v0, p0}, Lo/bnz$e;-><init>(Landroid/content/Context;)V

    new-instance v1, Lo/bnz$1;

    invoke-direct {v1, p0}, Lo/bnz$1;-><init>(Landroid/app/Activity;)V

    new-instance v2, Lo/bnz$3;

    invoke-direct {v2}, Lo/bnz$3;-><init>()V

    invoke-virtual {v0, v1, v2}, Lo/bnz$e;->d(Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)Lo/bnz$e;

    move-result-object v0

    new-instance v1, Lo/bnz$5;

    invoke-direct {v1}, Lo/bnz$5;-><init>()V

    .line 119
    invoke-virtual {v0, v1}, Lo/bnz$e;->b(Landroid/content/DialogInterface$OnDismissListener;)Lo/bnz$e;

    move-result-object v0

    .line 131
    invoke-virtual {v0}, Lo/bnz$e;->show()V

    .line 132
    const/4 v0, 0x1

    sput-boolean v0, Lo/bnz;->b:Z

    .line 133
    return-void
.end method

.method static synthetic b(Landroid/content/Context;)V
    .locals 0

    .line 28
    invoke-static {p0}, Lo/bnz;->c(Landroid/content/Context;)V

    return-void
.end method

.method public static c(Landroid/app/Activity;)V
    .locals 2

    .line 47
    if-nez p0, :cond_0

    .line 49
    const-string v0, "CheckNotificationsUtils"

    const-string v1, "checkNotificationPermission activity is null"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    return-void

    .line 54
    :cond_0
    sget-boolean v0, Lo/bnz;->b:Z

    if-eqz v0, :cond_1

    .line 56
    return-void

    .line 60
    :cond_1
    invoke-static {p0}, Lo/bnz;->e(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 62
    return-void

    .line 66
    :cond_2
    new-instance v0, Lo/bnz$2;

    invoke-direct {v0, p0}, Lo/bnz$2;-><init>(Landroid/app/Activity;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    .line 87
    invoke-virtual {v0, v1}, Lo/bnz$2;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 88
    return-void
.end method

.method private static c(Landroid/content/Context;)V
    .locals 4

    .line 177
    const-string v0, "package:com.huawei.hwid"

    :try_start_0
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 178
    new-instance v3, Landroid/content/Intent;

    const-string v0, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-direct {v3, v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 179
    invoke-virtual {p0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 184
    goto :goto_0

    .line 181
    :catch_0
    move-exception v2

    .line 183
    const-string v0, "CheckNotificationsUtils"

    const-string v1, "open setting page error"

    invoke-static {v0, v1}, Lo/bpf;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    :goto_0
    return-void
.end method

.method static synthetic e()V
    .locals 0

    .line 28
    invoke-static {}, Lo/bnz;->b()V

    return-void
.end method

.method private static e(Landroid/content/Context;)Z
    .locals 2

    .line 160
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-ge v0, v1, :cond_0

    .line 162
    const/4 v0, 0x1

    return v0

    .line 165
    :cond_0
    const/4 v0, 0x1

    return v0
.end method
