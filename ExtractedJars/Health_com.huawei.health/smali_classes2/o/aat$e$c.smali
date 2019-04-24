.class Lo/aat$e$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/aat;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/aat$e;
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

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 63
    iput-object p1, p0, Lo/aat$e$c;->c:Landroid/os/IBinder;

    .line 64
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 67
    iget-object v0, p0, Lo/aat$e$c;->c:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(Ljava/lang/String;)Landroid/os/IBinder;
    .locals 7
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

    .line 82
    const-string v0, "com.huawei.health.IBinderInterceptor"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 83
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lo/aat$e$c;->c:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 85
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 86
    invoke-virtual {v4}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v5

    .line 89
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 90
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 91
    goto :goto_0

    .line 89
    :catchall_0
    move-exception v6

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 90
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 91
    throw v6

    .line 92
    :goto_0
    return-object v5
.end method
