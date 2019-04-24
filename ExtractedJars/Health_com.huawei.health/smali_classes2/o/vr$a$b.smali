.class Lo/vr$a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/vr;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/vr$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private a:Landroid/os/IBinder;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 0

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    iput-object p1, p0, Lo/vr$a$b;->a:Landroid/os/IBinder;

    .line 74
    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 77
    iget-object v0, p0, Lo/vr$a$b;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public c(Ljava/lang/String;IJJLjava/lang/String;)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 88
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 90
    const-string v0, "com.huawei.android.powerkit.adapter.IStateSink"

    :try_start_0
    invoke-virtual {v4, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 91
    invoke-virtual {v4, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 92
    invoke-virtual {v4, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 93
    invoke-virtual {v4, p3, p4}, Landroid/os/Parcel;->writeLong(J)V

    .line 94
    invoke-virtual {v4, p5, p6}, Landroid/os/Parcel;->writeLong(J)V

    .line 95
    invoke-virtual {v4, p7}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 96
    iget-object v0, p0, Lo/vr$a$b;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-interface {v0, v1, v4, v2, v3}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 99
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 100
    goto :goto_0

    .line 99
    :catchall_0
    move-exception v5

    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    throw v5

    .line 101
    :goto_0
    return-void
.end method
