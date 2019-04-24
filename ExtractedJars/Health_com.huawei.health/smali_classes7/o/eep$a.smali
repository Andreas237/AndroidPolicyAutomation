.class public abstract Lo/eep$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/eep;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eep;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eep$a$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 20
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    invoke-virtual {p0, p0, v0}, Lo/eep$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 21
    return-void
.end method

.method public static c(Landroid/os/IBinder;)Lo/eep;
    .locals 2

    .line 28
    if-nez p0, :cond_0

    .line 29
    const/4 v0, 0x0

    return-object v0

    .line 31
    :cond_0
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 32
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/eep;

    if-eqz v0, :cond_1

    .line 33
    move-object v0, v1

    check-cast v0, Lo/eep;

    return-object v0

    .line 35
    :cond_1
    new-instance v0, Lo/eep$a$b;

    invoke-direct {v0, p0}, Lo/eep$a$b;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 43
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_10

    .line 47
    :sswitch_0
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 48
    const/4 v0, 0x1

    return v0

    .line 52
    :sswitch_1
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 53
    invoke-virtual {p0}, Lo/eep$a;->c()I

    move-result v7

    .line 54
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 55
    move-object/from16 v0, p3

    invoke-virtual {v0, v7}, Landroid/os/Parcel;->writeInt(I)V

    .line 56
    const/4 v0, 0x1

    return v0

    .line 60
    :sswitch_2
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 61
    invoke-virtual {p0}, Lo/eep$a;->a()[Ljava/lang/String;

    move-result-object v7

    .line 62
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 63
    move-object/from16 v0, p3

    invoke-virtual {v0, v7}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 64
    const/4 v0, 0x1

    return v0

    .line 68
    :sswitch_3
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 70
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 72
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/eet$a;->a(Landroid/os/IBinder;)Lo/eet;

    move-result-object v8

    .line 73
    invoke-virtual {p0, v7, v8}, Lo/eep$a;->d(Ljava/lang/String;Lo/eet;)Z

    move-result v9

    .line 74
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 75
    if-eqz v9, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 76
    const/4 v0, 0x1

    return v0

    .line 80
    :sswitch_4
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 82
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 84
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/eet$a;->a(Landroid/os/IBinder;)Lo/eet;

    move-result-object v8

    .line 85
    invoke-virtual {p0, v7, v8}, Lo/eep$a;->a(Ljava/lang/String;Lo/eet;)Z

    move-result v9

    .line 86
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 87
    if-eqz v9, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 88
    const/4 v0, 0x1

    return v0

    .line 92
    :sswitch_5
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 94
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 96
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 98
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v9

    .line 100
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v10

    .line 101
    move-object v0, p0

    move-object v1, v7

    move-object v2, v8

    move v3, v9

    move-wide v4, v10

    invoke-virtual/range {v0 .. v5}, Lo/eep$a;->b(Ljava/lang/String;Ljava/lang/String;IJ)Z

    move-result v12

    .line 102
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 103
    if-eqz v12, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 104
    const/4 v0, 0x1

    return v0

    .line 108
    :sswitch_6
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 110
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 112
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 114
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v9

    .line 116
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v10

    .line 118
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_3

    .line 119
    sget-object v0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->CREATOR:Landroid/os/Parcelable$Creator;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/systemserver/activityrecognition/OtherParameters;

    .line 120
    goto :goto_3

    .line 122
    :cond_3
    const/4 v12, 0x0

    .line 124
    :goto_3
    move-object v0, p0

    move-object v1, v7

    move-object v2, v8

    move v3, v9

    move-wide v4, v10

    move-object v6, v12

    invoke-virtual/range {v0 .. v6}, Lo/eep$a;->b(Ljava/lang/String;Ljava/lang/String;IJLcom/huawei/systemserver/activityrecognition/OtherParameters;)Z

    move-result v13

    .line 125
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 126
    if-eqz v13, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 127
    const/4 v0, 0x1

    return v0

    .line 131
    :sswitch_7
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 133
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 135
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 137
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v9

    .line 138
    invoke-virtual {p0, v7, v8, v9}, Lo/eep$a;->d(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v10

    .line 139
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 140
    if-eqz v10, :cond_5

    const/4 v0, 0x1

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 141
    const/4 v0, 0x1

    return v0

    .line 145
    :sswitch_8
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 146
    invoke-virtual {p0}, Lo/eep$a;->b()Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;

    move-result-object v7

    .line 147
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 148
    if-eqz v7, :cond_6

    .line 149
    move-object/from16 v0, p3

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 150
    move-object/from16 v0, p3

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;->writeToParcel(Landroid/os/Parcel;I)V

    .line 151
    goto :goto_6

    .line 153
    :cond_6
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 155
    :goto_6
    const/4 v0, 0x1

    return v0

    .line 159
    :sswitch_9
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 160
    invoke-virtual {p0}, Lo/eep$a;->d()Z

    move-result v7

    .line 161
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 162
    if-eqz v7, :cond_7

    const/4 v0, 0x1

    goto :goto_7

    :cond_7
    const/4 v0, 0x0

    :goto_7
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 163
    const/4 v0, 0x1

    return v0

    .line 167
    :sswitch_a
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 168
    invoke-virtual {p0}, Lo/eep$a;->e()[Ljava/lang/String;

    move-result-object v7

    .line 169
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 170
    move-object/from16 v0, p3

    invoke-virtual {v0, v7}, Landroid/os/Parcel;->writeStringArray([Ljava/lang/String;)V

    .line 171
    const/4 v0, 0x1

    return v0

    .line 175
    :sswitch_b
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 177
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 179
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 181
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_8

    .line 182
    sget-object v0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->CREATOR:Landroid/os/Parcelable$Creator;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/systemserver/activityrecognition/OtherParameters;

    .line 183
    goto :goto_8

    .line 185
    :cond_8
    const/4 v9, 0x0

    .line 187
    :goto_8
    invoke-virtual {p0, v7, v8, v9}, Lo/eep$a;->e(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/systemserver/activityrecognition/OtherParameters;)Z

    move-result v10

    .line 188
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 189
    if-eqz v10, :cond_9

    const/4 v0, 0x1

    goto :goto_9

    :cond_9
    const/4 v0, 0x0

    :goto_9
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 190
    const/4 v0, 0x1

    return v0

    .line 194
    :sswitch_c
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 196
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 198
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 200
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_a

    .line 201
    sget-object v0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->CREATOR:Landroid/os/Parcelable$Creator;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/huawei/systemserver/activityrecognition/OtherParameters;

    .line 202
    goto :goto_a

    .line 204
    :cond_a
    const/4 v9, 0x0

    .line 206
    :goto_a
    invoke-virtual {p0, v7, v8, v9}, Lo/eep$a;->b(Ljava/lang/String;Ljava/lang/String;Lcom/huawei/systemserver/activityrecognition/OtherParameters;)Z

    move-result v10

    .line 207
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 208
    if-eqz v10, :cond_b

    const/4 v0, 0x1

    goto :goto_b

    :cond_b
    const/4 v0, 0x0

    :goto_b
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 209
    const/4 v0, 0x1

    return v0

    .line 213
    :sswitch_d
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 214
    invoke-virtual {p0}, Lo/eep$a;->h()Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;

    move-result-object v7

    .line 215
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 216
    if-eqz v7, :cond_c

    .line 217
    move-object/from16 v0, p3

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 218
    move-object/from16 v0, p3

    const/4 v1, 0x1

    invoke-virtual {v7, v0, v1}, Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;->writeToParcel(Landroid/os/Parcel;I)V

    .line 219
    goto :goto_c

    .line 221
    :cond_c
    move-object/from16 v0, p3

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Parcel;->writeInt(I)V

    .line 223
    :goto_c
    const/4 v0, 0x1

    return v0

    .line 227
    :sswitch_e
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 229
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 231
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 233
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v9

    .line 235
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v10

    .line 237
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_d

    .line 238
    sget-object v0, Lcom/huawei/systemserver/activityrecognition/OtherParameters;->CREATOR:Landroid/os/Parcelable$Creator;

    move-object/from16 v1, p2

    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/huawei/systemserver/activityrecognition/OtherParameters;

    .line 239
    goto :goto_d

    .line 241
    :cond_d
    const/4 v12, 0x0

    .line 243
    :goto_d
    move-object v0, p0

    move-object v1, v7

    move-object v2, v8

    move v3, v9

    move-wide v4, v10

    move-object v6, v12

    invoke-virtual/range {v0 .. v6}, Lo/eep$a;->e(Ljava/lang/String;Ljava/lang/String;IJLcom/huawei/systemserver/activityrecognition/OtherParameters;)Z

    move-result v13

    .line 244
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 245
    if-eqz v13, :cond_e

    const/4 v0, 0x1

    goto :goto_e

    :cond_e
    const/4 v0, 0x0

    :goto_e
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 246
    const/4 v0, 0x1

    return v0

    .line 250
    :sswitch_f
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareService"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 252
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    .line 254
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 256
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v9

    .line 257
    invoke-virtual {p0, v7, v8, v9}, Lo/eep$a;->b(Ljava/lang/String;Ljava/lang/String;I)Z

    move-result v10

    .line 258
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 259
    if-eqz v10, :cond_f

    const/4 v0, 0x1

    goto :goto_f

    :cond_f
    const/4 v0, 0x0

    :goto_f
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 260
    const/4 v0, 0x1

    return v0

    .line 263
    :goto_10
    move-object/from16 v0, p2

    move-object/from16 v1, p3

    move/from16 v2, p4

    invoke-super {p0, p1, v0, v1, v2}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    nop

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
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
