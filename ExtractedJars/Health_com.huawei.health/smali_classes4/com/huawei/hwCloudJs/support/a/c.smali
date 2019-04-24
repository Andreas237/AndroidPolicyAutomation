.class public Lcom/huawei/hwCloudJs/support/a/c;
.super Ljava/lang/Object;


# static fields
.field private static final a:Ljava/lang/String; = "CacheRequestManager"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([Ljava/lang/String;I)V
    .locals 2

    const-string v0, "CacheRequestManager"

    const-string v1, "enter into preload"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/huawei/hwCloudJs/support/a/c$1;

    invoke-direct {v1, p0, p1}, Lcom/huawei/hwCloudJs/support/a/c$1;-><init>([Ljava/lang/String;I)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
