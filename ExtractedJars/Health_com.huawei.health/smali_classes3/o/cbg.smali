.class public Lo/cbg;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final e:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 57
    const/16 v0, 0x13

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "com.tencent.qqpimsecure"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v1, "com.qihoo360.mobilesafe"

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "com.mpoyit.zawcgm"

    const/4 v2, 0x2

    aput-object v1, v0, v2

    const-string v1, "com.zxly.assist"

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const-string v1, "com.anguanjia.safe"

    const/4 v2, 0x4

    aput-object v1, v0, v2

    const-string v1, "com.fractalist.SystemOptimizer"

    const/4 v2, 0x5

    aput-object v1, v0, v2

    const-string v1, "com.tencent.qlauncher.lite"

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const-string v1, "com.baoruan.launcher2"

    const/4 v2, 0x7

    aput-object v1, v0, v2

    const-string v1, "com.hola.launcher"

    const/16 v2, 0x8

    aput-object v1, v0, v2

    const-string v1, "com.dianxinos.dxhome"

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "com.nd.android.pandahome2"

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "com.mili.launcher"

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "com.tencent.launcher"

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "com.Dean.launcher"

    const/16 v2, 0xd

    aput-object v1, v0, v2

    const-string v1, "com.gau.go.launcherex"

    const/16 v2, 0xe

    aput-object v1, v0, v2

    const-string v1, "com.cleanmaster.mguard_cn"

    const/16 v2, 0xf

    aput-object v1, v0, v2

    const-string v1, "com.isyezon.kbatterydoctor"

    const/16 v2, 0x10

    aput-object v1, v0, v2

    const-string v1, "com.mdhlkj.batterysaver"

    const/16 v2, 0x11

    aput-object v1, v0, v2

    const-string v1, "com.ijinshan.kbatterydoctor"

    const/16 v2, 0x12

    aput-object v1, v0, v2

    sput-object v0, Lo/cbg;->e:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;)Z
    .locals 11

    .line 20
    const/4 v0, 0x0

    if-ne v0, p0, :cond_0

    .line 21
    const-string v0, "Step_ThirdMobileMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasThirdMobileMgr context is null,hasThirdMobileMgr return false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    const/4 v0, 0x0

    return v0

    .line 24
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 25
    const/4 v0, 0x0

    if-ne v0, v4, :cond_1

    .line 26
    const-string v0, "Step_ThirdMobileMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "PackageManager is null,hasThirdMobileMgr return false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 27
    const/4 v0, 0x0

    return v0

    .line 31
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v5

    .line 32
    const/4 v0, 0x0

    if-eq v0, v5, :cond_2

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v0

    if-gtz v0, :cond_3

    .line 33
    :cond_2
    const-string v0, "Step_ThirdMobileMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Not get applicationInfos,hasThirdMobileMgr return false"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 34
    const/4 v0, 0x0

    return v0

    .line 36
    :cond_3
    const/4 v6, 0x0

    .line 37
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Landroid/content/pm/ApplicationInfo;

    .line 38
    iget-object v9, v8, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    .line 39
    const/4 v0, 0x0

    if-ne v0, v9, :cond_4

    .line 40
    goto :goto_0

    .line 43
    :cond_4
    const/4 v10, 0x0

    :goto_1
    sget-object v0, Lo/cbg;->e:[Ljava/lang/String;

    array-length v0, v0

    if-ge v10, v0, :cond_6

    .line 44
    sget-object v0, Lo/cbg;->e:[Ljava/lang/String;

    aget-object v0, v0, v10

    invoke-virtual {v9, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 45
    const/4 v6, 0x1

    .line 46
    const-string v0, "Step_ThirdMobileMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "package : "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sget-object v3, Lo/cbg;->e:[Ljava/lang/String;

    aget-object v3, v3, v10

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 43
    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 49
    :cond_6
    goto :goto_0

    .line 50
    :cond_7
    const-string v0, "Step_ThirdMobileMgr"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "hasThirdMobileMgr return :"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 51
    return v6
.end method
