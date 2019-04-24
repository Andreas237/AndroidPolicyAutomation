.class Lo/djr$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/djr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/djr$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput-object p1, p0, Lo/djr$a$a;->a:Landroid/os/IBinder;

    .line 110
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 113
    iget-object v0, p0, Lo/djr$a$a;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 150
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 151
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 153
    const-string v0, "com.huawei.hwservicesmgr.IDeviceStateAIDLCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 154
    if-eqz p1, :cond_0

    .line 155
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 156
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 159
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 161
    :goto_0
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 162
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 163
    iget-object v0, p0, Lo/djr$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 164
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 168
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 169
    goto :goto_1

    .line 167
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 168
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 169
    throw v5

    .line 170
    :goto_1
    return-void
.end method

.method public c(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;I[B)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 125
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 126
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 128
    const-string v0, "com.huawei.hwservicesmgr.IDeviceStateAIDLCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 129
    if-eqz p1, :cond_0

    .line 130
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 131
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 134
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 136
    :goto_0
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 137
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 138
    iget-object v0, p0, Lo/djr$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 139
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 143
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 144
    goto :goto_1

    .line 142
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 143
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 144
    throw v5

    .line 145
    :goto_1
    return-void
.end method

.method public d(Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;ILjava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 175
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 176
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 178
    const-string v0, "com.huawei.hwservicesmgr.IDeviceStateAIDLCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 179
    if-eqz p1, :cond_0

    .line 180
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 181
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hwcommonmodel/datatypes/DeviceInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 184
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 186
    :goto_0
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 187
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 188
    iget-object v0, p0, Lo/djr$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 189
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 193
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 194
    goto :goto_1

    .line 192
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 193
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 194
    throw v5

    .line 195
    :goto_1
    return-void
.end method
