.class Lcom/huawei/logupload/g$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/logupload/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/huawei/logupload/g$a;
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

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    iput-object p1, p0, Lcom/huawei/logupload/g$a$a;->a:Landroid/os/IBinder;

    .line 68
    return-void
.end method


# virtual methods
.method public a()Landroid/os/Bundle;
    .locals 7

    .line 79
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v3

    .line 80
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v4

    .line 83
    const-string v0, "com.huawei.logupload.PackLogService"

    :try_start_0
    invoke-virtual {v3, v0}, Landroid/os/Parcel;->writeInterfaceToken(Ljava/lang/String;)V

    .line 84
    iget-object v0, p0, Lcom/huawei/logupload/g$a$a;->a:Landroid/os/IBinder;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-interface {v0, v1, v3, v4, v2}, Landroid/os/IBinder;->transact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    .line 85
    invoke-virtual {v4}, Landroid/os/Parcel;->readException()V

    .line 86
    invoke-virtual {v4}, Landroid/os/Parcel;->readInt()I

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    sget-object v0, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {v0, v4}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Landroid/os/Bundle;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    goto :goto_0

    .line 90
    :cond_0
    const/4 v5, 0x0

    .line 92
    goto :goto_0

    .line 93
    :catchall_0
    move-exception v6

    .line 94
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 95
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 96
    throw v6

    .line 94
    :goto_0
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 95
    invoke-virtual {v3}, Landroid/os/Parcel;->recycle()V

    .line 97
    return-object v5
.end method

.method public asBinder()Landroid/os/IBinder;
    .locals 1

    .line 71
    iget-object v0, p0, Lcom/huawei/logupload/g$a$a;->a:Landroid/os/IBinder;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    .line 75
    const-string v0, "com.huawei.logupload.PackLogService"

    return-object v0
.end method
