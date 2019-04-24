.class public Lo/abs;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static d:Lo/abv;


# instance fields
.field private b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 13
    const/4 v0, 0x0

    sput-object v0, Lo/abs;->d:Lo/abv;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, 0x0

    iput-object v0, p0, Lo/abs;->b:Landroid/content/Context;

    .line 21
    iput-object p1, p0, Lo/abs;->b:Landroid/content/Context;

    .line 22
    return-void
.end method


# virtual methods
.method public b()Lo/abv;
    .locals 5

    .line 38
    const-class v3, Lo/abs;

    monitor-enter v3

    .line 39
    :try_start_0
    sget-object v0, Lo/abs;->d:Lo/abv;

    if-nez v0, :cond_0

    .line 40
    new-instance v0, Lo/abv;

    iget-object v1, p0, Lo/abs;->b:Landroid/content/Context;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lo/abv;-><init>(Landroid/content/Context;Z)V

    sput-object v0, Lo/abs;->d:Lo/abv;

    .line 42
    :cond_0
    sget-object v0, Lo/abs;->d:Lo/abv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-object v0

    .line 43
    :catchall_0
    move-exception v4

    monitor-exit v3

    throw v4
.end method

.method public e(I)Lo/abv;
    .locals 5

    .line 25
    const-class v2, Lo/abs;

    monitor-enter v2

    .line 26
    :try_start_0
    sget-object v0, Lo/abs;->d:Lo/abv;

    if-nez v0, :cond_1

    .line 27
    iget-object v0, p0, Lo/abs;->b:Landroid/content/Context;

    invoke-static {v0}, Lo/akz;->c(Landroid/content/Context;)I

    move-result v3

    .line 29
    const/4 v0, 0x1

    if-eq v0, v3, :cond_0

    const/4 v0, 0x2

    if-ne v0, v3, :cond_1

    .line 30
    :cond_0
    new-instance v0, Lo/abv;

    iget-object v1, p0, Lo/abs;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lo/abv;-><init>(Landroid/content/Context;)V

    sput-object v0, Lo/abs;->d:Lo/abv;

    .line 33
    :cond_1
    sget-object v0, Lo/abs;->d:Lo/abv;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 34
    :catchall_0
    move-exception v4

    monitor-exit v2

    throw v4
.end method
