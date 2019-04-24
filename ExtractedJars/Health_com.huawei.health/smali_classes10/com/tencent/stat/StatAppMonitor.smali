.class public Lcom/tencent/stat/StatAppMonitor;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Cloneable;


# static fields
.field public static final FAILURE_RESULT_TYPE:I = 0x1

.field public static final LOGIC_FAILURE_RESULT_TYPE:I = 0x2

.field public static final SUCCESS_RESULT_TYPE:I = 0x0


# instance fields
.field private a:Ljava/lang/String;

.field private b:J

.field private c:J

.field private d:I

.field private e:J

.field private f:I

.field private g:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/StatAppMonitor;->a:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/stat/StatAppMonitor;->b:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/stat/StatAppMonitor;->c:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/StatAppMonitor;->d:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/stat/StatAppMonitor;->e:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/StatAppMonitor;->f:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/tencent/stat/StatAppMonitor;->g:I

    iput-object p1, p0, Lcom/tencent/stat/StatAppMonitor;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IIJJJI)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/stat/StatAppMonitor;->a:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/stat/StatAppMonitor;->b:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/stat/StatAppMonitor;->c:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/StatAppMonitor;->d:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/tencent/stat/StatAppMonitor;->e:J

    const/4 v0, 0x0

    iput v0, p0, Lcom/tencent/stat/StatAppMonitor;->f:I

    const/4 v0, 0x1

    iput v0, p0, Lcom/tencent/stat/StatAppMonitor;->g:I

    iput-object p1, p0, Lcom/tencent/stat/StatAppMonitor;->a:Ljava/lang/String;

    iput-wide p4, p0, Lcom/tencent/stat/StatAppMonitor;->b:J

    iput-wide p6, p0, Lcom/tencent/stat/StatAppMonitor;->c:J

    iput p2, p0, Lcom/tencent/stat/StatAppMonitor;->d:I

    iput-wide p8, p0, Lcom/tencent/stat/StatAppMonitor;->e:J

    iput p3, p0, Lcom/tencent/stat/StatAppMonitor;->f:I

    iput p10, p0, Lcom/tencent/stat/StatAppMonitor;->g:I

    return-void
.end method


# virtual methods
.method public clone()Lcom/tencent/stat/StatAppMonitor;
    .locals 2

    :try_start_0
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/stat/StatAppMonitor;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/tencent/stat/StatAppMonitor;->clone()Lcom/tencent/stat/StatAppMonitor;

    move-result-object v0

    return-object v0
.end method

.method public getInterfaceName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/tencent/stat/StatAppMonitor;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getMillisecondsConsume()J
    .locals 2

    iget-wide v0, p0, Lcom/tencent/stat/StatAppMonitor;->e:J

    return-wide v0
.end method

.method public getReqSize()J
    .locals 2

    iget-wide v0, p0, Lcom/tencent/stat/StatAppMonitor;->b:J

    return-wide v0
.end method

.method public getRespSize()J
    .locals 2

    iget-wide v0, p0, Lcom/tencent/stat/StatAppMonitor;->c:J

    return-wide v0
.end method

.method public getResultType()I
    .locals 1

    iget v0, p0, Lcom/tencent/stat/StatAppMonitor;->d:I

    return v0
.end method

.method public getReturnCode()I
    .locals 1

    iget v0, p0, Lcom/tencent/stat/StatAppMonitor;->f:I

    return v0
.end method

.method public getSampling()I
    .locals 1

    iget v0, p0, Lcom/tencent/stat/StatAppMonitor;->g:I

    return v0
.end method

.method public setInterfaceName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/tencent/stat/StatAppMonitor;->a:Ljava/lang/String;

    return-void
.end method

.method public setMillisecondsConsume(J)V
    .locals 0

    iput-wide p1, p0, Lcom/tencent/stat/StatAppMonitor;->e:J

    return-void
.end method

.method public setReqSize(J)V
    .locals 0

    iput-wide p1, p0, Lcom/tencent/stat/StatAppMonitor;->b:J

    return-void
.end method

.method public setRespSize(J)V
    .locals 0

    iput-wide p1, p0, Lcom/tencent/stat/StatAppMonitor;->c:J

    return-void
.end method

.method public setResultType(I)V
    .locals 0

    iput p1, p0, Lcom/tencent/stat/StatAppMonitor;->d:I

    return-void
.end method

.method public setReturnCode(I)V
    .locals 0

    iput p1, p0, Lcom/tencent/stat/StatAppMonitor;->f:I

    return-void
.end method

.method public setSampling(I)V
    .locals 1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    :cond_0
    iput p1, p0, Lcom/tencent/stat/StatAppMonitor;->g:I

    return-void
.end method
