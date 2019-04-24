.class public Lnet/sqlcipher/database/SQLiteCursor$MainThreadNotificationHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/sqlcipher/database/SQLiteCursor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "MainThreadNotificationHandler"
.end annotation


# instance fields
.field private final wrappedCursor:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lnet/sqlcipher/database/SQLiteCursor;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lnet/sqlcipher/database/SQLiteCursor;)V
    .locals 1

    .line 173
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 174
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor$MainThreadNotificationHandler;->wrappedCursor:Ljava/lang/ref/WeakReference;

    .line 175
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 178
    iget-object v0, p0, Lnet/sqlcipher/database/SQLiteCursor$MainThreadNotificationHandler;->wrappedCursor:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lnet/sqlcipher/database/SQLiteCursor;

    .line 179
    if-eqz v1, :cond_0

    .line 180
    invoke-static {v1}, Lnet/sqlcipher/database/SQLiteCursor;->access$700(Lnet/sqlcipher/database/SQLiteCursor;)V

    .line 182
    :cond_0
    return-void
.end method
