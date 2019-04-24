.class Lo/dez$b;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dez;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/dez;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lo/dez;Landroid/os/Looper;)V
    .locals 1

    .line 1238
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1239
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/dez$b;->c:Ljava/lang/ref/WeakReference;

    .line 1240
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 1244
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 1245
    iget-object v0, p0, Lo/dez$b;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lo/dez;

    .line 1246
    const/4 v0, 0x0

    if-ne v0, v5, :cond_0

    .line 1247
    return-void

    .line 1249
    :cond_0
    const-string v0, "05"

    const-string v1, "HWFitnessMgr"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "handleMessage msg="

    const/4 v4, 0x0

    aput-object v3, v2, v4

    iget v3, p1, Landroid/os/Message;->what:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v4, 0x1

    aput-object v3, v2, v4

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2}, Lo/dho;->c(Ljava/lang/String;ILjava/lang/String;[Ljava/lang/Object;)V

    .line 1250
    iget v0, p1, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 1252
    :sswitch_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "sync detail time out"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1253
    const v0, 0x493e1

    invoke-static {v5, v0}, Lo/dez;->d(Lo/dez;I)V

    .line 1254
    goto :goto_1

    .line 1256
    :sswitch_1
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get frame count time out"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1257
    goto :goto_1

    .line 1259
    :sswitch_2
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "get frame time out"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1260
    goto :goto_1

    .line 1262
    :sswitch_3
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Sync Complete msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1263
    const/4 v0, 0x0

    invoke-virtual {v5, v0}, Lo/dez;->a(I)V

    .line 1264
    goto :goto_1

    .line 1266
    :sswitch_4
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Sync today timeout msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1267
    const v0, 0x493e1

    invoke-static {v5, v0}, Lo/dez;->c(Lo/dez;I)V

    .line 1268
    goto :goto_1

    .line 1270
    :sswitch_5
    const/4 v0, 0x0

    iput v0, v5, Lo/dez;->b:I

    .line 1271
    goto :goto_1

    .line 1273
    :sswitch_6
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Save fitness data timeout msg"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1274
    const v0, 0x493e1

    invoke-virtual {v5, v0}, Lo/dez;->a(I)V

    .line 1275
    goto :goto_1

    .line 1277
    :goto_0
    const-string v0, "HWFitnessMgr"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "unknown msg type"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->f(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1280
    :goto_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_0
        0x1 -> :sswitch_1
        0x2 -> :sswitch_2
        0x3 -> :sswitch_3
        0x4 -> :sswitch_4
        0x5 -> :sswitch_6
        0x64 -> :sswitch_5
    .end sparse-switch
.end method
