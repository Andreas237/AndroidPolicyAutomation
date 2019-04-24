.class public Lo/dcj;
.super Lo/cwz;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dcj$c;
    }
.end annotation


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 21
    invoke-direct {p0, p1}, Lo/cwz;-><init>(Landroid/content/Context;)V

    .line 23
    return-void
.end method

.method synthetic constructor <init>(Landroid/content/Context;Lo/dcj$5;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Lo/dcj;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static a()Lo/dcj;
    .locals 1

    .line 33
    sget-object v0, Lo/dcj$c;->e:Lo/dcj;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;ILandroid/content/ContentValues;)J
    .locals 6

    .line 51
    const-string v0, "SleepServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter insert():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 52
    invoke-virtual {p0, p1, p2, p3}, Lo/dcj;->insertStorageData(Ljava/lang/String;ILandroid/content/ContentValues;)J

    move-result-wide v4

    .line 53
    const-string v0, "SleepServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "insert() result = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 54
    return-wide v4
.end method

.method public d(Ljava/lang/String;ILjava/lang/String;)V
    .locals 4

    .line 43
    const-string v0, "SleepServiceMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "enter create():"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 44
    invoke-virtual {p0, p1, p2, p3}, Lo/dcj;->createStorageDataTable(Ljava/lang/String;ILjava/lang/String;)I

    .line 45
    return-void
.end method

.method protected getModuleId()Ljava/lang/Integer;
    .locals 1

    .line 39
    const/16 v0, 0x272e

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method protected onDestroy()V
    .locals 0

    .line 86
    invoke-super {p0}, Lo/cwz;->onDestroy()V

    .line 87
    return-void
.end method
