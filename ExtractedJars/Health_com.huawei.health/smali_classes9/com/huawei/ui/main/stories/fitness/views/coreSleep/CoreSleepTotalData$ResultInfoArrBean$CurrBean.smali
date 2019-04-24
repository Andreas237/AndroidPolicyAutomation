.class public Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CurrBean"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MinBean;,
        Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MaxBean;,
        Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;,
        Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;>;"
        }
    .end annotation
.end field


# instance fields
.field private days:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;

.field private max:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MaxBean;

.field private mean:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;

.field private min:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MinBean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 736
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$4;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$4;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 726
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 727
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 729
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 730
    const-class v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->days:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;

    .line 731
    const-class v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->mean:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;

    .line 732
    const-class v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MaxBean;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MaxBean;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->max:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MaxBean;

    .line 733
    const-class v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MinBean;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MinBean;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->min:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MinBean;

    .line 734
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 715
    const/4 v0, 0x0

    return v0
.end method

.method public getDays()Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;
    .locals 1

    .line 88
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->days:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;

    return-object v0
.end method

.method public getMax()Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MaxBean;
    .locals 1

    .line 104
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->max:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MaxBean;

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MaxBean;

    return-object v0
.end method

.method public getMean()Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;
    .locals 1

    .line 96
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->mean:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;

    return-object v0
.end method

.method public getMin()Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MinBean;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->min:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MinBean;

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MinBean;

    return-object v0
.end method

.method public setDays(Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;)V
    .locals 0

    .line 92
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->days:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;

    .line 93
    return-void
.end method

.method public setMax(Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MaxBean;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->max:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MaxBean;

    .line 109
    return-void
.end method

.method public setMean(Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;)V
    .locals 0

    .line 100
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->mean:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;

    .line 101
    return-void
.end method

.method public setMin(Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MinBean;)V
    .locals 0

    .line 116
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->min:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MinBean;

    .line 117
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 720
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->days:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$DaysBean;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 721
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->mean:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MeanBean;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 722
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->max:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MaxBean;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 723
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean;->min:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$CurrBean$MinBean;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 724
    return-void
.end method
