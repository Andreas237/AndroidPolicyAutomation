.class Lo/dqj$e$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dqj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dqj$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private d:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lo/dqj$e$d;->d:Landroid/os/IBinder;

    .line 77
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/dqj$e$d;->d:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 88
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 89
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 91
    const-string v0, "com.huawei.mockhealth.IMockStepReport"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 92
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    iget-object v0, p0, Lo/dqj$e$d;->d:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 94
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 98
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 99
    goto :goto_0

    .line 97
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 98
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 99
    throw v5

    .line 100
    :goto_0
    return-void
.end method

.method public d(Landroid/os/Bundle;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 103
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 104
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 106
    const-string v0, "com.huawei.mockhealth.IMockStepReport"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 107
    if-eqz p1, :cond_0

    .line 108
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 109
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 112
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 114
    :goto_0
    iget-object v0, p0, Lo/dqj$e$d;->d:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 115
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 119
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 120
    goto :goto_1

    .line 118
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 119
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 120
    throw v5

    .line 121
    :goto_1
    return-void
.end method
