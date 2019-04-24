.class public Lo/eaj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lo/eaj;

.field private static b:Ljava/lang/Object;


# instance fields
.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 10
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lo/eaj;->b:Ljava/lang/Object;

    .line 13
    const/4 v0, 0x0

    sput-object v0, Lo/eaj;->a:Lo/eaj;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const-string v0, ""

    iput-object v0, p0, Lo/eaj;->e:Ljava/lang/String;

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lo/eaj;->d:Ljava/lang/String;

    return-void
.end method

.method public static a()Lo/eaj;
    .locals 4

    .line 17
    sget-object v2, Lo/eaj;->b:Ljava/lang/Object;

    monitor-enter v2

    .line 18
    :try_start_0
    sget-object v0, Lo/eaj;->a:Lo/eaj;

    const/4 v1, 0x0

    if-ne v1, v0, :cond_0

    .line 19
    new-instance v0, Lo/eaj;

    invoke-direct {v0}, Lo/eaj;-><init>()V

    sput-object v0, Lo/eaj;->a:Lo/eaj;

    .line 21
    :cond_0
    sget-object v0, Lo/eaj;->a:Lo/eaj;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return-object v0

    .line 22
    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 26
    iget-object v0, p0, Lo/eaj;->d:Ljava/lang/String;

    return-object v0
.end method
