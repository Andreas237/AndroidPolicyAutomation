.class public Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;>;"
        }
    .end annotation
.end field


# instance fields
.field private isPartRefresh:Z

.field private issDeleteMode:Z

.field private position:I

.field private selects:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 40
    new-instance v0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel$4;

    invoke-direct {v0}, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel$4;-><init>()V

    sput-object v0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->issDeleteMode:Z

    .line 24
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->position:I

    .line 25
    invoke-virtual {p1}, Landroid/os/Parcel;->readByte()B

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->isPartRefresh:Z

    .line 26
    return-void
.end method


# virtual methods
.method public acquirePosition()I
    .locals 1

    .line 70
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->position:I

    return v0
.end method

.method public acquireSelects()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Integer;>;"
        }
    .end annotation

    .line 78
    iget-object v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->selects:Ljava/util/List;

    return-object v0
.end method

.method public describeContents()I
    .locals 1

    .line 37
    const/4 v0, 0x0

    return v0
.end method

.method public isPartRefresh()Z
    .locals 1

    .line 61
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->isPartRefresh:Z

    return v0
.end method

.method public issDeleteMode()Z
    .locals 1

    .line 53
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->issDeleteMode:Z

    return v0
.end method

.method public saveIsPartRefresh(Z)V
    .locals 0

    .line 65
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->isPartRefresh:Z

    .line 66
    return-void
.end method

.method public saveIssDeleteMode(Z)V
    .locals 0

    .line 57
    iput-boolean p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->issDeleteMode:Z

    .line 58
    return-void
.end method

.method public savePosition(I)V
    .locals 0

    .line 74
    iput p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->position:I

    .line 75
    return-void
.end method

.method public saveSelects(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Integer;>;)V"
        }
    .end annotation

    .line 82
    iput-object p1, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->selects:Ljava/util/List;

    .line 83
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 30
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->issDeleteMode:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 31
    iget v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->position:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 32
    iget-boolean v0, p0, Lcom/huawei/health/suggestion/ui/fitness/module/FitnessTopicDeleteModel;->isPartRefresh:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 33
    return-void
.end method
