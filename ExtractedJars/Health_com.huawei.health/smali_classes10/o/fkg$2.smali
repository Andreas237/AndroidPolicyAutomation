.class Lo/fkg$2;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/fkg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fkg;


# direct methods
.method constructor <init>(Lo/fkg;)V
    .locals 0

    .line 202
    iput-object p1, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 6

    .line 205
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_0

    .line 208
    :pswitch_0
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v0, p1}, Lo/fkg;->d(Lo/fkg;Landroid/os/Message;)V

    .line 209
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_START step is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v2}, Lo/fkg;->b(Lo/fkg;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,calories is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v2}, Lo/fkg;->d(Lo/fkg;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " , distance is"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v2}, Lo/fkg;->a(Lo/fkg;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 210
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    iget-object v1, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v1}, Lo/fkg;->b(Lo/fkg;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fkg;->a(Lo/fkg;I)I

    .line 211
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    iget-object v1, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v1}, Lo/fkg;->d(Lo/fkg;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fkg;->c(Lo/fkg;I)I

    .line 212
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    iget-object v1, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v1}, Lo/fkg;->a(Lo/fkg;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fkg;->b(Lo/fkg;I)I

    .line 213
    goto/16 :goto_0

    .line 215
    :pswitch_1
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_STOP "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 216
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v0, p1}, Lo/fkg;->d(Lo/fkg;Landroid/os/Message;)V

    .line 217
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->c(Lo/fkg;)V

    .line 218
    goto/16 :goto_0

    .line 220
    :pswitch_2
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_CROSS_DAY "

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 221
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v0, p1}, Lo/fkg;->d(Lo/fkg;Landroid/os/Message;)V

    .line 222
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v0}, Lo/fkg;->c(Lo/fkg;)V

    .line 223
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    iget-object v1, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v1}, Lo/fkg;->e(Lo/fkg;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fkg;->d(Lo/fkg;I)I

    .line 224
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    const-wide/32 v3, 0xea60

    add-long/2addr v1, v3

    invoke-static {v0, v1, v2}, Lo/fkg;->d(Lo/fkg;J)J

    .line 226
    :try_start_0
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "d"

    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v2}, Lo/fkg;->k(Lo/fkg;)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fkg;->e(Lo/fkg;I)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 230
    goto/16 :goto_0

    .line 227
    :catch_0
    move-exception v5

    .line 228
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lo/fkg;->e(Lo/fkg;I)I

    .line 229
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "isNewDay exception"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->e(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 232
    goto/16 :goto_0

    .line 234
    :pswitch_3
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v0, p1}, Lo/fkg;->d(Lo/fkg;Landroid/os/Message;)V

    .line 235
    const-string v0, "Track_TreadmillStepPointData"

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "MSG_REFRESH_DATA step is"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v2}, Lo/fkg;->b(Lo/fkg;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    const-string v2, " ,calories is "

    const/4 v3, 0x2

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v2}, Lo/fkg;->d(Lo/fkg;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x3

    aput-object v2, v1, v3

    const-string v2, " , distance is"

    const/4 v3, 0x4

    aput-object v2, v1, v3

    iget-object v2, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v2}, Lo/fkg;->a(Lo/fkg;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x5

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 236
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    iget-object v1, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v1}, Lo/fkg;->b(Lo/fkg;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fkg;->a(Lo/fkg;I)I

    .line 237
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    iget-object v1, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v1}, Lo/fkg;->d(Lo/fkg;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fkg;->c(Lo/fkg;I)I

    .line 238
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    iget-object v1, p0, Lo/fkg$2;->e:Lo/fkg;

    invoke-static {v1}, Lo/fkg;->a(Lo/fkg;)I

    move-result v1

    invoke-static {v0, v1}, Lo/fkg;->b(Lo/fkg;I)I

    .line 239
    iget-object v0, p0, Lo/fkg$2;->e:Lo/fkg;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/fkg;->d(Lo/fkg;Z)Z

    .line 240
    .line 244
    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x3e9
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
