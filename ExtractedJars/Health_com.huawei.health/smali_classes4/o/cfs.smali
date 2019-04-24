.class public Lo/cfs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$b;


# instance fields
.field private a:Landroid/support/v4/app/Fragment;

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:I


# direct methods
.method public constructor <init>(IILandroid/support/v4/app/Fragment;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IILandroid/support/v4/app/Fragment;Ljava/util/List<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;>;)V"
        }
    .end annotation

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    const/4 v0, -0x1

    iput v0, p0, Lo/cfs;->d:I

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lo/cfs;->e:I

    .line 23
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfs;->a:Landroid/support/v4/app/Fragment;

    .line 28
    const/4 v0, 0x0

    iput-object v0, p0, Lo/cfs;->b:Ljava/util/List;

    .line 48
    iput p1, p0, Lo/cfs;->d:I

    .line 49
    iput p2, p0, Lo/cfs;->e:I

    .line 50
    iput-object p3, p0, Lo/cfs;->a:Landroid/support/v4/app/Fragment;

    .line 51
    iput-object p4, p0, Lo/cfs;->b:Ljava/util/List;

    .line 52
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 31
    iget v0, p0, Lo/cfs;->d:I

    return v0
.end method

.method public c()Landroid/support/v4/app/Fragment;
    .locals 1

    .line 39
    iget-object v0, p0, Lo/cfs;->a:Landroid/support/v4/app/Fragment;

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Lcom/huawei/healthcloud/plugintrack/offlinemap/ui/activity/BaseFragmentActivity$e;>;"
        }
    .end annotation

    .line 43
    iget-object v0, p0, Lo/cfs;->b:Ljava/util/List;

    return-object v0
.end method

.method public e()I
    .locals 1

    .line 35
    iget v0, p0, Lo/cfs;->e:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "FragmentActivityInterfaceModel [mViewPageId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cfs;->d:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lo/cfs;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mFragment="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cfs;->a:Landroid/support/v4/app/Fragment;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", mTabList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lo/cfs;->b:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
