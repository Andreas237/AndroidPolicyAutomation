.class Lo/clo$c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/clo;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/clo$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    iput-object p1, p0, Lo/clo$c$d;->a:Landroid/os/IBinder;

    .line 93
    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 109
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 110
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 112
    const-string v0, "com.huawei.hihealth.ISubscribeListener"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 113
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 114
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    .line 115
    iget-object v0, p0, Lo/clo$c$d;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 116
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 120
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 121
    goto :goto_0

    .line 119
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 120
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 121
    throw v5

    .line 122
    :goto_0
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 96
    iget-object v0, p0, Lo/clo$c$d;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public e(ILcom/huawei/hihealth/HiHealthClient;Ljava/lang/String;Lcom/huawei/hihealth/HiHealthData;J)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 140
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 141
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 143
    const-string v0, "com.huawei.hihealth.ISubscribeListener"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 144
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 145
    if-eqz p2, :cond_0

    .line 146
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 147
    const/4 v0, 0x0

    invoke-virtual {p2, v3, v0}, Lcom/huawei/hihealth/HiHealthClient;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 150
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 152
    :goto_0
    invoke-virtual {v3, p3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 153
    if-eqz p4, :cond_1

    .line 154
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 155
    const/4 v0, 0x0

    invoke-virtual {p4, v3, v0}, Lcom/huawei/hihealth/HiHealthData;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_1

    .line 158
    :cond_1
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 160
    :goto_1
    invoke-virtual {v3, p5, p6}, Landroid/os/Parcel;->writeLong(J)V

    .line 161
    iget-object v0, p0, Lo/clo$c$d;->a:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 162
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 165
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 166
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 167
    goto :goto_2

    .line 165
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 166
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 167
    throw v5

    .line 168
    :goto_2
    return-void
.end method
