.class Lo/eet$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/eet;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eet$a;
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

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    iput-object p1, p0, Lo/eet$a$c;->a:Landroid/os/IBinder;

    .line 100
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 103
    iget-object v0, p0, Lo/eet$a$c;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(Lcom/huawei/systemserver/activityrecognition/HwActivityChangedEvent;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 114
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 115
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 117
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 118
    if-eqz p1, :cond_0

    .line 119
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/systemserver/activityrecognition/HwActivityChangedEvent;->writeToParcel(Landroid/os/Parcel;I)V

    .line 121
    goto :goto_0

    .line 123
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 125
    :goto_0
    iget-object v0, p0, Lo/eet$a$c;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 126
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    goto :goto_1

    .line 128
    :catchall_0
    move-exception v5

    .line 129
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 130
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 131
    throw v5

    .line 129
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 130
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 132
    return-void
.end method

.method public d(Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 135
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 136
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 138
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 139
    if-eqz p1, :cond_0

    .line 140
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 141
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/systemserver/activityrecognition/HwActivityChangedExtendEvent;->writeToParcel(Landroid/os/Parcel;I)V

    .line 142
    goto :goto_0

    .line 144
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 146
    :goto_0
    iget-object v0, p0, Lo/eet$a$c;->a:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 147
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    goto :goto_1

    .line 149
    :catchall_0
    move-exception v5

    .line 150
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 151
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 152
    throw v5

    .line 150
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 151
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 153
    return-void
.end method

.method public e(Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 156
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 157
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 159
    const-string v0, "com.huawei.systemserver.activityrecognition.IActivityRecognitionHardwareSink"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 160
    if-eqz p1, :cond_0

    .line 161
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 162
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/systemserver/activityrecognition/HwEnvironmentChangedEvent;->writeToParcel(Landroid/os/Parcel;I)V

    .line 163
    goto :goto_0

    .line 165
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 167
    :goto_0
    iget-object v0, p0, Lo/eet$a$c;->a:Landroid/os/IBinder;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 168
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 169
    goto :goto_1

    .line 170
    :catchall_0
    move-exception v5

    .line 171
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 172
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 173
    throw v5

    .line 171
    :goto_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 172
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 174
    return-void
.end method
