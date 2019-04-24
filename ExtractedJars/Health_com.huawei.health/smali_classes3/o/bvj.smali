.class public Lo/bvj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J

.field private b:I

.field private c:F

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field

.field private e:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bvj;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 21
    iget v0, p0, Lo/bvj;->c:F

    return v0
.end method

.method public a(I)V
    .locals 0

    .line 49
    iput p1, p0, Lo/bvj;->e:I

    .line 50
    return-void
.end method

.method public a(J)V
    .locals 0

    .line 37
    iput-wide p1, p0, Lo/bvj;->a:J

    .line 38
    return-void
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 41
    iput-object p1, p0, Lo/bvj;->d:Ljava/util/List;

    .line 42
    return-void
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation

    .line 29
    iget-object v0, p0, Lo/bvj;->d:Ljava/util/List;

    return-object v0
.end method

.method public b(F)V
    .locals 0

    .line 33
    iput p1, p0, Lo/bvj;->c:F

    .line 34
    return-void
.end method

.method public c()J
    .locals 2

    .line 25
    iget-wide v0, p0, Lo/bvj;->a:J

    return-wide v0
.end method

.method public d()I
    .locals 1

    .line 53
    iget v0, p0, Lo/bvj;->b:I

    return v0
.end method

.method public d(I)V
    .locals 0

    .line 57
    iput p1, p0, Lo/bvj;->b:I

    .line 58
    return-void
.end method

.method public e()I
    .locals 1

    .line 45
    iget v0, p0, Lo/bvj;->e:I

    return v0
.end method
