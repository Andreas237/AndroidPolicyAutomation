.class Lo/vi$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/vi;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/vi$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private c:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lo/vi$b$a;->c:Landroid/os/IBinder;

    .line 72
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 86
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 87
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 89
    const-string v0, "com.huawei.android.location.activityrecognition.IActivityRecognitionHardwareSink"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 90
    if-eqz p1, :cond_0

    .line 91
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/android/location/activityrecognition/HwActivityChangedEvent;->writeToParcel(Landroid/os/Parcel;I)V

    .line 93
    goto :goto_0

    .line 95
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 97
    :goto_0
    iget-object v0, p0, Lo/vi$b$a;->c:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 98
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    goto :goto_1

    .line 100
    :catchall_0
    move-exception v5

    .line 101
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 102
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 103
    throw v5

    .line 101
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 102
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 104
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/vi$b$a;->c:Landroid/os/IBinder;

    return-object v0
.end method
