.class public Lo/cqk;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqk$e;
    }
.end annotation


# static fields
.field private static d:Landroid/content/Context;


# instance fields
.field private a:Lo/cop;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    sget-object v0, Lo/cqk;->d:Landroid/content/Context;

    invoke-static {v0}, Lo/cop;->e(Landroid/content/Context;)Lo/cop;

    move-result-object v0

    iput-object v0, p0, Lo/cqk;->a:Lo/cop;

    .line 29
    return-void
.end method

.method synthetic constructor <init>(Lo/cqk$3;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lo/cqk;-><init>()V

    return-void
.end method

.method private a(Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 88
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    return-object v0
.end method

.method private b(Lo/coa;)J
    .locals 5

    .line 68
    const-string v0, "Debug_AuthorizationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertAuthorization()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 69
    invoke-static {p1}, Lo/cpi;->a(Lo/coa;)Landroid/content/ContentValues;

    move-result-object v4

    .line 70
    iget-object v0, p0, Lo/cqk;->a:Lo/cop;

    invoke-virtual {v0, v4}, Lo/cop;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static b(Landroid/content/Context;)Lo/cqk;
    .locals 1

    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqk;->d:Landroid/content/Context;

    .line 41
    sget-object v0, Lo/cqk$e;->d:Lo/cqk;

    return-object v0
.end method

.method private c(Lo/coa;)I
    .locals 4

    .line 74
    invoke-static {p1}, Lo/cpi;->a(Lo/coa;)Landroid/content/ContentValues;

    move-result-object v3

    .line 75
    iget-object v0, p0, Lo/cqk;->a:Lo/cop;

    const-string v1, "permission"

    invoke-direct {p0, v1}, Lo/cqk;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lo/coa;->e()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lo/cqk;->a(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v3, v1, v2}, Lo/cop;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private c(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " =? "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private e(Ljava/lang/String;)Z
    .locals 7

    .line 79
    iget-object v0, p0, Lo/cqk;->a:Lo/cop;

    const-string v1, "permission"

    invoke-direct {p0, v1}, Lo/cqk;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lo/cqk;->a(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cop;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 80
    invoke-static {v6}, Lo/cph;->z(Landroid/database/Cursor;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public d(Ljava/lang/String;)I
    .locals 7

    .line 58
    iget-object v0, p0, Lo/cqk;->a:Lo/cop;

    const-string v1, "permission"

    invoke-direct {p0, v1}, Lo/cqk;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1}, Lo/cqk;->a(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cop;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 59
    const-string v0, "_id"

    invoke-static {v6, v0}, Lo/cph;->g(Landroid/database/Cursor;Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method public d(Lo/coa;)Z
    .locals 4

    .line 45
    invoke-virtual {p1}, Lo/coa;->e()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lo/cqk;->e(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    invoke-direct {p0, p1}, Lo/cqk;->c(Lo/coa;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 49
    :cond_1
    invoke-direct {p0, p1}, Lo/cqk;->b(Lo/coa;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return v0
.end method
