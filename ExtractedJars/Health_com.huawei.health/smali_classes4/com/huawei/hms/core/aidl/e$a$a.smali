.class Lcom/huawei/hms/core/aidl/e$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hms/core/aidl/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/hms/core/aidl/e$a;
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

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, Lcom/huawei/hms/core/aidl/e$a$a;->a:Landroid/os/IBinder;

    .line 83
    return-void
.end method


# virtual methods
.method public a(Lcom/huawei/hms/core/aidl/b;)V
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
    const-string v0, "com.huawei.hms.core.aidl.IAIDLInvoke"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 98
    if-eqz p1, :cond_0

    .line 99
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 100
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Lcom/huawei/hms/core/aidl/b;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 103
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 105
    :goto_0
    iget-object v0, p0, Lcom/huawei/hms/core/aidl/e$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 106
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 110
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 111
    goto :goto_1

    .line 109
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 110
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 112
    :goto_1
    return-void
.end method

.method public a(Lcom/huawei/hms/core/aidl/b;Lcom/huawei/hms/core/aidl/d;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 115
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 117
    const-string v0, "com.huawei.hms.core.aidl.IAIDLInvoke"

    :try_start_0
    invoke-virtual {v4, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 118
    if-eqz p1, :cond_0

    .line 119
    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 120
    const/4 v0, 0x0

    invoke-virtual {p1, v4, v0}, Lcom/huawei/hms/core/aidl/b;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 123
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v4, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 125
    :goto_0
    if-eqz p2, :cond_1

    invoke-interface {p2}, Lcom/huawei/hms/core/aidl/d;->asBinder()Landroid/os/IBinder;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v4, v0}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 126
    iget-object v0, p0, Lcom/huawei/hms/core/aidl/e$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-interface {v0, v1, v4, v2, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 130
    goto :goto_2

    .line 129
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 131
    :goto_2
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 86
    iget-object v0, p0, Lcom/huawei/hms/core/aidl/e$a$a;->a:Landroid/os/IBinder;

    return-object v0
.end method
