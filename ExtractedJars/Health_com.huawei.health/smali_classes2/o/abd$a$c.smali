.class Lo/abd$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/abd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/abd$a;
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

    .line 75
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 76
    iput-object p1, p0, Lo/abd$a$c;->a:Landroid/os/IBinder;

    .line 77
    return-void
.end method


# virtual methods
.method public a(Landroid/os/Bundle;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 105
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 106
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 108
    const-string v0, "com.huawei.health.ITrackDataReport"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 109
    if-eqz p1, :cond_0

    .line 110
    const/4 v0, 0x1

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 111
    const/4 v0, 0x0

    invoke-virtual {p1, v3, v0}, Landroid/os/Bundle;->writeToParcel(Landroid/os/Parcel;I)V

    goto :goto_0

    .line 114
    :cond_0
    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInt(I)V

    .line 116
    :goto_0
    iget-object v0, p0, Lo/abd$a$c;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 117
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 118
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    const/4 v1, 0x0

    if-eq v1, v0, :cond_1

    .line 119
    invoke-virtual {p1, v4}, Landroid/os/Bundle;->readFromParcel(Landroid/os/Parcel;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 123
    :cond_1
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 124
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 125
    goto :goto_1

    .line 123
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 124
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 125
    throw v5

    .line 126
    :goto_1
    return-void
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 80
    iget-object v0, p0, Lo/abd$a$c;->a:Landroid/os/IBinder;

    return-object v0
.end method
