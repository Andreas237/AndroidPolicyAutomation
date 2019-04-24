.class public Lo/cpt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cpt$b;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# instance fields
.field private b:Lo/cog;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    sget-object v0, Lo/cpt;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cog;->e(Landroid/content/Context;)Lo/cog;

    move-result-object v0

    iput-object v0, p0, Lo/cpt;->b:Lo/cog;

    .line 30
    return-void
.end method

.method synthetic constructor <init>(Lo/cpt$2;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lo/cpt;-><init>()V

    return-void
.end method

.method private a(Lo/cnx;)J
    .locals 7

    .line 58
    const-string v0, "Debug_AuthorizationManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "insertAuthorization()"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 60
    invoke-virtual {p1, v4, v5}, Lo/cnx;->b(J)V

    .line 61
    invoke-virtual {p1, v4, v5}, Lo/cnx;->c(J)V

    .line 62
    invoke-static {p1}, Lo/cpi;->a(Lo/cnx;)Landroid/content/ContentValues;

    move-result-object v6

    .line 63
    iget-object v0, p0, Lo/cpt;->b:Lo/cog;

    invoke-virtual {v0, v6}, Lo/cog;->c(Landroid/content/ContentValues;)J

    move-result-wide v0

    return-wide v0
.end method

.method private c()Ljava/lang/String;
    .locals 1

    .line 78
    const-string v0, "app_id =? and user_id =? and permission_id =? "

    return-object v0
.end method

.method private d(Lo/cnx;)I
    .locals 6

    .line 67
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lo/cnx;->c(J)V

    .line 68
    invoke-static {p1}, Lo/cpi;->a(Lo/cnx;)Landroid/content/ContentValues;

    move-result-object v5

    .line 69
    iget-object v0, p0, Lo/cpt;->b:Lo/cog;

    invoke-direct {p0}, Lo/cpt;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lo/cnx;->d()I

    move-result v2

    invoke-virtual {p1}, Lo/cnx;->e()I

    move-result v3

    invoke-virtual {p1}, Lo/cnx;->a()I

    move-result v4

    invoke-direct {p0, v2, v3, v4}, Lo/cpt;->d(III)[Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v5, v1, v2}, Lo/cog;->d(Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    return v0
.end method

.method private d(III)[Ljava/lang/String;
    .locals 3

    .line 84
    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/String;

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static e(Landroid/content/Context;)Lo/cpt;
    .locals 1

    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cpt;->e:Landroid/content/Context;

    .line 42
    sget-object v0, Lo/cpt$b;->b:Lo/cpt;

    return-object v0
.end method

.method private e(III)Z
    .locals 7

    .line 73
    iget-object v0, p0, Lo/cpt;->b:Lo/cog;

    invoke-direct {p0}, Lo/cpt;->c()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, p1, p2, p3}, Lo/cpt;->d(III)[Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v5}, Lo/cog;->b(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v6

    .line 74
    invoke-static {v6}, Lo/cph;->z(Landroid/database/Cursor;)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public b(Lo/cnx;)Z
    .locals 4

    .line 51
    invoke-virtual {p1}, Lo/cnx;->d()I

    move-result v0

    invoke-virtual {p1}, Lo/cnx;->e()I

    move-result v1

    invoke-virtual {p1}, Lo/cnx;->a()I

    move-result v2

    invoke-direct {p0, v0, v1, v2}, Lo/cpt;->e(III)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 52
    invoke-direct {p0, p1}, Lo/cpt;->d(Lo/cnx;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 54
    :cond_1
    invoke-direct {p0, p1}, Lo/cpt;->a(Lo/cnx;)J

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
