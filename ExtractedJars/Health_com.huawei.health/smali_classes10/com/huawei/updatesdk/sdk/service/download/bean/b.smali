.class public Lcom/huawei/updatesdk/sdk/service/download/bean/b;
.super Ljava/lang/Object;


# static fields
.field private static a:I

.field private static final g:Ljava/lang/Object;


# instance fields
.field private b:I

.field private c:I

.field private d:J

.field private e:J

.field private f:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/a/c;->a()I

    move-result v0

    sput v0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->a:I

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->b:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->c:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->d:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->e:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->f:J

    return-void
.end method

.method public constructor <init>(IIJJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->b:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->c:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->d:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->e:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->f:J

    iput p1, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->b:I

    iput p2, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->c:I

    iput-wide p3, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->d:J

    iput-wide p5, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->e:J

    return-void
.end method

.method public static a()I
    .locals 4

    sget-object v2, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->g:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    sget v0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->a:I

    add-int/lit8 v0, v0, 0x1

    sput v0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->a:I

    sget v0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->a:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/huawei/updatesdk/sdk/a/c/a/c;->a()I

    move-result v0

    sput v0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->a:I

    :cond_0
    sget v0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->a:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    return v0

    :catchall_0
    move-exception v3

    monitor-exit v2

    throw v3
.end method


# virtual methods
.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->f:J

    return-void
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->d:J

    return-wide v0
.end method

.method public c()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->e:J

    return-wide v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/updatesdk/sdk/service/download/bean/b;->f:J

    return-wide v0
.end method
