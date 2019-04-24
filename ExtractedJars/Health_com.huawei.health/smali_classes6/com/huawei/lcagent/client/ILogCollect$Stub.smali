.class public abstract Lcom/huawei/lcagent/client/ILogCollect$Stub;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/lcagent/client/ILogCollect;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/lcagent/client/ILogCollect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Stub"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;
    }
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "com.huawei.lcagent.client.ILogCollect"

.field static final TRANSACTION_allowUploadAlways:I = 0xa

.field static final TRANSACTION_allowUploadInMobileNetwork:I = 0x9

.field static final TRANSACTION_captureAllLog:I = 0xf

.field static final TRANSACTION_captureLogMetric:I = 0x6

.field static final TRANSACTION_clearLogMetric:I = 0x7

.field static final TRANSACTION_configure:I = 0xe

.field static final TRANSACTION_configureAPlogs:I = 0x16

.field static final TRANSACTION_configureBluetoothlogcat:I = 0x14

.field static final TRANSACTION_configureCoredump:I = 0x17

.field static final TRANSACTION_configureGPS:I = 0x18

.field static final TRANSACTION_configureLogcat:I = 0x15

.field static final TRANSACTION_configureModemlogcat:I = 0x13

.field static final TRANSACTION_configureUserType:I = 0xb

.field static final TRANSACTION_configureWithPara:I = 0x19

.field static final TRANSACTION_feedbackUploadResult:I = 0x8

.field static final TRANSACTION_forceUpload:I = 0xd

.field static final TRANSACTION_getCompressInfo:I = 0x1a

.field static final TRANSACTION_getFirstErrorTime:I = 0x10

.field static final TRANSACTION_getFirstErrorType:I = 0x12

.field static final TRANSACTION_getUserType:I = 0xc

.field static final TRANSACTION_resetFirstErrorTime:I = 0x11

.field static final TRANSACTION_setMetricCommonHeader:I = 0x2

.field static final TRANSACTION_setMetricStoargeHeader:I = 0x1

.field static final TRANSACTION_setMetricStoargeTail:I = 0x3

.field static final TRANSACTION_shouldSubmitMetric:I = 0x5

.field static final TRANSACTION_submitMetric:I = 0x4


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 16
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p0, p0, v0}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 17
    return-void
.end method

