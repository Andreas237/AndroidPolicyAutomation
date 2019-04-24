.class public Lo/cpx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cpx$d;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# instance fields
.field private c:Lo/com;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    sget-object v0, Lo/cpx;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/com;->d(Landroid/content/Context;)Lo/com;

    move-result-object v0

    iput-object v0, p0, Lo/cpx;->c:Lo/com;

    .line 33
    return-void
.end method

.method synthetic constructor <init>(Lo/cpx$4;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Lo/cpx;-><init>()V

    return-void
.end method

.method public static d(Landroid/content/Context;)Lo/cpx;
    .locals 1
    .param p0    # Landroid/content/Context;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 44
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cpx;->e:Landroid/content/Context;

    .line 45
    sget-object v0, Lo/cpx$d;->d:Lo/cpx;

    return-object v0
.end method


# virtual methods
.method public c(ILjava/util/List;Ljava/lang/String;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Ljava/lang/Integer;>;Ljava/lang/String;)Ljava/util/List<Lcom/huawei/hihealth/HiHealthData;>;"
        }
    .end annotation

    .line 58
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    .line 59
    new-instance v7, Ljava/lang/StringBuffer;

    invoke-direct {v7}, Ljava/lang/StringBuffer;-><init>()V

    .line 60
    add-int/lit8 v0, v6, 0x1

    new-array v8, v0, [Ljava/lang/String;

    .line 61
    const-string v0, "type_id"

    invoke-virtual {v7, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 62
    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v8, v1

    .line 63
    const-string v0, "client_id"

    move-object v1, p2

    move v2, v6

    move-object v3, v7

    move-object v4, v8

    const/4 v5, 0x1

    invoke-static/range {v0 .. v5}, Lo/cpn;->e(Ljava/lang/String;Ljava/util/List;ILjava/lang/StringBuffer;[Ljava/lang/String;I)V

    .line 64
    const-string v0, "Debug_DataRealTimeManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "queryRealTimeData() sbSelector = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v7, v1, v2

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 65
    iget-object v0, p0, Lo/cpx;->c:Lo/com;

    invoke-virtual {v7}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    move-object v2, v8

    const-string v5, "start_time DESC "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/com;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    .line 66
    invoke-static {v9, p3}, Lo/cph;->k(Landroid/database/Cursor;Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
