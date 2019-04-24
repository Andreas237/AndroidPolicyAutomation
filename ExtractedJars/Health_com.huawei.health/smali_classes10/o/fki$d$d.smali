.class Lo/fki$d$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fki;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fki$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private c:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lo/fki$d$d;->c:Landroid/os/IBinder;

    .line 80
    return-void
.end method


# virtual methods
.method public a()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 95
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 96
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 99
    const-string v0, "com.unionpay.blepayservice.IBLETransCMDService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 100
    iget-object v0, p0, Lo/fki$d$d;->c:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 101
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 102
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v6

    .line 105
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 106
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 107
    throw v6

    .line 105
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 106
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 108
    return v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 83
    iget-object v0, p0, Lo/fki$d$d;->c:Landroid/os/IBinder;

    return-object v0
.end method

.method public d()Z
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 117
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 118
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 121
    const-string v0, "com.unionpay.blepayservice.IBLETransCMDService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 122
    iget-object v0, p0, Lo/fki$d$d;->c:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 123
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 124
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    .line 125
    :goto_0
    goto :goto_1

    .line 126
    :catchall_0
    move-exception v6

    .line 127
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 128
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 129
    throw v6

    .line 127
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 128
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 130
    return v5
.end method

.method public d([B)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 137
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 138
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 141
    const-string v0, "com.unionpay.blepayservice.IBLETransCMDService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 142
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeByteArray([B)V

    .line 143
    iget-object v0, p0, Lo/fki$d$d;->c:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 144
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 145
    invoke-virtual {v4}, Landroid/os/Parcel;->createByteArray()[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 146
    goto :goto_0

    .line 147
    :catchall_0
    move-exception v6

    .line 148
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 149
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 150
    throw v6

    .line 148
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 149
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 151
    return-object v5
.end method