.method public static asInterface(Landroid/os/IBinder;)Lcom/huawei/lcagent/client/ILogCollect;
    .locals 2

    .line 24
    if-nez p0, :cond_0

    .line 25
    const/4 v0, 0x0

    return-object v0

    .line 27
    :cond_0
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    instance-of v0, v1, Lcom/huawei/lcagent/client/ILogCollect;

    if-eqz v0, :cond_1

    .line 29
    move-object v0, v1

    check-cast v0, Lcom/huawei/lcagent/client/ILogCollect;

    return-object v0

    .line 31
    :cond_1
    new-instance v0, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;

    invoke-direct {v0, p0}, Lcom/huawei/lcagent/client/ILogCollect$Stub$Proxy;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 35
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 6

    .line 39
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_6

    .line 43
    :sswitch_0
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    const/4 v0, 0x1

    return v0

    .line 48
    :sswitch_1
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 52
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v2

    .line 54
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 55
    invoke-virtual {p0, v1, v2, v3}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->setMetricStoargeHeader(I[BI)I

    move-result v4

    .line 56
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 57
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 58
    const/4 v0, 0x1

    return v0

    .line 62
    :sswitch_2
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 64
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 66
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v2

    .line 68
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 69
    invoke-virtual {p0, v1, v2, v3}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->setMetricCommonHeader(I[BI)I

    move-result v4

    .line 70
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 71
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 72
    const/4 v0, 0x1

    return v0

    .line 76
    :sswitch_3
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 78
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 80
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v2

    .line 82
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 83
    invoke-virtual {p0, v1, v2, v3}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->setMetricStoargeTail(I[BI)I

    move-result v4

    .line 84
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 85
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 86
    const/4 v0, 0x1

    return v0

    .line 90
    :sswitch_4
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 92
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 94
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 96
    invoke-virtual {p2}, Landroid/os/Parcel;->createByteArray()[B

    move-result-object v3

    .line 98
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v4

    .line 99
    invoke-virtual {p0, v1, v2, v3, v4}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->submitMetric(II[BI)I

    move-result v5

    .line 100
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 101
    invoke-virtual {p3, v5}, Landroid/os/Parcel;->writeInt(I)V

    .line 102
    const/4 v0, 0x1

    return v0

    .line 106
    :sswitch_5
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 108
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 110
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 111
    invoke-virtual {p0, v1, v2}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->shouldSubmitMetric(II)Z

    move-result v3

    .line 112
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 113
    if-eqz v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 114
    const/4 v0, 0x1

    return v0

    .line 118
    :sswitch_6
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 120
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 121
    invoke-virtual {p0, v1}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->captureLogMetric(I)Lcom/huawei/lcagent/client/LogMetricInfo;

    move-result-object v2

    .line 122
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 123
    if-eqz v2, :cond_1

    .line 124
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 125
    const/4 v0, 0x1

    invoke-virtual {v2, p3, v0}, Lcom/huawei/lcagent/client/LogMetricInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 128
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 130
    :goto_1
    const/4 v0, 0x1

    return v0

    .line 134
    :sswitch_7
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 136
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    .line 137
    invoke-virtual {p0, v1, v2}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->clearLogMetric(J)V

    .line 138
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 139
    const/4 v0, 0x1

    return v0

    .line 143
    :sswitch_8
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 145
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    .line 147
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 148
    invoke-virtual {p0, v1, v2, v3}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->feedbackUploadResult(JI)I

    move-result v4

    .line 149
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 150
    invoke-virtual {p3, v4}, Landroid/os/Parcel;->writeInt(I)V

    .line 151
    const/4 v0, 0x1

    return v0

    .line 155
    :sswitch_9
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 157
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 158
    :goto_2
    invoke-virtual {p0, v1}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->allowUploadInMobileNetwork(Z)I

    move-result v2

    .line 159
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 160
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 161
    const/4 v0, 0x1

    return v0

    .line 165
    :sswitch_a
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 167
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    .line 168
    :goto_3
    invoke-virtual {p0, v1}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->allowUploadAlways(Z)I

    move-result v2

    .line 169
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 170
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 171
    const/4 v0, 0x1

    return v0

    .line 175
    :sswitch_b
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 177
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 178
    invoke-virtual {p0, v1}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->configureUserType(I)I

    move-result v2

    .line 179
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 180
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 181
    const/4 v0, 0x1

    return v0

    .line 185
    :sswitch_c
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 186
    invoke-virtual {p0}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->getUserType()I

    move-result v1

    .line 187
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 188
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 189
    const/4 v0, 0x1

    return v0

    .line 193
    :sswitch_d
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 194
    invoke-virtual {p0}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->forceUpload()I

    move-result v1

    .line 195
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 196
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 197
    const/4 v0, 0x1

    return v0

    .line 201
    :sswitch_e
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 203
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 204
    invoke-virtual {p0, v1}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->configure(Ljava/lang/String;)I

    move-result v2

    .line 205
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 206
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 207
    const/4 v0, 0x1

    return v0

    .line 211
    :sswitch_f
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 212
    invoke-virtual {p0}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->captureAllLog()Lcom/huawei/lcagent/client/LogMetricInfo;

    move-result-object v1

    .line 213
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 214
    if-eqz v1, :cond_4

    .line 215
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 216
    const/4 v0, 0x1

    invoke-virtual {v1, p3, v0}, Lcom/huawei/lcagent/client/LogMetricInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_4

    .line 219
    :cond_4
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 221
    :goto_4
    const/4 v0, 0x1

    return v0

    .line 225
    :sswitch_10
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 226
    invoke-virtual {p0}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->getFirstErrorTime()J

    move-result-wide v1

    .line 227
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 228
    invoke-virtual {p3, v1, v2}, Landroid/os/Parcel;->writeLong(J)V

    .line 229
    const/4 v0, 0x1

    return v0

    .line 233
    :sswitch_11
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 234
    invoke-virtual {p0}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->resetFirstErrorTime()I

    move-result v1

    .line 235
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 236
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 237
    const/4 v0, 0x1

    return v0

    .line 241
    :sswitch_12
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 242
    invoke-virtual {p0}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->getFirstErrorType()Ljava/lang/String;

    move-result-object v1

    .line 243
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 244
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 245
    const/4 v0, 0x1

    return v0

    .line 249
    :sswitch_13
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 251
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 253
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 254
    invoke-virtual {p0, v1, v2}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->configureModemlogcat(ILjava/lang/String;)I

    move-result v3

    .line 255
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 256
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 257
    const/4 v0, 0x1

    return v0

    .line 261
    :sswitch_14
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 263
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 265
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 266
    invoke-virtual {p0, v1, v2}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->configureBluetoothlogcat(ILjava/lang/String;)I

    move-result v3

    .line 267
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 268
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 269
    const/4 v0, 0x1

    return v0

    .line 273
    :sswitch_15
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 275
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 277
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 278
    invoke-virtual {p0, v1, v2}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->configureLogcat(ILjava/lang/String;)I

    move-result v3

    .line 279
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 280
    invoke-virtual {p3, v3}, Landroid/os/Parcel;->writeInt(I)V

    .line 281
    const/4 v0, 0x1

    return v0

    .line 285
    :sswitch_16
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 287
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 288
    invoke-virtual {p0, v1}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->configureAPlogs(I)I

    move-result v2

    .line 289
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 290
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 291
    const/4 v0, 0x1

    return v0

    .line 295
    :sswitch_17
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 297
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 298
    invoke-virtual {p0, v1}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->configureCoredump(I)I

    move-result v2

    .line 299
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 300
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 301
    const/4 v0, 0x1

    return v0

    .line 305
    :sswitch_18
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 307
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 308
    invoke-virtual {p0, v1}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->configureGPS(I)I

    move-result v2

    .line 309
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 310
    invoke-virtual {p3, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 311
    const/4 v0, 0x1

    return v0

    .line 315
    :sswitch_19
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 317
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v1

    .line 319
    invoke-virtual {p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v2

    .line 320
    invoke-virtual {p0, v1, v2}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->configureWithPara(Ljava/lang/String;Ljava/lang/String;)V

    .line 321
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 322
    const/4 v0, 0x1

    return v0

    .line 326
    :sswitch_1a
    const-string v0, "com.huawei.lcagent.client.ILogCollect"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 327
    invoke-virtual {p0}, Lcom/huawei/lcagent/client/ILogCollect$Stub;->getCompressInfo()Lcom/huawei/lcagent/client/CompressInfo;

    move-result-object v1

    .line 328
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 329
    if-eqz v1, :cond_5

    .line 330
    const/4 v0, 0x1

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 331
    const/4 v0, 0x1

    invoke-virtual {v1, p3, v0}, Lcom/huawei/lcagent/client/CompressInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_5

    .line 334
    :cond_5
    const/4 v0, 0x0

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 336
    :goto_5
    const/4 v0, 0x1

    return v0

    .line 339
    :goto_6
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_5
        0x6 -> :sswitch_6
        0x7 -> :sswitch_7
        0x8 -> :sswitch_8
        0x9 -> :sswitch_9
        0xa -> :sswitch_a
        0xb -> :sswitch_b
        0xc -> :sswitch_c
        0xd -> :sswitch_d
        0xe -> :sswitch_e
        0xf -> :sswitch_f
        0x10 -> :sswitch_10
        0x11 -> :sswitch_11
        0x12 -> :sswitch_12
        0x13 -> :sswitch_13
        0x14 -> :sswitch_14
        0x15 -> :sswitch_15
        0x16 -> :sswitch_16
        0x17 -> :sswitch_17
        0x18 -> :sswitch_18
        0x19 -> :sswitch_19
        0x1a -> :sswitch_1a
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
