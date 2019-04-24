.class Lo/vh$b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/vh;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/vh$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "c"
.end annotation


# instance fields
.field private c:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lo/vh$b$c;->c:Landroid/os/IBinder;

    .line 77
    return-void
.end method


# virtual methods
.method public a()Lcom/huawei/account/aidl/AccountAidlInfo;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 92
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 93
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 96
    const-string v0, "com.huawei.account.aidl.IAccountAidlInterface"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 97
    iget-object v0, p0, Lo/vh$b$c;->c:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 98
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 99
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_0

    .line 100
    sget-object v0, Lcom/huawei/account/aidl/AccountAidlInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/huawei/account/aidl/AccountAidlInfo;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 103
    :cond_0
    const/4 v5, 0x0

    .line 107
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 108
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 109
    goto :goto_1

    .line 107
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 108
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 109
    throw v6

    .line 110
    :goto_1
    return-object v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/vh$b$c;->c:Landroid/os/IBinder;

    return-object v0
.end method

.method public b()V
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
    const-string v0, "com.huawei.account.aidl.IAccountAidlInterface"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 120
    iget-object v0, p0, Lo/vh$b$c;->c:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 121
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 124
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 125
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 126
    goto :goto_0

    .line 124
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 125
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 126
    throw v5

    .line 127
    :goto_0
    return-void
.end method
