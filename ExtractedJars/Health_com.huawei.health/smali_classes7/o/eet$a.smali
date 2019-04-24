.class public abstract Lo/eet$a;
.super Landroid/os/Binder;
.source "SourceFile"

# interfaces
.implements Lo/eet;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/eet$a$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 17
    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    .line 19
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink"

    invoke-virtual {p0, p0, v0}, Lo/eet$a;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    .line 20
    return-void
.end method

.method public static a(Landroid/os/IBinder;)Lo/eet;
    .locals 2

    .line 27
    if-nez p0, :cond_0

    .line 28
    const/4 v0, 0x0

    return-object v0

    .line 30
    :cond_0
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v1

    .line 31
    if-eqz v1, :cond_1

    instance-of v0, v1, Lo/eet;

    if-eqz v0, :cond_1

    .line 32
    move-object v0, v1

    check-cast v0, Lo/eet;

    return-object v0

    .line 34
    :cond_1
    new-instance v0, Lo/eet$a$c;

    invoke-direct {v0, p0}, Lo/eet$a$c;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 0

    .line 38
    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 42
    sparse-switch p1, :sswitch_data_0

    goto/16 :goto_3

    .line 46
    :sswitch_0
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink"

    invoke-virtual {p3, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 47
    const/4 v0, 0x1

    return v0

    .line 51
    :sswitch_1
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 53
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    sget-object v0, Lcom/huawei/systemserver/activityrecognition/HwActivityChangedEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/systemserver/activityrecognition/HwActivityChangedEvent;

    .line 55
    goto :goto_0

    .line 57
    :cond_0
    const/4 v1, 0x0

    .line 59
    :goto_0
    invoke-virtual {p0, v1}, Lo/eet$a;->b(Lcom/huawei/systemserver/activityrecognition/HwActivityChangedEvent;)V

    .line 60
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 61
    const/4 v0, 0x1

    return v0

    .line 65
    :sswitch_2
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 67
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_1

    .line 68
    sget-object v0, Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;

    .line 69
    goto :goto_1

    .line 71
    :cond_1
    const/4 v1, 0x0

    .line 73
    :goto_1
    invoke-virtual {p0, v1}, Lo/eet$a;->d(Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;)V

    .line 74
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 75
    const/4 v0, 0x1

    return v0

    .line 79
    :sswitch_3
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink"

    invoke-virtual {p2, v0}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    .line 81
    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_2

    .line 82
    sget-object v0, Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;

    .line 83
    goto :goto_2

    .line 85
    :cond_2
    const/4 v1, 0x0

    .line 87
    :goto_2
    invoke-virtual {p0, v1}, Lo/eet$a;->e(Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;)V

    .line 88
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    .line 89
    const/4 v0, 0x1

    return v0

    .line 92
    :goto_3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x5f4e5446 -> :sswitch_0
    .end sparse-switch
.end method
