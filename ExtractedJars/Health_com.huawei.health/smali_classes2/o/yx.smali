.class public Lo/yx;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Landroid/content/Context;

.field private static e:Lo/zs;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 66
    new-instance v2, Lo/yv;

    sget-object v0, Lo/yx;->a:Landroid/content/Context;

    sget-object v1, Lo/yx;->e:Lo/zs;

    invoke-direct {v2, v0, v1}, Lo/yv;-><init>(Landroid/content/Context;Lo/zs;)V

    .line 67
    invoke-virtual {v2, p0, p1}, Lo/yv;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static a(Ljava/lang/String;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
        }
    .end annotation

    .line 90
    new-instance v2, Lo/yv;

    sget-object v0, Lo/yx;->a:Landroid/content/Context;

    sget-object v1, Lo/yx;->e:Lo/zs;

    invoke-direct {v2, v0, v1}, Lo/yv;-><init>(Landroid/content/Context;Lo/zs;)V

    .line 91
    invoke-virtual {v2, p0}, Lo/yv;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public static b(Landroid/content/Context;Lo/zs;)V
    .locals 0

    .line 27
    sput-object p0, Lo/yx;->a:Landroid/content/Context;

    .line 28
    sput-object p1, Lo/yx;->e:Lo/zs;

    .line 29
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;Lo/zk;)V
    .locals 3

    .line 41
    new-instance v2, Lo/yv;

    sget-object v0, Lo/yx;->a:Landroid/content/Context;

    sget-object v1, Lo/yx;->e:Lo/zs;

    invoke-direct {v2, v0, v1}, Lo/yv;-><init>(Landroid/content/Context;Lo/zs;)V

    .line 42
    invoke-virtual {v2, p0, p1, p2}, Lo/yv;->e(Ljava/lang/String;Ljava/lang/String;Lo/zk;)V

    .line 43
    return-void
.end method
