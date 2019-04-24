.class public abstract Lo/vo$c;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/vo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/vo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/vo$c$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 15
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 16
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    invoke-virtual {p0, p0, v0}, Lo/vo$c;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 17
    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lo/vo;
    .locals 2

    .line 24
    if-nez p0, :cond_0

    .line 25
    const/4 v0, 0x0

    return-object v0

    .line 27
    :cond_0
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/vo;

    if-eqz v0, :cond_1

    .line 29
    move-object v0, v1

    check-cast v0, Lo/vo;

    return-object v0

    .line 31
    :cond_1
    new-instance v0, Lo/vo$c$b;

    invoke-direct {v0, p0}, Lo/vo$c$b;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 39
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_7

    .line 43
    :sswitch_0
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 44
    const/4 v0, 0x1

    return v0

    .line 48
    :sswitch_1
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 50
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 51
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lo/vo$c;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 52
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 53
    move-object/from16 v0, p3

    invoke-virtual {v0, v9}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 54
    const/4 v0, 0x1

    return v0

    .line 58
    :sswitch_2
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 60
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 61
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lo/vo$c;->e(Ljava/lang/String;)F

    move-result v9

    .line 62
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 63
    move-object/from16 v0, p3

    invoke-virtual {v0, v9}, Landroid/os/Parcel;->writeFloat(F)V

    .line 64
    const/4 v0, 0x1

    return v0

    .line 68
    :sswitch_3
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 70
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 71
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lo/vo$c;->c(Ljava/lang/String;)I

    move-result v9

    .line 72
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 73
    move-object/from16 v0, p3

    invoke-virtual {v0, v9}, Landroid/os/Parcel;->writeInt(I)V

    .line 74
    const/4 v0, 0x1

    return v0

    .line 78
    :sswitch_4
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 80
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 82
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v9

    .line 83
    move-object/from16 v0, p0

    invoke-virtual {v0, v8, v9}, Lo/vo$c;->a(Ljava/lang/String;I)I

    move-result v10

    .line 84
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 85
    move-object/from16 v0, p3

    invoke-virtual {v0, v10}, Landroid/os/Parcel;->writeInt(I)V

    .line 86
    const/4 v0, 0x1

    return v0

    .line 90
    :sswitch_5
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 92
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/vr$a;->b(Landroid/os/IBinder;)Lo/vr;

    move-result-object v8

    .line 93
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lo/vo$c;->a(Lo/vr;)Z

    move-result v9

    .line 94
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 95
    if-eqz v9, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 96
    const/4 v0, 0x1

    return v0

    .line 100
    :sswitch_6
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 102
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object v0

    invoke-static {v0}, Lo/vr$a;->b(Landroid/os/IBinder;)Lo/vr;

    move-result-object v8

    .line 103
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lo/vo$c;->e(Lo/vr;)Z

    move-result v9

    .line 104
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 105
    if-eqz v9, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 106
    const/4 v0, 0x1

    return v0

    .line 110
    :sswitch_7
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 112
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v8

    .line 113
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lo/vo$c;->a(I)Z

    move-result v9

    .line 114
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 115
    if-eqz v9, :cond_2

    const/4 v0, 0x1

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 116
    const/4 v0, 0x1

    return v0

    .line 120
    :sswitch_8
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 122
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v8

    .line 123
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Lo/vo$c;->c(I)Z

    move-result v9

    .line 124
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 125
    if-eqz v9, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 126
    const/4 v0, 0x1

    return v0

    .line 130
    :sswitch_9
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 132
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 134
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_4

    const/4 v9, 0x1

    goto :goto_4

    :cond_4
    const/4 v9, 0x0

    .line 136
    :goto_4
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v10

    .line 138
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v11

    .line 140
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v12

    .line 142
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    .line 143
    move-object/from16 v0, p0

    move-object v1, v8

    move v2, v9

    move-object v3, v10

    move v4, v11

    move-wide v5, v12

    move-object v7, v14

    invoke-virtual/range {v0 .. v7}, Lo/vo$c;->d(Ljava/lang/String;ZLjava/lang/String;IJLjava/lang/String;)Z

    move-result v15

    .line 144
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 145
    if-eqz v15, :cond_5

    const/4 v0, 0x1

    goto :goto_5

    :cond_5
    const/4 v0, 0x0

    :goto_5
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 146
    const/4 v0, 0x1

    return v0

    .line 150
    :sswitch_a
    const-string v0, "com.huawei.android.powerkit.adapter.IPowerKitApi"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 152
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 154
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v9

    .line 156
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->createStringArrayList()Ljava/util/ArrayList;

    move-result-object v10

    .line 157
    move-object/from16 v0, p0

    invoke-virtual {v0, v8, v9, v10}, Lo/vo$c;->d(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Z

    move-result v11

    .line 158
    invoke-virtual/range {p3 .. p3}, Landroid/os/Parcel;->writeNoException()V

    .line 159
    if-eqz v11, :cond_6

    const/4 v0, 0x1

    goto :goto_6

    :cond_6
    const/4 v0, 0x0

    :goto_6
    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 160
    const/4 v0, 0x1

    return v0

    .line 163
    :goto_7
    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    invoke-super {v0, v1, v2, v3, v4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

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
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
