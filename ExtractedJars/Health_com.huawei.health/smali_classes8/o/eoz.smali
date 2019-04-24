.class public Lo/eoz;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 30
    const-class v0, Lo/eoz;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lo/eoz;->d:Ljava/lang/String;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lo/eqv;)V
    .locals 0

    .line 134
    if-eqz p0, :cond_0

    .line 135
    invoke-virtual {p0}, Lo/eqv;->d()V

    .line 137
    :cond_0
    return-void
.end method

.method public static b(Landroid/content/Context;)V
    .locals 6

    .line 38
    sget-object v0, Lo/eoz;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Process Cloud Sync by Pullrefresh"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 39
    new-instance v4, Lcom/huawei/hihealth/HiSyncOption;

    invoke-direct {v4}, Lcom/huawei/hihealth/HiSyncOption;-><init>()V

    .line 40
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncModel(I)V

    .line 41
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncAction(I)V

    .line 42
    const/16 v0, 0x4e20

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncDataType(I)V

    .line 43
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncScope(I)V

    .line 44
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lcom/huawei/hihealth/HiSyncOption;->setSyncMethod(I)V

    .line 45
    invoke-static {p0}, Lo/clq;->e(Landroid/content/Context;)Lo/clq;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v4, v1}, Lo/clq;->c(Lcom/huawei/hihealth/HiSyncOption;Lo/clz;)V

    .line 46
    new-instance v5, Lo/dcy;

    invoke-direct {v5}, Lo/dcy;-><init>()V

    .line 47
    const/16 v0, 0x2710

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "last_sync_time"

    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    .line 47
    invoke-static {p0, v0, v1, v2, v5}, Lo/dct;->e(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lo/dcy;)I

    .line 49
    return-void
.end method

.method public static b(Lo/eqv;)V
    .locals 0

    .line 122
    if-eqz p0, :cond_0

    .line 123
    invoke-virtual {p0}, Lo/eqv;->a()V

    .line 125
    :cond_0
    return-void
.end method

.method public static b()Z
    .locals 6

    .line 147
    sget-object v4, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 148
    const-string v0, "ro.build.version.emui"

    const-string v1, ""

    invoke-static {v0, v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 149
    sget-object v0, Lo/eoz;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "manufacturer is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 150
    sget-object v0, Lo/eoz;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "os version is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 151
    const-string v0, "HUAWEI"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "EmotionUI"

    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 152
    :cond_0
    sget-object v0, Lo/eoz;->d:Ljava/lang/String;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u5f53\u524d\u624b\u673a\u4e0d\u662f\u534e\u4e3a\u624b\u673a"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 153
    const/4 v0, 0x0

    return v0

    .line 155
    :cond_1
    const/4 v0, 0x1

    return v0
.end method
