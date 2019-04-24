.class public Lo/bxv;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:I

.field private c:Z

.field private d:Z

.field private e:Lcom/huawei/health/suggestion/model/DayInfo;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILcom/huawei/health/suggestion/model/DayInfo;)V
    .locals 1

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput p1, p0, Lo/bxv;->a:I

    .line 29
    iput-object p2, p0, Lo/bxv;->e:Lcom/huawei/health/suggestion/model/DayInfo;

    .line 30
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lo/bxv;->g:Ljava/util/List;

    .line 31
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 50
    iget v0, p0, Lo/bxv;->a:I

    return v0
.end method

.method public b()Z
    .locals 1

    .line 34
    iget-boolean v0, p0, Lo/bxv;->d:Z

    return v0
.end method

.method public c(I)V
    .locals 0

    .line 62
    iput p1, p0, Lo/bxv;->b:I

    .line 63
    return-void
.end method

.method public c()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Lo/bxv;->c:Z

    return v0
.end method

.method public d()I
    .locals 1

    .line 58
    iget v0, p0, Lo/bxv;->b:I

    return v0
.end method

.method public d(Z)V
    .locals 0

    .line 46
    iput-boolean p1, p0, Lo/bxv;->c:Z

    .line 47
    return-void
.end method

.method public e()Lcom/huawei/health/suggestion/model/DayInfo;
    .locals 1

    .line 66
    iget-object v0, p0, Lo/bxv;->e:Lcom/huawei/health/suggestion/model/DayInfo;

    return-object v0
.end method

.method public e(Z)V
    .locals 0

    .line 38
    iput-boolean p1, p0, Lo/bxv;->d:Z

    .line 39
    return-void
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/PlanWorkout;>;"
        }
    .end annotation

    .line 74
    iget-object v0, p0, Lo/bxv;->g:Ljava/util/List;

    return-object v0
.end method
