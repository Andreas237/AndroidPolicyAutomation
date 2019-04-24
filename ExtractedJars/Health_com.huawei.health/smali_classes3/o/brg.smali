.class public Lo/brg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static b:I

.field private static d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 22
    const/4 v0, -0x1

    sput v0, Lo/brg;->b:I

    .line 27
    const-string v0, ""

    sput-object v0, Lo/brg;->d:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Z
    .locals 2

    .line 56
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x13

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static b()Z
    .locals 2

    .line 36
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static c()Z
    .locals 2

    .line 66
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static d()I
    .locals 1

    .line 75
    sget v0, Lo/brg;->b:I

    if-lez v0, :cond_0

    .line 77
    sget v0, Lo/brg;->b:I

    return v0

    .line 80
    :cond_0
    invoke-static {}, Lo/brg;->g()V

    .line 82
    sget v0, Lo/brg;->b:I

    return v0
.end method

.method public static e()Z
    .locals 2

    .line 46
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xc

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static g()V
    .locals 5

    .line 106
    invoke-static {}, Lo/aoa;->e()Landroid/content/Context;

    move-result-object v2

    .line 107
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 110
    :try_start_0
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v3, v0, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v4

    .line 111
    if-eqz v4, :cond_0

    .line 114
    const v0, 0x138ddc0

    sput v0, Lo/brg;->b:I

    .line 115
    iget-object v0, v4, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    sput-object v0, Lo/brg;->d:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 122
    :cond_0
    goto :goto_0

    .line 118
    :catch_0
    move-exception v4

    .line 120
    const/4 v0, -0x1

    sput v0, Lo/brg;->b:I

    .line 121
    const-string v0, ""

    sput-object v0, Lo/brg;->d:Ljava/lang/String;

    .line 123
    :goto_0
    return-void
.end method

.method public static i()Ljava/lang/String;
    .locals 1

    .line 91
    sget-object v0, Lo/brg;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 93
    sget-object v0, Lo/brg;->d:Ljava/lang/String;

    return-object v0

    .line 96
    :cond_0
    invoke-static {}, Lo/brg;->g()V

    .line 98
    sget-object v0, Lo/brg;->d:Ljava/lang/String;

    return-object v0
.end method
