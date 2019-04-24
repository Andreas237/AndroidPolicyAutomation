.class Lo/dex$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dex;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/dex;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lo/dex;Landroid/os/Looper;)V
    .locals 1

    .line 105
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 106
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dex$d;->d:Ljava/lang/ref/WeakReference;

    .line 107
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 111
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 112
    iget-object v0, p0, Lo/dex$d;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dex;

    .line 113
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 114
    return-void

    .line 117
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 119
    :pswitch_0
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "save data success"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 120
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/dex;->e(I)V

    .line 121
    goto :goto_1

    .line 123
    :pswitch_1
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "save data fail"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 124
    const v0, 0x493e6

    invoke-virtual {v5, v0}, Lo/dex;->e(I)V

    .line 125
    goto :goto_1

    .line 127
    :pswitch_2
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "save des data success"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 128
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/dex;->d(I)V

    .line 129
    goto :goto_1

    .line 131
    :pswitch_3
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "save des data fail"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 132
    const v0, 0x493e6

    invoke-virtual {v5, v0}, Lo/dex;->d(I)V

    .line 133
    goto :goto_1

    .line 135
    :goto_0
    const-string v0, "05"

    const-string v1, "Fitness_MgrStorage"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "unknown msg type"

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 138
    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
