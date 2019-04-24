.class Lo/dcc$a$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/dcc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dcc$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private c:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    iput-object p1, p0, Lo/dcc$a$d;->c:Landroid/os/IBinder;

    .line 65
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 68
    iget-object v0, p0, Lo/dcc$a$d;->c:Landroid/os/IBinder;

    return-object v0
.end method

.method public b(ILjava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 82
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 83
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 85
    const-string v0, "com.huawei.hwcommonservice.model.IHWWearCommonCallback"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 86
    invoke-virtual {v3, p1}, Landroid/os/Parcel;->writeInt(I)V

    .line 87
    invoke-virtual {v3, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 88
    iget-object v0, p0, Lo/dcc$a$d;->c:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 89
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 93
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 94
    goto :goto_0

    .line 92
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 93
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 94
    throw v5

    .line 95
    :goto_0
    return-void
.end method
