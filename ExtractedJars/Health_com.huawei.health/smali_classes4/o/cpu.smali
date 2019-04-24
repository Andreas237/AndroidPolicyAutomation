.class public Lo/cpu;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cpu$a;
    }
.end annotation


# static fields
.field private static c:Landroid/content/Context;


# instance fields
.field private d:Lo/coc;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    sget-object v0, Lo/cpu;->c:Landroid/content/Context;

    invoke-static {v0}, Lo/coc;->a(Landroid/content/Context;)Lo/coc;

    move-result-object v0

    iput-object v0, p0, Lo/cpu;->d:Lo/coc;

    .line 32
    return-void
.end method

.method synthetic constructor <init>(Lo/cpu$5;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/cpu;-><init>()V

    return-void
.end method

.method public static b(Landroid/content/Context;)Lo/cpu;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 42
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cpu;->c:Landroid/content/Context;

    .line 43
    sget-object v0, Lo/cpu$a;->d:Lo/cpu;

    return-object v0
.end method

.method private c()Ljava/lang/String;
    .locals 1

    .line 82
    const-string v0, "package_name =? "

    return-object v0
.end method

.method private d(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 86
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;)I
    .locals 7

    .line 72
    const-string v0, "Debug_AppInfoManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAppId() packageName is "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p1, v1, v2

    const-string v2, " current mContext packageName is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    sget-object v2, Lo/cpu;->c:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 73
    invoke-static {p1}, Lo/cne;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 74
    const-string v0, "Debug_AppInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "getAppId() packageName is null or empty!"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 75
    const/4 v0, 0x0

    return v0

    .line 77
    :cond_0
    iget-object v0, p0, Lo/cpu;->d:Lo/coc;

    invoke-direct {p0}, Lo/cpu;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lo/cpu;->d(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coc;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 78
    const-string v0, "_id"

    invoke-static {v6, v0}, Lo/cph;->g(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public b(Lcom/huawei/hihealth/HiAppInfo;I)J
    .locals 5

    .line 48
    const-string v0, "Debug_AppInfoManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertAppInfoData()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 49
    invoke-static {p1, p2}, Lo/cpi;->d(Lcom/huawei/hihealth/HiAppInfo;I)Landroid/content/ContentValues;

    move-result-object v4

    .line 50
    iget-object v0, p0, Lo/cpu;->d:Lo/coc;

    invoke-virtual {v0, v4}, Lo/coc;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public c(Lcom/huawei/hihealth/HiAppInfo;)I
    .locals 4

    .line 67
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/cpi;->d(Lcom/huawei/hihealth/HiAppInfo;I)Landroid/content/ContentValues;

    move-result-object v3

    .line 68
    iget-object v0, p0, Lo/cpu;->d:Lo/coc;

    invoke-direct {p0}, Lo/cpu;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/huawei/hihealth/HiAppInfo;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lo/cpu;->d(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v1, v2}, Lo/coc;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public c(I)Lcom/huawei/hihealth/HiAppInfo;
    .locals 7

    .line 62
    iget-object v0, p0, Lo/cpu;->d:Lo/coc;

    const-string v1, "_id =? "

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/coc;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 63
    invoke-static {v6}, Lo/cph;->p(Landroid/database/Cursor;)Lcom/huawei/hihealth/HiAppInfo;

    move-result-object v0

    return-object v0
.end method
