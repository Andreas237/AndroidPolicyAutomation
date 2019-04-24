.class public Lo/coy;
.super Lo/cow;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/coy$a;
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Lo/cow;-><init>()V

    .line 23
    return-void
.end method

.method synthetic constructor <init>(Lo/coy$3;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Lo/coy;-><init>()V

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .line 39
    const-string v0, "sample_session_core"

    invoke-static {v0}, Lo/coy;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static c(Landroid/content/Context;)Lo/coy;
    .locals 1

    .line 34
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sput-object v0, Lo/coy;->b:Landroid/content/Context;

    .line 35
    sget-object v0, Lo/coy$a;->e:Lo/coy;

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 2

    .line 46
    const-string v0, "CoreSessionIndex"

    const-string v1, "sample_session_core"

    invoke-static {v0, v1}, Lo/coy;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public c()Ljava/lang/String;
    .locals 1

    .line 51
    const-string v0, "sample_session_core"

    return-object v0
.end method
