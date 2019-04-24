.class public Lo/cxv;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 33
    const/4 v0, 0x5

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Lo/cxv;->d:[B

    return-void

    nop

    :array_0
    .array-data 1
        0x73t
        0x75t
        0x64t
        0x61t
        0x39t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static A(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1737
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1738
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 1740
    :pswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2WorkoutCapability() setSupportWorkout() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1741
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 1742
    goto/16 :goto_0

    .line 1744
    :pswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2WorkoutCapability() setSupportWorkoutInfo() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1745
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 1746
    goto/16 :goto_0

    .line 1748
    :pswitch_2
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2WorkoutCapability() setSupportWorkoutReminder() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1749
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 1750
    goto/16 :goto_0

    .line 1752
    :pswitch_3
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2WorkoutCapability() setSupportWorkoutRecord() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1753
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 1754
    goto/16 :goto_0

    .line 1756
    :pswitch_4
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2WorkoutCapability() setSupportWorkoutExerciseDisplayLink() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1757
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 1758
    goto :goto_0

    .line 1760
    :pswitch_5
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2WorkoutCapability() setSupportWorkoutRecordPaceMap() supportvalue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1761
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 1762
    goto :goto_0

    .line 1764
    :pswitch_6
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2WorkoutCapability() COMMAND_ID_RUN_POSTURE_REPORT() supportvalue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1765
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportRunPosture(Z)V

    .line 1766
    .line 1771
    :cond_0
    :goto_0
    :pswitch_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_7
        :pswitch_7
        :pswitch_1
        :pswitch_7
        :pswitch_2
        :pswitch_3
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_4
        :pswitch_5
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method

.method private static B(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1811
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1812
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1814
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2HeartRateCapability() COMMAND_ID_MULTSIM_OPEN_ESIM = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1815
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportEsim(Z)V

    .line 1816
    goto :goto_0

    .line 1818
    :sswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2HeartRateCapability() COMMAND_ID_MULTSIM_QUIRE_SIM_INFO = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1819
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMultiSim(Z)V

    .line 1820
    .line 1825
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x6 -> :sswitch_1
    .end sparse-switch
.end method

.method private static C(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1833
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1834
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1836
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2MidwareCapability() COMMAND_ID_MID_WARE = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1837
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMidware(Z)V

    .line 1838
    .line 1843
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static D(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1780
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1781
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 1783
    :pswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2GPSLocationCapability() setSupportGPSLocation() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1784
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 1785
    goto/16 :goto_0

    .line 1787
    :pswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2GPSLocationCapability() setSupportGPSData() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1788
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 1789
    goto :goto_0

    .line 1791
    :pswitch_2
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2GPSLocationCapability() setSupportGPSSetParameter() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1792
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSSetParameter(Z)V

    .line 1793
    goto :goto_0

    .line 1795
    :pswitch_3
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2GPSLocationCapability() getPostProcessingInfo() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1796
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSPostProcessing(Z)V

    .line 1797
    .line 1802
    :cond_0
    :goto_0
    :pswitch_4
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method private static E(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1933
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1934
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1936
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2AccountCapability() COMMAND_ID_MID_WARE = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1937
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAccount(Z)V

    .line 1938
    .line 1943
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static F(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1852
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1853
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1855
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2HeartRateCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1856
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 1857
    goto :goto_0

    .line 1859
    :sswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2HeartRateCapability() stress supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1860
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportStressInfo(Z)V

    .line 1861
    .line 1866
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x4 -> :sswitch_1
    .end sparse-switch
.end method

.method private static G(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1875
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1876
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1878
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2WalletCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1879
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPay(Z)V

    .line 1880
    .line 1885
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static H(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1894
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1895
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1897
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2StressCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1898
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportStress(Z)V

    .line 1899
    goto :goto_0

    .line 1901
    :sswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "COMMAND_ID_SET_PRESS_SWITCH handleV2StressCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1902
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configruePressAutoMonitor(Z)V

    .line 1903
    .line 1908
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x9 -> :sswitch_1
    .end sparse-switch
.end method

.method private static I(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1952
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1953
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1955
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2AccountCapability() COMMAND_ID_MID_WARE = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1956
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportOneLevelMenu(Z)V

    .line 1957
    .line 1962
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static J(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1991
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1992
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1994
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2PostureCapability() COMMAND_ID_POSTURE_VERSION = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1995
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPosture(Z)V

    .line 1996
    .line 2001
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static K(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 2009
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 2010
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 2012
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2MusicControlCapability() COMMAND_ID_MUSIC_CONTROL = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2013
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMusicControl(Z)V

    .line 2014
    .line 2019
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static L(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 2028
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 2029
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 2031
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handV2WorkModeCapability COMMAND_ID_AUTO_DETECT_MODE = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2032
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAutoDetectMode(Z)V

    .line 2033
    goto :goto_0

    .line 2035
    :sswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handV2WorkModeCapability COMMAND_ID_FOOT_WEAR = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 2036
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportFootWear(Z)V

    .line 2037
    .line 2042
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method private static M(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1971
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1972
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1974
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2AccountCapability() COMMAND_ID_MID_WARE = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1975
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupport_atrial_operator(Z)V

    .line 1976
    .line 1981
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
    .end sparse-switch
.end method

.method private static a(IIZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 0

    .line 2131
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 2133
    :pswitch_0
    invoke-static {p1, p2, p3}, Lo/cxv;->j(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2134
    goto :goto_0

    .line 2136
    :pswitch_1
    invoke-static {p1, p2, p3}, Lo/cxv;->A(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2137
    goto :goto_0

    .line 2139
    :pswitch_2
    invoke-static {p1, p2, p3}, Lo/cxv;->D(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2140
    goto :goto_0

    .line 2142
    :pswitch_3
    invoke-static {p1, p2, p3}, Lo/cxv;->F(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2143
    goto :goto_0

    .line 2145
    :pswitch_4
    invoke-static {p1, p2, p3}, Lo/cxv;->G(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2146
    goto :goto_0

    .line 2148
    :pswitch_5
    invoke-static {p1, p2, p3}, Lo/cxv;->B(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2149
    goto :goto_0

    .line 2151
    :pswitch_6
    invoke-static {p1, p2, p3}, Lo/cxv;->H(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2152
    goto :goto_0

    .line 2154
    :pswitch_7
    invoke-static {p1, p2, p3}, Lo/cxv;->C(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2155
    goto :goto_0

    .line 2157
    :pswitch_8
    invoke-static {p1, p2, p3}, Lo/cxv;->E(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2158
    goto :goto_0

    .line 2160
    :pswitch_9
    invoke-static {p1, p2, p3}, Lo/cxv;->I(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2161
    goto :goto_0

    .line 2163
    :pswitch_a
    invoke-static {p1, p2, p3}, Lo/cxv;->M(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2164
    goto :goto_0

    .line 2166
    :pswitch_b
    invoke-static {p1, p2, p3}, Lo/cxv;->J(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2167
    goto :goto_0

    .line 2169
    :pswitch_c
    invoke-static {p1, p2, p3}, Lo/cxv;->K(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2170
    goto :goto_0

    .line 2172
    :pswitch_d
    invoke-static {p1, p2, p3}, Lo/cxv;->L(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2173
    .line 2177
    :goto_0
    :pswitch_e
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x16
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_8
        :pswitch_4
        :pswitch_e
        :pswitch_5
        :pswitch_e
        :pswitch_e
        :pswitch_6
        :pswitch_7
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_d
    .end packed-switch
.end method

.method public static a(ILcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 2230
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 2233
    :pswitch_0
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 2234
    goto :goto_0

    .line 2237
    :pswitch_1
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 2238
    goto :goto_0

    .line 2241
    :pswitch_2
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 2242
    goto :goto_0

    .line 2245
    :pswitch_3
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 2246
    goto :goto_0

    .line 2249
    :pswitch_4
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 2250
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 2251
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 2252
    .line 2256
    :goto_0
    :pswitch_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_5
        :pswitch_5
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private static a(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1187
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1188
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 1190
    :pswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2NotificationCapability() setMessage_alert() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1191
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 1192
    goto/16 :goto_0

    .line 1194
    :pswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2NotificationCapability() setSupportMessageAlertInfo() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1195
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 1196
    goto/16 :goto_0

    .line 1198
    :pswitch_2
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2NotificationCapability() setSupportMessageSupportInfo() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1199
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 1200
    goto/16 :goto_0

    .line 1202
    :pswitch_3
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2NotificationCapability() setSupportDeleteMsg() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1203
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportDeleteMsg(Z)V

    .line 1204
    goto :goto_0

    .line 1206
    :pswitch_4
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2NotificationCapability() setMessageCenterPushDevice() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1207
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 1208
    goto :goto_0

    .line 1210
    :pswitch_5
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2NotificationCapability() setWearMessagePush() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1211
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWearMessagePush(Z)V

    .line 1212
    .line 1217
    :cond_0
    :goto_0
    :pswitch_6
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_6
        :pswitch_6
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method private static a(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 2288
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 2290
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 2292
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 2294
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 2296
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 2298
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 2300
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 2302
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 2304
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 2306
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 2308
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 2310
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 2312
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 2316
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 2318
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 2320
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 2322
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 2326
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 2330
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 2338
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 2340
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 2342
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 2344
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 2346
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 2348
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 2350
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 2352
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 2354
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 2356
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 2360
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 2362
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 2364
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 2368
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 2372
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 2374
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 2376
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 2380
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 2382
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 2386
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 2394
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 2396
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 2412
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 2414
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 2416
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 2420
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 2422
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 2424
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 2426
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 2428
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 2430
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 2434
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 2436
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 2440
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 2444
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 2446
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 2448
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 2450
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 2452
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 2454
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 2456
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 2458
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 2460
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 2462
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 2464
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 2466
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 2468
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 2472
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 2474
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 2476
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 2478
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 2480
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 2481
    return-void
.end method

.method public static b(IIZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 1917
    const/4 v0, 0x0

    if-ne v0, p3, :cond_0

    .line 1918
    return-void

    .line 1920
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lo/cxv;->d(IIZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1921
    invoke-static {p0, p1, p2, p3}, Lo/cxv;->c(IIZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1922
    invoke-static {p0, p1, p2, p3}, Lo/cxv;->e(IIZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1923
    invoke-static {p0, p1, p2, p3}, Lo/cxv;->a(IIZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1924
    return-void
.end method

.method public static b(ILcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 0

    .line 2185
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 2188
    :pswitch_0
    invoke-static {p1}, Lo/cxv;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2189
    goto :goto_0

    .line 2193
    :pswitch_1
    invoke-static {p1}, Lo/cxv;->a(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2194
    goto :goto_0

    .line 2196
    :pswitch_2
    invoke-static {p1}, Lo/cxv;->h(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2197
    goto :goto_0

    .line 2200
    :pswitch_3
    invoke-static {p1}, Lo/cxv;->g(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2201
    goto :goto_0

    .line 2203
    :pswitch_4
    invoke-static {p1}, Lo/cxv;->i(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2204
    goto :goto_0

    .line 2206
    :pswitch_5
    invoke-static {p1}, Lo/cxv;->f(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2207
    goto :goto_0

    .line 2209
    :pswitch_6
    invoke-static {p1}, Lo/cxv;->l(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2210
    goto :goto_0

    .line 2217
    :pswitch_7
    invoke-static {p1}, Lo/cxv;->k(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2218
    .line 2222
    :goto_0
    :pswitch_8
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_1
        :pswitch_5
        :pswitch_8
        :pswitch_0
        :pswitch_6
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_4
        :pswitch_1
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_8
        :pswitch_7
        :pswitch_7
    .end packed-switch
.end method

.method private static b(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1146
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 1148
    :pswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setFactory_reset() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1149
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 1150
    goto/16 :goto_0

    .line 1152
    :pswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setSupportPairDevice() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1153
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 1154
    goto/16 :goto_0

    .line 1156
    :pswitch_2
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setSupportGetHandsetInfo() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1157
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 1158
    goto/16 :goto_0

    .line 1160
    :pswitch_3
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setSupportNotificationIntervalInfo() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1161
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 1162
    goto/16 :goto_0

    .line 1164
    :pswitch_4
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setSupportActivityType() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1165
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 1166
    goto :goto_0

    .line 1168
    :pswitch_5
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setSupportAuthenticDevice() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1169
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 1170
    goto :goto_0

    .line 1172
    :pswitch_6
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setGold_card() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1173
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 1174
    .line 1178
    :goto_0
    :pswitch_7
    return-void

    :pswitch_data_0
    .packed-switch 0xd
        :pswitch_0
        :pswitch_1
        :pswitch_7
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private static b(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 70
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 72
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 74
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 76
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 78
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 80
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 82
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 84
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 86
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 88
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 90
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 92
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 94
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 98
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 100
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 102
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 104
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 108
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 112
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 120
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 122
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 124
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 126
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 128
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 130
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 132
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 134
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 136
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 138
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 142
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 144
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 146
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 150
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 154
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 156
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 158
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 162
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 164
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 168
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 176
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 178
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 194
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 196
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 198
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 202
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 204
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 206
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 208
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 210
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 212
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 216
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 218
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 222
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 226
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 228
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 230
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 232
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 234
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 236
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 238
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 240
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 242
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 244
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 246
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 248
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 250
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 254
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 256
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 258
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 260
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 262
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 263
    return-void
.end method

.method private static c(IIZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 0

    .line 2074
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 2076
    :pswitch_0
    invoke-static {p1, p2, p3}, Lo/cxv;->p(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2077
    goto :goto_0

    .line 2079
    :pswitch_1
    invoke-static {p1, p2, p3}, Lo/cxv;->o(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2080
    goto :goto_0

    .line 2082
    :pswitch_2
    invoke-static {p1, p2, p3}, Lo/cxv;->m(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2083
    goto :goto_0

    .line 2085
    :pswitch_3
    invoke-static {p1, p2, p3}, Lo/cxv;->n(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2086
    goto :goto_0

    .line 2088
    :pswitch_4
    invoke-static {p1, p2, p3}, Lo/cxv;->s(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2089
    goto :goto_0

    .line 2091
    :pswitch_5
    invoke-static {p1, p2, p3}, Lo/cxv;->t(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2092
    goto :goto_0

    .line 2094
    :pswitch_6
    invoke-static {p1, p2, p3}, Lo/cxv;->r(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2095
    .line 2099
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private static c(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 1079
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1080
    return-void

    .line 1082
    :cond_0
    invoke-static {p0, p1, p2}, Lo/cxv;->e(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1083
    invoke-static {p0, p1, p2}, Lo/cxv;->b(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1084
    return-void
.end method

.method public static c(Landroid/content/Context;ILcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 6

    .line 42
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Enter handleV1V0DeviceCapability()."

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 43
    const/4 v0, -0x1

    if-eq v0, p1, :cond_0

    const/4 v0, 0x0

    if-ne v0, p2, :cond_1

    .line 44
    :cond_0
    const-string v0, "0xA0200008"

    const-string v1, "01"

    const-string v2, "ParseDeviceCapability"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const-string v4, "Parameter is incorrect."

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/4 v4, 0x1

    invoke-static {v0, v1, v4, v2, v3}, Lo/dho;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 45
    return-void

    .line 48
    :cond_1
    packed-switch p1, :pswitch_data_0

    goto :goto_0

    .line 50
    :pswitch_0
    invoke-static {p2}, Lo/cxv;->b(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 51
    goto :goto_0

    .line 53
    :pswitch_1
    invoke-static {p2}, Lo/cxv;->e(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 54
    goto :goto_0

    .line 56
    :pswitch_2
    invoke-static {p2}, Lo/cxv;->d(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 57
    .line 61
    :goto_0
    :pswitch_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_0
    .end packed-switch
.end method

.method public static c(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 879
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 881
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 883
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 885
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 887
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 889
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 891
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 893
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 895
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 897
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 899
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 901
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 903
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 907
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 909
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 911
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 913
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 917
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 921
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 929
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 931
    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 933
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 935
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 937
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 939
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 941
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 943
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 945
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 947
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 951
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 953
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 955
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 959
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 963
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 965
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 967
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 971
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 973
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 977
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 985
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 987
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 1003
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 1005
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 1007
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 1011
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 1013
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 1015
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 1017
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 1019
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 1024
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 1026
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 1030
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 1034
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 1036
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 1038
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 1040
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 1042
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 1044
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 1046
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 1048
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 1050
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 1052
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 1054
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 1056
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 1058
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 1062
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 1064
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 1066
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 1068
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 1070
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 1071
    return-void
.end method

.method private static d(IIZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 0

    .line 2045
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 2047
    :pswitch_0
    invoke-static {p1, p2, p3}, Lo/cxv;->c(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2048
    goto :goto_0

    .line 2050
    :pswitch_1
    invoke-static {p1, p2, p3}, Lo/cxv;->a(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2051
    goto :goto_0

    .line 2053
    :pswitch_2
    invoke-static {p1, p2, p3}, Lo/cxv;->d(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2054
    goto :goto_0

    .line 2056
    :pswitch_3
    invoke-static {p1, p2, p3}, Lo/cxv;->h(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2057
    goto :goto_0

    .line 2059
    :pswitch_4
    invoke-static {p1, p2, p3}, Lo/cxv;->k(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2060
    goto :goto_0

    .line 2062
    :pswitch_5
    invoke-static {p1, p2, p3}, Lo/cxv;->i(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2063
    goto :goto_0

    .line 2065
    :pswitch_6
    invoke-static {p1, p2, p3}, Lo/cxv;->f(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2066
    .line 2071
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public static d(ILcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 0

    .line 2278
    invoke-virtual {p1, p0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 2279
    return-void
.end method

.method private static d(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1226
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1227
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1229
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2AddressBookCapability() setContacts() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1230
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 1231
    .line 1236
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static d(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 675
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 677
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 679
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 681
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 683
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 685
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 687
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 689
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 691
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 693
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 695
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 697
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 699
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 703
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 705
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 707
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 709
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 713
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 717
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 725
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 727
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 729
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 731
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 733
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 735
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 737
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 739
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 741
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportCoreSleep(Z)V

    .line 743
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 745
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 749
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 751
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 753
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 757
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 761
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 763
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 765
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 769
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 771
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 775
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 783
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 785
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 801
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 803
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 805
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 809
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 811
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 813
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 815
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 817
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 819
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 823
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 825
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 829
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 833
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 835
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 837
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 839
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 841
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 843
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 845
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 847
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 849
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 851
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 853
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 855
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 857
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 861
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 863
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 865
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 867
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 869
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 870
    return-void
.end method

.method private static e(IIZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 0

    .line 2102
    packed-switch p0, :pswitch_data_0

    goto :goto_0

    .line 2104
    :pswitch_0
    invoke-static {p1, p2, p3}, Lo/cxv;->u(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2105
    goto :goto_0

    .line 2107
    :pswitch_1
    invoke-static {p1, p2, p3}, Lo/cxv;->q(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2108
    goto :goto_0

    .line 2110
    :pswitch_2
    invoke-static {p1, p2, p3}, Lo/cxv;->w(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2111
    goto :goto_0

    .line 2113
    :pswitch_3
    invoke-static {p1, p2, p3}, Lo/cxv;->y(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2114
    goto :goto_0

    .line 2116
    :pswitch_4
    invoke-static {p1, p2, p3}, Lo/cxv;->z(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2117
    goto :goto_0

    .line 2119
    :pswitch_5
    invoke-static {p1, p2, p3}, Lo/cxv;->v(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2120
    goto :goto_0

    .line 2122
    :pswitch_6
    invoke-static {p1, p2, p3}, Lo/cxv;->x(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 2123
    .line 2128
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method public static e(ILcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 2

    .line 2264
    shr-int/lit8 v0, p0, 0x5

    and-int/lit8 v0, v0, 0x1

    const/4 v1, 0x1

    if-ne v1, v0, :cond_0

    .line 2265
    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    goto :goto_0

    .line 2268
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 2270
    :goto_0
    return-void
.end method

.method private static e(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1087
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 1089
    :pswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setSupportTimeSetting() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1090
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 1091
    goto/16 :goto_0

    .line 1093
    :pswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setSupportGetFirmwareVersion() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1094
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 1095
    goto/16 :goto_0

    .line 1097
    :pswitch_2
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setSupportGetBattery() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1098
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 1099
    goto/16 :goto_0

    .line 1101
    :pswitch_3
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setAuto_light_screen() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1102
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 1103
    goto/16 :goto_0

    .line 1105
    :pswitch_4
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setRotate_switch_screen() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1106
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 1107
    goto/16 :goto_0

    .line 1109
    :pswitch_5
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setSupportLeftRightHandWearMode supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1110
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 1111
    goto/16 :goto_0

    .line 1113
    :pswitch_6
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setAvoid_disturb() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1114
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 1115
    goto/16 :goto_0

    .line 1117
    :pswitch_7
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setQueryAllowDisturbContent() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1119
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 1120
    goto/16 :goto_0

    .line 1122
    :pswitch_8
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setDeviceDefaultSwitch supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1124
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->setSupportDefaultSwitch(Z)V

    .line 1125
    goto/16 :goto_0

    .line 1127
    :pswitch_9
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() setSupportIntelligentHomeLinkage() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1128
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportIntelligentHomeLinkage(Z)V

    .line 1129
    goto :goto_0

    .line 1131
    :pswitch_a
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() configureIsSupportDoublePhone supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1133
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportPhonesInfo(Z)V

    .line 1134
    goto :goto_0

    .line 1137
    :pswitch_b
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2DMSCapability() configureIsSupportNotifyDeviceBroadCast supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1138
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportNotifyDeviceBroadCast(Z)V

    .line 1139
    .line 1143
    :goto_0
    :pswitch_c
    return-void

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
        :pswitch_c
        :pswitch_c
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_6
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_5
        :pswitch_4
        :pswitch_c
        :pswitch_7
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_8
        :pswitch_9
        :pswitch_b
        :pswitch_a
    .end packed-switch
.end method

.method private static e(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 474
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 476
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 478
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 480
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 482
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 484
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 486
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 488
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 490
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 492
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 494
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 496
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 498
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 502
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 504
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 506
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 508
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 512
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 516
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 524
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 526
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 528
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 530
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 532
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 534
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 536
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 538
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 540
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 542
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 546
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 548
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 550
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 554
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 558
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 560
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 562
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 566
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 568
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 572
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 580
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 582
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 598
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 600
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 602
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 606
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 608
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 610
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 612
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 614
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 616
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 620
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 622
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 626
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 630
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 632
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 634
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 636
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 638
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 640
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 642
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 644
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 646
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 648
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 650
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 652
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 654
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 657
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 659
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 661
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 663
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 665
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 666
    return-void
.end method

.method private static f(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 1300
    const/4 v0, 0x0

    if-ne v0, p2, :cond_0

    .line 1301
    return-void

    .line 1303
    :cond_0
    invoke-static {p0, p1, p2}, Lo/cxv;->g(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1304
    invoke-static {p0, p1, p2}, Lo/cxv;->l(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V

    .line 1305
    return-void
.end method

.method private static f(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 2490
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 2492
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 2494
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 2496
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 2498
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 2500
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 2502
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 2504
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 2506
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 2508
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 2510
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 2512
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 2514
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 2518
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 2520
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 2522
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 2524
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 2528
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 2532
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 2540
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 2542
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 2544
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 2546
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 2548
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 2550
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 2552
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 2554
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 2556
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 2558
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 2562
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 2564
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 2566
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 2570
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 2574
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 2576
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 2578
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 2582
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 2584
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 2588
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 2596
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 2598
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 2614
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 2616
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 2618
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 2622
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 2624
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 2626
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 2628
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 2630
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 2632
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 2636
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 2638
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 2642
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 2646
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 2648
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 2650
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 2652
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 2654
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 2656
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 2658
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 2660
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 2662
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 2664
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 2666
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 2668
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 2670
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 2674
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 2676
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 2678
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 2680
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 2682
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 2683
    return-void
.end method

.method private static g(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1308
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 1310
    :pswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setMotionGoalCap() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1311
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 1312
    goto/16 :goto_0

    .line 1314
    :pswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setSupportSportTotal() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1315
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSportTotal(Z)V

    .line 1316
    goto/16 :goto_0

    .line 1318
    :pswitch_2
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setFitness_frame_type() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1319
    if-eqz p1, :cond_0

    .line 1320
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    goto/16 :goto_0

    .line 1324
    :pswitch_3
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setActivity_reminder() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1325
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 1326
    goto/16 :goto_0

    .line 1328
    :pswitch_4
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() COMMAND_ID_SET_ACTIVE_REMINDER() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1329
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 1330
    goto :goto_0

    .line 1332
    :pswitch_5
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setFitness_frame_type() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1333
    if-eqz p1, :cond_0

    .line 1334
    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    goto :goto_0

    .line 1338
    :pswitch_6
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setSupportSetUserInfoEncrypt() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1339
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 1340
    .line 1344
    :cond_0
    :goto_0
    :pswitch_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_7
        :pswitch_1
        :pswitch_7
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method private static g(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 2692
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 2694
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 2696
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 2698
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 2700
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 2702
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 2704
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 2706
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 2708
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 2710
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 2712
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 2714
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 2716
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 2720
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 2722
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 2724
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 2726
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 2730
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 2734
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 2742
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 2744
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 2746
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 2748
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 2750
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 2752
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 2754
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 2756
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 2758
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureisSupportHeartRateEnable(Z)V

    .line 2760
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 2762
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 2766
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 2768
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 2770
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 2774
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 2778
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 2780
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 2782
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 2786
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 2788
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 2792
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 2800
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 2803
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 2819
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 2821
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 2823
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 2827
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 2829
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 2831
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 2833
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 2835
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 2837
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 2841
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 2843
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 2847
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 2851
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 2853
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 2855
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 2857
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 2859
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 2861
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 2863
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 2865
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 2867
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 2869
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 2871
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 2873
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 2875
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 2878
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 2880
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 2882
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 2884
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 2886
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 2887
    return-void
.end method

.method private static h(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1245
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1246
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1248
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2CallingCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1249
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 1250
    .line 1255
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static h(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 3108
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 3110
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 3112
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 3114
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 3116
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 3118
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 3120
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 3122
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 3124
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 3126
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 3128
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 3130
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 3132
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 3136
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 3138
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 3140
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 3142
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 3146
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 3150
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 3158
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 3160
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 3162
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 3164
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 3166
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 3168
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 3170
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 3172
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 3174
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 3176
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 3180
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 3182
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 3184
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 3188
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 3192
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 3194
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 3196
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 3200
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 3202
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 3206
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 3214
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 3216
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 3232
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 3234
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 3236
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 3240
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 3242
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 3244
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 3246
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 3248
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 3250
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 3254
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 3256
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 3260
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 3264
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 3266
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 3268
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 3270
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 3272
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 3274
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 3276
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 3278
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 3280
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 3282
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 3284
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 3286
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 3288
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 3291
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 3293
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 3295
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 3297
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 3299
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 3300
    return-void
.end method

.method private static i(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1282
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1283
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1285
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2MusicCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1286
    .line 1291
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static i(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 2896
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 2898
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 2900
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 2902
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 2904
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 2906
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 2908
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 2910
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 2912
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 2914
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 2916
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 2918
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 2920
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 2924
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 2926
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 2928
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 2930
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 2934
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 2938
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 2946
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 2948
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 2950
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 2952
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 2954
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 2956
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 2958
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 2960
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 2962
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureisSupportHeartRateEnable(Z)V

    .line 2964
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 2966
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 2970
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 2972
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 2974
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 2978
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 2982
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 2984
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 2986
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 2990
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 2992
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 2996
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 3004
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 3006
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 3022
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 3024
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 3026
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 3030
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 3032
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 3034
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 3036
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 3038
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 3040
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 3044
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 3046
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 3050
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 3054
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 3056
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 3058
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 3060
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 3062
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 3064
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 3066
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 3068
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 3070
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 3072
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 3074
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 3076
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 3078
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 3081
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 3083
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 3085
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 3087
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 3089
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 3090
    return-void
.end method

.method private static j(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1710
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1711
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 1713
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2ExerciseAdviceCapability() setSupportExerciseAdvice() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1714
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 1715
    goto :goto_0

    .line 1717
    :sswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2ExerciseAdviceCapability() setSupportExerciseAdviceTime() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1718
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 1719
    goto :goto_0

    .line 1721
    :sswitch_2
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2ExerciseAdviceCapability() setSupportExerciseAdviceMonitor() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1722
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 1723
    .line 1728
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x3 -> :sswitch_1
        0x7 -> :sswitch_2
    .end sparse-switch
.end method

.method private static k(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1264
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1265
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1267
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2PingRingCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1268
    .line 1273
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static k(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 3097
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 3098
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 3099
    return-void
.end method

.method private static l(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1347
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 1349
    :pswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setSupportSampleFrame() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1350
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 1351
    if-eqz p1, :cond_0

    .line 1352
    const/4 v0, 0x3

    invoke-virtual {p2, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    goto/16 :goto_0

    .line 1356
    :pswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setSupportThreshold() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1357
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 1358
    goto/16 :goto_0

    .line 1360
    :pswitch_2
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setReserveSync() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1361
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 1362
    goto/16 :goto_0

    .line 1364
    :pswitch_3
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setIsSupportHRZone() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1365
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 1366
    goto/16 :goto_0

    .line 1368
    :pswitch_4
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setIsSupportCoreSleep() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1369
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportCoreSleep(Z)V

    .line 1370
    goto/16 :goto_0

    .line 1372
    :pswitch_5
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setIsSupportSendCoreSleepOutState() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1373
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 1374
    goto/16 :goto_0

    .line 1376
    :pswitch_6
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setIsSupportQueryDeviceCoreSleepSwitch() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1377
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 1378
    goto/16 :goto_0

    .line 1381
    :pswitch_7
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setIsSupportHeartRateEnable() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1382
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureisSupportHeartRateEnable(Z)V

    .line 1383
    goto/16 :goto_0

    .line 1385
    :pswitch_8
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setSupportGetUserInfo() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1386
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetUserInfo(Z)V

    .line 1387
    goto/16 :goto_0

    .line 1389
    :pswitch_9
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setSupportContinueHeartRate() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1390
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportContinueHeartRate(Z)V

    .line 1391
    goto/16 :goto_0

    .line 1393
    :pswitch_a
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setSupportHeartRateRaiseAlarm() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1394
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureHeartRateRaiseAlarm(Z)V

    .line 1395
    goto/16 :goto_0

    .line 1397
    :pswitch_b
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() setSupportGetHeartRateRaiseAlarmNumber() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1398
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGetHeartRateRaiseAlarmNumber(Z)V

    .line 1399
    goto :goto_0

    .line 1401
    :pswitch_c
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() configureGetHighAndMiddleSport() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1402
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGetHighAndMiddleSport(Z)V

    .line 1403
    goto :goto_0

    .line 1405
    :pswitch_d
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FitnessCapability() configureSetHrrHeartRateCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1406
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSetHrrHeartRateCapability(Z)V

    .line 1407
    .line 1411
    :cond_0
    :goto_0
    :pswitch_e
    return-void

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_e
        :pswitch_e
        :pswitch_e
        :pswitch_1
        :pswitch_e
        :pswitch_2
        :pswitch_e
        :pswitch_e
        :pswitch_3
        :pswitch_e
        :pswitch_8
        :pswitch_4
        :pswitch_7
        :pswitch_5
        :pswitch_e
        :pswitch_e
        :pswitch_6
        :pswitch_9
        :pswitch_a
        :pswitch_b
        :pswitch_c
        :pswitch_e
        :pswitch_d
    .end packed-switch
.end method

.method private static l(Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 1

    .line 3309
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportTimeSetting(Z)V

    .line 3311
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetFirmwareVersion(Z)V

    .line 3313
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetBattery(Z)V

    .line 3315
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAuto_light_screen(Z)V

    .line 3317
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureAvoid_disturb(Z)V

    .line 3319
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFactory_reset(Z)V

    .line 3321
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportPairDevice(Z)V

    .line 3323
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGetHandsetInfo(Z)V

    .line 3325
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportNotificationIntervalInfo(Z)V

    .line 3327
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportActivityType(Z)V

    .line 3329
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAuthenticDevice(Z)V

    .line 3331
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureGold_card(Z)V

    .line 3333
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportLeftRightHandWearMode(Z)V

    .line 3337
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMessage_alert(Z)V

    .line 3339
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageAlertInfo(Z)V

    .line 3341
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportMessageSupportInfo(Z)V

    .line 3343
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureupportMessageCenterPushDevice(Z)V

    .line 3347
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureContacts(Z)V

    .line 3351
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportCallingOperationType(Z)V

    .line 3359
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMotionGoalCap(I)V

    .line 3361
    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureFitness_frame_type(I)V

    .line 3363
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureActivity_reminder(Z)V

    .line 3365
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSetUserInfoEncrypt(Z)V

    .line 3367
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportSampleFrame(Z)V

    .line 3369
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportThreshold(Z)V

    .line 3371
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureReserveSync(Z)V

    .line 3373
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHRZone(Z)V

    .line 3375
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportSendCoreSleepOutState(Z)V

    .line 3377
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportQueryDeviceCoreSleepSwitch(Z)V

    .line 3381
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 3383
    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm_num(I)V

    .line 3385
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 3389
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 3393
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 3395
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 3397
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 3401
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 3403
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 3407
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 3415
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 3417
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 3433
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdvice(Z)V

    .line 3435
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceTime(Z)V

    .line 3437
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportExerciseAdviceMonitor(Z)V

    .line 3441
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkout(Z)V

    .line 3443
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutInfo(Z)V

    .line 3445
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutReminder(Z)V

    .line 3447
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecord(Z)V

    .line 3449
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutExerciseDisplayLink(Z)V

    .line 3451
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportWorkoutRecordPaceMap(Z)V

    .line 3455
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSLocation(Z)V

    .line 3457
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportGPSData(Z)V

    .line 3461
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportHeartRateInfo(Z)V

    .line 3463
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportStressInfo(Z)V

    .line 3467
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep(Z)V

    .line 3469
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureClimb(Z)V

    .line 3471
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRiding(Z)V

    .line 3473
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStand(Z)V

    .line 3475
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_shallow(Z)V

    .line 3477
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSleep_deep(Z)V

    .line 3479
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWalk(Z)V

    .line 3481
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRun(Z)V

    .line 3483
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureStep(Z)V

    .line 3485
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCalorie(Z)V

    .line 3487
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistance(Z)V

    .line 3489
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHeartRate(Z)V

    .line 3491
    const/4 v0, -0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configurePromptPush(I)V

    .line 3494
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureCall_mute(Z)V

    .line 3496
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureIsSupportHelp(Z)V

    .line 3498
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureDistanceDetail(Z)V

    .line 3500
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureRotate_switch_screen(Z)V

    .line 3502
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportQueryAllowDisturbContent(Z)V

    .line 3503
    return-void
.end method

.method private static m(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1470
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1471
    sparse-switch p0, :sswitch_data_0

    goto/16 :goto_0

    .line 1473
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2MaintenanceCapability() setMaintenance() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1474
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance(Z)V

    .line 1475
    goto :goto_0

    .line 1477
    :sswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2MaintenanceCapability() setMaintenance_in_time() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1478
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_in_time(Z)V

    .line 1479
    goto :goto_0

    .line 1481
    :sswitch_2
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2MaintenanceCapability() setMaintenance_get_data() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1482
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureMaintenance_get_data(Z)V

    .line 1483
    .line 1488
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x9 -> :sswitch_1
        0xa -> :sswitch_2
    .end sparse-switch
.end method

.method private static n(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1497
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1498
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1500
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2LinkLossCapability() setSupportAntiLost() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1501
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAntiLost(Z)V

    .line 1502
    goto :goto_0

    .line 1504
    :sswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2LinkLossCapability() setBluetooth_off_alert() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1505
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureBluetooth_off_alert(Z)V

    .line 1506
    .line 1511
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x3 -> :sswitch_1
    .end sparse-switch
.end method

.method private static o(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1447
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1448
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1450
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2OTACapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1451
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureOta_update(Z)V

    .line 1452
    goto :goto_0

    .line 1454
    :sswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2OTACapability() configureSyncBeforeOta = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1455
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSyncBeforeOta(Z)V

    .line 1456
    .line 1461
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0xb -> :sswitch_1
    .end sparse-switch
.end method

.method private static p(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1420
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1421
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 1423
    :pswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2AlarmCapability() setEvent_alarm() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1424
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureEvent_alarm(Z)V

    .line 1425
    goto :goto_0

    .line 1427
    :pswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2AlarmCapability() setSmart_alarm() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1428
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSmart_alarm(Z)V

    .line 1429
    goto :goto_0

    .line 1431
    :pswitch_2
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2AlarmCapability() setSmart_alarm() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1432
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureChange_alarm(Z)V

    .line 1433
    .line 1438
    :cond_0
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method private static q(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1602
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1603
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1605
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2CalendarCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1606
    .line 1611
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static r(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1557
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1558
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1560
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2MotionCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1561
    .line 1566
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static s(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1520
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1521
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1523
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FontCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1524
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureLanguage(Z)V

    .line 1525
    .line 1530
    :cond_0
    :goto_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static t(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1539
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1540
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1542
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2PhoneBatteryCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1543
    .line 1548
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static u(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1575
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1576
    packed-switch p0, :pswitch_data_0

    goto/16 :goto_0

    .line 1578
    :pswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2WeatherCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1579
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureWeather_push(Z)V

    .line 1580
    goto :goto_0

    .line 1582
    :pswitch_1
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2PushAtmosphereCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1583
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportAtmosphere(Z)V

    .line 1584
    goto :goto_0

    .line 1586
    :pswitch_2
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2PushUnitWeatherCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1587
    invoke-virtual {p2, p1}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->configureSupportUnitWeather(Z)V

    .line 1588
    .line 1593
    :cond_0
    :goto_0
    :pswitch_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_3
        :pswitch_2
    .end packed-switch
.end method

.method private static v(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1674
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1675
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1677
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2MCUFactoryTestCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1678
    .line 1683
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static w(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1620
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1621
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1623
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2MusicManagementCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1624
    .line 1629
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static x(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1692
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1693
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1695
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2SensorCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1696
    .line 1701
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static y(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1638
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1639
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1641
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2FileTransferCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1642
    .line 1647
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method

.method private static z(IZLcom/huawei/hwcommonmodel/datatypes/DeviceCapability;)V
    .locals 5

    .line 1656
    const/4 v0, 0x0

    if-eq v0, p2, :cond_0

    .line 1657
    sparse-switch p0, :sswitch_data_0

    goto :goto_0

    .line 1659
    :sswitch_0
    const-string v0, "01"

    const-string v1, "ParseDeviceCapability"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "handleV2BTFactoryTestCapability() supportValue = "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1660
    .line 1665
    :cond_0
    :goto_0
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
    .end sparse-switch
.end method
