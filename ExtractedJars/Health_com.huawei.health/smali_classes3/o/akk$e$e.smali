.class Lo/akk$e$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/akk;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akk$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private d:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lo/akk$e$e;->d:Landroid/os/IBinder;

    .line 70
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 73
    iget-object v0, p0, Lo/akk$e$e;->d:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(Landroid/os/Bundle;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 81
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 82
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 84
    const-string v0, "com.huawei.health.fw.IReportCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 85
    if-eqz p1, :cond_0

    .line 86
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 90
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 92
    :goto_0
    iget-object v0, p0, Lo/akk$e$e;->d:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 93
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 97
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 98
    goto :goto_1

    .line 96
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 97
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 98
    throw v5

    .line 99
    :goto_1
    return-void
.end method
