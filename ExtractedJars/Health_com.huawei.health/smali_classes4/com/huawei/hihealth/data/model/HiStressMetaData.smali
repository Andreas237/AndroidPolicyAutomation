.class public Lcom/huawei/hihealth/data/model/HiStressMetaData;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hihealth/data/model/HiStressMetaData;>;"
        }
    .end annotation
.end field


# instance fields
.field private accFlag:Ljava/lang/Integer;

.field private algorithmVer:Ljava/lang/Integer;

.field private calibFlag:Ljava/lang/Integer;

.field private devNo:Ljava/lang/Integer;

.field private endTime:Ljava/lang/Long;

.field private feature:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation
.end field

.field private featureAtts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation
.end field

.field private grade:Ljava/lang/Integer;

.field private measureType:Ljava/lang/Integer;

.field private ppgFlag:Ljava/lang/Integer;

.field private score:Ljava/lang/Integer;

.field private startTime:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 178
    new-instance v0, Lcom/huawei/hihealth/data/model/HiStressMetaData$1;

    invoke-direct {v0}, Lcom/huawei/hihealth/data/model/HiStressMetaData$1;-><init>()V

    sput-object v0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 138
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 139
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 2

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 163
    const-class v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->startTime:Ljava/lang/Long;

    .line 164
    const-class v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->endTime:Ljava/lang/Long;

    .line 165
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->algorithmVer:Ljava/lang/Integer;

    .line 166
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->devNo:Ljava/lang/Integer;

    .line 167
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->score:Ljava/lang/Integer;

    .line 168
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->grade:Ljava/lang/Integer;

    .line 169
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->calibFlag:Ljava/lang/Integer;

    .line 170
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->measureType:Ljava/lang/Integer;

    .line 171
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->accFlag:Ljava/lang/Integer;

    .line 172
    const-class v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readValue(Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->ppgFlag:Ljava/lang/Integer;

    .line 173
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->feature:Ljava/util/List;

    .line 174
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->feature:Ljava/util/List;

    const-class v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->readList(Ljava/util/List;Ljava/lang/ClassLoader;)V

    .line 175
    invoke-virtual {p1}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->featureAtts:Ljava/util/List;

    .line 176
    return-void
.end method


# virtual methods
.method public configStress_acc_flag(I)V
    .locals 1

    .line 111
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->accFlag:Ljava/lang/Integer;

    .line 112
    return-void
.end method

.method public configStress_algorithm_ver(I)V
    .locals 1

    .line 63
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->algorithmVer:Ljava/lang/Integer;

    .line 64
    return-void
.end method

.method public configStress_calib_flag(I)V
    .locals 1

    .line 95
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->calibFlag:Ljava/lang/Integer;

    .line 96
    return-void
.end method

.method public configStress_dev_no(I)V
    .locals 1

    .line 71
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->devNo:Ljava/lang/Integer;

    .line 72
    return-void
.end method

.method public configStress_end_time(J)V
    .locals 1

    .line 55
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->endTime:Ljava/lang/Long;

    .line 56
    return-void
.end method

.method public configStress_feature(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/Float;>;)V"
        }
    .end annotation

    .line 127
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->feature:Ljava/util/List;

    .line 128
    return-void
.end method

.method public configStress_feature_atts(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;)V"
        }
    .end annotation

    .line 135
    iput-object p1, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->featureAtts:Ljava/util/List;

    .line 136
    return-void
.end method

.method public configStress_grade(I)V
    .locals 1

    .line 87
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->grade:Ljava/lang/Integer;

    .line 88
    return-void
.end method

.method public configStress_measure_type(I)V
    .locals 1

    .line 103
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->measureType:Ljava/lang/Integer;

    .line 104
    return-void
.end method

.method public configStress_ppg_flag(I)V
    .locals 1

    .line 119
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->ppgFlag:Ljava/lang/Integer;

    .line 120
    return-void
.end method

.method public configStress_score(I)V
    .locals 1

    .line 79
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->score:Ljava/lang/Integer;

    .line 80
    return-void
.end method

.method public configStress_start_time(J)V
    .locals 1

    .line 47
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->startTime:Ljava/lang/Long;

    .line 48
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 143
    const/4 v0, 0x0

    return v0
.end method

.method public fetchStress_acc_flag()I
    .locals 1

    .line 107
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->accFlag:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchStress_algorithm_ver()I
    .locals 1

    .line 59
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->algorithmVer:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchStress_calib_flag()I
    .locals 1

    .line 91
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->calibFlag:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchStress_dev_no()I
    .locals 1

    .line 67
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->devNo:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchStress_end_time()J
    .locals 2

    .line 51
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->endTime:Ljava/lang/Long;

    invoke-static {v0}, Lo/clu;->b(Ljava/lang/Long;)J

    move-result-wide v0

    return-wide v0
.end method

.method public fetchStress_feature()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/Float;>;"
        }
    .end annotation

    .line 123
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->feature:Ljava/util/List;

    return-object v0
.end method

.method public fetchStress_feature_atts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()Ljava/util/List<Ljava/lang/String;>;"
        }
    .end annotation

    .line 131
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->featureAtts:Ljava/util/List;

    return-object v0
.end method

.method public fetchStress_grade()I
    .locals 1

    .line 83
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->grade:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchStress_measure_type()I
    .locals 1

    .line 99
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->measureType:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchStress_ppg_flag()I
    .locals 1

    .line 115
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->ppgFlag:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchStress_score()I
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->score:Ljava/lang/Integer;

    invoke-static {v0}, Lo/clu;->e(Ljava/lang/Integer;)I

    move-result v0

    return v0
.end method

.method public fetchStress_start_time()J
    .locals 2

    .line 43
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->startTime:Ljava/lang/Long;

    invoke-static {v0}, Lo/clu;->b(Ljava/lang/Long;)J

    move-result-wide v0

    return-wide v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 148
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->startTime:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 149
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->endTime:Ljava/lang/Long;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 150
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->algorithmVer:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 151
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->devNo:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 152
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->score:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 153
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->grade:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 154
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->calibFlag:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 155
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->measureType:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 156
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->accFlag:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 157
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->ppgFlag:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeValue(Ljava/lang/Object;)V

    .line 158
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->feature:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 159
    iget-object v0, p0, Lcom/huawei/hihealth/data/model/HiStressMetaData;->featureAtts:Ljava/util/List;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 160
    return-void
.end method
