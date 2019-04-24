.class public Lo/cjy;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/cjy$b;
    }
.end annotation


# static fields
.field private static a:Lo/civ;

.field private static d:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<Ljava/lang/Object;Ljava/lang/String;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lo/civ;
    .locals 1

    sget-object v0, Lo/cjy;->a:Lo/civ;

    return-object v0
.end method

.method static synthetic d()Ljava/util/HashMap;
    .locals 1

    sget-object v0, Lo/cjy;->d:Ljava/util/HashMap;

    return-object v0
.end method

.method static synthetic d(Ljava/util/HashMap;)Ljava/util/HashMap;
    .locals 0

    sput-object p0, Lo/cjy;->d:Ljava/util/HashMap;

    return-object p0
.end method

.method static synthetic e(Lo/civ;)Lo/civ;
    .locals 0

    sput-object p0, Lo/cjy;->a:Lo/civ;

    return-object p0
.end method
