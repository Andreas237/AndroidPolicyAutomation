.class public Lo/cqb;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cqb$e;
    }
.end annotation


# static fields
.field private static e:Landroid/content/Context;


# instance fields
.field private d:Lo/cor;


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    sget-object v0, Lo/cqb;->e:Landroid/content/Context;

    invoke-static {v0}, Lo/cor;->b(Landroid/content/Context;)Lo/cor;

    move-result-object v0

    iput-object v0, p0, Lo/cqb;->d:Lo/cor;

    .line 29
    return-void
.end method

.method synthetic constructor <init>(Lo/cqb$5;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Lo/cqb;-><init>()V

    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/cqb;
    .locals 1

    .line 40
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/cqb;->e:Landroid/content/Context;

    .line 41
    sget-object v0, Lo/cqb$e;->b:Lo/cqb;

    return-object v0
.end method


# virtual methods
.method public a(JJIII)V
    .locals 6

    .line 74
    const/16 v0, 0x9

    new-array v4, v0, [Ljava/lang/String;

    .line 75
    invoke-static {p5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 76
    invoke-static {p7}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 77
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 78
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v4, v1

    .line 79
    invoke-static {p1, p2}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v4, v1

    .line 80
    invoke-static {p3, p4}, Lo/cnk;->a(J)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v4, v1

    .line 81
    const v0, 0x9c41

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    aput-object v0, v4, v1

    .line 82
    const v0, 0xa028

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    aput-object v0, v4, v1

    .line 83
    invoke-static {p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x8

    aput-object v0, v4, v1

    .line 84
    invoke-static {}, Lo/cpn;->b()Ljava/lang/String;

    move-result-object v5

    .line 85
    const-string v0, "Debug_ExecSQLManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copySportStatDatas() sql = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, ",selectAgs = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 86
    iget-object v0, p0, Lo/cqb;->d:Lo/cor;

    invoke-virtual {v0, v5, v4}, Lo/cor;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 87
    return-void
.end method

.method public a(JJLjava/util/List;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJLjava/util/List<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 59
    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x8

    new-array v4, v0, [Ljava/lang/String;

    .line 60
    invoke-static {p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v4, v1

    .line 61
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v4, v1

    .line 62
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v4, v1

    .line 63
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v4, v1

    .line 64
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v4, v1

    .line 65
    const/16 v0, 0x4e21

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v4, v1

    .line 66
    const/16 v0, 0x5208

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    aput-object v0, v4, v1

    .line 67
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    aput-object v0, v4, v1

    .line 68
    const/16 v0, 0x8

    invoke-static {p5, v4, v0}, Lo/cpn;->c(Ljava/util/List;[Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v5

    .line 69
    const-string v0, "Debug_ExecSQLManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copySportSessionDatas() sql = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v5, v1, v2

    const-string v2, ",selectAgs = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v4}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    iget-object v0, p0, Lo/cqb;->d:Lo/cor;

    invoke-virtual {v0, v5, v4}, Lo/cor;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 71
    return-void
.end method

.method public c(JJLjava/util/List;I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJLjava/util/List<Ljava/lang/Integer;>;I)V"
        }
    .end annotation

    .line 45
    invoke-static {}, Lo/cmk;->a()[I

    move-result-object v4

    .line 46
    array-length v0, v4

    invoke-interface {p5}, Ljava/util/List;->size()I

    move-result v1

    add-int/2addr v0, v1

    add-int/lit8 v0, v0, 0x6

    new-array v5, v0, [Ljava/lang/String;

    .line 47
    invoke-static {p6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, v5, v1

    .line 48
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, v5, v1

    .line 49
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    aput-object v0, v5, v1

    .line 50
    invoke-static {p1, p2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    aput-object v0, v5, v1

    .line 51
    invoke-static {p3, p4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    aput-object v0, v5, v1

    .line 52
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x5

    aput-object v0, v5, v1

    .line 53
    const/4 v0, 0x6

    invoke-static {v4, p5, v5, v0}, Lo/cpn;->b([ILjava/util/List;[Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v6

    .line 54
    const-string v0, "Debug_ExecSQLManager"

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "copySportPointDatas() sql = "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object v6, v1, v2

    const-string v2, ",selectAgs = "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v5}, Lo/cnj;->d(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 55
    iget-object v0, p0, Lo/cqb;->d:Lo/cor;

    invoke-virtual {v0, v6, v5}, Lo/cor;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 56
    return-void
.end method
