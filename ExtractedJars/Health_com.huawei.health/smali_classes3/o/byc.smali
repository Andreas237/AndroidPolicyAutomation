.class public Lo/byc;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/huawei/health/suggestion/model/WeekInfo;

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/bxv;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/huawei/health/suggestion/model/WeekInfo;)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lo/byc;->a:Lcom/huawei/health/suggestion/model/WeekInfo;

    .line 18
    const/4 v0, 0x7

    new-array v0, v0, [Lo/bxv;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lo/byc;->c:Ljava/util/List;

    .line 19
    return-void
.end method


# virtual methods
.method public d()Lcom/huawei/health/suggestion/model/WeekInfo;
    .locals 1

    .line 22
    iget-object v0, p0, Lo/byc;->a:Lcom/huawei/health/suggestion/model/WeekInfo;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lo/bxv;>;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lo/byc;->c:Ljava/util/List;

    return-object v0
.end method
