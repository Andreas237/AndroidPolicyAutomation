.class public Lo/fnc;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lo/fty;

.field private static d:Lo/fnc;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 39
    const-class v0, Lo/fnc;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/fud;->c(Ljava/lang/String;)Lo/fty;

    move-result-object v0

    sput-object v0, Lo/fnc;->a:Lo/fty;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static declared-synchronized d()Lo/fnc;
    .locals 3

    const-class v1, Lo/fnc;

    monitor-enter v1

    .line 50
    :try_start_0
    sget-object v0, Lo/fnc;->d:Lo/fnc;

    if-nez v0, :cond_0

    .line 51
    new-instance v0, Lo/fnc;

    invoke-direct {v0}, Lo/fnc;-><init>()V

    sput-object v0, Lo/fnc;->d:Lo/fnc;

    .line 53
    :cond_0
    sget-object v0, Lo/fnc;->d:Lo/fnc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public c(Lo/fmw;)Lo/fnb;
    .locals 5

    .line 73
    const-string v0, "DEDUPLICATOR"

    const-string v1, "NO_DEDUPLICATOR"

    invoke-virtual {p1, v0, v1}, Lo/fmw;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 74
    move-object v3, v2

    const/4 v4, -0x1

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "DEDUPLICATOR_MARK_AND_SWEEP"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v4, 0x0

    goto :goto_0

    :sswitch_1
    const-string v0, "DEDUPLICATOR_CROP_ROTATION"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :sswitch_2
    const-string v0, "NO_DEDUPLICATOR"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v4, 0x2

    :cond_0
    :goto_0
    packed-switch v4, :pswitch_data_0

    goto :goto_1

    .line 76
    :pswitch_0
    new-instance v0, Lo/fni;

    invoke-direct {v0, p1}, Lo/fni;-><init>(Lo/fmw;)V

    return-object v0

    .line 78
    :pswitch_1
    new-instance v0, Lo/fnd;

    invoke-direct {v0, p1}, Lo/fnd;-><init>(Lo/fmw;)V

    return-object v0

    .line 80
    :pswitch_2
    new-instance v0, Lo/fne;

    invoke-direct {v0}, Lo/fne;-><init>()V

    return-object v0

    .line 82
    :goto_1
    sget-object v0, Lo/fnc;->a:Lo/fty;

    const-string v1, "configuration contains unsupported deduplicator type, duplicate detection will be turned off"

    invoke-interface {v0, v1}, Lo/fty;->b(Ljava/lang/String;)V

    .line 83
    new-instance v0, Lo/fne;

    invoke-direct {v0}, Lo/fne;-><init>()V

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x72eda104 -> :sswitch_2
        0x4a6ffc73 -> :sswitch_0
        0x4e4e8b0c -> :sswitch_1
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
