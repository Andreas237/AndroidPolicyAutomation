.class public abstract Lo/aav$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/aav;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aav;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/aav$a$d;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 16
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 17
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p0, p0, v0}, Lo/aav$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 18
    return-void
.end method

.method public static e(Landroid/os/IBinder;)Lo/aav;
    .locals 2

    .line 25
    if-nez p0, :cond_0

    .line 26
    const/4 v0, 0x0

    return-object v0

    .line 28
    :cond_0
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/aav;

    if-eqz v0, :cond_1

    .line 30
    move-object v0, v1

    check-cast v0, Lo/aav;

    return-object v0

    .line 32
    :cond_1
    new-instance v0, Lo/aav$a$d;

    invoke-direct {v0, p0}, Lo/aav$a$d;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 36
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 40
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_10

    .line 44
    :sswitch_0
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 45
    const/4 v0, 0x1

    return v0

    .line 49
    :sswitch_1
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 50
    invoke-virtual {p0}, Lo/aav$a;->b()Ljava/lang/String;

    move-result-object v6

    .line 51
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 52
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 53
    const/4 v0, 0x1

    return v0

    .line 57
    :sswitch_2
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 59
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    .line 60
    :goto_0
    invoke-virtual {p0, v6}, Lo/aav$a;->a(Z)V

    .line 61
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 62
    const/4 v0, 0x1

    return v0

    .line 66
    :sswitch_3
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0}, Lo/aav$a;->d()Z

    move-result v6

    .line 68
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 69
    if-eqz v6, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 70
    const/4 v0, 0x1

    return v0

    .line 74
    :sswitch_4
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 75
    invoke-virtual {p0}, Lo/aav$a;->c()Z

    move-result v6

    .line 76
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 77
    if-eqz v6, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 78
    const/4 v0, 0x1

    return v0

    .line 82
    :sswitch_5
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 83
    invoke-virtual {p0}, Lo/aav$a;->e()I

    move-result v6

    .line 84
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 85
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeInt(I)V

    .line 86
    const/4 v0, 0x1

    return v0

    .line 90
    :sswitch_6
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 92
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/abg$e;->a(Landroid/os/IBinder;)Lo/abg;

    move-result-object v6

    .line 93
    invoke-virtual {p0, v6}, Lo/aav$a;->b(Lo/abg;)Z

    move-result v7

    .line 94
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 95
    if-eqz v7, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    const/4 v0, 0x1

    return v0

    .line 100
    :sswitch_7
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 101
    invoke-virtual {p0}, Lo/aav$a;->a()Z

    move-result v6

    .line 102
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 103
    if-eqz v6, :cond_4

    const/4 v0, 0x1

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    :goto_4
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 104
    const/4 v0, 0x1

    return v0

    .line 108
    :sswitch_8
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 110
    invoke-virtual {p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v6

    .line 112
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v8

    .line 114
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v9

    .line 116
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v10

    .line 117
    move-object v0, p0

    move-wide v1, v6

    move v3, v8

    move v4, v9

    move v5, v10

    invoke-virtual/range {v0 .. v5}, Lo/aav$a;->a(JIII)V

    .line 118
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 119
    const/4 v0, 0x1

    return v0

    .line 123
    :sswitch_9
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 125
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_5

    const/4 v6, 0x1

    goto :goto_5

    :cond_5
    const/4 v6, 0x0

    .line 126
    :goto_5
    invoke-virtual {p0, v6}, Lo/aav$a;->e(Z)V

    .line 127
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 128
    const/4 v0, 0x1

    return v0

    .line 132
    :sswitch_a
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 133
    invoke-virtual {p0}, Lo/aav$a;->k()Z

    move-result v6

    .line 134
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 135
    if-eqz v6, :cond_6

    const/4 v0, 0x1

    goto :goto_6

    :cond_6
    const/4 v0, 0x0

    :goto_6
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 136
    const/4 v0, 0x1

    return v0

    .line 140
    :sswitch_b
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 142
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aay$e;->d(Landroid/os/IBinder;)Lo/aay;

    move-result-object v6

    .line 143
    invoke-virtual {p0, v6}, Lo/aav$a;->c(Lo/aay;)V

    .line 144
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 145
    const/4 v0, 0x1

    return v0

    .line 149
    :sswitch_c
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 151
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_7

    .line 152
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/os/Bundle;

    goto :goto_7

    .line 155
    :cond_7
    const/4 v6, 0x0

    .line 157
    :goto_7
    invoke-virtual {p0, v6}, Lo/aav$a;->e(Landroid/os/Bundle;)V

    .line 158
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 159
    const/4 v0, 0x1

    return v0

    .line 163
    :sswitch_d
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 165
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aay$e;->d(Landroid/os/IBinder;)Lo/aay;

    move-result-object v6

    .line 166
    invoke-virtual {p0, v6}, Lo/aav$a;->e(Lo/aay;)V

    .line 167
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 168
    const/4 v0, 0x1

    return v0

    .line 172
    :sswitch_e
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 174
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aay$e;->d(Landroid/os/IBinder;)Lo/aay;

    move-result-object v6

    .line 175
    invoke-virtual {p0, v6}, Lo/aav$a;->a(Lo/aay;)V

    .line 176
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 177
    const/4 v0, 0x1

    return v0

    .line 181
    :sswitch_f
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 183
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aay$e;->d(Landroid/os/IBinder;)Lo/aay;

    move-result-object v6

    .line 184
    invoke-virtual {p0, v6}, Lo/aav$a;->b(Lo/aay;)V

    .line 185
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 186
    const/4 v0, 0x1

    return v0

    .line 190
    :sswitch_10
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 191
    invoke-virtual {p0}, Lo/aav$a;->i()V

    .line 192
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 193
    const/4 v0, 0x1

    return v0

    .line 197
    :sswitch_11
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 199
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/abg$e;->a(Landroid/os/IBinder;)Lo/abg;

    move-result-object v6

    .line 200
    invoke-virtual {p0, v6}, Lo/aav$a;->a(Lo/abg;)Z

    move-result v7

    .line 201
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 202
    if-eqz v7, :cond_8

    const/4 v0, 0x1

    goto :goto_8

    :cond_8
    const/4 v0, 0x0

    :goto_8
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 203
    const/4 v0, 0x1

    return v0

    .line 207
    :sswitch_12
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 209
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/abb$b;->a(Landroid/os/IBinder;)Lo/abb;

    move-result-object v6

    .line 211
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v7

    .line 212
    invoke-virtual {p0, v6, v7}, Lo/aav$a;->d(Lo/abb;I)Z

    move-result v8

    .line 213
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 214
    if-eqz v8, :cond_9

    const/4 v0, 0x1

    goto :goto_9

    :cond_9
    const/4 v0, 0x0

    :goto_9
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 215
    const/4 v0, 0x1

    return v0

    .line 219
    :sswitch_13
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 220
    invoke-virtual {p0}, Lo/aav$a;->h()Z

    move-result v6

    .line 221
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 222
    if-eqz v6, :cond_a

    const/4 v0, 0x1

    goto :goto_a

    :cond_a
    const/4 v0, 0x0

    :goto_a
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 223
    const/4 v0, 0x1

    return v0

    .line 227
    :sswitch_14
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 229
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_b

    const/4 v6, 0x1

    goto :goto_b

    :cond_b
    const/4 v6, 0x0

    .line 230
    :goto_b
    invoke-virtual {p0, v6}, Lo/aav$a;->b(Z)V

    .line 231
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 232
    const/4 v0, 0x1

    return v0

    .line 236
    :sswitch_15
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 238
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_c

    const/4 v6, 0x1

    goto :goto_c

    :cond_c
    const/4 v6, 0x0

    .line 239
    :goto_c
    invoke-virtual {p0, v6}, Lo/aav$a;->c(Z)V

    .line 240
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 241
    const/4 v0, 0x1

    return v0

    .line 245
    :sswitch_16
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 246
    invoke-virtual {p0}, Lo/aav$a;->g()Z

    move-result v6

    .line 247
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 248
    if-eqz v6, :cond_d

    const/4 v0, 0x1

    goto :goto_d

    :cond_d
    const/4 v0, 0x0

    :goto_d
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 249
    const/4 v0, 0x1

    return v0

    .line 253
    :sswitch_17
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 254
    invoke-virtual {p0}, Lo/aav$a;->f()Z

    move-result v6

    .line 255
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 256
    if-eqz v6, :cond_e

    const/4 v0, 0x1

    goto :goto_e

    :cond_e
    const/4 v0, 0x0

    :goto_e
    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 257
    const/4 v0, 0x1

    return v0

    .line 261
    :sswitch_18
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 263
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aay$e;->d(Landroid/os/IBinder;)Lo/aay;

    move-result-object v6

    .line 264
    invoke-virtual {p0, v6}, Lo/aav$a;->d(Lo/aay;)V

    .line 265
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 266
    const/4 v0, 0x1

    return v0

    .line 270
    :sswitch_19
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 272
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_f

    const/4 v6, 0x1

    goto :goto_f

    :cond_f
    const/4 v6, 0x0

    .line 273
    :goto_f
    invoke-virtual {p0, v6}, Lo/aav$a;->d(Z)V

    .line 274
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 275
    const/4 v0, 0x1

    return v0

    .line 279
    :sswitch_1a
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 280
    invoke-virtual {p0}, Lo/aav$a;->o()V

    .line 281
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 282
    const/4 v0, 0x1

    return v0

    .line 286
    :sswitch_1b
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 287
    invoke-virtual {p0}, Lo/aav$a;->n()I

    move-result v6

    .line 288
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 289
    invoke-virtual {p3, v6}, Landroid/os/Parcel;->writeInt(I)V

    .line 290
    const/4 v0, 0x1

    return v0

    .line 294
    :sswitch_1c
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 296
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/aay$e;->d(Landroid/os/IBinder;)Lo/aay;

    move-result-object v6

    .line 297
    invoke-virtual {p0, v6}, Lo/aav$a;->f(Lo/aay;)V

    .line 298
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 299
    const/4 v0, 0x1

    return v0

    .line 303
    :sswitch_1d
    const-string v0, "com.huawei.health.IDaemonRemoteManager"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 304
    invoke-virtual {p0}, Lo/aav$a;->p()V

    .line 305
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 306
    const/4 v0, 0x1

    return v0

    .line 309
    :goto_10
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

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
        0x1b -> :sswitch_1b
        0x1c -> :sswitch_1c
        0x1d -> :sswitch_1d
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
