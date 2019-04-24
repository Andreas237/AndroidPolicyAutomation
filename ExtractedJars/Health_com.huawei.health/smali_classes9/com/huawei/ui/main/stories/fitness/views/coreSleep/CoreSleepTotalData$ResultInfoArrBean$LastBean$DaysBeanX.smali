.class public Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "DaysBeanX"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;>;"
        }
    .end annotation
.end field


# instance fields
.field private early_wake_up:I

.field private easy_awake:I

.field private irregular_wake_up:I

.field private lack_sleep:I

.field private late_fall_sleep:I

.field private low_REM_sleep:I

.field private low_breath_quality:I

.field private low_deep_sleep:I

.field private over_REM_sleep:I

.field private over_sleep:I

.field private upper_score:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 927
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX$5;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX$5;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 910
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 911
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 913
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 914
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->upper_score:I

    .line 915
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->over_sleep:I

    .line 916
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->lack_sleep:I

    .line 917
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->irregular_wake_up:I

    .line 918
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->late_fall_sleep:I

    .line 919
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_deep_sleep:I

    .line 920
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_breath_quality:I

    .line 921
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->over_REM_sleep:I

    .line 922
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_REM_sleep:I

    .line 923
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->early_wake_up:I

    .line 924
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->easy_awake:I

    .line 925
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 892
    const/4 v0, 0x0

    return v0
.end method

.method public getEarly_wake_up()I
    .locals 1

    .line 875
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->early_wake_up:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getEasy_awake()I
    .locals 1

    .line 883
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->easy_awake:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getIrregular_wake_up()I
    .locals 1

    .line 826
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->irregular_wake_up:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLack_sleep()I
    .locals 1

    .line 818
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->lack_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLate_fall_sleep()I
    .locals 1

    .line 834
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->late_fall_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLow_REM_sleep()I
    .locals 1

    .line 867
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_REM_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLow_breath_quality()I
    .locals 1

    .line 851
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_breath_quality:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getLow_deep_sleep()I
    .locals 1

    .line 842
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_deep_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getOver_REM_sleep()I
    .locals 1

    .line 859
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->over_REM_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getOver_sleep()I
    .locals 1

    .line 810
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->over_sleep:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getUpper_score()I
    .locals 1

    .line 802
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->upper_score:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public setEarly_wake_up(I)V
    .locals 0

    .line 879
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->early_wake_up:I

    .line 880
    return-void
.end method

.method public setEasy_awake(I)V
    .locals 0

    .line 887
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->easy_awake:I

    .line 888
    return-void
.end method

.method public setIrregular_wake_up(I)V
    .locals 0

    .line 830
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->irregular_wake_up:I

    .line 831
    return-void
.end method

.method public setLack_sleep(I)V
    .locals 0

    .line 822
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->lack_sleep:I

    .line 823
    return-void
.end method

.method public setLate_fall_sleep(I)V
    .locals 0

    .line 838
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->late_fall_sleep:I

    .line 839
    return-void
.end method

.method public setLow_REM_sleep(I)V
    .locals 0

    .line 871
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_REM_sleep:I

    .line 872
    return-void
.end method

.method public setLow_breath_quality(I)V
    .locals 0

    .line 855
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_breath_quality:I

    .line 856
    return-void
.end method

.method public setLow_deep_sleep(I)V
    .locals 0

    .line 846
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_deep_sleep:I

    .line 848
    return-void
.end method

.method public setOver_REM_sleep(I)V
    .locals 0

    .line 863
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->over_REM_sleep:I

    .line 864
    return-void
.end method

.method public setOver_sleep(I)V
    .locals 0

    .line 814
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->over_sleep:I

    .line 815
    return-void
.end method

.method public setUpper_score(I)V
    .locals 0

    .line 806
    iput p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->upper_score:I

    .line 807
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 897
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->upper_score:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 898
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->over_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 899
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->lack_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 900
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->irregular_wake_up:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 901
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->late_fall_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 902
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_deep_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 903
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_breath_quality:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 904
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->over_REM_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 905
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->low_REM_sleep:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 906
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->early_wake_up:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 907
    iget v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;->easy_awake:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 908
    return-void
.end method
