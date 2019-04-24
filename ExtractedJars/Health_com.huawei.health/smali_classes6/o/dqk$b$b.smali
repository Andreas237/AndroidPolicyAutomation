.class Lo/dqk$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dqk;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dqk$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private d:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lo/dqk$b$b;->d:Landroid/os/IBinder;

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

    .line 121
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 122
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 125
    const-string v0, "com.huawei.mockhealth.IMockStepService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 126
    iget-object v0, p0, Lo/dqk$b$b;->d:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 127
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 128
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 131
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 132
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 133
    goto :goto_0

    .line 131
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 132
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 133
    throw v6

    .line 134
    :goto_0
    return v5
.end method

.method public a(Lo/dqj;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 106
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 107
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 109
    const-string v0, "com.huawei.mockhealth.IMockStepService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 110
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/dqj;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 111
    iget-object v0, p0, Lo/dqk$b$b;->d:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 112
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 115
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 116
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 117
    goto :goto_1

    .line 115
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 116
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 117
    throw v5

    .line 118
    :goto_1
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 83
    iget-object v0, p0, Lo/dqk$b$b;->d:Landroid/os/IBinder;

    return-object v0
.end method

.method public e(Lo/dqj;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 91
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 92
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 94
    const-string v0, "com.huawei.mockhealth.IMockStepService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 95
    if-eqz p1, :cond_0

    invoke-interface {p1}, Lo/dqj;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 96
    iget-object v0, p0, Lo/dqk$b$b;->d:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 97
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 101
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 102
    goto :goto_1

    .line 100
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 101
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 102
    throw v5

    .line 103
    :goto_1
    return-void
.end method
