.class public abstract Lo/vr$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/vr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/vr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/vr$a$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 19
    const-string v0, "com.huawei.android.powerkit.adapter.IStateSink"

    invoke-virtual {p0, p0, v0}, Lo/vr$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 20
    return-void
.end method

.method public static b(Landroid/os/IBinder;)Lo/vr;
    .locals 2

    .line 27
    if-nez p0, :cond_0

    .line 28
    const/4 v0, 0x0

    return-object v0

    .line 30
    :cond_0
    const-string v0, "com.huawei.android.powerkit.adapter.IStateSink"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/vr;

    if-eqz v0, :cond_1

    .line 32
    move-object v0, v1

    check-cast v0, Lo/vr;

    return-object v0

    .line 34
    :cond_1
    new-instance v0, Lo/vr$a$b;

    invoke-direct {v0, p0}, Lo/vr$a$b;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 38
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 42
    sparse-switch p1, :sswitch_data_0

    goto :goto_0

    .line 46
    :sswitch_0
    const-string v0, "com.huawei.android.powerkit.adapter.IStateSink"

    move-object/from16 v1, p3

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 47
    const/4 v0, 0x1

    return v0

    .line 51
    :sswitch_1
    const-string v0, "com.huawei.android.powerkit.adapter.IStateSink"

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 53
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v8

    .line 55
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readInt()I

    move-result v9

    .line 57
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v10

    .line 59
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readLong()J

    move-result-wide v12

    .line 61
    invoke-virtual/range {p2 .. p2}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v14

    .line 62
    move-object v0, p0

    move-object v1, v8

    move v2, v9

    move-wide v3, v10

    move-wide v5, v12

    move-object v7, v14

    invoke-virtual/range {v0 .. v7}, Lo/vr$a;->c(Ljava/lang/String;IJJLjava/lang/String;)V

    .line 63
    const/4 v0, 0x1

    return v0

    .line 66
    :goto_0
    move/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p4

    invoke-super {p0, v0, v1, v2, v3}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
