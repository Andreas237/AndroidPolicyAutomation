.class public Lo/dqq;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/dqq$d;
    }
.end annotation


# static fields
.field private static b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/String;Lo/dqp;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lo/dqq;->b:Ljava/util/HashMap;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    return-void
.end method

.method synthetic constructor <init>(Lo/dqq$3;)V
    .locals 0

    .line 11
    invoke-direct {p0}, Lo/dqq;-><init>()V

    return-void
.end method

.method public static b()Lo/dqq;
    .locals 1

    .line 29
    invoke-static {}, Lo/dqq$d;->d()Lo/dqq;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public b(Landroid/content/Context;)Lo/dqp;
    .locals 4

    .line 75
    invoke-static {p1}, Lo/dqw;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 76
    sget-object v0, Lo/dqq;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lo/dqp;

    .line 77
    const/4 v0, 0x0

    if-eq v0, v3, :cond_0

    .line 78
    const-string v0, "CarrierConfigController"

    const-string v1, "CarrierConfigInfo has the config Info of the simOperator"

    invoke-static {v0, v1}, Lo/dsc;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 79
    return-object v3

    .line 81
    :cond_0
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo/dqw;->c(Landroid/content/Context;Ljava/lang/String;)Lo/dqp;

    move-result-object v3

    .line 82
    sget-object v0, Lo/dqq;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    return-object v3
.end method
