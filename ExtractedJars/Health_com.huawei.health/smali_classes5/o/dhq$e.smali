.class Lo/dhq$e;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dhq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field final synthetic b:Lo/dhq;


# direct methods
.method public constructor <init>(Lo/dhq;Landroid/os/Looper;)V
    .locals 0

    .line 131
    iput-object p1, p0, Lo/dhq$e;->b:Lo/dhq;

    .line 132
    invoke-direct {p0, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 133
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4

    .line 139
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 140
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    goto/16 :goto_2

    .line 142
    :pswitch_0
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "REQUEST_LOCATION"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 143
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->d(Lo/dhq;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->c(Lo/dhq;)V

    goto :goto_0

    .line 146
    :cond_0
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->b(Lo/dhq;)V

    .line 148
    :goto_0
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->e(Lo/dhq;)V

    .line 149
    goto/16 :goto_2

    .line 151
    :pswitch_1
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CANCELREQUEST_LOCATION"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 152
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->d(Lo/dhq;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 153
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->a(Lo/dhq;)V

    goto :goto_1

    .line 155
    :cond_1
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->h(Lo/dhq;)V

    .line 158
    :goto_1
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/dhq;->c(Lo/dhq;Z)Z

    .line 159
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dhq;->e(Lo/dhq;Z)Z

    .line 160
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    const-wide/16 v1, 0x7d0

    invoke-static {v0, v1, v2}, Lo/dhq;->c(Lo/dhq;J)J

    .line 161
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dhq;->a(Lo/dhq;Z)Z

    .line 162
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/dhq;->c(Lo/dhq;Landroid/location/Location;)Landroid/location/Location;

    .line 163
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    const-wide/16 v1, 0x0

    invoke-static {v0, v1, v2}, Lo/dhq;->b(Lo/dhq;J)J

    .line 164
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    invoke-static {v0}, Lo/dhq;->f(Lo/dhq;)V

    .line 165
    goto :goto_2

    .line 167
    :pswitch_2
    const-string v0, "Track_LocationManagerUtils"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "CHANGE_LOCATION_REQUEST_TIME"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 168
    iget-object v0, p0, Lo/dhq$e;->b:Lo/dhq;

    iget-object v1, p0, Lo/dhq$e;->b:Lo/dhq;

    invoke-static {v1}, Lo/dhq;->k(Lo/dhq;)J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Lo/dhq;->e(Lo/dhq;J)V

    .line 169
    .line 173
    :goto_2
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method
