.class Lo/chb$1;
.super Landroid/os/Handler;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/chb;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/chb;


# direct methods
.method constructor <init>(Lo/chb;)V
    .locals 0

    .line 300
    iput-object p1, p0, Lo/chb$1;->b:Lo/chb;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 5

    .line 303
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 304
    iget-object v0, p0, Lo/chb$1;->b:Lo/chb;

    invoke-static {v0}, Lo/chb;->b(Lo/chb;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 305
    iget v0, p1, Landroid/os/Message;->what:I

    if-nez v0, :cond_0

    .line 306
    iget-object v0, p0, Lo/chb$1;->b:Lo/chb;

    invoke-static {v0}, Lo/chb;->b(Lo/chb;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/Marker;->setVisible(Z)V

    .line 307
    iget-object v0, p0, Lo/chb$1;->b:Lo/chb;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/chb;->e(Lo/chb;I)V

    goto/16 :goto_0

    .line 308
    :cond_0
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 309
    iget-object v0, p0, Lo/chb$1;->b:Lo/chb;

    invoke-static {v0}, Lo/chb;->b(Lo/chb;)Lcom/google/android/gms/maps/model/Marker;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/Marker;->setVisible(Z)V

    .line 310
    iget-object v0, p0, Lo/chb$1;->b:Lo/chb;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/chb;->e(Lo/chb;I)V

    goto :goto_0

    .line 311
    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 312
    iget-object v0, p0, Lo/chb$1;->b:Lo/chb;

    invoke-static {v0}, Lo/chb;->a(Lo/chb;)V

    goto :goto_0

    .line 313
    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    .line 314
    iget-object v0, p0, Lo/chb$1;->b:Lo/chb;

    invoke-static {v0}, Lo/chb;->c(Lo/chb;)Lcom/google/android/gms/maps/model/Polyline;

    move-result-object v0

    iget-object v1, p0, Lo/chb$1;->b:Lo/chb;

    invoke-static {v1}, Lo/chb;->e(Lo/chb;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/Polyline;->setPoints(Ljava/util/List;)V

    .line 315
    iget-object v0, p0, Lo/chb$1;->b:Lo/chb;

    iget-object v1, p0, Lo/chb$1;->b:Lo/chb;

    invoke-static {v1}, Lo/chb;->e(Lo/chb;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lo/chb$1;->b:Lo/chb;

    invoke-static {v2}, Lo/chb;->e(Lo/chb;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1}, Lo/chb;->e(Lcom/google/android/gms/maps/model/LatLng;)V

    .line 316
    iget-object v0, p0, Lo/chb$1;->b:Lo/chb;

    iget-object v1, p0, Lo/chb$1;->b:Lo/chb;

    invoke-static {v1}, Lo/chb;->e(Lo/chb;)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lo/chb$1;->b:Lo/chb;

    invoke-static {v2}, Lo/chb;->e(Lo/chb;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/maps/model/LatLng;

    const-wide/16 v2, 0x3e8

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lo/chb;->b(Lcom/google/android/gms/maps/model/LatLng;JLcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V

    .line 321
    :cond_3
    :goto_0
    return-void
.end method
