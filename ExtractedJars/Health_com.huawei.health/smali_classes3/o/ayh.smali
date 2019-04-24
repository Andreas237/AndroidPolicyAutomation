.class public Lo/ayh;
.super Lo/bfh;
.source "SourceFile"


# instance fields
.field private a:Z

.field private b:I

.field private c:I

.field private d:Lcom/huawei/health/sns/model/group/Group;

.field private e:J

.field private i:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 53
    invoke-direct {p0}, Lo/bfh;-><init>()V

    .line 20
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ayh;->a:Z

    .line 47
    const/4 v0, 0x1

    iput-boolean v0, p0, Lo/ayh;->i:Z

    .line 54
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 69
    iget-wide v0, p0, Lo/ayh;->e:J

    .line 70
    return-wide v0
.end method

.method public b()I
    .locals 1

    .line 101
    iget v0, p0, Lo/ayh;->b:I

    .line 102
    return v0
.end method

.method public b(I)V
    .locals 0

    .line 96
    iput p1, p0, Lo/ayh;->c:I

    .line 97
    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 117
    iput-boolean p1, p0, Lo/ayh;->i:Z

    .line 118
    return-void
.end method

.method public c()I
    .locals 1

    .line 90
    iget v0, p0, Lo/ayh;->c:I

    .line 91
    return v0
.end method

.method public c(J)V
    .locals 0

    .line 75
    iput-wide p1, p0, Lo/ayh;->e:J

    .line 76
    return-void
.end method

.method public d()Lcom/huawei/health/sns/model/group/Group;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/ayh;->d:Lcom/huawei/health/sns/model/group/Group;

    return-object v0
.end method

.method public d(Lcom/huawei/health/sns/model/group/Group;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lo/ayh;->d:Lcom/huawei/health/sns/model/group/Group;

    .line 86
    return-void
.end method

.method public e(I)V
    .locals 0

    .line 107
    iput p1, p0, Lo/ayh;->b:I

    .line 108
    return-void
.end method

.method public e(Z)V
    .locals 0

    .line 64
    iput-boolean p1, p0, Lo/ayh;->a:Z

    .line 65
    return-void
.end method

.method public e()Z
    .locals 1

    .line 58
    iget-boolean v0, p0, Lo/ayh;->a:Z

    .line 59
    return v0
.end method

.method public i()Z
    .locals 1

    .line 112
    iget-boolean v0, p0, Lo/ayh;->i:Z

    return v0
.end method
