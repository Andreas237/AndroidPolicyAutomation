.class public Lcom/huawei/health/suggestion/model/fitness/BaseModel;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private courseSet:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;>;"
        }
    .end annotation
.end field

.field private lastCourse:Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;

.field public user:Lcom/huawei/health/suggestion/model/Userinfo;


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/model/Userinfo;Ljava/util/Set;Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Lcom/huawei/health/suggestion/model/Userinfo;Ljava/util/Set<Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;>;Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;)V"
        }
    .end annotation

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->user:Lcom/huawei/health/suggestion/model/Userinfo;

    .line 24
    iput-object p2, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->courseSet:Ljava/util/Set;

    .line 25
    iput-object p3, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->lastCourse:Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;

    .line 26
    return-void
.end method


# virtual methods
.method public addCourse(Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;)V
    .locals 1

    .line 77
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->courseSet:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 78
    return-void
.end method

.method public getCourse(B)Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;
    .locals 3

    .line 42
    const/4 v1, 0x0

    .line 43
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->courseSet:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 44
    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 46
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;

    .line 47
    invoke-virtual {v1}, Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;->getBtOrder()B

    move-result v0

    if-ne p1, v0, :cond_0

    .line 49
    iput-object v1, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->lastCourse:Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;

    .line 50
    .line 53
    :cond_1
    return-object v1
.end method

.method public getCourse(Ljava/lang/String;)Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;
    .locals 1

    .line 34
    const/4 v0, 0x0

    return-object v0
.end method

.method public getCourseSet()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/Set<Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;>;"
        }
    .end annotation

    .line 81
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->courseSet:Ljava/util/Set;

    return-object v0
.end method

.method public getLastCourse()Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;
    .locals 1

    .line 69
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->lastCourse:Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;

    return-object v0
.end method

.method public getUser()Lcom/huawei/health/suggestion/model/Userinfo;
    .locals 1

    .line 61
    iget-object v0, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->user:Lcom/huawei/health/suggestion/model/Userinfo;

    return-object v0
.end method

.method public init()Z
    .locals 1

    .line 57
    const/4 v0, 0x0

    return v0
.end method

.method public setCourseSet(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/Set<Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;>;)V"
        }
    .end annotation

    .line 85
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->courseSet:Ljava/util/Set;

    .line 86
    return-void
.end method

.method public setLastCourse(Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;)V
    .locals 0

    .line 73
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->lastCourse:Lcom/huawei/health/suggestion/model/fitness/FitnessCourse;

    .line 74
    return-void
.end method

.method public setUser(Lcom/huawei/health/suggestion/model/Userinfo;)V
    .locals 0

    .line 65
    iput-object p1, p0, Lcom/huawei/health/suggestion/model/fitness/BaseModel;->user:Lcom/huawei/health/suggestion/model/Userinfo;

    .line 66
    return-void
.end method
