.class public Lo/bxt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:I

.field private b:Lcom/huawei/health/suggestion/model/Plan;

.field private c:Lcom/huawei/health/suggestion/model/WeekInfo;

.field private d:Lo/bxv;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation
.end field

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bxv;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/WeekInfo;Lo/bxv;)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput p1, p0, Lo/bxt;->a:I

    .line 29
    iput-object p2, p0, Lo/bxt;->b:Lcom/huawei/health/suggestion/model/Plan;

    .line 30
    iput-object p3, p0, Lo/bxt;->c:Lcom/huawei/health/suggestion/model/WeekInfo;

    .line 31
    iput-object p4, p0, Lo/bxt;->d:Lo/bxv;

    .line 32
    return-void
.end method

.method public constructor <init>(Ljava/util/List;ILcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/WeekInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lo/bxv;>;ILcom/huawei/health/suggestion/model/Plan;Lcom/huawei/health/suggestion/model/WeekInfo;)V"
        }
    .end annotation

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput p2, p0, Lo/bxt;->a:I

    .line 36
    iput-object p3, p0, Lo/bxt;->b:Lcom/huawei/health/suggestion/model/Plan;

    .line 37
    iput-object p4, p0, Lo/bxt;->c:Lcom/huawei/health/suggestion/model/WeekInfo;

    .line 38
    iput-object p1, p0, Lo/bxt;->g:Ljava/util/List;

    .line 40
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/bxv;

    iput-object v0, p0, Lo/bxt;->d:Lo/bxv;

    .line 41
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 44
    iget v0, p0, Lo/bxt;->a:I

    return v0
.end method

.method public b()Lcom/huawei/health/suggestion/model/Plan;
    .locals 1

    .line 48
    iget-object v0, p0, Lo/bxt;->b:Lcom/huawei/health/suggestion/model/Plan;

    return-object v0
.end method

.method public c()Lo/bxv;
    .locals 1

    .line 56
    iget-object v0, p0, Lo/bxt;->d:Lo/bxv;

    return-object v0
.end method

.method public d()Lcom/huawei/health/suggestion/model/WeekInfo;
    .locals 1

    .line 52
    iget-object v0, p0, Lo/bxt;->c:Lcom/huawei/health/suggestion/model/WeekInfo;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/bxv;>;"
        }
    .end annotation

    .line 60
    iget-object v0, p0, Lo/bxt;->g:Ljava/util/List;

    return-object v0
.end method

.method public e(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;)V"
        }
    .end annotation

    .line 68
    iput-object p1, p0, Lo/bxt;->e:Ljava/util/List;

    .line 69
    return-void
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/health/suggestion/model/WorkoutRecord;>;"
        }
    .end annotation

    .line 64
    iget-object v0, p0, Lo/bxt;->e:Ljava/util/List;

    return-object v0
.end method
