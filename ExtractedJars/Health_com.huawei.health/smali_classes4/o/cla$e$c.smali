.class Lo/cla$e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cla;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cla$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private b:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    iput-object p1, p0, Lo/cla$e$c;->b:Landroid/os/IBinder;

    .line 78
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 81
    iget-object v0, p0, Lo/cla$e$c;->b:Landroid/os/IBinder;

    return-object v0
.end method

.method public d(ILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 116
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 117
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 119
    const-string v0, "com.huawei.hihealth.ICommonListener"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 120
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 121
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 122
    iget-object v0, p0, Lo/cla$e$c;->b:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 123
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 127
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 128
    goto :goto_0

    .line 126
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 127
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 128
    throw v5

    .line 129
    :goto_0
    return-void
.end method

.method public e(ILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 94
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 95
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 97
    const-string v0, "com.huawei.hihealth.ICommonListener"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 98
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 99
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 100
    iget-object v0, p0, Lo/cla$e$c;->b:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 101
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 104
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 105
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 106
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 105
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 106
    throw v5

    .line 107
    :goto_0
    return-void
.end method
