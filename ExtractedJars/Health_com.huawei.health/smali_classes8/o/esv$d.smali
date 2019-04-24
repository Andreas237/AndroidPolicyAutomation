.class Lo/esv$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/cmd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/esv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/esv;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo/esv;)V
    .locals 1

    .line 926
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 927
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/esv$d;->c:Ljava/lang/ref/WeakReference;

    .line 928
    return-void
.end method


# virtual methods
.method public d(Ljava/lang/Object;II)V
    .locals 10

    .line 932
    iget-object v0, p0, Lo/esv$d;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/esv;

    .line 933
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 934
    return-void

    .line 937
    :cond_0
    invoke-static {v4}, Lo/esv;->k(Lo/esv;)Landroid/os/Handler;

    move-result-object v5

    .line 938
    const/4 v0, 0x0

    if-ne v0, v5, :cond_1

    .line 939
    return-void

    .line 942
    :cond_1
    const/4 v0, 0x0

    if-ne v0, p1, :cond_2

    .line 943
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireIfHasHalfYearHeightData onResult null == data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 944
    const/16 v0, 0x11

    invoke-virtual {v5, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v6

    .line 945
    invoke-virtual {v5, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 946
    return-void

    .line 948
    :cond_2
    move-object v6, p1

    check-cast v6, Landroid/util/SparseArray;

    .line 949
    const v0, 0x9c45

    invoke-virtual {v6, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    .line 950
    move-object v8, v7

    check-cast v8, Ljava/util/List;

    .line 951
    if-nez v8, :cond_3

    .line 952
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireIfHasHalfYearHeightData onResult altitudelist == null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 953
    const/16 v0, 0x11

    invoke-virtual {v5, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v9

    .line 954
    invoke-virtual {v5, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 955
    return-void

    .line 957
    :cond_3
    const-string v0, "SCUI_StepsCardData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "acquireIfHasHalfYearHeightData onResult altitudelist has data"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 958
    const/16 v0, 0x12

    invoke-virtual {v5, v0}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v9

    .line 959
    invoke-virtual {v5, v9}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 961
    return-void
.end method
