.class public Lo/dog;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod;


# static fields
.field private static b:Lo/dog;


# instance fields
.field private c:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 15
    const/4 v0, 0x0

    sput-object v0, Lo/dog;->b:Lo/dog;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dog;->c:Landroid/content/Context;

    .line 29
    iput-object p1, p0, Lo/dog;->c:Landroid/content/Context;

    .line 30
    return-void
.end method

.method public static c(Landroid/content/Context;)Lo/dog;
    .locals 3

    .line 20
    const-class v1, Lo/dog;

    monitor-enter v1

    .line 21
    :try_start_0
    sget-object v0, Lo/dog;->b:Lo/dog;

    if-nez v0, :cond_0

    .line 22
    new-instance v0, Lo/dog;

    invoke-direct {v0, p0}, Lo/dog;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dog;->b:Lo/dog;

    .line 24
    :cond_0
    sget-object v0, Lo/dog;->b:Lo/dog;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 25
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public c()Lo/dod$e;
    .locals 2

    .line 34
    new-instance v0, Lo/doj;

    iget-object v1, p0, Lo/dog;->c:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/doj;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public d(I)Lo/dod$b;
    .locals 5

    .line 43
    const/4 v4, 0x0

    .line 44
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 46
    :sswitch_0
    new-instance v4, Lo/doh;

    iget-object v0, p0, Lo/dog;->c:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/doh;-><init>(Landroid/content/Context;)V

    .line 47
    const/high16 v0, 0x10000000

    invoke-virtual {v4, v0}, Lo/doh;->c(I)V

    .line 48
    goto :goto_1

    .line 51
    :sswitch_1
    new-instance v4, Lo/doh;

    iget-object v0, p0, Lo/dog;->c:Landroid/content/Context;

    invoke-direct {v4, v0}, Lo/doh;-><init>(Landroid/content/Context;)V

    .line 52
    const/high16 v0, 0x20000000

    invoke-virtual {v4, v0}, Lo/doh;->c(I)V

    .line 53
    goto :goto_1

    .line 56
    :goto_0
    const-string v0, "HiHealthMedia"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "obtainCustomeWriter only support two types"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 59
    :goto_1
    return-object v4

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
    .end sparse-switch
.end method
