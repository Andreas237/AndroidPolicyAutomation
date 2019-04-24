.class public Lo/fpc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/fty;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 29
    const-class v0, Lo/fpc;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fpc;->a:Lo/fty;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/util/Set;Lo/fow;Lo/fow;)Z
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/lang/String;Ljava/util/Set<Ljava/lang/String;>;Lo/fow;Lo/fow;)Z"
        }
    .end annotation

    .line 42
    sget-object v0, Lo/fpc;->a:Lo/fty;

    invoke-interface {v0}, Lo/fty;->e()Z

    move-result v4

    .line 43
    sget-object v0, Lo/fpc;->a:Lo/fty;

    invoke-interface {v0}, Lo/fty;->b()Z

    move-result v5

    .line 44
    const/4 v6, 0x1

    .line 45
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/lang/String;

    .line 46
    invoke-interface {p2, v8}, Lo/fow;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 47
    invoke-interface {p3, v8}, Lo/fow;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 48
    if-eq v9, v10, :cond_0

    const/4 v0, 0x0

    if-eq v0, v9, :cond_1

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v11, 0x1

    goto :goto_1

    :cond_1
    const/4 v11, 0x0

    .line 49
    :goto_1
    if-nez v11, :cond_2

    if-nez v4, :cond_2

    .line 51
    const/4 v0, 0x0

    return v0

    .line 53
    :cond_2
    if-nez v11, :cond_3

    .line 55
    sget-object v0, Lo/fpc;->a:Lo/fty;

    const-string v1, "{}, {}: \"{}\" != \"{}\""

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 v3, 0x1

    aput-object v8, v2, v3

    const/4 v3, 0x2

    aput-object v9, v2, v3

    const/4 v3, 0x3

    aput-object v10, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2

    .line 56
    :cond_3
    if-eqz v5, :cond_4

    .line 58
    sget-object v0, Lo/fpc;->a:Lo/fty;

    const-string v1, "{}, {}: \"{}\" == \"{}\""

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p0, v2, v3

    const/4 v3, 0x1

    aput-object v8, v2, v3

    const/4 v3, 0x2

    aput-object v9, v2, v3

    const/4 v3, 0x3

    aput-object v10, v2, v3

    invoke-interface {v0, v1, v2}, Lo/fty;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 60
    :cond_4
    :goto_2
    if-eqz v6, :cond_5

    if-eqz v11, :cond_5

    const/4 v6, 0x1

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    .line 61
    :goto_3
    goto/16 :goto_0

    .line 62
    :cond_6
    return v6
.end method
