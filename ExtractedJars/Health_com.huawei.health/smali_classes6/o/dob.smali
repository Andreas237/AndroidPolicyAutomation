.class public Lo/dob;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dod;


# static fields
.field private static c:Lo/dob;


# instance fields
.field private e:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 9
    const/4 v0, 0x0

    sput-object v0, Lo/dob;->c:Lo/dob;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dob;->e:Landroid/content/Context;

    .line 23
    iput-object p1, p0, Lo/dob;->e:Landroid/content/Context;

    .line 24
    return-void
.end method

.method public static e(Landroid/content/Context;)Lo/dob;
    .locals 3

    .line 14
    const-class v1, Lo/dob;

    monitor-enter v1

    .line 15
    :try_start_0
    sget-object v0, Lo/dob;->c:Lo/dob;

    if-nez v0, :cond_0

    .line 16
    new-instance v0, Lo/dob;

    invoke-direct {v0, p0}, Lo/dob;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/dob;->c:Lo/dob;

    .line 18
    :cond_0
    sget-object v0, Lo/dob;->c:Lo/dob;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    return-object v0

    .line 19
    :catchall_0
    move-exception v2

    monitor-exit v1

    throw v2
.end method


# virtual methods
.method public a()Lo/dod$e;
    .locals 2

    .line 28
    new-instance v0, Lo/doc;

    iget-object v1, p0, Lo/dob;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/doc;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public c()Lo/dod$b;
    .locals 2

    .line 33
    new-instance v0, Lo/dof;

    iget-object v1, p0, Lo/dob;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/dof;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
