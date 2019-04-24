.class public Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;>;"
        }
    .end annotation
.end field

.field public static final DEVICE_DATA_TYPE_AF:I = 0x4

.field public static final DEVICE_DATA_TYPE_COMMON:I = 0x1

.field public static final DEVICE_DATA_TYPE_COMPRESSED:I = 0x0

.field public static final DEVICE_DATA_TYPE_LEGENCY:I = 0x2

.field public static final DEVICE_DATA_TYPE_SEPARATED:I = 0x3

.field public static final MOTION_GOAL_CAP_CALORIE:I = 0x2

.field public static final MOTION_GOAL_CAP_DISTANCE:I = 0x4

.field public static final MOTION_GOAL_CAP_STEPS:I = 0x1


# instance fields
.field private activity_reminder:Z

.field private auto_light_screen:Z

.field private avoid_disturb:Z

.field private bluetooth_off_alert:Z

.field private call_mute:Z

.field private calorie:Z

.field private change_alarm:Z

.field private climb:Z

.field private contacts:Z

.field private distance:Z

.field private event_alarm:Z

.field private event_alarm_num:I

.field private factory_reset:Z

.field private fitness_frame_type:I

.field private gold_card:Z

.field private isPressAutoMonitor:Z

.field private isReserveSync:Z

.field private isSupportAccount:Z

.field private isSupportActivityType:Z

.field private isSupportAntiLost:Z

.field private isSupportAtmosphere:Z

.field private isSupportAuthenticDevice:Z

.field private isSupportAutoDetectMode:Z

.field private isSupportCallingOperationType:Z

.field private isSupportContinueHeartRate:Z

.field private isSupportCoreSleep:Z

.field private isSupportDefaultSwitch:Z

.field private isSupportDeleteMsg:Z

.field private isSupportDistanceDetail:Z

.field private isSupportEsim:Z

.field private isSupportExerciseAdvice:Z

.field private isSupportExerciseAdviceMonitor:Z

.field private isSupportExerciseAdviceTime:Z

.field private isSupportFootWear:Z

.field private isSupportGPSData:Z

.field private isSupportGPSLocation:Z

.field private isSupportGPSPostProcessing:Z

.field private isSupportGPSSetParameter:Z

.field private isSupportGetBattery:Z

.field private isSupportGetFirmwareVersion:Z

.field private isSupportGetHandsetInfo:Z

.field private isSupportGetHeartRateRaiseAlarmNumber:Z

.field private isSupportGetHighAndMiddleSport:Z

.field private isSupportGetUserInfo:Z

.field private isSupportHRZone:Z

.field private isSupportHeartRate:Z

.field private isSupportHeartRateEnable:Z

.field private isSupportHeartRateInfo:Z

.field private isSupportHeartRateRaiseAlarm:Z

.field private isSupportHelp:Z

.field private isSupportHrrHeartRateCapability:Z

.field private isSupportIntelligentHomeLinkage:Z

.field private isSupportLeftRightHandWearMode:Z

.field private isSupportMessageAlertInfo:Z

.field private isSupportMessageCenterPushDevice:Z

.field private isSupportMessageSupportInfo:Z

.field private isSupportMidware:Z

.field private isSupportMultiSim:Z

.field private isSupportMusicControl:Z

.field private isSupportNotificationIntervalInfo:Z

.field private isSupportNotifyDeviceBroadCast:Z

.field private isSupportOneLevelMenu:Z

.field private isSupportPairDevice:Z

.field private isSupportPay:Z

.field private isSupportPhonesInfo:Z

.field private isSupportPosture:Z

.field private isSupportQueryAllowDisturbContent:Z

.field private isSupportQueryCoreSleepSwitch:Z

.field private isSupportRunPosture:Z

.field private isSupportSampleFrame:Z

.field private isSupportSendCoreSleepOutState:Z

.field private isSupportSetUserInfoEncrypt:Z

.field private isSupportSportTotal:Z

.field private isSupportStress:Z

.field private isSupportStressInfo:Z

.field private isSupportThreshold:Z

.field private isSupportTimeSetting:Z

.field private isSupportUnitWeather:Z

.field private isSupportWearMessagePush:Z

.field private isSupportWorkout:Z

.field private isSupportWorkoutExerciseDisplayLink:Z

.field private isSupportWorkoutInfo:Z

.field private isSupportWorkoutRecord:Z

.field private isSupportWorkoutRecordPaceMap:Z

.field private isSupportWorkoutReminder:Z

.field private isSupport_atrial_operator:Z

.field private language:Z

.field private maintenance:Z

.field private maintenance_get_data:Z

.field private maintenance_in_time:Z

.field private message_alert:Z

.field private motionGoalCap:I

.field private need_sync_before_ota:Z

.field private ota_update:Z

.field private prompt_push:I

.field private riding:Z

.field private rotate_switch_screen:Z

.field private run:Z

.field private sleep:Z

.field private sleep_deep:Z

.field private sleep_shallow:Z

.field private smart_alarm:Z

.field private stand:Z

.field private step:Z

.field private walk:Z

