.class Lo/yf$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/yf;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/yf$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private e:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput-object p1, p0, Lo/yf$e$b;->e:Landroid/os/IBinder;

    .line 92
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 95
    iget-object v0, p0, Lo/yf$e$b;->e:Landroid/os/IBinder;

    return-object v0
.end method

.method public e(JLandroid/content/ComponentName;)I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 129
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 130
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 133
    const-string v0, "com.huawei.contentsensor.sdk.ICaptureDataService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 134
    invoke-virtual {v3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 135
    if-eqz p3, :cond_0

    .line 136
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 137
    const/4 v0, 0x0

    invoke-virtual {p3, v3, v0}, Landroid/content/ComponentName;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 140
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 142
    :goto_0
    iget-object v0, p0, Lo/yf$e$b;->e:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 143
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 144
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 147
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 148
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 149
    goto :goto_1

    .line 147
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 148
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 150
    :goto_1
    return v5
.end method

.method public e(JLandroid/content/ComponentName;Ljava/lang/String;)I
    .locals 7
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

    .line 107
    const-string v0, "com.huawei.contentsensor.sdk.ICaptureDataService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 108
    invoke-virtual {v3, p1, p2}, Landroid/os/Parcel;->writeLong(J)V

    .line 109
    if-eqz p3, :cond_0

    .line 110
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 111
    const/4 v0, 0x0

    invoke-virtual {p3, v3, v0}, Landroid/content/ComponentName;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 114
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 116
    :goto_0
    invoke-virtual {v3, p4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 117
    iget-object v0, p0, Lo/yf$e$b;->e:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 118
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 119
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v5

    .line 122
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 123
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 124
    goto :goto_1

    .line 122
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 123
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v6

    .line 125
    :goto_1
    return v5
.end method
