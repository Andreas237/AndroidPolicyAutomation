.class Lo/djq$b$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/djq;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/djq$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "e"
.end annotation


# instance fields
.field private b:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Lo/djq$b$e;->b:Landroid/os/IBinder;

    .line 64
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/djq$b$e;->b:Landroid/os/IBinder;

    return-object v0
.end method

.method public c()V
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
    const-string v0, "com.huawei.hwservicesmgr.IMusicChangedCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 82
    iget-object v0, p0, Lo/djq$b$e;->b:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 83
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 87
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 88
    goto :goto_0

    .line 86
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 87
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 88
    throw v5

    .line 89
    :goto_0
    return-void
.end method
