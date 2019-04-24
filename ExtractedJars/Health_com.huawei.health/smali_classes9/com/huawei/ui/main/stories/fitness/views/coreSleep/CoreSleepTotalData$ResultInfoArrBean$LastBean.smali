.class public Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;
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
    name = "LastBean"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$MeanBeanX;,
        Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;>;"
        }
    .end annotation
.end field


# instance fields
.field private days:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;

.field private mean:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$MeanBeanX;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1094
    new-instance v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$2;

    invoke-direct {v0}, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$2;-><init>()V

    sput-object v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1086
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1087
    return-void
.end method

.method protected constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 1089
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1090
    const-class v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;->days:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;

    .line 1091
    const-class v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$MeanBeanX;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$MeanBeanX;

    iput-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;->mean:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$MeanBeanX;

    .line 1092
    return-void
.end method


# virtual methods
.method public describeContents()I
    .locals 1

    .line 1077
    const/4 v0, 0x0

    return v0
.end method

.method public getDays()Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;
    .locals 1

    .line 759
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;->days:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;

    return-object v0
.end method

.method public getMean()Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$MeanBeanX;
    .locals 1

    .line 767
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;->mean:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$MeanBeanX;

    invoke-static {v0}, Lo/fjd;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$MeanBeanX;

    return-object v0
.end method

.method public setDays(Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;)V
    .locals 0

    .line 763
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;->days:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;

    .line 764
    return-void
.end method

.method public setMean(Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$MeanBeanX;)V
    .locals 0

    .line 771
    iput-object p1, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;->mean:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$MeanBeanX;

    .line 772
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1082
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;->days:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$DaysBeanX;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 1083
    iget-object v0, p0, Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean;->mean:Lcom/huawei/ui/main/stories/fitness/views/coreSleep/CoreSleepTotalData$ResultInfoArrBean$LastBean$MeanBeanX;

    invoke-virtual {p1, v0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    .line 1084
    return-void
.end method
