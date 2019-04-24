.class Lo/cbu$d;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cbu;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<Lo/cbu;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lo/cbu;)V
    .locals 1

    .line 3919
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 3920
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lo/cbu$d;->d:Ljava/lang/ref/WeakReference;

    .line 3921
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 15

    .line 3925
    const-string v0, "Track_SportManager"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FileHandler()  handleMessage "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    move-object/from16 v2, p1

    iget v2, v2, Landroid/os/Message;->what:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3926
    iget-object v0, p0, Lo/cbu$d;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lo/cbu;

    .line 3927
    const/4 v0, 0x0

    if-ne v0, v4, :cond_0

    .line 3928
    const-string v0, "Track_SportManager"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "FileHandler()  manager is null"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 3929
    return-void

    .line 3931
    :cond_0
    move-object/from16 v0, p1

    iget v0, v0, Landroid/os/Message;->what:I

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    .line 3933
    :sswitch_0
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroid/content/ContentValues;

    .line 3934
    const-string v0, "time"

    invoke-virtual {v5, v0}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    .line 3935
    const-string v0, "heartrate"

    invoke-virtual {v5, v0}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 3936
    const-string v0, "isinvalidheartrate"

    invoke-virtual {v5, v0}, Landroid/content/ContentValues;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    .line 3937
    new-instance v10, Lo/cev;

    invoke-direct {v10}, Lo/cev;-><init>()V

    .line 3938
    invoke-virtual {v10, v6, v7}, Lo/cev;->b(J)V

    .line 3939
    invoke-virtual {v10, v8}, Lo/cev;->e(I)V

    .line 3940
    if-eqz v9, :cond_1

    .line 3941
    invoke-static {v4, v10}, Lo/cbu;->d(Lo/cbu;Lo/cev;)V

    goto/16 :goto_0

    .line 3943
    :cond_1
    invoke-static {v4, v10}, Lo/cbu;->c(Lo/cbu;Lo/cev;)Lo/cev;

    .line 3944
    invoke-static {v4, v10}, Lo/cbu;->e(Lo/cbu;Lo/cev;)V

    .line 3946
    goto/16 :goto_0

    .line 3949
    :sswitch_1
    move-object/from16 v0, p1

    iget v11, v0, Landroid/os/Message;->arg1:I

    .line 3950
    const-wide/16 v0, 0x1

    invoke-static {v4, v0, v1}, Lo/cbu;->d(Lo/cbu;J)J

    .line 3951
    const/4 v0, 0x1

    if-ne v0, v11, :cond_2

    .line 3952
    const/4 v0, 0x6

    invoke-virtual {v4, v0}, Lo/cbu;->a(I)V

    goto/16 :goto_0

    .line 3954
    :cond_2
    const/4 v0, 0x2

    invoke-virtual {v4, v0}, Lo/cbu;->a(I)V

    .line 3956
    goto/16 :goto_0

    .line 3959
    :sswitch_2
    invoke-virtual/range {p1 .. p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "Location"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/location/Location;

    .line 3961
    invoke-static {v4, v12}, Lo/cbu;->d(Lo/cbu;Landroid/location/Location;)V

    .line 3962
    goto :goto_0

    .line 3964
    :sswitch_3
    invoke-static {v4}, Lo/cbu;->B(Lo/cbu;)Lo/cdt;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 3965
    invoke-virtual/range {p1 .. p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "Location"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/location/Location;

    .line 3966
    invoke-static {v4}, Lo/cbu;->B(Lo/cbu;)Lo/cdt;

    move-result-object v0

    invoke-virtual {v0, v13}, Lo/cdt;->e(Landroid/location/Location;)V

    .line 3967
    goto :goto_0

    .line 3970
    :sswitch_4
    invoke-virtual {v4}, Lo/cbu;->ai()Z

    move-result v13

    .line 3971
    invoke-static {v4, v13}, Lo/cbu;->e(Lo/cbu;Z)V

    .line 3972
    goto :goto_0

    .line 3979
    :sswitch_5
    invoke-static {v4}, Lo/cbu;->p(Lo/cbu;)Landroid/os/Handler;

    move-result-object v0

    move-object/from16 v1, p1

    iget v1, v1, Landroid/os/Message;->what:I

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 3980
    goto :goto_0

    .line 3982
    :sswitch_6
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Lo/cvv;

    .line 3983
    invoke-static {v4}, Lo/cbu;->j(Lo/cbu;)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    invoke-virtual {v14, v0, v1}, Lo/cvv;->c(J)V

    .line 3984
    invoke-static {v4, v14}, Lo/cbu;->b(Lo/cbu;Lo/cvv;)Lo/cvv;

    .line 3985
    invoke-static {v4}, Lo/cbu;->G(Lo/cbu;)Lo/cvv;

    move-result-object v0

    invoke-static {v4, v0}, Lo/cbu;->e(Lo/cbu;Lo/cvv;)V

    .line 3986
    .line 3990
    :cond_3
    :goto_0
    move-object/from16 v0, p1

    invoke-super {p0, v0}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 3991
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x4 -> :sswitch_5
        0x5 -> :sswitch_5
        0x6 -> :sswitch_5
        0x7 -> :sswitch_6
        0x66 -> :sswitch_2
        0x67 -> :sswitch_3
        0x3e9 -> :sswitch_4
    .end sparse-switch
.end method
