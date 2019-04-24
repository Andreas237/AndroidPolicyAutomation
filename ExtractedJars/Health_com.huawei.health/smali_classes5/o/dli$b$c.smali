.class Lo/dli$b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dli;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dli$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private d:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Lo/dli$b$c;->d:Landroid/os/IBinder;

    .line 72
    return-void
.end method


# virtual methods
.method public a(ILcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 87
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 88
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 90
    const-string v0, "com.huawei.hwsmartinteractmgr.ISmartMsgReadResultListener"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 91
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    if-eqz p2, :cond_0

    .line 93
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 94
    const/4 v0, 0x0

    invoke-virtual {p2, v3, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 97
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 99
    :goto_0
    iget-object v0, p0, Lo/dli$b$c;->d:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 100
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 104
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 105
    goto :goto_1

    .line 103
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 104
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 105
    throw v5

    .line 106
    :goto_1
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 75
    iget-object v0, p0, Lo/dli$b$c;->d:Landroid/os/IBinder;

    return-object v0
.end method
