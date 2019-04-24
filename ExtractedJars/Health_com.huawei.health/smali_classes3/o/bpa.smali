.class public Lo/bpa;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation
.end field

.field private b:Z

.field private d:J

.field private e:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 57
    iget-boolean v0, p0, Lo/bpa;->b:Z

    .line 58
    return v0
.end method

.method public b(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;)V"
        }
    .end annotation

    .line 52
    iput-object p1, p0, Lo/bpa;->a:Ljava/util/ArrayList;

    .line 53
    return-void
.end method

.method public b()Z
    .locals 1

    .line 68
    iget-boolean v0, p0, Lo/bpa;->e:Z

    .line 69
    return v0
.end method

.method public d()J
    .locals 2

    .line 35
    iget-wide v0, p0, Lo/bpa;->d:J

    .line 36
    return-wide v0
.end method

.method public d(J)V
    .locals 0

    .line 41
    iput-wide p1, p0, Lo/bpa;->d:J

    .line 42
    return-void
.end method

.method public d(Z)V
    .locals 0

    .line 74
    iput-boolean p1, p0, Lo/bpa;->e:Z

    .line 75
    return-void
.end method

.method public e()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/ArrayList<Lcom/huawei/health/sns/model/group/GroupMember;>;"
        }
    .end annotation

    .line 46
    iget-object v0, p0, Lo/bpa;->a:Ljava/util/ArrayList;

    .line 47
    return-object v0
.end method

.method public e(Z)V
    .locals 0

    .line 63
    iput-boolean p1, p0, Lo/bpa;->b:Z

    .line 64
    return-void
.end method
