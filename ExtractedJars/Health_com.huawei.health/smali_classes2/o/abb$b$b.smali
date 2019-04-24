.class Lo/abb$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abb;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abb$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private c:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    iput-object p1, p0, Lo/abb$b$b;->c:Landroid/os/IBinder;

    .line 67
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 70
    iget-object v0, p0, Lo/abb$b$b;->c:Landroid/os/IBinder;

    return-object v0
.end method

.method public d(II)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 78
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 79
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 81
    const-string v0, "com.huawei.health.IRealStepDataReport"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 82
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 83
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 84
    iget-object v0, p0, Lo/abb$b$b;->c:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 85
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 89
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 90
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 89
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 90
    throw v5

    .line 91
    :goto_0
    return-void
.end method