.field private weather_push:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1676
    new-instance v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability$5;

    invoke-direct {v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability$5;-><init>()V

    sput-object v0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportTimeSetting:Z

    .line 36
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetFirmwareVersion:Z

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetBattery:Z

    .line 40
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->auto_light_screen:Z

    .line 42
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->avoid_disturb:Z

    .line 44
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->factory_reset:Z

    .line 46
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPairDevice:Z

    .line 48
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHandsetInfo:Z

    .line 50
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotificationIntervalInfo:Z

    .line 52
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportActivityType:Z

    .line 54
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAuthenticDevice:Z

    .line 56
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->gold_card:Z

    .line 60
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->message_alert:Z

    .line 62
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageAlertInfo:Z

    .line 64
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageSupportInfo:Z

    .line 66
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDeleteMsg:Z

    .line 68
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageCenterPushDevice:Z

    .line 70
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWearMessagePush:Z

    .line 72
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportIntelligentHomeLinkage:Z

    .line 76
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->contacts:Z

    .line 80
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCallingOperationType:Z

    .line 88
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSportTotal:Z

    .line 90
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->motionGoalCap:I

    .line 92
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->fitness_frame_type:I

    .line 94
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->activity_reminder:Z

    .line 96
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSetUserInfoEncrypt:Z

    .line 98
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSampleFrame:Z

    .line 100
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportThreshold:Z

    .line 102
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isReserveSync:Z

    .line 104
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHRZone:Z

    .line 106
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep:Z

    .line 108
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetUserInfo:Z

    .line 110
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateEnable:Z

    .line 112
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSendCoreSleepOutState:Z

    .line 114
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryCoreSleepSwitch:Z

    .line 118
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm:Z

    .line 120
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm_num:I

    .line 122
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->smart_alarm:Z

    .line 126
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->ota_update:Z

    .line 130
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance:Z

    .line 132
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_in_time:Z

    .line 134
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_get_data:Z

    .line 138
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAntiLost:Z

    .line 140
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->bluetooth_off_alert:Z

    .line 144
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->language:Z

    .line 152
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->weather_push:Z

    .line 168
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice:Z

    .line 170
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceTime:Z

    .line 172
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceMonitor:Z

    .line 176
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkout:Z

    .line 178
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutInfo:Z

    .line 180
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutReminder:Z

    .line 182
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecord:Z

    .line 184
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink:Z

    .line 186
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecordPaceMap:Z

    .line 189
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSLocation:Z

    .line 191
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSData:Z

    .line 193
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSSetParameter:Z

    .line 195
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSPostProcessing:Z

    .line 199
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo:Z

    .line 201
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStressInfo:Z

    .line 205
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep:Z

    .line 207
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->climb:Z

    .line 209
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->riding:Z

    .line 211
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->stand:Z

    .line 213
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_shallow:Z

    .line 215
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_deep:Z

    .line 217
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->walk:Z

    .line 219
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->run:Z

    .line 221
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->step:Z

    .line 223
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->calorie:Z

    .line 225
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->distance:Z

    .line 227
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRate:Z

    .line 229
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->prompt_push:I

    .line 233
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->call_mute:Z

    .line 235
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHelp:Z

    .line 237
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDistanceDetail:Z

    .line 240
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportEsim:Z

    .line 242
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMultiSim:Z

    .line 245
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPay:Z

    .line 247
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->rotate_switch_screen:Z

    .line 249
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportLeftRightHandWearMode:Z

    .line 251
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStress:Z

    .line 253
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMidware:Z

    .line 255
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAccount:Z

    .line 257
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportOneLevelMenu:Z

    .line 259
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl:Z

    .line 261
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryAllowDisturbContent:Z

    .line 263
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDefaultSwitch:Z

    .line 266
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPosture:Z

    .line 268
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isPressAutoMonitor:Z

    .line 270
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportContinueHeartRate:Z

    .line 272
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAtmosphere:Z

    .line 274
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportFootWear:Z

    .line 276
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAutoDetectMode:Z

    .line 278
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture:Z

    .line 280
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateRaiseAlarm:Z

    .line 282
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHeartRateRaiseAlarmNumber:Z

    .line 284
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHighAndMiddleSport:Z

    .line 286
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->change_alarm:Z

    .line 288
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->need_sync_before_ota:Z

    .line 290
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPhonesInfo:Z

    .line 292
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotifyDeviceBroadCast:Z

    .line 294
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportUnitWeather:Z

    .line 297
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHrrHeartRateCapability:Z

    .line 308
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupport_atrial_operator:Z

    return-void
.end method

.method private getByte(Z)I
    .locals 1

    .line 1673
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public configruePressAutoMonitor(Z)V
    .locals 1

    .line 580
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isPressAutoMonitor:Z

    .line 581
    return-void
.end method

.method public configureActivity_reminder(Z)V
    .locals 1

    .line 504
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->activity_reminder:Z

    .line 505
    return-void
.end method

.method public configureAuto_light_screen(Z)V
    .locals 1

    .line 576
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->auto_light_screen:Z

    .line 577
    return-void
.end method

.method public configureAvoid_disturb(Z)V
    .locals 1

    .line 544
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->avoid_disturb:Z

    .line 545
    return-void
.end method

.method public configureBluetooth_off_alert(Z)V
    .locals 1

    .line 512
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->bluetooth_off_alert:Z

    .line 513
    return-void
.end method

.method public configureCall_mute(Z)V
    .locals 1

    .line 560
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->call_mute:Z

    .line 561
    return-void
.end method

.method public configureCalorie(Z)V
    .locals 1

    .line 480
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->calorie:Z

    .line 481
    return-void
.end method

.method public configureChange_alarm(Z)V
    .locals 0

    .line 1098
    iput-boolean p1, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->change_alarm:Z

    .line 1099
    return-void
.end method

.method public configureClimb(Z)V
    .locals 1

    .line 416
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->climb:Z

    .line 417
    return-void
.end method

.method public configureContacts(Z)V
    .locals 1

    .line 600
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->contacts:Z

    .line 601
    return-void
.end method

.method public configureDistance(Z)V
    .locals 1

    .line 488
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->distance:Z

    .line 489
    return-void
.end method

.method public configureDistanceDetail(Z)V
    .locals 1

    .line 766
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDistanceDetail:Z

    .line 767
    return-void
.end method

.method public configureEvent_alarm(Z)V
    .locals 1

    .line 520
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm:Z

    .line 521
    return-void
.end method

.method public configureEvent_alarm_num(I)V
    .locals 1

    .line 528
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm_num:I

    .line 529
    return-void
.end method

.method public configureFactory_reset(Z)V
    .locals 1

    .line 616
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->factory_reset:Z

    .line 617
    return-void
.end method

.method public configureFitness_frame_type(I)V
    .locals 1

    .line 620
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->fitness_frame_type:I

    .line 621
    return-void
.end method

.method public configureGetHeartRateRaiseAlarmNumber(Z)V
    .locals 1

    .line 1079
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHeartRateRaiseAlarmNumber:Z

    .line 1080
    return-void
.end method

.method public configureGetHighAndMiddleSport(Z)V
    .locals 1

    .line 1083
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHighAndMiddleSport:Z

    .line 1084
    return-void
.end method

.method public configureGold_card(Z)V
    .locals 1

    .line 408
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->gold_card:Z

    .line 409
    return-void
.end method

.method public configureHeartRateRaiseAlarm(Z)V
    .locals 1

    .line 1063
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateRaiseAlarm:Z

    .line 1064
    return-void
.end method

.method public configureIsSupportCoreSleep(Z)V
    .locals 1

    .line 661
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep:Z

    .line 662
    return-void
.end method

.method public configureIsSupportHRZone(Z)V
    .locals 1

    .line 652
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHRZone:Z

    .line 653
    return-void
.end method

.method public configureIsSupportHeartRate(Z)V
    .locals 1

    .line 644
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRate:Z

    .line 645
    return-void
.end method

.method public configureIsSupportHelp(Z)V
    .locals 1

    .line 702
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHelp:Z

    .line 703
    return-void
.end method

.method public configureIsSupportNotifyDeviceBroadCast(Z)V
    .locals 1

    .line 1114
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotifyDeviceBroadCast:Z

    .line 1115
    return-void
.end method

.method public configureIsSupportPhonesInfo(Z)V
    .locals 1

    .line 1106
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPhonesInfo:Z

    .line 1107
    return-void
.end method

.method public configureIsSupportQueryDeviceCoreSleepSwitch(Z)V
    .locals 1

    .line 681
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryCoreSleepSwitch:Z

    .line 682
    return-void
.end method

.method public configureIsSupportSendCoreSleepOutState(Z)V
    .locals 1

    .line 673
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSendCoreSleepOutState:Z

    .line 674
    return-void
.end method

.method public configureLanguage(Z)V
    .locals 1

    .line 400
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->language:Z

    .line 401
    return-void
.end method

.method public configureMaintenance(Z)V
    .locals 1

    .line 746
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance:Z

    .line 747
    return-void
.end method

.method public configureMaintenance_get_data(Z)V
    .locals 1

    .line 762
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_get_data:Z

    .line 763
    return-void
.end method

.method public configureMaintenance_in_time(Z)V
    .locals 1

    .line 754
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_in_time:Z

    .line 755
    return-void
.end method

.method public configureMessage_alert(Z)V
    .locals 1

    .line 552
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->message_alert:Z

    .line 553
    return-void
.end method

.method public configureMotionGoalCap(I)V
    .locals 1

    .line 636
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->motionGoalCap:I

    .line 637
    return-void
.end method

.method public configureOta_update(Z)V
    .locals 1

    .line 608
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->ota_update:Z

    .line 609
    return-void
.end method

.method public configurePromptPush(I)V
    .locals 1

    .line 632
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->prompt_push:I

    .line 633
    return-void
.end method

.method public configureReserveSync(Z)V
    .locals 1

    .line 726
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isReserveSync:Z

    .line 727
    return-void
.end method

.method public configureRiding(Z)V
    .locals 1

    .line 424
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->riding:Z

    .line 425
    return-void
.end method

.method public configureRotate_switch_screen(Z)V
    .locals 1

    .line 592
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->rotate_switch_screen:Z

    .line 593
    return-void
.end method

.method public configureRun(Z)V
    .locals 1

    .line 464
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->run:Z

    .line 465
    return-void
.end method

.method public configureSetHrrHeartRateCapability(Z)V
    .locals 1

    .line 1091
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHrrHeartRateCapability:Z

    .line 1092
    return-void
.end method

.method public configureSleep(Z)V
    .locals 1

    .line 496
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep:Z

    .line 497
    return-void
.end method

.method public configureSleep_deep(Z)V
    .locals 1

    .line 448
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_deep:Z

    .line 449
    return-void
.end method

.method public configureSleep_shallow(Z)V
    .locals 1

    .line 440
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_shallow:Z

    .line 441
    return-void
.end method

.method public configureSmart_alarm(Z)V
    .locals 1

    .line 536
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->smart_alarm:Z

    .line 537
    return-void
.end method

.method public configureStand(Z)V
    .locals 1

    .line 432
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->stand:Z

    .line 433
    return-void
.end method

.method public configureStep(Z)V
    .locals 1

    .line 472
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->step:Z

    .line 473
    return-void
.end method

.method public configureSupportAccount(Z)V
    .locals 1

    .line 1020
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAccount:Z

    .line 1021
    return-void
.end method

.method public configureSupportActivityType(Z)V
    .locals 1

    .line 826
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportActivityType:Z

    .line 827
    return-void
.end method

.method public configureSupportAntiLost(Z)V
    .locals 1

    .line 906
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAntiLost:Z

    .line 907
    return-void
.end method

.method public configureSupportAtmosphere(Z)V
    .locals 1

    .line 1059
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAtmosphere:Z

    .line 1060
    return-void
.end method

.method public configureSupportAuthenticDevice(Z)V
    .locals 1

    .line 834
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAuthenticDevice:Z

    .line 835
    return-void
.end method

.method public configureSupportAutoDetectMode(Z)V
    .locals 1

    .line 2330
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAutoDetectMode:Z

    .line 2331
    return-void
.end method

.method public configureSupportCallingOperationType(Z)V
    .locals 1

    .line 874
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCallingOperationType:Z

    .line 875
    return-void
.end method

.method public configureSupportContinueHeartRate(Z)V
    .locals 1

    .line 1051
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportContinueHeartRate:Z

    .line 1052
    return-void
.end method

.method public configureSupportDeleteMsg(Z)V
    .locals 1

    .line 1035
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDeleteMsg:Z

    .line 1036
    return-void
.end method

.method public configureSupportEsim(Z)V
    .locals 1

    .line 388
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportEsim:Z

    .line 389
    return-void
.end method

.method public configureSupportExerciseAdvice(Z)V
    .locals 1

    .line 710
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice:Z

    .line 711
    return-void
.end method

.method public configureSupportExerciseAdviceMonitor(Z)V
    .locals 1

    .line 922
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceMonitor:Z

    .line 923
    return-void
.end method

.method public configureSupportExerciseAdviceTime(Z)V
    .locals 1

    .line 914
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceTime:Z

    .line 915
    return-void
.end method

.method public configureSupportFootWear(Z)V
    .locals 1

    .line 2322
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportFootWear:Z

    .line 2323
    return-void
.end method

.method public configureSupportGPSData(Z)V
    .locals 1

    .line 970
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSData:Z

    .line 971
    return-void
.end method

.method public configureSupportGPSLocation(Z)V
    .locals 1

    .line 734
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSLocation:Z

    .line 735
    return-void
.end method

.method public configureSupportGPSPostProcessing(Z)V
    .locals 1

    .line 987
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSPostProcessing:Z

    .line 988
    return-void
.end method

.method public configureSupportGPSSetParameter(Z)V
    .locals 1

    .line 979
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSSetParameter:Z

    .line 980
    return-void
.end method

.method public configureSupportGetBattery(Z)V
    .locals 1

    .line 794
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetBattery:Z

    .line 795
    return-void
.end method

.method public configureSupportGetFirmwareVersion(Z)V
    .locals 1

    .line 786
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetFirmwareVersion:Z

    .line 787
    return-void
.end method

.method public configureSupportGetHandsetInfo(Z)V
    .locals 1

    .line 810
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHandsetInfo:Z

    .line 811
    return-void
.end method

.method public configureSupportGetUserInfo(Z)V
    .locals 1

    .line 698
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetUserInfo:Z

    .line 699
    return-void
.end method

.method public configureSupportHeartRateInfo(Z)V
    .locals 1

    .line 995
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo:Z

    .line 996
    return-void
.end method

.method public configureSupportIntelligentHomeLinkage(Z)V
    .locals 1

    .line 323
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportIntelligentHomeLinkage:Z

    .line 324
    return-void
.end method

.method public configureSupportLeftRightHandWearMode(Z)V
    .locals 1

    .line 352
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportLeftRightHandWearMode:Z

    .line 353
    return-void
.end method

.method public configureSupportMessageAlertInfo(Z)V
    .locals 1

    .line 842
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageAlertInfo:Z

    .line 843
    return-void
.end method

.method public configureSupportMessageSupportInfo(Z)V
    .locals 1

    .line 850
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageSupportInfo:Z

    .line 851
    return-void
.end method

.method public configureSupportMidware(Z)V
    .locals 1

    .line 337
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMidware:Z

    .line 338
    return-void
.end method

.method public configureSupportMultiSim(Z)V
    .locals 1

    .line 392
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMultiSim:Z

    .line 393
    return-void
.end method

.method public configureSupportMusicControl(Z)V
    .locals 1

    .line 344
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl:Z

    .line 345
    return-void
.end method

.method public configureSupportNotificationIntervalInfo(Z)V
    .locals 1

    .line 818
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotificationIntervalInfo:Z

    .line 819
    return-void
.end method

.method public configureSupportOneLevelMenu(Z)V
    .locals 1

    .line 1028
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportOneLevelMenu:Z

    .line 1029
    return-void
.end method

.method public configureSupportPairDevice(Z)V
    .locals 1

    .line 802
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPairDevice:Z

    .line 803
    return-void
.end method

.method public configureSupportPay(Z)V
    .locals 1

    .line 376
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPay:Z

    .line 377
    return-void
.end method

.method public configureSupportPosture(Z)V
    .locals 1

    .line 1043
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPosture:Z

    .line 1044
    return-void
.end method

.method public configureSupportQueryAllowDisturbContent(Z)V
    .locals 1

    .line 360
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryAllowDisturbContent:Z

    .line 361
    return-void
.end method

.method public configureSupportRunPosture(Z)V
    .locals 1

    .line 2338
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture:Z

    .line 2339
    return-void
.end method

.method public configureSupportSampleFrame(Z)V
    .locals 1

    .line 890
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSampleFrame:Z

    .line 891
    return-void
.end method

.method public configureSupportSetUserInfoEncrypt(Z)V
    .locals 1

    .line 882
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSetUserInfoEncrypt:Z

    .line 883
    return-void
.end method

.method public configureSupportSportTotal(Z)V
    .locals 1

    .line 1012
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSportTotal:Z

    .line 1013
    return-void
.end method

.method public configureSupportStress(Z)V
    .locals 1

    .line 368
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStress:Z

    .line 369
    return-void
.end method

.method public configureSupportStressInfo(Z)V
    .locals 1

    .line 999
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStressInfo:Z

    .line 1000
    return-void
.end method

.method public configureSupportThreshold(Z)V
    .locals 1

    .line 898
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportThreshold:Z

    .line 899
    return-void
.end method

.method public configureSupportTimeSetting(Z)V
    .locals 1

    .line 778
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportTimeSetting:Z

    .line 779
    return-void
.end method

.method public configureSupportUnitWeather(Z)V
    .locals 1

    .line 304
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportUnitWeather:Z

    .line 305
    return-void
.end method

.method public configureSupportWearMessagePush(Z)V
    .locals 1

    .line 866
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWearMessagePush:Z

    .line 867
    return-void
.end method

.method public configureSupportWorkout(Z)V
    .locals 1

    .line 718
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkout:Z

    .line 719
    return-void
.end method

.method public configureSupportWorkoutExerciseDisplayLink(Z)V
    .locals 1

    .line 954
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink:Z

    .line 955
    return-void
.end method

.method public configureSupportWorkoutInfo(Z)V
    .locals 1

    .line 930
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutInfo:Z

    .line 931
    return-void
.end method

.method public configureSupportWorkoutRecord(Z)V
    .locals 1

    .line 946
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecord:Z

    .line 947
    return-void
.end method

.method public configureSupportWorkoutRecordPaceMap(Z)V
    .locals 1

    .line 962
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecordPaceMap:Z

    .line 963
    return-void
.end method

.method public configureSupportWorkoutReminder(Z)V
    .locals 1

    .line 938
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutReminder:Z

    .line 939
    return-void
.end method

.method public configureSupport_atrial_operator(Z)V
    .locals 1

    .line 315
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupport_atrial_operator:Z

    .line 316
    return-void
.end method

.method public configureSyncBeforeOta(Z)V
    .locals 1

    .line 2346
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->need_sync_before_ota:Z

    .line 2347
    return-void
.end method

.method public configureWalk(Z)V
    .locals 1

    .line 456
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->walk:Z

    .line 457
    return-void
.end method

.method public configureWeather_push(Z)V
    .locals 1

    .line 568
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->weather_push:Z

    .line 569
    return-void
.end method

.method public configureisSupportHeartRateEnable(Z)V
    .locals 1

    .line 685
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateEnable:Z

    .line 686
    return-void
.end method

.method public configureupportMessageCenterPushDevice(Z)V
    .locals 1

    .line 858
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageCenterPushDevice:Z

    .line 859
    return-void
.end method

.method public describeContents()I
    .locals 1

    .line 1395
    const/4 v0, 0x0

    return v0
.end method

.method public getDistanceDetail()Z
    .locals 1

    .line 770
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDistanceDetail:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getEvent_alarm_num()I
    .locals 1

    .line 524
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm_num:I

    return v0
.end method

.method public getFitness_frame_type()I
    .locals 1

    .line 624
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->fitness_frame_type:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public getIsSupportHrrHeartRateCapability()Z
    .locals 1

    .line 1087
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHrrHeartRateCapability:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public getMotionGoalCap()I
    .locals 1

    .line 640
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->motionGoalCap:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public isActivity_reminder()Z
    .locals 1

    .line 500
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->activity_reminder:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isAuto_light_screen()Z
    .locals 1

    .line 572
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->auto_light_screen:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isAvoid_disturb()Z
    .locals 1

    .line 540
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->avoid_disturb:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isBluetooth_off_alert()Z
    .locals 1

    .line 508
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->bluetooth_off_alert:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isCall_mute()Z
    .locals 1

    .line 556
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->call_mute:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isCalorie()Z
    .locals 1

    .line 476
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->calorie:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isChange_alarm()Z
    .locals 1

    .line 1094
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->change_alarm:Z

    return v0
.end method

.method public isClimb()Z
    .locals 1

    .line 412
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->climb:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isContacts()Z
    .locals 1

    .line 596
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->contacts:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isDistance()Z
    .locals 1

    .line 484
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->distance:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isEvent_alarm()Z
    .locals 1

    .line 516
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isFactory_reset()Z
    .locals 1

    .line 612
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->factory_reset:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isGold_card()Z
    .locals 1

    .line 404
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->gold_card:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isLanguage()Z
    .locals 1

    .line 396
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->language:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isMaintenance()Z
    .locals 1

    .line 742
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isMaintenance_get_data()Z
    .locals 1

    .line 758
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_get_data:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isMaintenance_in_time()Z
    .locals 1

    .line 750
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_in_time:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isMessage_alert()Z
    .locals 1

    .line 548
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->message_alert:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isNeedSyncBeforeOta()Z
    .locals 1

    .line 2342
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->need_sync_before_ota:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isOta_update()Z
    .locals 1

    .line 604
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->ota_update:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isPromptPush()I
    .locals 1

    .line 628
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->prompt_push:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public isReserveSync()Z
    .locals 1

    .line 730
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isReserveSync:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isRiding()Z
    .locals 1

    .line 420
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->riding:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isRotate_switch_screen()Z
    .locals 1

    .line 588
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->rotate_switch_screen:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isRun()Z
    .locals 1

    .line 460
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->run:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSleep()Z
    .locals 1

    .line 492
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSleep_deep()Z
    .locals 1

    .line 444
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_deep:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSleep_shallow()Z
    .locals 1

    .line 436
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_shallow:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSmart_alarm()Z
    .locals 1

    .line 532
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->smart_alarm:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isStand()Z
    .locals 1

    .line 428
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->stand:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isStep()Z
    .locals 1

    .line 468
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->step:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportAccount()Z
    .locals 1

    .line 1016
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAccount:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportActivityType()Z
    .locals 1

    .line 822
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportActivityType:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportAntiLost()Z
    .locals 1

    .line 902
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAntiLost:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportAtmosphere()Z
    .locals 1

    .line 1055
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAtmosphere:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportAuthenticDevice()Z
    .locals 1

    .line 830
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAuthenticDevice:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportAutoDetectMode()Z
    .locals 1

    .line 2326
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAutoDetectMode:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportCallingOperationType()Z
    .locals 1

    .line 870
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCallingOperationType:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportContinueHeartRate()Z
    .locals 1

    .line 1047
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportContinueHeartRate:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportCoreSleep()Z
    .locals 1

    .line 665
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportDefaultSwitch()Z
    .locals 1

    .line 326
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDefaultSwitch:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportDeleteMsg()Z
    .locals 1

    .line 1031
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDeleteMsg:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportEsim()Z
    .locals 1

    .line 380
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportEsim:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportExerciseAdvice()Z
    .locals 1

    .line 714
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportExerciseAdviceMonitor()Z
    .locals 1

    .line 918
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceMonitor:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportExerciseAdviceTime()Z
    .locals 1

    .line 910
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceTime:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportFootWear()Z
    .locals 1

    .line 2318
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportFootWear:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportGPSData()Z
    .locals 1

    .line 966
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSData:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportGPSLocation()Z
    .locals 1

    .line 738
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSLocation:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportGPSPostProcessing()Z
    .locals 1

    .line 983
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSPostProcessing:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportGPSSetParameter()Z
    .locals 1

    .line 975
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSSetParameter:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportGetBattery()Z
    .locals 1

    .line 790
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetBattery:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportGetFirmwareVersion()Z
    .locals 1

    .line 782
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetFirmwareVersion:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportGetHandsetInfo()Z
    .locals 1

    .line 806
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHandsetInfo:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportGetHeartRateRaiseAlarmNumber()Z
    .locals 1

    .line 1071
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHeartRateRaiseAlarmNumber:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportGetHighAndMiddleSport()Z
    .locals 1

    .line 1075
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHighAndMiddleSport:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportGetUserInfo()Z
    .locals 1

    .line 694
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetUserInfo:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportHRZone()Z
    .locals 1

    .line 656
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHRZone:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportHeartRate()Z
    .locals 1

    .line 648
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRate:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportHeartRateEnable()Z
    .locals 1

    .line 689
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateEnable:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportHeartRateInfo()Z
    .locals 1

    .line 991
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportHeartRateRaiseAlarm()Z
    .locals 1

    .line 1067
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateRaiseAlarm:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportHelp()Z
    .locals 1

    .line 706
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHelp:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportIntelligentHomeLinkage()Z
    .locals 1

    .line 319
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportIntelligentHomeLinkage:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportLeftRightHandWearMode()Z
    .locals 1

    .line 348
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportLeftRightHandWearMode:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportMessageAlertInfo()Z
    .locals 1

    .line 838
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageAlertInfo:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportMessageCenterPushDevice()Z
    .locals 1

    .line 854
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageCenterPushDevice:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportMessageSupportInfo()Z
    .locals 1

    .line 846
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageSupportInfo:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportMidware()Z
    .locals 1

    .line 333
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMidware:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportMultiSim()Z
    .locals 1

    .line 384
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMultiSim:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportMusicControl()Z
    .locals 1

    .line 340
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportNotificationIntervalInfo()Z
    .locals 1

    .line 814
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotificationIntervalInfo:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportNotifyDeviceBroadCast()Z
    .locals 1

    .line 1110
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotifyDeviceBroadCast:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportOneLevelMenu()Z
    .locals 1

    .line 1024
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportOneLevelMenu:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportPairDevice()Z
    .locals 1

    .line 798
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPairDevice:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportPay()Z
    .locals 1

    .line 372
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPay:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportPhonesInfo()Z
    .locals 1

    .line 1102
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPhonesInfo:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportPosture()Z
    .locals 1

    .line 1039
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPosture:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportPressAutoMonitor()Z
    .locals 1

    .line 584
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isPressAutoMonitor:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportQueryAllowDisturbContent()Z
    .locals 1

    .line 356
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryAllowDisturbContent:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportQueryDeviceCoreSleepSwitch()Z
    .locals 1

    .line 677
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryCoreSleepSwitch:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportRunPosture()Z
    .locals 1

    .line 2334
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportSampleFrame()Z
    .locals 1

    .line 886
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSampleFrame:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportSendCoreSleepOutState()Z
    .locals 1

    .line 669
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSendCoreSleepOutState:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportSetUserInfoEncrypt()Z
    .locals 1

    .line 878
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSetUserInfoEncrypt:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportSportTotal()Z
    .locals 1

    .line 1008
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSportTotal:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportStress()Z
    .locals 1

    .line 364
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStress:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportStressInfo()Z
    .locals 1

    .line 1004
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStressInfo:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportThreshold()Z
    .locals 1

    .line 894
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportThreshold:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportTimeSetting()Z
    .locals 1

    .line 774
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportTimeSetting:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportUnitWeather()Z
    .locals 1

    .line 300
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportUnitWeather:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportWearMessagePush()Z
    .locals 1

    .line 862
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWearMessagePush:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportWorkout()Z
    .locals 1

    .line 722
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkout:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportWorkoutExerciseDisplayLink()Z
    .locals 1

    .line 950
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportWorkoutInfo()Z
    .locals 1

    .line 926
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutInfo:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportWorkoutRecord()Z
    .locals 1

    .line 942
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecord:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportWorkoutRecordPaceMap()Z
    .locals 1

    .line 958
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecordPaceMap:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupportWorkoutReminder()Z
    .locals 1

    .line 934
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutReminder:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isSupport_atrial_operator()Z
    .locals 1

    .line 311
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupport_atrial_operator:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isValueChanged()Z
    .locals 3

    .line 2240
    const/4 v2, 0x0

    .line 2241
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportTimeSetting:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetFirmwareVersion:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetBattery:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->auto_light_screen:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->avoid_disturb:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->factory_reset:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPairDevice:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHandsetInfo:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotificationIntervalInfo:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportActivityType:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAuthenticDevice:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->gold_card:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->message_alert:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageAlertInfo:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageSupportInfo:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDeleteMsg:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageCenterPushDevice:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->contacts:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCallingOperationType:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSportTotal:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->motionGoalCap:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->fitness_frame_type:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->activity_reminder:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSetUserInfoEncrypt:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSampleFrame:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportThreshold:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isReserveSync:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHRZone:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetUserInfo:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateEnable:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSendCoreSleepOutState:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryCoreSleepSwitch:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm_num:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->smart_alarm:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->ota_update:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_in_time:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_get_data:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAntiLost:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->bluetooth_off_alert:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->language:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->weather_push:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceTime:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceMonitor:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkout:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutInfo:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutReminder:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecord:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecordPaceMap:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSLocation:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSData:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSSetParameter:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStressInfo:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->climb:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->riding:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->stand:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_shallow:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_deep:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->walk:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->run:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->step:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->calorie:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->distance:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRate:Z

    if-nez v0, :cond_0

    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->prompt_push:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->call_mute:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHelp:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDistanceDetail:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportEsim:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMultiSim:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPay:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->rotate_switch_screen:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportLeftRightHandWearMode:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStress:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMidware:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAccount:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportOneLevelMenu:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPosture:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isPressAutoMonitor:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportContinueHeartRate:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAtmosphere:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportFootWear:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAutoDetectMode:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateRaiseAlarm:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHeartRateRaiseAlarmNumber:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHighAndMiddleSport:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->change_alarm:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportIntelligentHomeLinkage:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->need_sync_before_ota:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPhonesInfo:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotifyDeviceBroadCast:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportUnitWeather:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupport_atrial_operator:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHrrHeartRateCapability:Z

    if-eqz v0, :cond_1

    :cond_0
    const/4 v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    .line 2314
    :goto_0
    return v2
.end method

.method public isWalk()Z
    .locals 1

    .line 452
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->walk:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public isWeather_push()Z
    .locals 1

    .line 564
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->weather_push:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public resetDeviceCapability()V
    .locals 1

    .line 1120
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportTimeSetting:Z

    .line 1122
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetFirmwareVersion:Z

    .line 1124
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetBattery:Z

    .line 1126
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->auto_light_screen:Z

    .line 1128
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->avoid_disturb:Z

    .line 1130
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->factory_reset:Z

    .line 1132
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPairDevice:Z

    .line 1134
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHandsetInfo:Z

    .line 1136
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotificationIntervalInfo:Z

    .line 1138
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportActivityType:Z

    .line 1140
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAuthenticDevice:Z

    .line 1142
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->gold_card:Z

    .line 1146
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->message_alert:Z

    .line 1148
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageAlertInfo:Z

    .line 1150
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageSupportInfo:Z

    .line 1154
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->contacts:Z

    .line 1158
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCallingOperationType:Z

    .line 1166
    const/4 v0, 0x1

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->motionGoalCap:I

    .line 1168
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->fitness_frame_type:I

    .line 1170
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->activity_reminder:Z

    .line 1172
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSetUserInfoEncrypt:Z

    .line 1174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSampleFrame:Z

    .line 1176
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportThreshold:Z

    .line 1178
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isReserveSync:Z

    .line 1180
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHRZone:Z

    .line 1183
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep:Z

    .line 1185
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSendCoreSleepOutState:Z

    .line 1187
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryCoreSleepSwitch:Z

    .line 1189
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageCenterPushDevice:Z

    .line 1191
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWearMessagePush:Z

    .line 1194
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetUserInfo:Z

    .line 1198
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm:Z

    .line 1200
    const/4 v0, 0x5

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm_num:I

    .line 1202
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->smart_alarm:Z

    .line 1206
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->ota_update:Z

    .line 1210
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance:Z

    .line 1212
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_in_time:Z

    .line 1214
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_get_data:Z

    .line 1218
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAntiLost:Z

    .line 1220
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->bluetooth_off_alert:Z

    .line 1224
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->language:Z

    .line 1232
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->weather_push:Z

    .line 1234
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportUnitWeather:Z

    .line 1250
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice:Z

    .line 1252
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceTime:Z

    .line 1254
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceMonitor:Z

    .line 1258
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkout:Z

    .line 1260
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutInfo:Z

    .line 1262
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutReminder:Z

    .line 1264
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecord:Z

    .line 1266
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink:Z

    .line 1268
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecordPaceMap:Z

    .line 1271
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSLocation:Z

    .line 1273
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSData:Z

    .line 1275
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSSetParameter:Z

    .line 1276
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSPostProcessing:Z

    .line 1280
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo:Z

    .line 1282
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateEnable:Z

    .line 1284
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStressInfo:Z

    .line 1288
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep:Z

    .line 1290
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->climb:Z

    .line 1292
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->riding:Z

    .line 1294
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->stand:Z

    .line 1296
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_shallow:Z

    .line 1298
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_deep:Z

    .line 1300
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->walk:Z

    .line 1302
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->run:Z

    .line 1304
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->step:Z

    .line 1306
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->calorie:Z

    .line 1308
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->distance:Z

    .line 1310
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRate:Z

    .line 1312
    const/4 v0, 0x0

    iput v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->prompt_push:I

    .line 1316
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->call_mute:Z

    .line 1318
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHelp:Z

    .line 1320
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDistanceDetail:Z

    .line 1323
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportEsim:Z

    .line 1325
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMultiSim:Z

    .line 1328
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPay:Z

    .line 1331
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->rotate_switch_screen:Z

    .line 1333
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportLeftRightHandWearMode:Z

    .line 1335
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStress:Z

    .line 1337
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMidware:Z

    .line 1341
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSportTotal:Z

    .line 1343
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAccount:Z

    .line 1345
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportOneLevelMenu:Z

    .line 1347
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDeleteMsg:Z

    .line 1349
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryAllowDisturbContent:Z

    .line 1352
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPosture:Z

    .line 1355
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl:Z

    .line 1358
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isPressAutoMonitor:Z

    .line 1360
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportContinueHeartRate:Z

    .line 1362
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAtmosphere:Z

    .line 1364
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAutoDetectMode:Z

    .line 1366
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportFootWear:Z

    .line 1368
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture:Z

    .line 1370
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateRaiseAlarm:Z

    .line 1372
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHeartRateRaiseAlarmNumber:Z

    .line 1374
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHighAndMiddleSport:Z

    .line 1376
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDefaultSwitch:Z

    .line 1378
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->change_alarm:Z

    .line 1380
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportIntelligentHomeLinkage:Z

    .line 1382
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->need_sync_before_ota:Z

    .line 1384
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPhonesInfo:Z

    .line 1386
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotifyDeviceBroadCast:Z

    .line 1388
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupport_atrial_operator:Z

    .line 1390
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHrrHeartRateCapability:Z

    .line 1391
    return-void
.end method

.method public setSupportDefaultSwitch(Z)V
    .locals 1

    .line 330
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-static {v0}, Lo/dbo;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDefaultSwitch:Z

    .line 331
    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    .line 1402
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportTimeSetting:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1404
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetFirmwareVersion:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1406
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetBattery:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1408
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->auto_light_screen:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1410
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->avoid_disturb:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1412
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->factory_reset:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1414
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPairDevice:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1416
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHandsetInfo:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1418
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotificationIntervalInfo:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1420
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportActivityType:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1422
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAuthenticDevice:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1424
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->gold_card:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1428
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->message_alert:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1430
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageAlertInfo:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1432
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageSupportInfo:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1434
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMessageCenterPushDevice:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1436
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWearMessagePush:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1440
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->contacts:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1444
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCallingOperationType:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1452
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->motionGoalCap:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1454
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->fitness_frame_type:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1456
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->activity_reminder:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1458
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSetUserInfoEncrypt:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1460
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSampleFrame:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1462
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportThreshold:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1464
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isReserveSync:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1466
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHRZone:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1468
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportCoreSleep:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1471
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetUserInfo:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1473
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSendCoreSleepOutState:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1475
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryCoreSleepSwitch:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1479
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1481
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->event_alarm_num:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1483
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->smart_alarm:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1487
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->ota_update:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1491
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1493
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_in_time:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1495
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->maintenance_get_data:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1500
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAntiLost:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1502
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->bluetooth_off_alert:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1506
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->language:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1514
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->weather_push:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1516
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportUnitWeather:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1532
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdvice:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1534
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceTime:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1536
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportExerciseAdviceMonitor:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1540
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkout:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1542
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutInfo:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1544
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutReminder:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1546
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecord:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1548
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutExerciseDisplayLink:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1550
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportWorkoutRecordPaceMap:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1553
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSLocation:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1555
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSData:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1557
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSSetParameter:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1559
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGPSPostProcessing:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1563
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateInfo:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1567
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1569
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->climb:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1571
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->riding:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1573
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->stand:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1575
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_shallow:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1577
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->sleep_deep:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1579
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->walk:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1581
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->run:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1583
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->step:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1585
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->calorie:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1587
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->distance:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1589
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRate:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1591
    iget v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->prompt_push:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 1595
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->call_mute:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1597
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHelp:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1599
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDistanceDetail:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1602
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportEsim:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1604
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMultiSim:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1607
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPay:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1610
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateEnable:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1613
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->rotate_switch_screen:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1615
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportQueryAllowDisturbContent:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1618
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportLeftRightHandWearMode:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1620
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportStress:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1622
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMidware:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1626
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportSportTotal:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1628
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAccount:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1630
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportOneLevelMenu:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1632
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDeleteMsg:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1634
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPosture:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1636
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportMusicControl:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1638
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isPressAutoMonitor:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1640
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportContinueHeartRate:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1642
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAtmosphere:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1643
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportAutoDetectMode:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1645
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportFootWear:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1647
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportRunPosture:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1649
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHeartRateRaiseAlarm:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1651
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHeartRateRaiseAlarmNumber:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1653
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportGetHighAndMiddleSport:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1655
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportDefaultSwitch:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1657
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->change_alarm:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1659
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportIntelligentHomeLinkage:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1661
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->need_sync_before_ota:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1663
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportPhonesInfo:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1665
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportNotifyDeviceBroadCast:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1667
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupport_atrial_operator:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1669
    iget-boolean v0, p0, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->isSupportHrrHeartRateCapability:Z

    invoke-direct {p0, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceCapability;->getByte(Z)I

    move-result v0

    int-to-byte v0, v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeByte(B)V

    .line 1670
    return-void
.end method
