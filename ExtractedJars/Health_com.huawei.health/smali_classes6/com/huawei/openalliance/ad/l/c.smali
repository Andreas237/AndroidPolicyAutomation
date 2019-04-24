.class public Lcom/huawei/openalliance/ad/l/c;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/lang/String;

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Z

.field private f:Z

.field private g:Ljava/lang/Long;

.field private h:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0xc80000000L

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/l/c;->b:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/l/c;->e:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/openalliance/ad/l/c;->f:Z

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 4

    int-to-long v0, p1

    const-wide/16 v2, 0x400

    mul-long/2addr v0, v2

    iput-wide v0, p0, Lcom/huawei/openalliance/ad/l/c;->b:J

    return-void
.end method

.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/huawei/openalliance/ad/l/c;->b:J

    return-void
.end method

.method public a(Lcom/huawei/openalliance/ad/db/bean/ContentRecord;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/l/c;->h:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    return-void
.end method

.method public a(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/l/c;->g:Ljava/lang/Long;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/l/c;->c:Ljava/lang/String;

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/l/c;->f:Z

    return-void
.end method

.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/l/c;->f:Z

    return v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/l/c;->d:Ljava/lang/String;

    return-void
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/huawei/openalliance/ad/l/c;->e:Z

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/c;->d:Ljava/lang/String;

    return-object v0
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/huawei/openalliance/ad/l/c;->a:Ljava/lang/String;

    return-void
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/huawei/openalliance/ad/l/c;->b:J

    return-wide v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/c;->a:Ljava/lang/String;

    return-object v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/huawei/openalliance/ad/l/c;->e:Z

    return v0
.end method

.method public g()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/c;->g:Ljava/lang/Long;

    return-object v0
.end method

.method public h()Lcom/huawei/openalliance/ad/db/bean/ContentRecord;
    .locals 1

    iget-object v0, p0, Lcom/huawei/openalliance/ad/l/c;->h:Lcom/huawei/openalliance/ad/db/bean/ContentRecord;

    return-object v0
.end method
