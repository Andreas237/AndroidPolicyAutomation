.class Lo/dsw$d$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dsw;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dsw$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 87
    iput-object p1, p0, Lo/dsw$d$c;->a:Landroid/os/IBinder;

    .line 88
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 91
    iget-object v0, p0, Lo/dsw$d$c;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(ILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ILjava/util/List<Lcom/huawei/multisimservice/model/SimInfo;>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 120
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 121
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 123
    const-string v0, "com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 124
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 125
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeTypedList(Ljava/util/List;)V

    .line 126
    iget-object v0, p0, Lo/dsw$d$c;->a:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 127
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 131
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 132
    goto :goto_0

    .line 130
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 131
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 133
    :goto_0
    return-void
.end method

.method public b(Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 99
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 100
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 102
    const-string v0, "com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 103
    if-eqz p1, :cond_0

    .line 104
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/multisimservice/model/MultiSimDeviceInfo;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 108
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 110
    :goto_0
    iget-object v0, p0, Lo/dsw$d$c;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 111
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 114
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 115
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 116
    goto :goto_1

    .line 114
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 115
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 117
    :goto_1
    return-void
.end method

.method public c(I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 136
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 137
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 139
    const-string v0, "com.huawei.multisimservice.model.IAttachedDeviceMultiSimCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 140
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 141
    iget-object v0, p0, Lo/dsw$d$c;->a:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 142
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 146
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 147
    goto :goto_0

    .line 145
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 146
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 148
    :goto_0
    return-void
.end method
